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
public class cq extends FrameLayout {
    public static final int f27542a0 = 0;
    public final EditTextBoldCursor[] A;
    public final org.telegram.ui.ActionBar.l0 B;
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
    public org.telegram.ui.ActionBar.b6 W;
    public final bq f27543a;
    public final Paint f27544b;
    public final Paint f27545c;
    public final Paint d;
    public final Paint f27546e;
    public final Drawable f27547f;
    public boolean h;
    public final RectF f27548n;
    public boolean f27549r;
    public Bitmap f27550s;
    public final ColorPicker$RadioButton[] v;
    public final FrameLayout f27551w;
    public final gh.x9 f27552x;
    public AnimatorSet f27553y;

    public cq(Context context, boolean z10, bq bqVar) {
        super(context);
        boolean z11;
        this.f27548n = new RectF();
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
        this.f27543a = bqVar;
        this.A = new EditTextBoldCursor[2];
        setWillNotDraw(false);
        this.f27547f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        this.d = new Paint(1);
        this.f27544b = new Paint(5);
        this.f27545c = new Paint(5);
        Paint paint = new Paint();
        this.f27546e = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        gh.x9 x9Var = new gh.x9(this, context);
        this.f27552x = x9Var;
        x9Var.setOrientation(0);
        addView(x9Var, g7.e6.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        x9Var.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27551w = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, g7.e6.d(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        for (int i9 = 0; i9 < 4; i9++) {
            this.v[i9] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.v[i9];
            if (this.O == i9) {
                z11 = true;
            } else {
                z11 = false;
            }
            colorPicker$RadioButton.d = z11;
            colorPicker$RadioButton.b(false);
            this.f27551w.addView(this.v[i9], g7.e6.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.v[i9].setOnClickListener(new View.OnClickListener(this) {
                public final cq f34733b;

                {
                    this.f34733b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i10;
                    boolean z12;
                    boolean z13;
                    int i11 = r2;
                    cq cqVar = this.f34733b;
                    switch (i11) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            bq bqVar2 = cqVar.f27543a;
                            org.telegram.ui.ActionBar.l0 l0Var = cqVar.B;
                            ImageView imageView = cqVar.C;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.v;
                            if (cqVar.f27553y == null) {
                                int i12 = cqVar.G;
                                if (i12 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.f26346e == 0) {
                                        i10 = 0;
                                        colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].f26346e));
                                    } else {
                                        i10 = 0;
                                    }
                                    if (cqVar.h) {
                                        bqVar2.n0(colorPicker$RadioButtonArr[i10].f26346e, i10, true);
                                    }
                                    bqVar2.n0(colorPicker$RadioButtonArr[1].f26346e, 1, true);
                                    cqVar.G = 2;
                                } else if (i12 == 2) {
                                    cqVar.G = 3;
                                    if (colorPicker$RadioButtonArr[2].f26346e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].f26346e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    bqVar2.n0(colorPicker$RadioButtonArr[2].f26346e, 2, true);
                                } else if (i12 == 3) {
                                    cqVar.G = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.f26346e == 0) {
                                        colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].f26346e));
                                    }
                                    bqVar2.n0(colorPicker$RadioButtonArr[3].f26346e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (cqVar.G < cqVar.H) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 0.0f));
                                }
                                if (cqVar.G > 1) {
                                    if (l0Var.getVisibility() != 0) {
                                        l0Var.setScaleX(0.0f);
                                        l0Var.setScaleY(0.0f);
                                    }
                                    l0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[cqVar.G - 1].callOnClick();
                                cqVar.f27553y = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                                cqVar.f27553y.playTogether(arrayList);
                                cqVar.f27553y.setDuration(180L);
                                cqVar.f27553y.setInterpolator(gr.f28845g);
                                cqVar.f27553y.addListener(new org.telegram.ui.xp(cqVar, 20));
                                cqVar.f27553y.start();
                                return;
                            }
                            return;
                        case 1:
                            bq bqVar3 = cqVar.f27543a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.l0 l0Var2 = cqVar.B;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.v;
                            ImageView imageView2 = cqVar.C;
                            if (cqVar.f27553y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i13 = cqVar.G;
                                if (i13 == 2) {
                                    cqVar.G = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, 0.0f));
                                } else if (i13 == 3) {
                                    cqVar.G = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i13 == 4) {
                                    cqVar.G = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, org.telegram.messenger.l0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (cqVar.G < cqVar.H) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 0.0f));
                                }
                                int i14 = cqVar.O;
                                if (i14 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i14];
                                    for (int i15 = i14 + 1; i15 < colorPicker$RadioButtonArr2.length; i15++) {
                                        colorPicker$RadioButtonArr2[i15 - 1] = colorPicker$RadioButtonArr2[i15];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i16 = cqVar.P;
                                if (i16 >= 0 && i16 < cqVar.O) {
                                    colorPicker$RadioButtonArr2[i16].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[cqVar.G - 1].callOnClick();
                                }
                                for (int i17 = 0; i17 < colorPicker$RadioButtonArr2.length; i17++) {
                                    if (i17 < cqVar.G) {
                                        int i18 = colorPicker$RadioButtonArr2[i17].f26346e;
                                        if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        bqVar3.n0(i18, i17, z13);
                                    } else {
                                        if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        bqVar3.n0(0, i17, z12);
                                    }
                                }
                                cqVar.f27553y = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                                cqVar.f27553y.playTogether(arrayList2);
                                cqVar.f27553y.setDuration(180L);
                                cqVar.f27553y.setInterpolator(gr.f28845g);
                                cqVar.f27553y.addListener(new aq(cqVar));
                                cqVar.f27553y.start();
                                return;
                            }
                            return;
                        case 2:
                            cq.a(cqVar, view);
                            return;
                        default:
                            cqVar.E.M(null, null);
                            return;
                    }
                }
            });
        }
        int i10 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.A;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i10 % 2 == 0) {
                editTextBoldCursorArr[i10] = new yp(this, context, i10, 0);
                this.A[i10].setBackgroundDrawable(null);
                this.A[i10].setText("#");
                this.A[i10].setEnabled(false);
                this.A[i10].setFocusable(false);
                this.A[i10].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.f27552x.addView(this.A[i10], g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i10] = new yp(this, context, i10, 1);
                this.A[i10].setBackgroundDrawable(null);
                this.A[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.A[i10].setHint("8BC6ED");
                this.A[i10].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.f27552x.addView(this.A[i10], g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.A[i10].addTextChangedListener(new zp(this, i10));
                this.A[i10].setOnEditorActionListener(new o2(1));
            }
            this.A[i10].setTextSize(1, 16.0f);
            this.A[i10].setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H6, this.W));
            EditTextBoldCursor editTextBoldCursor = this.A[i10];
            int i11 = org.telegram.ui.ActionBar.f6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, this.W));
            this.A[i10].setCursorColor(org.telegram.ui.ActionBar.f6.v0(i11, this.W));
            this.A[i10].setCursorSize(AndroidUtilities.dp(18.0f));
            this.A[i10].setCursorWidth(1.5f);
            this.A[i10].setSingleLine(true);
            this.A[i10].setGravity(19);
            this.A[i10].setHeaderHintColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L6, this.W));
            this.A[i10].setTransformHintToHeader(true);
            this.A[i10].setInputType(524416);
            this.A[i10].setImeOptions(268435462);
            if (i10 == 1) {
                this.A[i10].requestFocus();
            } else if (i10 == 2 || i10 == 3) {
                this.A[i10].setVisibility(8);
            }
            i10++;
        }
        ImageView imageView = new ImageView(getContext());
        this.C = imageView;
        int i12 = org.telegram.ui.ActionBar.f6.I5;
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i12, this.W), 1, -1));
        imageView.setImageResource(R.drawable.msg_add);
        int i13 = org.telegram.ui.ActionBar.f6.G6;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i13, this.W);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final cq f34733b;

            {
                this.f34733b = this;
            }

            @Override
            public final void onClick(View view) {
                int i102;
                boolean z12;
                boolean z13;
                int i112 = r2;
                cq cqVar = this.f34733b;
                switch (i112) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        bq bqVar2 = cqVar.f27543a;
                        org.telegram.ui.ActionBar.l0 l0Var = cqVar.B;
                        ImageView imageView2 = cqVar.C;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.v;
                        if (cqVar.f27553y == null) {
                            int i122 = cqVar.G;
                            if (i122 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.f26346e == 0) {
                                    i102 = 0;
                                    colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].f26346e));
                                } else {
                                    i102 = 0;
                                }
                                if (cqVar.h) {
                                    bqVar2.n0(colorPicker$RadioButtonArr[i102].f26346e, i102, true);
                                }
                                bqVar2.n0(colorPicker$RadioButtonArr[1].f26346e, 1, true);
                                cqVar.G = 2;
                            } else if (i122 == 2) {
                                cqVar.G = 3;
                                if (colorPicker$RadioButtonArr[2].f26346e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].f26346e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                bqVar2.n0(colorPicker$RadioButtonArr[2].f26346e, 2, true);
                            } else if (i122 == 3) {
                                cqVar.G = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.f26346e == 0) {
                                    colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].f26346e));
                                }
                                bqVar2.n0(colorPicker$RadioButtonArr[3].f26346e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (cqVar.G < cqVar.H) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (cqVar.G > 1) {
                                if (l0Var.getVisibility() != 0) {
                                    l0Var.setScaleX(0.0f);
                                    l0Var.setScaleY(0.0f);
                                }
                                l0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[cqVar.G - 1].callOnClick();
                            cqVar.f27553y = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                            cqVar.f27553y.playTogether(arrayList);
                            cqVar.f27553y.setDuration(180L);
                            cqVar.f27553y.setInterpolator(gr.f28845g);
                            cqVar.f27553y.addListener(new org.telegram.ui.xp(cqVar, 20));
                            cqVar.f27553y.start();
                            return;
                        }
                        return;
                    case 1:
                        bq bqVar3 = cqVar.f27543a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.l0 l0Var2 = cqVar.B;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.v;
                        ImageView imageView22 = cqVar.C;
                        if (cqVar.f27553y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i132 = cqVar.G;
                            if (i132 == 2) {
                                cqVar.G = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i132 == 3) {
                                cqVar.G = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i132 == 4) {
                                cqVar.G = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.l0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (cqVar.G < cqVar.H) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i14 = cqVar.O;
                            if (i14 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i14];
                                for (int i15 = i14 + 1; i15 < colorPicker$RadioButtonArr2.length; i15++) {
                                    colorPicker$RadioButtonArr2[i15 - 1] = colorPicker$RadioButtonArr2[i15];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i16 = cqVar.P;
                            if (i16 >= 0 && i16 < cqVar.O) {
                                colorPicker$RadioButtonArr2[i16].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[cqVar.G - 1].callOnClick();
                            }
                            for (int i17 = 0; i17 < colorPicker$RadioButtonArr2.length; i17++) {
                                if (i17 < cqVar.G) {
                                    int i18 = colorPicker$RadioButtonArr2[i17].f26346e;
                                    if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    bqVar3.n0(i18, i17, z13);
                                } else {
                                    if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    bqVar3.n0(0, i17, z12);
                                }
                            }
                            cqVar.f27553y = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                            cqVar.f27553y.playTogether(arrayList2);
                            cqVar.f27553y.setDuration(180L);
                            cqVar.f27553y.setInterpolator(gr.f28845g);
                            cqVar.f27553y.addListener(new aq(cqVar));
                            cqVar.f27553y.start();
                            return;
                        }
                        return;
                    case 2:
                        cq.a(cqVar, view);
                        return;
                    default:
                        cqVar.E.M(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.Add));
        addView(imageView, g7.e6.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l0 l0Var = new org.telegram.ui.ActionBar.l0(this, getContext(), 1);
        this.B = l0Var;
        l0Var.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i12, this.W), 1, -1));
        l0Var.setImageResource(R.drawable.msg_close);
        l0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i13, this.W), mode));
        l0Var.setAlpha(0.0f);
        l0Var.setScaleX(0.0f);
        l0Var.setScaleY(0.0f);
        l0Var.setScaleType(scaleType);
        l0Var.setVisibility(4);
        l0Var.setOnClickListener(new View.OnClickListener(this) {
            public final cq f34733b;

            {
                this.f34733b = this;
            }

            @Override
            public final void onClick(View view) {
                int i102;
                boolean z12;
                boolean z13;
                int i112 = r2;
                cq cqVar = this.f34733b;
                switch (i112) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        bq bqVar2 = cqVar.f27543a;
                        org.telegram.ui.ActionBar.l0 l0Var2 = cqVar.B;
                        ImageView imageView2 = cqVar.C;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.v;
                        if (cqVar.f27553y == null) {
                            int i122 = cqVar.G;
                            if (i122 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.f26346e == 0) {
                                    i102 = 0;
                                    colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].f26346e));
                                } else {
                                    i102 = 0;
                                }
                                if (cqVar.h) {
                                    bqVar2.n0(colorPicker$RadioButtonArr[i102].f26346e, i102, true);
                                }
                                bqVar2.n0(colorPicker$RadioButtonArr[1].f26346e, 1, true);
                                cqVar.G = 2;
                            } else if (i122 == 2) {
                                cqVar.G = 3;
                                if (colorPicker$RadioButtonArr[2].f26346e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].f26346e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                bqVar2.n0(colorPicker$RadioButtonArr[2].f26346e, 2, true);
                            } else if (i122 == 3) {
                                cqVar.G = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.f26346e == 0) {
                                    colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].f26346e));
                                }
                                bqVar2.n0(colorPicker$RadioButtonArr[3].f26346e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (cqVar.G < cqVar.H) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (cqVar.G > 1) {
                                if (l0Var2.getVisibility() != 0) {
                                    l0Var2.setScaleX(0.0f);
                                    l0Var2.setScaleY(0.0f);
                                }
                                l0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[cqVar.G - 1].callOnClick();
                            cqVar.f27553y = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                            cqVar.f27553y.playTogether(arrayList);
                            cqVar.f27553y.setDuration(180L);
                            cqVar.f27553y.setInterpolator(gr.f28845g);
                            cqVar.f27553y.addListener(new org.telegram.ui.xp(cqVar, 20));
                            cqVar.f27553y.start();
                            return;
                        }
                        return;
                    case 1:
                        bq bqVar3 = cqVar.f27543a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.l0 l0Var22 = cqVar.B;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.v;
                        ImageView imageView22 = cqVar.C;
                        if (cqVar.f27553y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i132 = cqVar.G;
                            if (i132 == 2) {
                                cqVar.G = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var22, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i132 == 3) {
                                cqVar.G = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i132 == 4) {
                                cqVar.G = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.l0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (cqVar.G < cqVar.H) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i14 = cqVar.O;
                            if (i14 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i14];
                                for (int i15 = i14 + 1; i15 < colorPicker$RadioButtonArr2.length; i15++) {
                                    colorPicker$RadioButtonArr2[i15 - 1] = colorPicker$RadioButtonArr2[i15];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i16 = cqVar.P;
                            if (i16 >= 0 && i16 < cqVar.O) {
                                colorPicker$RadioButtonArr2[i16].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[cqVar.G - 1].callOnClick();
                            }
                            for (int i17 = 0; i17 < colorPicker$RadioButtonArr2.length; i17++) {
                                if (i17 < cqVar.G) {
                                    int i18 = colorPicker$RadioButtonArr2[i17].f26346e;
                                    if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    bqVar3.n0(i18, i17, z13);
                                } else {
                                    if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    bqVar3.n0(0, i17, z12);
                                }
                            }
                            cqVar.f27553y = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                            cqVar.f27553y.playTogether(arrayList2);
                            cqVar.f27553y.setDuration(180L);
                            cqVar.f27553y.setInterpolator(gr.f28845g);
                            cqVar.f27553y.addListener(new aq(cqVar));
                            cqVar.f27553y.start();
                            return;
                        }
                        return;
                    case 2:
                        cq.a(cqVar, view);
                        return;
                    default:
                        cqVar.E.M(null, null);
                        return;
                }
            }
        });
        l0Var.setContentDescription(LocaleController.getString(R.string.ClearButton));
        addView(l0Var, g7.e6.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, this.W));
        addView(textView, g7.e6.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new fh.n(12));
        if (z10) {
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.f6.v0(i13, this.W));
            this.E = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            w0Var.e(1, R.drawable.msg_edit, LocaleController.getString(R.string.OpenInEditor));
            w0Var.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareTheme));
            w0Var.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteTheme));
            w0Var.setMenuYOffset(-AndroidUtilities.dp(80.0f));
            w0Var.setSubMenuOpenSide(2);
            w0Var.setDelegate(new s(this, 26));
            w0Var.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
            w0Var.setTranslationX(AndroidUtilities.dp(6.0f));
            w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i12, this.W), 1, -1));
            addView(w0Var, g7.e6.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            w0Var.setOnClickListener(new View.OnClickListener(this) {
                public final cq f34733b;

                {
                    this.f34733b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i102;
                    boolean z12;
                    boolean z13;
                    int i112 = r2;
                    cq cqVar = this.f34733b;
                    switch (i112) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            bq bqVar2 = cqVar.f27543a;
                            org.telegram.ui.ActionBar.l0 l0Var2 = cqVar.B;
                            ImageView imageView2 = cqVar.C;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.v;
                            if (cqVar.f27553y == null) {
                                int i122 = cqVar.G;
                                if (i122 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.f26346e == 0) {
                                        i102 = 0;
                                        colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].f26346e));
                                    } else {
                                        i102 = 0;
                                    }
                                    if (cqVar.h) {
                                        bqVar2.n0(colorPicker$RadioButtonArr[i102].f26346e, i102, true);
                                    }
                                    bqVar2.n0(colorPicker$RadioButtonArr[1].f26346e, 1, true);
                                    cqVar.G = 2;
                                } else if (i122 == 2) {
                                    cqVar.G = 3;
                                    if (colorPicker$RadioButtonArr[2].f26346e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].f26346e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    bqVar2.n0(colorPicker$RadioButtonArr[2].f26346e, 2, true);
                                } else if (i122 == 3) {
                                    cqVar.G = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.f26346e == 0) {
                                        colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].f26346e));
                                    }
                                    bqVar2.n0(colorPicker$RadioButtonArr[3].f26346e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (cqVar.G < cqVar.H) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                                }
                                if (cqVar.G > 1) {
                                    if (l0Var2.getVisibility() != 0) {
                                        l0Var2.setScaleX(0.0f);
                                        l0Var2.setScaleY(0.0f);
                                    }
                                    l0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[cqVar.G - 1].callOnClick();
                                cqVar.f27553y = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                                cqVar.f27553y.playTogether(arrayList);
                                cqVar.f27553y.setDuration(180L);
                                cqVar.f27553y.setInterpolator(gr.f28845g);
                                cqVar.f27553y.addListener(new org.telegram.ui.xp(cqVar, 20));
                                cqVar.f27553y.start();
                                return;
                            }
                            return;
                        case 1:
                            bq bqVar3 = cqVar.f27543a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.l0 l0Var22 = cqVar.B;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.v;
                            ImageView imageView22 = cqVar.C;
                            if (cqVar.f27553y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i132 = cqVar.G;
                                if (i132 == 2) {
                                    cqVar.G = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var22, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                                } else if (i132 == 3) {
                                    cqVar.G = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i132 == 4) {
                                    cqVar.G = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.l0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (cqVar.G < cqVar.H) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                                }
                                int i14 = cqVar.O;
                                if (i14 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i14];
                                    for (int i15 = i14 + 1; i15 < colorPicker$RadioButtonArr2.length; i15++) {
                                        colorPicker$RadioButtonArr2[i15 - 1] = colorPicker$RadioButtonArr2[i15];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i16 = cqVar.P;
                                if (i16 >= 0 && i16 < cqVar.O) {
                                    colorPicker$RadioButtonArr2[i16].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[cqVar.G - 1].callOnClick();
                                }
                                for (int i17 = 0; i17 < colorPicker$RadioButtonArr2.length; i17++) {
                                    if (i17 < cqVar.G) {
                                        int i18 = colorPicker$RadioButtonArr2[i17].f26346e;
                                        if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        bqVar3.n0(i18, i17, z13);
                                    } else {
                                        if (i17 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        bqVar3.n0(0, i17, z12);
                                    }
                                }
                                cqVar.f27553y = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                                cqVar.f27553y.playTogether(arrayList2);
                                cqVar.f27553y.setDuration(180L);
                                cqVar.f27553y.setInterpolator(gr.f28845g);
                                cqVar.f27553y.addListener(new aq(cqVar));
                                cqVar.f27553y.start();
                                return;
                            }
                            return;
                        case 2:
                            cq.a(cqVar, view);
                            return;
                        default:
                            cqVar.E.M(null, null);
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
        int i9 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.v;
            if (i9 < colorPicker$RadioButtonArr.length) {
                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i9];
                if (colorPicker$RadioButton2 == colorPicker$RadioButton) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                colorPicker$RadioButton2.d = z10;
                colorPicker$RadioButton2.b(true);
                if (z10) {
                    cqVar.P = cqVar.O;
                    cqVar.O = i9;
                }
                i9++;
            } else {
                int i10 = colorPicker$RadioButton.f26346e;
                cqVar.setColorInner(i10);
                cqVar.A[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i10)), Byte.valueOf((byte) Color.green(i10)), Byte.valueOf((byte) Color.blue(i10))).toUpperCase());
                return;
            }
        }
    }

    public static int d(int i9) {
        float[] fArr = new float[3];
        Color.colorToHSV(i9, fArr);
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

    public void setColorInner(int i9) {
        Color.colorToHSV(i9, this.J);
        int H0 = this.f27543a.H0(this.O);
        if (H0 == 0 || H0 != i9) {
            h();
        }
        this.L = null;
        invalidate();
    }

    public final void c(Canvas canvas, int i9, int i10, int i11, boolean z10) {
        float f10;
        float f11;
        float f12;
        if (z10) {
            f10 = 12.0f;
        } else {
            f10 = 16.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        Drawable drawable = this.f27547f;
        drawable.setBounds(i9 - dp, i10 - dp, i9 + dp, dp + i10);
        drawable.draw(canvas);
        Paint paint = this.d;
        paint.setColor(-1);
        float f13 = i9;
        float f14 = i10;
        if (z10) {
            f11 = 11.0f;
        } else {
            f11 = 15.0f;
        }
        canvas.drawCircle(f13, f14, AndroidUtilities.dp(f11), paint);
        paint.setColor(i11);
        if (z10) {
            f12 = 9.0f;
        } else {
            f12 = 13.0f;
        }
        canvas.drawCircle(f13, f14, AndroidUtilities.dp(f12), paint);
    }

    public final void e(int i9, int i10) {
        if (!this.f27549r) {
            this.f27549r = true;
            if (this.O == i10) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i9)), Byte.valueOf((byte) Color.green(i9)), Byte.valueOf((byte) Color.blue(i9))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.A;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.v[i10].a(i9);
            this.f27549r = false;
        }
        setColorInner(i9);
    }

    public final void f(int i9, int i10, int i11, boolean z10) {
        boolean z11;
        if (i9 != this.F) {
            this.P = 0;
            this.O = 0;
            for (int i12 = 0; i12 < 4; i12++) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.v[i12];
                if (i12 == this.O) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                colorPicker$RadioButton.d = z11;
                colorPicker$RadioButton.b(true);
            }
        }
        this.H = i10;
        this.F = i9;
        this.h = z10;
        this.G = i11;
        ImageView imageView = this.C;
        if (i11 == 1) {
            imageView.setTranslationX(0.0f);
        } else if (i11 == 2) {
            imageView.setTranslationX(AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f));
        } else if (i11 == 3) {
            imageView.setTranslationX(org.telegram.messenger.l0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.l0.D(13.0f, 3, AndroidUtilities.dp(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.l0 l0Var = this.B;
        org.telegram.ui.ActionBar.w0 w0Var = this.E;
        if (w0Var != null) {
            if (i9 == 1) {
                w0Var.setVisibility(0);
            } else {
                w0Var.setVisibility(8);
                l0Var.setTranslationX(0.0f);
            }
        }
        if (i10 <= 1) {
            imageView.setVisibility(8);
            l0Var.setVisibility(8);
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
                l0Var.setVisibility(0);
                l0Var.setScaleX(1.0f);
                l0Var.setScaleY(1.0f);
                l0Var.setAlpha(1.0f);
            } else {
                l0Var.setVisibility(8);
            }
        }
        this.f27552x.invalidate();
        g(getMeasuredWidth(), null, false);
    }

    public final void g(int i9, ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        boolean z11;
        float f12;
        int i10 = this.G;
        int D = org.telegram.messenger.l0.D(13.0f, i10 - 1, AndroidUtilities.dp(30.0f) * i10);
        FrameLayout frameLayout = this.f27551w;
        int left = frameLayout.getLeft() + D;
        if (this.F == 1) {
            f10 = 50.0f;
        } else {
            f10 = 0.0f;
        }
        int dp = i9 - AndroidUtilities.dp(f10);
        if (left > dp) {
            f11 = left - dp;
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
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = this.v;
            if (i11 < colorPicker$RadioButtonArr.length) {
                if (colorPicker$RadioButtonArr[i11].getTag(R.id.index_tag) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i13 = this.G;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                Property property4 = View.ALPHA;
                if (i11 < i13) {
                    colorPicker$RadioButtonArr[i11].setVisibility(0);
                    if (arrayList != null) {
                        if (!z11) {
                            f12 = 30.0f;
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property4, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property3, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property2, 1.0f));
                        } else {
                            f12 = 30.0f;
                        }
                        if (!z10 && (z10 || i11 == this.G - 1)) {
                            colorPicker$RadioButtonArr[i11].setTranslationX(i12);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property, i12));
                        }
                    } else {
                        f12 = 30.0f;
                        colorPicker$RadioButtonArr[i11].setVisibility(0);
                        if (this.f27553y == null) {
                            colorPicker$RadioButtonArr[i11].setAlpha(1.0f);
                            colorPicker$RadioButtonArr[i11].setScaleX(1.0f);
                            colorPicker$RadioButtonArr[i11].setScaleY(1.0f);
                        }
                        colorPicker$RadioButtonArr[i11].setTranslationX(i12);
                    }
                    colorPicker$RadioButtonArr[i11].setTag(R.id.index_tag, 1);
                } else {
                    f12 = 30.0f;
                    if (arrayList != null) {
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property4, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], property2, 0.0f));
                        }
                    } else {
                        colorPicker$RadioButtonArr[i11].setVisibility(4);
                        if (this.f27553y == null) {
                            colorPicker$RadioButtonArr[i11].setAlpha(0.0f);
                            colorPicker$RadioButtonArr[i11].setScaleX(0.0f);
                            colorPicker$RadioButtonArr[i11].setScaleY(0.0f);
                        }
                    }
                    if (!z10) {
                        colorPicker$RadioButtonArr[i11].setTranslationX(i12);
                    }
                    colorPicker$RadioButtonArr[i11].setTag(R.id.index_tag, null);
                }
                i12 = org.telegram.messenger.l0.C(13.0f, AndroidUtilities.dp(f12), i12);
                i11++;
            } else {
                return;
            }
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
        float f10;
        float f11;
        org.telegram.ui.ActionBar.l0 l0Var = this.B;
        if (l0Var == null) {
            return;
        }
        if (l0Var.getTag() != null) {
            f10 = 0.0f;
        } else {
            f10 = this.S;
        }
        if (l0Var.getTag() != null) {
            f11 = 1.0f;
        } else {
            f11 = this.T;
        }
        float[] fArr = this.J;
        float f12 = fArr[2];
        if (f10 == 0.0f && f11 == 1.0f) {
            this.U = 0.0f;
            this.V = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f12;
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(HSVToColor);
        float max = Math.max(0.0f, Math.min(f10 / computePerceivedBrightness, 1.0f));
        this.U = max;
        this.V = Math.max(max, Math.min(f11 / computePerceivedBrightness, 1.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f27552x.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i9;
        int dp = AndroidUtilities.dp(45.0f);
        float f11 = dp;
        canvas.drawBitmap(this.f27550s, 0.0f, f11, (Paint) null);
        int height = this.f27550s.getHeight() + dp;
        Paint paint = this.f27546e;
        canvas.drawRect(0.0f, f11, getMeasuredWidth(), dp + 1, paint);
        canvas.drawRect(0.0f, height - 1, getMeasuredWidth(), height, paint);
        float[] fArr = this.J;
        float f12 = fArr[0];
        float[] fArr2 = this.K;
        fArr2[0] = f12;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int z10 = (int) e2.c.z(1.0f, fArr[1], this.f27550s.getHeight(), f11);
        if (!this.M) {
            int dp2 = AndroidUtilities.dp(16.0f);
            float interpolation = gr.f28845g.getInterpolation(this.Q);
            if (measuredWidth < dp2) {
                measuredWidth = (int) (((dp2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - dp2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - dp2)) * interpolation));
            }
            if (z10 < dp + dp2) {
                z10 = (int) ((interpolation * (i9 - z10)) + z10);
            } else if (z10 > (this.f27550s.getHeight() + dp) - dp2) {
                z10 = (int) (z10 - (interpolation * (z10 - ((this.f27550s.getHeight() + dp) - dp2))));
            }
        }
        c(canvas, measuredWidth, z10, Color.HSVToColor(fArr2), false);
        RectF rectF = this.f27548n;
        rectF.set(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(26.0f) + height, getMeasuredWidth() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(34.0f) + height);
        LinearGradient linearGradient = this.L;
        Paint paint2 = this.f27545c;
        if (linearGradient == null) {
            fArr2[2] = this.U;
            int HSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.V;
            int HSVToColor2 = Color.HSVToColor(fArr2);
            float f13 = rectF.left;
            float f14 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f13, f14, rectF.right, f14, new int[]{HSVToColor2, HSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
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
        if (!this.M && this.Q < 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.R;
            this.R = elapsedRealtime;
            float f16 = (((float) j10) / 180.0f) + this.Q;
            this.Q = f16;
            if (f16 > 1.0f) {
                this.Q = 1.0f;
            }
            invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        g(getMeasuredWidth(), null, false);
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        if (this.I != i9) {
            this.I = i9;
            int dp = AndroidUtilities.dp(180.0f);
            Bitmap createBitmap = Bitmap.createBitmap(i9, dp, Bitmap.Config.ARGB_8888);
            float f10 = i9;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f11 = dp;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, dp / 3, 0.0f, f11, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.f27544b;
            paint.setShader(composeShader);
            new Canvas(createBitmap).drawRect(0.0f, 0.0f, f10, f11, paint);
            this.f27550s = createBitmap;
            this.L = null;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cq.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setHasChanges(boolean z10) {
        Integer num;
        float f10;
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
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, View.ALPHA, f10));
            animatorSet.addListener(new u9(6, this, z10));
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(180L);
            animatorSet.start();
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

    public void setResourcesProvider(org.telegram.ui.ActionBar.b6 b6Var) {
        this.W = b6Var;
    }
}
