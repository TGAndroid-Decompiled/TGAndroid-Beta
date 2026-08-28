package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class u71 {
    public String f32948a;
    public final Activity f32949b;
    public final org.telegram.ui.ActionBar.o2 f32950c;
    public final t71 d;
    public File f32951e;

    public u71(Activity activity, WallpapersListActivity wallpapersListActivity, t71 t71Var) {
        this.f32949b = activity;
        this.f32950c = wallpapersListActivity;
        this.d = t71Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u71.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f32950c;
        if (o2Var != null) {
            Activity parentActivity = o2Var.getParentActivity();
            if (parentActivity != null) {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 4);
                        return;
                    }
                } else if (i9 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            org.telegram.ui.ip0 ip0Var = new org.telegram.ui.ip0(2, false, false, null);
            ip0Var.f39248x = false;
            ip0Var.R = new s71(this);
            o2Var.presentFragment(ip0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f32949b.startActivityForResult(intent, 11);
    }
}
