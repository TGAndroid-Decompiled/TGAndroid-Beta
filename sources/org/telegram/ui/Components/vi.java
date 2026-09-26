package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class vi extends View {
    public final int f29161a = 0;
    public final int f29162b;
    public final Object f29163c;
    public final Object d;
    public final Object e;

    public vi(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.f29163c = new ArrayList();
        this.e = new org.telegram.ui.c10(this, 27);
        this.d = viewGroup;
        this.f29162b = i10;
    }

    public void a() {
        org.telegram.ui.c10 c10Var = (org.telegram.ui.c10) this.e;
        ArrayList arrayList = (ArrayList) this.f29163c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.f29162b;
        if (isEmpty && getVisibility() != 8) {
            NotificationCenter.getInstance(i10).removeDelayed(c10Var);
            NotificationCenter.getInstance(i10).doOnIdle(c10Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            NotificationCenter.getInstance(i10).removeDelayed(c10Var);
            setVisibility(0);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f29161a) {
            case 0:
                yf.y yVar = (yf.y) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f29163c;
                int i10 = this.f29162b;
                yVar.b(org.telegram.ui.ActionBar.h6.l1(0.5f, org.telegram.ui.ActionBar.h6.v0(i10, d6Var)));
                yVar.draw(canvas);
                yf.y yVar2 = (yf.y) this.e;
                yVar2.b(org.telegram.ui.ActionBar.h6.l1(0.95f, org.telegram.ui.ActionBar.h6.v0(i10, d6Var)));
                yVar2.draw(canvas);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f29163c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((org.telegram.ui.vh0) arrayList.get(i11)).a(canvas);
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f29161a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                int i14 = AndroidUtilities.statusBarHeight;
                yf.y yVar = (yf.y) this.d;
                yVar.c(AndroidUtilities.dp(12.0f) + i14, 0);
                yVar.setBounds(0, 0, i10, AndroidUtilities.dp(52.0f) + i14);
                yf.y yVar2 = (yf.y) this.e;
                yVar2.c(i14 / 3, 0);
                yVar2.setBounds(0, 0, i10, i14);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    public vi(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = new yf.y(2);
        this.e = new yf.y(2);
        this.f29163c = d6Var;
        this.f29162b = i10;
    }
}
