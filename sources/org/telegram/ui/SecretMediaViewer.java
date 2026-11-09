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
public class SecretMediaViewer implements org.telegram.messenger.ls, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer f41903v1;
    public float A0;
    public float B0;
    public float C0;
    public mp0 D;
    public float D0;
    public boolean E;
    public float E0;
    public org.telegram.ui.Components.r7 F;
    public int[] F0;
    public AnimatorSet G;
    public boolean G0;
    public boolean H;
    public long H0;
    public boolean I;
    public AnimatorSet I0;
    public boolean J;
    public GestureDetector J0;
    public boolean K;
    public final DecelerateInterpolator K0;
    public wq0 L;
    public float L0;
    public int M;
    public float M0;
    public int N;
    public float N0;
    public org.telegram.ui.Components.w51 O;
    public float O0;
    public n00 P;
    public float P0;
    public org.telegram.ui.ActionBar.l5 Q;
    public float Q0;
    public View R;
    public float R0;
    public oz0 S;
    public float S0;
    public ImageView T;
    public float T0;
    public org.telegram.ui.Components.ie0 U;
    public float U0;
    public FrameLayout V;
    public float V0;
    public wo0 W;
    public float W0;
    public nq0 X;
    public boolean X0;
    public xp0 Y;
    public boolean Y0;
    public int Z;
    public boolean Z0;
    public int f41904a;
    public boolean f41905a0;
    public boolean f41906a1;
    private float animationValue;
    public Activity f41907b;
    public boolean f41908b0;
    public boolean f41909b1;
    public WindowManager.LayoutParams f41910c;
    public float f41911c0;
    public boolean f41912c1;
    public k0 d;
    public long f41913d0;
    public boolean f41914d1;
    public bi.x5 f41915e;
    public WindowInsets f41916e0;
    public org.telegram.ui.Components.xk0 f41917e1;
    public View f41918f;
    public org.telegram.messenger.ij f41919f0;
    public boolean f41920f1;
    public org.telegram.messenger.jc f41921g0;
    public final gz0 f41922g1;
    public boolean f41923h0;
    public final int[] f41924h1;
    public final int[] f41926i1;
    public bg.v0 f41928j1;
    public int f41929k0;
    public boolean f41930k1;
    public long f41931l0;
    public int l1;
    public Runnable m0;
    public boolean f41932m1;
    public nz0 f41933n;
    public boolean f41934n0;
    public Runnable n1;
    public float f41935o0;
    public boolean f41936o1;
    public float f41937p0;
    public final gz0 f41938p1;
    public float f41939q0;
    public float[] f41940q1;
    public fi.m3 f41941r;
    public float f41942r0;
    public final Path f41943r1;
    public boolean f41944s;
    public float f41945s0;
    public final q0 f41946s1;
    public float f41947t0;
    public final q0 f41948t1;
    public float f41949u0;
    public boolean f41950u1;
    public float f41951v0;
    public long f41952w;
    public float f41953w0;
    public j4 f41954x;
    public float f41955x0;
    public TextureView f41956y;
    public float f41957y0;
    public float f41958z0;
    public final ImageReceiver h = new ImageReceiver(null);
    public boolean f41925i0 = true;
    public final PhotoBackgroundDrawable f41927j0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public ax0 f41959a;
        public int f41960b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            ax0 ax0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f41960b == 2 && (ax0Var = this.f41959a) != null) {
                    ax0Var.run();
                    this.f41959a = null;
                } else {
                    invalidateSelf();
                }
                this.f41960b++;
            }
        }

        @Override
        public void setAlpha(int i7) {
            boolean z9;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            bg.v0 v0Var = secretMediaViewer.f41928j1;
            if (v0Var != null) {
                if (secretMediaViewer.f41923h0 && i7 == 255) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                v0Var.c(z9);
            }
            super.setAlpha(i7);
        }

        @Override
        public final void setBounds(int i7, int i10, int i11, int i12) {
            super.setBounds(i7, i10, i11, i12 + org.telegram.messenger.g0.f22558n);
        }

        @Override
        public final void setBounds(Rect rect) {
            rect.bottom += org.telegram.messenger.g0.f22558n;
            super.setBounds(rect);
        }
    }

    public SecretMediaViewer() {
        new Paint();
        this.f41953w0 = 1.0f;
        this.K0 = new DecelerateInterpolator(1.5f);
        this.M0 = 1.0f;
        this.f41909b1 = true;
        this.f41922g1 = new gz0(this, 2);
        this.f41924h1 = new int[2];
        this.f41926i1 = new int[2];
        this.f41938p1 = new gz0(this, 3);
        this.f41943r1 = new Path();
        this.f41946s1 = new q0("videoCrossfadeAlpha", 5);
        this.f41948t1 = new q0("animationValue", 6);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f41916e0;
        secretMediaViewer.f41916e0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f41903v1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f41903v1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f41903v1 = secretMediaViewer;
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
        if (f41903v1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f10, float f11, float f12, boolean z9) {
        if (this.f41953w0 == f10 && this.f41949u0 == f11 && this.f41951v0 == f12) {
            return;
        }
        this.f41912c1 = z9;
        this.f41958z0 = f10;
        this.f41955x0 = f11;
        this.f41957y0 = f12;
        this.H0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.I0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.I0.setInterpolator(this.K0);
        this.I0.setDuration(250);
        this.I0.addListener(new mz0(this, 3));
        this.I0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25096w) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f41919f0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f41919f0.e1()))) {
                if (this.J && !this.H) {
                    this.I = true;
                } else if (!e(true, true)) {
                    this.f41920f1 = true;
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25014i0) {
            if (this.f41919f0 != null && this.f41933n != null && ((Long) objArr[0]).longValue() == this.f41952w) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    int keyAt = sparseArray.keyAt(i11);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (this.f41919f0.e1() == ((Integer) arrayList.get(i12)).intValue()) {
                            this.f41919f0.f23262k.destroyTime = keyAt;
                            this.f41933n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25031l0 && this.f41919f0.e1() == ((TLRPC.Message) objArr[0]).f26977id) {
            if (this.J && !this.H) {
                this.I = true;
            } else if (!e(true, true)) {
                this.f41920f1 = true;
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
        return this.f41911c0;
    }

    public final void h(org.telegram.messenger.ij ijVar, wk wkVar, ie ieVar, bi.d3 d3Var) {
        yq0 E;
        boolean z9;
        int i7;
        int i10;
        ?? r17;
        int[] iArr;
        bg.v0 v0Var;
        String str;
        Bitmap bitmap;
        org.telegram.messenger.jc jcVar;
        int i11;
        PhotoBackgroundDrawable photoBackgroundDrawable;
        float f10;
        BitmapDrawable bitmapDrawable;
        boolean z10;
        boolean z11;
        int i12;
        float f11;
        File M;
        BitmapDrawable bitmapDrawable2;
        org.telegram.messenger.hc b10;
        BitmapDrawable bitmapDrawable3;
        if (this.f41907b != null && ijVar.m5() && wkVar != null && (E = wkVar.E(ijVar, null, 0, true, false)) != null) {
            if (ijVar.f23262k.ttl == Integer.MAX_VALUE) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f41936o1 = z9;
            this.n1 = d3Var;
            this.L = wkVar;
            System.currentTimeMillis();
            this.f41925i0 = true;
            this.f41923h0 = true;
            this.f41934n0 = false;
            j4 j4Var = this.f41954x;
            if (j4Var != null) {
                j4Var.setVisibility(4);
            }
            j();
            this.L0 = 0.0f;
            this.M0 = 1.0f;
            this.N0 = 0.0f;
            this.O0 = 0.0f;
            this.P0 = 0.0f;
            this.Q0 = 0.0f;
            this.R0 = 0.0f;
            this.S0 = 0.0f;
            this.X0 = false;
            this.Y0 = false;
            this.Z0 = false;
            this.f41906a1 = false;
            this.f41909b1 = true;
            o(this.f41953w0);
            PhotoBackgroundDrawable photoBackgroundDrawable2 = this.f41927j0;
            photoBackgroundDrawable2.setAlpha(0);
            this.f41915e.setAlpha(1.0f);
            this.f41915e.setVisibility(0);
            this.f41933n.setAlpha(1.0f);
            this.J = false;
            this.H = false;
            this.I = false;
            this.K = true;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.l1 = false;
            this.M = 0;
            this.N = 0;
            RectF rectF = new RectF(E.f52159a.P0);
            rectF.left = Math.max(rectF.left, E.f52159a.K0);
            rectF.top = Math.max(rectF.top, E.f52159a.L0);
            rectF.right = Math.min(rectF.right, E.f52159a.y());
            rectF.bottom = Math.min(rectF.bottom, E.f52159a.A());
            float width = rectF.width();
            float height = rectF.height();
            Point point = org.telegram.messenger.g0.f22563q;
            this.f41953w0 = Math.max(width / point.x, height / (point.y + org.telegram.messenger.g0.f22557m));
            int[] iArr2 = E.h;
            if (iArr2 != null) {
                this.F0 = new int[iArr2.length];
                r17 = 1;
                int i13 = 0;
                while (true) {
                    int[] iArr3 = E.h;
                    if (i13 >= iArr3.length) {
                        break;
                    }
                    this.F0[i13] = iArr3[i13];
                    i13++;
                }
            } else {
                r17 = 1;
                this.F0 = null;
            }
            float f12 = rectF.left;
            this.f41949u0 = ((width / 2.0f) + (E.f52160b + f12)) - (i7 / 2);
            this.f41951v0 = ((height / 2.0f) + (E.f52161c + rectF.top)) - (i10 / 2);
            this.f41947t0 = Math.abs(f12 - E.f52159a.K0);
            E.d.getLocationInWindow(new int[2]);
            float f13 = (iArr[r17] - (E.f52161c + rectF.top)) + E.f52166j;
            this.f41937p0 = f13;
            float abs = (int) Math.abs(rectF.top - E.f52159a.L0);
            this.f41937p0 = Math.max(0.0f, Math.max(f13, abs));
            float height2 = (((E.f52161c + rectF.top) + ((int) height)) - (E.d.getHeight() + iArr[r17])) + E.f52165i;
            this.f41939q0 = height2;
            this.f41939q0 = Math.max(0.0f, Math.max(height2, abs));
            this.f41942r0 = 0.0f;
            this.f41942r0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.f41945s0 = 0.0f;
            this.f41945s0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.H0 = System.currentTimeMillis();
            this.f41955x0 = 0.0f;
            this.f41957y0 = 0.0f;
            this.B0 = 0.0f;
            this.D0 = 0.0f;
            this.E0 = 0.0f;
            this.A0 = 0.0f;
            this.C0 = 0.0f;
            this.f41958z0 = 1.0f;
            boolean z12 = r17;
            this.G0 = z12;
            this.f41912c1 = z12;
            bg.v0 v0Var2 = this.f41928j1;
            if (v0Var2 != null) {
                v0Var2.b();
                this.f41928j1 = null;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                v0Var = new bg.v0(launchActivity, z12);
            } else {
                v0Var = null;
            }
            this.f41928j1 = v0Var;
            org.telegram.messenger.qs.f(this.f41904a).b(this, org.telegram.messenger.qs.f25096w);
            org.telegram.messenger.qs.f(this.f41904a).b(this, org.telegram.messenger.qs.f25031l0);
            org.telegram.messenger.qs.f(this.f41904a).b(this, org.telegram.messenger.qs.f25014i0);
            this.f41952w = org.telegram.messenger.ij.B1(ijVar.f23262k.peer_id);
            this.f41919f0 = ijVar;
            TLRPC.Document F0 = ijVar.F0();
            org.telegram.messenger.jc jcVar2 = this.f41921g0;
            if (jcVar2 != null) {
                jcVar2.a();
                this.f41921g0 = null;
            }
            ImageReceiver imageReceiver2 = E.f52159a;
            Drawable drawable = imageReceiver2.f21178a0;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                str = imageReceiver2.Y;
            } else {
                Drawable drawable2 = imageReceiver2.m0;
                if (drawable2 instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable2).getBitmap();
                    str = null;
                } else {
                    str = null;
                    bitmap = null;
                }
            }
            if (bitmap != null) {
                jcVar = new org.telegram.messenger.jc(bitmap, str, 0);
            } else {
                jcVar = null;
            }
            this.f41921g0 = jcVar;
            this.S.setVisibility(8);
            if (F0 != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= F0.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i14);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                        this.M = tL_documentAttributeVideo.f26963w;
                        this.N = tL_documentAttributeVideo.h;
                        break;
                    }
                    i14++;
                }
                if (org.telegram.messenger.ij.s3(F0, false)) {
                    this.F.setTitle(org.telegram.messenger.id.M0(2131751409, null));
                    String str2 = ijVar.f23262k.attachPath;
                    if (str2 != null && ijVar.f23307w0) {
                        b10 = org.telegram.messenger.hc.g(str2);
                    } else {
                        b10 = org.telegram.messenger.hc.b(F0);
                    }
                    if (this.f41921g0 != null) {
                        bitmapDrawable3 = new BitmapDrawable(this.f41921g0.f23535c);
                    } else {
                        bitmapDrawable3 = null;
                    }
                    f10 = 1.0f;
                    photoBackgroundDrawable = photoBackgroundDrawable2;
                    i11 = 2;
                    imageReceiver.p0(b10, null, bitmapDrawable3, -1L, null, ijVar, 1);
                } else {
                    i11 = 2;
                    photoBackgroundDrawable = photoBackgroundDrawable2;
                    f10 = 1.0f;
                    this.Z = 1;
                    this.F.setTitle(org.telegram.messenger.id.M0(2131751407, null));
                    File file = new File(ijVar.f23262k.attachPath);
                    if (file.exists()) {
                        i(file);
                    } else {
                        if (ijVar.D3()) {
                            org.telegram.messenger.w7.G(this.f41904a);
                            M = org.telegram.messenger.w7.J(F0, null, true, true);
                        } else {
                            org.telegram.messenger.w7.G(this.f41904a);
                            M = org.telegram.messenger.w7.M(ijVar.f23262k, false, true);
                        }
                        File file2 = new File(M.getAbsolutePath() + ".enc");
                        if (file2.exists()) {
                            M = file2;
                        }
                        i(M);
                    }
                    this.J = true;
                    this.S.setVisibility(0);
                    if (this.f41921g0 != null) {
                        bitmapDrawable2 = new BitmapDrawable(this.f41921g0.f23535c);
                    } else {
                        bitmapDrawable2 = null;
                    }
                    imageReceiver.p0(null, null, bitmapDrawable2, -1L, null, ijVar, 2);
                }
            } else {
                i11 = 2;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                f10 = 1.0f;
                this.F.setTitle(org.telegram.messenger.id.M0(2131751408, null));
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ijVar.f23273n0, org.telegram.messenger.g0.Z0(false), false, null, false);
                org.telegram.messenger.hc f14 = org.telegram.messenger.hc.f(w10, ijVar.f23267l0);
                if (this.f41921g0 != null) {
                    bitmapDrawable = new BitmapDrawable(this.f41921g0.f23535c);
                } else {
                    bitmapDrawable = null;
                }
                imageReceiver.p0(f14, null, bitmapDrawable, -1L, null, ijVar, 2);
                if (w10 != null) {
                    this.M = w10.f26981w;
                    this.N = w10.h;
                }
            }
            k(ijVar, "", false);
            k(ijVar, ijVar.f23318z, true);
            n(true, false);
            l(false, false);
            this.U.a(true, true);
            if (this.f41936o1) {
                nz0 nz0Var = this.f41933n;
                nz0Var.f48256e = true;
                TextPaint textPaint = nz0Var.f48259r;
                textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
                textPaint.setColor(-1);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                nz0Var.f48260s = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f11 = nz0Var.f48260s.getLineWidth(0);
                } else {
                    f11 = 0.0f;
                }
                nz0Var.f48261w = f11;
                nz0Var.f48262x = nz0Var.f48260s.getHeight();
                nz0Var.invalidate();
                this.f41933n.setOnClickListener(new py0(this, 4));
            } else {
                this.f41933n.setOnClickListener(null);
            }
            try {
                if (this.d.getParent() != null) {
                    ((WindowManager) this.f41907b.getSystemService("window")).removeView(this.d);
                }
                z10 = true;
            } catch (Exception e10) {
                z10 = true;
                org.telegram.messenger.a8.g(e10, true);
            }
            ((WindowManager) this.f41907b.getSystemService("window")).addView(this.d, this.f41910c);
            this.f41933n.invalidate();
            this.f41944s = z10;
            Window window = this.f41907b.getWindow();
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 26) {
                z11 = c8.zc.a(window.getDecorView().getSystemUiVisibility(), 16);
            } else {
                z11 = false;
            }
            this.f41932m1 = z11;
            org.telegram.messenger.g0.m3(this.f41907b, false);
            org.telegram.messenger.g0.o3(this.d, false);
            Activity activity = this.f41907b;
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity2 = (LaunchActivity) activity;
                if (i15 >= 26) {
                    i12 = launchActivity2.getWindow().getNavigationBarColor();
                } else {
                    i12 = 0;
                }
                this.l1 = i12;
                ((LaunchActivity) this.f41907b).x(-16777216);
            } else {
                this.l1 = window.getNavigationBarColor();
                org.telegram.messenger.g0.t3(this.f41907b, -16777216, true);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.I0 = animatorSet;
            org.telegram.ui.Components.r7 r7Var = this.F;
            Property property = View.ALPHA;
            float[] fArr = new float[i11];
            
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r7Var, property, fArr);
            float[] fArr2 = new float[i11];
            
            fArr2[0] = 0.0f;
            fArr2[1] = 1.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Y, property, fArr2);
            float[] fArr3 = new float[i11];
            
            fArr3[0] = 0.0f;
            fArr3[1] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f41941r, property, fArr3);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.m6.d, 0, 255);
            float[] fArr4 = new float[i11];
            
            fArr4[0] = 0.0f;
            fArr4[1] = 1.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, this.f41948t1, fArr4);
            oz0 oz0Var = this.S;
            int i16 = i11;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(oz0Var, oz0Var.f48573n, f10);
            oz0 oz0Var2 = this.S;
            if (!this.J) {
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
            this.f41929k0 = 3;
            this.m0 = new oc0(this, ieVar, ijVar, 29);
            this.I0.setDuration(250L);
            this.I0.addListener(new mz0(this, 0));
            this.f41931l0 = System.currentTimeMillis();
            if (org.telegram.messenger.iz.o() == 0) {
                this.f41915e.setLayerType(i16, null);
            }
            this.I0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.f41960b = 0;
            photoBackgroundDrawable.f41959a = new ax0(6, this, E);
            this.I0.start();
        }
    }

    public final void i(File file) {
        if (this.f41907b == null) {
            return;
        }
        j();
        if (this.f41956y == null) {
            j4 j4Var = new j4(this.f41907b);
            this.f41954x = j4Var;
            j4Var.setVisibility(0);
            this.f41915e.addView(this.f41954x, 0, c8.ha.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f41907b);
            this.f41956y = textureView;
            textureView.setOpaque(false);
            this.f41954x.addView(this.f41956y, c8.ha.e(-1, -1, 17));
        }
        this.f41905a0 = false;
        this.f41908b0 = false;
        this.f41956y.setAlpha(1.0f);
        if (this.D == null) {
            mp0 mp0Var = new mp0(this, 1);
            this.D = mp0Var;
            mp0Var.A0(this.f41956y);
            this.D.J = new j2.n(21, this, file);
        }
        this.D.j0(Uri.fromFile(file), "other");
        this.D.u0(true);
        this.U.a(true, true);
    }

    public final void j() {
        mp0 mp0Var = this.D;
        if (mp0Var != null) {
            this.Z = 0;
            mp0Var.m0();
            this.D = null;
        }
        try {
            Activity activity = this.f41907b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        j4 j4Var = this.f41954x;
        if (j4Var != null) {
            this.f41915e.removeView(j4Var);
            this.f41954x = null;
        }
        if (this.f41956y != null) {
            this.f41956y = null;
        }
        this.E = false;
    }

    public final void k(org.telegram.messenger.ij ijVar, CharSequence charSequence, boolean z9) {
        TextView currentView;
        boolean z10;
        CharSequence cloneSpans = org.telegram.ui.Components.r5.cloneSpans(charSequence, 3);
        if (this.Y == null) {
            FrameLayout frameLayout = new FrameLayout(this.f41915e.getContext());
            this.V = frameLayout;
            this.X.setContainer(frameLayout);
            xp0 xp0Var = new xp0(this, this.f41915e.getContext(), this.X, this.V, 1);
            this.Y = xp0Var;
            this.X.setScrollView(xp0Var);
            this.V.setClipChildren(false);
            this.Y.addView(this.V, new ViewGroup.LayoutParams(-1, -2));
            this.f41915e.addView(this.Y, c8.ha.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.W.n(this.f41915e.getContext()).bringToFront();
        }
        boolean z11 = true;
        if (this.X.getParent() != this.V) {
            this.X.setMeasureAllChildren(true);
            this.V.addView(this.X, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.X.getCurrentView().getText());
        nq0 nq0Var = this.X;
        if (z9) {
            currentView = nq0Var.getNextView();
        } else {
            currentView = nq0Var.getCurrentView();
        }
        int maxLines = currentView.getMaxLines();
        if (maxLines == 1) {
            this.X.getCurrentView().setSingleLine(false);
            this.X.getNextView().setSingleLine(false);
        }
        if (maxLines != Integer.MAX_VALUE) {
            this.X.getCurrentView().setMaxLines(Integer.MAX_VALUE);
            this.X.getNextView().setMaxLines(Integer.MAX_VALUE);
            this.X.getCurrentView().setEllipsize(null);
            this.X.getNextView().setEllipsize(null);
        }
        currentView.setScrollX(0);
        xp0 xp0Var2 = this.Y;
        xp0Var2.f47350l0 = false;
        if (z9) {
            TransitionManager.endTransitions(xp0Var2);
            TransitionSet duration = new TransitionSet().addTransition(new kz0(this, isEmpty2, isEmpty, 1)).addTransition(new kz0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.Y.f47350l0 = true;
                duration.addTransition(new org.telegram.ui.Components.ok0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.X);
            }
            TransitionManager.beginDelayedTransition(this.Y, duration);
            z10 = true;
        } else {
            this.X.getCurrentView().setText((CharSequence) null);
            xp0 xp0Var3 = this.Y;
            if (xp0Var3 != null) {
                xp0Var3.scrollTo(0, 0);
            }
            z10 = false;
        }
        int i7 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.l6.P();
            TLRPC.Message message = ijVar.f23262k;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.l21.M0())) {
                if (!ijVar.f23262k.entities.isEmpty()) {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    ijVar.c(spannableString, true, false);
                    if (org.telegram.messenger.ij.L4(ijVar.f23262k)) {
                        org.telegram.messenger.ij.h(ijVar.P3(), spannableString, false, 3, (int) ijVar.L0(), false);
                    }
                    cloneSpans = org.telegram.messenger.i6.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    cloneSpans = org.telegram.messenger.i6.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                }
            }
            this.X.setTag(cloneSpans);
            try {
                this.X.a(cloneSpans, z9, false);
                xp0 xp0Var4 = this.Y;
                if (xp0Var4 != null) {
                    xp0Var4.H(xp0Var4.getWidth(), xp0Var4.getHeight());
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            nq0 nq0Var2 = this.X;
            if (this.f41925i0) {
                i7 = 0;
            }
            nq0Var2.setVisibility(i7);
        } else {
            this.X.a(null, z9, false);
            this.X.getCurrentView().setTextColor(-1);
            nq0 nq0Var3 = this.X;
            if (z10 && !isEmpty2) {
                z11 = false;
            }
            nq0Var3.b(4, z11);
            this.X.setTag(null);
        }
        if (this.X.getCurrentView() instanceof mq0) {
            ((mq0) this.X.getCurrentView()).setLoading(false);
        }
    }

    public final void l(boolean z9, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        if (this.J && z9) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f41930k1 == z11 && z10) {
            return;
        }
        this.f41930k1 = z11;
        this.T.animate().cancel();
        float f12 = 0.0f;
        float f13 = 0.6f;
        if (z10) {
            ViewPropertyAnimator animate = this.T.animate();
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.6f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f11);
            if (z11) {
                f13 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f13);
            if (z11) {
                f12 = 1.0f;
            }
            scaleY.alpha(f12).setDuration(340L).setInterpolator(org.telegram.ui.Components.xq.h).start();
            return;
        }
        ImageView imageView = this.T;
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        imageView.setScaleX(f10);
        ImageView imageView2 = this.T;
        if (z11) {
            f13 = 1.0f;
        }
        imageView2.setScaleY(f13);
        ImageView imageView3 = this.T;
        if (z11) {
            f12 = 1.0f;
        }
        imageView3.setAlpha(f12);
    }

    public final void m() {
        int i7;
        this.f41941r.r(true);
        if (this.J) {
            i7 = 2131743580;
        } else {
            i7 = 2131747262;
        }
        String M0 = org.telegram.messenger.id.M0(i7, null);
        fi.m3 m3Var = this.f41941r;
        m3Var.h = fi.m3.a(M0, m3Var.getTextPaint());
        this.f41941r.u(M0);
        this.f41941r.n(12.0f, 7.0f, 11.0f, 7.0f);
        fi.m3 m3Var2 = this.f41941r;
        m3Var2.getClass();
        m3Var2.f12424e0 = org.telegram.messenger.g0.L(2);
        fi.m3 m3Var3 = this.f41941r;
        m3Var3.getClass();
        m3Var3.f12422d0 = 0.0f;
        org.telegram.ui.Components.ah0 ah0Var = new org.telegram.ui.Components.ah0(2131624020, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
        ah0Var.start();
        m3Var3.m(ah0Var);
        this.f41941r.w();
        org.telegram.messenger.qp.e1().edit().putInt("viewoncehint", org.telegram.messenger.qp.e1().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void n(boolean z9, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        gz0 gz0Var = this.f41938p1;
        org.telegram.messenger.g0.r(gz0Var);
        if (z9 && this.J) {
            org.telegram.messenger.g0.i3(gz0Var, 3000L);
        }
        if (z9) {
            this.F.setVisibility(0);
        }
        this.F.setEnabled(z9);
        this.f41925i0 = z9;
        l(z9, z10);
        float f17 = 0.0f;
        if (z10) {
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.Components.r7 r7Var = this.F;
            Property property = View.ALPHA;
            if (z9) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(r7Var, property, f13));
            oz0 oz0Var = this.S;
            q0 q0Var = oz0Var.f48573n;
            if (z9) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(oz0Var, q0Var, f14));
            xp0 xp0Var = this.Y;
            if (z9) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(xp0Var, property, f15));
            View view = this.R;
            if (z9) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
            View view2 = this.f41918f;
            if (z9) {
                f17 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f17));
            AnimatorSet animatorSet = new AnimatorSet();
            this.G = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z9) {
                this.G.addListener(new mz0(this, 1));
            }
            this.G.setDuration(200L);
            this.G.start();
            return;
        }
        org.telegram.ui.Components.r7 r7Var2 = this.F;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        r7Var2.setAlpha(f10);
        xp0 xp0Var2 = this.Y;
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        xp0Var2.setAlpha(f11);
        View view3 = this.R;
        if (z9) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        view3.setAlpha(f12);
        View view4 = this.f41918f;
        if (z9) {
            f17 = 1.0f;
        }
        view4.setAlpha(f17);
        if (!z9) {
            this.F.setVisibility(8);
            this.Y.scrollTo(0, 0);
        }
    }

    public final void o(float f10) {
        ImageReceiver imageReceiver = this.h;
        int width = ((int) ((imageReceiver.M0 * f10) - this.f41915e.getWidth())) / 2;
        int height = ((int) ((imageReceiver.N0 * f10) - this.f41915e.getHeight())) / 2;
        if (width > 0) {
            this.T0 = -width;
            this.U0 = width;
        } else {
            this.U0 = 0.0f;
            this.T0 = 0.0f;
        }
        if (height > 0) {
            this.V0 = -height;
            this.W0 = height;
            return;
        }
        this.W0 = 0.0f;
        this.V0 = 0.0f;
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
        if (this.f41953w0 != 1.0f) {
            this.f41917e1.a();
            this.f41917e1.c(Math.round(this.f41949u0), Math.round(this.f41951v0), Math.round(f10), Math.round(f11), (int) this.T0, (int) this.U0, (int) this.V0, (int) this.W0);
            this.f41915e.postInvalidate();
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
        if (this.f41914d1) {
            return false;
        }
        if (this.D != null && this.f41925i0 && motionEvent.getX() >= this.T.getX() && motionEvent.getY() >= this.T.getY() && motionEvent.getX() <= this.T.getX() + this.T.getMeasuredWidth() && motionEvent.getX() <= this.T.getX() + this.T.getMeasuredWidth()) {
            mp0 mp0Var = this.D;
            mp0Var.u0(!mp0Var.d.u());
            if (this.D.d.u()) {
                n(true, true);
                return true;
            }
            l(true, true);
            return true;
        }
        n(!this.f41925i0, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f10) {
        this.animationValue = f10;
        this.f41915e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f10) {
        this.f41911c0 = f10;
        this.f41915e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
