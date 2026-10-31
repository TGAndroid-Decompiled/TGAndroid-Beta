package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.tgnet.TLRPC;
public final class yz0 {
    public int f32850a;
    public int f32851b;
    public int f32852c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public yz0() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.e) {
            if ((this.f32850a & 2) != 0) {
                typeface = org.telegram.messenger.i0.o1("fonts/mw_bolditalic.ttf");
            } else {
                typeface = org.telegram.messenger.i0.o1("fonts/mw_bold.ttf");
            }
        } else {
            int i10 = this.f32850a;
            if ((i10 & 4) == 0 && (i10 & 2048) == 0) {
                int i11 = i10 & 1;
                if (i11 != 0 && (i10 & 2) != 0) {
                    typeface = org.telegram.messenger.i0.o1("fonts/rmediumitalic.ttf");
                } else if (i11 != 0) {
                    typeface = org.telegram.messenger.i0.o();
                } else if ((i10 & 2) != 0) {
                    typeface = org.telegram.messenger.i0.o1("fonts/ritalic.ttf");
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
        if ((this.f32850a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i12 = this.f32850a;
        if ((i12 & 8) == 0 && (i12 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f32850a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.R9, false);
        }
        int i13 = this.f32850a;
        if ((i13 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21170q7, false));
        } else if ((i13 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
        }
    }

    public final void b(yz0 yz0Var) {
        TLRPC.MessageEntity messageEntity;
        this.f32850a |= yz0Var.f32850a;
        if (this.d == null && (messageEntity = yz0Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public yz0(yz0 yz0Var) {
        this.f32850a = yz0Var.f32850a;
        this.f32851b = yz0Var.f32851b;
        this.f32852c = yz0Var.f32852c;
        this.d = yz0Var.d;
        this.e = yz0Var.e;
    }
}
