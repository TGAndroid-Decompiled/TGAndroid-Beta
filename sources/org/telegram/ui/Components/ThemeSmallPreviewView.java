package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_theme;
import org.telegram.tgnet.TLRPC$WallPaper;
import org.telegram.tgnet.TLRPC$WallPaperSettings;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ChatThemeBottomSheet;

public class ThemeSmallPreviewView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    ThemeDrawable animateOutThemeDrawable;
    Runnable animationCancelRunnable;
    private BackupImageView backupImageView;
    public ChatThemeBottomSheet.ChatThemeItem chatThemeItem;
    private final int currentAccount;
    private int currentType;
    boolean isSelected;
    public int lastThemeIndex;
    private TextPaint noThemeTextPaint;
    int patternColor;
    private final Theme.ResourcesProvider resourcesProvider;
    private float selectionProgress;
    private ValueAnimator strokeAlphaAnimator;
    private StaticLayout textLayout;
    private final float STROKE_RADIUS = AndroidUtilities.dp(8.0f);
    private final float INNER_RADIUS = AndroidUtilities.dp(6.0f);
    private final float INNER_RECT_SPACE = AndroidUtilities.dp(4.0f);
    private final float BUBBLE_HEIGHT = AndroidUtilities.dp(21.0f);
    private final float BUBBLE_WIDTH = AndroidUtilities.dp(41.0f);
    ThemeDrawable themeDrawable = new ThemeDrawable();
    private float changeThemeProgress = 1.0f;
    Paint outlineBackgroundPaint = new Paint(1);
    private final Paint backgroundFillPaint = new Paint(1);
    private final RectF rectF = new RectF();
    private final Path clipPath = new Path();
    Theme.MessageDrawable messageDrawableOut = new Theme.MessageDrawable(0, true, false);
    Theme.MessageDrawable messageDrawableIn = new Theme.MessageDrawable(0, false, false);

    public ThemeSmallPreviewView(Context context, int i, Theme.ResourcesProvider resourcesProvider, int i2) {
        super(context);
        this.currentType = i2;
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        setBackgroundColor(getThemedColor("dialogBackgroundGray"));
        BackupImageView backupImageView = new BackupImageView(context);
        this.backupImageView = backupImageView;
        backupImageView.getImageReceiver().setCrossfadeWithOldImage(true);
        this.backupImageView.getImageReceiver().setAllowStartLottieAnimation(false);
        this.backupImageView.getImageReceiver().setAutoRepeat(0);
        if (i2 == 0 || i2 == 2) {
            addView(this.backupImageView, LayoutHelper.createFrame(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(this.backupImageView, LayoutHelper.createFrame(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        }
        this.outlineBackgroundPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.outlineBackgroundPaint.setStyle(Paint.Style.STROKE);
        this.outlineBackgroundPaint.setColor(551805923);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.currentType == 1) {
            int size = View.MeasureSpec.getSize(i);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 1.2f), 1073741824));
        } else {
            int dp = AndroidUtilities.dp(77.0f);
            int size2 = View.MeasureSpec.getSize(i2);
            if (size2 == 0) {
                size2 = (int) (dp * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        BackupImageView backupImageView = this.backupImageView;
        backupImageView.setPivotY(backupImageView.getMeasuredHeight());
        BackupImageView backupImageView2 = this.backupImageView;
        backupImageView2.setPivotX(backupImageView2.getMeasuredWidth() / 2.0f);
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            RectF rectF = this.rectF;
            float f = this.INNER_RECT_SPACE;
            rectF.set(f, f, i - f, i2 - f);
            this.clipPath.reset();
            Path path = this.clipPath;
            RectF rectF2 = this.rectF;
            float f2 = this.INNER_RADIUS;
            path.addRoundRect(rectF2, f2, f2, Path.Direction.CW);
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        ThemeDrawable themeDrawable;
        ThemeDrawable themeDrawable2;
        if (this.chatThemeItem == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (!(this.changeThemeProgress == 1.0f || (themeDrawable2 = this.animateOutThemeDrawable) == null)) {
            themeDrawable2.drawBackground(canvas, 1.0f);
        }
        float f = this.changeThemeProgress;
        if (f != 0.0f) {
            this.themeDrawable.drawBackground(canvas, f);
        }
        if (!(this.changeThemeProgress == 1.0f || (themeDrawable = this.animateOutThemeDrawable) == null)) {
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

    public void setItem(final ChatThemeBottomSheet.ChatThemeItem chatThemeItem, boolean z) {
        TLRPC$TL_theme tLRPC$TL_theme;
        TLRPC$Document tLRPC$Document;
        boolean z2 = true;
        boolean z3 = this.chatThemeItem != chatThemeItem;
        int i = this.lastThemeIndex;
        int i2 = chatThemeItem.themeIndex;
        if (i == i2) {
            z2 = false;
        }
        this.lastThemeIndex = i2;
        this.chatThemeItem = chatThemeItem;
        Theme.ThemeAccent themeAccent = null;
        TLRPC$Document emojiAnimatedSticker = chatThemeItem.chatTheme.getEmoticon() != null ? MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(chatThemeItem.chatTheme.getEmoticon()) : null;
        if (z3) {
            Runnable runnable = this.animationCancelRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.animationCancelRunnable = null;
            }
            this.backupImageView.animate().cancel();
            this.backupImageView.setScaleX(1.0f);
            this.backupImageView.setScaleY(1.0f);
        }
        if (z3) {
            Drawable svgThumb = emojiAnimatedSticker != null ? DocumentObject.getSvgThumb(emojiAnimatedSticker, "emptyListPlaceholder", 0.2f) : null;
            if (svgThumb == null) {
                Emoji.preloadEmoji(chatThemeItem.chatTheme.getEmoticon());
                svgThumb = Emoji.getEmojiDrawable(chatThemeItem.chatTheme.getEmoticon());
            }
            this.backupImageView.setImage(ImageLocation.getForDocument(emojiAnimatedSticker), "50_50", svgThumb, (Object) null);
        }
        if (z3 || z2) {
            if (z) {
                this.changeThemeProgress = 0.0f;
                this.animateOutThemeDrawable = this.themeDrawable;
                this.themeDrawable = new ThemeDrawable();
                invalidate();
            } else {
                this.changeThemeProgress = 1.0f;
            }
            updatePreviewBackground(this.themeDrawable);
            TLRPC$TL_theme tlTheme = chatThemeItem.chatTheme.getTlTheme(this.lastThemeIndex);
            if (tlTheme != null) {
                final long j = tlTheme.id;
                TLRPC$WallPaper wallpaper = chatThemeItem.chatTheme.getWallpaper(this.lastThemeIndex);
                if (wallpaper != null) {
                    final int i3 = wallpaper.settings.intensity;
                    chatThemeItem.chatTheme.loadWallpaperThumb(this.lastThemeIndex, new ResultCallback() {
                        @Override
                        public final void onComplete(Object obj) {
                            ThemeSmallPreviewView.this.lambda$setItem$0(j, chatThemeItem, i3, (Pair) obj);
                        }

                        @Override
                        public void onError(TLRPC$TL_error tLRPC$TL_error) {
                            ResultCallback.CC.$default$onError(this, tLRPC$TL_error);
                        }
                    });
                }
            } else {
                SparseArray<Theme.ThemeAccent> sparseArray = chatThemeItem.chatTheme.getThemeInfo(this.lastThemeIndex).themeAccentsMap;
                if (sparseArray != null) {
                    themeAccent = sparseArray.get(chatThemeItem.chatTheme.getAccentId(this.lastThemeIndex));
                }
                if (themeAccent != null && (tLRPC$TL_theme = themeAccent.info) != null && tLRPC$TL_theme.settings.size() > 0) {
                    final TLRPC$WallPaper tLRPC$WallPaper = themeAccent.info.settings.get(0).wallpaper;
                    if (!(tLRPC$WallPaper == null || (tLRPC$Document = tLRPC$WallPaper.document) == null)) {
                        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 120), tLRPC$Document);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        imageReceiver.setImage(forDocument, "120_140", null, null, null, 1);
                        imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                            @Override
                            public final void didSetImage(ImageReceiver imageReceiver2, boolean z4, boolean z5, boolean z6) {
                                ThemeSmallPreviewView.this.lambda$setItem$1(chatThemeItem, tLRPC$WallPaper, imageReceiver2, z4, z5, z6);
                            }

                            @Override
                            public void onAnimationReady(ImageReceiver imageReceiver2) {
                                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver2);
                            }
                        });
                        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    }
                } else if (themeAccent != null && themeAccent.info == null) {
                    ChatThemeController.chatThemeQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            ThemeSmallPreviewView.this.lambda$setItem$3(chatThemeItem);
                        }
                    });
                }
            }
        }
        if (!z) {
            this.backupImageView.animate().cancel();
            this.backupImageView.setScaleX(1.0f);
            this.backupImageView.setScaleY(1.0f);
            AndroidUtilities.cancelRunOnUIThread(this.animationCancelRunnable);
            if (this.backupImageView.getImageReceiver().getLottieAnimation() != null) {
                this.backupImageView.getImageReceiver().getLottieAnimation().stop();
                this.backupImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false);
            }
        }
        EmojiThemes emojiThemes = this.chatThemeItem.chatTheme;
        if (emojiThemes == null || emojiThemes.showAsDefaultStub) {
            setContentDescription(LocaleController.getString("ChatNoTheme", R.string.ChatNoTheme));
        } else {
            setContentDescription(emojiThemes.getEmoticon());
        }
    }

    public void lambda$setItem$0(long j, ChatThemeBottomSheet.ChatThemeItem chatThemeItem, int i, Pair pair) {
        if (pair != null && ((Long) pair.first).longValue() == j) {
            Drawable drawable = chatThemeItem.previewDrawable;
            if (drawable instanceof MotionBackgroundDrawable) {
                MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
                motionBackgroundDrawable.setPatternBitmap(i >= 0 ? 100 : -100, prescaleBitmap((Bitmap) pair.second), true);
                motionBackgroundDrawable.setPatternColorFilter(this.patternColor);
            }
            invalidate();
        }
    }

    public void lambda$setItem$1(ChatThemeBottomSheet.ChatThemeItem chatThemeItem, TLRPC$WallPaper tLRPC$WallPaper, ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Bitmap bitmap;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z && bitmapSafe != null && (bitmap = bitmapSafe.bitmap) != null) {
            Drawable drawable = chatThemeItem.previewDrawable;
            if (drawable instanceof MotionBackgroundDrawable) {
                MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
                TLRPC$WallPaperSettings tLRPC$WallPaperSettings = tLRPC$WallPaper.settings;
                motionBackgroundDrawable.setPatternBitmap((tLRPC$WallPaperSettings == null || tLRPC$WallPaperSettings.intensity >= 0) ? 100 : -100, prescaleBitmap(bitmap), true);
                motionBackgroundDrawable.setPatternColorFilter(this.patternColor);
                invalidate();
            }
        }
    }

    public void lambda$setItem$3(final ChatThemeBottomSheet.ChatThemeItem chatThemeItem) {
        final Bitmap bitmap = SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ThemeSmallPreviewView.this.lambda$setItem$2(chatThemeItem, bitmap);
            }
        });
    }

    public void lambda$setItem$2(ChatThemeBottomSheet.ChatThemeItem chatThemeItem, Bitmap bitmap) {
        Drawable drawable = chatThemeItem.previewDrawable;
        if (drawable instanceof MotionBackgroundDrawable) {
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
            motionBackgroundDrawable.setPatternBitmap(100, prescaleBitmap(bitmap), true);
            motionBackgroundDrawable.setPatternColorFilter(this.patternColor);
            invalidate();
        }
    }

    public void setSelected(final boolean z, boolean z2) {
        float f = 1.0f;
        if (!z2) {
            ValueAnimator valueAnimator = this.strokeAlphaAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.isSelected = z;
            if (!z) {
                f = 0.0f;
            }
            this.selectionProgress = f;
            invalidate();
            return;
        }
        if (this.isSelected != z) {
            float f2 = this.selectionProgress;
            ValueAnimator valueAnimator2 = this.strokeAlphaAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float[] fArr = new float[2];
            fArr[0] = f2;
            if (!z) {
                f = 0.0f;
            }
            fArr[1] = f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.strokeAlphaAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    ThemeSmallPreviewView.this.lambda$setSelected$4(valueAnimator3);
                }
            });
            this.strokeAlphaAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ThemeSmallPreviewView.this.selectionProgress = z ? 1.0f : 0.0f;
                    ThemeSmallPreviewView.this.invalidate();
                }
            });
            this.strokeAlphaAnimator.setDuration(250L);
            this.strokeAlphaAnimator.start();
        }
        this.isSelected = z;
    }

    public void lambda$setSelected$4(ValueAnimator valueAnimator) {
        this.selectionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    private Bitmap prescaleBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float max = Math.max(AndroidUtilities.dp(120.0f) / bitmap.getWidth(), AndroidUtilities.dp(140.0f) / bitmap.getHeight());
        return (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || Math.abs(max - 1.0f) < 0.0125f) ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * max), (int) (bitmap.getHeight() * max), true);
    }

    @Override
    public void setBackgroundColor(int i) {
        this.backgroundFillPaint.setColor(getThemedColor("dialogBackgroundGray"));
        TextPaint textPaint = this.noThemeTextPaint;
        if (textPaint != null) {
            textPaint.setColor(getThemedColor("chat_emojiPanelTrendingDescription"));
        }
        invalidate();
    }

    private void fillOutBubblePaint(Paint paint, List<Integer> list) {
        if (list.size() > 1) {
            int[] iArr = new int[list.size()];
            for (int i = 0; i != list.size(); i++) {
                iArr[i] = list.get(i).intValue();
            }
            float dp = this.INNER_RECT_SPACE + AndroidUtilities.dp(8.0f);
            paint.setShader(new LinearGradient(0.0f, dp, 0.0f, dp + this.BUBBLE_HEIGHT, iArr, (float[]) null, Shader.TileMode.CLAMP));
            return;
        }
        paint.setShader(null);
    }

    public void updatePreviewBackground(ThemeDrawable themeDrawable) {
        EmojiThemes emojiThemes;
        int i;
        ChatThemeBottomSheet.ChatThemeItem chatThemeItem = this.chatThemeItem;
        if (chatThemeItem != null && (emojiThemes = chatThemeItem.chatTheme) != null) {
            EmojiThemes.ThemeItem themeItem = emojiThemes.getThemeItem(chatThemeItem.themeIndex);
            themeDrawable.inBubblePaint.setColor(themeItem.inBubbleColor);
            themeDrawable.outBubblePaintSecond.setColor(themeItem.outBubbleColor);
            if (this.chatThemeItem.chatTheme.showAsDefaultStub) {
                i = getThemedColor("featuredStickers_addButton");
            } else {
                i = themeItem.outLineColor;
            }
            int alpha = themeDrawable.strokePaint.getAlpha();
            themeDrawable.strokePaint.setColor(i);
            themeDrawable.strokePaint.setAlpha(alpha);
            ChatThemeBottomSheet.ChatThemeItem chatThemeItem2 = this.chatThemeItem;
            TLRPC$TL_theme tlTheme = chatThemeItem2.chatTheme.getTlTheme(chatThemeItem2.themeIndex);
            if (tlTheme != null) {
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem3 = this.chatThemeItem;
                int settingsIndex = chatThemeItem3.chatTheme.getSettingsIndex(chatThemeItem3.themeIndex);
                fillOutBubblePaint(themeDrawable.outBubblePaintSecond, tlTheme.settings.get(settingsIndex).message_colors);
                themeDrawable.outBubblePaintSecond.setAlpha(255);
                getPreviewDrawable(tlTheme, settingsIndex);
            } else {
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem4 = this.chatThemeItem;
                getPreviewDrawable(chatThemeItem4.chatTheme.getThemeItem(chatThemeItem4.themeIndex));
            }
            themeDrawable.previewDrawable = this.chatThemeItem.previewDrawable;
            invalidate();
        }
    }

    private Drawable getPreviewDrawable(TLRPC$TL_theme tLRPC$TL_theme, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        MotionBackgroundDrawable motionBackgroundDrawable;
        if (this.chatThemeItem == null) {
            return null;
        }
        if (i >= 0) {
            TLRPC$WallPaperSettings tLRPC$WallPaperSettings = tLRPC$TL_theme.settings.get(i).wallpaper.settings;
            int i6 = tLRPC$WallPaperSettings.background_color;
            int i7 = tLRPC$WallPaperSettings.second_background_color;
            int i8 = tLRPC$WallPaperSettings.third_background_color;
            i3 = tLRPC$WallPaperSettings.fourth_background_color;
            i5 = i7;
            i2 = i6;
            i4 = i8;
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
        }
        if (i5 != 0) {
            motionBackgroundDrawable = new MotionBackgroundDrawable(i2, i5, i4, i3, true);
            this.patternColor = motionBackgroundDrawable.getPatternColor();
        } else {
            motionBackgroundDrawable = new MotionBackgroundDrawable(i2, i2, i2, i2, true);
            this.patternColor = -16777216;
        }
        this.chatThemeItem.previewDrawable = motionBackgroundDrawable;
        return motionBackgroundDrawable;
    }

    private Drawable getPreviewDrawable(EmojiThemes.ThemeItem themeItem) {
        MotionBackgroundDrawable motionBackgroundDrawable;
        BitmapDrawable bitmapDrawable = null;
        if (this.chatThemeItem == null) {
            return null;
        }
        int i = themeItem.patternBgColor;
        int i2 = themeItem.patternBgGradientColor1;
        int i3 = themeItem.patternBgGradientColor2;
        int i4 = themeItem.patternBgGradientColor3;
        int i5 = themeItem.patternBgRotation;
        if (themeItem.themeInfo.getAccent(false) != null) {
            if (i2 != 0) {
                MotionBackgroundDrawable motionBackgroundDrawable2 = new MotionBackgroundDrawable(i, i2, i3, i4, i5, true);
                this.patternColor = motionBackgroundDrawable2.getPatternColor();
                motionBackgroundDrawable = motionBackgroundDrawable2;
            } else {
                Drawable motionBackgroundDrawable3 = new MotionBackgroundDrawable(i, i, i, i, i5, true);
                this.patternColor = -16777216;
                motionBackgroundDrawable = motionBackgroundDrawable3;
            }
        } else if (i != 0 && i2 != 0) {
            motionBackgroundDrawable = new MotionBackgroundDrawable(i, i2, i3, i4, i5, true);
        } else if (i != 0) {
            motionBackgroundDrawable = new ColorDrawable(i);
        } else {
            Theme.ThemeInfo themeInfo = themeItem.themeInfo;
            if (themeInfo == null || (themeInfo.previewWallpaperOffset <= 0 && themeInfo.pathToWallpaper == null)) {
                motionBackgroundDrawable = new MotionBackgroundDrawable(-2368069, -9722489, -2762611, -7817084, true);
            } else {
                Theme.ThemeInfo themeInfo2 = themeItem.themeInfo;
                Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(112.0f), AndroidUtilities.dp(134.0f), themeInfo2.pathToWallpaper, themeInfo2.pathToFile, themeInfo2.previewWallpaperOffset);
                if (scaledBitmap != null) {
                    bitmapDrawable = new BitmapDrawable(scaledBitmap);
                    bitmapDrawable.setFilterBitmap(true);
                }
                motionBackgroundDrawable = bitmapDrawable;
            }
        }
        this.chatThemeItem.previewDrawable = motionBackgroundDrawable;
        return motionBackgroundDrawable;
    }

    public StaticLayout getNoThemeStaticLayout() {
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(129);
        this.noThemeTextPaint = textPaint;
        textPaint.setColor(getThemedColor("chat_emojiPanelTrendingDescription"));
        this.noThemeTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.noThemeTextPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        StaticLayout createStaticLayout2 = StaticLayoutEx.createStaticLayout2(LocaleController.getString("ChatNoTheme", R.string.ChatNoTheme), this.noThemeTextPaint, AndroidUtilities.dp(52.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true, TextUtils.TruncateAt.END, AndroidUtilities.dp(52.0f), 3);
        this.textLayout = createStaticLayout2;
        return createStaticLayout2;
    }

    public int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }

    public void playEmojiAnimation() {
        if (this.backupImageView.getImageReceiver().getLottieAnimation() != null) {
            AndroidUtilities.cancelRunOnUIThread(this.animationCancelRunnable);
            this.backupImageView.setVisibility(0);
            if (!this.backupImageView.getImageReceiver().getLottieAnimation().isRunning) {
                this.backupImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, true);
                this.backupImageView.getImageReceiver().getLottieAnimation().start();
            }
            this.backupImageView.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(AndroidUtilities.overshootInterpolator).start();
            Runnable themeSmallPreviewView$$ExternalSyntheticLambda1 = new Runnable() {
                @Override
                public final void run() {
                    ThemeSmallPreviewView.this.lambda$playEmojiAnimation$5();
                }
            };
            this.animationCancelRunnable = themeSmallPreviewView$$ExternalSyntheticLambda1;
            AndroidUtilities.runOnUIThread(themeSmallPreviewView$$ExternalSyntheticLambda1, 2500L);
        }
    }

    public void lambda$playEmojiAnimation$5() {
        this.animationCancelRunnable = null;
        this.backupImageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
    }

    public void cancelAnimation() {
        Runnable runnable = this.animationCancelRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.animationCancelRunnable.run();
        }
    }

    public class ThemeDrawable {
        Drawable previewDrawable;
        private final Paint strokePaint;
        private final Paint outBubblePaintSecond = new Paint(1);
        private final Paint inBubblePaint = new Paint(1);

        ThemeDrawable() {
            Paint paint = new Paint(1);
            this.strokePaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }

        public void drawBackground(Canvas canvas, float f) {
            if (this.previewDrawable != null) {
                canvas.save();
                canvas.clipPath(ThemeSmallPreviewView.this.clipPath);
                Drawable drawable = this.previewDrawable;
                if (drawable instanceof BitmapDrawable) {
                    float intrinsicWidth = drawable.getIntrinsicWidth();
                    float intrinsicHeight = this.previewDrawable.getIntrinsicHeight();
                    if (intrinsicWidth / intrinsicHeight > ThemeSmallPreviewView.this.getWidth() / ThemeSmallPreviewView.this.getHeight()) {
                        int width = (int) ((ThemeSmallPreviewView.this.getWidth() * intrinsicHeight) / intrinsicWidth);
                        int width2 = (width - ThemeSmallPreviewView.this.getWidth()) / 2;
                        this.previewDrawable.setBounds(width2, 0, width + width2, ThemeSmallPreviewView.this.getHeight());
                    } else {
                        int height = (int) ((ThemeSmallPreviewView.this.getHeight() * intrinsicHeight) / intrinsicWidth);
                        int height2 = (ThemeSmallPreviewView.this.getHeight() - height) / 2;
                        this.previewDrawable.setBounds(0, height2, ThemeSmallPreviewView.this.getWidth(), height + height2);
                    }
                } else {
                    drawable.setBounds(0, 0, ThemeSmallPreviewView.this.getWidth(), ThemeSmallPreviewView.this.getHeight());
                }
                this.previewDrawable.setAlpha((int) (255.0f * f));
                this.previewDrawable.draw(canvas);
                Drawable drawable2 = this.previewDrawable;
                if ((drawable2 instanceof ColorDrawable) || ((drawable2 instanceof MotionBackgroundDrawable) && ((MotionBackgroundDrawable) drawable2).isOneColor())) {
                    int alpha = ThemeSmallPreviewView.this.outlineBackgroundPaint.getAlpha();
                    ThemeSmallPreviewView.this.outlineBackgroundPaint.setAlpha((int) (alpha * f));
                    float f2 = ThemeSmallPreviewView.this.INNER_RECT_SPACE;
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(f2, f2, ThemeSmallPreviewView.this.getWidth() - f2, ThemeSmallPreviewView.this.getHeight() - f2);
                    canvas.drawRoundRect(rectF, ThemeSmallPreviewView.this.INNER_RADIUS, ThemeSmallPreviewView.this.INNER_RADIUS, ThemeSmallPreviewView.this.outlineBackgroundPaint);
                    ThemeSmallPreviewView.this.outlineBackgroundPaint.setAlpha(alpha);
                }
                canvas.restore();
                return;
            }
            canvas.drawRoundRect(ThemeSmallPreviewView.this.rectF, ThemeSmallPreviewView.this.INNER_RADIUS, ThemeSmallPreviewView.this.INNER_RADIUS, ThemeSmallPreviewView.this.backgroundFillPaint);
        }

        public void draw(Canvas canvas, float f) {
            int i;
            ThemeSmallPreviewView themeSmallPreviewView = ThemeSmallPreviewView.this;
            if (themeSmallPreviewView.isSelected || themeSmallPreviewView.strokeAlphaAnimator != null) {
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem = ThemeSmallPreviewView.this.chatThemeItem;
                EmojiThemes.ThemeItem themeItem = chatThemeItem.chatTheme.getThemeItem(chatThemeItem.themeIndex);
                ThemeSmallPreviewView themeSmallPreviewView2 = ThemeSmallPreviewView.this;
                if (themeSmallPreviewView2.chatThemeItem.chatTheme.showAsDefaultStub) {
                    i = themeSmallPreviewView2.getThemedColor("featuredStickers_addButton");
                } else {
                    i = themeItem.outLineColor;
                }
                this.strokePaint.setColor(i);
                this.strokePaint.setAlpha((int) (ThemeSmallPreviewView.this.selectionProgress * f * 255.0f));
                float strokeWidth = (this.strokePaint.getStrokeWidth() * 0.5f) + (AndroidUtilities.dp(4.0f) * (1.0f - ThemeSmallPreviewView.this.selectionProgress));
                ThemeSmallPreviewView.this.rectF.set(strokeWidth, strokeWidth, ThemeSmallPreviewView.this.getWidth() - strokeWidth, ThemeSmallPreviewView.this.getHeight() - strokeWidth);
                canvas.drawRoundRect(ThemeSmallPreviewView.this.rectF, ThemeSmallPreviewView.this.STROKE_RADIUS, ThemeSmallPreviewView.this.STROKE_RADIUS, this.strokePaint);
            }
            int i2 = (int) (f * 255.0f);
            this.outBubblePaintSecond.setAlpha(i2);
            this.inBubblePaint.setAlpha(i2);
            ThemeSmallPreviewView.this.rectF.set(ThemeSmallPreviewView.this.INNER_RECT_SPACE, ThemeSmallPreviewView.this.INNER_RECT_SPACE, ThemeSmallPreviewView.this.getWidth() - ThemeSmallPreviewView.this.INNER_RECT_SPACE, ThemeSmallPreviewView.this.getHeight() - ThemeSmallPreviewView.this.INNER_RECT_SPACE);
            ThemeSmallPreviewView themeSmallPreviewView3 = ThemeSmallPreviewView.this;
            EmojiThemes emojiThemes = themeSmallPreviewView3.chatThemeItem.chatTheme;
            if (emojiThemes == null || emojiThemes.showAsDefaultStub) {
                canvas.drawRoundRect(themeSmallPreviewView3.rectF, ThemeSmallPreviewView.this.INNER_RADIUS, ThemeSmallPreviewView.this.INNER_RADIUS, ThemeSmallPreviewView.this.backgroundFillPaint);
                canvas.save();
                StaticLayout noThemeStaticLayout = ThemeSmallPreviewView.this.getNoThemeStaticLayout();
                canvas.translate((ThemeSmallPreviewView.this.getWidth() - noThemeStaticLayout.getWidth()) * 0.5f, AndroidUtilities.dp(18.0f));
                noThemeStaticLayout.draw(canvas);
                canvas.restore();
            } else if (themeSmallPreviewView3.currentType == 2) {
                ThemeSmallPreviewView themeSmallPreviewView4 = ThemeSmallPreviewView.this;
                if (themeSmallPreviewView4.chatThemeItem.icon != null) {
                    canvas.drawBitmap(ThemeSmallPreviewView.this.chatThemeItem.icon, (themeSmallPreviewView4.getWidth() - ThemeSmallPreviewView.this.chatThemeItem.icon.getWidth()) * 0.5f, AndroidUtilities.dp(21.0f), (Paint) null);
                }
            } else {
                float dp = ThemeSmallPreviewView.this.INNER_RECT_SPACE + AndroidUtilities.dp(8.0f);
                float dp2 = ThemeSmallPreviewView.this.INNER_RECT_SPACE + AndroidUtilities.dp(22.0f);
                if (ThemeSmallPreviewView.this.currentType == 0) {
                    ThemeSmallPreviewView.this.rectF.set(dp2, dp, ThemeSmallPreviewView.this.BUBBLE_WIDTH + dp2, ThemeSmallPreviewView.this.BUBBLE_HEIGHT + dp);
                } else {
                    dp = ThemeSmallPreviewView.this.getMeasuredHeight() * 0.12f;
                    ThemeSmallPreviewView.this.rectF.set(ThemeSmallPreviewView.this.getMeasuredWidth() - (ThemeSmallPreviewView.this.getMeasuredWidth() * 0.65f), dp, ThemeSmallPreviewView.this.getMeasuredWidth() - (ThemeSmallPreviewView.this.getMeasuredWidth() * 0.1f), ThemeSmallPreviewView.this.getMeasuredHeight() * 0.32f);
                }
                Paint paint = this.outBubblePaintSecond;
                if (ThemeSmallPreviewView.this.currentType == 0) {
                    canvas.drawRoundRect(ThemeSmallPreviewView.this.rectF, ThemeSmallPreviewView.this.rectF.height() * 0.5f, ThemeSmallPreviewView.this.rectF.height() * 0.5f, paint);
                } else {
                    ThemeSmallPreviewView themeSmallPreviewView5 = ThemeSmallPreviewView.this;
                    themeSmallPreviewView5.messageDrawableOut.setBounds((int) themeSmallPreviewView5.rectF.left, ((int) ThemeSmallPreviewView.this.rectF.top) - AndroidUtilities.dp(2.0f), ((int) ThemeSmallPreviewView.this.rectF.right) + AndroidUtilities.dp(4.0f), ((int) ThemeSmallPreviewView.this.rectF.bottom) + AndroidUtilities.dp(2.0f));
                    ThemeSmallPreviewView themeSmallPreviewView6 = ThemeSmallPreviewView.this;
                    themeSmallPreviewView6.messageDrawableOut.setRoundRadius((int) (themeSmallPreviewView6.rectF.height() * 0.5f));
                    ThemeSmallPreviewView.this.messageDrawableOut.draw(canvas, paint);
                }
                if (ThemeSmallPreviewView.this.currentType == 0) {
                    float dp3 = ThemeSmallPreviewView.this.INNER_RECT_SPACE + AndroidUtilities.dp(5.0f);
                    float dp4 = dp + ThemeSmallPreviewView.this.BUBBLE_HEIGHT + AndroidUtilities.dp(4.0f);
                    ThemeSmallPreviewView.this.rectF.set(dp3, dp4, ThemeSmallPreviewView.this.BUBBLE_WIDTH + dp3, ThemeSmallPreviewView.this.BUBBLE_HEIGHT + dp4);
                } else {
                    float measuredWidth = ThemeSmallPreviewView.this.getMeasuredWidth() * 0.1f;
                    ThemeSmallPreviewView.this.rectF.set(measuredWidth, ThemeSmallPreviewView.this.getMeasuredHeight() * 0.35f, ThemeSmallPreviewView.this.getMeasuredWidth() * 0.65f, ThemeSmallPreviewView.this.getMeasuredHeight() * 0.55f);
                }
                if (ThemeSmallPreviewView.this.currentType == 0) {
                    canvas.drawRoundRect(ThemeSmallPreviewView.this.rectF, ThemeSmallPreviewView.this.rectF.height() * 0.5f, ThemeSmallPreviewView.this.rectF.height() * 0.5f, this.inBubblePaint);
                    return;
                }
                ThemeSmallPreviewView themeSmallPreviewView7 = ThemeSmallPreviewView.this;
                themeSmallPreviewView7.messageDrawableIn.setBounds(((int) themeSmallPreviewView7.rectF.left) - AndroidUtilities.dp(4.0f), ((int) ThemeSmallPreviewView.this.rectF.top) - AndroidUtilities.dp(2.0f), (int) ThemeSmallPreviewView.this.rectF.right, ((int) ThemeSmallPreviewView.this.rectF.bottom) + AndroidUtilities.dp(2.0f));
                ThemeSmallPreviewView themeSmallPreviewView8 = ThemeSmallPreviewView.this;
                themeSmallPreviewView8.messageDrawableIn.setRoundRadius((int) (themeSmallPreviewView8.rectF.height() * 0.5f));
                ThemeSmallPreviewView.this.messageDrawableIn.draw(canvas, this.inBubblePaint);
            }
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.isSelected);
    }
}
