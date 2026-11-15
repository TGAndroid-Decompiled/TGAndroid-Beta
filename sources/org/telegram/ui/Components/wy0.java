package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.tgnet.TLRPC;
public final class wy0 {
    public int f41484a;
    public int f41485b;
    public int f41486c;
    public TLRPC.MessageEntity d;
    public boolean f41487e;

    public wy0() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f41487e) {
            if ((this.f41484a & 2) != 0) {
                typeface = org.telegram.messenger.g0.o1("fonts/mw_bolditalic.ttf");
            } else {
                typeface = org.telegram.messenger.g0.o1("fonts/mw_bold.ttf");
            }
        } else {
            int i7 = this.f41484a;
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
        if ((this.f41484a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i11 = this.f41484a;
        if ((i11 & 8) == 0 && (i11 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f41484a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.R9, false);
        }
        int i12 = this.f41484a;
        if ((i12 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29090q7, false));
        } else if ((i12 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false));
        }
    }

    public final void b(wy0 wy0Var) {
        TLRPC.MessageEntity messageEntity;
        this.f41484a |= wy0Var.f41484a;
        if (this.d == null && (messageEntity = wy0Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public wy0(wy0 wy0Var) {
        this.f41484a = wy0Var.f41484a;
        this.f41485b = wy0Var.f41485b;
        this.f41486c = wy0Var.f41486c;
        this.d = wy0Var.d;
        this.f41487e = wy0Var.f41487e;
    }
}
