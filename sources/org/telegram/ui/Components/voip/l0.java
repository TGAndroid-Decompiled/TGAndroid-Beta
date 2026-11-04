package org.telegram.ui.Components.voip;

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
import b8.mf;
import gi.j3;
import gi.l9;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.o9;
import org.telegram.ui.s51;
import org.telegram.ui.sb1;
import org.telegram.ui.zb1;
import org.webrtc.RendererCommon;
public abstract class l0 extends FrameLayout implements VoIPService.StateListener {
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
    public final l2.e Q;
    public final l2.e R;
    public final la0 S;
    public final la0 T;
    public final GestureDetector U;
    public ValueAnimator V;
    public boolean f39445a;
    public final kw0 f39446b;
    public final j0 f39447c;
    public final s51 d;
    public final e2[] f39448e;
    public final z1 f39449f;
    public int h;
    public boolean f39450n;
    public final org.telegram.ui.ActionBar.k f39451r;
    public float f39452s;
    public int f39453w;
    public int f39454x;
    public int f39455y;

    public l0(Context context, float f10, float f11) {
        super(context);
        String M0;
        this.h = 1;
        this.f39455y = -1;
        this.E = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        this.L = new Path();
        this.M = new Camera();
        this.N = new Matrix();
        this.O = new Matrix();
        this.Q = new l2.e(80, 80);
        this.R = new l2.e(80, 80);
        this.S = new la0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.T = new la0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.J = f10;
        this.K = f11;
        this.f39448e = new e2[3];
        sb1 sb1Var = (sb1) this;
        this.U = new GestureDetector(context, new i0(sb1Var));
        kw0 kw0Var = new kw0(3, context, sb1Var);
        this.f39446b = kw0Var;
        kw0Var.setClickable(true);
        addView(kw0Var, mf.c(-1.0f, -1));
        z1 z1Var = new z1(context, false, false);
        this.f39449f = z1Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        y1 y1Var = z1Var.d;
        y1Var.setScalingType(scalingType);
        z1Var.f39733b0 = 1;
        z1Var.f39736d0 = true;
        y1Var.setAlpha(0.0f);
        y1Var.setRotateTextureWithScreen(true);
        y1Var.setUseCameraRotation(true);
        addView(z1Var, mf.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.f39451r = kVar;
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        kVar.setBackgroundColor(0);
        r6.m(kVar, 1, k6.Vg, null);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new o9(sb1Var, 21));
        addView(kVar);
        j0 j0Var = new j0(sb1Var, getContext());
        this.f39447c = j0Var;
        j0Var.setMaxLines(1);
        j0Var.setEllipsize(null);
        j0Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        j0Var.setTag(-1);
        j0Var.setTextSize(1, 14.0f);
        int i3 = k6.f27853bh;
        r6.V(j0Var, i3, null);
        j0Var.setGravity(17);
        j0Var.setTypeface(org.telegram.messenger.g0.o());
        j0Var.getPaint().setTextAlign(Paint.Align.CENTER);
        j0Var.setContentDescription(bd.M0(2131743250, null));
        float f12 = 8.0f;
        int L = org.telegram.messenger.g0.L(8.0f);
        int o10 = i0.a.o(k6.x0(null, i3, false), 76);
        j0Var.setForeground(k6.k0(L, L, L, L, 0, o10, o10));
        j0Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        j0Var.setOnClickListener(new ii.m(sb1Var, 22));
        addView(j0Var, mf.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        s51 s51Var = new s51(18, context, sb1Var);
        this.d = s51Var;
        s51Var.setClipChildren(false);
        addView(s51Var, mf.e(-1, 64, 80));
        int i10 = 0;
        while (i10 < this.f39448e.length) {
            if (i10 == 0) {
                M0 = bd.M0(2131743269, null);
            } else if (i10 == 1) {
                M0 = bd.M0(2131743415, null);
            } else {
                M0 = bd.M0(2131743503, null);
            }
            this.f39448e[i10] = new e2(context, M0);
            this.f39448e[i10].setContentDescription(M0);
            this.f39448e[i10].setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            this.d.addView(this.f39448e[i10], mf.o(-2, -1));
            this.f39448e[i10].setOnClickListener(new bi.q(sb1Var, i10, 21));
            i10++;
            f12 = f12;
        }
        float f13 = f12;
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f39449f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f39449f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.f39449f.d, false);
        }
        kw0 kw0Var2 = this.f39446b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new la0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232677);
        frameLayout.addView(imageView, mf.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(bd.M0(2131743233, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, mf.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        kw0Var2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(2131231492);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        kw0Var2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new l9(sb1Var, f10, f11, 2));
        ofFloat.addListener(new w9(sb1Var, 13));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new j3(sb1Var, 18));
        xq xqVar = xq.f40452f;
        ofFloat.setInterpolator(xqVar);
        long j10 = 320;
        ofFloat.setDuration(j10);
        ofFloat.start();
        ofFloat2.setInterpolator(xqVar);
        ofFloat2.setDuration(j10);
        ofFloat2.setStartDelay(32);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.f39447c.setTranslationY(org.telegram.messenger.g0.L(53.0f));
        this.f39447c.setTranslationX((f10 - (org.telegram.messenger.g0.f22608q.x / 2.0f)) + org.telegram.messenger.g0.L(f13) + org.telegram.messenger.g0.L(26.0f));
        this.f39447c.animate().translationY(0.0f).translationX(0.0f).setDuration(j10).start();
        this.P = true;
        c(1, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (!this.f39445a && this.E == 1.0f) {
            sb1 sb1Var = (sb1) this;
            sb1Var.W.f52645w.T = false;
            sb1Var.W.f52645w.invalidate();
            this.f39445a = true;
            b();
            zb1 zb1Var = sb1Var.W;
            zb1Var.f52636p0 = null;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            zb1Var.f52644v0.setLockOnScreen(false);
            if (z11) {
                zb1Var.f52635o0 = true;
                if (sharedInstance != null && !z10) {
                    sharedInstance.requestVideoCall(false);
                    sharedInstance.setVideoState(false, 2);
                    sharedInstance.switchToSpeaker();
                }
                if (sharedInstance != null) {
                    zb1Var.u(zb1Var.f52618f, sharedInstance, true);
                }
            } else if (sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            zb1Var.f52639r0 = zb1Var.f52637q0;
            zb1Var.G();
            if (sb1Var.W.f52633n0 && z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new g0(this, 0));
                ofFloat.setInterpolator(xq.f40452f);
                ofFloat.setStartDelay(60L);
                ofFloat.setDuration(350L);
                ofFloat.addListener(new h0(this, 2));
                ofFloat.start();
                this.f39447c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.f39451r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            } else if (z11) {
                animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(xq.f40452f).setListener(new h0(this, 0));
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat2.addUpdateListener(new g0(this, 1));
                ofFloat2.addListener(new h0(this, 1));
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new g0(this, 2));
                xq xqVar = xq.f40452f;
                ofFloat2.setInterpolator(xqVar);
                long j10 = 320;
                ofFloat2.setDuration(j10);
                ofFloat2.start();
                ofFloat3.setInterpolator(xqVar);
                ofFloat3.setDuration(j10);
                ofFloat3.start();
                this.d.setAlpha(1.0f);
                this.d.setScaleY(1.0f);
                this.d.setScaleX(1.0f);
                this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                float f10 = 320;
                this.f39447c.animate().translationY(org.telegram.messenger.g0.L(53.0f)).translationX((this.J - (org.telegram.messenger.g0.f22608q.x / 2.0f)) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(26.0f)).setDuration(0.6f * f10).start();
                animate().alpha(0.0f).setDuration(0.25f * f10).setStartDelay(f10 * 0.75f).start();
            }
            invalidate();
        }
    }

    public final void b() {
        z1 z1Var = this.f39449f;
        if (this.f39450n) {
            try {
                Bitmap bitmap = z1Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), z1Var.d.getMatrix(), true);
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
                        View findViewWithTag = this.f39446b.findViewWithTag("image_stab");
                        if (findViewWithTag instanceof ImageView) {
                            ((ImageView) findViewWithTag).setImageBitmap(createScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void c(int i3, boolean z10) {
        int i10;
        if (this.f39453w != i3 && (i10 = this.f39454x) != i3) {
            z1 z1Var = this.f39449f;
            if (z10) {
                if (i10 == 0) {
                    if (this.h != i3) {
                        this.h = i3;
                        this.f39450n = false;
                        d(true, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().switchCamera();
                        }
                    } else {
                        d(false, false);
                        z1Var.animate().alpha(1.0f).setDuration(250L).start();
                    }
                } else if (i3 == 0) {
                    this.f39446b.findViewWithTag("screencast_stub").setVisibility(0);
                    b();
                    d(false, false);
                    z1Var.animate().alpha(0.0f).setDuration(250L).start();
                } else {
                    b();
                    this.h = i3;
                    this.f39450n = false;
                    d(true, false);
                    z1Var.animate().alpha(0.0f).setDuration(250L).start();
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().switchCamera();
                    }
                }
                int i11 = this.f39454x;
                if (i3 > i11) {
                    this.f39455y = i11;
                    this.f39454x = i11 + 1;
                    this.V = ValueAnimator.ofFloat(0.1f, 1.0f);
                } else {
                    this.f39455y = i11;
                    this.f39454x = i11 - 1;
                    this.f39453w = i3;
                    this.V = ValueAnimator.ofFloat(1.0f, 0.0f);
                }
                this.V.addUpdateListener(new g0(this, 3));
                this.V.addListener(new ii.m2(this, i3, 14));
                this.V.setInterpolator(xq.f40452f);
                this.V.setDuration(350L);
                this.V.start();
                return;
            }
            this.f39454x = i3;
            this.f39453w = i3;
            this.f39452s = 0.0f;
            e();
            z1Var.setVisibility(0);
            this.f39450n = false;
            this.h = 1;
            d(true, false);
        }
    }

    public final void d(boolean z10, boolean z11) {
        Bitmap bitmap;
        ImageView imageView = (ImageView) this.f39446b.findViewWithTag("image_stab");
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
        int i3 = (this.E > 1.0f ? 1 : (this.E == 1.0f ? 0 : -1));
        Path path = this.L;
        if (i3 < 0) {
            Point point = org.telegram.messenger.g0.f22608q;
            int i10 = point.x;
            int i11 = point.y + org.telegram.messenger.g0.f22602m + org.telegram.messenger.g0.f22603n;
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
            int i15 = org.telegram.messenger.g0.f22608q.x;
            float y9 = com.google.android.recaptcha.internal.a.y(1.0f, f12, i15 - i14, i14) / i15;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * y9, getHeight() * y9, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Path.Direction.CW);
            canvas.translate(i12, i13);
            canvas.clipPath(path);
            canvas.scale(y9, y9);
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        e2 e2Var;
        int i3 = this.f39453w;
        e2[] e2VarArr = this.f39448e;
        e2 e2Var2 = e2VarArr[i3];
        if (i3 < e2VarArr.length - 1) {
            e2Var = e2VarArr[i3 + 1];
        } else {
            e2Var = null;
        }
        float measuredWidth = (e2Var2.getMeasuredWidth() / 2) + e2Var2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (e2Var != null) {
            measuredWidth2 -= (((e2Var.getMeasuredWidth() / 2) + e2Var.getLeft()) - measuredWidth) * this.f39452s;
        }
        int i10 = 0;
        while (true) {
            float f10 = 0.7f;
            if (i10 >= e2VarArr.length) {
                break;
            }
            int i11 = this.f39453w;
            float f11 = 0.9f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = this.f39452s;
                    f10 = 1.0f - (0.3f * f12);
                    f11 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.f39452s;
                    f10 = 0.7f + (0.3f * f13);
                    f11 = 0.9f + (f13 * 0.1f);
                }
            }
            e2VarArr[i10].setAlpha(f10);
            e2VarArr[i10].setScaleX(f11);
            e2VarArr[i10].setScaleY(f11);
            e2VarArr[i10].setTranslationX(measuredWidth2);
            i10++;
        }
        this.f39447c.invalidate();
        if (this.f39454x == 0) {
            e2VarArr[2].setAlpha(this.f39452s * 0.7f);
        }
        if (this.f39454x == 2) {
            float f14 = this.f39452s;
            if (f14 > 0.0f) {
                e2VarArr[0].setAlpha((1.0f - f14) * 0.7f);
            } else {
                e2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.f39454x == 1) {
            if (this.f39455y == 0) {
                e2VarArr[2].setAlpha(this.f39452s * 0.7f);
            }
            if (this.f39455y == 2) {
                e2VarArr[0].setAlpha((1.0f - this.f39452s) * 0.7f);
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
        if (!this.f39450n) {
            this.f39450n = true;
            if (this.f39454x != 0) {
                this.f39449f.animate().alpha(1.0f).setDuration(250L).start();
            }
        }
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        if (VoIPService.getSharedInstance() != null) {
            this.f39449f.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        e();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824), 0);
    }

    @Override
    public final void onMediaStateUpdated(int i3, int i10) {
        org.telegram.messenger.voip.s0.d(this, i3, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.s0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i3) {
        org.telegram.messenger.voip.s0.f(this, i3);
    }

    @Override
    public final void onStateChanged(int i3) {
        org.telegram.messenger.voip.s0.g(this, i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.s0.h(this, z10);
    }

    public void setBottomPadding(int i3) {
        ((FrameLayout.LayoutParams) this.f39447c.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(80.0f) + i3;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i3;
    }
}
