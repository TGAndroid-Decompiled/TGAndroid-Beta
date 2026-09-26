package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class bn0 implements Runnable {
    public final int f23070a = 1;
    public final jn0 f23071b;
    public final String f23072c;
    public final ArrayList d;
    public final ArrayList e;

    public bn0(jn0 jn0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f23071b = jn0Var;
        this.f23072c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f23070a) {
            case 0:
                jn0 jn0Var = this.f23071b;
                int i10 = jn0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f23072c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(jn0Var.K);
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
                                    messageObject2.setQuery(jn0Var.K);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new bn0(jn0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                jn0 jn0Var2 = this.f23071b;
                jx0 jx0Var = jn0Var2.f25473a;
                if (this.f23072c.equals(jn0Var2.L)) {
                    if (jn0Var2.f25478r == 0) {
                        jn0Var2.N.b(0);
                    }
                    jn0Var2.e(this.d, this.e, true);
                    if (jn0Var2.f25478r == 0) {
                        jx0Var.e(false, true);
                        o90 o90Var = jx0Var.e;
                        jx0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        o90Var.setVisibility(0);
                        o90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public bn0(jn0 jn0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f23071b = jn0Var;
        this.d = arrayList;
        this.f23072c = str;
        this.e = arrayList2;
    }
}
