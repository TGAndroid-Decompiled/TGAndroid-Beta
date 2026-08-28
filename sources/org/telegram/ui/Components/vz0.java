package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class vz0 {
    public int f34062a;
    public int f34063b;
    public int f34064c;
    public TLRPC.MessageEntity d;
    public boolean f34065e;

    public vz0() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f34065e) {
            if ((this.f34062a & 2) != 0) {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
            } else {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
        } else {
            int i9 = this.f34062a;
            if ((i9 & 4) == 0 && (i9 & 2048) == 0) {
                int i10 = i9 & 1;
                if (i10 != 0 && (i9 & 2) != 0) {
                    typeface = AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
                } else if (i10 != 0) {
                    typeface = AndroidUtilities.bold();
                } else if ((i9 & 2) != 0) {
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
        if ((this.f34062a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i11 = this.f34062a;
        if ((i11 & 8) == 0 && (i11 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f34062a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.R9, false);
        }
        int i12 = this.f34062a;
        if ((i12 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
        } else if ((i12 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false));
        }
    }

    public final void b(vz0 vz0Var) {
        TLRPC.MessageEntity messageEntity;
        this.f34062a |= vz0Var.f34062a;
        if (this.d == null && (messageEntity = vz0Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public vz0(vz0 vz0Var) {
        this.f34062a = vz0Var.f34062a;
        this.f34063b = vz0Var.f34063b;
        this.f34064c = vz0Var.f34064c;
        this.d = vz0Var.d;
        this.f34065e = vz0Var.f34065e;
    }
}
