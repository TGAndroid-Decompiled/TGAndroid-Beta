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
public class o90 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f26999a;
    public final l90 f27000b;
    public final org.telegram.ui.ActionBar.d6 f27001c;
    public v5 d;
    public p90 e;
    public n90 f27002f;
    public n90 h;
    public boolean f27003n;
    public boolean f27004r;
    public boolean f27005s;
    public CharacterStyle v;
    public int f27006w;
    public boolean f27007x;
    public Object f27008y;

    public o90(Context context) {
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
        return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ld, this.f27001c);
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
        if (!this.f27007x) {
            this.f27007x = true;
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
                    if (this.f27008y == null) {
                        this.f27008y = I.get(this);
                    }
                    Object obj = this.f27008y;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o90.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f27006w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = z5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        l90 l90Var = this.f27000b;
        if (l90Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                p90 p90Var = new p90(b10, this.f27001c, motionEvent.getX(), motionEvent.getY(), 0);
                p90Var.d(c());
                this.e = p90Var;
                l90Var.a(p90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.f27258i);
                int spanEnd = spannableString.getSpanEnd(this.e.f27258i);
                i90 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, p90Var, b10, 25), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                l90Var.d(true);
                p90 p90Var2 = this.e;
                if (p90Var2 != null && (characterStyle = p90Var2.f27258i) == b10) {
                    n90 n90Var = this.f27002f;
                    if (n90Var != null) {
                        n90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                l90Var.d(true);
                this.e = null;
            }
        }
        if (this.e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f27003n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f27004r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f27005s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            l90 l90Var = this.f27000b;
            l90Var.e();
            this.v = characterStyle;
            s90 i10 = l90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ld, this.f27001c));
                i10.f(org.telegram.ui.ActionBar.h6.l1(0.8f, d), org.telegram.ui.ActionBar.h6.l1(1.3f, d), org.telegram.ui.ActionBar.h6.l1(1.0f, d), org.telegram.ui.ActionBar.h6.l1(4.0f, d));
                i10.f28220w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                l90Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f27006w = i10;
    }

    public void setOnLinkLongPressListener(n90 n90Var) {
        this.h = n90Var;
    }

    public void setOnLinkPressListener(n90 n90Var) {
        this.f27002f = n90Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = z5.update(a(), this, this.d, getLayout());
    }

    public o90(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f26999a = false;
        this.f27000b = new l90(this);
        this.f27001c = d6Var;
    }

    public o90(Context context, l90 l90Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f26999a = true;
        this.f27000b = l90Var;
        this.f27001c = d6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
