package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;

public final class ck0 implements View.OnLayoutChangeListener {

    public final f2.q0 f27474a;

    public final ArrayList f27475b;

    public final boolean f27476c;
    public final dk0 d;

    public final c2.x f27477e;

    public ck0(c2.x xVar, f2.q0 q0Var, ArrayList arrayList, boolean z10, dk0 dk0Var) {
        this.f27477e = xVar;
        this.f27474a = q0Var;
        this.f27475b = arrayList;
        this.f27476c = z10;
        this.d = dk0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int height;
        long jMin;
        View view2;
        c2.x xVar = this.f27477e;
        HashMap map = (HashMap) xVar.f2374k;
        zk0 zk0Var = (zk0) xVar.f2369e;
        zk0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        zk0Var.B0();
        int childCount = zk0Var.getChildCount();
        int i18 = 0;
        int top = 0;
        int bottom = 0;
        int i19 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f27475b;
            if (i18 >= childCount) {
                break;
            }
            View childAt = zk0Var.getChildAt(i18);
            arrayList2.add(childAt);
            if (childAt.getTop() < top) {
                top = childAt.getTop();
            }
            if (childAt.getBottom() > bottom) {
                bottom = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.l4) {
                ((org.telegram.ui.Cells.l4) childAt).c(true, false);
            }
            f2.q0 q0Var = this.f27474a;
            if (q0Var != null && (q0Var.f5815b || xVar.f2368c)) {
                zk0Var.getClass();
                long jI = q0Var.i(RecyclerView.R(childAt));
                if (map.containsKey(Long.valueOf(jI)) && (view2 = (View) map.get(Long.valueOf(jI))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.l4) {
                        ((org.telegram.ui.Cells.l4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    h7.a6 a6Var = (h7.a6) xVar.f2372i;
                    if (a6Var != null) {
                        a6Var.d(view2);
                    }
                    int top2 = childAt.getTop() - view2.getTop();
                    if (top2 != 0) {
                        i19 = top2;
                    }
                    z10 = true;
                }
            }
            i18++;
        }
        map.clear();
        int size = arrayList.size();
        int i20 = Integer.MAX_VALUE;
        int height2 = 0;
        int i21 = 0;
        while (i21 < size) {
            Object obj = arrayList.get(i21);
            i21++;
            View view3 = (View) obj;
            int bottom2 = view3.getBottom();
            int top3 = view3.getTop();
            if (bottom2 > height2) {
                height2 = bottom2;
            }
            if (top3 < i20) {
                i20 = top3;
            }
            if (view3.getParent() == null) {
                zk0Var.addView(view3);
                ((f2.k0) xVar.f2370f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.l4) {
                ((org.telegram.ui.Cells.l4) view3).c(true, true);
            }
        }
        int i22 = i20 == Integer.MAX_VALUE ? 0 : i20;
        h7.a6 a6Var2 = (h7.a6) xVar.f2372i;
        if (a6Var2 != null) {
            a6Var2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i19);
        } else {
            boolean z11 = this.f27476c;
            if (!z11) {
                height2 = zk0Var.getHeight() - i22;
            }
            height = (z11 ? -top : bottom - zk0Var.getHeight()) + height2;
        }
        final int paddingBottom = zk0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) xVar.f2371g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) xVar.f2371g).cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        xVar.f2371g = valueAnimatorOfFloat;
        final boolean z12 = this.f27476c;
        final int i23 = height;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i24;
                c2.x xVar2 = this.f27120a.f27477e;
                zk0 zk0Var2 = (zk0) xVar2.f2369e;
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i25 = 0;
                while (true) {
                    z13 = z12;
                    i24 = i23;
                    if (i25 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i25);
                    float y10 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y10 <= zk0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i24) * fFloatValue);
                        } else {
                            view4.setTranslationY(i24 * fFloatValue);
                        }
                    }
                    i25++;
                }
                int paddingBottom2 = paddingBottom - zk0Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i26 = 0; i26 < size3; i26++) {
                    View view5 = (View) arrayList4.get(i26);
                    if (z13) {
                        view5.setTranslationY(((1.0f - fFloatValue) * i24) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - fFloatValue) * (-i24));
                    }
                }
                zk0Var2.invalidate();
                ek0 ek0Var = (ek0) xVar2.h;
                if (ek0Var != null) {
                    ek0Var.b();
                }
            }
        });
        ((ValueAnimator) xVar.f2371g).addListener(new ag.x1(28, this, arrayList2));
        if (!xVar.d) {
            if (z10) {
                jMin = 600;
            } else {
                long measuredHeight = (long) (((i23 / zk0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                jMin = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) xVar.f2371g).setDuration(jMin);
            ((ValueAnimator) xVar.f2371g).setInterpolator(er.h);
        } else if (z10) {
            ((ValueAnimator) xVar.f2371g).setDuration(150L);
            ((ValueAnimator) xVar.f2371g).setInterpolator(er.f28123g);
        } else {
            long measuredHeight2 = (long) (((i23 / zk0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) xVar.f2371g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) xVar.f2371g).setInterpolator(er.h);
        }
        ((ValueAnimator) xVar.f2371g).start();
    }
}
