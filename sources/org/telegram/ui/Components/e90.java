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
public class e90 extends TextView {
    public static Field F;
    public static Class G;
    public static Method H;
    public boolean B;
    public boolean C;
    public PorterDuffColorFilter D;
    public int E;
    public final boolean f24499a;
    public final b90 f24500b;
    public final org.telegram.ui.ActionBar.f6 f24501c;
    public q5 d;
    public f90 e;
    public d90 f24502f;
    public d90 h;
    public boolean f24503n;
    public boolean f24504r;
    public boolean f24505s;
    public CharacterStyle v;
    public int f24506w;
    public boolean f24507x;
    public Object f24508y;

    public e90(Context context) {
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
        return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, this.f24501c);
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
        if (!this.f24507x) {
            this.f24507x = true;
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
                    if (this.f24508y == null) {
                        this.f24508y = F.get(this);
                    }
                    Object obj = this.f24508y;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e90.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = this.f24506w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = u5.update(a(), this, this.d, getLayout());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        b90 b90Var = this.f24500b;
        if (b90Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                f90 f90Var = new f90(b10, this.f24501c, motionEvent.getX(), motionEvent.getY(), 0);
                f90Var.d(c());
                this.e = f90Var;
                b90Var.a(f90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.f24815i);
                int spanEnd = spannableString.getSpanEnd(this.e.f24815i);
                y80 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new hp(this, f90Var, b10, 9), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                b90Var.d(true);
                f90 f90Var2 = this.e;
                if (f90Var2 != null && (characterStyle = f90Var2.f24815i) == b10) {
                    d90 d90Var = this.f24502f;
                    if (d90Var != null) {
                        d90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                b90Var.d(true);
                this.e = null;
            }
        }
        if (this.e != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisablePaddingsOffset(boolean z4) {
        this.f24503n = z4;
    }

    public void setDisablePaddingsOffsetX(boolean z4) {
        this.f24504r = z4;
    }

    public void setDisablePaddingsOffsetY(boolean z4) {
        this.f24505s = z4;
    }

    public void setEmojiColor(int i10) {
        this.C = false;
        this.D = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            b90 b90Var = this.f24500b;
            b90Var.e();
            this.v = characterStyle;
            i90 i10 = b90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, this.f24501c));
                i10.f(org.telegram.ui.ActionBar.j6.l1(0.8f, d), org.telegram.ui.ActionBar.j6.l1(1.3f, d), org.telegram.ui.ActionBar.j6.l1(1.0f, d), org.telegram.ui.ActionBar.j6.l1(4.0f, d));
                i10.f25650w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                b90Var.b(i10, null);
            }
        }
    }

    @Override
    public void setMaxWidth(int i10) {
        this.f24506w = i10;
    }

    public void setOnLinkLongPressListener(d90 d90Var) {
        this.h = d90Var;
    }

    public void setOnLinkPressListener(d90 d90Var) {
        this.f24502f = d90Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = u5.update(a(), this, this.d, getLayout());
    }

    public e90(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.B = false;
        this.C = true;
        this.f24499a = false;
        this.f24500b = new b90(this);
        this.f24501c = f6Var;
    }

    public e90(Context context, b90 b90Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.B = false;
        this.C = true;
        this.f24499a = true;
        this.f24500b = b90Var;
        this.f24501c = f6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
