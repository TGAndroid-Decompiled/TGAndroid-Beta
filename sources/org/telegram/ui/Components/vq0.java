package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vq0 extends org.telegram.ui.Cells.e7 {
    public final xq0 N;

    public vq0(xq0 xq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = xq0Var;
    }

    @Override
    public final String a() {
        if (this.N.f32468f.f26369b0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
