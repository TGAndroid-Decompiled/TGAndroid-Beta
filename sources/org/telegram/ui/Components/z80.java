package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface z80 {
    void e(TLRPC.BotInlineResult botInlineResult, boolean z10, int i3);

    Paint.FontMetricsInt n();

    void q(TLRPC.TL_document tL_document, String str, Object obj);

    void t(int i3, int i10, CharSequence charSequence, boolean z10);

    void w(String str);
}
