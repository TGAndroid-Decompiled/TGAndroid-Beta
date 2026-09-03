package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public interface na0 {
    void E(String str);

    void a(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10);

    Paint.FontMetricsInt f();

    void j(TLRPC.TL_document tL_document, String str, Object obj);

    void v(int i10, int i11, CharSequence charSequence, boolean z4);
}
