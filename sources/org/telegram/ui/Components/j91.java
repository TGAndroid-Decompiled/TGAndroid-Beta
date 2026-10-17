package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class j91 {
    public String f27473a;
    public final Activity f27474b;
    public final org.telegram.ui.ActionBar.n2 f27475c;
    public final i91 d;
    public File e;

    public j91(Activity activity, WallpapersListActivity wallpapersListActivity, i91 i91Var) {
        this.f27474b = activity;
        this.f27475c = wallpapersListActivity;
        this.d = i91Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j91.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27475c;
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
            org.telegram.ui.tp0 tp0Var = new org.telegram.ui.tp0(2, false, false, null);
            tp0Var.f41806x = false;
            tp0Var.V = new h91(this);
            n2Var.presentFragment(tp0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f27474b.startActivityForResult(intent, 11);
    }
}
