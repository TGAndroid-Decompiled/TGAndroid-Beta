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
import org.telegram.messenger.AndroidUtilities;
public final class qg1 extends ViewGroup {
    public AnimatorSet f40822a;
    public boolean f40823b;
    public final ArrayList f40824c;
    public org.telegram.ui.Components.t30 d;
    public org.telegram.ui.Components.t30 e;
    public final UsersSelectActivity f40825f;

    public qg1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f40825f = usersSelectActivity;
        this.f40824c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.t30 t30Var, boolean z10) {
        UsersSelectActivity usersSelectActivity = this.f40825f;
        usersSelectActivity.O.add(t30Var);
        long uid = t30Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f34266w++;
        }
        usersSelectActivity.N.k(t30Var, uid);
        ei.e2 e2Var = usersSelectActivity.f34261c;
        e2Var.setHintVisible(false, TextUtils.isEmpty(e2Var.getText()));
        AnimatorSet animatorSet = this.f40822a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f40822a.setupEndValues();
            this.f40822a.cancel();
        }
        this.f40823b = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f40822a = animatorSet2;
            animatorSet2.addListener(new ue1(this, 2));
            this.f40822a.setDuration(150L);
            this.d = t30Var;
            ArrayList arrayList = this.f40824c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f, 1.0f));
        }
        addView(t30Var);
    }

    public final void b(org.telegram.ui.Components.t30 t30Var) {
        UsersSelectActivity usersSelectActivity = this.f40825f;
        usersSelectActivity.v = true;
        long uid = t30Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f34266w--;
        }
        usersSelectActivity.N.l(uid);
        usersSelectActivity.O.remove(t30Var);
        t30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f40822a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.f40822a.cancel();
        }
        this.f40823b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f40822a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.pl0(16, this, t30Var));
        this.f40822a.setDuration(150L);
        this.e = t30Var;
        ArrayList arrayList = this.f40824c;
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
        int A;
        int i12;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            property = View.TRANSLATION_Y;
            property2 = View.TRANSLATION_X;
            arrayList = this.f40824c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Components.t30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.e && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.v0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.v0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.f40823b) {
                    org.telegram.ui.Components.t30 t30Var = this.e;
                    if (childAt == t30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (t30Var != null) {
                        float f7 = dp4;
                        if (childAt.getTranslationX() != f7) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, property2, f7));
                        } else {
                            i12 = 1;
                        }
                        float f10 = dp2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr = new float[i12];
                            fArr[0] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, property, fArr));
                        }
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                    }
                }
                if (childAt != this.e) {
                    i14 = org.telegram.messenger.v0.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.v0.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
        }
        if (AndroidUtilities.isTablet()) {
            A = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            A = org.telegram.messenger.tl.A(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i14 < A) {
            dp2 += AndroidUtilities.dp(40.0f);
            i14 = 0;
        }
        if (dp - i15 < A) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f40825f;
        usersSelectActivity.f34261c.measure(View.MeasureSpec.makeMeasureSpec(dp - i14, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
        if (!this.f40823b) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            int dp6 = AndroidUtilities.dp(16.0f) + i14;
            usersSelectActivity.Q = dp2;
            if (this.f40822a != null) {
                int dp7 = AndroidUtilities.dp(42.0f) + dp2;
                if (usersSelectActivity.f34268y != dp7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", dp7));
                }
                float f11 = dp6;
                if (usersSelectActivity.f34261c.getTranslationX() != f11) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f34261c, property2, f11));
                }
                float translationY = usersSelectActivity.f34261c.getTranslationY();
                float f12 = usersSelectActivity.Q;
                if (translationY != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f34261c, property, f12));
                }
                usersSelectActivity.f34261c.setAllowDrawCursor(false);
                this.f40822a.playTogether(arrayList);
                this.f40822a.start();
                this.f40823b = true;
            } else {
                usersSelectActivity.f34268y = dp5;
                usersSelectActivity.f34261c.setTranslationX(dp6);
                usersSelectActivity.f34261c.setTranslationY(usersSelectActivity.Q);
            }
        } else if (this.f40822a != null && !usersSelectActivity.v && this.e == null) {
            ei.e2 e2Var = usersSelectActivity.f34261c;
            e2Var.bringPointIntoView(e2Var.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.f34268y);
    }
}
