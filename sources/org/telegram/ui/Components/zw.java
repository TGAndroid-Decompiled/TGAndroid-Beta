package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class zw extends s4.m0 {
    public final wz f31997a;

    public zw(wz wzVar) {
        this.f31997a = wzVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        wz wzVar = this.f31997a;
        s4.g0 adapter = wzVar.f31029h0.getAdapter();
        az azVar = wzVar.f31046n0;
        int i10 = 0;
        if (adapter == azVar && R == azVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            azVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        bz bzVar = wzVar.f31032i0;
        azVar.getClass();
        if (!bzVar.E1(R)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
