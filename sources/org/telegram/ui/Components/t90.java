package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface t90 {
    void A(String str);

    void a(TLRPC.BotInlineResult botInlineResult, boolean z10, int i9);

    Paint.FontMetricsInt h();

    void p(TLRPC.TL_document tL_document, String str, Object obj);

    void y(int i9, int i10, CharSequence charSequence, boolean z10);
}
