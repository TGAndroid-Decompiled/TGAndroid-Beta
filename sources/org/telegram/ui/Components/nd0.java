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
public final class nd0 extends FrameLayout implements ry, gi.ra {
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
    public boolean f36457a;
    public final g2.d f36458a0;
    public final int f36459b;
    public float f36460b0;
    public final int f36461c;
    public PointF f36462c0;
    public final int d;
    public float f36463d0;
    public final int f36464e;
    public float f36465e0;
    public final int f36466f;
    public org.telegram.messenger.ze f36467f0;
    public final FrameLayout f36468g0;
    public final int h;
    public final TextView f36469h0;
    public final TextView f36470i0;
    public final TextureView f36471j0;
    public final boolean f36472k0;
    public final boolean f36473l0;
    public py m0;
    public final int f36474n;
    public final bh f36475n0;
    public final FrameLayout f36476o0;
    public final ed0 f36477p0;
    public final gd0 f36478q0;
    public final int f36479r;
    public final TextView f36480r0;
    public final int f36481s;
    public final TextView f36482s0;
    public final TextView f36483t0;
    public final FrameLayout f36484u0;
    public final RadioButton[] f36485v0;
    public final int f36486w;
    public final nb0 f36487w0;
    public final int f36488x;
    public final boolean f36489x0;
    public final int f36490y;
    public final boolean f36491y0;
    public int f36492z0;

