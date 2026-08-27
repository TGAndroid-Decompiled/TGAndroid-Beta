package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

public final class cm0 implements Runnable {

    public final int f27506a = 1;

    public final jm0 f27507b;

    public final String f27508c;
    public final ArrayList d;

    public final ArrayList f27509e;

    public cm0(jm0 jm0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f27507b = jm0Var;
        this.f27508c = str;
        this.d = arrayList;
        this.f27509e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f27506a) {
            case 0:
                jm0 jm0Var = this.f27507b;
                int i10 = jm0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f27508c;
                    if (i11 >= size) {
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList4 = this.f27509e;
                            if (i12 >= arrayList4.size()) {
                                AndroidUtilities.runOnUIThread(new cm0(jm0Var, str, arrayList, arrayList2));
                            } else {
                                String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList4.get(i12)).getDocument());
                                if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                                    MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList4.get(i12)).messageOwner, false, false);
                                    messageObject.mediaExists = ((MessageObject) arrayList4.get(i12)).mediaExists;
                                    messageObject.setQuery(jm0Var.G);
                                    arrayList2.add(messageObject);
                                }
                                i12++;
                            }
                        }
                    } else {
                        String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                            MessageObject messageObject2 = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject2.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject2.setQuery(jm0Var.G);
                            arrayList.add(messageObject2);
                        }
                        i11++;
                    }
                    break;
                }
                break;
            default:
                jm0 jm0Var2 = this.f27507b;
                iw0 iw0Var = jm0Var2.f29727a;
                if (this.f27508c.equals(jm0Var2.H)) {
                    if (jm0Var2.f29733r == 0) {
                        jm0Var2.J.b(0);
                    }
                    jm0Var2.e(this.d, this.f27509e, true);
                    if (jm0Var2.f29733r == 0) {
                        iw0Var.e(false, true);
                        p80 p80Var = iw0Var.f29506e;
                        iw0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        p80Var.setVisibility(0);
                        p80Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    }
                }
                break;
        }
    }

    public cm0(jm0 jm0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f27507b = jm0Var;
        this.d = arrayList;
        this.f27508c = str;
        this.f27509e = arrayList2;
    }
}
