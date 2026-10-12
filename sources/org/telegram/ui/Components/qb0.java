package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface qb0 {
    void a(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10);

    Paint.FontMetricsInt b();

    void f(TLRPC.TL_document tL_document, String str, Object obj);

    void i(int i10, int i11, CharSequence charSequence, boolean z10);

    void s(String str);
}
