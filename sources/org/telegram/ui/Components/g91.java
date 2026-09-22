package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class g91 {
    public String f24479a;
    public final Activity f24480b;
    public final org.telegram.ui.ActionBar.n2 f24481c;
    public final f91 d;
    public File e;

    public g91(Activity activity, WallpapersListActivity wallpapersListActivity, f91 f91Var) {
        this.f24480b = activity;
        this.f24481c = wallpapersListActivity;
        this.d = f91Var;
    }

    public final void a(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g91.a(int, int, android.content.Intent):void");
    }

    public final void b() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f24481c;
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
            org.telegram.ui.lq0 lq0Var = new org.telegram.ui.lq0(2, false, false, null);
            lq0Var.f35536x = false;
            lq0Var.V = new e91(this);
            n2Var.presentFragment(lq0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.f24480b.startActivityForResult(intent, 11);
    }
}
