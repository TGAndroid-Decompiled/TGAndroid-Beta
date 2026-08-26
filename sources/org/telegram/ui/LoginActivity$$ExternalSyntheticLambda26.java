package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class LoginActivity$$ExternalSyntheticLambda26 implements AlertDialog.OnButtonClickListener, ContactsActivity.ContactsActivityDelegate {
    public final int $r8$classId;
    public final boolean f$0;
    public final Object f$1;
    public final Object f$2;

    public LoginActivity$$ExternalSyntheticLambda26(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = z;
    }

    @Override
    public void didSelectContact(TLRPC.User user, String str, ContactsActivity contactsActivity) {
        ((LaunchActivity) this.f$1).lambda$handleIntent$22(this.f$0, (int[]) this.f$2, user, str, contactsActivity);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                LoginActivity.lambda$needShowInvalidAlert$12(this.f$0, (String) this.f$1, (BaseFragment) this.f$2, alertDialog, i);
                break;
            case 1:
                ((ChangeUsernameActivity.AnonymousClass2) this.f$1).lambda$onItemClick$0((TLRPC.TL_username) this.f$2, this.f$0, alertDialog, i);
                break;
            case 2:
                ((ChatEditTypeActivity.UsernamesListView.AnonymousClass1) this.f$1).lambda$onItemClick$0((TLRPC.TL_username) this.f$2, this.f$0, alertDialog, i);
                break;
            case 3:
                ((FilterCreateActivity) this.f$1).lambda$showRemoveAlert$22((FilterCreateActivity.ItemInner) this.f$2, this.f$0, alertDialog, i);
                break;
            case 4:
                ((CallLogActivity) this.f$1).lambda$showDeleteAlert$14(this.f$0, (boolean[]) this.f$2, alertDialog, i);
                break;
            default:
                ((PassportActivity) this.f$1).lambda$addField$63((TLRPC.TL_secureRequiredType) this.f$2, this.f$0, alertDialog, i);
                break;
        }
    }

    public LoginActivity$$ExternalSyntheticLambda26(String str, boolean z, BaseFragment baseFragment) {
        this.$r8$classId = 0;
        this.f$0 = z;
        this.f$1 = str;
        this.f$2 = baseFragment;
    }

    public LoginActivity$$ExternalSyntheticLambda26(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z, Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = notificationCenterDelegate;
        this.f$0 = z;
        this.f$2 = obj;
    }
}
