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
public final class qh1 extends ViewGroup {
    public AnimatorSet f39731a;
    public boolean f39732b;
    public final ArrayList f39733c;
    public org.telegram.ui.Components.q30 d;
    public org.telegram.ui.Components.q30 f39734e;
    public final UsersSelectActivity f39735f;

    public qh1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f39735f = usersSelectActivity;
        this.f39733c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.q30 q30Var, boolean z10) {
        UsersSelectActivity usersSelectActivity = this.f39735f;
        usersSelectActivity.O.add(q30Var);
        long uid = q30Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f34590w++;
        }
        usersSelectActivity.N.k(q30Var, uid);
        ci.h2 h2Var = usersSelectActivity.f34584c;
        h2Var.setHintVisible(false, TextUtils.isEmpty(h2Var.getText()));
        AnimatorSet animatorSet = this.f39731a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f39731a.setupEndValues();
            this.f39731a.cancel();
        }
        this.f39732b = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f39731a = animatorSet2;
            animatorSet2.addListener(new ap0(this, 27));
            this.f39731a.setDuration(150L);
            this.d = q30Var;
            ArrayList arrayList = this.f39733c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f, 1.0f));
        }
        addView(q30Var);
    }

    public final void b(org.telegram.ui.Components.q30 q30Var) {
        UsersSelectActivity usersSelectActivity = this.f39735f;
        usersSelectActivity.v = true;
        long uid = q30Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f34590w--;
        }
        usersSelectActivity.N.l(uid);
        usersSelectActivity.O.remove(q30Var);
        q30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f39731a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.f39731a.cancel();
        }
        this.f39732b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f39731a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.cl0(16, this, q30Var));
        this.f39731a.setDuration(150L);
        this.f39734e = q30Var;
        ArrayList arrayList = this.f39733c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f39734e, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f39734e, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f39734e, View.ALPHA, 1.0f, 0.0f));
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
        int z10;
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
            arrayList = this.f39733c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Components.q30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f39734e && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.f0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.f0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.f39732b) {
                    org.telegram.ui.Components.q30 q30Var = this.f39734e;
                    if (childAt == q30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (q30Var != null) {
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
                if (childAt != this.f39734e) {
                    i14 = org.telegram.messenger.f0.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.f0.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
        }
        if (AndroidUtilities.isTablet()) {
            z10 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            z10 = org.telegram.messenger.ok.z(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i14 < z10) {
            dp2 += AndroidUtilities.dp(40.0f);
            i14 = 0;
        }
        if (dp - i15 < z10) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f39735f;
        usersSelectActivity.f34584c.measure(View.MeasureSpec.makeMeasureSpec(dp - i14, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
        if (!this.f39732b) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            int dp6 = AndroidUtilities.dp(16.0f) + i14;
            usersSelectActivity.Q = dp2;
            if (this.f39731a != null) {
                int dp7 = AndroidUtilities.dp(42.0f) + dp2;
                if (usersSelectActivity.f34592y != dp7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", dp7));
                }
                float f11 = dp6;
                if (usersSelectActivity.f34584c.getTranslationX() != f11) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f34584c, property2, f11));
                }
                float translationY = usersSelectActivity.f34584c.getTranslationY();
                float f12 = usersSelectActivity.Q;
                if (translationY != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f34584c, property, f12));
                }
                usersSelectActivity.f34584c.setAllowDrawCursor(false);
                this.f39731a.playTogether(arrayList);
                this.f39731a.start();
                this.f39732b = true;
            } else {
                usersSelectActivity.f34592y = dp5;
                usersSelectActivity.f34584c.setTranslationX(dp6);
                usersSelectActivity.f34584c.setTranslationY(usersSelectActivity.Q);
            }
        } else if (this.f39731a != null && !usersSelectActivity.v && this.f39734e == null) {
            ci.h2 h2Var = usersSelectActivity.f34584c;
            h2Var.bringPointIntoView(h2Var.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.f34592y);
    }
}
