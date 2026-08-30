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
public final class eh1 extends ViewGroup {
    public AnimatorSet f34021a;
    public boolean f34022b;
    public final ArrayList f34023c;
    public org.telegram.ui.Components.n30 d;
    public org.telegram.ui.Components.n30 e;
    public final UsersSelectActivity f34024f;

    public eh1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f34024f = usersSelectActivity;
        this.f34023c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.n30 n30Var, boolean z4) {
        UsersSelectActivity usersSelectActivity = this.f34024f;
        usersSelectActivity.L.add(n30Var);
        long uid = n30Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f32394w++;
        }
        usersSelectActivity.K.k(n30Var, uid);
        kg.f fVar = usersSelectActivity.f32389c;
        fVar.setHintVisible(false, TextUtils.isEmpty(fVar.getText()));
        AnimatorSet animatorSet = this.f34021a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f34021a.setupEndValues();
            this.f34021a.cancel();
        }
        this.f34022b = false;
        if (z4) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f34021a = animatorSet2;
            animatorSet2.addListener(new ls0(this, 25));
            this.f34021a.setDuration(150L);
            this.d = n30Var;
            ArrayList arrayList = this.f34023c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f, 1.0f));
        }
        addView(n30Var);
    }

    public final void b(org.telegram.ui.Components.n30 n30Var) {
        UsersSelectActivity usersSelectActivity = this.f34024f;
        usersSelectActivity.v = true;
        long uid = n30Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f32394w--;
        }
        usersSelectActivity.K.l(uid);
        usersSelectActivity.L.remove(n30Var);
        n30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f34021a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.f34021a.cancel();
        }
        this.f34022b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f34021a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.ex0(13, this, n30Var));
        this.f34021a.setDuration(150L);
        this.e = n30Var;
        ArrayList arrayList = this.f34023c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
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
        int x10;
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
            arrayList = this.f34023c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Components.n30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.e && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.y3.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.y3.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.f34022b) {
                    org.telegram.ui.Components.n30 n30Var = this.e;
                    if (childAt == n30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (n30Var != null) {
                        float f10 = dp4;
                        if (childAt.getTranslationX() != f10) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, property2, f10));
                        } else {
                            i12 = 1;
                        }
                        float f11 = dp2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i12];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, property, fArr));
                        }
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                    }
                }
                if (childAt != this.e) {
                    i14 = org.telegram.messenger.y3.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.y3.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
        }
        if (AndroidUtilities.isTablet()) {
            x10 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            x10 = b.x(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i14 < x10) {
            dp2 += AndroidUtilities.dp(40.0f);
            i14 = 0;
        }
        if (dp - i15 < x10) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f34024f;
        usersSelectActivity.f32389c.measure(View.MeasureSpec.makeMeasureSpec(dp - i14, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
        if (!this.f34022b) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            int dp6 = AndroidUtilities.dp(16.0f) + i14;
            usersSelectActivity.N = dp2;
            if (this.f34021a != null) {
                int dp7 = AndroidUtilities.dp(42.0f) + dp2;
                if (usersSelectActivity.f32396y != dp7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", dp7));
                }
                float f12 = dp6;
                if (usersSelectActivity.f32389c.getTranslationX() != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f32389c, property2, f12));
                }
                float translationY = usersSelectActivity.f32389c.getTranslationY();
                float f13 = usersSelectActivity.N;
                if (translationY != f13) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f32389c, property, f13));
                }
                usersSelectActivity.f32389c.setAllowDrawCursor(false);
                this.f34021a.playTogether(arrayList);
                this.f34021a.start();
                this.f34022b = true;
            } else {
                usersSelectActivity.f32396y = dp5;
                usersSelectActivity.f32389c.setTranslationX(dp6);
                usersSelectActivity.f32389c.setTranslationY(usersSelectActivity.N);
            }
        } else if (this.f34021a != null && !usersSelectActivity.v && this.e == null) {
            kg.f fVar = usersSelectActivity.f32389c;
            fVar.bringPointIntoView(fVar.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.f32396y);
    }
}
