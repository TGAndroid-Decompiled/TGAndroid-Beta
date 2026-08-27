package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.BubbleActivity;

public final class ve0 extends FrameLayout implements mz, lh.ob {
    public final int A;
    public final Rect A0;
    public final int B;
    public final Matrix B0;
    public float C;
    public final Paint C0;
    public float D;
    public final int D0;
    public float E;
    public final org.telegram.ui.ActionBar.c6 E0;
    public float F;
    public int F0;
    public float G;
    public int G0;
    public float H;
    public float I;
    public int J;
    public int K;
    public float L;
    public float M;
    public float N;
    public float O;
    public int P;
    public float Q;
    public boolean R;
    public final re0 S;
    public float T;
    public PointF U;
    public float V;
    public float W;

    public boolean f33378a;

    public MediaController.SavedFilterState f33379a0;

    public final int f33380b;

    public final FrameLayout f33381b0;

    public final int f33382c;

    public final TextView f33383c0;
    public final int d;

    public final TextView f33384d0;

    public final int f33385e;

    public final TextureView f33386e0;

    public final int f33387f;

    public final boolean f33388f0;

    public final boolean f33389g0;
    public final int h;

    public jz f33390h0;

    public final jh f33391i0;

    public final FrameLayout f33392j0;

    public final ke0 f33393k0;

    public final me0 f33394l0;
    public final TextView m0;

    public final int f33395n;

    public final TextView f33396n0;

    public final TextView f33397o0;

    public final FrameLayout f33398p0;

    public final RadioButton[] f33399q0;

    public final int f33400r;

    public final rc0 f33401r0;

    public final int f33402s;

    public final boolean f33403s0;

    public final boolean f33404t0;

    public int f33405u0;
    public final int v;

    public final ImageView f33406v0;

    public final int f33407w;

    public final ImageView f33408w0;

    public final int f33409x;

    public final ImageView f33410x0;

    public final int f33411y;

    public final Bitmap f33412y0;

    public final Bitmap f33413z0;

