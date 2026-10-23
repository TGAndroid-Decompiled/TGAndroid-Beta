package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class jt0 extends rg.m0 {
    public final PhotoViewer f38700o2;

    public jt0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, tq0 tq0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, tq0Var, g6Var);
        this.f38700o2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        ei.b4 b4Var = this.f38700o2.K1;
        if (b4Var != null) {
            return b4Var.f8793l;
        }
        return 0;
    }
}
