package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.BaseFragment;

public final class LaunchActivity$$ExternalSyntheticLambda44 implements Runnable {
    public final int $r8$classId = 1;
    public final LaunchActivity f$0;
    public final Object f$1;
    public final Integer f$2;
    public final Object f$3;
    public final byte[] f$4;
    public final long f$5;
    public final Object f$6;
    public final String f$7;
    public final int f$8;
    public final int f$9;

    public LaunchActivity$$ExternalSyntheticLambda44(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i, Integer num, String str, int i2, long j, Browser.Progress progress, BaseFragment baseFragment) {
        this.f$0 = launchActivity;
        this.f$1 = bundle;
        this.f$4 = bArr;
        this.f$8 = i;
        this.f$2 = num;
        this.f$7 = str;
        this.f$9 = i2;
        this.f$5 = j;
        this.f$3 = progress;
        this.f$6 = baseFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openForumFromLink$133((TLObject) this.f$1, this.f$2, (Integer) this.f$3, this.f$4, this.f$5, (Runnable) this.f$6, this.f$7, this.f$8, this.f$9);
                break;
            default:
                this.f$0.lambda$openMessage$42((Bundle) this.f$1, this.f$4, this.f$8, this.f$2, this.f$7, this.f$9, this.f$5, (Browser.Progress) this.f$3, (BaseFragment) this.f$6);
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda44(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j, Runnable runnable, String str, int i, int i2) {
        this.f$0 = launchActivity;
        this.f$1 = tLObject;
        this.f$2 = num;
        this.f$3 = num2;
        this.f$4 = bArr;
        this.f$5 = j;
        this.f$6 = runnable;
        this.f$7 = str;
        this.f$8 = i;
        this.f$9 = i2;
    }
}
