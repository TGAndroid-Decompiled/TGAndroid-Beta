package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.tgnet.TLRPC;
public final class vy0 {
    public int f39836a;
    public int f39837b;
    public int f39838c;
    public TLRPC.MessageEntity d;
    public boolean f39839e;

    public vy0() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f39839e) {
            if ((this.f39836a & 2) != 0) {
                typeface = org.telegram.messenger.g0.o1("fonts/mw_bolditalic.ttf");
            } else {
                typeface = org.telegram.messenger.g0.o1("fonts/mw_bold.ttf");
            }
        } else {
            int i7 = this.f39836a;
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
        if ((this.f39836a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i11 = this.f39836a;
        if ((i11 & 8) == 0 && (i11 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f39836a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.R9, false);
        }
        int i12 = this.f39836a;
        if ((i12 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28106q7, false));
        } else if ((i12 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false));
        }
    }

    public final void b(vy0 vy0Var) {
        TLRPC.MessageEntity messageEntity;
        this.f39836a |= vy0Var.f39836a;
        if (this.d == null && (messageEntity = vy0Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public vy0(vy0 vy0Var) {
        this.f39836a = vy0Var.f39836a;
        this.f39837b = vy0Var.f39837b;
        this.f39838c = vy0Var.f39838c;
        this.d = vy0Var.d;
        this.f39839e = vy0Var.f39839e;
    }
}
