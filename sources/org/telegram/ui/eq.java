package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class eq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.xl0, org.telegram.ui.Components.yl0 {
    public final int f36750a;
    public final hr f36751b;

    public eq(hr hrVar, int i10) {
        this.f36750a = i10;
        this.f36751b = hrVar;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        hr hrVar = this.f36751b;
        if (hrVar.getParentActivity() != null) {
            s4.g0 adapter = hrVar.f37715c.getAdapter();
            dr drVar = hrVar.f37709a;
            if (adapter == drVar) {
                return hrVar.h0(drVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        hr.V(this.f36751b, view, i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36750a) {
            case 1:
                this.f36751b.u0();
                return;
            default:
                this.f36751b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        hr.U(this.f36751b, j10);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
