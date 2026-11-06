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
import org.telegram.ui.BubbleActivity;
public final class sd0 extends FrameLayout implements ty, fi.ra {
    public final ImageView A0;
    public final ImageView B0;
    public final Bitmap C0;
    public final int D;
    public final Bitmap D0;
    public final int E;
    public final Rect E0;
    public final int F;
    public final Matrix F0;
    public float G;
    public final Paint G0;
    public float H;
    public final int H0;
    public float I;
    public final org.telegram.ui.ActionBar.f6 I0;
    public float J;
    public int J0;
    public float K;
    public int K0;
    public float L;
    public float M;
    public int N;
    public int O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public int T;
    public float U;
    public boolean V;
    public final h2.c W;
    public boolean f37989a;
    public float f37990a0;
    public final int f37991b;
    public PointF f37992b0;
    public final int f37993c;
    public float f37994c0;
    public final int d;
    public float f37995d0;
    public final int f37996e;
    public org.telegram.messenger.hf f37997e0;
    public final int f37998f;
    public final FrameLayout f37999f0;
    public final TextView f38000g0;
    public final int h;
    public final TextView f38001h0;
    public final TextureView f38002i0;
    public final boolean f38003j0;
    public final boolean f38004k0;
    public ry f38005l0;
    public final eh m0;
    public final int f38006n;
    public final FrameLayout f38007n0;
    public final jd0 f38008o0;
    public final ld0 f38009p0;
    public final TextView f38010q0;
    public final int f38011r;
    public final TextView f38012r0;
    public final int f38013s;
    public final TextView f38014s0;
    public final FrameLayout f38015t0;
    public final RadioButton[] f38016u0;
    public final sb0 f38017v0;
    public final int f38018w;
    public final boolean f38019w0;
    public final int f38020x;
    public final boolean f38021x0;
    public final int f38022y;
    public int f38023y0;
    public final ImageView f38024z0;

