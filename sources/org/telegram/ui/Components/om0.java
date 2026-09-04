package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class om0 implements Runnable {
    public final int f29132a = 1;
    public final vm0 f29133b;
    public final String f29134c;
    public final ArrayList d;
    public final ArrayList f29135e;

    public om0(vm0 vm0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f29133b = vm0Var;
        this.f29134c = str;
        this.d = arrayList;
        this.f29135e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f29132a) {
            case 0:
                vm0 vm0Var = this.f29133b;
                int i10 = vm0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f29134c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(vm0Var.K);
                            arrayList.add(messageObject);
                        }
                        i11++;
                    } else {
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList4 = this.f29135e;
                            if (i12 < arrayList4.size()) {
                                String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList4.get(i12)).getDocument());
                                if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                                    MessageObject messageObject2 = new MessageObject(i10, ((MessageObject) arrayList4.get(i12)).messageOwner, false, false);
                                    messageObject2.mediaExists = ((MessageObject) arrayList4.get(i12)).mediaExists;
                                    messageObject2.setQuery(vm0Var.K);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new om0(vm0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                vm0 vm0Var2 = this.f29133b;
                xw0 xw0Var = vm0Var2.f31363a;
                if (this.f29134c.equals(vm0Var2.L)) {
                    if (vm0Var2.f31369r == 0) {
                        vm0Var2.N.b(0);
                    }
                    vm0Var2.e(this.d, this.f29135e, true);
                    if (vm0Var2.f31369r == 0) {
                        xw0Var.e(false, true);
                        d90 d90Var = xw0Var.f32755e;
                        xw0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        d90Var.setVisibility(0);
                        d90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public om0(vm0 vm0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f29133b = vm0Var;
        this.d = arrayList;
        this.f29134c = str;
        this.f29135e = arrayList2;
    }
}
