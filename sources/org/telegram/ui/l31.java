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
public final class l31 extends FrameLayout {
    public final org.telegram.ui.Components.m5 f35316a;
    public final m31 f35317b;

    public l31(m31 m31Var, Context context) {
        super(context);
        this.f35317b = m31Var;
        TextView g10 = org.telegram.messenger.y0.g(context, 1, 16.0f);
        g10.setTextColor(m31Var.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
        g10.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g10, w7.x5.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f35316a = new org.telegram.ui.Components.m5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        m31 m31Var = this.f35317b;
        String doubleTapReaction = MediaDataController.getInstance(m31.Y(m31Var)).getDoubleTapReaction();
        org.telegram.ui.Components.m5 m5Var = this.f35316a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                m5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(m31.Z(m31Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            m5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.m5 m5Var = this.f35316a;
        m5Var.setBounds((width - m5Var.f26075s) - AndroidUtilities.dp(21.0f), (getHeight() - m5Var.f26075s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + m5Var.f26075s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f35316a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35316a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35316a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
