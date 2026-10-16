package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface lb0 {
    void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10);

    Paint.FontMetricsInt i();

    void m(TLRPC.TL_document tL_document, String str, Object obj);

    void r(int i10, int i11, CharSequence charSequence, boolean z10);

    void y(String str);
}
