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
public class ea0 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f26033a;
    public final ba0 f26034b;
    public final org.telegram.ui.ActionBar.d6 f26035c;
    public x5 d;
    public fa0 f26036e;
    public da0 f26037f;
    public da0 h;
    public boolean f26038n;
    public boolean f26039r;
    public boolean f26040s;
    public CharacterStyle v;
    public int f26041w;
    public boolean f26042x;
    public Object f26043y;

    public ea0(Context context) {
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
        return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, this.f26035c);
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
        if (!this.f26042x) {
            this.f26042x = true;
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
                    if (this.f26043y == null) {
                        this.f26043y = I.get(this);
                    }
                    Object obj = this.f26043y;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ea0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f26041w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = b6.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        ba0 ba0Var = this.f26034b;
        if (ba0Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                fa0 fa0Var = new fa0(b10, this.f26035c, motionEvent.getX(), motionEvent.getY(), 0);
                fa0Var.d(c());
                this.f26036e = fa0Var;
                ba0Var.a(fa0Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.f26036e.f26421i);
                int spanEnd = spannableString.getSpanEnd(this.f26036e.f26421i);
                y90 b11 = this.f26036e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f(this, fa0Var, b10, 28), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                ba0Var.d(true);
                fa0 fa0Var2 = this.f26036e;
                if (fa0Var2 != null && (characterStyle = fa0Var2.f26421i) == b10) {
                    da0 da0Var = this.f26037f;
                    if (da0Var != null) {
                        da0Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.f26036e = null;
                    return true;
                }
                this.f26036e = null;
            }
            if (motionEvent.getAction() == 3) {
                ba0Var.d(true);
                this.f26036e = null;
            }
        }
        if (this.f26036e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f26038n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f26039r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f26040s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            ba0 ba0Var = this.f26034b;
            ba0Var.e();
            this.v = characterStyle;
            ia0 i10 = ba0.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, this.f26035c));
                i10.g(org.telegram.ui.ActionBar.h6.m1(0.8f, d), org.telegram.ui.ActionBar.h6.m1(1.3f, d), org.telegram.ui.ActionBar.h6.m1(1.0f, d), org.telegram.ui.ActionBar.h6.m1(4.0f, d));
                i10.f27404x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                ba0Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f26041w = i10;
    }

    public void setOnLinkLongPressListener(da0 da0Var) {
        this.h = da0Var;
    }

    public void setOnLinkPressListener(da0 da0Var) {
        this.f26037f = da0Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = b6.update(a(), this, this.d, getLayout());
    }

    public ea0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f26033a = false;
        this.f26034b = new ba0(this);
        this.f26035c = d6Var;
    }

    public ea0(Context context, ba0 ba0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f26033a = true;
        this.f26034b = ba0Var;
        this.f26035c = d6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
