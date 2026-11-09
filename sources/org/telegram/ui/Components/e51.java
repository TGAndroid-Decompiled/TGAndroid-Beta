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
public final class e51 extends Drawable implements o5, r6, org.telegram.messenger.ls {
    public final f10 f33296a;
    public final int f33297b;
    public float f33298c;
    public final boolean d;
    public ImageReceiver f33299e;
    public final HashSet f33300f;
    public final i5 h;
    public final d51 f33301n;
    public final ImageReceiver f33302r;
    public final int f33303s;
    public boolean f33304w;
    public final TLRPC.TL_videoSizeStickerMarkup f33305x;

    public e51(TLRPC.VideoSize videoSize, boolean z9, int i7) {
        int i10;
        int i11;
        int i12;
        f10 f10Var = new f10();
        this.f33296a = f10Var;
        this.f33300f = new HashSet();
        this.f33302r = new ImageReceiver(null);
        this.f33303s = org.telegram.messenger.p10.f24470s0;
        this.f33297b = i7;
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
        f10Var.d(o4, i10, i11, videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i7 == 1 && z9) {
                i12 = 7;
            } else if (i7 == 2) {
                i12 = 15;
            } else {
                i12 = 8;
            }
            i5 i5Var = new i5(i12, org.telegram.messenger.p10.f24470s0, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = i5Var;
            i5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f33305x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            d51 d51Var = new d51(this);
            this.f33301n = d51Var;
            d51Var.J0 = true;
            if (i7 == 1) {
                d51Var.X(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f33300f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            i5 i5Var = this.h;
            if (i5Var != null) {
                i5Var.o(this);
            }
            d51 d51Var = this.f33301n;
            if (d51Var != null) {
                d51Var.R();
            }
            ImageReceiver imageReceiver2 = this.f33302r;
            if (imageReceiver2 != null) {
                imageReceiver2.R();
            }
        }
        if (this.f33305x != null) {
            org.telegram.messenger.qs.f(this.f33303s).n(this, org.telegram.messenger.qs.B0);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f33298c = imageReceiver.W0[0];
            HashSet hashSet = this.f33300f;
            if (hashSet.isEmpty()) {
                i5 i5Var = this.h;
                if (i5Var != null) {
                    i5Var.b(this);
                }
                d51 d51Var = this.f33301n;
                if (d51Var != null) {
                    d51Var.P();
                }
                ImageReceiver imageReceiver2 = this.f33302r;
                if (imageReceiver2 != null) {
                    imageReceiver2.P();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f33305x != null) {
                org.telegram.messenger.qs.f(this.f33303s).c(this, org.telegram.messenger.qs.B0);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e51.d():void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.B0 && !this.f33304w) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        f10 f10Var = this.f33296a;
        f10Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = f10Var.f33549c;
        if (this.f33299e != null) {
            this.f33298c = imageReceiver.W0[0];
        }
        float f10 = this.f33298c;
        if (f10 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(f10Var.h, f10, f10, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        i5 i5Var = this.h;
        if (i5Var != null) {
            di.z2 z2Var = i5Var.f34568k;
            if (z2Var != null) {
                z2Var.J0((int) (width * 2 * 0.13f));
            }
            i5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            i5Var.draw(canvas);
        }
        d51 d51Var = this.f33301n;
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
                i5 i5Var = e51Var.h;
                if (this.f33297b == e51Var.f33297b) {
                    f10 f10Var = this.f33296a;
                    int i7 = f10Var.d;
                    f10 f10Var2 = e51Var.f33296a;
                    if (i7 == f10Var2.d && f10Var.f33550e == f10Var2.f33550e && f10Var.f33551f == f10Var2.f33551f && f10Var.f33552g == f10Var2.f33552g) {
                        i5 i5Var2 = this.h;
                        if (i5Var2 != null && i5Var != null) {
                            if (i5Var2.h() == i5Var.h()) {
                                return true;
                            }
                            return false;
                        }
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f33305x;
                        if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = e51Var.f33305x) != null && tL_videoSizeStickerMarkup2.stickerset.f26976id == tL_videoSizeStickerMarkup.stickerset.f26976id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f33300f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f33296a.f33549c.setAlpha(i7);
        i5 i5Var = this.h;
        if (i5Var != null) {
            i5Var.setAlpha(i7);
        }
    }

    @Override
    public final void a(dh0 dh0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
