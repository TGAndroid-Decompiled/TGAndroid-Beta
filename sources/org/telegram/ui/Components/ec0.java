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
public class ec0 extends FrameLayout implements org.telegram.messenger.ls {
    public static final int[] f33243i0 = {2131296592, 2131296593, 2131296594, 2131296595, 2131296596, 2131296597, 2131296598, 2131296599, 2131296600, 2131296601, 2131296602, 2131296604};
    public final ImageView D;
    public final ImageView E;
    public final View F;
    public int G;
    public final ri.b H;
    public final dh.c I;
    public Bitmap J;
    public Canvas K;
    public int L;
    public final ch0 M;
    public final Rect N;
    public cc0 O;
    public boolean P;
    public AnimatorSet Q;
    public AnimatorSet R;
    public ValueAnimator S;
    public r1.g T;
    public final LinkedList U;
    public final LinkedList V;
    public final ArrayList W;
    public Drawable f33244a;
    public float f33245a0;
    public final FrameLayout f33246b;
    public int f33247b0;
    public final TextView f33248c;
    public final et f33249c0;
    public final FrameLayout d;
    public int f33250d0;
    public final di.a4 f33251e;
    public fi.q3 f33252e0;
    public final ArrayList f33253f;
    public boolean f33254f0;
    public ValueAnimator f33255g0;
    public final FrameLayout h;
    public final int[] f33256h0;
    public final bc0 f33257n;
    public final EditTextBoldCursor f33258r;
    public final fi.a8 f33259s;
    public final bi.x5 f33260w;
    public final TextView f33261x;
    public final TextView f33262y;

