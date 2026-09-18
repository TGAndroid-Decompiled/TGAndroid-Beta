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
import ci.bb;
import ci.o4;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r81;
import org.telegram.ui.bc1;
import org.telegram.ui.li1;
import org.telegram.ui.ro;
import org.telegram.ui.si1;
import org.webrtc.RendererCommon;
import w7.y5;
public abstract class d1 extends FrameLayout implements VoIPService.StateListener {
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
    public final lc0 R;
    public final lc0 S;
    public final GestureDetector T;
    public ValueAnimator U;
    public boolean f29201a;
    public final ai.f0 f29202b;
    public final b1 f29203c;
    public final bc1 d;
    public final x2[] e;
    public final s2 f29204f;
    public int h;
    public boolean f29205n;
    public final org.telegram.ui.ActionBar.k f29206r;
    public float f29207s;
    public int v;
    public int f29208w;
    public int f29209x;
    public float f29210y;

    public d1(Context context, float f7, float f10) {
        super(context);
        String string;
        this.h = 1;
        this.f29209x = -1;
        this.f29210y = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.K = new Path();
        this.L = new Camera();
        this.M = new Matrix();
        this.N = new Matrix();
        this.P = new com.google.firebase.messaging.n(80, 80);
        this.Q = new com.google.firebase.messaging.n(80, 80);
        this.R = new lc0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.S = new lc0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.I = f7;
        this.J = f10;
        this.e = new x2[3];
        li1 li1Var = (li1) this;
        this.T = new GestureDetector(context, new a1(li1Var));
        ai.f0 f0Var = new ai.f0(li1Var, context, 23);
        this.f29202b = f0Var;
        f0Var.setClickable(true);
        addView(f0Var, y5.c(-1.0f, -1));
        s2 s2Var = new s2(context, false, false);
        this.f29204f = s2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        r2 r2Var = s2Var.d;
        r2Var.setScalingType(scalingType);
        s2Var.f29500a0 = 1;
        s2Var.f29504c0 = true;
        r2Var.setAlpha(0.0f);
        r2Var.setRotateTextureWithScreen(true);
        r2Var.setUseCameraRotation(true);
        addView(s2Var, y5.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.f29206r = kVar;
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        kVar.setBackgroundColor(0);
        kVar.B(j6.w0(null, j6.f19142hg, false), false);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new ro(li1Var, 15));
        addView(kVar);
        b1 b1Var = new b1(li1Var, getContext());
        this.f29203c = b1Var;
        b1Var.setMaxLines(1);
        b1Var.setEllipsize(null);
        b1Var.setMinWidth(AndroidUtilities.dp(64.0f));
        b1Var.setTag(-1);
        b1Var.setTextSize(1, 14.0f);
        int i10 = j6.f19254ng;
        b1Var.setTextColor(j6.w0(null, i10, false));
        b1Var.setGravity(17);
        b1Var.setTypeface(AndroidUtilities.bold());
        b1Var.getPaint().setTextAlign(Paint.Align.CENTER);
        b1Var.setContentDescription(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(8.0f);
            int k10 = i0.a.k(j6.w0(null, i10, false), 76);
            b1Var.setForeground(j6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        b1Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        b1Var.setOnClickListener(new o(li1Var, 2));
        addView(b1Var, y5.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        bc1 bc1Var = new bc1(li1Var, context, 12);
        this.d = bc1Var;
        bc1Var.setClipChildren(false);
        addView(bc1Var, y5.e(-1, 64, 80));
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
            this.d.addView(this.e[i11], y5.n(-2, -1));
            this.e[i11].setOnClickListener(new o4(li1Var, i11, 16));
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f29204f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f29204f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.f29204f.d, false);
        }
        ai.f0 f0Var2 = this.f29202b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new lc0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView, y5.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.messenger.q.r(textView, -1, 1, 15.0f);
        frameLayout.addView(textView, y5.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        f0Var2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(R.drawable.icplaceholder);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        f0Var2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new bb(li1Var, f7, f10, 3));
        ofFloat.addListener(new r81(li1Var, 6));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new r0(li1Var, 1));
        qr qrVar = qr.f27715f;
        ofFloat.setInterpolator(qrVar);
        long j3 = 320;
        ofFloat.setDuration(j3);
        ofFloat.start();
        ofFloat2.setInterpolator(qrVar);
        ofFloat2.setDuration(j3);
        ofFloat2.setStartDelay(32);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.f29203c.setTranslationY(AndroidUtilities.dp(53.0f));
        this.f29203c.setTranslationX((f7 - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f));
        this.f29203c.animate().translationY(0.0f).translationX(0.0f).setDuration(j3).start();
        this.O = true;
        c(1, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (!this.f29201a && this.f29210y == 1.0f) {
            li1 li1Var = (li1) this;
            li1Var.V.v.S = false;
            li1Var.V.v.invalidate();
            this.f29201a = true;
            b();
            si1 si1Var = li1Var.V;
            si1Var.f37325o0 = null;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            si1Var.f37333u0.setLockOnScreen(false);
            if (z11) {
                si1Var.f37324n0 = true;
                if (sharedInstance != null && !z10) {
                    sharedInstance.requestVideoCall(false);
                    sharedInstance.setVideoState(false, 2);
                    sharedInstance.switchToSpeaker();
                }
                if (sharedInstance != null) {
                    si1Var.v(si1Var.f37308f, sharedInstance, true);
                }
            } else if (sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            si1Var.f37327q0 = si1Var.f37326p0;
            si1Var.H();
            if (li1Var.V.m0 && z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new y0(this, 0));
                ofFloat.setInterpolator(qr.f27715f);
                ofFloat.setStartDelay(60L);
                ofFloat.setDuration(350L);
                ofFloat.addListener(new z0(this, 2));
                ofFloat.start();
                this.f29203c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.f29206r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            } else if (z11) {
                animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(qr.f27715f).setListener(new z0(this, 0));
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat2.addUpdateListener(new y0(this, 1));
                ofFloat2.addListener(new z0(this, 1));
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new y0(this, 2));
                qr qrVar = qr.f27715f;
                ofFloat2.setInterpolator(qrVar);
                long j3 = 320;
                ofFloat2.setDuration(j3);
                ofFloat2.start();
                ofFloat3.setInterpolator(qrVar);
                ofFloat3.setDuration(j3);
                ofFloat3.start();
                this.d.setAlpha(1.0f);
                this.d.setScaleY(1.0f);
                this.d.setScaleX(1.0f);
                this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                float f7 = 320;
                this.f29203c.animate().translationY(AndroidUtilities.dp(53.0f)).translationX((this.I - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f)).setDuration(0.6f * f7).start();
                animate().alpha(0.0f).setDuration(0.25f * f7).setStartDelay(f7 * 0.75f).start();
            }
            invalidate();
        }
    }

