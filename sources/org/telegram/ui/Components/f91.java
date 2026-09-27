package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class f91 {
    public String f24204a;
    public final Activity f24205b;
    public final org.telegram.ui.ActionBar.o2 f24206c;
    public final e91 d;
    public File e;

    public f91(Activity activity, WallpapersListActivity wallpapersListActivity, e91 e91Var) {
        this.f24205b = activity;
        this.f24206c = wallpapersListActivity;
        this.d = e91Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f91.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f24206c;
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
            org.telegram.ui.fq0 fq0Var = new org.telegram.ui.fq0(2, false, false, null);
            fq0Var.f33615x = false;
            fq0Var.V = new d91(this);
            o2Var.presentFragment(fq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f24205b.startActivityForResult(intent, 11);
    }
}
