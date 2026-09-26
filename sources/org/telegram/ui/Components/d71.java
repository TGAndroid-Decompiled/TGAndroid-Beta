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
public final class d71 extends Drawable implements w5, x6, NotificationCenter.NotificationCenterDelegate {
    public final p20 f23517a;
    public final int f23518b;
    public float f23519c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f23520f;
    public final q5 h;
    public final c71 f23521n;
    public final ImageReceiver f23522r;
    public final int f23523s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f23524w;

    public d71(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        p20 p20Var = new p20();
        this.f23517a = p20Var;
        this.f23520f = new HashSet();
        this.f23522r = new ImageReceiver();
        this.f23523s = UserConfig.selectedAccount;
        this.f23518b = i10;
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
            this.f23524w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            c71 c71Var = new c71(this);
            this.f23521n = c71Var;
            c71Var.setInvalidateAll(true);
            if (i10 == 1) {
                c71Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f23520f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            q5 q5Var = this.h;
            if (q5Var != null) {
                q5Var.p(this);
            }
            c71 c71Var = this.f23521n;
            if (c71Var != null) {
                c71Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f23522r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f23524w != null) {
            NotificationCenter.getInstance(this.f23523s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f23519c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f23520f;
            if (hashSet.isEmpty()) {
                q5 q5Var = this.h;
                if (q5Var != null) {
                    q5Var.b(this);
                }
                c71 c71Var = this.f23521n;
                if (c71Var != null) {
                    c71Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f23522r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f23524w != null) {
                NotificationCenter.getInstance(this.f23523s).addObserver(this, NotificationCenter.groupStickersDidLoad);
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
        p20 p20Var = this.f23517a;
        p20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = p20Var.f27247c;
        if (this.e != null) {
            this.f23519c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f23519c;
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
            ai.l4 l4Var = q5Var.f27504k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            q5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            q5Var.draw(canvas);
        }
        c71 c71Var = this.f23521n;
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
            q5 q5Var = d71Var.h;
            if (this.f23518b == d71Var.f23518b) {
                p20 p20Var = this.f23517a;
                int i10 = p20Var.d;
                p20 p20Var2 = d71Var.f23517a;
                if (i10 == p20Var2.d && p20Var.e == p20Var2.e && p20Var.f27248f == p20Var2.f27248f && p20Var.f27249g == p20Var2.f27249g) {
                    q5 q5Var2 = this.h;
                    if (q5Var2 != null && q5Var != null) {
                        if (q5Var2.i() == q5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f23524w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = d71Var.f23524w) != null && tL_videoSizeStickerMarkup2.stickerset.f18355id == tL_videoSizeStickerMarkup.stickerset.f18355id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f23520f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f23517a.f27247c.setAlpha(i10);
        q5 q5Var = this.h;
        if (q5Var != null) {
            q5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(lj0 lj0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
