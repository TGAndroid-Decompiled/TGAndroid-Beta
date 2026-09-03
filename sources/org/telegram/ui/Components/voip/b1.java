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
import k7.c6;
import oh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.b4;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv;
import org.telegram.ui.Components.y51;
import org.telegram.ui.bi1;
import org.telegram.ui.ii1;
import org.telegram.ui.ob1;
import org.webrtc.RendererCommon;
public abstract class b1 extends FrameLayout implements VoIPService.StateListener {
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
    public final fc0 O;
    public final fc0 P;
    public final GestureDetector Q;
    public ValueAnimator R;
    public boolean f31970a;
    public final eg.s2 f31971b;
    public final z0 f31972c;
    public final ob1 d;
    public final y2[] f31973e;
    public final t2 f31974f;
    public int h;
    public boolean f31975n;
    public final org.telegram.ui.ActionBar.k f31976r;
    public float f31977s;
    public int v;
    public int f31978w;
    public int f31979x;
    public float f31980y;

    public b1(Context context, float f10, float f11) {
        super(context);
        String string;
        this.h = 1;
        this.f31979x = -1;
        this.f31980y = 0.0f;
        this.B = 0.0f;
        this.C = 0.0f;
        this.H = new Path();
        this.I = new Camera();
        this.J = new Matrix();
        this.K = new Matrix();
        this.M = new a9.a(80, 80);
        this.N = new a9.a(80, 80);
        this.O = new fc0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.P = new fc0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.F = f10;
        this.G = f11;
        this.f31973e = new y2[3];
        bi1 bi1Var = (bi1) this;
        this.Q = new GestureDetector(context, new y0(bi1Var));
        eg.s2 s2Var = new eg.s2(bi1Var, context, 29);
        this.f31971b = s2Var;
        s2Var.setClickable(true);
        addView(s2Var, c6.c(-1.0f, -1));
        t2 t2Var = new t2(context, false, false);
        this.f31974f = t2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        s2 s2Var2 = t2Var.d;
        s2Var2.setScalingType(scalingType);
        t2Var.U = 1;
        t2Var.W = true;
        s2Var2.setAlpha(0.0f);
        s2Var2.setRotateTextureWithScreen(true);
        s2Var2.setUseCameraRotation(true);
        addView(t2Var, c6.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.f31976r = kVar;
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(false));
        kVar.setBackgroundColor(0);
        kVar.C(k6.w0(null, k6.f21743hg, false), false);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new y51(bi1Var, 2));
        addView(kVar);
        z0 z0Var = new z0(bi1Var, getContext());
        this.f31972c = z0Var;
        z0Var.setMaxLines(1);
        z0Var.setEllipsize(null);
        z0Var.setMinWidth(AndroidUtilities.dp(64.0f));
        z0Var.setTag(-1);
        z0Var.setTextSize(1, 14.0f);
        int i10 = k6.f21850ng;
        z0Var.setTextColor(k6.w0(null, i10, false));
        z0Var.setGravity(17);
        z0Var.setTypeface(AndroidUtilities.bold());
        z0Var.getPaint().setTextAlign(Paint.Align.CENTER);
        z0Var.setContentDescription(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(8.0f);
            int k10 = i0.a.k(k6.w0(null, i10, false), 76);
            z0Var.setForeground(k6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        z0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        z0Var.setOnClickListener(new o(bi1Var, 2));
        addView(z0Var, c6.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        ob1 ob1Var = new ob1(bi1Var, context, 13);
        this.d = ob1Var;
        ob1Var.setClipChildren(false);
        addView(ob1Var, c6.e(-1, 64, 80));
        for (int i11 = 0; i11 < this.f31973e.length; i11++) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.VoipPhoneScreen);
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.VoipFrontCamera);
            } else {
                string = LocaleController.getString(R.string.VoipBackCamera);
            }
            this.f31973e[i11] = new y2(context, string);
            this.f31973e[i11].setContentDescription(string);
            this.f31973e[i11].setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.d.addView(this.f31973e[i11], c6.n(-2, -1));
            this.f31973e[i11].setOnClickListener(new mh.x0(bi1Var, i11, 13));
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f31974f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f31974f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.f31974f.d, false);
        }
        eg.s2 s2Var3 = this.f31971b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new fc0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView, c6.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        y3.t(textView, -1, 1, 15.0f);
        frameLayout.addView(textView, c6.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        s2Var3.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(R.drawable.icplaceholder);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        s2Var3.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new pv(bi1Var, f10, f11, 1));
        ofFloat.addListener(new f91(bi1Var, 4));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new f5(bi1Var, 4));
        pr prVar = pr.f30168f;
        ofFloat.setInterpolator(prVar);
        long j10 = 320;
        ofFloat.setDuration(j10);
        ofFloat.start();
        ofFloat2.setInterpolator(prVar);
        ofFloat2.setDuration(j10);
        ofFloat2.setStartDelay(32);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.f31972c.setTranslationY(AndroidUtilities.dp(53.0f));
        this.f31972c.setTranslationX((f10 - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f));
        this.f31972c.animate().translationY(0.0f).translationX(0.0f).setDuration(j10).start();
        this.L = true;
        c(1, false);
    }

    public final void a(boolean z4, boolean z10) {
        if (!this.f31970a && this.f31980y == 1.0f) {
            bi1 bi1Var = (bi1) this;
            bi1Var.S.v.P = false;
            bi1Var.S.v.invalidate();
            this.f31970a = true;
            b();
            ii1 ii1Var = bi1Var.S;
            ii1Var.f37696l0 = null;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            ii1Var.f37703r0.setLockOnScreen(false);
            if (z10) {
                ii1Var.f37695k0 = true;
                if (sharedInstance != null && !z4) {
                    sharedInstance.requestVideoCall(false);
                    sharedInstance.setVideoState(false, 2);
                    sharedInstance.switchToSpeaker();
                }
                if (sharedInstance != null) {
                    ii1Var.v(ii1Var.f37684f, sharedInstance, true);
                }
            } else if (sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            ii1Var.f37698n0 = ii1Var.m0;
            ii1Var.H();
            if (bi1Var.S.f37693j0 && z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new w0(this, 0));
                ofFloat.setInterpolator(pr.f30168f);
                ofFloat.setStartDelay(60L);
                ofFloat.setDuration(350L);
                ofFloat.addListener(new x0(this, 2));
                ofFloat.start();
                this.f31972c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.f31976r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            } else if (z10) {
                animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(pr.f30168f).setListener(new x0(this, 0));
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat2.addUpdateListener(new w0(this, 1));
                ofFloat2.addListener(new x0(this, 1));
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new w0(this, 2));
                pr prVar = pr.f30168f;
                ofFloat2.setInterpolator(prVar);
                long j10 = 320;
                ofFloat2.setDuration(j10);
                ofFloat2.start();
                ofFloat3.setInterpolator(prVar);
                ofFloat3.setDuration(j10);
                ofFloat3.start();
                this.d.setAlpha(1.0f);
                this.d.setScaleY(1.0f);
                this.d.setScaleX(1.0f);
                this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                float f10 = 320;
                this.f31972c.animate().translationY(AndroidUtilities.dp(53.0f)).translationX((this.F - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f)).setDuration(0.6f * f10).start();
                animate().alpha(0.0f).setDuration(0.25f * f10).setStartDelay(f10 * 0.75f).start();
            }
            invalidate();
        }
    }

    public final void b() {
        t2 t2Var = this.f31974f;
        if (this.f31975n) {
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
                        View findViewWithTag = this.f31971b.findViewWithTag("image_stab");
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
        if (this.v != i10 && (i11 = this.f31978w) != i10) {
            t2 t2Var = this.f31974f;
            if (z4) {
                if (i11 == 0) {
                    if (this.h != i10) {
                        this.h = i10;
                        this.f31975n = false;
                        d(true, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().switchCamera();
                        }
                    } else {
                        d(false, false);
                        t2Var.animate().alpha(1.0f).setDuration(250L).start();
                    }
                } else if (i10 == 0) {
                    this.f31971b.findViewWithTag("screencast_stub").setVisibility(0);
                    b();
                    d(false, false);
                    t2Var.animate().alpha(0.0f).setDuration(250L).start();
                } else {
                    b();
                    this.h = i10;
                    this.f31975n = false;
                    d(true, false);
                    t2Var.animate().alpha(0.0f).setDuration(250L).start();
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().switchCamera();
                    }
                }
                int i12 = this.f31978w;
                if (i10 > i12) {
                    this.f31979x = i12;
                    this.f31978w = i12 + 1;
                    this.R = ValueAnimator.ofFloat(0.1f, 1.0f);
                } else {
                    this.f31979x = i12;
                    this.f31978w = i12 - 1;
                    this.v = i10;
                    this.R = ValueAnimator.ofFloat(1.0f, 0.0f);
                }
                this.R.addUpdateListener(new w0(this, 3));
                this.R.addListener(new b4(this, i10, 8));
                this.R.setInterpolator(pr.f30168f);
                this.R.setDuration(350L);
                this.R.start();
                return;
            }
            this.f31978w = i10;
            this.v = i10;
            this.f31977s = 0.0f;
            e();
            t2Var.setVisibility(0);
            this.f31975n = false;
            this.h = 1;
            d(true, false);
        }
    }

    public final void d(boolean z4, boolean z10) {
        Bitmap bitmap;
        ImageView imageView = (ImageView) this.f31971b.findViewWithTag("image_stab");
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
        float f10 = this.f31980y;
        Path path = this.H;
        if (f10 < 1.0f) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            int i11 = point.y + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight;
            float dp = AndroidUtilities.dp(28.0f) - (AndroidUtilities.dp(28.0f) * this.f31980y);
            path.reset();
            float f11 = this.F;
            float f12 = this.G;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f11 + AndroidUtilities.dp(33.5f), f12 + AndroidUtilities.dp(26.6f), AndroidUtilities.dp(26.0f), direction);
            int dp2 = AndroidUtilities.dp(52.0f);
            int dp3 = AndroidUtilities.dp(52.0f);
            int lerp = AndroidUtilities.lerp(dp2, i10, this.f31980y);
            int lerp2 = AndroidUtilities.lerp(dp3, i11, this.f31980y);
            float dp4 = this.D - ((1.0f - this.f31980y) * AndroidUtilities.dp(20.0f));
            float dp5 = this.E - ((1.0f - this.f31980y) * AndroidUtilities.dp(51.0f));
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
        y2 y2Var;
        int i10 = this.v;
        y2[] y2VarArr = this.f31973e;
        y2 y2Var2 = y2VarArr[i10];
        if (i10 < y2VarArr.length - 1) {
            y2Var = y2VarArr[i10 + 1];
        } else {
            y2Var = null;
        }
        float measuredWidth = (y2Var2.getMeasuredWidth() / 2) + y2Var2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (y2Var != null) {
            measuredWidth2 -= (((y2Var.getMeasuredWidth() / 2) + y2Var.getLeft()) - measuredWidth) * this.f31977s;
        }
        int i11 = 0;
        while (true) {
            float f10 = 0.7f;
            if (i11 >= y2VarArr.length) {
                break;
            }
            int i12 = this.v;
            float f11 = 0.9f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f12 = this.f31977s;
                    f10 = 1.0f - (0.3f * f12);
                    f11 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.f31977s;
                    f10 = 0.7f + (0.3f * f13);
                    f11 = 0.9f + (f13 * 0.1f);
                }
            }
            y2VarArr[i11].setAlpha(f10);
            y2VarArr[i11].setScaleX(f11);
            y2VarArr[i11].setScaleY(f11);
            y2VarArr[i11].setTranslationX(measuredWidth2);
            i11++;
        }
        this.f31972c.invalidate();
        if (this.f31978w == 0) {
            y2VarArr[2].setAlpha(this.f31977s * 0.7f);
        }
        if (this.f31978w == 2) {
            float f14 = this.f31977s;
            if (f14 > 0.0f) {
                y2VarArr[0].setAlpha((1.0f - f14) * 0.7f);
            } else {
                y2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.f31978w == 1) {
            if (this.f31979x == 0) {
                y2VarArr[2].setAlpha(this.f31977s * 0.7f);
            }
            if (this.f31979x == 2) {
                y2VarArr[0].setAlpha((1.0f - this.f31977s) * 0.7f);
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
        if (!this.f31975n) {
            this.f31975n = true;
            if (this.f31978w != 0) {
                this.f31974f.animate().alpha(1.0f).setDuration(250L).start();
            }
        }
    }

    @Override
    public final void onCameraSwitch(boolean z4) {
        if (VoIPService.getSharedInstance() != null) {
            this.f31974f.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
        ((FrameLayout.LayoutParams) this.f31972c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(80.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
    }
}
