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
    public final ArrayList f40243n;
    public final u7 f40244r;

    public n7(u7 u7Var) {
        super(u7Var, 2);
        this.f40244r = u7Var;
        this.f40243n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f40243n;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f38270e;
            if (i10 < arrayList2.size()) {
                String path = ((o7) arrayList2.get(i10)).d.f54926a.getPath();
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
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        boolean z11;
        String name;
        float f7;
        View view = d1Var.f47897a;
        m7 m7Var = (m7) view;
        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) m7Var.f39936b.getChildAt(0);
        ArrayList arrayList = this.f38270e;
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
        File file = aVar.f54926a;
        long lastModified = file.lastModified();
        if (aVar.h == 5) {
            name = LocaleController.getString(R.string.AttachRound);
        } else {
            name = file.getName();
        }
        j7Var.d(name, LocaleController.formatDateAudio(lastModified / 1000, true), Utilities.getExtension(file.getName()), null, 0, z11);
        if (!z10) {
            j7Var.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.y9 imageView = j7Var.getImageView();
        if (aVar.h == 5) {
            f7 = 20.0f;
        } else {
            f7 = 4.0f;
        }
        imageView.setRoundRadius(AndroidUtilities.dp(f7));
        m7Var.d = z11;
        m7Var.f39937c.setText(AndroidUtilities.formatFileSize(aVar.f54928c));
        m7Var.f39935a.a(this.f40244r.f42384f.f54939j.contains(aVar), z10);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        m7 m7Var = new m7(this, viewGroup.getContext(), 0);
        m7Var.f39938e = 2;
        m7Var.f39936b.addView(new org.telegram.ui.Cells.j7(viewGroup.getContext(), 3, null));
        return new s4.d1(m7Var);
    }
}
