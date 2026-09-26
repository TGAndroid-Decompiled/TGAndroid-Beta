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
public final class c60 extends i60 {
    public boolean A0;
    public final zp B0;
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
    public p01 T;
    public VideoEditedInfo U;
    public b60 V;
    public AnimatorSet W;
    public ValueAnimator f23218a0;
    public final jj0 f23219b0;
    public jj0 f23220c0;
    public jj0 f23221d0;
    public boolean f23222e0;
    public final p50 f23223f;
    public boolean f23224f0;
    public boolean f23225g0;
    public final int h;
    public boolean f23226h0;
    public boolean f23227i0;
    public boolean f23228j0;
    public boolean f23229k0;
    public boolean f23230l0;
    public Bitmap m0;
    public final int f23231n;
    public long f23232n0;
    public float f23233o0;
    public float f23234p0;
    public float f23235q0;
    public final boolean f23236r;
    public float f23237r0;
    public final View f23238s;
    public int f23239s0;
    public int f23240t0;
    public boolean f23241u0;
    public final a60 v;
    public boolean f23242v0;
    public final jm0 f23243w;
    public float f23244w0;
    public final FrameLayout f23245x;
    public int f23246x0;
    public final z50 f23247y;
    public long f23248y0;
    public boolean f23249z0;

