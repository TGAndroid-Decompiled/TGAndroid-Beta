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
public final class e51 extends Drawable implements n5, q6, org.telegram.messenger.ls {
    public final e10 f33163a;
    public final int f33164b;
    public float f33165c;
    public final boolean d;
    public ImageReceiver f33166e;
    public final HashSet f33167f;
    public final h5 h;
    public final d51 f33168n;
    public final ImageReceiver f33169r;
    public final int f33170s;
    public boolean f33171w;
    public final TLRPC.TL_videoSizeStickerMarkup f33172x;

    public e51(TLRPC.VideoSize videoSize, boolean z9, int i7) {
        int i10;
        int i11;
        int i12;
        e10 e10Var = new e10();
        this.f33163a = e10Var;
        this.f33167f = new HashSet();
        this.f33169r = new ImageReceiver(null);
        this.f33170s = org.telegram.messenger.p10.f24474s0;
        this.f33164b = i7;
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
            h5 h5Var = new h5(i12, org.telegram.messenger.p10.f24474s0, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = h5Var;
            h5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f33172x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            d51 d51Var = new d51(this);
            this.f33168n = d51Var;
            d51Var.J0 = true;
            if (i7 == 1) {
                d51Var.X(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f33167f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            h5 h5Var = this.h;
            if (h5Var != null) {
                h5Var.o(this);
            }
            d51 d51Var = this.f33168n;
            if (d51Var != null) {
                d51Var.R();
            }
            ImageReceiver imageReceiver2 = this.f33169r;
            if (imageReceiver2 != null) {
                imageReceiver2.R();
            }
        }
        if (this.f33172x != null) {
            org.telegram.messenger.qs.f(this.f33170s).n(this, org.telegram.messenger.qs.B0);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f33165c = imageReceiver.W0[0];
            HashSet hashSet = this.f33167f;
            if (hashSet.isEmpty()) {
                h5 h5Var = this.h;
                if (h5Var != null) {
                    h5Var.b(this);
                }
                d51 d51Var = this.f33168n;
                if (d51Var != null) {
                    d51Var.P();
                }
                ImageReceiver imageReceiver2 = this.f33169r;
                if (imageReceiver2 != null) {
                    imageReceiver2.P();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f33172x != null) {
                org.telegram.messenger.qs.f(this.f33170s).c(this, org.telegram.messenger.qs.B0);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e51.d():void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.B0 && !this.f33171w) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        e10 e10Var = this.f33163a;
        e10Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = e10Var.f33129c;
        if (this.f33166e != null) {
            this.f33165c = imageReceiver.W0[0];
        }
        float f10 = this.f33165c;
        if (f10 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(e10Var.h, f10, f10, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        h5 h5Var = this.h;
        if (h5Var != null) {
            di.z2 z2Var = h5Var.f34176k;
            if (z2Var != null) {
                z2Var.J0((int) (width * 2 * 0.13f));
            }
            h5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            h5Var.draw(canvas);
        }
        d51 d51Var = this.f33168n;
        if (d51Var != null) {
            float f11 = width * 2;
            d51Var.J0((int) (0.13f * f11));
            d51Var.y0(centerX - width, centerY - width, f11, f11);
            d51Var.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this != obj) {
            if (obj != null && e51.class == obj.getClass()) {
                e51 e51Var = (e51) obj;
                h5 h5Var = e51Var.h;
                if (this.f33164b == e51Var.f33164b) {
                    e10 e10Var = this.f33163a;
                    int i7 = e10Var.d;
                    e10 e10Var2 = e51Var.f33163a;
                    if (i7 == e10Var2.d && e10Var.f33130e == e10Var2.f33130e && e10Var.f33131f == e10Var2.f33131f && e10Var.f33132g == e10Var2.f33132g) {
                        h5 h5Var2 = this.h;
                        if (h5Var2 != null && h5Var != null) {
                            if (h5Var2.h() == h5Var.h()) {
                                return true;
                            }
                            return false;
                        }
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f33172x;
                        if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = e51Var.f33172x) != null && tL_videoSizeStickerMarkup2.stickerset.f26980id == tL_videoSizeStickerMarkup.stickerset.f26980id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f33167f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f33163a.f33129c.setAlpha(i7);
        h5 h5Var = this.h;
        if (h5Var != null) {
            h5Var.setAlpha(i7);
        }
    }

    @Override
    public final void a(ch0 ch0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
