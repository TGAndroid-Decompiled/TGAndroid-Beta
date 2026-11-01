package org.telegram.ui.Components;

import android.content.Context;
public final class fw0 extends g9 implements org.telegram.messenger.vs {
    public final int G;
    public int H;
    public String I;

    public fw0(Context context, int i10) {
        super(context);
        this.I = "tg_placeholders_android";
        this.G = i10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14821y0) {
            if (this.I.equals((String) objArr[0])) {
                v();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        org.telegram.messenger.at.f(this.G).c(this, org.telegram.messenger.at.f14821y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.at.f(this.G).n(this, org.telegram.messenger.at.f14821y0);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fw0.v():void");
    }
}
