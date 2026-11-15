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
public class z70 extends TextView {
    public static Field J;
    public static Class K;
    public static Method L;
    public Object E;
    public boolean F;
    public boolean G;
    public PorterDuffColorFilter H;
    public int I;
    public final boolean f42287a;
    public final n2.o0 f42288b;
    public final org.telegram.ui.ActionBar.e6 f42289c;
    public l5 d;
    public a80 f42290e;
    public y70 f42291f;
    public y70 h;
    public boolean f42292n;
    public boolean f42293r;
    public boolean f42294s;
    public CharacterStyle f42295w;
    public int f42296x;
    public boolean f42297y;

    public z70(Context context) {
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
        return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ce, this.f42289c);
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
        if (!this.f42297y) {
            this.f42297y = true;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z70.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11 = this.f42296x;
        if (i11 > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i7)), View.MeasureSpec.getMode(i7));
        }
        super.onMeasure(i7, i10);
        this.d = p5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        n2.o0 o0Var = this.f42288b;
        if (o0Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                a80 a80Var = new a80(b10, this.f42289c, motionEvent.getX(), motionEvent.getY(), 0);
                a80Var.d(c());
                this.f42290e = a80Var;
                o0Var.b(a80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.f42290e.f32922i);
                int spanEnd = spannableString.getSpanEnd(this.f42290e.f32922i);
                u70 b11 = this.f42290e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                org.telegram.messenger.g0.i3(new yf(this, a80Var, b10, 14), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                o0Var.f(true);
                a80 a80Var2 = this.f42290e;
                if (a80Var2 != null && (characterStyle = a80Var2.f32922i) == b10) {
                    y70 y70Var = this.f42291f;
                    if (y70Var != null) {
                        y70Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.f42290e = null;
                    return true;
                }
                this.f42290e = null;
            }
            if (motionEvent.getAction() == 3) {
                o0Var.f(true);
                this.f42290e = null;
            }
        }
        if (this.f42290e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f42292n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f42293r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f42294s = z10;
    }

    public void setEmojiColor(int i7) {
        this.G = false;
        this.H = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.f42295w != characterStyle) {
            n2.o0 o0Var = this.f42288b;
            o0Var.g();
            this.f42295w = characterStyle;
            d80 k10 = n2.o0.k(getLayout(), characterStyle, getPaddingTop());
            if (k10 != null) {
                int d = d(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ce, this.f42289c));
                k10.g(org.telegram.ui.ActionBar.j6.r1(0.8f, d), org.telegram.ui.ActionBar.j6.r1(1.3f, d), org.telegram.ui.ActionBar.j6.r1(1.0f, d), org.telegram.ui.ActionBar.j6.r1(4.0f, d));
                k10.f33884x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                o0Var.c(k10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i7) {
        this.f42296x = i7;
    }

    public void setOnLinkLongPressListener(y70 y70Var) {
        this.h = y70Var;
    }

    public void setOnLinkPressListener(y70 y70Var) {
        this.f42291f = y70Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = p5.update(a(), this, this.d, getLayout());
    }

    public z70(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.F = false;
        this.G = true;
        this.f42287a = false;
        this.f42288b = new n2.o0(this);
        this.f42289c = e6Var;
    }

    public z70(Context context, n2.o0 o0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.F = false;
        this.G = true;
        this.f42287a = true;
        this.f42288b = o0Var;
        this.f42289c = e6Var;
    }

    public int d(int i7) {
        return i7;
    }
}
