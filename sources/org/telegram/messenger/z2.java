package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f18250a = 0;
    public final int f18251b;
    public final long f18252c;
    public final int d;
    public final BaseController e;
    public final Object f18253f;
    public final Object h;
    public final Object f18254n;
    public final Object f18255r;
    public final Object f18256s;
    public final Object v;
    public final Object f18257w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.e = fileLoader;
        this.f18253f = document;
        this.h = secureDocument;
        this.f18254n = webFile;
        this.f18255r = tL_fileLocationToBeDeprecated;
        this.f18256s = imageLocation;
        this.v = obj;
        this.f18257w = str;
        this.f18252c = j3;
        this.f18251b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18250a) {
            case 0:
                int i10 = this.f18251b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18253f, (SecureDocument) this.h, (WebFile) this.f18254n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18255r, (ImageLocation) this.f18256s, this.v, (String) this.f18257w, this.f18252c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18251b, (a0.i) this.f18253f, (HashMap) this.h, (ArrayList) this.f18254n, this.f18252c, this.d, (a0.i) this.f18255r, (HashMap) this.f18256s, (a0.i) this.v, (Runnable) this.f18257w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18251b = i10;
        this.f18253f = iVar;
        this.h = hashMap;
        this.f18254n = arrayList;
        this.f18252c = j3;
        this.d = i11;
        this.f18255r = iVar2;
        this.f18256s = hashMap2;
        this.v = iVar3;
        this.f18257w = runnable;
    }
}
