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
public final class g61 extends Drawable implements l5, n6, org.telegram.messenger.us {
    public final u10 f26264a;
    public final int f26265b;
    public float f26266c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f26267f;
    public final f5 h;
    public final f61 f26268n;
    public final ImageReceiver f26269r;
    public final int f26270s;
    public boolean f26271w;
    public final TLRPC.TL_videoSizeStickerMarkup f26272x;

    public g61(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        u10 u10Var = new u10();
        this.f26264a = u10Var;
        this.f26267f = new HashSet();
        this.f26269r = new ImageReceiver(null);
        this.f26270s = org.telegram.messenger.d20.f15147s0;
        this.f26265b = i10;
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
            f5 f5Var = new f5(i13, org.telegram.messenger.d20.f15147s0, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = f5Var;
            f5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f26272x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            f61 f61Var = new f61(this);
            this.f26268n = f61Var;
            f61Var.J0 = true;
            if (i10 == 1) {
                f61Var.X(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f26267f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            f5 f5Var = this.h;
            if (f5Var != null) {
                f5Var.o(this);
            }
            f61 f61Var = this.f26268n;
            if (f61Var != null) {
                f61Var.R();
            }
            ImageReceiver imageReceiver2 = this.f26269r;
            if (imageReceiver2 != null) {
                imageReceiver2.R();
            }
        }
        if (this.f26272x != null) {
            org.telegram.messenger.zs.f(this.f26270s).n(this, org.telegram.messenger.zs.B0);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f26266c = imageReceiver.W0[0];
            HashSet hashSet = this.f26267f;
            if (hashSet.isEmpty()) {
                f5 f5Var = this.h;
                if (f5Var != null) {
                    f5Var.b(this);
                }
                f61 f61Var = this.f26268n;
                if (f61Var != null) {
                    f61Var.P();
                }
                ImageReceiver imageReceiver2 = this.f26269r;
                if (imageReceiver2 != null) {
                    imageReceiver2.P();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f26272x != null) {
                org.telegram.messenger.zs.f(this.f26270s).c(this, org.telegram.messenger.zs.B0);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g61.d():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.B0 && !this.f26271w) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        u10 u10Var = this.f26264a;
        u10Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = u10Var.f30753c;
        if (this.e != null) {
            this.f26266c = imageReceiver.W0[0];
        }
        float f7 = this.f26266c;
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
            ag.c2 c2Var = f5Var.f25975k;
            if (c2Var != null) {
                c2Var.J0((int) (width * 2 * 0.13f));
            }
            f5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            f5Var.draw(canvas);
        }
        f61 f61Var = this.f26268n;
        if (f61Var != null) {
            float f10 = width * 2;
            f61Var.J0((int) (0.13f * f10));
            f61Var.y0(centerX - width, centerY - width, f10, f10);
            f61Var.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this != obj) {
            if (obj != null && g61.class == obj.getClass()) {
                g61 g61Var = (g61) obj;
                f5 f5Var = g61Var.h;
                if (this.f26265b == g61Var.f26265b) {
                    u10 u10Var = this.f26264a;
                    int i10 = u10Var.d;
                    u10 u10Var2 = g61Var.f26264a;
                    if (i10 == u10Var2.d && u10Var.e == u10Var2.e && u10Var.f30754f == u10Var2.f30754f && u10Var.f30755g == u10Var2.f30755g) {
                        f5 f5Var2 = this.h;
                        if (f5Var2 != null && f5Var != null) {
                            if (f5Var2.h() == f5Var.h()) {
                                return true;
                            }
                            return false;
                        }
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f26272x;
                        if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = g61Var.f26272x) != null && tL_videoSizeStickerMarkup2.stickerset.f19813id == tL_videoSizeStickerMarkup.stickerset.f19813id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f26267f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26264a.f30753c.setAlpha(i10);
        f5 f5Var = this.h;
        if (f5Var != null) {
            f5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(ei0 ei0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
