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

    public final org.telegram.ui.Components.i5 f37914a;

    public final g21 f37915b;

    public f21(g21 g21Var, Context context) {
        super(context);
        this.f37915b = g21Var;
        TextView textViewH = org.telegram.messenger.y1.h(context, 1, 16.0f);
        textViewH.setTextColor(g21Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        textViewH.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(textViewH, h7.z5.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f37914a = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        g21 g21Var = this.f37915b;
        String doubleTapReaction = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) g21Var).currentAccount).getDoubleTapReaction();
        org.telegram.ui.Components.i5 i5Var = this.f37914a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                i5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) g21Var).currentAccount).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            i5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.i5 i5Var = this.f37914a;
        i5Var.setBounds((width - i5Var.f29232s) - AndroidUtilities.dp(21.0f), (getHeight() - i5Var.f29232s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + i5Var.f29232s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f37914a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37914a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37914a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
