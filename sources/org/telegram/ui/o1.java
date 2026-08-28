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
public final class o1 extends View implements Drawable.Callback, org.telegram.ui.Cells.m9 {
    public final a70 f40862a;
    public final j4 f40863b;
    public e3 f40864c;
    public int d;
    public int f40865e;
    public final AnimatedArrowDrawable f40866f;
    public TL_iv.pageBlockDetails h;

    public o1(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f40862a = a70Var;
        this.f40863b = j4Var;
        this.f40866f = new AnimatedArrowDrawable(a70Var.a(), true);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f40864c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f40864c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f40864c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        canvas.save();
        a70 a70Var = this.f40862a;
        a70Var.getClass();
        canvas.translate(AndroidUtilities.dp(18), ((getMeasuredHeight() - AndroidUtilities.dp(13.0f)) - 1) / 2);
        this.f40866f.draw(canvas);
        canvas.restore();
        if (this.f40864c != null) {
            canvas.save();
            canvas.translate(this.d, this.f40865e);
            l4.v(a70Var, canvas, this, 0);
            this.f40864c.draw(canvas, this);
            canvas.restore();
        }
        float measuredHeight = getMeasuredHeight() - 1;
        canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, l4.f40000n1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i9;
        CharSequence j10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e3 e3Var = this.f40864c;
        if (e3Var != null && (j10 = l4.j(this.f40862a, this.f40863b, e3Var)) != null) {
            spannableStringBuilder.append(j10).append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AccDescrIVDetails)).append((CharSequence) ", ");
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null && pageblockdetails.open) {
            i9 = R.string.AccDescrIVExpanded;
        } else {
            i9 = R.string.AccDescrIVCollapsed;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i9));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i9);
        int dp = AndroidUtilities.dp(39.0f);
        this.d = AndroidUtilities.dp(50.0f);
        this.f40865e = AndroidUtilities.dp(11.0f) + 1;
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null) {
            TL_iv.RichText richText = pageblockdetails.title;
            a70 a70Var = this.f40862a;
            a70Var.getClass();
            int dp2 = size - AndroidUtilities.dp(54);
            TL_iv.pageBlockDetails pageblockdetails2 = this.h;
            j4 j4Var = this.f40863b;
            if (j4Var != null && j4Var.C) {
                alignment = org.telegram.ui.Components.rv0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            e3 p6 = l4.p(a70Var, this, null, richText, dp2, 0, pageblockdetails2, alignment, 0, this.f40863b);
            this.f40864c = p6;
            if (p6 != null) {
                dp = Math.max(dp, this.f40864c.d.getHeight() + AndroidUtilities.dp(21.0f));
                int dp3 = ((AndroidUtilities.dp(21.0f) + this.f40864c.d.getHeight()) - this.f40864c.d.getHeight()) / 2;
                this.f40865e = dp3;
                e3 e3Var = this.f40864c;
                e3Var.f37805s = this.d;
                e3Var.v = dp3;
            }
        }
        setMeasuredDimension(size, dp + 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f40862a, this.f40863b, motionEvent, this, this.f40864c, this.d, this.f40865e) && !super.onTouchEvent(motionEvent)) {
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
        AnimatedArrowDrawable animatedArrowDrawable = this.f40866f;
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
