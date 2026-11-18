package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.tc1;
import org.telegram.ui.uc1;
public final class ej extends org.telegram.ui.Cells.ua {
    public final int f34721x;
    public final bk0 f34722y;

    public ej(bk0 bk0Var, Context context, int i7) {
        super(context, 5);
        this.f34721x = i7;
        this.f34722y = bk0Var;
    }

    @Override
    public final void a(int i7, Object obj) {
        switch (this.f34721x) {
            case 0:
                q0.a aVar = ((fj) ((qa) this.f34722y).f38755f).f35119y;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.w0(((tc1) this.f34722y).d, this, obj, i7);
                return;
            default:
                ((uc1) this.f34722y).F.presentFragment(new org.telegram.ui.x71(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i7) {
        switch (this.f34721x) {
            case 1:
                return WallpapersListActivity.x0(((tc1) this.f34722y).d, this, obj, i7);
            default:
                return super.b(obj, i7);
        }
    }

    public ej(qa qaVar, Context context) {
        super(context, 1);
        this.f34721x = 0;
        this.f34722y = qaVar;
    }
}
