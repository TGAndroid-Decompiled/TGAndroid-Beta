package org.telegram.ui.Components;

import android.content.Context;
public final class av0 extends k9 implements org.telegram.messenger.cs {
    public final int H;
    public int I;
    public String J;

    public av0(Context context, int i3) {
        super(context);
        this.J = "tg_placeholders_android";
        this.H = i3;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23340y0) {
            if (this.J.equals((String) objArr[0])) {
                v();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        org.telegram.messenger.hs.f(this.H).c(this, org.telegram.messenger.hs.f23340y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.H).n(this, org.telegram.messenger.hs.f23340y0);
    }

    public void setStickerNum(int i3) {
        if (this.I != i3) {
            this.I = i3;
            v();
        }
    }

    public void setStickerPackName(String str) {
        this.J = str;
    }

    public final void v() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.av0.v():void");
    }
}
