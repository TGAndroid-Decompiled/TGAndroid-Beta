package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class cw extends FrameLayout {

    public final boolean f27557a;

    public final yy f27558b;

    public cw(yy yyVar, Context context, boolean z10) {
        super(context);
        this.f27558b = yyVar;
        this.f27557a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        yy yyVar = this.f27558b;
        iw iwVar = yyVar.f35052x0;
        ew ewVar = yyVar.f35059z0;
        hw hwVar = yyVar.C0;
        if (this.f27557a || !(view == ewVar || view == hwVar)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y10 = iwVar.getY() + iwVar.getMeasuredHeight() + 1.0f;
        if (view == ewVar) {
            y10 = Math.max(y10, hwVar.getY() + hwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * yyVar.f34976a.f48497e), getMeasuredWidth(), getMeasuredHeight());
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yy yyVar = this.f27558b;
        yyVar.G0 = true;
        yyVar.a0();
        ow owVar = yyVar.P0;
        if (owVar != null) {
            owVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yy yyVar = this.f27558b;
        yyVar.G0 = false;
        yyVar.a0();
        ow owVar = yyVar.P0;
        if (owVar != null) {
            owVar.a();
        }
    }
}
