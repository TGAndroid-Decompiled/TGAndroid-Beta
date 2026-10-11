package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class em0 extends s4.o0 implements bh.a {
    public final Utilities.CallbackReturn f26078a;
    public final sm0 f26079b;
    public final int f26080c;
    public final boolean d;

    public em0(sm0 sm0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z10) {
        this.f26079b = sm0Var;
        this.f26078a = callbackReturn;
        this.f26080c = i10;
        this.d = z10;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        int b10;
        boolean z10;
        int dp;
        if (((Boolean) this.f26078a.run(view)).booleanValue()) {
            int i10 = this.f26080c;
            rect.right = i10;
            rect.left = i10;
            s4.d1 T = recyclerView.T(view);
            s4.i0 adapter = recyclerView.getAdapter();
            if (T != null && adapter != null && (b10 = T.b()) != -1) {
                boolean z11 = false;
                if (b10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b10 == adapter.h() - 1) {
                    z11 = true;
                }
                if (z10) {
                    if (this.d) {
                        dp = i10;
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    rect.top = dp;
                }
                if (z11) {
                    rect.bottom = i10;
                }
            }
        }
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f536a = true;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof sm0) {
            ((sm0) recyclerView).Q0(canvas);
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f26079b.Q0(canvas);
        canvas.restore();
    }
}
