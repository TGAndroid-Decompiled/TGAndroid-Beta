package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class CreateRtmpStreamBottomSheet extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private boolean hasButton;
    private final boolean hasFewPeers;
    private boolean hasRevokeButton;
    private final JoinCallAlert.JoinCallAlertDelegate joinCallDelegate;
    private String rtmpKey;
    private SpannableStringBuilder rtmpKeySpoiled;
    private String rtmpUrl;
    private TLRPC.InputPeer selectAfterDismiss;
    private final boolean story;
    private TopCell topCell;

    public static void show(TLRPC.Peer peer, BaseFragment baseFragment, long j, boolean z, JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate) {
        CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet = new CreateRtmpStreamBottomSheet(baseFragment, peer, j, z, joinCallAlertDelegate);
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            baseFragment.showDialog(createRtmpStreamBottomSheet);
        } else {
            createRtmpStreamBottomSheet.show();
        }
    }

    public CreateRtmpStreamBottomSheet(final Context context, final int i, final TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, final Utilities.Callback callback, final Theme.ResourcesProvider resourcesProvider) {
        super(context, null, false, false, false, resourcesProvider);
        int i2;
        this.story = true;
        this.topPadding = 0.126f;
        this.joinCallDelegate = null;
        this.hasFewPeers = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        this.hasRevokeButton = callback != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId))));
        if (callback != null) {
            this.hasButton = true;
            final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
            buttonWithCounterView.setText(LocaleController.getString(R.string.LiveStoryRTMPEnable), false);
            this.containerView.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (this.hasRevokeButton ? 52 : 0) + 12));
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    CreateRtmpStreamBottomSheet.this.lambda$new$2(callback, buttonWithCounterView, view);
                }
            });
            if (this.hasRevokeButton) {
                final ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, false, resourcesProvider);
                buttonWithCounterView2.setColor(Theme.getColor(Theme.key_fill_RedNormal));
                buttonWithCounterView2.text.setTypeface(AndroidUtilities.bold());
                buttonWithCounterView2.setText(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false);
                buttonWithCounterView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        CreateRtmpStreamBottomSheet.this.lambda$new$6(context, resourcesProvider, buttonWithCounterView2, getgroupcallstreamrtmpurl, i, view);
                    }
                });
                this.containerView.addView(buttonWithCounterView2, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i3 = this.backgroundPaddingLeft;
        if (this.hasButton) {
            i2 = AndroidUtilities.dp(this.hasRevokeButton ? 124.0f : 72.0f);
        } else {
            i2 = 0;
        }
        recyclerListView.setPadding(i3, 0, i3, i2);
        fixNavigationBar();
        updateTitle();
        this.rtmpUrl = groupcallstreamrtmpurl.url;
        this.rtmpKey = groupcallstreamrtmpurl.key;
        this.rtmpKeySpoiled = new SpannableStringBuilder(this.rtmpKey);
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 256;
        textStyleRun.start = 0;
        textStyleRun.end = this.rtmpKeySpoiled.length();
        this.rtmpKeySpoiled.setSpan(new TextStyleSpan(textStyleRun), 0, this.rtmpKeySpoiled.length(), 0);
        this.adapter.update(false);
    }

    public void lambda$new$2(Utilities.Callback callback, final ButtonWithCounterView buttonWithCounterView, View view) {
        callback.run(new Browser.Progress(new Runnable() {
            @Override
            public final void run() {
                ButtonWithCounterView.this.setLoading(true);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                CreateRtmpStreamBottomSheet.this.lambda$new$1(buttonWithCounterView);
            }
        }));
    }

    public void lambda$new$1(ButtonWithCounterView buttonWithCounterView) {
        buttonWithCounterView.setLoading(false);
        lambda$new$0();
    }

    public void lambda$new$6(Context context, Theme.ResourcesProvider resourcesProvider, final ButtonWithCounterView buttonWithCounterView, final TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, final int i, View view) {
        new AlertDialog.Builder(context, resourcesProvider).setTitle(LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle)).setMessage(LocaleController.getString(R.string.LiveStoryRTMPRevokeText)).setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                CreateRtmpStreamBottomSheet.this.lambda$new$5(buttonWithCounterView, getgroupcallstreamrtmpurl, i, alertDialog, i2);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
    }

    public void lambda$new$5(final ButtonWithCounterView buttonWithCounterView, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i, AlertDialog alertDialog, int i2) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(i).sendRequest(getgroupcallstreamrtmpurl, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                CreateRtmpStreamBottomSheet.this.lambda$new$4(buttonWithCounterView, tLObject, tL_error);
            }
        });
    }

    public void lambda$new$4(final ButtonWithCounterView buttonWithCounterView, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CreateRtmpStreamBottomSheet.this.lambda$new$3(buttonWithCounterView, tLObject);
            }
        });
    }

    public void lambda$new$3(ButtonWithCounterView buttonWithCounterView, TLObject tLObject) {
        buttonWithCounterView.setLoading(false);
        if (tLObject instanceof TL_phone.groupCallStreamRtmpUrl) {
            TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
            this.rtmpUrl = groupcallstreamrtmpurl.url;
            this.rtmpKey = groupcallstreamrtmpurl.key;
            this.rtmpKeySpoiled = new SpannableStringBuilder(this.rtmpKey);
            this.adapter.update(true);
        }
    }

    public CreateRtmpStreamBottomSheet(BaseFragment baseFragment, final TLRPC.Peer peer, final long j, boolean z, JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate) {
        super(baseFragment, false, false);
        this.story = false;
        this.topPadding = 0.26f;
        this.joinCallDelegate = joinCallAlertDelegate;
        this.hasFewPeers = z;
        final Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j)));
        this.hasButton = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        textView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider));
        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhite), 120)));
        this.containerView.addView(textView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CreateRtmpStreamBottomSheet.this.lambda$new$7(peer, view);
            }
        });
        if (isCreator) {
            final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, false, this.resourcesProvider);
            buttonWithCounterView.setColor(Theme.getColor(Theme.key_fill_RedNormal));
            buttonWithCounterView.text.setTypeface(AndroidUtilities.bold());
            buttonWithCounterView.setText(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    CreateRtmpStreamBottomSheet.this.lambda$new$11(context, buttonWithCounterView, j, view);
                }
            });
            this.containerView.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        fixNavigationBar();
        updateTitle();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                CreateRtmpStreamBottomSheet.this.lambda$new$13(tLObject, tL_error);
            }
        });
    }

    public void lambda$new$7(TLRPC.Peer peer, View view) {
        this.selectAfterDismiss = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        lambda$new$0();
    }

    public void lambda$new$11(Context context, final ButtonWithCounterView buttonWithCounterView, final long j, View view) {
        new AlertDialog.Builder(context, this.resourcesProvider).setTitle(LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle)).setMessage(LocaleController.getString(R.string.LiveStoryRTMPRevokeText)).setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                CreateRtmpStreamBottomSheet.this.lambda$new$10(buttonWithCounterView, j, alertDialog, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
    }

    public void lambda$new$10(final ButtonWithCounterView buttonWithCounterView, long j, AlertDialog alertDialog, int i) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                CreateRtmpStreamBottomSheet.this.lambda$new$9(buttonWithCounterView, tLObject, tL_error);
            }
        });
    }

    public void lambda$new$9(final ButtonWithCounterView buttonWithCounterView, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CreateRtmpStreamBottomSheet.this.lambda$new$8(buttonWithCounterView, tLObject);
            }
        });
    }

    public void lambda$new$8(ButtonWithCounterView buttonWithCounterView, TLObject tLObject) {
        buttonWithCounterView.setLoading(false);
        if (tLObject == null || !(tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
            return;
        }
        TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
        this.rtmpUrl = groupcallstreamrtmpurl.url;
        this.rtmpKey = groupcallstreamrtmpurl.key;
        this.rtmpKeySpoiled = new SpannableStringBuilder(this.rtmpKey);
        this.adapter.update(true);
    }

    public void lambda$new$13(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CreateRtmpStreamBottomSheet.this.lambda$new$12(tLObject);
            }
        });
    }

    public void lambda$new$12(TLObject tLObject) {
        if (tLObject == null || !(tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
            return;
        }
        TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
        this.rtmpUrl = groupcallstreamrtmpurl.url;
        this.rtmpKey = groupcallstreamrtmpurl.key;
        this.rtmpKeySpoiled = new SpannableStringBuilder(this.rtmpKey);
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 256;
        textStyleRun.start = 0;
        textStyleRun.end = this.rtmpKeySpoiled.length();
        this.rtmpKeySpoiled.setSpan(new TextStyleSpan(textStyleRun), 0, this.rtmpKeySpoiled.length(), 0);
        this.adapter.update(false);
    }

    @Override
    public void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate = this.joinCallDelegate;
        if (joinCallAlertDelegate == null || (inputPeer = this.selectAfterDismiss) == null) {
            return;
        }
        joinCallAlertDelegate.didSelectChat(inputPeer, this.hasFewPeers, false, true);
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.Streaming);
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                CreateRtmpStreamBottomSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        if (this.topCell == null) {
            this.topCell = new TopCell(getContext(), this.resourcesProvider);
        }
        arrayList.add(UItem.asCustom(this.topCell));
        String str = null;
        arrayList.add(UItem.asShadow(null));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.VoipChatStreamSettings)));
        arrayList.add(TextDetailCellFactory.of(this.rtmpUrl, LocaleController.getString(R.string.VoipChatStreamServerUrl), true));
        arrayList.add(TextDetailCellFactory.of(this.rtmpKeySpoiled, LocaleController.getString(R.string.VoipChatStreamKey), false));
        if (this.hasButton) {
            str = LocaleController.getString(this.story ? R.string.VoipChatStreamWithAnotherAppDescriptionStory : R.string.VoipChatStreamWithAnotherAppDescription);
        }
        arrayList.add(UItem.asShadow(str));
    }

    public static class TopCell extends LinearLayout {
        public TopCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            setOrientation(1);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            rLottieImageView.setAutoRepeat(true);
            rLottieImageView.setAnimation(R.raw.utyan_streaming, 112, 112);
            rLottieImageView.playAnimation();
            addView(rLottieImageView, LayoutHelper.createLinear(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 28, 0, 28, 17));
        }
    }

    public static class TextDetailCellFactory extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new TextDetailCellFactory());
        }

        @Override
        public TextDetailCell createView(final Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            final TextDetailCell textDetailCell = new TextDetailCell(context, resourcesProvider, true, false);
            textDetailCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            Drawable mutate = ContextCompat.getDrawable(context, R.drawable.msg_copy).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            textDetailCell.setImage(mutate);
            textDetailCell.setImageClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    CreateRtmpStreamBottomSheet.TextDetailCellFactory.this.lambda$createView$0(context, textDetailCell, view);
                }
            });
            return textDetailCell;
        }

        public void lambda$createView$0(Context context, TextDetailCell textDetailCell, View view) {
            copyRtmpValue(context, textDetailCell.textView.getText().toString());
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            TextDetailCell textDetailCell = (TextDetailCell) view;
            textDetailCell.setTextAndValue(uItem.text, uItem.textValue, !uItem.hideDivider);
            if (uItem.text instanceof SpannableStringBuilder) {
                textDetailCell.textView.setTextSize(1, 13.0f);
                textDetailCell.textView.setTranslationY(AndroidUtilities.dp(2.0f));
                textDetailCell.textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
            }
        }

        public static UItem of(CharSequence charSequence, CharSequence charSequence2, boolean z) {
            UItem ofFactory = UItem.ofFactory(TextDetailCellFactory.class);
            ofFactory.text = charSequence;
            ofFactory.textValue = charSequence2;
            ofFactory.hideDivider = !z;
            ofFactory.enabled = false;
            return ofFactory;
        }

        private void copyRtmpValue(Context context, String str) {
            AndroidUtilities.addToClipboard(str);
            if (AndroidUtilities.shouldShowClipboardToast()) {
                Toast.makeText(context, LocaleController.getString(R.string.TextCopied), 0).show();
            }
        }
    }
}
