package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
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
public final class b60 extends h60 {
    public final org.telegram.ui.il E;
    public final LinearLayout F;
    public final ci.v2 G;
    public final ci.v2 H;
    public final ImageView I;
    public final ci.x2 J;
    public final int[] K;
    public final int L;
    public ki.r0 M;
    public ki.p0 N;
    public ki.q0 O;
    public ki.j0 P;
    public o01 Q;
    public VideoEditedInfo R;
    public a60 S;
    public AnimatorSet T;
    public ValueAnimator U;
    public final ij0 V;
    public ij0 W;
    public ij0 f22867a0;
    public boolean f22868b0;
    public boolean f22869c0;
    public boolean f22870d0;
    public boolean f22871e0;
    public final o50 f22872f;
    public boolean f22873f0;
    public boolean f22874g0;
    public final int h;
    public boolean f22875h0;
    public boolean f22876i0;
    public Bitmap f22877j0;
    public long f22878k0;
    public float f22879l0;
    public float m0;
    public final int f22880n;
    public float f22881n0;
    public float f22882o0;
    public int f22883p0;
    public int f22884q0;
    public final boolean f22885r;
    public boolean f22886r0;
    public final View f22887s;
    public boolean f22888s0;
    public float f22889t0;
    public int f22890u0;
    public final z50 v;
    public long f22891v0;
    public final im0 f22892w;
    public boolean f22893w0;
    public final FrameLayout f22894x;
    public boolean f22895x0;
    public final y50 f22896y;
    public final yp f22897y0;
    public final l.d f22898z0;

