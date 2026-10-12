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
    public final l2.f J0;
    public final int[] K;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public li.u0 P;
    public li.s0 Q;
    public li.t0 R;
    public li.m0 S;
    public c11 T;
    public VideoEditedInfo U;
    public n60 V;
    public AnimatorSet W;
    public ValueAnimator f27860a0;
    public ValueAnimator f27861b0;
    public final yj0 f27862c0;
    public yj0 f27863d0;
    public yj0 f27864e0;
    public final b60 f27865f;
    public boolean f27866f0;
    public boolean f27867g0;
    public final int h;
    public boolean f27868h0;
    public boolean f27869i0;
    public boolean f27870j0;
    public boolean f27871k0;
    public boolean f27872l0;
    public boolean m0;
    public final int f27873n;
    public boolean f27874n0;
    public boolean f27875o0;
    public boolean f27876p0;
    public boolean f27877q0;
    public final boolean f27878r;
    public long f27879r0;
    public final View f27880s;
    public int f27881s0;
    public Bitmap f27882t0;
    public long f27883u0;
    public final m60 v;
    public float f27884v0;
    public final ym0 f27885w;
    public float f27886w0;
    public final FrameLayout f27887x;
    public float f27888x0;
    public final l60 f27889y;
    public float f27890y0;
    public int f27891z0;

    public o60(Activity activity, b60 b60Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.f27891z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        this.I0 = new kq(this, 25);
        this.J0 = new l2.f(this, 9);
        this.f27865f = b60Var;
        this.f27873n = b60Var.getClassGuid();
        this.f27878r = b60Var.x();
        this.f27880s = b60Var.getFragmentView();
        setWillNotDraw(false);
        di.w2 w2Var = new di.w2(activity, null, this, null);
        this.J = w2Var;
        w2Var.f8038o = 0.5f;
        w2Var.f8037n = di.w2.f(0.5f);
        w2Var.g();
        addView(w2Var.f8028b, w7.a6.e(-1, -1, 119));
        m60 m60Var = new m60(this, activity);
        this.v = m60Var;
        ym0 ym0Var = new ym0(activity);
        this.f27885w = ym0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f27887x = frameLayout;
        l60 l60Var = new l60(this, activity, 0);
        l60Var.setOpaque(true);
        l60Var.setClickable(true);
        l60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        l60Var.setOutlineProvider(new bi.a2(13));
        l60Var.setClipToOutline(true);
        this.f27889y = l60Var;
        frameLayout.addView(l60Var, w7.a6.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.rl rlVar = new org.telegram.ui.rl(this, activity, paint);
        this.E = rlVar;
        rlVar.setOutlineProvider(new bi.a2(12));
        rlVar.setClipToOutline(true);
        frameLayout.addView(rlVar, w7.a6.e(-1, -1, 119));
        ym0Var.addView(frameLayout, w7.a6.a(-1.0f, 14.0f, 14.0f, 14.0f, 14.0f, -1, 119));
        m60Var.addView(ym0Var, w7.a6.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(m60Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(w2Var.f8029c, w7.a6.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, w7.a6.a(56.0f, 1.0f, 0.0f, 0.0f, 0.0f, -2, 83));
        ?? imageView = new ImageView(activity);
        this.G = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, w7.a6.n(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final o60 f26592b;

            {
                this.f26592b = this;
            }

            @Override
            public final void onClick(View view) {
                li.t0 t0Var;
                li.m0 m0Var;
                boolean z10;
                li.t0 t0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        o60 o60Var = this.f26592b;
                        li.u0 u0Var = o60Var.P;
                        if (u0Var != null && (t0Var = o60Var.R) != null && (m0Var = o60Var.S) != null && t0Var.f14957a == 3 && !t0Var.e && !o60Var.f27874n0) {
                            li.n0 n0Var = m0Var.f14904a;
                            li.n0 n0Var2 = li.n0.f14909a;
                            if (n0Var == n0Var2) {
                                n0Var2 = li.n0.f14910b;
                            }
                            u0Var.getClass();
                            li.u0.t();
                            int i12 = u0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (u0Var.f15018p != n0Var2) {
                                    u0Var.f15015m.b("camera facing requested: " + u0Var.f15018p + " -> " + n0Var2 + ", state=" + i2.d.C(u0Var.W));
                                    u0Var.f15018p = n0Var2;
                                    int i13 = u0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        u0Var.e();
                                        li.l lVar = u0Var.f15014l;
                                        lVar.F = n0Var2;
                                        Handler handler = lVar.f14861n;
                                        if (lVar.V && handler != null) {
                                            handler.post(new ji.v2(9, lVar, n0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        u0Var.f15024w = z10;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                o60Var.f27862c0.M(0);
                                o60Var.f27862c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        o60 o60Var2 = this.f26592b;
                        li.u0 u0Var2 = o60Var2.P;
                        if (u0Var2 != null && (t0Var2 = o60Var2.R) != null && o60Var2.S != null) {
                            boolean z11 = !t0Var2.f14960f;
                            li.l lVar2 = u0Var2.f15014l;
                            li.u0.t();
                            if (u0Var2.W == 3 && !u0Var2.f15024w && (i11 = u0Var2.X) != 1) {
                                u0Var2.f15023u = z11;
                                if (i11 == 3) {
                                    u0Var2.u(z11);
                                    lVar2.T(false);
                                } else {
                                    u0Var2.u(false);
                                    lVar2.T(z11);
                                }
                                u0Var2.o();
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
        linearLayout.addView((View) imageView2, w7.a6.n(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final o60 f26592b;

            {
                this.f26592b = this;
            }

            @Override
            public final void onClick(View view) {
                li.t0 t0Var;
                li.m0 m0Var;
                boolean z10;
                li.t0 t0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        o60 o60Var = this.f26592b;
                        li.u0 u0Var = o60Var.P;
                        if (u0Var != null && (t0Var = o60Var.R) != null && (m0Var = o60Var.S) != null && t0Var.f14957a == 3 && !t0Var.e && !o60Var.f27874n0) {
                            li.n0 n0Var = m0Var.f14904a;
                            li.n0 n0Var2 = li.n0.f14909a;
                            if (n0Var == n0Var2) {
                                n0Var2 = li.n0.f14910b;
                            }
                            u0Var.getClass();
                            li.u0.t();
                            int i12 = u0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (u0Var.f15018p != n0Var2) {
                                    u0Var.f15015m.b("camera facing requested: " + u0Var.f15018p + " -> " + n0Var2 + ", state=" + i2.d.C(u0Var.W));
                                    u0Var.f15018p = n0Var2;
                                    int i13 = u0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        u0Var.e();
                                        li.l lVar = u0Var.f15014l;
                                        lVar.F = n0Var2;
                                        Handler handler = lVar.f14861n;
                                        if (lVar.V && handler != null) {
                                            handler.post(new ji.v2(9, lVar, n0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        u0Var.f15024w = z10;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                o60Var.f27862c0.M(0);
                                o60Var.f27862c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        o60 o60Var2 = this.f26592b;
                        li.u0 u0Var2 = o60Var2.P;
                        if (u0Var2 != null && (t0Var2 = o60Var2.R) != null && o60Var2.S != null) {
                            boolean z11 = !t0Var2.f14960f;
                            li.l lVar2 = u0Var2.f15014l;
                            li.u0.t();
                            if (u0Var2.W == 3 && !u0Var2.f15024w && (i11 = u0Var2.X) != 1) {
                                u0Var2.f15023u = z11;
                                if (i11 == 3) {
                                    u0Var2.u(z11);
                                    lVar2.T(false);
                                } else {
                                    u0Var2.u(false);
                                    lVar2.T(z11);
                                }
                                u0Var2.o();
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
        this.f27862c0 = yj0Var;
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
        addView(imageView3, w7.a6.e(48, 48, 17));
        l60Var.setOnTouchListener(new uk(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f27879r0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f27879r0);
    }

    private long getCurrentDurationMs() {
        li.t0 t0Var;
        li.u0 u0Var = this.P;
        if (u0Var != null && (t0Var = this.R) != null) {
            if (t0Var.f14957a == 3) {
                return u0Var.j();
            }
            return t0Var.f14958b;
        }
        return 0L;
    }

    public static void l(o60 o60Var) {
        if (o60Var.f27874n0 && o60Var.f27877q0 && o60Var.f27875o0 && o60Var.f27876p0) {
            o60Var.f27874n0 = false;
            FileLog.d("RoundVideo camera flip completed: elapsedMs=" + o60Var.getCameraFlipElapsedMs());
            o60Var.y();
        }
    }

    public static void m(o60 o60Var) {
        org.telegram.ui.rl rlVar = o60Var.E;
        if (!o60Var.f27872l0) {
            return;
        }
        o60Var.f27872l0 = false;
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
                s60 s60Var = this.f29589c;
                if (s60Var != null && (skVar = ((org.telegram.ui.wj) s60Var).f41610a.Y) != null) {
                    skVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f27865f.getParentActivity();
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
        li.t0 t0Var = this.R;
        if (t0Var != null) {
            long j10 = t0Var.d;
            if (t0Var.f14957a == 3) {
                long min = Math.min(j10, (SystemClock.elapsedRealtime() + t0Var.f14958b) - t0Var.f14959c);
                this.f27883u0 = min;
                this.f27885w.setProgress(((float) min) / ((float) j10));
                s60 s60Var = this.f29589c;
                if (s60Var != null && (skVar = ((org.telegram.ui.wj) s60Var).f41610a.Y) != null && skVar.f22908j1) {
                    skVar.f22902i1 = min;
                    yg ygVar = skVar.Y0;
                    if (ygVar != null && ygVar.f31569r) {
                        ygVar.h = min;
                        ygVar.invalidate();
                    }
                    vg vgVar = skVar.l1;
                    if (vgVar != null && vgVar.f29958n) {
                        if (!vgVar.h) {
                            long j11 = vgVar.f29959r;
                            if (j11 >= 0) {
                                if (!vgVar.e) {
                                    long max = Math.max(0L, min - j11) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    vgVar.f29954a = f7;
                                }
                                vgVar.invalidate();
                            }
                        }
                        vgVar.f29959r = min;
                        vgVar.f29954a = 1.0f;
                        vgVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = skVar.f22914k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f23012n != 1.0f) {
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
        li.t0 t0Var;
        i2.h0 h0Var;
        if (this.P != null && (t0Var = this.R) != null && t0Var.f14957a == 5) {
            o();
            if (i10 == 0) {
                this.P.q();
            } else if (i10 == 1) {
                li.u0 u0Var = this.P;
                u0Var.getClass();
                li.u0.t();
                if (u0Var.W == 5 && (h0Var = u0Var.S) != null) {
                    h0Var.e();
                    u0Var.x(false);
                    l2.f fVar = u0Var.d;
                    u0Var.S.M0();
                    fVar.getClass();
                }
            } else if (i10 == 2) {
                li.u0 u0Var2 = this.P;
                long j10 = f7 * ((float) this.R.f14958b);
                u0Var2.getClass();
                li.u0.t();
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
        ValueAnimator valueAnimator = this.f27860a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        li.u0 u0Var = this.P;
        if (u0Var != null) {
            li.u0.t();
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
                u0Var.f15014l.M();
                u0Var.C = true;
                u0Var.v(10);
                u0Var.m("released");
                u0Var.f15011i.removeCallbacksAndMessages(null);
                u0Var.f15012j.shutdown();
                u0Var.f15013k.shutdown();
            }
            this.P = null;
        }
        c11 c11Var = this.T;
        if (c11Var != null) {
            c11Var.d(true ^ this.f27870j0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        x();
        m60 m60Var = this.v;
        m60Var.setTranslationX(0.0f);
        this.f27886w0 = 0.0f;
        m60Var.setTranslationY(0.0f + this.f27884v0);
        m60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean d() {
        li.t0 t0Var = this.R;
        if (t0Var != null) {
            int i10 = t0Var.f14957a;
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
        this.f27884v0 = f10;
        this.v.setTranslationY(this.f27886w0 + f10);
    }

    @Override
    public final void f(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        li.t0 t0Var;
        li.u0 u0Var = this.P;
        if (u0Var != null && (t0Var = this.R) != null) {
            int i13 = 2;
            if (i10 == 3) {
                if (u0Var != null && t0Var != null && t0Var.f14957a == 3) {
                    u(2);
                    this.P.p();
                }
            } else if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                boolean z11 = false;
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f27873n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.R.f14957a == 3) {
                    u(5);
                } else {
                    o();
                }
                this.V = new n60(j10, i11, i12, z10, j11);
                li.u0 u0Var2 = this.P;
                boolean z12 = this.f27869i0;
                boolean z13 = !z12;
                u0Var2.getClass();
                li.u0.t();
                int i14 = u0Var2.W;
                if (i14 == 3 || i14 == 5) {
                    u0Var2.f15015m.b("finish requested: state=" + i2.d.C(u0Var2.W) + ", includeAudio=" + z13 + ", durationMs=" + u0Var2.j() + ", trim=" + u0Var2.G + ".." + u0Var2.H);
                    u0Var2.f15027z = z13;
                    if (u0Var2.W == 3) {
                        u0Var2.E = u0Var2.j();
                        u0Var2.f15026y = true;
                        u0Var2.e();
                        u0Var2.f15011i.removeCallbacks(u0Var2.T);
                        u0Var2.v(7);
                        boolean Y = u0Var2.f15014l.Y();
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
                    u0Var2.f15012j.execute(new li.k0(u0Var2, u0Var2.Q, z11, u0Var2.R, z13, i13, u0Var2.P));
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
        l60 l60Var = this.f27889y;
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
        return this.f27885w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f27889y;
    }

    @Override
    public final void h(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.f27885w.getPaint().setAlpha(255);
        this.f27870j0 = false;
        this.f27869i0 = false;
        this.f27866f0 = false;
        this.f27868h0 = false;
        this.f27883u0 = 0L;
        this.f27885w.setProgress(0.0f);
        org.telegram.ui.rl rlVar = this.E;
        if (!this.f27872l0) {
            if (this.f27882t0 == null) {
                try {
                    this.f27882t0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f27882t0;
            if (bitmap != null) {
                rlVar.setImageBitmap(bitmap);
            } else {
                rlVar.setImageResource(R.drawable.icplaceholder);
            }
            this.f27872l0 = true;
            rlVar.animate().cancel();
            rlVar.setAlpha(1.0f);
            rlVar.invalidate();
        }
        this.T = new c11(this.h, this.f27878r);
        this.Q = (li.s0) si.e.e.a();
        li.l0 l0Var = new li.l0(getContext(), this.f27889y);
        l0Var.f14895c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        l0Var.d = (li.n0) si.e.f45490j.a();
        l0Var.e = this.Q;
        l0Var.h = si.e.h.a();
        l0Var.f14896f = (li.o0) si.e.f45487f.a();
        l0Var.f14897g = (li.p0) si.e.f45488g.a();
        si.a aVar = si.e.f45489i;
        aVar.a();
        l0Var.f14898i = aVar.d;
        l2.f fVar = this.J0;
        l0Var.f14899j = fVar;
        c11 c11Var = this.T;
        l0Var.f14900k = c11Var;
        l0Var.f14901l = new xv(this, 6);
        if (l0Var.d != null) {
            if (l0Var.e != null) {
                if (l0Var.h > 0) {
                    if (l0Var.f14896f != null) {
                        if (l0Var.f14897g != null) {
                            if (fVar != null) {
                                if (c11Var != null) {
                                    this.P = new li.u0(l0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    li.u0 u0Var = this.P;
                                    u0Var.getClass();
                                    li.u0.t();
                                    if (u0Var.W == 1) {
                                        try {
                                            u0Var.f15015m.b("start requested");
                                            u0Var.c(true);
                                            u0Var.v(2);
                                            u0Var.f15014l.X(u0Var.Q, 0L, u0Var.f15018p);
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
        li.t0 t0Var;
        li.u0 u0Var = this.P;
        if (u0Var != null && (t0Var = this.R) != null) {
            int i10 = t0Var.f14957a;
            if (i10 == 3) {
                if (u0Var != null && t0Var != null && i10 == 3) {
                    u(2);
                    this.P.p();
                }
            } else if (i10 == 5) {
                this.U = null;
                this.f27867g0 = true;
                this.f27868h0 = false;
                li.u0.t();
                if (u0Var.W == 5 && u0Var.H - u0Var.G < u0Var.f15017o) {
                    u0Var.M++;
                    u0Var.f15015m.b("resume requested: trim=" + u0Var.G + ".." + u0Var.H + ", sourceDurationMs=" + u0Var.E);
                    u0Var.r();
                    u0Var.v(6);
                    u0Var.f15012j.execute(new di.t1(u0Var, u0Var.l(), u0Var.Q, u0Var.P, u0Var.R));
                }
            }
        }
    }

    public final void o() {
        li.t0 t0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P != null && (t0Var = this.R) != null && (videoEditedInfo = this.U) != null) {
            long j10 = t0Var.f14958b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j11 = this.U.endTime;
            if (j11 >= 0) {
                j10 = Math.min(j10, j11);
            }
            li.u0 u0Var = this.P;
            u0Var.getClass();
            li.u0.t();
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
            m60 m60Var = this.v;
            m60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            m60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        di.w2 w2Var = this.J;
        w2Var.f8028b.measure(makeMeasureSpec, makeMeasureSpec2);
        w2Var.f8029c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public final Bitmap p(Bitmap bitmap) {
        l60 l60Var = this.f27889y;
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
        if (!this.f27874n0 && this.f27861b0 == null) {
            return;
        }
        this.f27881s0++;
        ValueAnimator valueAnimator = this.f27861b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f27861b0.cancel();
            this.f27861b0 = null;
        }
        FrameLayout frameLayout = this.f27887x;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f27874n0 = false;
        this.f27875o0 = false;
        this.f27876p0 = false;
        this.f27877q0 = false;
        t(false);
    }

    public final VideoEditedInfo r(File file, long j10, b11 b11Var) {
        long j11;
        int i10;
        int i11;
        li.p0 p0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j10;
        if (b11Var == null) {
            j11 = file.length();
        } else {
            j11 = b11Var.f23670a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j11);
        videoEditedInfo.roundVideo = true;
        li.u0 u0Var = this.P;
        if (u0Var != null && (p0Var = u0Var.f15021s) != null) {
            i10 = p0Var.f14942a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        li.s0 s0Var = this.Q;
        if (s0Var == null) {
            i11 = 480;
        } else {
            i11 = s0Var.f14956a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (b11Var != null) {
            videoEditedInfo.file = b11Var.f23671b;
            videoEditedInfo.encryptedFile = b11Var.f23672c;
            videoEditedInfo.key = b11Var.d;
            videoEditedInfo.iv = b11Var.e;
        }
        return videoEditedInfo;
    }

    public final void s() {
        if (this.B0) {
            this.B0 = false;
            this.f27891z0 = -1;
            this.A0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f27860a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27890y0, 0.0f);
            this.f27860a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f27860a0.addUpdateListener(new j60(this, 1));
            this.f27860a0.start();
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
        this.f27885w.getPaint().setAlpha(0);
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
        if (this.f27868h0 && i10 == 2) {
            return;
        }
        this.f27868h0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f27873n), Integer.valueOf(i10));
    }

    public final void v(boolean z10) {
        Bitmap bitmap;
        l60 l60Var = this.f27889y;
        if (l60Var.isAvailable() && (bitmap = l60Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = p(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f27882t0;
                    this.f27882t0 = bitmap;
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
                    if (bitmap != this.f27882t0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f27882t0) {
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
        q60 q60Var = this.f29587a;
        if (q60Var != null) {
            ((org.telegram.ui.xe) q60Var).f41839b.f36145vc.a(z10, true);
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
        if (z10 && !this.f27871k0) {
            m60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f27886w0 = measuredHeight;
            m60Var.setTranslationY(measuredHeight + this.f27884v0);
        }
        this.f27871k0 = z10;
        View view = this.f27880s;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f27883u0) > 300) {
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
        if (this.f27869i0 && z10) {
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
        li.m0 m0Var;
        li.t0 t0Var = this.R;
        boolean z11 = false;
        if (t0Var != null && t0Var.f14957a == 3 && !t0Var.e && !this.f27874n0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G.setEnabled(z10);
        if (z10 && (m0Var = this.S) != null && m0Var.f14905b != 1) {
            z11 = true;
        }
        this.H.setEnabled(z11);
        z();
    }

    public final void z() {
        li.t0 t0Var = this.R;
        int i10 = this.O;
        di.u2 u2Var = this.H;
        if (t0Var != null && t0Var.f14960f) {
            if (this.f27864e0 == null) {
                yj0 yj0Var = new yj0(R.raw.roundcamera_flash_off, i10, i10);
                this.f27864e0 = yj0Var;
                yj0Var.setCallback(u2Var);
            }
            u2Var.setImageDrawable(this.f27864e0);
            return;
        }
        if (this.f27863d0 == null) {
            yj0 yj0Var2 = new yj0(R.raw.roundcamera_flash_on, i10, i10);
            this.f27863d0 = yj0Var2;
            yj0Var2.setCallback(u2Var);
        }
        u2Var.setImageDrawable(this.f27863d0);
    }
}
