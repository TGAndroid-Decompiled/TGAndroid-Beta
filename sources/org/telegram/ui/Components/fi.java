package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class fi extends View {

    public final int f28389a = 0;

    public final int f28390b;

    public final Object f28391c;
    public final Object d;

    public final Object f28392e;

    public fi(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.f28391c = new ArrayList();
        this.f28392e = new org.telegram.ui.r00(this, 27);
        this.d = viewGroup;
        this.f28390b = i10;
    }

    public void a() {
        org.telegram.ui.r00 r00Var = (org.telegram.ui.r00) this.f28392e;
        ArrayList arrayList = (ArrayList) this.f28391c;
        boolean zIsEmpty = arrayList.isEmpty();
        int i10 = this.f28390b;
        if (zIsEmpty && getVisibility() != 8) {
            NotificationCenter.getInstance(i10).removeDelayed(r00Var);
            NotificationCenter.getInstance(i10).doOnIdle(r00Var);
        } else {
            if (arrayList.isEmpty() || getVisibility() == 0) {
                return;
            }
            NotificationCenter.getInstance(i10).removeDelayed(r00Var);
            setVisibility(0);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f28389a) {
            case 0:
                gf.c0 c0Var = (gf.c0) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f28391c;
                int i10 = this.f28390b;
                c0Var.b(org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
                c0Var.draw(canvas);
                gf.c0 c0Var2 = (gf.c0) this.f28392e;
                c0Var2.b(org.telegram.ui.ActionBar.g6.l1(0.95f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
                c0Var2.draw(canvas);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f28391c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((org.telegram.ui.nh0) arrayList.get(i11)).a(canvas);
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f28389a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                int i14 = AndroidUtilities.statusBarHeight;
                gf.c0 c0Var = (gf.c0) this.d;
                c0Var.c(AndroidUtilities.dp(12.0f) + i14, 0);
                c0Var.setBounds(0, 0, i10, AndroidUtilities.dp(52.0f) + i14);
                gf.c0 c0Var2 = (gf.c0) this.f28392e;
                c0Var2.c(i14 / 3, 0);
                c0Var2.setBounds(0, 0, i10, i14);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    public fi(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = new gf.c0(2);
        this.f28392e = new gf.c0(2);
        this.f28391c = c6Var;
        this.f28390b = i10;
    }
}
