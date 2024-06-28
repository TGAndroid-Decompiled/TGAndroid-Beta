package org.telegram.ui.ActionBar;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bots.BotWebViewAttachedSheet;
import org.telegram.ui.bots.BotWebViewContainer;
import org.telegram.ui.bots.BotWebViewSheet;

public class BottomSheetTabs extends FrameLayout {
    private final ActionBarLayout actionBarLayout;
    private int backgroundColor;
    private AnimatedColor backgroundColorAnimated;
    private final Paint backgroundPaint;
    private boolean closeRippleHit;
    public boolean drawTabs;
    private final RectF rect;
    private int tabColor;
    private AnimatedColor tabColorAnimated;
    private AnimatedFloat tabDarkAnimated;
    public final ArrayList<TabDrawable> tabDrawables;
    private boolean tabIsDark;
    public final ArrayList<WebTabData> tabs;

    public BottomSheetTabs(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.backgroundPaint = new Paint(1);
        this.drawTabs = true;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.backgroundColorAnimated = new AnimatedColor(this, 0L, 200L, cubicBezierInterpolator);
        this.tabColorAnimated = new AnimatedColor(this, 0L, 200L, cubicBezierInterpolator);
        this.tabDarkAnimated = new AnimatedFloat(this, 0L, 200L, cubicBezierInterpolator);
        this.tabs = new ArrayList<>();
        this.tabDrawables = new ArrayList<>();
        this.rect = new RectF();
        this.actionBarLayout = actionBarLayout;
        setNavigationBarColor(Theme.getColor(Theme.key_windowBackgroundGray));
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BottomSheetTabs.this.lambda$new$0(view);
            }
        });
    }

    public void lambda$new$0(View view) {
        int size = this.tabs.size();
        if (size == 0) {
            return;
        }
        ArrayList<WebTabData> arrayList = this.tabs;
        WebTabData webTabData = arrayList.get(arrayList.size() - 1);
        BottomSheetTabsOverlay bottomSheetTabsOverlay = LaunchActivity.instance.getBottomSheetTabsOverlay();
        if (size == 1 || bottomSheetTabsOverlay == null) {
            openTab(webTabData);
        } else {
            bottomSheetTabsOverlay.openTabsView();
        }
    }

    public void openTab(WebTabData webTabData) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null || lastFragment.getParentActivity() == null) {
            return;
        }
        if (lastFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) lastFragment;
            if (chatActivity.getChatActivityEnterView() != null) {
                chatActivity.getChatActivityEnterView().closeKeyboard();
                chatActivity.getChatActivityEnterView().hidePopup(true, false);
            }
        }
        boolean closeAttachedSheets = closeAttachedSheets();
        if (AndroidUtilities.isTablet()) {
            BotWebViewSheet botWebViewSheet = new BotWebViewSheet(lastFragment.getContext(), lastFragment.getResourceProvider());
            botWebViewSheet.setParentActivity(lastFragment.getParentActivity());
            if (botWebViewSheet.restoreState(lastFragment, webTabData)) {
                removeTab(webTabData, false);
                botWebViewSheet.show();
                return;
            }
            return;
        }
        BotWebViewAttachedSheet createBotViewer = lastFragment.createBotViewer();
        createBotViewer.setParentActivity(lastFragment.getParentActivity());
        if (createBotViewer.restoreState(lastFragment, webTabData)) {
            removeTab(webTabData, false);
            createBotViewer.show(closeAttachedSheets);
        }
    }

    public WebTabData tryReopenTab(BotWebViewAttachedSheet.WebViewRequestProps webViewRequestProps) {
        if (webViewRequestProps == null) {
            return null;
        }
        for (int i = 0; i < this.tabs.size(); i++) {
            WebTabData webTabData = this.tabs.get(i);
            if (webViewRequestProps.equals(webTabData.props)) {
                openTab(webTabData);
                return webTabData;
            }
        }
        return null;
    }

    public boolean closeAttachedSheets() {
        BottomSheetTabsOverlay bottomSheetTabsOverlay = LaunchActivity.instance.getBottomSheetTabsOverlay();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        int i = 0;
        if (safeLastFragment == null) {
            return false;
        }
        boolean z = false;
        while (true) {
            ArrayList<BaseFragment.AttachedSheet> arrayList = safeLastFragment.sheetsStack;
            if (arrayList == null || i >= arrayList.size()) {
                break;
            }
            BaseFragment.AttachedSheet attachedSheet = safeLastFragment.sheetsStack.get(i);
            if (attachedSheet instanceof BotWebViewAttachedSheet) {
                if (bottomSheetTabsOverlay != null) {
                    bottomSheetTabsOverlay.setSlowerDismiss(true);
                }
                ((BotWebViewAttachedSheet) attachedSheet).dismiss(true, null);
                z = true;
            }
            i++;
        }
        return z;
    }

    public void setNavigationBarColor(int i) {
        setNavigationBarColor(i, true);
    }

    public void setNavigationBarColor(int i, boolean z) {
        if (i != this.backgroundColor) {
            ActionBarLayout actionBarLayout = this.actionBarLayout;
            if (!actionBarLayout.startedTracking || actionBarLayout.animationInProgress) {
                z = false;
            }
            this.backgroundColor = i;
            int blendOver = Theme.blendOver(i, Theme.multAlpha(-1, (AndroidUtilities.computePerceivedBrightness(i) > 0.721f ? 1 : (AndroidUtilities.computePerceivedBrightness(i) == 0.721f ? 0 : -1)) < 0 ? 0.08f : 0.75f));
            this.tabColor = blendOver;
            this.tabIsDark = AndroidUtilities.computePerceivedBrightness(blendOver) < 0.721f;
            if (!z) {
                this.backgroundColorAnimated.set(this.backgroundColor, true);
                this.tabColorAnimated.set(this.tabColor, true);
                this.tabDarkAnimated.set(this.tabIsDark, true);
            }
            invalidate();
        }
    }

    public int getExpandedHeight() {
        int size = this.tabs.size();
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return AndroidUtilities.dp(60.0f);
        }
        return AndroidUtilities.dp(68.0f);
    }

    public TabDrawable findTabDrawable(WebTabData webTabData) {
        for (int i = 0; i < this.tabDrawables.size(); i++) {
            if (this.tabDrawables.get(i).tab == webTabData) {
                return this.tabDrawables.get(i);
            }
        }
        return null;
    }

    public TabDrawable pushTab(WebTabData webTabData) {
        TabDrawable tabDrawable = new TabDrawable(this, webTabData);
        tabDrawable.animatedPosition.set(-1.0f, true);
        tabDrawable.animatedAlpha.set(0.0f, true);
        this.tabDrawables.add(tabDrawable);
        this.tabs.add(0, webTabData);
        for (int i = 0; i < this.tabDrawables.size(); i++) {
            TabDrawable tabDrawable2 = this.tabDrawables.get(i);
            int indexOf = this.tabs.indexOf(tabDrawable2.tab);
            tabDrawable2.index = indexOf;
            if (indexOf >= 0) {
                tabDrawable2.position = indexOf;
            }
        }
        updateMultipleTitle();
        this.actionBarLayout.updateBottomTabsVisibility(true);
        invalidate();
        return tabDrawable;
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }

    private void updateMultipleTitle() {
        for (int i = 0; i < this.tabDrawables.size(); i++) {
            TabDrawable tabDrawable = this.tabDrawables.get(i);
            if (this.tabs.size() > 1 && tabDrawable.position == 0) {
                tabDrawable.setOverrideTitle(LocaleController.formatPluralString("BotMoreTabs", this.tabs.size() - 1, UserObject.getUserName(MessagesController.getInstance(tabDrawable.tab.props.currentAccount).getUser(Long.valueOf(tabDrawable.tab.props.botId)))));
            } else {
                tabDrawable.setOverrideTitle(null);
            }
        }
    }

    public boolean removeAll() {
        for (int i = 0; i < this.tabs.size(); i++) {
            this.tabs.get(i).destroy();
        }
        this.tabs.clear();
        for (int i2 = 0; i2 < this.tabDrawables.size(); i2++) {
            this.tabDrawables.get(i2).index = -1;
        }
        updateMultipleTitle();
        this.actionBarLayout.updateBottomTabsVisibility(true);
        invalidate();
        return this.tabs.isEmpty();
    }

    public boolean removeTab(final WebTabData webTabData, boolean z) {
        this.tabs.remove(webTabData);
        if (z) {
            webTabData.destroy();
        }
        for (int i = 0; i < this.tabDrawables.size(); i++) {
            TabDrawable tabDrawable = this.tabDrawables.get(i);
            int indexOf = this.tabs.indexOf(tabDrawable.tab);
            tabDrawable.index = indexOf;
            if (indexOf >= 0) {
                tabDrawable.position = indexOf;
            }
        }
        updateMultipleTitle();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BottomSheetTabs.this.lambda$removeTab$1(webTabData);
            }
        }, 320L);
        this.actionBarLayout.updateBottomTabsVisibility(true);
        invalidate();
        return this.tabs.isEmpty();
    }

    public void lambda$removeTab$1(WebTabData webTabData) {
        int i = 0;
        while (i < this.tabDrawables.size()) {
            if (this.tabDrawables.get(i).tab == webTabData) {
                this.tabDrawables.remove(i);
                i--;
            }
            i++;
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.drawTabs) {
            WebTabData webTabData = this.tabs.isEmpty() ? null : this.tabs.get(0);
            TabDrawable findTabDrawable = findTabDrawable(webTabData);
            if (findTabDrawable != null) {
                getTabBounds(this.rect, findTabDrawable.getPosition());
                boolean contains = findTabDrawable.closeRipple.getBounds().contains((int) (motionEvent.getX() - this.rect.left), (int) (motionEvent.getY() - this.rect.centerY()));
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                    this.closeRippleHit = contains;
                    findTabDrawable.closeRipple.setState(contains ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : new int[0]);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.closeRippleHit && motionEvent.getAction() == 1) {
                        removeTab(webTabData, true);
                    }
                    this.closeRippleHit = false;
                    findTabDrawable.closeRipple.setState(new int[0]);
                }
                for (int i = 0; i < this.tabDrawables.size(); i++) {
                    if (this.tabDrawables.get(i) != findTabDrawable) {
                        this.tabDrawables.get(i).closeRipple.setState(new int[0]);
                    }
                }
            } else {
                this.closeRippleHit = false;
            }
        }
        if (this.closeRippleHit) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        this.backgroundPaint.setColor(this.backgroundColorAnimated.set(this.backgroundColor));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.backgroundPaint);
        super.dispatchDraw(canvas);
        int i = this.tabColorAnimated.set(this.tabColor);
        float f = this.tabDarkAnimated.set(this.tabIsDark);
        if (this.drawTabs) {
            for (int i2 = 0; i2 < this.tabDrawables.size(); i2++) {
                TabDrawable tabDrawable = this.tabDrawables.get(i2);
                float position = tabDrawable.getPosition();
                float alpha = tabDrawable.getAlpha();
                if (alpha > 0.0f && position <= 1.99f) {
                    getTabBounds(this.rect, position);
                    tabDrawable.setExpandProgress(0.0f);
                    tabDrawable.setBackgroundColor(i, f > 0.5f);
                    tabDrawable.draw(canvas, this.rect, AndroidUtilities.dp(10.0f), alpha);
                }
            }
        }
    }

    public void setupTab(TabDrawable tabDrawable) {
        int i = this.tabColorAnimated.set(this.tabColor);
        float f = this.tabDarkAnimated.set(this.tabIsDark);
        tabDrawable.setExpandProgress(0.0f);
        tabDrawable.setBackgroundColor(i, f > 0.5f);
    }

    public void getTabBounds(RectF rectF, float f) {
        rectF.set(AndroidUtilities.dp(4.0f), (getHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(50.0f), getWidth() - AndroidUtilities.dp(4.0f), getHeight() - AndroidUtilities.dp(4.0f));
        rectF.offset(0.0f, (-AndroidUtilities.dp(8.0f)) * f);
        float lerp = AndroidUtilities.lerp(1.0f, 0.95f, Math.abs(f));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float width = rectF.width();
        float height = rectF.height();
        float f2 = (width / 2.0f) * lerp;
        rectF.left = centerX - f2;
        rectF.right = centerX + f2;
        float f3 = (height / 2.0f) * lerp;
        rectF.top = centerY - f3;
        rectF.bottom = centerY + f3;
    }

    public static class TabDrawable {
        public final AnimatedFloat animatedAlpha;
        public final AnimatedFloat animatedPosition;
        private int backgroundColor;
        private boolean backgroundIsDark;
        private final Paint backgroundPaint = new Paint(1);
        private final Path closePath;
        public final Drawable closeRipple;
        public int closeRippleColor;
        private final Path expandPath;
        private float expandProgress;
        private final Paint iconPaint;
        public int index;
        private Text overrideTitle;
        private int position;
        private final float[] radii;
        private final Path rectPath;
        public final WebTabData tab;
        private int tabColor;
        private boolean tabIsDark;
        private Text title;

        public TabDrawable(View view, WebTabData webTabData) {
            Paint paint = new Paint(1);
            this.iconPaint = paint;
            Drawable createSelectorDrawable = Theme.createSelectorDrawable(822083583, 1);
            this.closeRipple = createSelectorDrawable;
            this.radii = new float[8];
            this.rectPath = new Path();
            Path path = new Path();
            this.closePath = path;
            Path path2 = new Path();
            this.expandPath = path2;
            this.tab = webTabData;
            createSelectorDrawable.setCallback(view);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.animatedPosition = new AnimatedFloat(view, 320L, cubicBezierInterpolator);
            this.animatedAlpha = new AnimatedFloat(view, 320L, cubicBezierInterpolator);
            this.title = new Text(UserObject.getUserName(MessagesController.getInstance(webTabData.props.currentAccount).getUser(Long.valueOf(webTabData.getBotId()))), 17.0f, AndroidUtilities.bold());
            int i = webTabData.actionBarColor;
            this.tabColor = i;
            this.tabIsDark = AndroidUtilities.computePerceivedBrightness(i) < 0.721f;
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

        public void setOverrideTitle(String str) {
            if (str == null) {
                this.overrideTitle = null;
            } else {
                this.overrideTitle = new Text(str, 17.0f, AndroidUtilities.bold());
            }
        }

        public float getPosition() {
            return this.index < 0 ? this.position : this.animatedPosition.set(this.position);
        }

        public float getAlpha() {
            float min;
            float position = getPosition();
            if (position < 0.0f) {
                min = position + 1.0f;
            } else if (position >= 0.0f && position < 1.0f) {
                min = AndroidUtilities.lerp(1.0f, 0.87f, position);
            } else {
                min = (1.0f - Math.min(1.0f, position - 1.0f)) * 0.87f;
            }
            return min * this.animatedAlpha.set(this.index >= 0);
        }

        public void setBackgroundColor(int i, boolean z) {
            this.backgroundColor = i;
            this.backgroundIsDark = z;
        }

        public void setExpandProgress(float f) {
            this.expandProgress = f;
        }

        public void draw(Canvas canvas, RectF rectF, float f, float f2) {
            this.backgroundPaint.setColor(ColorUtils.blendARGB(this.backgroundColor, this.tabColor, this.expandProgress));
            float f3 = 255.0f * f2;
            int i = (int) f3;
            this.backgroundPaint.setAlpha(i);
            this.backgroundPaint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(268435456, f2 > 0.9f ? 1.0f : 0.0f));
            float[] fArr = this.radii;
            fArr[3] = f;
            fArr[2] = f;
            fArr[1] = f;
            fArr[0] = f;
            float lerp = AndroidUtilities.lerp(f, 0.0f, this.expandProgress);
            fArr[7] = lerp;
            fArr[6] = lerp;
            fArr[5] = lerp;
            fArr[4] = lerp;
            this.rectPath.rewind();
            this.rectPath.addRoundRect(rectF, this.radii, Path.Direction.CW);
            canvas.drawPath(this.rectPath, this.backgroundPaint);
            float lerp2 = AndroidUtilities.lerp(this.backgroundIsDark ? 1.0f : 0.0f, this.tabIsDark ? 1.0f : 0.0f, this.expandProgress);
            int blendARGB = ColorUtils.blendARGB(-16777216, -1, lerp2);
            this.iconPaint.setColor(blendARGB);
            this.iconPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.save();
            canvas.translate(rectF.left, rectF.centerY());
            int blendARGB2 = ColorUtils.blendARGB(553648127, 553648127, lerp2);
            this.closeRipple.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f));
            if (this.closeRippleColor != blendARGB2) {
                Drawable drawable = this.closeRipple;
                this.closeRippleColor = blendARGB2;
                Theme.setSelectorDrawableColor(drawable, blendARGB2, false);
            }
            this.closeRipple.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
            this.iconPaint.setAlpha(i);
            canvas.drawPath(this.closePath, this.iconPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
            this.iconPaint.setAlpha((int) (f3 * (1.0f - this.expandProgress)));
            canvas.drawPath(this.expandPath, this.iconPaint);
            canvas.restore();
            Text text = this.overrideTitle;
            if (text != null) {
                text.ellipsize((int) (rectF.width() - AndroidUtilities.dp(100.0f))).draw(canvas, AndroidUtilities.dp(60.0f) + rectF.left, rectF.centerY(), blendARGB, (1.0f - this.expandProgress) * f2);
            }
            this.title.ellipsize((int) (rectF.width() - AndroidUtilities.dp(100.0f))).draw(canvas, AndroidUtilities.dp(60.0f) + rectF.left, rectF.centerY(), blendARGB, (this.overrideTitle != null ? this.expandProgress : 1.0f) * f2);
        }
    }

    public static class WebTabData {
        public int actionBarColor;
        public int actionBarColorKey;
        public boolean backButton;
        public int backgroundColor;
        public boolean expanded;
        public String lastUrl;
        public boolean overrideActionBarColor;
        public Bitmap previewBitmap;
        public Object previewNode;
        public BotWebViewAttachedSheet.WebViewRequestProps props;
        public boolean ready;
        public boolean themeIsDark;
        public BotWebViewContainer.MyWebView webView;
        public int webViewHeight;
        public BotWebViewContainer.WebViewProxy webViewProxy;
        public int webViewWidth;

        public long getBotId() {
            BotWebViewAttachedSheet.WebViewRequestProps webViewRequestProps = this.props;
            if (webViewRequestProps == null) {
                return 0L;
            }
            return webViewRequestProps.botId;
        }

        public void destroy() {
            try {
                BotWebViewContainer.MyWebView myWebView = this.webView;
                if (myWebView != null) {
                    myWebView.destroy();
                    this.webView = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
