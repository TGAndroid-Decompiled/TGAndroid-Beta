package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView$$ExternalSyntheticLambda24;
import org.telegram.ui.Components.FillLastLinearLayoutManager;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.NestedSizeNotifierLayout;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Stories.recorder.HintView2;

public abstract class GradientHeaderActivity extends BaseFragment {
    public BackgroundView backgroundView;
    protected FrameLayout contentView;
    private int currentYOffset;
    private final PremiumGradient.PremiumGradientTools darkGradientTools;
    private int firstViewHeight;
    private final Canvas gradientCanvas;
    private final Bitmap gradientTextureBitmap;
    private final PremiumGradient.PremiumGradientTools gradientTools;
    private final Paint headerBgPaint;
    private boolean inc;
    private boolean isDialogVisible;
    public boolean isLandscapeMode;
    protected LinearLayoutManager layoutManager;
    protected RecyclerListView listView;
    private int minusHeaderHeight;
    protected StarParticlesView particlesView;
    public int particlesViewHeight;
    private float progress;
    private float progressToFull;
    public int savedScrollOffset;
    public int savedScrollPosition;
    private Drawable shadowDrawable;
    public int statusBarHeight;
    private float totalProgress;
    protected boolean useFillLastLayoutManager;
    public boolean whiteBackground;
    protected int yOffset;

    public static class BackgroundView extends LinearLayout {
        private final FrameLayout aboveTitleLayout;
        private final FrameLayout belowSubTitleLayout;
        public final LinkSpanDrawable.LinksTextView subtitleView;
        private final TextView titleView;

