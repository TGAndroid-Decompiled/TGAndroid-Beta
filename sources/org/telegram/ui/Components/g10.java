package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class g10 extends ViewGroup {
    public AnimatorSet f35271a;
    public boolean f35272b;
    public final ArrayList f35273c;
    public n20 d;
    public final ArrayList f35274e;
    public int f35275f;
    public int h;
    public int f35276n;
    public final h10 f35277r;

    public g10(h10 h10Var, Context context) {
        super(context);
        this.f35277r = h10Var;
        this.f35273c = new ArrayList();
        this.f35274e = new ArrayList();
        this.f35275f = -1;
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
        if (!this.f35272b) {
            this.f35276n = 0;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            arrayList = this.f35273c;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (!(childAt instanceof n20)) {
                i13 = i14;
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                ArrayList arrayList2 = this.f35274e;
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
                if (!this.f35272b) {
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
                        this.f35276n = Math.max(this.f35276n, L2);
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                        this.f35276n = Math.max(this.f35276n, L2);
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
            Point point = org.telegram.messenger.g0.f24226q;
            z10 = org.telegram.messenger.m10.z(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i16 < z10) {
            L2 += org.telegram.messenger.g0.L(40.0f);
        }
        if (L - i17 < z10) {
            L3 += org.telegram.messenger.g0.L(40.0f);
        }
        boolean z11 = this.f35272b;
        h10 h10Var = this.f35277r;
        if (!z11) {
            int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
            h10Var.f35615n = L2;
            if (this.f35271a != null) {
                this.h = org.telegram.messenger.g0.L(42.0f) + L2;
                this.f35271a.playTogether(arrayList);
                i11 = i18;
                this.f35271a.addListener(new e10(this, i11));
                this.f35275f = org.telegram.messenger.ks.f(h10Var.f35610a).q(null, this.f35275f, true);
                this.f35271a.start();
                this.f35272b = true;
            } else {
                i11 = i18;
                this.h = L5;
            }
        } else {
            i11 = i18;
        }
        int i19 = this.f35276n;
        if (i19 > 0) {
            i12 = org.telegram.messenger.g0.L(40.0f) + i19;
        } else {
            i12 = i11;
        }
        h10Var.f35613e = i12;
        setMeasuredDimension(size, this.h);
        d10 d10Var = h10Var.f35614f;
        if (d10Var != null) {
            d10Var.a(h10Var.f35613e);
        }
    }
}
