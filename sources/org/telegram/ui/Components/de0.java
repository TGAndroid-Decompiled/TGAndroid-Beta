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
public final class de0 extends FrameLayout implements dz, hi.jb {
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
    public final org.telegram.ui.ActionBar.i6 J0;
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
    public boolean f34280a;
    public final h2.c f34281a0;
    public final int f34282b;
    public float f34283b0;
    public final int f34284c;
    public PointF f34285c0;
    public final int d;
    public float f34286d0;
    public final int f34287e;
    public float f34288e0;
    public final int f34289f;
    public org.telegram.messenger.ff f34290f0;
    public final FrameLayout f34291g0;
    public final int h;
    public final TextView f34292h0;
    public final TextView f34293i0;
    public final TextureView f34294j0;
    public final boolean f34295k0;
    public final boolean f34296l0;
    public bz m0;
    public final int f34297n;
    public final uh f34298n0;
    public final FrameLayout f34299o0;
    public final ud0 f34300p0;
    public final wd0 f34301q0;
    public final int f34302r;
    public final TextView f34303r0;
    public final int f34304s;
    public final TextView f34305s0;
    public final TextView f34306t0;
    public final FrameLayout f34307u0;
    public final RadioButton[] f34308v0;
    public final int f34309w;
    public final cc0 f34310w0;
    public final int f34311x;
    public final boolean f34312x0;
    public final int f34313y;
    public final boolean f34314y0;
    public int f34315z0;

