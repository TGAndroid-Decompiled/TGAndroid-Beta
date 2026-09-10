package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class q31 extends FrameLayout {
    public final org.telegram.ui.Components.n5 f35960a;
    public final r31 f35961b;

    public q31(r31 r31Var, Context context) {
        super(context);
        this.f35961b = r31Var;
        TextView g10 = org.telegram.messenger.a2.g(context, 1, 16.0f);
        g10.setTextColor(r31Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        g10.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g10, w7.a6.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f35960a = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        r31 r31Var = this.f35961b;
        String doubleTapReaction = MediaDataController.getInstance(r31.Y(r31Var)).getDoubleTapReaction();
        org.telegram.ui.Components.n5 n5Var = this.f35960a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                n5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(r31.Z(r31Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            n5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.n5 n5Var = this.f35960a;
        n5Var.setBounds((width - n5Var.f25415s) - AndroidUtilities.dp(21.0f), (getHeight() - n5Var.f25415s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + n5Var.f25415s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f35960a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35960a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35960a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
