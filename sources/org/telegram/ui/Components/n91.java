package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class n91 {
    public String f28915a;
    public final Activity f28916b;
    public final org.telegram.ui.ActionBar.n2 f28917c;
    public final m91 d;
    public File f28918e;

    public n91(Activity activity, WallpapersListActivity wallpapersListActivity, m91 m91Var) {
        this.f28916b = activity;
        this.f28917c = wallpapersListActivity;
        this.d = m91Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n91.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28917c;
        if (n2Var != null) {
            Activity parentActivity = n2Var.getParentActivity();
            if (parentActivity != null) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 4);
                        return;
                    }
                } else if (i10 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            org.telegram.ui.fq0 fq0Var = new org.telegram.ui.fq0(2, false, false, null);
            fq0Var.f36375x = false;
            fq0Var.V = new l91(this);
            n2Var.presentFragment(fq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f28916b.startActivityForResult(intent, 11);
    }
}
