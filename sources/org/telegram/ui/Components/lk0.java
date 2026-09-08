package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class lk0 implements View.OnLayoutChangeListener {
    public final s4.h0 f28216a;
    public final ArrayList f28217b;
    public final boolean f28218c;
    public final mk0 d;
    public final ok0 f28219e;

    public lk0(ok0 ok0Var, s4.h0 h0Var, ArrayList arrayList, boolean z10, mk0 mk0Var) {
        this.f28219e = ok0Var;
        this.f28216a = h0Var;
        this.f28217b = arrayList;
        this.f28218c = z10;
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
        ok0 ok0Var = this.f28219e;
        HashMap hashMap = (HashMap) ok0Var.f29132k;
        ll0 ll0Var = (ll0) ok0Var.f29127e;
        ll0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        ll0Var.B0();
        int childCount = ll0Var.getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f28217b;
            if (i20 >= childCount) {
                break;
            }
            View childAt = ll0Var.getChildAt(i20);
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
            s4.h0 h0Var = this.f28216a;
            if (h0Var != null && (h0Var.f45823b || ok0Var.f29126c)) {
                ll0Var.getClass();
                long i24 = h0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i24)) && (view2 = (View) hashMap.get(Long.valueOf(i24))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) view2).e(false, false);
                    }
                    arrayList.remove(view2);
                    w7.y5 y5Var = (w7.y5) ok0Var.f29130i;
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
                ll0Var.addView(view3);
                ((s4.c0) ok0Var.f29128f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.n4) {
                ((org.telegram.ui.Cells.n4) view3).e(true, true);
            }
        }
        if (i25 == Integer.MAX_VALUE) {
            i18 = 0;
        } else {
            i18 = i25;
        }
        w7.y5 y5Var2 = (w7.y5) ok0Var.f29130i;
        if (y5Var2 != null) {
            y5Var2.b();
        }
        if (arrayList.isEmpty()) {
            i19 = Math.abs(i23);
        } else {
            boolean z11 = this.f28218c;
            if (!z11) {
                i26 = ll0Var.getHeight() - i18;
            }
            if (z11) {
                height = -i21;
            } else {
                height = i22 - ll0Var.getHeight();
            }
            i19 = height + i26;
        }
        final int paddingBottom = ll0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) ok0Var.f29129g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) ok0Var.f29129g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ok0Var.f29129g = ofFloat;
        final boolean z12 = this.f28218c;
        final int i28 = i19;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i29;
                ok0 ok0Var2 = lk0.this.f28219e;
                ll0 ll0Var2 = (ll0) ok0Var2.f29127e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= ll0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i29) * floatValue);
                        } else {
                            view4.setTranslationY(i29 * floatValue);
                        }
                    }
                    i30++;
                }
                int paddingBottom2 = paddingBottom - ll0Var2.getPaddingBottom();
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
                ll0Var2.invalidate();
                nk0 nk0Var = (nk0) ok0Var2.h;
                if (nk0Var != null) {
                    nk0Var.b();
                }
            }
        });
        ((ValueAnimator) ok0Var.f29129g).addListener(new bi.t(28, this, arrayList2));
        long j3 = 300;
        if (ok0Var.d) {
            if (z10) {
                ((ValueAnimator) ok0Var.f29129g).setDuration(150L);
                ((ValueAnimator) ok0Var.f29129g).setInterpolator(pr.f29494g);
            } else {
                long measuredHeight = ((i28 / ll0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j3 = measuredHeight;
                }
                ((ValueAnimator) ok0Var.f29129g).setDuration(Math.min(j3, 1300L));
                ((ValueAnimator) ok0Var.f29129g).setInterpolator(pr.h);
            }
        } else {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight2 = ((i28 / ll0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j3 = measuredHeight2;
                }
                min = Math.min(j3, 1300L);
            }
            ((ValueAnimator) ok0Var.f29129g).setDuration(min);
            ((ValueAnimator) ok0Var.f29129g).setInterpolator(pr.h);
        }
        ((ValueAnimator) ok0Var.f29129g).start();
    }
}
