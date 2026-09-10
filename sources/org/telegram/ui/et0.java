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
public final class et0 implements rt {
    public final String f32602a;
    public final VideoEditedInfo f32603b;
    public final MediaController.PhotoEntry f32604c;
    public final boolean d;
    public final int e;
    public final int f32605f;
    public final boolean f32606g;
    public final PhotoViewer h;

    public et0(PhotoViewer photoViewer, String str, VideoEditedInfo videoEditedInfo, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11) {
        this.h = photoViewer;
        this.f32602a = str;
        this.f32603b = videoEditedInfo;
        this.f32604c = photoEntry;
        this.d = z10;
        this.e = i10;
        this.f32605f = i11;
        this.f32606g = z11;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        return false;
    }

    @Override
    public final String E(boolean z10) {
        return null;
    }

    @Override
    public final void F(CharSequence charSequence, String str, pf pfVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f30215w7 = true;
        R();
        photoViewer.p5.p(this.f32602a, this.f32603b, str, charSequence, false, 0L, null, null, photoViewer.v1(), this.f32604c.thumbPath, pfVar, null);
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final boolean I() {
        if (this.h.f30187t7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Components.w70 K(bi.n7 n7Var) {
        return null;
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public final void O(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f30215w7 = true;
        R();
        photoViewer.p5.p(this.f32602a, this.f32603b, str, null, true, 0L, null, null, photoViewer.v1(), this.f32604c.thumbPath, null, null);
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
        tt q6 = tt.q();
        ImageReceiver imageReceiver = q6.A;
        MediaController.PhotoEntry photoEntry = this.f32604c;
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
        Drawable[] drawableArr = PhotoViewer.T8;
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
    public final boolean k(int i10) {
        return false;
    }

    @Override
    public final void m(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f30215w7 = true;
        R();
        photoViewer.p5.p(this.f32602a, this.f32603b, str, null, false, 0L, null, null, photoViewer.v1(), this.f32604c.thumbPath, null, photoViewer.f30225x7);
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f30215w7 = true;
        R();
        photoViewer.p5.p(this.f32602a, this.f32603b, str, null, false, 0L, stickerSet, photoViewer.f30187t7, photoViewer.v1(), this.f32604c.thumbPath, null, null);
    }

    @Override
    public final boolean w() {
        PhotoViewer photoViewer = this.h;
        cv0 cv0Var = photoViewer.d;
        if (cv0Var != null) {
            if (!cv0Var.P() || photoViewer.l4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void x(String str) {
        PhotoViewer photoViewer = this.h;
        cv0 cv0Var = photoViewer.d;
        if (cv0Var != null) {
            boolean P = cv0Var.P();
            MediaController.PhotoEntry photoEntry = this.f32604c;
            if (P) {
                if (photoViewer.l4 == null) {
                    return;
                }
                photoViewer.f30215w7 = true;
                R();
                photoViewer.p5.p(this.f32602a, this.f32603b, str, null, false, photoViewer.l4.a(), null, null, photoViewer.v1(), photoEntry.thumbPath, null, null);
                return;
            }
            photoViewer.f30215w7 = true;
            R();
            photoEntry.imagePath = this.f32602a;
            photoViewer.d.o(photoViewer.P4, this.f32603b, this.d, this.e, this.f32605f, this.f32606g);
            NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.TRUE);
        }
    }

    @Override
    public final MessageObject y() {
        return null;
    }

    @Override
    public final boolean z() {
        if (this.h.f30225x7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void A(TLRPC.Document document) {
    }

    @Override
    public final void D(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void n(TLRPC.Document document) {
    }

    @Override
    public final void p(TLRPC.Document document) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t(TLRPC.Document document) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
