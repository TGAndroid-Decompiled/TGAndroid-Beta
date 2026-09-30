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
public final class e60 extends k60 {
    public boolean A0;
    public final aq B0;
    public final l.d C0;
    public final org.telegram.ui.il E;
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
    public r01 T;
    public VideoEditedInfo U;
    public d60 V;
    public AnimatorSet W;
    public ValueAnimator f23858a0;
    public final lj0 f23859b0;
    public lj0 f23860c0;
    public lj0 f23861d0;
    public boolean f23862e0;
    public final r50 f23863f;
    public boolean f23864f0;
    public boolean f23865g0;
    public final int h;
    public boolean f23866h0;
    public boolean f23867i0;
    public boolean f23868j0;
    public boolean f23869k0;
    public boolean f23870l0;
    public Bitmap m0;
    public final int f23871n;
    public long f23872n0;
    public float f23873o0;
    public float f23874p0;
    public float f23875q0;
    public final boolean f23876r;
    public float f23877r0;
    public final View f23878s;
    public int f23879s0;
    public int f23880t0;
    public boolean f23881u0;
    public final c60 v;
    public boolean f23882v0;
    public final lm0 f23883w;
    public float f23884w0;
    public final FrameLayout f23885x;
    public int f23886x0;
    public final b60 f23887y;
    public long f23888y0;
    public boolean f23889z0;

