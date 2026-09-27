package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class d60 extends j60 {
    public boolean A0;
    public final zp B0;
    public final ka.c C0;
    public final org.telegram.ui.jl E;
    public final LinearLayout F;
    public final ci.v2 G;
    public final ci.v2 H;
    public final ImageView I;
    public final ci.x2 J;
    public final int[] K;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public ki.s0 P;
    public ki.q0 Q;
    public ki.r0 R;
    public ki.k0 S;
    public q01 T;
    public VideoEditedInfo U;
    public c60 V;
    public AnimatorSet W;
    public ValueAnimator f23547a0;
    public final kj0 f23548b0;
    public kj0 f23549c0;
    public kj0 f23550d0;
    public boolean f23551e0;
    public final q50 f23552f;
    public boolean f23553f0;
    public boolean f23554g0;
    public final int h;
    public boolean f23555h0;
    public boolean f23556i0;
    public boolean f23557j0;
    public boolean f23558k0;
    public boolean f23559l0;
    public Bitmap m0;
    public final int f23560n;
    public long f23561n0;
    public float f23562o0;
    public float f23563p0;
    public float f23564q0;
    public final boolean f23565r;
    public float f23566r0;
    public final View f23567s;
    public int f23568s0;
    public int f23569t0;
    public boolean f23570u0;
    public final b60 v;
    public boolean f23571v0;
    public final km0 f23572w;
    public float f23573w0;
    public final FrameLayout f23574x;
    public int f23575x0;
    public final a60 f23576y;
    public long f23577y0;
    public boolean f23578z0;

    public d60(Activity activity, q50 q50Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.f23568s0 = -1;
        this.f23569t0 = -1;
        this.f23573w0 = Float.NaN;
        this.B0 = new zp(this, 25);
        this.C0 = new ka.c(this, 10);
        this.f23552f = q50Var;
        this.f23560n = q50Var.getClassGuid();
        this.f23565r = q50Var.v();
        this.f23567s = q50Var.getFragmentView();
        setWillNotDraw(false);
        ci.x2 x2Var = new ci.x2(activity, null, this, null);
        this.J = x2Var;
        x2Var.f5827o = 0.5f;
        x2Var.f5826n = ci.x2.f(0.5f);
        x2Var.g();
        addView(x2Var.f5817b, w7.y5.e(-1, -1, 119));
        b60 b60Var = new b60(this, activity);
        this.v = b60Var;
        km0 km0Var = new km0(activity);
        this.f23572w = km0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f23574x = frameLayout;
        a60 a60Var = new a60(this, activity, 0);
        a60Var.setOpaque(true);
        a60Var.setClickable(true);
        a60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        a60Var.setOutlineProvider(new ai.k2(13));
        a60Var.setClipToOutline(true);
        this.f23576y = a60Var;
        frameLayout.addView(a60Var, w7.y5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.jl jlVar = new org.telegram.ui.jl(this, activity, paint);
        this.E = jlVar;
        jlVar.setOutlineProvider(new ai.k2(12));
        jlVar.setClipToOutline(true);
        frameLayout.addView(jlVar, w7.y5.e(-1, -1, 119));
        km0Var.addView(frameLayout, w7.y5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        b60Var.addView(km0Var, w7.y5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(b60Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(x2Var.f5818c, w7.y5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, w7.y5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(activity);
        this.G = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, w7.y5.n(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final d60 f30857b;

            {
                this.f30857b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.r0 r0Var;
                ki.k0 k0Var;
                boolean z10;
                ki.r0 r0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        d60 d60Var = this.f30857b;
                        ki.s0 s0Var = d60Var.P;
                        if (s0Var != null && (r0Var = d60Var.R) != null && (k0Var = d60Var.S) != null && r0Var.f13837a == 3 && !r0Var.e) {
                            ki.l0 l0Var = k0Var.f13761a;
                            ki.l0 l0Var2 = ki.l0.f13786a;
                            if (l0Var == l0Var2) {
                                l0Var2 = ki.l0.f13787b;
                            }
                            s0Var.getClass();
                            ki.s0.s();
                            int i12 = s0Var.V;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (s0Var.f13855o != l0Var2) {
                                    s0Var.f13852l.b("camera facing requested: " + s0Var.f13855o + " -> " + l0Var2 + ", state=" + hg.k0.C(s0Var.V));
                                    s0Var.f13855o = l0Var2;
                                    int i13 = s0Var.V;
                                    if (i13 == 3 || i13 == 2) {
                                        s0Var.d();
                                        ki.i iVar = s0Var.f13851k;
                                        iVar.C = l0Var2;
                                        Handler handler = iVar.f13722n;
                                        if (iVar.S && handler != null) {
                                            handler.post(new gg.x1(27, iVar, l0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        s0Var.v = z10;
                                    }
                                    s0Var.m();
                                    s0Var.n();
                                }
                                d60Var.f23548b0.M(0);
                                d60Var.f23548b0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        d60 d60Var2 = this.f30857b;
                        ki.s0 s0Var2 = d60Var2.P;
                        if (s0Var2 != null && (r0Var2 = d60Var2.R) != null && d60Var2.S != null) {
                            boolean z11 = !r0Var2.f13840f;
                            ki.i iVar2 = s0Var2.f13851k;
                            ki.s0.s();
                            if (s0Var2.V == 3 && !s0Var2.v && (i11 = s0Var2.W) != 1) {
                                s0Var2.f13860t = z11;
                                if (i11 == 3) {
                                    s0Var2.t(z11);
                                    iVar2.y(false);
                                } else {
                                    s0Var2.t(false);
                                    iVar2.y(z11);
                                }
                                s0Var2.n();
                                d60Var2.v();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(activity);
        this.H = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, w7.y5.n(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final d60 f30857b;

            {
                this.f30857b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.r0 r0Var;
                ki.k0 k0Var;
                boolean z10;
                ki.r0 r0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        d60 d60Var = this.f30857b;
                        ki.s0 s0Var = d60Var.P;
                        if (s0Var != null && (r0Var = d60Var.R) != null && (k0Var = d60Var.S) != null && r0Var.f13837a == 3 && !r0Var.e) {
                            ki.l0 l0Var = k0Var.f13761a;
                            ki.l0 l0Var2 = ki.l0.f13786a;
                            if (l0Var == l0Var2) {
                                l0Var2 = ki.l0.f13787b;
                            }
                            s0Var.getClass();
                            ki.s0.s();
                            int i12 = s0Var.V;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (s0Var.f13855o != l0Var2) {
                                    s0Var.f13852l.b("camera facing requested: " + s0Var.f13855o + " -> " + l0Var2 + ", state=" + hg.k0.C(s0Var.V));
                                    s0Var.f13855o = l0Var2;
                                    int i13 = s0Var.V;
                                    if (i13 == 3 || i13 == 2) {
                                        s0Var.d();
                                        ki.i iVar = s0Var.f13851k;
                                        iVar.C = l0Var2;
                                        Handler handler = iVar.f13722n;
                                        if (iVar.S && handler != null) {
                                            handler.post(new gg.x1(27, iVar, l0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        s0Var.v = z10;
                                    }
                                    s0Var.m();
                                    s0Var.n();
                                }
                                d60Var.f23548b0.M(0);
                                d60Var.f23548b0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        d60 d60Var2 = this.f30857b;
                        ki.s0 s0Var2 = d60Var2.P;
                        if (s0Var2 != null && (r0Var2 = d60Var2.R) != null && d60Var2.S != null) {
                            boolean z11 = !r0Var2.f13840f;
                            ki.i iVar2 = s0Var2.f13851k;
                            ki.s0.s();
                            if (s0Var2.V == 3 && !s0Var2.v && (i11 = s0Var2.W) != 1) {
                                s0Var2.f13860t = z11;
                                if (i11 == 3) {
                                    s0Var2.t(z11);
                                    iVar2.y(false);
                                } else {
                                    s0Var2.t(false);
                                    iVar2.y(z11);
                                }
                                s0Var2.n();
                                d60Var2.v();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        int dp = AndroidUtilities.dp(24.0f);
        this.O = dp;
        kj0 kj0Var = new kj0(R.raw.roundcamera_flip, dp, dp);
        this.f23548b0 = kj0Var;
        kj0Var.setCallback(imageView);
        kj0Var.M(kj0Var.e[0] - 1);
        imageView.setImageDrawable(kj0Var);
        v();
        if (e6Var != null && !e6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.I = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.y5.e(48, 48, 17));
        a60Var.setOnTouchListener(new xr(this, 1));
        super.setVisibility(4);
    }

    private long getCurrentDurationMs() {
        ki.r0 r0Var;
        ki.s0 s0Var = this.P;
        if (s0Var != null && (r0Var = this.R) != null) {
            if (r0Var.f13837a == 3) {
                return s0Var.i();
            }
            return r0Var.f13838b;
        }
        return 0L;
    }

    public static void k(d60 d60Var) {
        boolean z10;
        ki.k0 k0Var;
        ki.r0 r0Var = d60Var.R;
        boolean z11 = false;
        if (r0Var != null && r0Var.f13837a == 3 && !r0Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        d60Var.G.setEnabled(z10);
        ci.v2 v2Var = d60Var.H;
        if (z10 && (k0Var = d60Var.S) != null && k0Var.f13762b != 1) {
            z11 = true;
        }
        v2Var.setEnabled(z11);
        d60Var.v();
    }

    public static void l(d60 d60Var) {
        org.telegram.ui.jl jlVar = d60Var.E;
        if (!d60Var.f23558k0) {
            return;
        }
        d60Var.f23558k0 = false;
        jlVar.invalidate();
        jlVar.animate().cancel();
        jlVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.lk lkVar;
        if (z10 != this.f23578z0) {
            this.f23578z0 = z10;
            this.f23577y0 = 0L;
            zp zpVar = this.B0;
            if (z10) {
                yf.h.d().a(30, zpVar);
            } else {
                yf.h.d().f(zpVar);
            }
            if (this.d != z10) {
                this.d = z10;
                h60 h60Var = this.f25335c;
                if (h60Var != null && (lkVar = ((org.telegram.ui.pj) h60Var).f36496a.Y) != null) {
                    lkVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f23552f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ci.x2 x2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.f23573w0)) {
                this.f23573w0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            x2Var.c(null);
        } else {
            if (!Float.isNaN(this.f23573w0)) {
                attributes.screenBrightness = this.f23573w0;
                this.f23573w0 = Float.NaN;
            }
            x2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        if (this.P == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 6;
        }
        r(i10);
        this.P.a();
        q01 q01Var = this.T;
        if (q01Var != null) {
            q01Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        t(false, false);
    }

    @Override
    public final void b(float f7, int i10) {
        ki.r0 r0Var;
        i2.f0 f0Var;
        if (this.P != null && (r0Var = this.R) != null && r0Var.f13837a == 5) {
            n();
            if (i10 == 0) {
                this.P.p();
            } else if (i10 == 1) {
                ki.s0 s0Var = this.P;
                s0Var.getClass();
                ki.s0.s();
                if (s0Var.V == 5 && (f0Var = s0Var.R) != null) {
                    f0Var.e();
                    s0Var.w(false);
                    ka.c cVar = s0Var.f13846c;
                    s0Var.R.J0();
                    cVar.getClass();
                }
            } else if (i10 == 2) {
                ki.s0 s0Var2 = this.P;
                long j3 = f7 * ((float) this.R.f13838b);
                s0Var2.getClass();
                ki.s0.s();
                if (s0Var2.V == 5 && s0Var2.R != null) {
                    long j10 = s0Var2.F;
                    s0Var2.R.W0(5, Math.max(j10, Math.min(Math.max(j10, s0Var2.G - 1), j3)));
                    s0Var2.f13846c.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        ValueAnimator valueAnimator = this.f23547a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ki.s0 s0Var = this.P;
        if (s0Var != null) {
            ki.s0.s();
            int i10 = s0Var.V;
            if (i10 == 10) {
                if (!s0Var.B) {
                    s0Var.h();
                }
            } else if (i10 != 8) {
                s0Var.a();
            } else {
                s0Var.d();
                s0Var.q();
                s0Var.f13851k.s();
                s0Var.B = true;
                s0Var.u(10);
                s0Var.l("released");
                s0Var.h.removeCallbacksAndMessages(null);
                s0Var.f13849i.shutdown();
                s0Var.f13850j.shutdown();
            }
            this.P = null;
        }
        q01 q01Var = this.T;
        if (q01Var != null) {
            q01Var.d(true ^ this.f23556i0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        u();
        b60 b60Var = this.v;
        b60Var.setTranslationX(0.0f);
        this.f23563p0 = 0.0f;
        b60Var.setTranslationY(0.0f + this.f23562o0);
        b60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean d() {
        ki.r0 r0Var = this.R;
        if (r0Var != null) {
            int i10 = r0Var.f13837a;
            if (i10 == 4 || i10 == 5 || i10 == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e(float f7) {
        float f10 = f7 * 0.5f;
        this.f23562o0 = f10;
        this.v.setTranslationY(this.f23563p0 + f10);
    }

    @Override
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        ki.r0 r0Var;
        boolean z11;
        int i13;
        ki.s0 s0Var = this.P;
        if (s0Var != null && (r0Var = this.R) != null) {
            if (i10 == 3) {
                if (s0Var != null && r0Var != null && r0Var.f13837a == 3) {
                    r(2);
                    this.P.o();
                }
            } else if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f23560n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.R.f13837a == 3) {
                    r(5);
                } else {
                    n();
                }
                this.V = new c60(j3, i11, i12, z10, j10);
                ki.s0 s0Var2 = this.P;
                boolean z12 = this.f23555h0;
                boolean z13 = !z12;
                s0Var2.getClass();
                ki.s0.s();
                int i14 = s0Var2.V;
                if (i14 == 3 || i14 == 5) {
                    s0Var2.f13852l.b("finish requested: state=" + hg.k0.C(s0Var2.V) + ", includeAudio=" + z13 + ", durationMs=" + s0Var2.i() + ", trim=" + s0Var2.F + ".." + s0Var2.G);
                    s0Var2.f13864y = z13;
                    if (s0Var2.V == 3) {
                        s0Var2.D = s0Var2.i();
                        s0Var2.f13863x = true;
                        s0Var2.d();
                        s0Var2.h.removeCallbacks(s0Var2.S);
                        s0Var2.u(7);
                        boolean D = s0Var2.f13851k.D();
                        s0Var2.A = D;
                        if (!D) {
                            s0Var2.g(new IllegalStateException("Unable to stop the camera segment"));
                            return;
                        }
                        return;
                    }
                    s0Var2.q();
                    s0Var2.u(7);
                    if (!s0Var2.k() && !z12) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (s0Var2.k()) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    s0Var2.f13849i.execute(new ki.g0(s0Var2, s0Var2.P, z11, s0Var2.Q, z13, i13, s0Var2.O));
                }
            }
        }
    }

    @Override
    public final void g(ah.c cVar, org.telegram.ui.ij ijVar) {
        View view = this.F;
        ch.d c10 = cVar.c(view, ijVar, false);
        c10.v(AndroidUtilities.dp(6.0f));
        c10.w(AndroidUtilities.dp(21.0f));
        view.setBackground(c10);
    }

    @Override
    public View getButtonsLayout() {
        return this.F;
    }

    @Override
    public g60 getCameraContainer() {
        return this.v;
    }

    @Override
    public RectF getCameraRect() {
        a60 a60Var = this.f23576y;
        int[] iArr = this.K;
        a60Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], a60Var.getWidth() + i10, a60Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.I;
    }

    @Override
    public Paint getPaint() {
        return this.f23572w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f23576y;
    }

    @Override
    public final void h(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.f23572w.getPaint().setAlpha(255);
        this.f23556i0 = false;
        this.f23555h0 = false;
        this.f23551e0 = false;
        this.f23554g0 = false;
        this.f23561n0 = 0L;
        this.f23572w.setProgress(0.0f);
        org.telegram.ui.jl jlVar = this.E;
        if (!this.f23558k0) {
            if (this.m0 == null) {
                try {
                    this.m0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.m0;
            if (bitmap != null) {
                jlVar.setImageBitmap(bitmap);
            } else {
                jlVar.setImageResource(R.drawable.icplaceholder);
            }
            this.f23558k0 = true;
            jlVar.animate().cancel();
            jlVar.setAlpha(1.0f);
            jlVar.invalidate();
        }
        this.T = new q01(this.h, this.f23565r);
        this.Q = (ki.q0) qi.e.f42135c.a();
        ki.j0 j0Var = new ki.j0(getContext(), this.f23576y);
        j0Var.f13753c = (ki.l0) qi.e.h.a();
        j0Var.d = this.Q;
        j0Var.f13755g = qi.e.f42136f.a();
        j0Var.e = (ki.m0) qi.e.d.a();
        j0Var.f13754f = (ki.n0) qi.e.e.a();
        j0Var.h = qi.e.f42137g.a();
        ka.c cVar = this.C0;
        j0Var.f13756i = cVar;
        q01 q01Var = this.T;
        j0Var.f13757j = q01Var;
        j0Var.f13758k = new nv(this, 6);
        if (j0Var.f13753c != null) {
            if (j0Var.d != null) {
                if (j0Var.f13755g > 0) {
                    if (j0Var.e != null) {
                        if (j0Var.f13754f != null) {
                            if (cVar != null) {
                                if (q01Var != null) {
                                    this.P = new ki.s0(j0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    ki.s0 s0Var = this.P;
                                    s0Var.getClass();
                                    ki.s0.s();
                                    if (s0Var.V == 1) {
                                        try {
                                            s0Var.f13852l.b("start requested");
                                            s0Var.c(true);
                                            s0Var.u(2);
                                            s0Var.f13851k.C(s0Var.P, 0L, s0Var.f13855o);
                                        } catch (Exception e) {
                                            s0Var.g(e);
                                        }
                                    }
                                    t(true, false);
                                    return;
                                }
                                throw new IllegalStateException("Output listener is required");
                            }
                            throw new IllegalStateException("Session listener is required");
                        }
                        throw new IllegalStateException("Frame rate is required");
                    }
                    throw new IllegalStateException("Camera resolution is required");
                }
                throw new IllegalStateException("Video bitrate is required");
            }
            throw new IllegalStateException("Output resolution is required");
        }
        throw new IllegalStateException("Initial camera is required");
    }

    @Override
    public final void i() {
        ki.r0 r0Var;
        ki.s0 s0Var = this.P;
        if (s0Var != null && (r0Var = this.R) != null) {
            int i10 = r0Var.f13837a;
            if (i10 == 3) {
                if (s0Var != null && r0Var != null && i10 == 3) {
                    r(2);
                    this.P.o();
                }
            } else if (i10 == 5) {
                this.U = null;
                this.f23553f0 = true;
                this.f23554g0 = false;
                ki.s0.s();
                if (s0Var.V == 5 && s0Var.G - s0Var.F < s0Var.f13854n) {
                    s0Var.L++;
                    s0Var.f13852l.b("resume requested: trim=" + s0Var.F + ".." + s0Var.G + ", sourceDurationMs=" + s0Var.D);
                    s0Var.q();
                    s0Var.u(6);
                    s0Var.f13849i.execute(new ci.u1(s0Var, s0Var.k(), s0Var.P, s0Var.O, s0Var.Q));
                }
            }
        }
    }

    public final void n() {
        ki.r0 r0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P != null && (r0Var = this.R) != null && (videoEditedInfo = this.U) != null) {
            long j3 = r0Var.f13838b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j10 = this.U.endTime;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            ki.s0 s0Var = this.P;
            s0Var.getClass();
            ki.s0.s();
            if (s0Var.V == 5) {
                long max2 = Math.max(0L, Math.min(s0Var.D, max));
                long max3 = Math.max(max2, Math.min(s0Var.D, j3));
                if (max3 - max2 >= Math.min(800L, s0Var.D)) {
                    s0Var.F = max2;
                    s0Var.G = max3;
                    i2.f0 f0Var = s0Var.R;
                    if (f0Var != null) {
                        f0Var.W0(5, max2);
                    }
                    s0Var.f13846c.getClass();
                    s0Var.n();
                }
            }
        }
    }

    public final Bitmap o(Bitmap bitmap) {
        a60 a60Var = this.f23576y;
        if (a60Var.getWidth() > 0 && a60Var.getHeight() > 0) {
            Matrix matrix = this.L;
            a60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / a60Var.getWidth();
                float height = bitmap.getHeight() / a60Var.getHeight();
                fArr[1] = (width / height) * fArr[1];
                fArr[2] = fArr[2] * width;
                fArr[3] = (height / width) * fArr[3];
                fArr[5] = fArr[5] * height;
                fArr[6] = fArr[6] / width;
                fArr[7] = fArr[7] / height;
                matrix.setValues(fArr);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(bitmap, matrix, this.N);
                bitmap.recycle();
                return createBitmap;
            }
        }
        return bitmap;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (View.MeasureSpec.getSize(i11) - getPaddingBottom() > View.MeasureSpec.getSize(i10) * 1.3f) {
            i12 = AndroidUtilities.roundPlayingMessageSize;
        } else {
            i12 = AndroidUtilities.roundMessageSize;
        }
        if (this.f23575x0 != i12) {
            this.f23575x0 = i12;
            b60 b60Var = this.v;
            b60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            b60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ci.x2 x2Var = this.J;
        x2Var.f5817b.measure(makeMeasureSpec, makeMeasureSpec2);
        x2Var.f5818c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public final VideoEditedInfo p(File file, long j3, p01 p01Var) {
        long j10;
        int i10;
        int i11;
        ki.n0 n0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        if (p01Var == null) {
            j10 = file.length();
        } else {
            j10 = p01Var.f27238a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j10);
        videoEditedInfo.roundVideo = true;
        ki.s0 s0Var = this.P;
        if (s0Var != null && (n0Var = s0Var.f13858r) != null) {
            i10 = n0Var.f13799a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        ki.q0 q0Var = this.Q;
        if (q0Var == null) {
            i11 = 480;
        } else {
            i11 = q0Var.f13833a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (p01Var != null) {
            videoEditedInfo.file = p01Var.f27239b;
            videoEditedInfo.encryptedFile = p01Var.f27240c;
            videoEditedInfo.key = p01Var.d;
            videoEditedInfo.iv = p01Var.e;
        }
        return videoEditedInfo;
    }

    public final void q() {
        if (this.f23570u0) {
            this.f23570u0 = false;
            this.f23568s0 = -1;
            this.f23569t0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f23547a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f23566r0, 0.0f);
            this.f23547a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f23547a0.addUpdateListener(new y50(this, 1));
            this.f23547a0.start();
        }
    }

    public final void r(int i10) {
        if (this.f23554g0 && i10 == 2) {
            return;
        }
        this.f23554g0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f23560n), Integer.valueOf(i10));
    }

    public final void s(boolean z10) {
        Bitmap bitmap;
        a60 a60Var = this.f23576y;
        if (a60Var.isAvailable() && (bitmap = a60Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = o(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.m0;
                    this.m0 = bitmap;
                    if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    if (z10) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            fileOutputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    if (bitmap != this.m0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.m0) {
                    bitmap.recycle();
                }
            }
        }
    }

    @Override
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
        this.v.getClass();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.F.setAlpha(0.0f);
        b60 b60Var = this.v;
        b60Var.setAlpha(0.0f);
        b60Var.setScaleX(0.1f);
        b60Var.setScaleY(0.1f);
        b60Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f23572w.getPaint().setAlpha(0);
        try {
            Activity activity = (Activity) getContext();
            if (i10 == 0) {
                activity.getWindow().addFlags(128);
            } else {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void t(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        f60 f60Var = this.f25333a;
        if (f60Var != null) {
            ((org.telegram.ui.se) f60Var).f37407b.f39950uc.a(z10, true);
        }
        AnimatorSet animatorSet = this.W;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.W.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        b60 b60Var = this.v;
        if (z10 && !this.f23557j0) {
            b60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f23563p0 = measuredHeight;
            b60Var.setTranslationY(measuredHeight + this.f23562o0);
        }
        this.f23557j0 = z10;
        View view = this.f23567s;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f23561n0) > 300) {
            f7 = AndroidUtilities.dp(24.0f) - (getMeasuredWidth() * 0.5f);
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        ofFloat.addUpdateListener(new y50(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W = animatorSet2;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float[] fArr = {f12};
        LinearLayout linearLayout = this.F;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(b60Var, property, f13);
        float f16 = 0.1f;
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(b60Var, View.SCALE_X, f14);
        if (z10) {
            f16 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(b60Var, View.SCALE_Y, f16);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(b60Var, View.TRANSLATION_X, f7);
        if (this.f23555h0 && z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.I, property, f15), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.W.addListener(new r8(this, 24));
        } else {
            setTranslationX(0.0f);
        }
        this.W.start();
    }

    public final void u() {
        if (!this.f23571v0) {
            return;
        }
        this.f23571v0 = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public final void v() {
        ki.r0 r0Var = this.R;
        int i10 = this.O;
        ci.v2 v2Var = this.H;
        if (r0Var != null && r0Var.f13840f) {
            if (this.f23550d0 == null) {
                kj0 kj0Var = new kj0(R.raw.roundcamera_flash_off, i10, i10);
                this.f23550d0 = kj0Var;
                kj0Var.setCallback(v2Var);
            }
            v2Var.setImageDrawable(this.f23550d0);
            return;
        }
        if (this.f23549c0 == null) {
            kj0 kj0Var2 = new kj0(R.raw.roundcamera_flash_on, i10, i10);
            this.f23549c0 = kj0Var2;
            kj0Var2.setCallback(v2Var);
        }
        v2Var.setImageDrawable(this.f23549c0);
    }

    public final void w() {
        org.telegram.ui.lk lkVar;
        float f7;
        ki.r0 r0Var = this.R;
        if (r0Var != null) {
            long j3 = r0Var.d;
            if (r0Var.f13837a == 3) {
                long min = Math.min(j3, (SystemClock.elapsedRealtime() + r0Var.f13838b) - r0Var.f13839c);
                this.f23561n0 = min;
                this.f23572w.setProgress(((float) min) / ((float) j3));
                h60 h60Var = this.f25335c;
                if (h60Var != null && (lkVar = ((org.telegram.ui.pj) h60Var).f36496a.Y) != null && lkVar.f22014j1) {
                    lkVar.f22008i1 = min;
                    xg xgVar = lkVar.Y0;
                    if (xgVar != null && xgVar.f30408r) {
                        xgVar.h = min;
                        xgVar.invalidate();
                    }
                    ug ugVar = lkVar.l1;
                    if (ugVar != null && ugVar.f28879n) {
                        if (!ugVar.h) {
                            long j10 = ugVar.f28880r;
                            if (j10 >= 0) {
                                if (!ugVar.e) {
                                    long max = Math.max(0L, min - j10) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    ugVar.f28875a = f7;
                                }
                                ugVar.invalidate();
                            }
                        }
                        ugVar.f28880r = min;
                        ugVar.f28875a = 1.0f;
                        ugVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = lkVar.f22019k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f22117n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }
}
