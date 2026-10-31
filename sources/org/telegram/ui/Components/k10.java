package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class k10 extends ViewGroup {
    public AnimatorSet f27599a;
    public boolean f27600b;
    public final ArrayList f27601c;
    public s20 d;
    public final ArrayList e;
    public int f27602f;
    public int h;
    public int f27603n;
    public final l10 f27604r;

    public k10(l10 l10Var, Context context) {
        super(context);
        this.f27604r = l10Var;
        this.f27601c = new ArrayList();
        this.e = new ArrayList();
        this.f27602f = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        int y3;
        int i12;
        int i13;
        int i14;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int L = size - org.telegram.messenger.i0.L(26.0f);
        int L2 = org.telegram.messenger.i0.L(10.0f);
        int L3 = org.telegram.messenger.i0.L(10.0f);
        int i15 = 0;
        if (!this.f27600b) {
            this.f27603n = 0;
        }
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            arrayList = this.f27601c;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (!(childAt instanceof s20)) {
                i14 = i15;
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), 1073741824));
                ArrayList arrayList2 = this.e;
                boolean contains = arrayList2.contains(childAt);
                if (!contains) {
                    i14 = i15;
                    if (childAt.getMeasuredWidth() + i17 > L) {
                        L2 = org.telegram.messenger.m5.C(8.0f, childAt.getMeasuredHeight(), L2);
                        i17 = i14;
                    }
                } else {
                    i14 = i15;
                }
                if (childAt.getMeasuredWidth() + i18 > L) {
                    L3 = org.telegram.messenger.m5.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i18 = i14;
                }
                int L4 = org.telegram.messenger.i0.L(13.0f) + i17;
                if (!this.f27600b) {
                    if (contains) {
                        childAt.setTranslationX(org.telegram.messenger.i0.L(13.0f) + i18);
                        childAt.setTranslationY(L3);
                    } else if (!arrayList2.isEmpty()) {
                        float f7 = L4;
                        if (childAt.getTranslationX() != f7) {
                            float[] fArr = new float[1];
                            fArr[i14] = f7;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, fArr));
                        }
                        float f10 = L2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr2 = new float[1];
                            fArr2[i14] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr2));
                        }
                        this.f27603n = Math.max(this.f27603n, L2);
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                        this.f27603n = Math.max(this.f27603n, L2);
                    }
                }
                if (!contains) {
                    i17 = org.telegram.messenger.m5.C(9.0f, childAt.getMeasuredWidth(), i17);
                }
                i18 = org.telegram.messenger.m5.C(9.0f, childAt.getMeasuredWidth(), i18);
            }
            i16++;
            i15 = i14;
        }
        int i19 = i15;
        if (org.telegram.messenger.i0.Q1()) {
            y3 = org.telegram.messenger.i0.L(372.0f) / 3;
        } else {
            Point point = org.telegram.messenger.i0.f16026q;
            y3 = org.telegram.messenger.z20.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i17 < y3) {
            L2 += org.telegram.messenger.i0.L(40.0f);
        }
        if (L - i18 < y3) {
            L3 += org.telegram.messenger.i0.L(40.0f);
        }
        boolean z10 = this.f27600b;
        l10 l10Var = this.f27604r;
        if (!z10) {
            int L5 = org.telegram.messenger.i0.L(42.0f) + L3;
            l10Var.f27968n = L2;
            if (this.f27599a != null) {
                this.h = org.telegram.messenger.i0.L(42.0f) + L2;
                this.f27599a.playTogether(arrayList);
                i12 = i19;
                this.f27599a.addListener(new j10(this, i12));
                this.f27602f = org.telegram.messenger.zs.f(l10Var.f27964a).q(null, this.f27602f, true);
                this.f27599a.start();
                this.f27600b = true;
            } else {
                i12 = i19;
                this.h = L5;
            }
        } else {
            i12 = i19;
        }
        int i20 = this.f27603n;
        if (i20 > 0) {
            i13 = org.telegram.messenger.i0.L(40.0f) + i20;
        } else {
            i13 = i12;
        }
        l10Var.e = i13;
        setMeasuredDimension(size, this.h);
        i10 i10Var = l10Var.f27967f;
        if (i10Var != null) {
            i10Var.a(l10Var.e);
        }
    }
}
