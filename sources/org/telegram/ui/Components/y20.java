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
    public float f30832a;
    public float f30833b;
    public boolean f30834c;
    public AnimatorSet d;
    public final x20 e;
    public final mc f30835f;
    public final float h;
    public final a30 f30836n;

    public y20(a30 a30Var, Context context, float f10) {
        super(context);
        this.f30836n = a30Var;
        this.h = f10;
        this.e = new x20(this);
        this.f30835f = new mc(9);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        a30 a30Var = this.f30836n;
        if (i12 != a30Var.F || a30Var.G != point.y) {
            a30Var.F = i12;
            a30Var.G = point.y;
            if (a30Var.H < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f30836n.H = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f30836n.I = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            a30 a30Var2 = a30.f23277a0;
            if (a30Var2 != null) {
                a30 a30Var3 = this.f30836n;
                float f10 = a30Var3.H;
                float f11 = a30Var3.I;
                float f12 = -AndroidUtilities.dp(36.0f);
                a30Var2.f23284r.x = (int) e2.c.w(AndroidUtilities.displaySize.x - (2.0f * f12), AndroidUtilities.dp(105.0f), f10, f12);
                a30Var2.f23284r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f11);
                a30Var2.h();
                y20 y20Var = a30Var2.f23279a;
                if (y20Var.getParent() != null) {
                    a30Var2.f23283n.updateViewLayout(y20Var, a30Var2.f23284r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int[] iArr;
        a30 a30Var;
        y20 y20Var;
        long j10;
        a30 a30Var2;
        a30 a30Var3;
        boolean z4;
        boolean z10;
        float f10;
        double d;
        boolean z11 = false;
        int i10 = 0;
        if (a30.f23277a0 == null) {
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
                    float f11 = rawX - this.f30832a;
                    float f12 = rawY - this.f30833b;
                    if (!this.f30836n.T) {
                        float f13 = (f12 * f12) + (f11 * f11);
                        float f14 = this.h;
                        if (f13 > f14 * f14) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            AndroidUtilities.cancelRunOnUIThread(this.e);
                            a30 a30Var4 = this.f30836n;
                            a30Var4.T = true;
                            a30Var4.f(true);
                            this.f30836n.e(false);
                            this.f30832a = rawX;
                            this.f30833b = rawY;
                            f11 = 0.0f;
                            f12 = 0.0f;
                        }
                    }
                    a30 a30Var5 = this.f30836n;
                    if (!a30Var5.T) {
                        return true;
                    }
                    a30Var5.L += f11;
                    a30Var5.M += f12;
                    this.f30832a = rawX;
                    this.f30833b = rawY;
                    a30Var5.i();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.f30836n.L;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.f30836n.M;
                    float measuredWidth2 = (a30Var2.f23280b.getMeasuredWidth() / 2.0f) + (a30Var2.K - this.f30836n.N);
                    float measuredHeight2 = (a30Var3.f23280b.getMeasuredHeight() / 2.0f) + (a30Var3.J - this.f30836n.O);
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
                        this.f30836n.R.setRemoveAngle(d - degrees);
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
                    a30 a30Var6 = this.f30836n;
                    if (!a30Var6.C && a30Var6.X != z4) {
                        a30Var6.X = z4;
                        ValueAnimator valueAnimator = a30Var6.Z;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            a30Var6.Z.cancel();
                        }
                        float f18 = a30Var6.Y;
                        if (z4) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f18, f10);
                        a30Var6.Z = ofFloat;
                        ofFloat.addUpdateListener(new f6(a30Var6, 25));
                        a30Var6.Z.addListener(new l00(2, a30Var6, z4));
                        a30Var6.Z.setDuration(250L);
                        a30Var6.Z.setInterpolator(nr.f27346f);
                        a30Var6.Z.start();
                    }
                    a30 a30Var7 = this.f30836n;
                    g30 g30Var = a30Var7.R;
                    if (a30Var7.f23288y != z10) {
                        a30Var7.f23288y = z10;
                        a30Var7.f23281c.invalidate();
                        if (!a30Var7.C) {
                            gj0 gj0Var = a30Var7.v;
                            if (z10) {
                                i10 = 33;
                            }
                            gj0Var.N(i10);
                            a30Var7.S.d();
                        }
                        if (z10) {
                            try {
                                g30Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    if (g30Var.f25032s != z10) {
                        g30Var.invalidate();
                    }
                    g30Var.f25032s = z10;
                    return true;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(this.f30835f);
            AndroidUtilities.cancelRunOnUIThread(this.e);
            a30 a30Var8 = this.f30836n;
            if (a30Var8.f23288y) {
                if (this.f30834c && VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                }
                this.f30834c = false;
                a30 a30Var9 = this.f30836n;
                jj0 jj0Var = a30Var9.S;
                gj0 gj0Var2 = a30Var9.v;
                dg.u2 u2Var = a30Var9.f23280b;
                y20 y20Var2 = a30Var9.f23279a;
                eg.i0 i0Var = a30Var9.f23281c;
                a30 a30Var10 = a30.f23277a0;
                if (a30Var10 == null) {
                    return false;
                }
                a30Var9.C = true;
                a30.f23278b0 = true;
                a30Var9.R.H = true;
                a30Var10.e(false);
                float measuredWidth3 = (y20Var2.getMeasuredWidth() / 2.0f) + a30Var9.f23284r.x;
                float measuredWidth4 = ((u2Var.getMeasuredWidth() / 2.0f) + (a30Var9.K - a30Var9.N)) - measuredWidth3;
                float measuredHeight3 = ((u2Var.getMeasuredHeight() / 2.0f) + (a30Var9.J - a30Var9.O)) - ((y20Var2.getMeasuredHeight() / 2.0f) + a30Var9.f23284r.y);
                a30 a30Var11 = a30.f23277a0;
                WindowManager windowManager = a30Var11.f23283n;
                y20 y20Var3 = a30Var11.f23279a;
                dg.u2 u2Var2 = a30Var11.f23280b;
                FrameLayout frameLayout = a30Var11.d;
                org.telegram.ui.w7 w7Var = a30Var11.e;
                a30Var9.d();
                a30.f23277a0 = null;
                AnimatorSet animatorSet = new AnimatorSet();
                int i11 = gj0Var2.Y;
                if (i11 < 33) {
                    y20Var = y20Var3;
                    j10 = ((1.0f - (i11 / 33.0f)) * ((float) gj0Var2.p())) / 2.0f;
                } else {
                    y20Var = y20Var3;
                    j10 = 0;
                }
                float f19 = a30Var9.f23284r.x;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f19, measuredWidth4 + f19);
                ofFloat2.addUpdateListener(a30Var9.P);
                ValueAnimator duration = ofFloat2.setDuration(250L);
                nr nrVar = nr.f27346f;
                duration.setInterpolator(nrVar);
                animatorSet.playTogether(ofFloat2);
                float f20 = a30Var9.f23284r.y;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f20, (f20 + measuredHeight3) - AndroidUtilities.dp(30.0f), a30Var9.f23284r.y + measuredHeight3);
                ofFloat3.addUpdateListener(a30Var9.Q);
                ofFloat3.setDuration(250L).setInterpolator(nrVar);
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
                float f21 = (float) 350;
                ofFloat4.setStartDelay(f21 * 0.7f);
                ofFloat4.setDuration(f21 * 0.3f);
                animatorSet.playTogether(ofFloat4);
                AndroidUtilities.runOnUIThread(new mc(8), 370L);
                long j11 = j10 + 530;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(i0Var, property, 1.0f, 1.05f);
                ofFloat5.setDuration(j11);
                nr nrVar2 = nr.f27349j;
                ofFloat5.setInterpolator(nrVar2);
                animatorSet.playTogether(ofFloat5);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(i0Var, property2, 1.0f, 1.05f);
                ofFloat6.setDuration(j11);
                ofFloat6.setInterpolator(nrVar2);
                animatorSet.playTogether(ofFloat6);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(i0Var, property, 1.0f, 0.3f);
                ofFloat7.setStartDelay(j11);
                ofFloat7.setDuration(350L);
                nr nrVar3 = nr.h;
                ofFloat7.setInterpolator(nrVar3);
                animatorSet.playTogether(ofFloat7);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(i0Var, property2, 1.0f, 0.3f);
                ofFloat8.setStartDelay(j11);
                ofFloat8.setDuration(350L);
                ofFloat8.setInterpolator(nrVar3);
                animatorSet.playTogether(ofFloat8);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(i0Var, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
                ofFloat9.setStartDelay(j11);
                ofFloat9.setDuration(350L);
                ofFloat9.setInterpolator(nrVar3);
                animatorSet.playTogether(ofFloat9);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(i0Var, property3, 1.0f, 0.0f);
                ofFloat10.setStartDelay(j11);
                ofFloat10.setDuration(350L);
                ofFloat10.setInterpolator(nrVar3);
                animatorSet.playTogether(ofFloat10);
                animatorSet.addListener(new z20(a30Var9, y20Var4, u2Var2, windowManager, frameLayout, w7Var));
                animatorSet.start();
                gj0Var2.N(66);
                jj0Var.i();
                jj0Var.d();
                return false;
            }
            a30Var8.U = false;
            a30Var8.a();
            if (this.f30834c) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                this.f30834c = false;
            } else if (motionEvent.getAction() == 1 && !this.f30836n.T) {
                if (VoIPService.getSharedInstance() != null) {
                    this.f30836n.e(!a30Var.f23286w);
                    return false;
                }
                return false;
            } else {
                z11 = false;
            }
            if (parent != null && this.f30836n.T) {
                parent.requestDisallowInterceptTouchEvent(z11);
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x;
                int i13 = point.y;
                float f22 = this.f30836n.f23284r.x;
                float measuredWidth5 = getMeasuredWidth() + f22;
                float f23 = this.f30836n.f23284r.y;
                float measuredHeight4 = getMeasuredHeight() + f23;
                this.d = new AnimatorSet();
                float f24 = -AndroidUtilities.dp(36.0f);
                if (f22 < f24) {
                    ValueAnimator ofFloat11 = ValueAnimator.ofFloat(this.f30836n.f23284r.x, f24);
                    ofFloat11.addUpdateListener(this.f30836n.P);
                    this.d.playTogether(ofFloat11);
                    f22 = f24;
                } else if (measuredWidth5 > i12 - f24) {
                    float measuredWidth6 = (i12 - getMeasuredWidth()) - f24;
                    ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f30836n.f23284r.x, measuredWidth6);
                    ofFloat12.addUpdateListener(this.f30836n.P);
                    this.d.playTogether(ofFloat12);
                    f22 = measuredWidth6;
                }
                int dp = AndroidUtilities.dp(36.0f) + i13;
                if (f23 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                    f23 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                    ValueAnimator ofFloat13 = ValueAnimator.ofFloat(this.f30836n.f23284r.y, f23);
                    ofFloat13.addUpdateListener(this.f30836n.Q);
                    this.d.playTogether(ofFloat13);
                } else if (measuredHeight4 > dp) {
                    f23 = dp - getMeasuredHeight();
                    ValueAnimator ofFloat14 = ValueAnimator.ofFloat(this.f30836n.f23284r.y, f23);
                    ofFloat14.addUpdateListener(this.f30836n.Q);
                    this.d.playTogether(ofFloat14);
                }
                this.d.setDuration(150L).setInterpolator(nr.f27346f);
                this.d.start();
                a30 a30Var12 = this.f30836n;
                if (a30Var12.H >= 0.0f) {
                    float[] fArr3 = a30Var12.E;
                    Point point2 = AndroidUtilities.displaySize;
                    float f25 = -AndroidUtilities.dp(36.0f);
                    fArr3[0] = (f22 - f25) / ((point2.x - (f25 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr3[1] = f23 / (point2.y - AndroidUtilities.dp(105.0f));
                    fArr3[0] = Math.min(1.0f, Math.max(0.0f, fArr3[0]));
                    fArr3[1] = Math.min(1.0f, Math.max(0.0f, fArr3[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    a30 a30Var13 = this.f30836n;
                    float f26 = a30Var13.E[0];
                    a30Var13.H = f26;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f26);
                    a30 a30Var14 = this.f30836n;
                    float f27 = a30Var14.E[1];
                    a30Var14.I = f27;
                    putFloat.putFloat("relativeY", f27).apply();
                }
            }
            a30 a30Var15 = this.f30836n;
            a30Var15.T = false;
            a30Var15.f(false);
            return true;
        }
        getLocationOnScreen(this.f30836n.D);
        a30 a30Var16 = this.f30836n;
        int i14 = a30Var16.D[0];
        WindowManager.LayoutParams layoutParams = a30Var16.f23284r;
        a30Var16.N = i14 - layoutParams.x;
        a30Var16.O = iArr[1] - layoutParams.y;
        this.f30832a = rawX;
        this.f30833b = rawY;
        System.currentTimeMillis();
        AndroidUtilities.runOnUIThread(this.e, 300L);
        a30 a30Var17 = this.f30836n;
        WindowManager.LayoutParams layoutParams2 = a30Var17.f23284r;
        a30Var17.L = layoutParams2.x;
        a30Var17.M = layoutParams2.y;
        a30Var17.U = true;
        a30Var17.a();
        return true;
    }
}
