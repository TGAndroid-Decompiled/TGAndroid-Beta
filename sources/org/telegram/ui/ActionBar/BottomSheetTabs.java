package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.common.base.Splitter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkEditActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda104;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda94;
import org.telegram.ui.bots.BotSensors;
import org.telegram.ui.bots.WebViewRequestProps;
import org.telegram.ui.web.BotWebViewContainer;

public final class BottomSheetTabs extends FrameLayout {
    public static TextPaint textPaint;
    public final TabsAccessibilityHelper accessibilityHelper;
    public final ActionBarLayout actionBarLayout;
    public int backgroundColor;
    public final AnimatedColor backgroundColorAnimated;
    public final Paint backgroundPaint;
    public ValueAnimator bottomTabsAnimator;
    public int bottomTabsHeight;
    public float bottomTabsProgress;
    public boolean closeRippleHit;
    public int currentAccount;
    public boolean doNotDismiss;
    public boolean drawTabs;
    public boolean hit;
    public final HashSet invalidateListeners;
    public final RectF rect;
    public final HashSet relayoutListeners;
    public int tabColor;
    public final AnimatedColor tabColorAnimated;
    public final AnimatedFloat tabDarkAnimated;
    public boolean tabIsDark;
    public static final HashMap tabs = new HashMap();
    public static final HashMap tabDrawables = new HashMap();

    public final class TabDrawable {
        public final AnimatedFloat animatedAlpha;
        public final AnimatedFloat animatedPosition;
        public int backgroundColor;
        public boolean backgroundIsDark;
        public final Path closePath;
        public final BaseCell.RippleDrawableSafe closeRipple;
        public int closeRippleColor;
        public final Path expandPath;
        public float expandProgress;
        public final Bitmap favicon;
        public final Paint faviconPaint;
        public final Drawable iconDrawable;
        public int iconDrawableColor;
        public final Paint iconPaint;
        public int index;
        public Text overrideTitle;
        public int position;
        public final float progress;
        public final float[] radii;
        public final Path rectPath;
        public final WebTabData tab;
        public final int tabColor;
        public final boolean tabIsDark;
        public final Text title;
        public final Paint backgroundPaint = new Paint(1);
        public final Paint progressPaint = new Paint(1);

        public TabDrawable(View view, WebTabData webTabData) {
            TL_iv.Page page;
            Paint paint = new Paint(1);
            this.iconPaint = paint;
            this.faviconPaint = new Paint(3);
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable = Theme.createSelectorDrawable(822083583, 1, -1);
            this.closeRipple = rippleDrawableSafeCreateSelectorDrawable;
            this.iconDrawableColor = -1;
            this.radii = new float[8];
            this.rectPath = new Path();
            Path path = new Path();
            this.closePath = path;
            Path path2 = new Path();
            this.expandPath = path2;
            this.tab = webTabData;
            rippleDrawableSafeCreateSelectorDrawable.setCallback(view);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.animatedPosition = new AnimatedFloat(320L, view, cubicBezierInterpolator);
            this.animatedAlpha = new AnimatedFloat(320L, view, cubicBezierInterpolator);
            this.favicon = webTabData.favicon;
            this.title = new Text(Emoji.replaceEmoji(webTabData.getTitle(), BottomSheetTabs.getTextPaint().getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
            int i = webTabData.actionBarColor;
            this.tabColor = i;
            this.tabIsDark = AndroidUtilities.computePerceivedBrightness(i) < 0.721f;
            ArticleViewer articleViewer = webTabData.articleViewer;
            if (articleViewer != null) {
                ArrayList arrayList = articleViewer.pagesStack;
                if (!arrayList.isEmpty()) {
                    Object objM = SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
                    if ((objM instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) objM).cached_page) == null || page.local == null)) {
                        this.iconDrawable = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                    }
                }
            }
            this.progress = webTabData.articleProgress;
            path.rewind();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            path.moveTo(AndroidUtilities.dp(12.0f), 0.0f);
            path.lineTo(0.0f, AndroidUtilities.dp(12.0f));
            path2.rewind();
            path2.moveTo(0.0f, AndroidUtilities.dp(6.33f) / 2.0f);
            path2.lineTo(AndroidUtilities.dp(12.66f) / 2.0f, (-AndroidUtilities.dp(6.33f)) / 2.0f);
            path2.lineTo(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(6.33f) / 2.0f);
        }

