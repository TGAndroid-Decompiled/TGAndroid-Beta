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
    public float f30771a;
    public float f30772b;
    public boolean f30773c;
    public AnimatorSet d;
    public final y20 e;
    public final th f30774f;
    public final float h;
    public final b30 f30775n;

    public z20(b30 b30Var, Context context, float f7) {
        super(context);
        this.f30775n = b30Var;
        this.h = f7;
        this.e = new y20(this);
        this.f30774f = new th(6);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        b30 b30Var = this.f30775n;
        if (i12 != b30Var.I || b30Var.J != point.y) {
            b30Var.I = i12;
            b30Var.J = point.y;
            if (b30Var.K < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f30775n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f30775n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            b30 b30Var2 = b30.f22874d0;
            if (b30Var2 != null) {
                b30 b30Var3 = this.f30775n;
                float f7 = b30Var3.K;
                float f10 = b30Var3.L;
                float f11 = -AndroidUtilities.dp(36.0f);
                b30Var2.f22884r.x = (int) com.google.android.gms.internal.vision.e2.z(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
                b30Var2.f22884r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
                b30Var2.h();
                z20 z20Var = b30Var2.f22876a;
                if (z20Var.getParent() != null) {
                    b30Var2.f22883n.updateViewLayout(z20Var, b30Var2.f22884r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int[] iArr;
        b30 b30Var;
        z20 z20Var;
        long j3;
        b30 b30Var2;
        b30 b30Var3;
        boolean z10;
        boolean z11;
        float f7;
        double d;
        boolean z12 = false;
        int i10 = 0;
        if (b30.f22874d0 == null) {
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
                    float f10 = rawX - this.f30771a;
                    float f11 = rawY - this.f30772b;
                    if (!this.f30775n.W) {
                        float f12 = (f11 * f11) + (f10 * f10);
                        float f13 = this.h;
                        if (f12 > f13 * f13) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            AndroidUtilities.cancelRunOnUIThread(this.e);
                            b30 b30Var4 = this.f30775n;
                            b30Var4.W = true;
                            b30Var4.f(true);
                            this.f30775n.e(false);
                            this.f30771a = rawX;
                            this.f30772b = rawY;
                            f10 = 0.0f;
                            f11 = 0.0f;
                        }
                    }
                    b30 b30Var5 = this.f30775n;
                    if (!b30Var5.W) {
                        return true;
                    }
                    b30Var5.O += f10;
                    b30Var5.P += f11;
                    this.f30771a = rawX;
                    this.f30772b = rawY;
                    b30Var5.i();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.f30775n.O;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.f30775n.P;
                    float measuredWidth2 = (b30Var2.f22878b.getMeasuredWidth() / 2.0f) + (b30Var2.N - this.f30775n.Q);
                    float measuredHeight2 = (b30Var3.f22878b.getMeasuredHeight() / 2.0f) + (b30Var3.M - this.f30775n.R);
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
                        this.f30775n.U.setRemoveAngle(d - degrees);
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
                    b30 b30Var6 = this.f30775n;
                    if (!b30Var6.F && b30Var6.f22877a0 != z10) {
                        b30Var6.f22877a0 = z10;
                        ValueAnimator valueAnimator = b30Var6.f22881c0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            b30Var6.f22881c0.cancel();
                        }
                        float f17 = b30Var6.f22879b0;
                        if (z10) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f7);
                        b30Var6.f22881c0 = ofFloat;
                        ofFloat.addUpdateListener(new k6(b30Var6, 25));
                        b30Var6.f22881c0.addListener(new ca(10, b30Var6, z10));
                        b30Var6.f22881c0.setDuration(250L);
                        b30Var6.f22881c0.setInterpolator(sr.f28339f);
                        b30Var6.f22881c0.start();
                    }
                    b30 b30Var7 = this.f30775n;
                    h30 h30Var = b30Var7.U;
                    if (b30Var7.f22888y != z11) {
                        b30Var7.f22888y = z11;
                        b30Var7.f22880c.invalidate();
                        if (!b30Var7.F) {
                            jj0 jj0Var = b30Var7.v;
                            if (z11) {
                                i10 = 33;
                            }
                            jj0Var.P(i10);
                            b30Var7.V.d();
                        }
                        if (z11) {
                            try {
                                h30Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    if (h30Var.f24658s != z11) {
                        h30Var.invalidate();
                    }
                    h30Var.f24658s = z11;
                    return true;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(this.f30774f);
            AndroidUtilities.cancelRunOnUIThread(this.e);
            b30 b30Var8 = this.f30775n;
            if (b30Var8.f22888y) {
                if (this.f30773c && VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                }
                this.f30773c = false;
                b30 b30Var9 = this.f30775n;
                mj0 mj0Var = b30Var9.V;
                jj0 jj0Var2 = b30Var9.v;
                ai.f0 f0Var = b30Var9.f22878b;
                z20 z20Var2 = b30Var9.f22876a;
                ci.r6 r6Var = b30Var9.f22880c;
                b30 b30Var10 = b30.f22874d0;
                if (b30Var10 == null) {
                    return false;
                }
                b30Var9.F = true;
                b30.f22875e0 = true;
                b30Var9.U.K = true;
                b30Var10.e(false);
                float measuredWidth3 = (z20Var2.getMeasuredWidth() / 2.0f) + b30Var9.f22884r.x;
                float measuredWidth4 = ((f0Var.getMeasuredWidth() / 2.0f) + (b30Var9.N - b30Var9.Q)) - measuredWidth3;
                float measuredHeight3 = ((f0Var.getMeasuredHeight() / 2.0f) + (b30Var9.M - b30Var9.R)) - ((z20Var2.getMeasuredHeight() / 2.0f) + b30Var9.f22884r.y);
                b30 b30Var11 = b30.f22874d0;
                WindowManager windowManager = b30Var11.f22883n;
                z20 z20Var3 = b30Var11.f22876a;
                ai.f0 f0Var2 = b30Var11.f22878b;
                FrameLayout frameLayout = b30Var11.d;
                org.telegram.ui.u7 u7Var = b30Var11.e;
                b30Var9.d();
                b30.f22874d0 = null;
                AnimatorSet animatorSet = new AnimatorSet();
                int i11 = jj0Var2.f25422a0;
                if (i11 < 33) {
                    z20Var = z20Var3;
                    j3 = ((1.0f - (i11 / 33.0f)) * ((float) jj0Var2.r())) / 2.0f;
                } else {
                    z20Var = z20Var3;
                    j3 = 0;
                }
                float f18 = b30Var9.f22884r.x;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f18, measuredWidth4 + f18);
                ofFloat2.addUpdateListener(b30Var9.S);
                ValueAnimator duration = ofFloat2.setDuration(250L);
                sr srVar = sr.f28339f;
                duration.setInterpolator(srVar);
                animatorSet.playTogether(ofFloat2);
                float f19 = b30Var9.f22884r.y;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f19, (f19 + measuredHeight3) - AndroidUtilities.dp(30.0f), b30Var9.f22884r.y + measuredHeight3);
                ofFloat3.addUpdateListener(b30Var9.T);
                ofFloat3.setDuration(250L).setInterpolator(srVar);
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
                float f20 = (float) 350;
                ofFloat4.setStartDelay(f20 * 0.7f);
                ofFloat4.setDuration(f20 * 0.3f);
                animatorSet.playTogether(ofFloat4);
                AndroidUtilities.runOnUIThread(new th(5), 370L);
                long j10 = j3 + 530;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(r6Var, property, 1.0f, 1.05f);
                ofFloat5.setDuration(j10);
                sr srVar2 = sr.f28342j;
                ofFloat5.setInterpolator(srVar2);
                animatorSet.playTogether(ofFloat5);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(r6Var, property2, 1.0f, 1.05f);
                ofFloat6.setDuration(j10);
                ofFloat6.setInterpolator(srVar2);
                animatorSet.playTogether(ofFloat6);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(r6Var, property, 1.0f, 0.3f);
                ofFloat7.setStartDelay(j10);
                ofFloat7.setDuration(350L);
                sr srVar3 = sr.h;
                ofFloat7.setInterpolator(srVar3);
                animatorSet.playTogether(ofFloat7);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(r6Var, property2, 1.0f, 0.3f);
                ofFloat8.setStartDelay(j10);
                ofFloat8.setDuration(350L);
                ofFloat8.setInterpolator(srVar3);
                animatorSet.playTogether(ofFloat8);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(r6Var, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
                ofFloat9.setStartDelay(j10);
                ofFloat9.setDuration(350L);
                ofFloat9.setInterpolator(srVar3);
                animatorSet.playTogether(ofFloat9);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(r6Var, property3, 1.0f, 0.0f);
                ofFloat10.setStartDelay(j10);
                ofFloat10.setDuration(350L);
                ofFloat10.setInterpolator(srVar3);
                animatorSet.playTogether(ofFloat10);
                animatorSet.addListener(new a30(b30Var9, z20Var4, f0Var2, windowManager, frameLayout, u7Var));
                animatorSet.start();
                jj0Var2.P(66);
                mj0Var.i();
                mj0Var.d();
                return false;
            }
            b30Var8.X = false;
            b30Var8.a();
            if (this.f30773c) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                this.f30773c = false;
            } else if (motionEvent.getAction() == 1 && !this.f30775n.W) {
                if (VoIPService.getSharedInstance() != null) {
                    this.f30775n.e(!b30Var.f22886w);
                    return false;
                }
                return false;
            } else {
                z12 = false;
            }
            if (parent != null && this.f30775n.W) {
                parent.requestDisallowInterceptTouchEvent(z12);
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x;
                int i13 = point.y;
                float f21 = this.f30775n.f22884r.x;
                float measuredWidth5 = getMeasuredWidth() + f21;
                float f22 = this.f30775n.f22884r.y;
                float measuredHeight4 = getMeasuredHeight() + f22;
                this.d = new AnimatorSet();
                float f23 = -AndroidUtilities.dp(36.0f);
                if (f21 < f23) {
                    ValueAnimator ofFloat11 = ValueAnimator.ofFloat(this.f30775n.f22884r.x, f23);
                    ofFloat11.addUpdateListener(this.f30775n.S);
                    this.d.playTogether(ofFloat11);
                    f21 = f23;
                } else if (measuredWidth5 > i12 - f23) {
                    float measuredWidth6 = (i12 - getMeasuredWidth()) - f23;
                    ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f30775n.f22884r.x, measuredWidth6);
                    ofFloat12.addUpdateListener(this.f30775n.S);
                    this.d.playTogether(ofFloat12);
                    f21 = measuredWidth6;
                }
                int dp = AndroidUtilities.dp(36.0f) + i13;
                if (f22 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                    f22 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                    ValueAnimator ofFloat13 = ValueAnimator.ofFloat(this.f30775n.f22884r.y, f22);
                    ofFloat13.addUpdateListener(this.f30775n.T);
                    this.d.playTogether(ofFloat13);
                } else if (measuredHeight4 > dp) {
                    f22 = dp - getMeasuredHeight();
                    ValueAnimator ofFloat14 = ValueAnimator.ofFloat(this.f30775n.f22884r.y, f22);
                    ofFloat14.addUpdateListener(this.f30775n.T);
                    this.d.playTogether(ofFloat14);
                }
                this.d.setDuration(150L).setInterpolator(sr.f28339f);
                this.d.start();
                b30 b30Var12 = this.f30775n;
                if (b30Var12.K >= 0.0f) {
                    float[] fArr3 = b30Var12.H;
                    Point point2 = AndroidUtilities.displaySize;
                    float f24 = -AndroidUtilities.dp(36.0f);
                    fArr3[0] = (f21 - f24) / ((point2.x - (f24 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr3[1] = f22 / (point2.y - AndroidUtilities.dp(105.0f));
                    fArr3[0] = Math.min(1.0f, Math.max(0.0f, fArr3[0]));
                    fArr3[1] = Math.min(1.0f, Math.max(0.0f, fArr3[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    b30 b30Var13 = this.f30775n;
                    float f25 = b30Var13.H[0];
                    b30Var13.K = f25;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f25);
                    b30 b30Var14 = this.f30775n;
                    float f26 = b30Var14.H[1];
                    b30Var14.L = f26;
                    putFloat.putFloat("relativeY", f26).apply();
                }
            }
            b30 b30Var15 = this.f30775n;
            b30Var15.W = false;
            b30Var15.f(false);
            return true;
        }
        getLocationOnScreen(this.f30775n.G);
        b30 b30Var16 = this.f30775n;
        int i14 = b30Var16.G[0];
        WindowManager.LayoutParams layoutParams = b30Var16.f22884r;
        b30Var16.Q = i14 - layoutParams.x;
        b30Var16.R = iArr[1] - layoutParams.y;
        this.f30771a = rawX;
        this.f30772b = rawY;
        System.currentTimeMillis();
        AndroidUtilities.runOnUIThread(this.e, 300L);
        b30 b30Var17 = this.f30775n;
        WindowManager.LayoutParams layoutParams2 = b30Var17.f22884r;
        b30Var17.O = layoutParams2.x;
        b30Var17.P = layoutParams2.y;
        b30Var17.X = true;
        b30Var17.a();
        return true;
    }
}
