package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface eb0 {
    void B(TLRPC.TL_document tL_document, String str, Object obj);

    void I(int i10, int i11, CharSequence charSequence, boolean z10);

    void L(String str);

    void i(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10);

    Paint.FontMetricsInt v();
}
