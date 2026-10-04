package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class gn0 implements Runnable {
    public final int f26896a = 1;
    public final on0 f26897b;
    public final String f26898c;
    public final ArrayList d;
    public final ArrayList f26899e;

    public gn0(on0 on0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f26897b = on0Var;
        this.f26898c = str;
        this.d = arrayList;
        this.f26899e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f26896a) {
            case 0:
                on0 on0Var = this.f26897b;
                int i10 = on0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f26898c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(on0Var.K);
                            arrayList.add(messageObject);
                        }
                        i11++;
                    } else {
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList4 = this.f26899e;
                            if (i12 < arrayList4.size()) {
                                String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList4.get(i12)).getDocument());
                                if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                                    MessageObject messageObject2 = new MessageObject(i10, ((MessageObject) arrayList4.get(i12)).messageOwner, false, false);
                                    messageObject2.mediaExists = ((MessageObject) arrayList4.get(i12)).mediaExists;
                                    messageObject2.setQuery(on0Var.K);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new gn0(on0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                on0 on0Var2 = this.f26897b;
                tx0 tx0Var = on0Var2.f29406a;
                if (this.f26898c.equals(on0Var2.L)) {
                    if (on0Var2.f29412r == 0) {
                        on0Var2.N.b(0);
                    }
                    on0Var2.e(this.d, this.f26899e, true);
                    if (on0Var2.f29412r == 0) {
                        tx0Var.e(false, true);
                        q90 q90Var = tx0Var.f31194e;
                        tx0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        q90Var.setVisibility(0);
                        q90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public gn0(on0 on0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f26897b = on0Var;
        this.d = arrayList;
        this.f26898c = str;
        this.f26899e = arrayList2;
    }
}
