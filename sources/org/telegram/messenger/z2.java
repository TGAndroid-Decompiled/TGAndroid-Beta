package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f18207a = 0;
    public final int f18208b;
    public final long f18209c;
    public final int d;
    public final BaseController e;
    public final Object f18210f;
    public final Object h;
    public final Object f18211n;
    public final Object f18212r;
    public final Object f18213s;
    public final Object v;
    public final Object f18214w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.e = fileLoader;
        this.f18210f = document;
        this.h = secureDocument;
        this.f18211n = webFile;
        this.f18212r = tL_fileLocationToBeDeprecated;
        this.f18213s = imageLocation;
        this.v = obj;
        this.f18214w = str;
        this.f18209c = j3;
        this.f18208b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18207a) {
            case 0:
                int i10 = this.f18208b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18210f, (SecureDocument) this.h, (WebFile) this.f18211n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18212r, (ImageLocation) this.f18213s, this.v, (String) this.f18214w, this.f18209c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18208b, (a0.i) this.f18210f, (HashMap) this.h, (ArrayList) this.f18211n, this.f18209c, this.d, (a0.i) this.f18212r, (HashMap) this.f18213s, (a0.i) this.v, (Runnable) this.f18214w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18208b = i10;
        this.f18210f = iVar;
        this.h = hashMap;
        this.f18211n = arrayList;
        this.f18209c = j3;
        this.d = i11;
        this.f18212r = iVar2;
        this.f18213s = hashMap2;
        this.v = iVar3;
        this.f18214w = runnable;
    }
}
