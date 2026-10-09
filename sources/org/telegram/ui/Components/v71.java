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
public final class v71 extends Drawable implements y5, z6, NotificationCenter.NotificationCenterDelegate {
    public final f30 f31703a;
    public final int f31704b;
    public float f31705c;
    public final boolean d;
    public ImageReceiver f31706e;
    public final HashSet f31707f;
    public final s5 h;
    public final u71 f31708n;
    public final ImageReceiver f31709r;
    public final int f31710s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f31711w;

    public v71(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        f30 f30Var = new f30();
        this.f31703a = f30Var;
        this.f31707f = new HashSet();
        this.f31709r = new ImageReceiver();
        this.f31710s = UserConfig.selectedAccount;
        this.f31704b = i10;
        this.d = z10;
        int k10 = i0.a.k(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i11 = i0.a.k(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i11 = 0;
        }
        if (videoSize.background_colors.size() > 2) {
            i12 = i0.a.k(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i12 = 0;
        }
        f30Var.d(k10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i10 == 1 && z10) {
                i13 = 7;
            } else if (i10 == 2) {
                i13 = 15;
            } else {
                i13 = 8;
            }
            s5 s5Var = new s5(i13, UserConfig.selectedAccount, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = s5Var;
            s5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.f31711w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            u71 u71Var = new u71(this);
            this.f31708n = u71Var;
            u71Var.setInvalidateAll(true);
            if (i10 == 1) {
                u71Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f31707f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            s5 s5Var = this.h;
            if (s5Var != null) {
                s5Var.p(this);
            }
            u71 u71Var = this.f31708n;
            if (u71Var != null) {
                u71Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f31709r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f31711w != null) {
            NotificationCenter.getInstance(this.f31710s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f31705c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f31707f;
            if (hashSet.isEmpty()) {
                s5 s5Var = this.h;
                if (s5Var != null) {
                    s5Var.b(this);
                }
                u71 u71Var = this.f31708n;
                if (u71Var != null) {
                    u71Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f31709r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f31711w != null) {
                NotificationCenter.getInstance(this.f31710s).addObserver(this, NotificationCenter.groupStickersDidLoad);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v71.d():void");
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
        f30 f30Var = this.f31703a;
        f30Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = f30Var.f26225c;
        if (this.f31706e != null) {
            this.f31705c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f31705c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(f30Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        s5 s5Var = this.h;
        if (s5Var != null) {
            ai.m4 m4Var = s5Var.f30654k;
            if (m4Var != null) {
                m4Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            s5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            s5Var.draw(canvas);
        }
        u71 u71Var = this.f31708n;
        if (u71Var != null) {
            float f10 = width * 2;
            u71Var.setRoundRadius((int) (0.13f * f10));
            u71Var.setImageCoords(centerX - width, centerY - width, f10, f10);
            u71Var.draw(canvas);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this == obj) {
            return true;
        }
        if (obj != null && v71.class == obj.getClass()) {
            v71 v71Var = (v71) obj;
            s5 s5Var = v71Var.h;
            if (this.f31704b == v71Var.f31704b) {
                f30 f30Var = this.f31703a;
                int i10 = f30Var.d;
                f30 f30Var2 = v71Var.f31703a;
                if (i10 == f30Var2.d && f30Var.f26226e == f30Var2.f26226e && f30Var.f26227f == f30Var2.f26227f && f30Var.f26228g == f30Var2.f26228g) {
                    s5 s5Var2 = this.h;
                    if (s5Var2 != null && s5Var != null) {
                        if (s5Var2.i() == s5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f31711w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = v71Var.f31711w) != null && tL_videoSizeStickerMarkup2.stickerset.f20058id == tL_videoSizeStickerMarkup.stickerset.f20058id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f31707f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f31703a.f26225c.setAlpha(i10);
        s5 s5Var = this.h;
        if (s5Var != null) {
            s5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(fk0 fk0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
