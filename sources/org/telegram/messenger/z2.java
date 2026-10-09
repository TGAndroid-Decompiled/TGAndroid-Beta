package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f19947a = 0;
    public final int f19948b;
    public final long f19949c;
    public final int d;
    public final BaseController f19950e;
    public final Object f19951f;
    public final Object h;
    public final Object f19952n;
    public final Object f19953r;
    public final Object f19954s;
    public final Object v;
    public final Object f19955w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.f19950e = fileLoader;
        this.f19951f = document;
        this.h = secureDocument;
        this.f19952n = webFile;
        this.f19953r = tL_fileLocationToBeDeprecated;
        this.f19954s = imageLocation;
        this.v = obj;
        this.f19955w = str;
        this.f19949c = j3;
        this.f19948b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19947a) {
            case 0:
                int i10 = this.f19948b;
                int i11 = this.d;
                ((FileLoader) this.f19950e).lambda$loadFile$13((TLRPC.Document) this.f19951f, (SecureDocument) this.h, (WebFile) this.f19952n, (TLRPC.TL_fileLocationToBeDeprecated) this.f19953r, (ImageLocation) this.f19954s, this.v, (String) this.f19955w, this.f19949c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f19950e).lambda$processLoadedStickers$105(this.f19948b, (a0.i) this.f19951f, (HashMap) this.h, (ArrayList) this.f19952n, this.f19949c, this.d, (a0.i) this.f19953r, (HashMap) this.f19954s, (a0.i) this.v, (Runnable) this.f19955w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.f19950e = mediaDataController;
        this.f19948b = i10;
        this.f19951f = iVar;
        this.h = hashMap;
        this.f19952n = arrayList;
        this.f19949c = j3;
        this.d = i11;
        this.f19953r = iVar2;
        this.f19954s = hashMap2;
        this.v = iVar3;
        this.f19955w = runnable;
    }
}
