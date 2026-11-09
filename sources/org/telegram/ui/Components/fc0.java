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
public class fc0 extends FrameLayout implements org.telegram.messenger.ls {
    public static final int[] f33617i0 = {2131296592, 2131296593, 2131296594, 2131296595, 2131296596, 2131296597, 2131296598, 2131296599, 2131296600, 2131296601, 2131296602, 2131296604};
    public final ImageView D;
    public final ImageView E;
    public final View F;
    public int G;
    public final ri.b H;
    public final dh.c I;
    public Bitmap J;
    public Canvas K;
    public int L;
    public final dh0 M;
    public final Rect N;
    public dc0 O;
    public boolean P;
    public AnimatorSet Q;
    public AnimatorSet R;
    public ValueAnimator S;
    public r1.g T;
    public final LinkedList U;
    public final LinkedList V;
    public final ArrayList W;
    public Drawable f33618a;
    public float f33619a0;
    public final FrameLayout f33620b;
    public int f33621b0;
    public final TextView f33622c;
    public final et f33623c0;
    public final FrameLayout d;
    public int f33624d0;
    public final di.b4 f33625e;
    public fi.q3 f33626e0;
    public final ArrayList f33627f;
    public boolean f33628f0;
    public ValueAnimator f33629g0;
    public final FrameLayout h;
    public final int[] f33630h0;
    public final cc0 f33631n;
    public final EditTextBoldCursor f33632r;
    public final fi.a8 f33633s;
    public final bi.x5 f33634w;
    public final TextView f33635x;
    public final TextView f33636y;

