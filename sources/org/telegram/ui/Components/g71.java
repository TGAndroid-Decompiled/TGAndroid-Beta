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
public final class g71 extends Drawable implements w5, x6, NotificationCenter.NotificationCenterDelegate {
    public final s20 f24442a;
    public final int f24443b;
    public float f24444c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f24445f;
    public final q5 h;
    public final f71 f24446n;
    public final ImageReceiver f24447r;
    public final int f24448s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f24449w;

    public g71(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        s20 s20Var = new s20();
        this.f24442a = s20Var;
        this.f24445f = new HashSet();
        this.f24447r = new ImageReceiver();
        this.f24448s = UserConfig.selectedAccount;
        this.f24443b = i10;
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
            this.f24449w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            f71 f71Var = new f71(this);
            this.f24446n = f71Var;
            f71Var.setInvalidateAll(true);
            if (i10 == 1) {
                f71Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f24445f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            q5 q5Var = this.h;
            if (q5Var != null) {
                q5Var.p(this);
            }
            f71 f71Var = this.f24446n;
            if (f71Var != null) {
                f71Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f24447r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f24449w != null) {
            NotificationCenter.getInstance(this.f24448s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f24444c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f24445f;
            if (hashSet.isEmpty()) {
                q5 q5Var = this.h;
                if (q5Var != null) {
                    q5Var.b(this);
                }
                f71 f71Var = this.f24446n;
                if (f71Var != null) {
                    f71Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f24447r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f24449w != null) {
                NotificationCenter.getInstance(this.f24448s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g71.d():void");
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
        s20 s20Var = this.f24442a;
        s20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = s20Var.f28174c;
        if (this.e != null) {
            this.f24444c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f24444c;
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
            ai.l4 l4Var = q5Var.f27555k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            q5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            q5Var.draw(canvas);
        }
        f71 f71Var = this.f24446n;
        if (f71Var != null) {
            float f10 = width * 2;
            f71Var.setRoundRadius((int) (0.13f * f10));
            f71Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            f71Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && g71.class == obj.getClass()) {
            g71 g71Var = (g71) obj;
            q5 q5Var = g71Var.h;
            if (this.f24443b == g71Var.f24443b) {
                s20 s20Var = this.f24442a;
                int i10 = s20Var.d;
                s20 s20Var2 = g71Var.f24442a;
                if (i10 == s20Var2.d && s20Var.e == s20Var2.e && s20Var.f28175f == s20Var2.f28175f && s20Var.f28176g == s20Var2.f28176g) {
                    q5 q5Var2 = this.h;
                    if (q5Var2 != null && q5Var != null) {
                        if (q5Var2.i() == q5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f24449w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = g71Var.f24449w) != null && tL_videoSizeStickerMarkup2.stickerset.f18372id == tL_videoSizeStickerMarkup.stickerset.f18372id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f24445f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24442a.f28174c.setAlpha(i10);
        q5 q5Var = this.h;
        if (q5Var != null) {
            q5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(oj0 oj0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
