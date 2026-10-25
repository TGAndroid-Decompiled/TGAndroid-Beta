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
public class z90 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f35266a;
    public final w90 f35267b;
    public final org.telegram.ui.ActionBar.u6 f35268c;
    public y5 d;
    public aa0 e;
    public y90 f35269f;
    public y90 h;
    public boolean f35270n;
    public boolean f35271r;
    public boolean f35272s;
    public CharacterStyle v;
    public int f35273w;
    public boolean f35274x;
    public Object f35275y;

    public z90(Context context) {
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
        return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ld, this.f35268c);
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
        if (!this.f35274x) {
            this.f35274x = true;
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
                    if (this.f35275y == null) {
                        this.f35275y = I.get(this);
                    }
                    Object obj = this.f35275y;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z90.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f35273w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = c6.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        w90 w90Var = this.f35267b;
        if (w90Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                aa0 aa0Var = new aa0(b10, this.f35268c, motionEvent.getX(), motionEvent.getY(), 0);
                aa0Var.d(c());
                this.e = aa0Var;
                w90Var.a(aa0Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.f26445i);
                int spanEnd = spannableString.getSpanEnd(this.e.f26445i);
                s90 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new kg(this, aa0Var, b10, 14), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                w90Var.d(true);
                aa0 aa0Var2 = this.e;
                if (aa0Var2 != null && (characterStyle = aa0Var2.f26445i) == b10) {
                    y90 y90Var = this.f35269f;
                    if (y90Var != null) {
                        y90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                w90Var.d(true);
                this.e = null;
            }
        }
        if (this.e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f35270n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f35271r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f35272s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            w90 w90Var = this.f35267b;
            w90Var.e();
            this.v = characterStyle;
            da0 i10 = w90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ld, this.f35268c));
                i10.g(org.telegram.ui.ActionBar.y6.o1(0.8f, d), org.telegram.ui.ActionBar.y6.o1(1.3f, d), org.telegram.ui.ActionBar.y6.o1(1.0f, d), org.telegram.ui.ActionBar.y6.o1(4.0f, d));
                i10.f27478x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                w90Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f35273w = i10;
    }

    public void setOnLinkLongPressListener(y90 y90Var) {
        this.h = y90Var;
    }

    public void setOnLinkPressListener(y90 y90Var) {
        this.f35269f = y90Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = c6.update(a(), this, this.d, getLayout());
    }

    public z90(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f35266a = false;
        this.f35267b = new w90(this);
        this.f35268c = u6Var;
    }

    public z90(Context context, w90 w90Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f35266a = true;
        this.f35267b = w90Var;
        this.f35268c = u6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
