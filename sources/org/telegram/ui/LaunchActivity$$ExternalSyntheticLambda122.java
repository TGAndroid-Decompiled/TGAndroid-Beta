package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.BaseFragment;

public final class LaunchActivity$$ExternalSyntheticLambda122 implements Runnable {
    public final int $r8$classId = 1;
    public final LaunchActivity f$0;
    public final Object f$1;
    public final BaseFragment f$10;
    public final int f$11;
    public final Bundle f$12;
    public final Object f$2;
    public final boolean f$3;
    public final Long f$4;
    public final Browser.Progress f$5;
    public final Long f$6;
    public final Integer f$7;
    public final Integer f$8;
    public final byte[] f$9;

    public LaunchActivity$$ExternalSyntheticLambda122(LaunchActivity launchActivity, Bundle bundle, Long l, int[] iArr, LinkManager$$ExternalSyntheticLambda2 linkManager$$ExternalSyntheticLambda2, boolean z, Browser.Progress progress, Long l2, Integer num, Integer num2, byte[] bArr, BaseFragment baseFragment, int i) {
        this.f$0 = launchActivity;
        this.f$12 = bundle;
        this.f$4 = l;
        this.f$1 = iArr;
        this.f$2 = linkManager$$ExternalSyntheticLambda2;
        this.f$3 = z;
        this.f$5 = progress;
        this.f$6 = l2;
        this.f$7 = num;
        this.f$8 = num2;
        this.f$9 = bArr;
        this.f$10 = baseFragment;
        this.f$11 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$runLinkRequest$109((Runnable) this.f$1, (TLObject) this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12);
                break;
            default:
                this.f$0.lambda$runLinkRequest$111(this.f$12, this.f$4, (int[]) this.f$1, (LinkManager$$ExternalSyntheticLambda2) this.f$2, this.f$3, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11);
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda122(LaunchActivity launchActivity, Runnable runnable, TLObject tLObject, boolean z, Long l, Browser.Progress progress, Long l2, Integer num, Integer num2, byte[] bArr, BaseFragment baseFragment, int i, Bundle bundle) {
        this.f$0 = launchActivity;
        this.f$1 = runnable;
        this.f$2 = tLObject;
        this.f$3 = z;
        this.f$4 = l;
        this.f$5 = progress;
        this.f$6 = l2;
        this.f$7 = num;
        this.f$8 = num2;
        this.f$9 = bArr;
        this.f$10 = baseFragment;
        this.f$11 = i;
        this.f$12 = bundle;
    }
}
