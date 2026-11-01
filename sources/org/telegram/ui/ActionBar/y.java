package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.ci0;
public class y extends LinearLayout {
    public boolean f21534a;
    public final l f21535b;
    public boolean f21536c;
    public boolean d;
    public ArrayList e;
    public Runnable f21537f;

    public y(Context context, l lVar) {
        super(context);
        this.f21534a = true;
        setOrientation(0);
        this.f21535b = lVar;
    }

    public final t0 a(int i10, int i11) {
        int i12;
        boolean z10 = this.f21536c;
        l lVar = this.f21535b;
        if (z10) {
            i12 = lVar.f20504q0;
        } else {
            i12 = lVar.f20502p0;
        }
        return b(i10, i11, null, i12, null, org.telegram.messenger.i0.L(48.0f), null, null);
    }

    public final t0 b(int i10, int i11, CharSequence charSequence, int i12, Drawable drawable, int i13, CharSequence charSequence2, p6 p6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i10));
        return f(-1, i10, i11, charSequence, i12, drawable, i13, charSequence2, p6Var);
    }

    public final t0 c(int i10, int i11, p6 p6Var) {
        int i12;
        boolean z10 = this.f21536c;
        l lVar = this.f21535b;
        if (z10) {
            i12 = lVar.f20504q0;
        } else {
            i12 = lVar.f20502p0;
        }
        return b(i10, i11, null, i12, null, org.telegram.messenger.i0.L(48.0f), null, p6Var);
    }

    public final t0 d(int i10, Drawable drawable) {
        int i11;
        boolean z10 = this.f21536c;
        l lVar = this.f21535b;
        if (z10) {
            i11 = lVar.f20504q0;
        } else {
            i11 = lVar.f20502p0;
        }
        return b(i10, 0, null, i11, drawable, org.telegram.messenger.i0.L(48.0f), null, null);
    }

    public final t0 e(int i10, String str) {
        int i11;
        boolean z10 = this.f21536c;
        l lVar = this.f21535b;
        if (z10) {
            i11 = lVar.f20504q0;
        } else {
            i11 = lVar.f20502p0;
        }
        return b(i10, 0, str, i11, null, 0, str, null);
    }

    public final t0 f(int i10, int i11, int i12, CharSequence charSequence, int i13, Drawable drawable, int i14, CharSequence charSequence2, p6 p6Var) {
        int i15;
        boolean z10;
        int i16;
        Context context = getContext();
        boolean z11 = this.f21536c;
        l lVar = this.f21535b;
        if (z11) {
            i15 = lVar.f20510s0;
        } else {
            i15 = lVar.f20507r0;
        }
        int i17 = i15;
        if (charSequence != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t0 t0Var = new t0(context, this, i13, i17, z10, p6Var);
        t0Var.setTag(Integer.valueOf(i11));
        if (charSequence != null) {
            t0Var.E.setText(charSequence);
            if (i14 != 0) {
                i16 = i14;
            } else {
                i16 = -2;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i16, -1);
            int L = org.telegram.messenger.i0.L(14.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
            addView(t0Var, i10, layoutParams);
        } else {
            if (drawable != null) {
                if (drawable instanceof ci0) {
                    t0Var.f20857y.setAnimation((ci0) drawable);
                } else {
                    t0Var.f20857y.setImageDrawable(drawable);
                }
            } else if (i12 != 0) {
                t0Var.f20857y.setImageResource(i12);
            }
            addView(t0Var, i10, new LinearLayout.LayoutParams(i14, -1));
        }
        t0Var.setOnClickListener(new ag.g(this, 16));
        if (charSequence2 != null) {
            t0Var.setContentDescription(charSequence2);
        }
        return t0Var;
    }

    public final t0 g(int i10, int i11, int i12) {
        int i13;
        boolean z10 = this.f21536c;
        l lVar = this.f21535b;
        if (z10) {
            i13 = lVar.f20504q0;
        } else {
            i13 = lVar.f20502p0;
        }
        return b(i10, i11, null, i13, null, i12, null, null);
    }

    public int getClosingSearchFieldWidth() {
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof t0) {
                t0 t0Var = (t0) childAt;
                if (t0Var.u() && t0Var.v() && !t0Var.w()) {
                    View searchContainer = t0Var.getSearchContainer();
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
            if ((childAt instanceof t0) && childAt.getVisibility() == 0) {
                float x10 = childAt.getX();
                f7 = Math.min(f7, x10);
                f10 = Math.max(f10, childAt.getWidth() + x10);
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
            if ((childAt instanceof t0) && childAt.getVisibility() != 8) {
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
            if ((childAt instanceof t0) && childAt.getVisibility() == 0) {
                f7 = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f7;
            }
        }
        return (int) f7;
    }

    public final t0 h(int i10, int i11, String str, int i12) {
        int i13;
        boolean z10 = this.f21536c;
        l lVar = this.f21535b;
        if (z10) {
            i13 = lVar.f20504q0;
        } else {
            i13 = lVar.f20502p0;
        }
        return b(i10, i11, null, i13, null, i12, str, null);
    }

    public final void i(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t0) {
                t0 t0Var = (t0) childAt;
                if (t0Var.u() && t0Var.v()) {
                    p0 p0Var = t0Var.H;
                    if (p0Var == null || p0Var.b()) {
                        this.f21535b.y(false);
                        t0Var.T(z10);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final t0 j(int i10) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i10));
        if (findViewWithTag instanceof t0) {
            return (t0) findViewWithTag;
        }
        return null;
    }

    public final int k() {
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof t0) {
                i10 = childAt.getMeasuredWidth() + i10;
            }
        }
        return i10;
    }

    public final x l(int i10, int i11, int i12, Drawable drawable, int i13, p6 p6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i10));
        ?? obj = new Object();
        obj.f21461i = 1.0f;
        obj.f21464l = 8;
        obj.f21456a = this;
        obj.f21457b = i10;
        obj.f21458c = i11;
        obj.e = i12;
        obj.f21459f = drawable;
        obj.f21460g = i13;
        obj.h = p6Var;
        return obj;
    }

    public final x m(Drawable drawable, p6 p6Var) {
        int i10;
        boolean z10 = this.f21536c;
        l lVar = this.f21535b;
        if (z10) {
            i10 = lVar.f20504q0;
        } else {
            i10 = lVar.f20502p0;
        }
        return l(14, 0, i10, drawable, org.telegram.messenger.i0.L(48.0f), p6Var);
    }

    public final x n(p6 p6Var) {
        int i10;
        boolean z10 = this.f21536c;
        l lVar = this.f21535b;
        if (z10) {
            i10 = lVar.f20504q0;
        } else {
            i10 = lVar.f20502p0;
        }
        return l(32, 2131230911, i10, null, org.telegram.messenger.i0.L(48.0f), p6Var);
    }

    public final void o(int i10) {
        k kVar = this.f21535b.f20514u0;
        if (kVar != null) {
            kVar.b(i10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Runnable runnable = this.f21537f;
        if (runnable != null) {
            runnable.run();
        }
        l lVar = this.f21535b;
        if (lVar != null) {
            lVar.j();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.d) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof t0) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.leftMargin = -org.telegram.messenger.i0.L(5.0f);
                        marginLayoutParams.rightMargin = -org.telegram.messenger.i0.L(5.0f);
                    }
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t0) {
                t0 t0Var = (t0) childAt;
                if (t0Var.getSearchContainer() != null && t0Var.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(int i10, int i11) {
        t0 j10 = j(i10);
        if (j10 != null) {
            j10.setVisibility(i11);
        }
    }

    public final void r(float f7) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t0) {
                ((t0) childAt).setTransitionOffset(f7);
            }
        }
    }

    public final void s() {
        int i10;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof t0) {
                boolean z10 = this.f21536c;
                l lVar = this.f21535b;
                if (z10) {
                    i10 = lVar.f20504q0;
                } else {
                    i10 = lVar.f20502p0;
                }
                childAt.setBackgroundDrawable(t6.h0(i10, 1, -1));
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

    public void setFilter(zf.e0 e0Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t0) {
                t0 t0Var = (t0) childAt;
                if (t0Var.u()) {
                    ArrayList arrayList = t0Var.f20835g0;
                    arrayList.add(e0Var);
                    if (t0Var.F.getTag() != null) {
                        t0Var.f20836h0 = arrayList.size() - 1;
                    }
                    t0Var.D();
                    return;
                }
            }
        }
    }

    public void setGlassMode(boolean z10) {
        this.d = z10;
    }

    public void setOnLayoutListener(Runnable runnable) {
        this.f21537f = runnable;
    }

    public void setPopupItemsSelectorColor(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof t0) {
                ((t0) childAt).setPopupItemsSelectorColor(i10);
            }
        }
    }

    public void setSearchCursorColor(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof t0) {
                t0 t0Var = (t0) childAt;
                if (t0Var.u()) {
                    t0Var.getSearchField().setCursorColor(i10);
                    return;
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t0) {
                t0 t0Var = (t0) childAt;
                if (t0Var.u()) {
                    t0Var.P(str, false);
                    t0Var.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public final void t() {
        int i10;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof t0) {
                t0 t0Var = (t0) childAt;
                boolean z10 = this.f21536c;
                l lVar = this.f21535b;
                if (z10) {
                    i10 = lVar.f20510s0;
                } else {
                    i10 = lVar.f20507r0;
                }
                t0Var.setIconColor(i10);
            }
        }
    }
}
