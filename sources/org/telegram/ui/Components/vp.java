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
public class vp extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final int f39693f0 = 0;
    public AnimatorSet D;
    public final EditTextBoldCursor[] E;
    public final org.telegram.ui.ActionBar.f0 F;
    public final ImageView G;
    public final TextView H;
    public final org.telegram.ui.ActionBar.r0 I;
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
    public final up f39694a;
    public float f39695a0;
    public final Paint f39696b;
    public float f39697b0;
    public final Paint f39698c;
    public float f39699c0;
    public final Paint d;
    public org.telegram.ui.ActionBar.h6 f39700d0;
    public final Paint f39701e;
    public int f39702e0;
    public final Drawable f39703f;
    public boolean h;
    public final RectF f39704n;
    public boolean f39705r;
    public Bitmap f39706s;
    public final ColorPicker$RadioButton[] f39707w;
    public final FrameLayout f39708x;
    public final bi.nc f39709y;

    public vp(Context context, boolean z9, up upVar) {
        super(context);
        boolean z10;
        this.f39704n = new RectF();
        this.f39707w = new ColorPicker$RadioButton[4];
        this.K = 1;
        this.L = 1;
        this.N = new float[]{0.0f, 0.0f, 1.0f};
        this.O = new float[3];
        this.U = 1.0f;
        this.W = 0.0f;
        this.f39695a0 = 1.0f;
        this.f39697b0 = 0.0f;
        this.f39699c0 = 1.0f;
        this.f39694a = upVar;
        this.E = new EditTextBoldCursor[2];
        setWillNotDraw(false);
        this.f39703f = context.getResources().getDrawable(2131231599).mutate();
        this.d = new Paint(1);
        this.f39696b = new Paint(5);
        this.f39698c = new Paint(5);
        Paint paint = new Paint();
        this.f39701e = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        bi.nc ncVar = new bi.nc(this, context);
        this.f39709y = ncVar;
        ncVar.setOrientation(0);
        addView(ncVar, c8.ha.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        ncVar.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39708x = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, c8.ha.d(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        for (int i7 = 0; i7 < 4; i7++) {
            this.f39707w[i7] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.f39707w[i7];
            if (this.S == i7) {
                z10 = true;
            } else {
                z10 = false;
            }
            colorPicker$RadioButton.d = z10;
            colorPicker$RadioButton.b(false);
            this.f39708x.addView(this.f39707w[i7], c8.ha.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f39707w[i7].setOnClickListener(new View.OnClickListener(this) {
                public final vp f37370b;

                {
                    this.f37370b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i10;
                    boolean z11;
                    boolean z12;
                    int i11 = r2;
                    vp vpVar = this.f37370b;
                    switch (i11) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            up upVar2 = vpVar.f39694a;
                            org.telegram.ui.ActionBar.f0 f0Var = vpVar.F;
                            ImageView imageView = vpVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = vpVar.f39707w;
                            if (vpVar.D == null) {
                                int i12 = vpVar.K;
                                if (i12 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.f31313e == 0) {
                                        i10 = 0;
                                        colorPicker$RadioButton2.a(vp.d(colorPicker$RadioButtonArr[0].f31313e));
                                    } else {
                                        i10 = 0;
                                    }
                                    if (vpVar.h) {
                                        upVar2.c(colorPicker$RadioButtonArr[i10].f31313e, i10, true);
                                    }
                                    upVar2.c(colorPicker$RadioButtonArr[1].f31313e, 1, true);
                                    vpVar.K = 2;
                                } else if (i12 == 2) {
                                    vpVar.K = 3;
                                    if (colorPicker$RadioButtonArr[2].f31313e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].f31313e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    upVar2.c(colorPicker$RadioButtonArr[2].f31313e, 2, true);
                                } else if (i12 == 3) {
                                    vpVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.f31313e == 0) {
                                        colorPicker$RadioButton3.a(vp.d(colorPicker$RadioButtonArr[2].f31313e));
                                    }
                                    upVar2.c(colorPicker$RadioButtonArr[3].f31313e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (vpVar.K < vpVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 0.0f));
                                }
                                if (vpVar.K > 1) {
                                    if (f0Var.getVisibility() != 0) {
                                        f0Var.setScaleX(0.0f);
                                        f0Var.setScaleY(0.0f);
                                    }
                                    f0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[vpVar.K - 1].callOnClick();
                                vpVar.D = new AnimatorSet();
                                vpVar.g(vpVar.getMeasuredWidth(), arrayList, false);
                                vpVar.D.playTogether(arrayList);
                                vpVar.D.setDuration(180L);
                                vpVar.D.setInterpolator(wq.f40047g);
                                vpVar.D.addListener(new tp(vpVar, 1));
                                vpVar.D.start();
                                return;
                            }
                            return;
                        case 1:
                            up upVar3 = vpVar.f39694a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.f0 f0Var2 = vpVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = vpVar.f39707w;
                            ImageView imageView2 = vpVar.G;
                            if (vpVar.D == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i13 = vpVar.K;
                                if (i13 == 2) {
                                    vpVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var2, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, 0.0f));
                                } else if (i13 == 3) {
                                    vpVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                                } else if (i13 == 4) {
                                    vpVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, org.telegram.messenger.k5.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (vpVar.K < vpVar.L) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 0.0f));
                                }
                                int i14 = vpVar.S;
                                if (i14 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i14];
                                    for (int i15 = i14 + 1; i15 < colorPicker$RadioButtonArr2.length; i15++) {
                                        colorPicker$RadioButtonArr2[i15 - 1] = colorPicker$RadioButtonArr2[i15];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i16 = vpVar.T;
                                if (i16 >= 0 && i16 < vpVar.S) {
                                    colorPicker$RadioButtonArr2[i16].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[vpVar.K - 1].callOnClick();
                                }
                                for (int i17 = 0; i17 < colorPicker$RadioButtonArr2.length; i17++) {
                                    if (i17 < vpVar.K) {
                                        int i18 = colorPicker$RadioButtonArr2[i17].f31313e;
                                        if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        upVar3.c(i18, i17, z12);
                                    } else {
                                        if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        upVar3.c(0, i17, z11);
                                    }
                                }
                                vpVar.D = new AnimatorSet();
                                vpVar.g(vpVar.getMeasuredWidth(), arrayList2, true);
                                vpVar.D.playTogether(arrayList2);
                                vpVar.D.setDuration(180L);
                                vpVar.D.setInterpolator(wq.f40047g);
                                vpVar.D.addListener(new tp(vpVar, 0));
                                vpVar.D.start();
                                return;
                            }
                            return;
                        case 2:
                            vp.a(vpVar, view);
                            return;
                        default:
                            vpVar.I.U(null, null);
                            return;
                    }
                }
            });
        }
        int i10 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.E;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i10 % 2 == 0) {
                editTextBoldCursorArr[i10] = new rp(this, context, i10, 0);
                this.E[i10].setBackgroundDrawable(null);
                this.E[i10].setText("#");
                this.E[i10].setEnabled(false);
                this.E[i10].setFocusable(false);
                this.E[i10].setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(16.0f));
                this.f39709y.addView(this.E[i10], c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i10] = new rp(this, context, i10, 1);
                this.E[i10].setBackgroundDrawable(null);
                this.E[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.E[i10].setHint("8BC6ED");
                this.E[i10].setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(16.0f));
                this.f39709y.addView(this.E[i10], c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.E[i10].addTextChangedListener(new sp(this, i10));
                this.E[i10].setOnEditorActionListener(new k2(1));
            }
            this.E[i10].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.t6.D(this.E[i10], org.telegram.ui.ActionBar.m6.H6, this.f39700d0);
            EditTextBoldCursor editTextBoldCursor = this.E[i10];
            int i11 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i11, this.f39700d0);
            this.E[i10].setCursorColor(org.telegram.ui.ActionBar.m6.w0(i11, this.f39700d0));
            this.E[i10].setCursorSize(org.telegram.messenger.g0.L(18.0f));
            this.E[i10].setCursorWidth(1.5f);
            this.E[i10].setSingleLine(true);
            this.E[i10].setGravity(19);
            this.E[i10].setHeaderHintColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.L6, this.f39700d0));
            this.E[i10].setTransformHintToHeader(true);
            this.E[i10].setInputType(524416);
            this.E[i10].setImeOptions(268435462);
            if (i10 == 1) {
                this.E[i10].requestFocus();
            } else if (i10 == 2 || i10 == 3) {
                this.E[i10].setVisibility(8);
            }
            i10++;
        }
        ImageView imageView = new ImageView(getContext());
        this.G = imageView;
        int i12 = org.telegram.ui.ActionBar.m6.I5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.f39700d0), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        org.telegram.ui.ActionBar.h6 h6Var = this.f39700d0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, h6Var);
        imageView.setImageResource(2131232042);
        int i13 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var2 = this.f39700d0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView, i13, h6Var2, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final vp f37370b;

            {
                this.f37370b = this;
            }

            @Override
            public final void onClick(View view) {
                int i102;
                boolean z11;
                boolean z12;
                int i112 = r2;
                vp vpVar = this.f37370b;
                switch (i112) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        up upVar2 = vpVar.f39694a;
                        org.telegram.ui.ActionBar.f0 f0Var = vpVar.F;
                        ImageView imageView2 = vpVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = vpVar.f39707w;
                        if (vpVar.D == null) {
                            int i122 = vpVar.K;
                            if (i122 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.f31313e == 0) {
                                    i102 = 0;
                                    colorPicker$RadioButton2.a(vp.d(colorPicker$RadioButtonArr[0].f31313e));
                                } else {
                                    i102 = 0;
                                }
                                if (vpVar.h) {
                                    upVar2.c(colorPicker$RadioButtonArr[i102].f31313e, i102, true);
                                }
                                upVar2.c(colorPicker$RadioButtonArr[1].f31313e, 1, true);
                                vpVar.K = 2;
                            } else if (i122 == 2) {
                                vpVar.K = 3;
                                if (colorPicker$RadioButtonArr[2].f31313e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].f31313e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                upVar2.c(colorPicker$RadioButtonArr[2].f31313e, 2, true);
                            } else if (i122 == 3) {
                                vpVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.f31313e == 0) {
                                    colorPicker$RadioButton3.a(vp.d(colorPicker$RadioButtonArr[2].f31313e));
                                }
                                upVar2.c(colorPicker$RadioButtonArr[3].f31313e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (vpVar.K < vpVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (vpVar.K > 1) {
                                if (f0Var.getVisibility() != 0) {
                                    f0Var.setScaleX(0.0f);
                                    f0Var.setScaleY(0.0f);
                                }
                                f0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(f0Var, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(f0Var, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(f0Var, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[vpVar.K - 1].callOnClick();
                            vpVar.D = new AnimatorSet();
                            vpVar.g(vpVar.getMeasuredWidth(), arrayList, false);
                            vpVar.D.playTogether(arrayList);
                            vpVar.D.setDuration(180L);
                            vpVar.D.setInterpolator(wq.f40047g);
                            vpVar.D.addListener(new tp(vpVar, 1));
                            vpVar.D.start();
                            return;
                        }
                        return;
                    case 1:
                        up upVar3 = vpVar.f39694a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.f0 f0Var2 = vpVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = vpVar.f39707w;
                        ImageView imageView22 = vpVar.G;
                        if (vpVar.D == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i132 = vpVar.K;
                            if (i132 == 2) {
                                vpVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var2, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var2, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var2, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i132 == 3) {
                                vpVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                            } else if (i132 == 4) {
                                vpVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.k5.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (vpVar.K < vpVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i14 = vpVar.S;
                            if (i14 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i14];
                                for (int i15 = i14 + 1; i15 < colorPicker$RadioButtonArr2.length; i15++) {
                                    colorPicker$RadioButtonArr2[i15 - 1] = colorPicker$RadioButtonArr2[i15];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i16 = vpVar.T;
                            if (i16 >= 0 && i16 < vpVar.S) {
                                colorPicker$RadioButtonArr2[i16].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[vpVar.K - 1].callOnClick();
                            }
                            for (int i17 = 0; i17 < colorPicker$RadioButtonArr2.length; i17++) {
                                if (i17 < vpVar.K) {
                                    int i18 = colorPicker$RadioButtonArr2[i17].f31313e;
                                    if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    upVar3.c(i18, i17, z12);
                                } else {
                                    if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    upVar3.c(0, i17, z11);
                                }
                            }
                            vpVar.D = new AnimatorSet();
                            vpVar.g(vpVar.getMeasuredWidth(), arrayList2, true);
                            vpVar.D.playTogether(arrayList2);
                            vpVar.D.setDuration(180L);
                            vpVar.D.setInterpolator(wq.f40047g);
                            vpVar.D.addListener(new tp(vpVar, 0));
                            vpVar.D.start();
                            return;
                        }
                        return;
                    case 2:
                        vp.a(vpVar, view);
                        return;
                    default:
                        vpVar.I.U(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131754486, null));
        addView(imageView, c8.ha.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(1, getContext(), this);
        this.F = f0Var;
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.f39700d0), 1, -1);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i12);
        org.telegram.ui.ActionBar.h6 h6Var3 = this.f39700d0;
        f0Var.setBackground(h03);
        org.telegram.ui.ActionBar.t6.j(f0Var, h03, null, M2, h6Var3);
        f0Var.setImageResource(2131232096);
        org.telegram.ui.ActionBar.t6.s(f0Var, i13, this.f39700d0, mode);
        f0Var.setAlpha(0.0f);
        f0Var.setScaleX(0.0f);
        f0Var.setScaleY(0.0f);
        f0Var.setScaleType(scaleType);
        f0Var.setVisibility(4);
        f0Var.setOnClickListener(new View.OnClickListener(this) {
            public final vp f37370b;

            {
                this.f37370b = this;
            }

            @Override
            public final void onClick(View view) {
                int i102;
                boolean z11;
                boolean z12;
                int i112 = r2;
                vp vpVar = this.f37370b;
                switch (i112) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        up upVar2 = vpVar.f39694a;
                        org.telegram.ui.ActionBar.f0 f0Var2 = vpVar.F;
                        ImageView imageView2 = vpVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = vpVar.f39707w;
                        if (vpVar.D == null) {
                            int i122 = vpVar.K;
                            if (i122 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.f31313e == 0) {
                                    i102 = 0;
                                    colorPicker$RadioButton2.a(vp.d(colorPicker$RadioButtonArr[0].f31313e));
                                } else {
                                    i102 = 0;
                                }
                                if (vpVar.h) {
                                    upVar2.c(colorPicker$RadioButtonArr[i102].f31313e, i102, true);
                                }
                                upVar2.c(colorPicker$RadioButtonArr[1].f31313e, 1, true);
                                vpVar.K = 2;
                            } else if (i122 == 2) {
                                vpVar.K = 3;
                                if (colorPicker$RadioButtonArr[2].f31313e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].f31313e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                upVar2.c(colorPicker$RadioButtonArr[2].f31313e, 2, true);
                            } else if (i122 == 3) {
                                vpVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.f31313e == 0) {
                                    colorPicker$RadioButton3.a(vp.d(colorPicker$RadioButtonArr[2].f31313e));
                                }
                                upVar2.c(colorPicker$RadioButtonArr[3].f31313e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (vpVar.K < vpVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (vpVar.K > 1) {
                                if (f0Var2.getVisibility() != 0) {
                                    f0Var2.setScaleX(0.0f);
                                    f0Var2.setScaleY(0.0f);
                                }
                                f0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(f0Var2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(f0Var2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(f0Var2, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[vpVar.K - 1].callOnClick();
                            vpVar.D = new AnimatorSet();
                            vpVar.g(vpVar.getMeasuredWidth(), arrayList, false);
                            vpVar.D.playTogether(arrayList);
                            vpVar.D.setDuration(180L);
                            vpVar.D.setInterpolator(wq.f40047g);
                            vpVar.D.addListener(new tp(vpVar, 1));
                            vpVar.D.start();
                            return;
                        }
                        return;
                    case 1:
                        up upVar3 = vpVar.f39694a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.f0 f0Var22 = vpVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = vpVar.f39707w;
                        ImageView imageView22 = vpVar.G;
                        if (vpVar.D == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i132 = vpVar.K;
                            if (i132 == 2) {
                                vpVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var22, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i132 == 3) {
                                vpVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                            } else if (i132 == 4) {
                                vpVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.k5.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (vpVar.K < vpVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i14 = vpVar.S;
                            if (i14 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i14];
                                for (int i15 = i14 + 1; i15 < colorPicker$RadioButtonArr2.length; i15++) {
                                    colorPicker$RadioButtonArr2[i15 - 1] = colorPicker$RadioButtonArr2[i15];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i16 = vpVar.T;
                            if (i16 >= 0 && i16 < vpVar.S) {
                                colorPicker$RadioButtonArr2[i16].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[vpVar.K - 1].callOnClick();
                            }
                            for (int i17 = 0; i17 < colorPicker$RadioButtonArr2.length; i17++) {
                                if (i17 < vpVar.K) {
                                    int i18 = colorPicker$RadioButtonArr2[i17].f31313e;
                                    if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    upVar3.c(i18, i17, z12);
                                } else {
                                    if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    upVar3.c(0, i17, z11);
                                }
                            }
                            vpVar.D = new AnimatorSet();
                            vpVar.g(vpVar.getMeasuredWidth(), arrayList2, true);
                            vpVar.D.playTogether(arrayList2);
                            vpVar.D.setDuration(180L);
                            vpVar.D.setInterpolator(wq.f40047g);
                            vpVar.D.addListener(new tp(vpVar, 0));
                            vpVar.D.start();
                            return;
                        }
                        return;
                    case 2:
                        vp.a(vpVar, view);
                        return;
                    default:
                        vpVar.I.U(null, null);
                        return;
                }
            }
        });
        f0Var.setContentDescription(org.telegram.messenger.id.M0(2131752099, null));
        addView(f0Var, c8.ha.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.H = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.t6.U(textView, i13, this.f39700d0);
        addView(textView, c8.ha.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new bi.l1(10));
        if (z9) {
            org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.m6.w0(i13, this.f39700d0));
            this.I = r0Var;
            r0Var.setLongClickEnabled(false);
            r0Var.setIcon(2131231244);
            r0Var.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
            r0Var.e(1, 2131232116, org.telegram.messenger.id.M0(2131747797, null));
            r0Var.e(2, 2131232363, org.telegram.messenger.id.M0(2131745426, null));
            r0Var.e(3, 2131232108, org.telegram.messenger.id.M0(2131751486, null));
            r0Var.setMenuYOffset(-org.telegram.messenger.g0.L(80.0f));
            r0Var.setSubMenuOpenSide(2);
            r0Var.setDelegate(new t(this, 26));
            r0Var.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
            r0Var.setTranslationX(org.telegram.messenger.g0.L(6.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.f39700d0), 1, -1);
            org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i12);
            org.telegram.ui.ActionBar.h6 h6Var4 = this.f39700d0;
            r0Var.setBackground(h04);
            org.telegram.ui.ActionBar.t6.j(r0Var, h04, null, M3, h6Var4);
            addView(r0Var, c8.ha.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            r0Var.setOnClickListener(new View.OnClickListener(this) {
                public final vp f37370b;

                {
                    this.f37370b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i102;
                    boolean z11;
                    boolean z12;
                    int i112 = r2;
                    vp vpVar = this.f37370b;
                    switch (i112) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            up upVar2 = vpVar.f39694a;
                            org.telegram.ui.ActionBar.f0 f0Var2 = vpVar.F;
                            ImageView imageView2 = vpVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = vpVar.f39707w;
                            if (vpVar.D == null) {
                                int i122 = vpVar.K;
                                if (i122 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.f31313e == 0) {
                                        i102 = 0;
                                        colorPicker$RadioButton2.a(vp.d(colorPicker$RadioButtonArr[0].f31313e));
                                    } else {
                                        i102 = 0;
                                    }
                                    if (vpVar.h) {
                                        upVar2.c(colorPicker$RadioButtonArr[i102].f31313e, i102, true);
                                    }
                                    upVar2.c(colorPicker$RadioButtonArr[1].f31313e, 1, true);
                                    vpVar.K = 2;
                                } else if (i122 == 2) {
                                    vpVar.K = 3;
                                    if (colorPicker$RadioButtonArr[2].f31313e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].f31313e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    upVar2.c(colorPicker$RadioButtonArr[2].f31313e, 2, true);
                                } else if (i122 == 3) {
                                    vpVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.f31313e == 0) {
                                        colorPicker$RadioButton3.a(vp.d(colorPicker$RadioButtonArr[2].f31313e));
                                    }
                                    upVar2.c(colorPicker$RadioButtonArr[3].f31313e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (vpVar.K < vpVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                                }
                                if (vpVar.K > 1) {
                                    if (f0Var2.getVisibility() != 0) {
                                        f0Var2.setScaleX(0.0f);
                                        f0Var2.setScaleY(0.0f);
                                    }
                                    f0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var2, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[vpVar.K - 1].callOnClick();
                                vpVar.D = new AnimatorSet();
                                vpVar.g(vpVar.getMeasuredWidth(), arrayList, false);
                                vpVar.D.playTogether(arrayList);
                                vpVar.D.setDuration(180L);
                                vpVar.D.setInterpolator(wq.f40047g);
                                vpVar.D.addListener(new tp(vpVar, 1));
                                vpVar.D.start();
                                return;
                            }
                            return;
                        case 1:
                            up upVar3 = vpVar.f39694a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.f0 f0Var22 = vpVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = vpVar.f39707w;
                            ImageView imageView22 = vpVar.G;
                            if (vpVar.D == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i132 = vpVar.K;
                                if (i132 == 2) {
                                    vpVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var22, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                                } else if (i132 == 3) {
                                    vpVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                                } else if (i132 == 4) {
                                    vpVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.k5.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (vpVar.K < vpVar.L) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                                }
                                int i14 = vpVar.S;
                                if (i14 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i14];
                                    for (int i15 = i14 + 1; i15 < colorPicker$RadioButtonArr2.length; i15++) {
                                        colorPicker$RadioButtonArr2[i15 - 1] = colorPicker$RadioButtonArr2[i15];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i16 = vpVar.T;
                                if (i16 >= 0 && i16 < vpVar.S) {
                                    colorPicker$RadioButtonArr2[i16].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[vpVar.K - 1].callOnClick();
                                }
                                for (int i17 = 0; i17 < colorPicker$RadioButtonArr2.length; i17++) {
                                    if (i17 < vpVar.K) {
                                        int i18 = colorPicker$RadioButtonArr2[i17].f31313e;
                                        if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        upVar3.c(i18, i17, z12);
                                    } else {
                                        if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        upVar3.c(0, i17, z11);
                                    }
                                }
                                vpVar.D = new AnimatorSet();
                                vpVar.g(vpVar.getMeasuredWidth(), arrayList2, true);
                                vpVar.D.playTogether(arrayList2);
                                vpVar.D.setDuration(180L);
                                vpVar.D.setInterpolator(wq.f40047g);
                                vpVar.D.addListener(new tp(vpVar, 0));
                                vpVar.D.start();
                                return;
                            }
                            return;
                        case 2:
                            vp.a(vpVar, view);
                            return;
                        default:
                            vpVar.I.U(null, null);
                            return;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(vp vpVar, View view) {
        boolean z9;
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i7 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = vpVar.f39707w;
            if (i7 < colorPicker$RadioButtonArr.length) {
                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i7];
                if (colorPicker$RadioButton2 == colorPicker$RadioButton) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                colorPicker$RadioButton2.d = z9;
                colorPicker$RadioButton2.b(true);
                if (z9) {
                    vpVar.T = vpVar.S;
                    vpVar.S = i7;
                }
                i7++;
            } else {
                int i10 = colorPicker$RadioButton.f31313e;
                vpVar.setColorInner(i10);
                vpVar.E[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i10)), Byte.valueOf((byte) Color.green(i10)), Byte.valueOf((byte) Color.blue(i10))).toUpperCase());
                return;
            }
        }
    }

    public static int d(int i7) {
        float[] fArr = new float[3];
        Color.colorToHSV(i7, fArr);
        float f10 = fArr[1];
        if (f10 > 0.5f) {
            fArr[1] = f10 - 0.15f;
        } else {
            fArr[1] = f10 + 0.15f;
        }
        float f11 = fArr[0];
        if (f11 > 180.0f) {
            fArr[0] = f11 - 20.0f;
        } else {
            fArr[0] = f11 + 20.0f;
        }
        return Color.HSVToColor(255, fArr);
    }

    private float getBrightness() {
        return Math.max(this.f39697b0, Math.min(this.N[2], this.f39699c0));
    }

    public void setColorInner(int i7) {
        Color.colorToHSV(i7, this.N);
        int d = this.f39694a.d(this.S);
        if (d == 0 || d != i7) {
            h();
        }
        this.P = null;
        invalidate();
    }

    public final void c(Canvas canvas, int i7, int i10, int i11, boolean z9) {
        float f10;
        float f11;
        float f12;
        if (z9) {
            f10 = 12.0f;
        } else {
            f10 = 16.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        Drawable drawable = this.f39703f;
        drawable.setBounds(i7 - L, i10 - L, i7 + L, L + i10);
        drawable.draw(canvas);
        Paint paint = this.d;
        paint.setColor(-1);
        float f13 = i7;
        float f14 = i10;
        if (z9) {
            f11 = 11.0f;
        } else {
            f11 = 15.0f;
        }
        canvas.drawCircle(f13, f14, org.telegram.messenger.g0.L(f11), paint);
        paint.setColor(i11);
        if (z9) {
            f12 = 9.0f;
        } else {
            f12 = 13.0f;
        }
        canvas.drawCircle(f13, f14, org.telegram.messenger.g0.L(f12), paint);
    }

    public final void e(int i7, int i10) {
        if (!this.f39705r) {
            this.f39705r = true;
            if (this.S == i10) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i7)), Byte.valueOf((byte) Color.green(i7)), Byte.valueOf((byte) Color.blue(i7))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.E;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.f39707w[i10].a(i7);
            this.f39705r = false;
        }
        setColorInner(i7);
    }

    public final void f(int i7, int i10, int i11, boolean z9) {
        boolean z10;
        if (i7 != this.J) {
            this.T = 0;
            this.S = 0;
            for (int i12 = 0; i12 < 4; i12++) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.f39707w[i12];
                if (i12 == this.S) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                colorPicker$RadioButton.d = z10;
                colorPicker$RadioButton.b(true);
            }
        }
        this.L = i10;
        this.J = i7;
        this.h = z9;
        this.K = i11;
        ImageView imageView = this.G;
        if (i11 == 1) {
            imageView.setTranslationX(0.0f);
        } else if (i11 == 2) {
            imageView.setTranslationX(org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f));
        } else if (i11 == 3) {
            imageView.setTranslationX(org.telegram.messenger.k5.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.k5.D(13.0f, 3, org.telegram.messenger.g0.L(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.f0 f0Var = this.F;
        org.telegram.ui.ActionBar.r0 r0Var = this.I;
        if (r0Var != null) {
            if (i7 == 1) {
                r0Var.setVisibility(0);
            } else {
                r0Var.setVisibility(8);
                f0Var.setTranslationX(0.0f);
            }
        }
        if (i10 <= 1) {
            imageView.setVisibility(8);
            f0Var.setVisibility(8);
        } else {
            if (i11 < i10) {
                imageView.setVisibility(0);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                imageView.setVisibility(8);
            }
            if (i11 > 1) {
                f0Var.setVisibility(0);
                f0Var.setScaleX(1.0f);
                f0Var.setScaleY(1.0f);
                f0Var.setAlpha(1.0f);
            } else {
                f0Var.setVisibility(8);
            }
        }
        this.f39709y.invalidate();
        g(getMeasuredWidth(), null, false);
    }

    public final void g(int i7, ArrayList arrayList, boolean z9) {
        float f10;
        float f11;
        boolean z10;
        int i10 = this.K;
        float f12 = 30.0f;
        int D = org.telegram.messenger.k5.D(13.0f, i10 - 1, org.telegram.messenger.g0.L(30.0f) * i10);
        FrameLayout frameLayout = this.f39708x;
        int left = frameLayout.getLeft() + D;
        if (this.J == 1) {
            f10 = 50.0f;
        } else {
            f10 = 0.0f;
        }
        int L = i7 - org.telegram.messenger.g0.L(f10);
        if (left > L) {
            f11 = left - L;
        } else {
            f11 = 0.0f;
        }
        Property property = View.TRANSLATION_X;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, property, -f11));
        } else {
            frameLayout.setTranslationX(-f11);
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = this.f39707w;
            if (i11 < colorPicker$RadioButtonArr.length) {
                if (colorPicker$RadioButtonArr[i11].getTag(2131296461) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i13 = this.K;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                float f13 = f12;
                Property property4 = View.ALPHA;
                if (i11 < i13) {
                    colorPicker$RadioButtonArr[i11].setVisibility(0);
                    if (arrayList != null) {
                        if (!z10) {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property4, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property3, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property2, 1.0f));
                        }
                        if (!z9 && (z9 || i11 == this.K - 1)) {
                            colorPicker$RadioButtonArr[i11].setTranslationX(i12);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property, i12));
                        }
                    } else {
                        colorPicker$RadioButtonArr[i11].setVisibility(0);
                        if (this.D == null) {
                            colorPicker$RadioButtonArr[i11].setAlpha(1.0f);
                            colorPicker$RadioButtonArr[i11].setScaleX(1.0f);
                            colorPicker$RadioButtonArr[i11].setScaleY(1.0f);
                        }
                        colorPicker$RadioButtonArr[i11].setTranslationX(i12);
                    }
                    colorPicker$RadioButtonArr[i11].setTag(2131296461, 1);
                } else {
                    if (arrayList != null) {
                        if (z10) {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property4, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property2, 0.0f));
                        }
                    } else {
                        colorPicker$RadioButtonArr[i11].setVisibility(4);
                        if (this.D == null) {
                            colorPicker$RadioButtonArr[i11].setAlpha(0.0f);
                            colorPicker$RadioButtonArr[i11].setScaleX(0.0f);
                            colorPicker$RadioButtonArr[i11].setScaleY(0.0f);
                        }
                    }
                    if (!z9) {
                        colorPicker$RadioButtonArr[i11].setTranslationX(i12);
                    }
                    colorPicker$RadioButtonArr[i11].setTag(2131296461, null);
                }
                i12 = org.telegram.messenger.k5.C(13.0f, org.telegram.messenger.g0.L(f13), i12);
                i11++;
                f12 = f13;
            } else {
                return;
            }
        }
    }

    public int getColor() {
        float[] fArr = this.N;
        float f10 = fArr[0];
        float[] fArr2 = this.O;
        fArr2[0] = f10;
        fArr2[1] = fArr[1];
        fArr2[2] = getBrightness();
        return (Color.HSVToColor(fArr2) & 16777215) | (-16777216);
    }

    public final void h() {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.f0 f0Var = this.F;
        if (f0Var == null) {
            return;
        }
        if (f0Var.getTag() != null) {
            f10 = 0.0f;
        } else {
            f10 = this.W;
        }
        if (f0Var.getTag() != null) {
            f11 = 1.0f;
        } else {
            f11 = this.f39695a0;
        }
        float[] fArr = this.N;
        float f12 = fArr[2];
        if (f10 == 0.0f && f11 == 1.0f) {
            this.f39697b0 = 0.0f;
            this.f39699c0 = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f12;
        float B = org.telegram.messenger.g0.B(HSVToColor);
        float max = Math.max(0.0f, Math.min(f10 / B, 1.0f));
        this.f39697b0 = max;
        this.f39699c0 = Math.max(max, Math.min(f11 / B, 1.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f39709y.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i7;
        int L = org.telegram.messenger.g0.L(45.0f);
        float f11 = L;
        canvas.drawBitmap(this.f39706s, 0.0f, f11, (Paint) null);
        int height = this.f39706s.getHeight() + L;
        Paint paint = this.f39701e;
        canvas.drawRect(0.0f, f11, getMeasuredWidth(), L + 1, paint);
        canvas.drawRect(0.0f, height - 1, getMeasuredWidth(), height, paint);
        float[] fArr = this.N;
        float f12 = fArr[0];
        float[] fArr2 = this.O;
        fArr2[0] = f12;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int z9 = (int) com.google.android.recaptcha.internal.a.z(1.0f, fArr[1], this.f39706s.getHeight(), f11);
        if (!this.Q) {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            float interpolation = wq.f40047g.getInterpolation(this.U);
            if (measuredWidth < L2) {
                measuredWidth = (int) (((L2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - L2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - L2)) * interpolation));
            }
            if (z9 < L + L2) {
                z9 = (int) ((interpolation * (i7 - z9)) + z9);
            } else if (z9 > (this.f39706s.getHeight() + L) - L2) {
                z9 = (int) (z9 - (interpolation * (z9 - ((this.f39706s.getHeight() + L) - L2))));
            }
        }
        c(canvas, measuredWidth, z9, Color.HSVToColor(fArr2), false);
        RectF rectF = this.f39704n;
        rectF.set(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(26.0f) + height, getMeasuredWidth() - org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(34.0f) + height);
        LinearGradient linearGradient = this.P;
        Paint paint2 = this.f39698c;
        if (linearGradient == null) {
            fArr2[2] = this.f39697b0;
            int HSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.f39699c0;
            int HSVToColor2 = Color.HSVToColor(fArr2);
            float f13 = rectF.left;
            float f14 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f13, f14, rectF.right, f14, new int[]{HSVToColor2, HSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.P = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint2);
        if (this.f39697b0 == this.f39699c0) {
            f10 = 0.5f;
        } else {
            float brightness = getBrightness();
            float f15 = this.f39697b0;
            f10 = (brightness - f15) / (this.f39699c0 - f15);
        }
        c(canvas, (int) ((rectF.width() * (1.0f - f10)) + rectF.left), (int) rectF.centerY(), getColor(), true);
        if (!this.Q && this.U < 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.V;
            this.V = elapsedRealtime;
            float f16 = (((float) j3) / 180.0f) + this.U;
            this.U = f16;
            if (f16 > 1.0f) {
                this.U = 1.0f;
            }
            invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        g(getMeasuredWidth(), null, false);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (this.M != i7) {
            this.M = i7;
            int L = org.telegram.messenger.g0.L(180.0f);
            Bitmap createBitmap = Bitmap.createBitmap(i7, L, Bitmap.Config.ARGB_8888);
            float f10 = i7;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f11 = L;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, L / 3, 0.0f, f11, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.f39696b;
            paint.setShader(composeShader);
            new Canvas(createBitmap).drawRect(0.0f, 0.0f, f10, f11, paint);
            this.f39706s = createBitmap;
            this.P = null;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vp.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setHasChanges(boolean z9) {
        Integer num;
        float f10;
        TextView textView = this.H;
        if (!z9 || textView.getTag() == null) {
            if ((!z9 && textView.getTag() == null) || this.F.getTag() != null) {
                return;
            }
            if (z9) {
                num = 1;
            } else {
                num = null;
            }
            textView.setTag(num);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            if (z9) {
                textView.setVisibility(0);
            }
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, View.ALPHA, f10));
            animatorSet.addListener(new s9(6, this, z9));
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(180L);
            animatorSet.start();
        }
    }

    public void setMaxBrightness(float f10) {
        this.f39695a0 = f10;
        h();
    }

    public void setMinBrightness(float f10) {
        this.W = f10;
        h();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.h6 h6Var) {
        this.f39700d0 = h6Var;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.r0 r0Var = this.I;
        if (r0Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.f39700d0);
                if (w02 != this.f39702e0) {
                    this.f39702e0 = w02;
                    r0Var.setIconColor(w02);
                }
                r0Var.O(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.f39700d0), false);
                r0Var.O(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.f39700d0), true);
                r0Var.H(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, this.f39700d0));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.E;
        if (editTextBoldCursorArr != null) {
            for (int i7 = 0; i7 < editTextBoldCursorArr.length; i7++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.f39700d0));
                    editTextBoldCursorArr[i7].setHeaderHintColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.L6, this.f39700d0));
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
