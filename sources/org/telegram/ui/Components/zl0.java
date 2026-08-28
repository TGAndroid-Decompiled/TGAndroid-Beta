package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class zl0 implements Runnable {
    public final int f35332a = 1;
    public final gm0 f35333b;
    public final String f35334c;
    public final ArrayList d;
    public final ArrayList f35335e;

    public zl0(gm0 gm0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f35333b = gm0Var;
        this.f35334c = str;
        this.d = arrayList;
        this.f35335e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f35332a) {
            case 0:
                gm0 gm0Var = this.f35333b;
                int i9 = gm0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f35334c;
                    if (i10 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i10)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i9, ((MessageObject) arrayList3.get(i10)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i10)).mediaExists;
                            messageObject.setQuery(gm0Var.G);
                            arrayList.add(messageObject);
                        }
                        i10++;
                    } else {
                        int i11 = 0;
                        while (true) {
                            ArrayList arrayList4 = this.f35335e;
                            if (i11 < arrayList4.size()) {
                                String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList4.get(i11)).getDocument());
                                if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                                    MessageObject messageObject2 = new MessageObject(i9, ((MessageObject) arrayList4.get(i11)).messageOwner, false, false);
                                    messageObject2.mediaExists = ((MessageObject) arrayList4.get(i11)).mediaExists;
                                    messageObject2.setQuery(gm0Var.G);
                                    arrayList2.add(messageObject2);
                                }
                                i11++;
                            } else {
                                AndroidUtilities.runOnUIThread(new zl0(gm0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                gm0 gm0Var2 = this.f35333b;
                gw0 gw0Var = gm0Var2.f28808a;
                if (this.f35334c.equals(gm0Var2.H)) {
                    if (gm0Var2.f28814r == 0) {
                        gm0Var2.J.b(0);
                    }
                    gm0Var2.e(this.d, this.f35335e, true);
                    if (gm0Var2.f28814r == 0) {
                        gw0Var.e(false, true);
                        l80 l80Var = gw0Var.f28885e;
                        gw0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        l80Var.setVisibility(0);
                        l80Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public zl0(gm0 gm0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f35333b = gm0Var;
        this.d = arrayList;
        this.f35334c = str;
        this.f35335e = arrayList2;
    }
}
