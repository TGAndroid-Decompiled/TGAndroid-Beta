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
    public final ArrayList f42326n;
    public final x7 f42327r;

    public p7(x7 x7Var) {
        super(x7Var, 2);
        this.f42327r = x7Var;
        this.f42326n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f42326n;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((q7) arrayList2.get(i10)).d.f6364a.getPath();
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
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        boolean z11;
        String name;
        float f7;
        View view = e1Var.f47773a;
        o7 o7Var = (o7) view;
        org.telegram.ui.Cells.o7 o7Var2 = (org.telegram.ui.Cells.o7) o7Var.f42002b.getChildAt(0);
        ArrayList arrayList = this.e;
        ci.a aVar = ((q7) arrayList.get(i10)).d;
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
        File file = aVar.f6364a;
        long lastModified = file.lastModified();
        if (aVar.h == 5) {
            name = LocaleController.getString(R.string.AttachRound);
        } else {
            name = file.getName();
        }
        o7Var2.d(name, LocaleController.formatDateAudio(lastModified / 1000, true), Utilities.getExtension(file.getName()), null, 0, z11);
        if (!z10) {
            o7Var2.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.y9 imageView = o7Var2.getImageView();
        if (aVar.h == 5) {
            f7 = 20.0f;
        } else {
            f7 = 4.0f;
        }
        imageView.setRoundRadius(AndroidUtilities.dp(f7));
        o7Var.d = z11;
        o7Var.f42003c.setText(AndroidUtilities.formatFileSize(aVar.f6366c));
        o7Var.f42001a.a(this.f42327r.h.f6375j.contains(aVar), z10);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        o7 o7Var = new o7(this, viewGroup.getContext(), 0);
        o7Var.e = 2;
        o7Var.f42002b.addView(new org.telegram.ui.Cells.o7(viewGroup.getContext(), 3, null));
        return new s4.e1(o7Var);
    }
}
