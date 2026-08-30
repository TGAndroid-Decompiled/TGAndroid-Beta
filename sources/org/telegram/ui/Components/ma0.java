package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface ma0 {
    void a(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10);

    Paint.FontMetricsInt d();

    void i(TLRPC.TL_document tL_document, String str, Object obj);

    void j(int i10, int i11, CharSequence charSequence, boolean z4);

    void k(String str);
}
