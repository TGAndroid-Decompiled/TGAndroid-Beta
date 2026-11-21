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
import c8.ma;
import hi.i9;
import hi.j3;
import hi.o4;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.y01;
import org.telegram.ui.bc1;
import org.telegram.ui.d61;
import org.telegram.ui.hc1;
import org.telegram.ui.x7;
import org.webrtc.RendererCommon;
public abstract class c1 extends FrameLayout implements VoIPService.StateListener {
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
    public final cb0 S;
    public final cb0 T;
    public final GestureDetector U;
    public ValueAnimator V;
    public boolean f40923a;
    public final y01 f40924b;
    public final a1 f40925c;
    public final d61 d;
    public final s2[] f40926e;
    public final n2 f40927f;
    public int h;
    public boolean f40928n;
    public final org.telegram.ui.ActionBar.k f40929r;
    public float f40930s;
    public int f40931w;
    public int f40932x;
    public int f40933y;

    public c1(Context context, float f10, float f11) {
        super(context);
        String N0;
        this.h = 1;
        this.f40933y = -1;
        this.E = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        this.L = new Path();
        this.M = new Camera();
        this.N = new Matrix();
        this.O = new Matrix();
        this.Q = new b8(80, 80);
        this.R = new b8(80, 80);
        this.S = new cb0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.T = new cb0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.J = f10;
        this.K = f11;
        this.f40926e = new s2[3];
        bc1 bc1Var = (bc1) this;
        this.U = new GestureDetector(context, new z0(bc1Var));
        y01 y01Var = new y01(2, context, bc1Var);
        this.f40924b = y01Var;
        y01Var.setClickable(true);
        addView(y01Var, ma.c(-1.0f, -1));
        n2 n2Var = new n2(context, false, false);
        this.f40927f = n2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        m2 m2Var = n2Var.d;
        m2Var.setScalingType(scalingType);
        n2Var.f41212b0 = 1;
        n2Var.f41215d0 = true;
        m2Var.setAlpha(0.0f);
        m2Var.setRotateTextureWithScreen(true);
        m2Var.setUseCameraRotation(true);
        addView(n2Var, ma.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.f40929r = kVar;
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        kVar.setBackgroundColor(0);
        t6.l(kVar, 1, m6.Yg, null);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new x7(bc1Var, 23));
        addView(kVar);
        a1 a1Var = new a1(bc1Var, getContext());
        this.f40925c = a1Var;
        a1Var.setMaxLines(1);
        a1Var.setEllipsize(null);
        a1Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        a1Var.setTag(-1);
        a1Var.setTextSize(1, 14.0f);
        int i7 = m6.f29407eh;
        t6.U(a1Var, i7, null);
        a1Var.setGravity(17);
        a1Var.setTypeface(org.telegram.messenger.g0.o());
        a1Var.getPaint().setTextAlign(Paint.Align.CENTER);
        a1Var.setContentDescription(gd.N0(2131742997, null));
        int L = org.telegram.messenger.g0.L(8.0f);
        int o4 = i0.a.o(m6.x0(null, i7, false), 76);
        a1Var.setForeground(m6.k0(L, L, L, L, 0, o4, o4));
        a1Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        a1Var.setOnClickListener(new o4(bc1Var, 26));
        addView(a1Var, ma.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        d61 d61Var = new d61(18, context, bc1Var);
        this.d = d61Var;
        d61Var.setClipChildren(false);
        addView(d61Var, ma.e(-1, 64, 80));
        for (int i10 = 0; i10 < this.f40926e.length; i10++) {
            if (i10 == 0) {
                N0 = gd.N0(2131743016, null);
            } else if (i10 == 1) {
                N0 = gd.N0(2131743162, null);
            } else {
                N0 = gd.N0(2131743250, null);
            }
            this.f40926e[i10] = new s2(context, N0);
            this.f40926e[i10].setContentDescription(N0);
            this.f40926e[i10].setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            this.d.addView(this.f40926e[i10], ma.o(-2, -1));
            this.f40926e[i10].setOnClickListener(new ci.q(bc1Var, i10, 23));
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f40927f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f40927f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.f40927f.d, false);
        }
        y01 y01Var2 = this.f40924b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new cb0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232681);
        frameLayout.addView(imageView, ma.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(gd.N0(2131742980, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, ma.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        y01Var2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(2131231492);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        y01Var2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new i9(bc1Var, f10, f11, 3));
        ofFloat.addListener(new y9(bc1Var, 14));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new j3(bc1Var, 19));
        nr nrVar = nr.f37956f;
        ofFloat.setInterpolator(nrVar);
        long j3 = 320;
        ofFloat.setDuration(j3);
        ofFloat.start();
        ofFloat2.setInterpolator(nrVar);
        ofFloat2.setDuration(j3);
        ofFloat2.setStartDelay(32);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.f40925c.setTranslationY(org.telegram.messenger.g0.L(53.0f));
        this.f40925c.setTranslationX((f10 - (org.telegram.messenger.g0.f24146q.x / 2.0f)) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(26.0f));
        this.f40925c.animate().translationY(0.0f).translationX(0.0f).setDuration(j3).start();
        this.P = true;
        c(1, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (!this.f40923a && this.E == 1.0f) {
            bc1 bc1Var = (bc1) this;
            bc1Var.W.f48366w.T = false;
            bc1Var.W.f48366w.invalidate();
            this.f40923a = true;
            b();
            hc1 hc1Var = bc1Var.W;
            hc1Var.f48356o0 = null;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            hc1Var.f48364u0.setLockOnScreen(false);
            if (z11) {
                hc1Var.f48355n0 = true;
                if (sharedInstance != null && !z10) {
                    sharedInstance.requestVideoCall(false);
                    sharedInstance.setVideoState(false, 2);
                    sharedInstance.switchToSpeaker();
                }
                if (sharedInstance != null) {
                    hc1Var.m(hc1Var.f48340f, sharedInstance, true);
                }
            } else if (sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            hc1Var.f48358q0 = hc1Var.f48357p0;
            hc1Var.y();
            if (bc1Var.W.m0 && z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new x0(this, 0));
                ofFloat.setInterpolator(nr.f37956f);
                ofFloat.setStartDelay(60L);
                ofFloat.setDuration(350L);
                ofFloat.addListener(new y0(this, 2));
                ofFloat.start();
                this.f40925c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.f40929r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            } else if (z11) {
                animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(nr.f37956f).setListener(new y0(this, 0));
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat2.addUpdateListener(new x0(this, 1));
                ofFloat2.addListener(new y0(this, 1));
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new x0(this, 2));
                nr nrVar = nr.f37956f;
                ofFloat2.setInterpolator(nrVar);
                long j3 = 320;
                ofFloat2.setDuration(j3);
                ofFloat2.start();
                ofFloat3.setInterpolator(nrVar);
                ofFloat3.setDuration(j3);
                ofFloat3.start();
                this.d.setAlpha(1.0f);
                this.d.setScaleY(1.0f);
                this.d.setScaleX(1.0f);
                this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                float f10 = 320;
                this.f40925c.animate().translationY(org.telegram.messenger.g0.L(53.0f)).translationX((this.J - (org.telegram.messenger.g0.f24146q.x / 2.0f)) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(26.0f)).setDuration(0.6f * f10).start();
                animate().alpha(0.0f).setDuration(0.25f * f10).setStartDelay(f10 * 0.75f).start();
            }
            invalidate();
        }
    }

