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
public final class b41 extends Dialog {
    public final org.telegram.ui.Components.rt E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.g6 L;
    public MessageObject M;
    public z31 N;
    public org.telegram.ui.Cells.t1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.l8 V;
    public boolean W;
    public se X;
    public a3.i0 Y;
    public final w31 Z;
    public final Context f35856a;
    public float f35857a0;
    public final l0 f35858b;
    public boolean f35859b0;
    public final ah.v f35860c;
    public org.telegram.ui.ActionBar.c2 f35861c0;
    public org.telegram.ui.Components.y11 d;
    public ValueAnimator f35862d0;
    public i0.b e;
    public ValueAnimator f35863e0;
    public Bitmap f35864f;
    public BitmapShader h;
    public Paint f35865n;
    public Matrix f35866r;
    public float f35867s;
    public float v;
    public org.telegram.ui.Components.j81 f35868w;
    public ei.x3 f35869x;
    public TextView f35870y;

    public b41(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new w31(this, 0);
        this.f35857a0 = 0.0f;
        this.f35859b0 = false;
        this.f35856a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        l0 l0Var = new l0(this, activity, 22);
        this.f35858b = l0Var;
        l0Var.setOnClickListener(new x31(this, 0));
        ah.v vVar = new ah.v(this, activity);
        this.f35860c = vVar;
        vVar.setClipToPadding(false);
        l0Var.addView(vVar, w7.z5.e(-1, -1, 119));
        y31 y31Var = new y31(this, 0);
        WeakHashMap weakHashMap = r0.i0.f45242a;
        r0.a0.i(l0Var, y31Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.rt();
        }
    }

    public final void c(boolean z10, w31 w31Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f35862d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f35863e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f35867s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35862d0 = ofFloat;
        ofFloat.addUpdateListener(new ah.k0(11, this, z10));
        this.f35862d0.addListener(new ah.q0(this, z10, w31Var, 11));
        if (!z10 && this.Y == null) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f35862d0;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        valueAnimator3.setInterpolator(bsVar);
        this.f35862d0.setDuration(j10);
        this.f35862d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f35863e0 = ofFloat2;
        ofFloat2.addUpdateListener(new g11(this, 5));
        this.f35863e0.addListener(new o40(8, this, z10));
        this.f35863e0.setDuration(((float) j10) * 1.5f);
        this.f35863e0.setInterpolator(bsVar);
        this.f35863e0.start();
    }

    public final void d() {
        if (!this.H) {
            l0 l0Var = this.f35858b;
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
        z31 z31Var;
        if (!this.f35859b0) {
            org.telegram.ui.ActionBar.c2 c2Var = this.f35861c0;
            if (c2Var != null) {
                c2Var.dismiss();
                this.f35861c0 = null;
            }
            this.f35859b0 = true;
            ei.x3 x3Var = this.f35869x;
            if (x3Var != null) {
                x3Var.e(true);
            }
            org.telegram.ui.Components.j81 j81Var = this.f35868w;
            if (j81Var != null) {
                j81Var.B();
                this.f35868w.H();
                this.f35868w = null;
            }
            if (!this.S && (z31Var = this.N) != null && z31Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.kp0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f35867s;
                org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f28112n;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new w31(this, 3));
            l0 l0Var = this.f35858b;
            l0Var.invalidate();
            a3.i0 i0Var = this.Y;
            if (i0Var != null) {
                org.telegram.ui.Cells.t1 t1Var2 = this.O;
                if (t1Var2 != null) {
                    t1Var2.f23391fd = true;
                }
                AndroidUtilities.runOnUIThread(i0Var);
                this.Y = null;
                org.telegram.ui.Components.y11 y11Var = new org.telegram.ui.Components.y11(this.f35856a, null);
                this.d = y11Var;
                l0Var.addView(y11Var, w7.z5.e(-1, -1, 119));
                org.telegram.ui.Components.y11 y11Var2 = this.d;
                z31 z31Var2 = this.N;
                w31 w31Var = new w31(this, 1);
                org.telegram.ui.Components.w11 w11Var = y11Var2.f32784a;
                if (w11Var != null) {
                    w11Var.d(z31Var2, 1.5f, w31Var);
                    Choreographer.getInstance().postFrameCallback(y11Var2.f32785b);
                } else {
                    org.telegram.ui.Components.x11 x11Var = new org.telegram.ui.Components.x11(z31Var2, w31Var);
                    x11Var.f32401g = 1.5f;
                    y11Var2.f32786c.add(x11Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.rt rtVar = this.E;
            if (rtVar != null) {
                PowerManager.WakeLock wakeLock = rtVar.h;
                SensorManager sensorManager = rtVar.f30262a;
                if (rtVar.f30266n) {
                    Sensor sensor = rtVar.f30265f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(rtVar, sensor);
                    }
                    Sensor sensor2 = rtVar.e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(rtVar, sensor2);
                    }
                    Sensor sensor3 = rtVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(rtVar, sensor3);
                    }
                    sensorManager.unregisterListener(rtVar, rtVar.f30264c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    rtVar.f30266n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f35867s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f35867s));
            ei.x3 x3Var = this.f35869x;
            if (x3Var != null) {
                x3Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f35867s));
                this.f35869x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f35867s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.c2 c2Var = this.f35861c0;
        if (c2Var != null) {
            c2Var.dismiss();
            this.f35861c0 = null;
        } else if (!this.f35859b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f20678a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f20678a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new y31(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new y31(this, 2));
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f20678a;
            this.f35861c0 = c2Var2;
            c2Var2.show();
            TextView textView = (TextView) this.f35861c0.d(-2);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
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
        l0 l0Var = this.f35858b;
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
            AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.Components.qy(22, this, t1Var), 14.0f);
            this.W = true;
            c(true, null);
            se seVar = this.X;
            if (seVar != null) {
                AndroidUtilities.runOnUIThread(seVar);
                this.X = null;
            }
            org.telegram.ui.Components.rt rtVar = this.E;
            if (rtVar != null) {
                PowerManager.WakeLock wakeLock = rtVar.h;
                SensorManager sensorManager = rtVar.f30262a;
                if (!rtVar.f30266n) {
                    Sensor sensor = rtVar.f30265f;
                    if (sensor != null) {
                        sensorManager.registerListener(rtVar, sensor, 30000);
                    }
                    Sensor sensor2 = rtVar.e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(rtVar, sensor2, 30000);
                    }
                    Sensor sensor3 = rtVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(rtVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(rtVar, rtVar.f30264c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    rtVar.f30266n = true;
                }
            }
        }
    }
}
