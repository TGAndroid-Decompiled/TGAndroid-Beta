package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.credentials.CredentialManagerImpl;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.internal.clearcut.zze;
import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import com.google.android.gms.internal.safetynet.zzi;
import com.google.android.gms.wearable.internal.zzfp;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.web.MHTML;

public final class WearAuthSheet$$ExternalSyntheticLambda7 implements Utilities.Callback2 {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;
    public final Object f$4;

    public WearAuthSheet$$ExternalSyntheticLambda7(AlertDialog alertDialog, Utilities.Callback2 callback2, CredentialManagerImpl credentialManagerImpl, Context context, int i) {
        this.f$0 = alertDialog;
        this.f$1 = callback2;
        this.f$3 = credentialManagerImpl;
        this.f$4 = context;
        this.f$2 = i;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                MHTML mhtml = (MHTML) this.f$4;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) this.f$0;
                buttonWithCounterView.setLoading(false);
                boolean z = urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted;
                BottomSheet bottomSheet = (BottomSheet) this.f$1;
                if (z) {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new BulletinFactory(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider()).showForError("NO_TOKEN", false);
                    } else {
                        int i = this.f$2;
                        int currentDatacenterId = ConnectionsManager.getInstance(i).getCurrentDatacenterId();
                        boolean zIsTestBackend = ConnectionsManager.getInstance(i).isTestBackend();
                        StringBuilder sbM = DiffUtil.m("wear-auth: sending /token account=", i, " dcId=", currentDatacenterId, " isTest=");
                        sbM.append(zIsTestBackend);
                        FileLog.d(sbM.toString());
                        Context applicationContext = ((View) this.f$3).getContext().getApplicationContext();
                        try {
                            byte[] bArrBuildEncryptedTokenWire = WearAuthSheet.buildEncryptedTokenWire(mhtml, queryParameter, currentDatacenterId, zIsTestBackend);
                            zabv zabvVar = new zze(applicationContext, GoogleApi.Settings.DEFAULT_SETTINGS).zai;
                            zzi zziVar = new zzi(zabvVar, (String) mhtml.boundary, "/tg-wear-auth/token", bArrBuildEncryptedTokenWire);
                            zabvVar.zaa.zad(0, zziVar);
                            zzah.toTask(zziVar, zzfp.zza).addOnSuccessListener(new TodoItemMenu$$ExternalSyntheticLambda19(5, mhtml, buttonWithCounterView)).addOnFailureListener(new WearAuthSheet$$ExternalSyntheticLambda5(buttonWithCounterView, 1));
                            bottomSheet.lambda$showGiftOfferSheet$15();
                        } catch (Exception e) {
                            FileLog.e(e);
                            new BulletinFactory(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider()).showForError(e.getMessage(), false);
                            return;
                        }
                    }
                } else if (tL_error == null) {
                    new BulletinFactory(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider()).showForError("NO_TOKEN", false);
                } else {
                    zzlu.m(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider(), tL_error);
                }
                break;
            default:
                PasskeysController.lambda$create$9((AlertDialog) this.f$0, (Utilities.Callback2) this.f$1, (CredentialManagerImpl) this.f$3, (Context) this.f$4, this.f$2, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public WearAuthSheet$$ExternalSyntheticLambda7(ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, int i, View view, MHTML mhtml) {
        this.f$0 = buttonWithCounterView;
        this.f$1 = bottomSheet;
        this.f$2 = i;
        this.f$3 = view;
        this.f$4 = mhtml;
    }
}
