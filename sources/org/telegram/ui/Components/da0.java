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
public class da0 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f24022a;
    public final aa0 f24023b;
    public final org.telegram.ui.ActionBar.c6 f24024c;
    public x5 d;
    public ea0 e;
    public ca0 f24025f;
    public ca0 h;
    public boolean f24026n;
    public boolean f24027r;
    public boolean f24028s;
    public CharacterStyle v;
    public int f24029w;
    public boolean f24030x;
    public Object f24031y;

    public da0(Context context) {
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
        return org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ld, this.f24024c);
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
        if (!this.f24030x) {
            this.f24030x = true;
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
                    if (this.f24031y == null) {
                        this.f24031y = I.get(this);
                    }
                    Object obj = this.f24031y;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.da0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f24029w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = b6.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        aa0 aa0Var = this.f24023b;
        if (aa0Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                ea0 ea0Var = new ea0(b10, this.f24024c, motionEvent.getX(), motionEvent.getY(), 0);
                ea0Var.d(c());
                this.e = ea0Var;
                aa0Var.a(ea0Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.f24357i);
                int spanEnd = spannableString.getSpanEnd(this.e.f24357i);
                x90 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f(this, ea0Var, b10, 28), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                aa0Var.d(true);
                ea0 ea0Var2 = this.e;
                if (ea0Var2 != null && (characterStyle = ea0Var2.f24357i) == b10) {
                    ca0 ca0Var = this.f24025f;
                    if (ca0Var != null) {
                        ca0Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                aa0Var.d(true);
                this.e = null;
            }
        }
        if (this.e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f24026n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f24027r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f24028s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            aa0 aa0Var = this.f24023b;
            aa0Var.e();
            this.v = characterStyle;
            ha0 i10 = aa0.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ld, this.f24024c));
                i10.g(org.telegram.ui.ActionBar.g6.m1(0.8f, d), org.telegram.ui.ActionBar.g6.m1(1.3f, d), org.telegram.ui.ActionBar.g6.m1(1.0f, d), org.telegram.ui.ActionBar.g6.m1(4.0f, d));
                i10.f25266x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                aa0Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f24029w = i10;
    }

    public void setOnLinkLongPressListener(ca0 ca0Var) {
        this.h = ca0Var;
    }

    public void setOnLinkPressListener(ca0 ca0Var) {
        this.f24025f = ca0Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = b6.update(a(), this, this.d, getLayout());
    }

    public da0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f24022a = false;
        this.f24023b = new aa0(this);
        this.f24024c = c6Var;
    }

    public da0(Context context, aa0 aa0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f24022a = true;
        this.f24023b = aa0Var;
        this.f24024c = c6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
