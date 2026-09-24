package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ij0;
public class y extends LinearLayout {
    public boolean f19913a;
    public final k f19914b;
    public boolean f19915c;
    public boolean d;
    public ArrayList e;
    public Runnable f19916f;

    public y(Context context, k kVar) {
        super(context);
        this.f19913a = true;
        setOrientation(0);
        this.f19914b = kVar;
    }

    public final u0 a(int i10, int i11) {
        int i12;
        boolean z10 = this.f19915c;
        k kVar = this.f19914b;
        if (z10) {
            i12 = kVar.f19547q0;
        } else {
            i12 = kVar.f19545p0;
        }
        return b(i10, i11, null, i12, null, AndroidUtilities.dp(48.0f), null, null);
    }

    public final u0 b(int i10, int i11, CharSequence charSequence, int i12, Drawable drawable, int i13, CharSequence charSequence2, d6 d6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i10));
        return f(-1, i10, i11, charSequence, i12, drawable, i13, charSequence2, d6Var);
    }

    public final u0 c(int i10, int i11, d6 d6Var) {
        int i12;
        boolean z10 = this.f19915c;
        k kVar = this.f19914b;
        if (z10) {
            i12 = kVar.f19547q0;
        } else {
            i12 = kVar.f19545p0;
        }
        return b(i10, i11, null, i12, null, AndroidUtilities.dp(48.0f), null, d6Var);
    }

    public final u0 d(int i10, Drawable drawable) {
        int i11;
        boolean z10 = this.f19915c;
        k kVar = this.f19914b;
        if (z10) {
            i11 = kVar.f19547q0;
        } else {
            i11 = kVar.f19545p0;
        }
        return b(i10, 0, null, i11, drawable, AndroidUtilities.dp(48.0f), null, null);
    }

    public final u0 e(int i10, String str) {
        int i11;
        boolean z10 = this.f19915c;
        k kVar = this.f19914b;
        if (z10) {
            i11 = kVar.f19547q0;
        } else {
            i11 = kVar.f19545p0;
        }
        return b(i10, 0, str, i11, null, 0, str, null);
    }

    public final u0 f(int i10, int i11, int i12, CharSequence charSequence, int i13, Drawable drawable, int i14, CharSequence charSequence2, d6 d6Var) {
        int i15;
        boolean z10;
        int i16;
        Context context = getContext();
        boolean z11 = this.f19915c;
        k kVar = this.f19914b;
        if (z11) {
            i15 = kVar.f19553s0;
        } else {
            i15 = kVar.f19550r0;
        }
        int i17 = i15;
        if (charSequence != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0 u0Var = new u0(context, this, i13, i17, z10, d6Var);
        u0Var.setTag(Integer.valueOf(i11));
        if (charSequence != null) {
            u0Var.E.setText(charSequence);
            if (i14 != 0) {
                i16 = i14;
            } else {
                i16 = -2;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i16, -1);
            int dp = AndroidUtilities.dp(14.0f);
            layoutParams.rightMargin = dp;
            layoutParams.leftMargin = dp;
            addView(u0Var, i10, layoutParams);
        } else {
            if (drawable != null) {
                if (drawable instanceof ij0) {
                    u0Var.f19800x.setAnimation((ij0) drawable);
                } else {
                    u0Var.f19800x.setImageDrawable(drawable);
                }
            } else if (i12 != 0) {
                u0Var.f19800x.setImageResource(i12);
            }
            addView(u0Var, i10, new LinearLayout.LayoutParams(i14, -1));
        }
        u0Var.setOnClickListener(new w(this, 0));
        if (charSequence2 != null) {
            u0Var.setContentDescription(charSequence2);
        }
        return u0Var;
    }

    public final u0 g(int i10, int i11, int i12) {
        int i13;
        boolean z10 = this.f19915c;
        k kVar = this.f19914b;
        if (z10) {
            i13 = kVar.f19547q0;
        } else {
            i13 = kVar.f19545p0;
        }
        return b(i10, i11, null, i13, null, i12, null, null);
    }

    public int getItemsWidth() {
        int childCount = getChildCount();
        float f7 = Float.POSITIVE_INFINITY;
        float f10 = Float.NEGATIVE_INFINITY;
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof u0) && childAt.getVisibility() == 0) {
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
            if ((childAt instanceof u0) && childAt.getVisibility() != 8) {
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
            if ((childAt instanceof u0) && childAt.getVisibility() == 0) {
                f7 = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f7;
            }
        }
        return (int) f7;
    }

    public final u0 h(int i10, int i11, String str, int i12) {
        int i13;
        boolean z10 = this.f19915c;
        k kVar = this.f19914b;
        if (z10) {
            i13 = kVar.f19547q0;
        } else {
            i13 = kVar.f19545p0;
        }
        return b(i10, i11, null, i13, null, i12, str, null);
    }

    public final u0 i(int i10, String str, Drawable drawable) {
        int i11;
        boolean z10 = this.f19915c;
        k kVar = this.f19914b;
        if (z10) {
            i11 = kVar.f19547q0;
        } else {
            i11 = kVar.f19545p0;
        }
        return b(1, 0, null, i11, drawable, i10, str, null);
    }

    public final void j(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof u0) {
                u0 u0Var = (u0) childAt;
                if (u0Var.G && u0Var.s()) {
                    e5 e5Var = u0Var.H;
                    if (e5Var == null || e5Var.b()) {
                        this.f19914b.v(false);
                        u0Var.L(z10);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final u0 k(int i10) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i10));
        if (findViewWithTag instanceof u0) {
            return (u0) findViewWithTag;
        }
        return null;
    }

    public final int l() {
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof u0) {
                i10 = childAt.getMeasuredWidth() + i10;
            }
        }
        return i10;
    }

    public final x m(int i10, int i11, int i12, Drawable drawable, int i13, d6 d6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i10));
        ?? obj = new Object();
        obj.f19894i = 1.0f;
        obj.f19897l = 8;
        obj.f19889a = this;
        obj.f19890b = i10;
        obj.f19891c = i11;
        obj.e = i12;
        obj.f19892f = drawable;
        obj.f19893g = i13;
        obj.h = d6Var;
        return obj;
    }

    public final x n(Drawable drawable, d6 d6Var) {
        int i10;
        boolean z10 = this.f19915c;
        k kVar = this.f19914b;
        if (z10) {
            i10 = kVar.f19547q0;
        } else {
            i10 = kVar.f19545p0;
        }
        return m(14, 0, i10, drawable, AndroidUtilities.dp(48.0f), d6Var);
    }

    public final void o(int i10) {
        j jVar = this.f19914b.f19556u0;
        if (jVar != null) {
            jVar.b(i10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Runnable runnable = this.f19916f;
        if (runnable != null) {
            runnable.run();
        }
        k kVar = this.f19914b;
        if (kVar != null) {
            kVar.g();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.d) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof u0) {
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

    public final boolean p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof u0) {
                u0 u0Var = (u0) childAt;
                if (u0Var.getSearchContainer() != null && u0Var.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(int i10, int i11) {
        u0 k10 = k(i10);
        if (k10 != null) {
            k10.setVisibility(i11);
        }
    }

    public final void r(float f7) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof u0) {
                ((u0) childAt).setTransitionOffset(f7);
            }
        }
    }

    public final void s() {
        int i10;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof u0) {
                boolean z10 = this.f19915c;
                k kVar = this.f19914b;
                if (z10) {
                    i10 = kVar.f19547q0;
                } else {
                    i10 = kVar.f19545p0;
                }
                childAt.setBackgroundDrawable(h6.f0(i10, 1, -1));
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

    public void setFilter(gg.q0 q0Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof u0) {
                u0 u0Var = (u0) childAt;
                if (u0Var.G) {
                    ArrayList arrayList = u0Var.f19782g0;
                    arrayList.add(q0Var);
                    if (u0Var.F.getTag() != null) {
                        u0Var.f19783h0 = arrayList.size() - 1;
                    }
                    u0Var.y();
                    return;
                }
            }
        }
    }

    public void setGlassMode(boolean z10) {
        this.d = z10;
    }

    public void setOnLayoutListener(Runnable runnable) {
        this.f19916f = runnable;
    }

    public void setPopupItemsSelectorColor(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof u0) {
                ((u0) childAt).setPopupItemsSelectorColor(i10);
            }
        }
    }

    public void setSearchCursorColor(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof u0) {
                u0 u0Var = (u0) childAt;
                if (u0Var.G) {
                    u0Var.getSearchField().setCursorColor(i10);
                    return;
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof u0) {
                u0 u0Var = (u0) childAt;
                if (u0Var.G) {
                    u0Var.H(str, false);
                    u0Var.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public final void t() {
        int i10;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof u0) {
                u0 u0Var = (u0) childAt;
                boolean z10 = this.f19915c;
                k kVar = this.f19914b;
                if (z10) {
                    i10 = kVar.f19553s0;
                } else {
                    i10 = kVar.f19550r0;
                }
                u0Var.setIconColor(i10);
            }
        }
    }
}
