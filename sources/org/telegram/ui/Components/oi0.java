package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class oi0 implements View.OnLayoutChangeListener {
    public final v4.g0 f36625a;
    public final ArrayList f36626b;
    public final boolean f36627c;
    public final pi0 d;
    public final ri0 f36628e;

    public oi0(ri0 ri0Var, v4.g0 g0Var, ArrayList arrayList, boolean z9, pi0 pi0Var) {
        this.f36628e = ri0Var;
        this.f36625a = g0Var;
        this.f36626b = arrayList;
        this.f36627c = z9;
        this.d = pi0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        final ArrayList arrayList;
        int i17;
        int height;
        int i18;
        long min;
        View view2;
        ri0 ri0Var = this.f36628e;
        HashMap hashMap = (HashMap) ri0Var.f37659k;
        pj0 pj0Var = (pj0) ri0Var.f37654e;
        pj0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        pj0Var.C0();
        int childCount = pj0Var.getChildCount();
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z9 = false;
        while (true) {
            arrayList = this.f36626b;
            if (i19 >= childCount) {
                break;
            }
            View childAt = pj0Var.getChildAt(i19);
            arrayList2.add(childAt);
            if (childAt.getTop() < i20) {
                i20 = childAt.getTop();
            }
            if (childAt.getBottom() > i21) {
                i21 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) childAt).c(true, false);
            }
            v4.g0 g0Var = this.f36625a;
            if (g0Var != null && (g0Var.f56985b || ri0Var.f37653c)) {
                pj0Var.getClass();
                long c10 = g0Var.c(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(c10)) && (view2 = (View) hashMap.get(Long.valueOf(c10))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    c8.ja jaVar = (c8.ja) ri0Var.f37657i;
                    if (jaVar != null) {
                        jaVar.d(view2);
                    }
                    int top = childAt.getTop() - view2.getTop();
                    if (top != 0) {
                        i22 = top;
                    }
                    z9 = true;
                }
            }
            i19++;
        }
        hashMap.clear();
        int size = arrayList.size();
        int i23 = 0;
        int i24 = 0;
        int i25 = Integer.MAX_VALUE;
        while (i24 < size) {
            Object obj = arrayList.get(i24);
            i24++;
            View view3 = (View) obj;
            int bottom = view3.getBottom();
            int top2 = view3.getTop();
            if (bottom > i23) {
                i23 = bottom;
            }
            if (top2 < i25) {
                i25 = top2;
            }
            if (view3.getParent() == null) {
                pj0Var.addView(view3);
                ((v4.b0) ri0Var.f37655f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) view3).c(true, true);
            }
        }
        if (i25 == Integer.MAX_VALUE) {
            i17 = 0;
        } else {
            i17 = i25;
        }
        c8.ja jaVar2 = (c8.ja) ri0Var.f37657i;
        if (jaVar2 != null) {
            jaVar2.b();
        }
        if (arrayList.isEmpty()) {
            i18 = Math.abs(i22);
        } else {
            boolean z10 = this.f36627c;
            if (!z10) {
                i23 = pj0Var.getHeight() - i17;
            }
            if (z10) {
                height = -i20;
            } else {
                height = i21 - pj0Var.getHeight();
            }
            i18 = height + i23;
        }
        final int paddingBottom = pj0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) ri0Var.f37656g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) ri0Var.f37656g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ri0Var.f37656g = ofFloat;
        final boolean z11 = this.f36627c;
        final int i26 = i18;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z12;
                int i27;
                ri0 ri0Var2 = oi0.this.f36628e;
                pj0 pj0Var2 = (pj0) ri0Var2.f37654e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i28 = 0;
                while (true) {
                    z12 = z11;
                    i27 = i26;
                    if (i28 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i28);
                    float y10 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y10 <= pj0Var2.getMeasuredHeight()) {
                        if (z12) {
                            view4.setTranslationY((-i27) * floatValue);
                        } else {
                            view4.setTranslationY(i27 * floatValue);
                        }
                    }
                    i28++;
                }
                int paddingBottom2 = paddingBottom - pj0Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i29 = 0; i29 < size3; i29++) {
                    View view5 = (View) arrayList4.get(i29);
                    if (z12) {
                        view5.setTranslationY(((1.0f - floatValue) * i27) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - floatValue) * (-i27));
                    }
                }
                pj0Var2.invalidate();
                qi0 qi0Var = (qi0) ri0Var2.h;
                if (qi0Var != null) {
                    qi0Var.e();
                }
            }
        });
        ((ValueAnimator) ri0Var.f37656g).addListener(new v50(1, this, arrayList2));
        long j3 = 300;
        if (ri0Var.d) {
            if (z9) {
                ((ValueAnimator) ri0Var.f37656g).setDuration(150L);
                ((ValueAnimator) ri0Var.f37656g).setInterpolator(xq.f40346g);
            } else {
                long measuredHeight = ((i26 / pj0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j3 = measuredHeight;
                }
                ((ValueAnimator) ri0Var.f37656g).setDuration(Math.min(j3, 1300L));
                ((ValueAnimator) ri0Var.f37656g).setInterpolator(xq.h);
            }
        } else {
            if (z9) {
                min = 600;
            } else {
                long measuredHeight2 = ((i26 / pj0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j3 = measuredHeight2;
                }
                min = Math.min(j3, 1300L);
            }
            ((ValueAnimator) ri0Var.f37656g).setDuration(min);
            ((ValueAnimator) ri0Var.f37656g).setInterpolator(xq.h);
        }
        ((ValueAnimator) ri0Var.f37656g).start();
    }
}
