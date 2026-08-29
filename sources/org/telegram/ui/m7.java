package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class m7 extends e7 {
    public org.telegram.ui.Cells.o7 f40476n;
    public final ArrayList f40477r;
    public org.telegram.ui.Components.jq f40478s;
    public final q7 v;

    public m7(q7 q7Var) {
        super(q7Var, 1);
        this.v = q7Var;
        this.f40477r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f40477r;
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
        if (this.f40478s == null) {
            org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.X9, false)), org.telegram.ui.ActionBar.g6.R4);
            this.f40478s = jqVar;
            jqVar.f29792w = true;
        }
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) n1Var.f6432a;
        kh.a aVar = ((k7) this.f37378e.get(i10)).d;
        Object tag = p7Var.getTag();
        ImageReceiver imageReceiver = p7Var.f24978c;
        if (aVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        p7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.f13889a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.k(max, "_", max), this.f40478s, null, null, 0);
            p7Var.m(AndroidUtilities.formatFileSize(aVar.f13891c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.k(max, "_", max), this.f40478s, null, null, 0);
            p7Var.m(AndroidUtilities.formatFileSize(aVar.f13891c), false);
        }
        p7Var.i(this.v.f41551f.f13902j.contains(aVar), z10);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        if (this.f40476n == null) {
            this.f40476n = new org.telegram.ui.Cells.o7(viewGroup.getContext(), null);
        }
        l7 l7Var = new l7(this, viewGroup.getContext(), this.f40476n, this.v.d.getCurrentAccount());
        l7Var.setStyle(1);
        return new f2.n1(l7Var);
    }
}
