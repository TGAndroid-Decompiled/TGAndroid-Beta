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
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.ya0;
public final class l6 {
    public final View f19574a;
    public final int f19575b;
    public final Paint[] f19576c;
    public final Drawable[] d;
    public final Class[] e;
    public final int f19577f;
    public final String f19578g;
    public k6 h;
    public int f19579i;
    public final boolean[] f19580j;
    public final int f19581k;
    public final String[] f19582l;
    public final HashMap f19583m;
    public final HashMap f19584n;
    public e6 f19585o;

    public l6(View view, int i10, Class[] clsArr, Paint[] paintArr, int i11) {
        this.f19575b = -1;
        this.f19580j = new boolean[1];
        this.f19577f = i11;
        this.f19576c = paintArr;
        this.d = null;
        this.f19574a = view;
        this.f19581k = i10;
        this.e = clsArr;
        this.h = null;
        if (view instanceof ju) {
            this.f19574a = ((ju) view).getEditText();
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
        e6 e6Var = this.f19585o;
        int i10 = this.f19577f;
        if (e6Var != null) {
            num = Integer.valueOf(e6Var.G0(i10));
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
        boolean z10;
        boolean z11;
        Field field;
        Object obj;
        TextView nextTextView2;
        u51[] u51VarArr;
        TextView nextTextView3;
        u51[] u51VarArr2;
        boolean z12;
        u51[] u51VarArr3;
        HashMap hashMap = this.f19583m;
        int i12 = 0;
        while (true) {
            Class[] clsArr = this.e;
            if (i12 < clsArr.length) {
                if (clsArr[i12].isInstance(view)) {
                    view.invalidate();
                    int i13 = this.f19581k;
                    int i14 = 262144 & i13;
                    int i15 = this.f19577f;
                    String[] strArr = this.f19582l;
                    if (i14 != 0 && !a(i15, view)) {
                        z10 = false;
                        i11 = 65536;
                    } else {
                        view.invalidate();
                        if (strArr == null && (i13 & 32) != 0) {
                            Drawable background = view.getBackground();
                            if (background != null) {
                                if ((i13 & 16) != 0) {
                                    if (background instanceof pq) {
                                        Drawable drawable = ((pq) background).f27296a;
                                        if (drawable instanceof ColorDrawable) {
                                            ((ColorDrawable) drawable).setColor(i10);
                                        }
                                    }
                                } else {
                                    if (background instanceof pq) {
                                        background = ((pq) background).f27297b;
                                    } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                        if ((i13 & 65536) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        j6.B1(background, i10, z11);
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
                                } else if (view instanceof d8) {
                                    for (int i16 = 0; i16 < 2; i16++) {
                                        d8 d8Var = (d8) view;
                                        if (i16 == 0) {
                                            nextTextView = d8Var.getTextView();
                                        } else {
                                            nextTextView = d8Var.getNextTextView();
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
                        z10 = true;
                    }
                    if (strArr != null) {
                        String str = clsArr[i12] + "_" + strArr[i12];
                        HashMap hashMap2 = this.f19584n;
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
                                if (field != null && (obj = field.get(view)) != null && (z10 || !(obj instanceof View) || a(i15, (View) obj))) {
                                    if (obj instanceof View) {
                                        ((View) obj).invalidate();
                                    }
                                    String str2 = this.f19578g;
                                    if (str2 != null && (obj instanceof lj0)) {
                                        ((lj0) obj).h(i10, str2);
                                    }
                                    if ((131072 & i13) != 0 && (obj instanceof View)) {
                                        obj = ((View) obj).getBackground();
                                    }
                                    if ((i13 & 1) != 0 && (obj instanceof View)) {
                                        View view2 = (View) obj;
                                        Drawable background2 = view2.getBackground();
                                        if (background2 instanceof ya0) {
                                            ((ya0) background2).f30519a.setColor(i10);
                                            ((ya0) background2).f30520b = null;
                                        } else {
                                            view2.setBackgroundColor(i10);
                                        }
                                    } else if (obj instanceof bu) {
                                        if ((8388608 & i13) != 0) {
                                            ((bu) obj).setHintColor(i10);
                                            ((bu) obj).setHintTextColor(i10);
                                        } else if ((16777216 & i13) != 0) {
                                            ((bu) obj).setCursorColor(i10);
                                        } else {
                                            ((bu) obj).setTextColor(i10);
                                        }
                                    } else if (obj instanceof j5) {
                                        if ((i13 & 2) != 0) {
                                            ((j5) obj).setLinkTextColor(i10);
                                        } else {
                                            ((j5) obj).setTextColor(i10);
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
                                            if ((text instanceof SpannedString) && (u51VarArr3 = (u51[]) ((SpannedString) text).getSpans(0, ((SpannedString) text).length(), u51.class)) != null && u51VarArr3.length > 0) {
                                                for (u51 u51Var : u51VarArr3) {
                                                    u51Var.f28614b = i10;
                                                }
                                            }
                                        } else {
                                            textView.setTextColor(i10);
                                        }
                                    } else if (obj instanceof ImageView) {
                                        ImageView imageView = (ImageView) obj;
                                        Drawable drawable3 = imageView.getDrawable();
                                        if (drawable3 instanceof pq) {
                                            if ((i13 & 32) != 0) {
                                                ((pq) drawable3).f27296a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                            } else {
                                                ((pq) drawable3).f27297b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                            }
                                        } else {
                                            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else if (obj instanceof w9) {
                                        Drawable staticThumb = ((w9) obj).getImageReceiver().getStaticThumb();
                                        if (staticThumb instanceof pq) {
                                            if ((i13 & 32) != 0) {
                                                ((pq) staticThumb).f27296a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                            } else {
                                                ((pq) staticThumb).f27297b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                            }
                                        } else if (staticThumb != null) {
                                            staticThumb.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else if (obj instanceof Drawable) {
                                        if (obj instanceof u80) {
                                            if ((i13 & 32) != 0) {
                                                u80 u80Var = (u80) obj;
                                                u80.f28653j.setColor(i10);
                                            } else {
                                                ((u80) obj).h.setColor(i10);
                                            }
                                        } else if (obj instanceof pq) {
                                            if ((i13 & 32) != 0) {
                                                ((pq) obj).f27296a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                            } else {
                                                ((pq) obj).f27297b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
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
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            j6.B1(drawable4, i10, z12);
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
                                        } else if (obj instanceof v80) {
                                            if ((i13 & 2048) != 0) {
                                                ((v80) obj).setProgressColor(i10);
                                            } else {
                                                ((v80) obj).setBackColor(i10);
                                            }
                                        } else if (obj instanceof RadialProgressView) {
                                            ((RadialProgressView) obj).setProgressColor(i10);
                                        } else if (obj instanceof Paint) {
                                            ((Paint) obj).setColor(i10);
                                            view.invalidate();
                                        } else if (obj instanceof to0) {
                                            if ((i13 & 2048) != 0) {
                                                ((to0) obj).setOuterColor(i10);
                                            } else {
                                                ((to0) obj).setInnerColor(i10);
                                            }
                                        } else if (obj instanceof d8) {
                                            if ((i13 & 33554432) != 0) {
                                                for (int i17 = 0; i17 < 2; i17++) {
                                                    if (i17 == 0) {
                                                        nextTextView3 = ((d8) obj).getTextView();
                                                    } else {
                                                        nextTextView3 = ((d8) obj).getNextTextView();
                                                    }
                                                    if (nextTextView3 != null) {
                                                        CharSequence text2 = nextTextView3.getText();
                                                        if ((text2 instanceof SpannedString) && (u51VarArr2 = (u51[]) ((SpannedString) text2).getSpans(0, ((SpannedString) text2).length(), u51.class)) != null && u51VarArr2.length > 0) {
                                                            for (u51 u51Var2 : u51VarArr2) {
                                                                u51Var2.f28614b = i10;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if ((i13 & 4) != 0 && (i14 == 0 || a(i15, (View) obj))) {
                                                for (int i18 = 0; i18 < 2; i18++) {
                                                    if (i18 == 0) {
                                                        nextTextView2 = ((d8) obj).getTextView();
                                                    } else {
                                                        nextTextView2 = ((d8) obj).getNextTextView();
                                                    }
                                                    if (nextTextView2 != null) {
                                                        nextTextView2.setTextColor(i10);
                                                        CharSequence text3 = nextTextView2.getText();
                                                        if ((text3 instanceof SpannedString) && (u51VarArr = (u51[]) ((SpannedString) text3).getSpans(0, ((SpannedString) text3).length(), u51.class)) != null && u51VarArr.length > 0) {
                                                            for (u51 u51Var3 : u51VarArr) {
                                                                u51Var3.f28614b = i10;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        int i19 = GroupCreateCheckBox.f22254b;
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
                    } else if (view instanceof m30) {
                        ((m30) view).c();
                    }
                }
                i12++;
            } else {
                return;
            }
        }
    }

    public final void d(int i10, boolean z10, boolean z11) {
        dl0 dl0Var;
        Drawable[] compoundDrawables;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f19577f;
        if (z11) {
            j6.u1(i11, i10, z10);
        }
        int i12 = this.f19575b;
        if (i12 > 0) {
            i10 = Color.argb(i12, Color.red(i10), Color.green(i10), Color.blue(i10));
        }
        Paint[] paintArr = this.f19576c;
        int i13 = this.f19581k;
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
                    } else if (drawable instanceof km0) {
                        ((km0) drawable).b(i10);
                    } else if (drawable instanceof ij0) {
                        String str = this.f19578g;
                        if (str != null) {
                            ((ij0) drawable).Q(i10, str);
                        }
                    } else if (drawable instanceof pq) {
                        if ((i13 & 32) != 0) {
                            ((pq) drawable).f27296a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((pq) drawable).f27297b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof h9) {
                        ((h9) drawable).h(i10);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.f21901a.setColor(i10);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.e;
        View view = this.f19574a;
        if (view != null && clsArr == null && this.f19582l == null && ((i13 & 262144) == 0 || a(i11, view))) {
            if ((i13 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof ya0) {
                    ya0 ya0Var = (ya0) background;
                    ya0Var.f30519a.setColor(i10);
                    ya0Var.f30520b = null;
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
                    if (background2 instanceof pq) {
                        if ((i13 & 65536) != 0) {
                            background2 = ((pq) background2).f27296a;
                        } else {
                            background2 = ((pq) background2).f27297b;
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
                            j6.B1(background2, i10, z14);
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
        if (view instanceof mz) {
            if ((i13 & 4) != 0) {
                ((mz) view).setTextColor(i10);
            } else if ((i13 & 2048) != 0) {
                ((mz) view).setProgressBarColor(i10);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        } else if (view instanceof v80) {
            if ((i13 & 2048) != 0) {
                ((v80) view).setProgressColor(i10);
            } else {
                ((v80) view).setBackColor(i10);
            }
        } else if (view instanceof tq) {
            ((tq) view).b();
        } else if ((view instanceof to0) && (i13 & 2048) != 0) {
            ((to0) view).setOuterColor(i10);
        }
        if ((i13 & 4) != 0 && ((i13 & 262144) == 0 || a(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof j5) {
                ((j5) view).setTextColor(i10);
            } else if (view instanceof fo) {
                ((fo) view).setTextColor(i10);
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
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        j6.B1(drawable2, i10, z12);
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
        boolean z15 = view instanceof wl0;
        if (z15) {
            wl0 wl0Var = (wl0) view;
            if ((i13 & 4096) != 0) {
                wl0Var.setListSelectorColor(Integer.valueOf(i10));
            }
            if ((33554432 & i13) != 0 && (dl0Var = wl0Var.f30070f1) != null) {
                dl0Var.c();
            }
            if ((32768 & i13) != 0) {
                wl0Var.setGlowColor(i10);
            }
            if ((524288 & i13) != 0) {
                ArrayList<View> headers = wl0Var.getHeaders();
                if (headers != null) {
                    for (int i15 = 0; i15 < headers.size(); i15++) {
                        c(i10, headers.get(i15));
                    }
                }
                ArrayList<View> headersCache = wl0Var.getHeadersCache();
                if (headersCache != null) {
                    for (int i16 = 0; i16 < headersCache.size(); i16++) {
                        c(i10, headersCache.get(i16));
                    }
                }
                View pinnedHeader = wl0Var.getPinnedHeader();
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
            if (z15) {
                wl0 wl0Var2 = (wl0) view;
                wl0Var2.getRecycledViewPool().a();
                int hiddenChildCount = wl0Var2.getHiddenChildCount();
                for (int i17 = 0; i17 < hiddenChildCount; i17++) {
                    c(i10, wl0Var2.W(i17));
                }
                int cachedChildCount = wl0Var2.getCachedChildCount();
                for (int i18 = 0; i18 < cachedChildCount; i18++) {
                    c(i10, wl0Var2.Q(i18));
                }
                int attachedScrapChildCount = wl0Var2.getAttachedScrapChildCount();
                for (int i19 = 0; i19 < attachedScrapChildCount; i19++) {
                    c(i10, wl0Var2.P(i19));
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
        this.f19575b = -1;
        this.f19580j = new boolean[1];
        this.f19577f = i11;
        if (paint != null) {
            this.f19576c = new Paint[]{paint};
        }
        this.d = drawableArr;
        this.f19574a = view;
        this.f19581k = i10;
        this.e = clsArr;
        this.h = k6Var;
        if (view instanceof ju) {
            this.f19574a = ((ju) view).getEditText();
        }
    }

    public l6(View view, Class[] clsArr, ij0[] ij0VarArr, String str, int i10) {
        this.f19575b = -1;
        this.f19580j = new boolean[1];
        this.f19577f = i10;
        this.f19578g = str;
        this.d = ij0VarArr;
        this.f19574a = view;
        this.f19581k = 0;
        this.e = clsArr;
        if (view instanceof ju) {
            this.f19574a = ((ju) view).getEditText();
        }
    }

    public l6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, k6 k6Var, int i11) {
        this(view, i10, clsArr, strArr, paintArr, drawableArr, -1, k6Var, i11);
    }

    public l6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, int i11, k6 k6Var, int i12) {
        this.f19580j = new boolean[1];
        this.f19577f = i12;
        this.f19576c = paintArr;
        this.d = drawableArr;
        this.f19574a = view;
        this.f19581k = i10;
        this.e = clsArr;
        this.f19582l = strArr;
        this.f19575b = i11;
        this.h = k6Var;
        this.f19583m = new HashMap();
        this.f19584n = new HashMap();
        if (view instanceof ju) {
            this.f19574a = ((ju) view).getEditText();
        }
    }

    public l6(UndoView undoView, Class[] clsArr, String[] strArr, String str, int i10) {
        this.f19575b = -1;
        this.f19580j = new boolean[1];
        this.f19577f = i10;
        this.f19578g = str;
        this.f19574a = undoView;
        this.f19581k = 0;
        this.e = clsArr;
        this.f19582l = strArr;
        this.f19583m = new HashMap();
        this.f19584n = new HashMap();
    }
}
