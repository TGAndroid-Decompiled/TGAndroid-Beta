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
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.yl0;
public final class k6 {
    public final View f21345a;
    public final int f21346b;
    public final Paint[] f21347c;
    public final Drawable[] d;
    public final Class[] f21348e;
    public final int f21349f;
    public final String f21350g;
    public j6 h;
    public int f21351i;
    public final boolean[] f21352j;
    public final int f21353k;
    public final String[] f21354l;
    public final HashMap f21355m;
    public final HashMap f21356n;
    public e6 f21357o;

    public k6(View view, int i10, Class[] clsArr, Paint[] paintArr, int i11) {
        this.f21346b = -1;
        this.f21352j = new boolean[1];
        this.f21349f = i11;
        this.f21347c = paintArr;
        this.d = null;
        this.f21345a = view;
        this.f21353k = i10;
        this.f21348e = clsArr;
        this.h = null;
        if (view instanceof av) {
            this.f21345a = ((av) view).getEditText();
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
        String str = this.f21350g;
        if (str != null && (obj instanceof gk0)) {
            ((gk0) obj).h(i10, str);
        }
        int i11 = this.f21353k;
        if ((131072 & i11) != 0 && z10) {
            obj = ((View) obj).getBackground();
        }
        Drawable drawable4 = null;
        if ((i11 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (background instanceof sb0) {
                sb0 sb0Var = (sb0) background;
                sb0Var.f30744a.setColor(i10);
                sb0Var.f30745b = null;
                return;
            }
            view2.setBackgroundColor(i10);
        } else if (obj instanceof su) {
            if ((8388608 & i11) != 0) {
                su suVar = (su) obj;
                suVar.setHintColor(i10);
                suVar.setHintTextColor(i10);
            } else if ((16777216 & i11) != 0) {
                ((su) obj).setCursorColor(i10);
            } else {
                ((su) obj).setTextColor(i10);
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
                        n61[] n61VarArr = (n61[]) spannedString.getSpans(0, spannedString.length(), n61.class);
                        if (n61VarArr != null && n61VarArr.length > 0) {
                            for (n61 n61Var : n61VarArr) {
                                n61Var.f29017b = i10;
                            }
                        }
                    }
                } else {
                    textView.setTextColor(i10);
                }
            } else if (obj instanceof ImageView) {
                ImageView imageView = (ImageView) obj;
                Drawable drawable6 = imageView.getDrawable();
                if (drawable6 instanceof fr) {
                    if ((i11 & 32) != 0) {
                        drawable3 = ((fr) drawable6).f26495a;
                    } else {
                        drawable3 = ((fr) drawable6).f26496b;
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
                if (drawable4 instanceof fr) {
                    if ((i11 & 32) != 0) {
                        drawable2 = ((fr) drawable4).f26495a;
                    } else {
                        drawable2 = ((fr) drawable4).f26496b;
                    }
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                } else if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (obj instanceof Drawable) {
                if (obj instanceof o90) {
                    if ((i11 & 32) != 0) {
                        o90.f29388j.setColor(i10);
                    } else {
                        ((o90) obj).h.setColor(i10);
                    }
                } else if (obj instanceof fr) {
                    if ((i11 & 32) != 0) {
                        drawable = ((fr) obj).f26495a;
                    } else {
                        drawable = ((fr) obj).f26496b;
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
                    i6.C1(drawable7, i10, z11);
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
                } else if (obj instanceof p90) {
                    if ((i11 & 2048) != 0) {
                        ((p90) obj).setProgressColor(i10);
                    } else {
                        ((p90) obj).setBackColor(i10);
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
                } else if (obj instanceof f8) {
                    if ((i11 & 33554432) != 0) {
                        for (int i12 = 0; i12 < 2; i12++) {
                            f8 f8Var = (f8) obj;
                            if (i12 == 0) {
                                nextTextView2 = f8Var.getTextView();
                            } else {
                                nextTextView2 = f8Var.getNextTextView();
                            }
                            if (nextTextView2 != null) {
                                CharSequence text2 = nextTextView2.getText();
                                if (text2 instanceof SpannedString) {
                                    SpannedString spannedString2 = (SpannedString) text2;
                                    n61[] n61VarArr2 = (n61[]) spannedString2.getSpans(0, spannedString2.length(), n61.class);
                                    if (n61VarArr2 != null && n61VarArr2.length > 0) {
                                        for (n61 n61Var2 : n61VarArr2) {
                                            n61Var2.f29017b = i10;
                                        }
                                    }
                                }
                            }
                        }
                    } else if ((i11 & 4) != 0) {
                        if ((262144 & i11) == 0 || b(this.f21349f, (View) obj)) {
                            for (int i13 = 0; i13 < 2; i13++) {
                                f8 f8Var2 = (f8) obj;
                                if (i13 == 0) {
                                    nextTextView = f8Var2.getTextView();
                                } else {
                                    nextTextView = f8Var2.getNextTextView();
                                }
                                if (nextTextView != null) {
                                    nextTextView.setTextColor(i10);
                                    CharSequence text3 = nextTextView.getText();
                                    if (text3 instanceof SpannedString) {
                                        SpannedString spannedString3 = (SpannedString) text3;
                                        n61[] n61VarArr3 = (n61[]) spannedString3.getSpans(0, spannedString3.length(), n61.class);
                                        if (n61VarArr3 != null && n61VarArr3.length > 0) {
                                            for (n61 n61Var3 : n61VarArr3) {
                                                n61Var3.f29017b = i10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int i14 = GroupCreateCheckBox.f24202b;
                i6.v0(0);
                throw null;
            }
        }
    }

    public final int c() {
        Integer num;
        e6 e6Var = this.f21357o;
        int i10 = this.f21349f;
        if (e6Var != null) {
            num = Integer.valueOf(e6Var.x0(i10));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i6.x0(null, i10, false);
    }

    public final void d(int i10, View view) {
        Class[] clsArr;
        TextView nextTextView;
        boolean z10;
        boolean z11;
        String str;
        Field field;
        Object obj;
        if (view != null && (clsArr = this.f21348e) != null) {
            for (int i11 = 0; i11 < clsArr.length; i11++) {
                Class cls = clsArr[i11];
                if (cls != null && cls.isInstance(view)) {
                    view.invalidate();
                    int i12 = this.f21353k;
                    int i13 = 262144 & i12;
                    String[] strArr = this.f21354l;
                    int i14 = this.f21349f;
                    if (i13 != 0 && !b(i14, view)) {
                        z10 = false;
                    } else {
                        view.invalidate();
                        if (strArr == null && (i12 & 32) != 0) {
                            Drawable background = view.getBackground();
                            if (background != null) {
                                if ((i12 & 16) != 0) {
                                    if (background instanceof fr) {
                                        Drawable drawable = ((fr) background).f26495a;
                                        if (drawable instanceof ColorDrawable) {
                                            ((ColorDrawable) drawable).setColor(i10);
                                        }
                                    }
                                } else {
                                    if (background instanceof fr) {
                                        background = ((fr) background).f26496b;
                                    } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                        if ((i12 & 65536) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        i6.C1(background, i10, z11);
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
                            } else if (view instanceof f8) {
                                for (int i15 = 0; i15 < 2; i15++) {
                                    f8 f8Var = (f8) view;
                                    if (i15 == 0) {
                                        nextTextView = f8Var.getTextView();
                                    } else {
                                        nextTextView = f8Var.getNextTextView();
                                    }
                                    if (nextTextView != null) {
                                        nextTextView.setTextColor(i10);
                                    }
                                }
                            }
                        } else if ((536870912 & i12) == 0) {
                            if ((i12 & 4096) != 0) {
                                view.setBackgroundDrawable(i6.L0(false));
                            } else if ((268435456 & i12) != 0) {
                                view.setBackgroundDrawable(i6.L0(true));
                            }
                        }
                        z10 = true;
                    }
                    if (strArr != null) {
                        if (i11 < strArr.length && (str = strArr[i11]) != null) {
                            String str2 = cls + "_" + str;
                            HashMap hashMap = this.f21356n;
                            if (hashMap == null || !hashMap.containsKey(str2)) {
                                HashMap hashMap2 = this.f21355m;
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
                    } else if (view instanceof e40) {
                        ((e40) view).c();
                    }
                }
            }
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        yl0 yl0Var;
        Drawable[] compoundDrawables;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f21349f;
        if (z11) {
            i6.v1(i11, i10, z10);
        }
        int i12 = this.f21346b;
        if (i12 > 0) {
            i10 = Color.argb(i12, Color.red(i10), Color.green(i10), Color.blue(i10));
        }
        Paint[] paintArr = this.f21347c;
        int i13 = this.f21353k;
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
                    } else if (drawable instanceof en0) {
                        ((en0) drawable).b(i10);
                    } else if (drawable instanceof dk0) {
                        String str = this.f21350g;
                        if (str != null) {
                            ((dk0) drawable).Q(i10, str);
                        }
                    } else if (drawable instanceof fr) {
                        if ((i13 & 32) != 0) {
                            ((fr) drawable).f26495a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((fr) drawable).f26496b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof j9) {
                        ((j9) drawable).h(i10);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.f23836a.setColor(i10);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.f21348e;
        View view = this.f21345a;
        if (view != null && clsArr == null && this.f21354l == null && ((i13 & 262144) == 0 || b(i11, view))) {
            if ((i13 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof sb0) {
                    sb0 sb0Var = (sb0) background;
                    sb0Var.f30744a.setColor(i10);
                    sb0Var.f30745b = null;
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
                    if (background2 instanceof fr) {
                        if ((i13 & 65536) != 0) {
                            background2 = ((fr) background2).f26495a;
                        } else {
                            background2 = ((fr) background2).f26496b;
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
                            i6.C1(background2, i10, z14);
                        }
                    }
                }
            }
        }
        if (view instanceof k) {
            if ((i13 & 64) != 0) {
                ((k) view).D(i10, false);
            }
            if ((i13 & 128) != 0) {
                ((k) view).setTitleColor(i10);
            }
            if ((i13 & 256) != 0) {
                ((k) view).C(i10, false);
            }
            if ((4194304 & i13) != 0) {
                ((k) view).C(i10, true);
            }
            if ((i13 & 512) != 0) {
                ((k) view).D(i10, true);
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
        if (view instanceof d00) {
            if ((i13 & 4) != 0) {
                ((d00) view).setTextColor(i10);
            } else if ((i13 & 2048) != 0) {
                ((d00) view).setProgressBarColor(i10);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        } else if (view instanceof p90) {
            if ((i13 & 2048) != 0) {
                ((p90) view).setProgressColor(i10);
            } else {
                ((p90) view).setBackColor(i10);
            }
        } else if (view instanceof jr) {
            ((jr) view).b();
        } else if ((view instanceof lp0) && (i13 & 2048) != 0) {
            ((lp0) view).setOuterColor(i10);
        }
        if ((i13 & 4) != 0 && ((i13 & 262144) == 0 || b(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof j5) {
                ((j5) view).setTextColor(i10);
            } else if (view instanceof vo) {
                ((vo) view).setTextColor(i10);
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
                        i6.C1(drawable2, i10, z12);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof y9)) {
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
        boolean z15 = view instanceof rm0;
        if (z15) {
            rm0 rm0Var = (rm0) view;
            if ((i13 & 4096) != 0) {
                rm0Var.setListSelectorColor(Integer.valueOf(i10));
            }
            if ((33554432 & i13) != 0 && (yl0Var = rm0Var.f30491d1) != null) {
                yl0Var.c();
            }
            if ((32768 & i13) != 0) {
                rm0Var.setGlowColor(i10);
            }
            if ((524288 & i13) != 0) {
                ArrayList<View> headers = rm0Var.getHeaders();
                if (headers != null) {
                    for (int i15 = 0; i15 < headers.size(); i15++) {
                        d(i10, headers.get(i15));
                    }
                }
                ArrayList<View> headersCache = rm0Var.getHeadersCache();
                if (headersCache != null) {
                    for (int i16 = 0; i16 < headersCache.size(); i16++) {
                        d(i10, headersCache.get(i16));
                    }
                }
                View pinnedHeader = rm0Var.getPinnedHeader();
                if (pinnedHeader != null) {
                    d(i10, pinnedHeader);
                }
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i13 & 4096) != 0) {
                view.setBackgroundDrawable(i6.L0(false));
            } else if ((268435456 & i13) != 0) {
                view.setBackgroundDrawable(i6.L0(true));
            }
        }
        if (clsArr != null) {
            if (z15) {
                rm0 rm0Var2 = (rm0) view;
                rm0Var2.getRecycledViewPool().a();
                int hiddenChildCount = rm0Var2.getHiddenChildCount();
                for (int i17 = 0; i17 < hiddenChildCount; i17++) {
                    d(i10, rm0Var2.V(i17));
                }
                int cachedChildCount = rm0Var2.getCachedChildCount();
                for (int i18 = 0; i18 < cachedChildCount; i18++) {
                    d(i10, rm0Var2.P(i18));
                }
                int attachedScrapChildCount = rm0Var2.getAttachedScrapChildCount();
                for (int i19 = 0; i19 < attachedScrapChildCount; i19++) {
                    d(i10, rm0Var2.O(i19));
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
        j6 j6Var = this.h;
        if (j6Var != null) {
            j6Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public k6(View view, int i10, Class[] clsArr, Paint paint, Drawable[] drawableArr, j6 j6Var, int i11) {
        this.f21346b = -1;
        this.f21352j = new boolean[1];
        this.f21349f = i11;
        if (paint != null) {
            this.f21347c = new Paint[]{paint};
        }
        this.d = drawableArr;
        this.f21345a = view;
        this.f21353k = i10;
        this.f21348e = clsArr;
        this.h = j6Var;
        if (view instanceof av) {
            this.f21345a = ((av) view).getEditText();
        }
    }

    public k6(View view, Class[] clsArr, dk0[] dk0VarArr, String str, int i10) {
        this.f21346b = -1;
        this.f21352j = new boolean[1];
        this.f21349f = i10;
        this.f21350g = str;
        this.d = dk0VarArr;
        this.f21345a = view;
        this.f21353k = 0;
        this.f21348e = clsArr;
        if (view instanceof av) {
            this.f21345a = ((av) view).getEditText();
        }
    }

    public k6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, j6 j6Var, int i11) {
        this(view, i10, clsArr, strArr, paintArr, drawableArr, -1, j6Var, i11);
    }

    public k6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, int i11, j6 j6Var, int i12) {
        this.f21352j = new boolean[1];
        this.f21349f = i12;
        this.f21347c = paintArr;
        this.d = drawableArr;
        this.f21345a = view;
        this.f21353k = i10;
        this.f21348e = clsArr;
        this.f21354l = strArr;
        this.f21346b = i11;
        this.h = j6Var;
        this.f21355m = new HashMap();
        this.f21356n = new HashMap();
        if (view instanceof av) {
            this.f21345a = ((av) view).getEditText();
        }
    }

    public k6(UndoView undoView, Class[] clsArr, String[] strArr, String str, int i10) {
        this.f21346b = -1;
        this.f21352j = new boolean[1];
        this.f21349f = i10;
        this.f21350g = str;
        this.f21345a = undoView;
        this.f21353k = 0;
        this.f21348e = clsArr;
        this.f21354l = strArr;
        this.f21355m = new HashMap();
        this.f21356n = new HashMap();
    }
}
