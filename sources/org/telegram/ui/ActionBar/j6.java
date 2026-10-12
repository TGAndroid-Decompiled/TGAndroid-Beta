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
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.xo;
import org.telegram.ui.Components.y9;
public final class j6 {
    public final View f21017a;
    public final int f21018b;
    public final Paint[] f21019c;
    public final Drawable[] d;
    public final Class[] f21020e;
    public final int f21021f;
    public final String f21022g;
    public i6 h;
    public int f21023i;
    public final boolean[] f21024j;
    public final int f21025k;
    public final String[] f21026l;
    public final HashMap f21027m;
    public final HashMap f21028n;
    public c6 f21029o;

    public j6(View view, int i10, Class[] clsArr, Paint[] paintArr, int i11) {
        this.f21018b = -1;
        this.f21024j = new boolean[1];
        this.f21021f = i11;
        this.f21019c = paintArr;
        this.d = null;
        this.f21017a = view;
        this.f21025k = i10;
        this.f21020e = clsArr;
        this.h = null;
        if (view instanceof cv) {
            this.f21017a = ((cv) view).getEditText();
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
        String str = this.f21022g;
        if (str != null && (obj instanceof ik0)) {
            ((ik0) obj).h(i10, str);
        }
        int i11 = this.f21025k;
        if ((131072 & i11) != 0 && z10) {
            obj = ((View) obj).getBackground();
        }
        Drawable drawable4 = null;
        if ((i11 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (background instanceof vb0) {
                vb0 vb0Var = (vb0) background;
                vb0Var.f31478a.setColor(i10);
                vb0Var.f31479b = null;
                return;
            }
            view2.setBackgroundColor(i10);
        } else if (obj instanceof uu) {
            if ((8388608 & i11) != 0) {
                uu uuVar = (uu) obj;
                uuVar.setHintColor(i10);
                uuVar.setHintTextColor(i10);
            } else if ((16777216 & i11) != 0) {
                ((uu) obj).setCursorColor(i10);
            } else {
                ((uu) obj).setTextColor(i10);
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
                        r61[] r61VarArr = (r61[]) spannedString.getSpans(0, spannedString.length(), r61.class);
                        if (r61VarArr != null && r61VarArr.length > 0) {
                            for (r61 r61Var : r61VarArr) {
                                r61Var.f30063b = i10;
                            }
                        }
                    }
                } else {
                    textView.setTextColor(i10);
                }
            } else if (obj instanceof ImageView) {
                ImageView imageView = (ImageView) obj;
                Drawable drawable6 = imageView.getDrawable();
                if (drawable6 instanceof hr) {
                    if ((i11 & 32) != 0) {
                        drawable3 = ((hr) drawable6).f26889a;
                    } else {
                        drawable3 = ((hr) drawable6).f26890b;
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
                if (drawable4 instanceof hr) {
                    if ((i11 & 32) != 0) {
                        drawable2 = ((hr) drawable4).f26889a;
                    } else {
                        drawable2 = ((hr) drawable4).f26890b;
                    }
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                } else if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (obj instanceof Drawable) {
                if (obj instanceof r90) {
                    if ((i11 & 32) != 0) {
                        r90.f30097j.setColor(i10);
                    } else {
                        ((r90) obj).h.setColor(i10);
                    }
                } else if (obj instanceof hr) {
                    if ((i11 & 32) != 0) {
                        drawable = ((hr) obj).f26889a;
                    } else {
                        drawable = ((hr) obj).f26890b;
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
                } else if (obj instanceof s90) {
                    if ((i11 & 2048) != 0) {
                        ((s90) obj).setProgressColor(i10);
                    } else {
                        ((s90) obj).setBackColor(i10);
                    }
                } else if (obj instanceof RadialProgressView) {
                    ((RadialProgressView) obj).setProgressColor(i10);
                } else if (obj instanceof Paint) {
                    ((Paint) obj).setColor(i10);
                    view.invalidate();
                } else if (obj instanceof qp0) {
                    if ((i11 & 2048) != 0) {
                        ((qp0) obj).setOuterColor(i10);
                    } else {
                        ((qp0) obj).setInnerColor(i10);
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
                                    r61[] r61VarArr2 = (r61[]) spannedString2.getSpans(0, spannedString2.length(), r61.class);
                                    if (r61VarArr2 != null && r61VarArr2.length > 0) {
                                        for (r61 r61Var2 : r61VarArr2) {
                                            r61Var2.f30063b = i10;
                                        }
                                    }
                                }
                            }
                        }
                    } else if ((i11 & 4) != 0) {
                        if ((262144 & i11) == 0 || b(this.f21021f, (View) obj)) {
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
                                        r61[] r61VarArr3 = (r61[]) spannedString3.getSpans(0, spannedString3.length(), r61.class);
                                        if (r61VarArr3 != null && r61VarArr3.length > 0) {
                                            for (r61 r61Var3 : r61VarArr3) {
                                                r61Var3.f30063b = i10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int i14 = GroupCreateCheckBox.f23975b;
                h6.v0(0);
                throw null;
            }
        }
    }

    public final int c() {
        Integer num;
        c6 c6Var = this.f21029o;
        int i10 = this.f21021f;
        if (c6Var != null) {
            num = Integer.valueOf(c6Var.x0(i10));
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
        if (view != null && (clsArr = this.f21020e) != null) {
            for (int i11 = 0; i11 < clsArr.length; i11++) {
                Class cls = clsArr[i11];
                if (cls != null && cls.isInstance(view)) {
                    view.invalidate();
                    int i12 = this.f21025k;
                    int i13 = 262144 & i12;
                    String[] strArr = this.f21026l;
                    int i14 = this.f21021f;
                    if (i13 != 0 && !b(i14, view)) {
                        z10 = false;
                    } else {
                        view.invalidate();
                        if (strArr == null && (i12 & 32) != 0) {
                            Drawable background = view.getBackground();
                            if (background != null) {
                                if ((i12 & 16) != 0) {
                                    if (background instanceof hr) {
                                        Drawable drawable = ((hr) background).f26889a;
                                        if (drawable instanceof ColorDrawable) {
                                            ((ColorDrawable) drawable).setColor(i10);
                                        }
                                    }
                                } else {
                                    if (background instanceof hr) {
                                        background = ((hr) background).f26890b;
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
                            HashMap hashMap = this.f21028n;
                            if (hashMap == null || !hashMap.containsKey(str2)) {
                                HashMap hashMap2 = this.f21027m;
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
                    } else if (view instanceof g40) {
                        ((g40) view).c();
                    }
                }
            }
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        dm0 dm0Var;
        Drawable[] compoundDrawables;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f21021f;
        if (z11) {
            h6.v1(i11, i10, z10);
        }
        int i12 = this.f21018b;
        if (i12 > 0) {
            i10 = Color.argb(i12, Color.red(i10), Color.green(i10), Color.blue(i10));
        }
        Paint[] paintArr = this.f21019c;
        int i13 = this.f21025k;
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
                    } else if (drawable instanceof jn0) {
                        ((jn0) drawable).b(i10);
                    } else if (drawable instanceof fk0) {
                        String str = this.f21022g;
                        if (str != null) {
                            ((fk0) drawable).Q(i10, str);
                        }
                    } else if (drawable instanceof hr) {
                        if ((i13 & 32) != 0) {
                            ((hr) drawable).f26889a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((hr) drawable).f26890b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof j9) {
                        ((j9) drawable).h(i10);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.f23598a.setColor(i10);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.f21020e;
        View view = this.f21017a;
        if (view != null && clsArr == null && this.f21026l == null && ((i13 & 262144) == 0 || b(i11, view))) {
            if ((i13 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof vb0) {
                    vb0 vb0Var = (vb0) background;
                    vb0Var.f31478a.setColor(i10);
                    vb0Var.f31479b = null;
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
                    if (background2 instanceof hr) {
                        if ((i13 & 65536) != 0) {
                            background2 = ((hr) background2).f26889a;
                        } else {
                            background2 = ((hr) background2).f26890b;
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
                ((k) view).E(i10, false);
            }
            if ((i13 & 128) != 0) {
                ((k) view).setTitleColor(i10);
            }
            if ((i13 & 256) != 0) {
                ((k) view).D(i10, false);
            }
            if ((4194304 & i13) != 0) {
                ((k) view).D(i10, true);
            }
            if ((i13 & 512) != 0) {
                ((k) view).E(i10, true);
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
                ((k) view).I(i10, true);
            }
            if ((134217728 & i13) != 0) {
                ((k) view).I(i10, false);
            }
            if ((1073741824 & i13) != 0) {
                k kVar = (k) view;
                if ((i13 & 8) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                kVar.G(i10, z13, false);
            }
            if ((Integer.MIN_VALUE & i13) != 0) {
                ((k) view).F(i10, false);
            }
        }
        if (view instanceof f00) {
            if ((i13 & 4) != 0) {
                ((f00) view).setTextColor(i10);
            } else if ((i13 & 2048) != 0) {
                ((f00) view).setProgressBarColor(i10);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        } else if (view instanceof s90) {
            if ((i13 & 2048) != 0) {
                ((s90) view).setProgressColor(i10);
            } else {
                ((s90) view).setBackColor(i10);
            }
        } else if (view instanceof lr) {
            ((lr) view).b();
        } else if ((view instanceof qp0) && (i13 & 2048) != 0) {
            ((qp0) view).setOuterColor(i10);
        }
        if ((i13 & 4) != 0 && ((i13 & 262144) == 0 || b(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof h5) {
                ((h5) view).setTextColor(i10);
            } else if (view instanceof xo) {
                ((xo) view).setTextColor(i10);
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
            } else if (!(view instanceof y9)) {
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
        boolean z15 = view instanceof wm0;
        if (z15) {
            wm0 wm0Var = (wm0) view;
            if ((i13 & 4096) != 0) {
                wm0Var.setListSelectorColor(Integer.valueOf(i10));
            }
            if ((33554432 & i13) != 0 && (dm0Var = wm0Var.f32447d1) != null) {
                dm0Var.c();
            }
            if ((32768 & i13) != 0) {
                wm0Var.setGlowColor(i10);
            }
            if ((524288 & i13) != 0) {
                ArrayList<View> headers = wm0Var.getHeaders();
                if (headers != null) {
                    for (int i15 = 0; i15 < headers.size(); i15++) {
                        d(i10, headers.get(i15));
                    }
                }
                ArrayList<View> headersCache = wm0Var.getHeadersCache();
                if (headersCache != null) {
                    for (int i16 = 0; i16 < headersCache.size(); i16++) {
                        d(i10, headersCache.get(i16));
                    }
                }
                View pinnedHeader = wm0Var.getPinnedHeader();
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
                wm0 wm0Var2 = (wm0) view;
                wm0Var2.getRecycledViewPool().a();
                int hiddenChildCount = wm0Var2.getHiddenChildCount();
                for (int i17 = 0; i17 < hiddenChildCount; i17++) {
                    d(i10, wm0Var2.V(i17));
                }
                int cachedChildCount = wm0Var2.getCachedChildCount();
                for (int i18 = 0; i18 < cachedChildCount; i18++) {
                    d(i10, wm0Var2.P(i18));
                }
                int attachedScrapChildCount = wm0Var2.getAttachedScrapChildCount();
                for (int i19 = 0; i19 < attachedScrapChildCount; i19++) {
                    d(i10, wm0Var2.O(i19));
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
        this.f21018b = -1;
        this.f21024j = new boolean[1];
        this.f21021f = i11;
        if (paint != null) {
            this.f21019c = new Paint[]{paint};
        }
        this.d = drawableArr;
        this.f21017a = view;
        this.f21025k = i10;
        this.f21020e = clsArr;
        this.h = i6Var;
        if (view instanceof cv) {
            this.f21017a = ((cv) view).getEditText();
        }
    }

    public j6(View view, Class[] clsArr, fk0[] fk0VarArr, String str, int i10) {
        this.f21018b = -1;
        this.f21024j = new boolean[1];
        this.f21021f = i10;
        this.f21022g = str;
        this.d = fk0VarArr;
        this.f21017a = view;
        this.f21025k = 0;
        this.f21020e = clsArr;
        if (view instanceof cv) {
            this.f21017a = ((cv) view).getEditText();
        }
    }

    public j6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, i6 i6Var, int i11) {
        this(view, i10, clsArr, strArr, paintArr, drawableArr, -1, i6Var, i11);
    }

    public j6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, int i11, i6 i6Var, int i12) {
        this.f21024j = new boolean[1];
        this.f21021f = i12;
        this.f21019c = paintArr;
        this.d = drawableArr;
        this.f21017a = view;
        this.f21025k = i10;
        this.f21020e = clsArr;
        this.f21026l = strArr;
        this.f21018b = i11;
        this.h = i6Var;
        this.f21027m = new HashMap();
        this.f21028n = new HashMap();
        if (view instanceof cv) {
            this.f21017a = ((cv) view).getEditText();
        }
    }

    public j6(UndoView undoView, Class[] clsArr, String[] strArr, String str, int i10) {
        this.f21018b = -1;
        this.f21024j = new boolean[1];
        this.f21021f = i10;
        this.f21022g = str;
        this.f21017a = undoView;
        this.f21025k = 0;
        this.f21020e = clsArr;
        this.f21026l = strArr;
        this.f21027m = new HashMap();
        this.f21028n = new HashMap();
    }
}
