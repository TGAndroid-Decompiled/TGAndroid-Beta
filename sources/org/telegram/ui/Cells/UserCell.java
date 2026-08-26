package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.android.gms.internal.mlkit_vision_common.zzld;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.google.android.gms.internal.mlkit_vision_common.zzlh;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.google.android.gms.internal.mlkit_vision_common.zzlj;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.LocationActivity;
import org.telegram.ui.ChannelCreateActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatEditActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarConstructorFragment;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.ColorPicker$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.EmojiTabsStrip;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Reactions.HwEmojis;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.GroupCreateFinalActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.web.BotWebViewContainer;

public class UserCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, Theme.Colorable {
    public final TextView addButton;
    public final TextView adminTextView;
    public final AvatarDrawable avatarDrawable;
    public final AnonymousClass2 avatarImageView;
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable botVerification;
    public boolean callCellStyle;
    public final CheckBox2 checkBox;
    public final ImageView checkBox3;
    public final CheckBoxSquare checkBoxBig;
    public ImageView closeView;
    public final int currentAccount;
    public int currentId;
    public CharSequence currentName;
    public Object currentObject;
    public CharSequence currentStatus;
    public long dialogId;
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emojiStatus;
    public final ImageView imageView;
    public boolean isCommunity;
    public TLRPC.FileLocation lastAvatar;
    public String lastName;
    public int lastStatus;
    public final SimpleTextView nameTextView;
    public boolean needDivider;
    public Drawable premiumDrawable;
    public String query;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean selfAsSavedMessages;
    public final int statusColor;
    public final int statusOnlineColor;
    public final SimpleTextView statusTextView;
    public boolean storiable;
    public final AnonymousClass1 storyParams;

    public final class AnonymousClass1 extends StoriesUtilities.AvatarStoryParams {
        public final int $r8$classId = 1;
        public final View this$0;

        public AnonymousClass1(ReactedUserHolderView reactedUserHolderView, Theme.ResourcesProvider resourcesProvider) {
            super(resourcesProvider, false);
            this.this$0 = reactedUserHolderView;
        }

        @Override
        public final void openStory(long j) {
            switch (this.$r8$classId) {
                case 0:
                    UserCell userCell = (UserCell) this.this$0;
                    userCell.getClass();
                    BaseFragment lastFragment = LaunchActivity.getLastFragment();
                    if (lastFragment != null) {
                        lastFragment.getOrCreateStoryViewer().getClass();
                        lastFragment.getOrCreateStoryViewer().open(userCell.getContext(), j, new StoriesListPlaceProvider((RecyclerListView) userCell.getParent(), false));
                    }
                    break;
                case 1:
                    ((ReactedUserHolderView) this.this$0).openStory(j);
                    break;
                default:
                    ChatAvatarContainer.AnonymousClass1 anonymousClass1 = (ChatAvatarContainer.AnonymousClass1) this.this$0;
                    anonymousClass1.val$baseFragment.getOrCreateStoryViewer().open(anonymousClass1.getContext(), j, new ColorPicker$$ExternalSyntheticLambda6(this, 19));
                    break;
            }
        }

        public AnonymousClass1(UserCell userCell) {
            super(null, false);
            this.this$0 = userCell;
        }

        public AnonymousClass1(ChatAvatarContainer.AnonymousClass1 anonymousClass1) {
            super(null, true);
            this.this$0 = anonymousClass1;
        }
    }

