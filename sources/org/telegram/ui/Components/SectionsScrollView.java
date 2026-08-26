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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.GLIconSettingsView;

public class SectionsScrollView extends ScrollView {
    public static final int $r8$clinit = 0;
    public final ArrayList children;
    public final Path clipPath;
    public final GLIconSettingsView contentView;
    public final ArrayList onScroll;
    public final Theme.ResourcesProvider resourcesProvider;
    public final float sectionRadius;
    public final float[] sectionRadiusBottom;
    public final float[] sectionRadiusTop;

    public SectionsScrollView(Context context, GLIconSettingsView gLIconSettingsView, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        this.sectionRadius = AndroidUtilities.dp(16.0f);
        this.onScroll = new ArrayList();
        this.children = new ArrayList();
        this.clipPath = new Path();
        this.resourcesProvider = resourcesProvider;
        this.contentView = gLIconSettingsView;
        setWillNotDraw(false);
        gLIconSettingsView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z ? 12.0f : 4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.sectionRadiusTop = new float[]{AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0.0f, 0.0f, 0.0f, 0.0f};
        this.sectionRadiusBottom = new float[]{0.0f, 0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f)};
    }

    public static boolean isSectionView(View view) {
        return (Objects.equals(view.getTag(), -33024) || (view instanceof TextInfoPrivacyCell) || (view instanceof ShadowSectionCell) || (view instanceof FiltersSetupActivity.HintInnerCell)) ? false : true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.children;
        arrayList.clear();
        gatherChildren(this.contentView, 0.0f, 0.0f);
        int size = arrayList.size();
        int i = 0;
        while (true) {
            View view = null;
            View view2 = null;
            while (true) {
                if (i >= size) {
                    drawSectionBackground(canvas, view, view2);
                    super.dispatchDraw(canvas);
                    return;
                }
                Object obj = arrayList.get(i);
                i++;
                View view3 = (View) obj;
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
            }
            drawSectionBackground(canvas, view, view2);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void drawSectionBackground(Canvas canvas, View view, View view2) {
        if (view == null || view2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        ViewParent parent = view.getParent();
        float f = 0.0f;
        GLIconSettingsView gLIconSettingsView = this.contentView;
        float f2 = (parent == gLIconSettingsView || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) ? 0.0f : ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (view2.getParent() != gLIconSettingsView && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            f = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getChildX(view) + gLIconSettingsView.getX(), Math.max(getScrollY() - AndroidUtilities.dp(16.0f), (getChildY(view) + gLIconSettingsView.getY()) - f2), getChildX(view) + gLIconSettingsView.getX() + view.getWidth(), Math.min(getScrollY() + AndroidUtilities.dp(16.0f) + getHeight(), getChildY(view2) + gLIconSettingsView.getY() + view2.getHeight() + f));
        if (rectF.bottom < rectF.top) {
            return;
        }
        RecyclerListView.drawBackgroundRect(canvas, rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), view.getAlpha(), this.resourcesProvider);
    }

    public final void gatherChildren(LinearLayout linearLayout, float f, float f2) {
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof LinearLayout) {
                    LinearLayout linearLayout2 = (LinearLayout) childAt;
                    if (linearLayout2.getOrientation() == 1) {
                        float x = childAt.getX() + f;
                        GLIconSettingsView gLIconSettingsView = this.contentView;
                        if (x > gLIconSettingsView.getPaddingLeft() || childAt.getX() + f + childAt.getWidth() < gLIconSettingsView.getWidth() - gLIconSettingsView.getPaddingRight()) {
                            this.children.add(childAt);
                        } else {
                            gatherChildren(linearLayout2, childAt.getX() + f, childAt.getY() + f2);
                        }
                    } else {
                        this.children.add(childAt);
                    }
                } else {
                    this.children.add(childAt);
                }
            }
        }
    }

    public final float getChildX(View view) {
        if (view == this.contentView || !(view.getParent() instanceof View)) {
            return view.getX();
        }
        return view.getX() + getChildX((View) view.getParent());
    }

    public final float getChildY(View view) {
        if (view == this.contentView || !(view.getParent() instanceof View)) {
            return view.getY();
        }
        return view.getY() + getChildY((View) view.getParent());
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ArrayList arrayList = this.onScroll;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((Runnable) obj).run();
        }
        invalidate();
        this.contentView.invalidate();
    }
}
