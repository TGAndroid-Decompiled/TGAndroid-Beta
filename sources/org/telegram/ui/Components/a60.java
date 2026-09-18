package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
public final class a60 extends f60 {
    public final ci.w2 E;
    public final ImageView F;
    public final ci.y2 G;
    public final int[] H;
    public final int I;
    public ki.h0 J;
    public ki.g0 K;
    public b2.q0 L;
    public q01 M;
    public VideoEditedInfo N;
    public z50 O;
    public AnimatorSet P;
    public ValueAnimator Q;
    public final ij0 R;
    public ij0 S;
    public ij0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f22509a0;
    public boolean f22510b0;
    public boolean f22511c0;
    public final n50 d;
    public boolean f22512d0;
    public final int e;
    public Bitmap f22513e0;
    public final int f22514f;
    public long f22515f0;
    public float f22516g0;
    public final boolean h;
    public float f22517h0;
    public float f22518i0;
    public float f22519j0;
    public boolean f22520k0;
    public float f22521l0;
    public int m0;
    public final View f22522n;
    public final org.telegram.ui.Cells.t6 f22523n0;
    public final l.d f22524o0;
    public final y50 f22525r;
    public final jm0 f22526s;
    public final TextureView v;
    public final org.telegram.ui.jl f22527w;
    public final LinearLayout f22528x;
    public final ci.w2 f22529y;

