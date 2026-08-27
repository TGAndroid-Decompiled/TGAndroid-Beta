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
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import h7.z5;
import java.io.File;
import java.io.FileOutputStream;
import lh.c5;
import lh.ha;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.eh1;
import org.telegram.ui.lh1;
import org.telegram.ui.ra1;
import org.telegram.ui.zp;
import org.webrtc.RendererCommon;

public abstract class a1 extends FrameLayout implements VoIPService.StateListener {
    public float A;
    public float B;
    public float C;
    public float D;
    public final float E;
    public final float F;
    public final Path G;
    public final Camera H;
    public final Matrix I;
    public final Matrix J;
    public final boolean K;
    public final com.google.firebase.messaging.m L;
    public final com.google.firebase.messaging.m M;
    public final nb0 N;
    public final nb0 O;
    public final GestureDetector P;
    public ValueAnimator Q;

    public boolean f33475a;

    public final ag.p1 f33476b;

    public final y0 f33477c;
    public final ra1 d;

    public final w2[] f33478e;

    public final r2 f33479f;
    public int h;

    public boolean f33480n;

    public final org.telegram.ui.ActionBar.k f33481r;

    public float f33482s;
    public int v;

    public int f33483w;

    public int f33484x;

    public float f33485y;

    public a1(Context context, float f10, float f11) {
        super(context);
        this.h = 1;
        this.f33484x = -1;
        this.f33485y = 0.0f;
        this.A = 0.0f;
        this.B = 0.0f;
        this.G = new Path();
        this.H = new Camera();
        this.I = new Matrix();
        this.J = new Matrix();
        this.L = new com.google.firebase.messaging.m(80, 80);
        this.M = new com.google.firebase.messaging.m(80, 80);
        this.N = new nb0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.O = new nb0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.E = f10;
        this.F = f11;
        this.f33478e = new w2[3];
        eh1 eh1Var = (eh1) this;
        this.P = new GestureDetector(context, new x0(eh1Var));
        ag.p1 p1Var = new ag.p1(eh1Var, context, 29);
        this.f33476b = p1Var;
        p1Var.setClickable(true);
        addView(p1Var, z5.c(-1.0f, -1));
        r2 r2Var = new r2(context, false, false);
        this.f33479f = r2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        q2 q2Var = r2Var.d;
        q2Var.setScalingType(scalingType);
        r2Var.T = 1;
        r2Var.V = true;
        q2Var.setAlpha(0.0f);
        q2Var.setRotateTextureWithScreen(true);
        q2Var.setUseCameraRotation(true);
        addView(r2Var, z5.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.f33481r = kVar;
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        kVar.setBackgroundColor(0);
        kVar.D(g6.w0(null, g6.f23135hg, false), false);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new zp(eh1Var, 11));
        addView(kVar);
        y0 y0Var = new y0(eh1Var, getContext());
        this.f33477c = y0Var;
        y0Var.setMaxLines(1);
        y0Var.setEllipsize(null);
        y0Var.setMinWidth(AndroidUtilities.dp(64.0f));
        y0Var.setTag(-1);
        y0Var.setTextSize(1, 14.0f);
        int i10 = g6.f23242ng;
        y0Var.setTextColor(g6.w0(null, i10, false));
        y0Var.setGravity(17);
        y0Var.setTypeface(AndroidUtilities.bold());
        y0Var.getPaint().setTextAlign(Paint.Align.CENTER);
        y0Var.setContentDescription(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int iDp = AndroidUtilities.dp(8.0f);
            int iK = i0.b.k(g6.w0(null, i10, false), 76);
            y0Var.setForeground(g6.i0(iDp, iDp, iDp, iDp, 0, iK, iK));
        }
        y0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        y0Var.setOnClickListener(new c5(eh1Var, 12));
        addView(y0Var, z5.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        ra1 ra1Var = new ra1(eh1Var, context, 14);
        this.d = ra1Var;
        ra1Var.setClipChildren(false);
        addView(ra1Var, z5.e(-1, 64, 80));
        int i11 = 0;
        while (i11 < this.f33478e.length) {
            String string = i11 == 0 ? LocaleController.getString(R.string.VoipPhoneScreen) : i11 == 1 ? LocaleController.getString(R.string.VoipFrontCamera) : LocaleController.getString(R.string.VoipBackCamera);
            this.f33478e[i11] = new w2(context, string);
            this.f33478e[i11].setContentDescription(string);
            this.f33478e[i11].setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.d.addView(this.f33478e[i11], z5.n(-2, -1));
            this.f33478e[i11].setOnClickListener(new hh.z0(eh1Var, i11, 15));
            i11++;
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f33479f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f33479f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new z0());
            sharedInstance.setLocalSink(this.f33479f.d, false);
        }
        ag.p1 p1Var2 = this.f33476b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new nb0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView, z5.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.messenger.y1.s(textView, -1, 1, 15.0f);
        frameLayout.addView(textView, z5.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        p1Var2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(R.drawable.icplaceholder);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        p1Var2.addView(imageView2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ha(eh1Var, f10, f11, 2));
        valueAnimatorOfFloat.addListener(new f11(eh1Var, 13));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new lh.m2(eh1Var, 11));
        er erVar = er.f28122f;
        valueAnimatorOfFloat.setInterpolator(erVar);
        long j10 = 320;
        valueAnimatorOfFloat.setDuration(j10);
        valueAnimatorOfFloat.start();
        valueAnimatorOfFloat2.setInterpolator(erVar);
        valueAnimatorOfFloat2.setDuration(j10);
        valueAnimatorOfFloat2.setStartDelay(32);
        valueAnimatorOfFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.f33477c.setTranslationY(AndroidUtilities.dp(53.0f));
        this.f33477c.setTranslationX((f10 - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f));
        this.f33477c.animate().translationY(0.0f).translationX(0.0f).setDuration(j10).start();
        this.K = true;
        c(1, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f33475a || this.f33485y != 1.0f) {
            return;
        }
        eh1 eh1Var = (eh1) this;
        int i10 = 0;
        eh1Var.R.v.O = false;
        eh1Var.R.v.invalidate();
        int i11 = 1;
        this.f33475a = true;
        b();
        lh1 lh1Var = eh1Var.R;
        lh1Var.f40113k0 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        lh1Var.f40119q0.setLockOnScreen(false);
        int i12 = 2;
        if (z11) {
            lh1Var.f40112j0 = true;
            if (sharedInstance != null && !z10) {
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.switchToSpeaker();
            }
            if (sharedInstance != null) {
                lh1Var.v(lh1Var.f40103f, sharedInstance, true);
            }
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        lh1Var.m0 = lh1Var.f40114l0;
        lh1Var.H();
        if (eh1Var.R.f40110i0 && z11) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new v0(this, i10));
            valueAnimatorOfFloat.setInterpolator(er.f28122f);
            valueAnimatorOfFloat.setStartDelay(60L);
            valueAnimatorOfFloat.setDuration(350L);
            valueAnimatorOfFloat.addListener(new w0(this, 2));
            valueAnimatorOfFloat.start();
            this.f33477c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            this.f33481r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
        } else if (z11) {
            animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(er.f28122f).setListener(new w0(this, 0));
        } else {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(new v0(this, i11));
            valueAnimatorOfFloat2.addListener(new w0(this, 1));
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(new v0(this, i12));
            er erVar = er.f28122f;
            valueAnimatorOfFloat2.setInterpolator(erVar);
            long j10 = 320;
            valueAnimatorOfFloat2.setDuration(j10);
            valueAnimatorOfFloat2.start();
            valueAnimatorOfFloat3.setInterpolator(erVar);
            valueAnimatorOfFloat3.setDuration(j10);
            valueAnimatorOfFloat3.start();
            this.d.setAlpha(1.0f);
            this.d.setScaleY(1.0f);
            this.d.setScaleX(1.0f);
            this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
            float f10 = 320;
            this.f33477c.animate().translationY(AndroidUtilities.dp(53.0f)).translationX((this.E - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f)).setDuration((long) (0.6f * f10)).start();
            animate().alpha(0.0f).setDuration((long) (0.25f * f10)).setStartDelay((long) (f10 * 0.75f)).start();
        }
        invalidate();
    }

    public final void b() {
        r2 r2Var = this.f33479f;
        if (this.f33480n) {
            try {
                Bitmap bitmap = r2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), r2Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 80, (int) (bitmapCreateBitmap.getHeight() / (bitmapCreateBitmap.getWidth() / 80.0f)), true);
                    if (bitmapCreateScaledBitmap != null) {
                        if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                            bitmapCreateBitmap.recycle();
                        }
                        Utilities.blurBitmap(bitmapCreateScaledBitmap, 7);
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb" + this.h + ".jpg"));
                        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        fileOutputStream.close();
                        View viewFindViewWithTag = this.f33476b.findViewWithTag("image_stab");
                        if (viewFindViewWithTag instanceof ImageView) {
                            ((ImageView) viewFindViewWithTag).setImageBitmap(bitmapCreateScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void c(int i10, boolean z10) {
        int i11;
        if (this.v == i10 || (i11 = this.f33483w) == i10) {
            return;
        }
        r2 r2Var = this.f33479f;
        if (!z10) {
            this.f33483w = i10;
            this.v = i10;
            this.f33482s = 0.0f;
            e();
            r2Var.setVisibility(0);
            this.f33480n = false;
            this.h = 1;
            d(true, false);
            return;
        }
        if (i11 == 0) {
            if (this.h != i10) {
                this.h = i10;
                this.f33480n = false;
                d(true, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().switchCamera();
                }
            } else {
                d(false, false);
                r2Var.animate().alpha(1.0f).setDuration(250L).start();
            }
        } else if (i10 == 0) {
            this.f33476b.findViewWithTag("screencast_stub").setVisibility(0);
            b();
            d(false, false);
            r2Var.animate().alpha(0.0f).setDuration(250L).start();
        } else {
            b();
            this.h = i10;
            this.f33480n = false;
            d(true, false);
            r2Var.animate().alpha(0.0f).setDuration(250L).start();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().switchCamera();
            }
        }
        int i12 = this.f33483w;
        if (i10 > i12) {
            this.f33484x = i12;
            this.f33483w = i12 + 1;
            this.Q = ValueAnimator.ofFloat(0.1f, 1.0f);
        } else {
            this.f33484x = i12;
            this.f33483w = i12 - 1;
            this.v = i10;
            this.Q = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        this.Q.addUpdateListener(new v0(this, 3));
        this.Q.addListener(new nh.n2(this, i10, 10));
        this.Q.setInterpolator(er.f28122f);
        this.Q.setDuration(350L);
        this.Q.start();
    }

    public final void d(boolean z10, boolean z11) {
        Bitmap bitmapDecodeFile;
        ImageView imageView = (ImageView) this.f33476b.findViewWithTag("image_stab");
        if (!z10) {
            imageView.setVisibility(8);
            return;
        }
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb" + this.h + ".jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmapDecodeFile = null;
        }
        if (bitmapDecodeFile == null || bitmapDecodeFile.getPixel(0, 0) == 0) {
            imageView.setImageResource(R.drawable.icplaceholder);
        } else {
            imageView.setImageBitmap(bitmapDecodeFile);
        }
        if (!z11) {
            imageView.setAlpha(1.0f);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.animate().alpha(1.0f).setDuration(250L).start();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10 = this.f33485y;
        Path path = this.G;
        if (f10 < 1.0f) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            int i11 = point.y + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight;
            float fDp = AndroidUtilities.dp(28.0f) - (AndroidUtilities.dp(28.0f) * this.f33485y);
            path.reset();
            float fDp2 = this.E + AndroidUtilities.dp(33.5f);
            float fDp3 = this.F + AndroidUtilities.dp(26.6f);
            float fDp4 = AndroidUtilities.dp(26.0f);
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(fDp2, fDp3, fDp4, direction);
            int iDp = AndroidUtilities.dp(52.0f);
            int iDp2 = AndroidUtilities.dp(52.0f);
            int iLerp = AndroidUtilities.lerp(iDp, i10, this.f33485y);
            int iLerp2 = AndroidUtilities.lerp(iDp2, i11, this.f33485y);
            float fDp5 = this.C - ((1.0f - this.f33485y) * AndroidUtilities.dp(20.0f));
            float fDp6 = this.D - ((1.0f - this.f33485y) * AndroidUtilities.dp(51.0f));
            path.addRoundRect(fDp5, fDp6, iLerp + fDp5, fDp6 + iLerp2, fDp, fDp, direction);
            canvas.clipPath(path);
        }
        if (this.B > 0.0f) {
            int[] floatingViewLocation = getFloatingViewLocation();
            float f11 = this.B;
            int i12 = (int) (floatingViewLocation[0] * f11);
            int i13 = (int) (floatingViewLocation[1] * f11);
            int i14 = floatingViewLocation[2];
            int i15 = AndroidUtilities.displaySize.x;
            float fZ = com.google.android.recaptcha.internal.a.z(1.0f, f11, i15 - i14, i14) / i15;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * fZ, getHeight() * fZ, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.translate(i12, i13);
            canvas.clipPath(path);
            canvas.scale(fZ, fZ);
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i10 = this.v;
        w2[] w2VarArr = this.f33478e;
        w2 w2Var = w2VarArr[i10];
        w2 w2Var2 = i10 < w2VarArr.length - 1 ? w2VarArr[i10 + 1] : null;
        float measuredWidth = (w2Var.getMeasuredWidth() / 2) + w2Var.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (w2Var2 != null) {
            measuredWidth2 -= (((w2Var2.getMeasuredWidth() / 2) + w2Var2.getLeft()) - measuredWidth) * this.f33482s;
        }
        int i11 = 0;
        while (true) {
            float f10 = 0.7f;
            if (i11 >= w2VarArr.length) {
                break;
            }
            int i12 = this.v;
            float f11 = 0.9f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f12 = this.f33482s;
                    f10 = 1.0f - (0.3f * f12);
                    f11 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.f33482s;
                    f10 = 0.7f + (0.3f * f13);
                    f11 = 0.9f + (f13 * 0.1f);
                }
            }
            w2VarArr[i11].setAlpha(f10);
            w2VarArr[i11].setScaleX(f11);
            w2VarArr[i11].setScaleY(f11);
            w2VarArr[i11].setTranslationX(measuredWidth2);
            i11++;
        }
        this.f33477c.invalidate();
        if (this.f33483w == 0) {
            w2VarArr[2].setAlpha(this.f33482s * 0.7f);
        }
        if (this.f33483w == 2) {
            float f14 = this.f33482s;
            if (f14 > 0.0f) {
                w2VarArr[0].setAlpha((1.0f - f14) * 0.7f);
            } else {
                w2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.f33483w == 1) {
            if (this.f33484x == 0) {
                w2VarArr[2].setAlpha(this.f33482s * 0.7f);
            }
            if (this.f33484x == 2) {
                w2VarArr[0].setAlpha((1.0f - this.f33482s) * 0.7f);
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
        org.telegram.messenger.voip.u0.a(this);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        if (this.f33480n) {
            return;
        }
        this.f33480n = true;
        if (this.f33483w != 0) {
            this.f33479f.animate().alpha(1.0f).setDuration(250L).start();
        }
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        if (VoIPService.getSharedInstance() != null) {
            this.f33479f.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
        org.telegram.messenger.voip.u0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.u0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        org.telegram.messenger.voip.u0.g(this, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public void setBottomPadding(int i10) {
        ((FrameLayout.LayoutParams) this.f33477c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(80.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
    }
}
