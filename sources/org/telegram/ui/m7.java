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
public final class m7 extends h7 {
    public final ArrayList f35644n;
    public final t7 f35645r;

    public m7(t7 t7Var) {
        super(t7Var, 2);
        this.f35645r = t7Var;
        this.f35644n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f35644n;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((n7) arrayList2.get(i10)).d.f49512a.getPath();
                if (((n7) arrayList2.get(i10)).d.d == 1) {
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
        View view = c1Var.f42995a;
        l7 l7Var = (l7) view;
        org.telegram.ui.Cells.l7 l7Var2 = (org.telegram.ui.Cells.l7) l7Var.f35349b.getChildAt(0);
        ArrayList arrayList = this.e;
        zh.a aVar = ((n7) arrayList.get(i10)).d;
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
        File file = aVar.f49512a;
        long lastModified = file.lastModified();
        if (aVar.h == 5) {
            name = LocaleController.getString(R.string.AttachRound);
        } else {
            name = file.getName();
        }
        l7Var2.d(name, LocaleController.formatDateAudio(lastModified / 1000, true), Utilities.getExtension(file.getName()), null, 0, z11);
        if (!z10) {
            l7Var2.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.v9 imageView = l7Var2.getImageView();
        if (aVar.h == 5) {
            f7 = 20.0f;
        } else {
            f7 = 4.0f;
        }
        imageView.setRoundRadius(AndroidUtilities.dp(f7));
        l7Var.d = z11;
        l7Var.f35350c.setText(AndroidUtilities.formatFileSize(aVar.f49514c));
        l7Var.f35348a.a(this.f35645r.f37672f.f49523j.contains(aVar), z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        l7 l7Var = new l7(this, viewGroup.getContext(), 0);
        l7Var.e = 2;
        l7Var.f35349b.addView(new org.telegram.ui.Cells.l7(viewGroup.getContext(), 3, null));
        return new s4.c1(l7Var);
    }
}
