package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.tgnet.TLRPC;
public final class ty0 {
    public int f38578a;
    public int f38579b;
    public int f38580c;
    public TLRPC.MessageEntity d;
    public boolean f38581e;

    public ty0() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f38581e) {
            if ((this.f38578a & 2) != 0) {
                typeface = org.telegram.messenger.g0.o1("fonts/mw_bolditalic.ttf");
            } else {
                typeface = org.telegram.messenger.g0.o1("fonts/mw_bold.ttf");
            }
        } else {
            int i3 = this.f38578a;
            if ((i3 & 4) == 0 && (i3 & 2048) == 0) {
                int i10 = i3 & 1;
                if (i10 != 0 && (i3 & 2) != 0) {
                    typeface = org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf");
                } else if (i10 != 0) {
                    typeface = org.telegram.messenger.g0.o();
                } else if ((i3 & 2) != 0) {
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
        if ((this.f38578a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i11 = this.f38578a;
        if ((i11 & 8) == 0 && (i11 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f38578a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.R9, false);
        }
        int i12 = this.f38578a;
        if ((i12 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28122q7, false));
        } else if ((i12 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
        }
    }

    public final void b(ty0 ty0Var) {
        TLRPC.MessageEntity messageEntity;
        this.f38578a |= ty0Var.f38578a;
        if (this.d == null && (messageEntity = ty0Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public ty0(ty0 ty0Var) {
        this.f38578a = ty0Var.f38578a;
        this.f38579b = ty0Var.f38579b;
        this.f38580c = ty0Var.f38580c;
        this.d = ty0Var.d;
        this.f38581e = ty0Var.f38581e;
    }
}
