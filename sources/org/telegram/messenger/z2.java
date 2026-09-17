package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f19792a = 0;
    public final int f19793b;
    public final long f19794c;
    public final int d;
    public final BaseController f19795e;
    public final Object f19796f;
    public final Object h;
    public final Object f19797n;
    public final Object f19798r;
    public final Object f19799s;
    public final Object v;
    public final Object f19800w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.f19795e = fileLoader;
        this.f19796f = document;
        this.h = secureDocument;
        this.f19797n = webFile;
        this.f19798r = tL_fileLocationToBeDeprecated;
        this.f19799s = imageLocation;
        this.v = obj;
        this.f19800w = str;
        this.f19794c = j3;
        this.f19793b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19792a) {
            case 0:
                int i10 = this.f19793b;
                int i11 = this.d;
                ((FileLoader) this.f19795e).lambda$loadFile$13((TLRPC.Document) this.f19796f, (SecureDocument) this.h, (WebFile) this.f19797n, (TLRPC.TL_fileLocationToBeDeprecated) this.f19798r, (ImageLocation) this.f19799s, this.v, (String) this.f19800w, this.f19794c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f19795e).lambda$processLoadedStickers$105(this.f19793b, (a0.i) this.f19796f, (HashMap) this.h, (ArrayList) this.f19797n, this.f19794c, this.d, (a0.i) this.f19798r, (HashMap) this.f19799s, (a0.i) this.v, (Runnable) this.f19800w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.f19795e = mediaDataController;
        this.f19793b = i10;
        this.f19796f = iVar;
        this.h = hashMap;
        this.f19797n = arrayList;
        this.f19794c = j3;
        this.d = i11;
        this.f19798r = iVar2;
        this.f19799s = hashMap2;
        this.v = iVar3;
        this.f19800w = runnable;
    }
}
