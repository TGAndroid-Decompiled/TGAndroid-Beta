package org.telegram.messenger;

import android.text.Spannable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class z4 implements Runnable {
    public final int f19105a;
    public final int f19106b;
    public final int f19107c;
    public final Object d;
    public final Object e;

    public z4(Object obj, int i10, int i11, Serializable serializable, int i12) {
        this.f19105a = i12;
        this.e = obj;
        this.f19106b = i10;
        this.f19107c = i11;
        this.d = serializable;
    }

    @Override
    public final void run() {
        switch (this.f19105a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.e).lambda$fileDidFailedLoad$6((String) this.d, this.f19106b, this.f19107c);
                return;
            case 1:
                CodeHighlighting.c((Spannable) this.e, this.f19106b, this.f19107c, (String) this.d);
                return;
            case 2:
                ((MediaDataController) this.e).lambda$loadReactions$11((List) this.d, this.f19106b, this.f19107c);
                return;
            case 3:
                ((MediaDataController) this.e).lambda$putReactionsToCache$16((ArrayList) this.d, this.f19106b, this.f19107c);
                return;
            case 4:
                ((MessagesController) this.e).lambda$getDifference$350((TLRPC.updates_Difference) this.d, this.f19106b, this.f19107c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.e).lambda$load$0((TLRPC.photos_Photos) this.d, this.f19106b, this.f19107c);
                return;
            case 6:
                ((MessagesController.DialogPhotos) this.e).lambda$load$2((TLRPC.messages_Messages) this.d, this.f19106b, this.f19107c);
                return;
            case 7:
                ((MessagesStorage) this.e).lambda$saveSecretParams$7(this.f19106b, this.f19107c, (byte[]) this.d);
                return;
            case 8:
                int i10 = this.f19107c;
                ((NotificationCenter) this.e).lambda$postNotificationDebounced$2(this.f19106b, (Object[]) this.d, i10);
                return;
            default:
                int i11 = this.f19107c;
                ((SecretChatHelper) this.e).lambda$resendMessages$15(this.f19106b, (TLRPC.EncryptedChat) this.d, i11);
                return;
        }
    }

    public z4(Object obj, int i10, Object obj2, int i11, int i12) {
        this.f19105a = i12;
        this.e = obj;
        this.f19106b = i10;
        this.d = obj2;
        this.f19107c = i11;
    }

    public z4(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f19105a = i12;
        this.e = obj;
        this.d = obj2;
        this.f19106b = i10;
        this.f19107c = i11;
    }
}
