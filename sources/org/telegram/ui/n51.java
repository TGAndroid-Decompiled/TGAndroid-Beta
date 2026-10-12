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
public final class n51 extends Dialog {
    public final org.telegram.ui.Components.cu E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.c6 L;
    public MessageObject M;
    public l51 N;
    public org.telegram.ui.Cells.u1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.m8 V;
    public boolean W;
    public ze X;
    public a3.h0 Y;
    public final i51 Z;
    public final Context f40219a;
    public float f40220a0;
    public final k0 f40221b;
    public boolean f40222b0;
    public final ci.m6 f40223c;
    public org.telegram.ui.ActionBar.a2 f40224c0;
    public org.telegram.ui.Components.i21 d;
    public ValueAnimator f40225d0;
    public i0.b f40226e;
    public ValueAnimator f40227e0;
    public Bitmap f40228f;
    public BitmapShader h;
    public Paint f40229n;
    public Matrix f40230r;
    public float f40231s;
    public float v;
    public org.telegram.ui.Components.q81 f40232w;
    public ci.d4 f40233x;
    public TextView f40234y;

    public n51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.f40226e = i0.b.f11573e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new i51(this, 0);
        this.f40220a0 = 0.0f;
        this.f40222b0 = false;
        this.f40219a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        k0 k0Var = new k0(this, activity, 22);
        this.f40221b = k0Var;
        k0Var.setOnClickListener(new j51(this, 0));
        ci.m6 m6Var = new ci.m6(this, activity);
        this.f40223c = m6Var;
        m6Var.setClipToPadding(false);
        k0Var.addView(m6Var, w7.w5.e(-1, -1, 119));
        k51 k51Var = new k51(this, 0);
        WeakHashMap weakHashMap = r0.i0.f46989a;
        r0.a0.i(k0Var, k51Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.cu();
        }
    }

    public final void c(boolean z10, i51 i51Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f40225d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f40227e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f40231s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40225d0 = ofFloat;
        ofFloat.addUpdateListener(new ai.cb(10, this, z10));
        this.f40225d0.addListener(new androidx.fragment.app.g(this, z10, i51Var, 10));
        if (!z10 && this.Y == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f40225d0;
        org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.h;
        valueAnimator3.setInterpolator(jsVar);
        this.f40225d0.setDuration(j3);
        this.f40225d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f40227e0 = ofFloat2;
        ofFloat2.addUpdateListener(new a21(this, 7));
        this.f40227e0.addListener(new h70(7, this, z10));
        this.f40227e0.setDuration(((float) j3) * 1.5f);
        this.f40227e0.setInterpolator(jsVar);
        this.f40227e0.start();
    }

    public final void d() {
        if (!this.H) {
            k0 k0Var = this.f40221b;
            if (k0Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.O;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int width = k0Var.getWidth();
                    i0.b bVar = this.f40226e;
                    this.F = (iArr[0] - this.f40226e.f11574a) - ((((width - bVar.f11574a) - bVar.f11576c) - this.O.getWidth()) / 2.0f);
                    int height = k0Var.getHeight();
                    i0.b bVar2 = this.f40226e;
                    this.G = org.telegram.messenger.v0.y(((height - bVar2.f11575b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.f40226e.f11575b);
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
        l51 l51Var;
        if (!this.f40222b0) {
            org.telegram.ui.ActionBar.a2 a2Var = this.f40224c0;
            if (a2Var != null) {
                a2Var.dismiss();
                this.f40224c0 = null;
            }
            this.f40222b0 = true;
            ci.d4 d4Var = this.f40233x;
            if (d4Var != null) {
                d4Var.e(true);
            }
            org.telegram.ui.Components.q81 q81Var = this.f40232w;
            if (q81Var != null) {
                q81Var.B();
                this.f40232w.H();
                this.f40232w = null;
            }
            if (!this.S && (l51Var = this.N) != null && l51Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.tp0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f40231s;
                org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f30934n;
                if (u1Var != null) {
                    u1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new i51(this, 3));
            k0 k0Var = this.f40221b;
            k0Var.invalidate();
            a3.h0 h0Var = this.Y;
            if (h0Var != null) {
                org.telegram.ui.Cells.u1 u1Var2 = this.O;
                if (u1Var2 != null) {
                    u1Var2.f22965fd = true;
                }
                AndroidUtilities.runOnUIThread(h0Var);
                this.Y = null;
                org.telegram.ui.Components.i21 i21Var = new org.telegram.ui.Components.i21(this.f40219a, null);
                this.d = i21Var;
                k0Var.addView(i21Var, w7.w5.e(-1, -1, 119));
                org.telegram.ui.Components.i21 i21Var2 = this.d;
                l51 l51Var2 = this.N;
                i51 i51Var = new i51(this, 1);
                org.telegram.ui.Components.g21 g21Var = i21Var2.f27006a;
                if (g21Var != null) {
                    g21Var.e(l51Var2, 1.5f, i51Var);
                    Choreographer.getInstance().postFrameCallback(i21Var2.f27007b);
                } else {
                    org.telegram.ui.Components.h21 h21Var = new org.telegram.ui.Components.h21(l51Var2, i51Var);
                    h21Var.f26624g = 1.5f;
                    i21Var2.f27008c.add(h21Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.cu cuVar = this.E;
            if (cuVar != null) {
                PowerManager.WakeLock wakeLock = cuVar.h;
                SensorManager sensorManager = cuVar.f25000a;
                if (cuVar.f25005n) {
                    Sensor sensor = cuVar.f25004f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(cuVar, sensor);
                    }
                    Sensor sensor2 = cuVar.f25003e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(cuVar, sensor2);
                    }
                    Sensor sensor3 = cuVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(cuVar, sensor3);
                    }
                    sensorManager.unregisterListener(cuVar, cuVar.f25002c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    cuVar.f25005n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f40231s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f40231s));
            ci.d4 d4Var = this.f40233x;
            if (d4Var != null) {
                d4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f40231s));
                this.f40233x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f40231s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.a2 a2Var = this.f40224c0;
        if (a2Var != null) {
            a2Var.dismiss();
            this.f40224c0 = null;
        } else if (!this.f40222b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f20142a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f20142a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new k51(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new k51(this, 2));
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f20142a;
            this.f40224c0 = a2Var2;
            a2Var2.show();
            TextView textView = (TextView) this.f40224c0.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
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
        k0 k0Var = this.f40221b;
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
            AndroidUtilities.makeGlobalBlurBitmap(new jt(16, this, u1Var), 14.0f);
            this.W = true;
            c(true, null);
            ze zeVar = this.X;
            if (zeVar != null) {
                AndroidUtilities.runOnUIThread(zeVar);
                this.X = null;
            }
            org.telegram.ui.Components.cu cuVar = this.E;
            if (cuVar != null) {
                PowerManager.WakeLock wakeLock = cuVar.h;
                SensorManager sensorManager = cuVar.f25000a;
                if (!cuVar.f25005n) {
                    Sensor sensor = cuVar.f25004f;
                    if (sensor != null) {
                        sensorManager.registerListener(cuVar, sensor, 30000);
                    }
                    Sensor sensor2 = cuVar.f25003e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(cuVar, sensor2, 30000);
                    }
                    Sensor sensor3 = cuVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(cuVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(cuVar, cuVar.f25002c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    cuVar.f25005n = true;
                }
            }
        }
    }
}
