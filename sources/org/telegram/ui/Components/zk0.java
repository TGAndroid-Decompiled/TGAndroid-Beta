package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class zk0 implements View.OnLayoutChangeListener {
    public final s4.h0 f30978a;
    public final ArrayList f30979b;
    public final boolean f30980c;
    public final al0 d;
    public final cl0 e;

    public zk0(cl0 cl0Var, s4.h0 h0Var, ArrayList arrayList, boolean z10, al0 al0Var) {
        this.e = cl0Var;
        this.f30978a = h0Var;
        this.f30979b = arrayList;
        this.f30980c = z10;
        this.d = al0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int i18;
        int height;
        int i19;
        long min;
        View view2;
        cl0 cl0Var = this.e;
        HashMap hashMap = (HashMap) cl0Var.f23362k;
        zl0 zl0Var = (zl0) cl0Var.e;
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
            arrayList = this.f30979b;
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
            s4.h0 h0Var = this.f30978a;
            if (h0Var != null && (h0Var.f43118b || cl0Var.f23357c)) {
                zl0Var.getClass();
                long i24 = h0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i24)) && (view2 = (View) hashMap.get(Long.valueOf(i24))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    w7.z5 z5Var = (w7.z5) cl0Var.f23360i;
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
                zl0Var.addView(view3);
                ((s4.c0) cl0Var.f23358f).M(view3);
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
        w7.z5 z5Var2 = (w7.z5) cl0Var.f23360i;
        if (z5Var2 != null) {
            z5Var2.b();
        }
        if (arrayList.isEmpty()) {
            i19 = Math.abs(i23);
        } else {
            boolean z11 = this.f30980c;
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
        ValueAnimator valueAnimator = (ValueAnimator) cl0Var.f23359g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) cl0Var.f23359g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        cl0Var.f23359g = ofFloat;
        final boolean z12 = this.f30980c;
        final int i28 = i19;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i29;
                cl0 cl0Var2 = zk0.this.e;
                zl0 zl0Var2 = (zl0) cl0Var2.e;
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
                bl0 bl0Var = (bl0) cl0Var2.h;
                if (bl0Var != null) {
                    bl0Var.a();
                }
            }
        });
        ((ValueAnimator) cl0Var.f23359g).addListener(new ai.z(28, this, arrayList2));
        long j3 = 300;
        if (cl0Var.d) {
            if (z10) {
                ((ValueAnimator) cl0Var.f23359g).setDuration(150L);
                ((ValueAnimator) cl0Var.f23359g).setInterpolator(tr.f28637g);
            } else {
                long measuredHeight = ((i28 / zl0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j3 = measuredHeight;
                }
                ((ValueAnimator) cl0Var.f23359g).setDuration(Math.min(j3, 1300L));
                ((ValueAnimator) cl0Var.f23359g).setInterpolator(tr.h);
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
            ((ValueAnimator) cl0Var.f23359g).setDuration(min);
            ((ValueAnimator) cl0Var.f23359g).setInterpolator(tr.h);
        }
        ((ValueAnimator) cl0Var.f23359g).start();
    }
}
