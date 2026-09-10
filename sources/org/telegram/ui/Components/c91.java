package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class c91 {
    public String f22055a;
    public final Activity f22056b;
    public final org.telegram.ui.ActionBar.p2 f22057c;
    public final b91 d;
    public File e;

    public c91(Activity activity, WallpapersListActivity wallpapersListActivity, b91 b91Var) {
        this.f22056b = activity;
        this.f22057c = wallpapersListActivity;
        this.d = b91Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c91.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f22057c;
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
            org.telegram.ui.kq0 kq0Var = new org.telegram.ui.kq0(2, false, false, null);
            kq0Var.f34446x = false;
            kq0Var.V = new a91(this);
            p2Var.presentFragment(kq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f22056b.startActivityForResult(intent, 11);
    }
}
