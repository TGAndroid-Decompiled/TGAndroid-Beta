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

public final class c41 extends Dialog {
    public final org.telegram.ui.Components.vs A;
    public float B;
    public float C;
    public boolean D;
    public float E;
    public boolean F;
    public float G;
    public org.telegram.ui.ActionBar.c6 H;
    public MessageObject I;
    public a41 J;
    public org.telegram.ui.Cells.s1 K;
    public TextureView L;
    public boolean M;
    public final RectF N;
    public boolean O;
    public float P;
    public float Q;
    public org.telegram.ui.Components.c8 R;
    public boolean S;
    public me T;
    public e5.u U;
    public final x31 V;
    public float W;
    public boolean X;
    public org.telegram.ui.ActionBar.b2 Y;
    public ValueAnimator Z;

    public final Context f36936a;

    public ValueAnimator f36937a0;

    public final n0 f36938b;

    public final ag.y1 f36939c;
    public org.telegram.ui.Components.f01 d;

    public i0.c f36940e;

    public Bitmap f36941f;
    public BitmapShader h;

    public Paint f36942n;

    public Matrix f36943r;

    public float f36944s;
    public float v;

    public org.telegram.ui.Components.m61 f36945w;

    public lh.w3 f36946x;

    public TextView f36947y;

    public c41(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.f36940e = i0.c.f10488e;
        this.N = new RectF();
        this.P = 0.0f;
        this.Q = 0.0f;
        int i10 = 0;
        this.V = new x31(this, i10);
        this.W = 0.0f;
        this.X = false;
        this.f36936a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        n0 n0Var = new n0(this, activity, 22);
        this.f36938b = n0Var;
        n0Var.setOnClickListener(new y31(this, i10));
        ag.y1 y1Var = new ag.y1(this, activity);
        this.f36939c = y1Var;
        y1Var.setClipToPadding(false);
        n0Var.addView(y1Var, h7.z5.e(-1, -1, 119));
        z31 z31Var = new z31(this, i10);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(n0Var, z31Var);
        if (SharedConfig.raiseToListen) {
            this.A = new org.telegram.ui.Components.vs();
        }
    }

