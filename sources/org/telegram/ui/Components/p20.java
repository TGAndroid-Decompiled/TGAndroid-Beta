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
public final class p20 extends ViewGroup {
    public AnimatorSet f31422a;
    public boolean f31423b;
    public final ArrayList f31424c;
    public x30 d;
    public final ArrayList e;
    public int f31425f;
    public int h;
    public int f31426n;
    public final q20 f31427r;

    public p20(q20 q20Var, Context context) {
        super(context);
        this.f31427r = q20Var;
        this.f31424c = new ArrayList();
        this.e = new ArrayList();
        this.f31425f = -1;
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
        int B;
        int i12;
        int i13;
        int i14;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i15 = 0;
        if (!this.f31423b) {
            this.f31426n = 0;
        }
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            arrayList = this.f31424c;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (!(childAt instanceof x30)) {
                i14 = i15;
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                ArrayList arrayList2 = this.e;
                boolean contains = arrayList2.contains(childAt);
                if (!contains) {
                    i14 = i15;
                    if (childAt.getMeasuredWidth() + i17 > dp) {
                        dp2 = org.telegram.messenger.t.D(8.0f, childAt.getMeasuredHeight(), dp2);
                        i17 = i14;
                    }
                } else {
                    i14 = i15;
                }
                if (childAt.getMeasuredWidth() + i18 > dp) {
                    dp3 = org.telegram.messenger.t.D(8.0f, childAt.getMeasuredHeight(), dp3);
                    i18 = i14;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i17;
                if (!this.f31423b) {
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
                        this.f31426n = Math.max(this.f31426n, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        this.f31426n = Math.max(this.f31426n, dp2);
                    }
                }
                if (!contains) {
                    i17 = org.telegram.messenger.t.D(9.0f, childAt.getMeasuredWidth(), i17);
                }
                i18 = org.telegram.messenger.t.D(9.0f, childAt.getMeasuredWidth(), i18);
            }
            i16++;
            i15 = i14;
        }
        int i19 = i15;
        if (AndroidUtilities.isTablet()) {
            B = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            B = org.telegram.messenger.vh.B(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i17 < B) {
            dp2 += AndroidUtilities.dp(40.0f);
        }
        if (dp - i18 < B) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        boolean z10 = this.f31423b;
        q20 q20Var = this.f31427r;
        if (!z10) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            q20Var.f31812n = dp2;
            if (this.f31422a != null) {
                this.h = AndroidUtilities.dp(42.0f) + dp2;
                this.f31422a.playTogether(arrayList);
                i12 = i19;
                this.f31422a.addListener(new o20(this, i12));
                this.f31425f = NotificationCenter.getInstance(q20Var.f31808a).setAnimationInProgress(this.f31425f, null);
                this.f31422a.start();
                this.f31423b = true;
            } else {
                i12 = i19;
                this.h = dp5;
            }
        } else {
            i12 = i19;
        }
        int i20 = this.f31426n;
        if (i20 > 0) {
            i13 = AndroidUtilities.dp(40.0f) + i20;
        } else {
            i13 = i12;
        }
        q20Var.e = i13;
        setMeasuredDimension(size, this.h);
        n20 n20Var = q20Var.f31811f;
        if (n20Var != null) {
            n20Var.a(q20Var.e);
        }
    }
}
