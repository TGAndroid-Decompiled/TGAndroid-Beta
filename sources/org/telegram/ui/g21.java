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
public final class g21 extends FrameLayout {
    public final org.telegram.ui.Components.i5 f38414a;
    public final h21 f38415b;

    public g21(h21 h21Var, Context context) {
        super(context);
        this.f38415b = h21Var;
        TextView g10 = org.telegram.messenger.l0.g(context, 1, 16.0f);
        g10.setTextColor(h21Var.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
        g10.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g10, g7.e6.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f38414a = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        h21 h21Var = this.f38415b;
        String doubleTapReaction = MediaDataController.getInstance(h21.X(h21Var)).getDoubleTapReaction();
        org.telegram.ui.Components.i5 i5Var = this.f38414a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                i5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(h21.Y(h21Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            i5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.i5 i5Var = this.f38414a;
        i5Var.setBounds((width - i5Var.f29322s) - AndroidUtilities.dp(21.0f), (getHeight() - i5Var.f29322s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + i5Var.f29322s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f38414a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38414a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38414a.b();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
