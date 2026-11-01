package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public interface a40 {
    void I(float f7);

    void P(boolean z10, boolean z11);

    void U();

    void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize);

    boolean e();

    org.telegram.ui.fs0 getCloseIntoObject();

    String getInitialSearchString();

    boolean y();
}
