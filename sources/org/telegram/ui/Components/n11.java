package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class n11 {
    public int f28925a;
    public int f28926b;
    public int f28927c;
    public TLRPC.MessageEntity d;
    public boolean f28928e;

    public n11() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f28928e) {
            if ((this.f28925a & 2) != 0) {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
            } else {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
        } else {
            int i10 = this.f28925a;
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
        if ((this.f28925a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i12 = this.f28925a;
        if ((i12 & 8) == 0 && (i12 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f28925a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.R9, false);
        }
        int i13 = this.f28925a;
        if ((i13 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21068q7, false));
        } else if ((i13 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false));
        }
    }

    public final void b(n11 n11Var) {
        TLRPC.MessageEntity messageEntity;
        this.f28925a |= n11Var.f28925a;
        if (this.d == null && (messageEntity = n11Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public n11(n11 n11Var) {
        this.f28925a = n11Var.f28925a;
        this.f28926b = n11Var.f28926b;
        this.f28927c = n11Var.f28927c;
        this.d = n11Var.d;
        this.f28928e = n11Var.f28928e;
    }
}
