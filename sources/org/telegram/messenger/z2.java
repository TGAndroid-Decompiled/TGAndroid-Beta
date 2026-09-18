package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f18033a = 0;
    public final int f18034b;
    public final long f18035c;
    public final int d;
    public final BaseController e;
    public final Object f18036f;
    public final Object h;
    public final Object f18037n;
    public final Object f18038r;
    public final Object f18039s;
    public final Object v;
    public final Object f18040w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.e = fileLoader;
        this.f18036f = document;
        this.h = secureDocument;
        this.f18037n = webFile;
        this.f18038r = tL_fileLocationToBeDeprecated;
        this.f18039s = imageLocation;
        this.v = obj;
        this.f18040w = str;
        this.f18035c = j3;
        this.f18034b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18033a) {
            case 0:
                int i10 = this.f18034b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18036f, (SecureDocument) this.h, (WebFile) this.f18037n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18038r, (ImageLocation) this.f18039s, this.v, (String) this.f18040w, this.f18035c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18034b, (a0.i) this.f18036f, (HashMap) this.h, (ArrayList) this.f18037n, this.f18035c, this.d, (a0.i) this.f18038r, (HashMap) this.f18039s, (a0.i) this.v, (Runnable) this.f18040w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18034b = i10;
        this.f18036f = iVar;
        this.h = hashMap;
        this.f18037n = arrayList;
        this.f18035c = j3;
        this.d = i11;
        this.f18038r = iVar2;
        this.f18039s = hashMap2;
        this.v = iVar3;
        this.f18040w = runnable;
    }
}
