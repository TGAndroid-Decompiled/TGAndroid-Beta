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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.Components.yl0;
public final class j6 {
    public final View f19255a;
    public final int f19256b;
    public final Paint[] f19257c;
    public final Drawable[] d;
    public final Class[] e;
    public final int f19258f;
    public final String f19259g;
    public i6 h;
    public int f19260i;
    public final boolean[] f19261j;
    public final int f19262k;
    public final String[] f19263l;
    public final HashMap f19264m;
    public final HashMap f19265n;
    public d6 f19266o;

    public j6(View view, int i10, Class[] clsArr, Paint[] paintArr, int i11) {
        this.f19256b = -1;
        this.f19261j = new boolean[1];
        this.f19258f = i11;
        this.f19257c = paintArr;
        this.d = null;
        this.f19255a = view;
        this.f19262k = i10;
        this.e = clsArr;
        this.h = null;
        if (view instanceof ku) {
            this.f19255a = ((ku) view).getEditText();
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
        String str = this.f19259g;
        if (str != null && (obj instanceof bj0)) {
            ((bj0) obj).h(i10, str);
        }
        int i11 = this.f19262k;
        if ((131072 & i11) != 0 && z10) {
            obj = ((View) obj).getBackground();
        }
        Drawable drawable4 = null;
        if ((i11 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (background instanceof qa0) {
                qa0 qa0Var = (qa0) background;
                qa0Var.f27288a.setColor(i10);
                qa0Var.f27289b = null;
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
        } else if (obj instanceof i5) {
            if ((i11 & 2) != 0) {
                ((i5) obj).setLinkTextColor(i10);
            } else {
                ((i5) obj).setTextColor(i10);
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
                        e51[] e51VarArr = (e51[]) spannedString.getSpans(0, spannedString.length(), e51.class);
                        if (e51VarArr != null && e51VarArr.length > 0) {
                            for (e51 e51Var : e51VarArr) {
                                e51Var.f23571b = i10;
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
                        drawable3 = ((qq) drawable6).f27424a;
                    } else {
                        drawable3 = ((qq) drawable6).f27425b;
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
                        drawable2 = ((qq) drawable4).f27424a;
                    } else {
                        drawable2 = ((qq) drawable4).f27425b;
                    }
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                } else if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (obj instanceof Drawable) {
                if (obj instanceof m80) {
                    if ((i11 & 32) != 0) {
                        m80.f26131j.setColor(i10);
                    } else {
                        ((m80) obj).h.setColor(i10);
                    }
                } else if (obj instanceof qq) {
                    if ((i11 & 32) != 0) {
                        drawable = ((qq) obj).f27424a;
                    } else {
                        drawable = ((qq) obj).f27425b;
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
                } else if (obj instanceof n80) {
                    if ((i11 & 2048) != 0) {
                        ((n80) obj).setProgressColor(i10);
                    } else {
                        ((n80) obj).setBackColor(i10);
                    }
                } else if (obj instanceof RadialProgressView) {
                    ((RadialProgressView) obj).setProgressColor(i10);
                } else if (obj instanceof Paint) {
                    ((Paint) obj).setColor(i10);
                    view.invalidate();
                } else if (obj instanceof fo0) {
                    if ((i11 & 2048) != 0) {
                        ((fo0) obj).setOuterColor(i10);
                    } else {
                        ((fo0) obj).setInnerColor(i10);
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
                                    e51[] e51VarArr2 = (e51[]) spannedString2.getSpans(0, spannedString2.length(), e51.class);
                                    if (e51VarArr2 != null && e51VarArr2.length > 0) {
                                        for (e51 e51Var2 : e51VarArr2) {
                                            e51Var2.f23571b = i10;
                                        }
                                    }
                                }
                            }
                        }
                    } else if ((i11 & 4) != 0) {
                        if ((262144 & i11) == 0 || b(this.f19258f, (View) obj)) {
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
                                        e51[] e51VarArr3 = (e51[]) spannedString3.getSpans(0, spannedString3.length(), e51.class);
                                        if (e51VarArr3 != null && e51VarArr3.length > 0) {
                                            for (e51 e51Var3 : e51VarArr3) {
                                                e51Var3.f23571b = i10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int i14 = GroupCreateCheckBox.f22039b;
                h6.u0(0);
                throw null;
            }
        }
    }

    public final int c() {
        Integer num;
        d6 d6Var = this.f19266o;
        int i10 = this.f19258f;
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
                    int i12 = this.f19262k;
                    int i13 = 262144 & i12;
                    String[] strArr = this.f19263l;
                    int i14 = this.f19258f;
                    if (i13 != 0 && !b(i14, view)) {
                        z10 = false;
                    } else {
                        view.invalidate();
                        if (strArr == null && (i12 & 32) != 0) {
                            Drawable background = view.getBackground();
                            if (background != null) {
                                if ((i12 & 16) != 0) {
                                    if (background instanceof qq) {
                                        Drawable drawable = ((qq) background).f27424a;
                                        if (drawable instanceof ColorDrawable) {
                                            ((ColorDrawable) drawable).setColor(i10);
                                        }
                                    }
                                } else {
                                    if (background instanceof qq) {
                                        background = ((qq) background).f27425b;
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
                            HashMap hashMap = this.f19265n;
                            if (hashMap == null || !hashMap.containsKey(str2)) {
                                HashMap hashMap2 = this.f19264m;
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
        tk0 tk0Var;
        Drawable[] compoundDrawables;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f19258f;
        if (z11) {
            h6.u1(i11, i10, z10);
        }
        int i12 = this.f19256b;
        if (i12 > 0) {
            i10 = Color.argb(i12, Color.red(i10), Color.green(i10), Color.blue(i10));
        }
        Paint[] paintArr = this.f19257c;
        int i13 = this.f19262k;
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
                    if (drawable instanceof g2) {
                        ((g2) drawable).a(i10);
                    } else if (drawable instanceof yl0) {
                        ((yl0) drawable).b(i10);
                    } else if (drawable instanceof yi0) {
                        String str = this.f19259g;
                        if (str != null) {
                            ((yi0) drawable).Q(i10, str);
                        }
                    } else if (drawable instanceof qq) {
                        if ((i13 & 32) != 0) {
                            ((qq) drawable).f27424a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((qq) drawable).f27425b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof h9) {
                        ((h9) drawable).h(i10);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.f21685a.setColor(i10);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.e;
        View view = this.f19255a;
        if (view != null && clsArr == null && this.f19263l == null && ((i13 & 262144) == 0 || b(i11, view))) {
            if ((i13 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof qa0) {
                    qa0 qa0Var = (qa0) background;
                    qa0Var.f27288a.setColor(i10);
                    qa0Var.f27289b = null;
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
                            background2 = ((qq) background2).f27424a;
                        } else {
                            background2 = ((qq) background2).f27425b;
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
        } else if (view instanceof n80) {
            if ((i13 & 2048) != 0) {
                ((n80) view).setProgressColor(i10);
            } else {
                ((n80) view).setBackColor(i10);
            }
        } else if (view instanceof uq) {
            ((uq) view).b();
        } else if ((view instanceof fo0) && (i13 & 2048) != 0) {
            ((fo0) view).setOuterColor(i10);
        }
        if ((i13 & 4) != 0 && ((i13 & 262144) == 0 || b(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof i5) {
                ((i5) view).setTextColor(i10);
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
                if (view instanceof i5) {
                    ((i5) view).setSideDrawablesColor(i10);
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
        boolean z15 = view instanceof ml0;
        if (z15) {
            ml0 ml0Var = (ml0) view;
            if ((i13 & 4096) != 0) {
                ml0Var.setListSelectorColor(Integer.valueOf(i10));
            }
            if ((33554432 & i13) != 0 && (tk0Var = ml0Var.f26202f1) != null) {
                tk0Var.c();
            }
            if ((32768 & i13) != 0) {
                ml0Var.setGlowColor(i10);
            }
            if ((524288 & i13) != 0) {
                ArrayList<View> headers = ml0Var.getHeaders();
                if (headers != null) {
                    for (int i15 = 0; i15 < headers.size(); i15++) {
                        d(i10, headers.get(i15));
                    }
                }
                ArrayList<View> headersCache = ml0Var.getHeadersCache();
                if (headersCache != null) {
                    for (int i16 = 0; i16 < headersCache.size(); i16++) {
                        d(i10, headersCache.get(i16));
                    }
                }
                View pinnedHeader = ml0Var.getPinnedHeader();
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
                ml0 ml0Var2 = (ml0) view;
                ml0Var2.getRecycledViewPool().a();
                int hiddenChildCount = ml0Var2.getHiddenChildCount();
                for (int i17 = 0; i17 < hiddenChildCount; i17++) {
                    d(i10, ml0Var2.V(i17));
                }
                int cachedChildCount = ml0Var2.getCachedChildCount();
                for (int i18 = 0; i18 < cachedChildCount; i18++) {
                    d(i10, ml0Var2.P(i18));
                }
                int attachedScrapChildCount = ml0Var2.getAttachedScrapChildCount();
                for (int i19 = 0; i19 < attachedScrapChildCount; i19++) {
                    d(i10, ml0Var2.O(i19));
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
        this.f19256b = -1;
        this.f19261j = new boolean[1];
        this.f19258f = i11;
        if (paint != null) {
            this.f19257c = new Paint[]{paint};
        }
        this.d = drawableArr;
        this.f19255a = view;
        this.f19262k = i10;
        this.e = clsArr;
        this.h = i6Var;
        if (view instanceof ku) {
            this.f19255a = ((ku) view).getEditText();
        }
    }

    public j6(View view, Class[] clsArr, yi0[] yi0VarArr, String str, int i10) {
        this.f19256b = -1;
        this.f19261j = new boolean[1];
        this.f19258f = i10;
        this.f19259g = str;
        this.d = yi0VarArr;
        this.f19255a = view;
        this.f19262k = 0;
        this.e = clsArr;
        if (view instanceof ku) {
            this.f19255a = ((ku) view).getEditText();
        }
    }

    public j6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, i6 i6Var, int i11) {
        this(view, i10, clsArr, strArr, paintArr, drawableArr, -1, i6Var, i11);
    }

    public j6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, int i11, i6 i6Var, int i12) {
        this.f19261j = new boolean[1];
        this.f19258f = i12;
        this.f19257c = paintArr;
        this.d = drawableArr;
        this.f19255a = view;
        this.f19262k = i10;
        this.e = clsArr;
        this.f19263l = strArr;
        this.f19256b = i11;
        this.h = i6Var;
        this.f19264m = new HashMap();
        this.f19265n = new HashMap();
        if (view instanceof ku) {
            this.f19255a = ((ku) view).getEditText();
        }
    }

    public j6(UndoView undoView, Class[] clsArr, String[] strArr, String str, int i10) {
        this.f19256b = -1;
        this.f19261j = new boolean[1];
        this.f19258f = i10;
        this.f19259g = str;
        this.f19255a = undoView;
        this.f19262k = 0;
        this.e = clsArr;
        this.f19263l = strArr;
        this.f19264m = new HashMap();
        this.f19265n = new HashMap();
    }
}
