package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.View;
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

public class dd0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] T = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView A;
    public final View B;
    public int C;
    public int D;
    public final ri0 E;
    public final Rect F;
    public cd0 G;
    public o1.j H;
    public final LinkedList I;
    public final LinkedList J;
    public final ArrayList K;
    public float L;
    public int M;
    public final m.i3 N;
    public int O;
    public lh.a4 P;
    public boolean Q;
    public ValueAnimator R;
    public final int[] S;

    public Drawable f27717a;

    public final FrameLayout f27718b;

    public final TextView f27719c;
    public final FrameLayout d;

    public final ag.d f27720e;

    public final ArrayList f27721f;
    public final FrameLayout h;

    public final bd0 f27722n;

    public final EditTextBoldCursor f27723r;

    public final lh.w8 f27724s;
    public final ag.y1 v;

    public final TextView f27725w;

    public final TextView f27726x;

    public final ImageView f27727y;

    public dd0(Context context) {
        int i10;
        super(context);
        int[] iArr = T;
        final int i11 = 0;
        this.C = 0;
        this.F = new Rect();
        this.I = new LinkedList();
        this.J = new LinkedList();
        this.K = new ArrayList();
        this.M = -12;
        this.N = new m.i3(this, 24);
        this.Q = true;
        this.S = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        ag.y1 y1Var = new ag.y1(this, context);
        this.v = y1Var;
        y1Var.setWillNotDraw(false);
        addView(y1Var, h7.z5.c(-1.0f, -1));
        ri0 ri0Var = new ri0(context);
        this.E = ri0Var;
        ri0Var.f(R.raw.passcode_lock, 58, 58, null);
        ri0Var.setAutoRepeat(false);
        addView(ri0Var, h7.z5.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        y1Var.addView(frameLayout, h7.z5.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f27725w = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setAlpha(0.0f);
        TextView textViewH = org.telegram.ui.Cells.pa.h(frameLayout, textView, h7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.f27726x = textViewH;
        textViewH.setTextColor(-1);
        textViewH.setTextSize(1, 15.0f);
        textViewH.setGravity(1);
        textViewH.setVisibility(4);
        y1Var.addView(textViewH, h7.z5.e(-2, -2, 17));
        lh.w8 w8Var = new lh.w8(this, context);
        this.f27724s = w8Var;
        frameLayout.addView(w8Var, h7.z5.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f27723r = editTextBoldCursor;
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
        frameLayout.addView(editTextBoldCursor, h7.z5.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new c1(this, 3));
        editTextBoldCursor.addTextChangedListener(new ch.e(this, 11));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(1));
        ImageView imageView = new ImageView(context);
        this.f27727y = imageView;
        imageView.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView, h7.z5.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView.setContentDescription(LocaleController.getString(R.string.Done));
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final dd0 f33060b;

            {
                this.f33060b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                int i12;
                boolean z11;
                boolean z12;
                int i13 = i11;
                dd0 dd0Var = this.f33060b;
                switch (i13) {
                    case 0:
                        dd0Var.k(false);
                        break;
                    case 1:
                        dd0Var.c();
                        break;
                    default:
                        LinkedList linkedList = dd0Var.J;
                        LinkedList linkedList2 = dd0Var.I;
                        lh.w8 w8Var2 = dd0Var.f27724s;
                        if (dd0Var.Q) {
                            int iIntValue = ((Integer) view.getTag()).intValue();
                            switch (iIntValue) {
                                case 0:
                                    w8Var2.b("0");
                                    z10 = false;
                                    break;
                                case 1:
                                    w8Var2.b("1");
                                    z10 = false;
                                    break;
                                case 2:
                                    w8Var2.b("2");
                                    z10 = false;
                                    break;
                                case 3:
                                    w8Var2.b("3");
                                    z10 = false;
                                    break;
                                case 4:
                                    w8Var2.b("4");
                                    z10 = false;
                                    break;
                                case 5:
                                    w8Var2.b("5");
                                    z10 = false;
                                    break;
                                case 6:
                                    w8Var2.b("6");
                                    z10 = false;
                                    break;
                                case 7:
                                    w8Var2.b("7");
                                    z10 = false;
                                    break;
                                case 8:
                                    w8Var2.b("8");
                                    z10 = false;
                                    break;
                                case 9:
                                    w8Var2.b("9");
                                    z10 = false;
                                    break;
                                case 10:
                                    dd0Var.c();
                                    z10 = false;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) w8Var2.f17015c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) w8Var2.f17014b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) w8Var2.d;
                                    if (sb2.length() == 0) {
                                        z10 = false;
                                    } else {
                                        try {
                                            w8Var2.performHapticFeedback(3);
                                        } catch (Exception e9) {
                                            FileLog.e(e9);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList;
                                        int i14 = length;
                                        while (i14 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i14);
                                            if (textView2.getAlpha() != 0.0f) {
                                                i12 = 1;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, w8Var2.c(i14)));
                                            } else {
                                                i12 = 1;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i14);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr = new float[i12];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr));
                                                float[] fArr2 = new float[i12];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr2));
                                                float[] fArr3 = new float[i12];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr3));
                                                float[] fArr4 = new float[i12];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr4));
                                                float fC = w8Var2.c(i14);
                                                float[] fArr5 = new float[i12];
                                                fArr5[0] = fC;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr5));
                                            }
                                            i14++;
                                            linkedList2 = linkedList2;
                                            iIntValue = iIntValue;
                                        }
                                        linkedList2 = linkedList2;
                                        iIntValue = iIntValue;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i15 = 0; i15 < length; i15++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i15), (Property<TextView, Float>) property5, w8Var2.c(i15)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i15), (Property<TextView, Float>) property5, w8Var2.c(i15)));
                                        }
                                        ue ueVar = (ue) w8Var2.f17017f;
                                        if (ueVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(ueVar);
                                            w8Var2.f17017f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) w8Var2.f17016e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        w8Var2.f17016e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) w8Var2.f17016e).playTogether(arrayList3);
                                        ((AnimatorSet) w8Var2.f17016e).addListener(new zc0(w8Var2, 1));
                                        ((AnimatorSet) w8Var2.f17016e).start();
                                        dd0.a((dd0) w8Var2.h);
                                        z10 = true;
                                    }
                                    break;
                                default:
                                    z10 = false;
                                    break;
                            }
                            if (((StringBuilder) w8Var2.d).length() == 4) {
                                dd0Var.k(false);
                            }
                            int i16 = iIntValue;
                            if (i16 != 11) {
                                Drawable drawable = dd0Var.f27717a;
                                if (drawable instanceof nb0) {
                                    nb0 nb0Var = (nb0) drawable;
                                    nb0Var.D = null;
                                    nb0Var.z();
                                    float f10 = nb0Var.h;
                                    if (i16 == 10) {
                                        if (z10) {
                                            nb0Var.y();
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                        nb0Var.x(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f10 >= 1.0f) {
                                            dd0Var.b(nb0Var);
                                        } else {
                                            hh.t5 t5Var = new hh.t5(dd0Var, z11, nb0Var, 18);
                                            LinkedList linkedList3 = linkedList2;
                                            linkedList3.offer(t5Var);
                                            LinkedList linkedList4 = linkedList;
                                            linkedList4.offer(Boolean.valueOf(z11));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i17 = 0; i17 < linkedList3.size(); i17++) {
                                                Runnable runnable = (Runnable) linkedList3.get(i17);
                                                Boolean bool = (Boolean) linkedList4.get(i17);
                                                if (bool != null && bool.booleanValue() != z11) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i17));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i18 = 0;
                                            while (i18 < size) {
                                                Object obj = arrayList4.get(i18);
                                                i18++;
                                                linkedList3.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new k9.a(25));
                                            int size2 = arrayList5.size();
                                            int i19 = 0;
                                            while (i19 < size2) {
                                                Object obj2 = arrayList5.get(i19);
                                                i19++;
                                                linkedList4.remove(((Integer) obj2).intValue());
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.A = imageView2;
        imageView2.setImageResource(R.drawable.fingerprint);
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView2, h7.z5.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
        final int i12 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) {

            public final dd0 f33060b;

            {
                this.f33060b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                int i13;
                boolean z11;
                boolean z12;
                int i14 = i12;
                dd0 dd0Var = this.f33060b;
                switch (i14) {
                    case 0:
                        dd0Var.k(false);
                        break;
                    case 1:
                        dd0Var.c();
                        break;
                    default:
                        LinkedList linkedList = dd0Var.J;
                        LinkedList linkedList2 = dd0Var.I;
                        lh.w8 w8Var2 = dd0Var.f27724s;
                        if (dd0Var.Q) {
                            int iIntValue = ((Integer) view.getTag()).intValue();
                            switch (iIntValue) {
                                case 0:
                                    w8Var2.b("0");
                                    z10 = false;
                                    break;
                                case 1:
                                    w8Var2.b("1");
                                    z10 = false;
                                    break;
                                case 2:
                                    w8Var2.b("2");
                                    z10 = false;
                                    break;
                                case 3:
                                    w8Var2.b("3");
                                    z10 = false;
                                    break;
                                case 4:
                                    w8Var2.b("4");
                                    z10 = false;
                                    break;
                                case 5:
                                    w8Var2.b("5");
                                    z10 = false;
                                    break;
                                case 6:
                                    w8Var2.b("6");
                                    z10 = false;
                                    break;
                                case 7:
                                    w8Var2.b("7");
                                    z10 = false;
                                    break;
                                case 8:
                                    w8Var2.b("8");
                                    z10 = false;
                                    break;
                                case 9:
                                    w8Var2.b("9");
                                    z10 = false;
                                    break;
                                case 10:
                                    dd0Var.c();
                                    z10 = false;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) w8Var2.f17015c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) w8Var2.f17014b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) w8Var2.d;
                                    if (sb2.length() == 0) {
                                        z10 = false;
                                    } else {
                                        try {
                                            w8Var2.performHapticFeedback(3);
                                        } catch (Exception e9) {
                                            FileLog.e(e9);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList;
                                        int i15 = length;
                                        while (i15 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i15);
                                            if (textView2.getAlpha() != 0.0f) {
                                                i13 = 1;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, w8Var2.c(i15)));
                                            } else {
                                                i13 = 1;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i15);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr = new float[i13];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr));
                                                float[] fArr2 = new float[i13];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr2));
                                                float[] fArr3 = new float[i13];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr3));
                                                float[] fArr4 = new float[i13];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr4));
                                                float fC = w8Var2.c(i15);
                                                float[] fArr5 = new float[i13];
                                                fArr5[0] = fC;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr5));
                                            }
                                            i15++;
                                            linkedList2 = linkedList2;
                                            iIntValue = iIntValue;
                                        }
                                        linkedList2 = linkedList2;
                                        iIntValue = iIntValue;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i16 = 0; i16 < length; i16++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i16), (Property<TextView, Float>) property5, w8Var2.c(i16)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i16), (Property<TextView, Float>) property5, w8Var2.c(i16)));
                                        }
                                        ue ueVar = (ue) w8Var2.f17017f;
                                        if (ueVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(ueVar);
                                            w8Var2.f17017f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) w8Var2.f17016e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        w8Var2.f17016e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) w8Var2.f17016e).playTogether(arrayList3);
                                        ((AnimatorSet) w8Var2.f17016e).addListener(new zc0(w8Var2, 1));
                                        ((AnimatorSet) w8Var2.f17016e).start();
                                        dd0.a((dd0) w8Var2.h);
                                        z10 = true;
                                    }
                                    break;
                                default:
                                    z10 = false;
                                    break;
                            }
                            if (((StringBuilder) w8Var2.d).length() == 4) {
                                dd0Var.k(false);
                            }
                            int i17 = iIntValue;
                            if (i17 != 11) {
                                Drawable drawable = dd0Var.f27717a;
                                if (drawable instanceof nb0) {
                                    nb0 nb0Var = (nb0) drawable;
                                    nb0Var.D = null;
                                    nb0Var.z();
                                    float f10 = nb0Var.h;
                                    if (i17 == 10) {
                                        if (z10) {
                                            nb0Var.y();
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                        nb0Var.x(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f10 >= 1.0f) {
                                            dd0Var.b(nb0Var);
                                        } else {
                                            hh.t5 t5Var = new hh.t5(dd0Var, z11, nb0Var, 18);
                                            LinkedList linkedList3 = linkedList2;
                                            linkedList3.offer(t5Var);
                                            LinkedList linkedList4 = linkedList;
                                            linkedList4.offer(Boolean.valueOf(z11));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i18 = 0; i18 < linkedList3.size(); i18++) {
                                                Runnable runnable = (Runnable) linkedList3.get(i18);
                                                Boolean bool = (Boolean) linkedList4.get(i18);
                                                if (bool != null && bool.booleanValue() != z11) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i18));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i19 = 0;
                                            while (i19 < size) {
                                                Object obj = arrayList4.get(i19);
                                                i19++;
                                                linkedList3.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new k9.a(25));
                                            int size2 = arrayList5.size();
                                            int i110 = 0;
                                            while (i110 < size2) {
                                                Object obj2 = arrayList5.get(i110);
                                                i110++;
                                                linkedList4.remove(((Integer) obj2).intValue());
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        View view = new View(context);
        this.B = view;
        view.setBackgroundColor(822083583);
        frameLayout.addView(view, h7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        y1Var.addView(frameLayout2, h7.z5.e(-1, -1, 51));
        ag.d dVar = new ag.d(context, 16);
        this.f27720e = dVar;
        frameLayout2.addView(dVar, h7.z5.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f27718b = frameLayout3;
        dVar.addView(frameLayout3, h7.z5.e(-2, -2, 49));
        TextView textViewH2 = org.telegram.messenger.y1.h(context, 1, 15.0f);
        textViewH2.setTypeface(AndroidUtilities.bold());
        textViewH2.setTextColor(-1);
        textViewH2.setText(LocaleController.getString(R.string.UnlockToUse));
        TextView textViewH3 = org.telegram.ui.Cells.pa.h(frameLayout3, textViewH2, h7.z5.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.f27719c = textViewH3;
        textViewH3.setTextSize(1, 14.0f);
        textViewH3.setTextColor(-1);
        textViewH3.setText(LocaleController.getString(R.string.EnterPINorFingerprint));
        frameLayout3.addView(textViewH3, h7.z5.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f27721f = new ArrayList(10);
        int i13 = 0;
        while (true) {
            if (i13 >= 12) {
                break;
            }
            bd0 bd0Var = new bd0(context);
            h7.b6.b(bd0Var, 0.15f, 1.5f);
            bd0Var.setTag(Integer.valueOf(i13));
            if (i13 == 11) {
                int iDp = AndroidUtilities.dp(30.0f);
                bd0Var.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, 0, 654311423, 654311423));
                bd0Var.setImage(R.drawable.filled_clear);
                bd0Var.setOnLongClickListener(new a10(this, 1));
                bd0Var.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
                l(bd0Var, R.id.passcode_btn_0);
            } else if (i13 == 10) {
                this.f27722n = bd0Var;
                int iDp2 = AndroidUtilities.dp(30.0f);
                bd0Var.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp2, iDp2, iDp2, iDp2, 0, 654311423, 654311423));
                bd0Var.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
                bd0Var.setImage(R.drawable.fingerprint);
                l(bd0Var, R.id.passcode_btn_1);
            } else {
                int iDp3 = AndroidUtilities.dp(30.0f);
                bd0Var.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp3, iDp3, iDp3, iDp3, 654311423, 1291845631, 1291845631));
                bd0Var.setContentDescription(i13 + "");
                bd0Var.setNum(i13);
                if (i13 == 0) {
                    l(bd0Var, R.id.passcode_btn_backspace);
                } else if (i13 == 9) {
                    Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
                    if (Build.VERSION.SDK_INT < 23 || activityFindActivity == null || !SharedConfig.useFingerprintLock) {
                        l(bd0Var, R.id.passcode_btn_0);
                    } else {
                        try {
                            Context context2 = ApplicationLoader.applicationContext;
                            ff.a aVar = ff.b.f6050a;
                            if (aVar.i(context2) && aVar.b(context2) && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                                l(bd0Var, R.id.passcode_btn_fingerprint);
                            } else {
                                l(bd0Var, R.id.passcode_btn_0);
                            }
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }
                } else {
                    l(bd0Var, iArr[i13 + 1]);
                }
            }
            bd0Var.setId(iArr[i13]);
            final int i14 = 2;
            bd0Var.setOnClickListener(new View.OnClickListener(this) {

                public final dd0 f33060b;

                {
                    this.f33060b = this;
                }

                @Override
                public final void onClick(View view2) {
                    boolean z10;
                    int i15;
                    boolean z11;
                    boolean z12;
                    int i16 = i14;
                    dd0 dd0Var = this.f33060b;
                    switch (i16) {
                        case 0:
                            dd0Var.k(false);
                            break;
                        case 1:
                            dd0Var.c();
                            break;
                        default:
                            LinkedList linkedList = dd0Var.J;
                            LinkedList linkedList2 = dd0Var.I;
                            lh.w8 w8Var2 = dd0Var.f27724s;
                            if (dd0Var.Q) {
                                int iIntValue = ((Integer) view2.getTag()).intValue();
                                switch (iIntValue) {
                                    case 0:
                                        w8Var2.b("0");
                                        z10 = false;
                                        break;
                                    case 1:
                                        w8Var2.b("1");
                                        z10 = false;
                                        break;
                                    case 2:
                                        w8Var2.b("2");
                                        z10 = false;
                                        break;
                                    case 3:
                                        w8Var2.b("3");
                                        z10 = false;
                                        break;
                                    case 4:
                                        w8Var2.b("4");
                                        z10 = false;
                                        break;
                                    case 5:
                                        w8Var2.b("5");
                                        z10 = false;
                                        break;
                                    case 6:
                                        w8Var2.b("6");
                                        z10 = false;
                                        break;
                                    case 7:
                                        w8Var2.b("7");
                                        z10 = false;
                                        break;
                                    case 8:
                                        w8Var2.b("8");
                                        z10 = false;
                                        break;
                                    case 9:
                                        w8Var2.b("9");
                                        z10 = false;
                                        break;
                                    case 10:
                                        dd0Var.c();
                                        z10 = false;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) w8Var2.f17015c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        ArrayList arrayList2 = (ArrayList) w8Var2.f17014b;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb2 = (StringBuilder) w8Var2.d;
                                        if (sb2.length() == 0) {
                                            z10 = false;
                                        } else {
                                            try {
                                                w8Var2.performHapticFeedback(3);
                                            } catch (Exception e9) {
                                                FileLog.e(e9);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int length = sb2.length() - 1;
                                            if (length != 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            linkedList = linkedList;
                                            int i17 = length;
                                            while (i17 < 4) {
                                                TextView textView2 = (TextView) arrayList2.get(i17);
                                                if (textView2.getAlpha() != 0.0f) {
                                                    i15 = 1;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, w8Var2.c(i17)));
                                                } else {
                                                    i15 = 1;
                                                }
                                                TextView textView3 = (TextView) arrayList.get(i17);
                                                if (textView3.getAlpha() != 0.0f) {
                                                    float[] fArr = new float[i15];
                                                    fArr[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr));
                                                    float[] fArr2 = new float[i15];
                                                    fArr2[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr2));
                                                    float[] fArr3 = new float[i15];
                                                    fArr3[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr3));
                                                    float[] fArr4 = new float[i15];
                                                    fArr4[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr4));
                                                    float fC = w8Var2.c(i17);
                                                    float[] fArr5 = new float[i15];
                                                    fArr5[0] = fC;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr5));
                                                }
                                                i17++;
                                                linkedList2 = linkedList2;
                                                iIntValue = iIntValue;
                                            }
                                            linkedList2 = linkedList2;
                                            iIntValue = iIntValue;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i18 = 0; i18 < length; i18++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), (Property<TextView, Float>) property5, w8Var2.c(i18)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), (Property<TextView, Float>) property5, w8Var2.c(i18)));
                                            }
                                            ue ueVar = (ue) w8Var2.f17017f;
                                            if (ueVar != null) {
                                                AndroidUtilities.cancelRunOnUIThread(ueVar);
                                                w8Var2.f17017f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) w8Var2.f17016e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            w8Var2.f17016e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) w8Var2.f17016e).playTogether(arrayList3);
                                            ((AnimatorSet) w8Var2.f17016e).addListener(new zc0(w8Var2, 1));
                                            ((AnimatorSet) w8Var2.f17016e).start();
                                            dd0.a((dd0) w8Var2.h);
                                            z10 = true;
                                        }
                                        break;
                                    default:
                                        z10 = false;
                                        break;
                                }
                                if (((StringBuilder) w8Var2.d).length() == 4) {
                                    dd0Var.k(false);
                                }
                                int i19 = iIntValue;
                                if (i19 != 11) {
                                    Drawable drawable = dd0Var.f27717a;
                                    if (drawable instanceof nb0) {
                                        nb0 nb0Var = (nb0) drawable;
                                        nb0Var.D = null;
                                        nb0Var.z();
                                        float f10 = nb0Var.h;
                                        if (i19 == 10) {
                                            if (z10) {
                                                nb0Var.y();
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                            nb0Var.x(true);
                                            z12 = true;
                                        }
                                        if (z12) {
                                            if (f10 >= 1.0f) {
                                                dd0Var.b(nb0Var);
                                            } else {
                                                hh.t5 t5Var = new hh.t5(dd0Var, z11, nb0Var, 18);
                                                LinkedList linkedList3 = linkedList2;
                                                linkedList3.offer(t5Var);
                                                LinkedList linkedList4 = linkedList;
                                                linkedList4.offer(Boolean.valueOf(z11));
                                                ArrayList arrayList4 = new ArrayList();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (int i110 = 0; i110 < linkedList3.size(); i110++) {
                                                    Runnable runnable = (Runnable) linkedList3.get(i110);
                                                    Boolean bool = (Boolean) linkedList4.get(i110);
                                                    if (bool != null && bool.booleanValue() != z11) {
                                                        arrayList4.add(runnable);
                                                        arrayList5.add(Integer.valueOf(i110));
                                                    }
                                                }
                                                int size = arrayList4.size();
                                                int i111 = 0;
                                                while (i111 < size) {
                                                    Object obj = arrayList4.get(i111);
                                                    i111++;
                                                    linkedList3.remove((Runnable) obj);
                                                }
                                                Collections.sort(arrayList5, new k9.a(25));
                                                int size2 = arrayList5.size();
                                                int i112 = 0;
                                                while (i112 < size2) {
                                                    Object obj2 = arrayList5.get(i112);
                                                    i112++;
                                                    linkedList4.remove(((Integer) obj2).intValue());
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            this.f27721f.add(bd0Var);
            i13++;
        }
        for (i10 = 11; i10 >= 0; i10--) {
            this.f27720e.addView((FrameLayout) this.f27721f.get(i10), h7.z5.e(60, 60, 51));
        }
        d();
    }

    public static void a(dd0 dd0Var) {
        FrameLayout frameLayout = dd0Var.f27718b;
        lh.w8 w8Var = dd0Var.f27724s;
        boolean z10 = w8Var == null || ((StringBuilder) w8Var.d).length() > 0;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            org.telegram.messenger.rl.o(frameLayout.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f), er.h, 320L);
        }
    }

    public static void l(bd0 bd0Var, int i10) {
        bd0Var.setNextFocusForwardId(i10);
        if (Build.VERSION.SDK_INT >= 22) {
            bd0Var.setAccessibilityTraversalBefore(i10);
        }
    }

    public final void b(nb0 nb0Var) {
        o1.j jVar = this.H;
        if (jVar != null && jVar.f19141f) {
            jVar.c();
        }
        hb.a aVar = new hb.a(0.0f);
        nb0Var.D = new vu(aVar, 8);
        nb0Var.z();
        o1.j jVar2 = new o1.j(aVar);
        jVar2.f19147u = org.telegram.ui.Cells.pa.k(100.0f, 300.0f, 1.0f);
        this.H = jVar2;
        int i10 = 4;
        jVar2.a(new nh.a4(i10, this, nb0Var));
        this.H.b(new e7(nb0Var, i10));
        this.H.f();
    }

    public final void c() {
        Activity activityFindActivity;
        fd0 fd0Var;
        if (Build.VERSION.SDK_INT >= 23 && (activityFindActivity = AndroidUtilities.findActivity(getContext())) != null && this.f27722n.getVisibility() == 0 && !ApplicationLoader.mainInterfacePaused) {
            if (activityFindActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activityFindActivity;
                ArrayList arrayList = launchActivity.f35543x0;
                if (!arrayList.isEmpty() || (fd0Var = launchActivity.f35541w0) == null) {
                    if (i0.a.i(1, arrayList) != this) {
                        return;
                    }
                } else if (this != fd0Var.f28378b) {
                    return;
                }
            }
            try {
                if (new a5.n(new androidx.biometric.s(getContext(), 0)).g(15) == 0 && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    a9.i iVar = new a9.i(LaunchActivity.C1, f0.e.e(getContext()), new vc0(this));
                    d5.x xVar = new d5.x();
                    xVar.f4850b = LocaleController.getString(R.string.UnlockToUse);
                    xVar.d = LocaleController.getString(R.string.UsePIN);
                    xVar.f4849a = 15;
                    iVar.L(xVar.e(), null);
                    m(false);
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    public final void d() {
        Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
        boolean z10 = false;
        if (Build.VERSION.SDK_INT < 23 || activityFindActivity == null || !SharedConfig.useFingerprintLock) {
            this.f27722n.setVisibility(8);
        } else {
            try {
                Context context = ApplicationLoader.applicationContext;
                ff.a aVar = ff.b.f6050a;
                if (aVar.i(context) && aVar.b(context) && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    try {
                        this.f27722n.setVisibility(0);
                        z10 = true;
                    } catch (Throwable th) {
                        th = th;
                        z10 = true;
                        FileLog.e(th);
                        this.f27722n.setVisibility(8);
                    }
                } else {
                    this.f27722n.setVisibility(8);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (SharedConfig.passcodeType == 1) {
            this.A.setVisibility(this.f27722n.getVisibility());
        }
        this.f27719c.setText(LocaleController.getString(z10 ? R.string.EnterPINorFingerprint : R.string.EnterPIN));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.didGenerateFingerprintKeyPair) {
            if (i10 != NotificationCenter.passcodeDismissed || objArr[0] == this) {
                return;
            }
            setVisibility(8);
            return;
        }
        d();
        if (((Boolean) objArr[0]).booleanValue() && SharedConfig.appLocked) {
            c();
        }
    }

    public final void e() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime > SharedConfig.lastUptimeMillis) {
            long j10 = SharedConfig.passcodeRetryInMs - (jElapsedRealtime - SharedConfig.lastUptimeMillis);
            SharedConfig.passcodeRetryInMs = j10;
            if (j10 < 0) {
                SharedConfig.passcodeRetryInMs = 0L;
            }
        }
        SharedConfig.lastUptimeMillis = jElapsedRealtime;
        SharedConfig.saveConfig();
        long j11 = SharedConfig.passcodeRetryInMs;
        EditTextBoldCursor editTextBoldCursor = this.f27723r;
        FrameLayout frameLayout = this.h;
        m.i3 i3Var = this.N;
        TextView textView = this.f27726x;
        if (j11 <= 0) {
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            if (textView.getVisibility() == 0) {
                textView.setVisibility(4);
                frameLayout.setVisibility(0);
                m(true);
                if (SharedConfig.passcodeType == 1) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            }
            return;
        }
        int iMax = Math.max(1, (int) Math.ceil(j11 / 1000.0d));
        if (iMax != this.O) {
            textView.setText(LocaleController.formatString(R.string.TooManyTries, LocaleController.formatPluralString("Seconds", iMax, new Object[0])));
            this.O = iMax;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            frameLayout.setVisibility(4);
            m(false);
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        AndroidUtilities.runOnUIThread(i3Var, 100L);
    }

    public final boolean g() {
        lh.a4 a4Var = this.P;
        if (a4Var == null || !a4Var.c()) {
            return true;
        }
        AndroidUtilities.hideKeyboard(this.f27723r);
        return false;
    }

    public final void i() {
        e();
        if (this.f27726x.getVisibility() != 0) {
            if (SharedConfig.passcodeType == 1) {
                EditTextBoldCursor editTextBoldCursor = this.f27723r;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                }
                AndroidUtilities.runOnUIThread(new sc0(this, 0), 200L);
            }
            c();
        }
    }

    public final void j(boolean z10, int i10, int i11, org.telegram.ui.a30 a30Var) {
        View currentFocus;
        boolean z11;
        int i12;
        int i13;
        d();
        e();
        Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
        int i14 = SharedConfig.passcodeType;
        TextView textView = this.f27726x;
        EditTextBoldCursor editTextBoldCursor = this.f27723r;
        if (i14 == 1) {
            if (!z10 && textView.getVisibility() != 0 && editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            }
        } else if (activityFindActivity != null && (currentFocus = activityFindActivity.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            AndroidUtilities.hideKeyboard(activityFindActivity.getCurrentFocus());
        }
        if (getVisibility() == 0) {
            return;
        }
        setTranslationY(0.0f);
        m9 m9Var = null;
        this.f27717a = null;
        boolean z12 = org.telegram.ui.ActionBar.g6.r0() instanceof nb0;
        ag.y1 y1Var = this.v;
        if (z12) {
            z11 = !org.telegram.ui.ActionBar.g6.I.q();
            this.f27717a = org.telegram.ui.ActionBar.g6.r0();
            y1Var.setBackgroundColor(-1090519040);
        } else {
            if (org.telegram.ui.ActionBar.g6.W && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.g6.H0()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.g6.H0())) {
                org.telegram.ui.ActionBar.z5 z5Var = org.telegram.ui.ActionBar.g6.I.f22949e0;
                if (z5Var != null && (i12 = z5Var.d) != 0 && (i13 = z5Var.f24008e) != 0) {
                    m9Var = new m9(m9.d(z5Var.h), new int[]{i12, i13});
                }
                this.f27717a = m9Var;
                if (m9Var == null) {
                    this.f27717a = org.telegram.ui.ActionBar.g6.r0();
                }
                if (this.f27717a instanceof m9) {
                    y1Var.setBackgroundColor(570425344);
                } else {
                    y1Var.setBackgroundColor(-1090519040);
                }
            } else if ("d".equals(org.telegram.ui.ActionBar.g6.H0())) {
                y1Var.setBackgroundColor(-11436898);
            } else {
                String strH0 = org.telegram.ui.ActionBar.g6.H0();
                if (org.telegram.ui.ActionBar.g6.f23156j0 || "CJz3BZ6YGEYBAAAABboWp6SAv04".equals(strH0) || "qeZWES8rGVIEAAAARfWlK1lnfiI".equals(strH0)) {
                    y1Var.setBackgroundColor(-11436898);
                } else {
                    Drawable drawableR0 = org.telegram.ui.ActionBar.g6.r0();
                    this.f27717a = drawableR0;
                    if (drawableR0 instanceof m9) {
                        y1Var.setBackgroundColor(570425344);
                    } else if (drawableR0 != null) {
                        y1Var.setBackgroundColor(-1090519040);
                    } else {
                        y1Var.setBackgroundColor(-11436898);
                    }
                }
            }
            z11 = false;
        }
        Drawable drawable = this.f27717a;
        if (drawable instanceof nb0) {
            nb0 nb0Var = (nb0) drawable;
            int[] iArr = nb0Var.f30917a;
            if (z11) {
                int[] iArr2 = new int[iArr.length];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    iArr2[i15] = org.telegram.ui.ActionBar.g6.b(0.14f, 0.0f, iArr[i15]);
                }
                iArr = iArr2;
            }
            this.f27717a = new nb0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (nb0Var.f30939u == null || nb0Var.f30935q >= 0) {
                y1Var.setBackgroundColor(570425344);
            } else {
                y1Var.setBackgroundColor(2130706432);
            }
            ((nb0) this.f27717a).r(y1Var);
        }
        this.f27725w.setText(LocaleController.getString(R.string.AppLocked));
        int i16 = SharedConfig.passcodeType;
        ImageView imageView = this.A;
        ImageView imageView2 = this.f27727y;
        ag.d dVar = this.f27720e;
        lh.w8 w8Var = this.f27724s;
        if (i16 == 0) {
            if (textView.getVisibility() != 0) {
                dVar.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            w8Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i16 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            dVar.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            w8Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.f27722n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        lh.w8.a(w8Var, false);
        if (z10) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new yc0(this, i10, i11, a30Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.L = 1.0f;
            f(1.0f);
            ri0 ri0Var = this.E;
            ri0Var.setScaleX(1.0f);
            ri0Var.setScaleY(1.0f);
            ri0Var.i();
            ri0Var.getAnimatedDrawable().L(38, false, false);
            if (a30Var != null) {
                a30Var.run();
            }
        }
        setOnTouchListener(new kh.e(19));
    }

    public final void k(boolean z10) {
        String string;
        EditTextBoldCursor editTextBoldCursor = this.f27723r;
        if (!z10) {
            if (SharedConfig.passcodeRetryInMs > 0) {
                return;
            }
            int i10 = SharedConfig.passcodeType;
            lh.w8 w8Var = this.f27724s;
            if (i10 == 0) {
                string = ((StringBuilder) w8Var.d).toString();
            } else {
                string = i10 == 1 ? editTextBoldCursor.getText().toString() : "";
            }
            int length = string.length();
            FrameLayout frameLayout = this.f27718b;
            if (length == 0) {
                BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                int i11 = -this.M;
                this.M = i11;
                AndroidUtilities.shakeViewSpring(frameLayout, i11);
                return;
            }
            if (!SharedConfig.checkPasscode(string)) {
                SharedConfig.increaseBadPasscodeTries();
                if (SharedConfig.passcodeRetryInMs > 0) {
                    e();
                }
                editTextBoldCursor.setText("");
                lh.w8.a(w8Var, true);
                BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                int i12 = -this.M;
                this.M = i12;
                AndroidUtilities.shakeViewSpring(frameLayout, i12);
                Drawable drawable = this.f27717a;
                if (drawable instanceof nb0) {
                    nb0 nb0Var = (nb0) drawable;
                    o1.j jVar = this.H;
                    if (jVar != null) {
                        jVar.c();
                        nb0Var.h = 1.0f;
                        nb0Var.z();
                    }
                    if (nb0Var.h >= 1.0f) {
                        nb0Var.m(true);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        SharedConfig.badPasscodeTries = 0;
        editTextBoldCursor.clearFocus();
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        if (Build.VERSION.SDK_INT >= 23 && FingerprintController.isKeyReady() && FingerprintController.checkDeviceFingerprintsChanged()) {
            FingerprintController.deleteInvalidKey();
        }
        SharedConfig.appLocked = false;
        SharedConfig.saveConfig();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
        setOnTouchListener(null);
        cd0 cd0Var = this.G;
        if (cd0Var != null) {
            cd0Var.h(this);
        }
        ri0 ri0Var = this.E;
        ri0Var.getAnimatedDrawable().N(71);
        ri0Var.getAnimatedDrawable().L(37, false, false);
        ri0Var.d();
        AndroidUtilities.runOnUIThread(new sc0(this, 1));
    }

    public final void m(boolean z10) {
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.Q = z10;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f27720e.getAlpha(), z10 ? 1.0f : 0.0f);
        this.R = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new tc0(this, 1));
        this.R.addListener(new org.telegram.ui.go(17, this, z10));
        this.R.setInterpolator(er.h);
        this.R.setDuration(320L);
        this.R.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.passcodeDismissed);
        if (this.P == null && (getParent() instanceof View)) {
            this.P = new lh.a4((View) getParent(), false, new v2(this, 8));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.passcodeDismissed);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View rootView = getRootView();
        int height = (rootView.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.getViewInset(rootView);
        Rect rect = this.F;
        getWindowVisibleDisplayFrame(rect);
        this.C = height - (rect.bottom - rect.top);
        if (SharedConfig.passcodeType == 1 && (AndroidUtilities.isTablet() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            int iIntValue = frameLayout.getTag() != null ? ((Integer) frameLayout.getTag()).intValue() : 0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((iIntValue + layoutParams.height) - (this.C / 2)) - AndroidUtilities.statusBarHeight;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z10, i10, i11, i12, i13);
        TextView textView = this.f27725w;
        int[] iArr = this.S;
        textView.getLocationInWindow(iArr);
        boolean zIsTablet = AndroidUtilities.isTablet();
        ri0 ri0Var = this.E;
        if (zIsTablet || getContext().getResources().getConfiguration().orientation != 2) {
            int iDp = iArr[1] - AndroidUtilities.dp(100.0f);
            this.D = iDp;
            ri0Var.setTranslationY(iDp);
        } else {
            int iDp2 = iArr[1] - AndroidUtilities.dp(100.0f);
            this.D = iDp2;
            ri0Var.setTranslationY(iDp2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iX;
        float f10;
        float f11;
        int size = View.MeasureSpec.getSize(i10);
        int iDp = AndroidUtilities.displaySize.y;
        int iDp2 = AndroidUtilities.dp(28.0f);
        int iDp3 = AndroidUtilities.dp(16.0f);
        int iDp4 = AndroidUtilities.dp(60.0f);
        boolean z10 = !AndroidUtilities.isTablet() && getContext().getResources().getConfiguration().orientation == 2;
        View view = this.B;
        if (view != null) {
            view.setVisibility(SharedConfig.passcodeType == 1 ? 0 : 8);
        }
        ri0 ri0Var = this.E;
        ag.d dVar = this.f27720e;
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
            ri0Var.setTranslationX((f11 / f10) - AndroidUtilities.dp(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams.width = SharedConfig.passcodeType == 0 ? size / 2 : size;
            layoutParams.height = AndroidUtilities.dp(180.0f);
            layoutParams.topMargin = org.telegram.messenger.rl.x(140.0f, iDp, 2) + (SharedConfig.passcodeType == 0 ? AndroidUtilities.dp(40.0f) : 0);
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = iDp;
            int i12 = size / 2;
            layoutParams2.leftMargin = i12;
            layoutParams2.topMargin = AndroidUtilities.statusBarHeight;
            layoutParams2.width = i12;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * iDp3) + (iDp4 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams3.width = (Math.max(0, 2) * iDp2) + (iDp4 * 3);
            layoutParams3.gravity = 17;
            dVar.setLayoutParams(layoutParams3);
        } else {
            ri0Var.setTranslationX((size / 2.0f) - AndroidUtilities.dp(29.0f));
            int iX2 = AndroidUtilities.statusBarHeight;
            if (AndroidUtilities.isTablet()) {
                if (size > AndroidUtilities.dp(498.0f)) {
                    iX = org.telegram.messenger.rl.x(498.0f, size, 2);
                    size = AndroidUtilities.dp(498.0f);
                } else {
                    iX = 0;
                }
                if (iDp > AndroidUtilities.dp(528.0f)) {
                    iX2 = org.telegram.messenger.rl.x(528.0f, iDp, 2);
                    iDp = AndroidUtilities.dp(528.0f);
                }
            } else {
                iX = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams4.height = (iDp / 3) + (SharedConfig.passcodeType == 0 ? AndroidUtilities.dp(40.0f) : 0);
            layoutParams4.width = size;
            layoutParams4.topMargin = iX2;
            layoutParams4.leftMargin = iX;
            frameLayout2.setTag(Integer.valueOf(iX2));
            frameLayout2.setLayoutParams(layoutParams4);
            int i13 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams5.height = (Math.max(0, 3) * iDp3) + (iDp4 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams5.width = (Math.max(0, 2) * iDp2) + (iDp4 * 3);
            if (AndroidUtilities.isTablet()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            dVar.setLayoutParams(layoutParams5);
            int i14 = iDp - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.leftMargin = iX;
            if (AndroidUtilities.isTablet()) {
                layoutParams6.topMargin = (iDp - i14) / 2;
            } else {
                layoutParams6.topMargin = i13;
            }
            layoutParams6.width = size;
            layoutParams6.height = -1;
            frameLayout.setLayoutParams(layoutParams6);
        }
        int iDp5 = AndroidUtilities.dp(z10 ? 52.0f : 82.0f);
        int i15 = 0;
        while (i15 < 12) {
            int i16 = 10;
            if (i15 != 0) {
                if (i15 == 10) {
                    i16 = 11;
                } else {
                    i16 = i15 == 11 ? 9 : i15 - 1;
                }
            }
            FrameLayout frameLayout3 = (FrameLayout) this.f27721f.get(i15);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((iDp4 + iDp3) * (i16 / 3)) + iDp5;
            layoutParams7.leftMargin = (iDp4 + iDp2) * (i16 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
            i15++;
        }
        super.onMeasure(i10, i11);
    }

    public void setDelegate(cd0 cd0Var) {
        this.G = cd0Var;
    }

    public void f(float f10) {
    }

    public void h() {
    }
}
