package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Choreographer;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class b51 extends Dialog {
    public final org.telegram.ui.Components.kt E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.d6 L;
    public MessageObject M;
    public z41 N;
    public org.telegram.ui.Cells.u1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.k8 V;
    public boolean W;
    public te X;
    public a3.h0 Y;
    public final w41 Z;
    public final Context f32321a;
    public float f32322a0;
    public final k0 f32323b;
    public boolean f32324b0;
    public final ci.m6 f32325c;
    public org.telegram.ui.ActionBar.a2 f32326c0;
    public org.telegram.ui.Components.k11 d;
    public ValueAnimator f32327d0;
    public i0.b e;
    public ValueAnimator f32328e0;
    public Bitmap f32329f;
    public BitmapShader h;
    public Paint f32330n;
    public Matrix f32331r;
    public float f32332s;
    public float v;
    public org.telegram.ui.Components.s71 f32333w;
    public ci.e4 f32334x;
    public TextView f32335y;

    public b51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new w41(this, 0);
        this.f32322a0 = 0.0f;
        this.f32324b0 = false;
        this.f32321a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        k0 k0Var = new k0(this, activity, 22);
        this.f32323b = k0Var;
        k0Var.setOnClickListener(new x41(this, 0));
        ci.m6 m6Var = new ci.m6(this, activity);
        this.f32325c = m6Var;
        m6Var.setClipToPadding(false);
        k0Var.addView(m6Var, w7.y5.e(-1, -1, 119));
        y41 y41Var = new y41(this, 0);
        WeakHashMap weakHashMap = r0.i0.f42128a;
        r0.a0.j(k0Var, y41Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.kt();
        }
    }

    public final void c(boolean z10, w41 w41Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f32327d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f32328e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f32332s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f32327d0 = ofFloat;
        ofFloat.addUpdateListener(new ai.bb(10, this, z10));
        this.f32327d0.addListener(new androidx.fragment.app.g(this, z10, w41Var, 10));
        if (!z10 && this.Y == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f32327d0;
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
        valueAnimator3.setInterpolator(rrVar);
        this.f32327d0.setDuration(j3);
        this.f32327d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f32328e0 = ofFloat2;
        ofFloat2.addUpdateListener(new q11(this, 7));
        this.f32328e0.addListener(new c70(7, this, z10));
        this.f32328e0.setDuration(((float) j3) * 1.5f);
        this.f32328e0.setInterpolator(rrVar);
        this.f32328e0.start();
    }

    public final void d() {
        if (!this.H) {
            k0 k0Var = this.f32323b;
            if (k0Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.O;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int width = k0Var.getWidth();
                    i0.b bVar = this.e;
                    this.F = (iArr[0] - this.e.f10576a) - ((((width - bVar.f10576a) - bVar.f10578c) - this.O.getWidth()) / 2.0f);
                    int height = k0Var.getHeight();
                    i0.b bVar2 = this.e;
                    this.G = org.telegram.messenger.f0.x(((height - bVar2.f10577b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.e.f10577b);
                    if (!this.J) {
                        this.J = true;
                        float clamp = (Utilities.clamp((this.O.getHeight() / 2.0f) + iArr[1], k0Var.getHeight() * 0.7f, k0Var.getHeight() * 0.3f) - (this.O.getHeight() / 2.0f)) - ((k0Var.getHeight() - this.O.getHeight()) / 2.0f);
                        this.I = clamp;
                        if (this.S) {
                            this.I = 0.0f;
                        } else {
                            this.I = AndroidUtilities.lerp(0.0f, clamp, 0.78f);
                        }
                    }
                    e();
                } else {
                    this.G = 0.0f;
                    this.F = 0.0f;
                }
                this.H = true;
            }
        }
    }

    @Override
    public final void dismiss() {
        z41 z41Var;
        if (!this.f32324b0) {
            org.telegram.ui.ActionBar.a2 a2Var = this.f32326c0;
            if (a2Var != null) {
                a2Var.dismiss();
                this.f32326c0 = null;
            }
            this.f32324b0 = true;
            ci.e4 e4Var = this.f32334x;
            if (e4Var != null) {
                e4Var.e(true);
            }
            org.telegram.ui.Components.s71 s71Var = this.f32333w;
            if (s71Var != null) {
                s71Var.B();
                this.f32333w.H();
                this.f32333w = null;
            }
            if (!this.S && (z41Var = this.N) != null && z41Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.vo0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f32332s;
                org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f29241n;
                if (u1Var != null) {
                    u1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new w41(this, 3));
            k0 k0Var = this.f32323b;
            k0Var.invalidate();
            a3.h0 h0Var = this.Y;
            if (h0Var != null) {
                org.telegram.ui.Cells.u1 u1Var2 = this.O;
                if (u1Var2 != null) {
                    u1Var2.f21341fd = true;
                }
                AndroidUtilities.runOnUIThread(h0Var);
                this.Y = null;
                org.telegram.ui.Components.k11 k11Var = new org.telegram.ui.Components.k11(this.f32321a, null);
                this.d = k11Var;
                k0Var.addView(k11Var, w7.y5.e(-1, -1, 119));
                org.telegram.ui.Components.k11 k11Var2 = this.d;
                z41 z41Var2 = this.N;
                w41 w41Var = new w41(this, 1);
                org.telegram.ui.Components.i11 i11Var = k11Var2.f25596a;
                if (i11Var != null) {
                    i11Var.e(z41Var2, 1.5f, w41Var);
                    Choreographer.getInstance().postFrameCallback(k11Var2.f25597b);
                } else {
                    org.telegram.ui.Components.j11 j11Var = new org.telegram.ui.Components.j11(z41Var2, w41Var);
                    j11Var.f25243g = 1.5f;
                    k11Var2.f25598c.add(j11Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.kt ktVar = this.E;
            if (ktVar != null) {
                PowerManager.WakeLock wakeLock = ktVar.h;
                SensorManager sensorManager = ktVar.f25867a;
                if (ktVar.f25871n) {
                    Sensor sensor = ktVar.f25870f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(ktVar, sensor);
                    }
                    Sensor sensor2 = ktVar.e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(ktVar, sensor2);
                    }
                    Sensor sensor3 = ktVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(ktVar, sensor3);
                    }
                    sensorManager.unregisterListener(ktVar, ktVar.f25869c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    ktVar.f25871n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f32332s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f32332s));
            ci.e4 e4Var = this.f32334x;
            if (e4Var != null) {
                e4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f32332s));
                this.f32334x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f32332s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.a2 a2Var = this.f32326c0;
        if (a2Var != null) {
            a2Var.dismiss();
            this.f32326c0 = null;
        } else if (!this.f32324b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f18661a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f18661a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new y41(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new y41(this, 2));
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f18661a;
            this.f32326c0 = a2Var2;
            a2Var2.show();
            TextView textView = (TextView) this.f32326c0.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19298q7, false));
            }
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        k0 k0Var = this.f32323b;
        setContentView(k0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i10;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            attributes.flags = i10 | (-2013060864);
            AndroidUtilities.logFlagSecure();
        }
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        k0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(k0Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.u1 u1Var = this.O;
            if (u1Var != null) {
                u1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new bt(16, this, u1Var), 14.0f);
            this.W = true;
            c(true, null);
            te teVar = this.X;
            if (teVar != null) {
                AndroidUtilities.runOnUIThread(teVar);
                this.X = null;
            }
            org.telegram.ui.Components.kt ktVar = this.E;
            if (ktVar != null) {
                PowerManager.WakeLock wakeLock = ktVar.h;
                SensorManager sensorManager = ktVar.f25867a;
                if (!ktVar.f25871n) {
                    Sensor sensor = ktVar.f25870f;
                    if (sensor != null) {
                        sensorManager.registerListener(ktVar, sensor, 30000);
                    }
                    Sensor sensor2 = ktVar.e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(ktVar, sensor2, 30000);
                    }
                    Sensor sensor3 = ktVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(ktVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(ktVar, ktVar.f25869c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    ktVar.f25871n = true;
                }
            }
        }
    }
}
