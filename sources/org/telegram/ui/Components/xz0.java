package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public final class xz0 {

    public int f34734a;

    public int f34735b;

    public int f34736c;
    public TLRPC.MessageEntity d;

    public boolean f34737e;

    public xz0() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f34737e) {
            typeface = (this.f34734a & 2) != 0 ? AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf") : AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
        } else {
            int i10 = this.f34734a;
            if ((i10 & 4) == 0 && (i10 & 2048) == 0) {
                int i11 = i10 & 1;
                if (i11 != 0 && (i10 & 2) != 0) {
                    typeface = AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
                } else if (i11 != 0) {
                    typeface = AndroidUtilities.bold();
                } else {
                    typeface = (i10 & 2) != 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : null;
                }
            } else {
                typeface = Typeface.MONOSPACE;
            }
        }
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        if ((this.f34734a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i12 = this.f34734a;
        if ((i12 & 8) == 0 && (i12 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f34734a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.R9, false);
        }
        int i13 = this.f34734a;
        if ((i13 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        } else if ((i13 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
        }
    }

    public final void b(xz0 xz0Var) {
        TLRPC.MessageEntity messageEntity;
        this.f34734a |= xz0Var.f34734a;
        if (this.d != null || (messageEntity = xz0Var.d) == null) {
            return;
        }
        this.d = messageEntity;
    }

    public xz0(xz0 xz0Var) {
        this.f34734a = xz0Var.f34734a;
        this.f34735b = xz0Var.f34735b;
        this.f34736c = xz0Var.f34736c;
        this.d = xz0Var.d;
        this.f34737e = xz0Var.f34737e;
    }
}
