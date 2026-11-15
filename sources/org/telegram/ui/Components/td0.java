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
public final class td0 extends FrameLayout implements yy, hi.oa {
    public final ImageView A0;
    public final ImageView B0;
    public final ImageView C0;
    public final Bitmap D0;
    public final int E;
    public final Bitmap E0;
    public final int F;
    public final Rect F0;
    public final int G;
    public final Matrix G0;
    public float H;
    public final Paint H0;
    public float I;
    public final int I0;
    public float J;
    public final org.telegram.ui.ActionBar.e6 J0;
    public float K;
    public int K0;
    public float L;
    public int L0;
    public float M;
    public float N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public int U;
    public float V;
    public boolean W;
    public boolean f39640a;
    public final h2.c f39641a0;
    public final int f39642b;
    public float f39643b0;
    public final int f39644c;
    public PointF f39645c0;
    public final int d;
    public float f39646d0;
    public final int f39647e;
    public float f39648e0;
    public final int f39649f;
    public org.telegram.messenger.gf f39650f0;
    public final FrameLayout f39651g0;
    public final int h;
    public final TextView f39652h0;
    public final TextView f39653i0;
    public final TextureView f39654j0;
    public final boolean f39655k0;
    public final boolean f39656l0;
    public wy m0;
    public final int f39657n;
    public final lh f39658n0;
    public final FrameLayout f39659o0;
    public final kd0 f39660p0;
    public final md0 f39661q0;
    public final int f39662r;
    public final TextView f39663r0;
    public final int f39664s;
    public final TextView f39665s0;
    public final TextView f39666t0;
    public final FrameLayout f39667u0;
    public final RadioButton[] f39668v0;
    public final int f39669w;
    public final tb0 f39670w0;
    public final int f39671x;
    public final boolean f39672x0;
    public final int f39673y;
    public final boolean f39674y0;
    public int f39675z0;

