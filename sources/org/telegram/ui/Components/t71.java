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
public final class t71 extends Drawable implements y5, a7, NotificationCenter.NotificationCenterDelegate {
    public final b30 f28986a;
    public final int f28987b;
    public float f28988c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f28989f;
    public final s5 h;
    public final s71 f28990n;
    public final ImageReceiver f28991r;
    public final int f28992s;
    public boolean v;
    public final TLRPC.TL_videoSizeStickerMarkup f28993w;

    public t71(TLRPC.VideoSize videoSize, boolean z10, int i10) {
        int i11;
        int i12;
        int i13;
        b30 b30Var = new b30();
        this.f28986a = b30Var;
        this.f28989f = new HashSet();
        this.f28991r = new ImageReceiver();
        this.f28992s = UserConfig.selectedAccount;
        this.f28987b = i10;
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
        b30Var.d(k10, i11, i12, videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0);
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
            this.f28993w = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            s71 s71Var = new s71(this);
            this.f28990n = s71Var;
            s71Var.setInvalidateAll(true);
            if (i10 == 1) {
                s71Var.setAutoRepeatCount(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f28989f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            s5 s5Var = this.h;
            if (s5Var != null) {
                s5Var.p(this);
            }
            s71 s71Var = this.f28990n;
            if (s71Var != null) {
                s71Var.onDetachedFromWindow();
            }
            ImageReceiver imageReceiver2 = this.f28991r;
            if (imageReceiver2 != null) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
        if (this.f28993w != null) {
            NotificationCenter.getInstance(this.f28992s).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.f28988c = imageReceiver.getRoundRadius()[0];
            HashSet hashSet = this.f28989f;
            if (hashSet.isEmpty()) {
                s5 s5Var = this.h;
                if (s5Var != null) {
                    s5Var.b(this);
                }
                s71 s71Var = this.f28990n;
                if (s71Var != null) {
                    s71Var.onAttachedToWindow();
                }
                ImageReceiver imageReceiver2 = this.f28991r;
                if (imageReceiver2 != null) {
                    imageReceiver2.onAttachedToWindow();
                }
            }
            hashSet.add(imageReceiver);
            if (this.f28993w != null) {
                NotificationCenter.getInstance(this.f28992s).addObserver(this, NotificationCenter.groupStickersDidLoad);
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
        b30 b30Var = this.f28986a;
        b30Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = b30Var.f23373c;
        if (this.e != null) {
            this.f28988c = imageReceiver.getRoundRadius()[0];
        }
        float f7 = this.f28988c;
        if (f7 == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(b30Var.h, f7, f7, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        s5 s5Var = this.h;
        if (s5Var != null) {
            bi.b4 b4Var = s5Var.f28739k;
            if (b4Var != null) {
                b4Var.setRoundRadius((int) (width * 2 * 0.13f));
            }
            s5Var.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            s5Var.draw(canvas);
        }
        s71 s71Var = this.f28990n;
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
            s5 s5Var = t71Var.h;
            if (this.f28987b == t71Var.f28987b) {
                b30 b30Var = this.f28986a;
                int i10 = b30Var.d;
                b30 b30Var2 = t71Var.f28986a;
                if (i10 == b30Var2.d && b30Var.e == b30Var2.e && b30Var.f23374f == b30Var2.f23374f && b30Var.f23375g == b30Var2.f23375g) {
                    s5 s5Var2 = this.h;
                    if (s5Var2 != null && s5Var != null) {
                        if (s5Var2.i() == s5Var.i()) {
                            return true;
                        }
                        return false;
                    }
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.f28993w;
                    if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = t71Var.f28993w) != null && tL_videoSizeStickerMarkup2.stickerset.f18936id == tL_videoSizeStickerMarkup.stickerset.f18936id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        Iterator it = this.f28989f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28986a.f23373c.setAlpha(i10);
        s5 s5Var = this.h;
        if (s5Var != null) {
            s5Var.setAlpha(i10);
        }
    }

    @Override
    public final void a(bk0 bk0Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
