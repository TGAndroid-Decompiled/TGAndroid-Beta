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
public final class b30 extends FrameLayout {
    public float f22800a;
    public float f22801b;
    public boolean f22802c;
    public AnimatorSet d;
    public final a30 e;
    public final uh f22803f;
    public final float h;
    public final d30 f22804n;

    public b30(d30 d30Var, Context context, float f7) {
        super(context);
        this.f22804n = d30Var;
        this.h = f7;
        this.e = new a30(this);
        this.f22803f = new uh(6);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        d30 d30Var = this.f22804n;
        if (i12 != d30Var.I || d30Var.J != point.y) {
            d30Var.I = i12;
            d30Var.J = point.y;
            if (d30Var.K < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f22804n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f22804n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            d30 d30Var2 = d30.f23497d0;
            if (d30Var2 != null) {
                d30 d30Var3 = this.f22804n;
                float f7 = d30Var3.K;
                float f10 = d30Var3.L;
                float f11 = -AndroidUtilities.dp(36.0f);
                d30Var2.f23507r.x = (int) com.google.android.gms.internal.vision.e2.z(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
                d30Var2.f23507r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
                d30Var2.h();
                b30 b30Var = d30Var2.f23499a;
                if (b30Var.getParent() != null) {
                    d30Var2.f23506n.updateViewLayout(b30Var, d30Var2.f23507r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int[] iArr;
        d30 d30Var;
        b30 b30Var;
        long j3;
        d30 d30Var2;
        d30 d30Var3;
        boolean z10;
        boolean z11;
        float f7;
        double d;
        boolean z12 = false;
        int i10 = 0;
        if (d30.f23497d0 == null) {
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
                    float f10 = rawX - this.f22800a;
                    float f11 = rawY - this.f22801b;
                    if (!this.f22804n.W) {
                        float f12 = (f11 * f11) + (f10 * f10);
                        float f13 = this.h;
                        if (f12 > f13 * f13) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            AndroidUtilities.cancelRunOnUIThread(this.e);
                            d30 d30Var4 = this.f22804n;
                            d30Var4.W = true;
                            d30Var4.f(true);
                            this.f22804n.e(false);
                            this.f22800a = rawX;
                            this.f22801b = rawY;
                            f10 = 0.0f;
                            f11 = 0.0f;
                        }
                    }
                    d30 d30Var5 = this.f22804n;
                    if (!d30Var5.W) {
                        return true;
                    }
                    d30Var5.O += f10;
                    d30Var5.P += f11;
                    this.f22800a = rawX;
                    this.f22801b = rawY;
                    d30Var5.i();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.f22804n.O;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.f22804n.P;
                    float measuredWidth2 = (d30Var2.f23501b.getMeasuredWidth() / 2.0f) + (d30Var2.N - this.f22804n.Q);
                    float measuredHeight2 = (d30Var3.f23501b.getMeasuredHeight() / 2.0f) + (d30Var3.M - this.f22804n.R);
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
                        this.f22804n.U.setRemoveAngle(d - degrees);
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
                    d30 d30Var6 = this.f22804n;
                    if (!d30Var6.F && d30Var6.f23500a0 != z10) {
                        d30Var6.f23500a0 = z10;
                        ValueAnimator valueAnimator = d30Var6.f23504c0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            d30Var6.f23504c0.cancel();
                        }
                        float f17 = d30Var6.f23502b0;
                        if (z10) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f7);
                        d30Var6.f23504c0 = ofFloat;
                        ofFloat.addUpdateListener(new k6(d30Var6, 25));
                        d30Var6.f23504c0.addListener(new da(10, d30Var6, z10));
                        d30Var6.f23504c0.setDuration(250L);
                        d30Var6.f23504c0.setInterpolator(tr.f28636f);
                        d30Var6.f23504c0.start();
                    }
                    d30 d30Var7 = this.f22804n;
                    j30 j30Var = d30Var7.U;
                    if (d30Var7.f23511y != z11) {
                        d30Var7.f23511y = z11;
                        d30Var7.f23503c.invalidate();
                        if (!d30Var7.F) {
                            lj0 lj0Var = d30Var7.v;
                            if (z11) {
                                i10 = 33;
                            }
                            lj0Var.P(i10);
                            d30Var7.V.d();
                        }
                        if (z11) {
                            try {
                                j30Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    if (j30Var.f25281s != z11) {
                        j30Var.invalidate();
                    }
                    j30Var.f25281s = z11;
                    return true;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(this.f22803f);
            AndroidUtilities.cancelRunOnUIThread(this.e);
            d30 d30Var8 = this.f22804n;
            if (d30Var8.f23511y) {
                if (this.f22802c && VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                }
                this.f22802c = false;
                d30 d30Var9 = this.f22804n;
                oj0 oj0Var = d30Var9.V;
                lj0 lj0Var2 = d30Var9.v;
                ai.f0 f0Var = d30Var9.f23501b;
                b30 b30Var2 = d30Var9.f23499a;
                ci.r6 r6Var = d30Var9.f23503c;
                d30 d30Var10 = d30.f23497d0;
                if (d30Var10 == null) {
                    return false;
                }
                d30Var9.F = true;
                d30.f23498e0 = true;
                d30Var9.U.K = true;
                d30Var10.e(false);
                float measuredWidth3 = (b30Var2.getMeasuredWidth() / 2.0f) + d30Var9.f23507r.x;
                float measuredWidth4 = ((f0Var.getMeasuredWidth() / 2.0f) + (d30Var9.N - d30Var9.Q)) - measuredWidth3;
                float measuredHeight3 = ((f0Var.getMeasuredHeight() / 2.0f) + (d30Var9.M - d30Var9.R)) - ((b30Var2.getMeasuredHeight() / 2.0f) + d30Var9.f23507r.y);
                d30 d30Var11 = d30.f23497d0;
                WindowManager windowManager = d30Var11.f23506n;
                b30 b30Var3 = d30Var11.f23499a;
                ai.f0 f0Var2 = d30Var11.f23501b;
                FrameLayout frameLayout = d30Var11.d;
                org.telegram.ui.u7 u7Var = d30Var11.e;
                d30Var9.d();
                d30.f23497d0 = null;
                AnimatorSet animatorSet = new AnimatorSet();
                int i11 = lj0Var2.f26008a0;
                if (i11 < 33) {
                    b30Var = b30Var3;
                    j3 = ((1.0f - (i11 / 33.0f)) * ((float) lj0Var2.r())) / 2.0f;
                } else {
                    b30Var = b30Var3;
                    j3 = 0;
                }
                float f18 = d30Var9.f23507r.x;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f18, measuredWidth4 + f18);
                ofFloat2.addUpdateListener(d30Var9.S);
                ValueAnimator duration = ofFloat2.setDuration(250L);
                tr trVar = tr.f28636f;
                duration.setInterpolator(trVar);
                animatorSet.playTogether(ofFloat2);
                float f19 = d30Var9.f23507r.y;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f19, (f19 + measuredHeight3) - AndroidUtilities.dp(30.0f), d30Var9.f23507r.y + measuredHeight3);
                ofFloat3.addUpdateListener(d30Var9.T);
                ofFloat3.setDuration(250L).setInterpolator(trVar);
                animatorSet.playTogether(ofFloat3);
                float[] fArr = {b30Var.getScaleX(), 0.1f};
                Property property = View.SCALE_X;
                b30 b30Var4 = b30Var;
                animatorSet.playTogether(ObjectAnimator.ofFloat(b30Var4, property, fArr).setDuration(180L));
                float[] fArr2 = {b30Var4.getScaleY(), 0.1f};
                Property property2 = View.SCALE_Y;
                animatorSet.playTogether(ObjectAnimator.ofFloat(b30Var4, property2, fArr2).setDuration(180L));
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(b30Var4, property3, 1.0f, 0.0f);
                float f20 = (float) 350;
                ofFloat4.setStartDelay(f20 * 0.7f);
                ofFloat4.setDuration(f20 * 0.3f);
                animatorSet.playTogether(ofFloat4);
                AndroidUtilities.runOnUIThread(new uh(5), 370L);
                long j10 = j3 + 530;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(r6Var, property, 1.0f, 1.05f);
                ofFloat5.setDuration(j10);
                tr trVar2 = tr.f28639j;
                ofFloat5.setInterpolator(trVar2);
                animatorSet.playTogether(ofFloat5);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(r6Var, property2, 1.0f, 1.05f);
                ofFloat6.setDuration(j10);
                ofFloat6.setInterpolator(trVar2);
                animatorSet.playTogether(ofFloat6);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(r6Var, property, 1.0f, 0.3f);
                ofFloat7.setStartDelay(j10);
                ofFloat7.setDuration(350L);
                tr trVar3 = tr.h;
                ofFloat7.setInterpolator(trVar3);
                animatorSet.playTogether(ofFloat7);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(r6Var, property2, 1.0f, 0.3f);
                ofFloat8.setStartDelay(j10);
                ofFloat8.setDuration(350L);
                ofFloat8.setInterpolator(trVar3);
                animatorSet.playTogether(ofFloat8);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(r6Var, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
                ofFloat9.setStartDelay(j10);
                ofFloat9.setDuration(350L);
                ofFloat9.setInterpolator(trVar3);
                animatorSet.playTogether(ofFloat9);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(r6Var, property3, 1.0f, 0.0f);
                ofFloat10.setStartDelay(j10);
                ofFloat10.setDuration(350L);
                ofFloat10.setInterpolator(trVar3);
                animatorSet.playTogether(ofFloat10);
                animatorSet.addListener(new c30(d30Var9, b30Var4, f0Var2, windowManager, frameLayout, u7Var));
                animatorSet.start();
                lj0Var2.P(66);
                oj0Var.i();
                oj0Var.d();
                return false;
            }
            d30Var8.X = false;
            d30Var8.a();
            if (this.f22802c) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                this.f22802c = false;
            } else if (motionEvent.getAction() == 1 && !this.f22804n.W) {
                if (VoIPService.getSharedInstance() != null) {
                    this.f22804n.e(!d30Var.f23509w);
                    return false;
                }
                return false;
            } else {
                z12 = false;
            }
            if (parent != null && this.f22804n.W) {
                parent.requestDisallowInterceptTouchEvent(z12);
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x;
                int i13 = point.y;
                float f21 = this.f22804n.f23507r.x;
                float measuredWidth5 = getMeasuredWidth() + f21;
                float f22 = this.f22804n.f23507r.y;
                float measuredHeight4 = getMeasuredHeight() + f22;
                this.d = new AnimatorSet();
                float f23 = -AndroidUtilities.dp(36.0f);
                if (f21 < f23) {
                    ValueAnimator ofFloat11 = ValueAnimator.ofFloat(this.f22804n.f23507r.x, f23);
                    ofFloat11.addUpdateListener(this.f22804n.S);
                    this.d.playTogether(ofFloat11);
                    f21 = f23;
                } else if (measuredWidth5 > i12 - f23) {
                    float measuredWidth6 = (i12 - getMeasuredWidth()) - f23;
                    ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f22804n.f23507r.x, measuredWidth6);
                    ofFloat12.addUpdateListener(this.f22804n.S);
                    this.d.playTogether(ofFloat12);
                    f21 = measuredWidth6;
                }
                int dp = AndroidUtilities.dp(36.0f) + i13;
                if (f22 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                    f22 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                    ValueAnimator ofFloat13 = ValueAnimator.ofFloat(this.f22804n.f23507r.y, f22);
                    ofFloat13.addUpdateListener(this.f22804n.T);
                    this.d.playTogether(ofFloat13);
                } else if (measuredHeight4 > dp) {
                    f22 = dp - getMeasuredHeight();
                    ValueAnimator ofFloat14 = ValueAnimator.ofFloat(this.f22804n.f23507r.y, f22);
                    ofFloat14.addUpdateListener(this.f22804n.T);
                    this.d.playTogether(ofFloat14);
                }
                this.d.setDuration(150L).setInterpolator(tr.f28636f);
                this.d.start();
                d30 d30Var12 = this.f22804n;
                if (d30Var12.K >= 0.0f) {
                    float[] fArr3 = d30Var12.H;
                    Point point2 = AndroidUtilities.displaySize;
                    float f24 = -AndroidUtilities.dp(36.0f);
                    fArr3[0] = (f21 - f24) / ((point2.x - (f24 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr3[1] = f22 / (point2.y - AndroidUtilities.dp(105.0f));
                    fArr3[0] = Math.min(1.0f, Math.max(0.0f, fArr3[0]));
                    fArr3[1] = Math.min(1.0f, Math.max(0.0f, fArr3[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    d30 d30Var13 = this.f22804n;
                    float f25 = d30Var13.H[0];
                    d30Var13.K = f25;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f25);
                    d30 d30Var14 = this.f22804n;
                    float f26 = d30Var14.H[1];
                    d30Var14.L = f26;
                    putFloat.putFloat("relativeY", f26).apply();
                }
            }
            d30 d30Var15 = this.f22804n;
            d30Var15.W = false;
            d30Var15.f(false);
            return true;
        }
        getLocationOnScreen(this.f22804n.G);
        d30 d30Var16 = this.f22804n;
        int i14 = d30Var16.G[0];
        WindowManager.LayoutParams layoutParams = d30Var16.f23507r;
        d30Var16.Q = i14 - layoutParams.x;
        d30Var16.R = iArr[1] - layoutParams.y;
        this.f22800a = rawX;
        this.f22801b = rawY;
        System.currentTimeMillis();
        AndroidUtilities.runOnUIThread(this.e, 300L);
        d30 d30Var17 = this.f22804n;
        WindowManager.LayoutParams layoutParams2 = d30Var17.f23507r;
        d30Var17.O = layoutParams2.x;
        d30Var17.P = layoutParams2.y;
        d30Var17.X = true;
        d30Var17.a();
        return true;
    }
}
