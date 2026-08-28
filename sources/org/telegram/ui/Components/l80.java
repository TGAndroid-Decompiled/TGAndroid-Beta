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
public class l80 extends TextView {
    public static Field E;
    public static Class F;
    public static Method G;
    public boolean A;
    public boolean B;
    public PorterDuffColorFilter C;
    public int D;
    public final boolean f30396a;
    public final i80 f30397b;
    public final org.telegram.ui.ActionBar.b6 f30398c;
    public p5 d;
    public m80 f30399e;
    public k80 f30400f;
    public k80 h;
    public boolean f30401n;
    public boolean f30402r;
    public boolean f30403s;
    public CharacterStyle v;
    public int f30404w;
    public boolean f30405x;
    public Object f30406y;

    public l80(Context context) {
        this(context, null);
    }

    public int a() {
        return 0;
    }

    public final ClickableSpan b(int i9, int i10) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i9 - getPaddingLeft();
        int textPaddingTop = i10 - getTextPaddingTop();
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
        return org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ld, this.f30398c);
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
        if (!this.f30405x) {
            this.f30405x = true;
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
                    if (this.f30406y == null) {
                        this.f30406y = E.get(this);
                    }
                    Object obj = this.f30406y;
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
    public void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l80.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i9, int i10) {
        int i11 = this.f30404w;
        if (i11 > 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i9)), View.MeasureSpec.getMode(i9));
        }
        super.onMeasure(i9, i10);
        this.d = t5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        i80 i80Var = this.f30397b;
        if (i80Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                m80 m80Var = new m80(b10, this.f30398c, motionEvent.getX(), motionEvent.getY(), 0);
                m80Var.d(c());
                this.f30399e = m80Var;
                i80Var.a(m80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.f30399e.f30768i);
                int spanEnd = spannableString.getSpanEnd(this.f30399e.f30768i);
                f80 b11 = this.f30399e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e(this, m80Var, b10, 27), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                i80Var.d(true);
                m80 m80Var2 = this.f30399e;
                if (m80Var2 != null && (characterStyle = m80Var2.f30768i) == b10) {
                    k80 k80Var = this.f30400f;
                    if (k80Var != null) {
                        k80Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.f30399e = null;
                    return true;
                }
                this.f30399e = null;
            }
            if (motionEvent.getAction() == 3) {
                i80Var.d(true);
                this.f30399e = null;
            }
        }
        if (this.f30399e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f30401n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f30402r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f30403s = z10;
    }

    public void setEmojiColor(int i9) {
        this.B = false;
        this.C = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            i80 i80Var = this.f30397b;
            i80Var.e();
            this.v = characterStyle;
            p80 i9 = i80.i(getLayout(), characterStyle, getPaddingTop());
            if (i9 != null) {
                int d = d(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ld, this.f30398c));
                i9.f(org.telegram.ui.ActionBar.f6.l1(0.8f, d), org.telegram.ui.ActionBar.f6.l1(1.3f, d), org.telegram.ui.ActionBar.f6.l1(1.0f, d), org.telegram.ui.ActionBar.f6.l1(4.0f, d));
                i9.f31590w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                i80Var.b(i9, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i9) {
        this.f30404w = i9;
    }

    public void setOnLinkLongPressListener(k80 k80Var) {
        this.h = k80Var;
    }

    public void setOnLinkPressListener(k80 k80Var) {
        this.f30400f = k80Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = t5.update(a(), this, this.d, getLayout());
    }

    public l80(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.A = false;
        this.B = true;
        this.f30396a = false;
        this.f30397b = new i80(this);
        this.f30398c = b6Var;
    }

    public l80(Context context, i80 i80Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.A = false;
        this.B = true;
        this.f30396a = true;
        this.f30397b = i80Var;
        this.f30398c = b6Var;
    }

    public int d(int i9) {
        return i9;
    }
}
