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
public final class o60 extends u60 {
    public int A0;
    public boolean B0;
    public boolean C0;
    public float D0;
    public final org.telegram.ui.rl E;
    public int E0;
    public final LinearLayout F;
    public long F0;
    public final di.u2 G;
    public boolean G0;
    public final di.u2 H;
    public boolean H0;
    public final ImageView I;
    public final kq I0;
    public final di.w2 J;
    public final m.h J0;
    public final int[] K;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public ri.r0 P;
    public ri.p0 Q;
    public ri.q0 R;
    public ri.j0 S;
    public d11 T;
    public VideoEditedInfo U;
    public n60 V;
    public AnimatorSet W;
    public ValueAnimator f27556a0;
    public ValueAnimator f27557b0;
    public final yj0 f27558c0;
    public yj0 f27559d0;
    public yj0 f27560e0;
    public final c60 f27561f;
    public boolean f27562f0;
    public boolean f27563g0;
    public final int h;
    public boolean f27564h0;
    public boolean f27565i0;
    public boolean f27566j0;
    public boolean f27567k0;
    public boolean f27568l0;
    public boolean m0;
    public final int f27569n;
    public boolean f27570n0;
    public boolean f27571o0;
    public boolean f27572p0;
    public boolean f27573q0;
    public final boolean f27574r;
    public long f27575r0;
    public final View f27576s;
    public int f27577s0;
    public Bitmap f27578t0;
    public long f27579u0;
    public final m60 v;
    public float f27580v0;
    public final ym0 f27581w;
    public float f27582w0;
    public final FrameLayout f27583x;
    public float f27584x0;
    public final l60 f27585y;
    public float f27586y0;
    public int f27587z0;

