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
import bi.d5;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.ar;
import org.telegram.ui.s71;
import org.telegram.ui.s9;
import org.telegram.ui.sd1;
import org.telegram.ui.zd1;
import org.webrtc.RendererCommon;
import w7.b6;
public abstract class m0 extends FrameLayout implements VoIPService.StateListener {
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
    public final j2.f P;
    public final j2.f Q;
    public final jb0 R;
    public final jb0 S;
    public final GestureDetector T;
    public ValueAnimator U;
    public boolean f31591a;
    public final j0 f31592b;
    public final k0 f31593c;
    public final s71 d;
    public final e2[] e;
    public final z1 f31594f;
    public int h;
    public boolean f31595n;
    public final org.telegram.ui.ActionBar.l f31596r;
    public float f31597s;
    public int f31598w;
    public int f31599x;
    public int f31600y;

    public m0(Context context, float f7, float f10) {
        super(context);
        String L0;
        this.h = 1;
        this.f31600y = -1;
        this.D = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.K = new Path();
        this.L = new Camera();
        this.M = new Matrix();
        this.N = new Matrix();
        this.P = new j2.f(80, 80);
        this.Q = new j2.f(80, 80);
        this.R = new jb0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.S = new jb0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.I = f7;
        this.J = f10;
        this.e = new e2[3];
        sd1 sd1Var = (sd1) this;
        this.T = new GestureDetector(context, new i0(sd1Var));
        j0 j0Var = new j0(sd1Var, context, 0);
        this.f31592b = j0Var;
        j0Var.setClickable(true);
        addView(j0Var, b6.c(-1.0f, -1));
        z1 z1Var = new z1(context, false, false);
        this.f31594f = z1Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        y1 y1Var = z1Var.d;
        y1Var.setScalingType(scalingType);
        z1Var.f31848a0 = 1;
        z1Var.f31852c0 = true;
        y1Var.setAlpha(0.0f);
        y1Var.setRotateTextureWithScreen(true);
        y1Var.setUseCameraRotation(true);
        addView(z1Var, b6.c(-1.0f, -1));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, null);
        this.f31596r = lVar;
        lVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        lVar.setBackgroundColor(0);
        a7.m(lVar, 1, t6.Vg, null);
        lVar.setOccupyStatusBar(true);
        lVar.setActionBarMenuOnItemClick(new ar(sd1Var, 11));
        addView(lVar);
        k0 k0Var = new k0(sd1Var, getContext());
        this.f31593c = k0Var;
        k0Var.setMaxLines(1);
        k0Var.setEllipsize(null);
        k0Var.setMinWidth(org.telegram.messenger.i0.L(64.0f));
        k0Var.setTag(-1);
        k0Var.setTextSize(1, 14.0f);
        int i10 = t6.f20902bh;
        a7.V(k0Var, i10, null);
        k0Var.setGravity(17);
        k0Var.setTypeface(org.telegram.messenger.i0.o());
        k0Var.getPaint().setTextAlign(Paint.Align.CENTER);
        k0Var.setContentDescription(dd.L0(2131743266, null));
        int L = org.telegram.messenger.i0.L(8.0f);
        int o10 = i0.b.o(t6.x0(null, i10, false), 76);
        k0Var.setForeground(t6.k0(L, L, L, L, 0, o10, o10));
        k0Var.setPadding(0, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f));
        k0Var.setOnClickListener(new ag.g(sd1Var, 22));
        addView(k0Var, b6.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        s71 s71Var = new s71(sd1Var, context, 13);
        this.d = s71Var;
        s71Var.setClipChildren(false);
        addView(s71Var, b6.e(-1, 64, 80));
        for (int i11 = 0; i11 < this.e.length; i11++) {
            if (i11 == 0) {
                L0 = dd.L0(2131743285, null);
            } else if (i11 == 1) {
                L0 = dd.L0(2131743431, null);
            } else {
                L0 = dd.L0(2131743519, null);
            }
            this.e[i11] = new e2(context, L0);
            this.e[i11].setContentDescription(L0);
            this.e[i11].setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
            this.d.addView(this.e[i11], b6.o(-2, -1));
            this.e[i11].setOnClickListener(new bh.f(sd1Var, i11, 16));
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f31594f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f31594f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.f31594f.d, false);
        }
        j0 j0Var2 = this.f31592b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new jb0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232676);
        frameLayout.addView(imageView, b6.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(dd.L0(2131743249, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        frameLayout.addView(textView, b6.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        j0Var2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(2131231493);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        j0Var2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new fe.c(sd1Var, f7, f10, 3));
        ofFloat.addListener(new s9(sd1Var, 24));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new bg.k(sd1Var, 21));
        gr grVar = gr.f26523f;
        ofFloat.setInterpolator(grVar);
        long j10 = 320;
        ofFloat.setDuration(j10);
        ofFloat.start();
        ofFloat2.setInterpolator(grVar);
        ofFloat2.setDuration(j10);
        ofFloat2.setStartDelay(32);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.f31593c.setTranslationY(org.telegram.messenger.i0.L(53.0f));
        this.f31593c.setTranslationX((f7 - (org.telegram.messenger.i0.f16172q.x / 2.0f)) + org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.L(26.0f));
        this.f31593c.animate().translationY(0.0f).translationX(0.0f).setDuration(j10).start();
        this.O = true;
        c(1, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (!this.f31591a && this.D == 1.0f) {
            sd1 sd1Var = (sd1) this;
            sd1Var.V.f43975w.S = false;
            sd1Var.V.f43975w.invalidate();
            this.f31591a = true;
            b();
            zd1 zd1Var = sd1Var.V;
            zd1Var.f43965o0 = null;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            zd1Var.f43973u0.setLockOnScreen(false);
            if (z11) {
                zd1Var.f43964n0 = true;
                if (sharedInstance != null && !z10) {
                    sharedInstance.requestVideoCall(false);
                    sharedInstance.setVideoState(false, 2);
                    sharedInstance.switchToSpeaker();
                }
                if (sharedInstance != null) {
                    zd1Var.u(zd1Var.f43948f, sharedInstance, true);
                }
            } else if (sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            zd1Var.f43967q0 = zd1Var.f43966p0;
            zd1Var.G();
            if (sd1Var.V.m0 && z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new g0(this, 0));
                ofFloat.setInterpolator(gr.f26523f);
                ofFloat.setStartDelay(60L);
                ofFloat.setDuration(350L);
                ofFloat.addListener(new h0(this, 2));
                ofFloat.start();
                this.f31593c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.f31596r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            } else if (z11) {
                animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(gr.f26523f).setListener(new h0(this, 0));
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat2.addUpdateListener(new g0(this, 1));
                ofFloat2.addListener(new h0(this, 1));
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new g0(this, 2));
                gr grVar = gr.f26523f;
                ofFloat2.setInterpolator(grVar);
                long j10 = 320;
                ofFloat2.setDuration(j10);
                ofFloat2.start();
                ofFloat3.setInterpolator(grVar);
                ofFloat3.setDuration(j10);
                ofFloat3.start();
                this.d.setAlpha(1.0f);
                this.d.setScaleY(1.0f);
                this.d.setScaleX(1.0f);
                this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                float f7 = 320;
                this.f31593c.animate().translationY(org.telegram.messenger.i0.L(53.0f)).translationX((this.I - (org.telegram.messenger.i0.f16172q.x / 2.0f)) + org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.L(26.0f)).setDuration(0.6f * f7).start();
                animate().alpha(0.0f).setDuration(0.25f * f7).setStartDelay(f7 * 0.75f).start();
            }
            invalidate();
        }
    }

    public final void b() {
        z1 z1Var = this.f31594f;
        if (this.f31595n) {
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
                        File h = org.telegram.messenger.w0.h();
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(h, "cthumb" + this.h + ".jpg"));
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        fileOutputStream.close();
                        View findViewWithTag = this.f31592b.findViewWithTag("image_stab");
                        if (findViewWithTag instanceof ImageView) {
                            ((ImageView) findViewWithTag).setImageBitmap(createScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void c(int i10, boolean z10) {
        int i11;
        if (this.f31598w != i10 && (i11 = this.f31599x) != i10) {
            z1 z1Var = this.f31594f;
            if (z10) {
                if (i11 == 0) {
                    if (this.h != i10) {
                        this.h = i10;
                        this.f31595n = false;
                        d(true, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().switchCamera();
                        }
                    } else {
                        d(false, false);
                        z1Var.animate().alpha(1.0f).setDuration(250L).start();
                    }
                } else if (i10 == 0) {
                    this.f31592b.findViewWithTag("screencast_stub").setVisibility(0);
                    b();
                    d(false, false);
                    z1Var.animate().alpha(0.0f).setDuration(250L).start();
                } else {
                    b();
                    this.h = i10;
                    this.f31595n = false;
                    d(true, false);
                    z1Var.animate().alpha(0.0f).setDuration(250L).start();
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().switchCamera();
                    }
                }
                int i12 = this.f31599x;
                if (i10 > i12) {
                    this.f31600y = i12;
                    this.f31599x = i12 + 1;
                    this.U = ValueAnimator.ofFloat(0.1f, 1.0f);
                } else {
                    this.f31600y = i12;
                    this.f31599x = i12 - 1;
                    this.f31598w = i10;
                    this.U = ValueAnimator.ofFloat(1.0f, 0.0f);
                }
                this.U.addUpdateListener(new g0(this, 3));
                this.U.addListener(new d5(this, i10, 13));
                this.U.setInterpolator(gr.f26523f);
                this.U.setDuration(350L);
                this.U.start();
                return;
            }
            this.f31599x = i10;
            this.f31598w = i10;
            this.f31597s = 0.0f;
            e();
            z1Var.setVisibility(0);
            this.f31595n = false;
            this.h = 1;
            d(true, false);
        }
    }

    public final void d(boolean z10, boolean z11) {
        Bitmap bitmap;
        ImageView imageView = (ImageView) this.f31592b.findViewWithTag("image_stab");
        if (!z10) {
            imageView.setVisibility(8);
            return;
        }
        try {
            File h = org.telegram.messenger.w0.h();
            bitmap = BitmapFactory.decodeFile(new File(h, "cthumb" + this.h + ".jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(2131231493);
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
        int i10 = (this.D > 1.0f ? 1 : (this.D == 1.0f ? 0 : -1));
        Path path = this.K;
        if (i10 < 0) {
            Point point = org.telegram.messenger.i0.f16172q;
            int i11 = point.x;
            int i12 = point.y + org.telegram.messenger.i0.f16166m + org.telegram.messenger.i0.f16167n;
            float L = org.telegram.messenger.i0.L(28.0f) - (org.telegram.messenger.i0.L(28.0f) * this.D);
            path.reset();
            float f7 = this.I;
            float f10 = this.J;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f7 + org.telegram.messenger.i0.L(33.5f), f10 + org.telegram.messenger.i0.L(26.6f), org.telegram.messenger.i0.L(26.0f), direction);
            int L2 = org.telegram.messenger.i0.L(52.0f);
            int L3 = org.telegram.messenger.i0.L(52.0f);
            int W1 = org.telegram.messenger.i0.W1(this.D, L2, i11);
            int W12 = org.telegram.messenger.i0.W1(this.D, L3, i12);
            float L4 = this.G - ((1.0f - this.D) * org.telegram.messenger.i0.L(20.0f));
            float L5 = this.H - ((1.0f - this.D) * org.telegram.messenger.i0.L(51.0f));
            path.addRoundRect(L4, L5, W1 + L4, L5 + W12, L, L, direction);
            canvas.clipPath(path);
        }
        if (this.F > 0.0f) {
            int[] floatingViewLocation = getFloatingViewLocation();
            float f11 = this.F;
            int i13 = (int) (floatingViewLocation[0] * f11);
            int i14 = (int) (floatingViewLocation[1] * f11);
            int i15 = floatingViewLocation[2];
            int i16 = org.telegram.messenger.i0.f16172q.x;
            float z10 = c3.i0.z(1.0f, f11, i16 - i15, i15) / i16;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * z10, getHeight() * z10, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), Path.Direction.CW);
            canvas.translate(i13, i14);
            canvas.clipPath(path);
            canvas.scale(z10, z10);
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        e2 e2Var;
        int i10 = this.f31598w;
        e2[] e2VarArr = this.e;
        e2 e2Var2 = e2VarArr[i10];
        if (i10 < e2VarArr.length - 1) {
            e2Var = e2VarArr[i10 + 1];
        } else {
            e2Var = null;
        }
        float measuredWidth = (e2Var2.getMeasuredWidth() / 2) + e2Var2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (e2Var != null) {
            measuredWidth2 -= (((e2Var.getMeasuredWidth() / 2) + e2Var.getLeft()) - measuredWidth) * this.f31597s;
        }
        int i11 = 0;
        while (true) {
            float f7 = 0.7f;
            if (i11 >= e2VarArr.length) {
                break;
            }
            int i12 = this.f31598w;
            float f10 = 0.9f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = this.f31597s;
                    f7 = 1.0f - (0.3f * f11);
                    f10 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = this.f31597s;
                    f7 = 0.7f + (0.3f * f12);
                    f10 = 0.9f + (f12 * 0.1f);
                }
            }
            e2VarArr[i11].setAlpha(f7);
            e2VarArr[i11].setScaleX(f10);
            e2VarArr[i11].setScaleY(f10);
            e2VarArr[i11].setTranslationX(measuredWidth2);
            i11++;
        }
        this.f31593c.invalidate();
        if (this.f31599x == 0) {
            e2VarArr[2].setAlpha(this.f31597s * 0.7f);
        }
        if (this.f31599x == 2) {
            float f13 = this.f31597s;
            if (f13 > 0.0f) {
                e2VarArr[0].setAlpha((1.0f - f13) * 0.7f);
            } else {
                e2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.f31599x == 1) {
            if (this.f31600y == 0) {
                e2VarArr[2].setAlpha(this.f31597s * 0.7f);
            }
            if (this.f31600y == 2) {
                e2VarArr[0].setAlpha((1.0f - this.f31597s) * 0.7f);
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
        org.telegram.messenger.voip.y0.a(this);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        if (!this.f31595n) {
            this.f31595n = true;
            if (this.f31599x != 0) {
                this.f31594f.animate().alpha(1.0f).setDuration(250L).start();
            }
        }
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        if (VoIPService.getSharedInstance() != null) {
            this.f31594f.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f), 1073741824), 0);
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.y0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.y0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.y0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        org.telegram.messenger.voip.y0.g(this, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.y0.h(this, z10);
    }

    public void setBottomPadding(int i10) {
        ((FrameLayout.LayoutParams) this.f31593c.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(80.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
    }
}
