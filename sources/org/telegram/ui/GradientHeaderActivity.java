package org.telegram.ui;

import android.app.Activity;
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
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
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
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FillLastLinearLayoutManager;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.NestedSizeNotifierLayout;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda9;

public abstract class GradientHeaderActivity extends BaseFragment {
    public AnonymousClass5 backgroundView;
    public ContentView contentView;
    public int currentYOffset;
    public final AnonymousClass1 darkGradientTools;
    public int firstViewHeight;
    public final Canvas gradientCanvas;
    public final AnonymousClass1 gradientTools;
    public final Paint headerBgPaint;
    public boolean inc;
    public boolean isDialogVisible;
    public boolean isLandscapeMode;
    public LinearLayoutManager layoutManager;
    public RecyclerListView listView;
    public int minusHeaderHeight;
    public StarParticlesView particlesView;
    public int particlesViewHeight;
    public float progress;
    public float progressToFull;
    public int savedScrollOffset;
    public int savedScrollPosition;
    public Drawable shadowDrawable;
    public int statusBarHeight;
    public float totalProgress;
    public boolean useFillLastLayoutManager;
    public boolean whiteBackground;

    public final class AnonymousClass7 extends StarParticlesView {

        public final class AnonymousClass1 extends StarParticlesView.Drawable {
            @Override
            public final int getPathColor() {
                return ColorUtils.setAlphaComponent(Theme.getDefaultColor(this.colorKey), 200);
            }
        }

        @Override
        public final void configure() {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(50);
            this.drawable = anonymousClass1;
            anonymousClass1.type = 100;
            anonymousClass1.roundEffect = false;
            anonymousClass1.useRotate = false;
            anonymousClass1.useBlur = true;
            anonymousClass1.checkBounds = true;
            anonymousClass1.isCircle = false;
            anonymousClass1.size1 = 4;
            anonymousClass1.k3 = 0.98f;
            anonymousClass1.k2 = 0.98f;
            anonymousClass1.k1 = 0.98f;
            anonymousClass1.init();
        }

        @Override
        public final int getStarsRectWidth() {
            return getMeasuredWidth();
        }
    }

    public class ContentView extends NestedSizeNotifierLayout {
        public final Paint backgroundGradientPaint;
        public boolean bottomInterceptedTouch;
        public boolean isTouchedActionBarBackButton;
        public Boolean lightStatusBar;
        public boolean subtitleInterceptedTouch;
        public boolean topInterceptedTouch;

