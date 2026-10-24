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
public final class k60 extends q60 {
    public int A0;
    public boolean B0;
    public boolean C0;
    public float D0;
    public final org.telegram.ui.fl E;
    public int E0;
    public final LinearLayout F;
    public long F0;
    public final ei.q2 G;
    public boolean G0;
    public final ei.q2 H;
    public boolean H0;
    public final ImageView I;
    public final xp I0;
    public final ei.s2 J;
    public final l2.f J0;
    public final int[] K;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public si.u0 P;
    public si.s0 Q;
    public si.t0 R;
    public si.l0 S;
    public c11 T;
    public VideoEditedInfo U;
    public j60 V;
    public AnimatorSet W;
    public ValueAnimator f27875a0;
    public ValueAnimator f27876b0;
    public final xj0 f27877c0;
    public xj0 f27878d0;
    public xj0 f27879e0;
    public final w50 f27880f;
    public boolean f27881f0;
    public boolean f27882g0;
    public final int h;
    public boolean f27883h0;
    public boolean f27884i0;
    public boolean f27885j0;
    public boolean f27886k0;
    public boolean f27887l0;
    public boolean m0;
    public final int f27888n;
    public boolean f27889n0;
    public boolean f27890o0;
    public boolean f27891p0;
    public boolean f27892q0;
    public final boolean f27893r;
    public long f27894r0;
    public final View f27895s;
    public int f27896s0;
    public Bitmap f27897t0;
    public long f27898u0;
    public final i60 v;
    public float f27899v0;
    public final xm0 f27900w;
    public float f27901w0;
    public final FrameLayout f27902x;
    public float f27903x0;
    public final h60 f27904y;
    public float f27905y0;
    public int f27906z0;

