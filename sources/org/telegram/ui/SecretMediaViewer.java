package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class SecretMediaViewer implements org.telegram.messenger.fs, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer f43754w1;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public lp0 E;
    public float E0;
    public boolean F;
    public float F0;
    public org.telegram.ui.Components.v7 G;
    public int[] G0;
    public AnimatorSet H;
    public boolean H0;
    public boolean I;
    public long I0;
    public boolean J;
    public AnimatorSet J0;
    public boolean K;
    public GestureDetector K0;
    public boolean L;
    public final DecelerateInterpolator L0;
    public uq0 M;
    public float M0;
    public int N;
    public float N0;
    public int O;
    public float O0;
    public org.telegram.ui.Components.k61 P;
    public float P0;
    public uv Q;
    public float Q0;
    public org.telegram.ui.ActionBar.m5 R;
    public float R0;
    public View S;
    public float S0;
    public oz0 T;
    public float T0;
    public ImageView U;
    public float U0;
    public org.telegram.ui.Components.we0 V;
    public float V0;
    public FrameLayout W;
    public float W0;
    public vo0 X;
    public float X0;
    public mq0 Y;
    public boolean Y0;
    public wp0 Z;
    public boolean Z0;
    public int f43755a;
    public int f43756a0;
    public boolean f43757a1;
    private float animationValue;
    public Activity f43758b;
    public boolean f43759b0;
    public boolean f43760b1;
    public WindowManager.LayoutParams f43761c;
    public boolean f43762c0;
    public boolean f43763c1;
    public k0 d;
    public float f43764d0;
    public boolean f43765d1;
    public ai.l0 f43766e;
    public long f43767e0;
    public boolean f43768e1;
    public View f43769f;
    public WindowInsets f43770f0;
    public org.telegram.ui.Components.ll0 f43771f1;
    public org.telegram.messenger.fj f43772g0;
    public boolean f43773g1;
    public org.telegram.messenger.hc f43774h0;
    public final fz0 f43775h1;
    public boolean f43776i0;
    public final int[] f43777i1;
    public final int[] f43779j1;
    public bg.v0 f43781k1;
    public int f43782l0;
    public boolean l1;
    public long m0;
    public int f43783m1;
    public nz0 f43784n;
    public Runnable f43785n0;
    public boolean n1;
    public boolean f43786o0;
    public Runnable f43787o1;
    public float f43788p0;
    public boolean f43789p1;
    public float f43790q0;
    public final fz0 f43791q1;
    public hi.l3 f43792r;
    public float f43793r0;
    public float[] f43794r1;
    public boolean f43795s;
    public float f43796s0;
    public final Path f43797s1;
    public float f43798t0;
    public final q0 f43799t1;
    public float f43800u0;
    public final q0 f43801u1;
    public float f43802v0;
    public boolean f43803v1;
    public long f43804w;
    public float f43805w0;
    public j4 f43806x;
    public float f43807x0;
    public TextureView f43808y;
    public float f43809y0;
    public float f43810z0;
    public final ImageReceiver h = new ImageReceiver(null);
    public boolean f43778j0 = true;
    public final PhotoBackgroundDrawable f43780k0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public tr0 f43811a;
        public int f43812b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            tr0 tr0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f43812b == 2 && (tr0Var = this.f43811a) != null) {
                    tr0Var.run();
                    this.f43811a = null;
                } else {
                    invalidateSelf();
                }
                this.f43812b++;
            }
        }

        @Override
        public void setAlpha(int i7) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            bg.v0 v0Var = secretMediaViewer.f43781k1;
            if (v0Var != null) {
                if (secretMediaViewer.f43776i0 && i7 == 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v0Var.b(z10);
            }
            super.setAlpha(i7);
        }

        @Override
        public final void setBounds(int i7, int i10, int i11, int i12) {
            super.setBounds(i7, i10, i11, i12 + org.telegram.messenger.g0.f24141n);
        }

        @Override
        public final void setBounds(Rect rect) {
            rect.bottom += org.telegram.messenger.g0.f24141n;
            super.setBounds(rect);
        }
    }

    public SecretMediaViewer() {
        new Paint();
        this.f43807x0 = 1.0f;
        this.L0 = new DecelerateInterpolator(1.5f);
        this.N0 = 1.0f;
        this.f43763c1 = true;
        this.f43775h1 = new fz0(this, 2);
        this.f43777i1 = new int[2];
        this.f43779j1 = new int[2];
        this.f43791q1 = new fz0(this, 3);
        this.f43797s1 = new Path();
        this.f43799t1 = new q0("videoCrossfadeAlpha", 5);
        this.f43801u1 = new q0("animationValue", 6);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f43770f0;
        secretMediaViewer.f43770f0 = windowInsets;
        if (windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) {
            secretMediaViewer.d.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(org.telegram.ui.SecretMediaViewer r26, android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.b(org.telegram.ui.SecretMediaViewer, android.graphics.Canvas):void");
    }

    public static SecretMediaViewer f() {
        SecretMediaViewer secretMediaViewer;
        SecretMediaViewer secretMediaViewer2 = f43754w1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f43754w1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f43754w1 = secretMediaViewer;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return secretMediaViewer;
        }
        return secretMediaViewer2;
    }

    public static boolean g() {
        if (f43754w1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f10, float f11, float f12, boolean z10) {
        if (this.f43807x0 == f10 && this.f43802v0 == f11 && this.f43805w0 == f12) {
            return;
        }
        this.f43765d1 = z10;
        this.A0 = f10;
        this.f43809y0 = f11;
        this.f43810z0 = f12;
        this.I0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.J0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.J0.setInterpolator(this.L0);
        this.J0.setDuration(250);
        this.J0.addListener(new lz0(this, 3));
        this.J0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25238w) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f43772g0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f43772g0.e1()))) {
                if (this.K && !this.I) {
                    this.J = true;
                } else if (!e(true, true)) {
                    this.f43773g1 = true;
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25156i0) {
            if (this.f43772g0 != null && this.f43784n != null && ((Long) objArr[0]).longValue() == this.f43804w) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    int keyAt = sparseArray.keyAt(i11);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (this.f43772g0.e1() == ((Integer) arrayList.get(i12)).intValue()) {
                            this.f43772g0.f23993k.destroyTime = keyAt;
                            this.f43784n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25173l0 && this.f43772g0.e1() == ((TLRPC.Message) objArr[0]).f28452id) {
            if (this.K && !this.I) {
                this.J = true;
            } else if (!e(true, true)) {
                this.f43773g1 = true;
            }
        }
    }

    public final boolean e(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.e(boolean, boolean):boolean");
    }

    public float getAnimationValue() {
        return this.animationValue;
    }

    public float getVideoCrossfadeAlpha() {
        return this.f43764d0;
    }

    public final void h(org.telegram.messenger.fj fjVar, vk vkVar, he heVar, bi.q2 q2Var) {
        wq0 E;
        boolean z10;
        int i7;
        int i10;
        ?? r17;
        int[] iArr;
        bg.v0 v0Var;
        String str;
        Bitmap bitmap;
        org.telegram.messenger.hc hcVar;
        int i11;
        PhotoBackgroundDrawable photoBackgroundDrawable;
        float f10;
        BitmapDrawable bitmapDrawable;
        boolean z11;
        boolean z12;
        int i12;
        float f11;
        File M;
        BitmapDrawable bitmapDrawable2;
        org.telegram.messenger.fc b10;
        BitmapDrawable bitmapDrawable3;
        if (this.f43758b != null && fjVar.m5() && vkVar != null && (E = vkVar.E(fjVar, null, 0, true, false)) != null) {
            if (fjVar.f23993k.ttl == Integer.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f43789p1 = z10;
            this.f43787o1 = q2Var;
            this.M = vkVar;
            System.currentTimeMillis();
            this.f43778j0 = true;
            this.f43776i0 = true;
            this.f43786o0 = false;
            j4 j4Var = this.f43806x;
            if (j4Var != null) {
                j4Var.setVisibility(4);
            }
            j();
            this.M0 = 0.0f;
            this.N0 = 1.0f;
            this.O0 = 0.0f;
            this.P0 = 0.0f;
            this.Q0 = 0.0f;
            this.R0 = 0.0f;
            this.S0 = 0.0f;
            this.T0 = 0.0f;
            this.Y0 = false;
            this.Z0 = false;
            this.f43757a1 = false;
            this.f43760b1 = false;
            this.f43763c1 = true;
            o(this.f43807x0);
            PhotoBackgroundDrawable photoBackgroundDrawable2 = this.f43780k0;
            photoBackgroundDrawable2.setAlpha(0);
            this.f43766e.setAlpha(1.0f);
            this.f43766e.setVisibility(0);
            this.f43784n.setAlpha(1.0f);
            this.K = false;
            this.I = false;
            this.J = false;
            this.L = true;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.f22675m1 = false;
            this.N = 0;
            this.O = 0;
            RectF rectF = new RectF(E.f53493a.Q0);
            rectF.left = Math.max(rectF.left, E.f53493a.L0);
            rectF.top = Math.max(rectF.top, E.f53493a.M0);
            rectF.right = Math.min(rectF.right, E.f53493a.y());
            rectF.bottom = Math.min(rectF.bottom, E.f53493a.A());
            float width = rectF.width();
            float height = rectF.height();
            Point point = org.telegram.messenger.g0.f24146q;
            this.f43807x0 = Math.max(width / point.x, height / (point.y + org.telegram.messenger.g0.f24140m));
            int[] iArr2 = E.h;
            if (iArr2 != null) {
                this.G0 = new int[iArr2.length];
                r17 = 1;
                int i13 = 0;
                while (true) {
                    int[] iArr3 = E.h;
                    if (i13 >= iArr3.length) {
                        break;
                    }
                    this.G0[i13] = iArr3[i13];
                    i13++;
                }
            } else {
                r17 = 1;
                this.G0 = null;
            }
            float f12 = rectF.left;
            this.f43802v0 = ((width / 2.0f) + (E.f53494b + f12)) - (i7 / 2);
            this.f43805w0 = ((height / 2.0f) + (E.f53495c + rectF.top)) - (i10 / 2);
            this.f43800u0 = Math.abs(f12 - E.f53493a.L0);
            E.d.getLocationInWindow(new int[2]);
            float f13 = (iArr[r17] - (E.f53495c + rectF.top)) + E.f53500j;
            this.f43790q0 = f13;
            float abs = (int) Math.abs(rectF.top - E.f53493a.M0);
            this.f43790q0 = Math.max(0.0f, Math.max(f13, abs));
            float height2 = (((E.f53495c + rectF.top) + ((int) height)) - (E.d.getHeight() + iArr[r17])) + E.f53499i;
            this.f43793r0 = height2;
            this.f43793r0 = Math.max(0.0f, Math.max(height2, abs));
            this.f43796s0 = 0.0f;
            this.f43796s0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.f43798t0 = 0.0f;
            this.f43798t0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.I0 = System.currentTimeMillis();
            this.f43809y0 = 0.0f;
            this.f43810z0 = 0.0f;
            this.C0 = 0.0f;
            this.E0 = 0.0f;
            this.F0 = 0.0f;
            this.B0 = 0.0f;
            this.D0 = 0.0f;
            this.A0 = 1.0f;
            boolean z13 = r17;
            this.H0 = z13;
            this.f43765d1 = z13;
            bg.v0 v0Var2 = this.f43781k1;
            if (v0Var2 != null) {
                v0Var2.a();
                this.f43781k1 = null;
            }
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                v0Var = new bg.v0(launchActivity, z13);
            } else {
                v0Var = null;
            }
            this.f43781k1 = v0Var;
            org.telegram.messenger.ks.f(this.f43755a).b(this, org.telegram.messenger.ks.f25238w);
            org.telegram.messenger.ks.f(this.f43755a).b(this, org.telegram.messenger.ks.f25173l0);
            org.telegram.messenger.ks.f(this.f43755a).b(this, org.telegram.messenger.ks.f25156i0);
            this.f43804w = org.telegram.messenger.fj.B1(fjVar.f23993k.peer_id);
            this.f43772g0 = fjVar;
            TLRPC.Document F0 = fjVar.F0();
            org.telegram.messenger.hc hcVar2 = this.f43774h0;
            if (hcVar2 != null) {
                hcVar2.a();
                this.f43774h0 = null;
            }
            ImageReceiver imageReceiver2 = E.f53493a;
            Drawable drawable = imageReceiver2.f22651b0;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                str = imageReceiver2.Z;
            } else {
                Drawable drawable2 = imageReceiver2.f22677n0;
                if (drawable2 instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable2).getBitmap();
                    str = null;
                } else {
                    str = null;
                    bitmap = null;
                }
            }
            if (bitmap != null) {
                hcVar = new org.telegram.messenger.hc(bitmap, str, 0);
            } else {
                hcVar = null;
            }
            this.f43774h0 = hcVar;
            this.T.setVisibility(8);
            if (F0 != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= F0.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i14);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                        this.N = tL_documentAttributeVideo.f28438w;
                        this.O = tL_documentAttributeVideo.h;
                        break;
                    }
                    i14++;
                }
                if (org.telegram.messenger.fj.s3(F0, false)) {
                    this.G.setTitle(org.telegram.messenger.gd.N0(2131751397, null));
                    String str2 = fjVar.f23993k.attachPath;
                    if (str2 != null && fjVar.f24048y0) {
                        b10 = org.telegram.messenger.fc.g(str2);
                    } else {
                        b10 = org.telegram.messenger.fc.b(F0);
                    }
                    if (this.f43774h0 != null) {
                        bitmapDrawable3 = new BitmapDrawable(this.f43774h0.f24451c);
                    } else {
                        bitmapDrawable3 = null;
                    }
                    f10 = 1.0f;
                    photoBackgroundDrawable = photoBackgroundDrawable2;
                    i11 = 2;
                    imageReceiver.p0(b10, null, bitmapDrawable3, -1L, null, fjVar, 1);
                } else {
                    i11 = 2;
                    photoBackgroundDrawable = photoBackgroundDrawable2;
                    f10 = 1.0f;
                    this.f43756a0 = 1;
                    this.G.setTitle(org.telegram.messenger.gd.N0(2131751395, null));
                    File file = new File(fjVar.f23993k.attachPath);
                    if (file.exists()) {
                        i(file);
                    } else {
                        if (fjVar.D3()) {
                            org.telegram.messenger.w7.G(this.f43755a);
                            M = org.telegram.messenger.w7.J(F0, null, true, true);
                        } else {
                            org.telegram.messenger.w7.G(this.f43755a);
                            M = org.telegram.messenger.w7.M(fjVar.f23993k, false, true);
                        }
                        File file2 = new File(M.getAbsolutePath() + ".enc");
                        if (file2.exists()) {
                            M = file2;
                        }
                        i(M);
                    }
                    this.K = true;
                    this.T.setVisibility(0);
                    if (this.f43774h0 != null) {
                        bitmapDrawable2 = new BitmapDrawable(this.f43774h0.f24451c);
                    } else {
                        bitmapDrawable2 = null;
                    }
                    imageReceiver.p0(null, null, bitmapDrawable2, -1L, null, fjVar, 2);
                }
            } else {
                i11 = 2;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                f10 = 1.0f;
                this.G.setTitle(org.telegram.messenger.gd.N0(2131751396, null));
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(fjVar.f24013p0, org.telegram.messenger.g0.Z0(false), false, null, false);
                org.telegram.messenger.fc f14 = org.telegram.messenger.fc.f(w10, fjVar.f24006n0);
                if (this.f43774h0 != null) {
                    bitmapDrawable = new BitmapDrawable(this.f43774h0.f24451c);
                } else {
                    bitmapDrawable = null;
                }
                imageReceiver.p0(f14, null, bitmapDrawable, -1L, null, fjVar, 2);
                if (w10 != null) {
                    this.N = w10.f28456w;
                    this.O = w10.h;
                }
            }
            k(fjVar, "", false);
            k(fjVar, fjVar.f24051z, true);
            n(true, false);
            l(false, false);
            this.V.a(true, true);
            if (this.f43789p1) {
                nz0 nz0Var = this.f43784n;
                nz0Var.f50365e = true;
                TextPaint textPaint = nz0Var.f50368r;
                textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
                textPaint.setColor(-1);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                nz0Var.f50369s = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f11 = nz0Var.f50369s.getLineWidth(0);
                } else {
                    f11 = 0.0f;
                }
                nz0Var.f50370w = f11;
                nz0Var.f50371x = nz0Var.f50369s.getHeight();
                nz0Var.invalidate();
                this.f43784n.setOnClickListener(new oy0(this, 4));
            } else {
                this.f43784n.setOnClickListener(null);
            }
            try {
                if (this.d.getParent() != null) {
                    ((WindowManager) this.f43758b.getSystemService("window")).removeView(this.d);
                }
                z11 = true;
            } catch (Exception e10) {
                z11 = true;
                org.telegram.messenger.a8.g(e10, true);
            }
            ((WindowManager) this.f43758b.getSystemService("window")).addView(this.d, this.f43761c);
            this.f43784n.invalidate();
            this.f43795s = z11;
            Window window = this.f43758b.getWindow();
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 26) {
                z12 = c8.dd.a(window.getDecorView().getSystemUiVisibility(), 16);
            } else {
                z12 = false;
            }
            this.n1 = z12;
            org.telegram.messenger.g0.l3(this.f43758b, false);
            org.telegram.messenger.g0.n3(this.d, false);
            Activity activity = this.f43758b;
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity2 = (LaunchActivity) activity;
                if (i15 >= 26) {
                    i12 = launchActivity2.getWindow().getNavigationBarColor();
                } else {
                    i12 = 0;
                }
                this.f43783m1 = i12;
                ((LaunchActivity) this.f43758b).x(-16777216);
            } else {
                this.f43783m1 = window.getNavigationBarColor();
                Activity activity2 = this.f43758b;
                if (activity2 != null) {
                    org.telegram.messenger.g0.t3(activity2.getWindow(), -16777216, true, null);
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.J0 = animatorSet;
            org.telegram.ui.Components.v7 v7Var = this.G;
            Property property = View.ALPHA;
            float[] fArr = new float[i11];
            
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v7Var, property, fArr);
            float[] fArr2 = new float[i11];
            
            fArr2[0] = 0.0f;
            fArr2[1] = 1.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Z, property, fArr2);
            float[] fArr3 = new float[i11];
            
            fArr3[0] = 0.0f;
            fArr3[1] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f43792r, property, fArr3);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.r6.d, 0, 255);
            float[] fArr4 = new float[i11];
            
            fArr4[0] = 0.0f;
            fArr4[1] = 1.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, this.f43801u1, fArr4);
            oz0 oz0Var = this.T;
            int i16 = i11;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(oz0Var, oz0Var.f50688n, f10);
            oz0 oz0Var2 = this.T;
            if (!this.K) {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(oz0Var2, property, f10);
            Animator[] animatorArr = new Animator[7];
            animatorArr[0] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[i16] = ofFloat3;
            animatorArr[3] = ofInt;
            animatorArr[4] = ofFloat4;
            animatorArr[5] = ofFloat5;
            animatorArr[6] = ofFloat6;
            animatorSet.playTogether(animatorArr);
            this.f43782l0 = 3;
            this.f43785n0 = new mc0(this, heVar, fjVar, 29);
            this.J0.setDuration(250L);
            this.J0.addListener(new lz0(this, 0));
            this.m0 = System.currentTimeMillis();
            if (org.telegram.messenger.bz.o() == 0) {
                this.f43766e.setLayerType(i16, null);
            }
            this.J0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.f43812b = 0;
            photoBackgroundDrawable.f43811a = new tr0(29, this, E);
            this.J0.start();
        }
    }

    public final void i(File file) {
        if (this.f43758b == null) {
            return;
        }
        j();
        if (this.f43808y == null) {
            j4 j4Var = new j4(this.f43758b);
            this.f43806x = j4Var;
            j4Var.setVisibility(0);
            this.f43766e.addView(this.f43806x, 0, c8.ma.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f43758b);
            this.f43808y = textureView;
            textureView.setOpaque(false);
            this.f43806x.addView(this.f43808y, c8.ma.e(-1, -1, 17));
        }
        this.f43759b0 = false;
        this.f43762c0 = false;
        this.f43808y.setAlpha(1.0f);
        if (this.E == null) {
            lp0 lp0Var = new lp0(this, 1);
            this.E = lp0Var;
            lp0Var.A0(this.f43808y);
            this.E.K = new ji.l(this, file, false, 19);
        }
        this.E.j0(Uri.fromFile(file), "other");
        this.E.u0(true);
        this.V.a(true, true);
    }

    public final void j() {
        lp0 lp0Var = this.E;
        if (lp0Var != null) {
            this.f43756a0 = 0;
            lp0Var.m0();
            this.E = null;
        }
        try {
            Activity activity = this.f43758b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        j4 j4Var = this.f43806x;
        if (j4Var != null) {
            this.f43766e.removeView(j4Var);
            this.f43806x = null;
        }
        if (this.f43808y != null) {
            this.f43808y = null;
        }
        this.F = false;
    }

    public final void k(org.telegram.messenger.fj fjVar, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.y5.cloneSpans(charSequence, 3);
        if (this.Z == null) {
            FrameLayout frameLayout = new FrameLayout(this.f43766e.getContext());
            this.W = frameLayout;
            this.Y.setContainer(frameLayout);
            wp0 wp0Var = new wp0(this, this.f43766e.getContext(), this.Y, this.W, 1);
            this.Z = wp0Var;
            this.Y.setScrollView(wp0Var);
            this.W.setClipChildren(false);
            this.Z.addView(this.W, new ViewGroup.LayoutParams(-1, -2));
            this.f43766e.addView(this.Z, c8.ma.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.X.n(this.f43766e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.Y.getParent() != this.W) {
            this.Y.setMeasureAllChildren(true);
            this.W.addView(this.Y, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Y.getCurrentView().getText());
        mq0 mq0Var = this.Y;
        if (z10) {
            currentView = mq0Var.getNextView();
        } else {
            currentView = mq0Var.getCurrentView();
        }
        int maxLines = currentView.getMaxLines();
        if (maxLines == 1) {
            this.Y.getCurrentView().setSingleLine(false);
            this.Y.getNextView().setSingleLine(false);
        }
        if (maxLines != Integer.MAX_VALUE) {
            this.Y.getCurrentView().setMaxLines(Integer.MAX_VALUE);
            this.Y.getNextView().setMaxLines(Integer.MAX_VALUE);
            this.Y.getCurrentView().setEllipsize(null);
            this.Y.getNextView().setEllipsize(null);
        }
        currentView.setScrollX(0);
        wp0 wp0Var2 = this.Z;
        wp0Var2.m0 = false;
        if (z10) {
            TransitionManager.endTransitions(wp0Var2);
            TransitionSet duration = new TransitionSet().addTransition(new jz0(this, isEmpty2, isEmpty, 1)).addTransition(new jz0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.Z.m0 = true;
                duration.addTransition(new org.telegram.ui.Components.cl0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.Y);
            }
            TransitionManager.beginDelayedTransition(this.Z, duration);
            z11 = true;
        } else {
            this.Y.getCurrentView().setText((CharSequence) null);
            wp0 wp0Var3 = this.Z;
            if (wp0Var3 != null) {
                wp0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i7 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.m6.P();
            TLRPC.Message message = fjVar.f23993k;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.b31.N0())) {
                if (!fjVar.f23993k.entities.isEmpty()) {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    fjVar.c(spannableString, true, false);
                    if (org.telegram.messenger.fj.L4(fjVar.f23993k)) {
                        org.telegram.messenger.fj.h(fjVar.P3(), spannableString, false, 3, (int) fjVar.L0(), false);
                    }
                    cloneSpans = org.telegram.messenger.j6.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    cloneSpans = org.telegram.messenger.j6.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                }
            }
            this.Y.setTag(cloneSpans);
            try {
                this.Y.a(cloneSpans, z10, false);
                wp0 wp0Var4 = this.Z;
                if (wp0Var4 != null) {
                    wp0Var4.H(wp0Var4.getWidth(), wp0Var4.getHeight());
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            mq0 mq0Var2 = this.Y;
            if (this.f43778j0) {
                i7 = 0;
            }
            mq0Var2.setVisibility(i7);
        } else {
            this.Y.a(null, z10, false);
            this.Y.getCurrentView().setTextColor(-1);
            mq0 mq0Var3 = this.Y;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            mq0Var3.b(4, z12);
            this.Y.setTag(null);
        }
        if (this.Y.getCurrentView() instanceof lq0) {
            ((lq0) this.Y.getCurrentView()).setLoading(false);
        }
    }

    public final void l(boolean z10, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        if (this.K && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.l1 == z12 && z11) {
            return;
        }
        this.l1 = z12;
        this.U.animate().cancel();
        float f12 = 0.0f;
        float f13 = 0.6f;
        if (z11) {
            ViewPropertyAnimator animate = this.U.animate();
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.6f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f11);
            if (z12) {
                f13 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f13);
            if (z12) {
                f12 = 1.0f;
            }
            scaleY.alpha(f12).setDuration(340L).setInterpolator(org.telegram.ui.Components.nr.h).start();
            return;
        }
        ImageView imageView = this.U;
        if (z12) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        imageView.setScaleX(f10);
        ImageView imageView2 = this.U;
        if (z12) {
            f13 = 1.0f;
        }
        imageView2.setScaleY(f13);
        ImageView imageView3 = this.U;
        if (z12) {
            f12 = 1.0f;
        }
        imageView3.setAlpha(f12);
    }

    public final void m() {
        int i7;
        this.f43792r.r(true);
        if (this.K) {
            i7 = 2131743337;
        } else {
            i7 = 2131747068;
        }
        String N0 = org.telegram.messenger.gd.N0(i7, null);
        hi.l3 l3Var = this.f43792r;
        l3Var.h = hi.l3.a(N0, l3Var.getTextPaint());
        this.f43792r.v(N0);
        this.f43792r.n(12.0f, 7.0f, 11.0f, 7.0f);
        hi.l3 l3Var2 = this.f43792r;
        l3Var2.getClass();
        l3Var2.f14972f0 = org.telegram.messenger.g0.L(2);
        hi.l3 l3Var3 = this.f43792r;
        l3Var3.getClass();
        l3Var3.f14970e0 = 0.0f;
        org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(2131624021, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
        oh0Var.start();
        l3Var3.m(oh0Var);
        this.f43792r.x();
        org.telegram.messenger.mp.g1().edit().putInt("viewoncehint", org.telegram.messenger.mp.g1().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void n(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        fz0 fz0Var = this.f43791q1;
        org.telegram.messenger.g0.r(fz0Var);
        if (z10 && this.K) {
            org.telegram.messenger.g0.h3(fz0Var, 3000L);
        }
        if (z10) {
            this.G.setVisibility(0);
        }
        this.G.setEnabled(z10);
        this.f43778j0 = z10;
        l(z10, z11);
        float f17 = 0.0f;
        if (z11) {
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.Components.v7 v7Var = this.G;
            Property property = View.ALPHA;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(v7Var, property, f13));
            oz0 oz0Var = this.T;
            q0 q0Var = oz0Var.f50688n;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(oz0Var, q0Var, f14));
            wp0 wp0Var = this.Z;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(wp0Var, property, f15));
            View view = this.S;
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
            View view2 = this.f43769f;
            if (z10) {
                f17 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f17));
            AnimatorSet animatorSet = new AnimatorSet();
            this.H = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z10) {
                this.H.addListener(new lz0(this, 1));
            }
            this.H.setDuration(200L);
            this.H.start();
            return;
        }
        org.telegram.ui.Components.v7 v7Var2 = this.G;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v7Var2.setAlpha(f10);
        wp0 wp0Var2 = this.Z;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        wp0Var2.setAlpha(f11);
        View view3 = this.S;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        view3.setAlpha(f12);
        View view4 = this.f43769f;
        if (z10) {
            f17 = 1.0f;
        }
        view4.setAlpha(f17);
        if (!z10) {
            this.G.setVisibility(8);
            this.Z.scrollTo(0, 0);
        }
    }

    public final void o(float f10) {
        ImageReceiver imageReceiver = this.h;
        int width = ((int) ((imageReceiver.N0 * f10) - this.f43766e.getWidth())) / 2;
        int height = ((int) ((imageReceiver.O0 * f10) - this.f43766e.getHeight())) / 2;
        if (width > 0) {
            this.U0 = -width;
            this.V0 = width;
        } else {
            this.V0 = 0.0f;
            this.U0 = 0.0f;
        }
        if (height > 0) {
            this.W0 = -height;
            this.X0 = height;
            return;
        }
        this.X0 = 0.0f;
        this.W0 = 0.0f;
    }

    @Override
    public final boolean onDoubleTap(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (this.f43807x0 != 1.0f) {
            this.f43771f1.a();
            this.f43771f1.c(Math.round(this.f43802v0), Math.round(this.f43805w0), Math.round(f10), Math.round(f11), (int) this.U0, (int) this.V0, (int) this.W0, (int) this.X0);
            this.f43766e.postInvalidate();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f43768e1) {
            return false;
        }
        if (this.E != null && this.f43778j0 && motionEvent.getX() >= this.U.getX() && motionEvent.getY() >= this.U.getY() && motionEvent.getX() <= this.U.getX() + this.U.getMeasuredWidth() && motionEvent.getX() <= this.U.getX() + this.U.getMeasuredWidth()) {
            lp0 lp0Var = this.E;
            lp0Var.u0(!lp0Var.d.u());
            if (this.E.d.u()) {
                n(true, true);
                return true;
            }
            l(true, true);
            return true;
        }
        n(!this.f43778j0, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f10) {
        this.animationValue = f10;
        this.f43766e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f10) {
        this.f43764d0 = f10;
        this.f43766e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
