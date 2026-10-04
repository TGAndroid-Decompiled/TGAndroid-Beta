package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f19951a = 0;
    public final int f19952b;
    public final long f19953c;
    public final int d;
    public final BaseController f19954e;
    public final Object f19955f;
    public final Object h;
    public final Object f19956n;
    public final Object f19957r;
    public final Object f19958s;
    public final Object v;
    public final Object f19959w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.f19954e = fileLoader;
        this.f19955f = document;
        this.h = secureDocument;
        this.f19956n = webFile;
        this.f19957r = tL_fileLocationToBeDeprecated;
        this.f19958s = imageLocation;
        this.v = obj;
        this.f19959w = str;
        this.f19953c = j3;
        this.f19952b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19951a) {
            case 0:
                int i10 = this.f19952b;
                int i11 = this.d;
                ((FileLoader) this.f19954e).lambda$loadFile$13((TLRPC.Document) this.f19955f, (SecureDocument) this.h, (WebFile) this.f19956n, (TLRPC.TL_fileLocationToBeDeprecated) this.f19957r, (ImageLocation) this.f19958s, this.v, (String) this.f19959w, this.f19953c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f19954e).lambda$processLoadedStickers$105(this.f19952b, (a0.i) this.f19955f, (HashMap) this.h, (ArrayList) this.f19956n, this.f19953c, this.d, (a0.i) this.f19957r, (HashMap) this.f19958s, (a0.i) this.v, (Runnable) this.f19959w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.f19954e = mediaDataController;
        this.f19952b = i10;
        this.f19955f = iVar;
        this.h = hashMap;
        this.f19956n = arrayList;
        this.f19953c = j3;
        this.d = i11;
        this.f19957r = iVar2;
        this.f19958s = hashMap2;
        this.v = iVar3;
        this.f19959w = runnable;
    }
}
