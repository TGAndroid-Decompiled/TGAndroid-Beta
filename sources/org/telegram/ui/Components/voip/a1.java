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
import g7.e6;
import java.io.File;
import java.io.FileOutputStream;
import kh.g4;
import kh.ka;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.y11;
import org.telegram.ui.fh1;
import org.telegram.ui.mh1;
import org.telegram.ui.ta1;
import org.telegram.ui.tq;
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
    public final jb0 N;
    public final jb0 O;
    public final GestureDetector P;
    public ValueAnimator Q;
    public boolean f33425a;
    public final fh.d2 f33426b;
    public final y0 f33427c;
    public final ta1 d;
    public final w2[] f33428e;
    public final r2 f33429f;
    public int h;
    public boolean f33430n;
    public final org.telegram.ui.ActionBar.k f33431r;
    public float f33432s;
    public int v;
    public int f33433w;
    public int f33434x;
    public float f33435y;

    public a1(Context context, float f10, float f11) {
        super(context);
        String string;
        this.h = 1;
        this.f33434x = -1;
        this.f33435y = 0.0f;
        this.A = 0.0f;
        this.B = 0.0f;
        this.G = new Path();
        this.H = new Camera();
        this.I = new Matrix();
        this.J = new Matrix();
        this.L = new com.google.firebase.messaging.m(80, 80);
        this.M = new com.google.firebase.messaging.m(80, 80);
        this.N = new jb0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.O = new jb0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.E = f10;
        this.F = f11;
        this.f33428e = new w2[3];
        fh1 fh1Var = (fh1) this;
        this.P = new GestureDetector(context, new x0(fh1Var));
        fh.d2 d2Var = new fh.d2(fh1Var, context, 26);
        this.f33426b = d2Var;
        d2Var.setClickable(true);
        addView(d2Var, e6.c(-1.0f, -1));
        r2 r2Var = new r2(context, false, false);
        this.f33429f = r2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        q2 q2Var = r2Var.d;
        q2Var.setScalingType(scalingType);
        r2Var.T = 1;
        r2Var.V = true;
        q2Var.setAlpha(0.0f);
        q2Var.setRotateTextureWithScreen(true);
        q2Var.setUseCameraRotation(true);
        addView(r2Var, e6.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.f33431r = kVar;
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
        kVar.setBackgroundColor(0);
        kVar.C(f6.w0(null, f6.f23083hg, false), false);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new tq(fh1Var, 10));
        addView(kVar);
        y0 y0Var = new y0(fh1Var, getContext());
        this.f33427c = y0Var;
        y0Var.setMaxLines(1);
        y0Var.setEllipsize(null);
        y0Var.setMinWidth(AndroidUtilities.dp(64.0f));
        y0Var.setTag(-1);
        y0Var.setTextSize(1, 14.0f);
        int i9 = f6.f23188ng;
        y0Var.setTextColor(f6.w0(null, i9, false));
        y0Var.setGravity(17);
        y0Var.setTypeface(AndroidUtilities.bold());
        y0Var.getPaint().setTextAlign(Paint.Align.CENTER);
        y0Var.setContentDescription(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(8.0f);
            int k10 = i0.a.k(f6.w0(null, i9, false), 76);
            y0Var.setForeground(f6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        y0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        y0Var.setOnClickListener(new x8(fh1Var, 14));
        addView(y0Var, e6.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        ta1 ta1Var = new ta1(fh1Var, context, 13);
        this.d = ta1Var;
        ta1Var.setClipChildren(false);
        addView(ta1Var, e6.e(-1, 64, 80));
        for (int i10 = 0; i10 < this.f33428e.length; i10++) {
            if (i10 == 0) {
                string = LocaleController.getString(R.string.VoipPhoneScreen);
            } else if (i10 == 1) {
                string = LocaleController.getString(R.string.VoipFrontCamera);
            } else {
                string = LocaleController.getString(R.string.VoipBackCamera);
            }
            this.f33428e[i10] = new w2(context, string);
            this.f33428e[i10].setContentDescription(string);
            this.f33428e[i10].setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.d.addView(this.f33428e[i10], e6.n(-2, -1));
            this.f33428e[i10].setOnClickListener(new gh.z0(fh1Var, i10, 15));
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f33429f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f33429f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.f33429f.d, false);
        }
        fh.d2 d2Var2 = this.f33426b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new jb0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView, e6.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.messenger.l0.q(textView, -1, 1, 15.0f);
        frameLayout.addView(textView, e6.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        d2Var2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(R.drawable.icplaceholder);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        d2Var2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ka(fh1Var, f10, f11, 2));
        ofFloat.addListener(new y11(fh1Var, 11));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new g4(fh1Var, 8));
        gr grVar = gr.f28844f;
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
        this.f33427c.setTranslationY(AndroidUtilities.dp(53.0f));
        this.f33427c.setTranslationX((f10 - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f));
        this.f33427c.animate().translationY(0.0f).translationX(0.0f).setDuration(j10).start();
        this.K = true;
        c(1, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (!this.f33425a && this.f33435y == 1.0f) {
            fh1 fh1Var = (fh1) this;
            fh1Var.R.v.O = false;
            fh1Var.R.v.invalidate();
            this.f33425a = true;
            b();
            mh1 mh1Var = fh1Var.R;
            mh1Var.f40452k0 = null;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            mh1Var.f40458q0.setLockOnScreen(false);
            if (z11) {
                mh1Var.f40451j0 = true;
                if (sharedInstance != null && !z10) {
                    sharedInstance.requestVideoCall(false);
                    sharedInstance.setVideoState(false, 2);
                    sharedInstance.switchToSpeaker();
                }
                if (sharedInstance != null) {
                    mh1Var.v(mh1Var.f40442f, sharedInstance, true);
                }
            } else if (sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            mh1Var.m0 = mh1Var.f40453l0;
            mh1Var.H();
            if (fh1Var.R.f40449i0 && z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new v0(this, 0));
                ofFloat.setInterpolator(gr.f28844f);
                ofFloat.setStartDelay(60L);
                ofFloat.setDuration(350L);
                ofFloat.addListener(new w0(this, 2));
                ofFloat.start();
                this.f33427c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.f33431r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            } else if (z11) {
                animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(gr.f28844f).setListener(new w0(this, 0));
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat2.addUpdateListener(new v0(this, 1));
                ofFloat2.addListener(new w0(this, 1));
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new v0(this, 2));
                gr grVar = gr.f28844f;
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
                float f10 = 320;
                this.f33427c.animate().translationY(AndroidUtilities.dp(53.0f)).translationX((this.E - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f)).setDuration(0.6f * f10).start();
                animate().alpha(0.0f).setDuration(0.25f * f10).setStartDelay(f10 * 0.75f).start();
            }
            invalidate();
        }
    }

    public final void b() {
        r2 r2Var = this.f33429f;
        if (this.f33430n) {
            try {
                Bitmap bitmap = r2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), r2Var.d.getMatrix(), true);
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
                        View findViewWithTag = this.f33426b.findViewWithTag("image_stab");
                        if (findViewWithTag instanceof ImageView) {
                            ((ImageView) findViewWithTag).setImageBitmap(createScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void c(int i9, boolean z10) {
        int i10;
        if (this.v != i9 && (i10 = this.f33433w) != i9) {
            r2 r2Var = this.f33429f;
            if (z10) {
                if (i10 == 0) {
                    if (this.h != i9) {
                        this.h = i9;
                        this.f33430n = false;
                        d(true, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().switchCamera();
                        }
                    } else {
                        d(false, false);
                        r2Var.animate().alpha(1.0f).setDuration(250L).start();
                    }
                } else if (i9 == 0) {
                    this.f33426b.findViewWithTag("screencast_stub").setVisibility(0);
                    b();
                    d(false, false);
                    r2Var.animate().alpha(0.0f).setDuration(250L).start();
                } else {
                    b();
                    this.h = i9;
                    this.f33430n = false;
                    d(true, false);
                    r2Var.animate().alpha(0.0f).setDuration(250L).start();
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().switchCamera();
                    }
                }
                int i11 = this.f33433w;
                if (i9 > i11) {
                    this.f33434x = i11;
                    this.f33433w = i11 + 1;
                    this.Q = ValueAnimator.ofFloat(0.1f, 1.0f);
                } else {
                    this.f33434x = i11;
                    this.f33433w = i11 - 1;
                    this.v = i9;
                    this.Q = ValueAnimator.ofFloat(1.0f, 0.0f);
                }
                this.Q.addUpdateListener(new v0(this, 3));
                this.Q.addListener(new mh.o2(this, i9, 10));
                this.Q.setInterpolator(gr.f28844f);
                this.Q.setDuration(350L);
                this.Q.start();
                return;
            }
            this.f33433w = i9;
            this.v = i9;
            this.f33432s = 0.0f;
            e();
            r2Var.setVisibility(0);
            this.f33430n = false;
            this.h = 1;
            d(true, false);
        }
    }

    public final void d(boolean z10, boolean z11) {
        Bitmap bitmap;
        ImageView imageView = (ImageView) this.f33426b.findViewWithTag("image_stab");
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
        float f10 = this.f33435y;
        Path path = this.G;
        if (f10 < 1.0f) {
            Point point = AndroidUtilities.displaySize;
            int i9 = point.x;
            int i10 = point.y + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight;
            float dp = AndroidUtilities.dp(28.0f) - (AndroidUtilities.dp(28.0f) * this.f33435y);
            path.reset();
            float f11 = this.E;
            float f12 = this.F;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f11 + AndroidUtilities.dp(33.5f), f12 + AndroidUtilities.dp(26.6f), AndroidUtilities.dp(26.0f), direction);
            int dp2 = AndroidUtilities.dp(52.0f);
            int dp3 = AndroidUtilities.dp(52.0f);
            int lerp = AndroidUtilities.lerp(dp2, i9, this.f33435y);
            int lerp2 = AndroidUtilities.lerp(dp3, i10, this.f33435y);
            float dp4 = this.C - ((1.0f - this.f33435y) * AndroidUtilities.dp(20.0f));
            float dp5 = this.D - ((1.0f - this.f33435y) * AndroidUtilities.dp(51.0f));
            path.addRoundRect(dp4, dp5, lerp + dp4, dp5 + lerp2, dp, dp, direction);
            canvas.clipPath(path);
        }
        if (this.B > 0.0f) {
            int[] floatingViewLocation = getFloatingViewLocation();
            float f13 = this.B;
            int i11 = (int) (floatingViewLocation[0] * f13);
            int i12 = (int) (floatingViewLocation[1] * f13);
            int i13 = floatingViewLocation[2];
            int i14 = AndroidUtilities.displaySize.x;
            float z10 = e2.c.z(1.0f, f13, i14 - i13, i13) / i14;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * z10, getHeight() * z10, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.translate(i11, i12);
            canvas.clipPath(path);
            canvas.scale(z10, z10);
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        w2 w2Var;
        int i9 = this.v;
        w2[] w2VarArr = this.f33428e;
        w2 w2Var2 = w2VarArr[i9];
        if (i9 < w2VarArr.length - 1) {
            w2Var = w2VarArr[i9 + 1];
        } else {
            w2Var = null;
        }
        float measuredWidth = (w2Var2.getMeasuredWidth() / 2) + w2Var2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (w2Var != null) {
            measuredWidth2 -= (((w2Var.getMeasuredWidth() / 2) + w2Var.getLeft()) - measuredWidth) * this.f33432s;
        }
        int i10 = 0;
        while (true) {
            float f10 = 0.7f;
            if (i10 >= w2VarArr.length) {
                break;
            }
            int i11 = this.v;
            float f11 = 0.9f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = this.f33432s;
                    f10 = 1.0f - (0.3f * f12);
                    f11 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.f33432s;
                    f10 = 0.7f + (0.3f * f13);
                    f11 = 0.9f + (f13 * 0.1f);
                }
            }
            w2VarArr[i10].setAlpha(f10);
            w2VarArr[i10].setScaleX(f11);
            w2VarArr[i10].setScaleY(f11);
            w2VarArr[i10].setTranslationX(measuredWidth2);
            i10++;
        }
        this.f33427c.invalidate();
        if (this.f33433w == 0) {
            w2VarArr[2].setAlpha(this.f33432s * 0.7f);
        }
        if (this.f33433w == 2) {
            float f14 = this.f33432s;
            if (f14 > 0.0f) {
                w2VarArr[0].setAlpha((1.0f - f14) * 0.7f);
            } else {
                w2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.f33433w == 1) {
            if (this.f33434x == 0) {
                w2VarArr[2].setAlpha(this.f33432s * 0.7f);
            }
            if (this.f33434x == 2) {
                w2VarArr[0].setAlpha((1.0f - this.f33432s) * 0.7f);
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
        if (!this.f33430n) {
            this.f33430n = true;
            if (this.f33433w != 0) {
                this.f33429f.animate().alpha(1.0f).setDuration(250L).start();
            }
        }
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        if (VoIPService.getSharedInstance() != null) {
            this.f33429f.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        e();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), 0);
    }

    @Override
    public final void onMediaStateUpdated(int i9, int i10) {
        org.telegram.messenger.voip.u0.d(this, i9, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i9) {
        org.telegram.messenger.voip.u0.f(this, i9);
    }

    @Override
    public final void onStateChanged(int i9) {
        org.telegram.messenger.voip.u0.g(this, i9);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public void setBottomPadding(int i9) {
        ((FrameLayout.LayoutParams) this.f33427c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(80.0f) + i9;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i9;
    }
}
