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
public class SecretMediaViewer implements gk7, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer w1;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public i88 E;
    public float E0;
    public boolean F;
    public float F0;
    public x10 G;
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
    public fs1 M;
    public float M0;
    public int N;
    public int O;
    public float O0;
    public tbc P;
    public float P0;
    public si9 Q;
    public float Q0;
    public jia R;
    public float R0;
    public View S;
    public float S0;
    public ju9 T;
    public float T0;
    public ImageView U;
    public float U0;
    public xb8 V;
    public float V0;
    public FrameLayout W;
    public float W0;
    public s78 X;
    public float X0;
    public g98 Y;
    public boolean Y0;
    public r88 Z;
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
    public oc6 d;
    public float d0;
    public boolean d1;
    public st e;
    public long e0;
    public boolean e1;
    public View f;
    public WindowInsets f0;
    public kr9 f1;
    public k27 g0;
    public boolean g1;
    public jl5 h0;
    public boolean i0;
    public a06 k1;
    public byte l0;
    public boolean l1;
    public long m0;
    public int m1;
    public iu9 n;
    public Runnable n0;
    public boolean n1;
    public boolean o0;
    public Runnable o1;
    public float p0;
    public boolean p1;
    public float q0;
    public je5 r;
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
    public ix x;
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
    public final cu9 h1 = new cu9(this, (byte) 2);
    public final int[] i1 = new int[2];
    public final int[] j1 = new int[2];
    public final cu9 q1 = new cu9(this, (byte) 3);
    public final Path s1 = new Path();
    public final pm t1 = new pm("videoCrossfadeAlpha", (byte) 13);
    public final pm u1 = new pm("animationValue", (byte) 14);

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
        this.J0.addListener(new hu9(this, (byte) 3));
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
        if (i == kk7.v) {
            if (!((Boolean) objArr[2]).booleanValue() && this.g0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.g0.e1()))) {
                if (this.K && !this.I) {
                    this.J = true;
                } else if (!c(true, true)) {
                    this.g1 = true;
                }
            }
        } else if (i == kk7.h0) {
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
        } else if (i == kk7.k0 && this.g0.e1() == ((TLRPC.Message) objArr[0]).id) {
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

    public final void h(k27 k27Var, fs1 fs1Var, bl1 bl1Var, de2 de2Var) {
        p98 M;
        boolean z;
        int i;
        int i2;
        ?? r17;
        int[] iArr;
        String str;
        Bitmap bitmap;
        jl5 jl5Var;
        int i3;
        PhotoBackgroundDrawable photoBackgroundDrawable;
        float f;
        BitmapDrawable bitmapDrawable;
        boolean z2;
        boolean z3;
        int i4;
        float f2;
        File M2;
        BitmapDrawable bitmapDrawable2;
        gl5 b;
        BitmapDrawable bitmapDrawable3;
        if (this.b != null && k27Var.l5() && fs1Var != null && (M = fs1Var.M(k27Var, null, 0, true, false)) != null) {
            if (k27Var.k.ttl == Integer.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            this.p1 = z;
            this.o1 = de2Var;
            this.M = fs1Var;
            System.currentTimeMillis();
            this.j0 = true;
            this.i0 = true;
            this.o0 = false;
            ix ixVar = this.x;
            if (ixVar != null) {
                ixVar.setVisibility(4);
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
            RectF rectF = new RectF(M.a.Q0);
            rectF.left = Math.max(rectF.left, M.a.L0);
            rectF.top = Math.max(rectF.top, M.a.M0);
            rectF.right = Math.min(rectF.right, M.a.w());
            rectF.bottom = Math.min(rectF.bottom, M.a.x());
            float width = rectF.width();
            float height = rectF.height();
            Point point = gl.q;
            this.x0 = Math.max(width / point.x, height / (point.y + gl.m));
            int[] iArr2 = M.h;
            if (iArr2 != null) {
                this.G0 = new int[iArr2.length];
                r17 = 1;
                int i5 = 0;
                while (true) {
                    int[] iArr3 = M.h;
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
            this.v0 = ((width / 2.0f) + (M.b + f3)) - (i / 2);
            this.w0 = ((height / 2.0f) + (M.c + rectF.top)) - (i2 / 2);
            this.u0 = Math.abs(f3 - M.a.L0);
            M.d.getLocationInWindow(new int[2]);
            float f4 = (iArr[r17] - (M.c + rectF.top)) + M.j;
            this.q0 = f4;
            float abs = (int) Math.abs(rectF.top - M.a.M0);
            this.q0 = Math.max(0.0f, Math.max(f4, abs));
            float height2 = (((M.c + rectF.top) + ((int) height)) - (M.d.getHeight() + iArr[r17])) + M.i;
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
            a06 a06Var = this.k1;
            if (a06Var != null) {
                a06Var.a();
                this.k1 = null;
            }
            this.k1 = LaunchActivity.c0();
            kk7.f(this.a).a(this, kk7.v);
            kk7.f(this.a).a(this, kk7.k0);
            kk7.f(this.a).a(this, kk7.h0);
            this.w = k27.B1(k27Var.k.peer_id);
            this.g0 = k27Var;
            TLRPC.Document F0 = k27Var.F0();
            jl5 jl5Var2 = this.h0;
            if (jl5Var2 != null) {
                jl5Var2.a();
                this.h0 = null;
            }
            ImageReceiver imageReceiver2 = M.a;
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
                jl5Var = new jl5(bitmap, str, 0);
            } else {
                jl5Var = null;
            }
            this.h0 = jl5Var;
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
                if (k27.s3(F0, false)) {
                    this.G.setTitle(k96.M0(2131751397, null));
                    String str2 = k27Var.k.attachPath;
                    if (str2 != null && k27Var.y0) {
                        b = gl5.g(str2);
                    } else {
                        b = gl5.b(F0);
                    }
                    if (this.h0 != null) {
                        bitmapDrawable3 = new BitmapDrawable(this.h0.c);
                    } else {
                        bitmapDrawable3 = null;
                    }
                    f = 1.0f;
                    photoBackgroundDrawable = photoBackgroundDrawable2;
                    i3 = 2;
                    imageReceiver.c0(b, null, bitmapDrawable3, -1L, null, k27Var, 1);
                } else {
                    i3 = 2;
                    photoBackgroundDrawable = photoBackgroundDrawable2;
                    f = 1.0f;
                    this.a0 = 1;
                    this.G.setTitle(k96.M0(2131751395, null));
                    File file = new File(k27Var.k.attachPath);
                    if (file.exists()) {
                        i(file);
                    } else {
                        boolean D3 = k27Var.D3();
                        int i7 = this.a;
                        if (D3) {
                            ba4.G(i7);
                            M2 = ba4.J(F0, null, true, true);
                        } else {
                            ba4.G(i7);
                            M2 = ba4.M(k27Var.k, false, true);
                        }
                        File file2 = new File(M2.getAbsolutePath() + ".enc");
                        if (file2.exists()) {
                            M2 = file2;
                        }
                        i(M2);
                    }
                    this.K = true;
                    this.T.setVisibility(0);
                    if (this.h0 != null) {
                        bitmapDrawable2 = new BitmapDrawable(this.h0.c);
                    } else {
                        bitmapDrawable2 = null;
                    }
                    imageReceiver.c0(null, null, bitmapDrawable2, -1L, null, k27Var, 2);
                }
            } else {
                i3 = 2;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                f = 1.0f;
                this.G.setTitle(k96.M0(2131751396, null));
                TLRPC.PhotoSize w = ba4.w(k27Var.p0, gl.Y0(false), false, null, false);
                gl5 f5 = gl5.f(w, k27Var.n0);
                if (this.h0 != null) {
                    bitmapDrawable = new BitmapDrawable(this.h0.c);
                } else {
                    bitmapDrawable = null;
                }
                imageReceiver.c0(f5, null, bitmapDrawable, -1L, null, k27Var, 2);
                if (w != null) {
                    this.N = w.w;
                    this.O = w.h;
                }
            }
            k(k27Var, "", false);
            k(k27Var, k27Var.z, true);
            n(true, false);
            l(false, false);
            this.V.a(true, true);
            boolean z5 = this.p1;
            iu9 iu9Var = this.n;
            if (z5) {
                iu9Var.e = true;
                TextPaint textPaint = iu9Var.r;
                textPaint.setTextSize(gl.L(13.0f));
                textPaint.setTypeface(gl.n1("fonts/num.otf"));
                textPaint.setColor(-1);
                StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                iu9Var.s = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f2 = iu9Var.s.getLineWidth(0);
                } else {
                    f2 = 0.0f;
                }
                iu9Var.w = f2;
                iu9Var.x = iu9Var.s.getHeight();
                iu9Var.invalidate();
                this.n.setOnClickListener(new ik8(this, (byte) 19));
            } else {
                iu9Var.setOnClickListener(null);
            }
            try {
                if (this.d.getParent() != null) {
                    ((WindowManager) this.b.getSystemService("window")).removeView(this.d);
                }
                z2 = true;
            } catch (Exception e) {
                z2 = true;
                fa4.g(e, true);
            }
            ((WindowManager) this.b.getSystemService("window")).addView(this.d, this.c);
            this.n.invalidate();
            this.s = z2;
            Window window = this.b.getWindow();
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 26) {
                z3 = fod.a(window.getDecorView().getSystemUiVisibility(), 16);
            } else {
                z3 = false;
            }
            this.n1 = z3;
            gl.h3(this.b, false);
            gl.j3(this.d, false);
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
                    gl.p3(activity2.getWindow(), -16777216, true, null);
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.J0 = animatorSet;
            x10 x10Var = this.G;
            Property property = View.ALPHA;
            float[] fArr = new float[i3];
            
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x10Var, property, fArr);
            float[] fArr2 = new float[i3];
            
            fArr2[0] = 0.0f;
            fArr2[1] = 1.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Z, property, fArr2);
            float[] fArr3 = new float[i3];
            
            fArr3[0] = 0.0f;
            fArr3[1] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.r, property, fArr3);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, rn.d, 0, 255);
            float[] fArr4 = new float[i3];
            
            fArr4[0] = 0.0f;
            fArr4[1] = 1.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, this.u1, fArr4);
            ju9 ju9Var = this.T;
            int i9 = i3;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ju9Var, ju9Var.n, f);
            ju9 ju9Var2 = this.T;
            if (!this.K) {
                f = 0.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(ju9Var2, property, f);
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
            this.n0 = new gm8(this, bl1Var, k27Var, (byte) 27);
            this.J0.setDuration(250L);
            this.J0.addListener(new hu9(this, (byte) 0));
            this.m0 = System.currentTimeMillis();
            if (gba.o() == 0) {
                this.e.setLayerType(i9, null);
            }
            this.J0.setInterpolator(new DecelerateInterpolator());
            photoBackgroundDrawable.b = 0;
            photoBackgroundDrawable.a = new tj9(this, M, (byte) 16);
            this.J0.start();
        }
    }

    public final void i(File file) {
        if (this.b == null) {
            return;
        }
        j();
        if (this.y == null) {
            ix ixVar = new ix(this.b);
            this.x = ixVar;
            ixVar.setVisibility(0);
            this.e.addView(this.x, 0, nme.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.b);
            this.y = textureView;
            textureView.setOpaque(false);
            this.x.addView(this.y, nme.e(-1, -1, 17));
        }
        this.b0 = false;
        this.c0 = false;
        this.y.setAlpha(1.0f);
        i88 i88Var = this.E;
        if (i88Var == null) {
            i88 i88Var2 = new i88(this, (byte) 1);
            this.E = i88Var2;
            i88Var2.z0(this.y);
            i88Var = this.E;
            i88Var.K = new wk4(this, file, false, (byte) 25);
        }
        i88Var.i0(Uri.fromFile(file), "other");
        this.E.t0(true);
        this.V.a(true, true);
    }

    public final void j() {
        i88 i88Var = this.E;
        if (i88Var != null) {
            this.a0 = 0;
            i88Var.l0();
            this.E = null;
        }
        try {
            Activity activity = this.b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        ix ixVar = this.x;
        if (ixVar != null) {
            this.e.removeView(ixVar);
            this.x = null;
        }
        if (this.y != null) {
            this.y = null;
        }
        this.F = false;
    }

    public final void k(k27 k27Var, CharSequence charSequence, boolean z) {
        TextView currentView;
        boolean z2;
        CharSequence cloneSpans = gm.cloneSpans(charSequence, 3);
        if (this.Z == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.W = frameLayout;
            this.Y.setContainer(frameLayout);
            r88 r88Var = new r88(this, this.e.getContext(), this.Y, this.W, (byte) 1);
            this.Z = r88Var;
            this.Y.setScrollView(r88Var);
            this.W.setClipChildren(false);
            this.Z.addView(this.W, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.Z, nme.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.X.m(this.e.getContext()).bringToFront();
        }
        boolean z3 = true;
        if (this.Y.getParent() != this.W) {
            this.Y.setMeasureAllChildren(true);
            this.W.addView(this.Y, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Y.getCurrentView().getText());
        g98 g98Var = this.Y;
        if (z) {
            currentView = g98Var.getNextView();
        } else {
            currentView = g98Var.getCurrentView();
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
        r88 r88Var2 = this.Z;
        r88Var2.l0 = false;
        if (z) {
            TransitionManager.endTransitions(r88Var2);
            TransitionSet duration = new TransitionSet().addTransition(new fu9(this, isEmpty2, isEmpty, (byte) 1)).addTransition(new fu9(this, isEmpty2, isEmpty, (byte) 0)).setDuration(200L);
            if (!isEmpty2) {
                this.Z.l0 = true;
                duration.addTransition(new u88(this, (byte) 2));
            } else if (!isEmpty) {
                duration.addTarget((View) this.Y);
            }
            TransitionManager.beginDelayedTransition(this.Z, duration);
            z2 = true;
        } else {
            this.Y.getCurrentView().setText((CharSequence) null);
            r88 r88Var3 = this.Z;
            if (r88Var3 != null) {
                r88Var3.scrollTo(0, 0);
            }
            z2 = false;
        }
        int i = 4;
        if (!isEmpty) {
            bkb.O();
            TLRPC.Message message = k27Var.k;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, rzb.G0())) {
                if (!k27Var.k.entities.isEmpty()) {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    k27Var.c(spannableString, true, false);
                    if (k27.K4(k27Var.k)) {
                        k27.h(k27Var.O3(), spannableString, false, 3, (int) k27Var.L0(), false);
                    }
                    cloneSpans = vu3.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    cloneSpans = vu3.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                }
            }
            this.Y.setTag(cloneSpans);
            try {
                this.Y.a(cloneSpans, z, false);
                r88 r88Var4 = this.Z;
                if (r88Var4 != null) {
                    r88Var4.H(r88Var4.getWidth(), r88Var4.getHeight());
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            g98 g98Var2 = this.Y;
            if (this.j0) {
                i = 0;
            }
            g98Var2.setVisibility(i);
        } else {
            this.Y.a(null, z, false);
            this.Y.getCurrentView().setTextColor(-1);
            g98 g98Var3 = this.Y;
            if (z2 && !isEmpty2) {
                z3 = false;
            }
            g98Var3.b(4, z3);
            this.Y.setTag(null);
        }
        if (this.Y.getCurrentView() instanceof f98) {
            ((f98) this.Y.getCurrentView()).setLoading(false);
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
            scaleY.alpha(f3).setDuration(340L).setInterpolator(s33.h).start();
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
            i = 2131743338;
        } else {
            i = 2131747069;
        }
        String M0 = k96.M0(i, null);
        je5 je5Var = this.r;
        je5Var.h = je5.a(M0, je5Var.getTextPaint());
        this.r.t(M0);
        this.r.m(12.0f, 7.0f, 11.0f, 7.0f);
        je5 je5Var2 = this.r;
        je5Var2.getClass();
        je5Var2.f0 = gl.L(2.0f);
        je5 je5Var3 = this.r;
        je5Var3.getClass();
        je5Var3.e0 = 0.0f;
        oy8 oy8Var = new oy8(2131624021, gl.L(34.0f), gl.L(34.0f));
        oy8Var.start();
        je5Var3.l(oy8Var);
        this.r.v();
        na7.c1().edit().putInt("viewoncehint", na7.c1().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void n(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        cu9 cu9Var = this.q1;
        gl.r(cu9Var);
        if (z && this.K) {
            gl.d3(cu9Var, 3000L);
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
            x10 x10Var = this.G;
            Property property = View.ALPHA;
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(x10Var, property, f4));
            ju9 ju9Var = this.T;
            pm pmVar = ju9Var.n;
            if (z) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ju9Var, pmVar, f5));
            r88 r88Var = this.Z;
            if (z) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(r88Var, property, f6));
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
                this.H.addListener(new hu9(this, (byte) 1));
            }
            this.H.setDuration(200L);
            this.H.start();
            return;
        }
        x10 x10Var2 = this.G;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        x10Var2.setAlpha(f);
        r88 r88Var2 = this.Z;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        r88Var2.setAlpha(f2);
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
            i88 i88Var = this.E;
            i88Var.t0(!i88Var.d.s());
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
        public tj9 a;
        public int b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            tj9 tj9Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.b == 2 && (tj9Var = this.a) != null) {
                    tj9Var.run();
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
            a06 a06Var = secretMediaViewer.k1;
            if (a06Var != null) {
                if (secretMediaViewer.i0 && i == 255) {
                    z = true;
                } else {
                    z = false;
                }
                a06Var.b(z);
            }
            super.setAlpha(i);
        }

        @Override
        public final void setBounds(Rect rect) {
            rect.bottom += gl.n;
            super.setBounds(rect);
        }

        @Override
        public final void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4 + gl.n);
        }
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
