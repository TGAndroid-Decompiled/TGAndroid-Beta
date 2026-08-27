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

public final class ds0 implements ht {

    public final String f37538a;

    public final VideoEditedInfo f37539b;

    public final MediaController.PhotoEntry f37540c;
    public final boolean d;

    public final int f37541e;

    public final int f37542f;

    public final boolean f37543g;
    public final PhotoViewer h;

    public ds0(PhotoViewer photoViewer, String str, VideoEditedInfo videoEditedInfo, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11) {
        this.h = photoViewer;
        this.f37538a = str;
        this.f37539b = videoEditedInfo;
        this.f37540c = photoEntry;
        this.d = z10;
        this.f37541e = i10;
        this.f37542f = i11;
        this.f37543g = z11;
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
    public final void E(CharSequence charSequence, String str, df dfVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f35753s7 = true;
        R();
        photoViewer.f35688l5.p(this.f37538a, this.f37539b, str, charSequence, false, 0L, null, null, photoViewer.v1(), this.f37540c.thumbPath, dfVar, null);
    }

    @Override
    public final String F(boolean z10) {
        return null;
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final boolean I() {
        return this.h.f35725p7 != null;
    }

    @Override
    public final org.telegram.ui.Components.b70 L(ag.y1 y1Var) {
        return null;
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public final void O(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f35753s7 = true;
        R();
        photoViewer.f35688l5.p(this.f37538a, this.f37539b, str, null, true, 0L, null, null, photoViewer.v1(), this.f37540c.thumbPath, null, null);
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
        kt ktVarQ = kt.q();
        ImageReceiver imageReceiver = ktVarQ.A;
        MediaController.PhotoEntry photoEntry = this.f37540c;
        if (photoEntry.thumbPath != null) {
            try {
                new File(photoEntry.thumbPath).delete();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            photoEntry.thumbPath = null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (imageReceiver != null) {
            imageReceiver.setAlpha(1.0f);
            imageReceiver.setImageCoords(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            imageReceiver.draw(canvas);
        }
        if (ktVarQ.C != null) {
            canvas.save();
            canvas.scale(bitmapCreateBitmap.getWidth() / ktVarQ.C.getWidth(), bitmapCreateBitmap.getHeight() / ktVarQ.C.getHeight());
            ktVarQ.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, ktVarQ.C.getWidth(), ktVarQ.C.getHeight());
            path.addRoundRect(rectF, ktVarQ.C.getWidth() / 8.0f, ktVarQ.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            ktVarQ.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.P8;
        PhotoViewer photoViewer = this.h;
        photoEntry.thumbPath = FileLoader.getInstance(photoViewer.P).getPathToAttach(ImageLoader.scaleAndSaveImage(bitmapCreateBitmap, photoViewer.g1(), 512.0f, 512.0f, 83, false, 101, 101), true).toString();
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
    public final boolean k(int i10) {
        return false;
    }

    @Override
    public final void m(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f35753s7 = true;
        R();
        photoViewer.f35688l5.p(this.f37538a, this.f37539b, str, null, false, 0L, null, null, photoViewer.v1(), this.f37540c.thumbPath, null, photoViewer.f35762t7);
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f35753s7 = true;
        R();
        photoViewer.f35688l5.p(this.f37538a, this.f37539b, str, null, false, 0L, stickerSet, photoViewer.f35725p7, photoViewer.v1(), this.f37540c.thumbPath, null, null);
    }

    @Override
    public final boolean w() {
        PhotoViewer photoViewer = this.h;
        au0 au0Var = photoViewer.d;
        if (au0Var != null) {
            return (au0Var.P() && photoViewer.f35652h4 == null) ? false : true;
        }
        return false;
    }

    @Override
    public final void x(String str) {
        PhotoViewer photoViewer = this.h;
        au0 au0Var = photoViewer.d;
        if (au0Var == null) {
            return;
        }
        boolean zP = au0Var.P();
        MediaController.PhotoEntry photoEntry = this.f37540c;
        if (zP) {
            if (photoViewer.f35652h4 == null) {
                return;
            }
            photoViewer.f35753s7 = true;
            R();
            photoViewer.f35688l5.p(this.f37538a, this.f37539b, str, null, false, photoViewer.f35652h4.a(), null, null, photoViewer.v1(), photoEntry.thumbPath, null, null);
            return;
        }
        photoViewer.f35753s7 = true;
        R();
        photoEntry.imagePath = this.f37538a;
        photoViewer.d.o(photoViewer.L4, this.f37539b, this.d, this.f37541e, this.f37542f, this.f37543g);
        NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.TRUE);
    }

    @Override
    public final MessageObject y() {
        return null;
    }

    @Override
    public final boolean z() {
        return this.h.f35762t7 != null;
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
    public final void K() {
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
