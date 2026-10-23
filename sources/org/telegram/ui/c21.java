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
public final class c21 extends FrameLayout {
    public final org.telegram.ui.Components.p5 f36225a;
    public final d21 f36226b;

    public c21(d21 d21Var, Context context) {
        super(context);
        this.f36226b = d21Var;
        TextView g10 = org.telegram.messenger.v0.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(g10, org.telegram.ui.ActionBar.k6.G6, d21Var.getResourceProvider());
        g10.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g10, w7.z5.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f36225a = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        d21 d21Var = this.f36226b;
        String doubleTapReaction = MediaDataController.getInstance(d21.Y(d21Var)).getDoubleTapReaction();
        org.telegram.ui.Components.p5 p5Var = this.f36225a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                p5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(d21.Z(d21Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            p5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.p5 p5Var = this.f36225a;
        p5Var.setBounds((width - p5Var.f29419s) - AndroidUtilities.dp(21.0f), (getHeight() - p5Var.f29419s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + p5Var.f29419s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f36225a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36225a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36225a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
