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
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.ym0;
public final class t6 {
    public final View f21859a;
    public final Paint[] f21860b;
    public final Drawable[] f21861c;
    public final Class[] d;
    public final int e;
    public final String f21862f;
    public s6 f21863g;
    public int h;
    public final boolean[] f21864i;
    public final int f21865j;
    public final String[] f21866k;
    public final HashMap f21867l;
    public final HashMap f21868m;
    public g6 f21869n;

    public t6(int i10, View view) {
        this.f21864i = new boolean[1];
        this.e = i10;
        this.f21860b = null;
        this.f21861c = null;
        this.f21859a = view;
        this.f21865j = 262148;
        this.d = null;
        this.f21863g = null;
        if (view instanceof ou) {
            this.f21859a = ((ou) view).getEditText();
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
        String str = this.f21862f;
        if (str != null && (obj instanceof ak0)) {
            ((ak0) obj).h(i10, str);
        }
        int i11 = this.f21865j;
        if ((131072 & i11) != 0 && z10) {
            obj = ((View) obj).getBackground();
        }
        Drawable drawable4 = null;
        if ((i11 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (background instanceof jb0) {
                jb0 jb0Var = (jb0) background;
                jb0Var.f27656a.setColor(i10);
                jb0Var.f27657b = null;
                return;
            }
            view2.setBackgroundColor(i10);
        } else if (obj instanceof gu) {
            if ((8388608 & i11) != 0) {
                gu guVar = (gu) obj;
                guVar.setHintColor(i10);
                guVar.setHintTextColor(i10);
            } else if ((16777216 & i11) != 0) {
                ((gu) obj).setCursorColor(i10);
            } else {
                ((gu) obj).setTextColor(i10);
            }
        } else if (obj instanceof n5) {
            if ((i11 & 2) != 0) {
                ((n5) obj).setLinkTextColor(i10);
            } else {
                ((n5) obj).setTextColor(i10);
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
                        i61[] i61VarArr = (i61[]) spannedString.getSpans(0, spannedString.length(), i61.class);
                        if (i61VarArr != null && i61VarArr.length > 0) {
                            for (i61 i61Var : i61VarArr) {
                                i61Var.f27312b = i10;
                            }
                        }
                    }
                } else {
                    textView.setTextColor(i10);
                }
            } else if (obj instanceof ImageView) {
                ImageView imageView = (ImageView) obj;
                Drawable drawable6 = imageView.getDrawable();
                if (drawable6 instanceof wq) {
                    if ((i11 & 32) != 0) {
                        drawable3 = ((wq) drawable6).f32322a;
                    } else {
                        drawable3 = ((wq) drawable6).f32323b;
                    }
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        return;
                    }
                    return;
                }
                imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
            } else if (obj instanceof u9) {
                u9 u9Var = (u9) obj;
                if (u9Var.getImageReceiver() != null) {
                    drawable4 = u9Var.getImageReceiver().getStaticThumb();
                }
                if (drawable4 instanceof wq) {
                    if ((i11 & 32) != 0) {
                        drawable2 = ((wq) drawable4).f32322a;
                    } else {
                        drawable2 = ((wq) drawable4).f32323b;
                    }
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                } else if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (obj instanceof Drawable) {
                if (obj instanceof e90) {
                    if ((i11 & 32) != 0) {
                        e90.f25995k.setColor(i10);
                    } else {
                        ((e90) obj).h.setColor(i10);
                    }
                } else if (obj instanceof wq) {
                    if ((i11 & 32) != 0) {
                        drawable = ((wq) obj).f32322a;
                    } else {
                        drawable = ((wq) obj).f32323b;
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
                    k6.E1(drawable7, i10, z11);
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
                } else if (obj instanceof f90) {
                    if ((i11 & 2048) != 0) {
                        ((f90) obj).setProgressColor(i10);
                    } else {
                        ((f90) obj).setBackColor(i10);
                    }
                } else if (obj instanceof RadialProgressView) {
                    ((RadialProgressView) obj).setProgressColor(i10);
                } else if (obj instanceof Paint) {
                    ((Paint) obj).setColor(i10);
                    view.invalidate();
                } else if (obj instanceof gp0) {
                    if ((i11 & 2048) != 0) {
                        ((gp0) obj).setOuterColor(i10);
                    } else {
                        ((gp0) obj).setInnerColor(i10);
                    }
                } else if (obj instanceof c8) {
                    if ((i11 & 33554432) != 0) {
                        for (int i12 = 0; i12 < 2; i12++) {
                            c8 c8Var = (c8) obj;
                            if (i12 == 0) {
                                nextTextView2 = c8Var.getTextView();
                            } else {
                                nextTextView2 = c8Var.getNextTextView();
                            }
                            if (nextTextView2 != null) {
                                CharSequence text2 = nextTextView2.getText();
                                if (text2 instanceof SpannedString) {
                                    SpannedString spannedString2 = (SpannedString) text2;
                                    i61[] i61VarArr2 = (i61[]) spannedString2.getSpans(0, spannedString2.length(), i61.class);
                                    if (i61VarArr2 != null && i61VarArr2.length > 0) {
                                        for (i61 i61Var2 : i61VarArr2) {
                                            i61Var2.f27312b = i10;
                                        }
                                    }
                                }
                            }
                        }
                    } else if ((i11 & 4) != 0) {
                        if ((262144 & i11) == 0 || b(this.e, (View) obj)) {
                            for (int i13 = 0; i13 < 2; i13++) {
                                c8 c8Var2 = (c8) obj;
                                if (i13 == 0) {
                                    nextTextView = c8Var2.getTextView();
                                } else {
                                    nextTextView = c8Var2.getNextTextView();
                                }
                                if (nextTextView != null) {
                                    nextTextView.setTextColor(i10);
                                    CharSequence text3 = nextTextView.getText();
                                    if (text3 instanceof SpannedString) {
                                        SpannedString spannedString3 = (SpannedString) text3;
                                        i61[] i61VarArr3 = (i61[]) spannedString3.getSpans(0, spannedString3.length(), i61.class);
                                        if (i61VarArr3 != null && i61VarArr3.length > 0) {
                                            for (i61 i61Var3 : i61VarArr3) {
                                                i61Var3.f27312b = i10;
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
        g6 g6Var = this.f21869n;
        int i10 = this.e;
        if (g6Var != null) {
            num = Integer.valueOf(g6Var.g(i10));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return k6.x0(null, i10, false);
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
                    int i12 = this.f21865j;
                    int i13 = 262144 & i12;
                    String[] strArr = this.f21866k;
                    int i14 = this.e;
                    if (i13 != 0 && !b(i14, view)) {
                        z10 = false;
                    } else {
                        view.invalidate();
                        if (strArr == null && (i12 & 32) != 0) {
                            Drawable background = view.getBackground();
                            if (background != null) {
                                if ((i12 & 16) != 0) {
                                    if (background instanceof wq) {
                                        Drawable drawable = ((wq) background).f32322a;
                                        if (drawable instanceof ColorDrawable) {
                                            ((ColorDrawable) drawable).setColor(i10);
                                        }
                                    }
                                } else {
                                    if (background instanceof wq) {
                                        background = ((wq) background).f32323b;
                                    } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                        if ((i12 & 65536) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        k6.E1(background, i10, z11);
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
                            } else if (view instanceof c8) {
                                for (int i15 = 0; i15 < 2; i15++) {
                                    c8 c8Var = (c8) view;
                                    if (i15 == 0) {
                                        nextTextView = c8Var.getTextView();
                                    } else {
                                        nextTextView = c8Var.getNextTextView();
                                    }
                                    if (nextTextView != null) {
                                        nextTextView.setTextColor(i10);
                                    }
                                }
                            }
                        } else if ((536870912 & i12) == 0) {
                            if ((i12 & 4096) != 0) {
                                view.setBackgroundDrawable(k6.M0(false));
                            } else if ((268435456 & i12) != 0) {
                                view.setBackgroundDrawable(k6.M0(true));
                            }
                        }
                        z10 = true;
                    }
                    if (strArr != null) {
                        if (i11 < strArr.length && (str = strArr[i11]) != null) {
                            String str2 = cls + "_" + str;
                            HashMap hashMap = this.f21868m;
                            if (hashMap == null || !hashMap.containsKey(str2)) {
                                HashMap hashMap2 = this.f21867l;
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
                    } else if (view instanceof t30) {
                        ((t30) view).updateColors();
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
            k6.x1(i11, i10, z10);
        }
        Paint[] paintArr = this.f21860b;
        int i12 = this.f21865j;
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
        Drawable[] drawableArr = this.f21861c;
        if (drawableArr != null) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    if (drawable instanceof h2) {
                        ((h2) drawable).a(i10);
                    } else if (drawable instanceof ym0) {
                        ((ym0) drawable).b(i10);
                    } else if (drawable instanceof xj0) {
                        String str = this.f21862f;
                        if (str != null) {
                            ((xj0) drawable).Q(i10, str);
                        }
                    } else if (drawable instanceof wq) {
                        if ((i12 & 32) != 0) {
                            ((wq) drawable).f32322a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((wq) drawable).f32323b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof f9) {
                        ((f9) drawable).h(i10);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.f24035a.setColor(i10);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.d;
        View view = this.f21859a;
        if (view != null && clsArr == null && this.f21866k == null && ((i12 & 262144) == 0 || b(i11, view))) {
            if ((i12 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof jb0) {
                    jb0 jb0Var = (jb0) background;
                    jb0Var.f27656a.setColor(i10);
                    jb0Var.f27657b = null;
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
                    if (background2 instanceof wq) {
                        if ((i12 & 65536) != 0) {
                            background2 = ((wq) background2).f32322a;
                        } else {
                            background2 = ((wq) background2).f32323b;
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
                            k6.E1(background2, i10, z14);
                        }
                    }
                }
            }
        }
        if (view instanceof k) {
            if ((i12 & 64) != 0) {
                ((k) view).B(i10, false);
            }
            if ((i12 & 128) != 0) {
                ((k) view).setTitleColor(i10);
            }
            if ((i12 & 256) != 0) {
                ((k) view).A(i10, false);
            }
            if ((i12 & 1024) != 0) {
                ((k) view).setSubtitleColor(i10);
            }
            if ((1048576 & i12) != 0) {
                ((k) view).setActionModeColor(i10);
            }
            if ((2097152 & i12) != 0) {
                ((k) view).setActionModeTopColor(i10);
            }
            if ((67108864 & i12) != 0) {
                ((k) view).F(i10, true);
            }
            if ((134217728 & i12) != 0) {
                ((k) view).F(i10, false);
            }
            if ((1073741824 & i12) != 0) {
                k kVar = (k) view;
                if ((i12 & 8) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                kVar.D(i10, z13, false);
            }
            if ((Integer.MIN_VALUE & i12) != 0) {
                ((k) view).C(i10, false);
            }
        }
        if (view instanceof tz) {
            if ((i12 & 4) != 0) {
                ((tz) view).setTextColor(i10);
            } else if ((i12 & 2048) != 0) {
                ((tz) view).setProgressBarColor(i10);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        } else if (view instanceof f90) {
            if ((i12 & 2048) != 0) {
                ((f90) view).setProgressColor(i10);
            } else {
                ((f90) view).setBackColor(i10);
            }
        } else if (view instanceof ar) {
            ((ar) view).updateColors();
        } else if ((view instanceof gp0) && (i12 & 2048) != 0) {
            ((gp0) view).setOuterColor(i10);
        }
        if ((i12 & 4) != 0 && ((i12 & 262144) == 0 || b(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof n5) {
                ((n5) view).setTextColor(i10);
            } else if (view instanceof no) {
                ((no) view).setTextColor(i10);
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
                        k6.E1(drawable2, i10, z12);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof u9)) {
                if (view instanceof n5) {
                    ((n5) view).setSideDrawablesColor(i10);
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
        if ((view instanceof z4.h) && (i12 & 32768) != 0) {
            AndroidUtilities.setViewPagerEdgeEffectColor((z4.h) view, i10);
        }
        boolean z15 = view instanceof lm0;
        if (z15) {
            lm0 lm0Var = (lm0) view;
            if ((i12 & 4096) != 0) {
                lm0Var.setListSelectorColor(Integer.valueOf(i10));
            }
            if ((33554432 & i12) != 0) {
                lm0Var.A1();
            }
            if ((32768 & i12) != 0) {
                lm0Var.setGlowColor(i10);
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i12 & 4096) != 0) {
                view.setBackgroundDrawable(k6.M0(false));
            } else if ((268435456 & i12) != 0) {
                view.setBackgroundDrawable(k6.M0(true));
            }
        }
        if (clsArr != null) {
            if (z15) {
                lm0 lm0Var2 = (lm0) view;
                lm0Var2.getRecycledViewPool().a();
                int hiddenChildCount = lm0Var2.getHiddenChildCount();
                for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                    d(i10, lm0Var2.V(i14));
                }
                int cachedChildCount = lm0Var2.getCachedChildCount();
                for (int i15 = 0; i15 < cachedChildCount; i15++) {
                    d(i10, lm0Var2.P(i15));
                }
                int attachedScrapChildCount = lm0Var2.getAttachedScrapChildCount();
                for (int i16 = 0; i16 < attachedScrapChildCount; i16++) {
                    d(i10, lm0Var2.O(i16));
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
        s6 s6Var = this.f21863g;
        if (s6Var != null) {
            s6Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public t6(View view, int i10, Class[] clsArr, Paint paint, Drawable[] drawableArr, s6 s6Var, int i11) {
        this.f21864i = new boolean[1];
        this.e = i11;
        if (paint != null) {
            this.f21860b = new Paint[]{paint};
        }
        this.f21861c = drawableArr;
        this.f21859a = view;
        this.f21865j = i10;
        this.d = clsArr;
        this.f21863g = s6Var;
        if (view instanceof ou) {
            this.f21859a = ((ou) view).getEditText();
        }
    }

    public t6(ak0 ak0Var, xj0[] xj0VarArr, String str, int i10) {
        this.f21864i = new boolean[1];
        this.e = i10;
        this.f21862f = str;
        this.f21861c = xj0VarArr;
        this.f21859a = ak0Var;
        this.f21865j = 0;
        this.d = null;
    }

    public t6(View view, int i10, Class[] clsArr, String[] strArr, Drawable[] drawableArr, s6 s6Var, int i11) {
        this.f21864i = new boolean[1];
        this.e = i11;
        this.f21860b = null;
        this.f21861c = drawableArr;
        this.f21859a = view;
        this.f21865j = i10;
        this.d = clsArr;
        this.f21866k = strArr;
        this.f21863g = s6Var;
        this.f21867l = new HashMap();
        this.f21868m = new HashMap();
        if (view instanceof ou) {
            this.f21859a = ((ou) view).getEditText();
        }
    }
}
