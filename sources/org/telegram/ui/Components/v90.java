package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface v90 {
    void L(TLRPC.TL_document tL_document, String str, Object obj);

    void N(int i10, int i11, CharSequence charSequence, boolean z10);

    void X(String str);

    void m(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10);

    Paint.FontMetricsInt w();
}
