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
    public AnimatorSet f41795a;
    public boolean f41796b;
    public final ArrayList f41797c;
    public org.telegram.ui.Components.w20 d;
    public org.telegram.ui.Components.w20 f41798e;
    public final UsersSelectActivity f41799f;

    public qg1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f41799f = usersSelectActivity;
        this.f41797c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.w20 w20Var, boolean z10) {
        UsersSelectActivity usersSelectActivity = this.f41799f;
        usersSelectActivity.K.add(w20Var);
        long uid = w20Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f36293w++;
        }
        usersSelectActivity.J.k(w20Var, uid);
        fg.g gVar = usersSelectActivity.f36287c;
        gVar.setHintVisible(false, TextUtils.isEmpty(gVar.getText()));
        AnimatorSet animatorSet = this.f41795a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f41795a.setupEndValues();
            this.f41795a.cancel();
        }
        this.f41796b = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f41795a = animatorSet2;
            animatorSet2.addListener(new te1(this, 2));
            this.f41795a.setDuration(150L);
            this.d = w20Var;
            ArrayList arrayList = this.f41797c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f, 1.0f));
        }
        addView(w20Var);
    }

    public final void b(org.telegram.ui.Components.w20 w20Var) {
        UsersSelectActivity usersSelectActivity = this.f41799f;
        usersSelectActivity.v = true;
        long uid = w20Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f36293w--;
        }
        usersSelectActivity.J.l(uid);
        usersSelectActivity.K.remove(w20Var);
        w20Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f41795a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.f41795a.cancel();
        }
        this.f41796b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f41795a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.su0(14, this, w20Var));
        this.f41795a.setDuration(150L);
        this.f41798e = w20Var;
        ArrayList arrayList = this.f41797c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f41798e, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41798e, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41798e, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        Property property;
        Property property2;
        ArrayList arrayList;
        int y10;
        int i11;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i9);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            property = View.TRANSLATION_Y;
            property2 = View.TRANSLATION_X;
            arrayList = this.f41797c;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Components.w20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f41798e && childAt.getMeasuredWidth() + i13 > dp) {
                    dp2 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i13 = 0;
                }
                if (childAt.getMeasuredWidth() + i14 > dp) {
                    dp3 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i14 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i13;
                if (!this.f41796b) {
                    org.telegram.ui.Components.w20 w20Var = this.f41798e;
                    if (childAt == w20Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i14);
                        childAt.setTranslationY(dp3);
                    } else if (w20Var != null) {
                        float f10 = dp4;
                        if (childAt.getTranslationX() != f10) {
                            i11 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, property2, f10));
                        } else {
                            i11 = 1;
                        }
                        float f11 = dp2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i11];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, property, fArr));
                        }
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                    }
                }
                if (childAt != this.f41798e) {
                    i13 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i13);
                }
                i14 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i14);
            }
            i12++;
        }
        if (AndroidUtilities.isTablet()) {
            y10 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            y10 = org.telegram.messenger.ll.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i13 < y10) {
            dp2 += AndroidUtilities.dp(40.0f);
            i13 = 0;
        }
        if (dp - i14 < y10) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f41799f;
        usersSelectActivity.f36287c.measure(View.MeasureSpec.makeMeasureSpec(dp - i13, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
        if (!this.f41796b) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            int dp6 = AndroidUtilities.dp(16.0f) + i13;
            usersSelectActivity.M = dp2;
            if (this.f41795a != null) {
                int dp7 = AndroidUtilities.dp(42.0f) + dp2;
                if (usersSelectActivity.f36295y != dp7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", dp7));
                }
                float f12 = dp6;
                if (usersSelectActivity.f36287c.getTranslationX() != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f36287c, property2, f12));
                }
                float translationY = usersSelectActivity.f36287c.getTranslationY();
                float f13 = usersSelectActivity.M;
                if (translationY != f13) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f36287c, property, f13));
                }
                usersSelectActivity.f36287c.setAllowDrawCursor(false);
                this.f41795a.playTogether(arrayList);
                this.f41795a.start();
                this.f41796b = true;
            } else {
                usersSelectActivity.f36295y = dp5;
                usersSelectActivity.f36287c.setTranslationX(dp6);
                usersSelectActivity.f36287c.setTranslationY(usersSelectActivity.M);
            }
        } else if (this.f41795a != null && !usersSelectActivity.v && this.f41798e == null) {
            fg.g gVar = usersSelectActivity.f36287c;
            gVar.bringPointIntoView(gVar.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.f36295y);
    }
}
