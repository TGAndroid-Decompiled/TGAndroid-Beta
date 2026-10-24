package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class pn0 implements Runnable {
    public final int f29628a = 1;
    public final wn0 f29629b;
    public final String f29630c;
    public final ArrayList d;
    public final ArrayList e;

    public pn0(wn0 wn0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f29629b = wn0Var;
        this.f29630c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f29628a) {
            case 0:
                wn0 wn0Var = this.f29629b;
                int i10 = wn0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.f29630c;
                    if (i11 < size) {
                        String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                            MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject.setQuery(wn0Var.K);
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
                                    messageObject2.setQuery(wn0Var.K);
                                    arrayList2.add(messageObject2);
                                }
                                i12++;
                            } else {
                                AndroidUtilities.runOnUIThread(new pn0(wn0Var, str, arrayList, arrayList2));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                wn0 wn0Var2 = this.f29629b;
                vx0 vx0Var = wn0Var2.f32302a;
                if (this.f29630c.equals(wn0Var2.L)) {
                    if (wn0Var2.f32307r == 0) {
                        wn0Var2.N.b(0);
                    }
                    wn0Var2.e(this.d, this.e, true);
                    if (wn0Var2.f32307r == 0) {
                        vx0Var.e(false, true);
                        w90 w90Var = vx0Var.e;
                        vx0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        w90Var.setVisibility(0);
                        w90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public pn0(wn0 wn0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f29629b = wn0Var;
        this.d = arrayList;
        this.f29630c = str;
        this.e = arrayList2;
    }
}