    public ve0(Context context, a61 a61Var, Bitmap bitmap, Bitmap bitmap2, int i10, MediaController.SavedFilterState savedFilterState, rc0 rc0Var, int i11, boolean z10, boolean z11, z9 z9Var, org.telegram.ui.ActionBar.c6 c6Var) {
        float f10;
        super(context);
        this.f33399q0 = new RadioButton[4];
        this.A0 = new Rect();
        this.B0 = new Matrix();
        this.C0 = new Paint(2);
        this.f33389g0 = z11;
        this.E0 = c6Var;
        boolean z12 = context instanceof BubbleActivity;
        this.f33404t0 = z12;
        this.f33401r0 = rc0Var;
        this.f33403s0 = z10;
        this.B = 0;
        if (i11 == 1) {
            this.B = 1;
            this.f33395n = 0;
        } else if (i11 == 0) {
            this.f33395n = -1;
        }
        int i12 = this.B;
        this.f33380b = i12;
        this.f33382c = i12 + 1;
        this.d = i12 + 2;
        this.f33385e = i12 + 3;
        this.f33387f = i12 + 4;
        this.h = i12 + 5;
        this.f33400r = i12 + 6;
        this.f33402s = i12 + 7;
        int i13 = i12 + 9;
        this.B = i13;
        this.v = i12 + 8;
        if (i11 == 2) {
            this.B = i12 + 10;
            this.f33395n = i13;
        }
        if (a61Var == null) {
            int i14 = this.B;
            this.B = i14 + 1;
            this.f33407w = i14;
        } else {
            this.f33407w = -1;
        }
        int i15 = this.B;
        this.f33409x = i15;
        this.f33411y = i15 + 1;
        this.B = i15 + 3;
        this.A = i15 + 2;
        if (savedFilterState != null) {
            this.C = savedFilterState.enhanceValue;
            this.I = savedFilterState.softenSkinValue;
            this.D = savedFilterState.exposureValue;
            this.E = savedFilterState.contrastValue;
            this.F = savedFilterState.warmthValue;
            this.G = savedFilterState.saturationValue;
            this.H = savedFilterState.fadeValue;
            this.J = savedFilterState.tintShadowsColor;
            this.K = savedFilterState.tintHighlightsColor;
            this.L = savedFilterState.highlightsValue;
            this.M = savedFilterState.shadowsValue;
            this.N = savedFilterState.vignetteValue;
            this.O = savedFilterState.grainValue;
            this.P = savedFilterState.blurType;
            this.Q = savedFilterState.sharpenValue;
            this.S = savedFilterState.curvesToolValue;
            this.T = savedFilterState.blurExcludeSize;
            this.U = savedFilterState.blurExcludePoint;
            this.V = savedFilterState.blurExcludeBlurSize;
            this.R = savedFilterState.isEmpty();
            this.W = savedFilterState.blurAngle;
            this.f33379a0 = savedFilterState;
        } else {
            this.S = new re0();
            this.T = 0.35f;
            this.U = new PointF(0.5f, 0.5f);
            this.V = 0.15f;
            this.W = 1.5707964f;
            this.R = true;
        }
        this.f33412y0 = bitmap;
        this.f33413z0 = bitmap2;
        this.D0 = i10;
        if (a61Var != null) {
            this.f33386e0 = a61Var;
            a61Var.setDelegate(new ne0(this));
        } else {
            this.f33388f0 = true;
            pe0 pe0Var = new pe0(this, context);
            this.f33386e0 = pe0Var;
            if (z11) {
                addView(pe0Var, h7.z5.e(-1, -1, 51));
            }
            pe0Var.setVisibility(4);
            pe0Var.setSurfaceTextureListener(new qe0(this, z11, z9Var));
        }
        ke0 ke0Var = new ke0(context);
        ke0Var.f30083a = new PointF();
        ke0Var.d = new tu0();
        ke0Var.f30086e = new PointF(0.5f, 0.5f);
        ke0Var.f30087f = 0.15f;
        ke0Var.h = 0.35f;
        ke0Var.f30089r = new RectF();
        ke0Var.f30092x = 1.0f;
        ke0Var.B = true;
        Paint paint = new Paint(1);
        ke0Var.E = paint;
        Paint paint2 = new Paint(1);
        ke0Var.F = paint2;
        ke0Var.setWillNotDraw(false);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        ke0Var.G = z12;
        this.f33393k0 = ke0Var;
        ke0Var.setVisibility(4);
        if (z11) {
            addView(ke0Var, h7.z5.e(-1, -1, 51));
        }
        ke0Var.setDelegate(new ne0(this));
        re0 re0Var = this.S;
        me0 me0Var = new me0(context);
        me0Var.f30656a = 0;
        me0Var.f30658c = true;
        me0Var.f30659e = new yj0();
        Paint paint3 = new Paint(1);
        me0Var.f30660f = paint3;
        Paint paint4 = new Paint(1);
        me0Var.h = paint4;
        Paint paint5 = new Paint(1);
        me0Var.f30661n = paint5;
        TextPaint textPaint = new TextPaint(1);
        me0Var.f30662r = textPaint;
        me0Var.f30663s = new Path();
        me0Var.setWillNotDraw(false);
        me0Var.f30664w = re0Var;
        paint3.setColor(-1711276033);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint3.setStyle(style);
        paint4.setColor(-1711276033);
        paint4.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint4.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint5.setStyle(style);
        textPaint.setColor(-4210753);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.f33394l0 = me0Var;
        me0Var.setDelegate(new ne0(this));
        me0Var.setVisibility(4);
        if (z11) {
            addView(me0Var, h7.z5.e(-1, -1, 51));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33381b0 = frameLayout;
        addView(frameLayout, h7.z5.e(-1, (!z11 ? 40 : 0) + 186, 83));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackgroundColor(-16777216);
        frameLayout.addView(frameLayout2, h7.z5.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.f33384d0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        TextView textViewH = org.telegram.ui.Cells.pa.h(frameLayout2, textView, h7.z5.e(-2, -1, 51), context);
        this.f33383c0 = textViewH;
        textViewH.setTextSize(1, 14.0f);
        int i16 = org.telegram.ui.ActionBar.g6.f23449zf;
        textViewH.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var));
        textViewH.setGravity(17);
        textViewH.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textViewH.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textViewH.setText(LocaleController.getString(R.string.Done).toUpperCase());
        textViewH.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textViewH, h7.z5.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.addView(linearLayout, h7.z5.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.f33406v0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_photo_settings);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i16, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, -1));
        linearLayout.addView(imageView, h7.z5.n(56, 48));
        final int i17 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final ve0 f31269b;

            {
                this.f31269b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        ve0 ve0Var = this.f31269b;
                        ve0Var.f33405u0 = 0;
                        ve0Var.f33406v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var.f33408w0.setColorFilter((ColorFilter) null);
                        ve0Var.f33410x0.setColorFilter((ColorFilter) null);
                        ve0Var.f();
                        break;
                    case 1:
                        ve0 ve0Var2 = this.f31269b;
                        ve0Var2.f33405u0 = 1;
                        ve0Var2.f33406v0.setColorFilter((ColorFilter) null);
                        ve0Var2.f33408w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var2.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var2.f33410x0.setColorFilter((ColorFilter) null);
                        ve0Var2.f();
                        break;
                    case 2:
                        ve0 ve0Var3 = this.f31269b;
                        ve0Var3.f33405u0 = 2;
                        ve0Var3.f33406v0.setColorFilter((ColorFilter) null);
                        ve0Var3.f33408w0.setColorFilter((ColorFilter) null);
                        ve0Var3.f33410x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var3.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var3.f();
                        break;
                    case 3:
                        ve0 ve0Var4 = this.f31269b;
                        ve0Var4.getClass();
                        int iIntValue = ((Integer) view.getTag()).intValue();
                        ve0Var4.S.f32147f = iIntValue;
                        int i18 = 0;
                        while (i18 < 4) {
                            ve0Var4.f33399q0[i18].a(i18 == iIntValue, true);
                            i18++;
                        }
                        ve0Var4.f33394l0.invalidate();
                        break;
                    case 4:
                        ve0 ve0Var5 = this.f31269b;
                        ve0Var5.P = 0;
                        ve0Var5.h();
                        ve0Var5.f33393k0.setVisibility(4);
                        jz jzVar = ve0Var5.f33390h0;
                        if (jzVar != null) {
                            jzVar.e(false, false, false);
                        }
                        break;
                    case 5:
                        ve0 ve0Var6 = this.f31269b;
                        ve0Var6.P = 1;
                        ve0Var6.h();
                        ke0 ke0Var2 = ve0Var6.f33393k0;
                        ke0Var2.setVisibility(0);
                        ke0Var2.setType(1);
                        jz jzVar2 = ve0Var6.f33390h0;
                        if (jzVar2 != null) {
                            jzVar2.e(false, false, false);
                        }
                        break;
                    default:
                        ve0 ve0Var7 = this.f31269b;
                        ve0Var7.P = 2;
                        ve0Var7.h();
                        ke0 ke0Var3 = ve0Var7.f33393k0;
                        ke0Var3.setVisibility(0);
                        ke0Var3.setType(0);
                        jz jzVar3 = ve0Var7.f33390h0;
                        if (jzVar3 != null) {
                            jzVar3.e(false, false, false);
                        }
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f33408w0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_photo_blur);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, -1));
        linearLayout.addView(imageView2, h7.z5.n(56, 48));
        final int i18 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) {

            public final ve0 f31269b;

            {
                this.f31269b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        ve0 ve0Var = this.f31269b;
                        ve0Var.f33405u0 = 0;
                        ve0Var.f33406v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var.f33408w0.setColorFilter((ColorFilter) null);
                        ve0Var.f33410x0.setColorFilter((ColorFilter) null);
                        ve0Var.f();
                        break;
                    case 1:
                        ve0 ve0Var2 = this.f31269b;
                        ve0Var2.f33405u0 = 1;
                        ve0Var2.f33406v0.setColorFilter((ColorFilter) null);
                        ve0Var2.f33408w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var2.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var2.f33410x0.setColorFilter((ColorFilter) null);
                        ve0Var2.f();
                        break;
                    case 2:
                        ve0 ve0Var3 = this.f31269b;
                        ve0Var3.f33405u0 = 2;
                        ve0Var3.f33406v0.setColorFilter((ColorFilter) null);
                        ve0Var3.f33408w0.setColorFilter((ColorFilter) null);
                        ve0Var3.f33410x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var3.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var3.f();
                        break;
                    case 3:
                        ve0 ve0Var4 = this.f31269b;
                        ve0Var4.getClass();
                        int iIntValue = ((Integer) view.getTag()).intValue();
                        ve0Var4.S.f32147f = iIntValue;
                        int i19 = 0;
                        while (i19 < 4) {
                            ve0Var4.f33399q0[i19].a(i19 == iIntValue, true);
                            i19++;
                        }
                        ve0Var4.f33394l0.invalidate();
                        break;
                    case 4:
                        ve0 ve0Var5 = this.f31269b;
                        ve0Var5.P = 0;
                        ve0Var5.h();
                        ve0Var5.f33393k0.setVisibility(4);
                        jz jzVar = ve0Var5.f33390h0;
                        if (jzVar != null) {
                            jzVar.e(false, false, false);
                        }
                        break;
                    case 5:
                        ve0 ve0Var6 = this.f31269b;
                        ve0Var6.P = 1;
                        ve0Var6.h();
                        ke0 ke0Var2 = ve0Var6.f33393k0;
                        ke0Var2.setVisibility(0);
                        ke0Var2.setType(1);
                        jz jzVar2 = ve0Var6.f33390h0;
                        if (jzVar2 != null) {
                            jzVar2.e(false, false, false);
                        }
                        break;
                    default:
                        ve0 ve0Var7 = this.f31269b;
                        ve0Var7.P = 2;
                        ve0Var7.h();
                        ke0 ke0Var3 = ve0Var7.f33393k0;
                        ke0Var3.setVisibility(0);
                        ke0Var3.setType(0);
                        jz jzVar3 = ve0Var7.f33390h0;
                        if (jzVar3 != null) {
                            jzVar3.e(false, false, false);
                        }
                        break;
                }
            }
        });
        if (a61Var != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.f33410x0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.msg_photo_curve);
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, -1));
        linearLayout.addView(imageView3, h7.z5.n(56, 48));
        final int i19 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) {

            public final ve0 f31269b;

            {
                this.f31269b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        ve0 ve0Var = this.f31269b;
                        ve0Var.f33405u0 = 0;
                        ve0Var.f33406v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var.f33408w0.setColorFilter((ColorFilter) null);
                        ve0Var.f33410x0.setColorFilter((ColorFilter) null);
                        ve0Var.f();
                        break;
                    case 1:
                        ve0 ve0Var2 = this.f31269b;
                        ve0Var2.f33405u0 = 1;
                        ve0Var2.f33406v0.setColorFilter((ColorFilter) null);
                        ve0Var2.f33408w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var2.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var2.f33410x0.setColorFilter((ColorFilter) null);
                        ve0Var2.f();
                        break;
                    case 2:
                        ve0 ve0Var3 = this.f31269b;
                        ve0Var3.f33405u0 = 2;
                        ve0Var3.f33406v0.setColorFilter((ColorFilter) null);
                        ve0Var3.f33408w0.setColorFilter((ColorFilter) null);
                        ve0Var3.f33410x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var3.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var3.f();
                        break;
                    case 3:
                        ve0 ve0Var4 = this.f31269b;
                        ve0Var4.getClass();
                        int iIntValue = ((Integer) view.getTag()).intValue();
                        ve0Var4.S.f32147f = iIntValue;
                        int i110 = 0;
                        while (i110 < 4) {
                            ve0Var4.f33399q0[i110].a(i110 == iIntValue, true);
                            i110++;
                        }
                        ve0Var4.f33394l0.invalidate();
                        break;
                    case 4:
                        ve0 ve0Var5 = this.f31269b;
                        ve0Var5.P = 0;
                        ve0Var5.h();
                        ve0Var5.f33393k0.setVisibility(4);
                        jz jzVar = ve0Var5.f33390h0;
                        if (jzVar != null) {
                            jzVar.e(false, false, false);
                        }
                        break;
                    case 5:
                        ve0 ve0Var6 = this.f31269b;
                        ve0Var6.P = 1;
                        ve0Var6.h();
                        ke0 ke0Var2 = ve0Var6.f33393k0;
                        ke0Var2.setVisibility(0);
                        ke0Var2.setType(1);
                        jz jzVar2 = ve0Var6.f33390h0;
                        if (jzVar2 != null) {
                            jzVar2.e(false, false, false);
                        }
                        break;
                    default:
                        ve0 ve0Var7 = this.f31269b;
                        ve0Var7.P = 2;
                        ve0Var7.h();
                        ke0 ke0Var3 = ve0Var7.f33393k0;
                        ke0Var3.setVisibility(0);
                        ke0Var3.setType(0);
                        jz jzVar3 = ve0Var7.f33390h0;
                        if (jzVar3 != null) {
                            jzVar3.e(false, false, false);
                        }
                        break;
                }
            }
        });
        jh jhVar = new jh(context, 1);
        this.f33391i0 = jhVar;
        f2.k0 k0Var = new f2.k0();
        k0Var.j1(1);
        jhVar.setLayoutManager(k0Var);
        jhVar.setClipToPadding(false);
        jhVar.setOverScrollMode(2);
        jhVar.setAdapter(new ue0(this, context));
        frameLayout.addView(jhVar, h7.z5.e(-1, (!z11 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f33398p0 = frameLayout3;
        frameLayout3.setVisibility(4);
        frameLayout.addView(frameLayout3, h7.z5.d(-1, 78.0f, 1, 0.0f, (!z11 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout3.addView(linearLayout2, h7.z5.e(-2, -2, 1));
        for (int i20 = 0; i20 < 4; i20++) {
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setTag(Integer.valueOf(i20));
            this.f33399q0[i20] = new RadioButton(context);
            this.f33399q0[i20].setSize(AndroidUtilities.dp(20.0f));
            frameLayout4.addView(this.f33399q0[i20], h7.z5.e(30, 30, 49));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 12.0f);
            textView2.setGravity(16);
            if (i20 == 0) {
                String string = LocaleController.getString(R.string.CurvesAll);
                textView2.setText(string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase());
                textView2.setTextColor(-1);
                this.f33399q0[i20].b(-1, -1);
            } else {
                if (i20 == 1) {
                    String string2 = LocaleController.getString(R.string.CurvesRed);
                    textView2.setText(string2.substring(0, 1).toUpperCase() + string2.substring(1).toLowerCase());
                    textView2.setTextColor(-1684147);
                    this.f33399q0[i20].b(-1684147, -1684147);
                } else if (i20 == 2) {
                    String string3 = LocaleController.getString(R.string.CurvesGreen);
                    textView2.setText(string3.substring(0, 1).toUpperCase() + string3.substring(1).toLowerCase());
                    textView2.setTextColor(-10831009);
                    this.f33399q0[i20].b(-10831009, -10831009);
                } else if (i20 == 3) {
                    String string4 = LocaleController.getString(R.string.CurvesBlue);
                    textView2.setText(string4.substring(0, 1).toUpperCase() + string4.substring(1).toLowerCase());
                    textView2.setTextColor(-12734994);
                    this.f33399q0[i20].b(-12734994, -12734994);
                }
                frameLayout4.addView(textView2, h7.z5.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
                if (i20 == 0) {
                    f10 = 0.0f;
                } else {
                    f10 = 30.0f;
                }
                linearLayout2.addView(frameLayout4, h7.z5.k(f10, 0.0f, 0.0f, 0.0f, -2, -2));
                final int i21 = 3;
                frameLayout4.setOnClickListener(new View.OnClickListener(this) {

                    public final ve0 f31269b;

                    {
                        this.f31269b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                ve0 ve0Var = this.f31269b;
                                ve0Var.f33405u0 = 0;
                                ve0Var.f33406v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var.E0), PorterDuff.Mode.MULTIPLY));
                                ve0Var.f33408w0.setColorFilter((ColorFilter) null);
                                ve0Var.f33410x0.setColorFilter((ColorFilter) null);
                                ve0Var.f();
                                break;
                            case 1:
                                ve0 ve0Var2 = this.f31269b;
                                ve0Var2.f33405u0 = 1;
                                ve0Var2.f33406v0.setColorFilter((ColorFilter) null);
                                ve0Var2.f33408w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var2.E0), PorterDuff.Mode.MULTIPLY));
                                ve0Var2.f33410x0.setColorFilter((ColorFilter) null);
                                ve0Var2.f();
                                break;
                            case 2:
                                ve0 ve0Var3 = this.f31269b;
                                ve0Var3.f33405u0 = 2;
                                ve0Var3.f33406v0.setColorFilter((ColorFilter) null);
                                ve0Var3.f33408w0.setColorFilter((ColorFilter) null);
                                ve0Var3.f33410x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var3.E0), PorterDuff.Mode.MULTIPLY));
                                ve0Var3.f();
                                break;
                            case 3:
                                ve0 ve0Var4 = this.f31269b;
                                ve0Var4.getClass();
                                int iIntValue = ((Integer) view.getTag()).intValue();
                                ve0Var4.S.f32147f = iIntValue;
                                int i110 = 0;
                                while (i110 < 4) {
                                    ve0Var4.f33399q0[i110].a(i110 == iIntValue, true);
                                    i110++;
                                }
                                ve0Var4.f33394l0.invalidate();
                                break;
                            case 4:
                                ve0 ve0Var5 = this.f31269b;
                                ve0Var5.P = 0;
                                ve0Var5.h();
                                ve0Var5.f33393k0.setVisibility(4);
                                jz jzVar = ve0Var5.f33390h0;
                                if (jzVar != null) {
                                    jzVar.e(false, false, false);
                                }
                                break;
                            case 5:
                                ve0 ve0Var6 = this.f31269b;
                                ve0Var6.P = 1;
                                ve0Var6.h();
                                ke0 ke0Var2 = ve0Var6.f33393k0;
                                ke0Var2.setVisibility(0);
                                ke0Var2.setType(1);
                                jz jzVar2 = ve0Var6.f33390h0;
                                if (jzVar2 != null) {
                                    jzVar2.e(false, false, false);
                                }
                                break;
                            default:
                                ve0 ve0Var7 = this.f31269b;
                                ve0Var7.P = 2;
                                ve0Var7.h();
                                ke0 ke0Var3 = ve0Var7.f33393k0;
                                ke0Var3.setVisibility(0);
                                ke0Var3.setType(0);
                                jz jzVar3 = ve0Var7.f33390h0;
                                if (jzVar3 != null) {
                                    jzVar3.e(false, false, false);
                                }
                                break;
                        }
                    }
                });
            }
            frameLayout4.addView(textView2, h7.z5.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            if (i20 == 0) {
                f10 = 0.0f;
            } else {
                f10 = 30.0f;
            }
            linearLayout2.addView(frameLayout4, h7.z5.k(f10, 0.0f, 0.0f, 0.0f, -2, -2));
            final int i22 = 3;
            frameLayout4.setOnClickListener(new View.OnClickListener(this) {

                public final ve0 f31269b;

                {
                    this.f31269b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i22) {
                        case 0:
                            ve0 ve0Var = this.f31269b;
                            ve0Var.f33405u0 = 0;
                            ve0Var.f33406v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var.E0), PorterDuff.Mode.MULTIPLY));
                            ve0Var.f33408w0.setColorFilter((ColorFilter) null);
                            ve0Var.f33410x0.setColorFilter((ColorFilter) null);
                            ve0Var.f();
                            break;
                        case 1:
                            ve0 ve0Var2 = this.f31269b;
                            ve0Var2.f33405u0 = 1;
                            ve0Var2.f33406v0.setColorFilter((ColorFilter) null);
                            ve0Var2.f33408w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var2.E0), PorterDuff.Mode.MULTIPLY));
                            ve0Var2.f33410x0.setColorFilter((ColorFilter) null);
                            ve0Var2.f();
                            break;
                        case 2:
                            ve0 ve0Var3 = this.f31269b;
                            ve0Var3.f33405u0 = 2;
                            ve0Var3.f33406v0.setColorFilter((ColorFilter) null);
                            ve0Var3.f33408w0.setColorFilter((ColorFilter) null);
                            ve0Var3.f33410x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var3.E0), PorterDuff.Mode.MULTIPLY));
                            ve0Var3.f();
                            break;
                        case 3:
                            ve0 ve0Var4 = this.f31269b;
                            ve0Var4.getClass();
                            int iIntValue = ((Integer) view.getTag()).intValue();
                            ve0Var4.S.f32147f = iIntValue;
                            int i110 = 0;
                            while (i110 < 4) {
                                ve0Var4.f33399q0[i110].a(i110 == iIntValue, true);
                                i110++;
                            }
                            ve0Var4.f33394l0.invalidate();
                            break;
                        case 4:
                            ve0 ve0Var5 = this.f31269b;
                            ve0Var5.P = 0;
                            ve0Var5.h();
                            ve0Var5.f33393k0.setVisibility(4);
                            jz jzVar = ve0Var5.f33390h0;
                            if (jzVar != null) {
                                jzVar.e(false, false, false);
                            }
                            break;
                        case 5:
                            ve0 ve0Var6 = this.f31269b;
                            ve0Var6.P = 1;
                            ve0Var6.h();
                            ke0 ke0Var2 = ve0Var6.f33393k0;
                            ke0Var2.setVisibility(0);
                            ke0Var2.setType(1);
                            jz jzVar2 = ve0Var6.f33390h0;
                            if (jzVar2 != null) {
                                jzVar2.e(false, false, false);
                            }
                            break;
                        default:
                            ve0 ve0Var7 = this.f31269b;
                            ve0Var7.P = 2;
                            ve0Var7.h();
                            ke0 ke0Var3 = ve0Var7.f33393k0;
                            ke0Var3.setVisibility(0);
                            ke0Var3.setType(0);
                            jz jzVar3 = ve0Var7.f33390h0;
                            if (jzVar3 != null) {
                                jzVar3.e(false, false, false);
                            }
                            break;
                    }
                }
            });
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f33392j0 = frameLayout5;
        frameLayout5.setVisibility(4);
        this.f33381b0.addView(frameLayout5, h7.z5.d(280, 60.0f, 1, 0.0f, (z11 ? 0 : 40) + 40, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.m0 = textView3;
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(1);
        textView3.setText(LocaleController.getString(R.string.BlurOff));
        frameLayout5.addView(textView3, h7.z5.c(60.0f, 80));
        final int i23 = 4;
        textView3.setOnClickListener(new View.OnClickListener(this) {

            public final ve0 f31269b;

            {
                this.f31269b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i23) {
                    case 0:
                        ve0 ve0Var = this.f31269b;
                        ve0Var.f33405u0 = 0;
                        ve0Var.f33406v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var.f33408w0.setColorFilter((ColorFilter) null);
                        ve0Var.f33410x0.setColorFilter((ColorFilter) null);
                        ve0Var.f();
                        break;
                    case 1:
                        ve0 ve0Var2 = this.f31269b;
                        ve0Var2.f33405u0 = 1;
                        ve0Var2.f33406v0.setColorFilter((ColorFilter) null);
                        ve0Var2.f33408w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var2.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var2.f33410x0.setColorFilter((ColorFilter) null);
                        ve0Var2.f();
                        break;
                    case 2:
                        ve0 ve0Var3 = this.f31269b;
                        ve0Var3.f33405u0 = 2;
                        ve0Var3.f33406v0.setColorFilter((ColorFilter) null);
                        ve0Var3.f33408w0.setColorFilter((ColorFilter) null);
                        ve0Var3.f33410x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var3.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var3.f();
                        break;
                    case 3:
                        ve0 ve0Var4 = this.f31269b;
                        ve0Var4.getClass();
                        int iIntValue = ((Integer) view.getTag()).intValue();
                        ve0Var4.S.f32147f = iIntValue;
                        int i110 = 0;
                        while (i110 < 4) {
                            ve0Var4.f33399q0[i110].a(i110 == iIntValue, true);
                            i110++;
                        }
                        ve0Var4.f33394l0.invalidate();
                        break;
                    case 4:
                        ve0 ve0Var5 = this.f31269b;
                        ve0Var5.P = 0;
                        ve0Var5.h();
                        ve0Var5.f33393k0.setVisibility(4);
                        jz jzVar = ve0Var5.f33390h0;
                        if (jzVar != null) {
                            jzVar.e(false, false, false);
                        }
                        break;
                    case 5:
                        ve0 ve0Var6 = this.f31269b;
                        ve0Var6.P = 1;
                        ve0Var6.h();
                        ke0 ke0Var2 = ve0Var6.f33393k0;
                        ke0Var2.setVisibility(0);
                        ke0Var2.setType(1);
                        jz jzVar2 = ve0Var6.f33390h0;
                        if (jzVar2 != null) {
                            jzVar2.e(false, false, false);
                        }
                        break;
                    default:
                        ve0 ve0Var7 = this.f31269b;
                        ve0Var7.P = 2;
                        ve0Var7.h();
                        ke0 ke0Var3 = ve0Var7.f33393k0;
                        ke0Var3.setVisibility(0);
                        ke0Var3.setType(0);
                        jz jzVar3 = ve0Var7.f33390h0;
                        if (jzVar3 != null) {
                            jzVar3.e(false, false, false);
                        }
                        break;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.f33396n0 = textView4;
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(LocaleController.getString(R.string.BlurRadial));
        frameLayout5.addView(textView4, h7.z5.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        final int i24 = 5;
        textView4.setOnClickListener(new View.OnClickListener(this) {

            public final ve0 f31269b;

            {
                this.f31269b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i24) {
                    case 0:
                        ve0 ve0Var = this.f31269b;
                        ve0Var.f33405u0 = 0;
                        ve0Var.f33406v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var.f33408w0.setColorFilter((ColorFilter) null);
                        ve0Var.f33410x0.setColorFilter((ColorFilter) null);
                        ve0Var.f();
                        break;
                    case 1:
                        ve0 ve0Var2 = this.f31269b;
                        ve0Var2.f33405u0 = 1;
                        ve0Var2.f33406v0.setColorFilter((ColorFilter) null);
                        ve0Var2.f33408w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var2.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var2.f33410x0.setColorFilter((ColorFilter) null);
                        ve0Var2.f();
                        break;
                    case 2:
                        ve0 ve0Var3 = this.f31269b;
                        ve0Var3.f33405u0 = 2;
                        ve0Var3.f33406v0.setColorFilter((ColorFilter) null);
                        ve0Var3.f33408w0.setColorFilter((ColorFilter) null);
                        ve0Var3.f33410x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var3.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var3.f();
                        break;
                    case 3:
                        ve0 ve0Var4 = this.f31269b;
                        ve0Var4.getClass();
                        int iIntValue = ((Integer) view.getTag()).intValue();
                        ve0Var4.S.f32147f = iIntValue;
                        int i110 = 0;
                        while (i110 < 4) {
                            ve0Var4.f33399q0[i110].a(i110 == iIntValue, true);
                            i110++;
                        }
                        ve0Var4.f33394l0.invalidate();
                        break;
                    case 4:
                        ve0 ve0Var5 = this.f31269b;
                        ve0Var5.P = 0;
                        ve0Var5.h();
                        ve0Var5.f33393k0.setVisibility(4);
                        jz jzVar = ve0Var5.f33390h0;
                        if (jzVar != null) {
                            jzVar.e(false, false, false);
                        }
                        break;
                    case 5:
                        ve0 ve0Var6 = this.f31269b;
                        ve0Var6.P = 1;
                        ve0Var6.h();
                        ke0 ke0Var2 = ve0Var6.f33393k0;
                        ke0Var2.setVisibility(0);
                        ke0Var2.setType(1);
                        jz jzVar2 = ve0Var6.f33390h0;
                        if (jzVar2 != null) {
                            jzVar2.e(false, false, false);
                        }
                        break;
                    default:
                        ve0 ve0Var7 = this.f31269b;
                        ve0Var7.P = 2;
                        ve0Var7.h();
                        ke0 ke0Var3 = ve0Var7.f33393k0;
                        ke0Var3.setVisibility(0);
                        ke0Var3.setType(0);
                        jz jzVar3 = ve0Var7.f33390h0;
                        if (jzVar3 != null) {
                            jzVar3.e(false, false, false);
                        }
                        break;
                }
            }
        });
        TextView textView5 = new TextView(context);
        this.f33397o0 = textView5;
        textView5.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(1);
        textView5.setText(LocaleController.getString(R.string.BlurLinear));
        frameLayout5.addView(textView5, h7.z5.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        final int i25 = 6;
        textView5.setOnClickListener(new View.OnClickListener(this) {

            public final ve0 f31269b;

            {
                this.f31269b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i25) {
                    case 0:
                        ve0 ve0Var = this.f31269b;
                        ve0Var.f33405u0 = 0;
                        ve0Var.f33406v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var.f33408w0.setColorFilter((ColorFilter) null);
                        ve0Var.f33410x0.setColorFilter((ColorFilter) null);
                        ve0Var.f();
                        break;
                    case 1:
                        ve0 ve0Var2 = this.f31269b;
                        ve0Var2.f33405u0 = 1;
                        ve0Var2.f33406v0.setColorFilter((ColorFilter) null);
                        ve0Var2.f33408w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var2.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var2.f33410x0.setColorFilter((ColorFilter) null);
                        ve0Var2.f();
                        break;
                    case 2:
                        ve0 ve0Var3 = this.f31269b;
                        ve0Var3.f33405u0 = 2;
                        ve0Var3.f33406v0.setColorFilter((ColorFilter) null);
                        ve0Var3.f33408w0.setColorFilter((ColorFilter) null);
                        ve0Var3.f33410x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, ve0Var3.E0), PorterDuff.Mode.MULTIPLY));
                        ve0Var3.f();
                        break;
                    case 3:
                        ve0 ve0Var4 = this.f31269b;
                        ve0Var4.getClass();
                        int iIntValue = ((Integer) view.getTag()).intValue();
                        ve0Var4.S.f32147f = iIntValue;
                        int i110 = 0;
                        while (i110 < 4) {
                            ve0Var4.f33399q0[i110].a(i110 == iIntValue, true);
                            i110++;
                        }
                        ve0Var4.f33394l0.invalidate();
                        break;
                    case 4:
                        ve0 ve0Var5 = this.f31269b;
                        ve0Var5.P = 0;
                        ve0Var5.h();
                        ve0Var5.f33393k0.setVisibility(4);
                        jz jzVar = ve0Var5.f33390h0;
                        if (jzVar != null) {
                            jzVar.e(false, false, false);
                        }
                        break;
                    case 5:
                        ve0 ve0Var6 = this.f31269b;
                        ve0Var6.P = 1;
                        ve0Var6.h();
                        ke0 ke0Var2 = ve0Var6.f33393k0;
                        ke0Var2.setVisibility(0);
                        ke0Var2.setType(1);
                        jz jzVar2 = ve0Var6.f33390h0;
                        if (jzVar2 != null) {
                            jzVar2.e(false, false, false);
                        }
                        break;
                    default:
                        ve0 ve0Var7 = this.f31269b;
                        ve0Var7.P = 2;
                        ve0Var7.h();
                        ke0 ke0Var3 = ve0Var7.f33393k0;
                        ke0Var3.setVisibility(0);
                        ke0Var3.setType(0);
                        jz jzVar3 = ve0Var7.f33390h0;
                        if (jzVar3 != null) {
                            jzVar3.e(false, false, false);
                        }
                        break;
                }
            }
        });
        h();
        if (this.f33404t0 || !z11) {
            return;
        }
        if (this.f33388f0) {
            ((FrameLayout.LayoutParams) this.f33386e0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        ((FrameLayout.LayoutParams) this.f33394l0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
    }

    private void setShowOriginal(boolean z10) {
        if (this.f33378a == z10) {
            return;
        }
        this.f33378a = z10;
        jz jzVar = this.f33390h0;
        if (jzVar != null) {
            jzVar.e(false, false, false);
        }
    }

    @Override
    public final ByteBuffer a() {
        re0 re0Var = this.S;
        re0Var.a();
        return re0Var.f32146e;
    }

    @Override
    public final boolean b() {
        return this.f33378a || this.R;
    }

    @Override
    public final boolean c() {
        return !this.S.b();
    }

    public final boolean d() {
        MediaController.SavedFilterState savedFilterState = this.f33379a0;
        re0 re0Var = this.S;
        if (savedFilterState != null) {
            return (this.C == savedFilterState.enhanceValue && this.E == savedFilterState.contrastValue && this.L == savedFilterState.highlightsValue && this.D == savedFilterState.exposureValue && this.F == savedFilterState.warmthValue && this.G == savedFilterState.saturationValue && this.N == savedFilterState.vignetteValue && this.M == savedFilterState.shadowsValue && this.O == savedFilterState.grainValue && this.Q == savedFilterState.sharpenValue && this.H == savedFilterState.fadeValue && this.I == savedFilterState.softenSkinValue && this.K == savedFilterState.tintHighlightsColor && this.J == savedFilterState.tintShadowsColor && re0Var.b()) ? false : true;
        }
        return (this.C == 0.0f && this.E == 0.0f && this.L == 0.0f && this.D == 0.0f && this.F == 0.0f && this.G == 0.0f && this.N == 0.0f && this.M == 0.0f && this.O == 0.0f && this.Q == 0.0f && this.H == 0.0f && this.I == 0.0f && this.K == 0 && this.J == 0 && re0Var.b()) ? false : true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        TextureView textureView;
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        rc0 rc0Var = this.f33401r0;
        if (rc0Var != null && view == (textureView = this.f33386e0)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.f33413z0;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.A0;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.C0;
                int i10 = this.D0;
                if (i10 != 0) {
                    Matrix matrix = this.B0;
                    matrix.reset();
                    matrix.postRotate(i10, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    float height = (bitmap.getHeight() - bitmap.getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                    matrix.postScale(rect.width() / bitmap.getHeight(), rect.height() / bitmap.getWidth());
                    canvas.drawBitmap(bitmap, matrix, paint);
                } else {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                }
            }
            float measuredWidth2 = textureView.getMeasuredWidth() / rc0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            rc0Var.draw(canvas);
            canvas.restore();
        }
        return zDrawChild;
    }

    public final void e() {
        boolean z10 = this.f33388f0;
        TextureView textureView = this.f33386e0;
        if (z10) {
            jz jzVar = this.f33390h0;
            if (jzVar != null) {
                jzVar.postRunnable(new gz(jzVar, 0));
                this.f33390h0 = null;
            }
            textureView.setVisibility(8);
            return;
        }
        if (textureView instanceof a61) {
            a61 a61Var = (a61) textureView;
            MediaController.SavedFilterState savedFilterState = this.f33379a0;
            if (savedFilterState == null) {
                a61Var.setDelegate(null);
                return;
            }
            jz jzVar2 = this.f33390h0;
            if (jzVar2 != null) {
                jzVar2.f(new kz(savedFilterState));
            }
        }
    }

    public final void f() {
        int i10 = this.f33405u0;
        jh jhVar = this.f33391i0;
        me0 me0Var = this.f33394l0;
        FrameLayout frameLayout = this.f33398p0;
        FrameLayout frameLayout2 = this.f33392j0;
        ke0 ke0Var = this.f33393k0;
        if (i10 == 0) {
            ke0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            me0Var.setVisibility(4);
            jhVar.setVisibility(0);
            return;
        }
        if (i10 == 1) {
            jhVar.setVisibility(4);
            frameLayout.setVisibility(4);
            me0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.P != 0) {
                ke0Var.setVisibility(0);
            }
            h();
            return;
        }
        if (i10 == 2) {
            jhVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            ke0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            me0Var.setVisibility(0);
            this.S.f32147f = 0;
            int i11 = 0;
            while (i11 < 4) {
                this.f33399q0[i11].a(i11 == 0, false);
                i11++;
            }
        }
    }

    public final void g() {
        this.R = Math.abs(this.C) < 0.1f && Math.abs(this.I) < 0.1f && Math.abs(this.D) < 0.1f && Math.abs(this.E) < 0.1f && Math.abs(this.F) < 0.1f && Math.abs(this.G) < 0.1f && Math.abs(this.H) < 0.1f && this.J == 0 && this.K == 0 && Math.abs(this.L) < 0.1f && Math.abs(this.M) < 0.1f && Math.abs(this.N) < 0.1f && Math.abs(this.O) < 0.1f && this.P == 0 && Math.abs(this.Q) < 0.1f && this.S.b();
    }

    public Bitmap getBitmap() {
        jz jzVar = this.f33390h0;
        if (jzVar == null || !jzVar.f29856f || !jzVar.isAlive()) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            if (jzVar.postRunnable(new org.telegram.ui.ActionBar.i3(jzVar, bitmapArr, countDownLatch, 14))) {
                countDownLatch.await();
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        return bitmapArr[0];
    }

    @Override
    public float getBlurAngle() {
        return this.W;
    }

    public ke0 getBlurControl() {
        return this.f33393k0;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return this.V;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return this.U;
    }

    @Override
    public float getBlurExcludeSize() {
        return this.T;
    }

    @Override
    public int getBlurType() {
        return this.P;
    }

    public TextView getCancelTextView() {
        return this.f33384d0;
    }

    @Override
    public float getContrastValue() {
        return s3.c.c(this.E, 100.0f, 0.3f, 1.0f);
    }

    public me0 getCurveControl() {
        return this.f33394l0;
    }

    public TextView getDoneTextView() {
        return this.f33383c0;
    }

    @Override
    public float getEnhanceValue() {
        return this.C / 100.0f;
    }

    @Override
    public float getExposureValue() {
        return this.D / 100.0f;
    }

    @Override
    public float getFadeValue() {
        return this.H / 100.0f;
    }

    @Override
    public float getGrainValue() {
        return (this.O / 100.0f) * 0.04f;
    }

    @Override
    public float getHighlightsValue() {
        return com.google.android.recaptcha.internal.a.y(this.L, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (!this.f33388f0 || this.f33389g0) {
            return null;
        }
        return this.f33386e0;
    }

    @Override
    public float getSaturationValue() {
        float f10 = this.G / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    public MediaController.SavedFilterState getSavedFilterState() {
        MediaController.SavedFilterState savedFilterState = new MediaController.SavedFilterState();
        savedFilterState.enhanceValue = this.C;
        savedFilterState.exposureValue = this.D;
        savedFilterState.contrastValue = this.E;
        savedFilterState.warmthValue = this.F;
        savedFilterState.saturationValue = this.G;
        savedFilterState.fadeValue = this.H;
        savedFilterState.softenSkinValue = this.I;
        savedFilterState.tintShadowsColor = this.J;
        savedFilterState.tintHighlightsColor = this.K;
        savedFilterState.highlightsValue = this.L;
        savedFilterState.shadowsValue = this.M;
        savedFilterState.vignetteValue = this.N;
        savedFilterState.grainValue = this.O;
        savedFilterState.blurType = this.P;
        savedFilterState.sharpenValue = this.Q;
        savedFilterState.curvesToolValue = this.S;
        savedFilterState.blurExcludeSize = this.T;
        savedFilterState.blurExcludePoint = this.U;
        savedFilterState.blurExcludeBlurSize = this.V;
        savedFilterState.blurAngle = this.W;
        this.f33379a0 = savedFilterState;
        return savedFilterState;
    }

    @Override
    public float getShadowsValue() {
        return com.google.android.recaptcha.internal.a.y(this.M, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return s3.c.c(this.Q, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public float getSoftenSkinValue() {
        return this.I / 100.0f;
    }

    @Override
    public int getTintHighlightsColor() {
        return this.K;
    }

    @Override
    public float getTintHighlightsIntensityValue() {
        return this.K == 0 ? 0.0f : 0.5f;
    }

    @Override
    public int getTintShadowsColor() {
        return this.J;
    }

    @Override
    public float getTintShadowsIntensityValue() {
        return this.J == 0 ? 0.0f : 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.f33381b0;
    }

    public Bitmap getUiBlurBitmap() {
        fa faVar;
        jz jzVar = this.f33390h0;
        if (jzVar == null || (faVar = jzVar.E) == null) {
            return null;
        }
        synchronized (faVar.f28329n) {
            try {
                if (faVar.f28332q) {
                    return faVar.f28331p;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public float getVignetteValue() {
        return this.N / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return this.F / 100.0f;
    }

    public final void h() {
        int i10 = this.P;
        TextView textView = this.f33397o0;
        TextView textView2 = this.f33396n0;
        org.telegram.ui.ActionBar.c6 c6Var = this.E0;
        TextView textView3 = this.m0;
        if (i10 == 0) {
            Drawable drawableMutate = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i11 = org.telegram.ui.ActionBar.g6.f23449zf;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableMutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            Drawable drawableMutate2 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i12 = org.telegram.ui.ActionBar.g6.f23449zf;
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), PorterDuff.Mode.MULTIPLY));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableMutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            Drawable drawableMutate3 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i13 = org.telegram.ui.ActionBar.g6.f23449zf;
            drawableMutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i13, c6Var), PorterDuff.Mode.MULTIPLY));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableMutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        }
        g();
    }

    @Override
    public final boolean n(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            TextureView textureView = this.f33386e0;
            if (textureView instanceof a61) {
                float x8 = motionEvent.getX();
                float y10 = motionEvent.getY();
                yj0 yj0Var = ((a61) textureView).f26645c;
                float f10 = yj0Var.f34911a;
                if (x8 >= f10 && x8 <= f10 + yj0Var.f34913c) {
                    float f11 = yj0Var.f34912b;
                    if (y10 >= f11 && y10 <= f11 + yj0Var.d) {
                        setShowOriginal(true);
                    }
                }
            } else if (motionEvent.getX() >= textureView.getX() && motionEvent.getY() >= textureView.getY() && motionEvent.getX() <= textureView.getX() + textureView.getWidth() && motionEvent.getY() <= textureView.getY() + textureView.getHeight()) {
                setShowOriginal(true);
            }
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
            setShowOriginal(false);
        }
        return true;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float width;
        int height;
        float fCeil;
        float fCeil2;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (this.f33389g0) {
            int iDp = size - AndroidUtilities.dp(28.0f);
            int iDp2 = AndroidUtilities.dp(214.0f);
            boolean z10 = this.f33404t0;
            int i12 = size2 - (iDp2 + (!z10 ? AndroidUtilities.statusBarHeight : 0));
            TextureView textureView = this.f33386e0;
            Bitmap bitmap = this.f33412y0;
            if (bitmap != null) {
                int i13 = this.D0 % 360;
                if (i13 == 90 || i13 == 270) {
                    width = bitmap.getHeight();
                    height = bitmap.getWidth();
                } else {
                    width = bitmap.getWidth();
                    height = bitmap.getHeight();
                }
            } else {
                width = textureView.getWidth();
                height = textureView.getHeight();
            }
            float f10 = height;
            float f11 = iDp;
            float f12 = f11 / width;
            float f13 = i12;
            float f14 = f13 / f10;
            if (f12 > f14) {
                fCeil2 = (int) Math.ceil(width * f14);
                fCeil = f13;
            } else {
                fCeil = (int) Math.ceil(f10 * f12);
                fCeil2 = f11;
            }
            int iCeil = (int) Math.ceil(((f11 - fCeil2) / 2.0f) + AndroidUtilities.dp(14.0f));
            int iCeil2 = (int) Math.ceil(((f13 - fCeil) / 2.0f) + AndroidUtilities.dp(14.0f) + (!z10 ? AndroidUtilities.statusBarHeight : 0));
            int i14 = (int) fCeil2;
            int i15 = (int) fCeil;
            if (this.f33388f0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = iCeil;
                layoutParams.topMargin = iCeil2;
                layoutParams.width = i14;
                layoutParams.height = i15;
            }
            float f15 = iCeil;
            float f16 = iCeil2 - (!z10 ? AndroidUtilities.statusBarHeight : 0);
            float f17 = i14;
            float f18 = i15;
            me0 me0Var = this.f33394l0;
            yj0 yj0Var = me0Var.f30659e;
            yj0Var.f34911a = f15;
            yj0Var.f34912b = f16;
            yj0Var.f34913c = f17;
            yj0Var.d = f18;
            ke0 ke0Var = this.f33393k0;
            tu0 tu0Var = ke0Var.d;
            tu0Var.f32893a = f17;
            tu0Var.f32894b = f18;
            ((FrameLayout.LayoutParams) ke0Var.getLayoutParams()).height = AndroidUtilities.dp(38.0f) + i12;
            ((FrameLayout.LayoutParams) me0Var.getLayoutParams()).height = AndroidUtilities.dp(28.0f) + i12;
            if (AndroidUtilities.isTablet()) {
                int iDp3 = AndroidUtilities.dp(86.0f) * 10;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f33391i0.getLayoutParams();
                if (iDp3 < iDp) {
                    layoutParams2.width = iDp3;
                    layoutParams2.leftMargin = (iDp - iDp3) / 2;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.leftMargin = 0;
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setEnhanceValue(float f10) {
        this.C = f10 * 100.0f;
        g();
        int i10 = 0;
        while (true) {
            jh jhVar = this.f33391i0;
            if (i10 >= jhVar.getChildCount()) {
                break;
            }
            View childAt = jhVar.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.s5) && RecyclerView.R(childAt) == this.f33380b) {
                ((org.telegram.ui.Cells.s5) childAt).a(LocaleController.getString(R.string.Enhance), 0, this.C);
                break;
            }
            i10++;
        }
        jz jzVar = this.f33390h0;
        if (jzVar != null) {
            jzVar.e(true, false, false);
        }
    }
}
