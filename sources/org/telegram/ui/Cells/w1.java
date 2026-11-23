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
import org.telegram.ui.Components.xy0;
public final class w1 {
    public final r1 f32206a;
    public org.telegram.ui.Components.d9 f32207b;
    public xy0 f32208c;
    public int d;
    public Drawable f32209e;

    public w1(r1 r1Var) {
        this.f32206a = r1Var;
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
        r1 r1Var = this.f32206a;
        boolean J4 = r1Var.Q5.J4();
        gj gjVar = r1Var.Q5;
        if (gjVar.f24177k.action instanceof TLRPC.TL_messageActionConferenceCall) {
            if (gjVar.P3()) {
                drawable = org.telegram.ui.ActionBar.m6.O4;
            } else {
                drawable = org.telegram.ui.ActionBar.m6.P4;
            }
            if (this.f32209e == null) {
                Resources resources = r1Var.getContext().getResources();
                if (r1Var.Q5.J4()) {
                    i13 = 2131231184;
                } else {
                    i13 = 2131231091;
                }
                this.f32209e = resources.getDrawable(i13).mutate();
            }
            if (r1Var.Q5.P3()) {
                i12 = org.telegram.ui.ActionBar.m6.Mb;
            } else {
                i12 = org.telegram.ui.ActionBar.m6.f29670ud;
            }
            int w02 = org.telegram.ui.ActionBar.m6.w0(i12, r1Var.Qb);
            if (this.d != w02) {
                Drawable drawable3 = this.f32209e;
                this.d = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            drawable2 = this.f32209e;
        } else if (gjVar.P3()) {
            drawable = org.telegram.ui.ActionBar.m6.O4;
            if (r1Var.Q5.J4()) {
                r1Var.A2();
                drawable2 = r1Var.Z1("drawableMsgOutCallVideo");
            } else {
                if (r1Var.A2()) {
                    str = "drawableMsgOutCallAudioSelected";
                } else {
                    str = "drawableMsgOutCallAudio";
                }
                drawable2 = r1Var.Z1(str);
            }
        } else {
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = r1Var.Q5.f24177k.action.reason;
            if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) {
                drawable = org.telegram.ui.ActionBar.m6.Q4;
            } else {
                drawable = org.telegram.ui.ActionBar.m6.P4;
            }
            if (r1Var.A2()) {
                drawable2 = org.telegram.ui.ActionBar.m6.H4[J4 ? 1 : 0];
            } else {
                drawable2 = org.telegram.ui.ActionBar.m6.G4[J4 ? 1 : 0];
            }
        }
        Drawable drawable4 = drawable;
        Drawable drawable5 = drawable2;
        if (r1Var.Q5.P3()) {
            org.telegram.ui.ActionBar.m6.O2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Wc, r1Var.Qb));
            TextPaint textPaint = org.telegram.ui.ActionBar.m6.S2;
            if (r1Var.A2()) {
                i11 = org.telegram.ui.ActionBar.m6.f29371ec;
            } else {
                i11 = org.telegram.ui.ActionBar.m6.f29462jc;
            }
            textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(i11, r1Var.Qb));
        } else {
            org.telegram.ui.ActionBar.m6.O2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Vc, r1Var.Qb));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.m6.S2;
            if (r1Var.A2()) {
                i7 = org.telegram.ui.ActionBar.m6.fe;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.f29373ee;
            }
            textPaint2.setColor(org.telegram.ui.ActionBar.m6.w0(i7, r1Var.Qb));
        }
        r1Var.G9 = true;
        if (r1Var.Q5.P3()) {
            L = org.telegram.messenger.g0.L(16.0f) + (r1Var.f31368d7 - r1Var.f31342b7);
        } else if (r1Var.b3()) {
            L = org.telegram.messenger.g0.L(74.0f);
        } else {
            L = org.telegram.messenger.g0.L(25.0f);
        }
        r1Var.S3 = L;
        if (hd.f24408a0) {
            L = org.telegram.messenger.f3.C(12.0f, drawable5.getIntrinsicWidth(), L);
        }
        int i14 = L;
        if (r1Var.f31506o2 != null) {
            canvas.save();
            canvas.translate(i14, org.telegram.messenger.g0.L(12.0f) + r1Var.Ua);
            r1Var.f31506o2.draw(canvas);
            canvas.restore();
        }
        float f11 = -19.0f;
        if (r1Var.f31377e3 != null) {
            canvas.save();
            if (hd.f24408a0) {
                f10 = -19.0f;
            } else {
                f10 = 19.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(f10) + i14, org.telegram.messenger.g0.L(37.0f) + r1Var.Ua);
            r1Var.f31377e3.draw(canvas);
            canvas.restore();
        }
        if (this.f32208c != null && this.f32207b != null) {
            canvas.save();
            if (!hd.f24408a0) {
                f11 = 19.0f;
            }
            canvas.translate(org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(f11) + i14 + r1Var.f31391f3, org.telegram.messenger.g0.L(36.0f) + r1Var.Ua);
            this.f32207b.g(canvas);
            canvas.translate(this.f32207b.A + org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f));
            this.f32208c.c(0.0f, 0.0f, 1.0f, org.telegram.ui.ActionBar.m6.S2.getColor(), canvas);
            canvas.restore();
        }
        int i15 = 0;
        if (hd.f24408a0 && (staticLayout = r1Var.f31377e3) != null) {
            i10 = staticLayout.getWidth() - drawable4.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        z.s((i14 + i10) - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(37.0f) + r1Var.Ua, drawable4);
        drawable4.draw(canvas);
        Drawable drawable6 = r1Var.J2[0];
        if (drawable6 != null && r1Var.L2[0] == 4) {
            drawable6.draw(canvas);
        }
        boolean z10 = r1Var.G;
        if (!z10 && !r1Var.F) {
            r1Var.T3 = org.telegram.messenger.g0.L(18.5f);
        } else if (z10 && r1Var.F) {
            r1Var.T3 = org.telegram.messenger.g0.L(18.0f);
        } else if (!z10) {
            r1Var.T3 = org.telegram.messenger.g0.L(17.0f);
        } else {
            r1Var.T3 = org.telegram.messenger.g0.L(19.0f);
        }
        int i16 = r1Var.S3;
        if (!hd.f24408a0) {
            i15 = r1Var.f31342b7 - org.telegram.messenger.g0.L(70.0f);
        }
        z.s(org.telegram.messenger.g0.L(!J4 ? 1 : 0) + i16 + i15, r1Var.T3, drawable5);
        drawable5.draw(canvas);
    }

    public final void b(org.telegram.messenger.gj r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w1.b(org.telegram.messenger.gj, boolean):void");
    }
}
