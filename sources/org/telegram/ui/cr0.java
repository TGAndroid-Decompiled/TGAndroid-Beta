package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
public final class cr0 extends jg.r0 {
    public final PhotoViewer X1;

    public cr0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, org.telegram.messenger.ze zeVar, oo0 oo0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, zeVar, oo0Var, p6Var);
        this.X1 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        vh.r2 r2Var = this.X1.K1;
        if (r2Var != null) {
            return r2Var.f51832l;
        }
        return 0;
    }
}
