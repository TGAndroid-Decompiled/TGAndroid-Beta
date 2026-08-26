package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Stars.StarsIntroActivity;

public class ShareDialogCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int TYPE_CREATE = 2;
    public static final int TYPE_SHARE = 0;
    private final AvatarDrawable avatarDrawable;
    private final CheckBox2 checkBox;
    private final int currentAccount;
    private long currentDialog;
    private final int currentType;
    private final BackupImageView imageView;
    private long lastUpdateTime;
    private Drawable lockDrawable;
    private final TextView nameTextView;
    private float onlineProgress;
    private boolean premiumBlocked;
    private final AnimatedFloat premiumBlockedT;
    private PremiumGradient.PremiumGradientTools premiumGradient;
    private final Paint priceBackgroundPaint;
    private Text priceText;
    private long priceTextValue;
    private RepostStoryDrawable repostStoryDrawable;
    public final Theme.ResourcesProvider resourcesProvider;
    private final AnimatedFloat starsBlockedT;
    private long starsPriceBlocked;
    private final SimpleTextView topicTextView;
    private boolean topicWasVisible;
    private TLRPC.User user;

    public final class RepostStoryDrawable extends Drawable {
        public int alpha;
        public final Drawable drawable;
        public final RLottieDrawable lottieDrawable;
        public final Paint paint;

        public RepostStoryDrawable(Context context, View view, boolean z, int i, Theme.ResourcesProvider resourcesProvider) {
            int i2 = 1;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.alpha = 255;
            paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), new int[]{Theme.getColor(Theme.key_stories_circle1, resourcesProvider), Theme.getColor(Theme.key_stories_circle2, resourcesProvider)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            if (!z) {
                this.lottieDrawable = null;
                Drawable drawableMutate = context.getResources().getDrawable(i).mutate();
                this.drawable = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                return;
            }
            RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.story_repost, "story_repost", AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
            this.lottieDrawable = rLottieDrawable;
            rLottieDrawable.setMasterParent(view);
            AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda16(rLottieDrawable, i2), 450L);
            this.drawable = null;
        }

        @Override
        public final void draw(Canvas canvas) {
            canvas.save();
            canvas.translate(getBounds().left, getBounds().top);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
            Paint paint = this.paint;
            paint.setAlpha(this.alpha);
            float fMin = (this.alpha / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
            canvas.restore();
            Drawable drawable = this.lottieDrawable;
            int iDp = AndroidUtilities.dp(drawable != null ? 20.0f : 15.0f);
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(getBounds().centerX() - iDp, getBounds().centerY() - iDp, getBounds().centerX() + iDp, getBounds().centerY() + iDp);
            if (drawable == null) {
                drawable = this.drawable;
            }
            if (drawable != null) {
                drawable.setBounds(rect);
                drawable.setAlpha(this.alpha);
                drawable.draw(canvas);
            }
        }

        @Override
        public final int getIntrinsicHeight() {
            return AndroidUtilities.dp(56.0f);
        }

        @Override
        public final int getIntrinsicWidth() {
            return AndroidUtilities.dp(56.0f);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
            this.alpha = i;
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public ShareDialogCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.premiumBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.starsBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.priceBackgroundPaint = new Paint();
        this.resourcesProvider = resourcesProvider;
        this.avatarDrawable = new ShareTopicCell.AnonymousClass1(this, resourcesProvider, 1);
        setWillNotDraw(false);
        this.currentType = i;
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i == 2) {
            addView(backupImageView, LayoutHelper.createFrame(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(backupImageView, LayoutHelper.createFrame(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        MentionCell.AnonymousClass1 anonymousClass1 = new MentionCell.AnonymousClass1(context, 3);
        this.nameTextView = anonymousClass1;
        NotificationCenter.listenEmojiLoading(anonymousClass1);
        anonymousClass1.setTextColor(Theme.getColor(this.premiumBlocked ? Theme.key_windowBackgroundWhiteGrayText5 : Theme.key_dialogTextBlack, resourcesProvider));
        anonymousClass1.setTextSize(1, 12.0f);
        anonymousClass1.setMaxLines(2);
        anonymousClass1.setGravity(49);
        anonymousClass1.setLines(2);
        anonymousClass1.setEllipsize(TextUtils.TruncateAt.END);
        addView(anonymousClass1, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, i == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.topicTextView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        simpleTextView.setTextSize(12);
        simpleTextView.setMaxLines(2);
        simpleTextView.setGravity(49);
        simpleTextView.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, i == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.setColor(Theme.key_dialogRoundCheckBox, Theme.key_dialogBackground, Theme.key_dialogRoundCheckBoxCheck);
        checkBox2.setDrawUnchecked(false);
        checkBox2.setDrawBackgroundAsArc(4);
        checkBox2.setProgressDelegate(new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 20));
        addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, 49, 19.0f, i == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.userIsPremiumBlockedUpadted) {
            TL_account.RequirementToContact requirementToContactIsUserContactBlocked = this.user != null ? MessagesController.getInstance(this.currentAccount).isUserContactBlocked(this.user.id) : null;
            long sendPaidMessagesStars = this.currentDialog < 0 ? MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(this.currentDialog) : DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
            if (this.premiumBlocked == DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked) && this.starsPriceBlocked == sendPaidMessagesStars) {
                return;
            }
            boolean zIsPremiumBlocked = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
            this.premiumBlocked = zIsPremiumBlocked;
            this.starsPriceBlocked = sendPaidMessagesStars;
            this.nameTextView.setTextColor(Theme.getColor(zIsPremiumBlocked ? Theme.key_windowBackgroundWhiteGrayText5 : Theme.key_dialogTextBlack, this.resourcesProvider));
            invalidate();
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        TLRPC.User user;
        float f;
        float f2;
        boolean z;
        TLRPC.UserStatus userStatus;
        Text text;
        float currentWidth;
        float f3;
        Text text2;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (view == this.imageView && this.currentType != 2 && (user = this.user) != null && !MessagesController.isSupportUser(user)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = jElapsedRealtime - this.lastUpdateTime;
            long j3 = j2 <= 17 ? j2 : 17L;
            this.lastUpdateTime = jElapsedRealtime;
            float f4 = this.starsBlockedT.set(this.starsPriceBlocked > 0);
            if (f4 > 0.0f) {
                float measuredWidth = (this.imageView.getMeasuredWidth() / 2.0f) + this.imageView.getLeft() + AndroidUtilities.dp(18.0f);
                float measuredHeight = ((this.imageView.getMeasuredHeight() / 2.0f) + this.imageView.getTop()) - AndroidUtilities.dp(20.83f);
                if (this.priceText != null) {
                    long j4 = this.priceTextValue;
                    f2 = 5.0f;
                    long j5 = this.starsPriceBlocked;
                    if (j4 != j5 && j5 > 0) {
                    }
                    text = this.priceText;
                    if (text == null) {
                        currentWidth = 0.0f;
                    } else {
                        currentWidth = text.getCurrentWidth();
                    }
                    float fDp = currentWidth + AndroidUtilities.dp(10.0f);
                    float fDp2 = AndroidUtilities.dp(14.33f);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f5 = fDp / 2.0f;
                    f3 = measuredWidth - f5;
                    float f6 = fDp2 / 2.0f;
                    rectF.set(f3, measuredHeight - f6, measuredWidth + f5, f6 + measuredHeight);
                    rectF.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                    this.priceBackgroundPaint.setColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.priceBackgroundPaint);
                    rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                    this.priceBackgroundPaint.setColor(Theme.getColor(Theme.key_dialogRoundCheckBox, this.resourcesProvider));
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.priceBackgroundPaint);
                    text2 = this.priceText;
                    if (text2 != null) {
                        float fDp3 = AndroidUtilities.dp(f2) + f3;
                        f = 0.0f;
                        text2.draw(canvas, fDp3, measuredHeight, -1, 1.0f);
                    } else {
                        f = 0.0f;
                    }
                } else {
                    f2 = 5.0f;
                }
                StringBuilder sb = new StringBuilder("⭐️");
                long j6 = this.starsPriceBlocked;
                this.priceTextValue = j6;
                sb.append(AndroidUtilities.formatWholeNumber((int) j6, 0));
                this.priceText = new Text(StarsIntroActivity.replaceStars(sb.toString(), 0.65f, (ColoredImageSpan[]) null), 9.33f, AndroidUtilities.bold());
                text = this.priceText;
                if (text == null) {
                    currentWidth = 0.0f;
                } else {
                    currentWidth = text.getCurrentWidth();
                }
                float fDp4 = currentWidth + AndroidUtilities.dp(10.0f);
                float fDp5 = AndroidUtilities.dp(14.33f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f7 = fDp4 / 2.0f;
                f3 = measuredWidth - f7;
                float f8 = fDp5 / 2.0f;
                rectF2.set(f3, measuredHeight - f8, measuredWidth + f7, f8 + measuredHeight);
                rectF2.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                this.priceBackgroundPaint.setColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.priceBackgroundPaint);
                rectF2.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                this.priceBackgroundPaint.setColor(Theme.getColor(Theme.key_dialogRoundCheckBox, this.resourcesProvider));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.priceBackgroundPaint);
                text2 = this.priceText;
                if (text2 != null) {
                    float fDp6 = AndroidUtilities.dp(f2) + f3;
                    f = 0.0f;
                    text2.draw(canvas, fDp6, measuredHeight, -1, 1.0f);
                } else {
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
                f2 = 5.0f;
            }
            float f9 = this.premiumBlockedT.set(this.premiumBlocked);
            if (f9 > f) {
                int bottom = this.imageView.getBottom() - AndroidUtilities.dp(9.0f);
                int right = this.imageView.getRight() - AndroidUtilities.dp(9.33f);
                canvas.save();
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                float f10 = right;
                float f11 = bottom;
                canvas.drawCircle(f10, f11, AndroidUtilities.dp(12.0f) * f9, Theme.dialogs_onlineCirclePaint);
                if (this.premiumGradient == null) {
                    this.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, this.resourcesProvider);
                }
                this.premiumGradient.gradientMatrix(right - AndroidUtilities.dp(10.0f), bottom - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + right, AndroidUtilities.dp(10.0f) + bottom, 0.0f, 0.0f);
                canvas.drawCircle(f10, f11, AndroidUtilities.dp(10.0f) * f9, this.premiumGradient.paint);
                if (this.lockDrawable == null) {
                    Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.lockDrawable = drawableMutate;
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                Drawable drawable = this.lockDrawable;
                drawable.setBounds((int) (f10 - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * f9)), (int) (f11 - (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f) * f9)), (int) (((this.lockDrawable.getIntrinsicWidth() / 2.0f) * 0.875f * f9) + f10), (int) (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f * f9) + f11));
                this.lockDrawable.setAlpha((int) (255.0f * f9));
                this.lockDrawable.draw(canvas);
                canvas.restore();
            }
            if (this.premiumBlocked) {
                z = false;
            } else {
                TLRPC.User user2 = this.user;
                if (user2.self || user2.bot || (((userStatus = user2.status) == null || userStatus.expires <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) && !MessagesController.getInstance(this.currentAccount).onlinePrivacy.containsKey(Long.valueOf(this.user.id)))) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z || this.onlineProgress != f) {
                int bottom2 = this.imageView.getBottom() - AndroidUtilities.dp(6.0f);
                int right2 = this.imageView.getRight() - AndroidUtilities.dp(10.0f);
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                float f12 = right2;
                float f13 = bottom2;
                float f14 = 1.0f - f9;
                float f15 = 1.0f - f4;
                canvas.drawCircle(f12, f13, AndroidUtilities.dp(7.0f) * this.onlineProgress * f14 * f15, Theme.dialogs_onlineCirclePaint);
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_chats_onlineCircle, this.resourcesProvider));
                canvas.drawCircle(f12, f13, MediaController$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(f2), this.onlineProgress, f14, f15), Theme.dialogs_onlineCirclePaint);
                if (z) {
                    float f16 = this.onlineProgress;
                    if (f16 < 1.0f) {
                        float f17 = (j3 / 150.0f) + f16;
                        this.onlineProgress = f17;
                        if (f17 > 1.0f) {
                            this.onlineProgress = 1.0f;
                        }
                        this.imageView.invalidate();
                        invalidate();
                        return zDrawChild;
                    }
                } else {
                    float f18 = this.onlineProgress;
                    if (f18 > f) {
                        float f19 = f18 - (j3 / 150.0f);
                        this.onlineProgress = f19;
                        if (f19 < f) {
                            this.onlineProgress = f;
                        }
                        this.imageView.invalidate();
                        invalidate();
                    }
                }
            }
        }
        return zDrawChild;
    }

    public long getCurrentDialog() {
        return this.currentDialog;
    }

    public BackupImageView getImageView() {
        return this.imageView;
    }

    public long getStarsPrice() {
        return this.starsPriceBlocked;
    }

    public boolean isBlocked() {
        return this.premiumBlocked;
    }

    public final void lambda$new$0(float f) {
        float progress = 1.0f - (this.checkBox.getProgress() * 0.143f);
        this.imageView.setScaleX(progress);
        this.imageView.setScaleY(progress);
        invalidate();
    }

    public final void lambda$setTopic$1(DynamicAnimation dynamicAnimation, float f, float f2) {
        float f3 = f / 1000.0f;
        this.topicTextView.setAlpha(f3);
        float f4 = 1.0f - f3;
        this.nameTextView.setAlpha(f4);
        this.topicTextView.setTranslationX(f4 * (-AndroidUtilities.dp(10.0f)));
        this.nameTextView.setTranslationX(f3 * AndroidUtilities.dp(10.0f));
    }

    public final void lambda$setTopic$2(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.topicTextView.setTag(R.id.spring_tag, null);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = (this.imageView.getMeasuredWidth() / 2) + this.imageView.getLeft();
        int measuredHeight = (this.imageView.getMeasuredHeight() / 2) + this.imageView.getTop();
        Theme.checkboxSquare_checkPaint.setColor(Theme.getColor(Theme.key_dialogRoundCheckBox, this.resourcesProvider));
        Theme.checkboxSquare_checkPaint.setAlpha((int) (this.checkBox.getProgress() * 255.0f));
        int iDp = AndroidUtilities.dp(this.currentType == 2 ? 24.0f : 28.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - iDp, measuredHeight - iDp, measuredWidth + iDp, measuredHeight + iDp);
        canvas.drawRoundRect(rectF, this.imageView.getRoundRadius()[0], this.imageView.getRoundRadius()[0], Theme.checkboxSquare_checkPaint);
        super.onDraw(canvas);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.checkBox.isChecked()) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.currentType == 2 ? 95.0f : 103.0f), 1073741824));
    }

    public String repostToCustomName() {
        return LocaleController.getString(R.string.FwdMyStory);
    }

    public void setChecked(boolean z, boolean z2) {
        this.checkBox.setChecked(z, z2);
        if (z) {
            return;
        }
        setTopic(null, true);
    }

    public void setDialog(long j, boolean z, CharSequence charSequence) {
        this.avatarDrawable.setScaleSize(1.0f);
        if (j == Long.MAX_VALUE) {
            this.nameTextView.setText(repostToCustomName());
            if (this.repostStoryDrawable == null) {
                this.repostStoryDrawable = new RepostStoryDrawable(getContext(), this.imageView, true, R.drawable.large_repost_story, this.resourcesProvider);
            }
            this.imageView.setImage((ImageLocation) null, (String) null, this.repostStoryDrawable, (Object) null);
        } else if (DialogObject.isUserDialog(j)) {
            this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            TL_account.RequirementToContact requirementToContactIsUserContactBlocked = MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j);
            this.premiumBlocked = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
            this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
            this.nameTextView.setTextColor(Theme.getColor(this.premiumBlocked ? Theme.key_windowBackgroundWhiteGrayText5 : Theme.key_dialogTextBlack, this.resourcesProvider));
            this.premiumBlockedT.force(this.premiumBlocked);
            this.starsBlockedT.force(this.starsPriceBlocked > 0);
            invalidate();
            this.avatarDrawable.setInfo(this.currentAccount, this.user);
            if (this.currentType != 2 && UserObject.isReplyUser(this.user)) {
                this.nameTextView.setText(LocaleController.getString(R.string.RepliesTitle));
                this.avatarDrawable.setAvatarType(12);
                this.imageView.setImage((ImageLocation) null, (String) null, this.avatarDrawable, this.user);
            } else if (this.currentType == 2 || !UserObject.isUserSelf(this.user)) {
                if (charSequence != null) {
                    this.nameTextView.setText(charSequence);
                } else {
                    TLRPC.User user = this.user;
                    if (user != null) {
                        this.nameTextView.setText(ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        this.nameTextView.setText("");
                    }
                }
                this.imageView.setForUserOrChat(this.user, this.avatarDrawable);
            } else {
                this.nameTextView.setText(LocaleController.getString(R.string.SavedMessages));
                this.avatarDrawable.setAvatarType(1);
                this.imageView.setImage((ImageLocation) null, (String) null, this.avatarDrawable, this.user);
            }
            this.imageView.setRoundRadius(AndroidUtilities.dp(28.0f));
        } else {
            this.user = null;
            this.premiumBlocked = false;
            this.premiumBlockedT.force(0.0f);
            this.starsPriceBlocked = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j);
            this.starsBlockedT.force(false);
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            if (charSequence != null) {
                this.nameTextView.setText(charSequence);
            } else if (chat == null) {
                this.nameTextView.setText("");
            } else if (chat.monoforum) {
                this.nameTextView.setText(ForumUtilities.getMonoForumTitle(chat, this.currentAccount, false));
            } else {
                this.nameTextView.setText(chat.title);
            }
            if (ChatObject.isMonoForum(chat)) {
                int i = this.currentAccount;
                AvatarDrawable avatarDrawable = this.avatarDrawable;
                BackupImageView backupImageView = this.imageView;
                int i2 = ForumUtilities.$r8$clinit;
                TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
                avatarDrawable.setInfo(i, chat2 != null ? chat2 : chat);
                backupImageView.setForUserOrChat(chat2, avatarDrawable);
            } else {
                this.avatarDrawable.setInfo(this.currentAccount, chat);
                this.imageView.setForUserOrChat(chat, this.avatarDrawable);
            }
            this.imageView.setRoundRadius((chat == null || !(chat.forum || chat.monoforum)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
        }
        this.currentDialog = j;
        this.checkBox.setChecked(z, false);
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        setTopic(tL_forumTopic, false, z);
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic, boolean z, boolean z2) {
        boolean z3 = this.topicWasVisible;
        boolean z4 = tL_forumTopic != null;
        if (z3 == z4 && z2) {
            return;
        }
        SimpleTextView simpleTextView = this.topicTextView;
        int i = R.id.spring_tag;
        SpringAnimation springAnimation = (SpringAnimation) simpleTextView.getTag(i);
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        if (z4) {
            if (z) {
                this.topicTextView.setText(MessagesController.getInstance(this.currentAccount).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)));
            } else {
                SimpleTextView simpleTextView2 = this.topicTextView;
                simpleTextView2.setText(ForumUtilities.getTopicSpannedName(tL_forumTopic, simpleTextView2.getTextPaint(), null));
            }
            this.topicTextView.requestLayout();
        }
        if (z2) {
            SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(z4 ? 0.0f : 1000.0f));
            SpringForce springForce = new SpringForce(z4 ? 1000.0f : 0.0f);
            springForce.setStiffness(1500.0f);
            springForce.setDampingRatio(1.0f);
            springAnimation2.mSpring = springForce;
            int i2 = 0;
            springAnimation2.addUpdateListener(new ShareDialogCell$$ExternalSyntheticLambda1(this, i2));
            springAnimation2.addEndListener(new ShareDialogCell$$ExternalSyntheticLambda2(this, i2));
            this.topicTextView.setTag(i, springAnimation2);
            springAnimation2.start();
        } else if (z4) {
            this.topicTextView.setAlpha(1.0f);
            this.nameTextView.setAlpha(0.0f);
            this.topicTextView.setTranslationX(0.0f);
            this.nameTextView.setTranslationX(AndroidUtilities.dp(10.0f));
        } else {
            this.topicTextView.setAlpha(0.0f);
            this.nameTextView.setAlpha(1.0f);
            this.topicTextView.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.nameTextView.setTranslationX(0.0f);
        }
        this.topicWasVisible = z4;
    }
}
