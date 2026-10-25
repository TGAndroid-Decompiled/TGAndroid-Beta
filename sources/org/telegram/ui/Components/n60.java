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
public final class n60 extends t60 {
    public int A0;
    public boolean B0;
    public boolean C0;
    public float D0;
    public final org.telegram.ui.gl E;
    public int E0;
    public final LinearLayout F;
    public long F0;
    public final fi.o2 G;
    public boolean G0;
    public final fi.o2 H;
    public boolean H0;
    public final ImageView I;
    public final bq I0;
    public final fi.q2 J;
    public final li.e3 J0;
    public final int[] K;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public vi.s0 P;
    public vi.q0 Q;
    public vi.r0 R;
    public vi.k0 S;
    public l11 T;
    public VideoEditedInfo U;
    public m60 V;
    public AnimatorSet W;
    public ValueAnimator f30847a0;
    public ValueAnimator f30848b0;
    public final xj0 f30849c0;
    public xj0 f30850d0;
    public xj0 f30851e0;
    public final a60 f30852f;
    public boolean f30853f0;
    public boolean f30854g0;
    public final int h;
    public boolean f30855h0;
    public boolean f30856i0;
    public boolean f30857j0;
    public boolean f30858k0;
    public boolean f30859l0;
    public boolean m0;
    public final int f30860n;
    public boolean f30861n0;
    public boolean f30862o0;
    public boolean f30863p0;
    public boolean f30864q0;
    public final boolean f30865r;
    public long f30866r0;
    public final View f30867s;
    public int f30868s0;
    public Bitmap f30869t0;
    public long f30870u0;
    public final l60 v;
    public float f30871v0;
    public final dn0 f30872w;
    public float f30873w0;
    public final FrameLayout f30874x;
    public float f30875x0;
    public final k60 f30876y;
    public float f30877y0;
    public int f30878z0;

