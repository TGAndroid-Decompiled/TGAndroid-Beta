package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zk implements Runnable {
    public final int f22019a = 0;
    public final boolean f22020b;
    public final long f22021c;
    public final BaseController d;
    public final Object e;
    public final Object f22022f;
    public final Object h;
    public final Object f22023n;

    public zk(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f22022f = tLObject;
        this.f22020b = z10;
        this.h = tL_error;
        this.f22021c = j10;
        this.f22023n = set;
    }

    @Override
    public final void run() {
        switch (this.f22019a) {
            case 0:
                long j10 = this.f22021c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.e, (TLObject) this.f22022f, this.f22020b, (TLRPC.TL_error) this.h, j10, (Set) this.f22023n);
                return;
            case 1:
                long j11 = this.f22021c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.f22020b, (ArrayList) this.f22022f, (ArrayList) this.h, (a0.h) this.f22023n, j11);
                return;
            default:
                long j12 = this.f22021c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f22022f, (TLRPC.TL_chatInviteImporter) this.e, this.f22020b, j12, (RequestDelegate) this.f22023n);
                return;
        }
    }

    public zk(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f22022f = tLObject;
        this.e = tL_chatInviteImporter;
        this.f22020b = z10;
        this.f22021c = j10;
        this.f22023n = requestDelegate;
    }

    public zk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.f22020b = z10;
        this.f22022f = arrayList2;
        this.h = arrayList3;
        this.f22023n = hVar;
        this.f22021c = j10;
    }
}
