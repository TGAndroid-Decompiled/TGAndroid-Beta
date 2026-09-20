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
public final class l51 extends Dialog {
    public final org.telegram.ui.Components.jt E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.f6 L;
    public MessageObject M;
    public j51 N;
    public org.telegram.ui.Cells.u1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.j8 V;
    public boolean W;
    public ue X;
    public a3.h0 Y;
    public final g51 Z;
    public final Context f35307a;
    public float f35308a0;
    public final j0 f35309b;
    public boolean f35310b0;
    public final ci.n6 f35311c;
    public org.telegram.ui.ActionBar.b2 f35312c0;
    public org.telegram.ui.Components.l11 d;
    public ValueAnimator f35313d0;
    public i0.b e;
    public ValueAnimator f35314e0;
    public Bitmap f35315f;
    public BitmapShader h;
    public Paint f35316n;
    public Matrix f35317r;
    public float f35318s;
    public float v;
    public org.telegram.ui.Components.t71 f35319w;
    public ci.f4 f35320x;
    public TextView f35321y;

    public l51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new g51(this, 0);
        this.f35308a0 = 0.0f;
        this.f35310b0 = false;
        this.f35307a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        j0 j0Var = new j0(this, activity, 21);
        this.f35309b = j0Var;
        j0Var.setOnClickListener(new h51(this, 0));
        ci.n6 n6Var = new ci.n6(this, activity);
        this.f35311c = n6Var;
        n6Var.setClipToPadding(false);
        j0Var.addView(n6Var, w7.y5.e(-1, -1, 119));
        i51 i51Var = new i51(this, 0);
        WeakHashMap weakHashMap = r0.i0.f42142a;
        r0.a0.j(j0Var, i51Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.jt();
        }
    }

    public final void c(boolean z10, g51 g51Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f35313d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f35314e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f35318s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35313d0 = ofFloat;
        ofFloat.addUpdateListener(new ai.bb(10, this, z10));
        this.f35313d0.addListener(new androidx.fragment.app.g(this, z10, g51Var, 10));
        if (!z10 && this.Y == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f35313d0;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        valueAnimator3.setInterpolator(qrVar);
        this.f35313d0.setDuration(j3);
        this.f35313d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f35314e0 = ofFloat2;
        ofFloat2.addUpdateListener(new i21(this, 6));
        this.f35314e0.addListener(new h70(7, this, z10));
        this.f35314e0.setDuration(((float) j3) * 1.5f);
        this.f35314e0.setInterpolator(qrVar);
        this.f35314e0.start();
    }

    public final void d() {
        if (!this.H) {
            j0 j0Var = this.f35309b;
            if (j0Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.O;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int width = j0Var.getWidth();
                    i0.b bVar = this.e;
                    this.F = (iArr[0] - this.e.f10592a) - ((((width - bVar.f10592a) - bVar.f10594c) - this.O.getWidth()) / 2.0f);
                    int height = j0Var.getHeight();
                    i0.b bVar2 = this.e;
                    this.G = org.telegram.messenger.l0.x(((height - bVar2.f10593b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.e.f10593b);
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
        j51 j51Var;
        if (!this.f35310b0) {
            org.telegram.ui.ActionBar.b2 b2Var = this.f35312c0;
            if (b2Var != null) {
                b2Var.dismiss();
                this.f35312c0 = null;
            }
            this.f35310b0 = true;
            ci.f4 f4Var = this.f35320x;
            if (f4Var != null) {
                f4Var.e(true);
            }
            org.telegram.ui.Components.t71 t71Var = this.f35319w;
            if (t71Var != null) {
                t71Var.B();
                this.f35319w.H();
                this.f35319w = null;
            }
            if (!this.S && (j51Var = this.N) != null && j51Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.vo0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f35318s;
                org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f29252n;
                if (u1Var != null) {
                    u1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new g51(this, 3));
            j0 j0Var = this.f35309b;
            j0Var.invalidate();
            a3.h0 h0Var = this.Y;
            if (h0Var != null) {
                org.telegram.ui.Cells.u1 u1Var2 = this.O;
                if (u1Var2 != null) {
                    u1Var2.f21308fd = true;
                }
                AndroidUtilities.runOnUIThread(h0Var);
                this.Y = null;
                org.telegram.ui.Components.l11 l11Var = new org.telegram.ui.Components.l11(this.f35307a, null);
                this.d = l11Var;
                j0Var.addView(l11Var, w7.y5.e(-1, -1, 119));
                org.telegram.ui.Components.l11 l11Var2 = this.d;
                j51 j51Var2 = this.N;
                g51 g51Var = new g51(this, 1);
                org.telegram.ui.Components.j11 j11Var = l11Var2.f25993a;
                if (j11Var != null) {
                    j11Var.e(j51Var2, 1.5f, g51Var);
                    Choreographer.getInstance().postFrameCallback(l11Var2.f25994b);
                } else {
                    org.telegram.ui.Components.k11 k11Var = new org.telegram.ui.Components.k11(j51Var2, g51Var);
                    k11Var.f25617g = 1.5f;
                    l11Var2.f25995c.add(k11Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.jt jtVar = this.E;
            if (jtVar != null) {
                PowerManager.WakeLock wakeLock = jtVar.h;
                SensorManager sensorManager = jtVar.f25441a;
                if (jtVar.f25445n) {
                    Sensor sensor = jtVar.f25444f;
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
                    sensorManager.unregisterListener(jtVar, jtVar.f25443c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    jtVar.f25445n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f35318s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f35318s));
            ci.f4 f4Var = this.f35320x;
            if (f4Var != null) {
                f4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f35318s));
                this.f35320x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f35318s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b2 b2Var = this.f35312c0;
        if (b2Var != null) {
            b2Var.dismiss();
            this.f35312c0 = null;
        } else if (!this.f35310b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f18654a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f18654a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new i51(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new i51(this, 2));
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f18654a;
            this.f35312c0 = b2Var2;
            b2Var2.show();
            TextView textView = (TextView) this.f35312c0.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19333q7, false));
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
        j0 j0Var = this.f35309b;
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
            org.telegram.ui.Cells.u1 u1Var = this.O;
            if (u1Var != null) {
                u1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new pj0(8, this, u1Var), 14.0f);
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
                SensorManager sensorManager = jtVar.f25441a;
                if (!jtVar.f25445n) {
                    Sensor sensor = jtVar.f25444f;
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
                    sensorManager.registerListener(jtVar, jtVar.f25443c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    jtVar.f25445n = true;
                }
            }
        }
    }
}
