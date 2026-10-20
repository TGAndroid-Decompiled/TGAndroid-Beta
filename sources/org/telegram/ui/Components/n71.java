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
public final class n71 extends Drawable implements x5, y6, NotificationCenter.NotificationCenterDelegate {
    public final x20 f28697a;
    public final int f28698b;
    public float f28699c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f28700f;
    public final r5 h;
    public final m71 f28701n;
    public final ImageReceiver f28702r;
    public final int f28703s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f28704w;

    public n71(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        x20 x20Var = new x20();
        this.f28697a = x20Var;
        this.f28700f = new HashSet();
        this.f28702r = new ImageReceiver();
        this.f28703s = UserConfig.selectedAccount;
        this.f28698b = i10;
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
        x20Var.d(o10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i10 == 1 && z10) {
                i13 = 7;
            } else if (i10 == 2) {
                i13 = 15;
            } else {
                i13 = 8;
            }
            r5 r5Var = new r5(i13, UserConfig.selectedAccount, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = r5Var;
            r5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f28704w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            m71 m71Var = new m71(this);
            this.f28701n = m71Var;
            m71Var.setInvalidateAll(true);
            if (i10 == 1) {
                m71Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f28700f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            r5 r5Var = this.h;
            if (r5Var != null) {
                r5Var.p(this);
            }
            m71 m71Var = this.f28701n;
            if (m71Var != null) {
                m71Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f28702r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f28704w != null) {
            NotificationCenter.getInstance(this.f28703s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f28699c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f28700f;
            if (hashSet.isEmpty()) {
                r5 r5Var = this.h;
                if (r5Var != null) {
                    r5Var.b(this);
                }
                m71 m71Var = this.f28701n;
                if (m71Var != null) {
                    m71Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f28702r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f28704w != null) {
                NotificationCenter.getInstance(this.f28703s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n71.d():void");
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
        x20 x20Var = this.f28697a;
        x20Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = x20Var.f32313c;
        if (this.e != null) {
            this.f28699c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f28699c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(x20Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        r5 r5Var = this.h;
        if (r5Var != null) {
            ci.g3 g3Var = r5Var.f29837k;
            if (g3Var != null) {
                g3Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            r5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            r5Var.draw(canvas);
        }
        m71 m71Var = this.f28701n;
        if (m71Var != null) {
            float f10 = width * 2;
            m71Var.setRoundRadius((int) (0.13f * f10));
            m71Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            m71Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && n71.class == obj.getClass()) {
            n71 n71Var = (n71) obj;
            r5 r5Var = n71Var.h;
            if (this.f28698b == n71Var.f28698b) {
                x20 x20Var = this.f28697a;
                int i10 = x20Var.d;
                x20 x20Var2 = n71Var.f28697a;
                if (i10 == x20Var2.d && x20Var.e == x20Var2.e && x20Var.f32314f == x20Var2.f32314f && x20Var.f32315g == x20Var2.f32315g) {
                    r5 r5Var2 = this.h;
                    if (r5Var2 != null && r5Var != null) {
                        if (r5Var2.i() == r5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f28704w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = n71Var.f28704w) != null && tL_videoSizeStickerMarkup2.stickerset.f20296id == tL_videoSizeStickerMarkup.stickerset.f20296id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f28700f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28697a.f32313c.setAlpha(i10);
        r5 r5Var = this.h;
        if (r5Var != null) {
            r5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(yj0 yj0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
