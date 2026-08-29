package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface ha0 {
    void b(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10);

    Paint.FontMetricsInt n();

    void p(TLRPC.TL_document tL_document, String str, Object obj);

    void r(int i10, int i11, CharSequence charSequence, boolean z10);

    void s(String str);
}
