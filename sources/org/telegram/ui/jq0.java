package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class jq0 extends FrameLayout implements org.telegram.messenger.cs {
    public final FrameLayout f46671a;
    public final yg0 f46672b;
    public final org.telegram.ui.ActionBar.k5[] f46673c;
    public final org.telegram.ui.Components.h6 d;
    public AnimatorSet f46674e;
    public AnimatorSet f46675f;
    public boolean h;
    public ValueAnimator f46676n;
    public float f46677r;
    public int f46678s;

    public jq0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f46671a = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(56.0f), 0, 0, 0);
        addView(frameLayout, b8.mf.e(-1, -1, 119));
        yg0 yg0Var = new yg0(activity, 2);
        this.f46672b = yg0Var;
        yg0Var.setPivotX(org.telegram.messenger.g0.L(16.0f));
        yg0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, 0, 0);
        yg0Var.setClipToPadding(false);
        frameLayout.addView(yg0Var, b8.mf.e(-1, -1, 119));
        this.f46673c = new org.telegram.ui.ActionBar.k5[2];
        for (int i3 = 0; i3 < 2; i3++) {
            this.f46673c[i3] = new org.telegram.ui.ActionBar.k5(activity);
            this.f46673c[i3].setGravity(19);
            this.f46673c[i3].setTextColor(-1);
            this.f46673c[i3].setTextSize(20);
            this.f46673c[i3].setTypeface(org.telegram.messenger.g0.o());
            this.f46673c[i3].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
            this.f46673c[i3].setScrollNonFitText(true);
            this.f46672b.addView(this.f46673c[i3], b8.mf.e(-1, -2, 19));
        }
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(activity, true, false, false);
        this.d = h6Var;
        h6Var.b(0.4f, 320L, org.telegram.ui.Components.xq.h);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setGravity(19);
        h6Var.setTextColor(-1);
        h6Var.setEllipsizeByGradient(true);
        h6Var.setImportantForAccessibility(1);
        h6Var.setAccessibilityLiveRegion(1);
        this.f46671a.addView(h6Var, b8.mf.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z10) {
        boolean z11;
        int i3;
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = !isEmpty;
        boolean z13 = this.h;
        org.telegram.ui.Components.h6 h6Var = this.d;
        if (z12 != z13) {
            this.h = z12;
            AnimatorSet animatorSet = this.f46675f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = org.telegram.messenger.g0.f22608q;
            if (point.x > point.y) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!isEmpty) {
                i3 = 30;
            } else {
                i3 = 33;
            }
            if (z11) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            int L = org.telegram.messenger.g0.L(i3 - i10);
            float f14 = 0.87f;
            float f15 = 0.0f;
            yg0 yg0Var = this.f46672b;
            if (z10) {
                ArrayList arrayList = new ArrayList();
                if (!isEmpty) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(h6Var, View.ALPHA, f12));
                float[] fArr = {L};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(h6Var, property, fArr));
                if (!isEmpty) {
                    f15 = org.telegram.messenger.g0.L(-12.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(yg0Var, property, f15));
                if (!isEmpty) {
                    f13 = 0.87f;
                } else {
                    f13 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(yg0Var, View.SCALE_X, f13));
                if (isEmpty) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(yg0Var, View.SCALE_Y, f14));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f46675f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f46675f.setInterpolator(org.telegram.ui.Components.xq.h);
                this.f46675f.start();
            } else {
                if (!isEmpty) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                h6Var.setAlpha(f10);
                h6Var.setTranslationY(L);
                if (!isEmpty) {
                    f15 = org.telegram.messenger.g0.L(-12.0f);
                }
                yg0Var.setTranslationY(f15);
                if (!isEmpty) {
                    f11 = 0.87f;
                } else {
                    f11 = 1.0f;
                }
                yg0Var.setScaleX(f11);
                if (isEmpty) {
                    f14 = 1.0f;
                }
                yg0Var.setScaleY(f14);
            }
        }
        h6Var.c(charSequence, z10, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        h6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z10) {
        int i3;
        int i10;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f46673c;
        int i11 = 0;
        TextPaint paint = k5VarArr[0].getPaint();
        float N = org.telegram.messenger.g0.N(0.66f);
        if (z10) {
            i3 = 1912602624;
        } else {
            i3 = 0;
        }
        paint.setShadowLayer(N, 0.0f, 1.0f, i3);
        TextPaint paint2 = k5VarArr[1].getPaint();
        float N2 = org.telegram.messenger.g0.N(0.66f);
        if (z10) {
            i10 = 1912602624;
        } else {
            i10 = 0;
        }
        paint2.setShadowLayer(N2, 0.0f, 1.0f, i10);
        org.telegram.ui.Components.g6 drawable = this.d.getDrawable();
        float N3 = org.telegram.messenger.g0.N(0.66f);
        if (z10) {
            i11 = 1912602624;
        }
        drawable.s(N3, 1.0f, i11);
    }

    public final void c(CharSequence charSequence) {
        boolean z10;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f46673c;
        boolean z11 = true;
        k5VarArr[1].setAlpha(0.0f);
        k5VarArr[1].setVisibility(8);
        CharSequence text = k5VarArr[0].getText();
        if (text != null || charSequence != null) {
            if (text == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (charSequence != null) {
                z11 = false;
            }
            if (z10 != z11) {
                z11 = false;
            } else {
                z11 = TextUtils.equals(text.toString(), charSequence.toString());
            }
        }
        if (!z11) {
            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[0];
            k5Var.S = 0.0f;
            k5Var.b();
        }
        k5VarArr[0].k(charSequence);
        k5VarArr[0].setAlpha(1.0f);
        k5VarArr[0].setTranslationX(0.0f);
        k5VarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z10, boolean z11) {
        boolean equals;
        int i3;
        Property property;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f46673c;
        CharSequence text = k5VarArr[0].getText();
        if (text == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (equals) {
            return;
        }
        AnimatorSet animatorSet = this.f46674e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f46674e = null;
        }
        org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[1];
        org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[0];
        k5Var.getClass();
        k5Var.S = k5Var2.S;
        k5Var.b();
        k5VarArr[1].k(k5VarArr[0].getText());
        k5VarArr[1].setRightPadding((int) this.f46677r);
        org.telegram.ui.ActionBar.k5 k5Var3 = k5VarArr[0];
        k5Var3.S = 0.0f;
        k5Var3.b();
        k5VarArr[0].k(charSequence);
        int L = org.telegram.messenger.g0.L(8.0f);
        if (z11) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        float f10 = L * i3;
        k5VarArr[1].setTranslationX(0.0f);
        k5VarArr[1].setTranslationY(0.0f);
        if (z10) {
            k5VarArr[0].setTranslationX(0.0f);
            k5VarArr[0].setTranslationY(-f10);
        } else {
            k5VarArr[0].setTranslationX(-f10);
            k5VarArr[0].setTranslationY(0.0f);
        }
        k5VarArr[0].setAlpha(0.0f);
        k5VarArr[1].setAlpha(1.0f);
        k5VarArr[0].setVisibility(0);
        k5VarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property2 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(k5VarArr[1], property2, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(k5VarArr[0], property2, 1.0f));
        org.telegram.ui.ActionBar.k5 k5Var4 = k5VarArr[1];
        Property property3 = View.TRANSLATION_X;
        Property property4 = View.TRANSLATION_Y;
        if (z10) {
            property = property4;
        } else {
            property = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(k5Var4, property, f10));
        org.telegram.ui.ActionBar.k5 k5Var5 = k5VarArr[0];
        if (z10) {
            property3 = property4;
        }
        arrayList.add(ObjectAnimator.ofFloat(k5Var5, property3, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f46674e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f46674e.addListener(new y20(this, 18));
        this.f46674e.setDuration(320L);
        this.f46674e.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f46674e.start();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23246i4) {
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.f46673c;
            k5VarArr[0].invalidate();
            k5VarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        this.f46671a.layout(0, org.telegram.messenger.g0.f22602m, i11 - i3, i12 - i10);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = org.telegram.messenger.g0.f22602m;
        int i12 = this.f46678s;
        int i13 = org.telegram.messenger.g0.f22608q.y;
        if (i12 != i13) {
            this.f46678s = i13;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.f46671a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i11, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
