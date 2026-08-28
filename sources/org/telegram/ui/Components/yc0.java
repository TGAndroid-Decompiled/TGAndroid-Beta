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
public class yc0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] T = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView A;
    public final View B;
    public int C;
    public int D;
    public final pi0 E;
    public final Rect F;
    public xc0 G;
    public o1.j H;
    public final LinkedList I;
    public final LinkedList J;
    public final ArrayList K;
    public float L;
    public int M;
    public final m.i3 N;
    public int O;
    public kh.b4 P;
    public boolean Q;
    public ValueAnimator R;
    public final int[] S;
    public Drawable f34940a;
    public final FrameLayout f34941b;
    public final TextView f34942c;
    public final FrameLayout d;
    public final dh.g f34943e;
    public final ArrayList f34944f;
    public final FrameLayout h;
    public final wc0 f34945n;
    public final EditTextBoldCursor f34946r;
    public final kh.z8 f34947s;
    public final fh.v v;
    public final TextView f34948w;
    public final TextView f34949x;
    public final ImageView f34950y;

    public yc0(Context context) {
        super(context);
        int i9;
        int[] iArr = T;
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
        fh.v vVar = new fh.v(this, context);
        this.v = vVar;
        vVar.setWillNotDraw(false);
        addView(vVar, g7.e6.c(-1.0f, -1));
        ?? imageView = new ImageView(context);
        this.E = imageView;
        imageView.f(R.raw.passcode_lock, 58, 58, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, g7.e6.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        vVar.addView(frameLayout, g7.e6.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f34948w = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setAlpha(0.0f);
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView, g7.e6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.f34949x = g10;
        g10.setTextColor(-1);
        g10.setTextSize(1, 15.0f);
        g10.setGravity(1);
        g10.setVisibility(4);
        vVar.addView(g10, g7.e6.e(-2, -2, 17));
        kh.z8 z8Var = new kh.z8(this, context);
        this.f34947s = z8Var;
        frameLayout.addView(z8Var, g7.e6.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f34946r = editTextBoldCursor;
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
        frameLayout.addView(editTextBoldCursor, g7.e6.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new c1(this, 3));
        editTextBoldCursor.addTextChangedListener(new bh.f(this, 11));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(1));
        ImageView imageView2 = new ImageView(context);
        this.f34950y = imageView2;
        imageView2.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView2, g7.e6.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView2.setContentDescription(LocaleController.getString(R.string.Done));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final yc0 f31614b;

            {
                this.f31614b = this;
            }

            @Override
            public final void onClick(View view) {
                LinkedList linkedList;
                LinkedList linkedList2;
                int i10;
                boolean z10;
                LinkedList linkedList3;
                int i11;
                int i12;
                int i13;
                boolean z11;
                boolean z12;
                int i14 = r2;
                yc0 yc0Var = this.f31614b;
                switch (i14) {
                    case 0:
                        yc0Var.k(false);
                        return;
                    case 1:
                        yc0Var.c();
                        return;
                    default:
                        LinkedList linkedList4 = yc0Var.J;
                        LinkedList linkedList5 = yc0Var.I;
                        kh.z8 z8Var2 = yc0Var.f34947s;
                        if (yc0Var.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("0");
                                    z10 = false;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("1");
                                    z10 = false;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("2");
                                    z10 = false;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("3");
                                    z10 = false;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("4");
                                    z10 = false;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("5");
                                    z10 = false;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("6");
                                    z10 = false;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("7");
                                    z10 = false;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("8");
                                    z10 = false;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("9");
                                    z10 = false;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    yc0Var.c();
                                    z10 = false;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) z8Var2.f16468c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) z8Var2.f16467b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) z8Var2.d;
                                    if (sb2.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i10 = intValue;
                                        z10 = false;
                                        break;
                                    } else {
                                        try {
                                            z8Var2.performHapticFeedback(3);
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i15 = length;
                                        while (i15 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i15);
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i11 = intValue;
                                                i12 = 1;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, z8Var2.c(i15)));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i11 = intValue;
                                                i12 = 1;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i15);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr = new float[i12];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr));
                                                float[] fArr2 = new float[i12];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr2));
                                                float[] fArr3 = new float[i12];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr3));
                                                float[] fArr4 = new float[i12];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr4));
                                                i13 = i15;
                                                float[] fArr5 = new float[i12];
                                                fArr5[0] = z8Var2.c(i15);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr5));
                                            } else {
                                                i13 = i15;
                                            }
                                            i15 = i13 + 1;
                                            linkedList5 = linkedList3;
                                            intValue = i11;
                                        }
                                        linkedList2 = linkedList5;
                                        i10 = intValue;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i16 = 0; i16 < length; i16++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i16), property5, z8Var2.c(i16)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i16), property5, z8Var2.c(i16)));
                                        }
                                        ye yeVar = (ye) z8Var2.f16470f;
                                        if (yeVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(yeVar);
                                            z8Var2.f16470f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) z8Var2.f16469e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        z8Var2.f16469e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) z8Var2.f16469e).playTogether(arrayList3);
                                        ((AnimatorSet) z8Var2.f16469e).addListener(new uc0(z8Var2, 1));
                                        ((AnimatorSet) z8Var2.f16469e).start();
                                        yc0.a((yc0) z8Var2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z10 = false;
                                    break;
                            }
                            if (((StringBuilder) z8Var2.d).length() == 4) {
                                yc0Var.k(false);
                            }
                            int i17 = i10;
                            if (i17 != 11) {
                                Drawable drawable = yc0Var.f34940a;
                                if (drawable instanceof jb0) {
                                    jb0 jb0Var = (jb0) drawable;
                                    jb0Var.D = null;
                                    jb0Var.z();
                                    float f10 = jb0Var.h;
                                    if (i17 == 10) {
                                        if (z10) {
                                            jb0Var.y();
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                        jb0Var.x(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f10 >= 1.0f) {
                                            yc0Var.b(jb0Var);
                                            return;
                                        }
                                        gh.u5 u5Var = new gh.u5(yc0Var, z11, jb0Var, 18);
                                        LinkedList linkedList6 = linkedList2;
                                        linkedList6.offer(u5Var);
                                        LinkedList linkedList7 = linkedList;
                                        linkedList7.offer(Boolean.valueOf(z11));
                                        ArrayList arrayList4 = new ArrayList();
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i18 = 0; i18 < linkedList6.size(); i18++) {
                                            Runnable runnable = (Runnable) linkedList6.get(i18);
                                            Boolean bool = (Boolean) linkedList7.get(i18);
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
                                            linkedList6.remove((Runnable) obj);
                                        }
                                        Collections.sort(arrayList5, new j9.a(27));
                                        int size2 = arrayList5.size();
                                        int i20 = 0;
                                        while (i20 < size2) {
                                            Object obj2 = arrayList5.get(i20);
                                            i20++;
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
        this.A = imageView3;
        imageView3.setImageResource(R.drawable.fingerprint);
        imageView3.setScaleType(scaleType);
        imageView3.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView3, g7.e6.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final yc0 f31614b;

            {
                this.f31614b = this;
            }

            @Override
            public final void onClick(View view) {
                LinkedList linkedList;
                LinkedList linkedList2;
                int i10;
                boolean z10;
                LinkedList linkedList3;
                int i11;
                int i12;
                int i13;
                boolean z11;
                boolean z12;
                int i14 = r2;
                yc0 yc0Var = this.f31614b;
                switch (i14) {
                    case 0:
                        yc0Var.k(false);
                        return;
                    case 1:
                        yc0Var.c();
                        return;
                    default:
                        LinkedList linkedList4 = yc0Var.J;
                        LinkedList linkedList5 = yc0Var.I;
                        kh.z8 z8Var2 = yc0Var.f34947s;
                        if (yc0Var.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("0");
                                    z10 = false;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("1");
                                    z10 = false;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("2");
                                    z10 = false;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("3");
                                    z10 = false;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("4");
                                    z10 = false;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("5");
                                    z10 = false;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("6");
                                    z10 = false;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("7");
                                    z10 = false;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("8");
                                    z10 = false;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z8Var2.b("9");
                                    z10 = false;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    yc0Var.c();
                                    z10 = false;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) z8Var2.f16468c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) z8Var2.f16467b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) z8Var2.d;
                                    if (sb2.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i10 = intValue;
                                        z10 = false;
                                        break;
                                    } else {
                                        try {
                                            z8Var2.performHapticFeedback(3);
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i15 = length;
                                        while (i15 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i15);
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i11 = intValue;
                                                i12 = 1;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, z8Var2.c(i15)));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i11 = intValue;
                                                i12 = 1;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i15);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr = new float[i12];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr));
                                                float[] fArr2 = new float[i12];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr2));
                                                float[] fArr3 = new float[i12];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr3));
                                                float[] fArr4 = new float[i12];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr4));
                                                i13 = i15;
                                                float[] fArr5 = new float[i12];
                                                fArr5[0] = z8Var2.c(i15);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr5));
                                            } else {
                                                i13 = i15;
                                            }
                                            i15 = i13 + 1;
                                            linkedList5 = linkedList3;
                                            intValue = i11;
                                        }
                                        linkedList2 = linkedList5;
                                        i10 = intValue;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i16 = 0; i16 < length; i16++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i16), property5, z8Var2.c(i16)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i16), property5, z8Var2.c(i16)));
                                        }
                                        ye yeVar = (ye) z8Var2.f16470f;
                                        if (yeVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(yeVar);
                                            z8Var2.f16470f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) z8Var2.f16469e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        z8Var2.f16469e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) z8Var2.f16469e).playTogether(arrayList3);
                                        ((AnimatorSet) z8Var2.f16469e).addListener(new uc0(z8Var2, 1));
                                        ((AnimatorSet) z8Var2.f16469e).start();
                                        yc0.a((yc0) z8Var2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i10 = intValue;
                                    z10 = false;
                                    break;
                            }
                            if (((StringBuilder) z8Var2.d).length() == 4) {
                                yc0Var.k(false);
                            }
                            int i17 = i10;
                            if (i17 != 11) {
                                Drawable drawable = yc0Var.f34940a;
                                if (drawable instanceof jb0) {
                                    jb0 jb0Var = (jb0) drawable;
                                    jb0Var.D = null;
                                    jb0Var.z();
                                    float f10 = jb0Var.h;
                                    if (i17 == 10) {
                                        if (z10) {
                                            jb0Var.y();
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                        jb0Var.x(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f10 >= 1.0f) {
                                            yc0Var.b(jb0Var);
                                            return;
                                        }
                                        gh.u5 u5Var = new gh.u5(yc0Var, z11, jb0Var, 18);
                                        LinkedList linkedList6 = linkedList2;
                                        linkedList6.offer(u5Var);
                                        LinkedList linkedList7 = linkedList;
                                        linkedList7.offer(Boolean.valueOf(z11));
                                        ArrayList arrayList4 = new ArrayList();
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i18 = 0; i18 < linkedList6.size(); i18++) {
                                            Runnable runnable = (Runnable) linkedList6.get(i18);
                                            Boolean bool = (Boolean) linkedList7.get(i18);
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
                                            linkedList6.remove((Runnable) obj);
                                        }
                                        Collections.sort(arrayList5, new j9.a(27));
                                        int size2 = arrayList5.size();
                                        int i20 = 0;
                                        while (i20 < size2) {
                                            Object obj2 = arrayList5.get(i20);
                                            i20++;
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
        this.B = view;
        view.setBackgroundColor(822083583);
        frameLayout.addView(view, g7.e6.a(-1.0f, 1.0f / AndroidUtilities.density, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        vVar.addView(frameLayout2, g7.e6.e(-1, -1, 51));
        dh.g gVar = new dh.g(context, 16);
        this.f34943e = gVar;
        frameLayout2.addView(gVar, g7.e6.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f34941b = frameLayout3;
        gVar.addView(frameLayout3, g7.e6.e(-2, -2, 49));
        TextView g11 = org.telegram.messenger.l0.g(context, 1, 15.0f);
        g11.setTypeface(AndroidUtilities.bold());
        g11.setTextColor(-1);
        g11.setText(LocaleController.getString(R.string.UnlockToUse));
        TextView g12 = org.telegram.ui.Cells.j2.g(frameLayout3, g11, g7.e6.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.f34942c = g12;
        g12.setTextSize(1, 14.0f);
        g12.setTextColor(-1);
        g12.setText(LocaleController.getString(R.string.EnterPINorFingerprint));
        frameLayout3.addView(g12, g7.e6.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f34944f = new ArrayList(10);
        int i10 = 0;
        while (true) {
            if (i10 >= 12) {
                break;
            }
            wc0 wc0Var = new wc0(context);
            g7.g6.b(wc0Var, 0.15f, 1.5f);
            wc0Var.setTag(Integer.valueOf(i10));
            if (i10 == 11) {
                int dp = AndroidUtilities.dp(30.0f);
                wc0Var.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, 654311423, 654311423));
                wc0Var.setImage(R.drawable.filled_clear);
                wc0Var.setOnLongClickListener(new x00(this, 1));
                wc0Var.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
                l(wc0Var, R.id.passcode_btn_0);
            } else if (i10 == 10) {
                this.f34945n = wc0Var;
                int dp2 = AndroidUtilities.dp(30.0f);
                wc0Var.setBackground(org.telegram.ui.ActionBar.f6.i0(dp2, dp2, dp2, dp2, 0, 654311423, 654311423));
                wc0Var.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
                wc0Var.setImage(R.drawable.fingerprint);
                l(wc0Var, R.id.passcode_btn_1);
            } else {
                int dp3 = AndroidUtilities.dp(30.0f);
                wc0Var.setBackground(org.telegram.ui.ActionBar.f6.i0(dp3, dp3, dp3, dp3, 654311423, 1291845631, 1291845631));
                wc0Var.setContentDescription(i10 + "");
                wc0Var.setNum(i10);
                if (i10 == 0) {
                    l(wc0Var, R.id.passcode_btn_backspace);
                } else if (i10 == 9) {
                    Activity findActivity = AndroidUtilities.findActivity(getContext());
                    if (Build.VERSION.SDK_INT >= 23 && findActivity != null && SharedConfig.useFingerprintLock) {
                        try {
                            Context context2 = ApplicationLoader.applicationContext;
                            ef.a aVar = ef.b.f5119a;
                            if (aVar.v0(context2) && aVar.d(context2) && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                                l(wc0Var, R.id.passcode_btn_fingerprint);
                            }
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }
                    l(wc0Var, R.id.passcode_btn_0);
                } else {
                    l(wc0Var, iArr[i10 + 1]);
                }
            }
            wc0Var.setId(iArr[i10]);
            wc0Var.setOnClickListener(new View.OnClickListener(this) {
                public final yc0 f31614b;

                {
                    this.f31614b = this;
                }

                @Override
                public final void onClick(View view2) {
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    int i102;
                    boolean z10;
                    LinkedList linkedList3;
                    int i11;
                    int i12;
                    int i13;
                    boolean z11;
                    boolean z12;
                    int i14 = r2;
                    yc0 yc0Var = this.f31614b;
                    switch (i14) {
                        case 0:
                            yc0Var.k(false);
                            return;
                        case 1:
                            yc0Var.c();
                            return;
                        default:
                            LinkedList linkedList4 = yc0Var.J;
                            LinkedList linkedList5 = yc0Var.I;
                            kh.z8 z8Var2 = yc0Var.f34947s;
                            if (yc0Var.Q) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i102 = intValue;
                                        z8Var2.b("0");
                                        z10 = false;
                                        break;
                                    case 1:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i102 = intValue;
                                        z8Var2.b("1");
                                        z10 = false;
                                        break;
                                    case 2:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i102 = intValue;
                                        z8Var2.b("2");
                                        z10 = false;
                                        break;
                                    case 3:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i102 = intValue;
                                        z8Var2.b("3");
                                        z10 = false;
                                        break;
                                    case 4:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i102 = intValue;
                                        z8Var2.b("4");
                                        z10 = false;
                                        break;
                                    case 5:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i102 = intValue;
                                        z8Var2.b("5");
                                        z10 = false;
                                        break;
                                    case 6:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i102 = intValue;
                                        z8Var2.b("6");
                                        z10 = false;
                                        break;
                                    case 7:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i102 = intValue;
                                        z8Var2.b("7");
                                        z10 = false;
                                        break;
                                    case 8:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i102 = intValue;
                                        z8Var2.b("8");
                                        z10 = false;
                                        break;
                                    case 9:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i102 = intValue;
                                        z8Var2.b("9");
                                        z10 = false;
                                        break;
                                    case 10:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i102 = intValue;
                                        yc0Var.c();
                                        z10 = false;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) z8Var2.f16468c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        ArrayList arrayList2 = (ArrayList) z8Var2.f16467b;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb2 = (StringBuilder) z8Var2.d;
                                        if (sb2.length() == 0) {
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            i102 = intValue;
                                            z10 = false;
                                            break;
                                        } else {
                                            try {
                                                z8Var2.performHapticFeedback(3);
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int length = sb2.length() - 1;
                                            if (length != 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            linkedList = linkedList4;
                                            int i15 = length;
                                            while (i15 < 4) {
                                                TextView textView2 = (TextView) arrayList2.get(i15);
                                                if (textView2.getAlpha() != 0.0f) {
                                                    linkedList3 = linkedList5;
                                                    i11 = intValue;
                                                    i12 = 1;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, z8Var2.c(i15)));
                                                } else {
                                                    linkedList3 = linkedList5;
                                                    i11 = intValue;
                                                    i12 = 1;
                                                }
                                                TextView textView3 = (TextView) arrayList.get(i15);
                                                if (textView3.getAlpha() != 0.0f) {
                                                    float[] fArr = new float[i12];
                                                    fArr[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr));
                                                    float[] fArr2 = new float[i12];
                                                    fArr2[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr2));
                                                    float[] fArr3 = new float[i12];
                                                    fArr3[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr3));
                                                    float[] fArr4 = new float[i12];
                                                    fArr4[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr4));
                                                    i13 = i15;
                                                    float[] fArr5 = new float[i12];
                                                    fArr5[0] = z8Var2.c(i15);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr5));
                                                } else {
                                                    i13 = i15;
                                                }
                                                i15 = i13 + 1;
                                                linkedList5 = linkedList3;
                                                intValue = i11;
                                            }
                                            linkedList2 = linkedList5;
                                            i102 = intValue;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i16 = 0; i16 < length; i16++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i16), property5, z8Var2.c(i16)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i16), property5, z8Var2.c(i16)));
                                            }
                                            ye yeVar = (ye) z8Var2.f16470f;
                                            if (yeVar != null) {
                                                AndroidUtilities.cancelRunOnUIThread(yeVar);
                                                z8Var2.f16470f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) z8Var2.f16469e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            z8Var2.f16469e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) z8Var2.f16469e).playTogether(arrayList3);
                                            ((AnimatorSet) z8Var2.f16469e).addListener(new uc0(z8Var2, 1));
                                            ((AnimatorSet) z8Var2.f16469e).start();
                                            yc0.a((yc0) z8Var2.h);
                                            z10 = true;
                                            break;
                                        }
                                    default:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i102 = intValue;
                                        z10 = false;
                                        break;
                                }
                                if (((StringBuilder) z8Var2.d).length() == 4) {
                                    yc0Var.k(false);
                                }
                                int i17 = i102;
                                if (i17 != 11) {
                                    Drawable drawable = yc0Var.f34940a;
                                    if (drawable instanceof jb0) {
                                        jb0 jb0Var = (jb0) drawable;
                                        jb0Var.D = null;
                                        jb0Var.z();
                                        float f10 = jb0Var.h;
                                        if (i17 == 10) {
                                            if (z10) {
                                                jb0Var.y();
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                            jb0Var.x(true);
                                            z12 = true;
                                        }
                                        if (z12) {
                                            if (f10 >= 1.0f) {
                                                yc0Var.b(jb0Var);
                                                return;
                                            }
                                            gh.u5 u5Var = new gh.u5(yc0Var, z11, jb0Var, 18);
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(u5Var);
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z11));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i18 = 0; i18 < linkedList6.size(); i18++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i18);
                                                Boolean bool = (Boolean) linkedList7.get(i18);
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
                                                linkedList6.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new j9.a(27));
                                            int size2 = arrayList5.size();
                                            int i20 = 0;
                                            while (i20 < size2) {
                                                Object obj2 = arrayList5.get(i20);
                                                i20++;
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
            this.f34944f.add(wc0Var);
            i10++;
        }
        for (i9 = 11; i9 >= 0; i9--) {
            this.f34943e.addView((FrameLayout) this.f34944f.get(i9), g7.e6.e(60, 60, 51));
        }
        d();
    }

    public static void a(yc0 yc0Var) {
        boolean z10;
        float f10;
        float f11;
        FrameLayout frameLayout = yc0Var.f34941b;
        kh.z8 z8Var = yc0Var.f34947s;
        if (z8Var != null && ((StringBuilder) z8Var.d).length() <= 0) {
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
            org.telegram.messenger.ll.r(scaleX.scaleY(f12), gr.h, 320L);
        }
    }

    public static void l(wc0 wc0Var, int i9) {
        wc0Var.setNextFocusForwardId(i9);
        if (Build.VERSION.SDK_INT >= 22) {
            wc0Var.setAccessibilityTraversalBefore(i9);
        }
    }

    public final void b(jb0 jb0Var) {
        o1.j jVar = this.H;
        if (jVar != null && jVar.f18794f) {
            jVar.c();
        }
        gb.a aVar = new gb.a(0.0f);
        jb0Var.D = new wu(aVar, 8);
        jb0Var.z();
        o1.j jVar2 = new o1.j(aVar);
        jVar2.f18800u = org.telegram.ui.Cells.j2.i(100.0f, 300.0f, 1.0f);
        this.H = jVar2;
        jVar2.a(new mh.c4(4, this, jb0Var));
        this.H.b(new e7(jb0Var, 4));
        this.H.f();
    }

    public final void c() {
        Activity findActivity;
        ad0 ad0Var;
        if (Build.VERSION.SDK_INT >= 23 && (findActivity = AndroidUtilities.findActivity(getContext())) != null && this.f34945n.getVisibility() == 0 && !ApplicationLoader.mainInterfacePaused) {
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                ArrayList arrayList = launchActivity.f35540x0;
                if (arrayList.isEmpty() && (ad0Var = launchActivity.f35538w0) != null) {
                    if (this != ad0Var.f26775b) {
                        return;
                    }
                } else if (j3.r0.j(1, arrayList) != this) {
                    return;
                }
            }
            try {
                if (new a5.m(new u5.h(getContext(), 1)).e(15) == 0 && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    xa.c cVar = new xa.c(LaunchActivity.C1, f0.e.e(getContext()), new qc0(this));
                    d5.w wVar = new d5.w();
                    wVar.f4402b = LocaleController.getString(R.string.UnlockToUse);
                    wVar.d = LocaleController.getString(R.string.UsePIN);
                    wVar.f4401a = 15;
                    cVar.b(wVar.e(), null);
                    m(false);
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yc0.d():void");
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.didGenerateFingerprintKeyPair) {
            d();
            if (((Boolean) objArr[0]).booleanValue() && SharedConfig.appLocked) {
                c();
            }
        } else if (i9 == NotificationCenter.passcodeDismissed && objArr[0] != this) {
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
        EditTextBoldCursor editTextBoldCursor = this.f34946r;
        FrameLayout frameLayout = this.h;
        m.i3 i3Var = this.N;
        TextView textView = this.f34949x;
        if (j11 > 0) {
            int max = Math.max(1, (int) Math.ceil(j11 / 1000.0d));
            if (max != this.O) {
                textView.setText(LocaleController.formatString(R.string.TooManyTries, LocaleController.formatPluralString("Seconds", max, new Object[0])));
                this.O = max;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                frameLayout.setVisibility(4);
                m(false);
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
            }
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            AndroidUtilities.runOnUIThread(i3Var, 100L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        if (textView.getVisibility() == 0) {
            textView.setVisibility(4);
            frameLayout.setVisibility(0);
            m(true);
            if (SharedConfig.passcodeType == 1) {
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            }
        }
    }

    public final boolean g() {
        kh.b4 b4Var = this.P;
        if (b4Var != null && b4Var.c()) {
            AndroidUtilities.hideKeyboard(this.f34946r);
            return false;
        }
        return true;
    }

    public final void i() {
        e();
        if (this.f34949x.getVisibility() != 0) {
            if (SharedConfig.passcodeType == 1) {
                EditTextBoldCursor editTextBoldCursor = this.f34946r;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                }
                AndroidUtilities.runOnUIThread(new nc0(this, 0), 200L);
            }
            c();
        }
    }

    public final void j(boolean z10, int i9, int i10, org.telegram.ui.x20 x20Var) {
        View currentFocus;
        boolean z11;
        int i11;
        int i12;
        d();
        e();
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        int i13 = SharedConfig.passcodeType;
        TextView textView = this.f34949x;
        EditTextBoldCursor editTextBoldCursor = this.f34946r;
        if (i13 == 1) {
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
        n9 n9Var = null;
        this.f34940a = null;
        boolean z12 = org.telegram.ui.ActionBar.f6.r0() instanceof jb0;
        fh.v vVar = this.v;
        if (z12) {
            z11 = !org.telegram.ui.ActionBar.f6.I.q();
            this.f34940a = org.telegram.ui.ActionBar.f6.r0();
            vVar.setBackgroundColor(-1090519040);
        } else {
            if (org.telegram.ui.ActionBar.f6.W && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.f6.H0()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.f6.H0())) {
                org.telegram.ui.ActionBar.y5 y5Var = org.telegram.ui.ActionBar.f6.I.f22914e0;
                if (y5Var != null && (i11 = y5Var.d) != 0 && (i12 = y5Var.f23983e) != 0) {
                    n9Var = new n9(n9.d(y5Var.h), new int[]{i11, i12});
                }
                this.f34940a = n9Var;
                if (n9Var == null) {
                    this.f34940a = org.telegram.ui.ActionBar.f6.r0();
                }
                if (this.f34940a instanceof n9) {
                    vVar.setBackgroundColor(570425344);
                } else {
                    vVar.setBackgroundColor(-1090519040);
                }
            } else {
                if (!"d".equals(org.telegram.ui.ActionBar.f6.H0())) {
                    String H0 = org.telegram.ui.ActionBar.f6.H0();
                    if (!org.telegram.ui.ActionBar.f6.f23103j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(H0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(H0)) {
                        Drawable r02 = org.telegram.ui.ActionBar.f6.r0();
                        this.f34940a = r02;
                        if (r02 instanceof n9) {
                            vVar.setBackgroundColor(570425344);
                        } else if (r02 != null) {
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
        Drawable drawable = this.f34940a;
        if (drawable instanceof jb0) {
            jb0 jb0Var = (jb0) drawable;
            int[] iArr = jb0Var.f29686a;
            if (z11) {
                int[] iArr2 = new int[iArr.length];
                for (int i14 = 0; i14 < iArr.length; i14++) {
                    iArr2[i14] = org.telegram.ui.ActionBar.f6.b(0.14f, 0.0f, iArr[i14]);
                }
                iArr = iArr2;
            }
            this.f34940a = new jb0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (jb0Var.f29708u != null && jb0Var.f29704q < 0) {
                vVar.setBackgroundColor(2130706432);
            } else {
                vVar.setBackgroundColor(570425344);
            }
            ((jb0) this.f34940a).r(vVar);
        }
        this.f34948w.setText(LocaleController.getString(R.string.AppLocked));
        int i15 = SharedConfig.passcodeType;
        ImageView imageView = this.A;
        ImageView imageView2 = this.f34950y;
        dh.g gVar = this.f34943e;
        kh.z8 z8Var = this.f34947s;
        if (i15 == 0) {
            if (textView.getVisibility() != 0) {
                gVar.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            z8Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i15 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            gVar.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            z8Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.f34945n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        kh.z8.a(z8Var, false);
        if (z10) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new tc0(this, i9, i10, x20Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.L = 1.0f;
            f(1.0f);
            pi0 pi0Var = this.E;
            pi0Var.setScaleX(1.0f);
            pi0Var.setScaleY(1.0f);
            pi0Var.i();
            pi0Var.getAnimatedDrawable().L(38, false, false);
            if (x20Var != null) {
                x20Var.run();
            }
        }
        setOnTouchListener(new jh.d(19));
    }

    public final void k(boolean z10) {
        String str;
        EditTextBoldCursor editTextBoldCursor = this.f34946r;
        if (!z10) {
            if (SharedConfig.passcodeRetryInMs <= 0) {
                int i9 = SharedConfig.passcodeType;
                kh.z8 z8Var = this.f34947s;
                if (i9 == 0) {
                    str = ((StringBuilder) z8Var.d).toString();
                } else if (i9 != 1) {
                    str = "";
                } else {
                    str = editTextBoldCursor.getText().toString();
                }
                int length = str.length();
                FrameLayout frameLayout = this.f34941b;
                if (length == 0) {
                    BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                    int i10 = -this.M;
                    this.M = i10;
                    AndroidUtilities.shakeViewSpring(frameLayout, i10);
                    return;
                } else if (!SharedConfig.checkPasscode(str)) {
                    SharedConfig.increaseBadPasscodeTries();
                    if (SharedConfig.passcodeRetryInMs > 0) {
                        e();
                    }
                    editTextBoldCursor.setText("");
                    kh.z8.a(z8Var, true);
                    BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                    int i11 = -this.M;
                    this.M = i11;
                    AndroidUtilities.shakeViewSpring(frameLayout, i11);
                    Drawable drawable = this.f34940a;
                    if (drawable instanceof jb0) {
                        jb0 jb0Var = (jb0) drawable;
                        o1.j jVar = this.H;
                        if (jVar != null) {
                            jVar.c();
                            jb0Var.h = 1.0f;
                            jb0Var.z();
                        }
                        if (jb0Var.h >= 1.0f) {
                            jb0Var.m(true);
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
        xc0 xc0Var = this.G;
        if (xc0Var != null) {
            xc0Var.i(this);
        }
        pi0 pi0Var = this.E;
        pi0Var.getAnimatedDrawable().N(71);
        pi0Var.getAnimatedDrawable().L(37, false, false);
        pi0Var.d();
        AndroidUtilities.runOnUIThread(new nc0(this, 1));
    }

    public final void m(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.Q = z10;
        float alpha = this.f34943e.getAlpha();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
        this.R = ofFloat;
        ofFloat.addUpdateListener(new oc0(this, 1));
        this.R.addListener(new u9(16, this, z10));
        this.R.setInterpolator(gr.h);
        this.R.setDuration(320L);
        this.R.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.passcodeDismissed);
        if (this.P == null && (getParent() instanceof View)) {
            this.P = new kh.b4((View) getParent(), false, new v2(this, 8));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.passcodeDismissed);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        View rootView = getRootView();
        int height = (rootView.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.getViewInset(rootView);
        Rect rect = this.F;
        getWindowVisibleDisplayFrame(rect);
        this.C = height - (rect.bottom - rect.top);
        if (SharedConfig.passcodeType == 1 && (AndroidUtilities.isTablet() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            if (frameLayout.getTag() != null) {
                i13 = ((Integer) frameLayout.getTag()).intValue();
            } else {
                i13 = 0;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((i13 + layoutParams.height) - (this.C / 2)) - AndroidUtilities.statusBarHeight;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z10, i9, i10, i11, i12);
        TextView textView = this.f34948w;
        int[] iArr = this.S;
        textView.getLocationInWindow(iArr);
        boolean isTablet = AndroidUtilities.isTablet();
        pi0 pi0Var = this.E;
        if (!isTablet && getContext().getResources().getConfiguration().orientation == 2) {
            int dp = iArr[1] - AndroidUtilities.dp(100.0f);
            this.D = dp;
            pi0Var.setTranslationY(dp);
            return;
        }
        int dp2 = iArr[1] - AndroidUtilities.dp(100.0f);
        this.D = dp2;
        pi0Var.setTranslationY(dp2);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        int i11;
        int i12;
        float f10;
        float f11;
        float f12;
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i9);
        int i16 = AndroidUtilities.displaySize.y;
        int dp = AndroidUtilities.dp(28.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int dp3 = AndroidUtilities.dp(60.0f);
        if (!AndroidUtilities.isTablet() && getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.B;
        if (view != null) {
            if (SharedConfig.passcodeType == 1) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            view.setVisibility(i15);
        }
        pi0 pi0Var = this.E;
        dh.g gVar = this.f34943e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            if (SharedConfig.passcodeType == 0) {
                f11 = 2.0f;
                f12 = size / 2.0f;
            } else {
                f11 = 2.0f;
                f12 = size;
            }
            pi0Var.setTranslationX((f12 / f11) - AndroidUtilities.dp(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            if (SharedConfig.passcodeType == 0) {
                i13 = size / 2;
            } else {
                i13 = size;
            }
            layoutParams.width = i13;
            layoutParams.height = AndroidUtilities.dp(180.0f);
            int y10 = org.telegram.messenger.ll.y(140.0f, i16, 2);
            if (SharedConfig.passcodeType == 0) {
                i14 = AndroidUtilities.dp(40.0f);
            } else {
                i14 = 0;
            }
            layoutParams.topMargin = y10 + i14;
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i16;
            int i17 = size / 2;
            layoutParams2.leftMargin = i17;
            layoutParams2.topMargin = AndroidUtilities.statusBarHeight;
            layoutParams2.width = i17;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) gVar.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams3.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            layoutParams3.gravity = 17;
            gVar.setLayoutParams(layoutParams3);
        } else {
            pi0Var.setTranslationX((size / 2.0f) - AndroidUtilities.dp(29.0f));
            int i18 = AndroidUtilities.statusBarHeight;
            if (AndroidUtilities.isTablet()) {
                if (size > AndroidUtilities.dp(498.0f)) {
                    i11 = org.telegram.messenger.ll.y(498.0f, size, 2);
                    size = AndroidUtilities.dp(498.0f);
                } else {
                    i11 = 0;
                }
                if (i16 > AndroidUtilities.dp(528.0f)) {
                    i18 = org.telegram.messenger.ll.y(528.0f, i16, 2);
                    i16 = AndroidUtilities.dp(528.0f);
                }
            } else {
                i11 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            int i19 = i16 / 3;
            if (SharedConfig.passcodeType == 0) {
                i12 = AndroidUtilities.dp(40.0f);
            } else {
                i12 = 0;
            }
            layoutParams4.height = i19 + i12;
            layoutParams4.width = size;
            layoutParams4.topMargin = i18;
            layoutParams4.leftMargin = i11;
            frameLayout2.setTag(Integer.valueOf(i18));
            frameLayout2.setLayoutParams(layoutParams4);
            int i20 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) gVar.getLayoutParams();
            layoutParams5.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams5.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            if (AndroidUtilities.isTablet()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            gVar.setLayoutParams(layoutParams5);
            int i21 = i16 - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.leftMargin = i11;
            if (AndroidUtilities.isTablet()) {
                layoutParams6.topMargin = (i16 - i21) / 2;
            } else {
                layoutParams6.topMargin = i20;
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
        int dp4 = AndroidUtilities.dp(f10);
        for (int i22 = 0; i22 < 12; i22++) {
            int i23 = 10;
            if (i22 != 0) {
                if (i22 == 10) {
                    i23 = 11;
                } else if (i22 == 11) {
                    i23 = 9;
                } else {
                    i23 = i22 - 1;
                }
            }
            FrameLayout frameLayout3 = (FrameLayout) this.f34944f.get(i22);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((dp3 + dp2) * (i23 / 3)) + dp4;
            layoutParams7.leftMargin = (dp3 + dp) * (i23 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
        }
        super.onMeasure(i9, i10);
    }

    public void setDelegate(xc0 xc0Var) {
        this.G = xc0Var;
    }

    public void f(float f10) {
    }

    public void h() {
    }
}
