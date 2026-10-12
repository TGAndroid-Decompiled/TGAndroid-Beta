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
public final class a81 extends Drawable implements y5, z6, NotificationCenter.NotificationCenterDelegate {
    public final i30 f24253a;
    public final int f24254b;
    public float f24255c;
    public final boolean d;
    public ImageReceiver f24256e;
    public final HashSet f24257f;
    public final s5 h;
    public final z71 f24258n;
    public final ImageReceiver f24259r;
    public final int f24260s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f24261w;

    public a81(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        i30 i30Var = new i30();
        this.f24253a = i30Var;
        this.f24257f = new HashSet();
        this.f24259r = new ImageReceiver();
        this.f24260s = UserConfig.selectedAccount;
        this.f24254b = i10;
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
        i30Var.d(k10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
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
            this.f24261w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            z71 z71Var = new z71(this);
            this.f24258n = z71Var;
            z71Var.setInvalidateAll(true);
            if (i10 == 1) {
                z71Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f24257f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            s5 s5Var = this.h;
            if (s5Var != null) {
                s5Var.p(this);
            }
            z71 z71Var = this.f24258n;
            if (z71Var != null) {
                z71Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f24259r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f24261w != null) {
            NotificationCenter.getInstance(this.f24260s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f24255c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f24257f;
            if (hashSet.isEmpty()) {
                s5 s5Var = this.h;
                if (s5Var != null) {
                    s5Var.b(this);
                }
                z71 z71Var = this.f24258n;
                if (z71Var != null) {
                    z71Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f24259r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f24261w != null) {
                NotificationCenter.getInstance(this.f24260s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a81.d():void");
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
        i30 i30Var = this.f24253a;
        i30Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = i30Var.f27018c;
        if (this.f24256e != null) {
            this.f24255c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f24255c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(i30Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        s5 s5Var = this.h;
        if (s5Var != null) {
            ai.m4 m4Var = s5Var.f30402k;
            if (m4Var != null) {
                m4Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            s5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            s5Var.draw(canvas);
        }
        z71 z71Var = this.f24258n;
        if (z71Var != null) {
            float f10 = width * 2;
            z71Var.setRoundRadius((int) (0.13f * f10));
            z71Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            z71Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && a81.class == obj.getClass()) {
            a81 a81Var = (a81) obj;
            s5 s5Var = a81Var.h;
            if (this.f24254b == a81Var.f24254b) {
                i30 i30Var = this.f24253a;
                int i10 = i30Var.d;
                i30 i30Var2 = a81Var.f24253a;
                if (i10 == i30Var2.d && i30Var.f27019e == i30Var2.f27019e && i30Var.f27020f == i30Var2.f27020f && i30Var.f27021g == i30Var2.f27021g) {
                    s5 s5Var2 = this.h;
                    if (s5Var2 != null && s5Var != null) {
                        if (s5Var2.i() == s5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f24261w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = a81Var.f24261w) != null && tL_videoSizeStickerMarkup2.stickerset.f19823id == tL_videoSizeStickerMarkup.stickerset.f19823id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f24257f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24253a.f27018c.setAlpha(i10);
        s5 s5Var = this.h;
        if (s5Var != null) {
            s5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(ik0 ik0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
