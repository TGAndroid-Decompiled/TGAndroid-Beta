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
public final class a20 extends ViewGroup {
    public AnimatorSet f26623a;
    public boolean f26624b;
    public final ArrayList f26625c;
    public j30 d;
    public final ArrayList f26626e;
    public int f26627f;
    public int h;
    public int f26628n;
    public final b20 f26629r;

    public a20(b20 b20Var, Context context) {
        super(context);
        this.f26629r = b20Var;
        this.f26625c = new ArrayList();
        this.f26626e = new ArrayList();
        this.f26627f = -1;
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
        int x4;
        int i12;
        char c3;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        if (!this.f26624b) {
            this.f26628n = 0;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.f26625c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof j30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                ArrayList arrayList2 = this.f26626e;
                boolean contains = arrayList2.contains(childAt);
                if (!contains) {
                    c3 = 0;
                    if (childAt.getMeasuredWidth() + i14 > dp) {
                        dp2 = org.telegram.messenger.x3.C(8.0f, childAt.getMeasuredHeight(), dp2);
                        i14 = 0;
                    }
                } else {
                    c3 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.x3.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.f26624b) {
                    if (contains) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (!arrayList2.isEmpty()) {
                        float f9 = dp4;
                        if (childAt.getTranslationX() != f9) {
                            float[] fArr = new float[1];
                            fArr[c3] = f9;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, fArr));
                        }
                        float f10 = dp2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr2 = new float[1];
                            fArr2[c3] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr2));
                        }
                        this.f26628n = Math.max(this.f26628n, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        this.f26628n = Math.max(this.f26628n, dp2);
                    }
                }
                if (!contains) {
                    i14 = org.telegram.messenger.x3.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.x3.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
        }
        if (AndroidUtilities.isTablet()) {
            x4 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            x4 = org.telegram.ui.b.x(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i14 < x4) {
            dp2 += AndroidUtilities.dp(40.0f);
        }
        if (dp - i15 < x4) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        boolean z10 = this.f26624b;
        b20 b20Var = this.f26629r;
        if (!z10) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            b20Var.f26952n = dp2;
            if (this.f26623a != null) {
                this.h = AndroidUtilities.dp(42.0f) + dp2;
                this.f26623a.playTogether(arrayList);
                this.f26623a.addListener(new z10(this, 0));
                this.f26627f = NotificationCenter.getInstance(b20Var.f26947a).setAnimationInProgress(this.f26627f, null);
                this.f26623a.start();
                this.f26624b = true;
            } else {
                this.h = dp5;
            }
        }
        int i16 = this.f26628n;
        if (i16 > 0) {
            i12 = AndroidUtilities.dp(40.0f) + i16;
        } else {
            i12 = 0;
        }
        b20Var.f26950e = i12;
        setMeasuredDimension(size, this.h);
        y10 y10Var = b20Var.f26951f;
        if (y10Var != null) {
            y10Var.a(b20Var.f26950e);
        }
    }
}
