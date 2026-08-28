package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mi0;
public class z extends LinearLayout {
    public boolean f23998a;
    public final k f23999b;
    public boolean f24000c;
    public boolean d;
    public ArrayList f24001e;
    public Runnable f24002f;

    public z(Context context, k kVar) {
        super(context);
        this.f23998a = true;
        setOrientation(0);
        this.f23999b = kVar;
    }

    public final w0 a(int i9, int i10) {
        int i11;
        boolean z10 = this.f24000c;
        k kVar = this.f23999b;
        if (z10) {
            i11 = kVar.m0;
        } else {
            i11 = kVar.f23581l0;
        }
        return b(i9, i10, null, i11, null, AndroidUtilities.dp(48.0f), null, null);
    }

    public final w0 b(int i9, int i10, CharSequence charSequence, int i11, Drawable drawable, int i12, CharSequence charSequence2, b6 b6Var) {
        if (this.f24001e == null) {
            this.f24001e = new ArrayList();
        }
        this.f24001e.add(Integer.valueOf(i9));
        return f(-1, i9, i10, charSequence, i11, drawable, i12, charSequence2, b6Var);
    }

    public final w0 c(int i9, int i10, b6 b6Var) {
        int i11;
        boolean z10 = this.f24000c;
        k kVar = this.f23999b;
        if (z10) {
            i11 = kVar.m0;
        } else {
            i11 = kVar.f23581l0;
        }
        return b(i9, i10, null, i11, null, AndroidUtilities.dp(48.0f), null, b6Var);
    }

    public final w0 d(int i9, Drawable drawable) {
        int i10;
        boolean z10 = this.f24000c;
        k kVar = this.f23999b;
        if (z10) {
            i10 = kVar.m0;
        } else {
            i10 = kVar.f23581l0;
        }
        return b(i9, 0, null, i10, drawable, AndroidUtilities.dp(48.0f), null, null);
    }

    public final w0 e(int i9, String str) {
        int i10;
        boolean z10 = this.f24000c;
        k kVar = this.f23999b;
        if (z10) {
            i10 = kVar.m0;
        } else {
            i10 = kVar.f23581l0;
        }
        return b(i9, 0, str, i10, null, 0, str, null);
    }

