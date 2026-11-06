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
import org.telegram.messenger.a8;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.GroupCreateCheckBox;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.ys;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.Components.zp;
public final class t6 {
    public final View f28531a;
    public final Paint[] f28532b;
    public final Drawable[] f28533c;
    public final Class[] d;
    public final int f28534e;
    public final String f28535f;
    public s6 f28536g;
    public int h;
    public final boolean[] f28537i;
    public final int f28538j;
    public final String[] f28539k;
    public final HashMap f28540l;
    public final HashMap f28541m;
    public f6 f28542n;

    public t6(int i7, View view) {
        this.f28537i = new boolean[1];
        this.f28534e = i7;
        this.f28532b = null;
        this.f28533c = null;
        this.f28531a = view;
        this.f28538j = 262148;
        this.d = null;
        this.f28536g = null;
        if (view instanceof kt) {
            this.f28531a = ((kt) view).getEditText();
        }
    }

    public static boolean b(int i7, View view) {
        if (i7 >= 0 && view != null) {
            Object tag = view.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i7) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(Object obj, View view, int i7) {
        TextView nextTextView;
        TextView nextTextView2;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        boolean z9 = obj instanceof View;
        if (z9) {
            ((View) obj).invalidate();
        }
        String str = this.f28535f;
        if (str != null && (obj instanceof ch0)) {
            ((ch0) obj).h(i7, str);
        }
        int i10 = this.f28538j;
        if ((131072 & i10) != 0 && z9) {
            obj = ((View) obj).getBackground();
        }
        Drawable drawable4 = null;
        if ((i10 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (background instanceof i90) {
                i90 i90Var = (i90) background;
                i90Var.f34561a.setColor(i7);
                i90Var.f34562b = null;
                return;
            }
            view2.setBackgroundColor(i7);
        } else if (obj instanceof ys) {
            if ((8388608 & i10) != 0) {
                ys ysVar = (ys) obj;
                ysVar.setHintColor(i7);
                ysVar.setHintTextColor(i7);
            } else if ((16777216 & i10) != 0) {
                ((ys) obj).setCursorColor(i7);
            } else {
                ((ys) obj).setTextColor(i7);
            }
        } else if (obj instanceof k5) {
            if ((i10 & 2) != 0) {
                ((k5) obj).setLinkTextColor(i7);
            } else {
                ((k5) obj).setTextColor(i7);
            }
        } else {
            boolean z10 = false;
            if (obj instanceof TextView) {
                TextView textView = (TextView) obj;
                if ((i10 & 8) != 0) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (compoundDrawables != null) {
                        for (Drawable drawable5 : compoundDrawables) {
                            if (drawable5 != null) {
                                drawable5.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                            }
                        }
                    }
                } else if ((i10 & 2) != 0) {
                    textView.getPaint().linkColor = i7;
                    textView.invalidate();
                } else if ((i10 & 33554432) != 0) {
                    CharSequence text = textView.getText();
                    if (text instanceof SpannedString) {
                        SpannedString spannedString = (SpannedString) text;
                        o31[] o31VarArr = (o31[]) spannedString.getSpans(0, spannedString.length(), o31.class);
                        if (o31VarArr != null && o31VarArr.length > 0) {
                            for (o31 o31Var : o31VarArr) {
                                o31Var.f36586b = i7;
                            }
                        }
                    }
                } else {
                    textView.setTextColor(i7);
                }
            } else if (obj instanceof ImageView) {
                ImageView imageView = (ImageView) obj;
                Drawable drawable6 = imageView.getDrawable();
                if (drawable6 instanceof xp) {
                    if ((i10 & 32) != 0) {
                        drawable3 = ((xp) drawable6).f40296a;
                    } else {
                        drawable3 = ((xp) drawable6).f40297b;
                    }
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        return;
                    }
                    return;
                }
                imageView.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
            } else if (obj instanceof l9) {
                l9 l9Var = (l9) obj;
                if (l9Var.getImageReceiver() != null) {
                    drawable4 = l9Var.getImageReceiver().m0;
                }
                if (drawable4 instanceof xp) {
                    if ((i10 & 32) != 0) {
                        drawable2 = ((xp) drawable4).f40296a;
                    } else {
                        drawable2 = ((xp) drawable4).f40297b;
                    }
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                    }
                } else if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                }
            } else if (obj instanceof Drawable) {
                if (obj instanceof g70) {
                    if ((i10 & 32) != 0) {
                        g70.f33875k.setColor(i7);
                    } else {
                        ((g70) obj).h.setColor(i7);
                    }
                } else if (obj instanceof xp) {
                    if ((i10 & 32) != 0) {
                        drawable = ((xp) obj).f40296a;
                    } else {
                        drawable = ((xp) obj).f40297b;
                    }
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                    }
                } else if (!(obj instanceof StateListDrawable) && !(obj instanceof RippleDrawable)) {
                    if (obj instanceof GradientDrawable) {
                        ((GradientDrawable) obj).setColor(i7);
                    } else {
                        ((Drawable) obj).setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                    }
                } else {
                    Drawable drawable7 = (Drawable) obj;
                    if ((65536 & i10) != 0) {
                        z10 = true;
                    }
                    k6.H1(drawable7, i7, z10);
                }
            } else if (obj instanceof CheckBox) {
                if ((i10 & 8192) != 0) {
                    ((CheckBox) obj).setBackgroundColor(i7);
                } else if ((i10 & 16384) != 0) {
                    ((CheckBox) obj).setCheckColor(i7);
                }
            } else if (!(obj instanceof GroupCreateCheckBox)) {
                if (obj instanceof RadioButton) {
                    if ((i10 & 8192) != 0) {
                        RadioButton radioButton = (RadioButton) obj;
                        radioButton.setBackgroundColor(i7);
                        radioButton.invalidate();
                    } else if ((i10 & 16384) != 0) {
                        RadioButton radioButton2 = (RadioButton) obj;
                        radioButton2.setCheckedColor(i7);
                        radioButton2.invalidate();
                    }
                } else if (obj instanceof TextPaint) {
                    if ((i10 & 2) != 0) {
                        ((TextPaint) obj).linkColor = i7;
                    } else {
                        ((TextPaint) obj).setColor(i7);
                    }
                } else if (obj instanceof h70) {
                    if ((i10 & 2048) != 0) {
                        ((h70) obj).setProgressColor(i7);
                    } else {
                        ((h70) obj).setBackColor(i7);
                    }
                } else if (obj instanceof RadialProgressView) {
                    ((RadialProgressView) obj).setProgressColor(i7);
                } else if (obj instanceof Paint) {
                    ((Paint) obj).setColor(i7);
                    view.invalidate();
                } else if (obj instanceof mm0) {
                    if ((i10 & 2048) != 0) {
                        ((mm0) obj).setOuterColor(i7);
                    } else {
                        ((mm0) obj).setInnerColor(i7);
                    }
                } else if (obj instanceof w7) {
                    if ((i10 & 33554432) != 0) {
                        for (int i11 = 0; i11 < 2; i11++) {
                            w7 w7Var = (w7) obj;
                            if (i11 == 0) {
                                nextTextView2 = w7Var.getTextView();
                            } else {
                                nextTextView2 = w7Var.getNextTextView();
                            }
                            if (nextTextView2 != null) {
                                CharSequence text2 = nextTextView2.getText();
                                if (text2 instanceof SpannedString) {
                                    SpannedString spannedString2 = (SpannedString) text2;
                                    o31[] o31VarArr2 = (o31[]) spannedString2.getSpans(0, spannedString2.length(), o31.class);
                                    if (o31VarArr2 != null && o31VarArr2.length > 0) {
                                        for (o31 o31Var2 : o31VarArr2) {
                                            o31Var2.f36586b = i7;
                                        }
                                    }
                                }
                            }
                        }
                    } else if ((i10 & 4) != 0) {
                        if ((262144 & i10) == 0 || b(this.f28534e, (View) obj)) {
                            for (int i12 = 0; i12 < 2; i12++) {
                                w7 w7Var2 = (w7) obj;
                                if (i12 == 0) {
                                    nextTextView = w7Var2.getTextView();
                                } else {
                                    nextTextView = w7Var2.getNextTextView();
                                }
                                if (nextTextView != null) {
                                    nextTextView.setTextColor(i7);
                                    CharSequence text3 = nextTextView.getText();
                                    if (text3 instanceof SpannedString) {
                                        SpannedString spannedString3 = (SpannedString) text3;
                                        o31[] o31VarArr3 = (o31[]) spannedString3.getSpans(0, spannedString3.length(), o31.class);
                                        if (o31VarArr3 != null && o31VarArr3.length > 0) {
                                            for (o31 o31Var3 : o31VarArr3) {
                                                o31Var3.f36586b = i7;
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
        f6 f6Var = this.f28542n;
        int i7 = this.f28534e;
        if (f6Var != null) {
            num = Integer.valueOf(f6Var.h(i7));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return k6.x0(null, i7, false);
    }

    public final void d(int i7, View view) {
        Class[] clsArr;
        TextView nextTextView;
        boolean z9;
        boolean z10;
        String str;
        Field field;
        Object obj;
        if (view != null && (clsArr = this.d) != null) {
            for (int i10 = 0; i10 < clsArr.length; i10++) {
                Class cls = clsArr[i10];
                if (cls != null && cls.isInstance(view)) {
                    view.invalidate();
                    int i11 = this.f28538j;
                    int i12 = 262144 & i11;
                    String[] strArr = this.f28539k;
                    int i13 = this.f28534e;
                    if (i12 != 0 && !b(i13, view)) {
                        z9 = false;
                    } else {
                        view.invalidate();
                        if (strArr == null && (i11 & 32) != 0) {
                            Drawable background = view.getBackground();
                            if (background != null) {
                                if ((i11 & 16) != 0) {
                                    if (background instanceof xp) {
                                        Drawable drawable = ((xp) background).f40296a;
                                        if (drawable instanceof ColorDrawable) {
                                            ((ColorDrawable) drawable).setColor(i7);
                                        }
                                    }
                                } else {
                                    if (background instanceof xp) {
                                        background = ((xp) background).f40297b;
                                    } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                        if ((i11 & 65536) != 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        k6.H1(background, i7, z10);
                                    }
                                    if (background != null) {
                                        background.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                                    }
                                }
                            }
                        } else if ((i11 & 16) != 0) {
                            view.setBackgroundColor(i7);
                        } else if ((i11 & 4) != 0) {
                            if (view instanceof TextView) {
                                ((TextView) view).setTextColor(i7);
                            } else if (view instanceof w7) {
                                for (int i14 = 0; i14 < 2; i14++) {
                                    w7 w7Var = (w7) view;
                                    if (i14 == 0) {
                                        nextTextView = w7Var.getTextView();
                                    } else {
                                        nextTextView = w7Var.getNextTextView();
                                    }
                                    if (nextTextView != null) {
                                        nextTextView.setTextColor(i7);
                                    }
                                }
                            }
                        } else if ((536870912 & i11) == 0) {
                            if ((i11 & 4096) != 0) {
                                view.setBackgroundDrawable(k6.N0(false));
                            } else if ((268435456 & i11) != 0) {
                                view.setBackgroundDrawable(k6.N0(true));
                            }
                        }
                        z9 = true;
                    }
                    if (strArr != null) {
                        if (i10 < strArr.length && (str = strArr[i10]) != null) {
                            String str2 = cls + "_" + str;
                            HashMap hashMap = this.f28541m;
                            if (hashMap == null || !hashMap.containsKey(str2)) {
                                HashMap hashMap2 = this.f28540l;
                                if (hashMap2 != null) {
                                    try {
                                        field = (Field) hashMap2.get(str2);
                                    } catch (Throwable th2) {
                                        a8.g(th2, true);
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
                                if (field != null && (obj = field.get(view)) != null && (z9 || !(obj instanceof View) || b(i13, (View) obj))) {
                                    if (obj instanceof Integer) {
                                        field.set(view, Integer.valueOf(i7));
                                    } else {
                                        a(obj, view, i7);
                                    }
                                }
                            }
                        }
                    } else if (view instanceof c20) {
                        ((c20) view).updateColors();
                    }
                }
            }
        }
    }

    public final void e(int i7, boolean z9, boolean z10) {
        Drawable[] compoundDrawables;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = this.f28534e;
        if (z10) {
            k6.A1(i10, i7, z9);
        }
        Paint[] paintArr = this.f28532b;
        int i11 = this.f28538j;
        if (paintArr != null) {
            for (int i12 = 0; i12 < paintArr.length; i12++) {
                if ((i11 & 2) != 0) {
                    Paint paint = paintArr[i12];
                    if (paint instanceof TextPaint) {
                        ((TextPaint) paint).linkColor = i7;
                    }
                }
                paintArr[i12].setColor(i7);
            }
        }
        Drawable[] drawableArr = this.f28533c;
        if (drawableArr != null) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    if (drawable instanceof y1) {
                        ((y1) drawable).a(i7);
                    } else if (drawable instanceof gk0) {
                        ((gk0) drawable).b(i7);
                    } else if (drawable instanceof zg0) {
                        String str = this.f28535f;
                        if (str != null) {
                            ((zg0) drawable).Q(i7, str);
                        }
                    } else if (drawable instanceof xp) {
                        if ((i11 & 32) != 0) {
                            ((xp) drawable).f40296a.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((xp) drawable).f40297b.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof w8) {
                        ((w8) drawable).h(i7);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.f30998a.setColor(i7);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.d;
        View view = this.f28531a;
        if (view != null && clsArr == null && this.f28539k == null && ((i11 & 262144) == 0 || b(i10, view))) {
            if ((i11 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof i90) {
                    i90 i90Var = (i90) background;
                    i90Var.f34561a.setColor(i7);
                    i90Var.f34562b = null;
                } else {
                    view.setBackgroundColor(i7);
                }
            }
            if ((i11 & 32) != 0) {
                if ((i11 & 2048) != 0) {
                    if (view instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) view).setErrorLineColor(i7);
                    }
                } else {
                    Drawable background2 = view.getBackground();
                    if (background2 instanceof xp) {
                        if ((i11 & 65536) != 0) {
                            background2 = ((xp) background2).f40296a;
                        } else {
                            background2 = ((xp) background2).f40297b;
                        }
                    }
                    if (background2 != null) {
                        if (!(background2 instanceof StateListDrawable) && !(background2 instanceof RippleDrawable)) {
                            if (background2 instanceof ShapeDrawable) {
                                ((ShapeDrawable) background2).getPaint().setColor(i7);
                            } else {
                                background2.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                            }
                        } else {
                            if ((i11 & 65536) != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            k6.H1(background2, i7, z13);
                        }
                    }
                }
            }
        }
        if (view instanceof k) {
            if ((i11 & 64) != 0) {
                ((k) view).D(i7, false);
            }
            if ((i11 & 128) != 0) {
                ((k) view).setTitleColor(i7);
            }
            if ((i11 & 256) != 0) {
                ((k) view).C(i7, false);
            }
            if ((i11 & 1024) != 0) {
                ((k) view).setSubtitleColor(i7);
            }
            if ((2097152 & i11) != 0) {
                ((k) view).setActionModeTopColor(i7);
            }
            if ((67108864 & i11) != 0) {
                ((k) view).I(i7, true);
            }
            if ((134217728 & i11) != 0) {
                ((k) view).I(i7, false);
            }
            if ((1073741824 & i11) != 0) {
                k kVar = (k) view;
                if ((i11 & 8) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                kVar.G(i7, z12, false);
            }
            if ((Integer.MIN_VALUE & i11) != 0) {
                ((k) view).E(i7, false);
            }
        }
        if (view instanceof iy) {
            if ((i11 & 4) != 0) {
                ((iy) view).setTextColor(i7);
            } else if ((i11 & 2048) != 0) {
                ((iy) view).setProgressBarColor(i7);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i7);
        } else if (view instanceof h70) {
            if ((i11 & 2048) != 0) {
                ((h70) view).setProgressColor(i7);
            } else {
                ((h70) view).setBackColor(i7);
            }
        } else if (view instanceof zp) {
            ((zp) view).updateColors();
        } else if ((view instanceof mm0) && (i11 & 2048) != 0) {
            ((mm0) view).setOuterColor(i7);
        }
        if ((i11 & 4) != 0 && ((i11 & 262144) == 0 || b(i10, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i7);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i7);
            } else if (view instanceof k5) {
                ((k5) view).setTextColor(i7);
            } else if (view instanceof ln) {
                ((ln) view).setTextColor(i7);
            }
        }
        if ((16777216 & i11) != 0 && (view instanceof EditTextBoldCursor)) {
            ((EditTextBoldCursor) view).setCursorColor(i7);
        }
        if ((8388608 & i11) != 0) {
            if (view instanceof EditTextBoldCursor) {
                if ((i11 & 2048) != 0) {
                    ((EditTextBoldCursor) view).setHeaderHintColor(i7);
                } else {
                    ((EditTextBoldCursor) view).setHintColor(i7);
                }
            } else if (view instanceof EditText) {
                ((EditText) view).setHintTextColor(i7);
            }
        }
        if ((i11 & 8) != 0 && ((262144 & i11) == 0 || b(i10, view))) {
            if (view instanceof ImageView) {
                if ((131072 & i11) != 0) {
                    Drawable drawable2 = ((ImageView) view).getDrawable();
                    if ((drawable2 instanceof StateListDrawable) || (drawable2 instanceof RippleDrawable)) {
                        if ((65536 & i11) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        k6.H1(drawable2, i7, z11);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof l9)) {
                if (view instanceof k5) {
                    ((k5) view).setSideDrawablesColor(i7);
                } else if ((view instanceof TextView) && (compoundDrawables = ((TextView) view).getCompoundDrawables()) != null) {
                    for (Drawable drawable3 : compoundDrawables) {
                        if (drawable3 != null) {
                            drawable3.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                }
            }
        }
        if ((view instanceof ScrollView) && (i11 & 32768) != 0) {
            org.telegram.messenger.g0.z3((ScrollView) view, i7);
        }
        if ((view instanceof c5.k) && (i11 & 32768) != 0) {
            org.telegram.messenger.g0.C3((c5.k) view, i7);
        }
        boolean z14 = view instanceof pj0;
        if (z14) {
            pj0 pj0Var = (pj0) view;
            if ((i11 & 4096) != 0) {
                pj0Var.setListSelectorColor(Integer.valueOf(i7));
            }
            if ((33554432 & i11) != 0) {
                pj0Var.x1();
            }
            if ((32768 & i11) != 0) {
                pj0Var.setGlowColor(i7);
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i11 & 4096) != 0) {
                view.setBackgroundDrawable(k6.N0(false));
            } else if ((268435456 & i11) != 0) {
                view.setBackgroundDrawable(k6.N0(true));
            }
        }
        if (clsArr != null) {
            if (z14) {
                pj0 pj0Var2 = (pj0) view;
                pj0Var2.getRecycledViewPool().a();
                int hiddenChildCount = pj0Var2.getHiddenChildCount();
                for (int i13 = 0; i13 < hiddenChildCount; i13++) {
                    d(i7, pj0Var2.V(i13));
                }
                int cachedChildCount = pj0Var2.getCachedChildCount();
                for (int i14 = 0; i14 < cachedChildCount; i14++) {
                    d(i7, pj0Var2.P(i14));
                }
                int attachedScrapChildCount = pj0Var2.getAttachedScrapChildCount();
                for (int i15 = 0; i15 < attachedScrapChildCount; i15++) {
                    d(i7, pj0Var2.O(i15));
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    d(i7, viewGroup.getChildAt(i16));
                }
            }
            d(i7, view);
        }
        s6 s6Var = this.f28536g;
        if (s6Var != null) {
            s6Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public t6(View view, int i7, Class[] clsArr, Paint paint, Drawable[] drawableArr, s6 s6Var, int i10) {
        this.f28537i = new boolean[1];
        this.f28534e = i10;
        if (paint != null) {
            this.f28532b = new Paint[]{paint};
        }
        this.f28533c = drawableArr;
        this.f28531a = view;
        this.f28538j = i7;
        this.d = clsArr;
        this.f28536g = s6Var;
        if (view instanceof kt) {
            this.f28531a = ((kt) view).getEditText();
        }
    }

    public t6(ch0 ch0Var, zg0[] zg0VarArr, String str, int i7) {
        this.f28537i = new boolean[1];
        this.f28534e = i7;
        this.f28535f = str;
        this.f28533c = zg0VarArr;
        this.f28531a = ch0Var;
        this.f28538j = 0;
        this.d = null;
    }

    public t6(View view, int i7, Class[] clsArr, String[] strArr, Drawable[] drawableArr, s6 s6Var, int i10) {
        this.f28537i = new boolean[1];
        this.f28534e = i10;
        this.f28532b = null;
        this.f28533c = drawableArr;
        this.f28531a = view;
        this.f28538j = i7;
        this.d = clsArr;
        this.f28539k = strArr;
        this.f28536g = s6Var;
        this.f28540l = new HashMap();
        this.f28541m = new HashMap();
        if (view instanceof kt) {
            this.f28531a = ((kt) view).getEditText();
        }
    }
}
