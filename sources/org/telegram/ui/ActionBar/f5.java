package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.la;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.zg0;
public final class f5 extends LinearLayout {
    public final z4 f27473a;
    public final boolean f27474b;
    public final HashMap f27475c;
    public final ArrayList d;
    public final te.h f27476e;
    public boolean f27477f;

    public f5(Context context, z4 z4Var, boolean z9) {
        super(context);
        this.f27475c = new HashMap();
        this.d = new ArrayList();
        this.f27476e = new te.h(new d5(this), wq.h, 380L);
        this.f27477f = true;
        this.f27473a = z4Var;
        this.f27474b = z9;
        setOrientation(0);
        setGravity(21);
    }

    public static int f(View view) {
        int measuredWidth;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (view.getMeasuredWidth() > 0 || (measuredWidth = layoutParams.width) <= 0) {
            measuredWidth = view.getMeasuredWidth();
        }
        return measuredWidth + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    public static boolean h(View view) {
        if (view.getVisibility() != 8) {
            if (!(view instanceof g5) || ((g5) view).C0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final g5 a() {
        return b(10, 2131231244);
    }

    public final g5 b(int i7, int i10) {
        return c(i7, i10, null, null, org.telegram.messenger.g0.L(48.0f), null);
    }

    public final g5 c(int i7, int i10, String str, Drawable drawable, int i11, CharSequence charSequence) {
        int i12;
        int i13;
        boolean z9;
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        z4 z4Var = this.f27473a;
        boolean z10 = this.f27474b;
        if (z10) {
            i12 = z4Var.f28832i0;
        } else {
            i12 = z4Var.f28831h0;
        }
        if (z10) {
            i13 = z4Var.f28830g0;
        } else {
            i13 = z4Var.f28829f0;
        }
        if (str != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        g5 g5Var = new g5(context, this, i12, i13, z9, z4Var.f28819a);
        g5Var.setTag(Integer.valueOf(i7));
        if (str != null) {
            g5Var.E.setText(str);
            if (i11 == 0) {
                i11 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int L = org.telegram.messenger.g0.L(6.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
        } else {
            if (drawable instanceof zg0) {
                g5Var.f28461y.setAnimation((zg0) drawable);
            } else if (drawable != null) {
                g5Var.f28461y.setImageDrawable(drawable);
            } else if (i10 != 0) {
                g5Var.f28461y.setImageResource(i10);
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int i14 = -org.telegram.messenger.g0.L(5.0f);
            layoutParams.rightMargin = i14;
            layoutParams.leftMargin = i14;
        }
        addView(g5Var, -1, layoutParams);
        g5Var.setOnClickListener(new la(this, g5Var, i7, 1));
        if (charSequence != null) {
            g5Var.setContentDescription(charSequence);
        }
        return g5Var;
    }

    public final void d(int i7, int i10, int i11, String str) {
        c(i7, i10, null, null, i11, str);
    }

    public final void e() {
        int i7;
        Iterator it = this.f27475c.values().iterator();
        while (true) {
            i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            ((e5) it.next()).f27445b = false;
        }
        float width = getWidth() - getPaddingRight();
        te.h hVar = this.f27476e;
        float f10 = hVar.d.f55516f.f55524a;
        float min = Math.min(1.0f, getPillWidth() / org.telegram.messenger.g0.L(46.0f));
        ArrayList arrayList = hVar.f55519b;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            te.e eVar = (te.e) obj;
            e5 e5Var = (e5) eVar.f55507a;
            View view = e5Var.f27444a;
            RectF b10 = eVar.b();
            e5Var.f27445b = true;
            view.setTranslationX((((width - Math.max(f10, b10.right)) + b10.left) + ((LinearLayout.LayoutParams) view.getLayoutParams()).leftMargin) - view.getLeft());
            e5Var.c(eVar.c(), min);
        }
    }

    public final void g() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof r0) {
                ((r0) childAt).o();
            }
        }
    }

    public float getPillWidth() {
        te.g gVar = this.f27476e.d;
        return (org.telegram.messenger.g0.L(8.0f) * gVar.f55514c.f55524a) + gVar.f55516f.f55524a;
    }

    public float getTargetPillWidth() {
        View childAt;
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            if (h(getChildAt(i7))) {
                f10 += f(childAt);
            }
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        return f10 + org.telegram.messenger.g0.L(8.0f);
    }

    public final void i() {
        int i7;
        int i10;
        int i11;
        z4 z4Var = this.f27473a;
        boolean z9 = this.f27474b;
        if (z9) {
            i7 = z4Var.f28830g0;
        } else {
            i7 = z4Var.f28829f0;
        }
        if (z9) {
            i10 = z4Var.f28832i0;
        } else {
            i10 = z4Var.f28831h0;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof r0) {
                r0 r0Var = (r0) childAt;
                TextView textView = r0Var.E;
                r0Var.setIconColor(i7);
                if (textView != null) {
                    textView.setTextColor(i7);
                }
                if (textView != null) {
                    i11 = 5;
                } else {
                    i11 = 1;
                }
                r0Var.setBackground(m6.h0(i10, i11, -1));
            }
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        HashMap hashMap;
        boolean z10;
        super.onLayout(z9, i7, i10, i11, i12);
        ArrayList arrayList = this.d;
        arrayList.clear();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            hashMap = this.f27475c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            e5 e5Var = (e5) hashMap.get(childAt);
            if (e5Var != null && h(childAt)) {
                arrayList.add(e5Var);
            }
            i13++;
        }
        if (!this.f27477f && isLaidOut()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27476e.m(arrayList, z10);
        this.f27477f = false;
        e();
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            e5 e5Var2 = (e5) hashMap.get(childAt2);
            if (e5Var2 != null && !e5Var2.f27445b && childAt2.getVisibility() != 8 && !h(childAt2)) {
                if (childAt2 instanceof g5) {
                    ((g5) childAt2).X();
                } else {
                    childAt2.setVisibility(8);
                }
            }
        }
        this.f27473a.invalidate();
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f27475c.put(view, new e5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f27475c.remove(view);
    }
}
