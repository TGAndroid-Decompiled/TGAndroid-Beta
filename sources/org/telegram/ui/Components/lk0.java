package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class lk0 implements View.OnLayoutChangeListener {
    public final f2.p0 f30355a;
    public final ArrayList f30356b;
    public final boolean f30357c;
    public final mk0 d;
    public final c2.z f30358e;

    public lk0(c2.z zVar, f2.p0 p0Var, ArrayList arrayList, boolean z10, mk0 mk0Var) {
        this.f30358e = zVar;
        this.f30355a = p0Var;
        this.f30356b = arrayList;
        this.f30357c = z10;
        this.d = mk0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int i18;
        int height;
        int i19;
        long min;
        View view2;
        c2.z zVar = this.f30358e;
        HashMap hashMap = (HashMap) zVar.f2940k;
        jl0 jl0Var = (jl0) zVar.f2935e;
        jl0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        jl0Var.B0();
        int childCount = jl0Var.getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f30356b;
            if (i20 >= childCount) {
                break;
            }
            View childAt = jl0Var.getChildAt(i20);
            arrayList2.add(childAt);
            if (childAt.getTop() < i21) {
                i21 = childAt.getTop();
            }
            if (childAt.getBottom() > i22) {
                i22 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.m4) {
                ((org.telegram.ui.Cells.m4) childAt).b(true, false);
            }
            f2.p0 p0Var = this.f30355a;
            if (p0Var != null && (p0Var.f6460b || zVar.f2934c)) {
                jl0Var.getClass();
                long i24 = p0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i24)) && (view2 = (View) hashMap.get(Long.valueOf(i24))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.m4) {
                        ((org.telegram.ui.Cells.m4) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    i7.g6 g6Var = (i7.g6) zVar.f2938i;
                    if (g6Var != null) {
                        g6Var.d(view2);
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
                jl0Var.addView(view3);
                ((f2.j0) zVar.f2936f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.m4) {
                ((org.telegram.ui.Cells.m4) view3).b(true, true);
            }
        }
        if (i25 == Integer.MAX_VALUE) {
            i18 = 0;
        } else {
            i18 = i25;
        }
        i7.g6 g6Var2 = (i7.g6) zVar.f2938i;
        if (g6Var2 != null) {
            g6Var2.b();
        }
        if (arrayList.isEmpty()) {
            i19 = Math.abs(i23);
        } else {
            boolean z11 = this.f30357c;
            if (!z11) {
                i26 = jl0Var.getHeight() - i18;
            }
            if (z11) {
                height = -i21;
            } else {
                height = i22 - jl0Var.getHeight();
            }
            i19 = height + i26;
        }
        final int paddingBottom = jl0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) zVar.f2937g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) zVar.f2937g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        zVar.f2937g = ofFloat;
        final boolean z12 = this.f30357c;
        final int i28 = i19;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i29;
                c2.z zVar2 = lk0.this.f30358e;
                jl0 jl0Var2 = (jl0) zVar2.f2935e;
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
                    float y8 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y8 <= jl0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i29) * floatValue);
                        } else {
                            view4.setTranslationY(i29 * floatValue);
                        }
                    }
                    i30++;
                }
                int paddingBottom2 = paddingBottom - jl0Var2.getPaddingBottom();
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
                jl0Var2.invalidate();
                nk0 nk0Var = (nk0) zVar2.h;
                if (nk0Var != null) {
                    nk0Var.a();
                }
            }
        });
        ((ValueAnimator) zVar.f2937g).addListener(new bg.c3(29, this, arrayList2));
        long j10 = 300;
        if (zVar.d) {
            if (z10) {
                ((ValueAnimator) zVar.f2937g).setDuration(150L);
                ((ValueAnimator) zVar.f2937g).setInterpolator(jr.f29801g);
            } else {
                long measuredHeight = ((i28 / jl0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j10 = measuredHeight;
                }
                ((ValueAnimator) zVar.f2937g).setDuration(Math.min(j10, 1300L));
                ((ValueAnimator) zVar.f2937g).setInterpolator(jr.h);
            }
        } else {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight2 = ((i28 / jl0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j10 = measuredHeight2;
                }
                min = Math.min(j10, 1300L);
            }
            ((ValueAnimator) zVar.f2937g).setDuration(min);
            ((ValueAnimator) zVar.f2937g).setInterpolator(jr.h);
        }
        ((ValueAnimator) zVar.f2937g).start();
    }
}
