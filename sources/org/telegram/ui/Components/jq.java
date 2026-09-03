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
public class jq extends FrameLayout {
    public static final int f26023b0 = 0;
    public final EditTextBoldCursor[] B;
    public final org.telegram.ui.ActionBar.l0 C;
    public final ImageView D;
    public final TextView E;
    public final org.telegram.ui.ActionBar.w0 F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final float[] K;
    public final float[] L;
    public LinearGradient M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public float R;
    public long S;
    public float T;
    public float U;
    public float V;
    public float W;
    public final iq f26024a;
    public org.telegram.ui.ActionBar.f6 f26025a0;
    public final Paint f26026b;
    public final Paint f26027c;
    public final Paint d;
    public final Paint e;
    public final Drawable f26028f;
    public boolean h;
    public final RectF f26029n;
    public boolean f26030r;
    public Bitmap f26031s;
    public final ColorPicker$RadioButton[] v;
    public final FrameLayout f26032w;
    public final cg.u f26033x;
    public AnimatorSet f26034y;

    public jq(Context context, boolean z4, iq iqVar) {
        super(context);
        boolean z10;
        this.f26029n = new RectF();
        this.v = new ColorPicker$RadioButton[4];
        this.H = 1;
        this.I = 1;
        this.K = new float[]{0.0f, 0.0f, 1.0f};
        this.L = new float[3];
        this.R = 1.0f;
        this.T = 0.0f;
        this.U = 1.0f;
        this.V = 0.0f;
        this.W = 1.0f;
        this.f26024a = iqVar;
        this.B = new EditTextBoldCursor[2];
        setWillNotDraw(false);
        this.f26028f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        this.d = new Paint(1);
        this.f26026b = new Paint(5);
        this.f26027c = new Paint(5);
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        cg.u uVar = new cg.u(this, context);
        this.f26033x = uVar;
        uVar.setOrientation(0);
        addView(uVar, k7.b6.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        uVar.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26032w = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, k7.b6.d(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        for (int i10 = 0; i10 < 4; i10++) {
            this.v[i10] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.v[i10];
            if (this.P == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            colorPicker$RadioButton.d = z10;
            colorPicker$RadioButton.b(false);
            this.f26032w.addView(this.v[i10], k7.b6.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.v[i10].setOnClickListener(new View.OnClickListener(this) {
                public final jq f24669b;

                {
                    this.f24669b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    boolean z11;
                    boolean z12;
                    int i12 = r2;
                    jq jqVar = this.f24669b;
                    switch (i12) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            iq iqVar2 = jqVar.f26024a;
                            org.telegram.ui.ActionBar.l0 l0Var = jqVar.C;
                            ImageView imageView = jqVar.D;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = jqVar.v;
                            if (jqVar.f26034y == null) {
                                int i13 = jqVar.H;
                                if (i13 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i11 = 0;
                                        colorPicker$RadioButton2.a(jq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i11 = 0;
                                    }
                                    if (jqVar.h) {
                                        iqVar2.r0(colorPicker$RadioButtonArr[i11].e, i11, true);
                                    }
                                    iqVar2.r0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    jqVar.H = 2;
                                } else if (i13 == 2) {
                                    jqVar.H = 3;
                                    if (colorPicker$RadioButtonArr[2].e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    iqVar2.r0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i13 == 3) {
                                    jqVar.H = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(jq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    iqVar2.r0(colorPicker$RadioButtonArr[3].e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (jqVar.H < jqVar.I) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, e2.c.e(jqVar.H, 1, AndroidUtilities.dp(13.0f), (jqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, e2.c.e(jqVar.H, 1, AndroidUtilities.dp(13.0f), (jqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 0.0f));
                                }
                                if (jqVar.H > 1) {
                                    if (l0Var.getVisibility() != 0) {
                                        l0Var.setScaleX(0.0f);
                                        l0Var.setScaleY(0.0f);
                                    }
                                    l0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[jqVar.H - 1].callOnClick();
                                jqVar.f26034y = new AnimatorSet();
                                jqVar.g(jqVar.getMeasuredWidth(), arrayList, false);
                                jqVar.f26034y.playTogether(arrayList);
                                jqVar.f26034y.setDuration(180L);
                                jqVar.f26034y.setInterpolator(mr.f27123g);
                                jqVar.f26034y.addListener(new a9(jqVar, 13));
                                jqVar.f26034y.start();
                                return;
                            }
                            return;
                        case 1:
                            iq iqVar3 = jqVar.f26024a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.l0 l0Var2 = jqVar.C;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = jqVar.v;
                            ImageView imageView2 = jqVar.D;
                            if (jqVar.f26034y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i14 = jqVar.H;
                                if (i14 == 2) {
                                    jqVar.H = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, 0.0f));
                                } else if (i14 == 3) {
                                    jqVar.H = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i14 == 4) {
                                    jqVar.H = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, org.telegram.messenger.y3.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (jqVar.H < jqVar.I) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 0.0f));
                                }
                                int i15 = jqVar.P;
                                if (i15 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                    for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                        colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i17 = jqVar.Q;
                                if (i17 >= 0 && i17 < jqVar.P) {
                                    colorPicker$RadioButtonArr2[i17].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[jqVar.H - 1].callOnClick();
                                }
                                for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                    if (i18 < jqVar.H) {
                                        int i19 = colorPicker$RadioButtonArr2[i18].e;
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        iqVar3.r0(i19, i18, z12);
                                    } else {
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        iqVar3.r0(0, i18, z11);
                                    }
                                }
                                jqVar.f26034y = new AnimatorSet();
                                jqVar.g(jqVar.getMeasuredWidth(), arrayList2, true);
                                jqVar.f26034y.playTogether(arrayList2);
                                jqVar.f26034y.setDuration(180L);
                                jqVar.f26034y.setInterpolator(mr.f27123g);
                                jqVar.f26034y.addListener(new hq(jqVar));
                                jqVar.f26034y.start();
                                return;
                            }
                            return;
                        case 2:
                            jq.a(jqVar, view);
                            return;
                        default:
                            jqVar.F.M(null, null);
                            return;
                    }
                }
            });
        }
        int i11 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.B;
            if (i11 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i11 % 2 == 0) {
                editTextBoldCursorArr[i11] = new fq(this, context, i11, 0);
                this.B[i11].setBackgroundDrawable(null);
                this.B[i11].setText("#");
                this.B[i11].setEnabled(false);
                this.B[i11].setFocusable(false);
                this.B[i11].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.f26033x.addView(this.B[i11], k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i11] = new fq(this, context, i11, 1);
                this.B[i11].setBackgroundDrawable(null);
                this.B[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.B[i11].setHint("8BC6ED");
                this.B[i11].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.f26033x.addView(this.B[i11], k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.B[i11].addTextChangedListener(new gq(this, i11));
                this.B[i11].setOnEditorActionListener(new cg.a0(3));
            }
            this.B[i11].setTextSize(1, 16.0f);
            this.B[i11].setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, this.f26025a0));
            EditTextBoldCursor editTextBoldCursor = this.B[i11];
            int i12 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f26025a0));
            this.B[i11].setCursorColor(org.telegram.ui.ActionBar.j6.v0(i12, this.f26025a0));
            this.B[i11].setCursorSize(AndroidUtilities.dp(18.0f));
            this.B[i11].setCursorWidth(1.5f);
            this.B[i11].setSingleLine(true);
            this.B[i11].setGravity(19);
            this.B[i11].setHeaderHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, this.f26025a0));
            this.B[i11].setTransformHintToHeader(true);
            this.B[i11].setInputType(524416);
            this.B[i11].setImeOptions(268435462);
            if (i11 == 1) {
                this.B[i11].requestFocus();
            } else if (i11 == 2 || i11 == 3) {
                this.B[i11].setVisibility(8);
            }
            i11++;
        }
        ImageView imageView = new ImageView(getContext());
        this.D = imageView;
        int i13 = org.telegram.ui.ActionBar.j6.I5;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i13, this.f26025a0), 1, -1));
        imageView.setImageResource(R.drawable.msg_add);
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i14, this.f26025a0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final jq f24669b;

            {
                this.f24669b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112;
                boolean z11;
                boolean z12;
                int i122 = r2;
                jq jqVar = this.f24669b;
                switch (i122) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        iq iqVar2 = jqVar.f26024a;
                        org.telegram.ui.ActionBar.l0 l0Var = jqVar.C;
                        ImageView imageView2 = jqVar.D;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = jqVar.v;
                        if (jqVar.f26034y == null) {
                            int i132 = jqVar.H;
                            if (i132 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i112 = 0;
                                    colorPicker$RadioButton2.a(jq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i112 = 0;
                                }
                                if (jqVar.h) {
                                    iqVar2.r0(colorPicker$RadioButtonArr[i112].e, i112, true);
                                }
                                iqVar2.r0(colorPicker$RadioButtonArr[1].e, 1, true);
                                jqVar.H = 2;
                            } else if (i132 == 2) {
                                jqVar.H = 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                iqVar2.r0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i132 == 3) {
                                jqVar.H = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(jq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                iqVar2.r0(colorPicker$RadioButtonArr[3].e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (jqVar.H < jqVar.I) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, e2.c.e(jqVar.H, 1, AndroidUtilities.dp(13.0f), (jqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, e2.c.e(jqVar.H, 1, AndroidUtilities.dp(13.0f), (jqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (jqVar.H > 1) {
                                if (l0Var.getVisibility() != 0) {
                                    l0Var.setScaleX(0.0f);
                                    l0Var.setScaleY(0.0f);
                                }
                                l0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[jqVar.H - 1].callOnClick();
                            jqVar.f26034y = new AnimatorSet();
                            jqVar.g(jqVar.getMeasuredWidth(), arrayList, false);
                            jqVar.f26034y.playTogether(arrayList);
                            jqVar.f26034y.setDuration(180L);
                            jqVar.f26034y.setInterpolator(mr.f27123g);
                            jqVar.f26034y.addListener(new a9(jqVar, 13));
                            jqVar.f26034y.start();
                            return;
                        }
                        return;
                    case 1:
                        iq iqVar3 = jqVar.f26024a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.l0 l0Var2 = jqVar.C;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = jqVar.v;
                        ImageView imageView22 = jqVar.D;
                        if (jqVar.f26034y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i142 = jqVar.H;
                            if (i142 == 2) {
                                jqVar.H = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i142 == 3) {
                                jqVar.H = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i142 == 4) {
                                jqVar.H = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.y3.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (jqVar.H < jqVar.I) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i15 = jqVar.P;
                            if (i15 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                    colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i17 = jqVar.Q;
                            if (i17 >= 0 && i17 < jqVar.P) {
                                colorPicker$RadioButtonArr2[i17].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[jqVar.H - 1].callOnClick();
                            }
                            for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                if (i18 < jqVar.H) {
                                    int i19 = colorPicker$RadioButtonArr2[i18].e;
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    iqVar3.r0(i19, i18, z12);
                                } else {
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    iqVar3.r0(0, i18, z11);
                                }
                            }
                            jqVar.f26034y = new AnimatorSet();
                            jqVar.g(jqVar.getMeasuredWidth(), arrayList2, true);
                            jqVar.f26034y.playTogether(arrayList2);
                            jqVar.f26034y.setDuration(180L);
                            jqVar.f26034y.setInterpolator(mr.f27123g);
                            jqVar.f26034y.addListener(new hq(jqVar));
                            jqVar.f26034y.start();
                            return;
                        }
                        return;
                    case 2:
                        jq.a(jqVar, view);
                        return;
                    default:
                        jqVar.F.M(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.Add));
        addView(imageView, k7.b6.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l0 l0Var = new org.telegram.ui.ActionBar.l0(this, getContext(), 1);
        this.C = l0Var;
        l0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i13, this.f26025a0), 1, -1));
        l0Var.setImageResource(R.drawable.msg_close);
        l0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, this.f26025a0), mode));
        l0Var.setAlpha(0.0f);
        l0Var.setScaleX(0.0f);
        l0Var.setScaleY(0.0f);
        l0Var.setScaleType(scaleType);
        l0Var.setVisibility(4);
        l0Var.setOnClickListener(new View.OnClickListener(this) {
            public final jq f24669b;

            {
                this.f24669b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112;
                boolean z11;
                boolean z12;
                int i122 = r2;
                jq jqVar = this.f24669b;
                switch (i122) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        iq iqVar2 = jqVar.f26024a;
                        org.telegram.ui.ActionBar.l0 l0Var2 = jqVar.C;
                        ImageView imageView2 = jqVar.D;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = jqVar.v;
                        if (jqVar.f26034y == null) {
                            int i132 = jqVar.H;
                            if (i132 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i112 = 0;
                                    colorPicker$RadioButton2.a(jq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i112 = 0;
                                }
                                if (jqVar.h) {
                                    iqVar2.r0(colorPicker$RadioButtonArr[i112].e, i112, true);
                                }
                                iqVar2.r0(colorPicker$RadioButtonArr[1].e, 1, true);
                                jqVar.H = 2;
                            } else if (i132 == 2) {
                                jqVar.H = 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                iqVar2.r0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i132 == 3) {
                                jqVar.H = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(jq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                iqVar2.r0(colorPicker$RadioButtonArr[3].e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (jqVar.H < jqVar.I) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, e2.c.e(jqVar.H, 1, AndroidUtilities.dp(13.0f), (jqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, e2.c.e(jqVar.H, 1, AndroidUtilities.dp(13.0f), (jqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (jqVar.H > 1) {
                                if (l0Var2.getVisibility() != 0) {
                                    l0Var2.setScaleX(0.0f);
                                    l0Var2.setScaleY(0.0f);
                                }
                                l0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[jqVar.H - 1].callOnClick();
                            jqVar.f26034y = new AnimatorSet();
                            jqVar.g(jqVar.getMeasuredWidth(), arrayList, false);
                            jqVar.f26034y.playTogether(arrayList);
                            jqVar.f26034y.setDuration(180L);
                            jqVar.f26034y.setInterpolator(mr.f27123g);
                            jqVar.f26034y.addListener(new a9(jqVar, 13));
                            jqVar.f26034y.start();
                            return;
                        }
                        return;
                    case 1:
                        iq iqVar3 = jqVar.f26024a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.l0 l0Var22 = jqVar.C;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = jqVar.v;
                        ImageView imageView22 = jqVar.D;
                        if (jqVar.f26034y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i142 = jqVar.H;
                            if (i142 == 2) {
                                jqVar.H = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var22, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i142 == 3) {
                                jqVar.H = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i142 == 4) {
                                jqVar.H = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.y3.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (jqVar.H < jqVar.I) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i15 = jqVar.P;
                            if (i15 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                    colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i17 = jqVar.Q;
                            if (i17 >= 0 && i17 < jqVar.P) {
                                colorPicker$RadioButtonArr2[i17].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[jqVar.H - 1].callOnClick();
                            }
                            for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                if (i18 < jqVar.H) {
                                    int i19 = colorPicker$RadioButtonArr2[i18].e;
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    iqVar3.r0(i19, i18, z12);
                                } else {
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    iqVar3.r0(0, i18, z11);
                                }
                            }
                            jqVar.f26034y = new AnimatorSet();
                            jqVar.g(jqVar.getMeasuredWidth(), arrayList2, true);
                            jqVar.f26034y.playTogether(arrayList2);
                            jqVar.f26034y.setDuration(180L);
                            jqVar.f26034y.setInterpolator(mr.f27123g);
                            jqVar.f26034y.addListener(new hq(jqVar));
                            jqVar.f26034y.start();
                            return;
                        }
                        return;
                    case 2:
                        jq.a(jqVar, view);
                        return;
                    default:
                        jqVar.F.M(null, null);
                        return;
                }
            }
        });
        l0Var.setContentDescription(LocaleController.getString(R.string.ClearButton));
        addView(l0Var, k7.b6.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, this.f26025a0));
        addView(textView, k7.b6.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new dg.m(11));
        if (z4) {
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.v0(i14, this.f26025a0));
            this.F = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            w0Var.e(1, R.drawable.msg_edit, LocaleController.getString(R.string.OpenInEditor));
            w0Var.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareTheme));
            w0Var.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteTheme));
            w0Var.setMenuYOffset(-AndroidUtilities.dp(80.0f));
            w0Var.setSubMenuOpenSide(2);
            w0Var.setDelegate(new t(this, 26));
            w0Var.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
            w0Var.setTranslationX(AndroidUtilities.dp(6.0f));
            w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i13, this.f26025a0), 1, -1));
            addView(w0Var, k7.b6.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            w0Var.setOnClickListener(new View.OnClickListener(this) {
                public final jq f24669b;

                {
                    this.f24669b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112;
                    boolean z11;
                    boolean z12;
                    int i122 = r2;
                    jq jqVar = this.f24669b;
                    switch (i122) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            iq iqVar2 = jqVar.f26024a;
                            org.telegram.ui.ActionBar.l0 l0Var2 = jqVar.C;
                            ImageView imageView2 = jqVar.D;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = jqVar.v;
                            if (jqVar.f26034y == null) {
                                int i132 = jqVar.H;
                                if (i132 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i112 = 0;
                                        colorPicker$RadioButton2.a(jq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i112 = 0;
                                    }
                                    if (jqVar.h) {
                                        iqVar2.r0(colorPicker$RadioButtonArr[i112].e, i112, true);
                                    }
                                    iqVar2.r0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    jqVar.H = 2;
                                } else if (i132 == 2) {
                                    jqVar.H = 3;
                                    if (colorPicker$RadioButtonArr[2].e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    iqVar2.r0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i132 == 3) {
                                    jqVar.H = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(jq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    iqVar2.r0(colorPicker$RadioButtonArr[3].e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (jqVar.H < jqVar.I) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, e2.c.e(jqVar.H, 1, AndroidUtilities.dp(13.0f), (jqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, e2.c.e(jqVar.H, 1, AndroidUtilities.dp(13.0f), (jqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                                }
                                if (jqVar.H > 1) {
                                    if (l0Var2.getVisibility() != 0) {
                                        l0Var2.setScaleX(0.0f);
                                        l0Var2.setScaleY(0.0f);
                                    }
                                    l0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[jqVar.H - 1].callOnClick();
                                jqVar.f26034y = new AnimatorSet();
                                jqVar.g(jqVar.getMeasuredWidth(), arrayList, false);
                                jqVar.f26034y.playTogether(arrayList);
                                jqVar.f26034y.setDuration(180L);
                                jqVar.f26034y.setInterpolator(mr.f27123g);
                                jqVar.f26034y.addListener(new a9(jqVar, 13));
                                jqVar.f26034y.start();
                                return;
                            }
                            return;
                        case 1:
                            iq iqVar3 = jqVar.f26024a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.l0 l0Var22 = jqVar.C;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = jqVar.v;
                            ImageView imageView22 = jqVar.D;
                            if (jqVar.f26034y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i142 = jqVar.H;
                                if (i142 == 2) {
                                    jqVar.H = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var22, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                                } else if (i142 == 3) {
                                    jqVar.H = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i142 == 4) {
                                    jqVar.H = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.y3.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (jqVar.H < jqVar.I) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                                }
                                int i15 = jqVar.P;
                                if (i15 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                    for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                        colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i17 = jqVar.Q;
                                if (i17 >= 0 && i17 < jqVar.P) {
                                    colorPicker$RadioButtonArr2[i17].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[jqVar.H - 1].callOnClick();
                                }
                                for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                    if (i18 < jqVar.H) {
                                        int i19 = colorPicker$RadioButtonArr2[i18].e;
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        iqVar3.r0(i19, i18, z12);
                                    } else {
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        iqVar3.r0(0, i18, z11);
                                    }
                                }
                                jqVar.f26034y = new AnimatorSet();
                                jqVar.g(jqVar.getMeasuredWidth(), arrayList2, true);
                                jqVar.f26034y.playTogether(arrayList2);
                                jqVar.f26034y.setDuration(180L);
                                jqVar.f26034y.setInterpolator(mr.f27123g);
                                jqVar.f26034y.addListener(new hq(jqVar));
                                jqVar.f26034y.start();
                                return;
                            }
                            return;
                        case 2:
                            jq.a(jqVar, view);
                            return;
                        default:
                            jqVar.F.M(null, null);
                            return;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(jq jqVar, View view) {
        boolean z4;
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i10 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = jqVar.v;
            if (i10 < colorPicker$RadioButtonArr.length) {
                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i10];
                if (colorPicker$RadioButton2 == colorPicker$RadioButton) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                colorPicker$RadioButton2.d = z4;
                colorPicker$RadioButton2.b(true);
                if (z4) {
                    jqVar.Q = jqVar.P;
                    jqVar.P = i10;
                }
                i10++;
            } else {
                int i11 = colorPicker$RadioButton.e;
                jqVar.setColorInner(i11);
                jqVar.B[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i11)), Byte.valueOf((byte) Color.green(i11)), Byte.valueOf((byte) Color.blue(i11))).toUpperCase());
                return;
            }
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
        return Math.max(this.V, Math.min(this.K[2], this.W));
    }

    public void setColorInner(int i10) {
        Color.colorToHSV(i10, this.K);
        int H0 = this.f26024a.H0(this.P);
        if (H0 == 0 || H0 != i10) {
            h();
        }
        this.M = null;
        invalidate();
    }

    public final void c(Canvas canvas, int i10, int i11, int i12, boolean z4) {
        float f10;
        float f11;
        float f12;
        if (z4) {
            f10 = 12.0f;
        } else {
            f10 = 16.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        Drawable drawable = this.f26028f;
        drawable.setBounds(i10 - dp, i11 - dp, i10 + dp, dp + i11);
        drawable.draw(canvas);
        Paint paint = this.d;
        paint.setColor(-1);
        float f13 = i10;
        float f14 = i11;
        if (z4) {
            f11 = 11.0f;
        } else {
            f11 = 15.0f;
        }
        canvas.drawCircle(f13, f14, AndroidUtilities.dp(f11), paint);
        paint.setColor(i12);
        if (z4) {
            f12 = 9.0f;
        } else {
            f12 = 13.0f;
        }
        canvas.drawCircle(f13, f14, AndroidUtilities.dp(f12), paint);
    }

    public final void e(int i10, int i11) {
        if (!this.f26030r) {
            this.f26030r = true;
            if (this.P == i11) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i10)), Byte.valueOf((byte) Color.green(i10)), Byte.valueOf((byte) Color.blue(i10))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.B;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.v[i11].a(i10);
            this.f26030r = false;
        }
        setColorInner(i10);
    }

    public final void f(int i10, int i11, int i12, boolean z4) {
        boolean z10;
        if (i10 != this.G) {
            this.Q = 0;
            this.P = 0;
            for (int i13 = 0; i13 < 4; i13++) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.v[i13];
                if (i13 == this.P) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                colorPicker$RadioButton.d = z10;
                colorPicker$RadioButton.b(true);
            }
        }
        this.I = i11;
        this.G = i10;
        this.h = z4;
        this.H = i12;
        ImageView imageView = this.D;
        if (i12 == 1) {
            imageView.setTranslationX(0.0f);
        } else if (i12 == 2) {
            imageView.setTranslationX(AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f));
        } else if (i12 == 3) {
            imageView.setTranslationX(org.telegram.messenger.y3.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.y3.D(13.0f, 3, AndroidUtilities.dp(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.l0 l0Var = this.C;
        org.telegram.ui.ActionBar.w0 w0Var = this.F;
        if (w0Var != null) {
            if (i10 == 1) {
                w0Var.setVisibility(0);
            } else {
                w0Var.setVisibility(8);
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
        this.f26033x.invalidate();
        g(getMeasuredWidth(), null, false);
    }

    public final void g(int i10, ArrayList arrayList, boolean z4) {
        float f10;
        float f11;
        boolean z10;
        float f12;
        int i11 = this.H;
        int D = org.telegram.messenger.y3.D(13.0f, i11 - 1, AndroidUtilities.dp(30.0f) * i11);
        FrameLayout frameLayout = this.f26032w;
        int left = frameLayout.getLeft() + D;
        if (this.G == 1) {
            f10 = 50.0f;
        } else {
            f10 = 0.0f;
        }
        int dp = i10 - AndroidUtilities.dp(f10);
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
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = this.v;
            if (i12 < colorPicker$RadioButtonArr.length) {
                if (colorPicker$RadioButtonArr[i12].getTag(R.id.index_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i14 = this.H;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                Property property4 = View.ALPHA;
                if (i12 < i14) {
                    colorPicker$RadioButtonArr[i12].setVisibility(0);
                    if (arrayList != null) {
                        if (!z10) {
                            f12 = 30.0f;
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property4, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property3, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property2, 1.0f));
                        } else {
                            f12 = 30.0f;
                        }
                        if (!z4 && (z4 || i12 == this.H - 1)) {
                            colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property, i13));
                        }
                    } else {
                        f12 = 30.0f;
                        colorPicker$RadioButtonArr[i12].setVisibility(0);
                        if (this.f26034y == null) {
                            colorPicker$RadioButtonArr[i12].setAlpha(1.0f);
                            colorPicker$RadioButtonArr[i12].setScaleX(1.0f);
                            colorPicker$RadioButtonArr[i12].setScaleY(1.0f);
                        }
                        colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                    }
                    colorPicker$RadioButtonArr[i12].setTag(R.id.index_tag, 1);
                } else {
                    f12 = 30.0f;
                    if (arrayList != null) {
                        if (z10) {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property4, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property2, 0.0f));
                        }
                    } else {
                        colorPicker$RadioButtonArr[i12].setVisibility(4);
                        if (this.f26034y == null) {
                            colorPicker$RadioButtonArr[i12].setAlpha(0.0f);
                            colorPicker$RadioButtonArr[i12].setScaleX(0.0f);
                            colorPicker$RadioButtonArr[i12].setScaleY(0.0f);
                        }
                    }
                    if (!z4) {
                        colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                    }
                    colorPicker$RadioButtonArr[i12].setTag(R.id.index_tag, null);
                }
                i13 = org.telegram.messenger.y3.C(13.0f, AndroidUtilities.dp(f12), i13);
                i12++;
            } else {
                return;
            }
        }
    }

    public int getColor() {
        float[] fArr = this.K;
        float f10 = fArr[0];
        float[] fArr2 = this.L;
        fArr2[0] = f10;
        fArr2[1] = fArr[1];
        fArr2[2] = getBrightness();
        return (Color.HSVToColor(fArr2) & 16777215) | (-16777216);
    }

    public final void h() {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.l0 l0Var = this.C;
        if (l0Var == null) {
            return;
        }
        if (l0Var.getTag() != null) {
            f10 = 0.0f;
        } else {
            f10 = this.T;
        }
        if (l0Var.getTag() != null) {
            f11 = 1.0f;
        } else {
            f11 = this.U;
        }
        float[] fArr = this.K;
        float f12 = fArr[2];
        if (f10 == 0.0f && f11 == 1.0f) {
            this.V = 0.0f;
            this.W = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f12;
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(HSVToColor);
        float max = Math.max(0.0f, Math.min(f10 / computePerceivedBrightness, 1.0f));
        this.V = max;
        this.W = Math.max(max, Math.min(f11 / computePerceivedBrightness, 1.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f26033x.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i10;
        int dp = AndroidUtilities.dp(45.0f);
        float f11 = dp;
        canvas.drawBitmap(this.f26031s, 0.0f, f11, (Paint) null);
        int height = this.f26031s.getHeight() + dp;
        Paint paint = this.e;
        canvas.drawRect(0.0f, f11, getMeasuredWidth(), dp + 1, paint);
        canvas.drawRect(0.0f, height - 1, getMeasuredWidth(), height, paint);
        float[] fArr = this.K;
        float f12 = fArr[0];
        float[] fArr2 = this.L;
        fArr2[0] = f12;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int w10 = (int) e2.c.w(1.0f, fArr[1], this.f26031s.getHeight(), f11);
        if (!this.N) {
            int dp2 = AndroidUtilities.dp(16.0f);
            float interpolation = mr.f27123g.getInterpolation(this.R);
            if (measuredWidth < dp2) {
                measuredWidth = (int) (((dp2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - dp2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - dp2)) * interpolation));
            }
            if (w10 < dp + dp2) {
                w10 = (int) ((interpolation * (i10 - w10)) + w10);
            } else if (w10 > (this.f26031s.getHeight() + dp) - dp2) {
                w10 = (int) (w10 - (interpolation * (w10 - ((this.f26031s.getHeight() + dp) - dp2))));
            }
        }
        c(canvas, measuredWidth, w10, Color.HSVToColor(fArr2), false);
        RectF rectF = this.f26029n;
        rectF.set(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(26.0f) + height, getMeasuredWidth() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(34.0f) + height);
        LinearGradient linearGradient = this.M;
        Paint paint2 = this.f26027c;
        if (linearGradient == null) {
            fArr2[2] = this.V;
            int HSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.W;
            int HSVToColor2 = Color.HSVToColor(fArr2);
            float f13 = rectF.left;
            float f14 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f13, f14, rectF.right, f14, new int[]{HSVToColor2, HSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.M = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (this.V == this.W) {
            f10 = 0.5f;
        } else {
            float brightness = getBrightness();
            float f15 = this.V;
            f10 = (brightness - f15) / (this.W - f15);
        }
        c(canvas, (int) ((rectF.width() * (1.0f - f10)) + rectF.left), (int) rectF.centerY(), getColor(), true);
        if (!this.N && this.R < 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.S;
            this.S = elapsedRealtime;
            float f16 = (((float) j10) / 180.0f) + this.R;
            this.R = f16;
            if (f16 > 1.0f) {
                this.R = 1.0f;
            }
            invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        g(getMeasuredWidth(), null, false);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (this.J != i10) {
            this.J = i10;
            int dp = AndroidUtilities.dp(180.0f);
            Bitmap createBitmap = Bitmap.createBitmap(i10, dp, Bitmap.Config.ARGB_8888);
            float f10 = i10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f11 = dp;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, dp / 3, 0.0f, f11, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.f26026b;
            paint.setShader(composeShader);
            new Canvas(createBitmap).drawRect(0.0f, 0.0f, f10, f11, paint);
            this.f26031s = createBitmap;
            this.M = null;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jq.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setHasChanges(boolean z4) {
        Integer num;
        float f10;
        TextView textView = this.E;
        if (!z4 || textView.getTag() == null) {
            if ((!z4 && textView.getTag() == null) || this.C.getTag() != null) {
                return;
            }
            if (z4) {
                num = 1;
            } else {
                num = null;
            }
            textView.setTag(num);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            if (z4) {
                textView.setVisibility(0);
            }
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, View.ALPHA, f10));
            animatorSet.addListener(new dg.w2(28, this, z4));
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(180L);
            animatorSet.start();
        }
    }

    public void setMaxBrightness(float f10) {
        this.U = f10;
        h();
    }

    public void setMinBrightness(float f10) {
        this.T = f10;
        h();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f26025a0 = f6Var;
    }
}
