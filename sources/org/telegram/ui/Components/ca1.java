package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class ca1 {
    public String f27113a;
    public final Activity f27114b;
    public final org.telegram.ui.ActionBar.r2 f27115c;
    public final ba1 d;
    public File e;

    public ca1(Activity activity, WallpapersListActivity wallpapersListActivity, ba1 ba1Var) {
        this.f27114b = activity;
        this.f27115c = wallpapersListActivity;
        this.d = ba1Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ca1.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f27115c;
        if (r2Var != null) {
            Activity parentActivity = r2Var.getParentActivity();
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
            org.telegram.ui.cq0 cq0Var = new org.telegram.ui.cq0(2, false, false, null);
            cq0Var.f38440x = false;
            cq0Var.V = new aa1(this);
            r2Var.presentFragment(cq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f27114b.startActivityForResult(intent, 11);
    }
}
