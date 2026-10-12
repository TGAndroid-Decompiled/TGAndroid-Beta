package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class p11 {
    public int f28135a;
    public int f28136b;
    public int f28137c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public p11() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.e) {
            if ((this.f28135a & 2) != 0) {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
            } else {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
        } else {
            int i10 = this.f28135a;
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
        if ((this.f28135a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i12 = this.f28135a;
        if ((i12 & 8) == 0 && (i12 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f28135a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.R9, false);
        }
        int i13 = this.f28135a;
        if ((i13 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
        } else if ((i13 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false));
        }
    }

    public final void b(p11 p11Var) {
        TLRPC.MessageEntity messageEntity;
        this.f28135a |= p11Var.f28135a;
        if (this.d == null && (messageEntity = p11Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public p11(p11 p11Var) {
        this.f28135a = p11Var.f28135a;
        this.f28136b = p11Var.f28136b;
        this.f28137c = p11Var.f28137c;
        this.d = p11Var.d;
        this.e = p11Var.e;
    }
}
