package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class ti0 implements View.OnLayoutChangeListener {
    public final v4.h0 f39704a;
    public final ArrayList f39705b;
    public final boolean f39706c;
    public final ui0 d;
    public final wi0 f39707e;

    public ti0(wi0 wi0Var, v4.h0 h0Var, ArrayList arrayList, boolean z10, ui0 ui0Var) {
        this.f39707e = wi0Var;
        this.f39704a = h0Var;
        this.f39705b = arrayList;
        this.f39706c = z10;
        this.d = ui0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        final ArrayList arrayList;
        int i17;
        int height;
        int i18;
        long min;
        View view2;
        wi0 wi0Var = this.f39707e;
        HashMap hashMap = (HashMap) wi0Var.f41361k;
        uj0 uj0Var = (uj0) wi0Var.f41356e;
        uj0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        uj0Var.C0();
        int childCount = uj0Var.getChildCount();
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f39705b;
            if (i19 >= childCount) {
                break;
            }
            View childAt = uj0Var.getChildAt(i19);
            arrayList2.add(childAt);
            if (childAt.getTop() < i20) {
                i20 = childAt.getTop();
            }
            if (childAt.getBottom() > i21) {
                i21 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) childAt).b(true, false);
            }
            v4.h0 h0Var = this.f39704a;
            if (h0Var != null && (h0Var.f58571b || wi0Var.f41355c)) {
                uj0Var.getClass();
                long c10 = h0Var.c(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(c10)) && (view2 = (View) hashMap.get(Long.valueOf(c10))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    c8.ma maVar = (c8.ma) wi0Var.f41359i;
                    if (maVar != null) {
                        maVar.d(view2);
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
                uj0Var.addView(view3);
                ((v4.b0) wi0Var.f41357f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) view3).b(true, true);
            }
        }
        if (i25 == Integer.MAX_VALUE) {
            i17 = 0;
        } else {
            i17 = i25;
        }
        c8.ma maVar2 = (c8.ma) wi0Var.f41359i;
        if (maVar2 != null) {
            maVar2.b();
        }
        if (arrayList.isEmpty()) {
            i18 = Math.abs(i22);
        } else {
            boolean z11 = this.f39706c;
            if (!z11) {
                i23 = uj0Var.getHeight() - i17;
            }
            if (z11) {
                height = -i20;
            } else {
                height = i21 - uj0Var.getHeight();
            }
            i18 = height + i23;
        }
        final int paddingBottom = uj0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) wi0Var.f41358g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) wi0Var.f41358g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        wi0Var.f41358g = ofFloat;
        final boolean z12 = this.f39706c;
        final int i26 = i18;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i27;
                wi0 wi0Var2 = ti0.this.f39707e;
                uj0 uj0Var2 = (uj0) wi0Var2.f41356e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y10 <= uj0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i27) * floatValue);
                        } else {
                            view4.setTranslationY(i27 * floatValue);
                        }
                    }
                    i28++;
                }
                int paddingBottom2 = paddingBottom - uj0Var2.getPaddingBottom();
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
                uj0Var2.invalidate();
                vi0 vi0Var = (vi0) wi0Var2.h;
                if (vi0Var != null) {
                    vi0Var.i();
                }
            }
        });
        ((ValueAnimator) wi0Var.f41358g).addListener(new y50(1, this, arrayList2));
        long j3 = 300;
        if (wi0Var.d) {
            if (z10) {
                ((ValueAnimator) wi0Var.f41358g).setDuration(150L);
                ((ValueAnimator) wi0Var.f41358g).setInterpolator(er.f34421g);
            } else {
                long measuredHeight = ((i26 / uj0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j3 = measuredHeight;
                }
                ((ValueAnimator) wi0Var.f41358g).setDuration(Math.min(j3, 1300L));
                ((ValueAnimator) wi0Var.f41358g).setInterpolator(er.h);
            }
        } else {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight2 = ((i26 / uj0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j3 = measuredHeight2;
                }
                min = Math.min(j3, 1300L);
            }
            ((ValueAnimator) wi0Var.f41358g).setDuration(min);
            ((ValueAnimator) wi0Var.f41358g).setInterpolator(er.h);
        }
        ((ValueAnimator) wi0Var.f41358g).start();
    }
}
