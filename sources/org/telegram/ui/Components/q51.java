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
public final class q51 extends Drawable implements u5, v6, org.telegram.messenger.fs {
    public final p10 f38701a;
    public final int f38702b;
    public float f38703c;
    public final boolean d;
    public ImageReceiver f38704e;
    public final HashSet f38705f;
    public final o5 h;
    public final p51 f38706n;
    public final ImageReceiver f38707r;
    public final int f38708s;
    public boolean f38709w;
    public final TLRPC.TL_videoSizeStickerMarkup f38710x;

    public q51(TLRPC.VideoSize videoSize, boolean z10, int i7) {
        int i10;
        int i11;
        int i12;
        p10 p10Var = new p10();
        this.f38701a = p10Var;
        this.f38705f = new HashSet();
        this.f38707r = new ImageReceiver(null);
        this.f38708s = org.telegram.messenger.j10.f24770t0;
        this.f38702b = i7;
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
        p10Var.d(o4, i10, i11, videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i7 == 1 && z10) {
                i12 = 7;
            } else if (i7 == 2) {
                i12 = 15;
            } else {
                i12 = 8;
            }
            o5 o5Var = new o5(i12, org.telegram.messenger.j10.f24770t0, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = o5Var;
            o5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f38710x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            p51 p51Var = new p51(this);
            this.f38706n = p51Var;
            p51Var.K0 = true;
            if (i7 == 1) {
                p51Var.X(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f38705f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            o5 o5Var = this.h;
            if (o5Var != null) {
                o5Var.o(this);
            }
            p51 p51Var = this.f38706n;
            if (p51Var != null) {
                p51Var.R();
            }
            ImageReceiver imageReceiver2 = this.f38707r;
            if (imageReceiver2 != null) {
                imageReceiver2.R();
            }
        }
        if (this.f38710x != null) {
            org.telegram.messenger.ks.f(this.f38708s).n(this, org.telegram.messenger.ks.B0);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f38703c = imageReceiver.X0[0];
            HashSet hashSet = this.f38705f;
            if (hashSet.isEmpty()) {
                o5 o5Var = this.h;
                if (o5Var != null) {
                    o5Var.b(this);
                }
                p51 p51Var = this.f38706n;
                if (p51Var != null) {
                    p51Var.P();
                }
                ImageReceiver imageReceiver2 = this.f38707r;
                if (imageReceiver2 != null) {
                    imageReceiver2.P();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f38710x != null) {
                org.telegram.messenger.ks.f(this.f38708s).c(this, org.telegram.messenger.ks.B0);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q51.d():void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.B0 && !this.f38709w) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        p10 p10Var = this.f38701a;
        p10Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = p10Var.f38236c;
        if (this.f38704e != null) {
            this.f38703c = imageReceiver.X0[0];
        }
        float f10 = this.f38703c;
        if (f10 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(p10Var.h, f10, f10, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        o5 o5Var = this.h;
        if (o5Var != null) {
            fi.s2 s2Var = o5Var.f37976k;
            if (s2Var != null) {
                s2Var.J0((int) (width * 2 * 0.13f));
            }
            o5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            o5Var.draw(canvas);
        }
        p51 p51Var = this.f38706n;
        if (p51Var != null) {
            float f11 = width * 2;
            p51Var.J0((int) (0.13f * f11));
            p51Var.y0(centerX - width, centerY - width, f11, f11);
            p51Var.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this != obj) {
            if (obj != null && q51.class == obj.getClass()) {
                q51 q51Var = (q51) obj;
                o5 o5Var = q51Var.h;
                if (this.f38702b == q51Var.f38702b) {
                    p10 p10Var = this.f38701a;
                    int i7 = p10Var.d;
                    p10 p10Var2 = q51Var.f38701a;
                    if (i7 == p10Var2.d && p10Var.f38237e == p10Var2.f38237e && p10Var.f38238f == p10Var2.f38238f && p10Var.f38239g == p10Var2.f38239g) {
                        o5 o5Var2 = this.h;
                        if (o5Var2 != null && o5Var != null) {
                            if (o5Var2.h() == o5Var.h()) {
                                return true;
                            }
                            return false;
                        }
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f38710x;
                        if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = q51Var.f38710x) != null && tL_videoSizeStickerMarkup2.stickerset.f28423id == tL_videoSizeStickerMarkup.stickerset.f28423id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f38705f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f38701a.f38236c.setAlpha(i7);
        o5 o5Var = this.h;
        if (o5Var != null) {
            o5Var.setAlpha(i7);
        }
    }

    @Override
    public final void a(ph0 ph0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
