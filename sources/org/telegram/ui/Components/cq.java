package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.InputFilter;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
public class cq extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final int f25133f0 = 0;
    public AnimatorSet D;
    public final EditTextBoldCursor[] E;
    public final org.telegram.ui.ActionBar.g0 F;
    public final ImageView G;
    public final TextView H;
    public final org.telegram.ui.ActionBar.t0 I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final float[] N;
    public final float[] O;
    public LinearGradient P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public float U;
    public long V;
    public float W;
    public final bq f25134a;
    public float f25135a0;
    public final Paint f25136b;
    public float f25137b0;
    public final Paint f25138c;
    public float f25139c0;
    public final Paint d;
    public org.telegram.ui.ActionBar.p6 f25140d0;
    public final Paint e;
    public int f25141e0;
    public final Drawable f25142f;
    public boolean h;
    public final RectF f25143n;
    public boolean f25144r;
    public Bitmap f25145s;
    public final ColorPicker$RadioButton[] f25146w;
    public final FrameLayout f25147x;
    public final ai.b f25148y;

    public cq(Context context, boolean z10, bq bqVar) {
        super(context);
        boolean z11;
        this.f25143n = new RectF();
        this.f25146w = new ColorPicker$RadioButton[4];
        this.K = 1;
        this.L = 1;
        this.N = new float[]{0.0f, 0.0f, 1.0f};
        this.O = new float[3];
        this.U = 1.0f;
        this.W = 0.0f;
        this.f25135a0 = 1.0f;
        this.f25137b0 = 0.0f;
        this.f25139c0 = 1.0f;
        this.f25134a = bqVar;
        this.E = new EditTextBoldCursor[2];
        setWillNotDraw(false);
        this.f25142f = context.getResources().getDrawable(2131231600).mutate();
        this.d = new Paint(1);
        this.f25136b = new Paint(5);
        this.f25138c = new Paint(5);
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        ai.b bVar = new ai.b(this, context);
        this.f25148y = bVar;
        bVar.setOrientation(0);
        addView(bVar, w7.b6.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        bVar.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25147x = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, w7.b6.d(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        for (int i10 = 0; i10 < 4; i10++) {
            this.f25146w[i10] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.f25146w[i10];
            if (this.S == i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            colorPicker$RadioButton.d = z11;
            colorPicker$RadioButton.b(false);
            this.f25147x.addView(this.f25146w[i10], w7.b6.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f25146w[i10].setOnClickListener(new View.OnClickListener(this) {
                public final cq f32528b;

                {
                    this.f32528b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    boolean z12;
                    boolean z13;
                    int i12 = r2;
                    cq cqVar = this.f32528b;
                    switch (i12) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            bq bqVar2 = cqVar.f25134a;
                            org.telegram.ui.ActionBar.g0 g0Var = cqVar.F;
                            ImageView imageView = cqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.f25146w;
                            if (cqVar.D == null) {
                                int i13 = cqVar.K;
                                if (i13 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i11 = 0;
                                        colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i11 = 0;
                                    }
                                    if (cqVar.h) {
                                        bqVar2.c(colorPicker$RadioButtonArr[i11].e, i11, true);
                                    }
                                    bqVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                    cqVar.K = 2;
                                } else if (i13 == 2) {
                                    cqVar.K = 3;
                                    if (colorPicker$RadioButtonArr[2].e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                        float f7 = fArr[0];
                                        if (f7 > 180.0f) {
                                            fArr[0] = f7 - 60.0f;
                                        } else {
                                            fArr[0] = f7 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    bqVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i13 == 3) {
                                    cqVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    bqVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (cqVar.K < cqVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 0.0f));
                                }
                                if (cqVar.K > 1) {
                                    if (g0Var.getVisibility() != 0) {
                                        g0Var.setScaleX(0.0f);
                                        g0Var.setScaleY(0.0f);
                                    }
                                    g0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[cqVar.K - 1].callOnClick();
                                cqVar.D = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                                cqVar.D.playTogether(arrayList);
                                cqVar.D.setDuration(180L);
                                cqVar.D.setInterpolator(gr.f26496g);
                                cqVar.D.addListener(new aq(cqVar, 1));
                                cqVar.D.start();
                                return;
                            }
                            return;
                        case 1:
                            bq bqVar3 = cqVar.f25134a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.g0 g0Var2 = cqVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.f25146w;
                            ImageView imageView2 = cqVar.G;
                            if (cqVar.D == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i14 = cqVar.K;
                                if (i14 == 2) {
                                    cqVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var2, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, 0.0f));
                                } else if (i14 == 3) {
                                    cqVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, org.telegram.messenger.i0.L(13.0f) + org.telegram.messenger.i0.L(30.0f)));
                                } else if (i14 == 4) {
                                    cqVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, org.telegram.messenger.m5.D(13.0f, 2, org.telegram.messenger.i0.L(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (cqVar.K < cqVar.L) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 0.0f));
                                }
                                int i15 = cqVar.S;
                                if (i15 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                    for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                        colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i17 = cqVar.T;
                                if (i17 >= 0 && i17 < cqVar.S) {
                                    colorPicker$RadioButtonArr2[i17].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[cqVar.K - 1].callOnClick();
                                }
                                for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                    if (i18 < cqVar.K) {
                                        int i19 = colorPicker$RadioButtonArr2[i18].e;
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        bqVar3.c(i19, i18, z13);
                                    } else {
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        bqVar3.c(0, i18, z12);
                                    }
                                }
                                cqVar.D = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                                cqVar.D.playTogether(arrayList2);
                                cqVar.D.setDuration(180L);
                                cqVar.D.setInterpolator(gr.f26496g);
                                cqVar.D.addListener(new aq(cqVar, 0));
                                cqVar.D.start();
                                return;
                            }
                            return;
                        case 2:
                            cq.a(cqVar, view);
                            return;
                        default:
                            cqVar.I.U(null, null);
                            return;
                    }
                }
            });
        }
        int i11 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.E;
            if (i11 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i11 % 2 == 0) {
                editTextBoldCursorArr[i11] = new yp(this, context, i11, 0);
                this.E[i11].setBackgroundDrawable(null);
                this.E[i11].setText("#");
                this.E[i11].setEnabled(false);
                this.E[i11].setFocusable(false);
                this.E[i11].setPadding(0, org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(16.0f));
                this.f25148y.addView(this.E[i11], w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i11] = new yp(this, context, i11, 1);
                this.E[i11].setBackgroundDrawable(null);
                this.E[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.E[i11].setHint("8BC6ED");
                this.E[i11].setPadding(0, org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(16.0f));
                this.f25148y.addView(this.E[i11], w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.E[i11].addTextChangedListener(new zp(this, i11));
                this.E[i11].setOnEditorActionListener(new ig.r(3));
            }
            this.E[i11].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.a7.E(this.E[i11], org.telegram.ui.ActionBar.t6.H6, this.f25140d0);
            EditTextBoldCursor editTextBoldCursor = this.E[i11];
            int i12 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i12, this.f25140d0);
            this.E[i11].setCursorColor(org.telegram.ui.ActionBar.t6.w0(i12, this.f25140d0));
            this.E[i11].setCursorSize(org.telegram.messenger.i0.L(18.0f));
            this.E[i11].setCursorWidth(1.5f);
            this.E[i11].setSingleLine(true);
            this.E[i11].setGravity(19);
            this.E[i11].setHeaderHintColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.L6, this.f25140d0));
            this.E[i11].setTransformHintToHeader(true);
            this.E[i11].setInputType(524416);
            this.E[i11].setImeOptions(268435462);
            if (i11 == 1) {
                this.E[i11].requestFocus();
            } else if (i11 == 2 || i11 == 3) {
                this.E[i11].setVisibility(8);
            }
            i11++;
        }
        ImageView imageView = new ImageView(getContext());
        this.G = imageView;
        int i13 = org.telegram.ui.ActionBar.t6.I5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, this.f25140d0), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        org.telegram.ui.ActionBar.p6 p6Var = this.f25140d0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, p6Var);
        imageView.setImageResource(2131232041);
        int i14 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var2 = this.f25140d0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i14, p6Var2, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final cq f32528b;

            {
                this.f32528b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112;
                boolean z12;
                boolean z13;
                int i122 = r2;
                cq cqVar = this.f32528b;
                switch (i122) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        bq bqVar2 = cqVar.f25134a;
                        org.telegram.ui.ActionBar.g0 g0Var = cqVar.F;
                        ImageView imageView2 = cqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.f25146w;
                        if (cqVar.D == null) {
                            int i132 = cqVar.K;
                            if (i132 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i112 = 0;
                                    colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i112 = 0;
                                }
                                if (cqVar.h) {
                                    bqVar2.c(colorPicker$RadioButtonArr[i112].e, i112, true);
                                }
                                bqVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                cqVar.K = 2;
                            } else if (i132 == 2) {
                                cqVar.K = 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f7 = fArr[0];
                                    if (f7 > 180.0f) {
                                        fArr[0] = f7 - 60.0f;
                                    } else {
                                        fArr[0] = f7 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                bqVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i132 == 3) {
                                cqVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                bqVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (cqVar.K < cqVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (cqVar.K > 1) {
                                if (g0Var.getVisibility() != 0) {
                                    g0Var.setScaleX(0.0f);
                                    g0Var.setScaleY(0.0f);
                                }
                                g0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(g0Var, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(g0Var, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(g0Var, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[cqVar.K - 1].callOnClick();
                            cqVar.D = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                            cqVar.D.playTogether(arrayList);
                            cqVar.D.setDuration(180L);
                            cqVar.D.setInterpolator(gr.f26496g);
                            cqVar.D.addListener(new aq(cqVar, 1));
                            cqVar.D.start();
                            return;
                        }
                        return;
                    case 1:
                        bq bqVar3 = cqVar.f25134a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.g0 g0Var2 = cqVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.f25146w;
                        ImageView imageView22 = cqVar.G;
                        if (cqVar.D == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i142 = cqVar.K;
                            if (i142 == 2) {
                                cqVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var2, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var2, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var2, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i142 == 3) {
                                cqVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.i0.L(13.0f) + org.telegram.messenger.i0.L(30.0f)));
                            } else if (i142 == 4) {
                                cqVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.m5.D(13.0f, 2, org.telegram.messenger.i0.L(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (cqVar.K < cqVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i15 = cqVar.S;
                            if (i15 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                    colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i17 = cqVar.T;
                            if (i17 >= 0 && i17 < cqVar.S) {
                                colorPicker$RadioButtonArr2[i17].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[cqVar.K - 1].callOnClick();
                            }
                            for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                if (i18 < cqVar.K) {
                                    int i19 = colorPicker$RadioButtonArr2[i18].e;
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    bqVar3.c(i19, i18, z13);
                                } else {
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    bqVar3.c(0, i18, z12);
                                }
                            }
                            cqVar.D = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                            cqVar.D.playTogether(arrayList2);
                            cqVar.D.setDuration(180L);
                            cqVar.D.setInterpolator(gr.f26496g);
                            cqVar.D.addListener(new aq(cqVar, 0));
                            cqVar.D.start();
                            return;
                        }
                        return;
                    case 2:
                        cq.a(cqVar, view);
                        return;
                    default:
                        cqVar.I.U(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754486, null));
        addView(imageView, w7.b6.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.g0 g0Var = new org.telegram.ui.ActionBar.g0(this, getContext(), 1);
        this.F = g0Var;
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, this.f25140d0), 1, -1);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i13);
        org.telegram.ui.ActionBar.p6 p6Var3 = this.f25140d0;
        g0Var.setBackground(h03);
        org.telegram.ui.ActionBar.a7.k(g0Var, h03, null, N2, p6Var3);
        g0Var.setImageResource(2131232095);
        org.telegram.ui.ActionBar.a7.t(g0Var, i14, this.f25140d0, mode);
        g0Var.setAlpha(0.0f);
        g0Var.setScaleX(0.0f);
        g0Var.setScaleY(0.0f);
        g0Var.setScaleType(scaleType);
        g0Var.setVisibility(4);
        g0Var.setOnClickListener(new View.OnClickListener(this) {
            public final cq f32528b;

            {
                this.f32528b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112;
                boolean z12;
                boolean z13;
                int i122 = r2;
                cq cqVar = this.f32528b;
                switch (i122) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        bq bqVar2 = cqVar.f25134a;
                        org.telegram.ui.ActionBar.g0 g0Var2 = cqVar.F;
                        ImageView imageView2 = cqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.f25146w;
                        if (cqVar.D == null) {
                            int i132 = cqVar.K;
                            if (i132 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i112 = 0;
                                    colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i112 = 0;
                                }
                                if (cqVar.h) {
                                    bqVar2.c(colorPicker$RadioButtonArr[i112].e, i112, true);
                                }
                                bqVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                cqVar.K = 2;
                            } else if (i132 == 2) {
                                cqVar.K = 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f7 = fArr[0];
                                    if (f7 > 180.0f) {
                                        fArr[0] = f7 - 60.0f;
                                    } else {
                                        fArr[0] = f7 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                bqVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i132 == 3) {
                                cqVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                bqVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (cqVar.K < cqVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (cqVar.K > 1) {
                                if (g0Var2.getVisibility() != 0) {
                                    g0Var2.setScaleX(0.0f);
                                    g0Var2.setScaleY(0.0f);
                                }
                                g0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(g0Var2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(g0Var2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(g0Var2, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[cqVar.K - 1].callOnClick();
                            cqVar.D = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                            cqVar.D.playTogether(arrayList);
                            cqVar.D.setDuration(180L);
                            cqVar.D.setInterpolator(gr.f26496g);
                            cqVar.D.addListener(new aq(cqVar, 1));
                            cqVar.D.start();
                            return;
                        }
                        return;
                    case 1:
                        bq bqVar3 = cqVar.f25134a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.g0 g0Var22 = cqVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.f25146w;
                        ImageView imageView22 = cqVar.G;
                        if (cqVar.D == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i142 = cqVar.K;
                            if (i142 == 2) {
                                cqVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var22, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i142 == 3) {
                                cqVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.i0.L(13.0f) + org.telegram.messenger.i0.L(30.0f)));
                            } else if (i142 == 4) {
                                cqVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.m5.D(13.0f, 2, org.telegram.messenger.i0.L(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (cqVar.K < cqVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i15 = cqVar.S;
                            if (i15 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                    colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i17 = cqVar.T;
                            if (i17 >= 0 && i17 < cqVar.S) {
                                colorPicker$RadioButtonArr2[i17].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[cqVar.K - 1].callOnClick();
                            }
                            for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                if (i18 < cqVar.K) {
                                    int i19 = colorPicker$RadioButtonArr2[i18].e;
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    bqVar3.c(i19, i18, z13);
                                } else {
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    bqVar3.c(0, i18, z12);
                                }
                            }
                            cqVar.D = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                            cqVar.D.playTogether(arrayList2);
                            cqVar.D.setDuration(180L);
                            cqVar.D.setInterpolator(gr.f26496g);
                            cqVar.D.addListener(new aq(cqVar, 0));
                            cqVar.D.start();
                            return;
                        }
                        return;
                    case 2:
                        cq.a(cqVar, view);
                        return;
                    default:
                        cqVar.I.U(null, null);
                        return;
                }
            }
        });
        g0Var.setContentDescription(org.telegram.messenger.cd.L0(2131752099, null));
        addView(g0Var, w7.b6.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.H = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        org.telegram.ui.ActionBar.a7.V(textView, i14, this.f25140d0);
        addView(textView, w7.b6.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new bh.c(6));
        if (z10) {
            org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.t6.w0(i14, this.f25140d0));
            this.I = t0Var;
            t0Var.setLongClickEnabled(false);
            t0Var.setIcon(2131231245);
            t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
            t0Var.e(1, 2131232115, org.telegram.messenger.cd.L0(2131747813, null));
            t0Var.e(2, 2131232362, org.telegram.messenger.cd.L0(2131745444, null));
            t0Var.e(3, 2131232107, org.telegram.messenger.cd.L0(2131751487, null));
            t0Var.setMenuYOffset(-org.telegram.messenger.i0.L(80.0f));
            t0Var.setSubMenuOpenSide(2);
            t0Var.setDelegate(new t(this, 26));
            t0Var.setAdditionalYOffset(org.telegram.messenger.i0.L(72.0f));
            t0Var.setTranslationX(org.telegram.messenger.i0.L(6.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, this.f25140d0), 1, -1);
            org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i13);
            org.telegram.ui.ActionBar.p6 p6Var4 = this.f25140d0;
            t0Var.setBackground(h04);
            org.telegram.ui.ActionBar.a7.k(t0Var, h04, null, N3, p6Var4);
            addView(t0Var, w7.b6.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            t0Var.setOnClickListener(new View.OnClickListener(this) {
                public final cq f32528b;

                {
                    this.f32528b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112;
                    boolean z12;
                    boolean z13;
                    int i122 = r2;
                    cq cqVar = this.f32528b;
                    switch (i122) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            bq bqVar2 = cqVar.f25134a;
                            org.telegram.ui.ActionBar.g0 g0Var2 = cqVar.F;
                            ImageView imageView2 = cqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.f25146w;
                            if (cqVar.D == null) {
                                int i132 = cqVar.K;
                                if (i132 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i112 = 0;
                                        colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i112 = 0;
                                    }
                                    if (cqVar.h) {
                                        bqVar2.c(colorPicker$RadioButtonArr[i112].e, i112, true);
                                    }
                                    bqVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                    cqVar.K = 2;
                                } else if (i132 == 2) {
                                    cqVar.K = 3;
                                    if (colorPicker$RadioButtonArr[2].e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                        float f7 = fArr[0];
                                        if (f7 > 180.0f) {
                                            fArr[0] = f7 - 60.0f;
                                        } else {
                                            fArr[0] = f7 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    bqVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i132 == 3) {
                                    cqVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    bqVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (cqVar.K < cqVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                                }
                                if (cqVar.K > 1) {
                                    if (g0Var2.getVisibility() != 0) {
                                        g0Var2.setScaleX(0.0f);
                                        g0Var2.setScaleY(0.0f);
                                    }
                                    g0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var2, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[cqVar.K - 1].callOnClick();
                                cqVar.D = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                                cqVar.D.playTogether(arrayList);
                                cqVar.D.setDuration(180L);
                                cqVar.D.setInterpolator(gr.f26496g);
                                cqVar.D.addListener(new aq(cqVar, 1));
                                cqVar.D.start();
                                return;
                            }
                            return;
                        case 1:
                            bq bqVar3 = cqVar.f25134a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.g0 g0Var22 = cqVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.f25146w;
                            ImageView imageView22 = cqVar.G;
                            if (cqVar.D == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i142 = cqVar.K;
                                if (i142 == 2) {
                                    cqVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var22, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                                } else if (i142 == 3) {
                                    cqVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.i0.L(13.0f) + org.telegram.messenger.i0.L(30.0f)));
                                } else if (i142 == 4) {
                                    cqVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.m5.D(13.0f, 2, org.telegram.messenger.i0.L(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (cqVar.K < cqVar.L) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                                }
                                int i15 = cqVar.S;
                                if (i15 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                    for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                        colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i17 = cqVar.T;
                                if (i17 >= 0 && i17 < cqVar.S) {
                                    colorPicker$RadioButtonArr2[i17].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[cqVar.K - 1].callOnClick();
                                }
                                for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                    if (i18 < cqVar.K) {
                                        int i19 = colorPicker$RadioButtonArr2[i18].e;
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        bqVar3.c(i19, i18, z13);
                                    } else {
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        bqVar3.c(0, i18, z12);
                                    }
                                }
                                cqVar.D = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                                cqVar.D.playTogether(arrayList2);
                                cqVar.D.setDuration(180L);
                                cqVar.D.setInterpolator(gr.f26496g);
                                cqVar.D.addListener(new aq(cqVar, 0));
                                cqVar.D.start();
                                return;
                            }
                            return;
                        case 2:
                            cq.a(cqVar, view);
                            return;
                        default:
                            cqVar.I.U(null, null);
                            return;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(cq cqVar, View view) {
        boolean z10;
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i10 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.f25146w;
            if (i10 < colorPicker$RadioButtonArr.length) {
                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i10];
                if (colorPicker$RadioButton2 == colorPicker$RadioButton) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                colorPicker$RadioButton2.d = z10;
                colorPicker$RadioButton2.b(true);
                if (z10) {
                    cqVar.T = cqVar.S;
                    cqVar.S = i10;
                }
                i10++;
            } else {
                int i11 = colorPicker$RadioButton.e;
                cqVar.setColorInner(i11);
                cqVar.E[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i11)), Byte.valueOf((byte) Color.green(i11)), Byte.valueOf((byte) Color.blue(i11))).toUpperCase());
                return;
            }
        }
    }

    public static int d(int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        float f7 = fArr[1];
        if (f7 > 0.5f) {
            fArr[1] = f7 - 0.15f;
        } else {
            fArr[1] = f7 + 0.15f;
        }
        float f10 = fArr[0];
        if (f10 > 180.0f) {
            fArr[0] = f10 - 20.0f;
        } else {
            fArr[0] = f10 + 20.0f;
        }
        return Color.HSVToColor(255, fArr);
    }

    private float getBrightness() {
        return Math.max(this.f25137b0, Math.min(this.N[2], this.f25139c0));
    }

    public void setColorInner(int i10) {
        Color.colorToHSV(i10, this.N);
        int d = this.f25134a.d(this.S);
        if (d == 0 || d != i10) {
            h();
        }
        this.P = null;
        invalidate();
    }

    public final void c(Canvas canvas, int i10, int i11, int i12, boolean z10) {
        float f7;
        float f10;
        float f11;
        if (z10) {
            f7 = 12.0f;
        } else {
            f7 = 16.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        Drawable drawable = this.f25142f;
        drawable.setBounds(i10 - L, i11 - L, i10 + L, L + i11);
        drawable.draw(canvas);
        Paint paint = this.d;
        paint.setColor(-1);
        float f12 = i10;
        float f13 = i11;
        if (z10) {
            f10 = 11.0f;
        } else {
            f10 = 15.0f;
        }
        canvas.drawCircle(f12, f13, org.telegram.messenger.i0.L(f10), paint);
        paint.setColor(i12);
        if (z10) {
            f11 = 9.0f;
        } else {
            f11 = 13.0f;
        }
        canvas.drawCircle(f12, f13, org.telegram.messenger.i0.L(f11), paint);
    }

    public final void e(int i10, int i11) {
        if (!this.f25144r) {
            this.f25144r = true;
            if (this.S == i11) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i10)), Byte.valueOf((byte) Color.green(i10)), Byte.valueOf((byte) Color.blue(i10))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.E;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.f25146w[i11].a(i10);
            this.f25144r = false;
        }
        setColorInner(i10);
    }

    public final void f(int i10, int i11, int i12, boolean z10) {
        boolean z11;
        if (i10 != this.J) {
            this.T = 0;
            this.S = 0;
            for (int i13 = 0; i13 < 4; i13++) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.f25146w[i13];
                if (i13 == this.S) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                colorPicker$RadioButton.d = z11;
                colorPicker$RadioButton.b(true);
            }
        }
        this.L = i11;
        this.J = i10;
        this.h = z10;
        this.K = i12;
        ImageView imageView = this.G;
        if (i12 == 1) {
            imageView.setTranslationX(0.0f);
        } else if (i12 == 2) {
            imageView.setTranslationX(org.telegram.messenger.i0.L(13.0f) + org.telegram.messenger.i0.L(30.0f));
        } else if (i12 == 3) {
            imageView.setTranslationX(org.telegram.messenger.m5.D(13.0f, 2, org.telegram.messenger.i0.L(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.m5.D(13.0f, 3, org.telegram.messenger.i0.L(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.g0 g0Var = this.F;
        org.telegram.ui.ActionBar.t0 t0Var = this.I;
        if (t0Var != null) {
            if (i10 == 1) {
                t0Var.setVisibility(0);
            } else {
                t0Var.setVisibility(8);
                g0Var.setTranslationX(0.0f);
            }
        }
        if (i11 <= 1) {
            imageView.setVisibility(8);
            g0Var.setVisibility(8);
        } else {
            if (i12 < i11) {
                imageView.setVisibility(0);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                imageView.setVisibility(8);
            }
            if (i12 > 1) {
                g0Var.setVisibility(0);
                g0Var.setScaleX(1.0f);
                g0Var.setScaleY(1.0f);
                g0Var.setAlpha(1.0f);
            } else {
                g0Var.setVisibility(8);
            }
        }
        this.f25148y.invalidate();
        g(getMeasuredWidth(), null, false);
    }

    public final void g(int i10, ArrayList arrayList, boolean z10) {
        float f7;
        float f10;
        boolean z11;
        int i11 = this.K;
        float f11 = 30.0f;
        int D = org.telegram.messenger.m5.D(13.0f, i11 - 1, org.telegram.messenger.i0.L(30.0f) * i11);
        FrameLayout frameLayout = this.f25147x;
        int left = frameLayout.getLeft() + D;
        if (this.J == 1) {
            f7 = 50.0f;
        } else {
            f7 = 0.0f;
        }
        int L = i10 - org.telegram.messenger.i0.L(f7);
        if (left > L) {
            f10 = left - L;
        } else {
            f10 = 0.0f;
        }
        Property property = View.TRANSLATION_X;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, property, -f10));
        } else {
            frameLayout.setTranslationX(-f10);
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = this.f25146w;
            if (i12 < colorPicker$RadioButtonArr.length) {
                if (colorPicker$RadioButtonArr[i12].getTag(2131296461) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i14 = this.K;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                float f12 = f11;
                Property property4 = View.ALPHA;
                if (i12 < i14) {
                    colorPicker$RadioButtonArr[i12].setVisibility(0);
                    if (arrayList != null) {
                        if (!z11) {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property4, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property3, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property2, 1.0f));
                        }
                        if (!z10 && (z10 || i12 == this.K - 1)) {
                            colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property, i13));
                        }
                    } else {
                        colorPicker$RadioButtonArr[i12].setVisibility(0);
                        if (this.D == null) {
                            colorPicker$RadioButtonArr[i12].setAlpha(1.0f);
                            colorPicker$RadioButtonArr[i12].setScaleX(1.0f);
                            colorPicker$RadioButtonArr[i12].setScaleY(1.0f);
                        }
                        colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                    }
                    colorPicker$RadioButtonArr[i12].setTag(2131296461, 1);
                } else {
                    if (arrayList != null) {
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property4, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property2, 0.0f));
                        }
                    } else {
                        colorPicker$RadioButtonArr[i12].setVisibility(4);
                        if (this.D == null) {
                            colorPicker$RadioButtonArr[i12].setAlpha(0.0f);
                            colorPicker$RadioButtonArr[i12].setScaleX(0.0f);
                            colorPicker$RadioButtonArr[i12].setScaleY(0.0f);
                        }
                    }
                    if (!z10) {
                        colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                    }
                    colorPicker$RadioButtonArr[i12].setTag(2131296461, null);
                }
                i13 = org.telegram.messenger.m5.C(13.0f, org.telegram.messenger.i0.L(f12), i13);
                i12++;
                f11 = f12;
            } else {
                return;
            }
        }
    }

    public int getColor() {
        float[] fArr = this.N;
        float f7 = fArr[0];
        float[] fArr2 = this.O;
        fArr2[0] = f7;
        fArr2[1] = fArr[1];
        fArr2[2] = getBrightness();
        return (Color.HSVToColor(fArr2) & 16777215) | (-16777216);
    }

    public final void h() {
        float f7;
        float f10;
        org.telegram.ui.ActionBar.g0 g0Var = this.F;
        if (g0Var == null) {
            return;
        }
        if (g0Var.getTag() != null) {
            f7 = 0.0f;
        } else {
            f7 = this.W;
        }
        if (g0Var.getTag() != null) {
            f10 = 1.0f;
        } else {
            f10 = this.f25135a0;
        }
        float[] fArr = this.N;
        float f11 = fArr[2];
        if (f7 == 0.0f && f10 == 1.0f) {
            this.f25137b0 = 0.0f;
            this.f25139c0 = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f11;
        float B = org.telegram.messenger.i0.B(HSVToColor);
        float max = Math.max(0.0f, Math.min(f7 / B, 1.0f));
        this.f25137b0 = max;
        this.f25139c0 = Math.max(max, Math.min(f10 / B, 1.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f25148y.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        int i10;
        int L = org.telegram.messenger.i0.L(45.0f);
        float f10 = L;
        canvas.drawBitmap(this.f25145s, 0.0f, f10, (Paint) null);
        int height = this.f25145s.getHeight() + L;
        Paint paint = this.e;
        canvas.drawRect(0.0f, f10, getMeasuredWidth(), L + 1, paint);
        canvas.drawRect(0.0f, height - 1, getMeasuredWidth(), height, paint);
        float[] fArr = this.N;
        float f11 = fArr[0];
        float[] fArr2 = this.O;
        fArr2[0] = f11;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int z10 = (int) c3.i0.z(1.0f, fArr[1], this.f25145s.getHeight(), f10);
        if (!this.Q) {
            int L2 = org.telegram.messenger.i0.L(16.0f);
            float interpolation = gr.f26496g.getInterpolation(this.U);
            if (measuredWidth < L2) {
                measuredWidth = (int) (((L2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - L2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - L2)) * interpolation));
            }
            if (z10 < L + L2) {
                z10 = (int) ((interpolation * (i10 - z10)) + z10);
            } else if (z10 > (this.f25145s.getHeight() + L) - L2) {
                z10 = (int) (z10 - (interpolation * (z10 - ((this.f25145s.getHeight() + L) - L2))));
            }
        }
        c(canvas, measuredWidth, z10, Color.HSVToColor(fArr2), false);
        RectF rectF = this.f25143n;
        rectF.set(org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(26.0f) + height, getMeasuredWidth() - org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(34.0f) + height);
        LinearGradient linearGradient = this.P;
        Paint paint2 = this.f25138c;
        if (linearGradient == null) {
            fArr2[2] = this.f25137b0;
            int HSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.f25139c0;
            int HSVToColor2 = Color.HSVToColor(fArr2);
            float f12 = rectF.left;
            float f13 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f12, f13, rectF.right, f13, new int[]{HSVToColor2, HSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.P = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint2);
        if (this.f25137b0 == this.f25139c0) {
            f7 = 0.5f;
        } else {
            float brightness = getBrightness();
            float f14 = this.f25137b0;
            f7 = (brightness - f14) / (this.f25139c0 - f14);
        }
        c(canvas, (int) ((rectF.width() * (1.0f - f7)) + rectF.left), (int) rectF.centerY(), getColor(), true);
        if (!this.Q && this.U < 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.V;
            this.V = elapsedRealtime;
            float f15 = (((float) j10) / 180.0f) + this.U;
            this.U = f15;
            if (f15 > 1.0f) {
                this.U = 1.0f;
            }
            invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g(getMeasuredWidth(), null, false);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (this.M != i10) {
            this.M = i10;
            int L = org.telegram.messenger.i0.L(180.0f);
            Bitmap createBitmap = Bitmap.createBitmap(i10, L, Bitmap.Config.ARGB_8888);
            float f7 = i10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f10 = L;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, L / 3, 0.0f, f10, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.f25136b;
            paint.setShader(composeShader);
            new Canvas(createBitmap).drawRect(0.0f, 0.0f, f7, f10, paint);
            this.f25145s = createBitmap;
            this.P = null;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cq.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setHasChanges(boolean z10) {
        Integer num;
        float f7;
        TextView textView = this.H;
        if (!z10 || textView.getTag() == null) {
            if ((!z10 && textView.getTag() == null) || this.F.getTag() != null) {
                return;
            }
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            textView.setTag(num);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            if (z10) {
                textView.setVisibility(0);
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, View.ALPHA, f7));
            animatorSet.addListener(new eg.m(22, this, z10));
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(180L);
            animatorSet.start();
        }
    }

    public void setMaxBrightness(float f7) {
        this.f25135a0 = f7;
        h();
    }

    public void setMinBrightness(float f7) {
        this.W = f7;
        h();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.f25140d0 = p6Var;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.t0 t0Var = this.I;
        if (t0Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.f25140d0);
                if (w02 != this.f25141e0) {
                    this.f25141e0 = w02;
                    t0Var.setIconColor(w02);
                }
                t0Var.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, this.f25140d0), false);
                t0Var.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.f25140d0), true);
                t0Var.H(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, this.f25140d0));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.E;
        if (editTextBoldCursorArr != null) {
            for (int i10 = 0; i10 < editTextBoldCursorArr.length; i10++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.f25140d0));
                    editTextBoldCursorArr[i10].setHeaderHintColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.L6, this.f25140d0));
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
