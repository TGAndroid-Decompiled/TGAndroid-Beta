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
public final class k7 extends f7 {
    public final ArrayList f34245n;
    public final r7 f34246r;

    public k7(r7 r7Var) {
        super(r7Var, 2);
        this.f34246r = r7Var;
        this.f34245n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f34245n;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((l7) arrayList2.get(i10)).d.f47167a.getPath();
                if (((l7) arrayList2.get(i10)).d.d == 1) {
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        String name;
        float f7;
        View view = c1Var.f41610a;
        j7 j7Var = (j7) view;
        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) j7Var.f34044b.getChildAt(0);
        ArrayList arrayList = this.e;
        yh.a aVar = ((l7) arrayList.get(i10)).d;
        if (aVar == view.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        view.setTag(aVar);
        File file = aVar.f47167a;
        long lastModified = file.lastModified();
        if (aVar.h == 5) {
            name = LocaleController.getString(R.string.AttachRound);
        } else {
            name = file.getName();
        }
        l7Var.d(name, LocaleController.formatDateAudio(lastModified / 1000, true), Utilities.getExtension(file.getName()), null, 0, z11);
        if (!z10) {
            l7Var.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.w9 imageView = l7Var.getImageView();
        if (aVar.h == 5) {
            f7 = 20.0f;
        } else {
            f7 = 4.0f;
        }
        imageView.setRoundRadius(AndroidUtilities.dp(f7));
        j7Var.d = z11;
        j7Var.f34045c.setText(AndroidUtilities.formatFileSize(aVar.f47169c));
        j7Var.f34043a.a(this.f34246r.f36246f.f47178j.contains(aVar), z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        j7 j7Var = new j7(this, viewGroup.getContext(), 0);
        j7Var.e = 2;
        j7Var.f34044b.addView(new org.telegram.ui.Cells.l7(viewGroup.getContext(), 3, null));
        return new s4.c1(j7Var);
    }
}
