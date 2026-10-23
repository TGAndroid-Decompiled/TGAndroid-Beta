package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class l91 {
    public String f28124a;
    public final Activity f28125b;
    public final org.telegram.ui.ActionBar.n2 f28126c;
    public final k91 d;
    public File e;

    public l91(Activity activity, WallpapersListActivity wallpapersListActivity, k91 k91Var) {
        this.f28125b = activity;
        this.f28126c = wallpapersListActivity;
        this.d = k91Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l91.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28126c;
        if (n2Var != null) {
            Activity parentActivity = n2Var.getParentActivity();
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
            org.telegram.ui.sp0 sp0Var = new org.telegram.ui.sp0(2, false, false, null);
            sp0Var.f41518x = false;
            sp0Var.V = new j91(this);
            n2Var.presentFragment(sp0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f28125b.startActivityForResult(intent, 11);
    }
}
