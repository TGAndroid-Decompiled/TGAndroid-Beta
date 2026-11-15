package org.telegram.ui.Cells;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oy0;
public final class v1 {
    public final q1 f31786a;
    public org.telegram.ui.Components.v8 f31787b;
    public oy0 f31788c;
    public int d;
    public Drawable f31789e;

    public v1(q1 q1Var) {
        this.f31786a = q1Var;
    }

    public final void a(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        String str;
        int i7;
        int L;
        int i10;
        StaticLayout staticLayout;
        float f10;
        int i11;
        int i12;
        int i13;
        q1 q1Var = this.f31786a;
        boolean J4 = q1Var.Q5.J4();
        gj gjVar = q1Var.Q5;
        if (gjVar.f23819k.action instanceof TLRPC.TL_messageActionConferenceCall) {
            if (gjVar.P3()) {
                drawable = org.telegram.ui.ActionBar.j6.O4;
            } else {
                drawable = org.telegram.ui.ActionBar.j6.P4;
            }
            if (this.f31789e == null) {
                Resources resources = q1Var.getContext().getResources();
                if (q1Var.Q5.J4()) {
                    i13 = 2131231184;
                } else {
                    i13 = 2131231091;
                }
                this.f31789e = resources.getDrawable(i13).mutate();
            }
            if (q1Var.Q5.P3()) {
                i12 = org.telegram.ui.ActionBar.j6.Mb;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.f29172ud;
            }
            int w02 = org.telegram.ui.ActionBar.j6.w0(i12, q1Var.Qb);
            if (this.d != w02) {
                Drawable drawable3 = this.f31789e;
                this.d = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            drawable2 = this.f31789e;
        } else if (gjVar.P3()) {
            drawable = org.telegram.ui.ActionBar.j6.O4;
            if (q1Var.Q5.J4()) {
                q1Var.y2();
                drawable2 = q1Var.Z1("drawableMsgOutCallVideo");
            } else {
                if (q1Var.y2()) {
                    str = "drawableMsgOutCallAudioSelected";
                } else {
                    str = "drawableMsgOutCallAudio";
                }
                drawable2 = q1Var.Z1(str);
            }
        } else {
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = q1Var.Q5.f23819k.action.reason;
            if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) {
                drawable = org.telegram.ui.ActionBar.j6.Q4;
            } else {
                drawable = org.telegram.ui.ActionBar.j6.P4;
            }
            if (q1Var.y2()) {
                drawable2 = org.telegram.ui.ActionBar.j6.H4[J4 ? 1 : 0];
            } else {
                drawable2 = org.telegram.ui.ActionBar.j6.G4[J4 ? 1 : 0];
            }
        }
        Drawable drawable4 = drawable;
        Drawable drawable5 = drawable2;
        if (q1Var.Q5.P3()) {
            org.telegram.ui.ActionBar.j6.O2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Wc, q1Var.Qb));
            TextPaint textPaint = org.telegram.ui.ActionBar.j6.S2;
            if (q1Var.y2()) {
                i11 = org.telegram.ui.ActionBar.j6.f28873ec;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f28964jc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(i11, q1Var.Qb));
        } else {
            org.telegram.ui.ActionBar.j6.O2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Vc, q1Var.Qb));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.S2;
            if (q1Var.y2()) {
                i7 = org.telegram.ui.ActionBar.j6.fe;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.f28875ee;
            }
            textPaint2.setColor(org.telegram.ui.ActionBar.j6.w0(i7, q1Var.Qb));
        }
        q1Var.G9 = true;
        if (q1Var.Q5.P3()) {
            L = org.telegram.messenger.g0.L(16.0f) + (q1Var.f30949d7 - q1Var.f30923b7);
        } else if (q1Var.Z2()) {
            L = org.telegram.messenger.g0.L(74.0f);
        } else {
            L = org.telegram.messenger.g0.L(25.0f);
        }
        q1Var.S3 = L;
        if (hd.f24104a0) {
            L = org.telegram.messenger.k5.C(12.0f, drawable5.getIntrinsicWidth(), L);
        }
        int i14 = L;
        if (q1Var.f31087o2 != null) {
            canvas.save();
            canvas.translate(i14, org.telegram.messenger.g0.L(12.0f) + q1Var.Ua);
            q1Var.f31087o2.draw(canvas);
            canvas.restore();
        }
        float f11 = -19.0f;
        if (q1Var.f30958e3 != null) {
            canvas.save();
            if (hd.f24104a0) {
                f10 = -19.0f;
            } else {
                f10 = 19.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f10) + i14, org.telegram.messenger.g0.L(37.0f) + q1Var.Ua);
            q1Var.f30958e3.draw(canvas);
            canvas.restore();
        }
        if (this.f31788c != null && this.f31787b != null) {
            canvas.save();
            if (!hd.f24104a0) {
                f11 = 19.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(f11) + i14 + q1Var.f30972f3, org.telegram.messenger.g0.L(36.0f) + q1Var.Ua);
            this.f31787b.g(canvas);
            canvas.translate(this.f31787b.A + org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f));
            this.f31788c.c(0.0f, 0.0f, 1.0f, org.telegram.ui.ActionBar.j6.S2.getColor(), canvas);
            canvas.restore();
        }
        int i15 = 0;
        if (hd.f24104a0 && (staticLayout = q1Var.f30958e3) != null) {
            i10 = staticLayout.getWidth() - drawable4.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        z.s((i14 + i10) - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(37.0f) + q1Var.Ua, drawable4);
        drawable4.draw(canvas);
        Drawable drawable6 = q1Var.J2[0];
        if (drawable6 != null && q1Var.L2[0] == 4) {
            drawable6.draw(canvas);
        }
        boolean z10 = q1Var.G;
        if (!z10 && !q1Var.F) {
            q1Var.T3 = org.telegram.messenger.g0.L(18.5f);
        } else if (z10 && q1Var.F) {
            q1Var.T3 = org.telegram.messenger.g0.L(18.0f);
        } else if (!z10) {
            q1Var.T3 = org.telegram.messenger.g0.L(17.0f);
        } else {
            q1Var.T3 = org.telegram.messenger.g0.L(19.0f);
        }
        int i16 = q1Var.S3;
        if (!hd.f24104a0) {
            i15 = q1Var.f30923b7 - org.telegram.messenger.g0.L(70.0f);
        }
        z.s(org.telegram.messenger.g0.L(!J4 ? 1 : 0) + i16 + i15, q1Var.T3, drawable5);
        drawable5.draw(canvas);
    }

    public final void b(org.telegram.messenger.gj r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v1.b(org.telegram.messenger.gj, boolean):void");
    }
}
