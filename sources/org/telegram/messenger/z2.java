package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f18009a = 0;
    public final int f18010b;
    public final long f18011c;
    public final int d;
    public final BaseController e;
    public final Object f18012f;
    public final Object h;
    public final Object f18013n;
    public final Object f18014r;
    public final Object f18015s;
    public final Object v;
    public final Object f18016w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.e = fileLoader;
        this.f18012f = document;
        this.h = secureDocument;
        this.f18013n = webFile;
        this.f18014r = tL_fileLocationToBeDeprecated;
        this.f18015s = imageLocation;
        this.v = obj;
        this.f18016w = str;
        this.f18011c = j3;
        this.f18010b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18009a) {
            case 0:
                int i10 = this.f18010b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18012f, (SecureDocument) this.h, (WebFile) this.f18013n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18014r, (ImageLocation) this.f18015s, this.v, (String) this.f18016w, this.f18011c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18010b, (a0.i) this.f18012f, (HashMap) this.h, (ArrayList) this.f18013n, this.f18011c, this.d, (a0.i) this.f18014r, (HashMap) this.f18015s, (a0.i) this.v, (Runnable) this.f18016w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18010b = i10;
        this.f18012f = iVar;
        this.h = hashMap;
        this.f18013n = arrayList;
        this.f18011c = j3;
        this.d = i11;
        this.f18014r = iVar2;
        this.f18015s = hashMap2;
        this.v = iVar3;
        this.f18016w = runnable;
    }
}
