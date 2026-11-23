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
public class m80 extends TextView {
    public static Field J;
    public static Class K;
    public static Method L;
    public Object E;
    public boolean F;
    public boolean G;
    public PorterDuffColorFilter H;
    public int I;
    public final boolean f37451a;
    public final n2.o0 f37452b;
    public final org.telegram.ui.ActionBar.h6 f37453c;
    public u5 d;
    public n80 f37454e;
    public l80 f37455f;
    public l80 h;
    public boolean f37456n;
    public boolean f37457r;
    public boolean f37458s;
    public CharacterStyle f37459w;
    public int f37460x;
    public boolean f37461y;

    public m80(Context context) {
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
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ce, this.f37453c);
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
        if (!this.f37461y) {
            this.f37461y = true;
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
        this.d = y5.update(a(), this, this.d, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y5.release(this, this.d);
    }

    @Override
    public void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m80.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11 = this.f37460x;
        if (i11 > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i7)), View.MeasureSpec.getMode(i7));
        }
        super.onMeasure(i7, i10);
        this.d = y5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        n2.o0 o0Var = this.f37452b;
        if (o0Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                n80 n80Var = new n80(b10, this.f37453c, motionEvent.getX(), motionEvent.getY(), 0);
                n80Var.d(c());
                this.f37454e = n80Var;
                o0Var.b(n80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.f37454e.f37839i);
                int spanEnd = spannableString.getSpanEnd(this.f37454e.f37839i);
                h80 b11 = this.f37454e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                org.telegram.messenger.g0.h3(new g(this, n80Var, b10, 18), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                o0Var.f(true);
                n80 n80Var2 = this.f37454e;
                if (n80Var2 != null && (characterStyle = n80Var2.f37839i) == b10) {
                    l80 l80Var = this.f37455f;
                    if (l80Var != null) {
                        l80Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.f37454e = null;
                    return true;
                }
                this.f37454e = null;
            }
            if (motionEvent.getAction() == 3) {
                o0Var.f(true);
                this.f37454e = null;
            }
        }
        if (this.f37454e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f37456n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f37457r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f37458s = z10;
    }

    public void setEmojiColor(int i7) {
        this.G = false;
        this.H = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.f37459w != characterStyle) {
            n2.o0 o0Var = this.f37452b;
            o0Var.g();
            this.f37459w = characterStyle;
            q80 k10 = n2.o0.k(getLayout(), characterStyle, getPaddingTop());
            if (k10 != null) {
                int d = d(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ce, this.f37453c));
                k10.g(org.telegram.ui.ActionBar.m6.r1(0.8f, d), org.telegram.ui.ActionBar.m6.r1(1.3f, d), org.telegram.ui.ActionBar.m6.r1(1.0f, d), org.telegram.ui.ActionBar.m6.r1(4.0f, d));
                k10.f38833x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                o0Var.c(k10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i7) {
        this.f37460x = i7;
    }

    public void setOnLinkLongPressListener(l80 l80Var) {
        this.h = l80Var;
    }

    public void setOnLinkPressListener(l80 l80Var) {
        this.f37455f = l80Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = y5.update(a(), this, this.d, getLayout());
    }

    public m80(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.F = false;
        this.G = true;
        this.f37451a = false;
        this.f37452b = new n2.o0(this);
        this.f37453c = h6Var;
    }

    public m80(Context context, n2.o0 o0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.F = false;
        this.G = true;
        this.f37451a = true;
        this.f37452b = o0Var;
        this.f37453c = h6Var;
    }

    public int d(int i7) {
        return i7;
    }
}
