package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class ym0 implements Runnable {
    public final int f29455a = 1;
    public final fn0 f29456b;
    public final String f29457c;
    public final ArrayList d;
    public final ArrayList e;

    public ym0(fn0 fn0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f29456b = fn0Var;
        this.f29457c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f29455a) {
            case 0:
                fn0 fn0Var = this.f29456b;
                int i10 = fn0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f29457c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(fn0Var.K);
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
                                    messageObject2.setQuery(fn0Var.K);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new ym0(fn0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                fn0 fn0Var2 = this.f29456b;
                jx0 jx0Var = fn0Var2.f23039a;
                if (this.f29457c.equals(fn0Var2.L)) {
                    if (fn0Var2.f23044r == 0) {
                        fn0Var2.N.b(0);
                    }
                    fn0Var2.e(this.d, this.e, true);
                    if (fn0Var2.f23044r == 0) {
                        jx0Var.e(false, true);
                        m90 m90Var = jx0Var.e;
                        jx0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        m90Var.setVisibility(0);
                        m90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ym0(fn0 fn0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f29456b = fn0Var;
        this.d = arrayList;
        this.f29457c = str;
        this.e = arrayList2;
    }
}
