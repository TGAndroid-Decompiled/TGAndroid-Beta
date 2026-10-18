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
public final class o7 extends j7 {
    public final ArrayList f39688n;
    public final v7 f39689r;

    public o7(v7 v7Var) {
        super(v7Var, 2);
        this.f39689r = v7Var;
        this.f39688n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f39688n;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((p7) arrayList2.get(i10)).d.f4428a.getPath();
                if (((p7) arrayList2.get(i10)).d.d == 1) {
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
        View view = b1Var.f45910a;
        n7 n7Var = (n7) view;
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) n7Var.f39345b.getChildAt(0);
        ArrayList arrayList = this.e;
        bi.b bVar = ((p7) arrayList.get(i10)).d;
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
        File file = bVar.f4428a;
        long lastModified = file.lastModified();
        if (bVar.h == 5) {
            name = LocaleController.getString(R.string.AttachRound);
        } else {
            name = file.getName();
        }
        i7Var.d(name, LocaleController.formatDateAudio(lastModified / 1000, true), Utilities.getExtension(file.getName()), null, 0, z11);
        if (!z10) {
            i7Var.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.w9 imageView = i7Var.getImageView();
        if (bVar.h == 5) {
            f7 = 20.0f;
        } else {
            f7 = 4.0f;
        }
        imageView.setRoundRadius(AndroidUtilities.dp(f7));
        n7Var.d = z11;
        n7Var.f39346c.setText(AndroidUtilities.formatFileSize(bVar.f4430c));
        n7Var.f39344a.a(this.f39689r.f42118f.f4439j.contains(bVar), z10);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        n7 n7Var = new n7(this, viewGroup.getContext(), 0);
        n7Var.e = 2;
        n7Var.f39345b.addView(new org.telegram.ui.Cells.i7(viewGroup.getContext(), 3, null));
        return new s4.b1(n7Var);
    }
}
