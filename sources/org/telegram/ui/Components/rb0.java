package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
public final class rb0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f32212a;
    public final r6 f32213b;
    public final r6 f32214c;

    public rb0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f32212a = u6Var;
        r6 r6Var = new r6(true, true, true);
        this.f32213b = r6Var;
        ds dsVar = ds.h;
        r6Var.n(0.3f, 430L, dsVar);
        r6Var.x(AndroidUtilities.bold());
        r6Var.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var));
        r6Var.w(AndroidUtilities.dp(18.0f));
        r6Var.q(!LocaleController.isRTL);
        r6Var.setCallback(this);
        r6Var.M = AndroidUtilities.displaySize.x;
        r6 r6Var2 = new r6(true, true, true);
        this.f32214c = r6Var2;
        r6Var2.n(0.3f, 430L, dsVar);
        r6Var2.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, u6Var));
        r6Var2.w(AndroidUtilities.dp(14.0f));
        r6Var2.q(!LocaleController.isRTL);
        r6Var2.setCallback(this);
        r6Var2.M = AndroidUtilities.displaySize.x;
    }

    public final void a(CharSequence charSequence, boolean z10) {
        boolean z11;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32214c.t(charSequence, z11, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B8));
    }

    public final void b(CharSequence charSequence, boolean z10) {
        boolean z11;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32213b.t(charSequence, z11, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(29.0f);
        int dp2 = AndroidUtilities.dp(18.83f);
        r6 r6Var = this.f32214c;
        int paddingLeft = getPaddingLeft();
        int dp3 = r0 - AndroidUtilities.dp(32.0f);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int dp4 = AndroidUtilities.dp(32.0f) + r0;
        r6 r6Var2 = this.f32213b;
        r6Var2.setBounds(paddingLeft, dp3, measuredWidth, dp4);
        r6Var2.draw(canvas);
        r6Var.setBounds(getPaddingLeft(), r0 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r0);
        r6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
    }

    @Override
    public final void updateColors() {
        try {
            r6 r6Var = this.f32213b;
            org.telegram.ui.ActionBar.u6 u6Var = this.f32212a;
            if (r6Var != null) {
                r6Var.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, u6Var));
            }
            r6 r6Var2 = this.f32214c;
            if (r6Var2 != null) {
                r6Var2.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, u6Var));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f32213b != drawable && this.f32214c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
