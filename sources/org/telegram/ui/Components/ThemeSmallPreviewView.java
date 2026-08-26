package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.theme.ITheme;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda42;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda0;

public class ThemeSmallPreviewView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final float BUBBLE_HEIGHT;
    public final float BUBBLE_WIDTH;
    public final float INNER_RADIUS;
    public final float INNER_RECT_SPACE;
    public final float STROKE_RADIUS;
    public ThemeDrawable animateOutThemeDrawable;
    public Tooltip$$ExternalSyntheticLambda0 animationCancelRunnable;
    public boolean attached;
    public AvatarDrawable avatarDrawable;
    public final ImageReceiver avatarImageReceiver;
    public final Paint backgroundFillPaint;
    public final BackupImageView backupImageView;
    public float changeThemeProgress;
    public ChatBackgroundDrawable chatBackgroundDrawable;
    public ChatThemeBottomSheet.ChatThemeItem chatThemeItem;
    public final Path clipPath;
    public final int currentAccount;
    public final int currentType;
    public TLRPC.WallPaper fallbackWallpaper;
    public boolean isSelected;
    public int lastThemeIndex;
    public final MessageDrawable messageDrawableIn;
    public final MessageDrawable messageDrawableOut;
    public TextPaint noThemeTextPaint;
    public final Paint outlineBackgroundPaint;
    public int patternColor;
    public final RectF rectF;
    public final Theme.ResourcesProvider resourcesProvider;
    public float selectionProgress;
    public ValueAnimator strokeAlphaAnimator;
    public StaticLayout textLayout;
    public ThemeDrawable themeDrawable;
    public long themeUserByUserId;

    public final class ThemeDrawable {
        public final Paint inBubblePaint;
        public final Paint outBubblePaintSecond;
        public Drawable previewDrawable;
        public Drawable rotateDrawable;
        public final Paint strokePaint;

        public ThemeDrawable() {
            Paint paint = new Paint(1);
            this.strokePaint = paint;
            this.outBubblePaintSecond = new Paint(1);
            this.inBubblePaint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }

        public final void draw(Canvas canvas, float f) {
            float f2;
            float f3;
            float f4;
            float f5;
            int i;
            ThemeSmallPreviewView themeSmallPreviewView = ThemeSmallPreviewView.this;
            boolean z = themeSmallPreviewView.isSelected;
            RectF rectF = themeSmallPreviewView.rectF;
            if (z || themeSmallPreviewView.strokeAlphaAnimator != null) {
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem = themeSmallPreviewView.chatThemeItem;
                int color = themeSmallPreviewView.chatThemeItem.chatTheme.isAnyStub() ? Theme.getColor(Theme.key_featuredStickers_addButton, themeSmallPreviewView.resourcesProvider) : ((EmojiThemes.ThemeItem) chatThemeItem.chatTheme.items.get(chatThemeItem.themeIndex)).outLineColor;
                Paint paint = this.strokePaint;
                paint.setColor(color);
                paint.setAlpha((int) (themeSmallPreviewView.selectionProgress * f * 255.0f));
                float fM = DiffUtil.m(1.0f, themeSmallPreviewView.selectionProgress, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
                rectF.set(fM, fM, themeSmallPreviewView.getWidth() - fM, themeSmallPreviewView.getHeight() - fM);
                float f6 = themeSmallPreviewView.STROKE_RADIUS;
                canvas.drawRoundRect(rectF, f6, f6, paint);
            }
            Paint paint2 = this.outBubblePaintSecond;
            int i2 = (int) (255.0f * f);
            paint2.setAlpha(i2);
            Paint paint3 = this.inBubblePaint;
            paint3.setAlpha(i2);
            float width = themeSmallPreviewView.getWidth();
            float f7 = themeSmallPreviewView.INNER_RECT_SPACE;
            rectF.set(f7, f7, width - f7, themeSmallPreviewView.getHeight() - f7);
            EmojiThemes emojiThemes = themeSmallPreviewView.chatThemeItem.chatTheme;
            if (emojiThemes != null) {
                if (!emojiThemes.isAnyStub()) {
                    int i3 = themeSmallPreviewView.currentType;
                    if (i3 != 4) {
                        if (i3 == 2) {
                            if (themeSmallPreviewView.chatThemeItem.icon != null) {
                                canvas.drawBitmap(themeSmallPreviewView.chatThemeItem.icon, (themeSmallPreviewView.getWidth() - themeSmallPreviewView.chatThemeItem.icon.getWidth()) * 0.5f, AndroidUtilities.dp(21.0f), (Paint) null);
                                return;
                            }
                            return;
                        }
                        float fDp = AndroidUtilities.dp(8.0f) + f7;
                        float fDp2 = AndroidUtilities.dp(i3 == 3 ? 5.0f : 22.0f) + f7;
                        float f8 = themeSmallPreviewView.BUBBLE_WIDTH;
                        float f9 = themeSmallPreviewView.BUBBLE_HEIGHT;
                        if (i3 == 0 || i3 == 3) {
                            f2 = 4.0f;
                            f3 = 0.5f;
                            rectF.set(fDp2, fDp, ((i3 == 3 ? 1.2f : 1.0f) * f8) + fDp2, fDp + f9);
                        } else {
                            fDp = themeSmallPreviewView.getMeasuredHeight() * 0.12f;
                            f2 = 4.0f;
                            f3 = 0.5f;
                            rectF.set(themeSmallPreviewView.getMeasuredWidth() - (themeSmallPreviewView.getMeasuredWidth() * 0.65f), fDp, themeSmallPreviewView.getMeasuredWidth() - (themeSmallPreviewView.getMeasuredWidth() * 0.1f), themeSmallPreviewView.getMeasuredHeight() * 0.32f);
                        }
                        if (i3 == 3) {
                            paint2 = paint3;
                        }
                        if (i3 == 0 || i3 == 3) {
                            f4 = 2.0f;
                            f5 = 5.0f;
                            canvas.drawRoundRect(rectF, rectF.height() * f3, rectF.height() * f3, paint2);
                        } else {
                            MessageDrawable messageDrawable = themeSmallPreviewView.messageDrawableOut;
                            f4 = 2.0f;
                            f5 = 5.0f;
                            messageDrawable.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f2) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                            messageDrawable.overrideRoundRadius = (int) (rectF.height() * f3);
                            messageDrawable.draw(canvas, paint2);
                        }
                        if (i3 == 0 || i3 == 3) {
                            float fDp3 = f7 + AndroidUtilities.dp(f5);
                            float fDp4 = AndroidUtilities.dp(f2) + f9 + fDp;
                            i = 3;
                            rectF.set(fDp3, fDp4, (f8 * (i3 == 3 ? 0.8f : 1.0f)) + fDp3, f9 + fDp4);
                        } else {
                            rectF.set(themeSmallPreviewView.getMeasuredWidth() * 0.1f, themeSmallPreviewView.getMeasuredHeight() * 0.35f, themeSmallPreviewView.getMeasuredWidth() * 0.65f, themeSmallPreviewView.getMeasuredHeight() * 0.55f);
                            i = 3;
                        }
                        if (i3 != 0 && i3 != i) {
                            MessageDrawable messageDrawable2 = themeSmallPreviewView.messageDrawableIn;
                            messageDrawable2.setBounds(((int) rectF.left) - AndroidUtilities.dp(f2), ((int) rectF.top) - AndroidUtilities.dp(f4), (int) rectF.right, AndroidUtilities.dp(f4) + ((int) rectF.bottom));
                            messageDrawable2.overrideRoundRadius = (int) (rectF.height() * f3);
                            messageDrawable2.draw(canvas, paint3);
                            return;
                        }
                        canvas.drawRoundRect(rectF, rectF.height() * f3, rectF.height() * f3, paint3);
                        if (themeSmallPreviewView.themeUserByUserId != 0) {
                            float fCenterY = rectF.centerY();
                            float fHeight = (rectF.height() / f4) + rectF.left;
                            float fHeight2 = rectF.right - (rectF.height() / f4);
                            rectF.set(fHeight - AndroidUtilities.dp(8.0f), fCenterY - AndroidUtilities.dp(8.0f), fHeight + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + fCenterY);
                            ImageReceiver imageReceiver = themeSmallPreviewView.avatarImageReceiver;
                            imageReceiver.setImageCoords(rectF);
                            imageReceiver.draw(canvas);
                            if (this.rotateDrawable == null) {
                                this.rotateDrawable = themeSmallPreviewView.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                            }
                            int i4 = (int) fHeight2;
                            int i5 = (int) fCenterY;
                            this.rotateDrawable.setBounds(i4 - AndroidUtilities.dp(8.0f), i5 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i4, AndroidUtilities.dp(8.0f) + i5);
                            this.rotateDrawable.draw(canvas);
                            return;
                        }
                        return;
                    }
                    return;
                }
                themeSmallPreviewView.chatThemeItem.chatTheme.getClass();
            }
            if (themeSmallPreviewView.fallbackWallpaper == null) {
                Paint paint4 = themeSmallPreviewView.backgroundFillPaint;
                float f10 = themeSmallPreviewView.INNER_RADIUS;
                canvas.drawRoundRect(rectF, f10, f10, paint4);
                canvas.save();
                StaticLayout noThemeStaticLayout = themeSmallPreviewView.getNoThemeStaticLayout();
                canvas.translate((themeSmallPreviewView.getWidth() - noThemeStaticLayout.getWidth()) * 0.5f, AndroidUtilities.dp(18.0f));
                noThemeStaticLayout.draw(canvas);
                canvas.restore();
            }
        }

        public final void drawBackground(Canvas canvas, float f) {
            EmojiThemes emojiThemes;
            int[] iArr;
            int i;
            Drawable drawable = this.previewDrawable;
            ThemeSmallPreviewView themeSmallPreviewView = ThemeSmallPreviewView.this;
            if (drawable == null) {
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem = themeSmallPreviewView.chatThemeItem;
                if (chatThemeItem == null || (emojiThemes = chatThemeItem.chatTheme) == null || !emojiThemes.isAnyStub() || themeSmallPreviewView.chatBackgroundDrawable == null) {
                    RectF rectF = themeSmallPreviewView.rectF;
                    Paint paint = themeSmallPreviewView.backgroundFillPaint;
                    float f2 = themeSmallPreviewView.INNER_RADIUS;
                    canvas.drawRoundRect(rectF, f2, f2, paint);
                    return;
                }
                return;
            }
            canvas.save();
            canvas.clipPath(themeSmallPreviewView.clipPath);
            Drawable drawable2 = this.previewDrawable;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.previewDrawable.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > themeSmallPreviewView.getWidth() / themeSmallPreviewView.getHeight()) {
                    int width = (int) ((themeSmallPreviewView.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - themeSmallPreviewView.getWidth()) / 2;
                    this.previewDrawable.setBounds(width2, 0, width + width2, themeSmallPreviewView.getHeight());
                } else {
                    int height = (int) ((themeSmallPreviewView.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (themeSmallPreviewView.getHeight() - height) / 2;
                    this.previewDrawable.setBounds(0, height2, themeSmallPreviewView.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, themeSmallPreviewView.getWidth(), themeSmallPreviewView.getHeight());
            }
            this.previewDrawable.setAlpha((int) (255.0f * f));
            this.previewDrawable.draw(canvas);
            Drawable drawable3 = this.previewDrawable;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof MotionBackgroundDrawable) && (i = (iArr = ((MotionBackgroundDrawable) drawable3).colors)[0]) == iArr[1] && i == iArr[2] && i == iArr[3])) {
                int alpha = themeSmallPreviewView.outlineBackgroundPaint.getAlpha();
                themeSmallPreviewView.outlineBackgroundPaint.setAlpha((int) (alpha * f));
                float f3 = themeSmallPreviewView.INNER_RECT_SPACE;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f3, f3, themeSmallPreviewView.getWidth() - f3, themeSmallPreviewView.getHeight() - f3);
                float f4 = themeSmallPreviewView.INNER_RADIUS;
                canvas.drawRoundRect(rectF2, f4, f4, themeSmallPreviewView.outlineBackgroundPaint);
                themeSmallPreviewView.outlineBackgroundPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
    }

    public ThemeSmallPreviewView(int i, int i2, Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.STROKE_RADIUS = AndroidUtilities.dp(8.0f);
        this.INNER_RADIUS = AndroidUtilities.dp(6.0f);
        this.INNER_RECT_SPACE = AndroidUtilities.dp(4.0f);
        this.BUBBLE_HEIGHT = AndroidUtilities.dp(21.0f);
        this.BUBBLE_WIDTH = AndroidUtilities.dp(41.0f);
        this.themeDrawable = new ThemeDrawable();
        this.changeThemeProgress = 1.0f;
        Paint paint = new Paint(1);
        this.outlineBackgroundPaint = paint;
        this.backgroundFillPaint = new Paint(1);
        this.rectF = new RectF();
        this.clipPath = new Path();
        this.messageDrawableOut = new MessageDrawable(0, true, false, null);
        this.messageDrawableIn = new MessageDrawable(0, false, false, null);
        this.currentType = i2;
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.avatarImageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        setBackgroundColor(Theme.getColor(Theme.key_dialogBackgroundGray, resourcesProvider));
        BackupImageView backupImageView = new BackupImageView(context);
        this.backupImageView = backupImageView;
        backupImageView.getImageReceiver().setCrossfadeWithOldImage(true);
        backupImageView.getImageReceiver().setAllowStartLottieAnimation(false);
        backupImageView.getImageReceiver().setAutoRepeat(0);
        if (i2 == 0 || i2 == 3 || i2 == 2) {
            addView(backupImageView, LayoutHelper.createFrame(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(backupImageView, LayoutHelper.createFrame(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        }
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(551805923);
    }

    public StaticLayout getNoThemeStaticLayout() {
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(129);
        this.noThemeTextPaint = textPaint;
        textPaint.setColor(Theme.getColor(Theme.key_chat_emojiPanelTrendingDescription, this.resourcesProvider));
        this.noThemeTextPaint.setTextSize(AndroidUtilities.dp(noThemeStringTextSize()));
        this.noThemeTextPaint.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(52.0f);
        int i = this.currentType;
        if (i == 3 || i == 4) {
            iDp = AndroidUtilities.dp(77.0f);
        }
        int i2 = iDp;
        String strNoThemeString = noThemeString();
        TextPaint textPaint2 = this.noThemeTextPaint;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout staticLayoutCreateStaticLayout2 = StaticLayoutEx.createStaticLayout2(strNoThemeString, textPaint2, i2, true, i2, 3);
        this.textLayout = staticLayoutCreateStaticLayout2;
        return staticLayoutCreateStaticLayout2;
    }

    public static Bitmap prescaleBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float fMax = Math.max(AndroidUtilities.dp(120.0f) / bitmap.getWidth(), AndroidUtilities.dp(140.0f) / bitmap.getHeight());
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || Math.abs(fMax - 1.0f) < 0.0125f) {
            return bitmap;
        }
        int width = (int) (bitmap.getWidth() * fMax);
        int height = (int) (bitmap.getHeight() * fMax);
        return (height <= 0 || width <= 0) ? bitmap : Bitmap.createScaledBitmap(bitmap, width, height, true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ThemeDrawable themeDrawable;
        ThemeDrawable themeDrawable2;
        if (this.chatThemeItem == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.chatBackgroundDrawable != null) {
            canvas.save();
            canvas.clipPath(this.clipPath);
            this.chatBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.chatBackgroundDrawable.draw(canvas);
            canvas.restore();
        }
        if (this.changeThemeProgress != 1.0f && (themeDrawable2 = this.animateOutThemeDrawable) != null) {
            themeDrawable2.drawBackground(canvas, 1.0f);
        }
        float f = this.changeThemeProgress;
        if (f != 0.0f) {
            this.themeDrawable.drawBackground(canvas, f);
        }
        if (this.changeThemeProgress != 1.0f && (themeDrawable = this.animateOutThemeDrawable) != null) {
            themeDrawable.draw(canvas, 1.0f);
        }
        float f2 = this.changeThemeProgress;
        if (f2 != 0.0f) {
            this.themeDrawable.draw(canvas, f2);
        }
        float f3 = this.changeThemeProgress;
        if (f3 != 1.0f) {
            float f4 = f3 + 0.10666667f;
            this.changeThemeProgress = f4;
            if (f4 >= 1.0f) {
                this.changeThemeProgress = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public String noThemeString() {
        return LocaleController.getString(R.string.ChatNoTheme);
    }

    public int noThemeStringTextSize() {
        return 14;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.attached = true;
        ChatBackgroundDrawable chatBackgroundDrawable = this.chatBackgroundDrawable;
        if (chatBackgroundDrawable != null) {
            chatBackgroundDrawable.onAttachedToWindow(this);
        }
        this.avatarImageReceiver.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.attached = false;
        ChatBackgroundDrawable chatBackgroundDrawable = this.chatBackgroundDrawable;
        if (chatBackgroundDrawable != null) {
            chatBackgroundDrawable.onDetachedFromWindow(this);
        }
        this.avatarImageReceiver.onDetachedFromWindow();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.isSelected);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = this.currentType;
        if (i3 == 1 || i3 == 4) {
            int size = View.MeasureSpec.getSize(i);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 1.2f), 1073741824));
        } else {
            int iDp = AndroidUtilities.dp(i3 == 0 ? 77.0f : 83.0f);
            int size2 = View.MeasureSpec.getSize(i2);
            if (size2 == 0) {
                size2 = (int) (iDp * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        BackupImageView backupImageView = this.backupImageView;
        backupImageView.setPivotY(backupImageView.getMeasuredHeight());
        backupImageView.setPivotX(backupImageView.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        RectF rectF = this.rectF;
        float f = this.INNER_RECT_SPACE;
        rectF.set(f, f, i - f, i2 - f);
        Path path = this.clipPath;
        path.reset();
        float f2 = this.INNER_RADIUS;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
    }

    public final void playEmojiAnimation() {
        if (this.backupImageView.getImageReceiver().getLottieAnimation() != null) {
            AndroidUtilities.cancelRunOnUIThread(this.animationCancelRunnable);
            this.backupImageView.setVisibility(0);
            if (!this.backupImageView.getImageReceiver().getLottieAnimation().isRunning) {
                this.backupImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, true, false);
                this.backupImageView.getImageReceiver().getLottieAnimation().start();
            }
            this.backupImageView.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0 = new Tooltip$$ExternalSyntheticLambda0(this, 1);
            this.animationCancelRunnable = tooltip$$ExternalSyntheticLambda0;
            AndroidUtilities.runOnUIThread(tooltip$$ExternalSyntheticLambda0, 2500L);
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        Paint paint = this.backgroundFillPaint;
        int i2 = Theme.key_dialogBackgroundGray;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        paint.setColor(Theme.getColor(i2, resourcesProvider));
        TextPaint textPaint = this.noThemeTextPaint;
        if (textPaint != null) {
            textPaint.setColor(Theme.getColor(Theme.key_chat_emojiPanelTrendingDescription, resourcesProvider));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.fallbackWallpaper != wallPaper) {
            this.fallbackWallpaper = wallPaper;
            ChatThemeBottomSheet.ChatThemeItem chatThemeItem = this.chatThemeItem;
            if (chatThemeItem != null) {
                this.chatThemeItem = null;
                setItem(chatThemeItem, 0L, false);
            }
        }
    }

    public final void setItem(ChatThemeBottomSheet.ChatThemeItem chatThemeItem, long j, boolean z) {
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        EmojiThemes emojiThemes;
        EmojiThemes.ThemeItem themeItem;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Theme.ThemeInfo themeInfo;
        EmojiThemes emojiThemes2;
        Drawable motionBackgroundDrawable;
        int i6;
        int i7;
        int i8;
        int i9;
        MotionBackgroundDrawable motionBackgroundDrawable2;
        ChatBackgroundDrawable chatBackgroundDrawable;
        ChatBackgroundDrawable chatBackgroundDrawable2;
        boolean z2 = this.chatThemeItem != chatThemeItem;
        int i10 = this.lastThemeIndex;
        int i11 = chatThemeItem.themeIndex;
        boolean z3 = i10 != i11;
        this.lastThemeIndex = i11;
        this.chatThemeItem = chatThemeItem;
        TLRPC.Document emojiAnimatedSticker = chatThemeItem.chatTheme.getEmojiAnimatedSticker();
        EmojiThemes emojiThemes3 = chatThemeItem.chatTheme;
        long j2 = 0;
        long giftThemeUser = emojiThemes3.chatTheme instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(emojiThemes3.currentAccount).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) emojiThemes3.chatTheme).gift.slug) : 0L;
        this.themeUserByUserId = giftThemeUser;
        if (j == giftThemeUser) {
            this.themeUserByUserId = 0L;
        }
        String str = null;
        if (this.themeUserByUserId != 0) {
            if (this.avatarDrawable == null) {
                this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            }
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.themeUserByUserId);
            this.avatarDrawable.setInfo(this.currentAccount, userOrChat);
            this.avatarImageReceiver.setForUserOrChat(userOrChat, this.avatarDrawable);
        } else {
            this.avatarImageReceiver.clearImage();
        }
        if (z2) {
            Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0 = this.animationCancelRunnable;
            if (tooltip$$ExternalSyntheticLambda0 != null) {
                AndroidUtilities.cancelRunOnUIThread(tooltip$$ExternalSyntheticLambda0);
                this.animationCancelRunnable = null;
            }
            this.backupImageView.animate().cancel();
            this.backupImageView.setScaleX(1.0f);
            this.backupImageView.setScaleY(1.0f);
        }
        if (z2) {
            Drawable svgThumb = emojiAnimatedSticker != null ? DocumentObject.getSvgThumb(emojiAnimatedSticker, Theme.key_emptyListPlaceholder, 0.2f) : null;
            if (svgThumb == null) {
                Emoji.preloadEmoji(chatThemeItem.chatTheme.emoji);
                svgThumb = Emoji.getEmojiDrawable(chatThemeItem.chatTheme.emoji);
            }
            this.backupImageView.setImage(ImageLocation.getForDocument(emojiAnimatedSticker), "50_50", svgThumb, null);
            chatThemeItem.chatTheme.getClass();
            TLRPC.WallPaper wallPaper = this.fallbackWallpaper;
            if (wallPaper != null) {
                if (this.attached && (chatBackgroundDrawable2 = this.chatBackgroundDrawable) != null) {
                    chatBackgroundDrawable2.onDetachedFromWindow(this);
                }
                ChatBackgroundDrawable chatBackgroundDrawable3 = new ChatBackgroundDrawable(wallPaper, false, true);
                this.chatBackgroundDrawable = chatBackgroundDrawable3;
                chatBackgroundDrawable3.parent = this;
                MotionBackgroundDrawable motionBackgroundDrawable3 = chatBackgroundDrawable3.motionBackgroundDrawable;
                if (motionBackgroundDrawable3 != null) {
                    motionBackgroundDrawable3.setParentView(this);
                }
                if (this.attached) {
                    this.chatBackgroundDrawable.onAttachedToWindow(this);
                }
            } else {
                if (this.attached && (chatBackgroundDrawable = this.chatBackgroundDrawable) != null) {
                    chatBackgroundDrawable.onDetachedFromWindow(this);
                }
                this.chatBackgroundDrawable = null;
            }
        }
        this.backupImageView.setVisibility((!chatThemeItem.chatTheme.isAnyStub() || this.fallbackWallpaper == null) ? 0 : 8);
        if (z2 || z3) {
            if (z) {
                this.changeThemeProgress = 0.0f;
                this.animateOutThemeDrawable = this.themeDrawable;
                this.themeDrawable = new ThemeDrawable();
                invalidate();
            } else {
                this.changeThemeProgress = 1.0f;
            }
            ThemeDrawable themeDrawable = this.themeDrawable;
            ChatThemeBottomSheet.ChatThemeItem chatThemeItem2 = this.chatThemeItem;
            if (chatThemeItem2 == null || (emojiThemes = chatThemeItem2.chatTheme) == null) {
                j2 = 0;
            } else {
                EmojiThemes.ThemeItem themeItem2 = (EmojiThemes.ThemeItem) emojiThemes.items.get(chatThemeItem2.themeIndex);
                int i12 = themeItem2.inBubbleColor;
                if (this.themeUserByUserId != 0) {
                    i12 = themeItem2.patternBgColor;
                }
                themeDrawable.inBubblePaint.setColor(i12);
                themeDrawable.outBubblePaintSecond.setColor(themeItem2.outBubbleColor);
                int color = this.chatThemeItem.chatTheme.isAnyStub() ? Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider) : themeItem2.outLineColor;
                int alpha = themeDrawable.strokePaint.getAlpha();
                themeDrawable.strokePaint.setColor(color);
                themeDrawable.strokePaint.setAlpha(alpha);
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem3 = this.chatThemeItem;
                ITheme iTheme = (ITheme) chatThemeItem3.chatTheme.items.get(chatThemeItem3.themeIndex);
                if (iTheme != null) {
                    EmojiThemes.ThemeItem themeItem3 = (EmojiThemes.ThemeItem) iTheme;
                    if (themeItem3.getThemeId() != 0) {
                        ChatThemeBottomSheet.ChatThemeItem chatThemeItem4 = this.chatThemeItem;
                        int i13 = ((EmojiThemes.ThemeItem) chatThemeItem4.chatTheme.items.get(chatThemeItem4.themeIndex)).settingsIndex;
                        TLRPC.ThemeSettings themeSettings = themeItem3.getThemeSettings(i13);
                        Paint paint = themeDrawable.outBubblePaintSecond;
                        ArrayList<Integer> arrayList = themeSettings.message_colors;
                        if (arrayList.size() > 1) {
                            int[] iArr = new int[arrayList.size()];
                            for (int i14 = 0; i14 != arrayList.size(); i14++) {
                                iArr[i14] = arrayList.get(i14).intValue() | (-16777216);
                            }
                            float fDp = this.INNER_RECT_SPACE + AndroidUtilities.dp(8.0f);
                            paint.setShader(new LinearGradient(0.0f, fDp, 0.0f, fDp + this.BUBBLE_HEIGHT, iArr, (float[]) null, Shader.TileMode.CLAMP));
                        } else {
                            paint.setShader(null);
                        }
                        themeDrawable.outBubblePaintSecond.setAlpha(255);
                        if (this.chatThemeItem != null) {
                            if (i13 >= 0) {
                                TLRPC.WallPaperSettings wallPaperSettings = themeItem3.getThemeSettings(i13).wallpaper.settings;
                                int i15 = wallPaperSettings.background_color;
                                int i16 = wallPaperSettings.second_background_color;
                                int i17 = wallPaperSettings.third_background_color;
                                i9 = wallPaperSettings.fourth_background_color;
                                i6 = i15;
                                i7 = i16;
                                i8 = i17;
                            } else {
                                i6 = 0;
                                i7 = 0;
                                i8 = 0;
                                i9 = 0;
                            }
                            if (i7 != 0) {
                                motionBackgroundDrawable2 = new MotionBackgroundDrawable(i6, i7, i8, i9, true, 0, false);
                                this.patternColor = motionBackgroundDrawable2.getPatternColor();
                            } else {
                                MotionBackgroundDrawable motionBackgroundDrawable4 = new MotionBackgroundDrawable(i6, i6, i6, i6, true, 0, false);
                                this.patternColor = -16777216;
                                motionBackgroundDrawable2 = motionBackgroundDrawable4;
                            }
                            this.chatThemeItem.previewDrawable = motionBackgroundDrawable2;
                        }
                    } else {
                        ChatThemeBottomSheet.ChatThemeItem chatThemeItem5 = this.chatThemeItem;
                        themeItem = (EmojiThemes.ThemeItem) chatThemeItem5.chatTheme.items.get(chatThemeItem5.themeIndex);
                        if (this.chatThemeItem == null) {
                            i = themeItem.patternBgColor;
                            i2 = themeItem.patternBgGradientColor1;
                            i3 = themeItem.patternBgGradientColor2;
                            i4 = themeItem.patternBgGradientColor3;
                            i5 = themeItem.patternBgRotation;
                            if (themeItem.themeInfo.getAccent(false) != null) {
                                if (i2 != 0) {
                                    MotionBackgroundDrawable motionBackgroundDrawable5 = new MotionBackgroundDrawable(i, i2, i3, i4, true, i5, false);
                                    this.patternColor = motionBackgroundDrawable5.getPatternColor();
                                    motionBackgroundDrawable = motionBackgroundDrawable5;
                                } else {
                                    MotionBackgroundDrawable motionBackgroundDrawable6 = new MotionBackgroundDrawable(i, i, i, i, true, i5, false);
                                    this.patternColor = -16777216;
                                    motionBackgroundDrawable = motionBackgroundDrawable6;
                                }
                            } else if (i == 0 && i2 != 0) {
                                motionBackgroundDrawable = new MotionBackgroundDrawable(i, i2, i3, i4, true, i5, false);
                            } else if (i != 0) {
                                motionBackgroundDrawable = new ColorDrawable(i);
                            } else {
                                themeInfo = themeItem.themeInfo;
                                if (themeInfo != null || (themeInfo.previewWallpaperOffset <= 0 && themeInfo.pathToWallpaper == null)) {
                                    emojiThemes2 = this.chatThemeItem.chatTheme;
                                    if (emojiThemes2 == null && emojiThemes2.isAnyStub()) {
                                        motionBackgroundDrawable = null;
                                    } else {
                                        motionBackgroundDrawable = new MotionBackgroundDrawable(-2368069, -9722489, -2762611, -7817084, true, 0, false);
                                    }
                                } else {
                                    float fDp2 = AndroidUtilities.dp(112.0f);
                                    float fDp3 = AndroidUtilities.dp(134.0f);
                                    Theme.ThemeInfo themeInfo2 = themeItem.themeInfo;
                                    Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(fDp2, fDp3, themeInfo2.pathToWallpaper, themeInfo2.pathToFile, themeInfo2.previewWallpaperOffset);
                                    if (scaledBitmap != null) {
                                        BitmapDrawable bitmapDrawable = new BitmapDrawable(scaledBitmap);
                                        bitmapDrawable.setFilterBitmap(true);
                                        motionBackgroundDrawable = bitmapDrawable;
                                    } else {
                                        motionBackgroundDrawable = null;
                                    }
                                }
                            }
                            this.chatThemeItem.previewDrawable = motionBackgroundDrawable;
                        }
                    }
                } else {
                    ChatThemeBottomSheet.ChatThemeItem chatThemeItem6 = this.chatThemeItem;
                    themeItem = (EmojiThemes.ThemeItem) chatThemeItem6.chatTheme.items.get(chatThemeItem6.themeIndex);
                    if (this.chatThemeItem == null) {
                        i = themeItem.patternBgColor;
                        i2 = themeItem.patternBgGradientColor1;
                        i3 = themeItem.patternBgGradientColor2;
                        i4 = themeItem.patternBgGradientColor3;
                        i5 = themeItem.patternBgRotation;
                        if (themeItem.themeInfo.getAccent(false) != null) {
                            if (i2 != 0) {
                                MotionBackgroundDrawable motionBackgroundDrawable7 = new MotionBackgroundDrawable(i, i2, i3, i4, true, i5, false);
                                this.patternColor = motionBackgroundDrawable7.getPatternColor();
                                motionBackgroundDrawable = motionBackgroundDrawable7;
                            } else {
                                MotionBackgroundDrawable motionBackgroundDrawable8 = new MotionBackgroundDrawable(i, i, i, i, true, i5, false);
                                this.patternColor = -16777216;
                                motionBackgroundDrawable = motionBackgroundDrawable8;
                            }
                        } else if (i == 0) {
                            if (i != 0) {
                                motionBackgroundDrawable = new ColorDrawable(i);
                            } else {
                                themeInfo = themeItem.themeInfo;
                                if (themeInfo != null) {
                                    emojiThemes2 = this.chatThemeItem.chatTheme;
                                    if (emojiThemes2 == null) {
                                    }
                                    motionBackgroundDrawable = new MotionBackgroundDrawable(-2368069, -9722489, -2762611, -7817084, true, 0, false);
                                } else {
                                    emojiThemes2 = this.chatThemeItem.chatTheme;
                                    if (emojiThemes2 == null) {
                                    }
                                    motionBackgroundDrawable = new MotionBackgroundDrawable(-2368069, -9722489, -2762611, -7817084, true, 0, false);
                                }
                            }
                        } else if (i != 0) {
                            motionBackgroundDrawable = new ColorDrawable(i);
                        } else {
                            themeInfo = themeItem.themeInfo;
                            if (themeInfo != null) {
                                emojiThemes2 = this.chatThemeItem.chatTheme;
                                if (emojiThemes2 == null) {
                                }
                                motionBackgroundDrawable = new MotionBackgroundDrawable(-2368069, -9722489, -2762611, -7817084, true, 0, false);
                            } else {
                                emojiThemes2 = this.chatThemeItem.chatTheme;
                                if (emojiThemes2 == null) {
                                }
                                motionBackgroundDrawable = new MotionBackgroundDrawable(-2368069, -9722489, -2762611, -7817084, true, 0, false);
                            }
                        }
                        this.chatThemeItem.previewDrawable = motionBackgroundDrawable;
                    }
                }
                themeDrawable.previewDrawable = this.chatThemeItem.previewDrawable;
                invalidate();
            }
            long themeId = ((EmojiThemes.ThemeItem) chatThemeItem.chatTheme.items.get(this.lastThemeIndex)).getThemeId();
            if (themeId != j2) {
                TLRPC.WallPaper wallpaper = chatThemeItem.chatTheme.getWallpaper(this.lastThemeIndex);
                if (wallpaper != null) {
                    chatThemeItem.chatTheme.loadWallpaperThumb(this.lastThemeIndex, new BotVerifySheet$$ExternalSyntheticLambda0(this, themeId, chatThemeItem, wallpaper.settings.intensity));
                }
            } else {
                SparseArray sparseArray = ((EmojiThemes.ThemeItem) chatThemeItem.chatTheme.items.get(this.lastThemeIndex)).themeInfo.themeAccentsMap;
                Theme.ThemeAccent themeAccent = sparseArray != null ? (Theme.ThemeAccent) sparseArray.get(((EmojiThemes.ThemeItem) chatThemeItem.chatTheme.items.get(this.lastThemeIndex)).accentId) : null;
                if (themeAccent != null && (tL_theme = themeAccent.info) != null && tL_theme.settings.size() > 0) {
                    TLRPC.WallPaper wallPaper2 = themeAccent.info.settings.get(0).wallpaper;
                    if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120), document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setAllowLoadingOnAttachedOnly(false);
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new VoIPFragment$$ExternalSyntheticLambda42(this, chatThemeItem, wallPaper2, 6));
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (themeAccent != null && themeAccent.info == null) {
                    int i18 = (int) (themeAccent.patternIntensity * 100.0f);
                    Drawable drawable = chatThemeItem.previewDrawable;
                    if (drawable instanceof MotionBackgroundDrawable) {
                        MotionBackgroundDrawable motionBackgroundDrawable9 = (MotionBackgroundDrawable) drawable;
                        motionBackgroundDrawable9.setPatternBitmap(motionBackgroundDrawable9.patternBitmap, i18);
                    }
                    ChatThemeController.chatThemeQueue.postRunnable(new PollItemMenu$$ExternalSyntheticLambda17(this, chatThemeItem, i18, 14));
                }
            }
        }
        if (!z) {
            this.backupImageView.animate().cancel();
            this.backupImageView.setScaleX(1.0f);
            this.backupImageView.setScaleY(1.0f);
            AndroidUtilities.cancelRunOnUIThread(this.animationCancelRunnable);
            if (this.backupImageView.getImageReceiver().getLottieAnimation() != null) {
                RLottieDrawable lottieAnimation = this.backupImageView.getImageReceiver().getLottieAnimation();
                lottieAnimation.isRunning = false;
                lottieAnimation.checkChoreographer$1();
                this.backupImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false, false);
            }
        }
        EmojiThemes emojiThemes4 = this.chatThemeItem.chatTheme;
        if (emojiThemes4 == null || emojiThemes4.isAnyStub()) {
            setContentDescription(LocaleController.getString(R.string.ChatNoTheme));
            return;
        }
        ThemeKey themeKey = this.chatThemeItem.chatTheme.key;
        if (themeKey != null && (str = themeKey.giftSlug) == null) {
            str = themeKey.emoticon;
        }
        setContentDescription(str);
    }

    public final void setSelected(boolean z, boolean z2) {
        if (!z2) {
            ValueAnimator valueAnimator = this.strokeAlphaAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.isSelected = z;
            this.selectionProgress = z ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        if (this.isSelected != z) {
            float f = this.selectionProgress;
            ValueAnimator valueAnimator2 = this.strokeAlphaAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            this.strokeAlphaAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 26));
            this.strokeAlphaAnimator.addListener(new LoginActivity.AnonymousClass9(10, this, z));
            this.strokeAlphaAnimator.setDuration(250L);
            this.strokeAlphaAnimator.start();
        }
        this.isSelected = z;
    }
}
