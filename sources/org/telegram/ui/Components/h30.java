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
public final class h30 extends FrameLayout {
    public float f23508a;
    public float f23509b;
    public boolean f23510c;
    public AnimatorSet d;
    public final g30 e;
    public final c30 f23511f;
    public final float h;
    public final j30 f23512n;

    public h30(j30 j30Var, Context context, float f7) {
        super(context);
        this.f23512n = j30Var;
        this.h = f7;
        this.e = new g30(this);
        this.f23511f = new c30(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        j30 j30Var = this.f23512n;
        if (i12 != j30Var.I || j30Var.J != point.y) {
            j30Var.I = i12;
            j30Var.J = point.y;
            if (j30Var.K < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f23512n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f23512n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            j30 j30Var2 = j30.f24207d0;
            if (j30Var2 != null) {
                j30 j30Var3 = this.f23512n;
                float f7 = j30Var3.K;
                float f10 = j30Var3.L;
                float f11 = -AndroidUtilities.dp(36.0f);
                j30Var2.f24217r.x = (int) com.google.android.gms.internal.vision.e2.z(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
                j30Var2.f24217r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
                j30Var2.h();
                h30 h30Var = j30Var2.f24209a;
                if (h30Var.getParent() != null) {
                    j30Var2.f24216n.updateViewLayout(h30Var, j30Var2.f24217r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int[] iArr;
        j30 j30Var;
        h30 h30Var;
        long j3;
        j30 j30Var2;
        j30 j30Var3;
        boolean z10;
        boolean z11;
        float f7;
        double d;
        int i10 = 0;
        if (j30.f24207d0 != null) {
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
                        float f10 = rawX - this.f23508a;
                        float f11 = rawY - this.f23509b;
                        if (!this.f23512n.W) {
                            float f12 = (f11 * f11) + (f10 * f10);
                            float f13 = this.h;
                            if (f12 > f13 * f13) {
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                AndroidUtilities.cancelRunOnUIThread(this.e);
                                j30 j30Var4 = this.f23512n;
                                j30Var4.W = true;
                                j30Var4.f(true);
                                this.f23512n.e(false);
                                this.f23508a = rawX;
                                this.f23509b = rawY;
                                f10 = 0.0f;
                                f11 = 0.0f;
                            }
                        }
                        j30 j30Var5 = this.f23512n;
                        if (!j30Var5.W) {
                            return true;
                        }
                        j30Var5.O += f10;
                        j30Var5.P += f11;
                        this.f23508a = rawX;
                        this.f23509b = rawY;
                        j30Var5.i();
                        float measuredWidth = (getMeasuredWidth() / 2.0f) + this.f23512n.O;
                        float measuredHeight = (getMeasuredHeight() / 2.0f) + this.f23512n.P;
                        float measuredWidth2 = (j30Var2.f24211b.getMeasuredWidth() / 2.0f) + (j30Var2.N - this.f23512n.Q);
                        float measuredHeight2 = (j30Var3.f24211b.getMeasuredHeight() / 2.0f) + (j30Var3.M - this.f23512n.R);
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
                            this.f23512n.U.setRemoveAngle(d - degrees);
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
                        j30 j30Var6 = this.f23512n;
                        if (!j30Var6.F && j30Var6.f24210a0 != z10) {
                            j30Var6.f24210a0 = z10;
                            ValueAnimator valueAnimator = j30Var6.f24214c0;
                            if (valueAnimator != null) {
                                valueAnimator.removeAllListeners();
                                j30Var6.f24214c0.cancel();
                            }
                            float f17 = j30Var6.f24212b0;
                            if (z10) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f7);
                            j30Var6.f24214c0 = ofFloat;
                            ofFloat.addUpdateListener(new j6(j30Var6, 25));
                            j30Var6.f24214c0.addListener(new yo(6, j30Var6, z10));
                            j30Var6.f24214c0.setDuration(250L);
                            j30Var6.f24214c0.setInterpolator(wr.f28819f);
                            j30Var6.f24214c0.start();
                        }
                        j30 j30Var7 = this.f23512n;
                        p30 p30Var = j30Var7.U;
                        if (j30Var7.f24221y != z11) {
                            j30Var7.f24221y = z11;
                            j30Var7.f24213c.invalidate();
                            if (!j30Var7.F) {
                                hj0 hj0Var = j30Var7.v;
                                if (z11) {
                                    i10 = 33;
                                }
                                hj0Var.P(i10);
                                j30Var7.V.d();
                            }
                            if (z11) {
                                try {
                                    p30Var.performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        if (p30Var.f26012s != z11) {
                            p30Var.invalidate();
                        }
                        p30Var.f26012s = z11;
                        return true;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(this.f23511f);
                AndroidUtilities.cancelRunOnUIThread(this.e);
                j30 j30Var8 = this.f23512n;
                if (j30Var8.f24221y) {
                    if (this.f23510c && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().setMicMute(true, false, false);
                    }
                    this.f23510c = false;
                    j30 j30Var9 = this.f23512n;
                    kj0 kj0Var = j30Var9.V;
                    hj0 hj0Var2 = j30Var9.v;
                    bi.ld ldVar = j30Var9.f24211b;
                    h30 h30Var2 = j30Var9.f24209a;
                    bi.s7 s7Var = j30Var9.f24213c;
                    j30 j30Var10 = j30.f24207d0;
                    if (j30Var10 != null) {
                        j30Var9.F = true;
                        j30.f24208e0 = true;
                        j30Var9.U.K = true;
                        j30Var10.e(false);
                        float measuredWidth3 = (h30Var2.getMeasuredWidth() / 2.0f) + j30Var9.f24217r.x;
                        float measuredWidth4 = ((ldVar.getMeasuredWidth() / 2.0f) + (j30Var9.N - j30Var9.Q)) - measuredWidth3;
                        float measuredHeight3 = ((ldVar.getMeasuredHeight() / 2.0f) + (j30Var9.M - j30Var9.R)) - ((h30Var2.getMeasuredHeight() / 2.0f) + j30Var9.f24217r.y);
                        j30 j30Var11 = j30.f24207d0;
                        WindowManager windowManager = j30Var11.f24216n;
                        h30 h30Var3 = j30Var11.f24209a;
                        bi.ld ldVar2 = j30Var11.f24211b;
                        FrameLayout frameLayout = j30Var11.d;
                        org.telegram.ui.t7 t7Var = j30Var11.e;
                        j30Var9.d();
                        j30.f24207d0 = null;
                        AnimatorSet animatorSet = new AnimatorSet();
                        int i11 = hj0Var2.f23648b0;
                        if (i11 < 33) {
                            h30Var = h30Var3;
                            j3 = ((1.0f - (i11 / 33.0f)) * ((float) hj0Var2.r())) / 2.0f;
                        } else {
                            h30Var = h30Var3;
                            j3 = 0;
                        }
                        float f18 = j30Var9.f24217r.x;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f18, measuredWidth4 + f18);
                        ofFloat2.addUpdateListener(j30Var9.S);
                        ValueAnimator duration = ofFloat2.setDuration(250L);
                        wr wrVar = wr.f28819f;
                        duration.setInterpolator(wrVar);
                        animatorSet.playTogether(ofFloat2);
                        float f19 = j30Var9.f24217r.y;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f19, (f19 + measuredHeight3) - AndroidUtilities.dp(30.0f), j30Var9.f24217r.y + measuredHeight3);
                        ofFloat3.addUpdateListener(j30Var9.T);
                        ofFloat3.setDuration(250L).setInterpolator(wrVar);
                        animatorSet.playTogether(ofFloat3);
                        float[] fArr = {h30Var.getScaleX(), 0.1f};
                        Property property = View.SCALE_X;
                        h30 h30Var4 = h30Var;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(h30Var4, property, fArr).setDuration(180L));
                        float[] fArr2 = {h30Var4.getScaleY(), 0.1f};
                        Property property2 = View.SCALE_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(h30Var4, property2, fArr2).setDuration(180L));
                        Property property3 = View.ALPHA;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(h30Var4, property3, 1.0f, 0.0f);
                        float f20 = (float) 350;
                        ofFloat4.setStartDelay(f20 * 0.7f);
                        ofFloat4.setDuration(f20 * 0.3f);
                        animatorSet.playTogether(ofFloat4);
                        AndroidUtilities.runOnUIThread(new c30(0), 370L);
                        long j10 = j3 + 530;
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(s7Var, property, 1.0f, 1.05f);
                        ofFloat5.setDuration(j10);
                        wr wrVar2 = wr.f28822j;
                        ofFloat5.setInterpolator(wrVar2);
                        animatorSet.playTogether(ofFloat5);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(s7Var, property2, 1.0f, 1.05f);
                        ofFloat6.setDuration(j10);
                        ofFloat6.setInterpolator(wrVar2);
                        animatorSet.playTogether(ofFloat6);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(s7Var, property, 1.0f, 0.3f);
                        ofFloat7.setStartDelay(j10);
                        ofFloat7.setDuration(350L);
                        wr wrVar3 = wr.h;
                        ofFloat7.setInterpolator(wrVar3);
                        animatorSet.playTogether(ofFloat7);
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(s7Var, property2, 1.0f, 0.3f);
                        ofFloat8.setStartDelay(j10);
                        ofFloat8.setDuration(350L);
                        ofFloat8.setInterpolator(wrVar3);
                        animatorSet.playTogether(ofFloat8);
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(s7Var, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
                        ofFloat9.setStartDelay(j10);
                        ofFloat9.setDuration(350L);
                        ofFloat9.setInterpolator(wrVar3);
                        animatorSet.playTogether(ofFloat9);
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(s7Var, property3, 1.0f, 0.0f);
                        ofFloat10.setStartDelay(j10);
                        ofFloat10.setDuration(350L);
                        ofFloat10.setInterpolator(wrVar3);
                        animatorSet.playTogether(ofFloat10);
                        animatorSet.addListener(new i30(j30Var9, h30Var4, ldVar2, windowManager, frameLayout, t7Var));
                        animatorSet.start();
                        hj0Var2.P(66);
                        kj0Var.i();
                        kj0Var.d();
                        return false;
                    }
                } else {
                    j30Var8.X = false;
                    j30Var8.a();
                    if (this.f23510c) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(true, false, false);
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused2) {
                            }
                        }
                        this.f23510c = false;
                    } else if (motionEvent.getAction() == 1 && !this.f23512n.W) {
                        if (VoIPService.getSharedInstance() != null) {
                            this.f23512n.e(!j30Var.f24219w);
                            return false;
                        }
                    }
                    if (parent != null && this.f23512n.W) {
                        parent.requestDisallowInterceptTouchEvent(false);
                        Point point = AndroidUtilities.displaySize;
                        int i12 = point.x;
                        int i13 = point.y;
                        float f21 = this.f23512n.f24217r.x;
                        float measuredWidth5 = getMeasuredWidth() + f21;
                        float f22 = this.f23512n.f24217r.y;
                        float measuredHeight4 = getMeasuredHeight() + f22;
                        this.d = new AnimatorSet();
                        float f23 = -AndroidUtilities.dp(36.0f);
                        if (f21 < f23) {
                            ValueAnimator ofFloat11 = ValueAnimator.ofFloat(this.f23512n.f24217r.x, f23);
                            ofFloat11.addUpdateListener(this.f23512n.S);
                            this.d.playTogether(ofFloat11);
                            f21 = f23;
                        } else if (measuredWidth5 > i12 - f23) {
                            float measuredWidth6 = (i12 - getMeasuredWidth()) - f23;
                            ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f23512n.f24217r.x, measuredWidth6);
                            ofFloat12.addUpdateListener(this.f23512n.S);
                            this.d.playTogether(ofFloat12);
                            f21 = measuredWidth6;
                        }
                        int dp = AndroidUtilities.dp(36.0f) + i13;
                        if (f22 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                            f22 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                            ValueAnimator ofFloat13 = ValueAnimator.ofFloat(this.f23512n.f24217r.y, f22);
                            ofFloat13.addUpdateListener(this.f23512n.T);
                            this.d.playTogether(ofFloat13);
                        } else if (measuredHeight4 > dp) {
                            f22 = dp - getMeasuredHeight();
                            ValueAnimator ofFloat14 = ValueAnimator.ofFloat(this.f23512n.f24217r.y, f22);
                            ofFloat14.addUpdateListener(this.f23512n.T);
                            this.d.playTogether(ofFloat14);
                        }
                        this.d.setDuration(150L).setInterpolator(wr.f28819f);
                        this.d.start();
                        j30 j30Var12 = this.f23512n;
                        if (j30Var12.K >= 0.0f) {
                            float[] fArr3 = j30Var12.H;
                            Point point2 = AndroidUtilities.displaySize;
                            float f24 = -AndroidUtilities.dp(36.0f);
                            fArr3[0] = (f21 - f24) / ((point2.x - (f24 * 2.0f)) - AndroidUtilities.dp(105.0f));
                            fArr3[1] = f22 / (point2.y - AndroidUtilities.dp(105.0f));
                            fArr3[0] = Math.min(1.0f, Math.max(0.0f, fArr3[0]));
                            fArr3[1] = Math.min(1.0f, Math.max(0.0f, fArr3[1]));
                            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                            j30 j30Var13 = this.f23512n;
                            float f25 = j30Var13.H[0];
                            j30Var13.K = f25;
                            SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f25);
                            j30 j30Var14 = this.f23512n;
                            float f26 = j30Var14.H[1];
                            j30Var14.L = f26;
                            putFloat.putFloat("relativeY", f26).apply();
                        }
                    }
                    j30 j30Var15 = this.f23512n;
                    j30Var15.W = false;
                    j30Var15.f(false);
                    return true;
                }
            } else {
                getLocationOnScreen(this.f23512n.G);
                j30 j30Var16 = this.f23512n;
                int i14 = j30Var16.G[0];
                WindowManager.LayoutParams layoutParams = j30Var16.f24217r;
                j30Var16.Q = i14 - layoutParams.x;
                j30Var16.R = iArr[1] - layoutParams.y;
                this.f23508a = rawX;
                this.f23509b = rawY;
                System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(this.e, 300L);
                j30 j30Var17 = this.f23512n;
                WindowManager.LayoutParams layoutParams2 = j30Var17.f24217r;
                j30Var17.O = layoutParams2.x;
                j30Var17.P = layoutParams2.y;
                j30Var17.X = true;
                j30Var17.a();
                return true;
            }
        }
        return false;
    }
}
