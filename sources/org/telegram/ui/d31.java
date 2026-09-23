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
public final class d31 extends FrameLayout {
    public final org.telegram.ui.Components.o5 f32501a;
    public final e31 f32502b;

    public d31(e31 e31Var, Context context) {
        super(context);
        this.f32502b = e31Var;
        TextView g10 = org.telegram.messenger.z0.g(context, 1, 16.0f);
        g10.setTextColor(e31Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        g10.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g10, w7.x5.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f32501a = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        e31 e31Var = this.f32502b;
        String doubleTapReaction = MediaDataController.getInstance(e31.Y(e31Var)).getDoubleTapReaction();
        org.telegram.ui.Components.o5 o5Var = this.f32501a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                o5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(e31.Z(e31Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            o5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.o5 o5Var = this.f32501a;
        o5Var.setBounds((width - o5Var.f26598s) - AndroidUtilities.dp(21.0f), (getHeight() - o5Var.f26598s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + o5Var.f26598s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f32501a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32501a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32501a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
