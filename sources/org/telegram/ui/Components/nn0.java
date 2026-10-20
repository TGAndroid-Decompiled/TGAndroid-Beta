package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class nn0 implements Runnable {
    public final int f28852a = 1;
    public final un0 f28853b;
    public final String f28854c;
    public final ArrayList d;
    public final ArrayList e;

    public nn0(un0 un0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f28853b = un0Var;
        this.f28854c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f28852a) {
            case 0:
                un0 un0Var = this.f28853b;
                int i10 = un0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f28854c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(un0Var.K);
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
                                    messageObject2.setQuery(un0Var.K);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new nn0(un0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                un0 un0Var2 = this.f28853b;
                tx0 tx0Var = un0Var2.f30975a;
                if (this.f28854c.equals(un0Var2.L)) {
                    if (un0Var2.f30980r == 0) {
                        un0Var2.N.b(0);
                    }
                    un0Var2.e(this.d, this.e, true);
                    if (un0Var2.f30980r == 0) {
                        tx0Var.e(false, true);
                        x90 x90Var = tx0Var.e;
                        tx0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        x90Var.setVisibility(0);
                        x90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public nn0(un0 un0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f28853b = un0Var;
        this.d = arrayList;
        this.f28854c = str;
        this.e = arrayList2;
    }
}
