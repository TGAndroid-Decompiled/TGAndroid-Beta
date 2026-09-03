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
public final class t61 extends Drawable implements r5, s6, NotificationCenter.NotificationCenterDelegate {
    public final q20 f31282a;
    public final int f31283b;
    public float f31284c;
    public final boolean d;
    public ImageReceiver f31285e;
    public final HashSet f31286f;
    public final l5 h;
    public final s61 f31287n;
    public final ImageReceiver f31288r;
    public final int f31289s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f31290w;

    public t61(TLRPC.VideoSize videoSize, boolean z4, int i10) {
        int i11;
        int i12;
        int i13;
        q20 q20Var = new q20();
        this.f31282a = q20Var;
        this.f31286f = new HashSet();
        this.f31288r = new ImageReceiver();
        this.f31289s = UserConfig.selectedAccount;
        this.f31283b = i10;
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
        q20Var.d(k10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
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
            this.f31290w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            s61 s61Var = new s61(this);
            this.f31287n = s61Var;
            s61Var.setInvalidateAll(true);
            if (i10 == 1) {
                s61Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f31286f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            l5 l5Var = this.h;
            if (l5Var != null) {
                l5Var.p(this);
            }
            s61 s61Var = this.f31287n;
            if (s61Var != null) {
                s61Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f31288r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f31290w != null) {
            NotificationCenter.getInstance(this.f31289s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f31284c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f31286f;
            if (hashSet.isEmpty()) {
                l5 l5Var = this.h;
                if (l5Var != null) {
                    l5Var.b(this);
                }
                s61 s61Var = this.f31287n;
                if (s61Var != null) {
                    s61Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f31288r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f31290w != null) {
                NotificationCenter.getInstance(this.f31289s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t61.d():void");
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
        q20 q20Var = this.f31282a;
        q20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = q20Var.f30265c;
        if (this.f31285e != null) {
            this.f31284c = imageReceiver.getRoundRadius()[0];
        }
        float f10 = this.f31284c;
        if (f10 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(q20Var.h, f10, f10, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        l5 l5Var = this.h;
        if (l5Var != null) {
            oh.z2 z2Var = l5Var.f28637k;
            if (z2Var != null) {
                z2Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            l5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            l5Var.draw(canvas);
        }
        s61 s61Var = this.f31287n;
        if (s61Var != null) {
            float f11 = width * 2;
            s61Var.setRoundRadius((int) (0.13f * f11));
            s61Var.setImageCoords(centerX - width, centerY - width, f11, f11);
            s61Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && t61.class == obj.getClass()) {
            t61 t61Var = (t61) obj;
            l5 l5Var = t61Var.h;
            if (this.f31283b == t61Var.f31283b) {
                q20 q20Var = this.f31282a;
                int i10 = q20Var.d;
                q20 q20Var2 = t61Var.f31282a;
                if (i10 == q20Var2.d && q20Var.f30266e == q20Var2.f30266e && q20Var.f30267f == q20Var2.f30267f && q20Var.f30268g == q20Var2.f30268g) {
                    l5 l5Var2 = this.h;
                    if (l5Var2 != null && l5Var != null) {
                        if (l5Var2.i() == l5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f31290w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = t61Var.f31290w) != null && tL_videoSizeStickerMarkup2.stickerset.f20865id == tL_videoSizeStickerMarkup.stickerset.f20865id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f31286f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f31282a.f30265c.setAlpha(i10);
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(kj0 kj0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
