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
public final class d71 extends Drawable implements v5, w6, NotificationCenter.NotificationCenterDelegate {
    public final x20 f22306a;
    public final int f22307b;
    public float f22308c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f22309f;
    public final p5 h;
    public final c71 f22310n;
    public final ImageReceiver f22311r;
    public final int f22312s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f22313w;

    public d71(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        x20 x20Var = new x20();
        this.f22306a = x20Var;
        this.f22309f = new HashSet();
        this.f22311r = new ImageReceiver();
        this.f22312s = UserConfig.selectedAccount;
        this.f22307b = i10;
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
        x20Var.d(k10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
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
            this.f22313w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            c71 c71Var = new c71(this);
            this.f22310n = c71Var;
            c71Var.setInvalidateAll(true);
            if (i10 == 1) {
                c71Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f22309f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            p5 p5Var = this.h;
            if (p5Var != null) {
                p5Var.p(this);
            }
            c71 c71Var = this.f22310n;
            if (c71Var != null) {
                c71Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f22311r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f22313w != null) {
            NotificationCenter.getInstance(this.f22312s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f22308c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f22309f;
            if (hashSet.isEmpty()) {
                p5 p5Var = this.h;
                if (p5Var != null) {
                    p5Var.b(this);
                }
                c71 c71Var = this.f22310n;
                if (c71Var != null) {
                    c71Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f22311r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f22313w != null) {
                NotificationCenter.getInstance(this.f22312s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d71.d():void");
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
        x20 x20Var = this.f22306a;
        x20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = x20Var.f28915c;
        if (this.e != null) {
            this.f22308c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f22308c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(x20Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        p5 p5Var = this.h;
        if (p5Var != null) {
            gg.h1 h1Var = p5Var.f26033k;
            if (h1Var != null) {
                h1Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            p5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            p5Var.draw(canvas);
        }
        c71 c71Var = this.f22310n;
        if (c71Var != null) {
            float f10 = width * 2;
            c71Var.setRoundRadius((int) (0.13f * f10));
            c71Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            c71Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && d71.class == obj.getClass()) {
            d71 d71Var = (d71) obj;
            p5 p5Var = d71Var.h;
            if (this.f22307b == d71Var.f22307b) {
                x20 x20Var = this.f22306a;
                int i10 = x20Var.d;
                x20 x20Var2 = d71Var.f22306a;
                if (i10 == x20Var2.d && x20Var.e == x20Var2.e && x20Var.f28916f == x20Var2.f28916f && x20Var.f28917g == x20Var2.f28917g) {
                    p5 p5Var2 = this.h;
                    if (p5Var2 != null && p5Var != null) {
                        if (p5Var2.i() == p5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f22313w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = d71Var.f22313w) != null && tL_videoSizeStickerMarkup2.stickerset.f17215id == tL_videoSizeStickerMarkup.stickerset.f17215id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f22309f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f22306a.f28915c.setAlpha(i10);
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
