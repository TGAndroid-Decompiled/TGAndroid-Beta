package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.tgnet.TLRPC;
public final class dz0 {
    public int f34537a;
    public int f34538b;
    public int f34539c;
    public TLRPC.MessageEntity d;
    public boolean f34540e;

    public dz0() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f34540e) {
            if ((this.f34537a & 2) != 0) {
                typeface = org.telegram.messenger.g0.o1("fonts/mw_bolditalic.ttf");
            } else {
                typeface = org.telegram.messenger.g0.o1("fonts/mw_bold.ttf");
            }
        } else {
            int i7 = this.f34537a;
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
        if ((this.f34537a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i11 = this.f34537a;
        if ((i11 & 8) == 0 && (i11 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f34537a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.R9, false);
        }
        int i12 = this.f34537a;
        if ((i12 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29635q7, false));
        } else if ((i12 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false));
        }
    }

    public final void b(dz0 dz0Var) {
        TLRPC.MessageEntity messageEntity;
        this.f34537a |= dz0Var.f34537a;
        if (this.d == null && (messageEntity = dz0Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public dz0(dz0 dz0Var) {
        this.f34537a = dz0Var.f34537a;
        this.f34538b = dz0Var.f34538b;
        this.f34539c = dz0Var.f34539c;
        this.d = dz0Var.d;
        this.f34540e = dz0Var.f34540e;
    }
}
