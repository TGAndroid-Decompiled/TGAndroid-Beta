package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.JoinCallAlert;

public final class ReportBottomSheet$$ExternalSyntheticLambda9 implements RequestDelegate {
    public final int $r8$classId = 0;
    public final Context f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;
    public final int f$7;

    public ReportBottomSheet$$ExternalSyntheticLambda9(Context context, Theme.ResourcesProvider resourcesProvider, long j, byte[] bArr, Runnable runnable, BulletinFactory bulletinFactory, Runnable runnable2, int i) {
        this.f$0 = context;
        this.f$1 = resourcesProvider;
        this.f$2 = j;
        this.f$3 = bArr;
        this.f$4 = runnable;
        this.f$5 = bulletinFactory;
        this.f$6 = runnable2;
        this.f$7 = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ReportBottomSheet.lambda$openSponsored$22(this.f$0, (Theme.ResourcesProvider) this.f$1, this.f$2, (byte[]) this.f$3, (Runnable) this.f$4, (BulletinFactory) this.f$5, (Runnable) this.f$6, this.f$7, tLObject, tL_error);
                break;
            default:
                JoinCallAlert.lambda$open$4((AlertDialog) this.f$1, (AccountInstance) this.f$3, (JoinCallAlert.JoinCallAlertDelegate) this.f$4, this.f$2, this.f$0, (BaseFragment) this.f$6, this.f$7, (TLRPC.Peer) this.f$5, tLObject, tL_error);
                break;
        }
    }

    public ReportBottomSheet$$ExternalSyntheticLambda9(AlertDialog alertDialog, AccountInstance accountInstance, JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate, long j, Context context, BaseFragment baseFragment, int i, TLRPC.Peer peer) {
        this.f$1 = alertDialog;
        this.f$3 = accountInstance;
        this.f$4 = joinCallAlertDelegate;
        this.f$2 = j;
        this.f$0 = context;
        this.f$6 = baseFragment;
        this.f$7 = i;
        this.f$5 = peer;
    }
}
