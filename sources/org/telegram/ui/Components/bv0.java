package org.telegram.ui.Components;

import android.content.Context;
public final class bv0 extends l9 implements org.telegram.messenger.ls {
    public final int G;
    public int H;
    public String I;

    public bv0(Context context, int i7) {
        super(context);
        this.I = "tg_placeholders_android";
        this.G = i7;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25094y0) {
            if (this.I.equals((String) objArr[0])) {
                v();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        org.telegram.messenger.qs.f(this.G).c(this, org.telegram.messenger.qs.f25094y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.G).n(this, org.telegram.messenger.qs.f25094y0);
    }

    public void setStickerNum(int i7) {
        if (this.H != i7) {
            this.H = i7;
            v();
        }
    }

    public void setStickerPackName(String str) {
        this.I = str;
    }

    public final void v() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bv0.v():void");
    }
}
