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
    public final ArrayList f38822n;
    public final w7 f38823r;

    public p7(w7 w7Var) {
        super(w7Var, 2);
        this.f38823r = w7Var;
        this.f38822n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f38822n;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((q7) arrayList2.get(i10)).d.f919a.getPath();
                if (((q7) arrayList2.get(i10)).d.d == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        String name;
        float f7;
        View view = b1Var.f44838a;
        o7 o7Var = (o7) view;
        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) o7Var.f38560b.getChildAt(0);
        ArrayList arrayList = this.e;
        ai.b bVar = ((q7) arrayList.get(i10)).d;
        if (bVar == view.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        view.setTag(bVar);
        File file = bVar.f919a;
        long lastModified = file.lastModified();
        if (bVar.h == 5) {
            name = LocaleController.getString(R.string.AttachRound);
        } else {
            name = file.getName();
        }
        j7Var.d(name, LocaleController.formatDateAudio(lastModified / 1000, true), Utilities.getExtension(file.getName()), null, 0, z11);
        if (!z10) {
            j7Var.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.z9 imageView = j7Var.getImageView();
        if (bVar.h == 5) {
            f7 = 20.0f;
        } else {
            f7 = 4.0f;
        }
        imageView.setRoundRadius(AndroidUtilities.dp(f7));
        o7Var.d = z11;
        o7Var.f38561c.setText(AndroidUtilities.formatFileSize(bVar.f921c));
        o7Var.f38559a.a(this.f38823r.f40880f.f930j.contains(bVar), z10);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        o7 o7Var = new o7(this, viewGroup.getContext(), 0);
        o7Var.e = 2;
        o7Var.f38560b.addView(new org.telegram.ui.Cells.j7(viewGroup.getContext(), 3, null));
        return new s4.b1(o7Var);
    }
}
