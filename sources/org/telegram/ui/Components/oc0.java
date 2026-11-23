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
public class oc0 extends FrameLayout implements org.telegram.messenger.fs {
    public static final int[] f38106j0 = {2131296594, 2131296595, 2131296596, 2131296597, 2131296598, 2131296599, 2131296600, 2131296601, 2131296602, 2131296603, 2131296604, 2131296606};
    public final ImageView E;
    public final ImageView F;
    public final View G;
    public int H;
    public final ui.b I;
    public final dh.c J;
    public Bitmap K;
    public Canvas L;
    public int M;
    public final qh0 N;
    public final Rect O;
    public mc0 P;
    public boolean Q;
    public AnimatorSet R;
    public AnimatorSet S;
    public ValueAnimator T;
    public r1.g U;
    public final LinkedList V;
    public final LinkedList W;
    public Drawable f38107a;
    public final ArrayList f38108a0;
    public final FrameLayout f38109b;
    public float f38110b0;
    public final TextView f38111c;
    public int f38112c0;
    public final FrameLayout d;
    public final rc f38113d0;
    public final bi.v2 f38114e;
    public int f38115e0;
    public final ArrayList f38116f;
    public hi.x3 f38117f0;
    public boolean f38118g0;
    public final FrameLayout h;
    public ValueAnimator f38119h0;
    public final int[] f38120i0;
    public final lc0 f38121n;
    public final EditTextBoldCursor f38122r;
    public final hi.s8 f38123s;
    public final ai.h0 f38124w;
    public final TextView f38125x;
    public final TextView f38126y;

