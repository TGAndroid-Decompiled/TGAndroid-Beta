package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class pt0 extends sg.m0 {
    public final PhotoViewer f42502d2;

    public pt0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, zq0 zq0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, zq0Var, u6Var);
        this.f42502d2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        fi.z3 z3Var = this.f42502d2.K1;
        if (z3Var != null) {
            return z3Var.f12064l;
        }
        return 0;
    }
}
