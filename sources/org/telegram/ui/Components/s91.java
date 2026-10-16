package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class s91 {
    public String f28774a;
    public final Activity f28775b;
    public final org.telegram.ui.ActionBar.m2 f28776c;
    public final r91 d;
    public File e;

    public s91(Activity activity, WallpapersListActivity wallpapersListActivity, r91 r91Var) {
        this.f28775b = activity;
        this.f28776c = wallpapersListActivity;
        this.d = r91Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s91.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f28776c;
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
            org.telegram.ui.oq0 oq0Var = new org.telegram.ui.oq0(2, false, false, null);
            oq0Var.f38736x = false;
            oq0Var.V = new q91(this);
            m2Var.presentFragment(oq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f28775b.startActivityForResult(intent, 11);
    }
}
