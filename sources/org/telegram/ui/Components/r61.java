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
public final class r61 extends Drawable implements u5, v6, NotificationCenter.NotificationCenterDelegate {
    public final o20 f27564a;
    public final int f27565b;
    public float f27566c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f27567f;
    public final o5 h;
    public final q61 f27568n;
    public final ImageReceiver f27569r;
    public final int f27570s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f27571w;

    public r61(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        o20 o20Var = new o20();
        this.f27564a = o20Var;
        this.f27567f = new HashSet();
        this.f27569r = new ImageReceiver();
        this.f27570s = UserConfig.selectedAccount;
        this.f27565b = i10;
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
        o20Var.d(k10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i10 == 1 && z10) {
                i13 = 7;
            } else if (i10 == 2) {
                i13 = 15;
            } else {
                i13 = 8;
            }
            o5 o5Var = new o5(i13, UserConfig.selectedAccount, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = o5Var;
            o5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f27571w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            q61 q61Var = new q61(this);
            this.f27568n = q61Var;
            q61Var.setInvalidateAll(true);
            if (i10 == 1) {
                q61Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f27567f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            o5 o5Var = this.h;
            if (o5Var != null) {
                o5Var.p(this);
            }
            q61 q61Var = this.f27568n;
            if (q61Var != null) {
                q61Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f27569r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f27571w != null) {
            NotificationCenter.getInstance(this.f27570s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f27566c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f27567f;
            if (hashSet.isEmpty()) {
                o5 o5Var = this.h;
                if (o5Var != null) {
                    o5Var.b(this);
                }
                q61 q61Var = this.f27568n;
                if (q61Var != null) {
                    q61Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f27569r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f27571w != null) {
                NotificationCenter.getInstance(this.f27570s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r61.d():void");
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
        o20 o20Var = this.f27564a;
        o20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = o20Var.f26605c;
        if (this.e != null) {
            this.f27566c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f27566c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(o20Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        o5 o5Var = this.h;
        if (o5Var != null) {
            ai.l4 l4Var = o5Var.f26639k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            o5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            o5Var.draw(canvas);
        }
        q61 q61Var = this.f27568n;
        if (q61Var != null) {
            float f10 = width * 2;
            q61Var.setRoundRadius((int) (0.13f * f10));
            q61Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            q61Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && r61.class == obj.getClass()) {
            r61 r61Var = (r61) obj;
            o5 o5Var = r61Var.h;
            if (this.f27565b == r61Var.f27565b) {
                o20 o20Var = this.f27564a;
                int i10 = o20Var.d;
                o20 o20Var2 = r61Var.f27564a;
                if (i10 == o20Var2.d && o20Var.e == o20Var2.e && o20Var.f26606f == o20Var2.f26606f && o20Var.f26607g == o20Var2.f26607g) {
                    o5 o5Var2 = this.h;
                    if (o5Var2 != null && o5Var != null) {
                        if (o5Var2.i() == o5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f27571w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = r61Var.f27571w) != null && tL_videoSizeStickerMarkup2.stickerset.f18141id == tL_videoSizeStickerMarkup.stickerset.f18141id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f27567f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27564a.f26605c.setAlpha(i10);
        o5 o5Var = this.h;
        if (o5Var != null) {
            o5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(bj0 bj0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
