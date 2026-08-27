package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import java.io.File;
import java.io.FileOutputStream;
import lh.c5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.d40;
import org.telegram.ui.s50;
import org.telegram.ui.zp;
import org.webrtc.RendererCommon;

public abstract class u0 extends FrameLayout implements VoIPService.StateListener {

    public boolean f33913a;

    public final m2.g f33914b;

    public final ag.e1 f33915c;
    public final LinearLayout d;

    public final ri0 f33916e;

    public final TextView[] f33917f;
    public final r2 h;

    public int f33918n;

    public int f33919r;

    public boolean f33920s;
    public boolean v;

    public float f33921w;

    public int f33922x;

    public final boolean f33923y;

    public u0(Context context, boolean z10) {
        super(context);
        this.f33918n = 1;
        this.f33919r = 1;
        this.f33923y = z10;
        this.f33917f = new TextView[z10 ? 3 : 2];
        m2.g gVar = new m2.g(context);
        this.f33914b = gVar;
        AndroidUtilities.setViewPagerEdgeEffectColor(gVar, 2130706432);
        gVar.setAdapter(new t0(this));
        gVar.setPageMargin(0);
        gVar.setOffscreenPageLimit(1);
        addView(gVar, z5.c(-1.0f, -1));
        gVar.b(new r0(this));
        r2 r2Var = new r2(context, false, false);
        this.h = r2Var;
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
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        kVar.setBackgroundColor(0);
        kVar.D(g6.w0(null, g6.f23135hg, false), false);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new zp(this, 10));
        addView(kVar);
        ag.e1 e1Var = new ag.e1(this, getContext());
        this.f33915c = e1Var;
        e1Var.setMinWidth(AndroidUtilities.dp(64.0f));
        e1Var.setTag(-1);
        e1Var.setTextSize(1, 14.0f);
        int i10 = g6.f23242ng;
        e1Var.setTextColor(g6.w0(null, i10, false));
        e1Var.setGravity(17);
        e1Var.setTypeface(AndroidUtilities.bold());
        e1Var.setText(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int iDp = AndroidUtilities.dp(6.0f);
            int iK = i0.b.k(g6.w0(null, i10, false), 76);
            e1Var.setForeground(g6.i0(iDp, iDp, iDp, iDp, 0, iK, iK));
        }
        e1Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        e1Var.setOnClickListener(new c5(this, 11));
        addView(e1Var, z5.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, z5.e(-2, 64, 80));
        int i11 = 0;
        while (true) {
            TextView[] textViewArr = this.f33917f;
            if (i11 >= textViewArr.length) {
                break;
            }
            textViewArr[i11] = new TextView(context);
            this.f33917f[i11].setTextSize(1, 12.0f);
            this.f33917f[i11].setTextColor(-1);
            this.f33917f[i11].setTypeface(AndroidUtilities.bold());
            this.f33917f[i11].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.f33917f[i11].setGravity(16);
            this.f33917f[i11].setSingleLine(true);
            this.d.addView(this.f33917f[i11], z5.n(-2, -1));
            if (i11 == 0 && this.f33923y) {
                this.f33917f[i11].setText(LocaleController.getString(R.string.VoipPhoneScreen));
            } else if (i11 == 0 || (i11 == 1 && this.f33923y)) {
                this.f33917f[i11].setText(LocaleController.getString(R.string.VoipFrontCamera));
            } else {
                this.f33917f[i11].setText(LocaleController.getString(R.string.VoipBackCamera));
            }
            this.f33917f[i11].setOnClickListener(new hh.z0(this, i11, 14));
            i11++;
        }
        setAlpha(0.0f);
        setTranslationX(AndroidUtilities.dp(32.0f));
        animate().alpha(1.0f).translationX(0.0f).setDuration(150L).start();
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.h.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.h.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new s0());
            sharedInstance.setLocalSink(this.h.d, false);
        }
        this.f33914b.setCurrentItem(this.f33923y ? 1 : 0);
        ri0 ri0Var = new ri0(context);
        this.f33916e = ri0Var;
        ri0Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        ri0Var.setBackground(g6.K(AndroidUtilities.dp(48.0f), i0.b.k(-16777216, 76)));
        oi0 oi0Var = new oi0(R.raw.voice_mini, "" + R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        ri0Var.setAnimation(oi0Var);
        ri0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.v = true;
        oi0Var.K(69);
        ri0Var.setOnClickListener(new xh0(12, this, oi0Var));
        addView(ri0Var, z5.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(u0 u0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (u0Var.f33918n == u0Var.f33919r || sharedInstance == null) {
            return;
        }
        boolean zIsFrontFaceCamera = sharedInstance.isFrontFaceCamera();
        int i10 = u0Var.f33918n;
        if ((i10 == 1 && !zIsFrontFaceCamera) || (i10 == 2 && zIsFrontFaceCamera)) {
            u0Var.c();
            u0Var.f33920s = false;
            VoIPService.getSharedInstance().switchCamera();
            u0Var.h.setAlpha(0.0f);
        }
        u0Var.f33919r = u0Var.f33918n;
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f33913a) {
            return;
        }
        this.f33913a = true;
        c();
        s50 s50Var = ((d40) this).A;
        boolean z12 = s50Var.f42497v0.v;
        s50Var.f42497v0 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z11) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z10, z12);
            }
            if (z10 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            s50Var.N1(true, false);
            s50Var.W0.sortParticipants();
            s50Var.O0(true);
            s50Var.f42426e.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(AndroidUtilities.dp(32.0f)).setDuration(150L).setListener(new f11(this, 12));
        invalidate();
    }

    public final void c() {
        r2 r2Var = this.h;
        if (this.f33920s) {
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
                        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb" + this.f33919r + ".jpg")));
                        View viewFindViewWithTag = this.f33914b.findViewWithTag(Integer.valueOf(this.f33919r - (1 ^ (this.f33923y ? 1 : 0))));
                        if (viewFindViewWithTag instanceof ImageView) {
                            ((ImageView) viewFindViewWithTag).setImageBitmap(bitmapCreateScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void d() {
        int i10 = this.f33922x;
        TextView[] textViewArr = this.f33917f;
        TextView textView = textViewArr[i10];
        TextView textView2 = i10 < textViewArr.length + (-1) ? textViewArr[i10 + 1] : null;
        getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * this.f33921w;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = this.f33922x;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f12 = this.f33921w;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.f33921w;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f11);
            textViewArr[i11].setScaleX(f10);
            textViewArr[i11].setScaleY(f10);
        }
        this.d.setTranslationX(measuredWidth2);
        this.f33915c.invalidate();
        boolean z10 = this.f33923y;
        r2 r2Var = this.h;
        if (z10 && this.f33922x == 0 && this.f33921w <= 0.0f) {
            r2Var.setVisibility(4);
            return;
        }
        r2Var.setVisibility(0);
        if (this.f33922x + (!z10 ? 1 : 0) == this.f33918n) {
            r2Var.setTranslationX((-this.f33921w) * getMeasuredWidth());
        } else {
            r2Var.setTranslationX((1.0f - this.f33921w) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.b.k(g6.w0(null, g6.f23117gg, false), (int) (getAlpha() * 1.0f * 255.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
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
        if (this.f33920s) {
            return;
        }
        this.f33920s = true;
        this.h.animate().alpha(1.0f).setDuration(250L);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        if (VoIPService.getSharedInstance() != null) {
            this.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
        d();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f33915c.getLayoutParams();
        if (z10) {
            int iDp = AndroidUtilities.dp(80.0f);
            marginLayoutParams.leftMargin = iDp;
            marginLayoutParams.rightMargin = iDp;
        } else {
            int iDp2 = AndroidUtilities.dp(16.0f);
            marginLayoutParams.leftMargin = iDp2;
            marginLayoutParams.rightMargin = iDp2;
        }
        ri0 ri0Var = this.f33916e;
        if (ri0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ri0Var.getLayoutParams();
            if (z10) {
                int iDp3 = AndroidUtilities.dp(88.0f);
                marginLayoutParams2.leftMargin = iDp3;
                marginLayoutParams2.rightMargin = iDp3;
            } else {
                int iDp4 = AndroidUtilities.dp(24.0f);
                marginLayoutParams2.leftMargin = iDp4;
                marginLayoutParams2.rightMargin = iDp4;
            }
        }
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
        ((FrameLayout.LayoutParams) this.f33915c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
        ((FrameLayout.LayoutParams) this.f33916e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(136.0f) + i10;
    }
}