    public final void b() {
        n2 n2Var = this.f40927f;
        if (this.f40928n) {
            try {
                Bitmap bitmap = n2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), n2Var.d.getMatrix(), true);
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
                        View findViewWithTag = this.f40924b.findViewWithTag("image_stab");
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
        if (this.f40931w != i7 && (i10 = this.f40932x) != i7) {
            n2 n2Var = this.f40927f;
            if (z10) {
                if (i10 == 0) {
                    if (this.h != i7) {
                        this.h = i7;
                        this.f40928n = false;
                        d(true, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().switchCamera();
                        }
                    } else {
                        d(false, false);
                        n2Var.animate().alpha(1.0f).setDuration(250L).start();
                    }
                } else if (i7 == 0) {
                    this.f40924b.findViewWithTag("screencast_stub").setVisibility(0);
                    b();
                    d(false, false);
                    n2Var.animate().alpha(0.0f).setDuration(250L).start();
                } else {
                    b();
                    this.h = i7;
                    this.f40928n = false;
                    d(true, false);
                    n2Var.animate().alpha(0.0f).setDuration(250L).start();
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().switchCamera();
                    }
                }
                int i11 = this.f40932x;
                if (i7 > i11) {
                    this.f40933y = i11;
                    this.f40932x = i11 + 1;
                    this.V = ValueAnimator.ofFloat(0.1f, 1.0f);
                } else {
                    this.f40933y = i11;
                    this.f40932x = i11 - 1;
                    this.f40931w = i7;
                    this.V = ValueAnimator.ofFloat(1.0f, 0.0f);
                }
                this.V.addUpdateListener(new x0(this, 3));
                this.V.addListener(new ki.e2(this, i7, 14));
                this.V.setInterpolator(nr.f37956f);
                this.V.setDuration(350L);
                this.V.start();
                return;
            }
            this.f40932x = i7;
            this.f40931w = i7;
            this.f40930s = 0.0f;
            e();
            n2Var.setVisibility(0);
            this.f40928n = false;
            this.h = 1;
            d(true, false);
        }
    }

    public final void d(boolean z10, boolean z11) {
        Bitmap bitmap;
        ImageView imageView = (ImageView) this.f40924b.findViewWithTag("image_stab");
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
            Point point = org.telegram.messenger.g0.f24146q;
            int i10 = point.x;
            int i11 = point.y + org.telegram.messenger.g0.f24140m + org.telegram.messenger.g0.f24141n;
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
            int i15 = org.telegram.messenger.g0.f24146q.x;
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
        s2 s2Var;
        int i7 = this.f40931w;
        s2[] s2VarArr = this.f40926e;
        s2 s2Var2 = s2VarArr[i7];
        if (i7 < s2VarArr.length - 1) {
            s2Var = s2VarArr[i7 + 1];
        } else {
            s2Var = null;
        }
        float measuredWidth = (s2Var2.getMeasuredWidth() / 2) + s2Var2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (s2Var != null) {
            measuredWidth2 -= (((s2Var.getMeasuredWidth() / 2) + s2Var.getLeft()) - measuredWidth) * this.f40930s;
        }
        int i10 = 0;
        while (true) {
            float f10 = 0.7f;
            if (i10 >= s2VarArr.length) {
                break;
            }
            int i11 = this.f40931w;
            float f11 = 0.9f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = this.f40930s;
                    f10 = 1.0f - (0.3f * f12);
                    f11 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.f40930s;
                    f10 = 0.7f + (0.3f * f13);
                    f11 = 0.9f + (f13 * 0.1f);
                }
            }
            s2VarArr[i10].setAlpha(f10);
            s2VarArr[i10].setScaleX(f11);
            s2VarArr[i10].setScaleY(f11);
            s2VarArr[i10].setTranslationX(measuredWidth2);
            i10++;
        }
        this.f40925c.invalidate();
        if (this.f40932x == 0) {
            s2VarArr[2].setAlpha(this.f40930s * 0.7f);
        }
        if (this.f40932x == 2) {
            float f14 = this.f40930s;
            if (f14 > 0.0f) {
                s2VarArr[0].setAlpha((1.0f - f14) * 0.7f);
            } else {
                s2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.f40932x == 1) {
            if (this.f40933y == 0) {
                s2VarArr[2].setAlpha(this.f40930s * 0.7f);
            }
            if (this.f40933y == 2) {
                s2VarArr[0].setAlpha((1.0f - this.f40930s) * 0.7f);
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
        if (!this.f40928n) {
            this.f40928n = true;
            if (this.f40932x != 0) {
                this.f40927f.animate().alpha(1.0f).setDuration(250L).start();
            }
        }
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        if (VoIPService.getSharedInstance() != null) {
            this.f40927f.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
        ((FrameLayout.LayoutParams) this.f40925c.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(80.0f) + i7;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i7;
    }
}
