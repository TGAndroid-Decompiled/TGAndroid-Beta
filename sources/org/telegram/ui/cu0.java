package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class cu0 extends qg.p0 {
    public final PhotoViewer f32924o2;

    public cu0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, kr0 kr0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, kr0Var, f6Var);
        this.f32924o2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        ci.j4 j4Var = this.f32924o2.K1;
        if (j4Var != null) {
            return j4Var.f4848l;
        }
        return 0;
    }
}
