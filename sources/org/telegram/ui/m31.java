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
public final class m31 extends FrameLayout {
    public final org.telegram.ui.Components.q5 f39906a;
    public final n31 f39907b;

    public m31(n31 n31Var, Context context) {
        super(context);
        this.f39907b = n31Var;
        TextView g10 = org.telegram.messenger.v0.g(context, 1, 16.0f);
        g10.setTextColor(n31Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        g10.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g10, w7.w5.a(-2.0f, 20.0f, 0.0f, 48.0f, 0.0f, -1, 23));
        this.f39906a = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        n31 n31Var = this.f39907b;
        String doubleTapReaction = MediaDataController.getInstance(n31.Y(n31Var)).getDoubleTapReaction();
        org.telegram.ui.Components.q5 q5Var = this.f39906a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                q5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(n31.Z(n31Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            q5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.q5 q5Var = this.f39906a;
        q5Var.setBounds((width - q5Var.f29672s) - AndroidUtilities.dp(21.0f), (getHeight() - q5Var.f29672s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + q5Var.f29672s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f39906a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39906a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39906a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
