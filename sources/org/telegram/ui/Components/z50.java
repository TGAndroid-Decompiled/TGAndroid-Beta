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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class z50 extends e60 {
    public final ci.w2 E;
    public final ci.w2 F;
    public final ImageView G;
    public final ci.y2 H;
    public final int[] I;
    public final int J;
    public ki.o0 K;
    public ki.m0 L;
    public ki.n0 M;
    public ki.g0 N;
    public p01 O;
    public VideoEditedInfo P;
    public y50 Q;
    public AnimatorSet R;
    public ValueAnimator S;
    public final hj0 T;
    public hj0 U;
    public hj0 V;
    public boolean W;
    public boolean f30714a0;
    public boolean f30715b0;
    public boolean f30716c0;
    public final n50 d;
    public boolean f30717d0;
    public final int e;
    public boolean f30718e0;
    public final int f30719f;
    public boolean f30720f0;
    public boolean f30721g0;
    public final boolean h;
    public Bitmap f30722h0;
    public long f30723i0;
    public float f30724j0;
    public float f30725k0;
    public float f30726l0;
    public float m0;
    public final View f30727n;
    public int f30728n0;
    public int f30729o0;
    public boolean f30730p0;
    public boolean f30731q0;
    public final x50 f30732r;
    public float f30733r0;
    public final im0 f30734s;
    public int f30735s0;
    public final org.telegram.ui.Cells.u6 f30736t0;
    public final l.d f30737u0;
    public final FrameLayout v;
    public final TextureView f30738w;
    public final org.telegram.ui.jl f30739x;
    public final LinearLayout f30740y;

    public z50(Activity activity, n50 n50Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.e = UserConfig.selectedAccount;
        this.I = new int[2];
        this.f30728n0 = -1;
        this.f30729o0 = -1;
        this.f30733r0 = Float.NaN;
        this.f30736t0 = new org.telegram.ui.Cells.u6(this, 16);
        this.f30737u0 = new l.d(this);
        this.d = n50Var;
        this.f30719f = n50Var.getClassGuid();
        this.h = n50Var.v();
        this.f30727n = n50Var.getFragmentView();
        setWillNotDraw(false);
        ci.y2 y2Var = new ci.y2(activity, null, this, null);
        this.H = y2Var;
        y2Var.f5818o = 0.5f;
        y2Var.f5817n = ci.y2.f(0.5f);
        y2Var.g();
        addView(y2Var.f5808b, w7.y5.e(-1, -1, 119));
        x50 x50Var = new x50(this, activity);
        this.f30732r = x50Var;
        im0 im0Var = new im0(activity);
        this.f30734s = im0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.v = frameLayout;
        TextureView textureView = new TextureView(activity);
        textureView.setOpaque(true);
        textureView.setClickable(true);
        textureView.setCameraDistance(AndroidUtilities.dp(8000.0f));
        textureView.setOutlineProvider(new ai.k2(13));
        textureView.setClipToOutline(true);
        this.f30738w = textureView;
        frameLayout.addView(textureView, w7.y5.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.jl jlVar = new org.telegram.ui.jl(this, activity, paint);
        this.f30739x = jlVar;
        jlVar.setOutlineProvider(new ai.k2(12));
        jlVar.setClipToOutline(true);
        frameLayout.addView(jlVar, w7.y5.e(-1, -1, 119));
        im0Var.addView(frameLayout, w7.y5.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        x50Var.addView(im0Var, w7.y5.e(-1, -1, 119));
        int i10 = AndroidUtilities.roundPlayingMessageSize;
        addView(x50Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(y2Var.f5809c, w7.y5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f30740y = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(linearLayout, w7.y5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(activity);
        this.E = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, w7.y5.n(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final z50 f29941b;

            {
                this.f29941b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.n0 n0Var;
                ki.g0 g0Var;
                boolean z10;
                ki.n0 n0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        z50 z50Var = this.f29941b;
                        hj0 hj0Var = z50Var.T;
                        ki.o0 o0Var = z50Var.K;
                        if (o0Var != null && (n0Var = z50Var.M) != null && (g0Var = z50Var.N) != null && n0Var.f13774a == 3 && !n0Var.e) {
                            ki.h0 h0Var = g0Var.f13689a;
                            ki.h0 h0Var2 = ki.h0.f13726a;
                            if (h0Var == h0Var2) {
                                h0Var2 = ki.h0.f13727b;
                            }
                            o0Var.getClass();
                            ki.o0.s();
                            int i12 = o0Var.U;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (o0Var.f13811o != h0Var2) {
                                    o0Var.f13808l.b("camera facing requested: " + o0Var.f13811o + " -> " + h0Var2 + ", state=" + hg.k0.C(o0Var.U));
                                    o0Var.f13811o = h0Var2;
                                    int i13 = o0Var.U;
                                    if (i13 == 3 || i13 == 2) {
                                        o0Var.d();
                                        ki.h hVar = o0Var.f13807k;
                                        hVar.B = h0Var2;
                                        Handler handler = hVar.f13714n;
                                        if (hVar.M && handler != null) {
                                            handler.post(new gg.x1(27, hVar, h0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        o0Var.v = z10;
                                    }
                                    o0Var.m();
                                    o0Var.n();
                                }
                                hj0Var.M(0);
                                hj0Var.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        z50 z50Var2 = this.f29941b;
                        ki.o0 o0Var2 = z50Var2.K;
                        if (o0Var2 != null && (n0Var2 = z50Var2.M) != null && z50Var2.N != null) {
                            boolean z11 = !n0Var2.f13777f;
                            ki.h hVar2 = o0Var2.f13807k;
                            ki.o0.s();
                            if (o0Var2.U == 3 && !o0Var2.v && (i11 = o0Var2.V) != 1) {
                                o0Var2.f13816t = z11;
                                if (i11 == 3) {
                                    o0Var2.t(z11);
                                    hVar2.v(false);
                                } else {
                                    o0Var2.t(false);
                                    hVar2.v(z11);
                                }
                                o0Var2.n();
                                z50Var2.t();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(activity);
        this.F = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, w7.y5.n(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final z50 f29941b;

            {
                this.f29941b = this;
            }

            @Override
            public final void onClick(View view) {
                ki.n0 n0Var;
                ki.g0 g0Var;
                boolean z10;
                ki.n0 n0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        z50 z50Var = this.f29941b;
                        hj0 hj0Var = z50Var.T;
                        ki.o0 o0Var = z50Var.K;
                        if (o0Var != null && (n0Var = z50Var.M) != null && (g0Var = z50Var.N) != null && n0Var.f13774a == 3 && !n0Var.e) {
                            ki.h0 h0Var = g0Var.f13689a;
                            ki.h0 h0Var2 = ki.h0.f13726a;
                            if (h0Var == h0Var2) {
                                h0Var2 = ki.h0.f13727b;
                            }
                            o0Var.getClass();
                            ki.o0.s();
                            int i12 = o0Var.U;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (o0Var.f13811o != h0Var2) {
                                    o0Var.f13808l.b("camera facing requested: " + o0Var.f13811o + " -> " + h0Var2 + ", state=" + hg.k0.C(o0Var.U));
                                    o0Var.f13811o = h0Var2;
                                    int i13 = o0Var.U;
                                    if (i13 == 3 || i13 == 2) {
                                        o0Var.d();
                                        ki.h hVar = o0Var.f13807k;
                                        hVar.B = h0Var2;
                                        Handler handler = hVar.f13714n;
                                        if (hVar.M && handler != null) {
                                            handler.post(new gg.x1(27, hVar, h0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        o0Var.v = z10;
                                    }
                                    o0Var.m();
                                    o0Var.n();
                                }
                                hj0Var.M(0);
                                hj0Var.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        z50 z50Var2 = this.f29941b;
                        ki.o0 o0Var2 = z50Var2.K;
                        if (o0Var2 != null && (n0Var2 = z50Var2.M) != null && z50Var2.N != null) {
                            boolean z11 = !n0Var2.f13777f;
                            ki.h hVar2 = o0Var2.f13807k;
                            ki.o0.s();
                            if (o0Var2.U == 3 && !o0Var2.v && (i11 = o0Var2.V) != 1) {
                                o0Var2.f13816t = z11;
                                if (i11 == 3) {
                                    o0Var2.t(z11);
                                    hVar2.v(false);
                                } else {
                                    o0Var2.t(false);
                                    hVar2.v(z11);
                                }
                                o0Var2.n();
                                z50Var2.t();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        int dp = AndroidUtilities.dp(24.0f);
        this.J = dp;
        hj0 hj0Var = new hj0(R.raw.roundcamera_flip, dp, dp);
        this.T = hj0Var;
        hj0Var.setCallback(imageView);
        hj0Var.M(hj0Var.e[0] - 1);
        imageView.setImageDrawable(hj0Var);
        t();
        if (f6Var != null && !f6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.y5.e(48, 48, 17));
        textureView.setOnTouchListener(new vr(this, 1));
        super.setVisibility(4);
    }

    private long getCurrentDurationMs() {
        ki.n0 n0Var;
        ki.o0 o0Var = this.K;
        if (o0Var != null && (n0Var = this.M) != null) {
            if (n0Var.f13774a == 3) {
                return o0Var.i();
            }
            return n0Var.f13775b;
        }
        return 0L;
    }

    public static void k(z50 z50Var) {
        org.telegram.ui.jl jlVar = z50Var.f30739x;
        if (!z50Var.f30720f0) {
            return;
        }
        z50Var.f30720f0 = false;
        jlVar.invalidate();
        jlVar.animate().cancel();
        jlVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public static void l(z50 z50Var) {
        boolean z10;
        ki.g0 g0Var;
        ki.n0 n0Var = z50Var.M;
        boolean z11 = false;
        if (n0Var != null && n0Var.f13774a == 3 && !n0Var.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        z50Var.E.setEnabled(z10);
        ci.w2 w2Var = z50Var.F;
        if (z10 && (g0Var = z50Var.N) != null && g0Var.f13690b != 1) {
            z11 = true;
        }
        w2Var.setEnabled(z11);
        z50Var.t();
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.d.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        ci.y2 y2Var = this.H;
        if (z10) {
            if (Float.isNaN(this.f30733r0)) {
                this.f30733r0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            y2Var.c(null);
        } else {
            if (!Float.isNaN(this.f30733r0)) {
                attributes.screenBrightness = this.f30733r0;
                this.f30733r0 = Float.NaN;
            }
            y2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        if (this.K == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 6;
        }
        p(i10);
        this.K.a();
        p01 p01Var = this.O;
        if (p01Var != null) {
            p01Var.b(true);
        }
        this.O = null;
        MediaController.getInstance().requestRecordAudioFocus(false);
        r(false, false);
    }

    @Override
    public final void b(float f7, int i10) {
        ki.n0 n0Var;
        i2.e0 e0Var;
        if (this.K != null && (n0Var = this.M) != null && n0Var.f13774a == 5) {
            m();
            if (i10 == 0) {
                this.K.p();
            } else if (i10 == 1) {
                ki.o0 o0Var = this.K;
                o0Var.getClass();
                ki.o0.s();
                if (o0Var.U == 5 && (e0Var = o0Var.Q) != null) {
                    e0Var.e();
                    o0Var.w(false);
                    l.d dVar = o0Var.f13802c;
                    o0Var.Q.J0();
                    dVar.getClass();
                }
            } else if (i10 == 2) {
                ki.o0 o0Var2 = this.K;
                long j3 = f7 * ((float) this.M.f13775b);
                o0Var2.getClass();
                ki.o0.s();
                if (o0Var2.U == 5 && o0Var2.Q != null) {
                    long j10 = o0Var2.F;
                    o0Var2.Q.W0(5, Math.max(j10, Math.min(Math.max(j10, o0Var2.G - 1), j3)));
                    o0Var2.f13802c.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f30734s.removeCallbacks(this.f30736t0);
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ki.o0 o0Var = this.K;
        if (o0Var != null) {
            ki.o0.s();
            int i10 = o0Var.U;
            if (i10 == 10) {
                if (!o0Var.B) {
                    o0Var.h();
                }
            } else if (i10 != 8) {
                o0Var.a();
            } else {
                o0Var.d();
                o0Var.q();
                o0Var.f13807k.r();
                o0Var.B = true;
                o0Var.u(10);
                o0Var.l("released");
                o0Var.h.removeCallbacksAndMessages(null);
                o0Var.f13805i.shutdown();
                o0Var.f13806j.shutdown();
            }
            this.K = null;
        }
        p01 p01Var = this.O;
        if (p01Var != null) {
            p01Var.b(true ^ this.f30717d0);
            this.O = null;
        }
        setScreenFlashEnabled(false);
        MediaController.getInstance().requestRecordAudioFocus(false);
        s();
        x50 x50Var = this.f30732r;
        x50Var.setTranslationX(0.0f);
        this.f30725k0 = 0.0f;
        x50Var.setTranslationY(0.0f + this.f30724j0);
        x50Var.setImageReceiver(null);
        MediaController.getInstance().resumeByRewind();
    }

    @Override
    public final boolean d() {
        ki.n0 n0Var = this.M;
        if (n0Var != null) {
            int i10 = n0Var.f13774a;
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
        this.f30724j0 = f10;
        this.f30732r.setTranslationY(this.f30725k0 + f10);
    }

    @Override
    public final void f(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        ki.n0 n0Var;
        boolean z11;
        int i13;
        ki.o0 o0Var = this.K;
        if (o0Var != null && (n0Var = this.M) != null) {
            if (i10 == 3) {
                if (o0Var != null && n0Var != null && n0Var.f13774a == 3) {
                    p(2);
                    this.K.o();
                }
            } else if (i10 == 1 || i10 == 4) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.f30719f), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.M.f13774a == 3) {
                    p(5);
                } else {
                    m();
                }
                this.Q = new y50(j3, i11, i12, z10, j10);
                ki.o0 o0Var2 = this.K;
                boolean z12 = this.f30716c0;
                boolean z13 = !z12;
                o0Var2.getClass();
                ki.o0.s();
                int i14 = o0Var2.U;
                if (i14 == 3 || i14 == 5) {
                    o0Var2.f13808l.b("finish requested: state=" + hg.k0.C(o0Var2.U) + ", includeAudio=" + z13 + ", durationMs=" + o0Var2.i() + ", trim=" + o0Var2.F + ".." + o0Var2.G);
                    o0Var2.f13820y = z13;
                    if (o0Var2.U == 3) {
                        o0Var2.D = o0Var2.i();
                        o0Var2.f13819x = true;
                        o0Var2.d();
                        o0Var2.h.removeCallbacks(o0Var2.R);
                        o0Var2.u(7);
                        boolean z14 = o0Var2.f13807k.z();
                        o0Var2.A = z14;
                        if (!z14) {
                            o0Var2.g(new IllegalStateException("Unable to stop the camera segment"));
                            return;
                        }
                        return;
                    }
                    o0Var2.q();
                    o0Var2.u(7);
                    if (!o0Var2.k() && !z12) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (o0Var2.k()) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    o0Var2.f13805i.execute(new ki.d0(o0Var2, o0Var2.O, z11, o0Var2.P, z13, i13, o0Var2.N));
                }
            }
        }
    }

    @Override
    public final void g(ah.c cVar, org.telegram.ui.ij ijVar) {
        View view = this.f30740y;
        ch.d c10 = cVar.c(view, ijVar, false);
        c10.p(AndroidUtilities.dp(6.0f));
        c10.q(AndroidUtilities.dp(21.0f));
        view.setBackground(c10);
    }

    @Override
    public View getButtonsLayout() {
        return this.f30740y;
    }

    @Override
    public c60 getCameraContainer() {
        return this.f30732r;
    }

    @Override
    public RectF getCameraRect() {
        TextureView textureView = this.f30738w;
        int[] iArr = this.I;
        textureView.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], textureView.getWidth() + i10, textureView.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.G;
    }

    @Override
    public Paint getPaint() {
        return this.f30734s.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f30738w;
    }

    @Override
    public final void h(boolean z10) {
        if (this.K != null) {
            return;
        }
        setVisibility(0);
        this.f30734s.getPaint().setAlpha(255);
        this.f30717d0 = false;
        this.f30716c0 = false;
        this.W = false;
        this.f30715b0 = false;
        this.f30723i0 = 0L;
        this.f30734s.setProgress(0.0f);
        org.telegram.ui.jl jlVar = this.f30739x;
        if (!this.f30720f0) {
            if (this.f30722h0 == null) {
                try {
                    this.f30722h0 = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f30722h0;
            if (bitmap != null) {
                jlVar.setImageBitmap(bitmap);
            } else {
                jlVar.setImageResource(R.drawable.icplaceholder);
            }
            this.f30720f0 = true;
            jlVar.animate().cancel();
            jlVar.setAlpha(1.0f);
            jlVar.invalidate();
        }
        this.O = new p01(this.e, this.h);
        this.L = (ki.m0) w7.a6.c("round_video_output_resolution", ki.m0.P480, ki.m0.class);
        ki.f0 f0Var = new ki.f0(getContext(), this.f30738w);
        f0Var.f13678c = (ki.h0) w7.a6.c("round_video_last_camera", ki.h0.f13726a, ki.h0.class);
        f0Var.d = this.L;
        f0Var.f13680g = Math.max(1, MessagesController.getGlobalMainSettings().getInt("round_video_video_bitrate", 1000000));
        f0Var.e = (ki.i0) w7.a6.c("round_video_camera_resolution", ki.i0.f13731a, ki.i0.class);
        f0Var.f13679f = (ki.j0) w7.a6.c("round_video_frame_rate", ki.j0.FPS_30, ki.j0.class);
        f0Var.h = w7.a6.a();
        l.d dVar = this.f30737u0;
        f0Var.f13681i = dVar;
        p01 p01Var = this.O;
        f0Var.f13682j = p01Var;
        f0Var.f13683k = new mv(this, 6);
        if (f0Var.f13678c != null) {
            if (f0Var.d != null) {
                if (f0Var.f13680g > 0) {
                    if (f0Var.e != null) {
                        if (f0Var.f13679f != null) {
                            if (dVar != null) {
                                if (p01Var != null) {
                                    this.K = new ki.o0(f0Var);
                                    MediaController.getInstance().requestRecordAudioFocus(true);
                                    ki.o0 o0Var = this.K;
                                    o0Var.getClass();
                                    ki.o0.s();
                                    if (o0Var.U == 1) {
                                        try {
                                            o0Var.f13808l.b("start requested");
                                            o0Var.c(true);
                                            o0Var.u(2);
                                            o0Var.f13807k.y(o0Var.O, 0L, o0Var.f13811o);
                                        } catch (Exception e) {
                                            o0Var.g(e);
                                        }
                                    }
                                    r(true, false);
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
        ki.n0 n0Var;
        ki.o0 o0Var = this.K;
        if (o0Var != null && (n0Var = this.M) != null) {
            int i10 = n0Var.f13774a;
            if (i10 == 3) {
                if (o0Var != null && n0Var != null && i10 == 3) {
                    p(2);
                    this.K.o();
                }
            } else if (i10 == 5) {
                this.P = null;
                this.f30714a0 = true;
                this.f30715b0 = false;
                ki.o0.s();
                if (o0Var.U == 5 && o0Var.G - o0Var.F < o0Var.f13810n) {
                    o0Var.K++;
                    o0Var.f13808l.b("resume requested: trim=" + o0Var.F + ".." + o0Var.G + ", sourceDurationMs=" + o0Var.D);
                    o0Var.q();
                    o0Var.u(6);
                    o0Var.f13805i.execute(new ci.u1(o0Var, o0Var.k(), o0Var.O, o0Var.N, o0Var.P));
                }
            }
        }
    }

    public final void m() {
        ki.n0 n0Var;
        VideoEditedInfo videoEditedInfo;
        if (this.K != null && (n0Var = this.M) != null && (videoEditedInfo = this.P) != null) {
            long j3 = n0Var.f13775b;
            long max = Math.max(0L, videoEditedInfo.startTime);
            long j10 = this.P.endTime;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            ki.o0 o0Var = this.K;
            o0Var.getClass();
            ki.o0.s();
            if (o0Var.U == 5) {
                long max2 = Math.max(0L, Math.min(o0Var.D, max));
                long max3 = Math.max(max2, Math.min(o0Var.D, j3));
                if (max3 - max2 >= Math.min(800L, o0Var.D)) {
                    o0Var.F = max2;
                    o0Var.G = max3;
                    i2.e0 e0Var = o0Var.Q;
                    if (e0Var != null) {
                        e0Var.W0(5, max2);
                    }
                    o0Var.f13802c.getClass();
                    o0Var.n();
                }
            }
        }
    }

    public final VideoEditedInfo n(File file, long j3, o01 o01Var) {
        long j10;
        int i10;
        int i11;
        ki.j0 j0Var;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.estimatedDuration = j3;
        if (o01Var == null) {
            j10 = file.length();
        } else {
            j10 = o01Var.f26769a;
        }
        videoEditedInfo.estimatedSize = Math.max(1L, j10);
        videoEditedInfo.roundVideo = true;
        ki.o0 o0Var = this.K;
        if (o0Var != null && (j0Var = o0Var.f13814r) != null) {
            i10 = j0Var.f13758a;
        } else {
            i10 = 30;
        }
        videoEditedInfo.framerate = i10;
        ki.m0 m0Var = this.L;
        if (m0Var == null) {
            i11 = 480;
        } else {
            i11 = m0Var.f13772a;
        }
        videoEditedInfo.originalWidth = i11;
        videoEditedInfo.resultWidth = i11;
        videoEditedInfo.originalHeight = i11;
        videoEditedInfo.resultHeight = i11;
        videoEditedInfo.originalPath = file.getAbsolutePath();
        if (o01Var != null) {
            videoEditedInfo.file = o01Var.f26770b;
            videoEditedInfo.encryptedFile = o01Var.f26771c;
            videoEditedInfo.key = o01Var.d;
            videoEditedInfo.iv = o01Var.e;
        }
        return videoEditedInfo;
    }

    public final void o() {
        if (this.f30730p0) {
            this.f30730p0 = false;
            this.f30728n0 = -1;
            this.f30729o0 = -1;
            if (this.K == null) {
                return;
            }
            ValueAnimator valueAnimator = this.S;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m0, 0.0f);
            this.S = ofFloat;
            ofFloat.setDuration(350L);
            this.S.addUpdateListener(new v50(this, 1));
            this.S.start();
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
        if (this.f30735s0 != i12) {
            this.f30735s0 = i12;
            x50 x50Var = this.f30732r;
            x50Var.getLayoutParams().width = AndroidUtilities.dp(28.0f) + i12;
            x50Var.getLayoutParams().height = AndroidUtilities.dp(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.G.getLayoutParams()).topMargin = (i12 / 2) - AndroidUtilities.dp(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ci.y2 y2Var = this.H;
        y2Var.f5808b.measure(makeMeasureSpec, makeMeasureSpec2);
        y2Var.f5809c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public final void p(int i10) {
        if (this.f30715b0 && i10 == 2) {
            return;
        }
        this.f30715b0 = true;
        NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.f30719f), Integer.valueOf(i10));
    }

    public final void q(boolean z10) {
        Bitmap bitmap;
        TextureView textureView = this.f30738w;
        if (textureView.isAvailable() && (bitmap = textureView.getBitmap()) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 180, 180, true);
                    if (bitmap != createScaledBitmap) {
                    }
                    if (createScaledBitmap != null) {
                        try {
                            Utilities.stackBlurBitmap(createScaledBitmap, 15);
                            Bitmap bitmap2 = this.f30722h0;
                            this.f30722h0 = createScaledBitmap;
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
                            if (createScaledBitmap != this.f30722h0) {
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

    public final void r(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        b60 b60Var = this.f23748a;
        if (b60Var != null) {
            ((org.telegram.ui.qe) b60Var).f36891b.f40503uc.a(z10, true);
        }
        AnimatorSet animatorSet = this.R;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.R.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        x50 x50Var = this.f30732r;
        if (z10 && !this.f30718e0) {
            x50Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f30725k0 = measuredHeight;
            x50Var.setTranslationY(measuredHeight + this.f30724j0);
        }
        this.f30718e0 = z10;
        View view = this.f30727n;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f30723i0) > 300) {
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
        this.R = animatorSet2;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float[] fArr = {f12};
        LinearLayout linearLayout = this.f30740y;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(x50Var, property, f13);
        float f16 = 0.1f;
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(x50Var, View.SCALE_X, f14);
        if (z10) {
            f16 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(x50Var, View.SCALE_Y, f16);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(x50Var, View.TRANSLATION_X, f7);
        if (this.f30716c0 && z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.G, property, f15), ofFloat);
        this.R.setDuration(180L);
        this.R.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.R.addListener(new q8(this, 24));
        } else {
            setTranslationX(0.0f);
        }
        this.R.start();
    }

    public final void s() {
        if (!this.f30731q0) {
            return;
        }
        this.f30731q0 = false;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    @Override
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
        this.f30732r.getClass();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f30740y.setAlpha(0.0f);
        x50 x50Var = this.f30732r;
        x50Var.setAlpha(0.0f);
        x50Var.setScaleX(0.1f);
        x50Var.setScaleY(0.1f);
        x50Var.setTranslationX(0.0f);
        ImageView imageView = this.G;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f30734s.getPaint().setAlpha(0);
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
        ki.n0 n0Var = this.M;
        int i10 = this.J;
        ci.w2 w2Var = this.F;
        if (n0Var != null && n0Var.f13777f) {
            if (this.V == null) {
                hj0 hj0Var = new hj0(R.raw.roundcamera_flash_off, i10, i10);
                this.V = hj0Var;
                hj0Var.setCallback(w2Var);
            }
            w2Var.setImageDrawable(this.V);
            return;
        }
        if (this.U == null) {
            hj0 hj0Var2 = new hj0(R.raw.roundcamera_flash_on, i10, i10);
            this.U = hj0Var2;
            hj0Var2.setCallback(w2Var);
        }
        w2Var.setImageDrawable(this.U);
    }
}
