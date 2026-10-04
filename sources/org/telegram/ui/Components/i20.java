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
public final class i20 extends ViewGroup {
    public AnimatorSet f27284a;
    public boolean f27285b;
    public final ArrayList f27286c;
    public q30 d;
    public final ArrayList f27287e;
    public int f27288f;
    public int h;
    public int f27289n;
    public final j20 f27290r;

    public i20(j20 j20Var, Context context) {
        super(context);
        this.f27290r = j20Var;
        this.f27286c = new ArrayList();
        this.f27287e = new ArrayList();
        this.f27288f = -1;
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
        int z10;
        int i12;
        char c10;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        if (!this.f27285b) {
            this.f27289n = 0;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.f27286c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof q30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                ArrayList arrayList2 = this.f27287e;
                boolean contains = arrayList2.contains(childAt);
                if (!contains) {
                    c10 = 0;
                    if (childAt.getMeasuredWidth() + i14 > dp) {
                        dp2 = org.telegram.messenger.f0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                        i14 = 0;
                    }
                } else {
                    c10 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.f0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.f27285b) {
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
                        this.f27289n = Math.max(this.f27289n, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        this.f27289n = Math.max(this.f27289n, dp2);
                    }
                }
                if (!contains) {
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
        }
        if (dp - i15 < z10) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        boolean z11 = this.f27285b;
        j20 j20Var = this.f27290r;
        if (!z11) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            j20Var.f27562n = dp2;
            if (this.f27284a != null) {
                this.h = AndroidUtilities.dp(42.0f) + dp2;
                this.f27284a.playTogether(arrayList);
                this.f27284a.addListener(new h20(this, 0));
                this.f27288f = NotificationCenter.getInstance(j20Var.f27557a).setAnimationInProgress(this.f27288f, null);
                this.f27284a.start();
                this.f27285b = true;
            } else {
                this.h = dp5;
            }
        }
        int i16 = this.f27289n;
        if (i16 > 0) {
            i12 = AndroidUtilities.dp(40.0f) + i16;
        } else {
            i12 = 0;
        }
        j20Var.f27560e = i12;
        setMeasuredDimension(size, this.h);
        g20 g20Var = j20Var.f27561f;
        if (g20Var != null) {
            g20Var.a(j20Var.f27560e);
        }
    }
}
