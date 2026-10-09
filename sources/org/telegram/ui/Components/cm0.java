package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class cm0 extends s4.o0 implements bh.a {
    public final Utilities.CallbackReturn f25437a;
    public final qm0 f25438b;
    public final int f25439c;
    public final boolean d;

    public cm0(qm0 qm0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z10) {
        this.f25438b = qm0Var;
        this.f25437a = callbackReturn;
        this.f25439c = i10;
        this.d = z10;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        int b10;
        boolean z10;
        int dp;
        if (((Boolean) this.f25437a.run(view)).booleanValue()) {
            int i10 = this.f25439c;
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
        if (recyclerView instanceof qm0) {
            ((qm0) recyclerView).Q0(canvas);
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f25438b.Q0(canvas);
        canvas.restore();
    }
}
