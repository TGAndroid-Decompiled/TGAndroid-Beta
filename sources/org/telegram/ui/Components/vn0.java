package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class vn0 implements Runnable {
    public final int f31934a = 1;
    public final co0 f31935b;
    public final String f31936c;
    public final ArrayList d;
    public final ArrayList f31937e;

    public vn0(co0 co0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f31935b = co0Var;
        this.f31936c = str;
        this.d = arrayList;
        this.f31937e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f31934a) {
            case 0:
                co0 co0Var = this.f31935b;
                int i10 = co0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f31936c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(co0Var.K);
                            arrayList.add(messageObject);
                        }
                        i11++;
                    } else {
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList4 = this.f31937e;
                            if (i12 < arrayList4.size()) {
                                String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList4.get(i12)).getDocument());
                                if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                                    MessageObject messageObject2 = new MessageObject(i10, ((MessageObject) arrayList4.get(i12)).messageOwner, false, false);
                                    messageObject2.mediaExists = ((MessageObject) arrayList4.get(i12)).mediaExists;
                                    messageObject2.setQuery(co0Var.K);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new vn0(co0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                co0 co0Var2 = this.f31935b;
                by0 by0Var = co0Var2.f25403a;
                if (this.f31936c.equals(co0Var2.L)) {
                    if (co0Var2.f25409r == 0) {
                        co0Var2.N.b(0);
                    }
                    co0Var2.e(this.d, this.f31937e, true);
                    if (co0Var2.f25409r == 0) {
                        by0Var.e(false, true);
                        ea0 ea0Var = by0Var.f25123e;
                        by0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        ea0Var.setVisibility(0);
                        ea0Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public vn0(co0 co0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f31935b = co0Var;
        this.d = arrayList;
        this.f31936c = str;
        this.f31937e = arrayList2;
    }
}
