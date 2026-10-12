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
public final class bi1 extends ViewGroup {
    public AnimatorSet f36179a;
    public boolean f36180b;
    public final ArrayList f36181c;
    public org.telegram.ui.Components.g40 d;
    public org.telegram.ui.Components.g40 f36182e;
    public final UsersSelectActivity f36183f;

    public bi1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f36183f = usersSelectActivity;
        this.f36181c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.g40 g40Var, boolean z10) {
        UsersSelectActivity usersSelectActivity = this.f36183f;
        usersSelectActivity.O.add(g40Var);
        long uid = g40Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f34437w++;
        }
        usersSelectActivity.N.k(g40Var, uid);
        ci.g2 g2Var = usersSelectActivity.f34431c;
        g2Var.setHintVisible(false, TextUtils.isEmpty(g2Var.getText()));
        AnimatorSet animatorSet = this.f36179a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f36179a.setupEndValues();
            this.f36179a.cancel();
        }
        this.f36180b = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f36179a = animatorSet2;
            animatorSet2.addListener(new gp0(this, 27));
            this.f36179a.setDuration(150L);
            this.d = g40Var;
            ArrayList arrayList = this.f36181c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f, 1.0f));
        }
        addView(g40Var);
    }

    public final void b(org.telegram.ui.Components.g40 g40Var) {
        UsersSelectActivity usersSelectActivity = this.f36183f;
        usersSelectActivity.v = true;
        long uid = g40Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f34437w--;
        }
        usersSelectActivity.N.l(uid);
        usersSelectActivity.O.remove(g40Var);
        g40Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f36179a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.f36179a.cancel();
        }
        this.f36180b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f36179a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.am0(16, this, g40Var));
        this.f36179a.setDuration(150L);
        this.f36182e = g40Var;
        ArrayList arrayList = this.f36181c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f36182e, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f36182e, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f36182e, View.ALPHA, 1.0f, 0.0f));
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
            arrayList = this.f36181c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Components.g40) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f36182e && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.v0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.v0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.f36180b) {
                    org.telegram.ui.Components.g40 g40Var = this.f36182e;
                    if (childAt == g40Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (g40Var != null) {
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
                if (childAt != this.f36182e) {
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
            A = org.telegram.messenger.am.A(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i14 < A) {
            dp2 += AndroidUtilities.dp(40.0f);
            i14 = 0;
        }
        if (dp - i15 < A) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f36183f;
        usersSelectActivity.f34431c.measure(View.MeasureSpec.makeMeasureSpec(dp - i14, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
        if (!this.f36180b) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            int dp6 = AndroidUtilities.dp(16.0f) + i14;
            usersSelectActivity.Q = dp2;
            if (this.f36179a != null) {
                int dp7 = AndroidUtilities.dp(42.0f) + dp2;
                if (usersSelectActivity.f34439y != dp7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", dp7));
                }
                float f11 = dp6;
                if (usersSelectActivity.f34431c.getTranslationX() != f11) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f34431c, property2, f11));
                }
                float translationY = usersSelectActivity.f34431c.getTranslationY();
                float f12 = usersSelectActivity.Q;
                if (translationY != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f34431c, property, f12));
                }
                usersSelectActivity.f34431c.setAllowDrawCursor(false);
                this.f36179a.playTogether(arrayList);
                this.f36179a.start();
                this.f36180b = true;
            } else {
                usersSelectActivity.f34439y = dp5;
                usersSelectActivity.f34431c.setTranslationX(dp6);
                usersSelectActivity.f34431c.setTranslationY(usersSelectActivity.Q);
            }
        } else if (this.f36179a != null && !usersSelectActivity.v && this.f36182e == null) {
            ci.g2 g2Var = usersSelectActivity.f34431c;
            g2Var.bringPointIntoView(g2Var.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.f34439y);
    }
}
