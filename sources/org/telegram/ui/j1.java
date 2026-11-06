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
public final class j1 extends View implements Drawable.Callback, org.telegram.ui.Cells.h9 {
    public final o50 f46784a;
    public final e4 f46785b;
    public z2 f46786c;
    public int d;
    public int f46787e;
    public final AnimatedArrowDrawable f46788f;
    public TL_iv.pageBlockDetails h;

    public j1(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.f46784a = o50Var;
        this.f46785b = e4Var;
        this.f46788f = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28240y6, false), true);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f46786c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f46786c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f46786c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        canvas.save();
        o50 o50Var = this.f46784a;
        o50Var.getClass();
        canvas.translate(org.telegram.messenger.g0.L(18), ((getMeasuredHeight() - org.telegram.messenger.g0.L(13.0f)) - 1) / 2);
        this.f46788f.draw(canvas);
        canvas.restore();
        if (this.f46786c != null) {
            canvas.save();
            canvas.translate(this.d, this.f46787e);
            g4.t(o50Var, canvas, this, 0);
            this.f46786c.d(canvas, this);
            canvas.restore();
        }
        float measuredHeight = getMeasuredHeight() - 1;
        canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, g4.f45787s1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        CharSequence h;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        z2 z2Var = this.f46786c;
        if (z2Var != null && (h = g4.h(this.f46784a, this.f46785b, z2Var)) != null) {
            spannableStringBuilder.append(h).append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131754869, null)).append((CharSequence) ", ");
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null && pageblockdetails.open) {
            i7 = 2131754866;
        } else {
            i7 = 2131754870;
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(i7, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(39.0f);
        this.d = org.telegram.messenger.g0.L(50.0f);
        this.f46787e = org.telegram.messenger.g0.L(11.0f) + 1;
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null) {
            TL_iv.RichText richText = pageblockdetails.title;
            o50 o50Var = this.f46784a;
            o50Var.getClass();
            int L2 = size - org.telegram.messenger.g0.L(54);
            TL_iv.pageBlockDetails pageblockdetails2 = this.h;
            e4 e4Var = this.f46785b;
            if (e4Var != null && e4Var.G) {
                alignment = org.telegram.ui.Components.mu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(o50Var, this, null, richText, L2, 0, pageblockdetails2, alignment, 0, this.f46785b);
            this.f46786c = n10;
            if (n10 != null) {
                L = Math.max(L, this.f46786c.d.getHeight() + org.telegram.messenger.g0.L(21.0f));
                int L3 = ((org.telegram.messenger.g0.L(21.0f) + this.f46786c.d.getHeight()) - this.f46786c.d.getHeight()) / 2;
                this.f46787e = L3;
                z2 z2Var = this.f46786c;
                z2Var.f52436s = this.d;
                z2Var.f52437w = L3;
            }
        }
        setMeasuredDimension(size, L + 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f46784a, this.f46785b, motionEvent, this, this.f46786c, this.d, this.f46787e) && !super.onTouchEvent(motionEvent)) {
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
        AnimatedArrowDrawable animatedArrowDrawable = this.f46788f;
        animatedArrowDrawable.setAnimationProgress(f10);
        animatedArrowDrawable.setCallback(this);
        requestLayout();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
