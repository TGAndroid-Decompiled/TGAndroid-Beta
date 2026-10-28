package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.pa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.yj0;
public final class x5 extends LinearLayout {
    public final r5 f23248a;
    public final boolean f23249b;
    public final HashMap f23250c;
    public final ArrayList d;
    public final oe.j e;
    public boolean f23251f;

    public x5(Context context, r5 r5Var, boolean z10) {
        super(context);
        this.f23250c = new HashMap();
        this.d = new ArrayList();
        this.e = new oe.j(new v5(this), ds.h, 380L);
        this.f23251f = true;
        this.f23248a = r5Var;
        this.f23249b = z10;
        setOrientation(0);
        setGravity(21);
    }

    public static int e(View view) {
        int measuredWidth;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (view.getMeasuredWidth() > 0 || (measuredWidth = layoutParams.width) <= 0) {
            measuredWidth = view.getMeasuredWidth();
        }
        return measuredWidth + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    public static boolean g(View view) {
        if (view.getVisibility() != 8) {
            if (!(view instanceof y5) || ((y5) view).A0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final y5 a(int i10, int i11) {
        return b(i10, i11, null, null, AndroidUtilities.dp(48.0f), null);
    }

    public final y5 b(int i10, int i11, String str, Drawable drawable, int i12, CharSequence charSequence) {
        int i13;
        int i14;
        boolean z10;
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        r5 r5Var = this.f23248a;
        boolean z11 = this.f23249b;
        if (z11) {
            i13 = r5Var.f23039g0;
        } else {
            i13 = r5Var.f23038f0;
        }
        if (z11) {
            i14 = r5Var.f23036e0;
        } else {
            i14 = r5Var.f23035d0;
        }
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        y5 y5Var = new y5(context, this, i13, i14, z10, r5Var.f23029a);
        y5Var.setTag(Integer.valueOf(i10));
        if (str != null) {
            y5Var.E.setText(str);
            if (i12 == 0) {
                i12 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i12, -1);
            int dp = AndroidUtilities.dp(6.0f);
            layoutParams.rightMargin = dp;
            layoutParams.leftMargin = dp;
        } else {
            if (drawable instanceof yj0) {
                y5Var.f23205x.setAnimation((yj0) drawable);
            } else if (drawable != null) {
                y5Var.f23205x.setImageDrawable(drawable);
            } else if (i11 != 0) {
                y5Var.f23205x.setImageResource(i11);
            }
            layoutParams = new LinearLayout.LayoutParams(i12, -1);
            int i15 = -AndroidUtilities.dp(5.0f);
            layoutParams.rightMargin = i15;
            layoutParams.leftMargin = i15;
        }
        addView(y5Var, -1, layoutParams);
        y5Var.setOnClickListener(new pa(this, y5Var, i10, 1));
        if (charSequence != null) {
            y5Var.setContentDescription(charSequence);
        }
        return y5Var;
    }

    public final void c(int i10, int i11, String str, int i12) {
        b(i10, i11, null, null, i12, str);
    }

    public final void d() {
        int i10;
        Iterator it = this.f23250c.values().iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            ((w5) it.next()).f23214b = false;
        }
        float width = getWidth() - getPaddingRight();
        oe.j jVar = this.e;
        float f7 = jVar.d.f19343f.f19350a;
        float min = Math.min(1.0f, getPillWidth() / AndroidUtilities.dp(46.0f));
        ArrayList arrayList = jVar.f19346b;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            oe.g gVar = (oe.g) obj;
            w5 w5Var = (w5) gVar.f19336a;
            View view = w5Var.f23213a;
            RectF b10 = gVar.b();
            w5Var.f23214b = true;
            view.setTranslationX((((width - Math.max(f7, b10.right)) + b10.left) + ((LinearLayout.LayoutParams) view.getLayoutParams()).leftMargin) - view.getLeft());
            w5Var.c(gVar.c(), min);
        }
    }

    public final void f() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                ((w0) childAt).o();
            }
        }
    }

    public float getPillWidth() {
        oe.i iVar = this.e.d;
        return (AndroidUtilities.dp(8.0f) * iVar.f19342c.f19350a) + iVar.f19343f.f19350a;
    }

    public float getTargetPillWidth() {
        View childAt;
        int childCount = getChildCount();
        float f7 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (g(getChildAt(i10))) {
                f7 += e(childAt);
            }
        }
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        return f7 + AndroidUtilities.dp(8.0f);
    }

    public final void h() {
        int i10;
        int i11;
        int i12;
        r5 r5Var = this.f23248a;
        boolean z10 = this.f23249b;
        if (z10) {
            i10 = r5Var.f23036e0;
        } else {
            i10 = r5Var.f23035d0;
        }
        if (z10) {
            i11 = r5Var.f23039g0;
        } else {
            i11 = r5Var.f23038f0;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                TextView textView = w0Var.E;
                w0Var.setIconColor(i10);
                if (textView != null) {
                    textView.setTextColor(i10);
                }
                if (textView != null) {
                    i12 = 5;
                } else {
                    i12 = 1;
                }
                w0Var.setBackground(y6.g0(i11, i12, -1));
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        HashMap hashMap;
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        ArrayList arrayList = this.d;
        arrayList.clear();
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            hashMap = this.f23250c;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            w5 w5Var = (w5) hashMap.get(childAt);
            if (w5Var != null && g(childAt)) {
                arrayList.add(w5Var);
            }
            i14++;
        }
        if (!this.f23251f && isLaidOut()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.e.q(arrayList, z11);
        this.f23251f = false;
        d();
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            w5 w5Var2 = (w5) hashMap.get(childAt2);
            if (w5Var2 != null && !w5Var2.f23214b && childAt2.getVisibility() != 8 && !g(childAt2)) {
                if (childAt2 instanceof y5) {
                    ((y5) childAt2).X();
                } else {
                    childAt2.setVisibility(8);
                }
            }
        }
        this.f23248a.invalidate();
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f23250c.put(view, new w5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f23250c.remove(view);
    }
}
