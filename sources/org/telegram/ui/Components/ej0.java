package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class ej0 implements View.OnLayoutChangeListener {
    public final v4.i0 f34727a;
    public final ArrayList f34728b;
    public final boolean f34729c;
    public final fj0 d;
    public final org.telegram.ui.ActionBar.l5 f34730e;

    public ej0(org.telegram.ui.ActionBar.l5 l5Var, v4.i0 i0Var, ArrayList arrayList, boolean z10, fj0 fj0Var) {
        this.f34730e = l5Var;
        this.f34727a = i0Var;
        this.f34728b = arrayList;
        this.f34729c = z10;
        this.d = fj0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        final ArrayList arrayList;
        int i17;
        int height;
        int i18;
        long min;
        View view2;
        org.telegram.ui.ActionBar.l5 l5Var = this.f34730e;
        HashMap hashMap = (HashMap) l5Var.f29291w;
        ek0 ek0Var = (ek0) l5Var.f29286e;
        ek0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        ek0Var.C0();
        int childCount = ek0Var.getChildCount();
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f34728b;
            if (i19 >= childCount) {
                break;
            }
            View childAt = ek0Var.getChildAt(i19);
            arrayList2.add(childAt);
            if (childAt.getTop() < i20) {
                i20 = childAt.getTop();
            }
            if (childAt.getBottom() > i21) {
                i21 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.q4) {
                ((org.telegram.ui.Cells.q4) childAt).b(true, false);
            }
            v4.i0 i0Var = this.f34727a;
            if (i0Var != null && (i0Var.f59281b || l5Var.f29285c)) {
                ek0Var.getClass();
                long c10 = i0Var.c(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(c10)) && (view2 = (View) hashMap.get(Long.valueOf(c10))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.q4) {
                        ((org.telegram.ui.Cells.q4) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    c8.ra raVar = (c8.ra) l5Var.f29289r;
                    if (raVar != null) {
                        raVar.d(view2);
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
                ek0Var.addView(view3);
                ((v4.c0) l5Var.f29287f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.q4) {
                ((org.telegram.ui.Cells.q4) view3).b(true, true);
            }
        }
        if (i25 == Integer.MAX_VALUE) {
            i17 = 0;
        } else {
            i17 = i25;
        }
        c8.ra raVar2 = (c8.ra) l5Var.f29289r;
        if (raVar2 != null) {
            raVar2.b();
        }
        if (arrayList.isEmpty()) {
            i18 = Math.abs(i22);
        } else {
            boolean z11 = this.f34729c;
            if (!z11) {
                i23 = ek0Var.getHeight() - i17;
            }
            if (z11) {
                height = -i20;
            } else {
                height = i21 - ek0Var.getHeight();
            }
            i18 = height + i23;
        }
        final int paddingBottom = ek0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) l5Var.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) l5Var.h).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        l5Var.h = ofFloat;
        final boolean z12 = this.f34729c;
        final int i26 = i18;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i27;
                org.telegram.ui.ActionBar.l5 l5Var2 = ej0.this.f34730e;
                ek0 ek0Var2 = (ek0) l5Var2.f29286e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i28 = 0;
                while (true) {
                    z13 = z12;
                    i27 = i26;
                    if (i28 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i28);
                    float y10 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y10 <= ek0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i27) * floatValue);
                        } else {
                            view4.setTranslationY(i27 * floatValue);
                        }
                    }
                    i28++;
                }
                int paddingBottom2 = paddingBottom - ek0Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i29 = 0; i29 < size3; i29++) {
                    View view5 = (View) arrayList4.get(i29);
                    if (z13) {
                        view5.setTranslationY(((1.0f - floatValue) * i27) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - floatValue) * (-i27));
                    }
                }
                ek0Var2.invalidate();
                gj0 gj0Var = (gj0) l5Var2.f29288n;
                if (gj0Var != null) {
                    gj0Var.f();
                }
            }
        });
        ((ValueAnimator) l5Var.h).addListener(new f10(2, this, arrayList2));
        long j3 = 300;
        if (l5Var.d) {
            if (z10) {
                ((ValueAnimator) l5Var.h).setDuration(150L);
                ((ValueAnimator) l5Var.h).setInterpolator(kr.f36859g);
            } else {
                long measuredHeight = ((i26 / ek0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j3 = measuredHeight;
                }
                ((ValueAnimator) l5Var.h).setDuration(Math.min(j3, 1300L));
                ((ValueAnimator) l5Var.h).setInterpolator(kr.h);
            }
        } else {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight2 = ((i26 / ek0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j3 = measuredHeight2;
                }
                min = Math.min(j3, 1300L);
            }
            ((ValueAnimator) l5Var.h).setDuration(min);
            ((ValueAnimator) l5Var.h).setInterpolator(kr.h);
        }
        ((ValueAnimator) l5Var.h).start();
    }
}
