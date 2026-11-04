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
public class SecretMediaViewer implements org.telegram.messenger.cs, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer f41924w1;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public bp0 E;
    public float E0;
    public boolean F;
    public float F0;
    public org.telegram.ui.Components.p7 G;
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
    public kq0 M;
    public float M0;
    public int N;
    public float N0;
    public int O;
    public float O0;
    public org.telegram.ui.Components.o51 P;
    public float P0;
    public org.telegram.ui.Components.voip.r0 Q;
    public float Q0;
    public org.telegram.ui.ActionBar.k5 R;
    public float R0;
    public View S;
    public float S0;
    public cz0 T;
    public float T0;
    public ImageView U;
    public float U0;
    public org.telegram.ui.Components.je0 V;
    public float V0;
    public FrameLayout W;
    public float W0;
    public lo0 X;
    public float X0;
    public cq0 Y;
    public boolean Y0;
    public mp0 Z;
    public boolean Z0;
    public int f41925a;
    public int f41926a0;
    public boolean f41927a1;
    private float animationValue;
    public Activity f41928b;
    public boolean f41929b0;
    public boolean f41930b1;
    public WindowManager.LayoutParams f41931c;
    public boolean f41932c0;
    public boolean f41933c1;
    public l0 d;
    public float f41934d0;
    public boolean f41935d1;
    public ai.c0 f41936e;
    public long f41937e0;
    public boolean f41938e1;
    public View f41939f;
    public WindowInsets f41940f0;
    public org.telegram.ui.Components.al0 f41941f1;
    public org.telegram.messenger.zi f41942g0;
    public boolean f41943g1;
    public org.telegram.messenger.cc f41944h0;
    public final ty0 f41945h1;
    public boolean f41946i0;
    public final int[] f41947i1;
    public final int[] f41949j1;
    public cg.u0 k1;
    public int f41951l0;
    public boolean f41952l1;
    public long m0;
    public int m1;
    public bz0 f41953n;
    public Runnable f41954n0;
    public boolean f41955n1;
    public boolean f41956o0;
    public Runnable f41957o1;
    public float f41958p0;
    public boolean f41959p1;
    public float f41960q0;
    public final ty0 f41961q1;
    public gi.l3 f41962r;
    public float f41963r0;
    public float[] f41964r1;
    public boolean f41965s;
    public float f41966s0;
    public final Path f41967s1;
    public float f41968t0;
    public final r0 f41969t1;
    public float f41970u0;
    public final r0 f41971u1;
    public float f41972v0;
    public boolean f41973v1;
    public long f41974w;
    public float f41975w0;
    public l4 f41976x;
    public float f41977x0;
    public TextureView f41978y;
    public float f41979y0;
    public float f41980z0;
    public final ImageReceiver h = new ImageReceiver(null);
    public boolean f41948j0 = true;
    public final PhotoBackgroundDrawable f41950k0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public qv0 f41981a;
        public int f41982b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            qv0 qv0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f41982b == 2 && (qv0Var = this.f41981a) != null) {
                    qv0Var.run();
                    this.f41981a = null;
                } else {
                    invalidateSelf();
                }
                this.f41982b++;
            }
        }

        @Override
        public void setAlpha(int i3) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            cg.u0 u0Var = secretMediaViewer.k1;
            if (u0Var != null) {
                if (secretMediaViewer.f41946i0 && i3 == 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u0Var.c(z10);
            }
            super.setAlpha(i3);
        }

        @Override
        public final void setBounds(int i3, int i10, int i11, int i12) {
            super.setBounds(i3, i10, i11, i12 + org.telegram.messenger.g0.f22603n);
        }

        @Override
        public final void setBounds(Rect rect) {
            rect.bottom += org.telegram.messenger.g0.f22603n;
            super.setBounds(rect);
        }
    }

    public SecretMediaViewer() {
        new Paint();
        this.f41977x0 = 1.0f;
        this.L0 = new DecelerateInterpolator(1.5f);
        this.N0 = 1.0f;
        this.f41933c1 = true;
        this.f41945h1 = new ty0(this, 2);
        this.f41947i1 = new int[2];
        this.f41949j1 = new int[2];
        this.f41961q1 = new ty0(this, 3);
        this.f41967s1 = new Path();
        this.f41969t1 = new r0("videoCrossfadeAlpha", 5);
        this.f41971u1 = new r0("animationValue", 6);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f41940f0;
        secretMediaViewer.f41940f0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f41924w1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f41924w1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f41924w1 = secretMediaViewer;
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
        if (f41924w1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f10, float f11, float f12, boolean z10) {
        if (this.f41977x0 == f10 && this.f41972v0 == f11 && this.f41975w0 == f12) {
            return;
        }
        this.f41935d1 = z10;
        this.A0 = f10;
        this.f41979y0 = f11;
        this.f41980z0 = f12;
        this.I0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.J0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.J0.setInterpolator(this.L0);
        this.J0.setDuration(250);
        this.J0.addListener(new az0(this, 3));
        this.J0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23325w) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f41942g0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f41942g0.f1()))) {
                if (this.K && !this.I) {
                    this.J = true;
                } else if (!e(true, true)) {
                    this.f41943g1 = true;
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23243i0) {
            if (this.f41942g0 != null && this.f41953n != null && ((Long) objArr[0]).longValue() == this.f41974w) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    int keyAt = sparseArray.keyAt(i11);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (this.f41942g0.f1() == ((Integer) arrayList.get(i12)).intValue()) {
                            this.f41942g0.f26868k.destroyTime = keyAt;
                            this.f41953n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23259l0 && this.f41942g0.f1() == ((TLRPC.Message) objArr[0]).f27022id) {
            if (this.K && !this.I) {
                this.J = true;
            } else if (!e(true, true)) {
                this.f41943g1 = true;
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
        return this.f41934d0;
    }

    public final void h(org.telegram.messenger.zi ziVar, qk qkVar, ge geVar, ai.r1 r1Var) {
        mq0 E;
        boolean z10;
        int i3;
        int i10;
        ?? r17;
        int[] iArr;
        cg.u0 u0Var;
        String str;
        Bitmap bitmap;
        org.telegram.messenger.cc ccVar;
        int i11;
        PhotoBackgroundDrawable photoBackgroundDrawable;
        float f10;
        BitmapDrawable bitmapDrawable;
        boolean z11;
        boolean z12;
        int i12;
        float f11;
        BitmapDrawable bitmapDrawable2;
        org.telegram.messenger.ac b10;
        BitmapDrawable bitmapDrawable3;
        if (this.f41928b != null && ziVar.n5() && qkVar != null && (E = qkVar.E(ziVar, null, 0, true, false)) != null) {
            if (ziVar.f26868k.ttl == Integer.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f41959p1 = z10;
            this.f41957o1 = r1Var;
            this.M = qkVar;
            System.currentTimeMillis();
            this.f41948j0 = true;
            this.f41946i0 = true;
            this.f41956o0 = false;
            l4 l4Var = this.f41976x;
            if (l4Var != null) {
                l4Var.setVisibility(4);
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
            this.f41927a1 = false;
            this.f41930b1 = false;
            this.f41933c1 = true;
            o(this.f41977x0);
            PhotoBackgroundDrawable photoBackgroundDrawable2 = this.f41950k0;
            photoBackgroundDrawable2.setAlpha(0);
            this.f41936e.setAlpha(1.0f);
            this.f41936e.setVisibility(0);
            this.f41953n.setAlpha(1.0f);
            this.K = false;
            this.I = false;
            this.J = false;
            this.L = true;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.m1 = false;
            this.N = 0;
            this.O = 0;
            RectF rectF = new RectF(E.f47751a.Q0);
            rectF.left = Math.max(rectF.left, E.f47751a.L0);
            rectF.top = Math.max(rectF.top, E.f47751a.M0);
            rectF.right = Math.min(rectF.right, E.f47751a.y());
            rectF.bottom = Math.min(rectF.bottom, E.f47751a.A());
            float width = rectF.width();
            float height = rectF.height();
            Point point = org.telegram.messenger.g0.f22608q;
            this.f41977x0 = Math.max(width / point.x, height / (point.y + org.telegram.messenger.g0.f22602m));
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
            this.f41972v0 = ((width / 2.0f) + (E.f47752b + f12)) - (i3 / 2);
            this.f41975w0 = ((height / 2.0f) + (E.f47753c + rectF.top)) - (i10 / 2);
            this.f41970u0 = Math.abs(f12 - E.f47751a.L0);
            E.d.getLocationInWindow(new int[2]);
            float f13 = (iArr[r17] - (E.f47753c + rectF.top)) + E.f47758j;
            this.f41960q0 = f13;
            float abs = (int) Math.abs(rectF.top - E.f47751a.M0);
            this.f41960q0 = Math.max(0.0f, Math.max(f13, abs));
            float height2 = (((E.f47753c + rectF.top) + ((int) height)) - (E.d.getHeight() + iArr[r17])) + E.f47757i;
            this.f41963r0 = height2;
            this.f41963r0 = Math.max(0.0f, Math.max(height2, abs));
            this.f41966s0 = 0.0f;
            this.f41966s0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.f41968t0 = 0.0f;
            this.f41968t0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.I0 = System.currentTimeMillis();
            this.f41979y0 = 0.0f;
            this.f41980z0 = 0.0f;
            this.C0 = 0.0f;
            this.E0 = 0.0f;
            this.F0 = 0.0f;
            this.B0 = 0.0f;
            this.D0 = 0.0f;
            this.A0 = 1.0f;
            boolean z13 = r17;
            this.H0 = z13;
            this.f41935d1 = z13;
            cg.u0 u0Var2 = this.k1;
            if (u0Var2 != null) {
                u0Var2.b();
                this.k1 = null;
            }
            LaunchActivity launchActivity = LaunchActivity.K1;
            if (launchActivity != null) {
                u0Var = new cg.u0(launchActivity, z13);
            } else {
                u0Var = null;
            }
            this.k1 = u0Var;
            org.telegram.messenger.hs.f(this.f41925a).b(this, org.telegram.messenger.hs.f23325w);
            org.telegram.messenger.hs.f(this.f41925a).b(this, org.telegram.messenger.hs.f23259l0);
            org.telegram.messenger.hs.f(this.f41925a).b(this, org.telegram.messenger.hs.f23243i0);
            this.f41974w = org.telegram.messenger.zi.C1(ziVar.f26868k.peer_id);
            this.f41942g0 = ziVar;
            TLRPC.Document F0 = ziVar.F0();
            org.telegram.messenger.cc ccVar2 = this.f41944h0;
            if (ccVar2 != null) {
                ccVar2.a();
                this.f41944h0 = null;
            }
            ImageReceiver imageReceiver2 = E.f47751a;
            Drawable drawable = imageReceiver2.f21231b0;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                str = imageReceiver2.Z;
            } else {
                Drawable drawable2 = imageReceiver2.f21256n0;
                if (drawable2 instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable2).getBitmap();
                    str = null;
                } else {
                    str = null;
                    bitmap = null;
                }
            }
            if (bitmap != null) {
                ccVar = new org.telegram.messenger.cc(bitmap, str, 0);
            } else {
                ccVar = null;
            }
            this.f41944h0 = ccVar;
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
                        this.N = tL_documentAttributeVideo.f27008w;
                        this.O = tL_documentAttributeVideo.h;
                        break;
                    }
                    i14++;
                }
                if (org.telegram.messenger.zi.t3(F0, false)) {
                    this.G.setTitle(org.telegram.messenger.bd.M0(2131751410, null));
                    String str2 = ziVar.f26868k.attachPath;
                    if (str2 != null && ziVar.f26913w0) {
                        b10 = org.telegram.messenger.ac.g(str2);
                    } else {
                        b10 = org.telegram.messenger.ac.b(F0);
                    }
                    if (this.f41944h0 != null) {
                        bitmapDrawable3 = new BitmapDrawable(this.f41944h0.f22007c);
                    } else {
                        bitmapDrawable3 = null;
                    }
                    f10 = 1.0f;
                    photoBackgroundDrawable = photoBackgroundDrawable2;
                    i11 = 2;
                    imageReceiver.p0(b10, null, bitmapDrawable3, -1L, null, ziVar, 1);
                } else {
                    i11 = 2;
                    photoBackgroundDrawable = photoBackgroundDrawable2;
                    f10 = 1.0f;
                    this.f41926a0 = 1;
                    this.G.setTitle(org.telegram.messenger.bd.M0(2131751408, null));
                    File file = new File(ziVar.f26868k.attachPath);
                    if (file.exists()) {
                        i(file);
                    } else {
                        org.telegram.messenger.w7.G(this.f41925a);
                        File N = org.telegram.messenger.w7.N(ziVar.f26868k, false, true);
                        File file2 = new File(N.getAbsolutePath() + ".enc");
                        if (file2.exists()) {
                            N = file2;
                        }
                        i(N);
                    }
                    this.K = true;
                    this.T.setVisibility(0);
                    if (this.f41944h0 != null) {
                        bitmapDrawable2 = new BitmapDrawable(this.f41944h0.f22007c);
                    } else {
                        bitmapDrawable2 = null;
                    }
                    imageReceiver.p0(null, null, bitmapDrawable2, -1L, null, ziVar, 2);
                }
            } else {
                i11 = 2;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                f10 = 1.0f;
                this.G.setTitle(org.telegram.messenger.bd.M0(2131751409, null));
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ziVar.f26878n0, org.telegram.messenger.g0.Z0(false), false, null, false);
                org.telegram.messenger.ac f14 = org.telegram.messenger.ac.f(w10, ziVar.f26872l0);
                if (this.f41944h0 != null) {
                    bitmapDrawable = new BitmapDrawable(this.f41944h0.f22007c);
                } else {
                    bitmapDrawable = null;
                }
                imageReceiver.p0(f14, null, bitmapDrawable, -1L, null, ziVar, 2);
                if (w10 != null) {
                    this.N = w10.f27026w;
                    this.O = w10.h;
                }
            }
            k(ziVar, "", false);
            k(ziVar, ziVar.f26924z, true);
            n(true, false);
            l(false, false);
            this.V.a(true, true);
            if (this.f41959p1) {
                bz0 bz0Var = this.f41953n;
                bz0Var.f44171e = true;
                TextPaint textPaint = bz0Var.f44174r;
                textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
                textPaint.setColor(-1);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                bz0Var.f44175s = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f11 = bz0Var.f44175s.getLineWidth(0);
                } else {
                    f11 = 0.0f;
                }
                bz0Var.f44176w = f11;
                bz0Var.f44177x = bz0Var.f44175s.getHeight();
                bz0Var.invalidate();
                this.f41953n.setOnClickListener(new cy0(this, 4));
            } else {
                this.f41953n.setOnClickListener(null);
            }
            try {
                if (this.d.getParent() != null) {
                    ((WindowManager) this.f41928b.getSystemService("window")).removeView(this.d);
                }
                z11 = true;
            } catch (Exception e10) {
                z11 = true;
                org.telegram.messenger.a8.g(e10, true);
            }
            ((WindowManager) this.f41928b.getSystemService("window")).addView(this.d, this.f41931c);
            this.f41953n.invalidate();
            this.f41965s = z11;
            Window window = this.f41928b.getWindow();
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 26) {
                z12 = x7.u.a(window.getDecorView().getSystemUiVisibility(), 16);
            } else {
                z12 = false;
            }
            this.f41955n1 = z12;
            org.telegram.messenger.g0.m3(this.f41928b, false);
            org.telegram.messenger.g0.o3(this.d, false);
            Activity activity = this.f41928b;
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity2 = (LaunchActivity) activity;
                if (i15 >= 26) {
                    i12 = launchActivity2.getWindow().getNavigationBarColor();
                } else {
                    i12 = 0;
                }
                this.m1 = i12;
                ((LaunchActivity) this.f41928b).x(-16777216);
            } else {
                this.m1 = window.getNavigationBarColor();
                org.telegram.messenger.g0.t3(this.f41928b, -16777216, true);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.J0 = animatorSet;
            org.telegram.ui.Components.p7 p7Var = this.G;
            Property property = View.ALPHA;
            float[] fArr = new float[i11];
            
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p7Var, property, fArr);
            float[] fArr2 = new float[i11];
            
            fArr2[0] = 0.0f;
            fArr2[1] = 1.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Z, property, fArr2);
            float[] fArr3 = new float[i11];
            
            fArr3[0] = 0.0f;
            fArr3[1] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f41962r, property, fArr3);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.k6.d, 0, 255);
            float[] fArr4 = new float[i11];
            
            fArr4[0] = 0.0f;
            fArr4[1] = 1.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, this.f41971u1, fArr4);
            cz0 cz0Var = this.T;
            int i16 = i11;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(cz0Var, cz0Var.f44502n, f10);
            cz0 cz0Var2 = this.T;
            if (!this.K) {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(cz0Var2, property, f10);
            Animator[] animatorArr = new Animator[7];
            animatorArr[0] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[i16] = ofFloat3;
            animatorArr[3] = ofInt;
            animatorArr[4] = ofFloat4;
            animatorArr[5] = ofFloat5;
            animatorArr[6] = ofFloat6;
            animatorSet.playTogether(animatorArr);
            this.f41951l0 = 3;
            this.f41954n0 = new wy0(this, geVar, ziVar, 0);
            this.J0.setDuration(250L);
            this.J0.addListener(new az0(this, 0));
            this.m0 = System.currentTimeMillis();
            if (org.telegram.messenger.az.o() == 0) {
                this.f41936e.setLayerType(i16, null);
            }
            this.J0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.f41982b = 0;
            photoBackgroundDrawable.f41981a = new qv0(10, this, E);
            this.J0.start();
        }
    }

    public final void i(File file) {
        if (this.f41928b == null) {
            return;
        }
        j();
        if (this.f41978y == null) {
            l4 l4Var = new l4(this.f41928b);
            this.f41976x = l4Var;
            l4Var.setVisibility(0);
            this.f41936e.addView(this.f41976x, 0, b8.mf.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f41928b);
            this.f41978y = textureView;
            textureView.setOpaque(false);
            this.f41976x.addView(this.f41978y, b8.mf.e(-1, -1, 17));
        }
        this.f41929b0 = false;
        this.f41932c0 = false;
        this.f41978y.setAlpha(1.0f);
        if (this.E == null) {
            bp0 bp0Var = new bp0(this, 1);
            this.E = bp0Var;
            bp0Var.A0(this.f41978y);
            this.E.K = new mi.h0(15, this, file);
        }
        this.E.j0(Uri.fromFile(file), "other");
        this.E.u0(true);
        this.V.a(true, true);
    }

    public final void j() {
        bp0 bp0Var = this.E;
        if (bp0Var != null) {
            this.f41926a0 = 0;
            bp0Var.m0();
            this.E = null;
        }
        try {
            Activity activity = this.f41928b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        l4 l4Var = this.f41976x;
        if (l4Var != null) {
            this.f41936e.removeView(l4Var);
            this.f41976x = null;
        }
        if (this.f41978y != null) {
            this.f41978y = null;
        }
        this.F = false;
    }

    public final void k(org.telegram.messenger.zi ziVar, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.p5.cloneSpans(charSequence, 3);
        if (this.Z == null) {
            FrameLayout frameLayout = new FrameLayout(this.f41936e.getContext());
            this.W = frameLayout;
            this.Y.setContainer(frameLayout);
            mp0 mp0Var = new mp0(this, this.f41936e.getContext(), this.Y, this.W, 1);
            this.Z = mp0Var;
            this.Y.setScrollView(mp0Var);
            this.W.setClipChildren(false);
            this.Z.addView(this.W, new ViewGroup.LayoutParams(-1, -2));
            this.f41936e.addView(this.Z, b8.mf.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.X.n(this.f41936e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.Y.getParent() != this.W) {
            this.Y.setMeasureAllChildren(true);
            this.W.addView(this.Y, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Y.getCurrentView().getText());
        cq0 cq0Var = this.Y;
        if (z10) {
            currentView = cq0Var.getNextView();
        } else {
            currentView = cq0Var.getCurrentView();
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
        mp0 mp0Var2 = this.Z;
        mp0Var2.m0 = false;
        if (z10) {
            TransitionManager.endTransitions(mp0Var2);
            TransitionSet duration = new TransitionSet().addTransition(new yy0(this, isEmpty2, isEmpty, 1)).addTransition(new yy0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.Z.m0 = true;
                duration.addTransition(new org.telegram.ui.Components.rk0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.Y);
            }
            TransitionManager.beginDelayedTransition(this.Z, duration);
            z11 = true;
        } else {
            this.Y.getCurrentView().setText((CharSequence) null);
            mp0 mp0Var3 = this.Z;
            if (mp0Var3 != null) {
                mp0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i3 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.k6.P();
            TLRPC.Message message = ziVar.f26868k;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.f21.M0())) {
                if (!ziVar.f26868k.entities.isEmpty()) {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    ziVar.c(spannableString, true, false);
                    if (org.telegram.messenger.zi.M4(ziVar.f26868k)) {
                        org.telegram.messenger.zi.h(ziVar.Q3(), spannableString, false, 3, (int) ziVar.L0(), false);
                    }
                    cloneSpans = org.telegram.messenger.i6.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    cloneSpans = org.telegram.messenger.i6.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                }
            }
            this.Y.setTag(cloneSpans);
            try {
                this.Y.a(cloneSpans, z10, false);
                mp0 mp0Var4 = this.Z;
                if (mp0Var4 != null) {
                    mp0Var4.H(mp0Var4.getWidth(), mp0Var4.getHeight());
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            cq0 cq0Var2 = this.Y;
            if (this.f41948j0) {
                i3 = 0;
            }
            cq0Var2.setVisibility(i3);
        } else {
            this.Y.a(null, z10, false);
            this.Y.getCurrentView().setTextColor(-1);
            cq0 cq0Var3 = this.Y;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            cq0Var3.b(4, z12);
            this.Y.setTag(null);
        }
        if (this.Y.getCurrentView() instanceof bq0) {
            ((bq0) this.Y.getCurrentView()).setLoading(false);
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
        if (this.f41952l1 == z12 && z11) {
            return;
        }
        this.f41952l1 = z12;
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
            scaleY.alpha(f12).setDuration(340L).setInterpolator(org.telegram.ui.Components.xq.h).start();
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
        int i3;
        this.f41962r.r(true);
        if (this.K) {
            i3 = 2131743590;
        } else {
            i3 = 2131747270;
        }
        String M0 = org.telegram.messenger.bd.M0(i3, null);
        gi.l3 l3Var = this.f41962r;
        l3Var.h = gi.l3.a(M0, l3Var.getTextPaint());
        this.f41962r.u(M0);
        this.f41962r.n(12.0f, 7.0f, 11.0f, 7.0f);
        gi.l3 l3Var2 = this.f41962r;
        l3Var2.getClass();
        l3Var2.f13087f0 = org.telegram.messenger.g0.L(2);
        gi.l3 l3Var3 = this.f41962r;
        l3Var3.getClass();
        l3Var3.f13085e0 = 0.0f;
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624020, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
        ch0Var.start();
        l3Var3.m(ch0Var);
        this.f41962r.w();
        org.telegram.messenger.hp.e1().edit().putInt("viewoncehint", org.telegram.messenger.hp.e1().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void n(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        ty0 ty0Var = this.f41961q1;
        org.telegram.messenger.g0.r(ty0Var);
        if (z10 && this.K) {
            org.telegram.messenger.g0.i3(ty0Var, 3000L);
        }
        if (z10) {
            this.G.setVisibility(0);
        }
        this.G.setEnabled(z10);
        this.f41948j0 = z10;
        l(z10, z11);
        float f17 = 0.0f;
        if (z11) {
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.Components.p7 p7Var = this.G;
            Property property = View.ALPHA;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(p7Var, property, f13));
            cz0 cz0Var = this.T;
            r0 r0Var = cz0Var.f44502n;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(cz0Var, r0Var, f14));
            mp0 mp0Var = this.Z;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(mp0Var, property, f15));
            View view = this.S;
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
            View view2 = this.f41939f;
            if (z10) {
                f17 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f17));
            AnimatorSet animatorSet = new AnimatorSet();
            this.H = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z10) {
                this.H.addListener(new az0(this, 1));
            }
            this.H.setDuration(200L);
            this.H.start();
            return;
        }
        org.telegram.ui.Components.p7 p7Var2 = this.G;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        p7Var2.setAlpha(f10);
        mp0 mp0Var2 = this.Z;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        mp0Var2.setAlpha(f11);
        View view3 = this.S;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        view3.setAlpha(f12);
        View view4 = this.f41939f;
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
        int width = ((int) ((imageReceiver.N0 * f10) - this.f41936e.getWidth())) / 2;
        int height = ((int) ((imageReceiver.O0 * f10) - this.f41936e.getHeight())) / 2;
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
        if (this.f41977x0 != 1.0f) {
            this.f41941f1.a();
            this.f41941f1.c(Math.round(this.f41972v0), Math.round(this.f41975w0), Math.round(f10), Math.round(f11), (int) this.U0, (int) this.V0, (int) this.W0, (int) this.X0);
            this.f41936e.postInvalidate();
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
        if (this.f41938e1) {
            return false;
        }
        if (this.E != null && this.f41948j0 && motionEvent.getX() >= this.U.getX() && motionEvent.getY() >= this.U.getY() && motionEvent.getX() <= this.U.getX() + this.U.getMeasuredWidth() && motionEvent.getX() <= this.U.getX() + this.U.getMeasuredWidth()) {
            bp0 bp0Var = this.E;
            bp0Var.u0(!bp0Var.d.u());
            if (this.E.d.u()) {
                n(true, true);
                return true;
            }
            l(true, true);
            return true;
        }
        n(!this.f41948j0, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f10) {
        this.animationValue = f10;
        this.f41936e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f10) {
        this.f41934d0 = f10;
        this.f41936e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
