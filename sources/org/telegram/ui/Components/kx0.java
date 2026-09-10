package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
public final class kx0 extends w9 implements NotificationCenter.NotificationCenterDelegate {
    public final int G;
    public int H;
    public String I;

    public kx0(Context context, int i10) {
        super(context);
        this.I = "tg_placeholders_android";
        this.G = i10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad) {
            if (this.I.equals((String) objArr[0])) {
                t();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
        NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    public void setStickerNum(int i10) {
        if (this.H != i10) {
            this.H = i10;
            t();
        }
    }

    public void setStickerPackName(String str) {
        this.I = str;
    }

    public final void t() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kx0.t():void");
    }
}
