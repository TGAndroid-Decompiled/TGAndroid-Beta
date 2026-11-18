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
public final class j1 extends View implements Drawable.Callback, org.telegram.ui.Cells.i9 {
    public final p50 f48843a;
    public final e4 f48844b;
    public z2 f48845c;
    public int d;
    public int f48846e;
    public final AnimatedArrowDrawable f48847f;
    public TL_iv.pageBlockDetails h;

    public j1(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f48843a = p50Var;
        this.f48844b = e4Var;
        this.f48847f = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29786y6, false), true);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f48845c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f48845c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f48845c;
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
        p50 p50Var = this.f48843a;
        p50Var.getClass();
        canvas.translate(org.telegram.messenger.g0.L(18), ((getMeasuredHeight() - org.telegram.messenger.g0.L(13.0f)) - 1) / 2);
        this.f48847f.draw(canvas);
        canvas.restore();
        if (this.f48845c != null) {
            canvas.save();
            canvas.translate(this.d, this.f48846e);
            g4.t(p50Var, canvas, this, 0);
            this.f48845c.d(canvas, this);
            canvas.restore();
        }
        float measuredHeight = getMeasuredHeight() - 1;
        canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, g4.f47869t1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        CharSequence h;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        z2 z2Var = this.f48845c;
        if (z2Var != null && (h = g4.h(this.f48843a, this.f48844b, z2Var)) != null) {
            spannableStringBuilder.append(h).append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131754869, null)).append((CharSequence) ", ");
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null && pageblockdetails.open) {
            i7 = 2131754866;
        } else {
            i7 = 2131754870;
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(i7, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(39.0f);
        this.d = org.telegram.messenger.g0.L(50.0f);
        this.f48846e = org.telegram.messenger.g0.L(11.0f) + 1;
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null) {
            TL_iv.RichText richText = pageblockdetails.title;
            p50 p50Var = this.f48843a;
            p50Var.getClass();
            int L2 = size - org.telegram.messenger.g0.L(54);
            TL_iv.pageBlockDetails pageblockdetails2 = this.h;
            e4 e4Var = this.f48844b;
            if (e4Var != null && e4Var.H) {
                alignment = org.telegram.ui.Components.wu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(p50Var, this, null, richText, L2, 0, pageblockdetails2, alignment, 0, this.f48844b);
            this.f48845c = n10;
            if (n10 != null) {
                L = Math.max(L, this.f48845c.d.getHeight() + org.telegram.messenger.g0.L(21.0f));
                int L3 = ((org.telegram.messenger.g0.L(21.0f) + this.f48845c.d.getHeight()) - this.f48845c.d.getHeight()) / 2;
                this.f48846e = L3;
                z2 z2Var = this.f48845c;
                z2Var.f54332s = this.d;
                z2Var.f54333w = L3;
            }
        }
        setMeasuredDimension(size, L + 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f48843a, this.f48844b, motionEvent, this, this.f48845c, this.d, this.f48846e) && !super.onTouchEvent(motionEvent)) {
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
        AnimatedArrowDrawable animatedArrowDrawable = this.f48847f;
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
