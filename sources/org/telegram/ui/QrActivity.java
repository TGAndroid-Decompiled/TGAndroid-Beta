package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.ArrayMap;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.wallpaper.WallpaperBitmapHolder;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EdgeToEdgeSupportMode;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.Cells.SettingsSearchCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.HideViewAfterAnimation;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.ThemeSmallPreviewView;

public class QrActivity extends BaseFragment {
    private static final int LOGO_OPTIMAL_FRAME = 33;
    private static List<EmojiThemes> cachedThemes;
    private static boolean firstOpen;
    private static final ArrayMap qrColorsMap;
    private BackupImageView avatarImageView;
    private View backgroundView;
    private long chatId;
    private ImageView closeImageView;
    private MotionBackgroundDrawable currMotionDrawable;
    private EmojiThemes currentTheme;
    private final ArrayMap emojiThemeDarkIcons;
    private Bitmap emojiThemeIcon;
    private final EmojiThemes homeTheme;
    private Insets insets;
    private boolean isCurrentThemeDark;
    private boolean isFragmentViewPortrait;
    private RLottieImageView logoImageView;
    private Bitmap logoOptimal;
    private final Rect logoRect;
    private ValueAnimator patternAlphaAnimator;
    private ValueAnimator patternIntensityAnimator;
    private MotionBackgroundDrawable prevMotionDrawable;
    private int[] prevQrColors;
    private int prevSystemUiVisibility;
    private QrView qrView;
    private final ThemeResourcesProvider resourcesProvider;
    private int selectedPosition;
    private MotionBackgroundDrawable tempMotionDrawable;
    private FrameLayout themeLayout;
    private ThemeListViewController themesViewController;
    private long userId;

    public class AnonymousClass5 implements CameraScanActivity.CameraScanActivityDelegate {
        final int val$currentAccount;
        final BaseFragment val$fragment;

        public AnonymousClass5(int i, BaseFragment baseFragment) {
            this.val$currentAccount = i;
            this.val$fragment = baseFragment;
        }

        public static void lambda$didFindQr$0() {
            BulletinFactory.global().createSimpleBulletin(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).show();
        }

        public static void lambda$didFindQr$1(BaseFragment baseFragment, Long l) {
            if (baseFragment.isFinished) {
                return;
            }
            if (l == null || l.longValue() == Long.MAX_VALUE) {
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda5(3));
            } else {
                baseFragment.presentFragment(ProfileActivity.of(l.longValue()), true);
            }
        }

        public static void lambda$didFindQr$2() {
            BulletinFactory.global().createSimpleBulletin(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).show();
        }

        @Override
        public final void didFindMrzInfo(MrzRecognizer.Result result) {
            CameraScanActivity.CameraScanActivityDelegate.CC.$default$didFindMrzInfo(this, result);
        }

