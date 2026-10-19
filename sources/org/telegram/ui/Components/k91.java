package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class k91 {
    public String f27788a;
    public final Activity f27789b;
    public final org.telegram.ui.ActionBar.n2 f27790c;
    public final j91 d;
    public File e;

    public k91(Activity activity, WallpapersListActivity wallpapersListActivity, j91 j91Var) {
        this.f27789b = activity;
        this.f27790c = wallpapersListActivity;
        this.d = j91Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k91.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27790c;
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
            sp0Var.f41509x = false;
            sp0Var.V = new i91(this);
            n2Var.presentFragment(sp0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f27789b.startActivityForResult(intent, 11);
    }
}
