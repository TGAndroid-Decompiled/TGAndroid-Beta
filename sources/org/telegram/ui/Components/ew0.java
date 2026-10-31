package org.telegram.ui.Components;

import android.content.Context;
public final class ew0 extends g9 implements org.telegram.messenger.us {
    public final int G;
    public int H;
    public String I;

    public ew0(Context context, int i10) {
        super(context);
        this.I = "tg_placeholders_android";
        this.G = i10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19725y0) {
            if (this.I.equals((String) objArr[0])) {
                v();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        org.telegram.messenger.zs.f(this.G).c(this, org.telegram.messenger.zs.f19725y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(this.G).n(this, org.telegram.messenger.zs.f19725y0);
    }

    public void setStickerNum(int i10) {
        if (this.H != i10) {
            this.H = i10;
            v();
        }
    }

    public void setStickerPackName(String str) {
        this.I = str;
    }

    public final void v() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ew0.v():void");
    }
}
