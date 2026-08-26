package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Stars.StarGiftSheet;

public final class ReportBottomSheet$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId = 0;
    public final TLObject f$0;
    public final Object f$1;
    public final Object f$2;
    public final long f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;
    public final Object f$7;

    public ReportBottomSheet$$ExternalSyntheticLambda13(TLObject tLObject, Context context, Theme.ResourcesProvider resourcesProvider, long j, byte[] bArr, Runnable runnable, BulletinFactory bulletinFactory, Runnable runnable2) {
        this.f$0 = tLObject;
        this.f$1 = context;
        this.f$2 = resourcesProvider;
        this.f$3 = j;
        this.f$4 = bArr;
        this.f$5 = runnable;
        this.f$6 = bulletinFactory;
        this.f$7 = runnable2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ReportBottomSheet.lambda$openSponsored$16(this.f$0, (Context) this.f$1, (Theme.ResourcesProvider) this.f$2, this.f$3, (byte[]) this.f$4, (Runnable) this.f$5, (BulletinFactory) this.f$6, (Runnable) this.f$7);
                break;
            default:
                ((StarGiftSheet) this.f$1).lambda$showDeleteDescriptionAlert$68((Browser.Progress) this.f$2, (AlertDialog) this.f$4, this.f$0, (TL_stars.TL_starGiftUnique) this.f$5, (TLRPC.TL_error) this.f$7, this.f$3, (CharSequence) this.f$6);
                break;
        }
    }

    public ReportBottomSheet$$ExternalSyntheticLambda13(StarGiftSheet starGiftSheet, Browser.Progress progress, AlertDialog alertDialog, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j, CharSequence charSequence) {
        this.f$1 = starGiftSheet;
        this.f$2 = progress;
        this.f$4 = alertDialog;
        this.f$0 = tLObject;
        this.f$5 = tL_starGiftUnique;
        this.f$7 = tL_error;
        this.f$3 = j;
        this.f$6 = charSequence;
    }
}
