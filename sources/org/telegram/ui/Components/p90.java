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
public class p90 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f27289a;
    public final m90 f27290b;
    public final org.telegram.ui.ActionBar.d6 f27291c;
    public v5 d;
    public q90 e;
    public o90 f27292f;
    public o90 h;
    public boolean f27293n;
    public boolean f27294r;
    public boolean f27295s;
    public CharacterStyle v;
    public int f27296w;
    public boolean f27297x;
    public Object f27298y;

    public p90(Context context) {
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
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public int c() {
        return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ld, this.f27291c);
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
        if (!this.f27297x) {
            this.f27297x = true;
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
                FileLog.e(th2);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (K != null) {
                    if (this.f27298y == null) {
                        this.f27298y = I.get(this);
                    }
                    Object obj = this.f27298y;
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
        this.d = z5.update(a(), this, this.d, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z5.release(this, this.d);
    }

    @Override
    public void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p90.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f27296w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = z5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        m90 m90Var = this.f27290b;
        if (m90Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                q90 q90Var = new q90(b10, this.f27291c, motionEvent.getX(), motionEvent.getY(), 0);
                q90Var.d(c());
                this.e = q90Var;
                m90Var.a(q90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.f27584i);
                int spanEnd = spannableString.getSpanEnd(this.e.f27584i);
                j90 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, q90Var, b10, 25), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                m90Var.d(true);
                q90 q90Var2 = this.e;
                if (q90Var2 != null && (characterStyle = q90Var2.f27584i) == b10) {
                    o90 o90Var = this.f27292f;
                    if (o90Var != null) {
                        o90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                m90Var.d(true);
                this.e = null;
            }
        }
        if (this.e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f27293n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f27294r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f27295s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            m90 m90Var = this.f27290b;
            m90Var.e();
            this.v = characterStyle;
            t90 i10 = m90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ld, this.f27291c));
                i10.f(org.telegram.ui.ActionBar.h6.l1(0.8f, d), org.telegram.ui.ActionBar.h6.l1(1.3f, d), org.telegram.ui.ActionBar.h6.l1(1.0f, d), org.telegram.ui.ActionBar.h6.l1(4.0f, d));
                i10.f28519w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                m90Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f27296w = i10;
    }

    public void setOnLinkLongPressListener(o90 o90Var) {
        this.h = o90Var;
    }

    public void setOnLinkPressListener(o90 o90Var) {
        this.f27292f = o90Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = z5.update(a(), this, this.d, getLayout());
    }

    public p90(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f27289a = false;
        this.f27290b = new m90(this);
        this.f27291c = d6Var;
    }

    public p90(Context context, m90 m90Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f27289a = true;
        this.f27290b = m90Var;
        this.f27291c = d6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
