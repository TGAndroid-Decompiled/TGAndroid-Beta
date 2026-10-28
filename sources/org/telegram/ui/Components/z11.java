package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class z11 {
    public int f35208a;
    public int f35209b;
    public int f35210c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public z11() {
    }

    public final void a(TextPaint textPaint) {
        Typeface b10 = b();
        if (b10 != null) {
            textPaint.setTypeface(b10);
        }
        if ((this.f35208a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i10 = this.f35208a;
        if ((i10 & 8) == 0 && (i10 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f35208a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.R9, false);
        }
        int i11 = this.f35208a;
        if ((i11 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23599q7, false));
        } else if ((i11 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false));
        }
    }

    public final Typeface b() {
        if (this.e) {
            if ((this.f35208a & 2) != 0) {
                return AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
            }
            return AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
        }
        int i10 = this.f35208a;
        if ((i10 & 4) == 0 && (i10 & 2048) == 0) {
            if ((i10 & 1) != 0 && (i10 & 2) != 0) {
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            }
            if ((i10 & 1) != 0) {
                return AndroidUtilities.bold();
            }
            if ((i10 & 2) != 0) {
                return AndroidUtilities.getTypeface("fonts/ritalic.ttf");
            }
            return null;
        }
        return Typeface.MONOSPACE;
    }

    public final void c(z11 z11Var) {
        TLRPC.MessageEntity messageEntity;
        this.f35208a |= z11Var.f35208a;
        if (this.d == null && (messageEntity = z11Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public z11(z11 z11Var) {
        this.f35208a = z11Var.f35208a;
        this.f35209b = z11Var.f35209b;
        this.f35210c = z11Var.f35210c;
        this.d = z11Var.d;
        this.e = z11Var.e;
    }
}
