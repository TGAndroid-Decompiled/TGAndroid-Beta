package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class sl0 implements View.OnLayoutChangeListener {
    public final s4.i0 f30775a;
    public final ArrayList f30776b;
    public final boolean f30777c;
    public final tl0 d;
    public final vl0 f30778e;

    public sl0(vl0 vl0Var, s4.i0 i0Var, ArrayList arrayList, boolean z10, tl0 tl0Var) {
        this.f30778e = vl0Var;
        this.f30775a = i0Var;
        this.f30776b = arrayList;
        this.f30777c = z10;
        this.d = tl0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int i18;
        int height;
        int i19;
        long min;
        View view2;
        vl0 vl0Var = this.f30778e;
        HashMap hashMap = (HashMap) vl0Var.f31844k;
        sm0 sm0Var = (sm0) vl0Var.f31839e;
        sm0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        sm0Var.B0();
        int childCount = sm0Var.getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f30776b;
            if (i20 >= childCount) {
                break;
            }
            View childAt = sm0Var.getChildAt(i20);
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
            s4.i0 i0Var = this.f30775a;
            if (i0Var != null && (i0Var.f47803b || vl0Var.f31838c)) {
                sm0Var.getClass();
                long i24 = i0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i24)) && (view2 = (View) hashMap.get(Long.valueOf(i24))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    w7.y5 y5Var = (w7.y5) vl0Var.f31842i;
                    if (y5Var != null) {
                        y5Var.d(view2);
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
        int i25 = 0;
        int i26 = 0;
        int i27 = Integer.MAX_VALUE;
        while (i26 < size) {
            Object obj = arrayList.get(i26);
            i26++;
            View view3 = (View) obj;
            int bottom = view3.getBottom();
            int top2 = view3.getTop();
            if (bottom > i25) {
                i25 = bottom;
            }
            if (top2 < i27) {
                i27 = top2;
            }
            if (view3.getParent() == null) {
                sm0Var.addView(view3);
                ((s4.d0) vl0Var.f31840f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.o4) {
                ((org.telegram.ui.Cells.o4) view3).c(true, true);
            }
        }
        if (i27 == Integer.MAX_VALUE) {
            i18 = 0;
        } else {
            i18 = i27;
        }
        w7.y5 y5Var2 = (w7.y5) vl0Var.f31842i;
        if (y5Var2 != null) {
            y5Var2.b();
        }
        if (arrayList.isEmpty()) {
            i19 = Math.abs(i23);
        } else {
            boolean z11 = this.f30777c;
            if (!z11) {
                i25 = sm0Var.getHeight() - i18;
            }
            if (z11) {
                height = -i21;
            } else {
                height = i22 - sm0Var.getHeight();
            }
            i19 = height + i25;
        }
        final int paddingBottom = sm0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) vl0Var.f31841g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) vl0Var.f31841g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        vl0Var.f31841g = ofFloat;
        final boolean z12 = this.f30777c;
        final int i28 = i19;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i29;
                vl0 vl0Var2 = sl0.this.f30778e;
                sm0 sm0Var2 = (sm0) vl0Var2.f31839e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= sm0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i29) * floatValue);
                        } else {
                            view4.setTranslationY(i29 * floatValue);
                        }
                    }
                    i30++;
                }
                int paddingBottom2 = paddingBottom - sm0Var2.getPaddingBottom();
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
                sm0Var2.invalidate();
                ul0 ul0Var = (ul0) vl0Var2.h;
                if (ul0Var != null) {
                    ul0Var.a();
                }
            }
        });
        ((ValueAnimator) vl0Var.f31841g).addListener(new ai.z(28, this, arrayList2));
        long j3 = 300;
        if (vl0Var.d) {
            if (z10) {
                ((ValueAnimator) vl0Var.f31841g).setDuration(150L);
                ((ValueAnimator) vl0Var.f31841g).setInterpolator(is.f27452g);
            } else {
                long measuredHeight = ((i28 / sm0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j3 = measuredHeight;
                }
                ((ValueAnimator) vl0Var.f31841g).setDuration(Math.min(j3, 1300L));
                ((ValueAnimator) vl0Var.f31841g).setInterpolator(is.h);
            }
        } else {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight2 = ((i28 / sm0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j3 = measuredHeight2;
                }
                min = Math.min(j3, 1300L);
            }
            ((ValueAnimator) vl0Var.f31841g).setDuration(min);
            ((ValueAnimator) vl0Var.f31841g).setInterpolator(is.h);
        }
        ((ValueAnimator) vl0Var.f31841g).start();
    }
}
