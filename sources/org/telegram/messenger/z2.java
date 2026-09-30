package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f18260a = 0;
    public final int f18261b;
    public final long f18262c;
    public final int d;
    public final BaseController e;
    public final Object f18263f;
    public final Object h;
    public final Object f18264n;
    public final Object f18265r;
    public final Object f18266s;
    public final Object v;
    public final Object f18267w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.e = fileLoader;
        this.f18263f = document;
        this.h = secureDocument;
        this.f18264n = webFile;
        this.f18265r = tL_fileLocationToBeDeprecated;
        this.f18266s = imageLocation;
        this.v = obj;
        this.f18267w = str;
        this.f18262c = j3;
        this.f18261b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18260a) {
            case 0:
                int i10 = this.f18261b;
                int i11 = this.d;
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f18263f, (SecureDocument) this.h, (WebFile) this.f18264n, (TLRPC.TL_fileLocationToBeDeprecated) this.f18265r, (ImageLocation) this.f18266s, this.v, (String) this.f18267w, this.f18262c, i10, i11);
                return;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.f18261b, (a0.i) this.f18263f, (HashMap) this.h, (ArrayList) this.f18264n, this.f18262c, this.d, (a0.i) this.f18265r, (HashMap) this.f18266s, (a0.i) this.v, (Runnable) this.f18267w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.f18261b = i10;
        this.f18263f = iVar;
        this.h = hashMap;
        this.f18264n = arrayList;
        this.f18262c = j3;
        this.d = i11;
        this.f18265r = iVar2;
        this.f18266s = hashMap2;
        this.v = iVar3;
        this.f18267w = runnable;
    }
}
