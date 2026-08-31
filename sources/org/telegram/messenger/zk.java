package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zk implements Runnable {
    public final int f20833a = 0;
    public final boolean f20834b;
    public final long f20835c;
    public final BaseController d;
    public final Object f20836e;
    public final Object f20837f;
    public final Object h;
    public final Object f20838n;

    public zk(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z4) {
        this.d = translateController;
        this.f20836e = pendingTranslation;
        this.f20837f = tLObject;
        this.f20834b = z4;
        this.h = tL_error;
        this.f20835c = j10;
        this.f20838n = set;
    }

    @Override
    public final void run() {
        switch (this.f20833a) {
            case 0:
                long j10 = this.f20835c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f20836e, (TLObject) this.f20837f, this.f20834b, (TLRPC.TL_error) this.h, j10, (Set) this.f20838n);
                return;
            case 1:
                long j11 = this.f20835c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f20836e, this.f20834b, (ArrayList) this.f20837f, (ArrayList) this.h, (a0.h) this.f20838n, j11);
                return;
            default:
                long j12 = this.f20835c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f20837f, (TLRPC.TL_chatInviteImporter) this.f20836e, this.f20834b, j12, (RequestDelegate) this.f20838n);
                return;
        }
    }

    public zk(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z4) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f20837f = tLObject;
        this.f20836e = tL_chatInviteImporter;
        this.f20834b = z4;
        this.f20835c = j10;
        this.f20838n = requestDelegate;
    }

    public zk(MediaDataController mediaDataController, ArrayList arrayList, boolean z4, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.f20836e = arrayList;
        this.f20834b = z4;
        this.f20837f = arrayList2;
        this.h = arrayList3;
        this.f20838n = hVar;
        this.f20835c = j10;
    }
}
