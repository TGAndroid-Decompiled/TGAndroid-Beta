package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class ql0 implements View.OnLayoutChangeListener {
    public final s4.i0 f30186a;
    public final ArrayList f30187b;
    public final boolean f30188c;
    public final rl0 d;
    public final tl0 f30189e;

    public ql0(tl0 tl0Var, s4.i0 i0Var, ArrayList arrayList, boolean z10, rl0 rl0Var) {
        this.f30189e = tl0Var;
        this.f30186a = i0Var;
        this.f30187b = arrayList;
        this.f30188c = z10;
        this.d = rl0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int i18;
        int height;
        int i19;
        long min;
        View view2;
        tl0 tl0Var = this.f30189e;
        HashMap hashMap = (HashMap) tl0Var.f31231k;
        qm0 qm0Var = (qm0) tl0Var.f31226e;
        qm0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        qm0Var.B0();
        int childCount = qm0Var.getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f30187b;
            if (i20 >= childCount) {
                break;
            }
            View childAt = qm0Var.getChildAt(i20);
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
            s4.i0 i0Var = this.f30186a;
            if (i0Var != null && (i0Var.f47711b || tl0Var.f31225c)) {
                qm0Var.getClass();
                long i24 = i0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i24)) && (view2 = (View) hashMap.get(Long.valueOf(i24))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    w7.y5 y5Var = (w7.y5) tl0Var.f31229i;
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
                qm0Var.addView(view3);
                ((s4.d0) tl0Var.f31227f).M(view3);
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
        w7.y5 y5Var2 = (w7.y5) tl0Var.f31229i;
        if (y5Var2 != null) {
            y5Var2.b();
        }
        if (arrayList.isEmpty()) {
            i19 = Math.abs(i23);
        } else {
            boolean z11 = this.f30188c;
            if (!z11) {
                i25 = qm0Var.getHeight() - i18;
            }
            if (z11) {
                height = -i21;
            } else {
                height = i22 - qm0Var.getHeight();
            }
            i19 = height + i25;
        }
        final int paddingBottom = qm0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) tl0Var.f31228g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) tl0Var.f31228g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        tl0Var.f31228g = ofFloat;
        final boolean z12 = this.f30188c;
        final int i28 = i19;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i29;
                tl0 tl0Var2 = ql0.this.f30189e;
                qm0 qm0Var2 = (qm0) tl0Var2.f31226e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= qm0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i29) * floatValue);
                        } else {
                            view4.setTranslationY(i29 * floatValue);
                        }
                    }
                    i30++;
                }
                int paddingBottom2 = paddingBottom - qm0Var2.getPaddingBottom();
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
                qm0Var2.invalidate();
                sl0 sl0Var = (sl0) tl0Var2.h;
                if (sl0Var != null) {
                    sl0Var.a();
                }
            }
        });
        ((ValueAnimator) tl0Var.f31228g).addListener(new ai.z(28, this, arrayList2));
        long j3 = 300;
        if (tl0Var.d) {
            if (z10) {
                ((ValueAnimator) tl0Var.f31228g).setDuration(150L);
                ((ValueAnimator) tl0Var.f31228g).setInterpolator(hs.f27119g);
            } else {
                long measuredHeight = ((i28 / qm0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j3 = measuredHeight;
                }
                ((ValueAnimator) tl0Var.f31228g).setDuration(Math.min(j3, 1300L));
                ((ValueAnimator) tl0Var.f31228g).setInterpolator(hs.h);
            }
        } else {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight2 = ((i28 / qm0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j3 = measuredHeight2;
                }
                min = Math.min(j3, 1300L);
            }
            ((ValueAnimator) tl0Var.f31228g).setDuration(min);
            ((ValueAnimator) tl0Var.f31228g).setInterpolator(hs.h);
        }
        ((ValueAnimator) tl0Var.f31228g).start();
    }
}
