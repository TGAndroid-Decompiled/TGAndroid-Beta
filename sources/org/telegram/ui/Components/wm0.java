package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class wm0 implements Runnable {
    public final int f30390a = 1;
    public final dn0 f30391b;
    public final String f30392c;
    public final ArrayList d;
    public final ArrayList e;

    public wm0(dn0 dn0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f30391b = dn0Var;
        this.f30392c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f30390a) {
            case 0:
                dn0 dn0Var = this.f30391b;
                int i10 = dn0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f30392c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(dn0Var.H);
                            arrayList.add(messageObject);
                        }
                        i11++;
                    } else {
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList4 = this.e;
                            if (i12 < arrayList4.size()) {
                                String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList4.get(i12)).getDocument());
                                if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                                    MessageObject messageObject2 = new MessageObject(i10, ((MessageObject) arrayList4.get(i12)).messageOwner, false, false);
                                    messageObject2.mediaExists = ((MessageObject) arrayList4.get(i12)).mediaExists;
                                    messageObject2.setQuery(dn0Var.H);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new wm0(dn0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                dn0 dn0Var2 = this.f30391b;
                zw0 zw0Var = dn0Var2.f24307a;
                if (this.f30392c.equals(dn0Var2.I)) {
                    if (dn0Var2.f24312r == 0) {
                        dn0Var2.K.b(0);
                    }
                    dn0Var2.e(this.d, this.e, true);
                    if (dn0Var2.f24312r == 0) {
                        zw0Var.e(false, true);
                        e90 e90Var = zw0Var.e;
                        zw0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        e90Var.setVisibility(0);
                        e90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public wm0(dn0 dn0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f30391b = dn0Var;
        this.d = arrayList;
        this.f30392c = str;
        this.e = arrayList2;
    }
}
