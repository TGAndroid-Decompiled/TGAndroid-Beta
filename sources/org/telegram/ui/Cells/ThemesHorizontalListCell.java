package org.telegram.ui.Cells;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda66;
import org.telegram.ui.TON.TONIntroActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.ThemeSetUrlActivity;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;

public abstract class ThemesHorizontalListCell extends RecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    public static byte[] bytes = new byte[1024];
    private ThemesListAdapter adapter;
    private int currentType;
    private ArrayList<Theme.ThemeInfo> customThemes;
    private ArrayList<Theme.ThemeInfo> defaultThemes;
    private boolean drawDivider;
    private BaseFragment fragment;
    private LinearLayoutManager horizontalLayoutManager;
    private HashMap<String, Theme.ThemeInfo> loadingThemes;
    private HashMap<Theme.ThemeInfo, String> loadingWallpapers;
    private int prevCount;
    private Theme.ThemeInfo prevThemeInfo;

    public final class InnerThemeView extends FrameLayout {
        public ObjectAnimator accentAnimator;
        public boolean accentColorChanged;
        public int accentId;
        public float accentState;
        public int backColor;
        public Drawable backgroundDrawable;
        public final Paint bitmapPaint;
        public BitmapShader bitmapShader;
        public final RadioButton button;
        public int checkColor;
        public final ArgbEvaluator evaluator;
        public boolean hasWhiteBackground;
        public int inColor;
        public final Drawable inDrawable;
        public boolean isFirst;
        public boolean isLast;
        public long lastDrawTime;
        public int loadingColor;
        public Drawable loadingDrawable;
        public int oldBackColor;
        public int oldCheckColor;
        public int oldInColor;
        public int oldOutColor;
        public Drawable optionsDrawable;
        public int outColor;
        public final Drawable outDrawable;
        public final Paint paint;
        public float placeholderAlpha;
        public boolean pressed;
        public final RectF rect;
        public final Matrix shaderMatrix;
        public final TextPaint textPaint;
        public Theme.ThemeInfo themeInfo;

        public InnerThemeView(Context context) {
            super(context);
            this.rect = new RectF();
            this.paint = new Paint(1);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            this.evaluator = new ArgbEvaluator();
            this.bitmapPaint = new Paint(3);
            this.shaderMatrix = new Matrix();
            setWillNotDraw(false);
            this.inDrawable = context.getResources().getDrawable(R.drawable.minibubble_in).mutate();
            this.outDrawable = context.getResources().getDrawable(R.drawable.minibubble_out).mutate();
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            RadioButton radioButton = new RadioButton(context);
            this.button = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            addView(radioButton, LayoutHelper.createFrame(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
        }

        public final void applyTheme() {
            Theme.ThemeInfo themeInfo = this.themeInfo;
            int i = (themeInfo.firstAccentIsDefault && themeInfo.currentAccentId == Theme.DEFALT_THEME_ACCENT_ID) ? -1 : themeInfo.previewInColor;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.inDrawable.setColorFilter(new PorterDuffColorFilter(i, mode));
            Theme.ThemeInfo themeInfo2 = this.themeInfo;
            this.outDrawable.setColorFilter(new PorterDuffColorFilter((themeInfo2.firstAccentIsDefault && themeInfo2.currentAccentId == Theme.DEFALT_THEME_ACCENT_ID) ? -983328 : themeInfo2.previewOutColor, mode));
            double[] dArrRgbToHsv = null;
            if (this.themeInfo.pathToFile == null) {
                updateColors(false);
                this.optionsDrawable = null;
            } else {
                this.optionsDrawable = getResources().getDrawable(R.drawable.preview_dots).mutate();
                int previewBackgroundColor = this.themeInfo.getPreviewBackgroundColor();
                this.backColor = previewBackgroundColor;
                this.oldBackColor = previewBackgroundColor;
            }
            this.bitmapShader = null;
            this.backgroundDrawable = null;
            Theme.ThemeInfo themeInfo3 = this.themeInfo;
            int i2 = themeInfo3.previewBackgroundGradientColor1;
            if (i2 != 0 && themeInfo3.previewBackgroundGradientColor2 != 0) {
                int previewBackgroundColor2 = this.themeInfo.getPreviewBackgroundColor();
                Theme.ThemeInfo themeInfo4 = this.themeInfo;
                MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable(previewBackgroundColor2, themeInfo4.previewBackgroundGradientColor1, themeInfo4.previewBackgroundGradientColor2, themeInfo4.previewBackgroundGradientColor3, true);
                motionBackgroundDrawable.setRoundRadius(AndroidUtilities.dp(6.0f));
                this.backgroundDrawable = motionBackgroundDrawable;
                dArrRgbToHsv = AndroidUtilities.rgbToHsv(Color.red(this.themeInfo.getPreviewBackgroundColor()), Color.green(this.themeInfo.getPreviewBackgroundColor()), Color.blue(this.themeInfo.getPreviewBackgroundColor()));
            } else if (i2 != 0) {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.themeInfo.getPreviewBackgroundColor(), this.themeInfo.previewBackgroundGradientColor1});
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(6.0f));
                this.backgroundDrawable = gradientDrawable;
                dArrRgbToHsv = AndroidUtilities.rgbToHsv(Color.red(this.themeInfo.getPreviewBackgroundColor()), Color.green(this.themeInfo.getPreviewBackgroundColor()), Color.blue(this.themeInfo.getPreviewBackgroundColor()));
            } else if (themeInfo3.previewWallpaperOffset > 0 || themeInfo3.pathToWallpaper != null) {
                float fDp = AndroidUtilities.dp(76.0f);
                float fDp2 = AndroidUtilities.dp(97.0f);
                Theme.ThemeInfo themeInfo5 = this.themeInfo;
                Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(fDp, fDp2, themeInfo5.pathToWallpaper, themeInfo5.pathToFile, themeInfo5.previewWallpaperOffset);
                if (scaledBitmap != null) {
                    this.backgroundDrawable = new BitmapDrawable(scaledBitmap);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(scaledBitmap, tileMode, tileMode);
                    this.bitmapShader = bitmapShader;
                    this.bitmapPaint.setShader(bitmapShader);
                    int[] iArrCalcDrawableColor = AndroidUtilities.calcDrawableColor(this.backgroundDrawable);
                    dArrRgbToHsv = AndroidUtilities.rgbToHsv(Color.red(iArrCalcDrawableColor[0]), Color.green(iArrCalcDrawableColor[0]), Color.blue(iArrCalcDrawableColor[0]));
                }
            } else if (themeInfo3.getPreviewBackgroundColor() != 0) {
                dArrRgbToHsv = AndroidUtilities.rgbToHsv(Color.red(this.themeInfo.getPreviewBackgroundColor()), Color.green(this.themeInfo.getPreviewBackgroundColor()), Color.blue(this.themeInfo.getPreviewBackgroundColor()));
            }
            if (dArrRgbToHsv == null || dArrRgbToHsv[1] > 0.10000000149011612d || dArrRgbToHsv[2] < 0.9599999785423279d) {
                this.hasWhiteBackground = false;
            } else {
                this.hasWhiteBackground = true;
            }
            if (this.themeInfo.getPreviewBackgroundColor() == 0 && this.themeInfo.previewParsed && this.backgroundDrawable == null) {
                MotionBackgroundDrawable motionBackgroundDrawableCreateDefaultWallpaper = Theme.createDefaultWallpaper(100, 200);
                this.backgroundDrawable = motionBackgroundDrawableCreateDefaultWallpaper;
                motionBackgroundDrawableCreateDefaultWallpaper.setRoundRadius(AndroidUtilities.dp(6.0f));
            }
            invalidate();
        }

        @Override
        public final void onAttachedToWindow() {
            Theme.ThemeInfo themeInfo;
            TLRPC.TL_theme tL_theme;
            super.onAttachedToWindow();
            ThemesHorizontalListCell themesHorizontalListCell = ThemesHorizontalListCell.this;
            if (themesHorizontalListCell.currentType == 1) {
                themeInfo = Theme.currentNightTheme;
            } else {
                themeInfo = Theme.currentDayTheme;
                if (themeInfo == null) {
                    themeInfo = Theme.defaultTheme;
                }
            }
            this.button.setChecked(this.themeInfo == themeInfo, false);
            Theme.ThemeInfo themeInfo2 = this.themeInfo;
            if (themeInfo2 == null || (tL_theme = themeInfo2.info) == null || themeInfo2.themeLoaded) {
                return;
            }
            if (themesHorizontalListCell.loadingThemes.containsKey(FileLoader.getAttachFileName(tL_theme.document)) || themesHorizontalListCell.loadingWallpapers.containsKey(this.themeInfo)) {
                return;
            }
            this.themeInfo.themeLoaded = true;
            this.placeholderAlpha = 0.0f;
            parseTheme();
            applyTheme();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f;
            float f2;
            if (this.accentId != this.themeInfo.currentAccentId) {
                updateColors(true);
            }
            int iDp = this.isFirst ? AndroidUtilities.dp(22.0f) : 0;
            int iDp2 = AndroidUtilities.dp(11.0f);
            RectF rectF = this.rect;
            float f3 = iDp;
            float f4 = iDp2;
            rectF.set(f3, f4, AndroidUtilities.dp(76.0f) + iDp, AndroidUtilities.dp(97.0f) + iDp2);
            String name = this.themeInfo.getName();
            if (name.toLowerCase().endsWith(".attheme")) {
                name = name.substring(0, name.lastIndexOf(46));
            }
            int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(this.isFirst ? 10.0f : 15.0f)) - (this.isLast ? AndroidUtilities.dp(7.0f) : 0);
            TextPaint textPaint = this.textPaint;
            String string = TextUtils.ellipsize(name, textPaint, measuredWidth, TextUtils.TruncateAt.END).toString();
            int iCeil = (int) Math.ceil(textPaint.measureText(string));
            textPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            canvas.drawText(string, ((AndroidUtilities.dp(76.0f) - iCeil) / 2) + iDp, AndroidUtilities.dp(131.0f), textPaint);
            Theme.ThemeInfo themeInfo = this.themeInfo;
            TLRPC.TL_theme tL_theme = themeInfo.info;
            Paint paint = this.paint;
            RadioButton radioButton = this.button;
            if (tL_theme == null || (tL_theme.document != null && themeInfo.themeLoaded)) {
                int i = this.oldBackColor;
                int iIntValue = this.backColor;
                float f5 = this.accentState;
                f = 6.0f;
                ArgbEvaluator argbEvaluator = this.evaluator;
                if (f5 != 1.0f) {
                    iIntValue = ((Integer) argbEvaluator.evaluate(f5, Integer.valueOf(i), Integer.valueOf(iIntValue))).intValue();
                }
                paint.setColor(iIntValue);
                boolean z = this.accentColorChanged;
                Drawable drawable = this.outDrawable;
                Drawable drawable2 = this.inDrawable;
                if (z) {
                    f2 = 1.0f;
                    int i2 = this.oldInColor;
                    int iIntValue2 = this.inColor;
                    float f6 = this.accentState;
                    if (f6 != 1.0f) {
                        iIntValue2 = ((Integer) argbEvaluator.evaluate(f6, Integer.valueOf(i2), Integer.valueOf(iIntValue2))).intValue();
                    }
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable2.setColorFilter(new PorterDuffColorFilter(iIntValue2, mode));
                    int i3 = this.oldOutColor;
                    int iIntValue3 = this.outColor;
                    float f7 = this.accentState;
                    if (f7 != 1.0f) {
                        iIntValue3 = ((Integer) argbEvaluator.evaluate(f7, Integer.valueOf(i3), Integer.valueOf(iIntValue3))).intValue();
                    }
                    drawable.setColorFilter(new PorterDuffColorFilter(iIntValue3, mode));
                    this.accentColorChanged = false;
                } else {
                    f2 = 1.0f;
                }
                Drawable drawable3 = this.backgroundDrawable;
                if (drawable3 == null) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                } else if (this.bitmapShader != null) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                    float width = bitmapDrawable.getBitmap().getWidth();
                    float height = bitmapDrawable.getBitmap().getHeight();
                    float fWidth = width / rectF.width();
                    float fHeight = height / rectF.height();
                    Matrix matrix = this.shaderMatrix;
                    matrix.reset();
                    float fMin = f2 / Math.min(fWidth, fHeight);
                    float f8 = width / fHeight;
                    if (f8 > rectF.width()) {
                        matrix.setTranslate(f3 - ((f8 - rectF.width()) / 2.0f), f4);
                    } else {
                        matrix.setTranslate(f3, f4 - (((height / fWidth) - rectF.height()) / 2.0f));
                    }
                    matrix.preScale(fMin, fMin);
                    this.bitmapShader.setLocalMatrix(matrix);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.bitmapPaint);
                } else {
                    drawable3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    this.backgroundDrawable.draw(canvas);
                }
                radioButton.setColor(1728053247, -1);
                Theme.ThemeInfo themeInfo2 = this.themeInfo;
                if (themeInfo2.accentBaseColor != 0) {
                    if ("Day".equals(themeInfo2.name) || "Arctic Blue".equals(this.themeInfo.name)) {
                        int i4 = this.oldCheckColor;
                        int iIntValue4 = this.checkColor;
                        float f9 = this.accentState;
                        if (f9 != f2) {
                            iIntValue4 = ((Integer) argbEvaluator.evaluate(f9, Integer.valueOf(i4), Integer.valueOf(iIntValue4))).intValue();
                        }
                        radioButton.setColor(-5000269, iIntValue4);
                        Theme.chat_instantViewRectPaint.setColor(733001146);
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Theme.chat_instantViewRectPaint);
                    }
                } else if (this.hasWhiteBackground) {
                    radioButton.setColor(-5000269, (themeInfo2.firstAccentIsDefault && themeInfo2.currentAccentId == Theme.DEFALT_THEME_ACCENT_ID) ? -983328 : themeInfo2.previewOutColor);
                    Theme.chat_instantViewRectPaint.setColor(733001146);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Theme.chat_instantViewRectPaint);
                }
                drawable2.setBounds(AndroidUtilities.dp(6.0f) + iDp, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(49.0f) + iDp, AndroidUtilities.dp(36.0f));
                drawable2.draw(canvas);
                drawable.setBounds(AndroidUtilities.dp(27.0f) + iDp, AndroidUtilities.dp(41.0f), AndroidUtilities.dp(70.0f) + iDp, AndroidUtilities.dp(55.0f));
                drawable.draw(canvas);
                if (this.optionsDrawable != null && ThemesHorizontalListCell.this.currentType == 0) {
                    int iDp3 = ((int) rectF.right) - AndroidUtilities.dp(16.0f);
                    int iDp4 = AndroidUtilities.dp(6.0f) + ((int) rectF.top);
                    Drawable drawable4 = this.optionsDrawable;
                    drawable4.setBounds(iDp3, iDp4, drawable4.getIntrinsicWidth() + iDp3, this.optionsDrawable.getIntrinsicHeight() + iDp4);
                    this.optionsDrawable.draw(canvas);
                }
            } else {
                f = 6.0f;
                f2 = 1.0f;
            }
            Theme.ThemeInfo themeInfo3 = this.themeInfo;
            TLRPC.TL_theme tL_theme2 = themeInfo3.info;
            if (tL_theme2 != null && tL_theme2.document == null) {
                radioButton.setAlpha(0.0f);
                Theme.chat_instantViewRectPaint.setColor(733001146);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f), AndroidUtilities.dp(f), Theme.chat_instantViewRectPaint);
                if (this.loadingDrawable != null) {
                    int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText7, false);
                    if (this.loadingColor != color) {
                        Drawable drawable5 = this.loadingDrawable;
                        this.loadingColor = color;
                        Theme.setDrawableColor(color, drawable5);
                    }
                    int iCenterX = (int) (rectF.centerX() - (this.loadingDrawable.getIntrinsicWidth() / 2));
                    int iCenterY = (int) (rectF.centerY() - (this.loadingDrawable.getIntrinsicHeight() / 2));
                    Drawable drawable6 = this.loadingDrawable;
                    drawable6.setBounds(iCenterX, iCenterY, drawable6.getIntrinsicWidth() + iCenterX, this.loadingDrawable.getIntrinsicHeight() + iCenterY);
                    this.loadingDrawable.draw(canvas);
                    return;
                }
                return;
            }
            if ((tL_theme2 == null || themeInfo3.themeLoaded) && this.placeholderAlpha <= 0.0f) {
                if (radioButton.getAlpha() != f2) {
                    radioButton.setAlpha(1.0f);
                    return;
                }
                return;
            }
            radioButton.setAlpha(f2 - this.placeholderAlpha);
            paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
            paint.setAlpha((int) (this.placeholderAlpha * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f), AndroidUtilities.dp(f), paint);
            if (this.loadingDrawable != null) {
                int color2 = Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText7, false);
                if (this.loadingColor != color2) {
                    Drawable drawable7 = this.loadingDrawable;
                    this.loadingColor = color2;
                    Theme.setDrawableColor(color2, drawable7);
                }
                int iCenterX2 = (int) (rectF.centerX() - (this.loadingDrawable.getIntrinsicWidth() / 2));
                int iCenterY2 = (int) (rectF.centerY() - (this.loadingDrawable.getIntrinsicHeight() / 2));
                this.loadingDrawable.setAlpha((int) (this.placeholderAlpha * 255.0f));
                Drawable drawable8 = this.loadingDrawable;
                drawable8.setBounds(iCenterX2, iCenterY2, drawable8.getIntrinsicWidth() + iCenterX2, this.loadingDrawable.getIntrinsicHeight() + iCenterY2);
                this.loadingDrawable.draw(canvas);
            }
            if (this.themeInfo.themeLoaded) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long jMin = Math.min(17L, jElapsedRealtime - this.lastDrawTime);
                this.lastDrawTime = jElapsedRealtime;
                float f10 = this.placeholderAlpha - (jMin / 180.0f);
                this.placeholderAlpha = f10;
                if (f10 < 0.0f) {
                    this.placeholderAlpha = 0.0f;
                }
                invalidate();
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            String name = this.themeInfo.getName();
            if (name.toLowerCase().endsWith(".attheme")) {
                name = name.substring(0, name.lastIndexOf(46));
            }
            accessibilityNodeInfo.setText(name);
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.button.isChecked());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrMoreOptions)));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.isLast ? 22 : 15) + 76 + (this.isFirst ? 22 : 0)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(148.0f), 1073741824));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            Theme.ThemeInfo themeInfo;
            if (this.optionsDrawable != null && (themeInfo = this.themeInfo) != null && (themeInfo.info == null || themeInfo.themeLoaded)) {
                ThemesHorizontalListCell themesHorizontalListCell = ThemesHorizontalListCell.this;
                if (themesHorizontalListCell.currentType == 0) {
                    int action = motionEvent.getAction();
                    if (action == 0 || action == 1) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        RectF rectF = this.rect;
                        if (x > rectF.centerX() && y < rectF.centerY() - AndroidUtilities.dp(10.0f)) {
                            if (action == 0) {
                                this.pressed = true;
                            } else {
                                try {
                                    performHapticFeedback(3);
                                } catch (Exception unused) {
                                }
                                themesHorizontalListCell.showOptionsForTheme(this.themeInfo);
                            }
                        }
                        if (action == 1) {
                            this.pressed = false;
                        }
                    }
                    return this.pressed;
                }
            }
            return super.onTouchEvent(motionEvent);
        }

        public final boolean parseTheme() {
            Theme.ThemeInfo themeInfo;
            int iStringKeyToInt;
            int iIntValue;
            String[] strArrSplit;
            Theme.ThemeInfo themeInfo2 = this.themeInfo;
            if (themeInfo2 == null || themeInfo2.pathToFile == null) {
                return false;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(this.themeInfo.pathToFile));
                int i = 0;
                boolean z = false;
                while (true) {
                    try {
                        int i2 = fileInputStream.read(ThemesHorizontalListCell.bytes);
                        if (i2 == -1) {
                            break;
                        }
                        int i3 = i;
                        int i4 = 0;
                        for (int i5 = 0; i5 < i2; i5++) {
                            byte[] bArr = ThemesHorizontalListCell.bytes;
                            if (bArr[i5] == 10) {
                                int i6 = i5 - i4;
                                int i7 = i6 + 1;
                                String str = new String(bArr, i4, i6, "UTF-8");
                                if (!str.startsWith("WLS=")) {
                                    if (str.startsWith("WPS")) {
                                        this.themeInfo.previewWallpaperOffset = i7 + i3;
                                        z = true;
                                        break;
                                    }
                                    int iIndexOf = str.indexOf(61);
                                    if (iIndexOf != -1 && ((iStringKeyToInt = OKLCH.stringKeyToInt(str.substring(0, iIndexOf))) == Theme.key_chat_inBubble || iStringKeyToInt == Theme.key_chat_outBubble || iStringKeyToInt == Theme.key_chat_wallpaper || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to1 || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to2 || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to3)) {
                                        String strSubstring = str.substring(iIndexOf + 1);
                                        if (strSubstring.length() <= 0 || strSubstring.charAt(0) != '#') {
                                            iIntValue = Utilities.parseInt((CharSequence) strSubstring).intValue();
                                        } else {
                                            try {
                                                iIntValue = Color.parseColor(strSubstring);
                                            } catch (Exception unused) {
                                                iIntValue = Utilities.parseInt((CharSequence) strSubstring).intValue();
                                            }
                                        }
                                        if (iStringKeyToInt == Theme.key_chat_inBubble) {
                                            this.themeInfo.previewInColor = iIntValue;
                                        } else if (iStringKeyToInt == Theme.key_chat_outBubble) {
                                            this.themeInfo.previewOutColor = iIntValue;
                                        } else if (iStringKeyToInt == Theme.key_chat_wallpaper) {
                                            this.themeInfo.previewBackgroundColor = iIntValue;
                                        } else if (iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to1) {
                                            this.themeInfo.previewBackgroundGradientColor1 = iIntValue;
                                        } else if (iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to2) {
                                            this.themeInfo.previewBackgroundGradientColor2 = iIntValue;
                                        } else if (iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to3) {
                                            this.themeInfo.previewBackgroundGradientColor3 = iIntValue;
                                        }
                                    }
                                    FileLog.e(th);
                                    themeInfo = this.themeInfo;
                                    if (themeInfo.pathToWallpaper != null || themeInfo.badWallpaper || new File(this.themeInfo.pathToWallpaper).exists()) {
                                        this.themeInfo.previewParsed = true;
                                        return true;
                                    }
                                    ThemesHorizontalListCell themesHorizontalListCell = ThemesHorizontalListCell.this;
                                    if (themesHorizontalListCell.loadingWallpapers.containsKey(this.themeInfo)) {
                                        return false;
                                    }
                                    HashMap map = themesHorizontalListCell.loadingWallpapers;
                                    Theme.ThemeInfo themeInfo3 = this.themeInfo;
                                    map.put(themeInfo3, themeInfo3.slug);
                                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                    Theme.ThemeInfo themeInfo4 = this.themeInfo;
                                    tL_inputWallPaperSlug.slug = themeInfo4.slug;
                                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                                    ConnectionsManager.getInstance(themeInfo4.account).sendRequest(getwallpaper, new RichMediaUploader$$ExternalSyntheticLambda0(this, 11));
                                    return false;
                                }
                                String strSubstring2 = str.substring(4);
                                Uri uri = Uri.parse(strSubstring2);
                                this.themeInfo.slug = uri.getQueryParameter("slug");
                                this.themeInfo.pathToWallpaper = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strSubstring2) + ".wp").getAbsolutePath();
                                String queryParameter = uri.getQueryParameter("mode");
                                if (queryParameter != null && (strArrSplit = queryParameter.toLowerCase().split(" ")) != null && strArrSplit.length > 0) {
                                    for (String str2 : strArrSplit) {
                                        if ("blur".equals(str2)) {
                                            this.themeInfo.isBlured = true;
                                            break;
                                        }
                                    }
                                }
                                if (!TextUtils.isEmpty(uri.getQueryParameter("pattern"))) {
                                    try {
                                        String queryParameter2 = uri.getQueryParameter("bg_color");
                                        if (!TextUtils.isEmpty(queryParameter2)) {
                                            this.themeInfo.patternBgColor = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                            if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                this.themeInfo.patternBgGradientColor1 = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                            }
                                            if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                this.themeInfo.patternBgGradientColor2 = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                            }
                                            if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                this.themeInfo.patternBgGradientColor3 = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                            }
                                        }
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        String queryParameter3 = uri.getQueryParameter("rotation");
                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                            this.themeInfo.patternBgGradientRotation = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                        }
                                    } catch (Exception unused3) {
                                    }
                                    String queryParameter4 = uri.getQueryParameter("intensity");
                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                        this.themeInfo.patternIntensity = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                    }
                                    Theme.ThemeInfo themeInfo5 = this.themeInfo;
                                    if (themeInfo5.patternIntensity == 0) {
                                        themeInfo5.patternIntensity = 50;
                                    }
                                }
                                i4 += i7;
                                i3 += i7;
                            }
                        }
                        if (z || i == i3) {
                            break;
                            break;
                        }
                        fileInputStream.getChannel().position(i3);
                        i = i3;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                fileInputStream.close();
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
            themeInfo = this.themeInfo;
            if (themeInfo.pathToWallpaper != null) {
            }
            this.themeInfo.previewParsed = true;
            return true;
        }

        public final void updateColors(boolean z) {
            int i;
            int i2;
            this.oldInColor = this.inColor;
            this.oldOutColor = this.outColor;
            this.oldBackColor = this.backColor;
            this.oldCheckColor = this.checkColor;
            int i3 = 0;
            Theme.ThemeAccent accent = this.themeInfo.getAccent(false);
            if (accent != null) {
                i3 = accent.accentColor;
                i2 = accent.myMessagesAccentColor;
                if (i2 == 0) {
                    i2 = i3;
                }
                i = (int) accent.backgroundOverrideColor;
                if (i == 0) {
                    i = i3;
                }
            } else {
                i = 0;
                i2 = 0;
            }
            Theme.ThemeInfo themeInfo = this.themeInfo;
            this.inColor = Theme.changeColorAccent(themeInfo, i3, (themeInfo.firstAccentIsDefault && themeInfo.currentAccentId == Theme.DEFALT_THEME_ACCENT_ID) ? -1 : themeInfo.previewInColor);
            Theme.ThemeInfo themeInfo2 = this.themeInfo;
            this.outColor = Theme.changeColorAccent(themeInfo2, i2, (themeInfo2.firstAccentIsDefault && themeInfo2.currentAccentId == Theme.DEFALT_THEME_ACCENT_ID) ? -983328 : themeInfo2.previewOutColor);
            Theme.ThemeInfo themeInfo3 = this.themeInfo;
            this.backColor = Theme.changeColorAccent(themeInfo3, i, themeInfo3.getPreviewBackgroundColor());
            this.checkColor = this.outColor;
            this.accentId = this.themeInfo.currentAccentId;
            ObjectAnimator objectAnimator = this.accentAnimator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!z) {
                this.accentState = 1.0f;
                this.accentColorChanged = true;
                invalidate();
            } else {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "accentState", 0.0f, 1.0f);
                this.accentAnimator = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(200L);
                this.accentAnimator.start();
            }
        }
    }

    public final class ThemesListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ThemesListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            ThemesHorizontalListCell themesHorizontalListCell = ThemesHorizontalListCell.this;
            return themesHorizontalListCell.prevCount = themesHorizontalListCell.customThemes.size() + themesHorizontalListCell.defaultThemes.size();
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int size;
            ArrayList arrayList;
            Theme.ThemeInfo themeInfo;
            TLRPC.TL_theme tL_theme;
            InnerThemeView innerThemeView = (InnerThemeView) viewHolder.itemView;
            ThemesHorizontalListCell themesHorizontalListCell = ThemesHorizontalListCell.this;
            if (i < themesHorizontalListCell.defaultThemes.size()) {
                arrayList = themesHorizontalListCell.defaultThemes;
                size = i;
            } else {
                ArrayList arrayList2 = themesHorizontalListCell.customThemes;
                size = i - themesHorizontalListCell.defaultThemes.size();
                arrayList = arrayList2;
            }
            Theme.ThemeInfo themeInfo2 = (Theme.ThemeInfo) arrayList.get(size);
            boolean z = i == getItemCount() - 1;
            boolean z2 = i == 0;
            innerThemeView.themeInfo = themeInfo2;
            innerThemeView.isFirst = z2;
            innerThemeView.isLast = z;
            innerThemeView.accentId = themeInfo2.currentAccentId;
            RadioButton radioButton = innerThemeView.button;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(innerThemeView.isFirst ? 49.0f : 27.0f);
            radioButton.setLayoutParams(layoutParams);
            innerThemeView.placeholderAlpha = 0.0f;
            Theme.ThemeInfo themeInfo3 = innerThemeView.themeInfo;
            if (themeInfo3.pathToFile != null && !themeInfo3.previewParsed) {
                themeInfo3.previewInColor = Theme.getDefaultColor(Theme.key_chat_inBubble);
                innerThemeView.themeInfo.previewOutColor = Theme.getDefaultColor(Theme.key_chat_outBubble);
                boolean zExists = new File(innerThemeView.themeInfo.pathToFile).exists();
                if ((!zExists || !innerThemeView.parseTheme() || !zExists) && (tL_theme = (themeInfo = innerThemeView.themeInfo).info) != null) {
                    if (tL_theme.document != null) {
                        themeInfo.themeLoaded = false;
                        innerThemeView.placeholderAlpha = 1.0f;
                        Drawable drawableMutate = innerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                        innerThemeView.loadingDrawable = drawableMutate;
                        int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText7, false);
                        innerThemeView.loadingColor = color;
                        Theme.setDrawableColor(color, drawableMutate);
                        if (!zExists) {
                            String attachFileName = FileLoader.getAttachFileName(innerThemeView.themeInfo.info.document);
                            ThemesHorizontalListCell themesHorizontalListCell2 = ThemesHorizontalListCell.this;
                            if (!themesHorizontalListCell2.loadingThemes.containsKey(attachFileName)) {
                                themesHorizontalListCell2.loadingThemes.put(attachFileName, innerThemeView.themeInfo);
                                FileLoader fileLoader = FileLoader.getInstance(innerThemeView.themeInfo.account);
                                TLRPC.TL_theme tL_theme2 = innerThemeView.themeInfo.info;
                                fileLoader.loadFile(tL_theme2.document, tL_theme2, 1, 1);
                            }
                        }
                    } else {
                        Drawable drawableMutate2 = innerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                        innerThemeView.loadingDrawable = drawableMutate2;
                        int color2 = Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText7, false);
                        innerThemeView.loadingColor = color2;
                        Theme.setDrawableColor(color2, drawableMutate2);
                    }
                }
            }
            innerThemeView.applyTheme();
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(ThemesHorizontalListCell.this.new InnerThemeView(this.mContext));
        }
    }

    public ThemesHorizontalListCell(Context context, BaseFragment baseFragment, int i, ArrayList arrayList, ArrayList arrayList2) {
        super(context);
        this.loadingThemes = new HashMap<>();
        this.loadingWallpapers = new HashMap<>();
        this.customThemes = arrayList2;
        this.defaultThemes = arrayList;
        this.currentType = i;
        this.fragment = baseFragment;
        boolean z = false;
        if (i == 2) {
            setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackground, false));
        } else {
            setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        }
        lambda$onCellEnter$52(null);
        setLayoutAnimation(null);
        this.horizontalLayoutManager = new DialogsSearchAdapter.AnonymousClass5(1, 1, z);
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        this.horizontalLayoutManager.setOrientation(0);
        setLayoutManager(this.horizontalLayoutManager);
        ThemesListAdapter themesListAdapter = new ThemesListAdapter(context);
        this.adapter = themesListAdapter;
        setAdapter(themesListAdapter);
        setOnItemClickListener(new TONIntroActivity$$ExternalSyntheticLambda3(this, 4));
        setOnItemLongClickListener(new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 23));
    }

    public final void lambda$didReceivedNotification$2(Theme.ThemeInfo themeInfo) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof InnerThemeView) {
                InnerThemeView innerThemeView = (InnerThemeView) childAt;
                if (innerThemeView.themeInfo == themeInfo && innerThemeView.parseTheme()) {
                    innerThemeView.themeInfo.themeLoaded = true;
                    innerThemeView.applyTheme();
                }
            }
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.fileLoaded) {
            if (i == NotificationCenter.fileLoadFailed) {
                this.loadingThemes.remove((String) objArr[0]);
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        File file = (File) objArr[1];
        Theme.ThemeInfo themeInfo = this.loadingThemes.get(str);
        if (themeInfo != null) {
            this.loadingThemes.remove(str);
            if (this.loadingWallpapers.remove(themeInfo) != null) {
                Utilities.globalQueue.postRunnable(new StarGiftSheet$$ExternalSyntheticLambda66(this, themeInfo, file, 3));
            } else {
                lambda$didReceivedNotification$2(themeInfo);
            }
        }
    }

    public final void lambda$didReceivedNotification$3(Theme.ThemeInfo themeInfo, File file) {
        themeInfo.badWallpaper = !themeInfo.createBackground(file, themeInfo.pathToWallpaper);
        AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda8(19, this, themeInfo));
    }

    public final void lambda$new$0(View view, int i) {
        selectTheme(((InnerThemeView) view).themeInfo);
        int left = view.getLeft();
        int right = view.getRight();
        if (left < 0) {
            smoothScrollBy(left - AndroidUtilities.dp(8.0f), 0);
        } else if (right > getMeasuredWidth()) {
            smoothScrollBy(right - getMeasuredWidth(), 0);
        }
    }

    public final boolean lambda$new$1(View view, int i) {
        showOptionsForTheme(((InnerThemeView) view).themeInfo);
        return true;
    }

    public void notifyDataSetChanged(int i) {
        Theme.ThemeInfo themeInfo;
        if (this.prevCount == this.adapter.getItemCount()) {
            return;
        }
        this.adapter.notifyDataSetChanged();
        if (this.currentType == 1) {
            themeInfo = Theme.currentNightTheme;
        } else {
            themeInfo = Theme.currentDayTheme;
            if (themeInfo == null) {
                themeInfo = Theme.defaultTheme;
            }
        }
        if (this.prevThemeInfo != themeInfo) {
            scrollToCurrentTheme(i, false);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.drawDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void scrollToCurrentTheme(int i, boolean z) {
        Theme.ThemeInfo themeInfo;
        View view;
        if (i == 0 && (view = (View) getParent()) != null) {
            i = view.getMeasuredWidth();
        }
        if (i == 0) {
            return;
        }
        if (this.currentType == 1) {
            themeInfo = Theme.currentNightTheme;
        } else {
            themeInfo = Theme.currentDayTheme;
            if (themeInfo == null) {
                themeInfo = Theme.defaultTheme;
            }
        }
        this.prevThemeInfo = themeInfo;
        int iIndexOf = this.defaultThemes.indexOf(themeInfo);
        if (iIndexOf >= 0 || (iIndexOf = this.customThemes.indexOf(this.prevThemeInfo) + this.defaultThemes.size()) >= 0) {
            if (z) {
                smoothScrollToPosition(iIndexOf);
            } else {
                this.horizontalLayoutManager.scrollToPositionWithOffset(iIndexOf, (i - AndroidUtilities.dp(76.0f)) / 2);
            }
        }
    }

    public void selectTheme(Theme.ThemeInfo themeInfo) {
        Theme.ThemeInfo themeInfo2;
        TLRPC.TL_theme tL_theme = themeInfo.info;
        if (tL_theme != null) {
            if (!themeInfo.themeLoaded) {
                return;
            }
            if (tL_theme.document == null) {
                BaseFragment baseFragment = this.fragment;
                if (baseFragment != null) {
                    baseFragment.presentFragment(new ThemeSetUrlActivity(themeInfo, null, true));
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(themeInfo.assetName)) {
            Theme.PatternsLoader.createLoader(false);
        }
        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        editorEdit.putString((this.currentType == 1 || themeInfo.isDark()) ? "lastDarkTheme" : "lastDayTheme", themeInfo.getKey());
        editorEdit.commit();
        if (this.currentType != 1) {
            Theme.ThemeInfo themeInfo3 = Theme.currentDayTheme;
            if (themeInfo3 == null) {
                themeInfo3 = Theme.defaultTheme;
            }
            if (themeInfo == themeInfo3) {
                return;
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, null, -1);
            }
        } else {
            if (themeInfo == Theme.currentNightTheme) {
                return;
            }
            boolean z = Theme.currentTheme == Theme.currentNightTheme;
            Theme.currentNightTheme = themeInfo;
            if (z) {
                Theme.applyDayNightThemeMaybe(true);
            }
        }
        updateRows();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof InnerThemeView) {
                InnerThemeView innerThemeView = (InnerThemeView) childAt;
                if (ThemesHorizontalListCell.this.currentType == 1) {
                    themeInfo2 = Theme.currentNightTheme;
                } else {
                    themeInfo2 = Theme.currentDayTheme;
                    if (themeInfo2 == null) {
                        themeInfo2 = Theme.defaultTheme;
                    }
                }
                innerThemeView.button.setChecked(innerThemeView.themeInfo == themeInfo2, true);
            }
        }
        EmojiThemes.saveCustomTheme(themeInfo, themeInfo.currentAccentId);
        if (this.currentType != 1) {
            Theme.turnOffAutoNight(this.fragment);
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        invalidateViews();
    }

    public void setDrawDivider(boolean z) {
        this.drawDivider = z;
    }

    public void showOptionsForTheme(Theme.ThemeInfo themeInfo) {
    }

    public abstract void updateRows();
}
