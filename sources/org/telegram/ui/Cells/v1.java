package org.telegram.ui.Cells;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vy0;
public final class v1 {
    public final q1 f32151a;
    public org.telegram.ui.Components.d9 f32152b;
    public vy0 f32153c;
    public int d;
    public Drawable f32154e;

    public v1(q1 q1Var) {
        this.f32151a = q1Var;
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
        q1 q1Var = this.f32151a;
        boolean J4 = q1Var.Q5.J4();
        fj fjVar = q1Var.Q5;
        if (fjVar.f23968k.action instanceof TLRPC.TL_messageActionConferenceCall) {
            if (fjVar.P3()) {
                drawable = org.telegram.ui.ActionBar.n6.O4;
            } else {
                drawable = org.telegram.ui.ActionBar.n6.P4;
            }
            if (this.f32154e == null) {
                Resources resources = q1Var.getContext().getResources();
                if (q1Var.Q5.J4()) {
                    i13 = 2131231184;
                } else {
                    i13 = 2131231091;
                }
                this.f32154e = resources.getDrawable(i13).mutate();
            }
            if (q1Var.Q5.P3()) {
                i12 = org.telegram.ui.ActionBar.n6.Mb;
            } else {
                i12 = org.telegram.ui.ActionBar.n6.f29719ud;
            }
            int w02 = org.telegram.ui.ActionBar.n6.w0(i12, q1Var.Qb);
            if (this.d != w02) {
                Drawable drawable3 = this.f32154e;
                this.d = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            drawable2 = this.f32154e;
        } else if (fjVar.P3()) {
            drawable = org.telegram.ui.ActionBar.n6.O4;
            if (q1Var.Q5.J4()) {
                q1Var.A2();
                drawable2 = q1Var.Z1("drawableMsgOutCallVideo");
            } else {
                if (q1Var.A2()) {
                    str = "drawableMsgOutCallAudioSelected";
                } else {
                    str = "drawableMsgOutCallAudio";
                }
                drawable2 = q1Var.Z1(str);
            }
        } else {
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = q1Var.Q5.f23968k.action.reason;
            if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) {
                drawable = org.telegram.ui.ActionBar.n6.Q4;
            } else {
                drawable = org.telegram.ui.ActionBar.n6.P4;
            }
            if (q1Var.A2()) {
                drawable2 = org.telegram.ui.ActionBar.n6.H4[J4 ? 1 : 0];
            } else {
                drawable2 = org.telegram.ui.ActionBar.n6.G4[J4 ? 1 : 0];
            }
        }
        Drawable drawable4 = drawable;
        Drawable drawable5 = drawable2;
        if (q1Var.Q5.P3()) {
            org.telegram.ui.ActionBar.n6.O2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Wc, q1Var.Qb));
            TextPaint textPaint = org.telegram.ui.ActionBar.n6.S2;
            if (q1Var.A2()) {
                i11 = org.telegram.ui.ActionBar.n6.f29420ec;
            } else {
                i11 = org.telegram.ui.ActionBar.n6.f29511jc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(i11, q1Var.Qb));
        } else {
            org.telegram.ui.ActionBar.n6.O2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Vc, q1Var.Qb));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.n6.S2;
            if (q1Var.A2()) {
                i7 = org.telegram.ui.ActionBar.n6.fe;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.f29422ee;
            }
            textPaint2.setColor(org.telegram.ui.ActionBar.n6.w0(i7, q1Var.Qb));
        }
        q1Var.G9 = true;
        if (q1Var.Q5.P3()) {
            L = org.telegram.messenger.g0.L(16.0f) + (q1Var.f31321d7 - q1Var.f31295b7);
        } else if (q1Var.b3()) {
            L = org.telegram.messenger.g0.L(74.0f);
        } else {
            L = org.telegram.messenger.g0.L(25.0f);
        }
        q1Var.S3 = L;
        if (gd.f24216a0) {
            L = org.telegram.messenger.f3.C(12.0f, drawable5.getIntrinsicWidth(), L);
        }
        int i14 = L;
        if (q1Var.f31459o2 != null) {
            canvas.save();
            canvas.translate(i14, org.telegram.messenger.g0.L(12.0f) + q1Var.Ua);
            q1Var.f31459o2.draw(canvas);
            canvas.restore();
        }
        float f11 = -19.0f;
        if (q1Var.f31330e3 != null) {
            canvas.save();
            if (gd.f24216a0) {
                f10 = -19.0f;
            } else {
                f10 = 19.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f10) + i14, org.telegram.messenger.g0.L(37.0f) + q1Var.Ua);
            q1Var.f31330e3.draw(canvas);
            canvas.restore();
        }
        if (this.f32153c != null && this.f32152b != null) {
            canvas.save();
            if (!gd.f24216a0) {
                f11 = 19.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(f11) + i14 + q1Var.f31344f3, org.telegram.messenger.g0.L(36.0f) + q1Var.Ua);
            this.f32152b.g(canvas);
            canvas.translate(this.f32152b.A + org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f));
            this.f32153c.c(0.0f, 0.0f, 1.0f, org.telegram.ui.ActionBar.n6.S2.getColor(), canvas);
            canvas.restore();
        }
        int i15 = 0;
        if (gd.f24216a0 && (staticLayout = q1Var.f31330e3) != null) {
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
        if (!gd.f24216a0) {
            i15 = q1Var.f31295b7 - org.telegram.messenger.g0.L(70.0f);
        }
        z.s(org.telegram.messenger.g0.L(!J4 ? 1 : 0) + i16 + i15, q1Var.T3, drawable5);
        drawable5.draw(canvas);
    }

    public final void b(org.telegram.messenger.fj r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v1.b(org.telegram.messenger.fj, boolean):void");
    }
}