        @Override
        public void didFindQr(String str) {
            String strExtractUsername = Browser.extractUsername(str);
            if (TextUtils.isEmpty(strExtractUsername)) {
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda5(4));
            } else {
                MessagesController.getInstance(this.val$currentAccount).getUserNameResolver().resolve(strExtractUsername, new QrActivity$5$$ExternalSyntheticLambda1(this.val$fragment, 0));
            }
        }

        @Override
        public final String getSubtitleText() {
            return CameraScanActivity.CameraScanActivityDelegate.CC.$default$getSubtitleText(this);
        }

        @Override
        public final void onDismiss() {
            CameraScanActivity.CameraScanActivityDelegate.CC.$default$onDismiss(this);
        }

        @Override
        public final boolean processQr(String str, Runnable runnable) {
            return CameraScanActivity.CameraScanActivityDelegate.CC.$default$processQr(this, str, runnable);
        }
    }

    public interface OnItemSelectedListener {
        void onItemSelected(EmojiThemes emojiThemes, int i);
    }

    public static class QrView extends View {
        private Bitmap backgroundBitmap;
        private final Paint bitmapGradientPaint;
        private QrCenterChangedListener centerChangedListener;
        private Runnable checkTimerToken;
        private Bitmap contentBitmap;
        private AnimatedFloat contentBitmapAlpha;
        private Paint crossfadeFromPaint;
        private Paint crossfadeToPaint;
        private final int crossfadeWidthDp;
        private boolean firstPrepare;
        private final MotionBackgroundDrawable gradientDrawable;
        private final BitmapShader gradientShader;
        private final BitmapShader gradientTextShader;
        private Integer hadHeight;
        private String hadLink;
        private String hadUserText;
        private Integer hadWidth;
        private boolean hasTimer;
        private boolean isPhone;
        private String link;
        private int linkExpires;
        private RLottieDrawable loadingMatrix;
        private boolean logoCenterSet;
        private Bitmap oldContentBitmap;
        private float[] radii;
        private boolean setData;
        private StaticLayout shareUsernameLayout;
        private TextPaint shareUsernameLayoutPaint;
        private AnimatedTextView.AnimatedTextDrawable timerTextDrawable;
        private String username;
        private static final float SHADOW_SIZE = AndroidUtilities.dp(2.0f);
        private static final float RADIUS = AndroidUtilities.dp(20.0f);

        public interface QrCenterChangedListener {
            void onCenterChanged(int i, int i2, int i3, int i4);
        }

        public QrView(Context context) {
            super(context);
            MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable();
            this.gradientDrawable = motionBackgroundDrawable;
            Paint paint = new Paint(1);
            this.bitmapGradientPaint = paint;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.contentBitmapAlpha = new AnimatedFloat(1.0f, this, 0L, 2000L, cubicBezierInterpolator);
            this.crossfadeFromPaint = new Paint(1);
            this.crossfadeToPaint = new Paint(1);
            this.crossfadeWidthDp = 120;
            this.radii = new float[8];
            this.checkTimerToken = new QrActivity$QrView$$ExternalSyntheticLambda0(this, 0);
            this.firstPrepare = true;
            motionBackgroundDrawable.setIndeterminateAnimation(true);
            motionBackgroundDrawable.setParentView(this);
            Bitmap bitmap = motionBackgroundDrawable.getBitmap();
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.gradientShader = bitmapShader;
            BitmapShader bitmapShader2 = new BitmapShader(motionBackgroundDrawable.getBitmap(), tileMode, tileMode);
            this.gradientTextShader = bitmapShader2;
            paint.setShader(bitmapShader);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(0 == true ? 1 : 0, true, 0 == true ? 1 : 0) {
                @Override
                public void invalidateSelf() {
                    QrView.this.invalidate();
                }
            };
            this.timerTextDrawable = animatedTextDrawable;
            animatedTextDrawable.setAnimationProperties(0.35f, 0L, 300L, cubicBezierInterpolator);
            this.timerTextDrawable.setCallback(this);
            this.timerTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            this.timerTextDrawable.getPaint().setShader(bitmapShader2);
            this.timerTextDrawable.setGravity(17);
            this.timerTextDrawable.setTextSize(AndroidUtilities.dp(35.0f));
            this.timerTextDrawable.setText("");
            Paint paint2 = this.crossfadeFromPaint;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode2));
            Paint paint3 = this.crossfadeFromPaint;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.crossfadeToPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode2));
            this.crossfadeToPaint.setXfermode(new PorterDuffXfermode(mode));
        }

        private void drawLoading(Canvas canvas) {
            QrCenterChangedListener qrCenterChangedListener;
            if (this.loadingMatrix != null) {
                int iM$2 = OKLCH.m$2(60.0f, getWidth(), 33);
                int i = iM$2 * 33;
                int i2 = i + 32;
                int width = (getWidth() - i2) / 2;
                int height = (int) (getHeight() * 0.15f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    height = (int) (getHeight() * 0.09f);
                }
                int i3 = height;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, 255, 31);
                int i4 = width + 16;
                int i5 = i3 + 16;
                canvas.drawRect(i4, i5, (getWidth() - width) - 16, (((getWidth() + i3) - width) - width) - 16, this.bitmapGradientPaint);
                canvas.save();
                this.loadingMatrix.setBounds(i4, i5, (getWidth() - width) - 16, (((getWidth() + i3) - width) - width) - 16);
                this.loadingMatrix.draw(canvas);
                canvas.restore();
                canvas.restore();
                float width2 = getWidth() / 2.0f;
                float f = i3;
                float f2 = width;
                float width3 = ((getWidth() / 2.0f) + f) - f2;
                float f3 = iM$2;
                float fRound = ((Math.round((i / 4.65f) / f3) * iM$2) / 2) * 0.75f;
                canvas.drawCircle(width2, width3, fRound, this.bitmapGradientPaint);
                TelegramQRCodeWriter.drawSideQuads(canvas, f2, f, this.bitmapGradientPaint, 7.0f, f3, 16, i2, 0.75f, this.radii, true);
                if (this.logoCenterSet || (qrCenterChangedListener = this.centerChangedListener) == null) {
                    return;
                }
                qrCenterChangedListener.onCenterChanged((int) (width2 - fRound), (int) (width3 - fRound), (int) (width2 + fRound), (int) (width3 + fRound));
                this.logoCenterSet = true;
            }
        }

        public void lambda$new$3(TLRPC.TL_exportedContactToken tL_exportedContactToken) {
            if (tL_exportedContactToken == null) {
                return;
            }
            int i = this.linkExpires;
            if (i != 0 && i < tL_exportedContactToken.expires) {
                try {
                    Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(100L);
                    }
                } catch (Exception unused) {
                    try {
                        performHapticFeedback(0, 2);
                    } catch (Exception unused2) {
                    }
                }
            }
            this.linkExpires = tL_exportedContactToken.expires;
            setData(tL_exportedContactToken.url, null, false, true);
        }

        public void lambda$new$4(TLRPC.TL_exportedContactToken tL_exportedContactToken) {
            AndroidUtilities.runOnUIThread(new PhotoViewer$7$$ExternalSyntheticLambda0(5, this, tL_exportedContactToken));
        }

        public void lambda$new$5() {
            AndroidUtilities.cancelRunOnUIThread(this.checkTimerToken);
            boolean z = this.hasTimer;
            if (z) {
                if (z && this.loadingMatrix == null) {
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.qr_matrix, "qr_matrix", AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                    this.loadingMatrix = rLottieDrawable;
                    rLottieDrawable.setMasterParent(this);
                    this.loadingMatrix.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                    this.loadingMatrix.setAutoRepeat(1);
                    this.loadingMatrix.start();
                }
                if (this.linkExpires == 0 || System.currentTimeMillis() / 1000 >= this.linkExpires) {
                    if (this.linkExpires != 0) {
                        this.link = null;
                        Utilities.themeQueue.postRunnable(new ArticleViewer$$ExternalSyntheticLambda5(this, getWidth(), getHeight(), 3));
                        this.timerTextDrawable.setText("");
                    }
                    MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(this.linkExpires == 0 ? 750L : 1750L, new PollItemMenu$$ExternalSyntheticLambda15(this, 4));
                }
                int i = this.linkExpires;
                if (i > 0 && this.link != null) {
                    long jMax = Math.max(0L, (((long) i) - (System.currentTimeMillis() / 1000)) - 1);
                    int i2 = (int) (jMax % 60);
                    int iMin = Math.min(99, (int) (jMax / 60));
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.timerTextDrawable;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iMin < 10 ? "0" : "");
                    sb.append(iMin);
                    sb.append(":");
                    sb.append(i2 < 10 ? "0" : "");
                    sb.append(i2);
                    animatedTextDrawable.setText(sb.toString(), true, false);
                }
                if (isAttachedToWindow()) {
                    AndroidUtilities.runOnUIThread(this.checkTimerToken, 1000L);
                }
            }
        }

        public void lambda$prepareContent$6() {
            this.firstPrepare = false;
            Bitmap bitmap = this.contentBitmap;
            if (bitmap != null) {
                this.contentBitmap = null;
                this.contentBitmapAlpha.set(0.0f, true);
                Bitmap bitmap2 = this.oldContentBitmap;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.oldContentBitmap = bitmap;
                invalidate();
            }
        }

        public void lambda$prepareContent$7(Bitmap bitmap, float f, int i, float f2) {
            Bitmap bitmap2 = this.contentBitmap;
            this.contentBitmap = bitmap.extractAlpha();
            if (!this.firstPrepare) {
                this.contentBitmapAlpha.set(0.0f, true);
            }
            this.firstPrepare = false;
            Bitmap bitmap3 = this.oldContentBitmap;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
            this.oldContentBitmap = bitmap2;
            QrCenterChangedListener qrCenterChangedListener = this.centerChangedListener;
            if (qrCenterChangedListener != null) {
                float f3 = i * 0.5f;
                qrCenterChangedListener.onCenterChanged((int) (f - f3), (int) (f2 - f3), (int) (f + f3), (int) (f2 + f3));
                this.logoCenterSet = true;
            }
            invalidate();
        }

        public void lambda$setData$1(int i, int i2) {
            String upperCase;
            float f;
            int i3;
            int imageSize;
            StaticLayout staticLayoutCreateStaticLayout;
            int i4;
            TelegramQRCodeWriter telegramQRCodeWriter;
            int i5;
            Drawable drawable;
            int iDp;
            int i6;
            Integer num;
            if (i == 0 || i2 == 0) {
                return;
            }
            if ((TextUtils.isEmpty(this.username) && !this.hasTimer) || TextUtils.isEmpty(this.link)) {
                AndroidUtilities.runOnUIThread(new QrActivity$QrView$$ExternalSyntheticLambda0(this, 1));
                return;
            }
            if (this.hasTimer) {
                upperCase = null;
            } else {
                upperCase = this.isPhone ? this.username : this.username.toUpperCase();
            }
            if (TextUtils.equals(upperCase, this.hadUserText) && TextUtils.equals(this.link, this.hadLink) && (num = this.hadWidth) != null && this.hadHeight != null && num.intValue() == i && this.hadHeight.intValue() == i2) {
                return;
            }
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            TextPaint textPaint = new TextPaint(65);
            int i7 = -16777216;
            textPaint.setColor(-16777216);
            textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            int i8 = 2;
            int iM$3 = OKLCH.m$3(20.0f, 2, bitmapCreateBitmap.getWidth());
            if (this.hasTimer) {
                f = 30.0f;
                i3 = 2;
                imageSize = 0;
                staticLayoutCreateStaticLayout = null;
            } else {
                int i9 = 0;
                while (true) {
                    if (i9 <= i8) {
                        if (i9 == 0) {
                            drawable = getContext().getDrawable(R.drawable.qr_at_large);
                            textPaint.setTextSize(AndroidUtilities.dp(30.0f));
                        } else if (i9 == 1) {
                            drawable = getContext().getDrawable(R.drawable.qr_at_medium);
                            textPaint.setTextSize(AndroidUtilities.dp(25.0f));
                        } else {
                            drawable = getContext().getDrawable(R.drawable.qr_at_small);
                            textPaint.setTextSize(AndroidUtilities.dp(19.0f));
                        }
                        if (drawable != null) {
                            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zzii.m(" ", upperCase));
                        if (!this.isPhone) {
                            spannableStringBuilder.setSpan(new SettingsSearchCell.VerticalImageSpan(drawable), 0, 1, 33);
                        }
                        float fMeasureText = textPaint.measureText(spannableStringBuilder, 1, spannableStringBuilder.length()) + drawable.getBounds().width();
                        if (i9 > 1 || fMeasureText <= iM$3) {
                            int i10 = fMeasureText > ((float) iM$3) ? 2 : 1;
                            int iDp2 = i10 > 1 ? AndroidUtilities.dp(2.0f) + (((int) (drawable.getBounds().width() + fMeasureText)) / 2) : iM$3;
                            if (iDp2 > iM$3) {
                                iDp = AndroidUtilities.dp(4.0f) + (((int) (fMeasureText + drawable.getBounds().width())) / 3);
                                i6 = 3;
                            } else {
                                iDp = iDp2;
                                i6 = i10;
                            }
                            f = 30.0f;
                            i3 = 2;
                            imageSize = 0;
                            staticLayoutCreateStaticLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilder, textPaint, iDp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, null, Math.min(AndroidUtilities.dp(10.0f) + iDp, bitmapCreateBitmap.getWidth()), i6);
                        } else {
                            i9++;
                            i7 = -16777216;
                            i8 = 2;
                        }
                    } else {
                        f = 30.0f;
                        i3 = 2;
                        imageSize = 0;
                        staticLayoutCreateStaticLayout = null;
                    }
                }
            }
            float lineCount = (staticLayoutCreateStaticLayout == null ? 0 : staticLayoutCreateStaticLayout.getLineCount()) * (textPaint.descent() - textPaint.ascent());
            int iM$4 = OKLCH.m$3(f, i3, i);
            HashMap map = new HashMap();
            map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
            map.put(EncodeHintType.MARGIN, Integer.valueOf(imageSize));
            TelegramQRCodeWriter telegramQRCodeWriter2 = new TelegramQRCodeWriter();
            int i11 = 3;
            Bitmap bitmapEncode = null;
            while (true) {
                if (i11 >= 5) {
                    i4 = -16777216;
                    break;
                }
                try {
                    map.put(EncodeHintType.QR_VERSION, Integer.valueOf(i11));
                    bitmapEncode = telegramQRCodeWriter2.encode(this.link, iM$4, iM$4, map, null, 0.75f, 16777215, -16777216);
                    telegramQRCodeWriter = telegramQRCodeWriter2;
                    i5 = iM$4;
                    i4 = -16777216;
                    try {
                        imageSize = telegramQRCodeWriter.getImageSize();
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    telegramQRCodeWriter = telegramQRCodeWriter2;
                    i5 = iM$4;
                    i4 = -16777216;
                }
                if (bitmapEncode != null) {
                    break;
                }
                i11++;
                iM$4 = i5;
                telegramQRCodeWriter2 = telegramQRCodeWriter;
            }
            final int i12 = imageSize;
            if (bitmapEncode == null) {
                return;
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(16777215);
            float width = (i - bitmapEncode.getWidth()) / 2.0f;
            float f2 = i2;
            float f3 = 0.15f * f2;
            if (staticLayoutCreateStaticLayout != null && staticLayoutCreateStaticLayout.getLineCount() == 3) {
                f3 = 0.13f * f2;
            }
            if (((ViewGroup) getParent()).getMeasuredWidth() >= ((ViewGroup) getParent()).getMeasuredHeight()) {
                f3 = 0.09f * f2;
            }
            canvas.drawBitmap(bitmapEncode, width, f3, new Paint(3));
            Paint paint = new Paint(1);
            paint.setColor(i4);
            final float width2 = (bitmapEncode.getWidth() * 0.5f) + width;
            final float width3 = (bitmapEncode.getWidth() * 0.5f) + f3;
            canvas.drawCircle(width2, width3, i12 * 0.5f, paint);
            if (staticLayoutCreateStaticLayout != null) {
                float width4 = (canvas.getWidth() - staticLayoutCreateStaticLayout.getWidth()) * 0.5f;
                float height = ((((canvas.getHeight() - (f3 + bitmapEncode.getHeight())) - lineCount) * 0.5f) + (bitmapEncode.getHeight() + f3)) - AndroidUtilities.dp(4.0f);
                canvas.save();
                canvas.translate(width4, height);
                staticLayoutCreateStaticLayout.draw(canvas);
                canvas.restore();
                bitmapEncode.recycle();
            }
            this.hadWidth = Integer.valueOf(i);
            this.hadHeight = Integer.valueOf(i2);
            this.hadUserText = upperCase;
            this.hadLink = this.link;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$prepareContent$7(bitmapCreateBitmap, width2, i12, width3);
                }
            });
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.checkTimerToken.run();
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            RLottieDrawable rLottieDrawable = this.loadingMatrix;
            if (rLottieDrawable != null) {
                rLottieDrawable.stop();
                this.loadingMatrix.recycle(false);
                this.loadingMatrix = null;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i;
            float f;
            super.onDraw(canvas);
            Bitmap bitmap = this.backgroundBitmap;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            float f2 = this.contentBitmapAlpha.set(1.0f);
            boolean z = f2 > 0.0f && f2 < 1.0f;
            if (f2 >= 1.0f) {
                i = 255;
                f = 120.0f;
            } else {
                if (z) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(rectF, 255, 31);
                }
                Bitmap bitmap2 = this.oldContentBitmap;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.bitmapGradientPaint);
                } else {
                    drawLoading(canvas);
                }
                if (z) {
                    float fDp = AndroidUtilities.dp(120.0f);
                    canvas.save();
                    canvas.translate(0.0f, DiffUtil.m(1.0f, f2, getHeight() + fDp, -fDp));
                    i = 255;
                    f = 120.0f;
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight() + fDp, this.crossfadeToPaint);
                    canvas.restore();
                    canvas.restore();
                } else {
                    i = 255;
                    f = 120.0f;
                }
            }
            if (f2 > 0.0f) {
                if (z) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(rectF2, i, 31);
                }
                Bitmap bitmap3 = this.contentBitmap;
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, 0.0f, 0.0f, this.bitmapGradientPaint);
                    this.gradientDrawable.updateAnimation();
                } else {
                    drawLoading(canvas);
                }
                if (z) {
                    float fDp2 = AndroidUtilities.dp(f);
                    canvas.save();
                    float f3 = -fDp2;
                    canvas.translate(0.0f, DiffUtil.m(1.0f, f2, getHeight() + fDp2, f3));
                    canvas.drawRect(0.0f, f3 - getHeight(), getWidth(), getHeight() + fDp2, this.crossfadeFromPaint);
                    canvas.restore();
                    canvas.restore();
                }
            }
            if (this.hasTimer) {
                float fDp3 = AndroidUtilities.dp(6.0f) + getWidth();
                if (this.shareUsernameLayout == null) {
                    int i2 = (int) fDp3;
                    this.timerTextDrawable.setBounds(0, i2, getWidth(), AndroidUtilities.dp(40.0f) + i2);
                    this.timerTextDrawable.draw(canvas);
                } else {
                    canvas.save();
                    canvas.translate(0.0f, fDp3);
                    if (this.shareUsernameLayout.getWidth() != getWidth()) {
                        setForShare(true);
                    }
                    this.shareUsernameLayout.draw(canvas);
                    canvas.restore();
                }
            }
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (i == i3 && i2 == i4) {
                return;
            }
            Bitmap bitmap = this.backgroundBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.backgroundBitmap = null;
            }
            Paint paint = new Paint(1);
            paint.setColor(-1);
            float fDp = AndroidUtilities.dp(4.0f);
            float f = SHADOW_SIZE;
            paint.setShadowLayer(fDp, 0.0f, f, 251658240);
            this.backgroundBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.backgroundBitmap);
            float f2 = i;
            RectF rectF = new RectF(f, f, f2 - f, getHeight() - f);
            float f3 = RADIUS;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            if (this.setData) {
                Utilities.themeQueue.postRunnable(new ArticleViewer$$ExternalSyntheticLambda5(this, i, i2, 2));
            }
            float fMax = Math.max((getWidth() * 1.0f) / this.gradientDrawable.getBitmap().getWidth(), (getHeight() * 1.0f) / this.gradientDrawable.getBitmap().getHeight());
            Matrix matrix = new Matrix();
            matrix.setScale(fMax, fMax);
            this.gradientShader.setLocalMatrix(matrix);
            Matrix matrix2 = new Matrix();
            matrix2.setScale(fMax, fMax);
            matrix2.postTranslate(f2 / 2.0f, AndroidUtilities.dp(6.0f) + getWidth());
            this.gradientTextShader.setLocalMatrix(matrix2);
        }

        public void setCenterChangedListener(QrCenterChangedListener qrCenterChangedListener) {
            this.centerChangedListener = qrCenterChangedListener;
        }

        public void setColors(int i, int i2, int i3, int i4) {
            this.gradientDrawable.setColors(i, i2, i3, i4);
            invalidate();
        }

        public void setData(String str, String str2, boolean z, boolean z2) {
            this.setData = true;
            this.username = str2;
            this.isPhone = z;
            if (z2) {
                TLRPC.TL_exportedContactToken cachedContactToken = MessagesController.getInstance(UserConfig.selectedAccount).getCachedContactToken();
                if (cachedContactToken != null) {
                    this.link = cachedContactToken.url;
                    this.linkExpires = cachedContactToken.expires;
                } else {
                    this.link = null;
                }
            } else {
                this.link = str;
            }
            this.hasTimer = z2;
            Utilities.themeQueue.postRunnable(new ArticleViewer$$ExternalSyntheticLambda5(this, getWidth(), getHeight(), 1));
            invalidate();
            this.checkTimerToken.run();
        }

        public void setForShare(boolean z) {
            if (this.hasTimer) {
                if (!z) {
                    this.shareUsernameLayout = null;
                    return;
                }
                if (this.shareUsernameLayoutPaint == null) {
                    this.shareUsernameLayoutPaint = new TextPaint(1);
                }
                this.shareUsernameLayoutPaint.setShader(this.gradientTextShader);
                this.shareUsernameLayoutPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
                this.shareUsernameLayoutPaint.setTextSize(AndroidUtilities.dp(25.0f));
                String str = this.username;
                if (str == null) {
                    str = "";
                }
                this.shareUsernameLayout = StaticLayoutEx.createStaticLayout(Emoji.replaceEmoji(str, this.shareUsernameLayoutPaint.getFontMetricsInt(), false), this.shareUsernameLayoutPaint, getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, getWidth() - AndroidUtilities.dp(60.0f), 1);
            }
        }

        public void setPosAnimationProgress(float f) {
            this.gradientDrawable.posAnimationProgress = f;
        }
    }

    public class ThemeListViewController implements NotificationCenter.NotificationCenterDelegate {
        public final ChatThemeBottomSheet.Adapter adapter;
        private final Drawable backgroundDrawable;
        private final View bottomShadow;
        private View changeDayNightView;
        private ValueAnimator changeDayNightViewAnimator;
        private float changeDayNightViewProgress;
        private final RLottieDrawable darkThemeDrawable;
        private final RLottieImageView darkThemeView;
        private boolean forceDark;
        private final BaseFragment fragment;
        protected boolean isLightDarkChangeAnimation;
        private OnItemSelectedListener itemSelectedListener;
        private LinearLayoutManager layoutManager;
        private boolean prevIsPortrait;
        public final FlickerLoadingView progressView;
        private final RecyclerListView recyclerView;
        public final FrameLayout rootLayout;
        public final TextView scanButton;
        public final ImageView scanButtonIcon;
        public final LinearLayout scanButtonWrap;
        private final LinearSmoothScroller scroller;
        public ChatThemeBottomSheet.ChatThemeItem selectedItem;
        public final TextView shareButton;
        public final TextView titleView;
        private final View topShadow;
        private final Window window;
        private final Paint backgroundPaint = new Paint(1);
        public int prevSelectedPosition = -1;

        public ThemeListViewController(BaseFragment baseFragment, Window window) {
            this.fragment = baseFragment;
            this.window = window;
            Activity parentActivity = baseFragment.getParentActivity();
            this.scroller = new LinearSmoothScroller(parentActivity) {
                @Override
                public int calculateTimeForScrolling(int i) {
                    return super.calculateTimeForScrolling(i) * 6;
                }
            };
            Drawable drawableMutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            this.backgroundDrawable = drawableMutate;
            int themedColor = baseFragment.getThemedColor(Theme.key_dialogBackground);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            FrameLayout frameLayout = new FrameLayout(parentActivity, QrActivity.this, baseFragment) {
                private final Rect backgroundPadding;
                final BaseFragment val$fragment;
                final QrActivity val$this$0;

                {
                    this.val$fragment = baseFragment;
                    Rect rect = new Rect();
                    this.backgroundPadding = rect;
                    ThemeListViewController.this.backgroundPaint.setColor(baseFragment.getThemedColor(Theme.key_windowBackgroundWhite));
                    ThemeListViewController.this.backgroundDrawable.setCallback(this);
                    ThemeListViewController.this.backgroundDrawable.getPadding(rect);
                }

                @Override
                public void dispatchDraw(Canvas canvas) {
                    if (ThemeListViewController.this.prevIsPortrait) {
                        Drawable drawable = ThemeListViewController.this.backgroundDrawable;
                        Rect rect = this.backgroundPadding;
                        drawable.setBounds(-rect.left, -rect.top, getWidth() + this.backgroundPadding.right, getHeight() + this.backgroundPadding.bottom);
                        ThemeListViewController.this.backgroundDrawable.draw(canvas);
                    } else {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), ThemeListViewController.this.backgroundPaint);
                    }
                    super.dispatchDraw(canvas);
                }

                @Override
                public void onMeasure(int i, int i2) {
                    boolean z = QrActivity.this.isFragmentViewPortrait;
                    int iDp = AndroidUtilities.dp(12.0f);
                    if (z) {
                        ThemeListViewController.this.recyclerView.setLayoutParams(LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                        ThemeListViewController.this.recyclerView.setPadding(iDp, 0, iDp, 0);
                        ThemeListViewController themeListViewController = ThemeListViewController.this;
                        if (themeListViewController.scanButtonWrap != null) {
                            themeListViewController.shareButton.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                            ThemeListViewController.this.scanButtonWrap.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                        } else {
                            themeListViewController.shareButton.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                        }
                    } else {
                        ThemeListViewController.this.recyclerView.setPadding(iDp, iDp / 2, iDp, iDp);
                        ThemeListViewController themeListViewController2 = ThemeListViewController.this;
                        if (themeListViewController2.scanButtonWrap != null) {
                            themeListViewController2.recyclerView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                            ThemeListViewController.this.shareButton.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                            ThemeListViewController.this.scanButtonWrap.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                        } else {
                            themeListViewController2.recyclerView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                            ThemeListViewController.this.shareButton.setLayoutParams(LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                        }
                    }
                    if (z) {
                        ThemeListViewController.this.bottomShadow.setVisibility(8);
                        ThemeListViewController.this.topShadow.setVisibility(8);
                    } else {
                        ThemeListViewController themeListViewController3 = ThemeListViewController.this;
                        int i3 = themeListViewController3.shareButton != null ? 136 : 80;
                        themeListViewController3.bottomShadow.setVisibility(0);
                        ThemeListViewController.this.bottomShadow.setLayoutParams(LayoutHelper.createFrame(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i3));
                        ThemeListViewController.this.topShadow.setVisibility(0);
                        ThemeListViewController.this.topShadow.setLayoutParams(LayoutHelper.createFrame(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                    }
                    if (ThemeListViewController.this.prevIsPortrait != z) {
                        RecyclerListView recyclerListView = ThemeListViewController.this.recyclerView;
                        ThemeListViewController themeListViewController4 = ThemeListViewController.this;
                        recyclerListView.setLayoutManager(themeListViewController4.layoutManager = themeListViewController4.getLayoutManager(z));
                        ThemeListViewController.this.recyclerView.requestLayout();
                        ThemeListViewController themeListViewController5 = ThemeListViewController.this;
                        int i4 = themeListViewController5.prevSelectedPosition;
                        if (i4 != -1) {
                            themeListViewController5.setSelectedPosition(i4);
                        }
                        ThemeListViewController.this.prevIsPortrait = z;
                    }
                    super.onMeasure(i, i2);
                }

                @Override
                public boolean verifyDrawable(Drawable drawable) {
                    return drawable == ThemeListViewController.this.backgroundDrawable || super.verifyDrawable(drawable);
                }
            };
            this.rootLayout = frameLayout;
            TextView textView = new TextView(parentActivity);
            this.titleView = textView;
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            textView.setLines(1);
            textView.setSingleLine(true);
            textView.setTextColor(baseFragment.getThemedColor(Theme.key_dialogTextBlack));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
            int i = Theme.key_featuredStickers_addButton;
            int themedColor2 = baseFragment.getThemedColor(i);
            int iDp = AndroidUtilities.dp(28.0f);
            int i2 = R.raw.sun_outline;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, Fragment$$ExternalSyntheticOutline0.m(i2, ""), iDp, iDp, false, null);
            this.darkThemeDrawable = rLottieDrawable;
            this.forceDark = !Theme.currentTheme.isDark();
            setForceDark(Theme.currentTheme.isDark(), false);
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            rLottieDrawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
            RLottieImageView rLottieImageView = new RLottieImageView(parentActivity) {
                @Override
                public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    if (QrActivity.this.isCurrentThemeDark) {
                        accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToDayTheme));
                    } else {
                        accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToNightTheme));
                    }
                }
            };
            this.darkThemeView = rLottieImageView;
            rLottieImageView.setAnimation(rLottieDrawable);
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            rLottieImageView.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 22));
            rLottieImageView.setAlpha(0.0f);
            rLottieImageView.setVisibility(4);
            frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(parentActivity, baseFragment.getResourceProvider());
            this.progressView = flickerLoadingView;
            flickerLoadingView.setVisibility(0);
            frameLayout.addView(flickerLoadingView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
            this.prevIsPortrait = true;
            RecyclerListView recyclerListView = new RecyclerListView(parentActivity);
            this.recyclerView = recyclerListView;
            ChatThemeBottomSheet.Adapter adapter = new ChatThemeBottomSheet.Adapter(((BaseFragment) QrActivity.this).currentAccount, QrActivity.this.resourcesProvider, 2);
            this.adapter = adapter;
            recyclerListView.setAdapter(adapter);
            recyclerListView.setClipChildren(false);
            recyclerListView.setClipToPadding(false);
            recyclerListView.lambda$onCellEnter$52(null);
            recyclerListView.setNestedScrollingEnabled(false);
            LinearLayoutManager layoutManager = getLayoutManager(this.prevIsPortrait);
            this.layoutManager = layoutManager;
            recyclerListView.setLayoutManager(layoutManager);
            recyclerListView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 4));
            recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                private int yScroll = 0;

                @Override
                public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    super.onScrolled(recyclerView, i3, i4);
                    this.yScroll += i4;
                    ThemeListViewController.this.topShadow.setAlpha((this.yScroll * 1.0f) / AndroidUtilities.dp(6.0f));
                }
            });
            frameLayout.addView(recyclerListView);
            View view = new View(parentActivity);
            this.topShadow = view;
            view.setAlpha(0.0f);
            int i3 = R.drawable.shadowdown;
            view.setBackground(parentActivity.getDrawable(i3));
            view.setRotation(180.0f);
            frameLayout.addView(view);
            View view2 = new View(parentActivity);
            this.bottomShadow = view2;
            view2.setBackground(parentActivity.getDrawable(i3));
            frameLayout.addView(view2);
            TextView textView2 = new TextView(parentActivity);
            this.shareButton = textView2;
            int themedColor3 = baseFragment.getThemedColor(i);
            textView2.setBackground(Theme.AdaptiveRipple.createRect(new float[]{24.0f}, themedColor3, Theme.AdaptiveRipple.calcRippleColor(themedColor3)));
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView2.setEllipsize(truncateAt);
            textView2.setGravity(17);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setText(LocaleController.getString(R.string.ShareQrCode));
            textView2.setTextColor(baseFragment.getThemedColor(Theme.key_featuredStickers_buttonText));
            textView2.setTextSize(1, 15.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView2);
            if (UserConfig.getInstance(((BaseFragment) QrActivity.this).currentAccount).getClientUserId() != QrActivity.this.userId) {
                this.scanButtonWrap = null;
                this.scanButtonIcon = null;
                this.scanButton = null;
                return;
            }
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            this.scanButtonWrap = linearLayout;
            linearLayout.setBackground(Theme.AdaptiveRipple.createRect(new float[]{24.0f}, 0, ColorUtils.setAlphaComponent(Theme.AdaptiveRipple.calcRippleColor(baseFragment.getThemedColor(i)), 25)));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(parentActivity);
            this.scanButtonIcon = imageView;
            imageView.setLayoutParams(LayoutHelper.createLinear(24, 24, 17, 0, 0, 10, 0));
            imageView.setImageResource(R.drawable.profile_qr_scan_24);
            imageView.setColorFilter(new PorterDuffColorFilter(baseFragment.getThemedColor(i), mode));
            linearLayout.addView(imageView);
            TextView textView3 = new TextView(parentActivity);
            this.scanButton = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.ScanQrCode));
            textView3.setTextColor(baseFragment.getThemedColor(i));
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView3);
            frameLayout.addView(linearLayout);
        }

        public LinearLayoutManager getLayoutManager(boolean z) {
            if (z) {
                this.fragment.getParentActivity();
                return new LinearLayoutManager(0, false);
            }
            this.fragment.getParentActivity();
            return new GridLayoutManager(3, 1, false);
        }

        public void lambda$new$0(View view) {
            if (this.changeDayNightViewAnimator != null) {
                return;
            }
            setupLightDarkTheme(!this.forceDark);
        }

        public void lambda$onItemClicked$1(int i) {
            int iMin;
            RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
            if (layoutManager != null) {
                if (this.prevIsPortrait) {
                    iMin = i > this.prevSelectedPosition ? Math.min(i + 1, this.adapter.items.size() - 1) : Math.max(i - 1, 0);
                } else {
                    iMin = i;
                }
                this.scroller.setTargetPosition(iMin);
                layoutManager.startSmoothScroll(this.scroller);
            }
            this.prevSelectedPosition = i;
        }

        public void lambda$setupLightDarkTheme$2(ValueAnimator valueAnimator) {
            this.changeDayNightViewProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.changeDayNightView.invalidate();
        }

        public void lambda$setupLightDarkTheme$3(boolean z) {
            ChatThemeBottomSheet.Adapter adapter = this.adapter;
            if (adapter == null || adapter.items == null) {
                return;
            }
            setForceDark(z, true);
            if (this.selectedItem != null) {
                this.isLightDarkChangeAnimation = true;
                setDarkTheme(z);
            }
            if (this.adapter.items != null) {
                for (int i = 0; i < this.adapter.items.size(); i++) {
                    this.adapter.items.get(i).themeIndex = z ? 1 : 0;
                    this.adapter.items.get(i).icon = QrActivity.this.getEmojiThemeIcon(this.adapter.items.get(i).chatTheme, z);
                }
                QrActivity.this.tempMotionDrawable = null;
                this.adapter.notifyDataSetChanged();
            }
        }

        public void onAnimationEnd() {
            this.isLightDarkChangeAnimation = false;
        }

        public void onAnimationStart() {
            List<ChatThemeBottomSheet.ChatThemeItem> list;
            ChatThemeBottomSheet.Adapter adapter = this.adapter;
            if (adapter != null && (list = adapter.items) != null) {
                Iterator<ChatThemeBottomSheet.ChatThemeItem> it = list.iterator();
                while (it.hasNext()) {
                    it.next().themeIndex = this.forceDark ? 1 : 0;
                }
            }
            if (this.isLightDarkChangeAnimation) {
                return;
            }
            setItemsAnimationProgress(1.0f);
        }

        public void setItemsAnimationProgress(float f) {
            for (int i = 0; i < this.adapter.getItemCount(); i++) {
                this.adapter.items.get(i).animationProgress = f;
            }
        }

        private void setupLightDarkTheme(final boolean z) {
            ValueAnimator valueAnimator = this.changeDayNightViewAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            FrameLayout frameLayout = (FrameLayout) this.fragment.getParentActivity().getWindow().getDecorView();
            FrameLayout frameLayout2 = (FrameLayout) this.window.getDecorView();
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
            final Canvas canvas = new Canvas(bitmapCreateBitmap);
            this.darkThemeView.setAlpha(0.0f);
            frameLayout.draw(canvas);
            frameLayout2.draw(canvas);
            this.darkThemeView.setAlpha(1.0f);
            final Paint paint = new Paint(1);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            final Paint paint2 = new Paint(1);
            paint2.setFilterBitmap(true);
            int[] iArr = new int[2];
            this.darkThemeView.getLocationInWindow(iArr);
            final float f = iArr[0];
            final float f2 = iArr[1];
            final float measuredWidth = (this.darkThemeView.getMeasuredWidth() / 2.0f) + f;
            final float measuredHeight = (this.darkThemeView.getMeasuredHeight() / 2.0f) + f2;
            final float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) * 0.9f;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
            this.changeDayNightView = new View(this.fragment.getParentActivity()) {
                @Override
                public void onDraw(Canvas canvas2) {
                    super.onDraw(canvas2);
                    if (z) {
                        if (ThemeListViewController.this.changeDayNightViewProgress > 0.0f) {
                            canvas.drawCircle(measuredWidth, measuredHeight, fMax * ThemeListViewController.this.changeDayNightViewProgress, paint);
                        }
                        canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint2);
                    } else {
                        canvas2.drawCircle(measuredWidth, measuredHeight, (1.0f - ThemeListViewController.this.changeDayNightViewProgress) * fMax, paint2);
                    }
                    canvas2.save();
                    canvas2.translate(f, f2);
                    ThemeListViewController.this.darkThemeView.draw(canvas2);
                    canvas2.restore();
                }
            };
            this.changeDayNightViewProgress = 0.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.changeDayNightViewAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 15));
            this.changeDayNightViewAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (ThemeListViewController.this.changeDayNightView != null) {
                        if (ThemeListViewController.this.changeDayNightView.getParent() != null) {
                            ((ViewGroup) ThemeListViewController.this.changeDayNightView.getParent()).removeView(ThemeListViewController.this.changeDayNightView);
                        }
                        ThemeListViewController.this.changeDayNightView = null;
                    }
                    ThemeListViewController.this.changeDayNightViewAnimator = null;
                    super.onAnimationEnd(animator);
                }
            });
            this.changeDayNightViewAnimator.setDuration(400L);
            this.changeDayNightViewAnimator.setInterpolator(Easings.easeInOutQuad);
            this.changeDayNightViewAnimator.start();
            frameLayout2.addView(this.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda0(this, z, 3));
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.emojiLoaded) {
                this.adapter.notifyDataSetChanged();
            }
        }

        public ArrayList<ThemeDescription> getThemeDescriptions() {
            ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
                private boolean isAnimationStarted = false;

                @Override
                public void didSetColor() {
                }

                @Override
                public void onAnimationProgress(float f) {
                    if (f == 0.0f && !this.isAnimationStarted) {
                        ThemeListViewController.this.onAnimationStart();
                        this.isAnimationStarted = true;
                    }
                    ThemeListViewController.this.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(ThemeListViewController.this.fragment.getThemedColor(Theme.key_featuredStickers_addButton), PorterDuff.Mode.SRC_IN));
                    ThemeListViewController themeListViewController = ThemeListViewController.this;
                    if (themeListViewController.isLightDarkChangeAnimation) {
                        themeListViewController.setItemsAnimationProgress(f);
                    }
                    if (f == 1.0f && this.isAnimationStarted) {
                        ThemeListViewController themeListViewController2 = ThemeListViewController.this;
                        themeListViewController2.isLightDarkChangeAnimation = false;
                        themeListViewController2.onAnimationEnd();
                        this.isAnimationStarted = false;
                    }
                }
            };
            ArrayList<ThemeDescription> arrayList = new ArrayList<>();
            Paint paint = this.backgroundPaint;
            int i = Theme.key_dialogBackground;
            arrayList.add(new ThemeDescription(null, 1, null, paint, null, null, i));
            int i2 = 0;
            arrayList.add(new ThemeDescription(null, 32, null, null, new Drawable[]{this.backgroundDrawable}, themeDescriptionDelegate, i));
            arrayList.add(new ThemeDescription(this.titleView, 4, null, null, null, null, Theme.key_dialogTextBlack));
            arrayList.add(new ThemeDescription(this.recyclerView, 16, new Class[]{ThemeSmallPreviewView.class}, null, null, null, Theme.key_dialogBackgroundGray));
            int size = arrayList.size();
            while (i2 < size) {
                ThemeDescription themeDescription = arrayList.get(i2);
                i2++;
                themeDescription.resourcesProvider = this.fragment.getResourceProvider();
            }
            return arrayList;
        }

        public void onCreate() {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(((BaseFragment) QrActivity.this).currentAccount);
            chatThemeController.preloadAllWallpaperThumbs(true);
            chatThemeController.preloadAllWallpaperThumbs(false);
            chatThemeController.preloadAllWallpaperImages(true);
            chatThemeController.preloadAllWallpaperImages(false);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        }

        public void onDataLoaded() {
            this.darkThemeView.setAlpha(0.0f);
            this.darkThemeView.animate().alpha(1.0f).setDuration(150L).start();
            this.darkThemeView.setVisibility(0);
            this.progressView.animate().alpha(0.0f).setListener(new HideViewAfterAnimation(this.progressView)).setDuration(150L).start();
            this.recyclerView.setAlpha(0.0f);
            this.recyclerView.animate().alpha(1.0f).setDuration(150L).start();
        }

        public void onDestroy() {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        }

        public void onItemClicked(View view, int i) {
            if (this.adapter.items.get(i) == this.selectedItem || this.changeDayNightView != null) {
                return;
            }
            this.isLightDarkChangeAnimation = false;
            this.selectedItem = this.adapter.items.get(i);
            this.adapter.setSelectedItem(i);
            this.rootLayout.postDelayed(new OAuthSheet$$ExternalSyntheticLambda6(this, i, 13), 100L);
            for (int i2 = 0; i2 < this.recyclerView.getChildCount(); i2++) {
                ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) this.recyclerView.getChildAt(i2);
                if (themeSmallPreviewView != view) {
                    themeSmallPreviewView.cancelAnimation();
                }
            }
            if (!this.adapter.items.get(i).chatTheme.showAsDefaultStub) {
                ((ThemeSmallPreviewView) view).playEmojiAnimation();
            }
            OnItemSelectedListener onItemSelectedListener = this.itemSelectedListener;
            if (onItemSelectedListener != null) {
                onItemSelectedListener.onItemSelected(this.selectedItem.chatTheme, i);
            }
        }

        public void setDarkTheme(boolean z) {
            QrActivity.this.isCurrentThemeDark = z;
            QrActivity qrActivity = QrActivity.this;
            qrActivity.onItemSelected(qrActivity.currentTheme, QrActivity.this.selectedPosition, false);
        }

        public void setForceDark(boolean z, boolean z2) {
            if (this.forceDark == z) {
                return;
            }
            this.forceDark = z;
            int framesCount = z ? this.darkThemeDrawable.getFramesCount() - 1 : 0;
            if (z2) {
                this.darkThemeDrawable.setCustomEndFrame(framesCount);
                RLottieImageView rLottieImageView = this.darkThemeView;
                if (rLottieImageView != null) {
                    rLottieImageView.playAnimation();
                    return;
                }
                return;
            }
            this.darkThemeDrawable.setCustomEndFrame(framesCount);
            this.darkThemeDrawable.setCurrentFrame(framesCount, false, true);
            RLottieImageView rLottieImageView2 = this.darkThemeView;
            if (rLottieImageView2 != null) {
                rLottieImageView2.invalidate();
            }
        }

        public void setItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
            this.itemSelectedListener = onItemSelectedListener;
        }

        public void setSelectedPosition(int i) {
            this.prevSelectedPosition = i;
            this.adapter.setSelectedItem(i);
            if (i > 0 && i < this.adapter.items.size() / 2) {
                i--;
            }
            this.layoutManager.scrollToPositionWithOffset(Math.min(i, this.adapter.items.size() - 1), 0);
        }
    }

    public class ThemeResourcesProvider implements Theme.ResourcesProvider {
        private SparseIntArray colors;

        private ThemeResourcesProvider() {
        }

        @Override
        public void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, i, i2, f, f2);
        }

        @Override
        public ColorFilter getAnimatedEmojiColorFilter() {
            return Theme.chat_animatedEmojiTextColorFilter;
        }

        @Override
        public int getColor(int i) {
            SparseIntArray sparseIntArray = this.colors;
            return sparseIntArray != null ? sparseIntArray.get(i) : Theme.getColor(null, i, false);
        }

        @Override
        public int getColorOrDefault(int i) {
            return getColor(i);
        }

        @Override
        public int getCurrentColor(int i) {
            return getColor(i);
        }

        @Override
        public Drawable getDrawable(String str) {
            return null;
        }

        @Override
        public Paint getPaint(String str) {
            return Theme.getThemePaint(str);
        }

        @Override
        public boolean hasGradientService() {
            return false;
        }

        public void initColors(EmojiThemes emojiThemes, boolean z) {
            this.colors = emojiThemes.createColors(((BaseFragment) QrActivity.this).currentAccount, z ? 1 : 0);
        }

        @Override
        public boolean isDark() {
            return Theme.currentTheme.isDark();
        }

        @Override
        public void setAnimatedColor(int i, int i2) {
        }
    }

    static {
        ArrayMap arrayMap = new ArrayMap(0);
        qrColorsMap = arrayMap;
        arrayMap.put("🏠d", new int[]{-9324972, -13856649, -6636738, -9915042});
        arrayMap.put("🐥d", new int[]{-12344463, -7684788, -6442695, -8013488});
        arrayMap.put("⛄d", new int[]{-10051073, -10897938, -12469550, -7694337});
        arrayMap.put("💎d", new int[]{-11429643, -11814958, -5408261, -2128185});
        arrayMap.put("👨\u200d🏫d", new int[]{-6637227, -12015466, -13198627, -10631557});
        arrayMap.put("🌷d", new int[]{-1146812, -1991901, -1745517, -3443241});
        arrayMap.put("💜d", new int[]{-1156738, -1876046, -5412366, -28073});
        arrayMap.put("🎄d", new int[]{-1281978, -551386, -1870308, -742870});
        arrayMap.put("🎮d", new int[]{-15092782, -2333964, -1684365, -1269214});
        arrayMap.put("🏠n", new int[]{-15368239, -11899662, -15173939, -13850930});
        arrayMap.put("🐥n", new int[]{-11033320, -14780848, -9594089, -12604587});
        arrayMap.put("⛄n", new int[]{-13930790, -13665098, -14833975, -9732865});
        arrayMap.put("💎n", new int[]{-5089608, -9481473, -14378302, -13337899});
        arrayMap.put("👨\u200d🏫n", new int[]{-14447768, -9199261, -15356801, -15823723});
        arrayMap.put("🌷n", new int[]{-2534316, -2984177, -3258783, -5480504});
        arrayMap.put("💜n", new int[]{-3123030, -2067394, -2599576, -6067757});
        arrayMap.put("🎄n", new int[]{-2725857, -3242459, -3248848, -3569123});
        arrayMap.put("🎮n", new int[]{-3718333, -1278154, -16338695, -6076417});
        firstOpen = true;
    }

    public QrActivity(Bundle bundle) {
        super(bundle);
        this.resourcesProvider = new ThemeResourcesProvider();
        EmojiThemes emojiThemes = new EmojiThemes(this.currentAccount);
        emojiThemes.emoji = "🏠";
        emojiThemes.key = new ThemeKey("🏠", null);
        emojiThemes.chatTheme = TLRPC.ChatTheme.ofEmoticon("🏠");
        EmojiThemes.ThemeItem themeItem = new EmojiThemes.ThemeItem();
        HashMap map = Theme.themesDict;
        themeItem.themeInfo = (Theme.ThemeInfo) map.get("Blue");
        themeItem.accentId = 99;
        ArrayList arrayList = emojiThemes.items;
        arrayList.add(themeItem);
        EmojiThemes.ThemeItem themeItem2 = new EmojiThemes.ThemeItem();
        themeItem2.themeInfo = (Theme.ThemeInfo) map.get("Dark Blue");
        themeItem2.accentId = 0;
        arrayList.add(themeItem2);
        this.homeTheme = emojiThemes;
        this.logoRect = new Rect();
        this.emojiThemeDarkIcons = new ArrayMap(0);
        this.prevQrColors = null;
        this.currMotionDrawable = new MotionBackgroundDrawable();
        this.currentTheme = emojiThemes;
        this.selectedPosition = -1;
        this.insets = Insets.NONE;
    }

    private void applyScreenSettings() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.prevSystemUiVisibility | 1028);
        }
    }

    public Bitmap getEmojiThemeIcon(EmojiThemes emojiThemes, boolean z) {
        if (!z) {
            return this.emojiThemeIcon;
        }
        Bitmap bitmapCreateBitmap = (Bitmap) this.emojiThemeDarkIcons.get(emojiThemes.emoji);
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(this.emojiThemeIcon.getWidth(), this.emojiThemeIcon.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            int[] iArr = (int[]) qrColorsMap.get(emojiThemes.emoji + "n");
            if (iArr != null) {
                if (this.tempMotionDrawable == null) {
                    this.tempMotionDrawable = new MotionBackgroundDrawable(0, 0, 0, 0, true);
                }
                this.tempMotionDrawable.setColors(iArr[0], iArr[1], iArr[2], iArr[3]);
                this.tempMotionDrawable.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                this.tempMotionDrawable.draw(canvas);
            }
            canvas.drawBitmap(this.emojiThemeIcon, 0.0f, 0.0f, (Paint) null);
            canvas.setBitmap(null);
            this.emojiThemeDarkIcons.put(emojiThemes.emoji, bitmapCreateBitmap);
        }
        return bitmapCreateBitmap;
    }

    public void lambda$createView$0(int i, int i2, int i3, int i4) {
        this.logoRect.set(i, i2, i3, i4);
        this.qrView.requestLayout();
    }

    public void lambda$createView$1(View view) {
        finishFragment();
    }

    public void lambda$createView$2(EmojiThemes emojiThemes, int i) {
        onItemSelected(emojiThemes, i, true);
    }

    public void lambda$createView$3(View view) {
        this.themesViewController.shareButton.setClickable(false);
        performShare();
    }

    public void lambda$createView$4(View view) {
        if (getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
            openCameraScanActivity(this);
        } else {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        }
    }

    public void lambda$createView$5() {
        onItemSelected(this.currentTheme, 0, true);
        RLottieDrawable animatedDrawable = this.logoImageView.getAnimatedDrawable();
        if (this.logoOptimal != null || animatedDrawable == null) {
            return;
        }
        this.logoOptimal = Bitmap.createBitmap(animatedDrawable.getIntrinsicWidth(), animatedDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        animatedDrawable.prepareForGenerateCache();
        animatedDrawable.setGeneratingFrame(33);
        animatedDrawable.getNextFrame(this.logoOptimal);
        animatedDrawable.releaseForGenerateCache();
    }

    public void lambda$createView$6() {
        this.homeTheme.loadPreviewColors(this.currentAccount);
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new QrActivity$$ExternalSyntheticLambda1(this, 3), 17L);
    }

    public void lambda$createView$7() {
        firstOpen = false;
        List<EmojiThemes> list = cachedThemes;
        if (list == null || list.isEmpty()) {
            ChatThemeController.getInstance(this.currentAccount).requestAllChatThemes(new ResultCallback<List<EmojiThemes>>() {
                @Override
                public final void onError(Throwable th) {
                    ResultCallback.CC.$default$onError(this, th);
                }

                @Override
                public void onComplete(List<EmojiThemes> list2) {
                    QrActivity.this.onDataLoaded(list2);
                    List unused = QrActivity.cachedThemes = list2;
                }

                @Override
                public void onError(TLRPC.TL_error tL_error) {
                    Toast.makeText(QrActivity.this.getParentActivity(), tL_error.text, 0).show();
                }
            }, true);
        } else {
            onDataLoaded(cachedThemes);
        }
    }

    public void lambda$getThemeDescriptions$17() {
        setNavigationBarColor(getThemedColor(Theme.key_windowBackgroundGray));
    }

    public void lambda$onItemSelected$10(Bitmap bitmap) {
        onPatternLoaded(bitmap, 34, true);
    }

    public void lambda$onItemSelected$11() {
        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda5(0, this, SvgHelper.getBitmap(R.raw.default_pattern, this.backgroundView.getWidth(), this.backgroundView.getHeight(), -16777216)));
    }

    public void lambda$onItemSelected$12(int[] iArr, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        MotionBackgroundDrawable motionBackgroundDrawable = this.prevMotionDrawable;
        if (motionBackgroundDrawable != null) {
            motionBackgroundDrawable.setBackgroundAlpha(1.0f);
            this.prevMotionDrawable.setPatternAlpha(1.0f - fFloatValue);
        }
        this.currMotionDrawable.setBackgroundAlpha(fFloatValue);
        this.currMotionDrawable.setPatternAlpha(fFloatValue);
        if (iArr != null) {
            this.qrView.setColors(ColorUtils.blendARGB(fFloatValue, this.prevQrColors[0], iArr[0]), ColorUtils.blendARGB(fFloatValue, this.prevQrColors[1], iArr[1]), ColorUtils.blendARGB(fFloatValue, this.prevQrColors[2], iArr[2]), ColorUtils.blendARGB(fFloatValue, this.prevQrColors[3], iArr[3]));
        }
        this.backgroundView.invalidate();
    }

    public void lambda$onItemSelected$13() {
        this.resourcesProvider.initColors(this.currentTheme, this.isCurrentThemeDark);
    }

    public void lambda$onItemSelected$14(boolean z, EmojiThemes emojiThemes, INavigationLayout.ThemeAnimationSettings themeAnimationSettings) {
        if (z) {
            this.resourcesProvider.initColors(emojiThemes, this.isCurrentThemeDark);
        } else {
            this.resourcesProvider.initColors(this.currentTheme, this.isCurrentThemeDark);
        }
        themeAnimationSettings.afterStartDescriptionsAddedRunnable = new QrActivity$$ExternalSyntheticLambda1(this, 4);
        ((ActionBarLayout) this.parentLayout).animateThemedValues(themeAnimationSettings, null);
        LinearLayout linearLayout = this.themesViewController.scanButtonWrap;
        if (linearLayout != null) {
            linearLayout.setBackground(Theme.AdaptiveRipple.createRect(new float[]{6.0f}, 0, ColorUtils.setAlphaComponent(Theme.AdaptiveRipple.calcRippleColor(getThemedColor(Theme.key_featuredStickers_addButton)), 25)));
        }
    }

    public void lambda$onItemSelected$9(boolean z, long j, Pair pair) {
        long themeId = ((EmojiThemes.ThemeItem) this.currentTheme.items.get(z ? 1 : 0)).getThemeId();
        if (pair == null || themeId == 0) {
            return;
        }
        long jLongValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((WallpaperBitmapHolder) pair.second).bitmap;
        if (jLongValue != themeId || bitmap == null) {
            return;
        }
        onPatternLoaded(bitmap, this.currMotionDrawable.getIntensity(), SystemClock.elapsedRealtime() - j > 150);
    }

    public void lambda$onPatternLoaded$8(ValueAnimator valueAnimator) {
        this.currMotionDrawable.setPatternAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$onRequestPermissionsResultFragment$16(AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$performShare$15() {
        ThemeListViewController themeListViewController = this.themesViewController;
        if (themeListViewController == null) {
            return;
        }
        themeListViewController.shareButton.setClickable(true);
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.insets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        this.fragmentView.requestLayout();
        return WindowInsetsCompat.CONSUMED;
    }

    public void onDataLoaded(List<EmojiThemes> list) {
        if (list == null || list.isEmpty() || this.themesViewController == null) {
            return;
        }
        int i = 0;
        list.set(0, this.homeTheme);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            EmojiThemes emojiThemes = list.get(i2);
            emojiThemes.loadPreviewColors(this.currentAccount);
            ChatThemeBottomSheet.ChatThemeItem chatThemeItem = new ChatThemeBottomSheet.ChatThemeItem(emojiThemes);
            boolean z = this.isCurrentThemeDark;
            chatThemeItem.themeIndex = z ? 1 : 0;
            chatThemeItem.icon = getEmojiThemeIcon(emojiThemes, z);
            arrayList.add(chatThemeItem);
        }
        this.themesViewController.adapter.setItems(arrayList);
        while (true) {
            if (i == arrayList.size()) {
                i = -1;
                break;
            } else {
                if (ThemeKey.equals(((ChatThemeBottomSheet.ChatThemeItem) arrayList.get(i)).chatTheme.key, this.currentTheme.key)) {
                    this.themesViewController.selectedItem = (ChatThemeBottomSheet.ChatThemeItem) arrayList.get(i);
                    break;
                }
                i++;
            }
        }
        if (i != -1) {
            this.themesViewController.setSelectedPosition(i);
        }
        this.themesViewController.onDataLoaded();
    }

    public void onItemSelected(EmojiThemes emojiThemes, int i, boolean z) {
        float fMax;
        Theme.ThemeInfo themeInfo;
        int i2 = 0;
        this.selectedPosition = i;
        EmojiThemes emojiThemes2 = this.currentTheme;
        final boolean z2 = this.isCurrentThemeDark;
        this.currentTheme = emojiThemes;
        EmojiThemes.ThemeItem themeItem = (EmojiThemes.ThemeItem) emojiThemes.items.get(z2 ? 1 : 0);
        ValueAnimator valueAnimator = this.patternAlphaAnimator;
        if (valueAnimator != null) {
            fMax = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.patternAlphaAnimator.cancel();
        } else {
            fMax = 1.0f;
        }
        MotionBackgroundDrawable motionBackgroundDrawable = this.currMotionDrawable;
        this.prevMotionDrawable = motionBackgroundDrawable;
        motionBackgroundDrawable.setIndeterminateAnimation(false);
        this.prevMotionDrawable.setAlpha(255);
        MotionBackgroundDrawable motionBackgroundDrawable2 = new MotionBackgroundDrawable();
        this.currMotionDrawable = motionBackgroundDrawable2;
        motionBackgroundDrawable2.setCallback(this.backgroundView);
        this.currMotionDrawable.setColors(themeItem.patternBgColor, themeItem.patternBgGradientColor1, themeItem.patternBgGradientColor2, themeItem.patternBgGradientColor3);
        this.currMotionDrawable.setParentView(this.backgroundView);
        this.currMotionDrawable.setPatternAlpha(1.0f);
        this.currMotionDrawable.setIndeterminateAnimation(true);
        MotionBackgroundDrawable motionBackgroundDrawable3 = this.prevMotionDrawable;
        if (motionBackgroundDrawable3 != null) {
            this.currMotionDrawable.posAnimationProgress = motionBackgroundDrawable3.posAnimationProgress;
        }
        this.qrView.setPosAnimationProgress(this.currMotionDrawable.posAnimationProgress);
        TLRPC.WallPaper wallpaper = this.currentTheme.getWallpaper(z2 ? 1 : 0);
        if (wallpaper != null) {
            this.currMotionDrawable.setPatternBitmap(wallpaper.settings.intensity);
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.currentTheme.loadWallpaper(z2 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    this.f$0.lambda$onItemSelected$9(z2, jElapsedRealtime, (Pair) obj);
                }

                @Override
                public final void onError(Throwable th) {
                    ResultCallback.CC.$default$onError(this, th);
                }

                @Override
                public final void onError(TLRPC.TL_error tL_error) {
                    ResultCallback.CC.$default$onError(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new QrActivity$$ExternalSyntheticLambda1(this, i2), 35L);
        }
        MotionBackgroundDrawable motionBackgroundDrawable4 = this.currMotionDrawable;
        motionBackgroundDrawable4.setPatternColorFilter(motionBackgroundDrawable4.getPatternColor());
        ArrayMap arrayMap = qrColorsMap;
        StringBuilder sb = new StringBuilder();
        sb.append(emojiThemes.emoji);
        sb.append(z2 ? "n" : "d");
        final int[] iArr = (int[]) arrayMap.get(sb.toString());
        if (z) {
            if (this.prevQrColors == null) {
                int[] iArr2 = new int[4];
                this.prevQrColors = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.currMotionDrawable.setAlpha(255);
            this.currMotionDrawable.setBackgroundAlpha(0.0f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.patternAlphaAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda2(i2, this, iArr));
            this.patternAlphaAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationCancel(Animator animator) {
                    super.onAnimationCancel(animator);
                    float fFloatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                    if (iArr != null) {
                        System.arraycopy(new int[]{ColorUtils.blendARGB(fFloatValue, QrActivity.this.prevQrColors[0], iArr[0]), ColorUtils.blendARGB(fFloatValue, QrActivity.this.prevQrColors[1], iArr[1]), ColorUtils.blendARGB(fFloatValue, QrActivity.this.prevQrColors[2], iArr[2]), ColorUtils.blendARGB(fFloatValue, QrActivity.this.prevQrColors[3], iArr[3])}, 0, QrActivity.this.prevQrColors, 0, 4);
                    }
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    int[] iArr3 = iArr;
                    if (iArr3 != null) {
                        System.arraycopy(iArr3, 0, QrActivity.this.prevQrColors, 0, 4);
                    }
                    QrActivity.this.prevMotionDrawable = null;
                    QrActivity.this.patternAlphaAnimator = null;
                    QrActivity.this.currMotionDrawable.setBackgroundAlpha(1.0f);
                    QrActivity.this.currMotionDrawable.setPatternAlpha(1.0f);
                }
            });
            this.patternAlphaAnimator.setDuration((int) (fMax * 250.0f));
            this.patternAlphaAnimator.start();
        } else {
            if (iArr != null) {
                this.qrView.setColors(iArr[0], iArr[1], iArr[2], iArr[3]);
                System.arraycopy(iArr, 0, this.prevQrColors, 0, 4);
            }
            this.prevMotionDrawable = null;
            this.backgroundView.invalidate();
        }
        boolean z3 = this.isCurrentThemeDark;
        if (z3) {
            themeInfo = Theme.currentNightTheme;
        } else {
            themeInfo = Theme.currentDayTheme;
            if (themeInfo == null) {
                themeInfo = Theme.defaultTheme;
            }
        }
        INavigationLayout.ThemeAnimationSettings themeAnimationSettings = new INavigationLayout.ThemeAnimationSettings(null, themeInfo.currentAccentId, z3, !z);
        themeAnimationSettings.applyTheme = false;
        themeAnimationSettings.onlyTopFragment = true;
        themeAnimationSettings.resourcesProvider = getResourceProvider();
        themeAnimationSettings.duration = (int) (fMax * 250.0f);
        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda3(this, z, emojiThemes2, themeAnimationSettings));
    }

    private void onPatternLoaded(Bitmap bitmap, int i, boolean z) {
        if (bitmap != null) {
            this.currMotionDrawable.setPatternBitmap(i, bitmap, true);
            ValueAnimator valueAnimator = this.patternIntensityAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!z) {
                this.currMotionDrawable.setPatternAlpha(1.0f);
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.patternIntensityAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda8(this, 0));
            this.patternIntensityAnimator.setDuration(250L);
            this.patternIntensityAnimator.start();
        }
    }

    public static void openCameraScanActivity(BaseFragment baseFragment) {
        CameraScanActivity.showAsSheet(baseFragment, false, 1, (CameraScanActivity.CameraScanActivityDelegate) new AnonymousClass5(baseFragment.getCurrentAccount(), baseFragment));
    }

    private boolean phoneIsPublic() {
        char c;
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        if (privacyRules == null) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i < privacyRules.size()) {
                TLRPC.PrivacyRule privacyRule = privacyRules.get(i);
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                    c = 0;
                    break;
                }
                if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowAll)) {
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                        c = 1;
                        break;
                    }
                    i++;
                }
            }
            c = 2;
            break;
        }
        if (c == 2) {
            ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
            if (privacyRules2 == null || privacyRules2.size() == 0) {
                return true;
            }
            for (int i2 = 0; i2 < privacyRules2.size(); i2++) {
                TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i2);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll) {
                    return true;
                }
                if ((privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll) || (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts)) {
                    return false;
                }
            }
        }
        return c == 0 || c == 1;
    }

    private void restoreScreenSettings() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.prevSystemUiVisibility);
        }
    }

    @Override
    public View createView(Context context) {
        long j;
        TLRPC.Chat chat;
        String publicUsername;
        String userName;
        ImageLocation forChat;
        ImageLocation imageLocation;
        AvatarDrawable avatarDrawable;
        boolean z;
        boolean z2;
        String strM;
        LinearLayout linearLayout;
        long j2;
        final int i = 1;
        setHasOwnBackground(true);
        this.isCurrentThemeDark = Theme.currentTheme.isDark();
        final int i2 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setBackground(null);
        this.actionBar.setItemsColor(-1, false);
        FrameLayout frameLayout = new FrameLayout(context) {
            private boolean ignoreLayout;

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                super.dispatchTouchEvent(motionEvent);
                return true;
            }

            @Override
            public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                boolean z4 = measuredWidth < measuredHeight;
                if (QrActivity.this.themeLayout.getVisibility() == 0) {
                    if (z4) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth, AndroidUtilities.dp(25.0f) + (measuredHeight - QrActivity.this.themeLayout.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth - QrActivity.this.themeLayout.getWidth()), measuredHeight);
                    }
                    QrActivity.this.backgroundView.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    QrActivity.this.backgroundView.setClipBounds(null);
                }
                QrActivity.this.backgroundView.layout(0, 0, measuredWidth, measuredHeight);
                int measuredHeight2 = QrActivity.this.themeLayout.getVisibility() == 0 ? QrActivity.this.themeLayout.getMeasuredHeight() : 0;
                int measuredWidth2 = z4 ? (measuredWidth - QrActivity.this.qrView.getMeasuredWidth()) / 2 : QrActivity.this.insets.left + ((((measuredWidth - QrActivity.this.themeLayout.getMeasuredWidth()) - QrActivity.this.insets.left) - QrActivity.this.qrView.getMeasuredWidth()) / 2);
                int iDp = z4 ? AndroidUtilities.dp(52.0f) + (((((measuredHeight - measuredHeight2) - QrActivity.this.insets.top) - QrActivity.this.qrView.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + QrActivity.this.insets.top : (measuredHeight - QrActivity.this.qrView.getMeasuredHeight()) / 2;
                QrActivity.this.qrView.layout(measuredWidth2, iDp, QrActivity.this.qrView.getMeasuredWidth() + measuredWidth2, QrActivity.this.qrView.getMeasuredHeight() + iDp);
                if (z4) {
                    int measuredWidth3 = (measuredWidth - QrActivity.this.avatarImageView.getMeasuredWidth()) / 2;
                    int iDp2 = iDp - AndroidUtilities.dp(48.0f);
                    QrActivity.this.avatarImageView.layout(measuredWidth3, iDp2, QrActivity.this.avatarImageView.getMeasuredWidth() + measuredWidth3, QrActivity.this.avatarImageView.getMeasuredHeight() + iDp2);
                }
                if (QrActivity.this.themeLayout.getVisibility() == 0) {
                    if (z4) {
                        int measuredWidth4 = (measuredWidth - QrActivity.this.themeLayout.getMeasuredWidth()) / 2;
                        QrActivity.this.themeLayout.layout(measuredWidth4, getMeasuredHeight() - measuredHeight2, QrActivity.this.themeLayout.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight3 = (measuredHeight - QrActivity.this.themeLayout.getMeasuredHeight()) / 2;
                        QrActivity.this.themeLayout.layout(getMeasuredWidth() - QrActivity.this.themeLayout.getMeasuredWidth(), measuredHeight3, getMeasuredWidth(), QrActivity.this.themeLayout.getMeasuredHeight() + measuredHeight3);
                    }
                }
                QrActivity.this.logoImageView.layout(QrActivity.this.logoRect.left + measuredWidth2, QrActivity.this.logoRect.top + iDp, measuredWidth2 + QrActivity.this.logoRect.right, iDp + QrActivity.this.logoRect.bottom);
                int iDp3 = AndroidUtilities.dp(11.0f) + QrActivity.this.insets.left;
                int iDp4 = AndroidUtilities.dp(11.0f) + QrActivity.this.insets.top;
                QrActivity.this.closeImageView.layout(iDp3, iDp4, QrActivity.this.closeImageView.getMeasuredWidth() + iDp3, QrActivity.this.closeImageView.getMeasuredHeight() + iDp4);
            }

            @Override
            public void onMeasure(int i3, int i4) {
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i4);
                boolean z3 = size < size2;
                QrActivity.this.isFragmentViewPortrait = z3;
                QrActivity.this.avatarImageView.setVisibility(z3 ? 0 : 8);
                super.onMeasure(i3, i4);
                if (z3) {
                    this.ignoreLayout = true;
                    QrActivity.this.themeLayout.setPadding(QrActivity.this.insets.left, AndroidUtilities.dp(8.0f), QrActivity.this.insets.right, QrActivity.this.insets.bottom);
                    this.ignoreLayout = false;
                    QrActivity.this.themeLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 + QrActivity.this.insets.bottom, Integer.MIN_VALUE));
                    QrActivity.this.qrView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), 1073741824));
                    return;
                }
                this.ignoreLayout = true;
                QrActivity.this.themeLayout.setPadding(0, (QrActivity.this.insets.top * 2) / 3, QrActivity.this.insets.right, QrActivity.this.insets.bottom);
                this.ignoreLayout = false;
                QrActivity.this.themeLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + QrActivity.this.insets.right, 1073741824), i4);
                QrActivity.this.qrView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), 1073741824));
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        View view = new View(context) {
            @Override
            public void onDraw(Canvas canvas) {
                canvas.drawColor(QrActivity.this.isCurrentThemeDark ? -15590870 : -6569073);
                if (QrActivity.this.prevMotionDrawable != null) {
                    QrActivity.this.prevMotionDrawable.setBounds(0, 0, getWidth(), getHeight());
                }
                QrActivity.this.currMotionDrawable.setBounds(0, 0, getWidth(), getHeight());
                if (QrActivity.this.prevMotionDrawable != null) {
                    QrActivity.this.prevMotionDrawable.draw(canvas);
                }
                QrActivity.this.currMotionDrawable.draw(canvas);
                super.onDraw(canvas);
            }
        };
        this.backgroundView = view;
        frameLayout.addView(view);
        if (this.userId == 0) {
            j = 0;
            if (this.chatId != 0 && (chat = getMessagesController().getChat(Long.valueOf(this.chatId))) != null) {
                publicUsername = ChatObject.getPublicUsername(chat);
                AvatarDrawable avatarDrawable2 = new AvatarDrawable(chat);
                ImageLocation forChat2 = ImageLocation.getForChat(this.currentAccount, chat, 1);
                userName = null;
                forChat = ImageLocation.getForChat(this.currentAccount, chat, 0);
                imageLocation = forChat2;
                avatarDrawable = avatarDrawable2;
            }
            z = false;
            z2 = false;
            QrView qrView = new QrView(context);
            this.qrView = qrView;
            qrView.setColors(-9324972, -13856649, -6636738, -9915042);
            if (publicUsername != null) {
                strM = Fragment$$ExternalSyntheticOutline0.m(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
            } else {
                strM = null;
            }
            QrView qrView2 = this.qrView;
            if (userName != null) {
                publicUsername = userName;
            }
            qrView2.setData(strM, publicUsername, z, z2);
            this.qrView.setCenterChangedListener(new QrActivity$$ExternalSyntheticLambda7(this));
            frameLayout.addView(this.qrView);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.logoImageView = rLottieImageView;
            rLottieImageView.setAutoRepeat(true);
            this.logoImageView.setAnimation(R.raw.plane_logo_plain, 60, 60);
            this.logoImageView.playAnimation();
            frameLayout.addView(this.logoImageView);
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarImageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(42.0f));
            this.avatarImageView.setSize(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
            frameLayout.addView(this.avatarImageView, LayoutHelper.createFrame(84, 84, 51));
            this.avatarImageView.setImage(forChat, "84_84", imageLocation, "50_50", avatarDrawable, (Bitmap) null, (String) null, 0, (Object) null);
            ImageView imageView = new ImageView(context);
            this.closeImageView = imageView;
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
            this.closeImageView.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(34.0f), 671088640, 687865855));
            this.closeImageView.setImageResource(R.drawable.ic_ab_back);
            this.closeImageView.setScaleType(ImageView.ScaleType.CENTER);
            this.closeImageView.setOnClickListener(new View.OnClickListener(this) {
                public final QrActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$createView$1(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$4(view2);
                            break;
                    }
                }
            });
            frameLayout.addView(this.closeImageView, LayoutHelper.createFrame(34, 34.0f));
            this.emojiThemeIcon = Bitmap.createBitmap(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.emojiThemeIcon);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, this.emojiThemeIcon.getWidth(), this.emojiThemeIcon.getHeight());
            Paint paint = new Paint(1);
            paint.setColor(-1);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.msg_qr_mini);
            canvas.drawBitmap(bitmapDecodeResource, (this.emojiThemeIcon.getWidth() - bitmapDecodeResource.getWidth()) * 0.5f, (this.emojiThemeIcon.getHeight() - bitmapDecodeResource.getHeight()) * 0.5f, paint);
            canvas.setBitmap(null);
            ThemeListViewController themeListViewController = new ThemeListViewController(this, getParentActivity().getWindow());
            this.themesViewController = themeListViewController;
            this.themeLayout = themeListViewController.rootLayout;
            themeListViewController.onCreate();
            this.themesViewController.setItemSelectedListener(new QrActivity$$ExternalSyntheticLambda7(this));
            this.themesViewController.titleView.setText(LocaleController.getString(R.string.QrCode));
            this.themesViewController.progressView.setViewType(17);
            this.themesViewController.shareButton.setOnClickListener(new View.OnClickListener(this) {
                public final QrActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$createView$1(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$4(view2);
                            break;
                    }
                }
            });
            linearLayout = this.themesViewController.scanButtonWrap;
            if (linearLayout != null) {
                final int i3 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final QrActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$createView$1(view2);
                                break;
                            case 1:
                                this.f$0.lambda$createView$3(view2);
                                break;
                            default:
                                this.f$0.lambda$createView$4(view2);
                                break;
                        }
                    }
                });
            }
            frameLayout.addView(this.themeLayout, LayoutHelper.createFrame(-1, -2, 80));
            this.currMotionDrawable.setIndeterminateAnimation(true);
            this.fragmentView = frameLayout;
            Utilities.themeQueue.postRunnable(new QrActivity$$ExternalSyntheticLambda1(this, i), 25L);
            View view2 = this.fragmentView;
            QrActivity$$ExternalSyntheticLambda1 qrActivity$$ExternalSyntheticLambda1 = new QrActivity$$ExternalSyntheticLambda1(this, 2);
            if (firstOpen) {
                j2 = 250;
            } else {
                j2 = j;
            }
            view2.postDelayed(qrActivity$$ExternalSyntheticLambda1, j2);
            this.prevSystemUiVisibility = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
            applyScreenSettings();
            View view3 = this.fragmentView;
            QrActivity$$ExternalSyntheticLambda7 qrActivity$$ExternalSyntheticLambda7 = new QrActivity$$ExternalSyntheticLambda7(this);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view3, qrActivity$$ExternalSyntheticLambda7);
            return this.fragmentView;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.userId));
        if (user != null) {
            publicUsername = UserObject.getPublicUsername(user);
            if (publicUsername == null) {
                userName = UserObject.getUserName(user);
                if (phoneIsPublic()) {
                    publicUsername = user.phone;
                    if (publicUsername != null && !publicUsername.startsWith("+")) {
                        publicUsername = "+".concat(publicUsername);
                    }
                    z = true;
                } else {
                    z = false;
                    z2 = true;
                }
                AvatarDrawable avatarDrawable3 = new AvatarDrawable(user);
                j = 0;
                ImageLocation forUser = ImageLocation.getForUser(this.currentAccount, user, 1);
                forChat = ImageLocation.getForUser(this.currentAccount, user, 0);
                imageLocation = forUser;
                avatarDrawable = avatarDrawable3;
            } else {
                userName = null;
                z = false;
            }
            z2 = false;
            AvatarDrawable avatarDrawable4 = new AvatarDrawable(user);
            j = 0;
            ImageLocation forUser2 = ImageLocation.getForUser(this.currentAccount, user, 1);
            forChat = ImageLocation.getForUser(this.currentAccount, user, 0);
            imageLocation = forUser2;
            avatarDrawable = avatarDrawable4;
        } else {
            j = 0;
        }
        QrView qrView3 = new QrView(context);
        this.qrView = qrView3;
        qrView3.setColors(-9324972, -13856649, -6636738, -9915042);
        if (publicUsername != null) {
            strM = Fragment$$ExternalSyntheticOutline0.m(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
        } else {
            strM = null;
        }
        QrView qrView4 = this.qrView;
        if (userName != null) {
            publicUsername = userName;
        }
        qrView4.setData(strM, publicUsername, z, z2);
        this.qrView.setCenterChangedListener(new QrActivity$$ExternalSyntheticLambda7(this));
        frameLayout.addView(this.qrView);
        RLottieImageView rLottieImageView2 = new RLottieImageView(context);
        this.logoImageView = rLottieImageView2;
        rLottieImageView2.setAutoRepeat(true);
        this.logoImageView.setAnimation(R.raw.plane_logo_plain, 60, 60);
        this.logoImageView.playAnimation();
        frameLayout.addView(this.logoImageView);
        BackupImageView backupImageView2 = new BackupImageView(context);
        this.avatarImageView = backupImageView2;
        backupImageView2.setRoundRadius(AndroidUtilities.dp(42.0f));
        this.avatarImageView.setSize(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
        frameLayout.addView(this.avatarImageView, LayoutHelper.createFrame(84, 84, 51));
        this.avatarImageView.setImage(forChat, "84_84", imageLocation, "50_50", avatarDrawable, (Bitmap) null, (String) null, 0, (Object) null);
        ImageView imageView2 = new ImageView(context);
        this.closeImageView = imageView2;
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.closeImageView.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(34.0f), 671088640, 687865855));
        this.closeImageView.setImageResource(R.drawable.ic_ab_back);
        this.closeImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.closeImageView.setOnClickListener(new View.OnClickListener(this) {
            public final QrActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$createView$1(view4);
                        break;
                    case 1:
                        this.f$0.lambda$createView$3(view4);
                        break;
                    default:
                        this.f$0.lambda$createView$4(view4);
                        break;
                }
            }
        });
        frameLayout.addView(this.closeImageView, LayoutHelper.createFrame(34, 34.0f));
        this.emojiThemeIcon = Bitmap.createBitmap(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(this.emojiThemeIcon);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, this.emojiThemeIcon.getWidth(), this.emojiThemeIcon.getHeight());
        Paint paint2 = new Paint(1);
        paint2.setColor(-1);
        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.msg_qr_mini);
        canvas2.drawBitmap(bitmapDecodeResource2, (this.emojiThemeIcon.getWidth() - bitmapDecodeResource2.getWidth()) * 0.5f, (this.emojiThemeIcon.getHeight() - bitmapDecodeResource2.getHeight()) * 0.5f, paint2);
        canvas2.setBitmap(null);
        ThemeListViewController themeListViewController2 = new ThemeListViewController(this, getParentActivity().getWindow());
        this.themesViewController = themeListViewController2;
        this.themeLayout = themeListViewController2.rootLayout;
        themeListViewController2.onCreate();
        this.themesViewController.setItemSelectedListener(new QrActivity$$ExternalSyntheticLambda7(this));
        this.themesViewController.titleView.setText(LocaleController.getString(R.string.QrCode));
        this.themesViewController.progressView.setViewType(17);
        this.themesViewController.shareButton.setOnClickListener(new View.OnClickListener(this) {
            public final QrActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$createView$1(view4);
                        break;
                    case 1:
                        this.f$0.lambda$createView$3(view4);
                        break;
                    default:
                        this.f$0.lambda$createView$4(view4);
                        break;
                }
            }
        });
        linearLayout = this.themesViewController.scanButtonWrap;
        if (linearLayout != null) {
            final int i4 = 2;
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final QrActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view4) {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$createView$1(view4);
                            break;
                        case 1:
                            this.f$0.lambda$createView$3(view4);
                            break;
                        default:
                            this.f$0.lambda$createView$4(view4);
                            break;
                    }
                }
            });
        }
        frameLayout.addView(this.themeLayout, LayoutHelper.createFrame(-1, -2, 80));
        this.currMotionDrawable.setIndeterminateAnimation(true);
        this.fragmentView = frameLayout;
        Utilities.themeQueue.postRunnable(new QrActivity$$ExternalSyntheticLambda1(this, i), 25L);
        View view4 = this.fragmentView;
        QrActivity$$ExternalSyntheticLambda1 qrActivity$$ExternalSyntheticLambda2 = new QrActivity$$ExternalSyntheticLambda1(this, 2);
        if (firstOpen) {
            j2 = 250;
        } else {
            j2 = j;
        }
        view4.postDelayed(qrActivity$$ExternalSyntheticLambda2, j2);
        this.prevSystemUiVisibility = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
        applyScreenSettings();
        View view5 = this.fragmentView;
        QrActivity$$ExternalSyntheticLambda7 qrActivity$$ExternalSyntheticLambda8 = new QrActivity$$ExternalSyntheticLambda7(this);
        WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view5, qrActivity$$ExternalSyntheticLambda8);
        return this.fragmentView;
        publicUsername = null;
        userName = null;
        forChat = null;
        imageLocation = null;
        avatarDrawable = null;
        z = false;
        z2 = false;
        QrView qrView5 = new QrView(context);
        this.qrView = qrView5;
        qrView5.setColors(-9324972, -13856649, -6636738, -9915042);
        if (publicUsername != null) {
            strM = Fragment$$ExternalSyntheticOutline0.m(MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, new StringBuilder("https://"));
        } else {
            strM = null;
        }
        QrView qrView6 = this.qrView;
        if (userName != null) {
            publicUsername = userName;
        }
        qrView6.setData(strM, publicUsername, z, z2);
        this.qrView.setCenterChangedListener(new QrActivity$$ExternalSyntheticLambda7(this));
        frameLayout.addView(this.qrView);
        RLottieImageView rLottieImageView3 = new RLottieImageView(context);
        this.logoImageView = rLottieImageView3;
        rLottieImageView3.setAutoRepeat(true);
        this.logoImageView.setAnimation(R.raw.plane_logo_plain, 60, 60);
        this.logoImageView.playAnimation();
        frameLayout.addView(this.logoImageView);
        BackupImageView backupImageView3 = new BackupImageView(context);
        this.avatarImageView = backupImageView3;
        backupImageView3.setRoundRadius(AndroidUtilities.dp(42.0f));
        this.avatarImageView.setSize(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
        frameLayout.addView(this.avatarImageView, LayoutHelper.createFrame(84, 84, 51));
        this.avatarImageView.setImage(forChat, "84_84", imageLocation, "50_50", avatarDrawable, (Bitmap) null, (String) null, 0, (Object) null);
        ImageView imageView3 = new ImageView(context);
        this.closeImageView = imageView3;
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.closeImageView.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(34.0f), 671088640, 687865855));
        this.closeImageView.setImageResource(R.drawable.ic_ab_back);
        this.closeImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.closeImageView.setOnClickListener(new View.OnClickListener(this) {
            public final QrActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view6) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$createView$1(view6);
                        break;
                    case 1:
                        this.f$0.lambda$createView$3(view6);
                        break;
                    default:
                        this.f$0.lambda$createView$4(view6);
                        break;
                }
            }
        });
        frameLayout.addView(this.closeImageView, LayoutHelper.createFrame(34, 34.0f));
        this.emojiThemeIcon = Bitmap.createBitmap(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas3 = new Canvas(this.emojiThemeIcon);
        RectF rectF3 = AndroidUtilities.rectTmp;
        rectF3.set(0.0f, 0.0f, this.emojiThemeIcon.getWidth(), this.emojiThemeIcon.getHeight());
        Paint paint3 = new Paint(1);
        paint3.setColor(-1);
        canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint3);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Bitmap bitmapDecodeResource3 = BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.msg_qr_mini);
        canvas3.drawBitmap(bitmapDecodeResource3, (this.emojiThemeIcon.getWidth() - bitmapDecodeResource3.getWidth()) * 0.5f, (this.emojiThemeIcon.getHeight() - bitmapDecodeResource3.getHeight()) * 0.5f, paint3);
        canvas3.setBitmap(null);
        ThemeListViewController themeListViewController3 = new ThemeListViewController(this, getParentActivity().getWindow());
        this.themesViewController = themeListViewController3;
        this.themeLayout = themeListViewController3.rootLayout;
        themeListViewController3.onCreate();
        this.themesViewController.setItemSelectedListener(new QrActivity$$ExternalSyntheticLambda7(this));
        this.themesViewController.titleView.setText(LocaleController.getString(R.string.QrCode));
        this.themesViewController.progressView.setViewType(17);
        this.themesViewController.shareButton.setOnClickListener(new View.OnClickListener(this) {
            public final QrActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view6) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$createView$1(view6);
                        break;
                    case 1:
                        this.f$0.lambda$createView$3(view6);
                        break;
                    default:
                        this.f$0.lambda$createView$4(view6);
                        break;
                }
            }
        });
        linearLayout = this.themesViewController.scanButtonWrap;
        if (linearLayout != null) {
            final int i5 = 2;
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final QrActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view6) {
                    switch (i5) {
                        case 0:
                            this.f$0.lambda$createView$1(view6);
                            break;
                        case 1:
                            this.f$0.lambda$createView$3(view6);
                            break;
                        default:
                            this.f$0.lambda$createView$4(view6);
                            break;
                    }
                }
            });
        }
        frameLayout.addView(this.themeLayout, LayoutHelper.createFrame(-1, -2, 80));
        this.currMotionDrawable.setIndeterminateAnimation(true);
        this.fragmentView = frameLayout;
        Utilities.themeQueue.postRunnable(new QrActivity$$ExternalSyntheticLambda1(this, i), 25L);
        View view6 = this.fragmentView;
        QrActivity$$ExternalSyntheticLambda1 qrActivity$$ExternalSyntheticLambda3 = new QrActivity$$ExternalSyntheticLambda1(this, 2);
        if (firstOpen) {
            j2 = 250;
        } else {
            j2 = j;
        }
        view6.postDelayed(qrActivity$$ExternalSyntheticLambda3, j2);
        this.prevSystemUiVisibility = getParentActivity().getWindow().getDecorView().getSystemUiVisibility();
        applyScreenSettings();
        View view7 = this.fragmentView;
        QrActivity$$ExternalSyntheticLambda7 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda7(this);
        WeakHashMap weakHashMap3 = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view7, qrActivity$$ExternalSyntheticLambda9);
        return this.fragmentView;
    }

    @Override
    public boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public EdgeToEdgeSupportMode getEdgeToEdgeSupportMode() {
        return EdgeToEdgeSupportMode.FULL;
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> themeDescriptions = super.getThemeDescriptions();
        themeDescriptions.addAll(this.themesViewController.getThemeDescriptions());
        QrActivity$$ExternalSyntheticLambda18 qrActivity$$ExternalSyntheticLambda18 = new QrActivity$$ExternalSyntheticLambda18(this, 0);
        TextView textView = this.themesViewController.shareButton;
        int i = Theme.key_featuredStickers_addButton;
        themeDescriptions.add(new ThemeDescription(textView, 32, null, null, null, qrActivity$$ExternalSyntheticLambda18, i));
        themeDescriptions.add(new ThemeDescription(this.themesViewController.shareButton, 65568, null, null, null, null, Theme.key_featuredStickers_addButtonPressed));
        TextView textView2 = this.themesViewController.scanButton;
        if (textView2 != null) {
            themeDescriptions.add(new ThemeDescription(textView2, 4, null, null, null, qrActivity$$ExternalSyntheticLambda18, i));
            themeDescriptions.add(new ThemeDescription(this.themesViewController.scanButtonIcon, 8, null, null, null, qrActivity$$ExternalSyntheticLambda18, i));
        }
        int size = themeDescriptions.size();
        int i2 = 0;
        while (i2 < size) {
            ThemeDescription themeDescription = themeDescriptions.get(i2);
            i2++;
            themeDescription.resourcesProvider = getResourceProvider();
        }
        return themeDescriptions;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean onFragmentCreate() {
        this.userId = this.arguments.getLong("user_id");
        this.chatId = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        this.themesViewController.onDestroy();
        this.themesViewController = null;
        this.emojiThemeIcon.recycle();
        this.emojiThemeIcon = null;
        int i = 0;
        while (true) {
            ArrayMap arrayMap = this.emojiThemeDarkIcons;
            if (i >= arrayMap.size) {
                arrayMap.clear();
                restoreScreenSettings();
                super.onFragmentDestroy();
                return;
            } else {
                Bitmap bitmap = (Bitmap) arrayMap.valueAt(i);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                i++;
            }
        }
    }

    @Override
    public void onPause() {
        restoreScreenSettings();
        super.onPause();
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i == 34) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                new AlertDialog.Builder(getParentActivity(), 0, null).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint))).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new QrActivity$$ExternalSyntheticLambda7(this)).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).setTopAnimation(R.raw.permission_request_camera, 72, false, Theme.getColor(null, Theme.key_dialogTopBackground, false)).show();
            } else {
                openCameraScanActivity(this);
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        applyScreenSettings();
    }

    public void performShare() {
        Point point = AndroidUtilities.displaySize;
        int iMin = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int iMax = Math.max(point2.x, point2.y);
        float f = iMin;
        if ((iMax * 1.0f) / f > 1.92f) {
            iMax = (int) (f * 1.92f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMax, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        this.themeLayout.setVisibility(8);
        this.closeImageView.setVisibility(8);
        this.logoImageView.setVisibility(8);
        this.logoImageView.getAnimatedDrawable();
        QrView qrView = this.qrView;
        if (qrView != null) {
            qrView.setForShare(true);
        }
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
        this.fragmentView.layout(0, 0, iMin, iMax);
        this.fragmentView.draw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.logoImageView.getLeft(), this.logoImageView.getTop(), this.logoImageView.getRight(), this.logoImageView.getBottom());
        if (this.logoOptimal != null) {
            canvas.drawBitmap(this.logoOptimal, (Rect) null, rectF, new Paint(2));
        }
        canvas.setBitmap(null);
        this.themeLayout.setVisibility(0);
        this.closeImageView.setVisibility(0);
        this.logoImageView.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        QrView qrView2 = this.qrView;
        if (qrView2 != null) {
            qrView2.setForShare(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(bitmapCreateBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda1(this, 5), 500L);
    }
}
