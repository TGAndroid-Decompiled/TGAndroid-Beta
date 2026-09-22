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
public final class g71 extends Drawable implements v5, w6, NotificationCenter.NotificationCenterDelegate {
    public final o20 f24435a;
    public final int f24436b;
    public float f24437c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f24438f;
    public final p5 h;
    public final f71 f24439n;
    public final ImageReceiver f24440r;
    public final int f24441s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f24442w;

    public g71(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        o20 o20Var = new o20();
        this.f24435a = o20Var;
        this.f24438f = new HashSet();
        this.f24440r = new ImageReceiver();
        this.f24441s = UserConfig.selectedAccount;
        this.f24436b = i10;
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
        o20Var.d(k10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i10 == 1 && z10) {
                i13 = 7;
            } else if (i10 == 2) {
                i13 = 15;
            } else {
                i13 = 8;
            }
            p5 p5Var = new p5(i13, UserConfig.selectedAccount, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = p5Var;
            p5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f24442w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            f71 f71Var = new f71(this);
            this.f24439n = f71Var;
            f71Var.setInvalidateAll(true);
            if (i10 == 1) {
                f71Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f24438f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            p5 p5Var = this.h;
            if (p5Var != null) {
                p5Var.p(this);
            }
            f71 f71Var = this.f24439n;
            if (f71Var != null) {
                f71Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f24440r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f24442w != null) {
            NotificationCenter.getInstance(this.f24441s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f24437c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f24438f;
            if (hashSet.isEmpty()) {
                p5 p5Var = this.h;
                if (p5Var != null) {
                    p5Var.b(this);
                }
                f71 f71Var = this.f24439n;
                if (f71Var != null) {
                    f71Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f24440r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f24442w != null) {
                NotificationCenter.getInstance(this.f24441s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g71.d():void");
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
        o20 o20Var = this.f24435a;
        o20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = o20Var.f26967c;
        if (this.e != null) {
            this.f24437c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f24437c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(o20Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        p5 p5Var = this.h;
        if (p5Var != null) {
            ai.l4 l4Var = p5Var.f27256k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            p5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            p5Var.draw(canvas);
        }
        f71 f71Var = this.f24439n;
        if (f71Var != null) {
            float f10 = width * 2;
            f71Var.setRoundRadius((int) (0.13f * f10));
            f71Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            f71Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && g71.class == obj.getClass()) {
            g71 g71Var = (g71) obj;
            p5 p5Var = g71Var.h;
            if (this.f24436b == g71Var.f24436b) {
                o20 o20Var = this.f24435a;
                int i10 = o20Var.d;
                o20 o20Var2 = g71Var.f24435a;
                if (i10 == o20Var2.d && o20Var.e == o20Var2.e && o20Var.f26968f == o20Var2.f26968f && o20Var.f26969g == o20Var2.f26969g) {
                    p5 p5Var2 = this.h;
                    if (p5Var2 != null && p5Var != null) {
                        if (p5Var2.i() == p5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f24442w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = g71Var.f24442w) != null && tL_videoSizeStickerMarkup2.stickerset.f18363id == tL_videoSizeStickerMarkup.stickerset.f18363id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f24438f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24435a.f26967c.setAlpha(i10);
        p5 p5Var = this.h;
        if (p5Var != null) {
            p5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(nj0 nj0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
