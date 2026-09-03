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
    public float f25145a;
    public float f25146b;
    public boolean f25147c;
    public AnimatorSet d;
    public final z20 f25148e;
    public final jc f25149f;
    public final float h;
    public final c30 f25150n;

    public a30(c30 c30Var, Context context, float f10) {
        super(context);
        this.f25150n = c30Var;
        this.h = f10;
        this.f25148e = new z20(this);
        this.f25149f = new jc(11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        c30 c30Var = this.f25150n;
        if (i12 != c30Var.F || c30Var.G != point.y) {
            c30Var.F = i12;
            c30Var.G = point.y;
            if (c30Var.H < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f25150n.H = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f25150n.I = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            c30 c30Var2 = c30.f25747a0;
            if (c30Var2 != null) {
                c30 c30Var3 = this.f25150n;
                float f10 = c30Var3.H;
                float f11 = c30Var3.I;
                float f12 = -AndroidUtilities.dp(36.0f);
                c30Var2.f25755r.x = (int) e2.c.w(AndroidUtilities.displaySize.x - (2.0f * f12), AndroidUtilities.dp(105.0f), f10, f12);
                c30Var2.f25755r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f11);
                c30Var2.h();
                a30 a30Var = c30Var2.f25749a;
                if (a30Var.getParent() != null) {
                    c30Var2.f25754n.updateViewLayout(a30Var, c30Var2.f25755r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int[] iArr;
        c30 c30Var;
        a30 a30Var;
        long j10;
        c30 c30Var2;
        c30 c30Var3;
        boolean z4;
        boolean z10;
        float f10;
        double d;
        boolean z11 = false;
        int i10 = 0;
        if (c30.f25747a0 == null) {
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
                    float f11 = rawX - this.f25145a;
                    float f12 = rawY - this.f25146b;
                    if (!this.f25150n.T) {
                        float f13 = (f12 * f12) + (f11 * f11);
                        float f14 = this.h;
                        if (f13 > f14 * f14) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            AndroidUtilities.cancelRunOnUIThread(this.f25148e);
                            c30 c30Var4 = this.f25150n;
                            c30Var4.T = true;
                            c30Var4.f(true);
                            this.f25150n.e(false);
                            this.f25145a = rawX;
                            this.f25146b = rawY;
                            f11 = 0.0f;
                            f12 = 0.0f;
                        }
                    }
                    c30 c30Var5 = this.f25150n;
                    if (!c30Var5.T) {
                        return true;
                    }
                    c30Var5.L += f11;
                    c30Var5.M += f12;
                    this.f25145a = rawX;
                    this.f25146b = rawY;
                    c30Var5.i();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.f25150n.L;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.f25150n.M;
                    float measuredWidth2 = (c30Var2.f25750b.getMeasuredWidth() / 2.0f) + (c30Var2.K - this.f25150n.N);
                    float measuredHeight2 = (c30Var3.f25750b.getMeasuredHeight() / 2.0f) + (c30Var3.J - this.f25150n.O);
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
                        this.f25150n.R.setRemoveAngle(d - degrees);
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
                    c30 c30Var6 = this.f25150n;
                    if (!c30Var6.C && c30Var6.X != z4) {
                        c30Var6.X = z4;
                        ValueAnimator valueAnimator = c30Var6.Z;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            c30Var6.Z.cancel();
                        }
                        float f18 = c30Var6.Y;
                        if (z4) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f18, f10);
                        c30Var6.Z = ofFloat;
                        ofFloat.addUpdateListener(new f6(c30Var6, 25));
                        c30Var6.Z.addListener(new x20(0, c30Var6, z4));
                        c30Var6.Z.setDuration(250L);
                        c30Var6.Z.setInterpolator(pr.f30168f);
                        c30Var6.Z.start();
                    }
                    c30 c30Var7 = this.f25150n;
                    i30 i30Var = c30Var7.R;
                    if (c30Var7.f25759y != z10) {
                        c30Var7.f25759y = z10;
                        c30Var7.f25751c.invalidate();
                        if (!c30Var7.C) {
                            hj0 hj0Var = c30Var7.v;
                            if (z10) {
                                i10 = 33;
                            }
                            hj0Var.N(i10);
                            c30Var7.S.d();
                        }
                        if (z10) {
                            try {
                                i30Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    if (i30Var.f27708s != z10) {
                        i30Var.invalidate();
                    }
                    i30Var.f27708s = z10;
                    return true;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(this.f25149f);
            AndroidUtilities.cancelRunOnUIThread(this.f25148e);
            c30 c30Var8 = this.f25150n;
            if (c30Var8.f25759y) {
                if (this.f25147c && VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                }
                this.f25147c = false;
                c30 c30Var9 = this.f25150n;
                kj0 kj0Var = c30Var9.S;
                hj0 hj0Var2 = c30Var9.v;
                eg.s2 s2Var = c30Var9.f25750b;
                a30 a30Var2 = c30Var9.f25749a;
                fg.i0 i0Var = c30Var9.f25751c;
                c30 c30Var10 = c30.f25747a0;
                if (c30Var10 == null) {
                    return false;
                }
                c30Var9.C = true;
                c30.f25748b0 = true;
                c30Var9.R.H = true;
                c30Var10.e(false);
                float measuredWidth3 = (a30Var2.getMeasuredWidth() / 2.0f) + c30Var9.f25755r.x;
                float measuredWidth4 = ((s2Var.getMeasuredWidth() / 2.0f) + (c30Var9.K - c30Var9.N)) - measuredWidth3;
                float measuredHeight3 = ((s2Var.getMeasuredHeight() / 2.0f) + (c30Var9.J - c30Var9.O)) - ((a30Var2.getMeasuredHeight() / 2.0f) + c30Var9.f25755r.y);
                c30 c30Var11 = c30.f25747a0;
                WindowManager windowManager = c30Var11.f25754n;
                a30 a30Var3 = c30Var11.f25749a;
                eg.s2 s2Var2 = c30Var11.f25750b;
                FrameLayout frameLayout = c30Var11.d;
                org.telegram.ui.w7 w7Var = c30Var11.f25752e;
                c30Var9.d();
                c30.f25747a0 = null;
                AnimatorSet animatorSet = new AnimatorSet();
                int i11 = hj0Var2.Y;
                if (i11 < 33) {
                    a30Var = a30Var3;
                    j10 = ((1.0f - (i11 / 33.0f)) * ((float) hj0Var2.p())) / 2.0f;
                } else {
                    a30Var = a30Var3;
                    j10 = 0;
                }
                float f19 = c30Var9.f25755r.x;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f19, measuredWidth4 + f19);
                ofFloat2.addUpdateListener(c30Var9.P);
                ValueAnimator duration = ofFloat2.setDuration(250L);
                pr prVar = pr.f30168f;
                duration.setInterpolator(prVar);
                animatorSet.playTogether(ofFloat2);
                float f20 = c30Var9.f25755r.y;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f20, (f20 + measuredHeight3) - AndroidUtilities.dp(30.0f), c30Var9.f25755r.y + measuredHeight3);
                ofFloat3.addUpdateListener(c30Var9.Q);
                ofFloat3.setDuration(250L).setInterpolator(prVar);
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
                float f21 = (float) 350;
                ofFloat4.setStartDelay(f21 * 0.7f);
                ofFloat4.setDuration(f21 * 0.3f);
                animatorSet.playTogether(ofFloat4);
                AndroidUtilities.runOnUIThread(new jc(10), 370L);
                long j11 = j10 + 530;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(i0Var, property, 1.0f, 1.05f);
                ofFloat5.setDuration(j11);
                pr prVar2 = pr.f30171j;
                ofFloat5.setInterpolator(prVar2);
                animatorSet.playTogether(ofFloat5);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(i0Var, property2, 1.0f, 1.05f);
                ofFloat6.setDuration(j11);
                ofFloat6.setInterpolator(prVar2);
                animatorSet.playTogether(ofFloat6);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(i0Var, property, 1.0f, 0.3f);
                ofFloat7.setStartDelay(j11);
                ofFloat7.setDuration(350L);
                pr prVar3 = pr.h;
                ofFloat7.setInterpolator(prVar3);
                animatorSet.playTogether(ofFloat7);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(i0Var, property2, 1.0f, 0.3f);
                ofFloat8.setStartDelay(j11);
                ofFloat8.setDuration(350L);
                ofFloat8.setInterpolator(prVar3);
                animatorSet.playTogether(ofFloat8);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(i0Var, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
                ofFloat9.setStartDelay(j11);
                ofFloat9.setDuration(350L);
                ofFloat9.setInterpolator(prVar3);
                animatorSet.playTogether(ofFloat9);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(i0Var, property3, 1.0f, 0.0f);
                ofFloat10.setStartDelay(j11);
                ofFloat10.setDuration(350L);
                ofFloat10.setInterpolator(prVar3);
                animatorSet.playTogether(ofFloat10);
                animatorSet.addListener(new b30(c30Var9, a30Var4, s2Var2, windowManager, frameLayout, w7Var));
                animatorSet.start();
                hj0Var2.N(66);
                kj0Var.i();
                kj0Var.d();
                return false;
            }
            c30Var8.U = false;
            c30Var8.a();
            if (this.f25147c) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                this.f25147c = false;
            } else if (motionEvent.getAction() == 1 && !this.f25150n.T) {
                if (VoIPService.getSharedInstance() != null) {
                    this.f25150n.e(!c30Var.f25757w);
                    return false;
                }
                return false;
            } else {
                z11 = false;
            }
            if (parent != null && this.f25150n.T) {
                parent.requestDisallowInterceptTouchEvent(z11);
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x;
                int i13 = point.y;
                float f22 = this.f25150n.f25755r.x;
                float measuredWidth5 = getMeasuredWidth() + f22;
                float f23 = this.f25150n.f25755r.y;
                float measuredHeight4 = getMeasuredHeight() + f23;
                this.d = new AnimatorSet();
                float f24 = -AndroidUtilities.dp(36.0f);
                if (f22 < f24) {
                    ValueAnimator ofFloat11 = ValueAnimator.ofFloat(this.f25150n.f25755r.x, f24);
                    ofFloat11.addUpdateListener(this.f25150n.P);
                    this.d.playTogether(ofFloat11);
                    f22 = f24;
                } else if (measuredWidth5 > i12 - f24) {
                    float measuredWidth6 = (i12 - getMeasuredWidth()) - f24;
                    ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f25150n.f25755r.x, measuredWidth6);
                    ofFloat12.addUpdateListener(this.f25150n.P);
                    this.d.playTogether(ofFloat12);
                    f22 = measuredWidth6;
                }
                int dp = AndroidUtilities.dp(36.0f) + i13;
                if (f23 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                    f23 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                    ValueAnimator ofFloat13 = ValueAnimator.ofFloat(this.f25150n.f25755r.y, f23);
                    ofFloat13.addUpdateListener(this.f25150n.Q);
                    this.d.playTogether(ofFloat13);
                } else if (measuredHeight4 > dp) {
                    f23 = dp - getMeasuredHeight();
                    ValueAnimator ofFloat14 = ValueAnimator.ofFloat(this.f25150n.f25755r.y, f23);
                    ofFloat14.addUpdateListener(this.f25150n.Q);
                    this.d.playTogether(ofFloat14);
                }
                this.d.setDuration(150L).setInterpolator(pr.f30168f);
                this.d.start();
                c30 c30Var12 = this.f25150n;
                if (c30Var12.H >= 0.0f) {
                    float[] fArr3 = c30Var12.E;
                    Point point2 = AndroidUtilities.displaySize;
                    float f25 = -AndroidUtilities.dp(36.0f);
                    fArr3[0] = (f22 - f25) / ((point2.x - (f25 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr3[1] = f23 / (point2.y - AndroidUtilities.dp(105.0f));
                    fArr3[0] = Math.min(1.0f, Math.max(0.0f, fArr3[0]));
                    fArr3[1] = Math.min(1.0f, Math.max(0.0f, fArr3[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    c30 c30Var13 = this.f25150n;
                    float f26 = c30Var13.E[0];
                    c30Var13.H = f26;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f26);
                    c30 c30Var14 = this.f25150n;
                    float f27 = c30Var14.E[1];
                    c30Var14.I = f27;
                    putFloat.putFloat("relativeY", f27).apply();
                }
            }
            c30 c30Var15 = this.f25150n;
            c30Var15.T = false;
            c30Var15.f(false);
            return true;
        }
        getLocationOnScreen(this.f25150n.D);
        c30 c30Var16 = this.f25150n;
        int i14 = c30Var16.D[0];
        WindowManager.LayoutParams layoutParams = c30Var16.f25755r;
        c30Var16.N = i14 - layoutParams.x;
        c30Var16.O = iArr[1] - layoutParams.y;
        this.f25145a = rawX;
        this.f25146b = rawY;
        System.currentTimeMillis();
        AndroidUtilities.runOnUIThread(this.f25148e, 300L);
        c30 c30Var17 = this.f25150n;
        WindowManager.LayoutParams layoutParams2 = c30Var17.f25755r;
        c30Var17.L = layoutParams2.x;
        c30Var17.M = layoutParams2.y;
        c30Var17.U = true;
        c30Var17.a();
        return true;
    }
}
