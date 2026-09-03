package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class mt0 extends dg.e1 {
    public final PhotoViewer f36200l2;

    public mt0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, tq0 tq0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, tq0Var, f6Var);
        this.f36200l2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        ph.i3 i3Var = this.f36200l2.H1;
        if (i3Var != null) {
            return i3Var.f41779l;
        }
        return 0;
    }
}
