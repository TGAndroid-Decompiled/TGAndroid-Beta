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
public final class l60 extends r60 {
    public int A0;
    public boolean B0;
    public boolean C0;
    public float D0;
    public final org.telegram.ui.el E;
    public int E0;
    public final LinearLayout F;
    public long F0;
    public final ei.q2 G;
    public boolean G0;
    public final ei.q2 H;
    public boolean H0;
    public final ImageView I;
    public final hq I0;
    public final ei.s2 J;
    public final l2.f J0;
    public final int[] K;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public si.s0 P;
    public si.q0 Q;
    public si.r0 R;
    public si.k0 S;
    public a11 T;
    public VideoEditedInfo U;
    public k60 V;
    public AnimatorSet W;
    public ValueAnimator f28030a0;
    public ValueAnimator f28031b0;
    public final vj0 f28032c0;
    public vj0 f28033d0;
    public vj0 f28034e0;
    public final y50 f28035f;
    public boolean f28036f0;
    public boolean f28037g0;
    public final int h;
    public boolean f28038h0;
    public boolean f28039i0;
    public boolean f28040j0;
    public boolean f28041k0;
    public boolean f28042l0;
    public boolean m0;
    public final int f28043n;
    public boolean f28044n0;
    public boolean f28045o0;
    public boolean f28046p0;
    public boolean f28047q0;
    public final boolean f28048r;
    public long f28049r0;
    public final View f28050s;
    public int f28051s0;
    public Bitmap f28052t0;
    public long f28053u0;
    public final j60 v;
    public float f28054v0;
    public final vm0 f28055w;
    public float f28056w0;
    public final FrameLayout f28057x;
    public float f28058x0;
    public final i60 f28059y;
    public float f28060y0;
    public int f28061z0;

