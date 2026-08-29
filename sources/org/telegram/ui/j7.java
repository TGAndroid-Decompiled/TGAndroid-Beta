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
public final class j7 extends e7 {
    public final ArrayList f39451n;
    public final q7 f39452r;

    public j7(q7 q7Var) {
        super(q7Var, 2);
        this.f39452r = q7Var;
        this.f39451n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f39451n;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f37378e;
            if (i10 < arrayList2.size()) {
                String path = ((k7) arrayList2.get(i10)).d.f13889a.getPath();
                if (((k7) arrayList2.get(i10)).d.d == 1) {
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
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        boolean z11;
        String name;
        float f9;
        View view = n1Var.f6432a;
        i7 i7Var = (i7) view;
        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) i7Var.f39137b.getChildAt(0);
        ArrayList arrayList = this.f37378e;
        kh.a aVar = ((k7) arrayList.get(i10)).d;
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
        File file = aVar.f13889a;
        long lastModified = file.lastModified();
        if (aVar.h == 5) {
            name = LocaleController.getString(R.string.AttachRound);
        } else {
            name = file.getName();
        }
        g7Var.d(z11, name, 0, LocaleController.formatDateAudio(lastModified / 1000, true), Utilities.getExtension(file.getName()), null);
        if (!z10) {
            g7Var.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.t9 imageView = g7Var.getImageView();
        if (aVar.h == 5) {
            f9 = 20.0f;
        } else {
            f9 = 4.0f;
        }
        imageView.setRoundRadius(AndroidUtilities.dp(f9));
        i7Var.d = z11;
        i7Var.f39138c.setText(AndroidUtilities.formatFileSize(aVar.f13891c));
        i7Var.f39136a.a(this.f39452r.f41551f.f13902j.contains(aVar), z10);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        i7 i7Var = new i7(this, viewGroup.getContext(), 0);
        i7Var.f39139e = 2;
        i7Var.f39137b.addView(new org.telegram.ui.Cells.g7(viewGroup.getContext(), 3, null));
        return new f2.n1(i7Var);
    }
}
