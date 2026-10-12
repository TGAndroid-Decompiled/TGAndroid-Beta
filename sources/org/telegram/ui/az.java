package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class az implements org.telegram.ui.Components.nm0 {
    public final Rect f35998a = new Rect();
    public final ez f35999b;

    public az(ez ezVar) {
        this.f35999b = ezVar;
    }

    @Override
    public final boolean mo17c(float f7, float f10, int i10, View view) {
        ez ezVar = this.f35999b;
        if (ezVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Rect rect = this.f35998a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ezVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new zy(this, i10, 0));
                ezVar.showDialog(alertDialog$Builder.f20142a);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void q(float f7) {
    }
}
