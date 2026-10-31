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
public class SecretMediaViewer implements org.telegram.messenger.us, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer f33975v1;
    public float A0;
    public float B0;
    public float C0;
    public uq0 D;
    public float D0;
    public boolean E;
    public float E0;
    public kg.g1 F;
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
    public es0 L;
    public float L0;
    public int M;
    public float M0;
    public int N;
    public float N0;
    public org.telegram.ui.Components.w61 O;
    public float O0;
    public do0 P;
    public float P0;
    public org.telegram.ui.ActionBar.u5 Q;
    public float Q0;
    public View R;
    public float R0;
    public b11 S;
    public float S0;
    public ImageView T;
    public float T0;
    public org.telegram.ui.Components.kf0 U;
    public float U0;
    public FrameLayout V;
    public float V0;
    public eq0 W;
    public float W0;
    public wr0 X;
    public boolean X0;
    public fr0 Y;
    public boolean Y0;
    public int Z;
    public boolean Z0;
    public int f33976a;
    public boolean f33977a0;
    public boolean f33978a1;
    private float animationValue;
    public Activity f33979b;
    public boolean f33980b0;
    public boolean f33981b1;
    public WindowManager.LayoutParams f33982c;
    public float f33983c0;
    public boolean f33984c1;
    public l0 d;
    public long f33985d0;
    public boolean f33986d1;
    public fg.i e;
    public WindowInsets f33987e0;
    public org.telegram.ui.Components.zl0 f33988e1;
    public View f33989f;
    public org.telegram.messenger.jj f33990f0;
    public boolean f33991f1;
    public org.telegram.messenger.kc f33992g0;
    public final r01 f33993g1;
    public boolean f33994h0;
    public final int[] f33995h1;
    public final int[] f33997i1;
    public aa0 f33999j1;
    public int f34000k0;
    public boolean f34001k1;
    public long f34002l0;
    public int l1;
    public Runnable m0;
    public boolean f34003m1;
    public a11 f34004n;
    public boolean f34005n0;
    public Runnable f34006n1;
    public float f34007o0;
    public boolean f34008o1;
    public float f34009p0;
    public final r01 f34010p1;
    public float f34011q0;
    public float[] f34012q1;
    public vh.p2 f34013r;
    public float f34014r0;
    public final Path f34015r1;
    public boolean f34016s;
    public float f34017s0;
    public final s0 f34018s1;
    public float f34019t0;
    public final s0 f34020t1;
    public float f34021u0;
    public boolean f34022u1;
    public float f34023v0;
    public long f34024w;
    public float f34025w0;
    public k4 f34026x;
    public float f34027x0;
    public TextureView f34028y;
    public float f34029y0;
    public float f34030z0;
    public final ImageReceiver h = new ImageReceiver(null);
    public boolean f33996i0 = true;
    public final PhotoBackgroundDrawable f33998j0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public et0 f34031a;
        public int f34032b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            et0 et0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f34032b == 2 && (et0Var = this.f34031a) != null) {
                    et0Var.run();
                    this.f34031a = null;
                } else {
                    invalidateSelf();
                }
                this.f34032b++;
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            aa0 aa0Var = secretMediaViewer.f33999j1;
            if (aa0Var != null) {
                if (secretMediaViewer.f33994h0 && i10 == 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aa0Var.c(z10);
            }
            super.setAlpha(i10);
        }

        @Override
        public final void setBounds(int i10, int i11, int i12, int i13) {
            super.setBounds(i10, i11, i12, i13 + org.telegram.messenger.i0.f16021n);
        }

        @Override
        public final void setBounds(Rect rect) {
            rect.bottom += org.telegram.messenger.i0.f16021n;
            super.setBounds(rect);
        }
    }

    public SecretMediaViewer() {
        new Paint();
        this.f34025w0 = 1.0f;
        this.K0 = new DecelerateInterpolator(1.5f);
        this.M0 = 1.0f;
        this.f33981b1 = true;
        this.f33993g1 = new r01(this, 2);
        this.f33995h1 = new int[2];
        this.f33997i1 = new int[2];
        this.f34010p1 = new r01(this, 3);
        this.f34015r1 = new Path();
        this.f34018s1 = new s0("videoCrossfadeAlpha", 5);
        this.f34020t1 = new s0("animationValue", 6);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f33987e0;
        secretMediaViewer.f33987e0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f33975v1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f33975v1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f33975v1 = secretMediaViewer;
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
        if (f33975v1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f7, float f10, float f11, boolean z10) {
        if (this.f34025w0 == f7 && this.f34021u0 == f10 && this.f34023v0 == f11) {
            return;
        }
        this.f33984c1 = z10;
        this.f34030z0 = f7;
        this.f34027x0 = f10;
        this.f34029y0 = f11;
        this.H0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.I0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.I0.setInterpolator(this.K0);
        this.I0.setDuration(250);
        this.I0.addListener(new x01(this, 3));
        this.I0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19710w) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f33990f0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f33990f0.f1()))) {
                if (this.J && !this.H) {
                    this.I = true;
                } else if (!e(true, true)) {
                    this.f33991f1 = true;
                }
            }
        } else if (i10 == org.telegram.messenger.zs.f19626i0) {
            if (this.f33990f0 != null && this.f34004n != null && ((Long) objArr[0]).longValue() == this.f34024w) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    int keyAt = sparseArray.keyAt(i12);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (this.f33990f0.f1() == ((Integer) arrayList.get(i13)).intValue()) {
                            this.f33990f0.f16337k.destroyTime = keyAt;
                            this.f34004n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.zs.f19644l0 && this.f33990f0.f1() == ((TLRPC.Message) objArr[0]).f19814id) {
            if (this.J && !this.H) {
                this.I = true;
            } else if (!e(true, true)) {
                this.f33991f1 = true;
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
        return this.f33983c0;
    }

    public final void h(org.telegram.messenger.jj jjVar, rl rlVar, ue ueVar, a3.i0 i0Var) {
        gs0 E;
        boolean z10;
        int i10;
        int i11;
        ?? r17;
        int[] iArr;
        aa0 aa0Var;
        String str;
        Bitmap bitmap;
        org.telegram.messenger.kc kcVar;
        int i12;
        PhotoBackgroundDrawable photoBackgroundDrawable;
        float f7;
        BitmapDrawable bitmapDrawable;
        boolean z11;
        boolean z12;
        int i13;
        float f10;
        BitmapDrawable bitmapDrawable2;
        org.telegram.messenger.ic b10;
        BitmapDrawable bitmapDrawable3;
        if (this.f33979b != null && jjVar.m5() && rlVar != null && (E = rlVar.E(jjVar, null, 0, true, false)) != null) {
            if (jjVar.f16337k.ttl == Integer.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f34008o1 = z10;
            this.f34006n1 = i0Var;
            this.L = rlVar;
            System.currentTimeMillis();
            this.f33996i0 = true;
            this.f33994h0 = true;
            this.f34005n0 = false;
            k4 k4Var = this.f34026x;
            if (k4Var != null) {
                k4Var.setVisibility(4);
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
            this.f33978a1 = false;
            this.f33981b1 = true;
            o(this.f34025w0);
            PhotoBackgroundDrawable photoBackgroundDrawable2 = this.f33998j0;
            photoBackgroundDrawable2.setAlpha(0);
            this.e.setAlpha(1.0f);
            this.e.setVisibility(0);
            this.f34004n.setAlpha(1.0f);
            this.J = false;
            this.H = false;
            this.I = false;
            this.K = true;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.l1 = false;
            this.M = 0;
            this.N = 0;
            RectF rectF = new RectF(E.f37627a.P0);
            rectF.left = Math.max(rectF.left, E.f37627a.K0);
            rectF.top = Math.max(rectF.top, E.f37627a.L0);
            rectF.right = Math.min(rectF.right, E.f37627a.y());
            rectF.bottom = Math.min(rectF.bottom, E.f37627a.A());
            float width = rectF.width();
            float height = rectF.height();
            Point point = org.telegram.messenger.i0.f16026q;
            this.f34025w0 = Math.max(width / point.x, height / (point.y + org.telegram.messenger.i0.f16020m));
            int[] iArr2 = E.h;
            if (iArr2 != null) {
                this.F0 = new int[iArr2.length];
                r17 = 1;
                int i14 = 0;
                while (true) {
                    int[] iArr3 = E.h;
                    if (i14 >= iArr3.length) {
                        break;
                    }
                    this.F0[i14] = iArr3[i14];
                    i14++;
                }
            } else {
                r17 = 1;
                this.F0 = null;
            }
            float f11 = rectF.left;
            this.f34021u0 = ((width / 2.0f) + (E.f37628b + f11)) - (i10 / 2);
            this.f34023v0 = ((height / 2.0f) + (E.f37629c + rectF.top)) - (i11 / 2);
            this.f34019t0 = Math.abs(f11 - E.f37627a.K0);
            E.d.getLocationInWindow(new int[2]);
            float f12 = (iArr[r17] - (E.f37629c + rectF.top)) + E.f37633j;
            this.f34009p0 = f12;
            float abs = (int) Math.abs(rectF.top - E.f37627a.L0);
            this.f34009p0 = Math.max(0.0f, Math.max(f12, abs));
            float height2 = (((E.f37629c + rectF.top) + ((int) height)) - (E.d.getHeight() + iArr[r17])) + E.f37632i;
            this.f34011q0 = height2;
            this.f34011q0 = Math.max(0.0f, Math.max(height2, abs));
            this.f34014r0 = 0.0f;
            this.f34014r0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.f34017s0 = 0.0f;
            this.f34017s0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.H0 = System.currentTimeMillis();
            this.f34027x0 = 0.0f;
            this.f34029y0 = 0.0f;
            this.B0 = 0.0f;
            this.D0 = 0.0f;
            this.E0 = 0.0f;
            this.A0 = 0.0f;
            this.C0 = 0.0f;
            this.f34030z0 = 1.0f;
            boolean z13 = r17;
            this.G0 = z13;
            this.f33984c1 = z13;
            aa0 aa0Var2 = this.f33999j1;
            if (aa0Var2 != null) {
                aa0Var2.b();
                this.f33999j1 = null;
            }
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                aa0Var = new aa0(launchActivity, z13);
            } else {
                aa0Var = null;
            }
            this.f33999j1 = aa0Var;
            org.telegram.messenger.zs.f(this.f33976a).b(this, org.telegram.messenger.zs.f19710w);
            org.telegram.messenger.zs.f(this.f33976a).b(this, org.telegram.messenger.zs.f19644l0);
            org.telegram.messenger.zs.f(this.f33976a).b(this, org.telegram.messenger.zs.f19626i0);
            this.f34024w = org.telegram.messenger.jj.C1(jjVar.f16337k.peer_id);
            this.f33990f0 = jjVar;
            TLRPC.Document F0 = jjVar.F0();
            org.telegram.messenger.kc kcVar2 = this.f33992g0;
            if (kcVar2 != null) {
                kcVar2.a();
                this.f33992g0 = null;
            }
            ImageReceiver imageReceiver2 = E.f37627a;
            Drawable drawable = imageReceiver2.f14366a0;
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
                kcVar = new org.telegram.messenger.kc(bitmap, str, 0);
            } else {
                kcVar = null;
            }
            this.f33992g0 = kcVar;
            this.S.setVisibility(8);
            if (F0 != null) {
                int i15 = 0;
                while (true) {
                    if (i15 >= F0.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i15);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                        this.M = tL_documentAttributeVideo.f19800w;
                        this.N = tL_documentAttributeVideo.h;
                        break;
                    }
                    i15++;
                }
                if (org.telegram.messenger.jj.s3(F0, false)) {
                    this.F.setTitle(org.telegram.messenger.cd.L0(2131751410, null));
                    String str2 = jjVar.f16337k.attachPath;
                    if (str2 != null && jjVar.f16383w0) {
                        b10 = org.telegram.messenger.ic.g(str2);
                    } else {
                        b10 = org.telegram.messenger.ic.b(F0);
                    }
                    if (this.f33992g0 != null) {
                        bitmapDrawable3 = new BitmapDrawable(this.f33992g0.f16564c);
                    } else {
                        bitmapDrawable3 = null;
                    }
                    f7 = 1.0f;
                    photoBackgroundDrawable = photoBackgroundDrawable2;
                    i12 = 2;
                    imageReceiver.p0(b10, null, bitmapDrawable3, -1L, null, jjVar, 1);
                } else {
                    i12 = 2;
                    photoBackgroundDrawable = photoBackgroundDrawable2;
                    f7 = 1.0f;
                    this.Z = 1;
                    this.F.setTitle(org.telegram.messenger.cd.L0(2131751408, null));
                    File file = new File(jjVar.f16337k.attachPath);
                    if (file.exists()) {
                        i(file);
                    } else {
                        org.telegram.messenger.b8.G(this.f33976a);
                        File N = org.telegram.messenger.b8.N(jjVar.f16337k, false, true);
                        File file2 = new File(N.getAbsolutePath() + ".enc");
                        if (file2.exists()) {
                            N = file2;
                        }
                        i(N);
                    }
                    this.J = true;
                    this.S.setVisibility(0);
                    if (this.f33992g0 != null) {
                        bitmapDrawable2 = new BitmapDrawable(this.f33992g0.f16564c);
                    } else {
                        bitmapDrawable2 = null;
                    }
                    imageReceiver.p0(null, null, bitmapDrawable2, -1L, null, jjVar, 2);
                }
            } else {
                i12 = 2;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                f7 = 1.0f;
                this.F.setTitle(org.telegram.messenger.cd.L0(2131751409, null));
                TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(jjVar.f16348n0, org.telegram.messenger.i0.Z0(false), false, null, false);
                org.telegram.messenger.ic f13 = org.telegram.messenger.ic.f(w9, jjVar.f16342l0);
                if (this.f33992g0 != null) {
                    bitmapDrawable = new BitmapDrawable(this.f33992g0.f16564c);
                } else {
                    bitmapDrawable = null;
                }
                imageReceiver.p0(f13, null, bitmapDrawable, -1L, null, jjVar, 2);
                if (w9 != null) {
                    this.M = w9.f19818w;
                    this.N = w9.h;
                }
            }
            k(jjVar, "", false);
            k(jjVar, jjVar.f16394z, true);
            n(true, false);
            l(false, false);
            this.U.a(true, true);
            if (this.f34008o1) {
                a11 a11Var = this.f34004n;
                a11Var.e = true;
                TextPaint textPaint = a11Var.f35516r;
                textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
                textPaint.setTypeface(org.telegram.messenger.i0.o1("fonts/num.otf"));
                textPaint.setColor(-1);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                a11Var.f35517s = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f10 = a11Var.f35517s.getLineWidth(0);
                } else {
                    f10 = 0.0f;
                }
                a11Var.f35518w = f10;
                a11Var.f35519x = a11Var.f35517s.getHeight();
                a11Var.invalidate();
                this.f34004n.setOnClickListener(new a01(this, 4));
            } else {
                this.f34004n.setOnClickListener(null);
            }
            try {
                if (this.d.getParent() != null) {
                    ((WindowManager) this.f33979b.getSystemService("window")).removeView(this.d);
                }
                z11 = true;
            } catch (Exception e) {
                z11 = true;
                org.telegram.messenger.f8.g(e, true);
            }
            ((WindowManager) this.f33979b.getSystemService("window")).addView(this.d, this.f33982c);
            this.f34004n.invalidate();
            this.f34016s = z11;
            Window window = this.f33979b.getWindow();
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 26) {
                z12 = v7.u7.a(window.getDecorView().getSystemUiVisibility(), 16);
            } else {
                z12 = false;
            }
            this.f34003m1 = z12;
            org.telegram.messenger.i0.l3(this.f33979b, false);
            org.telegram.messenger.i0.n3(this.d, false);
            Activity activity = this.f33979b;
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity2 = (LaunchActivity) activity;
                if (i16 >= 26) {
                    i13 = launchActivity2.getWindow().getNavigationBarColor();
                } else {
                    i13 = 0;
                }
                this.l1 = i13;
                ((LaunchActivity) this.f33979b).x(-16777216);
            } else {
                this.l1 = window.getNavigationBarColor();
                org.telegram.messenger.i0.s3(this.f33979b, -16777216, true);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.I0 = animatorSet;
            kg.g1 g1Var = this.F;
            Property property = View.ALPHA;
            float[] fArr = new float[i12];
            
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g1Var, property, fArr);
            float[] fArr2 = new float[i12];
            
            fArr2[0] = 0.0f;
            fArr2[1] = 1.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Y, property, fArr2);
            float[] fArr3 = new float[i12];
            
            fArr3[0] = 0.0f;
            fArr3[1] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f34013r, property, fArr3);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.i6.d, 0, 255);
            float[] fArr4 = new float[i12];
            
            fArr4[0] = 0.0f;
            fArr4[1] = 1.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, this.f34020t1, fArr4);
            b11 b11Var = this.S;
            int i17 = i12;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(b11Var, b11Var.f35946n, f7);
            b11 b11Var2 = this.S;
            if (!this.J) {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(b11Var2, property, f7);
            Animator[] animatorArr = new Animator[7];
            animatorArr[0] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[i17] = ofFloat3;
            animatorArr[3] = ofInt;
            animatorArr[4] = ofFloat4;
            animatorArr[5] = ofFloat5;
            animatorArr[6] = ofFloat6;
            animatorSet.playTogether(animatorArr);
            this.f34000k0 = 3;
            this.m0 = new qd0(this, ueVar, jjVar, 29);
            this.I0.setDuration(250L);
            this.I0.addListener(new x01(this, 0));
            this.f34002l0 = System.currentTimeMillis();
            if (org.telegram.messenger.tz.o() == 0) {
                this.e.setLayerType(i17, null);
            }
            this.I0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.f34032b = 0;
            photoBackgroundDrawable.f34031a = new et0(28, this, E);
            this.I0.start();
        }
    }

    public final void i(File file) {
        if (this.f33979b == null) {
            return;
        }
        j();
        if (this.f34028y == null) {
            k4 k4Var = new k4(this.f33979b);
            this.f34026x = k4Var;
            k4Var.setVisibility(0);
            this.e.addView(this.f34026x, 0, w7.b6.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f33979b);
            this.f34028y = textureView;
            textureView.setOpaque(false);
            this.f34026x.addView(this.f34028y, w7.b6.e(-1, -1, 17));
        }
        this.f33977a0 = false;
        this.f33980b0 = false;
        this.f34028y.setAlpha(1.0f);
        if (this.D == null) {
            uq0 uq0Var = new uq0(this, 1);
            this.D = uq0Var;
            uq0Var.A0(this.f34028y);
            this.D.J = new m5.e(this, file, false, 16);
        }
        this.D.j0(Uri.fromFile(file), "other");
        this.D.u0(true);
        this.U.a(true, true);
    }

    public final void j() {
        uq0 uq0Var = this.D;
        if (uq0Var != null) {
            this.Z = 0;
            uq0Var.m0();
            this.D = null;
        }
        try {
            Activity activity = this.f33979b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        k4 k4Var = this.f34026x;
        if (k4Var != null) {
            this.e.removeView(k4Var);
            this.f34026x = null;
        }
        if (this.f34028y != null) {
            this.f34028y = null;
        }
        this.E = false;
    }

    public final void k(org.telegram.messenger.jj jjVar, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.o5.cloneSpans(charSequence, 3);
        if (this.Y == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.V = frameLayout;
            this.X.setContainer(frameLayout);
            fr0 fr0Var = new fr0(this, this.e.getContext(), this.X, this.V, 1);
            this.Y = fr0Var;
            this.X.setScrollView(fr0Var);
            this.V.setClipChildren(false);
            this.Y.addView(this.V, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.Y, w7.b6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.W.n(this.e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.X.getParent() != this.V) {
            this.X.setMeasureAllChildren(true);
            this.V.addView(this.X, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.X.getCurrentView().getText());
        wr0 wr0Var = this.X;
        if (z10) {
            currentView = wr0Var.getNextView();
        } else {
            currentView = wr0Var.getCurrentView();
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
        fr0 fr0Var2 = this.Y;
        fr0Var2.f41929l0 = false;
        if (z10) {
            TransitionManager.endTransitions(fr0Var2);
            TransitionSet duration = new TransitionSet().addTransition(new v01(this, isEmpty2, isEmpty, 1)).addTransition(new v01(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.Y.f41929l0 = true;
                duration.addTransition(new org.telegram.ui.Components.rl0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.X);
            }
            TransitionManager.beginDelayedTransition(this.Y, duration);
            z11 = true;
        } else {
            this.X.getCurrentView().setText((CharSequence) null);
            fr0 fr0Var3 = this.Y;
            if (fr0Var3 != null) {
                fr0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i10 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.t6.P();
            TLRPC.Message message = jjVar.f16337k;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.m31.M0())) {
                if (!jjVar.f16337k.entities.isEmpty()) {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    jjVar.c(spannableString, true, false);
                    if (org.telegram.messenger.jj.L4(jjVar.f16337k)) {
                        org.telegram.messenger.jj.h(jjVar.P3(), spannableString, false, 3, (int) jjVar.L0(), false);
                    }
                    cloneSpans = org.telegram.messenger.k6.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    cloneSpans = org.telegram.messenger.k6.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                }
            }
            this.X.setTag(cloneSpans);
            try {
                this.X.a(cloneSpans, z10, false);
                fr0 fr0Var4 = this.Y;
                if (fr0Var4 != null) {
                    fr0Var4.H(fr0Var4.getWidth(), fr0Var4.getHeight());
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            wr0 wr0Var2 = this.X;
            if (this.f33996i0) {
                i10 = 0;
            }
            wr0Var2.setVisibility(i10);
        } else {
            this.X.a(null, z10, false);
            this.X.getCurrentView().setTextColor(-1);
            wr0 wr0Var3 = this.X;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            wr0Var3.b(4, z12);
            this.X.setTag(null);
        }
        if (this.X.getCurrentView() instanceof vr0) {
            ((vr0) this.X.getCurrentView()).setLoading(false);
        }
    }

    public final void l(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        if (this.J && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f34001k1 == z12 && z11) {
            return;
        }
        this.f34001k1 = z12;
        this.T.animate().cancel();
        float f11 = 0.0f;
        float f12 = 0.6f;
        if (z11) {
            ViewPropertyAnimator animate = this.T.animate();
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f10);
            if (z12) {
                f12 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f12);
            if (z12) {
                f11 = 1.0f;
            }
            scaleY.alpha(f11).setDuration(340L).setInterpolator(org.telegram.ui.Components.gr.h).start();
            return;
        }
        ImageView imageView = this.T;
        if (z12) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        imageView.setScaleX(f7);
        ImageView imageView2 = this.T;
        if (z12) {
            f12 = 1.0f;
        }
        imageView2.setScaleY(f12);
        ImageView imageView3 = this.T;
        if (z12) {
            f11 = 1.0f;
        }
        imageView3.setAlpha(f11);
    }

    public final void m() {
        int i10;
        this.f34013r.p(true);
        if (this.J) {
            i10 = 2131743606;
        } else {
            i10 = 2131747278;
        }
        String L0 = org.telegram.messenger.cd.L0(i10, null);
        vh.p2 p2Var = this.f34013r;
        p2Var.h = vh.p2.a(L0, p2Var.getTextPaint());
        this.f34013r.s(L0);
        this.f34013r.k(12.0f, 7.0f, 11.0f, 7.0f);
        vh.p2 p2Var2 = this.f34013r;
        p2Var2.getClass();
        p2Var2.f51732e0 = org.telegram.messenger.i0.L(2);
        vh.p2 p2Var3 = this.f34013r;
        p2Var3.getClass();
        p2Var3.f51731d0 = 0.0f;
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(2131624020, org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(34.0f));
        bi0Var.start();
        p2Var3.j(bi0Var);
        this.f34013r.u();
        org.telegram.messenger.vp.d1().edit().putInt("viewoncehint", org.telegram.messenger.vp.d1().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void n(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        r01 r01Var = this.f34010p1;
        org.telegram.messenger.i0.r(r01Var);
        if (z10 && this.J) {
            org.telegram.messenger.i0.h3(r01Var, 3000L);
        }
        if (z10) {
            this.F.setVisibility(0);
        }
        this.F.setEnabled(z10);
        this.f33996i0 = z10;
        l(z10, z11);
        float f16 = 0.0f;
        if (z11) {
            ArrayList arrayList = new ArrayList();
            kg.g1 g1Var = this.F;
            Property property = View.ALPHA;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(g1Var, property, f12));
            b11 b11Var = this.S;
            s0 s0Var = b11Var.f35946n;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(b11Var, s0Var, f13));
            fr0 fr0Var = this.Y;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(fr0Var, property, f14));
            View view = this.R;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
            View view2 = this.f33989f;
            if (z10) {
                f16 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f16));
            AnimatorSet animatorSet = new AnimatorSet();
            this.G = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z10) {
                this.G.addListener(new x01(this, 1));
            }
            this.G.setDuration(200L);
            this.G.start();
            return;
        }
        kg.g1 g1Var2 = this.F;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        g1Var2.setAlpha(f7);
        fr0 fr0Var2 = this.Y;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        fr0Var2.setAlpha(f10);
        View view3 = this.R;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        view3.setAlpha(f11);
        View view4 = this.f33989f;
        if (z10) {
            f16 = 1.0f;
        }
        view4.setAlpha(f16);
        if (!z10) {
            this.F.setVisibility(8);
            this.Y.scrollTo(0, 0);
        }
    }

    public final void o(float f7) {
        ImageReceiver imageReceiver = this.h;
        int width = ((int) ((imageReceiver.M0 * f7) - this.e.getWidth())) / 2;
        int height = ((int) ((imageReceiver.N0 * f7) - this.e.getHeight())) / 2;
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
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        if (this.f34025w0 != 1.0f) {
            this.f33988e1.a();
            this.f33988e1.c(Math.round(this.f34021u0), Math.round(this.f34023v0), Math.round(f7), Math.round(f10), (int) this.T0, (int) this.U0, (int) this.V0, (int) this.W0);
            this.e.postInvalidate();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f33986d1) {
            return false;
        }
        if (this.D != null && this.f33996i0 && motionEvent.getX() >= this.T.getX() && motionEvent.getY() >= this.T.getY() && motionEvent.getX() <= this.T.getX() + this.T.getMeasuredWidth() && motionEvent.getX() <= this.T.getX() + this.T.getMeasuredWidth()) {
            uq0 uq0Var = this.D;
            uq0Var.u0(!uq0Var.d.t());
            if (this.D.d.t()) {
                n(true, true);
                return true;
            }
            l(true, true);
            return true;
        }
        n(!this.f33996i0, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f7) {
        this.animationValue = f7;
        this.e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f7) {
        this.f33983c0 = f7;
        this.e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
