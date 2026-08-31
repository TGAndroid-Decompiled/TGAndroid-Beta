package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class t01 {
    public int f31225a;
    public int f31226b;
    public int f31227c;
    public TLRPC.MessageEntity d;
    public boolean f31228e;

    public t01() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f31228e) {
            if ((this.f31225a & 2) != 0) {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
            } else {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
        } else {
            int i10 = this.f31225a;
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
        if ((this.f31225a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i12 = this.f31225a;
        if ((i12 & 8) == 0 && (i12 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f31225a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.R9, false);
        }
        int i13 = this.f31225a;
        if ((i13 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
        } else if ((i13 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false));
        }
    }

    public final void b(t01 t01Var) {
        TLRPC.MessageEntity messageEntity;
        this.f31225a |= t01Var.f31225a;
        if (this.d == null && (messageEntity = t01Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public t01(t01 t01Var) {
        this.f31225a = t01Var.f31225a;
        this.f31226b = t01Var.f31226b;
        this.f31227c = t01Var.f31227c;
        this.d = t01Var.d;
        this.f31228e = t01Var.f31228e;
    }
}
