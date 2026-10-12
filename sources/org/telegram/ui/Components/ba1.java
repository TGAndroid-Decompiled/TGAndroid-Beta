package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class ba1 {
    public String f24591a;
    public final Activity f24592b;
    public final org.telegram.ui.ActionBar.m2 f24593c;
    public final aa1 d;
    public File f24594e;

    public ba1(Activity activity, WallpapersListActivity wallpapersListActivity, aa1 aa1Var) {
        this.f24592b = activity;
        this.f24593c = wallpapersListActivity;
        this.d = aa1Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ba1.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f24593c;
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
            org.telegram.ui.mq0 mq0Var = new org.telegram.ui.mq0(2, false, false, null);
            mq0Var.f40119x = false;
            mq0Var.V = new z91(this);
            m2Var.presentFragment(mq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f24592b.startActivityForResult(intent, 11);
    }
}
