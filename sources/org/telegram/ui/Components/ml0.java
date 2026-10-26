package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class ml0 implements View.OnLayoutChangeListener {
    public final s4.h0 f30612a;
    public final ArrayList f30613b;
    public final boolean f30614c;
    public final nl0 d;
    public final pl0 e;

    public ml0(pl0 pl0Var, s4.h0 h0Var, ArrayList arrayList, boolean z10, nl0 nl0Var) {
        this.e = pl0Var;
        this.f30612a = h0Var;
        this.f30613b = arrayList;
        this.f30614c = z10;
        this.d = nl0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int height;
        int i18;
        long min;
        View view2;
        pl0 pl0Var = this.e;
        HashMap hashMap = (HashMap) pl0Var.f31603k;
        mm0 mm0Var = (mm0) pl0Var.e;
        mm0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        mm0Var.C0();
        int childCount = mm0Var.getChildCount();
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f30613b;
            if (i19 >= childCount) {
                break;
            }
            View childAt = mm0Var.getChildAt(i19);
            arrayList2.add(childAt);
            if (childAt.getTop() < i20) {
                i20 = childAt.getTop();
            }
            if (childAt.getBottom() > i21) {
                i21 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.s4) {
                ((org.telegram.ui.Cells.s4) childAt).b(true, false);
            }
            s4.h0 h0Var = this.f30612a;
            if (h0Var != null && (h0Var.f47769b || pl0Var.f31598c)) {
                mm0Var.getClass();
                long i23 = h0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i23)) && (view2 = (View) hashMap.get(Long.valueOf(i23))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.s4) {
                        ((org.telegram.ui.Cells.s4) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    gb1 gb1Var = (gb1) pl0Var.f31601i;
                    if (gb1Var != null) {
                        gb1Var.S(view2);
                    }
                    int top = childAt.getTop() - view2.getTop();
                    if (top != 0) {
                        i22 = top;
                    }
                    z10 = true;
                }
            }
            i19++;
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
                mm0Var.addView(view3);
                ((s4.c0) pl0Var.f31599f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.s4) {
                ((org.telegram.ui.Cells.s4) view3).b(true, true);
            }
        }
        if (i26 == Integer.MAX_VALUE) {
            i26 = 0;
        }
        gb1 gb1Var2 = (gb1) pl0Var.f31601i;
        if (gb1Var2 != null) {
            gb1Var2.O();
        }
        if (arrayList.isEmpty()) {
            i18 = Math.abs(i22);
        } else {
            boolean z11 = this.f30614c;
            if (!z11) {
                i24 = mm0Var.getHeight() - i26;
            }
            if (z11) {
                height = -i20;
            } else {
                height = i21 - mm0Var.getHeight();
            }
            i18 = height + i24;
        }
        final int paddingBottom = mm0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) pl0Var.f31600g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) pl0Var.f31600g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        pl0Var.f31600g = ofFloat;
        final boolean z12 = this.f30614c;
        final int i27 = i18;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i28;
                pl0 pl0Var2 = ml0.this.e;
                mm0 mm0Var2 = (mm0) pl0Var2.e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= mm0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i28) * floatValue);
                        } else {
                            view4.setTranslationY(i28 * floatValue);
                        }
                    }
                    i29++;
                }
                int paddingBottom2 = paddingBottom - mm0Var2.getPaddingBottom();
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
                mm0Var2.invalidate();
                ol0 ol0Var = (ol0) pl0Var2.h;
                if (ol0Var != null) {
                    ol0Var.d();
                }
            }
        });
        ((ValueAnimator) pl0Var.f31600g).addListener(new ll0(0, this, arrayList2));
        long j10 = 300;
        if (pl0Var.d) {
            if (z10) {
                ((ValueAnimator) pl0Var.f31600g).setDuration(150L);
                ((ValueAnimator) pl0Var.f31600g).setInterpolator(ds.f27587g);
            } else {
                long measuredHeight = ((i27 / mm0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j10 = measuredHeight;
                }
                ((ValueAnimator) pl0Var.f31600g).setDuration(Math.min(j10, 1300L));
                ((ValueAnimator) pl0Var.f31600g).setInterpolator(ds.h);
            }
        } else {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight2 = ((i27 / mm0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j10 = measuredHeight2;
                }
                min = Math.min(j10, 1300L);
            }
            ((ValueAnimator) pl0Var.f31600g).setDuration(min);
            ((ValueAnimator) pl0Var.f31600g).setInterpolator(ds.h);
        }
        ((ValueAnimator) pl0Var.f31600g).start();
    }
}
