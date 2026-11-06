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
import c8.ha;
import fi.l9;
import fi.v3;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.xq;
import org.telegram.ui.c61;
import org.telegram.ui.ec1;
import org.telegram.ui.va;
import org.telegram.ui.w9;
import org.telegram.ui.yb1;
import org.webrtc.RendererCommon;
public abstract class z0 extends FrameLayout implements VoIPService.StateListener {
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public final float I;
    public final float J;
    public final Path K;
    public final Camera L;
    public final Matrix M;
    public final Matrix N;
    public final boolean O;
    public final b8 P;
    public final b8 Q;
    public final qa0 R;
    public final qa0 S;
    public final GestureDetector T;
    public ValueAnimator U;
    public boolean f39610a;
    public final u41 f39611b;
    public final x0 f39612c;
    public final c61 d;
    public final p2[] f39613e;
    public final k2 f39614f;
    public int h;
    public boolean f39615n;
    public final org.telegram.ui.ActionBar.k f39616r;
    public float f39617s;
    public int f39618w;
    public int f39619x;
    public int f39620y;

    public z0(Context context, float f10, float f11) {
        super(context);
        String M0;
        this.h = 1;
        this.f39620y = -1;
        this.D = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.K = new Path();
        this.L = new Camera();
        this.M = new Matrix();
        this.N = new Matrix();
        this.P = new b8(80, 80);
        this.Q = new b8(80, 80);
        this.R = new qa0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.S = new qa0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.I = f10;
        this.J = f11;
        this.f39613e = new p2[3];
        yb1 yb1Var = (yb1) this;
        this.T = new GestureDetector(context, new w0(yb1Var));
        u41 u41Var = new u41(1, context, yb1Var);
        this.f39611b = u41Var;
        u41Var.setClickable(true);
        addView(u41Var, ha.c(-1.0f, -1));
        k2 k2Var = new k2(context, false, false);
        this.f39614f = k2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        j2 j2Var = k2Var.d;
        j2Var.setScalingType(scalingType);
        k2Var.f39275a0 = 1;
        k2Var.f39279c0 = true;
        j2Var.setAlpha(0.0f);
        j2Var.setRotateTextureWithScreen(true);
        j2Var.setUseCameraRotation(true);
        addView(k2Var, ha.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.f39616r = kVar;
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        kVar.setBackgroundColor(0);
        r6.m(kVar, 1, k6.Vg, null);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new w9(yb1Var, 20));
        addView(kVar);
        x0 x0Var = new x0(yb1Var, getContext());
        this.f39612c = x0Var;
        x0Var.setMaxLines(1);
        x0Var.setEllipsize(null);
        x0Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        x0Var.setTag(-1);
        x0Var.setTextSize(1, 14.0f);
        int i7 = k6.f27821bh;
        r6.V(x0Var, i7, null);
        x0Var.setGravity(17);
        x0Var.setTypeface(org.telegram.messenger.g0.o());
        x0Var.getPaint().setTextAlign(Paint.Align.CENTER);
        x0Var.setContentDescription(hd.M0(2131743241, null));
        int L = org.telegram.messenger.g0.L(8.0f);
        int o4 = i0.a.o(k6.x0(null, i7, false), 76);
        x0Var.setForeground(k6.k0(L, L, L, L, 0, o4, o4));
        x0Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        x0Var.setOnClickListener(new ii.g(yb1Var, 19));
        addView(x0Var, ha.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        c61 c61Var = new c61(17, context, yb1Var);
        this.d = c61Var;
        c61Var.setClipChildren(false);
        addView(c61Var, ha.e(-1, 64, 80));
        for (int i10 = 0; i10 < this.f39613e.length; i10++) {
            if (i10 == 0) {
                M0 = hd.M0(2131743260, null);
            } else if (i10 == 1) {
                M0 = hd.M0(2131743406, null);
            } else {
                M0 = hd.M0(2131743494, null);
            }
            this.f39613e[i10] = new p2(context, M0);
            this.f39613e[i10].setContentDescription(M0);
            this.f39613e[i10].setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            this.d.addView(this.f39613e[i10], ha.o(-2, -1));
            this.f39613e[i10].setOnClickListener(new ai.v(yb1Var, i10, 21));
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f39614f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f39614f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.f39614f.d, false);
        }
        u41 u41Var2 = this.f39611b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new qa0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232679);
        frameLayout.addView(imageView, ha.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(hd.M0(2131743224, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, ha.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        u41Var2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(2131231492);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        u41Var2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new l9(yb1Var, f10, f11, 2));
        ofFloat.addListener(new va(yb1Var, 13));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new v3(yb1Var, 18));
        xq xqVar = xq.f40329f;
        ofFloat.setInterpolator(xqVar);
        long j3 = 320;
        ofFloat.setDuration(j3);
        ofFloat.start();
        ofFloat2.setInterpolator(xqVar);
        ofFloat2.setDuration(j3);
        ofFloat2.setStartDelay(32);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.f39612c.setTranslationY(org.telegram.messenger.g0.L(53.0f));
        this.f39612c.setTranslationX((f10 - (org.telegram.messenger.g0.f22537q.x / 2.0f)) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(26.0f));
        this.f39612c.animate().translationY(0.0f).translationX(0.0f).setDuration(j3).start();
        this.O = true;
        c(1, false);
    }

