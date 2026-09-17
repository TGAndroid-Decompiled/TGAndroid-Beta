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
public final class q61 extends Drawable implements w5, y6, NotificationCenter.NotificationCenterDelegate {
    public final o20 f29632a;
    public final int f29633b;
    public float f29634c;
    public final boolean d;
    public ImageReceiver f29635e;
    public final HashSet f29636f;
    public final q5 h;
    public final p61 f29637n;
    public final ImageReceiver f29638r;
    public final int f29639s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f29640w;

    public q61(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        o20 o20Var = new o20();
        this.f29632a = o20Var;
        this.f29636f = new HashSet();
        this.f29638r = new ImageReceiver();
        this.f29639s = UserConfig.selectedAccount;
        this.f29633b = i10;
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
            q5 q5Var = new q5(i13, UserConfig.selectedAccount, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = q5Var;
            q5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f29640w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            p61 p61Var = new p61(this);
            this.f29637n = p61Var;
            p61Var.setInvalidateAll(true);
            if (i10 == 1) {
                p61Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f29636f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            q5 q5Var = this.h;
            if (q5Var != null) {
                q5Var.p(this);
            }
            p61 p61Var = this.f29637n;
            if (p61Var != null) {
                p61Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f29638r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f29640w != null) {
            NotificationCenter.getInstance(this.f29639s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f29634c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f29636f;
            if (hashSet.isEmpty()) {
                q5 q5Var = this.h;
                if (q5Var != null) {
                    q5Var.b(this);
                }
                p61 p61Var = this.f29637n;
                if (p61Var != null) {
                    p61Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f29638r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f29640w != null) {
                NotificationCenter.getInstance(this.f29639s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q61.d():void");
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
        o20 o20Var = this.f29632a;
        o20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = o20Var.f28958c;
        if (this.f29635e != null) {
            this.f29634c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f29634c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(o20Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        q5 q5Var = this.h;
        if (q5Var != null) {
            bi.y3 y3Var = q5Var.f29612k;
            if (y3Var != null) {
                y3Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            q5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            q5Var.draw(canvas);
        }
        p61 p61Var = this.f29637n;
        if (p61Var != null) {
            float f10 = width * 2;
            p61Var.setRoundRadius((int) (0.13f * f10));
            p61Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            p61Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && q61.class == obj.getClass()) {
            q61 q61Var = (q61) obj;
            q5 q5Var = q61Var.h;
            if (this.f29633b == q61Var.f29633b) {
                o20 o20Var = this.f29632a;
                int i10 = o20Var.d;
                o20 o20Var2 = q61Var.f29632a;
                if (i10 == o20Var2.d && o20Var.f28959e == o20Var2.f28959e && o20Var.f28960f == o20Var2.f28960f && o20Var.f28961g == o20Var2.f28961g) {
                    q5 q5Var2 = this.h;
                    if (q5Var2 != null && q5Var != null) {
                        if (q5Var2.i() == q5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f29640w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = q61Var.f29640w) != null && tL_videoSizeStickerMarkup2.stickerset.f19916id == tL_videoSizeStickerMarkup.stickerset.f19916id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f29636f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29632a.f28958c.setAlpha(i10);
        q5 q5Var = this.h;
        if (q5Var != null) {
            q5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(aj0 aj0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
