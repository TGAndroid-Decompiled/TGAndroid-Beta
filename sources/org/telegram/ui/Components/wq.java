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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class wq extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final int f32314f0 = 0;
    public final EditTextBoldCursor[] E;
    public final org.telegram.ui.ActionBar.j0 F;
    public final ImageView G;
    public final TextView H;
    public final org.telegram.ui.ActionBar.u0 I;
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
    public final vq f32315a;
    public float f32316a0;
    public final Paint f32317b;
    public float f32318b0;
    public final Paint f32319c;
    public float f32320c0;
    public final Paint d;
    public org.telegram.ui.ActionBar.g6 f32321d0;
    public final Paint e;
    public int f32322e0;
    public final Drawable f32323f;
    public boolean h;
    public final RectF f32324n;
    public boolean f32325r;
    public Bitmap f32326s;
    public final ColorPicker$RadioButton[] v;
    public final FrameLayout f32327w;
    public final ai.vc f32328x;
    public AnimatorSet f32329y;

    public wq(Context context, boolean z10, vq vqVar) {
        super(context);
        boolean z11;
        this.f32324n = new RectF();
        this.v = new ColorPicker$RadioButton[4];
        this.K = 1;
        this.L = 1;
        this.N = new float[]{0.0f, 0.0f, 1.0f};
        this.O = new float[3];
        this.U = 1.0f;
        this.W = 0.0f;
        this.f32316a0 = 1.0f;
        this.f32318b0 = 0.0f;
        this.f32320c0 = 1.0f;
        this.f32315a = vqVar;
        this.E = new EditTextBoldCursor[2];
        setWillNotDraw(false);
        this.f32323f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        this.d = new Paint(1);
        this.f32317b = new Paint(5);
        this.f32319c = new Paint(5);
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        ai.vc vcVar = new ai.vc(this, context);
        this.f32328x = vcVar;
        vcVar.setOrientation(0);
        addView(vcVar, w7.z5.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        vcVar.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32327w = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, w7.z5.d(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
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
            this.f32327w.addView(this.v[i10], w7.z5.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.v[i10].setOnClickListener(new View.OnClickListener(this) {
                public final wq f30243b;

                {
                    this.f30243b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    boolean z12;
                    boolean z13;
                    int i12 = r2;
                    wq wqVar = this.f30243b;
                    switch (i12) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            vq vqVar2 = wqVar.f32315a;
                            org.telegram.ui.ActionBar.j0 j0Var = wqVar.F;
                            ImageView imageView = wqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = wqVar.v;
                            if (wqVar.f32329y == null) {
                                int i13 = wqVar.K;
                                if (i13 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i11 = 0;
                                        colorPicker$RadioButton2.a(wq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i11 = 0;
                                    }
                                    if (wqVar.h) {
                                        vqVar2.j0(colorPicker$RadioButtonArr[i11].e, i11, true);
                                    }
                                    vqVar2.j0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    wqVar.K = 2;
                                } else if (i13 == 2) {
                                    wqVar.K = 3;
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
                                    vqVar2.j0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i13 == 3) {
                                    wqVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(wq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    vqVar2.j0(colorPicker$RadioButtonArr[3].e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (wqVar.K < wqVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, com.google.android.gms.internal.play_billing.k3.v(wqVar.K, 1, AndroidUtilities.dp(13.0f), (wqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, com.google.android.gms.internal.play_billing.k3.v(wqVar.K, 1, AndroidUtilities.dp(13.0f), (wqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, property2, 0.0f));
                                }
                                if (wqVar.K > 1) {
                                    if (j0Var.getVisibility() != 0) {
                                        j0Var.setScaleX(0.0f);
                                        j0Var.setScaleY(0.0f);
                                    }
                                    j0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(j0Var, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(j0Var, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(j0Var, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[wqVar.K - 1].callOnClick();
                                wqVar.f32329y = new AnimatorSet();
                                wqVar.g(wqVar.getMeasuredWidth(), arrayList, false);
                                wqVar.f32329y.playTogether(arrayList);
                                wqVar.f32329y.setDuration(180L);
                                wqVar.f32329y.setInterpolator(bs.f25134g);
                                wqVar.f32329y.addListener(new org.telegram.ui.pq(wqVar, 20));
                                wqVar.f32329y.start();
                                return;
                            }
                            return;
                        case 1:
                            vq vqVar3 = wqVar.f32315a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.j0 j0Var2 = wqVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = wqVar.v;
                            ImageView imageView2 = wqVar.G;
                            if (wqVar.f32329y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i14 = wqVar.K;
                                if (i14 == 2) {
                                    wqVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(j0Var2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(j0Var2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(j0Var2, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, 0.0f));
                                } else if (i14 == 3) {
                                    wqVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i14 == 4) {
                                    wqVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property5, org.telegram.messenger.v0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (wqVar.K < wqVar.L) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, property6, 0.0f));
                                }
                                int i15 = wqVar.S;
                                if (i15 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                    for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                        colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i17 = wqVar.T;
                                if (i17 >= 0 && i17 < wqVar.S) {
                                    colorPicker$RadioButtonArr2[i17].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[wqVar.K - 1].callOnClick();
                                }
                                for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                    if (i18 < wqVar.K) {
                                        int i19 = colorPicker$RadioButtonArr2[i18].e;
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        vqVar3.j0(i19, i18, z13);
                                    } else {
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        vqVar3.j0(0, i18, z12);
                                    }
                                }
                                wqVar.f32329y = new AnimatorSet();
                                wqVar.g(wqVar.getMeasuredWidth(), arrayList2, true);
                                wqVar.f32329y.playTogether(arrayList2);
                                wqVar.f32329y.setDuration(180L);
                                wqVar.f32329y.setInterpolator(bs.f25134g);
                                wqVar.f32329y.addListener(new uq(wqVar));
                                wqVar.f32329y.start();
                                return;
                            }
                            return;
                        case 2:
                            wq.a(wqVar, view);
                            return;
                        default:
                            wqVar.I.M(null, null);
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
                editTextBoldCursorArr[i11] = new sq(this, context, i11, 0);
                this.E[i11].setBackgroundDrawable(null);
                this.E[i11].setText("#");
                this.E[i11].setEnabled(false);
                this.E[i11].setFocusable(false);
                this.E[i11].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.f32328x.addView(this.E[i11], w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i11] = new sq(this, context, i11, 1);
                this.E[i11].setBackgroundDrawable(null);
                this.E[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.E[i11].setHint("8BC6ED");
                this.E[i11].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.f32328x.addView(this.E[i11], w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.E[i11].addTextChangedListener(new tq(this, i11));
                this.E[i11].setOnEditorActionListener(new s2(1));
            }
            this.E[i11].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.F(this.E[i11], org.telegram.ui.ActionBar.k6.H6, this.f32321d0);
            EditTextBoldCursor editTextBoldCursor = this.E[i11];
            int i12 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i12, this.f32321d0);
            this.E[i11].setCursorColor(org.telegram.ui.ActionBar.k6.w0(i12, this.f32321d0));
            this.E[i11].setCursorSize(AndroidUtilities.dp(18.0f));
            this.E[i11].setCursorWidth(1.5f);
            this.E[i11].setSingleLine(true);
            this.E[i11].setGravity(19);
            this.E[i11].setHeaderHintColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L6, this.f32321d0));
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
        int i13 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i13, this.f32321d0), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
        org.telegram.ui.ActionBar.g6 g6Var = this.f32321d0;
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, g6Var);
        imageView.setImageResource(R.drawable.msg_add);
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var2 = this.f32321d0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i14, g6Var2, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final wq f30243b;

            {
                this.f30243b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112;
                boolean z12;
                boolean z13;
                int i122 = r2;
                wq wqVar = this.f30243b;
                switch (i122) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        vq vqVar2 = wqVar.f32315a;
                        org.telegram.ui.ActionBar.j0 j0Var = wqVar.F;
                        ImageView imageView2 = wqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = wqVar.v;
                        if (wqVar.f32329y == null) {
                            int i132 = wqVar.K;
                            if (i132 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i112 = 0;
                                    colorPicker$RadioButton2.a(wq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i112 = 0;
                                }
                                if (wqVar.h) {
                                    vqVar2.j0(colorPicker$RadioButtonArr[i112].e, i112, true);
                                }
                                vqVar2.j0(colorPicker$RadioButtonArr[1].e, 1, true);
                                wqVar.K = 2;
                            } else if (i132 == 2) {
                                wqVar.K = 3;
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
                                vqVar2.j0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i132 == 3) {
                                wqVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(wq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                vqVar2.j0(colorPicker$RadioButtonArr[3].e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (wqVar.K < wqVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.gms.internal.play_billing.k3.v(wqVar.K, 1, AndroidUtilities.dp(13.0f), (wqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.gms.internal.play_billing.k3.v(wqVar.K, 1, AndroidUtilities.dp(13.0f), (wqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (wqVar.K > 1) {
                                if (j0Var.getVisibility() != 0) {
                                    j0Var.setScaleX(0.0f);
                                    j0Var.setScaleY(0.0f);
                                }
                                j0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(j0Var, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(j0Var, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(j0Var, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[wqVar.K - 1].callOnClick();
                            wqVar.f32329y = new AnimatorSet();
                            wqVar.g(wqVar.getMeasuredWidth(), arrayList, false);
                            wqVar.f32329y.playTogether(arrayList);
                            wqVar.f32329y.setDuration(180L);
                            wqVar.f32329y.setInterpolator(bs.f25134g);
                            wqVar.f32329y.addListener(new org.telegram.ui.pq(wqVar, 20));
                            wqVar.f32329y.start();
                            return;
                        }
                        return;
                    case 1:
                        vq vqVar3 = wqVar.f32315a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.j0 j0Var2 = wqVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = wqVar.v;
                        ImageView imageView22 = wqVar.G;
                        if (wqVar.f32329y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i142 = wqVar.K;
                            if (i142 == 2) {
                                wqVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(j0Var2, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(j0Var2, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(j0Var2, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i142 == 3) {
                                wqVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i142 == 4) {
                                wqVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.v0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (wqVar.K < wqVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i15 = wqVar.S;
                            if (i15 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                    colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i17 = wqVar.T;
                            if (i17 >= 0 && i17 < wqVar.S) {
                                colorPicker$RadioButtonArr2[i17].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[wqVar.K - 1].callOnClick();
                            }
                            for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                if (i18 < wqVar.K) {
                                    int i19 = colorPicker$RadioButtonArr2[i18].e;
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    vqVar3.j0(i19, i18, z13);
                                } else {
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    vqVar3.j0(0, i18, z12);
                                }
                            }
                            wqVar.f32329y = new AnimatorSet();
                            wqVar.g(wqVar.getMeasuredWidth(), arrayList2, true);
                            wqVar.f32329y.playTogether(arrayList2);
                            wqVar.f32329y.setDuration(180L);
                            wqVar.f32329y.setInterpolator(bs.f25134g);
                            wqVar.f32329y.addListener(new uq(wqVar));
                            wqVar.f32329y.start();
                            return;
                        }
                        return;
                    case 2:
                        wq.a(wqVar, view);
                        return;
                    default:
                        wqVar.I.M(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.Add));
        addView(imageView, w7.z5.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j0 j0Var = new org.telegram.ui.ActionBar.j0(this, getContext(), 1);
        this.F = j0Var;
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i13, this.f32321d0), 1, -1);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i13);
        org.telegram.ui.ActionBar.g6 g6Var3 = this.f32321d0;
        j0Var.setBackground(g03);
        org.telegram.ui.ActionBar.r6.k(j0Var, g03, null, O2, g6Var3);
        j0Var.setImageResource(R.drawable.msg_close);
        org.telegram.ui.ActionBar.r6.t(j0Var, i14, this.f32321d0, mode);
        j0Var.setAlpha(0.0f);
        j0Var.setScaleX(0.0f);
        j0Var.setScaleY(0.0f);
        j0Var.setScaleType(scaleType);
        j0Var.setVisibility(4);
        j0Var.setOnClickListener(new View.OnClickListener(this) {
            public final wq f30243b;

            {
                this.f30243b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112;
                boolean z12;
                boolean z13;
                int i122 = r2;
                wq wqVar = this.f30243b;
                switch (i122) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        vq vqVar2 = wqVar.f32315a;
                        org.telegram.ui.ActionBar.j0 j0Var2 = wqVar.F;
                        ImageView imageView2 = wqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = wqVar.v;
                        if (wqVar.f32329y == null) {
                            int i132 = wqVar.K;
                            if (i132 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i112 = 0;
                                    colorPicker$RadioButton2.a(wq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i112 = 0;
                                }
                                if (wqVar.h) {
                                    vqVar2.j0(colorPicker$RadioButtonArr[i112].e, i112, true);
                                }
                                vqVar2.j0(colorPicker$RadioButtonArr[1].e, 1, true);
                                wqVar.K = 2;
                            } else if (i132 == 2) {
                                wqVar.K = 3;
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
                                vqVar2.j0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i132 == 3) {
                                wqVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(wq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                vqVar2.j0(colorPicker$RadioButtonArr[3].e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (wqVar.K < wqVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.gms.internal.play_billing.k3.v(wqVar.K, 1, AndroidUtilities.dp(13.0f), (wqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.gms.internal.play_billing.k3.v(wqVar.K, 1, AndroidUtilities.dp(13.0f), (wqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (wqVar.K > 1) {
                                if (j0Var2.getVisibility() != 0) {
                                    j0Var2.setScaleX(0.0f);
                                    j0Var2.setScaleY(0.0f);
                                }
                                j0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(j0Var2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(j0Var2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(j0Var2, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[wqVar.K - 1].callOnClick();
                            wqVar.f32329y = new AnimatorSet();
                            wqVar.g(wqVar.getMeasuredWidth(), arrayList, false);
                            wqVar.f32329y.playTogether(arrayList);
                            wqVar.f32329y.setDuration(180L);
                            wqVar.f32329y.setInterpolator(bs.f25134g);
                            wqVar.f32329y.addListener(new org.telegram.ui.pq(wqVar, 20));
                            wqVar.f32329y.start();
                            return;
                        }
                        return;
                    case 1:
                        vq vqVar3 = wqVar.f32315a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.j0 j0Var22 = wqVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = wqVar.v;
                        ImageView imageView22 = wqVar.G;
                        if (wqVar.f32329y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i142 = wqVar.K;
                            if (i142 == 2) {
                                wqVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(j0Var22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(j0Var22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(j0Var22, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                            } else if (i142 == 3) {
                                wqVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i142 == 4) {
                                wqVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.v0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            } else {
                                return;
                            }
                            if (wqVar.K < wqVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                            }
                            int i15 = wqVar.S;
                            if (i15 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                    colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i17 = wqVar.T;
                            if (i17 >= 0 && i17 < wqVar.S) {
                                colorPicker$RadioButtonArr2[i17].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[wqVar.K - 1].callOnClick();
                            }
                            for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                if (i18 < wqVar.K) {
                                    int i19 = colorPicker$RadioButtonArr2[i18].e;
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    vqVar3.j0(i19, i18, z13);
                                } else {
                                    if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    vqVar3.j0(0, i18, z12);
                                }
                            }
                            wqVar.f32329y = new AnimatorSet();
                            wqVar.g(wqVar.getMeasuredWidth(), arrayList2, true);
                            wqVar.f32329y.playTogether(arrayList2);
                            wqVar.f32329y.setDuration(180L);
                            wqVar.f32329y.setInterpolator(bs.f25134g);
                            wqVar.f32329y.addListener(new uq(wqVar));
                            wqVar.f32329y.start();
                            return;
                        }
                        return;
                    case 2:
                        wq.a(wqVar, view);
                        return;
                    default:
                        wqVar.I.M(null, null);
                        return;
                }
            }
        });
        j0Var.setContentDescription(LocaleController.getString(R.string.ClearButton));
        addView(j0Var, w7.z5.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.H = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.r6.W(textView, i14, this.f32321d0);
        addView(textView, w7.z5.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new ah.f(11));
        if (z10) {
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.k6.w0(i14, this.f32321d0));
            this.I = u0Var;
            u0Var.setLongClickEnabled(false);
            u0Var.setIcon(R.drawable.ic_ab_other);
            u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            u0Var.e(1, R.drawable.msg_edit, LocaleController.getString(R.string.OpenInEditor));
            u0Var.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareTheme));
            u0Var.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteTheme));
            u0Var.setMenuYOffset(-AndroidUtilities.dp(80.0f));
            u0Var.setSubMenuOpenSide(2);
            u0Var.setDelegate(new s(this, 26));
            u0Var.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
            u0Var.setTranslationX(AndroidUtilities.dp(6.0f));
            org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i13, this.f32321d0), 1, -1);
            org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i13);
            org.telegram.ui.ActionBar.g6 g6Var4 = this.f32321d0;
            u0Var.setBackground(g04);
            org.telegram.ui.ActionBar.r6.k(u0Var, g04, null, O3, g6Var4);
            addView(u0Var, w7.z5.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            u0Var.setOnClickListener(new View.OnClickListener(this) {
                public final wq f30243b;

                {
                    this.f30243b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112;
                    boolean z12;
                    boolean z13;
                    int i122 = r2;
                    wq wqVar = this.f30243b;
                    switch (i122) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            vq vqVar2 = wqVar.f32315a;
                            org.telegram.ui.ActionBar.j0 j0Var2 = wqVar.F;
                            ImageView imageView2 = wqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = wqVar.v;
                            if (wqVar.f32329y == null) {
                                int i132 = wqVar.K;
                                if (i132 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i112 = 0;
                                        colorPicker$RadioButton2.a(wq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i112 = 0;
                                    }
                                    if (wqVar.h) {
                                        vqVar2.j0(colorPicker$RadioButtonArr[i112].e, i112, true);
                                    }
                                    vqVar2.j0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    wqVar.K = 2;
                                } else if (i132 == 2) {
                                    wqVar.K = 3;
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
                                    vqVar2.j0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i132 == 3) {
                                    wqVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(wq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    vqVar2.j0(colorPicker$RadioButtonArr[3].e, 3, true);
                                } else {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                if (wqVar.K < wqVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.gms.internal.play_billing.k3.v(wqVar.K, 1, AndroidUtilities.dp(13.0f), (wqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property, com.google.android.gms.internal.play_billing.k3.v(wqVar.K, 1, AndroidUtilities.dp(13.0f), (wqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                                }
                                if (wqVar.K > 1) {
                                    if (j0Var2.getVisibility() != 0) {
                                        j0Var2.setScaleX(0.0f);
                                        j0Var2.setScaleY(0.0f);
                                    }
                                    j0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(j0Var2, property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(j0Var2, property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(j0Var2, property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[wqVar.K - 1].callOnClick();
                                wqVar.f32329y = new AnimatorSet();
                                wqVar.g(wqVar.getMeasuredWidth(), arrayList, false);
                                wqVar.f32329y.playTogether(arrayList);
                                wqVar.f32329y.setDuration(180L);
                                wqVar.f32329y.setInterpolator(bs.f25134g);
                                wqVar.f32329y.addListener(new org.telegram.ui.pq(wqVar, 20));
                                wqVar.f32329y.start();
                                return;
                            }
                            return;
                        case 1:
                            vq vqVar3 = wqVar.f32315a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.j0 j0Var22 = wqVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = wqVar.v;
                            ImageView imageView22 = wqVar.G;
                            if (wqVar.f32329y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i142 = wqVar.K;
                                if (i142 == 2) {
                                    wqVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(j0Var22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(j0Var22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(j0Var22, property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, 0.0f));
                                } else if (i142 == 3) {
                                    wqVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i142 == 4) {
                                    wqVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property5, org.telegram.messenger.v0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                } else {
                                    return;
                                }
                                if (wqVar.K < wqVar.L) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, property6, 0.0f));
                                }
                                int i15 = wqVar.S;
                                if (i15 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i15];
                                    for (int i16 = i15 + 1; i16 < colorPicker$RadioButtonArr2.length; i16++) {
                                        colorPicker$RadioButtonArr2[i16 - 1] = colorPicker$RadioButtonArr2[i16];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i17 = wqVar.T;
                                if (i17 >= 0 && i17 < wqVar.S) {
                                    colorPicker$RadioButtonArr2[i17].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[wqVar.K - 1].callOnClick();
                                }
                                for (int i18 = 0; i18 < colorPicker$RadioButtonArr2.length; i18++) {
                                    if (i18 < wqVar.K) {
                                        int i19 = colorPicker$RadioButtonArr2[i18].e;
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        vqVar3.j0(i19, i18, z13);
                                    } else {
                                        if (i18 == colorPicker$RadioButtonArr2.length - 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        vqVar3.j0(0, i18, z12);
                                    }
                                }
                                wqVar.f32329y = new AnimatorSet();
                                wqVar.g(wqVar.getMeasuredWidth(), arrayList2, true);
                                wqVar.f32329y.playTogether(arrayList2);
                                wqVar.f32329y.setDuration(180L);
                                wqVar.f32329y.setInterpolator(bs.f25134g);
                                wqVar.f32329y.addListener(new uq(wqVar));
                                wqVar.f32329y.start();
                                return;
                            }
                            return;
                        case 2:
                            wq.a(wqVar, view);
                            return;
                        default:
                            wqVar.I.M(null, null);
                            return;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(wq wqVar, View view) {
        boolean z10;
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i10 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = wqVar.v;
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
                    wqVar.T = wqVar.S;
                    wqVar.S = i10;
                }
                i10++;
            } else {
                int i11 = colorPicker$RadioButton.e;
                wqVar.setColorInner(i11);
                wqVar.E[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i11)), Byte.valueOf((byte) Color.green(i11)), Byte.valueOf((byte) Color.blue(i11))).toUpperCase());
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
        return Math.max(this.f32318b0, Math.min(this.N[2], this.f32320c0));
    }

    public void setColorInner(int i10) {
        Color.colorToHSV(i10, this.N);
        int r02 = this.f32315a.r0(this.S);
        if (r02 == 0 || r02 != i10) {
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
        Drawable drawable = this.f32323f;
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
        if (!this.f32325r) {
            this.f32325r = true;
            if (this.S == i11) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i10)), Byte.valueOf((byte) Color.green(i10)), Byte.valueOf((byte) Color.blue(i10))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.E;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.v[i11].a(i10);
            this.f32325r = false;
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
            imageView.setTranslationX(org.telegram.messenger.v0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.v0.D(13.0f, 3, AndroidUtilities.dp(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.j0 j0Var = this.F;
        org.telegram.ui.ActionBar.u0 u0Var = this.I;
        if (u0Var != null) {
            if (i10 == 1) {
                u0Var.setVisibility(0);
            } else {
                u0Var.setVisibility(8);
                j0Var.setTranslationX(0.0f);
            }
        }
        if (i11 <= 1) {
            imageView.setVisibility(8);
            j0Var.setVisibility(8);
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
                j0Var.setVisibility(0);
                j0Var.setScaleX(1.0f);
                j0Var.setScaleY(1.0f);
                j0Var.setAlpha(1.0f);
            } else {
                j0Var.setVisibility(8);
            }
        }
        this.f32328x.invalidate();
        g(getMeasuredWidth(), null, false);
    }

    public final void g(int i10, ArrayList arrayList, boolean z10) {
        float f7;
        float f10;
        boolean z11;
        float f11;
        int i11 = this.K;
        float f12 = 30.0f;
        int D = org.telegram.messenger.v0.D(13.0f, i11 - 1, AndroidUtilities.dp(30.0f) * i11);
        FrameLayout frameLayout = this.f32327w;
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
                            f11 = f12;
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property4, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property3, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property2, 1.0f));
                        } else {
                            f11 = f12;
                        }
                        if (!z10 && (z10 || i12 == this.K - 1)) {
                            colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property, i13));
                        }
                    } else {
                        f11 = f12;
                        colorPicker$RadioButtonArr[i12].setVisibility(0);
                        if (this.f32329y == null) {
                            colorPicker$RadioButtonArr[i12].setAlpha(1.0f);
                            colorPicker$RadioButtonArr[i12].setScaleX(1.0f);
                            colorPicker$RadioButtonArr[i12].setScaleY(1.0f);
                        }
                        colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                    }
                    colorPicker$RadioButtonArr[i12].setTag(R.id.index_tag, 1);
                } else {
                    f11 = f12;
                    if (arrayList != null) {
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property4, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], property2, 0.0f));
                        }
                    } else {
                        colorPicker$RadioButtonArr[i12].setVisibility(4);
                        if (this.f32329y == null) {
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
                i13 = org.telegram.messenger.v0.C(13.0f, AndroidUtilities.dp(f11), i13);
                i12++;
                f12 = f11;
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
        org.telegram.ui.ActionBar.j0 j0Var = this.F;
        if (j0Var == null) {
            return;
        }
        if (j0Var.getTag() != null) {
            f7 = 0.0f;
        } else {
            f7 = this.W;
        }
        if (j0Var.getTag() != null) {
            f10 = 1.0f;
        } else {
            f10 = this.f32316a0;
        }
        float[] fArr = this.N;
        float f11 = fArr[2];
        if (f7 == 0.0f && f10 == 1.0f) {
            this.f32318b0 = 0.0f;
            this.f32320c0 = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f11;
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(HSVToColor);
        float max = Math.max(0.0f, Math.min(f7 / computePerceivedBrightness, 1.0f));
        this.f32318b0 = max;
        this.f32320c0 = Math.max(max, Math.min(f10 / computePerceivedBrightness, 1.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f32328x.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        int i10;
        int dp = AndroidUtilities.dp(45.0f);
        float f10 = dp;
        canvas.drawBitmap(this.f32326s, 0.0f, f10, (Paint) null);
        int height = this.f32326s.getHeight() + dp;
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
        int y3 = (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, fArr[1], this.f32326s.getHeight(), f10);
        if (!this.Q) {
            int dp2 = AndroidUtilities.dp(16.0f);
            float interpolation = bs.f25134g.getInterpolation(this.U);
            if (measuredWidth < dp2) {
                measuredWidth = (int) (((dp2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - dp2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - dp2)) * interpolation));
            }
            if (y3 < dp + dp2) {
                y3 = (int) ((interpolation * (i10 - y3)) + y3);
            } else if (y3 > (this.f32326s.getHeight() + dp) - dp2) {
                y3 = (int) (y3 - (interpolation * (y3 - ((this.f32326s.getHeight() + dp) - dp2))));
            }
        }
        c(canvas, measuredWidth, y3, Color.HSVToColor(fArr2), false);
        RectF rectF = this.f32324n;
        rectF.set(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(26.0f) + height, getMeasuredWidth() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(34.0f) + height);
        LinearGradient linearGradient = this.P;
        Paint paint2 = this.f32319c;
        if (linearGradient == null) {
            fArr2[2] = this.f32318b0;
            int HSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.f32320c0;
            int HSVToColor2 = Color.HSVToColor(fArr2);
            float f12 = rectF.left;
            float f13 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f12, f13, rectF.right, f13, new int[]{HSVToColor2, HSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.P = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (this.f32318b0 == this.f32320c0) {
            f7 = 0.5f;
        } else {
            float brightness = getBrightness();
            float f14 = this.f32318b0;
            f7 = (brightness - f14) / (this.f32320c0 - f14);
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
            int dp = AndroidUtilities.dp(180.0f);
            Bitmap createBitmap = Bitmap.createBitmap(i10, dp, Bitmap.Config.ARGB_8888);
            float f7 = i10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f10 = dp;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, dp / 3, 0.0f, f10, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.f32317b;
            paint.setShader(composeShader);
            new Canvas(createBitmap).drawRect(0.0f, 0.0f, f7, f10, paint);
            this.f32326s = createBitmap;
            this.P = null;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wq.onTouchEvent(android.view.MotionEvent):boolean");
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
            animatorSet.addListener(new org.telegram.ui.ho(7, this, z10));
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(180L);
            animatorSet.start();
        }
    }

    public void setMaxBrightness(float f7) {
        this.f32316a0 = f7;
        h();
    }

    public void setMinBrightness(float f7) {
        this.W = f7;
        h();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f32321d0 = g6Var;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.u0 u0Var = this.I;
        if (u0Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f32321d0);
                if (w02 != this.f32322e0) {
                    this.f32322e0 = w02;
                    u0Var.setIconColor(w02);
                }
                u0Var.G(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.f32321d0), false);
                u0Var.G(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.f32321d0), true);
                u0Var.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.f32321d0));
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.E;
        if (editTextBoldCursorArr != null) {
            for (int i10 = 0; i10 < editTextBoldCursorArr.length; i10++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f32321d0));
                    editTextBoldCursorArr[i10].setHeaderHintColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L6, this.f32321d0));
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