    public c60(Activity activity, p50 p50Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.f23239s0 = -1;
        this.f23240t0 = -1;
        this.f23244w0 = Float.NaN;
        this.B0 = new zp(this, 25);
        this.C0 = new l.d(this);
        this.f23223f = p50Var;
        this.f23231n = p50Var.getClassGuid();
        this.f23236r = p50Var.v();
        this.f23238s = p50Var.getFragmentView();
        setWillNotDraw(false);
        ci.x2 x2Var = new ci.x2(activity, null, this, null);
        this.J = x2Var;
        x2Var.f5818o = 0.5f;
        x2Var.f5817n = ci.x2.f(0.5f);
        x2Var.g();
        addView(x2Var.f5808b, w7.y5.e(-1, -1, 119));
        a60 a60Var = new a60(this, activity);
        this.v = a60Var;
        jm0 jm0Var = new jm0(activity);
        this.f23243w = jm0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f23245x = frameLayout;
        z50 z50Var = new z50(this, activity, 0);
        z50Var.setOpaque(true);
        z50Var.setClickable(true);
        z50Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        z50Var.setOutlineProvider(new ai.k2(13));
        z50Var.setClipToOutline(true);
        this.f23247y = z50Var;
        frameLayout.addView(z50Var, w7.y5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, activity, paint);
        this.E = ilVar;
        ilVar.setOutlineProvider(new ai.k2(12));
        ilVar.setClipToOutline(true);
        frameLayout.addView(ilVar, w7.y5.e(-1, -1, 119));
        jm0Var.addView(frameLayout, w7.y5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        a60Var.addView(jm0Var, w7.y5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(a60Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(x2Var.f5809c, w7.y5.e(-1, -1, 119));
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
            public final c60 f30570b;

            {
                this.f30570b = this;
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
                        c60 c60Var = this.f30570b;
                        ki.s0 s0Var = c60Var.P;
                        if (s0Var != null && (r0Var = c60Var.R) != null && (k0Var = c60Var.S) != null && r0Var.f13835a == 3 && !r0Var.e) {
                            ki.l0 l0Var = k0Var.f13759a;
                            ki.l0 l0Var2 = ki.l0.f13784a;
                            if (l0Var == l0Var2) {
                                l0Var2 = ki.l0.f13785b;
                            }
                            s0Var.getClass();
                            ki.s0.s();
                            int i12 = s0Var.V;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (s0Var.f13853o != l0Var2) {
                                    s0Var.f13850l.b("camera facing requested: " + s0Var.f13853o + " -> " + l0Var2 + ", state=" + hg.c.C(s0Var.V));
                                    s0Var.f13853o = l0Var2;
                                    int i13 = s0Var.V;
                                    if (i13 == 3 || i13 == 2) {
                                        s0Var.d();
                                        ki.i iVar = s0Var.f13849k;
                                        iVar.C = l0Var2;
                                        Handler handler = iVar.f13720n;
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
                                c60Var.f23219b0.M(0);
                                c60Var.f23219b0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        c60 c60Var2 = this.f30570b;
                        ki.s0 s0Var2 = c60Var2.P;
                        if (s0Var2 != null && (r0Var2 = c60Var2.R) != null && c60Var2.S != null) {
                            boolean z11 = !r0Var2.f13838f;
                            ki.i iVar2 = s0Var2.f13849k;
                            ki.s0.s();
                            if (s0Var2.V == 3 && !s0Var2.v && (i11 = s0Var2.W) != 1) {
                                s0Var2.f13858t = z11;
                                if (i11 == 3) {
                                    s0Var2.t(z11);
                                    iVar2.y(false);
                                } else {
                                    s0Var2.t(false);
                                    iVar2.y(z11);
                                }
                                s0Var2.n();
                                c60Var2.v();
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
            public final c60 f30570b;

            {
                this.f30570b = this;
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
                        c60 c60Var = this.f30570b;
                        ki.s0 s0Var = c60Var.P;
                        if (s0Var != null && (r0Var = c60Var.R) != null && (k0Var = c60Var.S) != null && r0Var.f13835a == 3 && !r0Var.e) {
                            ki.l0 l0Var = k0Var.f13759a;
                            ki.l0 l0Var2 = ki.l0.f13784a;
                            if (l0Var == l0Var2) {
                                l0Var2 = ki.l0.f13785b;
                            }
                            s0Var.getClass();
                            ki.s0.s();
                            int i12 = s0Var.V;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (s0Var.f13853o != l0Var2) {
                                    s0Var.f13850l.b("camera facing requested: " + s0Var.f13853o + " -> " + l0Var2 + ", state=" + hg.c.C(s0Var.V));
                                    s0Var.f13853o = l0Var2;
                                    int i13 = s0Var.V;
                                    if (i13 == 3 || i13 == 2) {
                                        s0Var.d();
                                        ki.i iVar = s0Var.f13849k;
                                        iVar.C = l0Var2;
                                        Handler handler = iVar.f13720n;
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
                                c60Var.f23219b0.M(0);
                                c60Var.f23219b0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        c60 c60Var2 = this.f30570b;
                        ki.s0 s0Var2 = c60Var2.P;
                        if (s0Var2 != null && (r0Var2 = c60Var2.R) != null && c60Var2.S != null) {
                            boolean z11 = !r0Var2.f13838f;
                            ki.i iVar2 = s0Var2.f13849k;
                            ki.s0.s();
                            if (s0Var2.V == 3 && !s0Var2.v && (i11 = s0Var2.W) != 1) {
                                s0Var2.f13858t = z11;
                                if (i11 == 3) {
                                    s0Var2.t(z11);
                                    iVar2.y(false);
                                } else {
                                    s0Var2.t(false);
                                    iVar2.y(z11);
                                }
                                s0Var2.n();
                                c60Var2.v();
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
        jj0 jj0Var = new jj0(R.raw.roundcamera_flip, dp, dp);
        this.f23219b0 = jj0Var;
        jj0Var.setCallback(imageView);
        jj0Var.M(jj0Var.e[0] - 1);
        imageView.setImageDrawable(jj0Var);
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
        z50Var.setOnTouchListener(new xr(this, 1));
        super.setVisibility(4);
    }

    private long getCurrentDurationMs() {
        ki.r0 r0Var;
        ki.s0 s0Var = this.P;
        if (s0Var != null && (r0Var = this.R) != null) {
            if (r0Var.f13835a == 3) {
                return s0Var.i();
            }
            return r0Var.f13836b;
        }
        return 0L;
    }

    public static void k(c60 c60Var) {
        boolean z10;
        ki.k0 k0Var;
        ki.r0 r0Var = c60Var.R;
        boolean z11 = false;
        if (r0Var != null && r0Var.f13835a == 3 && !r0Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        c60Var.G.setEnabled(z10);
        ci.v2 v2Var = c60Var.H;
        if (z10 && (k0Var = c60Var.S) != null && k0Var.f13760b != 1) {
            z11 = true;
        }
        v2Var.setEnabled(z11);
        c60Var.v();
    }

    public static void l(c60 c60Var) {
        org.telegram.ui.il ilVar = c60Var.E;
        if (!c60Var.f23229k0) {
            return;
        }
        c60Var.f23229k0 = false;
        ilVar.invalidate();
        ilVar.animate().cancel();
        ilVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.jk jkVar;
        if (z10 != this.f23249z0) {
            this.f23249z0 = z10;
            this.f23248y0 = 0L;
            zp zpVar = this.B0;
            if (z10) {
                yf.h.d().a(30, zpVar);
            } else {
                yf.h.d().f(zpVar);
            }
            if (this.d != z10) {
                this.d = z10;
                g60 g60Var = this.f24985c;
                if (g60Var != null && (jkVar = ((org.telegram.ui.nj) g60Var).f35903a.Y) != null) {
                    jkVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f23223f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ci.x2 x2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.f23244w0)) {
                this.f23244w0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            x2Var.c(null);
        } else {
            if (!Float.isNaN(this.f23244w0)) {
                attributes.screenBrightness = this.f23244w0;
                this.f23244w0 = Float.NaN;
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
        p01 p01Var = this.T;
        if (p01Var != null) {
            p01Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        t(false, false);
    }

    @Override
    public final void b(float f7, int i10) {
        ki.r0 r0Var;
        i2.f0 f0Var;
        if (this.P != null && (r0Var = this.R) != null && r0Var.f13835a == 5) {
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
                    l.d dVar = s0Var.f13844c;
                    s0Var.R.J0();
                    dVar.getClass();
                }
            } else if (i10 == 2) {
                ki.s0 s0Var2 = this.P;
                long j3 = f7 * ((float) this.R.f13836b);
                s0Var2.getClass();
                ki.s0.s();
                if (s0Var2.V == 5 && s0Var2.R != null) {
                    long j10 = s0Var2.F;
                    s0Var2.R.W0(5, Math.max(j10, Math.min(Math.max(j10, s0Var2.G - 1), j3)));
                    s0Var2.f13844c.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        ValueAnimator valueAnimator = this.f23218a0;
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
                s0Var.f13849k.s();
                s0Var.B = true;
                s0Var.u(10);
                s0Var.l("released");
                s0Var.h.removeCallbacksAndMessages(null);
                s0Var.f13847i.shutdown();
                s0Var.f13848j.shutdown();
            }
            this.P = null;
        }
        p01 p01Var = this.T;
        if (p01Var != null) {
            p01Var.d(true ^ this.f23227i0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        u();
        a60 a60Var = this.v;
        a60Var.setTranslationX(0.0f);
        this.f23234p0 = 0.0f;
        a60Var.setTranslationY(0.0f + this.f23233o0);
        a60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean d() {
        ki.r0 r0Var = this.R;
        if (r0Var != null) {
            int i10 = r0Var.f13835a;
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
        this.f23233o0 = f10;
        this.v.setTranslationY(this.f23234p0 + f10);
    }

    @Override
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        ki.r0 r0Var;
        boolean z11;
        int i13;
        ki.s0 s0Var = this.P;
        if (s0Var != null && (r0Var = this.R) != null) {
            if (i10 == 3) {
                if (s0Var != null && r0Var != null && r0Var.f13835a == 3) {
                    r(2);
                    this.P.o();
                }
            } else if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f23231n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.R.f13835a == 3) {
                    r(5);
                } else {
                    n();
                }
                this.V = new b60(j3, i11, i12, z10, j10);
                ki.s0 s0Var2 = this.P;
                boolean z12 = this.f23226h0;
                boolean z13 = !z12;
                s0Var2.getClass();
                ki.s0.s();
                int i14 = s0Var2.V;
                if (i14 == 3 || i14 == 5) {
                    s0Var2.f13850l.b("finish requested: state=" + hg.c.C(s0Var2.V) + ", includeAudio=" + z13 + ", durationMs=" + s0Var2.i() + ", trim=" + s0Var2.F + ".." + s0Var2.G);
                    s0Var2.f13862y = z13;
                    if (s0Var2.V == 3) {
                        s0Var2.D = s0Var2.i();
                        s0Var2.f13861x = true;
                        s0Var2.d();
                        s0Var2.h.removeCallbacks(s0Var2.S);
                        s0Var2.u(7);
                        boolean D = s0Var2.f13849k.D();
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
                    s0Var2.f13847i.execute(new ki.g0(s0Var2, s0Var2.P, z11, s0Var2.Q, z13, i13, s0Var2.O));
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
    public f60 getCameraContainer() {
        return this.v;
    }

    @Override
    public RectF getCameraRect() {
        z50 z50Var = this.f23247y;
        int[] iArr = this.K;
        z50Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], z50Var.getWidth() + i10, z50Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.I;
    }

    @Override
    public Paint getPaint() {
        return this.f23243w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f23247y;
    }

    @Override
    public final void h(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.f23243w.getPaint().setAlpha(255);
        this.f23227i0 = false;
        this.f23226h0 = false;
        this.f23222e0 = false;
        this.f23225g0 = false;
        this.f23232n0 = 0L;
        this.f23243w.setProgress(0.0f);
        org.telegram.ui.il ilVar = this.E;
        if (!this.f23229k0) {
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
            this.f23229k0 = true;
            ilVar.animate().cancel();
            ilVar.setAlpha(1.0f);
            ilVar.invalidate();
        }
        this.T = new p01(this.h, this.f23236r);
        this.Q = (ki.q0) pi.e.f41359c.a();
        ki.j0 j0Var = new ki.j0(getContext(), this.f23247y);
        j0Var.f13751c = (ki.l0) pi.e.h.a();
        j0Var.d = this.Q;
        j0Var.f13753g = pi.e.f41360f.a();
        j0Var.e = (ki.m0) pi.e.d.a();
        j0Var.f13752f = (ki.n0) pi.e.e.a();
        j0Var.h = pi.e.f41361g.a();
        l.d dVar = this.C0;
        j0Var.f13754i = dVar;
        p01 p01Var = this.T;
        j0Var.f13755j = p01Var;
        j0Var.f13756k = new nv(this, 6);
        if (j0Var.f13751c != null) {
            if (j0Var.d != null) {
                if (j0Var.f13753g > 0) {
                    if (j0Var.e != null) {
                        if (j0Var.f13752f != null) {
                            if (dVar != null) {
                                if (p01Var != null) {
                                    this.P = new ki.s0(j0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    ki.s0 s0Var = this.P;
                                    s0Var.getClass();
                                    ki.s0.s();
                                    if (s0Var.V == 1) {
                                        try {
                                            s0Var.f13850l.b("start requested");
                                            s0Var.c(true);
                                            s0Var.u(2);
                                            s0Var.f13849k.C(s0Var.P, 0L, s0Var.f13853o);
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
            int i10 = r0Var.f13835a;
            if (i10 == 3) {
                if (s0Var != null && r0Var != null && i10 == 3) {
                    r(2);
                    this.P.o();
                }
            } else if (i10 == 5) {
                this.U = null;
                this.f23224f0 = true;
                this.f23225g0 = false;
                ki.s0.s();
                if (s0Var.V == 5 && s0Var.G - s0Var.F < s0Var.f13852n) {
                    s0Var.L++;
                    s0Var.f13850l.b("resume requested: trim=" + s0Var.F + ".." + s0Var.G + ", sourceDurationMs=" + s0Var.D);
                    s0Var.q();
                    s0Var.u(6);
                    s0Var.f13847i.execute(new ci.u1(s0Var, s0Var.k(), s0Var.P, s0Var.O, s0Var.Q));
                }
            }
        }
    }

    public final void n() {
        ki.r0 r0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P != null && (r0Var = this.R) != null && (videoEditedInfo = this.U) != null) {
            long j3 = r0Var.f13836b;
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
                    s0Var.f13844c.getClass();
                    s0Var.n();
                }
            }
        }
    }

    public final Bitmap o(Bitmap bitmap) {
        z50 z50Var = this.f23247y;
        if (z50Var.getWidth() > 0 && z50Var.getHeight() > 0) {
            Matrix matrix = this.L;
            z50Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / z50Var.getWidth();
                float height = bitmap.getHeight() / z50Var.getHeight();
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
        if (this.f23246x0 != i12) {
            this.f23246x0 = i12;
            a60 a60Var = this.v;
            a60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            a60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ci.x2 x2Var = this.J;
        x2Var.f5808b.measure(makeMeasureSpec, makeMeasureSpec2);
        x2Var.f5809c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public final VideoEditedInfo p(File file, long j3, o01 o01Var) {
        long j10;
        int i10;
        int i11;
        ki.n0 n0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        if (o01Var == null) {
            j10 = file.length();
        } else {
            j10 = o01Var.f26897a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j10);
        videoEditedInfo.roundVideo = true;
        ki.s0 s0Var = this.P;
        if (s0Var != null && (n0Var = s0Var.f13856r) != null) {
            i10 = n0Var.f13797a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        ki.q0 q0Var = this.Q;
        if (q0Var == null) {
            i11 = 480;
        } else {
            i11 = q0Var.f13831a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (o01Var != null) {
            videoEditedInfo.file = o01Var.f26898b;
            videoEditedInfo.encryptedFile = o01Var.f26899c;
            videoEditedInfo.key = o01Var.d;
            videoEditedInfo.iv = o01Var.e;
        }
        return videoEditedInfo;
    }

    public final void q() {
        if (this.f23241u0) {
            this.f23241u0 = false;
            this.f23239s0 = -1;
            this.f23240t0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f23218a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f23237r0, 0.0f);
            this.f23218a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f23218a0.addUpdateListener(new x50(this, 1));
            this.f23218a0.start();
        }
    }

    public final void r(int i10) {
        if (this.f23225g0 && i10 == 2) {
            return;
        }
        this.f23225g0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f23231n), Integer.valueOf(i10));
    }

    public final void s(boolean z10) {
        Bitmap bitmap;
        z50 z50Var = this.f23247y;
        if (z50Var.isAvailable() && (bitmap = z50Var.getBitmap(180, 180)) != null) {
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
        a60 a60Var = this.v;
        a60Var.setAlpha(0.0f);
        a60Var.setScaleX(0.1f);
        a60Var.setScaleY(0.1f);
        a60Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f23243w.getPaint().setAlpha(0);
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
        e60 e60Var = this.f24983a;
        if (e60Var != null) {
            ((org.telegram.ui.pe) e60Var).f36506b.f39667uc.a(z10, true);
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
        a60 a60Var = this.v;
        if (z10 && !this.f23228j0) {
            a60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f23234p0 = measuredHeight;
            a60Var.setTranslationY(measuredHeight + this.f23233o0);
        }
        this.f23228j0 = z10;
        View view = this.f23238s;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f23232n0) > 300) {
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
        ofFloat.addUpdateListener(new x50(this, 0));
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
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a60Var, property, f13);
        float f16 = 0.1f;
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(a60Var, View.SCALE_X, f14);
        if (z10) {
            f16 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(a60Var, View.SCALE_Y, f16);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(a60Var, View.TRANSLATION_X, f7);
        if (this.f23226h0 && z10) {
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
        if (!this.f23242v0) {
            return;
        }
        this.f23242v0 = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public final void v() {
        ki.r0 r0Var = this.R;
        int i10 = this.O;
        ci.v2 v2Var = this.H;
        if (r0Var != null && r0Var.f13838f) {
            if (this.f23221d0 == null) {
                jj0 jj0Var = new jj0(R.raw.roundcamera_flash_off, i10, i10);
                this.f23221d0 = jj0Var;
                jj0Var.setCallback(v2Var);
            }
            v2Var.setImageDrawable(this.f23221d0);
            return;
        }
        if (this.f23220c0 == null) {
            jj0 jj0Var2 = new jj0(R.raw.roundcamera_flash_on, i10, i10);
            this.f23220c0 = jj0Var2;
            jj0Var2.setCallback(v2Var);
        }
        v2Var.setImageDrawable(this.f23220c0);
    }

    public final void w() {
        org.telegram.ui.jk jkVar;
        float f7;
        ki.r0 r0Var = this.R;
        if (r0Var != null) {
            long j3 = r0Var.d;
            if (r0Var.f13835a == 3) {
                long min = Math.min(j3, (SystemClock.elapsedRealtime() + r0Var.f13836b) - r0Var.f13837c);
                this.f23232n0 = min;
                this.f23243w.setProgress(((float) min) / ((float) j3));
                g60 g60Var = this.f24985c;
                if (g60Var != null && (jkVar = ((org.telegram.ui.nj) g60Var).f35903a.Y) != null && jkVar.f22011j1) {
                    jkVar.f22005i1 = min;
                    xg xgVar = jkVar.Y0;
                    if (xgVar != null && xgVar.f30346r) {
                        xgVar.h = min;
                        xgVar.invalidate();
                    }
                    ug ugVar = jkVar.l1;
                    if (ugVar != null && ugVar.f28809n) {
                        if (!ugVar.h) {
                            long j10 = ugVar.f28810r;
                            if (j10 >= 0) {
                                if (!ugVar.e) {
                                    long max = Math.max(0L, min - j10) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    ugVar.f28805a = f7;
                                }
                                ugVar.invalidate();
                            }
                        }
                        ugVar.f28810r = min;
                        ugVar.f28805a = 1.0f;
                        ugVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = jkVar.f22016k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f22114n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }
}
