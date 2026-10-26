package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class si extends View {
    public final int f32568a = 0;
    public final int f32569b;
    public final Object f32570c;
    public final Object d;
    public final Object e;

    public si(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.f32570c = new ArrayList();
        this.e = new org.telegram.ui.p00(this, 29);
        this.d = viewGroup;
        this.f32569b = i10;
    }

    public void a() {
        org.telegram.ui.p00 p00Var = (org.telegram.ui.p00) this.e;
        ArrayList arrayList = (ArrayList) this.f32570c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.f32569b;
        if (isEmpty && getVisibility() != 8) {
            NotificationCenter.getInstance(i10).removeDelayed(p00Var);
            NotificationCenter.getInstance(i10).doOnIdle(p00Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            NotificationCenter.getInstance(i10).removeDelayed(p00Var);
            setVisibility(0);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f32568a) {
            case 0:
                ag.h0 h0Var = (ag.h0) this.d;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.f32570c;
                int i10 = this.f32569b;
                h0Var.b(org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
                h0Var.draw(canvas);
                ag.h0 h0Var2 = (ag.h0) this.e;
                h0Var2.b(org.telegram.ui.ActionBar.y6.o1(0.95f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
                h0Var2.draw(canvas);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f32570c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((org.telegram.ui.nh0) arrayList.get(i11)).a(canvas);
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f32568a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                int i14 = AndroidUtilities.statusBarHeight;
                ag.h0 h0Var = (ag.h0) this.d;
                h0Var.c(AndroidUtilities.dp(12.0f) + i14, 0);
                h0Var.setBounds(0, 0, i10, AndroidUtilities.dp(52.0f) + i14);
                ag.h0 h0Var2 = (ag.h0) this.e;
                h0Var2.c(i14 / 3, 0);
                h0Var2.setBounds(0, 0, i10, i14);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    public si(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = new ag.h0(2);
        this.e = new ag.h0(2);
        this.f32570c = u6Var;
        this.f32569b = i10;
    }
}
