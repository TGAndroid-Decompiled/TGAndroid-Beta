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
public final class b21 extends FrameLayout {
    public final org.telegram.ui.Components.n5 f35902a;
    public final c21 f35903b;

    public b21(c21 c21Var, Context context) {
        super(context);
        this.f35903b = c21Var;
        TextView g10 = org.telegram.messenger.v0.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(g10, org.telegram.ui.ActionBar.k6.G6, c21Var.getResourceProvider());
        g10.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g10, w7.z5.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f35902a = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        c21 c21Var = this.f35903b;
        String doubleTapReaction = MediaDataController.getInstance(c21.Y(c21Var)).getDoubleTapReaction();
        org.telegram.ui.Components.n5 n5Var = this.f35902a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                n5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(c21.Z(c21Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            n5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.n5 n5Var = this.f35902a;
        n5Var.setBounds((width - n5Var.f28785s) - AndroidUtilities.dp(21.0f), (getHeight() - n5Var.f28785s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + n5Var.f28785s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f35902a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35902a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35902a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
