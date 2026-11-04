package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.ch0;
public class x extends LinearLayout {
    public boolean f28785a;
    public final k f28786b;
    public boolean f28787c;
    public boolean d;
    public ArrayList f28788e;
    public Runnable f28789f;

    public x(Context context, k kVar) {
        super(context);
        this.f28785a = true;
        setOrientation(0);
        this.f28786b = kVar;
    }

    public final q0 a(int i3, int i10) {
        int i11;
        boolean z10 = this.f28787c;
        k kVar = this.f28786b;
        if (z10) {
            i11 = kVar.f27735r0;
        } else {
            i11 = kVar.f27732q0;
        }
        return b(i3, i10, null, i11, null, org.telegram.messenger.g0.L(48.0f), null, null);
    }

    public final q0 b(int i3, int i10, CharSequence charSequence, int i11, Drawable drawable, int i12, CharSequence charSequence2, e6 e6Var) {
        if (this.f28788e == null) {
            this.f28788e = new ArrayList();
        }
        this.f28788e.add(Integer.valueOf(i3));
        return f(-1, i3, i10, charSequence, i11, drawable, i12, charSequence2, e6Var);
    }

    public final q0 c(int i3, int i10, e6 e6Var) {
        int i11;
        boolean z10 = this.f28787c;
        k kVar = this.f28786b;
        if (z10) {
            i11 = kVar.f27735r0;
        } else {
            i11 = kVar.f27732q0;
        }
        return b(i3, i10, null, i11, null, org.telegram.messenger.g0.L(48.0f), null, e6Var);
    }

    public final q0 d(int i3, Drawable drawable) {
        int i10;
        boolean z10 = this.f28787c;
        k kVar = this.f28786b;
        if (z10) {
            i10 = kVar.f27735r0;
        } else {
            i10 = kVar.f27732q0;
        }
        return b(i3, 0, null, i10, drawable, org.telegram.messenger.g0.L(48.0f), null, null);
    }

    public final q0 e(int i3, String str) {
        int i10;
        boolean z10 = this.f28787c;
        k kVar = this.f28786b;
        if (z10) {
            i10 = kVar.f27735r0;
        } else {
            i10 = kVar.f27732q0;
        }
        return b(i3, 0, str, i10, null, 0, str, null);
    }

    public final q0 f(int i3, int i10, int i11, CharSequence charSequence, int i12, Drawable drawable, int i13, CharSequence charSequence2, e6 e6Var) {
        int i14;
        boolean z10;
        int i15;
        Context context = getContext();
        boolean z11 = this.f28787c;
        k kVar = this.f28786b;
        if (z11) {
            i14 = kVar.f27740t0;
        } else {
            i14 = kVar.f27738s0;
        }
        int i16 = i14;
        if (charSequence != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        q0 q0Var = new q0(context, this, i12, i16, z10, e6Var);
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
            addView(q0Var, i3, layoutParams);
        } else {
            if (drawable != null) {
                if (drawable instanceof ch0) {
                    q0Var.f28471y.setAnimation((ch0) drawable);
                } else {
                    q0Var.f28471y.setImageDrawable(drawable);
                }
            } else if (i11 != 0) {
                q0Var.f28471y.setImageResource(i11);
            }
            addView(q0Var, i3, new LinearLayout.LayoutParams(i13, -1));
        }
        q0Var.setOnClickListener(new ii.m(this, 16));
        if (charSequence2 != null) {
            q0Var.setContentDescription(charSequence2);
        }
        return q0Var;
    }

    public final q0 g(int i3, int i10, int i11) {
        int i12;
        boolean z10 = this.f28787c;
        k kVar = this.f28786b;
        if (z10) {
            i12 = kVar.f27735r0;
        } else {
            i12 = kVar.f27732q0;
        }
        return b(i3, i10, null, i12, null, i11, null, null);
    }

