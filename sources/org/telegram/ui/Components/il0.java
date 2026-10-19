package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class il0 implements View.OnLayoutChangeListener {
    public final s4.g0 f27270a;
    public final ArrayList f27271b;
    public final boolean f27272c;
    public final jl0 d;
    public final ll0 e;

    public il0(ll0 ll0Var, s4.g0 g0Var, ArrayList arrayList, boolean z10, jl0 jl0Var) {
        this.e = ll0Var;
        this.f27270a = g0Var;
        this.f27271b = arrayList;
        this.f27272c = z10;
        this.d = jl0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int i18;
        int height;
        int i19;
        long min;
        View view2;
        ll0 ll0Var = this.e;
        HashMap hashMap = (HashMap) ll0Var.f28248k;
        im0 im0Var = (im0) ll0Var.e;
        im0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        im0Var.B0();
        int childCount = im0Var.getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f27271b;
            if (i20 >= childCount) {
                break;
            }
            View childAt = im0Var.getChildAt(i20);
            arrayList2.add(childAt);
            if (childAt.getTop() < i21) {
                i21 = childAt.getTop();
            }
            if (childAt.getBottom() > i22) {
                i22 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.n4) {
                ((org.telegram.ui.Cells.n4) childAt).e(true, false);
            }
            s4.g0 g0Var = this.f27270a;
            if (g0Var != null && (g0Var.f45958b || ll0Var.f28243c)) {
                im0Var.getClass();
                long i24 = g0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i24)) && (view2 = (View) hashMap.get(Long.valueOf(i24))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) view2).e(false, false);
                    }
                    arrayList.remove(view2);
                    w7.a6 a6Var = (w7.a6) ll0Var.f28246i;
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
                im0Var.addView(view3);
                ((s4.b0) ll0Var.f28244f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.n4) {
                ((org.telegram.ui.Cells.n4) view3).e(true, true);
            }
        }
        if (i27 == Integer.MAX_VALUE) {
            i18 = 0;
        } else {
            i18 = i27;
        }
        w7.a6 a6Var2 = (w7.a6) ll0Var.f28246i;
        if (a6Var2 != null) {
            a6Var2.b();
        }
        if (arrayList.isEmpty()) {
            i19 = Math.abs(i23);
        } else {
            boolean z11 = this.f27272c;
            if (!z11) {
                i25 = im0Var.getHeight() - i18;
            }
            if (z11) {
                height = -i21;
            } else {
                height = i22 - im0Var.getHeight();
            }
            i19 = height + i25;
        }
        final int paddingBottom = im0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) ll0Var.f28245g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) ll0Var.f28245g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ll0Var.f28245g = ofFloat;
        final boolean z12 = this.f27272c;
        final int i28 = i19;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i29;
                ll0 ll0Var2 = il0.this.e;
                im0 im0Var2 = (im0) ll0Var2.e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= im0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i29) * floatValue);
                        } else {
                            view4.setTranslationY(i29 * floatValue);
                        }
                    }
                    i30++;
                }
                int paddingBottom2 = paddingBottom - im0Var2.getPaddingBottom();
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
                im0Var2.invalidate();
                kl0 kl0Var = (kl0) ll0Var2.h;
                if (kl0Var != null) {
                    kl0Var.b();
                }
            }
        });
        ((ValueAnimator) ll0Var.f28245g).addListener(new ai.me(29, this, arrayList2));
        long j10 = 300;
        if (ll0Var.d) {
            if (z10) {
                ((ValueAnimator) ll0Var.f28245g).setDuration(150L);
                ((ValueAnimator) ll0Var.f28245g).setInterpolator(bs.f25013g);
            } else {
                long measuredHeight = ((i28 / im0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j10 = measuredHeight;
                }
                ((ValueAnimator) ll0Var.f28245g).setDuration(Math.min(j10, 1300L));
                ((ValueAnimator) ll0Var.f28245g).setInterpolator(bs.h);
            }
        } else {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight2 = ((i28 / im0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j10 = measuredHeight2;
                }
                min = Math.min(j10, 1300L);
            }
            ((ValueAnimator) ll0Var.f28245g).setDuration(min);
            ((ValueAnimator) ll0Var.f28245g).setInterpolator(bs.h);
        }
        ((ValueAnimator) ll0Var.f28245g).start();
    }
}
