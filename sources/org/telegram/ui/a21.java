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
public final class a21 extends FrameLayout {
    public final org.telegram.ui.Components.p5 f35250a;
    public final b21 f35251b;

    public a21(b21 b21Var, Context context) {
        super(context);
        this.f35251b = b21Var;
        TextView f7 = org.telegram.messenger.g0.f(context, 1, 16.0f);
        f7.setTextColor(b21Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        f7.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(f7, w7.z5.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f35250a = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        b21 b21Var = this.f35251b;
        String doubleTapReaction = MediaDataController.getInstance(b21.Y(b21Var)).getDoubleTapReaction();
        org.telegram.ui.Components.p5 p5Var = this.f35250a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                p5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(b21.Z(b21Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            p5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.p5 p5Var = this.f35250a;
        p5Var.setBounds((width - p5Var.f29181s) - AndroidUtilities.dp(21.0f), (getHeight() - p5Var.f29181s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + p5Var.f29181s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f35250a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35250a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35250a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
