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
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.z8;
import org.telegram.ui.Components.zn;
public final class l6 {
    public final View f20406a;
    public final int f20407b;
    public final Paint[] f20408c;
    public final Drawable[] d;
    public final Class[] e;
    public final int f20409f;
    public final String f20410g;
    public k6 h;
    public int f20411i;
    public final boolean[] f20412j;
    public final int f20413k;
    public final String[] f20414l;
    public final HashMap f20415m;
    public final HashMap f20416n;
    public f6 f20417o;

    public l6(View view, int i10, Class[] clsArr, Paint[] paintArr, int i11) {
        this.f20407b = -1;
        this.f20412j = new boolean[1];
        this.f20409f = i11;
        this.f20408c = paintArr;
        this.d = null;
        this.f20406a = view;
        this.f20413k = i10;
        this.e = clsArr;
        this.h = null;
        if (view instanceof cu) {
            this.f20406a = ((cu) view).getEditText();
        }
    }

    public static boolean a(int i10, View view) {
        if (i10 >= 0 && view != null) {
            Object tag = view.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int b() {
        Integer num;
        f6 f6Var = this.f20417o;
        int i10 = this.f20409f;
        if (f6Var != null) {
            num = Integer.valueOf(f6Var.x0(i10));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return j6.w0(null, i10, false);
    }

    public final void c(int i10, View view) {
        int i11;
        TextView nextTextView;
        boolean z4;
        boolean z10;
        Field field;
        Object obj;
        TextView nextTextView2;
        f51[] f51VarArr;
        TextView nextTextView3;
        f51[] f51VarArr2;
        boolean z11;
        f51[] f51VarArr3;
        HashMap hashMap = this.f20415m;
        int i12 = 0;
        while (true) {
            Class[] clsArr = this.e;
            if (i12 < clsArr.length) {
                if (clsArr[i12].isInstance(view)) {
                    view.invalidate();
                    int i13 = this.f20413k;
                    int i14 = 262144 & i13;
                    int i15 = this.f20409f;
                    String[] strArr = this.f20414l;
                    if (i14 != 0 && !a(i15, view)) {
                        z4 = false;
                        i11 = 65536;
                    } else {
                        view.invalidate();
                        if (strArr == null && (i13 & 32) != 0) {
                            Drawable background = view.getBackground();
                            if (background != null) {
                                if ((i13 & 16) != 0) {
                                    if (background instanceof mq) {
                                        Drawable drawable = ((mq) background).f27109a;
                                        if (drawable instanceof ColorDrawable) {
                                            ((ColorDrawable) drawable).setColor(i10);
                                        }
                                    }
                                } else {
                                    if (background instanceof mq) {
                                        background = ((mq) background).f27110b;
                                    } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                        if ((i13 & 65536) != 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        j6.B1(background, i10, z10);
                                    }
                                    i11 = 65536;
                                    background.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                }
                            }
                            i11 = 65536;
                        } else {
                            i11 = 65536;
                            if ((i13 & 16) != 0) {
                                view.setBackgroundColor(i10);
                            } else if ((i13 & 4) != 0) {
                                if (view instanceof TextView) {
                                    ((TextView) view).setTextColor(i10);
                                } else if (view instanceof w7) {
                                    for (int i16 = 0; i16 < 2; i16++) {
                                        w7 w7Var = (w7) view;
                                        if (i16 == 0) {
                                            nextTextView = w7Var.getTextView();
                                        } else {
                                            nextTextView = w7Var.getNextTextView();
                                        }
                                        if (nextTextView != null) {
                                            nextTextView.setTextColor(i10);
                                        }
                                    }
                                }
                            } else if ((536870912 & i13) == 0) {
                                if ((i13 & 4096) != 0) {
                                    view.setBackgroundDrawable(j6.K0(false));
                                } else if ((268435456 & i13) != 0) {
                                    view.setBackgroundDrawable(j6.K0(true));
                                }
                            }
                        }
                        z4 = true;
                    }
                    if (strArr != null) {
                        String str = clsArr[i12] + "_" + strArr[i12];
                        HashMap hashMap2 = this.f20416n;
                        if (hashMap2 == null || !hashMap2.containsKey(str)) {
                            try {
                                Field field2 = (Field) hashMap.get(str);
                                if (field2 == null) {
                                    field = clsArr[i12].getDeclaredField(strArr[i12]);
                                    if (field != null) {
                                        field.setAccessible(true);
                                        hashMap.put(str, field);
                                    }
                                } else {
                                    field = field2;
                                }
                                if (field != null && (obj = field.get(view)) != null && (z4 || !(obj instanceof View) || a(i15, (View) obj))) {
                                    if (obj instanceof View) {
                                        ((View) obj).invalidate();
                                    }
                                    String str2 = this.f20410g;
                                    if (str2 != null && (obj instanceof jj0)) {
                                        ((jj0) obj).h(i10, str2);
                                    }
                                    if ((131072 & i13) != 0 && (obj instanceof View)) {
                                        obj = ((View) obj).getBackground();
                                    }
                                    if ((i13 & 1) != 0 && (obj instanceof View)) {
                                        View view2 = (View) obj;
                                        Drawable background2 = view2.getBackground();
                                        if (background2 instanceof sa0) {
                                            ((sa0) background2).f28707a.setColor(i10);
                                            ((sa0) background2).f28708b = null;
                                        } else {
                                            view2.setBackgroundColor(i10);
                                        }
                                    } else if (obj instanceof ut) {
                                        if ((8388608 & i13) != 0) {
                                            ((ut) obj).setHintColor(i10);
                                            ((ut) obj).setHintTextColor(i10);
                                        } else if ((16777216 & i13) != 0) {
                                            ((ut) obj).setCursorColor(i10);
                                        } else {
                                            ((ut) obj).setTextColor(i10);
                                        }
                                    } else if (obj instanceof k5) {
                                        if ((i13 & 2) != 0) {
                                            ((k5) obj).setLinkTextColor(i10);
                                        } else {
                                            ((k5) obj).setTextColor(i10);
                                        }
                                    } else if (obj instanceof TextView) {
                                        TextView textView = (TextView) obj;
                                        if ((i13 & 8) != 0) {
                                            Drawable[] compoundDrawables = textView.getCompoundDrawables();
                                            if (compoundDrawables != null) {
                                                for (Drawable drawable2 : compoundDrawables) {
                                                    if (drawable2 != null) {
                                                        drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                                    }
                                                }
                                            }
                                        } else if ((i13 & 2) != 0) {
                                            textView.getPaint().linkColor = i10;
                                            textView.invalidate();
                                        } else if ((i13 & 33554432) != 0) {
                                            CharSequence text = textView.getText();
                                            if ((text instanceof SpannedString) && (f51VarArr3 = (f51[]) ((SpannedString) text).getSpans(0, ((SpannedString) text).length(), f51.class)) != null && f51VarArr3.length > 0) {
                                                for (f51 f51Var : f51VarArr3) {
                                                    f51Var.f24805b = i10;
                                                }
                                            }
                                        } else {
                                            textView.setTextColor(i10);
                                        }
                                    } else if (obj instanceof ImageView) {
                                        ImageView imageView = (ImageView) obj;
                                        Drawable drawable3 = imageView.getDrawable();
                                        if (drawable3 instanceof mq) {
                                            if ((i13 & 32) != 0) {
                                                ((mq) drawable3).f27109a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                            } else {
                                                ((mq) drawable3).f27110b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                            }
                                        } else {
                                            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else if (obj instanceof p9) {
                                        Drawable staticThumb = ((p9) obj).getImageReceiver().getStaticThumb();
                                        if (staticThumb instanceof mq) {
                                            if ((i13 & 32) != 0) {
                                                ((mq) staticThumb).f27109a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                            } else {
                                                ((mq) staticThumb).f27110b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                            }
                                        } else if (staticThumb != null) {
                                            staticThumb.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else if (obj instanceof Drawable) {
                                        if (obj instanceof n80) {
                                            if ((i13 & 32) != 0) {
                                                n80 n80Var = (n80) obj;
                                                n80.f27220j.setColor(i10);
                                            } else {
                                                ((n80) obj).h.setColor(i10);
                                            }
                                        } else if (obj instanceof mq) {
                                            if ((i13 & 32) != 0) {
                                                ((mq) obj).f27109a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                            } else {
                                                ((mq) obj).f27110b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                            }
                                        } else {
                                            if (!(obj instanceof StateListDrawable) && !(obj instanceof RippleDrawable)) {
                                                if (obj instanceof GradientDrawable) {
                                                    ((GradientDrawable) obj).setColor(i10);
                                                } else {
                                                    ((Drawable) obj).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                                }
                                            }
                                            Drawable drawable4 = (Drawable) obj;
                                            if ((i13 & i11) != 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            j6.B1(drawable4, i10, z11);
                                        }
                                    } else if (obj instanceof CheckBox) {
                                        if ((i13 & 8192) != 0) {
                                            ((CheckBox) obj).setBackgroundColor(i10);
                                        } else if ((i13 & 16384) != 0) {
                                            ((CheckBox) obj).setCheckColor(i10);
                                        }
                                    } else if (!(obj instanceof GroupCreateCheckBox)) {
                                        if (obj instanceof Integer) {
                                            field.set(view, Integer.valueOf(i10));
                                        } else if (obj instanceof RadioButton) {
                                            if ((i13 & 8192) != 0) {
                                                ((RadioButton) obj).setBackgroundColor(i10);
                                                ((RadioButton) obj).invalidate();
                                            } else if ((i13 & 16384) != 0) {
                                                ((RadioButton) obj).setCheckedColor(i10);
                                                ((RadioButton) obj).invalidate();
                                            }
                                        } else if (obj instanceof TextPaint) {
                                            if ((i13 & 2) != 0) {
                                                ((TextPaint) obj).linkColor = i10;
                                            } else {
                                                ((TextPaint) obj).setColor(i10);
                                            }
                                        } else if (obj instanceof o80) {
                                            if ((i13 & 2048) != 0) {
                                                ((o80) obj).setProgressColor(i10);
                                            } else {
                                                ((o80) obj).setBackColor(i10);
                                            }
                                        } else if (obj instanceof RadialProgressView) {
                                            ((RadialProgressView) obj).setProgressColor(i10);
                                        } else if (obj instanceof Paint) {
                                            ((Paint) obj).setColor(i10);
                                            view.invalidate();
                                        } else if (obj instanceof jo0) {
                                            if ((i13 & 2048) != 0) {
                                                ((jo0) obj).setOuterColor(i10);
                                            } else {
                                                ((jo0) obj).setInnerColor(i10);
                                            }
                                        } else if (obj instanceof w7) {
                                            if ((i13 & 33554432) != 0) {
                                                for (int i17 = 0; i17 < 2; i17++) {
                                                    if (i17 == 0) {
                                                        nextTextView3 = ((w7) obj).getTextView();
                                                    } else {
                                                        nextTextView3 = ((w7) obj).getNextTextView();
                                                    }
                                                    if (nextTextView3 != null) {
                                                        CharSequence text2 = nextTextView3.getText();
                                                        if ((text2 instanceof SpannedString) && (f51VarArr2 = (f51[]) ((SpannedString) text2).getSpans(0, ((SpannedString) text2).length(), f51.class)) != null && f51VarArr2.length > 0) {
                                                            for (f51 f51Var2 : f51VarArr2) {
                                                                f51Var2.f24805b = i10;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if ((i13 & 4) != 0 && (i14 == 0 || a(i15, (View) obj))) {
                                                for (int i18 = 0; i18 < 2; i18++) {
                                                    if (i18 == 0) {
                                                        nextTextView2 = ((w7) obj).getTextView();
                                                    } else {
                                                        nextTextView2 = ((w7) obj).getNextTextView();
                                                    }
                                                    if (nextTextView2 != null) {
                                                        nextTextView2.setTextColor(i10);
                                                        CharSequence text3 = nextTextView2.getText();
                                                        if ((text3 instanceof SpannedString) && (f51VarArr = (f51[]) ((SpannedString) text3).getSpans(0, ((SpannedString) text3).length(), f51.class)) != null && f51VarArr.length > 0) {
                                                            for (f51 f51Var3 : f51VarArr) {
                                                                f51Var3.f24805b = i10;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        int i19 = GroupCreateCheckBox.f23031b;
                                        j6.u0(0);
                                        throw null;
                                        break;
                                    }
                                }
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                hashMap2.put(str, Boolean.TRUE);
                            }
                        }
                    } else if (view instanceof o30) {
                        ((o30) view).c();
                    }
                }
                i12++;
            } else {
                return;
            }
        }
    }

    public final void d(int i10, boolean z4, boolean z10) {
        al0 al0Var;
        Drawable[] compoundDrawables;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11 = this.f20409f;
        if (z10) {
            j6.u1(i11, i10, z4);
        }
        int i12 = this.f20407b;
        if (i12 > 0) {
            i10 = Color.argb(i12, Color.red(i10), Color.green(i10), Color.blue(i10));
        }
        Paint[] paintArr = this.f20408c;
        int i13 = this.f20413k;
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
                    if (drawable instanceof i2) {
                        ((i2) drawable).a(i10);
                    } else if (drawable instanceof em0) {
                        ((em0) drawable).b(i10);
                    } else if (drawable instanceof gj0) {
                        String str = this.f20410g;
                        if (str != null) {
                            ((gj0) drawable).O(i10, str);
                        }
                    } else if (drawable instanceof mq) {
                        if ((i13 & 32) != 0) {
                            ((mq) drawable).f27109a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((mq) drawable).f27110b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof z8) {
                        ((z8) drawable).h(i10);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.f22686a.setColor(i10);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.e;
        View view = this.f20406a;
        if (view != null && clsArr == null && this.f20414l == null && ((i13 & 262144) == 0 || a(i11, view))) {
            if ((i13 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof sa0) {
                    sa0 sa0Var = (sa0) background;
                    sa0Var.f28707a.setColor(i10);
                    sa0Var.f28708b = null;
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
                    if (background2 instanceof mq) {
                        if ((i13 & 65536) != 0) {
                            background2 = ((mq) background2).f27109a;
                        } else {
                            background2 = ((mq) background2).f27110b;
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
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            j6.B1(background2, i10, z13);
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
                    z12 = true;
                } else {
                    z12 = false;
                }
                kVar.E(i10, z12, false);
            }
            if ((Integer.MIN_VALUE & i13) != 0) {
                ((k) view).D(i10, false);
            }
        }
        if (view instanceof mz) {
            if ((i13 & 4) != 0) {
                ((mz) view).setTextColor(i10);
            } else if ((i13 & 2048) != 0) {
                ((mz) view).setProgressBarColor(i10);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        } else if (view instanceof o80) {
            if ((i13 & 2048) != 0) {
                ((o80) view).setProgressColor(i10);
            } else {
                ((o80) view).setBackColor(i10);
            }
        } else if (view instanceof qq) {
            ((qq) view).b();
        } else if ((view instanceof jo0) && (i13 & 2048) != 0) {
            ((jo0) view).setOuterColor(i10);
        }
        if ((i13 & 4) != 0 && ((i13 & 262144) == 0 || a(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof k5) {
                ((k5) view).setTextColor(i10);
            } else if (view instanceof zn) {
                ((zn) view).setTextColor(i10);
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
        if ((i13 & 8) != 0 && ((262144 & i13) == 0 || a(i11, view))) {
            if (view instanceof ImageView) {
                if ((131072 & i13) != 0) {
                    Drawable drawable2 = ((ImageView) view).getDrawable();
                    if ((drawable2 instanceof StateListDrawable) || (drawable2 instanceof RippleDrawable)) {
                        if ((65536 & i13) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        j6.B1(drawable2, i10, z11);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof p9)) {
                if (view instanceof k5) {
                    ((k5) view).setSideDrawablesColor(i10);
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
        if ((view instanceof m2.h) && (i13 & 32768) != 0) {
            AndroidUtilities.setViewPagerEdgeEffectColor((m2.h) view, i10);
        }
        boolean z14 = view instanceof rl0;
        if (z14) {
            rl0 rl0Var = (rl0) view;
            if ((i13 & 4096) != 0) {
                rl0Var.setListSelectorColor(Integer.valueOf(i10));
            }
            if ((33554432 & i13) != 0 && (al0Var = rl0Var.f28491c1) != null) {
                al0Var.c();
            }
            if ((32768 & i13) != 0) {
                rl0Var.setGlowColor(i10);
            }
            if ((524288 & i13) != 0) {
                ArrayList<View> headers = rl0Var.getHeaders();
                if (headers != null) {
                    for (int i15 = 0; i15 < headers.size(); i15++) {
                        c(i10, headers.get(i15));
                    }
                }
                ArrayList<View> headersCache = rl0Var.getHeadersCache();
                if (headersCache != null) {
                    for (int i16 = 0; i16 < headersCache.size(); i16++) {
                        c(i10, headersCache.get(i16));
                    }
                }
                View pinnedHeader = rl0Var.getPinnedHeader();
                if (pinnedHeader != null) {
                    c(i10, pinnedHeader);
                }
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i13 & 4096) != 0) {
                view.setBackgroundDrawable(j6.K0(false));
            } else if ((268435456 & i13) != 0) {
                view.setBackgroundDrawable(j6.K0(true));
            }
        }
        if (clsArr != null) {
            if (z14) {
                rl0 rl0Var2 = (rl0) view;
                rl0Var2.getRecycledViewPool().a();
                int hiddenChildCount = rl0Var2.getHiddenChildCount();
                for (int i17 = 0; i17 < hiddenChildCount; i17++) {
                    c(i10, rl0Var2.V(i17));
                }
                int cachedChildCount = rl0Var2.getCachedChildCount();
                for (int i18 = 0; i18 < cachedChildCount; i18++) {
                    c(i10, rl0Var2.P(i18));
                }
                int attachedScrapChildCount = rl0Var2.getAttachedScrapChildCount();
                for (int i19 = 0; i19 < attachedScrapChildCount; i19++) {
                    c(i10, rl0Var2.O(i19));
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    c(i10, viewGroup.getChildAt(i20));
                }
            }
            c(i10, view);
        }
        k6 k6Var = this.h;
        if (k6Var != null) {
            k6Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public l6(View view, int i10, Class[] clsArr, Paint paint, Drawable[] drawableArr, k6 k6Var, int i11) {
        this.f20407b = -1;
        this.f20412j = new boolean[1];
        this.f20409f = i11;
        if (paint != null) {
            this.f20408c = new Paint[]{paint};
        }
        this.d = drawableArr;
        this.f20406a = view;
        this.f20413k = i10;
        this.e = clsArr;
        this.h = k6Var;
        if (view instanceof cu) {
            this.f20406a = ((cu) view).getEditText();
        }
    }

    public l6(View view, Class[] clsArr, gj0[] gj0VarArr, String str, int i10) {
        this.f20407b = -1;
        this.f20412j = new boolean[1];
        this.f20409f = i10;
        this.f20410g = str;
        this.d = gj0VarArr;
        this.f20406a = view;
        this.f20413k = 0;
        this.e = clsArr;
        if (view instanceof cu) {
            this.f20406a = ((cu) view).getEditText();
        }
    }

    public l6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, k6 k6Var, int i11) {
        this(view, i10, clsArr, strArr, paintArr, drawableArr, -1, k6Var, i11);
    }

    public l6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, int i11, k6 k6Var, int i12) {
        this.f20412j = new boolean[1];
        this.f20409f = i12;
        this.f20408c = paintArr;
        this.d = drawableArr;
        this.f20406a = view;
        this.f20413k = i10;
        this.e = clsArr;
        this.f20414l = strArr;
        this.f20407b = i11;
        this.h = k6Var;
        this.f20415m = new HashMap();
        this.f20416n = new HashMap();
        if (view instanceof cu) {
            this.f20406a = ((cu) view).getEditText();
        }
    }

    public l6(UndoView undoView, Class[] clsArr, String[] strArr, String str, int i10) {
        this.f20407b = -1;
        this.f20412j = new boolean[1];
        this.f20409f = i10;
        this.f20410g = str;
        this.f20406a = undoView;
        this.f20413k = 0;
        this.e = clsArr;
        this.f20414l = strArr;
        this.f20415m = new HashMap();
        this.f20416n = new HashMap();
    }
}
