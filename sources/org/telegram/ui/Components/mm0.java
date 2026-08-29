package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class mm0 implements Runnable {
    public final int f30729a = 1;
    public final tm0 f30730b;
    public final String f30731c;
    public final ArrayList d;
    public final ArrayList f30732e;

    public mm0(tm0 tm0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f30730b = tm0Var;
        this.f30731c = str;
        this.d = arrayList;
        this.f30732e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f30729a) {
            case 0:
                tm0 tm0Var = this.f30730b;
                int i10 = tm0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f30731c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(tm0Var.G);
                            arrayList.add(messageObject);
                        }
                        i11++;
                    } else {
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList4 = this.f30732e;
                            if (i12 < arrayList4.size()) {
                                String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList4.get(i12)).getDocument());
                                if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                                    MessageObject messageObject2 = new MessageObject(i10, ((MessageObject) arrayList4.get(i12)).messageOwner, false, false);
                                    messageObject2.mediaExists = ((MessageObject) arrayList4.get(i12)).mediaExists;
                                    messageObject2.setQuery(tm0Var.G);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new mm0(tm0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                tm0 tm0Var2 = this.f30730b;
                qw0 qw0Var = tm0Var2.f32977a;
                if (this.f30731c.equals(tm0Var2.H)) {
                    if (tm0Var2.f32983r == 0) {
                        tm0Var2.J.b(0);
                    }
                    tm0Var2.e(this.d, this.f30732e, true);
                    if (tm0Var2.f32983r == 0) {
                        qw0Var.e(false, true);
                        y80 y80Var = qw0Var.f32122e;
                        qw0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        y80Var.setVisibility(0);
                        y80Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public mm0(tm0 tm0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f30730b = tm0Var;
        this.d = arrayList;
        this.f30731c = str;
        this.f30732e = arrayList2;
    }
}
