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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public class y80 extends TextView {
    public static Field E;
    public static Class F;
    public static Method G;
    public boolean A;
    public boolean B;
    public PorterDuffColorFilter C;
    public int D;
    public final boolean f34964a;
    public final v80 f34965b;
    public final org.telegram.ui.ActionBar.c6 f34966c;
    public u5 d;
    public z80 f34967e;
    public x80 f34968f;
    public x80 h;
    public boolean f34969n;
    public boolean f34970r;
    public boolean f34971s;
    public CharacterStyle v;
    public int f34972w;
    public boolean f34973x;
    public Object f34974y;

    public y80(Context context) {
        this(context, null);
    }

    public int a() {
        return 0;
    }

    public final ClickableSpan b(int i10, int i11) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i10 - getPaddingLeft();
        int textPaddingTop = i11 - getTextPaddingTop();
        int lineForVertical = layout.getLineForVertical(textPaddingTop);
        float f9 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f9);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f9 && layout.getLineWidth(lineForVertical) + lineLeft >= f9 && textPaddingTop >= 0 && textPaddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public int c() {
        return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, this.f34966c);
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
        if (!this.f34973x) {
            this.f34973x = true;
            try {
                if (F == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    E = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    F = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        G = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (G != null) {
                    if (this.f34974y == null) {
                        this.f34974y = E.get(this);
                    }
                    Object obj = this.f34974y;
                    if (obj != null) {
                        G.invoke(obj, null);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y80.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f34972w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = y5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        v80 v80Var = this.f34965b;
        if (v80Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                z80 z80Var = new z80(b10, this.f34966c, motionEvent.getX(), motionEvent.getY(), 0);
                z80Var.d(c());
                this.f34967e = z80Var;
                v80Var.a(z80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.f34967e.f35285i);
                int spanEnd = spannableString.getSpanEnd(this.f34967e.f35285i);
                s80 b11 = this.f34967e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new g(this, z80Var, b10, 16), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                v80Var.d(true);
                z80 z80Var2 = this.f34967e;
                if (z80Var2 != null && (characterStyle = z80Var2.f35285i) == b10) {
                    x80 x80Var = this.f34968f;
                    if (x80Var != null) {
                        x80Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.f34967e = null;
                    return true;
                }
                this.f34967e = null;
            }
            if (motionEvent.getAction() == 3) {
                v80Var.d(true);
                this.f34967e = null;
            }
        }
        if (this.f34967e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f34969n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f34970r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f34971s = z10;
    }

    public void setEmojiColor(int i10) {
        this.B = false;
        this.C = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            v80 v80Var = this.f34965b;
            v80Var.e();
            this.v = characterStyle;
            c90 i10 = v80.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, this.f34966c));
                i10.f(org.telegram.ui.ActionBar.g6.l1(0.8f, d), org.telegram.ui.ActionBar.g6.l1(1.3f, d), org.telegram.ui.ActionBar.g6.l1(1.0f, d), org.telegram.ui.ActionBar.g6.l1(4.0f, d));
                i10.f27399w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                v80Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f34972w = i10;
    }

    public void setOnLinkLongPressListener(x80 x80Var) {
        this.h = x80Var;
    }

    public void setOnLinkPressListener(x80 x80Var) {
        this.f34968f = x80Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = y5.update(a(), this, this.d, getLayout());
    }

    public y80(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.A = false;
        this.B = true;
        this.f34964a = false;
        this.f34965b = new v80(this);
        this.f34966c = c6Var;
    }

    public y80(Context context, v80 v80Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.A = false;
        this.B = true;
        this.f34964a = true;
        this.f34965b = v80Var;
        this.f34966c = c6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
