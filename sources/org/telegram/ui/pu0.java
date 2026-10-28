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
public final class pu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout f42503a;
    public final di.i4 f42504b;
    public final org.telegram.ui.ActionBar.b6[] f42505c;
    public final org.telegram.ui.Components.s6 d;
    public AnimatorSet e;
    public AnimatorSet f42506f;
    public boolean h;
    public ValueAnimator f42507n;
    public float f42508r;
    public int f42509s;

    public pu0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f42503a = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(56.0f), 0, 0, 0);
        addView(frameLayout, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        di.i4 i4Var = new di.i4(activity, 25);
        this.f42504b = i4Var;
        i4Var.setPivotX(AndroidUtilities.dp(16.0f));
        i4Var.setPadding(AndroidUtilities.dp(16.0f), 0, 0, 0);
        i4Var.setClipToPadding(false);
        frameLayout.addView(i4Var, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        this.f42505c = new org.telegram.ui.ActionBar.b6[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f42505c[i10] = new org.telegram.ui.ActionBar.b6(activity);
            this.f42505c[i10].setGravity(19);
            this.f42505c[i10].setTextColor(-1);
            this.f42505c[i10].setTextSize(20);
            this.f42505c[i10].setTypeface(AndroidUtilities.bold());
            this.f42505c[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
            this.f42505c[i10].setScrollNonFitText(true);
            this.f42504b.addView(this.f42505c[i10], org.telegram.ui.Components.kb1.i(-1, -2, 19));
        }
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(activity, true, false, false);
        this.d = s6Var;
        s6Var.b(0.4f, 320L, org.telegram.ui.Components.ds.h);
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setGravity(19);
        s6Var.setTextColor(-1);
        s6Var.setEllipsizeByGradient(true);
        s6Var.setImportantForAccessibility(1);
        s6Var.setAccessibilityLiveRegion(1);
        this.f42503a.addView(s6Var, org.telegram.ui.Components.kb1.h(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
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
        org.telegram.ui.Components.s6 s6Var = this.d;
        if (z12 != z13) {
            this.h = z12;
            AnimatorSet animatorSet = this.f42506f;
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
            di.i4 i4Var = this.f42504b;
            if (z10) {
                ArrayList arrayList = new ArrayList();
                if (!isEmpty) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(s6Var, View.ALPHA, f11));
                float[] fArr = {dp};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(s6Var, property, fArr));
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
                this.f42506f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f42506f.setInterpolator(org.telegram.ui.Components.ds.h);
                this.f42506f.start();
            } else {
                if (!isEmpty) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                s6Var.setAlpha(f7);
                s6Var.setTranslationY(dp);
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
        s6Var.c(charSequence, z10, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        s6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b6[] b6VarArr = this.f42505c;
        int i12 = 0;
        TextPaint paint = b6VarArr[0].getPaint();
        float dpf2 = AndroidUtilities.dpf2(0.66f);
        if (z10) {
            i10 = 1912602624;
        } else {
            i10 = 0;
        }
        paint.setShadowLayer(dpf2, 0.0f, 1.0f, i10);
        TextPaint paint2 = b6VarArr[1].getPaint();
        float dpf22 = AndroidUtilities.dpf2(0.66f);
        if (z10) {
            i11 = 1912602624;
        } else {
            i11 = 0;
        }
        paint2.setShadowLayer(dpf22, 0.0f, 1.0f, i11);
        org.telegram.ui.Components.r6 drawable = this.d.getDrawable();
        float dpf23 = AndroidUtilities.dpf2(0.66f);
        if (z10) {
            i12 = 1912602624;
        }
        drawable.s(dpf23, 1.0f, i12);
    }

    public final void c(CharSequence charSequence) {
        boolean z10;
        org.telegram.ui.ActionBar.b6[] b6VarArr = this.f42505c;
        boolean z11 = true;
        b6VarArr[1].setAlpha(0.0f);
        b6VarArr[1].setVisibility(8);
        CharSequence text = b6VarArr[0].getText();
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
            org.telegram.ui.ActionBar.b6 b6Var = b6VarArr[0];
            b6Var.R = 0.0f;
            b6Var.b();
        }
        b6VarArr[0].k(charSequence);
        b6VarArr[0].setAlpha(1.0f);
        b6VarArr[0].setTranslationX(0.0f);
        b6VarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z10, boolean z11) {
        boolean equals;
        int i10;
        Property property;
        org.telegram.ui.ActionBar.b6[] b6VarArr = this.f42505c;
        CharSequence text = b6VarArr[0].getText();
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
        org.telegram.ui.ActionBar.b6 b6Var = b6VarArr[1];
        org.telegram.ui.ActionBar.b6 b6Var2 = b6VarArr[0];
        b6Var.getClass();
        b6Var.R = b6Var2.R;
        b6Var.b();
        b6VarArr[1].k(b6VarArr[0].getText());
        b6VarArr[1].setRightPadding((int) this.f42508r);
        org.telegram.ui.ActionBar.b6 b6Var3 = b6VarArr[0];
        b6Var3.R = 0.0f;
        b6Var3.b();
        b6VarArr[0].k(charSequence);
        int dp = AndroidUtilities.dp(8.0f);
        if (z11) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        float f7 = dp * i10;
        b6VarArr[1].setTranslationX(0.0f);
        b6VarArr[1].setTranslationY(0.0f);
        if (z10) {
            b6VarArr[0].setTranslationX(0.0f);
            b6VarArr[0].setTranslationY(-f7);
        } else {
            b6VarArr[0].setTranslationX(-f7);
            b6VarArr[0].setTranslationY(0.0f);
        }
        b6VarArr[0].setAlpha(0.0f);
        b6VarArr[1].setAlpha(1.0f);
        b6VarArr[0].setVisibility(0);
        b6VarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property2 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(b6VarArr[1], property2, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(b6VarArr[0], property2, 1.0f));
        org.telegram.ui.ActionBar.b6 b6Var4 = b6VarArr[1];
        Property property3 = View.TRANSLATION_X;
        Property property4 = View.TRANSLATION_Y;
        if (z10) {
            property = property4;
        } else {
            property = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(b6Var4, property, f7));
        org.telegram.ui.ActionBar.b6 b6Var5 = b6VarArr[0];
        if (z10) {
            property3 = property4;
        }
        arrayList.add(ObjectAnimator.ofFloat(b6Var5, property3, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.e.addListener(new k50(this, 18));
        this.e.setDuration(320L);
        this.e.setInterpolator(org.telegram.ui.Components.ds.h);
        this.e.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.ActionBar.b6[] b6VarArr = this.f42505c;
            b6VarArr[0].invalidate();
            b6VarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f42503a.layout(0, AndroidUtilities.statusBarHeight, i12 - i10, i13 - i11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.f42509s;
        int i14 = AndroidUtilities.displaySize.y;
        if (i13 != i14) {
            this.f42509s = i14;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.f42503a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i12, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
