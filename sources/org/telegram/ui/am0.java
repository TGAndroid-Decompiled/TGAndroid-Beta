package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class am0 implements View.OnTouchListener {
    public final int f31037a;
    public final on0 f31038b;

    public am0(on0 on0Var, int i10) {
        this.f31037a = i10;
        this.f31038b = on0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f31037a;
        on0 on0Var = this.f31038b;
        switch (i10) {
            case 0:
                if (on0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    bu buVar = new bu(null, false);
                    buVar.f31405r = new l80(18, on0Var, view);
                    on0Var.presentFragment(buVar);
                }
                return true;
            case 1:
                if (on0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(on0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    d2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new wv(on0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    on0Var.showDialog(d2Var);
                }
                return true;
            case 2:
                if (on0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    bu buVar2 = new bu(null, false);
                    buVar2.f31405r = new bm0(on0Var, 2);
                    on0Var.presentFragment(buVar2);
                }
                return true;
            default:
                if (on0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    bu buVar3 = new bu(null, false);
                    buVar3.f31405r = new bm0(on0Var, 3);
                    on0Var.presentFragment(buVar3);
                }
                return true;
        }
    }
}
