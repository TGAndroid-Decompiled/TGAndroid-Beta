package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class g81 {
    public String f28819a;
    public final Activity f28820b;
    public final org.telegram.ui.ActionBar.o2 f28821c;
    public final f81 d;
    public File f28822e;

    public g81(Activity activity, WallpapersListActivity wallpapersListActivity, f81 f81Var) {
        this.f28820b = activity;
        this.f28821c = wallpapersListActivity;
        this.d = f81Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g81.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f28821c;
        if (o2Var != null) {
            Activity parentActivity = o2Var.getParentActivity();
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
            org.telegram.ui.hp0 hp0Var = new org.telegram.ui.hp0(2, false, false, null);
            hp0Var.f38993x = false;
            hp0Var.R = new e81(this);
            o2Var.presentFragment(hp0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f28820b.startActivityForResult(intent, 11);
    }
}
