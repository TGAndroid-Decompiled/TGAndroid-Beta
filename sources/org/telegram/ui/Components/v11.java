package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class v11 {
    public int f31643a;
    public int f31644b;
    public int f31645c;
    public TLRPC.MessageEntity d;
    public boolean f31646e;

    public v11() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f31646e) {
            if ((this.f31643a & 2) != 0) {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
            } else {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
        } else {
            int i10 = this.f31643a;
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
        if ((this.f31643a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i12 = this.f31643a;
        if ((i12 & 8) == 0 && (i12 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f31643a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.R9, false);
        }
        int i13 = this.f31643a;
        if ((i13 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, false));
        } else if ((i13 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false));
        }
    }

    public final void b(v11 v11Var) {
        TLRPC.MessageEntity messageEntity;
        this.f31643a |= v11Var.f31643a;
        if (this.d == null && (messageEntity = v11Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public v11(v11 v11Var) {
        this.f31643a = v11Var.f31643a;
        this.f31644b = v11Var.f31644b;
        this.f31645c = v11Var.f31645c;
        this.d = v11Var.d;
        this.f31646e = v11Var.f31646e;
    }
}
