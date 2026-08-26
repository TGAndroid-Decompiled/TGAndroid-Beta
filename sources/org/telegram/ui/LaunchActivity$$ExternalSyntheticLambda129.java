package org.telegram.ui;

import android.os.Bundle;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class LaunchActivity$$ExternalSyntheticLambda129 implements RequestDelegate {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final int f$10;
    public final Cloneable f$11;
    public final boolean f$2;
    public final Object f$3;
    public final Object f$4;
    public final Serializable f$5;
    public final Object f$6;
    public final Serializable f$7;
    public final Object f$8;
    public final Object f$9;

    public LaunchActivity$$ExternalSyntheticLambda129(ContactsController contactsController, HashMap map, SparseArray sparseArray, boolean[] zArr, HashMap map2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i, HashMap map3, boolean z, HashMap map4, ArrayList arrayList, HashMap map5) {
        this.f$0 = contactsController;
        this.f$1 = map;
        this.f$3 = sparseArray;
        this.f$5 = zArr;
        this.f$4 = map2;
        this.f$6 = tL_contacts_importContacts;
        this.f$10 = i;
        this.f$7 = map3;
        this.f$2 = z;
        this.f$8 = map4;
        this.f$9 = arrayList;
        this.f$11 = map5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$110((Runnable) this.f$1, this.f$2, (Long) this.f$3, (Browser.Progress) this.f$4, (Long) this.f$5, (Integer) this.f$6, (Integer) this.f$7, (byte[]) this.f$8, (BaseFragment) this.f$9, this.f$10, (Bundle) this.f$11, tLObject, tL_error);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f$9;
                HashMap map = (HashMap) this.f$11;
                ((ContactsController) this.f$0).lambda$performSyncPhoneBook$20((HashMap) this.f$1, (SparseArray) this.f$3, (boolean[]) this.f$5, (HashMap) this.f$4, (TLRPC.TL_contacts_importContacts) this.f$6, this.f$10, (HashMap) this.f$7, this.f$2, (HashMap) this.f$8, arrayList, map, tLObject, tL_error);
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda129(LaunchActivity launchActivity, Runnable runnable, boolean z, Long l, Browser.Progress progress, Long l2, Integer num, Integer num2, byte[] bArr, BaseFragment baseFragment, int i, Bundle bundle) {
        this.f$0 = launchActivity;
        this.f$1 = runnable;
        this.f$2 = z;
        this.f$3 = l;
        this.f$4 = progress;
        this.f$5 = l2;
        this.f$6 = num;
        this.f$7 = num2;
        this.f$8 = bArr;
        this.f$9 = baseFragment;
        this.f$10 = i;
        this.f$11 = bundle;
    }
}
