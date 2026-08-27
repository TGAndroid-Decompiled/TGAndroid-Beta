package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
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

public class p80 extends TextView {
    public static Field E;
    public static Class F;
    public static Method G;
    public boolean A;
    public boolean B;
    public PorterDuffColorFilter C;
    public int D;

    public final boolean f31553a;

    public final m80 f31554b;

    public final org.telegram.ui.ActionBar.c6 f31555c;
    public p5 d;

    public q80 f31556e;

    public o80 f31557f;
    public o80 h;

    public boolean f31558n;

    public boolean f31559r;

    public boolean f31560s;
    public CharacterStyle v;

    public int f31561w;

    public boolean f31562x;

    public Object f31563y;

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
        float f10 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && textPaddingTop >= 0 && textPaddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public int c() {
        return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, this.f31555c);
    }

    public int getTextPaddingTop() {
        int paddingTop = getPaddingTop();
        return (getGravity() != 17 || getLayout() == null) ? paddingTop : Math.max(0, (((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2) + paddingTop;
    }

    @Override
    public final void invalidate() {
        if (!this.f31562x) {
            this.f31562x = true;
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
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (G != null) {
                    if (this.f31563y == null) {
                        this.f31563y = E.get(this);
                    }
                    Object obj = this.f31563y;
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
        this.d = t5.update(a(), this, this.d, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t5.release(this, this.d);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        if (!this.f31553a) {
            canvas.save();
            if (!this.f31558n) {
                canvas.translate(this.f31559r ? 0.0f : getPaddingLeft(), this.f31560s ? 0.0f : getTextPaddingTop());
            }
            m80 m80Var = this.f31554b;
            if (m80Var != null && m80Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        boolean z11 = false;
        try {
            Layout layout = getLayout();
            float height = ((getGravity() & 16) == 0 || layout == null) ? 0.0f : ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - layout.getHeight()) / 2.0f) + getPaddingTop();
            if (height == 0.0f && getPaddingLeft() == 0) {
                z10 = false;
            } else {
                canvas.save();
                try {
                    canvas.translate(getPaddingLeft(), height);
                    z10 = true;
                } catch (Exception e9) {
                    e = e9;
                    canvas2 = canvas;
                    z11 = true;
                    if (!this.A) {
                        FileLog.e((Throwable) e, true);
                    }
                    this.A = true;
                    z10 = z11;
                    if (z10) {
                        canvas2.restore();
                    }
                }
            }
            try {
                try {
                    this.d = t5.update(a(), this, this.d, getLayout());
                    if (this.B && (this.C == null || this.D != getPaint().linkColor)) {
                        int i10 = getPaint().linkColor;
                        this.D = i10;
                        this.C = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    }
                    canvas2 = canvas;
                    try {
                        t5.drawAnimatedEmojis(canvas2, layout, this.d, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.C);
                    } catch (Exception e10) {
                        e = e10;
                        z11 = z10;
                        if (!this.A) {
                            FileLog.e((Throwable) e, true);
                        }
                        this.A = true;
                        z10 = z11;
                    }
                } catch (Exception e11) {
                    e = e11;
                    canvas2 = canvas;
                }
            } catch (Exception e12) {
                e = e12;
                canvas2 = canvas;
            }
        } catch (Exception e13) {
            e = e13;
            canvas2 = canvas;
        }
        if (z10) {
            canvas2.restore();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f31561w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = t5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        m80 m80Var = this.f31554b;
        if (m80Var != null) {
            Layout layout = getLayout();
            ClickableSpan clickableSpanB = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (clickableSpanB != null && motionEvent.getAction() == 0) {
                q80 q80Var = new q80(clickableSpanB, this.f31555c, motionEvent.getX(), motionEvent.getY(), 0);
                q80Var.d(c());
                this.f31556e = q80Var;
                m80Var.a(q80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.f31556e.f31841i);
                int spanEnd = spannableString.getSpanEnd(this.f31556e.f31841i);
                j80 j80VarB = this.f31556e.b();
                j80VarB.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, j80VarB);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3(this, q80Var, clickableSpanB, 21), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                m80Var.d(true);
                q80 q80Var2 = this.f31556e;
                if (q80Var2 != null && (characterStyle = q80Var2.f31841i) == clickableSpanB) {
                    o80 o80Var = this.f31557f;
                    if (o80Var != null) {
                        o80Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.f31556e = null;
                    return true;
                }
                this.f31556e = null;
            }
            if (motionEvent.getAction() == 3) {
                m80Var.d(true);
                this.f31556e = null;
            }
        }
        return this.f31556e != null || super.onTouchEvent(motionEvent);
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f31558n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f31559r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f31560s = z10;
    }

    public void setEmojiColor(int i10) {
        this.B = false;
        this.C = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            m80 m80Var = this.f31554b;
            m80Var.e();
            this.v = characterStyle;
            t80 t80VarI = m80.i(getLayout(), characterStyle, getPaddingTop());
            if (t80VarI != null) {
                int iD = d(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, this.f31555c));
                t80VarI.f(org.telegram.ui.ActionBar.g6.l1(0.8f, iD), org.telegram.ui.ActionBar.g6.l1(1.3f, iD), org.telegram.ui.ActionBar.g6.l1(1.0f, iD), org.telegram.ui.ActionBar.g6.l1(4.0f, iD));
                t80VarI.f32710w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                m80Var.b(t80VarI, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f31561w = i10;
    }

    public void setOnLinkLongPressListener(o80 o80Var) {
        this.h = o80Var;
    }

    public void setOnLinkPressListener(o80 o80Var) {
        this.f31557f = o80Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = t5.update(a(), this, this.d, getLayout());
    }

    public p80(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.A = false;
        this.B = true;
        this.f31553a = false;
        this.f31554b = new m80(this);
        this.f31555c = c6Var;
    }

    public p80(Context context, m80 m80Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.A = false;
        this.B = true;
        this.f31553a = true;
        this.f31554b = m80Var;
        this.f31555c = c6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