        public final void draw(Canvas canvas, RectF rectF, float f, float f2, float f3) {
            Canvas canvas2 = canvas;
            int iBlendARGB = ColorUtils.blendARGB(this.expandProgress, this.backgroundColor, this.tabColor);
            Paint paint = this.backgroundPaint;
            paint.setColor(iBlendARGB);
            float f4 = f2 * 255.0f;
            paint.setAlpha((int) f4);
            paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(f2, 268435456));
            float[] fArr = this.radii;
            fArr[3] = f;
            fArr[2] = f;
            fArr[1] = f;
            int iDp = 0;
            fArr[0] = f;
            float fLerp = AndroidUtilities.lerp(f, 0.0f, this.expandProgress);
            fArr[7] = fLerp;
            fArr[6] = fLerp;
            fArr[5] = fLerp;
            fArr[4] = fLerp;
            Path path = this.rectPath;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, paint);
            float f5 = this.progress;
            if (f5 > 0.0f && this.expandProgress > 0.0f && f2 > 0.0f) {
                canvas2.save();
                canvas2.clipPath(path);
                Paint paint2 = this.progressPaint;
                paint2.setColor(Theme.multAlpha(0.07f * f2 * this.expandProgress, AndroidUtilities.computePerceivedBrightness(iBlendARGB) > 0.721f ? -16777216 : -1));
                float f6 = rectF.left;
                canvas.drawRect(f6, rectF.top, (rectF.width() * f5) + f6, rectF.bottom, paint2);
                canvas2 = canvas;
                canvas2.restore();
            }
            float fLerp2 = AndroidUtilities.lerp(this.backgroundIsDark ? 1.0f : 0.0f, this.tabIsDark ? 1.0f : 0.0f, this.expandProgress);
            int iBlendARGB2 = ColorUtils.blendARGB(fLerp2, -16777216, -1);
            Paint paint3 = this.iconPaint;
            paint3.setColor(iBlendARGB2);
            paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas2.save();
            canvas2.translate(rectF.left, rectF.centerY());
            int iBlendARGB3 = ColorUtils.blendARGB(fLerp2, 553648127, 553648127);
            int iDp2 = AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f));
            int i = -AndroidUtilities.dp(25.0f);
            int iDp3 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(25.0f);
            int iDp4 = AndroidUtilities.dp(25.0f);
            BaseCell.RippleDrawableSafe rippleDrawableSafe = this.closeRipple;
            rippleDrawableSafe.setBounds(iDp2, i, iDp3, iDp4);
            if (this.closeRippleColor != iBlendARGB3) {
                this.closeRippleColor = iBlendARGB3;
                Theme.setSelectorDrawableColor(rippleDrawableSafe, iBlendARGB3, false);
            }
            rippleDrawableSafe.draw(canvas2);
            canvas2.restore();
            canvas2.save();
            canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
            float f7 = f4 * f3;
            int i2 = (int) f7;
            paint3.setAlpha(i2);
            canvas2.drawPath(this.closePath, paint3);
            canvas2.restore();
            canvas2.save();
            canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
            paint3.setAlpha((int) ((1.0f - this.expandProgress) * f7));
            canvas2.drawPath(this.expandPath, paint3);
            canvas2.restore();
            Bitmap bitmap = this.favicon;
            if (bitmap != null) {
                int iDp5 = AndroidUtilities.dp(24.0f);
                canvas2.save();
                Rect rect = AndroidUtilities.rectTmp2;
                float f8 = iDp5;
                float f9 = f8 / 2.0f;
                rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f9), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f8), (int) (rectF.centerY() + f9));
                Paint paint4 = this.faviconPaint;
                paint4.setAlpha(i2);
                canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
                canvas2.restore();
                iDp = AndroidUtilities.dp(4.0f) + iDp5;
            } else {
                Drawable drawable = this.iconDrawable;
                if (drawable != null) {
                    float fDp = AndroidUtilities.dp(24.0f);
                    int intrinsicHeight = (int) ((fDp / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                    Rect rect2 = AndroidUtilities.rectTmp2;
                    float f10 = (fDp / 2.0f) * 0.7f;
                    rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f10), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f10));
                    if (iBlendARGB2 != this.iconDrawableColor) {
                        this.iconDrawableColor = iBlendARGB2;
                        drawable.setColorFilter(new PorterDuffColorFilter(iBlendARGB2, PorterDuff.Mode.SRC_IN));
                    }
                    drawable.setAlpha(i2);
                    drawable.setBounds(rect2);
                    drawable.draw(canvas2);
                    iDp = intrinsicHeight - AndroidUtilities.dp(2.0f);
                }
            }
            Text text = this.overrideTitle;
            if (text != null) {
                float f11 = iDp;
                text.ellipsizeWidth = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f11);
                text.draw(rectF.left + AndroidUtilities.dp(60.0f) + f11, rectF.centerY(), ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, this.expandProgress, f2, f3), iBlendARGB2, canvas2);
            }
            float fWidth = rectF.width() - AndroidUtilities.dp(100.0f);
            float f12 = iDp;
            Text text2 = this.title;
            text2.ellipsizeWidth = (int) (fWidth - f12);
            text2.draw(f12 + rectF.left + AndroidUtilities.dp(60.0f), rectF.centerY(), (this.overrideTitle == null ? 1.0f : this.expandProgress) * f2 * f3, iBlendARGB2, canvas);
        }

        public final float getAlpha() {
            float fMin;
            float position = getPosition();
            if (position < 0.0f) {
                fMin = position + 1.0f;
            } else {
                fMin = (position < 0.0f || position >= 1.0f) ? (1.0f - Math.min(1.0f, position - 1.0f)) * 0.87f : AndroidUtilities.lerp(1.0f, 0.87f, position);
            }
            return this.animatedAlpha.set(this.index >= 0) * fMin;
        }

        public final float getPosition() {
            if (this.index < 0) {
                return this.position;
            }
            return this.animatedPosition.set(this.position, false);
        }
    }

    public final class TabsAccessibilityHelper extends ExploreByTouchHelper {
        public static final int $r8$clinit = 0;
        public final Rect tmpRect;
        public final RectF tmpRectF;

        public TabsAccessibilityHelper(BottomSheetTabs bottomSheetTabs) {
            super(bottomSheetTabs);
            this.tmpRectF = new RectF();
            this.tmpRect = new Rect();
        }

        @Override
        public final int getVirtualViewAt(float f, float f2) {
            TabDrawable tabDrawableFindTabDrawable;
            BottomSheetTabs bottomSheetTabs = BottomSheetTabs.this;
            if (!bottomSheetTabs.drawTabs) {
                return -1;
            }
            ArrayList<WebTabData> tabs = bottomSheetTabs.getTabs();
            if (tabs.isEmpty() || (tabDrawableFindTabDrawable = bottomSheetTabs.findTabDrawable(tabs.get(0))) == null) {
                return -1;
            }
            RectF rectF = this.tmpRectF;
            bottomSheetTabs.getTabBounds(rectF, tabDrawableFindTabDrawable.getPosition());
            Rect bounds = tabDrawableFindTabDrawable.closeRipple.getBounds();
            if (bounds.isEmpty() || !bounds.contains((int) (f - rectF.left), (int) (f2 - rectF.centerY()))) {
                return rectF.contains(f, f2) ? 1 : -1;
            }
            return 2;
        }

        @Override
        public final void getVisibleVirtualViews(ArrayList arrayList) {
            BottomSheetTabs bottomSheetTabs = BottomSheetTabs.this;
            if (bottomSheetTabs.drawTabs) {
                ArrayList<WebTabData> tabs = bottomSheetTabs.getTabs();
                if (tabs.isEmpty() || bottomSheetTabs.findTabDrawable(tabs.get(0)) == null) {
                    return;
                }
                arrayList.add(1);
                arrayList.add(2);
            }
        }

        @Override
        public final boolean onPerformActionForVirtualView(int i, int i2) {
            if (i2 == 16) {
                BottomSheetTabs bottomSheetTabs = BottomSheetTabs.this;
                ArrayList<WebTabData> tabs = bottomSheetTabs.getTabs();
                if (!tabs.isEmpty()) {
                    WebTabData webTabData = tabs.get(0);
                    if (i == 1) {
                        bottomSheetTabs.click();
                        return true;
                    }
                    if (i == 2) {
                        bottomSheetTabs.removeTab(webTabData, new LinkEditActivity$$ExternalSyntheticLambda9(2));
                        return true;
                    }
                }
            }
            return false;
        }

        @Override
        public final void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            String string;
            String string2;
            BottomSheetTabs bottomSheetTabs = BottomSheetTabs.this;
            ArrayList<WebTabData> tabs = bottomSheetTabs.getTabs();
            WebTabData webTabData = tabs.isEmpty() ? null : tabs.get(0);
            TabDrawable tabDrawableFindTabDrawable = webTabData != null ? bottomSheetTabs.findTabDrawable(webTabData) : null;
            accessibilityNodeInfoCompat.setClassName("android.widget.Button");
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            Rect rect = this.tmpRect;
            if (tabDrawableFindTabDrawable == null) {
                rect.set(0, 0, 1, 1);
                accessibilityNodeInfoCompat.setBoundsInParent(rect);
                accessibilityNodeInfoCompat.setContentDescription("");
                accessibilityNodeInfoCompat.setVisibleToUser(false);
                return;
            }
            RectF rectF = this.tmpRectF;
            bottomSheetTabs.getTabBounds(rectF, tabDrawableFindTabDrawable.getPosition());
            String title = webTabData.getTitle() != null ? webTabData.getTitle() : "";
            if (i != 2) {
                rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                accessibilityNodeInfoCompat.setBoundsInParent(rect);
                if (TextUtils.isEmpty(title)) {
                    string = LocaleController.getString(R.string.Open);
                } else {
                    string = LocaleController.getString(R.string.Open) + ", " + title;
                }
                accessibilityNodeInfoCompat.setContentDescription(string);
                return;
            }
            Rect bounds = tabDrawableFindTabDrawable.closeRipple.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            accessibilityNodeInfoCompat.setBoundsInParent(rect);
            if (TextUtils.isEmpty(title)) {
                string2 = LocaleController.getString(R.string.Close);
            } else {
                string2 = LocaleController.getString(R.string.Close) + ", " + title;
            }
            accessibilityNodeInfoCompat.setContentDescription(string2);
        }
    }

    public class WebTabData {
        public int actionBarColor;
        public int actionBarColorKey;
        public float articleProgress;
        public ArticleViewer articleViewer;
        public boolean backButton;
        public int backgroundColor;
        public Splitter buttons;
        public boolean confirmDismiss;
        public boolean error;
        public String errorDescription;
        public boolean expanded;
        public Bitmap favicon;
        public boolean fullscreen;
        public boolean fullscreenBlur;
        public boolean fullsize;
        public String lastUrl;
        public int navigationBarColor;
        public boolean needsContext;
        public boolean orientationLocked;
        public boolean overrideActionBarColor;
        public boolean overrideBackgroundColor;
        public Bitmap previewBitmap;
        public WebViewRequestProps props;
        public Object proxy;
        public boolean ready;
        public BotSensors sensors;
        public boolean settings;
        public boolean themeIsDark;
        public String title;
        public ArticleViewer.PageLayout view2;
        public int viewHeight;
        public int viewScroll;
        public int viewWidth;
        public BotWebViewContainer.MyWebView webView;
        public float expandedOffset = Float.MAX_VALUE;
        public boolean allowSwipes = true;

        public final void destroy() {
            try {
                BotWebViewContainer.MyWebView myWebView = this.webView;
                if (myWebView != null) {
                    myWebView.destroy();
                    this.webView = null;
                }
                ArticleViewer articleViewer = this.articleViewer;
                if (articleViewer != null) {
                    articleViewer.destroy();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public String getTitle() {
            if (this.articleViewer != null) {
                return TextUtils.isEmpty(this.title) ? LocaleController.getString(R.string.WebEmpty) : this.title;
            }
            WebViewRequestProps webViewRequestProps = this.props;
            return webViewRequestProps == null ? "" : UserObject.getUserName(MessagesController.getInstance(webViewRequestProps.currentAccount).getUser(Long.valueOf(this.props.botId)));
        }
    }

    public BottomSheetTabs(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.backgroundPaint = new Paint(1);
        this.drawTabs = true;
        this.doNotDismiss = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.backgroundColorAnimated = new AnimatedColor(this, 200L, cubicBezierInterpolator, 0);
        this.tabColorAnimated = new AnimatedColor(this, 200L, cubicBezierInterpolator, 0);
        this.tabDarkAnimated = new AnimatedFloat(this, 0L, 200L, cubicBezierInterpolator);
        this.currentAccount = UserConfig.selectedAccount;
        this.rect = new RectF();
        this.invalidateListeners = new HashSet();
        this.relayoutListeners = new HashSet();
        this.actionBarLayout = actionBarLayout;
        setNavigationBarColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        TabsAccessibilityHelper tabsAccessibilityHelper = new TabsAccessibilityHelper(this);
        this.accessibilityHelper = tabsAccessibilityHelper;
        ViewCompat.setAccessibilityDelegate(this, tabsAccessibilityHelper);
        updateMultipleTitle();
        updateVisibility(false);
    }

    public static TextPaint getTextPaint() {
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            textPaint = textPaint2;
            textPaint2.setTypeface(AndroidUtilities.bold());
            textPaint.setTextSize(AndroidUtilities.dp(17.0f));
        }
        return textPaint;
    }

    public final void click() {
        ValueAnimator valueAnimator;
        ArrayList<WebTabData> tabs2 = getTabs();
        int size = tabs2.size();
        if (size == 0) {
            return;
        }
        WebTabData webTabData = (WebTabData) SurfaceContainer$$ExternalSyntheticOutline0.m(1, (ArrayList) tabs2);
        LaunchActivity launchActivity = LaunchActivity.instance;
        BottomSheetTabsOverlay bottomSheetTabsOverlay = launchActivity == null ? null : launchActivity.bottomSheetTabsOverlay;
        if (bottomSheetTabsOverlay != null && (valueAnimator = bottomSheetTabsOverlay.animator) != null) {
            valueAnimator.cancel();
            bottomSheetTabsOverlay.animator = null;
        }
        if (size == 1 || bottomSheetTabsOverlay == null) {
            openTab(webTabData);
        } else {
            bottomSheetTabsOverlay.openTabsView();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        getTabs();
        ArrayList<TabDrawable> tabDrawables2 = getTabDrawables();
        if (this.bottomTabsProgress <= 0.0f) {
            return;
        }
        this.backgroundPaint.setColor(this.backgroundColorAnimated.set(this.backgroundColor, false));
        super.dispatchDraw(canvas);
        int i = this.tabColorAnimated.set(this.tabColor, false);
        float f = this.tabDarkAnimated.set(this.tabIsDark);
        if (this.drawTabs) {
            int i2 = 0;
            while (i2 < tabDrawables2.size()) {
                TabDrawable tabDrawable = tabDrawables2.get(i2);
                float position = tabDrawable.getPosition();
                float alpha = tabDrawable.getAlpha();
                if (alpha > 0.0f && position <= 1.99f) {
                    RectF rectF = this.rect;
                    getTabBounds(rectF, position);
                    tabDrawable.expandProgress = 0.0f;
                    boolean z = f > 0.5f;
                    tabDrawable.backgroundColor = i;
                    tabDrawable.backgroundIsDark = z;
                    canvas2 = canvas;
                    tabDrawable.draw(canvas2, rectF, AndroidUtilities.dp(18.0f), alpha, 1.0f);
                } else {
                    canvas2 = canvas;
                }
                i2++;
                canvas = canvas2;
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        TabsAccessibilityHelper tabsAccessibilityHelper;
        if (!this.drawTabs || getTabs().isEmpty() || (tabsAccessibilityHelper = this.accessibilityHelper) == null || !tabsAccessibilityHelper.dispatchHoverEvent(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final TabDrawable findTabDrawable(WebTabData webTabData) {
        ArrayList<TabDrawable> tabDrawables2 = getTabDrawables();
        for (int i = 0; i < tabDrawables2.size(); i++) {
            if (tabDrawables2.get(i).tab == webTabData) {
                return tabDrawables2.get(i);
            }
        }
        return null;
    }

    public Paint getBackgroundPaint() {
        return this.backgroundPaint;
    }

    public int getExpandedHeight() {
        int size = getTabs().size();
        if (size == 0) {
            return 0;
        }
        return size == 1 ? AndroidUtilities.dp(60.0f) : AndroidUtilities.dp(68.0f);
    }

    public final void getTabBounds(RectF rectF, float f) {
        rectF.set(AndroidUtilities.dp(4.0f), (getHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(50.0f), getWidth() - AndroidUtilities.dp(4.0f), getHeight() - AndroidUtilities.dp(4.0f));
        rectF.offset(0.0f, (-AndroidUtilities.dp(8.0f)) * f);
        float fLerp = AndroidUtilities.lerp(1.0f, 0.95f, Math.abs(f));
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float f2 = (fWidth / 2.0f) * fLerp;
        rectF.left = fCenterX - f2;
        rectF.right = fCenterX + f2;
        float f3 = (fHeight / 2.0f) * fLerp;
        rectF.top = fCenterY - f3;
        rectF.bottom = fCenterY + f3;
    }

    public ArrayList<TabDrawable> getTabDrawables() {
        int i = this.currentAccount;
        HashMap map = tabDrawables;
        ArrayList<TabDrawable> arrayList = (ArrayList) map.get(Integer.valueOf(i));
        if (arrayList != null) {
            return arrayList;
        }
        Integer numValueOf = Integer.valueOf(i);
        ArrayList<TabDrawable> arrayList2 = new ArrayList<>();
        map.put(numValueOf, arrayList2);
        return arrayList2;
    }

    public ArrayList<WebTabData> getTabs() {
        int i = this.currentAccount;
        HashMap map = tabs;
        ArrayList<WebTabData> arrayList = (ArrayList) map.get(Integer.valueOf(i));
        if (arrayList != null) {
            return arrayList;
        }
        Integer numValueOf = Integer.valueOf(i);
        ArrayList<WebTabData> arrayList2 = new ArrayList<>();
        map.put(numValueOf, arrayList2);
        return arrayList2;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return touchEvent(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction()) || super.onTouchEvent(motionEvent);
    }

    public final void openTab(WebTabData webTabData) {
        ChatActivity chatActivity;
        ChatActivity.AnonymousClass39 anonymousClass39;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null || lastFragment.getParentActivity() == null) {
            return;
        }
        boolean z = lastFragment instanceof ChatActivity;
        if (z && (anonymousClass39 = (chatActivity = (ChatActivity) lastFragment).chatActivityEnterView) != null) {
            AndroidUtilities.hideKeyboard(anonymousClass39.messageEditText);
            chatActivity.chatActivityEnterView.hidePopup(true, false, true);
        }
        if (webTabData.articleViewer == null) {
            new ArticleViewer$$ExternalSyntheticLambda21(2, this, webTabData).run(lastFragment);
            if (webTabData.needsContext) {
                if (z && ((ChatActivity) lastFragment).getDialogId() == webTabData.props.botId) {
                    return;
                }
                this.doNotDismiss = true;
                AndroidUtilities.runOnUIThread(new BottomSheetTabs$$ExternalSyntheticLambda1(this, lastFragment, ChatActivity.of(webTabData.props.botId), 0), 220L);
                return;
            }
            return;
        }
        BaseFragment sheetFragment = this.actionBarLayout.getSheetFragment();
        ArticleViewer articleViewer = webTabData.articleViewer;
        BottomSheetTabDialog.checkSheet(articleViewer.sheet);
        ArticleViewer.Sheet sheet = articleViewer.sheet;
        sheetFragment.addSheet(sheet);
        sheet.dismissing = false;
        sheet.dismissingIntoTabs = false;
        ValueAnimator valueAnimator = sheet.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = sheet.dismissAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        sheet.dismissProgress = 0.0f;
        sheet.openProgress = 0.0f;
        sheet.checkFullyVisible();
        sheet.updateTranslation();
        ArticleViewer.Sheet.WindowView windowView = sheet.windowView;
        windowView.invalidate();
        windowView.requestLayout();
        articleViewer.setParentActivity(sheetFragment.getParentActivity(), sheetFragment);
        sheet.attachInternal(sheetFragment);
        sheet.animateOpen();
        removeTab(this.currentAccount, webTabData, false);
    }

    public final void removeAll() {
        ArrayList<WebTabData> tabs2 = getTabs();
        ArrayList<TabDrawable> tabDrawables2 = getTabDrawables();
        for (int i = 0; i < tabs2.size(); i++) {
            tabs2.get(i).destroy();
        }
        tabs2.clear();
        for (int i2 = 0; i2 < tabDrawables2.size(); i2++) {
            tabDrawables2.get(i2).index = -1;
        }
        updateMultipleTitle();
        updateVisibility(true);
        invalidate();
        tabs2.isEmpty();
    }

    public final boolean removeTab(int i, WebTabData webTabData, boolean z) {
        HashMap map = tabs;
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(i));
        if (arrayList == null) {
            Integer numValueOf = Integer.valueOf(i);
            ArrayList arrayList2 = new ArrayList();
            map.put(numValueOf, arrayList2);
            arrayList = arrayList2;
        }
        HashMap map2 = tabDrawables;
        ArrayList arrayList3 = (ArrayList) map2.get(Integer.valueOf(i));
        if (arrayList3 == null) {
            Integer numValueOf2 = Integer.valueOf(i);
            arrayList3 = new ArrayList();
            map2.put(numValueOf2, arrayList3);
        }
        arrayList.remove(webTabData);
        if (z) {
            webTabData.destroy();
        }
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            TabDrawable tabDrawable = (TabDrawable) arrayList3.get(i2);
            int iIndexOf = arrayList.indexOf(tabDrawable.tab);
            tabDrawable.index = iIndexOf;
            if (iIndexOf >= 0) {
                tabDrawable.position = iIndexOf;
            }
        }
        updateMultipleTitle();
        AndroidUtilities.runOnUIThread(new BottomSheetTabs$$ExternalSyntheticLambda1(this, arrayList3, webTabData, 2), 320L);
        updateVisibility(true);
        invalidate();
        TabsAccessibilityHelper tabsAccessibilityHelper = this.accessibilityHelper;
        if (tabsAccessibilityHelper != null) {
            tabsAccessibilityHelper.invalidateRoot();
        }
        return arrayList.isEmpty();
    }

    public void setCurrentAccount(int i) {
        if (this.currentAccount != i) {
            this.currentAccount = i;
            updateVisibility(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i) {
        setNavigationBarColor(i, true);
    }

    public void setupTab(TabDrawable tabDrawable) {
        int i = this.tabColorAnimated.set(this.tabColor, false);
        float f = this.tabDarkAnimated.set(this.tabIsDark);
        tabDrawable.expandProgress = 0.0f;
        boolean z = f > 0.5f;
        tabDrawable.backgroundColor = i;
        tabDrawable.backgroundIsDark = z;
    }

    public final boolean touchEvent(float f, float f2, int i) {
        ArrayList<WebTabData> tabs2 = getTabs();
        ArrayList<TabDrawable> tabDrawables2 = getTabDrawables();
        if (this.drawTabs) {
            WebTabData webTabData = tabs2.isEmpty() ? null : tabs2.get(0);
            TabDrawable tabDrawableFindTabDrawable = findTabDrawable(webTabData);
            if (tabDrawableFindTabDrawable != null) {
                RectF rectF = this.rect;
                getTabBounds(rectF, tabDrawableFindTabDrawable.getPosition());
                BaseCell.RippleDrawableSafe rippleDrawableSafe = tabDrawableFindTabDrawable.closeRipple;
                if (i == 0 || i == 2) {
                    boolean zContains = rippleDrawableSafe.getBounds().contains((int) (f - rectF.left), (int) (f2 - rectF.centerY()));
                    this.closeRippleHit = zContains;
                    this.hit = !zContains && rectF.contains(f, f2);
                    rippleDrawableSafe.setState(this.closeRippleHit ? new int[]{16842919, 16842910} : new int[0]);
                } else if (i == 1 || i == 3) {
                    if (this.hit && i == 1) {
                        click();
                    } else if (this.closeRippleHit && i == 1) {
                        removeTab(webTabData, new LinkEditActivity$$ExternalSyntheticLambda9(1));
                    }
                    this.closeRippleHit = false;
                    this.hit = false;
                    rippleDrawableSafe.setState(new int[0]);
                }
                for (int i2 = 0; i2 < tabDrawables2.size(); i2++) {
                    if (tabDrawables2.get(i2) != tabDrawableFindTabDrawable) {
                        tabDrawables2.get(i2).closeRipple.setState(new int[0]);
                    }
                }
            } else {
                this.hit = false;
                this.closeRippleHit = false;
            }
        } else {
            this.hit = false;
            this.closeRippleHit = false;
        }
        return this.hit || this.closeRippleHit;
    }

    public final WebTabData tryReopenTab(WebViewRequestProps webViewRequestProps) {
        HashMap map = tabs;
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(this.currentAccount));
        if (arrayList == null) {
            Integer numValueOf = Integer.valueOf(this.currentAccount);
            ArrayList arrayList2 = new ArrayList();
            map.put(numValueOf, arrayList2);
            arrayList = arrayList2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            WebTabData webTabData = (WebTabData) arrayList.get(i);
            if (webViewRequestProps.equals(webTabData.props)) {
                openTab(webTabData);
                return webTabData;
            }
        }
        return null;
    }

    public final void updateMultipleTitle() {
        CharSequence charSequenceReplaceEmoji;
        ArrayList<WebTabData> tabs2 = getTabs();
        ArrayList<TabDrawable> tabDrawables2 = getTabDrawables();
        CharSequence charSequence = null;
        for (int i = 0; i < tabDrawables2.size(); i++) {
            TabDrawable tabDrawable = tabDrawables2.get(i);
            if (tabs2.size() <= 1 || tabDrawable.position != 0) {
                charSequenceReplaceEmoji = Emoji.replaceEmoji(tabDrawable.tab.getTitle(), getTextPaint().getFontMetricsInt(), false);
                tabDrawable.overrideTitle = null;
            } else {
                charSequenceReplaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs2.size() - 1, tabDrawable.tab.getTitle()), getTextPaint().getFontMetricsInt(), false);
                if (charSequenceReplaceEmoji == null) {
                    tabDrawable.overrideTitle = null;
                } else {
                    tabDrawable.overrideTitle = new Text(charSequenceReplaceEmoji, 17.0f, AndroidUtilities.bold());
                }
            }
            charSequence = charSequenceReplaceEmoji;
        }
        if (tabs2.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(LocaleController.formatString(R.string.AccDescrTabs, ""));
            return;
        }
        setImportantForAccessibility(1);
        int i2 = R.string.AccDescrTabs;
        if (charSequence == null) {
            charSequence = "";
        }
        setContentDescription(LocaleController.formatString(i2, charSequence));
    }

    public final void updateVisibility(boolean z) {
        int i = 0;
        if (this.bottomTabsHeight == getExpandedHeight()) {
            return;
        }
        ValueAnimator valueAnimator = this.bottomTabsAnimator;
        if (valueAnimator != null) {
            this.bottomTabsAnimator = null;
            valueAnimator.cancel();
        }
        this.bottomTabsHeight = getExpandedHeight();
        Iterator it = this.relayoutListeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.bottomTabsProgress, this.bottomTabsHeight);
            this.bottomTabsAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new BottomSheetTabs$$ExternalSyntheticLambda2(this, i));
            this.bottomTabsAnimator.addListener(new ActionBar.AnonymousClass7.AnonymousClass1(this, 3));
            this.bottomTabsAnimator.setDuration(250L);
            this.bottomTabsAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
            this.bottomTabsAnimator.start();
        } else {
            this.bottomTabsProgress = this.bottomTabsHeight;
            invalidate();
        }
        Object parent = getParent();
        if (parent instanceof View) {
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api20Impl.requestApplyInsets((View) parent);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }

    public final void setNavigationBarColor(int i, boolean z) {
        if (i != this.backgroundColor) {
            ActionBarLayout actionBarLayout = this.actionBarLayout;
            if (!actionBarLayout.startedTracking || actionBarLayout.animationInProgress) {
                z = false;
            }
            this.backgroundColor = i;
            int iBlendOver = Theme.blendOver(i, Theme.multAlpha(AndroidUtilities.computePerceivedBrightness(i) < 0.721f ? 0.08f : 0.75f, -1));
            this.tabColor = iBlendOver;
            this.tabIsDark = AndroidUtilities.computePerceivedBrightness(iBlendOver) < 0.721f;
            if (!z) {
                this.backgroundColorAnimated.set(this.backgroundColor, true);
                this.tabColorAnimated.set(this.tabColor, true);
                this.tabDarkAnimated.set(this.tabIsDark, true);
            }
            invalidate();
        }
    }

    public final WebTabData tryReopenTab(TLRPC.WebPage webPage) {
        TLRPC.WebPage webPage2;
        if (webPage == null) {
            return null;
        }
        ArrayList<WebTabData> tabs2 = getTabs();
        for (int i = 0; i < tabs2.size(); i++) {
            WebTabData webTabData = tabs2.get(i);
            ArticleViewer articleViewer = webTabData.articleViewer;
            if (articleViewer != null && !articleViewer.pagesStack.isEmpty()) {
                Object objM = zziq.m(1, webTabData.articleViewer.pagesStack);
                if ((objM instanceof TLRPC.WebPage) && (webPage2 = (TLRPC.WebPage) objM) != null && webPage2.id == webPage.id) {
                    openTab(webTabData);
                    return webTabData;
                }
            }
        }
        return null;
    }

    public final WebTabData tryReopenTab(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return tryReopenTab(webPage);
    }

    public final void removeTab(WebTabData webTabData, final Utilities.Callback callback) {
        if (webTabData == null) {
            callback.run(Boolean.TRUE);
            return;
        }
        if (!webTabData.confirmDismiss) {
            removeTab(this.currentAccount, webTabData, true);
            callback.run(Boolean.TRUE);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(webTabData.props.currentAccount).getUser(Long.valueOf(webTabData.props.botId));
        String name = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        final boolean[] zArr = {false};
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = name;
        alertDialog.message = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        builder.setPositiveButton(LocaleController.getString(R.string.BotWebViewCloseAnyway), new StarsController$$ExternalSyntheticLambda104(this, zArr, webTabData, callback, alertDialogArr));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog2, int i) {
                zArr[0] = true;
                callback.run(Boolean.FALSE);
                alertDialogArr[0].dismiss();
            }
        });
        final AlertDialog[] alertDialogArr = {alertDialog};
        alertDialog.setOnDismissListener(new StarsController$$ExternalSyntheticLambda94(zArr, callback));
        alertDialogArr[0].show();
        ((TextView) alertDialogArr[0].getButton(-1)).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
    }
}
