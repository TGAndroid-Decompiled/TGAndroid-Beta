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
public class x70 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public Object D;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f40325a;
    public final n2.n0 f40326b;
    public final org.telegram.ui.ActionBar.g6 f40327c;
    public n5 d;
    public y70 f40328e;
    public w70 f40329f;
    public w70 h;
    public boolean f40330n;
    public boolean f40331r;
    public boolean f40332s;
    public CharacterStyle f40333w;
    public int f40334x;
    public boolean f40335y;

    public x70(Context context) {
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
        return org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28282ze, this.f40327c);
    }

    public final void e() {
        this.F = false;
        this.G = null;
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
        if (!this.f40335y) {
            this.f40335y = true;
            try {
                if (J == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    I = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    J = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        K = declaredMethod;
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
                if (K != null) {
                    if (this.D == null) {
                        this.D = I.get(this);
                    }
                    Object obj = this.D;
                    if (obj != null) {
                        K.invoke(obj, null);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = r5.update(a(), this, this.d, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r5.release(this, this.d);
    }

    @Override
    public void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x70.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11 = this.f40334x;
        if (i11 > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i7)), View.MeasureSpec.getMode(i7));
        }
        super.onMeasure(i7, i10);
        this.d = r5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        n2.n0 n0Var = this.f40326b;
        if (n0Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                y70 y70Var = new y70(b10, this.f40327c, motionEvent.getX(), motionEvent.getY(), 0);
                y70Var.d(c());
                this.f40328e = y70Var;
                n0Var.b(y70Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.f40328e.f40634i);
                int spanEnd = spannableString.getSpanEnd(this.f40328e.f40634i);
                s70 b11 = this.f40328e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                org.telegram.messenger.g0.i3(new ng(this, y70Var, b10, 12), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                n0Var.f(true);
                y70 y70Var2 = this.f40328e;
                if (y70Var2 != null && (characterStyle = y70Var2.f40634i) == b10) {
                    w70 w70Var = this.f40329f;
                    if (w70Var != null) {
                        w70Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.f40328e = null;
                    return true;
                }
                this.f40328e = null;
            }
            if (motionEvent.getAction() == 3) {
                n0Var.f(true);
                this.f40328e = null;
            }
        }
        if (this.f40328e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z9) {
        this.f40330n = z9;
    }

    public void setDisablePaddingsOffsetX(boolean z9) {
        this.f40331r = z9;
    }

    public void setDisablePaddingsOffsetY(boolean z9) {
        this.f40332s = z9;
    }

    public void setEmojiColor(int i7) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.f40333w != characterStyle) {
            n2.n0 n0Var = this.f40326b;
            n0Var.g();
            this.f40333w = characterStyle;
            b80 k10 = n2.n0.k(getLayout(), characterStyle, getPaddingTop());
            if (k10 != null) {
                int d = d(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28282ze, this.f40327c));
                k10.g(org.telegram.ui.ActionBar.l6.r1(0.8f, d), org.telegram.ui.ActionBar.l6.r1(1.3f, d), org.telegram.ui.ActionBar.l6.r1(1.0f, d), org.telegram.ui.ActionBar.l6.r1(4.0f, d));
                k10.f32186x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                n0Var.c(k10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i7) {
        this.f40334x = i7;
    }

    public void setOnLinkLongPressListener(w70 w70Var) {
        this.h = w70Var;
    }

    public void setOnLinkPressListener(w70 w70Var) {
        this.f40329f = w70Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = r5.update(a(), this, this.d, getLayout());
    }

    public x70(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f40325a = false;
        this.f40326b = new n2.n0(this);
        this.f40327c = g6Var;
    }

    public x70(Context context, n2.n0 n0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f40325a = true;
        this.f40326b = n0Var;
        this.f40327c = g6Var;
    }

    public int d(int i7) {
        return i7;
    }
}
