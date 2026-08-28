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
    public final ArrayList f39760n;
    public final r7 f39761r;

    public k7(r7 r7Var) {
        super(r7Var, 2);
        this.f39761r = r7Var;
        this.f39760n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f39760n;
        arrayList.clear();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.f37834e;
            if (i9 < arrayList2.size()) {
                String path = ((l7) arrayList2.get(i9)).d.f10780a.getPath();
                if (((l7) arrayList2.get(i9)).d.d == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        boolean z11;
        String name;
        float f10;
        View view = q1Var.f5501a;
        j7 j7Var = (j7) view;
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) j7Var.f39387b.getChildAt(0);
        ArrayList arrayList = this.f37834e;
        hh.a aVar = ((l7) arrayList.get(i9)).d;
        if (aVar == view.getTag()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i9 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        view.setTag(aVar);
        File file = aVar.f10780a;
        long lastModified = file.lastModified();
        if (aVar.h == 5) {
            name = LocaleController.getString(R.string.AttachRound);
        } else {
            name = file.getName();
        }
        i7Var.d(z11, name, 0, LocaleController.formatDateAudio(lastModified / 1000, true), Utilities.getExtension(file.getName()), null);
        if (!z10) {
            i7Var.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.o9 imageView = i7Var.getImageView();
        if (aVar.h == 5) {
            f10 = 20.0f;
        } else {
            f10 = 4.0f;
        }
        imageView.setRoundRadius(AndroidUtilities.dp(f10));
        j7Var.d = z11;
        j7Var.f39388c.setText(AndroidUtilities.formatFileSize(aVar.f10782c));
        j7Var.f39386a.a(this.f39761r.f42294f.f10793j.contains(aVar), z10);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        j7 j7Var = new j7(this, viewGroup.getContext(), 0);
        j7Var.f39389e = 2;
        j7Var.f39387b.addView(new org.telegram.ui.Cells.i7(viewGroup.getContext(), 3, null));
        return new f2.q1(j7Var);
    }
}
