package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class mi extends View {
    public final int f30703a = 0;
    public final int f30704b;
    public final Object f30705c;
    public final Object d;
    public final Object f30706e;

    public mi(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.f30705c = new ArrayList();
        this.f30706e = new org.telegram.ui.q00(this, 27);
        this.d = viewGroup;
        this.f30704b = i10;
    }

    public void a() {
        org.telegram.ui.q00 q00Var = (org.telegram.ui.q00) this.f30706e;
        ArrayList arrayList = (ArrayList) this.f30705c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.f30704b;
        if (isEmpty && getVisibility() != 8) {
            NotificationCenter.getInstance(i10).removeDelayed(q00Var);
            NotificationCenter.getInstance(i10).doOnIdle(q00Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            NotificationCenter.getInstance(i10).removeDelayed(q00Var);
            setVisibility(0);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f30703a) {
            case 0:
                jf.b0 b0Var = (jf.b0) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f30705c;
                int i10 = this.f30704b;
                b0Var.b(org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
                b0Var.draw(canvas);
                jf.b0 b0Var2 = (jf.b0) this.f30706e;
                b0Var2.b(org.telegram.ui.ActionBar.g6.l1(0.95f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
                b0Var2.draw(canvas);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f30705c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((org.telegram.ui.kh0) arrayList.get(i11)).a(canvas);
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f30703a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                int i14 = AndroidUtilities.statusBarHeight;
                jf.b0 b0Var = (jf.b0) this.d;
                b0Var.c(AndroidUtilities.dp(12.0f) + i14, 0);
                b0Var.setBounds(0, 0, i10, AndroidUtilities.dp(52.0f) + i14);
                jf.b0 b0Var2 = (jf.b0) this.f30706e;
                b0Var2.c(i14 / 3, 0);
                b0Var2.setBounds(0, 0, i10, i14);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    public mi(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = new jf.b0(2);
        this.f30706e = new jf.b0(2);
        this.f30705c = c6Var;
        this.f30704b = i10;
    }
}
