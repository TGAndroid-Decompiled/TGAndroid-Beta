package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.security.KeyStoreException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import org.telegram.ui.LaunchActivity;
public class qc0 extends FrameLayout implements org.telegram.messenger.fs {
    public static final int[] f38877j0 = {2131296594, 2131296595, 2131296596, 2131296597, 2131296598, 2131296599, 2131296600, 2131296601, 2131296602, 2131296603, 2131296604, 2131296606};
    public final ImageView E;
    public final ImageView F;
    public final View G;
    public int H;
    public final ui.b I;
    public final dh.c J;
    public Bitmap K;
    public Canvas L;
    public int M;
    public final rh0 N;
    public final Rect O;
    public oc0 P;
    public boolean Q;
    public AnimatorSet R;
    public AnimatorSet S;
    public ValueAnimator T;
    public r1.g U;
    public final LinkedList V;
    public final LinkedList W;
    public Drawable f38878a;
    public final ArrayList f38879a0;
    public final FrameLayout f38880b;
    public float f38881b0;
    public final TextView f38882c;
    public int f38883c0;
    public final FrameLayout d;
    public final ik f38884d0;
    public final bi.t2 f38885e;
    public int f38886e0;
    public final ArrayList f38887f;
    public hi.o3 f38888f0;
    public boolean f38889g0;
    public final FrameLayout h;
    public ValueAnimator f38890h0;
    public final int[] f38891i0;
    public final nc0 f38892n;
    public final EditTextBoldCursor f38893r;
    public final hi.x7 f38894s;
    public final ai.l0 f38895w;
    public final TextView f38896x;
    public final TextView f38897y;

