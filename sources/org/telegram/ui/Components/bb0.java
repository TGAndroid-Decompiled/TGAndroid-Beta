package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class bb0 extends View {
    public final i6 f27137a;
    public final xa0 f27138b;
    public boolean f27139c;
    public boolean d;
    public final String f27140e;
    public final String f27141f;
    public final int h;

    public bb0(Context context, int i9, String str, int i10, String str2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f27139c = true;
        this.f27140e = str;
        this.f27141f = str2;
        setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 2, -1));
        i6 i6Var = new i6(true, true, true, false);
        this.f27137a = i6Var;
        i6Var.k(0.35f, 300L, gr.h);
        i6Var.t(AndroidUtilities.dp(16.0f));
        i6Var.r(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var));
        i6Var.setCallback(this);
        i6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            i6Var.f29333b = 5;
        }
        TextPaint textPaint = i6Var.f29332a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        i6Var.G = max;
        xa0 xa0Var = new xa0(0);
        mi0 mi0Var = new mi0(i9, AndroidUtilities.dp(24.0f), j3.r0.l(i9, ""), AndroidUtilities.dp(24.0f));
        xa0Var.f34631c = mi0Var;
        mi0Var.f30863r0 = this;
        mi0Var.H(true);
        mi0Var.h = true;
        mi0Var.I(0);
        mi0 mi0Var2 = new mi0(i10, AndroidUtilities.dp(24.0f), j3.r0.l(i10, ""), AndroidUtilities.dp(24.0f));
        xa0Var.d = mi0Var2;
        mi0Var2.f30863r0 = this;
        mi0Var2.H(true);
        mi0Var2.h = true;
        mi0Var2.I(0);
        xa0Var.f34632e = mi0Var;
        this.f27138b = xa0Var;
        xa0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, b6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        mi0 mi0Var;
        if (!this.f27139c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.f27140e;
        } else {
            str = this.f27141f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        i6 i6Var = this.f27137a;
        i6Var.q(str, z12, true);
        xa0 xa0Var = this.f27138b;
        mi0 mi0Var2 = (mi0) xa0Var.d;
        mi0 mi0Var3 = (mi0) xa0Var.f34631c;
        xa0Var.f34630b = z10;
        if (z11) {
            if (z10) {
                mi0Var = mi0Var3;
            } else {
                mi0Var = mi0Var2;
            }
            xa0Var.f34632e = mi0Var;
            mi0Var3.K(0);
            mi0Var2.K(0);
            ((mi0) xa0Var.f34632e).start();
        } else {
            if (z10) {
                mi0Var2 = mi0Var3;
            }
            xa0Var.f34632e = mi0Var2;
            mi0Var2.K(mi0Var2.f30847e[0] - 1);
        }
        this.f27139c = false;
        setContentDescription(i6Var.f29337g);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        i6 i6Var = this.f27137a;
        xa0 xa0Var = this.f27138b;
        if (z10) {
            xa0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.ll.y(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            i6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            xa0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.ll.y(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            i6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        i6Var.draw(canvas);
        xa0Var.draw(canvas);
    }

    public boolean getState() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int min;
        int mode = View.MeasureSpec.getMode(i9);
        int i11 = this.h;
        if (mode == 1073741824) {
            min = Math.max(View.MeasureSpec.getSize(i9), i11);
        } else {
            min = Math.min(View.MeasureSpec.getSize(i9), i11);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, mode), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getVisibility() == 0 && getAlpha() >= 0.5f) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f27137a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
