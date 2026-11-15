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
import org.telegram.ui.Components.er;
public final class c5 extends LinearLayout {
    public final w4 f28492a;
    public final boolean f28493b;
    public final HashMap f28494c;
    public final ArrayList d;
    public final te.h f28495e;
    public boolean f28496f;

    public c5(Context context, w4 w4Var, boolean z10) {
        super(context);
        this.f28494c = new HashMap();
        this.d = new ArrayList();
        this.f28495e = new te.h(new a5(this), er.h, 380L);
        this.f28496f = true;
        this.f28492a = w4Var;
        this.f28493b = z10;
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
            if (!(view instanceof d5) || ((d5) view).D0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final d5 a() {
        return b(10, 2131231244);
    }

    public final d5 b(int i7, int i10) {
        return c(i7, i10, null, null, org.telegram.messenger.g0.L(48.0f), null);
    }

    public final d5 c(int i7, int i10, String str, Drawable drawable, int i11, CharSequence charSequence) {
        int i12;
        int i13;
        boolean z10;
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        w4 w4Var = this.f28492a;
        boolean z11 = this.f28493b;
        if (z11) {
            i12 = w4Var.f29820j0;
        } else {
            i12 = w4Var.f29819i0;
        }
        if (z11) {
            i13 = w4Var.f29818h0;
        } else {
            i13 = w4Var.f29817g0;
        }
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5 d5Var = new d5(context, this, i12, i13, z10, w4Var.f29806a);
        d5Var.setTag(Integer.valueOf(i7));
        if (str != null) {
            d5Var.F.setText(str);
            if (i11 == 0) {
                i11 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int L = org.telegram.messenger.g0.L(6.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
        } else {
            if (drawable instanceof ch0) {
                d5Var.f29528y.setAnimation((ch0) drawable);
            } else if (drawable != null) {
                d5Var.f29528y.setImageDrawable(drawable);
            } else if (i10 != 0) {
                d5Var.f29528y.setImageResource(i10);
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int i14 = -org.telegram.messenger.g0.L(5.0f);
            layoutParams.rightMargin = i14;
            layoutParams.leftMargin = i14;
        }
        addView(d5Var, -1, layoutParams);
        d5Var.setOnClickListener(new bi.x2(this, d5Var, i7, 3));
        if (charSequence != null) {
            d5Var.setContentDescription(charSequence);
        }
        return d5Var;
    }

    public final void d(int i7, int i10, int i11, String str) {
        c(i7, i10, null, null, i11, str);
    }

    public final void e() {
        int i7;
        Iterator it = this.f28494c.values().iterator();
        while (true) {
            i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            ((b5) it.next()).f28449b = false;
        }
        float width = getWidth() - getPaddingRight();
        te.h hVar = this.f28495e;
        float f10 = hVar.d.f57099f.f57107a;
        float min = Math.min(1.0f, getPillWidth() / org.telegram.messenger.g0.L(46.0f));
        ArrayList arrayList = hVar.f57102b;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            te.e eVar = (te.e) obj;
            b5 b5Var = (b5) eVar.f57090a;
            View view = b5Var.f28448a;
            RectF b10 = eVar.b();
            b5Var.f28449b = true;
            view.setTranslationX((((width - Math.max(f10, b10.right)) + b10.left) + ((LinearLayout.LayoutParams) view.getLayoutParams()).leftMargin) - view.getLeft());
            b5Var.c(eVar.c(), min);
        }
    }

    public final void g() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof q0) {
                ((q0) childAt).p();
            }
        }
    }

    public float getPillWidth() {
        te.g gVar = this.f28495e.d;
        return (org.telegram.messenger.g0.L(8.0f) * gVar.f57097c.f57107a) + gVar.f57099f.f57107a;
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
        w4 w4Var = this.f28492a;
        boolean z10 = this.f28493b;
        if (z10) {
            i7 = w4Var.f29818h0;
        } else {
            i7 = w4Var.f29817g0;
        }
        if (z10) {
            i10 = w4Var.f29820j0;
        } else {
            i10 = w4Var.f29819i0;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                TextView textView = q0Var.F;
                q0Var.setIconColor(i7);
                if (textView != null) {
                    textView.setTextColor(i7);
                }
                if (textView != null) {
                    i11 = 5;
                } else {
                    i11 = 1;
                }
                q0Var.setBackground(j6.h0(i10, i11, -1));
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        HashMap hashMap;
        boolean z11;
        super.onLayout(z10, i7, i10, i11, i12);
        ArrayList arrayList = this.d;
        arrayList.clear();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            hashMap = this.f28494c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            b5 b5Var = (b5) hashMap.get(childAt);
            if (b5Var != null && h(childAt)) {
                arrayList.add(b5Var);
            }
            i13++;
        }
        if (!this.f28496f && isLaidOut()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28495e.m(arrayList, z11);
        this.f28496f = false;
        e();
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            b5 b5Var2 = (b5) hashMap.get(childAt2);
            if (b5Var2 != null && !b5Var2.f28449b && childAt2.getVisibility() != 8 && !h(childAt2)) {
                if (childAt2 instanceof d5) {
                    ((d5) childAt2).Y();
                } else {
                    childAt2.setVisibility(8);
                }
            }
        }
        this.f28492a.invalidate();
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f28494c.put(view, new b5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f28494c.remove(view);
    }
}
