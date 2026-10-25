package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h31;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.g40;
import org.telegram.ui.ga;
import org.telegram.ui.v50;
import org.webrtc.RendererCommon;
public abstract class v0 extends FrameLayout implements VoIPService.StateListener {
    public boolean f34137a;
    public final a5.m f34138b;
    public final ei.n f34139c;
    public final LinearLayout d;
    public final ak0 e;
    public final TextView[] f34140f;
    public final t2 h;
    public int f34141n;
    public int f34142r;
    public boolean f34143s;
    public boolean v;
    public float f34144w;
    public int f34145x;
    public final boolean f34146y;

    public v0(Context context, boolean z10) {
        super(context);
        int i10;
        this.f34141n = 1;
        this.f34142r = 1;
        this.f34146y = z10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f34140f = new TextView[i10];
        a5.m mVar = new a5.m(context);
        this.f34138b = mVar;
        AndroidUtilities.setViewPagerEdgeEffectColor(mVar, 2130706432);
        mVar.setAdapter(new u0(this));
        mVar.setPageMargin(0);
        mVar.setOffscreenPageLimit(1);
        addView(mVar, gb1.g(-1.0f, -1));
        mVar.b(new s0(this));
        t2 t2Var = new t2(context, false, false);
        this.h = t2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        s2 s2Var = t2Var.d;
        s2Var.setScalingType(scalingType);
        t2Var.f34110a0 = 1;
        t2Var.f34114c0 = true;
        s2Var.setAlpha(0.0f);
        s2Var.setRotateTextureWithScreen(true);
        s2Var.setUseCameraRotation(true);
        addView(t2Var, gb1.g(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        kVar.setBackgroundColor(0);
        f7.m(kVar, 1, y6.f23436hg, null);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new ga(this, 18));
        addView(kVar);
        ei.n nVar = new ei.n(this, getContext());
        this.f34139c = nVar;
        nVar.setMinWidth(AndroidUtilities.dp(64.0f));
        nVar.setTag(-1);
        nVar.setTextSize(1, 14.0f);
        int i11 = y6.f23548ng;
        f7.V(nVar, i11, null);
        nVar.setGravity(17);
        nVar.setTypeface(AndroidUtilities.bold());
        nVar.setText(LocaleController.getString(R.string.VoipShareVideo));
        int dp = AndroidUtilities.dp(6.0f);
        int o10 = i0.a.o(y6.x0(null, i11, false), 76);
        nVar.setForeground(y6.j0(dp, dp, dp, dp, 0, o10, o10));
        nVar.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        nVar.setOnClickListener(new ig.d0(this, 13));
        addView(nVar, gb1.h(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, gb1.i(-2, 64, 80));
        int i12 = 0;
        while (true) {
            TextView[] textViewArr = this.f34140f;
            if (i12 >= textViewArr.length) {
                break;
            }
            textViewArr[i12] = new TextView(context);
            this.f34140f[i12].setTextSize(1, 12.0f);
            this.f34140f[i12].setTextColor(-1);
            this.f34140f[i12].setTypeface(AndroidUtilities.bold());
            this.f34140f[i12].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.f34140f[i12].setGravity(16);
            this.f34140f[i12].setSingleLine(true);
            this.d.addView(this.f34140f[i12], gb1.r(-2, -1));
            if (i12 == 0 && this.f34146y) {
                this.f34140f[i12].setText(LocaleController.getString(R.string.VoipPhoneScreen));
            } else if (i12 != 0 && (i12 != 1 || !this.f34146y)) {
                this.f34140f[i12].setText(LocaleController.getString(R.string.VoipBackCamera));
            } else {
                this.f34140f[i12].setText(LocaleController.getString(R.string.VoipFrontCamera));
            }
            this.f34140f[i12].setOnClickListener(new ai.w(this, i12, 21));
            i12++;
        }
        setAlpha(0.0f);
        setTranslationX(AndroidUtilities.dp(32.0f));
        animate().alpha(1.0f).translationX(0.0f).setDuration(150L).start();
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.h.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.h.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new Object());
            sharedInstance.setLocalSink(this.h.d, false);
        }
        this.f34138b.setCurrentItem(this.f34146y ? 1 : 0);
        ?? imageView = new ImageView(context);
        this.e = imageView;
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setBackground(y6.K(AndroidUtilities.dp(48.0f), i0.a.o(-16777216, 76)));
        xj0 xj0Var = new xj0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        imageView.setAnimation(xj0Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.v = true;
        xj0Var.M(69);
        imageView.setOnClickListener(new k51(5, this, xj0Var));
        addView((View) imageView, gb1.h(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(v0 v0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (v0Var.f34141n != v0Var.f34142r && sharedInstance != null) {
            boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
            int i10 = v0Var.f34141n;
            if ((i10 == 1 && !isFrontFaceCamera) || (i10 == 2 && isFrontFaceCamera)) {
                v0Var.c();
                v0Var.f34143s = false;
                VoIPService.getSharedInstance().switchCamera();
                v0Var.h.setAlpha(0.0f);
            }
            v0Var.f34142r = v0Var.f34141n;
        }
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f34137a) {
            return;
        }
        this.f34137a = true;
        c();
        v50 v50Var = ((g40) this).E;
        boolean z12 = v50Var.f44711z0.v;
        v50Var.f44711z0 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z11) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z10, z12);
            }
            if (z10 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            v50Var.O1(true, false);
            v50Var.f44607a1.sortParticipants();
            v50Var.O0(true);
            v50Var.e.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(AndroidUtilities.dp(32.0f)).setDuration(150L).setListener(new h31(this, 12));
        invalidate();
    }

    public final void c() {
        t2 t2Var = this.h;
        if (this.f34143s) {
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
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(filesDirFixed, "cthumb" + this.f34142r + ".jpg")));
                        View findViewWithTag = this.f34138b.findViewWithTag(Integer.valueOf(this.f34142r - (1 ^ (this.f34146y ? 1 : 0))));
                        if (findViewWithTag instanceof ImageView) {
                            ((ImageView) findViewWithTag).setImageBitmap(createScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void d() {
        TextView textView;
        int i10 = this.f34145x;
        TextView[] textViewArr = this.f34140f;
        TextView textView2 = textViewArr[i10];
        if (i10 < textViewArr.length - 1) {
            textView = textViewArr[i10 + 1];
        } else {
            textView = null;
        }
        getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * this.f34144w;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = this.f34145x;
            float f7 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = this.f34144w;
                    f10 = 1.0f - (0.3f * f11);
                    f7 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = this.f34144w;
                    f10 = 0.7f + (0.3f * f12);
                    f7 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f7);
            textViewArr[i11].setScaleY(f7);
        }
        this.d.setTranslationX(measuredWidth2);
        this.f34139c.invalidate();
        boolean z10 = this.f34146y;
        t2 t2Var = this.h;
        if (z10 && this.f34145x == 0 && this.f34144w <= 0.0f) {
            t2Var.setVisibility(4);
            return;
        }
        t2Var.setVisibility(0);
        if (this.f34145x + (!z10 ? 1 : 0) == this.f34141n) {
            t2Var.setTranslationX((-this.f34144w) * getMeasuredWidth());
        } else {
            t2Var.setTranslationX((1.0f - this.f34144w) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.a.o(y6.x0(null, y6.gg, false), (int) (getAlpha() * 1.0f * 255.0f));
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
        org.telegram.messenger.voip.t0.a(this);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        if (!this.f34143s) {
            this.f34143s = true;
            this.h.animate().alpha(1.0f).setDuration(250L);
        }
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
        boolean z10;
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f34139c.getLayoutParams();
        if (z10) {
            int dp = AndroidUtilities.dp(80.0f);
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp;
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
        }
        ak0 ak0Var = this.e;
        if (ak0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ak0Var.getLayoutParams();
            if (z10) {
                int dp3 = AndroidUtilities.dp(88.0f);
                marginLayoutParams2.leftMargin = dp3;
                marginLayoutParams2.rightMargin = dp3;
            } else {
                int dp4 = AndroidUtilities.dp(24.0f);
                marginLayoutParams2.leftMargin = dp4;
                marginLayoutParams2.rightMargin = dp4;
            }
        }
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
        ((FrameLayout.LayoutParams) this.f34139c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(136.0f) + i10;
    }
}
