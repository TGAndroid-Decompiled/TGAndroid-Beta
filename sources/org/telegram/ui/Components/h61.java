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
public final class h61 extends Drawable implements l5, n6, org.telegram.messenger.vs {
    public final u10 f26688a;
    public final int f26689b;
    public float f26690c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f26691f;
    public final f5 h;
    public final g61 f26692n;
    public final ImageReceiver f26693r;
    public final int f26694s;
    public boolean f26695w;
    public final TLRPC.TL_videoSizeStickerMarkup f26696x;

    public h61(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        u10 u10Var = new u10();
        this.f26688a = u10Var;
        this.f26691f = new HashSet();
        this.f26693r = new ImageReceiver(null);
        this.f26694s = org.telegram.messenger.e20.f15506s0;
        this.f26689b = i10;
        this.d = z10;
        int o10 = i0.b.o(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i11 = i0.b.o(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i11 = 0;
        }
        if (videoSize.background_colors.size() > 2) {
            i12 = i0.b.o(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i12 = 0;
        }
        u10Var.d(o10, i11, i12, videoSize.background_colors.size() > 3 ? i0.b.o(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i10 == 1 && z10) {
                i13 = 7;
            } else if (i10 == 2) {
                i13 = 15;
            } else {
                i13 = 8;
            }
            f5 f5Var = new f5(i13, org.telegram.messenger.e20.f15506s0, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = f5Var;
            f5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f26696x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            g61 g61Var = new g61(this);
            this.f26692n = g61Var;
            g61Var.J0 = true;
            if (i10 == 1) {
                g61Var.X(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f26691f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            f5 f5Var = this.h;
            if (f5Var != null) {
                f5Var.o(this);
            }
            g61 g61Var = this.f26692n;
            if (g61Var != null) {
                g61Var.R();
            }
            ImageReceiver imageReceiver2 = this.f26693r;
            if (imageReceiver2 != null) {
                imageReceiver2.R();
            }
        }
        if (this.f26696x != null) {
            org.telegram.messenger.at.f(this.f26694s).n(this, org.telegram.messenger.at.B0);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f26690c = imageReceiver.W0[0];
            HashSet hashSet = this.f26691f;
            if (hashSet.isEmpty()) {
                f5 f5Var = this.h;
                if (f5Var != null) {
                    f5Var.b(this);
                }
                g61 g61Var = this.f26692n;
                if (g61Var != null) {
                    g61Var.P();
                }
                ImageReceiver imageReceiver2 = this.f26693r;
                if (imageReceiver2 != null) {
                    imageReceiver2.P();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f26696x != null) {
                org.telegram.messenger.at.f(this.f26694s).c(this, org.telegram.messenger.at.B0);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h61.d():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.B0 && !this.f26695w) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        u10 u10Var = this.f26688a;
        u10Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = u10Var.f30808c;
        if (this.e != null) {
            this.f26690c = imageReceiver.W0[0];
        }
        float f7 = this.f26690c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(u10Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        f5 f5Var = this.h;
        if (f5Var != null) {
            ag.c2 c2Var = f5Var.f26070k;
            if (c2Var != null) {
                c2Var.J0((int) (width * 2 * 0.13f));
            }
            f5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            f5Var.draw(canvas);
        }
        g61 g61Var = this.f26692n;
        if (g61Var != null) {
            float f10 = width * 2;
            g61Var.J0((int) (0.13f * f10));
            g61Var.y0(centerX - width, centerY - width, f10, f10);
            g61Var.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this != obj) {
            if (obj != null && h61.class == obj.getClass()) {
                h61 h61Var = (h61) obj;
                f5 f5Var = h61Var.h;
                if (this.f26689b == h61Var.f26689b) {
                    u10 u10Var = this.f26688a;
                    int i10 = u10Var.d;
                    u10 u10Var2 = h61Var.f26688a;
                    if (i10 == u10Var2.d && u10Var.e == u10Var2.e && u10Var.f30809f == u10Var2.f30809f && u10Var.f30810g == u10Var2.f30810g) {
                        f5 f5Var2 = this.h;
                        if (f5Var2 != null && f5Var != null) {
                            if (f5Var2.h() == f5Var.h()) {
                                return true;
                            }
                            return false;
                        }
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f26696x;
                        if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = h61Var.f26696x) != null && tL_videoSizeStickerMarkup2.stickerset.f19814id == tL_videoSizeStickerMarkup.stickerset.f19814id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f26691f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26688a.f30808c.setAlpha(i10);
        f5 f5Var = this.h;
        if (f5Var != null) {
            f5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(fi0 fi0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
