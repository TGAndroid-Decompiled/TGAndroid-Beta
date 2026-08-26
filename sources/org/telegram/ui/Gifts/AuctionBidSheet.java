package org.telegram.ui.Gifts;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzks;
import java.util.ArrayList;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.utils.CountdownTimer;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda33;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda267;
import org.telegram.ui.ChatActivity$26$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Reactions.HwEmojis;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.ComposeDrawable$$ExternalSyntheticLambda0;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda89;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda149;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda12;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda97;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.SelectAnimatedEmojiDialog$SearchBox$2$$ExternalSyntheticLambda0;
import org.telegram.ui.StakedDiceSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.Stars.BalanceCloud;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.HighlightMessageSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotLocation$$ExternalSyntheticLambda14;

public final class AuctionBidSheet extends BottomSheetWithRecyclerListView implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int $r8$clinit = 0;
    public UniversalAdapter adapter;
    public AnimatedEmojiSpan animatedEmojiSpan;
    public GiftAuctionController.Auction auction;
    public final BalanceCloud balanceCloud;
    public boolean balanceCloudVisible;
    public boolean bidIsPending;
    public final FrameLayout bulletinContainer;
    public final AnonymousClass2 buttonView;
    public Runnable closeParentSheet;
    public final long giftId;
    public final IntroActivity.AnonymousClass1 giftsLeftCell;
    public final UItem headerItem;
    public boolean isFirstCheck;
    public boolean isOpenAnimationEnd;
    public long lastAcquiredCount;
    public long lastRecipientDialogId;
    public final IntroActivity.AnonymousClass1 minimumBidCell;
    public final IntroActivity.AnonymousClass1 nextRoundCell;
    public final BoolAnimator outbidColor;
    public final Params params;
    public final ColoredImageSpan[] refS;
    public final BidderCell selfBidderCell;
    public final AnimatedTextView selfBidderFutureGift;
    public final HeaderCell selfBidderHeader;
    public final AnonymousClass1 slider;
    public final ColoredImageSpan[] spanRefStars;
    public final CountdownTimer timer;
    public final BidderCell[] topBidderCells;
    public final BoolAnimator winningColor;

    public final class AnonymousClass1 extends StarsReactionsSheet.StarsSlider {
        public AnonymousClass1(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
                return false;
            }
            super.dispatchTouchEvent(motionEvent);
            return true;
        }

        @Override
        public final boolean onTapCustom(float f) {
            if (getProgress() <= 0.99d && f <= getMeasuredWidth() * 0.9f) {
                return false;
            }
            AuctionBidSheet.this.showCustomPlaceABid();
            return true;
        }

        @Override
        public final void onValueChanged(int i) {
            AuctionBidSheet.access$000(AuctionBidSheet.this, i);
        }

        @Override
        public final void setValue(int i) {
            super.setValue(i);
            AuctionBidSheet.access$000(AuctionBidSheet.this, i);
        }
    }

    public final class AnonymousClass2 extends ButtonWithCounterView {
        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (this.enabled) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public final class AnonymousClass4 extends EditTextCaption {
        public final int $r8$classId;
        public final Object val$drawable;

        public AnonymousClass4(FrameLayout frameLayout, Context context, Theme.ResourcesProvider resourcesProvider, int i) {
            super(context, resourcesProvider);
            this.$r8$classId = i;
            this.val$drawable = frameLayout;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    super.dispatchDraw(canvas);
                    int iDp = AndroidUtilities.dp(8.0f);
                    int iDp2 = AndroidUtilities.dp(20.0f);
                    int iDp3 = AndroidUtilities.dp(28.0f);
                    Drawable drawable = (Drawable) this.val$drawable;
                    drawable.setBounds(0, iDp, iDp2, iDp3);
                    drawable.draw(canvas);
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public int emojiCacheType() {
            switch (this.$r8$classId) {
                case 1:
                    return 3;
                case 2:
                    return 3;
                default:
                    return super.emojiCacheType();
            }
        }

        @Override
        public void invalidate() {
            switch (this.$r8$classId) {
                case 3:
                    if (!HwEmojis.hwEnabled) {
                        super.invalidate();
                        break;
                    }
                    break;
                default:
                    super.invalidate();
                    break;
            }
        }

        @Override
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            switch (this.$r8$classId) {
                case 1:
                    InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
                    if (((PollEditTextCell) this.val$drawable).showNextButton) {
                        editorInfo.imeOptions &= -1073741825;
                    }
                    return inputConnectionOnCreateInputConnection;
                case 2:
                    InputConnection inputConnectionOnCreateInputConnection2 = super.onCreateInputConnection(editorInfo);
                    editorInfo.imeOptions &= -1073741825;
                    return inputConnectionOnCreateInputConnection2;
                default:
                    return super.onCreateInputConnection(editorInfo);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 1:
                    super.onDraw(canvas);
                    ((PollEditTextCell) this.val$drawable).getClass();
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onFocusChanged(boolean z, int i, Rect rect) {
            switch (this.$r8$classId) {
                case 1:
                    super.onFocusChanged(z, i, rect);
                    ((PollEditTextCell) this.val$drawable).onEditTextFocusChanged(z);
                    break;
                case 2:
                default:
                    super.onFocusChanged(z, i, rect);
                    break;
                case 3:
                    if (z) {
                        ((SelectAnimatedEmojiDialog.SearchBox) ((SelectAnimatedEmojiDialog.AnonymousClass18) this.val$drawable)).this$0.onInputFocus();
                        AndroidUtilities.runOnUIThread(new SelectAnimatedEmojiDialog$SearchBox$2$$ExternalSyntheticLambda0(this, 0), 200L);
                    }
                    super.onFocusChanged(z, i, rect);
                    break;
            }
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 2:
                    super.onSizeChanged(i, i2, i3, i4);
                    postOnAnimation(new Tooltip$$ExternalSyntheticLambda0(this, 21));
                    break;
                default:
                    super.onSizeChanged(i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public boolean onTextContextMenuItem(int i) {
            ClipData primaryClip;
            switch (this.$r8$classId) {
                case 1:
                    if (i == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null && primaryClip.getItemCount() == 1 && AndroidUtilities.charSequenceIndexOf(primaryClip.getItemAt(0).getText(), "\n") > 0) {
                        CharSequence text = primaryClip.getItemAt(0).getText();
                        ArrayList arrayList = new ArrayList();
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = 0; i2 < text.length(); i2++) {
                            char cCharAt = text.charAt(i2);
                            if (cCharAt == '\n') {
                                arrayList.add(sb.toString());
                                sb.setLength(0);
                            } else {
                                sb.append(cCharAt);
                            }
                        }
                        if (!TextUtils.isEmpty(sb)) {
                            arrayList.add(sb);
                        }
                        if (((PollEditTextCell) this.val$drawable).onPastedMultipleLines(arrayList)) {
                            return true;
                        }
                    }
                    return super.onTextContextMenuItem(i);
                default:
                    return super.onTextContextMenuItem(i);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 1:
                    if (!isEnabled()) {
                        return false;
                    }
                    if (motionEvent.getAction() == 1) {
                        ((PollEditTextCell) this.val$drawable).onFieldTouchUp(this);
                    }
                    return super.onTouchEvent(motionEvent);
                case 2:
                default:
                    return super.onTouchEvent(motionEvent);
                case 3:
                    if (motionEvent.getAction() != 1 || !((SelectAnimatedEmojiDialog.SearchBox) ((SelectAnimatedEmojiDialog.AnonymousClass18) this.val$drawable)).this$0.prevWindowKeyboardVisible()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    AndroidUtilities.runOnUIThread(new SelectAnimatedEmojiDialog$SearchBox$2$$ExternalSyntheticLambda0(this, 1), 200L);
                    return false;
            }
        }

        @Override
        public ActionMode startActionMode(ActionMode.Callback callback, int i) {
            switch (this.$r8$classId) {
                case 1:
                    ActionMode actionModeStartActionMode = super.startActionMode(callback, i);
                    ((PollEditTextCell) this.val$drawable).onActionModeStart(this, actionModeStartActionMode);
                    return actionModeStartActionMode;
                default:
                    return super.startActionMode(callback, i);
            }
        }

        public AnonymousClass4(Context context, Theme.ResourcesProvider resourcesProvider, Drawable drawable) {
            super(context, resourcesProvider);
            this.$r8$classId = 0;
            this.val$drawable = drawable;
        }

        @Override
        public ActionMode startActionMode(ActionMode.Callback callback) {
            switch (this.$r8$classId) {
                case 1:
                    ActionMode actionModeStartActionMode = super.startActionMode(callback);
                    ((PollEditTextCell) this.val$drawable).onActionModeStart(this, actionModeStartActionMode);
                    return actionModeStartActionMode;
                default:
                    return super.startActionMode(callback);
            }
        }
    }

    public final class BidderCell extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        public final BackupImageView backupImageView;
        public final AnimatedTextView bidTextView;
        public boolean drawDivider;
        public final AnimatedTextView nameTextView;
        public final AnimatedTextView placeTextView;
        public final ColoredImageSpan[] ref;

        public BidderCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.ref = new ColoredImageSpan[1];
            setOrientation(0);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, false, false);
            this.nameTextView = animatedTextView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            animatedTextView.setTextColor(Theme.getColor(i, resourcesProvider));
            animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
            animatedTextView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            animatedTextView.setEllipsizeByGradient(true);
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context, false, false, false);
            this.bidTextView = animatedTextView2;
            animatedTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
            animatedTextView2.setTextSize(AndroidUtilities.dp(15.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.backupImageView = backupImageView;
            AnimatedTextView animatedTextView3 = new AnimatedTextView(context, false, false, false);
            this.placeTextView = animatedTextView3;
            animatedTextView3.setTextSize(AndroidUtilities.dp(15.0f));
            animatedTextView3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
            animatedTextView3.setTextColor(Theme.getColor(i, resourcesProvider));
            animatedTextView3.setTypeface(AndroidUtilities.bold());
            animatedTextView3.setGravity(17);
            addView(animatedTextView3, LayoutHelper.createLinear(66, -2, 0.0f, 16));
            addView(backupImageView, LayoutHelper.createLinear(32, 32, 0.0f, 16));
            addView(animatedTextView, LayoutHelper.createLinear(0, -2, 1.0f, 16));
            addView(animatedTextView2, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 0, 0, 20, 0));
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            this.placeTextView.invalidate();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.drawDivider) {
                canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
        }

        public final void setPlace(int i, boolean z, boolean z2) {
            AnimatedTextView animatedTextView = this.placeTextView;
            if (!z || i > 3) {
                if (i >= 10000) {
                    animatedTextView.setTextSize(AndroidUtilities.dp(12.0f));
                } else if (i >= 1000) {
                    animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
                } else {
                    animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
                }
                animatedTextView.setText(Integer.toString(i), z2, true);
                return;
            }
            if (i == 1) {
                animatedTextView.setText(Emoji.replaceWithRestrictedEmoji("🥇", animatedTextView.getPaint().getFontMetricsInt(), (Runnable) null), z2, true);
            } else if (i == 2) {
                animatedTextView.setText(Emoji.replaceWithRestrictedEmoji("🥈", animatedTextView.getPaint().getFontMetricsInt(), (Runnable) null), z2, true);
            } else if (i == 3) {
                animatedTextView.setText(Emoji.replaceWithRestrictedEmoji("🥉", animatedTextView.getPaint().getFontMetricsInt(), (Runnable) null), z2, true);
            }
        }
    }

    public final class Params {
        public final long dialogId;
        public final boolean hideName;
        public final TLRPC.TL_textWithEntities message;

        public Params(long j, boolean z, TLRPC.TL_textWithEntities tL_textWithEntities) {
            this.dialogId = j;
            this.hideName = z;
            this.message = tL_textWithEntities;
        }
    }

    public AuctionBidSheet(Context context, Theme.ResourcesProvider resourcesProvider, Params params, GiftAuctionController.Auction auction) {
        super(context, null, false, false, false, false, false, 2, resourcesProvider);
        this.topBidderCells = new BidderCell[3];
        this.isFirstCheck = true;
        this.refS = new ColoredImageSpan[1];
        AuctionBidSheet$$ExternalSyntheticLambda0 auctionBidSheet$$ExternalSyntheticLambda0 = new AuctionBidSheet$$ExternalSyntheticLambda0(this);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.winningColor = new BoolAnimator(0, auctionBidSheet$$ExternalSyntheticLambda0, cubicBezierInterpolator, 380L, false);
        this.outbidColor = new BoolAnimator(0, new AuctionBidSheet$$ExternalSyntheticLambda0(this), cubicBezierInterpolator, 380L, false);
        this.spanRefStars = new ColoredImageSpan[1];
        this.auction = auction;
        this.params = params;
        long j = auction.giftId;
        this.giftId = j;
        this.centerTitle = true;
        this.topPadding = 0.2f;
        GiftAuctionController.Auction auctionSubscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j, this);
        this.timer = new CountdownTimer(new AuctionBidSheet$$ExternalSyntheticLambda0(this));
        int i = 0;
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        BottomSheetWithRecyclerListView.AnonymousClass4 anonymousClass4 = this.actionBar;
        anonymousClass4.setActionBarMenuOnItemClick(new AuctionJoinSheet.AnonymousClass4(context, resourcesProvider, auctionSubscribeToGiftAuction.gift));
        ActionBarMenuItem actionBarMenuItemAddItem = anonymousClass4.createMenu().addItem(0, R.drawable.ic_ab_other);
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        actionBarMenuItemAddItem.addSubItem(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        actionBarMenuItemAddItem.addSubItem(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        actionBarMenuItemAddItem.addSubItem(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.headerItem = UItem.asCustom(-1, linearLayout);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, resourcesProvider);
        this.slider = anonymousClass1;
        anonymousClass1.drawPlus = true;
        this.auction.getMinimumBid();
        this.auction.getCurrentMyBid();
        long currentTopBid = this.auction.getCurrentTopBid();
        int i2 = currentTopBid > 100000 ? ((((int) currentTopBid) * 3) / 2000) * 1000 : currentTopBid > 30000 ? 100000 : 50000;
        int[] iArr = {50, 100, 500, 1000, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        boolean z = false;
        for (int i4 = 15; i3 < i4; i4 = 15) {
            int i5 = iArr[i3];
            if (i5 >= 50) {
                z = i5 == 50 ? false : z;
                if (i5 <= i2) {
                    arrayList.add(Integer.valueOf(i5));
                    if (iArr[i3] == i2) {
                        break;
                    }
                } else {
                    arrayList.add(Integer.valueOf(i2));
                    break;
                }
            } else {
                z = true;
            }
            i3++;
        }
        if (z) {
            arrayList.add(0, 50);
        }
        if (arrayList.size() < 2) {
            arrayList.clear();
            arrayList.add(1);
            arrayList.add(10000);
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            iArr2[i6] = ((Integer) arrayList.get(i6)).intValue();
        }
        AnonymousClass1 anonymousClass2 = this.slider;
        anonymousClass2.stops = iArr2;
        linearLayout.addView(anonymousClass2, LayoutHelper.createLinear(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        IntroActivity.AnonymousClass1 anonymousClass3 = new IntroActivity.AnonymousClass1(context, 20, resourcesProvider);
        this.minimumBidCell = anonymousClass3;
        int iDp = AndroidUtilities.dp(12.0f);
        int i7 = Theme.key_windowBackgroundGray;
        int themedColor = getThemedColor(i7);
        int iCompositeColors = ColorUtils.compositeColors(getThemedColor(Theme.key_listSelector), getThemedColor(i7));
        anonymousClass3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, themedColor, iCompositeColors, iCompositeColors));
        anonymousClass3.setOnClickListener(new AuctionBidSheet$$ExternalSyntheticLambda2(this, i));
        ((TextView) anonymousClass3.this$0).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        IntroActivity.AnonymousClass1 anonymousClass5 = new IntroActivity.AnonymousClass1(context, 20, resourcesProvider);
        this.nextRoundCell = anonymousClass5;
        anonymousClass5.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), getThemedColor(i7)));
        ((TextView) anonymousClass5.this$0).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        IntroActivity.AnonymousClass1 anonymousClass6 = new IntroActivity.AnonymousClass1(context, 20, resourcesProvider);
        this.giftsLeftCell = anonymousClass6;
        anonymousClass6.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), getThemedColor(i7)));
        ((TextView) anonymousClass6.this$0).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(anonymousClass3, LayoutHelper.createLinear(1.0f, 0, -1));
        linearLayout2.addView(new View(context), LayoutHelper.createLinear(0.0f, 10, -1));
        linearLayout2.addView(anonymousClass5, LayoutHelper.createLinear(1.0f, 0, -1));
        linearLayout2.addView(new View(context), LayoutHelper.createLinear(0.0f, 10, -1));
        linearLayout2.addView(anonymousClass6, LayoutHelper.createLinear(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (auctionSubscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            linksTextView.setGravity(17);
            linksTextView.setTextSize(1, 16.0f);
            int i8 = Theme.key_windowBackgroundWhiteLinkText;
            linksTextView.setTextColor(Theme.getColor(i8, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(i8, resourcesProvider));
            linksTextView.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda12(this, new boolean[1], resourcesProvider, 4));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new AnimatedEmojiSpan(auctionSubscribeToGiftAuction.giftDocumentId, 1.2f, linksTextView.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            linksTextView.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", auctionSubscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            ScaleStateListAnimator.apply(linksTextView, 0.02f, 1.5f);
            linearLayout.addView(linksTextView, LayoutHelper.createLinear(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i9 = Theme.key_windowBackgroundWhiteBlueHeader;
        int i10 = 1;
        int i11 = 0;
        HeaderCell headerCell = new HeaderCell(context, i9, 21, 0, 0, false, true, resourcesProvider);
        this.selfBidderHeader = headerCell;
        linearLayout.addView(headerCell, LayoutHelper.createLinear(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, false, false, false);
        this.selfBidderFutureGift = animatedTextView;
        animatedTextView.setTextSize(AndroidUtilities.dp(12.5f));
        animatedTextView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        animatedTextView.setSizeableBackground(Theme.createRadSelectorDrawable(0, 0, 9, 9));
        animatedTextView.setHideBackgroundIfEmpty(true);
        headerCell.setOnWidthUpdateListener(new ComposeDrawable$$ExternalSyntheticLambda0(this, 26));
        headerCell.addView(animatedTextView, LayoutHelper.createFrame(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        BidderCell bidderCell = new BidderCell(context, resourcesProvider);
        this.selfBidderCell = bidderCell;
        bidderCell.placeTextView.setTextColor(getThemedColor(i9));
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.setInfo(UserConfig.selectedAccount, user);
        BackupImageView backupImageView = bidderCell.backupImageView;
        backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
        backupImageView.onNewImageSet();
        backupImageView.setRoundRadius(AndroidUtilities.dp(16.0f));
        bidderCell.nameTextView.setText(UserObject.getUserName(user));
        linearLayout.addView(bidderCell, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        HeaderCell headerCell2 = new HeaderCell(context, i9, 21, 15, 0, false, false, resourcesProvider);
        headerCell2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(headerCell2, LayoutHelper.createLinear(-1, -2));
        int i12 = 0;
        while (true) {
            BidderCell[] bidderCellArr = this.topBidderCells;
            if (i12 >= bidderCellArr.length) {
                break;
            }
            bidderCellArr[i12] = new BidderCell(context, resourcesProvider);
            int i13 = i12 + 1;
            this.topBidderCells[i12].setPlace(i13, true, false);
            this.topBidderCells[i12].setBackground(Theme.getSelectorDrawable(false));
            BidderCell bidderCell2 = this.topBidderCells[i12];
            bidderCell2.drawDivider = i12 < 2;
            bidderCell2.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(15));
            linearLayout.addView(this.topBidderCells[i12], LayoutHelper.createLinear(-1, -2));
            i12 = i13;
        }
        AnonymousClass2 anonymousClass7 = new AnonymousClass2(context, resourcesProvider, true);
        this.buttonView = anonymousClass7;
        anonymousClass7.setRoundRadius(24);
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = layoutParamsCreateFrame.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame.leftMargin = i14 + i15;
        layoutParamsCreateFrame.rightMargin += i15;
        this.containerView.addView(anonymousClass7, layoutParamsCreateFrame);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i16 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i16, 0, i16, AndroidUtilities.dp(64.0f));
        this.recyclerListView.setOnItemClickListener(new AuctionBidSheet$$ExternalSyntheticLambda6(i11));
        long j2 = auctionSubscribeToGiftAuction.auctionUserState.bid_amount;
        if (j2 > 0) {
            this.slider.setValue((int) j2);
        } else {
            this.slider.setValue((int) auctionSubscribeToGiftAuction.getMinimumBid());
        }
        updateTable(false);
        this.recyclerListView.setOverScrollMode(2);
        BalanceCloud balanceCloud = new BalanceCloud(context, this.currentAccount, AmountUtils$Currency.STARS, resourcesProvider);
        this.balanceCloud = balanceCloud;
        balanceCloud.setScaleX(0.6f);
        balanceCloud.setScaleY(0.6f);
        balanceCloud.setAlpha(0.0f);
        balanceCloud.setEnabled(false);
        balanceCloud.setClickable(false);
        this.container.addView(balanceCloud, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        ScaleStateListAnimator.apply(balanceCloud, 0.1f, 1.5f);
        balanceCloud.setOnClickListener(new StakedDiceSheet$$ExternalSyntheticLambda3(context, i10, resourcesProvider));
        FrameLayout frameLayout = new FrameLayout(context);
        this.bulletinContainer = frameLayout;
        this.container.addView(frameLayout, LayoutHelper.createFrame(-1, 100, 48));
        updateColors$9();
        this.adapter.update(false);
    }

    public static void access$000(AuctionBidSheet auctionBidSheet, int i) {
        auctionBidSheet.slider.setColor(HighlightMessageSheet.getTierOption(auctionBidSheet.currentAccount, i, 3), HighlightMessageSheet.getTierOption(auctionBidSheet.currentAccount, i, 4), true);
        auctionBidSheet.updateSelfBidderCell(auctionBidSheet.isOpenAnimationEnd);
        auctionBidSheet.updateSelfBidderHeader(auctionBidSheet.isOpenAnimationEnd);
        auctionBidSheet.updateButtonText$1(auctionBidSheet.isOpenAnimationEnd);
        auctionBidSheet.checkSliderSubText();
    }

    public final void checkBalanceCloudVisibility() {
        boolean z = this.isOpenAnimationEnd && !isDismissed();
        if (this.balanceCloudVisible != z) {
            this.balanceCloudVisible = z;
            BalanceCloud balanceCloud = this.balanceCloud;
            if (balanceCloud != null) {
                balanceCloud.setEnabled(z);
                balanceCloud.setClickable(z);
                OKLCH.m(balanceCloud.animate().scaleX(z ? 1.0f : 0.6f).scaleY(z ? 1.0f : 0.6f), z ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void checkSliderSubText() {
        AnonymousClass1 anonymousClass1 = this.slider;
        int value = anonymousClass1.getValue();
        if (anonymousClass1.getProgress() > 0.99f) {
            anonymousClass1.setCounterSubText(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.auction.auctionUserState;
        long j2 = tL_StarGiftAuctionUserState.bid_amount;
        if (j == j2) {
            anonymousClass1.setCounterSubText(LocaleController.getString(R.string.Gift2AuctionYourBid));
            return;
        }
        if (j2 <= 0 || tL_StarGiftAuctionUserState.returned) {
            anonymousClass1.setCounterSubText(null);
            return;
        }
        long j3 = j - j2;
        if (j3 <= 0) {
            anonymousClass1.setCounterSubText(null);
            return;
        }
        anonymousClass1.setCounterSubText("+" + LocaleController.formatNumber(j3, ','));
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new GiftSheet$$ExternalSyntheticLambda8(this, 24), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.applyBackground = false;
        return universalAdapter;
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.giftId, this);
        CountdownTimer countdownTimer = this.timer;
        countdownTimer.isRunning = false;
        AndroidUtilities.cancelRunOnUIThread(countdownTimer.doUpdate);
        super.lambda$showGiftOfferSheet$15();
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }

    public final void lambda$new$2(boolean[] zArr, Theme.ResourcesProvider resourcesProvider) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(this.currentAccount).getOrRequestAcquiredGifts(this.giftId, new ArticleViewer$$ExternalSyntheticLambda33(this, zArr, resourcesProvider, 11));
    }

    public final void lambda$sendBid$10(long j, Boolean bool, String str) {
        this.buttonView.setLoading(false);
        this.bidIsPending = false;
        FrameLayout frameLayout = this.bulletinContainer;
        if (bool != null) {
            boolean z = j > 0;
            Bulletin.TwoLineLayout twoLineLayout = new Bulletin.TwoLineLayout(getContext(), this.resourcesProvider);
            twoLineLayout.imageView.setImageResource(R.drawable.filled_gift_sell_24);
            TextView textView = twoLineLayout.titleTextView;
            textView.setText(LocaleController.getString(z ? R.string.Gift2AuctionsBidHasBeenIncreased : R.string.Gift2AuctionsBidHasBeenPlaced));
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            TextView textView2 = twoLineLayout.subtitleTextView;
            textView2.setText(LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(this.auction.gift.gifts_per_round)));
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            Drawable drawable = this.shadowDrawable;
            if (drawable != null && this.containerView != null && frameLayout != null) {
                frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
            }
            Bulletin.make(frameLayout, twoLineLayout, 2750).show();
            StarsController.getInstance(this.currentAccount, false).getBalance(false, true, null);
        }
        if (str != null) {
            Drawable drawable2 = this.shadowDrawable;
            if (drawable2 != null && this.containerView != null && frameLayout != null) {
                frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + drawable2.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
            }
            zzks.m(R.string.UnknownErrorCode, new Object[]{str}, new BulletinFactory(frameLayout, this.resourcesProvider), R.raw.error);
        }
    }

    public final void lambda$updateButtonText$9() {
        int value = this.slider.getValue();
        int minimumBid = (int) this.auction.getMinimumBid();
        if (value >= minimumBid) {
            sendBid(value);
        } else {
            AndroidUtilities.shakeView(this.buttonView);
            new BulletinFactory(this.container, this.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).show();
        }
    }

    public final void lambda$updateTable$7(long j) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if (UserObject.isService(j)) {
                return;
            }
            Bundle bundle = new Bundle();
            if (j > 0) {
                bundle.putLong("user_id", j);
                if (j == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j);
            }
            bundle.putBoolean("open_gifts", true);
            safeLastFragment.presentFragment(new ProfileActivity(bundle, null));
        }
        Runnable runnable = this.closeParentSheet;
        if (runnable != null) {
            runnable.run();
        }
        lambda$showGiftOfferSheet$15();
    }

    @Override
    public final void onContainerTranslationYChanged(float f) {
        super.onContainerTranslationYChanged(f);
        checkBalanceCloudVisibility();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.isOpenAnimationEnd = false;
        checkBalanceCloudVisibility();
        Bulletin.removeDelegate(this.container);
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.isOpenAnimationEnd = true;
        checkBalanceCloudVisibility();
        Bulletin.addDelegate(this.container, new LaunchActivity.AnonymousClass7(9));
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.auction = auction;
        updateTable(this.isOpenAnimationEnd);
    }

    public final void sendBid(int i) {
        if (this.bidIsPending) {
            return;
        }
        long j = this.auction.auctionUserState.bid_amount;
        long j2 = i;
        if (j > 0) {
            j2 -= j;
        }
        long j3 = j2;
        if (StarsController.getInstance(this.currentAccount, false).balanceLoaded && StarsController.getInstance(this.currentAccount, false).getBalance(false, false, null).amount < j3) {
            new StarsIntroActivity.StarsNeededSheet(getContext(), this.resourcesProvider, j3, 14, null, null, 0L).show();
            return;
        }
        this.bidIsPending = true;
        this.buttonView.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.giftId, this.params, i, new LaunchActivity$$ExternalSyntheticLambda149(this, j, 2));
    }

    public final void showCustomPlaceABid() {
        int i = 0;
        Context context = getContext();
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (activityFindActivity != null) {
            activityFindActivity.getCurrentFocus();
        }
        final View[] viewArr = new View[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, this.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(this.auction.gift.gifts_per_round));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, this.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        anonymousClass4.setTextSize(1, 18.0f);
        anonymousClass4.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        anonymousClass4.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, this.resourcesProvider));
        anonymousClass4.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        anonymousClass4.setFocusable(true);
        anonymousClass4.setInputType(2);
        anonymousClass4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        anonymousClass4.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, this.resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, this.resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, this.resourcesProvider));
        anonymousClass4.setImeOptions(268435462);
        anonymousClass4.setBackgroundDrawable(null);
        anonymousClass4.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        anonymousClass4.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        anonymousClass4.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                View[] viewArr2 = viewArr;
                try {
                    boolean z = ((long) Integer.parseInt(editable.toString())) >= AuctionBidSheet.this.auction.getMinimumBid();
                    viewArr2[0].animate().alpha(z ? 1.0f : 0.6f).setDuration(180L).start();
                    viewArr2[0].setEnabled(z);
                    viewArr2[0].setClickable(z);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(anonymousClass4, LayoutHelper.createLinear(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        builder.makeCustomMaxHeight();
        builder.setView(linearLayout);
        alertDialog.customWidth = AndroidUtilities.dp(300.0f);
        builder.setPositiveButton(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new DialogsActivity$$ExternalSyntheticLambda89(5, this, anonymousClass4));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new PhotoViewer$$ExternalSyntheticLambda97(4));
        AlertDialog[] alertDialogArr = {alertDialog};
        if (lastFragment != null) {
            AndroidUtilities.requestAdjustNothing(activityFindActivity, lastFragment.getClassGuid());
        }
        alertDialogArr[0].setOnDismissListener(new BotLocation$$ExternalSyntheticLambda14(anonymousClass4, lastFragment, activityFindActivity, 3));
        alertDialogArr[0].setOnShowListener(new AuctionBidSheet$$ExternalSyntheticLambda15(i, anonymousClass4));
        alertDialogArr[0].show();
        View button = alertDialogArr[0].getButton(-1);
        viewArr[0] = button;
        button.setAlpha(0.6f);
        alertDialogArr[0].dismissDialogByButtons = false;
        anonymousClass4.setSelection(anonymousClass4.getText().length());
    }

    public final void updateButtonText$1(boolean z) {
        long value = this.slider.getValue();
        long currentMyBid = this.auction.getCurrentMyBid();
        int i = 1;
        AnonymousClass2 anonymousClass2 = this.buttonView;
        if (value == currentMyBid) {
            anonymousClass2.setText(LocaleController.getString(R.string.OK), z, true);
            anonymousClass2.setOnClickListener(new AuctionBidSheet$$ExternalSyntheticLambda2(this, i));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.auction.auctionUserState;
        long j = tL_StarGiftAuctionUserState.bid_amount;
        ColoredImageSpan[] coloredImageSpanArr = this.spanRefStars;
        if (j >= value || tL_StarGiftAuctionUserState.returned) {
            anonymousClass2.setText(StarsIntroActivity.replaceStars(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), coloredImageSpanArr), z, true);
        } else {
            anonymousClass2.setText(StarsIntroActivity.replaceStars(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j, ',')), coloredImageSpanArr), z, true);
        }
        anonymousClass2.setOnClickListener(new AuctionBidSheet$$ExternalSyntheticLambda2(this, 2));
    }

    public final void updateColors$9() {
        int iBlendARGB = ColorUtils.blendARGB(this.winningColor.floatValue, ColorUtils.blendARGB(this.outbidColor.floatValue, getThemedColor(Theme.key_windowBackgroundWhiteBlueHeader), getThemedColor(Theme.key_text_RedBold)), getThemedColor(Theme.key_color_green));
        this.selfBidderHeader.setTextColor(iBlendARGB);
        AnimatedTextView animatedTextView = this.selfBidderFutureGift;
        animatedTextView.setTextColor(iBlendARGB);
        this.selfBidderCell.placeTextView.setTextColor(iBlendARGB);
        if (Theme.setSelectorDrawableColor(animatedTextView.getSizeableBackground(), Theme.multAlpha(0.15f, iBlendARGB), false)) {
            animatedTextView.invalidate();
        }
    }

    public final void updateCountdownCell(long j, boolean z) {
        ((AnimatedTextView) this.nextRoundCell.val$themeFrameLayout).setText(j >= 3600 ? AndroidUtilities.formatFullDuration((int) j) : AndroidUtilities.formatDurationNoHours((int) j, true), z, true);
    }

    public final void updateSelfBidderCell(boolean z) {
        long value = this.slider.getValue();
        int approximatedMyPlace = this.auction.getApproximatedMyPlace();
        int iApproximatePlaceFromStars = this.auction.approximatePlaceFromStars(value);
        long jMax = Math.max(value, this.auction.getCurrentMyBid());
        BidderCell bidderCell = this.selfBidderCell;
        bidderCell.bidTextView.setText(StarsIntroActivity.replaceStarsWithPlain(false, BillingController$$ExternalSyntheticOutline0.m((int) jMax, ',', new StringBuilder("⭐️")), 0.78f, bidderCell.ref), false, true);
        if (approximatedMyPlace > 0) {
            iApproximatePlaceFromStars = Math.min(approximatedMyPlace, iApproximatePlaceFromStars);
        }
        bidderCell.setPlace(iApproximatePlaceFromStars, false, z);
        GiftAuctionController.Auction auction = this.auction;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        AnimatedTextView animatedTextView = this.selfBidderFutureGift;
        if (tL_starGiftAuctionState != null && iApproximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.auction.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.auction;
            int i = auction2.auctionStateActive.last_gift_num + iApproximatePlaceFromStars;
            if (i <= auction2.gift.availability_total) {
                animatedTextView.setText(this.auction.gift.title + " #" + LocaleController.formatNumber(i, ','));
                return;
            }
        }
        animatedTextView.setText(null);
    }

    public final void updateSelfBidderHeader(boolean z) {
        boolean z2;
        GiftAuctionController.Auction.BidStatus bidStatus = this.auction.getBidStatus();
        long value = this.slider.getValue();
        long j = this.auction.auctionUserState.bid_amount;
        HeaderCell headerCell = this.selfBidderHeader;
        boolean z3 = false;
        if (value <= j) {
            z2 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID || bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                headerCell.setText(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                headerCell.setText(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z);
                z2 = false;
                z3 = true;
            } else {
                headerCell.setText(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z);
            }
            this.winningColor.setValue(z3, z);
            this.outbidColor.setValue(z2, z);
        }
        headerCell.setText(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z);
        z2 = false;
        this.winningColor.setValue(z3, z);
        this.outbidColor.setValue(z2, z);
    }

    public final void updateTable(boolean z) {
        BaseFragment lastFragment;
        int i;
        ((AnimatedTextView) this.minimumBidCell.val$themeFrameLayout).setText(StarsIntroActivity.replaceStarsWithPlain(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.auction.getMinimumBid(), ','), 0.78f, this.refS), z, true);
        if (this.auction.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean zIsUpcoming = this.auction.isUpcoming(currentTime);
            CountdownTimer countdownTimer = this.timer;
            if (zIsUpcoming) {
                long jMax = Math.max(0, this.auction.auctionStateActive.start_date - currentTime);
                countdownTimer.start(jMax);
                updateCountdownCell(jMax, z);
            } else {
                long jMax2 = Math.max(0, this.auction.auctionStateActive.next_round_at - currentTime);
                countdownTimer.start(jMax2);
                updateCountdownCell(jMax2, z);
            }
            AnimatedEmojiSpan animatedEmojiSpan = this.animatedEmojiSpan;
            IntroActivity.AnonymousClass1 anonymousClass1 = this.giftsLeftCell;
            if (animatedEmojiSpan == null && this.auction.gift.sticker != null) {
                this.animatedEmojiSpan = new AnimatedEmojiSpan(this.auction.gift.sticker.id, 1.2f, ((AnimatedTextView) anonymousClass1.val$themeFrameLayout).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.animatedEmojiSpan != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.animatedEmojiSpan, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.auction.auctionStateActive.gifts_left, ','));
            ((AnimatedTextView) anonymousClass1.val$themeFrameLayout).setText(spannableStringBuilder, z, true);
            TextView textView = (TextView) this.nextRoundCell.this$0;
            if (this.auction.isUpcoming()) {
                i = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.auction.auctionStateActive;
                i = tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds ? R.string.Gift2AuctionBidInfoUntilEndRound : R.string.Gift2AuctionBidInfoUntilNextRound;
            }
            textView.setText(LocaleController.getString(i));
            BidderCell[] bidderCellArr = this.topBidderCells;
            int iMin = Math.min(bidderCellArr.length, this.auction.auctionStateActive.top_bidders.size());
            if (iMin > 0) {
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = i2 + 1;
                    Long l = this.auction.auctionStateActive.top_bidders.get(i2);
                    long jLongValue = l.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l);
                    if (user != null) {
                        BidderCell bidderCell = bidderCellArr[i2];
                        bidderCell.getClass();
                        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
                        avatarDrawable.setInfo(UserConfig.selectedAccount, user);
                        BackupImageView backupImageView = bidderCell.backupImageView;
                        backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
                        backupImageView.onNewImageSet();
                        backupImageView.setRoundRadius(AndroidUtilities.dp(16.0f));
                        bidderCell.nameTextView.setText(UserObject.getUserName(user));
                    }
                    BidderCell bidderCell2 = bidderCellArr[i2];
                    bidderCell2.bidTextView.setText(StarsIntroActivity.replaceStarsWithPlain(false, BillingController$$ExternalSyntheticOutline0.m((int) this.auction.approximateBidAmountFromPlace(i3), ',', new StringBuilder("⭐️")), 0.78f, bidderCell2.ref), z, true);
                    bidderCellArr[i2].setOnClickListener(new GiftSheet$$ExternalSyntheticLambda1(this, jLongValue, 4));
                    i2 = i3;
                }
            }
        }
        GiftAuctionController.Auction auction = this.auction;
        long jApproximateBidAmountFromPlace = auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1;
        AnonymousClass1 anonymousClass2 = this.slider;
        anonymousClass2.setStarsTop(jApproximateBidAmountFromPlace);
        anonymousClass2.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.auction.gift.gifts_per_round, new Object[0]));
        updateSelfBidderCell(z);
        updateSelfBidderHeader(z);
        updateButtonText$1(z);
        checkSliderSubText();
        long peerDialogId = DialogObject.getPeerDialogId(this.auction.auctionUserState.peer);
        long j = this.auction.auctionUserState.acquired_count;
        if (this.lastAcquiredCount < j && !this.isFirstCheck && (lastFragment = LaunchActivity.getLastFragment()) != null) {
            long j2 = this.lastRecipientDialogId;
            if (j2 != 0) {
                ChatActivity chatActivityOf = ChatActivity.of(j2);
                chatActivityOf.whenFullyVisible(new ChatActivity$26$$ExternalSyntheticLambda2(chatActivityOf, 11));
                lastFragment.presentFragment(chatActivityOf);
                Runnable runnable = this.closeParentSheet;
                if (runnable != null) {
                    runnable.run();
                }
                lambda$showGiftOfferSheet$15();
            }
        }
        if (peerDialogId != 0) {
            this.lastRecipientDialogId = peerDialogId;
        }
        this.lastAcquiredCount = j;
        this.isFirstCheck = false;
    }
}
