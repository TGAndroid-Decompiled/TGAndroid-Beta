package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mt0 implements vt {
    public final String f38342a;
    public final VideoEditedInfo f38343b;
    public final MediaController.PhotoEntry f38344c;
    public final boolean d;
    public final int e;
    public final int f38345f;
    public final boolean f38346g;
    public final PhotoViewer h;

    public mt0(PhotoViewer photoViewer, String str, VideoEditedInfo videoEditedInfo, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11) {
        this.h = photoViewer;
        this.f38342a = str;
        this.f38343b = videoEditedInfo;
        this.f38344c = photoEntry;
        this.d = z10;
        this.e = i10;
        this.f38345f = i11;
        this.f38346g = z11;
    }

    @Override
    public final MessageObject A() {
        return null;
    }

    @Override
    public final boolean B() {
        if (this.h.f32403x7 != null) {
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
    public final String G(boolean z10) {
        return null;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final boolean J() {
        if (this.h.f32365t7 != null) {
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
        photoViewer.f32393w7 = true;
        R();
        photoViewer.p5.p(this.f38342a, this.f38343b, str, null, true, 0L, null, null, photoViewer.v1(), this.f38344c.thumbPath, null, null);
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
        xt q6 = xt.q();
        ImageReceiver imageReceiver = q6.A;
        MediaController.PhotoEntry photoEntry = this.f38344c;
        if (photoEntry.thumbPath != null) {
            try {
                new File(photoEntry.thumbPath).delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoEntry.thumbPath = null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (imageReceiver != null) {
            imageReceiver.setAlpha(1.0f);
            imageReceiver.setImageCoords(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
            imageReceiver.draw(canvas);
        }
        if (q6.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / q6.C.getWidth(), createBitmap.getHeight() / q6.C.getHeight());
            q6.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, q6.C.getWidth(), q6.C.getHeight());
            path.addRoundRect(rectF, q6.C.getWidth() / 8.0f, q6.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            q6.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        PhotoViewer photoViewer = this.h;
        photoEntry.thumbPath = FileLoader.getInstance(photoViewer.T).getPathToAttach(ImageLoader.scaleAndSaveImage(createBitmap, photoViewer.g1(), 512.0f, 512.0f, 83, false, 101, 101), true).toString();
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
    public final void f(CharSequence charSequence, String str, mt mtVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f32393w7 = true;
        R();
        photoViewer.p5.p(this.f38342a, this.f38343b, str, charSequence, false, 0L, null, null, photoViewer.v1(), this.f38344c.thumbPath, mtVar, null);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer h() {
        return null;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        return false;
    }

    @Override
    public final void n(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f32393w7 = true;
        R();
        photoViewer.p5.p(this.f38342a, this.f38343b, str, null, false, 0L, null, null, photoViewer.v1(), this.f38344c.thumbPath, null, photoViewer.f32403x7);
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final org.telegram.ui.Components.m80 u(ah.v vVar) {
        return null;
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f32393w7 = true;
        R();
        photoViewer.p5.p(this.f38342a, this.f38343b, str, null, false, 0L, stickerSet, photoViewer.f32365t7, photoViewer.v1(), this.f38344c.thumbPath, null, null);
    }

    @Override
    public final boolean y() {
        PhotoViewer photoViewer = this.h;
        iv0 iv0Var = photoViewer.d;
        if (iv0Var != null) {
            if (!iv0Var.P() || photoViewer.l4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void z(String str) {
        PhotoViewer photoViewer = this.h;
        iv0 iv0Var = photoViewer.d;
        if (iv0Var != null) {
            boolean P = iv0Var.P();
            MediaController.PhotoEntry photoEntry = this.f38344c;
            if (P) {
                if (photoViewer.l4 == null) {
                    return;
                }
                photoViewer.f32393w7 = true;
                R();
                photoViewer.p5.p(this.f38342a, this.f38343b, str, null, false, photoViewer.l4.a(), null, null, photoViewer.v1(), photoEntry.thumbPath, null, null);
                return;
            }
            photoViewer.f32393w7 = true;
            R();
            photoEntry.imagePath = this.f38342a;
            photoViewer.d.o(photoViewer.P4, this.f38343b, this.d, this.e, this.f38345f, this.f38346g);
            NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.TRUE);
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
    public final void K() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void q(TLRPC.Document document) {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void v(TLRPC.Document document) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
