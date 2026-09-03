package org.telegram.messenger;

import android.text.Spannable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class z4 implements Runnable {
    public final int f20759a;
    public final int f20760b;
    public final int f20761c;
    public final Object d;
    public final Object f20762e;

    public z4(Object obj, int i10, int i11, Serializable serializable, int i12) {
        this.f20759a = i12;
        this.f20762e = obj;
        this.f20760b = i10;
        this.f20761c = i11;
        this.d = serializable;
    }

    @Override
    public final void run() {
        switch (this.f20759a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.f20762e).lambda$fileDidFailedLoad$6((String) this.d, this.f20760b, this.f20761c);
                return;
            case 1:
                CodeHighlighting.c((Spannable) this.f20762e, this.f20760b, this.f20761c, (String) this.d);
                return;
            case 2:
                ((MediaDataController) this.f20762e).lambda$loadReactions$11((List) this.d, this.f20760b, this.f20761c);
                return;
            case 3:
                ((MediaDataController) this.f20762e).lambda$putReactionsToCache$16((ArrayList) this.d, this.f20760b, this.f20761c);
                return;
            case 4:
                ((MessagesController) this.f20762e).lambda$getDifference$350((TLRPC.updates_Difference) this.d, this.f20760b, this.f20761c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.f20762e).lambda$load$0((TLRPC.photos_Photos) this.d, this.f20760b, this.f20761c);
                return;
            case 6:
                ((MessagesController.DialogPhotos) this.f20762e).lambda$load$2((TLRPC.messages_Messages) this.d, this.f20760b, this.f20761c);
                return;
            case 7:
                ((MessagesStorage) this.f20762e).lambda$saveSecretParams$7(this.f20760b, this.f20761c, (byte[]) this.d);
                return;
            case 8:
                int i10 = this.f20761c;
                ((NotificationCenter) this.f20762e).lambda$postNotificationDebounced$2(this.f20760b, (Object[]) this.d, i10);
                return;
            default:
                int i11 = this.f20761c;
                ((SecretChatHelper) this.f20762e).lambda$resendMessages$15(this.f20760b, (TLRPC.EncryptedChat) this.d, i11);
                return;
        }
    }

    public z4(Object obj, int i10, Object obj2, int i11, int i12) {
        this.f20759a = i12;
        this.f20762e = obj;
        this.f20760b = i10;
        this.d = obj2;
        this.f20761c = i11;
    }

    public z4(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f20759a = i12;
        this.f20762e = obj;
        this.d = obj2;
        this.f20760b = i10;
        this.f20761c = i11;
    }
}
