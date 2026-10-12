package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class z11 {
    public int f33255a;
    public int f33256b;
    public int f33257c;
    public TLRPC.MessageEntity d;
    public boolean f33258e;

    public z11() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f33258e) {
            if ((this.f33255a & 2) != 0) {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
            } else {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
        } else {
            int i10 = this.f33255a;
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
        if ((this.f33255a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i12 = this.f33255a;
        if ((i12 & 8) == 0 && (i12 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f33255a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.R9, false);
        }
        int i13 = this.f33255a;
        if ((i13 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
        } else if ((i13 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false));
        }
    }

    public final void b(z11 z11Var) {
        TLRPC.MessageEntity messageEntity;
        this.f33255a |= z11Var.f33255a;
        if (this.d == null && (messageEntity = z11Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public z11(z11 z11Var) {
        this.f33255a = z11Var.f33255a;
        this.f33256b = z11Var.f33256b;
        this.f33257c = z11Var.f33257c;
        this.d = z11Var.d;
        this.f33258e = z11Var.f33258e;
    }
}