    public de0(Context context, x51 x51Var, Bitmap bitmap, Bitmap bitmap2, int i7, org.telegram.messenger.ff ffVar, cc0 cc0Var, int i10, boolean z10, boolean z11, ba baVar, final org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f34308v0 = new RadioButton[4];
        this.F0 = new Rect();
        this.G0 = new Matrix();
        this.H0 = new Paint(2);
        this.f34296l0 = z11;
        this.J0 = i6Var;
        boolean z12 = context instanceof BubbleActivity;
        this.f34314y0 = z12;
        this.f34310w0 = cc0Var;
        this.f34312x0 = z10;
        this.G = 0;
        if (i10 == 1) {
            this.G = 1;
            this.f34297n = 0;
        } else if (i10 == 0) {
            this.f34297n = -1;
        }
        int i11 = this.G;
        this.f34282b = i11;
        this.f34284c = i11 + 1;
        this.d = i11 + 2;
        this.f34287e = i11 + 3;
        this.f34289f = i11 + 4;
        this.h = i11 + 5;
        this.f34302r = i11 + 6;
        this.f34304s = i11 + 7;
        int i12 = i11 + 9;
        this.G = i12;
        this.f34309w = i11 + 8;
        if (i10 == 2) {
            this.G = i11 + 10;
            this.f34297n = i12;
        }
        if (x51Var == null) {
            int i13 = this.G;
            this.G = i13 + 1;
            this.f34311x = i13;
        } else {
            this.f34311x = -1;
        }
        int i14 = this.G;
        this.f34313y = i14;
        this.E = i14 + 1;
        this.G = i14 + 3;
        this.F = i14 + 2;
        if (ffVar != null) {
            this.H = ffVar.f23994a;
            this.N = ffVar.f23995b;
            this.I = ffVar.f23996c;
            this.J = ffVar.d;
            this.K = ffVar.f23997e;
            this.L = ffVar.f23998f;
            this.M = ffVar.f23999g;
            this.O = ffVar.h;
            this.P = ffVar.f24000i;
            this.Q = ffVar.f24001j;
            this.R = ffVar.f24002k;
            this.S = ffVar.f24003l;
            this.T = ffVar.f24004m;
            this.U = ffVar.f24005n;
            this.V = ffVar.f24006o;
            this.f34281a0 = ffVar.f24007p;
            this.f34283b0 = ffVar.f24008q;
            this.f34285c0 = ffVar.f24009r;
            this.f34286d0 = ffVar.f24010s;
            this.W = ffVar.a();
            this.f34288e0 = ffVar.f24011t;
            this.f34290f0 = ffVar;
        } else {
            this.f34281a0 = new h2.c();
            this.f34283b0 = 0.35f;
            this.f34285c0 = new PointF(0.5f, 0.5f);
            this.f34286d0 = 0.15f;
            this.f34288e0 = 1.5707964f;
            this.W = true;
        }
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.I0 = i7;
        if (x51Var != null) {
            this.f34294j0 = x51Var;
            x51Var.setDelegate(new xd0(this));
        } else {
            this.f34295k0 = true;
            v40 v40Var = new v40(1, context, this);
            this.f34294j0 = v40Var;
            if (z11) {
                addView(v40Var, c8.na.e(-1, -1, 51));
            }
            v40Var.setVisibility(4);
            v40Var.setSurfaceTextureListener(new ae0(this, z11, baVar));
        }
        ?? frameLayout = new FrameLayout(context);
        frameLayout.f40350a = new PointF();
        frameLayout.d = new Object();
        frameLayout.f40353e = new PointF(0.5f, 0.5f);
        frameLayout.f40354f = 0.15f;
        frameLayout.h = 0.35f;
        frameLayout.f40356r = new RectF();
        frameLayout.f40360y = 1.0f;
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
        this.f34300p0 = frameLayout;
        frameLayout.setVisibility(4);
        if (z11) {
            addView((View) frameLayout, c8.na.e(-1, -1, 51));
        }
        frameLayout.setDelegate(new xd0(this));
        h2.c cVar = this.f34281a0;
        ?? view = new View(context);
        view.f41610a = 0;
        view.f41612c = true;
        view.f41613e = new Object();
        Paint paint3 = new Paint(1);
        view.f41614f = paint3;
        Paint paint4 = new Paint(1);
        view.h = paint4;
        Paint paint5 = new Paint(1);
        view.f41615n = paint5;
        TextPaint textPaint = new TextPaint(1);
        view.f41616r = textPaint;
        view.f41617s = new Path();
        view.setWillNotDraw(false);
        view.f41619x = cVar;
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
        this.f34301q0 = view;
        view.setDelegate(new xd0(this));
        view.setVisibility(4);
        if (z11) {
            addView((View) view, c8.na.e(-1, -1, 51));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f34291g0 = frameLayout2;
        addView(frameLayout2, c8.na.e(-1, (!z11 ? 40 : 0) + 186, 83));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackgroundColor(-16777216);
        frameLayout2.addView(frameLayout3, c8.na.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.f34293i0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView.setText(org.telegram.messenger.gd.N0(2131752577, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout3.addView(textView, c8.na.e(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.f34292h0 = textView2;
        textView2.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.n6.f29700qg;
        org.telegram.ui.ActionBar.u6.U(textView2, i15, i6Var);
        textView2.setGravity(17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView2.setText(org.telegram.messenger.gd.N0(2131751342, null).toUpperCase());
        textView2.setTypeface(org.telegram.messenger.g0.o());
        frameLayout3.addView(textView2, c8.na.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout3.addView(linearLayout, c8.na.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.A0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232288);
        org.telegram.ui.ActionBar.u6.s(imageView, i15, i6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView, c8.na.o(56, 48));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final de0 f42435b;

            {
                this.f42435b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        de0 de0Var = this.f42435b;
                        de0Var.f34315z0 = 0;
                        org.telegram.ui.ActionBar.u6.s(de0Var.A0, org.telegram.ui.ActionBar.n6.f29700qg, i6Var, PorterDuff.Mode.MULTIPLY);
                        de0Var.B0.setColorFilter((ColorFilter) null);
                        de0Var.C0.setColorFilter((ColorFilter) null);
                        de0Var.c();
                        return;
                    case 1:
                        de0 de0Var2 = this.f42435b;
                        de0Var2.f34315z0 = 1;
                        de0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.u6.s(de0Var2.B0, org.telegram.ui.ActionBar.n6.f29700qg, i6Var, PorterDuff.Mode.MULTIPLY);
                        de0Var2.C0.setColorFilter((ColorFilter) null);
                        de0Var2.c();
                        return;
                    default:
                        de0 de0Var3 = this.f42435b;
                        de0Var3.f34315z0 = 2;
                        de0Var3.A0.setColorFilter((ColorFilter) null);
                        de0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.u6.s(de0Var3.C0, org.telegram.ui.ActionBar.n6.f29700qg, i6Var, PorterDuff.Mode.MULTIPLY);
                        de0Var3.c();
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.B0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232283);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView2, c8.na.o(56, 48));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final de0 f42435b;

            {
                this.f42435b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        de0 de0Var = this.f42435b;
                        de0Var.f34315z0 = 0;
                        org.telegram.ui.ActionBar.u6.s(de0Var.A0, org.telegram.ui.ActionBar.n6.f29700qg, i6Var, PorterDuff.Mode.MULTIPLY);
                        de0Var.B0.setColorFilter((ColorFilter) null);
                        de0Var.C0.setColorFilter((ColorFilter) null);
                        de0Var.c();
                        return;
                    case 1:
                        de0 de0Var2 = this.f42435b;
                        de0Var2.f34315z0 = 1;
                        de0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.u6.s(de0Var2.B0, org.telegram.ui.ActionBar.n6.f29700qg, i6Var, PorterDuff.Mode.MULTIPLY);
                        de0Var2.C0.setColorFilter((ColorFilter) null);
                        de0Var2.c();
                        return;
                    default:
                        de0 de0Var3 = this.f42435b;
                        de0Var3.f34315z0 = 2;
                        de0Var3.A0.setColorFilter((ColorFilter) null);
                        de0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.u6.s(de0Var3.C0, org.telegram.ui.ActionBar.n6.f29700qg, i6Var, PorterDuff.Mode.MULTIPLY);
                        de0Var3.c();
                        return;
                }
            }
        });
        if (x51Var != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.C0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232285);
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView3, c8.na.o(56, 48));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final de0 f42435b;

            {
                this.f42435b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        de0 de0Var = this.f42435b;
                        de0Var.f34315z0 = 0;
                        org.telegram.ui.ActionBar.u6.s(de0Var.A0, org.telegram.ui.ActionBar.n6.f29700qg, i6Var, PorterDuff.Mode.MULTIPLY);
                        de0Var.B0.setColorFilter((ColorFilter) null);
                        de0Var.C0.setColorFilter((ColorFilter) null);
                        de0Var.c();
                        return;
                    case 1:
                        de0 de0Var2 = this.f42435b;
                        de0Var2.f34315z0 = 1;
                        de0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.u6.s(de0Var2.B0, org.telegram.ui.ActionBar.n6.f29700qg, i6Var, PorterDuff.Mode.MULTIPLY);
                        de0Var2.C0.setColorFilter((ColorFilter) null);
                        de0Var2.c();
                        return;
                    default:
                        de0 de0Var3 = this.f42435b;
                        de0Var3.f34315z0 = 2;
                        de0Var3.A0.setColorFilter((ColorFilter) null);
                        de0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.u6.s(de0Var3.C0, org.telegram.ui.ActionBar.n6.f29700qg, i6Var, PorterDuff.Mode.MULTIPLY);
                        de0Var3.c();
                        return;
                }
            }
        });
        uh uhVar = new uh(context, 1);
        this.f34298n0 = uhVar;
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(1);
        uhVar.setLayoutManager(c0Var);
        uhVar.setClipToPadding(false);
        uhVar.setOverScrollMode(2);
        uhVar.setAdapter(new org.telegram.ui.l4(4, this, context));
        frameLayout2.addView(uhVar, c8.na.e(-1, (!z11 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f34307u0 = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout2.addView(frameLayout4, c8.na.d(-1, 78.0f, 1, 0.0f, (!z11 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout4.addView(linearLayout2, c8.na.e(-2, -2, 1));
        int i16 = 0;
        while (i16 < 4) {
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setTag(Integer.valueOf(i16));
            this.f34308v0[i16] = new RadioButton(context);
            this.f34308v0[i16].setSize(org.telegram.messenger.g0.L(20.0f));
            frameLayout5.addView(this.f34308v0[i16], c8.na.e(30, 30, 49));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 12.0f);
            textView3.setGravity(16);
            if (i16 == 0) {
                String N0 = org.telegram.messenger.gd.N0(2131751680, null);
                textView3.setText(N0.substring(0, 1).toUpperCase() + N0.substring(1).toLowerCase());
                textView3.setTextColor(-1);
                this.f34308v0[i16].b(-1, -1);
            } else if (i16 == 1) {
                String N02 = org.telegram.messenger.gd.N0(2131751677, null);
                textView3.setText(N02.substring(0, 1).toUpperCase() + N02.substring(1).toLowerCase());
                textView3.setTextColor(-1684147);
                this.f34308v0[i16].b(-1684147, -1684147);
            } else if (i16 == 2) {
                String N03 = org.telegram.messenger.gd.N0(2131751678, null);
                textView3.setText(N03.substring(0, 1).toUpperCase() + N03.substring(1).toLowerCase());
                textView3.setTextColor(-10831009);
                this.f34308v0[i16].b(-10831009, -10831009);
            } else if (i16 == 3) {
                String N04 = org.telegram.messenger.gd.N0(2131751679, null);
                textView3.setText(N04.substring(0, 1).toUpperCase() + N04.substring(1).toLowerCase());
                textView3.setTextColor(-12734994);
                this.f34308v0[i16].b(-12734994, -12734994);
            }
            frameLayout5.addView(textView3, c8.na.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            linearLayout2.addView(frameLayout5, c8.na.k(i16 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            frameLayout5.setOnClickListener(new View.OnClickListener(this) {
                public final de0 f42837b;

                {
                    this.f42837b = this;
                }

                @Override
                public final void onClick(View view2) {
                    boolean z13;
                    switch (r2) {
                        case 0:
                            de0 de0Var = this.f42837b;
                            de0Var.getClass();
                            int intValue = ((Integer) view2.getTag()).intValue();
                            de0Var.f34281a0.f13724a = intValue;
                            for (int i17 = 0; i17 < 4; i17++) {
                                RadioButton radioButton = de0Var.f34308v0[i17];
                                if (i17 == intValue) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                radioButton.a(z13, true);
                            }
                            de0Var.f34301q0.invalidate();
                            return;
                        case 1:
                            de0 de0Var2 = this.f42837b;
                            de0Var2.U = 0;
                            de0Var2.e();
                            de0Var2.f34300p0.setVisibility(4);
                            bz bzVar = de0Var2.m0;
                            if (bzVar != null) {
                                bzVar.c(false, false, false);
                                return;
                            }
                            return;
                        case 2:
                            de0 de0Var3 = this.f42837b;
                            de0Var3.U = 1;
                            de0Var3.e();
                            ud0 ud0Var = de0Var3.f34300p0;
                            ud0Var.setVisibility(0);
                            ud0Var.setType(1);
                            bz bzVar2 = de0Var3.m0;
                            if (bzVar2 != null) {
                                bzVar2.c(false, false, false);
                                return;
                            }
                            return;
                        default:
                            de0 de0Var4 = this.f42837b;
                            de0Var4.U = 2;
                            de0Var4.e();
                            ud0 ud0Var2 = de0Var4.f34300p0;
                            ud0Var2.setVisibility(0);
                            ud0Var2.setType(0);
                            bz bzVar3 = de0Var4.m0;
                            if (bzVar3 != null) {
                                bzVar3.c(false, false, false);
                                return;
                            }
                            return;
                    }
                }
            });
            i16++;
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.f34299o0 = frameLayout6;
        frameLayout6.setVisibility(4);
        this.f34291g0.addView(frameLayout6, c8.na.d(280, 60.0f, 1, 0.0f, (z11 ? 0 : 40) + 40, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f34303r0 = textView4;
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(org.telegram.messenger.gd.N0(2131753670, null));
        frameLayout6.addView(textView4, c8.na.c(60.0f, 80));
        textView4.setOnClickListener(new View.OnClickListener(this) {
            public final de0 f42837b;

            {
                this.f42837b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                switch (r2) {
                    case 0:
                        de0 de0Var = this.f42837b;
                        de0Var.getClass();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        de0Var.f34281a0.f13724a = intValue;
                        for (int i17 = 0; i17 < 4; i17++) {
                            RadioButton radioButton = de0Var.f34308v0[i17];
                            if (i17 == intValue) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            radioButton.a(z13, true);
                        }
                        de0Var.f34301q0.invalidate();
                        return;
                    case 1:
                        de0 de0Var2 = this.f42837b;
                        de0Var2.U = 0;
                        de0Var2.e();
                        de0Var2.f34300p0.setVisibility(4);
                        bz bzVar = de0Var2.m0;
                        if (bzVar != null) {
                            bzVar.c(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        de0 de0Var3 = this.f42837b;
                        de0Var3.U = 1;
                        de0Var3.e();
                        ud0 ud0Var = de0Var3.f34300p0;
                        ud0Var.setVisibility(0);
                        ud0Var.setType(1);
                        bz bzVar2 = de0Var3.m0;
                        if (bzVar2 != null) {
                            bzVar2.c(false, false, false);
                            return;
                        }
                        return;
                    default:
                        de0 de0Var4 = this.f42837b;
                        de0Var4.U = 2;
                        de0Var4.e();
                        ud0 ud0Var2 = de0Var4.f34300p0;
                        ud0Var2.setVisibility(0);
                        ud0Var2.setType(0);
                        bz bzVar3 = de0Var4.m0;
                        if (bzVar3 != null) {
                            bzVar3.c(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView5 = new TextView(context);
        this.f34305s0 = textView5;
        textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(1);
        textView5.setText(org.telegram.messenger.gd.N0(2131753669, null));
        frameLayout6.addView(textView5, c8.na.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        textView5.setOnClickListener(new View.OnClickListener(this) {
            public final de0 f42837b;

            {
                this.f42837b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                switch (r2) {
                    case 0:
                        de0 de0Var = this.f42837b;
                        de0Var.getClass();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        de0Var.f34281a0.f13724a = intValue;
                        for (int i17 = 0; i17 < 4; i17++) {
                            RadioButton radioButton = de0Var.f34308v0[i17];
                            if (i17 == intValue) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            radioButton.a(z13, true);
                        }
                        de0Var.f34301q0.invalidate();
                        return;
                    case 1:
                        de0 de0Var2 = this.f42837b;
                        de0Var2.U = 0;
                        de0Var2.e();
                        de0Var2.f34300p0.setVisibility(4);
                        bz bzVar = de0Var2.m0;
                        if (bzVar != null) {
                            bzVar.c(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        de0 de0Var3 = this.f42837b;
                        de0Var3.U = 1;
                        de0Var3.e();
                        ud0 ud0Var = de0Var3.f34300p0;
                        ud0Var.setVisibility(0);
                        ud0Var.setType(1);
                        bz bzVar2 = de0Var3.m0;
                        if (bzVar2 != null) {
                            bzVar2.c(false, false, false);
                            return;
                        }
                        return;
                    default:
                        de0 de0Var4 = this.f42837b;
                        de0Var4.U = 2;
                        de0Var4.e();
                        ud0 ud0Var2 = de0Var4.f34300p0;
                        ud0Var2.setVisibility(0);
                        ud0Var2.setType(0);
                        bz bzVar3 = de0Var4.m0;
                        if (bzVar3 != null) {
                            bzVar3.c(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView6 = new TextView(context);
        this.f34306t0 = textView6;
        textView6.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(1);
        textView6.setText(org.telegram.messenger.gd.N0(2131753671, null));
        frameLayout6.addView(textView6, c8.na.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        textView6.setOnClickListener(new View.OnClickListener(this) {
            public final de0 f42837b;

            {
                this.f42837b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z13;
                switch (r2) {
                    case 0:
                        de0 de0Var = this.f42837b;
                        de0Var.getClass();
                        int intValue = ((Integer) view2.getTag()).intValue();
                        de0Var.f34281a0.f13724a = intValue;
                        for (int i17 = 0; i17 < 4; i17++) {
                            RadioButton radioButton = de0Var.f34308v0[i17];
                            if (i17 == intValue) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            radioButton.a(z13, true);
                        }
                        de0Var.f34301q0.invalidate();
                        return;
                    case 1:
                        de0 de0Var2 = this.f42837b;
                        de0Var2.U = 0;
                        de0Var2.e();
                        de0Var2.f34300p0.setVisibility(4);
                        bz bzVar = de0Var2.m0;
                        if (bzVar != null) {
                            bzVar.c(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        de0 de0Var3 = this.f42837b;
                        de0Var3.U = 1;
                        de0Var3.e();
                        ud0 ud0Var = de0Var3.f34300p0;
                        ud0Var.setVisibility(0);
                        ud0Var.setType(1);
                        bz bzVar2 = de0Var3.m0;
                        if (bzVar2 != null) {
                            bzVar2.c(false, false, false);
                            return;
                        }
                        return;
                    default:
                        de0 de0Var4 = this.f42837b;
                        de0Var4.U = 2;
                        de0Var4.e();
                        ud0 ud0Var2 = de0Var4.f34300p0;
                        ud0Var2.setVisibility(0);
                        ud0Var2.setType(0);
                        bz bzVar3 = de0Var4.m0;
                        if (bzVar3 != null) {
                            bzVar3.c(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        e();
        if (this.f34314y0 || !z11) {
            return;
        }
        if (this.f34295k0) {
            ((FrameLayout.LayoutParams) this.f34294j0.getLayoutParams()).topMargin = org.telegram.messenger.g0.f24220m;
        }
        ((FrameLayout.LayoutParams) this.f34301q0.getLayoutParams()).topMargin = org.telegram.messenger.g0.f24220m;
    }

    private void setShowOriginal(boolean z10) {
        if (this.f34280a != z10) {
            this.f34280a = z10;
            bz bzVar = this.m0;
            if (bzVar != null) {
                bzVar.c(false, false, false);
            }
        }
    }

    public final boolean a() {
        org.telegram.messenger.ff ffVar = this.f34290f0;
        h2.c cVar = this.f34281a0;
        if (ffVar != null) {
            if (this.H != ffVar.f23994a || this.J != ffVar.d || this.Q != ffVar.f24001j || this.I != ffVar.f23996c || this.K != ffVar.f23997e || this.L != ffVar.f23998f || this.S != ffVar.f24003l || this.R != ffVar.f24002k || this.T != ffVar.f24004m || this.V != ffVar.f24006o || this.M != ffVar.f23999g || this.N != ffVar.f23995b || this.P != ffVar.f24000i || this.O != ffVar.h || !cVar.F()) {
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
        boolean z10 = this.f34295k0;
        TextureView textureView = this.f34294j0;
        if (z10) {
            bz bzVar = this.m0;
            if (bzVar != null) {
                bzVar.postRunnable(new yy(bzVar, 0));
                this.m0 = null;
            }
            textureView.setVisibility(8);
        } else if (textureView instanceof x51) {
            x51 x51Var = (x51) textureView;
            org.telegram.messenger.ff ffVar = this.f34290f0;
            if (ffVar == null) {
                x51Var.setDelegate(null);
                return;
            }
            bz bzVar2 = this.m0;
            if (bzVar2 != null) {
                bzVar2.d(new org.telegram.ui.ActionBar.i5(ffVar));
            }
        }
    }

    public final void c() {
        boolean z10;
        int i7 = this.f34315z0;
        uh uhVar = this.f34298n0;
        wd0 wd0Var = this.f34301q0;
        FrameLayout frameLayout = this.f34307u0;
        FrameLayout frameLayout2 = this.f34299o0;
        ud0 ud0Var = this.f34300p0;
        if (i7 == 0) {
            ud0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            wd0Var.setVisibility(4);
            uhVar.setVisibility(0);
        } else if (i7 == 1) {
            uhVar.setVisibility(4);
            frameLayout.setVisibility(4);
            wd0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.U != 0) {
                ud0Var.setVisibility(0);
            }
            e();
        } else if (i7 == 2) {
            uhVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            ud0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            wd0Var.setVisibility(0);
            this.f34281a0.f13724a = 0;
            for (int i10 = 0; i10 < 4; i10++) {
                RadioButton radioButton = this.f34308v0[i10];
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
        if (Math.abs(this.H) < 0.1f && Math.abs(this.N) < 0.1f && Math.abs(this.I) < 0.1f && Math.abs(this.J) < 0.1f && Math.abs(this.K) < 0.1f && Math.abs(this.L) < 0.1f && Math.abs(this.M) < 0.1f && this.O == 0 && this.P == 0 && Math.abs(this.Q) < 0.1f && Math.abs(this.R) < 0.1f && Math.abs(this.S) < 0.1f && Math.abs(this.T) < 0.1f && this.U == 0 && Math.abs(this.V) < 0.1f && this.f34281a0.F()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j3);
        cc0 cc0Var = this.f34310w0;
        if (cc0Var != null && view == (textureView = this.f34294j0)) {
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
            float measuredWidth2 = textureView.getMeasuredWidth() / cc0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            cc0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        int i7 = this.U;
        TextView textView = this.f34306t0;
        TextView textView2 = this.f34305s0;
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        TextView textView3 = this.f34303r0;
        if (i7 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(2131232075).mutate();
            int i10 = org.telegram.ui.ActionBar.n6.f29700qg;
            org.telegram.ui.ActionBar.u6.x(this, mutate, i10, i6Var, PorterDuff.Mode.MULTIPLY);
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 2131232076, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 2131232074, 0, 0);
            textView.setTextColor(-1);
        } else if (i7 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 2131232075, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(2131232076).mutate();
            int i11 = org.telegram.ui.ActionBar.n6.f29700qg;
            org.telegram.ui.ActionBar.u6.x(this, mutate2, i11, i6Var, PorterDuff.Mode.MULTIPLY);
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 2131232074, 0, 0);
            textView.setTextColor(-1);
        } else if (i7 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 2131232075, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 2131232076, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(2131232074).mutate();
            int i12 = org.telegram.ui.ActionBar.n6.f29700qg;
            org.telegram.ui.ActionBar.u6.x(this, mutate3, i12, i6Var, PorterDuff.Mode.MULTIPLY);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
        }
        d();
    }

    public Bitmap getBitmap() {
        bz bzVar = this.m0;
        if (bzVar != null && bzVar.f33852f && bzVar.isAlive()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                if (bzVar.postRunnable(new org.telegram.ui.Cells.fa(bzVar, bitmapArr, countDownLatch, 12))) {
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
        return this.f34288e0;
    }

    public ud0 getBlurControl() {
        return this.f34300p0;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return this.f34286d0;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return this.f34285c0;
    }

    @Override
    public float getBlurExcludeSize() {
        return this.f34283b0;
    }

    @Override
    public int getBlurType() {
        return this.U;
    }

    public TextView getCancelTextView() {
        return this.f34293i0;
    }

    @Override
    public float getContrastValue() {
        return com.google.android.gms.internal.vision.e2.c(this.J, 100.0f, 0.3f, 1.0f);
    }

    public wd0 getCurveControl() {
        return this.f34301q0;
    }

    public TextView getDoneTextView() {
        return this.f34292h0;
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
        if (this.f34295k0 && !this.f34296l0) {
            return this.f34294j0;
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

    public org.telegram.messenger.ff getSavedFilterState() {
        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff();
        ffVar.f23994a = this.H;
        ffVar.f23996c = this.I;
        ffVar.d = this.J;
        ffVar.f23997e = this.K;
        ffVar.f23998f = this.L;
        ffVar.f23999g = this.M;
        ffVar.f23995b = this.N;
        ffVar.h = this.O;
        ffVar.f24000i = this.P;
        ffVar.f24001j = this.Q;
        ffVar.f24002k = this.R;
        ffVar.f24003l = this.S;
        ffVar.f24004m = this.T;
        ffVar.f24005n = this.U;
        ffVar.f24006o = this.V;
        ffVar.f24007p = this.f34281a0;
        ffVar.f24008q = this.f34283b0;
        ffVar.f24009r = this.f34285c0;
        ffVar.f24010s = this.f34286d0;
        ffVar.f24011t = this.f34288e0;
        this.f34290f0 = ffVar;
        return ffVar;
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
        return this.f34291g0;
    }

    public Bitmap getUiBlurBitmap() {
        ga gaVar;
        bz bzVar = this.m0;
        if (bzVar == null || (gaVar = bzVar.J) == null) {
            return null;
        }
        synchronized (gaVar.f35386n) {
            try {
                if (!gaVar.f35389q) {
                    return null;
                }
                return gaVar.f35388p;
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
    public final boolean i(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                setShowOriginal(false);
            }
        } else {
            TextureView textureView = this.f34294j0;
            if (textureView instanceof x51) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                aj0 aj0Var = ((x51) textureView).f41851c;
                float f10 = aj0Var.f33482a;
                if (x10 >= f10 && x10 <= f10 + aj0Var.f33484c) {
                    float f11 = aj0Var.f33483b;
                    if (y10 >= f11 && y10 <= f11 + aj0Var.d) {
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
    public final ByteBuffer k() {
        h2.c cVar = this.f34281a0;
        cVar.q();
        return (ByteBuffer) cVar.f13728f;
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
        if (this.f34296l0) {
            int L = size - org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(214.0f);
            boolean z10 = this.f34314y0;
            if (!z10) {
                i11 = org.telegram.messenger.g0.f24220m;
            } else {
                i11 = 0;
            }
            int i14 = size2 - (L2 + i11);
            TextureView textureView = this.f34294j0;
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
                i12 = org.telegram.messenger.g0.f24220m;
            } else {
                i12 = 0;
            }
            int ceil3 = (int) Math.ceil(L3 + i12);
            int i16 = (int) f13;
            int i17 = (int) ceil;
            if (this.f34295k0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = ceil2;
                layoutParams.topMargin = ceil3;
                layoutParams.width = i16;
                layoutParams.height = i17;
            }
            float f16 = ceil2;
            if (!z10) {
                i13 = org.telegram.messenger.g0.f24220m;
            } else {
                i13 = 0;
            }
            float f17 = ceil3 - i13;
            float f18 = i16;
            float f19 = i17;
            wd0 wd0Var = this.f34301q0;
            aj0 aj0Var = wd0Var.f41613e;
            aj0Var.f33482a = f16;
            aj0Var.f33483b = f17;
            aj0Var.f33484c = f18;
            aj0Var.d = f19;
            ud0 ud0Var = this.f34300p0;
            xt0 xt0Var = ud0Var.d;
            xt0Var.f42189a = f18;
            xt0Var.f42190b = f19;
            ((FrameLayout.LayoutParams) ud0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(38.0f) + i14;
            ((FrameLayout.LayoutParams) wd0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(28.0f) + i14;
            if (org.telegram.messenger.g0.Q1()) {
                int L4 = org.telegram.messenger.g0.L(86.0f) * 10;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f34298n0.getLayoutParams();
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
        d();
        int i7 = 0;
        while (true) {
            uh uhVar = this.f34298n0;
            if (i7 >= uhVar.getChildCount()) {
                break;
            }
            View childAt = uhVar.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.t5) && RecyclerView.R(childAt) == this.f34282b) {
                ((org.telegram.ui.Cells.t5) childAt).a(org.telegram.messenger.gd.N0(2131751114, null), 0, this.H);
                break;
            }
            i7++;
        }
        bz bzVar = this.m0;
        if (bzVar != null) {
            bzVar.c(true, false, false);
        }
    }

    @Override
    public final boolean x() {
        if (!this.f34280a && !this.W) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean z() {
        return !this.f34281a0.F();
    }
}
