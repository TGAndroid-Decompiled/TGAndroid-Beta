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
public final class f71 extends Drawable implements w5, x6, NotificationCenter.NotificationCenterDelegate {
    public final r20 f24138a;
    public final int f24139b;
    public float f24140c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f24141f;
    public final q5 h;
    public final e71 f24142n;
    public final ImageReceiver f24143r;
    public final int f24144s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f24145w;

    public f71(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        r20 r20Var = new r20();
        this.f24138a = r20Var;
        this.f24141f = new HashSet();
        this.f24143r = new ImageReceiver();
        this.f24144s = UserConfig.selectedAccount;
        this.f24139b = i10;
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
        r20Var.d(k10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
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
            this.f24145w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            e71 e71Var = new e71(this);
            this.f24142n = e71Var;
            e71Var.setInvalidateAll(true);
            if (i10 == 1) {
                e71Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f24141f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            q5 q5Var = this.h;
            if (q5Var != null) {
                q5Var.p(this);
            }
            e71 e71Var = this.f24142n;
            if (e71Var != null) {
                e71Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f24143r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f24145w != null) {
            NotificationCenter.getInstance(this.f24144s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f24140c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f24141f;
            if (hashSet.isEmpty()) {
                q5 q5Var = this.h;
                if (q5Var != null) {
                    q5Var.b(this);
                }
                e71 e71Var = this.f24142n;
                if (e71Var != null) {
                    e71Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f24143r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f24145w != null) {
                NotificationCenter.getInstance(this.f24144s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f71.d():void");
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
        r20 r20Var = this.f24138a;
        r20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = r20Var.f27883c;
        if (this.e != null) {
            this.f24140c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f24140c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(r20Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        q5 q5Var = this.h;
        if (q5Var != null) {
            ai.l4 l4Var = q5Var.f27544k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            q5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            q5Var.draw(canvas);
        }
        e71 e71Var = this.f24142n;
        if (e71Var != null) {
            float f10 = width * 2;
            e71Var.setRoundRadius((int) (0.13f * f10));
            e71Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            e71Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && f71.class == obj.getClass()) {
            f71 f71Var = (f71) obj;
            q5 q5Var = f71Var.h;
            if (this.f24139b == f71Var.f24139b) {
                r20 r20Var = this.f24138a;
                int i10 = r20Var.d;
                r20 r20Var2 = f71Var.f24138a;
                if (i10 == r20Var2.d && r20Var.e == r20Var2.e && r20Var.f27884f == r20Var2.f27884f && r20Var.f27885g == r20Var2.f27885g) {
                    q5 q5Var2 = this.h;
                    if (q5Var2 != null && q5Var != null) {
                        if (q5Var2.i() == q5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f24145w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = f71Var.f24145w) != null && tL_videoSizeStickerMarkup2.stickerset.f18357id == tL_videoSizeStickerMarkup.stickerset.f18357id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f24141f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24138a.f27883c.setAlpha(i10);
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
