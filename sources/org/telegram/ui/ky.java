package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;

public final class ky implements DialogInterface.OnClickListener {

    public final int f39899a;

    public final int f39900b;

    public final Object f39901c;

    public ky(Object obj, int i10, int i11) {
        this.f39899a = i11;
        this.f39901c = obj;
        this.f39900b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f39899a) {
            case 0:
                py pyVar = ((ly) this.f39901c).f40265b;
                if (i10 == 0) {
                    pyVar.f41445e.remove(this.f39900b - pyVar.f41447n);
                    pyVar.Z();
                    oy oyVar = pyVar.f41446f;
                    if (oyVar != null) {
                        oyVar.a();
                    }
                }
                break;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f39901c, this.f39900b, i10);
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f39901c;
                themeActivity.getClass();
                SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                editorEdit.putInt("sortContactsBy", i10);
                editorEdit.commit();
                va1 va1Var = themeActivity.f36228a;
                if (va1Var != null) {
                    va1Var.m(this.f39900b);
                }
                break;
        }
    }
}
