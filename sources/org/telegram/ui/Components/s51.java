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
public final class s51 extends Drawable implements u5, v6, org.telegram.messenger.fs {
    public final q10 f39501a;
    public final int f39502b;
    public float f39503c;
    public final boolean d;
    public ImageReceiver f39504e;
    public final HashSet f39505f;
    public final o5 h;
    public final r51 f39506n;
    public final ImageReceiver f39507r;
    public final int f39508s;
    public boolean f39509w;
    public final TLRPC.TL_videoSizeStickerMarkup f39510x;

    public s51(TLRPC.VideoSize videoSize, boolean z10, int i7) {
        int i10;
        int i11;
        int i12;
        q10 q10Var = new q10();
        this.f39501a = q10Var;
        this.f39505f = new HashSet();
        this.f39507r = new ImageReceiver(null);
        this.f39508s = org.telegram.messenger.i10.f24637t0;
        this.f39502b = i7;
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
        q10Var.d(o4, i10, i11, videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i7 == 1 && z10) {
                i12 = 7;
            } else if (i7 == 2) {
                i12 = 15;
            } else {
                i12 = 8;
            }
            o5 o5Var = new o5(i12, org.telegram.messenger.i10.f24637t0, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = o5Var;
            o5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f39510x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            r51 r51Var = new r51(this);
            this.f39506n = r51Var;
            r51Var.K0 = true;
            if (i7 == 1) {
                r51Var.Y(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f39505f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            o5 o5Var = this.h;
            if (o5Var != null) {
                o5Var.o(this);
            }
            r51 r51Var = this.f39506n;
            if (r51Var != null) {
                r51Var.S();
            }
            ImageReceiver imageReceiver2 = this.f39507r;
            if (imageReceiver2 != null) {
                imageReceiver2.S();
            }
        }
        if (this.f39510x != null) {
            org.telegram.messenger.ks.f(this.f39508s).n(this, org.telegram.messenger.ks.B0);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f39503c = imageReceiver.X0[0];
            HashSet hashSet = this.f39505f;
            if (hashSet.isEmpty()) {
                o5 o5Var = this.h;
                if (o5Var != null) {
                    o5Var.b(this);
                }
                r51 r51Var = this.f39506n;
                if (r51Var != null) {
                    r51Var.Q();
                }
                ImageReceiver imageReceiver2 = this.f39507r;
                if (imageReceiver2 != null) {
                    imageReceiver2.Q();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f39510x != null) {
                org.telegram.messenger.ks.f(this.f39508s).c(this, org.telegram.messenger.ks.B0);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s51.d():void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.B0 && !this.f39509w) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        q10 q10Var = this.f39501a;
        q10Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = q10Var.f38661c;
        if (this.f39504e != null) {
            this.f39503c = imageReceiver.X0[0];
        }
        float f10 = this.f39503c;
        if (f10 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(q10Var.h, f10, f10, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        o5 o5Var = this.h;
        if (o5Var != null) {
            fi.s2 s2Var = o5Var.f38028k;
            if (s2Var != null) {
                s2Var.K0((int) (width * 2 * 0.13f));
            }
            o5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            o5Var.draw(canvas);
        }
        r51 r51Var = this.f39506n;
        if (r51Var != null) {
            float f11 = width * 2;
            r51Var.K0((int) (0.13f * f11));
            r51Var.z0(centerX - width, centerY - width, f11, f11);
            r51Var.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this != obj) {
            if (obj != null && s51.class == obj.getClass()) {
                s51 s51Var = (s51) obj;
                o5 o5Var = s51Var.h;
                if (this.f39502b == s51Var.f39502b) {
                    q10 q10Var = this.f39501a;
                    int i7 = q10Var.d;
                    q10 q10Var2 = s51Var.f39501a;
                    if (i7 == q10Var2.d && q10Var.f38662e == q10Var2.f38662e && q10Var.f38663f == q10Var2.f38663f && q10Var.f38664g == q10Var2.f38664g) {
                        o5 o5Var2 = this.h;
                        if (o5Var2 != null && o5Var != null) {
                            if (o5Var2.h() == o5Var.h()) {
                                return true;
                            }
                            return false;
                        }
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f39510x;
                        if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = s51Var.f39510x) != null && tL_videoSizeStickerMarkup2.stickerset.f28512id == tL_videoSizeStickerMarkup.stickerset.f28512id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f39505f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f39501a.f38661c.setAlpha(i7);
        o5 o5Var = this.h;
        if (o5Var != null) {
            o5Var.setAlpha(i7);
        }
    }

    @Override
    public final void a(qh0 qh0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