    public o60(Activity activity, c60 c60Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.f27587z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        this.I0 = new kq(this, 25);
        this.J0 = new m.h(this, 8);
        this.f27561f = c60Var;
        this.f27569n = c60Var.getClassGuid();
        this.f27574r = c60Var.x();
        this.f27576s = c60Var.getFragmentView();
        setWillNotDraw(false);
        di.w2 w2Var = new di.w2(activity, null, this, null);
        this.J = w2Var;
        w2Var.f8041o = 0.5f;
        w2Var.f8040n = di.w2.f(0.5f);
        w2Var.g();
        addView(w2Var.f8031b, w7.z5.e(-1, -1, 119));
        m60 m60Var = new m60(this, activity);
        this.v = m60Var;
        ym0 ym0Var = new ym0(activity);
        this.f27581w = ym0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f27583x = frameLayout;
        l60 l60Var = new l60(this, activity, 0);
        l60Var.setOpaque(true);
        l60Var.setClickable(true);
        l60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        l60Var.setOutlineProvider(new bi.a2(13));
        l60Var.setClipToOutline(true);
        this.f27585y = l60Var;
        frameLayout.addView(l60Var, w7.z5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.rl rlVar = new org.telegram.ui.rl(this, activity, paint);
        this.E = rlVar;
        rlVar.setOutlineProvider(new bi.a2(12));
        rlVar.setClipToOutline(true);
        frameLayout.addView(rlVar, w7.z5.e(-1, -1, 119));
        ym0Var.addView(frameLayout, w7.z5.a(-1.0f, 14.0f, 14.0f, 14.0f, 14.0f, -1, 119));
        m60Var.addView(ym0Var, w7.z5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(m60Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(w2Var.f8032c, w7.z5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, w7.z5.a(56.0f, 1.0f, 0.0f, 0.0f, 0.0f, -2, 83));
        ?? imageView = new ImageView(activity);
        this.G = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, w7.z5.n(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final o60 f26220b;

            {
                this.f26220b = this;
            }

            @Override
            public final void onClick(View view) {
                ri.q0 q0Var;
                ri.j0 j0Var;
                boolean z10;
                ri.q0 q0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        o60 o60Var = this.f26220b;
                        ri.r0 r0Var = o60Var.P;
                        if (r0Var != null && (q0Var = o60Var.R) != null && (j0Var = o60Var.S) != null && q0Var.f44671a == 3 && !q0Var.e && !o60Var.f27570n0) {
                            ri.k0 k0Var = j0Var.f44616a;
                            ri.k0 k0Var2 = ri.k0.f44621a;
                            if (k0Var == k0Var2) {
                                k0Var2 = ri.k0.f44622b;
                            }
                            r0Var.getClass();
                            ri.r0.t();
                            int i12 = r0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (r0Var.f44687p != k0Var2) {
                                    r0Var.f44684m.b("camera facing requested: " + r0Var.f44687p + " -> " + k0Var2 + ", state=" + org.telegram.ui.Cells.c1.y(r0Var.W));
                                    r0Var.f44687p = k0Var2;
                                    int i13 = r0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        r0Var.e();
                                        ri.j jVar = r0Var.f44683l;
                                        jVar.F = k0Var2;
                                        Handler handler = jVar.f44584n;
                                        if (jVar.V && handler != null) {
                                            handler.post(new org.telegram.ui.web.v(24, jVar, k0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        r0Var.f44693w = z10;
                                    }
                                    r0Var.n();
                                    r0Var.o();
                                }
                                o60Var.f27558c0.M(0);
                                o60Var.f27558c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        o60 o60Var2 = this.f26220b;
                        ri.r0 r0Var2 = o60Var2.P;
                        if (r0Var2 != null && (q0Var2 = o60Var2.R) != null && o60Var2.S != null) {
                            boolean z11 = !q0Var2.f44674f;
                            ri.j jVar2 = r0Var2.f44683l;
                            ri.r0.t();
                            if (r0Var2.W == 3 && !r0Var2.f44693w && (i11 = r0Var2.X) != 1) {
                                r0Var2.f44692u = z11;
                                if (i11 == 3) {
                                    r0Var2.u(z11);
                                    jVar2.T(false);
                                } else {
                                    r0Var2.u(false);
                                    jVar2.T(z11);
                                }
                                r0Var2.o();
                                o60Var2.z();
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
        linearLayout.addView((View) imageView2, w7.z5.n(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final o60 f26220b;

            {
                this.f26220b = this;
            }

            @Override
            public final void onClick(View view) {
                ri.q0 q0Var;
                ri.j0 j0Var;
                boolean z10;
                ri.q0 q0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        o60 o60Var = this.f26220b;
                        ri.r0 r0Var = o60Var.P;
                        if (r0Var != null && (q0Var = o60Var.R) != null && (j0Var = o60Var.S) != null && q0Var.f44671a == 3 && !q0Var.e && !o60Var.f27570n0) {
                            ri.k0 k0Var = j0Var.f44616a;
                            ri.k0 k0Var2 = ri.k0.f44621a;
                            if (k0Var == k0Var2) {
                                k0Var2 = ri.k0.f44622b;
                            }
                            r0Var.getClass();
                            ri.r0.t();
                            int i12 = r0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (r0Var.f44687p != k0Var2) {
                                    r0Var.f44684m.b("camera facing requested: " + r0Var.f44687p + " -> " + k0Var2 + ", state=" + org.telegram.ui.Cells.c1.y(r0Var.W));
                                    r0Var.f44687p = k0Var2;
                                    int i13 = r0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        r0Var.e();
                                        ri.j jVar = r0Var.f44683l;
                                        jVar.F = k0Var2;
                                        Handler handler = jVar.f44584n;
                                        if (jVar.V && handler != null) {
                                            handler.post(new org.telegram.ui.web.v(24, jVar, k0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        r0Var.f44693w = z10;
                                    }
                                    r0Var.n();
                                    r0Var.o();
                                }
                                o60Var.f27558c0.M(0);
                                o60Var.f27558c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        o60 o60Var2 = this.f26220b;
                        ri.r0 r0Var2 = o60Var2.P;
                        if (r0Var2 != null && (q0Var2 = o60Var2.R) != null && o60Var2.S != null) {
                            boolean z11 = !q0Var2.f44674f;
                            ri.j jVar2 = r0Var2.f44683l;
                            ri.r0.t();
                            if (r0Var2.W == 3 && !r0Var2.f44693w && (i11 = r0Var2.X) != 1) {
                                r0Var2.f44692u = z11;
                                if (i11 == 3) {
                                    r0Var2.u(z11);
                                    jVar2.T(false);
                                } else {
                                    r0Var2.u(false);
                                    jVar2.T(z11);
                                }
                                r0Var2.o();
                                o60Var2.z();
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
        yj0 yj0Var = new yj0(R.raw.roundcamera_flip, dp, dp);
        this.f27558c0 = yj0Var;
        yj0Var.setCallback(imageView);
        yj0Var.M(yj0Var.e[0] - 1);
        imageView.setImageDrawable(yj0Var);
        z();
        if (c6Var != null && !c6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.I = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.z5.e(48, 48, 17));
        l60Var.setOnTouchListener(new tk(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f27575r0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f27575r0);
    }

    private long getCurrentDurationMs() {
        ri.q0 q0Var;
        ri.r0 r0Var = this.P;
        if (r0Var != null && (q0Var = this.R) != null) {
            if (q0Var.f44671a == 3) {
                return r0Var.j();
            }
            return q0Var.f44672b;
        }
        return 0L;
    }

    public static void l(o60 o60Var) {
        if (o60Var.f27570n0 && o60Var.f27573q0 && o60Var.f27571o0 && o60Var.f27572p0) {
            o60Var.f27570n0 = false;
            FileLog.d("RoundVideo camera flip completed: elapsedMs=" + o60Var.getCameraFlipElapsedMs());
            o60Var.y();
        }
    }

    public static void m(o60 o60Var) {
        org.telegram.ui.rl rlVar = o60Var.E;
        if (!o60Var.f27568l0) {
            return;
        }
        o60Var.f27568l0 = false;
        rlVar.invalidate();
        rlVar.animate().cancel();
        rlVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.sk skVar;
        if (z10 != this.G0) {
            this.G0 = z10;
            this.F0 = 0L;
            kq kqVar = this.I0;
            if (z10) {
                zf.i.d().a(30, kqVar);
            } else {
                zf.i.d().f(kqVar);
            }
            if (this.d != z10) {
                this.d = z10;
                s60 s60Var = this.f29260c;
                if (s60Var != null && (skVar = ((org.telegram.ui.wj) s60Var).f41298a.Y) != null) {
                    skVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f27561f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        di.w2 w2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.D0)) {
                this.D0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            w2Var.c(null);
        } else {
            if (!Float.isNaN(this.D0)) {
                attributes.screenBrightness = this.D0;
                this.D0 = Float.NaN;
            }
            w2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A() {
        org.telegram.ui.sk skVar;
        float f7;
        ri.q0 q0Var = this.R;
        if (q0Var != null) {
            long j10 = q0Var.d;
            if (q0Var.f44671a == 3) {
                long min = Math.min(j10, (SystemClock.elapsedRealtime() + q0Var.f44672b) - q0Var.f44673c);
                this.f27579u0 = min;
                this.f27581w.setProgress(((float) min) / ((float) j10));
                s60 s60Var = this.f29260c;
                if (s60Var != null && (skVar = ((org.telegram.ui.wj) s60Var).f41298a.Y) != null && skVar.f22608j1) {
                    skVar.f22602i1 = min;
                    yg ygVar = skVar.Y0;
                    if (ygVar != null && ygVar.f31253r) {
                        ygVar.h = min;
                        ygVar.invalidate();
                    }
                    vg vgVar = skVar.l1;
                    if (vgVar != null && vgVar.f29637n) {
                        if (!vgVar.h) {
                            long j11 = vgVar.f29638r;
                            if (j11 >= 0) {
                                if (!vgVar.e) {
                                    long max = Math.max(0L, min - j11) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    vgVar.f29633a = f7;
                                }
                                vgVar.invalidate();
                            }
                        }
                        vgVar.f29638r = min;
                        vgVar.f29633a = 1.0f;
                        vgVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = skVar.f22614k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f22712n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
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
        u(i10);
        this.P.a();
        d11 d11Var = this.T;
        if (d11Var != null) {
            d11Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        w(false, false);
    }

    @Override
    public final void b(float f7, int i10) {
        ri.q0 q0Var;
        i2.h0 h0Var;
        if (this.P != null && (q0Var = this.R) != null && q0Var.f44671a == 5) {
            o();
            if (i10 == 0) {
                this.P.q();
            } else if (i10 == 1) {
                ri.r0 r0Var = this.P;
                r0Var.getClass();
                ri.r0.t();
                if (r0Var.W == 5 && (h0Var = r0Var.S) != null) {
                    h0Var.e();
                    r0Var.x(false);
                    m.h hVar = r0Var.d;
                    r0Var.S.M0();
                    hVar.getClass();
                }
            } else if (i10 == 2) {
                ri.r0 r0Var2 = this.P;
                long j10 = f7 * ((float) this.R.f44672b);
                r0Var2.getClass();
                ri.r0.t();
                if (r0Var2.W == 5 && r0Var2.S != null) {
                    long j11 = r0Var2.G;
                    r0Var2.S.Z0(5, Math.max(j11, Math.min(Math.max(j11, r0Var2.H - 1), j10)));
                    r0Var2.d.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        q();
        ValueAnimator valueAnimator = this.f27556a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ri.r0 r0Var = this.P;
        if (r0Var != null) {
            ri.r0.t();
            int i10 = r0Var.W;
            if (i10 == 10) {
                if (!r0Var.C) {
                    r0Var.i();
                }
            } else if (i10 != 8) {
                r0Var.a();
            } else {
                r0Var.e();
                r0Var.r();
                r0Var.f44683l.M();
                r0Var.C = true;
                r0Var.v(10);
                r0Var.m("released");
                r0Var.f44680i.removeCallbacksAndMessages(null);
                r0Var.f44681j.shutdown();
                r0Var.f44682k.shutdown();
            }
            this.P = null;
        }
        d11 d11Var = this.T;
        if (d11Var != null) {
            d11Var.d(true ^ this.f27566j0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        x();
        m60 m60Var = this.v;
        m60Var.setTranslationX(0.0f);
        this.f27582w0 = 0.0f;
        m60Var.setTranslationY(0.0f + this.f27580v0);
        m60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean d() {
        ri.q0 q0Var = this.R;
        if (q0Var != null) {
            int i10 = q0Var.f44671a;
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
        this.f27580v0 = f10;
        this.v.setTranslationY(this.f27582w0 + f10);
    }

    @Override
    public final void f(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        ri.q0 q0Var;
        ri.r0 r0Var = this.P;
        if (r0Var != null && (q0Var = this.R) != null) {
            int i13 = 2;
            if (i10 == 3) {
                if (r0Var != null && q0Var != null && q0Var.f44671a == 3) {
                    u(2);
                    this.P.p();
                }
            } else if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                boolean z11 = false;
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f27569n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.R.f44671a == 3) {
                    u(5);
                } else {
                    o();
                }
                this.V = new n60(j10, i11, i12, z10, j11);
                ri.r0 r0Var2 = this.P;
                boolean z12 = this.f27565i0;
                boolean z13 = !z12;
                r0Var2.getClass();
                ri.r0.t();
                int i14 = r0Var2.W;
                if (i14 == 3 || i14 == 5) {
                    r0Var2.f44684m.b("finish requested: state=" + org.telegram.ui.Cells.c1.y(r0Var2.W) + ", includeAudio=" + z13 + ", durationMs=" + r0Var2.j() + ", trim=" + r0Var2.G + ".." + r0Var2.H);
                    r0Var2.f44696z = z13;
                    if (r0Var2.W == 3) {
                        r0Var2.E = r0Var2.j();
                        r0Var2.f44695y = true;
                        r0Var2.e();
                        r0Var2.f44680i.removeCallbacks(r0Var2.T);
                        r0Var2.v(7);
                        boolean Y = r0Var2.f44683l.Y();
                        r0Var2.B = Y;
                        if (!Y) {
                            r0Var2.h(new IllegalStateException("Unable to stop the camera segment"));
                            return;
                        }
                        return;
                    }
                    r0Var2.r();
                    r0Var2.v(7);
                    if (r0Var2.l() || z12) {
                        z11 = true;
                    }
                    if (r0Var2.l()) {
                        i13 = 1;
                    }
                    r0Var2.f44681j.execute(new org.telegram.messenger.bj(r0Var2, r0Var2.Q, z11, r0Var2.R, z13, i13, r0Var2.P));
                }
            }
        }
    }

    @Override
    public final void g(bh.b bVar, org.telegram.ui.oj ojVar) {
        View view = this.F;
        dh.d c10 = bVar.c(view, ojVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        view.setBackground(c10);
    }

    @Override
    public View getButtonsLayout() {
        return this.F;
    }

    @Override
    public r60 getCameraContainer() {
        return this.v;
    }

    @Override
    public RectF getCameraRect() {
        l60 l60Var = this.f27585y;
        int[] iArr = this.K;
        l60Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], l60Var.getWidth() + i10, l60Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.I;
    }

    @Override
    public Paint getPaint() {
        return this.f27581w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f27585y;
    }

    @Override
    public final void h(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.f27581w.getPaint().setAlpha(255);
        this.f27566j0 = false;
        this.f27565i0 = false;
        this.f27562f0 = false;
        this.f27564h0 = false;
        this.f27579u0 = 0L;
        this.f27581w.setProgress(0.0f);
        org.telegram.ui.rl rlVar = this.E;
        if (!this.f27568l0) {
            if (this.f27578t0 == null) {
                try {
                    this.f27578t0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f27578t0;
            if (bitmap != null) {
                rlVar.setImageBitmap(bitmap);
            } else {
                rlVar.setImageResource(R.drawable.icplaceholder);
            }
            this.f27568l0 = true;
            rlVar.animate().cancel();
            rlVar.setAlpha(1.0f);
            rlVar.invalidate();
        }
        this.T = new d11(this.h, this.f27574r);
        this.Q = (ri.p0) si.e.e.a();
        ri.i0 i0Var = new ri.i0(getContext(), this.f27585y);
        i0Var.f44543c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        i0Var.d = (ri.k0) si.e.f45490j.a();
        i0Var.e = this.Q;
        i0Var.h = si.e.h.a();
        i0Var.f44544f = (ri.l0) si.e.f45487f.a();
        i0Var.f44545g = (ri.m0) si.e.f45488g.a();
        si.a aVar = si.e.f45489i;
        aVar.a();
        i0Var.f44546i = aVar.d;
        m.h hVar = this.J0;
        i0Var.f44547j = hVar;
        d11 d11Var = this.T;
        i0Var.f44548k = d11Var;
        i0Var.f44549l = new xv(this, 6);
        if (i0Var.d != null) {
            if (i0Var.e != null) {
                if (i0Var.h > 0) {
                    if (i0Var.f44544f != null) {
                        if (i0Var.f44545g != null) {
                            if (hVar != null) {
                                if (d11Var != null) {
                                    this.P = new ri.r0(i0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    ri.r0 r0Var = this.P;
                                    r0Var.getClass();
                                    ri.r0.t();
                                    if (r0Var.W == 1) {
                                        try {
                                            r0Var.f44684m.b("start requested");
                                            r0Var.c(true);
                                            r0Var.v(2);
                                            r0Var.f44683l.X(r0Var.Q, 0L, r0Var.f44687p);
                                        } catch (Exception e) {
                                            r0Var.h(e);
                                        }
                                    }
                                    w(true, false);
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
        ri.q0 q0Var;
        ri.r0 r0Var = this.P;
        if (r0Var != null && (q0Var = this.R) != null) {
            int i10 = q0Var.f44671a;
            if (i10 == 3) {
                if (r0Var != null && q0Var != null && i10 == 3) {
                    u(2);
                    this.P.p();
                }
            } else if (i10 == 5) {
                this.U = null;
                this.f27563g0 = true;
                this.f27564h0 = false;
                ri.r0.t();
                if (r0Var.W == 5 && r0Var.H - r0Var.G < r0Var.f44686o) {
                    r0Var.M++;
                    r0Var.f44684m.b("resume requested: trim=" + r0Var.G + ".." + r0Var.H + ", sourceDurationMs=" + r0Var.E);
                    r0Var.r();
                    r0Var.v(6);
                    r0Var.f44681j.execute(new di.t1(r0Var, r0Var.l(), r0Var.Q, r0Var.P, r0Var.R));
                }
            }
        }
    }

    public final void o() {
        ri.q0 q0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P != null && (q0Var = this.R) != null && (videoEditedInfo = this.U) != null) {
            long j10 = q0Var.f44672b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j11 = this.U.endTime;
            if (j11 >= 0) {
                j10 = Math.min(j10, j11);
            }
            ri.r0 r0Var = this.P;
            r0Var.getClass();
            ri.r0.t();
            if (r0Var.W == 5) {
                long max2 = Math.max(0L, Math.min(r0Var.E, max));
                long max3 = Math.max(max2, Math.min(r0Var.E, j10));
                if (max3 - max2 >= Math.min(800L, r0Var.E)) {
                    r0Var.G = max2;
                    r0Var.H = max3;
                    i2.h0 h0Var = r0Var.S;
                    if (h0Var != null) {
                        h0Var.Z0(5, max2);
                    }
                    r0Var.d.getClass();
                    r0Var.o();
                }
            }
        }
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
        if (this.E0 != i12) {
            this.E0 = i12;
            m60 m60Var = this.v;
            m60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            m60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        di.w2 w2Var = this.J;
        w2Var.f8031b.measure(makeMeasureSpec, makeMeasureSpec2);
        w2Var.f8032c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public final Bitmap p(Bitmap bitmap) {
        l60 l60Var = this.f27585y;
        if (l60Var.getWidth() > 0 && l60Var.getHeight() > 0) {
            Matrix matrix = this.L;
            l60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / l60Var.getWidth();
                float height = bitmap.getHeight() / l60Var.getHeight();
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

    public final void q() {
        if (!this.f27570n0 && this.f27557b0 == null) {
            return;
        }
        this.f27577s0++;
        ValueAnimator valueAnimator = this.f27557b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f27557b0.cancel();
            this.f27557b0 = null;
        }
        FrameLayout frameLayout = this.f27583x;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f27570n0 = false;
        this.f27571o0 = false;
        this.f27572p0 = false;
        this.f27573q0 = false;
        t(false);
    }

    public final VideoEditedInfo r(File file, long j10, c11 c11Var) {
        long j11;
        int i10;
        int i11;
        ri.m0 m0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j10;
        if (c11Var == null) {
            j11 = file.length();
        } else {
            j11 = c11Var.f23614a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j11);
        videoEditedInfo.roundVideo = true;
        ri.r0 r0Var = this.P;
        if (r0Var != null && (m0Var = r0Var.f44690s) != null) {
            i10 = m0Var.f44653a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        ri.p0 p0Var = this.Q;
        if (p0Var == null) {
            i11 = 480;
        } else {
            i11 = p0Var.f44668a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (c11Var != null) {
            videoEditedInfo.file = c11Var.f23615b;
            videoEditedInfo.encryptedFile = c11Var.f23616c;
            videoEditedInfo.key = c11Var.d;
            videoEditedInfo.iv = c11Var.e;
        }
        return videoEditedInfo;
    }

    public final void s() {
        if (this.B0) {
            this.B0 = false;
            this.f27587z0 = -1;
            this.A0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f27556a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27586y0, 0.0f);
            this.f27556a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f27556a0.addUpdateListener(new j60(this, 1));
            this.f27556a0.start();
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
        m60 m60Var = this.v;
        m60Var.setAlpha(0.0f);
        m60Var.setScaleX(0.1f);
        m60Var.setScaleY(0.1f);
        m60Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f27581w.getPaint().setAlpha(0);
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

    public final void t(boolean z10) {
        if (!this.m0) {
            return;
        }
        this.m0 = false;
        org.telegram.ui.rl rlVar = this.E;
        rlVar.animate().cancel();
        if (z10) {
            rlVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            rlVar.setAlpha(0.0f);
        }
    }

    public final void u(int i10) {
        if (this.f27564h0 && i10 == 2) {
            return;
        }
        this.f27564h0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f27569n), Integer.valueOf(i10));
    }

    public final void v(boolean z10) {
        Bitmap bitmap;
        l60 l60Var = this.f27585y;
        if (l60Var.isAvailable() && (bitmap = l60Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = p(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f27578t0;
                    this.f27578t0 = bitmap;
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
                    if (bitmap != this.f27578t0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f27578t0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void w(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        q60 q60Var = this.f29258a;
        if (q60Var != null) {
            ((org.telegram.ui.xe) q60Var).f41548b.f35846vc.a(z10, true);
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
        m60 m60Var = this.v;
        if (z10 && !this.f27567k0) {
            m60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f27582w0 = measuredHeight;
            m60Var.setTranslationY(measuredHeight + this.f27580v0);
        }
        this.f27567k0 = z10;
        View view = this.f27576s;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f27579u0) > 300) {
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
        ofFloat.addUpdateListener(new j60(this, 0));
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
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m60Var, property, f13);
        float f16 = 0.1f;
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(m60Var, View.SCALE_X, f14);
        if (z10) {
            f16 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(m60Var, View.SCALE_Y, f16);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(m60Var, View.TRANSLATION_X, f7);
        if (this.f27565i0 && z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.I, property, f15), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.W.addListener(new l6(this, 27));
        } else {
            setTranslationX(0.0f);
        }
        this.W.start();
    }

    public final void x() {
        if (!this.C0) {
            return;
        }
        this.C0 = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public final void y() {
        boolean z10;
        ri.j0 j0Var;
        ri.q0 q0Var = this.R;
        boolean z11 = false;
        if (q0Var != null && q0Var.f44671a == 3 && !q0Var.e && !this.f27570n0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G.setEnabled(z10);
        if (z10 && (j0Var = this.S) != null && j0Var.f44617b != 1) {
            z11 = true;
        }
        this.H.setEnabled(z11);
        z();
    }

    public final void z() {
        ri.q0 q0Var = this.R;
        int i10 = this.O;
        di.u2 u2Var = this.H;
        if (q0Var != null && q0Var.f44674f) {
            if (this.f27560e0 == null) {
                yj0 yj0Var = new yj0(R.raw.roundcamera_flash_off, i10, i10);
                this.f27560e0 = yj0Var;
                yj0Var.setCallback(u2Var);
            }
            u2Var.setImageDrawable(this.f27560e0);
            return;
        }
        if (this.f27559d0 == null) {
            yj0 yj0Var2 = new yj0(R.raw.roundcamera_flash_on, i10, i10);
            this.f27559d0 = yj0Var2;
            yj0Var2.setCallback(u2Var);
        }
        u2Var.setImageDrawable(this.f27559d0);
    }
}
