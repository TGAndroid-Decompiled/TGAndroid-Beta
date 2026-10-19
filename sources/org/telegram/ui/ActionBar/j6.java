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
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.zq;
public final class j6 {
    public final View f21453a;
    public final int f21454b;
    public final Paint[] f21455c;
    public final Drawable[] d;
    public final Class[] e;
    public final int f21456f;
    public final String f21457g;
    public i6 h;
    public int f21458i;
    public final boolean[] f21459j;
    public final int f21460k;
    public final String[] f21461l;
    public final HashMap f21462m;
    public final HashMap f21463n;
    public d6 f21464o;

    public j6(View view, int i10, Class[] clsArr, Paint[] paintArr, int i11) {
        this.f21454b = -1;
        this.f21459j = new boolean[1];
        this.f21456f = i11;
        this.f21455c = paintArr;
        this.d = null;
        this.f21453a = view;
        this.f21460k = i10;
        this.e = clsArr;
        this.h = null;
        if (view instanceof qu) {
            this.f21453a = ((qu) view).getEditText();
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
        String str = this.f21457g;
        if (str != null && (obj instanceof xj0)) {
            ((xj0) obj).h(i10, str);
        }
        int i11 = this.f21460k;
        if ((131072 & i11) != 0 && z10) {
            obj = ((View) obj).getBackground();
        }
        Drawable drawable4 = null;
        if ((i11 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (background instanceof kb0) {
                kb0 kb0Var = (kb0) background;
                kb0Var.f27801a.setColor(i10);
                kb0Var.f27802b = null;
                return;
            }
            view2.setBackgroundColor(i10);
        } else if (obj instanceof iu) {
            if ((8388608 & i11) != 0) {
                iu iuVar = (iu) obj;
                iuVar.setHintColor(i10);
                iuVar.setHintTextColor(i10);
            } else if ((16777216 & i11) != 0) {
                ((iu) obj).setCursorColor(i10);
            } else {
                ((iu) obj).setTextColor(i10);
            }
        } else if (obj instanceof j5) {
            if ((i11 & 2) != 0) {
                ((j5) obj).setLinkTextColor(i10);
            } else {
                ((j5) obj).setTextColor(i10);
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
                        d61[] d61VarArr = (d61[]) spannedString.getSpans(0, spannedString.length(), d61.class);
                        if (d61VarArr != null && d61VarArr.length > 0) {
                            for (d61 d61Var : d61VarArr) {
                                d61Var.f25430b = i10;
                            }
                        }
                    }
                } else {
                    textView.setTextColor(i10);
                }
            } else if (obj instanceof ImageView) {
                ImageView imageView = (ImageView) obj;
                Drawable drawable6 = imageView.getDrawable();
                if (drawable6 instanceof zq) {
                    if ((i11 & 32) != 0) {
                        drawable3 = ((zq) drawable6).f33016a;
                    } else {
                        drawable3 = ((zq) drawable6).f33017b;
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
                if (drawable4 instanceof zq) {
                    if ((i11 & 32) != 0) {
                        drawable2 = ((zq) drawable4).f33016a;
                    } else {
                        drawable2 = ((zq) drawable4).f33017b;
                    }
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                } else if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (obj instanceof Drawable) {
                if (obj instanceof f90) {
                    if ((i11 & 32) != 0) {
                        f90.f26158j.setColor(i10);
                    } else {
                        ((f90) obj).h.setColor(i10);
                    }
                } else if (obj instanceof zq) {
                    if ((i11 & 32) != 0) {
                        drawable = ((zq) obj).f33016a;
                    } else {
                        drawable = ((zq) obj).f33017b;
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
                    h6.C1(drawable7, i10, z11);
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
                } else if (obj instanceof g90) {
                    if ((i11 & 2048) != 0) {
                        ((g90) obj).setProgressColor(i10);
                    } else {
                        ((g90) obj).setBackColor(i10);
                    }
                } else if (obj instanceof RadialProgressView) {
                    ((RadialProgressView) obj).setProgressColor(i10);
                } else if (obj instanceof Paint) {
                    ((Paint) obj).setColor(i10);
                    view.invalidate();
                } else if (obj instanceof cp0) {
                    if ((i11 & 2048) != 0) {
                        ((cp0) obj).setOuterColor(i10);
                    } else {
                        ((cp0) obj).setInnerColor(i10);
                    }
                } else if (obj instanceof e8) {
                    if ((i11 & 33554432) != 0) {
                        for (int i12 = 0; i12 < 2; i12++) {
                            e8 e8Var = (e8) obj;
                            if (i12 == 0) {
                                nextTextView2 = e8Var.getTextView();
                            } else {
                                nextTextView2 = e8Var.getNextTextView();
                            }
                            if (nextTextView2 != null) {
                                CharSequence text2 = nextTextView2.getText();
                                if (text2 instanceof SpannedString) {
                                    SpannedString spannedString2 = (SpannedString) text2;
                                    d61[] d61VarArr2 = (d61[]) spannedString2.getSpans(0, spannedString2.length(), d61.class);
                                    if (d61VarArr2 != null && d61VarArr2.length > 0) {
                                        for (d61 d61Var2 : d61VarArr2) {
                                            d61Var2.f25430b = i10;
                                        }
                                    }
                                }
                            }
                        }
                    } else if ((i11 & 4) != 0) {
                        if ((262144 & i11) == 0 || b(this.f21456f, (View) obj)) {
                            for (int i13 = 0; i13 < 2; i13++) {
                                e8 e8Var2 = (e8) obj;
                                if (i13 == 0) {
                                    nextTextView = e8Var2.getTextView();
                                } else {
                                    nextTextView = e8Var2.getNextTextView();
                                }
                                if (nextTextView != null) {
                                    nextTextView.setTextColor(i10);
                                    CharSequence text3 = nextTextView.getText();
                                    if (text3 instanceof SpannedString) {
                                        SpannedString spannedString3 = (SpannedString) text3;
                                        d61[] d61VarArr3 = (d61[]) spannedString3.getSpans(0, spannedString3.length(), d61.class);
                                        if (d61VarArr3 != null && d61VarArr3.length > 0) {
                                            for (d61 d61Var3 : d61VarArr3) {
                                                d61Var3.f25430b = i10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int i14 = GroupCreateCheckBox.f24244b;
                h6.v0(0);
                throw null;
            }
        }
    }

    public final int c() {
        Integer num;
        d6 d6Var = this.f21464o;
        int i10 = this.f21456f;
        if (d6Var != null) {
            num = Integer.valueOf(d6Var.w(i10));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return h6.x0(null, i10, false);
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
                    int i12 = this.f21460k;
                    int i13 = 262144 & i12;
                    String[] strArr = this.f21461l;
                    int i14 = this.f21456f;
                    if (i13 != 0 && !b(i14, view)) {
                        z10 = false;
                    } else {
                        view.invalidate();
                        if (strArr == null && (i12 & 32) != 0) {
                            Drawable background = view.getBackground();
                            if (background != null) {
                                if ((i12 & 16) != 0) {
                                    if (background instanceof zq) {
                                        Drawable drawable = ((zq) background).f33016a;
                                        if (drawable instanceof ColorDrawable) {
                                            ((ColorDrawable) drawable).setColor(i10);
                                        }
                                    }
                                } else {
                                    if (background instanceof zq) {
                                        background = ((zq) background).f33017b;
                                    } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                        if ((i12 & 65536) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        h6.C1(background, i10, z11);
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
                            } else if (view instanceof e8) {
                                for (int i15 = 0; i15 < 2; i15++) {
                                    e8 e8Var = (e8) view;
                                    if (i15 == 0) {
                                        nextTextView = e8Var.getTextView();
                                    } else {
                                        nextTextView = e8Var.getNextTextView();
                                    }
                                    if (nextTextView != null) {
                                        nextTextView.setTextColor(i10);
                                    }
                                }
                            }
                        } else if ((536870912 & i12) == 0) {
                            if ((i12 & 4096) != 0) {
                                view.setBackgroundDrawable(h6.L0(false));
                            } else if ((268435456 & i12) != 0) {
                                view.setBackgroundDrawable(h6.L0(true));
                            }
                        }
                        z10 = true;
                    }
                    if (strArr != null) {
                        if (i11 < strArr.length && (str = strArr[i11]) != null) {
                            String str2 = cls + "_" + str;
                            HashMap hashMap = this.f21463n;
                            if (hashMap == null || !hashMap.containsKey(str2)) {
                                HashMap hashMap2 = this.f21462m;
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
                    } else if (view instanceof v30) {
                        ((v30) view).c();
                    }
                }
            }
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        pl0 pl0Var;
        Drawable[] compoundDrawables;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f21456f;
        if (z11) {
            h6.v1(i11, i10, z10);
        }
        int i12 = this.f21454b;
        if (i12 > 0) {
            i10 = Color.argb(i12, Color.red(i10), Color.green(i10), Color.blue(i10));
        }
        Paint[] paintArr = this.f21455c;
        int i13 = this.f21460k;
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
                    } else if (drawable instanceof vm0) {
                        ((vm0) drawable).b(i10);
                    } else if (drawable instanceof uj0) {
                        String str = this.f21457g;
                        if (str != null) {
                            ((uj0) drawable).Q(i10, str);
                        }
                    } else if (drawable instanceof zq) {
                        if ((i13 & 32) != 0) {
                            ((zq) drawable).f33016a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((zq) drawable).f33017b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof h9) {
                        ((h9) drawable).h(i10);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.f23889a.setColor(i10);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.e;
        View view = this.f21453a;
        if (view != null && clsArr == null && this.f21461l == null && ((i13 & 262144) == 0 || b(i11, view))) {
            if ((i13 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof kb0) {
                    kb0 kb0Var = (kb0) background;
                    kb0Var.f27801a.setColor(i10);
                    kb0Var.f27802b = null;
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
                    if (background2 instanceof zq) {
                        if ((i13 & 65536) != 0) {
                            background2 = ((zq) background2).f33016a;
                        } else {
                            background2 = ((zq) background2).f33017b;
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
                            h6.C1(background2, i10, z14);
                        }
                    }
                }
            }
        }
        if (view instanceof k) {
            if ((i13 & 64) != 0) {
                ((k) view).C(i10, false);
            }
            if ((i13 & 128) != 0) {
                ((k) view).setTitleColor(i10);
            }
            if ((i13 & 256) != 0) {
                ((k) view).B(i10, false);
            }
            if ((4194304 & i13) != 0) {
                ((k) view).B(i10, true);
            }
            if ((i13 & 512) != 0) {
                ((k) view).C(i10, true);
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
                ((k) view).G(i10, true);
            }
            if ((134217728 & i13) != 0) {
                ((k) view).G(i10, false);
            }
            if ((1073741824 & i13) != 0) {
                k kVar = (k) view;
                if ((i13 & 8) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                kVar.E(i10, z13, false);
            }
            if ((Integer.MIN_VALUE & i13) != 0) {
                ((k) view).D(i10, false);
            }
        }
        if (view instanceof vz) {
            if ((i13 & 4) != 0) {
                ((vz) view).setTextColor(i10);
            } else if ((i13 & 2048) != 0) {
                ((vz) view).setProgressBarColor(i10);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        } else if (view instanceof g90) {
            if ((i13 & 2048) != 0) {
                ((g90) view).setProgressColor(i10);
            } else {
                ((g90) view).setBackColor(i10);
            }
        } else if (view instanceof dr) {
            ((dr) view).b();
        } else if ((view instanceof cp0) && (i13 & 2048) != 0) {
            ((cp0) view).setOuterColor(i10);
        }
        if ((i13 & 4) != 0 && ((i13 & 262144) == 0 || b(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof j5) {
                ((j5) view).setTextColor(i10);
            } else if (view instanceof po) {
                ((po) view).setTextColor(i10);
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
                        h6.C1(drawable2, i10, z12);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof w9)) {
                if (view instanceof j5) {
                    ((j5) view).setSideDrawablesColor(i10);
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
        boolean z15 = view instanceof im0;
        if (z15) {
            im0 im0Var = (im0) view;
            if ((i13 & 4096) != 0) {
                im0Var.setListSelectorColor(Integer.valueOf(i10));
            }
            if ((33554432 & i13) != 0 && (pl0Var = im0Var.f27279d1) != null) {
                pl0Var.c();
            }
            if ((32768 & i13) != 0) {
                im0Var.setGlowColor(i10);
            }
            if ((524288 & i13) != 0) {
                ArrayList<View> headers = im0Var.getHeaders();
                if (headers != null) {
                    for (int i15 = 0; i15 < headers.size(); i15++) {
                        d(i10, headers.get(i15));
                    }
                }
                ArrayList<View> headersCache = im0Var.getHeadersCache();
                if (headersCache != null) {
                    for (int i16 = 0; i16 < headersCache.size(); i16++) {
                        d(i10, headersCache.get(i16));
                    }
                }
                View pinnedHeader = im0Var.getPinnedHeader();
                if (pinnedHeader != null) {
                    d(i10, pinnedHeader);
                }
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i13 & 4096) != 0) {
                view.setBackgroundDrawable(h6.L0(false));
            } else if ((268435456 & i13) != 0) {
                view.setBackgroundDrawable(h6.L0(true));
            }
        }
        if (clsArr != null) {
            if (z15) {
                im0 im0Var2 = (im0) view;
                im0Var2.getRecycledViewPool().a();
                int hiddenChildCount = im0Var2.getHiddenChildCount();
                for (int i17 = 0; i17 < hiddenChildCount; i17++) {
                    d(i10, im0Var2.V(i17));
                }
                int cachedChildCount = im0Var2.getCachedChildCount();
                for (int i18 = 0; i18 < cachedChildCount; i18++) {
                    d(i10, im0Var2.P(i18));
                }
                int attachedScrapChildCount = im0Var2.getAttachedScrapChildCount();
                for (int i19 = 0; i19 < attachedScrapChildCount; i19++) {
                    d(i10, im0Var2.O(i19));
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
        this.f21454b = -1;
        this.f21459j = new boolean[1];
        this.f21456f = i11;
        if (paint != null) {
            this.f21455c = new Paint[]{paint};
        }
        this.d = drawableArr;
        this.f21453a = view;
        this.f21460k = i10;
        this.e = clsArr;
        this.h = i6Var;
        if (view instanceof qu) {
            this.f21453a = ((qu) view).getEditText();
        }
    }

    public j6(View view, Class[] clsArr, uj0[] uj0VarArr, String str, int i10) {
        this.f21454b = -1;
        this.f21459j = new boolean[1];
        this.f21456f = i10;
        this.f21457g = str;
        this.d = uj0VarArr;
        this.f21453a = view;
        this.f21460k = 0;
        this.e = clsArr;
        if (view instanceof qu) {
            this.f21453a = ((qu) view).getEditText();
        }
    }

    public j6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, i6 i6Var, int i11) {
        this(view, i10, clsArr, strArr, paintArr, drawableArr, -1, i6Var, i11);
    }

    public j6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, int i11, i6 i6Var, int i12) {
        this.f21459j = new boolean[1];
        this.f21456f = i12;
        this.f21455c = paintArr;
        this.d = drawableArr;
        this.f21453a = view;
        this.f21460k = i10;
        this.e = clsArr;
        this.f21461l = strArr;
        this.f21454b = i11;
        this.h = i6Var;
        this.f21462m = new HashMap();
        this.f21463n = new HashMap();
        if (view instanceof qu) {
            this.f21453a = ((qu) view).getEditText();
        }
    }

    public j6(UndoView undoView, Class[] clsArr, String[] strArr, String str, int i10) {
        this.f21454b = -1;
        this.f21459j = new boolean[1];
        this.f21456f = i10;
        this.f21457g = str;
        this.f21453a = undoView;
        this.f21460k = 0;
        this.e = clsArr;
        this.f21461l = strArr;
        this.f21462m = new HashMap();
        this.f21463n = new HashMap();
    }
}
