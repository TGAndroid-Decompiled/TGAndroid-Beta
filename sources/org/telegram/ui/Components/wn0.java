package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class wn0 implements Runnable {
    public final int f32691a = 1;
    public final do0 f32692b;
    public final String f32693c;
    public final ArrayList d;
    public final ArrayList f32694e;

    public wn0(do0 do0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f32692b = do0Var;
        this.f32693c = str;
        this.d = arrayList;
        this.f32694e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f32691a) {
            case 0:
                do0 do0Var = this.f32692b;
                int i10 = do0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f32693c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(do0Var.K);
                            arrayList.add(messageObject);
                        }
                        i11++;
                    } else {
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList4 = this.f32694e;
                            if (i12 < arrayList4.size()) {
                                String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList4.get(i12)).getDocument());
                                if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                                    MessageObject messageObject2 = new MessageObject(i10, ((MessageObject) arrayList4.get(i12)).messageOwner, false, false);
                                    messageObject2.mediaExists = ((MessageObject) arrayList4.get(i12)).mediaExists;
                                    messageObject2.setQuery(do0Var.K);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new wn0(do0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                do0 do0Var2 = this.f32692b;
                cy0 cy0Var = do0Var2.f25643a;
                if (this.f32693c.equals(do0Var2.L)) {
                    if (do0Var2.f25649r == 0) {
                        do0Var2.N.b(0);
                    }
                    do0Var2.e(this.d, this.f32694e, true);
                    if (do0Var2.f25649r == 0) {
                        cy0Var.e(false, true);
                        fa0 fa0Var = cy0Var.f25351e;
                        cy0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        fa0Var.setVisibility(0);
                        fa0Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public wn0(do0 do0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f32692b = do0Var;
        this.d = arrayList;
        this.f32693c = str;
        this.f32694e = arrayList2;
    }
}