    public a60(Activity activity, n50 n50Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.e = UserConfig.selectedAccount;
        this.H = new int[2];
        this.f22521l0 = Float.NaN;
        this.f22523n0 = new org.telegram.ui.Cells.t6(this, 16);
        this.f22524o0 = new l.d(this);
        this.d = n50Var;
        this.f22514f = n50Var.getClassGuid();
        this.h = n50Var.v();
        this.f22522n = n50Var.getFragmentView();
        setWillNotDraw(false);
        ci.y2 y2Var = new ci.y2(activity, null, this, null);
        this.G = y2Var;
        y2Var.f5817o = 0.5f;
        y2Var.f5816n = ci.y2.f(0.5f);
        y2Var.g();
        addView(y2Var.f5807b, w7.y5.e(-1, -1, 119));
        y50 y50Var = new y50(this, activity);
        this.f22525r = y50Var;
        jm0 jm0Var = new jm0(activity);
        this.f22526s = jm0Var;
        TextureView textureView = new TextureView(activity);
        textureView.setOpaque(true);
        textureView.setClickable(true);
        textureView.setCameraDistance(AndroidUtilities.dp(8000.0f));
        textureView.setOutlineProvider(new ai.k2(13));
        textureView.setClipToOutline(true);
        this.v = textureView;
        jm0Var.addView(textureView, w7.y5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.jl jlVar = new org.telegram.ui.jl(this, activity, paint);
        this.f22527w = jlVar;
        jlVar.setOutlineProvider(new ai.k2(12));
        jlVar.setClipToOutline(true);
        jm0Var.addView(jlVar, w7.y5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        y50Var.addView(jm0Var, w7.y5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(y50Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(y2Var.f5808c, w7.y5.e(-1, -1, 119));
        jm0Var.setTrimListener(new w50(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f22528x = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, w7.y5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(activity);
        this.f22529y = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, w7.y5.n(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final a60 f30241b;

            {
                this.f30241b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.g0 g0Var;
                b2.q0 q0Var;
                int i11;
                ki.g0 g0Var2;
                int i12;
                switch (r2) {
                    case 0:
                        a60 a60Var = this.f30241b;
                        ij0 ij0Var = a60Var.R;
                        ki.h0 h0Var = a60Var.J;
                        if (h0Var != null && (g0Var = a60Var.K) != null && (q0Var = a60Var.L) != null && g0Var.f13699a == 3 && !g0Var.e) {
                            boolean z10 = true;
                            if (q0Var.f3203a == 1) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            h0Var.getClass();
                            ki.h0.r();
                            int i13 = h0Var.Q;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (h0Var.R != i11) {
                                    h0Var.f13713l.b("camera facing requested: " + hg.k0.z(h0Var.R) + " -> " + hg.k0.z(i11) + ", state=" + hg.k0.C(h0Var.Q));
                                    h0Var.R = i11;
                                    int i14 = h0Var.Q;
                                    if (i14 == 3 || i14 == 2) {
                                        h0Var.d();
                                        ki.g gVar = h0Var.f13712k;
                                        gVar.T = i11;
                                        Handler handler = gVar.f13683j;
                                        if (gVar.B && handler != null) {
                                            handler.post(new ai.n8(gVar, i11, 12));
                                        } else {
                                            z10 = false;
                                        }
                                        h0Var.f13718q = z10;
                                    }
                                    l.d dVar = h0Var.f13707c;
                                    b2.q0 q0Var2 = new b2.q0(h0Var.R, h0Var.U);
                                    a60 a60Var2 = (a60) dVar.f13859a;
                                    a60Var2.L = q0Var2;
                                    a60.l(a60Var2);
                                    h0Var.m();
                                }
                                ij0Var.M(0);
                                ij0Var.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        a60 a60Var3 = this.f30241b;
                        ki.h0 h0Var2 = a60Var3.J;
                        if (h0Var2 != null && (g0Var2 = a60Var3.K) != null && a60Var3.L != null) {
                            boolean z11 = !g0Var2.f13702f;
                            ki.g gVar2 = h0Var2.f13712k;
                            ki.h0.r();
                            if (h0Var2.Q == 3 && !h0Var2.f13718q && (i12 = h0Var2.U) != 1) {
                                h0Var2.f13716o = z11;
                                if (i12 == 3) {
                                    h0Var2.t(z11);
                                    gVar2.m(false);
                                } else {
                                    h0Var2.t(false);
                                    gVar2.m(z11);
                                }
                                h0Var2.m();
                                a60Var3.t();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(activity);
        this.E = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, w7.y5.n(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final a60 f30241b;

            {
                this.f30241b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.g0 g0Var;
                b2.q0 q0Var;
                int i11;
                ki.g0 g0Var2;
                int i12;
                switch (r2) {
                    case 0:
                        a60 a60Var = this.f30241b;
                        ij0 ij0Var = a60Var.R;
                        ki.h0 h0Var = a60Var.J;
                        if (h0Var != null && (g0Var = a60Var.K) != null && (q0Var = a60Var.L) != null && g0Var.f13699a == 3 && !g0Var.e) {
                            boolean z10 = true;
                            if (q0Var.f3203a == 1) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            h0Var.getClass();
                            ki.h0.r();
                            int i13 = h0Var.Q;
                            if (i13 != 7 && i13 != 8 && i13 != 9 && i13 != 10) {
                                if (h0Var.R != i11) {
                                    h0Var.f13713l.b("camera facing requested: " + hg.k0.z(h0Var.R) + " -> " + hg.k0.z(i11) + ", state=" + hg.k0.C(h0Var.Q));
                                    h0Var.R = i11;
                                    int i14 = h0Var.Q;
                                    if (i14 == 3 || i14 == 2) {
                                        h0Var.d();
                                        ki.g gVar = h0Var.f13712k;
                                        gVar.T = i11;
                                        Handler handler = gVar.f13683j;
                                        if (gVar.B && handler != null) {
                                            handler.post(new ai.n8(gVar, i11, 12));
                                        } else {
                                            z10 = false;
                                        }
                                        h0Var.f13718q = z10;
                                    }
                                    l.d dVar = h0Var.f13707c;
                                    b2.q0 q0Var2 = new b2.q0(h0Var.R, h0Var.U);
                                    a60 a60Var2 = (a60) dVar.f13859a;
                                    a60Var2.L = q0Var2;
                                    a60.l(a60Var2);
                                    h0Var.m();
                                }
                                ij0Var.M(0);
                                ij0Var.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        a60 a60Var3 = this.f30241b;
                        ki.h0 h0Var2 = a60Var3.J;
                        if (h0Var2 != null && (g0Var2 = a60Var3.K) != null && a60Var3.L != null) {
                            boolean z11 = !g0Var2.f13702f;
                            ki.g gVar2 = h0Var2.f13712k;
                            ki.h0.r();
                            if (h0Var2.Q == 3 && !h0Var2.f13718q && (i12 = h0Var2.U) != 1) {
                                h0Var2.f13716o = z11;
                                if (i12 == 3) {
                                    h0Var2.t(z11);
                                    gVar2.m(false);
                                } else {
                                    h0Var2.t(false);
                                    gVar2.m(z11);
                                }
                                h0Var2.m();
                                a60Var3.t();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        int dp = AndroidUtilities.dp(24.0f);
        this.I = dp;
        ij0 ij0Var = new ij0(R.raw.roundcamera_flip, dp, dp);
        this.R = ij0Var;
        ij0Var.setCallback(imageView);
        ij0Var.M(ij0Var.e[0] - 1);
        imageView.setImageDrawable(ij0Var);
        t();
        if (e6Var != null && !e6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.y5.e(48, 48, 17));
        textureView.setOnTouchListener(new vr(this, 1));
        super.setVisibility(4);
    }

    private long getCurrentDurationMs() {
        ki.g0 g0Var;
        ki.h0 h0Var = this.J;
        if (h0Var != null && (g0Var = this.K) != null) {
            if (g0Var.f13699a == 3) {
                return h0Var.i();
            }
            return g0Var.f13700b;
        }
        return 0L;
    }

    public static void l(a60 a60Var) {
        boolean z10;
        b2.q0 q0Var;
        ki.g0 g0Var = a60Var.K;
        boolean z11 = false;
        if (g0Var != null && g0Var.f13699a == 3 && !g0Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        a60Var.f22529y.setEnabled(z10);
        ci.w2 w2Var = a60Var.E;
        if (z10 && (q0Var = a60Var.L) != null && q0Var.f3204b != 1) {
            z11 = true;
        }
        w2Var.setEnabled(z11);
        a60Var.t();
    }

    public static void m(a60 a60Var) {
        org.telegram.ui.jl jlVar = a60Var.f22527w;
        if (!a60Var.f22512d0) {
            return;
        }
        a60Var.f22512d0 = false;
        jlVar.invalidate();
        jlVar.animate().cancel();
        jlVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public static VideoEditedInfo o(File file, long j3, p01 p01Var) {
        long j10;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        if (p01Var == null) {
            j10 = file.length();
        } else {
            j10 = p01Var.f27081a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j10);
        videoEditedInfo.roundVideo = true;
        videoEditedInfo.framerate = 30;
        videoEditedInfo.originalWidth = 480;
        videoEditedInfo.resultWidth = 480;
        videoEditedInfo.originalHeight = 480;
        videoEditedInfo.resultHeight = 480;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (p01Var != null) {
            videoEditedInfo.file = p01Var.f27082b;
            videoEditedInfo.encryptedFile = p01Var.f27083c;
            videoEditedInfo.key = p01Var.d;
            videoEditedInfo.iv = p01Var.e;
        }
        return videoEditedInfo;
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.d.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ci.y2 y2Var = this.G;
        if (z10) {
            if (Float.isNaN(this.f22521l0)) {
                this.f22521l0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            y2Var.c(null);
        } else {
            if (!Float.isNaN(this.f22521l0)) {
                attributes.screenBrightness = this.f22521l0;
                this.f22521l0 = Float.NaN;
            }
            y2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        if (this.J == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 6;
        }
        q(i10);
        r(true);
        this.J.a();
        q01 q01Var = this.M;
        if (q01Var != null) {
            q01Var.b(true);
        }
        this.M = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        s(false, false);
    }

    @Override
    public final void b(float f7, int i10) {
        ki.g0 g0Var;
        i2.e0 e0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.J != null && (g0Var = this.K) != null && g0Var.f13699a == 5) {
            n();
            ki.g0 g0Var2 = this.K;
            if (g0Var2 != null && (videoEditedInfo = this.N) != null) {
                long j3 = g0Var2.f13700b;
                long max = Math.max(0L, videoEditedInfo.startTime);
                long j10 = this.N.endTime;
                if (j10 >= 0) {
                    j3 = Math.min(j3, j10);
                }
                this.f22526s.g(((float) max) / 60000.0f, ((float) j3) / 60000.0f);
            }
            if (i10 == 0) {
                this.J.o();
            } else if (i10 == 1) {
                ki.h0 h0Var = this.J;
                h0Var.getClass();
                ki.h0.r();
                if (h0Var.Q == 5 && (e0Var = h0Var.L) != null) {
                    e0Var.e();
                    h0Var.x(false);
                    h0Var.f13707c.M(h0Var.L.J0());
                }
            } else if (i10 == 2) {
                this.J.s(f7 * ((float) this.K.f13700b));
            }
        }
    }

    @Override
    public final void d(boolean z10) {
        this.f22526s.removeCallbacks(this.f22523n0);
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ki.h0 h0Var = this.J;
        if (h0Var != null) {
            ki.h0.r();
            int i10 = h0Var.Q;
            if (i10 == 10) {
                if (!h0Var.f13723w) {
                    h0Var.h();
                }
            } else if (i10 != 8) {
                h0Var.a();
            } else {
                h0Var.d();
                h0Var.p();
                h0Var.f13712k.j();
                h0Var.f13723w = true;
                h0Var.u(10);
                h0Var.l("released");
                h0Var.h.removeCallbacksAndMessages(null);
                h0Var.f13710i.shutdown();
                h0Var.f13711j.shutdown();
            }
            this.J = null;
        }
        q01 q01Var = this.M;
        if (q01Var != null) {
            q01Var.b(true ^ this.f22510b0);
            this.M = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        y50 y50Var = this.f22525r;
        y50Var.setTranslationX(0.0f);
        this.f22517h0 = 0.0f;
        y50Var.setTranslationY(0.0f + this.f22516g0);
        y50Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean e() {
        ki.g0 g0Var = this.K;
        if (g0Var != null) {
            int i10 = g0Var.f13699a;
            if (i10 == 4 || i10 == 5 || i10 == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(float f7) {
        float f10 = f7 * 0.5f;
        this.f22516g0 = f10;
        this.f22525r.setTranslationY(this.f22517h0 + f10);
    }

    @Override
    public final void g(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        if (this.J != null && this.K != null) {
            if (i10 == 3) {
                p();
                return;
            }
            int i13 = 1;
            if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                boolean z11 = false;
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f22514f), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.K.f13699a == 3) {
                    q(5);
                } else {
                    n();
                }
                this.O = new z50(j3, i11, i12, z10, j10);
                this.f22526s.setLoading(true);
                r(true);
                ki.h0 h0Var = this.J;
                boolean z12 = this.f22509a0;
                boolean z13 = !z12;
                h0Var.getClass();
                ki.h0.r();
                int i14 = h0Var.Q;
                if (i14 == 3 || i14 == 5) {
                    h0Var.f13713l.b("finish requested: state=" + hg.k0.C(h0Var.Q) + ", includeAudio=" + z13 + ", durationMs=" + h0Var.i() + ", trim=" + h0Var.A + ".." + h0Var.B);
                    h0Var.f13721t = z13;
                    if (h0Var.Q == 3) {
                        h0Var.f13725y = h0Var.i();
                        h0Var.f13720s = true;
                        h0Var.d();
                        h0Var.h.removeCallbacks(h0Var.M);
                        h0Var.u(7);
                        boolean q6 = h0Var.f13712k.q();
                        h0Var.v = q6;
                        if (!q6) {
                            h0Var.g(new IllegalStateException("Unable to stop the camera segment"));
                            return;
                        }
                        return;
                    }
                    h0Var.p();
                    h0Var.u(7);
                    z11 = (h0Var.k() || z12) ? true : true;
                    if (!h0Var.k()) {
                        i13 = 2;
                    }
                    h0Var.f13710i.execute(new ki.b0(h0Var, h0Var.J, z11, h0Var.K, z13, i13, h0Var.I));
                }
            }
        }
    }

    @Override
    public View getButtonsLayout() {
        return this.f22528x;
    }

    @Override
    public d60 getCameraContainer() {
        return this.f22525r;
    }

    @Override
    public RectF getCameraRect() {
        TextureView textureView = this.v;
        int[] iArr = this.H;
        textureView.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], textureView.getWidth() + i10, textureView.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.F;
    }

    @Override
    public Paint getPaint() {
        return this.f22526s.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.v;
    }

    @Override
    public final void h(ah.c cVar, org.telegram.ui.ij ijVar) {
        View view = this.f22528x;
        ch.d c10 = cVar.c(view, ijVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        view.setBackground(c10);
    }

    @Override
    public final void i(boolean z10) {
        if (this.J != null) {
            return;
        }
        setVisibility(0);
        this.f22526s.getPaint().setAlpha(255);
        this.f22510b0 = false;
        this.f22509a0 = false;
        this.U = false;
        this.W = false;
        this.f22515f0 = 0L;
        this.f22526s.setTrimEnabled(false);
        this.f22526s.setProgress(0.0f);
        this.f22526s.setLoading(false);
        r(false);
        this.M = new q01(this.e, this.h);
        this.J = new ki.h0(getContext(), this.v, this.f22524o0, this.M, new w50(this));
        MediaController.getInstance().requestRecordAudioFocus(true);
        ki.h0 h0Var = this.J;
        h0Var.getClass();
        ki.h0.r();
        if (h0Var.Q == 1) {
            try {
                h0Var.f13713l.b("start requested");
                h0Var.c(true);
                h0Var.u(2);
                h0Var.f13712k.p(h0Var.J, 0L, h0Var.R);
            } catch (Exception e) {
                h0Var.g(e);
            }
        }
        s(true, false);
    }

    @Override
    public final void j() {
        ki.g0 g0Var;
        if (this.J != null && (g0Var = this.K) != null) {
            int i10 = g0Var.f13699a;
            if (i10 == 3) {
                p();
            } else if (i10 == 5) {
                this.f22526s.setTrimEnabled(false);
                this.N = null;
                this.V = true;
                this.W = false;
                r(true);
                ki.h0 h0Var = this.J;
                h0Var.getClass();
                ki.h0.r();
                if (h0Var.Q == 5 && h0Var.B - h0Var.A < h0Var.f13714m) {
                    h0Var.F++;
                    h0Var.f13713l.b("resume requested: trim=" + h0Var.A + ".." + h0Var.B + ", sourceDurationMs=" + h0Var.f13725y);
                    h0Var.p();
                    h0Var.u(6);
                    h0Var.f13710i.execute(new ci.u1(h0Var, h0Var.k(), h0Var.J, h0Var.I, h0Var.K));
                }
            }
        }
    }

    public final void n() {
        ki.g0 g0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.J != null && (g0Var = this.K) != null && (videoEditedInfo = this.N) != null) {
            long j3 = g0Var.f13700b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j10 = this.N.endTime;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            this.J.v(max, j3);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (View.MeasureSpec.getSize(i11) - getPaddingBottom() > View.MeasureSpec.getSize(i10) * 1.3f) {
            i12 = AndroidUtilities.roundPlayingMessageSize;
        } else {
            i12 = AndroidUtilities.roundMessageSize;
        }
        if (this.m0 != i12) {
            this.m0 = i12;
            y50 y50Var = this.f22525r;
            y50Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            y50Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ci.y2 y2Var = this.G;
        y2Var.f5807b.measure(makeMeasureSpec, makeMeasureSpec2);
        y2Var.f5808c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    public final void p() {
        ki.g0 g0Var;
        if (this.J != null && (g0Var = this.K) != null && g0Var.f13699a == 3) {
            q(2);
            r(true);
            this.J.n();
        }
    }

    public final void q(int i10) {
        if (this.W && i10 == 2) {
            return;
        }
        this.W = true;
        NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f22514f), Integer.valueOf(i10));
    }

    public final void r(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a60.r(boolean):void");
    }

    public final void s(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        c60 c60Var = this.f24028a;
        if (c60Var != null) {
            ((org.telegram.ui.qe) c60Var).f36798b.f40461uc.a(z10, true);
        }
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.P.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        y50 y50Var = this.f22525r;
        if (z10 && !this.f22511c0) {
            y50Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f22517h0 = measuredHeight;
            y50Var.setTranslationY(measuredHeight + this.f22516g0);
        }
        this.f22511c0 = z10;
        View view = this.f22522n;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f22515f0) > 300) {
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
        this.P = animatorSet2;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float[] fArr = {f12};
        LinearLayout linearLayout = this.f22528x;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(y50Var, property, f13);
        float f16 = 0.1f;
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(y50Var, View.SCALE_X, f14);
        if (z10) {
            f16 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(y50Var, View.SCALE_Y, f16);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(y50Var, View.TRANSLATION_X, f7);
        if (this.f22509a0 && z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.F, property, f15), ofFloat);
        this.P.setDuration(180L);
        this.P.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.P.addListener(new r8(this, 24));
        } else {
            setTranslationX(0.0f);
        }
        this.P.start();
    }

    @Override
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
        this.f22525r.getClass();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f22528x.setAlpha(0.0f);
        y50 y50Var = this.f22525r;
        y50Var.setAlpha(0.0f);
        y50Var.setScaleX(0.1f);
        y50Var.setScaleY(0.1f);
        y50Var.setTranslationX(0.0f);
        ImageView imageView = this.F;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f22526s.getPaint().setAlpha(0);
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
        ki.g0 g0Var = this.K;
        int i10 = this.I;
        ci.w2 w2Var = this.E;
        if (g0Var != null && g0Var.f13702f) {
            if (this.T == null) {
                ij0 ij0Var = new ij0(R.raw.roundcamera_flash_off, i10, i10);
                this.T = ij0Var;
                ij0Var.setCallback(w2Var);
            }
            w2Var.setImageDrawable(this.T);
            return;
        }
        if (this.S == null) {
            ij0 ij0Var2 = new ij0(R.raw.roundcamera_flash_on, i10, i10);
            this.S = ij0Var2;
            ij0Var2.setCallback(w2Var);
        }
        w2Var.setImageDrawable(this.S);
    }
}
