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
public final class x41 extends Drawable implements m5, p6, org.telegram.messenger.cs {
    public final b10 f40225a;
    public final int f40226b;
    public float f40227c;
    public final boolean d;
    public ImageReceiver f40228e;
    public final HashSet f40229f;
    public final g5 h;
    public final w41 f40230n;
    public final ImageReceiver f40231r;
    public final int f40232s;
    public boolean f40233w;
    public final TLRPC.TL_videoSizeStickerMarkup f40234x;

    public x41(TLRPC.VideoSize videoSize, boolean z10, int i3) {
        int i10;
        int i11;
        int i12;
        b10 b10Var = new b10();
        this.f40225a = b10Var;
        this.f40229f = new HashSet();
        this.f40231r = new ImageReceiver(null);
        this.f40232s = org.telegram.messenger.h10.f22829t0;
        this.f40226b = i3;
        this.d = z10;
        int o10 = i0.a.o(videoSize.background_colors.get(0).intValue(), 255);
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
        b10Var.d(o10, i10, i11, videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i3 == 1 && z10) {
                i12 = 7;
            } else if (i3 == 2) {
                i12 = 15;
            } else {
                i12 = 8;
            }
            g5 g5Var = new g5(i12, org.telegram.messenger.h10.f22829t0, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = g5Var;
            g5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f40234x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            w41 w41Var = new w41(this);
            this.f40230n = w41Var;
            w41Var.K0 = true;
            if (i3 == 1) {
                w41Var.X(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f40229f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            g5 g5Var = this.h;
            if (g5Var != null) {
                g5Var.o(this);
            }
            w41 w41Var = this.f40230n;
            if (w41Var != null) {
                w41Var.R();
            }
            ImageReceiver imageReceiver2 = this.f40231r;
            if (imageReceiver2 != null) {
                imageReceiver2.R();
            }
        }
        if (this.f40234x != null) {
            org.telegram.messenger.hs.f(this.f40232s).n(this, org.telegram.messenger.hs.B0);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f40227c = imageReceiver.X0[0];
            HashSet hashSet = this.f40229f;
            if (hashSet.isEmpty()) {
                g5 g5Var = this.h;
                if (g5Var != null) {
                    g5Var.b(this);
                }
                w41 w41Var = this.f40230n;
                if (w41Var != null) {
                    w41Var.P();
                }
                ImageReceiver imageReceiver2 = this.f40231r;
                if (imageReceiver2 != null) {
                    imageReceiver2.P();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f40234x != null) {
                org.telegram.messenger.hs.f(this.f40232s).c(this, org.telegram.messenger.hs.B0);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x41.d():void");
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.B0 && !this.f40233w) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        b10 b10Var = this.f40225a;
        b10Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = b10Var.f32038c;
        if (this.f40228e != null) {
            this.f40227c = imageReceiver.X0[0];
        }
        float f10 = this.f40227c;
        if (f10 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(b10Var.h, f10, f10, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        g5 g5Var = this.h;
        if (g5Var != null) {
            ei.c3 c3Var = g5Var.f33971k;
            if (c3Var != null) {
                c3Var.J0((int) (width * 2 * 0.13f));
            }
            g5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            g5Var.draw(canvas);
        }
        w41 w41Var = this.f40230n;
        if (w41Var != null) {
            float f11 = width * 2;
            w41Var.J0((int) (0.13f * f11));
            w41Var.y0(centerX - width, centerY - width, f11, f11);
            w41Var.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this != obj) {
            if (obj != null && x41.class == obj.getClass()) {
                x41 x41Var = (x41) obj;
                g5 g5Var = x41Var.h;
                if (this.f40226b == x41Var.f40226b) {
                    b10 b10Var = this.f40225a;
                    int i3 = b10Var.d;
                    b10 b10Var2 = x41Var.f40225a;
                    if (i3 == b10Var2.d && b10Var.f32039e == b10Var2.f32039e && b10Var.f32040f == b10Var2.f32040f && b10Var.f32041g == b10Var2.f32041g) {
                        g5 g5Var2 = this.h;
                        if (g5Var2 != null && g5Var != null) {
                            if (g5Var2.h() == g5Var.h()) {
                                return true;
                            }
                            return false;
                        }
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f40234x;
                        if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = x41Var.f40234x) != null && tL_videoSizeStickerMarkup2.stickerset.f27021id == tL_videoSizeStickerMarkup.stickerset.f27021id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f40229f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i3) {
        this.f40225a.f32038c.setAlpha(i3);
        g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.setAlpha(i3);
        }
    }

    @Override
    public final void a(fh0 fh0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
