package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class z4 implements Runnable {
    public final int f17117a;
    public final boolean f17118b;
    public final int f17119c;
    public final Object d;
    public final Object e;

    public z4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f17117a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f17118b = z10;
        this.f17119c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17117a) {
            case 0:
                boolean z10 = this.f17118b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f17119c, (String) this.e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.e, this.f17118b, this.f17119c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f17119c, this.f17118b, (Utilities.Callback) this.e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.e, this.f17118b, this.f17119c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$33(this.f17119c, this.f17118b, (Runnable) this.e);
                return;
        }
    }

    public z4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f17117a = i11;
        this.d = baseController;
        this.f17119c = i10;
        this.f17118b = z10;
        this.e = obj;
    }

    public z4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f17117a = 0;
        this.d = anonymousClass5;
        this.f17119c = i10;
        this.e = str;
        this.f17118b = z10;
    }
}
