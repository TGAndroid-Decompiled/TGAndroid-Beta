package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class h01 {
    public int f29024a;
    public int f29025b;
    public int f29026c;
    public TLRPC.MessageEntity d;
    public boolean f29027e;

    public h01() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f29027e) {
            if ((this.f29024a & 2) != 0) {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
            } else {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
        } else {
            int i10 = this.f29024a;
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
        if ((this.f29024a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i12 = this.f29024a;
        if ((i12 & 8) == 0 && (i12 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f29024a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.R9, false);
        }
        int i13 = this.f29024a;
        if ((i13 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
        } else if ((i13 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
        }
    }

    public final void b(h01 h01Var) {
        TLRPC.MessageEntity messageEntity;
        this.f29024a |= h01Var.f29024a;
        if (this.d == null && (messageEntity = h01Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public h01(h01 h01Var) {
        this.f29024a = h01Var.f29024a;
        this.f29025b = h01Var.f29025b;
        this.f29026c = h01Var.f29026c;
        this.d = h01Var.d;
        this.f29027e = h01Var.f29027e;
    }
}
