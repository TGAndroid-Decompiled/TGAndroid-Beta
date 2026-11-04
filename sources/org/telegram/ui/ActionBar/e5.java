package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.xq;
public final class e5 extends LinearLayout {
    public final y4 f27477a;
    public final boolean f27478b;
    public final HashMap f27479c;
    public final ArrayList d;
    public final qe.h f27480e;
    public boolean f27481f;

    public e5(Context context, y4 y4Var, boolean z10) {
        super(context);
        this.f27479c = new HashMap();
        this.d = new ArrayList();
        this.f27480e = new qe.h(new c5(this), xq.h, 380L);
        this.f27481f = true;
        this.f27477a = y4Var;
        this.f27478b = z10;
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
            if (!(view instanceof f5) || ((f5) view).D0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final f5 a() {
        return b(10, 2131231244);
    }

    public final f5 b(int i3, int i10) {
        return c(i3, i10, null, null, org.telegram.messenger.g0.L(48.0f), null);
    }

    public final f5 c(int i3, int i10, String str, Drawable drawable, int i11, CharSequence charSequence) {
        int i12;
        int i13;
        boolean z10;
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        y4 y4Var = this.f27477a;
        boolean z11 = this.f27478b;
        if (z11) {
            i12 = y4Var.f28864j0;
        } else {
            i12 = y4Var.f28863i0;
        }
        if (z11) {
            i13 = y4Var.f28862h0;
        } else {
            i13 = y4Var.f28861g0;
        }
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5 f5Var = new f5(context, this, i12, i13, z10, y4Var.f28850a);
        f5Var.setTag(Integer.valueOf(i3));
        if (str != null) {
            f5Var.F.setText(str);
            if (i11 == 0) {
                i11 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int L = org.telegram.messenger.g0.L(6.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
        } else {
            if (drawable instanceof ch0) {
                f5Var.f28471y.setAnimation((ch0) drawable);
            } else if (drawable != null) {
                f5Var.f28471y.setImageDrawable(drawable);
            } else if (i10 != 0) {
                f5Var.f28471y.setImageResource(i10);
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int i14 = -org.telegram.messenger.g0.L(5.0f);
            layoutParams.rightMargin = i14;
            layoutParams.leftMargin = i14;
        }
        addView(f5Var, -1, layoutParams);
        f5Var.setOnClickListener(new ai.h3(this, f5Var, i3, 3));
        if (charSequence != null) {
            f5Var.setContentDescription(charSequence);
        }
        return f5Var;
    }

    public final void d(int i3, int i10, int i11, String str) {
        c(i3, i10, null, null, i11, str);
    }

    public final void e() {
        int i3;
        Iterator it = this.f27479c.values().iterator();
        while (true) {
            i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            ((d5) it.next()).f27461b = false;
        }
        float width = getWidth() - getPaddingRight();
        qe.h hVar = this.f27480e;
        float f10 = hVar.d.f53858f.f53866a;
        float min = Math.min(1.0f, getPillWidth() / org.telegram.messenger.g0.L(46.0f));
        ArrayList arrayList = hVar.f53861b;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            qe.e eVar = (qe.e) obj;
            d5 d5Var = (d5) eVar.f53849a;
            View view = d5Var.f27460a;
            RectF b10 = eVar.b();
            d5Var.f27461b = true;
            view.setTranslationX((((width - Math.max(f10, b10.right)) + b10.left) + ((LinearLayout.LayoutParams) view.getLayoutParams()).leftMargin) - view.getLeft());
            d5Var.c(eVar.c(), min);
        }
    }

    public final void g() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof q0) {
                ((q0) childAt).o();
            }
        }
    }

    public float getPillWidth() {
        qe.g gVar = this.f27480e.d;
        return (org.telegram.messenger.g0.L(8.0f) * gVar.f53856c.f53866a) + gVar.f53858f.f53866a;
    }

    public float getTargetPillWidth() {
        View childAt;
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            if (h(getChildAt(i3))) {
                f10 += f(childAt);
            }
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        return f10 + org.telegram.messenger.g0.L(8.0f);
    }

    public final void i() {
        int i3;
        int i10;
        int i11;
        y4 y4Var = this.f27477a;
        boolean z10 = this.f27478b;
        if (z10) {
            i3 = y4Var.f28862h0;
        } else {
            i3 = y4Var.f28861g0;
        }
        if (z10) {
            i10 = y4Var.f28864j0;
        } else {
            i10 = y4Var.f28863i0;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                TextView textView = q0Var.F;
                q0Var.setIconColor(i3);
                if (textView != null) {
                    textView.setTextColor(i3);
                }
                if (textView != null) {
                    i11 = 5;
                } else {
                    i11 = 1;
                }
                q0Var.setBackground(k6.h0(i10, i11, -1));
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        HashMap hashMap;
        boolean z11;
        super.onLayout(z10, i3, i10, i11, i12);
        ArrayList arrayList = this.d;
        arrayList.clear();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            hashMap = this.f27479c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            d5 d5Var = (d5) hashMap.get(childAt);
            if (d5Var != null && h(childAt)) {
                arrayList.add(d5Var);
            }
            i13++;
        }
        if (!this.f27481f && isLaidOut()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27480e.m(arrayList, z11);
        this.f27481f = false;
        e();
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            d5 d5Var2 = (d5) hashMap.get(childAt2);
            if (d5Var2 != null && !d5Var2.f27461b && childAt2.getVisibility() != 8 && !h(childAt2)) {
                if (childAt2 instanceof f5) {
                    ((f5) childAt2).X();
                } else {
                    childAt2.setVisibility(8);
                }
            }
        }
        this.f27477a.invalidate();
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f27479c.put(view, new d5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f27479c.remove(view);
    }
}
