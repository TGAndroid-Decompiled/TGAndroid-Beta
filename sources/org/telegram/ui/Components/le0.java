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
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FingerprintController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.LaunchActivity;
public class le0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] f30182i0 = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView E;
    public final View F;
    public int G;
    public final hh.b H;
    public final ch.b I;
    public Bitmap J;
    public Canvas K;
    public int L;
    public final ak0 M;
    public final Rect N;
    public je0 O;
    public boolean P;
    public AnimatorSet Q;
    public AnimatorSet R;
    public ValueAnimator S;
    public o1.j T;
    public final LinkedList U;
    public final LinkedList V;
    public final ArrayList W;
    public Drawable f30183a;
    public float f30184a0;
    public final FrameLayout f30185b;
    public int f30186b0;
    public final TextView f30187c;
    public final m.g3 f30188c0;
    public final FrameLayout d;
    public int f30189d0;
    public final di.i4 e;
    public fi.z3 f30190e0;
    public final ArrayList f30191f;
    public boolean f30192f0;
    public ValueAnimator f30193g0;
    public final FrameLayout h;
    public final int[] f30194h0;
    public final ie0 f30195n;
    public final EditTextBoldCursor f30196r;
    public final fi.t8 f30197s;
    public final bh.p v;
    public final TextView f30198w;
    public final TextView f30199x;
    public final ImageView f30200y;

    public le0(Context context) {
        super(context);
        int i10;
        String string = LocaleController.getString(R.string.UnlockToUse);
        int i11 = 0;
        this.G = 0;
        hh.b bVar = new hh.b();
        this.H = bVar;
        ch.b bVar2 = new ch.b(bVar);
        this.I = bVar2;
        se.b bVar3 = new se.b();
        this.N = new Rect();
        this.U = new LinkedList();
        this.V = new LinkedList();
        this.W = new ArrayList();
        this.f30186b0 = -12;
        this.f30188c0 = new m.g3(this, 22);
        this.f30192f0 = true;
        this.f30194h0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        bh.p pVar = new bh.p(this, context);
        this.v = pVar;
        pVar.setWillNotDraw(false);
        addView(pVar, gb1.g(-1.0f, -1));
        bVar2.f6301f = new jh.k(pVar);
        bVar2.f6302g = pVar;
        bVar2.e = bVar3;
        ?? imageView = new ImageView(context);
        this.M = imageView;
        imageView.f(R.raw.passcode_lock, 58, 58, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, gb1.i(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        pVar.addView(frameLayout, gb1.g(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f30198w = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setAlpha(0.0f);
        TextView k10 = org.telegram.ui.d3.k(frameLayout, textView, gb1.h(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.f30199x = k10;
        k10.setTextColor(-1);
        k10.setTextSize(1, 15.0f);
        k10.setGravity(1);
        k10.setVisibility(4);
        pVar.addView(k10, gb1.i(-2, -2, 17));
        fi.t8 t8Var = new fi.t8(this, context);
        this.f30197s = t8Var;
        frameLayout.addView(t8Var, gb1.h(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f30196r = editTextBoldCursor;
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
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(32.0f));
        frameLayout.addView(editTextBoldCursor, gb1.h(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new d1(this, 4));
        editTextBoldCursor.addTextChangedListener(new bi.u(this, 11));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new li.b1(1));
        ImageView imageView2 = new ImageView(context);
        this.f30200y = imageView2;
        imageView2.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView2, gb1.h(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView2.setContentDescription(LocaleController.getString(R.string.Done));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final le0 f26840b;

            {
                this.f26840b = this;
            }

            @Override
            public final void onClick(View view) {
                le0 le0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                int i12;
                boolean z10;
                LinkedList linkedList3;
                int i13;
                int i14;
                le0 le0Var2;
                boolean z11;
                boolean z12;
                int i15 = r2;
                le0 le0Var3 = this.f26840b;
                switch (i15) {
                    case 0:
                        le0Var3.n(false);
                        return;
                    case 1:
                        le0Var3.c();
                        return;
                    default:
                        LinkedList linkedList4 = le0Var3.V;
                        LinkedList linkedList5 = le0Var3.U;
                        fi.t8 t8Var2 = le0Var3.f30197s;
                        if (le0Var3.f30192f0 && !le0Var3.P) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("0");
                                    z10 = i12;
                                    break;
                                case 1:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("1");
                                    z10 = i12;
                                    break;
                                case 2:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("2");
                                    z10 = i12;
                                    break;
                                case 3:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("3");
                                    z10 = i12;
                                    break;
                                case 4:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("4");
                                    z10 = i12;
                                    break;
                                case 5:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("5");
                                    z10 = i12;
                                    break;
                                case 6:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("6");
                                    z10 = i12;
                                    break;
                                case 7:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("7");
                                    z10 = i12;
                                    break;
                                case 8:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("8");
                                    z10 = i12;
                                    break;
                                case 9:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("9");
                                    z10 = i12;
                                    break;
                                case 10:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    le0Var.c();
                                    z10 = i12;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) t8Var2.f11715c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    i12 = false;
                                    ArrayList arrayList2 = (ArrayList) t8Var2.f11714b;
                                    Property property5 = View.TRANSLATION_X;
                                    int i16 = 1;
                                    StringBuilder sb2 = (StringBuilder) t8Var2.d;
                                    if (sb2.length() == 0) {
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = i12;
                                        break;
                                    } else {
                                        try {
                                            t8Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i17 = length;
                                        while (i17 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i17);
                                            le0 le0Var4 = le0Var3;
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
                                                fArr5[0] = t8Var2.c(i17);
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
                                                fArr10[0] = t8Var2.c(i17);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i14 = i17;
                                            }
                                            i17 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            le0Var3 = le0Var4;
                                            i16 = 1;
                                        }
                                        le0Var = le0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), property5, t8Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), property5, t8Var2.c(i18)));
                                        }
                                        hf hfVar = (hf) t8Var2.f11716f;
                                        if (hfVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(hfVar);
                                            t8Var2.f11716f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) t8Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        t8Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) t8Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) t8Var2.e).addListener(new ge0(t8Var2, 1));
                                        ((AnimatorSet) t8Var2.e).start();
                                        le0.a((le0) t8Var2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    z10 = i12;
                                    break;
                            }
                            if (intValue == 11) {
                                le0Var2 = le0Var;
                            } else {
                                le0Var2 = le0Var;
                                Drawable drawable = le0Var2.f30183a;
                                if (drawable instanceof uc0) {
                                    uc0 uc0Var = (uc0) drawable;
                                    uc0Var.D = null;
                                    uc0Var.y();
                                    float f7 = uc0Var.h;
                                    if (intValue == 10) {
                                        if (z10) {
                                            uc0Var.x();
                                            z12 = true;
                                        } else {
                                            z12 = i12;
                                        }
                                        z11 = i12;
                                    } else {
                                        z11 = true;
                                        uc0Var.w(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f7 >= 1.0f) {
                                            le0Var2.b(uc0Var);
                                        } else {
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(new bi.u7(le0Var2, z11, uc0Var, 22));
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
                                            Collections.sort(arrayList5, new org.telegram.ui.ActionBar.n4(18));
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
                            if (((StringBuilder) t8Var2.d).length() == 4) {
                                le0Var2.n(i12);
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
        imageView3.setImageResource(R.drawable.fingerprint);
        imageView3.setScaleType(scaleType);
        imageView3.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView3, gb1.h(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final le0 f26840b;

            {
                this.f26840b = this;
            }

            @Override
            public final void onClick(View view) {
                le0 le0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                int i12;
                boolean z10;
                LinkedList linkedList3;
                int i13;
                int i14;
                le0 le0Var2;
                boolean z11;
                boolean z12;
                int i15 = r2;
                le0 le0Var3 = this.f26840b;
                switch (i15) {
                    case 0:
                        le0Var3.n(false);
                        return;
                    case 1:
                        le0Var3.c();
                        return;
                    default:
                        LinkedList linkedList4 = le0Var3.V;
                        LinkedList linkedList5 = le0Var3.U;
                        fi.t8 t8Var2 = le0Var3.f30197s;
                        if (le0Var3.f30192f0 && !le0Var3.P) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("0");
                                    z10 = i12;
                                    break;
                                case 1:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("1");
                                    z10 = i12;
                                    break;
                                case 2:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("2");
                                    z10 = i12;
                                    break;
                                case 3:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("3");
                                    z10 = i12;
                                    break;
                                case 4:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("4");
                                    z10 = i12;
                                    break;
                                case 5:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("5");
                                    z10 = i12;
                                    break;
                                case 6:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("6");
                                    z10 = i12;
                                    break;
                                case 7:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("7");
                                    z10 = i12;
                                    break;
                                case 8:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("8");
                                    z10 = i12;
                                    break;
                                case 9:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    t8Var2.b("9");
                                    z10 = i12;
                                    break;
                                case 10:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    le0Var.c();
                                    z10 = i12;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) t8Var2.f11715c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    i12 = false;
                                    ArrayList arrayList2 = (ArrayList) t8Var2.f11714b;
                                    Property property5 = View.TRANSLATION_X;
                                    int i16 = 1;
                                    StringBuilder sb2 = (StringBuilder) t8Var2.d;
                                    if (sb2.length() == 0) {
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = i12;
                                        break;
                                    } else {
                                        try {
                                            t8Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i17 = length;
                                        while (i17 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i17);
                                            le0 le0Var4 = le0Var3;
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
                                                fArr5[0] = t8Var2.c(i17);
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
                                                fArr10[0] = t8Var2.c(i17);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i14 = i17;
                                            }
                                            i17 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            le0Var3 = le0Var4;
                                            i16 = 1;
                                        }
                                        le0Var = le0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), property5, t8Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), property5, t8Var2.c(i18)));
                                        }
                                        hf hfVar = (hf) t8Var2.f11716f;
                                        if (hfVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(hfVar);
                                            t8Var2.f11716f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) t8Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        t8Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) t8Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) t8Var2.e).addListener(new ge0(t8Var2, 1));
                                        ((AnimatorSet) t8Var2.e).start();
                                        le0.a((le0) t8Var2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = false;
                                    z10 = i12;
                                    break;
                            }
                            if (intValue == 11) {
                                le0Var2 = le0Var;
                            } else {
                                le0Var2 = le0Var;
                                Drawable drawable = le0Var2.f30183a;
                                if (drawable instanceof uc0) {
                                    uc0 uc0Var = (uc0) drawable;
                                    uc0Var.D = null;
                                    uc0Var.y();
                                    float f7 = uc0Var.h;
                                    if (intValue == 10) {
                                        if (z10) {
                                            uc0Var.x();
                                            z12 = true;
                                        } else {
                                            z12 = i12;
                                        }
                                        z11 = i12;
                                    } else {
                                        z11 = true;
                                        uc0Var.w(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f7 >= 1.0f) {
                                            le0Var2.b(uc0Var);
                                        } else {
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(new bi.u7(le0Var2, z11, uc0Var, 22));
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
                                            Collections.sort(arrayList5, new org.telegram.ui.ActionBar.n4(18));
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
                            if (((StringBuilder) t8Var2.d).length() == 4) {
                                le0Var2.n(i12);
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
        frameLayout.addView(view, gb1.e(-1.0f, 1.0f / AndroidUtilities.density, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        pVar.addView(frameLayout2, gb1.i(-1, -1, 51));
        di.i4 i4Var = new di.i4(context, 16);
        this.e = i4Var;
        i4Var.setClipChildren(false);
        frameLayout2.addView(i4Var, gb1.i(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f30185b = frameLayout3;
        i4Var.addView(frameLayout3, gb1.i(-2, -2, 49));
        TextView g7 = org.telegram.messenger.t.g(context, 1, 15.0f);
        g7.setTypeface(AndroidUtilities.bold());
        g7.setTextColor(-1);
        g7.setText(string);
        TextView k11 = org.telegram.ui.d3.k(frameLayout3, g7, gb1.h(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.f30187c = k11;
        k11.setTextSize(1, 14.0f);
        k11.setTextColor(-1);
        k11.setText((CharSequence) null);
        frameLayout3.addView(k11, gb1.h(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f30191f = new ArrayList(10);
        while (true) {
            if (i11 >= 12) {
                break;
            }
            ie0 ie0Var = new ie0(context);
            gb1.c(ie0Var, 0.15f, 1.5f);
            ie0Var.setTag(Integer.valueOf(i11));
            int[] iArr = f30182i0;
            if (i11 == 11) {
                ie0Var.setBackground(f(ie0Var));
                int dp = AndroidUtilities.dp(30.0f);
                ie0Var.setForeground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, 654311423, 654311423));
                ie0Var.setImage(R.drawable.filled_clear);
                ie0Var.setOnLongClickListener(new w10(this, 1));
                ie0Var.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
                int i12 = R.id.passcode_btn_0;
                ie0Var.setNextFocusForwardId(i12);
                ie0Var.setAccessibilityTraversalBefore(i12);
            } else if (i11 == 10) {
                this.f30195n = ie0Var;
                ie0Var.setBackground(f(ie0Var));
                int dp2 = AndroidUtilities.dp(30.0f);
                ie0Var.setForeground(org.telegram.ui.ActionBar.y6.j0(dp2, dp2, dp2, dp2, 0, 654311423, 654311423));
                ie0Var.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
                ie0Var.setImage(R.drawable.fingerprint);
                int i13 = R.id.passcode_btn_1;
                ie0Var.setNextFocusForwardId(i13);
                ie0Var.setAccessibilityTraversalBefore(i13);
            } else {
                ie0Var.setBackground(f(ie0Var));
                int dp3 = AndroidUtilities.dp(30.0f);
                ie0Var.setForeground(org.telegram.ui.ActionBar.y6.j0(dp3, dp3, dp3, dp3, 0, 654311423, 654311423));
                ie0Var.setContentDescription(i11 + "");
                ie0Var.setNum(i11);
                if (i11 == 0) {
                    int i14 = R.id.passcode_btn_backspace;
                    ie0Var.setNextFocusForwardId(i14);
                    ie0Var.setAccessibilityTraversalBefore(i14);
                } else if (i11 == 9) {
                    if (g()) {
                        int i15 = R.id.passcode_btn_fingerprint;
                        ie0Var.setNextFocusForwardId(i15);
                        ie0Var.setAccessibilityTraversalBefore(i15);
                    } else {
                        int i16 = R.id.passcode_btn_0;
                        ie0Var.setNextFocusForwardId(i16);
                        ie0Var.setAccessibilityTraversalBefore(i16);
                    }
                } else {
                    int i17 = iArr[i11 + 1];
                    ie0Var.setNextFocusForwardId(i17);
                    ie0Var.setAccessibilityTraversalBefore(i17);
                }
            }
            ie0Var.setId(iArr[i11]);
            ie0Var.setOnClickListener(new View.OnClickListener(this) {
                public final le0 f26840b;

                {
                    this.f26840b = this;
                }

                @Override
                public final void onClick(View view2) {
                    le0 le0Var;
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    int i122;
                    boolean z10;
                    LinkedList linkedList3;
                    int i132;
                    int i142;
                    le0 le0Var2;
                    boolean z11;
                    boolean z12;
                    int i152 = r2;
                    le0 le0Var3 = this.f26840b;
                    switch (i152) {
                        case 0:
                            le0Var3.n(false);
                            return;
                        case 1:
                            le0Var3.c();
                            return;
                        default:
                            LinkedList linkedList4 = le0Var3.V;
                            LinkedList linkedList5 = le0Var3.U;
                            fi.t8 t8Var2 = le0Var3.f30197s;
                            if (le0Var3.f30192f0 && !le0Var3.P) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        t8Var2.b("0");
                                        z10 = i122;
                                        break;
                                    case 1:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        t8Var2.b("1");
                                        z10 = i122;
                                        break;
                                    case 2:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        t8Var2.b("2");
                                        z10 = i122;
                                        break;
                                    case 3:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        t8Var2.b("3");
                                        z10 = i122;
                                        break;
                                    case 4:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        t8Var2.b("4");
                                        z10 = i122;
                                        break;
                                    case 5:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        t8Var2.b("5");
                                        z10 = i122;
                                        break;
                                    case 6:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        t8Var2.b("6");
                                        z10 = i122;
                                        break;
                                    case 7:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        t8Var2.b("7");
                                        z10 = i122;
                                        break;
                                    case 8:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        t8Var2.b("8");
                                        z10 = i122;
                                        break;
                                    case 9:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        t8Var2.b("9");
                                        z10 = i122;
                                        break;
                                    case 10:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        le0Var.c();
                                        z10 = i122;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) t8Var2.f11715c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        i122 = false;
                                        ArrayList arrayList2 = (ArrayList) t8Var2.f11714b;
                                        Property property5 = View.TRANSLATION_X;
                                        int i162 = 1;
                                        StringBuilder sb2 = (StringBuilder) t8Var2.d;
                                        if (sb2.length() == 0) {
                                            le0Var = le0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = i122;
                                            break;
                                        } else {
                                            try {
                                                t8Var2.performHapticFeedback(3);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int length = sb2.length() - 1;
                                            if (length != 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            linkedList = linkedList4;
                                            int i172 = length;
                                            while (i172 < 4) {
                                                TextView textView2 = (TextView) arrayList2.get(i172);
                                                le0 le0Var4 = le0Var3;
                                                if (textView2.getAlpha() != 0.0f) {
                                                    linkedList3 = linkedList5;
                                                    i132 = i162;
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
                                                    fArr5[0] = t8Var2.c(i172);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, fArr5));
                                                } else {
                                                    linkedList3 = linkedList5;
                                                    i132 = i162;
                                                }
                                                TextView textView3 = (TextView) arrayList.get(i172);
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
                                                    i142 = i172;
                                                    float[] fArr10 = new float[i132];
                                                    fArr10[0] = t8Var2.c(i172);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                                } else {
                                                    i142 = i172;
                                                }
                                                i172 = i142 + 1;
                                                linkedList5 = linkedList3;
                                                le0Var3 = le0Var4;
                                                i162 = 1;
                                            }
                                            le0Var = le0Var3;
                                            linkedList2 = linkedList5;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i18 = 0; i18 < length; i18++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), property5, t8Var2.c(i18)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), property5, t8Var2.c(i18)));
                                            }
                                            hf hfVar = (hf) t8Var2.f11716f;
                                            if (hfVar != null) {
                                                AndroidUtilities.cancelRunOnUIThread(hfVar);
                                                t8Var2.f11716f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) t8Var2.e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            t8Var2.e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) t8Var2.e).playTogether(arrayList3);
                                            ((AnimatorSet) t8Var2.e).addListener(new ge0(t8Var2, 1));
                                            ((AnimatorSet) t8Var2.e).start();
                                            le0.a((le0) t8Var2.h);
                                            z10 = true;
                                            break;
                                        }
                                    default:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = false;
                                        z10 = i122;
                                        break;
                                }
                                if (intValue == 11) {
                                    le0Var2 = le0Var;
                                } else {
                                    le0Var2 = le0Var;
                                    Drawable drawable = le0Var2.f30183a;
                                    if (drawable instanceof uc0) {
                                        uc0 uc0Var = (uc0) drawable;
                                        uc0Var.D = null;
                                        uc0Var.y();
                                        float f7 = uc0Var.h;
                                        if (intValue == 10) {
                                            if (z10) {
                                                uc0Var.x();
                                                z12 = true;
                                            } else {
                                                z12 = i122;
                                            }
                                            z11 = i122;
                                        } else {
                                            z11 = true;
                                            uc0Var.w(true);
                                            z12 = true;
                                        }
                                        if (z12) {
                                            if (f7 >= 1.0f) {
                                                le0Var2.b(uc0Var);
                                            } else {
                                                LinkedList linkedList6 = linkedList2;
                                                linkedList6.offer(new bi.u7(le0Var2, z11, uc0Var, 22));
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
                                                Collections.sort(arrayList5, new org.telegram.ui.ActionBar.n4(18));
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
                                if (((StringBuilder) t8Var2.d).length() == 4) {
                                    le0Var2.n(i122);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
            this.f30191f.add(ie0Var);
            i11++;
        }
        for (i10 = 11; i10 >= 0; i10--) {
            this.e.addView((FrameLayout) this.f30191f.get(i10), gb1.i(60, 60, 51));
        }
        d();
    }

    public static void a(le0 le0Var) {
        boolean z10;
        float f7;
        float f10;
        FrameLayout frameLayout = le0Var.f30185b;
        fi.t8 t8Var = le0Var.f30197s;
        if (t8Var != null && ((StringBuilder) t8Var.d).length() <= 0) {
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
            org.telegram.messenger.vh.q(scaleX.scaleY(f11), ds.h, 320L);
        }
    }

    public final void b(uc0 uc0Var) {
        o1.j jVar = this.T;
        if (jVar != null && jVar.f18963f) {
            jVar.c();
        }
        ac.a aVar = new ac.a(0.0f);
        uc0Var.D = new tv(aVar, 10);
        uc0Var.y();
        o1.j jVar2 = new o1.j(aVar);
        jVar2.f18969u = org.telegram.ui.d3.l(100.0f, 300.0f, 1.0f);
        this.T = jVar2;
        jVar2.a(new hi.k4(4, this, uc0Var));
        this.T.b(new n7(uc0Var, 5));
        this.T.h();
    }

    public final void c() {
        Activity findActivity;
        ne0 ne0Var;
        if (!this.P && (findActivity = AndroidUtilities.findActivity(getContext())) != null && this.f30195n.getVisibility() == 0 && !ApplicationLoader.mainInterfacePaused) {
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                ArrayList arrayList = launchActivity.B0;
                if (arrayList.isEmpty() && (ne0Var = launchActivity.A0) != null) {
                    if (this != ne0Var.f30967b) {
                        return;
                    }
                } else if (ic.a.g(1, arrayList) != this) {
                    return;
                }
            }
            try {
                if (new a8.h0(new l6.h(getContext(), 1)).h(15) == 0 && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    rb.c cVar = new rb.c(LaunchActivity.I1, f0.c.d(getContext()), new ce0(this));
                    k6.m mVar = new k6.m(1);
                    mVar.f16424b = LocaleController.getString(R.string.UnlockToUse);
                    mVar.d = LocaleController.getString(R.string.UsePIN);
                    mVar.f16423a = 15;
                    cVar.e(mVar.c(), null);
                    o(false);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void d() {
        int i10;
        int i11;
        boolean g7 = g();
        if (g7) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ie0 ie0Var = this.f30195n;
        ie0Var.setVisibility(i10);
        if (SharedConfig.passcodeType == 1) {
            this.E.setVisibility(ie0Var.getVisibility());
        }
        if (SharedConfig.passcodeType == 1) {
            i11 = R.string.EnterPassword;
        } else if (g7) {
            i11 = R.string.EnterPINorFingerprint;
        } else {
            i11 = R.string.EnterPIN;
        }
        this.f30187c.setText(LocaleController.getString(i11));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didGenerateFingerprintKeyPair) {
            d();
            if (((Boolean) objArr[0]).booleanValue() && SharedConfig.appLocked) {
                c();
            }
        } else if (i10 == NotificationCenter.passcodeDismissed && objArr[0] != this) {
            setVisibility(8);
        }
    }

    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > SharedConfig.lastUptimeMillis) {
            long j10 = SharedConfig.passcodeRetryInMs - (elapsedRealtime - SharedConfig.lastUptimeMillis);
            SharedConfig.passcodeRetryInMs = j10;
            if (j10 < 0) {
                SharedConfig.passcodeRetryInMs = 0L;
            }
        }
        SharedConfig.lastUptimeMillis = elapsedRealtime;
        SharedConfig.saveConfig();
        long j11 = SharedConfig.passcodeRetryInMs;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        EditTextBoldCursor editTextBoldCursor = this.f30196r;
        FrameLayout frameLayout = this.h;
        m.g3 g3Var = this.f30188c0;
        TextView textView = this.f30199x;
        if (i10 > 0) {
            int max = Math.max(1, (int) Math.ceil(j11 / 1000.0d));
            if (max != this.f30189d0) {
                textView.setText(LocaleController.formatString(R.string.TooManyTries, LocaleController.formatPluralString("Seconds", max, new Object[0])));
                this.f30189d0 = max;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                frameLayout.setVisibility(4);
                o(false);
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
            }
            AndroidUtilities.cancelRunOnUIThread(g3Var);
            AndroidUtilities.runOnUIThread(g3Var, 100L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(g3Var);
        if (textView.getVisibility() == 0) {
            textView.setVisibility(4);
            frameLayout.setVisibility(0);
            o(true);
            if (SharedConfig.passcodeType == 1) {
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            }
        }
    }

    public final ke0 f(ie0 ie0Var) {
        fh.e eVar = new fh.e(null);
        eVar.e = new qd0(5);
        if (Build.VERSION.SDK_INT < 29) {
            eVar.d(1308622847, 1308622847);
            eVar.c(452984831, 452984831);
            float dpf2 = AndroidUtilities.dpf2(1.0f);
            float dpf22 = AndroidUtilities.dpf2(0.6666667f);
            eVar.f10484f = dpf2;
            eVar.h = dpf22;
        }
        eh.d c10 = this.I.c(ie0Var, eVar, true);
        c10.x(AndroidUtilities.dp(30.0f));
        return new ke0(c10);
    }

    public final boolean g() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.le0.g():boolean");
    }

    public final boolean i() {
        fi.z3 z3Var = this.f30190e0;
        if (z3Var != null && z3Var.c()) {
            AndroidUtilities.hideKeyboard(this.f30196r);
            return false;
        }
        return true;
    }

    public final void k() {
        AndroidUtilities.cancelRunOnUIThread(this.f30188c0);
    }

    public final void l() {
        if (!this.P) {
            e();
            if (this.f30199x.getVisibility() != 0) {
                if (SharedConfig.passcodeType == 1) {
                    EditTextBoldCursor editTextBoldCursor = this.f30196r;
                    if (editTextBoldCursor != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                    }
                    AndroidUtilities.runOnUIThread(new zd0(this, 0), 200L);
                }
                c();
            }
        }
    }

    public final void m(boolean z10, int i10, int i11, org.telegram.ui.sz szVar) {
        View currentFocus;
        boolean z11;
        int i12;
        int i13;
        if (getVisibility() != 0) {
            this.P = false;
        }
        d();
        e();
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        int i14 = SharedConfig.passcodeType;
        TextView textView = this.f30199x;
        EditTextBoldCursor editTextBoldCursor = this.f30196r;
        if (i14 == 1) {
            if (!z10 && textView.getVisibility() != 0 && editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            }
        } else if (findActivity != null && (currentFocus = findActivity.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findActivity.getCurrentFocus());
        }
        if (getVisibility() == 0) {
            return;
        }
        setTranslationY(0.0f);
        x9 x9Var = null;
        this.f30183a = null;
        boolean z12 = org.telegram.ui.ActionBar.y6.s0() instanceof uc0;
        bh.p pVar = this.v;
        if (z12) {
            z11 = !org.telegram.ui.ActionBar.y6.I.q();
            this.f30183a = org.telegram.ui.ActionBar.y6.s0();
            pVar.setBackgroundColor(-1090519040);
        } else {
            if (org.telegram.ui.ActionBar.y6.W && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.y6.J0()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.y6.J0())) {
                org.telegram.ui.ActionBar.r6 r6Var = org.telegram.ui.ActionBar.y6.I.f23261i0;
                if (r6Var != null && (i12 = r6Var.d) != 0 && (i13 = r6Var.e) != 0) {
                    x9Var = new x9(x9.d(r6Var.h), new int[]{i12, i13});
                }
                this.f30183a = x9Var;
                if (x9Var == null) {
                    this.f30183a = org.telegram.ui.ActionBar.y6.s0();
                }
                if (this.f30183a instanceof x9) {
                    pVar.setBackgroundColor(570425344);
                } else {
                    pVar.setBackgroundColor(-1090519040);
                }
            } else {
                if (!"d".equals(org.telegram.ui.ActionBar.y6.J0())) {
                    String J0 = org.telegram.ui.ActionBar.y6.J0();
                    if (!org.telegram.ui.ActionBar.y6.f23457j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(J0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(J0)) {
                        Drawable s02 = org.telegram.ui.ActionBar.y6.s0();
                        this.f30183a = s02;
                        if (s02 instanceof x9) {
                            pVar.setBackgroundColor(570425344);
                        } else if (s02 != null) {
                            pVar.setBackgroundColor(-1090519040);
                        } else {
                            pVar.setBackgroundColor(-11436898);
                        }
                    }
                }
                pVar.setBackgroundColor(-11436898);
            }
            z11 = false;
        }
        Drawable drawable = this.f30183a;
        if (drawable instanceof uc0) {
            uc0 uc0Var = (uc0) drawable;
            int[] iArr = uc0Var.f33350a;
            if (z11) {
                int[] iArr2 = new int[iArr.length];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    iArr2[i15] = org.telegram.ui.ActionBar.y6.b(0.14f, 0.0f, iArr[i15]);
                }
                iArr = iArr2;
            }
            this.f30183a = new uc0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (uc0Var.f33371u != null && uc0Var.f33367q < 0) {
                pVar.setBackgroundColor(2130706432);
            } else {
                pVar.setBackgroundColor(570425344);
            }
            ((uc0) this.f30183a).q(pVar);
        }
        this.f30198w.setText(LocaleController.getString(R.string.AppLocked));
        int i16 = SharedConfig.passcodeType;
        ImageView imageView = this.E;
        ImageView imageView2 = this.f30200y;
        di.i4 i4Var = this.e;
        fi.t8 t8Var = this.f30197s;
        if (i16 == 0) {
            if (textView.getVisibility() != 0) {
                i4Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            t8Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i16 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            i4Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            t8Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.f30195n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        fi.t8.a(t8Var, false);
        if (z10) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new fe0(this, i10, i11, szVar));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.f30184a0 = 1.0f;
            h(1.0f);
            ak0 ak0Var = this.M;
            ak0Var.setScaleX(1.0f);
            ak0Var.setScaleY(1.0f);
            ak0Var.i();
            ak0Var.getAnimatedDrawable().N(38, false, false);
            if (szVar != null) {
                szVar.run();
            }
        }
        setOnTouchListener(new ei.d(19));
    }

    public final void n(boolean z10) {
        String str;
        if (!this.P && getVisibility() == 0) {
            EditTextBoldCursor editTextBoldCursor = this.f30196r;
            if (!z10) {
                if (SharedConfig.passcodeRetryInMs <= 0) {
                    int i10 = SharedConfig.passcodeType;
                    fi.t8 t8Var = this.f30197s;
                    if (i10 == 0) {
                        str = ((StringBuilder) t8Var.d).toString();
                    } else if (i10 != 1) {
                        str = "";
                    } else {
                        str = editTextBoldCursor.getText().toString();
                    }
                    int length = str.length();
                    FrameLayout frameLayout = this.f30185b;
                    if (length == 0) {
                        BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                        int i11 = -this.f30186b0;
                        this.f30186b0 = i11;
                        AndroidUtilities.shakeViewSpring(frameLayout, i11);
                        return;
                    } else if (!SharedConfig.checkPasscode(str)) {
                        SharedConfig.increaseBadPasscodeTries();
                        if (SharedConfig.passcodeRetryInMs > 0) {
                            e();
                        }
                        editTextBoldCursor.setText("");
                        fi.t8.a(t8Var, true);
                        BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                        int i12 = -this.f30186b0;
                        this.f30186b0 = i12;
                        AndroidUtilities.shakeViewSpring(frameLayout, i12);
                        Drawable drawable = this.f30183a;
                        if (drawable instanceof uc0) {
                            uc0 uc0Var = (uc0) drawable;
                            LinkedList linkedList = this.U;
                            linkedList.clear();
                            LinkedList linkedList2 = this.V;
                            linkedList2.clear();
                            o1.j jVar = this.T;
                            if (jVar != null && jVar.f18963f) {
                                linkedList.offer(new tc0(uc0Var, 1));
                                linkedList2.offer(Boolean.FALSE);
                                return;
                            }
                            uc0Var.m(true);
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
            SharedConfig.badPasscodeTries = 0;
            editTextBoldCursor.clearFocus();
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            if (FingerprintController.isKeyReady() && FingerprintController.checkDeviceFingerprintsChanged()) {
                FingerprintController.deleteInvalidKey();
            }
            SharedConfig.appLocked = false;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
            setOnTouchListener(null);
            je0 je0Var = this.O;
            if (je0Var != null) {
                je0Var.l(this);
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
            ak0 ak0Var = this.M;
            ak0Var.getAnimatedDrawable().P(71);
            ak0Var.getAnimatedDrawable().N(37, false, false);
            ak0Var.d();
            AndroidUtilities.runOnUIThread(new zd0(this, 1));
        }
    }

    public final void o(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f30193g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f30192f0 = z10;
        float alpha = this.e.getAlpha();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
        this.f30193g0 = ofFloat;
        ofFloat.addUpdateListener(new ae0(this, 0));
        this.f30193g0.addListener(new org.telegram.ui.jo(17, this, z10));
        this.f30193g0.setInterpolator(ds.h);
        this.f30193g0.setDuration(320L);
        this.f30193g0.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.passcodeDismissed);
        if (this.f30190e0 == null && (getParent() instanceof View)) {
            this.f30190e0 = new fi.z3((View) getParent(), false, new b3(this, 8));
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
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.passcodeDismissed);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        View rootView = getRootView();
        int height = (rootView.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.getViewInset(rootView);
        Rect rect = this.N;
        getWindowVisibleDisplayFrame(rect);
        this.G = height - (rect.bottom - rect.top);
        if (SharedConfig.passcodeType == 1 && (AndroidUtilities.isTablet() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            if (frameLayout.getTag() != null) {
                i14 = ((Integer) frameLayout.getTag()).intValue();
            } else {
                i14 = 0;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((i14 + layoutParams.height) - (this.G / 2)) - AndroidUtilities.statusBarHeight;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z10, i10, i11, i12, i13);
        TextView textView = this.f30198w;
        int[] iArr = this.f30194h0;
        textView.getLocationInWindow(iArr);
        boolean isTablet = AndroidUtilities.isTablet();
        ak0 ak0Var = this.M;
        if (!isTablet && getContext().getResources().getConfiguration().orientation == 2) {
            int dp = iArr[1] - AndroidUtilities.dp(100.0f);
            this.L = dp;
            ak0Var.setTranslationY(dp);
            return;
        }
        int dp2 = iArr[1] - AndroidUtilities.dp(100.0f);
        this.L = dp2;
        ak0Var.setTranslationY(dp2);
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
        int i18 = AndroidUtilities.displaySize.y;
        int dp = AndroidUtilities.dp(28.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int dp3 = AndroidUtilities.dp(60.0f);
        if (!AndroidUtilities.isTablet() && getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.F;
        if (view != null) {
            if (SharedConfig.passcodeType == 1) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            view.setVisibility(i17);
        }
        ak0 ak0Var = this.M;
        di.i4 i4Var = this.e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            if (SharedConfig.passcodeType == 0) {
                f10 = 2.0f;
                f11 = size / 2.0f;
            } else {
                f10 = 2.0f;
                f11 = size;
            }
            ak0Var.setTranslationX((f11 / f10) - AndroidUtilities.dp(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            if (SharedConfig.passcodeType == 0) {
                i15 = size / 2;
            } else {
                i15 = size;
            }
            layoutParams.width = i15;
            layoutParams.height = AndroidUtilities.dp(180.0f);
            int B = org.telegram.messenger.vh.B(140.0f, i18, 2);
            if (SharedConfig.passcodeType == 0) {
                i16 = AndroidUtilities.dp(40.0f);
            } else {
                i16 = 0;
            }
            layoutParams.topMargin = B + i16;
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i18;
            int i19 = size / 2;
            layoutParams2.leftMargin = i19;
            layoutParams2.topMargin = AndroidUtilities.statusBarHeight;
            layoutParams2.width = i19;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) i4Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams3.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            layoutParams3.gravity = 17;
            i4Var.setLayoutParams(layoutParams3);
            i14 = 0;
        } else {
            ak0Var.setTranslationX((size / 2.0f) - AndroidUtilities.dp(29.0f));
            int i20 = AndroidUtilities.statusBarHeight;
            if (AndroidUtilities.isTablet()) {
                if (size > AndroidUtilities.dp(498.0f)) {
                    i12 = org.telegram.messenger.vh.B(498.0f, size, 2);
                    size = AndroidUtilities.dp(498.0f);
                } else {
                    i12 = 0;
                }
                if (i18 > AndroidUtilities.dp(528.0f)) {
                    i20 = org.telegram.messenger.vh.B(528.0f, i18, 2);
                    i18 = AndroidUtilities.dp(528.0f);
                }
            } else {
                i12 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            int i21 = i18 / 3;
            if (SharedConfig.passcodeType == 0) {
                i13 = AndroidUtilities.dp(40.0f);
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
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) i4Var.getLayoutParams();
            i14 = 0;
            layoutParams5.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams5.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            if (AndroidUtilities.isTablet()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            i4Var.setLayoutParams(layoutParams5);
            int i23 = i18 - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.leftMargin = i12;
            if (AndroidUtilities.isTablet()) {
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
        int dp4 = AndroidUtilities.dp(f7);
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
            FrameLayout frameLayout3 = (FrameLayout) this.f30191f.get(i24);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((dp3 + dp2) * (i25 / 3)) + dp4;
            layoutParams7.leftMargin = (dp3 + dp) * (i25 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
        }
        super.onMeasure(i10, i11);
    }

    public void setDelegate(je0 je0Var) {
        this.O = je0Var;
    }

    public void j() {
    }

    public void h(float f7) {
    }
}
