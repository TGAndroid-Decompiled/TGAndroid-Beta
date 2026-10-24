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
public final class rb0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f30107a;
    public final n6 f30108b;
    public final n6 f30109c;

    public rb0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f30107a = g6Var;
        n6 n6Var = new n6(true, true, true);
        this.f30108b = n6Var;
        zr zrVar = zr.h;
        n6Var.n(0.3f, 430L, zrVar);
        n6Var.x(AndroidUtilities.bold());
        n6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var));
        n6Var.w(AndroidUtilities.dp(18.0f));
        n6Var.q(!LocaleController.isRTL);
        n6Var.setCallback(this);
        n6Var.M = AndroidUtilities.displaySize.x;
        n6 n6Var2 = new n6(true, true, true);
        this.f30109c = n6Var2;
        n6Var2.n(0.3f, 430L, zrVar);
        n6Var2.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, g6Var));
        n6Var2.w(AndroidUtilities.dp(14.0f));
        n6Var2.q(!LocaleController.isRTL);
        n6Var2.setCallback(this);
        n6Var2.M = AndroidUtilities.displaySize.x;
    }

    public final void a(CharSequence charSequence, boolean z10) {
        boolean z11;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30109c.t(charSequence, z11, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
    }

    public final void b(CharSequence charSequence, boolean z10) {
        boolean z11;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30108b.t(charSequence, z11, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(29.0f);
        int dp2 = AndroidUtilities.dp(18.83f);
        n6 n6Var = this.f30109c;
        int paddingLeft = getPaddingLeft();
        int dp3 = r0 - AndroidUtilities.dp(32.0f);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int dp4 = AndroidUtilities.dp(32.0f) + r0;
        n6 n6Var2 = this.f30108b;
        n6Var2.setBounds(paddingLeft, dp3, measuredWidth, dp4);
        n6Var2.draw(canvas);
        n6Var.setBounds(getPaddingLeft(), r0 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r0);
        n6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
    }

    @Override
    public final void updateColors() {
        try {
            n6 n6Var = this.f30108b;
            org.telegram.ui.ActionBar.g6 g6Var = this.f30107a;
            if (n6Var != null) {
                n6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var));
            }
            n6 n6Var2 = this.f30109c;
            if (n6Var2 != null) {
                n6Var2.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, g6Var));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f30108b != drawable && this.f30109c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
