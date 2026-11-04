package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class q00 extends ViewGroup {
    public AnimatorSet f37300a;
    public boolean f37301b;
    public final ArrayList f37302c;
    public y10 d;
    public final ArrayList f37303e;
    public int f37304f;
    public int h;
    public int f37305n;
    public final r00 f37306r;

    public q00(r00 r00Var, Context context) {
        super(context);
        this.f37306r = r00Var;
        this.f37302c = new ArrayList();
        this.f37303e = new ArrayList();
        this.f37304f = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        ArrayList arrayList;
        int y9;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i3);
        int L = size - org.telegram.messenger.g0.L(26.0f);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i14 = 0;
        if (!this.f37301b) {
            this.f37305n = 0;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            arrayList = this.f37302c;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (!(childAt instanceof y10)) {
                i13 = i14;
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                ArrayList arrayList2 = this.f37303e;
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
                if (!this.f37301b) {
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
                        this.f37305n = Math.max(this.f37305n, L2);
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                        this.f37305n = Math.max(this.f37305n, L2);
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
            y9 = org.telegram.messenger.g0.L(372.0f) / 3;
        } else {
            Point point = org.telegram.messenger.g0.f22608q;
            y9 = org.telegram.messenger.camera.q.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i16 < y9) {
            L2 += org.telegram.messenger.g0.L(40.0f);
        }
        if (L - i17 < y9) {
            L3 += org.telegram.messenger.g0.L(40.0f);
        }
        boolean z10 = this.f37301b;
        r00 r00Var = this.f37306r;
        if (!z10) {
            int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
            r00Var.f37590n = L2;
            if (this.f37300a != null) {
                this.h = org.telegram.messenger.g0.L(42.0f) + L2;
                this.f37300a.playTogether(arrayList);
                i11 = i18;
                this.f37300a.addListener(new p00(this, i11));
                this.f37304f = org.telegram.messenger.hs.f(r00Var.f37585a).q(null, this.f37304f, true);
                this.f37300a.start();
                this.f37301b = true;
            } else {
                i11 = i18;
                this.h = L5;
            }
        } else {
            i11 = i18;
        }
        int i19 = this.f37305n;
        if (i19 > 0) {
            i12 = org.telegram.messenger.g0.L(40.0f) + i19;
        } else {
            i12 = i11;
        }
        r00Var.f37588e = i12;
        setMeasuredDimension(size, this.h);
        o00 o00Var = r00Var.f37589f;
        if (o00Var != null) {
            o00Var.a(r00Var.f37588e);
        }
    }
}
