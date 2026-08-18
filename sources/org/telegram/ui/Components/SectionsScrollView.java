package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.FiltersSetupActivity;

public class SectionsScrollView extends ScrollView {
    private ArrayList children;
    private final Path clipPath;
    private LinearLayout contentView;
    private ArrayList onScroll;
    private Theme.ResourcesProvider resourcesProvider;
    private float sectionRadius;
    private float[] sectionRadiusBottom;
    private float[] sectionRadiusTop;

    public static boolean isSectionView(View view) {
        return (Objects.equals(view.getTag(), -33024) || (view instanceof TextInfoPrivacyCell) || (view instanceof ShadowSectionCell) || (view instanceof FiltersSetupActivity.HintInnerCell)) ? false : true;
    }

    public SectionsScrollView(Context context, LinearLayout linearLayout, Theme.ResourcesProvider resourcesProvider) {
        this(context, linearLayout, resourcesProvider, true);
    }

    public SectionsScrollView(Context context, LinearLayout linearLayout, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        this.sectionRadius = AndroidUtilities.dp(16.0f);
        this.onScroll = new ArrayList();
        this.children = new ArrayList();
        this.clipPath = new Path();
        this.resourcesProvider = resourcesProvider;
        this.contentView = linearLayout;
        setWillNotDraw(false);
        this.contentView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z ? 12.0f : 4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.sectionRadiusTop = new float[]{AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0.0f, 0.0f, 0.0f, 0.0f};
        this.sectionRadiusBottom = new float[]{0.0f, 0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f)};
    }

    public void onScroll(Runnable runnable) {
        this.onScroll.add(runnable);
    }

    @Override
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Iterator it = this.onScroll.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        invalidate();
        this.contentView.invalidate();
    }

    private void gatherChildren(ViewGroup viewGroup, float f, float f2) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    if (linearLayout.getOrientation() == 1 && childAt.getX() + f <= this.contentView.getPaddingLeft() && childAt.getX() + f + childAt.getWidth() >= this.contentView.getWidth() - this.contentView.getPaddingRight()) {
                        gatherChildren(linearLayout, childAt.getX() + f, childAt.getY() + f2);
                    } else {
                        this.children.add(childAt);
                    }
                } else {
                    this.children.add(childAt);
                }
            }
        }
    }

    private float getChildX(View view) {
        if (view == this.contentView || !(view.getParent() instanceof View)) {
            return view.getX();
        }
        return getChildX((View) view.getParent()) + view.getX();
    }

    private float getChildY(View view) {
        if (view == this.contentView || !(view.getParent() instanceof View)) {
            return view.getY();
        }
        return getChildY((View) view.getParent()) + view.getY();
    }

    private void drawSectionsBackgrounds(Canvas canvas) {
        this.children.clear();
        gatherChildren(this.contentView, 0.0f, 0.0f);
        Iterator it = this.children.iterator();
        while (true) {
            View view = null;
            View view2 = null;
            while (true) {
                if (it.hasNext()) {
                    View view3 = (View) it.next();
                    if (!isSectionView(view3)) {
                        break;
                    }
                    if (view != null && Math.abs(view2.getAlpha() - view3.getAlpha()) > 0.1f) {
                        drawSectionBackground(canvas, view, view2);
                        view = null;
                    }
                    if (view == null) {
                        view = view3;
                    }
                    view2 = view3;
                } else {
                    drawSectionBackground(canvas, view, view2);
                    return;
                }
            }
            drawSectionBackground(canvas, view, view2);
        }
    }

    private void drawSectionBackground(Canvas canvas, View view, View view2) {
        if (view == null || view2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        float f = 0.0f;
        float f2 = (view.getParent() == this.contentView || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) ? 0.0f : ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        ViewParent parent = view2.getParent();
        LinearLayout linearLayout = this.contentView;
        if (parent != linearLayout && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            f = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(linearLayout.getX() + getChildX(view), Math.max(getScrollY() - AndroidUtilities.dp(16.0f), (this.contentView.getY() + getChildY(view)) - f2), this.contentView.getX() + getChildX(view) + view.getWidth(), Math.min(getHeight() + AndroidUtilities.dp(16.0f) + getScrollY(), this.contentView.getY() + getChildY(view2) + view2.getHeight() + f));
        if (rectF.bottom < rectF.top) {
            return;
        }
        RecyclerListView.drawBackgroundRect(canvas, rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), view.getAlpha(), this.resourcesProvider);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        drawSectionsBackgrounds(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void clipChild(Canvas canvas, View view) {
        if (view == null || !isSectionView(view)) {
            return;
        }
        int iIndexOfChild = this.contentView.indexOfChild(view);
        int i = iIndexOfChild - 1;
        View childAt = i < 0 ? null : this.contentView.getChildAt(i);
        int i2 = iIndexOfChild + 1;
        View childAt2 = i2 < this.contentView.getChildCount() ? this.contentView.getChildAt(i2) : null;
        boolean z = childAt != null && isSectionView(childAt);
        boolean z2 = childAt2 != null && isSectionView(childAt2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getX(), Math.max(getScrollY() - AndroidUtilities.dp(16.0f), this.contentView.getY() + view.getY()), view.getX() + view.getWidth(), Math.min(getHeight() + getScrollY() + AndroidUtilities.dp(16.0f), this.contentView.getY() + view.getY() + view.getHeight()));
        if (z && z2) {
            z = view.getY() >= rectF.top;
            boolean z3 = view.getY() + ((float) view.getHeight()) <= rectF.bottom;
            if (z && z3) {
                return;
            } else {
                z2 = z3;
            }
        }
        if (!z && !z2) {
            this.clipPath.rewind();
            Path path = this.clipPath;
            float f = this.sectionRadius;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            return;
        }
        if (!z) {
            this.clipPath.rewind();
            this.clipPath.addRoundRect(rectF, this.sectionRadiusTop, Path.Direction.CW);
            canvas.clipPath(this.clipPath);
        } else {
            if (z2) {
                return;
            }
            this.clipPath.rewind();
            this.clipPath.addRoundRect(rectF, this.sectionRadiusBottom, Path.Direction.CW);
            canvas.clipPath(this.clipPath);
        }
    }

    public static class SectionsLinearLayout extends LinearLayout {
        public SectionsLinearLayout(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (getParent() instanceof SectionsScrollView) {
                SectionsScrollView sectionsScrollView = (SectionsScrollView) getParent();
                canvas.save();
                sectionsScrollView.clipChild(canvas, view);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (getParent() instanceof SectionsScrollView) {
                ((SectionsScrollView) getParent()).invalidate();
            }
        }
    }
}
