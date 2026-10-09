package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class un0 implements Runnable {
    public final int f31550a = 1;
    public final bo0 f31551b;
    public final String f31552c;
    public final ArrayList d;
    public final ArrayList f31553e;

    public un0(bo0 bo0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f31551b = bo0Var;
        this.f31552c = str;
        this.d = arrayList;
        this.f31553e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f31550a) {
            case 0:
                bo0 bo0Var = this.f31551b;
                int i10 = bo0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f31552c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(bo0Var.K);
                            arrayList.add(messageObject);
                        }
                        i11++;
                    } else {
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList4 = this.f31553e;
                            if (i12 < arrayList4.size()) {
                                String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList4.get(i12)).getDocument());
                                if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                                    MessageObject messageObject2 = new MessageObject(i10, ((MessageObject) arrayList4.get(i12)).messageOwner, false, false);
                                    messageObject2.mediaExists = ((MessageObject) arrayList4.get(i12)).mediaExists;
                                    messageObject2.setQuery(bo0Var.K);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new un0(bo0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                bo0 bo0Var2 = this.f31551b;
                ay0 ay0Var = bo0Var2.f25066a;
                if (this.f31552c.equals(bo0Var2.L)) {
                    if (bo0Var2.f25072r == 0) {
                        bo0Var2.N.b(0);
                    }
                    bo0Var2.e(this.d, this.f31553e, true);
                    if (bo0Var2.f25072r == 0) {
                        ay0Var.e(false, true);
                        ea0 ea0Var = ay0Var.f24802e;
                        ay0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        ea0Var.setVisibility(0);
                        ea0Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public un0(bo0 bo0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f31551b = bo0Var;
        this.d = arrayList;
        this.f31552c = str;
        this.f31553e = arrayList2;
    }
}
