package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class sj0 implements View.OnLayoutChangeListener {
    public final s4.g0 f30257a;
    public final ArrayList f30258b;
    public final boolean f30259c;
    public final tj0 d;
    public final vj0 e;

    public sj0(vj0 vj0Var, s4.g0 g0Var, ArrayList arrayList, boolean z10, tj0 tj0Var) {
        this.e = vj0Var;
        this.f30257a = g0Var;
        this.f30258b = arrayList;
        this.f30259c = z10;
        this.d = tj0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int i18;
        int height;
        int i19;
        long min;
        View view2;
        vj0 vj0Var = this.e;
        HashMap hashMap = (HashMap) vj0Var.f31279k;
        tk0 tk0Var = (tk0) vj0Var.e;
        tk0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        tk0Var.C0();
        int childCount = tk0Var.getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f30258b;
            if (i20 >= childCount) {
                break;
            }
            View childAt = tk0Var.getChildAt(i20);
            arrayList2.add(childAt);
            if (childAt.getTop() < i21) {
                i21 = childAt.getTop();
            }
            if (childAt.getBottom() > i22) {
                i22 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.r4) {
                ((org.telegram.ui.Cells.r4) childAt).b(true, false);
            }
            s4.g0 g0Var = this.f30257a;
            if (g0Var != null && (g0Var.f47933b || vj0Var.f31274c)) {
                tk0Var.getClass();
                long c10 = g0Var.c(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(c10)) && (view2 = (View) hashMap.get(Long.valueOf(c10))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.r4) {
                        ((org.telegram.ui.Cells.r4) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    w7.d6 d6Var = (w7.d6) vj0Var.f31277i;
                    if (d6Var != null) {
                        d6Var.d(view2);
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
        int i24 = 0;
        int i25 = 0;
        int i26 = Integer.MAX_VALUE;
        while (i25 < size) {
            Object obj = arrayList.get(i25);
            i25++;
            View view3 = (View) obj;
            int bottom = view3.getBottom();
            int top2 = view3.getTop();
            if (bottom > i24) {
                i24 = bottom;
            }
            if (top2 < i26) {
                i26 = top2;
            }
            if (view3.getParent() == null) {
                tk0Var.addView(view3);
                ((s4.a0) vj0Var.f31275f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.r4) {
                ((org.telegram.ui.Cells.r4) view3).b(true, true);
            }
        }
        if (i26 == Integer.MAX_VALUE) {
            i18 = 0;
        } else {
            i18 = i26;
        }
        w7.d6 d6Var2 = (w7.d6) vj0Var.f31277i;
        if (d6Var2 != null) {
            d6Var2.b();
        }
        if (arrayList.isEmpty()) {
            i19 = Math.abs(i23);
        } else {
            boolean z11 = this.f30259c;
            if (!z11) {
                i24 = tk0Var.getHeight() - i18;
            }
            if (z11) {
                height = -i21;
            } else {
                height = i22 - tk0Var.getHeight();
            }
            i19 = height + i24;
        }
        final int paddingBottom = tk0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) vj0Var.f31276g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) vj0Var.f31276g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        vj0Var.f31276g = ofFloat;
        final boolean z12 = this.f30259c;
        final int i27 = i19;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i28;
                vj0 vj0Var2 = sj0.this.e;
                tk0 tk0Var2 = (tk0) vj0Var2.e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i29 = 0;
                while (true) {
                    z13 = z12;
                    i28 = i27;
                    if (i29 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i29);
                    float y3 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= tk0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i28) * floatValue);
                        } else {
                            view4.setTranslationY(i28 * floatValue);
                        }
                    }
                    i29++;
                }
                int paddingBottom2 = paddingBottom - tk0Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i30 = 0; i30 < size3; i30++) {
                    View view5 = (View) arrayList4.get(i30);
                    if (z13) {
                        view5.setTranslationY(((1.0f - floatValue) * i28) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - floatValue) * (-i28));
                    }
                }
                tk0Var2.invalidate();
                uj0 uj0Var = (uj0) vj0Var2.h;
                if (uj0Var != null) {
                    uj0Var.g();
                }
            }
        });
        ((ValueAnimator) vj0Var.f31276g).addListener(new bg.f(26, this, arrayList2));
        long j10 = 300;
        if (vj0Var.d) {
            if (z10) {
                ((ValueAnimator) vj0Var.f31276g).setDuration(150L);
                ((ValueAnimator) vj0Var.f31276g).setInterpolator(gr.f26496g);
            } else {
                long measuredHeight = ((i27 / tk0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j10 = measuredHeight;
                }
                ((ValueAnimator) vj0Var.f31276g).setDuration(Math.min(j10, 1300L));
                ((ValueAnimator) vj0Var.f31276g).setInterpolator(gr.h);
            }
        } else {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight2 = ((i27 / tk0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j10 = measuredHeight2;
                }
                min = Math.min(j10, 1300L);
            }
            ((ValueAnimator) vj0Var.f31276g).setDuration(min);
            ((ValueAnimator) vj0Var.f31276g).setInterpolator(gr.h);
        }
        ((ValueAnimator) vj0Var.f31276g).start();
    }
}
