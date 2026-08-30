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
public final class s61 extends Drawable implements r5, s6, NotificationCenter.NotificationCenterDelegate {
    public final p20 f28655a;
    public final int f28656b;
    public float f28657c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f28658f;
    public final l5 h;
    public final r61 f28659n;
    public final ImageReceiver f28660r;
    public final int f28661s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f28662w;

    public s61(TLRPC.VideoSize videoSize, boolean z4, int i10) {
        int i11;
        int i12;
        int i13;
        p20 p20Var = new p20();
        this.f28655a = p20Var;
        this.f28658f = new HashSet();
        this.f28660r = new ImageReceiver();
        this.f28661s = UserConfig.selectedAccount;
        this.f28656b = i10;
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
        p20Var.d(k10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
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
            this.f28662w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            r61 r61Var = new r61(this);
            this.f28659n = r61Var;
            r61Var.setInvalidateAll(true);
            if (i10 == 1) {
                r61Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f28658f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            l5 l5Var = this.h;
            if (l5Var != null) {
                l5Var.p(this);
            }
            r61 r61Var = this.f28659n;
            if (r61Var != null) {
                r61Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f28660r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f28662w != null) {
            NotificationCenter.getInstance(this.f28661s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f28657c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f28658f;
            if (hashSet.isEmpty()) {
                l5 l5Var = this.h;
                if (l5Var != null) {
                    l5Var.b(this);
                }
                r61 r61Var = this.f28659n;
                if (r61Var != null) {
                    r61Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f28660r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f28662w != null) {
                NotificationCenter.getInstance(this.f28661s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s61.d():void");
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
        p20 p20Var = this.f28655a;
        p20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = p20Var.f27713c;
        if (this.e != null) {
            this.f28657c = imageReceiver.getRoundRadius()[0];
        }
        float f10 = this.f28657c;
        if (f10 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(p20Var.h, f10, f10, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        l5 l5Var = this.h;
        if (l5Var != null) {
            nh.y2 y2Var = l5Var.f26569k;
            if (y2Var != null) {
                y2Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            l5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            l5Var.draw(canvas);
        }
        r61 r61Var = this.f28659n;
        if (r61Var != null) {
            float f11 = width * 2;
            r61Var.setRoundRadius((int) (0.13f * f11));
            r61Var.setImageCoords(centerX - width, centerY - width, f11, f11);
            r61Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && s61.class == obj.getClass()) {
            s61 s61Var = (s61) obj;
            l5 l5Var = s61Var.h;
            if (this.f28656b == s61Var.f28656b) {
                p20 p20Var = this.f28655a;
                int i10 = p20Var.d;
                p20 p20Var2 = s61Var.f28655a;
                if (i10 == p20Var2.d && p20Var.e == p20Var2.e && p20Var.f27714f == p20Var2.f27714f && p20Var.f27715g == p20Var2.f27715g) {
                    l5 l5Var2 = this.h;
                    if (l5Var2 != null && l5Var != null) {
                        if (l5Var2.i() == l5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f28662w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = s61Var.f28662w) != null && tL_videoSizeStickerMarkup2.stickerset.f19204id == tL_videoSizeStickerMarkup.stickerset.f19204id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f28658f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28655a.f27713c.setAlpha(i10);
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(jj0 jj0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
