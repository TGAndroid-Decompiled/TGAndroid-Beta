package org.telegram.ui;

import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public interface hq0 {
    boolean a(int i3);

    File b(int i3);

    String c(int i3);

    TLObject d(int i3);

    boolean e(int i3);

    TLRPC.PhotoSize f(TLObject tLObject, int[] iArr);

    Object g();

    TL_iv.PageBlock get(int i3);

    List getAll();

    void h(TL_iv.PageBlock pageBlock);

    CharSequence i(int i3);

    int j();
}
