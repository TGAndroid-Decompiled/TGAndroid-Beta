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
public class k90 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean f25712a;
    public final h90 f25713b;
    public final org.telegram.ui.ActionBar.f6 f25714c;
    public u5 d;
    public l90 e;
    public j90 f25715f;
    public j90 h;
    public boolean f25716n;
    public boolean f25717r;
    public boolean f25718s;
    public CharacterStyle v;
    public int f25719w;
    public boolean f25720x;
    public Object f25721y;

    public k90(Context context) {
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
        return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, this.f25714c);
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
        if (!this.f25720x) {
            this.f25720x = true;
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
                    if (this.f25721y == null) {
                        this.f25721y = I.get(this);
                    }
                    Object obj = this.f25721y;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k90.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f25719w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = y5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        h90 h90Var = this.f25713b;
        if (h90Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                l90 l90Var = new l90(b10, this.f25714c, motionEvent.getX(), motionEvent.getY(), 0);
                l90Var.d(c());
                this.e = l90Var;
                h90Var.a(l90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.f26069i);
                int spanEnd = spannableString.getSpanEnd(this.e.f26069i);
                e90 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, l90Var, b10, 25), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                h90Var.d(true);
                l90 l90Var2 = this.e;
                if (l90Var2 != null && (characterStyle = l90Var2.f26069i) == b10) {
                    j90 j90Var = this.f25715f;
                    if (j90Var != null) {
                        j90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                h90Var.d(true);
                this.e = null;
            }
        }
        if (this.e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f25716n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f25717r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f25718s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            h90 h90Var = this.f25713b;
            h90Var.e();
            this.v = characterStyle;
            o90 i10 = h90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, this.f25714c));
                i10.f(org.telegram.ui.ActionBar.j6.l1(0.8f, d), org.telegram.ui.ActionBar.j6.l1(1.3f, d), org.telegram.ui.ActionBar.j6.l1(1.0f, d), org.telegram.ui.ActionBar.j6.l1(4.0f, d));
                i10.f26860w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                h90Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f25719w = i10;
    }

    public void setOnLinkLongPressListener(j90 j90Var) {
        this.h = j90Var;
    }

    public void setOnLinkPressListener(j90 j90Var) {
        this.f25715f = j90Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = y5.update(a(), this, this.d, getLayout());
    }

    public k90(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f25712a = false;
        this.f25713b = new h90(this);
        this.f25714c = f6Var;
    }

    public k90(Context context, h90 h90Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f25712a = true;
        this.f25713b = h90Var;
        this.f25714c = f6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
