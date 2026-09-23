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
public final class f20 extends ViewGroup {
    public AnimatorSet f23812a;
    public boolean f23813b;
    public final ArrayList f23814c;
    public n30 d;
    public final ArrayList e;
    public int f23815f;
    public int h;
    public int f23816n;
    public final g20 f23817r;

    public f20(g20 g20Var, Context context) {
        super(context);
        this.f23817r = g20Var;
        this.f23814c = new ArrayList();
        this.e = new ArrayList();
        this.f23815f = -1;
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
        if (!this.f23813b) {
            this.f23816n = 0;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.f23814c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof n30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                ArrayList arrayList2 = this.e;
                boolean contains = arrayList2.contains(childAt);
                if (!contains) {
                    c10 = 0;
                    if (childAt.getMeasuredWidth() + i14 > dp) {
                        dp2 = org.telegram.messenger.z0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                        i14 = 0;
                    }
                } else {
                    c10 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.z0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.f23813b) {
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
                        this.f23816n = Math.max(this.f23816n, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        this.f23816n = Math.max(this.f23816n, dp2);
                    }
                }
                if (!contains) {
                    i14 = org.telegram.messenger.z0.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.z0.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
        }
        if (AndroidUtilities.isTablet()) {
            y3 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            y3 = org.telegram.messenger.ul.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i14 < y3) {
            dp2 += AndroidUtilities.dp(40.0f);
        }
        if (dp - i15 < y3) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        boolean z10 = this.f23813b;
        g20 g20Var = this.f23817r;
        if (!z10) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            g20Var.f24138n = dp2;
            if (this.f23812a != null) {
                this.h = AndroidUtilities.dp(42.0f) + dp2;
                this.f23812a.playTogether(arrayList);
                this.f23812a.addListener(new e20(this, 0));
                this.f23815f = NotificationCenter.getInstance(g20Var.f24134a).setAnimationInProgress(this.f23815f, null);
                this.f23812a.start();
                this.f23813b = true;
            } else {
                this.h = dp5;
            }
        }
        int i16 = this.f23816n;
        if (i16 > 0) {
            i12 = AndroidUtilities.dp(40.0f) + i16;
        } else {
            i12 = 0;
        }
        g20Var.e = i12;
        setMeasuredDimension(size, this.h);
        d20 d20Var = g20Var.f24137f;
        if (d20Var != null) {
            d20Var.a(g20Var.e);
        }
    }
}
