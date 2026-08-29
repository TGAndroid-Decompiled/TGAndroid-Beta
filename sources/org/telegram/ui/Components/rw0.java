package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
public final class rw0 extends t9 implements NotificationCenter.NotificationCenterDelegate {
    public final int C;
    public int D;
    public String E;

    public rw0(Context context, int i10) {
        super(context);
        this.E = "tg_placeholders_android";
        this.C = i10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad) {
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

    public void setStickerNum(int i10) {
        if (this.D != i10) {
            this.D = i10;
            t();
        }
    }

    public void setStickerPackName(String str) {
        this.E = str;
    }

    public final void t() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rw0.t():void");
    }
}
