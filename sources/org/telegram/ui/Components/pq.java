package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class pq implements DialogInterface.OnDismissListener {
    public final int f29510a = 0;
    public final boolean[] f29511b;
    public final boolean[] f29512c;
    public final int d;
    public final Object e;
    public final Object f29513f;
    public final Object h;

    public pq(boolean[] zArr, ag.g3 g3Var, boolean[] zArr2, org.telegram.messenger.r20 r20Var, int[] iArr, int i10) {
        this.f29511b = zArr;
        this.e = g3Var;
        this.f29512c = zArr2;
        this.f29513f = r20Var;
        this.h = iArr;
        this.d = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29510a) {
            case 0:
                org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) this.f29513f;
                int[] iArr = (int[]) this.h;
                this.f29511b[0] = true;
                ((ag.g3) this.e).run();
                boolean[] zArr = this.f29512c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    r20Var.a(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(this.d).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    return;
                }
                return;
            default:
                Context context = (Context) this.e;
                TLRPC.User user = (TLRPC.User) this.f29513f;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.h;
                if (!this.f29511b[0]) {
                    boolean[] zArr2 = this.f29512c;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        xh.r3.e(context, this.d, user.f19943id);
                        oVar.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public pq(boolean[] zArr, boolean[] zArr2, Context context, int i10, TLRPC.User user, org.telegram.ui.web.o oVar) {
        this.f29511b = zArr;
        this.f29512c = zArr2;
        this.e = context;
        this.d = i10;
        this.f29513f = user;
        this.h = oVar;
    }
}
