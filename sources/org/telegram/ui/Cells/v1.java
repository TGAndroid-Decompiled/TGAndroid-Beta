package org.telegram.ui.Cells;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.dd;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rz0;
public final class v1 {
    public final q1 f23171a;
    public org.telegram.ui.Components.t8 f23172b;
    public rz0 f23173c;
    public int d;
    public Drawable e;

    public v1(q1 q1Var) {
        this.f23171a = q1Var;
    }

    public final void a(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        String str;
        int i10;
        int L;
        int i11;
        StaticLayout staticLayout;
        float f7;
        int i12;
        int i13;
        int i14;
        q1 q1Var = this.f23171a;
        boolean J4 = q1Var.O5.J4();
        kj kjVar = q1Var.O5;
        if (kjVar.f16690k.action instanceof TLRPC.TL_messageActionConferenceCall) {
            if (kjVar.P3()) {
                drawable = org.telegram.ui.ActionBar.t6.O4;
            } else {
                drawable = org.telegram.ui.ActionBar.t6.P4;
            }
            if (this.e == null) {
                Resources resources = q1Var.getContext().getResources();
                if (q1Var.O5.J4()) {
                    i14 = 2131231184;
                } else {
                    i14 = 2131231091;
                }
                this.e = resources.getDrawable(i14).mutate();
            }
            if (q1Var.O5.P3()) {
                i13 = org.telegram.ui.ActionBar.t6.Jb;
            } else {
                i13 = org.telegram.ui.ActionBar.t6.f21193rd;
            }
            int w02 = org.telegram.ui.ActionBar.t6.w0(i13, q1Var.Ob);
            if (this.d != w02) {
                Drawable drawable3 = this.e;
                this.d = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            drawable2 = this.e;
        } else if (kjVar.P3()) {
            drawable = org.telegram.ui.ActionBar.t6.O4;
            if (q1Var.O5.J4()) {
                q1Var.v2();
                drawable2 = q1Var.W1("drawableMsgOutCallVideo");
            } else {
                if (q1Var.v2()) {
                    str = "drawableMsgOutCallAudioSelected";
                } else {
                    str = "drawableMsgOutCallAudio";
                }
                drawable2 = q1Var.W1(str);
            }
        } else {
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = q1Var.O5.f16690k.action.reason;
            if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) {
                drawable = org.telegram.ui.ActionBar.t6.Q4;
            } else {
                drawable = org.telegram.ui.ActionBar.t6.P4;
            }
            if (q1Var.v2()) {
                drawable2 = org.telegram.ui.ActionBar.t6.H4[J4 ? 1 : 0];
            } else {
                drawable2 = org.telegram.ui.ActionBar.t6.G4[J4 ? 1 : 0];
            }
        }
        Drawable drawable4 = drawable;
        Drawable drawable5 = drawable2;
        if (q1Var.O5.P3()) {
            org.telegram.ui.ActionBar.t6.O2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Tc, q1Var.Ob));
            TextPaint textPaint = org.telegram.ui.ActionBar.t6.S2;
            if (q1Var.v2()) {
                i12 = org.telegram.ui.ActionBar.t6.f20898bc;
            } else {
                i12 = org.telegram.ui.ActionBar.t6.gc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i12, q1Var.Ob));
        } else {
            org.telegram.ui.ActionBar.t6.O2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Sc, q1Var.Ob));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.t6.S2;
            if (q1Var.v2()) {
                i10 = org.telegram.ui.ActionBar.t6.f20919ce;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.f20900be;
            }
            textPaint2.setColor(org.telegram.ui.ActionBar.t6.w0(i10, q1Var.Ob));
        }
        q1Var.E9 = true;
        if (q1Var.O5.P3()) {
            L = org.telegram.messenger.i0.L(16.0f) + (q1Var.f22506b7 - q1Var.Z6);
        } else if (q1Var.V2()) {
            L = org.telegram.messenger.i0.L(74.0f);
        } else {
            L = org.telegram.messenger.i0.L(25.0f);
        }
        q1Var.Q3 = L;
        if (dd.X) {
            L = org.telegram.messenger.m5.C(12.0f, drawable5.getIntrinsicWidth(), L);
        }
        int i15 = L;
        if (q1Var.f22638m2 != null) {
            canvas.save();
            canvas.translate(i15, org.telegram.messenger.i0.L(12.0f) + q1Var.Sa);
            q1Var.f22638m2.draw(canvas);
            canvas.restore();
        }
        float f10 = -19.0f;
        if (q1Var.f22516c3 != null) {
            canvas.save();
            if (dd.X) {
                f7 = -19.0f;
            } else {
                f7 = 19.0f;
            }
            canvas.translate(org.telegram.messenger.i0.L(f7) + i15, org.telegram.messenger.i0.L(37.0f) + q1Var.Sa);
            q1Var.f22516c3.draw(canvas);
            canvas.restore();
        }
        if (this.f23173c != null && this.f23172b != null) {
            canvas.save();
            if (!dd.X) {
                f10 = 19.0f;
            }
            canvas.translate(org.telegram.messenger.i0.L(6.0f) + org.telegram.messenger.i0.L(f10) + i15 + q1Var.f22530d3, org.telegram.messenger.i0.L(36.0f) + q1Var.Sa);
            this.f23172b.g(canvas);
            canvas.translate(this.f23172b.A + org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(8.0f));
            this.f23173c.c(0.0f, 0.0f, 1.0f, org.telegram.ui.ActionBar.t6.S2.getColor(), canvas);
            canvas.restore();
        }
        int i16 = 0;
        if (dd.X && (staticLayout = q1Var.f22516c3) != null) {
            i11 = staticLayout.getWidth() - drawable4.getIntrinsicWidth();
        } else {
            i11 = 0;
        }
        z.t((i15 + i11) - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(37.0f) + q1Var.Sa, drawable4);
        drawable4.draw(canvas);
        Drawable drawable6 = q1Var.H2[0];
        if (drawable6 != null && q1Var.J2[0] == 4) {
            drawable6.draw(canvas);
        }
        boolean z10 = q1Var.F;
        if (!z10 && !q1Var.E) {
            q1Var.R3 = org.telegram.messenger.i0.L(18.5f);
        } else if (z10 && q1Var.E) {
            q1Var.R3 = org.telegram.messenger.i0.L(18.0f);
        } else if (!z10) {
            q1Var.R3 = org.telegram.messenger.i0.L(17.0f);
        } else {
            q1Var.R3 = org.telegram.messenger.i0.L(19.0f);
        }
        int i17 = q1Var.Q3;
        if (!dd.X) {
            i16 = q1Var.Z6 - org.telegram.messenger.i0.L(70.0f);
        }
        z.t(org.telegram.messenger.i0.L(!J4 ? 1 : 0) + i17 + i16, q1Var.R3, drawable5);
        drawable5.draw(canvas);
    }

    public final void b(org.telegram.messenger.kj r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v1.b(org.telegram.messenger.kj, boolean):void");
    }
}