        public ContentView(Activity activity) {
            super(activity);
            new Paint(1);
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
        public final void dispatchDraw(Canvas canvas) {
            GradientHeaderActivity gradientHeaderActivity = GradientHeaderActivity.this;
            AnonymousClass5 anonymousClass5 = gradientHeaderActivity.backgroundView;
            if (!gradientHeaderActivity.isDialogVisible) {
                if (gradientHeaderActivity.inc) {
                    float f = gradientHeaderActivity.progress + 0.016f;
                    gradientHeaderActivity.progress = f;
                    if (f > 3.0f) {
                        gradientHeaderActivity.inc = false;
                    }
                } else {
                    float f2 = gradientHeaderActivity.progress - 0.016f;
                    gradientHeaderActivity.progress = f2;
                    if (f2 < 1.0f) {
                        gradientHeaderActivity.inc = true;
                    }
                }
            }
            View viewFindViewByPosition = gradientHeaderActivity.listView.getLayoutManager() != null ? gradientHeaderActivity.listView.getLayoutManager().findViewByPosition(0) : null;
            gradientHeaderActivity.currentYOffset = viewFindViewByPosition != null ? viewFindViewByPosition.getBottom() : 0;
            int iDp = AndroidUtilities.dp(16.0f) + ((BaseFragment) gradientHeaderActivity).actionBar.getBottom();
            float f3 = 1.0f - ((gradientHeaderActivity.currentYOffset - iDp) / (gradientHeaderActivity.firstViewHeight - iDp));
            gradientHeaderActivity.totalProgress = f3;
            gradientHeaderActivity.totalProgress = Utilities.clamp(f3, 1.0f, 0.0f);
            int iDp2 = AndroidUtilities.dp(16.0f) + ((BaseFragment) gradientHeaderActivity).actionBar.getBottom();
            if (gradientHeaderActivity.currentYOffset < iDp2) {
                gradientHeaderActivity.currentYOffset = iDp2;
            }
            float f4 = gradientHeaderActivity.progressToFull;
            gradientHeaderActivity.progressToFull = 0.0f;
            if (gradientHeaderActivity.currentYOffset < AndroidUtilities.dp(30.0f) + iDp2) {
                gradientHeaderActivity.progressToFull = ((AndroidUtilities.dp(30.0f) + iDp2) - gradientHeaderActivity.currentYOffset) / AndroidUtilities.dp(30.0f);
            }
            if (gradientHeaderActivity.isLandscapeMode) {
                gradientHeaderActivity.progressToFull = 1.0f;
                gradientHeaderActivity.totalProgress = 1.0f;
            }
            if (f4 != gradientHeaderActivity.progressToFull) {
                gradientHeaderActivity.listView.invalidate();
            }
            float fDp = AndroidUtilities.dp(16.0f) + (gradientHeaderActivity.currentYOffset - ((anonymousClass5.getMeasuredHeight() + ((BaseFragment) gradientHeaderActivity).actionBar.getMeasuredHeight()) - gradientHeaderActivity.statusBarHeight));
            int measuredHeight = ((BaseFragment) gradientHeaderActivity).actionBar.getMeasuredHeight() - gradientHeaderActivity.statusBarHeight;
            TextView textView = (TextView) anonymousClass5.titleView;
            float fMax = Math.max(((((measuredHeight - textView.getMeasuredHeight()) / 2.0f) + gradientHeaderActivity.statusBarHeight) - anonymousClass5.getTop()) - textView.getTop(), fDp);
            float fDp2 = ((-fMax) / 4.0f) + AndroidUtilities.dp(16.0f);
            anonymousClass5.setTranslationY(fMax);
            FrameLayout frameLayout = (FrameLayout) anonymousClass5.aboveTitleLayout;
            frameLayout.setTranslationY(fDp2 + AndroidUtilities.dp(16.0f));
            float f5 = gradientHeaderActivity.totalProgress;
            float fM = DiffUtil.m(1.0f, f5, 0.4f, 0.6f);
            float f6 = 1.0f - (f5 > 0.5f ? (f5 - 0.5f) / 0.5f : 0.0f);
            frameLayout.setScaleX(fM);
            frameLayout.setScaleY(fM);
            frameLayout.setAlpha(f6);
            ((FrameLayout) anonymousClass5.belowSubTitleLayout).setAlpha(f6);
            ((LinkSpanDrawable.LinksTextView) anonymousClass5.subtitleView).setAlpha(f6);
            gradientHeaderActivity.particlesView.setAlpha(1.0f - gradientHeaderActivity.totalProgress);
            gradientHeaderActivity.particlesView.setTranslationY((frameLayout.getY() + anonymousClass5.getY()) - AndroidUtilities.dp(30.0f));
            float fDp3 = AndroidUtilities.dp(72.0f) - textView.getLeft();
            float f7 = gradientHeaderActivity.totalProgress;
            textView.setTranslationX((1.0f - CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(1.0f - (f7 > 0.3f ? (f7 - 0.3f) / 0.7f : 0.0f))) * fDp3);
            if (!gradientHeaderActivity.isDialogVisible) {
                invalidate();
            }
            gradientHeaderActivity.gradientTools.gradientMatrix(0, (-getMeasuredWidth()) * 0.1f * gradientHeaderActivity.progress, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
            if (gradientHeaderActivity.whiteBackground) {
                Paint paint = this.backgroundGradientPaint;
                paint.setColor(gradientHeaderActivity.getThemedColor(Theme.key_windowBackgroundGray));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), gradientHeaderActivity.gradientTools.paint);
            }
            int iBlendARGB = ColorUtils.blendARGB(f6, gradientHeaderActivity.getThemedColor(Theme.key_dialogTextBlack), gradientHeaderActivity.getThemedColor(gradientHeaderActivity.whiteBackground ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_premiumGradientBackgroundOverlay));
            ((BaseFragment) gradientHeaderActivity).actionBar.getBackButton().setColorFilter(iBlendARGB);
            textView.setTextColor(iBlendARGB);
            Paint paint2 = gradientHeaderActivity.headerBgPaint;
            paint2.setAlpha((int) ((1.0f - f6) * 255.0f));
            setLightStatusBar(Theme.blendOver(Theme.getColor(Theme.key_premiumGradientBackground4, ((BaseFragment) gradientHeaderActivity).resourceProvider), paint2.getColor()));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ((BaseFragment) gradientHeaderActivity).actionBar.getMeasuredHeight(), paint2);
            super.dispatchDraw(canvas);
            if (f6 > 0.01f || !gradientHeaderActivity.drawActionBarShadow()) {
                return;
            }
            ((ActionBarLayout) ((BaseFragment) gradientHeaderActivity).parentLayout).drawHeaderShadow(canvas, 255, ((BaseFragment) gradientHeaderActivity).actionBar.getMeasuredHeight());
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            Layout layout;
            ImageView backButton;
            GradientHeaderActivity gradientHeaderActivity = GradientHeaderActivity.this;
            if (((BaseFragment) gradientHeaderActivity).actionBar != null && (backButton = ((BaseFragment) gradientHeaderActivity).actionBar.getBackButton()) != null && backButton.getVisibility() == 0) {
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
            AnonymousClass5 anonymousClass5 = gradientHeaderActivity.backgroundView;
            float x = anonymousClass5.getX();
            LinkSpanDrawable.LinksTextView linksTextView = (LinkSpanDrawable.LinksTextView) anonymousClass5.subtitleView;
            float x2 = linksTextView.getX() + x;
            float y = linksTextView.getY() + anonymousClass5.getY();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(x2, y, linksTextView.getMeasuredWidth() + x2, linksTextView.getMeasuredHeight() + y);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.subtitleInterceptedTouch) && !gradientHeaderActivity.listView.scrollingByUser && (layout = linksTextView.getLayout()) != null) {
                CharSequence text = layout.getText();
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0 && gradientHeaderActivity.progressToFull < 1.0f) {
                        motionEvent.offsetLocation(-x2, -y);
                        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                            this.subtitleInterceptedTouch = true;
                        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            this.subtitleInterceptedTouch = false;
                        }
                        linksTextView.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                }
            }
            float x3 = anonymousClass5.getX();
            FrameLayout frameLayout = (FrameLayout) anonymousClass5.aboveTitleLayout;
            float x4 = frameLayout.getX() + x3;
            float y2 = frameLayout.getY() + anonymousClass5.getY();
            boolean zIsClickable = frameLayout.isClickable();
            rectF2.set(x4, y2, frameLayout.getMeasuredWidth() + x4, frameLayout.getMeasuredHeight() + y2);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.topInterceptedTouch) && !gradientHeaderActivity.listView.scrollingByUser && zIsClickable && gradientHeaderActivity.progressToFull < 1.0f) {
                motionEvent.offsetLocation(-x4, -y2);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                    this.topInterceptedTouch = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.topInterceptedTouch = false;
                }
                frameLayout.dispatchTouchEvent(motionEvent);
                return true;
            }
            float x5 = anonymousClass5.getX();
            FrameLayout frameLayout2 = (FrameLayout) anonymousClass5.belowSubTitleLayout;
            float x6 = frameLayout2.getX() + x5;
            float y3 = frameLayout2.getY() + anonymousClass5.getY();
            rectF2.set(x6, y3, frameLayout2.getMeasuredWidth() + x6, frameLayout2.getMeasuredHeight() + y3);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.bottomInterceptedTouch) && !gradientHeaderActivity.listView.scrollingByUser && gradientHeaderActivity.progressToFull < 1.0f) {
                motionEvent.offsetLocation(-x6, -y3);
                if (motionEvent.getAction() == 0) {
                    this.bottomInterceptedTouch = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.bottomInterceptedTouch = false;
                }
                frameLayout2.dispatchTouchEvent(motionEvent);
                if (this.bottomInterceptedTouch) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            GradientHeaderActivity gradientHeaderActivity = GradientHeaderActivity.this;
            if (view != gradientHeaderActivity.listView) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            canvas.clipRect(0, ((BaseFragment) gradientHeaderActivity).actionBar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j);
            canvas.restore();
            return true;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            GradientHeaderActivity gradientHeaderActivity = GradientHeaderActivity.this;
            AnonymousClass5 anonymousClass5 = gradientHeaderActivity.backgroundView;
            gradientHeaderActivity.isLandscapeMode = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
            gradientHeaderActivity.statusBarHeight = (((BaseFragment) gradientHeaderActivity).parentLayout == null || !((ActionBarLayout) ((BaseFragment) gradientHeaderActivity).parentLayout).isLayersLayout) ? AndroidUtilities.statusBarHeight : 0;
            anonymousClass5.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            ViewGroup.LayoutParams layoutParams = gradientHeaderActivity.particlesView.getLayoutParams();
            int measuredHeight = gradientHeaderActivity.particlesViewHeight;
            if (measuredHeight <= 0) {
                measuredHeight = anonymousClass5.getMeasuredHeight();
            }
            layoutParams.height = measuredHeight;
            LinearLayoutManager linearLayoutManager = gradientHeaderActivity.layoutManager;
            if (linearLayoutManager instanceof FillLastLinearLayoutManager) {
                FillLastLinearLayoutManager fillLastLinearLayoutManager = (FillLastLinearLayoutManager) linearLayoutManager;
                fillLastLinearLayoutManager.additionalHeight = ((BaseFragment) gradientHeaderActivity).actionBar.getMeasuredHeight();
                fillLastLinearLayoutManager.calcLastItemHeight$1();
                ((FillLastLinearLayoutManager) gradientHeaderActivity.layoutManager).minimumHeight = 0;
            }
            super.onMeasure(i, i2);
            if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
                gradientHeaderActivity.updateBackgroundImage$1();
            }
        }
    }

    public GradientHeaderActivity() {
        super(null);
        int i = Theme.key_premiumGradientBackground1;
        int i2 = Theme.key_premiumGradientBackground2;
        int i3 = Theme.key_premiumGradientBackground3;
        int i4 = Theme.key_premiumGradientBackground4;
        final int i5 = 0;
        this.gradientTools = new PremiumGradient.PremiumGradientTools(i, i2, i3, i4, null) {
            @Override
            public final int getThemeColorByKey(int i6) {
                switch (i5) {
                    case 0:
                        break;
                }
                return Theme.getDefaultColor(i6);
            }
        };
        final int i6 = 1;
        ?? r2 = new PremiumGradient.PremiumGradientTools(i, i2, i3, i4, null) {
            @Override
            public final int getThemeColorByKey(int i7) {
                switch (i6) {
                    case 0:
                        break;
                }
                return Theme.getDefaultColor(i7);
            }
        };
        this.darkGradientTools = r2;
        this.gradientCanvas = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.particlesViewHeight = -1;
        this.useFillLastLayoutManager = true;
        this.headerBgPaint = new Paint();
        r2.darkColors = true;
        this.savedScrollPosition = -1;
    }

    public final void applyScrolledPosition() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null || this.layoutManager == null || this.savedScrollPosition < 0) {
            return;
        }
        int i = this.savedScrollOffset;
        recyclerListView.findViewHolderForAdapterPosition(0);
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        linearLayoutManager.scrollToPositionWithOffset(this.savedScrollPosition, i, linearLayoutManager.mShouldReverseLayout);
        this.savedScrollPosition = -1;
    }

    public final void configureHeader(String str, CharSequence charSequence, FrameLayout frameLayout, BoostsActivity.AnonymousClass5 anonymousClass5) {
        AnonymousClass5 anonymousClass6 = this.backgroundView;
        ((TextView) anonymousClass6.titleView).setText(str);
        LinkSpanDrawable.LinksTextView linksTextView = (LinkSpanDrawable.LinksTextView) anonymousClass6.subtitleView;
        linksTextView.setText(charSequence);
        linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), linksTextView.getPaint()));
        FrameLayout frameLayout2 = (FrameLayout) anonymousClass6.aboveTitleLayout;
        if (frameLayout != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            frameLayout2.setClickable(frameLayout.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        FrameLayout frameLayout3 = (FrameLayout) anonymousClass6.belowSubTitleLayout;
        if (anonymousClass5 != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(anonymousClass5, LayoutHelper.createFrame(-1, -2, 1));
            frameLayout3.setClickable(anonymousClass5.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        anonymousClass6.requestLayout();
    }

    public abstract RecyclerView.Adapter createAdapter();

    public ContentView createContentView() {
        return new ContentView(getParentActivity());
    }

    public StarParticlesView createParticlesView() {
        return new AnonymousClass7(getParentActivity());
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
        this.listView = new RecyclerListView(context, null);
        if (this.useFillLastLayoutManager) {
            this.layoutManager = new FillLastLinearLayoutManager(this.listView, (AndroidUtilities.dp(68.0f) + this.statusBarHeight) - AndroidUtilities.dp(16.0f));
        } else {
            this.layoutManager = new LinearLayoutManager(1, false);
        }
        this.listView.setLayoutManager(this.layoutManager);
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        if (linearLayoutManager instanceof FillLastLinearLayoutManager) {
            ((FillLastLinearLayoutManager) linearLayoutManager).fixedLastItemHeight = true;
        }
        RecyclerView.Adapter adapterCreateAdapter = createAdapter();
        this.listView.setAdapter(adapterCreateAdapter);
        if (adapterCreateAdapter instanceof UniversalAdapter) {
            RecyclerListView recyclerListView = this.listView;
            WebActionBar$$ExternalSyntheticLambda9 webActionBar$$ExternalSyntheticLambda9 = new WebActionBar$$ExternalSyntheticLambda9(this, 7);
            int iDp = AndroidUtilities.dp(12.0f);
            float fDp = AndroidUtilities.dp(16.0f);
            RecyclerListView recyclerListView2 = this.listView;
            Objects.requireNonNull(recyclerListView2);
            GradientHeaderActivity$$ExternalSyntheticLambda2 gradientHeaderActivity$$ExternalSyntheticLambda2 = new GradientHeaderActivity$$ExternalSyntheticLambda2(recyclerListView2, 0);
            recyclerListView.getClass();
            SparseIntArray sparseIntArray = new SparseIntArray();
            Pair pair = new Pair(new StakedDiceSheet$$ExternalSyntheticLambda6(recyclerListView, webActionBar$$ExternalSyntheticLambda9, sparseIntArray, 3), new WebActionBar$$ExternalSyntheticLambda9(sparseIntArray, 5));
            recyclerListView.setSections((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, iDp, fDp, gradientHeaderActivity$$ExternalSyntheticLambda2, true);
        } else {
            this.listView.setSections(true);
        }
        this.listView.setClipToPadding(false);
        this.listView.addOnScrollListener(new LocationActivity.AnonymousClass10(this, 20));
        this.backgroundView = new AnonymousClass5(context);
        ContentView contentView = this.contentView;
        StarParticlesView starParticlesViewCreateParticlesView = createParticlesView();
        this.particlesView = starParticlesViewCreateParticlesView;
        contentView.addView(starParticlesViewCreateParticlesView, LayoutHelper.createFrame(-2.0f, -1));
        this.contentView.addView(this.backgroundView, LayoutHelper.createFrame(-2.0f, -1));
        this.contentView.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.contentView.addView(this.actionBar);
        this.fragmentView = this.contentView;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 20));
        this.actionBar.setForceSkipTouches(true);
        updateColors$13();
        return this.fragmentView;
    }

    public boolean drawActionBarShadow() {
        return true;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new ChatActivity$$ExternalSyntheticLambda94(this, 27), Theme.key_premiumGradient1, Theme.key_premiumGradient2, Theme.key_premiumGradient3, Theme.key_premiumGradient4, Theme.key_premiumGradientBackground1, Theme.key_premiumGradientBackground2, Theme.key_premiumGradientBackground3, Theme.key_premiumGradientBackground4, Theme.key_premiumGradientBackgroundOverlay, Theme.key_premiumStarGradient1, Theme.key_premiumStarGradient2, Theme.key_premiumStartSmallStarsColor, Theme.key_premiumStartSmallStarsColor2);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.whiteBackground && !Theme.currentTheme.isDark();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        if (this.isDialogVisible) {
            this.isDialogVisible = false;
            this.particlesView.setPaused(false);
            this.contentView.invalidate();
        }
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

    public final void saveScrollPosition$2() {
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
            this.listView.getClass();
            childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
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

    public final Paint setDarkGradientLocation(float f, float f2) {
        gradientMatrix(0, (-f) - ((this.contentView.getMeasuredWidth() * 0.1f) * this.progress), 0, this.contentView.getMeasuredWidth(), -f2, this.contentView.getMeasuredHeight());
        return this.darkGradientTools.paint;
    }

    @Override
    public final Dialog showDialog(Dialog dialog) {
        Dialog dialogShowDialog = super.showDialog(dialog);
        boolean z = dialogShowDialog != null;
        if (z != this.isDialogVisible) {
            this.isDialogVisible = z;
            this.particlesView.setPaused(z);
            this.contentView.invalidate();
        }
        return dialogShowDialog;
    }

    public final void updateBackgroundImage$1() {
        if (this.contentView.getMeasuredWidth() == 0 || this.contentView.getMeasuredHeight() == 0 || this.backgroundView == null) {
            return;
        }
        gradientMatrix(0, 0.0f, 0, this.contentView.getMeasuredWidth(), 0.0f, this.contentView.getMeasuredHeight());
        Canvas canvas = this.gradientCanvas;
        canvas.save();
        canvas.scale(100.0f / this.contentView.getMeasuredWidth(), 100.0f / this.contentView.getMeasuredHeight());
        canvas.drawRect(0.0f, 0.0f, this.contentView.getMeasuredWidth(), this.contentView.getMeasuredHeight(), this.gradientTools.paint);
        canvas.restore();
    }

    public final void updateColors$13() {
        if (this.backgroundView == null || this.actionBar == null) {
            return;
        }
        this.headerBgPaint.setColor(getThemedColor(Theme.key_dialogBackground));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_premiumGradientBackgroundOverlay;
        actionBar.setItemsColor(Theme.getColor(null, i, false), false);
        this.actionBar.setItemsBackgroundColor(ColorUtils.setAlphaComponent(Theme.getColor(null, i, false), 60), false);
        StarParticlesView.Drawable drawable = this.particlesView.drawable;
        int color = Theme.getColor(drawable.colorKey, drawable.resourcesProvider);
        if (drawable.lastColor != color) {
            drawable.lastColor = color;
            drawable.generateBitmaps();
        }
        AnonymousClass5 anonymousClass5 = this.backgroundView;
        if (anonymousClass5 != null) {
            boolean z = this.whiteBackground;
            TextView textView = (TextView) anonymousClass5.titleView;
            if (z) {
                int i2 = Theme.key_windowBackgroundWhiteBlackText;
                textView.setTextColor(Theme.getColor(null, i2, false));
                ((LinkSpanDrawable.LinksTextView) this.backgroundView.subtitleView).setTextColor(Theme.getColor(null, i2, false));
                ((LinkSpanDrawable.LinksTextView) this.backgroundView.subtitleView).setLinkTextColor(Theme.getColor(null, Theme.key_chat_messageLinkIn, false));
            } else {
                textView.setTextColor(Theme.getColor(null, i, false));
                ((LinkSpanDrawable.LinksTextView) this.backgroundView.subtitleView).setTextColor(Theme.getColor(null, i, false));
                ((LinkSpanDrawable.LinksTextView) this.backgroundView.subtitleView).setLinkTextColor(Theme.getColor(null, Theme.key_chat_messageLinkIn, false));
            }
        }
        updateBackgroundImage$1();
    }

    public final class AnonymousClass5 extends LinearLayout {
        public final int $r8$classId = 0;
        public final Object aboveTitleLayout;
        public final Object belowSubTitleLayout;
        public final View subtitleView;
        public final Object titleView;

        public AnonymousClass5(Context context) {
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
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
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

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 1:
                    super.dispatchDraw(canvas);
                    Paint paint = (Paint) this.aboveTitleLayout;
                    paint.setColor(Theme.getColor(Theme.key_windowBackgroundGray, (Theme.ResourcesProvider) this.titleView));
                    AnimatedFloat animatedFloat = (AnimatedFloat) this.belowSubTitleLayout;
                    RecyclerListView recyclerListView = (RecyclerListView) this.subtitleView;
                    if (recyclerListView != null) {
                        paint.setAlpha((int) (animatedFloat.set(recyclerListView.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
                    } else {
                        paint.setAlpha((int) (animatedFloat.set(1.0f, false) * 255.0f));
                    }
                    canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        public AnonymousClass5(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            StarsIntroActivity.AnonymousClass4 anonymousClass4 = new StarsIntroActivity.AnonymousClass4(context, 70, 0);
            frameLayout.addView(anonymousClass4, LayoutHelper.createFrame(-1.0f, -1));
            GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 2);
            this.subtitleView = gLIconTextureView;
            GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
            gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
            gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
            gLIconRenderer.updateColors();
            gLIconTextureView.setStarParticlesView(anonymousClass4);
            frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
            gLIconTextureView.setPaused(false);
            StarsIntroActivity.StarsBalanceView starsBalanceView = new StarsIntroActivity.StarsBalanceView(context, i, resourcesProvider);
            this.aboveTitleLayout = starsBalanceView;
            ScaleStateListAnimator.apply(starsBalanceView, 0.1f, 1.5f);
            starsBalanceView.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(this, 15));
            frameLayout.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, LayoutHelper.createFrame(150.0f, -1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            zzkk.m(20.0f, 1, textView);
            int i2 = Theme.key_dialogTextBlack;
            textView.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView.setGravity(17);
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 2, 0, 0));
            TextView textView2 = new TextView(context);
            this.belowSubTitleLayout = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView2.setGravity(17);
            addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 0, 9, 0, 18));
        }

        public AnonymousClass5(Context context, Theme.ResourcesProvider resourcesProvider, RecyclerListView recyclerListView) {
            super(context);
            this.aboveTitleLayout = new Paint(1);
            this.belowSubTitleLayout = new AnimatedFloat(this);
            this.titleView = resourcesProvider;
            this.subtitleView = recyclerListView;
        }
    }
}
