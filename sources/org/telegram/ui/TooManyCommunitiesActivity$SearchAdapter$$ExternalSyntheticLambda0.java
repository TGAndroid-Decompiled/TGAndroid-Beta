package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class TooManyCommunitiesActivity$SearchAdapter$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final TooManyCommunitiesActivity.SearchAdapter f$0;
    public final String f$1;
    public final int f$2;

    public TooManyCommunitiesActivity$SearchAdapter$$ExternalSyntheticLambda0(TooManyCommunitiesActivity.SearchAdapter searchAdapter, String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = searchAdapter;
        this.f$1 = str;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                TooManyCommunitiesActivity.SearchAdapter searchAdapter = this.f$0;
                String str = this.f$1;
                int i = this.f$2;
                searchAdapter.getClass();
                Utilities.searchQueue.postRunnable(new TooManyCommunitiesActivity$SearchAdapter$$ExternalSyntheticLambda0(searchAdapter, str, i, 1));
                break;
            default:
                TooManyCommunitiesActivity.SearchAdapter searchAdapter2 = this.f$0;
                searchAdapter2.getClass();
                String lowerCase = this.f$1.trim().toLowerCase();
                int length = lowerCase.length();
                int i2 = this.f$2;
                String str2 = null;
                if (length == 0) {
                    AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda2(searchAdapter2, i2, (Object) null, (Object) null, 14));
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str2 = translitString;
                    }
                    int i3 = (str2 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i3];
                    strArr[0] = lowerCase;
                    if (str2 != null) {
                        strArr[1] = str2;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 0;
                    while (true) {
                        TooManyCommunitiesActivity tooManyCommunitiesActivity = TooManyCommunitiesActivity.this;
                        ArrayList arrayList3 = tooManyCommunitiesActivity.inactiveChats;
                        if (i4 >= arrayList3.size()) {
                            AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda2(searchAdapter2, i2, arrayList, arrayList2, 14));
                        } else {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i4);
                            int i5 = 0;
                            boolean z = false;
                            while (i5 < 2) {
                                String publicUsername = i5 == 0 ? chat.title : ChatObject.getPublicUsername(chat);
                                if (publicUsername != null) {
                                    String lowerCase2 = publicUsername.toLowerCase();
                                    for (int i6 = 0; i6 < i3; i6++) {
                                        String str3 = strArr[i6];
                                        if (lowerCase2.startsWith(str3) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str3, lowerCase2)) {
                                            z = true;
                                            if (z) {
                                                arrayList.add(chat);
                                                arrayList2.add((String) tooManyCommunitiesActivity.inactiveChatsSignatures.get(i4));
                                            }
                                        }
                                        break;
                                    }
                                    if (z) {
                                        arrayList.add(chat);
                                        arrayList2.add((String) tooManyCommunitiesActivity.inactiveChatsSignatures.get(i4));
                                    }
                                    break;
                                }
                                i5++;
                            }
                            i4++;
                        }
                    }
                }
                break;
        }
    }
}
