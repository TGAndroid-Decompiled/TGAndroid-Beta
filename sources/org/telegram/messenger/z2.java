package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f18257a = 0;
    public final int f18258b;
    public final long f18259c;
    public final int d;
    public final BaseController e;
    public final Object f18260f;
    public final Object h;
    public final Object f18261n;
    public final Object f18262r;
    public final Object f18263s;
    public final Object v;
    public final Object f18264w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.e = fileLoader;
        this.f18260f = document;
        this.h = secureDocument;
        this.f18261n = webFile;
        this.f18262r = tL_fileLocationToBeDeprecated;
        this.f18263s = imageLocation;
        this.v = obj;
        this.f18264w = str;
        this.f18259c = j3;
        this.f18258b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18257a) {
            case 0:
                int i10 = this.f18258b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18260f, (SecureDocument) this.h, (WebFile) this.f18261n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18262r, (ImageLocation) this.f18263s, this.v, (String) this.f18264w, this.f18259c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18258b, (a0.i) this.f18260f, (HashMap) this.h, (ArrayList) this.f18261n, this.f18259c, this.d, (a0.i) this.f18262r, (HashMap) this.f18263s, (a0.i) this.v, (Runnable) this.f18264w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18258b = i10;
        this.f18260f = iVar;
        this.h = hashMap;
        this.f18261n = arrayList;
        this.f18259c = j3;
        this.d = i11;
        this.f18262r = iVar2;
        this.f18263s = hashMap2;
        this.v = iVar3;
        this.f18264w = runnable;
    }
}
