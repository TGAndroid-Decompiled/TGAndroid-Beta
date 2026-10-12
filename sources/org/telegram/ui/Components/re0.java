package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
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
public class re0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] f28810e0 = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView E;
    public final View F;
    public int G;
    public int H;
    public final bk0 I;
    public final Rect J;
    public qe0 K;
    public boolean L;
    public AnimatorSet M;
    public AnimatorSet N;
    public ValueAnimator O;
    public o1.k P;
    public final LinkedList Q;
    public final LinkedList R;
    public final ArrayList S;
    public float T;
    public int U;
    public final org.telegram.ui.Cells.t6 V;
    public int W;
    public Drawable f28811a;
    public di.h4 f28812a0;
    public final FrameLayout f28813b;
    public boolean f28814b0;
    public final TextView f28815c;
    public ValueAnimator f28816c0;
    public final FrameLayout d;
    public final int[] f28817d0;
    public final bi.i5 e;
    public final ArrayList f28818f;
    public final FrameLayout h;
    public final pe0 f28819n;
    public final EditTextBoldCursor f28820r;
    public final di.i9 f28821s;
    public final ah.v v;
    public final TextView f28822w;
    public final TextView f28823x;
    public final ImageView f28824y;

    public re0(Context context) {
        super(context);
        int i10;
        String string = LocaleController.getString(R.string.UnlockToUse);
        this.G = 0;
        this.J = new Rect();
        this.Q = new LinkedList();
        this.R = new LinkedList();
        this.S = new ArrayList();
        this.U = -12;
        this.V = new org.telegram.ui.Cells.t6(this, 17);
        this.f28814b0 = true;
        this.f28817d0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        ah.v vVar = new ah.v(this, context);
        this.v = vVar;
        vVar.setWillNotDraw(false);
        addView(vVar, w7.a6.d(-1.0f, -1));
        ?? imageView = new ImageView(context);
        this.I = imageView;
        imageView.f(R.raw.passcode_lock, 58, 58, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, w7.a6.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        vVar.addView(frameLayout, w7.a6.d(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f28822w = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setAlpha(0.0f);
        TextView h = org.telegram.ui.Cells.d0.h(frameLayout, textView, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 128.0f, -2, 81), context);
        this.f28823x = h;
        h.setTextColor(-1);
        h.setTextSize(1, 15.0f);
        h.setGravity(1);
        h.setVisibility(4);
        vVar.addView(h, w7.a6.e(-2, -2, 17));
        di.i9 i9Var = new di.i9(this, context);
        this.f28821s = i9Var;
        frameLayout.addView(i9Var, w7.a6.a(-2.0f, 70.0f, 0.0f, 70.0f, 46.0f, -1, 81));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f28820r = editTextBoldCursor;
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
        frameLayout.addView(editTextBoldCursor, w7.a6.a(-2.0f, 70.0f, 0.0f, 70.0f, 0.0f, -1, 81));
        editTextBoldCursor.setOnEditorActionListener(new e1(this, 4));
        editTextBoldCursor.addTextChangedListener(new di.h2(this, 10));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new ji.c1(1));
        ImageView imageView2 = new ImageView(context);
        this.f28824y = imageView2;
        imageView2.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView2, w7.a6.a(60.0f, 0.0f, 0.0f, 10.0f, 4.0f, 60, 85));
        imageView2.setContentDescription(LocaleController.getString(R.string.Done));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final re0 f25940b;

            {
                this.f25940b = this;
            }

            @Override
            public final void onClick(View view) {
                LinkedList linkedList;
                LinkedList linkedList2;
                int i11;
                boolean z10;
                boolean z11;
                LinkedList linkedList3;
                int i12;
                int i13;
                int i14;
                boolean z12;
                boolean z13;
                int i15 = r2;
                re0 re0Var = this.f25940b;
                switch (i15) {
                    case 0:
                        re0Var.m(false);
                        return;
                    case 1:
                        re0Var.c();
                        return;
                    default:
                        LinkedList linkedList4 = re0Var.R;
                        LinkedList linkedList5 = re0Var.Q;
                        di.i9 i9Var2 = re0Var.f28821s;
                        if (re0Var.f28814b0 && !re0Var.L) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("0");
                                    z11 = z10;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("1");
                                    z11 = z10;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("2");
                                    z11 = z10;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("3");
                                    z11 = z10;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("4");
                                    z11 = z10;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("5");
                                    z11 = z10;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("6");
                                    z11 = z10;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("7");
                                    z11 = z10;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("8");
                                    z11 = z10;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("9");
                                    z11 = z10;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    re0Var.c();
                                    z11 = z10;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) i9Var2.f7082c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z10 = false;
                                    ArrayList arrayList2 = (ArrayList) i9Var2.f7081b;
                                    Property property5 = View.TRANSLATION_X;
                                    int i16 = 1;
                                    StringBuilder sb2 = (StringBuilder) i9Var2.d;
                                    if (sb2.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i11 = intValue;
                                        z11 = z10;
                                        break;
                                    } else {
                                        try {
                                            i9Var2.performHapticFeedback(3);
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
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i12 = intValue;
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
                                                fArr5[0] = i9Var2.c(i17);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i12 = intValue;
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
                                                fArr10[0] = i9Var2.c(i17);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i14 = i17;
                                            }
                                            i17 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            intValue = i12;
                                            i16 = 1;
                                        }
                                        linkedList2 = linkedList5;
                                        i11 = intValue;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), property5, i9Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), property5, i9Var2.c(i18)));
                                        }
                                        kf kfVar = (kf) i9Var2.f7083f;
                                        if (kfVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(kfVar);
                                            i9Var2.f7083f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) i9Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        i9Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) i9Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) i9Var2.e).addListener(new ne0(i9Var2, 1));
                                        ((AnimatorSet) i9Var2.e).start();
                                        re0.a((re0) i9Var2.h);
                                        z11 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    z11 = z10;
                                    break;
                            }
                            if (((StringBuilder) i9Var2.d).length() == 4) {
                                re0Var.m(z10);
                            }
                            int i19 = i11;
                            if (i19 != 11) {
                                Drawable drawable = re0Var.f28811a;
                                if (drawable instanceof cd0) {
                                    cd0 cd0Var = (cd0) drawable;
                                    cd0Var.D = null;
                                    cd0Var.z();
                                    float f7 = cd0Var.h;
                                    if (i19 == 10) {
                                        if (z11) {
                                            cd0Var.y();
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                        cd0Var.x(true);
                                        z13 = true;
                                    }
                                    if (z13) {
                                        if (f7 >= 1.0f) {
                                            re0Var.b(cd0Var);
                                            return;
                                        }
                                        di.x0 x0Var = new di.x0(re0Var, z12, cd0Var, 22);
                                        LinkedList linkedList6 = linkedList2;
                                        linkedList6.offer(x0Var);
                                        LinkedList linkedList7 = linkedList;
                                        linkedList7.offer(Boolean.valueOf(z12));
                                        ArrayList arrayList4 = new ArrayList();
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i20 = 0; i20 < linkedList6.size(); i20++) {
                                            Runnable runnable = (Runnable) linkedList6.get(i20);
                                            Boolean bool = (Boolean) linkedList7.get(i20);
                                            if (bool != null && bool.booleanValue() != z12) {
                                                arrayList4.add(runnable);
                                                arrayList5.add(Integer.valueOf(i20));
                                            }
                                        }
                                        int size = arrayList4.size();
                                        int i21 = 0;
                                        while (i21 < size) {
                                            Object obj = arrayList4.get(i21);
                                            i21++;
                                            linkedList6.remove((Runnable) obj);
                                        }
                                        Collections.sort(arrayList5, new org.telegram.ui.ActionBar.l5(15));
                                        int size2 = arrayList5.size();
                                        int i22 = 0;
                                        while (i22 < size2) {
                                            Object obj2 = arrayList5.get(i22);
                                            i22++;
                                            linkedList7.remove(((Integer) obj2).intValue());
                                        }
                                        return;
                                    }
                                    return;
                                }
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
        frameLayout.addView(imageView3, w7.a6.a(60.0f, 10.0f, 0.0f, 0.0f, 4.0f, 60, 83));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final re0 f25940b;

            {
                this.f25940b = this;
            }

            @Override
            public final void onClick(View view) {
                LinkedList linkedList;
                LinkedList linkedList2;
                int i11;
                boolean z10;
                boolean z11;
                LinkedList linkedList3;
                int i12;
                int i13;
                int i14;
                boolean z12;
                boolean z13;
                int i15 = r2;
                re0 re0Var = this.f25940b;
                switch (i15) {
                    case 0:
                        re0Var.m(false);
                        return;
                    case 1:
                        re0Var.c();
                        return;
                    default:
                        LinkedList linkedList4 = re0Var.R;
                        LinkedList linkedList5 = re0Var.Q;
                        di.i9 i9Var2 = re0Var.f28821s;
                        if (re0Var.f28814b0 && !re0Var.L) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("0");
                                    z11 = z10;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("1");
                                    z11 = z10;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("2");
                                    z11 = z10;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("3");
                                    z11 = z10;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("4");
                                    z11 = z10;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("5");
                                    z11 = z10;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("6");
                                    z11 = z10;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("7");
                                    z11 = z10;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("8");
                                    z11 = z10;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    i9Var2.b("9");
                                    z11 = z10;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    re0Var.c();
                                    z11 = z10;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) i9Var2.f7082c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z10 = false;
                                    ArrayList arrayList2 = (ArrayList) i9Var2.f7081b;
                                    Property property5 = View.TRANSLATION_X;
                                    int i16 = 1;
                                    StringBuilder sb2 = (StringBuilder) i9Var2.d;
                                    if (sb2.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i11 = intValue;
                                        z11 = z10;
                                        break;
                                    } else {
                                        try {
                                            i9Var2.performHapticFeedback(3);
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
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i12 = intValue;
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
                                                fArr5[0] = i9Var2.c(i17);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i12 = intValue;
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
                                                fArr10[0] = i9Var2.c(i17);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i14 = i17;
                                            }
                                            i17 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            intValue = i12;
                                            i16 = 1;
                                        }
                                        linkedList2 = linkedList5;
                                        i11 = intValue;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), property5, i9Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), property5, i9Var2.c(i18)));
                                        }
                                        kf kfVar = (kf) i9Var2.f7083f;
                                        if (kfVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(kfVar);
                                            i9Var2.f7083f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) i9Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        i9Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) i9Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) i9Var2.e).addListener(new ne0(i9Var2, 1));
                                        ((AnimatorSet) i9Var2.e).start();
                                        re0.a((re0) i9Var2.h);
                                        z11 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    z11 = z10;
                                    break;
                            }
                            if (((StringBuilder) i9Var2.d).length() == 4) {
                                re0Var.m(z10);
                            }
                            int i19 = i11;
                            if (i19 != 11) {
                                Drawable drawable = re0Var.f28811a;
                                if (drawable instanceof cd0) {
                                    cd0 cd0Var = (cd0) drawable;
                                    cd0Var.D = null;
                                    cd0Var.z();
                                    float f7 = cd0Var.h;
                                    if (i19 == 10) {
                                        if (z11) {
                                            cd0Var.y();
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                        cd0Var.x(true);
                                        z13 = true;
                                    }
                                    if (z13) {
                                        if (f7 >= 1.0f) {
                                            re0Var.b(cd0Var);
                                            return;
                                        }
                                        di.x0 x0Var = new di.x0(re0Var, z12, cd0Var, 22);
                                        LinkedList linkedList6 = linkedList2;
                                        linkedList6.offer(x0Var);
                                        LinkedList linkedList7 = linkedList;
                                        linkedList7.offer(Boolean.valueOf(z12));
                                        ArrayList arrayList4 = new ArrayList();
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i20 = 0; i20 < linkedList6.size(); i20++) {
                                            Runnable runnable = (Runnable) linkedList6.get(i20);
                                            Boolean bool = (Boolean) linkedList7.get(i20);
                                            if (bool != null && bool.booleanValue() != z12) {
                                                arrayList4.add(runnable);
                                                arrayList5.add(Integer.valueOf(i20));
                                            }
                                        }
                                        int size = arrayList4.size();
                                        int i21 = 0;
                                        while (i21 < size) {
                                            Object obj = arrayList4.get(i21);
                                            i21++;
                                            linkedList6.remove((Runnable) obj);
                                        }
                                        Collections.sort(arrayList5, new org.telegram.ui.ActionBar.l5(15));
                                        int size2 = arrayList5.size();
                                        int i22 = 0;
                                        while (i22 < size2) {
                                            Object obj2 = arrayList5.get(i22);
                                            i22++;
                                            linkedList7.remove(((Integer) obj2).intValue());
                                        }
                                        return;
                                    }
                                    return;
                                }
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
        frameLayout.addView(view, w7.a6.b(-1.0f, 1.0f / AndroidUtilities.density, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        vVar.addView(frameLayout2, w7.a6.e(-1, -1, 51));
        bi.i5 i5Var = new bi.i5(context, 17);
        this.e = i5Var;
        frameLayout2.addView(i5Var, w7.a6.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f28813b = frameLayout3;
        i5Var.addView(frameLayout3, w7.a6.e(-2, -2, 49));
        TextView g10 = org.telegram.messenger.q.g(context, 1, 15.0f);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextColor(-1);
        g10.setText(string);
        TextView h10 = org.telegram.ui.Cells.d0.h(frameLayout3, g10, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 49), context);
        this.f28815c = h10;
        h10.setTextSize(1, 14.0f);
        h10.setTextColor(-1);
        h10.setText((CharSequence) null);
        frameLayout3.addView(h10, w7.a6.a(-2.0f, 0.0f, 23.0f, 0.0f, 0.0f, -2, 49));
        this.f28818f = new ArrayList(10);
        int i11 = 0;
        while (true) {
            if (i11 >= 12) {
                break;
            }
            pe0 pe0Var = new pe0(context);
            w7.c6.b(pe0Var, 0.15f, 1.5f);
            pe0Var.setTag(Integer.valueOf(i11));
            int[] iArr = f28810e0;
            if (i11 == 11) {
                int dp = AndroidUtilities.dp(30.0f);
                pe0Var.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 0, 654311423, 654311423));
                pe0Var.setImage(R.drawable.filled_clear);
                pe0Var.setOnLongClickListener(new y10(this, 1));
                pe0Var.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
                int i12 = R.id.passcode_btn_0;
                pe0Var.setNextFocusForwardId(i12);
                pe0Var.setAccessibilityTraversalBefore(i12);
            } else if (i11 == 10) {
                this.f28819n = pe0Var;
                int dp2 = AndroidUtilities.dp(30.0f);
                pe0Var.setBackground(org.telegram.ui.ActionBar.g6.j0(dp2, dp2, dp2, dp2, 0, 654311423, 654311423));
                pe0Var.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
                pe0Var.setImage(R.drawable.fingerprint);
                int i13 = R.id.passcode_btn_1;
                pe0Var.setNextFocusForwardId(i13);
                pe0Var.setAccessibilityTraversalBefore(i13);
            } else {
                int dp3 = AndroidUtilities.dp(30.0f);
                pe0Var.setBackground(org.telegram.ui.ActionBar.g6.j0(dp3, dp3, dp3, dp3, 654311423, 1291845631, 1291845631));
                pe0Var.setContentDescription(i11 + "");
                pe0Var.setNum(i11);
                if (i11 == 0) {
                    int i14 = R.id.passcode_btn_backspace;
                    pe0Var.setNextFocusForwardId(i14);
                    pe0Var.setAccessibilityTraversalBefore(i14);
                } else if (i11 == 9) {
                    if (f()) {
                        int i15 = R.id.passcode_btn_fingerprint;
                        pe0Var.setNextFocusForwardId(i15);
                        pe0Var.setAccessibilityTraversalBefore(i15);
                    } else {
                        int i16 = R.id.passcode_btn_0;
                        pe0Var.setNextFocusForwardId(i16);
                        pe0Var.setAccessibilityTraversalBefore(i16);
                    }
                } else {
                    int i17 = iArr[i11 + 1];
                    pe0Var.setNextFocusForwardId(i17);
                    pe0Var.setAccessibilityTraversalBefore(i17);
                }
            }
            pe0Var.setId(iArr[i11]);
            pe0Var.setOnClickListener(new View.OnClickListener(this) {
                public final re0 f25940b;

                {
                    this.f25940b = this;
                }

                @Override
                public final void onClick(View view2) {
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    int i112;
                    boolean z10;
                    boolean z11;
                    LinkedList linkedList3;
                    int i122;
                    int i132;
                    int i142;
                    boolean z12;
                    boolean z13;
                    int i152 = r2;
                    re0 re0Var = this.f25940b;
                    switch (i152) {
                        case 0:
                            re0Var.m(false);
                            return;
                        case 1:
                            re0Var.c();
                            return;
                        default:
                            LinkedList linkedList4 = re0Var.R;
                            LinkedList linkedList5 = re0Var.Q;
                            di.i9 i9Var2 = re0Var.f28821s;
                            if (re0Var.f28814b0 && !re0Var.L) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        i9Var2.b("0");
                                        z11 = z10;
                                        break;
                                    case 1:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        i9Var2.b("1");
                                        z11 = z10;
                                        break;
                                    case 2:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        i9Var2.b("2");
                                        z11 = z10;
                                        break;
                                    case 3:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        i9Var2.b("3");
                                        z11 = z10;
                                        break;
                                    case 4:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        i9Var2.b("4");
                                        z11 = z10;
                                        break;
                                    case 5:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        i9Var2.b("5");
                                        z11 = z10;
                                        break;
                                    case 6:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        i9Var2.b("6");
                                        z11 = z10;
                                        break;
                                    case 7:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        i9Var2.b("7");
                                        z11 = z10;
                                        break;
                                    case 8:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        i9Var2.b("8");
                                        z11 = z10;
                                        break;
                                    case 9:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        i9Var2.b("9");
                                        z11 = z10;
                                        break;
                                    case 10:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        re0Var.c();
                                        z11 = z10;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) i9Var2.f7082c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        z10 = false;
                                        ArrayList arrayList2 = (ArrayList) i9Var2.f7081b;
                                        Property property5 = View.TRANSLATION_X;
                                        int i162 = 1;
                                        StringBuilder sb2 = (StringBuilder) i9Var2.d;
                                        if (sb2.length() == 0) {
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            i112 = intValue;
                                            z11 = z10;
                                            break;
                                        } else {
                                            try {
                                                i9Var2.performHapticFeedback(3);
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
                                                if (textView2.getAlpha() != 0.0f) {
                                                    linkedList3 = linkedList5;
                                                    i122 = intValue;
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
                                                    fArr5[0] = i9Var2.c(i172);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, fArr5));
                                                } else {
                                                    linkedList3 = linkedList5;
                                                    i122 = intValue;
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
                                                    fArr10[0] = i9Var2.c(i172);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                                } else {
                                                    i142 = i172;
                                                }
                                                i172 = i142 + 1;
                                                linkedList5 = linkedList3;
                                                intValue = i122;
                                                i162 = 1;
                                            }
                                            linkedList2 = linkedList5;
                                            i112 = intValue;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i18 = 0; i18 < length; i18++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), property5, i9Var2.c(i18)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), property5, i9Var2.c(i18)));
                                            }
                                            kf kfVar = (kf) i9Var2.f7083f;
                                            if (kfVar != null) {
                                                AndroidUtilities.cancelRunOnUIThread(kfVar);
                                                i9Var2.f7083f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) i9Var2.e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            i9Var2.e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) i9Var2.e).playTogether(arrayList3);
                                            ((AnimatorSet) i9Var2.e).addListener(new ne0(i9Var2, 1));
                                            ((AnimatorSet) i9Var2.e).start();
                                            re0.a((re0) i9Var2.h);
                                            z11 = true;
                                            break;
                                        }
                                    default:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        z11 = z10;
                                        break;
                                }
                                if (((StringBuilder) i9Var2.d).length() == 4) {
                                    re0Var.m(z10);
                                }
                                int i19 = i112;
                                if (i19 != 11) {
                                    Drawable drawable = re0Var.f28811a;
                                    if (drawable instanceof cd0) {
                                        cd0 cd0Var = (cd0) drawable;
                                        cd0Var.D = null;
                                        cd0Var.z();
                                        float f7 = cd0Var.h;
                                        if (i19 == 10) {
                                            if (z11) {
                                                cd0Var.y();
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                            cd0Var.x(true);
                                            z13 = true;
                                        }
                                        if (z13) {
                                            if (f7 >= 1.0f) {
                                                re0Var.b(cd0Var);
                                                return;
                                            }
                                            di.x0 x0Var = new di.x0(re0Var, z12, cd0Var, 22);
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(x0Var);
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z12));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i20 = 0; i20 < linkedList6.size(); i20++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i20);
                                                Boolean bool = (Boolean) linkedList7.get(i20);
                                                if (bool != null && bool.booleanValue() != z12) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i20));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i21 = 0;
                                            while (i21 < size) {
                                                Object obj = arrayList4.get(i21);
                                                i21++;
                                                linkedList6.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.ActionBar.l5(15));
                                            int size2 = arrayList5.size();
                                            int i22 = 0;
                                            while (i22 < size2) {
                                                Object obj2 = arrayList5.get(i22);
                                                i22++;
                                                linkedList7.remove(((Integer) obj2).intValue());
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
            this.f28818f.add(pe0Var);
            i11++;
        }
        for (i10 = 11; i10 >= 0; i10--) {
            this.e.addView((FrameLayout) this.f28818f.get(i10), w7.a6.e(60, 60, 51));
        }
        d();
    }

    public static void a(re0 re0Var) {
        boolean z10;
        float f7;
        float f10;
        FrameLayout frameLayout = re0Var.f28813b;
        di.i9 i9Var = re0Var.f28821s;
        if (i9Var != null && ((StringBuilder) i9Var.d).length() <= 0) {
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
            org.telegram.messenger.yh.s(scaleX.scaleY(f11), es.h, 320L);
        }
    }

    public final void b(cd0 cd0Var) {
        o1.k kVar = this.P;
        if (kVar != null && kVar.f16461f) {
            kVar.c();
        }
        o1.j jVar = new o1.j(0.0f);
        cd0Var.D = new xv(jVar, 9);
        cd0Var.z();
        o1.k kVar2 = new o1.k(jVar);
        kVar2.f16468u = org.telegram.ui.Cells.d0.k(100.0f, 300.0f, 1.0f);
        this.P = kVar2;
        kVar2.a(new fi.m4(4, this, cd0Var));
        this.P.b(new n7(cd0Var, 5));
        this.P.h();
    }

    public final void c() {
        Activity findActivity;
        te0 te0Var;
        if (!this.L && (findActivity = AndroidUtilities.findActivity(getContext())) != null && this.f28819n.getVisibility() == 0 && !ApplicationLoader.mainInterfacePaused) {
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                ArrayList arrayList = launchActivity.B0;
                if (arrayList.isEmpty() && (te0Var = launchActivity.A0) != null) {
                    if (this != te0Var.f29363b) {
                        return;
                    }
                } else if (i2.d.g(1, arrayList) != this) {
                    return;
                }
            }
            try {
                if (new androidx.biometric.e(new androidx.biometric.t(getContext(), 0)).h(15) == 0 && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    k6.h hVar = new k6.h(LaunchActivity.G1, f0.c.d(getContext()), new je0(this));
                    j6.l lVar = new j6.l(1);
                    lVar.f12873b = LocaleController.getString(R.string.UnlockToUse);
                    lVar.d = LocaleController.getString(R.string.UsePIN);
                    lVar.f12872a = 15;
                    hVar.k(lVar.a(), null);
                    n(false);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void d() {
        int i10;
        int i11;
        boolean f7 = f();
        if (f7) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        pe0 pe0Var = this.f28819n;
        pe0Var.setVisibility(i10);
        if (SharedConfig.passcodeType == 1) {
            this.E.setVisibility(pe0Var.getVisibility());
        }
        if (SharedConfig.passcodeType == 1) {
            i11 = R.string.EnterPassword;
        } else if (f7) {
            i11 = R.string.EnterPINorFingerprint;
        } else {
            i11 = R.string.EnterPIN;
        }
        this.f28815c.setText(LocaleController.getString(i11));
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
        EditTextBoldCursor editTextBoldCursor = this.f28820r;
        FrameLayout frameLayout = this.h;
        org.telegram.ui.Cells.t6 t6Var = this.V;
        TextView textView = this.f28823x;
        if (i10 > 0) {
            int max = Math.max(1, (int) Math.ceil(j11 / 1000.0d));
            if (max != this.W) {
                textView.setText(LocaleController.formatString(R.string.TooManyTries, LocaleController.formatPluralString("Seconds", max, new Object[0])));
                this.W = max;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                frameLayout.setVisibility(4);
                n(false);
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
            }
            AndroidUtilities.cancelRunOnUIThread(t6Var);
            AndroidUtilities.runOnUIThread(t6Var, 100L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        if (textView.getVisibility() == 0) {
            textView.setVisibility(4);
            frameLayout.setVisibility(0);
            n(true);
            if (SharedConfig.passcodeType == 1) {
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            }
        }
    }

    public final boolean f() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.re0.f():boolean");
    }

    public final boolean h() {
        di.h4 h4Var = this.f28812a0;
        if (h4Var != null && h4Var.c()) {
            AndroidUtilities.hideKeyboard(this.f28820r);
            return false;
        }
        return true;
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.V);
    }

    public final void k() {
        if (!this.L) {
            e();
            if (this.f28823x.getVisibility() != 0) {
                if (SharedConfig.passcodeType == 1) {
                    EditTextBoldCursor editTextBoldCursor = this.f28820r;
                    if (editTextBoldCursor != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                    }
                    AndroidUtilities.runOnUIThread(new ge0(this, 0), 200L);
                }
                c();
            }
        }
    }

    public final void l(boolean z10, int i10, int i11, org.telegram.ui.o00 o00Var) {
        View currentFocus;
        boolean z11;
        int i12;
        int i13;
        if (getVisibility() != 0) {
            this.L = false;
        }
        d();
        e();
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        int i14 = SharedConfig.passcodeType;
        TextView textView = this.f28823x;
        EditTextBoldCursor editTextBoldCursor = this.f28820r;
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
        y9 y9Var = null;
        this.f28811a = null;
        boolean z12 = org.telegram.ui.ActionBar.g6.s0() instanceof cd0;
        ah.v vVar = this.v;
        if (z12) {
            z11 = !org.telegram.ui.ActionBar.g6.I.q();
            this.f28811a = org.telegram.ui.ActionBar.g6.s0();
            vVar.setBackgroundColor(-1090519040);
        } else {
            if (org.telegram.ui.ActionBar.g6.W && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.g6.I0()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.g6.I0())) {
                org.telegram.ui.ActionBar.z5 z5Var = org.telegram.ui.ActionBar.g6.I.f19803i0;
                if (z5Var != null && (i12 = z5Var.d) != 0 && (i13 = z5Var.e) != 0) {
                    y9Var = new y9(y9.d(z5Var.h), new int[]{i12, i13});
                }
                this.f28811a = y9Var;
                if (y9Var == null) {
                    this.f28811a = org.telegram.ui.ActionBar.g6.s0();
                }
                if (this.f28811a instanceof y9) {
                    vVar.setBackgroundColor(570425344);
                } else {
                    vVar.setBackgroundColor(-1090519040);
                }
            } else {
                if (!"d".equals(org.telegram.ui.ActionBar.g6.I0())) {
                    String I0 = org.telegram.ui.ActionBar.g6.I0();
                    if (!org.telegram.ui.ActionBar.g6.f20002j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(I0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(I0)) {
                        Drawable s02 = org.telegram.ui.ActionBar.g6.s0();
                        this.f28811a = s02;
                        if (s02 instanceof y9) {
                            vVar.setBackgroundColor(570425344);
                        } else if (s02 != null) {
                            vVar.setBackgroundColor(-1090519040);
                        } else {
                            vVar.setBackgroundColor(-11436898);
                        }
                    }
                }
                vVar.setBackgroundColor(-11436898);
            }
            z11 = false;
        }
        Drawable drawable = this.f28811a;
        if (drawable instanceof cd0) {
            cd0 cd0Var = (cd0) drawable;
            int[] iArr = cd0Var.f24035a;
            if (z11) {
                int[] iArr2 = new int[iArr.length];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    iArr2[i15] = org.telegram.ui.ActionBar.g6.b(0.14f, 0.0f, iArr[i15]);
                }
                iArr = iArr2;
            }
            this.f28811a = new cd0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (cd0Var.f24056u != null && cd0Var.f24052q < 0) {
                vVar.setBackgroundColor(2130706432);
            } else {
                vVar.setBackgroundColor(570425344);
            }
            ((cd0) this.f28811a).r(vVar);
        }
        this.f28822w.setText(LocaleController.getString(R.string.AppLocked));
        int i16 = SharedConfig.passcodeType;
        ImageView imageView = this.E;
        ImageView imageView2 = this.f28824y;
        bi.i5 i5Var = this.e;
        di.i9 i9Var = this.f28821s;
        if (i16 == 0) {
            if (textView.getVisibility() != 0) {
                i5Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            i9Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i16 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            i5Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            i9Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.f28819n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        di.i9.a(i9Var, false);
        if (z10) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new me0(this, i10, i11, o00Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.T = 1.0f;
            g(1.0f);
            bk0 bk0Var = this.I;
            bk0Var.setScaleX(1.0f);
            bk0Var.setScaleY(1.0f);
            bk0Var.i();
            bk0Var.getAnimatedDrawable().N(38, false, false);
            if (o00Var != null) {
                o00Var.run();
            }
        }
        setOnTouchListener(new ci.d(19));
    }

    public final void m(boolean z10) {
        String str;
        if (!this.L && getVisibility() == 0) {
            EditTextBoldCursor editTextBoldCursor = this.f28820r;
            if (!z10) {
                if (SharedConfig.passcodeRetryInMs <= 0) {
                    int i10 = SharedConfig.passcodeType;
                    di.i9 i9Var = this.f28821s;
                    if (i10 == 0) {
                        str = ((StringBuilder) i9Var.d).toString();
                    } else if (i10 != 1) {
                        str = "";
                    } else {
                        str = editTextBoldCursor.getText().toString();
                    }
                    int length = str.length();
                    FrameLayout frameLayout = this.f28813b;
                    if (length == 0) {
                        BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                        int i11 = -this.U;
                        this.U = i11;
                        AndroidUtilities.shakeViewSpring(frameLayout, i11);
                        return;
                    } else if (!SharedConfig.checkPasscode(str)) {
                        SharedConfig.increaseBadPasscodeTries();
                        if (SharedConfig.passcodeRetryInMs > 0) {
                            e();
                        }
                        editTextBoldCursor.setText("");
                        di.i9.a(i9Var, true);
                        BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                        int i12 = -this.U;
                        this.U = i12;
                        AndroidUtilities.shakeViewSpring(frameLayout, i12);
                        Drawable drawable = this.f28811a;
                        if (drawable instanceof cd0) {
                            cd0 cd0Var = (cd0) drawable;
                            o1.k kVar = this.P;
                            if (kVar != null) {
                                kVar.c();
                                cd0Var.h = 1.0f;
                                cd0Var.z();
                            }
                            if (cd0Var.h >= 1.0f) {
                                cd0Var.m(true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            this.L = true;
            j();
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
            qe0 qe0Var = this.K;
            if (qe0Var != null) {
                qe0Var.i(this);
            }
            AnimatorSet animatorSet = this.M;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.M = null;
            }
            AnimatorSet animatorSet2 = this.N;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.N = null;
            }
            bk0 bk0Var = this.I;
            bk0Var.getAnimatedDrawable().P(71);
            bk0Var.getAnimatedDrawable().N(37, false, false);
            bk0Var.d();
            AndroidUtilities.runOnUIThread(new ge0(this, 1));
        }
    }

    public final void n(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f28816c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f28814b0 = z10;
        float alpha = this.e.getAlpha();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
        this.f28816c0 = ofFloat;
        ofFloat.addUpdateListener(new he0(this, 1));
        this.f28816c0.addListener(new org.telegram.ui.vo(17, this, z10));
        this.f28816c0.setInterpolator(es.h);
        this.f28816c0.setDuration(320L);
        this.f28816c0.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.passcodeDismissed);
        if (this.f28812a0 == null && (getParent() instanceof View)) {
            this.f28812a0 = new di.h4((View) getParent(), false, new a3(this, 9));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
        this.L = true;
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.N;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.O.cancel();
            this.O = null;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.passcodeDismissed);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        View rootView = getRootView();
        int height = (rootView.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.getViewInset(rootView);
        Rect rect = this.J;
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
        TextView textView = this.f28822w;
        int[] iArr = this.f28817d0;
        textView.getLocationInWindow(iArr);
        boolean isTablet = AndroidUtilities.isTablet();
        bk0 bk0Var = this.I;
        if (!isTablet && getContext().getResources().getConfiguration().orientation == 2) {
            int dp = iArr[1] - AndroidUtilities.dp(100.0f);
            this.H = dp;
            bk0Var.setTranslationY(dp);
            return;
        }
        int dp2 = iArr[1] - AndroidUtilities.dp(100.0f);
        this.H = dp2;
        bk0Var.setTranslationY(dp2);
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
        bk0 bk0Var = this.I;
        bi.i5 i5Var = this.e;
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
            bk0Var.setTranslationX((f11 / f10) - AndroidUtilities.dp(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            if (SharedConfig.passcodeType == 0) {
                i15 = size / 2;
            } else {
                i15 = size;
            }
            layoutParams.width = i15;
            layoutParams.height = AndroidUtilities.dp(180.0f);
            int B = org.telegram.messenger.yh.B(140.0f, i18, 2);
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
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) i5Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams3.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            layoutParams3.gravity = 17;
            i5Var.setLayoutParams(layoutParams3);
            i14 = 0;
        } else {
            bk0Var.setTranslationX((size / 2.0f) - AndroidUtilities.dp(29.0f));
            int i20 = AndroidUtilities.statusBarHeight;
            if (AndroidUtilities.isTablet()) {
                if (size > AndroidUtilities.dp(498.0f)) {
                    i12 = org.telegram.messenger.yh.B(498.0f, size, 2);
                    size = AndroidUtilities.dp(498.0f);
                } else {
                    i12 = 0;
                }
                if (i18 > AndroidUtilities.dp(528.0f)) {
                    i20 = org.telegram.messenger.yh.B(528.0f, i18, 2);
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
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) i5Var.getLayoutParams();
            i14 = 0;
            layoutParams5.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams5.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            if (AndroidUtilities.isTablet()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            i5Var.setLayoutParams(layoutParams5);
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
            FrameLayout frameLayout3 = (FrameLayout) this.f28818f.get(i24);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((dp3 + dp2) * (i25 / 3)) + dp4;
            layoutParams7.leftMargin = (dp3 + dp) * (i25 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
        }
        super.onMeasure(i10, i11);
    }

    public void setDelegate(qe0 qe0Var) {
        this.K = qe0Var;
    }

    public void g(float f7) {
    }

    public void i() {
    }
}
