package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface ya0 {
    void C(int i10, int i11, CharSequence charSequence, boolean z10);

    void G(String str);

    void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10);

    Paint.FontMetricsInt r();

    void y(TLRPC.TL_document tL_document, String str, Object obj);
}
