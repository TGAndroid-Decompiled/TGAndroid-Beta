package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class o7 extends g7 {
    public org.telegram.ui.Cells.s7 f39123n;
    public final ArrayList f39124r;
    public org.telegram.ui.Components.oq f39125s;
    public final s7 v;

    public o7(s7 s7Var) {
        super(s7Var, 1);
        this.v = s7Var;
        this.f39124r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f39124r;
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
        if (this.f39125s == null) {
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.X9, false)), org.telegram.ui.ActionBar.j6.R4);
            this.f39125s = oqVar;
            oqVar.f29167w = true;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) c1Var.f45738a;
        ai.b bVar = ((m7) this.f36277e.get(i10)).d;
        Object tag = t7Var.getTag();
        ImageReceiver imageReceiver = t7Var.f23262c;
        if (bVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.setTag(bVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = bVar.d;
        File file = bVar.f738a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a4.a.k(max, max, "_"), this.f39125s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(bVar.f740c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a4.a.k(max, max, "_"), this.f39125s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(bVar.f740c), false);
        }
        t7Var.i(this.v.f40330f.f751j.contains(bVar), z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (this.f39123n == null) {
            this.f39123n = new org.telegram.ui.Cells.s7(viewGroup.getContext(), null);
        }
        n7 n7Var = new n7(this, viewGroup.getContext(), this.f39123n, this.v.d.getCurrentAccount());
        n7Var.setStyle(1);
        return new s4.c1(n7Var);
    }
}
