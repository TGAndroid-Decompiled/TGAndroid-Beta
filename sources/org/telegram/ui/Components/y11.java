package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class y11 {
    public int f34904a;
    public int f34905b;
    public int f34906c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public y11() {
    }

    public final void a(TextPaint textPaint) {
        Typeface b10 = b();
        if (b10 != null) {
            textPaint.setTypeface(b10);
        }
        if ((this.f34904a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i10 = this.f34904a;
        if ((i10 & 8) == 0 && (i10 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f34904a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.R9, false);
        }
        int i11 = this.f34904a;
        if ((i11 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23596q7, false));
        } else if ((i11 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false));
        }
    }

    public final Typeface b() {
        if (this.e) {
            if ((this.f34904a & 2) != 0) {
                return AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
            }
            return AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
        }
        int i10 = this.f34904a;
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

    public final void c(y11 y11Var) {
        TLRPC.MessageEntity messageEntity;
        this.f34904a |= y11Var.f34904a;
        if (this.d == null && (messageEntity = y11Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public y11(y11 y11Var) {
        this.f34904a = y11Var.f34904a;
        this.f34905b = y11Var.f34905b;
        this.f34906c = y11Var.f34906c;
        this.d = y11Var.d;
        this.e = y11Var.e;
    }
}
