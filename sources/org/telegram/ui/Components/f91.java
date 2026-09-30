package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class f91 {
    public String f24253a;
    public final Activity f24254b;
    public final org.telegram.ui.ActionBar.m2 f24255c;
    public final e91 d;
    public File e;

    public f91(Activity activity, WallpapersListActivity wallpapersListActivity, e91 e91Var) {
        this.f24254b = activity;
        this.f24255c = wallpapersListActivity;
        this.d = e91Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f91.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f24255c;
        if (m2Var != null) {
            Activity parentActivity = m2Var.getParentActivity();
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
            org.telegram.ui.cq0 cq0Var = new org.telegram.ui.cq0(2, false, false, null);
            cq0Var.f32857x = false;
            cq0Var.V = new d91(this);
            m2Var.presentFragment(cq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f24254b.startActivityForResult(intent, 11);
    }
}