    public nd0(Context context, b51 b51Var, Bitmap bitmap, Bitmap bitmap2, int i3, org.telegram.messenger.ze zeVar, nb0 nb0Var, int i10, boolean z10, boolean z11, x9 x9Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f36485v0 = new RadioButton[4];
        this.F0 = new Rect();
        this.G0 = new Matrix();
        this.H0 = new Paint(2);
        this.f36473l0 = z11;
        this.J0 = e6Var;
        boolean z12 = context instanceof BubbleActivity;
        this.f36491y0 = z12;
        this.f36487w0 = nb0Var;
        this.f36489x0 = z10;
        this.G = 0;
        if (i10 == 1) {
            this.G = 1;
            this.f36474n = 0;
        } else if (i10 == 0) {
            this.f36474n = -1;
        }
        int i11 = this.G;
        this.f36459b = i11;
        this.f36461c = i11 + 1;
        this.d = i11 + 2;
        this.f36464e = i11 + 3;
        this.f36466f = i11 + 4;
        this.h = i11 + 5;
        this.f36479r = i11 + 6;
        this.f36481s = i11 + 7;
        int i12 = i11 + 9;
        this.G = i12;
        this.f36486w = i11 + 8;
        if (i10 == 2) {
            this.G = i11 + 10;
            this.f36474n = i12;
        }
        if (b51Var == null) {
            int i13 = this.G;
            this.G = i13 + 1;
            this.f36488x = i13;
        } else {
            this.f36488x = -1;
        }
        int i14 = this.G;
        this.f36490y = i14;
        this.E = i14 + 1;
        this.G = i14 + 3;
        this.F = i14 + 2;
        if (zeVar != null) {
            this.H = zeVar.f26784a;
            this.N = zeVar.f26785b;
            this.I = zeVar.f26786c;
            this.J = zeVar.d;
            this.K = zeVar.f26787e;
            this.L = zeVar.f26788f;
            this.M = zeVar.f26789g;
            this.O = zeVar.h;
            this.P = zeVar.f26790i;
            this.Q = zeVar.f26791j;
            this.R = zeVar.f26792k;
            this.S = zeVar.f26793l;
            this.T = zeVar.f26794m;
            this.U = zeVar.f26795n;
            this.V = zeVar.f26796o;
            this.f36458a0 = zeVar.f26797p;
            this.f36460b0 = zeVar.f26798q;
            this.f36462c0 = zeVar.f26799r;
            this.f36463d0 = zeVar.f26800s;
            this.W = zeVar.a();
            this.f36465e0 = zeVar.f26801t;
            this.f36467f0 = zeVar;
        } else {
            this.f36458a0 = new g2.d();
            this.f36460b0 = 0.35f;
            this.f36462c0 = new PointF(0.5f, 0.5f);
            this.f36463d0 = 0.15f;
            this.f36465e0 = 1.5707964f;
            this.W = true;
        }
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.I0 = i3;
        if (b51Var != null) {
            this.f36471j0 = b51Var;
            b51Var.setDelegate(new hd0(this));
        } else {
            this.f36472k0 = true;
            g40 g40Var = new g40(1, context, this);
            this.f36471j0 = g40Var;
            if (z11) {
                addView(g40Var, b8.mf.e(-1, -1, 51));
            }
            g40Var.setVisibility(4);
            g40Var.setSurfaceTextureListener(new kd0(this, z11, x9Var));
        }
        ?? frameLayout = new FrameLayout(context);
        frameLayout.f33360a = new PointF();
        frameLayout.d = new Object();
        frameLayout.f33363e = new PointF(0.5f, 0.5f);
        frameLayout.f33364f = 0.15f;
        frameLayout.h = 0.35f;
        frameLayout.f33366r = new RectF();
        frameLayout.f33370y = 1.0f;
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
        this.f36477p0 = frameLayout;
        frameLayout.setVisibility(4);
        if (z11) {
            addView((View) frameLayout, b8.mf.e(-1, -1, 51));
        }
        frameLayout.setDelegate(new hd0(this));
        g2.d dVar = this.f36458a0;
        ?? view = new View(context);
        view.f34060a = 0;
        view.f34062c = true;
        view.f34063e = new Object();
        Paint paint3 = new Paint(1);
        view.f34064f = paint3;
        Paint paint4 = new Paint(1);
        view.h = paint4;
        Paint paint5 = new Paint(1);
        view.f34065n = paint5;
        TextPaint textPaint = new TextPaint(1);
        view.f34066r = textPaint;
        view.f34067s = new Path();
        view.setWillNotDraw(false);
        view.f34069x = dVar;
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
        this.f36478q0 = view;
        view.setDelegate(new hd0(this));
        view.setVisibility(4);
        if (z11) {
            addView((View) view, b8.mf.e(-1, -1, 51));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36468g0 = frameLayout2;
        addView(frameLayout2, b8.mf.e(-1, (!z11 ? 40 : 0) + 186, 83));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackgroundColor(-16777216);
        frameLayout2.addView(frameLayout3, b8.mf.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.f36470i0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView.setText(org.telegram.messenger.bd.M0(2131752589, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout3.addView(textView, b8.mf.e(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.f36469h0 = textView2;
        textView2.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.k6.f28071ng;
        org.telegram.ui.ActionBar.r6.V(textView2, i15, e6Var);
        textView2.setGravity(17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView2.setText(org.telegram.messenger.bd.M0(2131751355, null).toUpperCase());
        textView2.setTypeface(org.telegram.messenger.g0.o());
        frameLayout3.addView(textView2, b8.mf.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout3.addView(linearLayout, b8.mf.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.A0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232283);
        org.telegram.ui.ActionBar.r6.t(imageView, i15, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView, b8.mf.o(56, 48));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final nd0 f34677b;

            {
                this.f34677b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        nd0 nd0Var = this.f34677b;
                        nd0Var.f36492z0 = 0;
                        org.telegram.ui.ActionBar.r6.t(nd0Var.A0, org.telegram.ui.ActionBar.k6.f28071ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var.B0.setColorFilter((ColorFilter) null);
                        nd0Var.C0.setColorFilter((ColorFilter) null);
                        nd0Var.c();
                        return;
                    case 1:
                        nd0 nd0Var2 = this.f34677b;
                        nd0Var2.f36492z0 = 1;
                        nd0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(nd0Var2.B0, org.telegram.ui.ActionBar.k6.f28071ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var2.C0.setColorFilter((ColorFilter) null);
                        nd0Var2.c();
                        return;
                    default:
                        nd0 nd0Var3 = this.f34677b;
                        nd0Var3.f36492z0 = 2;
                        nd0Var3.A0.setColorFilter((ColorFilter) null);
                        nd0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(nd0Var3.C0, org.telegram.ui.ActionBar.k6.f28071ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var3.c();
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.B0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232278);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView2, b8.mf.o(56, 48));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final nd0 f34677b;

            {
                this.f34677b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        nd0 nd0Var = this.f34677b;
                        nd0Var.f36492z0 = 0;
                        org.telegram.ui.ActionBar.r6.t(nd0Var.A0, org.telegram.ui.ActionBar.k6.f28071ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var.B0.setColorFilter((ColorFilter) null);
                        nd0Var.C0.setColorFilter((ColorFilter) null);
                        nd0Var.c();
                        return;
                    case 1:
                        nd0 nd0Var2 = this.f34677b;
                        nd0Var2.f36492z0 = 1;
                        nd0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(nd0Var2.B0, org.telegram.ui.ActionBar.k6.f28071ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var2.C0.setColorFilter((ColorFilter) null);
                        nd0Var2.c();
                        return;
                    default:
                        nd0 nd0Var3 = this.f34677b;
                        nd0Var3.f36492z0 = 2;
                        nd0Var3.A0.setColorFilter((ColorFilter) null);
                        nd0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(nd0Var3.C0, org.telegram.ui.ActionBar.k6.f28071ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var3.c();
                        return;
                }
            }
        });
        if (b51Var != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.C0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232280);
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView3, b8.mf.o(56, 48));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final nd0 f34677b;

            {
                this.f34677b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        nd0 nd0Var = this.f34677b;
                        nd0Var.f36492z0 = 0;
                        org.telegram.ui.ActionBar.r6.t(nd0Var.A0, org.telegram.ui.ActionBar.k6.f28071ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var.B0.setColorFilter((ColorFilter) null);
                        nd0Var.C0.setColorFilter((ColorFilter) null);
                        nd0Var.c();
                        return;
                    case 1:
                        nd0 nd0Var2 = this.f34677b;
                        nd0Var2.f36492z0 = 1;
                        nd0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(nd0Var2.B0, org.telegram.ui.ActionBar.k6.f28071ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var2.C0.setColorFilter((ColorFilter) null);
                        nd0Var2.c();
                        return;
                    default:
                        nd0 nd0Var3 = this.f34677b;
                        nd0Var3.f36492z0 = 2;
                        nd0Var3.A0.setColorFilter((ColorFilter) null);
                        nd0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(nd0Var3.C0, org.telegram.ui.ActionBar.k6.f28071ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var3.c();
                        return;
                }
            }
        });
        bh bhVar = new bh(context, 1);
        this.f36475n0 = bhVar;
        u4.b0 b0Var = new u4.b0();
        b0Var.j1(1);
        bhVar.setLayoutManager(b0Var);
        bhVar.setClipToPadding(false);
        bhVar.setOverScrollMode(2);
        bhVar.setAdapter(new org.telegram.ui.n4(4, this, context));
        frameLayout2.addView(bhVar, b8.mf.e(-1, (!z11 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f36484u0 = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout2.addView(frameLayout4, b8.mf.d(-1, 78.0f, 1, 0.0f, (!z11 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout4.addView(linearLayout2, b8.mf.e(-2, -2, 1));
        int i16 = 0;
        while (i16 < 4) {
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setTag(Integer.valueOf(i16));
            this.f36485v0[i16] = new RadioButton(context);
            this.f36485v0[i16].setSize(org.telegram.messenger.g0.L(20.0f));
            frameLayout5.addView(this.f36485v0[i16], b8.mf.e(30, 30, 49));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 12.0f);
            textView3.setGravity(16);
            if (i16 == 0) {
                String M0 = org.telegram.messenger.bd.M0(2131751693, null);
                textView3.setText(M0.substring(0, 1).toUpperCase() + M0.substring(1).toLowerCase());
                textView3.setTextColor(-1);
                this.f36485v0[i16].b(-1, -1);
            } else if (i16 == 1) {
                String M02 = org.telegram.messenger.bd.M0(2131751690, null);
                textView3.setText(M02.substring(0, 1).toUpperCase() + M02.substring(1).toLowerCase());
                textView3.setTextColor(-1684147);
                this.f36485v0[i16].b(-1684147, -1684147);
            } else if (i16 == 2) {
                String M03 = org.telegram.messenger.bd.M0(2131751691, null);
                textView3.setText(M03.substring(0, 1).toUpperCase() + M03.substring(1).toLowerCase());
                textView3.setTextColor(-10831009);
                this.f36485v0[i16].b(-10831009, -10831009);
            } else if (i16 == 3) {
                String M04 = org.telegram.messenger.bd.M0(2131751692, null);
                textView3.setText(M04.substring(0, 1).toUpperCase() + M04.substring(1).toLowerCase());
                textView3.setTextColor(-12734994);
                this.f36485v0[i16].b(-12734994, -12734994);
            }
            frameLayout5.addView(textView3, b8.mf.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            linearLayout2.addView(frameLayout5, b8.mf.k(i16 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            frameLayout5.setOnClickListener(new View.OnClickListener(this) {
                public final nd0 f35046b;

                {
                    this.f35046b = this;
                }

                @Override
                public final void onClick(View view2) {
                    boolean z13;
                    switch (r2) {
                        case 0:
                            nd0 nd0Var = this.f35046b;
                            nd0Var.getClass();
                            int intValue = ((Integer) view2.getTag()).intValue();
                            nd0Var.f36458a0.f11818a = intValue;
                            for (int i17 = 0; i17 < 4; i17++) {
                                RadioButton radioButton = nd0Var.f36485v0[i17];
                                if (i17 == intValue) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                radioButton.a(z13, true);
                            }
                            nd0Var.f36478q0.invalidate();
                            return;
                        case 1:
                            nd0 nd0Var2 = this.f35046b;
                            nd0Var2.U = 0;
                            nd0Var2.e();
                            nd0Var2.f36477p0.setVisibility(4);
                            py pyVar = nd0Var2.m0;
                            if (pyVar != null) {
                                pyVar.c(false, false, false);
                                return;
                            }
                            return;
                        case 2:
                            nd0 nd0Var3 = this.f35046b;
                            nd0Var3.U = 1;
                            nd0Var3.e();
                            ed0 ed0Var = nd0Var3.f36477p0;
                            ed0Var.setVisibility(0);
                            ed0Var.setType(1);
                            py pyVar2 = nd0Var3.m0;
                            if (pyVar2 != null) {
                                pyVar2.c(false, false, false);
                                return;
                            }
                            return;
                        default:
                            nd0 nd0Var4 = this.f35046b;
                            nd0Var4.U = 2;
                            nd0Var4.e();
                            ed0 ed0Var2 = nd0Var4.f36477p0;
                            ed0Var2.setVisibility(0);
                            ed0Var2.setType(0);
                            py pyVar3 = nd0Var4.m0;
                            if (pyVar3 != null) {
                                pyVar3.c(false, false, false);
                                return;
                            }
                            return;
                    }
                }
            });
            i16++;
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.f36476o0 = frameLayout6;
        frameLayout6.setVisibility(4);
        this.f36468g0.addView(frameLayout6, b8.mf.d(280, 60.0f, 1, 0.0f, (z11 ? 0 : 40) + 40, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f36480r0 = textView4;
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(org.telegram.messenger.bd.M0(2131753673, null));
        frameLayout6.addView(textView4, b8.mf.c(60.0f, 80));
        textView4.setOnClickListener(new View.OnClickListener(this) {
            public final nd0 f35046b;

            {
                this.f35046b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                switch (r2) {
                    case 0:
                        nd0 nd0Var = this.f35046b;
                        nd0Var.getClass();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        nd0Var.f36458a0.f11818a = intValue;
                        for (int i17 = 0; i17 < 4; i17++) {
                            RadioButton radioButton = nd0Var.f36485v0[i17];
                            if (i17 == intValue) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            radioButton.a(z13, true);
                        }
                        nd0Var.f36478q0.invalidate();
                        return;
                    case 1:
                        nd0 nd0Var2 = this.f35046b;
                        nd0Var2.U = 0;
                        nd0Var2.e();
                        nd0Var2.f36477p0.setVisibility(4);
                        py pyVar = nd0Var2.m0;
                        if (pyVar != null) {
                            pyVar.c(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        nd0 nd0Var3 = this.f35046b;
                        nd0Var3.U = 1;
                        nd0Var3.e();
                        ed0 ed0Var = nd0Var3.f36477p0;
                        ed0Var.setVisibility(0);
                        ed0Var.setType(1);
                        py pyVar2 = nd0Var3.m0;
                        if (pyVar2 != null) {
                            pyVar2.c(false, false, false);
                            return;
                        }
                        return;
                    default:
                        nd0 nd0Var4 = this.f35046b;
                        nd0Var4.U = 2;
                        nd0Var4.e();
                        ed0 ed0Var2 = nd0Var4.f36477p0;
                        ed0Var2.setVisibility(0);
                        ed0Var2.setType(0);
                        py pyVar3 = nd0Var4.m0;
                        if (pyVar3 != null) {
                            pyVar3.c(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView5 = new TextView(context);
        this.f36482s0 = textView5;
        textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(1);
        textView5.setText(org.telegram.messenger.bd.M0(2131753672, null));
        frameLayout6.addView(textView5, b8.mf.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        textView5.setOnClickListener(new View.OnClickListener(this) {
            public final nd0 f35046b;

            {
                this.f35046b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                switch (r2) {
                    case 0:
                        nd0 nd0Var = this.f35046b;
                        nd0Var.getClass();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        nd0Var.f36458a0.f11818a = intValue;
                        for (int i17 = 0; i17 < 4; i17++) {
                            RadioButton radioButton = nd0Var.f36485v0[i17];
                            if (i17 == intValue) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            radioButton.a(z13, true);
                        }
                        nd0Var.f36478q0.invalidate();
                        return;
                    case 1:
                        nd0 nd0Var2 = this.f35046b;
                        nd0Var2.U = 0;
                        nd0Var2.e();
                        nd0Var2.f36477p0.setVisibility(4);
                        py pyVar = nd0Var2.m0;
                        if (pyVar != null) {
                            pyVar.c(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        nd0 nd0Var3 = this.f35046b;
                        nd0Var3.U = 1;
                        nd0Var3.e();
                        ed0 ed0Var = nd0Var3.f36477p0;
                        ed0Var.setVisibility(0);
                        ed0Var.setType(1);
                        py pyVar2 = nd0Var3.m0;
                        if (pyVar2 != null) {
                            pyVar2.c(false, false, false);
                            return;
                        }
                        return;
                    default:
                        nd0 nd0Var4 = this.f35046b;
                        nd0Var4.U = 2;
                        nd0Var4.e();
                        ed0 ed0Var2 = nd0Var4.f36477p0;
                        ed0Var2.setVisibility(0);
                        ed0Var2.setType(0);
                        py pyVar3 = nd0Var4.m0;
                        if (pyVar3 != null) {
                            pyVar3.c(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView6 = new TextView(context);
        this.f36483t0 = textView6;
        textView6.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(1);
        textView6.setText(org.telegram.messenger.bd.M0(2131753674, null));
        frameLayout6.addView(textView6, b8.mf.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        textView6.setOnClickListener(new View.OnClickListener(this) {
            public final nd0 f35046b;

            {
                this.f35046b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                switch (r2) {
                    case 0:
                        nd0 nd0Var = this.f35046b;
                        nd0Var.getClass();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        nd0Var.f36458a0.f11818a = intValue;
                        for (int i17 = 0; i17 < 4; i17++) {
                            RadioButton radioButton = nd0Var.f36485v0[i17];
                            if (i17 == intValue) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            radioButton.a(z13, true);
                        }
                        nd0Var.f36478q0.invalidate();
                        return;
                    case 1:
                        nd0 nd0Var2 = this.f35046b;
                        nd0Var2.U = 0;
                        nd0Var2.e();
                        nd0Var2.f36477p0.setVisibility(4);
                        py pyVar = nd0Var2.m0;
                        if (pyVar != null) {
                            pyVar.c(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        nd0 nd0Var3 = this.f35046b;
                        nd0Var3.U = 1;
                        nd0Var3.e();
                        ed0 ed0Var = nd0Var3.f36477p0;
                        ed0Var.setVisibility(0);
                        ed0Var.setType(1);
                        py pyVar2 = nd0Var3.m0;
                        if (pyVar2 != null) {
                            pyVar2.c(false, false, false);
                            return;
                        }
                        return;
                    default:
                        nd0 nd0Var4 = this.f35046b;
                        nd0Var4.U = 2;
                        nd0Var4.e();
                        ed0 ed0Var2 = nd0Var4.f36477p0;
                        ed0Var2.setVisibility(0);
                        ed0Var2.setType(0);
                        py pyVar3 = nd0Var4.m0;
                        if (pyVar3 != null) {
                            pyVar3.c(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        e();
        if (this.f36491y0 || !z11) {
            return;
        }
        if (this.f36472k0) {
            ((FrameLayout.LayoutParams) this.f36471j0.getLayoutParams()).topMargin = org.telegram.messenger.g0.f22602m;
        }
        ((FrameLayout.LayoutParams) this.f36478q0.getLayoutParams()).topMargin = org.telegram.messenger.g0.f22602m;
    }

    private void setShowOriginal(boolean z10) {
        if (this.f36457a != z10) {
            this.f36457a = z10;
            py pyVar = this.m0;
            if (pyVar != null) {
                pyVar.c(false, false, false);
            }
        }
    }

    public final boolean a() {
        org.telegram.messenger.ze zeVar = this.f36467f0;
        g2.d dVar = this.f36458a0;
        if (zeVar != null) {
            if (this.H != zeVar.f26784a || this.J != zeVar.d || this.Q != zeVar.f26791j || this.I != zeVar.f26786c || this.K != zeVar.f26787e || this.L != zeVar.f26788f || this.S != zeVar.f26793l || this.R != zeVar.f26792k || this.T != zeVar.f26794m || this.V != zeVar.f26796o || this.M != zeVar.f26789g || this.N != zeVar.f26785b || this.P != zeVar.f26790i || this.O != zeVar.h || !dVar.F()) {
                return true;
            }
            return false;
        } else if (this.H != 0.0f || this.J != 0.0f || this.Q != 0.0f || this.I != 0.0f || this.K != 0.0f || this.L != 0.0f || this.S != 0.0f || this.R != 0.0f || this.T != 0.0f || this.V != 0.0f || this.M != 0.0f || this.N != 0.0f || this.P != 0 || this.O != 0 || !dVar.F()) {
            return true;
        } else {
            return false;
        }
    }

    public final void b() {
        boolean z10 = this.f36472k0;
        TextureView textureView = this.f36471j0;
        if (z10) {
            py pyVar = this.m0;
            if (pyVar != null) {
                pyVar.postRunnable(new my(pyVar, 0));
                this.m0 = null;
            }
            textureView.setVisibility(8);
        } else if (textureView instanceof b51) {
            b51 b51Var = (b51) textureView;
            org.telegram.messenger.ze zeVar = this.f36467f0;
            if (zeVar == null) {
                b51Var.setDelegate(null);
                return;
            }
            py pyVar2 = this.m0;
            if (pyVar2 != null) {
                pyVar2.e(new nh(zeVar, 1));
            }
        }
    }

    public final void c() {
        boolean z10;
        int i3 = this.f36492z0;
        bh bhVar = this.f36475n0;
        gd0 gd0Var = this.f36478q0;
        FrameLayout frameLayout = this.f36484u0;
        FrameLayout frameLayout2 = this.f36476o0;
        ed0 ed0Var = this.f36477p0;
        if (i3 == 0) {
            ed0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            gd0Var.setVisibility(4);
            bhVar.setVisibility(0);
        } else if (i3 == 1) {
            bhVar.setVisibility(4);
            frameLayout.setVisibility(4);
            gd0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.U != 0) {
                ed0Var.setVisibility(0);
            }
            e();
        } else if (i3 == 2) {
            bhVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            ed0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            gd0Var.setVisibility(0);
            this.f36458a0.f11818a = 0;
            for (int i10 = 0; i10 < 4; i10++) {
                RadioButton radioButton = this.f36485v0[i10];
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, false);
            }
        }
    }

    public final void d() {
        boolean z10;
        if (Math.abs(this.H) < 0.1f && Math.abs(this.N) < 0.1f && Math.abs(this.I) < 0.1f && Math.abs(this.J) < 0.1f && Math.abs(this.K) < 0.1f && Math.abs(this.L) < 0.1f && Math.abs(this.M) < 0.1f && this.O == 0 && this.P == 0 && Math.abs(this.Q) < 0.1f && Math.abs(this.R) < 0.1f && Math.abs(this.S) < 0.1f && Math.abs(this.T) < 0.1f && this.U == 0 && Math.abs(this.V) < 0.1f && this.f36458a0.F()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j10);
        nb0 nb0Var = this.f36487w0;
        if (nb0Var != null && view == (textureView = this.f36471j0)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.E0;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.F0;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.H0;
                int i3 = this.I0;
                if (i3 != 0) {
                    Matrix matrix = this.G0;
                    matrix.reset();
                    matrix.postRotate(i3, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    float height = (bitmap.getHeight() - bitmap.getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                    matrix.postScale(rect.width() / bitmap.getHeight(), rect.height() / bitmap.getWidth());
                    canvas.drawBitmap(bitmap, matrix, paint);
                } else {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                }
            }
            float measuredWidth2 = textureView.getMeasuredWidth() / nb0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            nb0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        int i3 = this.U;
        TextView textView = this.f36483t0;
        TextView textView2 = this.f36482s0;
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        TextView textView3 = this.f36480r0;
        if (i3 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(2131232070).mutate();
            int i10 = org.telegram.ui.ActionBar.k6.f28071ng;
            org.telegram.ui.ActionBar.r6.y(this, mutate, i10, e6Var, PorterDuff.Mode.MULTIPLY);
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 2131232071, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 2131232069, 0, 0);
            textView.setTextColor(-1);
        } else if (i3 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 2131232070, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(2131232071).mutate();
            int i11 = org.telegram.ui.ActionBar.k6.f28071ng;
            org.telegram.ui.ActionBar.r6.y(this, mutate2, i11, e6Var, PorterDuff.Mode.MULTIPLY);
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 2131232069, 0, 0);
            textView.setTextColor(-1);
        } else if (i3 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 2131232070, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 2131232071, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(2131232069).mutate();
            int i12 = org.telegram.ui.ActionBar.k6.f28071ng;
            org.telegram.ui.ActionBar.r6.y(this, mutate3, i12, e6Var, PorterDuff.Mode.MULTIPLY);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
        }
        d();
    }

    public Bitmap getBitmap() {
        py pyVar = this.m0;
        if (pyVar != null && pyVar.f37277f && pyVar.isAlive()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                if (pyVar.postRunnable(new e7(pyVar, bitmapArr, countDownLatch, 9))) {
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
        return this.f36465e0;
    }

    public ed0 getBlurControl() {
        return this.f36477p0;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return this.f36463d0;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return this.f36462c0;
    }

    @Override
    public float getBlurExcludeSize() {
        return this.f36460b0;
    }

    @Override
    public int getBlurType() {
        return this.U;
    }

    public TextView getCancelTextView() {
        return this.f36470i0;
    }

    @Override
    public float getContrastValue() {
        return a1.g.A(this.J, 100.0f, 0.3f, 1.0f);
    }

    public gd0 getCurveControl() {
        return this.f36478q0;
    }

    public TextView getDoneTextView() {
        return this.f36469h0;
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
        return com.google.android.recaptcha.internal.a.x(this.Q, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (this.f36472k0 && !this.f36473l0) {
            return this.f36471j0;
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

    public org.telegram.messenger.ze getSavedFilterState() {
        org.telegram.messenger.ze zeVar = new org.telegram.messenger.ze();
        zeVar.f26784a = this.H;
        zeVar.f26786c = this.I;
        zeVar.d = this.J;
        zeVar.f26787e = this.K;
        zeVar.f26788f = this.L;
        zeVar.f26789g = this.M;
        zeVar.f26785b = this.N;
        zeVar.h = this.O;
        zeVar.f26790i = this.P;
        zeVar.f26791j = this.Q;
        zeVar.f26792k = this.R;
        zeVar.f26793l = this.S;
        zeVar.f26794m = this.T;
        zeVar.f26795n = this.U;
        zeVar.f26796o = this.V;
        zeVar.f26797p = this.f36458a0;
        zeVar.f26798q = this.f36460b0;
        zeVar.f26799r = this.f36462c0;
        zeVar.f26800s = this.f36463d0;
        zeVar.f26801t = this.f36465e0;
        this.f36467f0 = zeVar;
        return zeVar;
    }

    @Override
    public float getShadowsValue() {
        return com.google.android.recaptcha.internal.a.x(this.R, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return a1.g.A(this.V, 100.0f, 0.6f, 0.11f);
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
        return this.f36468g0;
    }

    public Bitmap getUiBlurBitmap() {
        ca caVar;
        py pyVar = this.m0;
        if (pyVar == null || (caVar = pyVar.J) == null) {
            return null;
        }
        synchronized (caVar.f32632n) {
            try {
                if (!caVar.f32635q) {
                    return null;
                }
                return caVar.f32634p;
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
    public final ByteBuffer h() {
        g2.d dVar = this.f36458a0;
        dVar.q();
        return (ByteBuffer) dVar.f11822f;
    }

    @Override
    public final boolean j(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                setShowOriginal(false);
            }
        } else {
            TextureView textureView = this.f36471j0;
            if (textureView instanceof b51) {
                float x10 = motionEvent.getX();
                float y9 = motionEvent.getY();
                ni0 ni0Var = ((b51) textureView).f32089c;
                float f10 = ni0Var.f36563a;
                if (x10 >= f10 && x10 <= f10 + ni0Var.f36565c) {
                    float f11 = ni0Var.f36564b;
                    if (y9 >= f11 && y9 <= f11 + ni0Var.d) {
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
    public final boolean o() {
        if (!this.f36457a && !this.W) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
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
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        if (this.f36473l0) {
            int L = size - org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(214.0f);
            boolean z10 = this.f36491y0;
            if (!z10) {
                i11 = org.telegram.messenger.g0.f22602m;
            } else {
                i11 = 0;
            }
            int i14 = size2 - (L2 + i11);
            TextureView textureView = this.f36471j0;
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
                i12 = org.telegram.messenger.g0.f22602m;
            } else {
                i12 = 0;
            }
            int ceil3 = (int) Math.ceil(L3 + i12);
            int i16 = (int) f13;
            int i17 = (int) ceil;
            if (this.f36472k0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = ceil2;
                layoutParams.topMargin = ceil3;
                layoutParams.width = i16;
                layoutParams.height = i17;
            }
            float f16 = ceil2;
            if (!z10) {
                i13 = org.telegram.messenger.g0.f22602m;
            } else {
                i13 = 0;
            }
            float f17 = ceil3 - i13;
            float f18 = i16;
            float f19 = i17;
            gd0 gd0Var = this.f36478q0;
            ni0 ni0Var = gd0Var.f34063e;
            ni0Var.f36563a = f16;
            ni0Var.f36564b = f17;
            ni0Var.f36565c = f18;
            ni0Var.d = f19;
            ed0 ed0Var = this.f36477p0;
            lt0 lt0Var = ed0Var.d;
            lt0Var.f35877a = f18;
            lt0Var.f35878b = f19;
            ((FrameLayout.LayoutParams) ed0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(38.0f) + i14;
            ((FrameLayout.LayoutParams) gd0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(28.0f) + i14;
            if (org.telegram.messenger.g0.Q1()) {
                int L4 = org.telegram.messenger.g0.L(86.0f) * 10;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f36475n0.getLayoutParams();
                if (L4 < L) {
                    layoutParams2.width = L4;
                    layoutParams2.leftMargin = (L - L4) / 2;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.leftMargin = 0;
                }
            }
        }
        super.onMeasure(i3, i10);
    }

    public void setEnhanceValue(float f10) {
        this.H = f10 * 100.0f;
        d();
        int i3 = 0;
        while (true) {
            bh bhVar = this.f36475n0;
            if (i3 >= bhVar.getChildCount()) {
                break;
            }
            View childAt = bhVar.getChildAt(i3);
            if ((childAt instanceof org.telegram.ui.Cells.s5) && RecyclerView.R(childAt) == this.f36459b) {
                ((org.telegram.ui.Cells.s5) childAt).a(org.telegram.messenger.bd.M0(2131751127, null), 0, this.H);
                break;
            }
            i3++;
        }
        py pyVar = this.m0;
        if (pyVar != null) {
            pyVar.c(true, false, false);
        }
    }

    @Override
    public final boolean v() {
        return !this.f36458a0.F();
    }
}
