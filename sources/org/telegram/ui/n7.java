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
    public final ArrayList f36473n;
    public final u7 f36474r;

    public n7(u7 u7Var) {
        super(u7Var, 2);
        this.f36474r = u7Var;
        this.f36473n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z4;
        super.F();
        ArrayList arrayList = this.f36473n;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((o7) arrayList2.get(i10)).d.f14169a.getPath();
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
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        boolean z10;
        String name;
        float f10;
        View view = l1Var.f5785a;
        m7 m7Var = (m7) view;
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) m7Var.f36213b.getChildAt(0);
        ArrayList arrayList = this.e;
        mh.a aVar = ((o7) arrayList.get(i10)).d;
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
        File file = aVar.f14169a;
        long lastModified = file.lastModified();
        if (aVar.h == 5) {
            name = LocaleController.getString(R.string.AttachRound);
        } else {
            name = file.getName();
        }
        i7Var.d(z10, name, 0, LocaleController.formatDateAudio(lastModified / 1000, true), Utilities.getExtension(file.getName()), null);
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
        m7Var.f36214c.setText(AndroidUtilities.formatFileSize(aVar.f14171c));
        m7Var.f36212a.a(this.f36474r.f38857f.f14180j.contains(aVar), z4);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        m7 m7Var = new m7(this, viewGroup.getContext(), 0);
        m7Var.e = 2;
        m7Var.f36213b.addView(new org.telegram.ui.Cells.i7(viewGroup.getContext(), 3, null));
        return new f2.l1(m7Var);
    }
}
