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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class p1 extends View implements Drawable.Callback, org.telegram.ui.Cells.j9 {
    public final d70 f41273a;
    public final k4 f41274b;
    public f3 f41275c;
    public int d;
    public int f41276e;
    public final AnimatedArrowDrawable f41277f;
    public TL_iv.pageBlockDetails h;

    public p1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f41273a = d70Var;
        this.f41274b = k4Var;
        this.f41277f = new AnimatedArrowDrawable(d70Var.a(), true);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f41275c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f41275c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f41275c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        canvas.save();
        d70 d70Var = this.f41273a;
        d70Var.getClass();
        canvas.translate(AndroidUtilities.dp(18), ((getMeasuredHeight() - AndroidUtilities.dp(13.0f)) - 1) / 2);
        this.f41277f.draw(canvas);
        canvas.restore();
        if (this.f41275c != null) {
            canvas.save();
            canvas.translate(this.d, this.f41276e);
            m4.v(d70Var, canvas, this, 0);
            this.f41275c.draw(canvas, this);
            canvas.restore();
        }
        float measuredHeight = getMeasuredHeight() - 1;
        canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, m4.f40378n1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        CharSequence j10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        f3 f3Var = this.f41275c;
        if (f3Var != null && (j10 = m4.j(this.f41273a, this.f41274b, f3Var)) != null) {
            spannableStringBuilder.append(j10).append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AccDescrIVDetails)).append((CharSequence) ", ");
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null && pageblockdetails.open) {
            i10 = R.string.AccDescrIVExpanded;
        } else {
            i10 = R.string.AccDescrIVCollapsed;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i10));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(39.0f);
        this.d = AndroidUtilities.dp(50.0f);
        this.f41276e = AndroidUtilities.dp(11.0f) + 1;
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null) {
            TL_iv.RichText richText = pageblockdetails.title;
            d70 d70Var = this.f41273a;
            d70Var.getClass();
            int dp2 = size - AndroidUtilities.dp(54);
            TL_iv.pageBlockDetails pageblockdetails2 = this.h;
            k4 k4Var = this.f41274b;
            if (k4Var != null && k4Var.C) {
                alignment = org.telegram.ui.Components.bw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            f3 p10 = m4.p(d70Var, this, null, richText, dp2, 0, pageblockdetails2, alignment, 0, this.f41274b);
            this.f41275c = p10;
            if (p10 != null) {
                dp = Math.max(dp, this.f41275c.d.getHeight() + AndroidUtilities.dp(21.0f));
                int dp3 = ((AndroidUtilities.dp(21.0f) + this.f41275c.d.getHeight()) - this.f41275c.d.getHeight()) / 2;
                this.f41276e = dp3;
                f3 f3Var = this.f41275c;
                f3Var.f37974s = this.d;
                f3Var.v = dp3;
            }
        }
        setMeasuredDimension(size, dp + 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m4.l(this.f41273a, this.f41274b, motionEvent, this, this.f41275c, this.d, this.f41276e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockDetails pageblockdetails) {
        float f9;
        this.h = pageblockdetails;
        if (pageblockdetails.open) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        AnimatedArrowDrawable animatedArrowDrawable = this.f41277f;
        animatedArrowDrawable.setAnimationProgress(f9);
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
