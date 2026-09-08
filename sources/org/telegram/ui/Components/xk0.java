package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class xk0 extends s4.n0 implements ch.a {
    public final Utilities.CallbackReturn f32628a;
    public final ll0 f32629b;
    public final int f32630c;
    public final boolean d;

    public xk0(ll0 ll0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z10) {
        this.f32629b = ll0Var;
        this.f32628a = callbackReturn;
        this.f32630c = i10;
        this.d = z10;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int b10;
        boolean z10;
        int dp;
        if (((Boolean) this.f32628a.run(view)).booleanValue()) {
            int i10 = this.f32630c;
            rect.right = i10;
            rect.left = i10;
            s4.c1 T = recyclerView.T(view);
            s4.h0 adapter = recyclerView.getAdapter();
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
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof ll0) {
            ((ll0) recyclerView).P0(canvas);
        }
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        aVar.f2675a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f32629b.P0(canvas);
        canvas.restore();
    }
}
