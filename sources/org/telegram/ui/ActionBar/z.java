package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oi0;

public class z extends LinearLayout {

    public boolean f23983a;

    public final k f23984b;

    public boolean f23985c;
    public boolean d;

    public ArrayList f23986e;

    public Runnable f23987f;

    public z(Context context, k kVar) {
        super(context);
        this.f23983a = true;
        setOrientation(0);
        this.f23984b = kVar;
    }

    public final v0 a(int i10, int i11) {
        boolean z10 = this.f23985c;
        k kVar = this.f23984b;
        return b(i10, i11, null, z10 ? kVar.m0 : kVar.f23582l0, null, AndroidUtilities.dp(48.0f), null, null);
    }

    public final v0 b(int i10, int i11, CharSequence charSequence, int i12, Drawable drawable, int i13, CharSequence charSequence2, c6 c6Var) {
        if (this.f23986e == null) {
            this.f23986e = new ArrayList();
        }
        this.f23986e.add(Integer.valueOf(i10));
        return f(-1, i10, i11, charSequence, i12, drawable, i13, charSequence2, c6Var);
    }

    public final v0 c(int i10, int i11, c6 c6Var) {
        boolean z10 = this.f23985c;
        k kVar = this.f23984b;
        return b(i10, i11, null, z10 ? kVar.m0 : kVar.f23582l0, null, AndroidUtilities.dp(48.0f), null, c6Var);
    }

    public final v0 d(int i10, Drawable drawable) {
        boolean z10 = this.f23985c;
        k kVar = this.f23984b;
        return b(i10, 0, null, z10 ? kVar.m0 : kVar.f23582l0, drawable, AndroidUtilities.dp(48.0f), null, null);
    }

    public final v0 e(int i10, String str) {
        boolean z10 = this.f23985c;
        k kVar = this.f23984b;
        return b(i10, 0, str, z10 ? kVar.m0 : kVar.f23582l0, null, 0, str, null);
    }

