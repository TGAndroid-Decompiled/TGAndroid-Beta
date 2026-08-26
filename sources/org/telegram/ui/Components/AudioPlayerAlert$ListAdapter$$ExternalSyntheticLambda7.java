package org.telegram.ui.Components;

import com.google.android.gms.internal.mlkit_vision_common.zzko;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId = 0;
    public final AudioPlayerAlert.ListAdapter f$0;
    public final String f$1;
    public final ArrayList f$2;

    public AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda7(AudioPlayerAlert.ListAdapter listAdapter, String str, ArrayList arrayList) {
        this.f$0 = listAdapter;
        this.f$1 = str;
        this.f$2 = arrayList;
    }

    @Override
    public final void run() {
        boolean zContains;
        String str;
        String str2 = this.f$1;
        ArrayList arrayList = this.f$2;
        AudioPlayerAlert.ListAdapter listAdapter = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                listAdapter.getClass();
                String lowerCase = str2.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda7(listAdapter, new ArrayList(), str2));
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i2);
                        for (int i3 = 0; i3 < i; i3++) {
                            String str3 = strArr[i3];
                            String documentName = messageObject.getDocumentName();
                            if (documentName != null && documentName.length() != 0) {
                                if (documentName.toLowerCase().contains(str3)) {
                                    arrayList2.add(messageObject);
                                }
                                TLRPC.Document document = messageObject.type == 0 ? messageObject.messageOwner.media.webpage.document : messageObject.messageOwner.media.document;
                                int i4 = 0;
                                while (true) {
                                    if (i4 < document.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i4);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                            String str4 = documentAttribute.performer;
                                            zContains = str4 != null ? str4.toLowerCase().contains(str3) : false;
                                            if (!zContains && (str = documentAttribute.title) != null) {
                                                zContains = str.toLowerCase().contains(str3);
                                            }
                                        } else {
                                            i4++;
                                        }
                                    } else {
                                        zContains = false;
                                    }
                                }
                                if (zContains) {
                                    arrayList2.add(messageObject);
                                }
                                break;
                                break;
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda7(listAdapter, arrayList2, str2));
                }
                break;
            default:
                AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
                if (audioPlayerAlert.searching) {
                    audioPlayerAlert.searchWas = true;
                    listAdapter.searchResult = arrayList;
                    listAdapter.searchQuery = str2;
                    listAdapter.notifyDataSetChanged();
                    audioPlayerAlert.layoutManager.scrollToPosition(0);
                    zzko.m(R.string.NoAudioFoundPlayerInfo, new Object[]{str2}, audioPlayerAlert.emptySubtitleTextView);
                    break;
                }
                break;
        }
    }

    public AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda7(AudioPlayerAlert.ListAdapter listAdapter, ArrayList arrayList, String str) {
        this.f$0 = listAdapter;
        this.f$2 = arrayList;
        this.f$1 = str;
    }
}
