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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.z8;
public final class h6 {
    public final View f23494a;
    public final int f23495b;
    public final Paint[] f23496c;
    public final Drawable[] d;
    public final Class[] f23497e;
    public final int f23498f;
    public final String f23499g;
    public g6 h;
    public int f23500i;
    public final boolean[] f23501j;
    public final int f23502k;
    public final String[] f23503l;
    public final HashMap f23504m;
    public final HashMap f23505n;
    public b6 f23506o;

    public h6(View view, int i9, Class[] clsArr, Paint[] paintArr, int i10) {
        this.f23495b = -1;
        this.f23501j = new boolean[1];
        this.f23498f = i10;
        this.f23496c = paintArr;
        this.d = null;
        this.f23494a = view;
        this.f23502k = i9;
        this.f23497e = clsArr;
        this.h = null;
        if (view instanceof ut) {
            this.f23494a = ((ut) view).getEditText();
        }
    }

    public static boolean a(int i9, View view) {
        if (i9 >= 0 && view != null) {
            Object tag = view.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i9) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int b() {
        Integer num;
        b6 b6Var = this.f23506o;
        int i9 = this.f23498f;
        if (b6Var != null) {
            num = Integer.valueOf(b6Var.N0(i9));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return f6.w0(null, i9, false);
    }

    public final void c(int i9, View view) {
        int i10;
        TextView nextTextView;
        boolean z10;
        boolean z11;
        Field field;
        Object obj;
        TextView nextTextView2;
        i41[] i41VarArr;
        TextView nextTextView3;
        i41[] i41VarArr2;
        boolean z12;
        i41[] i41VarArr3;
        HashMap hashMap = this.f23504m;
        int i11 = 0;
        while (true) {
            Class[] clsArr = this.f23497e;
            if (i11 < clsArr.length) {
                if (clsArr[i11].isInstance(view)) {
                    view.invalidate();
                    int i12 = this.f23502k;
                    int i13 = 262144 & i12;
                    int i14 = this.f23498f;
                    String[] strArr = this.f23503l;
                    if (i13 != 0 && !a(i14, view)) {
                        z10 = false;
                        i10 = 65536;
                    } else {
                        view.invalidate();
                        if (strArr == null && (i12 & 32) != 0) {
                            Drawable background = view.getBackground();
                            if (background != null) {
                                if ((i12 & 16) != 0) {
                                    if (background instanceof fq) {
                                        Drawable drawable = ((fq) background).f28542a;
                                        if (drawable instanceof ColorDrawable) {
                                            ((ColorDrawable) drawable).setColor(i9);
                                        }
                                    }
                                } else {
                                    if (background instanceof fq) {
                                        background = ((fq) background).f28543b;
                                    } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                        if ((i12 & 65536) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        f6.B1(background, i9, z11);
                                    }
                                    i10 = 65536;
                                    background.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                }
                            }
                            i10 = 65536;
                        } else {
                            i10 = 65536;
                            if ((i12 & 16) != 0) {
                                view.setBackgroundColor(i9);
                            } else if ((i12 & 4) != 0) {
                                if (view instanceof TextView) {
                                    ((TextView) view).setTextColor(i9);
                                } else if (view instanceof w7) {
                                    for (int i15 = 0; i15 < 2; i15++) {
                                        w7 w7Var = (w7) view;
                                        if (i15 == 0) {
                                            nextTextView = w7Var.getTextView();
                                        } else {
                                            nextTextView = w7Var.getNextTextView();
                                        }
                                        if (nextTextView != null) {
                                            nextTextView.setTextColor(i9);
                                        }
                                    }
                                }
                            } else if ((536870912 & i12) == 0) {
                                if ((i12 & 4096) != 0) {
                                    view.setBackgroundDrawable(f6.K0(false));
                                } else if ((268435456 & i12) != 0) {
                                    view.setBackgroundDrawable(f6.K0(true));
                                }
                            }
                        }
                        z10 = true;
                    }
                    if (strArr != null) {
                        String str = clsArr[i11] + "_" + strArr[i11];
                        HashMap hashMap2 = this.f23505n;
                        if (hashMap2 == null || !hashMap2.containsKey(str)) {
                            try {
                                Field field2 = (Field) hashMap.get(str);
                                if (field2 == null) {
                                    field = clsArr[i11].getDeclaredField(strArr[i11]);
                                    if (field != null) {
                                        field.setAccessible(true);
                                        hashMap.put(str, field);
                                    }
                                } else {
                                    field = field2;
                                }
                                if (field != null && (obj = field.get(view)) != null && (z10 || !(obj instanceof View) || a(i14, (View) obj))) {
                                    if (obj instanceof View) {
                                        ((View) obj).invalidate();
                                    }
                                    String str2 = this.f23499g;
                                    if (str2 != null && (obj instanceof pi0)) {
                                        ((pi0) obj).h(i9, str2);
                                    }
                                    if ((131072 & i12) != 0 && (obj instanceof View)) {
                                        obj = ((View) obj).getBackground();
                                    }
                                    if ((i12 & 1) != 0 && (obj instanceof View)) {
                                        View view2 = (View) obj;
                                        Drawable background2 = view2.getBackground();
                                        if (background2 instanceof y90) {
                                            ((y90) background2).f34902a.setColor(i9);
                                            ((y90) background2).f34903b = null;
                                        } else {
                                            view2.setBackgroundColor(i9);
                                        }
                                    } else if (obj instanceof mt) {
                                        if ((8388608 & i12) != 0) {
                                            ((mt) obj).setHintColor(i9);
                                            ((mt) obj).setHintTextColor(i9);
                                        } else if ((16777216 & i12) != 0) {
                                            ((mt) obj).setCursorColor(i9);
                                        } else {
                                            ((mt) obj).setTextColor(i9);
                                        }
                                    } else if (obj instanceof h5) {
                                        if ((i12 & 2) != 0) {
                                            ((h5) obj).setLinkTextColor(i9);
                                        } else {
                                            ((h5) obj).setTextColor(i9);
                                        }
                                    } else if (obj instanceof TextView) {
                                        TextView textView = (TextView) obj;
                                        if ((i12 & 8) != 0) {
                                            Drawable[] compoundDrawables = textView.getCompoundDrawables();
                                            if (compoundDrawables != null) {
                                                for (Drawable drawable2 : compoundDrawables) {
                                                    if (drawable2 != null) {
                                                        drawable2.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                                    }
                                                }
                                            }
                                        } else if ((i12 & 2) != 0) {
                                            textView.getPaint().linkColor = i9;
                                            textView.invalidate();
                                        } else if ((i12 & 33554432) != 0) {
                                            CharSequence text = textView.getText();
                                            if ((text instanceof SpannedString) && (i41VarArr3 = (i41[]) ((SpannedString) text).getSpans(0, ((SpannedString) text).length(), i41.class)) != null && i41VarArr3.length > 0) {
                                                for (i41 i41Var : i41VarArr3) {
                                                    i41Var.f29313b = i9;
                                                }
                                            }
                                        } else {
                                            textView.setTextColor(i9);
                                        }
                                    } else if (obj instanceof ImageView) {
                                        ImageView imageView = (ImageView) obj;
                                        Drawable drawable3 = imageView.getDrawable();
                                        if (drawable3 instanceof fq) {
                                            if ((i12 & 32) != 0) {
                                                ((fq) drawable3).f28542a.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                            } else {
                                                ((fq) drawable3).f28543b.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                            }
                                        } else {
                                            imageView.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else if (obj instanceof o9) {
                                        Drawable staticThumb = ((o9) obj).getImageReceiver().getStaticThumb();
                                        if (staticThumb instanceof fq) {
                                            if ((i12 & 32) != 0) {
                                                ((fq) staticThumb).f28542a.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                            } else {
                                                ((fq) staticThumb).f28543b.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                            }
                                        } else if (staticThumb != null) {
                                            staticThumb.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else if (obj instanceof Drawable) {
                                        if (obj instanceof u70) {
                                            if ((i12 & 32) != 0) {
                                                u70 u70Var = (u70) obj;
                                                u70.f32937j.setColor(i9);
                                            } else {
                                                ((u70) obj).h.setColor(i9);
                                            }
                                        } else if (obj instanceof fq) {
                                            if ((i12 & 32) != 0) {
                                                ((fq) obj).f28542a.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                            } else {
                                                ((fq) obj).f28543b.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                            }
                                        } else {
                                            if (!(obj instanceof StateListDrawable) && !(obj instanceof RippleDrawable)) {
                                                if (obj instanceof GradientDrawable) {
                                                    ((GradientDrawable) obj).setColor(i9);
                                                } else {
                                                    ((Drawable) obj).setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                                }
                                            }
                                            Drawable drawable4 = (Drawable) obj;
                                            if ((i12 & i10) != 0) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            f6.B1(drawable4, i9, z12);
                                        }
                                    } else if (obj instanceof CheckBox) {
                                        if ((i12 & 8192) != 0) {
                                            ((CheckBox) obj).setBackgroundColor(i9);
                                        } else if ((i12 & 16384) != 0) {
                                            ((CheckBox) obj).setCheckColor(i9);
                                        }
                                    } else if (!(obj instanceof GroupCreateCheckBox)) {
                                        if (obj instanceof Integer) {
                                            field.set(view, Integer.valueOf(i9));
                                        } else if (obj instanceof RadioButton) {
                                            if ((i12 & 8192) != 0) {
                                                ((RadioButton) obj).setBackgroundColor(i9);
                                                ((RadioButton) obj).invalidate();
                                            } else if ((i12 & 16384) != 0) {
                                                ((RadioButton) obj).setCheckedColor(i9);
                                                ((RadioButton) obj).invalidate();
                                            }
                                        } else if (obj instanceof TextPaint) {
                                            if ((i12 & 2) != 0) {
                                                ((TextPaint) obj).linkColor = i9;
                                            } else {
                                                ((TextPaint) obj).setColor(i9);
                                            }
                                        } else if (obj instanceof v70) {
                                            if ((i12 & 2048) != 0) {
                                                ((v70) obj).setProgressColor(i9);
                                            } else {
                                                ((v70) obj).setBackColor(i9);
                                            }
                                        } else if (obj instanceof RadialProgressView) {
                                            ((RadialProgressView) obj).setProgressColor(i9);
                                        } else if (obj instanceof Paint) {
                                            ((Paint) obj).setColor(i9);
                                            view.invalidate();
                                        } else if (obj instanceof pn0) {
                                            if ((i12 & 2048) != 0) {
                                                ((pn0) obj).setOuterColor(i9);
                                            } else {
                                                ((pn0) obj).setInnerColor(i9);
                                            }
                                        } else if (obj instanceof w7) {
                                            if ((i12 & 33554432) != 0) {
                                                for (int i16 = 0; i16 < 2; i16++) {
                                                    if (i16 == 0) {
                                                        nextTextView3 = ((w7) obj).getTextView();
                                                    } else {
                                                        nextTextView3 = ((w7) obj).getNextTextView();
                                                    }
                                                    if (nextTextView3 != null) {
                                                        CharSequence text2 = nextTextView3.getText();
                                                        if ((text2 instanceof SpannedString) && (i41VarArr2 = (i41[]) ((SpannedString) text2).getSpans(0, ((SpannedString) text2).length(), i41.class)) != null && i41VarArr2.length > 0) {
                                                            for (i41 i41Var2 : i41VarArr2) {
                                                                i41Var2.f29313b = i9;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if ((i12 & 4) != 0 && (i13 == 0 || a(i14, (View) obj))) {
                                                for (int i17 = 0; i17 < 2; i17++) {
                                                    if (i17 == 0) {
                                                        nextTextView2 = ((w7) obj).getTextView();
                                                    } else {
                                                        nextTextView2 = ((w7) obj).getNextTextView();
                                                    }
                                                    if (nextTextView2 != null) {
                                                        nextTextView2.setTextColor(i9);
                                                        CharSequence text3 = nextTextView2.getText();
                                                        if ((text3 instanceof SpannedString) && (i41VarArr = (i41[]) ((SpannedString) text3).getSpans(0, ((SpannedString) text3).length(), i41.class)) != null && i41VarArr.length > 0) {
                                                            for (i41 i41Var3 : i41VarArr) {
                                                                i41Var3.f29313b = i9;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        int i18 = GroupCreateCheckBox.f26410b;
                                        f6.u0(0);
                                        throw null;
                                        break;
                                    }
                                }
                            } catch (Throwable th) {
                                FileLog.e(th);
                                hashMap2.put(str, Boolean.TRUE);
                            }
                        }
                    } else if (view instanceof w20) {
                        ((w20) view).c();
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void d(int i9, boolean z10, boolean z11) {
        fk0 fk0Var;
        Drawable[] compoundDrawables;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10 = this.f23498f;
        if (z11) {
            f6.u1(i10, i9, z10);
        }
        int i11 = this.f23495b;
        if (i11 > 0) {
            i9 = Color.argb(i11, Color.red(i9), Color.green(i9), Color.blue(i9));
        }
        Paint[] paintArr = this.f23496c;
        int i12 = this.f23502k;
        if (paintArr != null) {
            for (int i13 = 0; i13 < paintArr.length; i13++) {
                if ((i12 & 2) != 0) {
                    Paint paint = paintArr[i13];
                    if (paint instanceof TextPaint) {
                        ((TextPaint) paint).linkColor = i9;
                    }
                }
                paintArr[i13].setColor(i9);
            }
        }
        Drawable[] drawableArr = this.d;
        if (drawableArr != null) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    if (drawable instanceof h2) {
                        ((h2) drawable).a(i9);
                    } else if (drawable instanceof il0) {
                        ((il0) drawable).b(i9);
                    } else if (drawable instanceof mi0) {
                        String str = this.f23499g;
                        if (str != null) {
                            ((mi0) drawable).O(i9, str);
                        }
                    } else if (drawable instanceof fq) {
                        if ((i12 & 32) != 0) {
                            ((fq) drawable).f28542a.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((fq) drawable).f28543b.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof z8) {
                        ((z8) drawable).h(i9);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.f26056a.setColor(i9);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.f23497e;
        View view = this.f23494a;
        if (view != null && clsArr == null && this.f23503l == null && ((i12 & 262144) == 0 || a(i10, view))) {
            if ((i12 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof y90) {
                    y90 y90Var = (y90) background;
                    y90Var.f34902a.setColor(i9);
                    y90Var.f34903b = null;
                } else {
                    view.setBackgroundColor(i9);
                }
            }
            if ((i12 & 32) != 0) {
                if ((i12 & 2048) != 0) {
                    if (view instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) view).setErrorLineColor(i9);
                    }
                } else {
                    Drawable background2 = view.getBackground();
                    if (background2 instanceof fq) {
                        if ((i12 & 65536) != 0) {
                            background2 = ((fq) background2).f28542a;
                        } else {
                            background2 = ((fq) background2).f28543b;
                        }
                    }
                    if (background2 != null) {
                        if (!(background2 instanceof StateListDrawable) && !(background2 instanceof RippleDrawable)) {
                            if (background2 instanceof ShapeDrawable) {
                                ((ShapeDrawable) background2).getPaint().setColor(i9);
                            } else {
                                background2.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                            }
                        } else {
                            if ((i12 & 65536) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            f6.B1(background2, i9, z14);
                        }
                    }
                }
            }
        }
        if (view instanceof k) {
            if ((i12 & 64) != 0) {
                ((k) view).C(i9, false);
            }
            if ((i12 & 128) != 0) {
                ((k) view).setTitleColor(i9);
            }
            if ((i12 & 256) != 0) {
                ((k) view).A(i9, false);
            }
            if ((4194304 & i12) != 0) {
                ((k) view).A(i9, true);
            }
            if ((i12 & 512) != 0) {
                ((k) view).C(i9, true);
            }
            if ((i12 & 1024) != 0) {
                ((k) view).setSubtitleColor(i9);
            }
            if ((1048576 & i12) != 0) {
                ((k) view).setActionModeColor(i9);
            }
            if ((2097152 & i12) != 0) {
                ((k) view).setActionModeTopColor(i9);
            }
            if ((67108864 & i12) != 0) {
                ((k) view).G(i9, true);
            }
            if ((134217728 & i12) != 0) {
                ((k) view).G(i9, false);
            }
            if ((1073741824 & i12) != 0) {
                k kVar = (k) view;
                if ((i12 & 8) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                kVar.E(i9, z13, false);
            }
            if ((Integer.MIN_VALUE & i12) != 0) {
                ((k) view).D(i9, false);
            }
        }
        if (view instanceof yy) {
            if ((i12 & 4) != 0) {
                ((yy) view).setTextColor(i9);
            } else if ((i12 & 2048) != 0) {
                ((yy) view).setProgressBarColor(i9);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i9);
        } else if (view instanceof v70) {
            if ((i12 & 2048) != 0) {
                ((v70) view).setProgressColor(i9);
            } else {
                ((v70) view).setBackColor(i9);
            }
        } else if (view instanceof jq) {
            ((jq) view).b();
        } else if ((view instanceof pn0) && (i12 & 2048) != 0) {
            ((pn0) view).setOuterColor(i9);
        }
        if ((i12 & 4) != 0 && ((i12 & 262144) == 0 || a(i10, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i9);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i9);
            } else if (view instanceof h5) {
                ((h5) view).setTextColor(i9);
            } else if (view instanceof un) {
                ((un) view).setTextColor(i9);
            }
        }
        if ((16777216 & i12) != 0 && (view instanceof EditTextBoldCursor)) {
            ((EditTextBoldCursor) view).setCursorColor(i9);
        }
        if ((8388608 & i12) != 0) {
            if (view instanceof EditTextBoldCursor) {
                if ((i12 & 2048) != 0) {
                    ((EditTextBoldCursor) view).setHeaderHintColor(i9);
                } else {
                    ((EditTextBoldCursor) view).setHintColor(i9);
                }
            } else if (view instanceof EditText) {
                ((EditText) view).setHintTextColor(i9);
            }
        }
        if ((i12 & 8) != 0 && ((262144 & i12) == 0 || a(i10, view))) {
            if (view instanceof ImageView) {
                if ((131072 & i12) != 0) {
                    Drawable drawable2 = ((ImageView) view).getDrawable();
                    if ((drawable2 instanceof StateListDrawable) || (drawable2 instanceof RippleDrawable)) {
                        if ((65536 & i12) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        f6.B1(drawable2, i9, z12);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof o9)) {
                if (view instanceof h5) {
                    ((h5) view).setSideDrawablesColor(i9);
                } else if ((view instanceof TextView) && (compoundDrawables = ((TextView) view).getCompoundDrawables()) != null) {
                    for (Drawable drawable3 : compoundDrawables) {
                        if (drawable3 != null) {
                            drawable3.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                }
            }
        }
        if ((view instanceof ScrollView) && (i12 & 32768) != 0) {
            AndroidUtilities.setScrollViewEdgeEffectColor((ScrollView) view, i9);
        }
        if ((view instanceof m2.g) && (i12 & 32768) != 0) {
            AndroidUtilities.setViewPagerEdgeEffectColor((m2.g) view, i9);
        }
        boolean z15 = view instanceof wk0;
        if (z15) {
            wk0 wk0Var = (wk0) view;
            if ((i12 & 4096) != 0) {
                wk0Var.setListSelectorColor(Integer.valueOf(i9));
            }
            if ((33554432 & i12) != 0 && (fk0Var = wk0Var.f34240b1) != null) {
                fk0Var.c();
            }
            if ((32768 & i12) != 0) {
                wk0Var.setGlowColor(i9);
            }
            if ((524288 & i12) != 0) {
                ArrayList<View> headers = wk0Var.getHeaders();
                if (headers != null) {
                    for (int i14 = 0; i14 < headers.size(); i14++) {
                        c(i9, headers.get(i14));
                    }
                }
                ArrayList<View> headersCache = wk0Var.getHeadersCache();
                if (headersCache != null) {
                    for (int i15 = 0; i15 < headersCache.size(); i15++) {
                        c(i9, headersCache.get(i15));
                    }
                }
                View pinnedHeader = wk0Var.getPinnedHeader();
                if (pinnedHeader != null) {
                    c(i9, pinnedHeader);
                }
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i12 & 4096) != 0) {
                view.setBackgroundDrawable(f6.K0(false));
            } else if ((268435456 & i12) != 0) {
                view.setBackgroundDrawable(f6.K0(true));
            }
        }
        if (clsArr != null) {
            if (z15) {
                wk0 wk0Var2 = (wk0) view;
                wk0Var2.getRecycledViewPool().a();
                int hiddenChildCount = wk0Var2.getHiddenChildCount();
                for (int i16 = 0; i16 < hiddenChildCount; i16++) {
                    c(i9, wk0Var2.V(i16));
                }
                int cachedChildCount = wk0Var2.getCachedChildCount();
                for (int i17 = 0; i17 < cachedChildCount; i17++) {
                    c(i9, wk0Var2.P(i17));
                }
                int attachedScrapChildCount = wk0Var2.getAttachedScrapChildCount();
                for (int i18 = 0; i18 < attachedScrapChildCount; i18++) {
                    c(i9, wk0Var2.O(i18));
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    c(i9, viewGroup.getChildAt(i19));
                }
            }
            c(i9, view);
        }
        g6 g6Var = this.h;
        if (g6Var != null) {
            g6Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public h6(View view, int i9, Class[] clsArr, Paint paint, Drawable[] drawableArr, g6 g6Var, int i10) {
        this.f23495b = -1;
        this.f23501j = new boolean[1];
        this.f23498f = i10;
        if (paint != null) {
            this.f23496c = new Paint[]{paint};
        }
        this.d = drawableArr;
        this.f23494a = view;
        this.f23502k = i9;
        this.f23497e = clsArr;
        this.h = g6Var;
        if (view instanceof ut) {
            this.f23494a = ((ut) view).getEditText();
        }
    }

    public h6(View view, Class[] clsArr, mi0[] mi0VarArr, String str, int i9) {
        this.f23495b = -1;
        this.f23501j = new boolean[1];
        this.f23498f = i9;
        this.f23499g = str;
        this.d = mi0VarArr;
        this.f23494a = view;
        this.f23502k = 0;
        this.f23497e = clsArr;
        if (view instanceof ut) {
            this.f23494a = ((ut) view).getEditText();
        }
    }

    public h6(View view, int i9, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, g6 g6Var, int i10) {
        this(view, i9, clsArr, strArr, paintArr, drawableArr, -1, g6Var, i10);
    }

    public h6(View view, int i9, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, int i10, g6 g6Var, int i11) {
        this.f23501j = new boolean[1];
        this.f23498f = i11;
        this.f23496c = paintArr;
        this.d = drawableArr;
        this.f23494a = view;
        this.f23502k = i9;
        this.f23497e = clsArr;
        this.f23503l = strArr;
        this.f23495b = i10;
        this.h = g6Var;
        this.f23504m = new HashMap();
        this.f23505n = new HashMap();
        if (view instanceof ut) {
            this.f23494a = ((ut) view).getEditText();
        }
    }

    public h6(UndoView undoView, Class[] clsArr, String[] strArr, String str, int i9) {
        this.f23495b = -1;
        this.f23501j = new boolean[1];
        this.f23498f = i9;
        this.f23499g = str;
        this.f23494a = undoView;
        this.f23502k = 0;
        this.f23497e = clsArr;
        this.f23503l = strArr;
        this.f23504m = new HashMap();
        this.f23505n = new HashMap();
    }
}
