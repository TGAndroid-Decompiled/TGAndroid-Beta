package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class q11 {
    public int f28163a;
    public int f28164b;
    public int f28165c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public q11() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.e) {
            if ((this.f28163a & 2) != 0) {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
            } else {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
        } else {
            int i10 = this.f28163a;
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
        if ((this.f28163a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i12 = this.f28163a;
        if ((i12 & 8) == 0 && (i12 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f28163a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.R9, false);
        }
        int i13 = this.f28163a;
        if ((i13 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
        } else if ((i13 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false));
        }
    }

    public final void b(q11 q11Var) {
        TLRPC.MessageEntity messageEntity;
        this.f28163a |= q11Var.f28163a;
        if (this.d == null && (messageEntity = q11Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public q11(q11 q11Var) {
        this.f28163a = q11Var.f28163a;
        this.f28164b = q11Var.f28164b;
        this.f28165c = q11Var.f28165c;
        this.d = q11Var.d;
        this.e = q11Var.e;
    }
}
