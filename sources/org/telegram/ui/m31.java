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
    public final org.telegram.ui.Components.o5 f38562a;
    public final n31 f38563b;

    public m31(n31 n31Var, Context context) {
        super(context);
        this.f38563b = n31Var;
        TextView g10 = org.telegram.messenger.w1.g(context, 1, 16.0f);
        g10.setTextColor(n31Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        g10.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g10, w7.x5.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f38562a = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        n31 n31Var = this.f38563b;
        String doubleTapReaction = MediaDataController.getInstance(n31.Y(n31Var)).getDoubleTapReaction();
        org.telegram.ui.Components.o5 o5Var = this.f38562a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                o5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(n31.Z(n31Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            o5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.o5 o5Var = this.f38562a;
        o5Var.setBounds((width - o5Var.f28964s) - AndroidUtilities.dp(21.0f), (getHeight() - o5Var.f28964s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + o5Var.f28964s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f38562a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38562a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38562a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
