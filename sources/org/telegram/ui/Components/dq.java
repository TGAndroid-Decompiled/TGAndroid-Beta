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
public class dq extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final int f34029g0 = 0;
    public AnimatorSet E;
    public final EditTextBoldCursor[] F;
    public final org.telegram.ui.ActionBar.f0 G;
    public final ImageView H;
    public final TextView I;
    public final org.telegram.ui.ActionBar.q0 J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final float[] O;
    public final float[] P;
    public LinearGradient Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public long W;
    public final cq f34030a;
    public float f34031a0;
    public final Paint f34032b;
    public float f34033b0;
    public final Paint f34034c;
    public float f34035c0;
    public final Paint d;
    public float f34036d0;
    public final Paint f34037e;
    public org.telegram.ui.ActionBar.e6 f34038e0;
    public final Drawable f34039f;
    public int f34040f0;
    public boolean h;
    public final RectF f34041n;
    public boolean f34042r;
    public Bitmap f34043s;
    public final ColorPicker$RadioButton[] f34044w;
    public final FrameLayout f34045x;
    public final di.wa f34046y;

    public dq(Context context, boolean z10, cq cqVar) {
        super(context);
        boolean z11;
        this.f34041n = new RectF();
        this.f34044w = new ColorPicker$RadioButton[4];
        this.L = 1;
        this.M = 1;
        this.O = new float[]{0.0f, 0.0f, 1.0f};
        this.P = new float[3];
        this.V = 1.0f;
        this.f34031a0 = 0.0f;
        this.f34033b0 = 1.0f;
        this.f34035c0 = 0.0f;
        this.f34036d0 = 1.0f;
        this.f34030a = cqVar;
        this.F = new EditTextBoldCursor[2];
        setWillNotDraw(false);
        this.f34039f = context.getResources().getDrawable(2131231599).mutate();
        this.d = new Paint(1);
        this.f34032b = new Paint(5);
        this.f34034c = new Paint(5);
        Paint paint = new Paint();
        this.f34037e = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        di.wa waVar = new di.wa(this, context);
        this.f34046y = waVar;
        waVar.setOrientation(0);
        addView(waVar, c8.ja.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        waVar.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34045x = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, c8.ja.d(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        for (int i7 = 0; i7 < 4; i7++) {
            this.f34044w[i7] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.f34044w[i7];
            if (this.T == i7) {
                z11 = true;
            } else {
                z11 = false;
            }
            colorPicker$RadioButton.d = z11;
            colorPicker$RadioButton.b(false);
            this.f34045x.addView(this.f34044w[i7], c8.ja.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f34044w[i7].setOnClickListener(new View.OnClickListener(this) {
                public final dq f42054b;

                {
                    this.f42054b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i10;
                    boolean z12;
                    boolean z13;
                    int i11 = r2;
                    dq dqVar = this.f42054b;
                    switch (i11) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            cq cqVar2 = dqVar.f34030a;
                            org.telegram.ui.ActionBar.f0 f0Var = dqVar.G;
                            ImageView imageView = dqVar.H;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = dqVar.f34044w;
                            if (dqVar.E == null) {
                                int i12 = dqVar.L;
                                if (i12 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.f32475e == 0) {
                                        i10 = 0;
                                        colorPicker$RadioButton2.a(dq.d(colorPicker$RadioButtonArr[0].f32475e));
                                    } else {
                                        i10 = 0;
                                    }
                                    if (dqVar.h) {
                                        cqVar2.c(colorPicker$RadioButtonArr[i10].f32475e, i10, true);
                                    }
                                    cqVar2.c(colorPicker$RadioButtonArr[1].f32475e, 1, true);
                                    dqVar.L = 2;
                                } else if (i12 == 2) {
                                    dqVar.L = 3;
                                    if (colorPicker$RadioButtonArr[2].f32475e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].f32475e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    cqVar2.c(colorPicker$RadioButtonArr[2].f32475e, 2, true);
                                } else if (i12 == 3) {
                                    dqVar.L = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.f32475e == 0) {
                                        colorPicker$RadioButton3.a(dq.d(colorPicker$RadioButtonArr[2].f32475e));
                                    }
                                    cqVar2.c(colorPicker$RadioButtonArr[3].f32475e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (dqVar.L < dqVar.M) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, com.google.android.gms.internal.vision.e2.v(dqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (dqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, com.google.android.gms.internal.vision.e2.v(dqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (dqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 0.0f));
                                }
                                if (dqVar.L > 1) {
                                    if (f0Var.getVisibility() != 0) {
                                        f0Var.setScaleX(0.0f);
                                        f0Var.setScaleY(0.0f);
                                    }
                                    f0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[dqVar.L - 1].callOnClick();
                                dqVar.E = new AnimatorSet();
                                dqVar.g(dqVar.getMeasuredWidth(), arrayList, false);
                                dqVar.E.playTogether(arrayList);
                                dqVar.E.setDuration(180L);
                                dqVar.E.setInterpolator(er.f34421g);
                                dqVar.E.addListener(new bq(dqVar, 1));
                                dqVar.E.start();
                                return;
                            }
                            return;
                        case 1:
                            cq cqVar3 = dqVar.f34030a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.f0 f0Var2 = dqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = dqVar.f34044w;
                            ImageView imageView2 = dqVar.H;
                            if (dqVar.E == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i13 = dqVar.L;
                                if (i13 == 2) {
                                    dqVar.L = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var2, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, 0.0f));
                                } else if (i13 == 3) {
                                    dqVar.L = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                                } else if (i13 == 4) {
                                    dqVar.L = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, org.telegram.messenger.k5.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (dqVar.L < dqVar.M) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 0.0f));
                                }
                                int i14 = dqVar.T;
                                if (i14 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i14];
                                    for (int i15 = i14 + 1; i15 < colorPicker$RadioButtonArr2.length; i15++) {
                                        colorPicker$RadioButtonArr2[i15 - 1] = colorPicker$RadioButtonArr2[i15];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i16 = dqVar.U;
                                if (i16 >= 0 && i16 < dqVar.T) {
                                    colorPicker$RadioButtonArr2[i16].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[dqVar.L - 1].callOnClick();
                                }
                                for (int i17 = 0; i17 < colorPicker$RadioButtonArr2.length; i17++) {
                                    if (i17 < dqVar.L) {
                                        int i18 = colorPicker$RadioButtonArr2[i17].f32475e;
                                        if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        cqVar3.c(i18, i17, z13);
                                    } else {
                                        if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        cqVar3.c(0, i17, z12);
                                    }
                                }
                                dqVar.E = new AnimatorSet();
                                dqVar.g(dqVar.getMeasuredWidth(), arrayList2, true);
                                dqVar.E.playTogether(arrayList2);
                                dqVar.E.setDuration(180L);
                                dqVar.E.setInterpolator(er.f34421g);
                                dqVar.E.addListener(new bq(dqVar, 0));
                                dqVar.E.start();
                                return;
                            }
                            return;
                        case 2:
                            dq.a(dqVar, view);
                            return;
                        default:
                            dqVar.J.V(null, null);
                            return;
                    }
                }
            });
        }
        int i10 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.F;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i10 % 2 == 0) {
                editTextBoldCursorArr[i10] = new zp(this, context, i10, 0);
                this.F[i10].setBackgroundDrawable(null);
                this.F[i10].setText("#");
                this.F[i10].setEnabled(false);
                this.F[i10].setFocusable(false);
                this.F[i10].setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(16.0f));
                this.f34046y.addView(this.F[i10], c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i10] = new zp(this, context, i10, 1);
                this.F[i10].setBackgroundDrawable(null);
                this.F[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.F[i10].setHint("8BC6ED");
                this.F[i10].setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(16.0f));
                this.f34046y.addView(this.F[i10], c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.F[i10].addTextChangedListener(new aq(this, i10));
                this.F[i10].setOnEditorActionListener(new j2(1));
            }
            this.F[i10].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.q6.D(this.F[i10], org.telegram.ui.ActionBar.j6.H6, this.f34038e0);
            EditTextBoldCursor editTextBoldCursor = this.F[i10];
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i11, this.f34038e0);
            this.F[i10].setCursorColor(org.telegram.ui.ActionBar.j6.w0(i11, this.f34038e0));
            this.F[i10].setCursorSize(org.telegram.messenger.g0.L(18.0f));
            this.F[i10].setCursorWidth(1.5f);
            this.F[i10].setSingleLine(true);
            this.F[i10].setGravity(19);
            this.F[i10].setHeaderHintColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.L6, this.f34038e0));
            this.F[i10].setTransformHintToHeader(true);
            this.F[i10].setInputType(524416);
            this.F[i10].setImeOptions(268435462);
            if (i10 == 1) {
                this.F[i10].requestFocus();
            } else if (i10 == 2 || i10 == 3) {
                this.F[i10].setVisibility(8);
            }
            i10++;
        }
        ImageView imageView = new ImageView(getContext());
        this.H = imageView;
        int i12 = org.telegram.ui.ActionBar.j6.I5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i12, this.f34038e0), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
        org.telegram.ui.ActionBar.e6 e6Var = this.f34038e0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, e6Var);
        imageView.setImageResource(2131232043);
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var2 = this.f34038e0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.s(imageView, i13, e6Var2, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final dq f42054b;

            {
                this.f42054b = this;
            }

            @Override
            public final void onClick(View view) {
                int i102;
                boolean z12;
                boolean z13;
                int i112 = r2;
                dq dqVar = this.f42054b;
                switch (i112) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        cq cqVar2 = dqVar.f34030a;
                        org.telegram.ui.ActionBar.f0 f0Var = dqVar.G;
                        ImageView imageView2 = dqVar.H;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = dqVar.f34044w;
                        if (dqVar.E == null) {
                            int i122 = dqVar.L;
                            if (i122 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.f32475e == 0) {
                                    i102 = 0;
                                    colorPicker$RadioButton2.a(dq.d(colorPicker$RadioButtonArr[0].f32475e));
                                } else {
                                    i102 = 0;
                                }
                                if (dqVar.h) {
                                    cqVar2.c(colorPicker$RadioButtonArr[i102].f32475e, i102, true);
                                }
                                cqVar2.c(colorPicker$RadioButtonArr[1].f32475e, 1, true);
                                dqVar.L = 2;
                            } else if (i122 == 2) {
                                dqVar.L = 3;
                                if (colorPicker$RadioButtonArr[2].f32475e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].f32475e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                cqVar2.c(colorPicker$RadioButtonArr[2].f32475e, 2, true);
                            } else if (i122 == 3) {
                                dqVar.L = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.f32475e == 0) {
                                    colorPicker$RadioButton3.a(dq.d(colorPicker$RadioButtonArr[2].f32475e));
                                }
                                cqVar2.c(colorPicker$RadioButtonArr[3].f32475e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (dqVar.L < dqVar.M) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.gms.internal.vision.e2.v(dqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (dqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.gms.internal.vision.e2.v(dqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (dqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (dqVar.L > 1) {
                                if (f0Var.getVisibility() != 0) {
                                    f0Var.setScaleX(0.0f);
                                    f0Var.setScaleY(0.0f);
                                }
                                f0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(f0Var, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(f0Var, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(f0Var, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[dqVar.L - 1].callOnClick();
                            dqVar.E = new AnimatorSet();
                            dqVar.g(dqVar.getMeasuredWidth(), arrayList, false);
                            dqVar.E.playTogether(arrayList);
                            dqVar.E.setDuration(180L);
                            dqVar.E.setInterpolator(er.f34421g);
                            dqVar.E.addListener(new bq(dqVar, 1));
                            dqVar.E.start();
                            return;
                        }
                        return;
                    case 1:
                        cq cqVar3 = dqVar.f34030a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.f0 f0Var2 = dqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = dqVar.f34044w;
                        ImageView imageView22 = dqVar.H;
                        if (dqVar.E == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i132 = dqVar.L;
                            if (i132 == 2) {
                                dqVar.L = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var2, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var2, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var2, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i132 == 3) {
                                dqVar.L = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                            } else if (i132 == 4) {
                                dqVar.L = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.k5.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (dqVar.L < dqVar.M) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i14 = dqVar.T;
                            if (i14 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i14];
                                for (int i15 = i14 + 1; i15 < colorPicker$RadioButtonArr2.length; i15++) {
                                    colorPicker$RadioButtonArr2[i15 - 1] = colorPicker$RadioButtonArr2[i15];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i16 = dqVar.U;
                            if (i16 >= 0 && i16 < dqVar.T) {
                                colorPicker$RadioButtonArr2[i16].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[dqVar.L - 1].callOnClick();
                            }
                            for (int i17 = 0; i17 < colorPicker$RadioButtonArr2.length; i17++) {
                                if (i17 < dqVar.L) {
                                    int i18 = colorPicker$RadioButtonArr2[i17].f32475e;
                                    if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    cqVar3.c(i18, i17, z13);
                                } else {
                                    if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    cqVar3.c(0, i17, z12);
                                }
                            }
                            dqVar.E = new AnimatorSet();
                            dqVar.g(dqVar.getMeasuredWidth(), arrayList2, true);
                            dqVar.E.playTogether(arrayList2);
                            dqVar.E.setDuration(180L);
                            dqVar.E.setInterpolator(er.f34421g);
                            dqVar.E.addListener(new bq(dqVar, 0));
                            dqVar.E.start();
                            return;
                        }
                        return;
                    case 2:
                        dq.a(dqVar, view);
                        return;
                    default:
                        dqVar.J.V(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754486, null));
        addView(imageView, c8.ja.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(1, getContext(), this);
        this.G = f0Var;
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i12, this.f34038e0), 1, -1);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i12);
        org.telegram.ui.ActionBar.e6 e6Var3 = this.f34038e0;
        f0Var.setBackground(h03);
        org.telegram.ui.ActionBar.q6.j(f0Var, h03, null, M2, e6Var3);
        f0Var.setImageResource(2131232097);
        org.telegram.ui.ActionBar.q6.s(f0Var, i13, this.f34038e0, mode);
        f0Var.setAlpha(0.0f);
        f0Var.setScaleX(0.0f);
        f0Var.setScaleY(0.0f);
        f0Var.setScaleType(scaleType);
        f0Var.setVisibility(4);
        f0Var.setOnClickListener(new View.OnClickListener(this) {
            public final dq f42054b;

            {
                this.f42054b = this;
            }

            @Override
            public final void onClick(View view) {
                int i102;
                boolean z12;
                boolean z13;
                int i112 = r2;
                dq dqVar = this.f42054b;
                switch (i112) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        cq cqVar2 = dqVar.f34030a;
                        org.telegram.ui.ActionBar.f0 f0Var2 = dqVar.G;
                        ImageView imageView2 = dqVar.H;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = dqVar.f34044w;
                        if (dqVar.E == null) {
                            int i122 = dqVar.L;
                            if (i122 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.f32475e == 0) {
                                    i102 = 0;
                                    colorPicker$RadioButton2.a(dq.d(colorPicker$RadioButtonArr[0].f32475e));
                                } else {
                                    i102 = 0;
                                }
                                if (dqVar.h) {
                                    cqVar2.c(colorPicker$RadioButtonArr[i102].f32475e, i102, true);
                                }
                                cqVar2.c(colorPicker$RadioButtonArr[1].f32475e, 1, true);
                                dqVar.L = 2;
                            } else if (i122 == 2) {
                                dqVar.L = 3;
                                if (colorPicker$RadioButtonArr[2].f32475e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].f32475e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                cqVar2.c(colorPicker$RadioButtonArr[2].f32475e, 2, true);
                            } else if (i122 == 3) {
                                dqVar.L = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.f32475e == 0) {
                                    colorPicker$RadioButton3.a(dq.d(colorPicker$RadioButtonArr[2].f32475e));
                                }
                                cqVar2.c(colorPicker$RadioButtonArr[3].f32475e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (dqVar.L < dqVar.M) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.gms.internal.vision.e2.v(dqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (dqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.gms.internal.vision.e2.v(dqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (dqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (dqVar.L > 1) {
                                if (f0Var2.getVisibility() != 0) {
                                    f0Var2.setScaleX(0.0f);
                                    f0Var2.setScaleY(0.0f);
                                }
                                f0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(f0Var2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(f0Var2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(f0Var2, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[dqVar.L - 1].callOnClick();
                            dqVar.E = new AnimatorSet();
                            dqVar.g(dqVar.getMeasuredWidth(), arrayList, false);
                            dqVar.E.playTogether(arrayList);
                            dqVar.E.setDuration(180L);
                            dqVar.E.setInterpolator(er.f34421g);
                            dqVar.E.addListener(new bq(dqVar, 1));
                            dqVar.E.start();
                            return;
                        }
                        return;
                    case 1:
                        cq cqVar3 = dqVar.f34030a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.f0 f0Var22 = dqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = dqVar.f34044w;
                        ImageView imageView22 = dqVar.H;
                        if (dqVar.E == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i132 = dqVar.L;
                            if (i132 == 2) {
                                dqVar.L = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var22, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i132 == 3) {
                                dqVar.L = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                            } else if (i132 == 4) {
                                dqVar.L = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.k5.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (dqVar.L < dqVar.M) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i14 = dqVar.T;
                            if (i14 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i14];
                                for (int i15 = i14 + 1; i15 < colorPicker$RadioButtonArr2.length; i15++) {
                                    colorPicker$RadioButtonArr2[i15 - 1] = colorPicker$RadioButtonArr2[i15];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i16 = dqVar.U;
                            if (i16 >= 0 && i16 < dqVar.T) {
                                colorPicker$RadioButtonArr2[i16].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[dqVar.L - 1].callOnClick();
                            }
                            for (int i17 = 0; i17 < colorPicker$RadioButtonArr2.length; i17++) {
                                if (i17 < dqVar.L) {
                                    int i18 = colorPicker$RadioButtonArr2[i17].f32475e;
                                    if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    cqVar3.c(i18, i17, z13);
                                } else {
                                    if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    cqVar3.c(0, i17, z12);
                                }
                            }
                            dqVar.E = new AnimatorSet();
                            dqVar.g(dqVar.getMeasuredWidth(), arrayList2, true);
                            dqVar.E.playTogether(arrayList2);
                            dqVar.E.setDuration(180L);
                            dqVar.E.setInterpolator(er.f34421g);
                            dqVar.E.addListener(new bq(dqVar, 0));
                            dqVar.E.start();
                            return;
                        }
                        return;
                    case 2:
                        dq.a(dqVar, view);
                        return;
                    default:
                        dqVar.J.V(null, null);
                        return;
                }
            }
        });
        f0Var.setContentDescription(org.telegram.messenger.hd.M0(2131752099, null));
        addView(f0Var, c8.ja.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.I = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.q6.U(textView, i13, this.f34038e0);
        addView(textView, c8.ja.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new bi.o(13));
        if (z10) {
            org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.j6.w0(i13, this.f34038e0));
            this.J = q0Var;
            q0Var.setLongClickEnabled(false);
            q0Var.setIcon(2131231244);
            q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
            q0Var.e(1, 2131232117, org.telegram.messenger.hd.M0(2131747797, null));
            q0Var.e(2, 2131232364, org.telegram.messenger.hd.M0(2131745426, null));
            q0Var.e(3, 2131232109, org.telegram.messenger.hd.M0(2131751486, null));
            q0Var.setMenuYOffset(-org.telegram.messenger.g0.L(80.0f));
            q0Var.setSubMenuOpenSide(2);
            q0Var.setDelegate(new s(this, 26));
            q0Var.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
            q0Var.setTranslationX(org.telegram.messenger.g0.L(6.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i12, this.f34038e0), 1, -1);
            org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i12);
            org.telegram.ui.ActionBar.e6 e6Var4 = this.f34038e0;
            q0Var.setBackground(h04);
            org.telegram.ui.ActionBar.q6.j(q0Var, h04, null, M3, e6Var4);
            addView(q0Var, c8.ja.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            q0Var.setOnClickListener(new View.OnClickListener(this) {
                public final dq f42054b;

                {
                    this.f42054b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i102;
                    boolean z12;
                    boolean z13;
                    int i112 = r2;
                    dq dqVar = this.f42054b;
                    switch (i112) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            cq cqVar2 = dqVar.f34030a;
                            org.telegram.ui.ActionBar.f0 f0Var2 = dqVar.G;
                            ImageView imageView2 = dqVar.H;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = dqVar.f34044w;
                            if (dqVar.E == null) {
                                int i122 = dqVar.L;
                                if (i122 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.f32475e == 0) {
                                        i102 = 0;
                                        colorPicker$RadioButton2.a(dq.d(colorPicker$RadioButtonArr[0].f32475e));
                                    } else {
                                        i102 = 0;
                                    }
                                    if (dqVar.h) {
                                        cqVar2.c(colorPicker$RadioButtonArr[i102].f32475e, i102, true);
                                    }
                                    cqVar2.c(colorPicker$RadioButtonArr[1].f32475e, 1, true);
                                    dqVar.L = 2;
                                } else if (i122 == 2) {
                                    dqVar.L = 3;
                                    if (colorPicker$RadioButtonArr[2].f32475e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].f32475e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    cqVar2.c(colorPicker$RadioButtonArr[2].f32475e, 2, true);
                                } else if (i122 == 3) {
                                    dqVar.L = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.f32475e == 0) {
                                        colorPicker$RadioButton3.a(dq.d(colorPicker$RadioButtonArr[2].f32475e));
                                    }
                                    cqVar2.c(colorPicker$RadioButtonArr[3].f32475e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (dqVar.L < dqVar.M) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.gms.internal.vision.e2.v(dqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (dqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.gms.internal.vision.e2.v(dqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (dqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                                }
                                if (dqVar.L > 1) {
                                    if (f0Var2.getVisibility() != 0) {
                                        f0Var2.setScaleX(0.0f);
                                        f0Var2.setScaleY(0.0f);
                                    }
                                    f0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var2, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[dqVar.L - 1].callOnClick();
                                dqVar.E = new AnimatorSet();
                                dqVar.g(dqVar.getMeasuredWidth(), arrayList, false);
                                dqVar.E.playTogether(arrayList);
                                dqVar.E.setDuration(180L);
                                dqVar.E.setInterpolator(er.f34421g);
                                dqVar.E.addListener(new bq(dqVar, 1));
                                dqVar.E.start();
                                return;
                            }
                            return;
                        case 1:
                            cq cqVar3 = dqVar.f34030a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.f0 f0Var22 = dqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = dqVar.f34044w;
                            ImageView imageView22 = dqVar.H;
                            if (dqVar.E == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i132 = dqVar.L;
                                if (i132 == 2) {
                                    dqVar.L = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var22, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                                } else if (i132 == 3) {
                                    dqVar.L = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                                } else if (i132 == 4) {
                                    dqVar.L = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.k5.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (dqVar.L < dqVar.M) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                                }
                                int i14 = dqVar.T;
                                if (i14 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i14];
                                    for (int i15 = i14 + 1; i15 < colorPicker$RadioButtonArr2.length; i15++) {
                                        colorPicker$RadioButtonArr2[i15 - 1] = colorPicker$RadioButtonArr2[i15];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i16 = dqVar.U;
                                if (i16 >= 0 && i16 < dqVar.T) {
                                    colorPicker$RadioButtonArr2[i16].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[dqVar.L - 1].callOnClick();
                                }
                                for (int i17 = 0; i17 < colorPicker$RadioButtonArr2.length; i17++) {
                                    if (i17 < dqVar.L) {
                                        int i18 = colorPicker$RadioButtonArr2[i17].f32475e;
                                        if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        cqVar3.c(i18, i17, z13);
                                    } else {
                                        if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        cqVar3.c(0, i17, z12);
                                    }
                                }
                                dqVar.E = new AnimatorSet();
                                dqVar.g(dqVar.getMeasuredWidth(), arrayList2, true);
                                dqVar.E.playTogether(arrayList2);
                                dqVar.E.setDuration(180L);
                                dqVar.E.setInterpolator(er.f34421g);
                                dqVar.E.addListener(new bq(dqVar, 0));
                                dqVar.E.start();
                                return;
                            }
                            return;
                        case 2:
                            dq.a(dqVar, view);
                            return;
                        default:
                            dqVar.J.V(null, null);
                            return;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(dq dqVar, View view) {
        boolean z10;
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i7 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = dqVar.f34044w;
            if (i7 < colorPicker$RadioButtonArr.length) {
                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i7];
                if (colorPicker$RadioButton2 == colorPicker$RadioButton) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                colorPicker$RadioButton2.d = z10;
                colorPicker$RadioButton2.b(true);
                if (z10) {
                    dqVar.U = dqVar.T;
                    dqVar.T = i7;
                }
                i7++;
            } else {
                int i10 = colorPicker$RadioButton.f32475e;
                dqVar.setColorInner(i10);
                dqVar.F[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i10)), Byte.valueOf((byte) Color.green(i10)), Byte.valueOf((byte) Color.blue(i10))).toUpperCase());
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
        return Math.max(this.f34035c0, Math.min(this.O[2], this.f34036d0));
    }

    public void setColorInner(int i7) {
        Color.colorToHSV(i7, this.O);
        int d = this.f34030a.d(this.T);
        if (d == 0 || d != i7) {
            h();
        }
        this.Q = null;
        invalidate();
    }

    public final void c(Canvas canvas, int i7, int i10, int i11, boolean z10) {
        float f10;
        float f11;
        float f12;
        if (z10) {
            f10 = 12.0f;
        } else {
            f10 = 16.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        Drawable drawable = this.f34039f;
        drawable.setBounds(i7 - L, i10 - L, i7 + L, L + i10);
        drawable.draw(canvas);
        Paint paint = this.d;
        paint.setColor(-1);
        float f13 = i7;
        float f14 = i10;
        if (z10) {
            f11 = 11.0f;
        } else {
            f11 = 15.0f;
        }
        canvas.drawCircle(f13, f14, org.telegram.messenger.g0.L(f11), paint);
        paint.setColor(i11);
        if (z10) {
            f12 = 9.0f;
        } else {
            f12 = 13.0f;
        }
        canvas.drawCircle(f13, f14, org.telegram.messenger.g0.L(f12), paint);
    }

    public final void e(int i7, int i10) {
        if (!this.f34042r) {
            this.f34042r = true;
            if (this.T == i10) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i7)), Byte.valueOf((byte) Color.green(i7)), Byte.valueOf((byte) Color.blue(i7))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.F;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.f34044w[i10].a(i7);
            this.f34042r = false;
        }
        setColorInner(i7);
    }

    public final void f(int i7, int i10, int i11, boolean z10) {
        boolean z11;
        if (i7 != this.K) {
            this.U = 0;
            this.T = 0;
            for (int i12 = 0; i12 < 4; i12++) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.f34044w[i12];
                if (i12 == this.T) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                colorPicker$RadioButton.d = z11;
                colorPicker$RadioButton.b(true);
            }
        }
        this.M = i10;
        this.K = i7;
        this.h = z10;
        this.L = i11;
        ImageView imageView = this.H;
        if (i11 == 1) {
            imageView.setTranslationX(0.0f);
        } else if (i11 == 2) {
            imageView.setTranslationX(org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f));
        } else if (i11 == 3) {
            imageView.setTranslationX(org.telegram.messenger.k5.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.k5.D(13.0f, 3, org.telegram.messenger.g0.L(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.f0 f0Var = this.G;
        org.telegram.ui.ActionBar.q0 q0Var = this.J;
        if (q0Var != null) {
            if (i7 == 1) {
                q0Var.setVisibility(0);
            } else {
                q0Var.setVisibility(8);
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
        this.f34046y.invalidate();
        g(getMeasuredWidth(), null, false);
    }

    public final void g(int i7, ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        boolean z11;
        int i10 = this.L;
        float f12 = 30.0f;
        int D = org.telegram.messenger.k5.D(13.0f, i10 - 1, org.telegram.messenger.g0.L(30.0f) * i10);
        FrameLayout frameLayout = this.f34045x;
        int left = frameLayout.getLeft() + D;
        if (this.K == 1) {
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
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = this.f34044w;
            if (i11 < colorPicker$RadioButtonArr.length) {
                if (colorPicker$RadioButtonArr[i11].getTag(2131296461) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i13 = this.L;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                float f13 = f12;
                Property property4 = View.ALPHA;
                if (i11 < i13) {
                    colorPicker$RadioButtonArr[i11].setVisibility(0);
                    if (arrayList != null) {
                        if (!z11) {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property4, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property3, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property2, 1.0f));
                        }
                        if (!z10 && (z10 || i11 == this.L - 1)) {
                            colorPicker$RadioButtonArr[i11].setTranslationX(i12);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property, i12));
                        }
                    } else {
                        colorPicker$RadioButtonArr[i11].setVisibility(0);
                        if (this.E == null) {
                            colorPicker$RadioButtonArr[i11].setAlpha(1.0f);
                            colorPicker$RadioButtonArr[i11].setScaleX(1.0f);
                            colorPicker$RadioButtonArr[i11].setScaleY(1.0f);
                        }
                        colorPicker$RadioButtonArr[i11].setTranslationX(i12);
                    }
                    colorPicker$RadioButtonArr[i11].setTag(2131296461, 1);
                } else {
                    if (arrayList != null) {
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property4, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property2, 0.0f));
                        }
                    } else {
                        colorPicker$RadioButtonArr[i11].setVisibility(4);
                        if (this.E == null) {
                            colorPicker$RadioButtonArr[i11].setAlpha(0.0f);
                            colorPicker$RadioButtonArr[i11].setScaleX(0.0f);
                            colorPicker$RadioButtonArr[i11].setScaleY(0.0f);
                        }
                    }
                    if (!z10) {
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
        float[] fArr = this.O;
        float f10 = fArr[0];
        float[] fArr2 = this.P;
        fArr2[0] = f10;
        fArr2[1] = fArr[1];
        fArr2[2] = getBrightness();
        return (Color.HSVToColor(fArr2) & 16777215) | (-16777216);
    }

    public final void h() {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.f0 f0Var = this.G;
        if (f0Var == null) {
            return;
        }
        if (f0Var.getTag() != null) {
            f10 = 0.0f;
        } else {
            f10 = this.f34031a0;
        }
        if (f0Var.getTag() != null) {
            f11 = 1.0f;
        } else {
            f11 = this.f34033b0;
        }
        float[] fArr = this.O;
        float f12 = fArr[2];
        if (f10 == 0.0f && f11 == 1.0f) {
            this.f34035c0 = 0.0f;
            this.f34036d0 = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f12;
        float B = org.telegram.messenger.g0.B(HSVToColor);
        float max = Math.max(0.0f, Math.min(f10 / B, 1.0f));
        this.f34035c0 = max;
        this.f34036d0 = Math.max(max, Math.min(f11 / B, 1.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f34046y.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i7;
        int L = org.telegram.messenger.g0.L(45.0f);
        float f11 = L;
        canvas.drawBitmap(this.f34043s, 0.0f, f11, (Paint) null);
        int height = this.f34043s.getHeight() + L;
        Paint paint = this.f34037e;
        canvas.drawRect(0.0f, f11, getMeasuredWidth(), L + 1, paint);
        canvas.drawRect(0.0f, height - 1, getMeasuredWidth(), height, paint);
        float[] fArr = this.O;
        float f12 = fArr[0];
        float[] fArr2 = this.P;
        fArr2[0] = f12;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, fArr[1], this.f34043s.getHeight(), f11);
        if (!this.R) {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            float interpolation = er.f34421g.getInterpolation(this.V);
            if (measuredWidth < L2) {
                measuredWidth = (int) (((L2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - L2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - L2)) * interpolation));
            }
            if (z10 < L + L2) {
                z10 = (int) ((interpolation * (i7 - z10)) + z10);
            } else if (z10 > (this.f34043s.getHeight() + L) - L2) {
                z10 = (int) (z10 - (interpolation * (z10 - ((this.f34043s.getHeight() + L) - L2))));
            }
        }
        c(canvas, measuredWidth, z10, Color.HSVToColor(fArr2), false);
        RectF rectF = this.f34041n;
        rectF.set(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(26.0f) + height, getMeasuredWidth() - org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(34.0f) + height);
        LinearGradient linearGradient = this.Q;
        Paint paint2 = this.f34034c;
        if (linearGradient == null) {
            fArr2[2] = this.f34035c0;
            int HSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.f34036d0;
            int HSVToColor2 = Color.HSVToColor(fArr2);
            float f13 = rectF.left;
            float f14 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f13, f14, rectF.right, f14, new int[]{HSVToColor2, HSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.Q = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint2);
        if (this.f34035c0 == this.f34036d0) {
            f10 = 0.5f;
        } else {
            float brightness = getBrightness();
            float f15 = this.f34035c0;
            f10 = (brightness - f15) / (this.f34036d0 - f15);
        }
        c(canvas, (int) ((rectF.width() * (1.0f - f10)) + rectF.left), (int) rectF.centerY(), getColor(), true);
        if (!this.R && this.V < 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.W;
            this.W = elapsedRealtime;
            float f16 = (((float) j3) / 180.0f) + this.V;
            this.V = f16;
            if (f16 > 1.0f) {
                this.V = 1.0f;
            }
            invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        g(getMeasuredWidth(), null, false);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (this.N != i7) {
            this.N = i7;
            int L = org.telegram.messenger.g0.L(180.0f);
            Bitmap createBitmap = Bitmap.createBitmap(i7, L, Bitmap.Config.ARGB_8888);
            float f10 = i7;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f11 = L;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, L / 3, 0.0f, f11, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.f34032b;
            paint.setShader(composeShader);
            new Canvas(createBitmap).drawRect(0.0f, 0.0f, f10, f11, paint);
            this.f34043s = createBitmap;
            this.Q = null;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dq.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setHasChanges(boolean z10) {
        Integer num;
        float f10;
        TextView textView = this.I;
        if (!z10 || textView.getTag() == null) {
            if ((!z10 && textView.getTag() == null) || this.G.getTag() != null) {
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
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, View.ALPHA, f10));
            animatorSet.addListener(new org.telegram.ui.nn(7, this, z10));
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(180L);
            animatorSet.start();
        }
    }

    public void setMaxBrightness(float f10) {
        this.f34033b0 = f10;
        h();
    }

    public void setMinBrightness(float f10) {
        this.f34031a0 = f10;
        h();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f34038e0 = e6Var;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.q0 q0Var = this.J;
        if (q0Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.f34038e0);
                if (w02 != this.f34040f0) {
                    this.f34040f0 = w02;
                    q0Var.setIconColor(w02);
                }
                q0Var.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, this.f34038e0), false);
                q0Var.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, this.f34038e0), true);
                q0Var.I(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, this.f34038e0));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.F;
        if (editTextBoldCursorArr != null) {
            for (int i7 = 0; i7 < editTextBoldCursorArr.length; i7++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.f34038e0));
                    editTextBoldCursorArr[i7].setHeaderHintColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.L6, this.f34038e0));
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
