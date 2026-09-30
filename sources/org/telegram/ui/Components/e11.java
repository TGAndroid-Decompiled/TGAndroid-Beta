package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class e11 {
    public int f23824a;
    public int f23825b;
    public int f23826c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public e11() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.e) {
            if ((this.f23824a & 2) != 0) {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
            } else {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
        } else {
            int i10 = this.f23824a;
            if ((i10 & 4) == 0 && (i10 & 2048) == 0) {
                int i11 = i10 & 1;
                if (i11 != 0 && (i10 & 2) != 0) {
                    typeface = AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
                } else if (i11 != 0) {
                    typeface = AndroidUtilities.bold();
                } else if ((i10 & 2) != 0) {
                    typeface = AndroidUtilities.getTypeface("fonts/ritalic.ttf");
                } else {
                    typeface = null;
                }
            } else {
                typeface = Typeface.MONOSPACE;
            }
        }
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        if ((this.f23824a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i12 = this.f23824a;
        if ((i12 & 8) == 0 && (i12 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f23824a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.R9, false);
        }
        int i13 = this.f23824a;
        if ((i13 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19315q7, false));
        } else if ((i13 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false));
        }
    }

    public final void b(e11 e11Var) {
        TLRPC.MessageEntity messageEntity;
        this.f23824a |= e11Var.f23824a;
        if (this.d == null && (messageEntity = e11Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public e11(e11 e11Var) {
        this.f23824a = e11Var.f23824a;
        this.f23825b = e11Var.f23825b;
        this.f23826c = e11Var.f23826c;
        this.d = e11Var.d;
        this.e = e11Var.e;
    }
}
