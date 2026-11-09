package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class v00 extends ViewGroup {
    public AnimatorSet f38863a;
    public boolean f38864b;
    public final ArrayList f38865c;
    public d20 d;
    public final ArrayList f38866e;
    public int f38867f;
    public int h;
    public int f38868n;
    public final w00 f38869r;

    public v00(w00 w00Var, Context context) {
        super(context);
        this.f38869r = w00Var;
        this.f38865c = new ArrayList();
        this.f38866e = new ArrayList();
        this.f38867f = -1;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
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
        if (!this.f38864b) {
            this.f38868n = 0;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            arrayList = this.f38865c;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (!(childAt instanceof d20)) {
                i13 = i14;
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                ArrayList arrayList2 = this.f38866e;
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
                if (!this.f38864b) {
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
                        this.f38868n = Math.max(this.f38868n, L2);
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                        this.f38868n = Math.max(this.f38868n, L2);
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
            Point point = org.telegram.messenger.g0.f22563q;
            y10 = org.telegram.messenger.camera.q.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i16 < y10) {
            L2 += org.telegram.messenger.g0.L(40.0f);
        }
        if (L - i17 < y10) {
            L3 += org.telegram.messenger.g0.L(40.0f);
        }
        boolean z9 = this.f38864b;
        w00 w00Var = this.f38869r;
        if (!z9) {
            int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
            w00Var.f39855n = L2;
            if (this.f38863a != null) {
                this.h = org.telegram.messenger.g0.L(42.0f) + L2;
                this.f38863a.playTogether(arrayList);
                i11 = i18;
                this.f38863a.addListener(new u00(this, i11));
                this.f38867f = org.telegram.messenger.qs.f(w00Var.f39850a).q(null, this.f38867f, true);
                this.f38863a.start();
                this.f38864b = true;
            } else {
                i11 = i18;
                this.h = L5;
            }
        } else {
            i11 = i18;
        }
        int i19 = this.f38868n;
        if (i19 > 0) {
            i12 = org.telegram.messenger.g0.L(40.0f) + i19;
        } else {
            i12 = i11;
        }
        w00Var.f39853e = i12;
        setMeasuredDimension(size, this.h);
        t00 t00Var = w00Var.f39854f;
        if (t00Var != null) {
            t00Var.a(w00Var.f39853e);
        }
    }
}
