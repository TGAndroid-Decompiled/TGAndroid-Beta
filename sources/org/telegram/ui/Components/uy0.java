package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.tgnet.TLRPC;
public final class uy0 {
    public int f38779a;
    public int f38780b;
    public int f38781c;
    public TLRPC.MessageEntity d;
    public boolean f38782e;

    public uy0() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f38782e) {
            if ((this.f38779a & 2) != 0) {
                typeface = org.telegram.messenger.g0.o1("fonts/mw_bolditalic.ttf");
            } else {
                typeface = org.telegram.messenger.g0.o1("fonts/mw_bold.ttf");
            }
        } else {
            int i7 = this.f38779a;
            if ((i7 & 4) == 0 && (i7 & 2048) == 0) {
                int i10 = i7 & 1;
                if (i10 != 0 && (i7 & 2) != 0) {
                    typeface = org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf");
                } else if (i10 != 0) {
                    typeface = org.telegram.messenger.g0.o();
                } else if ((i7 & 2) != 0) {
                    typeface = org.telegram.messenger.g0.o1("fonts/ritalic.ttf");
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
        if ((this.f38779a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i11 = this.f38779a;
        if ((i11 & 8) == 0 && (i11 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f38779a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.R9, false);
        }
        int i12 = this.f38779a;
        if ((i12 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28093q7, false));
        } else if ((i12 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
        }
    }

    public final void b(uy0 uy0Var) {
        TLRPC.MessageEntity messageEntity;
        this.f38779a |= uy0Var.f38779a;
        if (this.d == null && (messageEntity = uy0Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public uy0(uy0 uy0Var) {
        this.f38779a = uy0Var.f38779a;
        this.f38780b = uy0Var.f38780b;
        this.f38781c = uy0Var.f38781c;
        this.d = uy0Var.d;
        this.f38782e = uy0Var.f38782e;
    }
}
