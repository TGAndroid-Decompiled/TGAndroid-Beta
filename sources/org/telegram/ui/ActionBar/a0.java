package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xi0;
public class a0 extends LinearLayout {
    public boolean f22718a;
    public final l f22719b;
    public boolean f22720c;
    public boolean d;
    public ArrayList f22721e;
    public Runnable f22722f;

    public a0(Context context, l lVar) {
        super(context);
        this.f22718a = true;
        setOrientation(0);
        this.f22719b = lVar;
    }

    public final w0 a(int i10, int i11) {
        int i12;
        boolean z10 = this.f22720c;
        l lVar = this.f22719b;
        if (z10) {
            i12 = lVar.m0;
        } else {
            i12 = lVar.f23616l0;
        }
        return b(i10, i11, null, i12, null, AndroidUtilities.dp(48.0f), null, null);
    }

    public final w0 b(int i10, int i11, CharSequence charSequence, int i12, Drawable drawable, int i13, CharSequence charSequence2, c6 c6Var) {
        if (this.f22721e == null) {
            this.f22721e = new ArrayList();
        }
        this.f22721e.add(Integer.valueOf(i10));
        return f(-1, i10, i11, charSequence, i12, drawable, i13, charSequence2, c6Var);
    }

    public final w0 c(int i10, int i11, c6 c6Var) {
        int i12;
        boolean z10 = this.f22720c;
        l lVar = this.f22719b;
        if (z10) {
            i12 = lVar.m0;
        } else {
            i12 = lVar.f23616l0;
        }
        return b(i10, i11, null, i12, null, AndroidUtilities.dp(48.0f), null, c6Var);
    }

    public final w0 d(int i10, Drawable drawable) {
        int i11;
        boolean z10 = this.f22720c;
        l lVar = this.f22719b;
        if (z10) {
            i11 = lVar.m0;
        } else {
            i11 = lVar.f23616l0;
        }
        return b(i10, 0, null, i11, drawable, AndroidUtilities.dp(48.0f), null, null);
    }

    public final w0 e(int i10, String str) {
        int i11;
        boolean z10 = this.f22720c;
        l lVar = this.f22719b;
        if (z10) {
            i11 = lVar.m0;
        } else {
            i11 = lVar.f23616l0;
        }
        return b(i10, 0, str, i11, null, 0, str, null);
    }

    public final w0 f(int i10, int i11, int i12, CharSequence charSequence, int i13, Drawable drawable, int i14, CharSequence charSequence2, c6 c6Var) {
        int i15;
        boolean z10;
        int i16;
        Context context = getContext();
        boolean z11 = this.f22720c;
        l lVar = this.f22719b;
        if (z11) {
            i15 = lVar.f23621o0;
        } else {
            i15 = lVar.f23619n0;
        }
        int i17 = i15;
        if (charSequence != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        w0 w0Var = new w0(context, this, i13, i17, z10, c6Var);
        w0Var.setTag(Integer.valueOf(i11));
        if (charSequence != null) {
            w0Var.A.setText(charSequence);
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
                if (drawable instanceof xi0) {
                    w0Var.f23938x.setAnimation((xi0) drawable);
                } else {
                    w0Var.f23938x.setImageDrawable(drawable);
                }
            } else if (i12 != 0) {
                w0Var.f23938x.setImageResource(i12);
            }
            addView(w0Var, i10, new LinearLayout.LayoutParams(i14, -1));
        }
        w0Var.setOnClickListener(new y(this, 0));
        if (charSequence2 != null) {
            w0Var.setContentDescription(charSequence2);
        }
        return w0Var;
    }

    public final w0 g(int i10, int i11, int i12) {
        int i13;
        boolean z10 = this.f22720c;
        l lVar = this.f22719b;
        if (z10) {
            i13 = lVar.m0;
        } else {
            i13 = lVar.f23616l0;
        }
        return b(i10, i11, null, i13, null, i12, null, null);
    }