    public qc0(Context context) {
        super(context);
        String N0 = org.telegram.messenger.gd.N0(2131743607, null);
        this.H = 0;
        ui.b bVar = new ui.b();
        this.I = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.J = cVar;
        xe.b bVar2 = new xe.b();
        this.O = new Rect();
        this.V = new LinkedList();
        this.W = new LinkedList();
        this.f38879a0 = new ArrayList();
        this.f38883c0 = -12;
        this.f38884d0 = new ik(this, 11);
        this.f38889g0 = true;
        this.f38891i0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        ai.l0 l0Var = new ai.l0(this, context);
        this.f38895w = l0Var;
        l0Var.setWillNotDraw(false);
        addView(l0Var, c8.ma.c(-1.0f, -1));
        cVar.h = new jh.k(l0Var);
        cVar.f8406i = l0Var;
        cVar.f8405g = bVar2;
        ?? imageView = new ImageView(context);
        this.N = imageView;
        imageView.f(2131624112, 58, 58, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, c8.ma.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        l0Var.addView(frameLayout, c8.ma.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f38896x = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setAlpha(0.0f);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, c8.ma.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.f38897y = m10;
        m10.setTextColor(-1);
        m10.setTextSize(1, 15.0f);
        m10.setGravity(1);
        m10.setVisibility(4);
        l0Var.addView(m10, c8.ma.e(-2, -2, 17));
        hi.x7 x7Var = new hi.x7(this, context);
        this.f38894s = x7Var;
        frameLayout.addView(x7Var, c8.ma.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f38893r = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 36.0f);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setGravity(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setCursorColor(-1);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(32.0f));
        frameLayout.addView(editTextBoldCursor, c8.ma.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new h(this, 5));
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 24));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new oi.z0(1));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setImageResource(2131232514);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(2131230881);
        frameLayout.addView(imageView2, c8.ma.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView2.setContentDescription(org.telegram.messenger.gd.N0(2131751342, null));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final qc0 f35873b;

            {
                this.f35873b = this;
            }

            @Override
            public final void onClick(View view) {
                qc0 qc0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                int i7;
                boolean z10;
                LinkedList linkedList3;
                int i10;
                int i11;
                qc0 qc0Var2;
                boolean z11;
                boolean z12;
                int i12 = r2;
                qc0 qc0Var3 = this.f35873b;
                switch (i12) {
                    case 0:
                        qc0Var3.n(false);
                        return;
                    case 1:
                        qc0Var3.c();
                        return;
                    default:
                        LinkedList linkedList4 = qc0Var3.W;
                        LinkedList linkedList5 = qc0Var3.V;
                        hi.x7 x7Var2 = qc0Var3.f38894s;
                        if (qc0Var3.f38889g0 && !qc0Var3.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("0");
                                    z10 = i7;
                                    break;
                                case 1:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("1");
                                    z10 = i7;
                                    break;
                                case 2:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("2");
                                    z10 = i7;
                                    break;
                                case 3:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("3");
                                    z10 = i7;
                                    break;
                                case 4:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("4");
                                    z10 = i7;
                                    break;
                                case 5:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("5");
                                    z10 = i7;
                                    break;
                                case 6:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("6");
                                    z10 = i7;
                                    break;
                                case 7:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("7");
                                    z10 = i7;
                                    break;
                                case 8:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("8");
                                    z10 = i7;
                                    break;
                                case 9:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("9");
                                    z10 = i7;
                                    break;
                                case 10:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    qc0Var.c();
                                    z10 = i7;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) x7Var2.f15755c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    i7 = false;
                                    ArrayList arrayList2 = (ArrayList) x7Var2.f15754b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) x7Var2.d;
                                    if (sb2.length() == 0) {
                                        qc0Var = qc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = i7;
                                        break;
                                    } else {
                                        try {
                                            x7Var2.performHapticFeedback(3);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int i13 = 1;
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i14 = length;
                                        while (i14 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i14);
                                            qc0 qc0Var4 = qc0Var3;
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i10 = i13;
                                                float[] fArr = new float[i10];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, fArr));
                                                float[] fArr2 = new float[i10];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, fArr2));
                                                float[] fArr3 = new float[i10];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, fArr3));
                                                float[] fArr4 = new float[i10];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property, fArr4));
                                                float[] fArr5 = new float[i10];
                                                fArr5[0] = x7Var2.c(i14);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i10 = i13;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i14);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i10];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr6));
                                                float[] fArr7 = new float[i10];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr7));
                                                float[] fArr8 = new float[i10];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr8));
                                                float[] fArr9 = new float[i10];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr9));
                                                i11 = i14;
                                                float[] fArr10 = new float[i10];
                                                fArr10[0] = x7Var2.c(i14);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i11 = i14;
                                            }
                                            i14 = i11 + 1;
                                            linkedList5 = linkedList3;
                                            qc0Var3 = qc0Var4;
                                            i13 = 1;
                                        }
                                        qc0Var = qc0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i15 = 0; i15 < length; i15++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i15), property5, x7Var2.c(i15)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i15), property5, x7Var2.c(i15)));
                                        }
                                        we weVar = (we) x7Var2.f15757f;
                                        if (weVar != null) {
                                            org.telegram.messenger.g0.r(weVar);
                                            x7Var2.f15757f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) x7Var2.f15756e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        x7Var2.f15756e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) x7Var2.f15756e).playTogether(arrayList3);
                                        ((AnimatorSet) x7Var2.f15756e).addListener(new lc0(x7Var2, 1));
                                        ((AnimatorSet) x7Var2.f15756e).start();
                                        qc0.a((qc0) x7Var2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    z10 = i7;
                                    break;
                            }
                            if (intValue == 11) {
                                qc0Var2 = qc0Var;
                            } else {
                                qc0Var2 = qc0Var;
                                Drawable drawable = qc0Var2.f38878a;
                                if (drawable instanceof cb0) {
                                    cb0 cb0Var = (cb0) drawable;
                                    cb0Var.D = null;
                                    cb0Var.y();
                                    float f10 = cb0Var.h;
                                    if (intValue == 10) {
                                        if (z10) {
                                            cb0Var.x();
                                            z12 = true;
                                        } else {
                                            z12 = i7;
                                        }
                                        z11 = i7;
                                    } else {
                                        z11 = true;
                                        cb0Var.w(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f10 >= 1.0f) {
                                            qc0Var2.b(cb0Var);
                                        } else {
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(new di.p6(qc0Var2, z11, cb0Var, 22));
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z11));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i16 = i7; i16 < linkedList6.size(); i16++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i16);
                                                Boolean bool = (Boolean) linkedList7.get(i16);
                                                if (bool != null && bool.booleanValue() != z11) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i16));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i17 = i7;
                                            while (i17 < size) {
                                                Object obj = arrayList4.get(i17);
                                                i17++;
                                                linkedList6.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.pe(10));
                                            int size2 = arrayList5.size();
                                            int i18 = i7;
                                            while (i18 < size2) {
                                                Object obj2 = arrayList5.get(i18);
                                                i18++;
                                                linkedList7.remove(((Integer) obj2).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) x7Var2.d).length() == 4) {
                                qc0Var2.n(i7);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setImageResource(2131231189);
        imageView3.setScaleType(scaleType);
        imageView3.setBackgroundResource(2131230881);
        frameLayout.addView(imageView3, c8.ma.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView3.setContentDescription(org.telegram.messenger.gd.N0(2131754881, null));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final qc0 f35873b;

            {
                this.f35873b = this;
            }

            @Override
            public final void onClick(View view) {
                qc0 qc0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                int i7;
                boolean z10;
                LinkedList linkedList3;
                int i10;
                int i11;
                qc0 qc0Var2;
                boolean z11;
                boolean z12;
                int i12 = r2;
                qc0 qc0Var3 = this.f35873b;
                switch (i12) {
                    case 0:
                        qc0Var3.n(false);
                        return;
                    case 1:
                        qc0Var3.c();
                        return;
                    default:
                        LinkedList linkedList4 = qc0Var3.W;
                        LinkedList linkedList5 = qc0Var3.V;
                        hi.x7 x7Var2 = qc0Var3.f38894s;
                        if (qc0Var3.f38889g0 && !qc0Var3.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("0");
                                    z10 = i7;
                                    break;
                                case 1:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("1");
                                    z10 = i7;
                                    break;
                                case 2:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("2");
                                    z10 = i7;
                                    break;
                                case 3:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("3");
                                    z10 = i7;
                                    break;
                                case 4:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("4");
                                    z10 = i7;
                                    break;
                                case 5:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("5");
                                    z10 = i7;
                                    break;
                                case 6:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("6");
                                    z10 = i7;
                                    break;
                                case 7:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("7");
                                    z10 = i7;
                                    break;
                                case 8:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("8");
                                    z10 = i7;
                                    break;
                                case 9:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    x7Var2.b("9");
                                    z10 = i7;
                                    break;
                                case 10:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    qc0Var.c();
                                    z10 = i7;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) x7Var2.f15755c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    i7 = false;
                                    ArrayList arrayList2 = (ArrayList) x7Var2.f15754b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) x7Var2.d;
                                    if (sb2.length() == 0) {
                                        qc0Var = qc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = i7;
                                        break;
                                    } else {
                                        try {
                                            x7Var2.performHapticFeedback(3);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int i13 = 1;
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i14 = length;
                                        while (i14 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i14);
                                            qc0 qc0Var4 = qc0Var3;
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i10 = i13;
                                                float[] fArr = new float[i10];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, fArr));
                                                float[] fArr2 = new float[i10];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, fArr2));
                                                float[] fArr3 = new float[i10];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, fArr3));
                                                float[] fArr4 = new float[i10];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property, fArr4));
                                                float[] fArr5 = new float[i10];
                                                fArr5[0] = x7Var2.c(i14);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i10 = i13;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i14);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i10];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr6));
                                                float[] fArr7 = new float[i10];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr7));
                                                float[] fArr8 = new float[i10];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr8));
                                                float[] fArr9 = new float[i10];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr9));
                                                i11 = i14;
                                                float[] fArr10 = new float[i10];
                                                fArr10[0] = x7Var2.c(i14);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i11 = i14;
                                            }
                                            i14 = i11 + 1;
                                            linkedList5 = linkedList3;
                                            qc0Var3 = qc0Var4;
                                            i13 = 1;
                                        }
                                        qc0Var = qc0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i15 = 0; i15 < length; i15++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i15), property5, x7Var2.c(i15)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i15), property5, x7Var2.c(i15)));
                                        }
                                        we weVar = (we) x7Var2.f15757f;
                                        if (weVar != null) {
                                            org.telegram.messenger.g0.r(weVar);
                                            x7Var2.f15757f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) x7Var2.f15756e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        x7Var2.f15756e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) x7Var2.f15756e).playTogether(arrayList3);
                                        ((AnimatorSet) x7Var2.f15756e).addListener(new lc0(x7Var2, 1));
                                        ((AnimatorSet) x7Var2.f15756e).start();
                                        qc0.a((qc0) x7Var2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    qc0Var = qc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i7 = false;
                                    z10 = i7;
                                    break;
                            }
                            if (intValue == 11) {
                                qc0Var2 = qc0Var;
                            } else {
                                qc0Var2 = qc0Var;
                                Drawable drawable = qc0Var2.f38878a;
                                if (drawable instanceof cb0) {
                                    cb0 cb0Var = (cb0) drawable;
                                    cb0Var.D = null;
                                    cb0Var.y();
                                    float f10 = cb0Var.h;
                                    if (intValue == 10) {
                                        if (z10) {
                                            cb0Var.x();
                                            z12 = true;
                                        } else {
                                            z12 = i7;
                                        }
                                        z11 = i7;
                                    } else {
                                        z11 = true;
                                        cb0Var.w(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f10 >= 1.0f) {
                                            qc0Var2.b(cb0Var);
                                        } else {
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(new di.p6(qc0Var2, z11, cb0Var, 22));
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z11));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i16 = i7; i16 < linkedList6.size(); i16++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i16);
                                                Boolean bool = (Boolean) linkedList7.get(i16);
                                                if (bool != null && bool.booleanValue() != z11) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i16));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i17 = i7;
                                            while (i17 < size) {
                                                Object obj = arrayList4.get(i17);
                                                i17++;
                                                linkedList6.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.pe(10));
                                            int size2 = arrayList5.size();
                                            int i18 = i7;
                                            while (i18 < size2) {
                                                Object obj2 = arrayList5.get(i18);
                                                i18++;
                                                linkedList7.remove(((Integer) obj2).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) x7Var2.d).length() == 4) {
                                qc0Var2.n(i7);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        View view = new View(context);
        this.G = view;
        view.setBackgroundColor(822083583);
        frameLayout.addView(view, c8.ma.a(-1.0f, 1.0f / org.telegram.messenger.g0.f24145p, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        l0Var.addView(frameLayout2, c8.ma.e(-1, -1, 51));
        bi.t2 t2Var = new bi.t2(context, 18);
        this.f38885e = t2Var;
        t2Var.setClipChildren(false);
        frameLayout2.addView(t2Var, c8.ma.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f38880b = frameLayout3;
        t2Var.addView(frameLayout3, c8.ma.e(-2, -2, 49));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(N0);
        TextView m11 = org.telegram.ui.Cells.c0.m(frameLayout3, textView2, c8.ma.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.f38882c = m11;
        m11.setTextSize(1, 14.0f);
        m11.setTextColor(-1);
        m11.setText((CharSequence) null);
        frameLayout3.addView(m11, c8.ma.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f38887f = new ArrayList(10);
        for (int i7 = 0; i7 < 12; i7++) {
            nc0 nc0Var = new nc0(context);
            c8.ra.b(nc0Var, 0.15f, 1.5f);
            nc0Var.setTag(Integer.valueOf(i7));
            int[] iArr = f38877j0;
            if (i7 == 11) {
                nc0Var.setBackground(f(nc0Var));
                int L = org.telegram.messenger.g0.L(30.0f);
                nc0Var.setForeground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, 654311423, 654311423));
                nc0Var.setImage(2131231101);
                nc0Var.setOnLongClickListener(new q00(this, 1));
                nc0Var.setContentDescription(org.telegram.messenger.gd.N0(2131754920, null));
                nc0Var.setNextFocusForwardId(2131296594);
                nc0Var.setAccessibilityTraversalBefore(2131296594);
            } else if (i7 == 10) {
                this.f38892n = nc0Var;
                nc0Var.setBackground(f(nc0Var));
                int L2 = org.telegram.messenger.g0.L(30.0f);
                nc0Var.setForeground(org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 0, 654311423, 654311423));
                nc0Var.setContentDescription(org.telegram.messenger.gd.N0(2131754881, null));
                nc0Var.setImage(2131231189);
                nc0Var.setNextFocusForwardId(2131296595);
                nc0Var.setAccessibilityTraversalBefore(2131296595);
            } else {
                nc0Var.setBackground(f(nc0Var));
                int L3 = org.telegram.messenger.g0.L(30.0f);
                nc0Var.setForeground(org.telegram.ui.ActionBar.m6.k0(L3, L3, L3, L3, 0, 654311423, 654311423));
                nc0Var.setContentDescription(i7 + "");
                nc0Var.setNum(i7);
                if (i7 == 0) {
                    nc0Var.setNextFocusForwardId(2131296604);
                    nc0Var.setAccessibilityTraversalBefore(2131296604);
                } else if (i7 == 9) {
                    if (g()) {
                        nc0Var.setNextFocusForwardId(2131296606);
                        nc0Var.setAccessibilityTraversalBefore(2131296606);
                    } else {
                        nc0Var.setNextFocusForwardId(2131296594);
                        nc0Var.setAccessibilityTraversalBefore(2131296594);
                    }
                } else {
                    int i10 = iArr[i7 + 1];
                    nc0Var.setNextFocusForwardId(i10);
                    nc0Var.setAccessibilityTraversalBefore(i10);
                }
            }
            nc0Var.setId(iArr[i7]);
            nc0Var.setOnClickListener(new View.OnClickListener(this) {
                public final qc0 f35873b;

                {
                    this.f35873b = this;
                }

                @Override
                public final void onClick(View view2) {
                    qc0 qc0Var;
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    int i72;
                    boolean z10;
                    LinkedList linkedList3;
                    int i102;
                    int i11;
                    qc0 qc0Var2;
                    boolean z11;
                    boolean z12;
                    int i12 = r2;
                    qc0 qc0Var3 = this.f35873b;
                    switch (i12) {
                        case 0:
                            qc0Var3.n(false);
                            return;
                        case 1:
                            qc0Var3.c();
                            return;
                        default:
                            LinkedList linkedList4 = qc0Var3.W;
                            LinkedList linkedList5 = qc0Var3.V;
                            hi.x7 x7Var2 = qc0Var3.f38894s;
                            if (qc0Var3.f38889g0 && !qc0Var3.Q) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        qc0Var = qc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i72 = false;
                                        x7Var2.b("0");
                                        z10 = i72;
                                        break;
                                    case 1:
                                        qc0Var = qc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i72 = false;
                                        x7Var2.b("1");
                                        z10 = i72;
                                        break;
                                    case 2:
                                        qc0Var = qc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i72 = false;
                                        x7Var2.b("2");
                                        z10 = i72;
                                        break;
                                    case 3:
                                        qc0Var = qc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i72 = false;
                                        x7Var2.b("3");
                                        z10 = i72;
                                        break;
                                    case 4:
                                        qc0Var = qc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i72 = false;
                                        x7Var2.b("4");
                                        z10 = i72;
                                        break;
                                    case 5:
                                        qc0Var = qc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i72 = false;
                                        x7Var2.b("5");
                                        z10 = i72;
                                        break;
                                    case 6:
                                        qc0Var = qc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i72 = false;
                                        x7Var2.b("6");
                                        z10 = i72;
                                        break;
                                    case 7:
                                        qc0Var = qc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i72 = false;
                                        x7Var2.b("7");
                                        z10 = i72;
                                        break;
                                    case 8:
                                        qc0Var = qc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i72 = false;
                                        x7Var2.b("8");
                                        z10 = i72;
                                        break;
                                    case 9:
                                        qc0Var = qc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i72 = false;
                                        x7Var2.b("9");
                                        z10 = i72;
                                        break;
                                    case 10:
                                        qc0Var = qc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i72 = false;
                                        qc0Var.c();
                                        z10 = i72;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) x7Var2.f15755c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        i72 = false;
                                        ArrayList arrayList2 = (ArrayList) x7Var2.f15754b;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb2 = (StringBuilder) x7Var2.d;
                                        if (sb2.length() == 0) {
                                            qc0Var = qc0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = i72;
                                            break;
                                        } else {
                                            try {
                                                x7Var2.performHapticFeedback(3);
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, true);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int i13 = 1;
                                            int length = sb2.length() - 1;
                                            if (length != 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            linkedList = linkedList4;
                                            int i14 = length;
                                            while (i14 < 4) {
                                                TextView textView22 = (TextView) arrayList2.get(i14);
                                                qc0 qc0Var4 = qc0Var3;
                                                if (textView22.getAlpha() != 0.0f) {
                                                    linkedList3 = linkedList5;
                                                    i102 = i13;
                                                    float[] fArr = new float[i102];
                                                    fArr[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, property4, fArr));
                                                    float[] fArr2 = new float[i102];
                                                    fArr2[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, property3, fArr2));
                                                    float[] fArr3 = new float[i102];
                                                    fArr3[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, property2, fArr3));
                                                    float[] fArr4 = new float[i102];
                                                    fArr4[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, property, fArr4));
                                                    float[] fArr5 = new float[i102];
                                                    fArr5[0] = x7Var2.c(i14);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, property5, fArr5));
                                                } else {
                                                    linkedList3 = linkedList5;
                                                    i102 = i13;
                                                }
                                                TextView textView3 = (TextView) arrayList.get(i14);
                                                if (textView3.getAlpha() != 0.0f) {
                                                    float[] fArr6 = new float[i102];
                                                    fArr6[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr6));
                                                    float[] fArr7 = new float[i102];
                                                    fArr7[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr7));
                                                    float[] fArr8 = new float[i102];
                                                    fArr8[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr8));
                                                    float[] fArr9 = new float[i102];
                                                    fArr9[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr9));
                                                    i11 = i14;
                                                    float[] fArr10 = new float[i102];
                                                    fArr10[0] = x7Var2.c(i14);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                                } else {
                                                    i11 = i14;
                                                }
                                                i14 = i11 + 1;
                                                linkedList5 = linkedList3;
                                                qc0Var3 = qc0Var4;
                                                i13 = 1;
                                            }
                                            qc0Var = qc0Var3;
                                            linkedList2 = linkedList5;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i15 = 0; i15 < length; i15++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i15), property5, x7Var2.c(i15)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i15), property5, x7Var2.c(i15)));
                                            }
                                            we weVar = (we) x7Var2.f15757f;
                                            if (weVar != null) {
                                                org.telegram.messenger.g0.r(weVar);
                                                x7Var2.f15757f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) x7Var2.f15756e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            x7Var2.f15756e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) x7Var2.f15756e).playTogether(arrayList3);
                                            ((AnimatorSet) x7Var2.f15756e).addListener(new lc0(x7Var2, 1));
                                            ((AnimatorSet) x7Var2.f15756e).start();
                                            qc0.a((qc0) x7Var2.h);
                                            z10 = true;
                                            break;
                                        }
                                    default:
                                        qc0Var = qc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i72 = false;
                                        z10 = i72;
                                        break;
                                }
                                if (intValue == 11) {
                                    qc0Var2 = qc0Var;
                                } else {
                                    qc0Var2 = qc0Var;
                                    Drawable drawable = qc0Var2.f38878a;
                                    if (drawable instanceof cb0) {
                                        cb0 cb0Var = (cb0) drawable;
                                        cb0Var.D = null;
                                        cb0Var.y();
                                        float f10 = cb0Var.h;
                                        if (intValue == 10) {
                                            if (z10) {
                                                cb0Var.x();
                                                z12 = true;
                                            } else {
                                                z12 = i72;
                                            }
                                            z11 = i72;
                                        } else {
                                            z11 = true;
                                            cb0Var.w(true);
                                            z12 = true;
                                        }
                                        if (z12) {
                                            if (f10 >= 1.0f) {
                                                qc0Var2.b(cb0Var);
                                            } else {
                                                LinkedList linkedList6 = linkedList2;
                                                linkedList6.offer(new di.p6(qc0Var2, z11, cb0Var, 22));
                                                LinkedList linkedList7 = linkedList;
                                                linkedList7.offer(Boolean.valueOf(z11));
                                                ArrayList arrayList4 = new ArrayList();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (int i16 = i72; i16 < linkedList6.size(); i16++) {
                                                    Runnable runnable = (Runnable) linkedList6.get(i16);
                                                    Boolean bool = (Boolean) linkedList7.get(i16);
                                                    if (bool != null && bool.booleanValue() != z11) {
                                                        arrayList4.add(runnable);
                                                        arrayList5.add(Integer.valueOf(i16));
                                                    }
                                                }
                                                int size = arrayList4.size();
                                                int i17 = i72;
                                                while (i17 < size) {
                                                    Object obj = arrayList4.get(i17);
                                                    i17++;
                                                    linkedList6.remove((Runnable) obj);
                                                }
                                                Collections.sort(arrayList5, new org.telegram.ui.pe(10));
                                                int size2 = arrayList5.size();
                                                int i18 = i72;
                                                while (i18 < size2) {
                                                    Object obj2 = arrayList5.get(i18);
                                                    i18++;
                                                    linkedList7.remove(((Integer) obj2).intValue());
                                                }
                                            }
                                        }
                                    }
                                }
                                if (((StringBuilder) x7Var2.d).length() == 4) {
                                    qc0Var2.n(i72);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
            this.f38887f.add(nc0Var);
        }
        for (int i11 = 11; i11 >= 0; i11--) {
            this.f38885e.addView((FrameLayout) this.f38887f.get(i11), c8.ma.e(60, 60, 51));
        }
        d();
    }

    public static void a(qc0 qc0Var) {
        boolean z10;
        float f10;
        float f11;
        FrameLayout frameLayout = qc0Var.f38880b;
        hi.x7 x7Var = qc0Var.f38894s;
        if (x7Var != null && ((StringBuilder) x7Var.d).length() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            ViewPropertyAnimator animate = frameLayout.animate();
            float f12 = 1.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z10) {
                f11 = 0.8f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z10) {
                f12 = 0.8f;
            }
            org.telegram.messenger.n10.o(scaleX.scaleY(f12), nr.h, 320L);
        }
    }

    public final void b(cb0 cb0Var) {
        r1.g gVar = this.U;
        if (gVar != null && gVar.f56358f) {
            gVar.d();
        }
        r1.f fVar = new r1.f(0.0f);
        cb0Var.D = new ky(fVar, 8);
        cb0Var.y();
        r1.g gVar2 = new r1.g(fVar);
        gVar2.f56364m = org.telegram.ui.Cells.c0.p(100.0f, 300.0f, 1.0f);
        this.U = gVar2;
        gVar2.a(new bi.y0(5, this, cb0Var));
        this.U.b(new j7(cb0Var, 5));
        this.U.h();
    }

    public final void c() {
        Activity W;
        sc0 sc0Var;
        if (!this.Q && (W = org.telegram.messenger.g0.W(getContext())) != null && this.f38892n.getVisibility() == 0 && !org.telegram.messenger.t0.f26949x) {
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                ArrayList arrayList = launchActivity.A0;
                if (arrayList.isEmpty() && (sc0Var = launchActivity.f43155z0) != null) {
                    if (this != sc0Var.f39560b) {
                        return;
                    }
                } else if (i5.c.h(1, arrayList) != this) {
                    return;
                }
            }
            try {
                if (new android.support.v4.media.session.a0(new androidx.biometric.t(getContext(), 0)).c(15) == 0 && org.telegram.messenger.vr.g() && !org.telegram.messenger.vr.a()) {
                    d6.i iVar = new d6.i(LaunchActivity.H1, f0.d.e(getContext()), new ki.n(this, 1));
                    m6.n nVar = new m6.n(1);
                    nVar.f20907b = org.telegram.messenger.gd.N0(2131743607, null);
                    nVar.d = org.telegram.messenger.gd.N0(2131743549, null);
                    nVar.f20906a = 15;
                    iVar.g(nVar.b(), null);
                    o(false);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void d() {
        int i7;
        int i10;
        boolean g10 = g();
        if (g10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        nc0 nc0Var = this.f38892n;
        nc0Var.setVisibility(i7);
        if (org.telegram.messenger.bz.f23219r == 1) {
            this.F.setVisibility(nc0Var.getVisibility());
        }
        if (org.telegram.messenger.bz.f23219r == 1) {
            i10 = 2131751104;
        } else if (g10) {
            i10 = 2131751105;
        } else {
            i10 = 2131751106;
        }
        this.f38882c.setText(org.telegram.messenger.gd.N0(i10, null));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.Q1) {
            d();
            if (((Boolean) objArr[0]).booleanValue() && org.telegram.messenger.bz.f23236x) {
                c();
            }
        } else if (i7 == org.telegram.messenger.ks.f25188o0 && objArr[0] != this) {
            setVisibility(8);
            j();
        }
    }

    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > org.telegram.messenger.bz.f23228u) {
            long j3 = org.telegram.messenger.bz.f23225t - (elapsedRealtime - org.telegram.messenger.bz.f23228u);
            org.telegram.messenger.bz.f23225t = j3;
            if (j3 < 0) {
                org.telegram.messenger.bz.f23225t = 0L;
            }
        }
        org.telegram.messenger.bz.f23228u = elapsedRealtime;
        org.telegram.messenger.bz.y();
        long j10 = org.telegram.messenger.bz.f23225t;
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        EditTextBoldCursor editTextBoldCursor = this.f38893r;
        FrameLayout frameLayout = this.h;
        ik ikVar = this.f38884d0;
        TextView textView = this.f38897y;
        if (i7 > 0) {
            int max = Math.max(1, (int) Math.ceil(j10 / 1000.0d));
            if (max != this.f38886e0) {
                textView.setText(org.telegram.messenger.gd.a0(null, null, 2131743795, org.telegram.messenger.gd.G(max, "Seconds", new Object[0])));
                this.f38886e0 = max;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                frameLayout.setVisibility(4);
                o(false);
                org.telegram.messenger.g0.v1(editTextBoldCursor);
            }
            org.telegram.messenger.g0.r(ikVar);
            org.telegram.messenger.g0.h3(ikVar, 100L);
            return;
        }
        org.telegram.messenger.g0.r(ikVar);
        if (textView.getVisibility() == 0) {
            textView.setVisibility(4);
            frameLayout.setVisibility(0);
            o(true);
            if (org.telegram.messenger.bz.f23219r == 1) {
                org.telegram.messenger.g0.I3(editTextBoldCursor);
            }
        }
    }

    public final pc0 f(nc0 nc0Var) {
        gh.e eVar = new gh.e(null);
        eVar.f13654e = new xb0(2);
        if (Build.VERSION.SDK_INT < 29) {
            eVar.f(1308622847, 1308622847);
            eVar.e(452984831, 452984831);
            float N = org.telegram.messenger.g0.N(1.0f);
            float N2 = org.telegram.messenger.g0.N(0.6666667f);
            eVar.f13655f = N;
            eVar.h = N2;
        }
        fh.g c10 = this.J.c(nc0Var, eVar, true);
        c10.r(org.telegram.messenger.g0.L(30.0f));
        return new pc0(c10);
    }

    public final boolean g() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qc0.g():boolean");
    }

    public final boolean i() {
        hi.o3 o3Var = this.f38888f0;
        if (o3Var != null && o3Var.c()) {
            org.telegram.messenger.g0.v1(this.f38893r);
            return false;
        }
        return true;
    }

    public final void k() {
        org.telegram.messenger.g0.r(this.f38884d0);
    }

    public final void l() {
        if (!this.Q) {
            e();
            if (this.f38897y.getVisibility() != 0) {
                if (org.telegram.messenger.bz.f23219r == 1) {
                    EditTextBoldCursor editTextBoldCursor = this.f38893r;
                    if (editTextBoldCursor != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.I3(editTextBoldCursor);
                    }
                    org.telegram.messenger.g0.h3(new fc0(this, 0), 200L);
                }
                c();
            }
        }
    }

    public final void m(boolean z10, int i7, int i10, org.telegram.ui.h60 h60Var) {
        View currentFocus;
        boolean z11;
        p9 p9Var;
        int i11;
        int i12;
        if (getVisibility() != 0) {
            this.Q = false;
        }
        d();
        e();
        Activity W = org.telegram.messenger.g0.W(getContext());
        int i13 = org.telegram.messenger.bz.f23219r;
        TextView textView = this.f38897y;
        EditTextBoldCursor editTextBoldCursor = this.f38893r;
        if (i13 == 1) {
            if (!z10 && textView.getVisibility() != 0 && editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
            }
        } else if (W != null && (currentFocus = W.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            org.telegram.messenger.g0.v1(W.getCurrentFocus());
        }
        if (getVisibility() == 0) {
            return;
        }
        setTranslationY(0.0f);
        this.f38878a = null;
        boolean z12 = org.telegram.ui.ActionBar.m6.s0() instanceof cb0;
        ai.l0 l0Var = this.f38895w;
        if (z12) {
            z11 = !org.telegram.ui.ActionBar.m6.I.q();
            this.f38878a = org.telegram.ui.ActionBar.m6.s0();
            l0Var.setBackgroundColor(-1090519040);
        } else {
            if (org.telegram.ui.ActionBar.m6.W && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.m6.K0()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.m6.K0())) {
                org.telegram.ui.ActionBar.d6 d6Var = org.telegram.ui.ActionBar.m6.I.f29243j0;
                if (d6Var != null && (i11 = d6Var.d) != 0 && (i12 = d6Var.f28883e) != 0) {
                    p9Var = new p9(p9.d(d6Var.h), new int[]{i11, i12});
                } else {
                    p9Var = null;
                }
                this.f38878a = p9Var;
                if (p9Var == null) {
                    this.f38878a = org.telegram.ui.ActionBar.m6.s0();
                }
                if (this.f38878a instanceof p9) {
                    l0Var.setBackgroundColor(570425344);
                } else {
                    l0Var.setBackgroundColor(-1090519040);
                }
            } else {
                if (!"d".equals(org.telegram.ui.ActionBar.m6.K0())) {
                    String K0 = org.telegram.ui.ActionBar.m6.K0();
                    if (!org.telegram.ui.ActionBar.m6.f29482j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(K0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(K0)) {
                        Drawable s02 = org.telegram.ui.ActionBar.m6.s0();
                        this.f38878a = s02;
                        if (s02 instanceof p9) {
                            l0Var.setBackgroundColor(570425344);
                        } else if (s02 != null) {
                            l0Var.setBackgroundColor(-1090519040);
                        } else {
                            l0Var.setBackgroundColor(-11436898);
                        }
                    }
                }
                l0Var.setBackgroundColor(-11436898);
            }
            z11 = false;
        }
        Drawable drawable = this.f38878a;
        if (drawable instanceof cb0) {
            cb0 cb0Var = (cb0) drawable;
            int[] iArr = cb0Var.f34149a;
            if (z11) {
                int[] iArr2 = new int[iArr.length];
                for (int i14 = 0; i14 < iArr.length; i14++) {
                    iArr2[i14] = org.telegram.ui.ActionBar.m6.b(0.14f, 0.0f, iArr[i14]);
                }
                iArr = iArr2;
            }
            this.f38878a = new cb0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (cb0Var.f34171u != null && cb0Var.f34167q < 0) {
                l0Var.setBackgroundColor(2130706432);
            } else {
                l0Var.setBackgroundColor(570425344);
            }
            ((cb0) this.f38878a).q(l0Var);
        }
        this.f38896x.setText(org.telegram.messenger.gd.N0(2131754229, null));
        int i15 = org.telegram.messenger.bz.f23219r;
        ImageView imageView = this.F;
        ImageView imageView2 = this.E;
        bi.t2 t2Var = this.f38885e;
        hi.x7 x7Var = this.f38894s;
        if (i15 == 0) {
            if (textView.getVisibility() != 0) {
                t2Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            x7Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i15 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            t2Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            x7Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.f38892n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        hi.x7.a(x7Var, false);
        if (z10) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new kc0(this, i7, i10, h60Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.f38881b0 = 1.0f;
            h(1.0f);
            rh0 rh0Var = this.N;
            rh0Var.setScaleX(1.0f);
            rh0Var.setScaleY(1.0f);
            rh0Var.i();
            rh0Var.getAnimatedDrawable().N(38, false, false);
            if (h60Var != null) {
                h60Var.run();
            }
        }
        setOnTouchListener(new gi.a(20));
    }

    public final void n(boolean z10) {
        String str;
        if (!this.Q && getVisibility() == 0) {
            EditTextBoldCursor editTextBoldCursor = this.f38893r;
            if (!z10) {
                if (org.telegram.messenger.bz.f23225t <= 0) {
                    int i7 = org.telegram.messenger.bz.f23219r;
                    hi.x7 x7Var = this.f38894s;
                    if (i7 == 0) {
                        str = ((StringBuilder) x7Var.d).toString();
                    } else if (i7 != 1) {
                        str = "";
                    } else {
                        str = editTextBoldCursor.getText().toString();
                    }
                    int length = str.length();
                    FrameLayout frameLayout = this.f38880b;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.NOTIFICATION_ERROR;
                    if (length == 0) {
                        q2Var.a();
                        int i10 = -this.f38883c0;
                        this.f38883c0 = i10;
                        org.telegram.messenger.g0.E3(i10, frameLayout, null);
                        return;
                    } else if (!org.telegram.messenger.bz.g(str)) {
                        org.telegram.messenger.bz.r();
                        if (org.telegram.messenger.bz.f23225t > 0) {
                            e();
                        }
                        editTextBoldCursor.setText("");
                        hi.x7.a(x7Var, true);
                        q2Var.a();
                        int i11 = -this.f38883c0;
                        this.f38883c0 = i11;
                        org.telegram.messenger.g0.E3(i11, frameLayout, null);
                        Drawable drawable = this.f38878a;
                        if (drawable instanceof cb0) {
                            cb0 cb0Var = (cb0) drawable;
                            LinkedList linkedList = this.V;
                            linkedList.clear();
                            LinkedList linkedList2 = this.W;
                            linkedList2.clear();
                            r1.g gVar = this.U;
                            if (gVar != null && gVar.f56358f) {
                                linkedList.offer(new bb0(cb0Var, 1));
                                linkedList2.offer(Boolean.FALSE);
                                return;
                            }
                            cb0Var.m(true);
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            this.Q = true;
            k();
            org.telegram.messenger.bz.v = 0;
            editTextBoldCursor.clearFocus();
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            if (org.telegram.messenger.vr.g() && org.telegram.messenger.vr.a()) {
                try {
                    org.telegram.messenger.vr.e().deleteEntry("tmessages_passcode");
                } catch (KeyStoreException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.messenger.vr.f27616g = null;
                org.telegram.messenger.vr.b(false);
            }
            org.telegram.messenger.bz.f23236x = false;
            org.telegram.messenger.bz.y();
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25183n0, new Object[0]);
            setOnTouchListener(null);
            oc0 oc0Var = this.P;
            if (oc0Var != null) {
                oc0Var.p(this);
            }
            AnimatorSet animatorSet = this.R;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.R = null;
            }
            AnimatorSet animatorSet2 = this.S;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.S = null;
            }
            rh0 rh0Var = this.N;
            rh0Var.getAnimatedDrawable().P(71);
            rh0Var.getAnimatedDrawable().N(37, false, false);
            rh0Var.d();
            org.telegram.messenger.g0.g3(new fc0(this, 1));
        }
    }

    public final void o(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.f38890h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f38889g0 = z10;
        float alpha = this.f38885e.getAlpha();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
        this.f38890h0 = ofFloat;
        ofFloat.addUpdateListener(new gc0(this, 0));
        this.f38890h0.addListener(new org.telegram.ui.on(17, this, z10));
        this.f38890h0.setInterpolator(nr.h);
        this.f38890h0.setDuration(320L);
        this.f38890h0.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.Q1);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25188o0);
        if (this.f38888f0 == null && (getParent() instanceof View)) {
            this.f38888f0 = new hi.o3((View) getParent(), false, new z2(this, 10));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.Q = true;
        AnimatorSet animatorSet = this.R;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.S;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.T.cancel();
            this.T = null;
        }
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.Q1);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25188o0);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        View rootView = getRootView();
        int height = (rootView.getHeight() - org.telegram.messenger.g0.f24140m) - org.telegram.messenger.g0.q1(rootView);
        Rect rect = this.O;
        getWindowVisibleDisplayFrame(rect);
        this.H = height - (rect.bottom - rect.top);
        if (org.telegram.messenger.bz.f23219r == 1 && (org.telegram.messenger.g0.Q1() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            if (frameLayout.getTag() != null) {
                i13 = ((Integer) frameLayout.getTag()).intValue();
            } else {
                i13 = 0;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((i13 + layoutParams.height) - (this.H / 2)) - org.telegram.messenger.g0.f24140m;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z10, i7, i10, i11, i12);
        TextView textView = this.f38896x;
        int[] iArr = this.f38891i0;
        textView.getLocationInWindow(iArr);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        rh0 rh0Var = this.N;
        if (!Q1 && getContext().getResources().getConfiguration().orientation == 2) {
            int L = iArr[1] - org.telegram.messenger.g0.L(100.0f);
            this.M = L;
            rh0Var.setTranslationY(L);
            return;
        }
        int L2 = iArr[1] - org.telegram.messenger.g0.L(100.0f);
        this.M = L2;
        rh0Var.setTranslationY(L2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        float f10;
        float f11;
        float f12;
        int i14;
        int i15;
        int i16;
        int size = View.MeasureSpec.getSize(i7);
        int i17 = org.telegram.messenger.g0.f24146q.y;
        int L = org.telegram.messenger.g0.L(28.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        int L3 = org.telegram.messenger.g0.L(60.0f);
        if (!org.telegram.messenger.g0.Q1() && getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.G;
        if (view != null) {
            if (org.telegram.messenger.bz.f23219r == 1) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            view.setVisibility(i16);
        }
        rh0 rh0Var = this.N;
        bi.t2 t2Var = this.f38885e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            if (org.telegram.messenger.bz.f23219r == 0) {
                f11 = 2.0f;
                f12 = size / 2.0f;
            } else {
                f11 = 2.0f;
                f12 = size;
            }
            rh0Var.setTranslationX((f12 / f11) - org.telegram.messenger.g0.L(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            if (org.telegram.messenger.bz.f23219r == 0) {
                i14 = size / 2;
            } else {
                i14 = size;
            }
            layoutParams.width = i14;
            layoutParams.height = org.telegram.messenger.g0.L(180.0f);
            int z11 = org.telegram.messenger.n10.z(140.0f, i17, 2);
            if (org.telegram.messenger.bz.f23219r == 0) {
                i15 = org.telegram.messenger.g0.L(40.0f);
            } else {
                i15 = 0;
            }
            layoutParams.topMargin = z11 + i15;
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i17;
            int i18 = size / 2;
            layoutParams2.leftMargin = i18;
            layoutParams2.topMargin = org.telegram.messenger.g0.f24140m;
            layoutParams2.width = i18;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) t2Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.g0.L(82.0f);
            layoutParams3.width = (Math.max(0, 2) * L) + (L3 * 3);
            layoutParams3.gravity = 17;
            t2Var.setLayoutParams(layoutParams3);
            i13 = 0;
        } else {
            rh0Var.setTranslationX((size / 2.0f) - org.telegram.messenger.g0.L(29.0f));
            int i19 = org.telegram.messenger.g0.f24140m;
            if (org.telegram.messenger.g0.Q1()) {
                if (size > org.telegram.messenger.g0.L(498.0f)) {
                    i11 = org.telegram.messenger.n10.z(498.0f, size, 2);
                    size = org.telegram.messenger.g0.L(498.0f);
                } else {
                    i11 = 0;
                }
                if (i17 > org.telegram.messenger.g0.L(528.0f)) {
                    i19 = org.telegram.messenger.n10.z(528.0f, i17, 2);
                    i17 = org.telegram.messenger.g0.L(528.0f);
                }
            } else {
                i11 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            int i20 = i17 / 3;
            if (org.telegram.messenger.bz.f23219r == 0) {
                i12 = org.telegram.messenger.g0.L(40.0f);
            } else {
                i12 = 0;
            }
            layoutParams4.height = i20 + i12;
            layoutParams4.width = size;
            layoutParams4.topMargin = i19;
            layoutParams4.leftMargin = i11;
            frameLayout2.setTag(Integer.valueOf(i19));
            frameLayout2.setLayoutParams(layoutParams4);
            int i21 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) t2Var.getLayoutParams();
            i13 = 0;
            layoutParams5.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.g0.L(82.0f);
            layoutParams5.width = (Math.max(0, 2) * L) + (L3 * 3);
            if (org.telegram.messenger.g0.Q1()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            t2Var.setLayoutParams(layoutParams5);
            int i22 = i17 - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.leftMargin = i11;
            if (org.telegram.messenger.g0.Q1()) {
                layoutParams6.topMargin = (i17 - i22) / 2;
            } else {
                layoutParams6.topMargin = i21;
            }
            layoutParams6.width = size;
            layoutParams6.height = -1;
            frameLayout.setLayoutParams(layoutParams6);
        }
        if (z10) {
            f10 = 52.0f;
        } else {
            f10 = 82.0f;
        }
        int L4 = org.telegram.messenger.g0.L(f10);
        for (int i23 = i13; i23 < 12; i23++) {
            int i24 = 10;
            if (i23 != 0) {
                if (i23 == 10) {
                    i24 = 11;
                } else if (i23 == 11) {
                    i24 = 9;
                } else {
                    i24 = i23 - 1;
                }
            }
            FrameLayout frameLayout3 = (FrameLayout) this.f38887f.get(i23);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((L3 + L2) * (i24 / 3)) + L4;
            layoutParams7.leftMargin = (L3 + L) * (i24 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
        }
        super.onMeasure(i7, i10);
    }

    public void setDelegate(oc0 oc0Var) {
        this.P = oc0Var;
    }

    public void h(float f10) {
    }

    public void j() {
    }
}
