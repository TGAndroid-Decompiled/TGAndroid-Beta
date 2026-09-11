package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface la0 {
    void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10);

    Paint.FontMetricsInt k();

    void n(TLRPC.TL_document tL_document, String str, Object obj);

    void v(int i10, int i11, CharSequence charSequence, boolean z10);

    void x(String str);
}