    public int getItemsWidth() {
        int childCount = getChildCount();
        float f9 = Float.POSITIVE_INFINITY;
        float f10 = Float.NEGATIVE_INFINITY;
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof w0) && childAt.getVisibility() == 0) {
                float x4 = childAt.getX();
                f9 = Math.min(f9, x4);
                f10 = Math.max(f10, childAt.getWidth() + x4);
                z10 = true;
            }
        }
        if (!z10) {
            return 0;
        }
        return (int) (f10 - f9);
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
        float f9 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof w0) && childAt.getVisibility() == 0) {
                f9 = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f9;
            }
        }
        return (int) f9;
    }

    public final w0 h(int i10, int i11, String str, int i12) {
        int i13;
        boolean z10 = this.f22720c;
        l lVar = this.f22719b;
        if (z10) {
            i13 = lVar.m0;
        } else {
            i13 = lVar.f23616l0;
        }
        return b(i10, i11, null, i13, null, i12, str, null);
    }

    public final w0 i(int i10, String str, Drawable drawable) {
        int i11;
        boolean z10 = this.f22720c;
        l lVar = this.f22719b;
        if (z10) {
            i11 = lVar.m0;
        } else {
            i11 = lVar.f23616l0;
        }
        return b(1, 0, null, i11, drawable, i10, str, null);
    }

    public final void j(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C && w0Var.s()) {
                    e5 e5Var = w0Var.D;
                    if (e5Var == null || e5Var.b()) {
                        this.f22719b.v(false);
                        w0Var.L(z10);
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

    public final z m(int i10, int i11, int i12, Drawable drawable, int i13, c6 c6Var) {
        if (this.f22721e == null) {
            this.f22721e = new ArrayList();
        }
        this.f22721e.add(Integer.valueOf(i10));
        ?? obj = new Object();
        obj.f24000i = 1.0f;
        obj.f24003l = 8;
        obj.f23994a = this;
        obj.f23995b = i10;
        obj.f23996c = i11;
        obj.f23997e = i12;
        obj.f23998f = drawable;
        obj.f23999g = i13;
        obj.h = c6Var;
        return obj;
    }

    public final z n(Drawable drawable, c6 c6Var) {
        int i10;
        boolean z10 = this.f22720c;
        l lVar = this.f22719b;
        if (z10) {
            i10 = lVar.m0;
        } else {
            i10 = lVar.f23616l0;
        }
        return m(14, 0, i10, drawable, AndroidUtilities.dp(48.0f), c6Var);
    }

    public final void o(int i10) {
        k kVar = this.f22719b.f23624q0;
        if (kVar != null) {
            kVar.b(i10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Runnable runnable = this.f22722f;
        if (runnable != null) {
            runnable.run();
        }
        l lVar = this.f22719b;
        if (lVar != null) {
            lVar.g();
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
        w0 k9 = k(i10);
        if (k9 != null) {
            k9.setVisibility(i11);
        }
    }

    public final void r(float f9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                ((w0) childAt).setTransitionOffset(f9);
            }
        }
    }

    public final void s() {
        int i10;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof w0) {
                boolean z10 = this.f22720c;
                l lVar = this.f22719b;
                if (z10) {
                    i10 = lVar.m0;
                } else {
                    i10 = lVar.f23616l0;
                }
                childAt.setBackgroundDrawable(g6.f0(i10, 1, -1));
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

    public void setFilter(rf.f0 f0Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C) {
                    ArrayList arrayList = w0Var.f23918c0;
                    arrayList.add(f0Var);
                    if (w0Var.B.getTag() != null) {
                        w0Var.f23919d0 = arrayList.size() - 1;
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
        this.f22722f = runnable;
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
                if (w0Var.C) {
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
                if (w0Var.C) {
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
                boolean z10 = this.f22720c;
                l lVar = this.f22719b;
                if (z10) {
                    i10 = lVar.f23621o0;
                } else {
                    i10 = lVar.f23619n0;
                }
                w0Var.setIconColor(i10);
            }
        }
    }
}
