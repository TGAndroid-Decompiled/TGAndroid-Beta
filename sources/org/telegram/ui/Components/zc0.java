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
public class zc0 extends FrameLayout implements org.telegram.messenger.vs {
    public static final int[] f33101i0 = {2131296592, 2131296593, 2131296594, 2131296595, 2131296596, 2131296597, 2131296598, 2131296599, 2131296600, 2131296601, 2131296602, 2131296604};
    public final ImageView D;
    public final ImageView E;
    public final View F;
    public int G;
    public final hi.b H;
    public final tg.b I;
    public Bitmap J;
    public Canvas K;
    public int L;
    public final fi0 M;
    public final Rect N;
    public xc0 O;
    public boolean P;
    public AnimatorSet Q;
    public AnimatorSet R;
    public ValueAnimator S;
    public o1.j T;
    public final LinkedList U;
    public final LinkedList V;
    public final ArrayList W;
    public Drawable f33102a;
    public float f33103a0;
    public final FrameLayout f33104b;
    public int f33105b0;
    public final TextView f33106c;
    public final ew f33107c0;
    public final FrameLayout d;
    public int f33108d0;
    public final org.telegram.ui.Cells.a5 e;
    public vh.r2 f33109e0;
    public final ArrayList f33110f;
    public boolean f33111f0;
    public ValueAnimator f33112g0;
    public final FrameLayout h;
    public final int[] f33113h0;
    public final wc0 f33114n;
    public final EditTextBoldCursor f33115r;
    public final uc0 f33116s;
    public final fg.i f33117w;
    public final TextView f33118x;
    public final TextView f33119y;

