package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
public final class si0 implements View.OnLayoutChangeListener {
    public final u4.h0 f38038a;
    public final ArrayList f38039b;
    public final boolean f38040c;
    public final ti0 d;
    public final vi0 f38041e;

    public si0(vi0 vi0Var, u4.h0 h0Var, ArrayList arrayList, boolean z10, ti0 ti0Var) {
        this.f38041e = vi0Var;
        this.f38038a = h0Var;
        this.f38039b = arrayList;
        this.f38040c = z10;
        this.d = ti0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        final ArrayList arrayList;
        int height;
        int i17;
        long min;
        View view2;
        vi0 vi0Var = this.f38041e;
        HashMap hashMap = (HashMap) vi0Var.f39133k;
        tj0 tj0Var = (tj0) vi0Var.f39128e;
        tj0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        tj0Var.C0();
        int childCount = tj0Var.getChildCount();
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.f38039b;
            if (i18 >= childCount) {
                break;
            }
            View childAt = tj0Var.getChildAt(i18);
            arrayList2.add(childAt);
            if (childAt.getTop() < i19) {
                i19 = childAt.getTop();
            }
            if (childAt.getBottom() > i20) {
                i20 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) childAt).b(true, false);
            }
            u4.h0 h0Var = this.f38038a;
            if (h0Var != null && (h0Var.f55580b || vi0Var.f39127c)) {
                tj0Var.getClass();
                long c2 = h0Var.c(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(c2)) && (view2 = (View) hashMap.get(Long.valueOf(c2))) != null) {
                    if (view2 instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    b8.of ofVar = (b8.of) vi0Var.f39131i;
                    if (ofVar != null) {
                        ofVar.d(view2);
                    }
                    int top = childAt.getTop() - view2.getTop();
                    if (top != 0) {
                        i21 = top;
                    }
                    z10 = true;
                }
            }
            i18++;
        }
        hashMap.clear();
        int size = arrayList.size();
        int i22 = 0;
        int i23 = 0;
        int i24 = Integer.MAX_VALUE;
        while (i23 < size) {
            Object obj = arrayList.get(i23);
            i23++;
            View view3 = (View) obj;
            int bottom = view3.getBottom();
            int top2 = view3.getTop();
            if (bottom > i22) {
                i22 = bottom;
            }
            if (top2 < i24) {
                i24 = top2;
            }
            if (view3.getParent() == null) {
                tj0Var.addView(view3);
                ((u4.b0) vi0Var.f39129f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) view3).b(true, true);
            }
        }
        if (i24 == Integer.MAX_VALUE) {
            i24 = 0;
        }
        b8.of ofVar2 = (b8.of) vi0Var.f39131i;
        if (ofVar2 != null) {
            ofVar2.b();
        }
        if (arrayList.isEmpty()) {
            i17 = Math.abs(i21);
        } else {
            boolean z11 = this.f38040c;
            if (!z11) {
                i22 = tj0Var.getHeight() - i24;
            }
            if (z11) {
                height = -i19;
            } else {
                height = i20 - tj0Var.getHeight();
            }
            i17 = height + i22;
        }
        final int paddingBottom = tj0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) vi0Var.f39130g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) vi0Var.f39130g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        vi0Var.f39130g = ofFloat;
        final boolean z12 = this.f38040c;
        final int i25 = i17;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i26;
                vi0 vi0Var2 = si0.this.f38041e;
                tj0 tj0Var2 = (tj0) vi0Var2.f39128e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i27 = 0;
                while (true) {
                    z13 = z12;
                    i26 = i25;
                    if (i27 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i27);
                    float y9 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y9 <= tj0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i26) * floatValue);
                        } else {
                            view4.setTranslationY(i26 * floatValue);
                        }
                    }
                    i27++;
                }
                int paddingBottom2 = paddingBottom - tj0Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    View view5 = (View) arrayList4.get(i28);
                    if (z13) {
                        view5.setTranslationY(((1.0f - floatValue) * i26) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - floatValue) * (-i26));
                    }
                }
                tj0Var2.invalidate();
                ui0 ui0Var = (ui0) vi0Var2.h;
                if (ui0Var != null) {
                    ui0Var.h();
                }
            }
        });
        ((ValueAnimator) vi0Var.f39130g).addListener(new ri0(0, this, arrayList2));
        long j10 = 300;
        if (vi0Var.d) {
            if (z10) {
                ((ValueAnimator) vi0Var.f39130g).setDuration(150L);
                ((ValueAnimator) vi0Var.f39130g).setInterpolator(xq.f40453g);
            } else {
                long measuredHeight = ((i25 / tj0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight >= 300) {
                    j10 = measuredHeight;
                }
                ((ValueAnimator) vi0Var.f39130g).setDuration(Math.min(j10, 1300L));
                ((ValueAnimator) vi0Var.f39130g).setInterpolator(xq.h);
            }
        } else {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight2 = ((i25 / tj0Var.getMeasuredHeight()) + 1.0f) * 200.0f;
                if (measuredHeight2 >= 300) {
                    j10 = measuredHeight2;
                }
                min = Math.min(j10, 1300L);
            }
            ((ValueAnimator) vi0Var.f39130g).setDuration(min);
            ((ValueAnimator) vi0Var.f39130g).setInterpolator(xq.h);
        }
        ((ValueAnimator) vi0Var.f39130g).start();
    }
}