    public fc0(Context context) {
        super(context);
        int i7;
        String M0 = org.telegram.messenger.id.M0(2131743850, null);
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
        this.f33621b0 = -12;
        this.f33623c0 = new et(this, 8);
        this.f33628f0 = true;
        this.f33630h0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        bi.x5 x5Var = new bi.x5(this, context);
        this.f33634w = x5Var;
        x5Var.setWillNotDraw(false);
        addView(x5Var, c8.ha.c(-1.0f, -1));
        cVar.h = new jh.k(x5Var);
        cVar.f8706i = x5Var;
        cVar.f8705g = bVar2;
        ?? imageView = new ImageView(context);
        this.M = imageView;
        imageView.f(2131624111, 58, 58, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, c8.ha.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        x5Var.addView(frameLayout, c8.ha.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f33635x = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setAlpha(0.0f);
        TextView i11 = org.telegram.ui.Cells.f1.i(frameLayout, textView, c8.ha.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.f33636y = i11;
        i11.setTextColor(-1);
        i11.setTextSize(1, 15.0f);
        i11.setGravity(1);
        i11.setVisibility(4);
        x5Var.addView(i11, c8.ha.e(-2, -2, 17));
        fi.a8 a8Var = new fi.a8(this, context);
        this.f33633s = a8Var;
        frameLayout.addView(a8Var, c8.ha.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f33632r = editTextBoldCursor;
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
        imageView2.setContentDescription(org.telegram.messenger.id.M0(2131751354, null));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final fc0 f40032b;

            {
                this.f40032b = this;
            }

            @Override
            public final void onClick(View view) {
                fc0 fc0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                int i12;
                boolean z9;
                LinkedList linkedList3;
                int i13;
                int i14;
                fc0 fc0Var2;
                boolean z10;
                boolean z11;
                int i15 = r2;
                fc0 fc0Var3 = this.f40032b;
                switch (i15) {
                    case 0:
                        fc0Var3.n(false);
                        return;
                    case 1:
                        fc0Var3.c();
                        return;
                    default:
                        LinkedList linkedList4 = fc0Var3.V;
                        LinkedList linkedList5 = fc0Var3.U;
                        fi.a8 a8Var2 = fc0Var3.f33633s;
                        if (fc0Var3.f33628f0 && !fc0Var3.P) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("0");
                                    z9 = i12;
                                    break;
                                case 1:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("1");
                                    z9 = i12;
                                    break;
                                case 2:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("2");
                                    z9 = i12;
                                    break;
                                case 3:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("3");
                                    z9 = i12;
                                    break;
                                case 4:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("4");
                                    z9 = i12;
                                    break;
                                case 5:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("5");
                                    z9 = i12;
                                    break;
                                case 6:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("6");
                                    z9 = i12;
                                    break;
                                case 7:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("7");
                                    z9 = i12;
                                    break;
                                case 8:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("8");
                                    z9 = i12;
                                    break;
                                case 9:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("9");
                                    z9 = i12;
                                    break;
                                case 10:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    fc0Var.c();
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
                                        fc0Var = fc0Var3;
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
                                            fc0 fc0Var4 = fc0Var3;
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
                                            fc0Var3 = fc0Var4;
                                            i16 = 1;
                                        }
                                        fc0Var = fc0Var3;
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
                                        ((AnimatorSet) a8Var2.f11614e).addListener(new ac0(a8Var2, 1));
                                        ((AnimatorSet) a8Var2.f11614e).start();
                                        fc0.a((fc0) a8Var2.h);
                                        z9 = true;
                                        break;
                                    }
                                default:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    z9 = i12;
                                    break;
                            }
                            if (intValue == 11) {
                                fc0Var2 = fc0Var;
                            } else {
                                fc0Var2 = fc0Var;
                                Drawable drawable = fc0Var2.f33618a;
                                if (drawable instanceof ra0) {
                                    ra0 ra0Var = (ra0) drawable;
                                    ra0Var.D = null;
                                    ra0Var.y();
                                    float f10 = ra0Var.h;
                                    if (intValue == 10) {
                                        if (z9) {
                                            ra0Var.x();
                                            z11 = true;
                                        } else {
                                            z11 = i12;
                                        }
                                        z10 = i12;
                                    } else {
                                        z10 = true;
                                        ra0Var.w(true);
                                        z11 = true;
                                    }
                                    if (z11) {
                                        if (f10 >= 1.0f) {
                                            fc0Var2.b(ra0Var);
                                        } else {
                                            bi.u7 u7Var = new bi.u7(fc0Var2, z10, ra0Var, 22);
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
                                fc0Var2.n(i12);
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
            public final fc0 f40032b;

            {
                this.f40032b = this;
            }

            @Override
            public final void onClick(View view) {
                fc0 fc0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                int i12;
                boolean z9;
                LinkedList linkedList3;
                int i13;
                int i14;
                fc0 fc0Var2;
                boolean z10;
                boolean z11;
                int i15 = r2;
                fc0 fc0Var3 = this.f40032b;
                switch (i15) {
                    case 0:
                        fc0Var3.n(false);
                        return;
                    case 1:
                        fc0Var3.c();
                        return;
                    default:
                        LinkedList linkedList4 = fc0Var3.V;
                        LinkedList linkedList5 = fc0Var3.U;
                        fi.a8 a8Var2 = fc0Var3.f33633s;
                        if (fc0Var3.f33628f0 && !fc0Var3.P) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("0");
                                    z9 = i12;
                                    break;
                                case 1:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("1");
                                    z9 = i12;
                                    break;
                                case 2:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("2");
                                    z9 = i12;
                                    break;
                                case 3:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("3");
                                    z9 = i12;
                                    break;
                                case 4:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("4");
                                    z9 = i12;
                                    break;
                                case 5:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("5");
                                    z9 = i12;
                                    break;
                                case 6:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("6");
                                    z9 = i12;
                                    break;
                                case 7:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("7");
                                    z9 = i12;
                                    break;
                                case 8:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("8");
                                    z9 = i12;
                                    break;
                                case 9:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    a8Var2.b("9");
                                    z9 = i12;
                                    break;
                                case 10:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    fc0Var.c();
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
                                        fc0Var = fc0Var3;
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
                                            fc0 fc0Var4 = fc0Var3;
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
                                            fc0Var3 = fc0Var4;
                                            i16 = 1;
                                        }
                                        fc0Var = fc0Var3;
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
                                        ((AnimatorSet) a8Var2.f11614e).addListener(new ac0(a8Var2, 1));
                                        ((AnimatorSet) a8Var2.f11614e).start();
                                        fc0.a((fc0) a8Var2.h);
                                        z9 = true;
                                        break;
                                    }
                                default:
                                    fc0Var = fc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    z9 = i12;
                                    break;
                            }
                            if (intValue == 11) {
                                fc0Var2 = fc0Var;
                            } else {
                                fc0Var2 = fc0Var;
                                Drawable drawable = fc0Var2.f33618a;
                                if (drawable instanceof ra0) {
                                    ra0 ra0Var = (ra0) drawable;
                                    ra0Var.D = null;
                                    ra0Var.y();
                                    float f10 = ra0Var.h;
                                    if (intValue == 10) {
                                        if (z9) {
                                            ra0Var.x();
                                            z11 = true;
                                        } else {
                                            z11 = i12;
                                        }
                                        z10 = i12;
                                    } else {
                                        z10 = true;
                                        ra0Var.w(true);
                                        z11 = true;
                                    }
                                    if (z11) {
                                        if (f10 >= 1.0f) {
                                            fc0Var2.b(ra0Var);
                                        } else {
                                            bi.u7 u7Var = new bi.u7(fc0Var2, z10, ra0Var, 22);
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
                                fc0Var2.n(i12);
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
        di.b4 b4Var = new di.b4(context, 16);
        this.f33625e = b4Var;
        b4Var.setClipChildren(false);
        frameLayout2.addView(b4Var, c8.ha.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f33620b = frameLayout3;
        b4Var.addView(frameLayout3, c8.ha.e(-2, -2, 49));
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 15.0f);
        g10.setTypeface(org.telegram.messenger.g0.o());
        g10.setTextColor(-1);
        g10.setText(M0);
        TextView i12 = org.telegram.ui.Cells.f1.i(frameLayout3, g10, c8.ha.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.f33622c = i12;
        i12.setTextSize(1, 14.0f);
        i12.setTextColor(-1);
        i12.setText((CharSequence) null);
        frameLayout3.addView(i12, c8.ha.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f33627f = new ArrayList(10);
        while (true) {
            if (i10 >= 12) {
                break;
            }
            cc0 cc0Var = new cc0(context);
            c8.ka.b(cc0Var, 0.15f, 1.5f);
            cc0Var.setTag(Integer.valueOf(i10));
            int[] iArr = f33617i0;
            if (i10 == 11) {
                cc0Var.setBackground(f(cc0Var));
                int L = org.telegram.messenger.g0.L(30.0f);
                cc0Var.setForeground(org.telegram.ui.ActionBar.l6.k0(L, L, L, L, 0, 654311423, 654311423));
                cc0Var.setImage(2131231101);
                cc0Var.setOnLongClickListener(new e00(this, 1));
                cc0Var.setContentDescription(org.telegram.messenger.id.M0(2131754920, null));
                cc0Var.setNextFocusForwardId(2131296592);
                cc0Var.setAccessibilityTraversalBefore(2131296592);
            } else if (i10 == 10) {
                this.f33631n = cc0Var;
                cc0Var.setBackground(f(cc0Var));
                int L2 = org.telegram.messenger.g0.L(30.0f);
                cc0Var.setForeground(org.telegram.ui.ActionBar.l6.k0(L2, L2, L2, L2, 0, 654311423, 654311423));
                cc0Var.setContentDescription(org.telegram.messenger.id.M0(2131754881, null));
                cc0Var.setImage(2131231189);
                cc0Var.setNextFocusForwardId(2131296593);
                cc0Var.setAccessibilityTraversalBefore(2131296593);
            } else {
                cc0Var.setBackground(f(cc0Var));
                int L3 = org.telegram.messenger.g0.L(30.0f);
                cc0Var.setForeground(org.telegram.ui.ActionBar.l6.k0(L3, L3, L3, L3, 0, 654311423, 654311423));
                cc0Var.setContentDescription(i10 + "");
                cc0Var.setNum(i10);
                if (i10 == 0) {
                    cc0Var.setNextFocusForwardId(2131296602);
                    cc0Var.setAccessibilityTraversalBefore(2131296602);
                } else if (i10 == 9) {
                    if (g()) {
                        cc0Var.setNextFocusForwardId(2131296604);
                        cc0Var.setAccessibilityTraversalBefore(2131296604);
                    } else {
                        cc0Var.setNextFocusForwardId(2131296592);
                        cc0Var.setAccessibilityTraversalBefore(2131296592);
                    }
                } else {
                    int i13 = iArr[i10 + 1];
                    cc0Var.setNextFocusForwardId(i13);
                    cc0Var.setAccessibilityTraversalBefore(i13);
                }
            }
            cc0Var.setId(iArr[i10]);
            cc0Var.setOnClickListener(new View.OnClickListener(this) {
                public final fc0 f40032b;

                {
                    this.f40032b = this;
                }

                @Override
                public final void onClick(View view2) {
                    fc0 fc0Var;
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    int i122;
                    boolean z9;
                    LinkedList linkedList3;
                    int i132;
                    int i14;
                    fc0 fc0Var2;
                    boolean z10;
                    boolean z11;
                    int i15 = r2;
                    fc0 fc0Var3 = this.f40032b;
                    switch (i15) {
                        case 0:
                            fc0Var3.n(false);
                            return;
                        case 1:
                            fc0Var3.c();
                            return;
                        default:
                            LinkedList linkedList4 = fc0Var3.V;
                            LinkedList linkedList5 = fc0Var3.U;
                            fi.a8 a8Var2 = fc0Var3.f33633s;
                            if (fc0Var3.f33628f0 && !fc0Var3.P) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        fc0Var = fc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("0");
                                        z9 = i122;
                                        break;
                                    case 1:
                                        fc0Var = fc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("1");
                                        z9 = i122;
                                        break;
                                    case 2:
                                        fc0Var = fc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("2");
                                        z9 = i122;
                                        break;
                                    case 3:
                                        fc0Var = fc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("3");
                                        z9 = i122;
                                        break;
                                    case 4:
                                        fc0Var = fc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("4");
                                        z9 = i122;
                                        break;
                                    case 5:
                                        fc0Var = fc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("5");
                                        z9 = i122;
                                        break;
                                    case 6:
                                        fc0Var = fc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("6");
                                        z9 = i122;
                                        break;
                                    case 7:
                                        fc0Var = fc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("7");
                                        z9 = i122;
                                        break;
                                    case 8:
                                        fc0Var = fc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("8");
                                        z9 = i122;
                                        break;
                                    case 9:
                                        fc0Var = fc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        a8Var2.b("9");
                                        z9 = i122;
                                        break;
                                    case 10:
                                        fc0Var = fc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        fc0Var.c();
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
                                            fc0Var = fc0Var3;
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
                                                fc0 fc0Var4 = fc0Var3;
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
                                                fc0Var3 = fc0Var4;
                                                i16 = 1;
                                            }
                                            fc0Var = fc0Var3;
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
                                            ((AnimatorSet) a8Var2.f11614e).addListener(new ac0(a8Var2, 1));
                                            ((AnimatorSet) a8Var2.f11614e).start();
                                            fc0.a((fc0) a8Var2.h);
                                            z9 = true;
                                            break;
                                        }
                                    default:
                                        fc0Var = fc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        z9 = i122;
                                        break;
                                }
                                if (intValue == 11) {
                                    fc0Var2 = fc0Var;
                                } else {
                                    fc0Var2 = fc0Var;
                                    Drawable drawable = fc0Var2.f33618a;
                                    if (drawable instanceof ra0) {
                                        ra0 ra0Var = (ra0) drawable;
                                        ra0Var.D = null;
                                        ra0Var.y();
                                        float f10 = ra0Var.h;
                                        if (intValue == 10) {
                                            if (z9) {
                                                ra0Var.x();
                                                z11 = true;
                                            } else {
                                                z11 = i122;
                                            }
                                            z10 = i122;
                                        } else {
                                            z10 = true;
                                            ra0Var.w(true);
                                            z11 = true;
                                        }
                                        if (z11) {
                                            if (f10 >= 1.0f) {
                                                fc0Var2.b(ra0Var);
                                            } else {
                                                bi.u7 u7Var = new bi.u7(fc0Var2, z10, ra0Var, 22);
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
                                    fc0Var2.n(i122);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
            this.f33627f.add(cc0Var);
            i10++;
        }
        for (i7 = 11; i7 >= 0; i7--) {
            this.f33625e.addView((FrameLayout) this.f33627f.get(i7), c8.ha.e(60, 60, 51));
        }
        d();
    }

    public static void a(fc0 fc0Var) {
        boolean z9;
        float f10;
        float f11;
        FrameLayout frameLayout = fc0Var.f33620b;
        fi.a8 a8Var = fc0Var.f33633s;
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

    public final void b(ra0 ra0Var) {
        r1.g gVar = this.T;
        if (gVar != null && gVar.f54274f) {
            gVar.d();
        }
        r1.f fVar = new r1.f(0.0f);
        ra0Var.D = new bx(fVar, 9);
        ra0Var.y();
        r1.g gVar2 = new r1.g(fVar);
        gVar2.f54280m = org.telegram.ui.Cells.f1.o(100.0f, 300.0f, 1.0f);
        this.T = gVar2;
        gVar2.a(new hi.y3(4, this, ra0Var));
        this.T.b(new e7(ra0Var, 5));
        this.T.h();
    }

    public final void c() {
        Activity W;
        hc0 hc0Var;
        if (!this.P && (W = org.telegram.messenger.g0.W(getContext())) != null && this.f33631n.getVisibility() == 0 && !org.telegram.messenger.t0.f25574x) {
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                ArrayList arrayList = launchActivity.f41308z0;
                if (arrayList.isEmpty() && (hc0Var = launchActivity.f41306y0) != null) {
                    if (this != hc0Var.f34275b) {
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
                    nVar.f19921b = org.telegram.messenger.id.M0(2131743850, null);
                    nVar.d = org.telegram.messenger.id.M0(2131743792, null);
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
        cc0 cc0Var = this.f33631n;
        cc0Var.setVisibility(i7);
        if (org.telegram.messenger.iz.f23431r == 1) {
            this.E.setVisibility(cc0Var.getVisibility());
        }
        if (org.telegram.messenger.iz.f23431r == 1) {
            i10 = 2131751116;
        } else if (g10) {
            i10 = 2131751117;
        } else {
            i10 = 2131751118;
        }
        this.f33622c.setText(org.telegram.messenger.id.M0(i10, null));
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
        EditTextBoldCursor editTextBoldCursor = this.f33632r;
        FrameLayout frameLayout = this.h;
        et etVar = this.f33623c0;
        TextView textView = this.f33636y;
        if (i7 > 0) {
            int max = Math.max(1, (int) Math.ceil(j10 / 1000.0d));
            if (max != this.f33624d0) {
                textView.setText(org.telegram.messenger.id.a0(null, null, 2131744036, org.telegram.messenger.id.G(max, "Seconds", new Object[0])));
                this.f33624d0 = max;
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

    public final ec0 f(cc0 cc0Var) {
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
        fh.g c10 = this.I.c(cc0Var, eVar, true);
        c10.r(org.telegram.messenger.g0.L(30.0f));
        return new ec0(c10);
    }

    public final boolean g() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fc0.g():boolean");
    }

    public final boolean i() {
        fi.q3 q3Var = this.f33626e0;
        if (q3Var != null && q3Var.c()) {
            org.telegram.messenger.g0.v1(this.f33632r);
            return false;
        }
        return true;
    }

    public final void k() {
        org.telegram.messenger.g0.r(this.f33623c0);
    }

    public final void l() {
        if (!this.P) {
            e();
            if (this.f33636y.getVisibility() != 0) {
                if (org.telegram.messenger.iz.f23431r == 1) {
                    EditTextBoldCursor editTextBoldCursor = this.f33632r;
                    if (editTextBoldCursor != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(editTextBoldCursor);
                    }
                    org.telegram.messenger.g0.i3(new ub0(this, 0), 200L);
                }
                c();
            }
        }
    }

    public final void m(boolean z9, int i7, int i10, org.telegram.ui.s10 s10Var) {
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
        TextView textView = this.f33636y;
        EditTextBoldCursor editTextBoldCursor = this.f33632r;
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
        this.f33618a = null;
        boolean z11 = org.telegram.ui.ActionBar.l6.s0() instanceof ra0;
        bi.x5 x5Var = this.f33634w;
        if (z11) {
            z10 = !org.telegram.ui.ActionBar.l6.I.q();
            this.f33618a = org.telegram.ui.ActionBar.l6.s0();
            x5Var.setBackgroundColor(-1090519040);
        } else {
            if (org.telegram.ui.ActionBar.l6.W && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.l6.K0()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.l6.K0())) {
                org.telegram.ui.ActionBar.d6 d6Var = org.telegram.ui.ActionBar.l6.I.f27749i0;
                if (d6Var != null && (i11 = d6Var.d) != 0 && (i12 = d6Var.f27431e) != 0) {
                    k9Var = new k9(k9.d(d6Var.h), new int[]{i11, i12});
                } else {
                    k9Var = null;
                }
                this.f33618a = k9Var;
                if (k9Var == null) {
                    this.f33618a = org.telegram.ui.ActionBar.l6.s0();
                }
                if (this.f33618a instanceof k9) {
                    x5Var.setBackgroundColor(570425344);
                } else {
                    x5Var.setBackgroundColor(-1090519040);
                }
            } else {
                if (!"d".equals(org.telegram.ui.ActionBar.l6.K0())) {
                    String K0 = org.telegram.ui.ActionBar.l6.K0();
                    if (!org.telegram.ui.ActionBar.l6.f27969j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(K0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(K0)) {
                        Drawable s02 = org.telegram.ui.ActionBar.l6.s0();
                        this.f33618a = s02;
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
        Drawable drawable = this.f33618a;
        if (drawable instanceof ra0) {
            ra0 ra0Var = (ra0) drawable;
            int[] iArr = ra0Var.f37612a;
            if (z10) {
                int[] iArr2 = new int[iArr.length];
                for (int i14 = 0; i14 < iArr.length; i14++) {
                    iArr2[i14] = org.telegram.ui.ActionBar.l6.b(0.14f, 0.0f, iArr[i14]);
                }
                iArr = iArr2;
            }
            this.f33618a = new ra0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (ra0Var.f37634u != null && ra0Var.f37630q < 0) {
                x5Var.setBackgroundColor(2130706432);
            } else {
                x5Var.setBackgroundColor(570425344);
            }
            ((ra0) this.f33618a).q(x5Var);
        }
        this.f33635x.setText(org.telegram.messenger.id.M0(2131754232, null));
        int i15 = org.telegram.messenger.iz.f23431r;
        ImageView imageView = this.E;
        ImageView imageView2 = this.D;
        di.b4 b4Var = this.f33625e;
        fi.a8 a8Var = this.f33633s;
        if (i15 == 0) {
            if (textView.getVisibility() != 0) {
                b4Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            a8Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i15 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            b4Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            a8Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.f33631n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        fi.a8.a(a8Var, false);
        if (z9) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new zb0(this, i7, i10, s10Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.f33619a0 = 1.0f;
            h(1.0f);
            dh0 dh0Var = this.M;
            dh0Var.setScaleX(1.0f);
            dh0Var.setScaleY(1.0f);
            dh0Var.i();
            dh0Var.getAnimatedDrawable().N(38, false, false);
            if (s10Var != null) {
                s10Var.run();
            }
        }
        setOnTouchListener(new ei.b(19));
    }

    public final void n(boolean z9) {
        String str;
        if (!this.P && getVisibility() == 0) {
            EditTextBoldCursor editTextBoldCursor = this.f33632r;
            if (!z9) {
                if (org.telegram.messenger.iz.f23437t <= 0) {
                    int i7 = org.telegram.messenger.iz.f23431r;
                    fi.a8 a8Var = this.f33633s;
                    if (i7 == 0) {
                        str = ((StringBuilder) a8Var.d).toString();
                    } else if (i7 != 1) {
                        str = "";
                    } else {
                        str = editTextBoldCursor.getText().toString();
                    }
                    int length = str.length();
                    FrameLayout frameLayout = this.f33620b;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.NOTIFICATION_ERROR;
                    if (length == 0) {
                        p2Var.a();
                        int i10 = -this.f33621b0;
                        this.f33621b0 = i10;
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
                        int i11 = -this.f33621b0;
                        this.f33621b0 = i11;
                        org.telegram.messenger.g0.G3(i11, frameLayout, null);
                        Drawable drawable = this.f33618a;
                        if (drawable instanceof ra0) {
                            ra0 ra0Var = (ra0) drawable;
                            LinkedList linkedList = this.U;
                            linkedList.clear();
                            LinkedList linkedList2 = this.V;
                            linkedList2.clear();
                            r1.g gVar = this.T;
                            if (gVar != null && gVar.f54274f) {
                                linkedList.offer(new qa0(ra0Var, 1));
                                linkedList2.offer(Boolean.FALSE);
                                return;
                            }
                            ra0Var.m(true);
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
            dc0 dc0Var = this.O;
            if (dc0Var != null) {
                dc0Var.p(this);
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
            dh0 dh0Var = this.M;
            dh0Var.getAnimatedDrawable().P(71);
            dh0Var.getAnimatedDrawable().N(37, false, false);
            dh0Var.d();
            org.telegram.messenger.g0.h3(new ub0(this, 1));
        }
    }

    public final void o(boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.f33629g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f33628f0 = z9;
        float alpha = this.f33625e.getAlpha();
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
        this.f33629g0 = ofFloat;
        ofFloat.addUpdateListener(new vb0(this, 0));
        this.f33629g0.addListener(new t9(16, this, z9));
        this.f33629g0.setInterpolator(xq.h);
        this.f33629g0.setDuration(320L);
        this.f33629g0.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.Q1);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25046o0);
        if (this.f33626e0 == null && (getParent() instanceof View)) {
            this.f33626e0 = new fi.q3((View) getParent(), false, new s2(this, 8));
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
        TextView textView = this.f33635x;
        int[] iArr = this.f33630h0;
        textView.getLocationInWindow(iArr);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        dh0 dh0Var = this.M;
        if (!Q1 && getContext().getResources().getConfiguration().orientation == 2) {
            int L = iArr[1] - org.telegram.messenger.g0.L(100.0f);
            this.L = L;
            dh0Var.setTranslationY(L);
            return;
        }
        int L2 = iArr[1] - org.telegram.messenger.g0.L(100.0f);
        this.L = L2;
        dh0Var.setTranslationY(L2);
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
        dh0 dh0Var = this.M;
        di.b4 b4Var = this.f33625e;
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
            dh0Var.setTranslationX((f12 / f11) - org.telegram.messenger.g0.L(29.0f));
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
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) b4Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.g0.L(82.0f);
            layoutParams3.width = (Math.max(0, 2) * L) + (L3 * 3);
            layoutParams3.gravity = 17;
            b4Var.setLayoutParams(layoutParams3);
            i13 = 0;
        } else {
            dh0Var.setTranslationX((size / 2.0f) - org.telegram.messenger.g0.L(29.0f));
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
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) b4Var.getLayoutParams();
            i13 = 0;
            layoutParams5.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.g0.L(82.0f);
            layoutParams5.width = (Math.max(0, 2) * L) + (L3 * 3);
            if (org.telegram.messenger.g0.Q1()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            b4Var.setLayoutParams(layoutParams5);
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
            FrameLayout frameLayout3 = (FrameLayout) this.f33627f.get(i23);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((L3 + L2) * (i24 / 3)) + L4;
            layoutParams7.leftMargin = (L3 + L) * (i24 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
        }
        super.onMeasure(i7, i10);
    }

    public void setDelegate(dc0 dc0Var) {
        this.O = dc0Var;
    }

    public void h(float f10) {
    }

    public void j() {
    }
}
