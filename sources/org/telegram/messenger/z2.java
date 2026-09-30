package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f18275a = 0;
    public final int f18276b;
    public final long f18277c;
    public final int d;
    public final BaseController e;
    public final Object f18278f;
    public final Object h;
    public final Object f18279n;
    public final Object f18280r;
    public final Object f18281s;
    public final Object v;
    public final Object f18282w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.e = fileLoader;
        this.f18278f = document;
        this.h = secureDocument;
        this.f18279n = webFile;
        this.f18280r = tL_fileLocationToBeDeprecated;
        this.f18281s = imageLocation;
        this.v = obj;
        this.f18282w = str;
        this.f18277c = j3;
        this.f18276b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18275a) {
            case 0:
                int i10 = this.f18276b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18278f, (SecureDocument) this.h, (WebFile) this.f18279n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18280r, (ImageLocation) this.f18281s, this.v, (String) this.f18282w, this.f18277c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18276b, (a0.i) this.f18278f, (HashMap) this.h, (ArrayList) this.f18279n, this.f18277c, this.d, (a0.i) this.f18280r, (HashMap) this.f18281s, (a0.i) this.v, (Runnable) this.f18282w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18276b = i10;
        this.f18278f = iVar;
        this.h = hashMap;
        this.f18279n = arrayList;
        this.f18277c = j3;
        this.d = i11;
        this.f18280r = iVar2;
        this.f18281s = hashMap2;
        this.v = iVar3;
        this.f18282w = runnable;
    }
}
