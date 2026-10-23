package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class s91 {
    public String f30440a;
    public final Activity f30441b;
    public final org.telegram.ui.ActionBar.o2 f30442c;
    public final r91 d;
    public File e;

    public s91(Activity activity, WallpapersListActivity wallpapersListActivity, r91 r91Var) {
        this.f30441b = activity;
        this.f30442c = wallpapersListActivity;
        this.d = r91Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s91.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f30442c;
        if (o2Var != null) {
            Activity parentActivity = o2Var.getParentActivity();
            if (parentActivity != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 4);
                        return;
                    }
                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            org.telegram.ui.vp0 vp0Var = new org.telegram.ui.vp0(2, false, false, null);
            vp0Var.f42812x = false;
            vp0Var.V = new q91(this);
            o2Var.presentFragment(vp0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f30441b.startActivityForResult(intent, 11);
    }
}
