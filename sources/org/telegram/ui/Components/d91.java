package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class d91 {
    public String f23537a;
    public final Activity f23538b;
    public final org.telegram.ui.ActionBar.m2 f23539c;
    public final c91 d;
    public File e;

    public d91(Activity activity, WallpapersListActivity wallpapersListActivity, c91 c91Var) {
        this.f23538b = activity;
        this.f23539c = wallpapersListActivity;
        this.d = c91Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d91.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f23539c;
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
            cq0Var.f32763x = false;
            cq0Var.V = new b91(this);
            m2Var.presentFragment(cq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f23538b.startActivityForResult(intent, 11);
    }
}
