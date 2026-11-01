package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.k91;
import org.telegram.ui.me1;
import org.telegram.ui.ne1;
public final class pi extends org.telegram.ui.Cells.ua {
    public final int f29432x;
    public final tk0 f29433y;

    public pi(tk0 tk0Var, Context context, int i10) {
        super(context, 5);
        this.f29432x = i10;
        this.f29433y = tk0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f29432x) {
            case 0:
                q0.a aVar = ((qi) ((fa) this.f29433y).f26120f).f29738y;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.w0(((me1) this.f29433y).d, this, obj, i10);
                return;
            default:
                ((ne1) this.f29433y).E.presentFragment(new k91(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f29432x) {
            case 1:
                return WallpapersListActivity.x0(((me1) this.f29433y).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public pi(fa faVar, Context context) {
        super(context, 1);
        this.f29432x = 0;
        this.f29433y = faVar;
    }
}
