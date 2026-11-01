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
public final class l1 extends View implements Drawable.Callback, org.telegram.ui.Cells.j9 {
    public final l60 f39045a;
    public final f4 f39046b;
    public z2 f39047c;
    public int d;
    public int e;
    public final AnimatedArrowDrawable f39048f;
    public TL_iv.pageBlockDetails h;

    public l1(Context context, l60 l60Var, f4 f4Var) {
        super(context);
        this.f39045a = l60Var;
        this.f39046b = f4Var;
        this.f39048f = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21312y6, false), true);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f39047c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f39047c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f39047c;
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
        l60 l60Var = this.f39045a;
        l60Var.getClass();
        canvas.translate(org.telegram.messenger.i0.L(18), ((getMeasuredHeight() - org.telegram.messenger.i0.L(13.0f)) - 1) / 2);
        this.f39048f.draw(canvas);
        canvas.restore();
        if (this.f39047c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            h4.t(l60Var, canvas, this, 0);
            this.f39047c.d(canvas, this);
            canvas.restore();
        }
        float measuredHeight = getMeasuredHeight() - 1;
        canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, h4.f37662s1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        CharSequence h;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        z2 z2Var = this.f39047c;
        if (z2Var != null && (h = h4.h(this.f39045a, this.f39046b, z2Var)) != null) {
            spannableStringBuilder.append(h).append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131754869, null)).append((CharSequence) ", ");
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null && pageblockdetails.open) {
            i10 = 2131754866;
        } else {
            i10 = 2131754870;
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(i10, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(39.0f);
        this.d = org.telegram.messenger.i0.L(50.0f);
        this.e = org.telegram.messenger.i0.L(11.0f) + 1;
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null) {
            TL_iv.RichText richText = pageblockdetails.title;
            l60 l60Var = this.f39045a;
            l60Var.getClass();
            int L2 = size - org.telegram.messenger.i0.L(54);
            TL_iv.pageBlockDetails pageblockdetails2 = this.h;
            f4 f4Var = this.f39046b;
            if (f4Var != null && f4Var.G) {
                alignment = org.telegram.ui.Components.pv0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = h4.n(l60Var, this, null, richText, L2, 0, pageblockdetails2, alignment, 0, this.f39046b);
            this.f39047c = n10;
            if (n10 != null) {
                L = Math.max(L, this.f39047c.d.getHeight() + org.telegram.messenger.i0.L(21.0f));
                int L3 = ((org.telegram.messenger.i0.L(21.0f) + this.f39047c.d.getHeight()) - this.f39047c.d.getHeight()) / 2;
                this.e = L3;
                z2 z2Var = this.f39047c;
                z2Var.f43793s = this.d;
                z2Var.f43794w = L3;
            }
        }
        setMeasuredDimension(size, L + 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.j(this.f39045a, this.f39046b, motionEvent, this, this.f39047c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockDetails pageblockdetails) {
        float f7;
        this.h = pageblockdetails;
        if (pageblockdetails.open) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        AnimatedArrowDrawable animatedArrowDrawable = this.f39048f;
        animatedArrowDrawable.setAnimationProgress(f7);
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
