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
public final class a51 extends Dialog {
    public final org.telegram.ui.Components.kt E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.d6 L;
    public MessageObject M;
    public y41 N;
    public org.telegram.ui.Cells.t1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.k8 V;
    public boolean W;
    public se X;
    public a3.h0 Y;
    public final v41 Z;
    public final Context f31666a;
    public float f31667a0;
    public final k0 f31668b;
    public boolean f31669b0;
    public final ci.m6 f31670c;
    public org.telegram.ui.ActionBar.b2 f31671c0;
    public org.telegram.ui.Components.w01 d;
    public ValueAnimator f31672d0;
    public i0.b e;
    public ValueAnimator f31673e0;
    public Bitmap f31674f;
    public BitmapShader h;
    public Paint f31675n;
    public Matrix f31676r;
    public float f31677s;
    public float v;
    public org.telegram.ui.Components.f71 f31678w;
    public ci.e4 f31679x;
    public TextView f31680y;

    public a51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new v41(this, 0);
        this.f31667a0 = 0.0f;
        this.f31669b0 = false;
        this.f31666a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        k0 k0Var = new k0(this, activity, 22);
        this.f31668b = k0Var;
        k0Var.setOnClickListener(new w41(this, 0));
        ci.m6 m6Var = new ci.m6(this, activity);
        this.f31670c = m6Var;
        m6Var.setClipToPadding(false);
        k0Var.addView(m6Var, w7.x5.e(-1, -1, 119));
        x41 x41Var = new x41(this, 0);
        WeakHashMap weakHashMap = r0.i0.f41795a;
        r0.a0.j(k0Var, x41Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.kt();
        }
    }

    public final void c(boolean z10, v41 v41Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f31672d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f31673e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f31677s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f31672d0 = ofFloat;
        ofFloat.addUpdateListener(new ai.bb(10, this, z10));
        this.f31672d0.addListener(new androidx.fragment.app.g(this, z10, v41Var, 10));
        if (!z10 && this.Y == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f31672d0;
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
        valueAnimator3.setInterpolator(rrVar);
        this.f31672d0.setDuration(j3);
        this.f31672d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f31673e0 = ofFloat2;
        ofFloat2.addUpdateListener(new s11(this, 7));
        this.f31673e0.addListener(new e70(7, this, z10));
        this.f31673e0.setDuration(((float) j3) * 1.5f);
        this.f31673e0.setInterpolator(rrVar);
        this.f31673e0.start();
    }

    public final void d() {
        if (!this.H) {
            k0 k0Var = this.f31668b;
            if (k0Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.O;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int width = k0Var.getWidth();
                    i0.b bVar = this.e;
                    this.F = (iArr[0] - this.e.f10576a) - ((((width - bVar.f10576a) - bVar.f10578c) - this.O.getWidth()) / 2.0f);
                    int height = k0Var.getHeight();
                    i0.b bVar2 = this.e;
                    this.G = org.telegram.messenger.z0.y(((height - bVar2.f10577b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.e.f10577b);
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
        y41 y41Var;
        if (!this.f31669b0) {
            org.telegram.ui.ActionBar.b2 b2Var = this.f31671c0;
            if (b2Var != null) {
                b2Var.dismiss();
                this.f31671c0 = null;
            }
            this.f31669b0 = true;
            ci.e4 e4Var = this.f31679x;
            if (e4Var != null) {
                e4Var.e(true);
            }
            org.telegram.ui.Components.f71 f71Var = this.f31678w;
            if (f71Var != null) {
                f71Var.B();
                this.f31678w.H();
                this.f31678w = null;
            }
            if (!this.S && (y41Var = this.N) != null && y41Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.io0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f31677s;
                org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f25027n;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new v41(this, 3));
            k0 k0Var = this.f31668b;
            k0Var.invalidate();
            a3.h0 h0Var = this.Y;
            if (h0Var != null) {
                org.telegram.ui.Cells.t1 t1Var2 = this.O;
                if (t1Var2 != null) {
                    t1Var2.f21026fd = true;
                }
                AndroidUtilities.runOnUIThread(h0Var);
                this.Y = null;
                org.telegram.ui.Components.w01 w01Var = new org.telegram.ui.Components.w01(this.f31666a, null);
                this.d = w01Var;
                k0Var.addView(w01Var, w7.x5.e(-1, -1, 119));
                org.telegram.ui.Components.w01 w01Var2 = this.d;
                y41 y41Var2 = this.N;
                v41 v41Var = new v41(this, 1);
                org.telegram.ui.Components.u01 u01Var = w01Var2.f29455a;
                if (u01Var != null) {
                    u01Var.e(y41Var2, 1.5f, v41Var);
                    Choreographer.getInstance().postFrameCallback(w01Var2.f29456b);
                } else {
                    org.telegram.ui.Components.v01 v01Var = new org.telegram.ui.Components.v01(y41Var2, v41Var);
                    v01Var.f28614g = 1.5f;
                    w01Var2.f29457c.add(v01Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.kt ktVar = this.E;
            if (ktVar != null) {
                PowerManager.WakeLock wakeLock = ktVar.h;
                SensorManager sensorManager = ktVar.f25683a;
                if (ktVar.f25687n) {
                    Sensor sensor = ktVar.f25686f;
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
                    sensorManager.unregisterListener(ktVar, ktVar.f25685c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    ktVar.f25687n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f31677s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f31677s));
            ci.e4 e4Var = this.f31679x;
            if (e4Var != null) {
                e4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f31677s));
                this.f31679x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f31677s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b2 b2Var = this.f31671c0;
        if (b2Var != null) {
            b2Var.dismiss();
            this.f31671c0 = null;
        } else if (!this.f31669b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f18409a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f18409a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new x41(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new x41(this, 2));
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f18409a;
            this.f31671c0 = b2Var2;
            b2Var2.show();
            TextView textView = (TextView) this.f31671c0.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
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
        k0 k0Var = this.f31668b;
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
            org.telegram.ui.Cells.t1 t1Var = this.O;
            if (t1Var != null) {
                t1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new dt(16, this, t1Var), 14.0f);
            this.W = true;
            c(true, null);
            se seVar = this.X;
            if (seVar != null) {
                AndroidUtilities.runOnUIThread(seVar);
                this.X = null;
            }
            org.telegram.ui.Components.kt ktVar = this.E;
            if (ktVar != null) {
                PowerManager.WakeLock wakeLock = ktVar.h;
                SensorManager sensorManager = ktVar.f25683a;
                if (!ktVar.f25687n) {
                    Sensor sensor = ktVar.f25686f;
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
                    sensorManager.registerListener(ktVar, ktVar.f25685c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    ktVar.f25687n = true;
                }
            }
        }
    }
}
