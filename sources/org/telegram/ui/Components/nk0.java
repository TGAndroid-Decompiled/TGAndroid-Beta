package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class nk0 extends f2.w0 implements kg.a {

    public final Utilities.CallbackReturn f30985a;

    public final zk0 f30986b;

    public final int f30987c;
    public final boolean d;

    public nk0(zk0 zk0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z10) {
        this.f30986b = zk0Var;
        this.f30985a = callbackReturn;
        this.f30987c = i10;
        this.d = z10;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        int iB;
        if (((Boolean) this.f30985a.run(view)).booleanValue()) {
            int i10 = this.f30987c;
            rect.right = i10;
            rect.left = i10;
            f2.o1 o1VarT = recyclerView.T(view);
            f2.q0 adapter = recyclerView.getAdapter();
            if (o1VarT == null || adapter == null || (iB = o1VarT.b()) == -1) {
                return;
            }
            boolean z10 = iB == 0;
            boolean z11 = iB == adapter.h() - 1;
            if (z10) {
                rect.top = this.d ? i10 : AndroidUtilities.dp(4.0f);
            }
            if (z11) {
                rect.bottom = i10;
            }
        }
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof zk0) {
            ((zk0) recyclerView).Q0(canvas);
        }
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f30986b.Q0(canvas);
        canvas.restore();
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        yVar.f6327b = true;
    }
}
