package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class wl0 implements View.OnLayoutChangeListener {
    public final s4.i0 f32435a;
    public final ArrayList f32436b;
    public final boolean f32437c;
    public final xl0 d;
    public final zl0 f32438e;

    public wl0(zl0 zl0Var, s4.i0 i0Var, ArrayList arrayList, boolean z10, xl0 xl0Var) {
        this.f32438e = zl0Var;
        this.f32435a = i0Var;
        this.f32436b = arrayList;
        this.f32437c = z10;
        this.d = xl0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int i18;
        int height;
        int i19;
        long min;
        View view2;
        zl0 zl0Var = this.f32438e;
        HashMap hashMap = (HashMap) zl0Var.f33439k;
        wm0 wm0Var = (wm0) zl0Var.f33434e;
        wm0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        wm0Var.B0();
        int childCount = wm0Var.getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f32436b;
            if (i20 >= childCount) {
                break;
            }
            View childAt = wm0Var.getChildAt(i20);
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
            s4.i0 i0Var = this.f32435a;
            if (i0Var != null && (i0Var.f47952b || zl0Var.f33433c)) {
                wm0Var.getClass();
                long i24 = i0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i24)) && (view2 = (View) hashMap.get(Long.valueOf(i24))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    w7.x5 x5Var = (w7.x5) zl0Var.f33437i;
                    if (x5Var != null) {
                        x5Var.d(view2);
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
                wm0Var.addView(view3);
                ((s4.d0) zl0Var.f33435f).M(view3);
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
        w7.x5 x5Var2 = (w7.x5) zl0Var.f33437i;
        if (x5Var2 != null) {
            x5Var2.b();
        }
        if (arrayList.isEmpty()) {
            i19 = Math.abs(i23);
        } else {
            boolean z11 = this.f32437c;
            if (!z11) {
                i25 = wm0Var.getHeight() - i18;
            }
            if (z11) {
                height = -i21;
            } else {
                height = i22 - wm0Var.getHeight();
            }
            i19 = height + i25;
        }
        final int paddingBottom = wm0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) zl0Var.f33436g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) zl0Var.f33436g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        zl0Var.f33436g = ofFloat;
        final boolean z12 = this.f32437c;
        final int i28 = i19;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i29;
                zl0 zl0Var2 = wl0.this.f32438e;
                wm0 wm0Var2 = (wm0) zl0Var2.f33434e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= wm0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i29) * floatValue);
                        } else {
                            view4.setTranslationY(i29 * floatValue);
                        }
                    }
                    i30++;
                }
                int paddingBottom2 = paddingBottom - wm0Var2.getPaddingBottom();
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
                wm0Var2.invalidate();
                yl0 yl0Var = (yl0) zl0Var2.h;
                if (yl0Var != null) {
                    yl0Var.a();
                }
            }
        });
        ((ValueAnimator) zl0Var.f33436g).addListener(new ai.z(28, this, arrayList2));
        long j3 = 300;
        if (zl0Var.d) {
            if (z10) {
                ((ValueAnimator) zl0Var.f33436g).setDuration(150L);
                ((ValueAnimator) zl0Var.f33436g).setInterpolator(js.f27635g);
            } else {
                long measuredHeight = ((i28 / wm0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j3 = measuredHeight;
                }
                ((ValueAnimator) zl0Var.f33436g).setDuration(Math.min(j3, 1300L));
                ((ValueAnimator) zl0Var.f33436g).setInterpolator(js.h);
            }
        } else {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight2 = ((i28 / wm0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j3 = measuredHeight2;
                }
                min = Math.min(j3, 1300L);
            }
            ((ValueAnimator) zl0Var.f33436g).setDuration(min);
            ((ValueAnimator) zl0Var.f33436g).setInterpolator(js.h);
        }
        ((ValueAnimator) zl0Var.f33436g).start();
    }
}
