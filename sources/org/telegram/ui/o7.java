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

    public org.telegram.ui.Cells.n7 f41021n;

    public final ArrayList f41022r;

    public org.telegram.ui.Components.dq f41023s;
    public final s7 v;

    public o7(s7 s7Var) {
        super(s7Var, 1);
        this.v = s7Var;
        this.f41022r = new ArrayList();
    }

    @Override
    public final void F() {
        super.F();
        ArrayList arrayList = this.f41022r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f37950e;
            if (i10 >= arrayList2.size()) {
                return;
            }
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((m7) arrayList2.get(i10)).d.f11476a.getPath(), 0, ((m7) arrayList2.get(i10)).d.d == 1, 0, 0, 0L));
            i10++;
        }
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (this.f41023s == null) {
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.X9, false)), org.telegram.ui.ActionBar.g6.R4);
            this.f41023s = dqVar;
            dqVar.f27828w = true;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) o1Var.f5789a;
        ih.a aVar = ((m7) this.f37950e.get(i10)).d;
        Object tag = o7Var.getTag();
        ImageReceiver imageReceiver = o7Var.f24786c;
        boolean z10 = aVar == tag;
        o7Var.setTag(aVar);
        int iMax = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.f11476a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.l(iMax, "_", iMax), this.f41023s, null, null, 0);
            o7Var.m(AndroidUtilities.formatFileSize(aVar.f11478c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.l(iMax, "_", iMax), this.f41023s, null, null, 0);
            o7Var.m(AndroidUtilities.formatFileSize(aVar.f11478c), false);
        }
        o7Var.i(this.v.f42534f.f11489j.contains(aVar), z10);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        if (this.f41021n == null) {
            this.f41021n = new org.telegram.ui.Cells.n7(viewGroup.getContext(), null);
        }
        n7 n7Var = new n7(this, viewGroup.getContext(), this.f41021n, this.v.d.getCurrentAccount());
        n7Var.setStyle(1);
        return new org.telegram.ui.Components.lk0(n7Var);
    }
}