    public final void c(boolean z10, x31 x31Var) {
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f36937a0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f36944s, z10 ? 1.0f : 0.0f);
        this.Z = valueAnimatorOfFloat;
        int i10 = 11;
        valueAnimatorOfFloat.addUpdateListener(new ig.y(i10, this, z10));
        this.Z.addListener(new androidx.fragment.app.g(this, z10, x31Var, i10));
        long j10 = (z10 || this.U != null) ? 520L : 330L;
        ValueAnimator valueAnimator3 = this.Z;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        valueAnimator3.setInterpolator(erVar);
        this.Z.setDuration(j10);
        this.Z.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.v, z10 ? 1.0f : 0.0f);
        this.f36937a0 = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new w01(this, 7));
        this.f36937a0.addListener(new n40(8, this, z10));
        this.f36937a0.setDuration((long) (j10 * 1.5f));
        this.f36937a0.setInterpolator(erVar);
        this.f36937a0.start();
    }

    public final void d() {
        if (this.D) {
            return;
        }
        n0 n0Var = this.f36938b;
        if (n0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = this.K;
        if (s1Var != null) {
            int[] iArr = new int[2];
            s1Var.getLocationOnScreen(iArr);
            float f10 = iArr[0] - this.f36940e.f10489a;
            int width = n0Var.getWidth();
            i0.c cVar = this.f36940e;
            this.B = f10 - ((((width - cVar.f10489a) - cVar.f10491c) - this.K.getWidth()) / 2.0f);
            float f11 = iArr[1] - this.f36940e.f10490b;
            int height = n0Var.getHeight();
            i0.c cVar2 = this.f36940e;
            this.C = org.telegram.messenger.y1.a(((height - cVar2.f10490b) - cVar2.d) - this.K.getHeight(), this.G, 2.0f, f11);
            if (!this.F) {
                this.F = true;
                float fClamp = (Utilities.clamp((this.K.getHeight() / 2.0f) + iArr[1], n0Var.getHeight() * 0.7f, n0Var.getHeight() * 0.3f) - (this.K.getHeight() / 2.0f)) - ((n0Var.getHeight() - this.K.getHeight()) / 2.0f);
                this.E = fClamp;
                if (this.O) {
                    this.E = 0.0f;
                } else {
                    this.E = AndroidUtilities.lerp(0.0f, fClamp, 0.78f);
                }
            }
            e();
        } else {
            this.C = 0.0f;
            this.B = 0.0f;
        }
        this.D = true;
    }

    @Override
    public final void dismiss() {
        a41 a41Var;
        if (this.X) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = this.Y;
        if (b2Var != null) {
            b2Var.dismiss();
            this.Y = null;
        }
        this.X = true;
        lh.w3 w3Var = this.f36946x;
        if (w3Var != null) {
            w3Var.e(true);
        }
        org.telegram.ui.Components.m61 m61Var = this.f36945w;
        if (m61Var != null) {
            m61Var.C();
            this.f36945w.I();
            this.f36945w = null;
        }
        if (!this.O && (a41Var = this.J) != null && a41Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.sn0 seekBarWaveform = this.J.getSeekBarWaveform();
            seekBarWaveform.L = this.f36944s;
            org.telegram.ui.Cells.s1 s1Var = seekBarWaveform.f32501n;
            if (s1Var != null) {
                s1Var.invalidate();
            }
        }
        this.D = false;
        d();
        c(false, new x31(this, 3));
        n0 n0Var = this.f36938b;
        n0Var.invalidate();
        e5.u uVar = this.U;
        if (uVar != null) {
            org.telegram.ui.Cells.s1 s1Var2 = this.K;
            if (s1Var2 != null) {
                s1Var2.f25279bd = true;
            }
            AndroidUtilities.runOnUIThread(uVar);
            this.U = null;
            org.telegram.ui.Components.f01 f01Var = new org.telegram.ui.Components.f01(this.f36936a, null);
            this.d = f01Var;
            n0Var.addView(f01Var, h7.z5.e(-1, -1, 119));
            org.telegram.ui.Components.f01 f01Var2 = this.d;
            a41 a41Var2 = this.J;
            x31 x31Var = new x31(this, 1);
            org.telegram.ui.Components.d01 d01Var = f01Var2.f28221a;
            if (d01Var != null) {
                d01Var.e(a41Var2, 1.5f, x31Var);
                Choreographer.getInstance().postFrameCallback(f01Var2.f28222b);
            } else {
                org.telegram.ui.Components.e01 e01Var = new org.telegram.ui.Components.e01(a41Var2, x31Var);
                e01Var.f27918g = 1.5f;
                f01Var2.f28223c.add(e01Var);
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
        org.telegram.ui.Components.vs vsVar = this.A;
        if (vsVar != null) {
            PowerManager.WakeLock wakeLock = vsVar.h;
            SensorManager sensorManager = vsVar.f34039a;
            if (vsVar.f34044n) {
                Sensor sensor = vsVar.f34043f;
                if (sensor != null) {
                    sensorManager.unregisterListener(vsVar, sensor);
                }
                Sensor sensor2 = vsVar.f34042e;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(vsVar, sensor2);
                }
                Sensor sensor3 = vsVar.d;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(vsVar, sensor3);
                }
                sensorManager.unregisterListener(vsVar, vsVar.f34041c);
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
                vsVar.f34044n = false;
            }
        }
    }

    public final void e() {
        if (this.d != null) {
            return;
        }
        this.J.setTranslationX(AndroidUtilities.lerp(this.B, 0.0f, this.f36944s));
        this.J.setTranslationY(AndroidUtilities.lerp(this.C, this.E, this.f36944s));
        lh.w3 w3Var = this.f36946x;
        if (w3Var != null) {
            w3Var.setTranslationX(AndroidUtilities.lerp(this.B, 0.0f, this.f36944s));
            this.f36946x.setTranslationY(AndroidUtilities.lerp(this.C, this.E, this.f36944s));
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        org.telegram.ui.ActionBar.b2 b2Var = this.Y;
        if (b2Var != null) {
            b2Var.dismiss();
            this.Y = null;
            return;
        }
        if (this.X || (messageObject = this.I) == null || messageObject.isOutOwner()) {
            super.onBackPressed();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.H);
        alertDialog$Builder.f22702a.N = LocaleController.getString(this.O ? R.string.VideoOnceCloseTitle : R.string.VoiceOnceCloseTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(this.O ? R.string.VideoOnceCloseMessage : R.string.VoiceOnceCloseMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new z31(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new z31(this, 2));
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f22702a;
        this.Y = b2Var2;
        b2Var2.show();
        TextView textView = (TextView) this.Y.d(-2);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        n0 n0Var = this.f36938b;
        setContentView(n0Var, layoutParams);
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
        n0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(n0Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.s1 s1Var = this.K;
            if (s1Var != null) {
                s1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new ib0(11, this, s1Var), 14.0f);
            this.S = true;
            c(true, null);
            me meVar = this.T;
            if (meVar != null) {
                AndroidUtilities.runOnUIThread(meVar);
                this.T = null;
            }
            org.telegram.ui.Components.vs vsVar = this.A;
            if (vsVar != null) {
                PowerManager.WakeLock wakeLock = vsVar.h;
                SensorManager sensorManager = vsVar.f34039a;
                if (vsVar.f34044n) {
                    return;
                }
                Sensor sensor = vsVar.f34043f;
                if (sensor != null) {
                    sensorManager.registerListener(vsVar, sensor, 30000);
                }
                Sensor sensor2 = vsVar.f34042e;
                if (sensor2 != null) {
                    sensorManager.registerListener(vsVar, sensor2, 30000);
                }
                Sensor sensor3 = vsVar.d;
                if (sensor3 != null) {
                    sensorManager.registerListener(vsVar, sensor3, 30000);
                }
                sensorManager.registerListener(vsVar, vsVar.f34041c, 3);
                if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                    wakeLock.acquire();
                }
                vsVar.f34044n = true;
            }
        }
    }
}
