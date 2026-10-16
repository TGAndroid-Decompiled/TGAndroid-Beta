package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class qn0 implements Runnable {
    public final int f28336a = 1;
    public final xn0 f28337b;
    public final String f28338c;
    public final ArrayList d;
    public final ArrayList e;

    public qn0(xn0 xn0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f28337b = xn0Var;
        this.f28338c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f28336a) {
            case 0:
                xn0 xn0Var = this.f28337b;
                int i10 = xn0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f28338c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(xn0Var.K);
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
                                    messageObject2.setQuery(xn0Var.K);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new qn0(xn0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                xn0 xn0Var2 = this.f28337b;
                wx0 wx0Var = xn0Var2.f30965a;
                if (this.f28338c.equals(xn0Var2.L)) {
                    if (xn0Var2.f30970r == 0) {
                        xn0Var2.N.b(0);
                    }
                    xn0Var2.e(this.d, this.e, true);
                    if (xn0Var2.f30970r == 0) {
                        wx0Var.e(false, true);
                        da0 da0Var = wx0Var.e;
                        wx0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        da0Var.setVisibility(0);
                        da0Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public qn0(xn0 xn0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f28337b = xn0Var;
        this.d = arrayList;
        this.f28338c = str;
        this.e = arrayList2;
    }
}
