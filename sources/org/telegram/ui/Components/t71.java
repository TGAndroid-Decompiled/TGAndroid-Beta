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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class t71 extends Drawable implements v5, w6, NotificationCenter.NotificationCenterDelegate {
    public final v20 f30746a;
    public final int f30747b;
    public float f30748c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f30749f;
    public final p5 h;
    public final s71 f30750n;
    public final ImageReceiver f30751r;
    public final int f30752s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f30753w;

    public t71(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        v20 v20Var = new v20();
        this.f30746a = v20Var;
        this.f30749f = new HashSet();
        this.f30751r = new ImageReceiver();
        this.f30752s = UserConfig.selectedAccount;
        this.f30747b = i10;
        this.d = z10;
        int o10 = i0.a.o(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i11 = i0.a.o(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i11 = 0;
        }
        if (videoSize.background_colors.size() > 2) {
            i12 = i0.a.o(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i12 = 0;
        }
        v20Var.d(o10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i10 == 1 && z10) {
                i13 = 7;
            } else if (i10 == 2) {
                i13 = 15;
            } else {
                i13 = 8;
            }
            p5 p5Var = new p5(i13, UserConfig.selectedAccount, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = p5Var;
            p5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f30753w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            s71 s71Var = new s71(this);
            this.f30750n = s71Var;
            s71Var.setInvalidateAll(true);
            if (i10 == 1) {
                s71Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f30749f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            p5 p5Var = this.h;
            if (p5Var != null) {
                p5Var.p(this);
            }
            s71 s71Var = this.f30750n;
            if (s71Var != null) {
                s71Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f30751r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f30753w != null) {
            NotificationCenter.getInstance(this.f30752s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f30748c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f30749f;
            if (hashSet.isEmpty()) {
                p5 p5Var = this.h;
                if (p5Var != null) {
                    p5Var.b(this);
                }
                s71 s71Var = this.f30750n;
                if (s71Var != null) {
                    s71Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f30751r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f30753w != null) {
                NotificationCenter.getInstance(this.f30752s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t71.d():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad && !this.v) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        v20 v20Var = this.f30746a;
        v20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = v20Var.f31270c;
        if (this.e != null) {
            this.f30748c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f30748c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(v20Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        p5 p5Var = this.h;
        if (p5Var != null) {
            ci.f3 f3Var = p5Var.f29484k;
            if (f3Var != null) {
                f3Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            p5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            p5Var.draw(canvas);
        }
        s71 s71Var = this.f30750n;
        if (s71Var != null) {
            float f10 = width * 2;
            s71Var.setRoundRadius((int) (0.13f * f10));
            s71Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            s71Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && t71.class == obj.getClass()) {
            t71 t71Var = (t71) obj;
            p5 p5Var = t71Var.h;
            if (this.f30747b == t71Var.f30747b) {
                v20 v20Var = this.f30746a;
                int i10 = v20Var.d;
                v20 v20Var2 = t71Var.f30746a;
                if (i10 == v20Var2.d && v20Var.e == v20Var2.e && v20Var.f31271f == v20Var2.f31271f && v20Var.f31272g == v20Var2.f31272g) {
                    p5 p5Var2 = this.h;
                    if (p5Var2 != null && p5Var != null) {
                        if (p5Var2.i() == p5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f30753w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = t71Var.f30753w) != null && tL_videoSizeStickerMarkup2.stickerset.f20364id == tL_videoSizeStickerMarkup.stickerset.f20364id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void invalidate() {
        Iterator it = this.f30749f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f30746a.f31270c.setAlpha(i10);
        p5 p5Var = this.h;
        if (p5Var != null) {
            p5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(ak0 ak0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
