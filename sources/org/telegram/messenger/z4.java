package org.telegram.messenger;

import android.text.Spannable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class z4 implements Runnable {
    public final int f20757a;
    public final int f20758b;
    public final int f20759c;
    public final Object d;
    public final Object f20760e;

    public z4(Object obj, int i10, int i11, Serializable serializable, int i12) {
        this.f20757a = i12;
        this.f20760e = obj;
        this.f20758b = i10;
        this.f20759c = i11;
        this.d = serializable;
    }

    @Override
    public final void run() {
        switch (this.f20757a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.f20760e).lambda$fileDidFailedLoad$6((String) this.d, this.f20758b, this.f20759c);
                return;
            case 1:
                CodeHighlighting.c((Spannable) this.f20760e, this.f20758b, this.f20759c, (String) this.d);
                return;
            case 2:
                ((MediaDataController) this.f20760e).lambda$loadReactions$11((List) this.d, this.f20758b, this.f20759c);
                return;
            case 3:
                ((MediaDataController) this.f20760e).lambda$putReactionsToCache$16((ArrayList) this.d, this.f20758b, this.f20759c);
                return;
            case 4:
                ((MessagesController) this.f20760e).lambda$getDifference$350((TLRPC.updates_Difference) this.d, this.f20758b, this.f20759c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.f20760e).lambda$load$0((TLRPC.photos_Photos) this.d, this.f20758b, this.f20759c);
                return;
            case 6:
                ((MessagesController.DialogPhotos) this.f20760e).lambda$load$2((TLRPC.messages_Messages) this.d, this.f20758b, this.f20759c);
                return;
            case 7:
                ((MessagesStorage) this.f20760e).lambda$saveSecretParams$7(this.f20758b, this.f20759c, (byte[]) this.d);
                return;
            case 8:
                int i10 = this.f20759c;
                ((NotificationCenter) this.f20760e).lambda$postNotificationDebounced$2(this.f20758b, (Object[]) this.d, i10);
                return;
            default:
                int i11 = this.f20759c;
                ((SecretChatHelper) this.f20760e).lambda$resendMessages$15(this.f20758b, (TLRPC.EncryptedChat) this.d, i11);
                return;
        }
    }

    public z4(Object obj, int i10, Object obj2, int i11, int i12) {
        this.f20757a = i12;
        this.f20760e = obj;
        this.f20758b = i10;
        this.d = obj2;
        this.f20759c = i11;
    }

    public z4(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f20757a = i12;
        this.f20760e = obj;
        this.d = obj2;
        this.f20758b = i10;
        this.f20759c = i11;
    }
}
