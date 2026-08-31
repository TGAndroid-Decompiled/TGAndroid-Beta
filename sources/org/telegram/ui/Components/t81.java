package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class t81 {
    public String f31286a;
    public final Activity f31287b;
    public final org.telegram.ui.ActionBar.p2 f31288c;
    public final s81 d;
    public File f31289e;

    public t81(Activity activity, WallpapersListActivity wallpapersListActivity, s81 s81Var) {
        this.f31287b = activity;
        this.f31288c = wallpapersListActivity;
        this.d = s81Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t81.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f31288c;
        if (p2Var != null) {
            Activity parentActivity = p2Var.getParentActivity();
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
            org.telegram.ui.rp0 rp0Var = new org.telegram.ui.rp0(2, false, false, null);
            rp0Var.f41033x = false;
            rp0Var.S = new r81(this);
            p2Var.presentFragment(rp0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f31287b.startActivityForResult(intent, 11);
    }
}
