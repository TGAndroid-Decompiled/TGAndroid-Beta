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
public class g90 extends TextView {
    public static Field F;
    public static Class G;
    public static Method H;
    public boolean B;
    public boolean C;
    public PorterDuffColorFilter D;
    public int E;
    public final boolean f27122a;
    public final d90 f27123b;
    public final org.telegram.ui.ActionBar.g6 f27124c;
    public q5 d;
    public h90 f27125e;
    public f90 f27126f;
    public f90 h;
    public boolean f27127n;
    public boolean f27128r;
    public boolean f27129s;
    public CharacterStyle v;
    public int f27130w;
    public boolean f27131x;
    public Object f27132y;

    public g90(Context context) {
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
        return org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ld, this.f27124c);
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
        if (!this.f27131x) {
            this.f27131x = true;
            try {
                if (G == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    F = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    G = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        H = declaredMethod;
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
                if (H != null) {
                    if (this.f27132y == null) {
                        this.f27132y = F.get(this);
                    }
                    Object obj = this.f27132y;
                    if (obj != null) {
                        H.invoke(obj, null);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = u5.update(a(), this, this.d, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u5.release(this, this.d);
    }

    @Override
    public void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g90.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f27130w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = u5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        d90 d90Var = this.f27123b;
        if (d90Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                h90 h90Var = new h90(b10, this.f27124c, motionEvent.getX(), motionEvent.getY(), 0);
                h90Var.d(c());
                this.f27125e = h90Var;
                d90Var.a(h90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.f27125e.f27423i);
                int spanEnd = spannableString.getSpanEnd(this.f27125e.f27423i);
                z80 b11 = this.f27125e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new jp(this, h90Var, b10, 9), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                d90Var.d(true);
                h90 h90Var2 = this.f27125e;
                if (h90Var2 != null && (characterStyle = h90Var2.f27423i) == b10) {
                    f90 f90Var = this.f27126f;
                    if (f90Var != null) {
                        f90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.f27125e = null;
                    return true;
                }
                this.f27125e = null;
            }
            if (motionEvent.getAction() == 3) {
                d90Var.d(true);
                this.f27125e = null;
            }
        }
        if (this.f27125e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z4) {
        this.f27127n = z4;
    }

    public void setDisablePaddingsOffsetX(boolean z4) {
        this.f27128r = z4;
    }

    public void setDisablePaddingsOffsetY(boolean z4) {
        this.f27129s = z4;
    }

    public void setEmojiColor(int i10) {
        this.C = false;
        this.D = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            d90 d90Var = this.f27123b;
            d90Var.e();
            this.v = characterStyle;
            k90 i10 = d90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ld, this.f27124c));
                i10.f(org.telegram.ui.ActionBar.k6.l1(0.8f, d), org.telegram.ui.ActionBar.k6.l1(1.3f, d), org.telegram.ui.ActionBar.k6.l1(1.0f, d), org.telegram.ui.ActionBar.k6.l1(4.0f, d));
                i10.f28369w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                d90Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f27130w = i10;
    }

    public void setOnLinkLongPressListener(f90 f90Var) {
        this.h = f90Var;
    }

    public void setOnLinkPressListener(f90 f90Var) {
        this.f27126f = f90Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = u5.update(a(), this, this.d, getLayout());
    }

    public g90(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.B = false;
        this.C = true;
        this.f27122a = false;
        this.f27123b = new d90(this);
        this.f27124c = g6Var;
    }

    public g90(Context context, d90 d90Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.B = false;
        this.C = true;
        this.f27122a = true;
        this.f27123b = d90Var;
        this.f27124c = g6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
