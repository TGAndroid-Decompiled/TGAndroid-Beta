package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class ba1 {
    public String f26803a;
    public final Activity f26804b;
    public final org.telegram.ui.ActionBar.r2 f26805c;
    public final aa1 d;
    public File e;

    public ba1(Activity activity, WallpapersListActivity wallpapersListActivity, aa1 aa1Var) {
        this.f26804b = activity;
        this.f26805c = wallpapersListActivity;
        this.d = aa1Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ba1.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f26805c;
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
            org.telegram.ui.aq0 aq0Var = new org.telegram.ui.aq0(2, false, false, null);
            aq0Var.f37880x = false;
            aq0Var.V = new z91(this);
            r2Var.presentFragment(aq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f26804b.startActivityForResult(intent, 11);
    }
}
