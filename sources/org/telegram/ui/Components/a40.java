package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public interface a40 {
    void H(float f7);

    void O(boolean z10, boolean z11);

    void T();

    void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize);

    boolean e();

    org.telegram.ui.gs0 getCloseIntoObject();

    String getInitialSearchString();

    boolean x();
}
