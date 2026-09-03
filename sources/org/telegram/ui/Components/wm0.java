package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class wm0 implements Runnable {
    public final int f32793a = 1;
    public final dn0 f32794b;
    public final String f32795c;
    public final ArrayList d;
    public final ArrayList f32796e;

    public wm0(dn0 dn0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f32794b = dn0Var;
        this.f32795c = str;
        this.d = arrayList;
        this.f32796e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f32793a) {
            case 0:
                dn0 dn0Var = this.f32794b;
                int i10 = dn0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f32795c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(dn0Var.H);
                            arrayList.add(messageObject);
                        }
                        i11++;
                    } else {
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList4 = this.f32796e;
                            if (i12 < arrayList4.size()) {
                                String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList4.get(i12)).getDocument());
                                if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                                    MessageObject messageObject2 = new MessageObject(i10, ((MessageObject) arrayList4.get(i12)).messageOwner, false, false);
                                    messageObject2.mediaExists = ((MessageObject) arrayList4.get(i12)).mediaExists;
                                    messageObject2.setQuery(dn0Var.H);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new wm0(dn0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                dn0 dn0Var2 = this.f32794b;
                zw0 zw0Var = dn0Var2.f26309a;
                if (this.f32795c.equals(dn0Var2.I)) {
                    if (dn0Var2.f26315r == 0) {
                        dn0Var2.K.b(0);
                    }
                    dn0Var2.e(this.d, this.f32796e, true);
                    if (dn0Var2.f26315r == 0) {
                        zw0Var.e(false, true);
                        g90 g90Var = zw0Var.f34033e;
                        zw0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        g90Var.setVisibility(0);
                        g90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public wm0(dn0 dn0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f32794b = dn0Var;
        this.d = arrayList;
        this.f32795c = str;
        this.f32796e = arrayList2;
    }
}
