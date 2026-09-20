package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class e91 {
    public String f23793a;
    public final Activity f23794b;
    public final org.telegram.ui.ActionBar.n2 f23795c;
    public final d91 d;
    public File e;

    public e91(Activity activity, WallpapersListActivity wallpapersListActivity, d91 d91Var) {
        this.f23794b = activity;
        this.f23795c = wallpapersListActivity;
        this.d = d91Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e91.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f23795c;
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
            org.telegram.ui.lq0 lq0Var = new org.telegram.ui.lq0(2, false, false, null);
            lq0Var.f35513x = false;
            lq0Var.V = new c91(this);
            n2Var.presentFragment(lq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f23794b.startActivityForResult(intent, 11);
    }
}
