package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class si extends View {
    public final int f30293a = 0;
    public final int f30294b;
    public final Object f30295c;
    public final Object d;
    public final Object e;

    public si(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.f30295c = new ArrayList();
        this.e = new org.telegram.ui.dz(this, 28);
        this.d = viewGroup;
        this.f30294b = i10;
    }

    public void a() {
        org.telegram.ui.dz dzVar = (org.telegram.ui.dz) this.e;
        ArrayList arrayList = (ArrayList) this.f30295c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.f30294b;
        if (isEmpty && getVisibility() != 8) {
            NotificationCenter.getInstance(i10).removeDelayed(dzVar);
            NotificationCenter.getInstance(i10).doOnIdle(dzVar);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            NotificationCenter.getInstance(i10).removeDelayed(dzVar);
            setVisibility(0);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f30293a) {
            case 0:
                zf.y yVar = (zf.y) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f30295c;
                int i10 = this.f30294b;
                yVar.b(org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
                yVar.draw(canvas);
                zf.y yVar2 = (zf.y) this.e;
                yVar2.b(org.telegram.ui.ActionBar.h6.m1(0.95f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
                yVar2.draw(canvas);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f30295c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((org.telegram.ui.mh0) arrayList.get(i11)).a(canvas);
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f30293a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                int i14 = AndroidUtilities.statusBarHeight;
                zf.y yVar = (zf.y) this.d;
                yVar.c(AndroidUtilities.dp(12.0f) + i14, 0);
                yVar.setBounds(0, 0, i10, AndroidUtilities.dp(52.0f) + i14);
                zf.y yVar2 = (zf.y) this.e;
                yVar2.c(i14 / 3, 0);
                yVar2.setBounds(0, 0, i10, i14);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    public si(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = new zf.y(2);
        this.e = new zf.y(2);
        this.f30295c = d6Var;
        this.f30294b = i10;
    }
}
