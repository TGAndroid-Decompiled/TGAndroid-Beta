package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class o81 {
    public String f26683a;
    public final Activity f26684b;
    public final org.telegram.ui.ActionBar.n2 f26685c;
    public final n81 d;
    public File e;

    public o81(Activity activity, WallpapersListActivity wallpapersListActivity, n81 n81Var) {
        this.f26684b = activity;
        this.f26685c = wallpapersListActivity;
        this.d = n81Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o81.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f26685c;
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
            org.telegram.ui.dq0 dq0Var = new org.telegram.ui.dq0(2, false, false, null);
            dq0Var.f32703x = false;
            dq0Var.V = new m81(this);
            n2Var.presentFragment(dq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f26684b.startActivityForResult(intent, 11);
    }
}
