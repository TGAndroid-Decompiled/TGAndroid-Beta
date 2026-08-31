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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class iu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout f37929a;
    public final eh.d f37930b;
    public final org.telegram.ui.ActionBar.l5[] f37931c;
    public final org.telegram.ui.Components.k6 d;
    public AnimatorSet f37932e;
    public AnimatorSet f37933f;
    public boolean h;
    public ValueAnimator f37934n;
    public float f37935r;
    public int f37936s;

    public iu0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f37929a = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(56.0f), 0, 0, 0);
        addView(frameLayout, k7.c6.e(-1, -1, 119));
        eh.d dVar = new eh.d(activity, 25);
        this.f37930b = dVar;
        dVar.setPivotX(AndroidUtilities.dp(16.0f));
        dVar.setPadding(AndroidUtilities.dp(16.0f), 0, 0, 0);
        dVar.setClipToPadding(false);
        frameLayout.addView(dVar, k7.c6.e(-1, -1, 119));
        this.f37931c = new org.telegram.ui.ActionBar.l5[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f37931c[i10] = new org.telegram.ui.ActionBar.l5(activity);
            this.f37931c[i10].setGravity(19);
            this.f37931c[i10].setTextColor(-1);
            this.f37931c[i10].setTextSize(20);
            this.f37931c[i10].setTypeface(AndroidUtilities.bold());
            this.f37931c[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
            this.f37931c[i10].setScrollNonFitText(true);
            this.f37930b.addView(this.f37931c[i10], k7.c6.e(-1, -2, 19));
        }
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(activity, true, false, false);
        this.d = k6Var;
        k6Var.b(0.4f, 320L, org.telegram.ui.Components.pr.h);
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setGravity(19);
        k6Var.setTextColor(-1);
        k6Var.setEllipsizeByGradient(true);
        k6Var.setImportantForAccessibility(1);
        k6Var.setAccessibilityLiveRegion(1);
        this.f37929a.addView(k6Var, k7.c6.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z4) {
        boolean z10;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = !isEmpty;
        boolean z12 = this.h;
        org.telegram.ui.Components.k6 k6Var = this.d;
        if (z11 != z12) {
            this.h = z11;
            AnimatorSet animatorSet = this.f37933f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!isEmpty) {
                i10 = 30;
            } else {
                i10 = 33;
            }
            if (z10) {
                i11 = 6;
            } else {
                i11 = 0;
            }
            int dp = AndroidUtilities.dp(i10 - i11);
            float f14 = 0.87f;
            float f15 = 0.0f;
            eh.d dVar = this.f37930b;
            if (z4) {
                ArrayList arrayList = new ArrayList();
                if (!isEmpty) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(k6Var, View.ALPHA, f12));
                float[] fArr = {dp};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(k6Var, property, fArr));
                if (!isEmpty) {
                    f15 = AndroidUtilities.dp(-12.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(dVar, property, f15));
                if (!isEmpty) {
                    f13 = 0.87f;
                } else {
                    f13 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(dVar, View.SCALE_X, f13));
                if (isEmpty) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(dVar, View.SCALE_Y, f14));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f37933f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f37933f.setInterpolator(org.telegram.ui.Components.pr.h);
                this.f37933f.start();
            } else {
                if (!isEmpty) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k6Var.setAlpha(f10);
                k6Var.setTranslationY(dp);
                if (!isEmpty) {
                    f15 = AndroidUtilities.dp(-12.0f);
                }
                dVar.setTranslationY(f15);
                if (!isEmpty) {
                    f11 = 0.87f;
                } else {
                    f11 = 1.0f;
                }
                dVar.setScaleX(f11);
                if (isEmpty) {
                    f14 = 1.0f;
                }
                dVar.setScaleY(f14);
            }
        }
        k6Var.c(charSequence, z4, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        k6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z4) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.f37931c;
        int i12 = 0;
        TextPaint paint = l5VarArr[0].getPaint();
        float dpf2 = AndroidUtilities.dpf2(0.66f);
        if (z4) {
            i10 = 1912602624;
        } else {
            i10 = 0;
        }
        paint.setShadowLayer(dpf2, 0.0f, 1.0f, i10);
        TextPaint paint2 = l5VarArr[1].getPaint();
        float dpf22 = AndroidUtilities.dpf2(0.66f);
        if (z4) {
            i11 = 1912602624;
        } else {
            i11 = 0;
        }
        paint2.setShadowLayer(dpf22, 0.0f, 1.0f, i11);
        org.telegram.ui.Components.j6 drawable = this.d.getDrawable();
        float dpf23 = AndroidUtilities.dpf2(0.66f);
        if (z4) {
            i12 = 1912602624;
        }
        drawable.p(dpf23, 1.0f, i12);
    }

    public final void c(CharSequence charSequence) {
        boolean z4;
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.f37931c;
        boolean z10 = true;
        l5VarArr[1].setAlpha(0.0f);
        l5VarArr[1].setVisibility(8);
        CharSequence text = l5VarArr[0].getText();
        if (text != null || charSequence != null) {
            if (text == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (charSequence != null) {
                z10 = false;
            }
            if (z4 != z10) {
                z10 = false;
            } else {
                z10 = TextUtils.equals(text.toString(), charSequence.toString());
            }
        }
        if (!z10) {
            org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[0];
            l5Var.O = 0.0f;
            l5Var.b();
        }
        l5VarArr[0].k(charSequence);
        l5VarArr[0].setAlpha(1.0f);
        l5VarArr[0].setTranslationX(0.0f);
        l5VarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z4, boolean z10) {
        boolean equals;
        int i10;
        Property property;
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.f37931c;
        CharSequence text = l5VarArr[0].getText();
        if (text == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (equals) {
            return;
        }
        AnimatorSet animatorSet = this.f37932e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f37932e = null;
        }
        org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[1];
        org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[0];
        l5Var.getClass();
        l5Var.O = l5Var2.O;
        l5Var.b();
        l5VarArr[1].k(l5VarArr[0].getText());
        l5VarArr[1].setRightPadding((int) this.f37935r);
        org.telegram.ui.ActionBar.l5 l5Var3 = l5VarArr[0];
        l5Var3.O = 0.0f;
        l5Var3.b();
        l5VarArr[0].k(charSequence);
        int dp = AndroidUtilities.dp(8.0f);
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        float f10 = dp * i10;
        l5VarArr[1].setTranslationX(0.0f);
        l5VarArr[1].setTranslationY(0.0f);
        if (z4) {
            l5VarArr[0].setTranslationX(0.0f);
            l5VarArr[0].setTranslationY(-f10);
        } else {
            l5VarArr[0].setTranslationX(-f10);
            l5VarArr[0].setTranslationY(0.0f);
        }
        l5VarArr[0].setAlpha(0.0f);
        l5VarArr[1].setAlpha(1.0f);
        l5VarArr[0].setVisibility(0);
        l5VarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property2 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(l5VarArr[1], property2, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(l5VarArr[0], property2, 1.0f));
        org.telegram.ui.ActionBar.l5 l5Var4 = l5VarArr[1];
        Property property3 = View.TRANSLATION_X;
        Property property4 = View.TRANSLATION_Y;
        if (z4) {
            property = property4;
        } else {
            property = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(l5Var4, property, f10));
        org.telegram.ui.ActionBar.l5 l5Var5 = l5VarArr[0];
        if (z4) {
            property3 = property4;
        }
        arrayList.add(ObjectAnimator.ofFloat(l5Var5, property3, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f37932e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f37932e.addListener(new ns0(this, 8));
        this.f37932e.setDuration(320L);
        this.f37932e.setInterpolator(org.telegram.ui.Components.pr.h);
        this.f37932e.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.ActionBar.l5[] l5VarArr = this.f37931c;
            l5VarArr[0].invalidate();
            l5VarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        this.f37929a.layout(0, AndroidUtilities.statusBarHeight, i12 - i10, i13 - i11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.f37936s;
        int i14 = AndroidUtilities.displaySize.y;
        if (i13 != i14) {
            this.f37936s = i14;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.f37929a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i12, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
