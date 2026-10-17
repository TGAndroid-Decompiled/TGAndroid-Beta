package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class it0 extends rg.m0 {
    public final PhotoViewer f37976o2;

    public it0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, rq0 rq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, rq0Var, d6Var);
        this.f37976o2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        ei.b4 b4Var = this.f37976o2.K1;
        if (b4Var != null) {
            return b4Var.f8786l;
        }
        return 0;
    }
}
