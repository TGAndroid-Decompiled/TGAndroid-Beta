package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class n40 extends t40 {
    public static final int L0 = 0;
    public int A0;
    public int B0;
    public boolean C0;
    public final org.telegram.ui.pk D;
    public boolean D0;
    public final LinearLayout E;
    public float E0;
    public final fi.n2 F;
    public int F0;
    public final fi.n2 G;
    public long G0;
    public final ImageView H;
    public boolean H0;
    public final fi.p2 I;
    public boolean I0;
    public final int[] J;
    public final i40 J0;
    public final Matrix K;
    public final qt K0;
    public final float[] L;
    public final Paint M;
    public final int N;
    public wi.u0 O;
    public wi.s0 P;
    public wi.t0 Q;
    public wi.m0 R;
    public hy0 S;
    public org.telegram.messenger.j20 T;
    public m40 U;
    public boolean V;
    public boolean W;
    public AnimatorSet f36194a0;
    public ValueAnimator f36195b0;
    public ValueAnimator f36196c0;
    public final zg0 f36197d0;
    public final b40 f36198e;
    public zg0 f36199e0;
    public final int f36200f;
    public zg0 f36201f0;
    public boolean f36202g0;
    public final int h;
    public boolean f36203h0;
    public boolean f36204i0;
    public boolean f36205j0;
    public boolean f36206k0;
    public boolean f36207l0;
    public boolean m0;
    public final boolean f36208n;
    public boolean f36209n0;
    public boolean f36210o0;
    public boolean f36211p0;
    public boolean f36212q0;
    public final View f36213r;
    public boolean f36214r0;
    public final l40 f36215s;
    public long f36216s0;
    public int f36217t0;
    public Bitmap f36218u0;
    public long f36219v0;
    public final fk0 f36220w;
    public float f36221w0;
    public final FrameLayout f36222x;
    public float f36223x0;
    public final k40 f36224y;
    public float f36225y0;
    public float f36226z0;

    public n40(Activity activity, b40 b40Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f36200f = org.telegram.messenger.p10.f24467s0;
        this.J = new int[2];
        this.K = new Matrix();
        this.L = new float[9];
        this.M = new Paint(3);
        this.A0 = -1;
        this.B0 = -1;
        this.E0 = Float.NaN;
        this.J0 = new i40(this, 0);
        this.K0 = new qt(this, 2);
        this.f36198e = b40Var;
        this.h = b40Var.getClassGuid();
        this.f36208n = b40Var.z();
        this.f36213r = b40Var.getFragmentView();
        setWillNotDraw(false);
        fi.p2 p2Var = new fi.p2(activity, null, this, null);
        this.I = p2Var;
        p2Var.f12586o = 0.5f;
        p2Var.f12585n = fi.p2.f(0.5f);
        p2Var.g();
        addView(p2Var.f12575b, c8.ha.e(-1, -1, 119));
        l40 l40Var = new l40(this, activity);
        this.f36215s = l40Var;
        fk0 fk0Var = new fk0(activity);
        this.f36220w = fk0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f36222x = frameLayout;
        k40 k40Var = new k40(0, activity, this);
        k40Var.setOpaque(true);
        k40Var.setClickable(true);
        k40Var.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        k40Var.setOutlineProvider(new bg.q0(12));
        k40Var.setClipToOutline(true);
        this.f36224y = k40Var;
        frameLayout.addView(k40Var, c8.ha.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, activity, paint);
        this.D = pkVar;
        pkVar.setOutlineProvider(new bg.q0(11));
        pkVar.setClipToOutline(true);
        frameLayout.addView(pkVar, c8.ha.e(-1, -1, 119));
        fk0Var.addView(frameLayout, c8.ha.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        l40Var.addView(fk0Var, c8.ha.e(-1, -1, 119));
        int i7 = org.telegram.messenger.g0.v;
        addView(l40Var, new FrameLayout.LayoutParams(i7, i7, 17));
        addView(p2Var.f12576c, c8.ha.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(linearLayout, c8.ha.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(activity);
        this.F = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754752, null));
        linearLayout.addView((View) imageView, c8.ha.o(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final n40 f34871b;

            {
                this.f34871b = this;
            }

            @Override
            public final void onClick(View view) {
                wi.t0 t0Var;
                wi.m0 m0Var;
                boolean z9;
                wi.t0 t0Var2;
                int i10;
                switch (r2) {
                    case 0:
                        n40 n40Var = this.f34871b;
                        wi.u0 u0Var = n40Var.O;
                        if (u0Var != null && (t0Var = n40Var.Q) != null && (m0Var = n40Var.R) != null && t0Var.f58049a == 3 && !t0Var.f58053f && !n40Var.f36210o0) {
                            wi.n0 n0Var = m0Var.f57988a;
                            wi.n0 n0Var2 = wi.n0.f58018a;
                            if (n0Var == n0Var2) {
                                n0Var2 = wi.n0.f58019b;
                            }
                            u0Var.getClass();
                            wi.u0.v();
                            int i11 = u0Var.f58103a0;
                            if (i11 != 7 && i11 != 8 && i11 != 9 && i11 != 10) {
                                if (u0Var.f58119r != n0Var2) {
                                    u0Var.f58114m.b("camera facing requested: " + u0Var.f58119r + " -> " + n0Var2 + ", state=" + rf.b.t(u0Var.f58103a0));
                                    u0Var.f58119r = n0Var2;
                                    int i12 = u0Var.f58103a0;
                                    if (i12 == 3 || i12 == 2) {
                                        u0Var.e();
                                        wi.k kVar = u0Var.f58113l;
                                        kVar.F = n0Var2;
                                        Handler handler = kVar.f57940n;
                                        if (kVar.V && handler != null) {
                                            handler.post(new ti.p(28, kVar, n0Var2));
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        u0Var.f58125y = z9;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                n40Var.f36197d0.M(0);
                                n40Var.f36197d0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        n40 n40Var2 = this.f34871b;
                        wi.u0 u0Var2 = n40Var2.O;
                        if (u0Var2 != null && (t0Var2 = n40Var2.Q) != null && n40Var2.R != null) {
                            boolean z10 = !t0Var2.f58054g;
                            wi.k kVar2 = u0Var2.f58113l;
                            wi.u0.v();
                            if (u0Var2.f58103a0 == 3 && !u0Var2.f58125y && (i10 = u0Var2.f58105b0) != 1) {
                                u0Var2.f58123w = z10;
                                if (i10 == 3) {
                                    u0Var2.w(z10);
                                    kVar2.S(false);
                                } else {
                                    u0Var2.w(false);
                                    kVar2.S(z10);
                                }
                                u0Var2.o();
                                n40Var2.E();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(activity);
        this.G = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, c8.ha.o(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final n40 f34871b;

            {
                this.f34871b = this;
            }

            @Override
            public final void onClick(View view) {
                wi.t0 t0Var;
                wi.m0 m0Var;
                boolean z9;
                wi.t0 t0Var2;
                int i10;
                switch (r2) {
                    case 0:
                        n40 n40Var = this.f34871b;
                        wi.u0 u0Var = n40Var.O;
                        if (u0Var != null && (t0Var = n40Var.Q) != null && (m0Var = n40Var.R) != null && t0Var.f58049a == 3 && !t0Var.f58053f && !n40Var.f36210o0) {
                            wi.n0 n0Var = m0Var.f57988a;
                            wi.n0 n0Var2 = wi.n0.f58018a;
                            if (n0Var == n0Var2) {
                                n0Var2 = wi.n0.f58019b;
                            }
                            u0Var.getClass();
                            wi.u0.v();
                            int i11 = u0Var.f58103a0;
                            if (i11 != 7 && i11 != 8 && i11 != 9 && i11 != 10) {
                                if (u0Var.f58119r != n0Var2) {
                                    u0Var.f58114m.b("camera facing requested: " + u0Var.f58119r + " -> " + n0Var2 + ", state=" + rf.b.t(u0Var.f58103a0));
                                    u0Var.f58119r = n0Var2;
                                    int i12 = u0Var.f58103a0;
                                    if (i12 == 3 || i12 == 2) {
                                        u0Var.e();
                                        wi.k kVar = u0Var.f58113l;
                                        kVar.F = n0Var2;
                                        Handler handler = kVar.f57940n;
                                        if (kVar.V && handler != null) {
                                            handler.post(new ti.p(28, kVar, n0Var2));
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        u0Var.f58125y = z9;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                n40Var.f36197d0.M(0);
                                n40Var.f36197d0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        n40 n40Var2 = this.f34871b;
                        wi.u0 u0Var2 = n40Var2.O;
                        if (u0Var2 != null && (t0Var2 = n40Var2.Q) != null && n40Var2.R != null) {
                            boolean z10 = !t0Var2.f58054g;
                            wi.k kVar2 = u0Var2.f58113l;
                            wi.u0.v();
                            if (u0Var2.f58103a0 == 3 && !u0Var2.f58125y && (i10 = u0Var2.f58105b0) != 1) {
                                u0Var2.f58123w = z10;
                                if (i10 == 3) {
                                    u0Var2.w(z10);
                                    kVar2.S(false);
                                } else {
                                    u0Var2.w(false);
                                    kVar2.S(z10);
                                }
                                u0Var2.o();
                                n40Var2.E();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        int L = org.telegram.messenger.g0.L(24.0f);
        this.N = L;
        zg0 zg0Var = new zg0(2131624187, L, L);
        this.f36197d0 = zg0Var;
        zg0Var.setCallback(imageView);
        zg0Var.M(zg0Var.f40976e[0] - 1);
        imageView.setImageDrawable(zg0Var);
        E();
        if (f6Var != null && !f6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.H = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232795);
        imageView3.setAlpha(0.0f);
        addView(imageView3, c8.ha.e(48, 48, 17));
        k40Var.setOnTouchListener(new zj(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f36216s0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f36216s0);
    }

    private long getCurrentDurationMs() {
        wi.t0 t0Var;
        wi.u0 u0Var = this.O;
        if (u0Var != null && (t0Var = this.Q) != null) {
            if (t0Var.f58049a == 3) {
                return u0Var.j();
            }
            return t0Var.f58050b;
        }
        return 0L;
    }

    public static void n(n40 n40Var) {
        if (n40Var.f36210o0 && n40Var.f36214r0 && n40Var.f36211p0 && n40Var.f36212q0) {
            n40Var.f36210o0 = false;
            org.telegram.messenger.a8.b("RoundVideo camera flip completed: elapsedMs=" + n40Var.getCameraFlipElapsedMs());
            n40Var.D();
        }
    }

    public static void o(n40 n40Var) {
        org.telegram.ui.pk pkVar = n40Var.D;
        if (!n40Var.m0) {
            return;
        }
        n40Var.m0 = false;
        pkVar.invalidate();
        pkVar.animate().cancel();
        pkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z9) {
        org.telegram.ui.qj qjVar;
        if (z9 != this.H0) {
            this.H0 = z9;
            this.G0 = 0L;
            i40 i40Var = this.J0;
            if (z9) {
                bg.k.d().a(30, i40Var);
            } else {
                bg.k.d().f(i40Var);
            }
            if (this.d != z9) {
                this.d = z9;
                r40 r40Var = this.f38209c;
                if (r40Var != null && (qjVar = ((org.telegram.ui.wi) r40Var).f51445a.Z) != null) {
                    qjVar.setRoundVideoUiFrameClockActive(z9);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z9) {
        Activity parentActivity = this.f36198e.getParentActivity();
        if (parentActivity == null) {
            parentActivity = org.telegram.messenger.g0.W(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        fi.p2 p2Var = this.I;
        if (z9) {
            if (Float.isNaN(this.E0)) {
                this.E0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            p2Var.c(null);
        } else {
            if (!Float.isNaN(this.E0)) {
                attributes.screenBrightness = this.E0;
                this.E0 = Float.NaN;
            }
            p2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A(boolean z9) {
        Bitmap bitmap;
        k40 k40Var = this.f36224y;
        if (k40Var.isAvailable() && (bitmap = k40Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = r(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f36218u0;
                    this.f36218u0 = bitmap;
                    if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    if (z9) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "icthumb.jpg"));
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            fileOutputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    if (bitmap != this.f36218u0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f36218u0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void B(boolean z9, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        p40 p40Var = this.f38207a;
        if (p40Var != null) {
            ((org.telegram.ui.fe) p40Var).f45614b.Zc.a(z9, true);
        }
        AnimatorSet animatorSet = this.f36194a0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f36194a0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z9);
        }
        l40 l40Var = this.f36215s;
        if (z9 && !this.f36207l0) {
            l40Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f36223x0 = measuredHeight;
            l40Var.setTranslationY(measuredHeight + this.f36221w0);
        }
        this.f36207l0 = z9;
        View view = this.f36213r;
        if (view != null) {
            view.invalidate();
        }
        if (!z9 && Math.max(getCurrentDurationMs(), this.f36219v0) > 300) {
            f10 = org.telegram.messenger.g0.L(24.0f) - (getMeasuredWidth() * 0.5f);
        } else {
            f10 = 0.0f;
        }
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (z9) {
            f12 = 0.0f;
        } else {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f12);
        ofFloat.addUpdateListener(new h40(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f36194a0 = animatorSet2;
        if (z9) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        float[] fArr = {f13};
        LinearLayout linearLayout = this.E;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        if (z9) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(l40Var, property, f14);
        float f17 = 0.1f;
        if (z9) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(l40Var, View.SCALE_X, f15);
        if (z9) {
            f17 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(l40Var, View.SCALE_Y, f17);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(l40Var, View.TRANSLATION_X, f10);
        if (this.f36205j0 && z9) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.H, property, f16), ofFloat);
        this.f36194a0.setDuration(180L);
        this.f36194a0.setInterpolator(new DecelerateInterpolator());
        if (!z9) {
            this.f36194a0.addListener(new z5(this, 29));
        } else {
            setTranslationX(0.0f);
        }
        this.f36194a0.start();
    }

    public final void C() {
        if (!this.D0) {
            return;
        }
        this.D0 = false;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25017k1, 512);
    }

    public final void D() {
        boolean z9;
        wi.m0 m0Var;
        wi.t0 t0Var = this.Q;
        boolean z10 = false;
        if (t0Var != null && t0Var.f58049a == 3 && !t0Var.f58053f && !this.f36210o0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.F.setEnabled(z9);
        if (z9 && (m0Var = this.R) != null && m0Var.f57989b != 1) {
            z10 = true;
        }
        this.G.setEnabled(z10);
        E();
    }

    public final void E() {
        wi.t0 t0Var = this.Q;
        int i7 = this.N;
        fi.n2 n2Var = this.G;
        if (t0Var != null && t0Var.f58054g) {
            if (this.f36201f0 == null) {
                zg0 zg0Var = new zg0(2131624185, i7, i7);
                this.f36201f0 = zg0Var;
                zg0Var.setCallback(n2Var);
            }
            n2Var.setImageDrawable(this.f36201f0);
            return;
        }
        if (this.f36199e0 == null) {
            zg0 zg0Var2 = new zg0(2131624186, i7, i7);
            this.f36199e0 = zg0Var2;
            zg0Var2.setCallback(n2Var);
        }
        n2Var.setImageDrawable(this.f36199e0);
    }

    public final void F() {
        org.telegram.ui.qj qjVar;
        float f10;
        wi.t0 t0Var = this.Q;
        if (t0Var != null) {
            long j3 = t0Var.d;
            if (t0Var.f58049a == 3) {
                long min = Math.min(j3, (SystemClock.elapsedRealtime() + t0Var.f58050b) - t0Var.f58051c);
                this.f36219v0 = min;
                this.f36220w.setProgress(((float) min) / ((float) j3));
                r40 r40Var = this.f38209c;
                if (r40Var != null && (qjVar = ((org.telegram.ui.wi) r40Var).f51445a.Z) != null && qjVar.f31068j1) {
                    qjVar.f31062i1 = min;
                    fg fgVar = qjVar.Y0;
                    if (fgVar != null && fgVar.f33538r) {
                        fgVar.h = min;
                        fgVar.invalidate();
                    }
                    cg cgVar = qjVar.l1;
                    if (cgVar != null && cgVar.f32552n) {
                        if (!cgVar.h) {
                            long j10 = cgVar.f32553r;
                            if (j10 >= 0) {
                                if (!cgVar.f32550e) {
                                    long max = Math.max(0L, min - j10) % 1200;
                                    if (max < 600) {
                                        f10 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f10 = ((float) (max - 600)) / 600.0f;
                                    }
                                    cgVar.f32547a = f10;
                                }
                                cgVar.invalidate();
                            }
                        }
                        cgVar.f32553r = min;
                        cgVar.f32547a = 1.0f;
                        cgVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = qjVar.f31073k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f31178n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void a(boolean z9) {
        wi.u0 u0Var;
        int i7;
        if (!x() && (u0Var = this.O) != null && u0Var.a()) {
            this.U = null;
            if (z9) {
                i7 = 0;
            } else {
                i7 = 6;
            }
            z(i7);
            hy0 hy0Var = this.S;
            if (hy0Var != null) {
                hy0Var.d(true);
            }
            this.S = null;
            MediaController.B().Y(false);
            B(false, false);
        }
    }

    @Override
    public final void b(float f10, int i7) {
        wi.t0 t0Var;
        if (this.O != null && (t0Var = this.Q) != null && t0Var.f58049a == 5) {
            q();
            if (i7 == 0) {
                this.O.r();
            } else if (i7 == 1) {
                this.O.p();
            } else if (i7 == 2) {
                wi.u0 u0Var = this.O;
                long j3 = f10 * ((float) this.Q.f58050b);
                u0Var.getClass();
                wi.u0.v();
                if (u0Var.f58103a0 == 5 && u0Var.W != null) {
                    long j10 = u0Var.K;
                    u0Var.W.Z0(5, Math.max(j10, Math.min(Math.max(j10, u0Var.L - 1), j3)));
                    u0Var.d.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z9) {
        setRecordingUiFrameClockActive(false);
        s();
        ValueAnimator valueAnimator = this.f36195b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.O != null && x()) {
            this.W = true;
            this.O.s();
        } else {
            wi.u0 u0Var = this.O;
            if (u0Var != null) {
                u0Var.s();
                this.O = null;
            }
        }
        hy0 hy0Var = this.S;
        if (hy0Var != null && !this.W) {
            hy0Var.d(true ^ this.f36206k0);
            this.S = null;
        }
        setScreenFlashEnabled(false);
        MediaController.B().Y(false);
        C();
    }

    @Override
    public final void d(boolean z9) {
        c(true);
        l40 l40Var = this.f36215s;
        l40Var.setTranslationX(0.0f);
        this.f36223x0 = 0.0f;
        l40Var.setTranslationY(0.0f + this.f36221w0);
        l40Var.setImageReceiver(null);
        MediaController.B().c0();
    }

    @Override
    public final boolean f() {
        wi.t0 t0Var = this.Q;
        if (t0Var != null) {
            int i7 = t0Var.f58049a;
            if (i7 == 4 || i7 == 5 || i7 == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void g(float f10) {
        float f11 = f10 * 0.5f;
        this.f36221w0 = f11;
        this.f36215s.setTranslationY(this.f36223x0 + f11);
    }

    @Override
    public View getButtonsLayout() {
        return this.E;
    }

    @Override
    public q40 getCameraContainer() {
        return this.f36215s;
    }

    @Override
    public RectF getCameraRect() {
        k40 k40Var = this.f36224y;
        int[] iArr = this.J;
        k40Var.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        return new RectF(i7, iArr[1], k40Var.getWidth() + i7, k40Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.H;
    }

    @Override
    public Paint getPaint() {
        return this.f36220w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f36224y;
    }

    @Override
    public final void h(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        if (this.O != null && this.Q != null) {
            if (i7 == 3) {
                y();
            } else if ((i7 == 1 || i7 == 4) && this.U == null) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    org.telegram.messenger.qs.f(this.f36200f).k(org.telegram.messenger.qs.f25070t2, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.Q.f58049a == 3) {
                    z(5);
                }
                this.f36203h0 = false;
                this.U = new m40(i10, i11, j3, j10, z9);
                u();
            }
        }
    }

    @Override
    public final void i(dh.c cVar, org.telegram.ui.oi oiVar) {
        View view = this.E;
        fh.g c10 = cVar.c(view, oiVar, false);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(21.0f));
        view.setBackground(c10);
    }

    @Override
    public final void j(boolean z9) {
        if (this.O != null) {
            return;
        }
        setVisibility(0);
        this.f36220w.getPaint().setAlpha(255);
        this.f36206k0 = false;
        this.f36205j0 = false;
        this.U = null;
        this.V = false;
        this.f36202g0 = false;
        this.f36204i0 = false;
        this.f36219v0 = 0L;
        this.f36220w.setProgress(0.0f);
        org.telegram.ui.pk pkVar = this.D;
        if (!this.m0) {
            if (this.f36218u0 == null) {
                try {
                    this.f36218u0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f36218u0;
            if (bitmap != null) {
                pkVar.setImageBitmap(bitmap);
            } else {
                pkVar.setImageResource(2131231492);
            }
            this.m0 = true;
            pkVar.animate().cancel();
            pkVar.setAlpha(1.0f);
            pkVar.invalidate();
        }
        this.S = new hy0(this.f36200f, this.f36208n);
        this.P = (wi.s0) xi.e.f58770e.a();
        wi.l0 l0Var = new wi.l0(getContext(), this.f36224y);
        l0Var.f57978c = new File(org.telegram.messenger.t0.h(), "cache");
        l0Var.d = (wi.n0) xi.e.f58774j.a();
        l0Var.f57979e = this.P;
        l0Var.h = xi.e.h.a();
        l0Var.f57980f = (wi.o0) xi.e.f58771f.a();
        l0Var.f57981g = (wi.p0) xi.e.f58772g.a();
        xi.a aVar = xi.e.f58773i;
        aVar.a();
        l0Var.f57982i = aVar.d;
        qt qtVar = this.K0;
        l0Var.f57983j = qtVar;
        hy0 hy0Var = this.S;
        l0Var.f57984k = hy0Var;
        l0Var.f57985l = new ax(this, 5);
        if (l0Var.d != null) {
            if (l0Var.f57979e != null) {
                if (l0Var.h > 0) {
                    if (l0Var.f57980f != null) {
                        if (l0Var.f57981g != null) {
                            if (qtVar != null) {
                                if (hy0Var != null) {
                                    this.O = new wi.u0(l0Var);
                                    MediaController.B().Y(true);
                                    wi.u0 u0Var = this.O;
                                    u0Var.getClass();
                                    wi.u0.v();
                                    if (u0Var.f58103a0 == 1) {
                                        try {
                                            u0Var.f58114m.b("start requested");
                                            u0Var.c(true);
                                            u0Var.x(2);
                                            u0Var.f58113l.W(u0Var.U, 0L, u0Var.f58119r);
                                        } catch (Exception e10) {
                                            u0Var.h(e10);
                                        }
                                    }
                                    B(true, false);
                                    return;
                                }
                                throw new IllegalStateException("Output listener is required");
                            }
                            throw new IllegalStateException("Session listener is required");
                        }
                        throw new IllegalStateException("Frame rate is required");
                    }
                    throw new IllegalStateException("Camera resolution is required");
                }
                throw new IllegalStateException("Video bitrate is required");
            }
            throw new IllegalStateException("Output resolution is required");
        }
        throw new IllegalStateException("Initial camera is required");
    }

    @Override
    public final void k() {
        wi.t0 t0Var;
        wi.u0 u0Var = this.O;
        if (u0Var != null && (t0Var = this.Q) != null) {
            int i7 = t0Var.f58049a;
            if (i7 == 3) {
                y();
            } else if (i7 == 5) {
                wi.u0.v();
                if (u0Var.f58103a0 == 5 && u0Var.L - u0Var.K < u0Var.f58118q) {
                    u0Var.Q++;
                    u0Var.D = false;
                    u0Var.f58114m.b("resume requested: trim=" + u0Var.K + ".." + u0Var.L + ", sourceDurationMs=" + u0Var.I);
                    u0Var.t();
                    u0Var.x(6);
                    u0Var.f58111j.execute(new fi.q1(u0Var, u0Var.l(), u0Var.U, u0Var.T, u0Var.V));
                    this.T = null;
                    this.f36203h0 = true;
                    this.f36204i0 = false;
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setScreenFlashEnabled(false);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (View.MeasureSpec.getSize(i10) - getPaddingBottom() > View.MeasureSpec.getSize(i7) * 1.3f) {
            i11 = org.telegram.messenger.g0.v;
        } else {
            i11 = org.telegram.messenger.g0.f22548u;
        }
        if (this.F0 != i11) {
            this.F0 = i11;
            l40 l40Var = this.f36215s;
            l40Var.getLayoutParams().width = org.telegram.messenger.g0.L(28.0f) + i11;
            l40Var.getLayoutParams().height = org.telegram.messenger.g0.L(28.0f) + i11;
            ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = (i11 / 2) - org.telegram.messenger.g0.L(24.0f);
        }
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        fi.p2 p2Var = this.I;
        p2Var.f12575b.measure(makeMeasureSpec, makeMeasureSpec2);
        p2Var.f12576c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onWindowVisibilityChanged(int i7) {
        wi.u0 u0Var;
        wi.t0 t0Var;
        super.onWindowVisibilityChanged(i7);
        if (i7 != 0 && (u0Var = this.O) != null && (t0Var = this.Q) != null) {
            if (t0Var.f58049a == 3) {
                y();
            } else if (t0Var.f58052e) {
                u0Var.p();
            }
        }
    }

    public final void q() {
        wi.t0 t0Var;
        org.telegram.messenger.j20 j20Var;
        if (this.O != null && (t0Var = this.Q) != null && (j20Var = this.T) != null) {
            long j3 = t0Var.f58050b;
            long max = Math.max(0L, j20Var.f23450a);
            long j10 = this.T.f23452b;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            wi.u0 u0Var = this.O;
            u0Var.getClass();
            wi.u0.v();
            if (u0Var.f58103a0 == 5) {
                long max2 = Math.max(0L, Math.min(u0Var.I, max));
                long max3 = Math.max(max2, Math.min(u0Var.I, j3));
                if (max3 - max2 >= Math.min(800L, u0Var.I)) {
                    u0Var.K = max2;
                    u0Var.L = max3;
                    l2.i0 i0Var = u0Var.W;
                    if (i0Var != null) {
                        i0Var.Z0(5, max2);
                    }
                    u0Var.d.getClass();
                    u0Var.o();
                }
            }
        }
    }

    public final Bitmap r(Bitmap bitmap) {
        k40 k40Var = this.f36224y;
        if (k40Var.getWidth() > 0 && k40Var.getHeight() > 0) {
            Matrix matrix = this.K;
            k40Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.L;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / k40Var.getWidth();
                float height = bitmap.getHeight() / k40Var.getHeight();
                fArr[1] = (width / height) * fArr[1];
                fArr[2] = fArr[2] * width;
                fArr[3] = (height / width) * fArr[3];
                fArr[5] = fArr[5] * height;
                fArr[6] = fArr[6] / width;
                fArr[7] = fArr[7] / height;
                matrix.setValues(fArr);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(bitmap, matrix, this.M);
                bitmap.recycle();
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void s() {
        if (!this.f36210o0 && this.f36196c0 == null) {
            return;
        }
        this.f36217t0++;
        ValueAnimator valueAnimator = this.f36196c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f36196c0.cancel();
            this.f36196c0 = null;
        }
        FrameLayout frameLayout = this.f36222x;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f36210o0 = false;
        this.f36211p0 = false;
        this.f36212q0 = false;
        this.f36214r0 = false;
        w(false);
    }

    @Override
    public void setInternalPadding(int i7) {
        setPadding(0, 0, 0, i7);
    }

    @Override
    public void setIsMessageTransition(boolean z9) {
        this.f36215s.getClass();
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.E.setAlpha(0.0f);
        l40 l40Var = this.f36215s;
        l40Var.setAlpha(0.0f);
        l40Var.setScaleX(0.1f);
        l40Var.setScaleY(0.1f);
        l40Var.setTranslationX(0.0f);
        ImageView imageView = this.H;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f36220w.getPaint().setAlpha(0);
        try {
            Activity activity = (Activity) getContext();
            if (i7 == 0) {
                activity.getWindow().addFlags(128);
            } else {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final org.telegram.messenger.j20 t(File file, long j3, gy0 gy0Var) {
        long j10;
        int i7;
        int i10;
        wi.p0 p0Var;
        org.telegram.messenger.j20 j20Var = new org.telegram.messenger.j20();
        j20Var.f23450a = -1L;
        j20Var.f23452b = -1L;
        j20Var.f23467r = j3;
        if (gy0Var == null) {
            j10 = file.length();
        } else {
            j10 = gy0Var.f34107a;
        }
        j20Var.f23466q = Math.max(1L, j10);
        j20Var.f23468s = true;
        wi.u0 u0Var = this.O;
        if (u0Var != null && (p0Var = u0Var.f58122u) != null) {
            i7 = p0Var.f58031a;
        } else {
            i7 = 30;
        }
        j20Var.f23463n = i7;
        wi.s0 s0Var = this.P;
        if (s0Var == null) {
            i10 = 480;
        } else {
            i10 = s0Var.f58048a;
        }
        j20Var.h = i10;
        j20Var.f23460k = i10;
        j20Var.f23458i = i10;
        j20Var.f23461l = i10;
        j20Var.f23464o = file.getAbsolutePath();
        if (gy0Var != null) {
            j20Var.f23471w = gy0Var.f34108b;
            j20Var.f23472x = gy0Var.f34109c;
            j20Var.f23473y = gy0Var.d;
            j20Var.f23474z = gy0Var.f34110e;
        }
        return j20Var;
    }

    public final void u() {
        wi.t0 t0Var;
        boolean z9;
        int i7;
        if (this.U != null && !this.V && this.O != null && (t0Var = this.Q) != null) {
            int i10 = t0Var.f58049a;
            if (i10 == 5) {
                q();
            } else if (i10 != 3) {
                return;
            }
            wi.u0 u0Var = this.O;
            boolean z10 = this.f36205j0;
            boolean z11 = !z10;
            u0Var.getClass();
            wi.u0.v();
            int i11 = u0Var.f58103a0;
            boolean z12 = false;
            if (i11 == 3 || i11 == 5) {
                u0Var.f58114m.b("finish requested: state=" + rf.b.t(u0Var.f58103a0) + ", includeAudio=" + z11 + ", durationMs=" + u0Var.j() + ", trim=" + u0Var.K + ".." + u0Var.L);
                u0Var.B = z11;
                if (u0Var.f58103a0 == 3) {
                    u0Var.I = u0Var.j();
                    u0Var.A = true;
                    u0Var.e();
                    u0Var.f58110i.removeCallbacks(u0Var.X);
                    u0Var.x(7);
                    boolean X = u0Var.f58113l.X();
                    u0Var.E = X;
                    if (!X) {
                        u0Var.h(new IllegalStateException("Unable to stop the camera segment"));
                    }
                } else {
                    u0Var.t();
                    u0Var.x(7);
                    if (!u0Var.l() && !z10) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (u0Var.l()) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                    u0Var.f58111j.execute(new bi.sb(u0Var, u0Var.U, z9, u0Var.V, z11, i7, u0Var.T));
                }
                z12 = true;
            }
            this.V = z12;
        }
    }

    public final void v() {
        if (this.C0) {
            this.C0 = false;
            this.A0 = -1;
            this.B0 = -1;
            if (this.O == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f36195b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36226z0, 0.0f);
            this.f36195b0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f36195b0.addUpdateListener(new h40(this, 1));
            this.f36195b0.start();
        }
    }

    public final void w(boolean z9) {
        if (!this.f36209n0) {
            return;
        }
        this.f36209n0 = false;
        org.telegram.ui.pk pkVar = this.D;
        pkVar.animate().cancel();
        if (z9) {
            pkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            pkVar.setAlpha(0.0f);
        }
    }

    public final boolean x() {
        wi.u0 u0Var;
        if (this.U != null && this.V && (u0Var = this.O) != null) {
            wi.u0.v();
            if (u0Var.f58103a0 == 7) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void y() {
        wi.t0 t0Var;
        if (this.O != null && (t0Var = this.Q) != null && t0Var.f58049a == 3) {
            z(2);
            this.O.q();
        }
    }

    public final void z(int i7) {
        if (this.f36204i0 && i7 == 2) {
            return;
        }
        this.f36204i0 = true;
        org.telegram.messenger.qs.f(this.f36200f).k(org.telegram.messenger.qs.f25033n2, Integer.valueOf(this.h), Integer.valueOf(i7));
    }
}
