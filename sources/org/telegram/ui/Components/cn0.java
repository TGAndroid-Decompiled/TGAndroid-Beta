package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class cn0 implements Runnable {
    public final int f23350a = 1;
    public final kn0 f23351b;
    public final String f23352c;
    public final ArrayList d;
    public final ArrayList e;

    public cn0(kn0 kn0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f23351b = kn0Var;
        this.f23352c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f23350a) {
            case 0:
                kn0 kn0Var = this.f23351b;
                int i10 = kn0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f23352c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(kn0Var.K);
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
                                    messageObject2.setQuery(kn0Var.K);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new cn0(kn0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                kn0 kn0Var2 = this.f23351b;
                kx0 kx0Var = kn0Var2.f25767a;
                if (this.f23352c.equals(kn0Var2.L)) {
                    if (kn0Var2.f25772r == 0) {
                        kn0Var2.N.b(0);
                    }
                    kn0Var2.e(this.d, this.e, true);
                    if (kn0Var2.f25772r == 0) {
                        kx0Var.e(false, true);
                        p90 p90Var = kx0Var.e;
                        kx0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        p90Var.setVisibility(0);
                        p90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public cn0(kn0 kn0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f23351b = kn0Var;
        this.d = arrayList;
        this.f23352c = str;
        this.e = arrayList2;
    }
}
