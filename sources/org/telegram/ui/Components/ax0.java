package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
public final class ax0 extends p9 implements NotificationCenter.NotificationCenterDelegate {
    public final int D;
    public int E;
    public String F;

    public ax0(Context context, int i10) {
        super(context);
        this.F = "tg_placeholders_android";
        this.D = i10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad) {
            if (this.F.equals((String) objArr[0])) {
                t();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
        NotificationCenter.getInstance(this.D).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.D).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    public void setStickerNum(int i10) {
        if (this.E != i10) {
            this.E = i10;
            t();
        }
    }

    public void setStickerPackName(String str) {
        this.F = str;
    }

    public final void t() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ax0.t():void");
    }
}
