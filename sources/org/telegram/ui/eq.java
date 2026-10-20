package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class eq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.yl0, org.telegram.ui.Components.zl0 {
    public final int f36756a;
    public final hr f36757b;

    public eq(hr hrVar, int i10) {
        this.f36756a = i10;
        this.f36757b = hrVar;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        hr hrVar = this.f36757b;
        if (hrVar.getParentActivity() != null) {
            s4.g0 adapter = hrVar.f37721c.getAdapter();
            dr drVar = hrVar.f37715a;
            if (adapter == drVar) {
                return hrVar.h0(drVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        hr.V(this.f36757b, view, i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36756a) {
            case 1:
                this.f36757b.u0();
                return;
            default:
                this.f36757b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        hr.U(this.f36757b, j10);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