    public final v0 f(int i10, int i11, int i12, CharSequence charSequence, int i13, Drawable drawable, int i14, CharSequence charSequence2, c6 c6Var) {
        Context context = getContext();
        boolean z10 = this.f23985c;
        k kVar = this.f23984b;
        v0 v0Var = new v0(context, this, i13, z10 ? kVar.f23587o0 : kVar.f23585n0, charSequence != null, c6Var);
        v0Var.setTag(Integer.valueOf(i11));
        if (charSequence != null) {
            v0Var.A.setText(charSequence);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i14 != 0 ? i14 : -2, -1);
            int iDp = AndroidUtilities.dp(14.0f);
            layoutParams.rightMargin = iDp;
            layoutParams.leftMargin = iDp;
            addView(v0Var, i10, layoutParams);
        } else {
            if (drawable != null) {
                if (drawable instanceof oi0) {
                    v0Var.f23877x.setAnimation((oi0) drawable);
                } else {
                    v0Var.f23877x.setImageDrawable(drawable);
                }
            } else if (i12 != 0) {
                v0Var.f23877x.setImageResource(i12);
            }
            addView(v0Var, i10, new LinearLayout.LayoutParams(i14, -1));
        }
        v0Var.setOnClickListener(new x(this, 0));
        if (charSequence2 != null) {
            v0Var.setContentDescription(charSequence2);
        }
        return v0Var;
    }

    public final v0 g(int i10, int i11, int i12) {
        boolean z10 = this.f23985c;
        k kVar = this.f23984b;
        return b(i10, i11, null, z10 ? kVar.m0 : kVar.f23582l0, null, i12, null, null);
    }

    public int getItemsWidth() {
        int childCount = getChildCount();
        float fMin = Float.POSITIVE_INFINITY;
        float fMax = Float.NEGATIVE_INFINITY;
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof v0) && childAt.getVisibility() == 0) {
                float x8 = childAt.getX();
                float width = childAt.getWidth() + x8;
                fMin = Math.min(fMin, x8);
                fMax = Math.max(fMax, width);
                z10 = true;
            }
        }
        if (z10) {
            return (int) (fMax - fMin);
        }
        return 0;
    }

    public int getVisibleItemsMeasuredWidth() {
        int childCount = getChildCount();
        int measuredWidth = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof v0) && childAt.getVisibility() != 8) {
                measuredWidth = childAt.getMeasuredWidth() + measuredWidth;
            }
        }
        return measuredWidth;
    }

    public int getVisibleItemsMeasuredWidthWithAlpha() {
        int childCount = getChildCount();
        float alpha = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof v0) && childAt.getVisibility() == 0) {
                alpha = (childAt.getAlpha() * childAt.getMeasuredWidth()) + alpha;
            }
        }
        return (int) alpha;
    }

    public final v0 h(int i10, int i11, String str, int i12) {
        boolean z10 = this.f23985c;
        k kVar = this.f23984b;
        return b(i10, i11, null, z10 ? kVar.m0 : kVar.f23582l0, null, i12, str, null);
    }

    public final v0 i(int i10, String str, Drawable drawable) {
        boolean z10 = this.f23985c;
        k kVar = this.f23984b;
        return b(1, 0, null, z10 ? kVar.m0 : kVar.f23582l0, drawable, i10, str, null);
    }

    public final void j(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.C && v0Var.s()) {
                    e5 e5Var = v0Var.D;
                    if (e5Var == null || e5Var.b()) {
                        this.f23984b.w(false);
                        v0Var.L(z10);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final v0 k(int i10) {
        View viewFindViewWithTag = findViewWithTag(Integer.valueOf(i10));
        if (viewFindViewWithTag instanceof v0) {
            return (v0) viewFindViewWithTag;
        }
        return null;
    }

    public final int l() {
        int childCount = getChildCount();
        int measuredWidth = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v0) {
                measuredWidth = childAt.getMeasuredWidth() + measuredWidth;
            }
        }
        return measuredWidth;
    }

    public final y m(int i10, int i11, int i12, Drawable drawable, int i13, c6 c6Var) {
        if (this.f23986e == null) {
            this.f23986e = new ArrayList();
        }
        this.f23986e.add(Integer.valueOf(i10));
        y yVar = new y();
        yVar.f23963i = 1.0f;
        yVar.f23966l = 8;
        yVar.f23957a = this;
        yVar.f23958b = i10;
        yVar.f23959c = i11;
        yVar.f23960e = i12;
        yVar.f23961f = drawable;
        yVar.f23962g = i13;
        yVar.h = c6Var;
        return yVar;
    }

    public final y n(Drawable drawable, c6 c6Var) {
        boolean z10 = this.f23985c;
        k kVar = this.f23984b;
        return m(14, 0, z10 ? kVar.m0 : kVar.f23582l0, drawable, AndroidUtilities.dp(48.0f), c6Var);
    }

    public final void o(int i10) {
        j jVar = this.f23984b.f23590q0;
        if (jVar != null) {
            jVar.b(i10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Runnable runnable = this.f23987f;
        if (runnable != null) {
            runnable.run();
        }
        k kVar = this.f23984b;
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
                if (childAt instanceof v0) {
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
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.getSearchContainer() != null && v0Var.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(int i10, int i11) {
        v0 v0VarK = k(i10);
        if (v0VarK != null) {
            v0VarK.setVisibility(i11);
        }
    }

    public final void r(float f10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v0) {
                ((v0) childAt).setTransitionOffset(f10);
            }
        }
    }

    public final void s() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v0) {
                boolean z10 = this.f23985c;
                k kVar = this.f23984b;
                childAt.setBackgroundDrawable(g6.f0(z10 ? kVar.m0 : kVar.f23582l0, 1, -1));
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

    public void setFilter(pf.e0 e0Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.C) {
                    ArrayList arrayList = v0Var.f23857c0;
                    arrayList.add(e0Var);
                    if (v0Var.B.getTag() != null) {
                        v0Var.f23858d0 = arrayList.size() - 1;
                    }
                    v0Var.y();
                    return;
                }
            }
        }
    }

    public void setGlassMode(boolean z10) {
        this.d = z10;
    }

    public void setOnLayoutListener(Runnable runnable) {
        this.f23987f = runnable;
    }

    public void setPopupItemsSelectorColor(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof v0) {
                ((v0) childAt).setPopupItemsSelectorColor(i10);
            }
        }
    }

    public void setSearchCursorColor(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.C) {
                    v0Var.getSearchField().setCursorColor(i10);
                    return;
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.C) {
                    v0Var.H(str, false);
                    v0Var.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public final void t() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                boolean z10 = this.f23985c;
                k kVar = this.f23984b;
                v0Var.setIconColor(z10 ? kVar.f23587o0 : kVar.f23585n0);
            }
        }
    }
}
