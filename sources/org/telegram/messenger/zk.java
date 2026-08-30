package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zk implements Runnable {
    public final int f19175a = 0;
    public final boolean f19176b;
    public final long f19177c;
    public final BaseController d;
    public final Object e;
    public final Object f19178f;
    public final Object h;
    public final Object f19179n;

    public zk(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z4) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f19178f = tLObject;
        this.f19176b = z4;
        this.h = tL_error;
        this.f19177c = j10;
        this.f19179n = set;
    }

    @Override
    public final void run() {
        switch (this.f19175a) {
            case 0:
                long j10 = this.f19177c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.e, (TLObject) this.f19178f, this.f19176b, (TLRPC.TL_error) this.h, j10, (Set) this.f19179n);
                return;
            case 1:
                long j11 = this.f19177c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.f19176b, (ArrayList) this.f19178f, (ArrayList) this.h, (a0.h) this.f19179n, j11);
                return;
            default:
                long j12 = this.f19177c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f19178f, (TLRPC.TL_chatInviteImporter) this.e, this.f19176b, j12, (RequestDelegate) this.f19179n);
                return;
        }
    }

    public zk(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z4) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f19178f = tLObject;
        this.e = tL_chatInviteImporter;
        this.f19176b = z4;
        this.f19177c = j10;
        this.f19179n = requestDelegate;
    }

    public zk(MediaDataController mediaDataController, ArrayList arrayList, boolean z4, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.f19176b = z4;
        this.f19178f = arrayList2;
        this.h = arrayList3;
        this.f19179n = hVar;
        this.f19177c = j10;
    }
}
