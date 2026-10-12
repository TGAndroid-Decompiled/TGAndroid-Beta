package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface lb0 {
    void E(String str);

    void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10);

    Paint.FontMetricsInt m();

    void r(TLRPC.TL_document tL_document, String str, Object obj);

    void y(int i10, int i11, CharSequence charSequence, boolean z10);
}
