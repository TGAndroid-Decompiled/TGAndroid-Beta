package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class s81 {
    public String f28669a;
    public final Activity f28670b;
    public final org.telegram.ui.ActionBar.p2 f28671c;
    public final r81 d;
    public File e;

    public s81(Activity activity, WallpapersListActivity wallpapersListActivity, r81 r81Var) {
        this.f28670b = activity;
        this.f28671c = wallpapersListActivity;
        this.d = r81Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s81.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f28671c;
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
            org.telegram.ui.pp0 pp0Var = new org.telegram.ui.pp0(2, false, false, null);
            pp0Var.f37435x = false;
            pp0Var.S = new q81(this);
            p2Var.presentFragment(pp0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f28670b.startActivityForResult(intent, 11);
    }
}
