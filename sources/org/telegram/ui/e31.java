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
public final class e31 extends FrameLayout {
    public final org.telegram.ui.Components.o5 f35898a;
    public final f31 f35899b;

    public e31(f31 f31Var, Context context) {
        super(context);
        this.f35899b = f31Var;
        TextView f7 = org.telegram.messenger.q.f(context, 1, 16.0f);
        f7.setTextColor(f31Var.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
        f7.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(f7, w7.z5.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f35898a = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        f31 f31Var = this.f35899b;
        String doubleTapReaction = MediaDataController.getInstance(f31.X(f31Var)).getDoubleTapReaction();
        org.telegram.ui.Components.o5 o5Var = this.f35898a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                o5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(f31.Y(f31Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            o5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.o5 o5Var = this.f35898a;
        o5Var.setBounds((width - o5Var.f29234s) - AndroidUtilities.dp(21.0f), (getHeight() - o5Var.f29234s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + o5Var.f29234s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f35898a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35898a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35898a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
