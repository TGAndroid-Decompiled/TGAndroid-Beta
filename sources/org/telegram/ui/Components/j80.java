package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class j80 extends TextView {
    public static Field J;
    public static Class K;
    public static Method L;
    public Object E;
    public boolean F;
    public boolean G;
    public PorterDuffColorFilter H;
    public int I;
    public final boolean f36353a;
    public final n2.p0 f36354b;
    public final org.telegram.ui.ActionBar.i6 f36355c;
    public t5 d;
    public k80 f36356e;
    public i80 f36357f;
    public i80 h;
    public boolean f36358n;
    public boolean f36359r;
    public boolean f36360s;
    public CharacterStyle f36361w;
    public int f36362x;
    public boolean f36363y;

    public j80(Context context) {
        this(context, null);
    }

    public int a() {
        return 0;
    }

    public final ClickableSpan b(int i7, int i10) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i7 - getPaddingLeft();
        int textPaddingTop = i10 - getTextPaddingTop();
        int lineForVertical = layout.getLineForVertical(textPaddingTop);
        float f10 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && textPaddingTop >= 0 && textPaddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !org.telegram.messenger.g0.C1()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public int c() {
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ce, this.f36355c);
    }

    public final void e() {
        this.G = false;
        this.H = null;
        invalidate();
    }

    public int getTextPaddingTop() {
        int paddingTop = getPaddingTop();
        if (getGravity() == 17 && getLayout() != null) {
            return Math.max(0, (((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2) + paddingTop;
        }
        return paddingTop;
    }

    @Override
    public final void invalidate() {
        if (!this.f36363y) {
            this.f36363y = true;
            try {
                if (K == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    J = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    K = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        L = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (L != null) {
                    if (this.E == null) {
                        this.E = J.get(this);
                    }
                    Object obj = this.E;
                    if (obj != null) {
                        L.invoke(obj, null);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = x5.update(a(), this, this.d, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x5.release(this, this.d);
    }

    @Override
    public void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j80.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11 = this.f36362x;
        if (i11 > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i7)), View.MeasureSpec.getMode(i7));
        }
        super.onMeasure(i7, i10);
        this.d = x5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        n2.p0 p0Var = this.f36354b;
        if (p0Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                k80 k80Var = new k80(b10, this.f36355c, motionEvent.getX(), motionEvent.getY(), 0);
                k80Var.d(c());
                this.f36356e = k80Var;
                p0Var.b(k80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.f36356e.f36682i);
                int spanEnd = spannableString.getSpanEnd(this.f36356e.f36682i);
                e80 b11 = this.f36356e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                org.telegram.messenger.g0.h3(new org.telegram.ui.Cells.fa(this, k80Var, b10, 19), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                p0Var.f(true);
                k80 k80Var2 = this.f36356e;
                if (k80Var2 != null && (characterStyle = k80Var2.f36682i) == b10) {
                    i80 i80Var = this.f36357f;
                    if (i80Var != null) {
                        i80Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.f36356e = null;
                    return true;
                }
                this.f36356e = null;
            }
            if (motionEvent.getAction() == 3) {
                p0Var.f(true);
                this.f36356e = null;
            }
        }
        if (this.f36356e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f36358n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f36359r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f36360s = z10;
    }

    public void setEmojiColor(int i7) {
        this.G = false;
        this.H = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.f36361w != characterStyle) {
            n2.p0 p0Var = this.f36354b;
            p0Var.g();
            this.f36361w = characterStyle;
            n80 k10 = n2.p0.k(getLayout(), characterStyle, getPaddingTop());
            if (k10 != null) {
                int d = d(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ce, this.f36355c));
                k10.g(org.telegram.ui.ActionBar.n6.r1(0.8f, d), org.telegram.ui.ActionBar.n6.r1(1.3f, d), org.telegram.ui.ActionBar.n6.r1(1.0f, d), org.telegram.ui.ActionBar.n6.r1(4.0f, d));
                k10.f37729x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                p0Var.c(k10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i7) {
        this.f36362x = i7;
    }

    public void setOnLinkLongPressListener(i80 i80Var) {
        this.h = i80Var;
    }

    public void setOnLinkPressListener(i80 i80Var) {
        this.f36357f = i80Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = x5.update(a(), this, this.d, getLayout());
    }

    public j80(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.F = false;
        this.G = true;
        this.f36353a = false;
        this.f36354b = new n2.p0(this);
        this.f36355c = i6Var;
    }

    public j80(Context context, n2.p0 p0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.F = false;
        this.G = true;
        this.f36353a = true;
        this.f36354b = p0Var;
        this.f36355c = i6Var;
    }

    public int d(int i7) {
        return i7;
    }
}
