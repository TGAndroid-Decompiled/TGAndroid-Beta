package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class m11 {
    public int f28357a;
    public int f28358b;
    public int f28359c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public m11() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.e) {
            if ((this.f28357a & 2) != 0) {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
            } else {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
        } else {
            int i10 = this.f28357a;
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
        if ((this.f28357a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i12 = this.f28357a;
        if ((i12 & 8) == 0 && (i12 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f28357a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.R9, false);
        }
        int i13 = this.f28357a;
        if ((i13 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21225q7, false));
        } else if ((i13 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false));
        }
    }

    public final void b(m11 m11Var) {
        TLRPC.MessageEntity messageEntity;
        this.f28357a |= m11Var.f28357a;
        if (this.d == null && (messageEntity = m11Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public m11(m11 m11Var) {
        this.f28357a = m11Var.f28357a;
        this.f28358b = m11Var.f28358b;
        this.f28359c = m11Var.f28359c;
        this.d = m11Var.d;
        this.e = m11Var.e;
    }
}
