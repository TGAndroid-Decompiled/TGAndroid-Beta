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
public final class oe0 extends FrameLayout implements iz, vh.k8 {
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
    public final org.telegram.ui.ActionBar.p6 I0;
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
    public final e2.c W;
    public boolean f29036a;
    public float f29037a0;
    public final int f29038b;
    public PointF f29039b0;
    public final int f29040c;
    public float f29041c0;
    public final int d;
    public float f29042d0;
    public final int e;
    public org.telegram.messenger.ff f29043e0;
    public final int f29044f;
    public final FrameLayout f29045f0;
    public final TextView f29046g0;
    public final int h;
    public final TextView f29047h0;
    public final TextureView f29048i0;
    public final boolean f29049j0;
    public final boolean f29050k0;
    public gz f29051l0;
    public final bh m0;
    public final int f29052n;
    public final FrameLayout f29053n0;
    public final fe0 f29054o0;
    public final he0 f29055p0;
    public final TextView f29056q0;
    public final int f29057r;
    public final TextView f29058r0;
    public final int f29059s;
    public final TextView f29060s0;
    public final FrameLayout f29061t0;
    public final RadioButton[] f29062u0;
    public final lc0 f29063v0;
    public final int f29064w;
    public final boolean f29065w0;
    public final int f29066x;
    public final boolean f29067x0;
    public final int f29068y;
    public int f29069y0;
    public final ImageView f29070z0;

