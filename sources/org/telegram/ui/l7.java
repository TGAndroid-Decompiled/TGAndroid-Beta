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
public final class l7 extends g7 {
    public final ArrayList f38205n;
    public final s7 f38206r;

    public l7(s7 s7Var) {
        super(s7Var, 2);
        this.f38206r = s7Var;
        this.f38205n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f38205n;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f36277e;
            if (i10 < arrayList2.size()) {
                String path = ((m7) arrayList2.get(i10)).d.f738a.getPath();
                if (((m7) arrayList2.get(i10)).d.d == 1) {
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
        View view = c1Var.f45738a;
        k7 k7Var = (k7) view;
        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) k7Var.f37946b.getChildAt(0);
        ArrayList arrayList = this.f36277e;
        ai.b bVar = ((m7) arrayList.get(i10)).d;
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
        File file = bVar.f738a;
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
        org.telegram.ui.Components.x9 imageView = j7Var.getImageView();
        if (bVar.h == 5) {
            f7 = 20.0f;
        } else {
            f7 = 4.0f;
        }
        imageView.setRoundRadius(AndroidUtilities.dp(f7));
        k7Var.d = z11;
        k7Var.f37947c.setText(AndroidUtilities.formatFileSize(bVar.f740c));
        k7Var.f37945a.a(this.f38206r.f40330f.f751j.contains(bVar), z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 0);
        k7Var.f37948e = 2;
        k7Var.f37946b.addView(new org.telegram.ui.Cells.j7(viewGroup.getContext(), 3, null));
        return new s4.c1(k7Var);
    }
}
