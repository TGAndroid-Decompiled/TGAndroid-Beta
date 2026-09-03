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
public class xd0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] U = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView B;
    public final View C;
    public int D;
    public int E;
    public final kj0 F;
    public final Rect G;
    public wd0 H;
    public o1.j I;
    public final LinkedList J;
    public final LinkedList K;
    public final ArrayList L;
    public float M;
    public int N;
    public final m2.b O;
    public int P;
    public qh.h3 Q;
    public boolean R;
    public ValueAnimator S;
    public final int[] T;
    public Drawable f33036a;
    public final FrameLayout f33037b;
    public final TextView f33038c;
    public final FrameLayout d;
    public final eh.d f33039e;
    public final ArrayList f33040f;
    public final FrameLayout h;
    public final vd0 f33041n;
    public final EditTextBoldCursor f33042r;
    public final td0 f33043s;
    public final ag.l v;
    public final TextView f33044w;
    public final TextView f33045x;
    public final ImageView f33046y;

    public xd0(Context context) {
        super(context);
        int i10;
        int[] iArr = U;
        this.D = 0;
        this.G = new Rect();
        this.J = new LinkedList();
        this.K = new LinkedList();
        this.L = new ArrayList();
        this.N = -12;
        this.O = new m2.b(this, 26);
        this.R = true;
        this.T = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        ag.l lVar = new ag.l(this, context);
        this.v = lVar;
        lVar.setWillNotDraw(false);
        addView(lVar, k7.c6.c(-1.0f, -1));
        ?? imageView = new ImageView(context);
        this.F = imageView;
        imageView.f(R.raw.passcode_lock, 58, 58, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, k7.c6.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        lVar.addView(frameLayout, k7.c6.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f33044w = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setAlpha(0.0f);
        TextView h = org.telegram.ui.yh.h(frameLayout, textView, k7.c6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.f33045x = h;
        h.setTextColor(-1);
        h.setTextSize(1, 15.0f);
        h.setGravity(1);
        h.setVisibility(4);
        lVar.addView(h, k7.c6.e(-2, -2, 17));
        td0 td0Var = new td0(this, context);
        this.f33043s = td0Var;
        frameLayout.addView(td0Var, k7.c6.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f33042r = editTextBoldCursor;
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
        frameLayout.addView(editTextBoldCursor, k7.c6.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new d1(this, 3));
        editTextBoldCursor.addTextChangedListener(new eh.c(this, 10));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(1));
        ImageView imageView2 = new ImageView(context);
        this.f33046y = imageView2;
        imageView2.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView2, k7.c6.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView2.setContentDescription(LocaleController.getString(R.string.Done));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final xd0 f29033b;

            {
                this.f29033b = this;
            }

            @Override
            public final void onClick(View view) {
                LinkedList linkedList;
                LinkedList linkedList2;
                int i11;
                boolean z4;
                LinkedList linkedList3;
                int i12;
                int i13;
                int i14;
                boolean z10;
                boolean z11;
                int i15 = r2;
                xd0 xd0Var = this.f29033b;
                switch (i15) {
                    case 0:
                        xd0Var.k(false);
                        return;
                    case 1:
                        xd0Var.c();
                        return;
                    default:
                        LinkedList linkedList4 = xd0Var.K;
                        LinkedList linkedList5 = xd0Var.J;
                        td0 td0Var2 = xd0Var.f33043s;
                        if (xd0Var.R) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("0");
                                    z4 = false;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("1");
                                    z4 = false;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("2");
                                    z4 = false;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("3");
                                    z4 = false;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("4");
                                    z4 = false;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("5");
                                    z4 = false;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("6");
                                    z4 = false;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("7");
                                    z4 = false;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("8");
                                    z4 = false;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("9");
                                    z4 = false;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    xd0Var.c();
                                    z4 = false;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) td0Var2.f31343c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) td0Var2.f31342b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb = (StringBuilder) td0Var2.d;
                                    if (sb.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i11 = intValue;
                                        z4 = false;
                                        break;
                                    } else {
                                        try {
                                            td0Var2.performHapticFeedback(3);
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb.length() - 1;
                                        if (length != 0) {
                                            sb.deleteCharAt(length);
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
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, td0Var2.c(i16)));
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
                                                fArr5[0] = td0Var2.c(i16);
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
                                            sb.deleteCharAt(length);
                                        }
                                        for (int i17 = 0; i17 < length; i17++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), property5, td0Var2.c(i17)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i17), property5, td0Var2.c(i17)));
                                        }
                                        ye yeVar = (ye) td0Var2.f31345f;
                                        if (yeVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(yeVar);
                                            td0Var2.f31345f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) td0Var2.f31344e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        td0Var2.f31344e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) td0Var2.f31344e).playTogether(arrayList3);
                                        ((AnimatorSet) td0Var2.f31344e).addListener(new sd0(td0Var2, 1));
                                        ((AnimatorSet) td0Var2.f31344e).start();
                                        xd0.a((xd0) td0Var2.h);
                                        z4 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z4 = false;
                                    break;
                            }
                            if (((StringBuilder) td0Var2.d).length() == 4) {
                                xd0Var.k(false);
                            }
                            int i18 = i11;
                            if (i18 != 11) {
                                Drawable drawable = xd0Var.f33036a;
                                if (drawable instanceof fc0) {
                                    fc0 fc0Var = (fc0) drawable;
                                    fc0Var.D = null;
                                    fc0Var.z();
                                    float f10 = fc0Var.h;
                                    if (i18 == 10) {
                                        if (z4) {
                                            fc0Var.y();
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                        fc0Var.x(true);
                                        z11 = true;
                                    }
                                    if (z11) {
                                        if (f10 >= 1.0f) {
                                            xd0Var.b(fc0Var);
                                            return;
                                        }
                                        mh.r5 r5Var = new mh.r5(xd0Var, z10, fc0Var, 16);
                                        LinkedList linkedList6 = linkedList2;
                                        linkedList6.offer(r5Var);
                                        LinkedList linkedList7 = linkedList;
                                        linkedList7.offer(Boolean.valueOf(z10));
                                        ArrayList arrayList4 = new ArrayList();
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i19 = 0; i19 < linkedList6.size(); i19++) {
                                            Runnable runnable = (Runnable) linkedList6.get(i19);
                                            Boolean bool = (Boolean) linkedList7.get(i19);
                                            if (bool != null && bool.booleanValue() != z10) {
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
                                        Collections.sort(arrayList5, new oh.k0(22));
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
        this.B = imageView3;
        imageView3.setImageResource(R.drawable.fingerprint);
        imageView3.setScaleType(scaleType);
        imageView3.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView3, k7.c6.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final xd0 f29033b;

            {
                this.f29033b = this;
            }

            @Override
            public final void onClick(View view) {
                LinkedList linkedList;
                LinkedList linkedList2;
                int i11;
                boolean z4;
                LinkedList linkedList3;
                int i12;
                int i13;
                int i14;
                boolean z10;
                boolean z11;
                int i15 = r2;
                xd0 xd0Var = this.f29033b;
                switch (i15) {
                    case 0:
                        xd0Var.k(false);
                        return;
                    case 1:
                        xd0Var.c();
                        return;
                    default:
                        LinkedList linkedList4 = xd0Var.K;
                        LinkedList linkedList5 = xd0Var.J;
                        td0 td0Var2 = xd0Var.f33043s;
                        if (xd0Var.R) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("0");
                                    z4 = false;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("1");
                                    z4 = false;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("2");
                                    z4 = false;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("3");
                                    z4 = false;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("4");
                                    z4 = false;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("5");
                                    z4 = false;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("6");
                                    z4 = false;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("7");
                                    z4 = false;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("8");
                                    z4 = false;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    td0Var2.b("9");
                                    z4 = false;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    xd0Var.c();
                                    z4 = false;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) td0Var2.f31343c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) td0Var2.f31342b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb = (StringBuilder) td0Var2.d;
                                    if (sb.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i11 = intValue;
                                        z4 = false;
                                        break;
                                    } else {
                                        try {
                                            td0Var2.performHapticFeedback(3);
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb.length() - 1;
                                        if (length != 0) {
                                            sb.deleteCharAt(length);
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
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, td0Var2.c(i16)));
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
                                                fArr5[0] = td0Var2.c(i16);
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
                                            sb.deleteCharAt(length);
                                        }
                                        for (int i17 = 0; i17 < length; i17++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), property5, td0Var2.c(i17)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i17), property5, td0Var2.c(i17)));
                                        }
                                        ye yeVar = (ye) td0Var2.f31345f;
                                        if (yeVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(yeVar);
                                            td0Var2.f31345f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) td0Var2.f31344e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        td0Var2.f31344e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) td0Var2.f31344e).playTogether(arrayList3);
                                        ((AnimatorSet) td0Var2.f31344e).addListener(new sd0(td0Var2, 1));
                                        ((AnimatorSet) td0Var2.f31344e).start();
                                        xd0.a((xd0) td0Var2.h);
                                        z4 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i11 = intValue;
                                    z4 = false;
                                    break;
                            }
                            if (((StringBuilder) td0Var2.d).length() == 4) {
                                xd0Var.k(false);
                            }
                            int i18 = i11;
                            if (i18 != 11) {
                                Drawable drawable = xd0Var.f33036a;
                                if (drawable instanceof fc0) {
                                    fc0 fc0Var = (fc0) drawable;
                                    fc0Var.D = null;
                                    fc0Var.z();
                                    float f10 = fc0Var.h;
                                    if (i18 == 10) {
                                        if (z4) {
                                            fc0Var.y();
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                        fc0Var.x(true);
                                        z11 = true;
                                    }
                                    if (z11) {
                                        if (f10 >= 1.0f) {
                                            xd0Var.b(fc0Var);
                                            return;
                                        }
                                        mh.r5 r5Var = new mh.r5(xd0Var, z10, fc0Var, 16);
                                        LinkedList linkedList6 = linkedList2;
                                        linkedList6.offer(r5Var);
                                        LinkedList linkedList7 = linkedList;
                                        linkedList7.offer(Boolean.valueOf(z10));
                                        ArrayList arrayList4 = new ArrayList();
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i19 = 0; i19 < linkedList6.size(); i19++) {
                                            Runnable runnable = (Runnable) linkedList6.get(i19);
                                            Boolean bool = (Boolean) linkedList7.get(i19);
                                            if (bool != null && bool.booleanValue() != z10) {
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
                                        Collections.sort(arrayList5, new oh.k0(22));
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
        this.C = view;
        view.setBackgroundColor(822083583);
        frameLayout.addView(view, k7.c6.a(-1.0f, 1.0f / AndroidUtilities.density, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        lVar.addView(frameLayout2, k7.c6.e(-1, -1, 51));
        eh.d dVar = new eh.d(context, 17);
        this.f33039e = dVar;
        frameLayout2.addView(dVar, k7.c6.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f33037b = frameLayout3;
        dVar.addView(frameLayout3, k7.c6.e(-2, -2, 49));
        TextView g10 = org.telegram.messenger.y3.g(context, 1, 15.0f);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextColor(-1);
        g10.setText(LocaleController.getString(R.string.UnlockToUse));
        TextView h9 = org.telegram.ui.yh.h(frameLayout3, g10, k7.c6.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.f33038c = h9;
        h9.setTextSize(1, 14.0f);
        h9.setTextColor(-1);
        h9.setText(LocaleController.getString(R.string.EnterPINorFingerprint));
        frameLayout3.addView(h9, k7.c6.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f33040f = new ArrayList(10);
        int i11 = 0;
        while (true) {
            if (i11 >= 12) {
                break;
            }
            vd0 vd0Var = new vd0(context);
            k7.e6.b(vd0Var, 0.15f, 1.5f);
            vd0Var.setTag(Integer.valueOf(i11));
            if (i11 == 11) {
                int dp = AndroidUtilities.dp(30.0f);
                vd0Var.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 0, 654311423, 654311423));
                vd0Var.setImage(R.drawable.filled_clear);
                vd0Var.setOnLongClickListener(new n10(this, 1));
                vd0Var.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
                l(vd0Var, R.id.passcode_btn_0);
            } else if (i11 == 10) {
                this.f33041n = vd0Var;
                int dp2 = AndroidUtilities.dp(30.0f);
                vd0Var.setBackground(org.telegram.ui.ActionBar.k6.i0(dp2, dp2, dp2, dp2, 0, 654311423, 654311423));
                vd0Var.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
                vd0Var.setImage(R.drawable.fingerprint);
                l(vd0Var, R.id.passcode_btn_1);
            } else {
                int dp3 = AndroidUtilities.dp(30.0f);
                vd0Var.setBackground(org.telegram.ui.ActionBar.k6.i0(dp3, dp3, dp3, dp3, 654311423, 1291845631, 1291845631));
                vd0Var.setContentDescription(i11 + "");
                vd0Var.setNum(i11);
                if (i11 == 0) {
                    l(vd0Var, R.id.passcode_btn_backspace);
                } else if (i11 == 9) {
                    Activity findActivity = AndroidUtilities.findActivity(getContext());
                    if (Build.VERSION.SDK_INT >= 23 && findActivity != null && SharedConfig.useFingerprintLock) {
                        try {
                            Context context2 = ApplicationLoader.applicationContext;
                            kf.a aVar = kf.b.f11183a;
                            if (aVar.p(context2) && aVar.b(context2) && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                                l(vd0Var, R.id.passcode_btn_fingerprint);
                            }
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    l(vd0Var, R.id.passcode_btn_0);
                } else {
                    l(vd0Var, iArr[i11 + 1]);
                }
            }
            vd0Var.setId(iArr[i11]);
            vd0Var.setOnClickListener(new View.OnClickListener(this) {
                public final xd0 f29033b;

                {
                    this.f29033b = this;
                }

                @Override
                public final void onClick(View view2) {
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    int i112;
                    boolean z4;
                    LinkedList linkedList3;
                    int i12;
                    int i13;
                    int i14;
                    boolean z10;
                    boolean z11;
                    int i15 = r2;
                    xd0 xd0Var = this.f29033b;
                    switch (i15) {
                        case 0:
                            xd0Var.k(false);
                            return;
                        case 1:
                            xd0Var.c();
                            return;
                        default:
                            LinkedList linkedList4 = xd0Var.K;
                            LinkedList linkedList5 = xd0Var.J;
                            td0 td0Var2 = xd0Var.f33043s;
                            if (xd0Var.R) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        td0Var2.b("0");
                                        z4 = false;
                                        break;
                                    case 1:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        td0Var2.b("1");
                                        z4 = false;
                                        break;
                                    case 2:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        td0Var2.b("2");
                                        z4 = false;
                                        break;
                                    case 3:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        td0Var2.b("3");
                                        z4 = false;
                                        break;
                                    case 4:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        td0Var2.b("4");
                                        z4 = false;
                                        break;
                                    case 5:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        td0Var2.b("5");
                                        z4 = false;
                                        break;
                                    case 6:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        td0Var2.b("6");
                                        z4 = false;
                                        break;
                                    case 7:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        td0Var2.b("7");
                                        z4 = false;
                                        break;
                                    case 8:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        td0Var2.b("8");
                                        z4 = false;
                                        break;
                                    case 9:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        td0Var2.b("9");
                                        z4 = false;
                                        break;
                                    case 10:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        xd0Var.c();
                                        z4 = false;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) td0Var2.f31343c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        ArrayList arrayList2 = (ArrayList) td0Var2.f31342b;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb = (StringBuilder) td0Var2.d;
                                        if (sb.length() == 0) {
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            i112 = intValue;
                                            z4 = false;
                                            break;
                                        } else {
                                            try {
                                                td0Var2.performHapticFeedback(3);
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int length = sb.length() - 1;
                                            if (length != 0) {
                                                sb.deleteCharAt(length);
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
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, td0Var2.c(i16)));
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
                                                    fArr5[0] = td0Var2.c(i16);
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
                                                sb.deleteCharAt(length);
                                            }
                                            for (int i17 = 0; i17 < length; i17++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), property5, td0Var2.c(i17)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i17), property5, td0Var2.c(i17)));
                                            }
                                            ye yeVar = (ye) td0Var2.f31345f;
                                            if (yeVar != null) {
                                                AndroidUtilities.cancelRunOnUIThread(yeVar);
                                                td0Var2.f31345f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) td0Var2.f31344e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            td0Var2.f31344e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) td0Var2.f31344e).playTogether(arrayList3);
                                            ((AnimatorSet) td0Var2.f31344e).addListener(new sd0(td0Var2, 1));
                                            ((AnimatorSet) td0Var2.f31344e).start();
                                            xd0.a((xd0) td0Var2.h);
                                            z4 = true;
                                            break;
                                        }
                                    default:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i112 = intValue;
                                        z4 = false;
                                        break;
                                }
                                if (((StringBuilder) td0Var2.d).length() == 4) {
                                    xd0Var.k(false);
                                }
                                int i18 = i112;
                                if (i18 != 11) {
                                    Drawable drawable = xd0Var.f33036a;
                                    if (drawable instanceof fc0) {
                                        fc0 fc0Var = (fc0) drawable;
                                        fc0Var.D = null;
                                        fc0Var.z();
                                        float f10 = fc0Var.h;
                                        if (i18 == 10) {
                                            if (z4) {
                                                fc0Var.y();
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                            fc0Var.x(true);
                                            z11 = true;
                                        }
                                        if (z11) {
                                            if (f10 >= 1.0f) {
                                                xd0Var.b(fc0Var);
                                                return;
                                            }
                                            mh.r5 r5Var = new mh.r5(xd0Var, z10, fc0Var, 16);
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(r5Var);
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z10));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i19 = 0; i19 < linkedList6.size(); i19++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i19);
                                                Boolean bool = (Boolean) linkedList7.get(i19);
                                                if (bool != null && bool.booleanValue() != z10) {
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
                                            Collections.sort(arrayList5, new oh.k0(22));
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
            this.f33040f.add(vd0Var);
            i11++;
        }
        for (i10 = 11; i10 >= 0; i10--) {
            this.f33039e.addView((FrameLayout) this.f33040f.get(i10), k7.c6.e(60, 60, 51));
        }
        d();
    }

    public static void a(xd0 xd0Var) {
        boolean z4;
        float f10;
        float f11;
        FrameLayout frameLayout = xd0Var.f33037b;
        td0 td0Var = xd0Var.f33043s;
        if (td0Var != null && ((StringBuilder) td0Var.d).length() <= 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            ViewPropertyAnimator animate = frameLayout.animate();
            float f12 = 1.0f;
            if (z4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z4) {
                f11 = 0.8f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z4) {
                f12 = 0.8f;
            }
            org.telegram.ui.b.p(scaleX.scaleY(f12), pr.h, 320L);
        }
    }

    public static void l(vd0 vd0Var, int i10) {
        vd0Var.setNextFocusForwardId(i10);
        if (Build.VERSION.SDK_INT >= 22) {
            vd0Var.setAccessibilityTraversalBefore(i10);
        }
    }

    public final void b(fc0 fc0Var) {
        o1.j jVar = this.I;
        if (jVar != null && jVar.f16332f) {
            jVar.c();
        }
        kb.a aVar = new kb.a(0.0f);
        fc0Var.D = new hv(aVar, 8);
        fc0Var.z();
        o1.j jVar2 = new o1.j(aVar);
        jVar2.f16338u = org.telegram.ui.yh.n(100.0f, 300.0f, 1.0f);
        this.I = jVar2;
        jVar2.a(new lb(3, this, fc0Var));
        this.I.b(new f7(fc0Var, 4));
        this.I.f();
    }

    public final void c() {
        Activity findActivity;
        zd0 zd0Var;
        if (Build.VERSION.SDK_INT >= 23 && (findActivity = AndroidUtilities.findActivity(getContext())) != null && this.f33041n.getVisibility() == 0 && !ApplicationLoader.mainInterfacePaused) {
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                ArrayList arrayList = launchActivity.f34182y0;
                if (arrayList.isEmpty() && (zd0Var = launchActivity.f34180x0) != null) {
                    if (this != zd0Var.f33928b) {
                        return;
                    }
                } else if (l.d.i(1, arrayList) != this) {
                    return;
                }
            }
            try {
                if (new androidx.biometric.e(new androidx.biometric.u(getContext(), 0)).h(15) == 0 && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    y5.h hVar = new y5.h(LaunchActivity.D1, f0.e.e(getContext()), new nd0(this));
                    h5.u uVar = new h5.u(1);
                    uVar.f7300b = LocaleController.getString(R.string.UnlockToUse);
                    uVar.d = LocaleController.getString(R.string.UsePIN);
                    uVar.f7299a = 15;
                    hVar.g(uVar.c(), null);
                    m(false);
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xd0.d():void");
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
        EditTextBoldCursor editTextBoldCursor = this.f33042r;
        FrameLayout frameLayout = this.h;
        m2.b bVar = this.O;
        TextView textView = this.f33045x;
        if (j11 > 0) {
            int max = Math.max(1, (int) Math.ceil(j11 / 1000.0d));
            if (max != this.P) {
                textView.setText(LocaleController.formatString(R.string.TooManyTries, LocaleController.formatPluralString("Seconds", max, new Object[0])));
                this.P = max;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                frameLayout.setVisibility(4);
                m(false);
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
            }
            AndroidUtilities.cancelRunOnUIThread(bVar);
            AndroidUtilities.runOnUIThread(bVar, 100L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(bVar);
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
        qh.h3 h3Var = this.Q;
        if (h3Var != null && h3Var.c()) {
            AndroidUtilities.hideKeyboard(this.f33042r);
            return false;
        }
        return true;
    }

    public final void i() {
        e();
        if (this.f33045x.getVisibility() != 0) {
            if (SharedConfig.passcodeType == 1) {
                EditTextBoldCursor editTextBoldCursor = this.f33042r;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                }
                AndroidUtilities.runOnUIThread(new kd0(this, 0), 200L);
            }
            c();
        }
    }

    public final void j(boolean z4, int i10, int i11, org.telegram.ui.z10 z10Var) {
        View currentFocus;
        boolean z10;
        int i12;
        int i13;
        d();
        e();
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        int i14 = SharedConfig.passcodeType;
        TextView textView = this.f33045x;
        EditTextBoldCursor editTextBoldCursor = this.f33042r;
        if (i14 == 1) {
            if (!z4 && textView.getVisibility() != 0 && editTextBoldCursor != null) {
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
        o9 o9Var = null;
        this.f33036a = null;
        boolean z11 = org.telegram.ui.ActionBar.k6.r0() instanceof fc0;
        ag.l lVar = this.v;
        if (z11) {
            z10 = !org.telegram.ui.ActionBar.k6.I.q();
            this.f33036a = org.telegram.ui.ActionBar.k6.r0();
            lVar.setBackgroundColor(-1090519040);
        } else {
            if (org.telegram.ui.ActionBar.k6.W && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.k6.H0()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.k6.H0())) {
                org.telegram.ui.ActionBar.d6 d6Var = org.telegram.ui.ActionBar.k6.I.f21515f0;
                if (d6Var != null && (i12 = d6Var.d) != 0 && (i13 = d6Var.f21287e) != 0) {
                    o9Var = new o9(o9.d(d6Var.h), new int[]{i12, i13});
                }
                this.f33036a = o9Var;
                if (o9Var == null) {
                    this.f33036a = org.telegram.ui.ActionBar.k6.r0();
                }
                if (this.f33036a instanceof o9) {
                    lVar.setBackgroundColor(570425344);
                } else {
                    lVar.setBackgroundColor(-1090519040);
                }
            } else {
                if (!"d".equals(org.telegram.ui.ActionBar.k6.H0())) {
                    String H0 = org.telegram.ui.ActionBar.k6.H0();
                    if (!org.telegram.ui.ActionBar.k6.f21763j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(H0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(H0)) {
                        Drawable r02 = org.telegram.ui.ActionBar.k6.r0();
                        this.f33036a = r02;
                        if (r02 instanceof o9) {
                            lVar.setBackgroundColor(570425344);
                        } else if (r02 != null) {
                            lVar.setBackgroundColor(-1090519040);
                        } else {
                            lVar.setBackgroundColor(-11436898);
                        }
                    }
                }
                lVar.setBackgroundColor(-11436898);
            }
            z10 = false;
        }
        Drawable drawable = this.f33036a;
        if (drawable instanceof fc0) {
            fc0 fc0Var = (fc0) drawable;
            int[] iArr = fc0Var.f26866a;
            if (z10) {
                int[] iArr2 = new int[iArr.length];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    iArr2[i15] = org.telegram.ui.ActionBar.k6.b(0.14f, 0.0f, iArr[i15]);
                }
                iArr = iArr2;
            }
            this.f33036a = new fc0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (fc0Var.f26888u != null && fc0Var.f26884q < 0) {
                lVar.setBackgroundColor(2130706432);
            } else {
                lVar.setBackgroundColor(570425344);
            }
            ((fc0) this.f33036a).r(lVar);
        }
        this.f33044w.setText(LocaleController.getString(R.string.AppLocked));
        int i16 = SharedConfig.passcodeType;
        ImageView imageView = this.B;
        ImageView imageView2 = this.f33046y;
        eh.d dVar = this.f33039e;
        td0 td0Var = this.f33043s;
        if (i16 == 0) {
            if (textView.getVisibility() != 0) {
                dVar.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            td0Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i16 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            dVar.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            td0Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.f33041n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        td0.a(td0Var, false);
        if (z4) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new rd0(this, i10, i11, z10Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.M = 1.0f;
            f(1.0f);
            kj0 kj0Var = this.F;
            kj0Var.setScaleX(1.0f);
            kj0Var.setScaleY(1.0f);
            kj0Var.i();
            kj0Var.getAnimatedDrawable().L(38, false, false);
            if (z10Var != null) {
                z10Var.run();
            }
        }
        setOnTouchListener(new org.telegram.ui.ActionBar.s2(18));
    }

    public final void k(boolean z4) {
        String str;
        EditTextBoldCursor editTextBoldCursor = this.f33042r;
        if (!z4) {
            if (SharedConfig.passcodeRetryInMs <= 0) {
                int i10 = SharedConfig.passcodeType;
                td0 td0Var = this.f33043s;
                if (i10 == 0) {
                    str = ((StringBuilder) td0Var.d).toString();
                } else if (i10 != 1) {
                    str = "";
                } else {
                    str = editTextBoldCursor.getText().toString();
                }
                int length = str.length();
                FrameLayout frameLayout = this.f33037b;
                if (length == 0) {
                    BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                    int i11 = -this.N;
                    this.N = i11;
                    AndroidUtilities.shakeViewSpring(frameLayout, i11);
                    return;
                } else if (!SharedConfig.checkPasscode(str)) {
                    SharedConfig.increaseBadPasscodeTries();
                    if (SharedConfig.passcodeRetryInMs > 0) {
                        e();
                    }
                    editTextBoldCursor.setText("");
                    td0.a(td0Var, true);
                    BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                    int i12 = -this.N;
                    this.N = i12;
                    AndroidUtilities.shakeViewSpring(frameLayout, i12);
                    Drawable drawable = this.f33036a;
                    if (drawable instanceof fc0) {
                        fc0 fc0Var = (fc0) drawable;
                        o1.j jVar = this.I;
                        if (jVar != null) {
                            jVar.c();
                            fc0Var.h = 1.0f;
                            fc0Var.z();
                        }
                        if (fc0Var.h >= 1.0f) {
                            fc0Var.m(true);
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
        wd0 wd0Var = this.H;
        if (wd0Var != null) {
            wd0Var.h(this);
        }
        kj0 kj0Var = this.F;
        kj0Var.getAnimatedDrawable().N(71);
        kj0Var.getAnimatedDrawable().L(37, false, false);
        kj0Var.d();
        AndroidUtilities.runOnUIThread(new kd0(this, 1));
    }

    public final void m(boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.R = z4;
        float alpha = this.f33039e.getAlpha();
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new ld0(this, 1));
        this.S.addListener(new x20(6, this, z4));
        this.S.setInterpolator(pr.h);
        this.S.setDuration(320L);
        this.S.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.passcodeDismissed);
        if (this.Q == null && (getParent() instanceof View)) {
            this.Q = new qh.h3((View) getParent(), false, new v2(this, 8));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.passcodeDismissed);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        View rootView = getRootView();
        int height = (rootView.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.getViewInset(rootView);
        Rect rect = this.G;
        getWindowVisibleDisplayFrame(rect);
        this.D = height - (rect.bottom - rect.top);
        if (SharedConfig.passcodeType == 1 && (AndroidUtilities.isTablet() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            if (frameLayout.getTag() != null) {
                i14 = ((Integer) frameLayout.getTag()).intValue();
            } else {
                i14 = 0;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((i14 + layoutParams.height) - (this.D / 2)) - AndroidUtilities.statusBarHeight;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z4, i10, i11, i12, i13);
        TextView textView = this.f33044w;
        int[] iArr = this.T;
        textView.getLocationInWindow(iArr);
        boolean isTablet = AndroidUtilities.isTablet();
        kj0 kj0Var = this.F;
        if (!isTablet && getContext().getResources().getConfiguration().orientation == 2) {
            int dp = iArr[1] - AndroidUtilities.dp(100.0f);
            this.E = dp;
            kj0Var.setTranslationY(dp);
            return;
        }
        int dp2 = iArr[1] - AndroidUtilities.dp(100.0f);
        this.E = dp2;
        kj0Var.setTranslationY(dp2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        int i12;
        int i13;
        float f10;
        float f11;
        float f12;
        int i14;
        int i15;
        int i16;
        int size = View.MeasureSpec.getSize(i10);
        int i17 = AndroidUtilities.displaySize.y;
        int dp = AndroidUtilities.dp(28.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int dp3 = AndroidUtilities.dp(60.0f);
        if (!AndroidUtilities.isTablet() && getContext().getResources().getConfiguration().orientation == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        View view = this.C;
        if (view != null) {
            if (SharedConfig.passcodeType == 1) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            view.setVisibility(i16);
        }
        kj0 kj0Var = this.F;
        eh.d dVar = this.f33039e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        if (z4) {
            if (SharedConfig.passcodeType == 0) {
                f11 = 2.0f;
                f12 = size / 2.0f;
            } else {
                f11 = 2.0f;
                f12 = size;
            }
            kj0Var.setTranslationX((f12 / f11) - AndroidUtilities.dp(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            if (SharedConfig.passcodeType == 0) {
                i14 = size / 2;
            } else {
                i14 = size;
            }
            layoutParams.width = i14;
            layoutParams.height = AndroidUtilities.dp(180.0f);
            int x10 = org.telegram.ui.b.x(140.0f, i17, 2);
            if (SharedConfig.passcodeType == 0) {
                i15 = AndroidUtilities.dp(40.0f);
            } else {
                i15 = 0;
            }
            layoutParams.topMargin = x10 + i15;
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i17;
            int i18 = size / 2;
            layoutParams2.leftMargin = i18;
            layoutParams2.topMargin = AndroidUtilities.statusBarHeight;
            layoutParams2.width = i18;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams3.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            layoutParams3.gravity = 17;
            dVar.setLayoutParams(layoutParams3);
        } else {
            kj0Var.setTranslationX((size / 2.0f) - AndroidUtilities.dp(29.0f));
            int i19 = AndroidUtilities.statusBarHeight;
            if (AndroidUtilities.isTablet()) {
                if (size > AndroidUtilities.dp(498.0f)) {
                    i12 = org.telegram.ui.b.x(498.0f, size, 2);
                    size = AndroidUtilities.dp(498.0f);
                } else {
                    i12 = 0;
                }
                if (i17 > AndroidUtilities.dp(528.0f)) {
                    i19 = org.telegram.ui.b.x(528.0f, i17, 2);
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
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams5.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams5.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            if (AndroidUtilities.isTablet()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            dVar.setLayoutParams(layoutParams5);
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
        if (z4) {
            f10 = 52.0f;
        } else {
            f10 = 82.0f;
        }
        int dp4 = AndroidUtilities.dp(f10);
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
            FrameLayout frameLayout3 = (FrameLayout) this.f33040f.get(i23);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((dp3 + dp2) * (i24 / 3)) + dp4;
            layoutParams7.leftMargin = (dp3 + dp) * (i24 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
        }
        super.onMeasure(i10, i11);
    }

    public void setDelegate(wd0 wd0Var) {
        this.H = wd0Var;
    }

    public void f(float f10) {
    }

    public void h() {
    }
}
