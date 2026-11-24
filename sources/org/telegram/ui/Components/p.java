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
import org.telegram.ui.Components.p;
public class p extends FrameLayout implements tjb {
    public AnimatorSet E;
    public final EditTextBoldCursor[] F;
    public final c7 G;
    public final ImageView H;
    public final TextView I;
    public final r7 J;
    public int K;
    public byte L;
    public byte M;
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
    public final nl2 a;
    public float a0;
    public final Paint b;
    public float b0;
    public final Paint c;
    public float c0;
    public final Paint d;
    public float d0;
    public final Paint e;
    public wjb e0;
    public final Drawable f;
    public int f0;
    public boolean h;
    public final RectF n;
    public boolean r;
    public Bitmap s;
    public final ColorPicker$RadioButton[] w;
    public final FrameLayout x;
    public final zf2 y;

    public p(Context context, boolean z, nl2 nl2Var) {
        super(context);
        boolean z2;
        this.n = new RectF();
        this.w = new ColorPicker$RadioButton[4];
        this.L = (byte) 1;
        this.M = (byte) 1;
        this.O = new float[]{0.0f, 0.0f, 1.0f};
        this.P = new float[3];
        this.V = 1.0f;
        this.a0 = 0.0f;
        this.b0 = 1.0f;
        this.c0 = 0.0f;
        this.d0 = 1.0f;
        this.a = nl2Var;
        this.F = new EditTextBoldCursor[2];
        setWillNotDraw(false);
        this.f = context.getResources().getDrawable(2131231603).mutate();
        this.d = new Paint(1);
        this.b = new Paint(5);
        this.c = new Paint(5);
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        zf2 zf2Var = new zf2(this, context);
        this.y = zf2Var;
        zf2Var.setOrientation(0);
        addView(zf2Var, nme.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        zf2Var.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, nme.d(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        for (int i = 0; i < 4; i++) {
            this.w[i] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.w[i];
            if (this.T == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            colorPicker$RadioButton.d = z2;
            colorPicker$RadioButton.b(false);
            this.x.addView(this.w[i], nme.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.w[i].setOnClickListener(new View.OnClickListener(this) {
                public final p b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    p pVar = this.b;
                    switch (b) {
                        case 0:
                            pVar.d(view);
                            return;
                        default:
                            pVar.J.U(null, null);
                            return;
                    }
                }
            });
        }
        int i2 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.F;
            if (i2 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i2 % 2 == 0) {
                editTextBoldCursorArr[i2] = new kl2(this, context, i2, (byte) 0);
                this.F[i2].setBackgroundDrawable(null);
                this.F[i2].setText("#");
                this.F[i2].setEnabled(false);
                this.F[i2].setFocusable(false);
                this.F[i2].setPadding(0, gl.L(5.0f), 0, gl.L(16.0f));
                this.y.addView(this.F[i2], nme.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i2] = new kl2(this, context, i2, (byte) 1);
                this.F[i2].setBackgroundDrawable(null);
                this.F[i2].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.F[i2].setHint("8BC6ED");
                this.F[i2].setPadding(0, gl.L(5.0f), 0, gl.L(16.0f));
                this.y.addView(this.F[i2], nme.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.F[i2].addTextChangedListener(new o(this, i2));
                this.F[i2].setOnEditorActionListener(new ng((byte) 1));
            }
            this.F[i2].setTextSize(1, 16.0f);
            zkb.D(this.F[i2], bkb.G6, this.e0);
            EditTextBoldCursor editTextBoldCursor = this.F[i2];
            int i3 = bkb.F6;
            zkb.X(editTextBoldCursor, i3, this.e0);
            this.F[i2].setCursorColor(bkb.v0(i3, this.e0));
            this.F[i2].setCursorSize(gl.L(18.0f));
            this.F[i2].setCursorWidth(1.5f);
            this.F[i2].setSingleLine(true);
            this.F[i2].setGravity(19);
            this.F[i2].setHeaderHintColor(bkb.v0(bkb.K6, this.e0));
            this.F[i2].setTransformHintToHeader(true);
            this.F[i2].setInputType(524416);
            this.F[i2].setImeOptions(268435462);
            if (i2 == 1) {
                this.F[i2].requestFocus();
            } else if (i2 == 2 || i2 == 3) {
                this.F[i2].setVisibility(8);
            }
            i2++;
        }
        ImageView imageView = new ImageView(getContext());
        this.H = imageView;
        int i4 = bkb.H5;
        ff0 f0 = bkb.f0(bkb.v0(i4, this.e0), 1, -1);
        vkb M = zkb.M(i4);
        wjb wjbVar = this.e0;
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, wjbVar);
        imageView.setImageResource(2131232047);
        int i5 = bkb.F6;
        wjb wjbVar2 = this.e0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView, i5, wjbVar2, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final p b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z3;
                boolean z4;
                byte b = r2;
                p pVar = this.b;
                switch (b) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        nl2 nl2Var2 = pVar.a;
                        c7 c7Var = pVar.G;
                        ImageView imageView2 = pVar.H;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = pVar.w;
                        if (pVar.E == null) {
                            byte b2 = pVar.L;
                            if (b2 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    colorPicker$RadioButton2.a(p.c(colorPicker$RadioButtonArr[0].e));
                                }
                                if (pVar.h) {
                                    nl2Var2.c(colorPicker$RadioButtonArr[0].e, 0, true);
                                }
                                nl2Var2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                pVar.L = (byte) 2;
                            } else if (b2 == 2) {
                                pVar.L = (byte) 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f = fArr[0];
                                    if (f > 180.0f) {
                                        fArr[0] = f - 60.0f;
                                    } else {
                                        fArr[0] = f + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                nl2Var2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (b2 == 3) {
                                pVar.L = (byte) 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(p.c(colorPicker$RadioButtonArr[2].e));
                                }
                                nl2Var2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (pVar.L < pVar.M) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, oo1.h(pVar.L, 1, gl.L(13.0f), (pVar.L - 1) * gl.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, oo1.h(pVar.L, 1, gl.L(13.0f), (pVar.L - 1) * gl.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (pVar.L > 1) {
                                if (c7Var.getVisibility() != 0) {
                                    c7Var.setScaleX(0.0f);
                                    c7Var.setScaleY(0.0f);
                                }
                                c7Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(c7Var, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(c7Var, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(c7Var, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[pVar.L - 1].callOnClick();
                            pVar.E = new AnimatorSet();
                            pVar.g(pVar.getMeasuredWidth(), arrayList, false);
                            pVar.E.playTogether(arrayList);
                            pVar.E.setDuration(180L);
                            pVar.E.setInterpolator(s33.g);
                            pVar.E.addListener(new ll2(pVar, (byte) 0));
                            pVar.E.start();
                            return;
                        }
                        return;
                    default:
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        c7 c7Var2 = pVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = pVar.w;
                        ImageView imageView3 = pVar.H;
                        if (pVar.E == null) {
                            ArrayList arrayList2 = new ArrayList();
                            byte b3 = pVar.L;
                            if (b3 == 2) {
                                pVar.L = (byte) 1;
                                arrayList2.add(ObjectAnimator.ofFloat(c7Var2, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(c7Var2, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(c7Var2, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property5, 0.0f));
                            } else if (b3 == 3) {
                                pVar.L = (byte) 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property5, gl.L(13.0f) + gl.L(30.0f)));
                            } else if (b3 == 4) {
                                pVar.L = (byte) 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property5, (gl.L(30.0f) << 1) + (gl.L(13.0f) << 1)));
                            } else {
                                return;
                            }
                            if (pVar.L < pVar.M) {
                                imageView3.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property6, 0.0f));
                            }
                            int i6 = pVar.T;
                            if (i6 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i6];
                                for (int i7 = i6 + 1; i7 < colorPicker$RadioButtonArr2.length; i7++) {
                                    colorPicker$RadioButtonArr2[i7 - 1] = colorPicker$RadioButtonArr2[i7];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i8 = pVar.U;
                            if (i8 >= 0 && i8 < pVar.T) {
                                colorPicker$RadioButtonArr2[i8].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[pVar.L - 1].callOnClick();
                            }
                            for (int i9 = 0; i9 < colorPicker$RadioButtonArr2.length; i9++) {
                                byte b4 = pVar.L;
                                nl2 nl2Var3 = pVar.a;
                                if (i9 < b4) {
                                    int i10 = colorPicker$RadioButtonArr2[i9].e;
                                    if (i9 == colorPicker$RadioButtonArr2.length - 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    nl2Var3.c(i10, i9, z4);
                                } else {
                                    if (i9 == colorPicker$RadioButtonArr2.length - 1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    nl2Var3.c(0, i9, z3);
                                }
                            }
                            pVar.E = new AnimatorSet();
                            pVar.g(pVar.getMeasuredWidth(), arrayList2, true);
                            pVar.E.playTogether(arrayList2);
                            pVar.E.setDuration(180L);
                            pVar.E.setInterpolator(s33.g);
                            pVar.E.addListener(new ll2(pVar, (byte) 1));
                            pVar.E.start();
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setContentDescription(k96.M0(2131754483, null));
        addView(imageView, nme.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        c7 c7Var = new c7((byte) 1, getContext(), this);
        this.G = c7Var;
        ff0 f02 = bkb.f0(bkb.v0(i4, this.e0), 1, -1);
        vkb M2 = zkb.M(i4);
        wjb wjbVar3 = this.e0;
        c7Var.setBackground(f02);
        zkb.j(c7Var, f02, null, M2, wjbVar3);
        c7Var.setImageResource(2131232101);
        zkb.s(c7Var, i5, this.e0, mode);
        c7Var.setAlpha(0.0f);
        c7Var.setScaleX(0.0f);
        c7Var.setScaleY(0.0f);
        c7Var.setScaleType(scaleType);
        c7Var.setVisibility(4);
        c7Var.setOnClickListener(new View.OnClickListener(this) {
            public final p b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z3;
                boolean z4;
                byte b = r2;
                p pVar = this.b;
                switch (b) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        nl2 nl2Var2 = pVar.a;
                        c7 c7Var2 = pVar.G;
                        ImageView imageView2 = pVar.H;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = pVar.w;
                        if (pVar.E == null) {
                            byte b2 = pVar.L;
                            if (b2 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    colorPicker$RadioButton2.a(p.c(colorPicker$RadioButtonArr[0].e));
                                }
                                if (pVar.h) {
                                    nl2Var2.c(colorPicker$RadioButtonArr[0].e, 0, true);
                                }
                                nl2Var2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                pVar.L = (byte) 2;
                            } else if (b2 == 2) {
                                pVar.L = (byte) 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f = fArr[0];
                                    if (f > 180.0f) {
                                        fArr[0] = f - 60.0f;
                                    } else {
                                        fArr[0] = f + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                nl2Var2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (b2 == 3) {
                                pVar.L = (byte) 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(p.c(colorPicker$RadioButtonArr[2].e));
                                }
                                nl2Var2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                            } else {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (pVar.L < pVar.M) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, oo1.h(pVar.L, 1, gl.L(13.0f), (pVar.L - 1) * gl.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property, oo1.h(pVar.L, 1, gl.L(13.0f), (pVar.L - 1) * gl.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, 0.0f));
                            }
                            if (pVar.L > 1) {
                                if (c7Var2.getVisibility() != 0) {
                                    c7Var2.setScaleX(0.0f);
                                    c7Var2.setScaleY(0.0f);
                                }
                                c7Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(c7Var2, property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(c7Var2, property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(c7Var2, property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[pVar.L - 1].callOnClick();
                            pVar.E = new AnimatorSet();
                            pVar.g(pVar.getMeasuredWidth(), arrayList, false);
                            pVar.E.playTogether(arrayList);
                            pVar.E.setDuration(180L);
                            pVar.E.setInterpolator(s33.g);
                            pVar.E.addListener(new ll2(pVar, (byte) 0));
                            pVar.E.start();
                            return;
                        }
                        return;
                    default:
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        c7 c7Var22 = pVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = pVar.w;
                        ImageView imageView3 = pVar.H;
                        if (pVar.E == null) {
                            ArrayList arrayList2 = new ArrayList();
                            byte b3 = pVar.L;
                            if (b3 == 2) {
                                pVar.L = (byte) 1;
                                arrayList2.add(ObjectAnimator.ofFloat(c7Var22, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(c7Var22, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(c7Var22, property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property5, 0.0f));
                            } else if (b3 == 3) {
                                pVar.L = (byte) 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property5, gl.L(13.0f) + gl.L(30.0f)));
                            } else if (b3 == 4) {
                                pVar.L = (byte) 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property5, (gl.L(30.0f) << 1) + (gl.L(13.0f) << 1)));
                            } else {
                                return;
                            }
                            if (pVar.L < pVar.M) {
                                imageView3.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, property6, 0.0f));
                            }
                            int i6 = pVar.T;
                            if (i6 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i6];
                                for (int i7 = i6 + 1; i7 < colorPicker$RadioButtonArr2.length; i7++) {
                                    colorPicker$RadioButtonArr2[i7 - 1] = colorPicker$RadioButtonArr2[i7];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i8 = pVar.U;
                            if (i8 >= 0 && i8 < pVar.T) {
                                colorPicker$RadioButtonArr2[i8].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[pVar.L - 1].callOnClick();
                            }
                            for (int i9 = 0; i9 < colorPicker$RadioButtonArr2.length; i9++) {
                                byte b4 = pVar.L;
                                nl2 nl2Var3 = pVar.a;
                                if (i9 < b4) {
                                    int i10 = colorPicker$RadioButtonArr2[i9].e;
                                    if (i9 == colorPicker$RadioButtonArr2.length - 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    nl2Var3.c(i10, i9, z4);
                                } else {
                                    if (i9 == colorPicker$RadioButtonArr2.length - 1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    nl2Var3.c(0, i9, z3);
                                }
                            }
                            pVar.E = new AnimatorSet();
                            pVar.g(pVar.getMeasuredWidth(), arrayList2, true);
                            pVar.E.playTogether(arrayList2);
                            pVar.E.setDuration(180L);
                            pVar.E.setInterpolator(s33.g);
                            pVar.E.addListener(new ll2(pVar, (byte) 1));
                            pVar.E.start();
                            return;
                        }
                        return;
                }
            }
        });
        c7Var.setContentDescription(k96.M0(2131752087, null));
        addView(c7Var, nme.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.I = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        textView.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        zkb.X(textView, i5, this.e0);
        addView(textView, nme.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new x00((byte) 1));
        if (z) {
            r7 r7Var = new r7(context, (r6) null, bkb.v0(i5, this.e0));
            this.J = r7Var;
            r7Var.setLongClickEnabled(false);
            r7Var.setIcon(2131231247);
            r7Var.setContentDescription(k96.M0(2131754838, null));
            r7Var.e(1, 2131232121, k96.M0(2131747604, null));
            r7Var.e(2, 2131232368, k96.M0(2131745234, null));
            r7Var.e(3, 2131232113, k96.M0(2131751474, null));
            r7Var.setMenuYOffset(-gl.L(80.0f));
            r7Var.setSubMenuOpenSide(2);
            r7Var.setDelegate(new rh1(this, (byte) 27));
            r7Var.setAdditionalYOffset(gl.L(72.0f));
            r7Var.setTranslationX(gl.L(6.0f));
            ff0 f03 = bkb.f0(bkb.v0(i4, this.e0), 1, -1);
            vkb M3 = zkb.M(i4);
            wjb wjbVar4 = this.e0;
            r7Var.setBackground(f03);
            zkb.j(r7Var, f03, null, M3, wjbVar4);
            addView(r7Var, nme.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            r7Var.setOnClickListener(new View.OnClickListener(this) {
                public final p b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    p pVar = this.b;
                    switch (b) {
                        case 0:
                            pVar.d(view);
                            return;
                        default:
                            pVar.J.U(null, null);
                            return;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static int c(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        float f = fArr[1];
        if (f > 0.5f) {
            fArr[1] = f - 0.15f;
        } else {
            fArr[1] = f + 0.15f;
        }
        float f2 = fArr[0];
        if (f2 > 180.0f) {
            fArr[0] = f2 - 20.0f;
        } else {
            fArr[0] = f2 + 20.0f;
        }
        return Color.HSVToColor(255, fArr);
    }

    private float getBrightness() {
        return Math.max(this.c0, Math.min(this.O[2], this.d0));
    }

    public void setColorInner(int i) {
        Color.colorToHSV(i, this.O);
        int d = this.a.d(this.T);
        if (d == 0 || d != i) {
            h();
        }
        this.Q = null;
        invalidate();
    }

    public final void b(Canvas canvas, int i, int i2, int i3, boolean z) {
        float f;
        float f2;
        float f3;
        if (z) {
            f = 12.0f;
        } else {
            f = 16.0f;
        }
        int L = gl.L(f);
        Drawable drawable = this.f;
        drawable.setBounds(i - L, i2 - L, i + L, L + i2);
        drawable.draw(canvas);
        Paint paint = this.d;
        paint.setColor(-1);
        float f4 = i;
        float f5 = i2;
        if (z) {
            f2 = 11.0f;
        } else {
            f2 = 15.0f;
        }
        canvas.drawCircle(f4, f5, gl.L(f2), paint);
        paint.setColor(i3);
        if (z) {
            f3 = 9.0f;
        } else {
            f3 = 13.0f;
        }
        canvas.drawCircle(f4, f5, gl.L(f3), paint);
    }

    public final void d(View view) {
        boolean z;
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = this.w;
            if (i < colorPicker$RadioButtonArr.length) {
                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i];
                if (colorPicker$RadioButton2 == colorPicker$RadioButton) {
                    z = true;
                } else {
                    z = false;
                }
                colorPicker$RadioButton2.d = z;
                colorPicker$RadioButton2.b(true);
                if (z) {
                    this.U = this.T;
                    this.T = i;
                }
                i++;
            } else {
                int i2 = colorPicker$RadioButton.e;
                setColorInner(i2);
                this.F[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i2)), Byte.valueOf((byte) Color.green(i2)), Byte.valueOf((byte) Color.blue(i2))).toUpperCase());
                return;
            }
        }
    }

    public final void e(int i, int i2) {
        if (!this.r) {
            this.r = true;
            if (this.T == i2) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i)), Byte.valueOf((byte) Color.green(i)), Byte.valueOf((byte) Color.blue(i))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.F;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.w[i2].a(i);
            this.r = false;
        }
        setColorInner(i);
    }

    public final void f(int i, int i2, int i3, boolean z) {
        boolean z2;
        if (i != this.K) {
            this.U = 0;
            this.T = 0;
            for (int i4 = 0; i4 < 4; i4++) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.w[i4];
                if (i4 == this.T) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                colorPicker$RadioButton.d = z2;
                colorPicker$RadioButton.b(true);
            }
        }
        this.M = i2;
        this.K = i;
        this.h = z;
        this.L = i3;
        ImageView imageView = this.H;
        if (i3 == 1) {
            imageView.setTranslationX(0.0f);
        } else if (i3 == 2) {
            imageView.setTranslationX(gl.L(13.0f) + gl.L(30.0f));
        } else if (i3 == 3) {
            imageView.setTranslationX((gl.L(30.0f) << 1) + (gl.L(13.0f) << 1));
        } else {
            imageView.setTranslationX(de9.y(13.0f, 3, gl.L(30.0f) * 3));
        }
        c7 c7Var = this.G;
        r7 r7Var = this.J;
        if (r7Var != null) {
            if (i == 1) {
                r7Var.setVisibility(0);
            } else {
                r7Var.setVisibility(8);
                c7Var.setTranslationX(0.0f);
            }
        }
        if (i2 <= 1) {
            imageView.setVisibility(8);
            c7Var.setVisibility(8);
        } else {
            if (i3 < i2) {
                imageView.setVisibility(0);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                imageView.setVisibility(8);
            }
            if (i3 > 1) {
                c7Var.setVisibility(0);
                c7Var.setScaleX(1.0f);
                c7Var.setScaleY(1.0f);
                c7Var.setAlpha(1.0f);
            } else {
                c7Var.setVisibility(8);
            }
        }
        this.y.invalidate();
        g(getMeasuredWidth(), null, false);
    }

    public final void g(int i, ArrayList arrayList, boolean z) {
        float f;
        float f2;
        boolean z2;
        byte b = this.L;
        float f3 = 30.0f;
        int y = de9.y(13.0f, b - 1, gl.L(30.0f) * b);
        FrameLayout frameLayout = this.x;
        int left = frameLayout.getLeft() + y;
        if (this.K == 1) {
            f = 50.0f;
        } else {
            f = 0.0f;
        }
        int L = i - gl.L(f);
        if (left > L) {
            f2 = left - L;
        } else {
            f2 = 0.0f;
        }
        Property property = View.TRANSLATION_X;
        float f4 = -f2;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, property, f4));
        } else {
            frameLayout.setTranslationX(f4);
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = this.w;
            if (i2 < colorPicker$RadioButtonArr.length) {
                if (colorPicker$RadioButtonArr[i2].getTag(2131296463) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                byte b2 = this.L;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                float f5 = f3;
                Property property4 = View.ALPHA;
                if (i2 < b2) {
                    colorPicker$RadioButtonArr[i2].setVisibility(0);
                    if (arrayList != null) {
                        if (!z2) {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i2], property4, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i2], property3, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i2], property2, 1.0f));
                        }
                        if (!z && (z || i2 == this.L - 1)) {
                            colorPicker$RadioButtonArr[i2].setTranslationX(i3);
                        } else {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i2], property, i3));
                        }
                    } else {
                        colorPicker$RadioButtonArr[i2].setVisibility(0);
                        if (this.E == null) {
                            colorPicker$RadioButtonArr[i2].setAlpha(1.0f);
                            colorPicker$RadioButtonArr[i2].setScaleX(1.0f);
                            colorPicker$RadioButtonArr[i2].setScaleY(1.0f);
                        }
                        colorPicker$RadioButtonArr[i2].setTranslationX(i3);
                    }
                    colorPicker$RadioButtonArr[i2].setTag(2131296463, 1);
                } else {
                    if (arrayList != null) {
                        if (z2) {
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i2], property4, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i2], property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i2], property2, 0.0f));
                        }
                    } else {
                        colorPicker$RadioButtonArr[i2].setVisibility(4);
                        if (this.E == null) {
                            colorPicker$RadioButtonArr[i2].setAlpha(0.0f);
                            colorPicker$RadioButtonArr[i2].setScaleX(0.0f);
                            colorPicker$RadioButtonArr[i2].setScaleY(0.0f);
                        }
                    }
                    if (!z) {
                        colorPicker$RadioButtonArr[i2].setTranslationX(i3);
                    }
                    colorPicker$RadioButtonArr[i2].setTag(2131296463, null);
                }
                i3 = de9.w(13.0f, gl.L(f5), i3);
                i2++;
                f3 = f5;
            } else {
                return;
            }
        }
    }

    public int getColor() {
        float[] fArr = this.O;
        float f = fArr[0];
        float[] fArr2 = this.P;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        fArr2[2] = getBrightness();
        return (Color.HSVToColor(fArr2) & 16777215) | (-16777216);
    }

    public final void h() {
        float f;
        float f2;
        c7 c7Var = this.G;
        if (c7Var == null) {
            return;
        }
        if (c7Var.getTag() != null) {
            f = 0.0f;
        } else {
            f = this.a0;
        }
        if (c7Var.getTag() != null) {
            f2 = 1.0f;
        } else {
            f2 = this.b0;
        }
        float[] fArr = this.O;
        float f3 = fArr[2];
        if (f == 0.0f && f2 == 1.0f) {
            this.c0 = 0.0f;
            this.d0 = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f3;
        float B = gl.B(HSVToColor);
        float max = Math.max(0.0f, Math.min(f / B, 1.0f));
        this.c0 = max;
        this.d0 = Math.max(max, Math.min(f2 / B, 1.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.y.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        int L = gl.L(45.0f);
        float f2 = L;
        canvas.drawBitmap(this.s, 0.0f, f2, (Paint) null);
        int height = this.s.getHeight() + L;
        Paint paint = this.e;
        canvas.drawRect(0.0f, f2, getMeasuredWidth(), L + 1, paint);
        canvas.drawRect(0.0f, height - 1, getMeasuredWidth(), height, paint);
        float[] fArr = this.O;
        float f3 = fArr[0];
        float[] fArr2 = this.P;
        fArr2[0] = f3;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int A = (int) tb4.A(1.0f, fArr[1], this.s.getHeight(), f2);
        if (!this.R) {
            int L2 = gl.L(16.0f);
            float interpolation = s33.g.getInterpolation(this.V);
            if (measuredWidth < L2) {
                measuredWidth = (int) (((L2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - L2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - L2)) * interpolation));
            }
            if (A < L + L2) {
                A = (int) ((interpolation * (i - A)) + A);
            } else if (A > (this.s.getHeight() + L) - L2) {
                A = (int) (A - (interpolation * (A - ((this.s.getHeight() + L) - L2))));
            }
        }
        b(canvas, measuredWidth, A, Color.HSVToColor(fArr2), false);
        RectF rectF = this.n;
        rectF.set(gl.L(22.0f), gl.L(26.0f) + height, getMeasuredWidth() - gl.L(22.0f), gl.L(34.0f) + height);
        LinearGradient linearGradient = this.Q;
        Paint paint2 = this.c;
        if (linearGradient == null) {
            fArr2[2] = this.c0;
            int HSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.d0;
            int HSVToColor2 = Color.HSVToColor(fArr2);
            float f4 = rectF.left;
            float f5 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f4, f5, rectF.right, f5, new int[]{HSVToColor2, HSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.Q = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint2);
        if (this.c0 == this.d0) {
            f = 0.5f;
        } else {
            float brightness = getBrightness();
            float f6 = this.c0;
            f = (brightness - f6) / (this.d0 - f6);
        }
        b(canvas, (int) ((rectF.width() * (1.0f - f)) + rectF.left), (int) rectF.centerY(), getColor(), true);
        if (!this.R && this.V < 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.W;
            this.W = elapsedRealtime;
            float f7 = (((float) j) / 180.0f) + this.V;
            this.V = f7;
            if (f7 > 1.0f) {
                this.V = 1.0f;
            }
            invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        g(getMeasuredWidth(), null, false);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.N != i) {
            this.N = i;
            int L = gl.L(180.0f);
            Bitmap createBitmap = Bitmap.createBitmap(i, L, Bitmap.Config.ARGB_8888);
            float f = i;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f2 = L;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, L / 3, 0.0f, f2, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.b;
            paint.setShader(composeShader);
            new Canvas(createBitmap).drawRect(0.0f, 0.0f, f, f2, paint);
            this.s = createBitmap;
            this.Q = null;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setHasChanges(boolean z) {
        Integer num;
        float f;
        TextView textView = this.I;
        Object tag = textView.getTag();
        if (z) {
            if (tag != null) {
                return;
            }
        } else if (tag == null) {
            return;
        }
        if (this.G.getTag() == null) {
            if (z) {
                num = 1;
            } else {
                num = null;
            }
            textView.setTag(num);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            if (z) {
                textView.setVisibility(0);
            }
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, View.ALPHA, f));
            animatorSet.addListener(new y7((byte) 22, this, z));
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(180L);
            animatorSet.start();
        }
    }

    public void setMaxBrightness(float f) {
        this.b0 = f;
        h();
    }

    public void setMinBrightness(float f) {
        this.a0 = f;
        h();
    }

    public void setResourcesProvider(wjb wjbVar) {
        this.e0 = wjbVar;
    }

    @Override
    public final void updateColors() {
        r7 r7Var = this.J;
        if (r7Var != null) {
            try {
                int v0 = bkb.v0(bkb.F6, this.e0);
                if (v0 != this.f0) {
                    this.f0 = v0;
                    r7Var.setIconColor(v0);
                }
                r7Var.O(bkb.v0(bkb.D8, this.e0), false);
                r7Var.O(bkb.v0(bkb.E8, this.e0), true);
                r7Var.I(bkb.v0(bkb.F8, this.e0));
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.F;
        if (editTextBoldCursorArr != null) {
            for (int i = 0; i < editTextBoldCursorArr.length; i++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i];
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setCursorColor(bkb.v0(bkb.F6, this.e0));
                    editTextBoldCursorArr[i].setHeaderHintColor(bkb.v0(bkb.K6, this.e0));
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
