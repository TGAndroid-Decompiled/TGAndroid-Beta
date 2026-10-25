package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class vn0 implements Runnable {
    public final int f33690a = 1;
    public final co0 f33691b;
    public final String f33692c;
    public final ArrayList d;
    public final ArrayList e;

    public vn0(co0 co0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f33691b = co0Var;
        this.f33692c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f33690a) {
            case 0:
                co0 co0Var = this.f33691b;
                int i10 = co0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f33692c;
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
                            ArrayList arrayList4 = this.e;
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
                co0 co0Var2 = this.f33691b;
                ey0 ey0Var = co0Var2.f27215a;
                if (this.f33692c.equals(co0Var2.L)) {
                    if (co0Var2.f27220r == 0) {
                        co0Var2.N.b(0);
                    }
                    co0Var2.e(this.d, this.e, true);
                    if (co0Var2.f27220r == 0) {
                        ey0Var.e(false, true);
                        z90 z90Var = ey0Var.e;
                        ey0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        z90Var.setVisibility(0);
                        z90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public vn0(co0 co0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f33691b = co0Var;
        this.d = arrayList;
        this.f33692c = str;
        this.e = arrayList2;
    }
}
