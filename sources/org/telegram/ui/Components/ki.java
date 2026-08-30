package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ki extends View {
    public final int f26275a = 0;
    public final int f26276b;
    public final Object f26277c;
    public final Object d;
    public final Object e;

    public ki(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.f26277c = new ArrayList();
        this.e = new org.telegram.ui.c10(this, 27);
        this.d = viewGroup;
        this.f26276b = i10;
    }

    public void a() {
        org.telegram.ui.c10 c10Var = (org.telegram.ui.c10) this.e;
        ArrayList arrayList = (ArrayList) this.f26277c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.f26276b;
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
        switch (this.f26275a) {
            case 0:
                lf.b0 b0Var = (lf.b0) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f26277c;
                int i10 = this.f26276b;
                b0Var.b(org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
                b0Var.draw(canvas);
                lf.b0 b0Var2 = (lf.b0) this.e;
                b0Var2.b(org.telegram.ui.ActionBar.j6.l1(0.95f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
                b0Var2.draw(canvas);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f26277c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((org.telegram.ui.sh0) arrayList.get(i11)).a(canvas);
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f26275a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                int i14 = AndroidUtilities.statusBarHeight;
                lf.b0 b0Var = (lf.b0) this.d;
                b0Var.c(AndroidUtilities.dp(12.0f) + i14, 0);
                b0Var.setBounds(0, 0, i10, AndroidUtilities.dp(52.0f) + i14);
                lf.b0 b0Var2 = (lf.b0) this.e;
                b0Var2.c(i14 / 3, 0);
                b0Var2.setBounds(0, 0, i10, i14);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    public ki(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = new lf.b0(2);
        this.e = new lf.b0(2);
        this.f26277c = f6Var;
        this.f26276b = i10;
    }
}
