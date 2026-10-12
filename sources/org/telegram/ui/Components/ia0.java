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
public class ia0 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f27112a;
    public final fa0 f27113b;
    public final org.telegram.ui.ActionBar.c6 f27114c;
    public x5 d;
    public ja0 f27115e;
    public ha0 f27116f;
    public ha0 h;
    public boolean f27117n;
    public boolean f27118r;
    public boolean f27119s;
    public CharacterStyle v;
    public int f27120w;
    public boolean f27121x;
    public Object f27122y;

    public ia0(Context context) {
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
        return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, this.f27114c);
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
        if (!this.f27121x) {
            this.f27121x = true;
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
                    if (this.f27122y == null) {
                        this.f27122y = I.get(this);
                    }
                    Object obj = this.f27122y;
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
        this.d = b6.update(a(), this, this.d, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b6.release(this, this.d);
    }

    @Override
    public void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ia0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f27120w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = b6.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        fa0 fa0Var = this.f27113b;
        if (fa0Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                ja0 ja0Var = new ja0(b10, this.f27114c, motionEvent.getX(), motionEvent.getY(), 0);
                ja0Var.d(c());
                this.f27115e = ja0Var;
                fa0Var.a(ja0Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.f27115e.f27435i);
                int spanEnd = spannableString.getSpanEnd(this.f27115e.f27435i);
                ca0 b11 = this.f27115e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new org.telegram.tgnet.h(this, ja0Var, b10, 26), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                fa0Var.d(true);
                ja0 ja0Var2 = this.f27115e;
                if (ja0Var2 != null && (characterStyle = ja0Var2.f27435i) == b10) {
                    ha0 ha0Var = this.f27116f;
                    if (ha0Var != null) {
                        ha0Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.f27115e = null;
                    return true;
                }
                this.f27115e = null;
            }
            if (motionEvent.getAction() == 3) {
                fa0Var.d(true);
                this.f27115e = null;
            }
        }
        if (this.f27115e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f27117n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f27118r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f27119s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            fa0 fa0Var = this.f27113b;
            fa0Var.e();
            this.v = characterStyle;
            ma0 i10 = fa0.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, this.f27114c));
                i10.g(org.telegram.ui.ActionBar.h6.m1(0.8f, d), org.telegram.ui.ActionBar.h6.m1(1.3f, d), org.telegram.ui.ActionBar.h6.m1(1.0f, d), org.telegram.ui.ActionBar.h6.m1(4.0f, d));
                i10.f28486x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                fa0Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f27120w = i10;
    }

    public void setOnLinkLongPressListener(ha0 ha0Var) {
        this.h = ha0Var;
    }

    public void setOnLinkPressListener(ha0 ha0Var) {
        this.f27116f = ha0Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = b6.update(a(), this, this.d, getLayout());
    }

    public ia0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f27112a = false;
        this.f27113b = new fa0(this);
        this.f27114c = c6Var;
    }

    public ia0(Context context, fa0 fa0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f27112a = true;
        this.f27113b = fa0Var;
        this.f27114c = c6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
