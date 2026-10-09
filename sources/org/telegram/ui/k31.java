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
    public final org.telegram.ui.Components.q5 f39071a;
    public final l31 f39072b;

    public k31(l31 l31Var, Context context) {
        super(context);
        this.f39072b = l31Var;
        TextView f7 = org.telegram.messenger.q.f(context, 1, 16.0f);
        f7.setTextColor(l31Var.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
        f7.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(f7, w7.x5.a(-2.0f, 20.0f, 0.0f, 48.0f, 0.0f, -1, 23));
        this.f39071a = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        l31 l31Var = this.f39072b;
        String doubleTapReaction = MediaDataController.getInstance(l31.Y(l31Var)).getDoubleTapReaction();
        org.telegram.ui.Components.q5 q5Var = this.f39071a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                q5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(l31.Z(l31Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            q5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.q5 q5Var = this.f39071a;
        q5Var.setBounds((width - q5Var.f30049s) - AndroidUtilities.dp(21.0f), (getHeight() - q5Var.f30049s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + q5Var.f30049s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f39071a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39071a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39071a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
