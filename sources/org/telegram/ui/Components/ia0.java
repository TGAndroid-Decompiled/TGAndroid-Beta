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
    public final boolean f27097a;
    public final fa0 f27098b;
    public final org.telegram.ui.ActionBar.c6 f27099c;
    public x5 d;
    public ja0 f27100e;
    public ha0 f27101f;
    public ha0 h;
    public boolean f27102n;
    public boolean f27103r;
    public boolean f27104s;
    public CharacterStyle v;
    public int f27105w;
    public boolean f27106x;
    public Object f27107y;

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
        return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, this.f27099c);
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
        if (!this.f27106x) {
            this.f27106x = true;
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
                    if (this.f27107y == null) {
                        this.f27107y = I.get(this);
                    }
                    Object obj = this.f27107y;
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
        int i12 = this.f27105w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = b6.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        fa0 fa0Var = this.f27098b;
        if (fa0Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                ja0 ja0Var = new ja0(b10, this.f27099c, motionEvent.getX(), motionEvent.getY(), 0);
                ja0Var.d(c());
                this.f27100e = ja0Var;
                fa0Var.a(ja0Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.f27100e.f27429i);
                int spanEnd = spannableString.getSpanEnd(this.f27100e.f27429i);
                ca0 b11 = this.f27100e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new org.telegram.tgnet.h(this, ja0Var, b10, 26), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                fa0Var.d(true);
                ja0 ja0Var2 = this.f27100e;
                if (ja0Var2 != null && (characterStyle = ja0Var2.f27429i) == b10) {
                    ha0 ha0Var = this.f27101f;
                    if (ha0Var != null) {
                        ha0Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.f27100e = null;
                    return true;
                }
                this.f27100e = null;
            }
            if (motionEvent.getAction() == 3) {
                fa0Var.d(true);
                this.f27100e = null;
            }
        }
        if (this.f27100e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.f27102n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f27103r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f27104s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            fa0 fa0Var = this.f27098b;
            fa0Var.e();
            this.v = characterStyle;
            ma0 i10 = fa0.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, this.f27099c));
                i10.g(org.telegram.ui.ActionBar.h6.m1(0.8f, d), org.telegram.ui.ActionBar.h6.m1(1.3f, d), org.telegram.ui.ActionBar.h6.m1(1.0f, d), org.telegram.ui.ActionBar.h6.m1(4.0f, d));
                i10.f28481x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                fa0Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f27105w = i10;
    }

    public void setOnLinkLongPressListener(ha0 ha0Var) {
        this.h = ha0Var;
    }

    public void setOnLinkPressListener(ha0 ha0Var) {
        this.f27101f = ha0Var;
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
        this.f27097a = false;
        this.f27098b = new fa0(this);
        this.f27099c = c6Var;
    }

    public ia0(Context context, fa0 fa0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.f27097a = true;
        this.f27098b = fa0Var;
        this.f27099c = c6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
