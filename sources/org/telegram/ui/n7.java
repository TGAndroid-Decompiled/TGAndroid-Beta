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
    public final ArrayList f39329n;
    public final u7 f39330r;

    public n7(u7 u7Var) {
        super(u7Var, 2);
        this.f39330r = u7Var;
        this.f39329n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z4;
        super.F();
        ArrayList arrayList = this.f39329n;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f37339e;
            if (i10 < arrayList2.size()) {
                String path = ((o7) arrayList2.get(i10)).d.f16243a.getPath();
                if (((o7) arrayList2.get(i10)).d.d == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z4, 0, 0, 0L));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        boolean z10;
        String name;
        float f10;
        View view = m1Var.f5875a;
        m7 m7Var = (m7) view;
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) m7Var.f38981b.getChildAt(0);
        ArrayList arrayList = this.f37339e;
        nh.a aVar = ((o7) arrayList.get(i10)).d;
        if (aVar == view.getTag()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 != arrayList.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setTag(aVar);
        File file = aVar.f16243a;
        long lastModified = file.lastModified();
        if (aVar.h == 5) {
            name = LocaleController.getString(R.string.AttachRound);
        } else {
            name = file.getName();
        }
        i7Var.d(name, LocaleController.formatDateAudio(lastModified / 1000, true), Utilities.getExtension(file.getName()), null, 0, z10);
        if (!z4) {
            i7Var.setPhoto(file.getPath());
        }
        org.telegram.ui.Components.p9 imageView = i7Var.getImageView();
        if (aVar.h == 5) {
            f10 = 20.0f;
        } else {
            f10 = 4.0f;
        }
        imageView.setRoundRadius(AndroidUtilities.dp(f10));
        m7Var.d = z10;
        m7Var.f38982c.setText(AndroidUtilities.formatFileSize(aVar.f16245c));
        m7Var.f38980a.a(this.f39330r.f41804f.f16256j.contains(aVar), z4);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        m7 m7Var = new m7(this, viewGroup.getContext(), 0);
        m7Var.f38983e = 2;
        m7Var.f38981b.addView(new org.telegram.ui.Cells.i7(viewGroup.getContext(), 3, null));
        return new f2.m1(m7Var);
    }
}
