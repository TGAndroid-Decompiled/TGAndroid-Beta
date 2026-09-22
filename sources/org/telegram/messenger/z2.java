package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f18265a = 0;
    public final int f18266b;
    public final long f18267c;
    public final int d;
    public final BaseController e;
    public final Object f18268f;
    public final Object h;
    public final Object f18269n;
    public final Object f18270r;
    public final Object f18271s;
    public final Object v;
    public final Object f18272w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.e = fileLoader;
        this.f18268f = document;
        this.h = secureDocument;
        this.f18269n = webFile;
        this.f18270r = tL_fileLocationToBeDeprecated;
        this.f18271s = imageLocation;
        this.v = obj;
        this.f18272w = str;
        this.f18267c = j3;
        this.f18266b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18265a) {
            case 0:
                int i10 = this.f18266b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18268f, (SecureDocument) this.h, (WebFile) this.f18269n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18270r, (ImageLocation) this.f18271s, this.v, (String) this.f18272w, this.f18267c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18266b, (a0.i) this.f18268f, (HashMap) this.h, (ArrayList) this.f18269n, this.f18267c, this.d, (a0.i) this.f18270r, (HashMap) this.f18271s, (a0.i) this.v, (Runnable) this.f18272w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18266b = i10;
        this.f18268f = iVar;
        this.h = hashMap;
        this.f18269n = arrayList;
        this.f18267c = j3;
        this.d = i11;
        this.f18270r = iVar2;
        this.f18271s = hashMap2;
        this.v = iVar3;
        this.f18272w = runnable;
    }
}
