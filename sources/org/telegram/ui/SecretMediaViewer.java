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
public class SecretMediaViewer implements org.telegram.messenger.is, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer f43267w1;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public ip0 E;
    public float E0;
    public boolean F;
    public float F0;
    public org.telegram.ui.Components.o7 G;
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
    public sq0 M;
    public float M0;
    public int N;
    public float N0;
    public int O;
    public float O0;
    public org.telegram.ui.Components.w51 P;
    public float P0;
    public rv Q;
    public float Q0;
    public org.telegram.ui.ActionBar.j5 R;
    public float R0;
    public View S;
    public float S0;
    public jz0 T;
    public float T0;
    public ImageView U;
    public float U0;
    public org.telegram.ui.Components.ke0 V;
    public float V0;
    public FrameLayout W;
    public float W0;
    public so0 X;
    public float X0;
    public kq0 Y;
    public boolean Y0;
    public up0 Z;
    public boolean Z0;
    public int f43268a;
    public int f43269a0;
    public boolean f43270a1;
    private float animationValue;
    public Activity f43271b;
    public boolean f43272b0;
    public boolean f43273b1;
    public WindowManager.LayoutParams f43274c;
    public boolean f43275c0;
    public boolean f43276c1;
    public k0 d;
    public float f43277d0;
    public boolean f43278d1;
    public ai.j0 f43279e;
    public long f43280e0;
    public boolean f43281e1;
    public View f43282f;
    public WindowInsets f43283f0;
    public org.telegram.ui.Components.bl0 f43284f1;
    public org.telegram.messenger.gj f43285g0;
    public boolean f43286g1;
    public org.telegram.messenger.ic f43287h0;
    public final bz0 f43288h1;
    public boolean f43289i0;
    public final int[] f43290i1;
    public final int[] f43292j1;
    public bg.u0 f43294k1;
    public int f43295l0;
    public boolean l1;
    public long m0;
    public int f43296m1;
    public iz0 f43297n;
    public Runnable f43298n0;
    public boolean n1;
    public boolean f43299o0;
    public Runnable f43300o1;
    public float f43301p0;
    public boolean f43302p1;
    public float f43303q0;
    public final bz0 f43304q1;
    public hi.l3 f43305r;
    public float f43306r0;
    public float[] f43307r1;
    public boolean f43308s;
    public float f43309s0;
    public final Path f43310s1;
    public float f43311t0;
    public final q0 f43312t1;
    public float f43313u0;
    public final q0 f43314u1;
    public float f43315v0;
    public boolean f43316v1;
    public long f43317w;
    public float f43318w0;
    public j4 f43319x;
    public float f43320x0;
    public TextureView f43321y;
    public float f43322y0;
    public float f43323z0;
    public final ImageReceiver h = new ImageReceiver(null);
    public boolean f43291j0 = true;
    public final PhotoBackgroundDrawable f43293k0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public fy0 f43324a;
        public int f43325b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            fy0 fy0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f43325b == 2 && (fy0Var = this.f43324a) != null) {
                    fy0Var.run();
                    this.f43324a = null;
                } else {
                    invalidateSelf();
                }
                this.f43325b++;
            }
        }

        @Override
        public void setAlpha(int i7) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            bg.u0 u0Var = secretMediaViewer.f43294k1;
            if (u0Var != null) {
                if (secretMediaViewer.f43289i0 && i7 == 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u0Var.c(z10);
            }
            super.setAlpha(i7);
        }

        @Override
        public final void setBounds(int i7, int i10, int i11, int i12) {
            super.setBounds(i7, i10, i11, i12 + org.telegram.messenger.g0.f23604n);
        }

        @Override
        public final void setBounds(Rect rect) {
            rect.bottom += org.telegram.messenger.g0.f23604n;
            super.setBounds(rect);
        }
    }

    public SecretMediaViewer() {
        new Paint();
        this.f43320x0 = 1.0f;
        this.L0 = new DecelerateInterpolator(1.5f);
        this.N0 = 1.0f;
        this.f43276c1 = true;
        this.f43288h1 = new bz0(this, 2);
        this.f43290i1 = new int[2];
        this.f43292j1 = new int[2];
        this.f43304q1 = new bz0(this, 3);
        this.f43310s1 = new Path();
        this.f43312t1 = new q0("videoCrossfadeAlpha", 5);
        this.f43314u1 = new q0("animationValue", 6);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f43283f0;
        secretMediaViewer.f43283f0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f43267w1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f43267w1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f43267w1 = secretMediaViewer;
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
        if (f43267w1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f10, float f11, float f12, boolean z10) {
        if (this.f43320x0 == f10 && this.f43315v0 == f11 && this.f43318w0 == f12) {
            return;
        }
        this.f43278d1 = z10;
        this.A0 = f10;
        this.f43322y0 = f11;
        this.f43323z0 = f12;
        this.I0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.J0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.J0.setInterpolator(this.L0);
        this.J0.setDuration(250);
        this.J0.addListener(new hz0(this, 3));
        this.J0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25592w) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f43285g0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f43285g0.e1()))) {
                if (this.K && !this.I) {
                    this.J = true;
                } else if (!e(true, true)) {
                    this.f43286g1 = true;
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25510i0) {
            if (this.f43285g0 != null && this.f43297n != null && ((Long) objArr[0]).longValue() == this.f43317w) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    int keyAt = sparseArray.keyAt(i11);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (this.f43285g0.e1() == ((Integer) arrayList.get(i12)).intValue()) {
                            this.f43285g0.f23817k.destroyTime = keyAt;
                            this.f43297n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25527l0 && this.f43285g0.e1() == ((TLRPC.Message) objArr[0]).f28072id) {
            if (this.K && !this.I) {
                this.J = true;
            } else if (!e(true, true)) {
                this.f43286g1 = true;
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
        return this.f43277d0;
    }

    public final void h(org.telegram.messenger.gj gjVar, uk ukVar, fe feVar, bi.m1 m1Var) {
        uq0 E;
        boolean z10;
        int i7;
        int i10;
        ?? r17;
        int[] iArr;
        bg.u0 u0Var;
        String str;
        Bitmap bitmap;
        org.telegram.messenger.ic icVar;
        int i11;
        PhotoBackgroundDrawable photoBackgroundDrawable;
        float f10;
        BitmapDrawable bitmapDrawable;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        float f11;
        File M;
        BitmapDrawable bitmapDrawable2;
        org.telegram.messenger.gc b10;
        BitmapDrawable bitmapDrawable3;
        if (this.f43271b != null && gjVar.m5() && ukVar != null && (E = ukVar.E(gjVar, null, 0, true, false)) != null) {
            if (gjVar.f23817k.ttl == Integer.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f43302p1 = z10;
            this.f43300o1 = m1Var;
            this.M = ukVar;
            System.currentTimeMillis();
            this.f43291j0 = true;
            this.f43289i0 = true;
            this.f43299o0 = false;
            j4 j4Var = this.f43319x;
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
            this.f43270a1 = false;
            this.f43273b1 = false;
            this.f43276c1 = true;
            o(this.f43320x0);
            PhotoBackgroundDrawable photoBackgroundDrawable2 = this.f43293k0;
            photoBackgroundDrawable2.setAlpha(0);
            this.f43279e.setAlpha(1.0f);
            this.f43279e.setVisibility(0);
            this.f43297n.setAlpha(1.0f);
            this.K = false;
            this.I = false;
            this.J = false;
            this.L = true;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.f22284m1 = false;
            this.N = 0;
            this.O = 0;
            RectF rectF = new RectF(E.f51999a.Q0);
            rectF.left = Math.max(rectF.left, E.f51999a.L0);
            rectF.top = Math.max(rectF.top, E.f51999a.M0);
            rectF.right = Math.min(rectF.right, E.f51999a.y());
            rectF.bottom = Math.min(rectF.bottom, E.f51999a.A());
            float width = rectF.width();
            float height = rectF.height();
            Point point = org.telegram.messenger.g0.f23609q;
            this.f43320x0 = Math.max(width / point.x, height / (point.y + org.telegram.messenger.g0.f23603m));
            int[] iArr2 = E.h;
            if (iArr2 != null) {
                this.G0 = new int[iArr2.length];
                r17 = 1;
                int i14 = 0;
                while (true) {
                    int[] iArr3 = E.h;
                    if (i14 >= iArr3.length) {
                        break;
                    }
                    this.G0[i14] = iArr3[i14];
                    i14++;
                }
            } else {
                r17 = 1;
                this.G0 = null;
            }
            float f12 = rectF.left;
            this.f43315v0 = ((width / 2.0f) + (E.f52000b + f12)) - (i7 / 2);
            this.f43318w0 = ((height / 2.0f) + (E.f52001c + rectF.top)) - (i10 / 2);
            this.f43313u0 = Math.abs(f12 - E.f51999a.L0);
            E.d.getLocationInWindow(new int[2]);
            float f13 = (iArr[r17] - (E.f52001c + rectF.top)) + E.f52006j;
            this.f43303q0 = f13;
            float abs = (int) Math.abs(rectF.top - E.f51999a.M0);
            this.f43303q0 = Math.max(0.0f, Math.max(f13, abs));
            float height2 = (((E.f52001c + rectF.top) + ((int) height)) - (E.d.getHeight() + iArr[r17])) + E.f52005i;
            this.f43306r0 = height2;
            this.f43306r0 = Math.max(0.0f, Math.max(height2, abs));
            this.f43309s0 = 0.0f;
            this.f43309s0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.f43311t0 = 0.0f;
            this.f43311t0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.I0 = System.currentTimeMillis();
            this.f43322y0 = 0.0f;
            this.f43323z0 = 0.0f;
            this.C0 = 0.0f;
            this.E0 = 0.0f;
            this.F0 = 0.0f;
            this.B0 = 0.0f;
            this.D0 = 0.0f;
            this.A0 = 1.0f;
            boolean z13 = r17;
            this.H0 = z13;
            this.f43278d1 = z13;
            bg.u0 u0Var2 = this.f43294k1;
            if (u0Var2 != null) {
                u0Var2.b();
                this.f43294k1 = null;
            }
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                u0Var = new bg.u0(launchActivity, z13);
            } else {
                u0Var = null;
            }
            this.f43294k1 = u0Var;
            org.telegram.messenger.ns.f(this.f43268a).b(this, org.telegram.messenger.ns.f25592w);
            org.telegram.messenger.ns.f(this.f43268a).b(this, org.telegram.messenger.ns.f25527l0);
            org.telegram.messenger.ns.f(this.f43268a).b(this, org.telegram.messenger.ns.f25510i0);
            this.f43317w = org.telegram.messenger.gj.B1(gjVar.f23817k.peer_id);
            this.f43285g0 = gjVar;
            TLRPC.Document F0 = gjVar.F0();
            org.telegram.messenger.ic icVar2 = this.f43287h0;
            if (icVar2 != null) {
                icVar2.a();
                this.f43287h0 = null;
            }
            ImageReceiver imageReceiver2 = E.f51999a;
            Drawable drawable = imageReceiver2.f22260b0;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                str = imageReceiver2.Z;
            } else {
                Drawable drawable2 = imageReceiver2.f22286n0;
                if (drawable2 instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable2).getBitmap();
                    str = null;
                } else {
                    str = null;
                    bitmap = null;
                }
            }
            if (bitmap != null) {
                icVar = new org.telegram.messenger.ic(bitmap, str, 0);
            } else {
                icVar = null;
            }
            this.f43287h0 = icVar;
            this.T.setVisibility(8);
            if (F0 != null) {
                int i15 = 0;
                while (true) {
                    if (i15 >= F0.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i15);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                        this.N = tL_documentAttributeVideo.f28058w;
                        this.O = tL_documentAttributeVideo.h;
                        break;
                    }
                    i15++;
                }
                if (org.telegram.messenger.gj.s3(F0, false)) {
                    this.G.setTitle(org.telegram.messenger.hd.M0(2131751409, null));
                    String str2 = gjVar.f23817k.attachPath;
                    if (str2 != null && gjVar.f23872y0) {
                        b10 = org.telegram.messenger.gc.g(str2);
                    } else {
                        b10 = org.telegram.messenger.gc.b(F0);
                    }
                    if (this.f43287h0 != null) {
                        bitmapDrawable3 = new BitmapDrawable(this.f43287h0.f24374c);
                    } else {
                        bitmapDrawable3 = null;
                    }
                    f10 = 1.0f;
                    photoBackgroundDrawable = photoBackgroundDrawable2;
                    i11 = 2;
                    imageReceiver.p0(b10, null, bitmapDrawable3, -1L, null, gjVar, 1);
                } else {
                    i11 = 2;
                    photoBackgroundDrawable = photoBackgroundDrawable2;
                    f10 = 1.0f;
                    this.f43269a0 = 1;
                    this.G.setTitle(org.telegram.messenger.hd.M0(2131751407, null));
                    File file = new File(gjVar.f23817k.attachPath);
                    if (file.exists()) {
                        i(file);
                    } else {
                        if (gjVar.D3()) {
                            org.telegram.messenger.w7.G(this.f43268a);
                            M = org.telegram.messenger.w7.J(F0, null, true, true);
                        } else {
                            org.telegram.messenger.w7.G(this.f43268a);
                            M = org.telegram.messenger.w7.M(gjVar.f23817k, false, true);
                        }
                        File file2 = new File(M.getAbsolutePath() + ".enc");
                        if (file2.exists()) {
                            M = file2;
                        }
                        i(M);
                    }
                    this.K = true;
                    this.T.setVisibility(0);
                    if (this.f43287h0 != null) {
                        bitmapDrawable2 = new BitmapDrawable(this.f43287h0.f24374c);
                    } else {
                        bitmapDrawable2 = null;
                    }
                    imageReceiver.p0(null, null, bitmapDrawable2, -1L, null, gjVar, 2);
                }
            } else {
                i11 = 2;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                f10 = 1.0f;
                this.G.setTitle(org.telegram.messenger.hd.M0(2131751408, null));
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(gjVar.f23837p0, org.telegram.messenger.g0.Z0(false), false, null, false);
                org.telegram.messenger.gc f14 = org.telegram.messenger.gc.f(w10, gjVar.f23830n0);
                if (this.f43287h0 != null) {
                    bitmapDrawable = new BitmapDrawable(this.f43287h0.f24374c);
                } else {
                    bitmapDrawable = null;
                }
                imageReceiver.p0(f14, null, bitmapDrawable, -1L, null, gjVar, 2);
                if (w10 != null) {
                    this.N = w10.f28076w;
                    this.O = w10.h;
                }
            }
            k(gjVar, "", false);
            k(gjVar, gjVar.f23875z, true);
            n(true, false);
            l(false, false);
            this.V.a(true, true);
            if (this.f43302p1) {
                iz0 iz0Var = this.f43297n;
                iz0Var.f48167e = true;
                TextPaint textPaint = iz0Var.f48170r;
                textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
                textPaint.setColor(-1);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                iz0Var.f48171s = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f11 = iz0Var.f48171s.getLineWidth(0);
                } else {
                    f11 = 0.0f;
                }
                iz0Var.f48172w = f11;
                iz0Var.f48173x = iz0Var.f48171s.getHeight();
                iz0Var.invalidate();
                this.f43297n.setOnClickListener(new ky0(this, 4));
            } else {
                this.f43297n.setOnClickListener(null);
            }
            try {
                if (this.d.getParent() != null) {
                    ((WindowManager) this.f43271b.getSystemService("window")).removeView(this.d);
                }
                z11 = true;
            } catch (Exception e10) {
                z11 = true;
                org.telegram.messenger.a8.g(e10, true);
            }
            ((WindowManager) this.f43271b.getSystemService("window")).addView(this.d, this.f43274c);
            this.f43297n.invalidate();
            this.f43308s = z11;
            Window window = this.f43271b.getWindow();
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 26) {
                z12 = c8.zc.a(window.getDecorView().getSystemUiVisibility(), 16);
            } else {
                z12 = false;
            }
            this.n1 = z12;
            org.telegram.messenger.g0.m3(this.f43271b, false);
            org.telegram.messenger.g0.o3(this.d, false);
            Activity activity = this.f43271b;
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity2 = (LaunchActivity) activity;
                if (i16 >= 26) {
                    i13 = launchActivity2.getWindow().getNavigationBarColor();
                } else {
                    i13 = 0;
                }
                this.f43296m1 = i13;
                ((LaunchActivity) this.f43271b).x(-16777216);
            } else {
                this.f43296m1 = window.getNavigationBarColor();
                Activity activity2 = this.f43271b;
                if (activity2 != null) {
                    org.telegram.messenger.g0.u3(activity2.getWindow(), -16777216, true, null);
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.J0 = animatorSet;
            org.telegram.ui.Components.o7 o7Var = this.G;
            Property property = View.ALPHA;
            float[] fArr = new float[i11];
            
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o7Var, property, fArr);
            float[] fArr2 = new float[i11];
            
            fArr2[0] = 0.0f;
            fArr2[1] = 1.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Z, property, fArr2);
            float[] fArr3 = new float[i11];
            
            fArr3[0] = 0.0f;
            fArr3[1] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f43305r, property, fArr3);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.k6.d, 0, 255);
            float[] fArr4 = new float[i11];
            
            fArr4[0] = 0.0f;
            fArr4[1] = 1.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, this.f43314u1, fArr4);
            jz0 jz0Var = this.T;
            int i17 = i11;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(jz0Var, jz0Var.f48526n, f10);
            jz0 jz0Var2 = this.T;
            if (!this.K) {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(jz0Var2, property, f10);
            Animator[] animatorArr = new Animator[7];
            animatorArr[0] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[i17] = ofFloat3;
            animatorArr[3] = ofInt;
            animatorArr[4] = ofFloat4;
            animatorArr[5] = ofFloat5;
            animatorArr[6] = ofFloat6;
            animatorSet.playTogether(animatorArr);
            this.f43295l0 = 3;
            this.f43298n0 = new lc0(this, feVar, gjVar, 29);
            this.J0.setDuration(250L);
            this.J0.addListener(new hz0(this, 0));
            this.m0 = System.currentTimeMillis();
            if (org.telegram.messenger.gz.o() == 0) {
                i12 = i17;
                this.f43279e.setLayerType(i12, null);
            } else {
                i12 = i17;
            }
            this.J0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.f43325b = 0;
            photoBackgroundDrawable.f43324a = new fy0(i12, this, E);
            this.J0.start();
        }
    }

    public final void i(File file) {
        if (this.f43271b == null) {
            return;
        }
        j();
        if (this.f43321y == null) {
            j4 j4Var = new j4(this.f43271b);
            this.f43319x = j4Var;
            j4Var.setVisibility(0);
            this.f43279e.addView(this.f43319x, 0, c8.ja.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f43271b);
            this.f43321y = textureView;
            textureView.setOpaque(false);
            this.f43319x.addView(this.f43321y, c8.ja.e(-1, -1, 17));
        }
        this.f43272b0 = false;
        this.f43275c0 = false;
        this.f43321y.setAlpha(1.0f);
        if (this.E == null) {
            ip0 ip0Var = new ip0(this, 1);
            this.E = ip0Var;
            ip0Var.A0(this.f43321y);
            this.E.K = new ji.j(this, file, false, 19);
        }
        this.E.j0(Uri.fromFile(file), "other");
        this.E.u0(true);
        this.V.a(true, true);
    }

    public final void j() {
        ip0 ip0Var = this.E;
        if (ip0Var != null) {
            this.f43269a0 = 0;
            ip0Var.m0();
            this.E = null;
        }
        try {
            Activity activity = this.f43271b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        j4 j4Var = this.f43319x;
        if (j4Var != null) {
            this.f43279e.removeView(j4Var);
            this.f43319x = null;
        }
        if (this.f43321y != null) {
            this.f43321y = null;
        }
        this.F = false;
    }

    public final void k(org.telegram.messenger.gj gjVar, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.p5.cloneSpans(charSequence, 3);
        if (this.Z == null) {
            FrameLayout frameLayout = new FrameLayout(this.f43279e.getContext());
            this.W = frameLayout;
            this.Y.setContainer(frameLayout);
            up0 up0Var = new up0(this, this.f43279e.getContext(), this.Y, this.W, 1);
            this.Z = up0Var;
            this.Y.setScrollView(up0Var);
            this.W.setClipChildren(false);
            this.Z.addView(this.W, new ViewGroup.LayoutParams(-1, -2));
            this.f43279e.addView(this.Z, c8.ja.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.X.n(this.f43279e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.Y.getParent() != this.W) {
            this.Y.setMeasureAllChildren(true);
            this.W.addView(this.Y, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Y.getCurrentView().getText());
        kq0 kq0Var = this.Y;
        if (z10) {
            currentView = kq0Var.getNextView();
        } else {
            currentView = kq0Var.getCurrentView();
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
        up0 up0Var2 = this.Z;
        up0Var2.m0 = false;
        if (z10) {
            TransitionManager.endTransitions(up0Var2);
            TransitionSet duration = new TransitionSet().addTransition(new fz0(this, isEmpty2, isEmpty, 1)).addTransition(new fz0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.Z.m0 = true;
                duration.addTransition(new org.telegram.ui.Components.sk0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.Y);
            }
            TransitionManager.beginDelayedTransition(this.Z, duration);
            z11 = true;
        } else {
            this.Y.getCurrentView().setText((CharSequence) null);
            up0 up0Var3 = this.Z;
            if (up0Var3 != null) {
                up0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i7 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.j6.P();
            TLRPC.Message message = gjVar.f23817k;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.p21.M0())) {
                if (!gjVar.f23817k.entities.isEmpty()) {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    gjVar.c(spannableString, true, false);
                    if (org.telegram.messenger.gj.L4(gjVar.f23817k)) {
                        org.telegram.messenger.gj.h(gjVar.P3(), spannableString, false, 3, (int) gjVar.L0(), false);
                    }
                    cloneSpans = org.telegram.messenger.j6.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    cloneSpans = org.telegram.messenger.j6.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                }
            }
            this.Y.setTag(cloneSpans);
            try {
                this.Y.a(cloneSpans, z10, false);
                up0 up0Var4 = this.Z;
                if (up0Var4 != null) {
                    up0Var4.H(up0Var4.getWidth(), up0Var4.getHeight());
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            kq0 kq0Var2 = this.Y;
            if (this.f43291j0) {
                i7 = 0;
            }
            kq0Var2.setVisibility(i7);
        } else {
            this.Y.a(null, z10, false);
            this.Y.getCurrentView().setTextColor(-1);
            kq0 kq0Var3 = this.Y;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            kq0Var3.b(4, z12);
            this.Y.setTag(null);
        }
        if (this.Y.getCurrentView() instanceof jq0) {
            ((jq0) this.Y.getCurrentView()).setLoading(false);
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
            scaleY.alpha(f12).setDuration(340L).setInterpolator(org.telegram.ui.Components.er.h).start();
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
        this.f43305r.r(true);
        if (this.K) {
            i7 = 2131743580;
        } else {
            i7 = 2131747262;
        }
        String M0 = org.telegram.messenger.hd.M0(i7, null);
        hi.l3 l3Var = this.f43305r;
        l3Var.h = hi.l3.a(M0, l3Var.getTextPaint());
        this.f43305r.u(M0);
        this.f43305r.n(12.0f, 7.0f, 11.0f, 7.0f);
        hi.l3 l3Var2 = this.f43305r;
        l3Var2.getClass();
        l3Var2.f14557f0 = org.telegram.messenger.g0.L(2);
        hi.l3 l3Var3 = this.f43305r;
        l3Var3.getClass();
        l3Var3.f14555e0 = 0.0f;
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624021, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
        ch0Var.start();
        l3Var3.m(ch0Var);
        this.f43305r.w();
        org.telegram.messenger.np.e1().edit().putInt("viewoncehint", org.telegram.messenger.np.e1().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void n(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        bz0 bz0Var = this.f43304q1;
        org.telegram.messenger.g0.r(bz0Var);
        if (z10 && this.K) {
            org.telegram.messenger.g0.i3(bz0Var, 3000L);
        }
        if (z10) {
            this.G.setVisibility(0);
        }
        this.G.setEnabled(z10);
        this.f43291j0 = z10;
        l(z10, z11);
        float f17 = 0.0f;
        if (z11) {
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.Components.o7 o7Var = this.G;
            Property property = View.ALPHA;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(o7Var, property, f13));
            jz0 jz0Var = this.T;
            q0 q0Var = jz0Var.f48526n;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(jz0Var, q0Var, f14));
            up0 up0Var = this.Z;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(up0Var, property, f15));
            View view = this.S;
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
            View view2 = this.f43282f;
            if (z10) {
                f17 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f17));
            AnimatorSet animatorSet = new AnimatorSet();
            this.H = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z10) {
                this.H.addListener(new hz0(this, 1));
            }
            this.H.setDuration(200L);
            this.H.start();
            return;
        }
        org.telegram.ui.Components.o7 o7Var2 = this.G;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        o7Var2.setAlpha(f10);
        up0 up0Var2 = this.Z;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        up0Var2.setAlpha(f11);
        View view3 = this.S;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        view3.setAlpha(f12);
        View view4 = this.f43282f;
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
        int width = ((int) ((imageReceiver.N0 * f10) - this.f43279e.getWidth())) / 2;
        int height = ((int) ((imageReceiver.O0 * f10) - this.f43279e.getHeight())) / 2;
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
        if (this.f43320x0 != 1.0f) {
            this.f43284f1.a();
            this.f43284f1.c(Math.round(this.f43315v0), Math.round(this.f43318w0), Math.round(f10), Math.round(f11), (int) this.U0, (int) this.V0, (int) this.W0, (int) this.X0);
            this.f43279e.postInvalidate();
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
        if (this.f43281e1) {
            return false;
        }
        if (this.E != null && this.f43291j0 && motionEvent.getX() >= this.U.getX() && motionEvent.getY() >= this.U.getY() && motionEvent.getX() <= this.U.getX() + this.U.getMeasuredWidth() && motionEvent.getX() <= this.U.getX() + this.U.getMeasuredWidth()) {
            ip0 ip0Var = this.E;
            ip0Var.u0(!ip0Var.d.u());
            if (this.E.d.u()) {
                n(true, true);
                return true;
            }
            l(true, true);
            return true;
        }
        n(!this.f43291j0, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f10) {
        this.animationValue = f10;
        this.f43279e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f10) {
        this.f43277d0 = f10;
        this.f43279e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
