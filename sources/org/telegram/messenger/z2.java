package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f19950a = 0;
    public final int f19951b;
    public final long f19952c;
    public final int d;
    public final BaseController f19953e;
    public final Object f19954f;
    public final Object h;
    public final Object f19955n;
    public final Object f19956r;
    public final Object f19957s;
    public final Object v;
    public final Object f19958w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.f19953e = fileLoader;
        this.f19954f = document;
        this.h = secureDocument;
        this.f19955n = webFile;
        this.f19956r = tL_fileLocationToBeDeprecated;
        this.f19957s = imageLocation;
        this.v = obj;
        this.f19958w = str;
        this.f19952c = j3;
        this.f19951b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19950a) {
            case 0:
                int i10 = this.f19951b;
                int i11 = this.d;
                ((FileLoader) this.f19953e).lambda$loadFile$13((TLRPC.Document) this.f19954f, (SecureDocument) this.h, (WebFile) this.f19955n, (TLRPC.TL_fileLocationToBeDeprecated) this.f19956r, (ImageLocation) this.f19957s, this.v, (String) this.f19958w, this.f19952c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f19953e).lambda$processLoadedStickers$105(this.f19951b, (a0.i) this.f19954f, (HashMap) this.h, (ArrayList) this.f19955n, this.f19952c, this.d, (a0.i) this.f19956r, (HashMap) this.f19957s, (a0.i) this.v, (Runnable) this.f19958w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.f19953e = mediaDataController;
        this.f19951b = i10;
        this.f19954f = iVar;
        this.h = hashMap;
        this.f19955n = arrayList;
        this.f19952c = j3;
        this.d = i11;
        this.f19956r = iVar2;
        this.f19957s = hashMap2;
        this.v = iVar3;
        this.f19958w = runnable;
    }
}
