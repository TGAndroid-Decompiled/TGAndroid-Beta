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
public class m90 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f25186a;
    public final j90 f25187b;
    public final org.telegram.ui.ActionBar.f6 f25188c;
    public u5 d;
    public n90 e;
    public l90 f25189f;
    public l90 h;
    public boolean f25190n;
    public boolean f25191r;
    public boolean f25192s;
    public CharacterStyle v;
    public int f25193w;
    public boolean f25194x;
    public Object f25195y;

    public m90(Context context) {
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
        return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, this.f25188c);
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
        if (!this.f25194x) {
            this.f25194x = true;
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
                    if (this.f25195y == null) {
                        this.f25195y = I.get(this);
                    }
                    Object obj = this.f25195y;
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
        this.d = y5.update(a(), this, this.d, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y5.release(this, this.d);
    }

    @Override
    public void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m90.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f25193w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = y5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        j90 j90Var = this.f25187b;
        if (j90Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                n90 n90Var = new n90(b10, this.f25188c, motionEvent.getX(), motionEvent.getY(), 0);
                n90Var.d(c());
                this.e = n90Var;
                j90Var.a(n90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.f25465i);
                int spanEnd = spannableString.getSpanEnd(this.e.f25465i);
                g90 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new gf(this, n90Var, b10, 14), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                j90Var.d(true);
                n90 n90Var2 = this.e;
                if (n90Var2 != null && (characterStyle = n90Var2.f25465i) == b10) {
                    l90 l90Var = this.f25189f;
                    if (l90Var != null) {
                        l90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                j90Var.d(true);
                this.e = null;
            }
        }
        if (this.e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f25190n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f25191r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f25192s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            j90 j90Var = this.f25187b;
            j90Var.e();
            this.v = characterStyle;
            q90 i10 = j90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, this.f25188c));
                i10.f(org.telegram.ui.ActionBar.j6.l1(0.8f, d), org.telegram.ui.ActionBar.j6.l1(1.3f, d), org.telegram.ui.ActionBar.j6.l1(1.0f, d), org.telegram.ui.ActionBar.j6.l1(4.0f, d));
                i10.f26363w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                j90Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f25193w = i10;
    }

    public void setOnLinkLongPressListener(l90 l90Var) {
        this.h = l90Var;
    }

    public void setOnLinkPressListener(l90 l90Var) {
        this.f25189f = l90Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = y5.update(a(), this, this.d, getLayout());
    }

    public m90(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f25186a = false;
        this.f25187b = new j90(this);
        this.f25188c = f6Var;
    }

    public m90(Context context, j90 j90Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f25186a = true;
        this.f25187b = j90Var;
        this.f25188c = f6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
