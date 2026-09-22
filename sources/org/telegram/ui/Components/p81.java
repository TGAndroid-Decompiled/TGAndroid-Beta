package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class p81 {
    public String f26970a;
    public final Activity f26971b;
    public final org.telegram.ui.ActionBar.n2 f26972c;
    public final o81 d;
    public File e;

    public p81(Activity activity, WallpapersListActivity wallpapersListActivity, o81 o81Var) {
        this.f26971b = activity;
        this.f26972c = wallpapersListActivity;
        this.d = o81Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p81.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f26972c;
        if (n2Var != null) {
            Activity parentActivity = n2Var.getParentActivity();
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
            org.telegram.ui.jq0 jq0Var = new org.telegram.ui.jq0(2, false, false, null);
            jq0Var.f34972x = false;
            jq0Var.V = new n81(this);
            n2Var.presentFragment(jq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f26971b.startActivityForResult(intent, 11);
    }
}
