package org.telegram.ui.Stories.recorder;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ScannedLinkPreview$ResolvedLink$$ExternalSyntheticLambda0 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public ScannedLinkPreview$ResolvedLink$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void accept(Object obj) {
        Utilities.Callback callback;
        switch (this.$r8$classId) {
            case 0:
                Long l = (Long) obj;
                ScannedLinkPreview$$ExternalSyntheticLambda0 scannedLinkPreview$$ExternalSyntheticLambda0 = (ScannedLinkPreview$$ExternalSyntheticLambda0) this.f$0;
                if (l != null) {
                    TLObject userOrChat = ((MessagesController) this.f$1).getUserOrChat(l.longValue());
                    boolean z = userOrChat instanceof TLRPC.User;
                    String str = (String) this.f$2;
                    if (z) {
                        TLRPC.User user = (TLRPC.User) userOrChat;
                        scannedLinkPreview$$ExternalSyntheticLambda0.run(user != null ? new ScannedLinkPreview.ResolvedLink.AnonymousClass1(str, user) : null);
                    } else if (userOrChat instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) userOrChat;
                        scannedLinkPreview$$ExternalSyntheticLambda0.run(chat != null ? new ScannedLinkPreview.ResolvedLink.AnonymousClass2(str, chat) : null);
                    }
                } else {
                    scannedLinkPreview$$ExternalSyntheticLambda0.run(null);
                }
                break;
            default:
                ((AlertDialog) this.f$0).dismiss();
                if (((Boolean) obj).booleanValue() && (callback = (Utilities.Callback) this.f$1) != null) {
                    callback.run((TLRPC.InputPeer) this.f$2);
                    break;
                }
                break;
        }
    }
}
