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
public class aa0 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f26482a;
    public final x90 f26483b;
    public final org.telegram.ui.ActionBar.u6 f26484c;
    public y5 d;
    public ba0 e;
    public z90 f26485f;
    public z90 h;
    public boolean f26486n;
    public boolean f26487r;
    public boolean f26488s;
    public CharacterStyle v;
    public int f26489w;
    public boolean f26490x;
    public Object f26491y;

    public aa0(Context context) {
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
        return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ld, this.f26484c);
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
        if (!this.f26490x) {
            this.f26490x = true;
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
                    if (this.f26491y == null) {
                        this.f26491y = I.get(this);
                    }
                    Object obj = this.f26491y;
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
        this.d = c6.update(a(), this, this.d, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c6.release(this, this.d);
    }

    @Override
    public void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aa0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f26489w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = c6.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        x90 x90Var = this.f26483b;
        if (x90Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                ba0 ba0Var = new ba0(b10, this.f26484c, motionEvent.getX(), motionEvent.getY(), 0);
                ba0Var.d(c());
                this.e = ba0Var;
                x90Var.a(ba0Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.f26780i);
                int spanEnd = spannableString.getSpanEnd(this.e.f26780i);
                t90 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new kg(this, ba0Var, b10, 14), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                x90Var.d(true);
                ba0 ba0Var2 = this.e;
                if (ba0Var2 != null && (characterStyle = ba0Var2.f26780i) == b10) {
                    z90 z90Var = this.f26485f;
                    if (z90Var != null) {
                        z90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                x90Var.d(true);
                this.e = null;
            }
        }
        if (this.e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f26486n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f26487r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f26488s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            x90 x90Var = this.f26483b;
            x90Var.e();
            this.v = characterStyle;
            ea0 i10 = x90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ld, this.f26484c));
                i10.g(org.telegram.ui.ActionBar.y6.o1(0.8f, d), org.telegram.ui.ActionBar.y6.o1(1.3f, d), org.telegram.ui.ActionBar.y6.o1(1.0f, d), org.telegram.ui.ActionBar.y6.o1(4.0f, d));
                i10.f27805x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                x90Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f26489w = i10;
    }

    public void setOnLinkLongPressListener(z90 z90Var) {
        this.h = z90Var;
    }

    public void setOnLinkPressListener(z90 z90Var) {
        this.f26485f = z90Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = c6.update(a(), this, this.d, getLayout());
    }

    public aa0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f26482a = false;
        this.f26483b = new x90(this);
        this.f26484c = u6Var;
    }

    public aa0(Context context, x90 x90Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f26482a = true;
        this.f26483b = x90Var;
        this.f26484c = u6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
