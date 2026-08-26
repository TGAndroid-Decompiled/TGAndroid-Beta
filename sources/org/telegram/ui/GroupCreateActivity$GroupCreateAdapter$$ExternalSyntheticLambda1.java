package org.telegram.ui;

import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Adapters.SearchAdapterHelper;

public final class GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final GroupCreateActivity.GroupCreateAdapter f$0;
    public final String f$1;

    public GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda1(GroupCreateActivity.GroupCreateAdapter groupCreateAdapter, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCreateAdapter;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        String lowerCase;
        String publicUsername;
        Object obj;
        switch (this.$r8$classId) {
            case 0:
                GroupCreateActivity.GroupCreateAdapter groupCreateAdapter = this.f$0;
                groupCreateAdapter.getClass();
                AndroidUtilities.runOnUIThread(new GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda1(groupCreateAdapter, this.f$1, 1));
                break;
            case 1:
                GroupCreateActivity.GroupCreateAdapter groupCreateAdapter2 = this.f$0;
                String str = this.f$1;
                SearchAdapterHelper searchAdapterHelper = groupCreateAdapter2.searchAdapterHelper;
                GroupCreateActivity groupCreateActivity = GroupCreateActivity.this;
                searchAdapterHelper.queryServerSearch(str, true, groupCreateActivity.isAlwaysShare || groupCreateActivity.isNeverShare, true, false, false, 0L, false, 0, 0, 0L, null);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda1 groupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda1 = new GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda1(groupCreateAdapter2, str, 2);
                groupCreateAdapter2.searchRunnable = groupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda1;
                dispatchQueue.postRunnable(groupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda1);
                break;
            default:
                GroupCreateActivity.GroupCreateAdapter groupCreateAdapter3 = this.f$0;
                groupCreateAdapter3.getClass();
                String lowerCase2 = this.f$1.trim().toLowerCase();
                if (!lowerCase2.isEmpty()) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString) || translitString.isEmpty()) {
                        translitString = null;
                    }
                    int i = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i];
                    strArr[0] = lowerCase2;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList3 = groupCreateAdapter3.contacts;
                        if (i2 >= arrayList3.size()) {
                            AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(groupCreateAdapter3, arrayList, arrayList2, 27));
                        } else {
                            TLObject tLObject = (TLObject) arrayList3.get(i2);
                            boolean z = tLObject instanceof TLRPC.User;
                            if (z) {
                                TLRPC.User user = (TLRPC.User) tLObject;
                                lowerCase = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                                publicUsername = UserObject.getPublicUsername(user);
                            } else {
                                if (!(tLObject instanceof TLRPC.Chat)) {
                                }
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                lowerCase = chat.title;
                                publicUsername = ChatObject.getPublicUsername(chat);
                                break;
                                i2++;
                            }
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                            if (lowerCase.equals(translitString2)) {
                                translitString2 = null;
                            }
                            int i3 = 0;
                            char c = 0;
                            while (true) {
                                if (i3 >= i) {
                                }
                                String str2 = strArr[i3];
                                char c2 = (lowerCase.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, lowerCase) || (translitString2 != null && (translitString2.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, translitString2)))) ? (char) 1 : (publicUsername == null || !publicUsername.startsWith(str2)) ? c : (char) 2;
                                if (c2 != 0) {
                                    if (c2 == 1) {
                                        if (z) {
                                            TLRPC.User user2 = (TLRPC.User) tLObject;
                                            arrayList2.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str2));
                                        } else if (tLObject instanceof TLRPC.Chat) {
                                            obj = null;
                                            arrayList2.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str2));
                                        }
                                        obj = null;
                                    } else {
                                        obj = null;
                                        arrayList2.add(AndroidUtilities.generateSearchName(zzil.m("@", publicUsername), null, "@" + str2));
                                    }
                                    arrayList.add(tLObject);
                                }
                                i3++;
                                c = c2;
                                break;
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(groupCreateAdapter3, new ArrayList(), new ArrayList(), 27));
                }
                break;
        }
    }
}
