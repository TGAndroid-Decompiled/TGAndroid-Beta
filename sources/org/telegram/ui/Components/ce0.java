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
public class ce0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] f23319a0 = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView E;
    public final View F;
    public int G;
    public int H;
    public final lj0 I;
    public final Rect J;
    public be0 K;
    public o1.k L;
    public final LinkedList M;
    public final LinkedList N;
    public final ArrayList O;
    public float P;
    public int Q;
    public final org.telegram.ui.Cells.t6 R;
    public int S;
    public ci.i4 T;
    public boolean U;
    public ValueAnimator V;
    public final int[] W;
    public Drawable f23320a;
    public final FrameLayout f23321b;
    public final TextView f23322c;
    public final FrameLayout d;
    public final ai.w5 e;
    public final ArrayList f23323f;
    public final FrameLayout h;
    public final ae0 f23324n;
    public final EditTextBoldCursor f23325r;
    public final ci.j9 f23326s;
    public final ci.m6 v;
    public final TextView f23327w;
    public final TextView f23328x;
    public final ImageView f23329y;

    public ce0(Context context) {
        super(context);
        int i10;
        int[] iArr = f23319a0;
        this.G = 0;
        this.J = new Rect();
        this.M = new LinkedList();
        this.N = new LinkedList();
        this.O = new ArrayList();
        this.Q = -12;
        this.R = new org.telegram.ui.Cells.t6(this, 18);
        this.U = true;
        this.W = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        ci.m6 m6Var = new ci.m6(this, context);
        this.v = m6Var;
        m6Var.setWillNotDraw(false);
        addView(m6Var, w7.y5.c(-1.0f, -1));
        ?? imageView = new ImageView(context);
        this.I = imageView;
        imageView.f(R.raw.passcode_lock, 58, 58, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, w7.y5.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        m6Var.addView(frameLayout, w7.y5.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f23327w = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setAlpha(0.0f);
        TextView h = org.telegram.ui.Cells.c1.h(frameLayout, textView, w7.y5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.f23328x = h;
        h.setTextColor(-1);
        h.setTextSize(1, 15.0f);
        h.setGravity(1);
        h.setVisibility(4);
        m6Var.addView(h, w7.y5.e(-2, -2, 17));
        ci.j9 j9Var = new ci.j9(this, context);
        this.f23326s = j9Var;
        frameLayout.addView(j9Var, w7.y5.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f23325r = editTextBoldCursor;
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
        frameLayout.addView(editTextBoldCursor, w7.y5.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new e1(this, 3));
        editTextBoldCursor.addTextChangedListener(new ci.i2(this, 10));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new ii.d1(2));
        ImageView imageView2 = new ImageView(context);
        this.f23329y = imageView2;
        imageView2.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView2, w7.y5.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView2.setContentDescription(LocaleController.getString(R.string.Done));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ce0 f28476b;

            {
                this.f28476b = this;
            }

            @Override
            public final void onClick(View view) {
                LinkedList linkedList;
                LinkedList linkedList2;
                int i11;
                boolean z10;
                LinkedList linkedList3;
                int i12;
                int i13;
                int i14;
                boolean z11;
                boolean z12;
                int i15 = r2;
                ce0 ce0Var = this.f28476b;
                switch (i15) {
                    case 0:
                        ce0Var.k(false);
                        return;
                    case 1:
                        ce0Var.c();
                        return;
                    default:
                        LinkedList linkedList4 = ce0Var.N;
                        LinkedList linkedList5 = ce0Var.M;
                        ci.j9 j9Var2 = ce0Var.f23326s;
                        if (ce0Var.U) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("0");
                                    z10 = false;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("1");
                                    z10 = false;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("2");
                                    z10 = false;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("3");
                                    z10 = false;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("4");
                                    z10 = false;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("5");
                                    z10 = false;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("6");
                                    z10 = false;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("7");
                                    z10 = false;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("8");
                                    z10 = false;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("9");
                                    z10 = false;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    ce0Var.c();
                                    z10 = false;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) j9Var2.f4865c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) j9Var2.f4864b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) j9Var2.d;
                                    if (sb2.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i11 = intValue;
                                        z10 = false;
                                        break;
                                    } else {
                                        try {
                                            j9Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i16 = length;
                                        while (i16 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i16);
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i12 = intValue;
                                                i13 = 1;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, j9Var2.c(i16)));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i12 = intValue;
                                                i13 = 1;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i16);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr = new float[i13];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr));
                                                float[] fArr2 = new float[i13];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr2));
                                                float[] fArr3 = new float[i13];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr3));
                                                float[] fArr4 = new float[i13];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr4));
                                                i14 = i16;
                                                float[] fArr5 = new float[i13];
                                                fArr5[0] = j9Var2.c(i16);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr5));
                                            } else {
                                                i14 = i16;
                                            }
                                            i16 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            intValue = i12;
                                        }
                                        linkedList2 = linkedList5;
                                        i11 = intValue;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i17 = 0; i17 < length; i17++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), property5, j9Var2.c(i17)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i17), property5, j9Var2.c(i17)));
                                        }
                                        jf jfVar = (jf) j9Var2.f4866f;
                                        if (jfVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(jfVar);
                                            j9Var2.f4866f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) j9Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        j9Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) j9Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) j9Var2.e).addListener(new yd0(j9Var2, 1));
                                        ((AnimatorSet) j9Var2.e).start();
                                        ce0.a((ce0) j9Var2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    break;
                            }
                            if (((StringBuilder) j9Var2.d).length() == 4) {
                                ce0Var.k(false);
                            }
                            int i18 = i11;
                            if (i18 != 11) {
                                Drawable drawable = ce0Var.f23320a;
                                if (drawable instanceof mc0) {
                                    mc0 mc0Var = (mc0) drawable;
                                    mc0Var.D = null;
                                    mc0Var.z();
                                    float f7 = mc0Var.h;
                                    if (i18 == 10) {
                                        if (z10) {
                                            mc0Var.y();
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                        mc0Var.x(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f7 >= 1.0f) {
                                            ce0Var.b(mc0Var);
                                            return;
                                        }
                                        ci.y0 y0Var = new ci.y0(ce0Var, z11, mc0Var, 21);
                                        LinkedList linkedList6 = linkedList2;
                                        linkedList6.offer(y0Var);
                                        LinkedList linkedList7 = linkedList;
                                        linkedList7.offer(Boolean.valueOf(z11));
                                        ArrayList arrayList4 = new ArrayList();
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i19 = 0; i19 < linkedList6.size(); i19++) {
                                            Runnable runnable = (Runnable) linkedList6.get(i19);
                                            Boolean bool = (Boolean) linkedList7.get(i19);
                                            if (bool != null && bool.booleanValue() != z11) {
                                                arrayList4.add(runnable);
                                                arrayList5.add(Integer.valueOf(i19));
                                            }
                                        }
                                        int size = arrayList4.size();
                                        int i20 = 0;
                                        while (i20 < size) {
                                            Object obj = arrayList4.get(i20);
                                            i20++;
                                            linkedList6.remove((Runnable) obj);
                                        }
                                        Collections.sort(arrayList5, new org.telegram.ui.cf(11));
                                        int size2 = arrayList5.size();
                                        int i21 = 0;
                                        while (i21 < size2) {
                                            Object obj2 = arrayList5.get(i21);
                                            i21++;
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
        frameLayout.addView(imageView3, w7.y5.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ce0 f28476b;

            {
                this.f28476b = this;
            }

            @Override
            public final void onClick(View view) {
                LinkedList linkedList;
                LinkedList linkedList2;
                int i11;
                boolean z10;
                LinkedList linkedList3;
                int i12;
                int i13;
                int i14;
                boolean z11;
                boolean z12;
                int i15 = r2;
                ce0 ce0Var = this.f28476b;
                switch (i15) {
                    case 0:
                        ce0Var.k(false);
                        return;
                    case 1:
                        ce0Var.c();
                        return;
                    default:
                        LinkedList linkedList4 = ce0Var.N;
                        LinkedList linkedList5 = ce0Var.M;
                        ci.j9 j9Var2 = ce0Var.f23326s;
                        if (ce0Var.U) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("0");
                                    z10 = false;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("1");
                                    z10 = false;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("2");
                                    z10 = false;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("3");
                                    z10 = false;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("4");
                                    z10 = false;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("5");
                                    z10 = false;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("6");
                                    z10 = false;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("7");
                                    z10 = false;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("8");
                                    z10 = false;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    j9Var2.b("9");
                                    z10 = false;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    ce0Var.c();
                                    z10 = false;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) j9Var2.f4865c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) j9Var2.f4864b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) j9Var2.d;
                                    if (sb2.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i11 = intValue;
                                        z10 = false;
                                        break;
                                    } else {
                                        try {
                                            j9Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i16 = length;
                                        while (i16 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i16);
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i12 = intValue;
                                                i13 = 1;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, j9Var2.c(i16)));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i12 = intValue;
                                                i13 = 1;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i16);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr = new float[i13];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr));
                                                float[] fArr2 = new float[i13];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr2));
                                                float[] fArr3 = new float[i13];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr3));
                                                float[] fArr4 = new float[i13];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr4));
                                                i14 = i16;
                                                float[] fArr5 = new float[i13];
                                                fArr5[0] = j9Var2.c(i16);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr5));
                                            } else {
                                                i14 = i16;
                                            }
                                            i16 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            intValue = i12;
                                        }
                                        linkedList2 = linkedList5;
                                        i11 = intValue;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i17 = 0; i17 < length; i17++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), property5, j9Var2.c(i17)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i17), property5, j9Var2.c(i17)));
                                        }
                                        jf jfVar = (jf) j9Var2.f4866f;
                                        if (jfVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(jfVar);
                                            j9Var2.f4866f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) j9Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        j9Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) j9Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) j9Var2.e).addListener(new yd0(j9Var2, 1));
                                        ((AnimatorSet) j9Var2.e).start();
                                        ce0.a((ce0) j9Var2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    break;
                            }
                            if (((StringBuilder) j9Var2.d).length() == 4) {
                                ce0Var.k(false);
                            }
                            int i18 = i11;
                            if (i18 != 11) {
                                Drawable drawable = ce0Var.f23320a;
                                if (drawable instanceof mc0) {
                                    mc0 mc0Var = (mc0) drawable;
                                    mc0Var.D = null;
                                    mc0Var.z();
                                    float f7 = mc0Var.h;
                                    if (i18 == 10) {
                                        if (z10) {
                                            mc0Var.y();
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                        mc0Var.x(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f7 >= 1.0f) {
                                            ce0Var.b(mc0Var);
                                            return;
                                        }
                                        ci.y0 y0Var = new ci.y0(ce0Var, z11, mc0Var, 21);
                                        LinkedList linkedList6 = linkedList2;
                                        linkedList6.offer(y0Var);
                                        LinkedList linkedList7 = linkedList;
                                        linkedList7.offer(Boolean.valueOf(z11));
                                        ArrayList arrayList4 = new ArrayList();
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i19 = 0; i19 < linkedList6.size(); i19++) {
                                            Runnable runnable = (Runnable) linkedList6.get(i19);
                                            Boolean bool = (Boolean) linkedList7.get(i19);
                                            if (bool != null && bool.booleanValue() != z11) {
                                                arrayList4.add(runnable);
                                                arrayList5.add(Integer.valueOf(i19));
                                            }
                                        }
                                        int size = arrayList4.size();
                                        int i20 = 0;
                                        while (i20 < size) {
                                            Object obj = arrayList4.get(i20);
                                            i20++;
                                            linkedList6.remove((Runnable) obj);
                                        }
                                        Collections.sort(arrayList5, new org.telegram.ui.cf(11));
                                        int size2 = arrayList5.size();
                                        int i21 = 0;
                                        while (i21 < size2) {
                                            Object obj2 = arrayList5.get(i21);
                                            i21++;
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
        frameLayout.addView(view, w7.y5.a(-1.0f, 1.0f / AndroidUtilities.density, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        m6Var.addView(frameLayout2, w7.y5.e(-1, -1, 51));
        ai.w5 w5Var = new ai.w5(context, 17);
        this.e = w5Var;
        frameLayout2.addView(w5Var, w7.y5.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f23321b = frameLayout3;
        w5Var.addView(frameLayout3, w7.y5.e(-2, -2, 49));
        TextView f7 = org.telegram.messenger.f0.f(context, 1, 15.0f);
        f7.setTypeface(AndroidUtilities.bold());
        f7.setTextColor(-1);
        f7.setText(LocaleController.getString(R.string.UnlockToUse));
        TextView h10 = org.telegram.ui.Cells.c1.h(frameLayout3, f7, w7.y5.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.f23322c = h10;
        h10.setTextSize(1, 14.0f);
        h10.setTextColor(-1);
        h10.setText(LocaleController.getString(R.string.EnterPINorFingerprint));
        frameLayout3.addView(h10, w7.y5.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f23323f = new ArrayList(10);
        int i11 = 0;
        while (true) {
            if (i11 >= 12) {
                break;
            }
            ae0 ae0Var = new ae0(context);
            w7.a6.b(ae0Var, 0.15f, 1.5f);
            ae0Var.setTag(Integer.valueOf(i11));
            if (i11 == 11) {
                int dp = AndroidUtilities.dp(30.0f);
                ae0Var.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, 0, 654311423, 654311423));
                ae0Var.setImage(R.drawable.filled_clear);
                ae0Var.setOnLongClickListener(new n10(this, 1));
                ae0Var.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
                l(ae0Var, R.id.passcode_btn_0);
            } else if (i11 == 10) {
                this.f23324n = ae0Var;
                int dp2 = AndroidUtilities.dp(30.0f);
                ae0Var.setBackground(org.telegram.ui.ActionBar.h6.i0(dp2, dp2, dp2, dp2, 0, 654311423, 654311423));
                ae0Var.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
                ae0Var.setImage(R.drawable.fingerprint);
                l(ae0Var, R.id.passcode_btn_1);
            } else {
                int dp3 = AndroidUtilities.dp(30.0f);
                ae0Var.setBackground(org.telegram.ui.ActionBar.h6.i0(dp3, dp3, dp3, dp3, 654311423, 1291845631, 1291845631));
                ae0Var.setContentDescription(i11 + "");
                ae0Var.setNum(i11);
                if (i11 == 0) {
                    l(ae0Var, R.id.passcode_btn_backspace);
                } else if (i11 == 9) {
                    Activity findActivity = AndroidUtilities.findActivity(getContext());
                    if (Build.VERSION.SDK_INT >= 23 && findActivity != null && SharedConfig.useFingerprintLock) {
                        try {
                            Context context2 = ApplicationLoader.applicationContext;
                            xf.a aVar = xf.b.f46029a;
                            if (aVar.H0(context2) && aVar.c(context2) && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                                l(ae0Var, R.id.passcode_btn_fingerprint);
                            }
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    l(ae0Var, R.id.passcode_btn_0);
                } else {
                    l(ae0Var, iArr[i11 + 1]);
                }
            }
            ae0Var.setId(iArr[i11]);
            ae0Var.setOnClickListener(new View.OnClickListener(this) {
                public final ce0 f28476b;

                {
                    this.f28476b = this;
                }

                @Override
                public final void onClick(View view2) {
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    int i112;
                    boolean z10;
                    LinkedList linkedList3;
                    int i12;
                    int i13;
                    int i14;
                    boolean z11;
                    boolean z12;
                    int i15 = r2;
                    ce0 ce0Var = this.f28476b;
                    switch (i15) {
                        case 0:
                            ce0Var.k(false);
                            return;
                        case 1:
                            ce0Var.c();
                            return;
                        default:
                            LinkedList linkedList4 = ce0Var.N;
                            LinkedList linkedList5 = ce0Var.M;
                            ci.j9 j9Var2 = ce0Var.f23326s;
                            if (ce0Var.U) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        j9Var2.b("0");
                                        z10 = false;
                                        break;
                                    case 1:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        j9Var2.b("1");
                                        z10 = false;
                                        break;
                                    case 2:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        j9Var2.b("2");
                                        z10 = false;
                                        break;
                                    case 3:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        j9Var2.b("3");
                                        z10 = false;
                                        break;
                                    case 4:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        j9Var2.b("4");
                                        z10 = false;
                                        break;
                                    case 5:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        j9Var2.b("5");
                                        z10 = false;
                                        break;
                                    case 6:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        j9Var2.b("6");
                                        z10 = false;
                                        break;
                                    case 7:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        j9Var2.b("7");
                                        z10 = false;
                                        break;
                                    case 8:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        j9Var2.b("8");
                                        z10 = false;
                                        break;
                                    case 9:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        j9Var2.b("9");
                                        z10 = false;
                                        break;
                                    case 10:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        ce0Var.c();
                                        z10 = false;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) j9Var2.f4865c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        ArrayList arrayList2 = (ArrayList) j9Var2.f4864b;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb2 = (StringBuilder) j9Var2.d;
                                        if (sb2.length() == 0) {
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            i112 = intValue;
                                            z10 = false;
                                            break;
                                        } else {
                                            try {
                                                j9Var2.performHapticFeedback(3);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int length = sb2.length() - 1;
                                            if (length != 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            linkedList = linkedList4;
                                            int i16 = length;
                                            while (i16 < 4) {
                                                TextView textView2 = (TextView) arrayList2.get(i16);
                                                if (textView2.getAlpha() != 0.0f) {
                                                    linkedList3 = linkedList5;
                                                    i12 = intValue;
                                                    i13 = 1;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, j9Var2.c(i16)));
                                                } else {
                                                    linkedList3 = linkedList5;
                                                    i12 = intValue;
                                                    i13 = 1;
                                                }
                                                TextView textView3 = (TextView) arrayList.get(i16);
                                                if (textView3.getAlpha() != 0.0f) {
                                                    float[] fArr = new float[i13];
                                                    fArr[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr));
                                                    float[] fArr2 = new float[i13];
                                                    fArr2[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr2));
                                                    float[] fArr3 = new float[i13];
                                                    fArr3[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr3));
                                                    float[] fArr4 = new float[i13];
                                                    fArr4[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr4));
                                                    i14 = i16;
                                                    float[] fArr5 = new float[i13];
                                                    fArr5[0] = j9Var2.c(i16);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr5));
                                                } else {
                                                    i14 = i16;
                                                }
                                                i16 = i14 + 1;
                                                linkedList5 = linkedList3;
                                                intValue = i12;
                                            }
                                            linkedList2 = linkedList5;
                                            i112 = intValue;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i17 = 0; i17 < length; i17++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), property5, j9Var2.c(i17)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i17), property5, j9Var2.c(i17)));
                                            }
                                            jf jfVar = (jf) j9Var2.f4866f;
                                            if (jfVar != null) {
                                                AndroidUtilities.cancelRunOnUIThread(jfVar);
                                                j9Var2.f4866f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) j9Var2.e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            j9Var2.e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) j9Var2.e).playTogether(arrayList3);
                                            ((AnimatorSet) j9Var2.e).addListener(new yd0(j9Var2, 1));
                                            ((AnimatorSet) j9Var2.e).start();
                                            ce0.a((ce0) j9Var2.h);
                                            z10 = true;
                                            break;
                                        }
                                    default:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        break;
                                }
                                if (((StringBuilder) j9Var2.d).length() == 4) {
                                    ce0Var.k(false);
                                }
                                int i18 = i112;
                                if (i18 != 11) {
                                    Drawable drawable = ce0Var.f23320a;
                                    if (drawable instanceof mc0) {
                                        mc0 mc0Var = (mc0) drawable;
                                        mc0Var.D = null;
                                        mc0Var.z();
                                        float f72 = mc0Var.h;
                                        if (i18 == 10) {
                                            if (z10) {
                                                mc0Var.y();
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                            mc0Var.x(true);
                                            z12 = true;
                                        }
                                        if (z12) {
                                            if (f72 >= 1.0f) {
                                                ce0Var.b(mc0Var);
                                                return;
                                            }
                                            ci.y0 y0Var = new ci.y0(ce0Var, z11, mc0Var, 21);
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(y0Var);
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z11));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i19 = 0; i19 < linkedList6.size(); i19++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i19);
                                                Boolean bool = (Boolean) linkedList7.get(i19);
                                                if (bool != null && bool.booleanValue() != z11) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i19));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i20 = 0;
                                            while (i20 < size) {
                                                Object obj = arrayList4.get(i20);
                                                i20++;
                                                linkedList6.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.cf(11));
                                            int size2 = arrayList5.size();
                                            int i21 = 0;
                                            while (i21 < size2) {
                                                Object obj2 = arrayList5.get(i21);
                                                i21++;
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
            this.f23323f.add(ae0Var);
            i11++;
        }
        for (i10 = 11; i10 >= 0; i10--) {
            this.e.addView((FrameLayout) this.f23323f.get(i10), w7.y5.e(60, 60, 51));
        }
        d();
    }

    public static void a(ce0 ce0Var) {
        boolean z10;
        float f7;
        float f10;
        FrameLayout frameLayout = ce0Var.f23321b;
        ci.j9 j9Var = ce0Var.f23326s;
        if (j9Var != null && ((StringBuilder) j9Var.d).length() <= 0) {
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
            org.telegram.messenger.ok.s(scaleX.scaleY(f11), rr.h, 320L);
        }
    }

    public static void l(ae0 ae0Var, int i10) {
        ae0Var.setNextFocusForwardId(i10);
        if (Build.VERSION.SDK_INT >= 22) {
            ae0Var.setAccessibilityTraversalBefore(i10);
        }
    }

    public final void b(mc0 mc0Var) {
        o1.k kVar = this.L;
        if (kVar != null && kVar.f15526f) {
            kVar.c();
        }
        o1.j jVar = new o1.j(0.0f);
        mc0Var.D = new mv(jVar, 9);
        mc0Var.z();
        o1.k kVar2 = new o1.k(jVar);
        kVar2.f15533u = org.telegram.ui.Cells.c1.l(100.0f, 300.0f, 1.0f);
        this.L = kVar2;
        kVar2.a(new ei.m4(4, this, mc0Var));
        this.L.b(new k7(mc0Var, 4));
        this.L.f();
    }

    public final void c() {
        Activity findActivity;
        ee0 ee0Var;
        if (Build.VERSION.SDK_INT >= 23 && (findActivity = AndroidUtilities.findActivity(getContext())) != null && this.f23324n.getVisibility() == 0 && !ApplicationLoader.mainInterfacePaused) {
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                ArrayList arrayList = launchActivity.B0;
                if (arrayList.isEmpty() && (ee0Var = launchActivity.A0) != null) {
                    if (this != ee0Var.f23944b) {
                        return;
                    }
                } else if (hg.c.g(1, arrayList) != this) {
                    return;
                }
            }
            try {
                if (new aa.a(new k6.h(getContext(), 1)).f(15) == 0 && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    a6.m mVar = new a6.m(LaunchActivity.G1, f0.e.e(getContext()), new ud0(this));
                    j6.l lVar = new j6.l(2);
                    lVar.f12900b = LocaleController.getString(R.string.UnlockToUse);
                    lVar.d = LocaleController.getString(R.string.UsePIN);
                    lVar.f12899a = 15;
                    mVar.b(lVar.d(), null);
                    m(false);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ce0.d():void");
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
            long j3 = SharedConfig.passcodeRetryInMs - (elapsedRealtime - SharedConfig.lastUptimeMillis);
            SharedConfig.passcodeRetryInMs = j3;
            if (j3 < 0) {
                SharedConfig.passcodeRetryInMs = 0L;
            }
        }
        SharedConfig.lastUptimeMillis = elapsedRealtime;
        SharedConfig.saveConfig();
        long j10 = SharedConfig.passcodeRetryInMs;
        EditTextBoldCursor editTextBoldCursor = this.f23325r;
        FrameLayout frameLayout = this.h;
        org.telegram.ui.Cells.t6 t6Var = this.R;
        TextView textView = this.f23328x;
        if (j10 > 0) {
            int max = Math.max(1, (int) Math.ceil(j10 / 1000.0d));
            if (max != this.S) {
                textView.setText(LocaleController.formatString(R.string.TooManyTries, LocaleController.formatPluralString("Seconds", max, new Object[0])));
                this.S = max;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                frameLayout.setVisibility(4);
                m(false);
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
            m(true);
            if (SharedConfig.passcodeType == 1) {
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            }
        }
    }

    public final boolean g() {
        ci.i4 i4Var = this.T;
        if (i4Var != null && i4Var.c()) {
            AndroidUtilities.hideKeyboard(this.f23325r);
            return false;
        }
        return true;
    }

    public final void i() {
        e();
        if (this.f23328x.getVisibility() != 0) {
            if (SharedConfig.passcodeType == 1) {
                EditTextBoldCursor editTextBoldCursor = this.f23325r;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                }
                AndroidUtilities.runOnUIThread(new rd0(this, 0), 200L);
            }
            c();
        }
    }

    public final void j(boolean z10, int i10, int i11, org.telegram.ui.n80 n80Var) {
        View currentFocus;
        boolean z11;
        int i12;
        int i13;
        d();
        e();
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        int i14 = SharedConfig.passcodeType;
        TextView textView = this.f23328x;
        EditTextBoldCursor editTextBoldCursor = this.f23325r;
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
        v9 v9Var = null;
        this.f23320a = null;
        boolean z12 = org.telegram.ui.ActionBar.h6.r0() instanceof mc0;
        ci.m6 m6Var = this.v;
        if (z12) {
            z11 = !org.telegram.ui.ActionBar.h6.I.q();
            this.f23320a = org.telegram.ui.ActionBar.h6.r0();
            m6Var.setBackgroundColor(-1090519040);
        } else {
            if (org.telegram.ui.ActionBar.h6.W && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.h6.H0()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.h6.H0())) {
                org.telegram.ui.ActionBar.z5 z5Var = org.telegram.ui.ActionBar.h6.I.f18944i0;
                if (z5Var != null && (i12 = z5Var.d) != 0 && (i13 = z5Var.e) != 0) {
                    v9Var = new v9(v9.d(z5Var.h), new int[]{i12, i13});
                }
                this.f23320a = v9Var;
                if (v9Var == null) {
                    this.f23320a = org.telegram.ui.ActionBar.h6.r0();
                }
                if (this.f23320a instanceof v9) {
                    m6Var.setBackgroundColor(570425344);
                } else {
                    m6Var.setBackgroundColor(-1090519040);
                }
            } else {
                if (!"d".equals(org.telegram.ui.ActionBar.h6.H0())) {
                    String H0 = org.telegram.ui.ActionBar.h6.H0();
                    if (!org.telegram.ui.ActionBar.h6.f19161j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(H0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(H0)) {
                        Drawable r02 = org.telegram.ui.ActionBar.h6.r0();
                        this.f23320a = r02;
                        if (r02 instanceof v9) {
                            m6Var.setBackgroundColor(570425344);
                        } else if (r02 != null) {
                            m6Var.setBackgroundColor(-1090519040);
                        } else {
                            m6Var.setBackgroundColor(-11436898);
                        }
                    }
                }
                m6Var.setBackgroundColor(-11436898);
            }
            z11 = false;
        }
        Drawable drawable = this.f23320a;
        if (drawable instanceof mc0) {
            mc0 mc0Var = (mc0) drawable;
            int[] iArr = mc0Var.f26431a;
            if (z11) {
                int[] iArr2 = new int[iArr.length];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    iArr2[i15] = org.telegram.ui.ActionBar.h6.b(0.14f, 0.0f, iArr[i15]);
                }
                iArr = iArr2;
            }
            this.f23320a = new mc0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (mc0Var.f26452u != null && mc0Var.f26448q < 0) {
                m6Var.setBackgroundColor(2130706432);
            } else {
                m6Var.setBackgroundColor(570425344);
            }
            ((mc0) this.f23320a).r(m6Var);
        }
        this.f23327w.setText(LocaleController.getString(R.string.AppLocked));
        int i16 = SharedConfig.passcodeType;
        ImageView imageView = this.E;
        ImageView imageView2 = this.f23329y;
        ai.w5 w5Var = this.e;
        ci.j9 j9Var = this.f23326s;
        if (i16 == 0) {
            if (textView.getVisibility() != 0) {
                w5Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            j9Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i16 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            w5Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            j9Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.f23324n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        ci.j9.a(j9Var, false);
        if (z10) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new xd0(this, i10, i11, n80Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.P = 1.0f;
            f(1.0f);
            lj0 lj0Var = this.I;
            lj0Var.setScaleX(1.0f);
            lj0Var.setScaleY(1.0f);
            lj0Var.i();
            lj0Var.getAnimatedDrawable().N(38, false, false);
            if (n80Var != null) {
                n80Var.run();
            }
        }
        setOnTouchListener(new bi.d(19));
    }

    public final void k(boolean z10) {
        String str;
        EditTextBoldCursor editTextBoldCursor = this.f23325r;
        if (!z10) {
            if (SharedConfig.passcodeRetryInMs <= 0) {
                int i10 = SharedConfig.passcodeType;
                ci.j9 j9Var = this.f23326s;
                if (i10 == 0) {
                    str = ((StringBuilder) j9Var.d).toString();
                } else if (i10 != 1) {
                    str = "";
                } else {
                    str = editTextBoldCursor.getText().toString();
                }
                int length = str.length();
                FrameLayout frameLayout = this.f23321b;
                if (length == 0) {
                    BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                    int i11 = -this.Q;
                    this.Q = i11;
                    AndroidUtilities.shakeViewSpring(frameLayout, i11);
                    return;
                } else if (!SharedConfig.checkPasscode(str)) {
                    SharedConfig.increaseBadPasscodeTries();
                    if (SharedConfig.passcodeRetryInMs > 0) {
                        e();
                    }
                    editTextBoldCursor.setText("");
                    ci.j9.a(j9Var, true);
                    BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                    int i12 = -this.Q;
                    this.Q = i12;
                    AndroidUtilities.shakeViewSpring(frameLayout, i12);
                    Drawable drawable = this.f23320a;
                    if (drawable instanceof mc0) {
                        mc0 mc0Var = (mc0) drawable;
                        o1.k kVar = this.L;
                        if (kVar != null) {
                            kVar.c();
                            mc0Var.h = 1.0f;
                            mc0Var.z();
                        }
                        if (mc0Var.h >= 1.0f) {
                            mc0Var.m(true);
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
        be0 be0Var = this.K;
        if (be0Var != null) {
            be0Var.g(this);
        }
        lj0 lj0Var = this.I;
        lj0Var.getAnimatedDrawable().P(71);
        lj0Var.getAnimatedDrawable().N(37, false, false);
        lj0Var.d();
        AndroidUtilities.runOnUIThread(new rd0(this, 1));
    }

    public final void m(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U = z10;
        float alpha = this.e.getAlpha();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
        this.V = ofFloat;
        ofFloat.addUpdateListener(new sd0(this, 1));
        this.V.addListener(new ca(16, this, z10));
        this.V.setInterpolator(rr.h);
        this.V.setDuration(320L);
        this.V.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.passcodeDismissed);
        if (this.T == null && (getParent() instanceof View)) {
            this.T = new ci.i4((View) getParent(), false, new y2(this, 9));
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
        TextView textView = this.f23327w;
        int[] iArr = this.W;
        textView.getLocationInWindow(iArr);
        boolean isTablet = AndroidUtilities.isTablet();
        lj0 lj0Var = this.I;
        if (!isTablet && getContext().getResources().getConfiguration().orientation == 2) {
            int dp = iArr[1] - AndroidUtilities.dp(100.0f);
            this.H = dp;
            lj0Var.setTranslationY(dp);
            return;
        }
        int dp2 = iArr[1] - AndroidUtilities.dp(100.0f);
        this.H = dp2;
        lj0Var.setTranslationY(dp2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        float f7;
        float f10;
        float f11;
        int i14;
        int i15;
        int i16;
        int size = View.MeasureSpec.getSize(i10);
        int i17 = AndroidUtilities.displaySize.y;
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
                i16 = 0;
            } else {
                i16 = 8;
            }
            view.setVisibility(i16);
        }
        lj0 lj0Var = this.I;
        ai.w5 w5Var = this.e;
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
            lj0Var.setTranslationX((f11 / f10) - AndroidUtilities.dp(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            if (SharedConfig.passcodeType == 0) {
                i14 = size / 2;
            } else {
                i14 = size;
            }
            layoutParams.width = i14;
            layoutParams.height = AndroidUtilities.dp(180.0f);
            int A = org.telegram.messenger.ok.A(140.0f, i17, 2);
            if (SharedConfig.passcodeType == 0) {
                i15 = AndroidUtilities.dp(40.0f);
            } else {
                i15 = 0;
            }
            layoutParams.topMargin = A + i15;
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i17;
            int i18 = size / 2;
            layoutParams2.leftMargin = i18;
            layoutParams2.topMargin = AndroidUtilities.statusBarHeight;
            layoutParams2.width = i18;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) w5Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams3.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            layoutParams3.gravity = 17;
            w5Var.setLayoutParams(layoutParams3);
        } else {
            lj0Var.setTranslationX((size / 2.0f) - AndroidUtilities.dp(29.0f));
            int i19 = AndroidUtilities.statusBarHeight;
            if (AndroidUtilities.isTablet()) {
                if (size > AndroidUtilities.dp(498.0f)) {
                    i12 = org.telegram.messenger.ok.A(498.0f, size, 2);
                    size = AndroidUtilities.dp(498.0f);
                } else {
                    i12 = 0;
                }
                if (i17 > AndroidUtilities.dp(528.0f)) {
                    i19 = org.telegram.messenger.ok.A(528.0f, i17, 2);
                    i17 = AndroidUtilities.dp(528.0f);
                }
            } else {
                i12 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            int i20 = i17 / 3;
            if (SharedConfig.passcodeType == 0) {
                i13 = AndroidUtilities.dp(40.0f);
            } else {
                i13 = 0;
            }
            layoutParams4.height = i20 + i13;
            layoutParams4.width = size;
            layoutParams4.topMargin = i19;
            layoutParams4.leftMargin = i12;
            frameLayout2.setTag(Integer.valueOf(i19));
            frameLayout2.setLayoutParams(layoutParams4);
            int i21 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) w5Var.getLayoutParams();
            layoutParams5.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams5.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            if (AndroidUtilities.isTablet()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            w5Var.setLayoutParams(layoutParams5);
            int i22 = i17 - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.leftMargin = i12;
            if (AndroidUtilities.isTablet()) {
                layoutParams6.topMargin = (i17 - i22) / 2;
            } else {
                layoutParams6.topMargin = i21;
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
        for (int i23 = 0; i23 < 12; i23++) {
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
            FrameLayout frameLayout3 = (FrameLayout) this.f23323f.get(i23);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((dp3 + dp2) * (i24 / 3)) + dp4;
            layoutParams7.leftMargin = (dp3 + dp) * (i24 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
        }
        super.onMeasure(i10, i11);
    }

    public void setDelegate(be0 be0Var) {
        this.K = be0Var;
    }

    public void f(float f7) {
    }

    public void h() {
    }
}
