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
public final class a31 extends FrameLayout {
    public final org.telegram.ui.Components.j5 f32438a;
    public final b31 f32439b;

    public a31(b31 b31Var, Context context) {
        super(context);
        this.f32439b = b31Var;
        TextView g10 = org.telegram.messenger.y3.g(context, 1, 16.0f);
        g10.setTextColor(b31Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        g10.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g10, k7.b6.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f32438a = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z4) {
        b31 b31Var = this.f32439b;
        String doubleTapReaction = MediaDataController.getInstance(b31.Y(b31Var)).getDoubleTapReaction();
        org.telegram.ui.Components.j5 j5Var = this.f32438a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                j5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z4);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(b31.Z(b31Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            j5Var.i(tL_availableReaction.static_icon, z4);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.j5 j5Var = this.f32438a;
        j5Var.setBounds((width - j5Var.f25839s) - AndroidUtilities.dp(21.0f), (getHeight() - j5Var.f25839s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + j5Var.f25839s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f32438a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32438a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32438a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
