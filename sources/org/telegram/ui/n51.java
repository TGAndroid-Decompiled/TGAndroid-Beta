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
    public final org.telegram.ui.Components.ot E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.f6 L;
    public MessageObject M;
    public l51 N;
    public org.telegram.ui.Cells.t1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.k8 V;
    public boolean W;
    public ve X;
    public a3.h0 Y;
    public final i51 Z;
    public final Context f35120a;
    public float f35121a0;
    public final k0 f35122b;
    public boolean f35123b0;
    public final bi.n7 f35124c;
    public org.telegram.ui.ActionBar.d2 f35125c0;
    public org.telegram.ui.Components.k11 d;
    public ValueAnimator f35126d0;
    public i0.c e;
    public ValueAnimator f35127e0;
    public Bitmap f35128f;
    public BitmapShader h;
    public Paint f35129n;
    public Matrix f35130r;
    public float f35131s;
    public float v;
    public org.telegram.ui.Components.t71 f35132w;
    public bi.x4 f35133x;
    public TextView f35134y;

    public n51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.c.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new i51(this, 0);
        this.f35121a0 = 0.0f;
        this.f35123b0 = false;
        this.f35120a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        k0 k0Var = new k0(this, activity, 22);
        this.f35122b = k0Var;
        k0Var.setOnClickListener(new j51(this, 0));
        bi.n7 n7Var = new bi.n7(this, activity);
        this.f35124c = n7Var;
        n7Var.setClipToPadding(false);
        k0Var.addView(n7Var, w7.a6.e(-1, -1, 119));
        k51 k51Var = new k51(this, 0);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(k0Var, k51Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.ot();
        }
    }

    public final void c(boolean z10, i51 i51Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.f35126d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f35127e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f35131s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35126d0 = ofFloat;
        ofFloat.addUpdateListener(new bi.m7(9, this, z10));
        this.f35126d0.addListener(new androidx.fragment.app.g(this, z10, i51Var, 10));
        if (!z10 && this.Y == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f35126d0;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        valueAnimator3.setInterpolator(wrVar);
        this.f35126d0.setDuration(j3);
        this.f35126d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f35127e0 = ofFloat2;
        ofFloat2.addUpdateListener(new f21(this, 7));
        this.f35127e0.addListener(new iw0(3, this, z10));
        this.f35127e0.setDuration(((float) j3) * 1.5f);
        this.f35127e0.setInterpolator(wrVar);
        this.f35127e0.start();
    }

    public final void d() {
        if (!this.H) {
            k0 k0Var = this.f35122b;
            if (k0Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.O;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int width = k0Var.getWidth();
                    i0.c cVar = this.e;
                    this.F = (iArr[0] - this.e.f10074a) - ((((width - cVar.f10074a) - cVar.f10076c) - this.O.getWidth()) / 2.0f);
                    int height = k0Var.getHeight();
                    i0.c cVar2 = this.e;
                    this.G = org.telegram.messenger.a2.y(((height - cVar2.f10075b) - cVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.e.f10075b);
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
        if (!this.f35123b0) {
            org.telegram.ui.ActionBar.d2 d2Var = this.f35125c0;
            if (d2Var != null) {
                d2Var.dismiss();
                this.f35125c0 = null;
            }
            this.f35123b0 = true;
            bi.x4 x4Var = this.f35133x;
            if (x4Var != null) {
                x4Var.e(true);
            }
            org.telegram.ui.Components.t71 t71Var = this.f35132w;
            if (t71Var != null) {
                t71Var.B();
                this.f35132w.H();
                this.f35132w = null;
            }
            if (!this.S && (l51Var = this.N) != null && l51Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.ro0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f35131s;
                org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f26721n;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new i51(this, 3));
            k0 k0Var = this.f35122b;
            k0Var.invalidate();
            a3.h0 h0Var = this.Y;
            if (h0Var != null) {
                org.telegram.ui.Cells.t1 t1Var2 = this.O;
                if (t1Var2 != null) {
                    t1Var2.f20137fd = true;
                }
                AndroidUtilities.runOnUIThread(h0Var);
                this.Y = null;
                org.telegram.ui.Components.k11 k11Var = new org.telegram.ui.Components.k11(this.f35120a, null);
                this.d = k11Var;
                k0Var.addView(k11Var, w7.a6.e(-1, -1, 119));
                org.telegram.ui.Components.k11 k11Var2 = this.d;
                l51 l51Var2 = this.N;
                i51 i51Var = new i51(this, 1);
                org.telegram.ui.Components.i11 i11Var = k11Var2.f24562a;
                if (i11Var != null) {
                    i11Var.e(l51Var2, 1.5f, i51Var);
                    Choreographer.getInstance().postFrameCallback(k11Var2.f24563b);
                } else {
                    org.telegram.ui.Components.j11 j11Var = new org.telegram.ui.Components.j11(l51Var2, i51Var);
                    j11Var.f24189g = 1.5f;
                    k11Var2.f24564c.add(j11Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.ot otVar = this.E;
            if (otVar != null) {
                PowerManager.WakeLock wakeLock = otVar.h;
                SensorManager sensorManager = otVar.f25904a;
                if (otVar.f25908n) {
                    Sensor sensor = otVar.f25907f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(otVar, sensor);
                    }
                    Sensor sensor2 = otVar.e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(otVar, sensor2);
                    }
                    Sensor sensor3 = otVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(otVar, sensor3);
                    }
                    sensorManager.unregisterListener(otVar, otVar.f25906c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    otVar.f25908n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f35131s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f35131s));
            bi.x4 x4Var = this.f35133x;
            if (x4Var != null) {
                x4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f35131s));
                this.f35133x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f35131s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.d2 d2Var = this.f35125c0;
        if (d2Var != null) {
            d2Var.dismiss();
            this.f35125c0 = null;
        } else if (!this.f35123b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f17528a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f17528a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new k51(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new k51(this, 2));
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f17528a;
            this.f35125c0 = d2Var2;
            d2Var2.show();
            TextView textView = (TextView) this.f35125c0.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
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
        k0 k0Var = this.f35122b;
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
        AndroidUtilities.setLightNavigationBar(k0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.t1 t1Var = this.O;
            if (t1Var != null) {
                t1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new nj0(8, this, t1Var), 14.0f);
            this.W = true;
            c(true, null);
            ve veVar = this.X;
            if (veVar != null) {
                AndroidUtilities.runOnUIThread(veVar);
                this.X = null;
            }
            org.telegram.ui.Components.ot otVar = this.E;
            if (otVar != null) {
                PowerManager.WakeLock wakeLock = otVar.h;
                SensorManager sensorManager = otVar.f25904a;
                if (!otVar.f25908n) {
                    Sensor sensor = otVar.f25907f;
                    if (sensor != null) {
                        sensorManager.registerListener(otVar, sensor, 30000);
                    }
                    Sensor sensor2 = otVar.e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(otVar, sensor2, 30000);
                    }
                    Sensor sensor3 = otVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(otVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(otVar, otVar.f25906c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    otVar.f25908n = true;
                }
            }
        }
    }
}
