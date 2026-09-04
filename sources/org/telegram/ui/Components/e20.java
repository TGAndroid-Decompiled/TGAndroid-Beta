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
public final class e20 extends ViewGroup {
    public AnimatorSet f25520a;
    public boolean f25521b;
    public final ArrayList f25522c;
    public m30 d;
    public final ArrayList f25523e;
    public int f25524f;
    public int h;
    public int f25525n;
    public final f20 f25526r;

    public e20(f20 f20Var, Context context) {
        super(context);
        this.f25526r = f20Var;
        this.f25522c = new ArrayList();
        this.f25523e = new ArrayList();
        this.f25524f = -1;
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
        int y3;
        int i12;
        char c10;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        if (!this.f25521b) {
            this.f25525n = 0;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.f25522c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof m30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                ArrayList arrayList2 = this.f25523e;
                boolean contains = arrayList2.contains(childAt);
                if (!contains) {
                    c10 = 0;
                    if (childAt.getMeasuredWidth() + i14 > dp) {
                        dp2 = org.telegram.messenger.w1.C(8.0f, childAt.getMeasuredHeight(), dp2);
                        i14 = 0;
                    }
                } else {
                    c10 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.w1.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.f25521b) {
                    if (contains) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (!arrayList2.isEmpty()) {
                        float f7 = dp4;
                        if (childAt.getTranslationX() != f7) {
                            float[] fArr = new float[1];
                            fArr[c10] = f7;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, fArr));
                        }
                        float f10 = dp2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr2 = new float[1];
                            fArr2[c10] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr2));
                        }
                        this.f25525n = Math.max(this.f25525n, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        this.f25525n = Math.max(this.f25525n, dp2);
                    }
                }
                if (!contains) {
                    i14 = org.telegram.messenger.w1.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.w1.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
        }
        if (AndroidUtilities.isTablet()) {
            y3 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            y3 = org.telegram.messenger.wl.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i14 < y3) {
            dp2 += AndroidUtilities.dp(40.0f);
        }
        if (dp - i15 < y3) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        boolean z10 = this.f25521b;
        f20 f20Var = this.f25526r;
        if (!z10) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            f20Var.f25878n = dp2;
            if (this.f25520a != null) {
                this.h = AndroidUtilities.dp(42.0f) + dp2;
                this.f25520a.playTogether(arrayList);
                this.f25520a.addListener(new d20(this, 0));
                this.f25524f = NotificationCenter.getInstance(f20Var.f25873a).setAnimationInProgress(this.f25524f, null);
                this.f25520a.start();
                this.f25521b = true;
            } else {
                this.h = dp5;
            }
        }
        int i16 = this.f25525n;
        if (i16 > 0) {
            i12 = AndroidUtilities.dp(40.0f) + i16;
        } else {
            i12 = 0;
        }
        f20Var.f25876e = i12;
        setMeasuredDimension(size, this.h);
        c20 c20Var = f20Var.f25877f;
        if (c20Var != null) {
            c20Var.a(f20Var.f25876e);
        }
    }
}
