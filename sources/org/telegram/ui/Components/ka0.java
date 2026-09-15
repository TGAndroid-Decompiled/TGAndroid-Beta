package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface ka0 {
    void A(TLRPC.TL_document tL_document, String str, Object obj);

    void L(int i10, int i11, CharSequence charSequence, boolean z10);

    void O(String str);

    void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10);

    Paint.FontMetricsInt w();
}
