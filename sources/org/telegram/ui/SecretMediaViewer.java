package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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
public class SecretMediaViewer implements jm7, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer w1;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public la8 E;
    public float E0;
    public boolean F;
    public float F0;
    public x20 G;
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
    public st1 M;
    public float M0;
    public int N;
    public int O;
    public float O0;
    public vdc P;
    public float P0;
    public xd9 Q;
    public float Q0;
    public lka R;
    public float R0;
    public View S;
    public float S0;
    public mw9 T;
    public float T0;
    public ImageView U;
    public float U0;
    public ae8 V;
    public float V0;
    public FrameLayout W;
    public float W0;
    public v98 X;
    public float X0;
    public hb8 Y;
    public boolean Y0;
    public ta8 Z;
    public boolean Z0;
    public int a;
    public int a0;
    public boolean a1;
    private float animationValue;
    public Activity b;
    public boolean b0;
    public boolean b1;
    public WindowManager.LayoutParams c;
    public boolean c0;
    public ne6 d;
    public float d0;
    public boolean d1;
    public su e;
    public long e0;
    public boolean e1;
    public View f;
    public WindowInsets f0;
    public mt9 f1;
    public k47 g0;
    public boolean g1;
    public jn5 h0;
    public boolean i0;
    public a26 k1;
    public byte l0;
    public boolean l1;
    public long m0;
    public int m1;
    public lw9 n;
    public Runnable n0;
    public boolean n1;
    public boolean o0;
    public Runnable o1;
    public float p0;
    public boolean p1;
    public float q0;
    public hg5 r;
    public float r0;
    public float[] r1;
    public boolean s;
    public float s0;
    public float t0;
    public float u0;
    public float v0;
    public boolean v1;
    public long w;
    public float w0;
    public jy x;
    public TextureView y;
    public float y0;
    public float z0;
    public final ImageReceiver h = new ImageReceiver(null);
    public boolean j0 = true;
    public final PhotoBackgroundDrawable k0 = new PhotoBackgroundDrawable();
    public float x0 = 1.0f;
    public final DecelerateInterpolator L0 = new DecelerateInterpolator(1.5f);
    public float N0 = 1.0f;
    public boolean c1 = true;
    public final ew9 h1 = new ew9(this, (byte) 2);
    public final int[] i1 = new int[2];
    public final int[] j1 = new int[2];
    public final ew9 q1 = new ew9(this, (byte) 3);
    public final Path s1 = new Path();
    public final pn t1 = new pn("videoCrossfadeAlpha", (byte) 13);
    public final pn u1 = new pn("animationValue", (byte) 14);

    public static SecretMediaViewer d() {
        SecretMediaViewer secretMediaViewer;
        SecretMediaViewer secretMediaViewer2 = w1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                secretMediaViewer = w1;
                if (secretMediaViewer == null) {
                    secretMediaViewer = new SecretMediaViewer();
                    w1 = secretMediaViewer;
                }
            }
            return secretMediaViewer;
        }
        return secretMediaViewer2;
    }

    public static boolean e() {
        if (w1 != null) {
            return true;
        }
        return false;
    }

    public final void a(float f, float f2, float f3, boolean z) {
        if (this.x0 == f && this.v0 == f2 && this.w0 == f3) {
            return;
        }
        this.d1 = z;
        this.A0 = f;
        this.y0 = f2;
        this.z0 = f3;
        this.I0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.J0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.J0.setInterpolator(this.L0);
        this.J0.setDuration(250L);
        this.J0.addListener(new kw9(this, (byte) 3));
        this.J0.start();
    }

    public final void b(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.b(boolean):void");
    }

    public final boolean c(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.c(boolean, boolean):boolean");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.v) {
            if (!((Boolean) objArr[2]).booleanValue() && this.g0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.g0.e1()))) {
                if (this.K && !this.I) {
                    this.J = true;
                } else if (!c(true, true)) {
                    this.g1 = true;
                }
            }
        } else if (i == nm7.i0) {
            if (this.g0 != null && this.n != null && ((Long) objArr[0]).longValue() == this.w) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    int keyAt = sparseArray.keyAt(i3);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        if (this.g0.e1() == ((Integer) arrayList.get(i4)).intValue()) {
                            this.g0.k.destroyTime = keyAt;
                            this.n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i == nm7.l0 && this.g0.e1() == ((TLRPC.Message) objArr[0]).id) {
            if (this.K && !this.I) {
                this.J = true;
            } else if (!c(true, true)) {
                this.g1 = true;
            }
        }
    }

    public final WindowInsets f(WindowInsets windowInsets) {
        WindowInsets windowInsets2 = this.f0;
        this.f0 = windowInsets;
        if (windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) {
            this.d.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public final void g(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.g(android.graphics.Canvas):void");
    }

    public float getAnimationValue() {
        return this.animationValue;
    }

    public float getVideoCrossfadeAlpha() {
        return this.d0;
    }

    public final void h(k47 k47Var, st1 st1Var, jm1 jm1Var, of2 of2Var) {
        qb8 N;
        boolean z;
        int i;
        int i2;
        ?? r17;
        int[] iArr;
        String str;
        Bitmap bitmap;
        jn5 jn5Var;
        int i3;
        PhotoBackgroundDrawable photoBackgroundDrawable;
        float f;
        BitmapDrawable bitmapDrawable;
        boolean z2;
        boolean z3;
        int i4;
        float f2;
        File M;
        BitmapDrawable bitmapDrawable2;
        gn5 b;
        BitmapDrawable bitmapDrawable3;
        if (this.b != null && k47Var.l5() && st1Var != null && (N = st1Var.N(k47Var, null, 0, true, false)) != null) {
            if (k47Var.k.ttl == Integer.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            this.p1 = z;
            this.o1 = of2Var;
            this.M = st1Var;
            System.currentTimeMillis();
            this.j0 = true;
            this.i0 = true;
            this.o0 = false;
            jy jyVar = this.x;
            if (jyVar != null) {
                jyVar.setVisibility(4);
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
            this.a1 = false;
            this.b1 = false;
            this.c1 = true;
            o(this.x0);
            PhotoBackgroundDrawable photoBackgroundDrawable2 = this.k0;
            photoBackgroundDrawable2.setAlpha(0);
            this.e.setAlpha(1.0f);
            this.e.setVisibility(0);
            this.n.setAlpha(1.0f);
            this.K = false;
            this.I = false;
            this.J = false;
            this.L = true;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.m1 = false;
            this.N = 0;
            this.O = 0;
            RectF rectF = new RectF(N.a.Q0);
            rectF.left = Math.max(rectF.left, N.a.L0);
            rectF.top = Math.max(rectF.top, N.a.M0);
            rectF.right = Math.min(rectF.right, N.a.w());
            rectF.bottom = Math.min(rectF.bottom, N.a.x());
            float width = rectF.width();
            float height = rectF.height();
            Point point = gm.q;
            this.x0 = Math.max(width / point.x, height / (point.y + gm.m));
            int[] iArr2 = N.h;
            if (iArr2 != null) {
                this.G0 = new int[iArr2.length];
                r17 = 1;
                int i5 = 0;
                while (true) {
                    int[] iArr3 = N.h;
                    if (i5 >= iArr3.length) {
                        break;
                    }
                    this.G0[i5] = iArr3[i5];
                    i5++;
                }
            } else {
                r17 = 1;
                this.G0 = null;
            }
            float f3 = rectF.left;
            this.v0 = ((width / 2.0f) + (N.b + f3)) - (i / 2);
            this.w0 = ((height / 2.0f) + (N.c + rectF.top)) - (i2 / 2);
            this.u0 = Math.abs(f3 - N.a.L0);
            N.d.getLocationInWindow(new int[2]);
            float f4 = (iArr[r17] - (N.c + rectF.top)) + N.j;
            this.q0 = f4;
            float abs = (int) Math.abs(rectF.top - N.a.M0);
            this.q0 = Math.max(0.0f, Math.max(f4, abs));
            float height2 = (((N.c + rectF.top) + ((int) height)) - (N.d.getHeight() + iArr[r17])) + N.i;
            this.r0 = height2;
            this.r0 = Math.max(0.0f, Math.max(height2, abs));
            this.s0 = 0.0f;
            this.s0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.t0 = 0.0f;
            this.t0 = Math.max(0.0f, Math.max(0.0f, abs));
            this.I0 = System.currentTimeMillis();
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            this.C0 = 0.0f;
            this.E0 = 0.0f;
            this.F0 = 0.0f;
            this.B0 = 0.0f;
            this.D0 = 0.0f;
            this.A0 = 1.0f;
            boolean z4 = r17;
            this.H0 = z4;
            this.d1 = z4;
            a26 a26Var = this.k1;
            if (a26Var != null) {
                a26Var.a();
                this.k1 = null;
            }
            this.k1 = LaunchActivity.c0();
            nm7.f(this.a).a(this, nm7.v);
            nm7.f(this.a).a(this, nm7.l0);
            nm7.f(this.a).a(this, nm7.i0);
            this.w = k47.B1(k47Var.k.peer_id);
            this.g0 = k47Var;
            TLRPC.Document F0 = k47Var.F0();
            jn5 jn5Var2 = this.h0;
            if (jn5Var2 != null) {
                jn5Var2.a();
                this.h0 = null;
            }
            ImageReceiver imageReceiver2 = N.a;
            Drawable drawable = imageReceiver2.b0;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                str = imageReceiver2.Z;
            } else {
                Drawable drawable2 = imageReceiver2.n0;
                if (drawable2 instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable2).getBitmap();
                    str = null;
                } else {
                    str = null;
                    bitmap = null;
                }
            }
            if (bitmap != null) {
                jn5Var = new jn5(bitmap, str, 0);
            } else {
                jn5Var = null;
            }
            this.h0 = jn5Var;
            this.T.setVisibility(8);
            if (F0 != null) {
                int i6 = 0;
                while (true) {
                    if (i6 >= F0.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i6);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                        this.N = tL_documentAttributeVideo.w;
                        this.O = tL_documentAttributeVideo.h;
                        break;
                    }
                    i6++;
                }
                if (k47.s3(F0, false)) {
                    this.G.setTitle(jb6.M0(2131751346, null));
                    String str2 = k47Var.k.attachPath;
                    if (str2 != null && k47Var.y0) {
                        b = gn5.g(str2);
                    } else {
                        b = gn5.b(F0);
                    }
                    if (this.h0 != null) {
                        bitmapDrawable3 = new BitmapDrawable(this.h0.c);
                    } else {
                        bitmapDrawable3 = null;
                    }
                    f = 1.0f;
                    photoBackgroundDrawable = photoBackgroundDrawable2;
                    i3 = 2;
                    imageReceiver.c0(b, null, bitmapDrawable3, -1L, null, k47Var, 1);
                } else {
                    i3 = 2;
                    photoBackgroundDrawable = photoBackgroundDrawable2;
                    f = 1.0f;
                    this.a0 = 1;
                    this.G.setTitle(jb6.M0(2131751344, null));
                    File file = new File(k47Var.k.attachPath);
                    if (file.exists()) {
                        i(file);
                    } else {
                        boolean D3 = k47Var.D3();
                        int i7 = this.a;
                        if (D3) {
                            bc4.G(i7);
                            M = bc4.J(F0, null, true, true);
                        } else {
                            bc4.G(i7);
                            M = bc4.M(k47Var.k, false, true);
                        }
                        File file2 = new File(M.getAbsolutePath() + ".enc");
                        if (file2.exists()) {
                            M = file2;
                        }
                        i(M);
                    }
                    this.K = true;
                    this.T.setVisibility(0);
                    if (this.h0 != null) {
                        bitmapDrawable2 = new BitmapDrawable(this.h0.c);
                    } else {
                        bitmapDrawable2 = null;
                    }
                    imageReceiver.c0(null, null, bitmapDrawable2, -1L, null, k47Var, 2);
                }
            } else {
                i3 = 2;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                f = 1.0f;
                this.G.setTitle(jb6.M0(2131751345, null));
                TLRPC.PhotoSize w = bc4.w(k47Var.p0, gm.Y0(false), false, null, false);
                gn5 f5 = gn5.f(w, k47Var.n0);
                if (this.h0 != null) {
                    bitmapDrawable = new BitmapDrawable(this.h0.c);
                } else {
                    bitmapDrawable = null;
                }
                imageReceiver.c0(f5, null, bitmapDrawable, -1L, null, k47Var, 2);
                if (w != null) {
                    this.N = w.w;
                    this.O = w.h;
                }
            }
            k(k47Var, "", false);
            k(k47Var, k47Var.z, true);
            n(true, false);
            l(false, false);
            this.V.a(true, true);
            boolean z5 = this.p1;
            lw9 lw9Var = this.n;
            if (z5) {
                lw9Var.e = true;
                TextPaint textPaint = lw9Var.r;
                textPaint.setTextSize(gm.L(13.0f));
                textPaint.setTypeface(gm.n1("fonts/num.otf"));
                textPaint.setColor(-1);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                lw9Var.s = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f2 = lw9Var.s.getLineWidth(0);
                } else {
                    f2 = 0.0f;
                }
                lw9Var.w = f2;
                lw9Var.x = lw9Var.s.getHeight();
                lw9Var.invalidate();
                this.n.setOnClickListener(new wk8(this, (byte) 22));
            } else {
                lw9Var.setOnClickListener(null);
            }
            try {
                if (this.d.getParent() != null) {
                    ((WindowManager) this.b.getSystemService("window")).removeView(this.d);
                }
                z2 = true;
            } catch (Exception e) {
                z2 = true;
                fc4.g(e, true);
            }
            ((WindowManager) this.b.getSystemService("window")).addView(this.d, this.c);
            this.n.invalidate();
            this.s = z2;
            Window window = this.b.getWindow();
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 26) {
                z3 = iqd.a(window.getDecorView().getSystemUiVisibility(), 16);
            } else {
                z3 = false;
            }
            this.n1 = z3;
            gm.h3(this.b, false);
            gm.j3(this.d, false);
            Activity activity = this.b;
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (i8 >= 26) {
                    i4 = launchActivity.getWindow().getNavigationBarColor();
                } else {
                    i4 = 0;
                }
                this.m1 = i4;
                ((LaunchActivity) this.b).z(-16777216);
            } else {
                this.m1 = window.getNavigationBarColor();
                Activity activity2 = this.b;
                if (activity2 != null) {
                    gm.p3(activity2.getWindow(), -16777216, true, null);
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.J0 = animatorSet;
            x20 x20Var = this.G;
            Property property = View.ALPHA;
            float[] fArr = new float[i3];
            
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x20Var, property, fArr);
            float[] fArr2 = new float[i3];
            
            fArr2[0] = 0.0f;
            fArr2[1] = 1.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Z, property, fArr2);
            float[] fArr3 = new float[i3];
            
            fArr3[0] = 0.0f;
            fArr3[1] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.r, property, fArr3);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, so.d, 0, 255);
            float[] fArr4 = new float[i3];
            
            fArr4[0] = 0.0f;
            fArr4[1] = 1.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, this.u1, fArr4);
            mw9 mw9Var = this.T;
            int i9 = i3;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(mw9Var, mw9Var.n, f);
            mw9 mw9Var2 = this.T;
            if (!this.K) {
                f = 0.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(mw9Var2, property, f);
            Animator[] animatorArr = new Animator[7];
            animatorArr[0] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[i9] = ofFloat3;
            animatorArr[3] = ofInt;
            animatorArr[4] = ofFloat4;
            animatorArr[5] = ofFloat5;
            animatorArr[6] = ofFloat6;
            animatorSet.playTogether(animatorArr);
            this.l0 = (byte) 3;
            this.n0 = new hw9(this, jm1Var, k47Var, (byte) 0);
            this.J0.setDuration(250L);
            this.J0.addListener(new kw9(this, (byte) 0));
            this.m0 = System.currentTimeMillis();
            if (gda.o() == 0) {
                this.e.setLayerType(i9, null);
            }
            this.J0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.b = 0;
            photoBackgroundDrawable.a = new il9(this, N, (byte) 18);
            this.J0.start();
        }
    }

    public final void i(File file) {
        if (this.b == null) {
            return;
        }
        j();
        if (this.y == null) {
            jy jyVar = new jy(this.b);
            this.x = jyVar;
            jyVar.setVisibility(0);
            this.e.addView(this.x, 0, qoe.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.b);
            this.y = textureView;
            textureView.setOpaque(false);
            this.x.addView(this.y, qoe.e(-1, -1, 17));
        }
        this.b0 = false;
        this.c0 = false;
        this.y.setAlpha(1.0f);
        la8 la8Var = this.E;
        if (la8Var == null) {
            la8 la8Var2 = new la8(this, (byte) 1);
            this.E = la8Var2;
            la8Var2.z0(this.y);
            la8Var = this.E;
            la8Var.K = new wm4(this, file, false, (byte) 25);
        }
        la8Var.i0(Uri.fromFile(file), "other");
        this.E.t0(true);
        this.V.a(true, true);
    }

    public final void j() {
        la8 la8Var = this.E;
        if (la8Var != null) {
            this.a0 = 0;
            la8Var.l0();
            this.E = null;
        }
        try {
            Activity activity = this.b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        jy jyVar = this.x;
        if (jyVar != null) {
            this.e.removeView(jyVar);
            this.x = null;
        }
        if (this.y != null) {
            this.y = null;
        }
        this.F = false;
    }

    public final void k(k47 k47Var, CharSequence charSequence, boolean z) {
        TextView currentView;
        boolean z2;
        CharSequence cloneSpans = gn.cloneSpans(charSequence, 3);
        if (this.Z == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.W = frameLayout;
            this.Y.setContainer(frameLayout);
            ta8 ta8Var = new ta8(this, this.e.getContext(), this.Y, this.W, (byte) 1);
            this.Z = ta8Var;
            this.Y.setScrollView(ta8Var);
            this.W.setClipChildren(false);
            this.Z.addView(this.W, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.Z, qoe.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.X.m(this.e.getContext()).bringToFront();
        }
        boolean z3 = true;
        if (this.Y.getParent() != this.W) {
            this.Y.setMeasureAllChildren(true);
            this.W.addView(this.Y, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Y.getCurrentView().getText());
        hb8 hb8Var = this.Y;
        if (z) {
            currentView = hb8Var.getNextView();
        } else {
            currentView = hb8Var.getCurrentView();
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
        ta8 ta8Var2 = this.Z;
        ta8Var2.l0 = false;
        if (z) {
            TransitionManager.endTransitions(ta8Var2);
            TransitionSet duration = new TransitionSet().addTransition(new iw9(this, isEmpty2, isEmpty, (byte) 1)).addTransition(new iw9(this, isEmpty2, isEmpty, (byte) 0)).setDuration(200L);
            if (!isEmpty2) {
                this.Z.l0 = true;
                duration.addTransition(new wa8(this, (byte) 2));
            } else if (!isEmpty) {
                duration.addTarget((View) this.Y);
            }
            TransitionManager.beginDelayedTransition(this.Z, duration);
            z2 = true;
        } else {
            this.Y.getCurrentView().setText((CharSequence) null);
            ta8 ta8Var3 = this.Z;
            if (ta8Var3 != null) {
                ta8Var3.scrollTo(0, 0);
            }
            z2 = false;
        }
        int i = 4;
        if (!isEmpty) {
            cmb.O();
            TLRPC.Message message = k47Var.k;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, s1c.G0())) {
                if (!k47Var.k.entities.isEmpty()) {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    k47Var.c(spannableString, true, false);
                    if (k47.K4(k47Var.k)) {
                        k47.h(k47Var.O3(), spannableString, false, 3, (int) k47Var.L0(), false);
                    }
                    cloneSpans = gw3.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    cloneSpans = gw3.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                }
            }
            this.Y.setTag(cloneSpans);
            try {
                this.Y.a(cloneSpans, z, false);
                ta8 ta8Var4 = this.Z;
                if (ta8Var4 != null) {
                    ta8Var4.H(ta8Var4.getWidth(), ta8Var4.getHeight());
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            hb8 hb8Var2 = this.Y;
            if (this.j0) {
                i = 0;
            }
            hb8Var2.setVisibility(i);
        } else {
            this.Y.a(null, z, false);
            this.Y.getCurrentView().setTextColor(-1);
            hb8 hb8Var3 = this.Y;
            if (z2 && !isEmpty2) {
                z3 = false;
            }
            hb8Var3.b(4, z3);
            this.Y.setTag(null);
        }
        if (this.Y.getCurrentView() instanceof gb8) {
            ((gb8) this.Y.getCurrentView()).setLoading(false);
        }
    }

    public final void l(boolean z, boolean z2) {
        boolean z3;
        float f;
        float f2;
        if (this.K && z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.l1 == z3 && z2) {
            return;
        }
        this.l1 = z3;
        this.U.animate().cancel();
        ImageView imageView = this.U;
        float f3 = 0.0f;
        float f4 = 0.6f;
        if (z2) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z3) {
                f2 = 1.0f;
            } else {
                f2 = 0.6f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f2);
            if (z3) {
                f4 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f4);
            if (z3) {
                f3 = 1.0f;
            }
            scaleY.alpha(f3).setDuration(340L).setInterpolator(d53.h).start();
            return;
        }
        if (z3) {
            f = 1.0f;
        } else {
            f = 0.6f;
        }
        imageView.setScaleX(f);
        ImageView imageView2 = this.U;
        if (z3) {
            f4 = 1.0f;
        }
        imageView2.setScaleY(f4);
        ImageView imageView3 = this.U;
        if (z3) {
            f3 = 1.0f;
        }
        imageView3.setAlpha(f3);
    }

    public final void m() {
        int i;
        this.r.p(true);
        if (this.K) {
            i = 2131743264;
        } else {
            i = 2131746995;
        }
        String M0 = jb6.M0(i, null);
        hg5 hg5Var = this.r;
        hg5Var.h = hg5.a(M0, hg5Var.getTextPaint());
        this.r.t(M0);
        this.r.m(12.0f, 7.0f, 11.0f, 7.0f);
        hg5 hg5Var2 = this.r;
        hg5Var2.getClass();
        hg5Var2.f0 = gm.L(2.0f);
        hg5 hg5Var3 = this.r;
        hg5Var3.getClass();
        hg5Var3.e0 = 0.0f;
        p09 p09Var = new p09(2131624021, gm.L(34.0f), gm.L(34.0f));
        p09Var.start();
        hg5Var3.l(p09Var);
        this.r.v();
        oc7.d1().edit().putInt("viewoncehint", oc7.d1().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void n(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        ew9 ew9Var = this.q1;
        gm.r(ew9Var);
        if (z && this.K) {
            gm.d3(ew9Var, 3000L);
        }
        if (z) {
            this.G.setVisibility(0);
        }
        this.G.setEnabled(z);
        this.j0 = z;
        l(z, z2);
        float f8 = 0.0f;
        if (z2) {
            ArrayList arrayList = new ArrayList();
            x20 x20Var = this.G;
            Property property = View.ALPHA;
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(x20Var, property, f4));
            mw9 mw9Var = this.T;
            pn pnVar = mw9Var.n;
            if (z) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(mw9Var, pnVar, f5));
            ta8 ta8Var = this.Z;
            if (z) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ta8Var, property, f6));
            View view = this.S;
            if (z) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f7));
            View view2 = this.f;
            if (z) {
                f8 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f8));
            AnimatorSet animatorSet = new AnimatorSet();
            this.H = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z) {
                this.H.addListener(new kw9(this, (byte) 1));
            }
            this.H.setDuration(200L);
            this.H.start();
            return;
        }
        x20 x20Var2 = this.G;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        x20Var2.setAlpha(f);
        ta8 ta8Var2 = this.Z;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        ta8Var2.setAlpha(f2);
        View view3 = this.S;
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        view3.setAlpha(f3);
        View view4 = this.f;
        if (z) {
            f8 = 1.0f;
        }
        view4.setAlpha(f8);
        if (!z) {
            this.G.setVisibility(8);
            this.Z.scrollTo(0, 0);
        }
    }

    public final void o(float f) {
        ImageReceiver imageReceiver = this.h;
        int width = ((int) ((imageReceiver.N0 * f) - this.e.getWidth())) / 2;
        int height = ((int) ((imageReceiver.O0 * f) - this.e.getHeight())) / 2;
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
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.x0 != 1.0f) {
            this.f1.a();
            this.f1.c(Math.round(this.v0), Math.round(this.w0), Math.round(f), Math.round(f2), (int) this.U0, (int) this.V0, (int) this.W0, (int) this.X0);
            this.e.postInvalidate();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.e1) {
            return false;
        }
        if (this.E != null && this.j0 && motionEvent.getX() >= this.U.getX() && motionEvent.getY() >= this.U.getY() && motionEvent.getX() <= this.U.getX() + this.U.getMeasuredWidth() && motionEvent.getX() <= this.U.getX() + this.U.getMeasuredWidth()) {
            la8 la8Var = this.E;
            la8Var.t0(!la8Var.d.s());
            if (this.E.d.s()) {
                n(true, true);
                return true;
            }
            l(true, true);
            return true;
        }
        n(!this.j0, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f) {
        this.animationValue = f;
        this.e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f) {
        this.d0 = f;
        this.e.invalidate();
    }

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public il9 a;
        public int b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            il9 il9Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.b == 2 && (il9Var = this.a) != null) {
                    il9Var.run();
                    this.a = null;
                } else {
                    invalidateSelf();
                }
                this.b++;
            }
        }

        @Override
        public void setAlpha(int i) {
            boolean z;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            a26 a26Var = secretMediaViewer.k1;
            if (a26Var != null) {
                if (secretMediaViewer.i0 && i == 255) {
                    z = true;
                } else {
                    z = false;
                }
                a26Var.b(z);
            }
            super.setAlpha(i);
        }

        @Override
        public final void setBounds(Rect rect) {
            rect.bottom += gm.n;
            super.setBounds(rect);
        }

        @Override
        public final void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4 + gm.n);
        }
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
