package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.m91;
import org.telegram.ui.oe1;
import org.telegram.ui.pe1;
public final class pi extends org.telegram.ui.Cells.ua {
    public final int f29365x;
    public final sk0 f29366y;

    public pi(sk0 sk0Var, Context context, int i10) {
        super(context, 5);
        this.f29365x = i10;
        this.f29366y = sk0Var;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f29365x) {
            case 0:
                q0.a aVar = ((qi) ((fa) this.f29366y).f26021f).f29664y;
                if (aVar != null) {
                    aVar.accept(obj);
                    return;
                }
                return;
            case 1:
                WallpapersListActivity.v0(((oe1) this.f29366y).d, this, obj, i10);
                return;
            default:
                ((pe1) this.f29366y).E.presentFragment(new m91(obj, null, true));
                return;
        }
    }

    @Override
    public boolean b(Object obj, int i10) {
        switch (this.f29365x) {
            case 1:
                return WallpapersListActivity.w0(((oe1) this.f29366y).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    public pi(fa faVar, Context context) {
        super(context, 1);
        this.f29365x = 0;
        this.f29366y = faVar;
    }
}
