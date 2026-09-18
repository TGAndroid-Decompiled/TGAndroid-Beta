package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class q81 {
    public String f27243a;
    public final Activity f27244b;
    public final org.telegram.ui.ActionBar.o2 f27245c;
    public final p81 d;
    public File e;

    public q81(Activity activity, WallpapersListActivity wallpapersListActivity, p81 p81Var) {
        this.f27244b = activity;
        this.f27245c = wallpapersListActivity;
        this.d = p81Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q81.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f27245c;
        if (o2Var != null) {
            Activity parentActivity = o2Var.getParentActivity();
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
            org.telegram.ui.lq0 lq0Var = new org.telegram.ui.lq0(2, false, false, null);
            lq0Var.f35613x = false;
            lq0Var.V = new o81(this);
            o2Var.presentFragment(lq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f27244b.startActivityForResult(intent, 11);
    }
}
