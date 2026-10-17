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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.d40;
import org.telegram.ui.ga;
import org.telegram.ui.s50;
import org.webrtc.RendererCommon;
import w7.z5;
public abstract class v0 extends FrameLayout implements VoIPService.StateListener {
    public boolean f31819a;
    public final z4.g f31820b;
    public final di.n f31821c;
    public final LinearLayout d;
    public final xj0 e;
    public final TextView[] f31822f;
    public final q2 h;
    public int f31823n;
    public int f31824r;
    public boolean f31825s;
    public boolean v;
    public float f31826w;
    public int f31827x;
    public final boolean f31828y;

    public v0(Context context, boolean z10) {
        super(context);
        int i10;
        this.f31823n = 1;
        this.f31824r = 1;
        this.f31828y = z10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f31822f = new TextView[i10];
        z4.g gVar = new z4.g(context);
        this.f31820b = gVar;
        AndroidUtilities.setViewPagerEdgeEffectColor(gVar, 2130706432);
        gVar.setAdapter(new u0(this));
        gVar.setPageMargin(0);
        gVar.setOffscreenPageLimit(1);
        addView(gVar, z5.d(-1.0f, -1));
        gVar.b(new s0(this));
        q2 q2Var = new q2(context, false, false);
        this.h = q2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        p2 p2Var = q2Var.d;
        p2Var.setScalingType(scalingType);
        q2Var.f31684a0 = 1;
        q2Var.f31688c0 = true;
        p2Var.setAlpha(0.0f);
        p2Var.setRotateTextureWithScreen(true);
        p2Var.setUseCameraRotation(true);
        addView(q2Var, z5.d(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        kVar.setBackgroundColor(0);
        kVar.C(h6.x0(null, h6.f21065hg, false), false);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new ga(this, 17));
        addView(kVar);
        di.n nVar = new di.n(this, getContext());
        this.f31821c = nVar;
        nVar.setMinWidth(AndroidUtilities.dp(64.0f));
        nVar.setTag(-1);
        nVar.setTextSize(1, 14.0f);
        int i11 = h6.f21179ng;
        nVar.setTextColor(h6.x0(null, i11, false));
        nVar.setGravity(17);
        nVar.setTypeface(AndroidUtilities.bold());
        nVar.setText(LocaleController.getString(R.string.VoipShareVideo));
        int dp = AndroidUtilities.dp(6.0f);
        int o10 = i0.b.o(h6.x0(null, i11, false), 76);
        nVar.setForeground(h6.j0(dp, dp, dp, dp, 0, o10, o10));
        nVar.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        nVar.setOnClickListener(new hg.r0(this, 12));
        addView(nVar, z5.a(48.0f, 0.0f, 0.0f, 0.0f, 64.0f, -1, 80));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, z5.e(-2, 64, 80));
        int i12 = 0;
        while (true) {
            TextView[] textViewArr = this.f31822f;
            if (i12 >= textViewArr.length) {
                break;
            }
            textViewArr[i12] = new TextView(context);
            this.f31822f[i12].setTextSize(1, 12.0f);
            this.f31822f[i12].setTextColor(-1);
            this.f31822f[i12].setTypeface(AndroidUtilities.bold());
            this.f31822f[i12].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.f31822f[i12].setGravity(16);
            this.f31822f[i12].setSingleLine(true);
            this.d.addView(this.f31822f[i12], z5.n(-2, -1));
            if (i12 == 0 && this.f31828y) {
                this.f31822f[i12].setText(LocaleController.getString(R.string.VoipPhoneScreen));
            } else if (i12 != 0 && (i12 != 1 || !this.f31828y)) {
                this.f31822f[i12].setText(LocaleController.getString(R.string.VoipBackCamera));
            } else {
                this.f31822f[i12].setText(LocaleController.getString(R.string.VoipFrontCamera));
            }
            this.f31822f[i12].setOnClickListener(new ai.n1(this, i12, 17));
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
        this.f31820b.setCurrentItem(this.f31828y ? 1 : 0);
        ?? imageView = new ImageView(context);
        this.e = imageView;
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setBackground(h6.K(AndroidUtilities.dp(48.0f), i0.b.o(-16777216, 76)));
        uj0 uj0Var = new uj0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        imageView.setAnimation(uj0Var);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.v = true;
        uj0Var.M(69);
        imageView.setOnClickListener(new g51(4, this, uj0Var));
        addView((View) imageView, z5.a(48.0f, 24.0f, 0.0f, 0.0f, 136.0f, 48, 83));
    }

    public static void a(v0 v0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (v0Var.f31823n != v0Var.f31824r && sharedInstance != null) {
            boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
            int i10 = v0Var.f31823n;
            if ((i10 == 1 && !isFrontFaceCamera) || (i10 == 2 && isFrontFaceCamera)) {
                v0Var.c();
                v0Var.f31825s = false;
                VoIPService.getSharedInstance().switchCamera();
                v0Var.h.setAlpha(0.0f);
            }
            v0Var.f31824r = v0Var.f31823n;
        }
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f31819a) {
            return;
        }
        this.f31819a = true;
        c();
        s50 s50Var = ((d40) this).E;
        boolean z12 = s50Var.f41017z0.v;
        s50Var.f41017z0 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z11) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z10, z12);
            }
            if (z10 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            s50Var.O1(true, false);
            s50Var.f40913a1.sortParticipants();
            s50Var.P0(true);
            s50Var.e.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(AndroidUtilities.dp(32.0f)).setDuration(150L).setListener(new n31(this, 10));
        invalidate();
    }

    public final void c() {
        q2 q2Var = this.h;
        if (this.f31825s) {
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
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(filesDirFixed, "cthumb" + this.f31824r + ".jpg")));
                        View findViewWithTag = this.f31820b.findViewWithTag(Integer.valueOf(this.f31824r - (1 ^ (this.f31828y ? 1 : 0))));
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
        int i10 = this.f31827x;
        TextView[] textViewArr = this.f31822f;
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
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * this.f31826w;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = this.f31827x;
            float f7 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = this.f31826w;
                    f10 = 1.0f - (0.3f * f11);
                    f7 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = this.f31826w;
                    f10 = 0.7f + (0.3f * f12);
                    f7 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f7);
            textViewArr[i11].setScaleY(f7);
        }
        this.d.setTranslationX(measuredWidth2);
        this.f31821c.invalidate();
        boolean z10 = this.f31828y;
        q2 q2Var = this.h;
        if (z10 && this.f31827x == 0 && this.f31826w <= 0.0f) {
            q2Var.setVisibility(4);
            return;
        }
        q2Var.setVisibility(0);
        if (this.f31827x + (!z10 ? 1 : 0) == this.f31823n) {
            q2Var.setTranslationX((-this.f31826w) * getMeasuredWidth());
        } else {
            q2Var.setTranslationX((1.0f - this.f31826w) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.b.o(h6.x0(null, h6.f21049gg, false), (int) (getAlpha() * 1.0f * 255.0f));
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
        if (!this.f31825s) {
            this.f31825s = true;
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
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f31821c.getLayoutParams();
        if (z10) {
            int dp = AndroidUtilities.dp(80.0f);
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp;
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
        }
        xj0 xj0Var = this.e;
        if (xj0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) xj0Var.getLayoutParams();
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
        ((FrameLayout.LayoutParams) this.f31821c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(136.0f) + i10;
    }
}
