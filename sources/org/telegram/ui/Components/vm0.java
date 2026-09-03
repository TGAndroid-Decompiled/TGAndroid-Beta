package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class vm0 implements Runnable {
    public final int f29509a = 1;
    public final cn0 f29510b;
    public final String f29511c;
    public final ArrayList d;
    public final ArrayList e;

    public vm0(cn0 cn0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f29510b = cn0Var;
        this.f29511c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f29509a) {
            case 0:
                cn0 cn0Var = this.f29510b;
                int i10 = cn0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f29511c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(cn0Var.H);
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
                                    messageObject2.setQuery(cn0Var.H);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new vm0(cn0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                cn0 cn0Var2 = this.f29510b;
                zw0 zw0Var = cn0Var2.f23973a;
                if (this.f29511c.equals(cn0Var2.I)) {
                    if (cn0Var2.f23978r == 0) {
                        cn0Var2.K.b(0);
                    }
                    cn0Var2.e(this.d, this.e, true);
                    if (cn0Var2.f23978r == 0) {
                        zw0Var.e(false, true);
                        f90 f90Var = zw0Var.e;
                        zw0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        f90Var.setVisibility(0);
                        f90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public vm0(cn0 cn0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f29510b = cn0Var;
        this.d = arrayList;
        this.f29511c = str;
        this.e = arrayList2;
    }
}