    public e60(Activity activity, r50 r50Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.f23879s0 = -1;
        this.f23880t0 = -1;
        this.f23884w0 = Float.NaN;
        this.B0 = new aq(this, 25);
        this.C0 = new l.d(this);
        this.f23863f = r50Var;
        this.f23871n = r50Var.getClassGuid();
        this.f23876r = r50Var.v();
        this.f23878s = r50Var.getFragmentView();
        setWillNotDraw(false);
        ci.x2 x2Var = new ci.x2(activity, null, this, null);
        this.J = x2Var;
        x2Var.f5830o = 0.5f;
        x2Var.f5829n = ci.x2.f(0.5f);
        x2Var.g();
        addView(x2Var.f5820b, w7.y5.e(-1, -1, 119));
        c60 c60Var = new c60(this, activity);
        this.v = c60Var;
        lm0 lm0Var = new lm0(activity);
        this.f23883w = lm0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f23885x = frameLayout;
        b60 b60Var = new b60(this, activity, 0);
        b60Var.setOpaque(true);
        b60Var.setClickable(true);
        b60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        b60Var.setOutlineProvider(new ai.k2(13));
        b60Var.setClipToOutline(true);
        this.f23887y = b60Var;
        frameLayout.addView(b60Var, w7.y5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, activity, paint);
        this.E = ilVar;
        ilVar.setOutlineProvider(new ai.k2(12));
        ilVar.setClipToOutline(true);
        frameLayout.addView(ilVar, w7.y5.e(-1, -1, 119));
        lm0Var.addView(frameLayout, w7.y5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        c60Var.addView(lm0Var, w7.y5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(c60Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(x2Var.f5821c, w7.y5.e(-1, -1, 119));
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
            public final e60 f22573b;

            {
                this.f22573b = this;
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
                        e60 e60Var = this.f22573b;
                        ki.s0 s0Var = e60Var.P;
                        if (s0Var != null && (r0Var = e60Var.R) != null && (k0Var = e60Var.S) != null && r0Var.f13851a == 3 && !r0Var.e) {
                            ki.l0 l0Var = k0Var.f13775a;
                            ki.l0 l0Var2 = ki.l0.f13800a;
                            if (l0Var == l0Var2) {
                                l0Var2 = ki.l0.f13801b;
                            }
                            s0Var.getClass();
                            ki.s0.t();
                            int i12 = s0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (s0Var.f13870p != l0Var2) {
                                    s0Var.f13867m.b("camera facing requested: " + s0Var.f13870p + " -> " + l0Var2 + ", state=" + hg.c.C(s0Var.W));
                                    s0Var.f13870p = l0Var2;
                                    int i13 = s0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        s0Var.e();
                                        ki.i iVar = s0Var.f13866l;
                                        iVar.C = l0Var2;
                                        Handler handler = iVar.f13735n;
                                        if (iVar.S && handler != null) {
                                            handler.post(new gg.x1(27, iVar, l0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        s0Var.f13876w = z10;
                                    }
                                    s0Var.n();
                                    s0Var.o();
                                }
                                e60Var.f23859b0.M(0);
                                e60Var.f23859b0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e60 e60Var2 = this.f22573b;
                        ki.s0 s0Var2 = e60Var2.P;
                        if (s0Var2 != null && (r0Var2 = e60Var2.R) != null && e60Var2.S != null) {
                            boolean z11 = !r0Var2.f13854f;
                            ki.i iVar2 = s0Var2.f13866l;
                            ki.s0.t();
                            if (s0Var2.W == 3 && !s0Var2.f13876w && (i11 = s0Var2.X) != 1) {
                                s0Var2.f13875u = z11;
                                if (i11 == 3) {
                                    s0Var2.u(z11);
                                    iVar2.y(false);
                                } else {
                                    s0Var2.u(false);
                                    iVar2.y(z11);
                                }
                                s0Var2.o();
                                e60Var2.v();
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
            public final e60 f22573b;

            {
                this.f22573b = this;
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
                        e60 e60Var = this.f22573b;
                        ki.s0 s0Var = e60Var.P;
                        if (s0Var != null && (r0Var = e60Var.R) != null && (k0Var = e60Var.S) != null && r0Var.f13851a == 3 && !r0Var.e) {
                            ki.l0 l0Var = k0Var.f13775a;
                            ki.l0 l0Var2 = ki.l0.f13800a;
                            if (l0Var == l0Var2) {
                                l0Var2 = ki.l0.f13801b;
                            }
                            s0Var.getClass();
                            ki.s0.t();
                            int i12 = s0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (s0Var.f13870p != l0Var2) {
                                    s0Var.f13867m.b("camera facing requested: " + s0Var.f13870p + " -> " + l0Var2 + ", state=" + hg.c.C(s0Var.W));
                                    s0Var.f13870p = l0Var2;
                                    int i13 = s0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        s0Var.e();
                                        ki.i iVar = s0Var.f13866l;
                                        iVar.C = l0Var2;
                                        Handler handler = iVar.f13735n;
                                        if (iVar.S && handler != null) {
                                            handler.post(new gg.x1(27, iVar, l0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        s0Var.f13876w = z10;
                                    }
                                    s0Var.n();
                                    s0Var.o();
                                }
                                e60Var.f23859b0.M(0);
                                e60Var.f23859b0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e60 e60Var2 = this.f22573b;
                        ki.s0 s0Var2 = e60Var2.P;
                        if (s0Var2 != null && (r0Var2 = e60Var2.R) != null && e60Var2.S != null) {
                            boolean z11 = !r0Var2.f13854f;
                            ki.i iVar2 = s0Var2.f13866l;
                            ki.s0.t();
                            if (s0Var2.W == 3 && !s0Var2.f13876w && (i11 = s0Var2.X) != 1) {
                                s0Var2.f13875u = z11;
                                if (i11 == 3) {
                                    s0Var2.u(z11);
                                    iVar2.y(false);
                                } else {
                                    s0Var2.u(false);
                                    iVar2.y(z11);
                                }
                                s0Var2.o();
                                e60Var2.v();
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
        lj0 lj0Var = new lj0(R.raw.roundcamera_flip, dp, dp);
        this.f23859b0 = lj0Var;
        lj0Var.setCallback(imageView);
        lj0Var.M(lj0Var.e[0] - 1);
        imageView.setImageDrawable(lj0Var);
        v();
        if (d6Var != null && !d6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.I = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.y5.e(48, 48, 17));
        b60Var.setOnTouchListener(new yr(this, 1));
        super.setVisibility(4);
    }

    private long getCurrentDurationMs() {
        ki.r0 r0Var;
        ki.s0 s0Var = this.P;
        if (s0Var != null && (r0Var = this.R) != null) {
            if (r0Var.f13851a == 3) {
                return s0Var.j();
            }
            return r0Var.f13852b;
        }
        return 0L;
    }

    public static void k(e60 e60Var) {
        boolean z10;
        ki.k0 k0Var;
        ki.r0 r0Var = e60Var.R;
        boolean z11 = false;
        if (r0Var != null && r0Var.f13851a == 3 && !r0Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        e60Var.G.setEnabled(z10);
        ci.v2 v2Var = e60Var.H;
        if (z10 && (k0Var = e60Var.S) != null && k0Var.f13776b != 1) {
            z11 = true;
        }
        v2Var.setEnabled(z11);
        e60Var.v();
    }

    public static void l(e60 e60Var) {
        org.telegram.ui.il ilVar = e60Var.E;
        if (!e60Var.f23869k0) {
            return;
        }
        e60Var.f23869k0 = false;
        ilVar.invalidate();
        ilVar.animate().cancel();
        ilVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.jk jkVar;
        if (z10 != this.f23889z0) {
            this.f23889z0 = z10;
            this.f23888y0 = 0L;
            aq aqVar = this.B0;
            if (z10) {
                yf.h.d().a(30, aqVar);
            } else {
                yf.h.d().f(aqVar);
            }
            if (this.d != z10) {
                this.d = z10;
                i60 i60Var = this.f25657c;
                if (i60Var != null && (jkVar = ((org.telegram.ui.nj) i60Var).f36015a.Y) != null) {
                    jkVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f23863f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ci.x2 x2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.f23884w0)) {
                this.f23884w0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            x2Var.c(null);
        } else {
            if (!Float.isNaN(this.f23884w0)) {
                attributes.screenBrightness = this.f23884w0;
                this.f23884w0 = Float.NaN;
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
        r01 r01Var = this.T;
        if (r01Var != null) {
            r01Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        t(false, false);
    }

    @Override
    public final void b(float f7, int i10) {
        ki.r0 r0Var;
        i2.f0 f0Var;
        if (this.P != null && (r0Var = this.R) != null && r0Var.f13851a == 5) {
            n();
            if (i10 == 0) {
                this.P.q();
            } else if (i10 == 1) {
                ki.s0 s0Var = this.P;
                s0Var.getClass();
                ki.s0.t();
                if (s0Var.W == 5 && (f0Var = s0Var.S) != null) {
                    f0Var.e();
                    s0Var.x(false);
                    l.d dVar = s0Var.d;
                    s0Var.S.J0();
                    dVar.getClass();
                }
            } else if (i10 == 2) {
                ki.s0 s0Var2 = this.P;
                long j3 = f7 * ((float) this.R.f13852b);
                s0Var2.getClass();
                ki.s0.t();
                if (s0Var2.W == 5 && s0Var2.S != null) {
                    long j10 = s0Var2.G;
                    s0Var2.S.W0(5, Math.max(j10, Math.min(Math.max(j10, s0Var2.H - 1), j3)));
                    s0Var2.d.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        ValueAnimator valueAnimator = this.f23858a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ki.s0 s0Var = this.P;
        if (s0Var != null) {
            ki.s0.t();
            int i10 = s0Var.W;
            if (i10 == 10) {
                if (!s0Var.C) {
                    s0Var.i();
                }
            } else if (i10 != 8) {
                s0Var.a();
            } else {
                s0Var.e();
                s0Var.r();
                s0Var.f13866l.s();
                s0Var.C = true;
                s0Var.v(10);
                s0Var.m("released");
                s0Var.f13863i.removeCallbacksAndMessages(null);
                s0Var.f13864j.shutdown();
                s0Var.f13865k.shutdown();
            }
            this.P = null;
        }
        r01 r01Var = this.T;
        if (r01Var != null) {
            r01Var.d(true ^ this.f23867i0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        u();
        c60 c60Var = this.v;
        c60Var.setTranslationX(0.0f);
        this.f23874p0 = 0.0f;
        c60Var.setTranslationY(0.0f + this.f23873o0);
        c60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean d() {
        ki.r0 r0Var = this.R;
        if (r0Var != null) {
            int i10 = r0Var.f13851a;
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
        this.f23873o0 = f10;
        this.v.setTranslationY(this.f23874p0 + f10);
    }

    @Override
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        ki.r0 r0Var;
        boolean z11;
        int i13;
        ki.s0 s0Var = this.P;
        if (s0Var != null && (r0Var = this.R) != null) {
            if (i10 == 3) {
                if (s0Var != null && r0Var != null && r0Var.f13851a == 3) {
                    r(2);
                    this.P.p();
                }
            } else if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f23871n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.R.f13851a == 3) {
                    r(5);
                } else {
                    n();
                }
                this.V = new d60(j3, i11, i12, z10, j10);
                ki.s0 s0Var2 = this.P;
                boolean z12 = this.f23866h0;
                boolean z13 = !z12;
                s0Var2.getClass();
                ki.s0.t();
                int i14 = s0Var2.W;
                if (i14 == 3 || i14 == 5) {
                    s0Var2.f13867m.b("finish requested: state=" + hg.c.C(s0Var2.W) + ", includeAudio=" + z13 + ", durationMs=" + s0Var2.j() + ", trim=" + s0Var2.G + ".." + s0Var2.H);
                    s0Var2.f13879z = z13;
                    if (s0Var2.W == 3) {
                        s0Var2.E = s0Var2.j();
                        s0Var2.f13878y = true;
                        s0Var2.e();
                        s0Var2.f13863i.removeCallbacks(s0Var2.T);
                        s0Var2.v(7);
                        boolean D = s0Var2.f13866l.D();
                        s0Var2.B = D;
                        if (!D) {
                            s0Var2.h(new IllegalStateException("Unable to stop the camera segment"));
                            return;
                        }
                        return;
                    }
                    s0Var2.r();
                    s0Var2.v(7);
                    if (!s0Var2.l() && !z12) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (s0Var2.l()) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    s0Var2.f13864j.execute(new ki.g0(s0Var2, s0Var2.Q, z11, s0Var2.R, z13, i13, s0Var2.P));
                }
            }
        }
    }

    @Override
    public final void g(ah.c cVar, org.telegram.ui.gj gjVar) {
        View view = this.F;
        ch.d c10 = cVar.c(view, gjVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        view.setBackground(c10);
    }

    @Override
    public View getButtonsLayout() {
        return this.F;
    }

    @Override
    public h60 getCameraContainer() {
        return this.v;
    }

    @Override
    public RectF getCameraRect() {
        b60 b60Var = this.f23887y;
        int[] iArr = this.K;
        b60Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], b60Var.getWidth() + i10, b60Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.I;
    }

    @Override
    public Paint getPaint() {
        return this.f23883w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f23887y;
    }

    @Override
    public final void h(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.f23883w.getPaint().setAlpha(255);
        this.f23867i0 = false;
        this.f23866h0 = false;
        this.f23862e0 = false;
        this.f23865g0 = false;
        this.f23872n0 = 0L;
        this.f23883w.setProgress(0.0f);
        org.telegram.ui.il ilVar = this.E;
        if (!this.f23869k0) {
            if (this.m0 == null) {
                try {
                    this.m0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.m0;
            if (bitmap != null) {
                ilVar.setImageBitmap(bitmap);
            } else {
                ilVar.setImageResource(R.drawable.icplaceholder);
            }
            this.f23869k0 = true;
            ilVar.animate().cancel();
            ilVar.setAlpha(1.0f);
            ilVar.invalidate();
        }
        this.T = new r01(this.h, this.f23876r);
        this.Q = (ki.q0) pi.e.f41459c.a();
        ki.j0 j0Var = new ki.j0(getContext(), this.f23887y);
        j0Var.f13766c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        j0Var.d = (ki.l0) pi.e.h.a();
        j0Var.e = this.Q;
        j0Var.h = pi.e.f41460f.a();
        j0Var.f13767f = (ki.m0) pi.e.d.a();
        j0Var.f13768g = (ki.n0) pi.e.e.a();
        j0Var.f13769i = pi.e.f41461g.a();
        l.d dVar = this.C0;
        j0Var.f13770j = dVar;
        r01 r01Var = this.T;
        j0Var.f13771k = r01Var;
        j0Var.f13772l = new ov(this, 6);
        if (j0Var.d != null) {
            if (j0Var.e != null) {
                if (j0Var.h > 0) {
                    if (j0Var.f13767f != null) {
                        if (j0Var.f13768g != null) {
                            if (dVar != null) {
                                if (r01Var != null) {
                                    this.P = new ki.s0(j0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    ki.s0 s0Var = this.P;
                                    s0Var.getClass();
                                    ki.s0.t();
                                    if (s0Var.W == 1) {
                                        try {
                                            s0Var.f13867m.b("start requested");
                                            s0Var.c(true);
                                            s0Var.v(2);
                                            s0Var.f13866l.C(s0Var.Q, 0L, s0Var.f13870p);
                                        } catch (Exception e) {
                                            s0Var.h(e);
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
            int i10 = r0Var.f13851a;
            if (i10 == 3) {
                if (s0Var != null && r0Var != null && i10 == 3) {
                    r(2);
                    this.P.p();
                }
            } else if (i10 == 5) {
                this.U = null;
                this.f23864f0 = true;
                this.f23865g0 = false;
                ki.s0.t();
                if (s0Var.W == 5 && s0Var.H - s0Var.G < s0Var.f13869o) {
                    s0Var.M++;
                    s0Var.f13867m.b("resume requested: trim=" + s0Var.G + ".." + s0Var.H + ", sourceDurationMs=" + s0Var.E);
                    s0Var.r();
                    s0Var.v(6);
                    s0Var.f13864j.execute(new ci.u1(s0Var, s0Var.l(), s0Var.Q, s0Var.P, s0Var.R));
                }
            }
        }
    }

    public final void n() {
        ki.r0 r0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P != null && (r0Var = this.R) != null && (videoEditedInfo = this.U) != null) {
            long j3 = r0Var.f13852b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j10 = this.U.endTime;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            ki.s0 s0Var = this.P;
            s0Var.getClass();
            ki.s0.t();
            if (s0Var.W == 5) {
                long max2 = Math.max(0L, Math.min(s0Var.E, max));
                long max3 = Math.max(max2, Math.min(s0Var.E, j3));
                if (max3 - max2 >= Math.min(800L, s0Var.E)) {
                    s0Var.G = max2;
                    s0Var.H = max3;
                    i2.f0 f0Var = s0Var.S;
                    if (f0Var != null) {
                        f0Var.W0(5, max2);
                    }
                    s0Var.d.getClass();
                    s0Var.o();
                }
            }
        }
    }

    public final Bitmap o(Bitmap bitmap) {
        b60 b60Var = this.f23887y;
        if (b60Var.getWidth() > 0 && b60Var.getHeight() > 0) {
            Matrix matrix = this.L;
            b60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / b60Var.getWidth();
                float height = bitmap.getHeight() / b60Var.getHeight();
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
        if (this.f23886x0 != i12) {
            this.f23886x0 = i12;
            c60 c60Var = this.v;
            c60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            c60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ci.x2 x2Var = this.J;
        x2Var.f5820b.measure(makeMeasureSpec, makeMeasureSpec2);
        x2Var.f5821c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public final VideoEditedInfo p(File file, long j3, q01 q01Var) {
        long j10;
        int i10;
        int i11;
        ki.n0 n0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        if (q01Var == null) {
            j10 = file.length();
        } else {
            j10 = q01Var.f27511a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j10);
        videoEditedInfo.roundVideo = true;
        ki.s0 s0Var = this.P;
        if (s0Var != null && (n0Var = s0Var.f13873s) != null) {
            i10 = n0Var.f13813a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        ki.q0 q0Var = this.Q;
        if (q0Var == null) {
            i11 = 480;
        } else {
            i11 = q0Var.f13847a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (q01Var != null) {
            videoEditedInfo.file = q01Var.f27512b;
            videoEditedInfo.encryptedFile = q01Var.f27513c;
            videoEditedInfo.key = q01Var.d;
            videoEditedInfo.iv = q01Var.e;
        }
        return videoEditedInfo;
    }

    public final void q() {
        if (this.f23881u0) {
            this.f23881u0 = false;
            this.f23879s0 = -1;
            this.f23880t0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f23858a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f23877r0, 0.0f);
            this.f23858a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f23858a0.addUpdateListener(new z50(this, 1));
            this.f23858a0.start();
        }
    }

    public final void r(int i10) {
        if (this.f23865g0 && i10 == 2) {
            return;
        }
        this.f23865g0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f23871n), Integer.valueOf(i10));
    }

    public final void s(boolean z10) {
        Bitmap bitmap;
        b60 b60Var = this.f23887y;
        if (b60Var.isAvailable() && (bitmap = b60Var.getBitmap(180, 180)) != null) {
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
        c60 c60Var = this.v;
        c60Var.setAlpha(0.0f);
        c60Var.setScaleX(0.1f);
        c60Var.setScaleY(0.1f);
        c60Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f23883w.getPaint().setAlpha(0);
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
        g60 g60Var = this.f25655a;
        if (g60Var != null) {
            ((org.telegram.ui.pe) g60Var).f36612b.f39761uc.a(z10, true);
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
        c60 c60Var = this.v;
        if (z10 && !this.f23868j0) {
            c60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f23874p0 = measuredHeight;
            c60Var.setTranslationY(measuredHeight + this.f23873o0);
        }
        this.f23868j0 = z10;
        View view = this.f23878s;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f23872n0) > 300) {
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
        ofFloat.addUpdateListener(new z50(this, 0));
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
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c60Var, property, f13);
        float f16 = 0.1f;
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c60Var, View.SCALE_X, f14);
        if (z10) {
            f16 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(c60Var, View.SCALE_Y, f16);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(c60Var, View.TRANSLATION_X, f7);
        if (this.f23866h0 && z10) {
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
        if (!this.f23882v0) {
            return;
        }
        this.f23882v0 = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public final void v() {
        ki.r0 r0Var = this.R;
        int i10 = this.O;
        ci.v2 v2Var = this.H;
        if (r0Var != null && r0Var.f13854f) {
            if (this.f23861d0 == null) {
                lj0 lj0Var = new lj0(R.raw.roundcamera_flash_off, i10, i10);
                this.f23861d0 = lj0Var;
                lj0Var.setCallback(v2Var);
            }
            v2Var.setImageDrawable(this.f23861d0);
            return;
        }
        if (this.f23860c0 == null) {
            lj0 lj0Var2 = new lj0(R.raw.roundcamera_flash_on, i10, i10);
            this.f23860c0 = lj0Var2;
            lj0Var2.setCallback(v2Var);
        }
        v2Var.setImageDrawable(this.f23860c0);
    }

    public final void w() {
        org.telegram.ui.jk jkVar;
        float f7;
        ki.r0 r0Var = this.R;
        if (r0Var != null) {
            long j3 = r0Var.d;
            if (r0Var.f13851a == 3) {
                long min = Math.min(j3, (SystemClock.elapsedRealtime() + r0Var.f13852b) - r0Var.f13853c);
                this.f23872n0 = min;
                this.f23883w.setProgress(((float) min) / ((float) j3));
                i60 i60Var = this.f25657c;
                if (i60Var != null && (jkVar = ((org.telegram.ui.nj) i60Var).f36015a.Y) != null && jkVar.f22033j1) {
                    jkVar.f22027i1 = min;
                    yg ygVar = jkVar.Y0;
                    if (ygVar != null && ygVar.f30709r) {
                        ygVar.h = min;
                        ygVar.invalidate();
                    }
                    vg vgVar = jkVar.l1;
                    if (vgVar != null && vgVar.f29114n) {
                        if (!vgVar.h) {
                            long j10 = vgVar.f29115r;
                            if (j10 >= 0) {
                                if (!vgVar.e) {
                                    long max = Math.max(0L, min - j10) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    vgVar.f29110a = f7;
                                }
                                vgVar.invalidate();
                            }
                        }
                        vgVar.f29115r = min;
                        vgVar.f29110a = 1.0f;
                        vgVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = jkVar.f22038k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f22136n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }
}
