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
public final class v20 extends ViewGroup {
    public AnimatorSet f31667a;
    public boolean f31668b;
    public final ArrayList f31669c;
    public d40 d;
    public final ArrayList f31670e;
    public int f31671f;
    public int h;
    public int f31672n;
    public final w20 f31673r;

    public v20(w20 w20Var, Context context) {
        super(context);
        this.f31673r = w20Var;
        this.f31669c = new ArrayList();
        this.f31670e = new ArrayList();
        this.f31671f = -1;
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
        ArrayList arrayList;
        int A;
        int i12;
        int i13;
        int i14;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i15 = 0;
        if (!this.f31668b) {
            this.f31672n = 0;
        }
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            arrayList = this.f31669c;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (!(childAt instanceof d40)) {
                i14 = i15;
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                ArrayList arrayList2 = this.f31670e;
                boolean contains = arrayList2.contains(childAt);
                if (!contains) {
                    i14 = i15;
                    if (childAt.getMeasuredWidth() + i17 > dp) {
                        dp2 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp2);
                        i17 = i14;
                    }
                } else {
                    i14 = i15;
                }
                if (childAt.getMeasuredWidth() + i18 > dp) {
                    dp3 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i18 = i14;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i17;
                if (!this.f31668b) {
                    if (contains) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i18);
                        childAt.setTranslationY(dp3);
                    } else if (!arrayList2.isEmpty()) {
                        float f7 = dp4;
                        if (childAt.getTranslationX() != f7) {
                            float[] fArr = new float[1];
                            fArr[i14] = f7;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, fArr));
                        }
                        float f10 = dp2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr2 = new float[1];
                            fArr2[i14] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr2));
                        }
                        this.f31672n = Math.max(this.f31672n, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        this.f31672n = Math.max(this.f31672n, dp2);
                    }
                }
                if (!contains) {
                    i17 = org.telegram.messenger.q.C(9.0f, childAt.getMeasuredWidth(), i17);
                }
                i18 = org.telegram.messenger.q.C(9.0f, childAt.getMeasuredWidth(), i18);
            }
            i16++;
            i15 = i14;
        }
        int i19 = i15;
        if (AndroidUtilities.isTablet()) {
            A = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            A = org.telegram.messenger.bi.A(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i17 < A) {
            dp2 += AndroidUtilities.dp(40.0f);
        }
        if (dp - i18 < A) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        boolean z10 = this.f31668b;
        w20 w20Var = this.f31673r;
        if (!z10) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            w20Var.f32528n = dp2;
            if (this.f31667a != null) {
                this.h = AndroidUtilities.dp(42.0f) + dp2;
                this.f31667a.playTogether(arrayList);
                i12 = i19;
                this.f31667a.addListener(new u20(this, i12));
                this.f31671f = NotificationCenter.getInstance(w20Var.f32523a).setAnimationInProgress(this.f31671f, null);
                this.f31667a.start();
                this.f31668b = true;
            } else {
                i12 = i19;
                this.h = dp5;
            }
        } else {
            i12 = i19;
        }
        int i20 = this.f31672n;
        if (i20 > 0) {
            i13 = AndroidUtilities.dp(40.0f) + i20;
        } else {
            i13 = i12;
        }
        w20Var.f32526e = i13;
        setMeasuredDimension(size, this.h);
        t20 t20Var = w20Var.f32527f;
        if (t20Var != null) {
            t20Var.a(w20Var.f32526e);
        }
    }
}
