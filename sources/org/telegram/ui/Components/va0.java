package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface va0 {
    void M(int i10, int i11, CharSequence charSequence, boolean z10);

    void P(String str);

    void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10);

    Paint.FontMetricsInt t();

    void z(TLRPC.TL_document tL_document, String str, Object obj);
}
