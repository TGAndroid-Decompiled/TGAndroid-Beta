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
public final class k51 extends Dialog {
    public final org.telegram.ui.Components.ht E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.f6 L;
    public MessageObject M;
    public i51 N;
    public org.telegram.ui.Cells.t1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.l8 V;
    public boolean W;
    public te X;
    public a3.g0 Y;
    public final f51 Z;
    public final Context f37917a;
    public float f37918a0;
    public final j0 f37919b;
    public boolean f37920b0;
    public final ah.w f37921c;
    public org.telegram.ui.ActionBar.b2 f37922c0;
    public org.telegram.ui.Components.w01 d;
    public ValueAnimator f37923d0;
    public i0.c f37924e;
    public ValueAnimator f37925e0;
    public Bitmap f37926f;
    public BitmapShader h;
    public Paint f37927n;
    public Matrix f37928r;
    public float f37929s;
    public float v;
    public org.telegram.ui.Components.g71 f37930w;
    public di.f4 f37931x;
    public TextView f37932y;

    public k51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.f37924e = i0.c.f11424e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new f51(this, 0);
        this.f37918a0 = 0.0f;
        this.f37920b0 = false;
        this.f37917a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        j0 j0Var = new j0(this, activity, 22);
        this.f37919b = j0Var;
        j0Var.setOnClickListener(new g51(this, 0));
        ah.w wVar = new ah.w(this, activity);
        this.f37921c = wVar;
        wVar.setClipToPadding(false);
        j0Var.addView(wVar, w7.x5.e(-1, -1, 119));
        h51 h51Var = new h51(this, 0);
        WeakHashMap weakHashMap = r0.i0.f44697a;
        r0.a0.j(j0Var, h51Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.ht();
        }
    }

    public final void c(boolean z10, f51 f51Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f37923d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f37925e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f37929s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f37923d0 = ofFloat;
        ofFloat.addUpdateListener(new ah.l0(11, this, z10));
        this.f37923d0.addListener(new ah.r0(this, z10, f51Var, 11));
        if (!z10 && this.Y == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f37923d0;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        valueAnimator3.setInterpolator(prVar);
        this.f37923d0.setDuration(j3);
        this.f37923d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f37925e0 = ofFloat2;
        ofFloat2.addUpdateListener(new b21(this, 7));
        this.f37925e0.addListener(new e50(8, this, z10));
        this.f37925e0.setDuration(((float) j3) * 1.5f);
        this.f37925e0.setInterpolator(prVar);
        this.f37925e0.start();
    }

    public final void d() {
        if (!this.H) {
            j0 j0Var = this.f37919b;
            if (j0Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.O;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int width = j0Var.getWidth();
                    i0.c cVar = this.f37924e;
                    this.F = (iArr[0] - this.f37924e.f11425a) - ((((width - cVar.f11425a) - cVar.f11427c) - this.O.getWidth()) / 2.0f);
                    int height = j0Var.getHeight();
                    i0.c cVar2 = this.f37924e;
                    this.G = org.telegram.messenger.w1.y(((height - cVar2.f11426b) - cVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.f37924e.f11426b);
                    if (!this.J) {
                        this.J = true;
                        float clamp = (Utilities.clamp((this.O.getHeight() / 2.0f) + iArr[1], j0Var.getHeight() * 0.7f, j0Var.getHeight() * 0.3f) - (this.O.getHeight() / 2.0f)) - ((j0Var.getHeight() - this.O.getHeight()) / 2.0f);
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
        i51 i51Var;
        if (!this.f37920b0) {
            org.telegram.ui.ActionBar.b2 b2Var = this.f37922c0;
            if (b2Var != null) {
                b2Var.dismiss();
                this.f37922c0 = null;
            }
            this.f37920b0 = true;
            di.f4 f4Var = this.f37931x;
            if (f4Var != null) {
                f4Var.e(true);
            }
            org.telegram.ui.Components.g71 g71Var = this.f37930w;
            if (g71Var != null) {
                g71Var.B();
                this.f37930w.H();
                this.f37930w = null;
            }
            if (!this.S && (i51Var = this.N) != null && i51Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.io0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f37929s;
                org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f27219n;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new f51(this, 3));
            j0 j0Var = this.f37919b;
            j0Var.invalidate();
            a3.g0 g0Var = this.Y;
            if (g0Var != null) {
                org.telegram.ui.Cells.t1 t1Var2 = this.O;
                if (t1Var2 != null) {
                    t1Var2.f22939fd = true;
                }
                AndroidUtilities.runOnUIThread(g0Var);
                this.Y = null;
                org.telegram.ui.Components.w01 w01Var = new org.telegram.ui.Components.w01(this.f37917a, null);
                this.d = w01Var;
                j0Var.addView(w01Var, w7.x5.e(-1, -1, 119));
                org.telegram.ui.Components.w01 w01Var2 = this.d;
                i51 i51Var2 = this.N;
                f51 f51Var = new f51(this, 1);
                org.telegram.ui.Components.u01 u01Var = w01Var2.f32052a;
                if (u01Var != null) {
                    u01Var.e(i51Var2, 1.5f, f51Var);
                    Choreographer.getInstance().postFrameCallback(w01Var2.f32053b);
                } else {
                    org.telegram.ui.Components.v01 v01Var = new org.telegram.ui.Components.v01(i51Var2, f51Var);
                    v01Var.f31037g = 1.5f;
                    w01Var2.f32054c.add(v01Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.ht htVar = this.E;
            if (htVar != null) {
                PowerManager.WakeLock wakeLock = htVar.h;
                SensorManager sensorManager = htVar.f26833a;
                if (htVar.f26838n) {
                    Sensor sensor = htVar.f26837f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(htVar, sensor);
                    }
                    Sensor sensor2 = htVar.f26836e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(htVar, sensor2);
                    }
                    Sensor sensor3 = htVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(htVar, sensor3);
                    }
                    sensorManager.unregisterListener(htVar, htVar.f26835c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    htVar.f26838n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f37929s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f37929s));
            di.f4 f4Var = this.f37931x;
            if (f4Var != null) {
                f4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f37929s));
                this.f37931x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f37929s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b2 b2Var = this.f37922c0;
        if (b2Var != null) {
            b2Var.dismiss();
            this.f37922c0 = null;
        } else if (!this.f37920b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f20198a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f20198a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new h51(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new h51(this, 2));
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f20198a;
            this.f37922c0 = b2Var2;
            b2Var2.show();
            TextView textView = (TextView) this.f37922c0.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false));
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
        j0 j0Var = this.f37919b;
        setContentView(j0Var, layoutParams);
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
        j0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(j0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.t1 t1Var = this.O;
            if (t1Var != null) {
                t1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new oj0(8, this, t1Var), 14.0f);
            this.W = true;
            c(true, null);
            te teVar = this.X;
            if (teVar != null) {
                AndroidUtilities.runOnUIThread(teVar);
                this.X = null;
            }
            org.telegram.ui.Components.ht htVar = this.E;
            if (htVar != null) {
                PowerManager.WakeLock wakeLock = htVar.h;
                SensorManager sensorManager = htVar.f26833a;
                if (!htVar.f26838n) {
                    Sensor sensor = htVar.f26837f;
                    if (sensor != null) {
                        sensorManager.registerListener(htVar, sensor, 30000);
                    }
                    Sensor sensor2 = htVar.f26836e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(htVar, sensor2, 30000);
                    }
                    Sensor sensor3 = htVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(htVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(htVar, htVar.f26835c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    htVar.f26838n = true;
                }
            }
        }
    }
}
