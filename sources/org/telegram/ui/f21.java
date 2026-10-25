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
public final class f21 extends FrameLayout {
    public final org.telegram.ui.Components.r5 f39242a;
    public final g21 f39243b;

    public f21(g21 g21Var, Context context) {
        super(context);
        this.f39243b = g21Var;
        TextView g7 = org.telegram.messenger.t.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(g7, org.telegram.ui.ActionBar.y6.G6, g21Var.getResourceProvider());
        g7.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g7, org.telegram.ui.Components.gb1.h(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f39242a = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        g21 g21Var = this.f39243b;
        String doubleTapReaction = MediaDataController.getInstance(g21.Z(g21Var)).getDoubleTapReaction();
        org.telegram.ui.Components.r5 r5Var = this.f39242a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                r5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(g21.a0(g21Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            r5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.r5 r5Var = this.f39242a;
        r5Var.setBounds((width - r5Var.f32097s) - AndroidUtilities.dp(21.0f), (getHeight() - r5Var.f32097s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + r5Var.f32097s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f39242a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39242a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39242a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
