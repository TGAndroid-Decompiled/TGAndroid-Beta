package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class p81 {
    public String f29346a;
    public final Activity f29347b;
    public final org.telegram.ui.ActionBar.n2 f29348c;
    public final o81 d;
    public File f29349e;

    public p81(Activity activity, WallpapersListActivity wallpapersListActivity, o81 o81Var) {
        this.f29347b = activity;
        this.f29348c = wallpapersListActivity;
        this.d = o81Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p81.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f29348c;
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
            org.telegram.ui.kq0 kq0Var = new org.telegram.ui.kq0(2, false, false, null);
            kq0Var.f38140x = false;
            kq0Var.V = new n81(this);
            n2Var.presentFragment(kq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f29347b.startActivityForResult(intent, 11);
    }
}
