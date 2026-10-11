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
import ci.m4;
import ci.ya;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j91;
import org.telegram.ui.cc1;
import org.telegram.ui.ni1;
import org.telegram.ui.ro;
import org.telegram.ui.ui1;
import org.webrtc.RendererCommon;
import w7.x5;
public abstract class e1 extends FrameLayout implements VoIPService.StateListener {
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
    public final com.google.firebase.messaging.n P;
    public final com.google.firebase.messaging.n Q;
    public final cd0 R;
    public final cd0 S;
    public final GestureDetector T;
    public ValueAnimator U;
    public boolean f32022a;
    public final ai.f0 f32023b;
    public final c1 f32024c;
    public final cc1 d;
    public final y2[] f32025e;
    public final t2 f32026f;
    public int h;
    public boolean f32027n;
    public final org.telegram.ui.ActionBar.k f32028r;
    public float f32029s;
    public int v;
    public int f32030w;
    public int f32031x;
    public float f32032y;

    public e1(Context context, float f7, float f10) {
        super(context);
        String string;
        this.h = 1;
        this.f32031x = -1;
        this.f32032y = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.K = new Path();
        this.L = new Camera();
        this.M = new Matrix();
        this.N = new Matrix();
        this.P = new com.google.firebase.messaging.n(80, 80);
        this.Q = new com.google.firebase.messaging.n(80, 80);
        this.R = new cd0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.S = new cd0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.I = f7;
        this.J = f10;
        this.f32025e = new y2[3];
        ni1 ni1Var = (ni1) this;
        this.T = new GestureDetector(context, new b1(ni1Var));
        ai.f0 f0Var = new ai.f0(ni1Var, context, 23);
        this.f32023b = f0Var;
        f0Var.setClickable(true);
        addView(f0Var, x5.d(-1.0f, -1));
        t2 t2Var = new t2(context, false, false);
        this.f32026f = t2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        s2 s2Var = t2Var.d;
        s2Var.setScalingType(scalingType);
        t2Var.f32334a0 = 1;
        t2Var.f32338c0 = true;
        s2Var.setAlpha(0.0f);
        s2Var.setRotateTextureWithScreen(true);
        s2Var.setUseCameraRotation(true);
        addView(t2Var, x5.d(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.f32028r = kVar;
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.f2(false));
        kVar.setBackgroundColor(0);
        kVar.D(h6.x0(null, h6.f20903hg, false), false);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new ro(ni1Var, 15));
        addView(kVar);
        c1 c1Var = new c1(ni1Var, getContext());
        this.f32024c = c1Var;
        c1Var.setMaxLines(1);
        c1Var.setEllipsize(null);
        c1Var.setMinWidth(AndroidUtilities.dp(64.0f));
        c1Var.setTag(-1);
        c1Var.setTextSize(1, 14.0f);
        int i10 = h6.f21015ng;
        c1Var.setTextColor(h6.x0(null, i10, false));
        c1Var.setGravity(17);
        c1Var.setTypeface(AndroidUtilities.bold());
        c1Var.getPaint().setTextAlign(Paint.Align.CENTER);
        c1Var.setContentDescription(LocaleController.getString(R.string.VoipShareVideo));
        int dp = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(h6.x0(null, i10, false), 76);
        c1Var.setForeground(h6.j0(dp, dp, dp, dp, 0, k10, k10));
        c1Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        c1Var.setOnClickListener(new p(ni1Var, 2));
        addView(c1Var, x5.a(52.0f, 0.0f, 0.0f, 0.0f, 80.0f, 52, 81));
        cc1 cc1Var = new cc1(ni1Var, context, 12);
        this.d = cc1Var;
        cc1Var.setClipChildren(false);
        addView(cc1Var, x5.e(-1, 64, 80));
        for (int i11 = 0; i11 < this.f32025e.length; i11++) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.VoipPhoneScreen);
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.VoipFrontCamera);
            } else {
                string = LocaleController.getString(R.string.VoipBackCamera);
            }
            this.f32025e[i11] = new y2(context, string);
            this.f32025e[i11].setContentDescription(string);
            this.f32025e[i11].setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.d.addView(this.f32025e[i11], x5.n(-2, -1));
            this.f32025e[i11].setOnClickListener(new m4(ni1Var, i11, 16));
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f32026f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f32026f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.f32026f.d, false);
        }
        ai.f0 f0Var2 = this.f32023b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new cd0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView, x5.a(82.0f, 0.0f, 0.0f, 0.0f, 60.0f, 82, 17));
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.messenger.q.m(15.0f, -1, 1, textView);
        frameLayout.addView(textView, x5.a(-2.0f, 21.0f, 28.0f, 21.0f, 0.0f, -1, 17));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        f0Var2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(R.drawable.icplaceholder);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        f0Var2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ya(ni1Var, f7, f10, 3));
        ofFloat.addListener(new j91(ni1Var, 6));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new s0(ni1Var, 1));
        is isVar = is.f27500f;
        ofFloat.setInterpolator(isVar);
        long j3 = 320;
        ofFloat.setDuration(j3);
        ofFloat.start();
        ofFloat2.setInterpolator(isVar);
        ofFloat2.setDuration(j3);
        ofFloat2.setStartDelay(32);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.f32024c.setTranslationY(AndroidUtilities.dp(53.0f));
        this.f32024c.setTranslationX((f7 - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f));
        this.f32024c.animate().translationY(0.0f).translationX(0.0f).setDuration(j3).start();
        this.O = true;
        c(1, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (!this.f32022a && this.f32032y == 1.0f) {
            ni1 ni1Var = (ni1) this;
            ni1Var.V.v.S = false;
            ni1Var.V.v.invalidate();
            this.f32022a = true;
            b();
            ui1 ui1Var = ni1Var.V;
            ui1Var.f42642o0 = null;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            ui1Var.f42650u0.setLockOnScreen(false);
            if (z11) {
                ui1Var.f42641n0 = true;
                if (sharedInstance != null && !z10) {
                    sharedInstance.requestVideoCall(false);
                    sharedInstance.setVideoState(false, 2);
                    sharedInstance.switchToSpeaker();
                }
                if (sharedInstance != null) {
                    ui1Var.u(ui1Var.f42625f, sharedInstance, true);
                }
            } else if (sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            ui1Var.f42644q0 = ui1Var.f42643p0;
            ui1Var.G();
            if (ni1Var.V.m0 && z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new z0(this, 0));
                ofFloat.setInterpolator(is.f27500f);
                ofFloat.setStartDelay(60L);
                ofFloat.setDuration(350L);
                ofFloat.addListener(new a1(this, 2));
                ofFloat.start();
                this.f32024c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.f32028r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            } else if (z11) {
                animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(is.f27500f).setListener(new a1(this, 0));
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat2.addUpdateListener(new z0(this, 1));
                ofFloat2.addListener(new a1(this, 1));
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new z0(this, 2));
                is isVar = is.f27500f;
                ofFloat2.setInterpolator(isVar);
                long j3 = 320;
                ofFloat2.setDuration(j3);
                ofFloat2.start();
                ofFloat3.setInterpolator(isVar);
                ofFloat3.setDuration(j3);
                ofFloat3.start();
                this.d.setAlpha(1.0f);
                this.d.setScaleY(1.0f);
                this.d.setScaleX(1.0f);
                this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                float f7 = 320;
                this.f32024c.animate().translationY(AndroidUtilities.dp(53.0f)).translationX((this.I - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f)).setDuration(0.6f * f7).start();
                animate().alpha(0.0f).setDuration(0.25f * f7).setStartDelay(f7 * 0.75f).start();
            }
            invalidate();
        }
    }

    public final void b() {
        t2 t2Var = this.f32026f;
        if (this.f32027n) {
            try {
                Bitmap bitmap = t2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), t2Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(filesDirFixed, "cthumb" + this.h + ".jpg"));
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        fileOutputStream.close();
                        View findViewWithTag = this.f32023b.findViewWithTag("image_stab");
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
        if (this.v != i10 && (i11 = this.f32030w) != i10) {
            t2 t2Var = this.f32026f;
            if (z10) {
                if (i11 == 0) {
                    if (this.h != i10) {
                        this.h = i10;
                        this.f32027n = false;
                        d(true, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().switchCamera();
                        }
                    } else {
                        d(false, false);
                        t2Var.animate().alpha(1.0f).setDuration(250L).start();
                    }
                } else if (i10 == 0) {
                    this.f32023b.findViewWithTag("screencast_stub").setVisibility(0);
                    b();
                    d(false, false);
                    t2Var.animate().alpha(0.0f).setDuration(250L).start();
                } else {
                    b();
                    this.h = i10;
                    this.f32027n = false;
                    d(true, false);
                    t2Var.animate().alpha(0.0f).setDuration(250L).start();
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().switchCamera();
                    }
                }
                int i12 = this.f32030w;
                if (i10 > i12) {
                    this.f32031x = i12;
                    this.f32030w = i12 + 1;
                    this.U = ValueAnimator.ofFloat(0.1f, 1.0f);
                } else {
                    this.f32031x = i12;
                    this.f32030w = i12 - 1;
                    this.v = i10;
                    this.U = ValueAnimator.ofFloat(1.0f, 0.0f);
                }
                this.U.addUpdateListener(new z0(this, 3));
                this.U.addListener(new ei.v2(this, i10, 12));
                this.U.setInterpolator(is.f27500f);
                this.U.setDuration(350L);
                this.U.start();
                return;
            }
            this.f32030w = i10;
            this.v = i10;
            this.f32029s = 0.0f;
            e();
            t2Var.setVisibility(0);
            this.f32027n = false;
            this.h = 1;
            d(true, false);
        }
    }

    public final void d(boolean z10, boolean z11) {
        Bitmap bitmap;
        ImageView imageView = (ImageView) this.f32023b.findViewWithTag("image_stab");
        if (!z10) {
            imageView.setVisibility(8);
            return;
        }
        try {
            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
            bitmap = BitmapFactory.decodeFile(new File(filesDirFixed, "cthumb" + this.h + ".jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(R.drawable.icplaceholder);
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
        int i10 = (this.f32032y > 1.0f ? 1 : (this.f32032y == 1.0f ? 0 : -1));
        Path path = this.K;
        if (i10 < 0) {
            Point point = AndroidUtilities.displaySize;
            int i11 = point.x;
            int i12 = point.y + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight;
            float dp = AndroidUtilities.dp(28.0f) - (AndroidUtilities.dp(28.0f) * this.f32032y);
            path.reset();
            float f7 = this.I;
            float f10 = this.J;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f7 + AndroidUtilities.dp(33.5f), f10 + AndroidUtilities.dp(26.6f), AndroidUtilities.dp(26.0f), direction);
            int dp2 = AndroidUtilities.dp(52.0f);
            int dp3 = AndroidUtilities.dp(52.0f);
            int lerp = AndroidUtilities.lerp(dp2, i11, this.f32032y);
            int lerp2 = AndroidUtilities.lerp(dp3, i12, this.f32032y);
            float dp4 = this.G - ((1.0f - this.f32032y) * AndroidUtilities.dp(20.0f));
            float dp5 = this.H - ((1.0f - this.f32032y) * AndroidUtilities.dp(51.0f));
            path.addRoundRect(dp4, dp5, lerp + dp4, dp5 + lerp2, dp, dp, direction);
            canvas.clipPath(path);
        }
        if (this.F > 0.0f) {
            int[] floatingViewLocation = getFloatingViewLocation();
            float f11 = this.F;
            int i13 = (int) (floatingViewLocation[0] * f11);
            int i14 = (int) (floatingViewLocation[1] * f11);
            int i15 = floatingViewLocation[2];
            int i16 = AndroidUtilities.displaySize.x;
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f11, i16 - i15, i15) / i16;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * y3, getHeight() * y3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.translate(i13, i14);
            canvas.clipPath(path);
            canvas.scale(y3, y3);
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        y2 y2Var;
        int i10 = this.v;
        y2[] y2VarArr = this.f32025e;
        y2 y2Var2 = y2VarArr[i10];
        if (i10 < y2VarArr.length - 1) {
            y2Var = y2VarArr[i10 + 1];
        } else {
            y2Var = null;
        }
        float measuredWidth = (y2Var2.getMeasuredWidth() / 2) + y2Var2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (y2Var != null) {
            measuredWidth2 -= (((y2Var.getMeasuredWidth() / 2) + y2Var.getLeft()) - measuredWidth) * this.f32029s;
        }
        int i11 = 0;
        while (true) {
            float f7 = 0.7f;
            if (i11 >= y2VarArr.length) {
                break;
            }
            int i12 = this.v;
            float f10 = 0.9f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = this.f32029s;
                    f7 = 1.0f - (0.3f * f11);
                    f10 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = this.f32029s;
                    f7 = 0.7f + (0.3f * f12);
                    f10 = 0.9f + (f12 * 0.1f);
                }
            }
            y2VarArr[i11].setAlpha(f7);
            y2VarArr[i11].setScaleX(f10);
            y2VarArr[i11].setScaleY(f10);
            y2VarArr[i11].setTranslationX(measuredWidth2);
            i11++;
        }
        this.f32024c.invalidate();
        if (this.f32030w == 0) {
            y2VarArr[2].setAlpha(this.f32029s * 0.7f);
        }
        if (this.f32030w == 2) {
            float f13 = this.f32029s;
            if (f13 > 0.0f) {
                y2VarArr[0].setAlpha((1.0f - f13) * 0.7f);
            } else {
                y2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.f32030w == 1) {
            if (this.f32031x == 0) {
                y2VarArr[2].setAlpha(this.f32029s * 0.7f);
            }
            if (this.f32031x == 2) {
                y2VarArr[0].setAlpha((1.0f - this.f32029s) * 0.7f);
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
        org.telegram.messenger.voip.v0.a(this);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        if (!this.f32027n) {
            this.f32027n = true;
            if (this.f32030w != 0) {
                this.f32026f.animate().alpha(1.0f).setDuration(250L).start();
            }
        }
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        if (VoIPService.getSharedInstance() != null) {
            this.f32026f.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), 0);
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.v0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.v0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.v0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        org.telegram.messenger.voip.v0.g(this, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.v0.h(this, z10);
    }

    public void setBottomPadding(int i10) {
        ((FrameLayout.LayoutParams) this.f32024c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(80.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
    }
}
