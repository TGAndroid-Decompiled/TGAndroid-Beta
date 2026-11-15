package org.telegram.ui.Components.voip;

import a8.b8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ja;
import hi.i9;
import hi.p5;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.ec1;
import org.telegram.ui.p9;
import org.telegram.ui.yb1;
import org.telegram.ui.z51;
import org.webrtc.RendererCommon;
public abstract class d1 extends FrameLayout implements VoIPService.StateListener {
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public final float J;
    public final float K;
    public final Path L;
    public final Camera M;
    public final Matrix N;
    public final Matrix O;
    public final boolean P;
    public final b8 Q;
    public final b8 R;
    public final ra0 S;
    public final ra0 T;
    public final GestureDetector U;
    public ValueAnimator V;
    public boolean f40541a;
    public final m01 f40542b;
    public final b1 f40543c;
    public final z51 d;
    public final t2[] f40544e;
    public final o2 f40545f;
    public int h;
    public boolean f40546n;
    public final org.telegram.ui.ActionBar.k f40547r;
    public float f40548s;
    public int f40549w;
    public int f40550x;
    public int f40551y;

    public d1(Context context, float f10, float f11) {
        super(context);
        String M0;
        this.h = 1;
        this.f40551y = -1;
        this.E = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        this.L = new Path();
        this.M = new Camera();
        this.N = new Matrix();
        this.O = new Matrix();
        this.Q = new b8(80, 80);
        this.R = new b8(80, 80);
        this.S = new ra0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.T = new ra0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.J = f10;
        this.K = f11;
        this.f40544e = new t2[3];
        yb1 yb1Var = (yb1) this;
        this.U = new GestureDetector(context, new a1(yb1Var));
        m01 m01Var = new m01(2, context, yb1Var);
        this.f40542b = m01Var;
        m01Var.setClickable(true);
        addView(m01Var, ja.c(-1.0f, -1));
        o2 o2Var = new o2(context, false, false);
        this.f40545f = o2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        n2 n2Var = o2Var.d;
        n2Var.setScalingType(scalingType);
        o2Var.f40832b0 = 1;
        o2Var.f40835d0 = true;
        n2Var.setAlpha(0.0f);
        n2Var.setRotateTextureWithScreen(true);
        n2Var.setUseCameraRotation(true);
        addView(o2Var, ja.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.f40547r = kVar;
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        kVar.setBackgroundColor(0);
        q6.l(kVar, 1, j6.Yg, null);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new p9(yb1Var, 21));
        addView(kVar);
        b1 b1Var = new b1(yb1Var, getContext());
        this.f40543c = b1Var;
        b1Var.setMaxLines(1);
        b1Var.setEllipsize(null);
        b1Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        b1Var.setTag(-1);
        b1Var.setTextSize(1, 14.0f);
        int i7 = j6.f28878eh;
        q6.U(b1Var, i7, null);
        b1Var.setGravity(17);
        b1Var.setTypeface(org.telegram.messenger.g0.o());
        b1Var.getPaint().setTextAlign(Paint.Align.CENTER);
        b1Var.setContentDescription(hd.M0(2131743240, null));
        float f12 = 8.0f;
        int L = org.telegram.messenger.g0.L(8.0f);
        int o4 = i0.a.o(j6.x0(null, i7, false), 76);
        b1Var.setForeground(j6.k0(L, L, L, L, 0, o4, o4));
        b1Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        b1Var.setOnClickListener(new p5(yb1Var, 25));
        addView(b1Var, ja.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        z51 z51Var = new z51(19, context, yb1Var);
        this.d = z51Var;
        z51Var.setClipChildren(false);
        addView(z51Var, ja.e(-1, 64, 80));
        int i10 = 0;
        while (i10 < this.f40544e.length) {
            if (i10 == 0) {
                M0 = hd.M0(2131743259, null);
            } else if (i10 == 1) {
                M0 = hd.M0(2131743405, null);
            } else {
                M0 = hd.M0(2131743493, null);
            }
            this.f40544e[i10] = new t2(context, M0);
            this.f40544e[i10].setContentDescription(M0);
            this.f40544e[i10].setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            this.d.addView(this.f40544e[i10], ja.o(-2, -1));
            this.f40544e[i10].setOnClickListener(new ci.q(yb1Var, i10, 21));
            i10++;
            f12 = f12;
        }
        float f13 = f12;
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f40545f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f40545f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.f40545f.d, false);
        }
        m01 m01Var2 = this.f40542b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new ra0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232680);
        frameLayout.addView(imageView, ja.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(hd.M0(2131743223, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, ja.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        m01Var2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(2131231492);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        m01Var2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new i9(yb1Var, f10, f11, 2));
        ofFloat.addListener(new w9(yb1Var, 14));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new hi.j3(yb1Var, 19));
        er erVar = er.f34419f;
        ofFloat.setInterpolator(erVar);
        long j3 = 320;
        ofFloat.setDuration(j3);
        ofFloat.start();
        ofFloat2.setInterpolator(erVar);
        ofFloat2.setDuration(j3);
        ofFloat2.setStartDelay(32);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.f40543c.setTranslationY(org.telegram.messenger.g0.L(53.0f));
        this.f40543c.setTranslationX((f10 - (org.telegram.messenger.g0.f23611q.x / 2.0f)) + org.telegram.messenger.g0.L(f13) + org.telegram.messenger.g0.L(26.0f));
        this.f40543c.animate().translationY(0.0f).translationX(0.0f).setDuration(j3).start();
        this.P = true;
        c(1, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (!this.f40541a && this.E == 1.0f) {
            yb1 yb1Var = (yb1) this;
            yb1Var.W.f46711w.T = false;
            yb1Var.W.f46711w.invalidate();
            this.f40541a = true;
            b();
            ec1 ec1Var = yb1Var.W;
            ec1Var.f46701o0 = null;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            ec1Var.f46709u0.setLockOnScreen(false);
            if (z11) {
                ec1Var.f46700n0 = true;
                if (sharedInstance != null && !z10) {
                    sharedInstance.requestVideoCall(false);
                    sharedInstance.setVideoState(false, 2);
                    sharedInstance.switchToSpeaker();
                }
                if (sharedInstance != null) {
                    ec1Var.m(ec1Var.f46685f, sharedInstance, true);
                }
            } else if (sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            ec1Var.f46703q0 = ec1Var.f46702p0;
            ec1Var.y();
            if (yb1Var.W.m0 && z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new y0(this, 0));
                ofFloat.setInterpolator(er.f34419f);
                ofFloat.setStartDelay(60L);
                ofFloat.setDuration(350L);
                ofFloat.addListener(new z0(this, 2));
                ofFloat.start();
                this.f40543c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.f40547r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            } else if (z11) {
                animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(er.f34419f).setListener(new z0(this, 0));
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat2.addUpdateListener(new y0(this, 1));
                ofFloat2.addListener(new z0(this, 1));
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new y0(this, 2));
                er erVar = er.f34419f;
                ofFloat2.setInterpolator(erVar);
                long j3 = 320;
                ofFloat2.setDuration(j3);
                ofFloat2.start();
                ofFloat3.setInterpolator(erVar);
                ofFloat3.setDuration(j3);
                ofFloat3.start();
                this.d.setAlpha(1.0f);
                this.d.setScaleY(1.0f);
                this.d.setScaleX(1.0f);
                this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                float f10 = 320;
                this.f40543c.animate().translationY(org.telegram.messenger.g0.L(53.0f)).translationX((this.J - (org.telegram.messenger.g0.f23611q.x / 2.0f)) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(26.0f)).setDuration(0.6f * f10).start();
                animate().alpha(0.0f).setDuration(0.25f * f10).setStartDelay(f10 * 0.75f).start();
            }
            invalidate();
        }
    }

    public final void b() {
        o2 o2Var = this.f40545f;
        if (this.f40546n) {
            try {
                Bitmap bitmap = o2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), o2Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        File h = org.telegram.messenger.t0.h();
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(h, "cthumb" + this.h + ".jpg"));
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        fileOutputStream.close();
                        View findViewWithTag = this.f40542b.findViewWithTag("image_stab");
                        if (findViewWithTag instanceof ImageView) {
                            ((ImageView) findViewWithTag).setImageBitmap(createScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void c(int i7, boolean z10) {
        int i10;
        if (this.f40549w != i7 && (i10 = this.f40550x) != i7) {
            o2 o2Var = this.f40545f;
            if (z10) {
                if (i10 == 0) {
                    if (this.h != i7) {
                        this.h = i7;
                        this.f40546n = false;
                        d(true, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().switchCamera();
                        }
                    } else {
                        d(false, false);
                        o2Var.animate().alpha(1.0f).setDuration(250L).start();
                    }
                } else if (i7 == 0) {
                    this.f40542b.findViewWithTag("screencast_stub").setVisibility(0);
                    b();
                    d(false, false);
                    o2Var.animate().alpha(0.0f).setDuration(250L).start();
                } else {
                    b();
                    this.h = i7;
                    this.f40546n = false;
                    d(true, false);
                    o2Var.animate().alpha(0.0f).setDuration(250L).start();
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().switchCamera();
                    }
                }
                int i11 = this.f40550x;
                if (i7 > i11) {
                    this.f40551y = i11;
                    this.f40550x = i11 + 1;
                    this.V = ValueAnimator.ofFloat(0.1f, 1.0f);
                } else {
                    this.f40551y = i11;
                    this.f40550x = i11 - 1;
                    this.f40549w = i7;
                    this.V = ValueAnimator.ofFloat(1.0f, 0.0f);
                }
                this.V.addUpdateListener(new y0(this, 3));
                this.V.addListener(new ki.j2(this, i7, 14));
                this.V.setInterpolator(er.f34419f);
                this.V.setDuration(350L);
                this.V.start();
                return;
            }
            this.f40550x = i7;
            this.f40549w = i7;
            this.f40548s = 0.0f;
            e();
            o2Var.setVisibility(0);
            this.f40546n = false;
            this.h = 1;
            d(true, false);
        }
    }

    public final void d(boolean z10, boolean z11) {
        Bitmap bitmap;
        ImageView imageView = (ImageView) this.f40542b.findViewWithTag("image_stab");
        if (!z10) {
            imageView.setVisibility(8);
            return;
        }
        try {
            File h = org.telegram.messenger.t0.h();
            bitmap = BitmapFactory.decodeFile(new File(h, "cthumb" + this.h + ".jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(2131231492);
        }
        if (z11) {
            imageView.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.animate().alpha(1.0f).setDuration(250L).start();
            return;
        }
        imageView.setAlpha(1.0f);
        imageView.setVisibility(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7 = (this.E > 1.0f ? 1 : (this.E == 1.0f ? 0 : -1));
        Path path = this.L;
        if (i7 < 0) {
            Point point = org.telegram.messenger.g0.f23611q;
            int i10 = point.x;
            int i11 = point.y + org.telegram.messenger.g0.f23605m + org.telegram.messenger.g0.f23606n;
            float L = org.telegram.messenger.g0.L(28.0f) - (org.telegram.messenger.g0.L(28.0f) * this.E);
            path.reset();
            float f10 = this.J;
            float f11 = this.K;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f10 + org.telegram.messenger.g0.L(33.5f), f11 + org.telegram.messenger.g0.L(26.6f), org.telegram.messenger.g0.L(26.0f), direction);
            int L2 = org.telegram.messenger.g0.L(52.0f);
            int L3 = org.telegram.messenger.g0.L(52.0f);
            int W1 = org.telegram.messenger.g0.W1(this.E, L2, i10);
            int W12 = org.telegram.messenger.g0.W1(this.E, L3, i11);
            float L4 = this.H - ((1.0f - this.E) * org.telegram.messenger.g0.L(20.0f));
            float L5 = this.I - ((1.0f - this.E) * org.telegram.messenger.g0.L(51.0f));
            path.addRoundRect(L4, L5, W1 + L4, L5 + W12, L, L, direction);
            canvas.clipPath(path);
        }
        if (this.G > 0.0f) {
            int[] floatingViewLocation = getFloatingViewLocation();
            float f12 = this.G;
            int i12 = (int) (floatingViewLocation[0] * f12);
            int i13 = (int) (floatingViewLocation[1] * f12);
            int i14 = floatingViewLocation[2];
            int i15 = org.telegram.messenger.g0.f23611q.x;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f12, i15 - i14, i14) / i15;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * z10, getHeight() * z10, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Path.Direction.CW);
            canvas.translate(i12, i13);
            canvas.clipPath(path);
            canvas.scale(z10, z10);
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        t2 t2Var;
        int i7 = this.f40549w;
        t2[] t2VarArr = this.f40544e;
        t2 t2Var2 = t2VarArr[i7];
        if (i7 < t2VarArr.length - 1) {
            t2Var = t2VarArr[i7 + 1];
        } else {
            t2Var = null;
        }
        float measuredWidth = (t2Var2.getMeasuredWidth() / 2) + t2Var2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (t2Var != null) {
            measuredWidth2 -= (((t2Var.getMeasuredWidth() / 2) + t2Var.getLeft()) - measuredWidth) * this.f40548s;
        }
        int i10 = 0;
        while (true) {
            float f10 = 0.7f;
            if (i10 >= t2VarArr.length) {
                break;
            }
            int i11 = this.f40549w;
            float f11 = 0.9f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = this.f40548s;
                    f10 = 1.0f - (0.3f * f12);
                    f11 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.f40548s;
                    f10 = 0.7f + (0.3f * f13);
                    f11 = 0.9f + (f13 * 0.1f);
                }
            }
            t2VarArr[i10].setAlpha(f10);
            t2VarArr[i10].setScaleX(f11);
            t2VarArr[i10].setScaleY(f11);
            t2VarArr[i10].setTranslationX(measuredWidth2);
            i10++;
        }
        this.f40543c.invalidate();
        if (this.f40550x == 0) {
            t2VarArr[2].setAlpha(this.f40548s * 0.7f);
        }
        if (this.f40550x == 2) {
            float f14 = this.f40548s;
            if (f14 > 0.0f) {
                t2VarArr[0].setAlpha((1.0f - f14) * 0.7f);
            } else {
                t2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.f40550x == 1) {
            if (this.f40551y == 0) {
                t2VarArr[2].setAlpha(this.f40548s * 0.7f);
            }
            if (this.f40551y == 2) {
                t2VarArr[0].setAlpha((1.0f - this.f40548s) * 0.7f);
            }
        }
    }

    public int[] getFloatingViewLocation() {
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        org.telegram.messenger.voip.t0.a(this);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        if (!this.f40546n) {
            this.f40546n = true;
            if (this.f40550x != 0) {
                this.f40545f.animate().alpha(1.0f).setDuration(250L).start();
            }
        }
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        if (VoIPService.getSharedInstance() != null) {
            this.f40545f.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        e();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824), 0);
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.t0.d(this, i7, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.t0.f(this, i7);
    }

    @Override
    public final void onStateChanged(int i7) {
        org.telegram.messenger.voip.t0.g(this, i7);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public void setBottomPadding(int i7) {
        ((FrameLayout.LayoutParams) this.f40543c.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(80.0f) + i7;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i7;
    }
}
