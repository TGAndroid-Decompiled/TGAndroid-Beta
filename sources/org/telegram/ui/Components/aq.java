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

public class aq extends FrameLayout {

    public static final int f26794a0 = 0;
    public final EditTextBoldCursor[] A;
    public final org.telegram.ui.ActionBar.l0 B;
    public final ImageView C;
    public final TextView D;
    public final org.telegram.ui.ActionBar.v0 E;
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

    public final zp f26795a;

    public final Paint f26796b;

    public final Paint f26797c;
    public final Paint d;

    public final Paint f26798e;

    public final Drawable f26799f;
    public boolean h;

    public final RectF f26800n;

    public boolean f26801r;

    public Bitmap f26802s;
    public final ColorPicker$RadioButton[] v;

    public final FrameLayout f26803w;

    public final hh.w9 f26804x;

    public AnimatorSet f26805y;

    public aq(Context context, boolean z10, zp zpVar) {
        super(context);
        this.f26800n = new RectF();
        this.v = new ColorPicker$RadioButton[4];
        final int i10 = 1;
        this.G = 1;
        this.H = 1;
        final int i11 = 3;
        this.J = new float[]{0.0f, 0.0f, 1.0f};
        this.K = new float[3];
        this.Q = 1.0f;
        this.S = 0.0f;
        this.T = 1.0f;
        this.U = 0.0f;
        this.V = 1.0f;
        this.f26795a = zpVar;
        final int i12 = 2;
        this.A = new EditTextBoldCursor[2];
        final int i13 = 0;
        setWillNotDraw(false);
        this.f26799f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        this.d = new Paint(1);
        this.f26796b = new Paint(5);
        this.f26797c = new Paint(5);
        Paint paint = new Paint();
        this.f26798e = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        hh.w9 w9Var = new hh.w9(this, context);
        this.f26804x = w9Var;
        w9Var.setOrientation(0);
        addView(w9Var, h7.z5.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        w9Var.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26803w = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, h7.z5.d(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        int i14 = 0;
        while (i14 < 4) {
            this.v[i14] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.v[i14];
            colorPicker$RadioButton.d = this.O == i14;
            colorPicker$RadioButton.b(false);
            this.f26803w.addView(this.v[i14], h7.z5.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.v[i14].setOnClickListener(new View.OnClickListener(this) {

                public final aq f34022b;

                {
                    this.f34022b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i15;
                    int i16 = i12;
                    aq aqVar = this.f34022b;
                    switch (i16) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            zp zpVar2 = aqVar.f26795a;
                            org.telegram.ui.ActionBar.l0 l0Var = aqVar.B;
                            ImageView imageView = aqVar.C;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = aqVar.v;
                            if (aqVar.f26805y == null) {
                                int i17 = aqVar.G;
                                if (i17 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.f26342e == 0) {
                                        i15 = 0;
                                        colorPicker$RadioButton2.a(aq.d(colorPicker$RadioButtonArr[0].f26342e));
                                    } else {
                                        i15 = 0;
                                    }
                                    if (aqVar.h) {
                                        zpVar2.n0(colorPicker$RadioButtonArr[i15].f26342e, i15, true);
                                    }
                                    zpVar2.n0(colorPicker$RadioButtonArr[1].f26342e, 1, true);
                                    aqVar.G = 2;
                                } else if (i17 == 2) {
                                    aqVar.G = 3;
                                    if (colorPicker$RadioButtonArr[2].f26342e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].f26342e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    zpVar2.n0(colorPicker$RadioButtonArr[2].f26342e, 2, true);
                                } else if (i17 == 3) {
                                    aqVar.G = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.f26342e == 0) {
                                        colorPicker$RadioButton3.a(aq.d(colorPicker$RadioButtonArr[2].f26342e));
                                    }
                                    zpVar2.n0(colorPicker$RadioButtonArr[3].f26342e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (aqVar.G < aqVar.H) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (aqVar.G > 1) {
                                    if (l0Var.getVisibility() != 0) {
                                        l0Var.setScaleX(0.0f);
                                        l0Var.setScaleY(0.0f);
                                    }
                                    l0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[aqVar.G - 1].callOnClick();
                                aqVar.f26805y = new AnimatorSet();
                                aqVar.g(aqVar.getMeasuredWidth(), arrayList, false);
                                aqVar.f26805y.playTogether(arrayList);
                                aqVar.f26805y.setDuration(180L);
                                aqVar.f26805y.setInterpolator(er.f28123g);
                                aqVar.f26805y.addListener(new org.telegram.ui.am(aqVar, 22));
                                aqVar.f26805y.start();
                                break;
                            }
                            break;
                        case 1:
                            zp zpVar3 = aqVar.f26795a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.l0 l0Var2 = aqVar.B;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = aqVar.v;
                            ImageView imageView2 = aqVar.C;
                            if (aqVar.f26805y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i18 = aqVar.G;
                                if (i18 == 2) {
                                    aqVar.G = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i18 == 3) {
                                    aqVar.G = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i18 == 4) {
                                    aqVar.G = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, org.telegram.messenger.y1.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                }
                                if (aqVar.G < aqVar.H) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i19 = aqVar.O;
                                if (i19 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i19];
                                    for (int i20 = i19 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                        colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i21 = aqVar.P;
                                if (i21 < 0 || i21 >= aqVar.O) {
                                    colorPicker$RadioButtonArr2[aqVar.G - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i21].callOnClick();
                                }
                                int i22 = 0;
                                while (i22 < colorPicker$RadioButtonArr2.length) {
                                    if (i22 < aqVar.G) {
                                        zpVar3.n0(colorPicker$RadioButtonArr2[i22].f26342e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        zpVar3.n0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i22++;
                                }
                                aqVar.f26805y = new AnimatorSet();
                                aqVar.g(aqVar.getMeasuredWidth(), arrayList2, true);
                                aqVar.f26805y.playTogether(arrayList2);
                                aqVar.f26805y.setDuration(180L);
                                aqVar.f26805y.setInterpolator(er.f28123g);
                                aqVar.f26805y.addListener(new yp(aqVar));
                                aqVar.f26805y.start();
                                break;
                            }
                            break;
                        case 2:
                            aq.a(aqVar, view);
                            break;
                        default:
                            aqVar.E.M(null, null);
                            break;
                    }
                }
            });
            i14++;
        }
        int i15 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.A;
            if (i15 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i15 % 2 == 0) {
                editTextBoldCursorArr[i15] = new wp(this, context, i15, i13);
                this.A[i15].setBackgroundDrawable(null);
                this.A[i15].setText("#");
                this.A[i15].setEnabled(false);
                this.A[i15].setFocusable(false);
                this.A[i15].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.f26804x.addView(this.A[i15], h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i15] = new wp(this, context, i15, i10);
                this.A[i15].setBackgroundDrawable(null);
                this.A[i15].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.A[i15].setHint("8BC6ED");
                this.A[i15].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.f26804x.addView(this.A[i15], h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.A[i15].addTextChangedListener(new xp(this, i15));
                this.A[i15].setOnEditorActionListener(new o2(i10));
            }
            this.A[i15].setTextSize(1, 16.0f);
            this.A[i15].setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, this.W));
            EditTextBoldCursor editTextBoldCursor = this.A[i15];
            int i16 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, this.W));
            this.A[i15].setCursorColor(org.telegram.ui.ActionBar.g6.v0(i16, this.W));
            this.A[i15].setCursorSize(AndroidUtilities.dp(18.0f));
            this.A[i15].setCursorWidth(1.5f);
            this.A[i15].setSingleLine(true);
            this.A[i15].setGravity(19);
            this.A[i15].setHeaderHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, this.W));
            this.A[i15].setTransformHintToHeader(true);
            this.A[i15].setInputType(524416);
            this.A[i15].setImeOptions(268435462);
            if (i15 == 1) {
                this.A[i15].requestFocus();
            } else if (i15 == 2 || i15 == 3) {
                this.A[i15].setVisibility(8);
            }
            i15++;
        }
        ImageView imageView = new ImageView(getContext());
        this.C = imageView;
        int i17 = org.telegram.ui.ActionBar.g6.I5;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i17, this.W), 1, -1));
        imageView.setImageResource(R.drawable.msg_add);
        int i18 = org.telegram.ui.ActionBar.g6.G6;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i18, this.W);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(iV0, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final aq f34022b;

            {
                this.f34022b = this;
            }

            @Override
            public final void onClick(View view) {
                int i19;
                int i110 = i13;
                aq aqVar = this.f34022b;
                switch (i110) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        zp zpVar2 = aqVar.f26795a;
                        org.telegram.ui.ActionBar.l0 l0Var = aqVar.B;
                        ImageView imageView2 = aqVar.C;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = aqVar.v;
                        if (aqVar.f26805y == null) {
                            int i111 = aqVar.G;
                            if (i111 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.f26342e == 0) {
                                    i19 = 0;
                                    colorPicker$RadioButton2.a(aq.d(colorPicker$RadioButtonArr[0].f26342e));
                                } else {
                                    i19 = 0;
                                }
                                if (aqVar.h) {
                                    zpVar2.n0(colorPicker$RadioButtonArr[i19].f26342e, i19, true);
                                }
                                zpVar2.n0(colorPicker$RadioButtonArr[1].f26342e, 1, true);
                                aqVar.G = 2;
                            } else if (i111 == 2) {
                                aqVar.G = 3;
                                if (colorPicker$RadioButtonArr[2].f26342e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].f26342e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                zpVar2.n0(colorPicker$RadioButtonArr[2].f26342e, 2, true);
                            } else if (i111 == 3) {
                                aqVar.G = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.f26342e == 0) {
                                    colorPicker$RadioButton3.a(aq.d(colorPicker$RadioButtonArr[2].f26342e));
                                }
                                zpVar2.n0(colorPicker$RadioButtonArr[3].f26342e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (aqVar.G < aqVar.H) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (aqVar.G > 1) {
                                if (l0Var.getVisibility() != 0) {
                                    l0Var.setScaleX(0.0f);
                                    l0Var.setScaleY(0.0f);
                                }
                                l0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[aqVar.G - 1].callOnClick();
                            aqVar.f26805y = new AnimatorSet();
                            aqVar.g(aqVar.getMeasuredWidth(), arrayList, false);
                            aqVar.f26805y.playTogether(arrayList);
                            aqVar.f26805y.setDuration(180L);
                            aqVar.f26805y.setInterpolator(er.f28123g);
                            aqVar.f26805y.addListener(new org.telegram.ui.am(aqVar, 22));
                            aqVar.f26805y.start();
                            break;
                        }
                        break;
                    case 1:
                        zp zpVar3 = aqVar.f26795a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.l0 l0Var2 = aqVar.B;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = aqVar.v;
                        ImageView imageView3 = aqVar.C;
                        if (aqVar.f26805y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i112 = aqVar.G;
                            if (i112 == 2) {
                                aqVar.G = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i112 == 3) {
                                aqVar.G = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i112 == 4) {
                                aqVar.G = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, org.telegram.messenger.y1.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            }
                            if (aqVar.G < aqVar.H) {
                                imageView3.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i113 = aqVar.O;
                            if (i113 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i113];
                                for (int i20 = i113 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                    colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i21 = aqVar.P;
                            if (i21 < 0 || i21 >= aqVar.O) {
                                colorPicker$RadioButtonArr2[aqVar.G - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i21].callOnClick();
                            }
                            int i22 = 0;
                            while (i22 < colorPicker$RadioButtonArr2.length) {
                                if (i22 < aqVar.G) {
                                    zpVar3.n0(colorPicker$RadioButtonArr2[i22].f26342e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    zpVar3.n0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i22++;
                            }
                            aqVar.f26805y = new AnimatorSet();
                            aqVar.g(aqVar.getMeasuredWidth(), arrayList2, true);
                            aqVar.f26805y.playTogether(arrayList2);
                            aqVar.f26805y.setDuration(180L);
                            aqVar.f26805y.setInterpolator(er.f28123g);
                            aqVar.f26805y.addListener(new yp(aqVar));
                            aqVar.f26805y.start();
                            break;
                        }
                        break;
                    case 2:
                        aq.a(aqVar, view);
                        break;
                    default:
                        aqVar.E.M(null, null);
                        break;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.Add));
        addView(imageView, h7.z5.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l0 l0Var = new org.telegram.ui.ActionBar.l0(this, getContext(), 1);
        this.B = l0Var;
        l0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i17, this.W), 1, -1));
        l0Var.setImageResource(R.drawable.msg_close);
        l0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i18, this.W), mode));
        l0Var.setAlpha(0.0f);
        l0Var.setScaleX(0.0f);
        l0Var.setScaleY(0.0f);
        l0Var.setScaleType(scaleType);
        l0Var.setVisibility(4);
        l0Var.setOnClickListener(new View.OnClickListener(this) {

            public final aq f34022b;

            {
                this.f34022b = this;
            }

            @Override
            public final void onClick(View view) {
                int i19;
                int i110 = i10;
                aq aqVar = this.f34022b;
                switch (i110) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        zp zpVar2 = aqVar.f26795a;
                        org.telegram.ui.ActionBar.l0 l0Var2 = aqVar.B;
                        ImageView imageView2 = aqVar.C;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = aqVar.v;
                        if (aqVar.f26805y == null) {
                            int i111 = aqVar.G;
                            if (i111 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.f26342e == 0) {
                                    i19 = 0;
                                    colorPicker$RadioButton2.a(aq.d(colorPicker$RadioButtonArr[0].f26342e));
                                } else {
                                    i19 = 0;
                                }
                                if (aqVar.h) {
                                    zpVar2.n0(colorPicker$RadioButtonArr[i19].f26342e, i19, true);
                                }
                                zpVar2.n0(colorPicker$RadioButtonArr[1].f26342e, 1, true);
                                aqVar.G = 2;
                            } else if (i111 == 2) {
                                aqVar.G = 3;
                                if (colorPicker$RadioButtonArr[2].f26342e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].f26342e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                zpVar2.n0(colorPicker$RadioButtonArr[2].f26342e, 2, true);
                            } else if (i111 == 3) {
                                aqVar.G = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.f26342e == 0) {
                                    colorPicker$RadioButton3.a(aq.d(colorPicker$RadioButtonArr[2].f26342e));
                                }
                                zpVar2.n0(colorPicker$RadioButtonArr[3].f26342e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (aqVar.G < aqVar.H) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (aqVar.G > 1) {
                                if (l0Var2.getVisibility() != 0) {
                                    l0Var2.setScaleX(0.0f);
                                    l0Var2.setScaleY(0.0f);
                                }
                                l0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[aqVar.G - 1].callOnClick();
                            aqVar.f26805y = new AnimatorSet();
                            aqVar.g(aqVar.getMeasuredWidth(), arrayList, false);
                            aqVar.f26805y.playTogether(arrayList);
                            aqVar.f26805y.setDuration(180L);
                            aqVar.f26805y.setInterpolator(er.f28123g);
                            aqVar.f26805y.addListener(new org.telegram.ui.am(aqVar, 22));
                            aqVar.f26805y.start();
                            break;
                        }
                        break;
                    case 1:
                        zp zpVar3 = aqVar.f26795a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.l0 l0Var3 = aqVar.B;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = aqVar.v;
                        ImageView imageView3 = aqVar.C;
                        if (aqVar.f26805y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i112 = aqVar.G;
                            if (i112 == 2) {
                                aqVar.G = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var3, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var3, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var3, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i112 == 3) {
                                aqVar.G = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i112 == 4) {
                                aqVar.G = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, org.telegram.messenger.y1.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            }
                            if (aqVar.G < aqVar.H) {
                                imageView3.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i113 = aqVar.O;
                            if (i113 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i113];
                                for (int i20 = i113 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                    colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i21 = aqVar.P;
                            if (i21 < 0 || i21 >= aqVar.O) {
                                colorPicker$RadioButtonArr2[aqVar.G - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i21].callOnClick();
                            }
                            int i22 = 0;
                            while (i22 < colorPicker$RadioButtonArr2.length) {
                                if (i22 < aqVar.G) {
                                    zpVar3.n0(colorPicker$RadioButtonArr2[i22].f26342e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    zpVar3.n0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i22++;
                            }
                            aqVar.f26805y = new AnimatorSet();
                            aqVar.g(aqVar.getMeasuredWidth(), arrayList2, true);
                            aqVar.f26805y.playTogether(arrayList2);
                            aqVar.f26805y.setDuration(180L);
                            aqVar.f26805y.setInterpolator(er.f28123g);
                            aqVar.f26805y.addListener(new yp(aqVar));
                            aqVar.f26805y.start();
                            break;
                        }
                        break;
                    case 2:
                        aq.a(aqVar, view);
                        break;
                    default:
                        aqVar.E.M(null, null);
                        break;
                }
            }
        });
        l0Var.setContentDescription(LocaleController.getString(R.string.ClearButton));
        addView(l0Var, h7.z5.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i18, this.W));
        addView(textView, h7.z5.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new ag.l2(13));
        if (z10) {
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.g6.v0(i18, this.W));
            this.E = v0Var;
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
            v0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i17, this.W), 1, -1));
            addView(v0Var, h7.z5.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            v0Var.setOnClickListener(new View.OnClickListener(this) {

                public final aq f34022b;

                {
                    this.f34022b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i19;
                    int i110 = i11;
                    aq aqVar = this.f34022b;
                    switch (i110) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            zp zpVar2 = aqVar.f26795a;
                            org.telegram.ui.ActionBar.l0 l0Var2 = aqVar.B;
                            ImageView imageView2 = aqVar.C;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = aqVar.v;
                            if (aqVar.f26805y == null) {
                                int i111 = aqVar.G;
                                if (i111 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.f26342e == 0) {
                                        i19 = 0;
                                        colorPicker$RadioButton2.a(aq.d(colorPicker$RadioButtonArr[0].f26342e));
                                    } else {
                                        i19 = 0;
                                    }
                                    if (aqVar.h) {
                                        zpVar2.n0(colorPicker$RadioButtonArr[i19].f26342e, i19, true);
                                    }
                                    zpVar2.n0(colorPicker$RadioButtonArr[1].f26342e, 1, true);
                                    aqVar.G = 2;
                                } else if (i111 == 2) {
                                    aqVar.G = 3;
                                    if (colorPicker$RadioButtonArr[2].f26342e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].f26342e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    zpVar2.n0(colorPicker$RadioButtonArr[2].f26342e, 2, true);
                                } else if (i111 == 3) {
                                    aqVar.G = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.f26342e == 0) {
                                        colorPicker$RadioButton3.a(aq.d(colorPicker$RadioButtonArr[2].f26342e));
                                    }
                                    zpVar2.n0(colorPicker$RadioButtonArr[3].f26342e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (aqVar.G < aqVar.H) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (aqVar.G > 1) {
                                    if (l0Var2.getVisibility() != 0) {
                                        l0Var2.setScaleX(0.0f);
                                        l0Var2.setScaleY(0.0f);
                                    }
                                    l0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[aqVar.G - 1].callOnClick();
                                aqVar.f26805y = new AnimatorSet();
                                aqVar.g(aqVar.getMeasuredWidth(), arrayList, false);
                                aqVar.f26805y.playTogether(arrayList);
                                aqVar.f26805y.setDuration(180L);
                                aqVar.f26805y.setInterpolator(er.f28123g);
                                aqVar.f26805y.addListener(new org.telegram.ui.am(aqVar, 22));
                                aqVar.f26805y.start();
                                break;
                            }
                            break;
                        case 1:
                            zp zpVar3 = aqVar.f26795a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.l0 l0Var3 = aqVar.B;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = aqVar.v;
                            ImageView imageView3 = aqVar.C;
                            if (aqVar.f26805y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i112 = aqVar.G;
                                if (i112 == 2) {
                                    aqVar.G = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var3, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var3, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var3, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i112 == 3) {
                                    aqVar.G = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i112 == 4) {
                                    aqVar.G = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, org.telegram.messenger.y1.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                }
                                if (aqVar.G < aqVar.H) {
                                    imageView3.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i113 = aqVar.O;
                                if (i113 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i113];
                                    for (int i20 = i113 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                        colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i21 = aqVar.P;
                                if (i21 < 0 || i21 >= aqVar.O) {
                                    colorPicker$RadioButtonArr2[aqVar.G - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i21].callOnClick();
                                }
                                int i22 = 0;
                                while (i22 < colorPicker$RadioButtonArr2.length) {
                                    if (i22 < aqVar.G) {
                                        zpVar3.n0(colorPicker$RadioButtonArr2[i22].f26342e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        zpVar3.n0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i22++;
                                }
                                aqVar.f26805y = new AnimatorSet();
                                aqVar.g(aqVar.getMeasuredWidth(), arrayList2, true);
                                aqVar.f26805y.playTogether(arrayList2);
                                aqVar.f26805y.setDuration(180L);
                                aqVar.f26805y.setInterpolator(er.f28123g);
                                aqVar.f26805y.addListener(new yp(aqVar));
                                aqVar.f26805y.start();
                                break;
                            }
                            break;
                        case 2:
                            aq.a(aqVar, view);
                            break;
                        default:
                            aqVar.E.M(null, null);
                            break;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(aq aqVar, View view) {
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i10 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = aqVar.v;
            if (i10 >= colorPicker$RadioButtonArr.length) {
                int i11 = colorPicker$RadioButton.f26342e;
                aqVar.setColorInner(i11);
                aqVar.A[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i11)), Byte.valueOf((byte) Color.green(i11)), Byte.valueOf((byte) Color.blue(i11))).toUpperCase());
                return;
            }
            ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i10];
            boolean z10 = colorPicker$RadioButton2 == colorPicker$RadioButton;
            colorPicker$RadioButton2.d = z10;
            colorPicker$RadioButton2.b(true);
            if (z10) {
                aqVar.P = aqVar.O;
                aqVar.O = i10;
            }
            i10++;
        }
    }

    public static int d(int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
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
        return Math.max(this.U, Math.min(this.J[2], this.V));
    }

    public void setColorInner(int i10) {
        Color.colorToHSV(i10, this.J);
        int iD0 = this.f26795a.D0(this.O);
        if (iD0 == 0 || iD0 != i10) {
            h();
        }
        this.L = null;
        invalidate();
    }

    public final void c(Canvas canvas, int i10, int i11, int i12, boolean z10) {
        int iDp = AndroidUtilities.dp(z10 ? 12.0f : 16.0f);
        Drawable drawable = this.f26799f;
        drawable.setBounds(i10 - iDp, i11 - iDp, i10 + iDp, iDp + i11);
        drawable.draw(canvas);
        Paint paint = this.d;
        paint.setColor(-1);
        float f10 = i10;
        float f11 = i11;
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(z10 ? 11.0f : 15.0f), paint);
        paint.setColor(i12);
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(z10 ? 9.0f : 13.0f), paint);
    }

    public final void e(int i10, int i11) {
        if (!this.f26801r) {
            this.f26801r = true;
            if (this.O == i11) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i10)), Byte.valueOf((byte) Color.green(i10)), Byte.valueOf((byte) Color.blue(i10))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.A;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.v[i11].a(i10);
            this.f26801r = false;
        }
        setColorInner(i10);
    }

    public final void f(int i10, int i11, int i12, boolean z10) {
        if (i10 != this.F) {
            this.P = 0;
            this.O = 0;
            int i13 = 0;
            while (i13 < 4) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.v[i13];
                colorPicker$RadioButton.d = i13 == this.O;
                colorPicker$RadioButton.b(true);
                i13++;
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
            imageView.setTranslationX(org.telegram.messenger.y1.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.y1.D(13.0f, 3, AndroidUtilities.dp(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.l0 l0Var = this.B;
        org.telegram.ui.ActionBar.v0 v0Var = this.E;
        if (v0Var != null) {
            if (i10 == 1) {
                v0Var.setVisibility(0);
            } else {
                v0Var.setVisibility(8);
                l0Var.setTranslationX(0.0f);
            }
        }
        if (i11 <= 1) {
            imageView.setVisibility(8);
            l0Var.setVisibility(8);
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
                l0Var.setVisibility(0);
                l0Var.setScaleX(1.0f);
                l0Var.setScaleY(1.0f);
                l0Var.setAlpha(1.0f);
            } else {
                l0Var.setVisibility(8);
            }
        }
        this.f26804x.invalidate();
        g(getMeasuredWidth(), null, false);
    }

    public final void g(int i10, ArrayList arrayList, boolean z10) {
        float f10;
        int i11 = this.G;
        int iD = org.telegram.messenger.y1.D(13.0f, i11 - 1, AndroidUtilities.dp(30.0f) * i11);
        FrameLayout frameLayout = this.f26803w;
        int left = frameLayout.getLeft() + iD;
        int iDp = i10 - AndroidUtilities.dp(this.F == 1 ? 50.0f : 0.0f);
        float f11 = left > iDp ? left - iDp : 0.0f;
        Property property = View.TRANSLATION_X;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, -f11));
        } else {
            frameLayout.setTranslationX(-f11);
        }
        int i12 = 0;
        int iC = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = this.v;
            if (i12 >= colorPicker$RadioButtonArr.length) {
                return;
            }
            boolean z11 = colorPicker$RadioButtonArr[i12].getTag(R.id.index_tag) != null;
            int i13 = this.G;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (i12 < i13) {
                colorPicker$RadioButtonArr[i12].setVisibility(0);
                if (arrayList != null) {
                    if (z11) {
                        f10 = 30.0f;
                    } else {
                        f10 = 30.0f;
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property4, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property3, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property2, 1.0f));
                    }
                    if (z10 || !(z10 || i12 == this.G - 1)) {
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property, iC));
                    } else {
                        colorPicker$RadioButtonArr[i12].setTranslationX(iC);
                    }
                } else {
                    f10 = 30.0f;
                    colorPicker$RadioButtonArr[i12].setVisibility(0);
                    if (this.f26805y == null) {
                        colorPicker$RadioButtonArr[i12].setAlpha(1.0f);
                        colorPicker$RadioButtonArr[i12].setScaleX(1.0f);
                        colorPicker$RadioButtonArr[i12].setScaleY(1.0f);
                    }
                    colorPicker$RadioButtonArr[i12].setTranslationX(iC);
                }
                colorPicker$RadioButtonArr[i12].setTag(R.id.index_tag, 1);
            } else {
                f10 = 30.0f;
                if (arrayList == null) {
                    colorPicker$RadioButtonArr[i12].setVisibility(4);
                    if (this.f26805y == null) {
                        colorPicker$RadioButtonArr[i12].setAlpha(0.0f);
                        colorPicker$RadioButtonArr[i12].setScaleX(0.0f);
                        colorPicker$RadioButtonArr[i12].setScaleY(0.0f);
                    }
                } else if (z11) {
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property4, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property3, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property2, 0.0f));
                }
                if (!z10) {
                    colorPicker$RadioButtonArr[i12].setTranslationX(iC);
                }
                colorPicker$RadioButtonArr[i12].setTag(R.id.index_tag, null);
            }
            iC = org.telegram.messenger.y1.C(13.0f, AndroidUtilities.dp(f10), iC);
            i12++;
        }
    }

    public int getColor() {
        float[] fArr = this.J;
        float f10 = fArr[0];
        float[] fArr2 = this.K;
        fArr2[0] = f10;
        fArr2[1] = fArr[1];
        fArr2[2] = getBrightness();
        return (Color.HSVToColor(fArr2) & 16777215) | (-16777216);
    }

    public final void h() {
        org.telegram.ui.ActionBar.l0 l0Var = this.B;
        if (l0Var == null) {
            return;
        }
        float f10 = l0Var.getTag() != null ? 0.0f : this.S;
        float f11 = l0Var.getTag() != null ? 1.0f : this.T;
        float[] fArr = this.J;
        float f12 = fArr[2];
        if (f10 == 0.0f && f11 == 1.0f) {
            this.U = 0.0f;
            this.V = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int iHSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f12;
        float fComputePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(iHSVToColor);
        float fMax = Math.max(0.0f, Math.min(f10 / fComputePerceivedBrightness, 1.0f));
        this.U = fMax;
        this.V = Math.max(fMax, Math.min(f11 / fComputePerceivedBrightness, 1.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f26804x.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int iDp = AndroidUtilities.dp(45.0f);
        float f11 = iDp;
        canvas.drawBitmap(this.f26802s, 0.0f, f11, (Paint) null);
        int height = this.f26802s.getHeight() + iDp;
        Paint paint = this.f26798e;
        canvas.drawRect(0.0f, f11, getMeasuredWidth(), iDp + 1, paint);
        canvas.drawRect(0.0f, height - 1, getMeasuredWidth(), height, paint);
        float[] fArr = this.J;
        float f12 = fArr[0];
        float[] fArr2 = this.K;
        fArr2[0] = f12;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int iZ = (int) com.google.android.recaptcha.internal.a.z(1.0f, fArr[1], this.f26802s.getHeight(), f11);
        if (!this.M) {
            int iDp2 = AndroidUtilities.dp(16.0f);
            float interpolation = er.f28123g.getInterpolation(this.Q);
            if (measuredWidth < iDp2) {
                measuredWidth = (int) (((iDp2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - iDp2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - iDp2)) * interpolation));
            }
            int i10 = iDp + iDp2;
            if (iZ < i10) {
                iZ = (int) ((interpolation * (i10 - iZ)) + iZ);
            } else if (iZ > (this.f26802s.getHeight() + iDp) - iDp2) {
                iZ = (int) (iZ - (interpolation * (iZ - ((this.f26802s.getHeight() + iDp) - iDp2))));
            }
        }
        c(canvas, measuredWidth, iZ, Color.HSVToColor(fArr2), false);
        float fDp = AndroidUtilities.dp(22.0f);
        float fDp2 = AndroidUtilities.dp(26.0f) + height;
        float measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(22.0f);
        float fDp3 = AndroidUtilities.dp(34.0f) + height;
        RectF rectF = this.f26800n;
        rectF.set(fDp, fDp2, measuredWidth2, fDp3);
        LinearGradient linearGradient = this.L;
        Paint paint2 = this.f26797c;
        if (linearGradient == null) {
            fArr2[2] = this.U;
            int iHSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.V;
            int iHSVToColor2 = Color.HSVToColor(fArr2);
            float f13 = rectF.left;
            float f14 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f13, f14, rectF.right, f14, new int[]{iHSVToColor2, iHSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.L = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (this.U == this.V) {
            f10 = 0.5f;
        } else {
            float brightness = getBrightness();
            float f15 = this.U;
            f10 = (brightness - f15) / (this.V - f15);
        }
        c(canvas, (int) ((rectF.width() * (1.0f - f10)) + rectF.left), (int) rectF.centerY(), getColor(), true);
        if (this.M || this.Q >= 1.0f) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.R;
        this.R = jElapsedRealtime;
        float f16 = (j10 / 180.0f) + this.Q;
        this.Q = f16;
        if (f16 > 1.0f) {
            this.Q = 1.0f;
        }
        invalidate();
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
            int iDp = AndroidUtilities.dp(180.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, iDp, Bitmap.Config.ARGB_8888);
            float f10 = i10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f11 = iDp;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, iDp / 3, 0.0f, f11, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.f26796b;
            paint.setShader(composeShader);
            new Canvas(bitmapCreateBitmap).drawRect(0.0f, 0.0f, f10, f11, paint);
            this.f26802s = bitmapCreateBitmap;
            this.L = null;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aq.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setHasChanges(boolean z10) {
        TextView textView = this.D;
        if (!z10 || textView.getTag() == null) {
            if ((z10 || textView.getTag() != null) && this.B.getTag() == null) {
                textView.setTag(z10 ? 1 : null);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (z10) {
                    textView.setVisibility(0);
                }
                arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
                animatorSet.addListener(new org.telegram.ui.go(7, this, z10));
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(180L);
                animatorSet.start();
            }
        }
    }

    public void setMaxBrightness(float f10) {
        this.T = f10;
        h();
    }

    public void setMinBrightness(float f10) {
        this.S = f10;
        h();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.W = c6Var;
    }
}
