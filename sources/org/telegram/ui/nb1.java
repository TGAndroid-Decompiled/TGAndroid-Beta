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
public final class nb1 extends ViewGroup {
    public AnimatorSet f50137a;
    public boolean f50138b;
    public final ArrayList f50139c;
    public org.telegram.ui.Components.m20 d;
    public org.telegram.ui.Components.m20 f50140e;
    public final UsersSelectActivity f50141f;

    public nb1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f50141f = usersSelectActivity;
        this.f50139c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.m20 m20Var, boolean z10) {
        UsersSelectActivity usersSelectActivity = this.f50141f;
        usersSelectActivity.Q.add(m20Var);
        long uid = m20Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f43903x++;
        }
        usersSelectActivity.P.k(m20Var, uid);
        ah.i iVar = usersSelectActivity.f43896c;
        iVar.t(false, TextUtils.isEmpty(iVar.getText()));
        AnimatorSet animatorSet = this.f50137a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f50137a.setupEndValues();
            this.f50137a.cancel();
        }
        this.f50138b = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f50137a = animatorSet2;
            animatorSet2.addListener(new k71(this, 4));
            this.f50137a.setDuration(150L);
            this.d = m20Var;
            ArrayList arrayList = this.f50139c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f, 1.0f));
        }
        addView(m20Var);
    }

    public final void b(org.telegram.ui.Components.m20 m20Var) {
        UsersSelectActivity usersSelectActivity = this.f50141f;
        usersSelectActivity.f43902w = true;
        long uid = m20Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f43903x--;
        }
        usersSelectActivity.P.l(uid);
        usersSelectActivity.Q.remove(m20Var);
        m20Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f50137a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.f50137a.cancel();
        }
        this.f50138b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f50137a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.h60(16, this, m20Var));
        this.f50137a.setDuration(150L);
        this.f50140e = m20Var;
        ArrayList arrayList = this.f50139c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f50140e, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f50140e, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f50140e, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
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
        Property property;
        Property property2;
        ArrayList arrayList;
        int z10;
        int i11;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(26.0f);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            property = View.TRANSLATION_Y;
            property2 = View.TRANSLATION_X;
            arrayList = this.f50139c;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Components.m20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                if (childAt != this.f50140e && childAt.getMeasuredWidth() + i13 > L) {
                    L2 = org.telegram.messenger.f3.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i13 = 0;
                }
                if (childAt.getMeasuredWidth() + i14 > L) {
                    L3 = org.telegram.messenger.f3.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i14 = 0;
                }
                int L4 = org.telegram.messenger.g0.L(13.0f) + i13;
                if (!this.f50138b) {
                    org.telegram.ui.Components.m20 m20Var = this.f50140e;
                    if (childAt == m20Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i14);
                        childAt.setTranslationY(L3);
                    } else if (m20Var != null) {
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
                if (childAt != this.f50140e) {
                    i13 = org.telegram.messenger.f3.C(9.0f, childAt.getMeasuredWidth(), i13);
                }
                i14 = org.telegram.messenger.f3.C(9.0f, childAt.getMeasuredWidth(), i14);
            }
            i12++;
        }
        if (org.telegram.messenger.g0.Q1()) {
            z10 = org.telegram.messenger.g0.L(372.0f) / 3;
        } else {
            Point point = org.telegram.messenger.g0.f24118q;
            z10 = org.telegram.messenger.n10.z(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i13 < z10) {
            L2 += org.telegram.messenger.g0.L(40.0f);
            i13 = 0;
        }
        if (L - i14 < z10) {
            L3 += org.telegram.messenger.g0.L(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f50141f;
        usersSelectActivity.f43896c.measure(View.MeasureSpec.makeMeasureSpec(L - i13, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
        if (!this.f50138b) {
            int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
            int L6 = org.telegram.messenger.g0.L(16.0f) + i13;
            usersSelectActivity.S = L2;
            if (this.f50137a != null) {
                int L7 = org.telegram.messenger.g0.L(42.0f) + L2;
                if (usersSelectActivity.E != L7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", L7));
                }
                float f12 = L6;
                if (usersSelectActivity.f43896c.getTranslationX() != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f43896c, property2, f12));
                }
                float translationY = usersSelectActivity.f43896c.getTranslationY();
                float f13 = usersSelectActivity.S;
                if (translationY != f13) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f43896c, property, f13));
                }
                usersSelectActivity.f43896c.setAllowDrawCursor(false);
                this.f50137a.playTogether(arrayList);
                this.f50137a.start();
                this.f50138b = true;
            } else {
                usersSelectActivity.E = L5;
                usersSelectActivity.f43896c.setTranslationX(L6);
                usersSelectActivity.f43896c.setTranslationY(usersSelectActivity.S);
            }
        } else if (this.f50137a != null && !usersSelectActivity.f43902w && this.f50140e == null) {
            ah.i iVar = usersSelectActivity.f43896c;
            iVar.bringPointIntoView(iVar.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.E);
    }
}
