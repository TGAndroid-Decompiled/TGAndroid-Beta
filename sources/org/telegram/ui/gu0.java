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
public final class gu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout f37420a;
    public final ci.i4 f37421b;
    public final org.telegram.ui.ActionBar.j5[] f37422c;
    public final org.telegram.ui.Components.q6 d;
    public AnimatorSet e;
    public AnimatorSet f37423f;
    public boolean h;
    public ValueAnimator f37424n;
    public float f37425r;
    public int f37426s;

    public gu0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f37420a = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(56.0f), 0, 0, 0);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        ci.i4 i4Var = new ci.i4(activity, 25);
        this.f37421b = i4Var;
        i4Var.setPivotX(AndroidUtilities.dp(16.0f));
        i4Var.setPadding(AndroidUtilities.dp(16.0f), 0, 0, 0);
        i4Var.setClipToPadding(false);
        frameLayout.addView(i4Var, w7.z5.e(-1, -1, 119));
        this.f37422c = new org.telegram.ui.ActionBar.j5[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f37422c[i10] = new org.telegram.ui.ActionBar.j5(activity);
            this.f37422c[i10].setGravity(19);
            this.f37422c[i10].setTextColor(-1);
            this.f37422c[i10].setTextSize(20);
            this.f37422c[i10].setTypeface(AndroidUtilities.bold());
            this.f37422c[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
            this.f37422c[i10].setScrollNonFitText(true);
            this.f37421b.addView(this.f37422c[i10], w7.z5.e(-1, -2, 19));
        }
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(activity, true, false, false);
        this.d = q6Var;
        q6Var.b(0.4f, 320L, org.telegram.ui.Components.bs.h);
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setGravity(19);
        q6Var.setTextColor(-1);
        q6Var.setEllipsizeByGradient(true);
        q6Var.setImportantForAccessibility(1);
        q6Var.setAccessibilityLiveRegion(1);
        this.f37420a.addView(q6Var, w7.z5.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = !isEmpty;
        boolean z13 = this.h;
        org.telegram.ui.Components.q6 q6Var = this.d;
        if (z12 != z13) {
            this.h = z12;
            AnimatorSet animatorSet = this.f37423f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!isEmpty) {
                i10 = 30;
            } else {
                i10 = 33;
            }
            if (z11) {
                i11 = 6;
            } else {
                i11 = 0;
            }
            int dp = AndroidUtilities.dp(i10 - i11);
            float f13 = 0.87f;
            float f14 = 0.0f;
            ci.i4 i4Var = this.f37421b;
            if (z10) {
                ArrayList arrayList = new ArrayList();
                if (!isEmpty) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(q6Var, View.ALPHA, f11));
                float[] fArr = {dp};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(q6Var, property, fArr));
                if (!isEmpty) {
                    f14 = AndroidUtilities.dp(-12.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(i4Var, property, f14));
                if (!isEmpty) {
                    f12 = 0.87f;
                } else {
                    f12 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(i4Var, View.SCALE_X, f12));
                if (isEmpty) {
                    f13 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(i4Var, View.SCALE_Y, f13));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f37423f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f37423f.setInterpolator(org.telegram.ui.Components.bs.h);
                this.f37423f.start();
            } else {
                if (!isEmpty) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                q6Var.setAlpha(f7);
                q6Var.setTranslationY(dp);
                if (!isEmpty) {
                    f14 = AndroidUtilities.dp(-12.0f);
                }
                i4Var.setTranslationY(f14);
                if (!isEmpty) {
                    f10 = 0.87f;
                } else {
                    f10 = 1.0f;
                }
                i4Var.setScaleX(f10);
                if (isEmpty) {
                    f13 = 1.0f;
                }
                i4Var.setScaleY(f13);
            }
        }
        q6Var.c(charSequence, z10, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        q6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.f37422c;
        int i12 = 0;
        TextPaint paint = j5VarArr[0].getPaint();
        float dpf2 = AndroidUtilities.dpf2(0.66f);
        if (z10) {
            i10 = 1912602624;
        } else {
            i10 = 0;
        }
        paint.setShadowLayer(dpf2, 0.0f, 1.0f, i10);
        TextPaint paint2 = j5VarArr[1].getPaint();
        float dpf22 = AndroidUtilities.dpf2(0.66f);
        if (z10) {
            i11 = 1912602624;
        } else {
            i11 = 0;
        }
        paint2.setShadowLayer(dpf22, 0.0f, 1.0f, i11);
        org.telegram.ui.Components.p6 drawable = this.d.getDrawable();
        float dpf23 = AndroidUtilities.dpf2(0.66f);
        if (z10) {
            i12 = 1912602624;
        }
        drawable.s(dpf23, 1.0f, i12);
    }

    public final void c(CharSequence charSequence) {
        boolean z10;
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.f37422c;
        boolean z11 = true;
        j5VarArr[1].setAlpha(0.0f);
        j5VarArr[1].setVisibility(8);
        CharSequence text = j5VarArr[0].getText();
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
            org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[0];
            j5Var.R = 0.0f;
            j5Var.b();
        }
        j5VarArr[0].k(charSequence);
        j5VarArr[0].setAlpha(1.0f);
        j5VarArr[0].setTranslationX(0.0f);
        j5VarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z10, boolean z11) {
        boolean equals;
        int i10;
        Property property;
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.f37422c;
        CharSequence text = j5VarArr[0].getText();
        if (text == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (equals) {
            return;
        }
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.e = null;
        }
        org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[1];
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[0];
        j5Var.getClass();
        j5Var.R = j5Var2.R;
        j5Var.b();
        j5VarArr[1].k(j5VarArr[0].getText());
        j5VarArr[1].setRightPadding((int) this.f37425r);
        org.telegram.ui.ActionBar.j5 j5Var3 = j5VarArr[0];
        j5Var3.R = 0.0f;
        j5Var3.b();
        j5VarArr[0].k(charSequence);
        int dp = AndroidUtilities.dp(8.0f);
        if (z11) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        float f7 = dp * i10;
        j5VarArr[1].setTranslationX(0.0f);
        j5VarArr[1].setTranslationY(0.0f);
        if (z10) {
            j5VarArr[0].setTranslationX(0.0f);
            j5VarArr[0].setTranslationY(-f7);
        } else {
            j5VarArr[0].setTranslationX(-f7);
            j5VarArr[0].setTranslationY(0.0f);
        }
        j5VarArr[0].setAlpha(0.0f);
        j5VarArr[1].setAlpha(1.0f);
        j5VarArr[0].setVisibility(0);
        j5VarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property2 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(j5VarArr[1], property2, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(j5VarArr[0], property2, 1.0f));
        org.telegram.ui.ActionBar.j5 j5Var4 = j5VarArr[1];
        Property property3 = View.TRANSLATION_X;
        Property property4 = View.TRANSLATION_Y;
        if (z10) {
            property = property4;
        } else {
            property = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(j5Var4, property, f7));
        org.telegram.ui.ActionBar.j5 j5Var5 = j5VarArr[0];
        if (z10) {
            property3 = property4;
        }
        arrayList.add(ObjectAnimator.ofFloat(j5Var5, property3, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.e.addListener(new zb0(this, 15));
        this.e.setDuration(320L);
        this.e.setInterpolator(org.telegram.ui.Components.bs.h);
        this.e.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.ActionBar.j5[] j5VarArr = this.f37422c;
            j5VarArr[0].invalidate();
            j5VarArr[1].invalidate();
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f37420a.layout(0, AndroidUtilities.statusBarHeight, i12 - i10, i13 - i11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.f37426s;
        int i14 = AndroidUtilities.displaySize.y;
        if (i13 != i14) {
            this.f37426s = i14;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.f37420a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i12, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
