package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ui extends View {
    public final int f30930a = 0;
    public final int f30931b;
    public final Object f30932c;
    public final Object d;
    public final Object f30933e;

    public ui(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.f30932c = new ArrayList();
        this.f30933e = new org.telegram.ui.g10(this, 27);
        this.d = viewGroup;
        this.f30931b = i10;
    }

    public void a() {
        org.telegram.ui.g10 g10Var = (org.telegram.ui.g10) this.f30933e;
        ArrayList arrayList = (ArrayList) this.f30932c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.f30931b;
        if (isEmpty && getVisibility() != 8) {
            NotificationCenter.getInstance(i10).removeDelayed(g10Var);
            NotificationCenter.getInstance(i10).doOnIdle(g10Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            NotificationCenter.getInstance(i10).removeDelayed(g10Var);
            setVisibility(0);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f30930a) {
            case 0:
                yf.z zVar = (yf.z) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f30932c;
                int i10 = this.f30931b;
                zVar.b(org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
                zVar.draw(canvas);
                yf.z zVar2 = (yf.z) this.f30933e;
                zVar2.b(org.telegram.ui.ActionBar.j6.l1(0.95f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
                zVar2.draw(canvas);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f30932c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((org.telegram.ui.ci0) arrayList.get(i11)).a(canvas);
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f30930a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                int i14 = AndroidUtilities.statusBarHeight;
                yf.z zVar = (yf.z) this.d;
                zVar.c(AndroidUtilities.dp(12.0f) + i14, 0);
                zVar.setBounds(0, 0, i10, AndroidUtilities.dp(52.0f) + i14);
                yf.z zVar2 = (yf.z) this.f30933e;
                zVar2.c(i14 / 3, 0);
                zVar2.setBounds(0, 0, i10, i14);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    public ui(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = new yf.z(2);
        this.f30933e = new yf.z(2);
        this.f30932c = f6Var;
        this.f30931b = i10;
    }
}
