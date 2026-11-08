package org.telegram.ui.Cells;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.my0;
public final class v1 {
    public final q1 f30616a;
    public org.telegram.ui.Components.y8 f30617b;
    public my0 f30618c;
    public int d;
    public Drawable f30619e;

    public v1(q1 q1Var) {
        this.f30616a = q1Var;
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
        q1 q1Var = this.f30616a;
        boolean K4 = q1Var.P5.K4();
        ij ijVar = q1Var.P5;
        if (ijVar.f23262k.action instanceof TLRPC.TL_messageActionConferenceCall) {
            if (ijVar.Q3()) {
                drawable = org.telegram.ui.ActionBar.k6.O4;
            } else {
                drawable = org.telegram.ui.ActionBar.k6.P4;
            }
            if (this.f30619e == null) {
                Resources resources = q1Var.getContext().getResources();
                if (q1Var.P5.K4()) {
                    i13 = 2131231184;
                } else {
                    i13 = 2131231091;
                }
                this.f30619e = resources.getDrawable(i13).mutate();
            }
            if (q1Var.P5.Q3()) {
                i12 = org.telegram.ui.ActionBar.k6.Jb;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.f28118rd;
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(i12, q1Var.Pb);
            if (this.d != w02) {
                Drawable drawable3 = this.f30619e;
                this.d = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            drawable2 = this.f30619e;
        } else if (ijVar.Q3()) {
            drawable = org.telegram.ui.ActionBar.k6.O4;
            if (q1Var.P5.K4()) {
                q1Var.x2();
                drawable2 = q1Var.Y1("drawableMsgOutCallVideo");
            } else {
                if (q1Var.x2()) {
                    str = "drawableMsgOutCallAudioSelected";
                } else {
                    str = "drawableMsgOutCallAudio";
                }
                drawable2 = q1Var.Y1(str);
            }
        } else {
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = q1Var.P5.f23262k.action.reason;
            if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) {
                drawable = org.telegram.ui.ActionBar.k6.Q4;
            } else {
                drawable = org.telegram.ui.ActionBar.k6.P4;
            }
            if (q1Var.x2()) {
                drawable2 = org.telegram.ui.ActionBar.k6.H4[K4 ? 1 : 0];
            } else {
                drawable2 = org.telegram.ui.ActionBar.k6.G4[K4 ? 1 : 0];
            }
        }
        Drawable drawable4 = drawable;
        Drawable drawable5 = drawable2;
        if (q1Var.P5.Q3()) {
            org.telegram.ui.ActionBar.k6.O2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Tc, q1Var.Pb));
            TextPaint textPaint = org.telegram.ui.ActionBar.k6.S2;
            if (q1Var.x2()) {
                i11 = org.telegram.ui.ActionBar.k6.f27821bc;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.f27913gc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i11, q1Var.Pb));
        } else {
            org.telegram.ui.ActionBar.k6.O2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sc, q1Var.Pb));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.k6.S2;
            if (q1Var.x2()) {
                i7 = org.telegram.ui.ActionBar.k6.f27842ce;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.f27822be;
            }
            textPaint2.setColor(org.telegram.ui.ActionBar.k6.w0(i7, q1Var.Pb));
        }
        q1Var.F9 = true;
        if (q1Var.P5.Q3()) {
            L = org.telegram.messenger.g0.L(16.0f) + (q1Var.f29803c7 - q1Var.f29776a7);
        } else if (q1Var.Y2()) {
            L = org.telegram.messenger.g0.L(74.0f);
        } else {
            L = org.telegram.messenger.g0.L(25.0f);
        }
        q1Var.R3 = L;
        if (id.f23157a0) {
            L = org.telegram.messenger.k5.C(12.0f, drawable5.getIntrinsicWidth(), L);
        }
        int i14 = L;
        if (q1Var.f29935n2 != null) {
            canvas.save();
            canvas.translate(i14, org.telegram.messenger.g0.L(12.0f) + q1Var.Ta);
            q1Var.f29935n2.draw(canvas);
            canvas.restore();
        }
        float f11 = -19.0f;
        if (q1Var.f29812d3 != null) {
            canvas.save();
            if (id.f23157a0) {
                f10 = -19.0f;
            } else {
                f10 = 19.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f10) + i14, org.telegram.messenger.g0.L(37.0f) + q1Var.Ta);
            q1Var.f29812d3.draw(canvas);
            canvas.restore();
        }
        if (this.f30618c != null && this.f30617b != null) {
            canvas.save();
            if (!id.f23157a0) {
                f11 = 19.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(f11) + i14 + q1Var.f29825e3, org.telegram.messenger.g0.L(36.0f) + q1Var.Ta);
            this.f30617b.g(canvas);
            canvas.translate(this.f30617b.A + org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f));
            this.f30618c.c(0.0f, 0.0f, 1.0f, org.telegram.ui.ActionBar.k6.S2.getColor(), canvas);
            canvas.restore();
        }
        int i15 = 0;
        if (id.f23157a0 && (staticLayout = q1Var.f29812d3) != null) {
            i10 = staticLayout.getWidth() - drawable4.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        z.s((i14 + i10) - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(37.0f) + q1Var.Ta, drawable4);
        drawable4.draw(canvas);
        Drawable drawable6 = q1Var.I2[0];
        if (drawable6 != null && q1Var.K2[0] == 4) {
            drawable6.draw(canvas);
        }
        boolean z9 = q1Var.F;
        if (!z9 && !q1Var.E) {
            q1Var.S3 = org.telegram.messenger.g0.L(18.5f);
        } else if (z9 && q1Var.E) {
            q1Var.S3 = org.telegram.messenger.g0.L(18.0f);
        } else if (!z9) {
            q1Var.S3 = org.telegram.messenger.g0.L(17.0f);
        } else {
            q1Var.S3 = org.telegram.messenger.g0.L(19.0f);
        }
        int i16 = q1Var.R3;
        if (!id.f23157a0) {
            i15 = q1Var.f29776a7 - org.telegram.messenger.g0.L(70.0f);
        }
        z.s(org.telegram.messenger.g0.L(!K4 ? 1 : 0) + i16 + i15, q1Var.S3, drawable5);
        drawable5.draw(canvas);
    }

    public final void b(org.telegram.messenger.ij r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v1.b(org.telegram.messenger.ij, boolean):void");
    }
}
