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
    public final org.telegram.ui.Components.n5 f35314a;
    public final m31 f35315b;

    public l31(m31 m31Var, Context context) {
        super(context);
        this.f35315b = m31Var;
        TextView f7 = org.telegram.messenger.l0.f(context, 1, 16.0f);
        f7.setTextColor(m31Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        f7.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(f7, w7.y5.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f35314a = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        m31 m31Var = this.f35315b;
        String doubleTapReaction = MediaDataController.getInstance(m31.Y(m31Var)).getDoubleTapReaction();
        org.telegram.ui.Components.n5 n5Var = this.f35314a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                n5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(m31.Z(m31Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            n5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.n5 n5Var = this.f35314a;
        n5Var.setBounds((width - n5Var.f26637s) - AndroidUtilities.dp(21.0f), (getHeight() - n5Var.f26637s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + n5Var.f26637s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f35314a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35314a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35314a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
