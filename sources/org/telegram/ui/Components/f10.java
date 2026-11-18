package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class f10 extends ViewGroup {
    public AnimatorSet f34865a;
    public boolean f34866b;
    public final ArrayList f34867c;
    public m20 d;
    public final ArrayList f34868e;
    public int f34869f;
    public int h;
    public int f34870n;
    public final g10 f34871r;

    public f10(g10 g10Var, Context context) {
        super(context);
        this.f34871r = g10Var;
        this.f34867c = new ArrayList();
        this.f34868e = new ArrayList();
        this.f34869f = -1;
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
        int z10;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(26.0f);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i14 = 0;
        if (!this.f34866b) {
            this.f34870n = 0;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            arrayList = this.f34867c;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (!(childAt instanceof m20)) {
                i13 = i14;
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                ArrayList arrayList2 = this.f34868e;
                boolean contains = arrayList2.contains(childAt);
                if (!contains) {
                    i13 = i14;
                    if (childAt.getMeasuredWidth() + i16 > L) {
                        L2 = org.telegram.messenger.f3.C(8.0f, childAt.getMeasuredHeight(), L2);
                        i16 = i13;
                    }
                } else {
                    i13 = i14;
                }
                if (childAt.getMeasuredWidth() + i17 > L) {
                    L3 = org.telegram.messenger.f3.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i17 = i13;
                }
                int L4 = org.telegram.messenger.g0.L(13.0f) + i16;
                if (!this.f34866b) {
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
                        this.f34870n = Math.max(this.f34870n, L2);
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                        this.f34870n = Math.max(this.f34870n, L2);
                    }
                }
                if (!contains) {
                    i16 = org.telegram.messenger.f3.C(9.0f, childAt.getMeasuredWidth(), i16);
                }
                i17 = org.telegram.messenger.f3.C(9.0f, childAt.getMeasuredWidth(), i17);
            }
            i15++;
            i14 = i13;
        }
        int i18 = i14;
        if (org.telegram.messenger.g0.Q1()) {
            z10 = org.telegram.messenger.g0.L(372.0f) / 3;
        } else {
            Point point = org.telegram.messenger.g0.f24118q;
            z10 = org.telegram.messenger.n10.z(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i16 < z10) {
            L2 += org.telegram.messenger.g0.L(40.0f);
        }
        if (L - i17 < z10) {
            L3 += org.telegram.messenger.g0.L(40.0f);
        }
        boolean z11 = this.f34866b;
        g10 g10Var = this.f34871r;
        if (!z11) {
            int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
            g10Var.f35291n = L2;
            if (this.f34865a != null) {
                this.h = org.telegram.messenger.g0.L(42.0f) + L2;
                this.f34865a.playTogether(arrayList);
                i11 = i18;
                this.f34865a.addListener(new e10(this, i11));
                this.f34869f = org.telegram.messenger.ks.f(g10Var.f35286a).q(null, this.f34869f, true);
                this.f34865a.start();
                this.f34866b = true;
            } else {
                i11 = i18;
                this.h = L5;
            }
        } else {
            i11 = i18;
        }
        int i19 = this.f34870n;
        if (i19 > 0) {
            i12 = org.telegram.messenger.g0.L(40.0f) + i19;
        } else {
            i12 = i11;
        }
        g10Var.f35289e = i12;
        setMeasuredDimension(size, this.h);
        d10 d10Var = g10Var.f35290f;
        if (d10Var != null) {
            d10Var.a(g10Var.f35289e);
        }
    }
}
