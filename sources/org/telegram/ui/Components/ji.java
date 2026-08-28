package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ji extends View {
    public final int f29742a = 0;
    public final int f29743b;
    public final Object f29744c;
    public final Object d;
    public final Object f29745e;

    public ji(ViewGroup viewGroup, int i9) {
        super(viewGroup.getContext());
        this.f29744c = new ArrayList();
        this.f29745e = new org.telegram.ui.o00(this, 27);
        this.d = viewGroup;
        this.f29743b = i9;
    }

    public void a() {
        org.telegram.ui.o00 o00Var = (org.telegram.ui.o00) this.f29745e;
        ArrayList arrayList = (ArrayList) this.f29744c;
        boolean isEmpty = arrayList.isEmpty();
        int i9 = this.f29743b;
        if (isEmpty && getVisibility() != 8) {
            NotificationCenter.getInstance(i9).removeDelayed(o00Var);
            NotificationCenter.getInstance(i9).doOnIdle(o00Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            NotificationCenter.getInstance(i9).removeDelayed(o00Var);
            setVisibility(0);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f29742a) {
            case 0:
                ff.c0 c0Var = (ff.c0) this.d;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f29744c;
                int i9 = this.f29743b;
                c0Var.b(org.telegram.ui.ActionBar.f6.l1(0.5f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
                c0Var.draw(canvas);
                ff.c0 c0Var2 = (ff.c0) this.f29745e;
                c0Var2.b(org.telegram.ui.ActionBar.f6.l1(0.95f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
                c0Var2.draw(canvas);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f29744c;
                if (!arrayList.isEmpty()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((org.telegram.ui.lh0) arrayList.get(i10)).a(canvas);
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f29742a) {
            case 0:
                super.onSizeChanged(i9, i10, i11, i12);
                int i13 = AndroidUtilities.statusBarHeight;
                ff.c0 c0Var = (ff.c0) this.d;
                c0Var.c(AndroidUtilities.dp(12.0f) + i13, 0);
                c0Var.setBounds(0, 0, i9, AndroidUtilities.dp(52.0f) + i13);
                ff.c0 c0Var2 = (ff.c0) this.f29745e;
                c0Var2.c(i13 / 3, 0);
                c0Var2.setBounds(0, 0, i9, i13);
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }

    public ji(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.d = new ff.c0(2);
        this.f29745e = new ff.c0(2);
        this.f29744c = b6Var;
        this.f29743b = i9;
    }
}
