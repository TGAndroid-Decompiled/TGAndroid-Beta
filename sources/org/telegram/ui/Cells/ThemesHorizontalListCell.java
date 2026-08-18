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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeColors;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.ThemeSetUrlActivity;

public abstract class ThemesHorizontalListCell extends RecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    public static byte[] bytes = new byte[1024];
    private ThemesListAdapter adapter;
    private int currentType;
    private ArrayList customThemes;
    private ArrayList defaultThemes;
    private boolean drawDivider;
    private BaseFragment fragment;
    private LinearLayoutManager horizontalLayoutManager;
    private HashMap loadingThemes;
    private HashMap loadingWallpapers;
    private int prevCount;
    private Theme.ThemeInfo prevThemeInfo;

    protected void showOptionsForTheme(Theme.ThemeInfo themeInfo) {
    }

    protected abstract void updateRows();

    private class ThemesListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        ThemesListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(ThemesHorizontalListCell.this.new InnerThemeView(this.mContext));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ArrayList arrayList;
            int size;
            InnerThemeView innerThemeView = (InnerThemeView) viewHolder.itemView;
            if (i < ThemesHorizontalListCell.this.defaultThemes.size()) {
                arrayList = ThemesHorizontalListCell.this.defaultThemes;
                size = i;
            } else {
                arrayList = ThemesHorizontalListCell.this.customThemes;
                size = i - ThemesHorizontalListCell.this.defaultThemes.size();
            }
            innerThemeView.setTheme((Theme.ThemeInfo) arrayList.get(size), i == getItemCount() - 1, i == 0);
        }

        @Override
        public int getItemCount() {
            ThemesHorizontalListCell themesHorizontalListCell = ThemesHorizontalListCell.this;
            return themesHorizontalListCell.prevCount = themesHorizontalListCell.defaultThemes.size() + ThemesHorizontalListCell.this.customThemes.size();
        }
    }

    class InnerThemeView extends FrameLayout {
        private ObjectAnimator accentAnimator;
        private boolean accentColorChanged;
        private int accentId;
        private float accentState;
        private int backColor;
        private Drawable backgroundDrawable;
        private Paint bitmapPaint;
        private BitmapShader bitmapShader;
        private RadioButton button;
        private int checkColor;
        private final ArgbEvaluator evaluator;
        private boolean hasWhiteBackground;
        private int inColor;
        private Drawable inDrawable;
        private boolean isFirst;
        private boolean isLast;
        private long lastDrawTime;
        private int loadingColor;
        private Drawable loadingDrawable;
        private int oldBackColor;
        private int oldCheckColor;
        private int oldInColor;
        private int oldOutColor;
        private Drawable optionsDrawable;
        private int outColor;
        private Drawable outDrawable;
        private Paint paint;
        private float placeholderAlpha;
        private boolean pressed;
        private RectF rect;
        private Matrix shaderMatrix;
        private TextPaint textPaint;
        private Theme.ThemeInfo themeInfo;

        public InnerThemeView(Context context) {
            super(context);
            this.rect = new RectF();
            this.paint = new Paint(1);
            this.textPaint = new TextPaint(1);
            this.evaluator = new ArgbEvaluator();
            this.bitmapPaint = new Paint(3);
            this.shaderMatrix = new Matrix();
            setWillNotDraw(false);
            this.inDrawable = context.getResources().getDrawable(R.drawable.minibubble_in).mutate();
            this.outDrawable = context.getResources().getDrawable(R.drawable.minibubble_out).mutate();
            this.textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            RadioButton radioButton = new RadioButton(context);
            this.button = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            addView(this.button, LayoutHelper.createFrame(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.isLast ? 22 : 15) + 76 + (this.isFirst ? 22 : 0)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(148.0f), 1073741824));
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            Theme.ThemeInfo themeInfo;
            if (this.optionsDrawable == null || (themeInfo = this.themeInfo) == null || ((themeInfo.info != null && !themeInfo.themeLoaded) || ThemesHorizontalListCell.this.currentType != 0)) {
                return super.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0 || action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (x > this.rect.centerX() && y < this.rect.centerY() - AndroidUtilities.dp(10.0f)) {
                    if (action == 0) {
                        this.pressed = true;
                    } else {
                        try {
                            performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        ThemesHorizontalListCell.this.showOptionsForTheme(this.themeInfo);
                    }
                }
                if (action == 1) {
                    this.pressed = false;
                }
            }
            return this.pressed;
        }

        public boolean parseTheme() {
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
                                if (str.startsWith("WLS=")) {
                                    String strSubstring = str.substring(4);
                                    Uri uri = Uri.parse(strSubstring);
                                    this.themeInfo.slug = uri.getQueryParameter("slug");
                                    this.themeInfo.pathToWallpaper = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strSubstring) + ".wp").getAbsolutePath();
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
                                        } catch (Exception unused) {
                                        }
                                        try {
                                            String queryParameter3 = uri.getQueryParameter("rotation");
                                            if (!TextUtils.isEmpty(queryParameter3)) {
                                                this.themeInfo.patternBgGradientRotation = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                            }
                                        } catch (Exception unused2) {
                                        }
                                        String queryParameter4 = uri.getQueryParameter("intensity");
                                        if (!TextUtils.isEmpty(queryParameter4)) {
                                            this.themeInfo.patternIntensity = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                        }
                                        Theme.ThemeInfo themeInfo3 = this.themeInfo;
                                        if (themeInfo3.patternIntensity == 0) {
                                            themeInfo3.patternIntensity = 50;
                                        }
                                    }
                                } else {
                                    if (str.startsWith("WPS")) {
                                        this.themeInfo.previewWallpaperOffset = i7 + i3;
                                        z = true;
                                        break;
                                    }
                                    int iIndexOf = str.indexOf(61);
                                    if (iIndexOf != -1 && ((iStringKeyToInt = ThemeColors.stringKeyToInt(str.substring(0, iIndexOf))) == Theme.key_chat_inBubble || iStringKeyToInt == Theme.key_chat_outBubble || iStringKeyToInt == Theme.key_chat_wallpaper || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to1 || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to2 || iStringKeyToInt == Theme.key_chat_wallpaper_gradient_to3)) {
                                        String strSubstring2 = str.substring(iIndexOf + 1);
                                        if (strSubstring2.length() > 0 && strSubstring2.charAt(0) == '#') {
                                            try {
                                                iIntValue = Color.parseColor(strSubstring2);
                                            } catch (Exception unused3) {
                                                iIntValue = Utilities.parseInt((CharSequence) strSubstring2).intValue();
                                            }
                                        } else {
                                            iIntValue = Utilities.parseInt((CharSequence) strSubstring2).intValue();
                                        }
                                        if (iStringKeyToInt == Theme.key_chat_inBubble) {
                                            this.themeInfo.setPreviewInColor(iIntValue);
                                        } else if (iStringKeyToInt == Theme.key_chat_outBubble) {
                                            this.themeInfo.setPreviewOutColor(iIntValue);
                                        } else if (iStringKeyToInt == Theme.key_chat_wallpaper) {
                                            this.themeInfo.setPreviewBackgroundColor(iIntValue);
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
                                    if (themeInfo.pathToWallpaper == null && !themeInfo.badWallpaper && !new File(this.themeInfo.pathToWallpaper).exists()) {
                                        if (ThemesHorizontalListCell.this.loadingWallpapers.containsKey(this.themeInfo)) {
                                            return false;
                                        }
                                        HashMap map = ThemesHorizontalListCell.this.loadingWallpapers;
                                        Theme.ThemeInfo themeInfo4 = this.themeInfo;
                                        map.put(themeInfo4, themeInfo4.slug);
                                        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                        Theme.ThemeInfo themeInfo5 = this.themeInfo;
                                        tL_inputWallPaperSlug.slug = themeInfo5.slug;
                                        getwallpaper.wallpaper = tL_inputWallPaperSlug;
                                        ConnectionsManager.getInstance(themeInfo5.account).sendRequest(getwallpaper, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                this.f$0.lambda$parseTheme$1(tLObject, tL_error);
                                            }
                                        });
                                        return false;
                                    }
                                    this.themeInfo.previewParsed = true;
                                    return true;
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
            if (themeInfo.pathToWallpaper == null) {
            }
            this.themeInfo.previewParsed = true;
            return true;
        }

        public void lambda$parseTheme$1(final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$parseTheme$0(tLObject);
                }
            });
        }

        public void lambda$parseTheme$0(TLObject tLObject) {
            if (tLObject instanceof TLRPC.TL_wallPaper) {
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (ThemesHorizontalListCell.this.loadingThemes.containsKey(attachFileName)) {
                    return;
                }
                ThemesHorizontalListCell.this.loadingThemes.put(attachFileName, this.themeInfo);
                FileLoader.getInstance(this.themeInfo.account).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            }
            this.themeInfo.badWallpaper = true;
        }

        public void applyTheme() {
            Drawable drawable = this.inDrawable;
            int previewInColor = this.themeInfo.getPreviewInColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(previewInColor, mode));
            this.outDrawable.setColorFilter(new PorterDuffColorFilter(this.themeInfo.getPreviewOutColor(), mode));
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
            Theme.ThemeInfo themeInfo = this.themeInfo;
            int i = themeInfo.previewBackgroundGradientColor1;
            if (i != 0 && themeInfo.previewBackgroundGradientColor2 != 0) {
                int previewBackgroundColor2 = this.themeInfo.getPreviewBackgroundColor();
                Theme.ThemeInfo themeInfo2 = this.themeInfo;
                MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable(previewBackgroundColor2, themeInfo2.previewBackgroundGradientColor1, themeInfo2.previewBackgroundGradientColor2, themeInfo2.previewBackgroundGradientColor3, true);
                motionBackgroundDrawable.setRoundRadius(AndroidUtilities.dp(6.0f));
                this.backgroundDrawable = motionBackgroundDrawable;
                dArrRgbToHsv = AndroidUtilities.rgbToHsv(Color.red(this.themeInfo.getPreviewBackgroundColor()), Color.green(this.themeInfo.getPreviewBackgroundColor()), Color.blue(this.themeInfo.getPreviewBackgroundColor()));
            } else if (i != 0) {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.themeInfo.getPreviewBackgroundColor(), this.themeInfo.previewBackgroundGradientColor1});
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(6.0f));
                this.backgroundDrawable = gradientDrawable;
                dArrRgbToHsv = AndroidUtilities.rgbToHsv(Color.red(this.themeInfo.getPreviewBackgroundColor()), Color.green(this.themeInfo.getPreviewBackgroundColor()), Color.blue(this.themeInfo.getPreviewBackgroundColor()));
            } else if (themeInfo.previewWallpaperOffset > 0 || themeInfo.pathToWallpaper != null) {
                float fDp = AndroidUtilities.dp(76.0f);
                float fDp2 = AndroidUtilities.dp(97.0f);
                Theme.ThemeInfo themeInfo3 = this.themeInfo;
                Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(fDp, fDp2, themeInfo3.pathToWallpaper, themeInfo3.pathToFile, themeInfo3.previewWallpaperOffset);
                if (scaledBitmap != null) {
                    this.backgroundDrawable = new BitmapDrawable(scaledBitmap);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(scaledBitmap, tileMode, tileMode);
                    this.bitmapShader = bitmapShader;
                    this.bitmapPaint.setShader(bitmapShader);
                    int[] iArrCalcDrawableColor = AndroidUtilities.calcDrawableColor(this.backgroundDrawable);
                    dArrRgbToHsv = AndroidUtilities.rgbToHsv(Color.red(iArrCalcDrawableColor[0]), Color.green(iArrCalcDrawableColor[0]), Color.blue(iArrCalcDrawableColor[0]));
                }
            } else if (themeInfo.getPreviewBackgroundColor() != 0) {
                dArrRgbToHsv = AndroidUtilities.rgbToHsv(Color.red(this.themeInfo.getPreviewBackgroundColor()), Color.green(this.themeInfo.getPreviewBackgroundColor()), Color.blue(this.themeInfo.getPreviewBackgroundColor()));
            }
            if (dArrRgbToHsv != null && dArrRgbToHsv[1] <= 0.10000000149011612d && dArrRgbToHsv[2] >= 0.9599999785423279d) {
                this.hasWhiteBackground = true;
            } else {
                this.hasWhiteBackground = false;
            }
            if (this.themeInfo.getPreviewBackgroundColor() == 0 && this.themeInfo.previewParsed && this.backgroundDrawable == null) {
                Drawable drawableCreateDefaultWallpaper = Theme.createDefaultWallpaper(100, 200);
                this.backgroundDrawable = drawableCreateDefaultWallpaper;
                if (drawableCreateDefaultWallpaper instanceof MotionBackgroundDrawable) {
                    ((MotionBackgroundDrawable) drawableCreateDefaultWallpaper).setRoundRadius(AndroidUtilities.dp(6.0f));
                }
            }
            invalidate();
        }

        public void setTheme(Theme.ThemeInfo themeInfo, boolean z, boolean z2) {
            Theme.ThemeInfo themeInfo2;
            TLRPC.TL_theme tL_theme;
            this.themeInfo = themeInfo;
            this.isFirst = z2;
            this.isLast = z;
            this.accentId = themeInfo.currentAccentId;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.button.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(this.isFirst ? 49.0f : 27.0f);
            this.button.setLayoutParams(layoutParams);
            this.placeholderAlpha = 0.0f;
            Theme.ThemeInfo themeInfo3 = this.themeInfo;
            if (themeInfo3.pathToFile != null && !themeInfo3.previewParsed) {
                themeInfo3.setPreviewInColor(Theme.getDefaultColor(Theme.key_chat_inBubble));
                this.themeInfo.setPreviewOutColor(Theme.getDefaultColor(Theme.key_chat_outBubble));
                boolean zExists = new File(this.themeInfo.pathToFile).exists();
                if ((!zExists || !parseTheme() || !zExists) && (tL_theme = (themeInfo2 = this.themeInfo).info) != null) {
                    if (tL_theme.document != null) {
                        themeInfo2.themeLoaded = false;
                        this.placeholderAlpha = 1.0f;
                        Drawable drawableMutate = getResources().getDrawable(R.drawable.msg_theme).mutate();
                        this.loadingDrawable = drawableMutate;
                        int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7);
                        this.loadingColor = color;
                        Theme.setDrawableColor(drawableMutate, color);
                        if (!zExists) {
                            String attachFileName = FileLoader.getAttachFileName(this.themeInfo.info.document);
                            if (!ThemesHorizontalListCell.this.loadingThemes.containsKey(attachFileName)) {
                                ThemesHorizontalListCell.this.loadingThemes.put(attachFileName, this.themeInfo);
                                FileLoader fileLoader = FileLoader.getInstance(this.themeInfo.account);
                                TLRPC.TL_theme tL_theme2 = this.themeInfo.info;
                                fileLoader.loadFile(tL_theme2.document, tL_theme2, 1, 1);
                            }
                        }
                    } else {
                        Drawable drawableMutate2 = getResources().getDrawable(R.drawable.preview_custom).mutate();
                        this.loadingDrawable = drawableMutate2;
                        int color2 = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7);
                        this.loadingColor = color2;
                        Theme.setDrawableColor(drawableMutate2, color2);
                    }
                }
            }
            applyTheme();
        }

        @Override
        protected void onAttachedToWindow() {
            TLRPC.TL_theme tL_theme;
            super.onAttachedToWindow();
            this.button.setChecked(this.themeInfo == (ThemesHorizontalListCell.this.currentType == 1 ? Theme.getCurrentNightTheme() : Theme.getCurrentTheme()), false);
            Theme.ThemeInfo themeInfo = this.themeInfo;
            if (themeInfo == null || (tL_theme = themeInfo.info) == null || themeInfo.themeLoaded) {
                return;
            }
            if (ThemesHorizontalListCell.this.loadingThemes.containsKey(FileLoader.getAttachFileName(tL_theme.document)) || ThemesHorizontalListCell.this.loadingWallpapers.containsKey(this.themeInfo)) {
                return;
            }
            this.themeInfo.themeLoaded = true;
            this.placeholderAlpha = 0.0f;
            parseTheme();
            applyTheme();
        }

        public void updateCurrentThemeCheck() {
            this.button.setChecked(this.themeInfo == (ThemesHorizontalListCell.this.currentType == 1 ? Theme.getCurrentNightTheme() : Theme.getCurrentTheme()), true);
        }

        void updateColors(boolean z) {
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
            this.inColor = Theme.changeColorAccent(themeInfo, i3, themeInfo.getPreviewInColor());
            Theme.ThemeInfo themeInfo2 = this.themeInfo;
            this.outColor = Theme.changeColorAccent(themeInfo2, i2, themeInfo2.getPreviewOutColor());
            Theme.ThemeInfo themeInfo3 = this.themeInfo;
            this.backColor = Theme.changeColorAccent(themeInfo3, i, themeInfo3.getPreviewBackgroundColor());
            this.checkColor = this.outColor;
            this.accentId = this.themeInfo.currentAccentId;
            ObjectAnimator objectAnimator = this.accentAnimator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "accentState", 0.0f, 1.0f);
                this.accentAnimator = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(200L);
                this.accentAnimator.start();
                return;
            }
            setAccentState(1.0f);
        }

        public void setAccentState(float f) {
            this.accentState = f;
            this.accentColorChanged = true;
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.accentId != this.themeInfo.currentAccentId) {
                updateColors(true);
            }
            int iDp = this.isFirst ? AndroidUtilities.dp(22.0f) : 0;
            int iDp2 = AndroidUtilities.dp(11.0f);
            float f = iDp;
            float f2 = iDp2;
            this.rect.set(f, f2, AndroidUtilities.dp(76.0f) + iDp, iDp2 + AndroidUtilities.dp(97.0f));
            String string = TextUtils.ellipsize(getThemeName(), this.textPaint, (getMeasuredWidth() - AndroidUtilities.dp(this.isFirst ? 10.0f : 15.0f)) - (this.isLast ? AndroidUtilities.dp(7.0f) : 0), TextUtils.TruncateAt.END).toString();
            int iCeil = (int) Math.ceil(this.textPaint.measureText(string));
            this.textPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            canvas.drawText(string, ((AndroidUtilities.dp(76.0f) - iCeil) / 2) + iDp, AndroidUtilities.dp(131.0f), this.textPaint);
            Theme.ThemeInfo themeInfo = this.themeInfo;
            TLRPC.TL_theme tL_theme = themeInfo.info;
            if (tL_theme == null || (tL_theme.document != null && themeInfo.themeLoaded)) {
                this.paint.setColor(blend(this.oldBackColor, this.backColor));
                if (this.accentColorChanged) {
                    Drawable drawable = this.inDrawable;
                    int iBlend = blend(this.oldInColor, this.inColor);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(new PorterDuffColorFilter(iBlend, mode));
                    this.outDrawable.setColorFilter(new PorterDuffColorFilter(blend(this.oldOutColor, this.outColor), mode));
                    this.accentColorChanged = false;
                }
                Drawable drawable2 = this.backgroundDrawable;
                if (drawable2 != null) {
                    if (this.bitmapShader != null) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable2;
                        float width = bitmapDrawable.getBitmap().getWidth();
                        float height = bitmapDrawable.getBitmap().getHeight();
                        float fWidth = width / this.rect.width();
                        float fHeight = height / this.rect.height();
                        this.shaderMatrix.reset();
                        float fMin = 1.0f / Math.min(fWidth, fHeight);
                        float f3 = width / fHeight;
                        if (f3 > this.rect.width()) {
                            this.shaderMatrix.setTranslate(f - ((f3 - this.rect.width()) / 2.0f), f2);
                        } else {
                            this.shaderMatrix.setTranslate(f, f2 - (((height / fWidth) - this.rect.height()) / 2.0f));
                        }
                        this.shaderMatrix.preScale(fMin, fMin);
                        this.bitmapShader.setLocalMatrix(this.shaderMatrix);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.bitmapPaint);
                    } else {
                        RectF rectF = this.rect;
                        drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        this.backgroundDrawable.draw(canvas);
                    }
                } else {
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.paint);
                }
                this.button.setColor(1728053247, -1);
                Theme.ThemeInfo themeInfo2 = this.themeInfo;
                if (themeInfo2.accentBaseColor != 0) {
                    if ("Day".equals(themeInfo2.name) || "Arctic Blue".equals(this.themeInfo.name)) {
                        this.button.setColor(-5000269, blend(this.oldCheckColor, this.checkColor));
                        Theme.chat_instantViewRectPaint.setColor(733001146);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Theme.chat_instantViewRectPaint);
                    }
                } else if (this.hasWhiteBackground) {
                    this.button.setColor(-5000269, themeInfo2.getPreviewOutColor());
                    Theme.chat_instantViewRectPaint.setColor(733001146);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Theme.chat_instantViewRectPaint);
                }
                this.inDrawable.setBounds(AndroidUtilities.dp(6.0f) + iDp, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(49.0f) + iDp, AndroidUtilities.dp(36.0f));
                this.inDrawable.draw(canvas);
                this.outDrawable.setBounds(AndroidUtilities.dp(27.0f) + iDp, AndroidUtilities.dp(41.0f), iDp + AndroidUtilities.dp(70.0f), AndroidUtilities.dp(55.0f));
                this.outDrawable.draw(canvas);
                if (this.optionsDrawable != null && ThemesHorizontalListCell.this.currentType == 0) {
                    int iDp3 = ((int) this.rect.right) - AndroidUtilities.dp(16.0f);
                    int iDp4 = ((int) this.rect.top) + AndroidUtilities.dp(6.0f);
                    Drawable drawable3 = this.optionsDrawable;
                    drawable3.setBounds(iDp3, iDp4, drawable3.getIntrinsicWidth() + iDp3, this.optionsDrawable.getIntrinsicHeight() + iDp4);
                    this.optionsDrawable.draw(canvas);
                }
            }
            Theme.ThemeInfo themeInfo3 = this.themeInfo;
            TLRPC.TL_theme tL_theme2 = themeInfo3.info;
            if (tL_theme2 != null && tL_theme2.document == null) {
                this.button.setAlpha(0.0f);
                Theme.chat_instantViewRectPaint.setColor(733001146);
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Theme.chat_instantViewRectPaint);
                if (this.loadingDrawable != null) {
                    int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7);
                    if (this.loadingColor != color) {
                        Drawable drawable4 = this.loadingDrawable;
                        this.loadingColor = color;
                        Theme.setDrawableColor(drawable4, color);
                    }
                    int iCenterX = (int) (this.rect.centerX() - (this.loadingDrawable.getIntrinsicWidth() / 2));
                    int iCenterY = (int) (this.rect.centerY() - (this.loadingDrawable.getIntrinsicHeight() / 2));
                    Drawable drawable5 = this.loadingDrawable;
                    drawable5.setBounds(iCenterX, iCenterY, drawable5.getIntrinsicWidth() + iCenterX, this.loadingDrawable.getIntrinsicHeight() + iCenterY);
                    this.loadingDrawable.draw(canvas);
                    return;
                }
                return;
            }
            if ((tL_theme2 == null || themeInfo3.themeLoaded) && this.placeholderAlpha <= 0.0f) {
                if (this.button.getAlpha() != 1.0f) {
                    this.button.setAlpha(1.0f);
                    return;
                }
                return;
            }
            this.button.setAlpha(1.0f - this.placeholderAlpha);
            this.paint.setColor(Theme.getColor(Theme.key_windowBackgroundGray));
            this.paint.setAlpha((int) (this.placeholderAlpha * 255.0f));
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.paint);
            if (this.loadingDrawable != null) {
                int color2 = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7);
                if (this.loadingColor != color2) {
                    Drawable drawable6 = this.loadingDrawable;
                    this.loadingColor = color2;
                    Theme.setDrawableColor(drawable6, color2);
                }
                int iCenterX2 = (int) (this.rect.centerX() - (this.loadingDrawable.getIntrinsicWidth() / 2));
                int iCenterY2 = (int) (this.rect.centerY() - (this.loadingDrawable.getIntrinsicHeight() / 2));
                this.loadingDrawable.setAlpha((int) (this.placeholderAlpha * 255.0f));
                Drawable drawable7 = this.loadingDrawable;
                drawable7.setBounds(iCenterX2, iCenterY2, drawable7.getIntrinsicWidth() + iCenterX2, this.loadingDrawable.getIntrinsicHeight() + iCenterY2);
                this.loadingDrawable.draw(canvas);
            }
            if (this.themeInfo.themeLoaded) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long jMin = Math.min(17L, jElapsedRealtime - this.lastDrawTime);
                this.lastDrawTime = jElapsedRealtime;
                float f4 = this.placeholderAlpha - (jMin / 180.0f);
                this.placeholderAlpha = f4;
                if (f4 < 0.0f) {
                    this.placeholderAlpha = 0.0f;
                }
                invalidate();
            }
        }

        private String getThemeName() {
            String name = this.themeInfo.getName();
            return name.toLowerCase().endsWith(".attheme") ? name.substring(0, name.lastIndexOf(46)) : name;
        }

        private int blend(int i, int i2) {
            float f = this.accentState;
            return f == 1.0f ? i2 : ((Integer) this.evaluator.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(getThemeName());
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.button.isChecked());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrMoreOptions)));
        }
    }

    public ThemesHorizontalListCell(Context context, BaseFragment baseFragment, int i, ArrayList arrayList, ArrayList arrayList2) {
        super(context);
        this.loadingThemes = new HashMap();
        this.loadingWallpapers = new HashMap();
        this.customThemes = arrayList2;
        this.defaultThemes = arrayList;
        this.currentType = i;
        this.fragment = baseFragment;
        if (i == 2) {
            setBackgroundColor(Theme.getColor(Theme.key_dialogBackground));
        } else {
            setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        this.horizontalLayoutManager = new LinearLayoutManager(context) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        this.horizontalLayoutManager.setOrientation(0);
        setLayoutManager(this.horizontalLayoutManager);
        ThemesListAdapter themesListAdapter = new ThemesListAdapter(context);
        this.adapter = themesListAdapter;
        setAdapter(themesListAdapter);
        setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                this.f$0.lambda$new$0(view, i2);
            }
        });
        setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i2) {
                return this.f$0.lambda$new$1(view, i2);
            }
        });
    }

    public void lambda$new$0(View view, int i) {
        selectTheme(((InnerThemeView) view).themeInfo);
        int left = view.getLeft();
        int right = view.getRight();
        if (left < 0) {
            smoothScrollBy(left - AndroidUtilities.dp(8.0f), 0);
        } else if (right > getMeasuredWidth()) {
            smoothScrollBy(right - getMeasuredWidth(), 0);
        }
    }

    public boolean lambda$new$1(View view, int i) {
        showOptionsForTheme(((InnerThemeView) view).themeInfo);
        return true;
    }

    public void selectTheme(Theme.ThemeInfo themeInfo) {
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
        if (this.currentType == 1) {
            if (themeInfo == Theme.getCurrentNightTheme()) {
                return;
            } else {
                Theme.setCurrentNightTheme(themeInfo);
            }
        } else if (themeInfo == Theme.getCurrentTheme()) {
            return;
        } else {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, null, -1);
        }
        updateRows();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof InnerThemeView) {
                ((InnerThemeView) childAt).updateCurrentThemeCheck();
            }
        }
        EmojiThemes.saveCustomTheme(themeInfo, themeInfo.currentAccentId);
        if (this.currentType != 1) {
            Theme.turnOffAutoNight(this.fragment);
        }
    }

    public void setDrawDivider(boolean z) {
        this.drawDivider = z;
    }

    public void notifyDataSetChanged(int i) {
        if (this.prevCount == this.adapter.getItemCount()) {
            return;
        }
        this.adapter.notifyDataSetChanged();
        if (this.prevThemeInfo != (this.currentType == 1 ? Theme.getCurrentNightTheme() : Theme.getCurrentTheme())) {
            scrollToCurrentTheme(i, false);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.drawDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        invalidateViews();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            final File file = (File) objArr[1];
            final Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) this.loadingThemes.get(str);
            if (themeInfo != null) {
                this.loadingThemes.remove(str);
                if (this.loadingWallpapers.remove(themeInfo) != null) {
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$didReceivedNotification$3(themeInfo, file);
                        }
                    });
                    return;
                } else {
                    lambda$didReceivedNotification$2(themeInfo);
                    return;
                }
            }
            return;
        }
        if (i == NotificationCenter.fileLoadFailed) {
            this.loadingThemes.remove((String) objArr[0]);
        }
    }

    public void lambda$didReceivedNotification$3(final Theme.ThemeInfo themeInfo, File file) {
        themeInfo.badWallpaper = !themeInfo.createBackground(file, themeInfo.pathToWallpaper);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didReceivedNotification$2(themeInfo);
            }
        });
    }

    public void lambda$didReceivedNotification$2(Theme.ThemeInfo themeInfo) {
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

    public void scrollToCurrentTheme(int i, boolean z) {
        View view;
        if (i == 0 && (view = (View) getParent()) != null) {
            i = view.getMeasuredWidth();
        }
        if (i == 0) {
            return;
        }
        Theme.ThemeInfo currentNightTheme = this.currentType == 1 ? Theme.getCurrentNightTheme() : Theme.getCurrentTheme();
        this.prevThemeInfo = currentNightTheme;
        int iIndexOf = this.defaultThemes.indexOf(currentNightTheme);
        if (iIndexOf >= 0 || (iIndexOf = this.customThemes.indexOf(this.prevThemeInfo) + this.defaultThemes.size()) >= 0) {
            if (z) {
                smoothScrollToPosition(iIndexOf);
            } else {
                this.horizontalLayoutManager.scrollToPositionWithOffset(iIndexOf, (i - AndroidUtilities.dp(76.0f)) / 2);
            }
        }
    }
}
