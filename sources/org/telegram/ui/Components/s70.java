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
public class s70 extends TextView {
    public static Field J;
    public static Class K;
    public static Method L;
    public Object E;
    public boolean F;
    public boolean G;
    public PorterDuffColorFilter H;
    public int I;
    public final boolean f37938a;
    public final m2.p0 f37939b;
    public final org.telegram.ui.ActionBar.e6 f37940c;
    public l5 d;
    public t70 f37941e;
    public r70 f37942f;
    public r70 h;
    public boolean f37943n;
    public boolean f37944r;
    public boolean f37945s;
    public CharacterStyle f37946w;
    public int f37947x;
    public boolean f37948y;

    public s70(Context context) {
        this(context, null);
    }

    public int a() {
        return 0;
    }

    public final ClickableSpan b(int i3, int i10) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i3 - getPaddingLeft();
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
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28298ze, this.f37940c);
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
        if (!this.f37948y) {
            this.f37948y = true;
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
        this.d = p5.update(a(), this, this.d, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p5.release(this, this.d);
    }

    @Override
    public void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s70.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int i11 = this.f37947x;
        if (i11 > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i3)), View.MeasureSpec.getMode(i3));
        }
        super.onMeasure(i3, i10);
        this.d = p5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        m2.p0 p0Var = this.f37939b;
        if (p0Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                t70 t70Var = new t70(b10, this.f37940c, motionEvent.getX(), motionEvent.getY(), 0);
                t70Var.d(c());
                this.f37941e = t70Var;
                p0Var.b(t70Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.f37941e.f38328i);
                int spanEnd = spannableString.getSpanEnd(this.f37941e.f38328i);
                n70 b11 = this.f37941e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                org.telegram.messenger.g0.i3(new e7(this, t70Var, b10, 16), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                p0Var.f(true);
                t70 t70Var2 = this.f37941e;
                if (t70Var2 != null && (characterStyle = t70Var2.f38328i) == b10) {
                    r70 r70Var = this.f37942f;
                    if (r70Var != null) {
                        r70Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.f37941e = null;
                    return true;
                }
                this.f37941e = null;
            }
            if (motionEvent.getAction() == 3) {
                p0Var.f(true);
                this.f37941e = null;
            }
        }
        if (this.f37941e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f37943n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f37944r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f37945s = z10;
    }

    public void setEmojiColor(int i3) {
        this.G = false;
        this.H = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.f37946w != characterStyle) {
            m2.p0 p0Var = this.f37939b;
            p0Var.g();
            this.f37946w = characterStyle;
            w70 k10 = m2.p0.k(getLayout(), characterStyle, getPaddingTop());
            if (k10 != null) {
                int d = d(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28298ze, this.f37940c));
                k10.g(org.telegram.ui.ActionBar.k6.r1(0.8f, d), org.telegram.ui.ActionBar.k6.r1(1.3f, d), org.telegram.ui.ActionBar.k6.r1(1.0f, d), org.telegram.ui.ActionBar.k6.r1(4.0f, d));
                k10.f39944x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                p0Var.c(k10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i3) {
        this.f37947x = i3;
    }

    public void setOnLinkLongPressListener(r70 r70Var) {
        this.h = r70Var;
    }

    public void setOnLinkPressListener(r70 r70Var) {
        this.f37942f = r70Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = p5.update(a(), this, this.d, getLayout());
    }

    public s70(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.F = false;
        this.G = true;
        this.f37938a = false;
        this.f37939b = new m2.p0(this);
        this.f37940c = e6Var;
    }

    public s70(Context context, m2.p0 p0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.F = false;
        this.G = true;
        this.f37938a = true;
        this.f37939b = p0Var;
        this.f37940c = e6Var;
    }

    public int d(int i3) {
        return i3;
    }
}
