package org.telegram.tgnet;

public interface RequestDelegateTimestamp {
    void run(TLObject tLObject, TLRPC.TL_error tL_error, long j);
}
