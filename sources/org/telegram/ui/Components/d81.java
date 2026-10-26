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
public final class d81 extends Drawable implements z5, a7, NotificationCenter.NotificationCenterDelegate {
    public final z20 f27425a;
    public final int f27426b;
    public float f27427c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f27428f;
    public final t5 h;
    public final c81 f27429n;
    public final ImageReceiver f27430r;
    public final int f27431s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f27432w;

    public d81(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        z20 z20Var = new z20();
        this.f27425a = z20Var;
        this.f27428f = new HashSet();
        this.f27430r = new ImageReceiver();
        this.f27431s = UserConfig.selectedAccount;
        this.f27426b = i10;
        this.d = z10;
        int o10 = i0.a.o(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i11 = i0.a.o(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i11 = 0;
        }
        if (videoSize.background_colors.size() > 2) {
            i12 = i0.a.o(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i12 = 0;
        }
        z20Var.d(o10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i10 == 1 && z10) {
                i13 = 7;
            } else if (i10 == 2) {
                i13 = 15;
            } else {
                i13 = 8;
            }
            t5 t5Var = new t5(i13, UserConfig.selectedAccount, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = t5Var;
            t5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f27432w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            c81 c81Var = new c81(this);
            this.f27429n = c81Var;
            c81Var.setInvalidateAll(true);
            if (i10 == 1) {
                c81Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f27428f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            t5 t5Var = this.h;
            if (t5Var != null) {
                t5Var.p(this);
            }
            c81 c81Var = this.f27429n;
            if (c81Var != null) {
                c81Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f27430r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f27432w != null) {
            NotificationCenter.getInstance(this.f27431s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f27427c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f27428f;
            if (hashSet.isEmpty()) {
                t5 t5Var = this.h;
                if (t5Var != null) {
                    t5Var.b(this);
                }
                c81 c81Var = this.f27429n;
                if (c81Var != null) {
                    c81Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f27430r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f27432w != null) {
                NotificationCenter.getInstance(this.f27431s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d81.d():void");
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
        z20 z20Var = this.f27425a;
        z20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = z20Var.f35187c;
        if (this.e != null) {
            this.f27427c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f27427c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(z20Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        t5 t5Var = this.h;
        if (t5Var != null) {
            di.f3 f3Var = t5Var.f32852k;
            if (f3Var != null) {
                f3Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            t5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            t5Var.draw(canvas);
        }
        c81 c81Var = this.f27429n;
        if (c81Var != null) {
            float f10 = width * 2;
            c81Var.setRoundRadius((int) (0.13f * f10));
            c81Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            c81Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && d81.class == obj.getClass()) {
            d81 d81Var = (d81) obj;
            t5 t5Var = d81Var.h;
            if (this.f27426b == d81Var.f27426b) {
                z20 z20Var = this.f27425a;
                int i10 = z20Var.d;
                z20 z20Var2 = d81Var.f27425a;
                if (i10 == z20Var2.d && z20Var.e == z20Var2.e && z20Var.f35188f == z20Var2.f35188f && z20Var.f35189g == z20Var2.f35189g) {
                    t5 t5Var2 = this.h;
                    if (t5Var2 != null && t5Var != null) {
                        if (t5Var2.i() == t5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f27432w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = d81Var.f27432w) != null && tL_videoSizeStickerMarkup2.stickerset.f22047id == tL_videoSizeStickerMarkup.stickerset.f22047id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f27428f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27425a.f35187c.setAlpha(i10);
        t5 t5Var = this.h;
        if (t5Var != null) {
            t5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(ak0 ak0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
