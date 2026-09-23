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
public final class p61 extends Drawable implements w5, x6, NotificationCenter.NotificationCenterDelegate {
    public final p20 f26947a;
    public final int f26948b;
    public float f26949c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f26950f;
    public final q5 h;
    public final o61 f26951n;
    public final ImageReceiver f26952r;
    public final int f26953s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f26954w;

    public p61(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        p20 p20Var = new p20();
        this.f26947a = p20Var;
        this.f26950f = new HashSet();
        this.f26952r = new ImageReceiver();
        this.f26953s = UserConfig.selectedAccount;
        this.f26948b = i10;
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
        p20Var.d(k10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
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
            this.f26954w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            o61 o61Var = new o61(this);
            this.f26951n = o61Var;
            o61Var.setInvalidateAll(true);
            if (i10 == 1) {
                o61Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f26950f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            q5 q5Var = this.h;
            if (q5Var != null) {
                q5Var.p(this);
            }
            o61 o61Var = this.f26951n;
            if (o61Var != null) {
                o61Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f26952r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f26954w != null) {
            NotificationCenter.getInstance(this.f26953s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f26949c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f26950f;
            if (hashSet.isEmpty()) {
                q5 q5Var = this.h;
                if (q5Var != null) {
                    q5Var.b(this);
                }
                o61 o61Var = this.f26951n;
                if (o61Var != null) {
                    o61Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f26952r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f26954w != null) {
                NotificationCenter.getInstance(this.f26953s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p61.d():void");
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
        p20 p20Var = this.f26947a;
        p20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = p20Var.f26912c;
        if (this.e != null) {
            this.f26949c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f26949c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(p20Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        q5 q5Var = this.h;
        if (q5Var != null) {
            ai.l4 l4Var = q5Var.f27230k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            q5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            q5Var.draw(canvas);
        }
        o61 o61Var = this.f26951n;
        if (o61Var != null) {
            float f10 = width * 2;
            o61Var.setRoundRadius((int) (0.13f * f10));
            o61Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            o61Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && p61.class == obj.getClass()) {
            p61 p61Var = (p61) obj;
            q5 q5Var = p61Var.h;
            if (this.f26948b == p61Var.f26948b) {
                p20 p20Var = this.f26947a;
                int i10 = p20Var.d;
                p20 p20Var2 = p61Var.f26947a;
                if (i10 == p20Var2.d && p20Var.e == p20Var2.e && p20Var.f26913f == p20Var2.f26913f && p20Var.f26914g == p20Var2.f26914g) {
                    q5 q5Var2 = this.h;
                    if (q5Var2 != null && q5Var != null) {
                        if (q5Var2.i() == q5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f26954w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = p61Var.f26954w) != null && tL_videoSizeStickerMarkup2.stickerset.f18103id == tL_videoSizeStickerMarkup.stickerset.f18103id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f26950f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26947a.f26912c.setAlpha(i10);
        q5 q5Var = this.h;
        if (q5Var != null) {
            q5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(bj0 bj0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
