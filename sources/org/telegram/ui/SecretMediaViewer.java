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
public class SecretMediaViewer implements org.telegram.messenger.gs, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer f43723w1;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public mp0 E;
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
    public vq0 M;
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
    public nz0 T;
    public float T0;
    public ImageView U;
    public float U0;
    public org.telegram.ui.Components.we0 V;
    public float V0;
    public FrameLayout W;
    public float W0;
    public wo0 X;
    public float X0;
    public nq0 Y;
    public boolean Y0;
    public xp0 Z;
    public boolean Z0;
    public int f43724a;
    public int f43725a0;
    public boolean f43726a1;
    private float animationValue;
    public Activity f43727b;
    public boolean f43728b0;
    public boolean f43729b1;
    public WindowManager.LayoutParams f43730c;
    public boolean f43731c0;
    public boolean f43732c1;
    public k0 d;
    public float f43733d0;
    public boolean f43734d1;
    public ai.g0 f43735e;
    public long f43736e0;
    public boolean f43737e1;
    public View f43738f;
    public WindowInsets f43739f0;
    public org.telegram.ui.Components.ll0 f43740f1;
    public org.telegram.messenger.gj f43741g0;
    public boolean f43742g1;
    public org.telegram.messenger.ic f43743h0;
    public final fz0 f43744h1;
    public boolean f43745i0;
    public final int[] f43746i1;
    public final int[] f43748j1;
    public bg.v0 f43750k1;
    public int f43751l0;
    public boolean l1;
    public long m0;
    public int f43752m1;
    public mz0 f43753n;
    public Runnable f43754n0;
    public boolean n1;
    public boolean f43755o0;
    public Runnable f43756o1;
    public float f43757p0;
    public boolean f43758p1;
    public float f43759q0;
    public final fz0 f43760q1;
    public hi.l3 f43761r;
    public float f43762r0;
    public float[] f43763r1;
    public boolean f43764s;
    public float f43765s0;
    public final Path f43766s1;
    public float f43767t0;
    public final q0 f43768t1;
    public float f43769u0;
    public final q0 f43770u1;
    public float f43771v0;
    public boolean f43772v1;
    public long f43773w;
    public float f43774w0;
    public j4 f43775x;
    public float f43776x0;
    public TextureView f43777y;
    public float f43778y0;
    public float f43779z0;
    public final ImageReceiver h = new ImageReceiver(null);
    public boolean f43747j0 = true;
    public final PhotoBackgroundDrawable f43749k0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public ur0 f43780a;
        public int f43781b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            ur0 ur0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f43781b == 2 && (ur0Var = this.f43780a) != null) {
                    ur0Var.run();
                    this.f43780a = null;
                } else {
                    invalidateSelf();
                }
                this.f43781b++;
            }
        }

        @Override
        public void setAlpha(int i7) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            bg.v0 v0Var = secretMediaViewer.f43750k1;
            if (v0Var != null) {
                if (secretMediaViewer.f43745i0 && i7 == 255) {
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
            super.setBounds(i7, i10, i11, i12 + org.telegram.messenger.g0.f24005n);
        }

        @Override
        public final void setBounds(Rect rect) {
            rect.bottom += org.telegram.messenger.g0.f24005n;
            super.setBounds(rect);
        }
    }

    public SecretMediaViewer() {
        new Paint();
        this.f43776x0 = 1.0f;
        this.L0 = new DecelerateInterpolator(1.5f);
        this.N0 = 1.0f;
        this.f43732c1 = true;
        this.f43744h1 = new fz0(this, 2);
        this.f43746i1 = new int[2];
        this.f43748j1 = new int[2];
        this.f43760q1 = new fz0(this, 3);
        this.f43766s1 = new Path();
        this.f43768t1 = new q0("videoCrossfadeAlpha", 5);
        this.f43770u1 = new q0("animationValue", 6);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f43739f0;
        secretMediaViewer.f43739f0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f43723w1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f43723w1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f43723w1 = secretMediaViewer;
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
        if (f43723w1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f10, float f11, float f12, boolean z10) {
        if (this.f43776x0 == f10 && this.f43771v0 == f11 && this.f43774w0 == f12) {
            return;
        }
        this.f43734d1 = z10;
        this.A0 = f10;
        this.f43778y0 = f11;
        this.f43779z0 = f12;
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
        if (i7 == org.telegram.messenger.ls.f25368w) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f43741g0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f43741g0.e1()))) {
                if (this.K && !this.I) {
                    this.J = true;
                } else if (!e(true, true)) {
                    this.f43742g1 = true;
                }
            }
        } else if (i7 == org.telegram.messenger.ls.f25286i0) {
            if (this.f43741g0 != null && this.f43753n != null && ((Long) objArr[0]).longValue() == this.f43773w) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    int keyAt = sparseArray.keyAt(i11);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (this.f43741g0.e1() == ((Integer) arrayList.get(i12)).intValue()) {
                            this.f43741g0.f24177k.destroyTime = keyAt;
                            this.f43753n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ls.f25303l0 && this.f43741g0.e1() == ((TLRPC.Message) objArr[0]).f28419id) {
            if (this.K && !this.I) {
                this.J = true;
            } else if (!e(true, true)) {
                this.f43742g1 = true;
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
        return this.f43733d0;
    }

    public final void h(org.telegram.messenger.gj gjVar, vk vkVar, he heVar, bi.s2 s2Var) {
        xq0 E;
        boolean z10;
        int i7;
        int i10;
        ?? r17;
        int[] iArr;
        bg.v0 v0Var;
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
        float f11;
        File M;
        BitmapDrawable bitmapDrawable2;
        org.telegram.messenger.gc b10;
        BitmapDrawable bitmapDrawable3;
        if (this.f43727b != null && gjVar.m5() && vkVar != null && (E = vkVar.E(gjVar, null, 0, true, false)) != null) {
            if (gjVar.f24177k.ttl == Integer.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f43758p1 = z10;
            this.f43756o1 = s2Var;
            this.M = vkVar;
            System.currentTimeMillis();
            this.f43747j0 = true;
            this.f43745i0 = true;
            this.f43755o0 = false;
            j4 j4Var = this.f43775x;
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
            this.f43726a1 = false;
            this.f43729b1 = false;
            this.f43732c1 = true;
            o(this.f43776x0);
            PhotoBackgroundDrawable photoBackgroundDrawable2 = this.f43749k0;
            photoBackgroundDrawable2.setAlpha(0);
            this.f43735e.setAlpha(1.0f);
            this.f43735e.setVisibility(0);
            this.f43753n.setAlpha(1.0f);
            this.K = false;
            this.I = false;
            this.J = false;
            this.L = true;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.f22642m1 = false;
            this.N = 0;
            this.O = 0;
            RectF rectF = new RectF(E.f53898a.Q0);
            rectF.left = Math.max(rectF.left, E.f53898a.L0);
            rectF.top = Math.max(rectF.top, E.f53898a.M0);
            rectF.right = Math.min(rectF.right, E.f53898a.y());
            rectF.bottom = Math.min(rectF.bottom, E.f53898a.A());
            float width = rectF.width();
            float height = rectF.height();
            Point point = org.telegram.messenger.g0.f24010q;
            this.f43776x0 = Math.max(width / point.x, height / (point.y + org.telegram.messenger.g0.f24004m));
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
            this.f43771v0 = ((width / 2.0f) + (E.f53899b + f12)) - (i7 / 2);
            this.f43774w0 = ((height / 2.0f) + (E.f53900c + rectF.top)) - (i10 / 2);
            this.f43769u0 = Math.abs(f12 - E.f53898a.L0);
            E.d.getLocationInWindow(new int[2]);
            float f13 = (iArr[r17] - (E.f53900c + rectF.top)) + E.f53905j;
            this.f43759q0 = f13;
            float abs = (int) Math.abs(rectF.top - E.f53898a.M0);
            this.f43759q0 = Math.max(0.0f, Math.max(f13, abs));
            float height2 = (((E.f53900c + rectF.top) + ((int) height)) - (E.d.getHeight() + iArr[r17])) + E.f53904i;
            this.f43762r0 = height2;
            this.f43762r0 = Math.max(0.0f, Math.max(height2, abs));
            this.f43765s0 = 0.0f;
            this.f43765s0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.f43767t0 = 0.0f;
            this.f43767t0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.I0 = System.currentTimeMillis();
            this.f43778y0 = 0.0f;
            this.f43779z0 = 0.0f;
            this.C0 = 0.0f;
            this.E0 = 0.0f;
            this.F0 = 0.0f;
            this.B0 = 0.0f;
            this.D0 = 0.0f;
            this.A0 = 1.0f;
            boolean z13 = r17;
            this.H0 = z13;
            this.f43734d1 = z13;
            bg.v0 v0Var2 = this.f43750k1;
            if (v0Var2 != null) {
                v0Var2.a();
                this.f43750k1 = null;
            }
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                v0Var = new bg.v0(launchActivity, z13);
            } else {
                v0Var = null;
            }
            this.f43750k1 = v0Var;
            org.telegram.messenger.ls.f(this.f43724a).b(this, org.telegram.messenger.ls.f25368w);
            org.telegram.messenger.ls.f(this.f43724a).b(this, org.telegram.messenger.ls.f25303l0);
            org.telegram.messenger.ls.f(this.f43724a).b(this, org.telegram.messenger.ls.f25286i0);
            this.f43773w = org.telegram.messenger.gj.B1(gjVar.f24177k.peer_id);
            this.f43741g0 = gjVar;
            TLRPC.Document F0 = gjVar.F0();
            org.telegram.messenger.ic icVar2 = this.f43743h0;
            if (icVar2 != null) {
                icVar2.a();
                this.f43743h0 = null;
            }
            ImageReceiver imageReceiver2 = E.f53898a;
            Drawable drawable = imageReceiver2.f22618b0;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                str = imageReceiver2.Z;
            } else {
                Drawable drawable2 = imageReceiver2.f22644n0;
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
            this.f43743h0 = icVar;
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
                        this.N = tL_documentAttributeVideo.f28405w;
                        this.O = tL_documentAttributeVideo.h;
                        break;
                    }
                    i14++;
                }
                if (org.telegram.messenger.gj.s3(F0, false)) {
                    this.G.setTitle(org.telegram.messenger.hd.N0(2131751397, null));
                    String str2 = gjVar.f24177k.attachPath;
                    if (str2 != null && gjVar.f24232y0) {
                        b10 = org.telegram.messenger.gc.g(str2);
                    } else {
                        b10 = org.telegram.messenger.gc.b(F0);
                    }
                    if (this.f43743h0 != null) {
                        bitmapDrawable3 = new BitmapDrawable(this.f43743h0.f24668c);
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
                    this.f43725a0 = 1;
                    this.G.setTitle(org.telegram.messenger.hd.N0(2131751395, null));
                    File file = new File(gjVar.f24177k.attachPath);
                    if (file.exists()) {
                        i(file);
                    } else {
                        if (gjVar.D3()) {
                            org.telegram.messenger.w7.G(this.f43724a);
                            M = org.telegram.messenger.w7.J(F0, null, true, true);
                        } else {
                            org.telegram.messenger.w7.G(this.f43724a);
                            M = org.telegram.messenger.w7.M(gjVar.f24177k, false, true);
                        }
                        File file2 = new File(M.getAbsolutePath() + ".enc");
                        if (file2.exists()) {
                            M = file2;
                        }
                        i(M);
                    }
                    this.K = true;
                    this.T.setVisibility(0);
                    if (this.f43743h0 != null) {
                        bitmapDrawable2 = new BitmapDrawable(this.f43743h0.f24668c);
                    } else {
                        bitmapDrawable2 = null;
                    }
                    imageReceiver.p0(null, null, bitmapDrawable2, -1L, null, gjVar, 2);
                }
            } else {
                i11 = 2;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                f10 = 1.0f;
                this.G.setTitle(org.telegram.messenger.hd.N0(2131751396, null));
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(gjVar.f24197p0, org.telegram.messenger.g0.Z0(false), false, null, false);
                org.telegram.messenger.gc f14 = org.telegram.messenger.gc.f(w10, gjVar.f24190n0);
                if (this.f43743h0 != null) {
                    bitmapDrawable = new BitmapDrawable(this.f43743h0.f24668c);
                } else {
                    bitmapDrawable = null;
                }
                imageReceiver.p0(f14, null, bitmapDrawable, -1L, null, gjVar, 2);
                if (w10 != null) {
                    this.N = w10.f28423w;
                    this.O = w10.h;
                }
            }
            k(gjVar, "", false);
            k(gjVar, gjVar.f24235z, true);
            n(true, false);
            l(false, false);
            this.V.a(true, true);
            if (this.f43758p1) {
                mz0 mz0Var = this.f43753n;
                mz0Var.f50029e = true;
                TextPaint textPaint = mz0Var.f50032r;
                textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
                textPaint.setColor(-1);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                mz0Var.f50033s = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f11 = mz0Var.f50033s.getLineWidth(0);
                } else {
                    f11 = 0.0f;
                }
                mz0Var.f50034w = f11;
                mz0Var.f50035x = mz0Var.f50033s.getHeight();
                mz0Var.invalidate();
                this.f43753n.setOnClickListener(new oy0(this, 4));
            } else {
                this.f43753n.setOnClickListener(null);
            }
            try {
                if (this.d.getParent() != null) {
                    ((WindowManager) this.f43727b.getSystemService("window")).removeView(this.d);
                }
                z11 = true;
            } catch (Exception e10) {
                z11 = true;
                org.telegram.messenger.a8.g(e10, true);
            }
            ((WindowManager) this.f43727b.getSystemService("window")).addView(this.d, this.f43730c);
            this.f43753n.invalidate();
            this.f43764s = z11;
            Window window = this.f43727b.getWindow();
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 26) {
                z12 = c8.ed.a(window.getDecorView().getSystemUiVisibility(), 16);
            } else {
                z12 = false;
            }
            this.n1 = z12;
            org.telegram.messenger.g0.l3(this.f43727b, false);
            org.telegram.messenger.g0.n3(this.d, false);
            Activity activity = this.f43727b;
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity2 = (LaunchActivity) activity;
                if (i15 >= 26) {
                    i12 = launchActivity2.getWindow().getNavigationBarColor();
                } else {
                    i12 = 0;
                }
                this.f43752m1 = i12;
                ((LaunchActivity) this.f43727b).x(-16777216);
            } else {
                this.f43752m1 = window.getNavigationBarColor();
                Activity activity2 = this.f43727b;
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
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f43761r, property, fArr3);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.r6.d, 0, 255);
            float[] fArr4 = new float[i11];
            
            fArr4[0] = 0.0f;
            fArr4[1] = 1.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, this.f43770u1, fArr4);
            nz0 nz0Var = this.T;
            int i16 = i11;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(nz0Var, nz0Var.f50374n, f10);
            nz0 nz0Var2 = this.T;
            if (!this.K) {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(nz0Var2, property, f10);
            Animator[] animatorArr = new Animator[7];
            animatorArr[0] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[i16] = ofFloat3;
            animatorArr[3] = ofInt;
            animatorArr[4] = ofFloat4;
            animatorArr[5] = ofFloat5;
            animatorArr[6] = ofFloat6;
            animatorSet.playTogether(animatorArr);
            this.f43751l0 = 3;
            this.f43754n0 = new mc0(this, heVar, gjVar, 29);
            this.J0.setDuration(250L);
            this.J0.addListener(new lz0(this, 0));
            this.m0 = System.currentTimeMillis();
            if (org.telegram.messenger.cz.o() == 0) {
                this.f43735e.setLayerType(i16, null);
            }
            this.J0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.f43781b = 0;
            photoBackgroundDrawable.f43780a = new ur0(27, this, E);
            this.J0.start();
        }
    }

    public final void i(File file) {
        if (this.f43727b == null) {
            return;
        }
        j();
        if (this.f43777y == null) {
            j4 j4Var = new j4(this.f43727b);
            this.f43775x = j4Var;
            j4Var.setVisibility(0);
            this.f43735e.addView(this.f43775x, 0, c8.na.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f43727b);
            this.f43777y = textureView;
            textureView.setOpaque(false);
            this.f43775x.addView(this.f43777y, c8.na.e(-1, -1, 17));
        }
        this.f43728b0 = false;
        this.f43731c0 = false;
        this.f43777y.setAlpha(1.0f);
        if (this.E == null) {
            mp0 mp0Var = new mp0(this, 1);
            this.E = mp0Var;
            mp0Var.A0(this.f43777y);
            this.E.K = new ji.k(this, file, false, 19);
        }
        this.E.j0(Uri.fromFile(file), "other");
        this.E.u0(true);
        this.V.a(true, true);
    }

    public final void j() {
        mp0 mp0Var = this.E;
        if (mp0Var != null) {
            this.f43725a0 = 0;
            mp0Var.m0();
            this.E = null;
        }
        try {
            Activity activity = this.f43727b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        j4 j4Var = this.f43775x;
        if (j4Var != null) {
            this.f43735e.removeView(j4Var);
            this.f43775x = null;
        }
        if (this.f43777y != null) {
            this.f43777y = null;
        }
        this.F = false;
    }

    public final void k(org.telegram.messenger.gj gjVar, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.y5.cloneSpans(charSequence, 3);
        if (this.Z == null) {
            FrameLayout frameLayout = new FrameLayout(this.f43735e.getContext());
            this.W = frameLayout;
            this.Y.setContainer(frameLayout);
            xp0 xp0Var = new xp0(this, this.f43735e.getContext(), this.Y, this.W, 1);
            this.Z = xp0Var;
            this.Y.setScrollView(xp0Var);
            this.W.setClipChildren(false);
            this.Z.addView(this.W, new ViewGroup.LayoutParams(-1, -2));
            this.f43735e.addView(this.Z, c8.na.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.X.n(this.f43735e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.Y.getParent() != this.W) {
            this.Y.setMeasureAllChildren(true);
            this.W.addView(this.Y, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Y.getCurrentView().getText());
        nq0 nq0Var = this.Y;
        if (z10) {
            currentView = nq0Var.getNextView();
        } else {
            currentView = nq0Var.getCurrentView();
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
        xp0 xp0Var2 = this.Z;
        xp0Var2.m0 = false;
        if (z10) {
            TransitionManager.endTransitions(xp0Var2);
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
            xp0 xp0Var3 = this.Z;
            if (xp0Var3 != null) {
                xp0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i7 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.m6.P();
            TLRPC.Message message = gjVar.f24177k;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.b31.N0())) {
                if (!gjVar.f24177k.entities.isEmpty()) {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    gjVar.c(spannableString, true, false);
                    if (org.telegram.messenger.gj.L4(gjVar.f24177k)) {
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
                xp0 xp0Var4 = this.Z;
                if (xp0Var4 != null) {
                    xp0Var4.H(xp0Var4.getWidth(), xp0Var4.getHeight());
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            nq0 nq0Var2 = this.Y;
            if (this.f43747j0) {
                i7 = 0;
            }
            nq0Var2.setVisibility(i7);
        } else {
            this.Y.a(null, z10, false);
            this.Y.getCurrentView().setTextColor(-1);
            nq0 nq0Var3 = this.Y;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            nq0Var3.b(4, z12);
            this.Y.setTag(null);
        }
        if (this.Y.getCurrentView() instanceof mq0) {
            ((mq0) this.Y.getCurrentView()).setLoading(false);
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
        this.f43761r.r(true);
        if (this.K) {
            i7 = 2131743337;
        } else {
            i7 = 2131747068;
        }
        String N0 = org.telegram.messenger.hd.N0(i7, null);
        hi.l3 l3Var = this.f43761r;
        l3Var.h = hi.l3.a(N0, l3Var.getTextPaint());
        this.f43761r.v(N0);
        this.f43761r.n(12.0f, 7.0f, 11.0f, 7.0f);
        hi.l3 l3Var2 = this.f43761r;
        l3Var2.getClass();
        l3Var2.f14855f0 = org.telegram.messenger.g0.L(2);
        hi.l3 l3Var3 = this.f43761r;
        l3Var3.getClass();
        l3Var3.f14853e0 = 0.0f;
        org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(2131624021, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
        oh0Var.start();
        l3Var3.m(oh0Var);
        this.f43761r.x();
        org.telegram.messenger.np.g1().edit().putInt("viewoncehint", org.telegram.messenger.np.g1().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void n(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        fz0 fz0Var = this.f43760q1;
        org.telegram.messenger.g0.r(fz0Var);
        if (z10 && this.K) {
            org.telegram.messenger.g0.h3(fz0Var, 3000L);
        }
        if (z10) {
            this.G.setVisibility(0);
        }
        this.G.setEnabled(z10);
        this.f43747j0 = z10;
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
            nz0 nz0Var = this.T;
            q0 q0Var = nz0Var.f50374n;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(nz0Var, q0Var, f14));
            xp0 xp0Var = this.Z;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(xp0Var, property, f15));
            View view = this.S;
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
            View view2 = this.f43738f;
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
        xp0 xp0Var2 = this.Z;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        xp0Var2.setAlpha(f11);
        View view3 = this.S;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        view3.setAlpha(f12);
        View view4 = this.f43738f;
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
        int width = ((int) ((imageReceiver.N0 * f10) - this.f43735e.getWidth())) / 2;
        int height = ((int) ((imageReceiver.O0 * f10) - this.f43735e.getHeight())) / 2;
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
        if (this.f43776x0 != 1.0f) {
            this.f43740f1.a();
            this.f43740f1.c(Math.round(this.f43771v0), Math.round(this.f43774w0), Math.round(f10), Math.round(f11), (int) this.U0, (int) this.V0, (int) this.W0, (int) this.X0);
            this.f43735e.postInvalidate();
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
        if (this.f43737e1) {
            return false;
        }
        if (this.E != null && this.f43747j0 && motionEvent.getX() >= this.U.getX() && motionEvent.getY() >= this.U.getY() && motionEvent.getX() <= this.U.getX() + this.U.getMeasuredWidth() && motionEvent.getX() <= this.U.getX() + this.U.getMeasuredWidth()) {
            mp0 mp0Var = this.E;
            mp0Var.u0(!mp0Var.d.u());
            if (this.E.d.u()) {
                n(true, true);
                return true;
            }
            l(true, true);
            return true;
        }
        n(!this.f43747j0, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f10) {
        this.animationValue = f10;
        this.f43735e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f10) {
        this.f43733d0 = f10;
        this.f43735e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
