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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda51;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda22;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.ThemeActivity$$ExternalSyntheticLambda19;

public final class CreateRtmpStreamBottomSheet extends BottomSheetWithRecyclerListView {
    public UniversalAdapter adapter;
    public final boolean hasButton;
    public final boolean hasFewPeers;
    public final JoinCallAlert.JoinCallAlertDelegate joinCallDelegate;
    public String rtmpKey;
    public SpannableStringBuilder rtmpKeySpoiled;
    public String rtmpUrl;
    public TLRPC.InputPeer selectAfterDismiss;
    public final boolean story;
    public TopCell topCell;

    public final class TextDetailCellFactory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new TextDetailCellFactory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            TextDetailCell textDetailCell = (TextDetailCell) view;
            textDetailCell.setTextAndValue(uItem.text, uItem.textValue, !uItem.hideDivider);
            if (uItem.text instanceof SpannableStringBuilder) {
                SpoilersTextView spoilersTextView = textDetailCell.textView;
                spoilersTextView.setTextSize(1, 13.0f);
                spoilersTextView.setTranslationY(AndroidUtilities.dp(2.0f));
                spoilersTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
            }
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            TextDetailCell textDetailCell = new TextDetailCell(23, context, resourcesProvider, true, false);
            textDetailCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            Drawable drawableMutate = context.getDrawable(R.drawable.msg_copy).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            textDetailCell.setImage(drawableMutate);
            textDetailCell.setImageClickListener(new ChatActivity$$ExternalSyntheticLambda62((Object) this, (Object) context, (Object) textDetailCell, 19, (byte) 0));
            return textDetailCell;
        }
    }

    public final class TopCell extends LinearLayout {
    }

    public CreateRtmpStreamBottomSheet(Context context, int i, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ThemeActivity$$ExternalSyntheticLambda19 themeActivity$$ExternalSyntheticLambda19, DarkThemeResourceProvider darkThemeResourceProvider) {
        int iDp;
        CreateRtmpStreamBottomSheet bottomSheetWithRecyclerListView = new BottomSheetWithRecyclerListView(context, null, false, false, false, darkThemeResourceProvider);
        bottomSheetWithRecyclerListView.story = true;
        bottomSheetWithRecyclerListView.topPadding = 0.126f;
        bottomSheetWithRecyclerListView.joinCallDelegate = null;
        bottomSheetWithRecyclerListView.hasFewPeers = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z = themeActivity$$ExternalSyntheticLambda19 != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId))));
        if (themeActivity$$ExternalSyntheticLambda19 != null) {
            bottomSheetWithRecyclerListView.hasButton = true;
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, darkThemeResourceProvider, true);
            buttonWithCounterView.setText(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            bottomSheetWithRecyclerListView.containerView.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z ? 52 : 0) + 12));
            buttonWithCounterView.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7((CreateRtmpStreamBottomSheet) bottomSheetWithRecyclerListView, themeActivity$$ExternalSyntheticLambda19, buttonWithCounterView));
            if (z) {
                ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, darkThemeResourceProvider, false);
                buttonWithCounterView2.setColor(Theme.getColor(null, Theme.key_fill_RedNormal, false));
                buttonWithCounterView2.text.textPaint.setTypeface(AndroidUtilities.bold());
                buttonWithCounterView2.setText(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                bottomSheetWithRecyclerListView = this;
                buttonWithCounterView2.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda7(this, context, darkThemeResourceProvider, buttonWithCounterView2, getgroupcallstreamrtmpurl, i, 3));
                bottomSheetWithRecyclerListView.containerView.addView(buttonWithCounterView2, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(350L);
        bottomSheetWithRecyclerListView.recyclerListView.setItemAnimator(defaultItemAnimator);
        RecyclerListView recyclerListView = bottomSheetWithRecyclerListView.recyclerListView;
        int i2 = bottomSheetWithRecyclerListView.backgroundPaddingLeft;
        if (bottomSheetWithRecyclerListView.hasButton) {
            iDp = AndroidUtilities.dp(z ? 124.0f : 72.0f);
        } else {
            iDp = 0;
        }
        recyclerListView.setPadding(i2, 0, i2, iDp);
        bottomSheetWithRecyclerListView.fixNavigationBar();
        bottomSheetWithRecyclerListView.updateTitle$1();
        bottomSheetWithRecyclerListView.rtmpUrl = groupcallstreamrtmpurl.url;
        bottomSheetWithRecyclerListView.rtmpKey = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bottomSheetWithRecyclerListView.rtmpKey);
        bottomSheetWithRecyclerListView.rtmpKeySpoiled = spannableStringBuilder;
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 256;
        textStyleRun.start = 0;
        textStyleRun.end = spannableStringBuilder.length();
        bottomSheetWithRecyclerListView.rtmpKeySpoiled.setSpan(new TextStyleSpan(textStyleRun, 0), 0, bottomSheetWithRecyclerListView.rtmpKeySpoiled.length(), 0);
        bottomSheetWithRecyclerListView.adapter.update(false);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new CallLogActivity$$ExternalSyntheticLambda3(this, 24), this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    @Override
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate = this.joinCallDelegate;
        if (joinCallAlertDelegate == null || (inputPeer = this.selectAfterDismiss) == null) {
            return;
        }
        joinCallAlertDelegate.didSelectChat(inputPeer, this.hasFewPeers, false, true);
    }

    public final void fillItems$26(ArrayList arrayList) {
        String string = null;
        if (this.topCell == null) {
            Context context = getContext();
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            TopCell topCell = new TopCell(context);
            topCell.setOrientation(1);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            rLottieImageView.setAutoRepeat(true);
            rLottieImageView.setAnimation(R.raw.utyan_streaming, 112, 112, null);
            rLottieImageView.playAnimation();
            topCell.addView(rLottieImageView, LayoutHelper.createLinear(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            topCell.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            topCell.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 28, 0, 28, 17));
            this.topCell = topCell;
        }
        arrayList.add(UItem.asCustom(this.topCell));
        UItem uItem = new UItem(7);
        uItem.text = null;
        arrayList.add(uItem);
        String string2 = LocaleController.getString(R.string.VoipChatStreamSettings);
        UItem uItem2 = new UItem(0);
        uItem2.text = string2;
        arrayList.add(uItem2);
        String str = this.rtmpUrl;
        String string3 = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i = TextDetailCellFactory.$r8$clinit;
        UItem uItemOfFactory = UItem.ofFactory(TextDetailCellFactory.class);
        uItemOfFactory.text = str;
        uItemOfFactory.textValue = string3;
        uItemOfFactory.hideDivider = false;
        uItemOfFactory.enabled = false;
        arrayList.add(uItemOfFactory);
        SpannableStringBuilder spannableStringBuilder = this.rtmpKeySpoiled;
        String string4 = LocaleController.getString(R.string.VoipChatStreamKey);
        UItem uItemOfFactory2 = UItem.ofFactory(TextDetailCellFactory.class);
        uItemOfFactory2.text = spannableStringBuilder;
        uItemOfFactory2.textValue = string4;
        uItemOfFactory2.hideDivider = true;
        uItemOfFactory2.enabled = false;
        arrayList.add(uItemOfFactory2);
        if (this.hasButton) {
            string = LocaleController.getString(this.story ? R.string.VoipChatStreamWithAnotherAppDescriptionStory : R.string.VoipChatStreamWithAnotherAppDescription);
        }
        UItem uItem3 = new UItem(7);
        uItem3.text = string;
        arrayList.add(uItem3);
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.Streaming);
    }

    public final void lambda$new$10(ButtonWithCounterView buttonWithCounterView, long j) {
        if (buttonWithCounterView.loading) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda1(this, buttonWithCounterView, 1));
    }

    public final void lambda$new$11(Context context, ButtonWithCounterView buttonWithCounterView, long j) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, this.resourcesProvider);
        String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new ProfileActivity$$ExternalSyntheticLambda22(this, buttonWithCounterView, j, 6));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.makeRed(-1);
        builder.show();
    }

    public final void lambda$new$7(TLRPC.Peer peer) {
        this.selectAfterDismiss = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        lambda$showGiftOfferSheet$15();
    }

    public CreateRtmpStreamBottomSheet(BaseFragment baseFragment, TLRPC.Peer peer, long j, boolean z, JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate) {
        super(baseFragment, false);
        this.story = false;
        this.topPadding = 0.26f;
        this.joinCallDelegate = joinCallAlertDelegate;
        this.hasFewPeers = z;
        Context context = this.containerView.getContext();
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
        textView.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(18, this, peer));
        if (zIsCreator) {
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider, false);
            buttonWithCounterView.setColor(Theme.getColor(null, Theme.key_fill_RedNormal, false));
            buttonWithCounterView.text.textPaint.setTypeface(AndroidUtilities.bold());
            buttonWithCounterView.setText(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            buttonWithCounterView.setOnClickListener(new DialogsActivity$$ExternalSyntheticLambda51(this, context, buttonWithCounterView, j, 1));
            this.containerView.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, AndroidUtilities.dp((zIsCreator ? 52 : 0) + 72));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        fixNavigationBar();
        updateTitle$1();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new CallLogActivity$$ExternalSyntheticLambda1(this, 18));
    }
}
