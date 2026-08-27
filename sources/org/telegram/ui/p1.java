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

public final class p1 extends View implements Drawable.Callback, org.telegram.ui.Cells.i9 {

    public final d70 f41238a;

    public final k4 f41239b;

    public f3 f41240c;
    public int d;

    public int f41241e;

    public final AnimatedArrowDrawable f41242f;
    public TL_iv.pageBlockDetails h;

    public p1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f41238a = d70Var;
        this.f41239b = k4Var;
        this.f41242f = new AnimatedArrowDrawable(d70Var.a(), true);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f41240c;
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
        f3 f3Var = this.f41240c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f41240c;
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
        d70 d70Var = this.f41238a;
        d70Var.getClass();
        canvas.translate(AndroidUtilities.dp(18), ((getMeasuredHeight() - AndroidUtilities.dp(13.0f)) - 1) / 2);
        this.f41242f.draw(canvas);
        canvas.restore();
        if (this.f41240c != null) {
            canvas.save();
            canvas.translate(this.d, this.f41241e);
            m4.v(d70Var, canvas, this, 0);
            this.f41240c.draw(canvas, this);
            canvas.restore();
        }
        float measuredHeight = getMeasuredHeight() - 1;
        canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, m4.f40321n1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequenceJ;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        f3 f3Var = this.f41240c;
        if (f3Var != null && (charSequenceJ = m4.j(this.f41238a, this.f41239b, f3Var)) != null) {
            spannableStringBuilder.append(charSequenceJ).append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AccDescrIVDetails)).append((CharSequence) ", ");
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        spannableStringBuilder.append((CharSequence) LocaleController.getString((pageblockdetails == null || !pageblockdetails.open) ? R.string.AccDescrIVCollapsed : R.string.AccDescrIVExpanded));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int iDp = AndroidUtilities.dp(39.0f);
        this.d = AndroidUtilities.dp(50.0f);
        this.f41241e = AndroidUtilities.dp(11.0f) + 1;
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null) {
            TL_iv.RichText richText = pageblockdetails.title;
            d70 d70Var = this.f41238a;
            d70Var.getClass();
            int iDp2 = size - AndroidUtilities.dp(54);
            TL_iv.pageBlockDetails pageblockdetails2 = this.h;
            k4 k4Var = this.f41239b;
            f3 f3VarP = m4.p(d70Var, this, null, richText, iDp2, 0, pageblockdetails2, (k4Var == null || !k4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.tv0.a(), 0, this.f41239b);
            this.f41240c = f3VarP;
            if (f3VarP != null) {
                iDp = Math.max(iDp, this.f41240c.d.getHeight() + AndroidUtilities.dp(21.0f));
                int iDp3 = ((AndroidUtilities.dp(21.0f) + this.f41240c.d.getHeight()) - this.f41240c.d.getHeight()) / 2;
                this.f41241e = iDp3;
                f3 f3Var = this.f41240c;
                f3Var.f37923s = this.d;
                f3Var.v = iDp3;
            }
        }
        setMeasuredDimension(size, iDp + 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return m4.l(this.f41238a, this.f41239b, motionEvent, this, this.f41240c, this.d, this.f41241e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockDetails pageblockdetails) {
        this.h = pageblockdetails;
        float f10 = pageblockdetails.open ? 0.0f : 1.0f;
        AnimatedArrowDrawable animatedArrowDrawable = this.f41242f;
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
