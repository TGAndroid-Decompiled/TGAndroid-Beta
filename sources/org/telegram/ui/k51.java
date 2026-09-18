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
    public final org.telegram.ui.Components.jt E;
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
    public org.telegram.ui.Components.i8 V;
    public boolean W;
    public ue X;
    public a3.h0 Y;
    public final f51 Z;
    public final Context f34999a;
    public float f35000a0;
    public final j0 f35001b;
    public boolean f35002b0;
    public final ci.n6 f35003c;
    public org.telegram.ui.ActionBar.c2 f35004c0;
    public org.telegram.ui.Components.y01 d;
    public ValueAnimator f35005d0;
    public i0.b e;
    public ValueAnimator f35006e0;
    public Bitmap f35007f;
    public BitmapShader h;
    public Paint f35008n;
    public Matrix f35009r;
    public float f35010s;
    public float v;
    public org.telegram.ui.Components.h71 f35011w;
    public ci.f4 f35012x;
    public TextView f35013y;

    public k51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new f51(this, 0);
        this.f35000a0 = 0.0f;
        this.f35002b0 = false;
        this.f34999a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        j0 j0Var = new j0(this, activity, 21);
        this.f35001b = j0Var;
        j0Var.setOnClickListener(new g51(this, 0));
        ci.n6 n6Var = new ci.n6(this, activity);
        this.f35003c = n6Var;
        n6Var.setClipToPadding(false);
        j0Var.addView(n6Var, w7.x5.e(-1, -1, 119));
        h51 h51Var = new h51(this, 0);
        WeakHashMap weakHashMap = r0.i0.f41870a;
        r0.a0.j(j0Var, h51Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.jt();
        }
    }

    public final void c(boolean z10, f51 f51Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f35005d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f35006e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f35010s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35005d0 = ofFloat;
        ofFloat.addUpdateListener(new ai.bb(10, this, z10));
        this.f35005d0.addListener(new androidx.fragment.app.g(this, z10, f51Var, 10));
        if (!z10 && this.Y == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f35005d0;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        valueAnimator3.setInterpolator(qrVar);
        this.f35005d0.setDuration(j3);
        this.f35005d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f35006e0 = ofFloat2;
        ofFloat2.addUpdateListener(new k21(this, 6));
        this.f35006e0.addListener(new j70(7, this, z10));
        this.f35006e0.setDuration(((float) j3) * 1.5f);
        this.f35006e0.setInterpolator(qrVar);
        this.f35006e0.start();
    }

    public final void d() {
        if (!this.H) {
            j0 j0Var = this.f35001b;
            if (j0Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.O;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int width = j0Var.getWidth();
                    i0.b bVar = this.e;
                    this.F = (iArr[0] - this.e.f10591a) - ((((width - bVar.f10591a) - bVar.f10593c) - this.O.getWidth()) / 2.0f);
                    int height = j0Var.getHeight();
                    i0.b bVar2 = this.e;
                    this.G = org.telegram.messenger.w1.y(((height - bVar2.f10592b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.e.f10592b);
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
        if (!this.f35002b0) {
            org.telegram.ui.ActionBar.c2 c2Var = this.f35004c0;
            if (c2Var != null) {
                c2Var.dismiss();
                this.f35004c0 = null;
            }
            this.f35002b0 = true;
            ci.f4 f4Var = this.f35012x;
            if (f4Var != null) {
                f4Var.e(true);
            }
            org.telegram.ui.Components.h71 h71Var = this.f35011w;
            if (h71Var != null) {
                h71Var.B();
                this.f35011w.H();
                this.f35011w = null;
            }
            if (!this.S && (i51Var = this.N) != null && i51Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.jo0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f35010s;
                org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f25388n;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new f51(this, 3));
            j0 j0Var = this.f35001b;
            j0Var.invalidate();
            a3.h0 h0Var = this.Y;
            if (h0Var != null) {
                org.telegram.ui.Cells.t1 t1Var2 = this.O;
                if (t1Var2 != null) {
                    t1Var2.f21066fd = true;
                }
                AndroidUtilities.runOnUIThread(h0Var);
                this.Y = null;
                org.telegram.ui.Components.y01 y01Var = new org.telegram.ui.Components.y01(this.f34999a, null);
                this.d = y01Var;
                j0Var.addView(y01Var, w7.x5.e(-1, -1, 119));
                org.telegram.ui.Components.y01 y01Var2 = this.d;
                i51 i51Var2 = this.N;
                f51 f51Var = new f51(this, 1);
                org.telegram.ui.Components.w01 w01Var = y01Var2.f30070a;
                if (w01Var != null) {
                    w01Var.e(i51Var2, 1.5f, f51Var);
                    Choreographer.getInstance().postFrameCallback(y01Var2.f30071b);
                } else {
                    org.telegram.ui.Components.x01 x01Var = new org.telegram.ui.Components.x01(i51Var2, f51Var);
                    x01Var.f29806g = 1.5f;
                    y01Var2.f30072c.add(x01Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.jt jtVar = this.E;
            if (jtVar != null) {
                PowerManager.WakeLock wakeLock = jtVar.h;
                SensorManager sensorManager = jtVar.f25421a;
                if (jtVar.f25425n) {
                    Sensor sensor = jtVar.f25424f;
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
                    sensorManager.unregisterListener(jtVar, jtVar.f25423c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    jtVar.f25425n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f35010s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f35010s));
            ci.f4 f4Var = this.f35012x;
            if (f4Var != null) {
                f4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f35010s));
                this.f35012x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f35010s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.c2 c2Var = this.f35004c0;
        if (c2Var != null) {
            c2Var.dismiss();
            this.f35004c0 = null;
        } else if (!this.f35002b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f18447a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f18447a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new h51(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new h51(this, 2));
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f18447a;
            this.f35004c0 = c2Var2;
            c2Var2.show();
            TextView textView = (TextView) this.f35004c0.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19101q7, false));
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
        j0 j0Var = this.f35001b;
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
            ue ueVar = this.X;
            if (ueVar != null) {
                AndroidUtilities.runOnUIThread(ueVar);
                this.X = null;
            }
            org.telegram.ui.Components.jt jtVar = this.E;
            if (jtVar != null) {
                PowerManager.WakeLock wakeLock = jtVar.h;
                SensorManager sensorManager = jtVar.f25421a;
                if (!jtVar.f25425n) {
                    Sensor sensor = jtVar.f25424f;
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
                    sensorManager.registerListener(jtVar, jtVar.f25423c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    jtVar.f25425n = true;
                }
            }
        }
    }
}
