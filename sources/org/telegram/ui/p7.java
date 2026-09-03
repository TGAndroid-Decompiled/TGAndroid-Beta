package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class p7 extends k7 {
    public final ArrayList f36978n;
    public final w7 f36979r;

    public p7(w7 w7Var) {
        super(w7Var, 2);
        this.f36979r = w7Var;
        this.f36978n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z4;
        super.F();
        ArrayList arrayList = this.f36978n;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((q7) arrayList2.get(i10)).d.f14157a.getPath();
                if (((q7) arrayList2.get(i10)).d.d == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z4, 0, 0, 0L));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        boolean z10;
        String name;
        float f10;
        View view = l1Var.f5774a;
        o7 o7Var = (o7) view;
        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) o7Var.f36667b.getChildAt(0);
        ArrayList arrayList = this.e;
        mh.a aVar = ((q7) arrayList.get(i10)).d;
        if (aVar == view.getTag()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 != arrayList.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setTag(aVar);
        File file = aVar.f14157a;
        long lastModified = file.lastModified();
        if (aVar.h == 5) {
            name = LocaleController.getString(R.string.AttachRound);
        } else {
            name = file.getName();
        }
        h7Var.d(name, LocaleController.formatDateAudio(lastModified / 1000, true), Utilities.getExtension(file.getName()), null, 0, z10);
        if (!z4) {
            h7Var.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.p9 imageView = h7Var.getImageView();
        if (aVar.h == 5) {
            f10 = 20.0f;
        } else {
            f10 = 4.0f;
        }
        imageView.setRoundRadius(AndroidUtilities.dp(f10));
        o7Var.d = z10;
        o7Var.f36668c.setText(AndroidUtilities.formatFileSize(aVar.f14159c));
        o7Var.f36666a.a(this.f36979r.f39283f.f14168j.contains(aVar), z4);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        o7 o7Var = new o7(this, viewGroup.getContext(), 0);
        o7Var.e = 2;
        o7Var.f36667b.addView(new org.telegram.ui.Cells.h7(viewGroup.getContext(), 3, null));
        return new f2.l1(o7Var);
    }
}
