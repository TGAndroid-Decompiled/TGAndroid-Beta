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
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.CameraScanActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda356;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Text;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda12;
import org.telegram.ui.Stars.StarsIntroActivity;

public class ShareDialogCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final ShareTopicCell.AnonymousClass1 avatarDrawable;
    public final CheckBox2 checkBox;
    public final int currentAccount;
    public long currentDialog;
    public final int currentType;
    public final BackupImageView imageView;
    public long lastUpdateTime;
    public Drawable lockDrawable;
    public final ArticleViewer.AnonymousClass9 nameTextView;
    public float onlineProgress;
    public boolean premiumBlocked;
    public final AnimatedFloat premiumBlockedT;
    public PremiumGradient.PremiumGradientTools premiumGradient;
    public final Paint priceBackgroundPaint;
    public Text priceText;
    public long priceTextValue;
    public RepostStoryDrawable repostStoryDrawable;
    public final Theme.ResourcesProvider resourcesProvider;
    public final AnimatedFloat starsBlockedT;
    public long starsPriceBlocked;
    public final SimpleTextView topicTextView;
    public boolean topicWasVisible;
    public TLRPC.User user;

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
            rLottieDrawable.masterParent = view;
            AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda14(rLottieDrawable, i2), 450L);
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
        ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(context, 4);
        this.nameTextView = anonymousClass9;
        NotificationCenter.listenEmojiLoading(anonymousClass9);
        anonymousClass9.setTextColor(Theme.getColor(this.premiumBlocked ? Theme.key_windowBackgroundWhiteGrayText5 : Theme.key_dialogTextBlack, resourcesProvider));
        anonymousClass9.setTextSize(1, 12.0f);
        anonymousClass9.setMaxLines(2);
        anonymousClass9.setGravity(49);
        anonymousClass9.setLines(2);
        anonymousClass9.setEllipsize(TextUtils.TruncateAt.END);
        addView(anonymousClass9, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, i == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
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
        checkBox2.checkBoxBase.setColor(Theme.key_dialogRoundCheckBox, Theme.key_dialogBackground, Theme.key_dialogRoundCheckBoxCheck);
        checkBox2.setDrawUnchecked(false);
        checkBox2.setDrawBackgroundAsArc(4);
        checkBox2.setProgressDelegate(new ChatActivity$$ExternalSyntheticLambda356(this, 5));
        addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, 49, 19.0f, i == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.user;
            int i3 = this.currentAccount;
            TL_account.RequirementToContact requirementToContactIsUserContactBlocked = user != null ? MessagesController.getInstance(i3).isUserContactBlocked(this.user.id) : null;
            long sendPaidMessagesStars = this.currentDialog < 0 ? MessagesController.getInstance(i3).getSendPaidMessagesStars(this.currentDialog) : DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
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
    public final boolean drawChild(Canvas canvas, View view, long j) {
        TLRPC.User user;
        Theme.ResourcesProvider resourcesProvider;
        float f;
        float f2;
        boolean z;
        Text text;
        float f3;
        float f4;
        Text text2;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        BackupImageView backupImageView = this.imageView;
        if (view == backupImageView && this.currentType != 2 && (user = this.user) != null && !MessagesController.isSupportUser(user)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = jElapsedRealtime - this.lastUpdateTime;
            long j3 = j2 <= 17 ? j2 : 17L;
            this.lastUpdateTime = jElapsedRealtime;
            float f5 = this.starsBlockedT.set(this.starsPriceBlocked > 0);
            Theme.ResourcesProvider resourcesProvider2 = this.resourcesProvider;
            if (f5 > 0.0f) {
                float measuredWidth = (backupImageView.getMeasuredWidth() / 2.0f) + backupImageView.getLeft() + AndroidUtilities.dp(18.0f);
                float measuredHeight = ((backupImageView.getMeasuredHeight() / 2.0f) + backupImageView.getTop()) - AndroidUtilities.dp(20.83f);
                if (this.priceText != null) {
                    long j4 = this.priceTextValue;
                    f2 = 5.0f;
                    long j5 = this.starsPriceBlocked;
                    if (j4 != j5 && j5 > 0) {
                    }
                    text = this.priceText;
                    if (text == null) {
                        f3 = 0.0f;
                    } else {
                        f3 = text.width;
                    }
                    float fDp = f3 + AndroidUtilities.dp(10.0f);
                    float fDp2 = AndroidUtilities.dp(14.33f);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f6 = fDp / 2.0f;
                    f4 = measuredWidth - f6;
                    float f7 = fDp2 / 2.0f;
                    rectF.set(f4, measuredHeight - f7, measuredWidth + f6, f7 + measuredHeight);
                    rectF.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                    Paint paint = this.priceBackgroundPaint;
                    paint.setColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider2));
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                    paint.setColor(Theme.getColor(Theme.key_dialogRoundCheckBox, resourcesProvider2));
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    text2 = this.priceText;
                    if (text2 != null) {
                        resourcesProvider = resourcesProvider2;
                        f = 0.0f;
                        text2.draw(f4 + AndroidUtilities.dp(f2), measuredHeight, 1.0f, -1, canvas);
                    } else {
                        resourcesProvider = resourcesProvider2;
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
                    f3 = 0.0f;
                } else {
                    f3 = text.width;
                }
                float fDp3 = f3 + AndroidUtilities.dp(10.0f);
                float fDp4 = AndroidUtilities.dp(14.33f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f8 = fDp3 / 2.0f;
                f4 = measuredWidth - f8;
                float f9 = fDp4 / 2.0f;
                rectF2.set(f4, measuredHeight - f9, measuredWidth + f8, f9 + measuredHeight);
                rectF2.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                Paint paint2 = this.priceBackgroundPaint;
                paint2.setColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                paint2.setColor(Theme.getColor(Theme.key_dialogRoundCheckBox, resourcesProvider2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                text2 = this.priceText;
                if (text2 != null) {
                    resourcesProvider = resourcesProvider2;
                    f = 0.0f;
                    text2.draw(f4 + AndroidUtilities.dp(f2), measuredHeight, 1.0f, -1, canvas);
                } else {
                    resourcesProvider = resourcesProvider2;
                    f = 0.0f;
                }
            } else {
                resourcesProvider = resourcesProvider2;
                f = 0.0f;
                f2 = 5.0f;
            }
            float f10 = this.premiumBlockedT.set(this.premiumBlocked);
            if (f10 > f) {
                int bottom = backupImageView.getBottom() - AndroidUtilities.dp(9.0f);
                int right = backupImageView.getRight() - AndroidUtilities.dp(9.33f);
                canvas.save();
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
                float f11 = right;
                float f12 = bottom;
                canvas.drawCircle(f11, f12, AndroidUtilities.dp(12.0f) * f10, Theme.dialogs_onlineCirclePaint);
                if (this.premiumGradient == null) {
                    this.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, this.resourcesProvider);
                }
                this.premiumGradient.gradientMatrix(right - AndroidUtilities.dp(10.0f), 0.0f, bottom - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + right, 0.0f, AndroidUtilities.dp(10.0f) + bottom);
                canvas.drawCircle(f11, f12, AndroidUtilities.dp(10.0f) * f10, this.premiumGradient.paint);
                if (this.lockDrawable == null) {
                    Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.lockDrawable = drawableMutate;
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                Drawable drawable = this.lockDrawable;
                drawable.setBounds((int) (f11 - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * f10)), (int) (f12 - (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f) * f10)), (int) (((this.lockDrawable.getIntrinsicWidth() / 2.0f) * 0.875f * f10) + f11), (int) (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f * f10) + f12));
                this.lockDrawable.setAlpha((int) (255.0f * f10));
                this.lockDrawable.draw(canvas);
                canvas.restore();
            }
            if (this.premiumBlocked) {
                z = false;
            } else {
                TLRPC.User user2 = this.user;
                if (user2.self || user2.bot) {
                    z = false;
                } else {
                    TLRPC.UserStatus userStatus = user2.status;
                    int i = this.currentAccount;
                    if ((userStatus == null || userStatus.expires <= ConnectionsManager.getInstance(i).getCurrentTime()) && !MessagesController.getInstance(i).onlinePrivacy.containsKey(Long.valueOf(this.user.id))) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
            if (z || this.onlineProgress != f) {
                int bottom2 = backupImageView.getBottom() - AndroidUtilities.dp(6.0f);
                int right2 = backupImageView.getRight() - AndroidUtilities.dp(10.0f);
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
                float f13 = right2;
                float f14 = bottom2;
                float f15 = 1.0f - f10;
                float f16 = 1.0f - f5;
                canvas.drawCircle(f13, f14, AndroidUtilities.dp(7.0f) * this.onlineProgress * f15 * f16, Theme.dialogs_onlineCirclePaint);
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_chats_onlineCircle, resourcesProvider));
                canvas.drawCircle(f13, f14, MediaController$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(f2), this.onlineProgress, f15, f16), Theme.dialogs_onlineCirclePaint);
                if (z) {
                    float f17 = this.onlineProgress;
                    if (f17 < 1.0f) {
                        float f18 = (j3 / 150.0f) + f17;
                        this.onlineProgress = f18;
                        if (f18 > 1.0f) {
                            this.onlineProgress = 1.0f;
                        }
                        backupImageView.invalidate();
                        invalidate();
                        return zDrawChild;
                    }
                } else {
                    float f19 = this.onlineProgress;
                    if (f19 > f) {
                        float f20 = f19 - (j3 / 150.0f);
                        this.onlineProgress = f20;
                        if (f20 < f) {
                            this.onlineProgress = f;
                        }
                        backupImageView.invalidate();
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

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        BackupImageView backupImageView = this.imageView;
        int measuredWidth = (backupImageView.getMeasuredWidth() / 2) + backupImageView.getLeft();
        int measuredHeight = (backupImageView.getMeasuredHeight() / 2) + backupImageView.getTop();
        Theme.checkboxSquare_checkPaint.setColor(Theme.getColor(Theme.key_dialogRoundCheckBox, this.resourcesProvider));
        Theme.checkboxSquare_checkPaint.setAlpha((int) (this.checkBox.getProgress() * 255.0f));
        int iDp = AndroidUtilities.dp(this.currentType == 2 ? 24.0f : 28.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - iDp, measuredHeight - iDp, measuredWidth + iDp, measuredHeight + iDp);
        canvas.drawRoundRect(rectF, backupImageView.getRoundRadius()[0], backupImageView.getRoundRadius()[0], Theme.checkboxSquare_checkPaint);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.checkBox.checkBoxBase.isChecked) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.currentType == 2 ? 95.0f : 103.0f), 1073741824));
    }

    public String repostToCustomName() {
        return LocaleController.getString(R.string.FwdMyStory);
    }

    public final void setChecked(boolean z, boolean z2) {
        this.checkBox.checkBoxBase.setChecked(-1, z, z2);
        if (z) {
            return;
        }
        setTopic(null, false, true);
    }

    public final void setDialog(long j, boolean z, CharSequence charSequence) {
        ShareTopicCell.AnonymousClass1 anonymousClass1 = this.avatarDrawable;
        anonymousClass1.scaleSize = 1.0f;
        BackupImageView backupImageView = this.imageView;
        ArticleViewer.AnonymousClass9 anonymousClass9 = this.nameTextView;
        if (j == Long.MAX_VALUE) {
            anonymousClass9.setText(repostToCustomName());
            if (this.repostStoryDrawable == null) {
                this.repostStoryDrawable = new RepostStoryDrawable(getContext(), backupImageView, true, R.drawable.large_repost_story, this.resourcesProvider);
            }
            backupImageView.setImage(null, null, this.repostStoryDrawable, null);
        } else {
            boolean zIsUserDialog = DialogObject.isUserDialog(j);
            AnimatedFloat animatedFloat = this.starsBlockedT;
            AnimatedFloat animatedFloat2 = this.premiumBlockedT;
            int i = this.currentAccount;
            if (zIsUserDialog) {
                this.user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
                TL_account.RequirementToContact requirementToContactIsUserContactBlocked = MessagesController.getInstance(i).isUserContactBlocked(j);
                this.premiumBlocked = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
                this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
                anonymousClass9.setTextColor(Theme.getColor(this.premiumBlocked ? Theme.key_windowBackgroundWhiteGrayText5 : Theme.key_dialogTextBlack, this.resourcesProvider));
                animatedFloat2.force(this.premiumBlocked);
                animatedFloat.force(this.starsPriceBlocked > 0);
                invalidate();
                anonymousClass1.setInfo(i, this.user);
                int i2 = this.currentType;
                if (i2 != 2 && UserObject.isReplyUser(this.user)) {
                    anonymousClass9.setText(LocaleController.getString(R.string.RepliesTitle));
                    anonymousClass1.setAvatarType(12);
                    backupImageView.setImage(null, null, anonymousClass1, this.user);
                } else if (i2 == 2 || !UserObject.isUserSelf(this.user)) {
                    if (charSequence != null) {
                        anonymousClass9.setText(charSequence);
                    } else {
                        TLRPC.User user = this.user;
                        if (user != null) {
                            anonymousClass9.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            anonymousClass9.setText("");
                        }
                    }
                    backupImageView.imageReceiver.setForUserOrChat(this.user, anonymousClass1);
                    backupImageView.onNewImageSet();
                } else {
                    anonymousClass9.setText(LocaleController.getString(R.string.SavedMessages));
                    anonymousClass1.setAvatarType(1);
                    backupImageView.setImage(null, null, anonymousClass1, this.user);
                }
                backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.user = null;
                this.premiumBlocked = false;
                animatedFloat2.set(0.0f, true);
                this.starsPriceBlocked = MessagesController.getInstance(i).getSendPaidMessagesStars(j);
                animatedFloat.getClass();
                animatedFloat.set(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
                if (charSequence != null) {
                    anonymousClass9.setText(charSequence);
                } else if (chat == null) {
                    anonymousClass9.setText("");
                } else if (chat.monoforum) {
                    anonymousClass9.setText(ForumUtilities.getMonoForumTitle(chat, i, false));
                } else {
                    anonymousClass9.setText(chat.title);
                }
                if (ChatObject.isMonoForum(chat)) {
                    int i3 = ForumUtilities.$r8$clinit;
                    TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
                    anonymousClass1.setInfo(i, chat2 != null ? chat2 : chat);
                    backupImageView.imageReceiver.setForUserOrChat(chat2, anonymousClass1);
                    backupImageView.onNewImageSet();
                } else {
                    anonymousClass1.setInfo(i, chat);
                    backupImageView.imageReceiver.setForUserOrChat(chat, anonymousClass1);
                    backupImageView.onNewImageSet();
                }
                backupImageView.setRoundRadius((chat == null || !(chat.forum || chat.monoforum)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
            }
        }
        this.currentDialog = j;
        this.checkBox.checkBoxBase.setChecked(-1, z, false);
    }

    public final void setTopic(TLRPC.TL_forumTopic tL_forumTopic, boolean z, boolean z2) {
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
                simpleTextView.setText(MessagesController.getInstance(this.currentAccount).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                simpleTextView.setText(ForumUtilities.getTopicSpannedName(tL_forumTopic, simpleTextView.getTextPaint(), null), false);
            }
            simpleTextView.requestLayout();
        }
        if (z2) {
            SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(z4 ? 0.0f : 1000.0f));
            SpringForce springForce = new SpringForce(z4 ? 1000.0f : 0.0f);
            springForce.setStiffness(1500.0f);
            springForce.setDampingRatio(1.0f);
            springAnimation2.mSpring = springForce;
            int i2 = 1;
            springAnimation2.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda12(this, i2));
            springAnimation2.addEndListener(new CameraScanActivity$$ExternalSyntheticLambda14(this, i2));
            simpleTextView.setTag(i, springAnimation2);
            springAnimation2.start();
        } else {
            ArticleViewer.AnonymousClass9 anonymousClass9 = this.nameTextView;
            if (z4) {
                simpleTextView.setAlpha(1.0f);
                anonymousClass9.setAlpha(0.0f);
                simpleTextView.setTranslationX(0.0f);
                anonymousClass9.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                simpleTextView.setAlpha(0.0f);
                anonymousClass9.setAlpha(1.0f);
                simpleTextView.setTranslationX(-AndroidUtilities.dp(10.0f));
                anonymousClass9.setTranslationX(0.0f);
            }
        }
        this.topicWasVisible = z4;
    }
}