    public n60(Activity activity, a60 a60Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.f30878z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        this.I0 = new bq(this, 27);
        this.J0 = new li.e3(this, 9);
        this.f30852f = a60Var;
        this.f30860n = a60Var.getClassGuid();
        this.f30865r = a60Var.w();
        this.f30867s = a60Var.getFragmentView();
        setWillNotDraw(false);
        fi.q2 q2Var = new fi.q2(activity, null, this, null);
        this.J = q2Var;
        q2Var.f11476o = 0.5f;
        q2Var.f11475n = fi.q2.f(0.5f);
        q2Var.g();
        addView(q2Var.f11466b, gb1.i(-1, -1, 119));
        l60 l60Var = new l60(this, activity);
        this.v = l60Var;
        dn0 dn0Var = new dn0(activity);
        this.f30872w = dn0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f30874x = frameLayout;
        k60 k60Var = new k60(this, activity, 0);
        k60Var.setOpaque(true);
        k60Var.setClickable(true);
        k60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        k60Var.setOutlineProvider(new ag.v0(15));
        k60Var.setClipToOutline(true);
        this.f30876y = k60Var;
        frameLayout.addView(k60Var, gb1.i(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.gl glVar = new org.telegram.ui.gl(this, activity, paint);
        this.E = glVar;
        glVar.setOutlineProvider(new ag.v0(14));
        glVar.setClipToOutline(true);
        frameLayout.addView(glVar, gb1.i(-1, -1, 119));
        dn0Var.addView(frameLayout, gb1.h(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        l60Var.addView(dn0Var, gb1.i(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(l60Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(q2Var.f11467c, gb1.i(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, gb1.h(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(activity);
        this.G = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, gb1.r(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final n60 f29497b;

            {
                this.f29497b = this;
            }

            @Override
            public final void onClick(View view) {
                vi.r0 r0Var;
                vi.k0 k0Var;
                boolean z10;
                vi.r0 r0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        n60 n60Var = this.f29497b;
                        vi.s0 s0Var = n60Var.P;
                        if (s0Var != null && (r0Var = n60Var.R) != null && (k0Var = n60Var.S) != null && r0Var.f50531a == 3 && !r0Var.e && !n60Var.f30861n0) {
                            vi.l0 l0Var = k0Var.f50478a;
                            vi.l0 l0Var2 = vi.l0.f50483a;
                            if (l0Var == l0Var2) {
                                l0Var2 = vi.l0.f50484b;
                            }
                            s0Var.getClass();
                            vi.s0.t();
                            int i12 = s0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (s0Var.f50592p != l0Var2) {
                                    s0Var.f50589m.b("camera facing requested: " + s0Var.f50592p + " -> " + l0Var2 + ", state=" + b10.x(s0Var.W));
                                    s0Var.f50592p = l0Var2;
                                    int i13 = s0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        s0Var.e();
                                        vi.j jVar = s0Var.f50588l;
                                        jVar.F = l0Var2;
                                        Handler handler = jVar.f50435n;
                                        if (jVar.V && handler != null) {
                                            handler.post(new sg.u(26, jVar, l0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        s0Var.f50598w = z10;
                                    }
                                    s0Var.n();
                                    s0Var.o();
                                }
                                n60Var.f30849c0.M(0);
                                n60Var.f30849c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        n60 n60Var2 = this.f29497b;
                        vi.s0 s0Var2 = n60Var2.P;
                        if (s0Var2 != null && (r0Var2 = n60Var2.R) != null && n60Var2.S != null) {
                            boolean z11 = !r0Var2.f50534f;
                            vi.j jVar2 = s0Var2.f50588l;
                            vi.s0.t();
                            if (s0Var2.W == 3 && !s0Var2.f50598w && (i11 = s0Var2.X) != 1) {
                                s0Var2.f50597u = z11;
                                if (i11 == 3) {
                                    s0Var2.u(z11);
                                    jVar2.T(false);
                                } else {
                                    s0Var2.u(false);
                                    jVar2.T(z11);
                                }
                                s0Var2.o();
                                n60Var2.z();
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
        linearLayout.addView((View) imageView2, gb1.r(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final n60 f29497b;

            {
                this.f29497b = this;
            }

            @Override
            public final void onClick(View view) {
                vi.r0 r0Var;
                vi.k0 k0Var;
                boolean z10;
                vi.r0 r0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        n60 n60Var = this.f29497b;
                        vi.s0 s0Var = n60Var.P;
                        if (s0Var != null && (r0Var = n60Var.R) != null && (k0Var = n60Var.S) != null && r0Var.f50531a == 3 && !r0Var.e && !n60Var.f30861n0) {
                            vi.l0 l0Var = k0Var.f50478a;
                            vi.l0 l0Var2 = vi.l0.f50483a;
                            if (l0Var == l0Var2) {
                                l0Var2 = vi.l0.f50484b;
                            }
                            s0Var.getClass();
                            vi.s0.t();
                            int i12 = s0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (s0Var.f50592p != l0Var2) {
                                    s0Var.f50589m.b("camera facing requested: " + s0Var.f50592p + " -> " + l0Var2 + ", state=" + b10.x(s0Var.W));
                                    s0Var.f50592p = l0Var2;
                                    int i13 = s0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        s0Var.e();
                                        vi.j jVar = s0Var.f50588l;
                                        jVar.F = l0Var2;
                                        Handler handler = jVar.f50435n;
                                        if (jVar.V && handler != null) {
                                            handler.post(new sg.u(26, jVar, l0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        s0Var.f50598w = z10;
                                    }
                                    s0Var.n();
                                    s0Var.o();
                                }
                                n60Var.f30849c0.M(0);
                                n60Var.f30849c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        n60 n60Var2 = this.f29497b;
                        vi.s0 s0Var2 = n60Var2.P;
                        if (s0Var2 != null && (r0Var2 = n60Var2.R) != null && n60Var2.S != null) {
                            boolean z11 = !r0Var2.f50534f;
                            vi.j jVar2 = s0Var2.f50588l;
                            vi.s0.t();
                            if (s0Var2.W == 3 && !s0Var2.f50598w && (i11 = s0Var2.X) != 1) {
                                s0Var2.f50597u = z11;
                                if (i11 == 3) {
                                    s0Var2.u(z11);
                                    jVar2.T(false);
                                } else {
                                    s0Var2.u(false);
                                    jVar2.T(z11);
                                }
                                s0Var2.o();
                                n60Var2.z();
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
        this.f30849c0 = xj0Var;
        xj0Var.setCallback(imageView);
        xj0Var.M(xj0Var.e[0] - 1);
        imageView.setImageDrawable(xj0Var);
        z();
        if (u6Var != null && !u6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.I = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, gb1.i(48, 48, 17));
        k60Var.setOnTouchListener(new rk(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f30866r0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f30866r0);
    }

    private long getCurrentDurationMs() {
        vi.r0 r0Var;
        vi.s0 s0Var = this.P;
        if (s0Var != null && (r0Var = this.R) != null) {
            if (r0Var.f50531a == 3) {
                return s0Var.j();
            }
            return r0Var.f50532b;
        }
        return 0L;
    }

    public static void l(n60 n60Var) {
        if (n60Var.f30861n0 && n60Var.f30864q0 && n60Var.f30862o0 && n60Var.f30863p0) {
            n60Var.f30861n0 = false;
            FileLog.d("RoundVideo camera flip completed: elapsedMs=" + n60Var.getCameraFlipElapsedMs());
            n60Var.y();
        }
    }

    public static void m(n60 n60Var) {
        org.telegram.ui.gl glVar = n60Var.E;
        if (!n60Var.f30859l0) {
            return;
        }
        n60Var.f30859l0 = false;
        glVar.invalidate();
        glVar.animate().cancel();
        glVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.hk hkVar;
        if (z10 != this.G0) {
            this.G0 = z10;
            this.F0 = 0L;
            bq bqVar = this.I0;
            if (z10) {
                ag.n.d().a(30, bqVar);
            } else {
                ag.n.d().g(bqVar);
            }
            if (this.d != z10) {
                this.d = z10;
                r60 r60Var = this.f32865c;
                if (r60Var != null && (hkVar = ((org.telegram.ui.kj) r60Var).f40952a.Y) != null) {
                    hkVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f30852f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        fi.q2 q2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.D0)) {
                this.D0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            q2Var.c(null);
        } else {
            if (!Float.isNaN(this.D0)) {
                attributes.screenBrightness = this.D0;
                this.D0 = Float.NaN;
            }
            q2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A() {
        org.telegram.ui.hk hkVar;
        float f7;
        vi.r0 r0Var = this.R;
        if (r0Var != null) {
            long j10 = r0Var.d;
            if (r0Var.f50531a == 3) {
                long min = Math.min(j10, (SystemClock.elapsedRealtime() + r0Var.f50532b) - r0Var.f50533c);
                this.f30870u0 = min;
                this.f30872w.setProgress(((float) min) / ((float) j10));
                r60 r60Var = this.f32865c;
                if (r60Var != null && (hkVar = ((org.telegram.ui.kj) r60Var).f40952a.Y) != null && hkVar.f25900j1) {
                    hkVar.f25894i1 = min;
                    xg xgVar = hkVar.Y0;
                    if (xgVar != null && xgVar.f34709r) {
                        xgVar.h = min;
                        xgVar.invalidate();
                    }
                    ug ugVar = hkVar.l1;
                    if (ugVar != null && ugVar.f33397n) {
                        if (!ugVar.h) {
                            long j11 = ugVar.f33398r;
                            if (j11 >= 0) {
                                if (!ugVar.e) {
                                    long max = Math.max(0L, min - j11) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    ugVar.f33393a = f7;
                                }
                                ugVar.invalidate();
                            }
                        }
                        ugVar.f33398r = min;
                        ugVar.f33393a = 1.0f;
                        ugVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = hkVar.f25906k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f26007n != 1.0f) {
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
        l11 l11Var = this.T;
        if (l11Var != null) {
            l11Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        w(false, false);
    }

    @Override
    public final void b(float f7, int i10) {
        vi.r0 r0Var;
        i2.j0 j0Var;
        if (this.P != null && (r0Var = this.R) != null && r0Var.f50531a == 5) {
            o();
            if (i10 == 0) {
                this.P.q();
            } else if (i10 == 1) {
                vi.s0 s0Var = this.P;
                s0Var.getClass();
                vi.s0.t();
                if (s0Var.W == 5 && (j0Var = s0Var.S) != null) {
                    j0Var.e();
                    s0Var.x(false);
                    li.e3 e3Var = s0Var.d;
                    s0Var.S.M0();
                    e3Var.getClass();
                }
            } else if (i10 == 2) {
                vi.s0 s0Var2 = this.P;
                long j10 = f7 * ((float) this.R.f50532b);
                s0Var2.getClass();
                vi.s0.t();
                if (s0Var2.W == 5 && s0Var2.S != null) {
                    long j11 = s0Var2.G;
                    s0Var2.S.Z0(5, Math.max(j11, Math.min(Math.max(j11, s0Var2.H - 1), j10)));
                    s0Var2.d.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        q();
        ValueAnimator valueAnimator = this.f30847a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        vi.s0 s0Var = this.P;
        if (s0Var != null) {
            vi.s0.t();
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
                s0Var.f50588l.M();
                s0Var.C = true;
                s0Var.v(10);
                s0Var.m("released");
                s0Var.f50585i.removeCallbacksAndMessages(null);
                s0Var.f50586j.shutdown();
                s0Var.f50587k.shutdown();
            }
            this.P = null;
        }
        l11 l11Var = this.T;
        if (l11Var != null) {
            l11Var.d(true ^ this.f30857j0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        x();
        l60 l60Var = this.v;
        l60Var.setTranslationX(0.0f);
        this.f30873w0 = 0.0f;
        l60Var.setTranslationY(0.0f + this.f30871v0);
        l60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean d() {
        vi.r0 r0Var = this.R;
        if (r0Var != null) {
            int i10 = r0Var.f50531a;
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
        this.f30871v0 = f10;
        this.v.setTranslationY(this.f30873w0 + f10);
    }

    @Override
    public final void f(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        vi.r0 r0Var;
        vi.s0 s0Var = this.P;
        if (s0Var != null && (r0Var = this.R) != null) {
            int i13 = 2;
            if (i10 == 3) {
                if (s0Var != null && r0Var != null && r0Var.f50531a == 3) {
                    u(2);
                    this.P.p();
                }
            } else if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                boolean z11 = false;
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f30860n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.R.f50531a == 3) {
                    u(5);
                } else {
                    o();
                }
                this.V = new m60(j10, i11, i12, z10, j11);
                vi.s0 s0Var2 = this.P;
                boolean z12 = this.f30856i0;
                boolean z13 = !z12;
                s0Var2.getClass();
                vi.s0.t();
                int i14 = s0Var2.W;
                if (i14 == 3 || i14 == 5) {
                    s0Var2.f50589m.b("finish requested: state=" + b10.x(s0Var2.W) + ", includeAudio=" + z13 + ", durationMs=" + s0Var2.j() + ", trim=" + s0Var2.G + ".." + s0Var2.H);
                    s0Var2.f50601z = z13;
                    if (s0Var2.W == 3) {
                        s0Var2.E = s0Var2.j();
                        s0Var2.f50600y = true;
                        s0Var2.e();
                        s0Var2.f50585i.removeCallbacks(s0Var2.T);
                        s0Var2.v(7);
                        boolean Y = s0Var2.f50588l.Y();
                        s0Var2.B = Y;
                        if (!Y) {
                            s0Var2.h(new IllegalStateException("Unable to stop the camera segment"));
                            return;
                        }
                        return;
                    }
                    s0Var2.r();
                    s0Var2.v(7);
                    if (s0Var2.l() || z12) {
                        z11 = true;
                    }
                    if (s0Var2.l()) {
                        i13 = 1;
                    }
                    s0Var2.f50586j.execute(new bi.rb(s0Var2, s0Var2.Q, z11, s0Var2.R, z13, i13, s0Var2.P));
                }
            }
        }
    }

    @Override
    public final void g(ch.b bVar, org.telegram.ui.cj cjVar) {
        View view = this.F;
        eh.d c10 = bVar.c(view, cjVar, false);
        c10.w(AndroidUtilities.dp(6.0f));
        c10.x(AndroidUtilities.dp(21.0f));
        view.setBackground(c10);
    }

    @Override
    public View getButtonsLayout() {
        return this.F;
    }

    @Override
    public q60 getCameraContainer() {
        return this.v;
    }

    @Override
    public RectF getCameraRect() {
        k60 k60Var = this.f30876y;
        int[] iArr = this.K;
        k60Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], k60Var.getWidth() + i10, k60Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.I;
    }

    @Override
    public Paint getPaint() {
        return this.f30872w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f30876y;
    }

    @Override
    public final void h(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.f30872w.getPaint().setAlpha(255);
        this.f30857j0 = false;
        this.f30856i0 = false;
        this.f30853f0 = false;
        this.f30855h0 = false;
        this.f30870u0 = 0L;
        this.f30872w.setProgress(0.0f);
        org.telegram.ui.gl glVar = this.E;
        if (!this.f30859l0) {
            if (this.f30869t0 == null) {
                try {
                    this.f30869t0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f30869t0;
            if (bitmap != null) {
                glVar.setImageBitmap(bitmap);
            } else {
                glVar.setImageResource(R.drawable.icplaceholder);
            }
            this.f30859l0 = true;
            glVar.animate().cancel();
            glVar.setAlpha(1.0f);
            glVar.invalidate();
        }
        this.T = new l11(this.h, this.f30865r);
        this.Q = (vi.q0) wi.e.e.a();
        vi.j0 j0Var = new vi.j0(getContext(), this.f30876y);
        j0Var.f50469c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        j0Var.d = (vi.l0) wi.e.f51279j.a();
        j0Var.e = this.Q;
        j0Var.h = wi.e.h.a();
        j0Var.f50470f = (vi.m0) wi.e.f51276f.a();
        j0Var.f50471g = (vi.n0) wi.e.f51277g.a();
        wi.a aVar = wi.e.f51278i;
        aVar.a();
        j0Var.f50472i = aVar.d;
        li.e3 e3Var = this.J0;
        j0Var.f50473j = e3Var;
        l11 l11Var = this.T;
        j0Var.f50474k = l11Var;
        j0Var.f50475l = new tv(this, 6);
        if (j0Var.d != null) {
            if (j0Var.e != null) {
                if (j0Var.h > 0) {
                    if (j0Var.f50470f != null) {
                        if (j0Var.f50471g != null) {
                            if (e3Var != null) {
                                if (l11Var != null) {
                                    this.P = new vi.s0(j0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    vi.s0 s0Var = this.P;
                                    s0Var.getClass();
                                    vi.s0.t();
                                    if (s0Var.W == 1) {
                                        try {
                                            s0Var.f50589m.b("start requested");
                                            s0Var.c(true);
                                            s0Var.v(2);
                                            s0Var.f50588l.X(s0Var.Q, 0L, s0Var.f50592p);
                                        } catch (Exception e) {
                                            s0Var.h(e);
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
        vi.r0 r0Var;
        vi.s0 s0Var = this.P;
        if (s0Var != null && (r0Var = this.R) != null) {
            int i10 = r0Var.f50531a;
            if (i10 == 3) {
                if (s0Var != null && r0Var != null && i10 == 3) {
                    u(2);
                    this.P.p();
                }
            } else if (i10 == 5) {
                this.U = null;
                this.f30854g0 = true;
                this.f30855h0 = false;
                vi.s0.t();
                if (s0Var.W == 5 && s0Var.H - s0Var.G < s0Var.f50591o) {
                    s0Var.M++;
                    s0Var.f50589m.b("resume requested: trim=" + s0Var.G + ".." + s0Var.H + ", sourceDurationMs=" + s0Var.E);
                    s0Var.r();
                    s0Var.v(6);
                    s0Var.f50586j.execute(new fi.r1(s0Var, s0Var.l(), s0Var.Q, s0Var.P, s0Var.R));
                }
            }
        }
    }

    public final void o() {
        vi.r0 r0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P != null && (r0Var = this.R) != null && (videoEditedInfo = this.U) != null) {
            long j10 = r0Var.f50532b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j11 = this.U.endTime;
            if (j11 >= 0) {
                j10 = Math.min(j10, j11);
            }
            vi.s0 s0Var = this.P;
            s0Var.getClass();
            vi.s0.t();
            if (s0Var.W == 5) {
                long max2 = Math.max(0L, Math.min(s0Var.E, max));
                long max3 = Math.max(max2, Math.min(s0Var.E, j10));
                if (max3 - max2 >= Math.min(800L, s0Var.E)) {
                    s0Var.G = max2;
                    s0Var.H = max3;
                    i2.j0 j0Var = s0Var.S;
                    if (j0Var != null) {
                        j0Var.Z0(5, max2);
                    }
                    s0Var.d.getClass();
                    s0Var.o();
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
            l60 l60Var = this.v;
            l60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            l60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        fi.q2 q2Var = this.J;
        q2Var.f11466b.measure(makeMeasureSpec, makeMeasureSpec2);
        q2Var.f11467c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public final Bitmap p(Bitmap bitmap) {
        k60 k60Var = this.f30876y;
        if (k60Var.getWidth() > 0 && k60Var.getHeight() > 0) {
            Matrix matrix = this.L;
            k60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / k60Var.getWidth();
                float height = bitmap.getHeight() / k60Var.getHeight();
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
        if (!this.f30861n0 && this.f30848b0 == null) {
            return;
        }
        this.f30868s0++;
        ValueAnimator valueAnimator = this.f30848b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f30848b0.cancel();
            this.f30848b0 = null;
        }
        FrameLayout frameLayout = this.f30874x;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f30861n0 = false;
        this.f30862o0 = false;
        this.f30863p0 = false;
        this.f30864q0 = false;
        t(false);
    }

    public final VideoEditedInfo r(File file, long j10, k11 k11Var) {
        long j11;
        int i10;
        int i11;
        vi.n0 n0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j10;
        if (k11Var == null) {
            j11 = file.length();
        } else {
            j11 = k11Var.f29774a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j11);
        videoEditedInfo.roundVideo = true;
        vi.s0 s0Var = this.P;
        if (s0Var != null && (n0Var = s0Var.f50595s) != null) {
            i10 = n0Var.f50516a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        vi.q0 q0Var = this.Q;
        if (q0Var == null) {
            i11 = 480;
        } else {
            i11 = q0Var.f50530a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (k11Var != null) {
            videoEditedInfo.file = k11Var.f29775b;
            videoEditedInfo.encryptedFile = k11Var.f29776c;
            videoEditedInfo.key = k11Var.d;
            videoEditedInfo.iv = k11Var.e;
        }
        return videoEditedInfo;
    }

    public final void s() {
        if (this.B0) {
            this.B0 = false;
            this.f30878z0 = -1;
            this.A0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f30847a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f30877y0, 0.0f);
            this.f30847a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f30847a0.addUpdateListener(new i60(this, 1));
            this.f30847a0.start();
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
        l60 l60Var = this.v;
        l60Var.setAlpha(0.0f);
        l60Var.setScaleX(0.1f);
        l60Var.setScaleY(0.1f);
        l60Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f30872w.getPaint().setAlpha(0);
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
        org.telegram.ui.gl glVar = this.E;
        glVar.animate().cancel();
        if (z10) {
            glVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            glVar.setAlpha(0.0f);
        }
    }

    public final void u(int i10) {
        if (this.f30855h0 && i10 == 2) {
            return;
        }
        this.f30855h0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f30860n), Integer.valueOf(i10));
    }

    public final void v(boolean z10) {
        Bitmap bitmap;
        k60 k60Var = this.f30876y;
        if (k60Var.isAvailable() && (bitmap = k60Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = p(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f30869t0;
                    this.f30869t0 = bitmap;
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
                    if (bitmap != this.f30869t0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f30869t0) {
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
        p60 p60Var = this.f32863a;
        if (p60Var != null) {
            ((org.telegram.ui.pe) p60Var).f42479b.Sc.a(z10, true);
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
        l60 l60Var = this.v;
        if (z10 && !this.f30858k0) {
            l60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f30873w0 = measuredHeight;
            l60Var.setTranslationY(measuredHeight + this.f30871v0);
        }
        this.f30858k0 = z10;
        View view = this.f30867s;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f30870u0) > 300) {
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
        ofFloat.addUpdateListener(new i60(this, 0));
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
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(l60Var, property, f13);
        float f16 = 0.1f;
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(l60Var, View.SCALE_X, f14);
        if (z10) {
            f16 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(l60Var, View.SCALE_Y, f16);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(l60Var, View.TRANSLATION_X, f7);
        if (this.f30856i0 && z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.I, property, f15), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.W.addListener(new i10(this, 1));
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
        vi.k0 k0Var;
        vi.r0 r0Var = this.R;
        boolean z11 = false;
        if (r0Var != null && r0Var.f50531a == 3 && !r0Var.e && !this.f30861n0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G.setEnabled(z10);
        if (z10 && (k0Var = this.S) != null && k0Var.f50479b != 1) {
            z11 = true;
        }
        this.H.setEnabled(z11);
        z();
    }

    public final void z() {
        vi.r0 r0Var = this.R;
        int i10 = this.O;
        fi.o2 o2Var = this.H;
        if (r0Var != null && r0Var.f50534f) {
            if (this.f30851e0 == null) {
                xj0 xj0Var = new xj0(R.raw.roundcamera_flash_off, i10, i10);
                this.f30851e0 = xj0Var;
                xj0Var.setCallback(o2Var);
            }
            o2Var.setImageDrawable(this.f30851e0);
            return;
        }
        if (this.f30850d0 == null) {
            xj0 xj0Var2 = new xj0(R.raw.roundcamera_flash_on, i10, i10);
            this.f30850d0 = xj0Var2;
            xj0Var2.setCallback(o2Var);
        }
        o2Var.setImageDrawable(this.f30850d0);
    }
}
