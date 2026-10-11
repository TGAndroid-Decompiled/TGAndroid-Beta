package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f19948a = 0;
    public final int f19949b;
    public final long f19950c;
    public final int d;
    public final BaseController f19951e;
    public final Object f19952f;
    public final Object h;
    public final Object f19953n;
    public final Object f19954r;
    public final Object f19955s;
    public final Object v;
    public final Object f19956w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.f19951e = fileLoader;
        this.f19952f = document;
        this.h = secureDocument;
        this.f19953n = webFile;
        this.f19954r = tL_fileLocationToBeDeprecated;
        this.f19955s = imageLocation;
        this.v = obj;
        this.f19956w = str;
        this.f19950c = j3;
        this.f19949b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19948a) {
            case 0:
                int i10 = this.f19949b;
                int i11 = this.d;
                ((FileLoader) this.f19951e).lambda$loadFile$13((TLRPC.Document) this.f19952f, (SecureDocument) this.h, (WebFile) this.f19953n, (TLRPC.TL_fileLocationToBeDeprecated) this.f19954r, (ImageLocation) this.f19955s, this.v, (String) this.f19956w, this.f19950c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f19951e).lambda$processLoadedStickers$105(this.f19949b, (a0.i) this.f19952f, (HashMap) this.h, (ArrayList) this.f19953n, this.f19950c, this.d, (a0.i) this.f19954r, (HashMap) this.f19955s, (a0.i) this.v, (Runnable) this.f19956w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.f19951e = mediaDataController;
        this.f19949b = i10;
        this.f19952f = iVar;
        this.h = hashMap;
        this.f19953n = arrayList;
        this.f19950c = j3;
        this.d = i11;
        this.f19954r = iVar2;
        this.f19955s = hashMap2;
        this.v = iVar3;
        this.f19956w = runnable;
    }
}
