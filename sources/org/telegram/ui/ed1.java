package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ed1 extends ViewGroup {
    public AnimatorSet f36804a;
    public boolean f36805b;
    public final ArrayList f36806c;
    public org.telegram.ui.Components.s20 d;
    public org.telegram.ui.Components.s20 e;
    public final UsersSelectActivity f36807f;

    public ed1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f36807f = usersSelectActivity;
        this.f36806c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.s20 s20Var, boolean z10) {
        UsersSelectActivity usersSelectActivity = this.f36807f;
        usersSelectActivity.O.add(s20Var);
        long uid = s20Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f34161x++;
        }
        usersSelectActivity.N.k(s20Var, uid);
        org.telegram.ui.ActionBar.n0 n0Var = usersSelectActivity.f34155c;
        n0Var.t(false, TextUtils.isEmpty(n0Var.getText()));
        AnimatorSet animatorSet = this.f36804a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f36804a.setupEndValues();
            this.f36804a.cancel();
        }
        this.f36805b = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f36804a = animatorSet2;
            animatorSet2.addListener(new ms0(this, 14));
            this.f36804a.setDuration(150L);
            this.d = s20Var;
            ArrayList arrayList = this.f36806c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f, 1.0f));
        }
        addView(s20Var);
    }

    public final void b(org.telegram.ui.Components.s20 s20Var) {
        UsersSelectActivity usersSelectActivity = this.f36807f;
        usersSelectActivity.f34160w = true;
        long uid = s20Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f34161x--;
        }
        usersSelectActivity.N.l(uid);
        usersSelectActivity.O.remove(s20Var);
        s20Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f36804a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.f36804a.cancel();
        }
        this.f36805b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f36804a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.jw0(11, (Object) this, (Object) s20Var));
        this.f36804a.setDuration(150L);
        this.e = s20Var;
        ArrayList arrayList = this.f36806c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
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
        Property property;
        Property property2;
        ArrayList arrayList;
        int y3;
        int i12;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int L = size - org.telegram.messenger.i0.L(26.0f);
        int L2 = org.telegram.messenger.i0.L(10.0f);
        int L3 = org.telegram.messenger.i0.L(10.0f);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            property = View.TRANSLATION_Y;
            property2 = View.TRANSLATION_X;
            arrayList = this.f36806c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Components.s20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), 1073741824));
                if (childAt != this.e && childAt.getMeasuredWidth() + i14 > L) {
                    L2 = org.telegram.messenger.m5.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > L) {
                    L3 = org.telegram.messenger.m5.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i15 = 0;
                }
                int L4 = org.telegram.messenger.i0.L(13.0f) + i14;
                if (!this.f36805b) {
                    org.telegram.ui.Components.s20 s20Var = this.e;
                    if (childAt == s20Var) {
                        childAt.setTranslationX(org.telegram.messenger.i0.L(13.0f) + i15);
                        childAt.setTranslationY(L3);
                    } else if (s20Var != null) {
                        float f7 = L4;
                        if (childAt.getTranslationX() != f7) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, property2, f7));
                        } else {
                            i12 = 1;
                        }
                        float f10 = L2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr = new float[i12];
                            fArr[0] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, property, fArr));
                        }
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                    }
                }
                if (childAt != this.e) {
                    i14 = org.telegram.messenger.m5.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.m5.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
        }
        if (org.telegram.messenger.i0.Q1()) {
            y3 = org.telegram.messenger.i0.L(372.0f) / 3;
        } else {
            Point point = org.telegram.messenger.i0.f16172q;
            y3 = org.telegram.messenger.a30.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i14 < y3) {
            L2 += org.telegram.messenger.i0.L(40.0f);
            i14 = 0;
        }
        if (L - i15 < y3) {
            L3 += org.telegram.messenger.i0.L(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f36807f;
        usersSelectActivity.f34155c.measure(View.MeasureSpec.makeMeasureSpec(L - i14, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), 1073741824));
        if (!this.f36805b) {
            int L5 = org.telegram.messenger.i0.L(42.0f) + L3;
            int L6 = org.telegram.messenger.i0.L(16.0f) + i14;
            usersSelectActivity.Q = L2;
            if (this.f36804a != null) {
                int L7 = org.telegram.messenger.i0.L(42.0f) + L2;
                if (usersSelectActivity.D != L7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", L7));
                }
                float f11 = L6;
                if (usersSelectActivity.f34155c.getTranslationX() != f11) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f34155c, property2, f11));
                }
                float translationY = usersSelectActivity.f34155c.getTranslationY();
                float f12 = usersSelectActivity.Q;
                if (translationY != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f34155c, property, f12));
                }
                usersSelectActivity.f34155c.setAllowDrawCursor(false);
                this.f36804a.playTogether(arrayList);
                this.f36804a.start();
                this.f36805b = true;
            } else {
                usersSelectActivity.D = L5;
                usersSelectActivity.f34155c.setTranslationX(L6);
                usersSelectActivity.f34155c.setTranslationY(usersSelectActivity.Q);
            }
        } else if (this.f36804a != null && !usersSelectActivity.f34160w && this.e == null) {
            org.telegram.ui.ActionBar.n0 n0Var = usersSelectActivity.f34155c;
            n0Var.bringPointIntoView(n0Var.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.D);
    }
}
