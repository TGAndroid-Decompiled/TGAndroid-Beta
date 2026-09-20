package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class an0 implements Runnable {
    public final int f22725a = 1;
    public final in0 f22726b;
    public final String f22727c;
    public final ArrayList d;
    public final ArrayList e;

    public an0(in0 in0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f22726b = in0Var;
        this.f22727c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f22725a) {
            case 0:
                in0 in0Var = this.f22726b;
                int i10 = in0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f22727c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(in0Var.K);
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
                                    messageObject2.setQuery(in0Var.K);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new an0(in0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                in0 in0Var2 = this.f22726b;
                jx0 jx0Var = in0Var2.f25086a;
                if (this.f22727c.equals(in0Var2.L)) {
                    if (in0Var2.f25091r == 0) {
                        in0Var2.N.b(0);
                    }
                    in0Var2.e(this.d, this.e, true);
                    if (in0Var2.f25091r == 0) {
                        jx0Var.e(false, true);
                        k90 k90Var = jx0Var.e;
                        jx0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        k90Var.setVisibility(0);
                        k90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public an0(in0 in0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f22726b = in0Var;
        this.d = arrayList;
        this.f22727c = str;
        this.e = arrayList2;
    }
}
