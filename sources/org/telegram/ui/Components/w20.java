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
public final class w20 extends ViewGroup {
    public AnimatorSet f32553a;
    public boolean f32554b;
    public final ArrayList f32555c;
    public e40 d;
    public final ArrayList f32556e;
    public int f32557f;
    public int h;
    public int f32558n;
    public final x20 f32559r;

    public w20(x20 x20Var, Context context) {
        super(context);
        this.f32559r = x20Var;
        this.f32555c = new ArrayList();
        this.f32556e = new ArrayList();
        this.f32557f = -1;
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
        if (!this.f32554b) {
            this.f32558n = 0;
        }
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            arrayList = this.f32555c;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (!(childAt instanceof e40)) {
                i14 = i15;
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                ArrayList arrayList2 = this.f32556e;
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
                if (!this.f32554b) {
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
                        this.f32558n = Math.max(this.f32558n, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        this.f32558n = Math.max(this.f32558n, dp2);
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
            A = org.telegram.messenger.ai.A(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i17 < A) {
            dp2 += AndroidUtilities.dp(40.0f);
        }
        if (dp - i18 < A) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        boolean z10 = this.f32554b;
        x20 x20Var = this.f32559r;
        if (!z10) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            x20Var.f32808n = dp2;
            if (this.f32553a != null) {
                this.h = AndroidUtilities.dp(42.0f) + dp2;
                this.f32553a.playTogether(arrayList);
                i12 = i19;
                this.f32553a.addListener(new v20(this, i12));
                this.f32557f = NotificationCenter.getInstance(x20Var.f32803a).setAnimationInProgress(this.f32557f, null);
                this.f32553a.start();
                this.f32554b = true;
            } else {
                i12 = i19;
                this.h = dp5;
            }
        } else {
            i12 = i19;
        }
        int i20 = this.f32558n;
        if (i20 > 0) {
            i13 = AndroidUtilities.dp(40.0f) + i20;
        } else {
            i13 = i12;
        }
        x20Var.f32806e = i13;
        setMeasuredDimension(size, this.h);
        u20 u20Var = x20Var.f32807f;
        if (u20Var != null) {
            u20Var.a(x20Var.f32806e);
        }
    }
}
