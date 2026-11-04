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
public final class db1 extends ViewGroup {
    public AnimatorSet f44616a;
    public boolean f44617b;
    public final ArrayList f44618c;
    public org.telegram.ui.Components.y10 d;
    public org.telegram.ui.Components.y10 f44619e;
    public final UsersSelectActivity f44620f;

    public db1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f44620f = usersSelectActivity;
        this.f44618c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.y10 y10Var, boolean z10) {
        UsersSelectActivity usersSelectActivity = this.f44620f;
        usersSelectActivity.Q.add(y10Var);
        long uid = y10Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f42114x++;
        }
        usersSelectActivity.P.k(y10Var, uid);
        bh.g gVar = usersSelectActivity.f42107c;
        gVar.t(false, TextUtils.isEmpty(gVar.getText()));
        AnimatorSet animatorSet = this.f44616a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f44616a.setupEndValues();
            this.f44616a.cancel();
        }
        this.f44617b = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f44616a = animatorSet2;
            animatorSet2.addListener(new i81(this, 3));
            this.f44616a.setDuration(150L);
            this.d = y10Var;
            ArrayList arrayList = this.f44618c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f, 1.0f));
        }
        addView(y10Var);
    }

    public final void b(org.telegram.ui.Components.y10 y10Var) {
        UsersSelectActivity usersSelectActivity = this.f44620f;
        usersSelectActivity.f42113w = true;
        long uid = y10Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f42114x--;
        }
        usersSelectActivity.P.l(uid);
        usersSelectActivity.Q.remove(y10Var);
        y10Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f44616a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.f44616a.cancel();
        }
        this.f44617b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f44616a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.ri0(15, this, y10Var));
        this.f44616a.setDuration(150L);
        this.f44619e = y10Var;
        ArrayList arrayList = this.f44618c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f44619e, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f44619e, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f44619e, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
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
        Property property;
        Property property2;
        ArrayList arrayList;
        int y9;
        int i11;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i3);
        int L = size - org.telegram.messenger.g0.L(26.0f);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            property = View.TRANSLATION_Y;
            property2 = View.TRANSLATION_X;
            arrayList = this.f44618c;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Components.y10) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                if (childAt != this.f44619e && childAt.getMeasuredWidth() + i13 > L) {
                    L2 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i13 = 0;
                }
                if (childAt.getMeasuredWidth() + i14 > L) {
                    L3 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i14 = 0;
                }
                int L4 = org.telegram.messenger.g0.L(13.0f) + i13;
                if (!this.f44617b) {
                    org.telegram.ui.Components.y10 y10Var = this.f44619e;
                    if (childAt == y10Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i14);
                        childAt.setTranslationY(L3);
                    } else if (y10Var != null) {
                        float f10 = L4;
                        if (childAt.getTranslationX() != f10) {
                            i11 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, property2, f10));
                        } else {
                            i11 = 1;
                        }
                        float f11 = L2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i11];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, property, fArr));
                        }
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                    }
                }
                if (childAt != this.f44619e) {
                    i13 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i13);
                }
                i14 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i14);
            }
            i12++;
        }
        if (org.telegram.messenger.g0.Q1()) {
            y9 = org.telegram.messenger.g0.L(372.0f) / 3;
        } else {
            Point point = org.telegram.messenger.g0.f22608q;
            y9 = org.telegram.messenger.camera.q.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i13 < y9) {
            L2 += org.telegram.messenger.g0.L(40.0f);
            i13 = 0;
        }
        if (L - i14 < y9) {
            L3 += org.telegram.messenger.g0.L(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f44620f;
        usersSelectActivity.f42107c.measure(View.MeasureSpec.makeMeasureSpec(L - i13, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
        if (!this.f44617b) {
            int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
            int L6 = org.telegram.messenger.g0.L(16.0f) + i13;
            usersSelectActivity.S = L2;
            if (this.f44616a != null) {
                int L7 = org.telegram.messenger.g0.L(42.0f) + L2;
                if (usersSelectActivity.E != L7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", L7));
                }
                float f12 = L6;
                if (usersSelectActivity.f42107c.getTranslationX() != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f42107c, property2, f12));
                }
                float translationY = usersSelectActivity.f42107c.getTranslationY();
                float f13 = usersSelectActivity.S;
                if (translationY != f13) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f42107c, property, f13));
                }
                usersSelectActivity.f42107c.setAllowDrawCursor(false);
                this.f44616a.playTogether(arrayList);
                this.f44616a.start();
                this.f44617b = true;
            } else {
                usersSelectActivity.E = L5;
                usersSelectActivity.f42107c.setTranslationX(L6);
                usersSelectActivity.f42107c.setTranslationY(usersSelectActivity.S);
            }
        } else if (this.f44616a != null && !usersSelectActivity.f42113w && this.f44619e == null) {
            bh.g gVar = usersSelectActivity.f42107c;
            gVar.bringPointIntoView(gVar.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.E);
    }
}
