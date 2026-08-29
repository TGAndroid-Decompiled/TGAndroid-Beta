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
public final class h21 extends FrameLayout {
    public final org.telegram.ui.Components.n5 f38746a;
    public final i21 f38747b;

    public h21(i21 i21Var, Context context) {
        super(context);
        this.f38747b = i21Var;
        TextView h = org.telegram.messenger.x3.h(context, 1, 16.0f);
        h.setTextColor(i21Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        h.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(h, i7.f6.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f38746a = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        i21 i21Var = this.f38747b;
        String doubleTapReaction = MediaDataController.getInstance(i21.Y(i21Var)).getDoubleTapReaction();
        org.telegram.ui.Components.n5 n5Var = this.f38746a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                n5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i21.Z(i21Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            n5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.n5 n5Var = this.f38746a;
        n5Var.setBounds((width - n5Var.f30852s) - AndroidUtilities.dp(21.0f), (getHeight() - n5Var.f30852s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + n5Var.f30852s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f38746a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38746a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38746a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
