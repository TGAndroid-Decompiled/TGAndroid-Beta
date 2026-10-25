package org.telegram.ui.ActionBar;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannedString;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.GroupCreateCheckBox;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.y9;
public final class h7 {
    public final View f22688a;
    public final Paint[] f22689b;
    public final Drawable[] f22690c;
    public final Class[] d;
    public final int e;
    public final String f22691f;
    public g7 f22692g;
    public int h;
    public final boolean[] f22693i;
    public final int f22694j;
    public final String[] f22695k;
    public final HashMap f22696l;
    public final HashMap f22697m;
    public u6 f22698n;

    public h7(int i10, View view) {
        this.f22693i = new boolean[1];
        this.e = i10;
        this.f22689b = null;
        this.f22690c = null;
        this.f22688a = view;
        this.f22694j = 262148;
        this.d = null;
        this.f22692g = null;
        if (view instanceof ru) {
            this.f22688a = ((ru) view).getEditText();
        }
    }

    public static boolean b(int i10, View view) {
        if (i10 >= 0 && view != null) {
            Object tag = view.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(Object obj, View view, int i10) {
        TextView nextTextView;
        TextView nextTextView2;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        boolean z10 = obj instanceof View;
        if (z10) {
            ((View) obj).invalidate();
        }
        String str = this.f22691f;
        if (str != null && (obj instanceof ak0)) {
            ((ak0) obj).h(i10, str);
        }
        int i11 = this.f22694j;
        if ((131072 & i11) != 0 && z10) {
            obj = ((View) obj).getBackground();
        }
        Drawable drawable4 = null;
        if ((i11 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (background instanceof ib0) {
                ib0 ib0Var = (ib0) background;
                ib0Var.f29263a.setColor(i10);
                ib0Var.f29264b = null;
                return;
            }
            view2.setBackgroundColor(i10);
        } else if (obj instanceof ju) {
            if ((8388608 & i11) != 0) {
                ju juVar = (ju) obj;
                juVar.setHintColor(i10);
                juVar.setHintTextColor(i10);
            } else if ((16777216 & i11) != 0) {
                ((ju) obj).setCursorColor(i10);
            } else {
                ((ju) obj).setTextColor(i10);
            }
        } else if (obj instanceof b6) {
            if ((i11 & 2) != 0) {
                ((b6) obj).setLinkTextColor(i10);
            } else {
                ((b6) obj).setTextColor(i10);
            }
        } else {
            boolean z11 = false;
            if (obj instanceof TextView) {
                TextView textView = (TextView) obj;
                if ((i11 & 8) != 0) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (compoundDrawables != null) {
                        for (Drawable drawable5 : compoundDrawables) {
                            if (drawable5 != null) {
                                drawable5.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                            }
                        }
                    }
                } else if ((i11 & 2) != 0) {
                    textView.getPaint().linkColor = i10;
                    textView.invalidate();
                } else if ((i11 & 33554432) != 0) {
                    CharSequence text = textView.getText();
                    if (text instanceof SpannedString) {
                        SpannedString spannedString = (SpannedString) text;
                        q61[] q61VarArr = (q61[]) spannedString.getSpans(0, spannedString.length(), q61.class);
                        if (q61VarArr != null && q61VarArr.length > 0) {
                            for (q61 q61Var : q61VarArr) {
                                q61Var.f31846b = i10;
                            }
                        }
                    }
                } else {
                    textView.setTextColor(i10);
                }
            } else if (obj instanceof ImageView) {
                ImageView imageView = (ImageView) obj;
                Drawable drawable6 = imageView.getDrawable();
                if (drawable6 instanceof ar) {
                    if ((i11 & 32) != 0) {
                        drawable3 = ((ar) drawable6).f26590a;
                    } else {
                        drawable3 = ((ar) drawable6).f26591b;
                    }
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        return;
                    }
                    return;
                }
                imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
            } else if (obj instanceof y9) {
                y9 y9Var = (y9) obj;
                if (y9Var.getImageReceiver() != null) {
                    drawable4 = y9Var.getImageReceiver().getStaticThumb();
                }
                if (drawable4 instanceof ar) {
                    if ((i11 & 32) != 0) {
                        drawable2 = ((ar) drawable4).f26590a;
                    } else {
                        drawable2 = ((ar) drawable4).f26591b;
                    }
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                } else if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (obj instanceof Drawable) {
                if (obj instanceof h90) {
                    if ((i11 & 32) != 0) {
                        h90.f28867k.setColor(i10);
                    } else {
                        ((h90) obj).h.setColor(i10);
                    }
                } else if (obj instanceof ar) {
                    if ((i11 & 32) != 0) {
                        drawable = ((ar) obj).f26590a;
                    } else {
                        drawable = ((ar) obj).f26591b;
                    }
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                } else if (!(obj instanceof StateListDrawable) && !(obj instanceof RippleDrawable)) {
                    if (obj instanceof GradientDrawable) {
                        ((GradientDrawable) obj).setColor(i10);
                    } else {
                        ((Drawable) obj).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                } else {
                    Drawable drawable7 = (Drawable) obj;
                    if ((65536 & i11) != 0) {
                        z11 = true;
                    }
                    y6.E1(drawable7, i10, z11);
                }
            } else if (obj instanceof CheckBox) {
                if ((i11 & 8192) != 0) {
                    ((CheckBox) obj).setBackgroundColor(i10);
                } else if ((i11 & 16384) != 0) {
                    ((CheckBox) obj).setCheckColor(i10);
                }
            } else if (!(obj instanceof GroupCreateCheckBox)) {
                if (obj instanceof RadioButton) {
                    if ((i11 & 8192) != 0) {
                        RadioButton radioButton = (RadioButton) obj;
                        radioButton.setBackgroundColor(i10);
                        radioButton.invalidate();
                    } else if ((i11 & 16384) != 0) {
                        RadioButton radioButton2 = (RadioButton) obj;
                        radioButton2.setCheckedColor(i10);
                        radioButton2.invalidate();
                    }
                } else if (obj instanceof TextPaint) {
                    if ((i11 & 2) != 0) {
                        ((TextPaint) obj).linkColor = i10;
                    } else {
                        ((TextPaint) obj).setColor(i10);
                    }
                } else if (obj instanceof i90) {
                    if ((i11 & 2048) != 0) {
                        ((i90) obj).setProgressColor(i10);
                    } else {
                        ((i90) obj).setBackColor(i10);
                    }
                } else if (obj instanceof RadialProgressView) {
                    ((RadialProgressView) obj).setProgressColor(i10);
                } else if (obj instanceof Paint) {
                    ((Paint) obj).setColor(i10);
                    view.invalidate();
                } else if (obj instanceof lp0) {
                    if ((i11 & 2048) != 0) {
                        ((lp0) obj).setOuterColor(i10);
                    } else {
                        ((lp0) obj).setInnerColor(i10);
                    }
                } else if (obj instanceof g8) {
                    if ((i11 & 33554432) != 0) {
                        for (int i12 = 0; i12 < 2; i12++) {
                            g8 g8Var = (g8) obj;
                            if (i12 == 0) {
                                nextTextView2 = g8Var.getTextView();
                            } else {
                                nextTextView2 = g8Var.getNextTextView();
                            }
                            if (nextTextView2 != null) {
                                CharSequence text2 = nextTextView2.getText();
                                if (text2 instanceof SpannedString) {
                                    SpannedString spannedString2 = (SpannedString) text2;
                                    q61[] q61VarArr2 = (q61[]) spannedString2.getSpans(0, spannedString2.length(), q61.class);
                                    if (q61VarArr2 != null && q61VarArr2.length > 0) {
                                        for (q61 q61Var2 : q61VarArr2) {
                                            q61Var2.f31846b = i10;
                                        }
                                    }
                                }
                            }
                        }
                    } else if ((i11 & 4) != 0) {
                        if ((262144 & i11) == 0 || b(this.e, (View) obj)) {
                            for (int i13 = 0; i13 < 2; i13++) {
                                g8 g8Var2 = (g8) obj;
                                if (i13 == 0) {
                                    nextTextView = g8Var2.getTextView();
                                } else {
                                    nextTextView = g8Var2.getNextTextView();
                                }
                                if (nextTextView != null) {
                                    nextTextView.setTextColor(i10);
                                    CharSequence text3 = nextTextView.getText();
                                    if (text3 instanceof SpannedString) {
                                        SpannedString spannedString3 = (SpannedString) text3;
                                        q61[] q61VarArr3 = (q61[]) spannedString3.getSpans(0, spannedString3.length(), q61.class);
                                        if (q61VarArr3 != null && q61VarArr3.length > 0) {
                                            for (q61 q61Var3 : q61VarArr3) {
                                                q61Var3.f31846b = i10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                ((GroupCreateCheckBox) obj).updateColors();
                throw null;
            }
        }
    }

    public final int c() {
        Integer num;
        u6 u6Var = this.f22698n;
        int i10 = this.e;
        if (u6Var != null) {
            num = Integer.valueOf(u6Var.g(i10));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return y6.x0(null, i10, false);
    }

    public final void d(int i10, View view) {
        Class[] clsArr;
        TextView nextTextView;
        boolean z10;
        boolean z11;
        String str;
        Field field;
        Object obj;
        if (view != null && (clsArr = this.d) != null) {
            for (int i11 = 0; i11 < clsArr.length; i11++) {
                Class cls = clsArr[i11];
                if (cls != null && cls.isInstance(view)) {
                    view.invalidate();
                    int i12 = this.f22694j;
                    int i13 = 262144 & i12;
                    String[] strArr = this.f22695k;
                    int i14 = this.e;
                    if (i13 != 0 && !b(i14, view)) {
                        z10 = false;
                    } else {
                        view.invalidate();
                        if (strArr == null && (i12 & 32) != 0) {
                            Drawable background = view.getBackground();
                            if (background != null) {
                                if ((i12 & 16) != 0) {
                                    if (background instanceof ar) {
                                        Drawable drawable = ((ar) background).f26590a;
                                        if (drawable instanceof ColorDrawable) {
                                            ((ColorDrawable) drawable).setColor(i10);
                                        }
                                    }
                                } else {
                                    if (background instanceof ar) {
                                        background = ((ar) background).f26591b;
                                    } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                        if ((i12 & 65536) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        y6.E1(background, i10, z11);
                                    }
                                    if (background != null) {
                                        background.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                    }
                                }
                            }
                        } else if ((i12 & 16) != 0) {
                            view.setBackgroundColor(i10);
                        } else if ((i12 & 4) != 0) {
                            if (view instanceof TextView) {
                                ((TextView) view).setTextColor(i10);
                            } else if (view instanceof g8) {
                                for (int i15 = 0; i15 < 2; i15++) {
                                    g8 g8Var = (g8) view;
                                    if (i15 == 0) {
                                        nextTextView = g8Var.getTextView();
                                    } else {
                                        nextTextView = g8Var.getNextTextView();
                                    }
                                    if (nextTextView != null) {
                                        nextTextView.setTextColor(i10);
                                    }
                                }
                            }
                        } else if ((536870912 & i12) == 0) {
                            if ((i12 & 4096) != 0) {
                                view.setBackgroundDrawable(y6.M0(false));
                            } else if ((268435456 & i12) != 0) {
                                view.setBackgroundDrawable(y6.M0(true));
                            }
                        }
                        z10 = true;
                    }
                    if (strArr != null) {
                        if (i11 < strArr.length && (str = strArr[i11]) != null) {
                            String str2 = cls + "_" + str;
                            HashMap hashMap = this.f22697m;
                            if (hashMap == null || !hashMap.containsKey(str2)) {
                                HashMap hashMap2 = this.f22696l;
                                if (hashMap2 != null) {
                                    try {
                                        field = (Field) hashMap2.get(str2);
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                        if (hashMap != null) {
                                            hashMap.put(str2, Boolean.TRUE);
                                        }
                                    }
                                } else {
                                    field = null;
                                }
                                if (field == null && (field = cls.getDeclaredField(str)) != null) {
                                    field.setAccessible(true);
                                    if (hashMap2 != null) {
                                        hashMap2.put(str2, field);
                                    }
                                }
                                if (field != null && (obj = field.get(view)) != null && (z10 || !(obj instanceof View) || b(i14, (View) obj))) {
                                    if (obj instanceof Integer) {
                                        field.set(view, Integer.valueOf(i10));
                                    } else {
                                        a(obj, view, i10);
                                    }
                                }
                            }
                        }
                    } else if (view instanceof x30) {
                        ((x30) view).updateColors();
                    }
                }
            }
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        Drawable[] compoundDrawables;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.e;
        if (z11) {
            y6.x1(i11, i10, z10);
        }
        Paint[] paintArr = this.f22689b;
        int i12 = this.f22694j;
        if (paintArr != null) {
            for (int i13 = 0; i13 < paintArr.length; i13++) {
                if ((i12 & 2) != 0) {
                    Paint paint = paintArr[i13];
                    if (paint instanceof TextPaint) {
                        ((TextPaint) paint).linkColor = i10;
                    }
                }
                paintArr[i13].setColor(i10);
            }
        }
        Drawable[] drawableArr = this.f22690c;
        if (drawableArr != null) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    if (drawable instanceof j2) {
                        ((j2) drawable).a(i10);
                    } else if (drawable instanceof en0) {
                        ((en0) drawable).b(i10);
                    } else if (drawable instanceof xj0) {
                        String str = this.f22691f;
                        if (str != null) {
                            ((xj0) drawable).Q(i10, str);
                        }
                    } else if (drawable instanceof ar) {
                        if ((i12 & 32) != 0) {
                            ((ar) drawable).f26590a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((ar) drawable).f26591b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof j9) {
                        ((j9) drawable).h(i10);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.f25825a.setColor(i10);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.d;
        View view = this.f22688a;
        if (view != null && clsArr == null && this.f22695k == null && ((i12 & 262144) == 0 || b(i11, view))) {
            if ((i12 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof ib0) {
                    ib0 ib0Var = (ib0) background;
                    ib0Var.f29263a.setColor(i10);
                    ib0Var.f29264b = null;
                } else {
                    view.setBackgroundColor(i10);
                }
            }
            if ((i12 & 32) != 0) {
                if ((i12 & 2048) != 0) {
                    if (view instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) view).setErrorLineColor(i10);
                    }
                } else {
                    Drawable background2 = view.getBackground();
                    if (background2 instanceof ar) {
                        if ((i12 & 65536) != 0) {
                            background2 = ((ar) background2).f26590a;
                        } else {
                            background2 = ((ar) background2).f26591b;
                        }
                    }
                    if (background2 != null) {
                        if (!(background2 instanceof StateListDrawable) && !(background2 instanceof RippleDrawable)) {
                            if (background2 instanceof ShapeDrawable) {
                                ((ShapeDrawable) background2).getPaint().setColor(i10);
                            } else {
                                background2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                            }
                        } else {
                            if ((i12 & 65536) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            y6.E1(background2, i10, z14);
                        }
                    }
                }
            }
        }
        if (view instanceof k) {
            if ((i12 & 64) != 0) {
                ((k) view).y(i10, false);
            }
            if ((i12 & 128) != 0) {
                ((k) view).setTitleColor(i10);
            }
            if ((i12 & 256) != 0) {
                ((k) view).x(i10, false);
            }
            if ((i12 & 1024) != 0) {
                ((k) view).setSubtitleColor(i10);
            }
            if ((2097152 & i12) != 0) {
                ((k) view).setActionModeTopColor(i10);
            }
            if ((67108864 & i12) != 0) {
                ((k) view).D(i10, true);
            }
            if ((134217728 & i12) != 0) {
                ((k) view).D(i10, false);
            }
            if ((1073741824 & i12) != 0) {
                k kVar = (k) view;
                if ((i12 & 8) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                kVar.B(i10, z13, false);
            }
            if ((Integer.MIN_VALUE & i12) != 0) {
                ((k) view).A(i10, false);
            }
        }
        if (view instanceof uz) {
            if ((i12 & 4) != 0) {
                ((uz) view).setTextColor(i10);
            } else if ((i12 & 2048) != 0) {
                ((uz) view).setProgressBarColor(i10);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        } else if (view instanceof i90) {
            if ((i12 & 2048) != 0) {
                ((i90) view).setProgressColor(i10);
            } else {
                ((i90) view).setBackColor(i10);
            }
        } else if (view instanceof er) {
            ((er) view).updateColors();
        } else if ((view instanceof lp0) && (i12 & 2048) != 0) {
            ((lp0) view).setOuterColor(i10);
        }
        if ((i12 & 4) != 0 && ((i12 & 262144) == 0 || b(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof b6) {
                ((b6) view).setTextColor(i10);
            } else if (view instanceof qo) {
                ((qo) view).setTextColor(i10);
            }
        }
        if ((16777216 & i12) != 0 && (view instanceof EditTextBoldCursor)) {
            ((EditTextBoldCursor) view).setCursorColor(i10);
        }
        if ((8388608 & i12) != 0) {
            if (view instanceof EditTextBoldCursor) {
                if ((i12 & 2048) != 0) {
                    ((EditTextBoldCursor) view).setHeaderHintColor(i10);
                } else {
                    ((EditTextBoldCursor) view).setHintColor(i10);
                }
            } else if (view instanceof EditText) {
                ((EditText) view).setHintTextColor(i10);
            }
        }
        if ((i12 & 8) != 0 && ((262144 & i12) == 0 || b(i11, view))) {
            if (view instanceof ImageView) {
                if ((131072 & i12) != 0) {
                    Drawable drawable2 = ((ImageView) view).getDrawable();
                    if ((drawable2 instanceof StateListDrawable) || (drawable2 instanceof RippleDrawable)) {
                        if ((65536 & i12) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        y6.E1(drawable2, i10, z12);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof y9)) {
                if (view instanceof b6) {
                    ((b6) view).setSideDrawablesColor(i10);
                } else if ((view instanceof TextView) && (compoundDrawables = ((TextView) view).getCompoundDrawables()) != null) {
                    for (Drawable drawable3 : compoundDrawables) {
                        if (drawable3 != null) {
                            drawable3.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                }
            }
        }
        if ((view instanceof ScrollView) && (i12 & 32768) != 0) {
            AndroidUtilities.setScrollViewEdgeEffectColor((ScrollView) view, i10);
        }
        if ((view instanceof a5.m) && (i12 & 32768) != 0) {
            AndroidUtilities.setViewPagerEdgeEffectColor((a5.m) view, i10);
        }
        boolean z15 = view instanceof mm0;
        if (z15) {
            mm0 mm0Var = (mm0) view;
            if ((i12 & 4096) != 0) {
                mm0Var.setListSelectorColor(Integer.valueOf(i10));
            }
            if ((33554432 & i12) != 0) {
                mm0Var.A1();
            }
            if ((32768 & i12) != 0) {
                mm0Var.setGlowColor(i10);
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i12 & 4096) != 0) {
                view.setBackgroundDrawable(y6.M0(false));
            } else if ((268435456 & i12) != 0) {
                view.setBackgroundDrawable(y6.M0(true));
            }
        }
        if (clsArr != null) {
            if (z15) {
                mm0 mm0Var2 = (mm0) view;
                mm0Var2.getRecycledViewPool().a();
                int hiddenChildCount = mm0Var2.getHiddenChildCount();
                for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                    d(i10, mm0Var2.V(i14));
                }
                int cachedChildCount = mm0Var2.getCachedChildCount();
                for (int i15 = 0; i15 < cachedChildCount; i15++) {
                    d(i10, mm0Var2.P(i15));
                }
                int attachedScrapChildCount = mm0Var2.getAttachedScrapChildCount();
                for (int i16 = 0; i16 < attachedScrapChildCount; i16++) {
                    d(i10, mm0Var2.O(i16));
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    d(i10, viewGroup.getChildAt(i17));
                }
            }
            d(i10, view);
        }
        g7 g7Var = this.f22692g;
        if (g7Var != null) {
            g7Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public h7(View view, int i10, Class[] clsArr, Paint paint, Drawable[] drawableArr, g7 g7Var, int i11) {
        this.f22693i = new boolean[1];
        this.e = i11;
        if (paint != null) {
            this.f22689b = new Paint[]{paint};
        }
        this.f22690c = drawableArr;
        this.f22688a = view;
        this.f22694j = i10;
        this.d = clsArr;
        this.f22692g = g7Var;
        if (view instanceof ru) {
            this.f22688a = ((ru) view).getEditText();
        }
    }

    public h7(ak0 ak0Var, xj0[] xj0VarArr, String str, int i10) {
        this.f22693i = new boolean[1];
        this.e = i10;
        this.f22691f = str;
        this.f22690c = xj0VarArr;
        this.f22688a = ak0Var;
        this.f22694j = 0;
        this.d = null;
    }

    public h7(View view, int i10, Class[] clsArr, String[] strArr, Drawable[] drawableArr, g7 g7Var, int i11) {
        this.f22693i = new boolean[1];
        this.e = i11;
        this.f22689b = null;
        this.f22690c = drawableArr;
        this.f22688a = view;
        this.f22694j = i10;
        this.d = clsArr;
        this.f22695k = strArr;
        this.f22692g = g7Var;
        this.f22696l = new HashMap();
        this.f22697m = new HashMap();
        if (view instanceof ru) {
            this.f22688a = ((ru) view).getEditText();
        }
    }
}
