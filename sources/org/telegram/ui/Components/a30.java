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
public final class a30 extends FrameLayout {
    public float f22528a;
    public float f22529b;
    public boolean f22530c;
    public AnimatorSet d;
    public final z20 e;
    public final th f22531f;
    public final float h;
    public final c30 f22532n;

    public a30(c30 c30Var, Context context, float f7) {
        super(context);
        this.f22532n = c30Var;
        this.h = f7;
        this.e = new z20(this);
        this.f22531f = new th(6);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        c30 c30Var = this.f22532n;
        if (i12 != c30Var.I || c30Var.J != point.y) {
            c30Var.I = i12;
            c30Var.J = point.y;
            if (c30Var.K < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f22532n.K = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f22532n.L = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            c30 c30Var2 = c30.f23197d0;
            if (c30Var2 != null) {
                c30 c30Var3 = this.f22532n;
                float f7 = c30Var3.K;
                float f10 = c30Var3.L;
                float f11 = -AndroidUtilities.dp(36.0f);
                c30Var2.f23207r.x = (int) com.google.android.gms.internal.vision.e2.z(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
                c30Var2.f23207r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
                c30Var2.h();
                a30 a30Var = c30Var2.f23199a;
                if (a30Var.getParent() != null) {
                    c30Var2.f23206n.updateViewLayout(a30Var, c30Var2.f23207r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int[] iArr;
        c30 c30Var;
        a30 a30Var;
        long j3;
        c30 c30Var2;
        c30 c30Var3;
        boolean z10;
        boolean z11;
        float f7;
        double d;
        boolean z12 = false;
        int i10 = 0;
        if (c30.f23197d0 == null) {
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
                    float f10 = rawX - this.f22528a;
                    float f11 = rawY - this.f22529b;
                    if (!this.f22532n.W) {
                        float f12 = (f11 * f11) + (f10 * f10);
                        float f13 = this.h;
                        if (f12 > f13 * f13) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            AndroidUtilities.cancelRunOnUIThread(this.e);
                            c30 c30Var4 = this.f22532n;
                            c30Var4.W = true;
                            c30Var4.f(true);
                            this.f22532n.e(false);
                            this.f22528a = rawX;
                            this.f22529b = rawY;
                            f10 = 0.0f;
                            f11 = 0.0f;
                        }
                    }
                    c30 c30Var5 = this.f22532n;
                    if (!c30Var5.W) {
                        return true;
                    }
                    c30Var5.O += f10;
                    c30Var5.P += f11;
                    this.f22528a = rawX;
                    this.f22529b = rawY;
                    c30Var5.i();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.f22532n.O;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.f22532n.P;
                    float measuredWidth2 = (c30Var2.f23201b.getMeasuredWidth() / 2.0f) + (c30Var2.N - this.f22532n.Q);
                    float measuredHeight2 = (c30Var3.f23201b.getMeasuredHeight() / 2.0f) + (c30Var3.M - this.f22532n.R);
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
                        this.f22532n.U.setRemoveAngle(d - degrees);
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
                    c30 c30Var6 = this.f22532n;
                    if (!c30Var6.F && c30Var6.f23200a0 != z10) {
                        c30Var6.f23200a0 = z10;
                        ValueAnimator valueAnimator = c30Var6.f23204c0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            c30Var6.f23204c0.cancel();
                        }
                        float f17 = c30Var6.f23202b0;
                        if (z10) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f17, f7);
                        c30Var6.f23204c0 = ofFloat;
                        ofFloat.addUpdateListener(new k6(c30Var6, 25));
                        c30Var6.f23204c0.addListener(new ca(10, c30Var6, z10));
                        c30Var6.f23204c0.setDuration(250L);
                        c30Var6.f23204c0.setInterpolator(sr.f28359f);
                        c30Var6.f23204c0.start();
                    }
                    c30 c30Var7 = this.f22532n;
                    i30 i30Var = c30Var7.U;
                    if (c30Var7.f23211y != z11) {
                        c30Var7.f23211y = z11;
                        c30Var7.f23203c.invalidate();
                        if (!c30Var7.F) {
                            kj0 kj0Var = c30Var7.v;
                            if (z11) {
                                i10 = 33;
                            }
                            kj0Var.P(i10);
                            c30Var7.V.d();
                        }
                        if (z11) {
                            try {
                                i30Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    if (i30Var.f25008s != z11) {
                        i30Var.invalidate();
                    }
                    i30Var.f25008s = z11;
                    return true;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(this.f22531f);
            AndroidUtilities.cancelRunOnUIThread(this.e);
            c30 c30Var8 = this.f22532n;
            if (c30Var8.f23211y) {
                if (this.f22530c && VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                }
                this.f22530c = false;
                c30 c30Var9 = this.f22532n;
                nj0 nj0Var = c30Var9.V;
                kj0 kj0Var2 = c30Var9.v;
                ai.f0 f0Var = c30Var9.f23201b;
                a30 a30Var2 = c30Var9.f23199a;
                ci.r6 r6Var = c30Var9.f23203c;
                c30 c30Var10 = c30.f23197d0;
                if (c30Var10 == null) {
                    return false;
                }
                c30Var9.F = true;
                c30.f23198e0 = true;
                c30Var9.U.K = true;
                c30Var10.e(false);
                float measuredWidth3 = (a30Var2.getMeasuredWidth() / 2.0f) + c30Var9.f23207r.x;
                float measuredWidth4 = ((f0Var.getMeasuredWidth() / 2.0f) + (c30Var9.N - c30Var9.Q)) - measuredWidth3;
                float measuredHeight3 = ((f0Var.getMeasuredHeight() / 2.0f) + (c30Var9.M - c30Var9.R)) - ((a30Var2.getMeasuredHeight() / 2.0f) + c30Var9.f23207r.y);
                c30 c30Var11 = c30.f23197d0;
                WindowManager windowManager = c30Var11.f23206n;
                a30 a30Var3 = c30Var11.f23199a;
                ai.f0 f0Var2 = c30Var11.f23201b;
                FrameLayout frameLayout = c30Var11.d;
                org.telegram.ui.x7 x7Var = c30Var11.e;
                c30Var9.d();
                c30.f23197d0 = null;
                AnimatorSet animatorSet = new AnimatorSet();
                int i11 = kj0Var2.f25746a0;
                if (i11 < 33) {
                    a30Var = a30Var3;
                    j3 = ((1.0f - (i11 / 33.0f)) * ((float) kj0Var2.r())) / 2.0f;
                } else {
                    a30Var = a30Var3;
                    j3 = 0;
                }
                float f18 = c30Var9.f23207r.x;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f18, measuredWidth4 + f18);
                ofFloat2.addUpdateListener(c30Var9.S);
                ValueAnimator duration = ofFloat2.setDuration(250L);
                sr srVar = sr.f28359f;
                duration.setInterpolator(srVar);
                animatorSet.playTogether(ofFloat2);
                float f19 = c30Var9.f23207r.y;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f19, (f19 + measuredHeight3) - AndroidUtilities.dp(30.0f), c30Var9.f23207r.y + measuredHeight3);
                ofFloat3.addUpdateListener(c30Var9.T);
                ofFloat3.setDuration(250L).setInterpolator(srVar);
                animatorSet.playTogether(ofFloat3);
                float[] fArr = {a30Var.getScaleX(), 0.1f};
                Property property = View.SCALE_X;
                a30 a30Var4 = a30Var;
                animatorSet.playTogether(ObjectAnimator.ofFloat(a30Var4, property, fArr).setDuration(180L));
                float[] fArr2 = {a30Var4.getScaleY(), 0.1f};
                Property property2 = View.SCALE_Y;
                animatorSet.playTogether(ObjectAnimator.ofFloat(a30Var4, property2, fArr2).setDuration(180L));
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(a30Var4, property3, 1.0f, 0.0f);
                float f20 = (float) 350;
                ofFloat4.setStartDelay(f20 * 0.7f);
                ofFloat4.setDuration(f20 * 0.3f);
                animatorSet.playTogether(ofFloat4);
                AndroidUtilities.runOnUIThread(new th(5), 370L);
                long j10 = j3 + 530;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(r6Var, property, 1.0f, 1.05f);
                ofFloat5.setDuration(j10);
                sr srVar2 = sr.f28362j;
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
                animatorSet.addListener(new b30(c30Var9, a30Var4, f0Var2, windowManager, frameLayout, x7Var));
                animatorSet.start();
                kj0Var2.P(66);
                nj0Var.i();
                nj0Var.d();
                return false;
            }
            c30Var8.X = false;
            c30Var8.a();
            if (this.f22530c) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                this.f22530c = false;
            } else if (motionEvent.getAction() == 1 && !this.f22532n.W) {
                if (VoIPService.getSharedInstance() != null) {
                    this.f22532n.e(!c30Var.f23209w);
                    return false;
                }
                return false;
            } else {
                z12 = false;
            }
            if (parent != null && this.f22532n.W) {
                parent.requestDisallowInterceptTouchEvent(z12);
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x;
                int i13 = point.y;
                float f21 = this.f22532n.f23207r.x;
                float measuredWidth5 = getMeasuredWidth() + f21;
                float f22 = this.f22532n.f23207r.y;
                float measuredHeight4 = getMeasuredHeight() + f22;
                this.d = new AnimatorSet();
                float f23 = -AndroidUtilities.dp(36.0f);
                if (f21 < f23) {
                    ValueAnimator ofFloat11 = ValueAnimator.ofFloat(this.f22532n.f23207r.x, f23);
                    ofFloat11.addUpdateListener(this.f22532n.S);
                    this.d.playTogether(ofFloat11);
                    f21 = f23;
                } else if (measuredWidth5 > i12 - f23) {
                    float measuredWidth6 = (i12 - getMeasuredWidth()) - f23;
                    ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f22532n.f23207r.x, measuredWidth6);
                    ofFloat12.addUpdateListener(this.f22532n.S);
                    this.d.playTogether(ofFloat12);
                    f21 = measuredWidth6;
                }
                int dp = AndroidUtilities.dp(36.0f) + i13;
                if (f22 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                    f22 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                    ValueAnimator ofFloat13 = ValueAnimator.ofFloat(this.f22532n.f23207r.y, f22);
                    ofFloat13.addUpdateListener(this.f22532n.T);
                    this.d.playTogether(ofFloat13);
                } else if (measuredHeight4 > dp) {
                    f22 = dp - getMeasuredHeight();
                    ValueAnimator ofFloat14 = ValueAnimator.ofFloat(this.f22532n.f23207r.y, f22);
                    ofFloat14.addUpdateListener(this.f22532n.T);
                    this.d.playTogether(ofFloat14);
                }
                this.d.setDuration(150L).setInterpolator(sr.f28359f);
                this.d.start();
                c30 c30Var12 = this.f22532n;
                if (c30Var12.K >= 0.0f) {
                    float[] fArr3 = c30Var12.H;
                    Point point2 = AndroidUtilities.displaySize;
                    float f24 = -AndroidUtilities.dp(36.0f);
                    fArr3[0] = (f21 - f24) / ((point2.x - (f24 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr3[1] = f22 / (point2.y - AndroidUtilities.dp(105.0f));
                    fArr3[0] = Math.min(1.0f, Math.max(0.0f, fArr3[0]));
                    fArr3[1] = Math.min(1.0f, Math.max(0.0f, fArr3[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    c30 c30Var13 = this.f22532n;
                    float f25 = c30Var13.H[0];
                    c30Var13.K = f25;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f25);
                    c30 c30Var14 = this.f22532n;
                    float f26 = c30Var14.H[1];
                    c30Var14.L = f26;
                    putFloat.putFloat("relativeY", f26).apply();
                }
            }
            c30 c30Var15 = this.f22532n;
            c30Var15.W = false;
            c30Var15.f(false);
            return true;
        }
        getLocationOnScreen(this.f22532n.G);
        c30 c30Var16 = this.f22532n;
        int i14 = c30Var16.G[0];
        WindowManager.LayoutParams layoutParams = c30Var16.f23207r;
        c30Var16.Q = i14 - layoutParams.x;
        c30Var16.R = iArr[1] - layoutParams.y;
        this.f22528a = rawX;
        this.f22529b = rawY;
        System.currentTimeMillis();
        AndroidUtilities.runOnUIThread(this.e, 300L);
        c30 c30Var17 = this.f22532n;
        WindowManager.LayoutParams layoutParams2 = c30Var17.f23207r;
        c30Var17.O = layoutParams2.x;
        c30Var17.P = layoutParams2.y;
        c30Var17.X = true;
        c30Var17.a();
        return true;
    }
}
