package org.telegram.ui.ActionBar;

import android.graphics.Color;
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
import java.util.ArrayList;
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
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x80;
public final class j6 {
    public final View f19515a;
    public final int f19516b;
    public final Paint[] f19517c;
    public final Drawable[] d;
    public final Class[] e;
    public final int f19518f;
    public final String f19519g;
    public i6 h;
    public int f19520i;
    public final boolean[] f19521j;
    public final int f19522k;
    public final String[] f19523l;
    public final HashMap f19524m;
    public final HashMap f19525n;
    public d6 f19526o;

    public j6(View view, int i10, Class[] clsArr, Paint[] paintArr, int i11) {
        this.f19516b = -1;
        this.f19521j = new boolean[1];
        this.f19518f = i11;
        this.f19517c = paintArr;
        this.d = null;
        this.f19515a = view;
        this.f19522k = i10;
        this.e = clsArr;
        this.h = null;
        if (view instanceof ku) {
            this.f19515a = ((ku) view).getEditText();
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
        String str = this.f19519g;
        if (str != null && (obj instanceof lj0)) {
            ((lj0) obj).h(i10, str);
        }
        int i11 = this.f19522k;
        if ((131072 & i11) != 0 && z10) {
            obj = ((View) obj).getBackground();
        }
        Drawable drawable4 = null;
        if ((i11 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (background instanceof bb0) {
                bb0 bb0Var = (bb0) background;
                bb0Var.f22964a.setColor(i10);
                bb0Var.f22965b = null;
                return;
            }
            view2.setBackgroundColor(i10);
        } else if (obj instanceof cu) {
            if ((8388608 & i11) != 0) {
                cu cuVar = (cu) obj;
                cuVar.setHintColor(i10);
                cuVar.setHintTextColor(i10);
            } else if ((16777216 & i11) != 0) {
                ((cu) obj).setCursorColor(i10);
            } else {
                ((cu) obj).setTextColor(i10);
            }
        } else if (obj instanceof h5) {
            if ((i11 & 2) != 0) {
                ((h5) obj).setLinkTextColor(i10);
            } else {
                ((h5) obj).setTextColor(i10);
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
                        s51[] s51VarArr = (s51[]) spannedString.getSpans(0, spannedString.length(), s51.class);
                        if (s51VarArr != null && s51VarArr.length > 0) {
                            for (s51 s51Var : s51VarArr) {
                                s51Var.f28159b = i10;
                            }
                        }
                    }
                } else {
                    textView.setTextColor(i10);
                }
            } else if (obj instanceof ImageView) {
                ImageView imageView = (ImageView) obj;
                Drawable drawable6 = imageView.getDrawable();
                if (drawable6 instanceof qq) {
                    if ((i11 & 32) != 0) {
                        drawable3 = ((qq) drawable6).f27733a;
                    } else {
                        drawable3 = ((qq) drawable6).f27734b;
                    }
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        return;
                    }
                    return;
                }
                imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
            } else if (obj instanceof w9) {
                w9 w9Var = (w9) obj;
                if (w9Var.getImageReceiver() != null) {
                    drawable4 = w9Var.getImageReceiver().getStaticThumb();
                }
                if (drawable4 instanceof qq) {
                    if ((i11 & 32) != 0) {
                        drawable2 = ((qq) drawable4).f27733a;
                    } else {
                        drawable2 = ((qq) drawable4).f27734b;
                    }
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                } else if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (obj instanceof Drawable) {
                if (obj instanceof w80) {
                    if ((i11 & 32) != 0) {
                        w80.f29923j.setColor(i10);
                    } else {
                        ((w80) obj).h.setColor(i10);
                    }
                } else if (obj instanceof qq) {
                    if ((i11 & 32) != 0) {
                        drawable = ((qq) obj).f27733a;
                    } else {
                        drawable = ((qq) obj).f27734b;
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
                    h6.B1(drawable7, i10, z11);
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
                } else if (obj instanceof x80) {
                    if ((i11 & 2048) != 0) {
                        ((x80) obj).setProgressColor(i10);
                    } else {
                        ((x80) obj).setBackColor(i10);
                    }
                } else if (obj instanceof RadialProgressView) {
                    ((RadialProgressView) obj).setProgressColor(i10);
                } else if (obj instanceof Paint) {
                    ((Paint) obj).setColor(i10);
                    view.invalidate();
                } else if (obj instanceof so0) {
                    if ((i11 & 2048) != 0) {
                        ((so0) obj).setOuterColor(i10);
                    } else {
                        ((so0) obj).setInnerColor(i10);
                    }
                } else if (obj instanceof d8) {
                    if ((i11 & 33554432) != 0) {
                        for (int i12 = 0; i12 < 2; i12++) {
                            d8 d8Var = (d8) obj;
                            if (i12 == 0) {
                                nextTextView2 = d8Var.getTextView();
                            } else {
                                nextTextView2 = d8Var.getNextTextView();
                            }
                            if (nextTextView2 != null) {
                                CharSequence text2 = nextTextView2.getText();
                                if (text2 instanceof SpannedString) {
                                    SpannedString spannedString2 = (SpannedString) text2;
                                    s51[] s51VarArr2 = (s51[]) spannedString2.getSpans(0, spannedString2.length(), s51.class);
                                    if (s51VarArr2 != null && s51VarArr2.length > 0) {
                                        for (s51 s51Var2 : s51VarArr2) {
                                            s51Var2.f28159b = i10;
                                        }
                                    }
                                }
                            }
                        }
                    } else if ((i11 & 4) != 0) {
                        if ((262144 & i11) == 0 || b(this.f19518f, (View) obj)) {
                            for (int i13 = 0; i13 < 2; i13++) {
                                d8 d8Var2 = (d8) obj;
                                if (i13 == 0) {
                                    nextTextView = d8Var2.getTextView();
                                } else {
                                    nextTextView = d8Var2.getNextTextView();
                                }
                                if (nextTextView != null) {
                                    nextTextView.setTextColor(i10);
                                    CharSequence text3 = nextTextView.getText();
                                    if (text3 instanceof SpannedString) {
                                        SpannedString spannedString3 = (SpannedString) text3;
                                        s51[] s51VarArr3 = (s51[]) spannedString3.getSpans(0, spannedString3.length(), s51.class);
                                        if (s51VarArr3 != null && s51VarArr3.length > 0) {
                                            for (s51 s51Var3 : s51VarArr3) {
                                                s51Var3.f28159b = i10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int i14 = GroupCreateCheckBox.f22291b;
                h6.u0(0);
                throw null;
            }
        }
    }

    public final int c() {
        Integer num;
        d6 d6Var = this.f19526o;
        int i10 = this.f19518f;
        if (d6Var != null) {
            num = Integer.valueOf(d6Var.G0(i10));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return h6.w0(null, i10, false);
    }

    public final void d(int i10, View view) {
        Class[] clsArr;
        TextView nextTextView;
        boolean z10;
        boolean z11;
        String str;
        Field field;
        Object obj;
        if (view != null && (clsArr = this.e) != null) {
            for (int i11 = 0; i11 < clsArr.length; i11++) {
                Class cls = clsArr[i11];
                if (cls != null && cls.isInstance(view)) {
                    view.invalidate();
                    int i12 = this.f19522k;
                    int i13 = 262144 & i12;
                    String[] strArr = this.f19523l;
                    int i14 = this.f19518f;
                    if (i13 != 0 && !b(i14, view)) {
                        z10 = false;
                    } else {
                        view.invalidate();
                        if (strArr == null && (i12 & 32) != 0) {
                            Drawable background = view.getBackground();
                            if (background != null) {
                                if ((i12 & 16) != 0) {
                                    if (background instanceof qq) {
                                        Drawable drawable = ((qq) background).f27733a;
                                        if (drawable instanceof ColorDrawable) {
                                            ((ColorDrawable) drawable).setColor(i10);
                                        }
                                    }
                                } else {
                                    if (background instanceof qq) {
                                        background = ((qq) background).f27734b;
                                    } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                        if ((i12 & 65536) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        h6.B1(background, i10, z11);
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
                            } else if (view instanceof d8) {
                                for (int i15 = 0; i15 < 2; i15++) {
                                    d8 d8Var = (d8) view;
                                    if (i15 == 0) {
                                        nextTextView = d8Var.getTextView();
                                    } else {
                                        nextTextView = d8Var.getNextTextView();
                                    }
                                    if (nextTextView != null) {
                                        nextTextView.setTextColor(i10);
                                    }
                                }
                            }
                        } else if ((536870912 & i12) == 0) {
                            if ((i12 & 4096) != 0) {
                                view.setBackgroundDrawable(h6.K0(false));
                            } else if ((268435456 & i12) != 0) {
                                view.setBackgroundDrawable(h6.K0(true));
                            }
                        }
                        z10 = true;
                    }
                    if (strArr != null) {
                        if (i11 < strArr.length && (str = strArr[i11]) != null) {
                            String str2 = cls + "_" + str;
                            HashMap hashMap = this.f19525n;
                            if (hashMap == null || !hashMap.containsKey(str2)) {
                                HashMap hashMap2 = this.f19524m;
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
                    } else if (view instanceof n30) {
                        ((n30) view).c();
                    }
                }
            }
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        dl0 dl0Var;
        Drawable[] compoundDrawables;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f19518f;
        if (z11) {
            h6.u1(i11, i10, z10);
        }
        int i12 = this.f19516b;
        if (i12 > 0) {
            i10 = Color.argb(i12, Color.red(i10), Color.green(i10), Color.blue(i10));
        }
        Paint[] paintArr = this.f19517c;
        int i13 = this.f19522k;
        if (paintArr != null) {
            for (int i14 = 0; i14 < paintArr.length; i14++) {
                if ((i13 & 2) != 0) {
                    Paint paint = paintArr[i14];
                    if (paint instanceof TextPaint) {
                        ((TextPaint) paint).linkColor = i10;
                    }
                }
                paintArr[i14].setColor(i10);
            }
        }
        Drawable[] drawableArr = this.d;
        if (drawableArr != null) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    if (drawable instanceof f2) {
                        ((f2) drawable).a(i10);
                    } else if (drawable instanceof jm0) {
                        ((jm0) drawable).b(i10);
                    } else if (drawable instanceof ij0) {
                        String str = this.f19519g;
                        if (str != null) {
                            ((ij0) drawable).Q(i10, str);
                        }
                    } else if (drawable instanceof qq) {
                        if ((i13 & 32) != 0) {
                            ((qq) drawable).f27733a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((qq) drawable).f27734b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof h9) {
                        ((h9) drawable).h(i10);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.f21937a.setColor(i10);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.e;
        View view = this.f19515a;
        if (view != null && clsArr == null && this.f19523l == null && ((i13 & 262144) == 0 || b(i11, view))) {
            if ((i13 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof bb0) {
                    bb0 bb0Var = (bb0) background;
                    bb0Var.f22964a.setColor(i10);
                    bb0Var.f22965b = null;
                } else {
                    view.setBackgroundColor(i10);
                }
            }
            if ((i13 & 32) != 0) {
                if ((i13 & 2048) != 0) {
                    if (view instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) view).setErrorLineColor(i10);
                    }
                } else {
                    Drawable background2 = view.getBackground();
                    if (background2 instanceof qq) {
                        if ((i13 & 65536) != 0) {
                            background2 = ((qq) background2).f27733a;
                        } else {
                            background2 = ((qq) background2).f27734b;
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
                            if ((i13 & 65536) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            h6.B1(background2, i10, z14);
                        }
                    }
                }
            }
        }
        if (view instanceof k) {
            if ((i13 & 64) != 0) {
                ((k) view).B(i10, false);
            }
            if ((i13 & 128) != 0) {
                ((k) view).setTitleColor(i10);
            }
            if ((i13 & 256) != 0) {
                ((k) view).A(i10, false);
            }
            if ((4194304 & i13) != 0) {
                ((k) view).A(i10, true);
            }
            if ((i13 & 512) != 0) {
                ((k) view).B(i10, true);
            }
            if ((i13 & 1024) != 0) {
                ((k) view).setSubtitleColor(i10);
            }
            if ((1048576 & i13) != 0) {
                ((k) view).setActionModeColor(i10);
            }
            if ((2097152 & i13) != 0) {
                ((k) view).setActionModeTopColor(i10);
            }
            if ((67108864 & i13) != 0) {
                ((k) view).H(i10, true);
            }
            if ((134217728 & i13) != 0) {
                ((k) view).H(i10, false);
            }
            if ((1073741824 & i13) != 0) {
                k kVar = (k) view;
                if ((i13 & 8) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                kVar.F(i10, z13, false);
            }
            if ((Integer.MIN_VALUE & i13) != 0) {
                ((k) view).E(i10, false);
            }
        }
        if (view instanceof nz) {
            if ((i13 & 4) != 0) {
                ((nz) view).setTextColor(i10);
            } else if ((i13 & 2048) != 0) {
                ((nz) view).setProgressBarColor(i10);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        } else if (view instanceof x80) {
            if ((i13 & 2048) != 0) {
                ((x80) view).setProgressColor(i10);
            } else {
                ((x80) view).setBackColor(i10);
            }
        } else if (view instanceof uq) {
            ((uq) view).b();
        } else if ((view instanceof so0) && (i13 & 2048) != 0) {
            ((so0) view).setOuterColor(i10);
        }
        if ((i13 & 4) != 0 && ((i13 & 262144) == 0 || b(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof h5) {
                ((h5) view).setTextColor(i10);
            } else if (view instanceof go) {
                ((go) view).setTextColor(i10);
            }
        }
        if ((16777216 & i13) != 0 && (view instanceof EditTextBoldCursor)) {
            ((EditTextBoldCursor) view).setCursorColor(i10);
        }
        if ((8388608 & i13) != 0) {
            if (view instanceof EditTextBoldCursor) {
                if ((i13 & 2048) != 0) {
                    ((EditTextBoldCursor) view).setHeaderHintColor(i10);
                } else {
                    ((EditTextBoldCursor) view).setHintColor(i10);
                }
            } else if (view instanceof EditText) {
                ((EditText) view).setHintTextColor(i10);
            }
        }
        if ((i13 & 8) != 0 && ((262144 & i13) == 0 || b(i11, view))) {
            if (view instanceof ImageView) {
                if ((131072 & i13) != 0) {
                    Drawable drawable2 = ((ImageView) view).getDrawable();
                    if ((drawable2 instanceof StateListDrawable) || (drawable2 instanceof RippleDrawable)) {
                        if ((65536 & i13) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        h6.B1(drawable2, i10, z12);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof w9)) {
                if (view instanceof h5) {
                    ((h5) view).setSideDrawablesColor(i10);
                } else if ((view instanceof TextView) && (compoundDrawables = ((TextView) view).getCompoundDrawables()) != null) {
                    for (Drawable drawable3 : compoundDrawables) {
                        if (drawable3 != null) {
                            drawable3.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                }
            }
        }
        if ((view instanceof ScrollView) && (i13 & 32768) != 0) {
            AndroidUtilities.setScrollViewEdgeEffectColor((ScrollView) view, i10);
        }
        if ((view instanceof z4.g) && (i13 & 32768) != 0) {
            AndroidUtilities.setViewPagerEdgeEffectColor((z4.g) view, i10);
        }
        boolean z15 = view instanceof wl0;
        if (z15) {
            wl0 wl0Var = (wl0) view;
            if ((i13 & 4096) != 0) {
                wl0Var.setListSelectorColor(Integer.valueOf(i10));
            }
            if ((33554432 & i13) != 0 && (dl0Var = wl0Var.f30095f1) != null) {
                dl0Var.c();
            }
            if ((32768 & i13) != 0) {
                wl0Var.setGlowColor(i10);
            }
            if ((524288 & i13) != 0) {
                ArrayList<View> headers = wl0Var.getHeaders();
                if (headers != null) {
                    for (int i15 = 0; i15 < headers.size(); i15++) {
                        d(i10, headers.get(i15));
                    }
                }
                ArrayList<View> headersCache = wl0Var.getHeadersCache();
                if (headersCache != null) {
                    for (int i16 = 0; i16 < headersCache.size(); i16++) {
                        d(i10, headersCache.get(i16));
                    }
                }
                View pinnedHeader = wl0Var.getPinnedHeader();
                if (pinnedHeader != null) {
                    d(i10, pinnedHeader);
                }
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i13 & 4096) != 0) {
                view.setBackgroundDrawable(h6.K0(false));
            } else if ((268435456 & i13) != 0) {
                view.setBackgroundDrawable(h6.K0(true));
            }
        }
        if (clsArr != null) {
            if (z15) {
                wl0 wl0Var2 = (wl0) view;
                wl0Var2.getRecycledViewPool().a();
                int hiddenChildCount = wl0Var2.getHiddenChildCount();
                for (int i17 = 0; i17 < hiddenChildCount; i17++) {
                    d(i10, wl0Var2.V(i17));
                }
                int cachedChildCount = wl0Var2.getCachedChildCount();
                for (int i18 = 0; i18 < cachedChildCount; i18++) {
                    d(i10, wl0Var2.P(i18));
                }
                int attachedScrapChildCount = wl0Var2.getAttachedScrapChildCount();
                for (int i19 = 0; i19 < attachedScrapChildCount; i19++) {
                    d(i10, wl0Var2.O(i19));
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    d(i10, viewGroup.getChildAt(i20));
                }
            }
            d(i10, view);
        }
        i6 i6Var = this.h;
        if (i6Var != null) {
            i6Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public j6(View view, int i10, Class[] clsArr, Paint paint, Drawable[] drawableArr, i6 i6Var, int i11) {
        this.f19516b = -1;
        this.f19521j = new boolean[1];
        this.f19518f = i11;
        if (paint != null) {
            this.f19517c = new Paint[]{paint};
        }
        this.d = drawableArr;
        this.f19515a = view;
        this.f19522k = i10;
        this.e = clsArr;
        this.h = i6Var;
        if (view instanceof ku) {
            this.f19515a = ((ku) view).getEditText();
        }
    }

    public j6(View view, Class[] clsArr, ij0[] ij0VarArr, String str, int i10) {
        this.f19516b = -1;
        this.f19521j = new boolean[1];
        this.f19518f = i10;
        this.f19519g = str;
        this.d = ij0VarArr;
        this.f19515a = view;
        this.f19522k = 0;
        this.e = clsArr;
        if (view instanceof ku) {
            this.f19515a = ((ku) view).getEditText();
        }
    }

    public j6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, i6 i6Var, int i11) {
        this(view, i10, clsArr, strArr, paintArr, drawableArr, -1, i6Var, i11);
    }

    public j6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, int i11, i6 i6Var, int i12) {
        this.f19521j = new boolean[1];
        this.f19518f = i12;
        this.f19517c = paintArr;
        this.d = drawableArr;
        this.f19515a = view;
        this.f19522k = i10;
        this.e = clsArr;
        this.f19523l = strArr;
        this.f19516b = i11;
        this.h = i6Var;
        this.f19524m = new HashMap();
        this.f19525n = new HashMap();
        if (view instanceof ku) {
            this.f19515a = ((ku) view).getEditText();
        }
    }

    public j6(UndoView undoView, Class[] clsArr, String[] strArr, String str, int i10) {
        this.f19516b = -1;
        this.f19521j = new boolean[1];
        this.f19518f = i10;
        this.f19519g = str;
        this.f19515a = undoView;
        this.f19522k = 0;
        this.e = clsArr;
        this.f19523l = strArr;
        this.f19524m = new HashMap();
        this.f19525n = new HashMap();
    }
}
