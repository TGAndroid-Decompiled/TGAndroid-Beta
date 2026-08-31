package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface oa0 {
    void N(TLRPC.TL_document tL_document, String str, Object obj);

    void U(int i10, int i11, CharSequence charSequence, boolean z4);

    void X(String str);

    void l(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10);

    Paint.FontMetricsInt w();
}
