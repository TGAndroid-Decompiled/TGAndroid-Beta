package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class pq implements DialogInterface.OnDismissListener {
    public final int f29400a = 0;
    public final boolean[] f29401b;
    public final boolean[] f29402c;
    public final int d;
    public final Object e;
    public final Object f29403f;
    public final Object h;

    public pq(boolean[] zArr, ag.g3 g3Var, boolean[] zArr2, org.telegram.messenger.q20 q20Var, int[] iArr, int i10) {
        this.f29401b = zArr;
        this.e = g3Var;
        this.f29402c = zArr2;
        this.f29403f = q20Var;
        this.h = iArr;
        this.d = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29400a) {
            case 0:
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.f29403f;
                int[] iArr = (int[]) this.h;
                this.f29401b[0] = true;
                ((ag.g3) this.e).run();
                boolean[] zArr = this.f29402c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q20Var.a(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(this.d).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    return;
                }
                return;
            default:
                Context context = (Context) this.e;
                TLRPC.User user = (TLRPC.User) this.f29403f;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.h;
                if (!this.f29401b[0]) {
                    boolean[] zArr2 = this.f29402c;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        xh.q3.e(context, this.d, user.f19942id);
                        oVar.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public pq(boolean[] zArr, boolean[] zArr2, Context context, int i10, TLRPC.User user, org.telegram.ui.web.o oVar) {
        this.f29401b = zArr;
        this.f29402c = zArr2;
        this.e = context;
        this.d = i10;
        this.f29403f = user;
        this.h = oVar;
    }
}
