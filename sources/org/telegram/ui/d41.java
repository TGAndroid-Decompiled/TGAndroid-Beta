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
public final class d41 extends Dialog {
    public final org.telegram.ui.Components.ws A;
    public float B;
    public float C;
    public boolean D;
    public float E;
    public boolean F;
    public float G;
    public org.telegram.ui.ActionBar.b6 H;
    public MessageObject I;
    public b41 J;
    public org.telegram.ui.Cells.t1 K;
    public TextureView L;
    public boolean M;
    public final RectF N;
    public boolean O;
    public float P;
    public float Q;
    public org.telegram.ui.Components.d8 R;
    public boolean S;
    public me T;
    public e5.w U;
    public final y31 V;
    public float W;
    public boolean X;
    public org.telegram.ui.ActionBar.c2 Y;
    public ValueAnimator Z;
    public final Context f37403a;
    public ValueAnimator f37404a0;
    public final m0 f37405b;
    public final fh.v f37406c;
    public org.telegram.ui.Components.d01 d;
    public i0.b f37407e;
    public Bitmap f37408f;
    public BitmapShader h;
    public Paint f37409n;
    public Matrix f37410r;
    public float f37411s;
    public float v;
    public org.telegram.ui.Components.k61 f37412w;
    public kh.x3 f37413x;
    public TextView f37414y;

    public d41(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.f37407e = i0.b.f10847e;
        this.N = new RectF();
        this.P = 0.0f;
        this.Q = 0.0f;
        this.V = new y31(this, 0);
        this.W = 0.0f;
        this.X = false;
        this.f37403a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        m0 m0Var = new m0(this, activity, 22);
        this.f37405b = m0Var;
        m0Var.setOnClickListener(new z31(this, 0));
        fh.v vVar = new fh.v(this, activity);
        this.f37406c = vVar;
        vVar.setClipToPadding(false);
        m0Var.addView(vVar, g7.e6.e(-1, -1, 119));
        a41 a41Var = new a41(this, 0);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(m0Var, a41Var);
        if (SharedConfig.raiseToListen) {
            this.A = new org.telegram.ui.Components.ws();
        }
    }

    public final void c(boolean z10, y31 y31Var) {
        float f10;
        long j10;
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f37404a0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f37411s;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.Z = ofFloat;
        ofFloat.addUpdateListener(new hg.y(11, this, z10));
        this.Z.addListener(new androidx.fragment.app.g(this, z10, y31Var, 11));
        if (!z10 && this.U == null) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.Z;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        valueAnimator3.setInterpolator(grVar);
        this.Z.setDuration(j10);
        this.Z.start();
        float f13 = this.v;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f37404a0 = ofFloat2;
        ofFloat2.addUpdateListener(new v01(this, 7));
        this.f37404a0.addListener(new n60(7, this, z10));
        this.f37404a0.setDuration(((float) j10) * 1.5f);
        this.f37404a0.setInterpolator(grVar);
        this.f37404a0.start();
    }

