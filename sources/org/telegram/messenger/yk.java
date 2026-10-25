package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yk implements Runnable {
    public final int f21940a = 0;
    public final boolean f21941b;
    public final long f21942c;
    public final BaseController d;
    public final Object e;
    public final Object f21943f;
    public final Object h;
    public final Object f21944n;

    public yk(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f21943f = tLObject;
        this.f21941b = z10;
        this.h = tL_error;
        this.f21942c = j10;
        this.f21944n = set;
    }

    @Override
    public final void run() {
        switch (this.f21940a) {
            case 0:
                long j10 = this.f21942c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.e, (TLObject) this.f21943f, this.f21941b, (TLRPC.TL_error) this.h, j10, (Set) this.f21944n);
                return;
            case 1:
                long j11 = this.f21942c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.f21941b, (ArrayList) this.f21943f, (ArrayList) this.h, (a0.h) this.f21944n, j11);
                return;
            default:
                long j12 = this.f21942c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f21943f, (TLRPC.TL_chatInviteImporter) this.e, this.f21941b, j12, (RequestDelegate) this.f21944n);
                return;
        }
    }

    public yk(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f21943f = tLObject;
        this.e = tL_chatInviteImporter;
        this.f21941b = z10;
        this.f21942c = j10;
        this.f21944n = requestDelegate;
    }

    public yk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.f21941b = z10;
        this.f21943f = arrayList2;
        this.h = arrayList3;
        this.f21944n = hVar;
        this.f21942c = j10;
    }
}