    public final void b() {
        s2 s2Var = this.f29204f;
        if (this.f29205n) {
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
                        View findViewWithTag = this.f29202b.findViewWithTag("image_stab");
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
        if (this.v != i10 && (i11 = this.f29208w) != i10) {
            s2 s2Var = this.f29204f;
            if (z10) {
                if (i11 == 0) {
                    if (this.h != i10) {
                        this.h = i10;
                        this.f29205n = false;
                        d(true, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().switchCamera();
                        }
                    } else {
                        d(false, false);
                        s2Var.animate().alpha(1.0f).setDuration(250L).start();
                    }
                } else if (i10 == 0) {
                    this.f29202b.findViewWithTag("screencast_stub").setVisibility(0);
                    b();
                    d(false, false);
                    s2Var.animate().alpha(0.0f).setDuration(250L).start();
                } else {
                    b();
                    this.h = i10;
                    this.f29205n = false;
                    d(true, false);
                    s2Var.animate().alpha(0.0f).setDuration(250L).start();
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().switchCamera();
                    }
                }
                int i12 = this.f29208w;
                if (i10 > i12) {
                    this.f29209x = i12;
                    this.f29208w = i12 + 1;
                    this.U = ValueAnimator.ofFloat(0.1f, 1.0f);
                } else {
                    this.f29209x = i12;
                    this.f29208w = i12 - 1;
                    this.v = i10;
                    this.U = ValueAnimator.ofFloat(1.0f, 0.0f);
                }
                this.U.addUpdateListener(new y0(this, 3));
                this.U.addListener(new ei.v2(this, i10, 11));
                this.U.setInterpolator(qr.f27715f);
                this.U.setDuration(350L);
                this.U.start();
                return;
            }
            this.f29208w = i10;
            this.v = i10;
            this.f29207s = 0.0f;
            e();
            s2Var.setVisibility(0);
            this.f29205n = false;
            this.h = 1;
            d(true, false);
        }
    }

