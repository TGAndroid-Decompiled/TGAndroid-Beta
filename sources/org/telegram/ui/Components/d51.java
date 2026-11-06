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
public final class d51 extends Drawable implements o5, r6, org.telegram.messenger.ls {
    public final e10 f32783a;
    public final int f32784b;
    public float f32785c;
    public final boolean d;
    public ImageReceiver f32786e;
    public final HashSet f32787f;
    public final i5 h;
    public final c51 f32788n;
    public final ImageReceiver f32789r;
    public final int f32790s;
    public boolean f32791w;
    public final TLRPC.TL_videoSizeStickerMarkup f32792x;

    public d51(TLRPC.VideoSize videoSize, boolean z9, int i7) {
        int i10;
        int i11;
        int i12;
        e10 e10Var = new e10();
        this.f32783a = e10Var;
        this.f32787f = new HashSet();
        this.f32789r = new ImageReceiver(null);
        this.f32790s = org.telegram.messenger.p10.f24467s0;
        this.f32784b = i7;
        this.d = z9;
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
        e10Var.d(o4, i10, i11, videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i7 == 1 && z9) {
                i12 = 7;
            } else if (i7 == 2) {
                i12 = 15;
            } else {
                i12 = 8;
            }
            i5 i5Var = new i5(i12, org.telegram.messenger.p10.f24467s0, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = i5Var;
            i5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f32792x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            c51 c51Var = new c51(this);
            this.f32788n = c51Var;
            c51Var.J0 = true;
            if (i7 == 1) {
                c51Var.X(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f32787f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            i5 i5Var = this.h;
            if (i5Var != null) {
                i5Var.o(this);
            }
            c51 c51Var = this.f32788n;
            if (c51Var != null) {
                c51Var.R();
            }
            ImageReceiver imageReceiver2 = this.f32789r;
            if (imageReceiver2 != null) {
                imageReceiver2.R();
            }
        }
        if (this.f32792x != null) {
            org.telegram.messenger.qs.f(this.f32790s).n(this, org.telegram.messenger.qs.B0);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f32785c = imageReceiver.W0[0];
            HashSet hashSet = this.f32787f;
            if (hashSet.isEmpty()) {
                i5 i5Var = this.h;
                if (i5Var != null) {
                    i5Var.b(this);
                }
                c51 c51Var = this.f32788n;
                if (c51Var != null) {
                    c51Var.P();
                }
                ImageReceiver imageReceiver2 = this.f32789r;
                if (imageReceiver2 != null) {
                    imageReceiver2.P();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f32792x != null) {
                org.telegram.messenger.qs.f(this.f32790s).c(this, org.telegram.messenger.qs.B0);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d51.d():void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.B0 && !this.f32791w) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        e10 e10Var = this.f32783a;
        e10Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = e10Var.f33126c;
        if (this.f32786e != null) {
            this.f32785c = imageReceiver.W0[0];
        }
        float f10 = this.f32785c;
        if (f10 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(e10Var.h, f10, f10, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        i5 i5Var = this.h;
        if (i5Var != null) {
            di.z2 z2Var = i5Var.f34497k;
            if (z2Var != null) {
                z2Var.J0((int) (width * 2 * 0.13f));
            }
            i5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            i5Var.draw(canvas);
        }
        c51 c51Var = this.f32788n;
        if (c51Var != null) {
            float f11 = width * 2;
            c51Var.J0((int) (0.13f * f11));
            c51Var.y0(centerX - width, centerY - width, f11, f11);
            c51Var.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this != obj) {
            if (obj != null && d51.class == obj.getClass()) {
                d51 d51Var = (d51) obj;
                i5 i5Var = d51Var.h;
                if (this.f32784b == d51Var.f32784b) {
                    e10 e10Var = this.f32783a;
                    int i7 = e10Var.d;
                    e10 e10Var2 = d51Var.f32783a;
                    if (i7 == e10Var2.d && e10Var.f33127e == e10Var2.f33127e && e10Var.f33128f == e10Var2.f33128f && e10Var.f33129g == e10Var2.f33129g) {
                        i5 i5Var2 = this.h;
                        if (i5Var2 != null && i5Var != null) {
                            if (i5Var2.h() == i5Var.h()) {
                                return true;
                            }
                            return false;
                        }
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f32792x;
                        if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = d51Var.f32792x) != null && tL_videoSizeStickerMarkup2.stickerset.f26973id == tL_videoSizeStickerMarkup.stickerset.f26973id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f32787f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f32783a.f33126c.setAlpha(i7);
        i5 i5Var = this.h;
        if (i5Var != null) {
            i5Var.setAlpha(i7);
        }
    }

    @Override
    public final void a(ch0 ch0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
