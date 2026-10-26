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
public final class l1 extends View implements Drawable.Callback, org.telegram.ui.Cells.r9 {
    public final h70 f41097a;
    public final h4 f41098b;
    public a3 f41099c;
    public int d;
    public int e;
    public final AnimatedArrowDrawable f41100f;
    public TL_iv.pageBlockDetails h;

    public l1(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.f41097a = h70Var;
        this.f41098b = h4Var;
        this.f41100f = new AnimatedArrowDrawable(h70Var.a(), true);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f41099c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f41099c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f41099c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        canvas.save();
        h70 h70Var = this.f41097a;
        h70Var.getClass();
        canvas.translate(AndroidUtilities.dp(18), ((getMeasuredHeight() - AndroidUtilities.dp(13.0f)) - 1) / 2);
        this.f41100f.draw(canvas);
        canvas.restore();
        if (this.f41099c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            j4.v(h70Var, canvas, this, 0);
            this.f41099c.draw(canvas, this);
            canvas.restore();
        }
        float measuredHeight = getMeasuredHeight() - 1;
        canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, j4.f40420s1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        CharSequence j10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a3 a3Var = this.f41099c;
        if (a3Var != null && (j10 = j4.j(this.f41097a, this.f41098b, a3Var)) != null) {
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
            h70 h70Var = this.f41097a;
            h70Var.getClass();
            int dp2 = size - AndroidUtilities.dp(54);
            TL_iv.pageBlockDetails pageblockdetails2 = this.h;
            h4 h4Var = this.f41098b;
            if (h4Var != null && h4Var.G) {
                alignment = org.telegram.ui.Components.px0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 p10 = j4.p(h70Var, this, null, richText, dp2, 0, pageblockdetails2, alignment, 0, this.f41098b);
            this.f41099c = p10;
            if (p10 != null) {
                dp = Math.max(dp, this.f41099c.d.getHeight() + AndroidUtilities.dp(21.0f));
                int dp3 = ((AndroidUtilities.dp(21.0f) + this.f41099c.d.getHeight()) - this.f41099c.d.getHeight()) / 2;
                this.e = dp3;
                a3 a3Var = this.f41099c;
                a3Var.f37634s = this.d;
                a3Var.v = dp3;
            }
        }
        setMeasuredDimension(size, dp + 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f41097a, this.f41098b, motionEvent, this, this.f41099c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
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
        AnimatedArrowDrawable animatedArrowDrawable = this.f41100f;
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
