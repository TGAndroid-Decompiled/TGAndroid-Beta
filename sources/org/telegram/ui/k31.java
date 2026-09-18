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
public final class k31 extends FrameLayout {
    public final org.telegram.ui.Components.o5 f34979a;
    public final l31 f34980b;

    public k31(l31 l31Var, Context context) {
        super(context);
        this.f34980b = l31Var;
        TextView g10 = org.telegram.messenger.q.g(context, 1, 16.0f);
        g10.setTextColor(l31Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        g10.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g10, w7.y5.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f34979a = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        l31 l31Var = this.f34980b;
        String doubleTapReaction = MediaDataController.getInstance(l31.Y(l31Var)).getDoubleTapReaction();
        org.telegram.ui.Components.o5 o5Var = this.f34979a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                o5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(l31.Z(l31Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            o5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.o5 o5Var = this.f34979a;
        o5Var.setBounds((width - o5Var.f26858s) - AndroidUtilities.dp(21.0f), (getHeight() - o5Var.f26858s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + o5Var.f26858s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f34979a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34979a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34979a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
