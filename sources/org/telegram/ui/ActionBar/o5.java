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
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gr;
public final class o5 extends LinearLayout {
    public final i5 f20625a;
    public final boolean f20626b;
    public final HashMap f20627c;
    public final ArrayList d;
    public final fe.k e;
    public boolean f20628f;

    public o5(Context context, i5 i5Var, boolean z10) {
        super(context);
        this.f20627c = new HashMap();
        this.d = new ArrayList();
        this.e = new fe.k(new m5(this), gr.h, 380L);
        this.f20628f = true;
        this.f20625a = i5Var;
        this.f20626b = z10;
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
            if (!(view instanceof p5) || ((p5) view).C0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final p5 a() {
        return b(10, 2131231245);
    }

    public final p5 b(int i10, int i11) {
        return c(i10, i11, null, null, org.telegram.messenger.i0.L(48.0f), null);
    }

    public final p5 c(int i10, int i11, String str, Drawable drawable, int i12, CharSequence charSequence) {
        int i13;
        int i14;
        boolean z10;
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        i5 i5Var = this.f20625a;
        boolean z11 = this.f20626b;
        if (z11) {
            i13 = i5Var.f20417i0;
        } else {
            i13 = i5Var.f20416h0;
        }
        if (z11) {
            i14 = i5Var.f20415g0;
        } else {
            i14 = i5Var.f20414f0;
        }
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        p5 p5Var = new p5(context, this, i13, i14, z10, i5Var.f20405a);
        p5Var.setTag(Integer.valueOf(i10));
        if (str != null) {
            p5Var.E.setText(str);
            if (i12 == 0) {
                i12 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i12, -1);
            int L = org.telegram.messenger.i0.L(6.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
        } else {
            if (drawable instanceof bi0) {
                p5Var.f20856y.setAnimation((bi0) drawable);
            } else if (drawable != null) {
                p5Var.f20856y.setImageDrawable(drawable);
            } else if (i11 != 0) {
                p5Var.f20856y.setImageResource(i11);
            }
            layoutParams = new LinearLayout.LayoutParams(i12, -1);
            int i15 = -org.telegram.messenger.i0.L(5.0f);
            layoutParams.rightMargin = i15;
            layoutParams.leftMargin = i15;
        }
        addView(p5Var, -1, layoutParams);
        p5Var.setOnClickListener(new jg.w1(this, p5Var, i10, 1));
        if (charSequence != null) {
            p5Var.setContentDescription(charSequence);
        }
        return p5Var;
    }

    public final void d(int i10, int i11, String str, int i12) {
        c(i10, i11, null, null, i12, str);
    }

    public final void e() {
        int i10;
        Iterator it = this.f20627c.values().iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            ((n5) it.next()).f20613b = false;
        }
        float width = getWidth() - getPaddingRight();
        fe.k kVar = this.e;
        float f7 = kVar.d.f7041f.f7048a;
        float min = Math.min(1.0f, getPillWidth() / org.telegram.messenger.i0.L(46.0f));
        ArrayList arrayList = kVar.f7044b;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            fe.h hVar = (fe.h) obj;
            n5 n5Var = (n5) hVar.f7034a;
            View view = n5Var.f20612a;
            RectF b10 = hVar.b();
            n5Var.f20613b = true;
            view.setTranslationX((((width - Math.max(f7, b10.right)) + b10.left) + ((LinearLayout.LayoutParams) view.getLayoutParams()).leftMargin) - view.getLeft());
            n5Var.c(hVar.c(), min);
        }
    }

    public final void g() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t0) {
                ((t0) childAt).o();
            }
        }
    }

    public float getPillWidth() {
        fe.j jVar = this.e.d;
        return (org.telegram.messenger.i0.L(8.0f) * jVar.f7040c.f7048a) + jVar.f7041f.f7048a;
    }

    public float getTargetPillWidth() {
        View childAt;
        int childCount = getChildCount();
        float f7 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (h(getChildAt(i10))) {
                f7 += f(childAt);
            }
        }
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        return f7 + org.telegram.messenger.i0.L(8.0f);
    }

    public final void i() {
        int i10;
        int i11;
        int i12;
        i5 i5Var = this.f20625a;
        boolean z10 = this.f20626b;
        if (z10) {
            i10 = i5Var.f20415g0;
        } else {
            i10 = i5Var.f20414f0;
        }
        if (z10) {
            i11 = i5Var.f20417i0;
        } else {
            i11 = i5Var.f20416h0;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt instanceof t0) {
                t0 t0Var = (t0) childAt;
                TextView textView = t0Var.E;
                t0Var.setIconColor(i10);
                if (textView != null) {
                    textView.setTextColor(i10);
                }
                if (textView != null) {
                    i12 = 5;
                } else {
                    i12 = 1;
                }
                t0Var.setBackground(t6.h0(i11, i12, -1));
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
            hashMap = this.f20627c;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            n5 n5Var = (n5) hashMap.get(childAt);
            if (n5Var != null && h(childAt)) {
                arrayList.add(n5Var);
            }
            i14++;
        }
        if (!this.f20628f && isLaidOut()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.e.q(arrayList, z11);
        this.f20628f = false;
        e();
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            n5 n5Var2 = (n5) hashMap.get(childAt2);
            if (n5Var2 != null && !n5Var2.f20613b && childAt2.getVisibility() != 8 && !h(childAt2)) {
                if (childAt2 instanceof p5) {
                    ((p5) childAt2).X();
                } else {
                    childAt2.setVisibility(8);
                }
            }
        }
        this.f20625a.invalidate();
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f20627c.put(view, new n5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f20627c.remove(view);
    }
}
