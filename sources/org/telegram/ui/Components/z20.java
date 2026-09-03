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
public final class z20 extends FrameLayout {
    public float f31233a;
    public float f31234b;
    public boolean f31235c;
    public AnimatorSet d;
    public final y20 e;
    public final mc f31236f;
    public final float h;
    public final b30 f31237n;

    public z20(b30 b30Var, Context context, float f10) {
        super(context);
        this.f31237n = b30Var;
        this.h = f10;
        this.e = new y20(this);
        this.f31236f = new mc(9);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        b30 b30Var = this.f31237n;
        if (i12 != b30Var.F || b30Var.G != point.y) {
            b30Var.F = i12;
            b30Var.G = point.y;
            if (b30Var.H < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f31237n.H = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f31237n.I = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            b30 b30Var2 = b30.f23530a0;
            if (b30Var2 != null) {
                b30 b30Var3 = this.f31237n;
                float f10 = b30Var3.H;
                float f11 = b30Var3.I;
                float f12 = -AndroidUtilities.dp(36.0f);
                b30Var2.f23537r.x = (int) e2.c.w(AndroidUtilities.displaySize.x - (2.0f * f12), AndroidUtilities.dp(105.0f), f10, f12);
                b30Var2.f23537r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f11);
                b30Var2.h();
                z20 z20Var = b30Var2.f23532a;
                if (z20Var.getParent() != null) {
                    b30Var2.f23536n.updateViewLayout(z20Var, b30Var2.f23537r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int[] iArr;
        b30 b30Var;
        z20 z20Var;
        long j10;
        b30 b30Var2;
        b30 b30Var3;
        boolean z4;
        boolean z10;
        float f10;
        double d;
        boolean z11 = false;
        int i10 = 0;
        if (b30.f23530a0 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return true;
                    }
                } else {
                    float f11 = rawX - this.f31233a;
                    float f12 = rawY - this.f31234b;
                    if (!this.f31237n.T) {
                        float f13 = (f12 * f12) + (f11 * f11);
                        float f14 = this.h;
                        if (f13 > f14 * f14) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            AndroidUtilities.cancelRunOnUIThread(this.e);
                            b30 b30Var4 = this.f31237n;
                            b30Var4.T = true;
                            b30Var4.f(true);
                            this.f31237n.e(false);
                            this.f31233a = rawX;
                            this.f31234b = rawY;
                            f11 = 0.0f;
                            f12 = 0.0f;
                        }
                    }
                    b30 b30Var5 = this.f31237n;
                    if (!b30Var5.T) {
                        return true;
                    }
                    b30Var5.L += f11;
                    b30Var5.M += f12;
                    this.f31233a = rawX;
                    this.f31234b = rawY;
                    b30Var5.i();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.f31237n.L;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.f31237n.M;
                    float measuredWidth2 = (b30Var2.f23533b.getMeasuredWidth() / 2.0f) + (b30Var2.K - this.f31237n.N);
                    float measuredHeight2 = (b30Var3.f23533b.getMeasuredHeight() / 2.0f) + (b30Var3.J - this.f31237n.O);
                    float f15 = measuredWidth - measuredWidth2;
                    float f16 = measuredHeight - measuredHeight2;
                    float f17 = (f16 * f16) + (f15 * f15);
                    if (f17 < AndroidUtilities.dp(80.0f) * AndroidUtilities.dp(80.0f)) {
                        double degrees = Math.toDegrees(Math.atan(f15 / f16));
                        if ((measuredWidth > measuredWidth2 && measuredHeight < measuredHeight2) || (measuredWidth < measuredWidth2 && measuredHeight < measuredHeight2)) {
                            d = 270.0d;
                        } else {
                            d = 90.0d;
                        }
                        this.f31237n.R.setRemoveAngle(d - degrees);
                        if (f17 < AndroidUtilities.dp(50.0f) * AndroidUtilities.dp(50.0f)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z10 = true;
                    } else {
                        z4 = false;
                        z10 = false;
                    }
                    b30 b30Var6 = this.f31237n;
                    if (!b30Var6.C && b30Var6.X != z4) {
                        b30Var6.X = z4;
                        ValueAnimator valueAnimator = b30Var6.Z;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            b30Var6.Z.cancel();
                        }
                        float f18 = b30Var6.Y;
                        if (z4) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f18, f10);
                        b30Var6.Z = ofFloat;
                        ofFloat.addUpdateListener(new f6(b30Var6, 25));
                        b30Var6.Z.addListener(new m00(2, b30Var6, z4));
                        b30Var6.Z.setDuration(250L);
                        b30Var6.Z.setInterpolator(mr.f27122f);
                        b30Var6.Z.start();
                    }
                    b30 b30Var7 = this.f31237n;
                    h30 h30Var = b30Var7.R;
                    if (b30Var7.f23541y != z10) {
                        b30Var7.f23541y = z10;
                        b30Var7.f23534c.invalidate();
                        if (!b30Var7.C) {
                            gj0 gj0Var = b30Var7.v;
                            if (z10) {
                                i10 = 33;
                            }
                            gj0Var.N(i10);
                            b30Var7.S.d();
                        }
                        if (z10) {
                            try {
                                h30Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    if (h30Var.f25306s != z10) {
                        h30Var.invalidate();
                    }
                    h30Var.f25306s = z10;
                    return true;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(this.f31236f);
            AndroidUtilities.cancelRunOnUIThread(this.e);
            b30 b30Var8 = this.f31237n;
            if (b30Var8.f23541y) {
                if (this.f31235c && VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                }
                this.f31235c = false;
                b30 b30Var9 = this.f31237n;
                jj0 jj0Var = b30Var9.S;
                gj0 gj0Var2 = b30Var9.v;
                dg.u2 u2Var = b30Var9.f23533b;
                z20 z20Var2 = b30Var9.f23532a;
                eg.i0 i0Var = b30Var9.f23534c;
                b30 b30Var10 = b30.f23530a0;
                if (b30Var10 == null) {
                    return false;
                }
                b30Var9.C = true;
                b30.f23531b0 = true;
                b30Var9.R.H = true;
                b30Var10.e(false);
                float measuredWidth3 = (z20Var2.getMeasuredWidth() / 2.0f) + b30Var9.f23537r.x;
                float measuredWidth4 = ((u2Var.getMeasuredWidth() / 2.0f) + (b30Var9.K - b30Var9.N)) - measuredWidth3;
                float measuredHeight3 = ((u2Var.getMeasuredHeight() / 2.0f) + (b30Var9.J - b30Var9.O)) - ((z20Var2.getMeasuredHeight() / 2.0f) + b30Var9.f23537r.y);
                b30 b30Var11 = b30.f23530a0;
                WindowManager windowManager = b30Var11.f23536n;
                z20 z20Var3 = b30Var11.f23532a;
                dg.u2 u2Var2 = b30Var11.f23533b;
                FrameLayout frameLayout = b30Var11.d;
                org.telegram.ui.y7 y7Var = b30Var11.e;
                b30Var9.d();
                b30.f23530a0 = null;
                AnimatorSet animatorSet = new AnimatorSet();
                int i11 = gj0Var2.Y;
                if (i11 < 33) {
                    z20Var = z20Var3;
                    j10 = ((1.0f - (i11 / 33.0f)) * ((float) gj0Var2.p())) / 2.0f;
                } else {
                    z20Var = z20Var3;
                    j10 = 0;
                }
                float f19 = b30Var9.f23537r.x;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f19, measuredWidth4 + f19);
                ofFloat2.addUpdateListener(b30Var9.P);
                ValueAnimator duration = ofFloat2.setDuration(250L);
                mr mrVar = mr.f27122f;
                duration.setInterpolator(mrVar);
                animatorSet.playTogether(ofFloat2);
                float f20 = b30Var9.f23537r.y;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f20, (f20 + measuredHeight3) - AndroidUtilities.dp(30.0f), b30Var9.f23537r.y + measuredHeight3);
                ofFloat3.addUpdateListener(b30Var9.Q);
                ofFloat3.setDuration(250L).setInterpolator(mrVar);
                animatorSet.playTogether(ofFloat3);
                float[] fArr = {z20Var.getScaleX(), 0.1f};
                Property property = View.SCALE_X;
                z20 z20Var4 = z20Var;
                animatorSet.playTogether(ObjectAnimator.ofFloat(z20Var4, property, fArr).setDuration(180L));
                float[] fArr2 = {z20Var4.getScaleY(), 0.1f};
                Property property2 = View.SCALE_Y;
                animatorSet.playTogether(ObjectAnimator.ofFloat(z20Var4, property2, fArr2).setDuration(180L));
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(z20Var4, property3, 1.0f, 0.0f);
                float f21 = (float) 350;
                ofFloat4.setStartDelay(f21 * 0.7f);
                ofFloat4.setDuration(f21 * 0.3f);
                animatorSet.playTogether(ofFloat4);
                AndroidUtilities.runOnUIThread(new mc(8), 370L);
                long j11 = j10 + 530;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(i0Var, property, 1.0f, 1.05f);
                ofFloat5.setDuration(j11);
                mr mrVar2 = mr.f27125j;
                ofFloat5.setInterpolator(mrVar2);
                animatorSet.playTogether(ofFloat5);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(i0Var, property2, 1.0f, 1.05f);
                ofFloat6.setDuration(j11);
                ofFloat6.setInterpolator(mrVar2);
                animatorSet.playTogether(ofFloat6);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(i0Var, property, 1.0f, 0.3f);
                ofFloat7.setStartDelay(j11);
                ofFloat7.setDuration(350L);
                mr mrVar3 = mr.h;
                ofFloat7.setInterpolator(mrVar3);
                animatorSet.playTogether(ofFloat7);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(i0Var, property2, 1.0f, 0.3f);
                ofFloat8.setStartDelay(j11);
                ofFloat8.setDuration(350L);
                ofFloat8.setInterpolator(mrVar3);
                animatorSet.playTogether(ofFloat8);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(i0Var, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
                ofFloat9.setStartDelay(j11);
                ofFloat9.setDuration(350L);
                ofFloat9.setInterpolator(mrVar3);
                animatorSet.playTogether(ofFloat9);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(i0Var, property3, 1.0f, 0.0f);
                ofFloat10.setStartDelay(j11);
                ofFloat10.setDuration(350L);
                ofFloat10.setInterpolator(mrVar3);
                animatorSet.playTogether(ofFloat10);
                animatorSet.addListener(new a30(b30Var9, z20Var4, u2Var2, windowManager, frameLayout, y7Var));
                animatorSet.start();
                gj0Var2.N(66);
                jj0Var.i();
                jj0Var.d();
                return false;
            }
            b30Var8.U = false;
            b30Var8.a();
            if (this.f31235c) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                this.f31235c = false;
            } else if (motionEvent.getAction() == 1 && !this.f31237n.T) {
                if (VoIPService.getSharedInstance() != null) {
                    this.f31237n.e(!b30Var.f23539w);
                    return false;
                }
                return false;
            } else {
                z11 = false;
            }
            if (parent != null && this.f31237n.T) {
                parent.requestDisallowInterceptTouchEvent(z11);
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x;
                int i13 = point.y;
                float f22 = this.f31237n.f23537r.x;
                float measuredWidth5 = getMeasuredWidth() + f22;
                float f23 = this.f31237n.f23537r.y;
                float measuredHeight4 = getMeasuredHeight() + f23;
                this.d = new AnimatorSet();
                float f24 = -AndroidUtilities.dp(36.0f);
                if (f22 < f24) {
                    ValueAnimator ofFloat11 = ValueAnimator.ofFloat(this.f31237n.f23537r.x, f24);
                    ofFloat11.addUpdateListener(this.f31237n.P);
                    this.d.playTogether(ofFloat11);
                    f22 = f24;
                } else if (measuredWidth5 > i12 - f24) {
                    float measuredWidth6 = (i12 - getMeasuredWidth()) - f24;
                    ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f31237n.f23537r.x, measuredWidth6);
                    ofFloat12.addUpdateListener(this.f31237n.P);
                    this.d.playTogether(ofFloat12);
                    f22 = measuredWidth6;
                }
                int dp = AndroidUtilities.dp(36.0f) + i13;
                if (f23 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                    f23 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                    ValueAnimator ofFloat13 = ValueAnimator.ofFloat(this.f31237n.f23537r.y, f23);
                    ofFloat13.addUpdateListener(this.f31237n.Q);
                    this.d.playTogether(ofFloat13);
                } else if (measuredHeight4 > dp) {
                    f23 = dp - getMeasuredHeight();
                    ValueAnimator ofFloat14 = ValueAnimator.ofFloat(this.f31237n.f23537r.y, f23);
                    ofFloat14.addUpdateListener(this.f31237n.Q);
                    this.d.playTogether(ofFloat14);
                }
                this.d.setDuration(150L).setInterpolator(mr.f27122f);
                this.d.start();
                b30 b30Var12 = this.f31237n;
                if (b30Var12.H >= 0.0f) {
                    float[] fArr3 = b30Var12.E;
                    Point point2 = AndroidUtilities.displaySize;
                    float f25 = -AndroidUtilities.dp(36.0f);
                    fArr3[0] = (f22 - f25) / ((point2.x - (f25 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr3[1] = f23 / (point2.y - AndroidUtilities.dp(105.0f));
                    fArr3[0] = Math.min(1.0f, Math.max(0.0f, fArr3[0]));
                    fArr3[1] = Math.min(1.0f, Math.max(0.0f, fArr3[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    b30 b30Var13 = this.f31237n;
                    float f26 = b30Var13.E[0];
                    b30Var13.H = f26;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f26);
                    b30 b30Var14 = this.f31237n;
                    float f27 = b30Var14.E[1];
                    b30Var14.I = f27;
                    putFloat.putFloat("relativeY", f27).apply();
                }
            }
            b30 b30Var15 = this.f31237n;
            b30Var15.T = false;
            b30Var15.f(false);
            return true;
        }
        getLocationOnScreen(this.f31237n.D);
        b30 b30Var16 = this.f31237n;
        int i14 = b30Var16.D[0];
        WindowManager.LayoutParams layoutParams = b30Var16.f23537r;
        b30Var16.N = i14 - layoutParams.x;
        b30Var16.O = iArr[1] - layoutParams.y;
        this.f31233a = rawX;
        this.f31234b = rawY;
        System.currentTimeMillis();
        AndroidUtilities.runOnUIThread(this.e, 300L);
        b30 b30Var17 = this.f31237n;
        WindowManager.LayoutParams layoutParams2 = b30Var17.f23537r;
        b30Var17.L = layoutParams2.x;
        b30Var17.M = layoutParams2.y;
        b30Var17.U = true;
        b30Var17.a();
        return true;
    }
}
