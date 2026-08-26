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
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda14;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class CreateRtmpStreamBottomSheet extends BottomSheetWithRecyclerListView {
    private static final int CONTAINER_HEIGHT_DP = 72;
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

    public static class TextDetailCellFactory extends UItem.UItemFactory<TextDetailCell> {
        static {
            UItem.UItemFactory.setup(new TextDetailCellFactory());
        }

        private void copyRtmpValue(Context context, String str) {
            AndroidUtilities.addToClipboard(str);
            if (AndroidUtilities.shouldShowClipboardToast()) {
                Toast.makeText(context, LocaleController.getString(R.string.TextCopied), 0).show();
            }
        }

        public void lambda$createView$0(Context context, TextDetailCell textDetailCell, View view) {
            copyRtmpValue(context, textDetailCell.textView.getText().toString());
        }

        public static UItem of(CharSequence charSequence, CharSequence charSequence2, boolean z) {
            UItem uItemOfFactory = UItem.ofFactory(TextDetailCellFactory.class);
            uItemOfFactory.text = charSequence;
            uItemOfFactory.textValue = charSequence2;
            uItemOfFactory.hideDivider = !z;
            uItemOfFactory.enabled = false;
            return uItemOfFactory;
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

        @Override
        public TextDetailCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            TextDetailCell textDetailCell = new TextDetailCell(23, context, resourcesProvider, true, false);
            textDetailCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            Drawable drawableMutate = context.getDrawable(R.drawable.msg_copy).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            textDetailCell.setImage(drawableMutate);
            textDetailCell.setImageClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(this, context, textDetailCell, 11));
            return textDetailCell;
        }
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

    public CreateRtmpStreamBottomSheet(Context context, int i, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, Utilities.Callback<Browser.Progress> callback, Theme.ResourcesProvider resourcesProvider) {
        int iDp;
        ?? bottomSheetWithRecyclerListView = new BottomSheetWithRecyclerListView(context, null, false, false, false, resourcesProvider);
        bottomSheetWithRecyclerListView.story = true;
        bottomSheetWithRecyclerListView.topPadding = 0.126f;
        bottomSheetWithRecyclerListView.joinCallDelegate = null;
        bottomSheetWithRecyclerListView.hasFewPeers = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        bottomSheetWithRecyclerListView.hasRevokeButton = callback != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId))));
        CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet = bottomSheetWithRecyclerListView;
        if (callback != null) {
            bottomSheetWithRecyclerListView.hasButton = true;
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
            buttonWithCounterView.setText(LocaleController.getString(R.string.LiveStoryRTMPEnable), false);
            bottomSheetWithRecyclerListView.containerView.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (bottomSheetWithRecyclerListView.hasRevokeButton ? 52 : 0) + 12));
            buttonWithCounterView.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(bottomSheetWithRecyclerListView, callback, buttonWithCounterView, 10));
            boolean z = bottomSheetWithRecyclerListView.hasRevokeButton;
            createRtmpStreamBottomSheet = bottomSheetWithRecyclerListView;
            if (z) {
                ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, false, resourcesProvider);
                buttonWithCounterView2.setColor(Theme.getColor(null, Theme.key_fill_RedNormal, false));
                buttonWithCounterView2.text.setTypeface(AndroidUtilities.bold());
                buttonWithCounterView2.setText(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false);
                CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet2 = this;
                buttonWithCounterView2.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda14(this, context, resourcesProvider, buttonWithCounterView2, getgroupcallstreamrtmpurl, i, 3));
                createRtmpStreamBottomSheet2.containerView.addView(buttonWithCounterView2, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
                createRtmpStreamBottomSheet = createRtmpStreamBottomSheet2;
            }
        }
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        createRtmpStreamBottomSheet.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        RecyclerListView recyclerListView = createRtmpStreamBottomSheet.recyclerListView;
        int i2 = createRtmpStreamBottomSheet.backgroundPaddingLeft;
        if (createRtmpStreamBottomSheet.hasButton) {
            iDp = AndroidUtilities.dp(createRtmpStreamBottomSheet.hasRevokeButton ? 124.0f : 72.0f);
        } else {
            iDp = 0;
        }
        recyclerListView.setPadding(i2, 0, i2, iDp);
        createRtmpStreamBottomSheet.fixNavigationBar();
        createRtmpStreamBottomSheet.updateTitle();
        createRtmpStreamBottomSheet.rtmpUrl = groupcallstreamrtmpurl.url;
        createRtmpStreamBottomSheet.rtmpKey = groupcallstreamrtmpurl.key;
        createRtmpStreamBottomSheet.rtmpKeySpoiled = new SpannableStringBuilder(createRtmpStreamBottomSheet.rtmpKey);
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 256;
        textStyleRun.start = 0;
        textStyleRun.end = createRtmpStreamBottomSheet.rtmpKeySpoiled.length();
        createRtmpStreamBottomSheet.rtmpKeySpoiled.setSpan(new TextStyleSpan(textStyleRun), 0, createRtmpStreamBottomSheet.rtmpKeySpoiled.length(), 0);
        createRtmpStreamBottomSheet.adapter.update(false);
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        if (this.topCell == null) {
            this.topCell = new TopCell(getContext(), this.resourcesProvider);
        }
        arrayList.add(UItem.asCustom(this.topCell));
        String string = null;
        arrayList.add(UItem.asShadow(null));
        zzke.m(R.string.VoipChatStreamSettings, arrayList);
        arrayList.add(TextDetailCellFactory.of(this.rtmpUrl, LocaleController.getString(R.string.VoipChatStreamServerUrl), true));
        arrayList.add(TextDetailCellFactory.of(this.rtmpKeySpoiled, LocaleController.getString(R.string.VoipChatStreamKey), false));
        if (this.hasButton) {
            string = LocaleController.getString(this.story ? R.string.VoipChatStreamWithAnotherAppDescriptionStory : R.string.VoipChatStreamWithAnotherAppDescription);
        }
        arrayList.add(UItem.asShadow(string));
    }

    public void lambda$new$1(ButtonWithCounterView buttonWithCounterView) {
        buttonWithCounterView.setLoading(false);
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$10(ButtonWithCounterView buttonWithCounterView, long j, AlertDialog alertDialog, int i) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda1(this, buttonWithCounterView, 1));
    }

    public void lambda$new$11(Context context, final ButtonWithCounterView buttonWithCounterView, final long j, View view) {
        new AlertDialog.Builder(context, 0, this.resourcesProvider).setTitle(LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle)).setMessage(LocaleController.getString(R.string.LiveStoryRTMPRevokeText)).setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$new$10(buttonWithCounterView, j, alertDialog, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
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

    public void lambda$new$13(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda7(18, this, tLObject));
    }

    public void lambda$new$2(Utilities.Callback callback, ButtonWithCounterView buttonWithCounterView, View view) {
        callback.run(new Browser.Progress(new GroupCallPip$$ExternalSyntheticLambda2(buttonWithCounterView, 9), new FilterGLThread$$ExternalSyntheticLambda7(19, this, buttonWithCounterView)));
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

    public void lambda$new$4(ButtonWithCounterView buttonWithCounterView, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda0(this, buttonWithCounterView, tLObject, 1));
    }

    public void lambda$new$5(ButtonWithCounterView buttonWithCounterView, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i, AlertDialog alertDialog, int i2) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(i).sendRequest(getgroupcallstreamrtmpurl, new CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda1(this, buttonWithCounterView, 0));
    }

    public void lambda$new$6(Context context, Theme.ResourcesProvider resourcesProvider, ButtonWithCounterView buttonWithCounterView, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i, View view) {
        new AlertDialog.Builder(context, 0, resourcesProvider).setTitle(LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle)).setMessage(LocaleController.getString(R.string.LiveStoryRTMPRevokeText)).setPositiveButton(LocaleController.getString(R.string.RevokeButton), new SearchTagsList$$ExternalSyntheticLambda12(this, buttonWithCounterView, getgroupcallstreamrtmpurl, i)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
    }

    public void lambda$new$7(TLRPC.Peer peer, View view) {
        this.selectAfterDismiss = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        lambda$showGiftOfferSheet$15();
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

    public void lambda$new$9(ButtonWithCounterView buttonWithCounterView, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda0(this, buttonWithCounterView, tLObject, 0));
    }

    public static void show(TLRPC.Peer peer, BaseFragment baseFragment, long j, boolean z, JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate) {
        CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet = new CreateRtmpStreamBottomSheet(baseFragment, peer, j, z, joinCallAlertDelegate);
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            createRtmpStreamBottomSheet.show();
        } else {
            baseFragment.showDialog(createRtmpStreamBottomSheet);
        }
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new EmojiView$$ExternalSyntheticLambda18(this, 10), this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
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
    public CharSequence getTitle() {
        return LocaleController.getString(R.string.Streaming);
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    public CreateRtmpStreamBottomSheet(BaseFragment baseFragment, TLRPC.Peer peer, final long j, boolean z, JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate) {
        super(baseFragment, false, false);
        this.story = false;
        this.topPadding = 0.26f;
        this.joinCallDelegate = joinCallAlertDelegate;
        this.hasFewPeers = z;
        final Context context = this.containerView.getContext();
        boolean zIsCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j)));
        this.hasButton = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        textView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider));
        int iDp = AndroidUtilities.dp(8.0f);
        int color = Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider);
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), 120);
        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, alphaComponent, alphaComponent));
        this.containerView.addView(textView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (zIsCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(22, this, peer));
        if (zIsCreator) {
            final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, false, this.resourcesProvider);
            buttonWithCounterView.setColor(Theme.getColor(null, Theme.key_fill_RedNormal, false));
            buttonWithCounterView.text.setTypeface(AndroidUtilities.bold());
            buttonWithCounterView.setText(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$11(context, buttonWithCounterView, j, view);
                }
            });
            this.containerView.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, AndroidUtilities.dp((zIsCreator ? 52 : 0) + 72));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        fixNavigationBar();
        updateTitle();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new UndoView$$ExternalSyntheticLambda0(this, 7));
    }
}
