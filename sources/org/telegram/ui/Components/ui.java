package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ui extends View {
    public final int f28711a = 0;
    public final int f28712b;
    public final Object f28713c;
    public final Object d;
    public final Object e;

    public ui(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.f28713c = new ArrayList();
        this.e = new org.telegram.ui.g10(this, 27);
        this.d = viewGroup;
        this.f28712b = i10;
    }

    public void a() {
        org.telegram.ui.g10 g10Var = (org.telegram.ui.g10) this.e;
        ArrayList arrayList = (ArrayList) this.f28713c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.f28712b;
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
        switch (this.f28711a) {
            case 0:
                yf.z zVar = (yf.z) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f28713c;
                int i10 = this.f28712b;
                zVar.b(org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i10, e6Var)));
                zVar.draw(canvas);
                yf.z zVar2 = (yf.z) this.e;
                zVar2.b(org.telegram.ui.ActionBar.j6.l1(0.95f, org.telegram.ui.ActionBar.j6.v0(i10, e6Var)));
                zVar2.draw(canvas);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f28713c;
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
        switch (this.f28711a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                int i14 = AndroidUtilities.statusBarHeight;
                yf.z zVar = (yf.z) this.d;
                zVar.c(AndroidUtilities.dp(12.0f) + i14, 0);
                zVar.setBounds(0, 0, i10, AndroidUtilities.dp(52.0f) + i14);
                yf.z zVar2 = (yf.z) this.e;
                zVar2.c(i14 / 3, 0);
                zVar2.setBounds(0, 0, i10, i14);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    public ui(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = new yf.z(2);
        this.e = new yf.z(2);
        this.f28713c = e6Var;
        this.f28712b = i10;
    }
}
