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
public final class h20 extends FrameLayout {
    public float f28949a;
    public float f28950b;
    public boolean f28951c;
    public AnimatorSet d;
    public final g20 f28952e;
    public final hc f28953f;
    public final float h;
    public final j20 f28954n;

    public h20(j20 j20Var, Context context, float f10) {
        super(context);
        this.f28954n = j20Var;
        this.h = f10;
        this.f28952e = new g20(this);
        this.f28953f = new hc(11);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        Point point = AndroidUtilities.displaySize;
        int i11 = point.x;
        j20 j20Var = this.f28954n;
        if (i11 != j20Var.E || j20Var.F != point.y) {
            j20Var.E = i11;
            j20Var.F = point.y;
            if (j20Var.G < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                this.f28954n.G = sharedPreferences.getFloat("relativeX", 1.0f);
                this.f28954n.H = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            j20 j20Var2 = j20.Z;
            if (j20Var2 != null) {
                j20 j20Var3 = this.f28954n;
                float f10 = j20Var3.G;
                float f11 = j20Var3.H;
                float f12 = -AndroidUtilities.dp(36.0f);
                j20Var2.f29604r.x = (int) e2.c.z(AndroidUtilities.displaySize.x - (2.0f * f12), AndroidUtilities.dp(105.0f), f10, f12);
                j20Var2.f29604r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f11);
                j20Var2.h();
                h20 h20Var = j20Var2.f29598a;
                if (h20Var.getParent() != null) {
                    j20Var2.f29603n.updateViewLayout(h20Var, j20Var2.f29604r);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int[] iArr;
        j20 j20Var;
        fh.d2 d2Var;
        long j10;
        j20 j20Var2;
        j20 j20Var3;
        int i9;
        boolean z10;
        boolean z11;
        float f10;
        double d;
        if (j20.Z != null) {
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
                        float f11 = rawX - this.f28949a;
                        float f12 = rawY - this.f28950b;
                        if (!this.f28954n.S) {
                            float f13 = (f12 * f12) + (f11 * f11);
                            float f14 = this.h;
                            if (f13 > f14 * f14) {
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                AndroidUtilities.cancelRunOnUIThread(this.f28952e);
                                j20 j20Var4 = this.f28954n;
                                j20Var4.S = true;
                                j20Var4.f(true);
                                this.f28954n.e(false);
                                this.f28949a = rawX;
                                this.f28950b = rawY;
                                f11 = 0.0f;
                                f12 = 0.0f;
                            }
                        }
                        j20 j20Var5 = this.f28954n;
                        if (!j20Var5.S) {
                            return true;
                        }
                        j20Var5.K += f11;
                        j20Var5.L += f12;
                        this.f28949a = rawX;
                        this.f28950b = rawY;
                        j20Var5.i();
                        float measuredWidth = (getMeasuredWidth() / 2.0f) + this.f28954n.K;
                        float measuredHeight = (getMeasuredHeight() / 2.0f) + this.f28954n.L;
                        float measuredWidth2 = (j20Var2.f29599b.getMeasuredWidth() / 2.0f) + (j20Var2.J - this.f28954n.M);
                        float measuredHeight2 = (j20Var3.f29599b.getMeasuredHeight() / 2.0f) + (j20Var3.I - this.f28954n.N);
                        float f15 = measuredWidth - measuredWidth2;
                        float f16 = measuredHeight - measuredHeight2;
                        float f17 = (f16 * f16) + (f15 * f15);
                        if (f17 < AndroidUtilities.dp(80.0f) * AndroidUtilities.dp(80.0f)) {
                            i9 = 0;
                            double degrees = Math.toDegrees(Math.atan(f15 / f16));
                            if ((measuredWidth > measuredWidth2 && measuredHeight < measuredHeight2) || (measuredWidth < measuredWidth2 && measuredHeight < measuredHeight2)) {
                                d = 270.0d;
                            } else {
                                d = 90.0d;
                            }
                            this.f28954n.Q.setRemoveAngle(d - degrees);
                            if (f17 < AndroidUtilities.dp(50.0f) * AndroidUtilities.dp(50.0f)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z11 = true;
                        } else {
                            i9 = 0;
                            z10 = false;
                            z11 = false;
                        }
                        j20 j20Var6 = this.f28954n;
                        if (!j20Var6.B && j20Var6.W != z10) {
                            j20Var6.W = z10;
                            ValueAnimator valueAnimator = j20Var6.Y;
                            if (valueAnimator != null) {
                                valueAnimator.removeAllListeners();
                                j20Var6.Y.cancel();
                            }
                            float f18 = j20Var6.X;
                            if (z10) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            float[] fArr = new float[2];
                            fArr[i9] = f18;
                            fArr[1] = f10;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            j20Var6.Y = ofFloat;
                            ofFloat.addUpdateListener(new e6(j20Var6, 25));
                            j20Var6.Y.addListener(new u9(10, j20Var6, z10));
                            j20Var6.Y.setDuration(250L);
                            j20Var6.Y.setInterpolator(gr.f28844f);
                            j20Var6.Y.start();
                        }
                        j20 j20Var7 = this.f28954n;
                        p20 p20Var = j20Var7.Q;
                        if (j20Var7.f29608y != z11) {
                            j20Var7.f29608y = z11;
                            j20Var7.f29600c.invalidate();
                            if (!j20Var7.B) {
                                mi0 mi0Var = j20Var7.v;
                                if (z11) {
                                    i9 = 33;
                                }
                                mi0Var.N(i9);
                                j20Var7.R.d();
                            }
                            if (z11) {
                                try {
                                    p20Var.performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        if (p20Var.f31523s != z11) {
                            p20Var.invalidate();
                        }
                        p20Var.f31523s = z11;
                        return true;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(this.f28953f);
                AndroidUtilities.cancelRunOnUIThread(this.f28952e);
                j20 j20Var8 = this.f28954n;
                if (j20Var8.f29608y) {
                    if (this.f28951c && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().setMicMute(true, false, false);
                    }
                    this.f28951c = false;
                    j20 j20Var9 = this.f28954n;
                    pi0 pi0Var = j20Var9.R;
                    mi0 mi0Var2 = j20Var9.v;
                    fh.d2 d2Var2 = j20Var9.f29599b;
                    h20 h20Var = j20Var9.f29598a;
                    kh.h6 h6Var = j20Var9.f29600c;
                    j20 j20Var10 = j20.Z;
                    if (j20Var10 != null) {
                        j20Var9.B = true;
                        j20.f29597a0 = true;
                        j20Var9.Q.G = true;
                        j20Var10.e(false);
                        float measuredWidth3 = (h20Var.getMeasuredWidth() / 2.0f) + j20Var9.f29604r.x;
                        float measuredWidth4 = ((d2Var2.getMeasuredWidth() / 2.0f) + (j20Var9.J - j20Var9.M)) - measuredWidth3;
                        float measuredHeight3 = ((d2Var2.getMeasuredHeight() / 2.0f) + (j20Var9.I - j20Var9.N)) - ((h20Var.getMeasuredHeight() / 2.0f) + j20Var9.f29604r.y);
                        j20 j20Var11 = j20.Z;
                        WindowManager windowManager = j20Var11.f29603n;
                        h20 h20Var2 = j20Var11.f29598a;
                        fh.d2 d2Var3 = j20Var11.f29599b;
                        FrameLayout frameLayout = j20Var11.d;
                        org.telegram.ui.t7 t7Var = j20Var11.f29601e;
                        j20Var9.d();
                        j20.Z = null;
                        AnimatorSet animatorSet = new AnimatorSet();
                        int i10 = mi0Var2.X;
                        if (i10 < 33) {
                            d2Var = d2Var3;
                            j10 = ((1.0f - (i10 / 33.0f)) * ((float) mi0Var2.p())) / 2.0f;
                        } else {
                            d2Var = d2Var3;
                            j10 = 0;
                        }
                        long j11 = j10;
                        float f19 = j20Var9.f29604r.x;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f19, measuredWidth4 + f19);
                        ofFloat2.addUpdateListener(j20Var9.O);
                        ValueAnimator duration = ofFloat2.setDuration(250L);
                        gr grVar = gr.f28844f;
                        duration.setInterpolator(grVar);
                        animatorSet.playTogether(ofFloat2);
                        float f20 = j20Var9.f29604r.y;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f20, (f20 + measuredHeight3) - AndroidUtilities.dp(30.0f), j20Var9.f29604r.y + measuredHeight3);
                        ofFloat3.addUpdateListener(j20Var9.P);
                        ofFloat3.setDuration(250L).setInterpolator(grVar);
                        animatorSet.playTogether(ofFloat3);
                        float[] fArr2 = {h20Var2.getScaleX(), 0.1f};
                        Property property = View.SCALE_X;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(h20Var2, property, fArr2).setDuration(180L));
                        float[] fArr3 = {h20Var2.getScaleY(), 0.1f};
                        Property property2 = View.SCALE_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(h20Var2, property2, fArr3).setDuration(180L));
                        Property property3 = View.ALPHA;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(h20Var2, property3, 1.0f, 0.0f);
                        float f21 = (float) 350;
                        ofFloat4.setStartDelay(f21 * 0.7f);
                        ofFloat4.setDuration(f21 * 0.3f);
                        animatorSet.playTogether(ofFloat4);
                        AndroidUtilities.runOnUIThread(new hc(10), 370L);
                        long j12 = j11 + 530;
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(h6Var, property, 1.0f, 1.05f);
                        ofFloat5.setDuration(j12);
                        gr grVar2 = gr.f28847j;
                        ofFloat5.setInterpolator(grVar2);
                        animatorSet.playTogether(ofFloat5);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(h6Var, property2, 1.0f, 1.05f);
                        ofFloat6.setDuration(j12);
                        ofFloat6.setInterpolator(grVar2);
                        animatorSet.playTogether(ofFloat6);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(h6Var, property, 1.0f, 0.3f);
                        ofFloat7.setStartDelay(j12);
                        ofFloat7.setDuration(350L);
                        gr grVar3 = gr.h;
                        ofFloat7.setInterpolator(grVar3);
                        animatorSet.playTogether(ofFloat7);
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(h6Var, property2, 1.0f, 0.3f);
                        ofFloat8.setStartDelay(j12);
                        ofFloat8.setDuration(350L);
                        ofFloat8.setInterpolator(grVar3);
                        animatorSet.playTogether(ofFloat8);
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(h6Var, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
                        ofFloat9.setStartDelay(j12);
                        ofFloat9.setDuration(350L);
                        ofFloat9.setInterpolator(grVar3);
                        animatorSet.playTogether(ofFloat9);
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(h6Var, property3, 1.0f, 0.0f);
                        ofFloat10.setStartDelay(j12);
                        ofFloat10.setDuration(350L);
                        ofFloat10.setInterpolator(grVar3);
                        animatorSet.playTogether(ofFloat10);
                        animatorSet.addListener(new i20(j20Var9, h20Var2, d2Var, windowManager, frameLayout, t7Var));
                        animatorSet.start();
                        mi0Var2.N(66);
                        pi0Var.i();
                        pi0Var.d();
                        return false;
                    }
                } else {
                    j20Var8.T = false;
                    j20Var8.a();
                    if (this.f28951c) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(true, false, false);
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused2) {
                            }
                        }
                        this.f28951c = false;
                    } else if (motionEvent.getAction() == 1 && !this.f28954n.S) {
                        if (VoIPService.getSharedInstance() != null) {
                            this.f28954n.e(!j20Var.f29606w);
                            return false;
                        }
                    }
                    if (parent != null && this.f28954n.S) {
                        parent.requestDisallowInterceptTouchEvent(false);
                        Point point = AndroidUtilities.displaySize;
                        int i11 = point.x;
                        int i12 = point.y;
                        float f22 = this.f28954n.f29604r.x;
                        float measuredWidth5 = getMeasuredWidth() + f22;
                        float f23 = this.f28954n.f29604r.y;
                        float measuredHeight4 = getMeasuredHeight() + f23;
                        this.d = new AnimatorSet();
                        float f24 = -AndroidUtilities.dp(36.0f);
                        if (f22 < f24) {
                            ValueAnimator ofFloat11 = ValueAnimator.ofFloat(this.f28954n.f29604r.x, f24);
                            ofFloat11.addUpdateListener(this.f28954n.O);
                            this.d.playTogether(ofFloat11);
                            f22 = f24;
                        } else if (measuredWidth5 > i11 - f24) {
                            float measuredWidth6 = (i11 - getMeasuredWidth()) - f24;
                            ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f28954n.f29604r.x, measuredWidth6);
                            ofFloat12.addUpdateListener(this.f28954n.O);
                            this.d.playTogether(ofFloat12);
                            f22 = measuredWidth6;
                        }
                        int dp = AndroidUtilities.dp(36.0f) + i12;
                        if (f23 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                            f23 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                            ValueAnimator ofFloat13 = ValueAnimator.ofFloat(this.f28954n.f29604r.y, f23);
                            ofFloat13.addUpdateListener(this.f28954n.P);
                            this.d.playTogether(ofFloat13);
                        } else if (measuredHeight4 > dp) {
                            f23 = dp - getMeasuredHeight();
                            ValueAnimator ofFloat14 = ValueAnimator.ofFloat(this.f28954n.f29604r.y, f23);
                            ofFloat14.addUpdateListener(this.f28954n.P);
                            this.d.playTogether(ofFloat14);
                        }
                        this.d.setDuration(150L).setInterpolator(gr.f28844f);
                        this.d.start();
                        j20 j20Var12 = this.f28954n;
                        if (j20Var12.G >= 0.0f) {
                            float[] fArr4 = j20Var12.D;
                            Point point2 = AndroidUtilities.displaySize;
                            float f25 = -AndroidUtilities.dp(36.0f);
                            fArr4[0] = (f22 - f25) / ((point2.x - (f25 * 2.0f)) - AndroidUtilities.dp(105.0f));
                            fArr4[1] = f23 / (point2.y - AndroidUtilities.dp(105.0f));
                            fArr4[0] = Math.min(1.0f, Math.max(0.0f, fArr4[0]));
                            fArr4[1] = Math.min(1.0f, Math.max(0.0f, fArr4[1]));
                            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                            j20 j20Var13 = this.f28954n;
                            float f26 = j20Var13.D[0];
                            j20Var13.G = f26;
                            SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f26);
                            j20 j20Var14 = this.f28954n;
                            float f27 = j20Var14.D[1];
                            j20Var14.H = f27;
                            putFloat.putFloat("relativeY", f27).apply();
                        }
                    }
                    j20 j20Var15 = this.f28954n;
                    j20Var15.S = false;
                    j20Var15.f(false);
                    return true;
                }
            } else {
                getLocationOnScreen(this.f28954n.C);
                j20 j20Var16 = this.f28954n;
                int i13 = j20Var16.C[0];
                WindowManager.LayoutParams layoutParams = j20Var16.f29604r;
                j20Var16.M = i13 - layoutParams.x;
                j20Var16.N = iArr[1] - layoutParams.y;
                this.f28949a = rawX;
                this.f28950b = rawY;
                System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(this.f28952e, 300L);
                j20 j20Var17 = this.f28954n;
                WindowManager.LayoutParams layoutParams2 = j20Var17.f29604r;
                j20Var17.K = layoutParams2.x;
                j20Var17.L = layoutParams2.y;
                j20Var17.T = true;
                j20Var17.a();
                return true;
            }
        }
        return false;
    }
}
