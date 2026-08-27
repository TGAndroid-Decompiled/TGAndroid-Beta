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

public final class pg1 extends ViewGroup {

    public AnimatorSet f41349a;

    public boolean f41350b;

    public final ArrayList f41351c;
    public org.telegram.ui.Components.a30 d;

    public org.telegram.ui.Components.a30 f41352e;

    public final UsersSelectActivity f41353f;

    public pg1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f41353f = usersSelectActivity;
        this.f41351c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.a30 a30Var, boolean z10) {
        UsersSelectActivity usersSelectActivity = this.f41353f;
        usersSelectActivity.K.add(a30Var);
        long uid = a30Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f36296w++;
        }
        usersSelectActivity.J.k(a30Var, uid);
        gg.g gVar = usersSelectActivity.f36290c;
        gVar.setHintVisible(false, TextUtils.isEmpty(gVar.getText()));
        AnimatorSet animatorSet = this.f41349a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f41349a.setupEndValues();
            this.f41349a.cancel();
        }
        this.f41350b = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f41349a = animatorSet2;
            animatorSet2.addListener(new zb1(this, 4));
            this.f41349a.setDuration(150L);
            this.d = a30Var;
            ArrayList arrayList = this.f41351c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.a30, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.a30, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.a30, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(a30Var);
    }

    public final void b(org.telegram.ui.Components.a30 a30Var) {
        UsersSelectActivity usersSelectActivity = this.f41353f;
        usersSelectActivity.v = true;
        long uid = a30Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f36296w--;
        }
        usersSelectActivity.J.l(uid);
        usersSelectActivity.K.remove(a30Var);
        a30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f41349a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.f41349a.cancel();
        }
        this.f41350b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f41349a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.fk0(16, this, a30Var));
        this.f41349a.setDuration(150L);
        this.f41352e = a30Var;
        ArrayList arrayList = this.f41351c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f41352e, (Property<org.telegram.ui.Components.a30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41352e, (Property<org.telegram.ui.Components.a30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41352e, (Property<org.telegram.ui.Components.a30, Float>) View.ALPHA, 1.0f, 0.0f));
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
        int iX;
        int i12;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int iDp = size - AndroidUtilities.dp(26.0f);
        int iDp2 = AndroidUtilities.dp(10.0f);
        int iDp3 = AndroidUtilities.dp(10.0f);
        int i13 = 0;
        int iC = 0;
        int iC2 = 0;
        while (true) {
            property = View.TRANSLATION_Y;
            property2 = View.TRANSLATION_X;
            arrayList = this.f41351c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Components.a30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f41352e && childAt.getMeasuredWidth() + iC > iDp) {
                    iDp2 = org.telegram.messenger.y1.C(8.0f, childAt.getMeasuredHeight(), iDp2);
                    iC = 0;
                }
                if (childAt.getMeasuredWidth() + iC2 > iDp) {
                    iDp3 = org.telegram.messenger.y1.C(8.0f, childAt.getMeasuredHeight(), iDp3);
                    iC2 = 0;
                }
                int iDp4 = AndroidUtilities.dp(13.0f) + iC;
                if (!this.f41350b) {
                    org.telegram.ui.Components.a30 a30Var = this.f41352e;
                    if (childAt == a30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + iC2);
                        childAt.setTranslationY(iDp3);
                    } else if (a30Var != null) {
                        float f10 = iDp4;
                        if (childAt.getTranslationX() != f10) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, f10));
                        } else {
                            i12 = 1;
                        }
                        float f11 = iDp2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i12];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr));
                        }
                    } else {
                        childAt.setTranslationX(iDp4);
                        childAt.setTranslationY(iDp2);
                    }
                }
                if (childAt != this.f41352e) {
                    iC = org.telegram.messenger.y1.C(9.0f, childAt.getMeasuredWidth(), iC);
                }
                iC2 = org.telegram.messenger.y1.C(9.0f, childAt.getMeasuredWidth(), iC2);
            }
            i13++;
        }
        if (AndroidUtilities.isTablet()) {
            iX = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            iX = org.telegram.messenger.rl.x(158.0f, Math.min(point.x, point.y), 3);
        }
        if (iDp - iC < iX) {
            iDp2 += AndroidUtilities.dp(40.0f);
            iC = 0;
        }
        if (iDp - iC2 < iX) {
            iDp3 += AndroidUtilities.dp(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f41353f;
        usersSelectActivity.f36290c.measure(View.MeasureSpec.makeMeasureSpec(iDp - iC, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
        if (!this.f41350b) {
            int iDp5 = AndroidUtilities.dp(42.0f) + iDp3;
            int iDp6 = AndroidUtilities.dp(16.0f) + iC;
            usersSelectActivity.M = iDp2;
            if (this.f41349a != null) {
                int iDp7 = AndroidUtilities.dp(42.0f) + iDp2;
                if (usersSelectActivity.f36298y != iDp7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", iDp7));
                }
                float f12 = iDp6;
                if (usersSelectActivity.f36290c.getTranslationX() != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f36290c, (Property<gg.g, Float>) property2, f12));
                }
                float translationY = usersSelectActivity.f36290c.getTranslationY();
                float f13 = usersSelectActivity.M;
                if (translationY != f13) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f36290c, (Property<gg.g, Float>) property, f13));
                }
                usersSelectActivity.f36290c.setAllowDrawCursor(false);
                this.f41349a.playTogether(arrayList);
                this.f41349a.start();
                this.f41350b = true;
            } else {
                usersSelectActivity.f36298y = iDp5;
                usersSelectActivity.f36290c.setTranslationX(iDp6);
                usersSelectActivity.f36290c.setTranslationY(usersSelectActivity.M);
            }
        } else if (this.f41349a != null && !usersSelectActivity.v && this.f41352e == null) {
            gg.g gVar = usersSelectActivity.f36290c;
            gVar.bringPointIntoView(gVar.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.f36298y);
    }
}
