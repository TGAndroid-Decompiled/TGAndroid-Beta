package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.oh0;
public class y extends LinearLayout {
    public boolean f30248a;
    public final k f30249b;
    public boolean f30250c;
    public boolean d;
    public ArrayList f30251e;
    public Runnable f30252f;

    public y(Context context, k kVar) {
        super(context);
        this.f30248a = true;
        setOrientation(0);
        this.f30249b = kVar;
    }

    public final q0 a(int i7, int i10) {
        int i11;
        boolean z10 = this.f30250c;
        k kVar = this.f30249b;
        if (z10) {
            i11 = kVar.f29123r0;
        } else {
            i11 = kVar.f29120q0;
        }
        return b(i7, i10, null, i11, null, org.telegram.messenger.g0.L(48.0f), null, null);
    }

    public final q0 b(int i7, int i10, CharSequence charSequence, int i11, Drawable drawable, int i12, CharSequence charSequence2, h6 h6Var) {
        if (this.f30251e == null) {
            this.f30251e = new ArrayList();
        }
        this.f30251e.add(Integer.valueOf(i7));
        return f(-1, i7, i10, charSequence, i11, drawable, i12, charSequence2, h6Var);
    }

    public final q0 c(int i7, int i10, h6 h6Var) {
        int i11;
        boolean z10 = this.f30250c;
        k kVar = this.f30249b;
        if (z10) {
            i11 = kVar.f29123r0;
        } else {
            i11 = kVar.f29120q0;
        }
        return b(i7, i10, null, i11, null, org.telegram.messenger.g0.L(48.0f), null, h6Var);
    }

    public final q0 d(int i7, Drawable drawable) {
        int i10;
        boolean z10 = this.f30250c;
        k kVar = this.f30249b;
        if (z10) {
            i10 = kVar.f29123r0;
        } else {
            i10 = kVar.f29120q0;
        }
        return b(i7, 0, null, i10, drawable, org.telegram.messenger.g0.L(48.0f), null, null);
    }

    public final q0 e(int i7, String str) {
        int i10;
        boolean z10 = this.f30250c;
        k kVar = this.f30249b;
        if (z10) {
            i10 = kVar.f29123r0;
        } else {
            i10 = kVar.f29120q0;
        }
        return b(i7, 0, str, i10, null, 0, str, null);
    }

