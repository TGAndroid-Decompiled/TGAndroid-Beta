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
    public AnimatorSet f48152a;
    public boolean f48153b;
    public final ArrayList f48154c;
    public org.telegram.ui.Components.d20 d;
    public org.telegram.ui.Components.d20 f48155e;
    public final UsersSelectActivity f48156f;

    public nb1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f48156f = usersSelectActivity;
        this.f48154c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.d20 d20Var, boolean z9) {
        UsersSelectActivity usersSelectActivity = this.f48156f;
        usersSelectActivity.P.add(d20Var);
        long uid = d20Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f42090x++;
        }
        usersSelectActivity.O.k(d20Var, uid);
        ah.i iVar = usersSelectActivity.f42083c;
        iVar.t(false, TextUtils.isEmpty(iVar.getText()));
        AnimatorSet animatorSet = this.f48152a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f48152a.setupEndValues();
            this.f48152a.cancel();
        }
        this.f48153b = false;
        if (z9) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f48152a = animatorSet2;
            animatorSet2.addListener(new t81(this, 3));
            this.f48152a.setDuration(150L);
            this.d = d20Var;
            ArrayList arrayList = this.f48154c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f, 1.0f));
        }
        addView(d20Var);
    }

    public final void b(org.telegram.ui.Components.d20 d20Var) {
        UsersSelectActivity usersSelectActivity = this.f48156f;
        usersSelectActivity.f42089w = true;
        long uid = d20Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f42090x--;
        }
        usersSelectActivity.O.l(uid);
        usersSelectActivity.P.remove(d20Var);
        d20Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f48152a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.f48152a.cancel();
        }
        this.f48153b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f48152a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.w50(16, this, d20Var));
        this.f48152a.setDuration(150L);
        this.f48155e = d20Var;
        ArrayList arrayList = this.f48154c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f48155e, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f48155e, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f48155e, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
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
        Property property;
        Property property2;
        ArrayList arrayList;
        int y10;
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
            arrayList = this.f48154c;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Components.d20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                if (childAt != this.f48155e && childAt.getMeasuredWidth() + i13 > L) {
                    L2 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i13 = 0;
                }
                if (childAt.getMeasuredWidth() + i14 > L) {
                    L3 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i14 = 0;
                }
                int L4 = org.telegram.messenger.g0.L(13.0f) + i13;
                if (!this.f48153b) {
                    org.telegram.ui.Components.d20 d20Var = this.f48155e;
                    if (childAt == d20Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i14);
                        childAt.setTranslationY(L3);
                    } else if (d20Var != null) {
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
                if (childAt != this.f48155e) {
                    i13 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i13);
                }
                i14 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i14);
            }
            i12++;
        }
        if (org.telegram.messenger.g0.Q1()) {
            y10 = org.telegram.messenger.g0.L(372.0f) / 3;
        } else {
            Point point = org.telegram.messenger.g0.f22563q;
            y10 = org.telegram.messenger.camera.q.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i13 < y10) {
            L2 += org.telegram.messenger.g0.L(40.0f);
            i13 = 0;
        }
        if (L - i14 < y10) {
            L3 += org.telegram.messenger.g0.L(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f48156f;
        usersSelectActivity.f42083c.measure(View.MeasureSpec.makeMeasureSpec(L - i13, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
        if (!this.f48153b) {
            int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
            int L6 = org.telegram.messenger.g0.L(16.0f) + i13;
            usersSelectActivity.R = L2;
            if (this.f48152a != null) {
                int L7 = org.telegram.messenger.g0.L(42.0f) + L2;
                if (usersSelectActivity.D != L7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", L7));
                }
                float f12 = L6;
                if (usersSelectActivity.f42083c.getTranslationX() != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f42083c, property2, f12));
                }
                float translationY = usersSelectActivity.f42083c.getTranslationY();
                float f13 = usersSelectActivity.R;
                if (translationY != f13) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f42083c, property, f13));
                }
                usersSelectActivity.f42083c.setAllowDrawCursor(false);
                this.f48152a.playTogether(arrayList);
                this.f48152a.start();
                this.f48153b = true;
            } else {
                usersSelectActivity.D = L5;
                usersSelectActivity.f42083c.setTranslationX(L6);
                usersSelectActivity.f42083c.setTranslationY(usersSelectActivity.R);
            }
        } else if (this.f48152a != null && !usersSelectActivity.f42089w && this.f48155e == null) {
            ah.i iVar = usersSelectActivity.f42083c;
            iVar.bringPointIntoView(iVar.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.D);
    }
}
