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
public class q90 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f29987a;
    public final n90 f29988b;
    public final org.telegram.ui.ActionBar.d6 f29989c;
    public v5 d;
    public r90 f29990e;
    public p90 f29991f;
    public p90 h;
    public boolean f29992n;
    public boolean f29993r;
    public boolean f29994s;
    public CharacterStyle v;
    public int f29995w;
    public boolean f29996x;
    public Object f29997y;

    public q90(Context context) {
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
        return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ld, this.f29989c);
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
        if (!this.f29996x) {
            this.f29996x = true;
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
                    if (this.f29997y == null) {
                        this.f29997y = I.get(this);
                    }
                    Object obj = this.f29997y;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q90.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f29995w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = z5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        n90 n90Var = this.f29988b;
        if (n90Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                r90 r90Var = new r90(b10, this.f29989c, motionEvent.getX(), motionEvent.getY(), 0);
                r90Var.d(c());
                this.f29990e = r90Var;
                n90Var.a(r90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.f29990e.f30394i);
                int spanEnd = spannableString.getSpanEnd(this.f29990e.f30394i);
                k90 b11 = this.f29990e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, r90Var, b10, 25), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                n90Var.d(true);
                r90 r90Var2 = this.f29990e;
                if (r90Var2 != null && (characterStyle = r90Var2.f30394i) == b10) {
                    p90 p90Var = this.f29991f;
                    if (p90Var != null) {
                        p90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.f29990e = null;
                    return true;
                }
                this.f29990e = null;
            }
            if (motionEvent.getAction() == 3) {
                n90Var.d(true);
                this.f29990e = null;
            }
        }
        if (this.f29990e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f29992n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f29993r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f29994s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            n90 n90Var = this.f29988b;
            n90Var.e();
            this.v = characterStyle;
            u90 i10 = n90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ld, this.f29989c));
                i10.f(org.telegram.ui.ActionBar.i6.l1(0.8f, d), org.telegram.ui.ActionBar.i6.l1(1.3f, d), org.telegram.ui.ActionBar.i6.l1(1.0f, d), org.telegram.ui.ActionBar.i6.l1(4.0f, d));
                i10.f31405w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                n90Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f29995w = i10;
    }

    public void setOnLinkLongPressListener(p90 p90Var) {
        this.h = p90Var;
    }

    public void setOnLinkPressListener(p90 p90Var) {
        this.f29991f = p90Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = z5.update(a(), this, this.d, getLayout());
    }

    public q90(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f29987a = false;
        this.f29988b = new n90(this);
        this.f29989c = d6Var;
    }

    public q90(Context context, n90 n90Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f29987a = true;
        this.f29988b = n90Var;
        this.f29989c = d6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
