package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class vn0 implements Runnable {
    public final int f31900a = 1;
    public final co0 f31901b;
    public final String f31902c;
    public final ArrayList d;
    public final ArrayList f31903e;

    public vn0(co0 co0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f31901b = co0Var;
        this.f31902c = str;
        this.d = arrayList;
        this.f31903e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f31900a) {
            case 0:
                co0 co0Var = this.f31901b;
                int i10 = co0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f31902c;
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
                            ArrayList arrayList4 = this.f31903e;
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
                co0 co0Var2 = this.f31901b;
                by0 by0Var = co0Var2.f25341a;
                if (this.f31902c.equals(co0Var2.L)) {
                    if (co0Var2.f25347r == 0) {
                        co0Var2.N.b(0);
                    }
                    co0Var2.e(this.d, this.f31903e, true);
                    if (co0Var2.f25347r == 0) {
                        by0Var.e(false, true);
                        fa0 fa0Var = by0Var.f25085e;
                        by0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        fa0Var.setVisibility(0);
                        fa0Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public vn0(co0 co0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f31901b = co0Var;
        this.d = arrayList;
        this.f31902c = str;
        this.f31903e = arrayList2;
    }
}
