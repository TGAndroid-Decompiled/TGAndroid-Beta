package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f19798a = 0;
    public final int f19799b;
    public final long f19800c;
    public final int d;
    public final BaseController f19801e;
    public final Object f19802f;
    public final Object h;
    public final Object f19803n;
    public final Object f19804r;
    public final Object f19805s;
    public final Object v;
    public final Object f19806w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.f19801e = fileLoader;
        this.f19802f = document;
        this.h = secureDocument;
        this.f19803n = webFile;
        this.f19804r = tL_fileLocationToBeDeprecated;
        this.f19805s = imageLocation;
        this.v = obj;
        this.f19806w = str;
        this.f19800c = j3;
        this.f19799b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19798a) {
            case 0:
                int i10 = this.f19799b;
                int i11 = this.d;
                ((FileLoader) this.f19801e).lambda$loadFile$13((TLRPC.Document) this.f19802f, (SecureDocument) this.h, (WebFile) this.f19803n, (TLRPC.TL_fileLocationToBeDeprecated) this.f19804r, (ImageLocation) this.f19805s, this.v, (String) this.f19806w, this.f19800c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f19801e).lambda$processLoadedStickers$105(this.f19799b, (a0.i) this.f19802f, (HashMap) this.h, (ArrayList) this.f19803n, this.f19800c, this.d, (a0.i) this.f19804r, (HashMap) this.f19805s, (a0.i) this.v, (Runnable) this.f19806w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.f19801e = mediaDataController;
        this.f19799b = i10;
        this.f19802f = iVar;
        this.h = hashMap;
        this.f19803n = arrayList;
        this.f19800c = j3;
        this.d = i11;
        this.f19804r = iVar2;
        this.f19805s = hashMap2;
        this.v = iVar3;
        this.f19806w = runnable;
    }
}
