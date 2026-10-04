package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class yk0 implements View.OnLayoutChangeListener {
    public final s4.h0 f33168a;
    public final ArrayList f33169b;
    public final boolean f33170c;
    public final zk0 d;
    public final bl0 f33171e;

    public yk0(bl0 bl0Var, s4.h0 h0Var, ArrayList arrayList, boolean z10, zk0 zk0Var) {
        this.f33171e = bl0Var;
        this.f33168a = h0Var;
        this.f33169b = arrayList;
        this.f33170c = z10;
        this.d = zk0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int i18;
        int height;
        int i19;
        long min;
        View view2;
        bl0 bl0Var = this.f33171e;
        HashMap hashMap = (HashMap) bl0Var.f25002k;
        zl0 zl0Var = (zl0) bl0Var.f24997e;
        zl0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        zl0Var.C0();
        int childCount = zl0Var.getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f33169b;
            if (i20 >= childCount) {
                break;
            }
            View childAt = zl0Var.getChildAt(i20);
            arrayList2.add(childAt);
            if (childAt.getTop() < i21) {
                i21 = childAt.getTop();
            }
            if (childAt.getBottom() > i22) {
                i22 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.o4) {
                ((org.telegram.ui.Cells.o4) childAt).c(true, false);
            }
            s4.h0 h0Var = this.f33168a;
            if (h0Var != null && (h0Var.f46581b || bl0Var.f24996c)) {
                zl0Var.getClass();
                long i24 = h0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i24)) && (view2 = (View) hashMap.get(Long.valueOf(i24))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    w7.a6 a6Var = (w7.a6) bl0Var.f25000i;
                    if (a6Var != null) {
                        a6Var.d(view2);
                    }
                    int top = childAt.getTop() - view2.getTop();
                    if (top != 0) {
                        i23 = top;
                    }
                    z10 = true;
                }
            }
            i20++;
        }
        hashMap.clear();
        int size = arrayList.size();
        int i25 = Integer.MAX_VALUE;
        int i26 = 0;
        int i27 = 0;
        while (i27 < size) {
            Object obj = arrayList.get(i27);
            i27++;
            View view3 = (View) obj;
            int bottom = view3.getBottom();
            int top2 = view3.getTop();
            if (bottom > i26) {
                i26 = bottom;
            }
            if (top2 < i25) {
                i25 = top2;
            }
            if (view3.getParent() == null) {
                zl0Var.addView(view3);
                ((s4.c0) bl0Var.f24998f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.o4) {
                ((org.telegram.ui.Cells.o4) view3).c(true, true);
            }
        }
        if (i25 == Integer.MAX_VALUE) {
            i18 = 0;
        } else {
            i18 = i25;
        }
        w7.a6 a6Var2 = (w7.a6) bl0Var.f25000i;
        if (a6Var2 != null) {
            a6Var2.b();
        }
        if (arrayList.isEmpty()) {
            i19 = Math.abs(i23);
        } else {
            boolean z11 = this.f33170c;
            if (!z11) {
                i26 = zl0Var.getHeight() - i18;
            }
            if (z11) {
                height = -i21;
            } else {
                height = i22 - zl0Var.getHeight();
            }
            i19 = height + i26;
        }
        final int paddingBottom = zl0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) bl0Var.f24999g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) bl0Var.f24999g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        bl0Var.f24999g = ofFloat;
        final boolean z12 = this.f33170c;
        final int i28 = i19;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i29;
                bl0 bl0Var2 = yk0.this.f33171e;
                zl0 zl0Var2 = (zl0) bl0Var2.f24997e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i30 = 0;
                while (true) {
                    z13 = z12;
                    i29 = i28;
                    if (i30 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i30);
                    float y3 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= zl0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i29) * floatValue);
                        } else {
                            view4.setTranslationY(i29 * floatValue);
                        }
                    }
                    i30++;
                }
                int paddingBottom2 = paddingBottom - zl0Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i31 = 0; i31 < size3; i31++) {
                    View view5 = (View) arrayList4.get(i31);
                    if (z13) {
                        view5.setTranslationY(((1.0f - floatValue) * i29) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - floatValue) * (-i29));
                    }
                }
                zl0Var2.invalidate();
                al0 al0Var = (al0) bl0Var2.h;
                if (al0Var != null) {
                    al0Var.e();
                }
            }
        });
        ((ValueAnimator) bl0Var.f24999g).addListener(new ai.z(28, this, arrayList2));
        long j3 = 300;
        if (bl0Var.d) {
            if (z10) {
                ((ValueAnimator) bl0Var.f24999g).setDuration(150L);
                ((ValueAnimator) bl0Var.f24999g).setInterpolator(tr.f31142g);
            } else {
                long measuredHeight = ((i28 / zl0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j3 = measuredHeight;
                }
                ((ValueAnimator) bl0Var.f24999g).setDuration(Math.min(j3, 1300L));
                ((ValueAnimator) bl0Var.f24999g).setInterpolator(tr.h);
            }
        } else {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight2 = ((i28 / zl0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j3 = measuredHeight2;
                }
                min = Math.min(j3, 1300L);
            }
            ((ValueAnimator) bl0Var.f24999g).setDuration(min);
            ((ValueAnimator) bl0Var.f24999g).setInterpolator(tr.h);
        }
        ((ValueAnimator) bl0Var.f24999g).start();
    }
}
