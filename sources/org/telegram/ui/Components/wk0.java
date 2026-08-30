package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class wk0 implements View.OnLayoutChangeListener {
    public final f2.o0 f30382a;
    public final ArrayList f30383b;
    public final boolean f30384c;
    public final xk0 d;
    public final c2.y e;

    public wk0(c2.y yVar, f2.o0 o0Var, ArrayList arrayList, boolean z4, xk0 xk0Var) {
        this.e = yVar;
        this.f30382a = o0Var;
        this.f30383b = arrayList;
        this.f30384c = z4;
        this.d = xk0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int i18;
        int height;
        int i19;
        long min;
        View view2;
        c2.y yVar = this.e;
        HashMap hashMap = (HashMap) yVar.f2037k;
        sl0 sl0Var = (sl0) yVar.e;
        sl0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        sl0Var.B0();
        int childCount = sl0Var.getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z4 = false;
        while (true) {
            arrayList = this.f30383b;
            if (i20 >= childCount) {
                break;
            }
            View childAt = sl0Var.getChildAt(i20);
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
            f2.o0 o0Var = this.f30382a;
            if (o0Var != null && (o0Var.f5817b || yVar.f2032c)) {
                sl0Var.getClass();
                long i24 = o0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i24)) && (view2 = (View) hashMap.get(Long.valueOf(i24))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    k7.c6 c6Var = (k7.c6) yVar.f2035i;
                    if (c6Var != null) {
                        c6Var.d(view2);
                    }
                    int top = childAt.getTop() - view2.getTop();
                    if (top != 0) {
                        i23 = top;
                    }
                    z4 = true;
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
                sl0Var.addView(view3);
                ((f2.i0) yVar.f2033f).M(view3);
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
        k7.c6 c6Var2 = (k7.c6) yVar.f2035i;
        if (c6Var2 != null) {
            c6Var2.b();
        }
        if (arrayList.isEmpty()) {
            i19 = Math.abs(i23);
        } else {
            boolean z10 = this.f30384c;
            if (!z10) {
                i26 = sl0Var.getHeight() - i18;
            }
            if (z10) {
                height = -i21;
            } else {
                height = i22 - sl0Var.getHeight();
            }
            i19 = height + i26;
        }
        final int paddingBottom = sl0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) yVar.f2034g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) yVar.f2034g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        yVar.f2034g = ofFloat;
        final boolean z11 = this.f30384c;
        final int i28 = i19;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z12;
                int i29;
                c2.y yVar2 = wk0.this.e;
                sl0 sl0Var2 = (sl0) yVar2.e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i30 = 0;
                while (true) {
                    z12 = z11;
                    i29 = i28;
                    if (i30 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i30);
                    float y10 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y10 <= sl0Var2.getMeasuredHeight()) {
                        if (z12) {
                            view4.setTranslationY((-i29) * floatValue);
                        } else {
                            view4.setTranslationY(i29 * floatValue);
                        }
                    }
                    i30++;
                }
                int paddingBottom2 = paddingBottom - sl0Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i31 = 0; i31 < size3; i31++) {
                    View view5 = (View) arrayList4.get(i31);
                    if (z12) {
                        view5.setTranslationY(((1.0f - floatValue) * i29) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - floatValue) * (-i29));
                    }
                }
                sl0Var2.invalidate();
                yk0 yk0Var = (yk0) yVar2.h;
                if (yk0Var != null) {
                    yk0Var.d();
                }
            }
        });
        ((ValueAnimator) yVar.f2034g).addListener(new dg.y2(25, this, arrayList2));
        long j10 = 300;
        if (yVar.d) {
            if (z4) {
                ((ValueAnimator) yVar.f2034g).setDuration(150L);
                ((ValueAnimator) yVar.f2034g).setInterpolator(nr.f27347g);
            } else {
                long measuredHeight = ((i28 / sl0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j10 = measuredHeight;
                }
                ((ValueAnimator) yVar.f2034g).setDuration(Math.min(j10, 1300L));
                ((ValueAnimator) yVar.f2034g).setInterpolator(nr.h);
            }
        } else {
            if (z4) {
                min = 600;
            } else {
                long measuredHeight2 = ((i28 / sl0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j10 = measuredHeight2;
                }
                min = Math.min(j10, 1300L);
            }
            ((ValueAnimator) yVar.f2034g).setDuration(min);
            ((ValueAnimator) yVar.f2034g).setInterpolator(nr.h);
        }
        ((ValueAnimator) yVar.f2034g).start();
    }
}
