package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class w91 {
    public String f32657a;
    public final Activity f32658b;
    public final org.telegram.ui.ActionBar.m2 f32659c;
    public final v91 d;
    public File f32660e;

    public w91(Activity activity, WallpapersListActivity wallpapersListActivity, v91 v91Var) {
        this.f32658b = activity;
        this.f32659c = wallpapersListActivity;
        this.d = v91Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w91.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f32659c;
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
            org.telegram.ui.jq0 jq0Var = new org.telegram.ui.jq0(2, false, false, null);
            jq0Var.f39142x = false;
            jq0Var.V = new u91(this);
            m2Var.presentFragment(jq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f32658b.startActivityForResult(intent, 11);
    }
}