    public ec0(Context context) {
        super(context);
        int i7;
        String M0 = org.telegram.messenger.id.M0(2131743853, null);
        int i10 = 0;
        this.G = 0;
        ri.b bVar = new ri.b();
        this.H = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.I = cVar;
        xe.b bVar2 = new xe.b();
        this.N = new Rect();
        this.U = new LinkedList();
        this.V = new LinkedList();
        this.W = new ArrayList();
        this.f33247b0 = -12;
        this.f33249c0 = new et(this, 8);
        this.f33254f0 = true;
        this.f33256h0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        bi.x5 x5Var = new bi.x5(this, context);
        this.f33260w = x5Var;
        x5Var.setWillNotDraw(false);
        addView(x5Var, c8.ha.c(-1.0f, -1));
        cVar.h = new jh.k(x5Var);
        cVar.f8708i = x5Var;
        cVar.f8707g = bVar2;
        ?? imageView = new ImageView(context);
        this.M = imageView;
        imageView.f(2131624111, 58, 58, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, c8.ha.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        x5Var.addView(frameLayout, c8.ha.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f33261x = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setAlpha(0.0f);
        TextView i11 = org.telegram.ui.Cells.f1.i(frameLayout, textView, c8.ha.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.f33262y = i11;
        i11.setTextColor(-1);
        i11.setTextSize(1, 15.0f);
        i11.setGravity(1);
        i11.setVisibility(4);
        x5Var.addView(i11, c8.ha.e(-2, -2, 17));
        fi.a8 a8Var = new fi.a8(this, context);
        this.f33259s = a8Var;
        frameLayout.addView(a8Var, c8.ha.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f33258r = editTextBoldCursor;
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
        frameLayout.addView(editTextBoldCursor, c8.ha.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new t0(this, 4));
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 21));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new li.a1(1));
        ImageView imageView2 = new ImageView(context);
        this.D = imageView2;
        imageView2.setImageResource(2131232512);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(2131230881);
        frameLayout.addView(imageView2, c8.ha.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView2.setContentDescription(org.telegram.messenger.id.M0(2131751355, null));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ec0 f38976b;

            {
                this.f38976b = this;
            }

            @Override
            public final void onClick(View view) {
                ec0 ec0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                int i12;
                boolean z9;
                LinkedList linkedList3;
                int i13;
                int i14;
                ec0 ec0Var2;
                boolean z10;
                boolean z11;
                int i15 = r2;
                ec0 ec0Var3 = this.f38976b;
                switch (i15) {
                    case 0:
                        ec0Var3.n(false);
                        return;
                    case 1:
                        ec0Var3.c();
                        return;
                    default:
                        LinkedList linkedList4 = ec0Var3.V;
                        LinkedList linkedList5 = ec0Var3.U;
                        fi.a8 a8Var2 = ec0Var3.f33259s;
                        if (ec0Var3.f33254f0 && !ec0Var3.P) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("0");
                                    z9 = i12;
                                    break;
                                case 1:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("1");
                                    z9 = i12;
                                    break;
                                case 2:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("2");
                                    z9 = i12;
                                    break;
                                case 3:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("3");
                                    z9 = i12;
                                    break;
                                case 4:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("4");
                                    z9 = i12;
                                    break;
                                case 5:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("5");
                                    z9 = i12;
                                    break;
                                case 6:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("6");
                                    z9 = i12;
                                    break;
                                case 7:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("7");
                                    z9 = i12;
                                    break;
                                case 8:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("8");
                                    z9 = i12;
                                    break;
                                case 9:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("9");
                                    z9 = i12;
                                    break;
                                case 10:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    ec0Var.c();
                                    z9 = i12;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) a8Var2.f11613c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    i12 = false;
                                    ArrayList arrayList2 = (ArrayList) a8Var2.f11612b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) a8Var2.d;
                                    if (sb2.length() == 0) {
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z9 = i12;
                                        break;
                                    } else {
                                        try {
                                            a8Var2.performHapticFeedback(3);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int i16 = 1;
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i17 = length;
                                        while (i17 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i17);
                                            ec0 ec0Var4 = ec0Var3;
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i13 = i16;
                                                float[] fArr = new float[i13];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, fArr));
                                                float[] fArr2 = new float[i13];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, fArr2));
                                                float[] fArr3 = new float[i13];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, fArr3));
                                                float[] fArr4 = new float[i13];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property, fArr4));
                                                float[] fArr5 = new float[i13];
                                                fArr5[0] = a8Var2.c(i17);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i13 = i16;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i17);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i13];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr6));
                                                float[] fArr7 = new float[i13];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr7));
                                                float[] fArr8 = new float[i13];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr8));
                                                float[] fArr9 = new float[i13];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr9));
                                                i14 = i17;
                                                float[] fArr10 = new float[i13];
                                                fArr10[0] = a8Var2.c(i17);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i14 = i17;
                                            }
                                            i17 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            ec0Var3 = ec0Var4;
                                            i16 = 1;
                                        }
                                        ec0Var = ec0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), property5, a8Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), property5, a8Var2.c(i18)));
                                        }
                                        qe qeVar = (qe) a8Var2.f11615f;
                                        if (qeVar != null) {
                                            org.telegram.messenger.g0.r(qeVar);
                                            a8Var2.f11615f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) a8Var2.f11614e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        a8Var2.f11614e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) a8Var2.f11614e).playTogether(arrayList3);
                                        ((AnimatorSet) a8Var2.f11614e).addListener(new zb0(a8Var2, 1));
                                        ((AnimatorSet) a8Var2.f11614e).start();
                                        ec0.a((ec0) a8Var2.h);
                                        z9 = true;
                                        break;
                                    }
                                default:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    z9 = i12;
                                    break;
                            }
                            if (intValue == 11) {
                                ec0Var2 = ec0Var;
                            } else {
                                ec0Var2 = ec0Var;
                                Drawable drawable = ec0Var2.f33244a;
                                if (drawable instanceof qa0) {
                                    qa0 qa0Var = (qa0) drawable;
                                    qa0Var.D = null;
                                    qa0Var.y();
                                    float f10 = qa0Var.h;
                                    if (intValue == 10) {
                                        if (z9) {
                                            qa0Var.x();
                                            z11 = true;
                                        } else {
                                            z11 = i12;
                                        }
                                        z10 = i12;
                                    } else {
                                        z10 = true;
                                        qa0Var.w(true);
                                        z11 = true;
                                    }
                                    if (z11) {
                                        if (f10 >= 1.0f) {
                                            ec0Var2.b(qa0Var);
                                        } else {
                                            bi.u7 u7Var = new bi.u7(ec0Var2, z10, qa0Var, 22);
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(u7Var);
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z10));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i19 = i12; i19 < linkedList6.size(); i19++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i19);
                                                Boolean bool = (Boolean) linkedList7.get(i19);
                                                if (bool != null && bool.booleanValue() != z10) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i19));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i20 = i12;
                                            while (i20 < size) {
                                                Object obj = arrayList4.get(i20);
                                                i20++;
                                                linkedList6.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.oe(11));
                                            int size2 = arrayList5.size();
                                            int i21 = i12;
                                            while (i21 < size2) {
                                                Object obj2 = arrayList5.get(i21);
                                                i21++;
                                                linkedList7.remove(((Integer) obj2).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) a8Var2.d).length() == 4) {
                                ec0Var2.n(i12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.E = imageView3;
        imageView3.setImageResource(2131231189);
        imageView3.setScaleType(scaleType);
        imageView3.setBackgroundResource(2131230881);
        frameLayout.addView(imageView3, c8.ha.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView3.setContentDescription(org.telegram.messenger.id.M0(2131754881, null));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ec0 f38976b;

            {
                this.f38976b = this;
            }

            @Override
            public final void onClick(View view) {
                ec0 ec0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                int i12;
                boolean z9;
                LinkedList linkedList3;
                int i13;
                int i14;
                ec0 ec0Var2;
                boolean z10;
                boolean z11;
                int i15 = r2;
                ec0 ec0Var3 = this.f38976b;
                switch (i15) {
                    case 0:
                        ec0Var3.n(false);
                        return;
                    case 1:
                        ec0Var3.c();
                        return;
                    default:
                        LinkedList linkedList4 = ec0Var3.V;
                        LinkedList linkedList5 = ec0Var3.U;
                        fi.a8 a8Var2 = ec0Var3.f33259s;
                        if (ec0Var3.f33254f0 && !ec0Var3.P) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("0");
                                    z9 = i12;
                                    break;
                                case 1:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("1");
                                    z9 = i12;
                                    break;
                                case 2:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("2");
                                    z9 = i12;
                                    break;
                                case 3:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("3");
                                    z9 = i12;
                                    break;
                                case 4:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("4");
                                    z9 = i12;
                                    break;
                                case 5:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("5");
                                    z9 = i12;
                                    break;
                                case 6:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("6");
                                    z9 = i12;
                                    break;
                                case 7:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("7");
                                    z9 = i12;
                                    break;
                                case 8:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("8");
                                    z9 = i12;
                                    break;
                                case 9:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("9");
                                    z9 = i12;
                                    break;
                                case 10:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    ec0Var.c();
                                    z9 = i12;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) a8Var2.f11613c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    i12 = false;
                                    ArrayList arrayList2 = (ArrayList) a8Var2.f11612b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) a8Var2.d;
                                    if (sb2.length() == 0) {
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z9 = i12;
                                        break;
                                    } else {
                                        try {
                                            a8Var2.performHapticFeedback(3);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int i16 = 1;
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i17 = length;
                                        while (i17 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i17);
                                            ec0 ec0Var4 = ec0Var3;
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i13 = i16;
                                                float[] fArr = new float[i13];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, fArr));
                                                float[] fArr2 = new float[i13];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, fArr2));
                                                float[] fArr3 = new float[i13];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, fArr3));
                                                float[] fArr4 = new float[i13];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property, fArr4));
                                                float[] fArr5 = new float[i13];
                                                fArr5[0] = a8Var2.c(i17);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i13 = i16;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i17);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i13];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr6));
                                                float[] fArr7 = new float[i13];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr7));
                                                float[] fArr8 = new float[i13];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr8));
                                                float[] fArr9 = new float[i13];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr9));
                                                i14 = i17;
                                                float[] fArr10 = new float[i13];
                                                fArr10[0] = a8Var2.c(i17);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i14 = i17;
                                            }
                                            i17 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            ec0Var3 = ec0Var4;
                                            i16 = 1;
                                        }
                                        ec0Var = ec0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), property5, a8Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), property5, a8Var2.c(i18)));
                                        }
                                        qe qeVar = (qe) a8Var2.f11615f;
                                        if (qeVar != null) {
                                            org.telegram.messenger.g0.r(qeVar);
                                            a8Var2.f11615f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) a8Var2.f11614e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        a8Var2.f11614e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) a8Var2.f11614e).playTogether(arrayList3);
                                        ((AnimatorSet) a8Var2.f11614e).addListener(new zb0(a8Var2, 1));
                                        ((AnimatorSet) a8Var2.f11614e).start();
                                        ec0.a((ec0) a8Var2.h);
                                        z9 = true;
                                        break;
                                    }
                                default:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    z9 = i12;
                                    break;
                            }
                            if (intValue == 11) {
                                ec0Var2 = ec0Var;
                            } else {
                                ec0Var2 = ec0Var;
                                Drawable drawable = ec0Var2.f33244a;
                                if (drawable instanceof qa0) {
                                    qa0 qa0Var = (qa0) drawable;
                                    qa0Var.D = null;
                                    qa0Var.y();
                                    float f10 = qa0Var.h;
                                    if (intValue == 10) {
                                        if (z9) {
                                            qa0Var.x();
                                            z11 = true;
                                        } else {
                                            z11 = i12;
                                        }
                                        z10 = i12;
                                    } else {
                                        z10 = true;
                                        qa0Var.w(true);
                                        z11 = true;
                                    }
                                    if (z11) {
                                        if (f10 >= 1.0f) {
                                            ec0Var2.b(qa0Var);
                                        } else {
                                            bi.u7 u7Var = new bi.u7(ec0Var2, z10, qa0Var, 22);
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(u7Var);
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z10));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i19 = i12; i19 < linkedList6.size(); i19++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i19);
                                                Boolean bool = (Boolean) linkedList7.get(i19);
                                                if (bool != null && bool.booleanValue() != z10) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i19));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i20 = i12;
                                            while (i20 < size) {
                                                Object obj = arrayList4.get(i20);
                                                i20++;
                                                linkedList6.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.oe(11));
                                            int size2 = arrayList5.size();
                                            int i21 = i12;
                                            while (i21 < size2) {
                                                Object obj2 = arrayList5.get(i21);
                                                i21++;
                                                linkedList7.remove(((Integer) obj2).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) a8Var2.d).length() == 4) {
                                ec0Var2.n(i12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        View view = new View(context);
        this.F = view;
        view.setBackgroundColor(822083583);
        frameLayout.addView(view, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.f22562p, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        x5Var.addView(frameLayout2, c8.ha.e(-1, -1, 51));
        di.a4 a4Var = new di.a4(context, 16);
        this.f33251e = a4Var;
        a4Var.setClipChildren(false);
        frameLayout2.addView(a4Var, c8.ha.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f33246b = frameLayout3;
        a4Var.addView(frameLayout3, c8.ha.e(-2, -2, 49));
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 15.0f);
        g10.setTypeface(org.telegram.messenger.g0.o());
        g10.setTextColor(-1);
        g10.setText(M0);
        TextView i12 = org.telegram.ui.Cells.f1.i(frameLayout3, g10, c8.ha.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.f33248c = i12;
        i12.setTextSize(1, 14.0f);
        i12.setTextColor(-1);
        i12.setText((CharSequence) null);
        frameLayout3.addView(i12, c8.ha.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f33253f = new ArrayList(10);
        while (true) {
            if (i10 >= 12) {
                break;
            }
            bc0 bc0Var = new bc0(context);
            c8.ka.b(bc0Var, 0.15f, 1.5f);
            bc0Var.setTag(Integer.valueOf(i10));
            int[] iArr = f33243i0;
            if (i10 == 11) {
                bc0Var.setBackground(f(bc0Var));
                int L = org.telegram.messenger.g0.L(30.0f);
                bc0Var.setForeground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, 654311423, 654311423));
                bc0Var.setImage(2131231101);
                bc0Var.setOnLongClickListener(new e00(this, 1));
                bc0Var.setContentDescription(org.telegram.messenger.id.M0(2131754920, null));
                bc0Var.setNextFocusForwardId(2131296592);
                bc0Var.setAccessibilityTraversalBefore(2131296592);
            } else if (i10 == 10) {
                this.f33257n = bc0Var;
                bc0Var.setBackground(f(bc0Var));
                int L2 = org.telegram.messenger.g0.L(30.0f);
                bc0Var.setForeground(org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, 654311423, 654311423));
                bc0Var.setContentDescription(org.telegram.messenger.id.M0(2131754881, null));
                bc0Var.setImage(2131231189);
                bc0Var.setNextFocusForwardId(2131296593);
                bc0Var.setAccessibilityTraversalBefore(2131296593);
            } else {
                bc0Var.setBackground(f(bc0Var));
                int L3 = org.telegram.messenger.g0.L(30.0f);
                bc0Var.setForeground(org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, 654311423, 654311423));
                bc0Var.setContentDescription(i10 + "");
                bc0Var.setNum(i10);
                if (i10 == 0) {
                    bc0Var.setNextFocusForwardId(2131296602);
                    bc0Var.setAccessibilityTraversalBefore(2131296602);
                } else if (i10 == 9) {
                    if (g()) {
                        bc0Var.setNextFocusForwardId(2131296604);
                        bc0Var.setAccessibilityTraversalBefore(2131296604);
                    } else {
                        bc0Var.setNextFocusForwardId(2131296592);
                        bc0Var.setAccessibilityTraversalBefore(2131296592);
                    }
                } else {
                    int i13 = iArr[i10 + 1];
                    bc0Var.setNextFocusForwardId(i13);
                    bc0Var.setAccessibilityTraversalBefore(i13);
                }
            }
            bc0Var.setId(iArr[i10]);
            bc0Var.setOnClickListener(new View.OnClickListener(this) {
                public final ec0 f38976b;

                {
                    this.f38976b = this;
                }

                @Override
                public final void onClick(View view2) {
                    ec0 ec0Var;
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    int i122;
                    boolean z9;
                    LinkedList linkedList3;
                    int i132;
                    int i14;
                    ec0 ec0Var2;
                    boolean z10;
                    boolean z11;
                    int i15 = r2;
                    ec0 ec0Var3 = this.f38976b;
                    switch (i15) {
                        case 0:
                            ec0Var3.n(false);
                            return;
                        case 1:
                            ec0Var3.c();
                            return;
                        default:
                            LinkedList linkedList4 = ec0Var3.V;
                            LinkedList linkedList5 = ec0Var3.U;
                            fi.a8 a8Var2 = ec0Var3.f33259s;
                            if (ec0Var3.f33254f0 && !ec0Var3.P) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("0");
                                        z9 = i122;
                                        break;
                                    case 1:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("1");
                                        z9 = i122;
                                        break;
                                    case 2:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("2");
                                        z9 = i122;
                                        break;
                                    case 3:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("3");
                                        z9 = i122;
                                        break;
                                    case 4:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("4");
                                        z9 = i122;
                                        break;
                                    case 5:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("5");
                                        z9 = i122;
                                        break;
                                    case 6:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("6");
                                        z9 = i122;
                                        break;
                                    case 7:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("7");
                                        z9 = i122;
                                        break;
                                    case 8:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("8");
                                        z9 = i122;
                                        break;
                                    case 9:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("9");
                                        z9 = i122;
                                        break;
                                    case 10:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        ec0Var.c();
                                        z9 = i122;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) a8Var2.f11613c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        i122 = false;
                                        ArrayList arrayList2 = (ArrayList) a8Var2.f11612b;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb2 = (StringBuilder) a8Var2.d;
                                        if (sb2.length() == 0) {
                                            ec0Var = ec0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z9 = i122;
                                            break;
                                        } else {
                                            try {
                                                a8Var2.performHapticFeedback(3);
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, true);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int i16 = 1;
                                            int length = sb2.length() - 1;
                                            if (length != 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            linkedList = linkedList4;
                                            int i17 = length;
                                            while (i17 < 4) {
                                                TextView textView2 = (TextView) arrayList2.get(i17);
                                                ec0 ec0Var4 = ec0Var3;
                                                if (textView2.getAlpha() != 0.0f) {
                                                    linkedList3 = linkedList5;
                                                    i132 = i16;
                                                    float[] fArr = new float[i132];
                                                    fArr[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, fArr));
                                                    float[] fArr2 = new float[i132];
                                                    fArr2[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, fArr2));
                                                    float[] fArr3 = new float[i132];
                                                    fArr3[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, fArr3));
                                                    float[] fArr4 = new float[i132];
                                                    fArr4[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property, fArr4));
                                                    float[] fArr5 = new float[i132];
                                                    fArr5[0] = a8Var2.c(i17);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, fArr5));
                                                } else {
                                                    linkedList3 = linkedList5;
                                                    i132 = i16;
                                                }
                                                TextView textView3 = (TextView) arrayList.get(i17);
                                                if (textView3.getAlpha() != 0.0f) {
                                                    float[] fArr6 = new float[i132];
                                                    fArr6[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr6));
                                                    float[] fArr7 = new float[i132];
                                                    fArr7[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr7));
                                                    float[] fArr8 = new float[i132];
                                                    fArr8[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr8));
                                                    float[] fArr9 = new float[i132];
                                                    fArr9[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr9));
                                                    i14 = i17;
                                                    float[] fArr10 = new float[i132];
                                                    fArr10[0] = a8Var2.c(i17);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                                } else {
                                                    i14 = i17;
                                                }
                                                i17 = i14 + 1;
                                                linkedList5 = linkedList3;
                                                ec0Var3 = ec0Var4;
                                                i16 = 1;
                                            }
                                            ec0Var = ec0Var3;
                                            linkedList2 = linkedList5;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i18 = 0; i18 < length; i18++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), property5, a8Var2.c(i18)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), property5, a8Var2.c(i18)));
                                            }
                                            qe qeVar = (qe) a8Var2.f11615f;
                                            if (qeVar != null) {
                                                org.telegram.messenger.g0.r(qeVar);
                                                a8Var2.f11615f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) a8Var2.f11614e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            a8Var2.f11614e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) a8Var2.f11614e).playTogether(arrayList3);
                                            ((AnimatorSet) a8Var2.f11614e).addListener(new zb0(a8Var2, 1));
                                            ((AnimatorSet) a8Var2.f11614e).start();
                                            ec0.a((ec0) a8Var2.h);
                                            z9 = true;
                                            break;
                                        }
                                    default:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        z9 = i122;
                                        break;
                                }
                                if (intValue == 11) {
                                    ec0Var2 = ec0Var;
                                } else {
                                    ec0Var2 = ec0Var;
                                    Drawable drawable = ec0Var2.f33244a;
                                    if (drawable instanceof qa0) {
                                        qa0 qa0Var = (qa0) drawable;
                                        qa0Var.D = null;
                                        qa0Var.y();
                                        float f10 = qa0Var.h;
                                        if (intValue == 10) {
                                            if (z9) {
                                                qa0Var.x();
                                                z11 = true;
                                            } else {
                                                z11 = i122;
                                            }
                                            z10 = i122;
                                        } else {
                                            z10 = true;
                                            qa0Var.w(true);
                                            z11 = true;
                                        }
                                        if (z11) {
                                            if (f10 >= 1.0f) {
                                                ec0Var2.b(qa0Var);
                                            } else {
                                                bi.u7 u7Var = new bi.u7(ec0Var2, z10, qa0Var, 22);
                                                LinkedList linkedList6 = linkedList2;
                                                linkedList6.offer(u7Var);
                                                LinkedList linkedList7 = linkedList;
                                                linkedList7.offer(Boolean.valueOf(z10));
                                                ArrayList arrayList4 = new ArrayList();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (int i19 = i122; i19 < linkedList6.size(); i19++) {
                                                    Runnable runnable = (Runnable) linkedList6.get(i19);
                                                    Boolean bool = (Boolean) linkedList7.get(i19);
                                                    if (bool != null && bool.booleanValue() != z10) {
                                                        arrayList4.add(runnable);
                                                        arrayList5.add(Integer.valueOf(i19));
                                                    }
                                                }
                                                int size = arrayList4.size();
                                                int i20 = i122;
                                                while (i20 < size) {
                                                    Object obj = arrayList4.get(i20);
                                                    i20++;
                                                    linkedList6.remove((Runnable) obj);
                                                }
                                                Collections.sort(arrayList5, new org.telegram.ui.oe(11));
                                                int size2 = arrayList5.size();
                                                int i21 = i122;
                                                while (i21 < size2) {
                                                    Object obj2 = arrayList5.get(i21);
                                                    i21++;
                                                    linkedList7.remove(((Integer) obj2).intValue());
                                                }
                                            }
                                        }
                                    }
                                }
                                if (((StringBuilder) a8Var2.d).length() == 4) {
                                    ec0Var2.n(i122);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
            this.f33253f.add(bc0Var);
            i10++;
        }
        for (i7 = 11; i7 >= 0; i7--) {
            this.f33251e.addView((FrameLayout) this.f33253f.get(i7), c8.ha.e(60, 60, 51));
        }
        d();
    }

    public static void a(ec0 ec0Var) {
        boolean z9;
        float f10;
        float f11;
        FrameLayout frameLayout = ec0Var.f33246b;
        fi.a8 a8Var = ec0Var.f33259s;
        if (a8Var != null && ((StringBuilder) a8Var.d).length() <= 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            ViewPropertyAnimator animate = frameLayout.animate();
            float f12 = 1.0f;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z9) {
                f11 = 0.8f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z9) {
                f12 = 0.8f;
            }
            org.telegram.messenger.camera.q.l(scaleX.scaleY(f12), xq.h, 320L);
        }
    }

    public final void b(qa0 qa0Var) {
        r1.g gVar = this.T;
        if (gVar != null && gVar.f54261f) {
            gVar.d();
        }
        r1.f fVar = new r1.f(0.0f);
        qa0Var.D = new bx(fVar, 9);
        qa0Var.y();
        r1.g gVar2 = new r1.g(fVar);
        gVar2.f54267m = org.telegram.ui.Cells.f1.o(100.0f, 300.0f, 1.0f);
        this.T = gVar2;
        gVar2.a(new hi.y3(4, this, qa0Var));
        this.T.b(new e7(qa0Var, 5));
        this.T.h();
    }

    public final void c() {
        Activity W;
        gc0 gc0Var;
        if (!this.P && (W = org.telegram.messenger.g0.W(getContext())) != null && this.f33257n.getVisibility() == 0 && !org.telegram.messenger.t0.f25574x) {
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                ArrayList arrayList = launchActivity.f41301z0;
                if (arrayList.isEmpty() && (gc0Var = launchActivity.f41299y0) != null) {
                    if (this != gc0Var.f33928b) {
                        return;
                    }
                } else if (jg.g.i(1, arrayList) != this) {
                    return;
                }
            }
            try {
                if (new android.support.v4.media.session.a0(new androidx.biometric.t(getContext(), 0)).d(15) == 0 && org.telegram.messenger.as.h() && !org.telegram.messenger.as.a()) {
                    cb.c cVar = new cb.c(LaunchActivity.G1, f0.d.e(getContext()), new hi.n(this, 1));
                    m6.n nVar = new m6.n(1);
                    nVar.f19921b = org.telegram.messenger.id.M0(2131743853, null);
                    nVar.d = org.telegram.messenger.id.M0(2131743795, null);
                    nVar.f19920a = 15;
                    cVar.l(nVar.b(), null);
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
        bc0 bc0Var = this.f33257n;
        bc0Var.setVisibility(i7);
        if (org.telegram.messenger.iz.f23431r == 1) {
            this.E.setVisibility(bc0Var.getVisibility());
        }
        if (org.telegram.messenger.iz.f23431r == 1) {
            i10 = 2131751117;
        } else if (g10) {
            i10 = 2131751118;
        } else {
            i10 = 2131751119;
        }
        this.f33248c.setText(org.telegram.messenger.id.M0(i10, null));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.Q1) {
            d();
            if (((Boolean) objArr[0]).booleanValue() && org.telegram.messenger.iz.f23448x) {
                c();
            }
        } else if (i7 == org.telegram.messenger.qs.f25046o0 && objArr[0] != this) {
            setVisibility(8);
            j();
        }
    }

    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > org.telegram.messenger.iz.f23440u) {
            long j3 = org.telegram.messenger.iz.f23437t - (elapsedRealtime - org.telegram.messenger.iz.f23440u);
            org.telegram.messenger.iz.f23437t = j3;
            if (j3 < 0) {
                org.telegram.messenger.iz.f23437t = 0L;
            }
        }
        org.telegram.messenger.iz.f23440u = elapsedRealtime;
        org.telegram.messenger.iz.y();
        long j10 = org.telegram.messenger.iz.f23437t;
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        EditTextBoldCursor editTextBoldCursor = this.f33258r;
        FrameLayout frameLayout = this.h;
        et etVar = this.f33249c0;
        TextView textView = this.f33262y;
        if (i7 > 0) {
            int max = Math.max(1, (int) Math.ceil(j10 / 1000.0d));
            if (max != this.f33250d0) {
                textView.setText(org.telegram.messenger.id.a0(null, null, 2131744039, org.telegram.messenger.id.G(max, "Seconds", new Object[0])));
                this.f33250d0 = max;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                frameLayout.setVisibility(4);
                o(false);
                org.telegram.messenger.g0.v1(editTextBoldCursor);
            }
            org.telegram.messenger.g0.r(etVar);
            org.telegram.messenger.g0.i3(etVar, 100L);
            return;
        }
        org.telegram.messenger.g0.r(etVar);
        if (textView.getVisibility() == 0) {
            textView.setVisibility(4);
            frameLayout.setVisibility(0);
            o(true);
            if (org.telegram.messenger.iz.f23431r == 1) {
                org.telegram.messenger.g0.K3(editTextBoldCursor);
            }
        }
    }

    public final dc0 f(bc0 bc0Var) {
        gh.e eVar = new gh.e(null);
        eVar.f13971e = new k2(27);
        if (Build.VERSION.SDK_INT < 29) {
            eVar.f(1308622847, 1308622847);
            eVar.e(452984831, 452984831);
            float N = org.telegram.messenger.g0.N(1.0f);
            float N2 = org.telegram.messenger.g0.N(0.6666667f);
            eVar.f13972f = N;
            eVar.h = N2;
        }
        fh.g c10 = this.I.c(bc0Var, eVar, true);
        c10.r(org.telegram.messenger.g0.L(30.0f));
        return new dc0(c10);
    }

    public final boolean g() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ec0.g():boolean");
    }

    public final boolean i() {
        fi.q3 q3Var = this.f33252e0;
        if (q3Var != null && q3Var.c()) {
            org.telegram.messenger.g0.v1(this.f33258r);
            return false;
        }
        return true;
    }

    public final void k() {
        org.telegram.messenger.g0.r(this.f33249c0);
    }

    public final void l() {
        if (!this.P) {
            e();
            if (this.f33262y.getVisibility() != 0) {
                if (org.telegram.messenger.iz.f23431r == 1) {
                    EditTextBoldCursor editTextBoldCursor = this.f33258r;
                    if (editTextBoldCursor != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(editTextBoldCursor);
                    }
                    org.telegram.messenger.g0.i3(new tb0(this, 0), 200L);
                }
                c();
            }
        }
    }

    public final void m(boolean z9, int i7, int i10, org.telegram.ui.q10 q10Var) {
        View currentFocus;
        boolean z10;
        k9 k9Var;
        int i11;
        int i12;
        if (getVisibility() != 0) {
            this.P = false;
        }
        d();
        e();
        Activity W = org.telegram.messenger.g0.W(getContext());
        int i13 = org.telegram.messenger.iz.f23431r;
        TextView textView = this.f33262y;
        EditTextBoldCursor editTextBoldCursor = this.f33258r;
        if (i13 == 1) {
            if (!z9 && textView.getVisibility() != 0 && editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
            }
        } else if (W != null && (currentFocus = W.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            org.telegram.messenger.g0.v1(W.getCurrentFocus());
        }
        if (getVisibility() == 0) {
            return;
        }
        setTranslationY(0.0f);
        this.f33244a = null;
        boolean z11 = org.telegram.ui.ActionBar.k6.s0() instanceof qa0;
        bi.x5 x5Var = this.f33260w;
        if (z11) {
            z10 = !org.telegram.ui.ActionBar.k6.I.q();
            this.f33244a = org.telegram.ui.ActionBar.k6.s0();
            x5Var.setBackgroundColor(-1090519040);
        } else {
            if (org.telegram.ui.ActionBar.k6.W && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.k6.K0()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.k6.K0())) {
                org.telegram.ui.ActionBar.c6 c6Var = org.telegram.ui.ActionBar.k6.I.f27642i0;
                if (c6Var != null && (i11 = c6Var.d) != 0 && (i12 = c6Var.f27405e) != 0) {
                    k9Var = new k9(k9.d(c6Var.h), new int[]{i11, i12});
                } else {
                    k9Var = null;
                }
                this.f33244a = k9Var;
                if (k9Var == null) {
                    this.f33244a = org.telegram.ui.ActionBar.k6.s0();
                }
                if (this.f33244a instanceof k9) {
                    x5Var.setBackgroundColor(570425344);
                } else {
                    x5Var.setBackgroundColor(-1090519040);
                }
            } else {
                if (!"d".equals(org.telegram.ui.ActionBar.k6.K0())) {
                    String K0 = org.telegram.ui.ActionBar.k6.K0();
                    if (!org.telegram.ui.ActionBar.k6.f27956j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(K0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(K0)) {
                        Drawable s02 = org.telegram.ui.ActionBar.k6.s0();
                        this.f33244a = s02;
                        if (s02 instanceof k9) {
                            x5Var.setBackgroundColor(570425344);
                        } else if (s02 != null) {
                            x5Var.setBackgroundColor(-1090519040);
                        } else {
                            x5Var.setBackgroundColor(-11436898);
                        }
                    }
                }
                x5Var.setBackgroundColor(-11436898);
            }
            z10 = false;
        }
        Drawable drawable = this.f33244a;
        if (drawable instanceof qa0) {
            qa0 qa0Var = (qa0) drawable;
            int[] iArr = qa0Var.f37248a;
            if (z10) {
                int[] iArr2 = new int[iArr.length];
                for (int i14 = 0; i14 < iArr.length; i14++) {
                    iArr2[i14] = org.telegram.ui.ActionBar.k6.b(0.14f, 0.0f, iArr[i14]);
                }
                iArr = iArr2;
            }
            this.f33244a = new qa0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (qa0Var.f37270u != null && qa0Var.f37266q < 0) {
                x5Var.setBackgroundColor(2130706432);
            } else {
                x5Var.setBackgroundColor(570425344);
            }
            ((qa0) this.f33244a).q(x5Var);
        }
        this.f33261x.setText(org.telegram.messenger.id.M0(2131754232, null));
        int i15 = org.telegram.messenger.iz.f23431r;
        ImageView imageView = this.E;
        ImageView imageView2 = this.D;
        di.a4 a4Var = this.f33251e;
        fi.a8 a8Var = this.f33259s;
        if (i15 == 0) {
            if (textView.getVisibility() != 0) {
                a4Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            a8Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i15 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            a4Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            a8Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.f33257n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        fi.a8.a(a8Var, false);
        if (z9) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new yb0(this, i7, i10, q10Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.f33245a0 = 1.0f;
            h(1.0f);
            ch0 ch0Var = this.M;
            ch0Var.setScaleX(1.0f);
            ch0Var.setScaleY(1.0f);
            ch0Var.i();
            ch0Var.getAnimatedDrawable().N(38, false, false);
            if (q10Var != null) {
                q10Var.run();
            }
        }
        setOnTouchListener(new ei.b(19));
    }

    public final void n(boolean z9) {
        String str;
        if (!this.P && getVisibility() == 0) {
            EditTextBoldCursor editTextBoldCursor = this.f33258r;
            if (!z9) {
                if (org.telegram.messenger.iz.f23437t <= 0) {
                    int i7 = org.telegram.messenger.iz.f23431r;
                    fi.a8 a8Var = this.f33259s;
                    if (i7 == 0) {
                        str = ((StringBuilder) a8Var.d).toString();
                    } else if (i7 != 1) {
                        str = "";
                    } else {
                        str = editTextBoldCursor.getText().toString();
                    }
                    int length = str.length();
                    FrameLayout frameLayout = this.f33246b;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.NOTIFICATION_ERROR;
                    if (length == 0) {
                        p2Var.a();
                        int i10 = -this.f33247b0;
                        this.f33247b0 = i10;
                        org.telegram.messenger.g0.G3(i10, frameLayout, null);
                        return;
                    } else if (!org.telegram.messenger.iz.g(str)) {
                        org.telegram.messenger.iz.r();
                        if (org.telegram.messenger.iz.f23437t > 0) {
                            e();
                        }
                        editTextBoldCursor.setText("");
                        fi.a8.a(a8Var, true);
                        p2Var.a();
                        int i11 = -this.f33247b0;
                        this.f33247b0 = i11;
                        org.telegram.messenger.g0.G3(i11, frameLayout, null);
                        Drawable drawable = this.f33244a;
                        if (drawable instanceof qa0) {
                            qa0 qa0Var = (qa0) drawable;
                            LinkedList linkedList = this.U;
                            linkedList.clear();
                            LinkedList linkedList2 = this.V;
                            linkedList2.clear();
                            r1.g gVar = this.T;
                            if (gVar != null && gVar.f54261f) {
                                linkedList.offer(new pa0(qa0Var, 1));
                                linkedList2.offer(Boolean.FALSE);
                                return;
                            }
                            qa0Var.m(true);
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            this.P = true;
            k();
            org.telegram.messenger.iz.v = 0;
            editTextBoldCursor.clearFocus();
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            if (org.telegram.messenger.as.h() && org.telegram.messenger.as.a()) {
                try {
                    org.telegram.messenger.as.e().deleteEntry("tmessages_passcode");
                } catch (KeyStoreException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.messenger.as.f21513g = null;
                org.telegram.messenger.as.b(false);
            }
            org.telegram.messenger.iz.f23448x = false;
            org.telegram.messenger.iz.y();
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25041n0, new Object[0]);
            setOnTouchListener(null);
            cc0 cc0Var = this.O;
            if (cc0Var != null) {
                cc0Var.p(this);
            }
            AnimatorSet animatorSet = this.Q;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.Q = null;
            }
            AnimatorSet animatorSet2 = this.R;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.R = null;
            }
            ch0 ch0Var = this.M;
            ch0Var.getAnimatedDrawable().P(71);
            ch0Var.getAnimatedDrawable().N(37, false, false);
            ch0Var.d();
            org.telegram.messenger.g0.h3(new tb0(this, 1));
        }
    }

    public final void o(boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.f33255g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f33254f0 = z9;
        float alpha = this.f33251e.getAlpha();
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
        this.f33255g0 = ofFloat;
        ofFloat.addUpdateListener(new ub0(this, 0));
        this.f33255g0.addListener(new t9(16, this, z9));
        this.f33255g0.setInterpolator(xq.h);
        this.f33255g0.setDuration(320L);
        this.f33255g0.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.Q1);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25046o0);
        if (this.f33252e0 == null && (getParent() instanceof View)) {
            this.f33252e0 = new fi.q3((View) getParent(), false, new s2(this, 8));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.P = true;
        AnimatorSet animatorSet = this.Q;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.R;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.S.cancel();
            this.S = null;
        }
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.Q1);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25046o0);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        View rootView = getRootView();
        int height = (rootView.getHeight() - org.telegram.messenger.g0.f22557m) - org.telegram.messenger.g0.q1(rootView);
        Rect rect = this.N;
        getWindowVisibleDisplayFrame(rect);
        this.G = height - (rect.bottom - rect.top);
        if (org.telegram.messenger.iz.f23431r == 1 && (org.telegram.messenger.g0.Q1() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            if (frameLayout.getTag() != null) {
                i13 = ((Integer) frameLayout.getTag()).intValue();
            } else {
                i13 = 0;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((i13 + layoutParams.height) - (this.G / 2)) - org.telegram.messenger.g0.f22557m;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z9, i7, i10, i11, i12);
        TextView textView = this.f33261x;
        int[] iArr = this.f33256h0;
        textView.getLocationInWindow(iArr);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        ch0 ch0Var = this.M;
        if (!Q1 && getContext().getResources().getConfiguration().orientation == 2) {
            int L = iArr[1] - org.telegram.messenger.g0.L(100.0f);
            this.L = L;
            ch0Var.setTranslationY(L);
            return;
        }
        int L2 = iArr[1] - org.telegram.messenger.g0.L(100.0f);
        this.L = L2;
        ch0Var.setTranslationY(L2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
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
        int i17 = org.telegram.messenger.g0.f22563q.y;
        int L = org.telegram.messenger.g0.L(28.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        int L3 = org.telegram.messenger.g0.L(60.0f);
        if (!org.telegram.messenger.g0.Q1() && getContext().getResources().getConfiguration().orientation == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        View view = this.F;
        if (view != null) {
            if (org.telegram.messenger.iz.f23431r == 1) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            view.setVisibility(i16);
        }
        ch0 ch0Var = this.M;
        di.a4 a4Var = this.f33251e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        if (z9) {
            if (org.telegram.messenger.iz.f23431r == 0) {
                f11 = 2.0f;
                f12 = size / 2.0f;
            } else {
                f11 = 2.0f;
                f12 = size;
            }
            ch0Var.setTranslationX((f12 / f11) - org.telegram.messenger.g0.L(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            if (org.telegram.messenger.iz.f23431r == 0) {
                i14 = size / 2;
            } else {
                i14 = size;
            }
            layoutParams.width = i14;
            layoutParams.height = org.telegram.messenger.g0.L(180.0f);
            int y10 = org.telegram.messenger.camera.q.y(140.0f, i17, 2);
            if (org.telegram.messenger.iz.f23431r == 0) {
                i15 = org.telegram.messenger.g0.L(40.0f);
            } else {
                i15 = 0;
            }
            layoutParams.topMargin = y10 + i15;
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i17;
            int i18 = size / 2;
            layoutParams2.leftMargin = i18;
            layoutParams2.topMargin = org.telegram.messenger.g0.f22557m;
            layoutParams2.width = i18;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) a4Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.g0.L(82.0f);
            layoutParams3.width = (Math.max(0, 2) * L) + (L3 * 3);
            layoutParams3.gravity = 17;
            a4Var.setLayoutParams(layoutParams3);
            i13 = 0;
        } else {
            ch0Var.setTranslationX((size / 2.0f) - org.telegram.messenger.g0.L(29.0f));
            int i19 = org.telegram.messenger.g0.f22557m;
            if (org.telegram.messenger.g0.Q1()) {
                if (size > org.telegram.messenger.g0.L(498.0f)) {
                    i11 = org.telegram.messenger.camera.q.y(498.0f, size, 2);
                    size = org.telegram.messenger.g0.L(498.0f);
                } else {
                    i11 = 0;
                }
                if (i17 > org.telegram.messenger.g0.L(528.0f)) {
                    i19 = org.telegram.messenger.camera.q.y(528.0f, i17, 2);
                    i17 = org.telegram.messenger.g0.L(528.0f);
                }
            } else {
                i11 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            int i20 = i17 / 3;
            if (org.telegram.messenger.iz.f23431r == 0) {
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
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) a4Var.getLayoutParams();
            i13 = 0;
            layoutParams5.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.g0.L(82.0f);
            layoutParams5.width = (Math.max(0, 2) * L) + (L3 * 3);
            if (org.telegram.messenger.g0.Q1()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            a4Var.setLayoutParams(layoutParams5);
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
        if (z9) {
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
            FrameLayout frameLayout3 = (FrameLayout) this.f33253f.get(i23);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((L3 + L2) * (i24 / 3)) + L4;
            layoutParams7.leftMargin = (L3 + L) * (i24 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
        }
        super.onMeasure(i7, i10);
    }

    public void setDelegate(cc0 cc0Var) {
        this.O = cc0Var;
    }

    public void h(float f10) {
    }

    public void j() {
    }
}