    public oe0(Context context, k61 k61Var, Bitmap bitmap, Bitmap bitmap2, int i10, org.telegram.messenger.ff ffVar, lc0 lc0Var, int i11, boolean z10, boolean z11, s9 s9Var, final org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f29062u0 = new RadioButton[4];
        this.E0 = new Rect();
        this.F0 = new Matrix();
        this.G0 = new Paint(2);
        this.f29050k0 = z11;
        this.I0 = p6Var;
        boolean z12 = context instanceof BubbleActivity;
        this.f29067x0 = z12;
        this.f29063v0 = lc0Var;
        this.f29065w0 = z10;
        this.F = 0;
        if (i11 == 1) {
            this.F = 1;
            this.f29052n = 0;
        } else if (i11 == 0) {
            this.f29052n = -1;
        }
        int i12 = this.F;
        this.f29038b = i12;
        this.f29040c = i12 + 1;
        this.d = i12 + 2;
        this.e = i12 + 3;
        this.f29044f = i12 + 4;
        this.h = i12 + 5;
        this.f29057r = i12 + 6;
        this.f29059s = i12 + 7;
        int i13 = i12 + 9;
        this.F = i13;
        this.f29064w = i12 + 8;
        if (i11 == 2) {
            this.F = i12 + 10;
            this.f29052n = i13;
        }
        if (k61Var == null) {
            int i14 = this.F;
            this.F = i14 + 1;
            this.f29066x = i14;
        } else {
            this.f29066x = -1;
        }
        int i15 = this.F;
        this.f29068y = i15;
        this.D = i15 + 1;
        this.F = i15 + 3;
        this.E = i15 + 2;
        if (ffVar != null) {
            this.G = ffVar.f15545a;
            this.M = ffVar.f15546b;
            this.H = ffVar.f15547c;
            this.I = ffVar.d;
            this.J = ffVar.e;
            this.K = ffVar.f15548f;
            this.L = ffVar.f15549g;
            this.N = ffVar.h;
            this.O = ffVar.f15550i;
            this.P = ffVar.f15551j;
            this.Q = ffVar.f15552k;
            this.R = ffVar.f15553l;
            this.S = ffVar.f15554m;
            this.T = ffVar.f15555n;
            this.U = ffVar.f15556o;
            this.W = ffVar.f15557p;
            this.f29037a0 = ffVar.f15558q;
            this.f29039b0 = ffVar.f15559r;
            this.f29041c0 = ffVar.f15560s;
            this.V = ffVar.a();
            this.f29042d0 = ffVar.f15561t;
            this.f29043e0 = ffVar;
        } else {
            this.W = new e2.c();
            this.f29037a0 = 0.35f;
            this.f29039b0 = new PointF(0.5f, 0.5f);
            this.f29041c0 = 0.15f;
            this.f29042d0 = 1.5707964f;
            this.V = true;
        }
        this.C0 = bitmap;
        this.D0 = bitmap2;
        this.H0 = i10;
        if (k61Var != null) {
            this.f29048i0 = k61Var;
            k61Var.setDelegate(new ie0(this));
        } else {
            this.f29049j0 = true;
            nh.f fVar = new nh.f(this, context, 2);
            this.f29048i0 = fVar;
            if (z11) {
                addView(fVar, w7.b6.e(-1, -1, 51));
            }
            fVar.setVisibility(4);
            fVar.setSurfaceTextureListener(new le0(this, z11, s9Var));
        }
        ?? frameLayout = new FrameLayout(context);
        frameLayout.f26037a = new PointF();
        frameLayout.d = new Object();
        frameLayout.e = new PointF(0.5f, 0.5f);
        frameLayout.f26040f = 0.15f;
        frameLayout.h = 0.35f;
        frameLayout.f26042r = new RectF();
        frameLayout.f26046y = 1.0f;
        frameLayout.F = true;
        Paint paint = new Paint(1);
        frameLayout.I = paint;
        Paint paint2 = new Paint(1);
        frameLayout.J = paint2;
        frameLayout.setWillNotDraw(false);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        frameLayout.K = z12;
        this.f29054o0 = frameLayout;
        frameLayout.setVisibility(4);
        if (z11) {
            addView((View) frameLayout, w7.b6.e(-1, -1, 51));
        }
        frameLayout.setDelegate(new ie0(this));
        e2.c cVar = this.W;
        ?? view = new View(context);
        view.f26710a = 0;
        view.f26712c = true;
        view.e = new Object();
        Paint paint3 = new Paint(1);
        view.f26713f = paint3;
        Paint paint4 = new Paint(1);
        view.h = paint4;
        Paint paint5 = new Paint(1);
        view.f26714n = paint5;
        TextPaint textPaint = new TextPaint(1);
        view.f26715r = textPaint;
        view.f26716s = new Path();
        view.setWillNotDraw(false);
        view.f26718x = cVar;
        paint3.setColor(-1711276033);
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        paint3.setStyle(style);
        paint4.setColor(-1711276033);
        paint4.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint4.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint5.setStyle(style);
        textPaint.setColor(-4210753);
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        this.f29055p0 = view;
        view.setDelegate(new ie0(this));
        view.setVisibility(4);
        if (z11) {
            addView((View) view, w7.b6.e(-1, -1, 51));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f29045f0 = frameLayout2;
        addView(frameLayout2, w7.b6.e(-1, (!z11 ? 40 : 0) + 186, 83));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackgroundColor(-16777216);
        frameLayout2.addView(frameLayout3, w7.b6.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.f29047h0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
        textView.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
        textView.setText(org.telegram.messenger.cd.L0(2131752589, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.i0.o());
        frameLayout3.addView(textView, w7.b6.e(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.f29046g0 = textView2;
        textView2.setTextSize(1, 14.0f);
        int i16 = org.telegram.ui.ActionBar.t6.f21125ng;
        org.telegram.ui.ActionBar.a7.V(textView2, i16, p6Var);
        textView2.setGravity(17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
        textView2.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
        textView2.setText(org.telegram.messenger.cd.L0(2131751355, null).toUpperCase());
        textView2.setTypeface(org.telegram.messenger.i0.o());
        frameLayout3.addView(textView2, w7.b6.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout3.addView(linearLayout, w7.b6.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.f29070z0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232282);
        org.telegram.ui.ActionBar.a7.t(imageView, i16, p6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView, w7.b6.o(56, 48));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final oe0 f27338b;

            {
                this.f27338b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        oe0 oe0Var = this.f27338b;
                        oe0Var.f29069y0 = 0;
                        org.telegram.ui.ActionBar.a7.t(oe0Var.f29070z0, org.telegram.ui.ActionBar.t6.f21125ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var.A0.setColorFilter((ColorFilter) null);
                        oe0Var.B0.setColorFilter((ColorFilter) null);
                        oe0Var.d();
                        return;
                    case 1:
                        oe0 oe0Var2 = this.f27338b;
                        oe0Var2.f29069y0 = 1;
                        oe0Var2.f29070z0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.a7.t(oe0Var2.A0, org.telegram.ui.ActionBar.t6.f21125ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var2.B0.setColorFilter((ColorFilter) null);
                        oe0Var2.d();
                        return;
                    default:
                        oe0 oe0Var3 = this.f27338b;
                        oe0Var3.f29069y0 = 2;
                        oe0Var3.f29070z0.setColorFilter((ColorFilter) null);
                        oe0Var3.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.a7.t(oe0Var3.B0, org.telegram.ui.ActionBar.t6.f21125ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var3.d();
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.A0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232277);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView2, w7.b6.o(56, 48));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final oe0 f27338b;

            {
                this.f27338b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        oe0 oe0Var = this.f27338b;
                        oe0Var.f29069y0 = 0;
                        org.telegram.ui.ActionBar.a7.t(oe0Var.f29070z0, org.telegram.ui.ActionBar.t6.f21125ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var.A0.setColorFilter((ColorFilter) null);
                        oe0Var.B0.setColorFilter((ColorFilter) null);
                        oe0Var.d();
                        return;
                    case 1:
                        oe0 oe0Var2 = this.f27338b;
                        oe0Var2.f29069y0 = 1;
                        oe0Var2.f29070z0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.a7.t(oe0Var2.A0, org.telegram.ui.ActionBar.t6.f21125ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var2.B0.setColorFilter((ColorFilter) null);
                        oe0Var2.d();
                        return;
                    default:
                        oe0 oe0Var3 = this.f27338b;
                        oe0Var3.f29069y0 = 2;
                        oe0Var3.f29070z0.setColorFilter((ColorFilter) null);
                        oe0Var3.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.a7.t(oe0Var3.B0, org.telegram.ui.ActionBar.t6.f21125ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var3.d();
                        return;
                }
            }
        });
        if (k61Var != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.B0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232279);
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView3, w7.b6.o(56, 48));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final oe0 f27338b;

            {
                this.f27338b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        oe0 oe0Var = this.f27338b;
                        oe0Var.f29069y0 = 0;
                        org.telegram.ui.ActionBar.a7.t(oe0Var.f29070z0, org.telegram.ui.ActionBar.t6.f21125ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var.A0.setColorFilter((ColorFilter) null);
                        oe0Var.B0.setColorFilter((ColorFilter) null);
                        oe0Var.d();
                        return;
                    case 1:
                        oe0 oe0Var2 = this.f27338b;
                        oe0Var2.f29069y0 = 1;
                        oe0Var2.f29070z0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.a7.t(oe0Var2.A0, org.telegram.ui.ActionBar.t6.f21125ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var2.B0.setColorFilter((ColorFilter) null);
                        oe0Var2.d();
                        return;
                    default:
                        oe0 oe0Var3 = this.f27338b;
                        oe0Var3.f29069y0 = 2;
                        oe0Var3.f29070z0.setColorFilter((ColorFilter) null);
                        oe0Var3.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.a7.t(oe0Var3.B0, org.telegram.ui.ActionBar.t6.f21125ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var3.d();
                        return;
                }
            }
        });
        bh bhVar = new bh(context, 1);
        this.m0 = bhVar;
        s4.a0 a0Var = new s4.a0();
        a0Var.j1(1);
        bhVar.setLayoutManager(a0Var);
        bhVar.setClipToPadding(false);
        bhVar.setOverScrollMode(2);
        bhVar.setAdapter(new fg.j(5, this, context));
        frameLayout2.addView(bhVar, w7.b6.e(-1, (!z11 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f29061t0 = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout2.addView(frameLayout4, w7.b6.d(-1, 78.0f, 1, 0.0f, (!z11 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout4.addView(linearLayout2, w7.b6.e(-2, -2, 1));
        int i17 = 0;
        while (i17 < 4) {
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setTag(Integer.valueOf(i17));
            this.f29062u0[i17] = new RadioButton(context);
            this.f29062u0[i17].setSize(org.telegram.messenger.i0.L(20.0f));
            frameLayout5.addView(this.f29062u0[i17], w7.b6.e(30, 30, 49));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 12.0f);
            textView3.setGravity(16);
            if (i17 == 0) {
                String L0 = org.telegram.messenger.cd.L0(2131751693, null);
                textView3.setText(L0.substring(0, 1).toUpperCase() + L0.substring(1).toLowerCase());
                textView3.setTextColor(-1);
                this.f29062u0[i17].b(-1, -1);
            } else if (i17 == 1) {
                String L02 = org.telegram.messenger.cd.L0(2131751690, null);
                textView3.setText(L02.substring(0, 1).toUpperCase() + L02.substring(1).toLowerCase());
                textView3.setTextColor(-1684147);
                this.f29062u0[i17].b(-1684147, -1684147);
            } else if (i17 == 2) {
                String L03 = org.telegram.messenger.cd.L0(2131751691, null);
                textView3.setText(L03.substring(0, 1).toUpperCase() + L03.substring(1).toLowerCase());
                textView3.setTextColor(-10831009);
                this.f29062u0[i17].b(-10831009, -10831009);
            } else if (i17 == 3) {
                String L04 = org.telegram.messenger.cd.L0(2131751692, null);
                textView3.setText(L04.substring(0, 1).toUpperCase() + L04.substring(1).toLowerCase());
                textView3.setTextColor(-12734994);
                this.f29062u0[i17].b(-12734994, -12734994);
            }
            frameLayout5.addView(textView3, w7.b6.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            linearLayout2.addView(frameLayout5, w7.b6.k(i17 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            frameLayout5.setOnClickListener(new View.OnClickListener(this) {
                public final oe0 f27739b;

                {
                    this.f27739b = this;
                }

                @Override
                public final void onClick(View view2) {
                    boolean z13;
                    switch (r2) {
                        case 0:
                            oe0 oe0Var = this.f27739b;
                            oe0Var.getClass();
                            int intValue = ((Integer) view2.getTag()).intValue();
                            oe0Var.W.f6116a = intValue;
                            for (int i18 = 0; i18 < 4; i18++) {
                                RadioButton radioButton = oe0Var.f29062u0[i18];
                                if (i18 == intValue) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                radioButton.a(z13, true);
                            }
                            oe0Var.f29055p0.invalidate();
                            return;
                        case 1:
                            oe0 oe0Var2 = this.f27739b;
                            oe0Var2.T = 0;
                            oe0Var2.g();
                            oe0Var2.f29054o0.setVisibility(4);
                            gz gzVar = oe0Var2.f29051l0;
                            if (gzVar != null) {
                                gzVar.c(false, false, false);
                                return;
                            }
                            return;
                        case 2:
                            oe0 oe0Var3 = this.f27739b;
                            oe0Var3.T = 1;
                            oe0Var3.g();
                            fe0 fe0Var = oe0Var3.f29054o0;
                            fe0Var.setVisibility(0);
                            fe0Var.setType(1);
                            gz gzVar2 = oe0Var3.f29051l0;
                            if (gzVar2 != null) {
                                gzVar2.c(false, false, false);
                                return;
                            }
                            return;
                        default:
                            oe0 oe0Var4 = this.f27739b;
                            oe0Var4.T = 2;
                            oe0Var4.g();
                            fe0 fe0Var2 = oe0Var4.f29054o0;
                            fe0Var2.setVisibility(0);
                            fe0Var2.setType(0);
                            gz gzVar3 = oe0Var4.f29051l0;
                            if (gzVar3 != null) {
                                gzVar3.c(false, false, false);
                                return;
                            }
                            return;
                    }
                }
            });
            i17++;
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.f29053n0 = frameLayout6;
        frameLayout6.setVisibility(4);
        this.f29045f0.addView(frameLayout6, w7.b6.d(280, 60.0f, 1, 0.0f, (z11 ? 0 : 40) + 40, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f29056q0 = textView4;
        textView4.setCompoundDrawablePadding(org.telegram.messenger.i0.L(2.0f));
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(org.telegram.messenger.cd.L0(2131753673, null));
        frameLayout6.addView(textView4, w7.b6.c(60.0f, 80));
        textView4.setOnClickListener(new View.OnClickListener(this) {
            public final oe0 f27739b;

            {
                this.f27739b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                switch (r2) {
                    case 0:
                        oe0 oe0Var = this.f27739b;
                        oe0Var.getClass();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        oe0Var.W.f6116a = intValue;
                        for (int i18 = 0; i18 < 4; i18++) {
                            RadioButton radioButton = oe0Var.f29062u0[i18];
                            if (i18 == intValue) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            radioButton.a(z13, true);
                        }
                        oe0Var.f29055p0.invalidate();
                        return;
                    case 1:
                        oe0 oe0Var2 = this.f27739b;
                        oe0Var2.T = 0;
                        oe0Var2.g();
                        oe0Var2.f29054o0.setVisibility(4);
                        gz gzVar = oe0Var2.f29051l0;
                        if (gzVar != null) {
                            gzVar.c(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        oe0 oe0Var3 = this.f27739b;
                        oe0Var3.T = 1;
                        oe0Var3.g();
                        fe0 fe0Var = oe0Var3.f29054o0;
                        fe0Var.setVisibility(0);
                        fe0Var.setType(1);
                        gz gzVar2 = oe0Var3.f29051l0;
                        if (gzVar2 != null) {
                            gzVar2.c(false, false, false);
                            return;
                        }
                        return;
                    default:
                        oe0 oe0Var4 = this.f27739b;
                        oe0Var4.T = 2;
                        oe0Var4.g();
                        fe0 fe0Var2 = oe0Var4.f29054o0;
                        fe0Var2.setVisibility(0);
                        fe0Var2.setType(0);
                        gz gzVar3 = oe0Var4.f29051l0;
                        if (gzVar3 != null) {
                            gzVar3.c(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView5 = new TextView(context);
        this.f29058r0 = textView5;
        textView5.setCompoundDrawablePadding(org.telegram.messenger.i0.L(2.0f));
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(1);
        textView5.setText(org.telegram.messenger.cd.L0(2131753672, null));
        frameLayout6.addView(textView5, w7.b6.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        textView5.setOnClickListener(new View.OnClickListener(this) {
            public final oe0 f27739b;

            {
                this.f27739b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                switch (r2) {
                    case 0:
                        oe0 oe0Var = this.f27739b;
                        oe0Var.getClass();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        oe0Var.W.f6116a = intValue;
                        for (int i18 = 0; i18 < 4; i18++) {
                            RadioButton radioButton = oe0Var.f29062u0[i18];
                            if (i18 == intValue) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            radioButton.a(z13, true);
                        }
                        oe0Var.f29055p0.invalidate();
                        return;
                    case 1:
                        oe0 oe0Var2 = this.f27739b;
                        oe0Var2.T = 0;
                        oe0Var2.g();
                        oe0Var2.f29054o0.setVisibility(4);
                        gz gzVar = oe0Var2.f29051l0;
                        if (gzVar != null) {
                            gzVar.c(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        oe0 oe0Var3 = this.f27739b;
                        oe0Var3.T = 1;
                        oe0Var3.g();
                        fe0 fe0Var = oe0Var3.f29054o0;
                        fe0Var.setVisibility(0);
                        fe0Var.setType(1);
                        gz gzVar2 = oe0Var3.f29051l0;
                        if (gzVar2 != null) {
                            gzVar2.c(false, false, false);
                            return;
                        }
                        return;
                    default:
                        oe0 oe0Var4 = this.f27739b;
                        oe0Var4.T = 2;
                        oe0Var4.g();
                        fe0 fe0Var2 = oe0Var4.f29054o0;
                        fe0Var2.setVisibility(0);
                        fe0Var2.setType(0);
                        gz gzVar3 = oe0Var4.f29051l0;
                        if (gzVar3 != null) {
                            gzVar3.c(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView6 = new TextView(context);
        this.f29060s0 = textView6;
        textView6.setCompoundDrawablePadding(org.telegram.messenger.i0.L(2.0f));
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(1);
        textView6.setText(org.telegram.messenger.cd.L0(2131753674, null));
        frameLayout6.addView(textView6, w7.b6.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        textView6.setOnClickListener(new View.OnClickListener(this) {
            public final oe0 f27739b;

            {
                this.f27739b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                switch (r2) {
                    case 0:
                        oe0 oe0Var = this.f27739b;
                        oe0Var.getClass();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        oe0Var.W.f6116a = intValue;
                        for (int i18 = 0; i18 < 4; i18++) {
                            RadioButton radioButton = oe0Var.f29062u0[i18];
                            if (i18 == intValue) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            radioButton.a(z13, true);
                        }
                        oe0Var.f29055p0.invalidate();
                        return;
                    case 1:
                        oe0 oe0Var2 = this.f27739b;
                        oe0Var2.T = 0;
                        oe0Var2.g();
                        oe0Var2.f29054o0.setVisibility(4);
                        gz gzVar = oe0Var2.f29051l0;
                        if (gzVar != null) {
                            gzVar.c(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        oe0 oe0Var3 = this.f27739b;
                        oe0Var3.T = 1;
                        oe0Var3.g();
                        fe0 fe0Var = oe0Var3.f29054o0;
                        fe0Var.setVisibility(0);
                        fe0Var.setType(1);
                        gz gzVar2 = oe0Var3.f29051l0;
                        if (gzVar2 != null) {
                            gzVar2.c(false, false, false);
                            return;
                        }
                        return;
                    default:
                        oe0 oe0Var4 = this.f27739b;
                        oe0Var4.T = 2;
                        oe0Var4.g();
                        fe0 fe0Var2 = oe0Var4.f29054o0;
                        fe0Var2.setVisibility(0);
                        fe0Var2.setType(0);
                        gz gzVar3 = oe0Var4.f29051l0;
                        if (gzVar3 != null) {
                            gzVar3.c(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        g();
        if (this.f29067x0 || !z11) {
            return;
        }
        if (this.f29049j0) {
            ((FrameLayout.LayoutParams) this.f29048i0.getLayoutParams()).topMargin = org.telegram.messenger.i0.f16020m;
        }
        ((FrameLayout.LayoutParams) this.f29055p0.getLayoutParams()).topMargin = org.telegram.messenger.i0.f16020m;
    }

    private void setShowOriginal(boolean z10) {
        if (this.f29036a != z10) {
            this.f29036a = z10;
            gz gzVar = this.f29051l0;
            if (gzVar != null) {
                gzVar.c(false, false, false);
            }
        }
    }

    public final boolean a() {
        org.telegram.messenger.ff ffVar = this.f29043e0;
        e2.c cVar = this.W;
        if (ffVar != null) {
            if (this.G != ffVar.f15545a || this.I != ffVar.d || this.P != ffVar.f15551j || this.H != ffVar.f15547c || this.J != ffVar.e || this.K != ffVar.f15548f || this.R != ffVar.f15553l || this.Q != ffVar.f15552k || this.S != ffVar.f15554m || this.U != ffVar.f15556o || this.L != ffVar.f15549g || this.M != ffVar.f15546b || this.O != ffVar.f15550i || this.N != ffVar.h || !cVar.s()) {
                return true;
            }
            return false;
        } else if (this.G != 0.0f || this.I != 0.0f || this.P != 0.0f || this.H != 0.0f || this.J != 0.0f || this.K != 0.0f || this.R != 0.0f || this.Q != 0.0f || this.S != 0.0f || this.U != 0.0f || this.L != 0.0f || this.M != 0.0f || this.O != 0 || this.N != 0 || !cVar.s()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final ByteBuffer b() {
        e2.c cVar = this.W;
        cVar.d();
        return (ByteBuffer) cVar.f6119f;
    }

    public final void c() {
        boolean z10 = this.f29049j0;
        TextureView textureView = this.f29048i0;
        if (z10) {
            gz gzVar = this.f29051l0;
            if (gzVar != null) {
                gzVar.postRunnable(new dz(gzVar, 0));
                this.f29051l0 = null;
            }
            textureView.setVisibility(8);
        } else if (textureView instanceof k61) {
            k61 k61Var = (k61) textureView;
            org.telegram.messenger.ff ffVar = this.f29043e0;
            if (ffVar == null) {
                k61Var.setDelegate(null);
                return;
            }
            gz gzVar2 = this.f29051l0;
            if (gzVar2 != null) {
                gzVar2.d(new n2.u(ffVar, 10));
            }
        }
    }

    public final void d() {
        boolean z10;
        int i10 = this.f29069y0;
        bh bhVar = this.m0;
        he0 he0Var = this.f29055p0;
        FrameLayout frameLayout = this.f29061t0;
        FrameLayout frameLayout2 = this.f29053n0;
        fe0 fe0Var = this.f29054o0;
        if (i10 == 0) {
            fe0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            he0Var.setVisibility(4);
            bhVar.setVisibility(0);
        } else if (i10 == 1) {
            bhVar.setVisibility(4);
            frameLayout.setVisibility(4);
            he0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.T != 0) {
                fe0Var.setVisibility(0);
            }
            g();
        } else if (i10 == 2) {
            bhVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            fe0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            he0Var.setVisibility(0);
            this.W.f6116a = 0;
            for (int i11 = 0; i11 < 4; i11++) {
                RadioButton radioButton = this.f29062u0[i11];
                if (i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j10);
        lc0 lc0Var = this.f29063v0;
        if (lc0Var != null && view == (textureView = this.f29048i0)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.D0;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.E0;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.G0;
                int i10 = this.H0;
                if (i10 != 0) {
                    Matrix matrix = this.F0;
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
            float measuredWidth2 = textureView.getMeasuredWidth() / lc0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            lc0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    @Override
    public final boolean e() {
        if (!this.f29036a && !this.V) {
            return false;
        }
        return true;
    }

    public final void f() {
        boolean z10;
        if (Math.abs(this.G) < 0.1f && Math.abs(this.M) < 0.1f && Math.abs(this.H) < 0.1f && Math.abs(this.I) < 0.1f && Math.abs(this.J) < 0.1f && Math.abs(this.K) < 0.1f && Math.abs(this.L) < 0.1f && this.N == 0 && this.O == 0 && Math.abs(this.P) < 0.1f && Math.abs(this.Q) < 0.1f && Math.abs(this.R) < 0.1f && Math.abs(this.S) < 0.1f && this.T == 0 && Math.abs(this.U) < 0.1f && this.W.s()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.V = z10;
    }

    public final void g() {
        int i10 = this.T;
        TextView textView = this.f29060s0;
        TextView textView2 = this.f29058r0;
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        TextView textView3 = this.f29056q0;
        if (i10 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(2131232069).mutate();
            int i11 = org.telegram.ui.ActionBar.t6.f21125ng;
            org.telegram.ui.ActionBar.a7.y(this, mutate, i11, p6Var, PorterDuff.Mode.MULTIPLY);
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 2131232070, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 2131232068, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 2131232069, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(2131232070).mutate();
            int i12 = org.telegram.ui.ActionBar.t6.f21125ng;
            org.telegram.ui.ActionBar.a7.y(this, mutate2, i12, p6Var, PorterDuff.Mode.MULTIPLY);
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 2131232068, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 2131232069, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 2131232070, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(2131232068).mutate();
            int i13 = org.telegram.ui.ActionBar.t6.f21125ng;
            org.telegram.ui.ActionBar.a7.y(this, mutate3, i13, p6Var, PorterDuff.Mode.MULTIPLY);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        }
        f();
    }

    public Bitmap getBitmap() {
        gz gzVar = this.f29051l0;
        if (gzVar != null && gzVar.f26548f && gzVar.isAlive()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                if (gzVar.postRunnable(new jg(gzVar, bitmapArr, countDownLatch, 5))) {
                    countDownLatch.await();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            return bitmapArr[0];
        }
        return null;
    }

    @Override
    public float getBlurAngle() {
        return this.f29042d0;
    }

    public fe0 getBlurControl() {
        return this.f29054o0;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return this.f29041c0;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return this.f29039b0;
    }

    @Override
    public float getBlurExcludeSize() {
        return this.f29037a0;
    }

    @Override
    public int getBlurType() {
        return this.T;
    }

    public TextView getCancelTextView() {
        return this.f29047h0;
    }

    @Override
    public float getContrastValue() {
        return a1.g.c(this.I, 100.0f, 0.3f, 1.0f);
    }

    public he0 getCurveControl() {
        return this.f29055p0;
    }

    public TextView getDoneTextView() {
        return this.f29046g0;
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
        return c3.i0.x(this.P, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (this.f29049j0 && !this.f29050k0) {
            return this.f29048i0;
        }
        return null;
    }

    @Override
    public float getSaturationValue() {
        float f7 = this.K / 100.0f;
        if (f7 > 0.0f) {
            f7 *= 1.05f;
        }
        return f7 + 1.0f;
    }

    public org.telegram.messenger.ff getSavedFilterState() {
        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff();
        ffVar.f15545a = this.G;
        ffVar.f15547c = this.H;
        ffVar.d = this.I;
        ffVar.e = this.J;
        ffVar.f15548f = this.K;
        ffVar.f15549g = this.L;
        ffVar.f15546b = this.M;
        ffVar.h = this.N;
        ffVar.f15550i = this.O;
        ffVar.f15551j = this.P;
        ffVar.f15552k = this.Q;
        ffVar.f15553l = this.R;
        ffVar.f15554m = this.S;
        ffVar.f15555n = this.T;
        ffVar.f15556o = this.U;
        ffVar.f15557p = this.W;
        ffVar.f15558q = this.f29037a0;
        ffVar.f15559r = this.f29039b0;
        ffVar.f15560s = this.f29041c0;
        ffVar.f15561t = this.f29042d0;
        this.f29043e0 = ffVar;
        return ffVar;
    }

    @Override
    public float getShadowsValue() {
        return c3.i0.x(this.Q, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return a1.g.c(this.U, 100.0f, 0.6f, 0.11f);
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
        return this.f29045f0;
    }

    public Bitmap getUiBlurBitmap() {
        x9 x9Var;
        gz gzVar = this.f29051l0;
        if (gzVar == null || (x9Var = gzVar.I) == null) {
            return null;
        }
        synchronized (x9Var.f32439n) {
            try {
                if (!x9Var.f32442q) {
                    return null;
                }
                return x9Var.f32441p;
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
    public final boolean i(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                setShowOriginal(false);
            }
        } else {
            TextureView textureView = this.f29048i0;
            if (textureView instanceof k61) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                oj0 oj0Var = ((k61) textureView).f27648c;
                float f7 = oj0Var.f29084a;
                if (x10 >= f7 && x10 <= f7 + oj0Var.f29086c) {
                    float f10 = oj0Var.f29085b;
                    if (y3 >= f10 && y3 <= f10 + oj0Var.d) {
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
    public final void onMeasure(int i10, int i11) {
        int i12;
        float width;
        int height;
        float f7;
        float f10;
        float f11;
        float ceil;
        float f12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (this.f29050k0) {
            int L = size - org.telegram.messenger.i0.L(28.0f);
            int L2 = org.telegram.messenger.i0.L(214.0f);
            boolean z10 = this.f29067x0;
            if (!z10) {
                i12 = org.telegram.messenger.i0.f16020m;
            } else {
                i12 = 0;
            }
            int i15 = size2 - (L2 + i12);
            TextureView textureView = this.f29048i0;
            Bitmap bitmap = this.C0;
            if (bitmap != null) {
                int i16 = this.H0 % 360;
                if (i16 != 90 && i16 != 270) {
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
            float f13 = L;
            float f14 = i15;
            if (f13 / width > f14 / height) {
                f12 = (int) Math.ceil(width * f11);
                ceil = f14;
            } else {
                ceil = (int) Math.ceil(f7 * f10);
                f12 = f13;
            }
            int ceil2 = (int) Math.ceil(((f13 - f12) / 2.0f) + org.telegram.messenger.i0.L(14.0f));
            float L3 = ((f14 - ceil) / 2.0f) + org.telegram.messenger.i0.L(14.0f);
            if (!z10) {
                i13 = org.telegram.messenger.i0.f16020m;
            } else {
                i13 = 0;
            }
            int ceil3 = (int) Math.ceil(L3 + i13);
            int i17 = (int) f12;
            int i18 = (int) ceil;
            if (this.f29049j0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = ceil2;
                layoutParams.topMargin = ceil3;
                layoutParams.width = i17;
                layoutParams.height = i18;
            }
            float f15 = ceil2;
            if (!z10) {
                i14 = org.telegram.messenger.i0.f16020m;
            } else {
                i14 = 0;
            }
            float f16 = ceil3 - i14;
            float f17 = i17;
            float f18 = i18;
            he0 he0Var = this.f29055p0;
            oj0 oj0Var = he0Var.e;
            oj0Var.f29084a = f15;
            oj0Var.f29085b = f16;
            oj0Var.f29086c = f17;
            oj0Var.d = f18;
            fe0 fe0Var = this.f29054o0;
            pu0 pu0Var = fe0Var.d;
            pu0Var.f29435a = f17;
            pu0Var.f29436b = f18;
            ((FrameLayout.LayoutParams) fe0Var.getLayoutParams()).height = org.telegram.messenger.i0.L(38.0f) + i15;
            ((FrameLayout.LayoutParams) he0Var.getLayoutParams()).height = org.telegram.messenger.i0.L(28.0f) + i15;
            if (org.telegram.messenger.i0.Q1()) {
                int L4 = org.telegram.messenger.i0.L(86.0f) * 10;
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
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean p() {
        return !this.W.s();
    }

    public void setEnhanceValue(float f7) {
        this.G = f7 * 100.0f;
        f();
        int i10 = 0;
        while (true) {
            bh bhVar = this.m0;
            if (i10 >= bhVar.getChildCount()) {
                break;
            }
            View childAt = bhVar.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.x5) && RecyclerView.R(childAt) == this.f29038b) {
                ((org.telegram.ui.Cells.x5) childAt).a(org.telegram.messenger.cd.L0(2131751127, null), 0, this.G);
                break;
            }
            i10++;
        }
        gz gzVar = this.f29051l0;
        if (gzVar != null) {
            gzVar.c(true, false, false);
        }
    }
}
