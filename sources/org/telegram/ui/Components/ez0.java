package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.tgnet.TLRPC;
public final class ez0 {
    public int f34924a;
    public int f34925b;
    public int f34926c;
    public TLRPC.MessageEntity d;
    public boolean f34927e;

    public ez0() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f34927e) {
            if ((this.f34924a & 2) != 0) {
                typeface = org.telegram.messenger.g0.o1("fonts/mw_bolditalic.ttf");
            } else {
                typeface = org.telegram.messenger.g0.o1("fonts/mw_bold.ttf");
            }
        } else {
            int i7 = this.f34924a;
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
        if ((this.f34924a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i11 = this.f34924a;
        if ((i11 & 8) == 0 && (i11 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f34924a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.R9, false);
        }
        int i12 = this.f34924a;
        if ((i12 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29692q7, false));
        } else if ((i12 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false));
        }
    }

    public final void b(ez0 ez0Var) {
        TLRPC.MessageEntity messageEntity;
        this.f34924a |= ez0Var.f34924a;
        if (this.d == null && (messageEntity = ez0Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public ez0(ez0 ez0Var) {
        this.f34924a = ez0Var.f34924a;
        this.f34925b = ez0Var.f34925b;
        this.f34926c = ez0Var.f34926c;
        this.d = ez0Var.d;
        this.f34927e = ez0Var.f34927e;
    }
}
