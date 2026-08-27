package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
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
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public class SecretMediaViewer implements NotificationCenter.NotificationCenterDelegate, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    public static volatile SecretMediaViewer f36118t1;
    public boolean A;
    public float A0;
    public ag.d2 B;
    public float B0;
    public AnimatorSet C;
    public float C0;
    public boolean D;
    public int[] D0;
    public boolean E;
    public boolean E0;
    public boolean F;
    public long F0;
    public long G;
    public AnimatorSet G0;
    public long H;
    public GestureDetector H0;
    public boolean I;
    public final DecelerateInterpolator I0;
    public au0 J;
    public float J0;
    public int K;
    public float K0;
    public int L;
    public float L0;
    public org.telegram.ui.Components.o61 M;
    public float M0;
    public aj0 N;
    public float N0;
    public org.telegram.ui.ActionBar.h5 O;
    public float O0;
    public View P;
    public float P0;
    public w31 Q;
    public float Q0;
    public ImageView R;
    public float R0;
    public org.telegram.ui.Components.tf0 S;
    public float S0;
    public FrameLayout T;
    public float T0;
    public ur0 U;
    public float U0;
    public qt0 V;
    public boolean V0;
    public at0 W;
    public boolean W0;
    public int X;
    public boolean X0;
    public boolean Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;

    public int f36119a;

    public float f36120a0;

    public boolean f36121a1;
    private float animationValue;

    public Activity f36122b;

    public long f36123b0;

    public boolean f36124b1;

    public WindowManager.LayoutParams f36125c;

    public WindowInsets f36126c0;

    public org.telegram.ui.Components.bm0 f36127c1;
    public n0 d;

    public MessageObject f36128d0;

    public boolean f36129d1;

    public ag.y1 f36130e;

    public ImageReceiver.BitmapHolder f36131e0;

    public final o31 f36132e1;

    public View f36133f;

    public boolean f36134f0;

    public final int[] f36135f1;

    public final int[] f36137g1;

    public gf.t0 f36139h1;

    public int f36140i0;

    public boolean f36141i1;

    public long f36142j0;

    public int f36143j1;

    public Runnable f36144k0;

    public boolean f36145k1;

    public boolean f36146l0;
    public Runnable l1;
    public float m0;

    public boolean f36147m1;

    public v31 f36148n;

    public float f36149n0;

    public final o31 f36150n1;

    public float f36151o0;

    public float[] f36152o1;

    public float f36153p0;

    public final Path f36154p1;

    public float f36155q0;

    public final w0 f36156q1;

    public lh.w3 f36157r;

    public float f36158r0;

    public final w0 f36159r1;

    public boolean f36160s;

    public float f36161s0;

    public boolean f36162s1;

    public float f36163t0;

    public float f36164u0;
    public long v;

    public float f36165v0;

    public c5.c f36166w;

    public float f36167w0;

    public TextureView f36168x;

    public float f36169x0;

    public u31 f36170y;

    public float f36171y0;

    public float f36172z0;
    public final ImageReceiver h = new ImageReceiver();

    public boolean f36136g0 = true;

    public final PhotoBackgroundDrawable f36138h0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {

        public m21 f36173a;

        public int f36174b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            m21 m21Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f36174b != 2 || (m21Var = this.f36173a) == null) {
                    invalidateSelf();
                } else {
                    m21Var.run();
                    this.f36173a = null;
                }
                this.f36174b++;
            }
        }

        @Override
        public void setAlpha(int i10) {
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            gf.t0 t0Var = secretMediaViewer.f36139h1;
            if (t0Var != null) {
                t0Var.a(secretMediaViewer.f36134f0 && i10 == 255);
            }
            super.setAlpha(i10);
        }

        @Override
        public final void setBounds(int i10, int i11, int i12, int i13) {
            super.setBounds(i10, i11, i12, i13 + AndroidUtilities.navigationBarHeight);
        }

        @Override
        public final void setBounds(Rect rect) {
            rect.bottom += AndroidUtilities.navigationBarHeight;
            super.setBounds(rect);
        }
    }

    public SecretMediaViewer() {
        new Paint();
        this.f36164u0 = 1.0f;
        this.I0 = new DecelerateInterpolator(1.5f);
        this.K0 = 1.0f;
        this.Z0 = true;
        this.f36132e1 = new o31(this, 2);
        this.f36135f1 = new int[2];
        this.f36137g1 = new int[2];
        this.f36150n1 = new o31(this, 3);
        this.f36154p1 = new Path();
        this.f36156q1 = new w0("videoCrossfadeAlpha", 4);
        this.f36159r1 = new w0("animationValue", 5);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f36126c0;
        secretMediaViewer.f36126c0 = windowInsets;
        if (windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) {
            secretMediaViewer.d.requestLayout();
        }
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void b(SecretMediaViewer secretMediaViewer, Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float fZ;
        float fZ2;
        float fZ3;
        float fZ4;
        float f14;
        float f15;
        float f16;
        boolean z10;
        float f17;
        float f18;
        int i10;
        PhotoBackgroundDrawable photoBackgroundDrawable = secretMediaViewer.f36138h0;
        Path path = secretMediaViewer.f36154p1;
        ImageReceiver imageReceiver = secretMediaViewer.h;
        if (secretMediaViewer.f36134f0) {
            if (secretMediaViewer.G0 != null) {
                org.telegram.ui.Components.bm0 bm0Var = secretMediaViewer.f36127c1;
                if (!bm0Var.f27178q) {
                    bm0Var.a();
                }
                float f19 = secretMediaViewer.f36164u0;
                float f20 = secretMediaViewer.f36169x0;
                float f21 = secretMediaViewer.animationValue;
                f12 = ((f20 - f19) * f21) + f19;
                float f22 = secretMediaViewer.f36163t0;
                float fZ5 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.f36167w0, f22, f21, f22);
                float f23 = secretMediaViewer.f36161s0;
                fZ = com.google.android.recaptcha.internal.a.z(secretMediaViewer.f36165v0, f23, f21, f23);
                f10 = -1.0f;
                float f24 = secretMediaViewer.f36149n0;
                f11 = 1.0f;
                fZ2 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.f36171y0, f24, f21, f24);
                float f25 = secretMediaViewer.f36151o0;
                fZ3 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.f36172z0, f25, f21, f25);
                float f26 = secretMediaViewer.f36153p0;
                fZ4 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.A0, f26, f21, f26);
                float f27 = secretMediaViewer.f36155q0;
                float fZ6 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.B0, f27, f21, f27);
                float f28 = secretMediaViewer.f36158r0;
                float fZ7 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.C0, f28, f21, f28);
                float f29 = (f20 == 1.0f && f19 == 1.0f && f23 == 0.0f) ? fZ5 : -1.0f;
                secretMediaViewer.f36130e.invalidate();
                f15 = fZ7;
                f16 = fZ5;
                f13 = f29;
                f14 = fZ6;
            } else {
                f10 = -1.0f;
                f11 = 1.0f;
                if (secretMediaViewer.F0 != 0) {
                    secretMediaViewer.f36161s0 = secretMediaViewer.f36165v0;
                    secretMediaViewer.f36163t0 = secretMediaViewer.f36167w0;
                    secretMediaViewer.f36151o0 = secretMediaViewer.f36172z0;
                    secretMediaViewer.f36149n0 = secretMediaViewer.f36171y0;
                    secretMediaViewer.f36153p0 = secretMediaViewer.A0;
                    secretMediaViewer.f36155q0 = secretMediaViewer.B0;
                    secretMediaViewer.f36158r0 = secretMediaViewer.C0;
                    float f30 = secretMediaViewer.f36169x0;
                    secretMediaViewer.f36164u0 = f30;
                    secretMediaViewer.F0 = 0L;
                    secretMediaViewer.n(f30);
                    secretMediaViewer.f36121a1 = false;
                }
                org.telegram.ui.Components.bm0 bm0Var2 = secretMediaViewer.f36127c1;
                if (!bm0Var2.f27178q && bm0Var2.b()) {
                    org.telegram.ui.Components.bm0 bm0Var3 = secretMediaViewer.f36127c1;
                    float f31 = bm0Var3.f27165b;
                    if (f31 < secretMediaViewer.S0 && f31 > secretMediaViewer.R0) {
                        secretMediaViewer.f36161s0 = bm0Var3.f27171j;
                    }
                    float f32 = bm0Var3.f27166c;
                    if (f32 < secretMediaViewer.U0 && f32 > secretMediaViewer.T0) {
                        secretMediaViewer.f36163t0 = bm0Var3.f27172k;
                    }
                    secretMediaViewer.f36130e.invalidate();
                }
                f12 = secretMediaViewer.f36164u0;
                f13 = secretMediaViewer.f36163t0;
                fZ = secretMediaViewer.f36161s0;
                fZ2 = secretMediaViewer.f36149n0;
                fZ3 = secretMediaViewer.f36151o0;
                fZ4 = secretMediaViewer.f36153p0;
                f14 = secretMediaViewer.f36155q0;
                f15 = secretMediaViewer.f36158r0;
                if (secretMediaViewer.W0) {
                    f16 = f13;
                    f13 = -1.0f;
                } else {
                    f16 = f13;
                }
            }
            if (secretMediaViewer.D0 != null) {
                if (secretMediaViewer.f36152o1 == null) {
                    secretMediaViewer.f36152o1 = new float[8];
                }
                float f33 = secretMediaViewer.E0 ? secretMediaViewer.animationValue : f11 - secretMediaViewer.animationValue;
                int i11 = 0;
                z10 = true;
                for (int i12 = 8; i11 < i12; i12 = 8) {
                    float[] fArr = secretMediaViewer.f36152o1;
                    int i13 = i11;
                    float fLerp = AndroidUtilities.lerp(secretMediaViewer.D0[i11 / 2] * 2.0f, 0.0f, f33);
                    fArr[i11 + 1] = fLerp;
                    fArr[i13] = fLerp;
                    if (secretMediaViewer.f36152o1[i13] > 0.0f) {
                        z10 = false;
                    }
                    i11 = i13 + 2;
                }
            } else {
                z10 = true;
            }
            if (secretMediaViewer.f36140i0 == 3) {
                f17 = 1.0f;
                f18 = 0.0f;
            } else {
                if (secretMediaViewer.f36164u0 != f11 || f13 == f10 || secretMediaViewer.f36121a1) {
                    photoBackgroundDrawable.setAlpha(255);
                } else {
                    float height = secretMediaViewer.f36130e.getHeight() / 4.0f;
                    photoBackgroundDrawable.setAlpha((int) Math.max(127.0f, (f11 - (Math.min(Math.abs(f13), height) / height)) * 255.0f));
                }
                if (secretMediaViewer.f36121a1) {
                    f17 = 1.0f;
                    f18 = 0.0f;
                } else {
                    float f34 = secretMediaViewer.S0;
                    if (fZ > f34) {
                        float fMin = Math.min(1.0f, (fZ - f34) / canvas.getWidth());
                        f18 = 0.3f * fMin;
                        f17 = 1.0f - fMin;
                        fZ = secretMediaViewer.S0;
                    } else {
                        f17 = 1.0f;
                        f18 = 0.0f;
                    }
                }
            }
            c5.c cVar = secretMediaViewer.f36166w;
            boolean z11 = cVar != null && cVar.getVisibility() == 0;
            canvas.save();
            float f35 = f12 - f18;
            canvas.translate((secretMediaViewer.f36130e.getWidth() / 2) + fZ, (secretMediaViewer.f36130e.getHeight() / 2) + f16);
            canvas.scale(f35, f35);
            int bitmapWidth = imageReceiver.getBitmapWidth();
            int bitmapHeight = imageReceiver.getBitmapHeight();
            int i14 = secretMediaViewer.K;
            if (i14 != 0 && (i10 = secretMediaViewer.L) != 0) {
                bitmapWidth = i14;
                bitmapHeight = i10;
            }
            if (z11 && secretMediaViewer.Y && Math.abs((bitmapWidth / bitmapHeight) - (secretMediaViewer.f36168x.getMeasuredWidth() / secretMediaViewer.f36168x.getMeasuredHeight())) > 0.01f) {
                bitmapWidth = secretMediaViewer.f36168x.getMeasuredWidth();
                bitmapHeight = secretMediaViewer.f36168x.getMeasuredHeight();
            }
            float f36 = bitmapHeight;
            float f37 = bitmapWidth;
            float fMin2 = Math.min(secretMediaViewer.f36130e.getHeight() / f36, secretMediaViewer.f36130e.getWidth() / f37);
            int i15 = (int) (f37 * fMin2);
            int i16 = (int) (f36 * fMin2);
            float f38 = (-i15) / 2;
            float f39 = f15 / f35;
            float f40 = f38 + f39;
            float f41 = (-i16) / 2;
            float f42 = fZ4;
            float f43 = (i15 / 2) - f39;
            float f44 = i16 / 2;
            canvas.clipRect(f40, (fZ2 / f35) + f41, f43, f44 - (fZ3 / f35));
            if (!z10) {
                path.reset();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f40, (f42 / f35) + f41, f43, f44 - (f14 / f35));
                path.addRoundRect(rectF, secretMediaViewer.f36152o1, Path.Direction.CW);
                canvas.clipPath(path);
            }
            if (!z11 || !secretMediaViewer.Y || !secretMediaViewer.Z || secretMediaViewer.f36120a0 != 1.0f) {
                imageReceiver.setAlpha(f17);
                imageReceiver.setImageCoords(f38, f41, i15, i16);
                imageReceiver.draw(canvas);
            }
            if (z11) {
                if (!secretMediaViewer.Z && secretMediaViewer.Y) {
                    secretMediaViewer.Z = true;
                    secretMediaViewer.f36120a0 = 0.0f;
                    secretMediaViewer.f36123b0 = System.currentTimeMillis();
                }
                canvas.translate(f38, f41);
                secretMediaViewer.f36168x.setAlpha(f17 * secretMediaViewer.f36120a0);
                secretMediaViewer.f36166w.draw(canvas);
                if (secretMediaViewer.Z && secretMediaViewer.f36120a0 < 1.0f) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j10 = jCurrentTimeMillis - secretMediaViewer.f36123b0;
                    secretMediaViewer.f36123b0 = jCurrentTimeMillis;
                    secretMediaViewer.f36120a0 = (j10 / 200.0f) + secretMediaViewer.f36120a0;
                    secretMediaViewer.f36130e.invalidate();
                    if (secretMediaViewer.f36120a0 > 1.0f) {
                        secretMediaViewer.f36120a0 = 1.0f;
                    }
                }
            }
            canvas.restore();
        }
    }

    public static SecretMediaViewer f() {
        SecretMediaViewer secretMediaViewer;
        SecretMediaViewer secretMediaViewer2 = f36118t1;
        if (secretMediaViewer2 != null) {
            return secretMediaViewer2;
        }
        synchronized (PhotoViewer.class) {
            try {
                secretMediaViewer = f36118t1;
                if (secretMediaViewer == null) {
                    secretMediaViewer = new SecretMediaViewer();
                    f36118t1 = secretMediaViewer;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return secretMediaViewer;
    }

    public static boolean g() {
        return f36118t1 != null;
    }

    public final void c(float f10, float f11, float f12, boolean z10) {
        if (this.f36164u0 == f10 && this.f36161s0 == f11 && this.f36163t0 == f12) {
            return;
        }
        this.f36121a1 = z10;
        this.f36169x0 = f10;
        this.f36165v0 = f11;
        this.f36167w0 = f12;
        this.F0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.G0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.G0.setInterpolator(this.I0);
        this.G0.setDuration(250);
        this.G0.addListener(new t31(this, 3));
        this.G0.start();
    }

    public final void d(boolean z10) {
        float f10 = this.f36161s0;
        float f11 = this.f36163t0;
        n(this.f36164u0);
        float f12 = this.f36161s0;
        float f13 = this.R0;
        if (f12 < f13) {
            f10 = f13;
        } else {
            f13 = this.S0;
            if (f12 > f13) {
                f10 = f13;
            }
        }
        float f14 = this.f36163t0;
        float f15 = this.T0;
        if (f14 < f15) {
            f11 = f15;
        } else {
            f15 = this.U0;
            if (f14 > f15) {
                f11 = f15;
            }
        }
        c(this.f36164u0, f10, f11, z10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f36128d0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f36128d0.getId()))) {
                if (this.F && !this.D) {
                    this.E = true;
                    return;
                } else {
                    if (e(true, true)) {
                        return;
                    }
                    this.f36129d1 = true;
                    return;
                }
            }
            return;
        }
        if (i10 != NotificationCenter.didCreatedNewDeleteTask) {
            if (i10 == NotificationCenter.updateMessageMedia) {
                if (this.f36128d0.getId() == ((TLRPC.Message) objArr[0]).f22401id) {
                    if (this.F && !this.D) {
                        this.E = true;
                        return;
                    } else {
                        if (e(true, true)) {
                            return;
                        }
                        this.f36129d1 = true;
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this.f36128d0 == null || this.f36148n == null || ((Long) objArr[0]).longValue() != this.v) {
            return;
        }
        SparseArray sparseArray = (SparseArray) objArr[1];
        for (int i12 = 0; i12 < sparseArray.size(); i12++) {
            int iKeyAt = sparseArray.keyAt(i12);
            ArrayList arrayList = (ArrayList) sparseArray.get(iKeyAt);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                if (this.f36128d0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                    this.f36128d0.messageOwner.destroyTime = iKeyAt;
                    this.f36148n.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean e(boolean z10, boolean z11) {
        cu0 cu0VarE;
        Runnable runnable;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        if (this.f36122b == null || !this.f36134f0) {
            return false;
        }
        if (this.f36140i0 != 0 && Math.abs(this.f36142j0 - System.currentTimeMillis()) >= 500) {
            Runnable runnable2 = this.f36144k0;
            if (runnable2 != null) {
                runnable2.run();
                this.f36144k0 = null;
            }
            this.f36140i0 = 0;
        }
        if (this.f36140i0 != 0) {
            return false;
        }
        if (this.f36147m1 && z11) {
            return false;
        }
        Activity activity = this.f36122b;
        if (activity != null) {
            AndroidUtilities.setLightNavigationBar(activity, this.f36145k1);
            AndroidUtilities.setNavigationBarColor(this.f36122b, this.f36143j1);
            Activity activity2 = this.f36122b;
            if (activity2 instanceof LaunchActivity) {
                ((LaunchActivity) activity2).y(this.f36143j1);
            } else {
                AndroidUtilities.setNavigationBarColor(activity2, this.f36143j1);
            }
        }
        gf.t0 t0Var = this.f36139h1;
        if (t0Var != null) {
            t0Var.destroy();
            this.f36139h1 = null;
        }
        NotificationCenter.getInstance(this.f36119a).removeObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getInstance(this.f36119a).removeObserver(this, NotificationCenter.updateMessageMedia);
        NotificationCenter.getInstance(this.f36119a).removeObserver(this, NotificationCenter.didCreatedNewDeleteTask);
        this.f36136g0 = false;
        this.H = System.currentTimeMillis();
        au0 au0Var = this.J;
        if (au0Var != null) {
            MessageObject messageObject = this.f36128d0;
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if ((messageMedia.photo instanceof TLRPC.TL_photoEmpty) || (messageMedia.document instanceof TLRPC.TL_documentEmpty)) {
                cu0VarE = null;
            } else {
                cu0VarE = au0Var.E(messageObject, null, 0, true, false);
            }
        } else {
            cu0VarE = null;
        }
        u31 u31Var = this.f36170y;
        if (u31Var != null) {
            u31Var.C();
        }
        PhotoBackgroundDrawable photoBackgroundDrawable = this.f36138h0;
        int i10 = 1;
        if (z10) {
            this.f36140i0 = 3;
            this.f36130e.invalidate();
            this.G0 = new AnimatorSet();
            if (cu0VarE == null || cu0VarE.f37153a.getThumbBitmap() == null || z11 || this.l1 != null) {
                c10 = 7;
                c11 = 6;
                c12 = 5;
                c13 = 4;
                c14 = 3;
                int i11 = AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight;
                if (this.f36163t0 < 0.0f) {
                    i11 = -i11;
                }
                this.f36167w0 = i11;
            } else {
                cu0VarE.f37153a.setVisible(false, true);
                RectF drawRegion = cu0VarE.f37153a.getDrawRegion();
                c10 = 7;
                float f10 = drawRegion.right - drawRegion.left;
                c11 = 6;
                float f11 = drawRegion.bottom - drawRegion.top;
                Point point = AndroidUtilities.displaySize;
                c12 = 5;
                int i12 = point.x;
                int i13 = point.y + AndroidUtilities.statusBarHeight;
                c13 = 4;
                c14 = 3;
                this.f36169x0 = Math.max(f10 / i12, f11 / i13);
                float f12 = cu0VarE.f37154b;
                float f13 = drawRegion.left;
                this.f36165v0 = ((f10 / 2.0f) + (f12 + f13)) - (i12 / 2);
                this.f36167w0 = ((f11 / 2.0f) + (cu0VarE.f37155c + drawRegion.top)) - (i13 / 2);
                this.C0 = Math.abs(f13 - cu0VarE.f37153a.getImageX());
                int iAbs = (int) Math.abs(drawRegion.top - cu0VarE.f37153a.getImageY());
                int[] iArr = new int[2];
                cu0VarE.d.getLocationInWindow(iArr);
                float f14 = (iArr[1] - (cu0VarE.f37155c + drawRegion.top)) + cu0VarE.f37160j;
                this.f36171y0 = f14;
                float f15 = iAbs;
                this.f36171y0 = Math.max(0.0f, Math.max(f14, f15));
                float height = (((cu0VarE.f37155c + drawRegion.top) + ((int) f11)) - (cu0VarE.d.getHeight() + iArr[1])) + cu0VarE.f37159i;
                this.f36172z0 = height;
                this.f36172z0 = Math.max(0.0f, Math.max(height, f15));
                this.A0 = 0.0f;
                this.A0 = Math.max(0.0f, Math.max(0.0f, f15));
                this.B0 = 0.0f;
                this.B0 = Math.max(0.0f, Math.max(0.0f, f15));
                this.F0 = System.currentTimeMillis();
                this.f36121a1 = true;
            }
            this.E0 = false;
            k(false, true);
            boolean z12 = this.F;
            w0 w0Var = this.f36159r1;
            if (z12) {
                this.Z = false;
                this.Y = false;
                AnimatorSet animatorSet = this.G0;
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.m6.d, 0);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, w0Var, 0.0f, 1.0f);
                ag.d2 d2Var = this.B;
                Property property = View.ALPHA;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(d2Var, (Property<ag.d2, Float>) property, 0.0f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.W, (Property<at0, Float>) property, 0.0f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f36133f, (Property<View, Float>) property, 0.0f);
                w31 w31Var = this.Q;
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(w31Var, w31Var.f43596n, 0.0f);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.Q, (Property<w31, Float>) property, 0.0f);
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f36157r, (Property<lh.w3, Float>) property, 0.0f);
                ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this, this.f36156q1, 0.0f);
                Animator[] animatorArr = new Animator[9];
                animatorArr[0] = objectAnimatorOfInt;
                animatorArr[1] = objectAnimatorOfFloat;
                animatorArr[2] = objectAnimatorOfFloat2;
                animatorArr[c14] = objectAnimatorOfFloat3;
                animatorArr[c13] = objectAnimatorOfFloat4;
                animatorArr[c12] = objectAnimatorOfFloat5;
                animatorArr[c11] = objectAnimatorOfFloat6;
                animatorArr[c10] = objectAnimatorOfFloat7;
                animatorArr[8] = objectAnimatorOfFloat8;
                animatorSet.playTogether(animatorArr);
            } else {
                ImageReceiver imageReceiver = this.h;
                imageReceiver.setManualAlphaAnimator(true);
                AnimatorSet animatorSet2 = this.G0;
                ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.m6.d, 0);
                ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this, w0Var, 0.0f, 1.0f);
                ag.d2 d2Var2 = this.B;
                Property property2 = View.ALPHA;
                ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(d2Var2, (Property<ag.d2, Float>) property2, 0.0f);
                ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(this.W, (Property<at0, Float>) property2, 0.0f);
                ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(this.f36133f, (Property<View, Float>) property2, 0.0f);
                w31 w31Var2 = this.Q;
                ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(w31Var2, w31Var2.f43596n, 0.0f);
                ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(this.Q, (Property<w31, Float>) property2, 0.0f);
                ObjectAnimator objectAnimatorOfFloat15 = ObjectAnimator.ofFloat(this.f36157r, (Property<lh.w3, Float>) property2, 0.0f);
                ObjectAnimator objectAnimatorOfFloat16 = ObjectAnimator.ofFloat(imageReceiver, org.telegram.ui.Components.m6.f30580c, 0.0f);
                Animator[] animatorArr2 = new Animator[9];
                animatorArr2[0] = objectAnimatorOfInt2;
                animatorArr2[1] = objectAnimatorOfFloat9;
                animatorArr2[2] = objectAnimatorOfFloat10;
                animatorArr2[c14] = objectAnimatorOfFloat11;
                animatorArr2[c13] = objectAnimatorOfFloat12;
                animatorArr2[c12] = objectAnimatorOfFloat13;
                animatorArr2[c11] = objectAnimatorOfFloat14;
                animatorArr2[c10] = objectAnimatorOfFloat15;
                animatorArr2[8] = objectAnimatorOfFloat16;
                animatorSet2.playTogether(animatorArr2);
            }
            this.f36144k0 = new o31(this, cu0VarE, 0);
            this.G0.setInterpolator(new DecelerateInterpolator());
            this.G0.setDuration(250L);
            this.G0.addListener(new org.telegram.ui.Components.fk0(14, this, cu0VarE));
            this.f36142j0 = System.currentTimeMillis();
            this.f36130e.setLayerType(2, null);
            this.G0.start();
            runnable = null;
        } else {
            k(false, true);
            AnimatorSet animatorSet3 = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat17 = ObjectAnimator.ofFloat(this.f36130e, (Property<ag.y1, Float>) View.SCALE_X, 0.9f);
            ObjectAnimator objectAnimatorOfFloat18 = ObjectAnimator.ofFloat(this.f36130e, (Property<ag.y1, Float>) View.SCALE_Y, 0.9f);
            ObjectAnimator objectAnimatorOfInt3 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.m6.d, 0);
            ag.d2 d2Var3 = this.B;
            Property property3 = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat19 = ObjectAnimator.ofFloat(d2Var3, (Property<ag.d2, Float>) property3, 0.0f);
            ObjectAnimator objectAnimatorOfFloat20 = ObjectAnimator.ofFloat(this.W, (Property<at0, Float>) property3, 0.0f);
            ObjectAnimator objectAnimatorOfFloat21 = ObjectAnimator.ofFloat(this.f36133f, (Property<View, Float>) property3, 0.0f);
            w31 w31Var3 = this.Q;
            animatorSet3.playTogether(objectAnimatorOfFloat17, objectAnimatorOfFloat18, objectAnimatorOfInt3, objectAnimatorOfFloat19, objectAnimatorOfFloat20, objectAnimatorOfFloat21, ObjectAnimator.ofFloat(w31Var3, w31Var3.f43596n, 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<w31, Float>) property3, 0.0f));
            this.f36140i0 = 2;
            this.f36144k0 = new o31(this, cu0VarE, i10);
            animatorSet3.setDuration(200L);
            animatorSet3.addListener(new t31(this, 2));
            this.f36142j0 = System.currentTimeMillis();
            runnable = null;
            this.f36130e.setLayerType(2, null);
            animatorSet3.start();
        }
        Runnable runnable3 = this.l1;
        if (runnable3 != null) {
            runnable3.run();
            this.l1 = runnable;
        }
        return true;
    }

    public float getAnimationValue() {
        return this.animationValue;
    }

    public float getVideoCrossfadeAlpha() {
        return this.f36120a0;
    }

    public final void h(File file) {
        if (this.f36122b == null) {
            return;
        }
        i();
        if (this.f36168x == null) {
            c5.c cVar = new c5.c(this.f36122b);
            this.f36166w = cVar;
            cVar.setVisibility(0);
            this.f36130e.addView(this.f36166w, 0, h7.z5.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f36122b);
            this.f36168x = textureView;
            textureView.setOpaque(false);
            this.f36166w.addView(this.f36168x, h7.z5.e(-1, -1, 17));
        }
        this.Y = false;
        this.Z = false;
        this.f36168x.setAlpha(1.0f);
        if (this.f36170y == null) {
            u31 u31Var = new u31(this);
            this.f36170y = u31Var;
            u31Var.W(this.f36168x);
            this.f36170y.F = new i6(12, this, file);
        }
        this.f36170y.E(Uri.fromFile(file), "other");
        this.f36170y.Q(true);
        this.S.a(true, true);
    }

    public final void i() {
        u31 u31Var = this.f36170y;
        if (u31Var != null) {
            this.X = 0;
            u31Var.I();
            this.f36170y = null;
        }
        try {
            Activity activity = this.f36122b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        c5.c cVar = this.f36166w;
        if (cVar != null) {
            this.f36130e.removeView(cVar);
            this.f36166w = null;
        }
        if (this.f36168x != null) {
            this.f36168x = null;
        }
        this.A = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z10) {
        boolean z11;
        CharSequence charSequenceCloneSpans = org.telegram.ui.Components.t5.cloneSpans(charSequence, 3);
        if (this.W == null) {
            FrameLayout frameLayout = new FrameLayout(this.f36130e.getContext());
            this.T = frameLayout;
            this.V.setContainer(frameLayout);
            at0 at0Var = new at0(this, this.f36130e.getContext(), this.V, this.T, 1);
            this.W = at0Var;
            this.V.setScrollView(at0Var);
            this.T.setClipChildren(false);
            this.W.addView(this.T, new ViewGroup.LayoutParams(-1, -2));
            this.f36130e.addView(this.W, h7.z5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.U.o(this.f36130e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.V.getParent() != this.T) {
            this.V.setMeasureAllChildren(true);
            this.T.addView(this.V, -1, -2);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequenceCloneSpans);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.V.getCurrentView().getText());
        qt0 qt0Var = this.V;
        TextView nextView = z10 ? qt0Var.getNextView() : qt0Var.getCurrentView();
        int maxLines = nextView.getMaxLines();
        if (maxLines == 1) {
            this.V.getCurrentView().setSingleLine(false);
            this.V.getNextView().setSingleLine(false);
        }
        if (maxLines != Integer.MAX_VALUE) {
            this.V.getCurrentView().setMaxLines(Integer.MAX_VALUE);
            this.V.getNextView().setMaxLines(Integer.MAX_VALUE);
            this.V.getCurrentView().setEllipsize(null);
            this.V.getNextView().setEllipsize(null);
        }
        nextView.setScrollX(0);
        at0 at0Var2 = this.W;
        at0Var2.f40925h0 = false;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(at0Var2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new r31(this, zIsEmpty2, zIsEmpty, 1)).addTransition(new r31(this, zIsEmpty2, zIsEmpty, 0)).setDuration(200L);
            if (!zIsEmpty2) {
                this.W.f40925h0 = true;
                duration.addTransition(new org.telegram.ui.Components.sl0(this, 3));
            }
            if (zIsEmpty2 && !zIsEmpty) {
                duration.addTarget((View) this.V);
            }
            TransitionManager.beginDelayedTransition(this.W, duration);
            z11 = true;
        } else {
            this.V.getCurrentView().setText((CharSequence) null);
            at0 at0Var3 = this.W;
            if (at0Var3 != null) {
                at0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        if (zIsEmpty) {
            this.V.a(null, z10, false);
            this.V.getCurrentView().setTextColor(-1);
            qt0 qt0Var2 = this.V;
            if (z11 && !zIsEmpty2) {
                z12 = false;
            }
            qt0Var2.b(4, z12);
            this.V.setTag(null);
        } else {
            org.telegram.ui.ActionBar.g6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.b31.C())) {
                if (messageObject.messageOwner.entities.isEmpty()) {
                    charSequenceCloneSpans = Emoji.replaceEmoji(new SpannableStringBuilder(charSequenceCloneSpans), nextView.getPaint().getFontMetricsInt(), false);
                } else {
                    SpannableString spannableString = new SpannableString(charSequenceCloneSpans);
                    messageObject.addEntitiesToText(spannableString, true, false);
                    if (messageObject.isVideo()) {
                        MessageObject.addUrlsByPattern(messageObject.isOutOwner(), spannableString, false, 3, (int) messageObject.getDuration(), false);
                    }
                    charSequenceCloneSpans = Emoji.replaceEmoji(spannableString, nextView.getPaint().getFontMetricsInt(), false);
                }
            }
            this.V.setTag(charSequenceCloneSpans);
            try {
                this.V.a(charSequenceCloneSpans, z10, false);
                at0 at0Var4 = this.W;
                if (at0Var4 != null) {
                    at0Var4.H(at0Var4.getWidth(), at0Var4.getHeight());
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            nextView.setScrollY(0);
            nextView.setTextColor(-1);
            this.V.setVisibility(this.f36136g0 ? 0 : 4);
        }
        if (this.V.getCurrentView() instanceof pt0) {
            ((pt0) this.V.getCurrentView()).setLoading(false);
        }
    }

    public final void k(boolean z10, boolean z11) {
        boolean z12 = this.F && z10;
        if (this.f36141i1 == z12 && z11) {
            return;
        }
        this.f36141i1 = z12;
        this.R.animate().cancel();
        if (z11) {
            this.R.animate().scaleX(z12 ? 1.0f : 0.6f).scaleY(z12 ? 1.0f : 0.6f).alpha(z12 ? 1.0f : 0.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.er.h).start();
            return;
        }
        this.R.setScaleX(z12 ? 1.0f : 0.6f);
        this.R.setScaleY(z12 ? 1.0f : 0.6f);
        this.R.setAlpha(z12 ? 1.0f : 0.0f);
    }

    public final void l() {
        this.f36157r.q(true);
        String string = LocaleController.getString(this.F ? R.string.VideoShownOnce : R.string.PhotoShownOnce);
        lh.w3 w3Var = this.f36157r;
        w3Var.h = lh.w3.a(string, w3Var.getTextPaint());
        this.f36157r.t(string);
        this.f36157r.l(12.0f, 7.0f, 11.0f, 7.0f);
        lh.w3 w3Var2 = this.f36157r;
        w3Var2.getClass();
        w3Var2.f16973a0 = AndroidUtilities.dp(2);
        lh.w3 w3Var3 = this.f36157r;
        w3Var3.getClass();
        w3Var3.W = 0.0f;
        w3Var3.j(R.raw.fire_on);
        this.f36157r.v();
        MessagesController.getGlobalMainSettings().edit().putInt("viewoncehint", MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void m(boolean z10, boolean z11) {
        o31 o31Var = this.f36150n1;
        AndroidUtilities.cancelRunOnUIThread(o31Var);
        if (z10 && this.F) {
            AndroidUtilities.runOnUIThread(o31Var, 3000L);
        }
        if (z10) {
            this.B.setVisibility(0);
        }
        this.B.setEnabled(z10);
        this.f36136g0 = z10;
        k(z10, z11);
        if (!z11) {
            this.B.setAlpha(z10 ? 1.0f : 0.0f);
            this.W.setAlpha(z10 ? 1.0f : 0.0f);
            this.P.setAlpha(z10 ? 1.0f : 0.0f);
            this.f36133f.setAlpha(z10 ? 1.0f : 0.0f);
            if (z10) {
                return;
            }
            this.B.setVisibility(8);
            this.W.scrollTo(0, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ag.d2 d2Var = this.B;
        Property property = View.ALPHA;
        int i10 = 1;
        arrayList.add(ObjectAnimator.ofFloat(d2Var, (Property<ag.d2, Float>) property, z10 ? 1.0f : 0.0f));
        w31 w31Var = this.Q;
        arrayList.add(ObjectAnimator.ofFloat(w31Var, w31Var.f43596n, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.W, (Property<at0, Float>) property, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.P, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f36133f, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        this.C = animatorSet;
        animatorSet.playTogether(arrayList);
        if (!z10) {
            this.C.addListener(new t31(this, i10));
        }
        this.C.setDuration(200L);
        this.C.start();
    }

    public final void n(float f10) {
        ImageReceiver imageReceiver = this.h;
        int imageWidth = ((int) ((imageReceiver.getImageWidth() * f10) - this.f36130e.getWidth())) / 2;
        int imageHeight = ((int) ((imageReceiver.getImageHeight() * f10) - this.f36130e.getHeight())) / 2;
        if (imageWidth > 0) {
            this.R0 = -imageWidth;
            this.S0 = imageWidth;
        } else {
            this.S0 = 0.0f;
            this.R0 = 0.0f;
        }
        if (imageHeight > 0) {
            this.T0 = -imageHeight;
            this.U0 = imageHeight;
        } else {
            this.U0 = 0.0f;
            this.T0 = 0.0f;
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float f10 = this.f36164u0;
        if ((f10 == 1.0f && (this.f36163t0 != 0.0f || this.f36161s0 != 0.0f)) || this.F0 != 0 || this.f36140i0 != 0) {
            return false;
        }
        if (f10 == 1.0f) {
            float fC = org.telegram.messenger.rl.c(3.0f, this.f36164u0, (motionEvent.getX() - (this.f36130e.getWidth() / 2)) - this.f36161s0, motionEvent.getX() - (this.f36130e.getWidth() / 2));
            float fC2 = org.telegram.messenger.rl.c(3.0f, this.f36164u0, (motionEvent.getY() - (this.f36130e.getHeight() / 2)) - this.f36163t0, motionEvent.getY() - (this.f36130e.getHeight() / 2));
            n(3.0f);
            float f11 = this.R0;
            if (fC < f11) {
                fC = f11;
            } else {
                f11 = this.S0;
                if (fC > f11) {
                    fC = f11;
                }
            }
            float f12 = this.T0;
            if (fC2 < f12) {
                fC2 = f12;
            } else {
                f12 = this.U0;
                if (fC2 > f12) {
                    fC2 = f12;
                }
            }
            c(3.0f, fC, fC2, true);
        } else {
            c(1.0f, 0.0f, 0.0f, true);
        }
        this.X0 = true;
        return true;
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
        if (this.f36164u0 == 1.0f) {
            return false;
        }
        this.f36127c1.a();
        this.f36127c1.c(Math.round(this.f36161s0), Math.round(this.f36163t0), Math.round(f10), Math.round(f11), (int) this.R0, (int) this.S0, (int) this.T0, (int) this.U0);
        this.f36130e.postInvalidate();
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f36124b1) {
            return false;
        }
        if (this.f36170y == null || !this.f36136g0 || motionEvent.getX() < this.R.getX() || motionEvent.getY() < this.R.getY() || motionEvent.getX() > this.R.getX() + this.R.getMeasuredWidth() || motionEvent.getX() > this.R.getX() + this.R.getMeasuredWidth()) {
            m(!this.f36136g0, true);
            return true;
        }
        u31 u31Var = this.f36170y;
        u31Var.Q(!u31Var.d.h());
        if (this.f36170y.d.h()) {
            m(true, true);
            return true;
        }
        k(true, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f10) {
        this.animationValue = f10;
        this.f36130e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f10) {
        this.f36120a0 = f10;
        this.f36130e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
