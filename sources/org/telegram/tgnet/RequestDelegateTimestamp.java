package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

public interface RequestDelegateTimestamp {
    void run(TLObject tLObject, TLRPC.TL_error tL_error, long j);
}
