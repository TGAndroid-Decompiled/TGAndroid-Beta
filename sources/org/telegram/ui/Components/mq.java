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
public class mq extends FrameLayout {
    public static final int f26515e0 = 0;
    public final EditTextBoldCursor[] E;
    public final org.telegram.ui.ActionBar.k0 F;
    public final ImageView G;
    public final TextView H;
    public final org.telegram.ui.ActionBar.v0 I;
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
    public final lq f26516a;
    public float f26517a0;
    public final Paint f26518b;
    public float f26519b0;
    public final Paint f26520c;
    public float f26521c0;
    public final Paint d;
    public org.telegram.ui.ActionBar.f6 f26522d0;
    public final Paint e;
    public final Drawable f26523f;
    public boolean h;
    public final RectF f26524n;
    public boolean f26525r;
    public Bitmap f26526s;
    public final ColorPicker$RadioButton[] v;
    public final FrameLayout f26527w;
    public final ai.d1 f26528x;
    public AnimatorSet f26529y;

    public mq(Context context, boolean z10, lq lqVar) {
        super(context);
        boolean z11;
        this.f26524n = new RectF();
        this.v = new ColorPicker$RadioButton[4];
        this.K = 1;
        this.L = 1;
        this.N = new float[]{0.0f, 0.0f, 1.0f};
        this.O = new float[3];
        this.U = 1.0f;
        this.W = 0.0f;
        this.f26517a0 = 1.0f;
        this.f26519b0 = 0.0f;
        this.f26521c0 = 1.0f;
        this.f26516a = lqVar;
        this.E = new EditTextBoldCursor[2];
        setWillNotDraw(false);
        this.f26523f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        this.d = new Paint(1);
        this.f26518b = new Paint(5);
        this.f26520c = new Paint(5);
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        ai.d1 d1Var = new ai.d1(this, context);
        this.f26528x = d1Var;
        d1Var.setOrientation(0);
        addView(d1Var, w7.y5.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        d1Var.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26527w = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, w7.y5.d(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        for (int i10 = 0; i10 < 4; i10++) {
            this.v[i10] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.v[i10];
            if (this.S == i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            colorPicker$RadioButton.d = z11;
            colorPicker$RadioButton.b(false);
            this.f26527w.addView(this.v[i10], w7.y5.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.v[i10].setOnClickListener(new View.OnClickListener(this) {
                public final mq f24865b;

                {
                    this.f24865b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    boolean z12;
                    boolean z13;
                    int i12 = r2;
                    mq mqVar = this.f24865b;
                    switch (i12) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            lq lqVar2 = mqVar.f26516a;
                            org.telegram.ui.ActionBar.k0 k0Var = mqVar.F;
                            ImageView imageView = mqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = mqVar.v;
                            if (mqVar.f26529y == null) {
                                int i13 = mqVar.K;
                                if (i13 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i11 = 0;
                                        colorPicker$RadioButton2.a(mq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i11 = 0;
                                    }
                                    if (mqVar.h) {
                                        lqVar2.v0(colorPicker$RadioButtonArr[i11].e, i11, true);
                                    }
                                    lqVar2.v0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    mqVar.K = 2;
                                } else if (i13 == 2) {
                                    mqVar.K = 3;
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
                                    lqVar2.v0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i13 == 3) {
                                    mqVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(mq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    lqVar2.v0(colorPicker$RadioButtonArr[3].e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (mqVar.K < mqVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, hg.k0.f(mqVar.K, 1, AndroidUtilities.dp(13.0f), (mqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, hg.k0.f(mqVar.K, 1, AndroidUtilities.dp(13.0f), (mqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 0.0f));
                                }
                                if (mqVar.K > 1) {
                                    if (k0Var.getVisibility() != 0) {
                                        k0Var.setScaleX(0.0f);
                                        k0Var.setScaleY(0.0f);
                                    }
                                    k0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[mqVar.K - 1].callOnClick();
                                mqVar.f26529y = new AnimatorSet();
                                mqVar.g(mqVar.getMeasuredWidth(), arrayList, false);
                                mqVar.f26529y.playTogether(arrayList);
                                mqVar.f26529y.setDuration(180L);
                                mqVar.f26529y.setInterpolator(qr.f27654g);
                                mqVar.f26529y.addListener(new q8(mqVar, 14));
                                mqVar.f26529y.start();
                                return;
                            }
                            return;
                        case 1:
                            lq lqVar3 = mqVar.f26516a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.k0 k0Var2 = mqVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = mqVar.v;
                            ImageView imageView2 = mqVar.G;
                            if (mqVar.f26529y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i14 = mqVar.K;
                                if (i14 == 2) {
                                    mqVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var2, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, 0.0f));
                                } else if (i14 == 3) {
                                    mqVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i14 == 4) {
                                    mqVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, org.telegram.messenger.l0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (mqVar.K < mqVar.L) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 0.0f));
                                }
                                int i15 = mqVar.S;
                                if (i15 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                    for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                        colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i17 = mqVar.T;
                                if (i17 >= 0 && i17 < mqVar.S) {
                                    colorPicker$RadioButtonArr2[i17].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[mqVar.K - 1].callOnClick();
                                }
                                for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                    if (i18 < mqVar.K) {
                                        int i19 = colorPicker$RadioButtonArr2[i18].e;
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        lqVar3.v0(i19, i18, z13);
                                    } else {
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        lqVar3.v0(0, i18, z12);
                                    }
                                }
                                mqVar.f26529y = new AnimatorSet();
                                mqVar.g(mqVar.getMeasuredWidth(), arrayList2, true);
                                mqVar.f26529y.playTogether(arrayList2);
                                mqVar.f26529y.setDuration(180L);
                                mqVar.f26529y.setInterpolator(qr.f27654g);
                                mqVar.f26529y.addListener(new kq(mqVar));
                                mqVar.f26529y.start();
                                return;
                            }
                            return;
                        case 2:
                            mq.a(mqVar, view);
                            return;
                        default:
                            mqVar.I.M(null, null);
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
                editTextBoldCursorArr[i11] = new iq(this, context, i11, 0);
                this.E[i11].setBackgroundDrawable(null);
                this.E[i11].setText("#");
                this.E[i11].setEnabled(false);
                this.E[i11].setFocusable(false);
                this.E[i11].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.f26528x.addView(this.E[i11], w7.y5.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i11] = new iq(this, context, i11, 1);
                this.E[i11].setBackgroundDrawable(null);
                this.E[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.E[i11].setHint("8BC6ED");
                this.E[i11].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.f26528x.addView(this.E[i11], w7.y5.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.E[i11].addTextChangedListener(new jq(this, i11));
                this.E[i11].setOnEditorActionListener(new r2(1));
            }
            this.E[i11].setTextSize(1, 16.0f);
            this.E[i11].setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, this.f26522d0));
            EditTextBoldCursor editTextBoldCursor = this.E[i11];
            int i12 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f26522d0));
            this.E[i11].setCursorColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f26522d0));
            this.E[i11].setCursorSize(AndroidUtilities.dp(18.0f));
            this.E[i11].setCursorWidth(1.5f);
            this.E[i11].setSingleLine(true);
            this.E[i11].setGravity(19);
            this.E[i11].setHeaderHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, this.f26522d0));
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
        int i13 = org.telegram.ui.ActionBar.j6.I5;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i13, this.f26522d0), 1, -1));
        imageView.setImageResource(R.drawable.msg_add);
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i14, this.f26522d0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final mq f24865b;

            {
                this.f24865b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112;
                boolean z12;
                boolean z13;
                int i122 = r2;
                mq mqVar = this.f24865b;
                switch (i122) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        lq lqVar2 = mqVar.f26516a;
                        org.telegram.ui.ActionBar.k0 k0Var = mqVar.F;
                        ImageView imageView2 = mqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = mqVar.v;
                        if (mqVar.f26529y == null) {
                            int i132 = mqVar.K;
                            if (i132 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i112 = 0;
                                    colorPicker$RadioButton2.a(mq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i112 = 0;
                                }
                                if (mqVar.h) {
                                    lqVar2.v0(colorPicker$RadioButtonArr[i112].e, i112, true);
                                }
                                lqVar2.v0(colorPicker$RadioButtonArr[1].e, 1, true);
                                mqVar.K = 2;
                            } else if (i132 == 2) {
                                mqVar.K = 3;
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
                                lqVar2.v0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i132 == 3) {
                                mqVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(mq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                lqVar2.v0(colorPicker$RadioButtonArr[3].e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (mqVar.K < mqVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, hg.k0.f(mqVar.K, 1, AndroidUtilities.dp(13.0f), (mqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, hg.k0.f(mqVar.K, 1, AndroidUtilities.dp(13.0f), (mqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (mqVar.K > 1) {
                                if (k0Var.getVisibility() != 0) {
                                    k0Var.setScaleX(0.0f);
                                    k0Var.setScaleY(0.0f);
                                }
                                k0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(k0Var, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(k0Var, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(k0Var, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[mqVar.K - 1].callOnClick();
                            mqVar.f26529y = new AnimatorSet();
                            mqVar.g(mqVar.getMeasuredWidth(), arrayList, false);
                            mqVar.f26529y.playTogether(arrayList);
                            mqVar.f26529y.setDuration(180L);
                            mqVar.f26529y.setInterpolator(qr.f27654g);
                            mqVar.f26529y.addListener(new q8(mqVar, 14));
                            mqVar.f26529y.start();
                            return;
                        }
                        return;
                    case 1:
                        lq lqVar3 = mqVar.f26516a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.k0 k0Var2 = mqVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = mqVar.v;
                        ImageView imageView22 = mqVar.G;
                        if (mqVar.f26529y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i142 = mqVar.K;
                            if (i142 == 2) {
                                mqVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var2, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var2, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var2, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i142 == 3) {
                                mqVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i142 == 4) {
                                mqVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.l0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (mqVar.K < mqVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i15 = mqVar.S;
                            if (i15 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                    colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i17 = mqVar.T;
                            if (i17 >= 0 && i17 < mqVar.S) {
                                colorPicker$RadioButtonArr2[i17].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[mqVar.K - 1].callOnClick();
                            }
                            for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                if (i18 < mqVar.K) {
                                    int i19 = colorPicker$RadioButtonArr2[i18].e;
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    lqVar3.v0(i19, i18, z13);
                                } else {
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    lqVar3.v0(0, i18, z12);
                                }
                            }
                            mqVar.f26529y = new AnimatorSet();
                            mqVar.g(mqVar.getMeasuredWidth(), arrayList2, true);
                            mqVar.f26529y.playTogether(arrayList2);
                            mqVar.f26529y.setDuration(180L);
                            mqVar.f26529y.setInterpolator(qr.f27654g);
                            mqVar.f26529y.addListener(new kq(mqVar));
                            mqVar.f26529y.start();
                            return;
                        }
                        return;
                    case 2:
                        mq.a(mqVar, view);
                        return;
                    default:
                        mqVar.I.M(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.Add));
        addView(imageView, w7.y5.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k0 k0Var = new org.telegram.ui.ActionBar.k0(this, getContext(), 1);
        this.F = k0Var;
        k0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i13, this.f26522d0), 1, -1));
        k0Var.setImageResource(R.drawable.msg_close);
        k0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, this.f26522d0), mode));
        k0Var.setAlpha(0.0f);
        k0Var.setScaleX(0.0f);
        k0Var.setScaleY(0.0f);
        k0Var.setScaleType(scaleType);
        k0Var.setVisibility(4);
        k0Var.setOnClickListener(new View.OnClickListener(this) {
            public final mq f24865b;

            {
                this.f24865b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112;
                boolean z12;
                boolean z13;
                int i122 = r2;
                mq mqVar = this.f24865b;
                switch (i122) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        lq lqVar2 = mqVar.f26516a;
                        org.telegram.ui.ActionBar.k0 k0Var2 = mqVar.F;
                        ImageView imageView2 = mqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = mqVar.v;
                        if (mqVar.f26529y == null) {
                            int i132 = mqVar.K;
                            if (i132 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i112 = 0;
                                    colorPicker$RadioButton2.a(mq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i112 = 0;
                                }
                                if (mqVar.h) {
                                    lqVar2.v0(colorPicker$RadioButtonArr[i112].e, i112, true);
                                }
                                lqVar2.v0(colorPicker$RadioButtonArr[1].e, 1, true);
                                mqVar.K = 2;
                            } else if (i132 == 2) {
                                mqVar.K = 3;
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
                                lqVar2.v0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i132 == 3) {
                                mqVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(mq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                lqVar2.v0(colorPicker$RadioButtonArr[3].e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (mqVar.K < mqVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, hg.k0.f(mqVar.K, 1, AndroidUtilities.dp(13.0f), (mqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, hg.k0.f(mqVar.K, 1, AndroidUtilities.dp(13.0f), (mqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (mqVar.K > 1) {
                                if (k0Var2.getVisibility() != 0) {
                                    k0Var2.setScaleX(0.0f);
                                    k0Var2.setScaleY(0.0f);
                                }
                                k0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(k0Var2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(k0Var2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(k0Var2, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[mqVar.K - 1].callOnClick();
                            mqVar.f26529y = new AnimatorSet();
                            mqVar.g(mqVar.getMeasuredWidth(), arrayList, false);
                            mqVar.f26529y.playTogether(arrayList);
                            mqVar.f26529y.setDuration(180L);
                            mqVar.f26529y.setInterpolator(qr.f27654g);
                            mqVar.f26529y.addListener(new q8(mqVar, 14));
                            mqVar.f26529y.start();
                            return;
                        }
                        return;
                    case 1:
                        lq lqVar3 = mqVar.f26516a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.k0 k0Var22 = mqVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = mqVar.v;
                        ImageView imageView22 = mqVar.G;
                        if (mqVar.f26529y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i142 = mqVar.K;
                            if (i142 == 2) {
                                mqVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var22, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i142 == 3) {
                                mqVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i142 == 4) {
                                mqVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.l0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (mqVar.K < mqVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i15 = mqVar.S;
                            if (i15 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                    colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i17 = mqVar.T;
                            if (i17 >= 0 && i17 < mqVar.S) {
                                colorPicker$RadioButtonArr2[i17].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[mqVar.K - 1].callOnClick();
                            }
                            for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                if (i18 < mqVar.K) {
                                    int i19 = colorPicker$RadioButtonArr2[i18].e;
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    lqVar3.v0(i19, i18, z13);
                                } else {
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    lqVar3.v0(0, i18, z12);
                                }
                            }
                            mqVar.f26529y = new AnimatorSet();
                            mqVar.g(mqVar.getMeasuredWidth(), arrayList2, true);
                            mqVar.f26529y.playTogether(arrayList2);
                            mqVar.f26529y.setDuration(180L);
                            mqVar.f26529y.setInterpolator(qr.f27654g);
                            mqVar.f26529y.addListener(new kq(mqVar));
                            mqVar.f26529y.start();
                            return;
                        }
                        return;
                    case 2:
                        mq.a(mqVar, view);
                        return;
                    default:
                        mqVar.I.M(null, null);
                        return;
                }
            }
        });
        k0Var.setContentDescription(LocaleController.getString(R.string.ClearButton));
        addView(k0Var, w7.y5.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.H = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, this.f26522d0));
        addView(textView, w7.y5.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new ai.e2(9));
        if (z10) {
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.v0(i14, this.f26522d0));
            this.I = v0Var;
            v0Var.setLongClickEnabled(false);
            v0Var.setIcon(R.drawable.ic_ab_other);
            v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            v0Var.e(1, R.drawable.msg_edit, LocaleController.getString(R.string.OpenInEditor));
            v0Var.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareTheme));
            v0Var.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteTheme));
            v0Var.setMenuYOffset(-AndroidUtilities.dp(80.0f));
            v0Var.setSubMenuOpenSide(2);
            v0Var.setDelegate(new s(this, 26));
            v0Var.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
            v0Var.setTranslationX(AndroidUtilities.dp(6.0f));
            v0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i13, this.f26522d0), 1, -1));
            addView(v0Var, w7.y5.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            v0Var.setOnClickListener(new View.OnClickListener(this) {
                public final mq f24865b;

                {
                    this.f24865b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112;
                    boolean z12;
                    boolean z13;
                    int i122 = r2;
                    mq mqVar = this.f24865b;
                    switch (i122) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            lq lqVar2 = mqVar.f26516a;
                            org.telegram.ui.ActionBar.k0 k0Var2 = mqVar.F;
                            ImageView imageView2 = mqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = mqVar.v;
                            if (mqVar.f26529y == null) {
                                int i132 = mqVar.K;
                                if (i132 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i112 = 0;
                                        colorPicker$RadioButton2.a(mq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i112 = 0;
                                    }
                                    if (mqVar.h) {
                                        lqVar2.v0(colorPicker$RadioButtonArr[i112].e, i112, true);
                                    }
                                    lqVar2.v0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    mqVar.K = 2;
                                } else if (i132 == 2) {
                                    mqVar.K = 3;
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
                                    lqVar2.v0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i132 == 3) {
                                    mqVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(mq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    lqVar2.v0(colorPicker$RadioButtonArr[3].e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (mqVar.K < mqVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, hg.k0.f(mqVar.K, 1, AndroidUtilities.dp(13.0f), (mqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, hg.k0.f(mqVar.K, 1, AndroidUtilities.dp(13.0f), (mqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                                }
                                if (mqVar.K > 1) {
                                    if (k0Var2.getVisibility() != 0) {
                                        k0Var2.setScaleX(0.0f);
                                        k0Var2.setScaleY(0.0f);
                                    }
                                    k0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var2, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[mqVar.K - 1].callOnClick();
                                mqVar.f26529y = new AnimatorSet();
                                mqVar.g(mqVar.getMeasuredWidth(), arrayList, false);
                                mqVar.f26529y.playTogether(arrayList);
                                mqVar.f26529y.setDuration(180L);
                                mqVar.f26529y.setInterpolator(qr.f27654g);
                                mqVar.f26529y.addListener(new q8(mqVar, 14));
                                mqVar.f26529y.start();
                                return;
                            }
                            return;
                        case 1:
                            lq lqVar3 = mqVar.f26516a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.k0 k0Var22 = mqVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = mqVar.v;
                            ImageView imageView22 = mqVar.G;
                            if (mqVar.f26529y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i142 = mqVar.K;
                                if (i142 == 2) {
                                    mqVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var22, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                                } else if (i142 == 3) {
                                    mqVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i142 == 4) {
                                    mqVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.l0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (mqVar.K < mqVar.L) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                                }
                                int i15 = mqVar.S;
                                if (i15 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                    for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                        colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i17 = mqVar.T;
                                if (i17 >= 0 && i17 < mqVar.S) {
                                    colorPicker$RadioButtonArr2[i17].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[mqVar.K - 1].callOnClick();
                                }
                                for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                    if (i18 < mqVar.K) {
                                        int i19 = colorPicker$RadioButtonArr2[i18].e;
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        lqVar3.v0(i19, i18, z13);
                                    } else {
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        lqVar3.v0(0, i18, z12);
                                    }
                                }
                                mqVar.f26529y = new AnimatorSet();
                                mqVar.g(mqVar.getMeasuredWidth(), arrayList2, true);
                                mqVar.f26529y.playTogether(arrayList2);
                                mqVar.f26529y.setDuration(180L);
                                mqVar.f26529y.setInterpolator(qr.f27654g);
                                mqVar.f26529y.addListener(new kq(mqVar));
                                mqVar.f26529y.start();
                                return;
                            }
                            return;
                        case 2:
                            mq.a(mqVar, view);
                            return;
                        default:
                            mqVar.I.M(null, null);
                            return;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(mq mqVar, View view) {
        boolean z10;
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i10 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = mqVar.v;
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
                    mqVar.T = mqVar.S;
                    mqVar.S = i10;
                }
                i10++;
            } else {
                int i11 = colorPicker$RadioButton.e;
                mqVar.setColorInner(i11);
                mqVar.E[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i11)), Byte.valueOf((byte) Color.green(i11)), Byte.valueOf((byte) Color.blue(i11))).toUpperCase());
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
        return Math.max(this.f26519b0, Math.min(this.N[2], this.f26521c0));
    }

    public void setColorInner(int i10) {
        Color.colorToHSV(i10, this.N);
        int K0 = this.f26516a.K0(this.S);
        if (K0 == 0 || K0 != i10) {
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
        int dp = AndroidUtilities.dp(f7);
        Drawable drawable = this.f26523f;
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
        if (!this.f26525r) {
            this.f26525r = true;
            if (this.S == i11) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i10)), Byte.valueOf((byte) Color.green(i10)), Byte.valueOf((byte) Color.blue(i10))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.E;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.v[i11].a(i10);
            this.f26525r = false;
        }
        setColorInner(i10);
    }

    public final void f(int i10, int i11, int i12, boolean z10) {
        boolean z11;
        if (i10 != this.J) {
            this.T = 0;
            this.S = 0;
            for (int i13 = 0; i13 < 4; i13++) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.v[i13];
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
            imageView.setTranslationX(AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f));
        } else if (i12 == 3) {
            imageView.setTranslationX(org.telegram.messenger.l0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.l0.D(13.0f, 3, AndroidUtilities.dp(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.k0 k0Var = this.F;
        org.telegram.ui.ActionBar.v0 v0Var = this.I;
        if (v0Var != null) {
            if (i10 == 1) {
                v0Var.setVisibility(0);
            } else {
                v0Var.setVisibility(8);
                k0Var.setTranslationX(0.0f);
            }
        }
        if (i11 <= 1) {
            imageView.setVisibility(8);
            k0Var.setVisibility(8);
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
                k0Var.setVisibility(0);
                k0Var.setScaleX(1.0f);
                k0Var.setScaleY(1.0f);
                k0Var.setAlpha(1.0f);
            } else {
                k0Var.setVisibility(8);
            }
        }
        this.f26528x.invalidate();
        g(getMeasuredWidth(), null, false);
    }

    public final void g(int i10, ArrayList arrayList, boolean z10) {
        float f7;
        float f10;
        boolean z11;
        float f11;
        int i11 = this.K;
        int D = org.telegram.messenger.l0.D(13.0f, i11 - 1, AndroidUtilities.dp(30.0f) * i11);
        FrameLayout frameLayout = this.f26527w;
        int left = frameLayout.getLeft() + D;
        if (this.J == 1) {
            f7 = 50.0f;
        } else {
            f7 = 0.0f;
        }
        int dp = i10 - AndroidUtilities.dp(f7);
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
                int i14 = this.K;
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
                        if (!z10 && (z10 || i12 == this.K - 1)) {
                            colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property, i13));
                        }
                    } else {
                        f11 = 30.0f;
                        colorPicker$RadioButtonArr[i12].setVisibility(0);
                        if (this.f26529y == null) {
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
                        if (this.f26529y == null) {
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
                i13 = org.telegram.messenger.l0.C(13.0f, AndroidUtilities.dp(f11), i13);
                i12++;
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
        org.telegram.ui.ActionBar.k0 k0Var = this.F;
        if (k0Var == null) {
            return;
        }
        if (k0Var.getTag() != null) {
            f7 = 0.0f;
        } else {
            f7 = this.W;
        }
        if (k0Var.getTag() != null) {
            f10 = 1.0f;
        } else {
            f10 = this.f26517a0;
        }
        float[] fArr = this.N;
        float f11 = fArr[2];
        if (f7 == 0.0f && f10 == 1.0f) {
            this.f26519b0 = 0.0f;
            this.f26521c0 = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f11;
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(HSVToColor);
        float max = Math.max(0.0f, Math.min(f7 / computePerceivedBrightness, 1.0f));
        this.f26519b0 = max;
        this.f26521c0 = Math.max(max, Math.min(f10 / computePerceivedBrightness, 1.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f26528x.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        int i10;
        int dp = AndroidUtilities.dp(45.0f);
        float f10 = dp;
        canvas.drawBitmap(this.f26526s, 0.0f, f10, (Paint) null);
        int height = this.f26526s.getHeight() + dp;
        Paint paint = this.e;
        canvas.drawRect(0.0f, f10, getMeasuredWidth(), dp + 1, paint);
        canvas.drawRect(0.0f, height - 1, getMeasuredWidth(), height, paint);
        float[] fArr = this.N;
        float f11 = fArr[0];
        float[] fArr2 = this.O;
        fArr2[0] = f11;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, fArr[1], this.f26526s.getHeight(), f10);
        if (!this.Q) {
            int dp2 = AndroidUtilities.dp(16.0f);
            float interpolation = qr.f27654g.getInterpolation(this.U);
            if (measuredWidth < dp2) {
                measuredWidth = (int) (((dp2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - dp2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - dp2)) * interpolation));
            }
            if (z10 < dp + dp2) {
                z10 = (int) ((interpolation * (i10 - z10)) + z10);
            } else if (z10 > (this.f26526s.getHeight() + dp) - dp2) {
                z10 = (int) (z10 - (interpolation * (z10 - ((this.f26526s.getHeight() + dp) - dp2))));
            }
        }
        c(canvas, measuredWidth, z10, Color.HSVToColor(fArr2), false);
        RectF rectF = this.f26524n;
        rectF.set(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(26.0f) + height, getMeasuredWidth() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(34.0f) + height);
        LinearGradient linearGradient = this.P;
        Paint paint2 = this.f26520c;
        if (linearGradient == null) {
            fArr2[2] = this.f26519b0;
            int HSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.f26521c0;
            int HSVToColor2 = Color.HSVToColor(fArr2);
            float f12 = rectF.left;
            float f13 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f12, f13, rectF.right, f13, new int[]{HSVToColor2, HSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.P = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (this.f26519b0 == this.f26521c0) {
            f7 = 0.5f;
        } else {
            float brightness = getBrightness();
            float f14 = this.f26519b0;
            f7 = (brightness - f14) / (this.f26521c0 - f14);
        }
        c(canvas, (int) ((rectF.width() * (1.0f - f7)) + rectF.left), (int) rectF.centerY(), getColor(), true);
        if (!this.Q && this.U < 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.V;
            this.V = elapsedRealtime;
            float f15 = (((float) j3) / 180.0f) + this.U;
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
            int dp = AndroidUtilities.dp(180.0f);
            Bitmap createBitmap = Bitmap.createBitmap(i10, dp, Bitmap.Config.ARGB_8888);
            float f7 = i10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f10 = dp;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, dp / 3, 0.0f, f10, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.f26518b;
            paint.setShader(composeShader);
            new Canvas(createBitmap).drawRect(0.0f, 0.0f, f7, f10, paint);
            this.f26526s = createBitmap;
            this.P = null;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mq.onTouchEvent(android.view.MotionEvent):boolean");
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
            animatorSet.addListener(new ba(6, this, z10));
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(180L);
            animatorSet.start();
        }
    }

    public void setMaxBrightness(float f7) {
        this.f26517a0 = f7;
        h();
    }

    public void setMinBrightness(float f7) {
        this.W = f7;
        h();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f26522d0 = f6Var;
    }
}
