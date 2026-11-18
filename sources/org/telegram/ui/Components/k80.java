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
public class k80 extends TextView {
    public static Field J;
    public static Class K;
    public static Method L;
    public Object E;
    public boolean F;
    public boolean G;
    public PorterDuffColorFilter H;
    public int I;
    public final boolean f36702a;
    public final n2.o0 f36703b;
    public final org.telegram.ui.ActionBar.i6 f36704c;
    public t5 d;
    public l80 f36705e;
    public j80 f36706f;
    public j80 h;
    public boolean f36707n;
    public boolean f36708r;
    public boolean f36709s;
    public CharacterStyle f36710w;
    public int f36711x;
    public boolean f36712y;

    public k80(Context context) {
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
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ce, this.f36704c);
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
        if (!this.f36712y) {
            this.f36712y = true;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k80.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11 = this.f36711x;
        if (i11 > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i7)), View.MeasureSpec.getMode(i7));
        }
        super.onMeasure(i7, i10);
        this.d = x5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        n2.o0 o0Var = this.f36703b;
        if (o0Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                l80 l80Var = new l80(b10, this.f36704c, motionEvent.getX(), motionEvent.getY(), 0);
                l80Var.d(c());
                this.f36705e = l80Var;
                o0Var.b(l80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.f36705e.f37074i);
                int spanEnd = spannableString.getSpanEnd(this.f36705e.f37074i);
                f80 b11 = this.f36705e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                org.telegram.messenger.g0.h3(new k7(this, l80Var, b10, 17), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                o0Var.f(true);
                l80 l80Var2 = this.f36705e;
                if (l80Var2 != null && (characterStyle = l80Var2.f37074i) == b10) {
                    j80 j80Var = this.f36706f;
                    if (j80Var != null) {
                        j80Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.f36705e = null;
                    return true;
                }
                this.f36705e = null;
            }
            if (motionEvent.getAction() == 3) {
                o0Var.f(true);
                this.f36705e = null;
            }
        }
        if (this.f36705e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f36707n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f36708r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f36709s = z10;
    }

    public void setEmojiColor(int i7) {
        this.G = false;
        this.H = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.f36710w != characterStyle) {
            n2.o0 o0Var = this.f36703b;
            o0Var.g();
            this.f36710w = characterStyle;
            o80 k10 = n2.o0.k(getLayout(), characterStyle, getPaddingTop());
            if (k10 != null) {
                int d = d(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ce, this.f36704c));
                k10.g(org.telegram.ui.ActionBar.n6.r1(0.8f, d), org.telegram.ui.ActionBar.n6.r1(1.3f, d), org.telegram.ui.ActionBar.n6.r1(1.0f, d), org.telegram.ui.ActionBar.n6.r1(4.0f, d));
                k10.f38032x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                o0Var.c(k10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i7) {
        this.f36711x = i7;
    }

    public void setOnLinkLongPressListener(j80 j80Var) {
        this.h = j80Var;
    }

    public void setOnLinkPressListener(j80 j80Var) {
        this.f36706f = j80Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = x5.update(a(), this, this.d, getLayout());
    }

    public k80(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.F = false;
        this.G = true;
        this.f36702a = false;
        this.f36703b = new n2.o0(this);
        this.f36704c = i6Var;
    }

    public k80(Context context, n2.o0 o0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.F = false;
        this.G = true;
        this.f36702a = true;
        this.f36703b = o0Var;
        this.f36704c = i6Var;
    }

    public int d(int i7) {
        return i7;
    }
}
