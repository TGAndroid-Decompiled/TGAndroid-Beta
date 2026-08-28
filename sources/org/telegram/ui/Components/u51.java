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
public final class u51 extends Drawable implements q5, r6, NotificationCenter.NotificationCenterDelegate {
    public final z10 f32925a;
    public final int f32926b;
    public float f32927c;
    public final boolean d;
    public ImageReceiver f32928e;
    public final HashSet f32929f;
    public final k5 h;
    public final t51 f32930n;
    public final ImageReceiver f32931r;
    public final int f32932s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f32933w;

    public u51(TLRPC.VideoSize videoSize, boolean z10, int i9) {
        int i10;
        int i11;
        int i12;
        z10 z10Var = new z10();
        this.f32925a = z10Var;
        this.f32929f = new HashSet();
        this.f32931r = new ImageReceiver();
        this.f32932s = UserConfig.selectedAccount;
        this.f32926b = i9;
        this.d = z10;
        int k10 = i0.a.k(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i10 = i0.a.k(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i10 = 0;
        }
        if (videoSize.background_colors.size() > 2) {
            i11 = i0.a.k(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i11 = 0;
        }
        z10Var.d(k10, i10, i11, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i9 == 1 && z10) {
                i12 = 7;
            } else if (i9 == 2) {
                i12 = 15;
            } else {
                i12 = 8;
            }
            k5 k5Var = new k5(i12, UserConfig.selectedAccount, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = k5Var;
            k5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f32933w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            t51 t51Var = new t51(this);
            this.f32930n = t51Var;
            t51Var.setInvalidateAll(true);
            if (i9 == 1) {
                t51Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f32929f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            k5 k5Var = this.h;
            if (k5Var != null) {
                k5Var.p(this);
            }
            t51 t51Var = this.f32930n;
            if (t51Var != null) {
                t51Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f32931r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f32933w != null) {
            NotificationCenter.getInstance(this.f32932s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f32927c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f32929f;
            if (hashSet.isEmpty()) {
                k5 k5Var = this.h;
                if (k5Var != null) {
                    k5Var.b(this);
                }
                t51 t51Var = this.f32930n;
                if (t51Var != null) {
                    t51Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f32931r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f32933w != null) {
                NotificationCenter.getInstance(this.f32932s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u51.d():void");
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.groupStickersDidLoad && !this.v) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        z10 z10Var = this.f32925a;
        z10Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = z10Var.f35155c;
        if (this.f32928e != null) {
            this.f32927c = imageReceiver.getRoundRadius()[0];
        }
        float f10 = this.f32927c;
        if (f10 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(z10Var.h, f10, f10, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        k5 k5Var = this.h;
        if (k5Var != null) {
            ih.z2 z2Var = k5Var.f29951k;
            if (z2Var != null) {
                z2Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            k5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            k5Var.draw(canvas);
        }
        t51 t51Var = this.f32930n;
        if (t51Var != null) {
            float f11 = width * 2;
            t51Var.setRoundRadius((int) (0.13f * f11));
            t51Var.setImageCoords(centerX - width, centerY - width, f11, f11);
            t51Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && u51.class == obj.getClass()) {
            u51 u51Var = (u51) obj;
            k5 k5Var = u51Var.h;
            if (this.f32926b == u51Var.f32926b) {
                z10 z10Var = this.f32925a;
                int i9 = z10Var.d;
                z10 z10Var2 = u51Var.f32925a;
                if (i9 == z10Var2.d && z10Var.f35156e == z10Var2.f35156e && z10Var.f35157f == z10Var2.f35157f && z10Var.f35158g == z10Var2.f35158g) {
                    k5 k5Var2 = this.h;
                    if (k5Var2 != null && k5Var != null) {
                        if (k5Var2.i() == k5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f32933w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = u51Var.f32933w) != null && tL_videoSizeStickerMarkup2.stickerset.f22400id == tL_videoSizeStickerMarkup.stickerset.f22400id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f32929f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i9) {
        this.f32925a.f35155c.setAlpha(i9);
        k5 k5Var = this.h;
        if (k5Var != null) {
            k5Var.setAlpha(i9);
        }
    }

    @Override
    public final void a(pi0 pi0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
