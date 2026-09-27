package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class vi extends View {
    public final int f29136a = 0;
    public final int f29137b;
    public final Object f29138c;
    public final Object d;
    public final Object e;

    public vi(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.f29138c = new ArrayList();
        this.e = new org.telegram.ui.f10(this, 27);
        this.d = viewGroup;
        this.f29137b = i10;
    }

    public void a() {
        org.telegram.ui.f10 f10Var = (org.telegram.ui.f10) this.e;
        ArrayList arrayList = (ArrayList) this.f29138c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.f29137b;
        if (isEmpty && getVisibility() != 8) {
            NotificationCenter.getInstance(i10).removeDelayed(f10Var);
            NotificationCenter.getInstance(i10).doOnIdle(f10Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            NotificationCenter.getInstance(i10).removeDelayed(f10Var);
            setVisibility(0);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f29136a) {
            case 0:
                yf.y yVar = (yf.y) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f29138c;
                int i10 = this.f29137b;
                yVar.b(org.telegram.ui.ActionBar.i6.l1(0.5f, org.telegram.ui.ActionBar.i6.v0(i10, e6Var)));
                yVar.draw(canvas);
                yf.y yVar2 = (yf.y) this.e;
                yVar2.b(org.telegram.ui.ActionBar.i6.l1(0.95f, org.telegram.ui.ActionBar.i6.v0(i10, e6Var)));
                yVar2.draw(canvas);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f29138c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((org.telegram.ui.yh0) arrayList.get(i11)).a(canvas);
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f29136a) {
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

    public vi(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = new yf.y(2);
        this.e = new yf.y(2);
        this.f29138c = e6Var;
        this.f29137b = i10;
    }
}
