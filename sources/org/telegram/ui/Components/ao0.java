package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class ao0 implements Runnable {
    public final int f24449a = 1;
    public final ho0 f24450b;
    public final String f24451c;
    public final ArrayList d;
    public final ArrayList f24452e;

    public ao0(ho0 ho0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f24450b = ho0Var;
        this.f24451c = str;
        this.d = arrayList;
        this.f24452e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f24449a) {
            case 0:
                ho0 ho0Var = this.f24450b;
                int i10 = ho0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f24451c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(ho0Var.K);
                            arrayList.add(messageObject);
                        }
                        i11++;
                    } else {
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList4 = this.f24452e;
                            if (i12 < arrayList4.size()) {
                                String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList4.get(i12)).getDocument());
                                if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                                    MessageObject messageObject2 = new MessageObject(i10, ((MessageObject) arrayList4.get(i12)).messageOwner, false, false);
                                    messageObject2.mediaExists = ((MessageObject) arrayList4.get(i12)).mediaExists;
                                    messageObject2.setQuery(ho0Var.K);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new ao0(ho0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                ho0 ho0Var2 = this.f24450b;
                gy0 gy0Var = ho0Var2.f26839a;
                if (this.f24451c.equals(ho0Var2.L)) {
                    if (ho0Var2.f26845r == 0) {
                        ho0Var2.N.b(0);
                    }
                    ho0Var2.e(this.d, this.f24452e, true);
                    if (ho0Var2.f26845r == 0) {
                        gy0Var.e(false, true);
                        ia0 ia0Var = gy0Var.f26561e;
                        gy0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        ia0Var.setVisibility(0);
                        ia0Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ao0(ho0 ho0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f24450b = ho0Var;
        this.d = arrayList;
        this.f24451c = str;
        this.f24452e = arrayList2;
    }
}
