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
public final class o1 extends View implements Drawable.Callback, org.telegram.ui.Cells.n9 {
    public final z70 f38822a;
    public final i4 f38823b;
    public d3 f38824c;
    public int d;
    public int e;
    public final AnimatedArrowDrawable f38825f;
    public TL_iv.pageBlockDetails h;

    public o1(Context context, z70 z70Var, i4 i4Var) {
        super(context);
        this.f38822a = z70Var;
        this.f38823b = i4Var;
        this.f38825f = new AnimatedArrowDrawable(z70Var.a(), true);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f38824c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f38824c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f38824c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        canvas.save();
        z70 z70Var = this.f38822a;
        z70Var.getClass();
        canvas.translate(AndroidUtilities.dp(18), ((getMeasuredHeight() - AndroidUtilities.dp(13.0f)) - 1) / 2);
        this.f38825f.draw(canvas);
        canvas.restore();
        if (this.f38824c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            k4.v(z70Var, canvas, this, 0);
            this.f38824c.draw(canvas, this);
            canvas.restore();
        }
        float measuredHeight = getMeasuredHeight() - 1;
        canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, k4.f37528r1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        CharSequence j10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        d3 d3Var = this.f38824c;
        if (d3Var != null && (j10 = k4.j(this.f38822a, this.f38823b, d3Var)) != null) {
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
        this.e = AndroidUtilities.dp(11.0f) + 1;
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null) {
            TL_iv.RichText richText = pageblockdetails.title;
            z70 z70Var = this.f38822a;
            z70Var.getClass();
            int dp2 = size - AndroidUtilities.dp(54);
            TL_iv.pageBlockDetails pageblockdetails2 = this.h;
            i4 i4Var = this.f38823b;
            if (i4Var != null && i4Var.G) {
                alignment = org.telegram.ui.Components.ix0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            d3 p5 = k4.p(z70Var, this, null, richText, dp2, 0, pageblockdetails2, alignment, 0, this.f38823b);
            this.f38824c = p5;
            if (p5 != null) {
                dp = Math.max(dp, this.f38824c.d.getHeight() + AndroidUtilities.dp(21.0f));
                int dp3 = ((AndroidUtilities.dp(21.0f) + this.f38824c.d.getHeight()) - this.f38824c.d.getHeight()) / 2;
                this.e = dp3;
                d3 d3Var = this.f38824c;
                d3Var.f35132s = this.d;
                d3Var.v = dp3;
            }
        }
        setMeasuredDimension(size, dp + 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!k4.l(this.f38822a, this.f38823b, motionEvent, this, this.f38824c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
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
        AnimatedArrowDrawable animatedArrowDrawable = this.f38825f;
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