    public b60(Activity activity, o50 o50Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.f22883p0 = -1;
        this.f22884q0 = -1;
        this.f22889t0 = Float.NaN;
        this.f22897y0 = new yp(this, 25);
        this.f22898z0 = new l.d(this);
        this.f22872f = o50Var;
        this.f22880n = o50Var.getClassGuid();
        this.f22885r = o50Var.v();
        this.f22887s = o50Var.getFragmentView();
        setWillNotDraw(false);
        ci.x2 x2Var = new ci.x2(activity, null, this, null);
        this.J = x2Var;
        x2Var.f5818o = 0.5f;
        x2Var.f5817n = ci.x2.f(0.5f);
        x2Var.g();
        addView(x2Var.f5808b, w7.y5.e(-1, -1, 119));
        z50 z50Var = new z50(this, activity);
        this.v = z50Var;
        im0 im0Var = new im0(activity);
        this.f22892w = im0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f22894x = frameLayout;
        y50 y50Var = new y50(this, activity, 0);
        y50Var.setOpaque(true);
        y50Var.setClickable(true);
        y50Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        y50Var.setOutlineProvider(new ai.k2(13));
        y50Var.setClipToOutline(true);
        this.f22896y = y50Var;
        frameLayout.addView(y50Var, w7.y5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, activity, paint);
        this.E = ilVar;
        ilVar.setOutlineProvider(new ai.k2(12));
        ilVar.setClipToOutline(true);
        frameLayout.addView(ilVar, w7.y5.e(-1, -1, 119));
        im0Var.addView(frameLayout, w7.y5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        z50Var.addView(im0Var, w7.y5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(z50Var, new FrameLayout.LayoutParams(i10, i10, 17));
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
            public final b60 f30255b;

            {
                this.f30255b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.q0 q0Var;
                ki.j0 j0Var;
                boolean z10;
                ki.q0 q0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        b60 b60Var = this.f30255b;
                        ki.r0 r0Var = b60Var.M;
                        if (r0Var != null && (q0Var = b60Var.O) != null && (j0Var = b60Var.P) != null && q0Var.f13825a == 3 && !q0Var.e) {
                            ki.k0 k0Var = j0Var.f13753a;
                            ki.k0 k0Var2 = ki.k0.f13778a;
                            if (k0Var == k0Var2) {
                                k0Var2 = ki.k0.f13779b;
                            }
                            r0Var.getClass();
                            ki.r0.s();
                            int i12 = r0Var.V;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (r0Var.f13843o != k0Var2) {
                                    r0Var.f13840l.b("camera facing requested: " + r0Var.f13843o + " -> " + k0Var2 + ", state=" + hg.c.C(r0Var.V));
                                    r0Var.f13843o = k0Var2;
                                    int i13 = r0Var.V;
                                    if (i13 == 3 || i13 == 2) {
                                        r0Var.d();
                                        ki.h hVar = r0Var.f13839k;
                                        hVar.B = k0Var2;
                                        Handler handler = hVar.f13714n;
                                        if (hVar.R && handler != null) {
                                            handler.post(new gg.x1(27, hVar, k0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        r0Var.v = z10;
                                    }
                                    r0Var.m();
                                    r0Var.n();
                                }
                                b60Var.V.M(0);
                                b60Var.V.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        b60 b60Var2 = this.f30255b;
                        ki.r0 r0Var2 = b60Var2.M;
                        if (r0Var2 != null && (q0Var2 = b60Var2.O) != null && b60Var2.P != null) {
                            boolean z11 = !q0Var2.f13828f;
                            ki.h hVar2 = r0Var2.f13839k;
                            ki.r0.s();
                            if (r0Var2.V == 3 && !r0Var2.v && (i11 = r0Var2.W) != 1) {
                                r0Var2.f13848t = z11;
                                if (i11 == 3) {
                                    r0Var2.t(z11);
                                    hVar2.x(false);
                                } else {
                                    r0Var2.t(false);
                                    hVar2.x(z11);
                                }
                                r0Var2.n();
                                b60Var2.u();
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
            public final b60 f30255b;

            {
                this.f30255b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.q0 q0Var;
                ki.j0 j0Var;
                boolean z10;
                ki.q0 q0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        b60 b60Var = this.f30255b;
                        ki.r0 r0Var = b60Var.M;
                        if (r0Var != null && (q0Var = b60Var.O) != null && (j0Var = b60Var.P) != null && q0Var.f13825a == 3 && !q0Var.e) {
                            ki.k0 k0Var = j0Var.f13753a;
                            ki.k0 k0Var2 = ki.k0.f13778a;
                            if (k0Var == k0Var2) {
                                k0Var2 = ki.k0.f13779b;
                            }
                            r0Var.getClass();
                            ki.r0.s();
                            int i12 = r0Var.V;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (r0Var.f13843o != k0Var2) {
                                    r0Var.f13840l.b("camera facing requested: " + r0Var.f13843o + " -> " + k0Var2 + ", state=" + hg.c.C(r0Var.V));
                                    r0Var.f13843o = k0Var2;
                                    int i13 = r0Var.V;
                                    if (i13 == 3 || i13 == 2) {
                                        r0Var.d();
                                        ki.h hVar = r0Var.f13839k;
                                        hVar.B = k0Var2;
                                        Handler handler = hVar.f13714n;
                                        if (hVar.R && handler != null) {
                                            handler.post(new gg.x1(27, hVar, k0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        r0Var.v = z10;
                                    }
                                    r0Var.m();
                                    r0Var.n();
                                }
                                b60Var.V.M(0);
                                b60Var.V.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        b60 b60Var2 = this.f30255b;
                        ki.r0 r0Var2 = b60Var2.M;
                        if (r0Var2 != null && (q0Var2 = b60Var2.O) != null && b60Var2.P != null) {
                            boolean z11 = !q0Var2.f13828f;
                            ki.h hVar2 = r0Var2.f13839k;
                            ki.r0.s();
                            if (r0Var2.V == 3 && !r0Var2.v && (i11 = r0Var2.W) != 1) {
                                r0Var2.f13848t = z11;
                                if (i11 == 3) {
                                    r0Var2.t(z11);
                                    hVar2.x(false);
                                } else {
                                    r0Var2.t(false);
                                    hVar2.x(z11);
                                }
                                r0Var2.n();
                                b60Var2.u();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        int dp = AndroidUtilities.dp(24.0f);
        this.L = dp;
        ij0 ij0Var = new ij0(R.raw.roundcamera_flip, dp, dp);
        this.V = ij0Var;
        ij0Var.setCallback(imageView);
        ij0Var.M(ij0Var.e[0] - 1);
        imageView.setImageDrawable(ij0Var);
        u();
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
        y50Var.setOnTouchListener(new wr(this, 1));
        super.setVisibility(4);
    }

    private long getCurrentDurationMs() {
        ki.q0 q0Var;
        ki.r0 r0Var = this.M;
        if (r0Var != null && (q0Var = this.O) != null) {
            if (q0Var.f13825a == 3) {
                return r0Var.i();
            }
            return q0Var.f13826b;
        }
        return 0L;
    }

    public static void k(b60 b60Var) {
        boolean z10;
        ki.j0 j0Var;
        ki.q0 q0Var = b60Var.O;
        boolean z11 = false;
        if (q0Var != null && q0Var.f13825a == 3 && !q0Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        b60Var.G.setEnabled(z10);
        ci.v2 v2Var = b60Var.H;
        if (z10 && (j0Var = b60Var.P) != null && j0Var.f13754b != 1) {
            z11 = true;
        }
        v2Var.setEnabled(z11);
        b60Var.u();
    }

    public static void l(b60 b60Var) {
        org.telegram.ui.il ilVar = b60Var.E;
        if (!b60Var.f22875h0) {
            return;
        }
        b60Var.f22875h0 = false;
        ilVar.invalidate();
        ilVar.animate().cancel();
        ilVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.jk jkVar;
        if (z10 != this.f22893w0) {
            this.f22893w0 = z10;
            this.f22891v0 = 0L;
            yp ypVar = this.f22897y0;
            if (z10) {
                yf.h.d().a(30, ypVar);
            } else {
                yf.h.d().f(ypVar);
            }
            if (this.d != z10) {
                this.d = z10;
                f60 f60Var = this.f24642c;
                if (f60Var != null && (jkVar = ((org.telegram.ui.nj) f60Var).f35891a.Y) != null) {
                    jkVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f22872f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ci.x2 x2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.f22889t0)) {
                this.f22889t0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            x2Var.c(null);
        } else {
            if (!Float.isNaN(this.f22889t0)) {
                attributes.screenBrightness = this.f22889t0;
                this.f22889t0 = Float.NaN;
            }
            x2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        if (this.M == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 6;
        }
        q(i10);
        this.M.a();
        o01 o01Var = this.Q;
        if (o01Var != null) {
            o01Var.d(true);
        }
        this.Q = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        s(false, false);
    }

    @Override
    public final void b(float f7, int i10) {
        ki.q0 q0Var;
        i2.f0 f0Var;
        if (this.M != null && (q0Var = this.O) != null && q0Var.f13825a == 5) {
            n();
            if (i10 == 0) {
                this.M.p();
            } else if (i10 == 1) {
                ki.r0 r0Var = this.M;
                r0Var.getClass();
                ki.r0.s();
                if (r0Var.V == 5 && (f0Var = r0Var.R) != null) {
                    f0Var.e();
                    r0Var.w(false);
                    l.d dVar = r0Var.f13834c;
                    r0Var.R.J0();
                    dVar.getClass();
                }
            } else if (i10 == 2) {
                ki.r0 r0Var2 = this.M;
                long j3 = f7 * ((float) this.O.f13826b);
                r0Var2.getClass();
                ki.r0.s();
                if (r0Var2.V == 5 && r0Var2.R != null) {
                    long j10 = r0Var2.F;
                    r0Var2.R.W0(5, Math.max(j10, Math.min(Math.max(j10, r0Var2.G - 1), j3)));
                    r0Var2.f13834c.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ki.r0 r0Var = this.M;
        if (r0Var != null) {
            ki.r0.s();
            int i10 = r0Var.V;
            if (i10 == 10) {
                if (!r0Var.B) {
                    r0Var.h();
                }
            } else if (i10 != 8) {
                r0Var.a();
            } else {
                r0Var.d();
                r0Var.q();
                r0Var.f13839k.r();
                r0Var.B = true;
                r0Var.u(10);
                r0Var.l("released");
                r0Var.h.removeCallbacksAndMessages(null);
                r0Var.f13837i.shutdown();
                r0Var.f13838j.shutdown();
            }
            this.M = null;
        }
        o01 o01Var = this.Q;
        if (o01Var != null) {
            o01Var.d(true ^ this.f22873f0);
            this.Q = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        t();
        z50 z50Var = this.v;
        z50Var.setTranslationX(0.0f);
        this.m0 = 0.0f;
        z50Var.setTranslationY(0.0f + this.f22879l0);
        z50Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean d() {
        ki.q0 q0Var = this.O;
        if (q0Var != null) {
            int i10 = q0Var.f13825a;
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
        this.f22879l0 = f10;
        this.v.setTranslationY(this.m0 + f10);
    }

    @Override
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        ki.q0 q0Var;
        boolean z11;
        int i13;
        ki.r0 r0Var = this.M;
        if (r0Var != null && (q0Var = this.O) != null) {
            if (i10 == 3) {
                if (r0Var != null && q0Var != null && q0Var.f13825a == 3) {
                    q(2);
                    this.M.o();
                }
            } else if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f22880n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.O.f13825a == 3) {
                    q(5);
                } else {
                    n();
                }
                this.S = new a60(j3, i11, i12, z10, j10);
                ki.r0 r0Var2 = this.M;
                boolean z12 = this.f22871e0;
                boolean z13 = !z12;
                r0Var2.getClass();
                ki.r0.s();
                int i14 = r0Var2.V;
                if (i14 == 3 || i14 == 5) {
                    r0Var2.f13840l.b("finish requested: state=" + hg.c.C(r0Var2.V) + ", includeAudio=" + z13 + ", durationMs=" + r0Var2.i() + ", trim=" + r0Var2.F + ".." + r0Var2.G);
                    r0Var2.f13852y = z13;
                    if (r0Var2.V == 3) {
                        r0Var2.D = r0Var2.i();
                        r0Var2.f13851x = true;
                        r0Var2.d();
                        r0Var2.h.removeCallbacks(r0Var2.S);
                        r0Var2.u(7);
                        boolean C = r0Var2.f13839k.C();
                        r0Var2.A = C;
                        if (!C) {
                            r0Var2.g(new IllegalStateException("Unable to stop the camera segment"));
                            return;
                        }
                        return;
                    }
                    r0Var2.q();
                    r0Var2.u(7);
                    if (!r0Var2.k() && !z12) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (r0Var2.k()) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    r0Var2.f13837i.execute(new ki.g0(r0Var2, r0Var2.P, z11, r0Var2.Q, z13, i13, r0Var2.O));
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
    public e60 getCameraContainer() {
        return this.v;
    }

    @Override
    public RectF getCameraRect() {
        y50 y50Var = this.f22896y;
        int[] iArr = this.K;
        y50Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], y50Var.getWidth() + i10, y50Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.I;
    }

    @Override
    public Paint getPaint() {
        return this.f22892w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f22896y;
    }

    @Override
    public final void h(boolean z10) {
        if (this.M != null) {
            return;
        }
        setVisibility(0);
        this.f22892w.getPaint().setAlpha(255);
        this.f22873f0 = false;
        this.f22871e0 = false;
        this.f22868b0 = false;
        this.f22870d0 = false;
        this.f22878k0 = 0L;
        this.f22892w.setProgress(0.0f);
        org.telegram.ui.il ilVar = this.E;
        if (!this.f22875h0) {
            if (this.f22877j0 == null) {
                try {
                    this.f22877j0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f22877j0;
            if (bitmap != null) {
                ilVar.setImageBitmap(bitmap);
            } else {
                ilVar.setImageResource(R.drawable.icplaceholder);
            }
            this.f22875h0 = true;
            ilVar.animate().cancel();
            ilVar.setAlpha(1.0f);
            ilVar.invalidate();
        }
        this.Q = new o01(this.h, this.f22885r);
        this.N = (ki.p0) pi.e.f41346c.a();
        ki.i0 i0Var = new ki.i0(getContext(), this.f22896y);
        i0Var.f13745c = (ki.k0) pi.e.h.a();
        i0Var.d = this.N;
        i0Var.f13747g = pi.e.f41347f.a();
        i0Var.e = (ki.l0) pi.e.d.a();
        i0Var.f13746f = (ki.m0) pi.e.e.a();
        i0Var.h = pi.e.f41348g.a();
        l.d dVar = this.f22898z0;
        i0Var.f13748i = dVar;
        o01 o01Var = this.Q;
        i0Var.f13749j = o01Var;
        i0Var.f13750k = new nv(this, 6);
        if (i0Var.f13745c != null) {
            if (i0Var.d != null) {
                if (i0Var.f13747g > 0) {
                    if (i0Var.e != null) {
                        if (i0Var.f13746f != null) {
                            if (dVar != null) {
                                if (o01Var != null) {
                                    this.M = new ki.r0(i0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    ki.r0 r0Var = this.M;
                                    r0Var.getClass();
                                    ki.r0.s();
                                    if (r0Var.V == 1) {
                                        try {
                                            r0Var.f13840l.b("start requested");
                                            r0Var.c(true);
                                            r0Var.u(2);
                                            r0Var.f13839k.B(r0Var.P, 0L, r0Var.f13843o);
                                        } catch (Exception e) {
                                            r0Var.g(e);
                                        }
                                    }
                                    s(true, false);
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
        ki.q0 q0Var;
        ki.r0 r0Var = this.M;
        if (r0Var != null && (q0Var = this.O) != null) {
            int i10 = q0Var.f13825a;
            if (i10 == 3) {
                if (r0Var != null && q0Var != null && i10 == 3) {
                    q(2);
                    this.M.o();
                }
            } else if (i10 == 5) {
                this.R = null;
                this.f22869c0 = true;
                this.f22870d0 = false;
                ki.r0.s();
                if (r0Var.V == 5 && r0Var.G - r0Var.F < r0Var.f13842n) {
                    r0Var.L++;
                    r0Var.f13840l.b("resume requested: trim=" + r0Var.F + ".." + r0Var.G + ", sourceDurationMs=" + r0Var.D);
                    r0Var.q();
                    r0Var.u(6);
                    r0Var.f13837i.execute(new ci.u1(r0Var, r0Var.k(), r0Var.P, r0Var.O, r0Var.Q));
                }
            }
        }
    }

    public final void n() {
        ki.q0 q0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.M != null && (q0Var = this.O) != null && (videoEditedInfo = this.R) != null) {
            long j3 = q0Var.f13826b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j10 = this.R.endTime;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            ki.r0 r0Var = this.M;
            r0Var.getClass();
            ki.r0.s();
            if (r0Var.V == 5) {
                long max2 = Math.max(0L, Math.min(r0Var.D, max));
                long max3 = Math.max(max2, Math.min(r0Var.D, j3));
                if (max3 - max2 >= Math.min(800L, r0Var.D)) {
                    r0Var.F = max2;
                    r0Var.G = max3;
                    i2.f0 f0Var = r0Var.R;
                    if (f0Var != null) {
                        f0Var.W0(5, max2);
                    }
                    r0Var.f13834c.getClass();
                    r0Var.n();
                }
            }
        }
    }

    public final VideoEditedInfo o(File file, long j3, n01 n01Var) {
        long j10;
        int i10;
        int i11;
        ki.m0 m0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        if (n01Var == null) {
            j10 = file.length();
        } else {
            j10 = n01Var.f26595a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j10);
        videoEditedInfo.roundVideo = true;
        ki.r0 r0Var = this.M;
        if (r0Var != null && (m0Var = r0Var.f13846r) != null) {
            i10 = m0Var.f13791a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        ki.p0 p0Var = this.N;
        if (p0Var == null) {
            i11 = 480;
        } else {
            i11 = p0Var.f13801a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (n01Var != null) {
            videoEditedInfo.file = n01Var.f26596b;
            videoEditedInfo.encryptedFile = n01Var.f26597c;
            videoEditedInfo.key = n01Var.d;
            videoEditedInfo.iv = n01Var.e;
        }
        return videoEditedInfo;
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
        if (this.f22890u0 != i12) {
            this.f22890u0 = i12;
            z50 z50Var = this.v;
            z50Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            z50Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
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

    public final void p() {
        if (this.f22886r0) {
            this.f22886r0 = false;
            this.f22883p0 = -1;
            this.f22884q0 = -1;
            if (this.M == null) {
                return;
            }
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f22882o0, 0.0f);
            this.U = ofFloat;
            ofFloat.setDuration(350L);
            this.U.addUpdateListener(new w50(this, 1));
            this.U.start();
        }
    }

    public final void q(int i10) {
        if (this.f22870d0 && i10 == 2) {
            return;
        }
        this.f22870d0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f22880n), Integer.valueOf(i10));
    }

    public final void r(boolean z10) {
        Bitmap bitmap;
        y50 y50Var = this.f22896y;
        if (y50Var.isAvailable() && (bitmap = y50Var.getBitmap()) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 180, 180, true);
                    if (bitmap != createScaledBitmap) {
                    }
                    if (createScaledBitmap != null) {
                        try {
                            Utilities.stackBlurBitmap(createScaledBitmap, 15);
                            Bitmap bitmap2 = this.f22877j0;
                            this.f22877j0 = createScaledBitmap;
                            if (bitmap2 != null && bitmap2 != createScaledBitmap && !bitmap2.isRecycled()) {
                                bitmap2.recycle();
                            }
                            if (z10) {
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                                    createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                                    fileOutputStream.close();
                                } catch (Throwable unused) {
                                }
                            }
                        } finally {
                            if (createScaledBitmap != this.f22877j0) {
                                createScaledBitmap.recycle();
                            }
                        }
                    }
                }
            } finally {
                bitmap.recycle();
            }
        }
    }

    public final void s(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        d60 d60Var = this.f24640a;
        if (d60Var != null) {
            ((org.telegram.ui.pe) d60Var).f36496b.f39653uc.a(z10, true);
        }
        AnimatorSet animatorSet = this.T;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.T.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        z50 z50Var = this.v;
        if (z10 && !this.f22874g0) {
            z50Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.m0 = measuredHeight;
            z50Var.setTranslationY(measuredHeight + this.f22879l0);
        }
        this.f22874g0 = z10;
        View view = this.f22887s;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f22878k0) > 300) {
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
        ofFloat.addUpdateListener(new w50(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.T = animatorSet2;
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
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(z50Var, property, f13);
        float f16 = 0.1f;
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(z50Var, View.SCALE_X, f14);
        if (z10) {
            f16 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(z50Var, View.SCALE_Y, f16);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(z50Var, View.TRANSLATION_X, f7);
        if (this.f22871e0 && z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.I, property, f15), ofFloat);
        this.T.setDuration(180L);
        this.T.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.T.addListener(new r8(this, 24));
        } else {
            setTranslationX(0.0f);
        }
        this.T.start();
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
        z50 z50Var = this.v;
        z50Var.setAlpha(0.0f);
        z50Var.setScaleX(0.1f);
        z50Var.setScaleY(0.1f);
        z50Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f22892w.getPaint().setAlpha(0);
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

    public final void t() {
        if (!this.f22888s0) {
            return;
        }
        this.f22888s0 = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public final void u() {
        ki.q0 q0Var = this.O;
        int i10 = this.L;
        ci.v2 v2Var = this.H;
        if (q0Var != null && q0Var.f13828f) {
            if (this.f22867a0 == null) {
                ij0 ij0Var = new ij0(R.raw.roundcamera_flash_off, i10, i10);
                this.f22867a0 = ij0Var;
                ij0Var.setCallback(v2Var);
            }
            v2Var.setImageDrawable(this.f22867a0);
            return;
        }
        if (this.W == null) {
            ij0 ij0Var2 = new ij0(R.raw.roundcamera_flash_on, i10, i10);
            this.W = ij0Var2;
            ij0Var2.setCallback(v2Var);
        }
        v2Var.setImageDrawable(this.W);
    }

    public final void v() {
        org.telegram.ui.jk jkVar;
        float f7;
        ki.q0 q0Var = this.O;
        if (q0Var != null) {
            long j3 = q0Var.d;
            if (q0Var.f13825a == 3) {
                long min = Math.min(j3, (SystemClock.elapsedRealtime() + q0Var.f13826b) - q0Var.f13827c);
                this.f22878k0 = min;
                this.f22892w.setProgress(((float) min) / ((float) j3));
                f60 f60Var = this.f24642c;
                if (f60Var != null && (jkVar = ((org.telegram.ui.nj) f60Var).f35891a.Y) != null && jkVar.f21997j1) {
                    jkVar.f21991i1 = min;
                    xg xgVar = jkVar.Y0;
                    if (xgVar != null && xgVar.f30327r) {
                        xgVar.h = min;
                        xgVar.invalidate();
                    }
                    ug ugVar = jkVar.l1;
                    if (ugVar != null && ugVar.f28775n) {
                        if (!ugVar.h) {
                            long j10 = ugVar.f28776r;
                            if (j10 >= 0) {
                                if (!ugVar.e) {
                                    long max = Math.max(0L, min - j10) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    ugVar.f28771a = f7;
                                }
                                ugVar.invalidate();
                            }
                        }
                        ugVar.f28776r = min;
                        ugVar.f28771a = 1.0f;
                        ugVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = jkVar.f22002k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f22100n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }
}