    public td0(Context context, k51 k51Var, Bitmap bitmap, Bitmap bitmap2, int i7, org.telegram.messenger.gf gfVar, tb0 tb0Var, int i10, boolean z10, boolean z11, u9 u9Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f39668v0 = new RadioButton[4];
        this.F0 = new Rect();
        this.G0 = new Matrix();
        this.H0 = new Paint(2);
        this.f39656l0 = z11;
        this.J0 = e6Var;
        boolean z12 = context instanceof BubbleActivity;
        this.f39674y0 = z12;
        this.f39670w0 = tb0Var;
        this.f39672x0 = z10;
        this.G = 0;
        if (i10 == 1) {
            this.G = 1;
            this.f39657n = 0;
        } else if (i10 == 0) {
            this.f39657n = -1;
        }
        int i11 = this.G;
        this.f39642b = i11;
        this.f39644c = i11 + 1;
        this.d = i11 + 2;
        this.f39647e = i11 + 3;
        this.f39649f = i11 + 4;
        this.h = i11 + 5;
        this.f39662r = i11 + 6;
        this.f39664s = i11 + 7;
        int i12 = i11 + 9;
        this.G = i12;
        this.f39669w = i11 + 8;
        if (i10 == 2) {
            this.G = i11 + 10;
            this.f39657n = i12;
        }
        if (k51Var == null) {
            int i13 = this.G;
            this.G = i13 + 1;
            this.f39671x = i13;
        } else {
            this.f39671x = -1;
        }
        int i14 = this.G;
        this.f39673y = i14;
        this.E = i14 + 1;
        this.G = i14 + 3;
        this.F = i14 + 2;
        if (gfVar != null) {
            this.H = gfVar.f23735a;
            this.N = gfVar.f23736b;
            this.I = gfVar.f23737c;
            this.J = gfVar.d;
            this.K = gfVar.f23738e;
            this.L = gfVar.f23739f;
            this.M = gfVar.f23740g;
            this.O = gfVar.h;
            this.P = gfVar.f23741i;
            this.Q = gfVar.f23742j;
            this.R = gfVar.f23743k;
            this.S = gfVar.f23744l;
            this.T = gfVar.f23745m;
            this.U = gfVar.f23746n;
            this.V = gfVar.f23747o;
            this.f39641a0 = gfVar.f23748p;
            this.f39643b0 = gfVar.f23749q;
            this.f39645c0 = gfVar.f23750r;
            this.f39646d0 = gfVar.f23751s;
            this.W = gfVar.a();
            this.f39648e0 = gfVar.f23752t;
            this.f39650f0 = gfVar;
        } else {
            this.f39641a0 = new h2.c();
            this.f39643b0 = 0.35f;
            this.f39645c0 = new PointF(0.5f, 0.5f);
            this.f39646d0 = 0.15f;
            this.f39648e0 = 1.5707964f;
            this.W = true;
        }
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.I0 = i7;
        if (k51Var != null) {
            this.f39654j0 = k51Var;
            k51Var.setDelegate(new nd0(this));
        } else {
            this.f39655k0 = true;
            n40 n40Var = new n40(1, context, this);
            this.f39654j0 = n40Var;
            if (z11) {
                addView(n40Var, c8.ja.e(-1, -1, 51));
            }
            n40Var.setVisibility(4);
            n40Var.setSurfaceTextureListener(new qd0(this, z11, u9Var));
        }
        ?? frameLayout = new FrameLayout(context);
        frameLayout.f36377a = new PointF();
        frameLayout.d = new Object();
        frameLayout.f36380e = new PointF(0.5f, 0.5f);
        frameLayout.f36381f = 0.15f;
        frameLayout.h = 0.35f;
        frameLayout.f36383r = new RectF();
        frameLayout.f36387y = 1.0f;
        frameLayout.G = true;
        Paint paint = new Paint(1);
        frameLayout.J = paint;
        Paint paint2 = new Paint(1);
        frameLayout.K = paint2;
        frameLayout.setWillNotDraw(false);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        frameLayout.L = z12;
        this.f39660p0 = frameLayout;
        frameLayout.setVisibility(4);
        if (z11) {
            addView((View) frameLayout, c8.ja.e(-1, -1, 51));
        }
        frameLayout.setDelegate(new nd0(this));
        h2.c cVar = this.f39641a0;
        ?? view = new View(context);
        view.f37227a = 0;
        view.f37229c = true;
        view.f37230e = new Object();
        Paint paint3 = new Paint(1);
        view.f37231f = paint3;
        Paint paint4 = new Paint(1);
        view.h = paint4;
        Paint paint5 = new Paint(1);
        view.f37232n = paint5;
        TextPaint textPaint = new TextPaint(1);
        view.f37233r = textPaint;
        view.f37234s = new Path();
        view.setWillNotDraw(false);
        view.f37236x = cVar;
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
        this.f39661q0 = view;
        view.setDelegate(new nd0(this));
        view.setVisibility(4);
        if (z11) {
            addView((View) view, c8.ja.e(-1, -1, 51));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f39651g0 = frameLayout2;
        addView(frameLayout2, c8.ja.e(-1, (!z11 ? 40 : 0) + 186, 83));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackgroundColor(-16777216);
        frameLayout2.addView(frameLayout3, c8.ja.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.f39653i0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView.setText(org.telegram.messenger.hd.M0(2131752589, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout3.addView(textView, c8.ja.e(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.f39652h0 = textView2;
        textView2.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.j6.f29098qg;
        org.telegram.ui.ActionBar.q6.U(textView2, i15, e6Var);
        textView2.setGravity(17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView2.setText(org.telegram.messenger.hd.M0(2131751354, null).toUpperCase());
        textView2.setTypeface(org.telegram.messenger.g0.o());
        frameLayout3.addView(textView2, c8.ja.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout3.addView(linearLayout, c8.ja.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.A0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232284);
        org.telegram.ui.ActionBar.q6.s(imageView, i15, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView, c8.ja.o(56, 48));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final td0 f37930b;

            {
                this.f37930b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        td0 td0Var = this.f37930b;
                        td0Var.f39675z0 = 0;
                        org.telegram.ui.ActionBar.q6.s(td0Var.A0, org.telegram.ui.ActionBar.j6.f29098qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var.B0.setColorFilter((ColorFilter) null);
                        td0Var.C0.setColorFilter((ColorFilter) null);
                        td0Var.d();
                        return;
                    case 1:
                        td0 td0Var2 = this.f37930b;
                        td0Var2.f39675z0 = 1;
                        td0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.q6.s(td0Var2.B0, org.telegram.ui.ActionBar.j6.f29098qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var2.C0.setColorFilter((ColorFilter) null);
                        td0Var2.d();
                        return;
                    default:
                        td0 td0Var3 = this.f37930b;
                        td0Var3.f39675z0 = 2;
                        td0Var3.A0.setColorFilter((ColorFilter) null);
                        td0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.q6.s(td0Var3.C0, org.telegram.ui.ActionBar.j6.f29098qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var3.d();
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.B0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232279);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView2, c8.ja.o(56, 48));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final td0 f37930b;

            {
                this.f37930b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        td0 td0Var = this.f37930b;
                        td0Var.f39675z0 = 0;
                        org.telegram.ui.ActionBar.q6.s(td0Var.A0, org.telegram.ui.ActionBar.j6.f29098qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var.B0.setColorFilter((ColorFilter) null);
                        td0Var.C0.setColorFilter((ColorFilter) null);
                        td0Var.d();
                        return;
                    case 1:
                        td0 td0Var2 = this.f37930b;
                        td0Var2.f39675z0 = 1;
                        td0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.q6.s(td0Var2.B0, org.telegram.ui.ActionBar.j6.f29098qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var2.C0.setColorFilter((ColorFilter) null);
                        td0Var2.d();
                        return;
                    default:
                        td0 td0Var3 = this.f37930b;
                        td0Var3.f39675z0 = 2;
                        td0Var3.A0.setColorFilter((ColorFilter) null);
                        td0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.q6.s(td0Var3.C0, org.telegram.ui.ActionBar.j6.f29098qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var3.d();
                        return;
                }
            }
        });
        if (k51Var != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.C0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232281);
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView3, c8.ja.o(56, 48));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final td0 f37930b;

            {
                this.f37930b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        td0 td0Var = this.f37930b;
                        td0Var.f39675z0 = 0;
                        org.telegram.ui.ActionBar.q6.s(td0Var.A0, org.telegram.ui.ActionBar.j6.f29098qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var.B0.setColorFilter((ColorFilter) null);
                        td0Var.C0.setColorFilter((ColorFilter) null);
                        td0Var.d();
                        return;
                    case 1:
                        td0 td0Var2 = this.f37930b;
                        td0Var2.f39675z0 = 1;
                        td0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.q6.s(td0Var2.B0, org.telegram.ui.ActionBar.j6.f29098qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var2.C0.setColorFilter((ColorFilter) null);
                        td0Var2.d();
                        return;
                    default:
                        td0 td0Var3 = this.f37930b;
                        td0Var3.f39675z0 = 2;
                        td0Var3.A0.setColorFilter((ColorFilter) null);
                        td0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.q6.s(td0Var3.C0, org.telegram.ui.ActionBar.j6.f29098qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var3.d();
                        return;
                }
            }
        });
        lh lhVar = new lh(context, 1);
        this.f39658n0 = lhVar;
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(1);
        lhVar.setLayoutManager(b0Var);
        lhVar.setClipToPadding(false);
        lhVar.setOverScrollMode(2);
        lhVar.setAdapter(new org.telegram.ui.l4(4, this, context));
        frameLayout2.addView(lhVar, c8.ja.e(-1, (!z11 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f39667u0 = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout2.addView(frameLayout4, c8.ja.d(-1, 78.0f, 1, 0.0f, (!z11 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout4.addView(linearLayout2, c8.ja.e(-2, -2, 1));
        int i16 = 0;
        while (i16 < 4) {
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setTag(Integer.valueOf(i16));
            this.f39668v0[i16] = new RadioButton(context);
            this.f39668v0[i16].setSize(org.telegram.messenger.g0.L(20.0f));
            frameLayout5.addView(this.f39668v0[i16], c8.ja.e(30, 30, 49));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 12.0f);
            textView3.setGravity(16);
            if (i16 == 0) {
                String M0 = org.telegram.messenger.hd.M0(2131751692, null);
                textView3.setText(M0.substring(0, 1).toUpperCase() + M0.substring(1).toLowerCase());
                textView3.setTextColor(-1);
                this.f39668v0[i16].b(-1, -1);
            } else if (i16 == 1) {
                String M02 = org.telegram.messenger.hd.M0(2131751689, null);
                textView3.setText(M02.substring(0, 1).toUpperCase() + M02.substring(1).toLowerCase());
                textView3.setTextColor(-1684147);
                this.f39668v0[i16].b(-1684147, -1684147);
            } else if (i16 == 2) {
                String M03 = org.telegram.messenger.hd.M0(2131751690, null);
                textView3.setText(M03.substring(0, 1).toUpperCase() + M03.substring(1).toLowerCase());
                textView3.setTextColor(-10831009);
                this.f39668v0[i16].b(-10831009, -10831009);
            } else if (i16 == 3) {
                String M04 = org.telegram.messenger.hd.M0(2131751691, null);
                textView3.setText(M04.substring(0, 1).toUpperCase() + M04.substring(1).toLowerCase());
                textView3.setTextColor(-12734994);
                this.f39668v0[i16].b(-12734994, -12734994);
            }
            frameLayout5.addView(textView3, c8.ja.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            linearLayout2.addView(frameLayout5, c8.ja.k(i16 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            frameLayout5.setOnClickListener(new View.OnClickListener(this) {
                public final td0 f38290b;

                {
                    this.f38290b = this;
                }

                @Override
                public final void onClick(View view2) {
                    boolean z13;
                    switch (r2) {
                        case 0:
                            td0 td0Var = this.f38290b;
                            td0Var.getClass();
                            int intValue = ((Integer) view2.getTag()).intValue();
                            td0Var.f39641a0.f13417a = intValue;
                            for (int i17 = 0; i17 < 4; i17++) {
                                RadioButton radioButton = td0Var.f39668v0[i17];
                                if (i17 == intValue) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                radioButton.a(z13, true);
                            }
                            td0Var.f39661q0.invalidate();
                            return;
                        case 1:
                            td0 td0Var2 = this.f38290b;
                            td0Var2.U = 0;
                            td0Var2.f();
                            td0Var2.f39660p0.setVisibility(4);
                            wy wyVar = td0Var2.m0;
                            if (wyVar != null) {
                                wyVar.c(false, false, false);
                                return;
                            }
                            return;
                        case 2:
                            td0 td0Var3 = this.f38290b;
                            td0Var3.U = 1;
                            td0Var3.f();
                            kd0 kd0Var = td0Var3.f39660p0;
                            kd0Var.setVisibility(0);
                            kd0Var.setType(1);
                            wy wyVar2 = td0Var3.m0;
                            if (wyVar2 != null) {
                                wyVar2.c(false, false, false);
                                return;
                            }
                            return;
                        default:
                            td0 td0Var4 = this.f38290b;
                            td0Var4.U = 2;
                            td0Var4.f();
                            kd0 kd0Var2 = td0Var4.f39660p0;
                            kd0Var2.setVisibility(0);
                            kd0Var2.setType(0);
                            wy wyVar3 = td0Var4.m0;
                            if (wyVar3 != null) {
                                wyVar3.c(false, false, false);
                                return;
                            }
                            return;
                    }
                }
            });
            i16++;
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.f39659o0 = frameLayout6;
        frameLayout6.setVisibility(4);
        this.f39651g0.addView(frameLayout6, c8.ja.d(280, 60.0f, 1, 0.0f, (z11 ? 0 : 40) + 40, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f39663r0 = textView4;
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(org.telegram.messenger.hd.M0(2131753673, null));
        frameLayout6.addView(textView4, c8.ja.c(60.0f, 80));
        textView4.setOnClickListener(new View.OnClickListener(this) {
            public final td0 f38290b;

            {
                this.f38290b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                switch (r2) {
                    case 0:
                        td0 td0Var = this.f38290b;
                        td0Var.getClass();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        td0Var.f39641a0.f13417a = intValue;
                        for (int i17 = 0; i17 < 4; i17++) {
                            RadioButton radioButton = td0Var.f39668v0[i17];
                            if (i17 == intValue) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            radioButton.a(z13, true);
                        }
                        td0Var.f39661q0.invalidate();
                        return;
                    case 1:
                        td0 td0Var2 = this.f38290b;
                        td0Var2.U = 0;
                        td0Var2.f();
                        td0Var2.f39660p0.setVisibility(4);
                        wy wyVar = td0Var2.m0;
                        if (wyVar != null) {
                            wyVar.c(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        td0 td0Var3 = this.f38290b;
                        td0Var3.U = 1;
                        td0Var3.f();
                        kd0 kd0Var = td0Var3.f39660p0;
                        kd0Var.setVisibility(0);
                        kd0Var.setType(1);
                        wy wyVar2 = td0Var3.m0;
                        if (wyVar2 != null) {
                            wyVar2.c(false, false, false);
                            return;
                        }
                        return;
                    default:
                        td0 td0Var4 = this.f38290b;
                        td0Var4.U = 2;
                        td0Var4.f();
                        kd0 kd0Var2 = td0Var4.f39660p0;
                        kd0Var2.setVisibility(0);
                        kd0Var2.setType(0);
                        wy wyVar3 = td0Var4.m0;
                        if (wyVar3 != null) {
                            wyVar3.c(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView5 = new TextView(context);
        this.f39665s0 = textView5;
        textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(1);
        textView5.setText(org.telegram.messenger.hd.M0(2131753672, null));
        frameLayout6.addView(textView5, c8.ja.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        textView5.setOnClickListener(new View.OnClickListener(this) {
            public final td0 f38290b;

            {
                this.f38290b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                switch (r2) {
                    case 0:
                        td0 td0Var = this.f38290b;
                        td0Var.getClass();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        td0Var.f39641a0.f13417a = intValue;
                        for (int i17 = 0; i17 < 4; i17++) {
                            RadioButton radioButton = td0Var.f39668v0[i17];
                            if (i17 == intValue) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            radioButton.a(z13, true);
                        }
                        td0Var.f39661q0.invalidate();
                        return;
                    case 1:
                        td0 td0Var2 = this.f38290b;
                        td0Var2.U = 0;
                        td0Var2.f();
                        td0Var2.f39660p0.setVisibility(4);
                        wy wyVar = td0Var2.m0;
                        if (wyVar != null) {
                            wyVar.c(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        td0 td0Var3 = this.f38290b;
                        td0Var3.U = 1;
                        td0Var3.f();
                        kd0 kd0Var = td0Var3.f39660p0;
                        kd0Var.setVisibility(0);
                        kd0Var.setType(1);
                        wy wyVar2 = td0Var3.m0;
                        if (wyVar2 != null) {
                            wyVar2.c(false, false, false);
                            return;
                        }
                        return;
                    default:
                        td0 td0Var4 = this.f38290b;
                        td0Var4.U = 2;
                        td0Var4.f();
                        kd0 kd0Var2 = td0Var4.f39660p0;
                        kd0Var2.setVisibility(0);
                        kd0Var2.setType(0);
                        wy wyVar3 = td0Var4.m0;
                        if (wyVar3 != null) {
                            wyVar3.c(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView6 = new TextView(context);
        this.f39666t0 = textView6;
        textView6.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(1);
        textView6.setText(org.telegram.messenger.hd.M0(2131753674, null));
        frameLayout6.addView(textView6, c8.ja.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        textView6.setOnClickListener(new View.OnClickListener(this) {
            public final td0 f38290b;

            {
                this.f38290b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                switch (r2) {
                    case 0:
                        td0 td0Var = this.f38290b;
                        td0Var.getClass();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        td0Var.f39641a0.f13417a = intValue;
                        for (int i17 = 0; i17 < 4; i17++) {
                            RadioButton radioButton = td0Var.f39668v0[i17];
                            if (i17 == intValue) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            radioButton.a(z13, true);
                        }
                        td0Var.f39661q0.invalidate();
                        return;
                    case 1:
                        td0 td0Var2 = this.f38290b;
                        td0Var2.U = 0;
                        td0Var2.f();
                        td0Var2.f39660p0.setVisibility(4);
                        wy wyVar = td0Var2.m0;
                        if (wyVar != null) {
                            wyVar.c(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        td0 td0Var3 = this.f38290b;
                        td0Var3.U = 1;
                        td0Var3.f();
                        kd0 kd0Var = td0Var3.f39660p0;
                        kd0Var.setVisibility(0);
                        kd0Var.setType(1);
                        wy wyVar2 = td0Var3.m0;
                        if (wyVar2 != null) {
                            wyVar2.c(false, false, false);
                            return;
                        }
                        return;
                    default:
                        td0 td0Var4 = this.f38290b;
                        td0Var4.U = 2;
                        td0Var4.f();
                        kd0 kd0Var2 = td0Var4.f39660p0;
                        kd0Var2.setVisibility(0);
                        kd0Var2.setType(0);
                        wy wyVar3 = td0Var4.m0;
                        if (wyVar3 != null) {
                            wyVar3.c(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        f();
        if (this.f39674y0 || !z11) {
            return;
        }
        if (this.f39655k0) {
            ((FrameLayout.LayoutParams) this.f39654j0.getLayoutParams()).topMargin = org.telegram.messenger.g0.f23605m;
        }
        ((FrameLayout.LayoutParams) this.f39661q0.getLayoutParams()).topMargin = org.telegram.messenger.g0.f23605m;
    }

    private void setShowOriginal(boolean z10) {
        if (this.f39640a != z10) {
            this.f39640a = z10;
            wy wyVar = this.m0;
            if (wyVar != null) {
                wyVar.c(false, false, false);
            }
        }
    }

    public final boolean a() {
        org.telegram.messenger.gf gfVar = this.f39650f0;
        h2.c cVar = this.f39641a0;
        if (gfVar != null) {
            if (this.H != gfVar.f23735a || this.J != gfVar.d || this.Q != gfVar.f23742j || this.I != gfVar.f23737c || this.K != gfVar.f23738e || this.L != gfVar.f23739f || this.S != gfVar.f23744l || this.R != gfVar.f23743k || this.T != gfVar.f23745m || this.V != gfVar.f23747o || this.M != gfVar.f23740g || this.N != gfVar.f23736b || this.P != gfVar.f23741i || this.O != gfVar.h || !cVar.F()) {
                return true;
            }
            return false;
        } else if (this.H != 0.0f || this.J != 0.0f || this.Q != 0.0f || this.I != 0.0f || this.K != 0.0f || this.L != 0.0f || this.S != 0.0f || this.R != 0.0f || this.T != 0.0f || this.V != 0.0f || this.M != 0.0f || this.N != 0.0f || this.P != 0 || this.O != 0 || !cVar.F()) {
            return true;
        } else {
            return false;
        }
    }

    public final void b() {
        boolean z10 = this.f39655k0;
        TextureView textureView = this.f39654j0;
        if (z10) {
            wy wyVar = this.m0;
            if (wyVar != null) {
                wyVar.postRunnable(new ty(wyVar, 0));
                this.m0 = null;
            }
            textureView.setVisibility(8);
        } else if (textureView instanceof k51) {
            k51 k51Var = (k51) textureView;
            org.telegram.messenger.gf gfVar = this.f39650f0;
            if (gfVar == null) {
                k51Var.setDelegate(null);
                return;
            }
            wy wyVar2 = this.m0;
            if (wyVar2 != null) {
                wyVar2.d(new cf(gfVar));
            }
        }
    }

    @Override
    public final ByteBuffer c() {
        h2.c cVar = this.f39641a0;
        cVar.q();
        return (ByteBuffer) cVar.f13421f;
    }

    public final void d() {
        boolean z10;
        int i7 = this.f39675z0;
        lh lhVar = this.f39658n0;
        md0 md0Var = this.f39661q0;
        FrameLayout frameLayout = this.f39667u0;
        FrameLayout frameLayout2 = this.f39659o0;
        kd0 kd0Var = this.f39660p0;
        if (i7 == 0) {
            kd0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            md0Var.setVisibility(4);
            lhVar.setVisibility(0);
        } else if (i7 == 1) {
            lhVar.setVisibility(4);
            frameLayout.setVisibility(4);
            md0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.U != 0) {
                kd0Var.setVisibility(0);
            }
            f();
        } else if (i7 == 2) {
            lhVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            kd0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            md0Var.setVisibility(0);
            this.f39641a0.f13417a = 0;
            for (int i10 = 0; i10 < 4; i10++) {
                RadioButton radioButton = this.f39668v0[i10];
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j3);
        tb0 tb0Var = this.f39670w0;
        if (tb0Var != null && view == (textureView = this.f39654j0)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.E0;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.F0;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.H0;
                int i7 = this.I0;
                if (i7 != 0) {
                    Matrix matrix = this.G0;
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
            float measuredWidth2 = textureView.getMeasuredWidth() / tb0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            tb0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        boolean z10;
        if (Math.abs(this.H) < 0.1f && Math.abs(this.N) < 0.1f && Math.abs(this.I) < 0.1f && Math.abs(this.J) < 0.1f && Math.abs(this.K) < 0.1f && Math.abs(this.L) < 0.1f && Math.abs(this.M) < 0.1f && this.O == 0 && this.P == 0 && Math.abs(this.Q) < 0.1f && Math.abs(this.R) < 0.1f && Math.abs(this.S) < 0.1f && Math.abs(this.T) < 0.1f && this.U == 0 && Math.abs(this.V) < 0.1f && this.f39641a0.F()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W = z10;
    }

    public final void f() {
        int i7 = this.U;
        TextView textView = this.f39666t0;
        TextView textView2 = this.f39665s0;
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        TextView textView3 = this.f39663r0;
        if (i7 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(2131232071).mutate();
            int i10 = org.telegram.ui.ActionBar.j6.f29098qg;
            org.telegram.ui.ActionBar.q6.x(this, mutate, i10, e6Var, PorterDuff.Mode.MULTIPLY);
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 2131232072, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 2131232070, 0, 0);
            textView.setTextColor(-1);
        } else if (i7 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 2131232071, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(2131232072).mutate();
            int i11 = org.telegram.ui.ActionBar.j6.f29098qg;
            org.telegram.ui.ActionBar.q6.x(this, mutate2, i11, e6Var, PorterDuff.Mode.MULTIPLY);
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 2131232070, 0, 0);
            textView.setTextColor(-1);
        } else if (i7 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 2131232071, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 2131232072, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(2131232070).mutate();
            int i12 = org.telegram.ui.ActionBar.j6.f29098qg;
            org.telegram.ui.ActionBar.q6.x(this, mutate3, i12, e6Var, PorterDuff.Mode.MULTIPLY);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
        }
        e();
    }

    public Bitmap getBitmap() {
        wy wyVar = this.m0;
        if (wyVar != null && wyVar.f41480f && wyVar.isAlive()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                if (wyVar.postRunnable(new yf(wyVar, bitmapArr, countDownLatch, 7))) {
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
        return this.f39648e0;
    }

    public kd0 getBlurControl() {
        return this.f39660p0;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return this.f39646d0;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return this.f39645c0;
    }

    @Override
    public float getBlurExcludeSize() {
        return this.f39643b0;
    }

    @Override
    public int getBlurType() {
        return this.U;
    }

    public TextView getCancelTextView() {
        return this.f39653i0;
    }

    @Override
    public float getContrastValue() {
        return com.google.android.gms.internal.vision.e2.c(this.J, 100.0f, 0.3f, 1.0f);
    }

    public md0 getCurveControl() {
        return this.f39661q0;
    }

    public TextView getDoneTextView() {
        return this.f39652h0;
    }

    @Override
    public float getEnhanceValue() {
        return this.H / 100.0f;
    }

    @Override
    public float getExposureValue() {
        return this.I / 100.0f;
    }

    @Override
    public float getFadeValue() {
        return this.M / 100.0f;
    }

    @Override
    public float getGrainValue() {
        return (this.T / 100.0f) * 0.04f;
    }

    @Override
    public float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.Q, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (this.f39655k0 && !this.f39656l0) {
            return this.f39654j0;
        }
        return null;
    }

    @Override
    public float getSaturationValue() {
        float f10 = this.L / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    public org.telegram.messenger.gf getSavedFilterState() {
        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf();
        gfVar.f23735a = this.H;
        gfVar.f23737c = this.I;
        gfVar.d = this.J;
        gfVar.f23738e = this.K;
        gfVar.f23739f = this.L;
        gfVar.f23740g = this.M;
        gfVar.f23736b = this.N;
        gfVar.h = this.O;
        gfVar.f23741i = this.P;
        gfVar.f23742j = this.Q;
        gfVar.f23743k = this.R;
        gfVar.f23744l = this.S;
        gfVar.f23745m = this.T;
        gfVar.f23746n = this.U;
        gfVar.f23747o = this.V;
        gfVar.f23748p = this.f39641a0;
        gfVar.f23749q = this.f39643b0;
        gfVar.f23750r = this.f39645c0;
        gfVar.f23751s = this.f39646d0;
        gfVar.f23752t = this.f39648e0;
        this.f39650f0 = gfVar;
        return gfVar;
    }

    @Override
    public float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.R, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return com.google.android.gms.internal.vision.e2.c(this.V, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public float getSoftenSkinValue() {
        return this.N / 100.0f;
    }

    @Override
    public int getTintHighlightsColor() {
        return this.P;
    }

    @Override
    public float getTintHighlightsIntensityValue() {
        if (this.P == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public int getTintShadowsColor() {
        return this.O;
    }

    @Override
    public float getTintShadowsIntensityValue() {
        if (this.O == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.f39651g0;
    }

    public Bitmap getUiBlurBitmap() {
        z9 z9Var;
        wy wyVar = this.m0;
        if (wyVar == null || (z9Var = wyVar.J) == null) {
            return null;
        }
        synchronized (z9Var.f42317n) {
            try {
                if (!z9Var.f42320q) {
                    return null;
                }
                return z9Var.f42319p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public float getVignetteValue() {
        return this.S / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return this.K / 100.0f;
    }

    @Override
    public final boolean h() {
        if (!this.f39640a && !this.W) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                setShowOriginal(false);
            }
        } else {
            TextureView textureView = this.f39654j0;
            if (textureView instanceof k51) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                pi0 pi0Var = ((k51) textureView).f36281c;
                float f10 = pi0Var.f38312a;
                if (x10 >= f10 && x10 <= f10 + pi0Var.f38314c) {
                    float f11 = pi0Var.f38313b;
                    if (y10 >= f11 && y10 <= f11 + pi0Var.d) {
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
    public final boolean k() {
        return !this.f39641a0.F();
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
        if (this.f39656l0) {
            int L = size - org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(214.0f);
            boolean z10 = this.f39674y0;
            if (!z10) {
                i11 = org.telegram.messenger.g0.f23605m;
            } else {
                i11 = 0;
            }
            int i14 = size2 - (L2 + i11);
            TextureView textureView = this.f39654j0;
            Bitmap bitmap = this.D0;
            if (bitmap != null) {
                int i15 = this.I0 % 360;
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
            if (!z10) {
                i12 = org.telegram.messenger.g0.f23605m;
            } else {
                i12 = 0;
            }
            int ceil3 = (int) Math.ceil(L3 + i12);
            int i16 = (int) f13;
            int i17 = (int) ceil;
            if (this.f39655k0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = ceil2;
                layoutParams.topMargin = ceil3;
                layoutParams.width = i16;
                layoutParams.height = i17;
            }
            float f16 = ceil2;
            if (!z10) {
                i13 = org.telegram.messenger.g0.f23605m;
            } else {
                i13 = 0;
            }
            float f17 = ceil3 - i13;
            float f18 = i16;
            float f19 = i17;
            md0 md0Var = this.f39661q0;
            pi0 pi0Var = md0Var.f37230e;
            pi0Var.f38312a = f16;
            pi0Var.f38313b = f17;
            pi0Var.f38314c = f18;
            pi0Var.d = f19;
            kd0 kd0Var = this.f39660p0;
            nt0 nt0Var = kd0Var.d;
            nt0Var.f37702a = f18;
            nt0Var.f37703b = f19;
            ((FrameLayout.LayoutParams) kd0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(38.0f) + i14;
            ((FrameLayout.LayoutParams) md0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(28.0f) + i14;
            if (org.telegram.messenger.g0.Q1()) {
                int L4 = org.telegram.messenger.g0.L(86.0f) * 10;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f39658n0.getLayoutParams();
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
        this.H = f10 * 100.0f;
        e();
        int i7 = 0;
        while (true) {
            lh lhVar = this.f39658n0;
            if (i7 >= lhVar.getChildCount()) {
                break;
            }
            View childAt = lhVar.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.s5) && RecyclerView.R(childAt) == this.f39642b) {
                ((org.telegram.ui.Cells.s5) childAt).a(org.telegram.messenger.hd.M0(2131751126, null), 0, this.H);
                break;
            }
            i7++;
        }
        wy wyVar = this.m0;
        if (wyVar != null) {
            wyVar.c(true, false, false);
        }
    }
}