    public sd0(Context context, h51 h51Var, Bitmap bitmap, Bitmap bitmap2, int i7, org.telegram.messenger.hf hfVar, sb0 sb0Var, int i10, boolean z9, boolean z10, y9 y9Var, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f38016u0 = new RadioButton[4];
        this.E0 = new Rect();
        this.F0 = new Matrix();
        this.G0 = new Paint(2);
        this.f38004k0 = z10;
        this.I0 = f6Var;
        boolean z11 = context instanceof BubbleActivity;
        this.f38021x0 = z11;
        this.f38017v0 = sb0Var;
        this.f38019w0 = z9;
        this.F = 0;
        if (i10 == 1) {
            this.F = 1;
            this.f38006n = 0;
        } else if (i10 == 0) {
            this.f38006n = -1;
        }
        int i11 = this.F;
        this.f37991b = i11;
        this.f37993c = i11 + 1;
        this.d = i11 + 2;
        this.f37996e = i11 + 3;
        this.f37998f = i11 + 4;
        this.h = i11 + 5;
        this.f38011r = i11 + 6;
        this.f38013s = i11 + 7;
        int i12 = i11 + 9;
        this.F = i12;
        this.f38018w = i11 + 8;
        if (i10 == 2) {
            this.F = i11 + 10;
            this.f38006n = i12;
        }
        if (h51Var == null) {
            int i13 = this.F;
            this.F = i13 + 1;
            this.f38020x = i13;
        } else {
            this.f38020x = -1;
        }
        int i14 = this.F;
        this.f38022y = i14;
        this.D = i14 + 1;
        this.F = i14 + 3;
        this.E = i14 + 2;
        if (hfVar != null) {
            this.G = hfVar.f22913a;
            this.M = hfVar.f22914b;
            this.H = hfVar.f22915c;
            this.I = hfVar.d;
            this.J = hfVar.f22916e;
            this.K = hfVar.f22917f;
            this.L = hfVar.f22918g;
            this.N = hfVar.h;
            this.O = hfVar.f22919i;
            this.P = hfVar.f22920j;
            this.Q = hfVar.f22921k;
            this.R = hfVar.f22922l;
            this.S = hfVar.f22923m;
            this.T = hfVar.f22924n;
            this.U = hfVar.f22925o;
            this.W = hfVar.f22926p;
            this.f37990a0 = hfVar.f22927q;
            this.f37992b0 = hfVar.f22928r;
            this.f37994c0 = hfVar.f22929s;
            this.V = hfVar.a();
            this.f37995d0 = hfVar.f22930t;
            this.f37997e0 = hfVar;
        } else {
            this.W = new h2.c();
            this.f37990a0 = 0.35f;
            this.f37992b0 = new PointF(0.5f, 0.5f);
            this.f37994c0 = 0.15f;
            this.f37995d0 = 1.5707964f;
            this.V = true;
        }
        this.C0 = bitmap;
        this.D0 = bitmap2;
        this.H0 = i7;
        if (h51Var != null) {
            this.f38002i0 = h51Var;
            h51Var.setDelegate(new md0(this));
        } else {
            this.f38003j0 = true;
            k40 k40Var = new k40(1, context, this);
            this.f38002i0 = k40Var;
            if (z10) {
                addView(k40Var, c8.ha.e(-1, -1, 51));
            }
            k40Var.setVisibility(4);
            k40Var.setSurfaceTextureListener(new pd0(this, z10, y9Var));
        }
        ?? frameLayout = new FrameLayout(context);
        frameLayout.f34935a = new PointF();
        frameLayout.d = new Object();
        frameLayout.f34938e = new PointF(0.5f, 0.5f);
        frameLayout.f34939f = 0.15f;
        frameLayout.h = 0.35f;
        frameLayout.f34941r = new RectF();
        frameLayout.f34945y = 1.0f;
        frameLayout.F = true;
        Paint paint = new Paint(1);
        frameLayout.I = paint;
        Paint paint2 = new Paint(1);
        frameLayout.J = paint2;
        frameLayout.setWillNotDraw(false);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        frameLayout.K = z11;
        this.f38008o0 = frameLayout;
        frameLayout.setVisibility(4);
        if (z10) {
            addView((View) frameLayout, c8.ha.e(-1, -1, 51));
        }
        frameLayout.setDelegate(new md0(this));
        h2.c cVar = this.W;
        ?? view = new View(context);
        view.f35652a = 0;
        view.f35654c = true;
        view.f35655e = new Object();
        Paint paint3 = new Paint(1);
        view.f35656f = paint3;
        Paint paint4 = new Paint(1);
        view.h = paint4;
        Paint paint5 = new Paint(1);
        view.f35657n = paint5;
        TextPaint textPaint = new TextPaint(1);
        view.f35658r = textPaint;
        view.f35659s = new Path();
        view.setWillNotDraw(false);
        view.f35661x = cVar;
        paint3.setColor(-1711276033);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint3.setStyle(style);
        paint4.setColor(-1711276033);
        paint4.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint4.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint5.setStyle(style);
        textPaint.setColor(-4210753);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        this.f38009p0 = view;
        view.setDelegate(new md0(this));
        view.setVisibility(4);
        if (z10) {
            addView((View) view, c8.ha.e(-1, -1, 51));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f37999f0 = frameLayout2;
        addView(frameLayout2, c8.ha.e(-1, (!z10 ? 40 : 0) + 186, 83));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackgroundColor(-16777216);
        frameLayout2.addView(frameLayout3, c8.ha.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.f38001h0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView.setText(org.telegram.messenger.hd.M0(2131752589, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout3.addView(textView, c8.ha.e(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.f38000g0 = textView2;
        textView2.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.k6.f28040ng;
        org.telegram.ui.ActionBar.r6.V(textView2, i15, f6Var);
        textView2.setGravity(17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView2.setText(org.telegram.messenger.hd.M0(2131751355, null).toUpperCase());
        textView2.setTypeface(org.telegram.messenger.g0.o());
        frameLayout3.addView(textView2, c8.ha.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout3.addView(linearLayout, c8.ha.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.f38024z0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232283);
        org.telegram.ui.ActionBar.r6.t(imageView, i15, f6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView, c8.ha.o(56, 48));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final sd0 f36320b;

            {
                this.f36320b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        sd0 sd0Var = this.f36320b;
                        sd0Var.f38023y0 = 0;
                        org.telegram.ui.ActionBar.r6.t(sd0Var.f38024z0, org.telegram.ui.ActionBar.k6.f28040ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var.A0.setColorFilter((ColorFilter) null);
                        sd0Var.B0.setColorFilter((ColorFilter) null);
                        sd0Var.c();
                        return;
                    case 1:
                        sd0 sd0Var2 = this.f36320b;
                        sd0Var2.f38023y0 = 1;
                        sd0Var2.f38024z0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(sd0Var2.A0, org.telegram.ui.ActionBar.k6.f28040ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var2.B0.setColorFilter((ColorFilter) null);
                        sd0Var2.c();
                        return;
                    default:
                        sd0 sd0Var3 = this.f36320b;
                        sd0Var3.f38023y0 = 2;
                        sd0Var3.f38024z0.setColorFilter((ColorFilter) null);
                        sd0Var3.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(sd0Var3.B0, org.telegram.ui.ActionBar.k6.f28040ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var3.c();
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.A0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232278);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView2, c8.ha.o(56, 48));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final sd0 f36320b;

            {
                this.f36320b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        sd0 sd0Var = this.f36320b;
                        sd0Var.f38023y0 = 0;
                        org.telegram.ui.ActionBar.r6.t(sd0Var.f38024z0, org.telegram.ui.ActionBar.k6.f28040ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var.A0.setColorFilter((ColorFilter) null);
                        sd0Var.B0.setColorFilter((ColorFilter) null);
                        sd0Var.c();
                        return;
                    case 1:
                        sd0 sd0Var2 = this.f36320b;
                        sd0Var2.f38023y0 = 1;
                        sd0Var2.f38024z0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(sd0Var2.A0, org.telegram.ui.ActionBar.k6.f28040ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var2.B0.setColorFilter((ColorFilter) null);
                        sd0Var2.c();
                        return;
                    default:
                        sd0 sd0Var3 = this.f36320b;
                        sd0Var3.f38023y0 = 2;
                        sd0Var3.f38024z0.setColorFilter((ColorFilter) null);
                        sd0Var3.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(sd0Var3.B0, org.telegram.ui.ActionBar.k6.f28040ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var3.c();
                        return;
                }
            }
        });
        if (h51Var != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.B0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232280);
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView3, c8.ha.o(56, 48));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final sd0 f36320b;

            {
                this.f36320b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        sd0 sd0Var = this.f36320b;
                        sd0Var.f38023y0 = 0;
                        org.telegram.ui.ActionBar.r6.t(sd0Var.f38024z0, org.telegram.ui.ActionBar.k6.f28040ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var.A0.setColorFilter((ColorFilter) null);
                        sd0Var.B0.setColorFilter((ColorFilter) null);
                        sd0Var.c();
                        return;
                    case 1:
                        sd0 sd0Var2 = this.f36320b;
                        sd0Var2.f38023y0 = 1;
                        sd0Var2.f38024z0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(sd0Var2.A0, org.telegram.ui.ActionBar.k6.f28040ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var2.B0.setColorFilter((ColorFilter) null);
                        sd0Var2.c();
                        return;
                    default:
                        sd0 sd0Var3 = this.f36320b;
                        sd0Var3.f38023y0 = 2;
                        sd0Var3.f38024z0.setColorFilter((ColorFilter) null);
                        sd0Var3.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(sd0Var3.B0, org.telegram.ui.ActionBar.k6.f28040ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var3.c();
                        return;
                }
            }
        });
        eh ehVar = new eh(context, 1);
        this.m0 = ehVar;
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(1);
        ehVar.setLayoutManager(b0Var);
        ehVar.setClipToPadding(false);
        ehVar.setOverScrollMode(2);
        ehVar.setAdapter(new org.telegram.ui.l4(4, this, context));
        frameLayout2.addView(ehVar, c8.ha.e(-1, (!z10 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f38015t0 = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout2.addView(frameLayout4, c8.ha.d(-1, 78.0f, 1, 0.0f, (!z10 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout4.addView(linearLayout2, c8.ha.e(-2, -2, 1));
        int i16 = 0;
        while (i16 < 4) {
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setTag(Integer.valueOf(i16));
            this.f38016u0[i16] = new RadioButton(context);
            this.f38016u0[i16].setSize(org.telegram.messenger.g0.L(20.0f));
            frameLayout5.addView(this.f38016u0[i16], c8.ha.e(30, 30, 49));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 12.0f);
            textView3.setGravity(16);
            if (i16 == 0) {
                String M0 = org.telegram.messenger.hd.M0(2131751693, null);
                textView3.setText(M0.substring(0, 1).toUpperCase() + M0.substring(1).toLowerCase());
                textView3.setTextColor(-1);
                this.f38016u0[i16].b(-1, -1);
            } else if (i16 == 1) {
                String M02 = org.telegram.messenger.hd.M0(2131751690, null);
                textView3.setText(M02.substring(0, 1).toUpperCase() + M02.substring(1).toLowerCase());
                textView3.setTextColor(-1684147);
                this.f38016u0[i16].b(-1684147, -1684147);
            } else if (i16 == 2) {
                String M03 = org.telegram.messenger.hd.M0(2131751691, null);
                textView3.setText(M03.substring(0, 1).toUpperCase() + M03.substring(1).toLowerCase());
                textView3.setTextColor(-10831009);
                this.f38016u0[i16].b(-10831009, -10831009);
            } else if (i16 == 3) {
                String M04 = org.telegram.messenger.hd.M0(2131751692, null);
                textView3.setText(M04.substring(0, 1).toUpperCase() + M04.substring(1).toLowerCase());
                textView3.setTextColor(-12734994);
                this.f38016u0[i16].b(-12734994, -12734994);
            }
            frameLayout5.addView(textView3, c8.ha.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            linearLayout2.addView(frameLayout5, c8.ha.k(i16 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            frameLayout5.setOnClickListener(new View.OnClickListener(this) {
                public final sd0 f36603b;

                {
                    this.f36603b = this;
                }

                @Override
                public final void onClick(View view2) {
                    boolean z12;
                    switch (r2) {
                        case 0:
                            sd0 sd0Var = this.f36603b;
                            sd0Var.getClass();
                            int intValue = ((Integer) view2.getTag()).intValue();
                            sd0Var.W.f14057a = intValue;
                            for (int i17 = 0; i17 < 4; i17++) {
                                RadioButton radioButton = sd0Var.f38016u0[i17];
                                if (i17 == intValue) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                radioButton.a(z12, true);
                            }
                            sd0Var.f38009p0.invalidate();
                            return;
                        case 1:
                            sd0 sd0Var2 = this.f36603b;
                            sd0Var2.T = 0;
                            sd0Var2.e();
                            sd0Var2.f38008o0.setVisibility(4);
                            ry ryVar = sd0Var2.f38005l0;
                            if (ryVar != null) {
                                ryVar.c(false, false, false);
                                return;
                            }
                            return;
                        case 2:
                            sd0 sd0Var3 = this.f36603b;
                            sd0Var3.T = 1;
                            sd0Var3.e();
                            jd0 jd0Var = sd0Var3.f38008o0;
                            jd0Var.setVisibility(0);
                            jd0Var.setType(1);
                            ry ryVar2 = sd0Var3.f38005l0;
                            if (ryVar2 != null) {
                                ryVar2.c(false, false, false);
                                return;
                            }
                            return;
                        default:
                            sd0 sd0Var4 = this.f36603b;
                            sd0Var4.T = 2;
                            sd0Var4.e();
                            jd0 jd0Var2 = sd0Var4.f38008o0;
                            jd0Var2.setVisibility(0);
                            jd0Var2.setType(0);
                            ry ryVar3 = sd0Var4.f38005l0;
                            if (ryVar3 != null) {
                                ryVar3.c(false, false, false);
                                return;
                            }
                            return;
                    }
                }
            });
            i16++;
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.f38007n0 = frameLayout6;
        frameLayout6.setVisibility(4);
        this.f37999f0.addView(frameLayout6, c8.ha.d(280, 60.0f, 1, 0.0f, (z10 ? 0 : 40) + 40, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f38010q0 = textView4;
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(org.telegram.messenger.hd.M0(2131753673, null));
        frameLayout6.addView(textView4, c8.ha.c(60.0f, 80));
        textView4.setOnClickListener(new View.OnClickListener(this) {
            public final sd0 f36603b;

            {
                this.f36603b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z12;
                switch (r2) {
                    case 0:
                        sd0 sd0Var = this.f36603b;
                        sd0Var.getClass();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        sd0Var.W.f14057a = intValue;
                        for (int i17 = 0; i17 < 4; i17++) {
                            RadioButton radioButton = sd0Var.f38016u0[i17];
                            if (i17 == intValue) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            radioButton.a(z12, true);
                        }
                        sd0Var.f38009p0.invalidate();
                        return;
                    case 1:
                        sd0 sd0Var2 = this.f36603b;
                        sd0Var2.T = 0;
                        sd0Var2.e();
                        sd0Var2.f38008o0.setVisibility(4);
                        ry ryVar = sd0Var2.f38005l0;
                        if (ryVar != null) {
                            ryVar.c(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        sd0 sd0Var3 = this.f36603b;
                        sd0Var3.T = 1;
                        sd0Var3.e();
                        jd0 jd0Var = sd0Var3.f38008o0;
                        jd0Var.setVisibility(0);
                        jd0Var.setType(1);
                        ry ryVar2 = sd0Var3.f38005l0;
                        if (ryVar2 != null) {
                            ryVar2.c(false, false, false);
                            return;
                        }
                        return;
                    default:
                        sd0 sd0Var4 = this.f36603b;
                        sd0Var4.T = 2;
                        sd0Var4.e();
                        jd0 jd0Var2 = sd0Var4.f38008o0;
                        jd0Var2.setVisibility(0);
                        jd0Var2.setType(0);
                        ry ryVar3 = sd0Var4.f38005l0;
                        if (ryVar3 != null) {
                            ryVar3.c(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView5 = new TextView(context);
        this.f38012r0 = textView5;
        textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(1);
        textView5.setText(org.telegram.messenger.hd.M0(2131753672, null));
        frameLayout6.addView(textView5, c8.ha.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        textView5.setOnClickListener(new View.OnClickListener(this) {
            public final sd0 f36603b;

            {
                this.f36603b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z12;
                switch (r2) {
                    case 0:
                        sd0 sd0Var = this.f36603b;
                        sd0Var.getClass();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        sd0Var.W.f14057a = intValue;
                        for (int i17 = 0; i17 < 4; i17++) {
                            RadioButton radioButton = sd0Var.f38016u0[i17];
                            if (i17 == intValue) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            radioButton.a(z12, true);
                        }
                        sd0Var.f38009p0.invalidate();
                        return;
                    case 1:
                        sd0 sd0Var2 = this.f36603b;
                        sd0Var2.T = 0;
                        sd0Var2.e();
                        sd0Var2.f38008o0.setVisibility(4);
                        ry ryVar = sd0Var2.f38005l0;
                        if (ryVar != null) {
                            ryVar.c(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        sd0 sd0Var3 = this.f36603b;
                        sd0Var3.T = 1;
                        sd0Var3.e();
                        jd0 jd0Var = sd0Var3.f38008o0;
                        jd0Var.setVisibility(0);
                        jd0Var.setType(1);
                        ry ryVar2 = sd0Var3.f38005l0;
                        if (ryVar2 != null) {
                            ryVar2.c(false, false, false);
                            return;
                        }
                        return;
                    default:
                        sd0 sd0Var4 = this.f36603b;
                        sd0Var4.T = 2;
                        sd0Var4.e();
                        jd0 jd0Var2 = sd0Var4.f38008o0;
                        jd0Var2.setVisibility(0);
                        jd0Var2.setType(0);
                        ry ryVar3 = sd0Var4.f38005l0;
                        if (ryVar3 != null) {
                            ryVar3.c(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView6 = new TextView(context);
        this.f38014s0 = textView6;
        textView6.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(1);
        textView6.setText(org.telegram.messenger.hd.M0(2131753674, null));
        frameLayout6.addView(textView6, c8.ha.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        textView6.setOnClickListener(new View.OnClickListener(this) {
            public final sd0 f36603b;

            {
                this.f36603b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z12;
                switch (r2) {
                    case 0:
                        sd0 sd0Var = this.f36603b;
                        sd0Var.getClass();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        sd0Var.W.f14057a = intValue;
                        for (int i17 = 0; i17 < 4; i17++) {
                            RadioButton radioButton = sd0Var.f38016u0[i17];
                            if (i17 == intValue) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            radioButton.a(z12, true);
                        }
                        sd0Var.f38009p0.invalidate();
                        return;
                    case 1:
                        sd0 sd0Var2 = this.f36603b;
                        sd0Var2.T = 0;
                        sd0Var2.e();
                        sd0Var2.f38008o0.setVisibility(4);
                        ry ryVar = sd0Var2.f38005l0;
                        if (ryVar != null) {
                            ryVar.c(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        sd0 sd0Var3 = this.f36603b;
                        sd0Var3.T = 1;
                        sd0Var3.e();
                        jd0 jd0Var = sd0Var3.f38008o0;
                        jd0Var.setVisibility(0);
                        jd0Var.setType(1);
                        ry ryVar2 = sd0Var3.f38005l0;
                        if (ryVar2 != null) {
                            ryVar2.c(false, false, false);
                            return;
                        }
                        return;
                    default:
                        sd0 sd0Var4 = this.f36603b;
                        sd0Var4.T = 2;
                        sd0Var4.e();
                        jd0 jd0Var2 = sd0Var4.f38008o0;
                        jd0Var2.setVisibility(0);
                        jd0Var2.setType(0);
                        ry ryVar3 = sd0Var4.f38005l0;
                        if (ryVar3 != null) {
                            ryVar3.c(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        e();
        if (this.f38021x0 || !z10) {
            return;
        }
        if (this.f38003j0) {
            ((FrameLayout.LayoutParams) this.f38002i0.getLayoutParams()).topMargin = org.telegram.messenger.g0.f22538m;
        }
        ((FrameLayout.LayoutParams) this.f38009p0.getLayoutParams()).topMargin = org.telegram.messenger.g0.f22538m;
    }

    private void setShowOriginal(boolean z9) {
        if (this.f37989a != z9) {
            this.f37989a = z9;
            ry ryVar = this.f38005l0;
            if (ryVar != null) {
                ryVar.c(false, false, false);
            }
        }
    }

    public final boolean a() {
        org.telegram.messenger.hf hfVar = this.f37997e0;
        h2.c cVar = this.W;
        if (hfVar != null) {
            if (this.G != hfVar.f22913a || this.I != hfVar.d || this.P != hfVar.f22920j || this.H != hfVar.f22915c || this.J != hfVar.f22916e || this.K != hfVar.f22917f || this.R != hfVar.f22922l || this.Q != hfVar.f22921k || this.S != hfVar.f22923m || this.U != hfVar.f22925o || this.L != hfVar.f22918g || this.M != hfVar.f22914b || this.O != hfVar.f22919i || this.N != hfVar.h || !cVar.F()) {
                return true;
            }
            return false;
        } else if (this.G != 0.0f || this.I != 0.0f || this.P != 0.0f || this.H != 0.0f || this.J != 0.0f || this.K != 0.0f || this.R != 0.0f || this.Q != 0.0f || this.S != 0.0f || this.U != 0.0f || this.L != 0.0f || this.M != 0.0f || this.O != 0 || this.N != 0 || !cVar.F()) {
            return true;
        } else {
            return false;
        }
    }

    public final void b() {
        boolean z9 = this.f38003j0;
        TextureView textureView = this.f38002i0;
        if (z9) {
            ry ryVar = this.f38005l0;
            if (ryVar != null) {
                ryVar.postRunnable(new oy(ryVar, 0));
                this.f38005l0 = null;
            }
            textureView.setVisibility(8);
        } else if (textureView instanceof h51) {
            h51 h51Var = (h51) textureView;
            org.telegram.messenger.hf hfVar = this.f37997e0;
            if (hfVar == null) {
                h51Var.setDelegate(null);
                return;
            }
            ry ryVar2 = this.f38005l0;
            if (ryVar2 != null) {
                ryVar2.d(new n(hfVar));
            }
        }
    }

    public final void c() {
        boolean z9;
        int i7 = this.f38023y0;
        eh ehVar = this.m0;
        ld0 ld0Var = this.f38009p0;
        FrameLayout frameLayout = this.f38015t0;
        FrameLayout frameLayout2 = this.f38007n0;
        jd0 jd0Var = this.f38008o0;
        if (i7 == 0) {
            jd0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            ld0Var.setVisibility(4);
            ehVar.setVisibility(0);
        } else if (i7 == 1) {
            ehVar.setVisibility(4);
            frameLayout.setVisibility(4);
            ld0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.T != 0) {
                jd0Var.setVisibility(0);
            }
            e();
        } else if (i7 == 2) {
            ehVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            jd0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            ld0Var.setVisibility(0);
            this.W.f14057a = 0;
            for (int i10 = 0; i10 < 4; i10++) {
                RadioButton radioButton = this.f38016u0[i10];
                if (i10 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                radioButton.a(z9, false);
            }
        }
    }

    public final void d() {
        boolean z9;
        if (Math.abs(this.G) < 0.1f && Math.abs(this.M) < 0.1f && Math.abs(this.H) < 0.1f && Math.abs(this.I) < 0.1f && Math.abs(this.J) < 0.1f && Math.abs(this.K) < 0.1f && Math.abs(this.L) < 0.1f && this.N == 0 && this.O == 0 && Math.abs(this.P) < 0.1f && Math.abs(this.Q) < 0.1f && Math.abs(this.R) < 0.1f && Math.abs(this.S) < 0.1f && this.T == 0 && Math.abs(this.U) < 0.1f && this.W.F()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.V = z9;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j3);
        sb0 sb0Var = this.f38017v0;
        if (sb0Var != null && view == (textureView = this.f38002i0)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.D0;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.E0;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.G0;
                int i7 = this.H0;
                if (i7 != 0) {
                    Matrix matrix = this.F0;
                    matrix.reset();
                    matrix.postRotate(i7, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    float height = (bitmap.getHeight() - bitmap.getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                    matrix.postScale(rect.width() / bitmap.getHeight(), rect.height() / bitmap.getWidth());
                    canvas.drawBitmap(bitmap, matrix, paint);
                } else {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                }
            }
            float measuredWidth2 = textureView.getMeasuredWidth() / sb0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            sb0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        int i7 = this.T;
        TextView textView = this.f38014s0;
        TextView textView2 = this.f38012r0;
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        TextView textView3 = this.f38010q0;
        if (i7 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(2131232070).mutate();
            int i10 = org.telegram.ui.ActionBar.k6.f28040ng;
            org.telegram.ui.ActionBar.r6.y(this, mutate, i10, f6Var, PorterDuff.Mode.MULTIPLY);
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 2131232071, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 2131232069, 0, 0);
            textView.setTextColor(-1);
        } else if (i7 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 2131232070, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(2131232071).mutate();
            int i11 = org.telegram.ui.ActionBar.k6.f28040ng;
            org.telegram.ui.ActionBar.r6.y(this, mutate2, i11, f6Var, PorterDuff.Mode.MULTIPLY);
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 2131232069, 0, 0);
            textView.setTextColor(-1);
        } else if (i7 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 2131232070, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 2131232071, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(2131232069).mutate();
            int i12 = org.telegram.ui.ActionBar.k6.f28040ng;
            org.telegram.ui.ActionBar.r6.y(this, mutate3, i12, f6Var, PorterDuff.Mode.MULTIPLY);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
        }
        d();
    }

    public Bitmap getBitmap() {
        ry ryVar = this.f38005l0;
        if (ryVar != null && ryVar.f37783f && ryVar.isAlive()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                if (ryVar.postRunnable(new ng(ryVar, bitmapArr, countDownLatch, 5))) {
                    countDownLatch.await();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            return bitmapArr[0];
        }
        return null;
    }

    @Override
    public float getBlurAngle() {
        return this.f37995d0;
    }

    public jd0 getBlurControl() {
        return this.f38008o0;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return this.f37994c0;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return this.f37992b0;
    }

    @Override
    public float getBlurExcludeSize() {
        return this.f37990a0;
    }

    @Override
    public int getBlurType() {
        return this.T;
    }

    public TextView getCancelTextView() {
        return this.f38001h0;
    }

    @Override
    public float getContrastValue() {
        return com.google.android.recaptcha.internal.a.c(this.I, 100.0f, 0.3f, 1.0f);
    }

    public ld0 getCurveControl() {
        return this.f38009p0;
    }

    public TextView getDoneTextView() {
        return this.f38000g0;
    }

    @Override
    public float getEnhanceValue() {
        return this.G / 100.0f;
    }

    @Override
    public float getExposureValue() {
        return this.H / 100.0f;
    }

    @Override
    public float getFadeValue() {
        return this.L / 100.0f;
    }

    @Override
    public float getGrainValue() {
        return (this.S / 100.0f) * 0.04f;
    }

    @Override
    public float getHighlightsValue() {
        return com.google.android.recaptcha.internal.a.y(this.P, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (this.f38003j0 && !this.f38004k0) {
            return this.f38002i0;
        }
        return null;
    }

    @Override
    public float getSaturationValue() {
        float f10 = this.K / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    public org.telegram.messenger.hf getSavedFilterState() {
        org.telegram.messenger.hf hfVar = new org.telegram.messenger.hf();
        hfVar.f22913a = this.G;
        hfVar.f22915c = this.H;
        hfVar.d = this.I;
        hfVar.f22916e = this.J;
        hfVar.f22917f = this.K;
        hfVar.f22918g = this.L;
        hfVar.f22914b = this.M;
        hfVar.h = this.N;
        hfVar.f22919i = this.O;
        hfVar.f22920j = this.P;
        hfVar.f22921k = this.Q;
        hfVar.f22922l = this.R;
        hfVar.f22923m = this.S;
        hfVar.f22924n = this.T;
        hfVar.f22925o = this.U;
        hfVar.f22926p = this.W;
        hfVar.f22927q = this.f37990a0;
        hfVar.f22928r = this.f37992b0;
        hfVar.f22929s = this.f37994c0;
        hfVar.f22930t = this.f37995d0;
        this.f37997e0 = hfVar;
        return hfVar;
    }

    @Override
    public float getShadowsValue() {
        return com.google.android.recaptcha.internal.a.y(this.Q, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return com.google.android.recaptcha.internal.a.c(this.U, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public float getSoftenSkinValue() {
        return this.M / 100.0f;
    }

    @Override
    public int getTintHighlightsColor() {
        return this.O;
    }

    @Override
    public float getTintHighlightsIntensityValue() {
        if (this.O == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public int getTintShadowsColor() {
        return this.N;
    }

    @Override
    public float getTintShadowsIntensityValue() {
        if (this.N == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.f37999f0;
    }

    public Bitmap getUiBlurBitmap() {
        da daVar;
        ry ryVar = this.f38005l0;
        if (ryVar == null || (daVar = ryVar.I) == null) {
            return null;
        }
        synchronized (daVar.f32840n) {
            try {
                if (!daVar.f32843q) {
                    return null;
                }
                return daVar.f32842p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public float getVignetteValue() {
        return this.R / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return this.J / 100.0f;
    }

    @Override
    public final ByteBuffer h() {
        h2.c cVar = this.W;
        cVar.q();
        return (ByteBuffer) cVar.f14061f;
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                setShowOriginal(false);
            }
        } else {
            TextureView textureView = this.f38002i0;
            if (textureView instanceof h51) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                ki0 ki0Var = ((h51) textureView).f34180c;
                float f10 = ki0Var.f35313a;
                if (x10 >= f10 && x10 <= f10 + ki0Var.f35315c) {
                    float f11 = ki0Var.f35314b;
                    if (y10 >= f11 && y10 <= f11 + ki0Var.d) {
                        setShowOriginal(true);
                    }
                }
            } else if (motionEvent.getX() >= textureView.getX() && motionEvent.getY() >= textureView.getY() && motionEvent.getX() <= textureView.getX() + textureView.getWidth() && motionEvent.getY() <= textureView.getY() + textureView.getHeight()) {
                setShowOriginal(true);
            }
        }
        return true;
    }

    @Override
    public final boolean n() {
        if (!this.f37989a && !this.V) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean o() {
        return !this.W.F();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float width;
        int height;
        float f10;
        float f11;
        float f12;
        float ceil;
        float f13;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (this.f38004k0) {
            int L = size - org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(214.0f);
            boolean z9 = this.f38021x0;
            if (!z9) {
                i11 = org.telegram.messenger.g0.f22538m;
            } else {
                i11 = 0;
            }
            int i14 = size2 - (L2 + i11);
            TextureView textureView = this.f38002i0;
            Bitmap bitmap = this.C0;
            if (bitmap != null) {
                int i15 = this.H0 % 360;
                if (i15 != 90 && i15 != 270) {
                    width = bitmap.getWidth();
                    height = bitmap.getHeight();
                } else {
                    width = bitmap.getHeight();
                    height = bitmap.getWidth();
                }
            } else {
                width = textureView.getWidth();
                height = textureView.getHeight();
            }
            float f14 = L;
            float f15 = i14;
            if (f14 / width > f15 / height) {
                f13 = (int) Math.ceil(width * f12);
                ceil = f15;
            } else {
                ceil = (int) Math.ceil(f10 * f11);
                f13 = f14;
            }
            int ceil2 = (int) Math.ceil(((f14 - f13) / 2.0f) + org.telegram.messenger.g0.L(14.0f));
            float L3 = ((f15 - ceil) / 2.0f) + org.telegram.messenger.g0.L(14.0f);
            if (!z9) {
                i12 = org.telegram.messenger.g0.f22538m;
            } else {
                i12 = 0;
            }
            int ceil3 = (int) Math.ceil(L3 + i12);
            int i16 = (int) f13;
            int i17 = (int) ceil;
            if (this.f38003j0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = ceil2;
                layoutParams.topMargin = ceil3;
                layoutParams.width = i16;
                layoutParams.height = i17;
            }
            float f16 = ceil2;
            if (!z9) {
                i13 = org.telegram.messenger.g0.f22538m;
            } else {
                i13 = 0;
            }
            float f17 = ceil3 - i13;
            float f18 = i16;
            float f19 = i17;
            ld0 ld0Var = this.f38009p0;
            ki0 ki0Var = ld0Var.f35655e;
            ki0Var.f35313a = f16;
            ki0Var.f35314b = f17;
            ki0Var.f35315c = f18;
            ki0Var.d = f19;
            jd0 jd0Var = this.f38008o0;
            mt0 mt0Var = jd0Var.d;
            mt0Var.f36086a = f18;
            mt0Var.f36087b = f19;
            ((FrameLayout.LayoutParams) jd0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(38.0f) + i14;
            ((FrameLayout.LayoutParams) ld0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(28.0f) + i14;
            if (org.telegram.messenger.g0.Q1()) {
                int L4 = org.telegram.messenger.g0.L(86.0f) * 10;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.m0.getLayoutParams();
                if (L4 < L) {
                    layoutParams2.width = L4;
                    layoutParams2.leftMargin = (L - L4) / 2;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.leftMargin = 0;
                }
            }
        }
        super.onMeasure(i7, i10);
    }

    public void setEnhanceValue(float f10) {
        this.G = f10 * 100.0f;
        d();
        int i7 = 0;
        while (true) {
            eh ehVar = this.m0;
            if (i7 >= ehVar.getChildCount()) {
                break;
            }
            View childAt = ehVar.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.s5) && RecyclerView.R(childAt) == this.f37991b) {
                ((org.telegram.ui.Cells.s5) childAt).a(org.telegram.messenger.hd.M0(2131751127, null), 0, this.G);
                break;
            }
            i7++;
        }
        ry ryVar = this.f38005l0;
        if (ryVar != null) {
            ryVar.c(true, false, false);
        }
    }
}
