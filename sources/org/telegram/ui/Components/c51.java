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
public final class c51 extends Drawable implements o5, r6, org.telegram.messenger.ls {
    public final e10 f32414a;
    public final int f32415b;
    public float f32416c;
    public final boolean d;
    public ImageReceiver f32417e;
    public final HashSet f32418f;
    public final i5 h;
    public final b51 f32419n;
    public final ImageReceiver f32420r;
    public final int f32421s;
    public boolean f32422w;
    public final TLRPC.TL_videoSizeStickerMarkup f32423x;

    public c51(TLRPC.VideoSize videoSize, boolean z9, int i7) {
        int i10;
        int i11;
        int i12;
        e10 e10Var = new e10();
        this.f32414a = e10Var;
        this.f32418f = new HashSet();
        this.f32420r = new ImageReceiver(null);
        this.f32421s = org.telegram.messenger.p10.f24459s0;
        this.f32415b = i7;
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
            i5 i5Var = new i5(i12, org.telegram.messenger.p10.f24459s0, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = i5Var;
            i5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f32423x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            b51 b51Var = new b51(this);
            this.f32419n = b51Var;
            b51Var.J0 = true;
            if (i7 == 1) {
                b51Var.X(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f32418f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            i5 i5Var = this.h;
            if (i5Var != null) {
                i5Var.o(this);
            }
            b51 b51Var = this.f32419n;
            if (b51Var != null) {
                b51Var.R();
            }
            ImageReceiver imageReceiver2 = this.f32420r;
            if (imageReceiver2 != null) {
                imageReceiver2.R();
            }
        }
        if (this.f32423x != null) {
            org.telegram.messenger.qs.f(this.f32421s).n(this, org.telegram.messenger.qs.B0);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f32416c = imageReceiver.W0[0];
            HashSet hashSet = this.f32418f;
            if (hashSet.isEmpty()) {
                i5 i5Var = this.h;
                if (i5Var != null) {
                    i5Var.b(this);
                }
                b51 b51Var = this.f32419n;
                if (b51Var != null) {
                    b51Var.P();
                }
                ImageReceiver imageReceiver2 = this.f32420r;
                if (imageReceiver2 != null) {
                    imageReceiver2.P();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f32423x != null) {
                org.telegram.messenger.qs.f(this.f32421s).c(this, org.telegram.messenger.qs.B0);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c51.d():void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.B0 && !this.f32422w) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        e10 e10Var = this.f32414a;
        e10Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = e10Var.f33099c;
        if (this.f32417e != null) {
            this.f32416c = imageReceiver.W0[0];
        }
        float f10 = this.f32416c;
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
            di.z2 z2Var = i5Var.f34450k;
            if (z2Var != null) {
                z2Var.J0((int) (width * 2 * 0.13f));
            }
            i5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            i5Var.draw(canvas);
        }
        b51 b51Var = this.f32419n;
        if (b51Var != null) {
            float f11 = width * 2;
            b51Var.J0((int) (0.13f * f11));
            b51Var.y0(centerX - width, centerY - width, f11, f11);
            b51Var.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this != obj) {
            if (obj != null && c51.class == obj.getClass()) {
                c51 c51Var = (c51) obj;
                i5 i5Var = c51Var.h;
                if (this.f32415b == c51Var.f32415b) {
                    e10 e10Var = this.f32414a;
                    int i7 = e10Var.d;
                    e10 e10Var2 = c51Var.f32414a;
                    if (i7 == e10Var2.d && e10Var.f33100e == e10Var2.f33100e && e10Var.f33101f == e10Var2.f33101f && e10Var.f33102g == e10Var2.f33102g) {
                        i5 i5Var2 = this.h;
                        if (i5Var2 != null && i5Var != null) {
                            if (i5Var2.h() == i5Var.h()) {
                                return true;
                            }
                            return false;
                        }
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f32423x;
                        if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = c51Var.f32423x) != null && tL_videoSizeStickerMarkup2.stickerset.f26972id == tL_videoSizeStickerMarkup.stickerset.f26972id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f32418f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f32414a.f33099c.setAlpha(i7);
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
