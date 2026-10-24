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
public final class a41 extends Dialog {
    public final org.telegram.ui.Components.pt E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.g6 L;
    public MessageObject M;
    public y31 N;
    public org.telegram.ui.Cells.t1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.j8 V;
    public boolean W;
    public se X;
    public a3.i0 Y;
    public final v31 Z;
    public final Context f35576a;
    public float f35577a0;
    public final l0 f35578b;
    public boolean f35579b0;
    public final ah.v f35580c;
    public org.telegram.ui.ActionBar.c2 f35581c0;
    public org.telegram.ui.Components.x11 d;
    public ValueAnimator f35582d0;
    public i0.b e;
    public ValueAnimator f35583e0;
    public Bitmap f35584f;
    public BitmapShader h;
    public Paint f35585n;
    public Matrix f35586r;
    public float f35587s;
    public float v;
    public org.telegram.ui.Components.j81 f35588w;
    public ei.x3 f35589x;
    public TextView f35590y;

    public a41(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new v31(this, 0);
        this.f35577a0 = 0.0f;
        this.f35579b0 = false;
        this.f35576a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        l0 l0Var = new l0(this, activity, 22);
        this.f35578b = l0Var;
        l0Var.setOnClickListener(new w31(this, 0));
        ah.v vVar = new ah.v(this, activity);
        this.f35580c = vVar;
        vVar.setClipToPadding(false);
        l0Var.addView(vVar, w7.z5.e(-1, -1, 119));
        x31 x31Var = new x31(this, 0);
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.a0.i(l0Var, x31Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.pt();
        }
    }

    public final void c(boolean z10, v31 v31Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f35582d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f35583e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f35587s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35582d0 = ofFloat;
        ofFloat.addUpdateListener(new ah.k0(11, this, z10));
        this.f35582d0.addListener(new ah.q0(this, z10, v31Var, 11));
        if (!z10 && this.Y == null) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f35582d0;
        org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.h;
        valueAnimator3.setInterpolator(zrVar);
        this.f35582d0.setDuration(j10);
        this.f35582d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f35583e0 = ofFloat2;
        ofFloat2.addUpdateListener(new f11(this, 5));
        this.f35583e0.addListener(new o40(8, this, z10));
        this.f35583e0.setDuration(((float) j10) * 1.5f);
        this.f35583e0.setInterpolator(zrVar);
        this.f35583e0.start();
    }

    public final void d() {
        if (!this.H) {
            l0 l0Var = this.f35578b;
            if (l0Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.O;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int width = l0Var.getWidth();
                    i0.b bVar = this.e;
                    this.F = (iArr[0] - this.e.f12315a) - ((((width - bVar.f12315a) - bVar.f12317c) - this.O.getWidth()) / 2.0f);
                    int height = l0Var.getHeight();
                    i0.b bVar2 = this.e;
                    this.G = org.telegram.messenger.v0.y(((height - bVar2.f12316b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.e.f12316b);
                    if (!this.J) {
                        this.J = true;
                        float clamp = (Utilities.clamp((this.O.getHeight() / 2.0f) + iArr[1], l0Var.getHeight() * 0.7f, l0Var.getHeight() * 0.3f) - (this.O.getHeight() / 2.0f)) - ((l0Var.getHeight() - this.O.getHeight()) / 2.0f);
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
        y31 y31Var;
        if (!this.f35579b0) {
            org.telegram.ui.ActionBar.c2 c2Var = this.f35581c0;
            if (c2Var != null) {
                c2Var.dismiss();
                this.f35581c0 = null;
            }
            this.f35579b0 = true;
            ei.x3 x3Var = this.f35589x;
            if (x3Var != null) {
                x3Var.e(true);
            }
            org.telegram.ui.Components.j81 j81Var = this.f35588w;
            if (j81Var != null) {
                j81Var.B();
                this.f35588w.H();
                this.f35588w = null;
            }
            if (!this.S && (y31Var = this.N) != null && y31Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.jp0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f35587s;
                org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f27773n;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new v31(this, 3));
            l0 l0Var = this.f35578b;
            l0Var.invalidate();
            a3.i0 i0Var = this.Y;
            if (i0Var != null) {
                org.telegram.ui.Cells.t1 t1Var2 = this.O;
                if (t1Var2 != null) {
                    t1Var2.f23392fd = true;
                }
                AndroidUtilities.runOnUIThread(i0Var);
                this.Y = null;
                org.telegram.ui.Components.x11 x11Var = new org.telegram.ui.Components.x11(this.f35576a, null);
                this.d = x11Var;
                l0Var.addView(x11Var, w7.z5.e(-1, -1, 119));
                org.telegram.ui.Components.x11 x11Var2 = this.d;
                y31 y31Var2 = this.N;
                v31 v31Var = new v31(this, 1);
                org.telegram.ui.Components.v11 v11Var = x11Var2.f32479a;
                if (v11Var != null) {
                    v11Var.d(y31Var2, 1.5f, v31Var);
                    Choreographer.getInstance().postFrameCallback(x11Var2.f32480b);
                } else {
                    org.telegram.ui.Components.w11 w11Var = new org.telegram.ui.Components.w11(y31Var2, v31Var);
                    w11Var.f32111g = 1.5f;
                    x11Var2.f32481c.add(w11Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.pt ptVar = this.E;
            if (ptVar != null) {
                PowerManager.WakeLock wakeLock = ptVar.h;
                SensorManager sensorManager = ptVar.f29658a;
                if (ptVar.f29662n) {
                    Sensor sensor = ptVar.f29661f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(ptVar, sensor);
                    }
                    Sensor sensor2 = ptVar.e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(ptVar, sensor2);
                    }
                    Sensor sensor3 = ptVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(ptVar, sensor3);
                    }
                    sensorManager.unregisterListener(ptVar, ptVar.f29660c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    ptVar.f29662n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f35587s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f35587s));
            ei.x3 x3Var = this.f35589x;
            if (x3Var != null) {
                x3Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f35587s));
                this.f35589x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f35587s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.c2 c2Var = this.f35581c0;
        if (c2Var != null) {
            c2Var.dismiss();
            this.f35581c0 = null;
        } else if (!this.f35579b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f20679a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f20679a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new x31(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new x31(this, 2));
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f20679a;
            this.f35581c0 = c2Var2;
            c2Var2.show();
            TextView textView = (TextView) this.f35581c0.d(-2);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
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
        l0 l0Var = this.f35578b;
        setContentView(l0Var, layoutParams);
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
        l0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(l0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.t1 t1Var = this.O;
            if (t1Var != null) {
                t1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.Components.oy(22, this, t1Var), 14.0f);
            this.W = true;
            c(true, null);
            se seVar = this.X;
            if (seVar != null) {
                AndroidUtilities.runOnUIThread(seVar);
                this.X = null;
            }
            org.telegram.ui.Components.pt ptVar = this.E;
            if (ptVar != null) {
                PowerManager.WakeLock wakeLock = ptVar.h;
                SensorManager sensorManager = ptVar.f29658a;
                if (!ptVar.f29662n) {
                    Sensor sensor = ptVar.f29661f;
                    if (sensor != null) {
                        sensorManager.registerListener(ptVar, sensor, 30000);
                    }
                    Sensor sensor2 = ptVar.e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(ptVar, sensor2, 30000);
                    }
                    Sensor sensor3 = ptVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(ptVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(ptVar, ptVar.f29660c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    ptVar.f29662n = true;
                }
            }
        }
    }
}
