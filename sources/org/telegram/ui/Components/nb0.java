package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface nb0 {
    void e(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10);

    Paint.FontMetricsInt f();

    void i(TLRPC.TL_document tL_document, String str, Object obj);

    void k(int i10, int i11, CharSequence charSequence, boolean z10);

    void m(String str);
}