    public final class AnonymousClass2 extends BackupImageView {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass2(Object obj, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public ImageReceiver createImageReciever() {
            switch (this.$r8$classId) {
                case 1:
                    return new PhotoViewer.AnonymousClass11(this, this, 1);
                default:
                    return super.createImageReciever();
            }
        }

        @Override
        public void invalidate() {
            switch (this.$r8$classId) {
                case 4:
                    ChatActivity.AnonymousClass27 anonymousClass27 = ((ChannelCreateActivity) this.this$0).avatarOverlay;
                    if (anonymousClass27 != null) {
                        anonymousClass27.invalidate();
                    }
                    super.invalidate();
                    break;
                case 5:
                    ChatActivity.AnonymousClass27 anonymousClass28 = ((ChatEditActivity) this.this$0).avatarOverlay;
                    if (anonymousClass28 != null) {
                        anonymousClass28.invalidate();
                    }
                    super.invalidate();
                    break;
                case 6:
                    super.invalidate();
                    ((AvatarConstructorFragment.PreviewView) this.this$0).invalidate();
                    break;
                case 7:
                    if (!HwEmojis.grab(this)) {
                        super.invalidate();
                        ((EmojiTabsStrip.EmojiTabButton) this.this$0).updateLockImageReceiver();
                        break;
                    }
                    break;
                case 8:
                    ChatActivity.AnonymousClass27 anonymousClass29 = ((GroupCreateFinalActivity) this.this$0).avatarOverlay;
                    if (anonymousClass29 != null) {
                        anonymousClass29.invalidate();
                    }
                    super.invalidate();
                    break;
                case 9:
                    ChatActivity.AnonymousClass27 anonymousClass210 = ((LoginActivity.LoginActivityRegisterView) this.this$0).avatarOverlay;
                    if (anonymousClass210 != null) {
                        anonymousClass210.invalidate();
                    }
                    super.invalidate();
                    break;
                default:
                    super.invalidate();
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    UserCell userCell = (UserCell) this.this$0;
                    if (!userCell.storiable) {
                        super.onDraw(canvas);
                    } else {
                        userCell.storyParams.originalAvatarRect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        StoriesUtilities.drawAvatarWithStory(userCell.dialogId, canvas, this.imageReceiver, userCell.storyParams);
                    }
                    break;
                case 2:
                    SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) this.this$0;
                    float currentAlpha = sharedDocumentCell.thumbImageView.getImageReceiver().hasBitmapImage() ? 1.0f - sharedDocumentCell.thumbImageView.getImageReceiver().getCurrentAlpha() : 1.0f;
                    sharedDocumentCell.extTextView.setAlpha(currentAlpha);
                    sharedDocumentCell.placeholderImageView.setAlpha(currentAlpha);
                    super.onDraw(canvas);
                    break;
                case 3:
                    super.onDraw(canvas);
                    WallpaperCell.WallpaperView wallpaperView = (WallpaperCell.WallpaperView) this.this$0;
                    Object obj = wallpaperView.currentWallpaper;
                    boolean z = obj instanceof WallpapersListActivity.ColorWallpaper;
                    WallpaperCell wallpaperCell = WallpaperCell.this;
                    if (z || (obj instanceof WallpapersListActivity.FileWallpaper)) {
                        canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, wallpaperCell.framePaint);
                        canvas.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), wallpaperCell.framePaint);
                        canvas.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), wallpaperCell.framePaint);
                        canvas.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, wallpaperCell.framePaint);
                    }
                    if (wallpaperView.isSelected) {
                        wallpaperCell.circlePaint.setColor(Theme.serviceMessageColorBackup);
                        int measuredWidth = getMeasuredWidth() / 2;
                        int measuredHeight = getMeasuredHeight() / 2;
                        canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), wallpaperCell.circlePaint);
                        Drawable drawable = wallpaperCell.checkDrawable;
                        drawable.setBounds(zzle.m(measuredWidth, drawable), zzld.m(measuredHeight, wallpaperCell.checkDrawable), zzlh.m(measuredWidth, wallpaperCell.checkDrawable), zzlg.m(measuredHeight, wallpaperCell.checkDrawable));
                        wallpaperCell.checkDrawable.draw(canvas);
                    }
                    break;
                case 10:
                    if (this.imageReceiver.getVisible()) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        ((PeerStoriesView.PeerHeaderView) this.this$0).drawUploadingProgress(canvas, rectF, 1.0f, true);
                    }
                    super.onDraw(canvas);
                    break;
                case 11:
                    if (!((BotWebViewContainer) this.this$0).isFlickeringCenter) {
                        Drawable drawable2 = this.imageReceiver.getDrawable();
                        if (drawable2 != null) {
                            this.imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / drawable2.getIntrinsicWidth()) * drawable2.getIntrinsicHeight());
                            this.imageReceiver.draw(canvas);
                        }
                    } else {
                        super.onDraw(canvas);
                    }
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 1:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(240.0f), 1073741824));
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    if (((UserCell) this.this$0).storyParams.checkOnTouchEvent(motionEvent, this)) {
                        return true;
                    }
                    return super.onTouchEvent(motionEvent);
                default:
                    return super.onTouchEvent(motionEvent);
            }
        }

        @Override
        public boolean verifyDrawable(Drawable drawable) {
            switch (this.$r8$classId) {
                case 1:
                    return drawable == ((LocationActivity) this.this$0).mapLoadingDrawable || super.verifyDrawable(drawable);
                default:
                    return super.verifyDrawable(drawable);
            }
        }

        public AnonymousClass2(BotWebViewContainer botWebViewContainer, Context context) {
            super(context);
            this.$r8$classId = 11;
            this.this$0 = botWebViewContainer;
            this.imageReceiver = new PhotoViewer.AnonymousClass11(this, this, 6);
        }

        @Override
        public void invalidate(Rect rect) {
            switch (this.$r8$classId) {
                case 6:
                    super.invalidate(rect);
                    ((AvatarConstructorFragment.PreviewView) this.this$0).invalidate();
                    break;
                default:
                    super.invalidate(rect);
                    break;
            }
        }

        @Override
        public void invalidate(int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 4:
                    ChatActivity.AnonymousClass27 anonymousClass27 = ((ChannelCreateActivity) this.this$0).avatarOverlay;
                    if (anonymousClass27 != null) {
                        anonymousClass27.invalidate();
                    }
                    super.invalidate(i, i2, i3, i4);
                    break;
                case 5:
                    ChatActivity.AnonymousClass27 anonymousClass28 = ((ChatEditActivity) this.this$0).avatarOverlay;
                    if (anonymousClass28 != null) {
                        anonymousClass28.invalidate();
                    }
                    super.invalidate(i, i2, i3, i4);
                    break;
                case 6:
                    super.invalidate(i, i2, i3, i4);
                    ((AvatarConstructorFragment.PreviewView) this.this$0).invalidate();
                    break;
                case 7:
                    if (!HwEmojis.grab(this)) {
                        super.invalidate(i, i2, i3, i4);
                        break;
                    }
                    break;
                case 8:
                    ChatActivity.AnonymousClass27 anonymousClass29 = ((GroupCreateFinalActivity) this.this$0).avatarOverlay;
                    if (anonymousClass29 != null) {
                        anonymousClass29.invalidate();
                    }
                    super.invalidate(i, i2, i3, i4);
                    break;
                case 9:
                    ChatActivity.AnonymousClass27 anonymousClass210 = ((LoginActivity.LoginActivityRegisterView) this.this$0).avatarOverlay;
                    if (anonymousClass210 != null) {
                        anonymousClass210.invalidate();
                    }
                    super.invalidate(i, i2, i3, i4);
                    break;
                default:
                    super.invalidate(i, i2, i3, i4);
                    break;
            }
        }
    }

    public final class AnonymousClass3 extends AnimatedEmojiDrawable.WrapSizeDrawable {
        @Override
        public final void draw(Canvas canvas) {
            canvas.save();
            canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
            super.draw(canvas);
            canvas.restore();
        }
    }

    public UserCell(int i, int i2, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
        int iCeil;
        int i3;
        int i4;
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.storyParams = new AnonymousClass1(this);
        this.resourcesProvider = resourcesProvider;
        int i5 = 0;
        if (z2) {
            TextView textView = new TextView(context);
            this.addButton = textView;
            textView.setGravity(17);
            zzlj.m(Theme.key_featuredStickers_buttonText, resourcesProvider, textView, 14.0f);
            textView.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{14.0f}, Theme.key_featuredStickers_addButton));
            textView.setPadding(zzlm.m(17.0f, R.string.Add, textView), 0, AndroidUtilities.dp(17.0f), 0);
            boolean z3 = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(-2, 28.0f, (z3 ? 3 : 5) | 48, z3 ? 14.0f : 0.0f, 15.0f, z3 ? 0.0f : 14.0f, 0.0f));
            iCeil = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f)) / AndroidUtilities.density);
        } else {
            iCeil = 0;
        }
        this.statusColor = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider);
        this.statusOnlineColor = Theme.getColor(Theme.key_telegram_color_text, resourcesProvider);
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, context, i5);
        this.avatarImageView = anonymousClass2;
        anonymousClass2.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z4 = LocaleController.isRTL;
        addView(anonymousClass2, LayoutHelper.createFrame(46, 46.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : i + 7, 6.0f, z4 ? i + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.nameTextView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setTextSize(16);
        simpleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z5 = LocaleController.isRTL;
        int i6 = (z5 ? 5 : 3) | 48;
        if (z5) {
            i3 = (i2 == 2 ? 18 : 0) + 28 + iCeil;
        } else {
            i3 = i + 64;
        }
        float f = i3;
        if (z5) {
            i4 = i + 64;
        } else {
            i4 = (i2 != 2 ? 0 : 18) + 28 + iCeil;
        }
        addView(simpleTextView, LayoutHelper.createFrame(-1, 20.0f, i6, f, 10.0f, i4, 0.0f));
        this.botVerification = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(simpleTextView, false, AndroidUtilities.dp(20.0f), 7);
        this.emojiStatus = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(simpleTextView, false, AndroidUtilities.dp(20.0f), 7);
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.statusTextView = simpleTextView2;
        simpleTextView2.setTextSize(15);
        simpleTextView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z6 = LocaleController.isRTL;
        addView(simpleTextView2, LayoutHelper.createFrame(-1, 20.0f, (z6 ? 5 : 3) | 48, z6 ? iCeil + 28 : i + 64, 32.0f, z6 ? i + 64 : iCeil + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        imageView.setVisibility(8);
        boolean z7 = LocaleController.isRTL;
        addView(imageView, LayoutHelper.createFrame(-2, -2.0f, (z7 ? 5 : 3) | 16, z7 ? 0.0f : 16.0f, 0.0f, z7 ? 16.0f : 0.0f, 0.0f));
        if (i2 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.checkBoxBig = checkBoxSquare;
            boolean z8 = LocaleController.isRTL;
            addView(checkBoxSquare, LayoutHelper.createFrame(18, 18.0f, (z8 ? 3 : 5) | 16, z8 ? 19.0f : 0.0f, 0.0f, z8 ? 0.0f : 19.0f, 0.0f));
        } else if (i2 == 1) {
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            checkBox2.checkBoxBase.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            boolean z9 = LocaleController.isRTL;
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : i + 24, 36.0f, z9 ? i + 24 : 0.0f, 0.0f));
        } else if (i2 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.checkBox3 = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), mode));
            imageView2.setVisibility(8);
            boolean z10 = LocaleController.isRTL;
            addView(imageView2, LayoutHelper.createFrame(24, 24.0f, (z10 ? 3 : 5) | 16, z10 ? i + 10 : 0.0f, 0.0f, z10 ? 0.0f : i + 10, 0.0f));
        }
        if (z) {
            TextView textView2 = new TextView(context);
            this.adminTextView = textView2;
            ScaleStateListAnimator.apply(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(Theme.key_profile_creatorIcon, resourcesProvider));
            textView2.setImportantForAccessibility(2);
            boolean z11 = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z11 ? 3 : 5) | 48, z11 ? 23.0f : 0.0f, 10.0f, z11 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            this.nameTextView.invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.isCommunity && view == this.avatarImageView) {
            DrawableUtils.drawCommunityCardDrawable(canvas, Theme.dialogs_communityCardsDrawable, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j);
    }

    public int[] getColorKeys() {
        return null;
    }

    public Object getCurrentObject() {
        return this.currentObject;
    }

    public long getDialogId() {
        return this.dialogId;
    }

    public CharSequence getName() {
        return this.nameTextView.getText();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        CheckBoxSquare checkBoxSquare = this.checkBoxBig;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.emojiStatus.attach();
        this.botVerification.attach();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.emojiStatus.detach();
        this.botVerification.detach();
        this.storyParams.reset();
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.checkBoxBig;
        if (checkBoxSquare == null || checkBoxSquare.getVisibility() != 0) {
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2 != null && checkBox2.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(checkBox2.checkBoxBase.isChecked);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        } else {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.isChecked);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
        StringBuilder sb = new StringBuilder();
        SimpleTextView simpleTextView = this.nameTextView;
        if (simpleTextView != null) {
            CharSequence text = simpleTextView.getText();
            if (!TextUtils.isEmpty(text)) {
                sb.append(text);
            }
        }
        TextView textView = this.adminTextView;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(text2);
            }
        }
        SimpleTextView simpleTextView2 = this.statusTextView;
        if (simpleTextView2 != null) {
            CharSequence text3 = simpleTextView2.getText();
            if (!TextUtils.isEmpty(text3)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(text3);
            }
        }
        if (sb.length() > 0) {
            accessibilityNodeInfo.setContentDescription(sb);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.callCellStyle ? 56.0f : 58.0f) + (this.needDivider ? 1 : 0), 1073741824));
    }

    public void setAddButtonVisible(boolean z) {
        TextView textView = this.addButton;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z ? 0 : 8);
    }

    public final void setAdminRole(String str, boolean z, boolean z2, boolean z3, View.OnClickListener onClickListener) {
        int color;
        TextView textView = this.adminTextView;
        if (textView == null) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (z2) {
            color = Theme.getColor(Theme.key_chat_tagCreator, resourcesProvider);
        } else if (z) {
            color = Theme.getColor(Theme.key_chat_tagAdmin, resourcesProvider);
        } else {
            color = (z3 && TextUtils.isEmpty(str)) ? Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider) : Theme.getColor(Theme.key_chat_inAdminText, resourcesProvider);
        }
        textView.setTextColor(color);
        if (z || z2) {
            textView.setText(str);
            textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
            textView.setTranslationX(AndroidUtilities.dp(6.0f));
            textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(32.0f), Theme.multAlpha(0.12f, color)));
            textView.setOnClickListener(onClickListener);
        } else if (z3 && TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.AddTag));
            textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
            textView.setTranslationX(AndroidUtilities.dp(6.0f));
            textView.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(0.12f, color), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f)));
            textView.setOnClickListener(onClickListener);
        } else {
            textView.setText(str);
            textView.setPadding(0, 0, 0, 0);
            textView.setTranslationX(0.0f);
            textView.setBackground(null);
            textView.setOnClickListener(onClickListener);
        }
        textView.setVisibility((str != null || z3) ? 0 : 8);
        if (str == null && !z3) {
            setRightPadding(0, false);
        } else {
            CharSequence text = textView.getText();
            setRightPadding((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
        }
    }

    public void setAvatarPadding(int i) {
        setAvatarPadding(i, 0);
    }

    public void setCallCellStyle(int i) {
        this.callCellStyle = true;
        SimpleTextView simpleTextView = this.nameTextView;
        simpleTextView.setTextSize(15);
        boolean z = LocaleController.isRTL;
        simpleTextView.setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, (z ? 5 : 3) | 48, z ? 30.0f : i + 66, 10.0f, z ? i + 66 : 30.0f, 0.0f));
        SimpleTextView simpleTextView2 = this.statusTextView;
        simpleTextView2.setTextSize(13);
        boolean z2 = LocaleController.isRTL;
        simpleTextView2.setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 30.0f : i + 66, 32.0f, z2 ? i + 66 : 30.0f, 0.0f));
        int iDp = AndroidUtilities.dp(22.0f);
        AnonymousClass2 anonymousClass2 = this.avatarImageView;
        anonymousClass2.setRoundRadius(iDp);
        boolean z3 = LocaleController.isRTL;
        anonymousClass2.setLayoutParams(LayoutHelper.createFrame(44, 44.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : i + 8, 6.0f, z3 ? i + 8 : 0.0f, 0.0f));
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            boolean z4 = LocaleController.isRTL;
            checkBox2.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : i + 37, 32.0f, z4 ? i + 37 : 0.0f, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z) {
        CheckBoxSquare checkBoxSquare = this.checkBoxBig;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z);
        }
    }

    public final void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            if (checkBox2.getVisibility() != 0) {
                checkBox2.setVisibility(0);
            }
            checkBox2.checkBoxBase.setChecked(-1, z, z2);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.checkBoxBig;
        if (checkBoxSquare != null) {
            if (checkBoxSquare.getVisibility() != 0) {
                checkBoxSquare.setVisibility(0);
            }
            checkBoxSquare.setChecked(z, z2);
        } else {
            ImageView imageView = this.checkBox3;
            if (imageView != null) {
                imageView.setVisibility(z ? 0 : 8);
            }
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            ImageView imageView = this.closeView;
            if (imageView != null) {
                removeView(imageView);
                this.closeView = null;
                return;
            }
            return;
        }
        if (this.closeView == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.closeView = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            ScaleStateListAnimator.apply(this.closeView, 0.1f, 1.5f);
            this.closeView.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.closeView;
            int i = Theme.key_windowBackgroundWhiteGrayText3;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.closeView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 5, -1));
            ImageView imageView4 = this.closeView;
            boolean z = LocaleController.isRTL;
            addView(imageView4, LayoutHelper.createFrame(30, 30.0f, (z ? 3 : 5) | 16, z ? 14.0f : 0.0f, 0.0f, z ? 0.0f : 14.0f, 0.0f));
        }
        this.closeView.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i) {
        this.currentId = i;
    }

    public final void setData(TLRPC.User user, boolean z) {
        setData(user, null, null, z);
    }

    public final void setException(NotificationsSettingsActivity.NotificationException notificationException, CharSequence charSequence, boolean z) {
        String string;
        Object user;
        boolean z2 = true;
        boolean z3 = notificationException.story;
        int i = this.currentAccount;
        if (z3) {
            int i2 = notificationException.notify;
            if (i2 > 0 || !notificationException.auto) {
                string = i2 <= 0 ? LocaleController.getString(R.string.NotificationEnabled) : LocaleController.getString(R.string.NotificationDisabled);
            } else {
                string = LocaleController.getString(R.string.NotificationEnabledAutomatically);
            }
        } else {
            boolean z4 = notificationException.hasCustom;
            int i3 = notificationException.notify;
            int i4 = notificationException.muteUntil;
            if (i3 != 3 || i4 == Integer.MAX_VALUE) {
                if (i3 != 0 && i3 != 1) {
                    z2 = false;
                }
                if (z2 && z4) {
                    string = LocaleController.getString(R.string.NotificationsCustom);
                } else {
                    string = LocaleController.getString(z2 ? R.string.NotificationsUnmuted : R.string.NotificationsMuted);
                }
            } else {
                int currentTime = i4 - ConnectionsManager.getInstance(i).getCurrentTime();
                if (currentTime <= 0) {
                    string = z4 ? LocaleController.getString(R.string.NotificationsCustom) : LocaleController.getString(R.string.NotificationsUnmuted);
                } else if (currentTime < 3600) {
                    string = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]));
                } else if (currentTime < 86400) {
                    string = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Hours", (int) Math.ceil((currentTime / 60.0f) / 60.0f), new Object[0]));
                } else {
                    string = currentTime < 31536000 ? LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Days", (int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), new Object[0])) : null;
                }
            }
            if (string == null) {
                string = LocaleController.getString(R.string.NotificationsOff);
            }
            if (notificationException.auto) {
                string = zzhr.m(string, ", Auto");
            }
        }
        if (DialogObject.isEncryptedDialog(notificationException.did)) {
            TLRPC.EncryptedChat encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(MessagesController.getInstance(i), notificationException.did);
            if (encryptedChatM == null || (user = MessagesController.getInstance(i).getUser(Long.valueOf(encryptedChatM.user_id))) == null) {
                return;
            }
            setData(user, charSequence, string, false);
            return;
        }
        if (DialogObject.isUserDialog(notificationException.did)) {
            Object user2 = MessagesController.getInstance(i).getUser(Long.valueOf(notificationException.did));
            if (user2 != null) {
                setData(user2, charSequence, string, z);
                return;
            }
            return;
        }
        Object chat = MessagesController.getInstance(i).getChat(Long.valueOf(-notificationException.did));
        if (chat != null) {
            setData(chat, charSequence, string, z);
        }
    }

    public final void setFromUItem(int i, UItem uItem, boolean z) {
        CharSequence string;
        CharSequence string2;
        long j = uItem.dialogId;
        if (j <= 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
            if (chat != null) {
                if (chat.participants_count != 0) {
                    string = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count);
                } else if (ChatObject.isPublic(chat)) {
                    string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic);
                } else {
                    string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate);
                }
                setData(chat, null, string, z);
                return;
            }
            return;
        }
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
        String publicUsername = UserObject.getPublicUsername(user);
        if (user != null) {
            if (!TextUtils.isEmpty(publicUsername)) {
                string2 = zzil.m("@", publicUsername);
            } else if (user.bot) {
                string2 = LocaleController.getString(R.string.Bot);
            } else {
                string2 = user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact);
            }
            setData(user, null, string2, z);
        }
    }

    public void setNameTypeface(Typeface typeface) {
        this.nameTextView.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.query = str;
        update(0);
    }

    public final void setRightPadding(int i, boolean z) {
        if (i > 0) {
            i += AndroidUtilities.dp(6.0f);
        }
        SimpleTextView simpleTextView = this.nameTextView;
        boolean z2 = LocaleController.isRTL;
        simpleTextView.setPadding(z2 ? i : 0, 0, !z2 ? i : 0, 0);
        if (z) {
            SimpleTextView simpleTextView2 = this.statusTextView;
            boolean z3 = LocaleController.isRTL;
            int i2 = z3 ? i : 0;
            if (z3) {
                i = 0;
            }
            simpleTextView2.setPadding(i2, 0, i, 0);
        }
    }

    public void setSelfAsSavedMessages(boolean z) {
        this.selfAsSavedMessages = z;
    }

    public final void update(int i) {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.FileLocation fileLocation;
        long j;
        String strRemoveRTL;
        AvatarDrawable avatarDrawable;
        AvatarDrawable avatarDrawable2;
        CharSequence charSequenceReplaceEmoji;
        Theme.ResourcesProvider resourcesProvider;
        CharSequence charSequenceReplaceEmoji2;
        String str;
        boolean z;
        String strRemoveRTL2;
        long botVerificationIcon;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        CharSequence charSequence;
        int i2;
        Theme.ResourcesProvider resourcesProvider2;
        float f;
        int i3;
        TLRPC.UserStatus userStatus;
        TextView textView;
        ImageView imageView;
        int iDp;
        CharSequence charSequenceHighlightText;
        String str2;
        String str3;
        boolean z2;
        boolean z3;
        TLRPC.UserStatus userStatus2;
        int i4;
        this.dialogId = 0L;
        this.isCommunity = false;
        Object obj = this.currentObject;
        if (obj instanceof TLRPC.User) {
            user = (TLRPC.User) obj;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation2 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            this.dialogId = user.id;
            fileLocation = fileLocation2;
            chat = null;
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat2 = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat2.photo;
            TLRPC.FileLocation fileLocation3 = chatPhoto != null ? chatPhoto.photo_small : null;
            this.dialogId = chat2.id;
            this.isCommunity = ChatObject.isCommunity(chat2);
            fileLocation = fileLocation3;
            chat = chat2;
            user = null;
        } else {
            user = null;
            chat = null;
            fileLocation = null;
        }
        if (i != 0) {
            if ((i & MessagesController.UPDATE_MASK_AVATAR) != 0) {
                j = 0;
                TLRPC.FileLocation fileLocation4 = this.lastAvatar;
                if ((fileLocation4 != null && fileLocation == null) || ((fileLocation4 == null && fileLocation != null) || (fileLocation4 != null && (fileLocation4.volume_id != fileLocation.volume_id || fileLocation4.local_id != fileLocation.local_id)))) {
                    z3 = true;
                }
                if (user != null && !z3 && (i & MessagesController.UPDATE_MASK_STATUS) != 0) {
                    userStatus2 = user.status;
                    if (userStatus2 != null) {
                        i4 = userStatus2.expires;
                    } else {
                        i4 = 0;
                    }
                    if (i4 != this.lastStatus) {
                        z3 = true;
                    }
                }
                if (!z3 || this.currentName != null || this.lastName == null || (i & MessagesController.UPDATE_MASK_NAME) == 0) {
                    strRemoveRTL = null;
                } else {
                    if (user != null) {
                        strRemoveRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user)));
                    } else {
                        strRemoveRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title));
                    }
                    if (!strRemoveRTL.equals(this.lastName)) {
                        z3 = true;
                    }
                }
                if (!z3) {
                    return;
                }
            } else {
                j = 0;
            }
            z3 = false;
            if (user != null) {
                userStatus2 = user.status;
                if (userStatus2 != null) {
                    i4 = userStatus2.expires;
                } else {
                    i4 = 0;
                }
                if (i4 != this.lastStatus) {
                    z3 = true;
                }
            }
            if (z3) {
                strRemoveRTL = null;
            } else {
                strRemoveRTL = null;
            }
            if (!z3) {
                return;
            }
        } else {
            j = 0;
            strRemoveRTL = null;
        }
        boolean z4 = this.currentObject instanceof String;
        AnonymousClass2 anonymousClass2 = this.avatarImageView;
        int i5 = this.currentAccount;
        SimpleTextView simpleTextView = this.statusTextView;
        SimpleTextView simpleTextView2 = this.nameTextView;
        AvatarDrawable avatarDrawable3 = this.avatarDrawable;
        if (z4) {
            ((FrameLayout.LayoutParams) simpleTextView2.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
            String str4 = (String) this.currentObject;
            str4.getClass();
            switch (str4) {
                case "archived":
                    avatarDrawable3.setAvatarType(11);
                    break;
                case "groups":
                    avatarDrawable3.setAvatarType(6);
                    break;
                case "non_contacts":
                    avatarDrawable3.setAvatarType(5);
                    break;
                case "contacts":
                    avatarDrawable3.setAvatarType(4);
                    break;
                case "new_chats":
                    avatarDrawable3.setAvatarType(24);
                    break;
                case "bots":
                    avatarDrawable3.setAvatarType(8);
                    break;
                case "read":
                    avatarDrawable3.setAvatarType(10);
                    break;
                case "muted":
                    avatarDrawable3.setAvatarType(9);
                    break;
                case "existing_chats":
                    avatarDrawable3.setAvatarType(23);
                    break;
                case "channels":
                    avatarDrawable3.setAvatarType(7);
                    break;
            }
            anonymousClass2.setImage(null, "50_50", avatarDrawable3);
            this.currentStatus = "";
        } else {
            ((FrameLayout.LayoutParams) simpleTextView2.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            if (user == null) {
                if (chat != null) {
                    avatarDrawable3.setInfo(i5, chat);
                } else {
                    CharSequence charSequence2 = this.currentName;
                    if (charSequence2 != null) {
                        avatarDrawable = avatarDrawable3;
                        avatarDrawable.setInfo(this.currentId, charSequence2.toString(), null, null, null);
                    } else {
                        avatarDrawable = avatarDrawable3;
                        avatarDrawable.setInfo(this.currentId, "#", null, null, null);
                    }
                    avatarDrawable2 = avatarDrawable;
                }
                charSequenceReplaceEmoji = this.currentName;
                resourcesProvider = this.resourcesProvider;
                if (charSequenceReplaceEmoji != null) {
                    this.lastName = null;
                    str3 = this.query;
                    if (str3 != null) {
                        charSequenceReplaceEmoji = AndroidUtilities.highlightText(charSequenceReplaceEmoji, str3, resourcesProvider);
                    }
                    if (charSequenceReplaceEmoji != null) {
                        try {
                            z2 = false;
                            try {
                                charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceReplaceEmoji, simpleTextView2.getPaint().getFontMetricsInt(), false);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    simpleTextView2.setText(charSequenceReplaceEmoji, z2);
                } else {
                    if (user != null) {
                        if (strRemoveRTL == null) {
                            strRemoveRTL2 = UserObject.getUserName(user);
                        } else {
                            strRemoveRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(strRemoveRTL));
                        }
                        this.lastName = strRemoveRTL2;
                    } else if (chat != null) {
                        if (strRemoveRTL == null) {
                            strRemoveRTL = chat.title;
                        }
                        this.lastName = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(strRemoveRTL));
                    } else {
                        this.lastName = "";
                    }
                    charSequenceReplaceEmoji2 = this.lastName;
                    str = this.query;
                    if (str != null) {
                        charSequenceReplaceEmoji2 = AndroidUtilities.highlightText(charSequenceReplaceEmoji2, str, resourcesProvider);
                    }
                    if (charSequenceReplaceEmoji2 != null) {
                        try {
                            z = false;
                            try {
                                charSequenceReplaceEmoji2 = Emoji.replaceEmoji(charSequenceReplaceEmoji2, simpleTextView2.getPaint().getFontMetricsInt(), false);
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    simpleTextView2.setText(charSequenceReplaceEmoji2, z);
                }
                if (user != null) {
                    botVerificationIcon = DialogObject.getBotVerificationIcon(user);
                } else if (chat != null) {
                    botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
                } else {
                    botVerificationIcon = j;
                }
                swapAnimatedEmojiDrawable = this.botVerification;
                if (botVerificationIcon == j) {
                    swapAnimatedEmojiDrawable.set((Drawable) null, false);
                    simpleTextView2.setLeftDrawable((Drawable) null);
                } else {
                    swapAnimatedEmojiDrawable.set(botVerificationIcon, false);
                    zzli.m(Theme.key_chats_verifiedBackground, resourcesProvider, swapAnimatedEmojiDrawable);
                    simpleTextView2.setLeftDrawable(swapAnimatedEmojiDrawable);
                }
                if (user == null && MessagesController.getInstance(i5).isPremiumUser(user) && !MessagesController.getInstance(i5).premiumFeaturesBlocked()) {
                    if (DialogObject.getEmojiStatusDocumentId(user.emoji_status) != j) {
                        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.emojiStatus;
                        swapAnimatedEmojiDrawable2.set(DialogObject.getEmojiStatusDocumentId(user.emoji_status), false);
                        zzli.m(Theme.key_chats_verifiedBackground, resourcesProvider, swapAnimatedEmojiDrawable2);
                        simpleTextView2.setRightDrawable(swapAnimatedEmojiDrawable2);
                    } else {
                        if (this.premiumDrawable == null) {
                            this.premiumDrawable = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.premiumDrawable);
                            this.premiumDrawable = anonymousClass3;
                            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_verifiedBackground, resourcesProvider), PorterDuff.Mode.MULTIPLY);
                            Drawable drawable = anonymousClass3.drawable;
                            if (drawable != null) {
                                drawable.setColorFilter(porterDuffColorFilter);
                            }
                        }
                        simpleTextView2.setRightDrawable(this.premiumDrawable);
                    }
                    simpleTextView2.setRightDrawableTopPadding(-AndroidUtilities.dp(0.5f));
                } else {
                    simpleTextView2.setRightDrawable((Drawable) null);
                    simpleTextView2.setRightDrawableTopPadding(0);
                }
                charSequence = this.currentStatus;
                i2 = this.statusColor;
                if (charSequence != null) {
                    if (user != null) {
                        resourcesProvider2 = resourcesProvider;
                        f = 14.0f;
                        i3 = 0;
                    } else if (user.bot) {
                        simpleTextView.setTextColor(i2);
                        if (!user.bot_chat_history || ((textView = this.adminTextView) != null && textView.getVisibility() == 0)) {
                            i3 = 0;
                            simpleTextView.setText(LocaleController.getString(R.string.BotStatusRead), false);
                        } else {
                            i3 = 0;
                            simpleTextView.setText(LocaleController.getString(R.string.BotStatusCantRead), false);
                        }
                    } else {
                        f = 14.0f;
                        if (user.id != UserConfig.getInstance(i5).getClientUserId() || ((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i5).getCurrentTime())) {
                            resourcesProvider2 = resourcesProvider;
                        } else {
                            resourcesProvider2 = resourcesProvider;
                            if (!MessagesController.getInstance(i5).onlinePrivacy.containsKey(Long.valueOf(user.id))) {
                                simpleTextView.setTextColor(i2);
                                i3 = 0;
                                simpleTextView.setText(LocaleController.formatUserStatus(i5, user), false);
                            }
                        }
                        i3 = 0;
                        simpleTextView.setTextColor(this.statusOnlineColor);
                        simpleTextView.setText(LocaleController.getString(R.string.Online), false);
                    }
                    imageView = this.imageView;
                    if (imageView.getVisibility() == 0) {
                        imageView.setVisibility(8);
                        imageView.setImageResource(i3);
                    } else {
                        imageView.getVisibility();
                    }
                    this.lastAvatar = fileLocation;
                    if (user != null) {
                        anonymousClass2.imageReceiver.setForUserOrChat(user, avatarDrawable2);
                        anonymousClass2.onNewImageSet();
                    } else if (chat != null) {
                        anonymousClass2.imageReceiver.setForUserOrChat(chat, avatarDrawable2);
                        anonymousClass2.onNewImageSet();
                    } else {
                        anonymousClass2.setImageDrawable(avatarDrawable2);
                    }
                    if (this.isCommunity) {
                        iDp = AndroidUtilities.dp(12.777778f);
                    } else if (chat == null && chat.forum) {
                        iDp = AndroidUtilities.dp(f);
                    } else {
                        iDp = AndroidUtilities.dp(24.0f);
                    }
                    anonymousClass2.setRoundRadius(iDp);
                    simpleTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider2));
                }
                simpleTextView.setTextColor(i2);
                charSequenceHighlightText = this.currentStatus;
                str2 = this.query;
                if (str2 != null) {
                    charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceHighlightText, str2, resourcesProvider);
                }
                i3 = 0;
                simpleTextView.setText(charSequenceHighlightText, false);
                resourcesProvider2 = resourcesProvider;
                f = 14.0f;
                imageView = this.imageView;
                if (imageView.getVisibility() == 0) {
                    imageView.setVisibility(8);
                    imageView.setImageResource(i3);
                } else {
                    imageView.getVisibility();
                }
                this.lastAvatar = fileLocation;
                if (user != null) {
                    anonymousClass2.imageReceiver.setForUserOrChat(user, avatarDrawable2);
                    anonymousClass2.onNewImageSet();
                } else if (chat != null) {
                    anonymousClass2.imageReceiver.setForUserOrChat(chat, avatarDrawable2);
                    anonymousClass2.onNewImageSet();
                } else {
                    anonymousClass2.setImageDrawable(avatarDrawable2);
                }
                if (this.isCommunity) {
                    iDp = AndroidUtilities.dp(12.777778f);
                } else if (chat == null) {
                    iDp = AndroidUtilities.dp(24.0f);
                } else {
                    iDp = AndroidUtilities.dp(24.0f);
                }
                anonymousClass2.setRoundRadius(iDp);
                simpleTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider2));
            }
            if (this.selfAsSavedMessages && UserObject.isUserSelf(user)) {
                simpleTextView2.setText(LocaleController.getString(R.string.SavedMessages), true);
                simpleTextView.setText(null, false);
                avatarDrawable3.setAvatarType(1);
                anonymousClass2.setImage(null, "50_50", avatarDrawable3, user);
                ((FrameLayout.LayoutParams) simpleTextView2.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
                return;
            }
            avatarDrawable3.setInfo(i5, user);
            TLRPC.UserStatus userStatus3 = user.status;
            if (userStatus3 != null) {
                this.lastStatus = userStatus3.expires;
            } else {
                this.lastStatus = 0;
            }
        }
        avatarDrawable2 = avatarDrawable3;
        charSequenceReplaceEmoji = this.currentName;
        resourcesProvider = this.resourcesProvider;
        if (charSequenceReplaceEmoji != null) {
            this.lastName = null;
            str3 = this.query;
            if (str3 != null) {
                charSequenceReplaceEmoji = AndroidUtilities.highlightText(charSequenceReplaceEmoji, str3, resourcesProvider);
            }
            if (charSequenceReplaceEmoji != null) {
                z2 = false;
                charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceReplaceEmoji, simpleTextView2.getPaint().getFontMetricsInt(), false);
            } else {
                z2 = false;
            }
            simpleTextView2.setText(charSequenceReplaceEmoji, z2);
        } else {
            if (user != null) {
                if (strRemoveRTL == null) {
                    strRemoveRTL2 = UserObject.getUserName(user);
                } else {
                    strRemoveRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(strRemoveRTL));
                }
                this.lastName = strRemoveRTL2;
            } else if (chat != null) {
                if (strRemoveRTL == null) {
                    strRemoveRTL = chat.title;
                }
                this.lastName = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(strRemoveRTL));
            } else {
                this.lastName = "";
            }
            charSequenceReplaceEmoji2 = this.lastName;
            str = this.query;
            if (str != null) {
                charSequenceReplaceEmoji2 = AndroidUtilities.highlightText(charSequenceReplaceEmoji2, str, resourcesProvider);
            }
            if (charSequenceReplaceEmoji2 != null) {
                z = false;
                charSequenceReplaceEmoji2 = Emoji.replaceEmoji(charSequenceReplaceEmoji2, simpleTextView2.getPaint().getFontMetricsInt(), false);
            } else {
                z = false;
            }
            simpleTextView2.setText(charSequenceReplaceEmoji2, z);
        }
        if (user != null) {
            botVerificationIcon = DialogObject.getBotVerificationIcon(user);
        } else if (chat != null) {
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
        } else {
            botVerificationIcon = j;
        }
        swapAnimatedEmojiDrawable = this.botVerification;
        if (botVerificationIcon == j) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
            simpleTextView2.setLeftDrawable((Drawable) null);
        } else {
            swapAnimatedEmojiDrawable.set(botVerificationIcon, false);
            zzli.m(Theme.key_chats_verifiedBackground, resourcesProvider, swapAnimatedEmojiDrawable);
            simpleTextView2.setLeftDrawable(swapAnimatedEmojiDrawable);
        }
        if (user == null) {
            simpleTextView2.setRightDrawable((Drawable) null);
            simpleTextView2.setRightDrawableTopPadding(0);
        } else {
            simpleTextView2.setRightDrawable((Drawable) null);
            simpleTextView2.setRightDrawableTopPadding(0);
        }
        charSequence = this.currentStatus;
        i2 = this.statusColor;
        if (charSequence != null) {
            if (user != null) {
                resourcesProvider2 = resourcesProvider;
                f = 14.0f;
                i3 = 0;
            } else if (user.bot) {
                simpleTextView.setTextColor(i2);
                if (user.bot_chat_history) {
                    i3 = 0;
                    simpleTextView.setText(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    i3 = 0;
                    simpleTextView.setText(LocaleController.getString(R.string.BotStatusRead), false);
                }
            } else {
                f = 14.0f;
                if (user.id != UserConfig.getInstance(i5).getClientUserId()) {
                    resourcesProvider2 = resourcesProvider;
                    i3 = 0;
                    simpleTextView.setTextColor(this.statusOnlineColor);
                    simpleTextView.setText(LocaleController.getString(R.string.Online), false);
                } else {
                    resourcesProvider2 = resourcesProvider;
                    i3 = 0;
                    simpleTextView.setTextColor(this.statusOnlineColor);
                    simpleTextView.setText(LocaleController.getString(R.string.Online), false);
                }
            }
            imageView = this.imageView;
            if (imageView.getVisibility() == 0) {
                imageView.setVisibility(8);
                imageView.setImageResource(i3);
            } else {
                imageView.getVisibility();
            }
            this.lastAvatar = fileLocation;
            if (user != null) {
                anonymousClass2.imageReceiver.setForUserOrChat(user, avatarDrawable2);
                anonymousClass2.onNewImageSet();
            } else if (chat != null) {
                anonymousClass2.imageReceiver.setForUserOrChat(chat, avatarDrawable2);
                anonymousClass2.onNewImageSet();
            } else {
                anonymousClass2.setImageDrawable(avatarDrawable2);
            }
            if (this.isCommunity) {
                iDp = AndroidUtilities.dp(12.777778f);
            } else if (chat == null) {
                iDp = AndroidUtilities.dp(24.0f);
            } else {
                iDp = AndroidUtilities.dp(24.0f);
            }
            anonymousClass2.setRoundRadius(iDp);
            simpleTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider2));
        }
        simpleTextView.setTextColor(i2);
        charSequenceHighlightText = this.currentStatus;
        str2 = this.query;
        if (str2 != null) {
            charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceHighlightText, str2, resourcesProvider);
        }
        i3 = 0;
        simpleTextView.setText(charSequenceHighlightText, false);
        resourcesProvider2 = resourcesProvider;
        f = 14.0f;
        imageView = this.imageView;
        if (imageView.getVisibility() == 0) {
            imageView.setVisibility(8);
            imageView.setImageResource(i3);
        } else {
            imageView.getVisibility();
        }
        this.lastAvatar = fileLocation;
        if (user != null) {
            anonymousClass2.imageReceiver.setForUserOrChat(user, avatarDrawable2);
            anonymousClass2.onNewImageSet();
        } else if (chat != null) {
            anonymousClass2.imageReceiver.setForUserOrChat(chat, avatarDrawable2);
            anonymousClass2.onNewImageSet();
        } else {
            anonymousClass2.setImageDrawable(avatarDrawable2);
        }
        if (this.isCommunity) {
            iDp = AndroidUtilities.dp(12.777778f);
        } else if (chat == null) {
            iDp = AndroidUtilities.dp(24.0f);
        } else {
            iDp = AndroidUtilities.dp(24.0f);
        }
        anonymousClass2.setRoundRadius(iDp);
        simpleTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider2));
    }

    @Override
    public final void updateColors$1() {
    }

    public final void setAvatarPadding(int i, int i2) {
        int i3;
        float f;
        AnonymousClass2 anonymousClass2 = this.avatarImageView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass2.getLayoutParams();
        layoutParams.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : i + 7);
        layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i + 7 : 0.0f);
        anonymousClass2.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.nameTextView.getLayoutParams();
        boolean z = LocaleController.isRTL;
        CheckBoxSquare checkBoxSquare = this.checkBoxBig;
        if (z) {
            i3 = (checkBoxSquare != null ? 18 : 0) + 28;
        } else {
            i3 = i + 64 + i2;
        }
        layoutParams2.leftMargin = AndroidUtilities.dp(i3);
        if (LocaleController.isRTL) {
            f = i + 64 + i2;
        } else {
            f = (checkBoxSquare != null ? 18 : 0) + 28;
        }
        layoutParams2.rightMargin = AndroidUtilities.dp(f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.statusTextView.getLayoutParams();
        layoutParams3.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : i + 64 + i2);
        layoutParams3.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i + 64 + i2 : 28.0f);
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) checkBox2.getLayoutParams();
            layoutParams4.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : i + 32 + i2);
            layoutParams4.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i + 32 + i2 : 0.0f);
        }
    }

    public final void setData(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        SimpleTextView simpleTextView = this.nameTextView;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.currentStatus = null;
            this.currentName = null;
            this.storiable = false;
            this.currentObject = null;
            simpleTextView.setText("", false);
            this.statusTextView.setText("", false);
            this.avatarImageView.setImageDrawable(null);
            return;
        }
        this.currentStatus = charSequence2;
        if (charSequence != null && simpleTextView != null) {
            try {
                charSequence = Emoji.replaceEmoji(charSequence, simpleTextView.getPaint().getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
        }
        this.currentName = charSequence;
        this.storiable = !(obj instanceof String);
        this.currentObject = obj;
        this.needDivider = z;
        setWillNotDraw(!z);
        update(0);
    }
}
