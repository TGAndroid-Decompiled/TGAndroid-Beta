package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f19984a = 0;
    public final int f19985b;
    public final long f19986c;
    public final int d;
    public final BaseController f19987e;
    public final Object f19988f;
    public final Object h;
    public final Object f19989n;
    public final Object f19990r;
    public final Object f19991s;
    public final Object v;
    public final Object f19992w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.f19987e = fileLoader;
        this.f19988f = document;
        this.h = secureDocument;
        this.f19989n = webFile;
        this.f19990r = tL_fileLocationToBeDeprecated;
        this.f19991s = imageLocation;
        this.v = obj;
        this.f19992w = str;
        this.f19986c = j3;
        this.f19985b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19984a) {
            case 0:
                int i10 = this.f19985b;
                int i11 = this.d;
                ((FileLoader) this.f19987e).lambda$loadFile$13((TLRPC.Document) this.f19988f, (SecureDocument) this.h, (WebFile) this.f19989n, (TLRPC.TL_fileLocationToBeDeprecated) this.f19990r, (ImageLocation) this.f19991s, this.v, (String) this.f19992w, this.f19986c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f19987e).lambda$processLoadedStickers$105(this.f19985b, (a0.i) this.f19988f, (HashMap) this.h, (ArrayList) this.f19989n, this.f19986c, this.d, (a0.i) this.f19990r, (HashMap) this.f19991s, (a0.i) this.v, (Runnable) this.f19992w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.f19987e = mediaDataController;
        this.f19985b = i10;
        this.f19988f = iVar;
        this.h = hashMap;
        this.f19989n = arrayList;
        this.f19986c = j3;
        this.d = i11;
        this.f19990r = iVar2;
        this.f19991s = hashMap2;
        this.v = iVar3;
        this.f19992w = runnable;
    }
}
