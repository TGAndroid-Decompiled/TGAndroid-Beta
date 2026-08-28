package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class p10 extends ViewGroup {
    public AnimatorSet f31502a;
    public boolean f31503b;
    public final ArrayList f31504c;
    public w20 d;
    public final ArrayList f31505e;
    public int f31506f;
    public int h;
    public int f31507n;
    public final q10 f31508r;

    public p10(q10 q10Var, Context context) {
        super(context);
        this.f31508r = q10Var;
        this.f31504c = new ArrayList();
        this.f31505e = new ArrayList();
        this.f31506f = -1;
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
        ArrayList arrayList;
        int y10;
        int i11;
        char c10;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i9);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        if (!this.f31503b) {
            this.f31507n = 0;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            arrayList = this.f31504c;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt instanceof w20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                ArrayList arrayList2 = this.f31505e;
                boolean contains = arrayList2.contains(childAt);
                if (!contains) {
                    c10 = 0;
                    if (childAt.getMeasuredWidth() + i13 > dp) {
                        dp2 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                        i13 = 0;
                    }
                } else {
                    c10 = 0;
                }
                if (childAt.getMeasuredWidth() + i14 > dp) {
                    dp3 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i14 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i13;
                if (!this.f31503b) {
                    if (contains) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i14);
                        childAt.setTranslationY(dp3);
                    } else if (!arrayList2.isEmpty()) {
                        float f10 = dp4;
                        if (childAt.getTranslationX() != f10) {
                            float[] fArr = new float[1];
                            fArr[c10] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, fArr));
                        }
                        float f11 = dp2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr2 = new float[1];
                            fArr2[c10] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr2));
                        }
                        this.f31507n = Math.max(this.f31507n, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        this.f31507n = Math.max(this.f31507n, dp2);
                    }
                }
                if (!contains) {
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
        }
        if (dp - i14 < y10) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        boolean z10 = this.f31503b;
        q10 q10Var = this.f31508r;
        if (!z10) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            q10Var.f31809n = dp2;
            if (this.f31502a != null) {
                this.h = AndroidUtilities.dp(42.0f) + dp2;
                this.f31502a.playTogether(arrayList);
                this.f31502a.addListener(new o10(this, 0));
                this.f31506f = NotificationCenter.getInstance(q10Var.f31804a).setAnimationInProgress(this.f31506f, null);
                this.f31502a.start();
                this.f31503b = true;
            } else {
                this.h = dp5;
            }
        }
        int i15 = this.f31507n;
        if (i15 > 0) {
            i11 = AndroidUtilities.dp(40.0f) + i15;
        } else {
            i11 = 0;
        }
        q10Var.f31807e = i11;
        setMeasuredDimension(size, this.h);
        n10 n10Var = q10Var.f31808f;
        if (n10Var != null) {
            n10Var.a(q10Var.f31807e);
        }
    }
}
