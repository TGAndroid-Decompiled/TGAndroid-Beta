package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.voip.VoIPService;

public final class k20 extends FrameLayout {

    public float f29900a;

    public float f29901b;

    public boolean f29902c;
    public AnimatorSet d;

    public final j20 f29903e;

    public final gc f29904f;
    public final float h;

    public final n20 f29905n;

    public k20(n20 n20Var, Context context, float f10) {
        super(context);
        this.f29905n = n20Var;
        this.h = f10;
        this.f29903e = new j20(this);
        this.f29904f = new gc(10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        n20 n20Var = this.f29905n;
        if (i12 == n20Var.E && n20Var.F == point.y) {
            return;
        }
        n20Var.E = i12;
        n20Var.F = point.y;
        if (n20Var.G < 0.0f) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
            this.f29905n.G = sharedPreferences.getFloat("relativeX", 1.0f);
            this.f29905n.H = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        n20 n20Var2 = n20.Z;
        if (n20Var2 != null) {
            n20 n20Var3 = this.f29905n;
            float f10 = n20Var3.G;
            float f11 = n20Var3.H;
            float f12 = -AndroidUtilities.dp(36.0f);
            n20Var2.f30825r.x = (int) com.google.android.recaptcha.internal.a.z(AndroidUtilities.displaySize.x - (2.0f * f12), AndroidUtilities.dp(105.0f), f10, f12);
            n20Var2.f30825r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f11);
            n20Var2.h();
            k20 k20Var = n20Var2.f30819a;
            if (k20Var.getParent() != null) {
                n20Var2.f30824n.updateViewLayout(k20Var, n20Var2.f30825r);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (n20.Z == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.f29905n.C);
            n20 n20Var = this.f29905n;
            int[] iArr = n20Var.C;
            int i10 = iArr[0];
            WindowManager.LayoutParams layoutParams = n20Var.f30825r;
            n20Var.M = i10 - layoutParams.x;
            n20Var.N = iArr[1] - layoutParams.y;
            this.f29900a = rawX;
            this.f29901b = rawY;
            System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(this.f29903e, 300L);
            n20 n20Var2 = this.f29905n;
            WindowManager.LayoutParams layoutParams2 = n20Var2.f30825r;
            n20Var2.K = layoutParams2.x;
            n20Var2.L = layoutParams2.y;
            n20Var2.T = true;
            n20Var2.a();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float f10 = rawX - this.f29900a;
                float f11 = rawY - this.f29901b;
                if (!this.f29905n.S) {
                    float f12 = (f11 * f11) + (f10 * f10);
                    float f13 = this.h;
                    if (f12 > f13 * f13) {
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        AndroidUtilities.cancelRunOnUIThread(this.f29903e);
                        n20 n20Var3 = this.f29905n;
                        n20Var3.S = true;
                        n20Var3.f(true);
                        this.f29905n.e(false);
                        this.f29900a = rawX;
                        this.f29901b = rawY;
                        f10 = 0.0f;
                        f11 = 0.0f;
                    }
                }
                n20 n20Var4 = this.f29905n;
                if (!n20Var4.S) {
                    return true;
                }
                n20Var4.K += f10;
                n20Var4.L += f11;
                this.f29900a = rawX;
                this.f29901b = rawY;
                n20Var4.i();
                float measuredWidth = (getMeasuredWidth() / 2.0f) + this.f29905n.K;
                float measuredHeight = (getMeasuredHeight() / 2.0f) + this.f29905n.L;
                n20 n20Var5 = this.f29905n;
                float measuredWidth2 = (n20Var5.f30820b.getMeasuredWidth() / 2.0f) + (n20Var5.J - n20Var5.M);
                n20 n20Var6 = this.f29905n;
                float measuredHeight2 = (n20Var6.f30820b.getMeasuredHeight() / 2.0f) + (n20Var6.I - n20Var6.N);
                float f14 = measuredWidth - measuredWidth2;
                float f15 = measuredHeight - measuredHeight2;
                float f16 = (f15 * f15) + (f14 * f14);
                if (f16 < AndroidUtilities.dp(80.0f) * AndroidUtilities.dp(80.0f)) {
                    this.f29905n.Q.setRemoveAngle((((measuredWidth <= measuredWidth2 || measuredHeight >= measuredHeight2) && (measuredWidth >= measuredWidth2 || measuredHeight >= measuredHeight2)) ? 90.0d : 270.0d) - Math.toDegrees(Math.atan(f14 / f15)));
                    z10 = f16 < ((float) (AndroidUtilities.dp(50.0f) * AndroidUtilities.dp(50.0f)));
                    z11 = true;
                } else {
                    z10 = false;
                    z11 = false;
                }
                n20 n20Var7 = this.f29905n;
                if (!n20Var7.B && n20Var7.W != z10) {
                    n20Var7.W = z10;
                    ValueAnimator valueAnimator = n20Var7.Y;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        n20Var7.Y.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(n20Var7.X, z10 ? 1.0f : 0.0f);
                    n20Var7.Y = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new e6(n20Var7, 25));
                    n20Var7.Y.addListener(new org.telegram.ui.go(11, n20Var7, z10));
                    n20Var7.Y.setDuration(250L);
                    n20Var7.Y.setInterpolator(er.f28122f);
                    n20Var7.Y.start();
                }
                n20 n20Var8 = this.f29905n;
                t20 t20Var = n20Var8.Q;
                if (n20Var8.f30829y != z11) {
                    n20Var8.f30829y = z11;
                    n20Var8.f30821c.invalidate();
                    if (!n20Var8.B) {
                        n20Var8.v.N(z11 ? 33 : 0);
                        n20Var8.R.d();
                    }
                    if (z11) {
                        try {
                            t20Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (t20Var.f32639s != z11) {
                    t20Var.invalidate();
                }
                t20Var.f32639s = z11;
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        AndroidUtilities.cancelRunOnUIThread(this.f29904f);
        AndroidUtilities.cancelRunOnUIThread(this.f29903e);
        n20 n20Var9 = this.f29905n;
        if (!n20Var9.f30829y) {
            n20Var9.T = false;
            n20Var9.a();
            if (this.f29902c) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                this.f29902c = false;
            } else {
                if (motionEvent.getAction() == 1 && !this.f29905n.S) {
                    if (VoIPService.getSharedInstance() == null) {
                        return false;
                    }
                    n20 n20Var10 = this.f29905n;
                    n20Var10.e(!n20Var10.f30827w);
                    return false;
                }
                z12 = false;
            }
            if (parent != null && this.f29905n.S) {
                parent.requestDisallowInterceptTouchEvent(z12);
                Point point = AndroidUtilities.displaySize;
                int i11 = point.x;
                int i12 = point.y;
                float f17 = this.f29905n.f30825r.x;
                float measuredWidth3 = getMeasuredWidth() + f17;
                float measuredHeight3 = this.f29905n.f30825r.y;
                float measuredHeight4 = getMeasuredHeight() + measuredHeight3;
                this.d = new AnimatorSet();
                float f18 = -AndroidUtilities.dp(36.0f);
                if (f17 < f18) {
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f29905n.f30825r.x, f18);
                    valueAnimatorOfFloat2.addUpdateListener(this.f29905n.O);
                    this.d.playTogether(valueAnimatorOfFloat2);
                    f17 = f18;
                } else if (measuredWidth3 > i11 - f18) {
                    float f19 = this.f29905n.f30825r.x;
                    float measuredWidth4 = (i11 - getMeasuredWidth()) - f18;
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f19, measuredWidth4);
                    valueAnimatorOfFloat3.addUpdateListener(this.f29905n.O);
                    this.d.playTogether(valueAnimatorOfFloat3);
                    f17 = measuredWidth4;
                }
                int iDp = AndroidUtilities.dp(36.0f) + i12;
                if (measuredHeight3 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                    float f20 = this.f29905n.f30825r.y;
                    measuredHeight3 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f20, measuredHeight3);
                    valueAnimatorOfFloat4.addUpdateListener(this.f29905n.P);
                    this.d.playTogether(valueAnimatorOfFloat4);
                } else if (measuredHeight4 > iDp) {
                    float f21 = this.f29905n.f30825r.y;
                    measuredHeight3 = iDp - getMeasuredHeight();
                    ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(f21, measuredHeight3);
                    valueAnimatorOfFloat5.addUpdateListener(this.f29905n.P);
                    this.d.playTogether(valueAnimatorOfFloat5);
                }
                this.d.setDuration(150L).setInterpolator(er.f28122f);
                this.d.start();
                n20 n20Var11 = this.f29905n;
                if (n20Var11.G >= 0.0f) {
                    float[] fArr = n20Var11.D;
                    Point point2 = AndroidUtilities.displaySize;
                    float f22 = point2.x;
                    float f23 = point2.y;
                    float f24 = -AndroidUtilities.dp(36.0f);
                    fArr[0] = (f17 - f24) / ((f22 - (f24 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr[1] = measuredHeight3 / (f23 - AndroidUtilities.dp(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    n20 n20Var12 = this.f29905n;
                    float f25 = n20Var12.D[0];
                    n20Var12.G = f25;
                    SharedPreferences.Editor editorPutFloat = editorEdit.putFloat("relativeX", f25);
                    n20 n20Var13 = this.f29905n;
                    float f26 = n20Var13.D[1];
                    n20Var13.H = f26;
                    editorPutFloat.putFloat("relativeY", f26).apply();
                }
            }
            n20 n20Var14 = this.f29905n;
            n20Var14.S = false;
            n20Var14.f(false);
            return true;
        }
        if (this.f29902c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.f29902c = false;
        n20 n20Var15 = this.f29905n;
        ri0 ri0Var = n20Var15.R;
        oi0 oi0Var = n20Var15.v;
        ag.p1 p1Var = n20Var15.f30820b;
        k20 k20Var = n20Var15.f30819a;
        ag.t0 t0Var = n20Var15.f30821c;
        n20 n20Var16 = n20.Z;
        if (n20Var16 == null) {
            return false;
        }
        n20Var15.B = true;
        n20.f30818a0 = true;
        n20Var15.Q.G = true;
        n20Var16.e(false);
        float measuredWidth5 = (k20Var.getMeasuredWidth() / 2.0f) + n20Var15.f30825r.x;
        float measuredHeight5 = (k20Var.getMeasuredHeight() / 2.0f) + n20Var15.f30825r.y;
        float measuredWidth6 = ((p1Var.getMeasuredWidth() / 2.0f) + (n20Var15.J - n20Var15.M)) - measuredWidth5;
        float measuredHeight6 = ((p1Var.getMeasuredHeight() / 2.0f) + (n20Var15.I - n20Var15.N)) - measuredHeight5;
        n20 n20Var17 = n20.Z;
        WindowManager windowManager = n20Var17.f30824n;
        k20 k20Var2 = n20Var17.f30819a;
        ag.p1 p1Var2 = n20Var17.f30820b;
        FrameLayout frameLayout = n20Var17.d;
        org.telegram.ui.u7 u7Var = n20Var17.f30822e;
        n20Var15.d();
        n20.Z = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i13 = oi0Var.X;
        long jP = i13 < 33 ? (long) (((1.0f - (i13 / 33.0f)) * oi0Var.p()) / 2.0f) : 0L;
        float f27 = n20Var15.f30825r.x;
        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(f27, measuredWidth6 + f27);
        valueAnimatorOfFloat6.addUpdateListener(n20Var15.O);
        ValueAnimator duration = valueAnimatorOfFloat6.setDuration(250L);
        er erVar = er.f28122f;
        duration.setInterpolator(erVar);
        animatorSet.playTogether(valueAnimatorOfFloat6);
        float f28 = n20Var15.f30825r.y;
        ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(f28, (f28 + measuredHeight6) - AndroidUtilities.dp(30.0f), n20Var15.f30825r.y + measuredHeight6);
        valueAnimatorOfFloat7.addUpdateListener(n20Var15.P);
        valueAnimatorOfFloat7.setDuration(250L).setInterpolator(erVar);
        animatorSet.playTogether(valueAnimatorOfFloat7);
        float[] fArr2 = {k20Var2.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        animatorSet.playTogether(ObjectAnimator.ofFloat(k20Var2, (Property<k20, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {k20Var2.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(k20Var2, (Property<k20, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(k20Var2, (Property<k20, Float>) property3, 1.0f, 0.0f);
        float f29 = 350L;
        objectAnimatorOfFloat.setStartDelay((long) (f29 * 0.7f));
        objectAnimatorOfFloat.setDuration((long) (f29 * 0.3f));
        animatorSet.playTogether(objectAnimatorOfFloat);
        AndroidUtilities.runOnUIThread(new gc(9), 370L);
        long j10 = jP + 530;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property, 1.0f, 1.05f);
        objectAnimatorOfFloat2.setDuration(j10);
        er erVar2 = er.f28125j;
        objectAnimatorOfFloat2.setInterpolator(erVar2);
        animatorSet.playTogether(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property2, 1.0f, 1.05f);
        objectAnimatorOfFloat3.setDuration(j10);
        objectAnimatorOfFloat3.setInterpolator(erVar2);
        animatorSet.playTogether(objectAnimatorOfFloat3);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property, 1.0f, 0.3f);
        objectAnimatorOfFloat4.setStartDelay(j10);
        objectAnimatorOfFloat4.setDuration(350L);
        er erVar3 = er.h;
        objectAnimatorOfFloat4.setInterpolator(erVar3);
        animatorSet.playTogether(objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property2, 1.0f, 0.3f);
        objectAnimatorOfFloat5.setStartDelay(j10);
        objectAnimatorOfFloat5.setDuration(350L);
        objectAnimatorOfFloat5.setInterpolator(erVar3);
        animatorSet.playTogether(objectAnimatorOfFloat5);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
        objectAnimatorOfFloat6.setStartDelay(j10);
        objectAnimatorOfFloat6.setDuration(350L);
        objectAnimatorOfFloat6.setInterpolator(erVar3);
        animatorSet.playTogether(objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property3, 1.0f, 0.0f);
        objectAnimatorOfFloat7.setStartDelay(j10);
        objectAnimatorOfFloat7.setDuration(350L);
        objectAnimatorOfFloat7.setInterpolator(erVar3);
        animatorSet.playTogether(objectAnimatorOfFloat7);
        animatorSet.addListener(new m20(n20Var15, k20Var2, p1Var2, windowManager, frameLayout, u7Var));
        animatorSet.start();
        oi0Var.N(66);
        ri0Var.i();
        ri0Var.d();
        return false;
    }
}
