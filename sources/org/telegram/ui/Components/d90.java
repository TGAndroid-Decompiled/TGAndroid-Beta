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
public class d90 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f23335a;
    public final a90 f23336b;
    public final org.telegram.ui.ActionBar.d6 f23337c;
    public v5 d;
    public e90 e;
    public c90 f23338f;
    public c90 h;
    public boolean f23339n;
    public boolean f23340r;
    public boolean f23341s;
    public CharacterStyle v;
    public int f23342w;
    public boolean f23343x;
    public Object f23344y;

    public d90(Context context) {
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
        return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ld, this.f23337c);
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
        if (!this.f23343x) {
            this.f23343x = true;
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
                    if (this.f23344y == null) {
                        this.f23344y = I.get(this);
                    }
                    Object obj = this.f23344y;
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
        this.d = z5.update(a(), this, this.d, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z5.release(this, this.d);
    }

    @Override
    public void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d90.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f23342w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = z5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        a90 a90Var = this.f23336b;
        if (a90Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                e90 e90Var = new e90(b10, this.f23337c, motionEvent.getX(), motionEvent.getY(), 0);
                e90Var.d(c());
                this.e = e90Var;
                a90Var.a(e90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.f23625i);
                int spanEnd = spannableString.getSpanEnd(this.e.f23625i);
                x80 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(this, e90Var, b10, 22), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                a90Var.d(true);
                e90 e90Var2 = this.e;
                if (e90Var2 != null && (characterStyle = e90Var2.f23625i) == b10) {
                    c90 c90Var = this.f23338f;
                    if (c90Var != null) {
                        c90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                a90Var.d(true);
                this.e = null;
            }
        }
        if (this.e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f23339n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f23340r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f23341s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            a90 a90Var = this.f23336b;
            a90Var.e();
            this.v = characterStyle;
            h90 i10 = a90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ld, this.f23337c));
                i10.f(org.telegram.ui.ActionBar.h6.l1(0.8f, d), org.telegram.ui.ActionBar.h6.l1(1.3f, d), org.telegram.ui.ActionBar.h6.l1(1.0f, d), org.telegram.ui.ActionBar.h6.l1(4.0f, d));
                i10.f24618w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                a90Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f23342w = i10;
    }

    public void setOnLinkLongPressListener(c90 c90Var) {
        this.h = c90Var;
    }

    public void setOnLinkPressListener(c90 c90Var) {
        this.f23338f = c90Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = z5.update(a(), this, this.d, getLayout());
    }

    public d90(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f23335a = false;
        this.f23336b = new a90(this);
        this.f23337c = d6Var;
    }

    public d90(Context context, a90 a90Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f23335a = true;
        this.f23336b = a90Var;
        this.f23337c = d6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
