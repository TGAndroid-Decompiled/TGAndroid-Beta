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
public final class h61 extends Drawable implements v5, w6, NotificationCenter.NotificationCenterDelegate {
    public final k20 f29074a;
    public final int f29075b;
    public float f29076c;
    public final boolean d;
    public ImageReceiver f29077e;
    public final HashSet f29078f;
    public final p5 h;
    public final g61 f29079n;
    public final ImageReceiver f29080r;
    public final int f29081s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f29082w;

    public h61(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        k20 k20Var = new k20();
        this.f29074a = k20Var;
        this.f29078f = new HashSet();
        this.f29080r = new ImageReceiver();
        this.f29081s = UserConfig.selectedAccount;
        this.f29075b = i10;
        this.d = z10;
        int k9 = i0.a.k(videoSize.background_colors.get(0).intValue(), 255);
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
        k20Var.d(k9, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
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
            this.f29082w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            g61 g61Var = new g61(this);
            this.f29079n = g61Var;
            g61Var.setInvalidateAll(true);
            if (i10 == 1) {
                g61Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f29078f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            p5 p5Var = this.h;
            if (p5Var != null) {
                p5Var.p(this);
            }
            g61 g61Var = this.f29079n;
            if (g61Var != null) {
                g61Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f29080r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f29082w != null) {
            NotificationCenter.getInstance(this.f29081s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f29076c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f29078f;
            if (hashSet.isEmpty()) {
                p5 p5Var = this.h;
                if (p5Var != null) {
                    p5Var.b(this);
                }
                g61 g61Var = this.f29079n;
                if (g61Var != null) {
                    g61Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f29080r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f29082w != null) {
                NotificationCenter.getInstance(this.f29081s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h61.d():void");
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
        k20 k20Var = this.f29074a;
        k20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = k20Var.f29893c;
        if (this.f29077e != null) {
            this.f29076c = imageReceiver.getRoundRadius()[0];
        }
        float f9 = this.f29076c;
        if (f9 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(k20Var.h, f9, f9, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        p5 p5Var = this.h;
        if (p5Var != null) {
            lh.x2 x2Var = p5Var.f31593k;
            if (x2Var != null) {
                x2Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            p5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            p5Var.draw(canvas);
        }
        g61 g61Var = this.f29079n;
        if (g61Var != null) {
            float f10 = width * 2;
            g61Var.setRoundRadius((int) (0.13f * f10));
            g61Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            g61Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && h61.class == obj.getClass()) {
            h61 h61Var = (h61) obj;
            p5 p5Var = h61Var.h;
            if (this.f29075b == h61Var.f29075b) {
                k20 k20Var = this.f29074a;
                int i10 = k20Var.d;
                k20 k20Var2 = h61Var.f29074a;
                if (i10 == k20Var2.d && k20Var.f29894e == k20Var2.f29894e && k20Var.f29895f == k20Var2.f29895f && k20Var.f29896g == k20Var2.f29896g) {
                    p5 p5Var2 = this.h;
                    if (p5Var2 != null && p5Var != null) {
                        if (p5Var2.i() == p5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f29082w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = h61Var.f29082w) != null && tL_videoSizeStickerMarkup2.stickerset.f22412id == tL_videoSizeStickerMarkup.stickerset.f22412id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f29078f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29074a.f29893c.setAlpha(i10);
        p5 p5Var = this.h;
        if (p5Var != null) {
            p5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(aj0 aj0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
