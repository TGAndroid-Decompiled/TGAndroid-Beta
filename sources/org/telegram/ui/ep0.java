package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ep0 implements ls {
    public final String f47288a;
    public final org.telegram.messenger.e20 f47289b;
    public final org.telegram.messenger.ef f47290c;
    public final boolean d;
    public final int f47291e;
    public final int f47292f;
    public final boolean f47293g;
    public final PhotoViewer h;

    public ep0(PhotoViewer photoViewer, String str, org.telegram.messenger.e20 e20Var, org.telegram.messenger.ef efVar, boolean z10, int i7, int i10, boolean z11) {
        this.h = photoViewer;
        this.f47288a = str;
        this.f47289b = e20Var;
        this.f47290c = efVar;
        this.d = z10;
        this.f47291e = i7;
        this.f47292f = i10;
        this.f47293g = z11;
    }

    @Override
    public final boolean A() {
        if (this.h.f43373x7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.y60 E(ai.k0 k0Var) {
        return null;
    }

    @Override
    public final String G(boolean z10) {
        return null;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final boolean J() {
        if (this.h.f43335t7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public final void O(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f43363w7 = true;
        R();
        photoViewer.f43297p5.p(this.f47288a, this.f47289b, str, null, true, 0L, null, null, photoViewer.r1(), this.f47290c.f27848c, null, null);
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override
    public final boolean Q() {
        return true;
    }

    public final void R() {
        ns p10 = ns.p();
        ImageReceiver imageReceiver = p10.A;
        org.telegram.messenger.ef efVar = this.f47290c;
        if (efVar.f27848c != null) {
            try {
                new File(efVar.f27848c).delete();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            efVar.f27848c = null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (imageReceiver != null) {
            imageReceiver.setAlpha(1.0f);
            imageReceiver.y0(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
            imageReceiver.h(canvas, null);
        }
        if (p10.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / p10.C.getWidth(), createBitmap.getHeight() / p10.C.getHeight());
            p10.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, p10.C.getWidth(), p10.C.getHeight());
            path.addRoundRect(rectF, p10.C.getWidth() / 8.0f, p10.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            p10.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.Z8;
        PhotoViewer photoViewer = this.h;
        TLRPC.PhotoSize a02 = org.telegram.messenger.ec.a0(createBitmap, photoViewer.c1(), 512.0f, 512.0f, 83);
        org.telegram.messenger.w7.G(photoViewer.U);
        efVar.f27848c = org.telegram.messenger.w7.J(a02, null, true, true).toString();
    }

    @Override
    public final long a() {
        return this.h.E5;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i7) {
        return false;
    }

    @Override
    public final void m(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f43363w7 = true;
        R();
        photoViewer.f43297p5.p(this.f47288a, this.f47289b, str, null, false, 0L, null, null, photoViewer.r1(), this.f47290c.f27848c, null, photoViewer.f43373x7);
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f43363w7 = true;
        R();
        photoViewer.f43297p5.p(this.f47288a, this.f47289b, str, null, false, 0L, stickerSet, photoViewer.f43335t7, photoViewer.r1(), this.f47290c.f27848c, null, null);
    }

    @Override
    public final boolean w() {
        uq0 uq0Var;
        TLRPC.Chat chat;
        PhotoViewer photoViewer = this.h;
        bn bnVar = photoViewer.f43262l4;
        if ((bnVar == null || (chat = bnVar.f45978e) == null || org.telegram.messenger.v3.t(chat)) && (uq0Var = photoViewer.d) != null) {
            if (!uq0Var.Q() || photoViewer.f43262l4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void x(String str) {
        PhotoViewer photoViewer = this.h;
        uq0 uq0Var = photoViewer.d;
        if (uq0Var != null) {
            boolean Q = uq0Var.Q();
            org.telegram.messenger.ef efVar = this.f47290c;
            if (Q) {
                if (photoViewer.f43262l4 == null) {
                    return;
                }
                photoViewer.f43363w7 = true;
                R();
                photoViewer.f43297p5.p(this.f47288a, this.f47289b, str, null, false, photoViewer.f43262l4.a(), null, null, photoViewer.r1(), efVar.f27848c, null, null);
                return;
            }
            photoViewer.f43363w7 = true;
            R();
            efVar.h = this.f47288a;
            photoViewer.d.o(photoViewer.P4, this.f47289b, this.d, this.f47291e, this.f47292f, this.f47293g);
            org.telegram.messenger.ks.f(org.telegram.messenger.j10.f24770t0).m(org.telegram.messenger.ks.f25201u3, Boolean.TRUE);
        }
    }

    @Override
    public final void y(CharSequence charSequence, String str, org.telegram.ui.Components.ph phVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f43363w7 = true;
        R();
        photoViewer.f43297p5.p(this.f47288a, this.f47289b, str, charSequence, false, 0L, null, null, photoViewer.r1(), this.f47290c.f27848c, phVar, null);
    }

    @Override
    public final org.telegram.messenger.fj z() {
        return null;
    }

    @Override
    public final void B(TLRPC.Document document) {
    }

    @Override
    public final void F(TLRPC.Document document) {
    }

    @Override
    public final void H(TLRPC.Document document) {
    }

    @Override
    public final void i(org.telegram.messenger.sy syVar) {
    }

    @Override
    public final void n(TLRPC.Document document) {
    }

    @Override
    public final void p(TLRPC.Document document) {
    }

    @Override
    public final void t(TLRPC.Document document) {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