    public final void d() {
        if (!this.D) {
            m0 m0Var = this.f37405b;
            if (m0Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.K;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int width = m0Var.getWidth();
                    i0.b bVar = this.f37407e;
                    this.B = (iArr[0] - this.f37407e.f10848a) - ((((width - bVar.f10848a) - bVar.f10850c) - this.K.getWidth()) / 2.0f);
                    int height = m0Var.getHeight();
                    i0.b bVar2 = this.f37407e;
                    this.C = org.telegram.messenger.l0.a(((height - bVar2.f10849b) - bVar2.d) - this.K.getHeight(), this.G, 2.0f, iArr[1] - this.f37407e.f10849b);
                    if (!this.F) {
                        this.F = true;
                        float clamp = (Utilities.clamp((this.K.getHeight() / 2.0f) + iArr[1], m0Var.getHeight() * 0.7f, m0Var.getHeight() * 0.3f) - (this.K.getHeight() / 2.0f)) - ((m0Var.getHeight() - this.K.getHeight()) / 2.0f);
                        this.E = clamp;
                        if (this.O) {
                            this.E = 0.0f;
                        } else {
                            this.E = AndroidUtilities.lerp(0.0f, clamp, 0.78f);
                        }
                    }
                    e();
                } else {
                    this.C = 0.0f;
                    this.B = 0.0f;
                }
                this.D = true;
            }
        }
    }

    @Override
    public final void dismiss() {
        b41 b41Var;
        if (!this.X) {
            org.telegram.ui.ActionBar.c2 c2Var = this.Y;
            if (c2Var != null) {
                c2Var.dismiss();
                this.Y = null;
            }
            this.X = true;
            kh.x3 x3Var = this.f37413x;
            if (x3Var != null) {
                x3Var.e(true);
            }
            org.telegram.ui.Components.k61 k61Var = this.f37412w;
            if (k61Var != null) {
                k61Var.C();
                this.f37412w.I();
                this.f37412w = null;
            }
            if (!this.O && (b41Var = this.J) != null && b41Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.rn0 seekBarWaveform = this.J.getSeekBarWaveform();
                seekBarWaveform.L = this.f37411s;
                org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f32220n;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
            }
            this.D = false;
            d();
            c(false, new y31(this, 3));
            m0 m0Var = this.f37405b;
            m0Var.invalidate();
            e5.w wVar = this.U;
            if (wVar != null) {
                org.telegram.ui.Cells.t1 t1Var2 = this.K;
                if (t1Var2 != null) {
                    t1Var2.f25326bd = true;
                }
                AndroidUtilities.runOnUIThread(wVar);
                this.U = null;
                org.telegram.ui.Components.d01 d01Var = new org.telegram.ui.Components.d01(this.f37403a, null);
                this.d = d01Var;
                m0Var.addView(d01Var, g7.e6.e(-1, -1, 119));
                org.telegram.ui.Components.d01 d01Var2 = this.d;
                b41 b41Var2 = this.J;
                y31 y31Var = new y31(this, 1);
                org.telegram.ui.Components.b01 b01Var = d01Var2.f27620a;
                if (b01Var != null) {
                    b01Var.e(b41Var2, 1.5f, y31Var);
                    Choreographer.getInstance().postFrameCallback(d01Var2.f27621b);
                } else {
                    org.telegram.ui.Components.c01 c01Var = new org.telegram.ui.Components.c01(b41Var2, y31Var);
                    c01Var.f27332g = 1.5f;
                    d01Var2.f27622c.add(c01Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.ws wsVar = this.A;
            if (wsVar != null) {
                PowerManager.WakeLock wakeLock = wsVar.h;
                SensorManager sensorManager = wsVar.f34348a;
                if (wsVar.f34353n) {
                    Sensor sensor = wsVar.f34352f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(wsVar, sensor);
                    }
                    Sensor sensor2 = wsVar.f34351e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(wsVar, sensor2);
                    }
                    Sensor sensor3 = wsVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(wsVar, sensor3);
                    }
                    sensorManager.unregisterListener(wsVar, wsVar.f34350c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    wsVar.f34353n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.J.setTranslationX(AndroidUtilities.lerp(this.B, 0.0f, this.f37411s));
            this.J.setTranslationY(AndroidUtilities.lerp(this.C, this.E, this.f37411s));
            kh.x3 x3Var = this.f37413x;
            if (x3Var != null) {
                x3Var.setTranslationX(AndroidUtilities.lerp(this.B, 0.0f, this.f37411s));
                this.f37413x.setTranslationY(AndroidUtilities.lerp(this.C, this.E, this.f37411s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i9;
        int i10;
        org.telegram.ui.ActionBar.c2 c2Var = this.Y;
        if (c2Var != null) {
            c2Var.dismiss();
            this.Y = null;
        } else if (!this.X && (messageObject = this.I) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.H);
            if (this.O) {
                i9 = R.string.VideoOnceCloseTitle;
            } else {
                i9 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f22702a.N = LocaleController.getString(i9);
            if (this.O) {
                i10 = R.string.VideoOnceCloseMessage;
            } else {
                i10 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f22702a.P = LocaleController.getString(i10);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new a41(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new a41(this, 2));
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22702a;
            this.Y = c2Var2;
            c2Var2.show();
            TextView textView = (TextView) this.Y.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
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
        m0 m0Var = this.f37405b;
        setContentView(m0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i9 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i9;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            attributes.flags = i9 | (-2013060864);
            AndroidUtilities.logFlagSecure();
        }
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        m0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(m0Var, !org.telegram.ui.ActionBar.f6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.t1 t1Var = this.K;
            if (t1Var != null) {
                t1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new eb0(11, this, t1Var), 14.0f);
            this.S = true;
            c(true, null);
            me meVar = this.T;
            if (meVar != null) {
                AndroidUtilities.runOnUIThread(meVar);
                this.T = null;
            }
            org.telegram.ui.Components.ws wsVar = this.A;
            if (wsVar != null) {
                PowerManager.WakeLock wakeLock = wsVar.h;
                SensorManager sensorManager = wsVar.f34348a;
                if (!wsVar.f34353n) {
                    Sensor sensor = wsVar.f34352f;
                    if (sensor != null) {
                        sensorManager.registerListener(wsVar, sensor, 30000);
                    }
                    Sensor sensor2 = wsVar.f34351e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(wsVar, sensor2, 30000);
                    }
                    Sensor sensor3 = wsVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(wsVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(wsVar, wsVar.f34350c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    wsVar.f34353n = true;
                }
            }
        }
    }
}
