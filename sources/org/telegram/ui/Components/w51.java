package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class w51 extends Drawable implements q5, r6, NotificationCenter.NotificationCenterDelegate {

    public final c20 f34115a;

    public final int f34116b;

    public float f34117c;
    public final boolean d;

    public ImageReceiver f34118e;

    public final HashSet f34119f;
    public final k5 h;

    public final v51 f34120n;

    public final ImageReceiver f34121r;

    public final int f34122s;
    public boolean v;

    public final TLRPC.TL_videoSizeStickerMarkup f34123w;

    public w51(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        c20 c20Var = new c20();
        this.f34115a = c20Var;
        this.f34119f = new HashSet();
        this.f34121r = new ImageReceiver();
        this.f34122s = UserConfig.selectedAccount;
        this.f34116b = i10;
        this.d = z10;
        c20Var.d(i0.b.k(videoSize.background_colors.get(0).intValue(), 255), videoSize.background_colors.size() > 1 ? i0.b.k(videoSize.background_colors.get(1).intValue(), 255) : 0, videoSize.background_colors.size() > 2 ? i0.b.k(videoSize.background_colors.get(2).intValue(), 255) : 0, videoSize.background_colors.size() > 3 ? i0.b.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            k5 k5Var = new k5((i10 == 1 && z10) ? 7 : i10 == 2 ? 15 : 8, UserConfig.selectedAccount, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id);
            this.h = k5Var;
            k5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f34123w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            v51 v51Var = new v51(this);
            this.f34120n = v51Var;
            v51Var.setInvalidateAll(true);
            if (i10 == 1) {
                v51Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f34119f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            k5 k5Var = this.h;
            if (k5Var != null) {
                k5Var.p(this);
            }
            v51 v51Var = this.f34120n;
            if (v51Var != null) {
                v51Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f34121r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f34123w != null) {
            NotificationCenter.getInstance(this.f34122s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.f34117c = imageReceiver.getRoundRadius()[0];
        HashSet hashSet = this.f34119f;
        if (hashSet.isEmpty()) {
            k5 k5Var = this.h;
            if (k5Var != null) {
                k5Var.b(this);
            }
            v51 v51Var = this.f34120n;
            if (v51Var != null) {
                v51Var.onAttachedToWindow();
            }
            ImageReceiver imageReceiver2 = this.f34121r;
            if (imageReceiver2 != null) {
                imageReceiver2.onAttachedToWindow();
            }
        }
        hashSet.add(imageReceiver);
        if (this.f34123w != null) {
            NotificationCenter.getInstance(this.f34122s).addObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    public final void d() {
        TLRPC.Document document;
        String str;
        String str2;
        String str3;
        MediaDataController mediaDataController = MediaDataController.getInstance(this.f34122s);
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = this.f34123w;
        TLRPC.TL_messages_stickerSet stickerSet = mediaDataController.getStickerSet(tL_videoSizeStickerMarkup.stickerset, false);
        if (stickerSet != null) {
            this.v = true;
            for (int i10 = 0; i10 < stickerSet.documents.size(); i10++) {
                if (stickerSet.documents.get(i10).f22386id == tL_videoSizeStickerMarkup.sticker_id) {
                    TLRPC.Document document2 = stickerSet.documents.get(i10);
                    boolean z10 = this.d;
                    int i11 = this.f34116b;
                    if (!z10 || i11 != 1) {
                        if (i11 == 2) {
                            str3 = "100_100";
                        } else {
                            document = null;
                            str = null;
                            str2 = "50_50_firstframe";
                        }
                        this.f34120n.setImage(ImageLocation.getForDocument(document2), str2, ImageLocation.getForDocument(document), str, null, null, DocumentObject.getSvgThumb(document2, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f), 0L, "tgs", document2, 0);
                        if (i11 == 3) {
                            this.f34121r.setImage(ImageLocation.getForDocument(document2), "100_100", null, null, null, 0L, "tgs", document2, 0);
                            return;
                        }
                        return;
                    }
                    str3 = "50_50";
                    str2 = str3;
                    str = "50_50_firstframe";
                    document = document2;
                    this.f34120n.setImage(ImageLocation.getForDocument(document2), str2, ImageLocation.getForDocument(document), str, null, null, DocumentObject.getSvgThumb(document2, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f), 0L, "tgs", document2, 0);
                    if (i11 == 3) {
                        this.f34121r.setImage(ImageLocation.getForDocument(document2), "100_100", null, null, null, 0L, "tgs", document2, 0);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.groupStickersDidLoad || this.v) {
            return;
        }
        d();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10 = getBounds().left;
        float f11 = getBounds().top;
        float f12 = getBounds().right;
        float f13 = getBounds().bottom;
        c20 c20Var = this.f34115a;
        c20Var.b(f10, f11, f12, f13);
        Paint paint = c20Var.f27292c;
        ImageReceiver imageReceiver = this.f34118e;
        if (imageReceiver != null) {
            this.f34117c = imageReceiver.getRoundRadius()[0];
        }
        float f14 = this.f34117c;
        if (f14 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(c20Var.h, f14, f14, paint);
        }
        int iCenterX = getBounds().centerX();
        int iCenterY = getBounds().centerY();
        int iWidth = ((int) (getBounds().width() * 0.7f)) >> 1;
        k5 k5Var = this.h;
        if (k5Var != null) {
            jh.y2 y2Var = k5Var.f29961k;
            if (y2Var != null) {
                y2Var.setRoundRadius((int) (iWidth * 2 * 0.13f));
            }
            k5Var.setBounds(iCenterX - iWidth, iCenterY - iWidth, iCenterX + iWidth, iCenterY + iWidth);
            k5Var.draw(canvas);
        }
        v51 v51Var = this.f34120n;
        if (v51Var != null) {
            float f15 = iWidth * 2;
            v51Var.setRoundRadius((int) (0.13f * f15));
            v51Var.setImageCoords(iCenterX - iWidth, iCenterY - iWidth, f15, f15);
            v51Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && w51.class == obj.getClass()) {
            w51 w51Var = (w51) obj;
            k5 k5Var = w51Var.h;
            if (this.f34116b == w51Var.f34116b) {
                c20 c20Var = this.f34115a;
                int i10 = c20Var.d;
                c20 c20Var2 = w51Var.f34115a;
                if (i10 == c20Var2.d && c20Var.f27293e == c20Var2.f27293e && c20Var.f27294f == c20Var2.f27294f && c20Var.f27295g == c20Var2.f27295g) {
                    k5 k5Var2 = this.h;
                    if (k5Var2 != null && k5Var != null) {
                        return k5Var2.i() == k5Var.i();
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f34123w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = w51Var.f34123w) != null && tL_videoSizeStickerMarkup2.stickerset.f22400id == tL_videoSizeStickerMarkup.stickerset.f22400id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void invalidate() {
        Iterator it = this.f34119f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f34115a.f27292c.setAlpha(i10);
        k5 k5Var = this.h;
        if (k5Var != null) {
            k5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(ri0 ri0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
