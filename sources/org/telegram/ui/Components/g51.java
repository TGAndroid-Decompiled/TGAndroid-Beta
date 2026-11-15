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
public final class g51 extends Drawable implements m5, p6, org.telegram.messenger.is {
    public final i10 f34820a;
    public final int f34821b;
    public float f34822c;
    public final boolean d;
    public ImageReceiver f34823e;
    public final HashSet f34824f;
    public final g5 h;
    public final f51 f34825n;
    public final ImageReceiver f34826r;
    public final int f34827s;
    public boolean f34828w;
    public final TLRPC.TL_videoSizeStickerMarkup f34829x;

    public g51(TLRPC.VideoSize videoSize, boolean z10, int i7) {
        int i10;
        int i11;
        int i12;
        i10 i10Var = new i10();
        this.f34820a = i10Var;
        this.f34824f = new HashSet();
        this.f34826r = new ImageReceiver(null);
        this.f34827s = org.telegram.messenger.m10.f24940t0;
        this.f34821b = i7;
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
        i10Var.d(o4, i10, i11, videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i7 == 1 && z10) {
                i12 = 7;
            } else if (i7 == 2) {
                i12 = 15;
            } else {
                i12 = 8;
            }
            g5 g5Var = new g5(i12, org.telegram.messenger.m10.f24940t0, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = g5Var;
            g5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f34829x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            f51 f51Var = new f51(this);
            this.f34825n = f51Var;
            f51Var.K0 = true;
            if (i7 == 1) {
                f51Var.X(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f34824f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            g5 g5Var = this.h;
            if (g5Var != null) {
                g5Var.o(this);
            }
            f51 f51Var = this.f34825n;
            if (f51Var != null) {
                f51Var.R();
            }
            ImageReceiver imageReceiver2 = this.f34826r;
            if (imageReceiver2 != null) {
                imageReceiver2.R();
            }
        }
        if (this.f34829x != null) {
            org.telegram.messenger.ns.f(this.f34827s).n(this, org.telegram.messenger.ns.B0);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f34822c = imageReceiver.X0[0];
            HashSet hashSet = this.f34824f;
            if (hashSet.isEmpty()) {
                g5 g5Var = this.h;
                if (g5Var != null) {
                    g5Var.b(this);
                }
                f51 f51Var = this.f34825n;
                if (f51Var != null) {
                    f51Var.P();
                }
                ImageReceiver imageReceiver2 = this.f34826r;
                if (imageReceiver2 != null) {
                    imageReceiver2.P();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f34829x != null) {
                org.telegram.messenger.ns.f(this.f34827s).c(this, org.telegram.messenger.ns.B0);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g51.d():void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.B0 && !this.f34828w) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        i10 i10Var = this.f34820a;
        i10Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = i10Var.f35408c;
        if (this.f34823e != null) {
            this.f34822c = imageReceiver.X0[0];
        }
        float f10 = this.f34822c;
        if (f10 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(i10Var.h, f10, f10, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        g5 g5Var = this.h;
        if (g5Var != null) {
            fi.u2 u2Var = g5Var.f34813k;
            if (u2Var != null) {
                u2Var.J0((int) (width * 2 * 0.13f));
            }
            g5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            g5Var.draw(canvas);
        }
        f51 f51Var = this.f34825n;
        if (f51Var != null) {
            float f11 = width * 2;
            f51Var.J0((int) (0.13f * f11));
            f51Var.y0(centerX - width, centerY - width, f11, f11);
            f51Var.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this != obj) {
            if (obj != null && g51.class == obj.getClass()) {
                g51 g51Var = (g51) obj;
                g5 g5Var = g51Var.h;
                if (this.f34821b == g51Var.f34821b) {
                    i10 i10Var = this.f34820a;
                    int i7 = i10Var.d;
                    i10 i10Var2 = g51Var.f34820a;
                    if (i7 == i10Var2.d && i10Var.f35409e == i10Var2.f35409e && i10Var.f35410f == i10Var2.f35410f && i10Var.f35411g == i10Var2.f35411g) {
                        g5 g5Var2 = this.h;
                        if (g5Var2 != null && g5Var != null) {
                            if (g5Var2.h() == g5Var.h()) {
                                return true;
                            }
                            return false;
                        }
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f34829x;
                        if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = g51Var.f34829x) != null && tL_videoSizeStickerMarkup2.stickerset.f28071id == tL_videoSizeStickerMarkup.stickerset.f28071id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f34824f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f34820a.f35408c.setAlpha(i7);
        g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.setAlpha(i7);
        }
    }

    @Override
    public final void a(fh0 fh0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
