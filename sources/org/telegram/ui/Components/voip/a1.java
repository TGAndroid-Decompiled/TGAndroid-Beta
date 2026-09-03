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
import java.io.File;
import java.io.FileOutputStream;
import k7.b6;
import nh.e5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a4;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.y51;
import org.telegram.ui.bi1;
import org.telegram.ui.ii1;
import org.telegram.ui.pb1;
import org.webrtc.RendererCommon;
public abstract class a1 extends FrameLayout implements VoIPService.StateListener {
    public float B;
    public float C;
    public float D;
    public float E;
    public final float F;
    public final float G;
    public final Path H;
    public final Camera I;
    public final Matrix J;
    public final Matrix K;
    public final boolean L;
    public final a9.a M;
    public final a9.a N;
    public final ec0 O;
    public final ec0 P;
    public final GestureDetector Q;
    public ValueAnimator R;
    public boolean f29525a;
    public final dg.u2 f29526b;
    public final y0 f29527c;
    public final pb1 d;
    public final x2[] e;
    public final s2 f29528f;
    public int h;
    public boolean f29529n;
    public final org.telegram.ui.ActionBar.k f29530r;
    public float f29531s;
    public int v;
    public int f29532w;
    public int f29533x;
    public float f29534y;

    public a1(Context context, float f10, float f11) {
        super(context);
        String string;
        this.h = 1;
        this.f29533x = -1;
        this.f29534y = 0.0f;
        this.B = 0.0f;
        this.C = 0.0f;
        this.H = new Path();
        this.I = new Camera();
        this.J = new Matrix();
        this.K = new Matrix();
        this.M = new a9.a(80, 80);
        this.N = new a9.a(80, 80);
        this.O = new ec0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.P = new ec0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.F = f10;
        this.G = f11;
        this.e = new x2[3];
        bi1 bi1Var = (bi1) this;
        this.Q = new GestureDetector(context, new x0(bi1Var));
        dg.u2 u2Var = new dg.u2(bi1Var, context, 29);
        this.f29526b = u2Var;
        u2Var.setClickable(true);
        addView(u2Var, b6.c(-1.0f, -1));
        s2 s2Var = new s2(context, false, false);
        this.f29528f = s2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        r2 r2Var = s2Var.d;
        r2Var.setScalingType(scalingType);
        s2Var.U = 1;
        s2Var.W = true;
        r2Var.setAlpha(0.0f);
        r2Var.setRotateTextureWithScreen(true);
        r2Var.setUseCameraRotation(true);
        addView(s2Var, b6.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.f29530r = kVar;
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(false));
        kVar.setBackgroundColor(0);
        kVar.C(j6.w0(null, j6.f19962hg, false), false);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new y51(bi1Var, 2));
        addView(kVar);
        y0 y0Var = new y0(bi1Var, getContext());
        this.f29527c = y0Var;
        y0Var.setMaxLines(1);
        y0Var.setEllipsize(null);
        y0Var.setMinWidth(AndroidUtilities.dp(64.0f));
        y0Var.setTag(-1);
        y0Var.setTextSize(1, 14.0f);
        int i10 = j6.f20069ng;
        y0Var.setTextColor(j6.w0(null, i10, false));
        y0Var.setGravity(17);
        y0Var.setTypeface(AndroidUtilities.bold());
        y0Var.getPaint().setTextAlign(Paint.Align.CENTER);
        y0Var.setContentDescription(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(8.0f);
            int k10 = i0.a.k(j6.w0(null, i10, false), 76);
            y0Var.setForeground(j6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        y0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        y0Var.setOnClickListener(new oh.n(bi1Var, 3));
        addView(y0Var, b6.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        pb1 pb1Var = new pb1(bi1Var, context, 13);
        this.d = pb1Var;
        pb1Var.setClipChildren(false);
        addView(pb1Var, b6.e(-1, 64, 80));
        for (int i11 = 0; i11 < this.e.length; i11++) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.VoipPhoneScreen);
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.VoipFrontCamera);
            } else {
                string = LocaleController.getString(R.string.VoipBackCamera);
            }
            this.e[i11] = new x2(context, string);
            this.e[i11].setContentDescription(string);
            this.e[i11].setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.d.addView(this.e[i11], b6.n(-2, -1));
            this.e[i11].setOnClickListener(new lh.y0(bi1Var, i11, 13));
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f29528f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f29528f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.f29528f.d, false);
        }
        dg.u2 u2Var2 = this.f29526b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new ec0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView, b6.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        y3.t(textView, -1, 1, 15.0f);
        frameLayout.addView(textView, b6.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        u2Var2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(R.drawable.icplaceholder);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        u2Var2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new mv(bi1Var, f10, f11, 1));
        ofFloat.addListener(new f91(bi1Var, 4));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new e5(bi1Var, 5));
        mr mrVar = mr.f27122f;
        ofFloat.setInterpolator(mrVar);
        long j10 = 320;
        ofFloat.setDuration(j10);
        ofFloat.start();
        ofFloat2.setInterpolator(mrVar);
        ofFloat2.setDuration(j10);
        ofFloat2.setStartDelay(32);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.f29527c.setTranslationY(AndroidUtilities.dp(53.0f));
        this.f29527c.setTranslationX((f10 - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f));
        this.f29527c.animate().translationY(0.0f).translationX(0.0f).setDuration(j10).start();
        this.L = true;
        c(1, false);
    }

    public final void a(boolean z4, boolean z10) {
        if (!this.f29525a && this.f29534y == 1.0f) {
            bi1 bi1Var = (bi1) this;
            bi1Var.S.v.P = false;
            bi1Var.S.v.invalidate();
            this.f29525a = true;
            b();
            ii1 ii1Var = bi1Var.S;
            ii1Var.f34969l0 = null;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            ii1Var.f34976r0.setLockOnScreen(false);
            if (z10) {
                ii1Var.f34968k0 = true;
                if (sharedInstance != null && !z4) {
                    sharedInstance.requestVideoCall(false);
                    sharedInstance.setVideoState(false, 2);
                    sharedInstance.switchToSpeaker();
                }
                if (sharedInstance != null) {
                    ii1Var.v(ii1Var.f34957f, sharedInstance, true);
                }
            } else if (sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            ii1Var.f34971n0 = ii1Var.m0;
            ii1Var.H();
            if (bi1Var.S.f34966j0 && z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new v0(this, 0));
                ofFloat.setInterpolator(mr.f27122f);
                ofFloat.setStartDelay(60L);
                ofFloat.setDuration(350L);
                ofFloat.addListener(new w0(this, 2));
                ofFloat.start();
                this.f29527c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.f29530r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            } else if (z10) {
                animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(mr.f27122f).setListener(new w0(this, 0));
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat2.addUpdateListener(new v0(this, 1));
                ofFloat2.addListener(new w0(this, 1));
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new v0(this, 2));
                mr mrVar = mr.f27122f;
                ofFloat2.setInterpolator(mrVar);
                long j10 = 320;
                ofFloat2.setDuration(j10);
                ofFloat2.start();
                ofFloat3.setInterpolator(mrVar);
                ofFloat3.setDuration(j10);
                ofFloat3.start();
                this.d.setAlpha(1.0f);
                this.d.setScaleY(1.0f);
                this.d.setScaleX(1.0f);
                this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                float f10 = 320;
                this.f29527c.animate().translationY(AndroidUtilities.dp(53.0f)).translationX((this.F - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f)).setDuration(0.6f * f10).start();
                animate().alpha(0.0f).setDuration(0.25f * f10).setStartDelay(f10 * 0.75f).start();
            }
            invalidate();
        }
    }

    public final void b() {
        s2 s2Var = this.f29528f;
        if (this.f29529n) {
            try {
                Bitmap bitmap = s2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), s2Var.d.getMatrix(), true);
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
                        View findViewWithTag = this.f29526b.findViewWithTag("image_stab");
                        if (findViewWithTag instanceof ImageView) {
                            ((ImageView) findViewWithTag).setImageBitmap(createScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void c(int i10, boolean z4) {
        int i11;
        if (this.v != i10 && (i11 = this.f29532w) != i10) {
            s2 s2Var = this.f29528f;
            if (z4) {
                if (i11 == 0) {
                    if (this.h != i10) {
                        this.h = i10;
                        this.f29529n = false;
                        d(true, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().switchCamera();
                        }
                    } else {
                        d(false, false);
                        s2Var.animate().alpha(1.0f).setDuration(250L).start();
                    }
                } else if (i10 == 0) {
                    this.f29526b.findViewWithTag("screencast_stub").setVisibility(0);
                    b();
                    d(false, false);
                    s2Var.animate().alpha(0.0f).setDuration(250L).start();
                } else {
                    b();
                    this.h = i10;
                    this.f29529n = false;
                    d(true, false);
                    s2Var.animate().alpha(0.0f).setDuration(250L).start();
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().switchCamera();
                    }
                }
                int i12 = this.f29532w;
                if (i10 > i12) {
                    this.f29533x = i12;
                    this.f29532w = i12 + 1;
                    this.R = ValueAnimator.ofFloat(0.1f, 1.0f);
                } else {
                    this.f29533x = i12;
                    this.f29532w = i12 - 1;
                    this.v = i10;
                    this.R = ValueAnimator.ofFloat(1.0f, 0.0f);
                }
                this.R.addUpdateListener(new v0(this, 3));
                this.R.addListener(new a4(this, i10, 8));
                this.R.setInterpolator(mr.f27122f);
                this.R.setDuration(350L);
                this.R.start();
                return;
            }
            this.f29532w = i10;
            this.v = i10;
            this.f29531s = 0.0f;
            e();
            s2Var.setVisibility(0);
            this.f29529n = false;
            this.h = 1;
            d(true, false);
        }
    }

    public final void d(boolean z4, boolean z10) {
        Bitmap bitmap;
        ImageView imageView = (ImageView) this.f29526b.findViewWithTag("image_stab");
        if (!z4) {
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
        float f10 = this.f29534y;
        Path path = this.H;
        if (f10 < 1.0f) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            int i11 = point.y + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight;
            float dp = AndroidUtilities.dp(28.0f) - (AndroidUtilities.dp(28.0f) * this.f29534y);
            path.reset();
            float f11 = this.F;
            float f12 = this.G;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f11 + AndroidUtilities.dp(33.5f), f12 + AndroidUtilities.dp(26.6f), AndroidUtilities.dp(26.0f), direction);
            int dp2 = AndroidUtilities.dp(52.0f);
            int dp3 = AndroidUtilities.dp(52.0f);
            int lerp = AndroidUtilities.lerp(dp2, i10, this.f29534y);
            int lerp2 = AndroidUtilities.lerp(dp3, i11, this.f29534y);
            float dp4 = this.D - ((1.0f - this.f29534y) * AndroidUtilities.dp(20.0f));
            float dp5 = this.E - ((1.0f - this.f29534y) * AndroidUtilities.dp(51.0f));
            path.addRoundRect(dp4, dp5, lerp + dp4, dp5 + lerp2, dp, dp, direction);
            canvas.clipPath(path);
        }
        if (this.C > 0.0f) {
            int[] floatingViewLocation = getFloatingViewLocation();
            float f13 = this.C;
            int i12 = (int) (floatingViewLocation[0] * f13);
            int i13 = (int) (floatingViewLocation[1] * f13);
            int i14 = floatingViewLocation[2];
            int i15 = AndroidUtilities.displaySize.x;
            float w10 = e2.c.w(1.0f, f13, i15 - i14, i14) / i15;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * w10, getHeight() * w10, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.translate(i12, i13);
            canvas.clipPath(path);
            canvas.scale(w10, w10);
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        x2 x2Var;
        int i10 = this.v;
        x2[] x2VarArr = this.e;
        x2 x2Var2 = x2VarArr[i10];
        if (i10 < x2VarArr.length - 1) {
            x2Var = x2VarArr[i10 + 1];
        } else {
            x2Var = null;
        }
        float measuredWidth = (x2Var2.getMeasuredWidth() / 2) + x2Var2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (x2Var != null) {
            measuredWidth2 -= (((x2Var.getMeasuredWidth() / 2) + x2Var.getLeft()) - measuredWidth) * this.f29531s;
        }
        int i11 = 0;
        while (true) {
            float f10 = 0.7f;
            if (i11 >= x2VarArr.length) {
                break;
            }
            int i12 = this.v;
            float f11 = 0.9f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f12 = this.f29531s;
                    f10 = 1.0f - (0.3f * f12);
                    f11 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.f29531s;
                    f10 = 0.7f + (0.3f * f13);
                    f11 = 0.9f + (f13 * 0.1f);
                }
            }
            x2VarArr[i11].setAlpha(f10);
            x2VarArr[i11].setScaleX(f11);
            x2VarArr[i11].setScaleY(f11);
            x2VarArr[i11].setTranslationX(measuredWidth2);
            i11++;
        }
        this.f29527c.invalidate();
        if (this.f29532w == 0) {
            x2VarArr[2].setAlpha(this.f29531s * 0.7f);
        }
        if (this.f29532w == 2) {
            float f14 = this.f29531s;
            if (f14 > 0.0f) {
                x2VarArr[0].setAlpha((1.0f - f14) * 0.7f);
            } else {
                x2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.f29532w == 1) {
            if (this.f29533x == 0) {
                x2VarArr[2].setAlpha(this.f29531s * 0.7f);
            }
            if (this.f29533x == 2) {
                x2VarArr[0].setAlpha((1.0f - this.f29531s) * 0.7f);
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
        if (!this.f29529n) {
            this.f29529n = true;
            if (this.f29532w != 0) {
                this.f29528f.animate().alpha(1.0f).setDuration(250L).start();
            }
        }
    }

    @Override
    public final void onCameraSwitch(boolean z4) {
        if (VoIPService.getSharedInstance() != null) {
            this.f29528f.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
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
    public final void onScreenOnChange(boolean z4) {
        org.telegram.messenger.voip.v0.e(this, z4);
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
    public final void onVideoAvailableChange(boolean z4) {
        org.telegram.messenger.voip.v0.h(this, z4);
    }

    public void setBottomPadding(int i10) {
        ((FrameLayout.LayoutParams) this.f29527c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(80.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
    }
}
