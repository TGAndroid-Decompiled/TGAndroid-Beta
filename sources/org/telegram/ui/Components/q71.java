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
public final class q71 extends Drawable implements w5, x6, NotificationCenter.NotificationCenterDelegate {
    public final s20 f29968a;
    public final int f29969b;
    public float f29970c;
    public final boolean d;
    public ImageReceiver f29971e;
    public final HashSet f29972f;
    public final q5 h;
    public final p71 f29973n;
    public final ImageReceiver f29974r;
    public final int f29975s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f29976w;

    public q71(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        s20 s20Var = new s20();
        this.f29968a = s20Var;
        this.f29972f = new HashSet();
        this.f29974r = new ImageReceiver();
        this.f29975s = UserConfig.selectedAccount;
        this.f29969b = i10;
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
        s20Var.d(k10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
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
            this.f29976w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            p71 p71Var = new p71(this);
            this.f29973n = p71Var;
            p71Var.setInvalidateAll(true);
            if (i10 == 1) {
                p71Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f29972f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            q5 q5Var = this.h;
            if (q5Var != null) {
                q5Var.p(this);
            }
            p71 p71Var = this.f29973n;
            if (p71Var != null) {
                p71Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f29974r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f29976w != null) {
            NotificationCenter.getInstance(this.f29975s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f29970c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f29972f;
            if (hashSet.isEmpty()) {
                q5 q5Var = this.h;
                if (q5Var != null) {
                    q5Var.b(this);
                }
                p71 p71Var = this.f29973n;
                if (p71Var != null) {
                    p71Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f29974r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f29976w != null) {
                NotificationCenter.getInstance(this.f29975s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q71.d():void");
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
        s20 s20Var = this.f29968a;
        s20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = s20Var.f30660c;
        if (this.f29971e != null) {
            this.f29970c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f29970c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(s20Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        q5 q5Var = this.h;
        if (q5Var != null) {
            ai.l4 l4Var = q5Var.f29935k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            q5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            q5Var.draw(canvas);
        }
        p71 p71Var = this.f29973n;
        if (p71Var != null) {
            float f10 = width * 2;
            p71Var.setRoundRadius((int) (0.13f * f10));
            p71Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            p71Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && q71.class == obj.getClass()) {
            q71 q71Var = (q71) obj;
            q5 q5Var = q71Var.h;
            if (this.f29969b == q71Var.f29969b) {
                s20 s20Var = this.f29968a;
                int i10 = s20Var.d;
                s20 s20Var2 = q71Var.f29968a;
                if (i10 == s20Var2.d && s20Var.f30661e == s20Var2.f30661e && s20Var.f30662f == s20Var2.f30662f && s20Var.f30663g == s20Var2.f30663g) {
                    q5 q5Var2 = this.h;
                    if (q5Var2 != null && q5Var != null) {
                        if (q5Var2.i() == q5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f29976w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = q71Var.f29976w) != null && tL_videoSizeStickerMarkup2.stickerset.f20067id == tL_videoSizeStickerMarkup.stickerset.f20067id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f29972f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29968a.f30660c.setAlpha(i10);
        q5 q5Var = this.h;
        if (q5Var != null) {
            q5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(nj0 nj0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
