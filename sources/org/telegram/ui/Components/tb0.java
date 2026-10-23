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
public final class tb0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f30675a;
    public final p6 f30676b;
    public final p6 f30677c;

    public tb0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f30675a = g6Var;
        p6 p6Var = new p6(true, true, true);
        this.f30676b = p6Var;
        bs bsVar = bs.h;
        p6Var.n(0.3f, 430L, bsVar);
        p6Var.x(AndroidUtilities.bold());
        p6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var));
        p6Var.w(AndroidUtilities.dp(18.0f));
        p6Var.q(!LocaleController.isRTL);
        p6Var.setCallback(this);
        p6Var.M = AndroidUtilities.displaySize.x;
        p6 p6Var2 = new p6(true, true, true);
        this.f30677c = p6Var2;
        p6Var2.n(0.3f, 430L, bsVar);
        p6Var2.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, g6Var));
        p6Var2.w(AndroidUtilities.dp(14.0f));
        p6Var2.q(!LocaleController.isRTL);
        p6Var2.setCallback(this);
        p6Var2.M = AndroidUtilities.displaySize.x;
    }

    public final void a(CharSequence charSequence, boolean z10) {
        boolean z11;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30677c.t(charSequence, z11, true);
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
        this.f30676b.t(charSequence, z11, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(29.0f);
        int dp2 = AndroidUtilities.dp(18.83f);
        p6 p6Var = this.f30677c;
        int paddingLeft = getPaddingLeft();
        int dp3 = r0 - AndroidUtilities.dp(32.0f);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int dp4 = AndroidUtilities.dp(32.0f) + r0;
        p6 p6Var2 = this.f30676b;
        p6Var2.setBounds(paddingLeft, dp3, measuredWidth, dp4);
        p6Var2.draw(canvas);
        p6Var.setBounds(getPaddingLeft(), r0 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r0);
        p6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
    }

    @Override
    public final void updateColors() {
        try {
            p6 p6Var = this.f30676b;
            org.telegram.ui.ActionBar.g6 g6Var = this.f30675a;
            if (p6Var != null) {
                p6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var));
            }
            p6 p6Var2 = this.f30677c;
            if (p6Var2 != null) {
                p6Var2.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, g6Var));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f30676b != drawable && this.f30677c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
