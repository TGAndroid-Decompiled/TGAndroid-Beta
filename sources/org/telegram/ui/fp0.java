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
public final class fp0 implements ks {
    public final String f45771a;
    public final org.telegram.messenger.j20 f45772b;
    public final org.telegram.messenger.gf f45773c;
    public final boolean d;
    public final int f45774e;
    public final int f45775f;
    public final boolean f45776g;
    public final PhotoViewer h;

    public fp0(PhotoViewer photoViewer, String str, org.telegram.messenger.j20 j20Var, org.telegram.messenger.gf gfVar, boolean z9, int i7, int i10, boolean z10) {
        this.h = photoViewer;
        this.f45771a = str;
        this.f45772b = j20Var;
        this.f45773c = gfVar;
        this.d = z9;
        this.f45774e = i7;
        this.f45775f = i10;
        this.f45776g = z10;
    }

    @Override
    public final org.telegram.messenger.ij A() {
        return null;
    }

    @Override
    public final boolean B() {
        if (this.h.f41556w7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        return false;
    }

    @Override
    public final String G(boolean z9) {
        return null;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final boolean J() {
        if (this.h.f41520s7 != null) {
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
        photoViewer.f41546v7 = true;
        R();
        photoViewer.f41481o5.p(this.f45771a, this.f45772b, str, null, true, 0L, null, null, photoViewer.r1(), this.f45773c.f26846c, null, null);
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
        ms p10 = ms.p();
        ImageReceiver imageReceiver = p10.A;
        org.telegram.messenger.gf gfVar = this.f45773c;
        if (gfVar.f26846c != null) {
            try {
                new File(gfVar.f26846c).delete();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            gfVar.f26846c = null;
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
        Drawable[] drawableArr = PhotoViewer.Y8;
        PhotoViewer photoViewer = this.h;
        TLRPC.PhotoSize a02 = org.telegram.messenger.gc.a0(createBitmap, photoViewer.b1(), 512.0f, 512.0f, 83);
        org.telegram.messenger.w7.G(photoViewer.T);
        gfVar.f26846c = org.telegram.messenger.w7.J(a02, null, true, true).toString();
    }

    @Override
    public final long a() {
        return this.h.D5;
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
    public final org.telegram.ui.Components.l60 m(bi.x5 x5Var) {
        return null;
    }

    @Override
    public final void n(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f41546v7 = true;
        R();
        photoViewer.f41481o5.p(this.f45771a, this.f45772b, str, null, false, 0L, null, null, photoViewer.r1(), this.f45773c.f26846c, null, photoViewer.f41556w7);
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final void u(CharSequence charSequence, String str, org.telegram.ui.Components.fx fxVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f41546v7 = true;
        R();
        photoViewer.f41481o5.p(this.f45771a, this.f45772b, str, charSequence, false, 0L, null, null, photoViewer.r1(), this.f45773c.f26846c, fxVar, null);
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f41546v7 = true;
        R();
        photoViewer.f41481o5.p(this.f45771a, this.f45772b, str, null, false, 0L, stickerSet, photoViewer.f41520s7, photoViewer.r1(), this.f45773c.f26846c, null, null);
    }

    @Override
    public final boolean y() {
        wq0 wq0Var;
        TLRPC.Chat chat;
        PhotoViewer photoViewer = this.h;
        cn cnVar = photoViewer.f41447k4;
        if ((cnVar == null || (chat = cnVar.f44432e) == null || org.telegram.messenger.t3.t(chat)) && (wq0Var = photoViewer.d) != null) {
            if (!wq0Var.Q() || photoViewer.f41447k4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void z(String str) {
        PhotoViewer photoViewer = this.h;
        wq0 wq0Var = photoViewer.d;
        if (wq0Var != null) {
            boolean Q = wq0Var.Q();
            org.telegram.messenger.gf gfVar = this.f45773c;
            if (Q) {
                if (photoViewer.f41447k4 == null) {
                    return;
                }
                photoViewer.f41546v7 = true;
                R();
                photoViewer.f41481o5.p(this.f45771a, this.f45772b, str, null, false, photoViewer.f41447k4.a(), null, null, photoViewer.r1(), gfVar.f26846c, null, null);
                return;
            }
            photoViewer.f41546v7 = true;
            R();
            gfVar.h = this.f45771a;
            photoViewer.d.o(photoViewer.O4, this.f45772b, this.d, this.f45774e, this.f45775f, this.f45776g);
            org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24470s0).m(org.telegram.messenger.qs.f25074s3, Boolean.TRUE);
        }
    }

    @Override
    public final void C(TLRPC.Document document) {
    }

    @Override
    public final void F(TLRPC.Document document) {
    }

    @Override
    public final void H(TLRPC.Document document) {
    }

    @Override
    public final void i(org.telegram.messenger.zy zyVar) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void q(TLRPC.Document document) {
    }

    @Override
    public final void v(TLRPC.Document document) {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
    }

    @Override
    public final void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
    }
}
