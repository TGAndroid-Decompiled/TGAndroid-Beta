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
    public final l2.g C0;
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
    public z01 T;
    public VideoEditedInfo U;
    public d60 V;
    public AnimatorSet W;
    public ValueAnimator f25946a0;
    public final kj0 f25947b0;
    public kj0 f25948c0;
    public kj0 f25949d0;
    public boolean f25950e0;
    public final r50 f25951f;
    public boolean f25952f0;
    public boolean f25953g0;
    public final int h;
    public boolean f25954h0;
    public boolean f25955i0;
    public boolean f25956j0;
    public boolean f25957k0;
    public boolean f25958l0;
    public Bitmap m0;
    public final int f25959n;
    public long f25960n0;
    public float f25961o0;
    public float f25962p0;
    public float f25963q0;
    public final boolean f25964r;
    public float f25965r0;
    public final View f25966s;
    public int f25967s0;
    public int f25968t0;
    public boolean f25969u0;
    public final c60 v;
    public boolean f25970v0;
    public final om0 f25971w;
    public float f25972w0;
    public final FrameLayout f25973x;
    public int f25974x0;
    public final b60 f25975y;
    public long f25976y0;
    public boolean f25977z0;

    public e60(Activity activity, r50 r50Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.f25967s0 = -1;
        this.f25968t0 = -1;
        this.f25972w0 = Float.NaN;
        this.B0 = new aq(this, 25);
        this.C0 = new l2.g(this, 9);
        this.f25951f = r50Var;
        this.f25959n = r50Var.getClassGuid();
        this.f25964r = r50Var.v();
        this.f25966s = r50Var.getFragmentView();
        setWillNotDraw(false);
        ci.x2 x2Var = new ci.x2(activity, null, this, null);
        this.J = x2Var;
        x2Var.f6277o = 0.5f;
        x2Var.f6276n = ci.x2.f(0.5f);
        x2Var.g();
        addView(x2Var.f6266b, w7.z5.e(-1, -1, 119));
        c60 c60Var = new c60(this, activity);
        this.v = c60Var;
        om0 om0Var = new om0(activity);
        this.f25971w = om0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f25973x = frameLayout;
        b60 b60Var = new b60(this, activity, 0);
        b60Var.setOpaque(true);
        b60Var.setClickable(true);
        b60Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        b60Var.setOutlineProvider(new ai.k2(13));
        b60Var.setClipToOutline(true);
        this.f25975y = b60Var;
        frameLayout.addView(b60Var, w7.z5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, activity, paint);
        this.E = ilVar;
        ilVar.setOutlineProvider(new ai.k2(12));
        ilVar.setClipToOutline(true);
        frameLayout.addView(ilVar, w7.z5.e(-1, -1, 119));
        om0Var.addView(frameLayout, w7.z5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        c60Var.addView(om0Var, w7.z5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(c60Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(x2Var.f6267c, w7.z5.e(-1, -1, 119));
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
            public final e60 f24476b;

            {
                this.f24476b = this;
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
                        e60 e60Var = this.f24476b;
                        ki.s0 s0Var = e60Var.P;
                        if (s0Var != null && (r0Var = e60Var.R) != null && (k0Var = e60Var.S) != null && r0Var.f15036a == 3 && !r0Var.f15039e) {
                            ki.l0 l0Var = k0Var.f14957a;
                            ki.l0 l0Var2 = ki.l0.f14983a;
                            if (l0Var == l0Var2) {
                                l0Var2 = ki.l0.f14984b;
                            }
                            s0Var.getClass();
                            ki.s0.t();
                            int i12 = s0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (s0Var.f15057p != l0Var2) {
                                    s0Var.f15054m.b("camera facing requested: " + s0Var.f15057p + " -> " + l0Var2 + ", state=" + hg.c.B(s0Var.W));
                                    s0Var.f15057p = l0Var2;
                                    int i13 = s0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        s0Var.e();
                                        ki.i iVar = s0Var.f15053l;
                                        iVar.C = l0Var2;
                                        Handler handler = iVar.f14916n;
                                        if (iVar.S && handler != null) {
                                            handler.post(new gg.x1(27, iVar, l0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        s0Var.f15063w = z10;
                                    }
                                    s0Var.n();
                                    s0Var.o();
                                }
                                e60Var.f25947b0.M(0);
                                e60Var.f25947b0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e60 e60Var2 = this.f24476b;
                        ki.s0 s0Var2 = e60Var2.P;
                        if (s0Var2 != null && (r0Var2 = e60Var2.R) != null && e60Var2.S != null) {
                            boolean z11 = !r0Var2.f15040f;
                            ki.i iVar2 = s0Var2.f15053l;
                            ki.s0.t();
                            if (s0Var2.W == 3 && !s0Var2.f15063w && (i11 = s0Var2.X) != 1) {
                                s0Var2.f15062u = z11;
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
        linearLayout.addView((View) imageView2, w7.z5.n(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final e60 f24476b;

            {
                this.f24476b = this;
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
                        e60 e60Var = this.f24476b;
                        ki.s0 s0Var = e60Var.P;
                        if (s0Var != null && (r0Var = e60Var.R) != null && (k0Var = e60Var.S) != null && r0Var.f15036a == 3 && !r0Var.f15039e) {
                            ki.l0 l0Var = k0Var.f14957a;
                            ki.l0 l0Var2 = ki.l0.f14983a;
                            if (l0Var == l0Var2) {
                                l0Var2 = ki.l0.f14984b;
                            }
                            s0Var.getClass();
                            ki.s0.t();
                            int i12 = s0Var.W;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (s0Var.f15057p != l0Var2) {
                                    s0Var.f15054m.b("camera facing requested: " + s0Var.f15057p + " -> " + l0Var2 + ", state=" + hg.c.B(s0Var.W));
                                    s0Var.f15057p = l0Var2;
                                    int i13 = s0Var.W;
                                    if (i13 == 3 || i13 == 2) {
                                        s0Var.e();
                                        ki.i iVar = s0Var.f15053l;
                                        iVar.C = l0Var2;
                                        Handler handler = iVar.f14916n;
                                        if (iVar.S && handler != null) {
                                            handler.post(new gg.x1(27, iVar, l0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        s0Var.f15063w = z10;
                                    }
                                    s0Var.n();
                                    s0Var.o();
                                }
                                e60Var.f25947b0.M(0);
                                e60Var.f25947b0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e60 e60Var2 = this.f24476b;
                        ki.s0 s0Var2 = e60Var2.P;
                        if (s0Var2 != null && (r0Var2 = e60Var2.R) != null && e60Var2.S != null) {
                            boolean z11 = !r0Var2.f15040f;
                            ki.i iVar2 = s0Var2.f15053l;
                            ki.s0.t();
                            if (s0Var2.W == 3 && !s0Var2.f15063w && (i11 = s0Var2.X) != 1) {
                                s0Var2.f15062u = z11;
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
        kj0 kj0Var = new kj0(R.raw.roundcamera_flip, dp, dp);
        this.f25947b0 = kj0Var;
        kj0Var.setCallback(imageView);
        kj0Var.M(kj0Var.f28130e[0] - 1);
        imageView.setImageDrawable(kj0Var);
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
        addView(imageView3, w7.z5.e(48, 48, 17));
        b60Var.setOnTouchListener(new yr(this, 1));
        super.setVisibility(4);
    }

    private long getCurrentDurationMs() {
        ki.r0 r0Var;
        ki.s0 s0Var = this.P;
        if (s0Var != null && (r0Var = this.R) != null) {
            if (r0Var.f15036a == 3) {
                return s0Var.j();
            }
            return r0Var.f15037b;
        }
        return 0L;
    }

    public static void k(e60 e60Var) {
        boolean z10;
        ki.k0 k0Var;
        ki.r0 r0Var = e60Var.R;
        boolean z11 = false;
        if (r0Var != null && r0Var.f15036a == 3 && !r0Var.f15039e) {
            z10 = true;
        } else {
            z10 = false;
        }
        e60Var.G.setEnabled(z10);
        ci.v2 v2Var = e60Var.H;
        if (z10 && (k0Var = e60Var.S) != null && k0Var.f14958b != 1) {
            z11 = true;
        }
        v2Var.setEnabled(z11);
        e60Var.v();
    }

    public static void l(e60 e60Var) {
        org.telegram.ui.il ilVar = e60Var.E;
        if (!e60Var.f25957k0) {
            return;
        }
        e60Var.f25957k0 = false;
        ilVar.invalidate();
        ilVar.animate().cancel();
        ilVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.jk jkVar;
        if (z10 != this.f25977z0) {
            this.f25977z0 = z10;
            this.f25976y0 = 0L;
            aq aqVar = this.B0;
            if (z10) {
                yf.h.d().a(30, aqVar);
            } else {
                yf.h.d().f(aqVar);
            }
            if (this.d != z10) {
                this.d = z10;
                i60 i60Var = this.f27974c;
                if (i60Var != null && (jkVar = ((org.telegram.ui.oj) i60Var).f39209a.W) != null) {
                    jkVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f25951f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ci.x2 x2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.f25972w0)) {
                this.f25972w0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            x2Var.c(null);
        } else {
            if (!Float.isNaN(this.f25972w0)) {
                attributes.screenBrightness = this.f25972w0;
                this.f25972w0 = Float.NaN;
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
        z01 z01Var = this.T;
        if (z01Var != null) {
            z01Var.d(true);
        }
        this.T = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        t(false, false);
    }

    @Override
    public final void b(float f7, int i10) {
        ki.r0 r0Var;
        i2.f0 f0Var;
        if (this.P != null && (r0Var = this.R) != null && r0Var.f15036a == 5) {
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
                    l2.g gVar = s0Var.d;
                    s0Var.S.J0();
                    gVar.getClass();
                }
            } else if (i10 == 2) {
                ki.s0 s0Var2 = this.P;
                long j3 = f7 * ((float) this.R.f15037b);
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
        ValueAnimator valueAnimator = this.f25946a0;
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
                s0Var.f15053l.s();
                s0Var.C = true;
                s0Var.v(10);
                s0Var.m("released");
                s0Var.f15050i.removeCallbacksAndMessages(null);
                s0Var.f15051j.shutdown();
                s0Var.f15052k.shutdown();
            }
            this.P = null;
        }
        z01 z01Var = this.T;
        if (z01Var != null) {
            z01Var.d(true ^ this.f25955i0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        u();
        c60 c60Var = this.v;
        c60Var.setTranslationX(0.0f);
        this.f25962p0 = 0.0f;
        c60Var.setTranslationY(0.0f + this.f25961o0);
        c60Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean d() {
        ki.r0 r0Var = this.R;
        if (r0Var != null) {
            int i10 = r0Var.f15036a;
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
        this.f25961o0 = f10;
        this.v.setTranslationY(this.f25962p0 + f10);
    }

    @Override
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        ki.r0 r0Var;
        boolean z11;
        int i13;
        ki.s0 s0Var = this.P;
        if (s0Var != null && (r0Var = this.R) != null) {
            if (i10 == 3) {
                if (s0Var != null && r0Var != null && r0Var.f15036a == 3) {
                    r(2);
                    this.P.p();
                }
            } else if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f25959n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.R.f15036a == 3) {
                    r(5);
                } else {
                    n();
                }
                this.V = new d60(j3, i11, i12, z10, j10);
                ki.s0 s0Var2 = this.P;
                boolean z12 = this.f25954h0;
                boolean z13 = !z12;
                s0Var2.getClass();
                ki.s0.t();
                int i14 = s0Var2.W;
                if (i14 == 3 || i14 == 5) {
                    s0Var2.f15054m.b("finish requested: state=" + hg.c.B(s0Var2.W) + ", includeAudio=" + z13 + ", durationMs=" + s0Var2.j() + ", trim=" + s0Var2.G + ".." + s0Var2.H);
                    s0Var2.f15066z = z13;
                    if (s0Var2.W == 3) {
                        s0Var2.E = s0Var2.j();
                        s0Var2.f15065y = true;
                        s0Var2.e();
                        s0Var2.f15050i.removeCallbacks(s0Var2.T);
                        s0Var2.v(7);
                        boolean D = s0Var2.f15053l.D();
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
                    s0Var2.f15051j.execute(new ki.g0(s0Var2, s0Var2.Q, z11, s0Var2.R, z13, i13, s0Var2.P));
                }
            }
        }
    }

    @Override
    public final void g(ah.c cVar, org.telegram.ui.hj hjVar) {
        View view = this.F;
        ch.d c10 = cVar.c(view, hjVar, false);
        c10.x(AndroidUtilities.dp(6.0f));
        c10.y(AndroidUtilities.dp(21.0f));
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
        b60 b60Var = this.f25975y;
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
        return this.f25971w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f25975y;
    }

    @Override
    public final void h(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.f25971w.getPaint().setAlpha(255);
        this.f25955i0 = false;
        this.f25954h0 = false;
        this.f25950e0 = false;
        this.f25953g0 = false;
        this.f25960n0 = 0L;
        this.f25971w.setProgress(0.0f);
        org.telegram.ui.il ilVar = this.E;
        if (!this.f25957k0) {
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
            this.f25957k0 = true;
            ilVar.animate().cancel();
            ilVar.setAlpha(1.0f);
            ilVar.invalidate();
        }
        this.T = new z01(this.h, this.f25964r);
        this.Q = (ki.q0) ri.e.f46452c.a();
        ki.j0 j0Var = new ki.j0(getContext(), this.f25975y);
        j0Var.f14947c = new File(ApplicationLoader.getFilesDirFixed(), "cache");
        j0Var.d = (ki.l0) ri.e.h.a();
        j0Var.f14948e = this.Q;
        j0Var.h = ri.e.f46454f.a();
        j0Var.f14949f = (ki.m0) ri.e.d.a();
        j0Var.f14950g = (ki.n0) ri.e.f46453e.a();
        ri.a aVar = ri.e.f46455g;
        aVar.a();
        j0Var.f14951i = aVar.d;
        l2.g gVar = this.C0;
        j0Var.f14952j = gVar;
        z01 z01Var = this.T;
        j0Var.f14953k = z01Var;
        j0Var.f14954l = new pv(this, 6);
        if (j0Var.d != null) {
            if (j0Var.f14948e != null) {
                if (j0Var.h > 0) {
                    if (j0Var.f14949f != null) {
                        if (j0Var.f14950g != null) {
                            if (gVar != null) {
                                if (z01Var != null) {
                                    this.P = new ki.s0(j0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    ki.s0 s0Var = this.P;
                                    s0Var.getClass();
                                    ki.s0.t();
                                    if (s0Var.W == 1) {
                                        try {
                                            s0Var.f15054m.b("start requested");
                                            s0Var.c(true);
                                            s0Var.v(2);
                                            s0Var.f15053l.C(s0Var.Q, 0L, s0Var.f15057p);
                                        } catch (Exception e7) {
                                            s0Var.h(e7);
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
            int i10 = r0Var.f15036a;
            if (i10 == 3) {
                if (s0Var != null && r0Var != null && i10 == 3) {
                    r(2);
                    this.P.p();
                }
            } else if (i10 == 5) {
                this.U = null;
                this.f25952f0 = true;
                this.f25953g0 = false;
                ki.s0.t();
                if (s0Var.W == 5 && s0Var.H - s0Var.G < s0Var.f15056o) {
                    s0Var.M++;
                    s0Var.f15054m.b("resume requested: trim=" + s0Var.G + ".." + s0Var.H + ", sourceDurationMs=" + s0Var.E);
                    s0Var.r();
                    s0Var.v(6);
                    s0Var.f15051j.execute(new ci.u1(s0Var, s0Var.l(), s0Var.Q, s0Var.P, s0Var.R));
                }
            }
        }
    }

    public final void n() {
        ki.r0 r0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.P != null && (r0Var = this.R) != null && (videoEditedInfo = this.U) != null) {
            long j3 = r0Var.f15037b;
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
        b60 b60Var = this.f25975y;
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
        if (this.f25974x0 != i12) {
            this.f25974x0 = i12;
            c60 c60Var = this.v;
            c60Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            c60Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ci.x2 x2Var = this.J;
        x2Var.f6266b.measure(makeMeasureSpec, makeMeasureSpec2);
        x2Var.f6267c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public final VideoEditedInfo p(File file, long j3, y01 y01Var) {
        long j10;
        int i10;
        int i11;
        ki.n0 n0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        if (y01Var == null) {
            j10 = file.length();
        } else {
            j10 = y01Var.f33024a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j10);
        videoEditedInfo.roundVideo = true;
        ki.s0 s0Var = this.P;
        if (s0Var != null && (n0Var = s0Var.f15060s) != null) {
            i10 = n0Var.f14996a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        ki.q0 q0Var = this.Q;
        if (q0Var == null) {
            i11 = 480;
        } else {
            i11 = q0Var.f15032a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (y01Var != null) {
            videoEditedInfo.file = y01Var.f33025b;
            videoEditedInfo.encryptedFile = y01Var.f33026c;
            videoEditedInfo.key = y01Var.d;
            videoEditedInfo.iv = y01Var.f33027e;
        }
        return videoEditedInfo;
    }

    public final void q() {
        if (this.f25969u0) {
            this.f25969u0 = false;
            this.f25967s0 = -1;
            this.f25968t0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f25946a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f25965r0, 0.0f);
            this.f25946a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f25946a0.addUpdateListener(new z50(this, 1));
            this.f25946a0.start();
        }
    }

    public final void r(int i10) {
        if (this.f25953g0 && i10 == 2) {
            return;
        }
        this.f25953g0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f25959n), Integer.valueOf(i10));
    }

    public final void s(boolean z10) {
        Bitmap bitmap;
        b60 b60Var = this.f25975y;
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
        this.f25971w.getPaint().setAlpha(0);
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

    public final void t(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        g60 g60Var = this.f27972a;
        if (g60Var != null) {
            ((org.telegram.ui.re) g60Var).f40108b.f43507sc.a(z10, true);
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
        if (z10 && !this.f25956j0) {
            c60Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f25962p0 = measuredHeight;
            c60Var.setTranslationY(measuredHeight + this.f25961o0);
        }
        this.f25956j0 = z10;
        View view = this.f25966s;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f25960n0) > 300) {
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
        if (this.f25954h0 && z10) {
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
        if (!this.f25970v0) {
            return;
        }
        this.f25970v0 = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public final void v() {
        ki.r0 r0Var = this.R;
        int i10 = this.O;
        ci.v2 v2Var = this.H;
        if (r0Var != null && r0Var.f15040f) {
            if (this.f25949d0 == null) {
                kj0 kj0Var = new kj0(R.raw.roundcamera_flash_off, i10, i10);
                this.f25949d0 = kj0Var;
                kj0Var.setCallback(v2Var);
            }
            v2Var.setImageDrawable(this.f25949d0);
            return;
        }
        if (this.f25948c0 == null) {
            kj0 kj0Var2 = new kj0(R.raw.roundcamera_flash_on, i10, i10);
            this.f25948c0 = kj0Var2;
            kj0Var2.setCallback(v2Var);
        }
        v2Var.setImageDrawable(this.f25948c0);
    }

    public final void w() {
        org.telegram.ui.jk jkVar;
        float f7;
        ki.r0 r0Var = this.R;
        if (r0Var != null) {
            long j3 = r0Var.d;
            if (r0Var.f15036a == 3) {
                long min = Math.min(j3, (SystemClock.elapsedRealtime() + r0Var.f15037b) - r0Var.f15038c);
                this.f25960n0 = min;
                this.f25971w.setProgress(((float) min) / ((float) j3));
                i60 i60Var = this.f27974c;
                if (i60Var != null && (jkVar = ((org.telegram.ui.oj) i60Var).f39209a.W) != null && jkVar.f23911j1) {
                    jkVar.f23905i1 = min;
                    yg ygVar = jkVar.Y0;
                    if (ygVar != null && ygVar.f33155r) {
                        ygVar.h = min;
                        ygVar.invalidate();
                    }
                    vg vgVar = jkVar.l1;
                    if (vgVar != null && vgVar.f31690n) {
                        if (!vgVar.h) {
                            long j10 = vgVar.f31691r;
                            if (j10 >= 0) {
                                if (!vgVar.f31688e) {
                                    long max = Math.max(0L, min - j10) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    vgVar.f31685a = f7;
                                }
                                vgVar.invalidate();
                            }
                        }
                        vgVar.f31691r = min;
                        vgVar.f31685a = 1.0f;
                        vgVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = jkVar.f23916k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f24016n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }
}
