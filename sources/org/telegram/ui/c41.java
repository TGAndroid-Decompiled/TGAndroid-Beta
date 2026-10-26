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
    public final org.telegram.ui.Components.tt E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.u6 L;
    public MessageObject M;
    public a41 N;
    public org.telegram.ui.Cells.s1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.n8 V;
    public boolean W;
    public te X;
    public a3.i0 Y;
    public final x31 Z;
    public final Context f38249a;
    public float f38250a0;
    public final k0 f38251b;
    public boolean f38252b0;
    public final bh.p f38253c;
    public org.telegram.ui.ActionBar.e2 f38254c0;
    public org.telegram.ui.Components.g21 d;
    public ValueAnimator f38255d0;
    public i0.b e;
    public ValueAnimator f38256e0;
    public Bitmap f38257f;
    public BitmapShader h;
    public Paint f38258n;
    public Matrix f38259r;
    public float f38260s;
    public float v;
    public org.telegram.ui.Components.s81 f38261w;
    public fi.v3 f38262x;
    public TextView f38263y;

    public c41(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new x31(this, 0);
        this.f38250a0 = 0.0f;
        this.f38252b0 = false;
        this.f38249a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        k0 k0Var = new k0(this, activity, 23);
        this.f38251b = k0Var;
        k0Var.setOnClickListener(new y31(this, 0));
        bh.p pVar = new bh.p(this, activity);
        this.f38253c = pVar;
        pVar.setClipToPadding(false);
        k0Var.addView(pVar, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        z31 z31Var = new z31(this, 0);
        WeakHashMap weakHashMap = r0.i0.f47108a;
        r0.a0.i(k0Var, z31Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.tt();
        }
    }

    public final void c(boolean z10, x31 x31Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f38255d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f38256e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f38260s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f38255d0 = ofFloat;
        ofFloat.addUpdateListener(new bh.a0(11, this, z10));
        this.f38255d0.addListener(new ai.l0(this, z10, x31Var, 13));
        if (!z10 && this.Y == null) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f38255d0;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        valueAnimator3.setInterpolator(dsVar);
        this.f38255d0.setDuration(j10);
        this.f38255d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f38256e0 = ofFloat2;
        ofFloat2.addUpdateListener(new v11(this, 4));
        this.f38256e0.addListener(new q40(8, this, z10));
        this.f38256e0.setDuration(((float) j10) * 1.5f);
        this.f38256e0.setInterpolator(dsVar);
        this.f38256e0.start();
    }

    public final void d() {
        if (!this.H) {
            k0 k0Var = this.f38251b;
            if (k0Var.getWidth() > 0) {
                org.telegram.ui.Cells.s1 s1Var = this.O;
                if (s1Var != null) {
                    int[] iArr = new int[2];
                    s1Var.getLocationOnScreen(iArr);
                    int width = k0Var.getWidth();
                    i0.b bVar = this.e;
                    this.F = (iArr[0] - this.e.f13450a) - ((((width - bVar.f13450a) - bVar.f13452c) - this.O.getWidth()) / 2.0f);
                    int height = k0Var.getHeight();
                    i0.b bVar2 = this.e;
                    this.G = org.telegram.messenger.t.y(((height - bVar2.f13451b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.e.f13451b);
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
        a41 a41Var;
        if (!this.f38252b0) {
            org.telegram.ui.ActionBar.e2 e2Var = this.f38254c0;
            if (e2Var != null) {
                e2Var.dismiss();
                this.f38254c0 = null;
            }
            this.f38252b0 = true;
            fi.v3 v3Var = this.f38262x;
            if (v3Var != null) {
                v3Var.e(true);
            }
            org.telegram.ui.Components.s81 s81Var = this.f38261w;
            if (s81Var != null) {
                s81Var.B();
                this.f38261w.H();
                this.f38261w = null;
            }
            if (!this.S && (a41Var = this.N) != null && a41Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.pp0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f38260s;
                org.telegram.ui.Cells.s1 s1Var = seekBarWaveform.f31685n;
                if (s1Var != null) {
                    s1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new x31(this, 3));
            k0 k0Var = this.f38251b;
            k0Var.invalidate();
            a3.i0 i0Var = this.Y;
            if (i0Var != null) {
                org.telegram.ui.Cells.s1 s1Var2 = this.O;
                if (s1Var2 != null) {
                    s1Var2.f25098fd = true;
                }
                AndroidUtilities.runOnUIThread(i0Var);
                this.Y = null;
                org.telegram.ui.Components.g21 g21Var = new org.telegram.ui.Components.g21(this.f38249a, null);
                this.d = g21Var;
                k0Var.addView(g21Var, org.telegram.ui.Components.gb1.i(-1, -1, 119));
                org.telegram.ui.Components.g21 g21Var2 = this.d;
                a41 a41Var2 = this.N;
                x31 x31Var = new x31(this, 1);
                org.telegram.ui.Components.e21 e21Var = g21Var2.f28393a;
                if (e21Var != null) {
                    e21Var.d(a41Var2, 1.5f, x31Var);
                    Choreographer.getInstance().postFrameCallback(g21Var2.f28394b);
                } else {
                    org.telegram.ui.Components.f21 f21Var = new org.telegram.ui.Components.f21(a41Var2, x31Var);
                    f21Var.f28047g = 1.5f;
                    g21Var2.f28395c.add(f21Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.tt ttVar = this.E;
            if (ttVar != null) {
                PowerManager.WakeLock wakeLock = ttVar.h;
                SensorManager sensorManager = ttVar.f33141a;
                if (ttVar.f33145n) {
                    Sensor sensor = ttVar.f33144f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(ttVar, sensor);
                    }
                    Sensor sensor2 = ttVar.e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(ttVar, sensor2);
                    }
                    Sensor sensor3 = ttVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(ttVar, sensor3);
                    }
                    sensorManager.unregisterListener(ttVar, ttVar.f33143c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    ttVar.f33145n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f38260s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f38260s));
            fi.v3 v3Var = this.f38262x;
            if (v3Var != null) {
                v3Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f38260s));
                this.f38262x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f38260s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e2 e2Var = this.f38254c0;
        if (e2Var != null) {
            e2Var.dismiss();
            this.f38254c0 = null;
        } else if (!this.f38252b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f22368a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f22368a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new z31(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new z31(this, 2));
            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.f22368a;
            this.f38254c0 = e2Var2;
            e2Var2.show();
            TextView textView = (TextView) this.f38254c0.d(-2);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, null);
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
        k0 k0Var = this.f38251b;
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
        AndroidUtilities.setLightNavigationBar(k0Var, !org.telegram.ui.ActionBar.y6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.s1 s1Var = this.O;
            if (s1Var != null) {
                s1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.Components.oy(24, this, s1Var), 14.0f);
            this.W = true;
            c(true, null);
            te teVar = this.X;
            if (teVar != null) {
                AndroidUtilities.runOnUIThread(teVar);
                this.X = null;
            }
            org.telegram.ui.Components.tt ttVar = this.E;
            if (ttVar != null) {
                PowerManager.WakeLock wakeLock = ttVar.h;
                SensorManager sensorManager = ttVar.f33141a;
                if (!ttVar.f33145n) {
                    Sensor sensor = ttVar.f33144f;
                    if (sensor != null) {
                        sensorManager.registerListener(ttVar, sensor, 30000);
                    }
                    Sensor sensor2 = ttVar.e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(ttVar, sensor2, 30000);
                    }
                    Sensor sensor3 = ttVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(ttVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(ttVar, ttVar.f33143c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    ttVar.f33145n = true;
                }
            }
        }
    }
}
