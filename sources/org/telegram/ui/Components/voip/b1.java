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
import fi.e4;
import fi.fa;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.i31;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.ga;
import org.telegram.ui.kh1;
import org.telegram.ui.rh1;
import org.telegram.ui.za1;
import org.webrtc.RendererCommon;
public abstract class b1 extends FrameLayout implements VoIPService.StateListener {
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
    public final aa.m0 P;
    public final aa.m0 Q;
    public final vc0 R;
    public final vc0 S;
    public final GestureDetector T;
    public ValueAnimator U;
    public boolean f33839a;
    public final bh.r f33840b;
    public final z0 f33841c;
    public final za1 d;
    public final y2[] e;
    public final t2 f33842f;
    public int h;
    public boolean f33843n;
    public final org.telegram.ui.ActionBar.k f33844r;
    public float f33845s;
    public int v;
    public int f33846w;
    public int f33847x;
    public float f33848y;

    public b1(Context context, float f7, float f10) {
        super(context);
        String string;
        this.h = 1;
        this.f33847x = -1;
        this.f33848y = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.K = new Path();
        this.L = new Camera();
        this.M = new Matrix();
        this.N = new Matrix();
        this.P = new aa.m0(80, 80);
        this.Q = new aa.m0(80, 80);
        this.R = new vc0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.S = new vc0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.I = f7;
        this.J = f10;
        this.e = new y2[3];
        kh1 kh1Var = (kh1) this;
        this.T = new GestureDetector(context, new y0(kh1Var));
        bh.r rVar = new bh.r(kh1Var, context, 28);
        this.f33840b = rVar;
        rVar.setClickable(true);
        addView(rVar, kb1.g(-1.0f, -1));
        t2 t2Var = new t2(context, false, false);
        this.f33842f = t2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        s2 s2Var = t2Var.d;
        s2Var.setScalingType(scalingType);
        t2Var.f34218a0 = 1;
        t2Var.f34222c0 = true;
        s2Var.setAlpha(0.0f);
        s2Var.setRotateTextureWithScreen(true);
        s2Var.setUseCameraRotation(true);
        addView(t2Var, kb1.g(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.f33844r = kVar;
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        kVar.setBackgroundColor(0);
        f7.m(kVar, 1, y6.f23439hg, null);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new ga(kh1Var, 19));
        addView(kVar);
        z0 z0Var = new z0(kh1Var, getContext());
        this.f33841c = z0Var;
        z0Var.setMaxLines(1);
        z0Var.setEllipsize(null);
        z0Var.setMinWidth(AndroidUtilities.dp(64.0f));
        z0Var.setTag(-1);
        z0Var.setTextSize(1, 14.0f);
        int i10 = y6.f23551ng;
        f7.V(z0Var, i10, null);
        z0Var.setGravity(17);
        z0Var.setTypeface(AndroidUtilities.bold());
        z0Var.getPaint().setTextAlign(Paint.Align.CENTER);
        z0Var.setContentDescription(LocaleController.getString(R.string.VoipShareVideo));
        int dp = AndroidUtilities.dp(8.0f);
        int o10 = i0.a.o(y6.x0(null, i10, false), 76);
        z0Var.setForeground(y6.j0(dp, dp, dp, dp, 0, o10, o10));
        z0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        z0Var.setOnClickListener(new ig.d0(kh1Var, 14));
        addView(z0Var, kb1.h(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        za1 za1Var = new za1(kh1Var, context, 15);
        this.d = za1Var;
        za1Var.setClipChildren(false);
        addView(za1Var, kb1.i(-1, 64, 80));
        for (int i11 = 0; i11 < this.e.length; i11++) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.VoipPhoneScreen);
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.VoipFrontCamera);
            } else {
                string = LocaleController.getString(R.string.VoipBackCamera);
            }
            this.e[i11] = new y2(context, string);
            this.e[i11].setContentDescription(string);
            this.e[i11].setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.d.addView(this.e[i11], kb1.r(-2, -1));
            this.e[i11].setOnClickListener(new ai.w(kh1Var, i11, 22));
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f33842f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f33842f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.f33842f.d, false);
        }
        bh.r rVar2 = this.f33840b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new vc0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView, kb1.h(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, kb1.h(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        rVar2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(R.drawable.icplaceholder);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        rVar2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new fa(kh1Var, f7, f10, 3));
        ofFloat.addListener(new i31(kh1Var, 13));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new e4(kh1Var, 12));
        ds dsVar = ds.f27530f;
        ofFloat.setInterpolator(dsVar);
        long j10 = 320;
        ofFloat.setDuration(j10);
        ofFloat.start();
        ofFloat2.setInterpolator(dsVar);
        ofFloat2.setDuration(j10);
        ofFloat2.setStartDelay(32);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.f33841c.setTranslationY(AndroidUtilities.dp(53.0f));
        this.f33841c.setTranslationX((f7 - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f));
        this.f33841c.animate().translationY(0.0f).translationX(0.0f).setDuration(j10).start();
        this.O = true;
        c(1, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (!this.f33839a && this.f33848y == 1.0f) {
            kh1 kh1Var = (kh1) this;
            kh1Var.V.v.S = false;
            kh1Var.V.v.invalidate();
            this.f33839a = true;
            b();
            rh1 rh1Var = kh1Var.V;
            rh1Var.f43030o0 = null;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            rh1Var.f43038u0.setLockOnScreen(false);
            if (z11) {
                rh1Var.f43029n0 = true;
                if (sharedInstance != null && !z10) {
                    sharedInstance.requestVideoCall(false);
                    sharedInstance.setVideoState(false, 2);
                    sharedInstance.switchToSpeaker();
                }
                if (sharedInstance != null) {
                    rh1Var.u(rh1Var.f43013f, sharedInstance, true);
                }
            } else if (sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            rh1Var.f43032q0 = rh1Var.f43031p0;
            rh1Var.G();
            if (kh1Var.V.m0 && z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new w0(this, 0));
                ofFloat.setInterpolator(ds.f27530f);
                ofFloat.setStartDelay(60L);
                ofFloat.setDuration(350L);
                ofFloat.addListener(new x0(this, 2));
                ofFloat.start();
                this.f33841c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.f33844r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            } else if (z11) {
                animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(ds.f27530f).setListener(new x0(this, 0));
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat2.addUpdateListener(new w0(this, 1));
                ofFloat2.addListener(new x0(this, 1));
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new w0(this, 2));
                ds dsVar = ds.f27530f;
                ofFloat2.setInterpolator(dsVar);
                long j10 = 320;
                ofFloat2.setDuration(j10);
                ofFloat2.start();
                ofFloat3.setInterpolator(dsVar);
                ofFloat3.setDuration(j10);
                ofFloat3.start();
                this.d.setAlpha(1.0f);
                this.d.setScaleY(1.0f);
                this.d.setScaleX(1.0f);
                this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                float f7 = 320;
                this.f33841c.animate().translationY(AndroidUtilities.dp(53.0f)).translationX((this.I - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f)).setDuration(0.6f * f7).start();
                animate().alpha(0.0f).setDuration(0.25f * f7).setStartDelay(f7 * 0.75f).start();
            }
            invalidate();
        }
    }

    public final void b() {
        t2 t2Var = this.f33842f;
        if (this.f33843n) {
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
                        View findViewWithTag = this.f33840b.findViewWithTag("image_stab");
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
        if (this.v != i10 && (i11 = this.f33846w) != i10) {
            t2 t2Var = this.f33842f;
            if (z10) {
                if (i11 == 0) {
                    if (this.h != i10) {
                        this.h = i10;
                        this.f33843n = false;
                        d(true, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().switchCamera();
                        }
                    } else {
                        d(false, false);
                        t2Var.animate().alpha(1.0f).setDuration(250L).start();
                    }
                } else if (i10 == 0) {
                    this.f33840b.findViewWithTag("screencast_stub").setVisibility(0);
                    b();
                    d(false, false);
                    t2Var.animate().alpha(0.0f).setDuration(250L).start();
                } else {
                    b();
                    this.h = i10;
                    this.f33843n = false;
                    d(true, false);
                    t2Var.animate().alpha(0.0f).setDuration(250L).start();
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().switchCamera();
                    }
                }
                int i12 = this.f33846w;
                if (i10 > i12) {
                    this.f33847x = i12;
                    this.f33846w = i12 + 1;
                    this.U = ValueAnimator.ofFloat(0.1f, 1.0f);
                } else {
                    this.f33847x = i12;
                    this.f33846w = i12 - 1;
                    this.v = i10;
                    this.U = ValueAnimator.ofFloat(1.0f, 0.0f);
                }
                this.U.addUpdateListener(new w0(this, 3));
                this.U.addListener(new hi.y2(this, i10, 12));
                this.U.setInterpolator(ds.f27530f);
                this.U.setDuration(350L);
                this.U.start();
                return;
            }
            this.f33846w = i10;
            this.v = i10;
            this.f33845s = 0.0f;
            e();
            t2Var.setVisibility(0);
            this.f33843n = false;
            this.h = 1;
            d(true, false);
        }
    }

    public final void d(boolean z10, boolean z11) {
        Bitmap bitmap;
        ImageView imageView = (ImageView) this.f33840b.findViewWithTag("image_stab");
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
        int i10 = (this.f33848y > 1.0f ? 1 : (this.f33848y == 1.0f ? 0 : -1));
        Path path = this.K;
        if (i10 < 0) {
            Point point = AndroidUtilities.displaySize;
            int i11 = point.x;
            int i12 = point.y + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight;
            float dp = AndroidUtilities.dp(28.0f) - (AndroidUtilities.dp(28.0f) * this.f33848y);
            path.reset();
            float f7 = this.I;
            float f10 = this.J;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f7 + AndroidUtilities.dp(33.5f), f10 + AndroidUtilities.dp(26.6f), AndroidUtilities.dp(26.0f), direction);
            int dp2 = AndroidUtilities.dp(52.0f);
            int dp3 = AndroidUtilities.dp(52.0f);
            int lerp = AndroidUtilities.lerp(dp2, i11, this.f33848y);
            int lerp2 = AndroidUtilities.lerp(dp3, i12, this.f33848y);
            float dp4 = this.G - ((1.0f - this.f33848y) * AndroidUtilities.dp(20.0f));
            float dp5 = this.H - ((1.0f - this.f33848y) * AndroidUtilities.dp(51.0f));
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
            float z10 = c3.h0.z(1.0f, f11, i16 - i15, i15) / i16;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * z10, getHeight() * z10, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.translate(i13, i14);
            canvas.clipPath(path);
            canvas.scale(z10, z10);
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        y2 y2Var;
        int i10 = this.v;
        y2[] y2VarArr = this.e;
        y2 y2Var2 = y2VarArr[i10];
        if (i10 < y2VarArr.length - 1) {
            y2Var = y2VarArr[i10 + 1];
        } else {
            y2Var = null;
        }
        float measuredWidth = (y2Var2.getMeasuredWidth() / 2) + y2Var2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (y2Var != null) {
            measuredWidth2 -= (((y2Var.getMeasuredWidth() / 2) + y2Var.getLeft()) - measuredWidth) * this.f33845s;
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
                    float f11 = this.f33845s;
                    f7 = 1.0f - (0.3f * f11);
                    f10 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = this.f33845s;
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
        this.f33841c.invalidate();
        if (this.f33846w == 0) {
            y2VarArr[2].setAlpha(this.f33845s * 0.7f);
        }
        if (this.f33846w == 2) {
            float f13 = this.f33845s;
            if (f13 > 0.0f) {
                y2VarArr[0].setAlpha((1.0f - f13) * 0.7f);
            } else {
                y2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.f33846w == 1) {
            if (this.f33847x == 0) {
                y2VarArr[2].setAlpha(this.f33845s * 0.7f);
            }
            if (this.f33847x == 2) {
                y2VarArr[0].setAlpha((1.0f - this.f33845s) * 0.7f);
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
        if (!this.f33843n) {
            this.f33843n = true;
            if (this.f33846w != 0) {
                this.f33842f.animate().alpha(1.0f).setDuration(250L).start();
            }
        }
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        if (VoIPService.getSharedInstance() != null) {
            this.f33842f.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
        org.telegram.messenger.voip.t0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.t0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        org.telegram.messenger.voip.t0.g(this, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public void setBottomPadding(int i10) {
        ((FrameLayout.LayoutParams) this.f33841c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(80.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
    }
}
