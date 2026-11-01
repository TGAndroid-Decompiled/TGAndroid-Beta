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
import org.telegram.messenger.f8;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.GroupCreateCheckBox;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.y41;
import org.telegram.ui.Components.z70;
public final class c7 {
    public final View f20233a;
    public final Paint[] f20234b;
    public final Drawable[] f20235c;
    public final Class[] d;
    public final int e;
    public final String f20236f;
    public b7 f20237g;
    public int h;
    public final boolean[] f20238i;
    public final int f20239j;
    public final String[] f20240k;
    public final HashMap f20241l;
    public final HashMap f20242m;
    public p6 f20243n;

    public c7(int i10, View view) {
        this.f20238i = new boolean[1];
        this.e = i10;
        this.f20234b = null;
        this.f20235c = null;
        this.f20233a = view;
        this.f20239j = 262148;
        this.d = null;
        this.f20237g = null;
        if (view instanceof wt) {
            this.f20233a = ((wt) view).getEditText();
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

    public final void a(int i10, View view, Object obj) {
        TextView nextTextView;
        TextView nextTextView2;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        boolean z10 = obj instanceof View;
        if (z10) {
            ((View) obj).invalidate();
        }
        String str = this.f20236f;
        if (str != null && (obj instanceof fi0)) {
            ((fi0) obj).h(i10, str);
        }
        int i11 = this.f20239j;
        if ((131072 & i11) != 0 && z10) {
            obj = ((View) obj).getBackground();
        }
        Drawable drawable4 = null;
        if ((i11 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (background instanceof aa0) {
                aa0 aa0Var = (aa0) background;
                aa0Var.f24326a.setColor(i10);
                aa0Var.f24327b = null;
                return;
            }
            view2.setBackgroundColor(i10);
        } else if (obj instanceof mt) {
            if ((8388608 & i11) != 0) {
                mt mtVar = (mt) obj;
                mtVar.setHintColor(i10);
                mtVar.setHintTextColor(i10);
            } else if ((16777216 & i11) != 0) {
                ((mt) obj).setCursorColor(i10);
            } else {
                ((mt) obj).setTextColor(i10);
            }
        } else if (obj instanceof u5) {
            if ((i11 & 2) != 0) {
                ((u5) obj).setLinkTextColor(i10);
            } else {
                ((u5) obj).setTextColor(i10);
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
                        y41[] y41VarArr = (y41[]) spannedString.getSpans(0, spannedString.length(), y41.class);
                        if (y41VarArr != null && y41VarArr.length > 0) {
                            for (y41 y41Var : y41VarArr) {
                                y41Var.f32721b = i10;
                            }
                        }
                    }
                } else {
                    textView.setTextColor(i10);
                }
            } else if (obj instanceof ImageView) {
                ImageView imageView = (ImageView) obj;
                Drawable drawable6 = imageView.getDrawable();
                if (drawable6 instanceof eq) {
                    if ((i11 & 32) != 0) {
                        drawable3 = ((eq) drawable6).f25901a;
                    } else {
                        drawable3 = ((eq) drawable6).f25902b;
                    }
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        return;
                    }
                    return;
                }
                imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
            } else if (obj instanceof g9) {
                g9 g9Var = (g9) obj;
                if (g9Var.getImageReceiver() != null) {
                    drawable4 = g9Var.getImageReceiver().m0;
                }
                if (drawable4 instanceof eq) {
                    if ((i11 & 32) != 0) {
                        drawable2 = ((eq) drawable4).f25901a;
                    } else {
                        drawable2 = ((eq) drawable4).f25902b;
                    }
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                } else if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (obj instanceof Drawable) {
                if (obj instanceof z70) {
                    if ((i11 & 32) != 0) {
                        z70.f33055k.setColor(i10);
                    } else {
                        ((z70) obj).h.setColor(i10);
                    }
                } else if (obj instanceof eq) {
                    if ((i11 & 32) != 0) {
                        drawable = ((eq) obj).f25901a;
                    } else {
                        drawable = ((eq) obj).f25902b;
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
                    t6.H1(drawable7, i10, z11);
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
                } else if (obj instanceof a80) {
                    if ((i11 & 2048) != 0) {
                        ((a80) obj).setProgressColor(i10);
                    } else {
                        ((a80) obj).setBackColor(i10);
                    }
                } else if (obj instanceof RadialProgressView) {
                    ((RadialProgressView) obj).setProgressColor(i10);
                } else if (obj instanceof Paint) {
                    ((Paint) obj).setColor(i10);
                    view.invalidate();
                } else if (obj instanceof on0) {
                    if ((i11 & 2048) != 0) {
                        ((on0) obj).setOuterColor(i10);
                    } else {
                        ((on0) obj).setInnerColor(i10);
                    }
                } else if (obj instanceof r7) {
                    if ((i11 & 33554432) != 0) {
                        for (int i12 = 0; i12 < 2; i12++) {
                            r7 r7Var = (r7) obj;
                            if (i12 == 0) {
                                nextTextView2 = r7Var.getTextView();
                            } else {
                                nextTextView2 = r7Var.getNextTextView();
                            }
                            if (nextTextView2 != null) {
                                CharSequence text2 = nextTextView2.getText();
                                if (text2 instanceof SpannedString) {
                                    SpannedString spannedString2 = (SpannedString) text2;
                                    y41[] y41VarArr2 = (y41[]) spannedString2.getSpans(0, spannedString2.length(), y41.class);
                                    if (y41VarArr2 != null && y41VarArr2.length > 0) {
                                        for (y41 y41Var2 : y41VarArr2) {
                                            y41Var2.f32721b = i10;
                                        }
                                    }
                                }
                            }
                        }
                    } else if ((i11 & 4) != 0) {
                        if ((262144 & i11) == 0 || b(this.e, (View) obj)) {
                            for (int i13 = 0; i13 < 2; i13++) {
                                r7 r7Var2 = (r7) obj;
                                if (i13 == 0) {
                                    nextTextView = r7Var2.getTextView();
                                } else {
                                    nextTextView = r7Var2.getNextTextView();
                                }
                                if (nextTextView != null) {
                                    nextTextView.setTextColor(i10);
                                    CharSequence text3 = nextTextView.getText();
                                    if (text3 instanceof SpannedString) {
                                        SpannedString spannedString3 = (SpannedString) text3;
                                        y41[] y41VarArr3 = (y41[]) spannedString3.getSpans(0, spannedString3.length(), y41.class);
                                        if (y41VarArr3 != null && y41VarArr3.length > 0) {
                                            for (y41 y41Var3 : y41VarArr3) {
                                                y41Var3.f32721b = i10;
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
        p6 p6Var = this.f20243n;
        int i10 = this.e;
        if (p6Var != null) {
            num = Integer.valueOf(p6Var.h(i10));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return t6.x0(null, i10, false);
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
                    int i12 = this.f20239j;
                    int i13 = 262144 & i12;
                    String[] strArr = this.f20240k;
                    int i14 = this.e;
                    if (i13 != 0 && !b(i14, view)) {
                        z10 = false;
                    } else {
                        view.invalidate();
                        if (strArr == null && (i12 & 32) != 0) {
                            Drawable background = view.getBackground();
                            if (background != null) {
                                if ((i12 & 16) != 0) {
                                    if (background instanceof eq) {
                                        Drawable drawable = ((eq) background).f25901a;
                                        if (drawable instanceof ColorDrawable) {
                                            ((ColorDrawable) drawable).setColor(i10);
                                        }
                                    }
                                } else {
                                    if (background instanceof eq) {
                                        background = ((eq) background).f25902b;
                                    } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                        if ((i12 & 65536) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        t6.H1(background, i10, z11);
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
                            } else if (view instanceof r7) {
                                for (int i15 = 0; i15 < 2; i15++) {
                                    r7 r7Var = (r7) view;
                                    if (i15 == 0) {
                                        nextTextView = r7Var.getTextView();
                                    } else {
                                        nextTextView = r7Var.getNextTextView();
                                    }
                                    if (nextTextView != null) {
                                        nextTextView.setTextColor(i10);
                                    }
                                }
                            }
                        } else if ((536870912 & i12) == 0) {
                            if ((i12 & 4096) != 0) {
                                view.setBackgroundDrawable(t6.N0(false));
                            } else if ((268435456 & i12) != 0) {
                                view.setBackgroundDrawable(t6.N0(true));
                            }
                        }
                        z10 = true;
                    }
                    if (strArr != null) {
                        if (i11 < strArr.length && (str = strArr[i11]) != null) {
                            String str2 = cls + "_" + str;
                            HashMap hashMap = this.f20242m;
                            if (hashMap == null || !hashMap.containsKey(str2)) {
                                HashMap hashMap2 = this.f20241l;
                                if (hashMap2 != null) {
                                    try {
                                        field = (Field) hashMap2.get(str2);
                                    } catch (Throwable th2) {
                                        f8.g(th2, true);
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
                                        a(i10, view, obj);
                                    }
                                }
                            }
                        }
                    } else if (view instanceof s20) {
                        ((s20) view).updateColors();
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
            t6.A1(i11, i10, z10);
        }
        Paint[] paintArr = this.f20234b;
        int i12 = this.f20239j;
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
        Drawable[] drawableArr = this.f20235c;
        if (drawableArr != null) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    if (drawable instanceof c2) {
                        ((c2) drawable).a(i10);
                    } else if (drawable instanceof ll0) {
                        ((ll0) drawable).b(i10);
                    } else if (drawable instanceof ci0) {
                        String str = this.f20236f;
                        if (str != null) {
                            ((ci0) drawable).Q(i10, str);
                        }
                    } else if (drawable instanceof eq) {
                        if ((i12 & 32) != 0) {
                            ((eq) drawable).f25901a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((eq) drawable).f25902b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof r8) {
                        ((r8) drawable).h(i10);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.f23664a.setColor(i10);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.d;
        View view = this.f20233a;
        if (view != null && clsArr == null && this.f20240k == null && ((i12 & 262144) == 0 || b(i11, view))) {
            if ((i12 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof aa0) {
                    aa0 aa0Var = (aa0) background;
                    aa0Var.f24326a.setColor(i10);
                    aa0Var.f24327b = null;
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
                    if (background2 instanceof eq) {
                        if ((i12 & 65536) != 0) {
                            background2 = ((eq) background2).f25901a;
                        } else {
                            background2 = ((eq) background2).f25902b;
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
                            t6.H1(background2, i10, z14);
                        }
                    }
                }
            }
        }
        if (view instanceof l) {
            if ((i12 & 64) != 0) {
                ((l) view).D(i10, false);
            }
            if ((i12 & 128) != 0) {
                ((l) view).setTitleColor(i10);
            }
            if ((i12 & 256) != 0) {
                ((l) view).C(i10, false);
            }
            if ((i12 & 1024) != 0) {
                ((l) view).setSubtitleColor(i10);
            }
            if ((2097152 & i12) != 0) {
                ((l) view).setActionModeTopColor(i10);
            }
            if ((67108864 & i12) != 0) {
                ((l) view).I(i10, true);
            }
            if ((134217728 & i12) != 0) {
                ((l) view).I(i10, false);
            }
            if ((1073741824 & i12) != 0) {
                l lVar = (l) view;
                if ((i12 & 8) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                lVar.G(i10, z13, false);
            }
            if ((Integer.MIN_VALUE & i12) != 0) {
                ((l) view).F(i10, false);
            }
        }
        if (view instanceof xy) {
            if ((i12 & 4) != 0) {
                ((xy) view).setTextColor(i10);
            } else if ((i12 & 2048) != 0) {
                ((xy) view).setProgressBarColor(i10);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        } else if (view instanceof a80) {
            if ((i12 & 2048) != 0) {
                ((a80) view).setProgressColor(i10);
            } else {
                ((a80) view).setBackColor(i10);
            }
        } else if (view instanceof iq) {
            ((iq) view).updateColors();
        } else if ((view instanceof on0) && (i12 & 2048) != 0) {
            ((on0) view).setOuterColor(i10);
        }
        if ((i12 & 4) != 0 && ((i12 & 262144) == 0 || b(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof u5) {
                ((u5) view).setTextColor(i10);
            } else if (view instanceof tn) {
                ((tn) view).setTextColor(i10);
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
                        t6.H1(drawable2, i10, z12);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof g9)) {
                if (view instanceof u5) {
                    ((u5) view).setSideDrawablesColor(i10);
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
            org.telegram.messenger.i0.y3((ScrollView) view, i10);
        }
        if ((view instanceof z4.g) && (i12 & 32768) != 0) {
            org.telegram.messenger.i0.B3((z4.g) view, i10);
        }
        boolean z15 = view instanceof uk0;
        if (z15) {
            uk0 uk0Var = (uk0) view;
            if ((i12 & 4096) != 0) {
                uk0Var.setListSelectorColor(Integer.valueOf(i10));
            }
            if ((33554432 & i12) != 0) {
                uk0Var.x1();
            }
            if ((32768 & i12) != 0) {
                uk0Var.setGlowColor(i10);
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i12 & 4096) != 0) {
                view.setBackgroundDrawable(t6.N0(false));
            } else if ((268435456 & i12) != 0) {
                view.setBackgroundDrawable(t6.N0(true));
            }
        }
        if (clsArr != null) {
            if (z15) {
                uk0 uk0Var2 = (uk0) view;
                uk0Var2.getRecycledViewPool().a();
                int hiddenChildCount = uk0Var2.getHiddenChildCount();
                for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                    d(i10, uk0Var2.V(i14));
                }
                int cachedChildCount = uk0Var2.getCachedChildCount();
                for (int i15 = 0; i15 < cachedChildCount; i15++) {
                    d(i10, uk0Var2.P(i15));
                }
                int attachedScrapChildCount = uk0Var2.getAttachedScrapChildCount();
                for (int i16 = 0; i16 < attachedScrapChildCount; i16++) {
                    d(i10, uk0Var2.O(i16));
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
        b7 b7Var = this.f20237g;
        if (b7Var != null) {
            b7Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public c7(View view, int i10, Class[] clsArr, Paint paint, Drawable[] drawableArr, b7 b7Var, int i11) {
        this.f20238i = new boolean[1];
        this.e = i11;
        if (paint != null) {
            this.f20234b = new Paint[]{paint};
        }
        this.f20235c = drawableArr;
        this.f20233a = view;
        this.f20239j = i10;
        this.d = clsArr;
        this.f20237g = b7Var;
        if (view instanceof wt) {
            this.f20233a = ((wt) view).getEditText();
        }
    }

    public c7(fi0 fi0Var, ci0[] ci0VarArr, String str, int i10) {
        this.f20238i = new boolean[1];
        this.e = i10;
        this.f20236f = str;
        this.f20235c = ci0VarArr;
        this.f20233a = fi0Var;
        this.f20239j = 0;
        this.d = null;
    }

    public c7(View view, int i10, Class[] clsArr, String[] strArr, Drawable[] drawableArr, b7 b7Var, int i11) {
        this.f20238i = new boolean[1];
        this.e = i11;
        this.f20234b = null;
        this.f20235c = drawableArr;
        this.f20233a = view;
        this.f20239j = i10;
        this.d = clsArr;
        this.f20240k = strArr;
        this.f20237g = b7Var;
        this.f20241l = new HashMap();
        this.f20242m = new HashMap();
        if (view instanceof wt) {
            this.f20233a = ((wt) view).getEditText();
        }
    }
}