    public oc0(Context context) {
        super(context);
        int i7;
        String N0 = org.telegram.messenger.gd.N0(2131743603, null);
        int i10 = 0;
        this.H = 0;
        ui.b bVar = new ui.b();
        this.I = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.J = cVar;
        xe.b bVar2 = new xe.b();
        this.O = new Rect();
        this.V = new LinkedList();
        this.W = new LinkedList();
        this.f38108a0 = new ArrayList();
        this.f38112c0 = -12;
        this.f38113d0 = new rc(this, 13);
        this.f38118g0 = true;
        this.f38120i0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        ai.h0 h0Var = new ai.h0(this, context);
        this.f38124w = h0Var;
        h0Var.setWillNotDraw(false);
        addView(h0Var, c8.na.c(-1.0f, -1));
        cVar.h = new jh.k(h0Var);
        cVar.f8371i = h0Var;
        cVar.f8370g = bVar2;
        ?? imageView = new ImageView(context);
        this.N = imageView;
        imageView.f(2131624112, 58, 58, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, c8.na.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        h0Var.addView(frameLayout, c8.na.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f38125x = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setAlpha(0.0f);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, c8.na.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.f38126y = m10;
        m10.setTextColor(-1);
        m10.setTextSize(1, 15.0f);
        m10.setGravity(1);
        m10.setVisibility(4);
        h0Var.addView(m10, c8.na.e(-2, -2, 17));
        hi.s8 s8Var = new hi.s8(this, context);
        this.f38123s = s8Var;
        frameLayout.addView(s8Var, c8.na.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f38122r = editTextBoldCursor;
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
        frameLayout.addView(editTextBoldCursor, c8.na.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new g(this, 5));
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 24));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new oi.z0(1));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setImageResource(2131232517);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(2131230881);
        frameLayout.addView(imageView2, c8.na.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView2.setContentDescription(org.telegram.messenger.gd.N0(2131751342, null));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final oc0 f35104b;

            {
                this.f35104b = this;
            }

            @Override
            public final void onClick(View view) {
                oc0 oc0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                int i11;
                boolean z10;
                LinkedList linkedList3;
                int i12;
                int i13;
                oc0 oc0Var2;
                boolean z11;
                boolean z12;
                int i14 = r2;
                oc0 oc0Var3 = this.f35104b;
                switch (i14) {
                    case 0:
                        oc0Var3.n(false);
                        return;
                    case 1:
                        oc0Var3.c();
                        return;
                    default:
                        LinkedList linkedList4 = oc0Var3.W;
                        LinkedList linkedList5 = oc0Var3.V;
                        hi.s8 s8Var2 = oc0Var3.f38123s;
                        if (oc0Var3.f38118g0 && !oc0Var3.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("0");
                                    z10 = i11;
                                    break;
                                case 1:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("1");
                                    z10 = i11;
                                    break;
                                case 2:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("2");
                                    z10 = i11;
                                    break;
                                case 3:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("3");
                                    z10 = i11;
                                    break;
                                case 4:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("4");
                                    z10 = i11;
                                    break;
                                case 5:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("5");
                                    z10 = i11;
                                    break;
                                case 6:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("6");
                                    z10 = i11;
                                    break;
                                case 7:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("7");
                                    z10 = i11;
                                    break;
                                case 8:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("8");
                                    z10 = i11;
                                    break;
                                case 9:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("9");
                                    z10 = i11;
                                    break;
                                case 10:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    oc0Var.c();
                                    z10 = i11;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) s8Var2.f15402c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    i11 = false;
                                    ArrayList arrayList2 = (ArrayList) s8Var2.f15401b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) s8Var2.d;
                                    if (sb2.length() == 0) {
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = i11;
                                        break;
                                    } else {
                                        try {
                                            s8Var2.performHapticFeedback(3);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int i15 = 1;
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i16 = length;
                                        while (i16 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i16);
                                            oc0 oc0Var4 = oc0Var3;
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i12 = i15;
                                                float[] fArr = new float[i12];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, fArr));
                                                float[] fArr2 = new float[i12];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, fArr2));
                                                float[] fArr3 = new float[i12];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, fArr3));
                                                float[] fArr4 = new float[i12];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property, fArr4));
                                                float[] fArr5 = new float[i12];
                                                fArr5[0] = s8Var2.c(i16);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i12 = i15;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i16);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i12];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr6));
                                                float[] fArr7 = new float[i12];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr7));
                                                float[] fArr8 = new float[i12];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr8));
                                                float[] fArr9 = new float[i12];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr9));
                                                i13 = i16;
                                                float[] fArr10 = new float[i12];
                                                fArr10[0] = s8Var2.c(i16);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i13 = i16;
                                            }
                                            i16 = i13 + 1;
                                            linkedList5 = linkedList3;
                                            oc0Var3 = oc0Var4;
                                            i15 = 1;
                                        }
                                        oc0Var = oc0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i17 = 0; i17 < length; i17++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), property5, s8Var2.c(i17)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i17), property5, s8Var2.c(i17)));
                                        }
                                        xe xeVar = (xe) s8Var2.f15404f;
                                        if (xeVar != null) {
                                            org.telegram.messenger.g0.r(xeVar);
                                            s8Var2.f15404f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) s8Var2.f15403e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        s8Var2.f15403e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) s8Var2.f15403e).playTogether(arrayList3);
                                        ((AnimatorSet) s8Var2.f15403e).addListener(new jc0(s8Var2, 1));
                                        ((AnimatorSet) s8Var2.f15403e).start();
                                        oc0.a((oc0) s8Var2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    z10 = i11;
                                    break;
                            }
                            if (intValue == 11) {
                                oc0Var2 = oc0Var;
                            } else {
                                oc0Var2 = oc0Var;
                                Drawable drawable = oc0Var2.f38107a;
                                if (drawable instanceof za0) {
                                    za0 za0Var = (za0) drawable;
                                    za0Var.D = null;
                                    za0Var.y();
                                    float f10 = za0Var.h;
                                    if (intValue == 10) {
                                        if (z10) {
                                            za0Var.x();
                                            z12 = true;
                                        } else {
                                            z12 = i11;
                                        }
                                        z11 = i11;
                                    } else {
                                        z11 = true;
                                        za0Var.w(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f10 >= 1.0f) {
                                            oc0Var2.b(za0Var);
                                        } else {
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(new di.p6(oc0Var2, z11, za0Var, 22));
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z11));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i18 = i11; i18 < linkedList6.size(); i18++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i18);
                                                Boolean bool = (Boolean) linkedList7.get(i18);
                                                if (bool != null && bool.booleanValue() != z11) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i18));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i19 = i11;
                                            while (i19 < size) {
                                                Object obj = arrayList4.get(i19);
                                                i19++;
                                                linkedList6.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.pe(10));
                                            int size2 = arrayList5.size();
                                            int i20 = i11;
                                            while (i20 < size2) {
                                                Object obj2 = arrayList5.get(i20);
                                                i20++;
                                                linkedList7.remove(((Integer) obj2).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) s8Var2.d).length() == 4) {
                                oc0Var2.n(i11);
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
        imageView3.setImageResource(2131231192);
        imageView3.setScaleType(scaleType);
        imageView3.setBackgroundResource(2131230881);
        frameLayout.addView(imageView3, c8.na.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView3.setContentDescription(org.telegram.messenger.gd.N0(2131754881, null));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final oc0 f35104b;

            {
                this.f35104b = this;
            }

            @Override
            public final void onClick(View view) {
                oc0 oc0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                int i11;
                boolean z10;
                LinkedList linkedList3;
                int i12;
                int i13;
                oc0 oc0Var2;
                boolean z11;
                boolean z12;
                int i14 = r2;
                oc0 oc0Var3 = this.f35104b;
                switch (i14) {
                    case 0:
                        oc0Var3.n(false);
                        return;
                    case 1:
                        oc0Var3.c();
                        return;
                    default:
                        LinkedList linkedList4 = oc0Var3.W;
                        LinkedList linkedList5 = oc0Var3.V;
                        hi.s8 s8Var2 = oc0Var3.f38123s;
                        if (oc0Var3.f38118g0 && !oc0Var3.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("0");
                                    z10 = i11;
                                    break;
                                case 1:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("1");
                                    z10 = i11;
                                    break;
                                case 2:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("2");
                                    z10 = i11;
                                    break;
                                case 3:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("3");
                                    z10 = i11;
                                    break;
                                case 4:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("4");
                                    z10 = i11;
                                    break;
                                case 5:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("5");
                                    z10 = i11;
                                    break;
                                case 6:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("6");
                                    z10 = i11;
                                    break;
                                case 7:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("7");
                                    z10 = i11;
                                    break;
                                case 8:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("8");
                                    z10 = i11;
                                    break;
                                case 9:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    s8Var2.b("9");
                                    z10 = i11;
                                    break;
                                case 10:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    oc0Var.c();
                                    z10 = i11;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) s8Var2.f15402c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    i11 = false;
                                    ArrayList arrayList2 = (ArrayList) s8Var2.f15401b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) s8Var2.d;
                                    if (sb2.length() == 0) {
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = i11;
                                        break;
                                    } else {
                                        try {
                                            s8Var2.performHapticFeedback(3);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int i15 = 1;
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i16 = length;
                                        while (i16 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i16);
                                            oc0 oc0Var4 = oc0Var3;
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i12 = i15;
                                                float[] fArr = new float[i12];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, fArr));
                                                float[] fArr2 = new float[i12];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, fArr2));
                                                float[] fArr3 = new float[i12];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, fArr3));
                                                float[] fArr4 = new float[i12];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property, fArr4));
                                                float[] fArr5 = new float[i12];
                                                fArr5[0] = s8Var2.c(i16);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i12 = i15;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i16);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i12];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr6));
                                                float[] fArr7 = new float[i12];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr7));
                                                float[] fArr8 = new float[i12];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr8));
                                                float[] fArr9 = new float[i12];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr9));
                                                i13 = i16;
                                                float[] fArr10 = new float[i12];
                                                fArr10[0] = s8Var2.c(i16);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i13 = i16;
                                            }
                                            i16 = i13 + 1;
                                            linkedList5 = linkedList3;
                                            oc0Var3 = oc0Var4;
                                            i15 = 1;
                                        }
                                        oc0Var = oc0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i17 = 0; i17 < length; i17++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), property5, s8Var2.c(i17)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i17), property5, s8Var2.c(i17)));
                                        }
                                        xe xeVar = (xe) s8Var2.f15404f;
                                        if (xeVar != null) {
                                            org.telegram.messenger.g0.r(xeVar);
                                            s8Var2.f15404f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) s8Var2.f15403e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        s8Var2.f15403e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) s8Var2.f15403e).playTogether(arrayList3);
                                        ((AnimatorSet) s8Var2.f15403e).addListener(new jc0(s8Var2, 1));
                                        ((AnimatorSet) s8Var2.f15403e).start();
                                        oc0.a((oc0) s8Var2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = false;
                                    z10 = i11;
                                    break;
                            }
                            if (intValue == 11) {
                                oc0Var2 = oc0Var;
                            } else {
                                oc0Var2 = oc0Var;
                                Drawable drawable = oc0Var2.f38107a;
                                if (drawable instanceof za0) {
                                    za0 za0Var = (za0) drawable;
                                    za0Var.D = null;
                                    za0Var.y();
                                    float f10 = za0Var.h;
                                    if (intValue == 10) {
                                        if (z10) {
                                            za0Var.x();
                                            z12 = true;
                                        } else {
                                            z12 = i11;
                                        }
                                        z11 = i11;
                                    } else {
                                        z11 = true;
                                        za0Var.w(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f10 >= 1.0f) {
                                            oc0Var2.b(za0Var);
                                        } else {
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(new di.p6(oc0Var2, z11, za0Var, 22));
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z11));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i18 = i11; i18 < linkedList6.size(); i18++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i18);
                                                Boolean bool = (Boolean) linkedList7.get(i18);
                                                if (bool != null && bool.booleanValue() != z11) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i18));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i19 = i11;
                                            while (i19 < size) {
                                                Object obj = arrayList4.get(i19);
                                                i19++;
                                                linkedList6.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.pe(10));
                                            int size2 = arrayList5.size();
                                            int i20 = i11;
                                            while (i20 < size2) {
                                                Object obj2 = arrayList5.get(i20);
                                                i20++;
                                                linkedList7.remove(((Integer) obj2).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) s8Var2.d).length() == 4) {
                                oc0Var2.n(i11);
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
        frameLayout.addView(view, c8.na.a(-1.0f, 1.0f / org.telegram.messenger.g0.f24225p, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        h0Var.addView(frameLayout2, c8.na.e(-1, -1, 51));
        bi.v2 v2Var = new bi.v2(context, 18);
        this.f38114e = v2Var;
        v2Var.setClipChildren(false);
        frameLayout2.addView(v2Var, c8.na.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f38109b = frameLayout3;
        v2Var.addView(frameLayout3, c8.na.e(-2, -2, 49));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(N0);
        TextView m11 = org.telegram.ui.Cells.c0.m(frameLayout3, textView2, c8.na.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.f38111c = m11;
        m11.setTextSize(1, 14.0f);
        m11.setTextColor(-1);
        m11.setText((CharSequence) null);
        frameLayout3.addView(m11, c8.na.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f38116f = new ArrayList(10);
        while (true) {
            if (i10 >= 12) {
                break;
            }
            lc0 lc0Var = new lc0(context);
            c8.sa.b(lc0Var, 0.15f, 1.5f);
            lc0Var.setTag(Integer.valueOf(i10));
            int[] iArr = f38106j0;
            if (i10 == 11) {
                lc0Var.setBackground(f(lc0Var));
                int L = org.telegram.messenger.g0.L(30.0f);
                lc0Var.setForeground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, 654311423, 654311423));
                lc0Var.setImage(2131231103);
                lc0Var.setOnLongClickListener(new o00(this, 1));
                lc0Var.setContentDescription(org.telegram.messenger.gd.N0(2131754920, null));
                lc0Var.setNextFocusForwardId(2131296594);
                lc0Var.setAccessibilityTraversalBefore(2131296594);
            } else if (i10 == 10) {
                this.f38121n = lc0Var;
                lc0Var.setBackground(f(lc0Var));
                int L2 = org.telegram.messenger.g0.L(30.0f);
                lc0Var.setForeground(org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, 0, 654311423, 654311423));
                lc0Var.setContentDescription(org.telegram.messenger.gd.N0(2131754881, null));
                lc0Var.setImage(2131231192);
                lc0Var.setNextFocusForwardId(2131296595);
                lc0Var.setAccessibilityTraversalBefore(2131296595);
            } else {
                lc0Var.setBackground(f(lc0Var));
                int L3 = org.telegram.messenger.g0.L(30.0f);
                lc0Var.setForeground(org.telegram.ui.ActionBar.n6.k0(L3, L3, L3, L3, 0, 654311423, 654311423));
                lc0Var.setContentDescription(i10 + "");
                lc0Var.setNum(i10);
                if (i10 == 0) {
                    lc0Var.setNextFocusForwardId(2131296604);
                    lc0Var.setAccessibilityTraversalBefore(2131296604);
                } else if (i10 == 9) {
                    if (g()) {
                        lc0Var.setNextFocusForwardId(2131296606);
                        lc0Var.setAccessibilityTraversalBefore(2131296606);
                    } else {
                        lc0Var.setNextFocusForwardId(2131296594);
                        lc0Var.setAccessibilityTraversalBefore(2131296594);
                    }
                } else {
                    int i11 = iArr[i10 + 1];
                    lc0Var.setNextFocusForwardId(i11);
                    lc0Var.setAccessibilityTraversalBefore(i11);
                }
            }
            lc0Var.setId(iArr[i10]);
            lc0Var.setOnClickListener(new View.OnClickListener(this) {
                public final oc0 f35104b;

                {
                    this.f35104b = this;
                }

                @Override
                public final void onClick(View view2) {
                    oc0 oc0Var;
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    int i112;
                    boolean z10;
                    LinkedList linkedList3;
                    int i12;
                    int i13;
                    oc0 oc0Var2;
                    boolean z11;
                    boolean z12;
                    int i14 = r2;
                    oc0 oc0Var3 = this.f35104b;
                    switch (i14) {
                        case 0:
                            oc0Var3.n(false);
                            return;
                        case 1:
                            oc0Var3.c();
                            return;
                        default:
                            LinkedList linkedList4 = oc0Var3.W;
                            LinkedList linkedList5 = oc0Var3.V;
                            hi.s8 s8Var2 = oc0Var3.f38123s;
                            if (oc0Var3.f38118g0 && !oc0Var3.Q) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = false;
                                        s8Var2.b("0");
                                        z10 = i112;
                                        break;
                                    case 1:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = false;
                                        s8Var2.b("1");
                                        z10 = i112;
                                        break;
                                    case 2:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = false;
                                        s8Var2.b("2");
                                        z10 = i112;
                                        break;
                                    case 3:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = false;
                                        s8Var2.b("3");
                                        z10 = i112;
                                        break;
                                    case 4:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = false;
                                        s8Var2.b("4");
                                        z10 = i112;
                                        break;
                                    case 5:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = false;
                                        s8Var2.b("5");
                                        z10 = i112;
                                        break;
                                    case 6:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = false;
                                        s8Var2.b("6");
                                        z10 = i112;
                                        break;
                                    case 7:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = false;
                                        s8Var2.b("7");
                                        z10 = i112;
                                        break;
                                    case 8:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = false;
                                        s8Var2.b("8");
                                        z10 = i112;
                                        break;
                                    case 9:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = false;
                                        s8Var2.b("9");
                                        z10 = i112;
                                        break;
                                    case 10:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = false;
                                        oc0Var.c();
                                        z10 = i112;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) s8Var2.f15402c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        i112 = false;
                                        ArrayList arrayList2 = (ArrayList) s8Var2.f15401b;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb2 = (StringBuilder) s8Var2.d;
                                        if (sb2.length() == 0) {
                                            oc0Var = oc0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = i112;
                                            break;
                                        } else {
                                            try {
                                                s8Var2.performHapticFeedback(3);
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, true);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int i15 = 1;
                                            int length = sb2.length() - 1;
                                            if (length != 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            linkedList = linkedList4;
                                            int i16 = length;
                                            while (i16 < 4) {
                                                TextView textView22 = (TextView) arrayList2.get(i16);
                                                oc0 oc0Var4 = oc0Var3;
                                                if (textView22.getAlpha() != 0.0f) {
                                                    linkedList3 = linkedList5;
                                                    i12 = i15;
                                                    float[] fArr = new float[i12];
                                                    fArr[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, property4, fArr));
                                                    float[] fArr2 = new float[i12];
                                                    fArr2[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, property3, fArr2));
                                                    float[] fArr3 = new float[i12];
                                                    fArr3[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, property2, fArr3));
                                                    float[] fArr4 = new float[i12];
                                                    fArr4[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, property, fArr4));
                                                    float[] fArr5 = new float[i12];
                                                    fArr5[0] = s8Var2.c(i16);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, property5, fArr5));
                                                } else {
                                                    linkedList3 = linkedList5;
                                                    i12 = i15;
                                                }
                                                TextView textView3 = (TextView) arrayList.get(i16);
                                                if (textView3.getAlpha() != 0.0f) {
                                                    float[] fArr6 = new float[i12];
                                                    fArr6[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr6));
                                                    float[] fArr7 = new float[i12];
                                                    fArr7[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr7));
                                                    float[] fArr8 = new float[i12];
                                                    fArr8[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr8));
                                                    float[] fArr9 = new float[i12];
                                                    fArr9[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr9));
                                                    i13 = i16;
                                                    float[] fArr10 = new float[i12];
                                                    fArr10[0] = s8Var2.c(i16);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                                } else {
                                                    i13 = i16;
                                                }
                                                i16 = i13 + 1;
                                                linkedList5 = linkedList3;
                                                oc0Var3 = oc0Var4;
                                                i15 = 1;
                                            }
                                            oc0Var = oc0Var3;
                                            linkedList2 = linkedList5;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i17 = 0; i17 < length; i17++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), property5, s8Var2.c(i17)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i17), property5, s8Var2.c(i17)));
                                            }
                                            xe xeVar = (xe) s8Var2.f15404f;
                                            if (xeVar != null) {
                                                org.telegram.messenger.g0.r(xeVar);
                                                s8Var2.f15404f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) s8Var2.f15403e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            s8Var2.f15403e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) s8Var2.f15403e).playTogether(arrayList3);
                                            ((AnimatorSet) s8Var2.f15403e).addListener(new jc0(s8Var2, 1));
                                            ((AnimatorSet) s8Var2.f15403e).start();
                                            oc0.a((oc0) s8Var2.h);
                                            z10 = true;
                                            break;
                                        }
                                    default:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = false;
                                        z10 = i112;
                                        break;
                                }
                                if (intValue == 11) {
                                    oc0Var2 = oc0Var;
                                } else {
                                    oc0Var2 = oc0Var;
                                    Drawable drawable = oc0Var2.f38107a;
                                    if (drawable instanceof za0) {
                                        za0 za0Var = (za0) drawable;
                                        za0Var.D = null;
                                        za0Var.y();
                                        float f10 = za0Var.h;
                                        if (intValue == 10) {
                                            if (z10) {
                                                za0Var.x();
                                                z12 = true;
                                            } else {
                                                z12 = i112;
                                            }
                                            z11 = i112;
                                        } else {
                                            z11 = true;
                                            za0Var.w(true);
                                            z12 = true;
                                        }
                                        if (z12) {
                                            if (f10 >= 1.0f) {
                                                oc0Var2.b(za0Var);
                                            } else {
                                                LinkedList linkedList6 = linkedList2;
                                                linkedList6.offer(new di.p6(oc0Var2, z11, za0Var, 22));
                                                LinkedList linkedList7 = linkedList;
                                                linkedList7.offer(Boolean.valueOf(z11));
                                                ArrayList arrayList4 = new ArrayList();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (int i18 = i112; i18 < linkedList6.size(); i18++) {
                                                    Runnable runnable = (Runnable) linkedList6.get(i18);
                                                    Boolean bool = (Boolean) linkedList7.get(i18);
                                                    if (bool != null && bool.booleanValue() != z11) {
                                                        arrayList4.add(runnable);
                                                        arrayList5.add(Integer.valueOf(i18));
                                                    }
                                                }
                                                int size = arrayList4.size();
                                                int i19 = i112;
                                                while (i19 < size) {
                                                    Object obj = arrayList4.get(i19);
                                                    i19++;
                                                    linkedList6.remove((Runnable) obj);
                                                }
                                                Collections.sort(arrayList5, new org.telegram.ui.pe(10));
                                                int size2 = arrayList5.size();
                                                int i20 = i112;
                                                while (i20 < size2) {
                                                    Object obj2 = arrayList5.get(i20);
                                                    i20++;
                                                    linkedList7.remove(((Integer) obj2).intValue());
                                                }
                                            }
                                        }
                                    }
                                }
                                if (((StringBuilder) s8Var2.d).length() == 4) {
                                    oc0Var2.n(i112);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
            this.f38116f.add(lc0Var);
            i10++;
        }
        for (i7 = 11; i7 >= 0; i7--) {
            this.f38114e.addView((FrameLayout) this.f38116f.get(i7), c8.na.e(60, 60, 51));
        }
        d();
    }

    public static void a(oc0 oc0Var) {
        boolean z10;
        float f10;
        float f11;
        FrameLayout frameLayout = oc0Var.f38109b;
        hi.s8 s8Var = oc0Var.f38123s;
        if (s8Var != null && ((StringBuilder) s8Var.d).length() <= 0) {
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
            org.telegram.messenger.m10.o(scaleX.scaleY(f12), kr.h, 320L);
        }
    }

    public final void b(za0 za0Var) {
        r1.g gVar = this.U;
        if (gVar != null && gVar.f56440f) {
            gVar.d();
        }
        r1.f fVar = new r1.f(0.0f);
        za0Var.D = new hy(fVar, 8);
        za0Var.y();
        r1.g gVar2 = new r1.g(fVar);
        gVar2.f56446m = org.telegram.ui.Cells.c0.p(100.0f, 300.0f, 1.0f);
        this.U = gVar2;
        gVar2.a(new bi.y0(5, this, za0Var));
        this.U.b(new i7(za0Var, 5));
        this.U.h();
    }

    public final void c() {
        Activity W;
        qc0 qc0Var;
        if (!this.Q && (W = org.telegram.messenger.g0.W(getContext())) != null && this.f38121n.getVisibility() == 0 && !org.telegram.messenger.t0.f27021x) {
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                ArrayList arrayList = launchActivity.A0;
                if (arrayList.isEmpty() && (qc0Var = launchActivity.f43234z0) != null) {
                    if (this != qc0Var.f38808b) {
                        return;
                    }
                } else if (i5.c.h(1, arrayList) != this) {
                    return;
                }
            }
            try {
                if (new android.support.v4.media.session.a0(new androidx.biometric.t(getContext(), 0)).d(15) == 0 && org.telegram.messenger.vr.g() && !org.telegram.messenger.vr.a()) {
                    d6.i iVar = new d6.i(LaunchActivity.H1, f0.d.e(getContext()), new ki.n(this, 1));
                    m6.n nVar = new m6.n(1);
                    nVar.f20972b = org.telegram.messenger.gd.N0(2131743603, null);
                    nVar.d = org.telegram.messenger.gd.N0(2131743545, null);
                    nVar.f20971a = 15;
                    iVar.e(nVar.b(), null);
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
        lc0 lc0Var = this.f38121n;
        lc0Var.setVisibility(i7);
        if (org.telegram.messenger.bz.f23316r == 1) {
            this.F.setVisibility(lc0Var.getVisibility());
        }
        if (org.telegram.messenger.bz.f23316r == 1) {
            i10 = 2131751104;
        } else if (g10) {
            i10 = 2131751105;
        } else {
            i10 = 2131751106;
        }
        this.f38111c.setText(org.telegram.messenger.gd.N0(i10, null));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.Q1) {
            d();
            if (((Boolean) objArr[0]).booleanValue() && org.telegram.messenger.bz.f23333x) {
                c();
            }
        } else if (i7 == org.telegram.messenger.ks.f25259o0 && objArr[0] != this) {
            setVisibility(8);
            j();
        }
    }

    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > org.telegram.messenger.bz.f23325u) {
            long j3 = org.telegram.messenger.bz.f23322t - (elapsedRealtime - org.telegram.messenger.bz.f23325u);
            org.telegram.messenger.bz.f23322t = j3;
            if (j3 < 0) {
                org.telegram.messenger.bz.f23322t = 0L;
            }
        }
        org.telegram.messenger.bz.f23325u = elapsedRealtime;
        org.telegram.messenger.bz.y();
        long j10 = org.telegram.messenger.bz.f23322t;
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        EditTextBoldCursor editTextBoldCursor = this.f38122r;
        FrameLayout frameLayout = this.h;
        rc rcVar = this.f38113d0;
        TextView textView = this.f38126y;
        if (i7 > 0) {
            int max = Math.max(1, (int) Math.ceil(j10 / 1000.0d));
            if (max != this.f38115e0) {
                textView.setText(org.telegram.messenger.gd.a0(null, null, 2131743791, org.telegram.messenger.gd.G(max, "Seconds", new Object[0])));
                this.f38115e0 = max;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                frameLayout.setVisibility(4);
                o(false);
                org.telegram.messenger.g0.v1(editTextBoldCursor);
            }
            org.telegram.messenger.g0.r(rcVar);
            org.telegram.messenger.g0.h3(rcVar, 100L);
            return;
        }
        org.telegram.messenger.g0.r(rcVar);
        if (textView.getVisibility() == 0) {
            textView.setVisibility(4);
            frameLayout.setVisibility(0);
            o(true);
            if (org.telegram.messenger.bz.f23316r == 1) {
                org.telegram.messenger.g0.I3(editTextBoldCursor);
            }
        }
    }

    public final nc0 f(lc0 lc0Var) {
        gh.e eVar = new gh.e(null);
        eVar.f13620e = new ub0(2);
        if (Build.VERSION.SDK_INT < 29) {
            eVar.f(1308622847, 1308622847);
            eVar.e(452984831, 452984831);
            float N = org.telegram.messenger.g0.N(1.0f);
            float N2 = org.telegram.messenger.g0.N(0.6666667f);
            eVar.f13621f = N;
            eVar.h = N2;
        }
        fh.g c10 = this.J.c(lc0Var, eVar, true);
        c10.r(org.telegram.messenger.g0.L(30.0f));
        return new nc0(c10);
    }

    public final boolean g() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oc0.g():boolean");
    }

    public final boolean i() {
        hi.x3 x3Var = this.f38117f0;
        if (x3Var != null && x3Var.c()) {
            org.telegram.messenger.g0.v1(this.f38122r);
            return false;
        }
        return true;
    }

    public final void k() {
        org.telegram.messenger.g0.r(this.f38113d0);
    }

    public final void l() {
        if (!this.Q) {
            e();
            if (this.f38126y.getVisibility() != 0) {
                if (org.telegram.messenger.bz.f23316r == 1) {
                    EditTextBoldCursor editTextBoldCursor = this.f38122r;
                    if (editTextBoldCursor != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.I3(editTextBoldCursor);
                    }
                    org.telegram.messenger.g0.h3(new dc0(this, 0), 200L);
                }
                c();
            }
        }
    }

    public final void m(boolean z10, int i7, int i10, org.telegram.ui.i50 i50Var) {
        View currentFocus;
        boolean z11;
        o9 o9Var;
        int i11;
        int i12;
        if (getVisibility() != 0) {
            this.Q = false;
        }
        d();
        e();
        Activity W = org.telegram.messenger.g0.W(getContext());
        int i13 = org.telegram.messenger.bz.f23316r;
        TextView textView = this.f38126y;
        EditTextBoldCursor editTextBoldCursor = this.f38122r;
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
        this.f38107a = null;
        boolean z12 = org.telegram.ui.ActionBar.n6.s0() instanceof za0;
        ai.h0 h0Var = this.f38124w;
        if (z12) {
            z11 = !org.telegram.ui.ActionBar.n6.I.q();
            this.f38107a = org.telegram.ui.ActionBar.n6.s0();
            h0Var.setBackgroundColor(-1090519040);
        } else {
            if (org.telegram.ui.ActionBar.n6.W && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.n6.K0()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.n6.K0())) {
                org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.n6.I.f29334j0;
                if (e6Var != null && (i11 = e6Var.d) != 0 && (i12 = e6Var.f28983e) != 0) {
                    o9Var = new o9(o9.d(e6Var.h), new int[]{i11, i12});
                } else {
                    o9Var = null;
                }
                this.f38107a = o9Var;
                if (o9Var == null) {
                    this.f38107a = org.telegram.ui.ActionBar.n6.s0();
                }
                if (this.f38107a instanceof o9) {
                    h0Var.setBackgroundColor(570425344);
                } else {
                    h0Var.setBackgroundColor(-1090519040);
                }
            } else {
                if (!"d".equals(org.telegram.ui.ActionBar.n6.K0())) {
                    String K0 = org.telegram.ui.ActionBar.n6.K0();
                    if (!org.telegram.ui.ActionBar.n6.f29555j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(K0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(K0)) {
                        Drawable s02 = org.telegram.ui.ActionBar.n6.s0();
                        this.f38107a = s02;
                        if (s02 instanceof o9) {
                            h0Var.setBackgroundColor(570425344);
                        } else if (s02 != null) {
                            h0Var.setBackgroundColor(-1090519040);
                        } else {
                            h0Var.setBackgroundColor(-11436898);
                        }
                    }
                }
                h0Var.setBackgroundColor(-11436898);
            }
            z11 = false;
        }
        Drawable drawable = this.f38107a;
        if (drawable instanceof za0) {
            za0 za0Var = (za0) drawable;
            int[] iArr = za0Var.f42783a;
            if (z11) {
                int[] iArr2 = new int[iArr.length];
                for (int i14 = 0; i14 < iArr.length; i14++) {
                    iArr2[i14] = org.telegram.ui.ActionBar.n6.b(0.14f, 0.0f, iArr[i14]);
                }
                iArr = iArr2;
            }
            this.f38107a = new za0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (za0Var.f42805u != null && za0Var.f42801q < 0) {
                h0Var.setBackgroundColor(2130706432);
            } else {
                h0Var.setBackgroundColor(570425344);
            }
            ((za0) this.f38107a).q(h0Var);
        }
        this.f38125x.setText(org.telegram.messenger.gd.N0(2131754229, null));
        int i15 = org.telegram.messenger.bz.f23316r;
        ImageView imageView = this.F;
        ImageView imageView2 = this.E;
        bi.v2 v2Var = this.f38114e;
        hi.s8 s8Var = this.f38123s;
        if (i15 == 0) {
            if (textView.getVisibility() != 0) {
                v2Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            s8Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i15 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            v2Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            s8Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.f38121n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        hi.s8.a(s8Var, false);
        if (z10) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new ic0(this, i7, i10, i50Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.f38110b0 = 1.0f;
            h(1.0f);
            qh0 qh0Var = this.N;
            qh0Var.setScaleX(1.0f);
            qh0Var.setScaleY(1.0f);
            qh0Var.i();
            qh0Var.getAnimatedDrawable().N(38, false, false);
            if (i50Var != null) {
                i50Var.run();
            }
        }
        setOnTouchListener(new gi.a(20));
    }

    public final void n(boolean z10) {
        String str;
        if (!this.Q && getVisibility() == 0) {
            EditTextBoldCursor editTextBoldCursor = this.f38122r;
            if (!z10) {
                if (org.telegram.messenger.bz.f23322t <= 0) {
                    int i7 = org.telegram.messenger.bz.f23316r;
                    hi.s8 s8Var = this.f38123s;
                    if (i7 == 0) {
                        str = ((StringBuilder) s8Var.d).toString();
                    } else if (i7 != 1) {
                        str = "";
                    } else {
                        str = editTextBoldCursor.getText().toString();
                    }
                    int length = str.length();
                    FrameLayout frameLayout = this.f38109b;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.NOTIFICATION_ERROR;
                    if (length == 0) {
                        q2Var.a();
                        int i10 = -this.f38112c0;
                        this.f38112c0 = i10;
                        org.telegram.messenger.g0.E3(i10, frameLayout, null);
                        return;
                    } else if (!org.telegram.messenger.bz.g(str)) {
                        org.telegram.messenger.bz.r();
                        if (org.telegram.messenger.bz.f23322t > 0) {
                            e();
                        }
                        editTextBoldCursor.setText("");
                        hi.s8.a(s8Var, true);
                        q2Var.a();
                        int i11 = -this.f38112c0;
                        this.f38112c0 = i11;
                        org.telegram.messenger.g0.E3(i11, frameLayout, null);
                        Drawable drawable = this.f38107a;
                        if (drawable instanceof za0) {
                            za0 za0Var = (za0) drawable;
                            LinkedList linkedList = this.V;
                            linkedList.clear();
                            LinkedList linkedList2 = this.W;
                            linkedList2.clear();
                            r1.g gVar = this.U;
                            if (gVar != null && gVar.f56440f) {
                                linkedList.offer(new ya0(za0Var, 1));
                                linkedList2.offer(Boolean.FALSE);
                                return;
                            }
                            za0Var.m(true);
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
                org.telegram.messenger.vr.f27684g = null;
                org.telegram.messenger.vr.b(false);
            }
            org.telegram.messenger.bz.f23333x = false;
            org.telegram.messenger.bz.y();
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25254n0, new Object[0]);
            setOnTouchListener(null);
            mc0 mc0Var = this.P;
            if (mc0Var != null) {
                mc0Var.p(this);
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
            qh0 qh0Var = this.N;
            qh0Var.getAnimatedDrawable().P(71);
            qh0Var.getAnimatedDrawable().N(37, false, false);
            qh0Var.d();
            org.telegram.messenger.g0.g3(new dc0(this, 1));
        }
    }

    public final void o(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.f38119h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f38118g0 = z10;
        float alpha = this.f38114e.getAlpha();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
        this.f38119h0 = ofFloat;
        ofFloat.addUpdateListener(new ec0(this, 0));
        this.f38119h0.addListener(new org.telegram.ui.on(17, this, z10));
        this.f38119h0.setInterpolator(kr.h);
        this.f38119h0.setDuration(320L);
        this.f38119h0.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.Q1);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25259o0);
        if (this.f38117f0 == null && (getParent() instanceof View)) {
            this.f38117f0 = new hi.x3((View) getParent(), false, new y2(this, 10));
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
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25259o0);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        View rootView = getRootView();
        int height = (rootView.getHeight() - org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.q1(rootView);
        Rect rect = this.O;
        getWindowVisibleDisplayFrame(rect);
        this.H = height - (rect.bottom - rect.top);
        if (org.telegram.messenger.bz.f23316r == 1 && (org.telegram.messenger.g0.Q1() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            if (frameLayout.getTag() != null) {
                i13 = ((Integer) frameLayout.getTag()).intValue();
            } else {
                i13 = 0;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((i13 + layoutParams.height) - (this.H / 2)) - org.telegram.messenger.g0.f24220m;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z10, i7, i10, i11, i12);
        TextView textView = this.f38125x;
        int[] iArr = this.f38120i0;
        textView.getLocationInWindow(iArr);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        qh0 qh0Var = this.N;
        if (!Q1 && getContext().getResources().getConfiguration().orientation == 2) {
            int L = iArr[1] - org.telegram.messenger.g0.L(100.0f);
            this.M = L;
            qh0Var.setTranslationY(L);
            return;
        }
        int L2 = iArr[1] - org.telegram.messenger.g0.L(100.0f);
        this.M = L2;
        qh0Var.setTranslationY(L2);
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
        int i17 = org.telegram.messenger.g0.f24226q.y;
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
            if (org.telegram.messenger.bz.f23316r == 1) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            view.setVisibility(i16);
        }
        qh0 qh0Var = this.N;
        bi.v2 v2Var = this.f38114e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            if (org.telegram.messenger.bz.f23316r == 0) {
                f11 = 2.0f;
                f12 = size / 2.0f;
            } else {
                f11 = 2.0f;
                f12 = size;
            }
            qh0Var.setTranslationX((f12 / f11) - org.telegram.messenger.g0.L(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            if (org.telegram.messenger.bz.f23316r == 0) {
                i14 = size / 2;
            } else {
                i14 = size;
            }
            layoutParams.width = i14;
            layoutParams.height = org.telegram.messenger.g0.L(180.0f);
            int z11 = org.telegram.messenger.m10.z(140.0f, i17, 2);
            if (org.telegram.messenger.bz.f23316r == 0) {
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
            layoutParams2.topMargin = org.telegram.messenger.g0.f24220m;
            layoutParams2.width = i18;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) v2Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.g0.L(82.0f);
            layoutParams3.width = (Math.max(0, 2) * L) + (L3 * 3);
            layoutParams3.gravity = 17;
            v2Var.setLayoutParams(layoutParams3);
            i13 = 0;
        } else {
            qh0Var.setTranslationX((size / 2.0f) - org.telegram.messenger.g0.L(29.0f));
            int i19 = org.telegram.messenger.g0.f24220m;
            if (org.telegram.messenger.g0.Q1()) {
                if (size > org.telegram.messenger.g0.L(498.0f)) {
                    i11 = org.telegram.messenger.m10.z(498.0f, size, 2);
                    size = org.telegram.messenger.g0.L(498.0f);
                } else {
                    i11 = 0;
                }
                if (i17 > org.telegram.messenger.g0.L(528.0f)) {
                    i19 = org.telegram.messenger.m10.z(528.0f, i17, 2);
                    i17 = org.telegram.messenger.g0.L(528.0f);
                }
            } else {
                i11 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            int i20 = i17 / 3;
            if (org.telegram.messenger.bz.f23316r == 0) {
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
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) v2Var.getLayoutParams();
            i13 = 0;
            layoutParams5.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.g0.L(82.0f);
            layoutParams5.width = (Math.max(0, 2) * L) + (L3 * 3);
            if (org.telegram.messenger.g0.Q1()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            v2Var.setLayoutParams(layoutParams5);
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
            FrameLayout frameLayout3 = (FrameLayout) this.f38116f.get(i23);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((L3 + L2) * (i24 / 3)) + L4;
            layoutParams7.leftMargin = (L3 + L) * (i24 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
        }
        super.onMeasure(i7, i10);
    }

    public void setDelegate(mc0 mc0Var) {
        this.P = mc0Var;
    }

    public void h(float f10) {
    }

    public void j() {
    }
}
