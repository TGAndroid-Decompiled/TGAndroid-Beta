package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class j70 extends ViewGroup {
    public boolean f24258a;
    public final ArrayList f24259b;
    public w30 f24260c;
    public boolean d;
    public final k70 e;

    public j70(k70 k70Var, Context context) {
        super(context);
        this.e = k70Var;
        this.f24259b = new ArrayList();
    }

    public final void a(w30 w30Var, boolean z10) {
        this.d = true;
        k70 k70Var = this.e;
        k70Var.f24631f0.k(w30Var, w30Var.getUid());
        AnimatorSet animatorSet = k70Var.f24629d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            k70Var.f24629d0.cancel();
        }
        this.f24258a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            k70Var.f24629d0 = animatorSet2;
            animatorSet2.addListener(new i70(this, 1));
            k70Var.f24629d0.setDuration(150L);
            k70Var.f24629d0.setInterpolator(wr.f28819f);
            ArrayList arrayList = this.f24259b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(w30Var, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(w30Var, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(w30Var, View.ALPHA, 0.0f, 1.0f));
        }
        addView(w30Var);
    }

    public final void b(w30 w30Var) {
        this.d = false;
        k70 k70Var = this.e;
        k70Var.f24631f0.l(w30Var.getUid());
        w30Var.setOnClickListener(null);
        AnimatorSet animatorSet = k70Var.f24629d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            k70Var.f24629d0.cancel();
        }
        this.f24258a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        k70Var.f24629d0 = animatorSet2;
        animatorSet2.addListener(new bi.u3(25, this, w30Var));
        k70Var.f24629d0.setDuration(150L);
        this.f24260c = w30Var;
        ArrayList arrayList = this.f24259b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f24260c, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f24260c, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f24260c, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
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
        int g10;
        int i12;
        s4.c1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.x1 x1Var;
        int i13;
        k70 k70Var = this.e;
        org.telegram.ui.ActionBar.x1 x1Var2 = k70Var.V;
        bi.y1 y1Var = k70Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f24259b;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (!(childAt instanceof w30)) {
                x1Var = x1Var2;
            } else {
                x1Var = x1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f24260c && childAt.getMeasuredWidth() + i15 > dp) {
                    dp2 = org.telegram.messenger.a2.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i15 = 0;
                }
                if (childAt.getMeasuredWidth() + i16 > dp) {
                    dp3 = org.telegram.messenger.a2.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i16 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i15;
                if (!this.f24258a) {
                    w30 w30Var = this.f24260c;
                    if (childAt == w30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i16);
                        childAt.setTranslationY(dp3);
                    } else if (w30Var != null) {
                        float f7 = dp4;
                        if (childAt.getTranslationX() != f7) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f7));
                        } else {
                            i13 = 1;
                        }
                        float f10 = dp2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr = new float[i13];
                            fArr[0] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                    }
                }
                if (childAt != this.f24260c) {
                    i15 = org.telegram.messenger.a2.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.a2.C(9.0f, childAt.getMeasuredWidth(), i16);
            }
            i14++;
            x1Var2 = x1Var;
        }
        org.telegram.ui.ActionBar.x1 x1Var3 = x1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        if (k70Var.m0 != null) {
            if (k70Var.f24632g0) {
                g10 = Math.min(k70Var.f24643s0, dp6);
            } else {
                g10 = 0;
            }
        } else {
            g10 = hc.b.g(52.0f, Math.min(k70Var.f24643s0, dp6), 0);
        }
        int i17 = k70Var.f24645u0;
        if (k70Var.m0 == null && k70Var.f24631f0.m() > 0) {
            i12 = AndroidUtilities.dp(56.0f);
        } else {
            i12 = 0;
        }
        k70Var.f24645u0 = i12;
        if (g10 != k70Var.f24639o0 || i17 != i12) {
            k70Var.f24639o0 = g10;
            if (y1Var.getAdapter() != null && y1Var.getAdapter().h() > 0 && (K = y1Var.K(0)) != null) {
                y1Var.getAdapter().m(0);
                k70Var.R.h1(0, K.f41610a.getTop() - y1Var.getPaddingTop());
                if (y1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ai.m(this, 7));
                    ofFloat.setDuration(y1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min = Math.min(k70Var.f24643s0, dp6);
        int i18 = k70Var.f24636k0;
        if (i18 != min) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i18, min);
            ofInt.addUpdateListener(new j6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > k70Var.f24643s0) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final j70 f23535b;

                {
                    this.f23535b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            k70 k70Var2 = this.f23535b.e;
                            k70Var2.V.smoothScrollTo(0, dp6 - k70Var2.f24643s0);
                            return;
                        default:
                            k70 k70Var3 = this.f23535b.e;
                            k70Var3.V.smoothScrollTo(0, dp6 - k70Var3.f24643s0);
                            return;
                    }
                }
            });
        } else if (!z10 && x1Var3.getMeasuredHeight() + x1Var3.getScrollY() > dp6) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final j70 f23535b;

                {
                    this.f23535b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            k70 k70Var2 = this.f23535b.e;
                            k70Var2.V.smoothScrollTo(0, dp6 - k70Var2.f24643s0);
                            return;
                        default:
                            k70 k70Var3 = this.f23535b.e;
                            k70Var3.V.smoothScrollTo(0, dp6 - k70Var3.f24643s0);
                            return;
                    }
                }
            });
        }
        if (!this.f24258a && (animatorSet = k70Var.f24629d0) != null) {
            animatorSet.playTogether(arrayList);
            k70Var.f24629d0.addListener(new i70(this, 0));
            k70Var.f24629d0.start();
            this.f24258a = true;
        }
        if (k70Var.f24629d0 == null) {
            k70Var.f24636k0 = min;
            viewGroup = ((org.telegram.ui.ActionBar.h3) k70Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        y1Var.setTranslationY(0.0f);
    }
}
