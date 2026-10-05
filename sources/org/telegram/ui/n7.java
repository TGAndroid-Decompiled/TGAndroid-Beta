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
public final class n7 extends i7 {
    public final ArrayList f38819n;
    public final v7 f38820r;

    public n7(v7 v7Var) {
        super(v7Var, 2);
        this.f38820r = v7Var;
        this.f38819n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f38819n;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f37016e;
            if (i10 < arrayList2.size()) {
                String path = ((o7) arrayList2.get(i10)).d.f53573a.getPath();
                if (((o7) arrayList2.get(i10)).d.d == 1) {
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
        View view = c1Var.f46538a;
        m7 m7Var = (m7) view;
        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) m7Var.f38493b.getChildAt(0);
        ArrayList arrayList = this.f37016e;
        zh.a aVar = ((o7) arrayList.get(i10)).d;
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
        File file = aVar.f53573a;
        long lastModified = file.lastModified();
        if (aVar.h == 5) {
            name = LocaleController.getString(R.string.AttachRound);
        } else {
            name = file.getName();
        }
        k7Var.d(name, LocaleController.formatDateAudio(lastModified / 1000, true), Utilities.getExtension(file.getName()), null, 0, z11);
        if (!z10) {
            k7Var.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.w9 imageView = k7Var.getImageView();
        if (aVar.h == 5) {
            f7 = 20.0f;
        } else {
            f7 = 4.0f;
        }
        imageView.setRoundRadius(AndroidUtilities.dp(f7));
        m7Var.d = z11;
        m7Var.f38494c.setText(AndroidUtilities.formatFileSize(aVar.f53575c));
        m7Var.f38492a.a(this.f38820r.f41622f.f53586j.contains(aVar), z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        m7 m7Var = new m7(this, viewGroup.getContext(), 0);
        m7Var.f38495e = 2;
        m7Var.f38493b.addView(new org.telegram.ui.Cells.k7(viewGroup.getContext(), 3, null));
        return new s4.c1(m7Var);
    }
}
