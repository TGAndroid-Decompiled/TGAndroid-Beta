package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f18259a = 0;
    public final int f18260b;
    public final long f18261c;
    public final int d;
    public final BaseController e;
    public final Object f18262f;
    public final Object h;
    public final Object f18263n;
    public final Object f18264r;
    public final Object f18265s;
    public final Object v;
    public final Object f18266w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.e = fileLoader;
        this.f18262f = document;
        this.h = secureDocument;
        this.f18263n = webFile;
        this.f18264r = tL_fileLocationToBeDeprecated;
        this.f18265s = imageLocation;
        this.v = obj;
        this.f18266w = str;
        this.f18261c = j3;
        this.f18260b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18259a) {
            case 0:
                int i10 = this.f18260b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18262f, (SecureDocument) this.h, (WebFile) this.f18263n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18264r, (ImageLocation) this.f18265s, this.v, (String) this.f18266w, this.f18261c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18260b, (a0.i) this.f18262f, (HashMap) this.h, (ArrayList) this.f18263n, this.f18261c, this.d, (a0.i) this.f18264r, (HashMap) this.f18265s, (a0.i) this.v, (Runnable) this.f18266w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18260b = i10;
        this.f18262f = iVar;
        this.h = hashMap;
        this.f18263n = arrayList;
        this.f18261c = j3;
        this.d = i11;
        this.f18264r = iVar2;
        this.f18265s = hashMap2;
        this.v = iVar3;
        this.f18266w = runnable;
    }
}