    public final void a(boolean z9, boolean z10) {
        if (!this.f39610a && this.D == 1.0f) {
            yb1 yb1Var = (yb1) this;
            yb1Var.V.f45312w.S = false;
            yb1Var.V.f45312w.invalidate();
            this.f39610a = true;
            b();
            ec1 ec1Var = yb1Var.V;
            ec1Var.f45301n0 = null;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            ec1Var.f45309t0.setLockOnScreen(false);
            if (z10) {
                ec1Var.m0 = true;
                if (sharedInstance != null && !z9) {
                    sharedInstance.requestVideoCall(false);
                    sharedInstance.setVideoState(false, 2);
                    sharedInstance.switchToSpeaker();
                }
                if (sharedInstance != null) {
                    ec1Var.m(ec1Var.f45286f, sharedInstance, true);
                }
            } else if (sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            ec1Var.f45303p0 = ec1Var.f45302o0;
            ec1Var.y();
            if (yb1Var.V.f45299l0 && z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new u0(this, 0));
                ofFloat.setInterpolator(xq.f40329f);
                ofFloat.setStartDelay(60L);
                ofFloat.setDuration(350L);
                ofFloat.addListener(new v0(this, 2));
                ofFloat.start();
                this.f39612c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.f39616r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            } else if (z10) {
                animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(xq.f40329f).setListener(new v0(this, 0));
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat2.addUpdateListener(new u0(this, 1));
                ofFloat2.addListener(new v0(this, 1));
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new u0(this, 2));
                xq xqVar = xq.f40329f;
                ofFloat2.setInterpolator(xqVar);
                long j3 = 320;
                ofFloat2.setDuration(j3);
                ofFloat2.start();
                ofFloat3.setInterpolator(xqVar);
                ofFloat3.setDuration(j3);
                ofFloat3.start();
                this.d.setAlpha(1.0f);
                this.d.setScaleY(1.0f);
                this.d.setScaleX(1.0f);
                this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                float f10 = 320;
                this.f39612c.animate().translationY(org.telegram.messenger.g0.L(53.0f)).translationX((this.I - (org.telegram.messenger.g0.f22537q.x / 2.0f)) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(26.0f)).setDuration(0.6f * f10).start();
                animate().alpha(0.0f).setDuration(0.25f * f10).setStartDelay(f10 * 0.75f).start();
            }
            invalidate();
        }
    }

    public final void b() {
        k2 k2Var = this.f39614f;
        if (this.f39615n) {
            try {
                Bitmap bitmap = k2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), k2Var.d.getMatrix(), true);
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
                        View findViewWithTag = this.f39611b.findViewWithTag("image_stab");
                        if (findViewWithTag instanceof ImageView) {
                            ((ImageView) findViewWithTag).setImageBitmap(createScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void c(int i7, boolean z9) {
        int i10;
        if (this.f39618w != i7 && (i10 = this.f39619x) != i7) {
            k2 k2Var = this.f39614f;
            if (z9) {
                if (i10 == 0) {
                    if (this.h != i7) {
                        this.h = i7;
                        this.f39615n = false;
                        d(true, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().switchCamera();
                        }
                    } else {
                        d(false, false);
                        k2Var.animate().alpha(1.0f).setDuration(250L).start();
                    }
                } else if (i7 == 0) {
                    this.f39611b.findViewWithTag("screencast_stub").setVisibility(0);
                    b();
                    d(false, false);
                    k2Var.animate().alpha(0.0f).setDuration(250L).start();
                } else {
                    b();
                    this.h = i7;
                    this.f39615n = false;
                    d(true, false);
                    k2Var.animate().alpha(0.0f).setDuration(250L).start();
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().switchCamera();
                    }
                }
                int i11 = this.f39619x;
                if (i7 > i11) {
                    this.f39620y = i11;
                    this.f39619x = i11 + 1;
                    this.U = ValueAnimator.ofFloat(0.1f, 1.0f);
                } else {
                    this.f39620y = i11;
                    this.f39619x = i11 - 1;
                    this.f39618w = i7;
                    this.U = ValueAnimator.ofFloat(1.0f, 0.0f);
                }
                this.U.addUpdateListener(new u0(this, 3));
                this.U.addListener(new hi.m2(this, i7, 14));
                this.U.setInterpolator(xq.f40329f);
                this.U.setDuration(350L);
                this.U.start();
                return;
            }
            this.f39619x = i7;
            this.f39618w = i7;
            this.f39617s = 0.0f;
            e();
            k2Var.setVisibility(0);
            this.f39615n = false;
            this.h = 1;
            d(true, false);
        }
    }

    public final void d(boolean z9, boolean z10) {
        Bitmap bitmap;
        ImageView imageView = (ImageView) this.f39611b.findViewWithTag("image_stab");
        if (!z9) {
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
        if (z10) {
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
        int i7 = (this.D > 1.0f ? 1 : (this.D == 1.0f ? 0 : -1));
        Path path = this.K;
        if (i7 < 0) {
            Point point = org.telegram.messenger.g0.f22537q;
            int i10 = point.x;
            int i11 = point.y + org.telegram.messenger.g0.f22531m + org.telegram.messenger.g0.f22532n;
            float L = org.telegram.messenger.g0.L(28.0f) - (org.telegram.messenger.g0.L(28.0f) * this.D);
            path.reset();
            float f10 = this.I;
            float f11 = this.J;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f10 + org.telegram.messenger.g0.L(33.5f), f11 + org.telegram.messenger.g0.L(26.6f), org.telegram.messenger.g0.L(26.0f), direction);
            int L2 = org.telegram.messenger.g0.L(52.0f);
            int L3 = org.telegram.messenger.g0.L(52.0f);
            int W1 = org.telegram.messenger.g0.W1(this.D, L2, i10);
            int W12 = org.telegram.messenger.g0.W1(this.D, L3, i11);
            float L4 = this.G - ((1.0f - this.D) * org.telegram.messenger.g0.L(20.0f));
            float L5 = this.H - ((1.0f - this.D) * org.telegram.messenger.g0.L(51.0f));
            path.addRoundRect(L4, L5, W1 + L4, L5 + W12, L, L, direction);
            canvas.clipPath(path);
        }
        if (this.F > 0.0f) {
            int[] floatingViewLocation = getFloatingViewLocation();
            float f12 = this.F;
            int i12 = (int) (floatingViewLocation[0] * f12);
            int i13 = (int) (floatingViewLocation[1] * f12);
            int i14 = floatingViewLocation[2];
            int i15 = org.telegram.messenger.g0.f22537q.x;
            float z9 = com.google.android.recaptcha.internal.a.z(1.0f, f12, i15 - i14, i14) / i15;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * z9, getHeight() * z9, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Path.Direction.CW);
            canvas.translate(i12, i13);
            canvas.clipPath(path);
            canvas.scale(z9, z9);
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        p2 p2Var;
        int i7 = this.f39618w;
        p2[] p2VarArr = this.f39613e;
        p2 p2Var2 = p2VarArr[i7];
        if (i7 < p2VarArr.length - 1) {
            p2Var = p2VarArr[i7 + 1];
        } else {
            p2Var = null;
        }
        float measuredWidth = (p2Var2.getMeasuredWidth() / 2) + p2Var2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (p2Var != null) {
            measuredWidth2 -= (((p2Var.getMeasuredWidth() / 2) + p2Var.getLeft()) - measuredWidth) * this.f39617s;
        }
        int i10 = 0;
        while (true) {
            float f10 = 0.7f;
            if (i10 >= p2VarArr.length) {
                break;
            }
            int i11 = this.f39618w;
            float f11 = 0.9f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = this.f39617s;
                    f10 = 1.0f - (0.3f * f12);
                    f11 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.f39617s;
                    f10 = 0.7f + (0.3f * f13);
                    f11 = 0.9f + (f13 * 0.1f);
                }
            }
            p2VarArr[i10].setAlpha(f10);
            p2VarArr[i10].setScaleX(f11);
            p2VarArr[i10].setScaleY(f11);
            p2VarArr[i10].setTranslationX(measuredWidth2);
            i10++;
        }
        this.f39612c.invalidate();
        if (this.f39619x == 0) {
            p2VarArr[2].setAlpha(this.f39617s * 0.7f);
        }
        if (this.f39619x == 2) {
            float f14 = this.f39617s;
            if (f14 > 0.0f) {
                p2VarArr[0].setAlpha((1.0f - f14) * 0.7f);
            } else {
                p2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.f39619x == 1) {
            if (this.f39620y == 0) {
                p2VarArr[2].setAlpha(this.f39617s * 0.7f);
            }
            if (this.f39620y == 2) {
                p2VarArr[0].setAlpha((1.0f - this.f39617s) * 0.7f);
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
        org.telegram.messenger.voip.s0.a(this);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        if (!this.f39615n) {
            this.f39615n = true;
            if (this.f39619x != 0) {
                this.f39614f.animate().alpha(1.0f).setDuration(250L).start();
            }
        }
    }

    @Override
    public final void onCameraSwitch(boolean z9) {
        if (VoIPService.getSharedInstance() != null) {
            this.f39614f.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        e();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824), 0);
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.s0.d(this, i7, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z9) {
        org.telegram.messenger.voip.s0.e(this, z9);
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.s0.f(this, i7);
    }

    @Override
    public final void onStateChanged(int i7) {
        org.telegram.messenger.voip.s0.g(this, i7);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z9) {
        org.telegram.messenger.voip.s0.h(this, z9);
    }

    public void setBottomPadding(int i7) {
        ((FrameLayout.LayoutParams) this.f39612c.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(80.0f) + i7;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i7;
    }
}
