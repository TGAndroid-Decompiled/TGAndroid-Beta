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
    public static volatile SecretMediaViewer f41868v1;
    public float A0;
    public float B0;
    public float C0;
    public jp0 D;
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
    public tq0 L;
    public float L0;
    public int M;
    public float M0;
    public int N;
    public float N0;
    public org.telegram.ui.Components.q51 O;
    public float O0;
    public l00 P;
    public float P0;
    public org.telegram.ui.ActionBar.k5 Q;
    public float Q0;
    public View R;
    public float R0;
    public lz0 S;
    public float S0;
    public ImageView T;
    public float T0;
    public org.telegram.ui.Components.he0 U;
    public float U0;
    public FrameLayout V;
    public float V0;
    public to0 W;
    public float W0;
    public kq0 X;
    public boolean X0;
    public up0 Y;
    public boolean Y0;
    public int Z;
    public boolean Z0;
    public int f41869a;
    public boolean f41870a0;
    public boolean f41871a1;
    private float animationValue;
    public Activity f41872b;
    public boolean f41873b0;
    public boolean f41874b1;
    public WindowManager.LayoutParams f41875c;
    public float f41876c0;
    public boolean f41877c1;
    public k0 d;
    public long f41878d0;
    public boolean f41879d1;
    public bi.x5 f41880e;
    public WindowInsets f41881e0;
    public org.telegram.ui.Components.wk0 f41882e1;
    public View f41883f;
    public org.telegram.messenger.ij f41884f0;
    public boolean f41885f1;
    public org.telegram.messenger.jc f41886g0;
    public final dz0 f41887g1;
    public boolean f41888h0;
    public final int[] f41889h1;
    public final int[] f41891i1;
    public bg.v0 f41893j1;
    public int f41894k0;
    public boolean f41895k1;
    public long f41896l0;
    public int l1;
    public Runnable m0;
    public boolean f41897m1;
    public kz0 f41898n;
    public boolean f41899n0;
    public Runnable n1;
    public float f41900o0;
    public boolean f41901o1;
    public float f41902p0;
    public final dz0 f41903p1;
    public float f41904q0;
    public float[] f41905q1;
    public fi.m3 f41906r;
    public float f41907r0;
    public final Path f41908r1;
    public boolean f41909s;
    public float f41910s0;
    public final q0 f41911s1;
    public float f41912t0;
    public final q0 f41913t1;
    public float f41914u0;
    public boolean f41915u1;
    public float f41916v0;
    public long f41917w;
    public float f41918w0;
    public j4 f41919x;
    public float f41920x0;
    public TextureView f41921y;
    public float f41922y0;
    public float f41923z0;
    public final ImageReceiver h = new ImageReceiver(null);
    public boolean f41890i0 = true;
    public final PhotoBackgroundDrawable f41892j0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public by0 f41924a;
        public int f41925b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            by0 by0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f41925b == 2 && (by0Var = this.f41924a) != null) {
                    by0Var.run();
                    this.f41924a = null;
                } else {
                    invalidateSelf();
                }
                this.f41925b++;
            }
        }

        @Override
        public void setAlpha(int i7) {
            boolean z9;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            bg.v0 v0Var = secretMediaViewer.f41893j1;
            if (v0Var != null) {
                if (secretMediaViewer.f41888h0 && i7 == 255) {
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
            super.setBounds(i7, i10, i11, i12 + org.telegram.messenger.g0.f22532n);
        }

        @Override
        public final void setBounds(Rect rect) {
            rect.bottom += org.telegram.messenger.g0.f22532n;
            super.setBounds(rect);
        }
    }

    public SecretMediaViewer() {
        new Paint();
        this.f41918w0 = 1.0f;
        this.K0 = new DecelerateInterpolator(1.5f);
        this.M0 = 1.0f;
        this.f41874b1 = true;
        this.f41887g1 = new dz0(this, 2);
        this.f41889h1 = new int[2];
        this.f41891i1 = new int[2];
        this.f41903p1 = new dz0(this, 3);
        this.f41908r1 = new Path();
        this.f41911s1 = new q0("videoCrossfadeAlpha", 5);
        this.f41913t1 = new q0("animationValue", 6);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f41881e0;
        secretMediaViewer.f41881e0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f41868v1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f41868v1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f41868v1 = secretMediaViewer;
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
        if (f41868v1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f10, float f11, float f12, boolean z9) {
        if (this.f41918w0 == f10 && this.f41914u0 == f11 && this.f41916v0 == f12) {
            return;
        }
        this.f41877c1 = z9;
        this.f41923z0 = f10;
        this.f41920x0 = f11;
        this.f41922y0 = f12;
        this.H0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.I0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.I0.setInterpolator(this.K0);
        this.I0.setDuration(250);
        this.I0.addListener(new jz0(this, 3));
        this.I0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25079w) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f41884f0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f41884f0.f1()))) {
                if (this.J && !this.H) {
                    this.I = true;
                } else if (!e(true, true)) {
                    this.f41885f1 = true;
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f24997i0) {
            if (this.f41884f0 != null && this.f41898n != null && ((Long) objArr[0]).longValue() == this.f41917w) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    int keyAt = sparseArray.keyAt(i11);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (this.f41884f0.f1() == ((Integer) arrayList.get(i12)).intValue()) {
                            this.f41884f0.f23237k.destroyTime = keyAt;
                            this.f41898n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25014l0 && this.f41884f0.f1() == ((TLRPC.Message) objArr[0]).f26973id) {
            if (this.J && !this.H) {
                this.I = true;
            } else if (!e(true, true)) {
                this.f41885f1 = true;
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
        return this.f41876c0;
    }

    public final void h(org.telegram.messenger.ij ijVar, uk ukVar, ie ieVar, bi.d3 d3Var) {
        vq0 E;
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
        BitmapDrawable bitmapDrawable2;
        org.telegram.messenger.hc b10;
        BitmapDrawable bitmapDrawable3;
        if (this.f41872b != null && ijVar.n5() && ukVar != null && (E = ukVar.E(ijVar, null, 0, true, false)) != null) {
            if (ijVar.f23237k.ttl == Integer.MAX_VALUE) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f41901o1 = z9;
            this.n1 = d3Var;
            this.L = ukVar;
            System.currentTimeMillis();
            this.f41890i0 = true;
            this.f41888h0 = true;
            this.f41899n0 = false;
            j4 j4Var = this.f41919x;
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
            this.f41871a1 = false;
            this.f41874b1 = true;
            o(this.f41918w0);
            PhotoBackgroundDrawable photoBackgroundDrawable2 = this.f41892j0;
            photoBackgroundDrawable2.setAlpha(0);
            this.f41880e.setAlpha(1.0f);
            this.f41880e.setVisibility(0);
            this.f41898n.setAlpha(1.0f);
            this.J = false;
            this.H = false;
            this.I = false;
            this.K = true;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.l1 = false;
            this.M = 0;
            this.N = 0;
            RectF rectF = new RectF(E.f50790a.P0);
            rectF.left = Math.max(rectF.left, E.f50790a.K0);
            rectF.top = Math.max(rectF.top, E.f50790a.L0);
            rectF.right = Math.min(rectF.right, E.f50790a.y());
            rectF.bottom = Math.min(rectF.bottom, E.f50790a.A());
            float width = rectF.width();
            float height = rectF.height();
            Point point = org.telegram.messenger.g0.f22537q;
            this.f41918w0 = Math.max(width / point.x, height / (point.y + org.telegram.messenger.g0.f22531m));
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
            this.f41914u0 = ((width / 2.0f) + (E.f50791b + f12)) - (i7 / 2);
            this.f41916v0 = ((height / 2.0f) + (E.f50792c + rectF.top)) - (i10 / 2);
            this.f41912t0 = Math.abs(f12 - E.f50790a.K0);
            E.d.getLocationInWindow(new int[2]);
            float f13 = (iArr[r17] - (E.f50792c + rectF.top)) + E.f50797j;
            this.f41902p0 = f13;
            float abs = (int) Math.abs(rectF.top - E.f50790a.L0);
            this.f41902p0 = Math.max(0.0f, Math.max(f13, abs));
            float height2 = (((E.f50792c + rectF.top) + ((int) height)) - (E.d.getHeight() + iArr[r17])) + E.f50796i;
            this.f41904q0 = height2;
            this.f41904q0 = Math.max(0.0f, Math.max(height2, abs));
            this.f41907r0 = 0.0f;
            this.f41907r0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.f41910s0 = 0.0f;
            this.f41910s0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.H0 = System.currentTimeMillis();
            this.f41920x0 = 0.0f;
            this.f41922y0 = 0.0f;
            this.B0 = 0.0f;
            this.D0 = 0.0f;
            this.E0 = 0.0f;
            this.A0 = 0.0f;
            this.C0 = 0.0f;
            this.f41923z0 = 1.0f;
            boolean z12 = r17;
            this.G0 = z12;
            this.f41877c1 = z12;
            bg.v0 v0Var2 = this.f41893j1;
            if (v0Var2 != null) {
                v0Var2.b();
                this.f41893j1 = null;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                v0Var = new bg.v0(launchActivity, z12);
            } else {
                v0Var = null;
            }
            this.f41893j1 = v0Var;
            org.telegram.messenger.qs.f(this.f41869a).b(this, org.telegram.messenger.qs.f25079w);
            org.telegram.messenger.qs.f(this.f41869a).b(this, org.telegram.messenger.qs.f25014l0);
            org.telegram.messenger.qs.f(this.f41869a).b(this, org.telegram.messenger.qs.f24997i0);
            this.f41917w = org.telegram.messenger.ij.C1(ijVar.f23237k.peer_id);
            this.f41884f0 = ijVar;
            TLRPC.Document F0 = ijVar.F0();
            org.telegram.messenger.jc jcVar2 = this.f41886g0;
            if (jcVar2 != null) {
                jcVar2.a();
                this.f41886g0 = null;
            }
            ImageReceiver imageReceiver2 = E.f50790a;
            Drawable drawable = imageReceiver2.f21175a0;
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
            this.f41886g0 = jcVar;
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
                        this.M = tL_documentAttributeVideo.f26959w;
                        this.N = tL_documentAttributeVideo.h;
                        break;
                    }
                    i14++;
                }
                if (org.telegram.messenger.ij.t3(F0, false)) {
                    this.F.setTitle(org.telegram.messenger.hd.M0(2131751410, null));
                    String str2 = ijVar.f23237k.attachPath;
                    if (str2 != null && ijVar.f23282w0) {
                        b10 = org.telegram.messenger.hc.g(str2);
                    } else {
                        b10 = org.telegram.messenger.hc.b(F0);
                    }
                    if (this.f41886g0 != null) {
                        bitmapDrawable3 = new BitmapDrawable(this.f41886g0.f23509c);
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
                    this.F.setTitle(org.telegram.messenger.hd.M0(2131751408, null));
                    File file = new File(ijVar.f23237k.attachPath);
                    if (file.exists()) {
                        i(file);
                    } else {
                        org.telegram.messenger.w7.G(this.f41869a);
                        File N = org.telegram.messenger.w7.N(ijVar.f23237k, false, true);
                        File file2 = new File(N.getAbsolutePath() + ".enc");
                        if (file2.exists()) {
                            N = file2;
                        }
                        i(N);
                    }
                    this.J = true;
                    this.S.setVisibility(0);
                    if (this.f41886g0 != null) {
                        bitmapDrawable2 = new BitmapDrawable(this.f41886g0.f23509c);
                    } else {
                        bitmapDrawable2 = null;
                    }
                    imageReceiver.p0(null, null, bitmapDrawable2, -1L, null, ijVar, 2);
                }
            } else {
                i11 = 2;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                f10 = 1.0f;
                this.F.setTitle(org.telegram.messenger.hd.M0(2131751409, null));
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ijVar.f23248n0, org.telegram.messenger.g0.Z0(false), false, null, false);
                org.telegram.messenger.hc f14 = org.telegram.messenger.hc.f(w10, ijVar.f23242l0);
                if (this.f41886g0 != null) {
                    bitmapDrawable = new BitmapDrawable(this.f41886g0.f23509c);
                } else {
                    bitmapDrawable = null;
                }
                imageReceiver.p0(f14, null, bitmapDrawable, -1L, null, ijVar, 2);
                if (w10 != null) {
                    this.M = w10.f26977w;
                    this.N = w10.h;
                }
            }
            k(ijVar, "", false);
            k(ijVar, ijVar.f23293z, true);
            n(true, false);
            l(false, false);
            this.U.a(true, true);
            if (this.f41901o1) {
                kz0 kz0Var = this.f41898n;
                kz0Var.f47336e = true;
                TextPaint textPaint = kz0Var.f47339r;
                textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
                textPaint.setColor(-1);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                kz0Var.f47340s = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f11 = kz0Var.f47340s.getLineWidth(0);
                } else {
                    f11 = 0.0f;
                }
                kz0Var.f47341w = f11;
                kz0Var.f47342x = kz0Var.f47340s.getHeight();
                kz0Var.invalidate();
                this.f41898n.setOnClickListener(new my0(this, 4));
            } else {
                this.f41898n.setOnClickListener(null);
            }
            try {
                if (this.d.getParent() != null) {
                    ((WindowManager) this.f41872b.getSystemService("window")).removeView(this.d);
                }
                z10 = true;
            } catch (Exception e10) {
                z10 = true;
                org.telegram.messenger.a8.g(e10, true);
            }
            ((WindowManager) this.f41872b.getSystemService("window")).addView(this.d, this.f41875c);
            this.f41898n.invalidate();
            this.f41909s = z10;
            Window window = this.f41872b.getWindow();
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 26) {
                z11 = c8.yc.a(window.getDecorView().getSystemUiVisibility(), 16);
            } else {
                z11 = false;
            }
            this.f41897m1 = z11;
            org.telegram.messenger.g0.m3(this.f41872b, false);
            org.telegram.messenger.g0.o3(this.d, false);
            Activity activity = this.f41872b;
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity2 = (LaunchActivity) activity;
                if (i15 >= 26) {
                    i12 = launchActivity2.getWindow().getNavigationBarColor();
                } else {
                    i12 = 0;
                }
                this.l1 = i12;
                ((LaunchActivity) this.f41872b).x(-16777216);
            } else {
                this.l1 = window.getNavigationBarColor();
                org.telegram.messenger.g0.t3(this.f41872b, -16777216, true);
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
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f41906r, property, fArr3);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.m6.d, 0, 255);
            float[] fArr4 = new float[i11];
            
            fArr4[0] = 0.0f;
            fArr4[1] = 1.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, this.f41913t1, fArr4);
            lz0 lz0Var = this.S;
            int i16 = i11;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(lz0Var, lz0Var.f47582n, f10);
            lz0 lz0Var2 = this.S;
            if (!this.J) {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(lz0Var2, property, f10);
            Animator[] animatorArr = new Animator[7];
            animatorArr[0] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[i16] = ofFloat3;
            animatorArr[3] = ofInt;
            animatorArr[4] = ofFloat4;
            animatorArr[5] = ofFloat5;
            animatorArr[6] = ofFloat6;
            animatorSet.playTogether(animatorArr);
            this.f41894k0 = 3;
            this.m0 = new mc0(this, ieVar, ijVar, 29);
            this.I0.setDuration(250L);
            this.I0.addListener(new jz0(this, 0));
            this.f41896l0 = System.currentTimeMillis();
            if (org.telegram.messenger.iz.o() == 0) {
                this.f41880e.setLayerType(i16, null);
            }
            this.I0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.f41925b = 0;
            photoBackgroundDrawable.f41924a = new by0(5, this, E);
            this.I0.start();
        }
    }

    public final void i(File file) {
        if (this.f41872b == null) {
            return;
        }
        j();
        if (this.f41921y == null) {
            j4 j4Var = new j4(this.f41872b);
            this.f41919x = j4Var;
            j4Var.setVisibility(0);
            this.f41880e.addView(this.f41919x, 0, c8.ha.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f41872b);
            this.f41921y = textureView;
            textureView.setOpaque(false);
            this.f41919x.addView(this.f41921y, c8.ha.e(-1, -1, 17));
        }
        this.f41870a0 = false;
        this.f41873b0 = false;
        this.f41921y.setAlpha(1.0f);
        if (this.D == null) {
            jp0 jp0Var = new jp0(this, 1);
            this.D = jp0Var;
            jp0Var.A0(this.f41921y);
            this.D.J = new j2.n(21, this, file);
        }
        this.D.j0(Uri.fromFile(file), "other");
        this.D.u0(true);
        this.U.a(true, true);
    }

    public final void j() {
        jp0 jp0Var = this.D;
        if (jp0Var != null) {
            this.Z = 0;
            jp0Var.m0();
            this.D = null;
        }
        try {
            Activity activity = this.f41872b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        j4 j4Var = this.f41919x;
        if (j4Var != null) {
            this.f41880e.removeView(j4Var);
            this.f41919x = null;
        }
        if (this.f41921y != null) {
            this.f41921y = null;
        }
        this.E = false;
    }

    public final void k(org.telegram.messenger.ij ijVar, CharSequence charSequence, boolean z9) {
        TextView currentView;
        boolean z10;
        CharSequence cloneSpans = org.telegram.ui.Components.r5.cloneSpans(charSequence, 3);
        if (this.Y == null) {
            FrameLayout frameLayout = new FrameLayout(this.f41880e.getContext());
            this.V = frameLayout;
            this.X.setContainer(frameLayout);
            up0 up0Var = new up0(this, this.f41880e.getContext(), this.X, this.V, 1);
            this.Y = up0Var;
            this.X.setScrollView(up0Var);
            this.V.setClipChildren(false);
            this.Y.addView(this.V, new ViewGroup.LayoutParams(-1, -2));
            this.f41880e.addView(this.Y, c8.ha.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.W.n(this.f41880e.getContext()).bringToFront();
        }
        boolean z11 = true;
        if (this.X.getParent() != this.V) {
            this.X.setMeasureAllChildren(true);
            this.V.addView(this.X, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.X.getCurrentView().getText());
        kq0 kq0Var = this.X;
        if (z9) {
            currentView = kq0Var.getNextView();
        } else {
            currentView = kq0Var.getCurrentView();
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
        up0 up0Var2 = this.Y;
        up0Var2.f46468l0 = false;
        if (z9) {
            TransitionManager.endTransitions(up0Var2);
            TransitionSet duration = new TransitionSet().addTransition(new hz0(this, isEmpty2, isEmpty, 1)).addTransition(new hz0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.Y.f46468l0 = true;
                duration.addTransition(new org.telegram.ui.Components.nk0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.X);
            }
            TransitionManager.beginDelayedTransition(this.Y, duration);
            z10 = true;
        } else {
            this.X.getCurrentView().setText((CharSequence) null);
            up0 up0Var3 = this.Y;
            if (up0Var3 != null) {
                up0Var3.scrollTo(0, 0);
            }
            z10 = false;
        }
        int i7 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.k6.P();
            TLRPC.Message message = ijVar.f23237k;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.e21.M0())) {
                if (!ijVar.f23237k.entities.isEmpty()) {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    ijVar.c(spannableString, true, false);
                    if (org.telegram.messenger.ij.M4(ijVar.f23237k)) {
                        org.telegram.messenger.ij.h(ijVar.Q3(), spannableString, false, 3, (int) ijVar.L0(), false);
                    }
                    cloneSpans = org.telegram.messenger.i6.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    cloneSpans = org.telegram.messenger.i6.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                }
            }
            this.X.setTag(cloneSpans);
            try {
                this.X.a(cloneSpans, z9, false);
                up0 up0Var4 = this.Y;
                if (up0Var4 != null) {
                    up0Var4.H(up0Var4.getWidth(), up0Var4.getHeight());
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            kq0 kq0Var2 = this.X;
            if (this.f41890i0) {
                i7 = 0;
            }
            kq0Var2.setVisibility(i7);
        } else {
            this.X.a(null, z9, false);
            this.X.getCurrentView().setTextColor(-1);
            kq0 kq0Var3 = this.X;
            if (z10 && !isEmpty2) {
                z11 = false;
            }
            kq0Var3.b(4, z11);
            this.X.setTag(null);
        }
        if (this.X.getCurrentView() instanceof jq0) {
            ((jq0) this.X.getCurrentView()).setLoading(false);
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
        if (this.f41895k1 == z11 && z10) {
            return;
        }
        this.f41895k1 = z11;
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
        this.f41906r.r(true);
        if (this.J) {
            i7 = 2131743581;
        } else {
            i7 = 2131747261;
        }
        String M0 = org.telegram.messenger.hd.M0(i7, null);
        fi.m3 m3Var = this.f41906r;
        m3Var.h = fi.m3.a(M0, m3Var.getTextPaint());
        this.f41906r.u(M0);
        this.f41906r.n(12.0f, 7.0f, 11.0f, 7.0f);
        fi.m3 m3Var2 = this.f41906r;
        m3Var2.getClass();
        m3Var2.f12423e0 = org.telegram.messenger.g0.L(2);
        fi.m3 m3Var3 = this.f41906r;
        m3Var3.getClass();
        m3Var3.f12421d0 = 0.0f;
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(2131624020, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
        zg0Var.start();
        m3Var3.m(zg0Var);
        this.f41906r.w();
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
        dz0 dz0Var = this.f41903p1;
        org.telegram.messenger.g0.r(dz0Var);
        if (z9 && this.J) {
            org.telegram.messenger.g0.i3(dz0Var, 3000L);
        }
        if (z9) {
            this.F.setVisibility(0);
        }
        this.F.setEnabled(z9);
        this.f41890i0 = z9;
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
            lz0 lz0Var = this.S;
            q0 q0Var = lz0Var.f47582n;
            if (z9) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(lz0Var, q0Var, f14));
            up0 up0Var = this.Y;
            if (z9) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(up0Var, property, f15));
            View view = this.R;
            if (z9) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
            View view2 = this.f41883f;
            if (z9) {
                f17 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f17));
            AnimatorSet animatorSet = new AnimatorSet();
            this.G = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z9) {
                this.G.addListener(new jz0(this, 1));
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
        up0 up0Var2 = this.Y;
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        up0Var2.setAlpha(f11);
        View view3 = this.R;
        if (z9) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        view3.setAlpha(f12);
        View view4 = this.f41883f;
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
        int width = ((int) ((imageReceiver.M0 * f10) - this.f41880e.getWidth())) / 2;
        int height = ((int) ((imageReceiver.N0 * f10) - this.f41880e.getHeight())) / 2;
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
        if (this.f41918w0 != 1.0f) {
            this.f41882e1.a();
            this.f41882e1.c(Math.round(this.f41914u0), Math.round(this.f41916v0), Math.round(f10), Math.round(f11), (int) this.T0, (int) this.U0, (int) this.V0, (int) this.W0);
            this.f41880e.postInvalidate();
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
        if (this.f41879d1) {
            return false;
        }
        if (this.D != null && this.f41890i0 && motionEvent.getX() >= this.T.getX() && motionEvent.getY() >= this.T.getY() && motionEvent.getX() <= this.T.getX() + this.T.getMeasuredWidth() && motionEvent.getX() <= this.T.getX() + this.T.getMeasuredWidth()) {
            jp0 jp0Var = this.D;
            jp0Var.u0(!jp0Var.d.u());
            if (this.D.d.u()) {
                n(true, true);
                return true;
            }
            l(true, true);
            return true;
        }
        n(!this.f41890i0, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f10) {
        this.animationValue = f10;
        this.f41880e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f10) {
        this.f41876c0 = f10;
        this.f41880e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
