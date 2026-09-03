package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zk implements Runnable {
    public final int f20835a = 0;
    public final boolean f20836b;
    public final long f20837c;
    public final BaseController d;
    public final Object f20838e;
    public final Object f20839f;
    public final Object h;
    public final Object f20840n;

    public zk(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z4) {
        this.d = translateController;
        this.f20838e = pendingTranslation;
        this.f20839f = tLObject;
        this.f20836b = z4;
        this.h = tL_error;
        this.f20837c = j10;
        this.f20840n = set;
    }

    @Override
    public final void run() {
        switch (this.f20835a) {
            case 0:
                long j10 = this.f20837c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f20838e, (TLObject) this.f20839f, this.f20836b, (TLRPC.TL_error) this.h, j10, (Set) this.f20840n);
                return;
            case 1:
                long j11 = this.f20837c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f20838e, this.f20836b, (ArrayList) this.f20839f, (ArrayList) this.h, (a0.h) this.f20840n, j11);
                return;
            default:
                long j12 = this.f20837c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f20839f, (TLRPC.TL_chatInviteImporter) this.f20838e, this.f20836b, j12, (RequestDelegate) this.f20840n);
                return;
        }
    }

    public zk(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z4) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f20839f = tLObject;
        this.f20838e = tL_chatInviteImporter;
        this.f20836b = z4;
        this.f20837c = j10;
        this.f20840n = requestDelegate;
    }

    public zk(MediaDataController mediaDataController, ArrayList arrayList, boolean z4, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.f20838e = arrayList;
        this.f20836b = z4;
        this.f20839f = arrayList2;
        this.h = arrayList3;
        this.f20840n = hVar;
        this.f20837c = j10;
    }
}
