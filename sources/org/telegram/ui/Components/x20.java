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
public final class x20 extends FrameLayout {
    public float f32412a;
    public float f32413b;
    public boolean f32414c;
    public AnimatorSet d;
    public final w20 f32415e;
    public final ue f32416f;
    public final float h;
    public final z20 f32417n;

    public x20(z20 z20Var, Context context, float f7) {
        super(context);
        this.f32417n = z20Var;
        this.h = f7;
        this.f32415e = new w20(this);
        this.f32416f = new ue(7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        z20 z20Var = this.f32417n;
        if (i12 != z20Var.I || z20Var.J != point.y) {
            z20Var.I = i12;
            z20Var.J = point.y;
            if (z20Var.K < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f32417n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f32417n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            z20 z20Var2 = z20.f33054d0;
            if (z20Var2 != null) {
                z20 z20Var3 = this.f32417n;
                float f7 = z20Var3.K;
                float f10 = z20Var3.L;
                float f11 = -AndroidUtilities.dp(36.0f);
                z20Var2.f33065r.x = (int) com.google.android.gms.internal.vision.e2.z(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
                z20Var2.f33065r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
                z20Var2.h();
                x20 x20Var = z20Var2.f33056a;
                if (x20Var.getParent() != null) {
                    z20Var2.f33064n.updateViewLayout(x20Var, z20Var2.f33065r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int[] iArr;
        z20 z20Var;
        x20 x20Var;
        long j3;
        z20 z20Var2;
        z20 z20Var3;
        boolean z10;
        boolean z11;
        float f7;
        double d;
        boolean z12 = false;
        int i10 = 0;
        if (z20.f33054d0 == null) {
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
                    float f10 = rawX - this.f32412a;
                    float f11 = rawY - this.f32413b;
                    if (!this.f32417n.W) {
                        float f12 = (f11 * f11) + (f10 * f10);
                        float f13 = this.h;
                        if (f12 > f13 * f13) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            AndroidUtilities.cancelRunOnUIThread(this.f32415e);
                            z20 z20Var4 = this.f32417n;
                            z20Var4.W = true;
                            z20Var4.f(true);
                            this.f32417n.e(false);
                            this.f32412a = rawX;
                            this.f32413b = rawY;
                            f10 = 0.0f;
                            f11 = 0.0f;
                        }
                    }
                    z20 z20Var5 = this.f32417n;
                    if (!z20Var5.W) {
                        return true;
                    }
                    z20Var5.O += f10;
                    z20Var5.P += f11;
                    this.f32412a = rawX;
                    this.f32413b = rawY;
                    z20Var5.i();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.f32417n.O;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.f32417n.P;
                    float measuredWidth2 = (z20Var2.f33058b.getMeasuredWidth() / 2.0f) + (z20Var2.N - this.f32417n.Q);
                    float measuredHeight2 = (z20Var3.f33058b.getMeasuredHeight() / 2.0f) + (z20Var3.M - this.f32417n.R);
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
                        this.f32417n.U.setRemoveAngle(d - degrees);
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
                    z20 z20Var6 = this.f32417n;
                    if (!z20Var6.F && z20Var6.f33057a0 != z10) {
                        z20Var6.f33057a0 = z10;
                        ValueAnimator valueAnimator = z20Var6.f33061c0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            z20Var6.f33061c0.cancel();
                        }
                        float f17 = z20Var6.f33059b0;
                        if (z10) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f7);
                        z20Var6.f33061c0 = ofFloat;
                        ofFloat.addUpdateListener(new l6(z20Var6, 25));
                        z20Var6.f33061c0.addListener(new org.telegram.ui.to(11, z20Var6, z10));
                        z20Var6.f33061c0.setDuration(250L);
                        z20Var6.f33061c0.setInterpolator(pr.f29466f);
                        z20Var6.f33061c0.start();
                    }
                    z20 z20Var7 = this.f32417n;
                    f30 f30Var = z20Var7.U;
                    if (z20Var7.f33069y != z11) {
                        z20Var7.f33069y = z11;
                        z20Var7.f33060c.invalidate();
                        if (!z20Var7.F) {
                            xi0 xi0Var = z20Var7.v;
                            if (z11) {
                                i10 = 33;
                            }
                            xi0Var.N(i10);
                            z20Var7.V.d();
                        }
                        if (z11) {
                            try {
                                f30Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    if (f30Var.f25893s != z11) {
                        f30Var.invalidate();
                    }
                    f30Var.f25893s = z11;
                    return true;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(this.f32416f);
            AndroidUtilities.cancelRunOnUIThread(this.f32415e);
            z20 z20Var8 = this.f32417n;
            if (z20Var8.f33069y) {
                if (this.f32414c && VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                }
                this.f32414c = false;
                z20 z20Var9 = this.f32417n;
                aj0 aj0Var = z20Var9.V;
                xi0 xi0Var2 = z20Var9.v;
                ah.y yVar = z20Var9.f33058b;
                x20 x20Var2 = z20Var9.f33056a;
                di.r6 r6Var = z20Var9.f33060c;
                z20 z20Var10 = z20.f33054d0;
                if (z20Var10 == null) {
                    return false;
                }
                z20Var9.F = true;
                z20.f33055e0 = true;
                z20Var9.U.K = true;
                z20Var10.e(false);
                float measuredWidth3 = (x20Var2.getMeasuredWidth() / 2.0f) + z20Var9.f33065r.x;
                float measuredWidth4 = ((yVar.getMeasuredWidth() / 2.0f) + (z20Var9.N - z20Var9.Q)) - measuredWidth3;
                float measuredHeight3 = ((yVar.getMeasuredHeight() / 2.0f) + (z20Var9.M - z20Var9.R)) - ((x20Var2.getMeasuredHeight() / 2.0f) + z20Var9.f33065r.y);
                z20 z20Var11 = z20.f33054d0;
                WindowManager windowManager = z20Var11.f33064n;
                x20 x20Var3 = z20Var11.f33056a;
                ah.y yVar2 = z20Var11.f33058b;
                FrameLayout frameLayout = z20Var11.d;
                org.telegram.ui.u7 u7Var = z20Var11.f33062e;
                z20Var9.d();
                z20.f33054d0 = null;
                AnimatorSet animatorSet = new AnimatorSet();
                int i11 = xi0Var2.f32553b0;
                if (i11 < 33) {
                    x20Var = x20Var3;
                    j3 = ((1.0f - (i11 / 33.0f)) * ((float) xi0Var2.p())) / 2.0f;
                } else {
                    x20Var = x20Var3;
                    j3 = 0;
                }
                float f18 = z20Var9.f33065r.x;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f18, measuredWidth4 + f18);
                ofFloat2.addUpdateListener(z20Var9.S);
                ValueAnimator duration = ofFloat2.setDuration(250L);
                pr prVar = pr.f29466f;
                duration.setInterpolator(prVar);
                animatorSet.playTogether(ofFloat2);
                float f19 = z20Var9.f33065r.y;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f19, (f19 + measuredHeight3) - AndroidUtilities.dp(30.0f), z20Var9.f33065r.y + measuredHeight3);
                ofFloat3.addUpdateListener(z20Var9.T);
                ofFloat3.setDuration(250L).setInterpolator(prVar);
                animatorSet.playTogether(ofFloat3);
                float[] fArr = {x20Var.getScaleX(), 0.1f};
                Property property = View.SCALE_X;
                x20 x20Var4 = x20Var;
                animatorSet.playTogether(ObjectAnimator.ofFloat(x20Var4, property, fArr).setDuration(180L));
                float[] fArr2 = {x20Var4.getScaleY(), 0.1f};
                Property property2 = View.SCALE_Y;
                animatorSet.playTogether(ObjectAnimator.ofFloat(x20Var4, property2, fArr2).setDuration(180L));
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(x20Var4, property3, 1.0f, 0.0f);
                float f20 = (float) 350;
                ofFloat4.setStartDelay(f20 * 0.7f);
                ofFloat4.setDuration(f20 * 0.3f);
                animatorSet.playTogether(ofFloat4);
                AndroidUtilities.runOnUIThread(new ue(6), 370L);
                long j10 = j3 + 530;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(r6Var, property, 1.0f, 1.05f);
                ofFloat5.setDuration(j10);
                pr prVar2 = pr.f29469j;
                ofFloat5.setInterpolator(prVar2);
                animatorSet.playTogether(ofFloat5);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(r6Var, property2, 1.0f, 1.05f);
                ofFloat6.setDuration(j10);
                ofFloat6.setInterpolator(prVar2);
                animatorSet.playTogether(ofFloat6);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(r6Var, property, 1.0f, 0.3f);
                ofFloat7.setStartDelay(j10);
                ofFloat7.setDuration(350L);
                pr prVar3 = pr.h;
                ofFloat7.setInterpolator(prVar3);
                animatorSet.playTogether(ofFloat7);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(r6Var, property2, 1.0f, 0.3f);
                ofFloat8.setStartDelay(j10);
                ofFloat8.setDuration(350L);
                ofFloat8.setInterpolator(prVar3);
                animatorSet.playTogether(ofFloat8);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(r6Var, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
                ofFloat9.setStartDelay(j10);
                ofFloat9.setDuration(350L);
                ofFloat9.setInterpolator(prVar3);
                animatorSet.playTogether(ofFloat9);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(r6Var, property3, 1.0f, 0.0f);
                ofFloat10.setStartDelay(j10);
                ofFloat10.setDuration(350L);
                ofFloat10.setInterpolator(prVar3);
                animatorSet.playTogether(ofFloat10);
                animatorSet.addListener(new y20(z20Var9, x20Var4, yVar2, windowManager, frameLayout, u7Var));
                animatorSet.start();
                xi0Var2.N(66);
                aj0Var.i();
                aj0Var.d();
                return false;
            }
            z20Var8.X = false;
            z20Var8.a();
            if (this.f32414c) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                this.f32414c = false;
            } else if (motionEvent.getAction() == 1 && !this.f32417n.W) {
                if (VoIPService.getSharedInstance() != null) {
                    this.f32417n.e(!z20Var.f33067w);
                    return false;
                }
                return false;
            } else {
                z12 = false;
            }
            if (parent != null && this.f32417n.W) {
                parent.requestDisallowInterceptTouchEvent(z12);
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x;
                int i13 = point.y;
                float f21 = this.f32417n.f33065r.x;
                float measuredWidth5 = getMeasuredWidth() + f21;
                float f22 = this.f32417n.f33065r.y;
                float measuredHeight4 = getMeasuredHeight() + f22;
                this.d = new AnimatorSet();
                float f23 = -AndroidUtilities.dp(36.0f);
                if (f21 < f23) {
                    ValueAnimator ofFloat11 = ValueAnimator.ofFloat(this.f32417n.f33065r.x, f23);
                    ofFloat11.addUpdateListener(this.f32417n.S);
                    this.d.playTogether(ofFloat11);
                    f21 = f23;
                } else if (measuredWidth5 > i12 - f23) {
                    float measuredWidth6 = (i12 - getMeasuredWidth()) - f23;
                    ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f32417n.f33065r.x, measuredWidth6);
                    ofFloat12.addUpdateListener(this.f32417n.S);
                    this.d.playTogether(ofFloat12);
                    f21 = measuredWidth6;
                }
                int dp = AndroidUtilities.dp(36.0f) + i13;
                if (f22 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                    f22 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                    ValueAnimator ofFloat13 = ValueAnimator.ofFloat(this.f32417n.f33065r.y, f22);
                    ofFloat13.addUpdateListener(this.f32417n.T);
                    this.d.playTogether(ofFloat13);
                } else if (measuredHeight4 > dp) {
                    f22 = dp - getMeasuredHeight();
                    ValueAnimator ofFloat14 = ValueAnimator.ofFloat(this.f32417n.f33065r.y, f22);
                    ofFloat14.addUpdateListener(this.f32417n.T);
                    this.d.playTogether(ofFloat14);
                }
                this.d.setDuration(150L).setInterpolator(pr.f29466f);
                this.d.start();
                z20 z20Var12 = this.f32417n;
                if (z20Var12.K >= 0.0f) {
                    float[] fArr3 = z20Var12.H;
                    Point point2 = AndroidUtilities.displaySize;
                    float f24 = -AndroidUtilities.dp(36.0f);
                    fArr3[0] = (f21 - f24) / ((point2.x - (f24 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr3[1] = f22 / (point2.y - AndroidUtilities.dp(105.0f));
                    fArr3[0] = Math.min(1.0f, Math.max(0.0f, fArr3[0]));
                    fArr3[1] = Math.min(1.0f, Math.max(0.0f, fArr3[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    z20 z20Var13 = this.f32417n;
                    float f25 = z20Var13.H[0];
                    z20Var13.K = f25;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f25);
                    z20 z20Var14 = this.f32417n;
                    float f26 = z20Var14.H[1];
                    z20Var14.L = f26;
                    putFloat.putFloat("relativeY", f26).apply();
                }
            }
            z20 z20Var15 = this.f32417n;
            z20Var15.W = false;
            z20Var15.f(false);
            return true;
        }
        getLocationOnScreen(this.f32417n.G);
        z20 z20Var16 = this.f32417n;
        int i14 = z20Var16.G[0];
        WindowManager.LayoutParams layoutParams = z20Var16.f33065r;
        z20Var16.Q = i14 - layoutParams.x;
        z20Var16.R = iArr[1] - layoutParams.y;
        this.f32412a = rawX;
        this.f32413b = rawY;
        System.currentTimeMillis();
        AndroidUtilities.runOnUIThread(this.f32415e, 300L);
        z20 z20Var17 = this.f32417n;
        WindowManager.LayoutParams layoutParams2 = z20Var17.f33065r;
        z20Var17.O = layoutParams2.x;
        z20Var17.P = layoutParams2.y;
        z20Var17.X = true;
        z20Var17.a();
        return true;
    }
}
