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
public final class e71 extends Drawable implements v5, w6, NotificationCenter.NotificationCenterDelegate {
    public final o20 f23758a;
    public final int f23759b;
    public float f23760c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f23761f;
    public final p5 h;
    public final d71 f23762n;
    public final ImageReceiver f23763r;
    public final int f23764s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f23765w;

    public e71(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        o20 o20Var = new o20();
        this.f23758a = o20Var;
        this.f23761f = new HashSet();
        this.f23763r = new ImageReceiver();
        this.f23764s = UserConfig.selectedAccount;
        this.f23759b = i10;
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
            this.f23765w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            d71 d71Var = new d71(this);
            this.f23762n = d71Var;
            d71Var.setInvalidateAll(true);
            if (i10 == 1) {
                d71Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f23761f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            p5 p5Var = this.h;
            if (p5Var != null) {
                p5Var.p(this);
            }
            d71 d71Var = this.f23762n;
            if (d71Var != null) {
                d71Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f23763r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f23765w != null) {
            NotificationCenter.getInstance(this.f23764s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f23760c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f23761f;
            if (hashSet.isEmpty()) {
                p5 p5Var = this.h;
                if (p5Var != null) {
                    p5Var.b(this);
                }
                d71 d71Var = this.f23762n;
                if (d71Var != null) {
                    d71Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f23763r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f23765w != null) {
                NotificationCenter.getInstance(this.f23764s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e71.d():void");
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
        o20 o20Var = this.f23758a;
        o20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = o20Var.f26787c;
        if (this.e != null) {
            this.f23760c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f23760c;
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
            ai.l4 l4Var = p5Var.f27162k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            p5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            p5Var.draw(canvas);
        }
        d71 d71Var = this.f23762n;
        if (d71Var != null) {
            float f10 = width * 2;
            d71Var.setRoundRadius((int) (0.13f * f10));
            d71Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            d71Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && e71.class == obj.getClass()) {
            e71 e71Var = (e71) obj;
            p5 p5Var = e71Var.h;
            if (this.f23759b == e71Var.f23759b) {
                o20 o20Var = this.f23758a;
                int i10 = o20Var.d;
                o20 o20Var2 = e71Var.f23758a;
                if (i10 == o20Var2.d && o20Var.e == o20Var2.e && o20Var.f26788f == o20Var2.f26788f && o20Var.f26789g == o20Var2.f26789g) {
                    p5 p5Var2 = this.h;
                    if (p5Var2 != null && p5Var != null) {
                        if (p5Var2.i() == p5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f23765w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = e71Var.f23765w) != null && tL_videoSizeStickerMarkup2.stickerset.f18348id == tL_videoSizeStickerMarkup.stickerset.f18348id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f23761f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f23758a.f26787c.setAlpha(i10);
        p5 p5Var = this.h;
        if (p5Var != null) {
            p5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(kj0 kj0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
