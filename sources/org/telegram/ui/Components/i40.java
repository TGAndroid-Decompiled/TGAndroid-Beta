package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

public interface i40 {
    void E(float f10);

    void J(boolean z10, boolean z11);

    void P();

    void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize);

    boolean e();

    org.telegram.ui.cu0 getCloseIntoObject();

    String getInitialSearchString();

    boolean v();
}
