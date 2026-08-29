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
public final class t20 extends FrameLayout {
    public float f32823a;
    public float f32824b;
    public boolean f32825c;
    public AnimatorSet d;
    public final s20 f32826e;
    public final g5 f32827f;
    public final float h;
    public final w20 f32828n;

    public t20(w20 w20Var, Context context, float f9) {
        super(context);
        this.f32828n = w20Var;
        this.h = f9;
        this.f32826e = new s20(this);
        this.f32827f = new g5(13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        w20 w20Var = this.f32828n;
        if (i12 != w20Var.E || w20Var.F != point.y) {
            w20Var.E = i12;
            w20Var.F = point.y;
            if (w20Var.G < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f32828n.G = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f32828n.H = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            w20 w20Var2 = w20.Z;
            if (w20Var2 != null) {
                w20 w20Var3 = this.f32828n;
                float f9 = w20Var3.G;
                float f10 = w20Var3.H;
                float f11 = -AndroidUtilities.dp(36.0f);
                w20Var2.f34281r.x = (int) com.google.android.recaptcha.internal.a.z(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f9, f11);
                w20Var2.f34281r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
                w20Var2.h();
                t20 t20Var = w20Var2.f34275a;
                if (t20Var.getParent() != null) {
                    w20Var2.f34280n.updateViewLayout(t20Var, w20Var2.f34281r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int[] iArr;
        w20 w20Var;
        t20 t20Var;
        long j10;
        w20 w20Var2;
        w20 w20Var3;
        boolean z10;
        boolean z11;
        float f9;
        double d;
        boolean z12 = false;
        int i10 = 0;
        if (w20.Z == null) {
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
                    float f10 = rawX - this.f32823a;
                    float f11 = rawY - this.f32824b;
                    if (!this.f32828n.S) {
                        float f12 = (f11 * f11) + (f10 * f10);
                        float f13 = this.h;
                        if (f12 > f13 * f13) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            AndroidUtilities.cancelRunOnUIThread(this.f32826e);
                            w20 w20Var4 = this.f32828n;
                            w20Var4.S = true;
                            w20Var4.f(true);
                            this.f32828n.e(false);
                            this.f32823a = rawX;
                            this.f32824b = rawY;
                            f10 = 0.0f;
                            f11 = 0.0f;
                        }
                    }
                    w20 w20Var5 = this.f32828n;
                    if (!w20Var5.S) {
                        return true;
                    }
                    w20Var5.K += f10;
                    w20Var5.L += f11;
                    this.f32823a = rawX;
                    this.f32824b = rawY;
                    w20Var5.i();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.f32828n.K;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.f32828n.L;
                    float measuredWidth2 = (w20Var2.f34276b.getMeasuredWidth() / 2.0f) + (w20Var2.J - this.f32828n.M);
                    float measuredHeight2 = (w20Var3.f34276b.getMeasuredHeight() / 2.0f) + (w20Var3.I - this.f32828n.N);
                    float f14 = measuredWidth - measuredWidth2;
                    float f15 = measuredHeight - measuredHeight2;
                    float f16 = (f15 * f15) + (f14 * f14);
                    if (f16 < AndroidUtilities.dp(80.0f) * AndroidUtilities.dp(80.0f)) {
                        double degrees = Math.toDegrees(Math.atan(f14 / f15));
                        if ((measuredWidth > measuredWidth2 && measuredHeight < measuredHeight2) || (measuredWidth < measuredWidth2 && measuredHeight < measuredHeight2)) {
                            d = 270.0d;
                        } else {
                            d = 90.0d;
                        }
                        this.f32828n.Q.setRemoveAngle(d - degrees);
                        if (f16 < AndroidUtilities.dp(50.0f) * AndroidUtilities.dp(50.0f)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = true;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    w20 w20Var6 = this.f32828n;
                    if (!w20Var6.B && w20Var6.W != z10) {
                        w20Var6.W = z10;
                        ValueAnimator valueAnimator = w20Var6.Y;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            w20Var6.Y.cancel();
                        }
                        float f17 = w20Var6.X;
                        if (z10) {
                            f9 = 1.0f;
                        } else {
                            f9 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f9);
                        w20Var6.Y = ofFloat;
                        ofFloat.addUpdateListener(new j6(w20Var6, 25));
                        w20Var6.Y.addListener(new z9(10, w20Var6, z10));
                        w20Var6.Y.setDuration(250L);
                        w20Var6.Y.setInterpolator(jr.f29800f);
                        w20Var6.Y.start();
                    }
                    w20 w20Var7 = this.f32828n;
                    c30 c30Var = w20Var7.Q;
                    if (w20Var7.f34285y != z11) {
                        w20Var7.f34285y = z11;
                        w20Var7.f34277c.invalidate();
                        if (!w20Var7.B) {
                            xi0 xi0Var = w20Var7.v;
                            if (z11) {
                                i10 = 33;
                            }
                            xi0Var.N(i10);
                            w20Var7.R.d();
                        }
                        if (z11) {
                            try {
                                c30Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    if (c30Var.f27301s != z11) {
                        c30Var.invalidate();
                    }
                    c30Var.f27301s = z11;
                    return true;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(this.f32827f);
            AndroidUtilities.cancelRunOnUIThread(this.f32826e);
            w20 w20Var8 = this.f32828n;
            if (w20Var8.f34285y) {
                if (this.f32825c && VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                }
                this.f32825c = false;
                w20 w20Var9 = this.f32828n;
                aj0 aj0Var = w20Var9.R;
                xi0 xi0Var2 = w20Var9.v;
                bg.x2 x2Var = w20Var9.f34276b;
                t20 t20Var2 = w20Var9.f34275a;
                cg.i0 i0Var = w20Var9.f34277c;
                w20 w20Var10 = w20.Z;
                if (w20Var10 == null) {
                    return false;
                }
                w20Var9.B = true;
                w20.f34274a0 = true;
                w20Var9.Q.G = true;
                w20Var10.e(false);
                float measuredWidth3 = (t20Var2.getMeasuredWidth() / 2.0f) + w20Var9.f34281r.x;
                float measuredWidth4 = ((x2Var.getMeasuredWidth() / 2.0f) + (w20Var9.J - w20Var9.M)) - measuredWidth3;
                float measuredHeight3 = ((x2Var.getMeasuredHeight() / 2.0f) + (w20Var9.I - w20Var9.N)) - ((t20Var2.getMeasuredHeight() / 2.0f) + w20Var9.f34281r.y);
                w20 w20Var11 = w20.Z;
                WindowManager windowManager = w20Var11.f34280n;
                t20 t20Var3 = w20Var11.f34275a;
                bg.x2 x2Var2 = w20Var11.f34276b;
                FrameLayout frameLayout = w20Var11.d;
                org.telegram.ui.s7 s7Var = w20Var11.f34278e;
                w20Var9.d();
                w20.Z = null;
                AnimatorSet animatorSet = new AnimatorSet();
                int i11 = xi0Var2.X;
                if (i11 < 33) {
                    t20Var = t20Var3;
                    j10 = ((1.0f - (i11 / 33.0f)) * ((float) xi0Var2.p())) / 2.0f;
                } else {
                    t20Var = t20Var3;
                    j10 = 0;
                }
                float f18 = w20Var9.f34281r.x;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f18, measuredWidth4 + f18);
                ofFloat2.addUpdateListener(w20Var9.O);
                ValueAnimator duration = ofFloat2.setDuration(250L);
                jr jrVar = jr.f29800f;
                duration.setInterpolator(jrVar);
                animatorSet.playTogether(ofFloat2);
                float f19 = w20Var9.f34281r.y;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f19, (f19 + measuredHeight3) - AndroidUtilities.dp(30.0f), w20Var9.f34281r.y + measuredHeight3);
                ofFloat3.addUpdateListener(w20Var9.P);
                ofFloat3.setDuration(250L).setInterpolator(jrVar);
                animatorSet.playTogether(ofFloat3);
                float[] fArr = {t20Var.getScaleX(), 0.1f};
                Property property = View.SCALE_X;
                t20 t20Var4 = t20Var;
                animatorSet.playTogether(ObjectAnimator.ofFloat(t20Var4, property, fArr).setDuration(180L));
                float[] fArr2 = {t20Var4.getScaleY(), 0.1f};
                Property property2 = View.SCALE_Y;
                animatorSet.playTogether(ObjectAnimator.ofFloat(t20Var4, property2, fArr2).setDuration(180L));
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(t20Var4, property3, 1.0f, 0.0f);
                float f20 = (float) 350;
                ofFloat4.setStartDelay(f20 * 0.7f);
                ofFloat4.setDuration(f20 * 0.3f);
                animatorSet.playTogether(ofFloat4);
                AndroidUtilities.runOnUIThread(new g5(12), 370L);
                long j11 = j10 + 530;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(i0Var, property, 1.0f, 1.05f);
                ofFloat5.setDuration(j11);
                jr jrVar2 = jr.f29803j;
                ofFloat5.setInterpolator(jrVar2);
                animatorSet.playTogether(ofFloat5);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(i0Var, property2, 1.0f, 1.05f);
                ofFloat6.setDuration(j11);
                ofFloat6.setInterpolator(jrVar2);
                animatorSet.playTogether(ofFloat6);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(i0Var, property, 1.0f, 0.3f);
                ofFloat7.setStartDelay(j11);
                ofFloat7.setDuration(350L);
                jr jrVar3 = jr.h;
                ofFloat7.setInterpolator(jrVar3);
                animatorSet.playTogether(ofFloat7);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(i0Var, property2, 1.0f, 0.3f);
                ofFloat8.setStartDelay(j11);
                ofFloat8.setDuration(350L);
                ofFloat8.setInterpolator(jrVar3);
                animatorSet.playTogether(ofFloat8);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(i0Var, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
                ofFloat9.setStartDelay(j11);
                ofFloat9.setDuration(350L);
                ofFloat9.setInterpolator(jrVar3);
                animatorSet.playTogether(ofFloat9);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(i0Var, property3, 1.0f, 0.0f);
                ofFloat10.setStartDelay(j11);
                ofFloat10.setDuration(350L);
                ofFloat10.setInterpolator(jrVar3);
                animatorSet.playTogether(ofFloat10);
                animatorSet.addListener(new v20(w20Var9, t20Var4, x2Var2, windowManager, frameLayout, s7Var));
                animatorSet.start();
                xi0Var2.N(66);
                aj0Var.i();
                aj0Var.d();
                return false;
            }
            w20Var8.T = false;
            w20Var8.a();
            if (this.f32825c) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                this.f32825c = false;
            } else if (motionEvent.getAction() == 1 && !this.f32828n.S) {
                if (VoIPService.getSharedInstance() != null) {
                    this.f32828n.e(!w20Var.f34283w);
                    return false;
                }
                return false;
            } else {
                z12 = false;
            }
            if (parent != null && this.f32828n.S) {
                parent.requestDisallowInterceptTouchEvent(z12);
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x;
                int i13 = point.y;
                float f21 = this.f32828n.f34281r.x;
                float measuredWidth5 = getMeasuredWidth() + f21;
                float f22 = this.f32828n.f34281r.y;
                float measuredHeight4 = getMeasuredHeight() + f22;
                this.d = new AnimatorSet();
                float f23 = -AndroidUtilities.dp(36.0f);
                if (f21 < f23) {
                    ValueAnimator ofFloat11 = ValueAnimator.ofFloat(this.f32828n.f34281r.x, f23);
                    ofFloat11.addUpdateListener(this.f32828n.O);
                    this.d.playTogether(ofFloat11);
                    f21 = f23;
                } else if (measuredWidth5 > i12 - f23) {
                    float measuredWidth6 = (i12 - getMeasuredWidth()) - f23;
                    ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f32828n.f34281r.x, measuredWidth6);
                    ofFloat12.addUpdateListener(this.f32828n.O);
                    this.d.playTogether(ofFloat12);
                    f21 = measuredWidth6;
                }
                int dp = AndroidUtilities.dp(36.0f) + i13;
                if (f22 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                    f22 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                    ValueAnimator ofFloat13 = ValueAnimator.ofFloat(this.f32828n.f34281r.y, f22);
                    ofFloat13.addUpdateListener(this.f32828n.P);
                    this.d.playTogether(ofFloat13);
                } else if (measuredHeight4 > dp) {
                    f22 = dp - getMeasuredHeight();
                    ValueAnimator ofFloat14 = ValueAnimator.ofFloat(this.f32828n.f34281r.y, f22);
                    ofFloat14.addUpdateListener(this.f32828n.P);
                    this.d.playTogether(ofFloat14);
                }
                this.d.setDuration(150L).setInterpolator(jr.f29800f);
                this.d.start();
                w20 w20Var12 = this.f32828n;
                if (w20Var12.G >= 0.0f) {
                    float[] fArr3 = w20Var12.D;
                    Point point2 = AndroidUtilities.displaySize;
                    float f24 = -AndroidUtilities.dp(36.0f);
                    fArr3[0] = (f21 - f24) / ((point2.x - (f24 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr3[1] = f22 / (point2.y - AndroidUtilities.dp(105.0f));
                    fArr3[0] = Math.min(1.0f, Math.max(0.0f, fArr3[0]));
                    fArr3[1] = Math.min(1.0f, Math.max(0.0f, fArr3[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    w20 w20Var13 = this.f32828n;
                    float f25 = w20Var13.D[0];
                    w20Var13.G = f25;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f25);
                    w20 w20Var14 = this.f32828n;
                    float f26 = w20Var14.D[1];
                    w20Var14.H = f26;
                    putFloat.putFloat("relativeY", f26).apply();
                }
            }
            w20 w20Var15 = this.f32828n;
            w20Var15.S = false;
            w20Var15.f(false);
            return true;
        }
        getLocationOnScreen(this.f32828n.C);
        w20 w20Var16 = this.f32828n;
        int i14 = w20Var16.C[0];
        WindowManager.LayoutParams layoutParams = w20Var16.f34281r;
        w20Var16.M = i14 - layoutParams.x;
        w20Var16.N = iArr[1] - layoutParams.y;
        this.f32823a = rawX;
        this.f32824b = rawY;
        System.currentTimeMillis();
        AndroidUtilities.runOnUIThread(this.f32826e, 300L);
        w20 w20Var17 = this.f32828n;
        WindowManager.LayoutParams layoutParams2 = w20Var17.f34281r;
        w20Var17.K = layoutParams2.x;
        w20Var17.L = layoutParams2.y;
        w20Var17.T = true;
        w20Var17.a();
        return true;
    }
}
