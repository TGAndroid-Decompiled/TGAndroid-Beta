package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class s01 {
    public int f30949a;
    public int f30950b;
    public int f30951c;
    public TLRPC.MessageEntity d;
    public boolean f30952e;

    public s01() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f30952e) {
            if ((this.f30949a & 2) != 0) {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
            } else {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
        } else {
            int i10 = this.f30949a;
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
        if ((this.f30949a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i12 = this.f30949a;
        if ((i12 & 8) == 0 && (i12 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f30949a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.R9, false);
        }
        int i13 = this.f30949a;
        if ((i13 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
        } else if ((i13 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false));
        }
    }

    public final void b(s01 s01Var) {
        TLRPC.MessageEntity messageEntity;
        this.f30949a |= s01Var.f30949a;
        if (this.d == null && (messageEntity = s01Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public s01(s01 s01Var) {
        this.f30949a = s01Var.f30949a;
        this.f30950b = s01Var.f30950b;
        this.f30951c = s01Var.f30951c;
        this.d = s01Var.d;
        this.f30952e = s01Var.f30952e;
    }
}
