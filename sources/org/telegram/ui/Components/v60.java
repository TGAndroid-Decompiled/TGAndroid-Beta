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
public final class v60 extends b70 {
    public int A0;
    public boolean B0;
    public boolean C0;
    public float D0;
    public final org.telegram.ui.rl E;
    public int E0;
    public final LinearLayout F;
    public long F0;
    public final ci.u2 G;
    public boolean G0;
    public final ci.u2 H;
    public boolean H0;
    public final ImageView I;
    public final pq I0;
    public final ci.w2 J;
    public final n4.l J0;
    public final int[] K;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public qi.p0 P;
    public qi.n0 Q;
    public qi.o0 R;
    public qi.h0 S;
    public m11 T;
    public VideoEditedInfo U;
    public u60 V;
    public AnimatorSet W;
    public ValueAnimator f31412a0;
    public ValueAnimator f31413b0;
    public final fk0 f31414c0;
    public fk0 f31415d0;
    public fk0 f31416e0;
    public final j60 f31417f;
    public boolean f31418f0;
    public boolean f31419g0;
    public final int h;
    public boolean f31420h0;
    public boolean f31421i0;
    public boolean f31422j0;
    public boolean f31423k0;
    public boolean f31424l0;
    public boolean m0;
    public final int f31425n;
    public boolean f31426n0;
    public boolean f31427o0;
    public boolean f31428p0;
    public boolean f31429q0;
    public final boolean f31430r;
    public long f31431r0;
    public final View f31432s;
    public int f31433s0;
    public Bitmap f31434t0;
    public long f31435u0;
    public final t60 v;
    public float f31436v0;
    public final in0 f31437w;
    public float f31438w0;
    public final FrameLayout f31439x;
    public float f31440x0;
    public final s60 f31441y;
    public float f31442y0;
    public int f31443z0;

