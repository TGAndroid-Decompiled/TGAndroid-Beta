package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class pm0 implements Runnable {
    public final int f27082a = 1;
    public final wm0 f27083b;
    public final String f27084c;
    public final ArrayList d;
    public final ArrayList e;

    public pm0(wm0 wm0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f27083b = wm0Var;
        this.f27084c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f27082a) {
            case 0:
                wm0 wm0Var = this.f27083b;
                int i10 = wm0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f27084c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(wm0Var.K);
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
                                    messageObject2.setQuery(wm0Var.K);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new pm0(wm0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                wm0 wm0Var2 = this.f27083b;
                zw0 zw0Var = wm0Var2.f29694a;
                if (this.f27084c.equals(wm0Var2.L)) {
                    if (wm0Var2.f29699r == 0) {
                        wm0Var2.N.b(0);
                    }
                    wm0Var2.e(this.d, this.e, true);
                    if (wm0Var2.f29699r == 0) {
                        zw0Var.e(false, true);
                        c90 c90Var = zw0Var.e;
                        zw0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        c90Var.setVisibility(0);
                        c90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public pm0(wm0 wm0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f27083b = wm0Var;
        this.d = arrayList;
        this.f27084c = str;
        this.e = arrayList2;
    }
}
