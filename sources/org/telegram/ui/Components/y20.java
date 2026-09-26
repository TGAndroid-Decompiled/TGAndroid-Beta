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
public final class y20 extends FrameLayout {
    public float f30477a;
    public float f30478b;
    public boolean f30479c;
    public AnimatorSet d;
    public final x20 e;
    public final th f30480f;
    public final float h;
    public final a30 f30481n;

    public y20(a30 a30Var, Context context, float f7) {
        super(context);
        this.f30481n = a30Var;
        this.h = f7;
        this.e = new x20(this);
        this.f30480f = new th(6);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        a30 a30Var = this.f30481n;
        if (i12 != a30Var.I || a30Var.J != point.y) {
            a30Var.I = i12;
            a30Var.J = point.y;
            if (a30Var.K < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f30481n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f30481n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            a30 a30Var2 = a30.f22570d0;
            if (a30Var2 != null) {
                a30 a30Var3 = this.f30481n;
                float f7 = a30Var3.K;
                float f10 = a30Var3.L;
                float f11 = -AndroidUtilities.dp(36.0f);
                a30Var2.f22580r.x = (int) com.google.android.gms.internal.vision.e2.z(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
                a30Var2.f22580r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
                a30Var2.h();
                y20 y20Var = a30Var2.f22572a;
                if (y20Var.getParent() != null) {
                    a30Var2.f22579n.updateViewLayout(y20Var, a30Var2.f22580r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int[] iArr;
        a30 a30Var;
        y20 y20Var;
        long j3;
        a30 a30Var2;
        a30 a30Var3;
        boolean z10;
        boolean z11;
        float f7;
        double d;
        boolean z12 = false;
        int i10 = 0;
        if (a30.f22570d0 == null) {
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
                    float f10 = rawX - this.f30477a;
                    float f11 = rawY - this.f30478b;
                    if (!this.f30481n.W) {
                        float f12 = (f11 * f11) + (f10 * f10);
                        float f13 = this.h;
                        if (f12 > f13 * f13) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            AndroidUtilities.cancelRunOnUIThread(this.e);
                            a30 a30Var4 = this.f30481n;
                            a30Var4.W = true;
                            a30Var4.f(true);
                            this.f30481n.e(false);
                            this.f30477a = rawX;
                            this.f30478b = rawY;
                            f10 = 0.0f;
                            f11 = 0.0f;
                        }
                    }
                    a30 a30Var5 = this.f30481n;
                    if (!a30Var5.W) {
                        return true;
                    }
                    a30Var5.O += f10;
                    a30Var5.P += f11;
                    this.f30477a = rawX;
                    this.f30478b = rawY;
                    a30Var5.i();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.f30481n.O;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.f30481n.P;
                    float measuredWidth2 = (a30Var2.f22574b.getMeasuredWidth() / 2.0f) + (a30Var2.N - this.f30481n.Q);
                    float measuredHeight2 = (a30Var3.f22574b.getMeasuredHeight() / 2.0f) + (a30Var3.M - this.f30481n.R);
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
                        this.f30481n.U.setRemoveAngle(d - degrees);
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
                    a30 a30Var6 = this.f30481n;
                    if (!a30Var6.F && a30Var6.f22573a0 != z10) {
                        a30Var6.f22573a0 = z10;
                        ValueAnimator valueAnimator = a30Var6.f22577c0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            a30Var6.f22577c0.cancel();
                        }
                        float f17 = a30Var6.f22575b0;
                        if (z10) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f7);
                        a30Var6.f22577c0 = ofFloat;
                        ofFloat.addUpdateListener(new k6(a30Var6, 25));
                        a30Var6.f22577c0.addListener(new ca(10, a30Var6, z10));
                        a30Var6.f22577c0.setDuration(250L);
                        a30Var6.f22577c0.setInterpolator(rr.f28030f);
                        a30Var6.f22577c0.start();
                    }
                    a30 a30Var7 = this.f30481n;
                    g30 g30Var = a30Var7.U;
                    if (a30Var7.f22584y != z11) {
                        a30Var7.f22584y = z11;
                        a30Var7.f22576c.invalidate();
                        if (!a30Var7.F) {
                            ij0 ij0Var = a30Var7.v;
                            if (z11) {
                                i10 = 33;
                            }
                            ij0Var.P(i10);
                            a30Var7.V.d();
                        }
                        if (z11) {
                            try {
                                g30Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    if (g30Var.f24354s != z11) {
                        g30Var.invalidate();
                    }
                    g30Var.f24354s = z11;
                    return true;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(this.f30480f);
            AndroidUtilities.cancelRunOnUIThread(this.e);
            a30 a30Var8 = this.f30481n;
            if (a30Var8.f22584y) {
                if (this.f30479c && VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                }
                this.f30479c = false;
                a30 a30Var9 = this.f30481n;
                lj0 lj0Var = a30Var9.V;
                ij0 ij0Var2 = a30Var9.v;
                ai.f0 f0Var = a30Var9.f22574b;
                y20 y20Var2 = a30Var9.f22572a;
                ci.r6 r6Var = a30Var9.f22576c;
                a30 a30Var10 = a30.f22570d0;
                if (a30Var10 == null) {
                    return false;
                }
                a30Var9.F = true;
                a30.f22571e0 = true;
                a30Var9.U.K = true;
                a30Var10.e(false);
                float measuredWidth3 = (y20Var2.getMeasuredWidth() / 2.0f) + a30Var9.f22580r.x;
                float measuredWidth4 = ((f0Var.getMeasuredWidth() / 2.0f) + (a30Var9.N - a30Var9.Q)) - measuredWidth3;
                float measuredHeight3 = ((f0Var.getMeasuredHeight() / 2.0f) + (a30Var9.M - a30Var9.R)) - ((y20Var2.getMeasuredHeight() / 2.0f) + a30Var9.f22580r.y);
                a30 a30Var11 = a30.f22570d0;
                WindowManager windowManager = a30Var11.f22579n;
                y20 y20Var3 = a30Var11.f22572a;
                ai.f0 f0Var2 = a30Var11.f22574b;
                FrameLayout frameLayout = a30Var11.d;
                org.telegram.ui.u7 u7Var = a30Var11.e;
                a30Var9.d();
                a30.f22570d0 = null;
                AnimatorSet animatorSet = new AnimatorSet();
                int i11 = ij0Var2.f25068a0;
                if (i11 < 33) {
                    y20Var = y20Var3;
                    j3 = ((1.0f - (i11 / 33.0f)) * ((float) ij0Var2.r())) / 2.0f;
                } else {
                    y20Var = y20Var3;
                    j3 = 0;
                }
                float f18 = a30Var9.f22580r.x;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f18, measuredWidth4 + f18);
                ofFloat2.addUpdateListener(a30Var9.S);
                ValueAnimator duration = ofFloat2.setDuration(250L);
                rr rrVar = rr.f28030f;
                duration.setInterpolator(rrVar);
                animatorSet.playTogether(ofFloat2);
                float f19 = a30Var9.f22580r.y;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f19, (f19 + measuredHeight3) - AndroidUtilities.dp(30.0f), a30Var9.f22580r.y + measuredHeight3);
                ofFloat3.addUpdateListener(a30Var9.T);
                ofFloat3.setDuration(250L).setInterpolator(rrVar);
                animatorSet.playTogether(ofFloat3);
                float[] fArr = {y20Var.getScaleX(), 0.1f};
                Property property = View.SCALE_X;
                y20 y20Var4 = y20Var;
                animatorSet.playTogether(ObjectAnimator.ofFloat(y20Var4, property, fArr).setDuration(180L));
                float[] fArr2 = {y20Var4.getScaleY(), 0.1f};
                Property property2 = View.SCALE_Y;
                animatorSet.playTogether(ObjectAnimator.ofFloat(y20Var4, property2, fArr2).setDuration(180L));
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(y20Var4, property3, 1.0f, 0.0f);
                float f20 = (float) 350;
                ofFloat4.setStartDelay(f20 * 0.7f);
                ofFloat4.setDuration(f20 * 0.3f);
                animatorSet.playTogether(ofFloat4);
                AndroidUtilities.runOnUIThread(new th(5), 370L);
                long j10 = j3 + 530;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(r6Var, property, 1.0f, 1.05f);
                ofFloat5.setDuration(j10);
                rr rrVar2 = rr.f28033j;
                ofFloat5.setInterpolator(rrVar2);
                animatorSet.playTogether(ofFloat5);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(r6Var, property2, 1.0f, 1.05f);
                ofFloat6.setDuration(j10);
                ofFloat6.setInterpolator(rrVar2);
                animatorSet.playTogether(ofFloat6);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(r6Var, property, 1.0f, 0.3f);
                ofFloat7.setStartDelay(j10);
                ofFloat7.setDuration(350L);
                rr rrVar3 = rr.h;
                ofFloat7.setInterpolator(rrVar3);
                animatorSet.playTogether(ofFloat7);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(r6Var, property2, 1.0f, 0.3f);
                ofFloat8.setStartDelay(j10);
                ofFloat8.setDuration(350L);
                ofFloat8.setInterpolator(rrVar3);
                animatorSet.playTogether(ofFloat8);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(r6Var, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
                ofFloat9.setStartDelay(j10);
                ofFloat9.setDuration(350L);
                ofFloat9.setInterpolator(rrVar3);
                animatorSet.playTogether(ofFloat9);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(r6Var, property3, 1.0f, 0.0f);
                ofFloat10.setStartDelay(j10);
                ofFloat10.setDuration(350L);
                ofFloat10.setInterpolator(rrVar3);
                animatorSet.playTogether(ofFloat10);
                animatorSet.addListener(new z20(a30Var9, y20Var4, f0Var2, windowManager, frameLayout, u7Var));
                animatorSet.start();
                ij0Var2.P(66);
                lj0Var.i();
                lj0Var.d();
                return false;
            }
            a30Var8.X = false;
            a30Var8.a();
            if (this.f30479c) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                this.f30479c = false;
            } else if (motionEvent.getAction() == 1 && !this.f30481n.W) {
                if (VoIPService.getSharedInstance() != null) {
                    this.f30481n.e(!a30Var.f22582w);
                    return false;
                }
                return false;
            } else {
                z12 = false;
            }
            if (parent != null && this.f30481n.W) {
                parent.requestDisallowInterceptTouchEvent(z12);
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x;
                int i13 = point.y;
                float f21 = this.f30481n.f22580r.x;
                float measuredWidth5 = getMeasuredWidth() + f21;
                float f22 = this.f30481n.f22580r.y;
                float measuredHeight4 = getMeasuredHeight() + f22;
                this.d = new AnimatorSet();
                float f23 = -AndroidUtilities.dp(36.0f);
                if (f21 < f23) {
                    ValueAnimator ofFloat11 = ValueAnimator.ofFloat(this.f30481n.f22580r.x, f23);
                    ofFloat11.addUpdateListener(this.f30481n.S);
                    this.d.playTogether(ofFloat11);
                    f21 = f23;
                } else if (measuredWidth5 > i12 - f23) {
                    float measuredWidth6 = (i12 - getMeasuredWidth()) - f23;
                    ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f30481n.f22580r.x, measuredWidth6);
                    ofFloat12.addUpdateListener(this.f30481n.S);
                    this.d.playTogether(ofFloat12);
                    f21 = measuredWidth6;
                }
                int dp = AndroidUtilities.dp(36.0f) + i13;
                if (f22 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                    f22 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                    ValueAnimator ofFloat13 = ValueAnimator.ofFloat(this.f30481n.f22580r.y, f22);
                    ofFloat13.addUpdateListener(this.f30481n.T);
                    this.d.playTogether(ofFloat13);
                } else if (measuredHeight4 > dp) {
                    f22 = dp - getMeasuredHeight();
                    ValueAnimator ofFloat14 = ValueAnimator.ofFloat(this.f30481n.f22580r.y, f22);
                    ofFloat14.addUpdateListener(this.f30481n.T);
                    this.d.playTogether(ofFloat14);
                }
                this.d.setDuration(150L).setInterpolator(rr.f28030f);
                this.d.start();
                a30 a30Var12 = this.f30481n;
                if (a30Var12.K >= 0.0f) {
                    float[] fArr3 = a30Var12.H;
                    Point point2 = AndroidUtilities.displaySize;
                    float f24 = -AndroidUtilities.dp(36.0f);
                    fArr3[0] = (f21 - f24) / ((point2.x - (f24 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr3[1] = f22 / (point2.y - AndroidUtilities.dp(105.0f));
                    fArr3[0] = Math.min(1.0f, Math.max(0.0f, fArr3[0]));
                    fArr3[1] = Math.min(1.0f, Math.max(0.0f, fArr3[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    a30 a30Var13 = this.f30481n;
                    float f25 = a30Var13.H[0];
                    a30Var13.K = f25;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f25);
                    a30 a30Var14 = this.f30481n;
                    float f26 = a30Var14.H[1];
                    a30Var14.L = f26;
                    putFloat.putFloat("relativeY", f26).apply();
                }
            }
            a30 a30Var15 = this.f30481n;
            a30Var15.W = false;
            a30Var15.f(false);
            return true;
        }
        getLocationOnScreen(this.f30481n.G);
        a30 a30Var16 = this.f30481n;
        int i14 = a30Var16.G[0];
        WindowManager.LayoutParams layoutParams = a30Var16.f22580r;
        a30Var16.Q = i14 - layoutParams.x;
        a30Var16.R = iArr[1] - layoutParams.y;
        this.f30477a = rawX;
        this.f30478b = rawY;
        System.currentTimeMillis();
        AndroidUtilities.runOnUIThread(this.e, 300L);
        a30 a30Var17 = this.f30481n;
        WindowManager.LayoutParams layoutParams2 = a30Var17.f22580r;
        a30Var17.O = layoutParams2.x;
        a30Var17.P = layoutParams2.y;
        a30Var17.X = true;
        a30Var17.a();
        return true;
    }
}
