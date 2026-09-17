package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f19819a = 0;
    public final int f19820b;
    public final long f19821c;
    public final int d;
    public final BaseController f19822e;
    public final Object f19823f;
    public final Object h;
    public final Object f19824n;
    public final Object f19825r;
    public final Object f19826s;
    public final Object v;
    public final Object f19827w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.f19822e = fileLoader;
        this.f19823f = document;
        this.h = secureDocument;
        this.f19824n = webFile;
        this.f19825r = tL_fileLocationToBeDeprecated;
        this.f19826s = imageLocation;
        this.v = obj;
        this.f19827w = str;
        this.f19821c = j3;
        this.f19820b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19819a) {
            case 0:
                int i10 = this.f19820b;
                int i11 = this.d;
                ((FileLoader) this.f19822e).lambda$loadFile$13((TLRPC.Document) this.f19823f, (SecureDocument) this.h, (WebFile) this.f19824n, (TLRPC.TL_fileLocationToBeDeprecated) this.f19825r, (ImageLocation) this.f19826s, this.v, (String) this.f19827w, this.f19821c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f19822e).lambda$processLoadedStickers$105(this.f19820b, (a0.i) this.f19823f, (HashMap) this.h, (ArrayList) this.f19824n, this.f19821c, this.d, (a0.i) this.f19825r, (HashMap) this.f19826s, (a0.i) this.v, (Runnable) this.f19827w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.f19822e = mediaDataController;
        this.f19820b = i10;
        this.f19823f = iVar;
        this.h = hashMap;
        this.f19824n = arrayList;
        this.f19821c = j3;
        this.d = i11;
        this.f19825r = iVar2;
        this.f19826s = hashMap2;
        this.v = iVar3;
        this.f19827w = runnable;
    }
}
