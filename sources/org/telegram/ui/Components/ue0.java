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
public class ue0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] f31402e0 = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView E;
    public final View F;
    public int G;
    public int H;
    public final hk0 I;
    public final Rect J;
    public te0 K;
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
    public Drawable f31403a;
    public ci.h4 f31404a0;
    public final FrameLayout f31405b;
    public boolean f31406b0;
    public final TextView f31407c;
    public ValueAnimator f31408c0;
    public final FrameLayout d;
    public final int[] f31409d0;
    public final ai.x5 f31410e;
    public final ArrayList f31411f;
    public final FrameLayout h;
    public final se0 f31412n;
    public final EditTextBoldCursor f31413r;
    public final ci.j9 f31414s;
    public final ci.m6 v;
    public final TextView f31415w;
    public final TextView f31416x;
    public final ImageView f31417y;

    public ue0(Context context) {
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
        this.f31406b0 = true;
        this.f31409d0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        ci.m6 m6Var = new ci.m6(this, context);
        this.v = m6Var;
        m6Var.setWillNotDraw(false);
        addView(m6Var, w7.x5.d(-1.0f, -1));
        ?? imageView = new ImageView(context);
        this.I = imageView;
        imageView.f(R.raw.passcode_lock, 58, 58, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, w7.x5.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        m6Var.addView(frameLayout, w7.x5.d(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f31415w = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setAlpha(0.0f);
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 128.0f, -2, 81), context);
        this.f31416x = g10;
        g10.setTextColor(-1);
        g10.setTextSize(1, 15.0f);
        g10.setGravity(1);
        g10.setVisibility(4);
        m6Var.addView(g10, w7.x5.e(-2, -2, 17));
        ci.j9 j9Var = new ci.j9(this, context);
        this.f31414s = j9Var;
        frameLayout.addView(j9Var, w7.x5.a(-2.0f, 70.0f, 0.0f, 70.0f, 46.0f, -1, 81));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f31413r = editTextBoldCursor;
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
        frameLayout.addView(editTextBoldCursor, w7.x5.a(-2.0f, 70.0f, 0.0f, 70.0f, 0.0f, -1, 81));
        editTextBoldCursor.setOnEditorActionListener(new e1(this, 4));
        editTextBoldCursor.addTextChangedListener(new ci.h2(this, 10));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new ii.d1(1));
        ImageView imageView2 = new ImageView(context);
        this.f31417y = imageView2;
        imageView2.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView2, w7.x5.a(60.0f, 0.0f, 0.0f, 10.0f, 4.0f, 60, 85));
        imageView2.setContentDescription(LocaleController.getString(R.string.Done));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ue0 f28329b;

            {
                this.f28329b = this;
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
                ue0 ue0Var = this.f28329b;
                switch (i15) {
                    case 0:
                        ue0Var.m(false);
                        return;
                    case 1:
                        ue0Var.c();
                        return;
                    default:
                        LinkedList linkedList4 = ue0Var.R;
                        LinkedList linkedList5 = ue0Var.Q;
                        ci.j9 j9Var2 = ue0Var.f31414s;
                        if (ue0Var.f31406b0 && !ue0Var.L) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("0");
                                    z11 = z10;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("1");
                                    z11 = z10;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("2");
                                    z11 = z10;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("3");
                                    z11 = z10;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("4");
                                    z11 = z10;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("5");
                                    z11 = z10;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("6");
                                    z11 = z10;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("7");
                                    z11 = z10;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("8");
                                    z11 = z10;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("9");
                                    z11 = z10;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    ue0Var.c();
                                    z11 = z10;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) j9Var2.f5287c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z10 = false;
                                    ArrayList arrayList2 = (ArrayList) j9Var2.f5286b;
                                    Property property5 = View.TRANSLATION_X;
                                    int i16 = 1;
                                    StringBuilder sb2 = (StringBuilder) j9Var2.d;
                                    if (sb2.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i11 = intValue;
                                        z11 = z10;
                                        break;
                                    } else {
                                        try {
                                            j9Var2.performHapticFeedback(3);
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
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
                                                fArr5[0] = j9Var2.c(i17);
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
                                                fArr10[0] = j9Var2.c(i17);
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
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), property5, j9Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), property5, j9Var2.c(i18)));
                                        }
                                        lf lfVar = (lf) j9Var2.f5289f;
                                        if (lfVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(lfVar);
                                            j9Var2.f5289f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) j9Var2.f5288e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        j9Var2.f5288e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) j9Var2.f5288e).playTogether(arrayList3);
                                        ((AnimatorSet) j9Var2.f5288e).addListener(new qe0(j9Var2, 1));
                                        ((AnimatorSet) j9Var2.f5288e).start();
                                        ue0.a((ue0) j9Var2.h);
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
                            if (((StringBuilder) j9Var2.d).length() == 4) {
                                ue0Var.m(z10);
                            }
                            int i19 = i11;
                            if (i19 != 11) {
                                Drawable drawable = ue0Var.f31403a;
                                if (drawable instanceof dd0) {
                                    dd0 dd0Var = (dd0) drawable;
                                    dd0Var.D = null;
                                    dd0Var.z();
                                    float f7 = dd0Var.h;
                                    if (i19 == 10) {
                                        if (z11) {
                                            dd0Var.y();
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                        dd0Var.x(true);
                                        z13 = true;
                                    }
                                    if (z13) {
                                        if (f7 >= 1.0f) {
                                            ue0Var.b(dd0Var);
                                            return;
                                        }
                                        ci.x0 x0Var = new ci.x0(ue0Var, z12, dd0Var, 21);
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
                                        Collections.sort(arrayList5, new org.telegram.ui.ff(11));
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
        frameLayout.addView(imageView3, w7.x5.a(60.0f, 10.0f, 0.0f, 0.0f, 4.0f, 60, 83));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ue0 f28329b;

            {
                this.f28329b = this;
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
                ue0 ue0Var = this.f28329b;
                switch (i15) {
                    case 0:
                        ue0Var.m(false);
                        return;
                    case 1:
                        ue0Var.c();
                        return;
                    default:
                        LinkedList linkedList4 = ue0Var.R;
                        LinkedList linkedList5 = ue0Var.Q;
                        ci.j9 j9Var2 = ue0Var.f31414s;
                        if (ue0Var.f31406b0 && !ue0Var.L) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("0");
                                    z11 = z10;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("1");
                                    z11 = z10;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("2");
                                    z11 = z10;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("3");
                                    z11 = z10;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("4");
                                    z11 = z10;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("5");
                                    z11 = z10;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("6");
                                    z11 = z10;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("7");
                                    z11 = z10;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("8");
                                    z11 = z10;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    j9Var2.b("9");
                                    z11 = z10;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z10 = false;
                                    ue0Var.c();
                                    z11 = z10;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) j9Var2.f5287c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z10 = false;
                                    ArrayList arrayList2 = (ArrayList) j9Var2.f5286b;
                                    Property property5 = View.TRANSLATION_X;
                                    int i16 = 1;
                                    StringBuilder sb2 = (StringBuilder) j9Var2.d;
                                    if (sb2.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i11 = intValue;
                                        z11 = z10;
                                        break;
                                    } else {
                                        try {
                                            j9Var2.performHapticFeedback(3);
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
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
                                                fArr5[0] = j9Var2.c(i17);
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
                                                fArr10[0] = j9Var2.c(i17);
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
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), property5, j9Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), property5, j9Var2.c(i18)));
                                        }
                                        lf lfVar = (lf) j9Var2.f5289f;
                                        if (lfVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(lfVar);
                                            j9Var2.f5289f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) j9Var2.f5288e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        j9Var2.f5288e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) j9Var2.f5288e).playTogether(arrayList3);
                                        ((AnimatorSet) j9Var2.f5288e).addListener(new qe0(j9Var2, 1));
                                        ((AnimatorSet) j9Var2.f5288e).start();
                                        ue0.a((ue0) j9Var2.h);
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
                            if (((StringBuilder) j9Var2.d).length() == 4) {
                                ue0Var.m(z10);
                            }
                            int i19 = i11;
                            if (i19 != 11) {
                                Drawable drawable = ue0Var.f31403a;
                                if (drawable instanceof dd0) {
                                    dd0 dd0Var = (dd0) drawable;
                                    dd0Var.D = null;
                                    dd0Var.z();
                                    float f7 = dd0Var.h;
                                    if (i19 == 10) {
                                        if (z11) {
                                            dd0Var.y();
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                        dd0Var.x(true);
                                        z13 = true;
                                    }
                                    if (z13) {
                                        if (f7 >= 1.0f) {
                                            ue0Var.b(dd0Var);
                                            return;
                                        }
                                        ci.x0 x0Var = new ci.x0(ue0Var, z12, dd0Var, 21);
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
                                        Collections.sort(arrayList5, new org.telegram.ui.ff(11));
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
        frameLayout.addView(view, w7.x5.b(-1.0f, 1.0f / AndroidUtilities.density, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        m6Var.addView(frameLayout2, w7.x5.e(-1, -1, 51));
        ai.x5 x5Var = new ai.x5(context, 17);
        this.f31410e = x5Var;
        frameLayout2.addView(x5Var, w7.x5.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f31405b = frameLayout3;
        x5Var.addView(frameLayout3, w7.x5.e(-2, -2, 49));
        TextView f7 = org.telegram.messenger.q.f(context, 1, 15.0f);
        f7.setTypeface(AndroidUtilities.bold());
        f7.setTextColor(-1);
        f7.setText(string);
        TextView g11 = org.telegram.ui.Cells.c1.g(frameLayout3, f7, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 49), context);
        this.f31407c = g11;
        g11.setTextSize(1, 14.0f);
        g11.setTextColor(-1);
        g11.setText((CharSequence) null);
        frameLayout3.addView(g11, w7.x5.a(-2.0f, 0.0f, 23.0f, 0.0f, 0.0f, -2, 49));
        this.f31411f = new ArrayList(10);
        int i11 = 0;
        while (true) {
            if (i11 >= 12) {
                break;
            }
            se0 se0Var = new se0(context);
            w7.z5.b(se0Var, 0.15f, 1.5f);
            se0Var.setTag(Integer.valueOf(i11));
            int[] iArr = f31402e0;
            if (i11 == 11) {
                int dp = AndroidUtilities.dp(30.0f);
                se0Var.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 0, 654311423, 654311423));
                se0Var.setImage(R.drawable.filled_clear);
                se0Var.setOnLongClickListener(new d20(this, 1));
                se0Var.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
                int i12 = R.id.passcode_btn_0;
                se0Var.setNextFocusForwardId(i12);
                se0Var.setAccessibilityTraversalBefore(i12);
            } else if (i11 == 10) {
                this.f31412n = se0Var;
                int dp2 = AndroidUtilities.dp(30.0f);
                se0Var.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, 0, 654311423, 654311423));
                se0Var.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
                se0Var.setImage(R.drawable.fingerprint);
                int i13 = R.id.passcode_btn_1;
                se0Var.setNextFocusForwardId(i13);
                se0Var.setAccessibilityTraversalBefore(i13);
            } else {
                int dp3 = AndroidUtilities.dp(30.0f);
                se0Var.setBackground(org.telegram.ui.ActionBar.h6.j0(dp3, dp3, dp3, dp3, 654311423, 1291845631, 1291845631));
                se0Var.setContentDescription(i11 + "");
                se0Var.setNum(i11);
                if (i11 == 0) {
                    int i14 = R.id.passcode_btn_backspace;
                    se0Var.setNextFocusForwardId(i14);
                    se0Var.setAccessibilityTraversalBefore(i14);
                } else if (i11 == 9) {
                    if (f()) {
                        int i15 = R.id.passcode_btn_fingerprint;
                        se0Var.setNextFocusForwardId(i15);
                        se0Var.setAccessibilityTraversalBefore(i15);
                    } else {
                        int i16 = R.id.passcode_btn_0;
                        se0Var.setNextFocusForwardId(i16);
                        se0Var.setAccessibilityTraversalBefore(i16);
                    }
                } else {
                    int i17 = iArr[i11 + 1];
                    se0Var.setNextFocusForwardId(i17);
                    se0Var.setAccessibilityTraversalBefore(i17);
                }
            }
            se0Var.setId(iArr[i11]);
            se0Var.setOnClickListener(new View.OnClickListener(this) {
                public final ue0 f28329b;

                {
                    this.f28329b = this;
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
                    ue0 ue0Var = this.f28329b;
                    switch (i152) {
                        case 0:
                            ue0Var.m(false);
                            return;
                        case 1:
                            ue0Var.c();
                            return;
                        default:
                            LinkedList linkedList4 = ue0Var.R;
                            LinkedList linkedList5 = ue0Var.Q;
                            ci.j9 j9Var2 = ue0Var.f31414s;
                            if (ue0Var.f31406b0 && !ue0Var.L) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        j9Var2.b("0");
                                        z11 = z10;
                                        break;
                                    case 1:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        j9Var2.b("1");
                                        z11 = z10;
                                        break;
                                    case 2:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        j9Var2.b("2");
                                        z11 = z10;
                                        break;
                                    case 3:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        j9Var2.b("3");
                                        z11 = z10;
                                        break;
                                    case 4:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        j9Var2.b("4");
                                        z11 = z10;
                                        break;
                                    case 5:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        j9Var2.b("5");
                                        z11 = z10;
                                        break;
                                    case 6:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        j9Var2.b("6");
                                        z11 = z10;
                                        break;
                                    case 7:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        j9Var2.b("7");
                                        z11 = z10;
                                        break;
                                    case 8:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        j9Var2.b("8");
                                        z11 = z10;
                                        break;
                                    case 9:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        j9Var2.b("9");
                                        z11 = z10;
                                        break;
                                    case 10:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z10 = false;
                                        ue0Var.c();
                                        z11 = z10;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) j9Var2.f5287c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        z10 = false;
                                        ArrayList arrayList2 = (ArrayList) j9Var2.f5286b;
                                        Property property5 = View.TRANSLATION_X;
                                        int i162 = 1;
                                        StringBuilder sb2 = (StringBuilder) j9Var2.d;
                                        if (sb2.length() == 0) {
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            i112 = intValue;
                                            z11 = z10;
                                            break;
                                        } else {
                                            try {
                                                j9Var2.performHapticFeedback(3);
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
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
                                                    fArr5[0] = j9Var2.c(i172);
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
                                                    fArr10[0] = j9Var2.c(i172);
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
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), property5, j9Var2.c(i18)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), property5, j9Var2.c(i18)));
                                            }
                                            lf lfVar = (lf) j9Var2.f5289f;
                                            if (lfVar != null) {
                                                AndroidUtilities.cancelRunOnUIThread(lfVar);
                                                j9Var2.f5289f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) j9Var2.f5288e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            j9Var2.f5288e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) j9Var2.f5288e).playTogether(arrayList3);
                                            ((AnimatorSet) j9Var2.f5288e).addListener(new qe0(j9Var2, 1));
                                            ((AnimatorSet) j9Var2.f5288e).start();
                                            ue0.a((ue0) j9Var2.h);
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
                                if (((StringBuilder) j9Var2.d).length() == 4) {
                                    ue0Var.m(z10);
                                }
                                int i19 = i112;
                                if (i19 != 11) {
                                    Drawable drawable = ue0Var.f31403a;
                                    if (drawable instanceof dd0) {
                                        dd0 dd0Var = (dd0) drawable;
                                        dd0Var.D = null;
                                        dd0Var.z();
                                        float f72 = dd0Var.h;
                                        if (i19 == 10) {
                                            if (z11) {
                                                dd0Var.y();
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                            dd0Var.x(true);
                                            z13 = true;
                                        }
                                        if (z13) {
                                            if (f72 >= 1.0f) {
                                                ue0Var.b(dd0Var);
                                                return;
                                            }
                                            ci.x0 x0Var = new ci.x0(ue0Var, z12, dd0Var, 21);
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
                                            Collections.sort(arrayList5, new org.telegram.ui.ff(11));
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
            this.f31411f.add(se0Var);
            i11++;
        }
        for (i10 = 11; i10 >= 0; i10--) {
            this.f31410e.addView((FrameLayout) this.f31411f.get(i10), w7.x5.e(60, 60, 51));
        }
        d();
    }

    public static void a(ue0 ue0Var) {
        boolean z10;
        float f7;
        float f10;
        FrameLayout frameLayout = ue0Var.f31405b;
        ci.j9 j9Var = ue0Var.f31414s;
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
            org.telegram.messenger.ai.t(scaleX.scaleY(f11), is.h, 320L);
        }
    }

    public final void b(dd0 dd0Var) {
        o1.k kVar = this.P;
        if (kVar != null && kVar.f16981f) {
            kVar.c();
        }
        o1.j jVar = new o1.j(0.0f);
        dd0Var.D = new cw(jVar, 9);
        dd0Var.z();
        o1.k kVar2 = new o1.k(jVar);
        kVar2.f16988u = org.telegram.ui.Cells.c1.j(100.0f, 300.0f, 1.0f);
        this.P = kVar2;
        kVar2.a(new ei.l4(4, this, dd0Var));
        this.P.b(new m7(dd0Var, 5));
        this.P.h();
    }

    public final void c() {
        Activity findActivity;
        we0 we0Var;
        if (!this.L && (findActivity = AndroidUtilities.findActivity(getContext())) != null && this.f31412n.getVisibility() == 0 && !ApplicationLoader.mainInterfacePaused) {
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                ArrayList arrayList = launchActivity.B0;
                if (arrayList.isEmpty() && (we0Var = launchActivity.A0) != null) {
                    if (this != we0Var.f32630b) {
                        return;
                    }
                } else if (hg.c.g(1, arrayList) != this) {
                    return;
                }
            }
            try {
                if (new aa.a(new k6.h(getContext(), 1)).f(15) == 0 && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    pb.c cVar = new pb.c(LaunchActivity.G1, f0.c.d(getContext()), new me0(this));
                    j6.l lVar = new j6.l(2);
                    lVar.f14061b = LocaleController.getString(R.string.UnlockToUse);
                    lVar.d = LocaleController.getString(R.string.UsePIN);
                    lVar.f14060a = 15;
                    cVar.z(lVar.b(), null);
                    n(false);
                }
            } catch (Exception e7) {
                FileLog.e(e7);
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
        se0 se0Var = this.f31412n;
        se0Var.setVisibility(i10);
        if (SharedConfig.passcodeType == 1) {
            this.E.setVisibility(se0Var.getVisibility());
        }
        if (SharedConfig.passcodeType == 1) {
            i11 = R.string.EnterPassword;
        } else if (f7) {
            i11 = R.string.EnterPINorFingerprint;
        } else {
            i11 = R.string.EnterPIN;
        }
        this.f31407c.setText(LocaleController.getString(i11));
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
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        EditTextBoldCursor editTextBoldCursor = this.f31413r;
        FrameLayout frameLayout = this.h;
        org.telegram.ui.Cells.t6 t6Var = this.V;
        TextView textView = this.f31416x;
        if (i10 > 0) {
            int max = Math.max(1, (int) Math.ceil(j10 / 1000.0d));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ue0.f():boolean");
    }

    public final boolean h() {
        ci.h4 h4Var = this.f31404a0;
        if (h4Var != null && h4Var.c()) {
            AndroidUtilities.hideKeyboard(this.f31413r);
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
            if (this.f31416x.getVisibility() != 0) {
                if (SharedConfig.passcodeType == 1) {
                    EditTextBoldCursor editTextBoldCursor = this.f31413r;
                    if (editTextBoldCursor != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                    }
                    AndroidUtilities.runOnUIThread(new je0(this, 0), 200L);
                }
                c();
            }
        }
    }

    public final void l(boolean z10, int i10, int i11, org.telegram.ui.n70 n70Var) {
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
        TextView textView = this.f31416x;
        EditTextBoldCursor editTextBoldCursor = this.f31413r;
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
        this.f31403a = null;
        boolean z12 = org.telegram.ui.ActionBar.h6.s0() instanceof dd0;
        ci.m6 m6Var = this.v;
        if (z12) {
            z11 = !org.telegram.ui.ActionBar.h6.I.q();
            this.f31403a = org.telegram.ui.ActionBar.h6.s0();
            m6Var.setBackgroundColor(-1090519040);
        } else {
            if (org.telegram.ui.ActionBar.h6.W && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.h6.I0()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.h6.I0())) {
                org.telegram.ui.ActionBar.z5 z5Var = org.telegram.ui.ActionBar.h6.I.f20668i0;
                if (z5Var != null && (i12 = z5Var.d) != 0 && (i13 = z5Var.f21724e) != 0) {
                    x9Var = new x9(x9.d(z5Var.h), new int[]{i12, i13});
                }
                this.f31403a = x9Var;
                if (x9Var == null) {
                    this.f31403a = org.telegram.ui.ActionBar.h6.s0();
                }
                if (this.f31403a instanceof x9) {
                    m6Var.setBackgroundColor(570425344);
                } else {
                    m6Var.setBackgroundColor(-1090519040);
                }
            } else {
                if (!"d".equals(org.telegram.ui.ActionBar.h6.I0())) {
                    String I0 = org.telegram.ui.ActionBar.h6.I0();
                    if (!org.telegram.ui.ActionBar.h6.f20890j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(I0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(I0)) {
                        Drawable s02 = org.telegram.ui.ActionBar.h6.s0();
                        this.f31403a = s02;
                        if (s02 instanceof x9) {
                            m6Var.setBackgroundColor(570425344);
                        } else if (s02 != null) {
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
        Drawable drawable = this.f31403a;
        if (drawable instanceof dd0) {
            dd0 dd0Var = (dd0) drawable;
            int[] iArr = dd0Var.f25544a;
            if (z11) {
                int[] iArr2 = new int[iArr.length];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    iArr2[i15] = org.telegram.ui.ActionBar.h6.b(0.14f, 0.0f, iArr[i15]);
                }
                iArr = iArr2;
            }
            this.f31403a = new dd0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (dd0Var.f25566u != null && dd0Var.f25562q < 0) {
                m6Var.setBackgroundColor(2130706432);
            } else {
                m6Var.setBackgroundColor(570425344);
            }
            ((dd0) this.f31403a).r(m6Var);
        }
        this.f31415w.setText(LocaleController.getString(R.string.AppLocked));
        int i16 = SharedConfig.passcodeType;
        ImageView imageView = this.E;
        ImageView imageView2 = this.f31417y;
        ai.x5 x5Var = this.f31410e;
        ci.j9 j9Var = this.f31414s;
        if (i16 == 0) {
            if (textView.getVisibility() != 0) {
                x5Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            j9Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i16 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            x5Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            j9Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.f31412n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        ci.j9.a(j9Var, false);
        if (z10) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new pe0(this, i10, i11, n70Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.T = 1.0f;
            g(1.0f);
            hk0 hk0Var = this.I;
            hk0Var.setScaleX(1.0f);
            hk0Var.setScaleY(1.0f);
            hk0Var.i();
            hk0Var.getAnimatedDrawable().N(38, false, false);
            if (n70Var != null) {
                n70Var.run();
            }
        }
        setOnTouchListener(new bi.d(19));
    }

    public final void m(boolean z10) {
        String str;
        if (!this.L && getVisibility() == 0) {
            EditTextBoldCursor editTextBoldCursor = this.f31413r;
            if (!z10) {
                if (SharedConfig.passcodeRetryInMs <= 0) {
                    int i10 = SharedConfig.passcodeType;
                    ci.j9 j9Var = this.f31414s;
                    if (i10 == 0) {
                        str = ((StringBuilder) j9Var.d).toString();
                    } else if (i10 != 1) {
                        str = "";
                    } else {
                        str = editTextBoldCursor.getText().toString();
                    }
                    int length = str.length();
                    FrameLayout frameLayout = this.f31405b;
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
                        ci.j9.a(j9Var, true);
                        BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                        int i12 = -this.U;
                        this.U = i12;
                        AndroidUtilities.shakeViewSpring(frameLayout, i12);
                        Drawable drawable = this.f31403a;
                        if (drawable instanceof dd0) {
                            dd0 dd0Var = (dd0) drawable;
                            o1.k kVar = this.P;
                            if (kVar != null) {
                                kVar.c();
                                dd0Var.h = 1.0f;
                                dd0Var.z();
                            }
                            if (dd0Var.h >= 1.0f) {
                                dd0Var.m(true);
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
            te0 te0Var = this.K;
            if (te0Var != null) {
                te0Var.i(this);
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
            hk0 hk0Var = this.I;
            hk0Var.getAnimatedDrawable().P(71);
            hk0Var.getAnimatedDrawable().N(37, false, false);
            hk0Var.d();
            AndroidUtilities.runOnUIThread(new je0(this, 1));
        }
    }

    public final void n(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f31408c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f31406b0 = z10;
        float alpha = this.f31410e.getAlpha();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
        this.f31408c0 = ofFloat;
        ofFloat.addUpdateListener(new ke0(this, 1));
        this.f31408c0.addListener(new ea(16, this, z10));
        this.f31408c0.setInterpolator(is.h);
        this.f31408c0.setDuration(320L);
        this.f31408c0.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.passcodeDismissed);
        if (this.f31404a0 == null && (getParent() instanceof View)) {
            this.f31404a0 = new ci.h4((View) getParent(), false, new a3(this, 9));
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
        TextView textView = this.f31415w;
        int[] iArr = this.f31409d0;
        textView.getLocationInWindow(iArr);
        boolean isTablet = AndroidUtilities.isTablet();
        hk0 hk0Var = this.I;
        if (!isTablet && getContext().getResources().getConfiguration().orientation == 2) {
            int dp = iArr[1] - AndroidUtilities.dp(100.0f);
            this.H = dp;
            hk0Var.setTranslationY(dp);
            return;
        }
        int dp2 = iArr[1] - AndroidUtilities.dp(100.0f);
        this.H = dp2;
        hk0Var.setTranslationY(dp2);
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
        hk0 hk0Var = this.I;
        ai.x5 x5Var = this.f31410e;
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
            hk0Var.setTranslationX((f11 / f10) - AndroidUtilities.dp(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            if (SharedConfig.passcodeType == 0) {
                i15 = size / 2;
            } else {
                i15 = size;
            }
            layoutParams.width = i15;
            layoutParams.height = AndroidUtilities.dp(180.0f);
            int A = org.telegram.messenger.ai.A(140.0f, i18, 2);
            if (SharedConfig.passcodeType == 0) {
                i16 = AndroidUtilities.dp(40.0f);
            } else {
                i16 = 0;
            }
            layoutParams.topMargin = A + i16;
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i18;
            int i19 = size / 2;
            layoutParams2.leftMargin = i19;
            layoutParams2.topMargin = AndroidUtilities.statusBarHeight;
            layoutParams2.width = i19;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams3.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            layoutParams3.gravity = 17;
            x5Var.setLayoutParams(layoutParams3);
            i14 = 0;
        } else {
            hk0Var.setTranslationX((size / 2.0f) - AndroidUtilities.dp(29.0f));
            int i20 = AndroidUtilities.statusBarHeight;
            if (AndroidUtilities.isTablet()) {
                if (size > AndroidUtilities.dp(498.0f)) {
                    i12 = org.telegram.messenger.ai.A(498.0f, size, 2);
                    size = AndroidUtilities.dp(498.0f);
                } else {
                    i12 = 0;
                }
                if (i18 > AndroidUtilities.dp(528.0f)) {
                    i20 = org.telegram.messenger.ai.A(528.0f, i18, 2);
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
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
            i14 = 0;
            layoutParams5.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams5.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            if (AndroidUtilities.isTablet()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            x5Var.setLayoutParams(layoutParams5);
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
            FrameLayout frameLayout3 = (FrameLayout) this.f31411f.get(i24);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((dp3 + dp2) * (i25 / 3)) + dp4;
            layoutParams7.leftMargin = (dp3 + dp) * (i25 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
        }
        super.onMeasure(i10, i11);
    }

    public void setDelegate(te0 te0Var) {
        this.K = te0Var;
    }

    public void g(float f7) {
    }

    public void i() {
    }
}
