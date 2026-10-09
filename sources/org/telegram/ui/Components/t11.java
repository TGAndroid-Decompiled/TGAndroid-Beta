package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class t11 {
    public int f30974a;
    public int f30975b;
    public int f30976c;
    public TLRPC.MessageEntity d;
    public boolean f30977e;

    public t11() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f30977e) {
            if ((this.f30974a & 2) != 0) {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
            } else {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
        } else {
            int i10 = this.f30974a;
            if ((i10 & 4) == 0 && (i10 & 2048) == 0) {
                int i11 = i10 & 1;
                if (i11 != 0 && (i10 & 2) != 0) {
                    typeface = AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
                } else if (i11 != 0) {
                    typeface = AndroidUtilities.bold();
                } else if ((i10 & 2) != 0) {
                    typeface = AndroidUtilities.getTypeface("fonts/ritalic.ttf");
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
        if ((this.f30974a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i12 = this.f30974a;
        if ((i12 & 8) == 0 && (i12 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f30974a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.R9, false);
        }
        int i13 = this.f30974a;
        if ((i13 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
        } else if ((i13 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false));
        }
    }

    public final void b(t11 t11Var) {
        TLRPC.MessageEntity messageEntity;
        this.f30974a |= t11Var.f30974a;
        if (this.d == null && (messageEntity = t11Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public t11(t11 t11Var) {
        this.f30974a = t11Var.f30974a;
        this.f30975b = t11Var.f30975b;
        this.f30976c = t11Var.f30976c;
        this.d = t11Var.d;
        this.f30977e = t11Var.f30977e;
    }
}
