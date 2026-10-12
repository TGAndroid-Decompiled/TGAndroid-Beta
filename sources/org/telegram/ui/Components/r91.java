package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class r91 {
    public String f28778a;
    public final Activity f28779b;
    public final org.telegram.ui.ActionBar.m2 f28780c;
    public final q91 d;
    public File e;

    public r91(Activity activity, WallpapersListActivity wallpapersListActivity, q91 q91Var) {
        this.f28779b = activity;
        this.f28780c = wallpapersListActivity;
        this.d = q91Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r91.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f28780c;
        if (m2Var != null) {
            Activity parentActivity = m2Var.getParentActivity();
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
            org.telegram.ui.qq0 qq0Var = new org.telegram.ui.qq0(2, false, false, null);
            qq0Var.f39524x = false;
            qq0Var.V = new p91(this);
            m2Var.presentFragment(qq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f28779b.startActivityForResult(intent, 11);
    }
}
