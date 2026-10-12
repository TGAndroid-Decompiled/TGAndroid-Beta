package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class s71 extends Drawable implements y5, a7, NotificationCenter.NotificationCenterDelegate {
    public final b30 f29052a;
    public final int f29053b;
    public float f29054c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f29055f;
    public final s5 h;
    public final r71 f29056n;
    public final ImageReceiver f29057r;
    public final int f29058s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f29059w;

    public s71(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        b30 b30Var = new b30();
        this.f29052a = b30Var;
        this.f29055f = new HashSet();
        this.f29057r = new ImageReceiver();
        this.f29058s = UserConfig.selectedAccount;
        this.f29053b = i10;
        this.d = z10;
        int k10 = i0.a.k(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i11 = i0.a.k(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i11 = 0;
        }
        if (videoSize.background_colors.size() > 2) {
            i12 = i0.a.k(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i12 = 0;
        }
        b30Var.d(k10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i10 == 1 && z10) {
                i13 = 7;
            } else if (i10 == 2) {
                i13 = 15;
            } else {
                i13 = 8;
            }
            s5 s5Var = new s5(i13, UserConfig.selectedAccount, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = s5Var;
            s5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f29059w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            r71 r71Var = new r71(this);
            this.f29056n = r71Var;
            r71Var.setInvalidateAll(true);
            if (i10 == 1) {
                r71Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f29055f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            s5 s5Var = this.h;
            if (s5Var != null) {
                s5Var.p(this);
            }
            r71 r71Var = this.f29056n;
            if (r71Var != null) {
                r71Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f29057r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f29059w != null) {
            NotificationCenter.getInstance(this.f29058s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f29054c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f29055f;
            if (hashSet.isEmpty()) {
                s5 s5Var = this.h;
                if (s5Var != null) {
                    s5Var.b(this);
                }
                r71 r71Var = this.f29056n;
                if (r71Var != null) {
                    r71Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f29057r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f29059w != null) {
                NotificationCenter.getInstance(this.f29058s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s71.d():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad && !this.v) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        b30 b30Var = this.f29052a;
        b30Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = b30Var.f23685c;
        if (this.e != null) {
            this.f29054c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f29054c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(b30Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        s5 s5Var = this.h;
        if (s5Var != null) {
            bi.b4 b4Var = s5Var.f29031k;
            if (b4Var != null) {
                b4Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            s5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            s5Var.draw(canvas);
        }
        r71 r71Var = this.f29056n;
        if (r71Var != null) {
            float f10 = width * 2;
            r71Var.setRoundRadius((int) (0.13f * f10));
            r71Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            r71Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && s71.class == obj.getClass()) {
            s71 s71Var = (s71) obj;
            s5 s5Var = s71Var.h;
            if (this.f29053b == s71Var.f29053b) {
                b30 b30Var = this.f29052a;
                int i10 = b30Var.d;
                b30 b30Var2 = s71Var.f29052a;
                if (i10 == b30Var2.d && b30Var.e == b30Var2.e && b30Var.f23686f == b30Var2.f23686f && b30Var.f23687g == b30Var2.f23687g) {
                    s5 s5Var2 = this.h;
                    if (s5Var2 != null && s5Var != null) {
                        if (s5Var2.i() == s5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f29059w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = s71Var.f29059w) != null && tL_videoSizeStickerMarkup2.stickerset.f19236id == tL_videoSizeStickerMarkup.stickerset.f19236id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f29055f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29052a.f23685c.setAlpha(i10);
        s5 s5Var = this.h;
        if (s5Var != null) {
            s5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(bk0 bk0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
