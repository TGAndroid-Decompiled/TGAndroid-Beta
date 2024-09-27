package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

public interface RequestDelegate {
    void run(TLObject tLObject, TLRPC.TL_error tL_error);
}