    public k60(Activity activity, w50 w50Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.f27906z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        this.I0 = new xp(this, 26);
        this.J0 = new l2.f(this, 10);
        this.f27880f = w50Var;
        this.f27888n = w50Var.getClassGuid();
        this.f27893r = w50Var.x();
        this.f27895s = w50Var.getFragmentView();
        setWillNotDraw(false);
        ei.s2 s2Var = new ei.s2(activity, null, this, null);
        this.J = s2Var;
        s2Var.f9793o = 0.5f;
        s2Var.f9792n = ei.s2.f(0.5f);
        s2Var.g();
        addView(s2Var.f9783b, w7.z5.e(-1, -1, 119));
        i60 i60Var = new i60(this, activity);
        this.v = i60Var;
        xm0 xm0Var = new xm0(activity);
        this.f27900w = xm0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f27902x = frameLayout;
        h60 h60Var = new h60(this, activity, 0);
        h60Var.setOpaque(true);
        h60Var.setClickable(true);
        h60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        h60Var.setOutlineProvider(new ci.n1(13));
        h60Var.setClipToOutline(true);
        this.f27904y = h60Var;
        frameLayout.addView(h60Var, w7.z5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.fl flVar = new org.telegram.ui.fl(this, activity, paint);
        this.E = flVar;
        flVar.setOutlineProvider(new ci.n1(12));
        flVar.setClipToOutline(true);
        frameLayout.addView(flVar, w7.z5.e(-1, -1, 119));
        xm0Var.addView(frameLayout, w7.z5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        i60Var.addView(xm0Var, w7.z5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(i60Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(s2Var.f9784c, w7.z5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, w7.z5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(activity);
        this.G = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, w7.z5.n(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final k60 f26211b;

            {
                this.f26211b = this;
            }

            @Override
            public final void onClick(View view) {
                si.t0 t0Var;
                si.l0 l0Var;
                boolean z10;
                si.t0 t0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        k60 k60Var = this.f26211b;
                        si.u0 u0Var = k60Var.P;
                        if (u0Var != null && (t0Var = k60Var.R) != null && (l0Var = k60Var.S) != null && t0Var.f47241a == 3 && !t0Var.e && !k60Var.f27889n0) {
                            si.m0 m0Var = l0Var.f47142a;
                            si.m0 m0Var2 = si.m0.f47167a;
                            if (m0Var == m0Var2) {
                                m0Var2 = si.m0.f47168b;
                            }
                            u0Var.getClass();
                            si.u0.t();
                            int i12 = u0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (u0Var.f47260p != m0Var2) {
                                    u0Var.f47257m.b("camera facing requested: " + u0Var.f47260p + " -> " + m0Var2 + ", state=" + si.o0.w(u0Var.W));
                                    u0Var.f47260p = m0Var2;
                                    int i13 = u0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        u0Var.e();
                                        si.j jVar = u0Var.f47256l;
                                        jVar.F = m0Var2;
                                        Handler handler = jVar.f47095n;
                                        if (jVar.V && handler != null) {
                                            handler.post(new p2.b(23, jVar, m0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        u0Var.f47266w = z10;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                k60Var.f27877c0.M(0);
                                k60Var.f27877c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        k60 k60Var2 = this.f26211b;
                        si.u0 u0Var2 = k60Var2.P;
                        if (u0Var2 != null && (t0Var2 = k60Var2.R) != null && k60Var2.S != null) {
                            boolean z11 = !t0Var2.f47244f;
                            si.j jVar2 = u0Var2.f47256l;
                            si.u0.t();
                            if (u0Var2.W == 3 && !u0Var2.f47266w && (i11 = u0Var2.X) != 1) {
                                u0Var2.f47265u = z11;
                                if (i11 == 3) {
                                    u0Var2.u(z11);
                                    jVar2.T(false);
                                } else {
                                    u0Var2.u(false);
                                    jVar2.T(z11);
                                }
                                u0Var2.o();
                                k60Var2.z();
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
            public final k60 f26211b;

            {
                this.f26211b = this;
            }

            @Override
            public final void onClick(View view) {
                si.t0 t0Var;
                si.l0 l0Var;
                boolean z10;
                si.t0 t0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        k60 k60Var = this.f26211b;
                        si.u0 u0Var = k60Var.P;
                        if (u0Var != null && (t0Var = k60Var.R) != null && (l0Var = k60Var.S) != null && t0Var.f47241a == 3 && !t0Var.e && !k60Var.f27889n0) {
                            si.m0 m0Var = l0Var.f47142a;
                            si.m0 m0Var2 = si.m0.f47167a;
                            if (m0Var == m0Var2) {
                                m0Var2 = si.m0.f47168b;
                            }
                            u0Var.getClass();
                            si.u0.t();
                            int i12 = u0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (u0Var.f47260p != m0Var2) {
                                    u0Var.f47257m.b("camera facing requested: " + u0Var.f47260p + " -> " + m0Var2 + ", state=" + si.o0.w(u0Var.W));
                                    u0Var.f47260p = m0Var2;
                                    int i13 = u0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        u0Var.e();
                                        si.j jVar = u0Var.f47256l;
                                        jVar.F = m0Var2;
                                        Handler handler = jVar.f47095n;
                                        if (jVar.V && handler != null) {
                                            handler.post(new p2.b(23, jVar, m0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        u0Var.f47266w = z10;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                k60Var.f27877c0.M(0);
                                k60Var.f27877c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        k60 k60Var2 = this.f26211b;
                        si.u0 u0Var2 = k60Var2.P;
                        if (u0Var2 != null && (t0Var2 = k60Var2.R) != null && k60Var2.S != null) {
                            boolean z11 = !t0Var2.f47244f;
                            si.j jVar2 = u0Var2.f47256l;
                            si.u0.t();
                            if (u0Var2.W == 3 && !u0Var2.f47266w && (i11 = u0Var2.X) != 1) {
                                u0Var2.f47265u = z11;
                                if (i11 == 3) {
                                    u0Var2.u(z11);
                                    jVar2.T(false);
                                } else {
                                    u0Var2.u(false);
                                    jVar2.T(z11);
                                }
                                u0Var2.o();
                                k60Var2.z();
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
        xj0 xj0Var = new xj0(R.raw.roundcamera_flip, dp, dp);
        this.f27877c0 = xj0Var;
        xj0Var.setCallback(imageView);
        xj0Var.M(xj0Var.e[0] - 1);
        imageView.setImageDrawable(xj0Var);
        z();
        if (g6Var != null && !g6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.I = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.z5.e(48, 48, 17));
        h60Var.setOnTouchListener(new pk(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f27894r0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f27894r0);
    }

    private long getCurrentDurationMs() {
        si.t0 t0Var;
        si.u0 u0Var = this.P;
        if (u0Var != null && (t0Var = this.R) != null) {
            if (t0Var.f47241a == 3) {
                return u0Var.j();
            }
            return t0Var.f47242b;
        }
        return 0L;
    }

    public static void l(k60 k60Var) {
        if (k60Var.f27889n0 && k60Var.f27892q0 && k60Var.f27890o0 && k60Var.f27891p0) {
            k60Var.f27889n0 = false;
            FileLog.d("RoundVideo camera flip completed: elapsedMs=" + k60Var.getCameraFlipElapsedMs());
            k60Var.y();
        }
    }

    public static void m(k60 k60Var) {
        org.telegram.ui.fl flVar = k60Var.E;
        if (!k60Var.f27887l0) {
            return;
        }
        k60Var.f27887l0 = false;
        flVar.invalidate();
        flVar.animate().cancel();
        flVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.gk gkVar;
        if (z10 != this.G0) {
            this.G0 = z10;
            this.F0 = 0L;
            xp xpVar = this.I0;
            if (z10) {
                zf.h.d().a(30, xpVar);
            } else {
                zf.h.d().f(xpVar);
            }
            if (this.d != z10) {
                this.d = z10;
                o60 o60Var = this.f29812c;
                if (o60Var != null && (gkVar = ((org.telegram.ui.jj) o60Var).f38579a.Y) != null) {
                    gkVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f27880f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ei.s2 s2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.D0)) {
                this.D0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            s2Var.c(null);
        } else {
            if (!Float.isNaN(this.D0)) {
                attributes.screenBrightness = this.D0;
                this.D0 = Float.NaN;
            }
            s2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A() {
        org.telegram.ui.gk gkVar;
        float f7;
        si.t0 t0Var = this.R;
        if (t0Var != null) {
            long j10 = t0Var.d;
            if (t0Var.f47241a == 3) {
                long min = Math.min(j10, (SystemClock.elapsedRealtime() + t0Var.f47242b) - t0Var.f47243c);
                this.f27898u0 = min;
                this.f27900w.setProgress(((float) min) / ((float) j10));
                o60 o60Var = this.f29812c;
                if (o60Var != null && (gkVar = ((org.telegram.ui.jj) o60Var).f38579a.Y) != null && gkVar.f24110j1) {
                    gkVar.f24104i1 = min;
                    vg vgVar = gkVar.Y0;
                    if (vgVar != null && vgVar.f31446r) {
                        vgVar.h = min;
                        vgVar.invalidate();
                    }
                    sg sgVar = gkVar.l1;
                    if (sgVar != null && sgVar.f30499n) {
                        if (!sgVar.h) {
                            long j11 = sgVar.f30500r;
                            if (j11 >= 0) {
                                if (!sgVar.e) {
                                    long max = Math.max(0L, min - j11) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    sgVar.f30495a = f7;
                                }
                                sgVar.invalidate();
                            }
                        }
                        sgVar.f30500r = min;
                        sgVar.f30495a = 1.0f;
                        sgVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = gkVar.f24116k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f24217n != 1.0f) {
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
        c11 c11Var = this.T;
        if (c11Var != null) {
            c11Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        w(false, false);
    }

    @Override
    public final void b(float f7, int i10) {
        si.t0 t0Var;
        i2.h0 h0Var;
        if (this.P != null && (t0Var = this.R) != null && t0Var.f47241a == 5) {
            o();
            if (i10 == 0) {
                this.P.q();
            } else if (i10 == 1) {
                si.u0 u0Var = this.P;
                u0Var.getClass();
                si.u0.t();
                if (u0Var.W == 5 && (h0Var = u0Var.S) != null) {
                    h0Var.e();
                    u0Var.x(false);
                    l2.f fVar = u0Var.d;
                    u0Var.S.M0();
                    fVar.getClass();
                }
            } else if (i10 == 2) {
                si.u0 u0Var2 = this.P;
                long j10 = f7 * ((float) this.R.f47242b);
                u0Var2.getClass();
                si.u0.t();
                if (u0Var2.W == 5 && u0Var2.S != null) {
                    long j11 = u0Var2.G;
                    u0Var2.S.Z0(5, Math.max(j11, Math.min(Math.max(j11, u0Var2.H - 1), j10)));
                    u0Var2.d.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        q();
        ValueAnimator valueAnimator = this.f27875a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        si.u0 u0Var = this.P;
        if (u0Var != null) {
            si.u0.t();
            int i10 = u0Var.W;
            if (i10 == 10) {
                if (!u0Var.C) {
                    u0Var.i();
                }
            } else if (i10 != 8) {
                u0Var.a();
            } else {
                u0Var.e();
                u0Var.r();
                u0Var.f47256l.M();
                u0Var.C = true;
                u0Var.v(10);
                u0Var.m("released");
                u0Var.f47253i.removeCallbacksAndMessages(null);
                u0Var.f47254j.shutdown();
                u0Var.f47255k.shutdown();
            }
            this.P = null;
        }
        c11 c11Var = this.T;
        if (c11Var != null) {
            c11Var.d(true ^ this.f27885j0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        x();
        i60 i60Var = this.v;
        i60Var.setTranslationX(0.0f);
        this.f27901w0 = 0.0f;
        i60Var.setTranslationY(0.0f + this.f27899v0);
        i60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean d() {
        si.t0 t0Var = this.R;
        if (t0Var != null) {
            int i10 = t0Var.f47241a;
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
        this.f27899v0 = f10;
        this.v.setTranslationY(this.f27901w0 + f10);
    }

    @Override
    public final void f(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        si.t0 t0Var;
        si.u0 u0Var = this.P;
        if (u0Var != null && (t0Var = this.R) != null) {
            int i13 = 2;
            if (i10 == 3) {
                if (u0Var != null && t0Var != null && t0Var.f47241a == 3) {
                    u(2);
                    this.P.p();
                }
            } else if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                boolean z11 = false;
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f27888n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.R.f47241a == 3) {
                    u(5);
                } else {
                    o();
                }
                this.V = new j60(j10, i11, i12, z10, j11);
                si.u0 u0Var2 = this.P;
                boolean z12 = this.f27884i0;
                boolean z13 = !z12;
                u0Var2.getClass();
                si.u0.t();
                int i14 = u0Var2.W;
                if (i14 == 3 || i14 == 5) {
                    u0Var2.f47257m.b("finish requested: state=" + si.o0.w(u0Var2.W) + ", includeAudio=" + z13 + ", durationMs=" + u0Var2.j() + ", trim=" + u0Var2.G + ".." + u0Var2.H);
                    u0Var2.f47269z = z13;
                    if (u0Var2.W == 3) {
                        u0Var2.E = u0Var2.j();
                        u0Var2.f47268y = true;
                        u0Var2.e();
                        u0Var2.f47253i.removeCallbacks(u0Var2.T);
                        u0Var2.v(7);
                        boolean Y = u0Var2.f47256l.Y();
                        u0Var2.B = Y;
                        if (!Y) {
                            u0Var2.h(new IllegalStateException("Unable to stop the camera segment"));
                            return;
                        }
                        return;
                    }
                    u0Var2.r();
                    u0Var2.v(7);
                    if (u0Var2.l() || z12) {
                        z11 = true;
                    }
                    if (u0Var2.l()) {
                        i13 = 1;
                    }
                    u0Var2.f47254j.execute(new ai.xb(u0Var2, u0Var2.Q, z11, u0Var2.R, z13, i13, u0Var2.P));
                }
            }
        }
    }

    @Override
    public final void g(bh.b bVar, org.telegram.ui.bj bjVar) {
        View view = this.F;
        dh.d c10 = bVar.c(view, bjVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        view.setBackground(c10);
    }

    @Override
    public View getButtonsLayout() {
        return this.F;
    }

    @Override
    public n60 getCameraContainer() {
        return this.v;
    }

    @Override
    public RectF getCameraRect() {
        h60 h60Var = this.f27904y;
        int[] iArr = this.K;
        h60Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], h60Var.getWidth() + i10, h60Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.I;
    }

    @Override
    public Paint getPaint() {
        return this.f27900w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f27904y;
    }

    @Override
    public final void h(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.f27900w.getPaint().setAlpha(255);
        this.f27885j0 = false;
        this.f27884i0 = false;
        this.f27881f0 = false;
        this.f27883h0 = false;
        this.f27898u0 = 0L;
        this.f27900w.setProgress(0.0f);
        org.telegram.ui.fl flVar = this.E;
        if (!this.f27887l0) {
            if (this.f27897t0 == null) {
                try {
                    this.f27897t0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f27897t0;
            if (bitmap != null) {
                flVar.setImageBitmap(bitmap);
            } else {
                flVar.setImageResource(R.drawable.icplaceholder);
            }
            this.f27887l0 = true;
            flVar.animate().cancel();
            flVar.setAlpha(1.0f);
            flVar.invalidate();
        }
        this.T = new c11(this.h, this.f27893r);
        this.Q = (si.s0) ti.e.e.a();
        si.k0 k0Var = new si.k0(getContext(), this.f27904y);
        k0Var.f47133c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        k0Var.d = (si.m0) ti.e.f47663j.a();
        k0Var.e = this.Q;
        k0Var.h = ti.e.h.a();
        k0Var.f47134f = (si.n0) ti.e.f47660f.a();
        k0Var.f47135g = (si.p0) ti.e.f47661g.a();
        ti.a aVar = ti.e.f47662i;
        aVar.a();
        k0Var.f47136i = aVar.d;
        l2.f fVar = this.J0;
        k0Var.f47137j = fVar;
        c11 c11Var = this.T;
        k0Var.f47138k = c11Var;
        k0Var.f47139l = new rv(this, 6);
        if (k0Var.d != null) {
            if (k0Var.e != null) {
                if (k0Var.h > 0) {
                    if (k0Var.f47134f != null) {
                        if (k0Var.f47135g != null) {
                            if (fVar != null) {
                                if (c11Var != null) {
                                    this.P = new si.u0(k0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    si.u0 u0Var = this.P;
                                    u0Var.getClass();
                                    si.u0.t();
                                    if (u0Var.W == 1) {
                                        try {
                                            u0Var.f47257m.b("start requested");
                                            u0Var.c(true);
                                            u0Var.v(2);
                                            u0Var.f47256l.X(u0Var.Q, 0L, u0Var.f47260p);
                                        } catch (Exception e) {
                                            u0Var.h(e);
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
        si.t0 t0Var;
        si.u0 u0Var = this.P;
        if (u0Var != null && (t0Var = this.R) != null) {
            int i10 = t0Var.f47241a;
            if (i10 == 3) {
                if (u0Var != null && t0Var != null && i10 == 3) {
                    u(2);
                    this.P.p();
                }
            } else if (i10 == 5) {
                this.U = null;
                this.f27882g0 = true;
                this.f27883h0 = false;
                si.u0.t();
                if (u0Var.W == 5 && u0Var.H - u0Var.G < u0Var.f47259o) {
                    u0Var.M++;
                    u0Var.f47257m.b("resume requested: trim=" + u0Var.G + ".." + u0Var.H + ", sourceDurationMs=" + u0Var.E);
                    u0Var.r();
                    u0Var.v(6);
                    u0Var.f47254j.execute(new ei.s1(u0Var, u0Var.l(), u0Var.Q, u0Var.P, u0Var.R));
                }
            }
        }
    }

    public final void o() {
        si.t0 t0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P != null && (t0Var = this.R) != null && (videoEditedInfo = this.U) != null) {
            long j10 = t0Var.f47242b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j11 = this.U.endTime;
            if (j11 >= 0) {
                j10 = Math.min(j10, j11);
            }
            si.u0 u0Var = this.P;
            u0Var.getClass();
            si.u0.t();
            if (u0Var.W == 5) {
                long max2 = Math.max(0L, Math.min(u0Var.E, max));
                long max3 = Math.max(max2, Math.min(u0Var.E, j10));
                if (max3 - max2 >= Math.min(800L, u0Var.E)) {
                    u0Var.G = max2;
                    u0Var.H = max3;
                    i2.h0 h0Var = u0Var.S;
                    if (h0Var != null) {
                        h0Var.Z0(5, max2);
                    }
                    u0Var.d.getClass();
                    u0Var.o();
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
            i60 i60Var = this.v;
            i60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            i60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ei.s2 s2Var = this.J;
        s2Var.f9783b.measure(makeMeasureSpec, makeMeasureSpec2);
        s2Var.f9784c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public final Bitmap p(Bitmap bitmap) {
        h60 h60Var = this.f27904y;
        if (h60Var.getWidth() > 0 && h60Var.getHeight() > 0) {
            Matrix matrix = this.L;
            h60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / h60Var.getWidth();
                float height = bitmap.getHeight() / h60Var.getHeight();
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
        if (!this.f27889n0 && this.f27876b0 == null) {
            return;
        }
        this.f27896s0++;
        ValueAnimator valueAnimator = this.f27876b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f27876b0.cancel();
            this.f27876b0 = null;
        }
        FrameLayout frameLayout = this.f27902x;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f27889n0 = false;
        this.f27890o0 = false;
        this.f27891p0 = false;
        this.f27892q0 = false;
        t(false);
    }

    public final VideoEditedInfo r(File file, long j10, b11 b11Var) {
        long j11;
        int i10;
        int i11;
        si.p0 p0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j10;
        if (b11Var == null) {
            j11 = file.length();
        } else {
            j11 = b11Var.f24870a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j11);
        videoEditedInfo.roundVideo = true;
        si.u0 u0Var = this.P;
        if (u0Var != null && (p0Var = u0Var.f47263s) != null) {
            i10 = p0Var.f47183a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        si.s0 s0Var = this.Q;
        if (s0Var == null) {
            i11 = 480;
        } else {
            i11 = s0Var.f47195a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (b11Var != null) {
            videoEditedInfo.file = b11Var.f24871b;
            videoEditedInfo.encryptedFile = b11Var.f24872c;
            videoEditedInfo.key = b11Var.d;
            videoEditedInfo.iv = b11Var.e;
        }
        return videoEditedInfo;
    }

    public final void s() {
        if (this.B0) {
            this.B0 = false;
            this.f27906z0 = -1;
            this.A0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f27875a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27905y0, 0.0f);
            this.f27875a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f27875a0.addUpdateListener(new e60(this, 1));
            this.f27875a0.start();
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
        i60 i60Var = this.v;
        i60Var.setAlpha(0.0f);
        i60Var.setScaleX(0.1f);
        i60Var.setScaleY(0.1f);
        i60Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f27900w.getPaint().setAlpha(0);
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
        org.telegram.ui.fl flVar = this.E;
        flVar.animate().cancel();
        if (z10) {
            flVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            flVar.setAlpha(0.0f);
        }
    }

    public final void u(int i10) {
        if (this.f27883h0 && i10 == 2) {
            return;
        }
        this.f27883h0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f27888n), Integer.valueOf(i10));
    }

    public final void v(boolean z10) {
        Bitmap bitmap;
        h60 h60Var = this.f27904y;
        if (h60Var.isAvailable() && (bitmap = h60Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = p(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f27897t0;
                    this.f27897t0 = bitmap;
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
                    if (bitmap != this.f27897t0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f27897t0) {
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
        m60 m60Var = this.f29810a;
        if (m60Var != null) {
            ((org.telegram.ui.pe) m60Var).f40517b.Jc.a(z10, true);
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
        i60 i60Var = this.v;
        if (z10 && !this.f27886k0) {
            i60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f27901w0 = measuredHeight;
            i60Var.setTranslationY(measuredHeight + this.f27899v0);
        }
        this.f27886k0 = z10;
        View view = this.f27895s;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f27898u0) > 300) {
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
        ofFloat.addUpdateListener(new e60(this, 0));
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
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(i60Var, property, f13);
        float f16 = 0.1f;
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(i60Var, View.SCALE_X, f14);
        if (z10) {
            f16 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(i60Var, View.SCALE_Y, f16);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(i60Var, View.TRANSLATION_X, f7);
        if (this.f27884i0 && z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.I, property, f15), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.W.addListener(new g60(this, 0));
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
        si.l0 l0Var;
        si.t0 t0Var = this.R;
        boolean z11 = false;
        if (t0Var != null && t0Var.f47241a == 3 && !t0Var.e && !this.f27889n0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G.setEnabled(z10);
        if (z10 && (l0Var = this.S) != null && l0Var.f47143b != 1) {
            z11 = true;
        }
        this.H.setEnabled(z11);
        z();
    }

    public final void z() {
        si.t0 t0Var = this.R;
        int i10 = this.O;
        ei.q2 q2Var = this.H;
        if (t0Var != null && t0Var.f47244f) {
            if (this.f27879e0 == null) {
                xj0 xj0Var = new xj0(R.raw.roundcamera_flash_off, i10, i10);
                this.f27879e0 = xj0Var;
                xj0Var.setCallback(q2Var);
            }
            q2Var.setImageDrawable(this.f27879e0);
            return;
        }
        if (this.f27878d0 == null) {
            xj0 xj0Var2 = new xj0(R.raw.roundcamera_flash_on, i10, i10);
            this.f27878d0 = xj0Var2;
            xj0Var2.setCallback(q2Var);
        }
        q2Var.setImageDrawable(this.f27878d0);
    }
}
