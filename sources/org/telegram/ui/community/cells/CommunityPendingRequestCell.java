package org.telegram.ui.community.cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.RenderNodeEffects;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class CommunityPendingRequestCell extends FrameLayout implements Theme.Colorable {
    private final ButtonWithCounterView addButton;
    public final BackupImageView avatarView;
    private BlurredBackgroundDrawable blurredBackgroundDrawable;
    private final int currentAccount;
    private final ButtonWithCounterView declineButton;
    ClickDelegate delegate;
    long groupDialogId;
    public final TextView hiddenLabelView;
    public final TextView membersCountView;
    private boolean needDivider;
    public final BackupImageView requesterAvatarView;
    private final Theme.ResourcesProvider resourcesProvider;
    private final BlurredBackgroundSourceRenderNode sourceRenderNode;
    private final ColoredImageSpan span;
    public final TextView subtitleView;
    public final TextView titleView;
    long userDialogId;

    public interface ClickDelegate {
        void onClickApprove(long j);

        void onClickDecline(long j);

        void onClickGroupOwner(long j);
    }

    public static void m4895$r8$lambda$iKAnBjVDjZkfG3zWlAGUhGTF0() {
    }

    public int[] getColorKeys() {
        return Theme.Colorable.CC.$default$getColorKeys(this);
    }

    public CommunityPendingRequestCell(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory;
        super(context);
        this.resourcesProvider = resourcesProvider;
        this.currentAccount = i;
        if (Build.VERSION.SDK_INT >= 31) {
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.sourceRenderNode = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setBlur(AndroidUtilities.dp(7.0f), RenderNodeEffects.createSaturationXRenderEffect(1.125f));
            blurredBackgroundSourceRenderNode.noClip();
            blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
        } else {
            this.sourceRenderNode = null;
            BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
            blurredBackgroundSourceColor.setColor(-16777216);
            blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(52.0f) / 2);
        addView(backupImageView, LayoutHelper.createFrame(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_user_channels_10);
        this.span = coloredImageSpan;
        coloredImageSpan.setTranslateX(AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(context);
        this.membersCountView = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -1, 81));
        addView(frameLayout, LayoutHelper.createLinear(52, 14.33f, 48, 11, 48, 0, 0));
        BlurredBackgroundDrawable radius = blurredBackgroundDrawableViewFactory.create(textView).setColorProvider(BlurredBackgroundProviderImpl.counterMini(resourcesProvider)).setRadius(AndroidUtilities.dp(7.0f));
        this.blurredBackgroundDrawable = radius;
        textView.setBackground(radius);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.titleView = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 10.0f, 0.0f, 1.33f));
        BackupImageView backupImageView2 = new BackupImageView(context);
        this.requesterAvatarView = backupImageView2;
        backupImageView2.setRoundRadius(AndroidUtilities.dp(8.0f));
        backupImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CommunityPendingRequestCell.$r8$lambda$gK9q3Qn_P46I_fBulH85Nd9pSCs(this.f$0, view);
            }
        });
        addView(backupImageView2, LayoutHelper.createFrame(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.subtitleView = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CommunityPendingRequestCell.$r8$lambda$4B07SMGKAy9Ni44ywcyJOnZwox8(this.f$0, view);
            }
        });
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 20.0f, 0.0f, 0.0f, 1.33f));
        TextView textView4 = new TextView(context);
        this.hiddenLabelView = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6, resourcesProvider), 0.14f)));
        textView4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.66f));
        textView4.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.mini_ephemeral_hidden_14), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityPendingRequestOnlyVisibleToMembers));
        textView4.setText(spannableStringBuilder);
        textView4.setVisibility(8);
        linearLayout.addView(textView4, LayoutHelper.createLinear(-2, -2, 0.0f, 7.0f, 0.0f, 1.33f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        this.declineButton = buttonWithCounterView;
        buttonWithCounterView.setUseWrapContent(true);
        buttonWithCounterView.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        buttonWithCounterView.setRound();
        buttonWithCounterView.setNeutral();
        buttonWithCounterView.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider), 0.14f));
        buttonWithCounterView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        buttonWithCounterView.setText(LocaleController.getString(R.string.Decline), false);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CommunityPendingRequestCell.m4897$r8$lambda$lcOxsW5NAQvrDANF7AeSQcNj7g(this.f$0, view);
            }
        });
        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, resourcesProvider);
        this.addButton = buttonWithCounterView2;
        buttonWithCounterView2.setUseWrapContent(true);
        buttonWithCounterView2.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        buttonWithCounterView2.setRound();
        buttonWithCounterView2.setText(LocaleController.getString(R.string.Add), false);
        buttonWithCounterView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CommunityPendingRequestCell.m4896$r8$lambda$3YrE6nLsEz1kpJGlMYqdv3H21k(this.f$0, view);
            }
        });
        linearLayout2.addView(buttonWithCounterView2, LayoutHelper.createLinear(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        updateColors();
    }

    public static void $r8$lambda$gK9q3Qn_P46I_fBulH85Nd9pSCs(CommunityPendingRequestCell communityPendingRequestCell, View view) {
        ClickDelegate clickDelegate = communityPendingRequestCell.delegate;
        if (clickDelegate != null) {
            clickDelegate.onClickGroupOwner(communityPendingRequestCell.userDialogId);
        }
    }

    public static void $r8$lambda$4B07SMGKAy9Ni44ywcyJOnZwox8(CommunityPendingRequestCell communityPendingRequestCell, View view) {
        ClickDelegate clickDelegate = communityPendingRequestCell.delegate;
        if (clickDelegate != null) {
            clickDelegate.onClickGroupOwner(communityPendingRequestCell.userDialogId);
        }
    }

    public static void m4897$r8$lambda$lcOxsW5NAQvrDANF7AeSQcNj7g(CommunityPendingRequestCell communityPendingRequestCell, View view) {
        ClickDelegate clickDelegate = communityPendingRequestCell.delegate;
        if (clickDelegate != null) {
            clickDelegate.onClickDecline(communityPendingRequestCell.groupDialogId);
        }
    }

    public static void m4896$r8$lambda$3YrE6nLsEz1kpJGlMYqdv3H21k(CommunityPendingRequestCell communityPendingRequestCell, View view) {
        ClickDelegate clickDelegate = communityPendingRequestCell.delegate;
        if (clickDelegate != null) {
            clickDelegate.onClickApprove(communityPendingRequestCell.groupDialogId);
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.blurredBackgroundDrawable.setSourceOffset(this.membersCountView.getLeft() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(48.0f));
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (Build.VERSION.SDK_INT >= 31 && this.sourceRenderNode != null && view == this.avatarView) {
            int iDp = AndroidUtilities.dp(9.0f);
            int left = this.avatarView.getLeft() - iDp;
            int top = this.avatarView.getTop() - iDp;
            int iDp2 = AndroidUtilities.dp(52.0f) + (iDp * 2);
            RecordingCanvas recordingCanvasBeginRecording = this.sourceRenderNode.beginRecording(iDp2, iDp2);
            recordingCanvasBeginRecording.translate(-left, -top);
            recordingCanvasBeginRecording.drawColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
            recordingCanvasBeginRecording.save();
            float f = iDp2 / 2.0f;
            recordingCanvasBeginRecording.scale(1.125f, 1.125f, f, f);
            super.drawChild(recordingCanvasBeginRecording, view, j);
            recordingCanvasBeginRecording.restore();
            recordingCanvasBeginRecording.drawColor(536870912);
            this.sourceRenderNode.endRecording();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.needDivider) {
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, Theme.dividerPaint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public void set(long j, TLRPC.User user, ClickDelegate clickDelegate, boolean z, boolean z2) {
        int i;
        this.delegate = clickDelegate;
        this.groupDialogId = j;
        this.userDialogId = user.id;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
        this.titleView.setText(DialogObject.getName(j));
        TextView textView = this.subtitleView;
        if (user2 != null) {
            i = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i, DialogObject.getShortName(user)), Theme.getColor(Theme.key_telegram_color_text), new Runnable() {
            @Override
            public final void run() {
                CommunityPendingRequestCell.m4895$r8$lambda$iKAnBjVDjZkfG3zWlAGUhGTF0();
            }
        }));
        if (user2 == null && chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(this.span, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumberWithMillion(chat.participants_count, ','));
            this.membersCountView.setText(spannableStringBuilder);
            this.membersCountView.setVisibility(0);
        } else {
            this.membersCountView.setVisibility(8);
        }
        if (z) {
            this.hiddenLabelView.setVisibility(0);
        } else {
            this.hiddenLabelView.setVisibility(8);
        }
        this.needDivider = z2;
        if (user2 != null) {
            this.avatarView.setForUserOrChat(user2, new AvatarDrawable(user2));
        } else {
            this.avatarView.setForUserOrChat(chat, new AvatarDrawable(chat));
        }
        this.requesterAvatarView.setForUserOrChat(user, new AvatarDrawable(user));
    }

    @Override
    public void updateColors() {
        this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        TextView textView = this.subtitleView;
        int i = Theme.key_windowBackgroundWhiteGrayText2;
        textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        this.hiddenLabelView.setTextColor(Theme.getColor(i, this.resourcesProvider));
    }

    public static class Data {
        public final long dialogToAdd;
        public final boolean isHidden;
        public final TLRPC.User requestFromUser;

        private Data(long j, TLRPC.User user, boolean z) {
            this.dialogToAdd = j;
            this.requestFromUser = user;
            this.isHidden = z;
        }
    }

    public static class Factory extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public CommunityPendingRequestCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            CommunityPendingRequestCell communityPendingRequestCell = new CommunityPendingRequestCell(context, resourcesProvider, i);
            communityPendingRequestCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            communityPendingRequestCell.setClickable(false);
            return communityPendingRequestCell;
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            CommunityPendingRequestCell communityPendingRequestCell = (CommunityPendingRequestCell) view;
            Data data = (Data) uItem.object;
            communityPendingRequestCell.set(data.dialogToAdd, data.requestFromUser, (ClickDelegate) uItem.object2, data.isHidden, !uItem.hideDivider);
        }

        @Override
        public boolean equals(UItem uItem, UItem uItem2) {
            Data data = (Data) uItem.object;
            Data data2 = (Data) uItem2.object;
            return data.dialogToAdd == data2.dialogToAdd && DialogObject.getDialogId(data.requestFromUser) == DialogObject.getDialogId(data2.requestFromUser);
        }

        public static UItem asPendingRequest(long j, TLRPC.User user, boolean z, ClickDelegate clickDelegate, boolean z2) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.object = new Data(j, user, z);
            uItemOfFactory.object2 = clickDelegate;
            uItemOfFactory.hideDivider = !z2;
            return uItemOfFactory;
        }
    }
}
