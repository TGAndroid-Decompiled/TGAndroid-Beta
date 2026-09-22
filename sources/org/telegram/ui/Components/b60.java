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
import org.telegram.messenger.SharedSettings;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class b60 extends h60 {
    public final org.telegram.ui.kl E;
    public final LinearLayout F;
    public final ci.w2 G;
    public final ci.w2 H;
    public final ImageView I;
    public final ci.y2 J;
    public final int[] K;
    public final int L;
    public ki.q0 M;
    public ki.o0 N;
    public ki.p0 O;
    public ki.h0 P;
    public r01 Q;
    public VideoEditedInfo R;
    public a60 S;
    public AnimatorSet T;
    public ValueAnimator U;
    public final kj0 V;
    public kj0 W;
    public kj0 f22870a0;
    public boolean f22871b0;
    public boolean f22872c0;
    public boolean f22873d0;
    public boolean f22874e0;
    public final n50 f22875f;
    public boolean f22876f0;
    public boolean f22877g0;
    public final int h;
    public boolean f22878h0;
    public boolean f22879i0;
    public Bitmap f22880j0;
    public long f22881k0;
    public float f22882l0;
    public float m0;
    public final int f22883n;
    public float f22884n0;
    public float f22885o0;
    public int f22886p0;
    public int f22887q0;
    public final boolean f22888r;
    public boolean f22889r0;
    public final View f22890s;
    public boolean f22891s0;
    public float f22892t0;
    public int f22893u0;
    public final z50 v;
    public long f22894v0;
    public final km0 f22895w;
    public boolean f22896w0;
    public final FrameLayout f22897x;
    public boolean f22898x0;
    public final y50 f22899y;
    public final xp f22900y0;
    public final x50 f22901z0;

    public b60(Activity activity, n50 n50Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.h = UserConfig.selectedAccount;
        this.K = new int[2];
        this.f22886p0 = -1;
        this.f22887q0 = -1;
        this.f22892t0 = Float.NaN;
        this.f22900y0 = new xp(this, 25);
        this.f22901z0 = new x50(this);
        this.f22875f = n50Var;
        this.f22883n = n50Var.getClassGuid();
        this.f22888r = n50Var.v();
        this.f22890s = n50Var.getFragmentView();
        setWillNotDraw(false);
        ci.y2 y2Var = new ci.y2(activity, null, this, null);
        this.J = y2Var;
        y2Var.f5816o = 0.5f;
        y2Var.f5815n = ci.y2.f(0.5f);
        y2Var.g();
        addView(y2Var.f5806b, w7.y5.e(-1, -1, 119));
        z50 z50Var = new z50(this, activity);
        this.v = z50Var;
        km0 km0Var = new km0(activity);
        this.f22895w = km0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f22897x = frameLayout;
        y50 y50Var = new y50(this, activity, 0);
        y50Var.setOpaque(true);
        y50Var.setClickable(true);
        y50Var.setCameraDistance(AndroidUtilities.dp(8000.0f));
        y50Var.setOutlineProvider(new ai.k2(13));
        y50Var.setClipToOutline(true);
        this.f22899y = y50Var;
        frameLayout.addView(y50Var, w7.y5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.kl klVar = new org.telegram.ui.kl(this, activity, paint);
        this.E = klVar;
        klVar.setOutlineProvider(new ai.k2(12));
        klVar.setClipToOutline(true);
        frameLayout.addView(klVar, w7.y5.e(-1, -1, 119));
        km0Var.addView(frameLayout, w7.y5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        z50Var.addView(km0Var, w7.y5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(z50Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(y2Var.f5807c, w7.y5.e(-1, -1, 119));
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
            public final b60 f29932b;

            {
                this.f29932b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.p0 p0Var;
                ki.h0 h0Var;
                boolean z10;
                ki.p0 p0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        b60 b60Var = this.f29932b;
                        kj0 kj0Var = b60Var.V;
                        ki.q0 q0Var = b60Var.M;
                        if (q0Var != null && (p0Var = b60Var.O) != null && (h0Var = b60Var.P) != null && p0Var.f13812a == 3 && !p0Var.e) {
                            ki.i0 i0Var = h0Var.f13736a;
                            ki.i0 i0Var2 = ki.i0.f13741a;
                            if (i0Var == i0Var2) {
                                i0Var2 = ki.i0.f13742b;
                            }
                            q0Var.getClass();
                            ki.q0.s();
                            int i12 = q0Var.U;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (q0Var.f13839o != i0Var2) {
                                    q0Var.f13836l.b("camera facing requested: " + q0Var.f13839o + " -> " + i0Var2 + ", state=" + hg.k0.C(q0Var.U));
                                    q0Var.f13839o = i0Var2;
                                    int i13 = q0Var.U;
                                    if (i13 == 3 || i13 == 2) {
                                        q0Var.d();
                                        ki.h hVar = q0Var.f13835k;
                                        hVar.B = i0Var2;
                                        Handler handler = hVar.f13711n;
                                        if (hVar.R && handler != null) {
                                            handler.post(new gg.x1(27, hVar, i0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        q0Var.v = z10;
                                    }
                                    q0Var.m();
                                    q0Var.n();
                                }
                                kj0Var.M(0);
                                kj0Var.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        b60 b60Var2 = this.f29932b;
                        ki.q0 q0Var2 = b60Var2.M;
                        if (q0Var2 != null && (p0Var2 = b60Var2.O) != null && b60Var2.P != null) {
                            boolean z11 = !p0Var2.f13815f;
                            ki.h hVar2 = q0Var2.f13835k;
                            ki.q0.s();
                            if (q0Var2.U == 3 && !q0Var2.v && (i11 = q0Var2.V) != 1) {
                                q0Var2.f13844t = z11;
                                if (i11 == 3) {
                                    q0Var2.t(z11);
                                    hVar2.z(false);
                                } else {
                                    q0Var2.t(false);
                                    hVar2.z(z11);
                                }
                                q0Var2.n();
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
            public final b60 f29932b;

            {
                this.f29932b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.p0 p0Var;
                ki.h0 h0Var;
                boolean z10;
                ki.p0 p0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        b60 b60Var = this.f29932b;
                        kj0 kj0Var = b60Var.V;
                        ki.q0 q0Var = b60Var.M;
                        if (q0Var != null && (p0Var = b60Var.O) != null && (h0Var = b60Var.P) != null && p0Var.f13812a == 3 && !p0Var.e) {
                            ki.i0 i0Var = h0Var.f13736a;
                            ki.i0 i0Var2 = ki.i0.f13741a;
                            if (i0Var == i0Var2) {
                                i0Var2 = ki.i0.f13742b;
                            }
                            q0Var.getClass();
                            ki.q0.s();
                            int i12 = q0Var.U;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (q0Var.f13839o != i0Var2) {
                                    q0Var.f13836l.b("camera facing requested: " + q0Var.f13839o + " -> " + i0Var2 + ", state=" + hg.k0.C(q0Var.U));
                                    q0Var.f13839o = i0Var2;
                                    int i13 = q0Var.U;
                                    if (i13 == 3 || i13 == 2) {
                                        q0Var.d();
                                        ki.h hVar = q0Var.f13835k;
                                        hVar.B = i0Var2;
                                        Handler handler = hVar.f13711n;
                                        if (hVar.R && handler != null) {
                                            handler.post(new gg.x1(27, hVar, i0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        q0Var.v = z10;
                                    }
                                    q0Var.m();
                                    q0Var.n();
                                }
                                kj0Var.M(0);
                                kj0Var.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        b60 b60Var2 = this.f29932b;
                        ki.q0 q0Var2 = b60Var2.M;
                        if (q0Var2 != null && (p0Var2 = b60Var2.O) != null && b60Var2.P != null) {
                            boolean z11 = !p0Var2.f13815f;
                            ki.h hVar2 = q0Var2.f13835k;
                            ki.q0.s();
                            if (q0Var2.U == 3 && !q0Var2.v && (i11 = q0Var2.V) != 1) {
                                q0Var2.f13844t = z11;
                                if (i11 == 3) {
                                    q0Var2.t(z11);
                                    hVar2.z(false);
                                } else {
                                    q0Var2.t(false);
                                    hVar2.z(z11);
                                }
                                q0Var2.n();
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
        kj0 kj0Var = new kj0(R.raw.roundcamera_flip, dp, dp);
        this.V = kj0Var;
        kj0Var.setCallback(imageView);
        kj0Var.M(kj0Var.e[0] - 1);
        imageView.setImageDrawable(kj0Var);
        u();
        if (f6Var != null && !f6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.I = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.y5.e(48, 48, 17));
        y50Var.setOnTouchListener(new vr(this, 1));
        super.setVisibility(4);
    }

    private long getCurrentDurationMs() {
        ki.p0 p0Var;
        ki.q0 q0Var = this.M;
        if (q0Var != null && (p0Var = this.O) != null) {
            if (p0Var.f13812a == 3) {
                return q0Var.i();
            }
            return p0Var.f13813b;
        }
        return 0L;
    }

    public static void k(b60 b60Var) {
        boolean z10;
        ki.h0 h0Var;
        ki.p0 p0Var = b60Var.O;
        boolean z11 = false;
        if (p0Var != null && p0Var.f13812a == 3 && !p0Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        b60Var.G.setEnabled(z10);
        ci.w2 w2Var = b60Var.H;
        if (z10 && (h0Var = b60Var.P) != null && h0Var.f13737b != 1) {
            z11 = true;
        }
        w2Var.setEnabled(z11);
        b60Var.u();
    }

    public static void l(b60 b60Var) {
        org.telegram.ui.kl klVar = b60Var.E;
        if (!b60Var.f22878h0) {
            return;
        }
        b60Var.f22878h0 = false;
        klVar.invalidate();
        klVar.animate().cancel();
        klVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.mk mkVar;
        if (z10 != this.f22896w0) {
            this.f22896w0 = z10;
            this.f22894v0 = 0L;
            xp xpVar = this.f22900y0;
            if (z10) {
                yf.h.d().a(30, xpVar);
            } else {
                yf.h.d().f(xpVar);
            }
            if (this.d != z10) {
                this.d = z10;
                f60 f60Var = this.f24697c;
                if (f60Var != null && (mkVar = ((org.telegram.ui.qj) f60Var).f36947a.Y) != null) {
                    mkVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f22875f.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ci.y2 y2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.f22892t0)) {
                this.f22892t0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            y2Var.c(null);
        } else {
            if (!Float.isNaN(this.f22892t0)) {
                attributes.screenBrightness = this.f22892t0;
                this.f22892t0 = Float.NaN;
            }
            y2Var.d();
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
        r01 r01Var = this.Q;
        if (r01Var != null) {
            r01Var.b(true);
        }
        this.Q = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        s(false, false);
    }

    @Override
    public final void b(float f7, int i10) {
        ki.p0 p0Var;
        i2.e0 e0Var;
        if (this.M != null && (p0Var = this.O) != null && p0Var.f13812a == 5) {
            n();
            if (i10 == 0) {
                this.M.p();
            } else if (i10 == 1) {
                ki.q0 q0Var = this.M;
                q0Var.getClass();
                ki.q0.s();
                if (q0Var.U == 5 && (e0Var = q0Var.Q) != null) {
                    e0Var.e();
                    q0Var.w(false);
                    x50 x50Var = q0Var.f13830c;
                    q0Var.Q.J0();
                    x50Var.getClass();
                }
            } else if (i10 == 2) {
                ki.q0 q0Var2 = this.M;
                long j3 = f7 * ((float) this.O.f13813b);
                q0Var2.getClass();
                ki.q0.s();
                if (q0Var2.U == 5 && q0Var2.Q != null) {
                    long j10 = q0Var2.F;
                    q0Var2.Q.W0(5, Math.max(j10, Math.min(Math.max(j10, q0Var2.G - 1), j3)));
                    q0Var2.f13830c.getClass();
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
        ki.q0 q0Var = this.M;
        if (q0Var != null) {
            ki.q0.s();
            int i10 = q0Var.U;
            if (i10 == 10) {
                if (!q0Var.B) {
                    q0Var.h();
                }
            } else if (i10 != 8) {
                q0Var.a();
            } else {
                q0Var.d();
                q0Var.q();
                q0Var.f13835k.t();
                q0Var.B = true;
                q0Var.u(10);
                q0Var.l("released");
                q0Var.h.removeCallbacksAndMessages(null);
                q0Var.f13833i.shutdown();
                q0Var.f13834j.shutdown();
            }
            this.M = null;
        }
        r01 r01Var = this.Q;
        if (r01Var != null) {
            r01Var.b(true ^ this.f22876f0);
            this.Q = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        t();
        z50 z50Var = this.v;
        z50Var.setTranslationX(0.0f);
        this.m0 = 0.0f;
        z50Var.setTranslationY(0.0f + this.f22882l0);
        z50Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean d() {
        ki.p0 p0Var = this.O;
        if (p0Var != null) {
            int i10 = p0Var.f13812a;
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
        this.f22882l0 = f10;
        this.v.setTranslationY(this.m0 + f10);
    }

    @Override
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        ki.p0 p0Var;
        boolean z11;
        int i13;
        ki.q0 q0Var = this.M;
        if (q0Var != null && (p0Var = this.O) != null) {
            if (i10 == 3) {
                if (q0Var != null && p0Var != null && p0Var.f13812a == 3) {
                    q(2);
                    this.M.o();
                }
            } else if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f22883n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.O.f13812a == 3) {
                    q(5);
                } else {
                    n();
                }
                this.S = new a60(j3, i11, i12, z10, j10);
                ki.q0 q0Var2 = this.M;
                boolean z12 = this.f22874e0;
                boolean z13 = !z12;
                q0Var2.getClass();
                ki.q0.s();
                int i14 = q0Var2.U;
                if (i14 == 3 || i14 == 5) {
                    q0Var2.f13836l.b("finish requested: state=" + hg.k0.C(q0Var2.U) + ", includeAudio=" + z13 + ", durationMs=" + q0Var2.i() + ", trim=" + q0Var2.F + ".." + q0Var2.G);
                    q0Var2.f13848y = z13;
                    if (q0Var2.U == 3) {
                        q0Var2.D = q0Var2.i();
                        q0Var2.f13847x = true;
                        q0Var2.d();
                        q0Var2.h.removeCallbacks(q0Var2.R);
                        q0Var2.u(7);
                        boolean E = q0Var2.f13835k.E();
                        q0Var2.A = E;
                        if (!E) {
                            q0Var2.g(new IllegalStateException("Unable to stop the camera segment"));
                            return;
                        }
                        return;
                    }
                    q0Var2.q();
                    q0Var2.u(7);
                    if (!q0Var2.k() && !z12) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (q0Var2.k()) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    q0Var2.f13833i.execute(new ki.d0(q0Var2, q0Var2.O, z11, q0Var2.P, z13, i13, q0Var2.N));
                }
            }
        }
    }

    @Override
    public final void g(ah.c cVar, org.telegram.ui.jj jjVar) {
        View view = this.F;
        ch.d c10 = cVar.c(view, jjVar, false);
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
        y50 y50Var = this.f22899y;
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
        return this.f22895w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f22899y;
    }

    @Override
    public final void h(boolean z10) {
        if (this.M != null) {
            return;
        }
        setVisibility(0);
        this.f22895w.getPaint().setAlpha(255);
        this.f22876f0 = false;
        this.f22874e0 = false;
        this.f22871b0 = false;
        this.f22873d0 = false;
        this.f22881k0 = 0L;
        this.f22895w.setProgress(0.0f);
        org.telegram.ui.kl klVar = this.E;
        if (!this.f22878h0) {
            if (this.f22880j0 == null) {
                try {
                    this.f22880j0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f22880j0;
            if (bitmap != null) {
                klVar.setImageBitmap(bitmap);
            } else {
                klVar.setImageResource(R.drawable.icplaceholder);
            }
            this.f22878h0 = true;
            klVar.animate().cancel();
            klVar.setAlpha(1.0f);
            klVar.invalidate();
        }
        this.Q = new r01(this.h, this.f22888r);
        this.N = SharedSettings.roundVideoOutputResolution.get();
        ki.g0 g0Var = new ki.g0(getContext(), this.f22899y);
        g0Var.f13683c = SharedSettings.roundVideoLastCamera.get();
        g0Var.d = this.N;
        g0Var.f13685g = SharedSettings.roundVideoVideoBitrate.get();
        g0Var.e = SharedSettings.roundVideoCameraResolution.get();
        g0Var.f13684f = SharedSettings.roundVideoFrameRate.get();
        g0Var.h = SharedSettings.roundVideoComposition.get();
        x50 x50Var = this.f22901z0;
        g0Var.f13686i = x50Var;
        r01 r01Var = this.Q;
        g0Var.f13687j = r01Var;
        g0Var.f13688k = new mv(this, 6);
        if (g0Var.f13683c != null) {
            if (g0Var.d != null) {
                if (g0Var.f13685g > 0) {
                    if (g0Var.e != null) {
                        if (g0Var.f13684f != null) {
                            if (x50Var != null) {
                                if (r01Var != null) {
                                    this.M = new ki.q0(g0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    ki.q0 q0Var = this.M;
                                    q0Var.getClass();
                                    ki.q0.s();
                                    if (q0Var.U == 1) {
                                        try {
                                            q0Var.f13836l.b("start requested");
                                            q0Var.c(true);
                                            q0Var.u(2);
                                            q0Var.f13835k.D(q0Var.O, 0L, q0Var.f13839o);
                                        } catch (Exception e) {
                                            q0Var.g(e);
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
        ki.p0 p0Var;
        ki.q0 q0Var = this.M;
        if (q0Var != null && (p0Var = this.O) != null) {
            int i10 = p0Var.f13812a;
            if (i10 == 3) {
                if (q0Var != null && p0Var != null && i10 == 3) {
                    q(2);
                    this.M.o();
                }
            } else if (i10 == 5) {
                this.R = null;
                this.f22872c0 = true;
                this.f22873d0 = false;
                ki.q0.s();
                if (q0Var.U == 5 && q0Var.G - q0Var.F < q0Var.f13838n) {
                    q0Var.K++;
                    q0Var.f13836l.b("resume requested: trim=" + q0Var.F + ".." + q0Var.G + ", sourceDurationMs=" + q0Var.D);
                    q0Var.q();
                    q0Var.u(6);
                    q0Var.f13833i.execute(new ci.u1(q0Var, q0Var.k(), q0Var.O, q0Var.N, q0Var.P));
                }
            }
        }
    }

    public final void n() {
        ki.p0 p0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.M != null && (p0Var = this.O) != null && (videoEditedInfo = this.R) != null) {
            long j3 = p0Var.f13813b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j10 = this.R.endTime;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            ki.q0 q0Var = this.M;
            q0Var.getClass();
            ki.q0.s();
            if (q0Var.U == 5) {
                long max2 = Math.max(0L, Math.min(q0Var.D, max));
                long max3 = Math.max(max2, Math.min(q0Var.D, j3));
                if (max3 - max2 >= Math.min(800L, q0Var.D)) {
                    q0Var.F = max2;
                    q0Var.G = max3;
                    i2.e0 e0Var = q0Var.Q;
                    if (e0Var != null) {
                        e0Var.W0(5, max2);
                    }
                    q0Var.f13830c.getClass();
                    q0Var.n();
                }
            }
        }
    }

    public final VideoEditedInfo o(File file, long j3, q01 q01Var) {
        long j10;
        int i10;
        int i11;
        ki.k0 k0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        if (q01Var == null) {
            j10 = file.length();
        } else {
            j10 = q01Var.f27471a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j10);
        videoEditedInfo.roundVideo = true;
        ki.q0 q0Var = this.M;
        if (q0Var != null && (k0Var = q0Var.f13842r) != null) {
            i10 = k0Var.f13774a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        ki.o0 o0Var = this.N;
        if (o0Var == null) {
            i11 = 480;
        } else {
            i11 = o0Var.f13808a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (q01Var != null) {
            videoEditedInfo.file = q01Var.f27472b;
            videoEditedInfo.encryptedFile = q01Var.f27473c;
            videoEditedInfo.key = q01Var.d;
            videoEditedInfo.iv = q01Var.e;
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
        if (this.f22893u0 != i12) {
            this.f22893u0 = i12;
            z50 z50Var = this.v;
            z50Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            z50Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ci.y2 y2Var = this.J;
        y2Var.f5806b.measure(makeMeasureSpec, makeMeasureSpec2);
        y2Var.f5807c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public final void p() {
        if (this.f22889r0) {
            this.f22889r0 = false;
            this.f22886p0 = -1;
            this.f22887q0 = -1;
            if (this.M == null) {
                return;
            }
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f22885o0, 0.0f);
            this.U = ofFloat;
            ofFloat.setDuration(350L);
            this.U.addUpdateListener(new v50(this, 1));
            this.U.start();
        }
    }

    public final void q(int i10) {
        if (this.f22873d0 && i10 == 2) {
            return;
        }
        this.f22873d0 = true;
        NotificationCenter.getInstance(this.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f22883n), Integer.valueOf(i10));
    }

    public final void r(boolean z10) {
        Bitmap bitmap;
        y50 y50Var = this.f22899y;
        if (y50Var.isAvailable() && (bitmap = y50Var.getBitmap()) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 180, 180, true);
                    if (bitmap != createScaledBitmap) {
                    }
                    if (createScaledBitmap != null) {
                        try {
                            Utilities.stackBlurBitmap(createScaledBitmap, 15);
                            Bitmap bitmap2 = this.f22880j0;
                            this.f22880j0 = createScaledBitmap;
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
                            if (createScaledBitmap != this.f22880j0) {
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
        d60 d60Var = this.f24695a;
        if (d60Var != null) {
            ((org.telegram.ui.qe) d60Var).f36914b.f40524uc.a(z10, true);
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
        if (z10 && !this.f22877g0) {
            z50Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.m0 = measuredHeight;
            z50Var.setTranslationY(measuredHeight + this.f22882l0);
        }
        this.f22877g0 = z10;
        View view = this.f22890s;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f22881k0) > 300) {
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
        ofFloat.addUpdateListener(new v50(this, 0));
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
        if (this.f22874e0 && z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.I, property, f15), ofFloat);
        this.T.setDuration(180L);
        this.T.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.T.addListener(new q8(this, 24));
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
        this.f22895w.getPaint().setAlpha(0);
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
        if (!this.f22891s0) {
            return;
        }
        this.f22891s0 = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public final void u() {
        ki.p0 p0Var = this.O;
        int i10 = this.L;
        ci.w2 w2Var = this.H;
        if (p0Var != null && p0Var.f13815f) {
            if (this.f22870a0 == null) {
                kj0 kj0Var = new kj0(R.raw.roundcamera_flash_off, i10, i10);
                this.f22870a0 = kj0Var;
                kj0Var.setCallback(w2Var);
            }
            w2Var.setImageDrawable(this.f22870a0);
            return;
        }
        if (this.W == null) {
            kj0 kj0Var2 = new kj0(R.raw.roundcamera_flash_on, i10, i10);
            this.W = kj0Var2;
            kj0Var2.setCallback(w2Var);
        }
        w2Var.setImageDrawable(this.W);
    }

    public final void v() {
        org.telegram.ui.mk mkVar;
        float f7;
        ki.p0 p0Var = this.O;
        if (p0Var != null) {
            long j3 = p0Var.d;
            if (p0Var.f13812a == 3) {
                long min = Math.min(j3, (SystemClock.elapsedRealtime() + p0Var.f13813b) - p0Var.f13814c);
                this.f22881k0 = min;
                this.f22895w.setProgress(((float) min) / ((float) j3));
                f60 f60Var = this.f24697c;
                if (f60Var != null && (mkVar = ((org.telegram.ui.qj) f60Var).f36947a.Y) != null && mkVar.f22026j1) {
                    mkVar.f22020i1 = min;
                    wg wgVar = mkVar.Y0;
                    if (wgVar != null && wgVar.f30018r) {
                        wgVar.h = min;
                        wgVar.invalidate();
                    }
                    tg tgVar = mkVar.l1;
                    if (tgVar != null && tgVar.f28461n) {
                        if (!tgVar.h) {
                            long j10 = tgVar.f28462r;
                            if (j10 >= 0) {
                                if (!tgVar.e) {
                                    long max = Math.max(0L, min - j10) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    tgVar.f28457a = f7;
                                }
                                tgVar.invalidate();
                            }
                        }
                        tgVar.f28462r = min;
                        tgVar.f28457a = 1.0f;
                        tgVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = mkVar.f22031k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f22129n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }
}
