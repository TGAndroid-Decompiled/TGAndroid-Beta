package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class k1 extends View implements Drawable.Callback, org.telegram.ui.Cells.g9 {
    public final i50 f46736a;
    public final g4 f46737b;
    public a3 f46738c;
    public int d;
    public int f46739e;
    public final AnimatedArrowDrawable f46740f;
    public TL_iv.pageBlockDetails h;

    public k1(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f46736a = i50Var;
        this.f46737b = g4Var;
        this.f46740f = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false), true);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f46738c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f46738c;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f46738c;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        canvas.save();
        i50 i50Var = this.f46736a;
        i50Var.getClass();
        canvas.translate(org.telegram.messenger.g0.L(18), ((getMeasuredHeight() - org.telegram.messenger.g0.L(13.0f)) - 1) / 2);
        this.f46740f.draw(canvas);
        canvas.restore();
        if (this.f46738c != null) {
            canvas.save();
            canvas.translate(this.d, this.f46739e);
            i4.t(i50Var, canvas, this, 0);
            this.f46738c.d(canvas, this);
            canvas.restore();
        }
        float measuredHeight = getMeasuredHeight() - 1;
        canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, i4.f46070t1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i3;
        CharSequence h;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a3 a3Var = this.f46738c;
        if (a3Var != null && (h = i4.h(this.f46736a, this.f46737b, a3Var)) != null) {
            spannableStringBuilder.append(h).append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131754869, null)).append((CharSequence) ", ");
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null && pageblockdetails.open) {
            i3 = 2131754866;
        } else {
            i3 = 2131754870;
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(i3, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i3);
        int L = org.telegram.messenger.g0.L(39.0f);
        this.d = org.telegram.messenger.g0.L(50.0f);
        this.f46739e = org.telegram.messenger.g0.L(11.0f) + 1;
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null) {
            TL_iv.RichText richText = pageblockdetails.title;
            i50 i50Var = this.f46736a;
            i50Var.getClass();
            int L2 = size - org.telegram.messenger.g0.L(54);
            TL_iv.pageBlockDetails pageblockdetails2 = this.h;
            g4 g4Var = this.f46737b;
            if (g4Var != null && g4Var.H) {
                alignment = org.telegram.ui.Components.lu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 n4 = i4.n(i50Var, this, null, richText, L2, 0, pageblockdetails2, alignment, 0, this.f46737b);
            this.f46738c = n4;
            if (n4 != null) {
                L = Math.max(L, this.f46738c.d.getHeight() + org.telegram.messenger.g0.L(21.0f));
                int L3 = ((org.telegram.messenger.g0.L(21.0f) + this.f46738c.d.getHeight()) - this.f46738c.d.getHeight()) / 2;
                this.f46739e = L3;
                a3 a3Var = this.f46738c;
                a3Var.f43579s = this.d;
                a3Var.f43580w = L3;
            }
        }
        setMeasuredDimension(size, L + 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.j(this.f46736a, this.f46737b, motionEvent, this, this.f46738c, this.d, this.f46739e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockDetails pageblockdetails) {
        float f10;
        this.h = pageblockdetails;
        if (pageblockdetails.open) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        AnimatedArrowDrawable animatedArrowDrawable = this.f46740f;
        animatedArrowDrawable.setAnimationProgress(f10);
        animatedArrowDrawable.setCallback(this);
        requestLayout();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
