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
public class y90 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f32848a;
    public final v90 f32849b;
    public final org.telegram.ui.ActionBar.g6 f32850c;
    public w5 d;
    public z90 e;
    public x90 f32851f;
    public x90 h;
    public boolean f32852n;
    public boolean f32853r;
    public boolean f32854s;
    public CharacterStyle v;
    public int f32855w;
    public boolean f32856x;
    public Object f32857y;

    public y90(Context context) {
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
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ld, this.f32850c);
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
        if (!this.f32856x) {
            this.f32856x = true;
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
                    if (this.f32857y == null) {
                        this.f32857y = I.get(this);
                    }
                    Object obj = this.f32857y;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y90.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f32855w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = a6.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        v90 v90Var = this.f32849b;
        if (v90Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                z90 z90Var = new z90(b10, this.f32850c, motionEvent.getX(), motionEvent.getY(), 0);
                z90Var.d(c());
                this.e = z90Var;
                v90Var.a(z90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.f33177i);
                int spanEnd = spannableString.getSpanEnd(this.e.f33177i);
                s90 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new lg(this, z90Var, b10, 13), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                v90Var.d(true);
                z90 z90Var2 = this.e;
                if (z90Var2 != null && (characterStyle = z90Var2.f33177i) == b10) {
                    x90 x90Var = this.f32851f;
                    if (x90Var != null) {
                        x90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                v90Var.d(true);
                this.e = null;
            }
        }
        if (this.e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f32852n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f32853r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f32854s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            v90 v90Var = this.f32849b;
            v90Var.e();
            this.v = characterStyle;
            ca0 i10 = v90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ld, this.f32850c));
                i10.g(org.telegram.ui.ActionBar.k6.o1(0.8f, d), org.telegram.ui.ActionBar.k6.o1(1.3f, d), org.telegram.ui.ActionBar.k6.o1(1.0f, d), org.telegram.ui.ActionBar.k6.o1(4.0f, d));
                i10.f25297x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                v90Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f32855w = i10;
    }

    public void setOnLinkLongPressListener(x90 x90Var) {
        this.h = x90Var;
    }

    public void setOnLinkPressListener(x90 x90Var) {
        this.f32851f = x90Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = a6.update(a(), this, this.d, getLayout());
    }

    public y90(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f32848a = false;
        this.f32849b = new v90(this);
        this.f32850c = g6Var;
    }

    public y90(Context context, v90 v90Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f32848a = true;
        this.f32849b = v90Var;
        this.f32850c = g6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
