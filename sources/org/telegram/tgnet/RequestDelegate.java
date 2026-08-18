package org.telegram.tgnet;

public interface RequestDelegate {
    void run(TLObject tLObject, TLRPC.TL_error tL_error);
}
