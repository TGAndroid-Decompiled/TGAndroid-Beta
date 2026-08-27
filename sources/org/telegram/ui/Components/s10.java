package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class s10 extends ViewGroup {

    public AnimatorSet f32292a;

    public boolean f32293b;

    public final ArrayList f32294c;
    public a30 d;

    public final ArrayList f32295e;

    public int f32296f;
    public int h;

    public int f32297n;

    public final t10 f32298r;

    public s10(t10 t10Var, Context context) {
        super(context);
        this.f32298r = t10Var;
        this.f32294c = new ArrayList();
        this.f32295e = new ArrayList();
        this.f32296f = -1;
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
        int iX;
        char c10;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int iDp = size - AndroidUtilities.dp(26.0f);
        int iDp2 = AndroidUtilities.dp(10.0f);
        int iDp3 = AndroidUtilities.dp(10.0f);
        if (!this.f32293b) {
            this.f32297n = 0;
        }
        int i12 = 0;
        int iC = 0;
        int iC2 = 0;
        while (true) {
            arrayList = this.f32294c;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt instanceof a30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                ArrayList arrayList2 = this.f32295e;
                boolean zContains = arrayList2.contains(childAt);
                if (zContains) {
                    c10 = 0;
                } else {
                    c10 = 0;
                    if (childAt.getMeasuredWidth() + iC > iDp) {
                        iDp2 = org.telegram.messenger.y1.C(8.0f, childAt.getMeasuredHeight(), iDp2);
                        iC = 0;
                    }
                }
                if (childAt.getMeasuredWidth() + iC2 > iDp) {
                    iDp3 = org.telegram.messenger.y1.C(8.0f, childAt.getMeasuredHeight(), iDp3);
                    iC2 = 0;
                }
                int iDp4 = AndroidUtilities.dp(13.0f) + iC;
                if (!this.f32293b) {
                    if (zContains) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + iC2);
                        childAt.setTranslationY(iDp3);
                    } else if (arrayList2.isEmpty()) {
                        childAt.setTranslationX(iDp4);
                        childAt.setTranslationY(iDp2);
                        this.f32297n = Math.max(this.f32297n, iDp2);
                    } else {
                        float f10 = iDp4;
                        if (childAt.getTranslationX() != f10) {
                            float[] fArr = new float[1];
                            fArr[c10] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, fArr));
                        }
                        float f11 = iDp2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr2 = new float[1];
                            fArr2[c10] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr2));
                        }
                        this.f32297n = Math.max(this.f32297n, iDp2);
                    }
                }
                if (!zContains) {
                    iC = org.telegram.messenger.y1.C(9.0f, childAt.getMeasuredWidth(), iC);
                }
                iC2 = org.telegram.messenger.y1.C(9.0f, childAt.getMeasuredWidth(), iC2);
            }
            i12++;
        }
        if (AndroidUtilities.isTablet()) {
            iX = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            iX = org.telegram.messenger.rl.x(158.0f, Math.min(point.x, point.y), 3);
        }
        if (iDp - iC < iX) {
            iDp2 += AndroidUtilities.dp(40.0f);
        }
        if (iDp - iC2 < iX) {
            iDp3 += AndroidUtilities.dp(40.0f);
        }
        boolean z10 = this.f32293b;
        t10 t10Var = this.f32298r;
        if (!z10) {
            int iDp5 = AndroidUtilities.dp(42.0f) + iDp3;
            t10Var.f32621n = iDp2;
            if (this.f32292a != null) {
                this.h = AndroidUtilities.dp(42.0f) + iDp2;
                this.f32292a.playTogether(arrayList);
                this.f32292a.addListener(new r10(this, 0));
                this.f32296f = NotificationCenter.getInstance(t10Var.f32616a).setAnimationInProgress(this.f32296f, null);
                this.f32292a.start();
                this.f32293b = true;
            } else {
                this.h = iDp5;
            }
        }
        int i13 = this.f32297n;
        t10Var.f32619e = i13 > 0 ? AndroidUtilities.dp(40.0f) + i13 : 0;
        setMeasuredDimension(size, this.h);
        q10 q10Var = t10Var.f32620f;
        if (q10Var != null) {
            q10Var.a(t10Var.f32619e);
        }
    }
}
