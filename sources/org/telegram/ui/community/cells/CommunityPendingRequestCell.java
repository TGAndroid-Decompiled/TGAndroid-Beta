package org.telegram.ui.community.cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda23;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
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
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda31;
import org.telegram.ui.community.CommunityUtils;

public final class CommunityPendingRequestCell extends FrameLayout implements Theme.Colorable {
    public static final int $r8$clinit = 0;
    public final BackupImageView avatarView;
    public final BlurredBackgroundDrawable blurredBackgroundDrawable;
    public final int currentAccount;
    public ClickDelegate delegate;
    public long groupDialogId;
    public final TextView hiddenLabelView;
    public final TextView membersCountView;
    public boolean needDivider;
    public final BackupImageView requesterAvatarView;
    public final Theme.ResourcesProvider resourcesProvider;
    public final BlurredBackgroundSourceRenderNode sourceRenderNode;
    public final ColoredImageSpan span;
    public final TextView subtitleView;
    public final TextView titleView;
    public long userDialogId;

    public interface ClickDelegate {
    }

    public final class Data {
        public final long dialogToAdd;
        public final boolean isHidden;
        public final TLRPC.User requestFromUser;

        public Data(long j, TLRPC.User user, boolean z) {
            this.dialogToAdd = j;
            this.requestFromUser = user;
            this.isHidden = z;
        }
    }

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            int i;
            CommunityPendingRequestCell communityPendingRequestCell = (CommunityPendingRequestCell) view;
            Data data = (Data) uItem.object;
            TLRPC.User user = data.requestFromUser;
            ClickDelegate clickDelegate = (ClickDelegate) uItem.object2;
            boolean z2 = !uItem.hideDivider;
            int i2 = CommunityPendingRequestCell.$r8$clinit;
            communityPendingRequestCell.delegate = clickDelegate;
            long j = data.dialogToAdd;
            communityPendingRequestCell.groupDialogId = j;
            communityPendingRequestCell.userDialogId = user.id;
            int i3 = communityPendingRequestCell.currentAccount;
            TLRPC.Chat chat = MessagesController.getInstance(i3).getChat(Long.valueOf(-j));
            TLRPC.User user2 = MessagesController.getInstance(i3).getUser(Long.valueOf(j));
            communityPendingRequestCell.titleView.setText(DialogObject.getName(j));
            TextView textView = communityPendingRequestCell.subtitleView;
            if (user2 != null) {
                i = R.string.CommunityPendingRequestSuggestedBot;
            } else {
                i = ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.CommunityPendingRequestSuggestedChannel : R.string.CommunityPendingRequestSuggestedGroup;
            }
            textView.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i, DialogObject.getShortName(user)), Theme.getColor(null, Theme.key_telegram_color_text, false), new VoIPFragment$$ExternalSyntheticLambda31(12)));
            TextView textView2 = communityPendingRequestCell.membersCountView;
            if (user2 == null && chat != null && chat.participants_count > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
                spannableStringBuilder.setSpan(communityPendingRequestCell.span, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.formatNumberWithMillion(chat.participants_count, ','));
                textView2.setText(spannableStringBuilder);
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
            TextView textView3 = communityPendingRequestCell.hiddenLabelView;
            if (data.isHidden) {
                textView3.setVisibility(0);
            } else {
                textView3.setVisibility(8);
            }
            communityPendingRequestCell.needDivider = z2;
            BackupImageView backupImageView = communityPendingRequestCell.avatarView;
            if (user2 != null) {
                backupImageView.imageReceiver.setForUserOrChat(user2, new AvatarDrawable(user2));
                backupImageView.onNewImageSet();
            } else {
                backupImageView.imageReceiver.setForUserOrChat(chat, new AvatarDrawable(chat));
                backupImageView.onNewImageSet();
            }
            BackupImageView backupImageView2 = communityPendingRequestCell.requesterAvatarView;
            backupImageView2.imageReceiver.setForUserOrChat(user, new AvatarDrawable(user));
            backupImageView2.onNewImageSet();
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            CommunityPendingRequestCell communityPendingRequestCell = new CommunityPendingRequestCell(context, i, resourcesProvider);
            communityPendingRequestCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            communityPendingRequestCell.setClickable(false);
            return communityPendingRequestCell;
        }

        @Override
        public final boolean equals(UItem uItem, UItem uItem2) {
            Data data = (Data) uItem.object;
            Data data2 = (Data) uItem2.object;
            return data.dialogToAdd == data2.dialogToAdd && DialogObject.getDialogId(data.requestFromUser) == DialogObject.getDialogId(data2.requestFromUser);
        }
    }

    public CommunityPendingRequestCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory;
        super(context);
        this.resourcesProvider = resourcesProvider;
        this.currentAccount = i;
        if (Build.VERSION.SDK_INT >= 31) {
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.sourceRenderNode = blurredBackgroundSourceRenderNode;
            float fDp = AndroidUtilities.dp(7.0f);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.125f);
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            RenderNode renderNode = blurredBackgroundSourceRenderNode.renderNode;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(fDp, fDp, Shader.TileMode.CLAMP), renderEffectCreateColorFilterEffect));
            blurredBackgroundSourceRenderNode.noClip = true;
            blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
        } else {
            this.sourceRenderNode = null;
            BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
            blurredBackgroundSourceColor.paint.setColor(-16777216);
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
        addView(frameLayout, LayoutHelper.createLinear(52, 48, 11, 48, 0, 14.33f, 0));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(textView, null, false);
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new ContactsActivity$$ExternalSyntheticLambda18(14);
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(1358954495, 1627389951, 2);
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(603979776, 603979776, 2);
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(0, 0, 2);
        blurredBackgroundProviderBuilder.shadowRadius = 0.0f;
        blurredBackgroundProviderBuilder.shadowDy = 0.0f;
        float fDpf2 = AndroidUtilities.dpf2(0.43f);
        float fDpf3 = AndroidUtilities.dpf2(0.43f);
        blurredBackgroundProviderBuilder.strokeWidthTop = fDpf2;
        blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf3;
        blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundProviderBuilder);
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(7.0f));
        this.blurredBackgroundDrawable = blurredBackgroundDrawableCreate;
        textView.setBackground(blurredBackgroundDrawableCreate);
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
        linearLayout.addView(textView2, LayoutHelper.createLinear(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        BackupImageView backupImageView2 = new BackupImageView(context);
        this.requesterAvatarView = backupImageView2;
        backupImageView2.setRoundRadius(AndroidUtilities.dp(8.0f));
        final int i2 = 0;
        backupImageView2.setOnClickListener(new View.OnClickListener(this) {
            public final CommunityPendingRequestCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        CommunityPendingRequestCell communityPendingRequestCell = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate = communityPendingRequestCell.delegate;
                        if (clickDelegate != null) {
                            long j = communityPendingRequestCell.userDialogId;
                            CommunityUtils.PendingRequests.Delegate delegate = ((CommunityUtils.PendingRequests) clickDelegate).delegate;
                            if (delegate != null) {
                                delegate.onClickGroupOwner(j);
                            }
                        }
                        break;
                    case 1:
                        CommunityPendingRequestCell communityPendingRequestCell2 = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate2 = communityPendingRequestCell2.delegate;
                        if (clickDelegate2 != null) {
                            long j2 = communityPendingRequestCell2.userDialogId;
                            CommunityUtils.PendingRequests.Delegate delegate2 = ((CommunityUtils.PendingRequests) clickDelegate2).delegate;
                            if (delegate2 != null) {
                                delegate2.onClickGroupOwner(j2);
                            }
                        }
                        break;
                    case 2:
                        CommunityPendingRequestCell communityPendingRequestCell3 = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate3 = communityPendingRequestCell3.delegate;
                        if (clickDelegate3 != null) {
                            ((CommunityUtils.PendingRequests) clickDelegate3).onResolveJoinRequest(communityPendingRequestCell3.groupDialogId, false);
                        }
                        break;
                    default:
                        CommunityPendingRequestCell communityPendingRequestCell4 = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate4 = communityPendingRequestCell4.delegate;
                        if (clickDelegate4 != null) {
                            ((CommunityUtils.PendingRequests) clickDelegate4).onResolveJoinRequest(communityPendingRequestCell4.groupDialogId, true);
                        }
                        break;
                }
            }
        });
        addView(backupImageView2, LayoutHelper.createFrame(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.subtitleView = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        final int i3 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final CommunityPendingRequestCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        CommunityPendingRequestCell communityPendingRequestCell = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate = communityPendingRequestCell.delegate;
                        if (clickDelegate != null) {
                            long j = communityPendingRequestCell.userDialogId;
                            CommunityUtils.PendingRequests.Delegate delegate = ((CommunityUtils.PendingRequests) clickDelegate).delegate;
                            if (delegate != null) {
                                delegate.onClickGroupOwner(j);
                            }
                        }
                        break;
                    case 1:
                        CommunityPendingRequestCell communityPendingRequestCell2 = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate2 = communityPendingRequestCell2.delegate;
                        if (clickDelegate2 != null) {
                            long j2 = communityPendingRequestCell2.userDialogId;
                            CommunityUtils.PendingRequests.Delegate delegate2 = ((CommunityUtils.PendingRequests) clickDelegate2).delegate;
                            if (delegate2 != null) {
                                delegate2.onClickGroupOwner(j2);
                            }
                        }
                        break;
                    case 2:
                        CommunityPendingRequestCell communityPendingRequestCell3 = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate3 = communityPendingRequestCell3.delegate;
                        if (clickDelegate3 != null) {
                            ((CommunityUtils.PendingRequests) clickDelegate3).onResolveJoinRequest(communityPendingRequestCell3.groupDialogId, false);
                        }
                        break;
                    default:
                        CommunityPendingRequestCell communityPendingRequestCell4 = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate4 = communityPendingRequestCell4.delegate;
                        if (clickDelegate4 != null) {
                            ((CommunityUtils.PendingRequests) clickDelegate4).onResolveJoinRequest(communityPendingRequestCell4.groupDialogId, true);
                        }
                        break;
                }
            }
        });
        linearLayout.addView(textView3, LayoutHelper.createLinear(20.0f, 0.0f, 0.0f, 1.33f, -1, -2));
        TextView textView4 = new TextView(context);
        this.hiddenLabelView = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), Theme.multAlpha(0.14f, Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6, resourcesProvider))));
        textView4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.66f));
        textView4.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.mini_ephemeral_hidden_14), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityPendingRequestOnlyVisibleToMembers));
        textView4.setText(spannableStringBuilder);
        textView4.setVisibility(8);
        linearLayout.addView(textView4, LayoutHelper.createLinear(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        buttonWithCounterView.setUseWrapContent(true);
        buttonWithCounterView.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        buttonWithCounterView.setRoundRadius(24);
        buttonWithCounterView.setNeutral();
        buttonWithCounterView.setColor(Theme.multAlpha(0.14f, Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider)));
        buttonWithCounterView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        buttonWithCounterView.setText(LocaleController.getString(R.string.Decline), false, true);
        final int i4 = 2;
        buttonWithCounterView.setOnClickListener(new View.OnClickListener(this) {
            public final CommunityPendingRequestCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        CommunityPendingRequestCell communityPendingRequestCell = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate = communityPendingRequestCell.delegate;
                        if (clickDelegate != null) {
                            long j = communityPendingRequestCell.userDialogId;
                            CommunityUtils.PendingRequests.Delegate delegate = ((CommunityUtils.PendingRequests) clickDelegate).delegate;
                            if (delegate != null) {
                                delegate.onClickGroupOwner(j);
                            }
                        }
                        break;
                    case 1:
                        CommunityPendingRequestCell communityPendingRequestCell2 = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate2 = communityPendingRequestCell2.delegate;
                        if (clickDelegate2 != null) {
                            long j2 = communityPendingRequestCell2.userDialogId;
                            CommunityUtils.PendingRequests.Delegate delegate2 = ((CommunityUtils.PendingRequests) clickDelegate2).delegate;
                            if (delegate2 != null) {
                                delegate2.onClickGroupOwner(j2);
                            }
                        }
                        break;
                    case 2:
                        CommunityPendingRequestCell communityPendingRequestCell3 = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate3 = communityPendingRequestCell3.delegate;
                        if (clickDelegate3 != null) {
                            ((CommunityUtils.PendingRequests) clickDelegate3).onResolveJoinRequest(communityPendingRequestCell3.groupDialogId, false);
                        }
                        break;
                    default:
                        CommunityPendingRequestCell communityPendingRequestCell4 = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate4 = communityPendingRequestCell4.delegate;
                        if (clickDelegate4 != null) {
                            ((CommunityUtils.PendingRequests) clickDelegate4).onResolveJoinRequest(communityPendingRequestCell4.groupDialogId, true);
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, resourcesProvider, true);
        buttonWithCounterView2.setUseWrapContent(true);
        buttonWithCounterView2.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        buttonWithCounterView2.setRoundRadius(24);
        buttonWithCounterView2.setText(LocaleController.getString(R.string.Add), false, true);
        final int i5 = 3;
        buttonWithCounterView2.setOnClickListener(new View.OnClickListener(this) {
            public final CommunityPendingRequestCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        CommunityPendingRequestCell communityPendingRequestCell = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate = communityPendingRequestCell.delegate;
                        if (clickDelegate != null) {
                            long j = communityPendingRequestCell.userDialogId;
                            CommunityUtils.PendingRequests.Delegate delegate = ((CommunityUtils.PendingRequests) clickDelegate).delegate;
                            if (delegate != null) {
                                delegate.onClickGroupOwner(j);
                            }
                        }
                        break;
                    case 1:
                        CommunityPendingRequestCell communityPendingRequestCell2 = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate2 = communityPendingRequestCell2.delegate;
                        if (clickDelegate2 != null) {
                            long j2 = communityPendingRequestCell2.userDialogId;
                            CommunityUtils.PendingRequests.Delegate delegate2 = ((CommunityUtils.PendingRequests) clickDelegate2).delegate;
                            if (delegate2 != null) {
                                delegate2.onClickGroupOwner(j2);
                            }
                        }
                        break;
                    case 2:
                        CommunityPendingRequestCell communityPendingRequestCell3 = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate3 = communityPendingRequestCell3.delegate;
                        if (clickDelegate3 != null) {
                            ((CommunityUtils.PendingRequests) clickDelegate3).onResolveJoinRequest(communityPendingRequestCell3.groupDialogId, false);
                        }
                        break;
                    default:
                        CommunityPendingRequestCell communityPendingRequestCell4 = this.f$0;
                        CommunityPendingRequestCell.ClickDelegate clickDelegate4 = communityPendingRequestCell4.delegate;
                        if (clickDelegate4 != null) {
                            ((CommunityUtils.PendingRequests) clickDelegate4).onResolveJoinRequest(communityPendingRequestCell4.groupDialogId, true);
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(buttonWithCounterView2, LayoutHelper.createLinear(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        updateColors$1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.needDivider) {
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, Theme.dividerPaint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode;
        BackupImageView backupImageView;
        if (Build.VERSION.SDK_INT >= 31 && (blurredBackgroundSourceRenderNode = this.sourceRenderNode) != null && view == (backupImageView = this.avatarView)) {
            int iDp = AndroidUtilities.dp(9.0f);
            int left = backupImageView.getLeft() - iDp;
            int top = backupImageView.getTop() - iDp;
            int iDp2 = (iDp * 2) + AndroidUtilities.dp(52.0f);
            RecordingCanvas recordingCanvasBeginRecording = blurredBackgroundSourceRenderNode.beginRecording(iDp2, iDp2);
            recordingCanvasBeginRecording.translate(-left, -top);
            recordingCanvasBeginRecording.drawColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
            recordingCanvasBeginRecording.save();
            float f = iDp2 / 2.0f;
            recordingCanvasBeginRecording.scale(1.125f, 1.125f, f, f);
            super.drawChild(recordingCanvasBeginRecording, view, j);
            recordingCanvasBeginRecording.restore();
            recordingCanvasBeginRecording.drawColor(536870912);
            blurredBackgroundSourceRenderNode.endRecording();
        }
        return super.drawChild(canvas, view, j);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float fDp = AndroidUtilities.dp(9.0f) + this.membersCountView.getLeft();
        float fDp2 = AndroidUtilities.dp(48.0f);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.blurredBackgroundDrawable;
        if (blurredBackgroundDrawable.sourceOffsetX == fDp && blurredBackgroundDrawable.sourceOffsetY == fDp2) {
            return;
        }
        blurredBackgroundDrawable.sourceOffsetX = fDp;
        blurredBackgroundDrawable.sourceOffsetY = fDp2;
        blurredBackgroundDrawable.onSourceOffsetChange();
    }

    @Override
    public final void updateColors$1() {
        int i = Theme.key_windowBackgroundWhiteBlackText;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.titleView.setTextColor(Theme.getColor(i, resourcesProvider));
        int i2 = Theme.key_windowBackgroundWhiteGrayText2;
        this.subtitleView.setTextColor(Theme.getColor(i2, resourcesProvider));
        this.hiddenLabelView.setTextColor(Theme.getColor(i2, resourcesProvider));
    }
}
