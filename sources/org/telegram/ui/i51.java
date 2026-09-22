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
public final class i51 extends Dialog {
    public final org.telegram.ui.Components.jt E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.e6 L;
    public MessageObject M;
    public g51 N;
    public org.telegram.ui.Cells.t1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.i8 V;
    public boolean W;
    public se X;
    public a3.h0 Y;
    public final d51 Z;
    public final Context f34412a;
    public float f34413a0;
    public final j0 f34414b;
    public boolean f34415b0;
    public final ci.n6 f34416c;
    public org.telegram.ui.ActionBar.b2 f34417c0;
    public org.telegram.ui.Components.x01 d;
    public ValueAnimator f34418d0;
    public i0.b e;
    public ValueAnimator f34419e0;
    public Bitmap f34420f;
    public BitmapShader h;
    public Paint f34421n;
    public Matrix f34422r;
    public float f34423s;
    public float v;
    public org.telegram.ui.Components.g71 f34424w;
    public ci.f4 f34425x;
    public TextView f34426y;

    public i51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new d51(this, 0);
        this.f34413a0 = 0.0f;
        this.f34415b0 = false;
        this.f34412a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        j0 j0Var = new j0(this, activity, 22);
        this.f34414b = j0Var;
        j0Var.setOnClickListener(new e51(this, 0));
        ci.n6 n6Var = new ci.n6(this, activity);
        this.f34416c = n6Var;
        n6Var.setClipToPadding(false);
        j0Var.addView(n6Var, w7.x5.e(-1, -1, 119));
        f51 f51Var = new f51(this, 0);
        WeakHashMap weakHashMap = r0.i0.f41839a;
        r0.a0.j(j0Var, f51Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.jt();
        }
    }

    public final void c(boolean z10, d51 d51Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f34418d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f34419e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f34423s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f34418d0 = ofFloat;
        ofFloat.addUpdateListener(new ai.bb(10, this, z10));
        this.f34418d0.addListener(new androidx.fragment.app.g(this, z10, d51Var, 10));
        if (!z10 && this.Y == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f34418d0;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        valueAnimator3.setInterpolator(qrVar);
        this.f34418d0.setDuration(j3);
        this.f34418d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f34419e0 = ofFloat2;
        ofFloat2.addUpdateListener(new a21(this, 7));
        this.f34419e0.addListener(new h70(7, this, z10));
        this.f34419e0.setDuration(((float) j3) * 1.5f);
        this.f34419e0.setInterpolator(qrVar);
        this.f34419e0.start();
    }

    public final void d() {
        if (!this.H) {
            j0 j0Var = this.f34414b;
            if (j0Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.O;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int width = j0Var.getWidth();
                    i0.b bVar = this.e;
                    this.F = (iArr[0] - this.e.f10590a) - ((((width - bVar.f10590a) - bVar.f10592c) - this.O.getWidth()) / 2.0f);
                    int height = j0Var.getHeight();
                    i0.b bVar2 = this.e;
                    this.G = org.telegram.messenger.y0.y(((height - bVar2.f10591b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.e.f10591b);
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
        g51 g51Var;
        if (!this.f34415b0) {
            org.telegram.ui.ActionBar.b2 b2Var = this.f34417c0;
            if (b2Var != null) {
                b2Var.dismiss();
                this.f34417c0 = null;
            }
            this.f34415b0 = true;
            ci.f4 f4Var = this.f34425x;
            if (f4Var != null) {
                f4Var.e(true);
            }
            org.telegram.ui.Components.g71 g71Var = this.f34424w;
            if (g71Var != null) {
                g71Var.B();
                this.f34424w.H();
                this.f34424w = null;
            }
            if (!this.S && (g51Var = this.N) != null && g51Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.io0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f34423s;
                org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f25100n;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new d51(this, 3));
            j0 j0Var = this.f34414b;
            j0Var.invalidate();
            a3.h0 h0Var = this.Y;
            if (h0Var != null) {
                org.telegram.ui.Cells.t1 t1Var2 = this.O;
                if (t1Var2 != null) {
                    t1Var2.f21039fd = true;
                }
                AndroidUtilities.runOnUIThread(h0Var);
                this.Y = null;
                org.telegram.ui.Components.x01 x01Var = new org.telegram.ui.Components.x01(this.f34412a, null);
                this.d = x01Var;
                j0Var.addView(x01Var, w7.x5.e(-1, -1, 119));
                org.telegram.ui.Components.x01 x01Var2 = this.d;
                g51 g51Var2 = this.N;
                d51 d51Var = new d51(this, 1);
                org.telegram.ui.Components.v01 v01Var = x01Var2.f29837a;
                if (v01Var != null) {
                    v01Var.e(g51Var2, 1.5f, d51Var);
                    Choreographer.getInstance().postFrameCallback(x01Var2.f29838b);
                } else {
                    org.telegram.ui.Components.w01 w01Var = new org.telegram.ui.Components.w01(g51Var2, d51Var);
                    w01Var.f29509g = 1.5f;
                    x01Var2.f29839c.add(w01Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.jt jtVar = this.E;
            if (jtVar != null) {
                PowerManager.WakeLock wakeLock = jtVar.h;
                SensorManager sensorManager = jtVar.f25406a;
                if (jtVar.f25410n) {
                    Sensor sensor = jtVar.f25409f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(jtVar, sensor);
                    }
                    Sensor sensor2 = jtVar.e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(jtVar, sensor2);
                    }
                    Sensor sensor3 = jtVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(jtVar, sensor3);
                    }
                    sensorManager.unregisterListener(jtVar, jtVar.f25408c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    jtVar.f25410n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f34423s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f34423s));
            ci.f4 f4Var = this.f34425x;
            if (f4Var != null) {
                f4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f34423s));
                this.f34425x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f34423s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b2 b2Var = this.f34417c0;
        if (b2Var != null) {
            b2Var.dismiss();
            this.f34417c0 = null;
        } else if (!this.f34415b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f18435a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f18435a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new f51(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new f51(this, 2));
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f18435a;
            this.f34417c0 = b2Var2;
            b2Var2.show();
            TextView textView = (TextView) this.f34417c0.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19071q7, false));
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
        j0 j0Var = this.f34414b;
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
        AndroidUtilities.setLightNavigationBar(j0Var, !org.telegram.ui.ActionBar.i6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.t1 t1Var = this.O;
            if (t1Var != null) {
                t1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new mj0(8, this, t1Var), 14.0f);
            this.W = true;
            c(true, null);
            se seVar = this.X;
            if (seVar != null) {
                AndroidUtilities.runOnUIThread(seVar);
                this.X = null;
            }
            org.telegram.ui.Components.jt jtVar = this.E;
            if (jtVar != null) {
                PowerManager.WakeLock wakeLock = jtVar.h;
                SensorManager sensorManager = jtVar.f25406a;
                if (!jtVar.f25410n) {
                    Sensor sensor = jtVar.f25409f;
                    if (sensor != null) {
                        sensorManager.registerListener(jtVar, sensor, 30000);
                    }
                    Sensor sensor2 = jtVar.e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(jtVar, sensor2, 30000);
                    }
                    Sensor sensor3 = jtVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(jtVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(jtVar, jtVar.f25408c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    jtVar.f25410n = true;
                }
            }
        }
    }
}
