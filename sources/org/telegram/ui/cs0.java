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
public final class cs0 implements ft {
    public final String f37314a;
    public final VideoEditedInfo f37315b;
    public final MediaController.PhotoEntry f37316c;
    public final boolean d;
    public final int f37317e;
    public final int f37318f;
    public final boolean f37319g;
    public final PhotoViewer h;

    public cs0(PhotoViewer photoViewer, String str, VideoEditedInfo videoEditedInfo, MediaController.PhotoEntry photoEntry, boolean z10, int i9, int i10, boolean z11) {
        this.h = photoViewer;
        this.f37314a = str;
        this.f37315b = videoEditedInfo;
        this.f37316c = photoEntry;
        this.d = z10;
        this.f37317e = i9;
        this.f37318f = i10;
        this.f37319g = z11;
    }

    @Override
    public final boolean A() {
        if (this.h.f35759t7 != null) {
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
    public final void F(CharSequence charSequence, String str, df dfVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f35750s7 = true;
        R();
        photoViewer.f35685l5.p(this.f37314a, this.f37315b, str, charSequence, false, 0L, null, null, photoViewer.v1(), this.f37316c.thumbPath, dfVar, null);
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
        if (this.h.f35721p7 != null) {
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
        photoViewer.f35750s7 = true;
        R();
        photoViewer.f35685l5.p(this.f37314a, this.f37315b, str, null, true, 0L, null, null, photoViewer.v1(), this.f37316c.thumbPath, null, null);
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
        ht q10 = ht.q();
        ImageReceiver imageReceiver = q10.A;
        MediaController.PhotoEntry photoEntry = this.f37316c;
        if (photoEntry.thumbPath != null) {
            try {
                new File(photoEntry.thumbPath).delete();
            } catch (Exception e10) {
                FileLog.e(e10);
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
        if (q10.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / q10.C.getWidth(), createBitmap.getHeight() / q10.C.getHeight());
            q10.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, q10.C.getWidth(), q10.C.getHeight());
            path.addRoundRect(rectF, q10.C.getWidth() / 8.0f, q10.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            q10.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.P8;
        PhotoViewer photoViewer = this.h;
        photoEntry.thumbPath = FileLoader.getInstance(photoViewer.P).getPathToAttach(ImageLoader.scaleAndSaveImage(createBitmap, photoViewer.g1(), 512.0f, 512.0f, 83, false, 101, 101), true).toString();
    }

    @Override
    public final long a() {
        return this.h.A5;
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
    public final boolean k(int i9) {
        return false;
    }

    @Override
    public final void m(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f35750s7 = true;
        R();
        photoViewer.f35685l5.p(this.f37314a, this.f37315b, str, null, false, 0L, null, null, photoViewer.v1(), this.f37316c.thumbPath, null, photoViewer.f35759t7);
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final org.telegram.ui.Components.x60 r(fh.v vVar) {
        return null;
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f35750s7 = true;
        R();
        photoViewer.f35685l5.p(this.f37314a, this.f37315b, str, null, false, 0L, stickerSet, photoViewer.f35721p7, photoViewer.v1(), this.f37316c.thumbPath, null, null);
    }

    @Override
    public final boolean x() {
        PhotoViewer photoViewer = this.h;
        zt0 zt0Var = photoViewer.d;
        if (zt0Var != null) {
            if (!zt0Var.P() || photoViewer.f35649h4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void y(String str) {
        PhotoViewer photoViewer = this.h;
        zt0 zt0Var = photoViewer.d;
        if (zt0Var != null) {
            boolean P = zt0Var.P();
            MediaController.PhotoEntry photoEntry = this.f37316c;
            if (P) {
                if (photoViewer.f35649h4 == null) {
                    return;
                }
                photoViewer.f35750s7 = true;
                R();
                photoViewer.f35685l5.p(this.f37314a, this.f37315b, str, null, false, photoViewer.f35649h4.a(), null, null, photoViewer.v1(), photoEntry.thumbPath, null, null);
                return;
            }
            photoViewer.f35750s7 = true;
            R();
            photoEntry.imagePath = this.f37314a;
            photoViewer.d.o(photoViewer.L4, this.f37315b, this.d, this.f37317e, this.f37318f, this.f37319g);
            NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.TRUE);
        }
    }

    @Override
    public final MessageObject z() {
        return null;
    }

    @Override
    public final void B(TLRPC.Document document) {
    }

    @Override
    public final void E(TLRPC.Document document) {
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
    public final void t() {
    }

    @Override
    public final void u(TLRPC.Document document) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void s(int i9, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i9, int i10) {
    }
}
