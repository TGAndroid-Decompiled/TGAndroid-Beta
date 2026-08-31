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
public final class u61 extends Drawable implements r5, s6, NotificationCenter.NotificationCenterDelegate {
    public final q20 f31576a;
    public final int f31577b;
    public float f31578c;
    public final boolean d;
    public ImageReceiver f31579e;
    public final HashSet f31580f;
    public final l5 h;
    public final t61 f31581n;
    public final ImageReceiver f31582r;
    public final int f31583s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f31584w;

    public u61(TLRPC.VideoSize videoSize, boolean z4, int i10) {
        int i11;
        int i12;
        int i13;
        q20 q20Var = new q20();
        this.f31576a = q20Var;
        this.f31580f = new HashSet();
        this.f31582r = new ImageReceiver();
        this.f31583s = UserConfig.selectedAccount;
        this.f31577b = i10;
        this.d = z4;
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
        q20Var.d(k10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i10 == 1 && z4) {
                i13 = 7;
            } else if (i10 == 2) {
                i13 = 15;
            } else {
                i13 = 8;
            }
            l5 l5Var = new l5(i13, UserConfig.selectedAccount, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = l5Var;
            l5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f31584w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            t61 t61Var = new t61(this);
            this.f31581n = t61Var;
            t61Var.setInvalidateAll(true);
            if (i10 == 1) {
                t61Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f31580f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            l5 l5Var = this.h;
            if (l5Var != null) {
                l5Var.p(this);
            }
            t61 t61Var = this.f31581n;
            if (t61Var != null) {
                t61Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f31582r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f31584w != null) {
            NotificationCenter.getInstance(this.f31583s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f31578c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f31580f;
            if (hashSet.isEmpty()) {
                l5 l5Var = this.h;
                if (l5Var != null) {
                    l5Var.b(this);
                }
                t61 t61Var = this.f31581n;
                if (t61Var != null) {
                    t61Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f31582r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f31584w != null) {
                NotificationCenter.getInstance(this.f31583s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u61.d():void");
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
        q20 q20Var = this.f31576a;
        q20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = q20Var.f30254c;
        if (this.f31579e != null) {
            this.f31578c = imageReceiver.getRoundRadius()[0];
        }
        float f10 = this.f31578c;
        if (f10 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(q20Var.h, f10, f10, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        l5 l5Var = this.h;
        if (l5Var != null) {
            oh.z2 z2Var = l5Var.f28604k;
            if (z2Var != null) {
                z2Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            l5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            l5Var.draw(canvas);
        }
        t61 t61Var = this.f31581n;
        if (t61Var != null) {
            float f11 = width * 2;
            t61Var.setRoundRadius((int) (0.13f * f11));
            t61Var.setImageCoords(centerX - width, centerY - width, f11, f11);
            t61Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && u61.class == obj.getClass()) {
            u61 u61Var = (u61) obj;
            l5 l5Var = u61Var.h;
            if (this.f31577b == u61Var.f31577b) {
                q20 q20Var = this.f31576a;
                int i10 = q20Var.d;
                q20 q20Var2 = u61Var.f31576a;
                if (i10 == q20Var2.d && q20Var.f30255e == q20Var2.f30255e && q20Var.f30256f == q20Var2.f30256f && q20Var.f30257g == q20Var2.f30257g) {
                    l5 l5Var2 = this.h;
                    if (l5Var2 != null && l5Var != null) {
                        if (l5Var2.i() == l5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f31584w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = u61Var.f31584w) != null && tL_videoSizeStickerMarkup2.stickerset.f20863id == tL_videoSizeStickerMarkup.stickerset.f20863id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f31580f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f31576a.f30254c.setAlpha(i10);
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(lj0 lj0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
