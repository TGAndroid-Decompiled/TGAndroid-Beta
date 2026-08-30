package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gj0;
public class z extends LinearLayout {
    public boolean f20772a;
    public final k f20773b;
    public boolean f20774c;
    public boolean d;
    public ArrayList e;
    public Runnable f20775f;

    public z(Context context, k kVar) {
        super(context);
        this.f20772a = true;
        setOrientation(0);
        this.f20773b = kVar;
    }

    public final w0 a(int i10, int i11) {
        int i12;
        boolean z4 = this.f20774c;
        k kVar = this.f20773b;
        if (z4) {
            i12 = kVar.f20335n0;
        } else {
            i12 = kVar.m0;
        }
        return b(i10, i11, null, i12, null, AndroidUtilities.dp(48.0f), null, null);
    }

    public final w0 b(int i10, int i11, CharSequence charSequence, int i12, Drawable drawable, int i13, CharSequence charSequence2, f6 f6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i10));
        return f(-1, i10, i11, charSequence, i12, drawable, i13, charSequence2, f6Var);
    }

    public final w0 c(int i10, int i11, f6 f6Var) {
        int i12;
        boolean z4 = this.f20774c;
        k kVar = this.f20773b;
        if (z4) {
            i12 = kVar.f20335n0;
        } else {
            i12 = kVar.m0;
        }
        return b(i10, i11, null, i12, null, AndroidUtilities.dp(48.0f), null, f6Var);
    }

    public final w0 d(int i10, Drawable drawable) {
        int i11;
        boolean z4 = this.f20774c;
        k kVar = this.f20773b;
        if (z4) {
            i11 = kVar.f20335n0;
        } else {
            i11 = kVar.m0;
        }
        return b(i10, 0, null, i11, drawable, AndroidUtilities.dp(48.0f), null, null);
    }

    public final w0 e(int i10, String str) {
        int i11;
        boolean z4 = this.f20774c;
        k kVar = this.f20773b;
        if (z4) {
            i11 = kVar.f20335n0;
        } else {
            i11 = kVar.m0;
        }
        return b(i10, 0, str, i11, null, 0, str, null);
    }

    public final w0 f(int i10, int i11, int i12, CharSequence charSequence, int i13, Drawable drawable, int i14, CharSequence charSequence2, f6 f6Var) {
        int i15;
        boolean z4;
        int i16;
        Context context = getContext();
        boolean z10 = this.f20774c;
        k kVar = this.f20773b;
        if (z10) {
            i15 = kVar.f20339p0;
        } else {
            i15 = kVar.f20337o0;
        }
        int i17 = i15;
        if (charSequence != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        w0 w0Var = new w0(context, this, i13, i17, z4, f6Var);
        w0Var.setTag(Integer.valueOf(i11));
        if (charSequence != null) {
            w0Var.B.setText(charSequence);
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
                if (drawable instanceof gj0) {
                    w0Var.f20672x.setAnimation((gj0) drawable);
                } else {
                    w0Var.f20672x.setImageDrawable(drawable);
                }
            } else if (i12 != 0) {
                w0Var.f20672x.setImageResource(i12);
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
        boolean z4 = this.f20774c;
        k kVar = this.f20773b;
        if (z4) {
            i13 = kVar.f20335n0;
        } else {
            i13 = kVar.m0;
        }
        return b(i10, i11, null, i13, null, i12, null, null);
    }

    public int getItemsWidth() {
        int childCount = getChildCount();
        float f10 = Float.POSITIVE_INFINITY;
        float f11 = Float.NEGATIVE_INFINITY;
        boolean z4 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof w0) && childAt.getVisibility() == 0) {
                float x10 = childAt.getX();
                f10 = Math.min(f10, x10);
                f11 = Math.max(f11, childAt.getWidth() + x10);
                z4 = true;
            }
        }
        if (!z4) {
            return 0;
        }
        return (int) (f11 - f10);
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
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof w0) && childAt.getVisibility() == 0) {
                f10 = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f10;
            }
        }
        return (int) f10;
    }

    public final w0 h(int i10, int i11, String str, int i12) {
        int i13;
        boolean z4 = this.f20774c;
        k kVar = this.f20773b;
        if (z4) {
            i13 = kVar.f20335n0;
        } else {
            i13 = kVar.m0;
        }
        return b(i10, i11, null, i13, null, i12, str, null);
    }

    public final w0 i(int i10, String str, Drawable drawable) {
        int i11;
        boolean z4 = this.f20774c;
        k kVar = this.f20773b;
        if (z4) {
            i11 = kVar.f20335n0;
        } else {
            i11 = kVar.m0;
        }
        return b(1, 0, null, i11, drawable, i10, str, null);
    }

    public final void j(boolean z4) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.D && w0Var.s()) {
                    h5 h5Var = w0Var.E;
                    if (h5Var == null || h5Var.b()) {
                        this.f20773b.v(false);
                        w0Var.L(z4);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final w0 k(int i10) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i10));
        if (findViewWithTag instanceof w0) {
            return (w0) findViewWithTag;
        }
        return null;
    }

    public final int l() {
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

    public final y m(int i10, int i11, int i12, Drawable drawable, int i13, f6 f6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i10));
        ?? obj = new Object();
        obj.f20738i = 1.0f;
        obj.f20741l = 8;
        obj.f20733a = this;
        obj.f20734b = i10;
        obj.f20735c = i11;
        obj.e = i12;
        obj.f20736f = drawable;
        obj.f20737g = i13;
        obj.h = f6Var;
        return obj;
    }

    public final y n(Drawable drawable, f6 f6Var) {
        int i10;
        boolean z4 = this.f20774c;
        k kVar = this.f20773b;
        if (z4) {
            i10 = kVar.f20335n0;
        } else {
            i10 = kVar.m0;
        }
        return m(14, 0, i10, drawable, AndroidUtilities.dp(48.0f), f6Var);
    }

    public final void o(int i10) {
        j jVar = this.f20773b.f20343r0;
        if (jVar != null) {
            jVar.b(i10);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        Runnable runnable = this.f20775f;
        if (runnable != null) {
            runnable.run();
        }
        k kVar = this.f20773b;
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

    public final boolean p() {
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

    public final void q(int i10, int i11) {
        w0 k10 = k(i10);
        if (k10 != null) {
            k10.setVisibility(i11);
        }
    }

    public final void r(float f10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                ((w0) childAt).setTransitionOffset(f10);
            }
        }
    }

    public final void s() {
        int i10;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof w0) {
                boolean z4 = this.f20774c;
                k kVar = this.f20773b;
                if (z4) {
                    i10 = kVar.f20335n0;
                } else {
                    i10 = kVar.m0;
                }
                childAt.setBackgroundDrawable(j6.f0(i10, 1, -1));
            }
        }
    }

    @Override
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setEnabled(z4);
        }
    }

    public void setFilter(tf.e0 e0Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.D) {
                    ArrayList arrayList = w0Var.f20653d0;
                    arrayList.add(e0Var);
                    if (w0Var.C.getTag() != null) {
                        w0Var.f20654e0 = arrayList.size() - 1;
                    }
                    w0Var.y();
                    return;
                }
            }
        }
    }

    public void setGlassMode(boolean z4) {
        this.d = z4;
    }

    public void setOnLayoutListener(Runnable runnable) {
        this.f20775f = runnable;
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
                if (w0Var.D) {
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
                if (w0Var.D) {
                    w0Var.H(str, false);
                    w0Var.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public final void t() {
        int i10;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                boolean z4 = this.f20774c;
                k kVar = this.f20773b;
                if (z4) {
                    i10 = kVar.f20339p0;
                } else {
                    i10 = kVar.f20337o0;
                }
                w0Var.setIconColor(i10);
            }
        }
    }
}
