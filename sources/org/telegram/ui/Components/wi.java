package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class wi extends View {
    public final int f32565a = 0;
    public final int f32566b;
    public final Object f32567c;
    public final Object d;
    public final Object f32568e;

    public wi(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.f32567c = new ArrayList();
        this.f32568e = new org.telegram.ui.g10(this, 27);
        this.d = viewGroup;
        this.f32566b = i10;
    }

    public void a() {
        org.telegram.ui.g10 g10Var = (org.telegram.ui.g10) this.f32568e;
        ArrayList arrayList = (ArrayList) this.f32567c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.f32566b;
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
        switch (this.f32565a) {
            case 0:
                yf.y yVar = (yf.y) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f32567c;
                int i10 = this.f32566b;
                yVar.b(org.telegram.ui.ActionBar.i6.l1(0.5f, org.telegram.ui.ActionBar.i6.v0(i10, d6Var)));
                yVar.draw(canvas);
                yf.y yVar2 = (yf.y) this.f32568e;
                yVar2.b(org.telegram.ui.ActionBar.i6.l1(0.95f, org.telegram.ui.ActionBar.i6.v0(i10, d6Var)));
                yVar2.draw(canvas);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f32567c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((org.telegram.ui.zh0) arrayList.get(i11)).a(canvas);
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f32565a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                int i14 = AndroidUtilities.statusBarHeight;
                yf.y yVar = (yf.y) this.d;
                yVar.c(AndroidUtilities.dp(12.0f) + i14, 0);
                yVar.setBounds(0, 0, i10, AndroidUtilities.dp(52.0f) + i14);
                yf.y yVar2 = (yf.y) this.f32568e;
                yVar2.c(i14 / 3, 0);
                yVar2.setBounds(0, 0, i10, i14);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    public wi(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = new yf.y(2);
        this.f32568e = new yf.y(2);
        this.f32567c = d6Var;
        this.f32566b = i10;
    }
}
