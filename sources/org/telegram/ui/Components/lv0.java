package org.telegram.ui.Components;

import android.content.Context;
public final class lv0 extends q9 implements org.telegram.messenger.fs {
    public final int H;
    public int I;
    public String J;

    public lv0(Context context, int i7) {
        super(context);
        this.J = "tg_placeholders_android";
        this.H = i7;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25227y0) {
            if (this.J.equals((String) objArr[0])) {
                v();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        org.telegram.messenger.ks.f(this.H).c(this, org.telegram.messenger.ks.f25227y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.H).n(this, org.telegram.messenger.ks.f25227y0);
    }

    public void setStickerNum(int i7) {
        if (this.I != i7) {
            this.I = i7;
            v();
        }
    }

    public void setStickerPackName(String str) {
        this.J = str;
    }

    public final void v() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lv0.v():void");
    }
}
