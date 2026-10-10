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
public final class w71 extends Drawable implements y5, z6, NotificationCenter.NotificationCenterDelegate {
    public final g30 f32610a;
    public final int f32611b;
    public float f32612c;
    public final boolean d;
    public ImageReceiver f32613e;
    public final HashSet f32614f;
    public final s5 h;
    public final v71 f32615n;
    public final ImageReceiver f32616r;
    public final int f32617s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f32618w;

    public w71(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        g30 g30Var = new g30();
        this.f32610a = g30Var;
        this.f32614f = new HashSet();
        this.f32616r = new ImageReceiver();
        this.f32617s = UserConfig.selectedAccount;
        this.f32611b = i10;
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
        g30Var.d(k10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
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
            this.f32618w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            v71 v71Var = new v71(this);
            this.f32615n = v71Var;
            v71Var.setInvalidateAll(true);
            if (i10 == 1) {
                v71Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f32614f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            s5 s5Var = this.h;
            if (s5Var != null) {
                s5Var.p(this);
            }
            v71 v71Var = this.f32615n;
            if (v71Var != null) {
                v71Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f32616r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f32618w != null) {
            NotificationCenter.getInstance(this.f32617s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f32612c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f32614f;
            if (hashSet.isEmpty()) {
                s5 s5Var = this.h;
                if (s5Var != null) {
                    s5Var.b(this);
                }
                v71 v71Var = this.f32615n;
                if (v71Var != null) {
                    v71Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f32616r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f32618w != null) {
                NotificationCenter.getInstance(this.f32617s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w71.d():void");
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
        g30 g30Var = this.f32610a;
        g30Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = g30Var.f26591c;
        if (this.f32613e != null) {
            this.f32612c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f32612c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(g30Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        s5 s5Var = this.h;
        if (s5Var != null) {
            ai.m4 m4Var = s5Var.f30680k;
            if (m4Var != null) {
                m4Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            s5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            s5Var.draw(canvas);
        }
        v71 v71Var = this.f32615n;
        if (v71Var != null) {
            float f10 = width * 2;
            v71Var.setRoundRadius((int) (0.13f * f10));
            v71Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            v71Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && w71.class == obj.getClass()) {
            w71 w71Var = (w71) obj;
            s5 s5Var = w71Var.h;
            if (this.f32611b == w71Var.f32611b) {
                g30 g30Var = this.f32610a;
                int i10 = g30Var.d;
                g30 g30Var2 = w71Var.f32610a;
                if (i10 == g30Var2.d && g30Var.f26592e == g30Var2.f26592e && g30Var.f26593f == g30Var2.f26593f && g30Var.f26594g == g30Var2.f26594g) {
                    s5 s5Var2 = this.h;
                    if (s5Var2 != null && s5Var != null) {
                        if (s5Var2.i() == s5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f32618w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = w71Var.f32618w) != null && tL_videoSizeStickerMarkup2.stickerset.f20062id == tL_videoSizeStickerMarkup.stickerset.f20062id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f32614f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f32610a.f26591c.setAlpha(i10);
        s5 s5Var = this.h;
        if (s5Var != null) {
            s5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(gk0 gk0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