    public zc0(Context context) {
        super(context);
        int i10;
        String L0 = org.telegram.messenger.dd.L0(2131743875, null);
        int i11 = 0;
        this.G = 0;
        hi.b bVar = new hi.b();
        this.H = bVar;
        tg.b bVar2 = new tg.b(bVar, bVar, bVar);
        this.I = bVar2;
        je.b bVar3 = new je.b();
        this.N = new Rect();
        this.U = new LinkedList();
        this.V = new LinkedList();
        this.W = new ArrayList();
        this.f33105b0 = -12;
        this.f33107c0 = new ew(this, 6);
        this.f33111f0 = true;
        this.f33113h0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        fg.i iVar = new fg.i(this, context);
        this.f33117w = iVar;
        iVar.setWillNotDraw(false);
        addView(iVar, w7.b6.c(-1.0f, -1));
        bVar2.h = new zg.h(iVar);
        bVar2.f48713i = iVar;
        bVar2.f48712g = bVar3;
        ?? imageView = new ImageView(context);
        this.M = imageView;
        imageView.f(2131624109, 58, 58, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, w7.b6.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        iVar.addView(frameLayout, w7.b6.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f33118x = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setAlpha(0.0f);
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, w7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.f33119y = l4;
        l4.setTextColor(-1);
        l4.setTextSize(1, 15.0f);
        l4.setGravity(1);
        l4.setVisibility(4);
        iVar.addView(l4, w7.b6.e(-2, -2, 17));
        uc0 uc0Var = new uc0(this, context);
        this.f33116s = uc0Var;
        frameLayout.addView(uc0Var, w7.b6.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f33115r = editTextBoldCursor;
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
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(32.0f));
        frameLayout.addView(editTextBoldCursor, w7.b6.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new t0(this, 4));
        editTextBoldCursor.addTextChangedListener(new ag.a1(this, 16));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new bi.i1(1));
        ImageView imageView2 = new ImageView(context);
        this.D = imageView2;
        imageView2.setImageResource(2131232511);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(2131230881);
        frameLayout.addView(imageView2, w7.b6.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView2.setContentDescription(org.telegram.messenger.dd.L0(2131751355, null));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final zc0 f29092b;

            {
                this.f29092b = this;
            }

            @Override
            public final void onClick(View view) {
                zc0 zc0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                int i12;
                boolean z10;
                LinkedList linkedList3;
                int i13;
                int i14;
                zc0 zc0Var2;
                boolean z11;
                boolean z12;
                int i15 = r2;
                zc0 zc0Var3 = this.f29092b;
                switch (i15) {
                    case 0:
                        zc0Var3.n(false);
                        return;
                    case 1:
                        zc0Var3.c();
                        return;
                    default:
                        LinkedList linkedList4 = zc0Var3.V;
                        LinkedList linkedList5 = zc0Var3.U;
                        uc0 uc0Var2 = zc0Var3.f33116s;
                        if (zc0Var3.f33111f0 && !zc0Var3.P) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("0");
                                    z10 = i12;
                                    break;
                                case 1:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("1");
                                    z10 = i12;
                                    break;
                                case 2:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("2");
                                    z10 = i12;
                                    break;
                                case 3:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("3");
                                    z10 = i12;
                                    break;
                                case 4:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("4");
                                    z10 = i12;
                                    break;
                                case 5:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("5");
                                    z10 = i12;
                                    break;
                                case 6:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("6");
                                    z10 = i12;
                                    break;
                                case 7:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("7");
                                    z10 = i12;
                                    break;
                                case 8:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("8");
                                    z10 = i12;
                                    break;
                                case 9:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("9");
                                    z10 = i12;
                                    break;
                                case 10:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    zc0Var.c();
                                    z10 = i12;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) uc0Var2.f30938c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    i12 = false;
                                    ArrayList arrayList2 = (ArrayList) uc0Var2.f30937b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) uc0Var2.d;
                                    if (sb2.length() == 0) {
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = i12;
                                        break;
                                    } else {
                                        try {
                                            uc0Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
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
                                            zc0 zc0Var4 = zc0Var3;
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
                                                fArr5[0] = uc0Var2.c(i17);
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
                                                fArr10[0] = uc0Var2.c(i17);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i14 = i17;
                                            }
                                            i17 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            zc0Var3 = zc0Var4;
                                            i16 = 1;
                                        }
                                        zc0Var = zc0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), property5, uc0Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), property5, uc0Var2.c(i18)));
                                        }
                                        le leVar = (le) uc0Var2.f30939f;
                                        if (leVar != null) {
                                            org.telegram.messenger.i0.r(leVar);
                                            uc0Var2.f30939f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) uc0Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        uc0Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) uc0Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) uc0Var2.e).addListener(new tc0(uc0Var2, 1));
                                        ((AnimatorSet) uc0Var2.e).start();
                                        zc0.a((zc0) uc0Var2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    z10 = i12;
                                    break;
                            }
                            if (intValue == 11) {
                                zc0Var2 = zc0Var;
                            } else {
                                zc0Var2 = zc0Var;
                                Drawable drawable = zc0Var2.f33102a;
                                if (drawable instanceof jb0) {
                                    jb0 jb0Var = (jb0) drawable;
                                    jb0Var.D = null;
                                    jb0Var.y();
                                    float f7 = jb0Var.h;
                                    if (intValue == 10) {
                                        if (z10) {
                                            jb0Var.x();
                                            z12 = true;
                                        } else {
                                            z12 = i12;
                                        }
                                        z11 = i12;
                                    } else {
                                        z11 = true;
                                        jb0Var.w(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f7 >= 1.0f) {
                                            zc0Var2.b(jb0Var);
                                        } else {
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(new ag.j0(zc0Var2, z11, jb0Var, 19));
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z11));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i19 = i12; i19 < linkedList6.size(); i19++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i19);
                                                Boolean bool = (Boolean) linkedList7.get(i19);
                                                if (bool != null && bool.booleanValue() != z11) {
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
                                            Collections.sort(arrayList5, new org.telegram.ui.f6(13));
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
                            if (((StringBuilder) uc0Var2.d).length() == 4) {
                                zc0Var2.n(i12);
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
        frameLayout.addView(imageView3, w7.b6.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView3.setContentDescription(org.telegram.messenger.dd.L0(2131754881, null));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final zc0 f29092b;

            {
                this.f29092b = this;
            }

            @Override
            public final void onClick(View view) {
                zc0 zc0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                int i12;
                boolean z10;
                LinkedList linkedList3;
                int i13;
                int i14;
                zc0 zc0Var2;
                boolean z11;
                boolean z12;
                int i15 = r2;
                zc0 zc0Var3 = this.f29092b;
                switch (i15) {
                    case 0:
                        zc0Var3.n(false);
                        return;
                    case 1:
                        zc0Var3.c();
                        return;
                    default:
                        LinkedList linkedList4 = zc0Var3.V;
                        LinkedList linkedList5 = zc0Var3.U;
                        uc0 uc0Var2 = zc0Var3.f33116s;
                        if (zc0Var3.f33111f0 && !zc0Var3.P) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("0");
                                    z10 = i12;
                                    break;
                                case 1:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("1");
                                    z10 = i12;
                                    break;
                                case 2:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("2");
                                    z10 = i12;
                                    break;
                                case 3:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("3");
                                    z10 = i12;
                                    break;
                                case 4:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("4");
                                    z10 = i12;
                                    break;
                                case 5:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("5");
                                    z10 = i12;
                                    break;
                                case 6:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("6");
                                    z10 = i12;
                                    break;
                                case 7:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("7");
                                    z10 = i12;
                                    break;
                                case 8:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("8");
                                    z10 = i12;
                                    break;
                                case 9:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    uc0Var2.b("9");
                                    z10 = i12;
                                    break;
                                case 10:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    zc0Var.c();
                                    z10 = i12;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) uc0Var2.f30938c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    i12 = false;
                                    ArrayList arrayList2 = (ArrayList) uc0Var2.f30937b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) uc0Var2.d;
                                    if (sb2.length() == 0) {
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = i12;
                                        break;
                                    } else {
                                        try {
                                            uc0Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
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
                                            zc0 zc0Var4 = zc0Var3;
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
                                                fArr5[0] = uc0Var2.c(i17);
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
                                                fArr10[0] = uc0Var2.c(i17);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i14 = i17;
                                            }
                                            i17 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            zc0Var3 = zc0Var4;
                                            i16 = 1;
                                        }
                                        zc0Var = zc0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), property5, uc0Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), property5, uc0Var2.c(i18)));
                                        }
                                        le leVar = (le) uc0Var2.f30939f;
                                        if (leVar != null) {
                                            org.telegram.messenger.i0.r(leVar);
                                            uc0Var2.f30939f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) uc0Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        uc0Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) uc0Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) uc0Var2.e).addListener(new tc0(uc0Var2, 1));
                                        ((AnimatorSet) uc0Var2.e).start();
                                        zc0.a((zc0) uc0Var2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    z10 = i12;
                                    break;
                            }
                            if (intValue == 11) {
                                zc0Var2 = zc0Var;
                            } else {
                                zc0Var2 = zc0Var;
                                Drawable drawable = zc0Var2.f33102a;
                                if (drawable instanceof jb0) {
                                    jb0 jb0Var = (jb0) drawable;
                                    jb0Var.D = null;
                                    jb0Var.y();
                                    float f7 = jb0Var.h;
                                    if (intValue == 10) {
                                        if (z10) {
                                            jb0Var.x();
                                            z12 = true;
                                        } else {
                                            z12 = i12;
                                        }
                                        z11 = i12;
                                    } else {
                                        z11 = true;
                                        jb0Var.w(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f7 >= 1.0f) {
                                            zc0Var2.b(jb0Var);
                                        } else {
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(new ag.j0(zc0Var2, z11, jb0Var, 19));
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z11));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i19 = i12; i19 < linkedList6.size(); i19++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i19);
                                                Boolean bool = (Boolean) linkedList7.get(i19);
                                                if (bool != null && bool.booleanValue() != z11) {
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
                                            Collections.sort(arrayList5, new org.telegram.ui.f6(13));
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
                            if (((StringBuilder) uc0Var2.d).length() == 4) {
                                zc0Var2.n(i12);
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
        frameLayout.addView(view, w7.b6.a(-1.0f, 1.0f / org.telegram.messenger.i0.f16171p, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        iVar.addView(frameLayout2, w7.b6.e(-1, -1, 51));
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(context, 20);
        this.e = a5Var;
        a5Var.setClipChildren(false);
        frameLayout2.addView(a5Var, w7.b6.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f33104b = frameLayout3;
        a5Var.addView(frameLayout3, w7.b6.e(-2, -2, 49));
        TextView g10 = org.telegram.messenger.m5.g(context, 1, 15.0f);
        g10.setTypeface(org.telegram.messenger.i0.o());
        g10.setTextColor(-1);
        g10.setText(L0);
        TextView l10 = org.telegram.ui.Cells.f1.l(frameLayout3, g10, w7.b6.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.f33106c = l10;
        l10.setTextSize(1, 14.0f);
        l10.setTextColor(-1);
        l10.setText((CharSequence) null);
        frameLayout3.addView(l10, w7.b6.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f33110f = new ArrayList(10);
        while (true) {
            if (i11 >= 12) {
                break;
            }
            wc0 wc0Var = new wc0(context);
            w7.e6.b(wc0Var, 0.15f, 1.5f);
            wc0Var.setTag(Integer.valueOf(i11));
            int[] iArr = f33101i0;
            if (i11 == 11) {
                wc0Var.setBackground(f(wc0Var));
                int L = org.telegram.messenger.i0.L(30.0f);
                wc0Var.setForeground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, 654311423, 654311423));
                wc0Var.setImage(2131231101);
                wc0Var.setOnLongClickListener(new r00(this, 1));
                wc0Var.setContentDescription(org.telegram.messenger.dd.L0(2131754920, null));
                wc0Var.setNextFocusForwardId(2131296592);
                wc0Var.setAccessibilityTraversalBefore(2131296592);
            } else if (i11 == 10) {
                this.f33114n = wc0Var;
                wc0Var.setBackground(f(wc0Var));
                int L2 = org.telegram.messenger.i0.L(30.0f);
                wc0Var.setForeground(org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, 0, 654311423, 654311423));
                wc0Var.setContentDescription(org.telegram.messenger.dd.L0(2131754881, null));
                wc0Var.setImage(2131231189);
                wc0Var.setNextFocusForwardId(2131296593);
                wc0Var.setAccessibilityTraversalBefore(2131296593);
            } else {
                wc0Var.setBackground(f(wc0Var));
                int L3 = org.telegram.messenger.i0.L(30.0f);
                wc0Var.setForeground(org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, 0, 654311423, 654311423));
                wc0Var.setContentDescription(i11 + "");
                wc0Var.setNum(i11);
                if (i11 == 0) {
                    wc0Var.setNextFocusForwardId(2131296602);
                    wc0Var.setAccessibilityTraversalBefore(2131296602);
                } else if (i11 == 9) {
                    if (g()) {
                        wc0Var.setNextFocusForwardId(2131296604);
                        wc0Var.setAccessibilityTraversalBefore(2131296604);
                    } else {
                        wc0Var.setNextFocusForwardId(2131296592);
                        wc0Var.setAccessibilityTraversalBefore(2131296592);
                    }
                } else {
                    int i12 = iArr[i11 + 1];
                    wc0Var.setNextFocusForwardId(i12);
                    wc0Var.setAccessibilityTraversalBefore(i12);
                }
            }
            wc0Var.setId(iArr[i11]);
            wc0Var.setOnClickListener(new View.OnClickListener(this) {
                public final zc0 f29092b;

                {
                    this.f29092b = this;
                }

                @Override
                public final void onClick(View view2) {
                    zc0 zc0Var;
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    int i122;
                    boolean z10;
                    LinkedList linkedList3;
                    int i13;
                    int i14;
                    zc0 zc0Var2;
                    boolean z11;
                    boolean z12;
                    int i15 = r2;
                    zc0 zc0Var3 = this.f29092b;
                    switch (i15) {
                        case 0:
                            zc0Var3.n(false);
                            return;
                        case 1:
                            zc0Var3.c();
                            return;
                        default:
                            LinkedList linkedList4 = zc0Var3.V;
                            LinkedList linkedList5 = zc0Var3.U;
                            uc0 uc0Var2 = zc0Var3.f33116s;
                            if (zc0Var3.f33111f0 && !zc0Var3.P) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        uc0Var2.b("0");
                                        z10 = i122;
                                        break;
                                    case 1:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        uc0Var2.b("1");
                                        z10 = i122;
                                        break;
                                    case 2:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        uc0Var2.b("2");
                                        z10 = i122;
                                        break;
                                    case 3:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        uc0Var2.b("3");
                                        z10 = i122;
                                        break;
                                    case 4:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        uc0Var2.b("4");
                                        z10 = i122;
                                        break;
                                    case 5:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        uc0Var2.b("5");
                                        z10 = i122;
                                        break;
                                    case 6:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        uc0Var2.b("6");
                                        z10 = i122;
                                        break;
                                    case 7:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        uc0Var2.b("7");
                                        z10 = i122;
                                        break;
                                    case 8:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        uc0Var2.b("8");
                                        z10 = i122;
                                        break;
                                    case 9:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        uc0Var2.b("9");
                                        z10 = i122;
                                        break;
                                    case 10:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        zc0Var.c();
                                        z10 = i122;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) uc0Var2.f30938c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        i122 = false;
                                        ArrayList arrayList2 = (ArrayList) uc0Var2.f30937b;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb2 = (StringBuilder) uc0Var2.d;
                                        if (sb2.length() == 0) {
                                            zc0Var = zc0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = i122;
                                            break;
                                        } else {
                                            try {
                                                uc0Var2.performHapticFeedback(3);
                                            } catch (Exception e) {
                                                org.telegram.messenger.f8.g(e, true);
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
                                                zc0 zc0Var4 = zc0Var3;
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
                                                    fArr5[0] = uc0Var2.c(i17);
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
                                                    fArr10[0] = uc0Var2.c(i17);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                                } else {
                                                    i14 = i17;
                                                }
                                                i17 = i14 + 1;
                                                linkedList5 = linkedList3;
                                                zc0Var3 = zc0Var4;
                                                i16 = 1;
                                            }
                                            zc0Var = zc0Var3;
                                            linkedList2 = linkedList5;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i18 = 0; i18 < length; i18++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), property5, uc0Var2.c(i18)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), property5, uc0Var2.c(i18)));
                                            }
                                            le leVar = (le) uc0Var2.f30939f;
                                            if (leVar != null) {
                                                org.telegram.messenger.i0.r(leVar);
                                                uc0Var2.f30939f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) uc0Var2.e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            uc0Var2.e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) uc0Var2.e).playTogether(arrayList3);
                                            ((AnimatorSet) uc0Var2.e).addListener(new tc0(uc0Var2, 1));
                                            ((AnimatorSet) uc0Var2.e).start();
                                            zc0.a((zc0) uc0Var2.h);
                                            z10 = true;
                                            break;
                                        }
                                    default:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        z10 = i122;
                                        break;
                                }
                                if (intValue == 11) {
                                    zc0Var2 = zc0Var;
                                } else {
                                    zc0Var2 = zc0Var;
                                    Drawable drawable = zc0Var2.f33102a;
                                    if (drawable instanceof jb0) {
                                        jb0 jb0Var = (jb0) drawable;
                                        jb0Var.D = null;
                                        jb0Var.y();
                                        float f7 = jb0Var.h;
                                        if (intValue == 10) {
                                            if (z10) {
                                                jb0Var.x();
                                                z12 = true;
                                            } else {
                                                z12 = i122;
                                            }
                                            z11 = i122;
                                        } else {
                                            z11 = true;
                                            jb0Var.w(true);
                                            z12 = true;
                                        }
                                        if (z12) {
                                            if (f7 >= 1.0f) {
                                                zc0Var2.b(jb0Var);
                                            } else {
                                                LinkedList linkedList6 = linkedList2;
                                                linkedList6.offer(new ag.j0(zc0Var2, z11, jb0Var, 19));
                                                LinkedList linkedList7 = linkedList;
                                                linkedList7.offer(Boolean.valueOf(z11));
                                                ArrayList arrayList4 = new ArrayList();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (int i19 = i122; i19 < linkedList6.size(); i19++) {
                                                    Runnable runnable = (Runnable) linkedList6.get(i19);
                                                    Boolean bool = (Boolean) linkedList7.get(i19);
                                                    if (bool != null && bool.booleanValue() != z11) {
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
                                                Collections.sort(arrayList5, new org.telegram.ui.f6(13));
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
                                if (((StringBuilder) uc0Var2.d).length() == 4) {
                                    zc0Var2.n(i122);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
            this.f33110f.add(wc0Var);
            i11++;
        }
        for (i10 = 11; i10 >= 0; i10--) {
            this.e.addView((FrameLayout) this.f33110f.get(i10), w7.b6.e(60, 60, 51));
        }
        d();
    }

    public static void a(zc0 zc0Var) {
        boolean z10;
        float f7;
        float f10;
        FrameLayout frameLayout = zc0Var.f33104b;
        uc0 uc0Var = zc0Var.f33116s;
        if (uc0Var != null && ((StringBuilder) uc0Var.d).length() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            ViewPropertyAnimator animate = frameLayout.animate();
            float f11 = 1.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (z10) {
                f10 = 0.8f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (z10) {
                f11 = 0.8f;
            }
            org.telegram.messenger.a30.m(scaleX.scaleY(f11), gr.h, 320L);
        }
    }

    public final void b(jb0 jb0Var) {
        o1.j jVar = this.T;
        if (jVar != null && jVar.f13952f) {
            jVar.d();
        }
        o1.i iVar = new o1.i(0.0f);
        jb0Var.D = new px(iVar, 9);
        jb0Var.y();
        o1.j jVar2 = new o1.j(iVar);
        jVar2.f13958m = org.telegram.ui.Cells.f1.p(100.0f, 300.0f, 1.0f);
        this.T = jVar2;
        jVar2.a(new za(3, this, jb0Var));
        this.T.b(new a7(jb0Var, 5));
        this.T.h();
    }

    public final void c() {
        Activity W;
        bd0 bd0Var;
        if (!this.P && (W = org.telegram.messenger.i0.W(getContext())) != null && this.f33114n.getVisibility() == 0 && !org.telegram.messenger.w0.f18952x) {
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                ArrayList arrayList = launchActivity.B0;
                if (arrayList.isEmpty() && (bd0Var = launchActivity.A0) != null) {
                    if (this != bd0Var.f24711b) {
                        return;
                    }
                } else if (i0.a.g(1, arrayList) != this) {
                    return;
                }
            }
            try {
                if (new android.support.v4.media.session.a0(new androidx.biometric.s(getContext(), 0)).h(15) == 0 && org.telegram.messenger.d6.h() && !org.telegram.messenger.d6.a()) {
                    k6.h hVar = new k6.h(LaunchActivity.I1, f0.c.d(getContext()), new pc0(this, 0));
                    j6.m mVar = new j6.m(1);
                    mVar.f9700b = org.telegram.messenger.dd.L0(2131743875, null);
                    mVar.d = org.telegram.messenger.dd.L0(2131743818, null);
                    mVar.f9699a = 15;
                    hVar.a(mVar.c(), null);
                    o(false);
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void d() {
        int i10;
        int i11;
        boolean g10 = g();
        if (g10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        wc0 wc0Var = this.f33114n;
        wc0Var.setVisibility(i10);
        if (org.telegram.messenger.uz.f18546r == 1) {
            this.E.setVisibility(wc0Var.getVisibility());
        }
        if (org.telegram.messenger.uz.f18546r == 1) {
            i11 = 2131751117;
        } else if (g10) {
            i11 = 2131751118;
        } else {
            i11 = 2131751119;
        }
        this.f33106c.setText(org.telegram.messenger.dd.L0(i11, null));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.Q1) {
            d();
            if (((Boolean) objArr[0]).booleanValue() && org.telegram.messenger.uz.f18563x) {
                c();
            }
        } else if (i10 == org.telegram.messenger.at.f14755o0 && objArr[0] != this) {
            setVisibility(8);
        }
    }

    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > org.telegram.messenger.uz.f18555u) {
            long j10 = org.telegram.messenger.uz.f18552t - (elapsedRealtime - org.telegram.messenger.uz.f18555u);
            org.telegram.messenger.uz.f18552t = j10;
            if (j10 < 0) {
                org.telegram.messenger.uz.f18552t = 0L;
            }
        }
        org.telegram.messenger.uz.f18555u = elapsedRealtime;
        org.telegram.messenger.uz.y();
        long j11 = org.telegram.messenger.uz.f18552t;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        EditTextBoldCursor editTextBoldCursor = this.f33115r;
        FrameLayout frameLayout = this.h;
        ew ewVar = this.f33107c0;
        TextView textView = this.f33119y;
        if (i10 > 0) {
            int max = Math.max(1, (int) Math.ceil(j11 / 1000.0d));
            if (max != this.f33108d0) {
                textView.setText(org.telegram.messenger.dd.a0(null, null, 2131744061, org.telegram.messenger.dd.G(max, "Seconds", new Object[0])));
                this.f33108d0 = max;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                frameLayout.setVisibility(4);
                o(false);
                org.telegram.messenger.i0.v1(editTextBoldCursor);
            }
            org.telegram.messenger.i0.r(ewVar);
            org.telegram.messenger.i0.h3(ewVar, 100L);
            return;
        }
        org.telegram.messenger.i0.r(ewVar);
        if (textView.getVisibility() == 0) {
            textView.setVisibility(4);
            frameLayout.setVisibility(0);
            o(true);
            if (org.telegram.messenger.uz.f18546r == 1) {
                org.telegram.messenger.i0.J3(editTextBoldCursor);
            }
        }
    }

    public final yc0 f(wc0 wc0Var) {
        wg.d dVar = new wg.d(null);
        dVar.e = new au(10);
        if (Build.VERSION.SDK_INT < 29) {
            dVar.f(1308622847, 1308622847);
            dVar.e(452984831, 452984831);
            float N = org.telegram.messenger.i0.N(1.0f);
            float N2 = org.telegram.messenger.i0.N(0.6666667f);
            dVar.f52866f = N;
            dVar.h = N2;
        }
        vg.f c10 = this.I.c(wc0Var, dVar, true);
        c10.q(org.telegram.messenger.i0.L(30.0f));
        return new yc0(c10);
    }

    public final boolean g() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zc0.g():boolean");
    }

    public final boolean i() {
        vh.r2 r2Var = this.f33109e0;
        if (r2Var != null && r2Var.c()) {
            org.telegram.messenger.i0.v1(this.f33115r);
            return false;
        }
        return true;
    }

    public final void k() {
        org.telegram.messenger.i0.r(this.f33107c0);
    }

    public final void l() {
        if (!this.P) {
            e();
            if (this.f33119y.getVisibility() != 0) {
                if (org.telegram.messenger.uz.f18546r == 1) {
                    EditTextBoldCursor editTextBoldCursor = this.f33115r;
                    if (editTextBoldCursor != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.i0.J3(editTextBoldCursor);
                    }
                    org.telegram.messenger.i0.h3(new mc0(this, 0), 200L);
                }
                c();
            }
        }
    }

    public final void m(boolean z10, int i10, int i11, org.telegram.ui.y60 y60Var) {
        View currentFocus;
        boolean z11;
        f9 f9Var;
        int i12;
        int i13;
        if (getVisibility() != 0) {
            this.P = false;
        }
        d();
        e();
        Activity W = org.telegram.messenger.i0.W(getContext());
        int i14 = org.telegram.messenger.uz.f18546r;
        TextView textView = this.f33119y;
        EditTextBoldCursor editTextBoldCursor = this.f33115r;
        if (i14 == 1) {
            if (!z10 && textView.getVisibility() != 0 && editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor);
            }
        } else if (W != null && (currentFocus = W.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            org.telegram.messenger.i0.v1(W.getCurrentFocus());
        }
        if (getVisibility() == 0) {
            return;
        }
        setTranslationY(0.0f);
        this.f33102a = null;
        boolean z12 = org.telegram.ui.ActionBar.t6.s0() instanceof jb0;
        fg.i iVar = this.f33117w;
        if (z12) {
            z11 = !org.telegram.ui.ActionBar.t6.I.q();
            this.f33102a = org.telegram.ui.ActionBar.t6.s0();
            iVar.setBackgroundColor(-1090519040);
        } else {
            if (org.telegram.ui.ActionBar.t6.W && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.t6.K0()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.t6.K0())) {
                org.telegram.ui.ActionBar.m6 m6Var = org.telegram.ui.ActionBar.t6.I.f20814i0;
                if (m6Var != null && (i12 = m6Var.d) != 0 && (i13 = m6Var.e) != 0) {
                    f9Var = new f9(f9.d(m6Var.h), new int[]{i12, i13});
                } else {
                    f9Var = null;
                }
                this.f33102a = f9Var;
                if (f9Var == null) {
                    this.f33102a = org.telegram.ui.ActionBar.t6.s0();
                }
                if (this.f33102a instanceof f9) {
                    iVar.setBackgroundColor(570425344);
                } else {
                    iVar.setBackgroundColor(-1090519040);
                }
            } else {
                if (!"d".equals(org.telegram.ui.ActionBar.t6.K0())) {
                    String K0 = org.telegram.ui.ActionBar.t6.K0();
                    if (!org.telegram.ui.ActionBar.t6.f21033j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(K0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(K0)) {
                        Drawable s02 = org.telegram.ui.ActionBar.t6.s0();
                        this.f33102a = s02;
                        if (s02 instanceof f9) {
                            iVar.setBackgroundColor(570425344);
                        } else if (s02 != null) {
                            iVar.setBackgroundColor(-1090519040);
                        } else {
                            iVar.setBackgroundColor(-11436898);
                        }
                    }
                }
                iVar.setBackgroundColor(-11436898);
            }
            z11 = false;
        }
        Drawable drawable = this.f33102a;
        if (drawable instanceof jb0) {
            jb0 jb0Var = (jb0) drawable;
            int[] iArr = jb0Var.f27331a;
            if (z11) {
                int[] iArr2 = new int[iArr.length];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    iArr2[i15] = org.telegram.ui.ActionBar.t6.b(0.14f, 0.0f, iArr[i15]);
                }
                iArr = iArr2;
            }
            this.f33102a = new jb0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (jb0Var.f27352u != null && jb0Var.f27348q < 0) {
                iVar.setBackgroundColor(2130706432);
            } else {
                iVar.setBackgroundColor(570425344);
            }
            ((jb0) this.f33102a).q(iVar);
        }
        this.f33118x.setText(org.telegram.messenger.dd.L0(2131754232, null));
        int i16 = org.telegram.messenger.uz.f18546r;
        ImageView imageView = this.E;
        ImageView imageView2 = this.D;
        org.telegram.ui.Cells.a5 a5Var = this.e;
        uc0 uc0Var = this.f33116s;
        if (i16 == 0) {
            if (textView.getVisibility() != 0) {
                a5Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            uc0Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i16 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            a5Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            uc0Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.f33114n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        uc0.a(uc0Var, false);
        if (z10) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new sc0(this, i10, i11, y60Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.f33103a0 = 1.0f;
            h(1.0f);
            fi0 fi0Var = this.M;
            fi0Var.setScaleX(1.0f);
            fi0Var.setScaleY(1.0f);
            fi0Var.i();
            fi0Var.getAnimatedDrawable().N(38, false, false);
            if (y60Var != null) {
                y60Var.run();
            }
        }
        setOnTouchListener(new org.telegram.ui.ActionBar.n2(18));
    }

    public final void n(boolean z10) {
        String str;
        if (!this.P && getVisibility() == 0) {
            EditTextBoldCursor editTextBoldCursor = this.f33115r;
            if (!z10) {
                if (org.telegram.messenger.uz.f18552t <= 0) {
                    int i10 = org.telegram.messenger.uz.f18546r;
                    uc0 uc0Var = this.f33116s;
                    if (i10 == 0) {
                        str = ((StringBuilder) uc0Var.d).toString();
                    } else if (i10 != 1) {
                        str = "";
                    } else {
                        str = editTextBoldCursor.getText().toString();
                    }
                    int length = str.length();
                    FrameLayout frameLayout = this.f33104b;
                    org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.NOTIFICATION_ERROR;
                    if (length == 0) {
                        t2Var.a();
                        int i11 = -this.f33105b0;
                        this.f33105b0 = i11;
                        org.telegram.messenger.i0.F3(i11, frameLayout, null);
                        return;
                    } else if (!org.telegram.messenger.uz.g(str)) {
                        org.telegram.messenger.uz.r();
                        if (org.telegram.messenger.uz.f18552t > 0) {
                            e();
                        }
                        editTextBoldCursor.setText("");
                        uc0.a(uc0Var, true);
                        t2Var.a();
                        int i12 = -this.f33105b0;
                        this.f33105b0 = i12;
                        org.telegram.messenger.i0.F3(i12, frameLayout, null);
                        Drawable drawable = this.f33102a;
                        if (drawable instanceof jb0) {
                            jb0 jb0Var = (jb0) drawable;
                            LinkedList linkedList = this.U;
                            linkedList.clear();
                            LinkedList linkedList2 = this.V;
                            linkedList2.clear();
                            o1.j jVar = this.T;
                            if (jVar != null && jVar.f13952f) {
                                linkedList.offer(new ib0(jb0Var, 1));
                                linkedList2.offer(Boolean.FALSE);
                                return;
                            }
                            jb0Var.m(true);
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
            org.telegram.messenger.uz.v = 0;
            editTextBoldCursor.clearFocus();
            org.telegram.messenger.i0.v1(editTextBoldCursor);
            if (org.telegram.messenger.d6.h() && org.telegram.messenger.d6.a()) {
                try {
                    org.telegram.messenger.d6.e().deleteEntry("tmessages_passcode");
                } catch (KeyStoreException e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                org.telegram.messenger.d6.f15302f = null;
                org.telegram.messenger.d6.b(false);
            }
            org.telegram.messenger.uz.f18563x = false;
            org.telegram.messenger.uz.y();
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14749n0, new Object[0]);
            setOnTouchListener(null);
            xc0 xc0Var = this.O;
            if (xc0Var != null) {
                xc0Var.o(this);
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
            fi0 fi0Var = this.M;
            fi0Var.getAnimatedDrawable().P(71);
            fi0Var.getAnimatedDrawable().N(37, false, false);
            fi0Var.d();
            org.telegram.messenger.i0.g3(new mc0(this, 1));
        }
    }

    public final void o(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f33112g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f33111f0 = z10;
        float alpha = this.e.getAlpha();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
        this.f33112g0 = ofFloat;
        ofFloat.addUpdateListener(new nc0(this, 0));
        this.f33112g0.addListener(new ha0(2, this, z10));
        this.f33112g0.setInterpolator(gr.h);
        this.f33112g0.setDuration(320L);
        this.f33112g0.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.Q1);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14755o0);
        if (this.f33109e0 == null && (getParent() instanceof View)) {
            this.f33109e0 = new vh.r2((View) getParent(), false, new r2(this, 8));
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
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.Q1);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14755o0);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        View rootView = getRootView();
        int height = (rootView.getHeight() - org.telegram.messenger.i0.f16166m) - org.telegram.messenger.i0.q1(rootView);
        Rect rect = this.N;
        getWindowVisibleDisplayFrame(rect);
        this.G = height - (rect.bottom - rect.top);
        if (org.telegram.messenger.uz.f18546r == 1 && (org.telegram.messenger.i0.Q1() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            if (frameLayout.getTag() != null) {
                i14 = ((Integer) frameLayout.getTag()).intValue();
            } else {
                i14 = 0;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((i14 + layoutParams.height) - (this.G / 2)) - org.telegram.messenger.i0.f16166m;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z10, i10, i11, i12, i13);
        TextView textView = this.f33118x;
        int[] iArr = this.f33113h0;
        textView.getLocationInWindow(iArr);
        boolean Q1 = org.telegram.messenger.i0.Q1();
        fi0 fi0Var = this.M;
        if (!Q1 && getContext().getResources().getConfiguration().orientation == 2) {
            int L = iArr[1] - org.telegram.messenger.i0.L(100.0f);
            this.L = L;
            fi0Var.setTranslationY(L);
            return;
        }
        int L2 = iArr[1] - org.telegram.messenger.i0.L(100.0f);
        this.L = L2;
        fi0Var.setTranslationY(L2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        float f7;
        float f10;
        float f11;
        int i15;
        int i16;
        int i17;
        int size = View.MeasureSpec.getSize(i10);
        int i18 = org.telegram.messenger.i0.f16172q.y;
        int L = org.telegram.messenger.i0.L(28.0f);
        int L2 = org.telegram.messenger.i0.L(16.0f);
        int L3 = org.telegram.messenger.i0.L(60.0f);
        if (!org.telegram.messenger.i0.Q1() && getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.F;
        if (view != null) {
            if (org.telegram.messenger.uz.f18546r == 1) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            view.setVisibility(i17);
        }
        fi0 fi0Var = this.M;
        org.telegram.ui.Cells.a5 a5Var = this.e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            if (org.telegram.messenger.uz.f18546r == 0) {
                f10 = 2.0f;
                f11 = size / 2.0f;
            } else {
                f10 = 2.0f;
                f11 = size;
            }
            fi0Var.setTranslationX((f11 / f10) - org.telegram.messenger.i0.L(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            if (org.telegram.messenger.uz.f18546r == 0) {
                i15 = size / 2;
            } else {
                i15 = size;
            }
            layoutParams.width = i15;
            layoutParams.height = org.telegram.messenger.i0.L(180.0f);
            int y3 = org.telegram.messenger.a30.y(140.0f, i18, 2);
            if (org.telegram.messenger.uz.f18546r == 0) {
                i16 = org.telegram.messenger.i0.L(40.0f);
            } else {
                i16 = 0;
            }
            layoutParams.topMargin = y3 + i16;
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i18;
            int i19 = size / 2;
            layoutParams2.leftMargin = i19;
            layoutParams2.topMargin = org.telegram.messenger.i0.f16166m;
            layoutParams2.width = i19;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) a5Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.i0.L(82.0f);
            layoutParams3.width = (Math.max(0, 2) * L) + (L3 * 3);
            layoutParams3.gravity = 17;
            a5Var.setLayoutParams(layoutParams3);
            i14 = 0;
        } else {
            fi0Var.setTranslationX((size / 2.0f) - org.telegram.messenger.i0.L(29.0f));
            int i20 = org.telegram.messenger.i0.f16166m;
            if (org.telegram.messenger.i0.Q1()) {
                if (size > org.telegram.messenger.i0.L(498.0f)) {
                    i12 = org.telegram.messenger.a30.y(498.0f, size, 2);
                    size = org.telegram.messenger.i0.L(498.0f);
                } else {
                    i12 = 0;
                }
                if (i18 > org.telegram.messenger.i0.L(528.0f)) {
                    i20 = org.telegram.messenger.a30.y(528.0f, i18, 2);
                    i18 = org.telegram.messenger.i0.L(528.0f);
                }
            } else {
                i12 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            int i21 = i18 / 3;
            if (org.telegram.messenger.uz.f18546r == 0) {
                i13 = org.telegram.messenger.i0.L(40.0f);
            } else {
                i13 = 0;
            }
            layoutParams4.height = i21 + i13;
            layoutParams4.width = size;
            layoutParams4.topMargin = i20;
            layoutParams4.leftMargin = i12;
            frameLayout2.setTag(Integer.valueOf(i20));
            frameLayout2.setLayoutParams(layoutParams4);
            int i22 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) a5Var.getLayoutParams();
            i14 = 0;
            layoutParams5.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.i0.L(82.0f);
            layoutParams5.width = (Math.max(0, 2) * L) + (L3 * 3);
            if (org.telegram.messenger.i0.Q1()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            a5Var.setLayoutParams(layoutParams5);
            int i23 = i18 - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.leftMargin = i12;
            if (org.telegram.messenger.i0.Q1()) {
                layoutParams6.topMargin = (i18 - i23) / 2;
            } else {
                layoutParams6.topMargin = i22;
            }
            layoutParams6.width = size;
            layoutParams6.height = -1;
            frameLayout.setLayoutParams(layoutParams6);
        }
        if (z10) {
            f7 = 52.0f;
        } else {
            f7 = 82.0f;
        }
        int L4 = org.telegram.messenger.i0.L(f7);
        for (int i24 = i14; i24 < 12; i24++) {
            int i25 = 10;
            if (i24 != 0) {
                if (i24 == 10) {
                    i25 = 11;
                } else if (i24 == 11) {
                    i25 = 9;
                } else {
                    i25 = i24 - 1;
                }
            }
            FrameLayout frameLayout3 = (FrameLayout) this.f33110f.get(i24);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((L3 + L2) * (i25 / 3)) + L4;
            layoutParams7.leftMargin = (L3 + L) * (i25 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
        }
        super.onMeasure(i10, i11);
    }

    public void setDelegate(xc0 xc0Var) {
        this.O = xc0Var;
    }

    public void h(float f7) {
    }

    public void j() {
    }
}