    public int getClosingSearchFieldWidth() {
        int childCount = getChildCount();
        int i3 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.u() && q0Var.v() && !q0Var.w()) {
                    View searchContainer = q0Var.getSearchContainer();
                    while (searchContainer != null && searchContainer.getParent() != this) {
                        if (searchContainer.getParent() instanceof View) {
                            searchContainer = (View) searchContainer.getParent();
                        } else {
                            searchContainer = null;
                        }
                    }
                    if (searchContainer != null && searchContainer.getVisibility() != 8) {
                        int measuredWidth = searchContainer.getMeasuredWidth() + i3;
                        if (searchContainer.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) searchContainer.getLayoutParams();
                            i3 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + measuredWidth;
                        } else {
                            i3 = measuredWidth;
                        }
                    }
                }
            }
        }
        return i3;
    }

    public int getItemsWidth() {
        int childCount = getChildCount();
        float f10 = Float.POSITIVE_INFINITY;
        float f11 = Float.NEGATIVE_INFINITY;
        boolean z10 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
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
        int i3 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof q0) && childAt.getVisibility() != 8) {
                i3 = childAt.getMeasuredWidth() + i3;
            }
        }
        return i3;
    }

    public int getVisibleItemsMeasuredWidthWithAlpha() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((childAt instanceof q0) && childAt.getVisibility() == 0) {
                f10 = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f10;
            }
        }
        return (int) f10;
    }

    public final q0 h(int i3, int i10, int i11, String str) {
        int i12;
        boolean z10 = this.f28787c;
        k kVar = this.f28786b;
        if (z10) {
            i12 = kVar.f27735r0;
        } else {
            i12 = kVar.f27732q0;
        }
        return b(i3, i10, null, i12, null, i11, str, null);
    }

    public final void i(boolean z10) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.u() && q0Var.v()) {
                    m0 m0Var = q0Var.I;
                    if (m0Var == null || m0Var.b()) {
                        this.f28786b.y(false);
                        q0Var.T(z10);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final q0 j(int i3) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i3));
        if (findViewWithTag instanceof q0) {
            return (q0) findViewWithTag;
        }
        return null;
    }

    public final int k() {
        int childCount = getChildCount();
        int i3 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                i3 = childAt.getMeasuredWidth() + i3;
            }
        }
        return i3;
    }

    public final w l(int i3, int i10, int i11, Drawable drawable, int i12, e6 e6Var) {
        if (this.f28788e == null) {
            this.f28788e = new ArrayList();
        }
        this.f28788e.add(Integer.valueOf(i3));
        ?? obj = new Object();
        obj.f28755i = 1.0f;
        obj.f28758l = 8;
        obj.f28749a = this;
        obj.f28750b = i3;
        obj.f28751c = i10;
        obj.f28752e = i11;
        obj.f28753f = drawable;
        obj.f28754g = i12;
        obj.h = e6Var;
        return obj;
    }

    public final w m(Drawable drawable, e6 e6Var) {
        int i3;
        boolean z10 = this.f28787c;
        k kVar = this.f28786b;
        if (z10) {
            i3 = kVar.f27735r0;
        } else {
            i3 = kVar.f27732q0;
        }
        return l(14, 0, i3, drawable, org.telegram.messenger.g0.L(48.0f), e6Var);
    }

    public final w n(e6 e6Var) {
        int i3;
        boolean z10 = this.f28787c;
        k kVar = this.f28786b;
        if (z10) {
            i3 = kVar.f27735r0;
        } else {
            i3 = kVar.f27732q0;
        }
        return l(32, 2131230911, i3, null, org.telegram.messenger.g0.L(48.0f), e6Var);
    }

    public final void o(int i3) {
        j jVar = this.f28786b.f27744v0;
        if (jVar != null) {
            jVar.b(i3);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        Runnable runnable = this.f28789f;
        if (runnable != null) {
            runnable.run();
        }
        k kVar = this.f28786b;
        if (kVar != null) {
            kVar.j();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
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
        super.onMeasure(i3, i10);
    }

    public final boolean p() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.getSearchContainer() != null && q0Var.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(int i3, int i10) {
        q0 j10 = j(i3);
        if (j10 != null) {
            j10.setVisibility(i10);
        }
    }

    public final void r(float f10) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof q0) {
                ((q0) childAt).setTransitionOffset(f10);
            }
        }
    }

    public final void s() {
        int i3;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                boolean z10 = this.f28787c;
                k kVar = this.f28786b;
                if (z10) {
                    i3 = kVar.f27735r0;
                } else {
                    i3 = kVar.f27732q0;
                }
                childAt.setBackgroundDrawable(k6.h0(i3, 1, -1));
            }
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).setEnabled(z10);
        }
    }

    public void setFilter(kg.l0 l0Var) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.u()) {
                    ArrayList arrayList = q0Var.f28450h0;
                    arrayList.add(l0Var);
                    if (q0Var.G.getTag() != null) {
                        q0Var.f28451i0 = arrayList.size() - 1;
                    }
                    q0Var.D();
                    return;
                }
            }
        }
    }

    public void setGlassMode(boolean z10) {
        this.d = z10;
    }

    public void setOnLayoutListener(Runnable runnable) {
        this.f28789f = runnable;
    }

    public void setPopupItemsSelectorColor(int i3) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                ((q0) childAt).setPopupItemsSelectorColor(i3);
            }
        }
    }

    public void setSearchCursorColor(int i3) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.u()) {
                    q0Var.getSearchField().setCursorColor(i3);
                    return;
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.u()) {
                    q0Var.P(str, false);
                    q0Var.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public final void t() {
        int i3;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                boolean z10 = this.f28787c;
                k kVar = this.f28786b;
                if (z10) {
                    i3 = kVar.f27740t0;
                } else {
                    i3 = kVar.f27738s0;
                }
                q0Var.setIconColor(i3);
            }
        }
    }
}
