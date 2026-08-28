package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
public final class hw0 extends o9 implements NotificationCenter.NotificationCenterDelegate {
    public final int C;
    public int D;
    public String E;

    public hw0(Context context, int i9) {
        super(context);
        this.E = "tg_placeholders_android";
        this.C = i9;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.diceStickersDidLoad) {
            if (this.E.equals((String) objArr[0])) {
                t();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
        NotificationCenter.getInstance(this.C).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.C).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    public void setStickerNum(int i9) {
        if (this.D != i9) {
            this.D = i9;
            t();
        }
    }

    public void setStickerPackName(String str) {
        this.E = str;
    }

    public final void t() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hw0.t():void");
    }
}