    public v60(Activity activity, j60 j60Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.f31443z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        this.I0 = new pq(this, 25);
        this.J0 = new n4.l(this);
        this.f31417f = j60Var;
        this.f31425n = j60Var.getClassGuid();
        this.f31430r = j60Var.v();
        this.f31432s = j60Var.getFragmentView();
        setWillNotDraw(false);
        ci.w2 w2Var = new ci.w2(activity, null, this, null);
        this.J = w2Var;
        w2Var.f6193o = 0.5f;
        w2Var.f6192n = ci.w2.f(0.5f);
        w2Var.g();
        addView(w2Var.f6182b, w7.w5.e(-1, -1, 119));
        t60 t60Var = new t60(this, activity);
        this.v = t60Var;
        in0 in0Var = new in0(activity);
        this.f31437w = in0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f31439x = frameLayout;
        s60 s60Var = new s60(this, activity, 0);
        s60Var.setOpaque(true);
        s60Var.setClickable(true);
        s60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        s60Var.setOutlineProvider(new ai.l2(13));
        s60Var.setClipToOutline(true);
        this.f31441y = s60Var;
        frameLayout.addView(s60Var, w7.w5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.rl rlVar = new org.telegram.ui.rl(this, activity, paint);
        this.E = rlVar;
        rlVar.setOutlineProvider(new ai.l2(12));
        rlVar.setClipToOutline(true);
        frameLayout.addView(rlVar, w7.w5.e(-1, -1, 119));
        in0Var.addView(frameLayout, w7.w5.a(-1.0f, 14.0f, 14.0f, 14.0f, 14.0f, -1, 119));
        t60Var.addView(in0Var, w7.w5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(t60Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(w2Var.f6183c, w7.w5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, w7.w5.a(56.0f, 1.0f, 0.0f, 0.0f, 0.0f, -2, 83));
        ?? imageView = new ImageView(activity);
        this.G = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, w7.w5.n(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final v60 f30061b;

            {
                this.f30061b = this;
            }

            @Override
            public final void onClick(View view) {
                qi.o0 o0Var;
                qi.h0 h0Var;
                boolean z10;
                qi.o0 o0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        v60 v60Var = this.f30061b;
                        qi.p0 p0Var = v60Var.P;
                        if (p0Var != null && (o0Var = v60Var.R) != null && (h0Var = v60Var.S) != null && o0Var.f46809a == 3 && !o0Var.f46812e && !v60Var.f31426n0) {
                            qi.i0 i0Var = h0Var.f46757a;
                            qi.i0 i0Var2 = qi.i0.f46762a;
                            if (i0Var == i0Var2) {
                                i0Var2 = qi.i0.f46763b;
                            }
                            p0Var.getClass();
                            qi.p0.v();
                            int i12 = p0Var.X;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (p0Var.f46866q != i0Var2) {
                                    p0Var.f46863n.b("camera facing requested: " + p0Var.f46866q + " -> " + i0Var2 + ", state=" + org.telegram.ui.Cells.c1.w(p0Var.X));
                                    p0Var.f46866q = i0Var2;
                                    int i13 = p0Var.X;
                                    if (i13 == 3 || i13 == 2) {
                                        p0Var.e();
                                        qi.h hVar = p0Var.f46862m;
                                        hVar.C = i0Var2;
                                        Handler handler = hVar.f46732n;
                                        if (hVar.S && handler != null) {
                                            handler.post(new p2.b(8, hVar, i0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        p0Var.f46872x = z10;
                                    }
                                    p0Var.p();
                                    p0Var.q();
                                }
                                v60Var.f31414c0.M(0);
                                v60Var.f31414c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        v60 v60Var2 = this.f30061b;
                        qi.p0 p0Var2 = v60Var2.P;
                        if (p0Var2 != null && (o0Var2 = v60Var2.R) != null && v60Var2.S != null) {
                            boolean z11 = !o0Var2.f46813f;
                            qi.h hVar2 = p0Var2.f46862m;
                            qi.p0.v();
                            if (p0Var2.X == 3 && !p0Var2.f46872x && (i11 = p0Var2.Y) != 1) {
                                p0Var2.v = z11;
                                if (i11 == 3) {
                                    p0Var2.x(z11);
                                    hVar2.y(false);
                                } else {
                                    p0Var2.x(false);
                                    hVar2.y(z11);
                                }
                                p0Var2.q();
                                v60Var2.z();
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
        linearLayout.addView((View) imageView2, w7.w5.n(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final v60 f30061b;

            {
                this.f30061b = this;
            }

            @Override
            public final void onClick(View view) {
                qi.o0 o0Var;
                qi.h0 h0Var;
                boolean z10;
                qi.o0 o0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        v60 v60Var = this.f30061b;
                        qi.p0 p0Var = v60Var.P;
                        if (p0Var != null && (o0Var = v60Var.R) != null && (h0Var = v60Var.S) != null && o0Var.f46809a == 3 && !o0Var.f46812e && !v60Var.f31426n0) {
                            qi.i0 i0Var = h0Var.f46757a;
                            qi.i0 i0Var2 = qi.i0.f46762a;
                            if (i0Var == i0Var2) {
                                i0Var2 = qi.i0.f46763b;
                            }
                            p0Var.getClass();
                            qi.p0.v();
                            int i12 = p0Var.X;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (p0Var.f46866q != i0Var2) {
                                    p0Var.f46863n.b("camera facing requested: " + p0Var.f46866q + " -> " + i0Var2 + ", state=" + org.telegram.ui.Cells.c1.w(p0Var.X));
                                    p0Var.f46866q = i0Var2;
                                    int i13 = p0Var.X;
                                    if (i13 == 3 || i13 == 2) {
                                        p0Var.e();
                                        qi.h hVar = p0Var.f46862m;
                                        hVar.C = i0Var2;
                                        Handler handler = hVar.f46732n;
                                        if (hVar.S && handler != null) {
                                            handler.post(new p2.b(8, hVar, i0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        p0Var.f46872x = z10;
                                    }
                                    p0Var.p();
                                    p0Var.q();
                                }
                                v60Var.f31414c0.M(0);
                                v60Var.f31414c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        v60 v60Var2 = this.f30061b;
                        qi.p0 p0Var2 = v60Var2.P;
                        if (p0Var2 != null && (o0Var2 = v60Var2.R) != null && v60Var2.S != null) {
                            boolean z11 = !o0Var2.f46813f;
                            qi.h hVar2 = p0Var2.f46862m;
                            qi.p0.v();
                            if (p0Var2.X == 3 && !p0Var2.f46872x && (i11 = p0Var2.Y) != 1) {
                                p0Var2.v = z11;
                                if (i11 == 3) {
                                    p0Var2.x(z11);
                                    hVar2.y(false);
                                } else {
                                    p0Var2.x(false);
                                    hVar2.y(z11);
                                }
                                p0Var2.q();
                                v60Var2.z();
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
        fk0 fk0Var = new fk0(R.raw.roundcamera_flip, dp, dp);
        this.f31414c0 = fk0Var;
        fk0Var.setCallback(imageView);
        fk0Var.M(fk0Var.f26107e[0] - 1);
        imageView.setImageDrawable(fk0Var);
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
        addView(imageView3, w7.w5.e(48, 48, 17));
        s60Var.setOnTouchListener(new yk(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f31431r0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f31431r0);
    }

    private long getCurrentDurationMs() {
        qi.o0 o0Var;
        qi.p0 p0Var = this.P;
        if (p0Var != null && (o0Var = this.R) != null) {
            if (o0Var.f46809a == 3) {
                return p0Var.l();
            }
            return o0Var.f46810b;
        }
        return 0L;
    }

    public static void l(v60 v60Var) {
        if (v60Var.f31426n0 && v60Var.f31429q0 && v60Var.f31427o0 && v60Var.f31428p0) {
            v60Var.f31426n0 = false;
            FileLog.d("RoundVideo camera flip completed: elapsedMs=" + v60Var.getCameraFlipElapsedMs());
            v60Var.y();
        }
    }

    public static void m(v60 v60Var) {
        org.telegram.ui.rl rlVar = v60Var.E;
        if (!v60Var.f31424l0) {
            return;
        }
        v60Var.f31424l0 = false;
        rlVar.invalidate();
        rlVar.animate().cancel();
        rlVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.sk skVar;
        if (z10 != this.G0) {
            this.G0 = z10;
            this.F0 = 0L;
            pq pqVar = this.I0;
            if (z10) {
                yf.h.d().a(30, pqVar);
            } else {
                yf.h.d().f(pqVar);
            }
            if (this.d != z10) {
                this.d = z10;
                z60 z60Var = this.f24578c;
                if (z60Var != null && (skVar = ((org.telegram.ui.wj) z60Var).f43542a.Y) != null) {
                    skVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f31417f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ci.w2 w2Var = this.J;
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
        qi.o0 o0Var = this.R;
        if (o0Var != null) {
            long j3 = o0Var.d;
            if (o0Var.f46809a == 3) {
                long min = Math.min(j3, (SystemClock.elapsedRealtime() + o0Var.f46810b) - o0Var.f46811c);
                this.f31435u0 = min;
                this.f31437w.setProgress(((float) min) / ((float) j3));
                z60 z60Var = this.f24578c;
                if (z60Var != null && (skVar = ((org.telegram.ui.wj) z60Var).f43542a.Y) != null && skVar.f23675j1) {
                    skVar.f23669i1 = min;
                    bh bhVar = skVar.Y0;
                    if (bhVar != null && bhVar.f24647r) {
                        bhVar.h = min;
                        bhVar.invalidate();
                    }
                    yg ygVar = skVar.l1;
                    if (ygVar != null && ygVar.f33099n) {
                        if (!ygVar.h) {
                            long j10 = ygVar.f33100r;
                            if (j10 >= 0) {
                                if (!ygVar.f33097e) {
                                    long max = Math.max(0L, min - j10) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    ygVar.f33094a = f7;
                                }
                                ygVar.invalidate();
                            }
                        }
                        ygVar.f33100r = min;
                        ygVar.f33094a = 1.0f;
                        ygVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = skVar.f23680k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f23792n != 1.0f) {
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
        m11 m11Var = this.T;
        if (m11Var != null) {
            m11Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        w(false, false);
    }

    @Override
    public final void b(float f7, int i10) {
        qi.o0 o0Var;
        i2.f0 f0Var;
        if (this.P != null && (o0Var = this.R) != null && o0Var.f46809a == 5) {
            o();
            if (i10 == 0) {
                this.P.s();
            } else if (i10 == 1) {
                qi.p0 p0Var = this.P;
                p0Var.getClass();
                qi.p0.v();
                if (p0Var.X == 5 && (f0Var = p0Var.T) != null) {
                    f0Var.e();
                    p0Var.A(false);
                    n4.l lVar = p0Var.d;
                    p0Var.T.J0();
                    lVar.getClass();
                }
            } else if (i10 == 2) {
                qi.p0 p0Var2 = this.P;
                long j3 = f7 * ((float) this.R.f46810b);
                p0Var2.getClass();
                qi.p0.v();
                if (p0Var2.X == 5 && p0Var2.T != null) {
                    long j10 = p0Var2.H;
                    p0Var2.T.W0(5, Math.max(j10, Math.min(Math.max(j10, p0Var2.I - 1), j3)));
                    p0Var2.d.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        File file;
        setRecordingUiFrameClockActive(false);
        q();
        ValueAnimator valueAnimator = this.f31412a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        qi.p0 p0Var = this.P;
        if (p0Var != null) {
            qi.p0.v();
            int i10 = p0Var.X;
            if (i10 == 10) {
                if (!p0Var.D) {
                    p0Var.k();
                }
            } else if (i10 != 8) {
                p0Var.a();
            } else {
                p0Var.e();
                p0Var.t();
                p0Var.f46862m.s();
                p0Var.y(10);
                p0Var.o("released");
                if (p0Var.Q == null) {
                    file = null;
                } else {
                    file = p0Var.Q.f46800b;
                }
                p0Var.w(file);
            }
            this.P = null;
        }
        m11 m11Var = this.T;
        if (m11Var != null) {
            m11Var.d(!this.f31422j0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        x();
        this.v.setTranslationX(0.0f);
        this.f31438w0 = 0.0f;
        this.v.setTranslationY(0.0f + this.f31436v0);
        this.v.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean d() {
        qi.o0 o0Var = this.R;
        if (o0Var != null) {
            int i10 = o0Var.f46809a;
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
        this.f31436v0 = f10;
        this.v.setTranslationY(this.f31438w0 + f10);
    }

    @Override
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        qi.o0 o0Var;
        qi.p0 p0Var = this.P;
        if (p0Var != null && (o0Var = this.R) != null) {
            int i13 = 2;
            if (i10 == 3) {
                if (p0Var != null && o0Var != null && o0Var.f46809a == 3) {
                    u(2);
                    this.P.r();
                }
            } else if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                boolean z11 = false;
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f31425n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.R.f46809a == 3) {
                    u(5);
                } else {
                    o();
                }
                this.V = new u60(j3, i11, i12, z10, j10);
                qi.p0 p0Var2 = this.P;
                boolean z12 = this.f31421i0;
                boolean z13 = !z12;
                p0Var2.getClass();
                qi.p0.v();
                int i14 = p0Var2.X;
                if (i14 == 3 || i14 == 5) {
                    p0Var2.f46863n.b("finish requested: state=" + org.telegram.ui.Cells.c1.w(p0Var2.X) + ", includeAudio=" + z13 + ", durationMs=" + p0Var2.l() + ", trim=" + p0Var2.H + ".." + p0Var2.I);
                    p0Var2.A = z13;
                    if (p0Var2.X == 3) {
                        p0Var2.F = p0Var2.l();
                        p0Var2.f46874z = true;
                        p0Var2.e();
                        p0Var2.f46859j.removeCallbacks(p0Var2.U);
                        p0Var2.y(7);
                        boolean D = p0Var2.f46862m.D();
                        p0Var2.C = D;
                        if (!D) {
                            p0Var2.j(new IllegalStateException("Unable to stop the camera segment"));
                            return;
                        }
                        return;
                    }
                    p0Var2.t();
                    p0Var2.y(7);
                    if (p0Var2.n() || z12) {
                        z11 = true;
                    }
                    if (p0Var2.n()) {
                        i13 = 1;
                    }
                    p0Var2.f46860k.execute(new org.telegram.messenger.ej(p0Var2, p0Var2.R, z11, p0Var2.S, z13, i13, p0Var2.Q));
                }
            }
        }
    }

    @Override
    public final void g(ah.c cVar, org.telegram.ui.oj ojVar) {
        View view = this.F;
        ch.d c10 = cVar.c(view, ojVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        view.setBackground(c10);
    }

    @Override
    public View getButtonsLayout() {
        return this.F;
    }

    @Override
    public y60 getCameraContainer() {
        return this.v;
    }

    @Override
    public RectF getCameraRect() {
        s60 s60Var = this.f31441y;
        int[] iArr = this.K;
        s60Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], s60Var.getWidth() + i10, s60Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.I;
    }

    @Override
    public Paint getPaint() {
        return this.f31437w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f31441y;
    }

    @Override
    public final void h(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.f31437w.getPaint().setAlpha(255);
        this.f31422j0 = false;
        this.f31421i0 = false;
        this.f31418f0 = false;
        this.f31420h0 = false;
        this.f31435u0 = 0L;
        this.f31437w.setProgress(0.0f);
        org.telegram.ui.rl rlVar = this.E;
        if (!this.f31424l0) {
            if (this.f31434t0 == null) {
                try {
                    this.f31434t0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f31434t0;
            if (bitmap != null) {
                rlVar.setImageBitmap(bitmap);
            } else {
                rlVar.setImageResource(R.drawable.icplaceholder);
            }
            this.f31424l0 = true;
            rlVar.animate().cancel();
            rlVar.setAlpha(1.0f);
            rlVar.invalidate();
        }
        this.T = new m11(this.h, this.f31430r);
        this.Q = (qi.n0) ri.e.f47791e.a();
        qi.g0 g0Var = new qi.g0(getContext(), this.f31441y);
        g0Var.f46701c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        g0Var.d = (qi.i0) ri.e.f47795j.a();
        g0Var.f46702e = this.Q;
        g0Var.h = ri.e.h.a();
        g0Var.f46703f = (qi.j0) ri.e.f47792f.a();
        g0Var.f46704g = (qi.k0) ri.e.f47793g.a();
        ri.a aVar = ri.e.f47794i;
        aVar.a();
        g0Var.f46705i = aVar.d;
        n4.l lVar = this.J0;
        g0Var.f46706j = lVar;
        m11 m11Var = this.T;
        g0Var.f46707k = m11Var;
        g0Var.f46708l = new ew(this, 6);
        if (g0Var.d != null) {
            if (g0Var.f46702e != null) {
                if (g0Var.h > 0) {
                    if (g0Var.f46703f != null) {
                        if (g0Var.f46704g != null) {
                            if (lVar != null) {
                                if (m11Var != null) {
                                    this.P = new qi.p0(g0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    qi.p0 p0Var = this.P;
                                    p0Var.getClass();
                                    qi.p0.v();
                                    if (p0Var.X == 1) {
                                        try {
                                            p0Var.f46863n.b("start requested");
                                            p0Var.c(true);
                                            p0Var.y(2);
                                            p0Var.f46862m.C(p0Var.R, 0L, p0Var.f46866q);
                                        } catch (Exception e7) {
                                            p0Var.j(e7);
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
        qi.o0 o0Var;
        qi.p0 p0Var = this.P;
        if (p0Var != null && (o0Var = this.R) != null) {
            int i10 = o0Var.f46809a;
            if (i10 == 3) {
                if (p0Var != null && o0Var != null && i10 == 3) {
                    u(2);
                    this.P.r();
                }
            } else if (i10 == 5) {
                this.U = null;
                this.f31419g0 = true;
                this.f31420h0 = false;
                qi.p0.v();
                if (p0Var.X == 5 && p0Var.I - p0Var.H < p0Var.f46865p) {
                    p0Var.N++;
                    p0Var.f46863n.b("resume requested: trim=" + p0Var.H + ".." + p0Var.I + ", sourceDurationMs=" + p0Var.F);
                    p0Var.t();
                    p0Var.y(6);
                    p0Var.f46860k.execute(new ci.t1(p0Var, p0Var.n(), p0Var.R, p0Var.Q, p0Var.S));
                }
            }
        }
    }

    public final void o() {
        qi.o0 o0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P != null && (o0Var = this.R) != null && (videoEditedInfo = this.U) != null) {
            long j3 = o0Var.f46810b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j10 = this.U.endTime;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            qi.p0 p0Var = this.P;
            p0Var.getClass();
            qi.p0.v();
            if (p0Var.X == 5) {
                long max2 = Math.max(0L, Math.min(p0Var.F, max));
                long max3 = Math.max(max2, Math.min(p0Var.F, j3));
                if (max3 - max2 >= Math.min(800L, p0Var.F)) {
                    p0Var.H = max2;
                    p0Var.I = max3;
                    i2.f0 f0Var = p0Var.T;
                    if (f0Var != null) {
                        f0Var.W0(5, max2);
                    }
                    p0Var.d.getClass();
                    p0Var.q();
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
            t60 t60Var = this.v;
            t60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            t60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ci.w2 w2Var = this.J;
        w2Var.f6182b.measure(makeMeasureSpec, makeMeasureSpec2);
        w2Var.f6183c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public final Bitmap p(Bitmap bitmap) {
        s60 s60Var = this.f31441y;
        if (s60Var.getWidth() > 0 && s60Var.getHeight() > 0) {
            Matrix matrix = this.L;
            s60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / s60Var.getWidth();
                float height = bitmap.getHeight() / s60Var.getHeight();
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
        if (!this.f31426n0 && this.f31413b0 == null) {
            return;
        }
        this.f31433s0++;
        ValueAnimator valueAnimator = this.f31413b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f31413b0.cancel();
            this.f31413b0 = null;
        }
        FrameLayout frameLayout = this.f31439x;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f31426n0 = false;
        this.f31427o0 = false;
        this.f31428p0 = false;
        this.f31429q0 = false;
        t(false);
    }

    public final VideoEditedInfo r(File file, long j3, l11 l11Var) {
        long j10;
        int i10;
        int i11;
        qi.k0 k0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        if (l11Var == null) {
            j10 = file.length();
        } else {
            j10 = l11Var.f28000a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j10);
        videoEditedInfo.roundVideo = true;
        qi.p0 p0Var = this.P;
        if (p0Var != null && (k0Var = p0Var.f46869t) != null) {
            i10 = k0Var.f46795a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        qi.n0 n0Var = this.Q;
        if (n0Var == null) {
            i11 = 480;
        } else {
            i11 = n0Var.f46808a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (l11Var != null) {
            videoEditedInfo.file = l11Var.f28001b;
            videoEditedInfo.encryptedFile = l11Var.f28002c;
            videoEditedInfo.key = l11Var.d;
            videoEditedInfo.iv = l11Var.f28003e;
        }
        return videoEditedInfo;
    }

    public final void s() {
        if (this.B0) {
            this.B0 = false;
            this.f31443z0 = -1;
            this.A0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f31412a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f31442y0, 0.0f);
            this.f31412a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f31412a0.addUpdateListener(new q60(this, 1));
            this.f31412a0.start();
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
        t60 t60Var = this.v;
        t60Var.setAlpha(0.0f);
        t60Var.setScaleX(0.1f);
        t60Var.setScaleY(0.1f);
        t60Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f31437w.getPaint().setAlpha(0);
        try {
            Activity activity = (Activity) getContext();
            if (i10 == 0) {
                activity.getWindow().addFlags(128);
            } else {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
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
        if (this.f31420h0 && i10 == 2) {
            return;
        }
        this.f31420h0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f31425n), Integer.valueOf(i10));
    }

    public final void v(boolean z10) {
        Bitmap bitmap;
        s60 s60Var = this.f31441y;
        if (s60Var.isAvailable() && (bitmap = s60Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = p(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f31434t0;
                    this.f31434t0 = bitmap;
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
                    if (bitmap != this.f31434t0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f31434t0) {
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
        x60 x60Var = this.f24576a;
        if (x60Var != null) {
            ((org.telegram.ui.ve) x60Var).f42768b.f37462vc.a(z10, true);
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
        t60 t60Var = this.v;
        if (z10 && !this.f31423k0) {
            t60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f31438w0 = measuredHeight;
            t60Var.setTranslationY(measuredHeight + this.f31436v0);
        }
        this.f31423k0 = z10;
        View view = this.f31432s;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f31435u0) > 300) {
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
        ofFloat.addUpdateListener(new q60(this, 0));
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
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(t60Var, property, f13);
        float f16 = 0.1f;
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(t60Var, View.SCALE_X, f14);
        if (z10) {
            f16 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(t60Var, View.SCALE_Y, f16);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(t60Var, View.TRANSLATION_X, f7);
        if (this.f31421i0 && z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.I, property, f15), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.W.addListener(new t8(this, 24));
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
        qi.h0 h0Var;
        qi.o0 o0Var = this.R;
        boolean z11 = false;
        if (o0Var != null && o0Var.f46809a == 3 && !o0Var.f46812e && !this.f31426n0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G.setEnabled(z10);
        if (z10 && (h0Var = this.S) != null && h0Var.f46758b != 1) {
            z11 = true;
        }
        this.H.setEnabled(z11);
        z();
    }

    public final void z() {
        qi.o0 o0Var = this.R;
        int i10 = this.O;
        ci.u2 u2Var = this.H;
        if (o0Var != null && o0Var.f46813f) {
            if (this.f31416e0 == null) {
                fk0 fk0Var = new fk0(R.raw.roundcamera_flash_off, i10, i10);
                this.f31416e0 = fk0Var;
                fk0Var.setCallback(u2Var);
            }
            u2Var.setImageDrawable(this.f31416e0);
            return;
        }
        if (this.f31415d0 == null) {
            fk0 fk0Var2 = new fk0(R.raw.roundcamera_flash_on, i10, i10);
            this.f31415d0 = fk0Var2;
            fk0Var2.setCallback(u2Var);
        }
        u2Var.setImageDrawable(this.f31415d0);
    }
}
