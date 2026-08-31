package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class xm0 implements Runnable {
    public final int f33137a = 1;
    public final en0 f33138b;
    public final String f33139c;
    public final ArrayList d;
    public final ArrayList f33140e;

    public xm0(en0 en0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f33138b = en0Var;
        this.f33139c = str;
        this.d = arrayList;
        this.f33140e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f33137a) {
            case 0:
                en0 en0Var = this.f33138b;
                int i10 = en0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f33139c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(en0Var.H);
                            arrayList.add(messageObject);
                        }
                        i11++;
                    } else {
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList4 = this.f33140e;
                            if (i12 < arrayList4.size()) {
                                String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList4.get(i12)).getDocument());
                                if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                                    MessageObject messageObject2 = new MessageObject(i10, ((MessageObject) arrayList4.get(i12)).messageOwner, false, false);
                                    messageObject2.mediaExists = ((MessageObject) arrayList4.get(i12)).mediaExists;
                                    messageObject2.setQuery(en0Var.H);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new xm0(en0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                en0 en0Var2 = this.f33138b;
                ax0 ax0Var = en0Var2.f26583a;
                if (this.f33139c.equals(en0Var2.I)) {
                    if (en0Var2.f26589r == 0) {
                        en0Var2.K.b(0);
                    }
                    en0Var2.e(this.d, this.f33140e, true);
                    if (en0Var2.f26589r == 0) {
                        ax0Var.e(false, true);
                        g90 g90Var = ax0Var.f25364e;
                        ax0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        g90Var.setVisibility(0);
                        g90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public xm0(en0 en0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f33138b = en0Var;
        this.d = arrayList;
        this.f33139c = str;
        this.f33140e = arrayList2;
    }
}
