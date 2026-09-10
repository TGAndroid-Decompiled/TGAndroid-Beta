package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface ua0 {
    void K(String str);

    void d(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10);

    Paint.FontMetricsInt o();

    void v(TLRPC.TL_document tL_document, String str, Object obj);

    void z(int i10, int i11, CharSequence charSequence, boolean z10);
}
