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
public final class m1 extends View implements Drawable.Callback, org.telegram.ui.Cells.p9 {
    public final v70 f38536a;
    public final g4 f38537b;
    public b3 f38538c;
    public int d;
    public int f38539e;
    public final AnimatedArrowDrawable f38540f;
    public TL_iv.pageBlockDetails h;

    public m1(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f38536a = v70Var;
        this.f38537b = g4Var;
        this.f38540f = new AnimatedArrowDrawable(v70Var.a(), true);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f38538c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f38538c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f38538c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        canvas.save();
        v70 v70Var = this.f38536a;
        v70Var.getClass();
        canvas.translate(AndroidUtilities.dp(18), ((getMeasuredHeight() - AndroidUtilities.dp(13.0f)) - 1) / 2);
        this.f38540f.draw(canvas);
        canvas.restore();
        if (this.f38538c != null) {
            canvas.save();
            canvas.translate(this.d, this.f38539e);
            i4.v(v70Var, canvas, this, 0);
            this.f38538c.draw(canvas, this);
            canvas.restore();
        }
        float measuredHeight = getMeasuredHeight() - 1;
        canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, i4.f37204r1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        CharSequence j3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        b3 b3Var = this.f38538c;
        if (b3Var != null && (j3 = i4.j(this.f38536a, this.f38537b, b3Var)) != null) {
            spannableStringBuilder.append(j3).append((CharSequence) ", ");
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
        this.f38539e = AndroidUtilities.dp(11.0f) + 1;
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null) {
            TL_iv.RichText richText = pageblockdetails.title;
            v70 v70Var = this.f38536a;
            v70Var.getClass();
            int dp2 = size - AndroidUtilities.dp(54);
            TL_iv.pageBlockDetails pageblockdetails2 = this.h;
            g4 g4Var = this.f38537b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.iw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(v70Var, this, null, richText, dp2, 0, pageblockdetails2, alignment, 0, this.f38537b);
            this.f38538c = p5;
            if (p5 != null) {
                dp = Math.max(dp, this.f38538c.d.getHeight() + AndroidUtilities.dp(21.0f));
                int dp3 = ((AndroidUtilities.dp(21.0f) + this.f38538c.d.getHeight()) - this.f38538c.d.getHeight()) / 2;
                this.f38539e = dp3;
                b3 b3Var = this.f38538c;
                b3Var.f34618s = this.d;
                b3Var.v = dp3;
            }
        }
        setMeasuredDimension(size, dp + 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f38536a, this.f38537b, motionEvent, this, this.f38538c, this.d, this.f38539e) && !super.onTouchEvent(motionEvent)) {
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
        AnimatedArrowDrawable animatedArrowDrawable = this.f38540f;
        animatedArrowDrawable.setAnimationProgress(f7);
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
