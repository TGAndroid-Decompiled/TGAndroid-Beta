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
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.z7;
public final class w6 {
    public final View f30278a;
    public final Paint[] f30279b;
    public final Drawable[] f30280c;
    public final Class[] d;
    public final int f30281e;
    public final String f30282f;
    public v6 f30283g;
    public int h;
    public final boolean[] f30284i;
    public final int f30285j;
    public final String[] f30286k;
    public final HashMap f30287l;
    public final HashMap f30288m;
    public i6 f30289n;

    public w6(int i7, View view) {
        this.f30284i = new boolean[1];
        this.f30281e = i7;
        this.f30279b = null;
        this.f30280c = null;
        this.f30278a = view;
        this.f30285j = 262148;
        this.d = null;
        this.f30283g = null;
        if (view instanceof wt) {
            this.f30278a = ((wt) view).getEditText();
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
        boolean z10 = obj instanceof View;
        if (z10) {
            ((View) obj).invalidate();
        }
        String str = this.f30282f;
        if (str != null && (obj instanceof qh0)) {
            ((qh0) obj).h(i7, str);
        }
        int i10 = this.f30285j;
        if ((131072 & i10) != 0 && z10) {
            obj = ((View) obj).getBackground();
        }
        Drawable drawable4 = null;
        if ((i10 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (background instanceof u90) {
                u90 u90Var = (u90) background;
                u90Var.f40326a.setColor(i7);
                u90Var.f40327b = null;
                return;
            }
            view2.setBackgroundColor(i7);
        } else if (obj instanceof mt) {
            if ((8388608 & i10) != 0) {
                mt mtVar = (mt) obj;
                mtVar.setHintColor(i7);
                mtVar.setHintTextColor(i7);
            } else if ((16777216 & i10) != 0) {
                ((mt) obj).setCursorColor(i7);
            } else {
                ((mt) obj).setTextColor(i7);
            }
        } else if (obj instanceof n5) {
            if ((i10 & 2) != 0) {
                ((n5) obj).setLinkTextColor(i7);
            } else {
                ((n5) obj).setTextColor(i7);
            }
        } else {
            boolean z11 = false;
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
                        k41[] k41VarArr = (k41[]) spannedString.getSpans(0, spannedString.length(), k41.class);
                        if (k41VarArr != null && k41VarArr.length > 0) {
                            for (k41 k41Var : k41VarArr) {
                                k41Var.f36645b = i7;
                            }
                        }
                    }
                } else {
                    textView.setTextColor(i7);
                }
            } else if (obj instanceof ImageView) {
                ImageView imageView = (ImageView) obj;
                Drawable drawable6 = imageView.getDrawable();
                if (drawable6 instanceof lq) {
                    if ((i10 & 32) != 0) {
                        drawable3 = ((lq) drawable6).f37195a;
                    } else {
                        drawable3 = ((lq) drawable6).f37196b;
                    }
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        return;
                    }
                    return;
                }
                imageView.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
            } else if (obj instanceof p9) {
                p9 p9Var = (p9) obj;
                if (p9Var.getImageReceiver() != null) {
                    drawable4 = p9Var.getImageReceiver().f22747n0;
                }
                if (drawable4 instanceof lq) {
                    if ((i10 & 32) != 0) {
                        drawable2 = ((lq) drawable4).f37195a;
                    } else {
                        drawable2 = ((lq) drawable4).f37196b;
                    }
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                    }
                } else if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                }
            } else if (obj instanceof Drawable) {
                if (obj instanceof t70) {
                    if ((i10 & 32) != 0) {
                        t70.f39840k.setColor(i7);
                    } else {
                        ((t70) obj).h.setColor(i7);
                    }
                } else if (obj instanceof lq) {
                    if ((i10 & 32) != 0) {
                        drawable = ((lq) obj).f37195a;
                    } else {
                        drawable = ((lq) obj).f37196b;
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
                        z11 = true;
                    }
                    n6.H1(drawable7, i7, z11);
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
                } else if (obj instanceof u70) {
                    if ((i10 & 2048) != 0) {
                        ((u70) obj).setProgressColor(i7);
                    } else {
                        ((u70) obj).setBackColor(i7);
                    }
                } else if (obj instanceof RadialProgressView) {
                    ((RadialProgressView) obj).setProgressColor(i7);
                } else if (obj instanceof Paint) {
                    ((Paint) obj).setColor(i7);
                    view.invalidate();
                } else if (obj instanceof an0) {
                    if ((i10 & 2048) != 0) {
                        ((an0) obj).setOuterColor(i7);
                    } else {
                        ((an0) obj).setInnerColor(i7);
                    }
                } else if (obj instanceof z7) {
                    if ((i10 & 33554432) != 0) {
                        for (int i11 = 0; i11 < 2; i11++) {
                            z7 z7Var = (z7) obj;
                            if (i11 == 0) {
                                nextTextView2 = z7Var.getTextView();
                            } else {
                                nextTextView2 = z7Var.getNextTextView();
                            }
                            if (nextTextView2 != null) {
                                CharSequence text2 = nextTextView2.getText();
                                if (text2 instanceof SpannedString) {
                                    SpannedString spannedString2 = (SpannedString) text2;
                                    k41[] k41VarArr2 = (k41[]) spannedString2.getSpans(0, spannedString2.length(), k41.class);
                                    if (k41VarArr2 != null && k41VarArr2.length > 0) {
                                        for (k41 k41Var2 : k41VarArr2) {
                                            k41Var2.f36645b = i7;
                                        }
                                    }
                                }
                            }
                        }
                    } else if ((i10 & 4) != 0) {
                        if ((262144 & i10) == 0 || b(this.f30281e, (View) obj)) {
                            for (int i12 = 0; i12 < 2; i12++) {
                                z7 z7Var2 = (z7) obj;
                                if (i12 == 0) {
                                    nextTextView = z7Var2.getTextView();
                                } else {
                                    nextTextView = z7Var2.getNextTextView();
                                }
                                if (nextTextView != null) {
                                    nextTextView.setTextColor(i7);
                                    CharSequence text3 = nextTextView.getText();
                                    if (text3 instanceof SpannedString) {
                                        SpannedString spannedString3 = (SpannedString) text3;
                                        k41[] k41VarArr3 = (k41[]) spannedString3.getSpans(0, spannedString3.length(), k41.class);
                                        if (k41VarArr3 != null && k41VarArr3.length > 0) {
                                            for (k41 k41Var3 : k41VarArr3) {
                                                k41Var3.f36645b = i7;
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
        i6 i6Var = this.f30289n;
        int i7 = this.f30281e;
        if (i6Var != null) {
            num = Integer.valueOf(i6Var.i(i7));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return n6.x0(null, i7, false);
    }

    public final void d(int i7, View view) {
        Class[] clsArr;
        TextView nextTextView;
        boolean z10;
        boolean z11;
        String str;
        Field field;
        Object obj;
        if (view != null && (clsArr = this.d) != null) {
            for (int i10 = 0; i10 < clsArr.length; i10++) {
                Class cls = clsArr[i10];
                if (cls != null && cls.isInstance(view)) {
                    view.invalidate();
                    int i11 = this.f30285j;
                    int i12 = 262144 & i11;
                    String[] strArr = this.f30286k;
                    int i13 = this.f30281e;
                    if (i12 != 0 && !b(i13, view)) {
                        z10 = false;
                    } else {
                        view.invalidate();
                        if (strArr == null && (i11 & 32) != 0) {
                            Drawable background = view.getBackground();
                            if (background != null) {
                                if ((i11 & 16) != 0) {
                                    if (background instanceof lq) {
                                        Drawable drawable = ((lq) background).f37195a;
                                        if (drawable instanceof ColorDrawable) {
                                            ((ColorDrawable) drawable).setColor(i7);
                                        }
                                    }
                                } else {
                                    if (background instanceof lq) {
                                        background = ((lq) background).f37196b;
                                    } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                        if ((i11 & 65536) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        n6.H1(background, i7, z11);
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
                            } else if (view instanceof z7) {
                                for (int i14 = 0; i14 < 2; i14++) {
                                    z7 z7Var = (z7) view;
                                    if (i14 == 0) {
                                        nextTextView = z7Var.getTextView();
                                    } else {
                                        nextTextView = z7Var.getNextTextView();
                                    }
                                    if (nextTextView != null) {
                                        nextTextView.setTextColor(i7);
                                    }
                                }
                            }
                        } else if ((536870912 & i11) == 0) {
                            if ((i11 & 4096) != 0) {
                                view.setBackgroundDrawable(n6.N0(false));
                            } else if ((268435456 & i11) != 0) {
                                view.setBackgroundDrawable(n6.N0(true));
                            }
                        }
                        z10 = true;
                    }
                    if (strArr != null) {
                        if (i10 < strArr.length && (str = strArr[i10]) != null) {
                            String str2 = cls + "_" + str;
                            HashMap hashMap = this.f30288m;
                            if (hashMap == null || !hashMap.containsKey(str2)) {
                                HashMap hashMap2 = this.f30287l;
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
                                if (field != null && (obj = field.get(view)) != null && (z10 || !(obj instanceof View) || b(i13, (View) obj))) {
                                    if (obj instanceof Integer) {
                                        field.set(view, Integer.valueOf(i7));
                                    } else {
                                        a(obj, view, i7);
                                    }
                                }
                            }
                        }
                    } else if (view instanceof n20) {
                        ((n20) view).updateColors();
                    }
                }
            }
        }
    }

    public final void e(int i7, boolean z10, boolean z11) {
        Drawable[] compoundDrawables;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10 = this.f30281e;
        if (z11) {
            n6.A1(i10, i7, z10);
        }
        Paint[] paintArr = this.f30279b;
        int i11 = this.f30285j;
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
        Drawable[] drawableArr = this.f30280c;
        if (drawableArr != null) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    if (drawable instanceof x1) {
                        ((x1) drawable).a(i7);
                    } else if (drawable instanceof vk0) {
                        ((vk0) drawable).b(i7);
                    } else if (drawable instanceof nh0) {
                        String str = this.f30282f;
                        if (str != null) {
                            ((nh0) drawable).Q(i7, str);
                        }
                    } else if (drawable instanceof lq) {
                        if ((i11 & 32) != 0) {
                            ((lq) drawable).f37195a.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((lq) drawable).f37196b.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof a9) {
                        ((a9) drawable).h(i7);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.f32622a.setColor(i7);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.d;
        View view = this.f30278a;
        if (view != null && clsArr == null && this.f30286k == null && ((i11 & 262144) == 0 || b(i10, view))) {
            if ((i11 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof u90) {
                    u90 u90Var = (u90) background;
                    u90Var.f40326a.setColor(i7);
                    u90Var.f40327b = null;
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
                    if (background2 instanceof lq) {
                        if ((i11 & 65536) != 0) {
                            background2 = ((lq) background2).f37195a;
                        } else {
                            background2 = ((lq) background2).f37196b;
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
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            n6.H1(background2, i7, z14);
                        }
                    }
                }
            }
        }
        if (view instanceof k) {
            if ((i11 & 64) != 0) {
                ((k) view).F(i7, false);
            }
            if ((i11 & 128) != 0) {
                ((k) view).setTitleColor(i7);
            }
            if ((i11 & 256) != 0) {
                ((k) view).E(i7, false);
            }
            if ((i11 & 1024) != 0) {
                ((k) view).setSubtitleColor(i7);
            }
            if ((2097152 & i11) != 0) {
                ((k) view).setActionModeTopColor(i7);
            }
            if ((67108864 & i11) != 0) {
                ((k) view).L(i7, true);
            }
            if ((134217728 & i11) != 0) {
                ((k) view).L(i7, false);
            }
            if ((1073741824 & i11) != 0) {
                k kVar = (k) view;
                if ((i11 & 8) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                kVar.I(i7, z13, false);
            }
            if ((Integer.MIN_VALUE & i11) != 0) {
                ((k) view).H(i7, false);
            }
        }
        if (view instanceof sy) {
            if ((i11 & 4) != 0) {
                ((sy) view).setTextColor(i7);
            } else if ((i11 & 2048) != 0) {
                ((sy) view).setProgressBarColor(i7);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i7);
        } else if (view instanceof u70) {
            if ((i11 & 2048) != 0) {
                ((u70) view).setProgressColor(i7);
            } else {
                ((u70) view).setBackColor(i7);
            }
        } else if (view instanceof nq) {
            ((nq) view).updateColors();
        } else if ((view instanceof an0) && (i11 & 2048) != 0) {
            ((an0) view).setOuterColor(i7);
        }
        if ((i11 & 4) != 0 && ((i11 & 262144) == 0 || b(i10, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i7);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i7);
            } else if (view instanceof n5) {
                ((n5) view).setTextColor(i7);
            } else if (view instanceof ao) {
                ((ao) view).setTextColor(i7);
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
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        n6.H1(drawable2, i7, z12);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof p9)) {
                if (view instanceof n5) {
                    ((n5) view).setSideDrawablesColor(i7);
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
            org.telegram.messenger.g0.x3((ScrollView) view, i7);
        }
        if ((view instanceof c5.l) && (i11 & 32768) != 0) {
            org.telegram.messenger.g0.A3((c5.l) view, i7);
        }
        boolean z15 = view instanceof ek0;
        if (z15) {
            ek0 ek0Var = (ek0) view;
            if ((i11 & 4096) != 0) {
                ek0Var.setListSelectorColor(Integer.valueOf(i7));
            }
            if ((33554432 & i11) != 0) {
                ek0Var.x1();
            }
            if ((32768 & i11) != 0) {
                ek0Var.setGlowColor(i7);
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i11 & 4096) != 0) {
                view.setBackgroundDrawable(n6.N0(false));
            } else if ((268435456 & i11) != 0) {
                view.setBackgroundDrawable(n6.N0(true));
            }
        }
        if (clsArr != null) {
            if (z15) {
                ek0 ek0Var2 = (ek0) view;
                ek0Var2.getRecycledViewPool().a();
                int hiddenChildCount = ek0Var2.getHiddenChildCount();
                for (int i13 = 0; i13 < hiddenChildCount; i13++) {
                    d(i7, ek0Var2.V(i13));
                }
                int cachedChildCount = ek0Var2.getCachedChildCount();
                for (int i14 = 0; i14 < cachedChildCount; i14++) {
                    d(i7, ek0Var2.P(i14));
                }
                int attachedScrapChildCount = ek0Var2.getAttachedScrapChildCount();
                for (int i15 = 0; i15 < attachedScrapChildCount; i15++) {
                    d(i7, ek0Var2.O(i15));
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
        v6 v6Var = this.f30283g;
        if (v6Var != null) {
            v6Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public w6(View view, int i7, Class[] clsArr, Paint paint, Drawable[] drawableArr, v6 v6Var, int i10) {
        this.f30284i = new boolean[1];
        this.f30281e = i10;
        if (paint != null) {
            this.f30279b = new Paint[]{paint};
        }
        this.f30280c = drawableArr;
        this.f30278a = view;
        this.f30285j = i7;
        this.d = clsArr;
        this.f30283g = v6Var;
        if (view instanceof wt) {
            this.f30278a = ((wt) view).getEditText();
        }
    }

    public w6(qh0 qh0Var, nh0[] nh0VarArr, String str, int i7) {
        this.f30284i = new boolean[1];
        this.f30281e = i7;
        this.f30282f = str;
        this.f30280c = nh0VarArr;
        this.f30278a = qh0Var;
        this.f30285j = 0;
        this.d = null;
    }

    public w6(View view, int i7, Class[] clsArr, String[] strArr, Drawable[] drawableArr, v6 v6Var, int i10) {
        this.f30284i = new boolean[1];
        this.f30281e = i10;
        this.f30279b = null;
        this.f30280c = drawableArr;
        this.f30278a = view;
        this.f30285j = i7;
        this.d = clsArr;
        this.f30286k = strArr;
        this.f30283g = v6Var;
        this.f30287l = new HashMap();
        this.f30288m = new HashMap();
        if (view instanceof wt) {
            this.f30278a = ((wt) view).getEditText();
        }
    }
}
