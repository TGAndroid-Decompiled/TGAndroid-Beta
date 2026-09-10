package org.telegram.ui.Components;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public interface eh {
    void E(int i10, int i11, int i12, int i13, boolean z10, boolean z11);

    boolean F();

    long I();

    long a();

    long d();

    TLRPC.Chat g();

    ChatObject.Call getGroupCall();

    TLRPC.User i();

    boolean m();

    jo n();

    void o();

    aw0 y();
}