    public l60(Activity activity, y50 y50Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.f28061z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        this.I0 = new hq(this, 25);
        this.J0 = new l2.f(this, 10);
        this.f28035f = y50Var;
        this.f28043n = y50Var.getClassGuid();
        this.f28048r = y50Var.x();
        this.f28050s = y50Var.getFragmentView();
        setWillNotDraw(false);
        ei.s2 s2Var = new ei.s2(activity, null, this, null);
        this.J = s2Var;
        s2Var.f9777o = 0.5f;
        s2Var.f9776n = ei.s2.f(0.5f);
        s2Var.g();
        addView(s2Var.f9767b, w7.z5.e(-1, -1, 119));
        j60 j60Var = new j60(this, activity);
        this.v = j60Var;
        vm0 vm0Var = new vm0(activity);
        this.f28055w = vm0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f28057x = frameLayout;
        i60 i60Var = new i60(this, activity, 0);
        i60Var.setOpaque(true);
        i60Var.setClickable(true);
        i60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        i60Var.setOutlineProvider(new ci.o1(13));
        i60Var.setClipToOutline(true);
        this.f28059y = i60Var;
        frameLayout.addView(i60Var, w7.z5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.el elVar = new org.telegram.ui.el(this, activity, paint);
        this.E = elVar;
        elVar.setOutlineProvider(new ci.o1(12));
        elVar.setClipToOutline(true);
        frameLayout.addView(elVar, w7.z5.e(-1, -1, 119));
        vm0Var.addView(frameLayout, w7.z5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        j60Var.addView(vm0Var, w7.z5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(j60Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(s2Var.f9768c, w7.z5.e(-1, -1, 119));
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
            public final l60 f26775b;

            {
                this.f26775b = this;
            }

            @Override
            public final void onClick(View view) {
                si.r0 r0Var;
                si.k0 k0Var;
                boolean z10;
                si.r0 r0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        l60 l60Var = this.f26775b;
                        si.s0 s0Var = l60Var.P;
                        if (s0Var != null && (r0Var = l60Var.R) != null && (k0Var = l60Var.S) != null && r0Var.f46758a == 3 && !r0Var.e && !l60Var.f28044n0) {
                            si.l0 l0Var = k0Var.f46702a;
                            si.l0 l0Var2 = si.l0.f46707a;
                            if (l0Var == l0Var2) {
                                l0Var2 = si.l0.f46708b;
                            }
                            s0Var.getClass();
                            si.s0.t();
                            int i12 = s0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (s0Var.f46774p != l0Var2) {
                                    s0Var.f46771m.b("camera facing requested: " + s0Var.f46774p + " -> " + l0Var2 + ", state=" + r4.c.w(s0Var.W));
                                    s0Var.f46774p = l0Var2;
                                    int i13 = s0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        s0Var.e();
                                        si.j jVar = s0Var.f46770l;
                                        jVar.F = l0Var2;
                                        Handler handler = jVar.f46659n;
                                        if (jVar.V && handler != null) {
                                            handler.post(new p2.b(23, jVar, l0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        s0Var.f46780w = z10;
                                    }
                                    s0Var.n();
                                    s0Var.o();
                                }
                                l60Var.f28032c0.M(0);
                                l60Var.f28032c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        l60 l60Var2 = this.f26775b;
                        si.s0 s0Var2 = l60Var2.P;
                        if (s0Var2 != null && (r0Var2 = l60Var2.R) != null && l60Var2.S != null) {
                            boolean z11 = !r0Var2.f46761f;
                            si.j jVar2 = s0Var2.f46770l;
                            si.s0.t();
                            if (s0Var2.W == 3 && !s0Var2.f46780w && (i11 = s0Var2.X) != 1) {
                                s0Var2.f46779u = z11;
                                if (i11 == 3) {
                                    s0Var2.u(z11);
                                    jVar2.T(false);
                                } else {
                                    s0Var2.u(false);
                                    jVar2.T(z11);
                                }
                                s0Var2.o();
                                l60Var2.z();
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
            public final l60 f26775b;

            {
                this.f26775b = this;
            }

            @Override
            public final void onClick(View view) {
                si.r0 r0Var;
                si.k0 k0Var;
                boolean z10;
                si.r0 r0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        l60 l60Var = this.f26775b;
                        si.s0 s0Var = l60Var.P;
                        if (s0Var != null && (r0Var = l60Var.R) != null && (k0Var = l60Var.S) != null && r0Var.f46758a == 3 && !r0Var.e && !l60Var.f28044n0) {
                            si.l0 l0Var = k0Var.f46702a;
                            si.l0 l0Var2 = si.l0.f46707a;
                            if (l0Var == l0Var2) {
                                l0Var2 = si.l0.f46708b;
                            }
                            s0Var.getClass();
                            si.s0.t();
                            int i12 = s0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (s0Var.f46774p != l0Var2) {
                                    s0Var.f46771m.b("camera facing requested: " + s0Var.f46774p + " -> " + l0Var2 + ", state=" + r4.c.w(s0Var.W));
                                    s0Var.f46774p = l0Var2;
                                    int i13 = s0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        s0Var.e();
                                        si.j jVar = s0Var.f46770l;
                                        jVar.F = l0Var2;
                                        Handler handler = jVar.f46659n;
                                        if (jVar.V && handler != null) {
                                            handler.post(new p2.b(23, jVar, l0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        s0Var.f46780w = z10;
                                    }
                                    s0Var.n();
                                    s0Var.o();
                                }
                                l60Var.f28032c0.M(0);
                                l60Var.f28032c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        l60 l60Var2 = this.f26775b;
                        si.s0 s0Var2 = l60Var2.P;
                        if (s0Var2 != null && (r0Var2 = l60Var2.R) != null && l60Var2.S != null) {
                            boolean z11 = !r0Var2.f46761f;
                            si.j jVar2 = s0Var2.f46770l;
                            si.s0.t();
                            if (s0Var2.W == 3 && !s0Var2.f46780w && (i11 = s0Var2.X) != 1) {
                                s0Var2.f46779u = z11;
                                if (i11 == 3) {
                                    s0Var2.u(z11);
                                    jVar2.T(false);
                                } else {
                                    s0Var2.u(false);
                                    jVar2.T(z11);
                                }
                                s0Var2.o();
                                l60Var2.z();
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
        vj0 vj0Var = new vj0(R.raw.roundcamera_flip, dp, dp);
        this.f28032c0 = vj0Var;
        vj0Var.setCallback(imageView);
        vj0Var.M(vj0Var.e[0] - 1);
        imageView.setImageDrawable(vj0Var);
        z();
        if (d6Var != null && !d6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.I = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.z5.e(48, 48, 17));
        i60Var.setOnTouchListener(new rk(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f28049r0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f28049r0);
    }

    private long getCurrentDurationMs() {
        si.r0 r0Var;
        si.s0 s0Var = this.P;
        if (s0Var != null && (r0Var = this.R) != null) {
            if (r0Var.f46758a == 3) {
                return s0Var.j();
            }
            return r0Var.f46759b;
        }
        return 0L;
    }

    public static void l(l60 l60Var) {
        if (l60Var.f28044n0 && l60Var.f28047q0 && l60Var.f28045o0 && l60Var.f28046p0) {
            l60Var.f28044n0 = false;
            FileLog.d("RoundVideo camera flip completed: elapsedMs=" + l60Var.getCameraFlipElapsedMs());
            l60Var.y();
        }
    }

    public static void m(l60 l60Var) {
        org.telegram.ui.el elVar = l60Var.E;
        if (!l60Var.f28042l0) {
            return;
        }
        l60Var.f28042l0 = false;
        elVar.invalidate();
        elVar.animate().cancel();
        elVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.fk fkVar;
        if (z10 != this.G0) {
            this.G0 = z10;
            this.F0 = 0L;
            hq hqVar = this.I0;
            if (z10) {
                zf.h.d().a(30, hqVar);
            } else {
                zf.h.d().f(hqVar);
            }
            if (this.d != z10) {
                this.d = z10;
                p60 p60Var = this.f29851c;
                if (p60Var != null && (fkVar = ((org.telegram.ui.jj) p60Var).f38270a.Y) != null) {
                    fkVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f28035f.getParentActivity();
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
        org.telegram.ui.fk fkVar;
        float f7;
        si.r0 r0Var = this.R;
        if (r0Var != null) {
            long j10 = r0Var.d;
            if (r0Var.f46758a == 3) {
                long min = Math.min(j10, (SystemClock.elapsedRealtime() + r0Var.f46759b) - r0Var.f46760c);
                this.f28053u0 = min;
                this.f28055w.setProgress(((float) min) / ((float) j10));
                p60 p60Var = this.f29851c;
                if (p60Var != null && (fkVar = ((org.telegram.ui.jj) p60Var).f38270a.Y) != null && fkVar.f23967j1) {
                    fkVar.f23961i1 = min;
                    xg xgVar = fkVar.Y0;
                    if (xgVar != null && xgVar.f32413r) {
                        xgVar.h = min;
                        xgVar.invalidate();
                    }
                    ug ugVar = fkVar.l1;
                    if (ugVar != null && ugVar.f30926n) {
                        if (!ugVar.h) {
                            long j11 = ugVar.f30927r;
                            if (j11 >= 0) {
                                if (!ugVar.e) {
                                    long max = Math.max(0L, min - j11) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    ugVar.f30922a = f7;
                                }
                                ugVar.invalidate();
                            }
                        }
                        ugVar.f30927r = min;
                        ugVar.f30922a = 1.0f;
                        ugVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = fkVar.f23973k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f24071n != 1.0f) {
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
        a11 a11Var = this.T;
        if (a11Var != null) {
            a11Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        w(false, false);
    }

    @Override
    public final void b(float f7, int i10) {
        si.r0 r0Var;
        i2.i0 i0Var;
        if (this.P != null && (r0Var = this.R) != null && r0Var.f46758a == 5) {
            o();
            if (i10 == 0) {
                this.P.q();
            } else if (i10 == 1) {
                si.s0 s0Var = this.P;
                s0Var.getClass();
                si.s0.t();
                if (s0Var.W == 5 && (i0Var = s0Var.S) != null) {
                    i0Var.e();
                    s0Var.x(false);
                    l2.f fVar = s0Var.d;
                    s0Var.S.M0();
                    fVar.getClass();
                }
            } else if (i10 == 2) {
                si.s0 s0Var2 = this.P;
                long j10 = f7 * ((float) this.R.f46759b);
                s0Var2.getClass();
                si.s0.t();
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
        ValueAnimator valueAnimator = this.f28030a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        si.s0 s0Var = this.P;
        if (s0Var != null) {
            si.s0.t();
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
                s0Var.f46770l.M();
                s0Var.C = true;
                s0Var.v(10);
                s0Var.m("released");
                s0Var.f46767i.removeCallbacksAndMessages(null);
                s0Var.f46768j.shutdown();
                s0Var.f46769k.shutdown();
            }
            this.P = null;
        }
        a11 a11Var = this.T;
        if (a11Var != null) {
            a11Var.d(true ^ this.f28040j0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        x();
        j60 j60Var = this.v;
        j60Var.setTranslationX(0.0f);
        this.f28056w0 = 0.0f;
        j60Var.setTranslationY(0.0f + this.f28054v0);
        j60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean d() {
        si.r0 r0Var = this.R;
        if (r0Var != null) {
            int i10 = r0Var.f46758a;
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
        this.f28054v0 = f10;
        this.v.setTranslationY(this.f28056w0 + f10);
    }

    @Override
    public final void f(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        si.r0 r0Var;
        si.s0 s0Var = this.P;
        if (s0Var != null && (r0Var = this.R) != null) {
            int i13 = 2;
            if (i10 == 3) {
                if (s0Var != null && r0Var != null && r0Var.f46758a == 3) {
                    u(2);
                    this.P.p();
                }
            } else if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                boolean z11 = false;
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f28043n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.R.f46758a == 3) {
                    u(5);
                } else {
                    o();
                }
                this.V = new k60(j10, i11, i12, z10, j11);
                si.s0 s0Var2 = this.P;
                boolean z12 = this.f28039i0;
                boolean z13 = !z12;
                s0Var2.getClass();
                si.s0.t();
                int i14 = s0Var2.W;
                if (i14 == 3 || i14 == 5) {
                    s0Var2.f46771m.b("finish requested: state=" + r4.c.w(s0Var2.W) + ", includeAudio=" + z13 + ", durationMs=" + s0Var2.j() + ", trim=" + s0Var2.G + ".." + s0Var2.H);
                    s0Var2.f46783z = z13;
                    if (s0Var2.W == 3) {
                        s0Var2.E = s0Var2.j();
                        s0Var2.f46782y = true;
                        s0Var2.e();
                        s0Var2.f46767i.removeCallbacks(s0Var2.T);
                        s0Var2.v(7);
                        boolean Y = s0Var2.f46770l.Y();
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
                    s0Var2.f46768j.execute(new ai.wb(s0Var2, s0Var2.Q, z11, s0Var2.R, z13, i13, s0Var2.P));
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
    public o60 getCameraContainer() {
        return this.v;
    }

    @Override
    public RectF getCameraRect() {
        i60 i60Var = this.f28059y;
        int[] iArr = this.K;
        i60Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], i60Var.getWidth() + i10, i60Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.I;
    }

    @Override
    public Paint getPaint() {
        return this.f28055w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f28059y;
    }

    @Override
    public final void h(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.f28055w.getPaint().setAlpha(255);
        this.f28040j0 = false;
        this.f28039i0 = false;
        this.f28036f0 = false;
        this.f28038h0 = false;
        this.f28053u0 = 0L;
        this.f28055w.setProgress(0.0f);
        org.telegram.ui.el elVar = this.E;
        if (!this.f28042l0) {
            if (this.f28052t0 == null) {
                try {
                    this.f28052t0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f28052t0;
            if (bitmap != null) {
                elVar.setImageBitmap(bitmap);
            } else {
                elVar.setImageResource(R.drawable.icplaceholder);
            }
            this.f28042l0 = true;
            elVar.animate().cancel();
            elVar.setAlpha(1.0f);
            elVar.invalidate();
        }
        this.T = new a11(this.h, this.f28048r);
        this.Q = (si.q0) ti.e.e.a();
        si.j0 j0Var = new si.j0(getContext(), this.f28059y);
        j0Var.f46693c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        j0Var.d = (si.l0) ti.e.f47225j.a();
        j0Var.e = this.Q;
        j0Var.h = ti.e.h.a();
        j0Var.f46694f = (si.m0) ti.e.f47222f.a();
        j0Var.f46695g = (si.n0) ti.e.f47223g.a();
        ti.a aVar = ti.e.f47224i;
        aVar.a();
        j0Var.f46696i = aVar.d;
        l2.f fVar = this.J0;
        j0Var.f46697j = fVar;
        a11 a11Var = this.T;
        j0Var.f46698k = a11Var;
        j0Var.f46699l = new tv(this, 6);
        if (j0Var.d != null) {
            if (j0Var.e != null) {
                if (j0Var.h > 0) {
                    if (j0Var.f46694f != null) {
                        if (j0Var.f46695g != null) {
                            if (fVar != null) {
                                if (a11Var != null) {
                                    this.P = new si.s0(j0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    si.s0 s0Var = this.P;
                                    s0Var.getClass();
                                    si.s0.t();
                                    if (s0Var.W == 1) {
                                        try {
                                            s0Var.f46771m.b("start requested");
                                            s0Var.c(true);
                                            s0Var.v(2);
                                            s0Var.f46770l.X(s0Var.Q, 0L, s0Var.f46774p);
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
        si.r0 r0Var;
        si.s0 s0Var = this.P;
        if (s0Var != null && (r0Var = this.R) != null) {
            int i10 = r0Var.f46758a;
            if (i10 == 3) {
                if (s0Var != null && r0Var != null && i10 == 3) {
                    u(2);
                    this.P.p();
                }
            } else if (i10 == 5) {
                this.U = null;
                this.f28037g0 = true;
                this.f28038h0 = false;
                si.s0.t();
                if (s0Var.W == 5 && s0Var.H - s0Var.G < s0Var.f46773o) {
                    s0Var.M++;
                    s0Var.f46771m.b("resume requested: trim=" + s0Var.G + ".." + s0Var.H + ", sourceDurationMs=" + s0Var.E);
                    s0Var.r();
                    s0Var.v(6);
                    s0Var.f46768j.execute(new ei.s1(s0Var, s0Var.l(), s0Var.Q, s0Var.P, s0Var.R));
                }
            }
        }
    }

    public final void o() {
        si.r0 r0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P != null && (r0Var = this.R) != null && (videoEditedInfo = this.U) != null) {
            long j10 = r0Var.f46759b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j11 = this.U.endTime;
            if (j11 >= 0) {
                j10 = Math.min(j10, j11);
            }
            si.s0 s0Var = this.P;
            s0Var.getClass();
            si.s0.t();
            if (s0Var.W == 5) {
                long max2 = Math.max(0L, Math.min(s0Var.E, max));
                long max3 = Math.max(max2, Math.min(s0Var.E, j10));
                if (max3 - max2 >= Math.min(800L, s0Var.E)) {
                    s0Var.G = max2;
                    s0Var.H = max3;
                    i2.i0 i0Var = s0Var.S;
                    if (i0Var != null) {
                        i0Var.Z0(5, max2);
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
            j60 j60Var = this.v;
            j60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            j60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ei.s2 s2Var = this.J;
        s2Var.f9767b.measure(makeMeasureSpec, makeMeasureSpec2);
        s2Var.f9768c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public final Bitmap p(Bitmap bitmap) {
        i60 i60Var = this.f28059y;
        if (i60Var.getWidth() > 0 && i60Var.getHeight() > 0) {
            Matrix matrix = this.L;
            i60Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / i60Var.getWidth();
                float height = bitmap.getHeight() / i60Var.getHeight();
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
        if (!this.f28044n0 && this.f28031b0 == null) {
            return;
        }
        this.f28051s0++;
        ValueAnimator valueAnimator = this.f28031b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f28031b0.cancel();
            this.f28031b0 = null;
        }
        FrameLayout frameLayout = this.f28057x;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f28044n0 = false;
        this.f28045o0 = false;
        this.f28046p0 = false;
        this.f28047q0 = false;
        t(false);
    }

    public final VideoEditedInfo r(File file, long j10, z01 z01Var) {
        long j11;
        int i10;
        int i11;
        si.n0 n0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j10;
        if (z01Var == null) {
            j11 = file.length();
        } else {
            j11 = z01Var.f32796a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j11);
        videoEditedInfo.roundVideo = true;
        si.s0 s0Var = this.P;
        if (s0Var != null && (n0Var = s0Var.f46777s) != null) {
            i10 = n0Var.f46740a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        si.q0 q0Var = this.Q;
        if (q0Var == null) {
            i11 = 480;
        } else {
            i11 = q0Var.f46755a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (z01Var != null) {
            videoEditedInfo.file = z01Var.f32797b;
            videoEditedInfo.encryptedFile = z01Var.f32798c;
            videoEditedInfo.key = z01Var.d;
            videoEditedInfo.iv = z01Var.e;
        }
        return videoEditedInfo;
    }

    public final void s() {
        if (this.B0) {
            this.B0 = false;
            this.f28061z0 = -1;
            this.A0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f28030a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f28060y0, 0.0f);
            this.f28030a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f28030a0.addUpdateListener(new g60(this, 1));
            this.f28030a0.start();
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
        j60 j60Var = this.v;
        j60Var.setAlpha(0.0f);
        j60Var.setScaleX(0.1f);
        j60Var.setScaleY(0.1f);
        j60Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f28055w.getPaint().setAlpha(0);
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
        org.telegram.ui.el elVar = this.E;
        elVar.animate().cancel();
        if (z10) {
            elVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            elVar.setAlpha(0.0f);
        }
    }

    public final void u(int i10) {
        if (this.f28038h0 && i10 == 2) {
            return;
        }
        this.f28038h0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f28043n), Integer.valueOf(i10));
    }

    public final void v(boolean z10) {
        Bitmap bitmap;
        i60 i60Var = this.f28059y;
        if (i60Var.isAvailable() && (bitmap = i60Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = p(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f28052t0;
                    this.f28052t0 = bitmap;
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
                    if (bitmap != this.f28052t0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f28052t0) {
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
        n60 n60Var = this.f29849a;
        if (n60Var != null) {
            ((org.telegram.ui.pe) n60Var).f40199b.f40899wc.a(z10, true);
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
        j60 j60Var = this.v;
        if (z10 && !this.f28041k0) {
            j60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f28056w0 = measuredHeight;
            j60Var.setTranslationY(measuredHeight + this.f28054v0);
        }
        this.f28041k0 = z10;
        View view = this.f28050s;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f28053u0) > 300) {
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
        ofFloat.addUpdateListener(new g60(this, 0));
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
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(j60Var, property, f13);
        float f16 = 0.1f;
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(j60Var, View.SCALE_X, f14);
        if (z10) {
            f16 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(j60Var, View.SCALE_Y, f16);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(j60Var, View.TRANSLATION_X, f7);
        if (this.f28039i0 && z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.I, property, f15), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.W.addListener(new org.telegram.ui.nq(this, 29));
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
        si.k0 k0Var;
        si.r0 r0Var = this.R;
        boolean z11 = false;
        if (r0Var != null && r0Var.f46758a == 3 && !r0Var.e && !this.f28044n0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G.setEnabled(z10);
        if (z10 && (k0Var = this.S) != null && k0Var.f46703b != 1) {
            z11 = true;
        }
        this.H.setEnabled(z11);
        z();
    }

    public final void z() {
        si.r0 r0Var = this.R;
        int i10 = this.O;
        ei.q2 q2Var = this.H;
        if (r0Var != null && r0Var.f46761f) {
            if (this.f28034e0 == null) {
                vj0 vj0Var = new vj0(R.raw.roundcamera_flash_off, i10, i10);
                this.f28034e0 = vj0Var;
                vj0Var.setCallback(q2Var);
            }
            q2Var.setImageDrawable(this.f28034e0);
            return;
        }
        if (this.f28033d0 == null) {
            vj0 vj0Var2 = new vj0(R.raw.roundcamera_flash_on, i10, i10);
            this.f28033d0 = vj0Var2;
            vj0Var2.setCallback(q2Var);
        }
        q2Var.setImageDrawable(this.f28033d0);
    }
}
