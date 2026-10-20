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
public class x90 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f32374a;
    public final u90 f32375b;
    public final org.telegram.ui.ActionBar.d6 f32376c;
    public w5 d;
    public y90 e;
    public w90 f32377f;
    public w90 h;
    public boolean f32378n;
    public boolean f32379r;
    public boolean f32380s;
    public CharacterStyle v;
    public int f32381w;
    public boolean f32382x;
    public Object f32383y;

    public x90(Context context) {
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
        return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, this.f32376c);
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
        if (!this.f32382x) {
            this.f32382x = true;
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
                    if (this.f32383y == null) {
                        this.f32383y = I.get(this);
                    }
                    Object obj = this.f32383y;
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
        this.d = a6.update(a(), this, this.d, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a6.release(this, this.d);
    }

    @Override
    public void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x90.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f32381w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = a6.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        u90 u90Var = this.f32375b;
        if (u90Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                y90 y90Var = new y90(b10, this.f32376c, motionEvent.getX(), motionEvent.getY(), 0);
                y90Var.d(c());
                this.e = y90Var;
                u90Var.a(y90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.f32601i);
                int spanEnd = spannableString.getSpanEnd(this.e.f32601i);
                r90 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new lg(this, y90Var, b10, 13), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                u90Var.d(true);
                y90 y90Var2 = this.e;
                if (y90Var2 != null && (characterStyle = y90Var2.f32601i) == b10) {
                    w90 w90Var = this.f32377f;
                    if (w90Var != null) {
                        w90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                u90Var.d(true);
                this.e = null;
            }
        }
        if (this.e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f32378n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f32379r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f32380s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            u90 u90Var = this.f32375b;
            u90Var.e();
            this.v = characterStyle;
            ba0 i10 = u90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, this.f32376c));
                i10.g(org.telegram.ui.ActionBar.h6.m1(0.8f, d), org.telegram.ui.ActionBar.h6.m1(1.3f, d), org.telegram.ui.ActionBar.h6.m1(1.0f, d), org.telegram.ui.ActionBar.h6.m1(4.0f, d));
                i10.f24876x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                u90Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f32381w = i10;
    }

    public void setOnLinkLongPressListener(w90 w90Var) {
        this.h = w90Var;
    }

    public void setOnLinkPressListener(w90 w90Var) {
        this.f32377f = w90Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = a6.update(a(), this, this.d, getLayout());
    }

    public x90(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f32374a = false;
        this.f32375b = new u90(this);
        this.f32376c = d6Var;
    }

    public x90(Context context, u90 u90Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f32374a = true;
        this.f32375b = u90Var;
        this.f32376c = d6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