    public final q0 f(int i7, int i10, int i11, CharSequence charSequence, int i12, Drawable drawable, int i13, CharSequence charSequence2, h6 h6Var) {
        int i14;
        boolean z10;
        int i15;
        Context context = getContext();
        boolean z11 = this.f30250c;
        k kVar = this.f30249b;
        if (z11) {
            i14 = kVar.f29128t0;
        } else {
            i14 = kVar.f29126s0;
        }
        int i16 = i14;
        if (charSequence != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        q0 q0Var = new q0(context, this, i12, i16, z10, h6Var);
        q0Var.setTag(Integer.valueOf(i10));
        if (charSequence != null) {
            q0Var.F.setText(charSequence);
            if (i13 != 0) {
                i15 = i13;
            } else {
                i15 = -2;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i15, -1);
            int L = org.telegram.messenger.g0.L(14.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
            addView(q0Var, i7, layoutParams);
        } else {
            if (drawable != null) {
                if (drawable instanceof oh0) {
                    q0Var.f29899y.setAnimation((oh0) drawable);
                } else {
                    q0Var.f29899y.setImageDrawable(drawable);
                }
            } else if (i11 != 0) {
                q0Var.f29899y.setImageResource(i11);
            }
            addView(q0Var, i7, new LinearLayout.LayoutParams(i13, -1));
        }
        q0Var.setOnClickListener(new hi.p4(this, 20));
        if (charSequence2 != null) {
            q0Var.setContentDescription(charSequence2);
        }
        return q0Var;
    }

    public final q0 g(int i7, int i10, int i11) {
        int i12;
        boolean z10 = this.f30250c;
        k kVar = this.f30249b;
        if (z10) {
            i12 = kVar.f29123r0;
        } else {
            i12 = kVar.f29120q0;
        }
        return b(i7, i10, null, i12, null, i11, null, null);
    }

    public int getClosingSearchFieldWidth() {
        int childCount = getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.v() && q0Var.w() && !q0Var.x()) {
                    View searchContainer = q0Var.getSearchContainer();
                    while (searchContainer != null && searchContainer.getParent() != this) {
                        if (searchContainer.getParent() instanceof View) {
                            searchContainer = (View) searchContainer.getParent();
                        } else {
                            searchContainer = null;
                        }
                    }
                    if (searchContainer != null && searchContainer.getVisibility() != 8) {
                        int measuredWidth = searchContainer.getMeasuredWidth() + i7;
                        if (searchContainer.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) searchContainer.getLayoutParams();
                            i7 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + measuredWidth;
                        } else {
                            i7 = measuredWidth;
                        }
                    }
                }
            }
        }
        return i7;
    }

    public int getItemsWidth() {
        int childCount = getChildCount();
        float f10 = Float.POSITIVE_INFINITY;
        float f11 = Float.NEGATIVE_INFINITY;
        boolean z10 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((childAt instanceof q0) && childAt.getVisibility() == 0) {
                float x10 = childAt.getX();
                f10 = Math.min(f10, x10);
                f11 = Math.max(f11, childAt.getWidth() + x10);
                z10 = true;
            }
        }
        if (!z10) {
            return 0;
        }
        return (int) (f11 - f10);
    }

    public int getVisibleItemsMeasuredWidth() {
        int childCount = getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof q0) && childAt.getVisibility() != 8) {
                i7 = childAt.getMeasuredWidth() + i7;
            }
        }
        return i7;
    }

    public int getVisibleItemsMeasuredWidthWithAlpha() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((childAt instanceof q0) && childAt.getVisibility() == 0) {
                f10 = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f10;
            }
        }
        return (int) f10;
    }

    public final q0 h(int i7, int i10, int i11, String str) {
        int i12;
        boolean z10 = this.f30250c;
        k kVar = this.f30249b;
        if (z10) {
            i12 = kVar.f29123r0;
        } else {
            i12 = kVar.f29120q0;
        }
        return b(i7, i10, null, i12, null, i11, str, null);
    }

    public final void i(boolean z10) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.v() && q0Var.w()) {
                    m0 m0Var = q0Var.I;
                    if (m0Var == null || m0Var.b()) {
                        this.f30249b.A(false);
                        q0Var.U(z10);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final q0 j(int i7) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i7));
        if (findViewWithTag instanceof q0) {
            return (q0) findViewWithTag;
        }
        return null;
    }

    public final int k() {
        int childCount = getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                i7 = childAt.getMeasuredWidth() + i7;
            }
        }
        return i7;
    }

    public final x l(int i7, int i10, int i11, Drawable drawable, int i12, h6 h6Var) {
        if (this.f30251e == null) {
            this.f30251e = new ArrayList();
        }
        this.f30251e.add(Integer.valueOf(i7));
        ?? obj = new Object();
        obj.f30203i = 1.0f;
        obj.f30206l = 8;
        obj.f30197a = this;
        obj.f30198b = i7;
        obj.f30199c = i10;
        obj.f30200e = i11;
        obj.f30201f = drawable;
        obj.f30202g = i12;
        obj.h = h6Var;
        return obj;
    }

    public final x m(Drawable drawable, h6 h6Var) {
        int i7;
        boolean z10 = this.f30250c;
        k kVar = this.f30249b;
        if (z10) {
            i7 = kVar.f29123r0;
        } else {
            i7 = kVar.f29120q0;
        }
        return l(14, 0, i7, drawable, org.telegram.messenger.g0.L(48.0f), h6Var);
    }

    public final x n(h6 h6Var) {
        int i7;
        boolean z10 = this.f30250c;
        k kVar = this.f30249b;
        if (z10) {
            i7 = kVar.f29123r0;
        } else {
            i7 = kVar.f29120q0;
        }
        return l(32, 2131230911, i7, null, org.telegram.messenger.g0.L(48.0f), h6Var);
    }

    public final void o(int i7) {
        j jVar = this.f30249b.f29132v0;
        if (jVar != null) {
            jVar.b(i7);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        Runnable runnable = this.f30252f;
        if (runnable != null) {
            runnable.run();
        }
        k kVar = this.f30249b;
        if (kVar != null) {
            kVar.m();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.d) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof q0) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.leftMargin = -org.telegram.messenger.g0.L(5.0f);
                        marginLayoutParams.rightMargin = -org.telegram.messenger.g0.L(5.0f);
                    }
                }
            }
        }
        super.onMeasure(i7, i10);
    }

    public final boolean p() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.getSearchContainer() != null && q0Var.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(int i7, int i10) {
        q0 j3 = j(i7);
        if (j3 != null) {
            j3.setVisibility(i10);
        }
    }

    public final void r(float f10) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof q0) {
                ((q0) childAt).setTransitionOffset(f10);
            }
        }
    }

    public final void s() {
        int i7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                boolean z10 = this.f30250c;
                k kVar = this.f30249b;
                if (z10) {
                    i7 = kVar.f29123r0;
                } else {
                    i7 = kVar.f29120q0;
                }
                childAt.setBackgroundDrawable(m6.h0(i7, 1, -1));
            }
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setEnabled(z10);
        }
    }

    public void setFilter(jg.o0 o0Var) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.v()) {
                    ArrayList arrayList = q0Var.f29878h0;
                    arrayList.add(o0Var);
                    if (q0Var.G.getTag() != null) {
                        q0Var.f29879i0 = arrayList.size() - 1;
                    }
                    q0Var.E();
                    return;
                }
            }
        }
    }

    public void setGlassMode(boolean z10) {
        this.d = z10;
    }

    public void setOnLayoutListener(Runnable runnable) {
        this.f30252f = runnable;
    }

    public void setPopupItemsSelectorColor(int i7) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                ((q0) childAt).setPopupItemsSelectorColor(i7);
            }
        }
    }

    public void setSearchCursorColor(int i7) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.v()) {
                    q0Var.getSearchField().setCursorColor(i7);
                    return;
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.v()) {
                    q0Var.Q(str, false);
                    q0Var.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public final void t() {
        int i7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                boolean z10 = this.f30250c;
                k kVar = this.f30249b;
                if (z10) {
                    i7 = kVar.f29128t0;
                } else {
                    i7 = kVar.f29126s0;
                }
                q0Var.setIconColor(i7);
            }
        }
    }
}
