package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FillLastLinearLayoutManager;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.NestedSizeNotifierLayout;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.RecyclerListView$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.UniversalAdapter;
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

    protected abstract RecyclerView.Adapter createAdapter();

    protected boolean drawActionBarShadow() {
        return true;
    }

    @Override
    public boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public GradientHeaderActivity() {
        int i = Theme.key_premiumGradientBackground1;
        int i2 = Theme.key_premiumGradientBackground2;
        int i3 = Theme.key_premiumGradientBackground3;
        int i4 = Theme.key_premiumGradientBackground4;
        this.gradientTools = new PremiumGradient.PremiumGradientTools(i, i2, i3, i4) {
            @Override
            protected int getThemeColorByKey(int i5) {
                return Theme.getDefaultColor(i5);
            }
        };
        PremiumGradient.PremiumGradientTools premiumGradientTools = new PremiumGradient.PremiumGradientTools(i, i2, i3, i4) {
            @Override
            protected int getThemeColorByKey(int i5) {
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

    static int access$024(GradientHeaderActivity gradientHeaderActivity, float f) {
        int i = (int) (gradientHeaderActivity.firstViewHeight - f);
        gradientHeaderActivity.firstViewHeight = i;
        return i;
    }

    static float access$1316(GradientHeaderActivity gradientHeaderActivity, float f) {
        float f2 = gradientHeaderActivity.progress + f;
        gradientHeaderActivity.progress = f2;
        return f2;
    }

    static float access$1324(GradientHeaderActivity gradientHeaderActivity, float f) {
        float f2 = gradientHeaderActivity.progress - f;
        gradientHeaderActivity.progress = f2;
        return f2;
    }

    public void setMinusHeaderHeight(int i) {
        this.minusHeaderHeight = i;
    }

    public void setWhiteBackground(boolean z) {
        this.whiteBackground = z;
    }

    protected void configureHeader(CharSequence charSequence, CharSequence charSequence2, View view, View view2) {
        this.backgroundView.setData(charSequence, charSequence2, view, view2);
    }

    protected View getHeader(Context context) {
        View view = new View(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                GradientHeaderActivity gradientHeaderActivity = GradientHeaderActivity.this;
                if (gradientHeaderActivity.isLandscapeMode) {
                    gradientHeaderActivity.firstViewHeight = (gradientHeaderActivity.statusBarHeight + ((BaseFragment) gradientHeaderActivity).actionBar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f);
                } else {
                    int iDp = AndroidUtilities.dp(140.0f);
                    GradientHeaderActivity gradientHeaderActivity2 = GradientHeaderActivity.this;
                    int iMax = iDp + gradientHeaderActivity2.statusBarHeight;
                    if (gradientHeaderActivity2.backgroundView.getMeasuredHeight() + AndroidUtilities.dp(24.0f) > iMax) {
                        iMax = Math.max(iMax, (GradientHeaderActivity.this.backgroundView.getMeasuredHeight() + AndroidUtilities.dp(24.0f)) - GradientHeaderActivity.this.minusHeaderHeight);
                    }
                    GradientHeaderActivity.this.firstViewHeight = iMax;
                }
                GradientHeaderActivity.access$024(GradientHeaderActivity.this, r5.yOffset * 2.5f);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(GradientHeaderActivity.this.firstViewHeight, 1073741824));
            }
        };
        view.setTag(-33024);
        return view;
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
    }

    @Override
    public View createView(Context context) {
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable drawableMutate = ContextCompat.getDrawable(context, R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogBackground), PorterDuff.Mode.MULTIPLY));
        this.shadowDrawable.getPadding(rect);
        this.statusBarHeight = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
        this.contentView = createContentView();
        this.actionBar.setAddToContainer(false);
        this.listView = new RecyclerListView(context);
        if (this.useFillLastLayoutManager) {
            this.layoutManager = new FillLastLinearLayoutManager(context, (AndroidUtilities.dp(68.0f) + this.statusBarHeight) - AndroidUtilities.dp(16.0f), this.listView);
        } else {
            this.layoutManager = new LinearLayoutManager(context);
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
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    return this.f$0.lambda$createView$0((View) obj);
                }
            };
            int iDp = AndroidUtilities.dp(12.0f);
            float fDp = AndroidUtilities.dp(16.0f);
            RecyclerListView recyclerListView2 = this.listView;
            Objects.requireNonNull(recyclerListView2);
            recyclerListView.setSections(callbackReturn, iDp, fDp, new RecyclerListView$$ExternalSyntheticLambda1(recyclerListView2), true);
        } else {
            this.listView.setSections(true);
        }
        this.listView.setClipToPadding(false);
        this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    int bottom = ((BaseFragment) GradientHeaderActivity.this).actionBar.getBottom() + AndroidUtilities.dp(16.0f);
                    if (GradientHeaderActivity.this.totalProgress > 0.5f) {
                        GradientHeaderActivity gradientHeaderActivity = GradientHeaderActivity.this;
                        gradientHeaderActivity.listView.smoothScrollBy(0, gradientHeaderActivity.currentYOffset - bottom);
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

    public Boolean lambda$createView$0(View view) {
        return view.getParent() != this.listView ? Boolean.FALSE : Boolean.valueOf(!UniversalAdapter.isShadow(r1.getChildViewHolder(view).getItemViewType()));
    }

    protected ContentView createContentView() {
        return new ContentView(getContext());
    }

    public class ContentView extends NestedSizeNotifierLayout {
        private final Paint backgroundGradientPaint;
        private final Paint backgroundPaint;
        boolean bottomInterceptedTouch;
        int lastSize;
        private Boolean lightStatusBar;
        boolean subtitleInterceptedTouch;
        boolean topInterceptedTouch;

        public ContentView(Context context) {
            super(context);
            this.backgroundPaint = new Paint(1);
            this.backgroundGradientPaint = new Paint(1);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            GradientHeaderActivity gradientHeaderActivity = GradientHeaderActivity.this;
            BackgroundView backgroundView = gradientHeaderActivity.backgroundView;
            gradientHeaderActivity.isLandscapeMode = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
            GradientHeaderActivity.this.statusBarHeight = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
            backgroundView.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            ViewGroup.LayoutParams layoutParams = GradientHeaderActivity.this.particlesView.getLayoutParams();
            int measuredHeight = GradientHeaderActivity.this.particlesViewHeight;
            if (measuredHeight <= 0) {
                measuredHeight = backgroundView.getMeasuredHeight();
            }
            layoutParams.height = measuredHeight;
            GradientHeaderActivity gradientHeaderActivity2 = GradientHeaderActivity.this;
            LinearLayoutManager linearLayoutManager = gradientHeaderActivity2.layoutManager;
            if (linearLayoutManager instanceof FillLastLinearLayoutManager) {
                ((FillLastLinearLayoutManager) linearLayoutManager).setAdditionalHeight(((BaseFragment) gradientHeaderActivity2).actionBar.getMeasuredHeight());
                ((FillLastLinearLayoutManager) GradientHeaderActivity.this.layoutManager).setMinimumLastViewHeight(0);
            }
            super.onMeasure(i, i2);
            if (this.lastSize != ((getMeasuredHeight() + getMeasuredWidth()) << 16)) {
                GradientHeaderActivity.this.updateBackgroundImage();
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            BackgroundView backgroundView = GradientHeaderActivity.this.backgroundView;
            float x = backgroundView.getX() + backgroundView.subtitleView.getX();
            float y = backgroundView.getY() + backgroundView.subtitleView.getY();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x, y, backgroundView.subtitleView.getMeasuredWidth() + x, backgroundView.subtitleView.getMeasuredHeight() + y);
            if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.subtitleInterceptedTouch) && !GradientHeaderActivity.this.listView.scrollingByUser && backgroundView.subtitleView.hasLinks() && GradientHeaderActivity.this.progressToFull < 1.0f) {
                motionEvent.offsetLocation(-x, -y);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                    this.subtitleInterceptedTouch = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.subtitleInterceptedTouch = false;
                }
                backgroundView.subtitleView.dispatchTouchEvent(motionEvent);
                return true;
            }
            float x2 = backgroundView.getX() + backgroundView.aboveTitleLayout.getX();
            float y2 = backgroundView.getY() + backgroundView.aboveTitleLayout.getY();
            boolean zIsClickable = backgroundView.aboveTitleLayout.isClickable();
            rectF.set(x2, y2, backgroundView.aboveTitleLayout.getMeasuredWidth() + x2, backgroundView.aboveTitleLayout.getMeasuredHeight() + y2);
            if (rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.topInterceptedTouch) {
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
            float x3 = backgroundView.getX() + backgroundView.belowSubTitleLayout.getX();
            float y3 = backgroundView.getY() + backgroundView.belowSubTitleLayout.getY();
            rectF.set(x3, y3, backgroundView.belowSubTitleLayout.getMeasuredWidth() + x3, backgroundView.belowSubTitleLayout.getMeasuredHeight() + y3);
            if (rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.bottomInterceptedTouch) {
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
        protected void dispatchDraw(Canvas canvas) {
            GradientHeaderActivity gradientHeaderActivity = GradientHeaderActivity.this;
            BackgroundView backgroundView = gradientHeaderActivity.backgroundView;
            if (!gradientHeaderActivity.isDialogVisible) {
                if (GradientHeaderActivity.this.inc) {
                    GradientHeaderActivity.access$1316(GradientHeaderActivity.this, 0.016f);
                    if (GradientHeaderActivity.this.progress > 3.0f) {
                        GradientHeaderActivity.this.inc = false;
                    }
                } else {
                    GradientHeaderActivity.access$1324(GradientHeaderActivity.this, 0.016f);
                    if (GradientHeaderActivity.this.progress < 1.0f) {
                        GradientHeaderActivity.this.inc = true;
                    }
                }
            }
            View viewFindViewByPosition = GradientHeaderActivity.this.listView.getLayoutManager() != null ? GradientHeaderActivity.this.listView.getLayoutManager().findViewByPosition(0) : null;
            GradientHeaderActivity.this.currentYOffset = viewFindViewByPosition != null ? viewFindViewByPosition.getBottom() : 0;
            int bottom = ((BaseFragment) GradientHeaderActivity.this).actionBar.getBottom() + AndroidUtilities.dp(16.0f);
            GradientHeaderActivity.this.totalProgress = 1.0f - ((r4.currentYOffset - bottom) / (GradientHeaderActivity.this.firstViewHeight - bottom));
            GradientHeaderActivity gradientHeaderActivity2 = GradientHeaderActivity.this;
            gradientHeaderActivity2.totalProgress = Utilities.clamp(gradientHeaderActivity2.totalProgress, 1.0f, 0.0f);
            int bottom2 = ((BaseFragment) GradientHeaderActivity.this).actionBar.getBottom() + AndroidUtilities.dp(16.0f);
            if (GradientHeaderActivity.this.currentYOffset < bottom2) {
                GradientHeaderActivity.this.currentYOffset = bottom2;
            }
            float f = GradientHeaderActivity.this.progressToFull;
            GradientHeaderActivity.this.progressToFull = 0.0f;
            if (GradientHeaderActivity.this.currentYOffset < AndroidUtilities.dp(30.0f) + bottom2) {
                GradientHeaderActivity.this.progressToFull = ((bottom2 + AndroidUtilities.dp(30.0f)) - GradientHeaderActivity.this.currentYOffset) / AndroidUtilities.dp(30.0f);
            }
            GradientHeaderActivity gradientHeaderActivity3 = GradientHeaderActivity.this;
            if (gradientHeaderActivity3.isLandscapeMode) {
                gradientHeaderActivity3.progressToFull = 1.0f;
                GradientHeaderActivity.this.totalProgress = 1.0f;
            }
            if (f != GradientHeaderActivity.this.progressToFull) {
                GradientHeaderActivity.this.listView.invalidate();
            }
            float fMax = Math.max((((((((BaseFragment) GradientHeaderActivity.this).actionBar.getMeasuredHeight() - GradientHeaderActivity.this.statusBarHeight) - backgroundView.titleView.getMeasuredHeight()) / 2.0f) + GradientHeaderActivity.this.statusBarHeight) - backgroundView.getTop()) - backgroundView.titleView.getTop(), (GradientHeaderActivity.this.currentYOffset - ((((BaseFragment) GradientHeaderActivity.this).actionBar.getMeasuredHeight() + backgroundView.getMeasuredHeight()) - GradientHeaderActivity.this.statusBarHeight)) + AndroidUtilities.dp(16.0f));
            backgroundView.setTranslationY(fMax);
            backgroundView.aboveTitleLayout.setTranslationY(((-fMax) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
            float f2 = ((1.0f - GradientHeaderActivity.this.totalProgress) * 0.4f) + 0.6f;
            float f3 = 1.0f - (GradientHeaderActivity.this.totalProgress > 0.5f ? (GradientHeaderActivity.this.totalProgress - 0.5f) / 0.5f : 0.0f);
            backgroundView.aboveTitleLayout.setScaleX(f2);
            backgroundView.aboveTitleLayout.setScaleY(f2);
            backgroundView.aboveTitleLayout.setAlpha(f3);
            backgroundView.belowSubTitleLayout.setAlpha(f3);
            backgroundView.subtitleView.setAlpha(f3);
            GradientHeaderActivity gradientHeaderActivity4 = GradientHeaderActivity.this;
            gradientHeaderActivity4.particlesView.setAlpha(1.0f - gradientHeaderActivity4.totalProgress);
            GradientHeaderActivity.this.particlesView.setTranslationY((backgroundView.getY() + backgroundView.aboveTitleLayout.getY()) - AndroidUtilities.dp(30.0f));
            backgroundView.titleView.setTranslationX((AndroidUtilities.dp(72.0f) - backgroundView.titleView.getLeft()) * (1.0f - CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(1.0f - (GradientHeaderActivity.this.totalProgress > 0.3f ? (GradientHeaderActivity.this.totalProgress - 0.3f) / 0.7f : 0.0f))));
            if (!GradientHeaderActivity.this.isDialogVisible) {
                invalidate();
            }
            GradientHeaderActivity.this.gradientTools.gradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), (-getMeasuredWidth()) * 0.1f * GradientHeaderActivity.this.progress, 0.0f);
            GradientHeaderActivity gradientHeaderActivity5 = GradientHeaderActivity.this;
            if (!gradientHeaderActivity5.whiteBackground) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), GradientHeaderActivity.this.gradientTools.paint);
            } else {
                this.backgroundGradientPaint.setColor(gradientHeaderActivity5.getThemedColor(Theme.key_windowBackgroundGray));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.backgroundGradientPaint);
            }
            int themedColor = GradientHeaderActivity.this.getThemedColor(Theme.key_dialogTextBlack);
            GradientHeaderActivity gradientHeaderActivity6 = GradientHeaderActivity.this;
            int iBlendARGB = ColorUtils.blendARGB(themedColor, gradientHeaderActivity6.getThemedColor(gradientHeaderActivity6.whiteBackground ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_premiumGradientBackgroundOverlay), f3);
            ((BaseFragment) GradientHeaderActivity.this).actionBar.getBackButton().setColorFilter(iBlendARGB);
            backgroundView.titleView.setTextColor(iBlendARGB);
            GradientHeaderActivity.this.headerBgPaint.setAlpha((int) ((1.0f - f3) * 255.0f));
            setLightStatusBar(Theme.blendOver(Theme.getColor(Theme.key_premiumGradientBackground4, ((BaseFragment) GradientHeaderActivity.this).resourceProvider), GradientHeaderActivity.this.headerBgPaint.getColor()));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ((BaseFragment) GradientHeaderActivity.this).actionBar.getMeasuredHeight(), GradientHeaderActivity.this.headerBgPaint);
            super.dispatchDraw(canvas);
            if (f3 > 0.01f || !GradientHeaderActivity.this.drawActionBarShadow()) {
                return;
            }
            ((BaseFragment) GradientHeaderActivity.this).parentLayout.drawHeaderShadow(canvas, 255, ((BaseFragment) GradientHeaderActivity.this).actionBar.getMeasuredHeight());
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
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == GradientHeaderActivity.this.listView) {
                canvas.save();
                canvas.clipRect(0, ((BaseFragment) GradientHeaderActivity.this).actionBar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
                super.drawChild(canvas, view, j);
                canvas.restore();
                return true;
            }
            return super.drawChild(canvas, view, j);
        }
    }

    public StarParticlesView createParticlesView() {
        return new StarParticlesView(getContext()) {
            @Override
            protected void configure() {
                StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(50) {
                    @Override
                    protected int getPathColor(int i) {
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
            protected int getStarsRectWidth() {
                return getMeasuredWidth();
            }
        };
    }

    public Paint setDarkGradientLocation(float f, float f2) {
        this.darkGradientTools.gradientMatrix(0, 0, this.contentView.getMeasuredWidth(), this.contentView.getMeasuredHeight(), (-f) - ((this.contentView.getMeasuredWidth() * 0.1f) * this.progress), -f2);
        return this.darkGradientTools.paint;
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

    @Override
    public Dialog showDialog(Dialog dialog) {
        Dialog dialogShowDialog = super.showDialog(dialog);
        updateDialogVisibility(dialogShowDialog != null);
        return dialogShowDialog;
    }

    @Override
    protected void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        updateDialogVisibility(false);
    }

    protected void updateDialogVisibility(boolean z) {
        if (z != this.isDialogVisible) {
            this.isDialogVisible = z;
            this.particlesView.setPaused(z);
            this.contentView.invalidate();
        }
    }

    public void updateColors() {
        if (this.backgroundView == null || this.actionBar == null) {
            return;
        }
        this.headerBgPaint.setColor(getThemedColor(Theme.key_dialogBackground));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_premiumGradientBackgroundOverlay;
        actionBar.setItemsColor(Theme.getColor(i), false);
        this.actionBar.setItemsBackgroundColor(ColorUtils.setAlphaComponent(Theme.getColor(i), 60), false);
        this.particlesView.drawable.updateColors();
        BackgroundView backgroundView = this.backgroundView;
        if (backgroundView != null) {
            if (this.whiteBackground) {
                TextView textView = backgroundView.titleView;
                int i2 = Theme.key_windowBackgroundWhiteBlackText;
                textView.setTextColor(Theme.getColor(i2));
                this.backgroundView.subtitleView.setTextColor(Theme.getColor(i2));
                this.backgroundView.subtitleView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn));
            } else {
                backgroundView.titleView.setTextColor(Theme.getColor(i));
                this.backgroundView.subtitleView.setTextColor(Theme.getColor(i));
                this.backgroundView.subtitleView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn));
            }
        }
        updateBackgroundImage();
    }

    @Override
    public ArrayList getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.updateColors();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        }, Theme.key_premiumGradient1, Theme.key_premiumGradient2, Theme.key_premiumGradient3, Theme.key_premiumGradient4, Theme.key_premiumGradientBackground1, Theme.key_premiumGradientBackground2, Theme.key_premiumGradientBackground3, Theme.key_premiumGradientBackground4, Theme.key_premiumGradientBackgroundOverlay, Theme.key_premiumStarGradient1, Theme.key_premiumStarGradient2, Theme.key_premiumStartSmallStarsColor, Theme.key_premiumStartSmallStarsColor2);
    }

    @Override
    public boolean isLightStatusBar() {
        return this.whiteBackground && !Theme.isCurrentThemeDark();
    }

    @Override
    public void onResume() {
        super.onResume();
        this.particlesView.setPaused(false);
    }

    @Override
    public void onPause() {
        super.onPause();
        StarParticlesView starParticlesView = this.particlesView;
        if (starParticlesView != null) {
            starParticlesView.setPaused(true);
        }
    }

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

    public void applyScrolledPosition() {
        applyScrolledPosition(false);
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
