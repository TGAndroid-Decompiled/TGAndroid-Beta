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
import org.telegram.tgnet.TLRPC;
public final class t51 extends Drawable implements v5, w6, org.telegram.messenger.fs {
    public final s10 f39782a;
    public final int f39783b;
    public float f39784c;
    public final boolean d;
    public ImageReceiver f39785e;
    public final HashSet f39786f;
    public final p5 h;
    public final s51 f39787n;
    public final ImageReceiver f39788r;
    public final int f39789s;
    public boolean f39790w;
    public final TLRPC.TL_videoSizeStickerMarkup f39791x;

    public t51(TLRPC.VideoSize videoSize, boolean z10, int i7) {
        int i10;
        int i11;
        int i12;
        s10 s10Var = new s10();
        this.f39782a = s10Var;
        this.f39786f = new HashSet();
        this.f39788r = new ImageReceiver(null);
        this.f39789s = org.telegram.messenger.j10.f24798t0;
        this.f39783b = i7;
        this.d = z10;
        int o4 = i0.a.o(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i10 = i0.a.o(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i10 = 0;
        }
        if (videoSize.background_colors.size() > 2) {
            i11 = i0.a.o(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i11 = 0;
        }
        s10Var.d(o4, i10, i11, videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i7 == 1 && z10) {
                i12 = 7;
            } else if (i7 == 2) {
                i12 = 15;
            } else {
                i12 = 8;
            }
            p5 p5Var = new p5(i12, org.telegram.messenger.j10.f24798t0, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = p5Var;
            p5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f39791x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            s51 s51Var = new s51(this);
            this.f39787n = s51Var;
            s51Var.K0 = true;
            if (i7 == 1) {
                s51Var.X(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f39786f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            p5 p5Var = this.h;
            if (p5Var != null) {
                p5Var.o(this);
            }
            s51 s51Var = this.f39787n;
            if (s51Var != null) {
                s51Var.R();
            }
            ImageReceiver imageReceiver2 = this.f39788r;
            if (imageReceiver2 != null) {
                imageReceiver2.R();
            }
        }
        if (this.f39791x != null) {
            org.telegram.messenger.ks.f(this.f39789s).n(this, org.telegram.messenger.ks.B0);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f39784c = imageReceiver.X0[0];
            HashSet hashSet = this.f39786f;
            if (hashSet.isEmpty()) {
                p5 p5Var = this.h;
                if (p5Var != null) {
                    p5Var.b(this);
                }
                s51 s51Var = this.f39787n;
                if (s51Var != null) {
                    s51Var.P();
                }
                ImageReceiver imageReceiver2 = this.f39788r;
                if (imageReceiver2 != null) {
                    imageReceiver2.P();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f39791x != null) {
                org.telegram.messenger.ks.f(this.f39789s).c(this, org.telegram.messenger.ks.B0);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t51.d():void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.B0 && !this.f39790w) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        s10 s10Var = this.f39782a;
        s10Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = s10Var.f39454c;
        if (this.f39785e != null) {
            this.f39784c = imageReceiver.X0[0];
        }
        float f10 = this.f39784c;
        if (f10 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(s10Var.h, f10, f10, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        p5 p5Var = this.h;
        if (p5Var != null) {
            fi.s2 s2Var = p5Var.f38501k;
            if (s2Var != null) {
                s2Var.J0((int) (width * 2 * 0.13f));
            }
            p5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            p5Var.draw(canvas);
        }
        s51 s51Var = this.f39787n;
        if (s51Var != null) {
            float f11 = width * 2;
            s51Var.J0((int) (0.13f * f11));
            s51Var.y0(centerX - width, centerY - width, f11, f11);
            s51Var.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this != obj) {
            if (obj != null && t51.class == obj.getClass()) {
                t51 t51Var = (t51) obj;
                p5 p5Var = t51Var.h;
                if (this.f39783b == t51Var.f39783b) {
                    s10 s10Var = this.f39782a;
                    int i7 = s10Var.d;
                    s10 s10Var2 = t51Var.f39782a;
                    if (i7 == s10Var2.d && s10Var.f39455e == s10Var2.f39455e && s10Var.f39456f == s10Var2.f39456f && s10Var.f39457g == s10Var2.f39457g) {
                        p5 p5Var2 = this.h;
                        if (p5Var2 != null && p5Var != null) {
                            if (p5Var2.h() == p5Var.h()) {
                                return true;
                            }
                            return false;
                        }
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f39791x;
                        if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = t51Var.f39791x) != null && tL_videoSizeStickerMarkup2.stickerset.f28451id == tL_videoSizeStickerMarkup.stickerset.f28451id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void invalidate() {
        Iterator it = this.f39786f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f39782a.f39454c.setAlpha(i7);
        p5 p5Var = this.h;
        if (p5Var != null) {
            p5Var.setAlpha(i7);
        }
    }

    @Override
    public final void a(rh0 rh0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
