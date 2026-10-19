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
import ei.i6;
import ei.ja;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.ah1;
import org.telegram.ui.ea;
import org.telegram.ui.hh1;
import org.telegram.ui.qa1;
import org.webrtc.RendererCommon;
import w7.z5;
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
    public final com.google.firebase.messaging.l P;
    public final com.google.firebase.messaging.l Q;
    public final wc0 R;
    public final wc0 S;
    public final GestureDetector T;
    public ValueAnimator U;
    public boolean f31397a;
    public final ah.x f31398b;
    public final z0 f31399c;
    public final qa1 d;
    public final v2[] e;
    public final q2 f31400f;
    public int h;
    public boolean f31401n;
    public final org.telegram.ui.ActionBar.k f31402r;
    public float f31403s;
    public int v;
    public int f31404w;
    public int f31405x;
    public float f31406y;

    public b1(Context context, float f7, float f10) {
        super(context);
        String string;
        this.h = 1;
        this.f31405x = -1;
        this.f31406y = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.K = new Path();
        this.L = new Camera();
        this.M = new Matrix();
        this.N = new Matrix();
        this.P = new com.google.firebase.messaging.l(80, 80);
        this.Q = new com.google.firebase.messaging.l(80, 80);
        this.R = new wc0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.S = new wc0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.I = f7;
        this.J = f10;
        this.e = new v2[3];
        ah1 ah1Var = (ah1) this;
        this.T = new GestureDetector(context, new y0(ah1Var));
        ah.x xVar = new ah.x(ah1Var, context, 26);
        this.f31398b = xVar;
        xVar.setClickable(true);
        addView(xVar, z5.c(-1.0f, -1));
        q2 q2Var = new q2(context, false, false);
        this.f31400f = q2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        p2 p2Var = q2Var.d;
        p2Var.setScalingType(scalingType);
        q2Var.f31695a0 = 1;
        q2Var.f31699c0 = true;
        p2Var.setAlpha(0.0f);
        p2Var.setRotateTextureWithScreen(true);
        p2Var.setUseCameraRotation(true);
        addView(q2Var, z5.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.f31402r = kVar;
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        kVar.setBackgroundColor(0);
        kVar.C(h6.x0(null, h6.f21068hg, false), false);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new ea(ah1Var, 18));
        addView(kVar);
        z0 z0Var = new z0(ah1Var, getContext());
        this.f31399c = z0Var;
        z0Var.setMaxLines(1);
        z0Var.setEllipsize(null);
        z0Var.setMinWidth(AndroidUtilities.dp(64.0f));
        z0Var.setTag(-1);
        z0Var.setTextSize(1, 14.0f);
        int i10 = h6.f21182ng;
        z0Var.setTextColor(h6.x0(null, i10, false));
        z0Var.setGravity(17);
        z0Var.setTypeface(AndroidUtilities.bold());
        z0Var.getPaint().setTextAlign(Paint.Align.CENTER);
        z0Var.setContentDescription(LocaleController.getString(R.string.VoipShareVideo));
        int dp = AndroidUtilities.dp(8.0f);
        int o10 = i0.a.o(h6.x0(null, i10, false), 76);
        z0Var.setForeground(h6.j0(dp, dp, dp, dp, 0, o10, o10));
        z0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        z0Var.setOnClickListener(new hg.r0(ah1Var, 13));
        addView(z0Var, z5.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        qa1 qa1Var = new qa1(ah1Var, context, 14);
        this.d = qa1Var;
        qa1Var.setClipChildren(false);
        addView(qa1Var, z5.e(-1, 64, 80));
        for (int i11 = 0; i11 < this.e.length; i11++) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.VoipPhoneScreen);
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.VoipFrontCamera);
            } else {
                string = LocaleController.getString(R.string.VoipBackCamera);
            }
            this.e[i11] = new v2(context, string);
            this.e[i11].setContentDescription(string);
            this.e[i11].setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.d.addView(this.e[i11], z5.n(-2, -1));
            this.e[i11].setOnClickListener(new ai.n1(ah1Var, i11, 18));
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f31400f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f31400f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.f31400f.d, false);
        }
        ah.x xVar2 = this.f31398b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new wc0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView, z5.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.messenger.g0.m(15.0f, -1, 1, textView);
        frameLayout.addView(textView, z5.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        xVar2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(R.drawable.icplaceholder);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        xVar2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ja(ah1Var, f7, f10, 3));
        ofFloat.addListener(new o31(ah1Var, 11));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new i6(ah1Var, 9));
        bs bsVar = bs.f25014f;
        ofFloat.setInterpolator(bsVar);
        long j10 = 320;
        ofFloat.setDuration(j10);
        ofFloat.start();
        ofFloat2.setInterpolator(bsVar);
        ofFloat2.setDuration(j10);
        ofFloat2.setStartDelay(32);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.f31399c.setTranslationY(AndroidUtilities.dp(53.0f));
        this.f31399c.setTranslationX((f7 - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f));
        this.f31399c.animate().translationY(0.0f).translationX(0.0f).setDuration(j10).start();
        this.O = true;
        c(1, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (!this.f31397a && this.f31406y == 1.0f) {
            ah1 ah1Var = (ah1) this;
            ah1Var.V.v.S = false;
            ah1Var.V.v.invalidate();
            this.f31397a = true;
            b();
            hh1 hh1Var = ah1Var.V;
            hh1Var.f37682o0 = null;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            hh1Var.f37690u0.setLockOnScreen(false);
            if (z11) {
                hh1Var.f37681n0 = true;
                if (sharedInstance != null && !z10) {
                    sharedInstance.requestVideoCall(false);
                    sharedInstance.setVideoState(false, 2);
                    sharedInstance.switchToSpeaker();
                }
                if (sharedInstance != null) {
                    hh1Var.u(hh1Var.f37665f, sharedInstance, true);
                }
            } else if (sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            hh1Var.f37684q0 = hh1Var.f37683p0;
            hh1Var.G();
            if (ah1Var.V.m0 && z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new w0(this, 0));
                ofFloat.setInterpolator(bs.f25014f);
                ofFloat.setStartDelay(60L);
                ofFloat.setDuration(350L);
                ofFloat.addListener(new x0(this, 2));
                ofFloat.start();
                this.f31399c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.f31402r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
                this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            } else if (z11) {
                animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(bs.f25014f).setListener(new x0(this, 0));
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat2.addUpdateListener(new w0(this, 1));
                ofFloat2.addListener(new x0(this, 1));
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new w0(this, 2));
                bs bsVar = bs.f25014f;
                ofFloat2.setInterpolator(bsVar);
                long j10 = 320;
                ofFloat2.setDuration(j10);
                ofFloat2.start();
                ofFloat3.setInterpolator(bsVar);
                ofFloat3.setDuration(j10);
                ofFloat3.start();
                this.d.setAlpha(1.0f);
                this.d.setScaleY(1.0f);
                this.d.setScaleX(1.0f);
                this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                float f7 = 320;
                this.f31399c.animate().translationY(AndroidUtilities.dp(53.0f)).translationX((this.I - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f)).setDuration(0.6f * f7).start();
                animate().alpha(0.0f).setDuration(0.25f * f7).setStartDelay(f7 * 0.75f).start();
            }
            invalidate();
        }
    }

    public final void b() {
        q2 q2Var = this.f31400f;
        if (this.f31401n) {
            try {
                Bitmap bitmap = q2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), q2Var.d.getMatrix(), true);
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
                        View findViewWithTag = this.f31398b.findViewWithTag("image_stab");
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
        if (this.v != i10 && (i11 = this.f31404w) != i10) {
            q2 q2Var = this.f31400f;
            if (z10) {
                if (i11 == 0) {
                    if (this.h != i10) {
                        this.h = i10;
                        this.f31401n = false;
                        d(true, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().switchCamera();
                        }
                    } else {
                        d(false, false);
                        q2Var.animate().alpha(1.0f).setDuration(250L).start();
                    }
                } else if (i10 == 0) {
                    this.f31398b.findViewWithTag("screencast_stub").setVisibility(0);
                    b();
                    d(false, false);
                    q2Var.animate().alpha(0.0f).setDuration(250L).start();
                } else {
                    b();
                    this.h = i10;
                    this.f31401n = false;
                    d(true, false);
                    q2Var.animate().alpha(0.0f).setDuration(250L).start();
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().switchCamera();
                    }
                }
                int i12 = this.f31404w;
                if (i10 > i12) {
                    this.f31405x = i12;
                    this.f31404w = i12 + 1;
                    this.U = ValueAnimator.ofFloat(0.1f, 1.0f);
                } else {
                    this.f31405x = i12;
                    this.f31404w = i12 - 1;
                    this.v = i10;
                    this.U = ValueAnimator.ofFloat(1.0f, 0.0f);
                }
                this.U.addUpdateListener(new w0(this, 3));
                this.U.addListener(new gi.p2(this, i10, 12));
                this.U.setInterpolator(bs.f25014f);
                this.U.setDuration(350L);
                this.U.start();
                return;
            }
            this.f31404w = i10;
            this.v = i10;
            this.f31403s = 0.0f;
            e();
            q2Var.setVisibility(0);
            this.f31401n = false;
            this.h = 1;
            d(true, false);
        }
    }

    public final void d(boolean z10, boolean z11) {
        Bitmap bitmap;
        ImageView imageView = (ImageView) this.f31398b.findViewWithTag("image_stab");
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
        int i10 = (this.f31406y > 1.0f ? 1 : (this.f31406y == 1.0f ? 0 : -1));
        Path path = this.K;
        if (i10 < 0) {
            Point point = AndroidUtilities.displaySize;
            int i11 = point.x;
            int i12 = point.y + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight;
            float dp = AndroidUtilities.dp(28.0f) - (AndroidUtilities.dp(28.0f) * this.f31406y);
            path.reset();
            float f7 = this.I;
            float f10 = this.J;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f7 + AndroidUtilities.dp(33.5f), f10 + AndroidUtilities.dp(26.6f), AndroidUtilities.dp(26.0f), direction);
            int dp2 = AndroidUtilities.dp(52.0f);
            int dp3 = AndroidUtilities.dp(52.0f);
            int lerp = AndroidUtilities.lerp(dp2, i11, this.f31406y);
            int lerp2 = AndroidUtilities.lerp(dp3, i12, this.f31406y);
            float dp4 = this.G - ((1.0f - this.f31406y) * AndroidUtilities.dp(20.0f));
            float dp5 = this.H - ((1.0f - this.f31406y) * AndroidUtilities.dp(51.0f));
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
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, i16 - i15, i15) / i16;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * y3, getHeight() * y3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.translate(i13, i14);
            canvas.clipPath(path);
            canvas.scale(y3, y3);
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        v2 v2Var;
        int i10 = this.v;
        v2[] v2VarArr = this.e;
        v2 v2Var2 = v2VarArr[i10];
        if (i10 < v2VarArr.length - 1) {
            v2Var = v2VarArr[i10 + 1];
        } else {
            v2Var = null;
        }
        float measuredWidth = (v2Var2.getMeasuredWidth() / 2) + v2Var2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (v2Var != null) {
            measuredWidth2 -= (((v2Var.getMeasuredWidth() / 2) + v2Var.getLeft()) - measuredWidth) * this.f31403s;
        }
        int i11 = 0;
        while (true) {
            float f7 = 0.7f;
            if (i11 >= v2VarArr.length) {
                break;
            }
            int i12 = this.v;
            float f10 = 0.9f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = this.f31403s;
                    f7 = 1.0f - (0.3f * f11);
                    f10 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = this.f31403s;
                    f7 = 0.7f + (0.3f * f12);
                    f10 = 0.9f + (f12 * 0.1f);
                }
            }
            v2VarArr[i11].setAlpha(f7);
            v2VarArr[i11].setScaleX(f10);
            v2VarArr[i11].setScaleY(f10);
            v2VarArr[i11].setTranslationX(measuredWidth2);
            i11++;
        }
        this.f31399c.invalidate();
        if (this.f31404w == 0) {
            v2VarArr[2].setAlpha(this.f31403s * 0.7f);
        }
        if (this.f31404w == 2) {
            float f13 = this.f31403s;
            if (f13 > 0.0f) {
                v2VarArr[0].setAlpha((1.0f - f13) * 0.7f);
            } else {
                v2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.f31404w == 1) {
            if (this.f31405x == 0) {
                v2VarArr[2].setAlpha(this.f31403s * 0.7f);
            }
            if (this.f31405x == 2) {
                v2VarArr[0].setAlpha((1.0f - this.f31403s) * 0.7f);
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
        if (!this.f31401n) {
            this.f31401n = true;
            if (this.f31404w != 0) {
                this.f31400f.animate().alpha(1.0f).setDuration(250L).start();
            }
        }
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        if (VoIPService.getSharedInstance() != null) {
            this.f31400f.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
        ((FrameLayout.LayoutParams) this.f31399c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(80.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
    }
}
