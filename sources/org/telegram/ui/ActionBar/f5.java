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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
public final class f5 extends LinearLayout {
    public final z4 f28958a;
    public final boolean f28959b;
    public final HashMap f28960c;
    public final ArrayList d;
    public final te.h f28961e;
    public boolean f28962f;

    public f5(Context context, z4 z4Var, boolean z10) {
        super(context);
        this.f28960c = new HashMap();
        this.d = new ArrayList();
        this.f28961e = new te.h(new d5(this), nr.h, 380L);
        this.f28962f = true;
        this.f28958a = z4Var;
        this.f28959b = z10;
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
            if (!(view instanceof g5) || ((g5) view).D0) {
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
        boolean z10;
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        z4 z4Var = this.f28958a;
        boolean z11 = this.f28959b;
        if (z11) {
            i12 = z4Var.f30336j0;
        } else {
            i12 = z4Var.f30335i0;
        }
        if (z11) {
            i13 = z4Var.f30334h0;
        } else {
            i13 = z4Var.f30333g0;
        }
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g5 g5Var = new g5(context, this, i12, i13, z10, z4Var.f30322a);
        g5Var.setTag(Integer.valueOf(i7));
        if (str != null) {
            g5Var.F.setText(str);
            if (i11 == 0) {
                i11 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int L = org.telegram.messenger.g0.L(6.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
        } else {
            if (drawable instanceof oh0) {
                g5Var.f29933y.setAnimation((oh0) drawable);
            } else if (drawable != null) {
                g5Var.f29933y.setImageDrawable(drawable);
            } else if (i10 != 0) {
                g5Var.f29933y.setImageResource(i10);
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int i14 = -org.telegram.messenger.g0.L(5.0f);
            layoutParams.rightMargin = i14;
            layoutParams.leftMargin = i14;
        }
        addView(g5Var, -1, layoutParams);
        g5Var.setOnClickListener(new bi.h5(this, g5Var, i7, 3));
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
        Iterator it = this.f28960c.values().iterator();
        while (true) {
            i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            ((e5) it.next()).f28934b = false;
        }
        float width = getWidth() - getPaddingRight();
        te.h hVar = this.f28961e;
        float f10 = hVar.d.f57718f.f57726a;
        float min = Math.min(1.0f, getPillWidth() / org.telegram.messenger.g0.L(46.0f));
        ArrayList arrayList = hVar.f57721b;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            te.e eVar = (te.e) obj;
            e5 e5Var = (e5) eVar.f57709a;
            View view = e5Var.f28933a;
            RectF b10 = eVar.b();
            e5Var.f28934b = true;
            view.setTranslationX((((width - Math.max(f10, b10.right)) + b10.left) + ((LinearLayout.LayoutParams) view.getLayoutParams()).leftMargin) - view.getLeft());
            e5Var.c(eVar.c(), min);
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
        te.g gVar = this.f28961e.d;
        return (org.telegram.messenger.g0.L(8.0f) * gVar.f57716c.f57726a) + gVar.f57718f.f57726a;
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
        z4 z4Var = this.f28958a;
        boolean z10 = this.f28959b;
        if (z10) {
            i7 = z4Var.f30334h0;
        } else {
            i7 = z4Var.f30333g0;
        }
        if (z10) {
            i10 = z4Var.f30336j0;
        } else {
            i10 = z4Var.f30335i0;
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
                q0Var.setBackground(m6.h0(i10, i11, -1));
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
            hashMap = this.f28960c;
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
        if (!this.f28962f && isLaidOut()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28961e.m(arrayList, z11);
        this.f28962f = false;
        e();
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            e5 e5Var2 = (e5) hashMap.get(childAt2);
            if (e5Var2 != null && !e5Var2.f28934b && childAt2.getVisibility() != 8 && !h(childAt2)) {
                if (childAt2 instanceof g5) {
                    ((g5) childAt2).Y();
                } else {
                    childAt2.setVisibility(8);
                }
            }
        }
        this.f28958a.invalidate();
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f28960c.put(view, new e5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f28960c.remove(view);
    }
}
