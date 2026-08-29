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
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class gq extends FrameLayout {
    public static final int f28945a0 = 0;
    public final EditTextBoldCursor[] A;
    public final org.telegram.ui.ActionBar.m0 B;
    public final ImageView C;
    public final TextView D;
    public final org.telegram.ui.ActionBar.w0 E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final float[] J;
    public final float[] K;
    public LinearGradient L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public float Q;
    public long R;
    public float S;
    public float T;
    public float U;
    public float V;
    public org.telegram.ui.ActionBar.c6 W;
    public final fq f28946a;
    public final Paint f28947b;
    public final Paint f28948c;
    public final Paint d;
    public final Paint f28949e;
    public final Drawable f28950f;
    public boolean h;
    public final RectF f28951n;
    public boolean f28952r;
    public Bitmap f28953s;
    public final ColorPicker$RadioButton[] v;
    public final FrameLayout f28954w;
    public final ag.v f28955x;
    public AnimatorSet f28956y;

    public gq(Context context, boolean z10, fq fqVar) {
        super(context);
        boolean z11;
        this.f28951n = new RectF();
        this.v = new ColorPicker$RadioButton[4];
        this.G = 1;
        this.H = 1;
        this.J = new float[]{0.0f, 0.0f, 1.0f};
        this.K = new float[3];
        this.Q = 1.0f;
        this.S = 0.0f;
        this.T = 1.0f;
        this.U = 0.0f;
        this.V = 1.0f;
        this.f28946a = fqVar;
        this.A = new EditTextBoldCursor[2];
        setWillNotDraw(false);
        this.f28950f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        this.d = new Paint(1);
        this.f28947b = new Paint(5);
        this.f28948c = new Paint(5);
        Paint paint = new Paint();
        this.f28949e = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        ag.v vVar = new ag.v(this, context);
        this.f28955x = vVar;
        vVar.setOrientation(0);
        addView(vVar, i7.f6.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        vVar.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28954w = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, i7.f6.d(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        for (int i10 = 0; i10 < 4; i10++) {
            this.v[i10] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.v[i10];
            if (this.O == i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            colorPicker$RadioButton.d = z11;
            colorPicker$RadioButton.b(false);
            this.f28954w.addView(this.v[i10], i7.f6.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.v[i10].setOnClickListener(new View.OnClickListener(this) {
                public final gq f27203b;

                {
                    this.f27203b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    boolean z12;
                    boolean z13;
                    int i12 = r2;
                    gq gqVar = this.f27203b;
                    switch (i12) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            fq fqVar2 = gqVar.f28946a;
                            org.telegram.ui.ActionBar.m0 m0Var = gqVar.B;
                            ImageView imageView = gqVar.C;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = gqVar.v;
                            if (gqVar.f28956y == null) {
                                int i13 = gqVar.G;
                                if (i13 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.f26357e == 0) {
                                        i11 = 0;
                                        colorPicker$RadioButton2.a(gq.d(colorPicker$RadioButtonArr[0].f26357e));
                                    } else {
                                        i11 = 0;
                                    }
                                    if (gqVar.h) {
                                        fqVar2.s0(colorPicker$RadioButtonArr[i11].f26357e, i11, true);
                                    }
                                    fqVar2.s0(colorPicker$RadioButtonArr[1].f26357e, 1, true);
                                    gqVar.G = 2;
                                } else if (i13 == 2) {
                                    gqVar.G = 3;
                                    if (colorPicker$RadioButtonArr[2].f26357e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].f26357e, fArr);
                                        float f9 = fArr[0];
                                        if (f9 > 180.0f) {
                                            fArr[0] = f9 - 60.0f;
                                        } else {
                                            fArr[0] = f9 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    fqVar2.s0(colorPicker$RadioButtonArr[2].f26357e, 2, true);
                                } else if (i13 == 3) {
                                    gqVar.G = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.f26357e == 0) {
                                        colorPicker$RadioButton3.a(gq.d(colorPicker$RadioButtonArr[2].f26357e));
                                    }
                                    fqVar2.s0(colorPicker$RadioButtonArr[3].f26357e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (gqVar.G < gqVar.H) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, com.google.android.recaptcha.internal.a.f(gqVar.G, 1, AndroidUtilities.dp(13.0f), (gqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, com.google.android.recaptcha.internal.a.f(gqVar.G, 1, AndroidUtilities.dp(13.0f), (gqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 0.0f));
                                }
                                if (gqVar.G > 1) {
                                    if (m0Var.getVisibility() != 0) {
                                        m0Var.setScaleX(0.0f);
                                        m0Var.setScaleY(0.0f);
                                    }
                                    m0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(m0Var, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(m0Var, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(m0Var, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[gqVar.G - 1].callOnClick();
                                gqVar.f28956y = new AnimatorSet();
                                gqVar.g(gqVar.getMeasuredWidth(), arrayList, false);
                                gqVar.f28956y.playTogether(arrayList);
                                gqVar.f28956y.setDuration(180L);
                                gqVar.f28956y.setInterpolator(jr.f29801g);
                                gqVar.f28956y.addListener(new org.telegram.ui.bm(gqVar, 22));
                                gqVar.f28956y.start();
                                return;
                            }
                            return;
                        case 1:
                            fq fqVar3 = gqVar.f28946a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.m0 m0Var2 = gqVar.B;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = gqVar.v;
                            ImageView imageView2 = gqVar.C;
                            if (gqVar.f28956y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i14 = gqVar.G;
                                if (i14 == 2) {
                                    gqVar.G = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(m0Var2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(m0Var2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(m0Var2, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, 0.0f));
                                } else if (i14 == 3) {
                                    gqVar.G = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i14 == 4) {
                                    gqVar.G = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, org.telegram.messenger.x3.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (gqVar.G < gqVar.H) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 0.0f));
                                }
                                int i15 = gqVar.O;
                                if (i15 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                    for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                        colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i17 = gqVar.P;
                                if (i17 >= 0 && i17 < gqVar.O) {
                                    colorPicker$RadioButtonArr2[i17].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[gqVar.G - 1].callOnClick();
                                }
                                for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                    if (i18 < gqVar.G) {
                                        int i19 = colorPicker$RadioButtonArr2[i18].f26357e;
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        fqVar3.s0(i19, i18, z13);
                                    } else {
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        fqVar3.s0(0, i18, z12);
                                    }
                                }
                                gqVar.f28956y = new AnimatorSet();
                                gqVar.g(gqVar.getMeasuredWidth(), arrayList2, true);
                                gqVar.f28956y.playTogether(arrayList2);
                                gqVar.f28956y.setDuration(180L);
                                gqVar.f28956y.setInterpolator(jr.f29801g);
                                gqVar.f28956y.addListener(new eq(gqVar));
                                gqVar.f28956y.start();
                                return;
                            }
                            return;
                        case 2:
                            gq.a(gqVar, view);
                            return;
                        default:
                            gqVar.E.M(null, null);
                            return;
                    }
                }
            });
        }
        int i11 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.A;
            if (i11 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i11 % 2 == 0) {
                editTextBoldCursorArr[i11] = new cq(this, context, i11, 0);
                this.A[i11].setBackgroundDrawable(null);
                this.A[i11].setText("#");
                this.A[i11].setEnabled(false);
                this.A[i11].setFocusable(false);
                this.A[i11].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.f28955x.addView(this.A[i11], i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i11] = new cq(this, context, i11, 1);
                this.A[i11].setBackgroundDrawable(null);
                this.A[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.A[i11].setHint("8BC6ED");
                this.A[i11].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.f28955x.addView(this.A[i11], i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.A[i11].addTextChangedListener(new dq(this, i11));
                this.A[i11].setOnEditorActionListener(new ag.b0(3));
            }
            this.A[i11].setTextSize(1, 16.0f);
            this.A[i11].setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, this.W));
            EditTextBoldCursor editTextBoldCursor = this.A[i11];
            int i12 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, this.W));
            this.A[i11].setCursorColor(org.telegram.ui.ActionBar.g6.v0(i12, this.W));
            this.A[i11].setCursorSize(AndroidUtilities.dp(18.0f));
            this.A[i11].setCursorWidth(1.5f);
            this.A[i11].setSingleLine(true);
            this.A[i11].setGravity(19);
            this.A[i11].setHeaderHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, this.W));
            this.A[i11].setTransformHintToHeader(true);
            this.A[i11].setInputType(524416);
            this.A[i11].setImeOptions(268435462);
            if (i11 == 1) {
                this.A[i11].requestFocus();
            } else if (i11 == 2 || i11 == 3) {
                this.A[i11].setVisibility(8);
            }
            i11++;
        }
        ImageView imageView = new ImageView(getContext());
        this.C = imageView;
        int i13 = org.telegram.ui.ActionBar.g6.I5;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i13, this.W), 1, -1));
        imageView.setImageResource(R.drawable.msg_add);
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i14, this.W);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final gq f27203b;

            {
                this.f27203b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112;
                boolean z12;
                boolean z13;
                int i122 = r2;
                gq gqVar = this.f27203b;
                switch (i122) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        fq fqVar2 = gqVar.f28946a;
                        org.telegram.ui.ActionBar.m0 m0Var = gqVar.B;
                        ImageView imageView2 = gqVar.C;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = gqVar.v;
                        if (gqVar.f28956y == null) {
                            int i132 = gqVar.G;
                            if (i132 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.f26357e == 0) {
                                    i112 = 0;
                                    colorPicker$RadioButton2.a(gq.d(colorPicker$RadioButtonArr[0].f26357e));
                                } else {
                                    i112 = 0;
                                }
                                if (gqVar.h) {
                                    fqVar2.s0(colorPicker$RadioButtonArr[i112].f26357e, i112, true);
                                }
                                fqVar2.s0(colorPicker$RadioButtonArr[1].f26357e, 1, true);
                                gqVar.G = 2;
                            } else if (i132 == 2) {
                                gqVar.G = 3;
                                if (colorPicker$RadioButtonArr[2].f26357e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].f26357e, fArr);
                                    float f9 = fArr[0];
                                    if (f9 > 180.0f) {
                                        fArr[0] = f9 - 60.0f;
                                    } else {
                                        fArr[0] = f9 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                fqVar2.s0(colorPicker$RadioButtonArr[2].f26357e, 2, true);
                            } else if (i132 == 3) {
                                gqVar.G = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.f26357e == 0) {
                                    colorPicker$RadioButton3.a(gq.d(colorPicker$RadioButtonArr[2].f26357e));
                                }
                                fqVar2.s0(colorPicker$RadioButtonArr[3].f26357e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (gqVar.G < gqVar.H) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.recaptcha.internal.a.f(gqVar.G, 1, AndroidUtilities.dp(13.0f), (gqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.recaptcha.internal.a.f(gqVar.G, 1, AndroidUtilities.dp(13.0f), (gqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (gqVar.G > 1) {
                                if (m0Var.getVisibility() != 0) {
                                    m0Var.setScaleX(0.0f);
                                    m0Var.setScaleY(0.0f);
                                }
                                m0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(m0Var, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(m0Var, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(m0Var, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[gqVar.G - 1].callOnClick();
                            gqVar.f28956y = new AnimatorSet();
                            gqVar.g(gqVar.getMeasuredWidth(), arrayList, false);
                            gqVar.f28956y.playTogether(arrayList);
                            gqVar.f28956y.setDuration(180L);
                            gqVar.f28956y.setInterpolator(jr.f29801g);
                            gqVar.f28956y.addListener(new org.telegram.ui.bm(gqVar, 22));
                            gqVar.f28956y.start();
                            return;
                        }
                        return;
                    case 1:
                        fq fqVar3 = gqVar.f28946a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.m0 m0Var2 = gqVar.B;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = gqVar.v;
                        ImageView imageView22 = gqVar.C;
                        if (gqVar.f28956y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i142 = gqVar.G;
                            if (i142 == 2) {
                                gqVar.G = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(m0Var2, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(m0Var2, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(m0Var2, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i142 == 3) {
                                gqVar.G = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i142 == 4) {
                                gqVar.G = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.x3.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (gqVar.G < gqVar.H) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i15 = gqVar.O;
                            if (i15 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                    colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i17 = gqVar.P;
                            if (i17 >= 0 && i17 < gqVar.O) {
                                colorPicker$RadioButtonArr2[i17].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[gqVar.G - 1].callOnClick();
                            }
                            for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                if (i18 < gqVar.G) {
                                    int i19 = colorPicker$RadioButtonArr2[i18].f26357e;
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    fqVar3.s0(i19, i18, z13);
                                } else {
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    fqVar3.s0(0, i18, z12);
                                }
                            }
                            gqVar.f28956y = new AnimatorSet();
                            gqVar.g(gqVar.getMeasuredWidth(), arrayList2, true);
                            gqVar.f28956y.playTogether(arrayList2);
                            gqVar.f28956y.setDuration(180L);
                            gqVar.f28956y.setInterpolator(jr.f29801g);
                            gqVar.f28956y.addListener(new eq(gqVar));
                            gqVar.f28956y.start();
                            return;
                        }
                        return;
                    case 2:
                        gq.a(gqVar, view);
                        return;
                    default:
                        gqVar.E.M(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.Add));
        addView(imageView, i7.f6.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.m0 m0Var = new org.telegram.ui.ActionBar.m0(this, getContext(), 1);
        this.B = m0Var;
        m0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i13, this.W), 1, -1));
        m0Var.setImageResource(R.drawable.msg_close);
        m0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, this.W), mode));
        m0Var.setAlpha(0.0f);
        m0Var.setScaleX(0.0f);
        m0Var.setScaleY(0.0f);
        m0Var.setScaleType(scaleType);
        m0Var.setVisibility(4);
        m0Var.setOnClickListener(new View.OnClickListener(this) {
            public final gq f27203b;

            {
                this.f27203b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112;
                boolean z12;
                boolean z13;
                int i122 = r2;
                gq gqVar = this.f27203b;
                switch (i122) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        fq fqVar2 = gqVar.f28946a;
                        org.telegram.ui.ActionBar.m0 m0Var2 = gqVar.B;
                        ImageView imageView2 = gqVar.C;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = gqVar.v;
                        if (gqVar.f28956y == null) {
                            int i132 = gqVar.G;
                            if (i132 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.f26357e == 0) {
                                    i112 = 0;
                                    colorPicker$RadioButton2.a(gq.d(colorPicker$RadioButtonArr[0].f26357e));
                                } else {
                                    i112 = 0;
                                }
                                if (gqVar.h) {
                                    fqVar2.s0(colorPicker$RadioButtonArr[i112].f26357e, i112, true);
                                }
                                fqVar2.s0(colorPicker$RadioButtonArr[1].f26357e, 1, true);
                                gqVar.G = 2;
                            } else if (i132 == 2) {
                                gqVar.G = 3;
                                if (colorPicker$RadioButtonArr[2].f26357e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].f26357e, fArr);
                                    float f9 = fArr[0];
                                    if (f9 > 180.0f) {
                                        fArr[0] = f9 - 60.0f;
                                    } else {
                                        fArr[0] = f9 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                fqVar2.s0(colorPicker$RadioButtonArr[2].f26357e, 2, true);
                            } else if (i132 == 3) {
                                gqVar.G = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.f26357e == 0) {
                                    colorPicker$RadioButton3.a(gq.d(colorPicker$RadioButtonArr[2].f26357e));
                                }
                                fqVar2.s0(colorPicker$RadioButtonArr[3].f26357e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (gqVar.G < gqVar.H) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.recaptcha.internal.a.f(gqVar.G, 1, AndroidUtilities.dp(13.0f), (gqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.recaptcha.internal.a.f(gqVar.G, 1, AndroidUtilities.dp(13.0f), (gqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (gqVar.G > 1) {
                                if (m0Var2.getVisibility() != 0) {
                                    m0Var2.setScaleX(0.0f);
                                    m0Var2.setScaleY(0.0f);
                                }
                                m0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(m0Var2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(m0Var2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(m0Var2, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[gqVar.G - 1].callOnClick();
                            gqVar.f28956y = new AnimatorSet();
                            gqVar.g(gqVar.getMeasuredWidth(), arrayList, false);
                            gqVar.f28956y.playTogether(arrayList);
                            gqVar.f28956y.setDuration(180L);
                            gqVar.f28956y.setInterpolator(jr.f29801g);
                            gqVar.f28956y.addListener(new org.telegram.ui.bm(gqVar, 22));
                            gqVar.f28956y.start();
                            return;
                        }
                        return;
                    case 1:
                        fq fqVar3 = gqVar.f28946a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.m0 m0Var22 = gqVar.B;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = gqVar.v;
                        ImageView imageView22 = gqVar.C;
                        if (gqVar.f28956y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i142 = gqVar.G;
                            if (i142 == 2) {
                                gqVar.G = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(m0Var22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(m0Var22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(m0Var22, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i142 == 3) {
                                gqVar.G = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i142 == 4) {
                                gqVar.G = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.x3.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (gqVar.G < gqVar.H) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i15 = gqVar.O;
                            if (i15 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                    colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i17 = gqVar.P;
                            if (i17 >= 0 && i17 < gqVar.O) {
                                colorPicker$RadioButtonArr2[i17].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[gqVar.G - 1].callOnClick();
                            }
                            for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                if (i18 < gqVar.G) {
                                    int i19 = colorPicker$RadioButtonArr2[i18].f26357e;
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    fqVar3.s0(i19, i18, z13);
                                } else {
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    fqVar3.s0(0, i18, z12);
                                }
                            }
                            gqVar.f28956y = new AnimatorSet();
                            gqVar.g(gqVar.getMeasuredWidth(), arrayList2, true);
                            gqVar.f28956y.playTogether(arrayList2);
                            gqVar.f28956y.setDuration(180L);
                            gqVar.f28956y.setInterpolator(jr.f29801g);
                            gqVar.f28956y.addListener(new eq(gqVar));
                            gqVar.f28956y.start();
                            return;
                        }
                        return;
                    case 2:
                        gq.a(gqVar, view);
                        return;
                    default:
                        gqVar.E.M(null, null);
                        return;
                }
            }
        });
        m0Var.setContentDescription(LocaleController.getString(R.string.ClearButton));
        addView(m0Var, i7.f6.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, this.W));
        addView(textView, i7.f6.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new bg.n(13));
        if (z10) {
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, (org.telegram.ui.ActionBar.a0) null, 0, org.telegram.ui.ActionBar.g6.v0(i14, this.W));
            this.E = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            w0Var.e(1, R.drawable.msg_edit, LocaleController.getString(R.string.OpenInEditor));
            w0Var.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareTheme));
            w0Var.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteTheme));
            w0Var.setMenuYOffset(-AndroidUtilities.dp(80.0f));
            w0Var.setSubMenuOpenSide(2);
            w0Var.setDelegate(new u(this, 26));
            w0Var.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
            w0Var.setTranslationX(AndroidUtilities.dp(6.0f));
            w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i13, this.W), 1, -1));
            addView(w0Var, i7.f6.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            w0Var.setOnClickListener(new View.OnClickListener(this) {
                public final gq f27203b;

                {
                    this.f27203b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112;
                    boolean z12;
                    boolean z13;
                    int i122 = r2;
                    gq gqVar = this.f27203b;
                    switch (i122) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            fq fqVar2 = gqVar.f28946a;
                            org.telegram.ui.ActionBar.m0 m0Var2 = gqVar.B;
                            ImageView imageView2 = gqVar.C;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = gqVar.v;
                            if (gqVar.f28956y == null) {
                                int i132 = gqVar.G;
                                if (i132 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.f26357e == 0) {
                                        i112 = 0;
                                        colorPicker$RadioButton2.a(gq.d(colorPicker$RadioButtonArr[0].f26357e));
                                    } else {
                                        i112 = 0;
                                    }
                                    if (gqVar.h) {
                                        fqVar2.s0(colorPicker$RadioButtonArr[i112].f26357e, i112, true);
                                    }
                                    fqVar2.s0(colorPicker$RadioButtonArr[1].f26357e, 1, true);
                                    gqVar.G = 2;
                                } else if (i132 == 2) {
                                    gqVar.G = 3;
                                    if (colorPicker$RadioButtonArr[2].f26357e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].f26357e, fArr);
                                        float f9 = fArr[0];
                                        if (f9 > 180.0f) {
                                            fArr[0] = f9 - 60.0f;
                                        } else {
                                            fArr[0] = f9 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    fqVar2.s0(colorPicker$RadioButtonArr[2].f26357e, 2, true);
                                } else if (i132 == 3) {
                                    gqVar.G = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.f26357e == 0) {
                                        colorPicker$RadioButton3.a(gq.d(colorPicker$RadioButtonArr[2].f26357e));
                                    }
                                    fqVar2.s0(colorPicker$RadioButtonArr[3].f26357e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (gqVar.G < gqVar.H) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.recaptcha.internal.a.f(gqVar.G, 1, AndroidUtilities.dp(13.0f), (gqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.recaptcha.internal.a.f(gqVar.G, 1, AndroidUtilities.dp(13.0f), (gqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                                }
                                if (gqVar.G > 1) {
                                    if (m0Var2.getVisibility() != 0) {
                                        m0Var2.setScaleX(0.0f);
                                        m0Var2.setScaleY(0.0f);
                                    }
                                    m0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(m0Var2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(m0Var2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(m0Var2, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[gqVar.G - 1].callOnClick();
                                gqVar.f28956y = new AnimatorSet();
                                gqVar.g(gqVar.getMeasuredWidth(), arrayList, false);
                                gqVar.f28956y.playTogether(arrayList);
                                gqVar.f28956y.setDuration(180L);
                                gqVar.f28956y.setInterpolator(jr.f29801g);
                                gqVar.f28956y.addListener(new org.telegram.ui.bm(gqVar, 22));
                                gqVar.f28956y.start();
                                return;
                            }
                            return;
                        case 1:
                            fq fqVar3 = gqVar.f28946a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.m0 m0Var22 = gqVar.B;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = gqVar.v;
                            ImageView imageView22 = gqVar.C;
                            if (gqVar.f28956y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i142 = gqVar.G;
                                if (i142 == 2) {
                                    gqVar.G = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(m0Var22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(m0Var22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(m0Var22, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                                } else if (i142 == 3) {
                                    gqVar.G = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i142 == 4) {
                                    gqVar.G = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.x3.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (gqVar.G < gqVar.H) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                                }
                                int i15 = gqVar.O;
                                if (i15 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                    for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                        colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i17 = gqVar.P;
                                if (i17 >= 0 && i17 < gqVar.O) {
                                    colorPicker$RadioButtonArr2[i17].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[gqVar.G - 1].callOnClick();
                                }
                                for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                    if (i18 < gqVar.G) {
                                        int i19 = colorPicker$RadioButtonArr2[i18].f26357e;
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        fqVar3.s0(i19, i18, z13);
                                    } else {
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        fqVar3.s0(0, i18, z12);
                                    }
                                }
                                gqVar.f28956y = new AnimatorSet();
                                gqVar.g(gqVar.getMeasuredWidth(), arrayList2, true);
                                gqVar.f28956y.playTogether(arrayList2);
                                gqVar.f28956y.setDuration(180L);
                                gqVar.f28956y.setInterpolator(jr.f29801g);
                                gqVar.f28956y.addListener(new eq(gqVar));
                                gqVar.f28956y.start();
                                return;
                            }
                            return;
                        case 2:
                            gq.a(gqVar, view);
                            return;
                        default:
                            gqVar.E.M(null, null);
                            return;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(gq gqVar, View view) {
        boolean z10;
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i10 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = gqVar.v;
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
                    gqVar.P = gqVar.O;
                    gqVar.O = i10;
                }
                i10++;
            } else {
                int i11 = colorPicker$RadioButton.f26357e;
                gqVar.setColorInner(i11);
                gqVar.A[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i11)), Byte.valueOf((byte) Color.green(i11)), Byte.valueOf((byte) Color.blue(i11))).toUpperCase());
                return;
            }
        }
    }

    public static int d(int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        float f9 = fArr[1];
        if (f9 > 0.5f) {
            fArr[1] = f9 - 0.15f;
        } else {
            fArr[1] = f9 + 0.15f;
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
        return Math.max(this.U, Math.min(this.J[2], this.V));
    }

    public void setColorInner(int i10) {
        Color.colorToHSV(i10, this.J);
        int G0 = this.f28946a.G0(this.O);
        if (G0 == 0 || G0 != i10) {
            h();
        }
        this.L = null;
        invalidate();
    }

    public final void c(Canvas canvas, int i10, int i11, int i12, boolean z10) {
        float f9;
        float f10;
        float f11;
        if (z10) {
            f9 = 12.0f;
        } else {
            f9 = 16.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        Drawable drawable = this.f28950f;
        drawable.setBounds(i10 - dp, i11 - dp, i10 + dp, dp + i11);
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
        canvas.drawCircle(f12, f13, AndroidUtilities.dp(f10), paint);
        paint.setColor(i12);
        if (z10) {
            f11 = 9.0f;
        } else {
            f11 = 13.0f;
        }
        canvas.drawCircle(f12, f13, AndroidUtilities.dp(f11), paint);
    }

    public final void e(int i10, int i11) {
        if (!this.f28952r) {
            this.f28952r = true;
            if (this.O == i11) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i10)), Byte.valueOf((byte) Color.green(i10)), Byte.valueOf((byte) Color.blue(i10))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.A;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.v[i11].a(i10);
            this.f28952r = false;
        }
        setColorInner(i10);
    }

    public final void f(int i10, int i11, int i12, boolean z10) {
        boolean z11;
        if (i10 != this.F) {
            this.P = 0;
            this.O = 0;
            for (int i13 = 0; i13 < 4; i13++) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.v[i13];
                if (i13 == this.O) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                colorPicker$RadioButton.d = z11;
                colorPicker$RadioButton.b(true);
            }
        }
        this.H = i11;
        this.F = i10;
        this.h = z10;
        this.G = i12;
        ImageView imageView = this.C;
        if (i12 == 1) {
            imageView.setTranslationX(0.0f);
        } else if (i12 == 2) {
            imageView.setTranslationX(AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f));
        } else if (i12 == 3) {
            imageView.setTranslationX(org.telegram.messenger.x3.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.x3.D(13.0f, 3, AndroidUtilities.dp(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.m0 m0Var = this.B;
        org.telegram.ui.ActionBar.w0 w0Var = this.E;
        if (w0Var != null) {
            if (i10 == 1) {
                w0Var.setVisibility(0);
            } else {
                w0Var.setVisibility(8);
                m0Var.setTranslationX(0.0f);
            }
        }
        if (i11 <= 1) {
            imageView.setVisibility(8);
            m0Var.setVisibility(8);
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
                m0Var.setVisibility(0);
                m0Var.setScaleX(1.0f);
                m0Var.setScaleY(1.0f);
                m0Var.setAlpha(1.0f);
            } else {
                m0Var.setVisibility(8);
            }
        }
        this.f28955x.invalidate();
        g(getMeasuredWidth(), null, false);
    }

    public final void g(int i10, ArrayList arrayList, boolean z10) {
        float f9;
        float f10;
        boolean z11;
        float f11;
        int i11 = this.G;
        int D = org.telegram.messenger.x3.D(13.0f, i11 - 1, AndroidUtilities.dp(30.0f) * i11);
        FrameLayout frameLayout = this.f28954w;
        int left = frameLayout.getLeft() + D;
        if (this.F == 1) {
            f9 = 50.0f;
        } else {
            f9 = 0.0f;
        }
        int dp = i10 - AndroidUtilities.dp(f9);
        if (left > dp) {
            f10 = left - dp;
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
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = this.v;
            if (i12 < colorPicker$RadioButtonArr.length) {
                if (colorPicker$RadioButtonArr[i12].getTag(R.id.index_tag) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i14 = this.G;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                Property property4 = View.ALPHA;
                if (i12 < i14) {
                    colorPicker$RadioButtonArr[i12].setVisibility(0);
                    if (arrayList != null) {
                        if (!z11) {
                            f11 = 30.0f;
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property4, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property3, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property2, 1.0f));
                        } else {
                            f11 = 30.0f;
                        }
                        if (!z10 && (z10 || i12 == this.G - 1)) {
                            colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property, i13));
                        }
                    } else {
                        f11 = 30.0f;
                        colorPicker$RadioButtonArr[i12].setVisibility(0);
                        if (this.f28956y == null) {
                            colorPicker$RadioButtonArr[i12].setAlpha(1.0f);
                            colorPicker$RadioButtonArr[i12].setScaleX(1.0f);
                            colorPicker$RadioButtonArr[i12].setScaleY(1.0f);
                        }
                        colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                    }
                    colorPicker$RadioButtonArr[i12].setTag(R.id.index_tag, 1);
                } else {
                    f11 = 30.0f;
                    if (arrayList != null) {
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property4, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property2, 0.0f));
                        }
                    } else {
                        colorPicker$RadioButtonArr[i12].setVisibility(4);
                        if (this.f28956y == null) {
                            colorPicker$RadioButtonArr[i12].setAlpha(0.0f);
                            colorPicker$RadioButtonArr[i12].setScaleX(0.0f);
                            colorPicker$RadioButtonArr[i12].setScaleY(0.0f);
                        }
                    }
                    if (!z10) {
                        colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                    }
                    colorPicker$RadioButtonArr[i12].setTag(R.id.index_tag, null);
                }
                i13 = org.telegram.messenger.x3.C(13.0f, AndroidUtilities.dp(f11), i13);
                i12++;
            } else {
                return;
            }
        }
    }

    public int getColor() {
        float[] fArr = this.J;
        float f9 = fArr[0];
        float[] fArr2 = this.K;
        fArr2[0] = f9;
        fArr2[1] = fArr[1];
        fArr2[2] = getBrightness();
        return (Color.HSVToColor(fArr2) & 16777215) | (-16777216);
    }

    public final void h() {
        float f9;
        float f10;
        org.telegram.ui.ActionBar.m0 m0Var = this.B;
        if (m0Var == null) {
            return;
        }
        if (m0Var.getTag() != null) {
            f9 = 0.0f;
        } else {
            f9 = this.S;
        }
        if (m0Var.getTag() != null) {
            f10 = 1.0f;
        } else {
            f10 = this.T;
        }
        float[] fArr = this.J;
        float f11 = fArr[2];
        if (f9 == 0.0f && f10 == 1.0f) {
            this.U = 0.0f;
            this.V = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f11;
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(HSVToColor);
        float max = Math.max(0.0f, Math.min(f9 / computePerceivedBrightness, 1.0f));
        this.U = max;
        this.V = Math.max(max, Math.min(f10 / computePerceivedBrightness, 1.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f28955x.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        int i10;
        int dp = AndroidUtilities.dp(45.0f);
        float f10 = dp;
        canvas.drawBitmap(this.f28953s, 0.0f, f10, (Paint) null);
        int height = this.f28953s.getHeight() + dp;
        Paint paint = this.f28949e;
        canvas.drawRect(0.0f, f10, getMeasuredWidth(), dp + 1, paint);
        canvas.drawRect(0.0f, height - 1, getMeasuredWidth(), height, paint);
        float[] fArr = this.J;
        float f11 = fArr[0];
        float[] fArr2 = this.K;
        fArr2[0] = f11;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int z10 = (int) com.google.android.recaptcha.internal.a.z(1.0f, fArr[1], this.f28953s.getHeight(), f10);
        if (!this.M) {
            int dp2 = AndroidUtilities.dp(16.0f);
            float interpolation = jr.f29801g.getInterpolation(this.Q);
            if (measuredWidth < dp2) {
                measuredWidth = (int) (((dp2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - dp2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - dp2)) * interpolation));
            }
            if (z10 < dp + dp2) {
                z10 = (int) ((interpolation * (i10 - z10)) + z10);
            } else if (z10 > (this.f28953s.getHeight() + dp) - dp2) {
                z10 = (int) (z10 - (interpolation * (z10 - ((this.f28953s.getHeight() + dp) - dp2))));
            }
        }
        c(canvas, measuredWidth, z10, Color.HSVToColor(fArr2), false);
        RectF rectF = this.f28951n;
        rectF.set(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(26.0f) + height, getMeasuredWidth() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(34.0f) + height);
        LinearGradient linearGradient = this.L;
        Paint paint2 = this.f28948c;
        if (linearGradient == null) {
            fArr2[2] = this.U;
            int HSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.V;
            int HSVToColor2 = Color.HSVToColor(fArr2);
            float f12 = rectF.left;
            float f13 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f12, f13, rectF.right, f13, new int[]{HSVToColor2, HSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.L = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (this.U == this.V) {
            f9 = 0.5f;
        } else {
            float brightness = getBrightness();
            float f14 = this.U;
            f9 = (brightness - f14) / (this.V - f14);
        }
        c(canvas, (int) ((rectF.width() * (1.0f - f9)) + rectF.left), (int) rectF.centerY(), getColor(), true);
        if (!this.M && this.Q < 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.R;
            this.R = elapsedRealtime;
            float f15 = (((float) j10) / 180.0f) + this.Q;
            this.Q = f15;
            if (f15 > 1.0f) {
                this.Q = 1.0f;
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
        if (this.I != i10) {
            this.I = i10;
            int dp = AndroidUtilities.dp(180.0f);
            Bitmap createBitmap = Bitmap.createBitmap(i10, dp, Bitmap.Config.ARGB_8888);
            float f9 = i10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f10 = dp;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, dp / 3, 0.0f, f10, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f9, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.f28947b;
            paint.setShader(composeShader);
            new Canvas(createBitmap).drawRect(0.0f, 0.0f, f9, f10, paint);
            this.f28953s = createBitmap;
            this.L = null;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gq.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setHasChanges(boolean z10) {
        Integer num;
        float f9;
        TextView textView = this.D;
        if (!z10 || textView.getTag() == null) {
            if ((!z10 && textView.getTag() == null) || this.B.getTag() != null) {
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
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, View.ALPHA, f9));
            animatorSet.addListener(new z9(6, this, z10));
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(180L);
            animatorSet.start();
        }
    }

    public void setMaxBrightness(float f9) {
        this.T = f9;
        h();
    }

    public void setMinBrightness(float f9) {
        this.S = f9;
        h();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.W = c6Var;
    }
}
