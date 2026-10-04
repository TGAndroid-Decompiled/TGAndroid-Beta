package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class m11 {
    public int f28496a;
    public int f28497b;
    public int f28498c;
    public TLRPC.MessageEntity d;
    public boolean f28499e;

    public m11() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.f28499e) {
            if ((this.f28496a & 2) != 0) {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf");
            } else {
                typeface = AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
        } else {
            int i10 = this.f28496a;
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
        if ((this.f28496a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i12 = this.f28496a;
        if ((i12 & 8) == 0 && (i12 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.f28496a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.R9, false);
        }
        int i13 = this.f28496a;
        if ((i13 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21058q7, false));
        } else if ((i13 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false));
        }
    }

    public final void b(m11 m11Var) {
        TLRPC.MessageEntity messageEntity;
        this.f28496a |= m11Var.f28496a;
        if (this.d == null && (messageEntity = m11Var.d) != null) {
            this.d = messageEntity;
        }
    }

    public m11(m11 m11Var) {
        this.f28496a = m11Var.f28496a;
        this.f28497b = m11Var.f28497b;
        this.f28498c = m11Var.f28498c;
        this.d = m11Var.d;
        this.f28499e = m11Var.f28499e;
    }
}
