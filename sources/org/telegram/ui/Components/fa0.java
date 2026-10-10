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
public class fa0 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f26369a;
    public final ca0 f26370b;
    public final org.telegram.ui.ActionBar.e6 f26371c;
    public x5 d;
    public ga0 f26372e;
    public ea0 f26373f;
    public ea0 h;
    public boolean f26374n;
    public boolean f26375r;
    public boolean f26376s;
    public CharacterStyle v;
    public int f26377w;
    public boolean f26378x;
    public Object f26379y;

    public fa0(Context context) {
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
        return org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ld, this.f26371c);
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
        if (!this.f26378x) {
            this.f26378x = true;
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
                    if (this.f26379y == null) {
                        this.f26379y = I.get(this);
                    }
                    Object obj = this.f26379y;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fa0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f26377w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = b6.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        ca0 ca0Var = this.f26370b;
        if (ca0Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                ga0 ga0Var = new ga0(b10, this.f26371c, motionEvent.getX(), motionEvent.getY(), 0);
                ga0Var.d(c());
                this.f26372e = ga0Var;
                ca0Var.a(ga0Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.f26372e.f26673i);
                int spanEnd = spannableString.getSpanEnd(this.f26372e.f26673i);
                z90 b11 = this.f26372e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f(this, ga0Var, b10, 28), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                ca0Var.d(true);
                ga0 ga0Var2 = this.f26372e;
                if (ga0Var2 != null && (characterStyle = ga0Var2.f26673i) == b10) {
                    ea0 ea0Var = this.f26373f;
                    if (ea0Var != null) {
                        ea0Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.f26372e = null;
                    return true;
                }
                this.f26372e = null;
            }
            if (motionEvent.getAction() == 3) {
                ca0Var.d(true);
                this.f26372e = null;
            }
        }
        if (this.f26372e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f26374n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f26375r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f26376s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            ca0 ca0Var = this.f26370b;
            ca0Var.e();
            this.v = characterStyle;
            ja0 i10 = ca0.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ld, this.f26371c));
                i10.g(org.telegram.ui.ActionBar.i6.m1(0.8f, d), org.telegram.ui.ActionBar.i6.m1(1.3f, d), org.telegram.ui.ActionBar.i6.m1(1.0f, d), org.telegram.ui.ActionBar.i6.m1(4.0f, d));
                i10.f27651x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                ca0Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f26377w = i10;
    }

    public void setOnLinkLongPressListener(ea0 ea0Var) {
        this.h = ea0Var;
    }

    public void setOnLinkPressListener(ea0 ea0Var) {
        this.f26373f = ea0Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = b6.update(a(), this, this.d, getLayout());
    }

    public fa0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f26369a = false;
        this.f26370b = new ca0(this);
        this.f26371c = e6Var;
    }

    public fa0(Context context, ca0 ca0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f26369a = true;
        this.f26370b = ca0Var;
        this.f26371c = e6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
