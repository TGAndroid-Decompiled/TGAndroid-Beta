package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f19771a = 0;
    public final int f19772b;
    public final long f19773c;
    public final int d;
    public final BaseController f19774e;
    public final Object f19775f;
    public final Object h;
    public final Object f19776n;
    public final Object f19777r;
    public final Object f19778s;
    public final Object v;
    public final Object f19779w;

    public z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.f19774e = fileLoader;
        this.f19775f = document;
        this.h = secureDocument;
        this.f19776n = webFile;
        this.f19777r = tL_fileLocationToBeDeprecated;
        this.f19778s = imageLocation;
        this.v = obj;
        this.f19779w = str;
        this.f19773c = j3;
        this.f19772b = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19771a) {
            case 0:
                int i10 = this.f19772b;
                int i11 = this.d;
                ((FileLoader) this.f19774e).lambda$loadFile$13((TLRPC.Document) this.f19775f, (SecureDocument) this.h, (WebFile) this.f19776n, (TLRPC.TL_fileLocationToBeDeprecated) this.f19777r, (ImageLocation) this.f19778s, this.v, (String) this.f19779w, this.f19773c, i10, i11);
                return;
            default:
                ((MediaDataController) this.f19774e).lambda$processLoadedStickers$105(this.f19772b, (a0.i) this.f19775f, (HashMap) this.h, (ArrayList) this.f19776n, this.f19773c, this.d, (a0.i) this.f19777r, (HashMap) this.f19778s, (a0.i) this.v, (Runnable) this.f19779w);
                return;
        }
    }

    public z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.f19774e = mediaDataController;
        this.f19772b = i10;
        this.f19775f = iVar;
        this.h = hashMap;
        this.f19776n = arrayList;
        this.f19773c = j3;
        this.d = i11;
        this.f19777r = iVar2;
        this.f19778s = hashMap2;
        this.v = iVar3;
        this.f19779w = runnable;
    }
}
