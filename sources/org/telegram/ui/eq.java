package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class eq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.yl0, org.telegram.ui.Components.zl0 {
    public final int f36761a;
    public final hr f36762b;

    public eq(hr hrVar, int i10) {
        this.f36761a = i10;
        this.f36762b = hrVar;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        hr hrVar = this.f36762b;
        if (hrVar.getParentActivity() != null) {
            s4.g0 adapter = hrVar.f37726c.getAdapter();
            dr drVar = hrVar.f37720a;
            if (adapter == drVar) {
                return hrVar.h0(drVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        hr.V(this.f36762b, view, i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36761a) {
            case 1:
                this.f36762b.u0();
                return;
            default:
                this.f36762b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        hr.U(this.f36762b, j10);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
