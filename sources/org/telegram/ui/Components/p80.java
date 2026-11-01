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
public class p80 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public Object D;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f29373a;
    public final ji.a f29374b;
    public final org.telegram.ui.ActionBar.p6 f29375c;
    public k5 d;
    public q80 e;
    public o80 f29376f;
    public o80 h;
    public boolean f29377n;
    public boolean f29378r;
    public boolean f29379s;
    public CharacterStyle f29380w;
    public int f29381x;
    public boolean f29382y;

    public p80(Context context) {
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
        float f7 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f7);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f7 && layout.getLineWidth(lineForVertical) + lineLeft >= f7 && textPaddingTop >= 0 && textPaddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !org.telegram.messenger.i0.C1()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public int c() {
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21337ze, this.f29375c);
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
        if (!this.f29382y) {
            this.f29382y = true;
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
                org.telegram.messenger.f8.g(th2, true);
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
        this.d = o5.update(a(), this, this.d, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o5.release(this, this.d);
    }

    @Override
    public void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p80.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f29381x;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = o5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        ji.a aVar = this.f29374b;
        if (aVar != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                q80 q80Var = new q80(b10, this.f29375c, motionEvent.getX(), motionEvent.getY(), 0);
                q80Var.d(c());
                this.e = q80Var;
                aVar.b(q80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.f29671i);
                int spanEnd = spannableString.getSpanEnd(this.e.f29671i);
                k80 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                org.telegram.messenger.i0.h3(new jg(this, q80Var, b10, 12), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                aVar.f(true);
                q80 q80Var2 = this.e;
                if (q80Var2 != null && (characterStyle = q80Var2.f29671i) == b10) {
                    o80 o80Var = this.f29376f;
                    if (o80Var != null) {
                        o80Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                aVar.f(true);
                this.e = null;
            }
        }
        if (this.e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f29377n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f29378r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f29379s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.f29380w != characterStyle) {
            ji.a aVar = this.f29374b;
            aVar.g();
            this.f29380w = characterStyle;
            t80 k10 = ji.a.k(getLayout(), characterStyle, getPaddingTop());
            if (k10 != null) {
                int d = d(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21337ze, this.f29375c));
                k10.g(org.telegram.ui.ActionBar.t6.r1(0.8f, d), org.telegram.ui.ActionBar.t6.r1(1.3f, d), org.telegram.ui.ActionBar.t6.r1(1.0f, d), org.telegram.ui.ActionBar.t6.r1(4.0f, d));
                k10.f30592x.setStrokeWidth(org.telegram.messenger.i0.N(1.25f));
                aVar.c(k10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f29381x = i10;
    }

    public void setOnLinkLongPressListener(o80 o80Var) {
        this.h = o80Var;
    }

    public void setOnLinkPressListener(o80 o80Var) {
        this.f29376f = o80Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = o5.update(a(), this, this.d, getLayout());
    }

    public p80(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f29373a = false;
        this.f29374b = new ji.a(this);
        this.f29375c = p6Var;
    }

    public p80(Context context, ji.a aVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f29373a = true;
        this.f29374b = aVar;
        this.f29375c = p6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
