package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.tgnet.TLRPC;
public final class fz0 {
    public int f35337a;
    public int f35338b;
    public int f35339c;
    public TLRPC.MessageEntity d;
    public boolean f35340e;

    public fz0() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f35340e) {
            if ((this.f35337a & 2) != 0) {
                typeface = org.telegram.messenger.g0.o1("fonts/mw_bolditalic.ttf");
            } else {
                typeface = org.telegram.messenger.g0.o1("fonts/mw_bold.ttf");
            }
        } else {
            int i7 = this.f35337a;
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
        if ((this.f35337a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i11 = this.f35337a;
        if ((i11 & 8) == 0 && (i11 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f35337a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.R9, false);
        }
        int i12 = this.f35337a;
        if ((i12 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29622q7, false));
        } else if ((i12 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false));
        }
    }

    public final void b(fz0 fz0Var) {
        TLRPC.MessageEntity messageEntity;
        this.f35337a |= fz0Var.f35337a;
        if (this.d == null && (messageEntity = fz0Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public fz0(fz0 fz0Var) {
        this.f35337a = fz0Var.f35337a;
        this.f35338b = fz0Var.f35338b;
        this.f35339c = fz0Var.f35339c;
        this.d = fz0Var.d;
        this.f35340e = fz0Var.f35340e;
    }
}
