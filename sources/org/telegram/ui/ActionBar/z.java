package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xj0;
public class z extends LinearLayout {
    public boolean f23775a;
    public final k f23776b;
    public boolean f23777c;
    public boolean d;
    public ArrayList e;
    public Runnable f23778f;

    public z(Context context, k kVar) {
        super(context);
        this.f23775a = true;
        setOrientation(0);
        this.f23776b = kVar;
    }

    public final w0 a(int i10, int i11) {
        int i12;
        boolean z10 = this.f23777c;
        k kVar = this.f23776b;
        if (z10) {
            i12 = kVar.f22778q0;
        } else {
            i12 = kVar.f22776p0;
        }
        return b(i10, i11, null, i12, null, AndroidUtilities.dp(48.0f), null, null);
    }

    public final w0 b(int i10, int i11, CharSequence charSequence, int i12, Drawable drawable, int i13, CharSequence charSequence2, u6 u6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i10));
        return f(-1, i10, i11, charSequence, i12, drawable, i13, charSequence2, u6Var);
    }

    public final w0 c(int i10, int i11, u6 u6Var) {
        int i12;
        boolean z10 = this.f23777c;
        k kVar = this.f23776b;
        if (z10) {
            i12 = kVar.f22778q0;
        } else {
            i12 = kVar.f22776p0;
        }
        return b(i10, i11, null, i12, null, AndroidUtilities.dp(48.0f), null, u6Var);
    }

    public final w0 d(int i10, Drawable drawable) {
        int i11;
        boolean z10 = this.f23777c;
        k kVar = this.f23776b;
        if (z10) {
            i11 = kVar.f22778q0;
        } else {
            i11 = kVar.f22776p0;
        }
        return b(i10, 0, null, i11, drawable, AndroidUtilities.dp(48.0f), null, null);
    }

    public final w0 e(int i10, String str) {
        int i11;
        boolean z10 = this.f23777c;
        k kVar = this.f23776b;
        if (z10) {
            i11 = kVar.f22778q0;
        } else {
            i11 = kVar.f22776p0;
        }
        return b(i10, 0, str, i11, null, 0, str, null);
    }

    public final w0 f(int i10, int i11, int i12, CharSequence charSequence, int i13, Drawable drawable, int i14, CharSequence charSequence2, u6 u6Var) {
        int i15;
        boolean z10;
        int i16;
        Context context = getContext();
        boolean z11 = this.f23777c;
        k kVar = this.f23776b;
        if (z11) {
            i15 = kVar.f22784s0;
        } else {
            i15 = kVar.f22781r0;
        }
        int i17 = i15;
        if (charSequence != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        w0 w0Var = new w0(context, this, i13, i17, z10, u6Var);
        w0Var.setTag(Integer.valueOf(i11));
        if (charSequence != null) {
            w0Var.E.setText(charSequence);
            if (i14 != 0) {
                i16 = i14;
            } else {
                i16 = -2;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i16, -1);
            int dp = AndroidUtilities.dp(14.0f);
            layoutParams.rightMargin = dp;
            layoutParams.leftMargin = dp;
            addView(w0Var, i10, layoutParams);
        } else {
            if (drawable != null) {
                if (drawable instanceof xj0) {
                    w0Var.f23202x.setAnimation((xj0) drawable);
                } else {
                    w0Var.f23202x.setImageDrawable(drawable);
                }
            } else if (i12 != 0) {
                w0Var.f23202x.setImageResource(i12);
            }
            addView(w0Var, i10, new LinearLayout.LayoutParams(i14, -1));
        }
        w0Var.setOnClickListener(new x(this, 0));
        if (charSequence2 != null) {
            w0Var.setContentDescription(charSequence2);
        }
        return w0Var;
    }

    public final w0 g(int i10, int i11, int i12) {
        int i13;
        boolean z10 = this.f23777c;
        k kVar = this.f23776b;
        if (z10) {
            i13 = kVar.f22778q0;
        } else {
            i13 = kVar.f22776p0;
        }
        return b(i10, i11, null, i13, null, i12, null, null);
    }

    public int getClosingSearchFieldWidth() {
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.u() && w0Var.v() && !w0Var.w()) {
                    View searchContainer = w0Var.getSearchContainer();
                    while (searchContainer != null && searchContainer.getParent() != this) {
                        if (searchContainer.getParent() instanceof View) {
                            searchContainer = (View) searchContainer.getParent();
                        } else {
                            searchContainer = null;
                        }
                    }
                    if (searchContainer != null && searchContainer.getVisibility() != 8) {
                        int measuredWidth = searchContainer.getMeasuredWidth() + i10;
                        if (searchContainer.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) searchContainer.getLayoutParams();
                            i10 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + measuredWidth;
                        } else {
                            i10 = measuredWidth;
                        }
                    }
                }
            }
        }
        return i10;
    }

    public int getItemsWidth() {
        int childCount = getChildCount();
        float f7 = Float.POSITIVE_INFINITY;
        float f10 = Float.NEGATIVE_INFINITY;
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof w0) && childAt.getVisibility() == 0) {
                float x9 = childAt.getX();
                f7 = Math.min(f7, x9);
                f10 = Math.max(f10, childAt.getWidth() + x9);
                z10 = true;
            }
        }
        if (!z10) {
            return 0;
        }
        return (int) (f10 - f7);
    }

    public int getVisibleItemsMeasuredWidth() {
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((childAt instanceof w0) && childAt.getVisibility() != 8) {
                i10 = childAt.getMeasuredWidth() + i10;
            }
        }
        return i10;
    }

    public int getVisibleItemsMeasuredWidthWithAlpha() {
        int childCount = getChildCount();
        float f7 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof w0) && childAt.getVisibility() == 0) {
                f7 = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f7;
            }
        }
        return (int) f7;
    }

    public final w0 h(int i10, int i11, String str, int i12) {
        int i13;
        boolean z10 = this.f23777c;
        k kVar = this.f23776b;
        if (z10) {
            i13 = kVar.f22778q0;
        } else {
            i13 = kVar.f22776p0;
        }
        return b(i10, i11, null, i13, null, i12, str, null);
    }

    public final void i(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.u() && w0Var.v()) {
                    s0 s0Var = w0Var.H;
                    if (s0Var == null || s0Var.b()) {
                        this.f23776b.t(false);
                        w0Var.T(z10);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final w0 j(int i10) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i10));
        if (findViewWithTag instanceof w0) {
            return (w0) findViewWithTag;
        }
        return null;
    }

    public final int k() {
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof w0) {
                i10 = childAt.getMeasuredWidth() + i10;
            }
        }
        return i10;
    }

    public final y l(int i10, int i11, int i12, Drawable drawable, int i13, u6 u6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i10));
        ?? obj = new Object();
        obj.f23274i = 1.0f;
        obj.f23277l = 8;
        obj.f23269a = this;
        obj.f23270b = i10;
        obj.f23271c = i11;
        obj.e = i12;
        obj.f23272f = drawable;
        obj.f23273g = i13;
        obj.h = u6Var;
        return obj;
    }

    public final y m(Drawable drawable, u6 u6Var) {
        int i10;
        boolean z10 = this.f23777c;
        k kVar = this.f23776b;
        if (z10) {
            i10 = kVar.f22778q0;
        } else {
            i10 = kVar.f22776p0;
        }
        return l(14, 0, i10, drawable, AndroidUtilities.dp(48.0f), u6Var);
    }

    public final void n(int i10) {
        j jVar = this.f23776b.f22788u0;
        if (jVar != null) {
            jVar.b(i10);
        }
    }

    public final boolean o() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.getSearchContainer() != null && w0Var.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Runnable runnable = this.f23778f;
        if (runnable != null) {
            runnable.run();
        }
        k kVar = this.f23776b;
        if (kVar != null) {
            kVar.f();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.d) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof w0) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.leftMargin = -AndroidUtilities.dp(5.0f);
                        marginLayoutParams.rightMargin = -AndroidUtilities.dp(5.0f);
                    }
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    public final void p(int i10, int i11) {
        w0 j10 = j(i10);
        if (j10 != null) {
            j10.setVisibility(i11);
        }
    }

    public final void q(float f7) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                ((w0) childAt).setTransitionOffset(f7);
            }
        }
    }

    public final void r() {
        int i10;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof w0) {
                boolean z10 = this.f23777c;
                k kVar = this.f23776b;
                if (z10) {
                    i10 = kVar.f22778q0;
                } else {
                    i10 = kVar.f22776p0;
                }
                childAt.setBackgroundDrawable(y6.g0(i10, 1, -1));
            }
        }
    }

    public final void s() {
        int i10;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                boolean z10 = this.f23777c;
                k kVar = this.f23776b;
                if (z10) {
                    i10 = kVar.f22784s0;
                } else {
                    i10 = kVar.f22781r0;
                }
                w0Var.setIconColor(i10);
            }
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setEnabled(z10);
        }
    }

    public void setFilter(ig.p0 p0Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.u()) {
                    ArrayList arrayList = w0Var.f23182g0;
                    arrayList.add(p0Var);
                    if (w0Var.F.getTag() != null) {
                        w0Var.f23183h0 = arrayList.size() - 1;
                    }
                    w0Var.D();
                    return;
                }
            }
        }
    }

    public void setGlassMode(boolean z10) {
        this.d = z10;
    }

    public void setOnLayoutListener(Runnable runnable) {
        this.f23778f = runnable;
    }

    public void setPopupItemsSelectorColor(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof w0) {
                ((w0) childAt).setPopupItemsSelectorColor(i10);
            }
        }
    }

    public void setSearchCursorColor(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.u()) {
                    w0Var.getSearchField().setCursorColor(i10);
                    return;
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.u()) {
                    w0Var.P(str, false);
                    w0Var.getSearchField().setSelection(str.length());
                }
            }
        }
    }
}