        public BackgroundView(Context context) {
            super(context);
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            this.aboveTitleLayout = frameLayout;
            addView(frameLayout, LayoutHelper.createLinear(-1, -2, 1));
            frameLayout.setClipChildren(false);
            setClipChildren(false);
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 22.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(1);
            addView(textView, LayoutHelper.createLinear(-2, -2, 0.0f, 1, 16, 20, 16, 0));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.subtitleView = linksTextView;
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linksTextView.setGravity(1);
            addView(linksTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 1, 24, 7, 24, 0));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.belowSubTitleLayout = frameLayout2;
            addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 1));
            frameLayout2.setClipChildren(false);
        }

        public void setData(CharSequence charSequence, CharSequence charSequence2, View view, View view2) {
            this.titleView.setText(charSequence);
            this.subtitleView.setText(charSequence2);
            LinkSpanDrawable.LinksTextView linksTextView = this.subtitleView;
            linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), this.subtitleView.getPaint()));
            if (view != null) {
                this.aboveTitleLayout.removeAllViews();
                this.aboveTitleLayout.addView(view, LayoutHelper.createFrame(-1, -2, 1));
                this.aboveTitleLayout.setClickable(view.isClickable());
            } else {
                this.aboveTitleLayout.setClickable(false);
            }
            if (view2 != null) {
                this.belowSubTitleLayout.removeAllViews();
                this.belowSubTitleLayout.addView(view2, LayoutHelper.createFrame(-1, -2, 1));
                this.belowSubTitleLayout.setClickable(view2.isClickable());
            } else {
                this.belowSubTitleLayout.setClickable(false);
            }
            requestLayout();
        }
    }

    public class ContentView extends NestedSizeNotifierLayout {
        private LinearGradient backgroundGradient;
        private final Paint backgroundGradientPaint;
        private final Paint backgroundPaint;
        boolean bottomInterceptedTouch;
        boolean isTouchedActionBarBackButton;
        int lastSize;
        private Boolean lightStatusBar;
        boolean subtitleInterceptedTouch;
        boolean topInterceptedTouch;

        public ContentView(Context context) {
            super(context);
            this.backgroundPaint = new Paint(1);
            this.backgroundGradientPaint = new Paint(1);
        }

        private void setLightStatusBar(int i) {
            boolean z = AndroidUtilities.computePerceivedBrightness(i) >= 0.721f;
            Boolean bool = this.lightStatusBar;
            if (bool == null || bool.booleanValue() != z) {
                View view = GradientHeaderActivity.this.fragmentView;
                this.lightStatusBar = Boolean.valueOf(z);
                AndroidUtilities.setLightStatusBar(view, z);
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            GradientHeaderActivity gradientHeaderActivity = GradientHeaderActivity.this;
            BackgroundView backgroundView = gradientHeaderActivity.backgroundView;
            if (!gradientHeaderActivity.isDialogVisible) {
                if (GradientHeaderActivity.this.inc) {
                    GradientHeaderActivity.access$1716(GradientHeaderActivity.this, 0.016f);
                    if (GradientHeaderActivity.this.progress > 3.0f) {
                        GradientHeaderActivity.this.inc = false;
                    }
                } else {
                    GradientHeaderActivity.access$1724(GradientHeaderActivity.this, 0.016f);
                    if (GradientHeaderActivity.this.progress < 1.0f) {
                        GradientHeaderActivity.this.inc = true;
                    }
                }
            }
            View viewFindViewByPosition = GradientHeaderActivity.this.listView.getLayoutManager() != null ? GradientHeaderActivity.this.listView.getLayoutManager().findViewByPosition(0) : null;
            GradientHeaderActivity.this.currentYOffset = viewFindViewByPosition != null ? viewFindViewByPosition.getBottom() : 0;
            int iDp = AndroidUtilities.dp(16.0f) + ((BaseFragment) GradientHeaderActivity.this).actionBar.getBottom();
            GradientHeaderActivity gradientHeaderActivity2 = GradientHeaderActivity.this;
            gradientHeaderActivity2.totalProgress = 1.0f - ((gradientHeaderActivity2.currentYOffset - iDp) / (GradientHeaderActivity.this.firstViewHeight - iDp));
            GradientHeaderActivity gradientHeaderActivity3 = GradientHeaderActivity.this;
            gradientHeaderActivity3.totalProgress = Utilities.clamp(gradientHeaderActivity3.totalProgress, 1.0f, 0.0f);
            int iDp2 = AndroidUtilities.dp(16.0f) + ((BaseFragment) GradientHeaderActivity.this).actionBar.getBottom();
            if (GradientHeaderActivity.this.currentYOffset < iDp2) {
                GradientHeaderActivity.this.currentYOffset = iDp2;
            }
            float f = GradientHeaderActivity.this.progressToFull;
            GradientHeaderActivity.this.progressToFull = 0.0f;
            if (GradientHeaderActivity.this.currentYOffset < AndroidUtilities.dp(30.0f) + iDp2) {
                GradientHeaderActivity.this.progressToFull = ((AndroidUtilities.dp(30.0f) + iDp2) - GradientHeaderActivity.this.currentYOffset) / AndroidUtilities.dp(30.0f);
            }
            GradientHeaderActivity gradientHeaderActivity4 = GradientHeaderActivity.this;
            if (gradientHeaderActivity4.isLandscapeMode) {
                gradientHeaderActivity4.progressToFull = 1.0f;
                GradientHeaderActivity.this.totalProgress = 1.0f;
            }
            if (f != GradientHeaderActivity.this.progressToFull) {
                GradientHeaderActivity.this.listView.invalidate();
            }
            float fMax = Math.max((((((((BaseFragment) GradientHeaderActivity.this).actionBar.getMeasuredHeight() - GradientHeaderActivity.this.statusBarHeight) - backgroundView.titleView.getMeasuredHeight()) / 2.0f) + GradientHeaderActivity.this.statusBarHeight) - backgroundView.getTop()) - backgroundView.titleView.getTop(), AndroidUtilities.dp(16.0f) + (GradientHeaderActivity.this.currentYOffset - ((backgroundView.getMeasuredHeight() + ((BaseFragment) GradientHeaderActivity.this).actionBar.getMeasuredHeight()) - GradientHeaderActivity.this.statusBarHeight)));
            float fDp = ((-fMax) / 4.0f) + AndroidUtilities.dp(16.0f);
            backgroundView.setTranslationY(fMax);
            backgroundView.aboveTitleLayout.setTranslationY(fDp + AndroidUtilities.dp(16.0f));
            float f2 = ((1.0f - GradientHeaderActivity.this.totalProgress) * 0.4f) + 0.6f;
            float f3 = 1.0f - (GradientHeaderActivity.this.totalProgress > 0.5f ? (GradientHeaderActivity.this.totalProgress - 0.5f) / 0.5f : 0.0f);
            backgroundView.aboveTitleLayout.setScaleX(f2);
            backgroundView.aboveTitleLayout.setScaleY(f2);
            backgroundView.aboveTitleLayout.setAlpha(f3);
            backgroundView.belowSubTitleLayout.setAlpha(f3);
            backgroundView.subtitleView.setAlpha(f3);
            GradientHeaderActivity gradientHeaderActivity5 = GradientHeaderActivity.this;
            gradientHeaderActivity5.particlesView.setAlpha(1.0f - gradientHeaderActivity5.totalProgress);
            GradientHeaderActivity.this.particlesView.setTranslationY((backgroundView.aboveTitleLayout.getY() + backgroundView.getY()) - AndroidUtilities.dp(30.0f));
            backgroundView.titleView.setTranslationX((1.0f - CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(1.0f - (GradientHeaderActivity.this.totalProgress > 0.3f ? (GradientHeaderActivity.this.totalProgress - 0.3f) / 0.7f : 0.0f))) * (AndroidUtilities.dp(72.0f) - backgroundView.titleView.getLeft()));
            if (!GradientHeaderActivity.this.isDialogVisible) {
                invalidate();
            }
            GradientHeaderActivity.this.gradientTools.gradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), GradientHeaderActivity.this.progress * (-getMeasuredWidth()) * 0.1f, 0.0f);
            GradientHeaderActivity gradientHeaderActivity6 = GradientHeaderActivity.this;
            if (gradientHeaderActivity6.whiteBackground) {
                this.backgroundGradientPaint.setColor(gradientHeaderActivity6.getThemedColor(Theme.key_windowBackgroundGray));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.backgroundGradientPaint);
            } else {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), GradientHeaderActivity.this.gradientTools.paint);
            }
            int themedColor = GradientHeaderActivity.this.getThemedColor(Theme.key_dialogTextBlack);
            GradientHeaderActivity gradientHeaderActivity7 = GradientHeaderActivity.this;
            int iBlendARGB = ColorUtils.blendARGB(f3, themedColor, gradientHeaderActivity7.getThemedColor(gradientHeaderActivity7.whiteBackground ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_premiumGradientBackgroundOverlay));
            ((BaseFragment) GradientHeaderActivity.this).actionBar.getBackButton().setColorFilter(iBlendARGB);
            backgroundView.titleView.setTextColor(iBlendARGB);
            GradientHeaderActivity.this.headerBgPaint.setAlpha((int) ((1.0f - f3) * 255.0f));
            setLightStatusBar(Theme.blendOver(Theme.getColor(Theme.key_premiumGradientBackground4, ((BaseFragment) GradientHeaderActivity.this).resourceProvider), GradientHeaderActivity.this.headerBgPaint.getColor()));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ((BaseFragment) GradientHeaderActivity.this).actionBar.getMeasuredHeight(), GradientHeaderActivity.this.headerBgPaint);
            super.dispatchDraw(canvas);
            if (f3 > 0.01f || !GradientHeaderActivity.this.drawActionBarShadow()) {
                return;
            }
            ((ActionBarLayout) ((BaseFragment) GradientHeaderActivity.this).parentLayout).drawHeaderShadow(canvas, 255, ((BaseFragment) GradientHeaderActivity.this).actionBar.getMeasuredHeight());
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            ImageView backButton;
            if (((BaseFragment) GradientHeaderActivity.this).actionBar != null && (backButton = ((BaseFragment) GradientHeaderActivity.this).actionBar.getBackButton()) != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (ViewPositionWatcher.computeRectInParent(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.isTouchedActionBarBackButton = true;
                    }
                }
                if (this.isTouchedActionBarBackButton) {
                    boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return zDispatchTouchEvent;
                    }
                    this.isTouchedActionBarBackButton = false;
                    return zDispatchTouchEvent;
                }
            }
            BackgroundView backgroundView = GradientHeaderActivity.this.backgroundView;
            float x = backgroundView.subtitleView.getX() + backgroundView.getX();
            float y = backgroundView.subtitleView.getY() + backgroundView.getY();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(x, y, backgroundView.subtitleView.getMeasuredWidth() + x, backgroundView.subtitleView.getMeasuredHeight() + y);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.subtitleInterceptedTouch) && !GradientHeaderActivity.this.listView.scrollingByUser && backgroundView.subtitleView.hasLinks() && GradientHeaderActivity.this.progressToFull < 1.0f) {
                motionEvent.offsetLocation(-x, -y);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                    this.subtitleInterceptedTouch = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.subtitleInterceptedTouch = false;
                }
                backgroundView.subtitleView.dispatchTouchEvent(motionEvent);
                return true;
            }
            float x2 = backgroundView.aboveTitleLayout.getX() + backgroundView.getX();
            float y2 = backgroundView.aboveTitleLayout.getY() + backgroundView.getY();
            boolean zIsClickable = backgroundView.aboveTitleLayout.isClickable();
            rectF2.set(x2, y2, backgroundView.aboveTitleLayout.getMeasuredWidth() + x2, backgroundView.aboveTitleLayout.getMeasuredHeight() + y2);
            if (rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.topInterceptedTouch) {
                GradientHeaderActivity gradientHeaderActivity = GradientHeaderActivity.this;
                if (!gradientHeaderActivity.listView.scrollingByUser && zIsClickable && gradientHeaderActivity.progressToFull < 1.0f) {
                    motionEvent.offsetLocation(-x2, -y2);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.topInterceptedTouch = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.topInterceptedTouch = false;
                    }
                    backgroundView.aboveTitleLayout.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
            float x3 = backgroundView.belowSubTitleLayout.getX() + backgroundView.getX();
            float y3 = backgroundView.belowSubTitleLayout.getY() + backgroundView.getY();
            rectF2.set(x3, y3, backgroundView.belowSubTitleLayout.getMeasuredWidth() + x3, backgroundView.belowSubTitleLayout.getMeasuredHeight() + y3);
            if (rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.bottomInterceptedTouch) {
                GradientHeaderActivity gradientHeaderActivity2 = GradientHeaderActivity.this;
                if (!gradientHeaderActivity2.listView.scrollingByUser && gradientHeaderActivity2.progressToFull < 1.0f) {
                    motionEvent.offsetLocation(-x3, -y3);
                    if (motionEvent.getAction() == 0) {
                        this.bottomInterceptedTouch = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.bottomInterceptedTouch = false;
                    }
                    backgroundView.belowSubTitleLayout.dispatchTouchEvent(motionEvent);
                    if (this.bottomInterceptedTouch) {
                        return true;
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            if (view != GradientHeaderActivity.this.listView) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            canvas.clipRect(0, ((BaseFragment) GradientHeaderActivity.this).actionBar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j);
            canvas.restore();
            return true;
        }

        @Override
        public void onMeasure(int i, int i2) {
            GradientHeaderActivity gradientHeaderActivity = GradientHeaderActivity.this;
            BackgroundView backgroundView = gradientHeaderActivity.backgroundView;
            gradientHeaderActivity.isLandscapeMode = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
            GradientHeaderActivity gradientHeaderActivity2 = GradientHeaderActivity.this;
            gradientHeaderActivity2.statusBarHeight = (((BaseFragment) gradientHeaderActivity2).parentLayout == null || !((ActionBarLayout) ((BaseFragment) GradientHeaderActivity.this).parentLayout).isLayersLayout) ? AndroidUtilities.statusBarHeight : 0;
            backgroundView.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            ViewGroup.LayoutParams layoutParams = GradientHeaderActivity.this.particlesView.getLayoutParams();
            int measuredHeight = GradientHeaderActivity.this.particlesViewHeight;
            if (measuredHeight <= 0) {
                measuredHeight = backgroundView.getMeasuredHeight();
            }
            layoutParams.height = measuredHeight;
            GradientHeaderActivity gradientHeaderActivity3 = GradientHeaderActivity.this;
            LinearLayoutManager linearLayoutManager = gradientHeaderActivity3.layoutManager;
            if (linearLayoutManager instanceof FillLastLinearLayoutManager) {
                ((FillLastLinearLayoutManager) linearLayoutManager).setAdditionalHeight(((BaseFragment) gradientHeaderActivity3).actionBar.getMeasuredHeight());
                ((FillLastLinearLayoutManager) GradientHeaderActivity.this.layoutManager).setMinimumLastViewHeight(0);
            }
            super.onMeasure(i, i2);
            if (this.lastSize != ((getMeasuredWidth() + getMeasuredHeight()) << 16)) {
                GradientHeaderActivity.this.updateBackgroundImage();
            }
        }
    }

    public GradientHeaderActivity() {
        super(null);
        int i = Theme.key_premiumGradientBackground1;
        int i2 = Theme.key_premiumGradientBackground2;
        int i3 = Theme.key_premiumGradientBackground3;
        int i4 = Theme.key_premiumGradientBackground4;
        this.gradientTools = new PremiumGradient.PremiumGradientTools(i, i2, i3, i4) {
            @Override
            public int getThemeColorByKey(int i5) {
                return Theme.getDefaultColor(i5);
            }
        };
        PremiumGradient.PremiumGradientTools premiumGradientTools = new PremiumGradient.PremiumGradientTools(i, i2, i3, i4) {
            @Override
            public int getThemeColorByKey(int i5) {
                return Theme.getDefaultColor(i5);
            }
        };
        this.darkGradientTools = premiumGradientTools;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.gradientTextureBitmap = bitmapCreateBitmap;
        this.gradientCanvas = new Canvas(bitmapCreateBitmap);
        this.particlesViewHeight = -1;
        this.useFillLastLayoutManager = true;
        this.headerBgPaint = new Paint();
        premiumGradientTools.darkColors = true;
        this.savedScrollPosition = -1;
    }

    public static int access$024(GradientHeaderActivity gradientHeaderActivity, float f) {
        int i = (int) (gradientHeaderActivity.firstViewHeight - f);
        gradientHeaderActivity.firstViewHeight = i;
        return i;
    }

    public static float access$1716(GradientHeaderActivity gradientHeaderActivity, float f) {
        float f2 = gradientHeaderActivity.progress + f;
        gradientHeaderActivity.progress = f2;
        return f2;
    }

    public static float access$1724(GradientHeaderActivity gradientHeaderActivity, float f) {
        float f2 = gradientHeaderActivity.progress - f;
        gradientHeaderActivity.progress = f2;
        return f2;
    }

    public Boolean lambda$createView$0(View view) {
        ViewParent parent = view.getParent();
        RecyclerListView recyclerListView = this.listView;
        return parent != recyclerListView ? Boolean.FALSE : Boolean.valueOf(!UniversalAdapter.isShadow(recyclerListView.getChildViewHolder(view).getItemViewType()));
    }

    public void updateBackgroundImage() {
        if (this.contentView.getMeasuredWidth() == 0 || this.contentView.getMeasuredHeight() == 0 || this.backgroundView == null) {
            return;
        }
        this.gradientTools.gradientMatrix(0, 0, this.contentView.getMeasuredWidth(), this.contentView.getMeasuredHeight(), 0.0f, 0.0f);
        this.gradientCanvas.save();
        this.gradientCanvas.scale(100.0f / this.contentView.getMeasuredWidth(), 100.0f / this.contentView.getMeasuredHeight());
        this.gradientCanvas.drawRect(0.0f, 0.0f, this.contentView.getMeasuredWidth(), this.contentView.getMeasuredHeight(), this.gradientTools.paint);
        this.gradientCanvas.restore();
    }

    public void updateColors() {
        if (this.backgroundView == null || this.actionBar == null) {
            return;
        }
        this.headerBgPaint.setColor(getThemedColor(Theme.key_dialogBackground));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_premiumGradientBackgroundOverlay;
        actionBar.setItemsColor(Theme.getColor(null, i, false), false);
        this.actionBar.setItemsBackgroundColor(ColorUtils.setAlphaComponent(Theme.getColor(null, i, false), 60), false);
        this.particlesView.drawable.updateColors();
        BackgroundView backgroundView = this.backgroundView;
        if (backgroundView != null) {
            if (this.whiteBackground) {
                TextView textView = backgroundView.titleView;
                int i2 = Theme.key_windowBackgroundWhiteBlackText;
                textView.setTextColor(Theme.getColor(null, i2, false));
                this.backgroundView.subtitleView.setTextColor(Theme.getColor(null, i2, false));
                this.backgroundView.subtitleView.setLinkTextColor(Theme.getColor(null, Theme.key_chat_messageLinkIn, false));
            } else {
                backgroundView.titleView.setTextColor(Theme.getColor(null, i, false));
                this.backgroundView.subtitleView.setTextColor(Theme.getColor(null, i, false));
                this.backgroundView.subtitleView.setLinkTextColor(Theme.getColor(null, Theme.key_chat_messageLinkIn, false));
            }
        }
        updateBackgroundImage();
    }

    public void applyScrolledPosition() {
        applyScrolledPosition(false);
    }

    public void configureHeader(CharSequence charSequence, CharSequence charSequence2, View view, View view2) {
        this.backgroundView.setData(charSequence, charSequence2, view, view2);
    }

    public abstract RecyclerView.Adapter createAdapter();

    public ContentView createContentView() {
        return new ContentView(getContext());
    }

    public StarParticlesView createParticlesView() {
        return new StarParticlesView(getContext()) {
            @Override
            public void configure() {
                StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(50) {
                    @Override
                    public int getPathColor(int i) {
                        return ColorUtils.setAlphaComponent(Theme.getDefaultColor(this.colorKey), 200);
                    }
                };
                this.drawable = drawable;
                drawable.type = 100;
                drawable.roundEffect = false;
                drawable.useRotate = false;
                drawable.useBlur = true;
                drawable.checkBounds = true;
                drawable.isCircle = false;
                drawable.size1 = 4;
                drawable.k3 = 0.98f;
                drawable.k2 = 0.98f;
                drawable.k1 = 0.98f;
                drawable.init();
            }

            @Override
            public int getStarsRectWidth() {
                return getMeasuredWidth();
            }
        };
    }

    @Override
    public View createView(Context context) {
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable drawableMutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogBackground), PorterDuff.Mode.MULTIPLY));
        this.shadowDrawable.getPadding(rect);
        INavigationLayout iNavigationLayout = this.parentLayout;
        this.statusBarHeight = (iNavigationLayout == null || !((ActionBarLayout) iNavigationLayout).isLayersLayout) ? AndroidUtilities.statusBarHeight : 0;
        this.contentView = createContentView();
        INavigationLayout iNavigationLayout2 = this.parentLayout;
        if (iNavigationLayout2 != null && ((ActionBarLayout) iNavigationLayout2).isLayersLayout) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.listView = new RecyclerListView(context);
        if (this.useFillLastLayoutManager) {
            this.layoutManager = new FillLastLinearLayoutManager(context, (AndroidUtilities.dp(68.0f) + this.statusBarHeight) - AndroidUtilities.dp(16.0f), this.listView);
        } else {
            this.layoutManager = new LinearLayoutManager(1, false);
        }
        this.listView.setLayoutManager(this.layoutManager);
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        if (linearLayoutManager instanceof FillLastLinearLayoutManager) {
            ((FillLastLinearLayoutManager) linearLayoutManager).setFixedLastItemHeight();
        }
        RecyclerView.Adapter adapterCreateAdapter = createAdapter();
        this.listView.setAdapter(adapterCreateAdapter);
        if (adapterCreateAdapter instanceof UniversalAdapter) {
            RecyclerListView recyclerListView = this.listView;
            ProfileActivity$$ExternalSyntheticLambda75 profileActivity$$ExternalSyntheticLambda75 = new ProfileActivity$$ExternalSyntheticLambda75(this, 1);
            int iDp = AndroidUtilities.dp(12.0f);
            float fDp = AndroidUtilities.dp(16.0f);
            RecyclerListView recyclerListView2 = this.listView;
            Objects.requireNonNull(recyclerListView2);
            recyclerListView.setSections(profileActivity$$ExternalSyntheticLambda75, iDp, fDp, new EmojiView$$ExternalSyntheticLambda24(recyclerListView2), true);
        } else {
            this.listView.setSections(true);
        }
        this.listView.setClipToPadding(false);
        this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    int iDp2 = AndroidUtilities.dp(16.0f) + ((BaseFragment) GradientHeaderActivity.this).actionBar.getBottom();
                    if (GradientHeaderActivity.this.totalProgress > 0.5f) {
                        GradientHeaderActivity gradientHeaderActivity = GradientHeaderActivity.this;
                        gradientHeaderActivity.listView.smoothScrollBy(0, gradientHeaderActivity.currentYOffset - iDp2);
                        return;
                    }
                    View viewFindViewByPosition = GradientHeaderActivity.this.listView.getLayoutManager() != null ? GradientHeaderActivity.this.listView.getLayoutManager().findViewByPosition(0) : null;
                    if (viewFindViewByPosition == null || viewFindViewByPosition.getTop() >= 0) {
                        return;
                    }
                    GradientHeaderActivity.this.listView.smoothScrollBy(0, viewFindViewByPosition.getTop());
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                GradientHeaderActivity.this.contentView.invalidate();
            }
        });
        this.backgroundView = new BackgroundView(context) {
        };
        FrameLayout frameLayout = this.contentView;
        StarParticlesView starParticlesViewCreateParticlesView = createParticlesView();
        this.particlesView = starParticlesViewCreateParticlesView;
        frameLayout.addView(starParticlesViewCreateParticlesView, LayoutHelper.createFrame(-1, -2.0f));
        this.contentView.addView(this.backgroundView, LayoutHelper.createFrame(-1, -2.0f));
        this.contentView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.contentView.addView(this.actionBar);
        this.fragmentView = this.contentView;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    GradientHeaderActivity.this.finishFragment();
                }
            }
        });
        this.actionBar.setForceSkipTouches(true);
        updateColors();
        return this.fragmentView;
    }

    public boolean drawActionBarShadow() {
        return true;
    }

    public View getHeader(Context context) {
        View view = new View(context) {
            @Override
            public void onMeasure(int i, int i2) {
                GradientHeaderActivity gradientHeaderActivity = GradientHeaderActivity.this;
                if (gradientHeaderActivity.isLandscapeMode) {
                    gradientHeaderActivity.firstViewHeight = (((BaseFragment) gradientHeaderActivity).actionBar.getMeasuredHeight() + gradientHeaderActivity.statusBarHeight) - AndroidUtilities.dp(16.0f);
                } else {
                    int iDp = AndroidUtilities.dp(140.0f);
                    GradientHeaderActivity gradientHeaderActivity2 = GradientHeaderActivity.this;
                    int iMax = iDp + gradientHeaderActivity2.statusBarHeight;
                    if (AndroidUtilities.dp(24.0f) + gradientHeaderActivity2.backgroundView.getMeasuredHeight() > iMax) {
                        iMax = Math.max(iMax, (AndroidUtilities.dp(24.0f) + GradientHeaderActivity.this.backgroundView.getMeasuredHeight()) - GradientHeaderActivity.this.minusHeaderHeight);
                    }
                    GradientHeaderActivity.this.firstViewHeight = iMax;
                }
                GradientHeaderActivity gradientHeaderActivity3 = GradientHeaderActivity.this;
                GradientHeaderActivity.access$024(gradientHeaderActivity3, gradientHeaderActivity3.yOffset * 2.5f);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(GradientHeaderActivity.this.firstViewHeight, 1073741824));
            }
        };
        view.setTag(-33024);
        return view;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new IntroActivity$$ExternalSyntheticLambda0(this, 16), Theme.key_premiumGradient1, Theme.key_premiumGradient2, Theme.key_premiumGradient3, Theme.key_premiumGradient4, Theme.key_premiumGradientBackground1, Theme.key_premiumGradientBackground2, Theme.key_premiumGradientBackground3, Theme.key_premiumGradientBackground4, Theme.key_premiumGradientBackgroundOverlay, Theme.key_premiumStarGradient1, Theme.key_premiumStarGradient2, Theme.key_premiumStartSmallStarsColor, Theme.key_premiumStartSmallStarsColor2);
    }

    @Override
    public boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public boolean isLightStatusBar() {
        return this.whiteBackground && !Theme.currentTheme.isDark();
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        updateDialogVisibility(false);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
    }

    @Override
    public void onPause() {
        super.onPause();
        StarParticlesView starParticlesView = this.particlesView;
        if (starParticlesView != null) {
            starParticlesView.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.particlesView.setPaused(false);
    }

    public void saveScrollPosition() {
        View childAt;
        int childAdapterPosition;
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null || recyclerListView.getChildCount() <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.listView.getChildCount()) {
                childAt = null;
                childAdapterPosition = -1;
                break;
            }
            childAt = this.listView.getChildAt(i);
            childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= 0 && childAt.getTop() < Integer.MAX_VALUE) {
                childAt.getTop();
                break;
            }
            i++;
        }
        if (childAt != null) {
            this.savedScrollPosition = childAdapterPosition;
            this.savedScrollOffset = childAt.getTop();
        }
    }

    public Paint setDarkGradientLocation(float f, float f2) {
        this.darkGradientTools.gradientMatrix(0, 0, this.contentView.getMeasuredWidth(), this.contentView.getMeasuredHeight(), (-f) - ((this.contentView.getMeasuredWidth() * 0.1f) * this.progress), -f2);
        return this.darkGradientTools.paint;
    }

    public void setMinusHeaderHeight(int i) {
        this.minusHeaderHeight = i;
    }

    public void setWhiteBackground(boolean z) {
        this.whiteBackground = z;
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        Dialog dialogShowDialog = super.showDialog(dialog);
        updateDialogVisibility(dialogShowDialog != null);
        return dialogShowDialog;
    }

    public void updateDialogVisibility(boolean z) {
        if (z != this.isDialogVisible) {
            this.isDialogVisible = z;
            this.particlesView.setPaused(z);
            this.contentView.invalidate();
        }
    }

    public void applyScrolledPosition(boolean z) {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null || this.layoutManager == null || this.savedScrollPosition < 0) {
            return;
        }
        int iMax = this.savedScrollOffset;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerListView.findViewHolderForAdapterPosition(0);
        if (z && viewHolderFindViewHolderForAdapterPosition != null) {
            iMax -= Math.max(viewHolderFindViewHolderForAdapterPosition.itemView.getBottom() - this.listView.getPaddingTop(), 0);
        }
        this.layoutManager.scrollToPositionWithOffset(this.savedScrollPosition, iMax);
        this.savedScrollPosition = -1;
    }
}
