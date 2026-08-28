package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class ak0 implements View.OnLayoutChangeListener {
    public final f2.r0 f26849a;
    public final ArrayList f26850b;
    public final boolean f26851c;
    public final bk0 d;
    public final c2.y f26852e;

    public ak0(c2.y yVar, f2.r0 r0Var, ArrayList arrayList, boolean z10, bk0 bk0Var) {
        this.f26852e = yVar;
        this.f26849a = r0Var;
        this.f26850b = arrayList;
        this.f26851c = z10;
        this.d = bk0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        final ArrayList arrayList;
        int i17;
        int height;
        int i18;
        long min;
        View view2;
        c2.y yVar = this.f26852e;
        HashMap hashMap = (HashMap) yVar.f2262k;
        wk0 wk0Var = (wk0) yVar.f2257e;
        wk0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        wk0Var.B0();
        int childCount = wk0Var.getChildCount();
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f26850b;
            if (i19 >= childCount) {
                break;
            }
            View childAt = wk0Var.getChildAt(i19);
            arrayList2.add(childAt);
            if (childAt.getTop() < i20) {
                i20 = childAt.getTop();
            }
            if (childAt.getBottom() > i21) {
                i21 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.o4) {
                ((org.telegram.ui.Cells.o4) childAt).c(true, false);
            }
            f2.r0 r0Var = this.f26849a;
            if (r0Var != null && (r0Var.f5524b || yVar.f2256c)) {
                wk0Var.getClass();
                long i23 = r0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i23)) && (view2 = (View) hashMap.get(Long.valueOf(i23))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    g7.f6 f6Var = (g7.f6) yVar.f2260i;
                    if (f6Var != null) {
                        f6Var.d(view2);
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
        int i24 = Integer.MAX_VALUE;
        int i25 = 0;
        int i26 = 0;
        while (i26 < size) {
            Object obj = arrayList.get(i26);
            i26++;
            View view3 = (View) obj;
            int bottom = view3.getBottom();
            int top2 = view3.getTop();
            if (bottom > i25) {
                i25 = bottom;
            }
            if (top2 < i24) {
                i24 = top2;
            }
            if (view3.getParent() == null) {
                wk0Var.addView(view3);
                ((f2.m0) yVar.f2258f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.o4) {
                ((org.telegram.ui.Cells.o4) view3).c(true, true);
            }
        }
        if (i24 == Integer.MAX_VALUE) {
            i17 = 0;
        } else {
            i17 = i24;
        }
        g7.f6 f6Var2 = (g7.f6) yVar.f2260i;
        if (f6Var2 != null) {
            f6Var2.b();
        }
        if (arrayList.isEmpty()) {
            i18 = Math.abs(i22);
        } else {
            boolean z11 = this.f26851c;
            if (!z11) {
                i25 = wk0Var.getHeight() - i17;
            }
            if (z11) {
                height = -i20;
            } else {
                height = i21 - wk0Var.getHeight();
            }
            i18 = height + i25;
        }
        final int paddingBottom = wk0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) yVar.f2259g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) yVar.f2259g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        yVar.f2259g = ofFloat;
        final boolean z12 = this.f26851c;
        final int i27 = i18;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i28;
                c2.y yVar2 = ak0.this.f26852e;
                wk0 wk0Var2 = (wk0) yVar2.f2257e;
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
                    float y10 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y10 <= wk0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i28) * floatValue);
                        } else {
                            view4.setTranslationY(i28 * floatValue);
                        }
                    }
                    i29++;
                }
                int paddingBottom2 = paddingBottom - wk0Var2.getPaddingBottom();
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
                wk0Var2.invalidate();
                ck0 ck0Var = (ck0) yVar2.h;
                if (ck0Var != null) {
                    ck0Var.b();
                }
            }
        });
        ((ValueAnimator) yVar.f2259g).addListener(new fg.j(26, this, arrayList2));
        long j10 = 300;
        if (yVar.d) {
            if (z10) {
                ((ValueAnimator) yVar.f2259g).setDuration(150L);
                ((ValueAnimator) yVar.f2259g).setInterpolator(gr.f28845g);
            } else {
                long measuredHeight = ((i27 / wk0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j10 = measuredHeight;
                }
                ((ValueAnimator) yVar.f2259g).setDuration(Math.min(j10, 1300L));
                ((ValueAnimator) yVar.f2259g).setInterpolator(gr.h);
            }
        } else {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight2 = ((i27 / wk0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j10 = measuredHeight2;
                }
                min = Math.min(j10, 1300L);
            }
            ((ValueAnimator) yVar.f2259g).setDuration(min);
            ((ValueAnimator) yVar.f2259g).setInterpolator(gr.h);
        }
        ((ValueAnimator) yVar.f2259g).start();
    }
}