    public final w0 f(int i9, int i10, int i11, CharSequence charSequence, int i12, Drawable drawable, int i13, CharSequence charSequence2, b6 b6Var) {
        int i14;
        boolean z10;
        int i15;
        Context context = getContext();
        boolean z11 = this.f24000c;
        k kVar = this.f23999b;
        if (z11) {
            i14 = kVar.f23586o0;
        } else {
            i14 = kVar.f23584n0;
        }
        int i16 = i14;
        if (charSequence != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        w0 w0Var = new w0(context, this, i12, i16, z10, b6Var);
        w0Var.setTag(Integer.valueOf(i10));
        if (charSequence != null) {
            w0Var.A.setText(charSequence);
            if (i13 != 0) {
                i15 = i13;
            } else {
                i15 = -2;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i15, -1);
            int dp = AndroidUtilities.dp(14.0f);
            layoutParams.rightMargin = dp;
            layoutParams.leftMargin = dp;
            addView(w0Var, i9, layoutParams);
        } else {
            if (drawable != null) {
                if (drawable instanceof mi0) {
                    w0Var.f23924x.setAnimation((mi0) drawable);
                } else {
                    w0Var.f23924x.setImageDrawable(drawable);
                }
            } else if (i11 != 0) {
                w0Var.f23924x.setImageResource(i11);
            }
            addView(w0Var, i9, new LinearLayout.LayoutParams(i13, -1));
        }
        w0Var.setOnClickListener(new x(this, 0));
        if (charSequence2 != null) {
            w0Var.setContentDescription(charSequence2);
        }
        return w0Var;
    }

    public final w0 g(int i9, int i10, int i11) {
        int i12;
        boolean z10 = this.f24000c;
        k kVar = this.f23999b;
        if (z10) {
            i12 = kVar.m0;
        } else {
            i12 = kVar.f23581l0;
        }
        return b(i9, i10, null, i12, null, i11, null, null);
    }

    public int getItemsWidth() {
        int childCount = getChildCount();
        float f10 = Float.POSITIVE_INFINITY;
        float f11 = Float.NEGATIVE_INFINITY;
        boolean z10 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if ((childAt instanceof w0) && childAt.getVisibility() == 0) {
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
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof w0) && childAt.getVisibility() != 8) {
                i9 = childAt.getMeasuredWidth() + i9;
            }
        }
        return i9;
    }

    public int getVisibleItemsMeasuredWidthWithAlpha() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if ((childAt instanceof w0) && childAt.getVisibility() == 0) {
                f10 = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f10;
            }
        }
        return (int) f10;
    }

    public final w0 h(int i9, int i10, String str, int i11) {
        int i12;
        boolean z10 = this.f24000c;
        k kVar = this.f23999b;
        if (z10) {
            i12 = kVar.m0;
        } else {
            i12 = kVar.f23581l0;
        }
        return b(i9, i10, null, i12, null, i11, str, null);
    }

    public final w0 i(int i9, String str, Drawable drawable) {
        int i10;
        boolean z10 = this.f24000c;
        k kVar = this.f23999b;
        if (z10) {
            i10 = kVar.m0;
        } else {
            i10 = kVar.f23581l0;
        }
        return b(1, 0, null, i10, drawable, i9, str, null);
    }

    public final void j(boolean z10) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C && w0Var.s()) {
                    e5 e5Var = w0Var.D;
                    if (e5Var == null || e5Var.b()) {
                        this.f23999b.v(false);
                        w0Var.L(z10);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final w0 k(int i9) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i9));
        if (findViewWithTag instanceof w0) {
            return (w0) findViewWithTag;
        }
        return null;
    }

    public final int l() {
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                i9 = childAt.getMeasuredWidth() + i9;
            }
        }
        return i9;
    }

    public final y m(int i9, int i10, int i11, Drawable drawable, int i12, b6 b6Var) {
        if (this.f24001e == null) {
            this.f24001e = new ArrayList();
        }
        this.f24001e.add(Integer.valueOf(i9));
        ?? obj = new Object();
        obj.f23961i = 1.0f;
        obj.f23964l = 8;
        obj.f23955a = this;
        obj.f23956b = i9;
        obj.f23957c = i10;
        obj.f23958e = i11;
        obj.f23959f = drawable;
        obj.f23960g = i12;
        obj.h = b6Var;
        return obj;
    }

    public final y n(Drawable drawable, b6 b6Var) {
        int i9;
        boolean z10 = this.f24000c;
        k kVar = this.f23999b;
        if (z10) {
            i9 = kVar.m0;
        } else {
            i9 = kVar.f23581l0;
        }
        return m(14, 0, i9, drawable, AndroidUtilities.dp(48.0f), b6Var);
    }

    public final void o(int i9) {
        j jVar = this.f23999b.f23589q0;
        if (jVar != null) {
            jVar.b(i9);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        Runnable runnable = this.f24002f;
        if (runnable != null) {
            runnable.run();
        }
        k kVar = this.f23999b;
        if (kVar != null) {
            kVar.g();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        if (this.d) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
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
        super.onMeasure(i9, i10);
    }

    public final boolean p() {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.getSearchContainer() != null && w0Var.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(int i9, int i10) {
        w0 k10 = k(i9);
        if (k10 != null) {
            k10.setVisibility(i10);
        }
    }

    public final void r(float f10) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof w0) {
                ((w0) childAt).setTransitionOffset(f10);
            }
        }
    }

    public final void s() {
        int i9;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                boolean z10 = this.f24000c;
                k kVar = this.f23999b;
                if (z10) {
                    i9 = kVar.m0;
                } else {
                    i9 = kVar.f23581l0;
                }
                childAt.setBackgroundDrawable(f6.f0(i9, 1, -1));
            }
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            getChildAt(i9).setEnabled(z10);
        }
    }

    public void setFilter(of.m0 m0Var) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C) {
                    ArrayList arrayList = w0Var.f23904c0;
                    arrayList.add(m0Var);
                    if (w0Var.B.getTag() != null) {
                        w0Var.f23905d0 = arrayList.size() - 1;
                    }
                    w0Var.y();
                    return;
                }
            }
        }
    }

    public void setGlassMode(boolean z10) {
        this.d = z10;
    }

    public void setOnLayoutListener(Runnable runnable) {
        this.f24002f = runnable;
    }

    public void setPopupItemsSelectorColor(int i9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                ((w0) childAt).setPopupItemsSelectorColor(i9);
            }
        }
    }

    public void setSearchCursorColor(int i9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C) {
                    w0Var.getSearchField().setCursorColor(i9);
                    return;
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C) {
                    w0Var.H(str, false);
                    w0Var.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public final void t() {
        int i9;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                boolean z10 = this.f24000c;
                k kVar = this.f23999b;
                if (z10) {
                    i9 = kVar.f23586o0;
                } else {
                    i9 = kVar.f23584n0;
                }
                w0Var.setIconColor(i9);
            }
        }
    }
}
