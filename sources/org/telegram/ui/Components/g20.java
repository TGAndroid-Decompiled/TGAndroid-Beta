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
public final class g20 extends ViewGroup {
    public AnimatorSet f25019a;
    public boolean f25020b;
    public final ArrayList f25021c;
    public o30 d;
    public final ArrayList e;
    public int f25022f;
    public int h;
    public int f25023n;
    public final h20 f25024r;

    public g20(h20 h20Var, Context context) {
        super(context);
        this.f25024r = h20Var;
        this.f25021c = new ArrayList();
        this.e = new ArrayList();
        this.f25022f = -1;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        int x10;
        int i12;
        char c3;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        if (!this.f25020b) {
            this.f25023n = 0;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.f25021c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof o30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                ArrayList arrayList2 = this.e;
                boolean contains = arrayList2.contains(childAt);
                if (!contains) {
                    c3 = 0;
                    if (childAt.getMeasuredWidth() + i14 > dp) {
                        dp2 = org.telegram.messenger.y3.C(8.0f, childAt.getMeasuredHeight(), dp2);
                        i14 = 0;
                    }
                } else {
                    c3 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.y3.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.f25020b) {
                    if (contains) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (!arrayList2.isEmpty()) {
                        float f10 = dp4;
                        if (childAt.getTranslationX() != f10) {
                            float[] fArr = new float[1];
                            fArr[c3] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, fArr));
                        }
                        float f11 = dp2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr2 = new float[1];
                            fArr2[c3] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr2));
                        }
                        this.f25023n = Math.max(this.f25023n, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        this.f25023n = Math.max(this.f25023n, dp2);
                    }
                }
                if (!contains) {
                    i14 = org.telegram.messenger.y3.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.y3.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
        }
        if (AndroidUtilities.isTablet()) {
            x10 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            x10 = org.telegram.ui.b.x(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i14 < x10) {
            dp2 += AndroidUtilities.dp(40.0f);
        }
        if (dp - i15 < x10) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        boolean z4 = this.f25020b;
        h20 h20Var = this.f25024r;
        if (!z4) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            h20Var.f25297n = dp2;
            if (this.f25019a != null) {
                this.h = AndroidUtilities.dp(42.0f) + dp2;
                this.f25019a.playTogether(arrayList);
                this.f25019a.addListener(new f20(this, 0));
                this.f25022f = NotificationCenter.getInstance(h20Var.f25293a).setAnimationInProgress(this.f25022f, null);
                this.f25019a.start();
                this.f25020b = true;
            } else {
                this.h = dp5;
            }
        }
        int i16 = this.f25023n;
        if (i16 > 0) {
            i12 = AndroidUtilities.dp(40.0f) + i16;
        } else {
            i12 = 0;
        }
        h20Var.e = i12;
        setMeasuredDimension(size, this.h);
        e20 e20Var = h20Var.f25296f;
        if (e20Var != null) {
            e20Var.a(h20Var.e);
        }
    }
}
