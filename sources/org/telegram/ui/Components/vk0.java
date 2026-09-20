package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class vk0 implements View.OnLayoutChangeListener {
    public final s4.h0 f29173a;
    public final ArrayList f29174b;
    public final boolean f29175c;
    public final wk0 d;
    public final yk0 e;

    public vk0(yk0 yk0Var, s4.h0 h0Var, ArrayList arrayList, boolean z10, wk0 wk0Var) {
        this.e = yk0Var;
        this.f29173a = h0Var;
        this.f29174b = arrayList;
        this.f29175c = z10;
        this.d = wk0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int i18;
        int height;
        int i19;
        long min;
        View view2;
        yk0 yk0Var = this.e;
        HashMap hashMap = (HashMap) yk0Var.f30577k;
        vl0 vl0Var = (vl0) yk0Var.e;
        vl0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        vl0Var.C0();
        int childCount = vl0Var.getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f29174b;
            if (i20 >= childCount) {
                break;
            }
            View childAt = vl0Var.getChildAt(i20);
            arrayList2.add(childAt);
            if (childAt.getTop() < i21) {
                i21 = childAt.getTop();
            }
            if (childAt.getBottom() > i22) {
                i22 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) childAt).c(true, false);
            }
            s4.h0 h0Var = this.f29173a;
            if (h0Var != null && (h0Var.f43024b || yk0Var.f30572c)) {
                vl0Var.getClass();
                long i24 = h0Var.i(RecyclerView.S(childAt));
                if (hashMap.containsKey(Long.valueOf(i24)) && (view2 = (View) hashMap.get(Long.valueOf(i24))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    w7.z5 z5Var = (w7.z5) yk0Var.f30575i;
                    if (z5Var != null) {
                        z5Var.d(view2);
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
                vl0Var.addView(view3);
                ((s4.c0) yk0Var.f30573f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) view3).c(true, true);
            }
        }
        if (i25 == Integer.MAX_VALUE) {
            i18 = 0;
        } else {
            i18 = i25;
        }
        w7.z5 z5Var2 = (w7.z5) yk0Var.f30575i;
        if (z5Var2 != null) {
            z5Var2.b();
        }
        if (arrayList.isEmpty()) {
            i19 = Math.abs(i23);
        } else {
            boolean z11 = this.f29175c;
            if (!z11) {
                i26 = vl0Var.getHeight() - i18;
            }
            if (z11) {
                height = -i21;
            } else {
                height = i22 - vl0Var.getHeight();
            }
            i19 = height + i26;
        }
        final int paddingBottom = vl0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) yk0Var.f30574g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) yk0Var.f30574g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        yk0Var.f30574g = ofFloat;
        final boolean z12 = this.f29175c;
        final int i28 = i19;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i29;
                yk0 yk0Var2 = vk0.this.e;
                vl0 vl0Var2 = (vl0) yk0Var2.e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= vl0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i29) * floatValue);
                        } else {
                            view4.setTranslationY(i29 * floatValue);
                        }
                    }
                    i30++;
                }
                int paddingBottom2 = paddingBottom - vl0Var2.getPaddingBottom();
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
                vl0Var2.invalidate();
                xk0 xk0Var = (xk0) yk0Var2.h;
                if (xk0Var != null) {
                    xk0Var.a();
                }
            }
        });
        ((ValueAnimator) yk0Var.f30574g).addListener(new ai.z(28, this, arrayList2));
        long j3 = 300;
        if (yk0Var.d) {
            if (z10) {
                ((ValueAnimator) yk0Var.f30574g).setDuration(150L);
                ((ValueAnimator) yk0Var.f30574g).setInterpolator(qr.f27643g);
            } else {
                long measuredHeight = ((i28 / vl0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j3 = measuredHeight;
                }
                ((ValueAnimator) yk0Var.f30574g).setDuration(Math.min(j3, 1300L));
                ((ValueAnimator) yk0Var.f30574g).setInterpolator(qr.h);
            }
        } else {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight2 = ((i28 / vl0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j3 = measuredHeight2;
                }
                min = Math.min(j3, 1300L);
            }
            ((ValueAnimator) yk0Var.f30574g).setDuration(min);
            ((ValueAnimator) yk0Var.f30574g).setInterpolator(qr.h);
        }
        ((ValueAnimator) yk0Var.f30574g).start();
    }
}
