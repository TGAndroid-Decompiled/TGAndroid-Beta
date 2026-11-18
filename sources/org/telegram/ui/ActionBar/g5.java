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
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
public final class g5 extends LinearLayout {
    public final a5 f28975a;
    public final boolean f28976b;
    public final HashMap f28977c;
    public final ArrayList d;
    public final te.h f28978e;
    public boolean f28979f;

    public g5(Context context, a5 a5Var, boolean z10) {
        super(context);
        this.f28977c = new HashMap();
        this.d = new ArrayList();
        this.f28978e = new te.h(new e5(this), lr.h, 380L);
        this.f28979f = true;
        this.f28975a = a5Var;
        this.f28976b = z10;
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
            if (!(view instanceof h5) || ((h5) view).D0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final h5 a() {
        return b(10, 2131231244);
    }

    public final h5 b(int i7, int i10) {
        return c(i7, i10, null, null, org.telegram.messenger.g0.L(48.0f), null);
    }

    public final h5 c(int i7, int i10, String str, Drawable drawable, int i11, CharSequence charSequence) {
        int i12;
        int i13;
        boolean z10;
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        a5 a5Var = this.f28975a;
        boolean z11 = this.f28976b;
        if (z11) {
            i12 = a5Var.f28774j0;
        } else {
            i12 = a5Var.f28773i0;
        }
        if (z11) {
            i13 = a5Var.f28772h0;
        } else {
            i13 = a5Var.f28771g0;
        }
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        h5 h5Var = new h5(context, this, i12, i13, z10, a5Var.f28760a);
        h5Var.setTag(Integer.valueOf(i7));
        if (str != null) {
            h5Var.F.setText(str);
            if (i11 == 0) {
                i11 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int L = org.telegram.messenger.g0.L(6.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
        } else {
            if (drawable instanceof mh0) {
                h5Var.f29949y.setAnimation((mh0) drawable);
            } else if (drawable != null) {
                h5Var.f29949y.setImageDrawable(drawable);
            } else if (i10 != 0) {
                h5Var.f29949y.setImageResource(i10);
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int i14 = -org.telegram.messenger.g0.L(5.0f);
            layoutParams.rightMargin = i14;
            layoutParams.leftMargin = i14;
        }
        addView(h5Var, -1, layoutParams);
        h5Var.setOnClickListener(new bi.f5(this, h5Var, i7, 3));
        if (charSequence != null) {
            h5Var.setContentDescription(charSequence);
        }
        return h5Var;
    }

    public final void d(int i7, int i10, int i11, String str) {
        c(i7, i10, null, null, i11, str);
    }

    public final void e() {
        int i7;
        Iterator it = this.f28977c.values().iterator();
        while (true) {
            i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            ((f5) it.next()).f28952b = false;
        }
        float width = getWidth() - getPaddingRight();
        te.h hVar = this.f28978e;
        float f10 = hVar.d.f57675f.f57683a;
        float min = Math.min(1.0f, getPillWidth() / org.telegram.messenger.g0.L(46.0f));
        ArrayList arrayList = hVar.f57678b;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            te.e eVar = (te.e) obj;
            f5 f5Var = (f5) eVar.f57666a;
            View view = f5Var.f28951a;
            RectF b10 = eVar.b();
            f5Var.f28952b = true;
            view.setTranslationX((((width - Math.max(f10, b10.right)) + b10.left) + ((LinearLayout.LayoutParams) view.getLayoutParams()).leftMargin) - view.getLeft());
            f5Var.c(eVar.c(), min);
        }
    }

    public final void g() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof r0) {
                ((r0) childAt).p();
            }
        }
    }

    public float getPillWidth() {
        te.g gVar = this.f28978e.d;
        return (org.telegram.messenger.g0.L(8.0f) * gVar.f57673c.f57683a) + gVar.f57675f.f57683a;
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
        a5 a5Var = this.f28975a;
        boolean z10 = this.f28976b;
        if (z10) {
            i7 = a5Var.f28772h0;
        } else {
            i7 = a5Var.f28771g0;
        }
        if (z10) {
            i10 = a5Var.f28774j0;
        } else {
            i10 = a5Var.f28773i0;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof r0) {
                r0 r0Var = (r0) childAt;
                TextView textView = r0Var.F;
                r0Var.setIconColor(i7);
                if (textView != null) {
                    textView.setTextColor(i7);
                }
                if (textView != null) {
                    i11 = 5;
                } else {
                    i11 = 1;
                }
                r0Var.setBackground(n6.h0(i10, i11, -1));
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
            hashMap = this.f28977c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            f5 f5Var = (f5) hashMap.get(childAt);
            if (f5Var != null && h(childAt)) {
                arrayList.add(f5Var);
            }
            i13++;
        }
        if (!this.f28979f && isLaidOut()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28978e.m(arrayList, z11);
        this.f28979f = false;
        e();
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            f5 f5Var2 = (f5) hashMap.get(childAt2);
            if (f5Var2 != null && !f5Var2.f28952b && childAt2.getVisibility() != 8 && !h(childAt2)) {
                if (childAt2 instanceof h5) {
                    ((h5) childAt2).Y();
                } else {
                    childAt2.setVisibility(8);
                }
            }
        }
        this.f28975a.invalidate();
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f28977c.put(view, new f5(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f28977c.remove(view);
    }
}
