package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class nt0 extends sg.n0 {
    public final PhotoViewer f41996d2;

    public nt0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, xq0 xq0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, xq0Var, u6Var);
        this.f41996d2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        fi.z3 z3Var = this.f41996d2.K1;
        if (z3Var != null) {
            return z3Var.f12065l;
        }
        return 0;
    }
}
