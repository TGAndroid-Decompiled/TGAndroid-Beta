package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class y00 extends ViewGroup {
    public AnimatorSet f41823a;
    public boolean f41824b;
    public final ArrayList f41825c;
    public f20 d;
    public final ArrayList f41826e;
    public int f41827f;
    public int h;
    public int f41828n;
    public final z00 f41829r;

    public y00(z00 z00Var, Context context) {
        super(context);
        this.f41829r = z00Var;
        this.f41825c = new ArrayList();
        this.f41826e = new ArrayList();
        this.f41827f = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList;
        int y10;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(26.0f);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i14 = 0;
        if (!this.f41824b) {
            this.f41828n = 0;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            arrayList = this.f41825c;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (!(childAt instanceof f20)) {
                i13 = i14;
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                ArrayList arrayList2 = this.f41826e;
                boolean contains = arrayList2.contains(childAt);
                if (!contains) {
                    i13 = i14;
                    if (childAt.getMeasuredWidth() + i16 > L) {
                        L2 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L2);
                        i16 = i13;
                    }
                } else {
                    i13 = i14;
                }
                if (childAt.getMeasuredWidth() + i17 > L) {
                    L3 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i17 = i13;
                }
                int L4 = org.telegram.messenger.g0.L(13.0f) + i16;
                if (!this.f41824b) {
                    if (contains) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i17);
                        childAt.setTranslationY(L3);
                    } else if (!arrayList2.isEmpty()) {
                        float f10 = L4;
                        if (childAt.getTranslationX() != f10) {
                            float[] fArr = new float[1];
                            fArr[i13] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, fArr));
                        }
                        float f11 = L2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr2 = new float[1];
                            fArr2[i13] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr2));
                        }
                        this.f41828n = Math.max(this.f41828n, L2);
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                        this.f41828n = Math.max(this.f41828n, L2);
                    }
                }
                if (!contains) {
                    i16 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i16);
                }
                i17 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i17);
            }
            i15++;
            i14 = i13;
        }
        int i18 = i14;
        if (org.telegram.messenger.g0.Q1()) {
            y10 = org.telegram.messenger.g0.L(372.0f) / 3;
        } else {
            Point point = org.telegram.messenger.g0.f23611q;
            y10 = org.telegram.messenger.i20.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i16 < y10) {
            L2 += org.telegram.messenger.g0.L(40.0f);
        }
        if (L - i17 < y10) {
            L3 += org.telegram.messenger.g0.L(40.0f);
        }
        boolean z10 = this.f41824b;
        z00 z00Var = this.f41829r;
        if (!z10) {
            int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
            z00Var.f42207n = L2;
            if (this.f41823a != null) {
                this.h = org.telegram.messenger.g0.L(42.0f) + L2;
                this.f41823a.playTogether(arrayList);
                i11 = i18;
                this.f41823a.addListener(new x00(this, i11));
                this.f41827f = org.telegram.messenger.ns.f(z00Var.f42202a).q(null, this.f41827f, true);
                this.f41823a.start();
                this.f41824b = true;
            } else {
                i11 = i18;
                this.h = L5;
            }
        } else {
            i11 = i18;
        }
        int i19 = this.f41828n;
        if (i19 > 0) {
            i12 = org.telegram.messenger.g0.L(40.0f) + i19;
        } else {
            i12 = i11;
        }
        z00Var.f42205e = i12;
        setMeasuredDimension(size, this.h);
        w00 w00Var = z00Var.f42206f;
        if (w00Var != null) {
            w00Var.a(z00Var.f42205e);
        }
    }
}