    public final void d(boolean z10, boolean z11) {
        Bitmap bitmap;
        ImageView imageView = (ImageView) this.f29202b.findViewWithTag("image_stab");
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
        float f7 = this.f29210y;
        Path path = this.K;
        if (f7 < 1.0f) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            int i11 = point.y + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight;
            float dp = AndroidUtilities.dp(28.0f) - (AndroidUtilities.dp(28.0f) * this.f29210y);
            path.reset();
            float f10 = this.I;
            float f11 = this.J;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f10 + AndroidUtilities.dp(33.5f), f11 + AndroidUtilities.dp(26.6f), AndroidUtilities.dp(26.0f), direction);
            int dp2 = AndroidUtilities.dp(52.0f);
            int dp3 = AndroidUtilities.dp(52.0f);
            int lerp = AndroidUtilities.lerp(dp2, i10, this.f29210y);
            int lerp2 = AndroidUtilities.lerp(dp3, i11, this.f29210y);
            float dp4 = this.G - ((1.0f - this.f29210y) * AndroidUtilities.dp(20.0f));
            float dp5 = this.H - ((1.0f - this.f29210y) * AndroidUtilities.dp(51.0f));
            path.addRoundRect(dp4, dp5, lerp + dp4, dp5 + lerp2, dp, dp, direction);
            canvas.clipPath(path);
        }
        if (this.F > 0.0f) {
            int[] floatingViewLocation = getFloatingViewLocation();
            float f12 = this.F;
            int i12 = (int) (floatingViewLocation[0] * f12);
            int i13 = (int) (floatingViewLocation[1] * f12);
            int i14 = floatingViewLocation[2];
            int i15 = AndroidUtilities.displaySize.x;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f12, i15 - i14, i14) / i15;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * z10, getHeight() * z10, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.translate(i12, i13);
            canvas.clipPath(path);
            canvas.scale(z10, z10);
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
            measuredWidth2 -= (((x2Var.getMeasuredWidth() / 2) + x2Var.getLeft()) - measuredWidth) * this.f29207s;
        }
        int i11 = 0;
        while (true) {
            float f7 = 0.7f;
            if (i11 >= x2VarArr.length) {
                break;
            }
            int i12 = this.v;
            float f10 = 0.9f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = this.f29207s;
                    f7 = 1.0f - (0.3f * f11);
                    f10 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = this.f29207s;
                    f7 = 0.7f + (0.3f * f12);
                    f10 = 0.9f + (f12 * 0.1f);
                }
            }
            x2VarArr[i11].setAlpha(f7);
            x2VarArr[i11].setScaleX(f10);
            x2VarArr[i11].setScaleY(f10);
            x2VarArr[i11].setTranslationX(measuredWidth2);
            i11++;
        }
        this.f29203c.invalidate();
        if (this.f29208w == 0) {
            x2VarArr[2].setAlpha(this.f29207s * 0.7f);
        }
        if (this.f29208w == 2) {
            float f13 = this.f29207s;
            if (f13 > 0.0f) {
                x2VarArr[0].setAlpha((1.0f - f13) * 0.7f);
            } else {
                x2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.f29208w == 1) {
            if (this.f29209x == 0) {
                x2VarArr[2].setAlpha(this.f29207s * 0.7f);
            }
            if (this.f29209x == 2) {
                x2VarArr[0].setAlpha((1.0f - this.f29207s) * 0.7f);
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
        if (!this.f29205n) {
            this.f29205n = true;
            if (this.f29208w != 0) {
                this.f29204f.animate().alpha(1.0f).setDuration(250L).start();
            }
        }
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        if (VoIPService.getSharedInstance() != null) {
            this.f29204f.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
        ((FrameLayout.LayoutParams) this.f29203c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(80.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
    }
}
